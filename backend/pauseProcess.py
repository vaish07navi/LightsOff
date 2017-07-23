import psutil
import subprocess
import time
import sys

List = []

try:
    listed = sys.argv[1]
except IndexError:
    listed = []

get = lambda cmd: subprocess.check_output(cmd).decode("utf-8").strip()

def check_wtype(w_id):
    # check the type of window; only list "NORMAL" windows
    return "_NET_WM_WINDOW_TYPE_NORMAL" in get(["xprop", "-id", w_id])

def get_process(w_id):
    # get the name of the process, owning the window
    proc = get(["ps", "-p", w_id, "-o", "comm="])
    proc = "gnome-terminal" if "gnome-terminal" in proc else proc
    return ( proc, w_id )

def getList():

	file = open( "selectedProcess.dat" )

	for var in file :

		List.append( var )
		#print var

def pause( process, pid ):
	
	p = psutil.Process( int( pid ) )

	print List
	if process+"\n" in List :
		p.suspend()
		print ": ",pid


getList()

wlist = [l.split() for l in subprocess.check_output(["wmctrl", "-lp"])\
         .decode("utf-8").splitlines()]

validprocs = set([get_process(w[2]) for w in wlist if check_wtype(w[0]) == True])

if listed == "-list":

    try:

        for p in validprocs:

            pause( p[0], p[1] )
    
    except:

        print "error"

else:
    
    for var in list( validprocs ) :

		pause( var[0], var[1] )