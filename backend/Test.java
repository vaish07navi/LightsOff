public class Test{
	public static void main(String args[])
	{
		try{
		final Runtime rt = Runtime.getRuntime();
        rt.exec("/media/sk/New Volume/PowerSnap/ver_2/faceDetection");
		//system("/media/sk/WorkSpace/MOUNIKA/PROJECT_LIGHTSOFF/Facedetection/a.out");
    }catch(Exception e)
    {
    	System.out.println("error @Test:main(): "+e);
    }
	}
}