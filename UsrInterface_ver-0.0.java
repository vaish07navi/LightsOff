/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import java.text.*;
import java.io.*;
import java.util.*;

class frames {

    JFrame frame1 = new JFrame("LIGHTSOFF");
    Container pane = frame1.getContentPane();
    JButton home = new JButton("Home");
    JButton settings = new JButton("Settings");
    JButton SeeYourself = new JButton("SeeYourself");
    JButton aboutus = new JButton("AboutUs");
    JButton RunApps = new JButton("Run Apps");
    JButton Start = new JButton("Start");
    JButton Stop = new JButton("Stop");
    JButton Exit = new JButton("Exit");
    JButton icon = new JButton("LIGHTSOFF");
    JPanel timer = new JPanel();
    JButton area = new JButton("LIGHTSOFF");
    JButton areah = new JButton();
    JPanel areav = new JPanel();
    JButton areab = new JButton();
    JButton Window = new JButton("Minimize");

    Color BG_COLOR      = new Color( 255, 255, 255 );
    Color BTN_COLOR     = new Color( 255, 255, 255 );
    Color BORDER_COLOR  = new Color( 0, 0, 0 );
    Color TEXT_COLOR    = new Color( 255, 255, 255 );

    ArrayList<String> selectedList = new ArrayList<String>();  
    ArrayList<JCheckBox> chkBox = new ArrayList<JCheckBox>(); 

    void makeframe() {
        frame1.setUndecorated(true);
        frame1.setVisible(true);
        frame1.setSize(920, 735);
        frame1.setLayout(null);
        frame1.getContentPane().setBackground(new Color(0, 77, 153));
        frame1.setOpacity(0.7f);

    }

    void icon() {
        icon.setBounds(23, 14, 170, 45);
        icon.setName("LIGHTSOFF");
        icon.setBorder(new LineBorder(new Color(0, 77, 153), 2));
        pane.add(icon);
        icon.setBackground(new Color(0, 77, 153));
        icon.setForeground(Color.white);
        ImageIcon img = new ImageIcon("iconbulb.png");
        icon.setIcon(img);
        icon.setHorizontalTextPosition(SwingConstants.RIGHT);
        icon.setHorizontalAlignment(SwingConstants.LEFT);



    }




    void homebutton() {

        home.setBounds(4, 71, 273, 152);
        home.setBorder(new LineBorder(Color.black, 3));
        home.setName("Home");
        pane.add(home);
        home.setHorizontalTextPosition(SwingConstants.RIGHT);
        home.setVerticalTextPosition(SwingConstants.BOTTOM);
        home.setForeground(Color.white);
        home.setBackground(new Color(0, 0, 77));
        home.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("homei.png");
        home.setIcon(img);
        home.setIconTextGap(75);
        home.setHorizontalAlignment(SwingConstants.CENTER);
        home.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                home.setBackground(new Color(0, 0, 102));
            }
            public void mouseExited(MouseEvent e) {
                home.setBackground(new Color(0, 0, 77));
            }

            public void mouseClicked(MouseEvent e) {
                textareah();
            }
        });

    }

    void settingsbutton() {

        settings.setBounds(282, 71, 184, 153);
        settings.setBorder(new LineBorder(Color.black, 3));
        settings.setName("Settings");
        pane.add(settings);
        settings.setVerticalTextPosition(SwingConstants.BOTTOM);
        settings.setHorizontalTextPosition(SwingConstants.RIGHT);
        settings.setForeground(Color.white);
        settings.setBackground(new Color(0, 0, 77));
        settings.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("settingi.png");
        settings.setIcon(img);
        settings.setHorizontalAlignment(SwingConstants.CENTER);
        settings.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                settings.setBackground(new Color(0, 0, 102));
            }
            public void mouseExited(MouseEvent e) {
                settings.setBackground(new Color(0, 0, 77));
            }
            public void mouseClicked(MouseEvent e) {
                textareav();
            }
        });

        //pane.add(home);

    }




    void seeyourself() {

        SeeYourself.setBounds(4, 228, 172, 155);
        SeeYourself.setBorder(new LineBorder(Color.black, 3));
        SeeYourself.setName("SeeYourself");
        pane.add(SeeYourself);
        SeeYourself.setVerticalTextPosition(SwingConstants.BOTTOM);
        SeeYourself.setHorizontalTextPosition(SwingConstants.CENTER);
        SeeYourself.setForeground(Color.white);
        SeeYourself.setBackground(new Color(0, 0, 77));
        SeeYourself.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("camerai.png");
        SeeYourself.setIcon(img);
        SeeYourself.setHorizontalAlignment(SwingConstants.CENTER);
        SeeYourself.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                settings.setBackground(new Color(0, 0, 102));
            }
            public void mouseExited(MouseEvent e) {
                settings.setBackground(new Color(0, 0, 77));
            }
            public void mouseClicked(MouseEvent e) {
                try {
                    final Runtime rt = Runtime.getRuntime();
                    rt.exec("../backend/faceDetection");

                } catch (Exception e1) {
                    System.out.println("Error");
                }
            }
        });
        //pane.add(home);

    }

    void AboutUs() {

        aboutus.setBounds(4, 387, 251, 146);
        aboutus.setBorder(new LineBorder(Color.black, 3));
        aboutus.setName("SeeYourself");
        pane.add(aboutus);
        aboutus.setVerticalTextPosition(SwingConstants.BOTTOM);
        aboutus.setHorizontalTextPosition(SwingConstants.RIGHT);
        aboutus.setForeground(Color.white);
        aboutus.setBackground(new Color(0, 0, 77));
        aboutus.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("aboutusi.png");
        aboutus.setIcon(img);
        aboutus.setHorizontalAlignment(SwingConstants.CENTER);
        aboutus.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                aboutus.setBackground(new Color(0, 0, 102));
            }
            public void mouseExited(MouseEvent e) {
                aboutus.setBackground(new Color(0, 0, 77));
            }
            public void mouseClicked(MouseEvent e) {
                textareab();
            }
        });
        //pane.add(home);

    }

    void RunApps() {

        RunApps.setBounds(261, 387, 204, 146);
        RunApps.setBorder(new LineBorder(Color.black, 3));
        RunApps.setName("Runapps");
        pane.add(RunApps);
        RunApps.setVerticalTextPosition(SwingConstants.BOTTOM);
        RunApps.setHorizontalTextPosition(SwingConstants.RIGHT);
        RunApps.setForeground(Color.white);
        RunApps.setBackground(new Color(0, 0, 77));
        RunApps.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("runappi.png");
        RunApps.setIcon(img);
        RunApps.setHorizontalAlignment(SwingConstants.CENTER);
        RunApps.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                RunApps.setBackground(new Color(0, 0, 102));
            }
            public void mouseExited(MouseEvent e) {
                RunApps.setBackground(new Color(0, 0, 77));
            }
            public void mouseClicked(MouseEvent e) {
                textarear();
            }
        });
        //pane.add(home);

    }

    void starts() {

        Start.setBounds(262, 540, 106, 90);
        Start.setBorder(new LineBorder(Color.black, 3));
        Start.setName("Start");
        pane.add(Start);
        Start.setVerticalTextPosition(SwingConstants.BOTTOM);
        Start.setHorizontalTextPosition(SwingConstants.CENTER);
        Start.setForeground(Color.white);
        Start.setBackground(new Color(0, 0, 77));
        Start.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("starti.png");
        Start.setIcon(img);
        Start.setHorizontalAlignment(SwingConstants.CENTER);
        Start.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Start.setBackground(new Color(0, 0, 102));
            }
            public void mouseExited(MouseEvent e) {
                Start.setBackground(new Color(0, 0, 77));
            }

            public void mouseClicked(MouseEvent e) {
                try {
                    final Runtime rt = Runtime.getRuntime();
                    rt.exec("../backend/MonitorONOff &!");

                } catch (Exception e1) {
                    System.out.println("Error");
                }
            }
        });
        //pane.add(home);

    }

    void exits() {

        Exit.setBounds(262, 635, 205, 92);
        Exit.setBorder(new LineBorder(Color.black, 3));
        Exit.setName("Exit");
        pane.add(Exit);
        SeeYourself.setVerticalTextPosition(SwingConstants.BOTTOM);
        //SeeYourself.setHorizontalTextPosition(SwingConstants.LEFT);
        Exit.setForeground(Color.white);
        Exit.setBackground(new Color(0, 0, 77));
        Exit.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("exiti.png");
        Exit.setIcon(img);
        Exit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Exit.setBackground(new Color(0, 0, 102));
            }
            public void mouseExited(MouseEvent e) {
                Exit.setBackground(new Color(0, 0, 77));
            }
        });

        Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });
    }


    void stops() {

        Stop.setBounds(372, 539, 94, 90);
        Stop.setBorder(new LineBorder(Color.black, 3));
        Stop.setName("Stop");
        pane.add(Stop);
        Stop.setVerticalTextPosition(SwingConstants.BOTTOM);
        Stop.setHorizontalTextPosition(SwingConstants.CENTER);
        Stop.setForeground(Color.white);
        Stop.setBackground(new Color(0, 0, 77));
        Stop.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("stopi.png");
        Stop.setIcon(img);
        Stop.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Stop.setBackground(new Color(0, 0, 102));
            }
            public void mouseExited(MouseEvent e) {
                Stop.setBackground(new Color(0, 0, 77));
            }

            public void mouseClicked(MouseEvent e) {
                try {
                        final Runtime rt = Runtime.getRuntime();
                        rt.exec( "../backend/endProcess" );

                } catch (Exception e1) {
                    System.out.println("Error");
                }
            }
        });
        //pane.add(home);

    }

    void opacity() {

        Window.setBounds(182, 228, 284, 155);
        Window.setBorder(new LineBorder(Color.black, 3));
        Window.setName("SeeYourself");
        pane.add(Window);
        Window.setVerticalTextPosition(SwingConstants.BOTTOM);
        Window.setHorizontalTextPosition(SwingConstants.RIGHT);
        Window.setForeground(Color.white);
        Window.setBackground(new Color(0, 0, 77));
        Window.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("opacityi.png");
        Window.setIcon(img);
        Window.setHorizontalAlignment(SwingConstants.CENTER);
        Window.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Window.setBackground(new Color(0, 0, 102));
            }
            public void mouseExited(MouseEvent e) {
                Window.setBackground(new Color(0, 0, 77));
            }
        });
        Window.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                frame1.setState(Frame.ICONIFIED);
            }
        });
        //pane.add(home);

    }

    void textarea() {
        area.setBounds(470, 71, 445, 656);
        area.setBackground(new Color(0, 0, 77));
        area.setForeground(Color.white);
        pane.add(area);
        area.setBorder(new LineBorder(Color.black, 3));

        area.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                area.setBackground(new Color(0, 0, 77));
                //repaint();
            }
            public void mouseExited(MouseEvent e) {
                area.setBackground(new Color(0, 0, 77));
            }
        });
        ImageIcon i = new ImageIcon("bulb.png");
        area.setIcon(i);
        area.setHorizontalAlignment(SwingConstants.CENTER);
        area.setHorizontalTextPosition(SwingConstants.CENTER);
        area.setVerticalTextPosition(SwingConstants.BOTTOM);


    }

    void textareav() {
        areav.setBounds(470, 71, 445, 656);
        areav.setBackground(new Color(0, 0, 77));
        areav.setForeground(Color.white);
        pane.add(areav);
        areav.setBorder(new LineBorder(Color.black, 3));
        ImageIcon i = new ImageIcon("settingc.png");
        JLabel Icon = new JLabel();
        Icon.setIcon( i );
        areav.add( Icon );


    }
    void textareah() {
        areah.setBounds(470, 71, 445, 656);
        areah.setBackground(new Color(0, 0, 77));
        areah.setForeground(Color.white);
        pane.add(areah);
        areah.setBorder(new LineBorder(Color.black, 3));
        ImageIcon i = new ImageIcon("hcont.png");
        areah.setIcon(i);
    }

    void textareab()
    {
        areab.setBounds(470, 71, 445, 656);
        areab.setBackground(new Color(0, 0, 77));
        areab.setForeground(Color.white);
        pane.add(areab);
        areab.setBorder(new LineBorder(Color.black, 3));
        ImageIcon i = new ImageIcon("aboutc.png");
        areab.setIcon(i);
    }

    void textarear()
    {
      try
      {
        final Runtime rt = Runtime.getRuntime();
        rt.exec( "rm ../backend/processList.dat" );
        rt.exec( "python ../backend/getProcess.py" );
        Thread.sleep(1000);

        JPanel space = new JPanel();

        //JLabel title = new JLabel( "Process" );
        //space.add( title );

        space.setBounds(470, 71, 445, 656);
        space.setBackground(new Color(0, 0, 77));
        space.setForeground(Color.white);
        pane.remove(area);
        pane.add(space);
        space.setBorder(new LineBorder(Color.black, 3));
        space.setLayout( new BoxLayout( space, BoxLayout.PAGE_AXIS ) );

        space.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                area.setBackground(new Color(0, 0, 77));
                //repaint();

            }
            public void mouseExited(MouseEvent e) {
                area.setBackground(new Color(0, 0, 77));
                pane.add( area );
                frame1.revalidate();
            }
        });

        BufferedReader processFile = new BufferedReader( new FileReader( "processList.dat" ) );        
        String line ;

        int boxCount = 0;
        while( (line=processFile.readLine()) != null )
        {
            String processName = line.split(" ")[0], processId = line.split( " " )[1];

            chkBox.add( new JCheckBox( processName ) );
            chkBox.get(boxCount).setName( processName );
            chkBox.get(boxCount).setBackground( new Color( 0, 0, 0, 0 ) );
            chkBox.get(boxCount).setForeground( Color.white );
            space.add( chkBox.get( boxCount++ ) );
        }

        JButton done = new JButton( "Done" );
        space.add( done );
        
        done.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                try
                {
                
                  BufferedWriter file =new BufferedWriter( new FileWriter( new File( "selectedProcess.dat" ) ) );

                  for( int i=0; i<chkBox.size(); i++ )
                  {
                      if( chkBox.get(i).isSelected() )
                      {
                        selectedList.add( chkBox.get(i).getName() );
                        file.write( chkBox.get(i).getName()+"\n" );
                        System.out.println( chkBox.get(i).getName() );
                      }
                  }

                  file.close();
                }
                catch( Exception err )
                {
                    System.out.println( "err : "+err );
                }
            }
        });

    }
    catch( Exception err )
    {
        System.out.println( "error : "+err );
    }
  }

}


public class UsrInterface {


    public static void main(String[] args) {
        frames ob = new frames();
        ob.makeframe();
        ob.icon();
        ob.homebutton();
        ob.settingsbutton();
        //ob.iconbutton();
        ob.seeyourself();
        ob.AboutUs();
        ob.RunApps();
        ob.starts();
        ob.stops();
        ob.exits();
        ob.opacity();
        ob.textarea();

    }

}