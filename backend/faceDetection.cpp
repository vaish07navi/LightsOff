
#include <opencv2/objdetect/objdetect.hpp>
#include <opencv2/highgui/highgui.hpp>
#include <opencv2/imgproc.hpp>
#include <opencv2/videoio.hpp>

#include <iostream>
#include <unistd.h>

using namespace cv;
using namespace std;


String face_cascade_name = "/usr/local/share/OpenCV/haarcascades/haarcascade_frontalface_default.xml";
CascadeClassifier face_cascade;
String window_name = "face detection ";

long int TIME_DELAY = 100000;


void Display( Rect , Mat& , vector<Rect> );

int main()
{
	vector<Rect> faces;
	Mat frame_gray;

	int Counter = 0;

	bool IS_MONITER_ON = true; 

	if(!face_cascade.load(face_cascade_name))
	{
		cout<<"Error loading";
		return (-1);
	}

	VideoCapture stream(0);
	if(!stream.isOpened())
	{
		cout<<"cannot open camera";
	}

	cv::Mat cameraframe;

	Rect roi_b;
	Rect roi_c;
	size_t ic=0;
	int ac=0;
	size_t ib=0;
	int ab=0; 

	while(1)
	{
		stream >> cameraframe;

		cvtColor(cameraframe,frame_gray,COLOR_BGR2GRAY);
		//equalizeHist(frame_gray,frame_gray);

		face_cascade.detectMultiScale( frame_gray, faces, 1.05, 10, 0|CV_HAAR_SCALE_IMAGE, 
			Size( (int)( 80 ),80 ) );		

		Display( roi_c, cameraframe, faces );

		usleep( TIME_DELAY );
	}

	return 0;
}

void Display( Rect roi_c, Mat& cameraframe, vector<Rect> faces )
{

	for( int ic=0;ic<faces.size();ic++ )
	{
		roi_c.x=faces[ic].x;
		roi_c.y=faces[ic].y;
		roi_c.width=faces[ic].width;
		roi_c.height=faces[ic].height;	

		rectangle( cameraframe, Point( roi_c.x,roi_c.y ), Point(roi_c.x+roi_c.width,roi_c.y+roi_c.height ), Scalar( 0, 55, 255 ), +1, 4 );	 
	}

	imshow("cam",cameraframe);

	if (waitKey(30) >= 0)
		exit(0);
}

