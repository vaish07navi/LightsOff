#include <opencv2/objdetect/objdetect.hpp>
#include <opencv2/highgui/highgui.hpp>
#include <opencv2/imgproc.hpp>
#include <opencv2/videoio.hpp>

#include <iostream>
#include <unistd.h>
#include <string>
#include <time.h>

#include <fstream>

using namespace cv;
using namespace std;


String face_cascade_name = "/usr/local/share/OpenCV/haarcascades/haarcascade_frontalface_default.xml";
CascadeClassifier face_cascade;
String window_name = "face detection ";

long int TIME_DELAY = 100000;
int MIN_COUNT = (float)(1000000.0/TIME_DELAY)*3;
int before, after;


void Display( Rect , Mat& , vector<Rect> );

int main()
{

	
	

	vector<Rect> faces;
	Mat frame_gray;

	int Counter = 0;

	int pid=getpid();
	string command = " echo \'"+to_string( (long long)pid )+"\' > pid";

	system( command.c_str() );
	cout << pid;

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

	
	while(1)
	{
		stream >> cameraframe;

		cvtColor(cameraframe,frame_gray,COLOR_BGR2GRAY);
		//equalizeHist(frame_gray,frame_gray);

		face_cascade.detectMultiScale( frame_gray, faces, 1.05, 10, 0|CV_HAAR_SCALE_IMAGE, 
			Size( (int)( 80 ),80 ) );

		if( faces.size() == 0 )
		{
			if( ++Counter > MIN_COUNT && IS_MONITER_ON==true )
			{			
				//cout << "\n Off : " << Counter << " : " << TIME_DELAY ;
				system("xset dpms force off");
				//cout << "\n monitor off : " << time( NULL )-before;

				system( "python '/media/sk/New Volume/PowerSnap/backend/pauseProcess.py'" );

				IS_MONITER_ON = false;
			}
		}
		else
		{
			Counter = 0;

			if(IS_MONITER_ON == false)
			{			
				system("xset dpms force on");
				//cout << "\n On : " <<Counter << "\n monitor on";
				IS_MONITER_ON=true;

				system( "python '/media/sk/New Volume/PowerSnap/backend/resumeProcess.py'" );

				
			}			
		}
		
		usleep( TIME_DELAY );
	}

return 0;
}


