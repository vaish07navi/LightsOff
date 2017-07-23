
#include <iostream>
#include <unistd.h>
#include <stdio.h>

using namespace std;

int main( int argc, char* argv[] )
{
	system( "kill `ps ax | grep '../backend/MonitorONOff &!' | awk {'print $1'}`" );

	return 0;
}