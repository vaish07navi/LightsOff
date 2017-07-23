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

    JFrame frame1       = new JFrame("LIGHTSOFF");
    Container pane      = frame1.getContentPane();
    JButton home        = new JButton( "Home" );
    JButton settings    = new JButton( "Settings" );
    JButton SeeYourself = new JButton("SeeYourself");
    JButton aboutus     = new JButton("AboutUs");
    JButton RunApps     = new JButton("Run Apps");
    JButton Start       = new JButton("Start");
    JButton Stop        = new JButton("Stop");
    JButton Exit        = new JButton("Exit");
    JButton icon        = new JButton("LIGHTSOFF");
    JPanel timer        = new JPanel();
    JPanel descPanel    = new JPanel();
    JButton area        = new JButton("LIGHTSOFF");
    JLabel area1        = new JLabel();
    JButton areah       = new JButton();
    JPanel areav        = new JPanel();
    JButton areab       = new JButton();

    JButton Window  = new JButton("opacity");


    Color BG_COLOR          = new Color( 96, 150, 221);
    Color BTN_COLOR         = new Color( 116,168,238);
    Color BTN_HOVER_COLOR   = new Color( 96, 150, 221 );
    Color BORDER_COLOR      = new Color( 0, 0, 0);
    Color TEXT_COLOR        = new Color( 0, 0, 0 );

    int BORDER_SIZE     = 1;
    int ICON_SIZE       = 45;

    ArrayList<String> selectedList = new ArrayList<String>();  
    ArrayList<JCheckBox> chkBox = new ArrayList<JCheckBox>(); 

    /*frames()
    {        
        opacity.setFocusPainted(false);
        areab.setFocusPainted(false);
        icon.setFocusPainted(false);
        Exit.setFocusPainted(false);
        Stop.setFocusPainted(false);
        Start.setFocusPainted(false);
        RunApps.setFocusPainted(false);
        aboutus.setFocusPainted(false);
        SeeYourself. setFocusPainted(false);
        settings.setFocusPainted(false);
        home.setFocusPainted();
    }*/

    void makeframe() {
        frame1.setUndecorated(true);
        frame1.setVisible(true);
        frame1.setSize(920, 735);
        frame1.setLayout(null);
        frame1.getContentPane().setBackground( BG_COLOR );

    }

    void icon() {
        icon.setBounds(23, 14, 170, 45);
        icon.setName("LIGHTSOFF");
        icon.setBorder(new LineBorder(new Color(0, 77, 153, 0), 2));
        pane.add(icon);
        icon.setBackground( BG_COLOR );
        icon.setForeground( TEXT_COLOR );
        ImageIcon img = new ImageIcon("iconbulb.png");
        icon.setIcon( new ImageIcon( img.getImage().getScaledInstance( ICON_SIZE, ICON_SIZE, Image.SCALE_SMOOTH) ) );
        icon.setHorizontalTextPosition(SwingConstants.RIGHT);
        icon.setHorizontalAlignment(SwingConstants.LEFT);
    }

    void homebutton() {

        home.setBounds(4, 71, 273, 152);
        home.setBorder(new LineBorder( BORDER_COLOR, BORDER_SIZE ));
        home.setName("Home");
        pane.add(home);
        home.setHorizontalTextPosition(SwingConstants.RIGHT);
        home.setVerticalTextPosition(SwingConstants.BOTTOM);
        home.setForeground(TEXT_COLOR);
        home.setBackground(BTN_COLOR);
        home.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("homei.png");
        home.setIcon( new ImageIcon( img.getImage().getScaledInstance( ICON_SIZE, ICON_SIZE, Image.SCALE_SMOOTH) ) );
        home.setIconTextGap(75);
        home.setHorizontalAlignment(SwingConstants.CENTER);
        home.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                home.setBackground(BTN_HOVER_COLOR);
            }
            public void mouseExited(MouseEvent e) {
                home.setBackground(BTN_COLOR);
            }

            public void mouseClicked(MouseEvent e) {
                textareah();
            }
        });

    }

    void settingsbutton() {

        settings.setBounds(282, 71, 184, 153);
        settings.setBorder(new LineBorder( BORDER_COLOR, BORDER_SIZE ));
        settings.setName("Settings");
        pane.add(settings);
        settings.setVerticalTextPosition(SwingConstants.BOTTOM);
        settings.setHorizontalTextPosition(SwingConstants.RIGHT);
        settings.setForeground(TEXT_COLOR);
        settings.setBackground(BTN_COLOR);
        settings.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("settingi.png");
        settings.setIcon( new ImageIcon( img.getImage().getScaledInstance( ICON_SIZE, ICON_SIZE, Image.SCALE_SMOOTH) ) );
        settings.setHorizontalAlignment(SwingConstants.CENTER);
        settings.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                settings.setBackground(BTN_HOVER_COLOR);
            }
            public void mouseExited(MouseEvent e) {
                settings.setBackground(BTN_COLOR);
            }
            public void mouseClicked(MouseEvent e) {
                textareav();
            }
        });

        //pane.add(home);

    }




    void seeyourself() {

        SeeYourself.setBounds(4, 228, 172, 155);
        SeeYourself.setBorder(new LineBorder( BORDER_COLOR, BORDER_SIZE ));
        SeeYourself.setName("SeeYourself");
        pane.add(SeeYourself);
        SeeYourself.setVerticalTextPosition(SwingConstants.BOTTOM);
        SeeYourself.setHorizontalTextPosition(SwingConstants.CENTER);
        SeeYourself.setForeground(TEXT_COLOR);
        SeeYourself.setBackground(BTN_COLOR);
        SeeYourself.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("camerai.png");
        SeeYourself.setIcon( new ImageIcon( img.getImage().getScaledInstance( ICON_SIZE, ICON_SIZE, Image.SCALE_SMOOTH) ) );
        SeeYourself.setHorizontalAlignment(SwingConstants.CENTER);
        SeeYourself.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                settings.setBackground(BTN_HOVER_COLOR);
            }
            public void mouseExited(MouseEvent e) {
                settings.setBackground(BTN_COLOR);
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
        aboutus.setBorder(new LineBorder( BORDER_COLOR, BORDER_SIZE ));
        aboutus.setName("SeeYourself");
        pane.add(aboutus);
        aboutus.setVerticalTextPosition(SwingConstants.BOTTOM);
        aboutus.setHorizontalTextPosition(SwingConstants.RIGHT);
        aboutus.setForeground(TEXT_COLOR);
        aboutus.setBackground(BTN_COLOR);
        aboutus.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("aboutusi.png");
        aboutus.setIcon( new ImageIcon( img.getImage().getScaledInstance( ICON_SIZE, ICON_SIZE, Image.SCALE_SMOOTH) ) );
        aboutus.setHorizontalAlignment(SwingConstants.CENTER);
        aboutus.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                aboutus.setBackground(BTN_HOVER_COLOR);
            }
            public void mouseExited(MouseEvent e) {
                aboutus.setBackground(BTN_COLOR);
            }
            public void mouseClicked(MouseEvent e) {
                textareab();
            }
        });
        //pane.add(home);

    }

    void RunApps() {

        RunApps.setBounds(261, 387, 204, 146);
        RunApps.setBorder(new LineBorder( BORDER_COLOR, BORDER_SIZE ));
        RunApps.setName("Runapps");
        pane.add(RunApps);
        RunApps.setVerticalTextPosition(SwingConstants.BOTTOM);
        RunApps.setHorizontalTextPosition(SwingConstants.RIGHT);
        RunApps.setForeground(TEXT_COLOR);
        RunApps.setBackground(BTN_COLOR);
        RunApps.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("runappi.png");
        RunApps.setIcon( new ImageIcon( img.getImage().getScaledInstance( ICON_SIZE, ICON_SIZE, Image.SCALE_SMOOTH) ) );
        RunApps.setHorizontalAlignment(SwingConstants.CENTER);
        RunApps.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                RunApps.setBackground(BTN_HOVER_COLOR);
            }
            public void mouseExited(MouseEvent e) {
                RunApps.setBackground(BTN_COLOR);
            }
            public void mouseClicked(MouseEvent e) {
                textarear();
            }
        });
        //pane.add(home);

    }

    void starts() {

        Start.setBounds(262, 540, 106, 90);
        Start.setBorder(new LineBorder( BORDER_COLOR, BORDER_SIZE ));
        Start.setName("Start");
        pane.add(Start);
        Start.setVerticalTextPosition(SwingConstants.BOTTOM);
        Start.setHorizontalTextPosition(SwingConstants.CENTER);
        Start.setForeground(TEXT_COLOR);
        Start.setBackground(BTN_COLOR);
        Start.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("starti.png");
        Start.setIcon( new ImageIcon( img.getImage().getScaledInstance( ICON_SIZE, ICON_SIZE, Image.SCALE_SMOOTH) ) );
        Start.setHorizontalAlignment(SwingConstants.CENTER);
        Start.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Start.setBackground(BTN_HOVER_COLOR);
            }
            public void mouseExited(MouseEvent e) {
                Start.setBackground(BTN_COLOR);
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
        Exit.setBorder(new LineBorder( BORDER_COLOR, BORDER_SIZE ));
        Exit.setName("Exit");
        pane.add(Exit);
        SeeYourself.setVerticalTextPosition(SwingConstants.BOTTOM);
        //SeeYourself.setHorizontalTextPosition(SwingConstants.LEFT);
        Exit.setForeground(TEXT_COLOR);
        Exit.setBackground(BTN_COLOR);
        Exit.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("exiti.png");
        Exit.setIcon( new ImageIcon( img.getImage().getScaledInstance( ICON_SIZE, ICON_SIZE, Image.SCALE_SMOOTH) ) );
        Exit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Exit.setBackground(BTN_HOVER_COLOR);
            }
            public void mouseExited(MouseEvent e) {
                Exit.setBackground(BTN_COLOR);
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
        Stop.setBorder(new LineBorder( BORDER_COLOR, BORDER_SIZE ));
        Stop.setName("Stop");
        pane.add(Stop);
        Stop.setVerticalTextPosition(SwingConstants.BOTTOM);
        Stop.setHorizontalTextPosition(SwingConstants.CENTER);
        Stop.setForeground(TEXT_COLOR);
        Stop.setBackground(BTN_COLOR);
        Stop.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("stopi.png");
        Stop.setIcon( new ImageIcon( img.getImage().getScaledInstance( ICON_SIZE, ICON_SIZE, Image.SCALE_SMOOTH) ) );
        Stop.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Stop.setBackground(BTN_HOVER_COLOR);
            }
            public void mouseExited(MouseEvent e) {
                Stop.setBackground(BTN_COLOR);
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
        Window.setBorder(new LineBorder( BORDER_COLOR, BORDER_SIZE ));
        Window.setName("opacity");
        pane.add(Window);
        Window.setVerticalTextPosition(SwingConstants.BOTTOM);
        Window.setHorizontalTextPosition(SwingConstants.RIGHT);
        Window.setForeground(TEXT_COLOR);
        Window.setBackground(BTN_COLOR);
        Window.setFont(new Font("TimesNewRoman", 1, 12));
        ImageIcon img = new ImageIcon("opacityi.png");
        Window.setIcon( new ImageIcon( img.getImage().getScaledInstance( ICON_SIZE, ICON_SIZE, Image.SCALE_SMOOTH) ) );
        Window.setHorizontalAlignment(SwingConstants.CENTER);
        Window.addMouseListener(new MouseAdapter() 
        {
            public void mouseEntered(MouseEvent e) {
                Window.setBackground(BTN_HOVER_COLOR);
            }
            public void mouseExited(MouseEvent e) {
                Window.setBackground(BTN_COLOR);
            }
        
       /* Window.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                frame1.setState(Frame.ICONIFIED);
            }
        });
        //pane.add(home);*/
        public void mouseClicked(MouseEvent e) {
                
                frame1.setOpacity(0.8f);
            }
        });


    }

    void textarea()
    {
        descPanel.setBounds( 470, 71, 445, 656 );
        descPanel.setBackground(BTN_COLOR);
        descPanel.setForeground(TEXT_COLOR);
        descPanel.setBorder(new LineBorder( BORDER_COLOR, BORDER_SIZE ));
        descPanel.setLayout( null );

        descPanel.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                descPanel.setBackground(BTN_COLOR);
                //repaint();
            }
            public void mouseExited(MouseEvent e) {
                descPanel.setBackground(BTN_COLOR);
            }
        });

        ImageIcon i = new ImageIcon("bulb.png");

        //JLabel area = new JLabel();

        area1.setIcon(i);
        area1.setSize( 500, 500 );
        area1.setLocation( 135, 100 );

        /*descPanel.setHorizontalAlignment(SwingConstants.CENTER);
        //descPanel.setVerticalAlignment(SwingConstants.CENTER);
        descPanel.setHorizontalTextPosition(SwingConstants.CENTER);
        descPanel.setVerticalTextPosition(SwingConstants.BOTTOM);*/

        descPanel.add(area1);

        pane.add( descPanel );

        frame1.revalidate();
        frame1.repaint();
    }

    void textareav() {
        descPanel.removeAll();
        JLabel time = new JLabel("Timer   :");
        areav.setBounds(0,0,446,656);
        areav.setBackground(BTN_COLOR);
        areav.setForeground(TEXT_COLOR);

        areav.setBorder(new LineBorder( BORDER_COLOR, BORDER_SIZE ));
       // areav.setLayout(null);
        areav.add(time);
        JTextField timer = new JTextField ();
        timer.setLocation(135,20);
        Font bigFont = timer.getFont().deriveFont(Font.PLAIN, 30f);
        timer.setFont(bigFont);
        timer.setColumns(5);
        timer.setHorizontalAlignment(JTextField.CENTER);
        //timer.setVerticalAlignment(JTextField.CENTER);
       JButton done = new JButton( "Done" );
       
        areav.add(timer);
        areav.add( done );
        descPanel.add(areav);
        
       done.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae)
        {   int Value =0;
            String getValue = timer.getText();
            try {
                     Value = Integer.parseInt(getValue);
                    
                } 
            catch (NumberFormatException e)
             {
                     System.out.println("error:"+e);// Invalid double String.
            }
             try
                {
                
                  BufferedWriter file =new BufferedWriter( new FileWriter( new File( "timer.dat" ) ) );

                  file.write(Value);
                  System.out.println(Value);
                  file.close();
                }
                catch( Exception err )
                {
                    System.out.println( "err : "+err );
                }

   }
});

        frame1.revalidate();
        frame1.repaint();

    }
    void textareah() {
        descPanel.removeAll();

        areah.setBounds(0, 0, 445, 656);
        areah.setBackground(BTN_COLOR);
        areah.setForeground(TEXT_COLOR);
        
        areah.setBorder(new LineBorder( BORDER_COLOR, BORDER_SIZE ));
        ImageIcon i = new ImageIcon("abt.png");
        areah.setIcon(i);
        descPanel.add(areah);
       // pane.add(descPanel);
        frame1.revalidate();
        frame1.repaint();

    }

    void textareab()
    {
        descPanel.removeAll();

        areab.setBounds(0, 0, 445, 656);
        areab.setBackground(BTN_COLOR);
        areab.setForeground(TEXT_COLOR);
        areab.setBorder(new LineBorder( BORDER_COLOR, BORDER_SIZE ));
        
        ImageIcon i = new ImageIcon("HOME.png");
        areab.setIcon(i);

        descPanel.add(areab);
        
        frame1.revalidate();
        frame1.repaint();

        System.out.println( "Entered" );
    }

    void textarear()
    {
      try
      {
        final Runtime rt = Runtime.getRuntime();
        rt.exec( "rm ../backend/processList.dat" );
        rt.exec( "python ../backend/getProcess.py" );
        Thread.sleep(1000);

        //JLabel title = new JLabel( "Process" );
        //descPanel.add( title );

        descPanel.removeAll();

        descPanel.setBounds(470, 71, 445, 656);
        descPanel.setBackground(BTN_COLOR);
        descPanel.setForeground(TEXT_COLOR);
        
        pane.add(descPanel);
        descPanel.setBorder(new LineBorder( BORDER_COLOR, BORDER_SIZE ));
        descPanel.setLayout( new BoxLayout( descPanel, BoxLayout.PAGE_AXIS ) );

        descPanel.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                area.setBackground(BTN_COLOR);
                //repaint();

            }
            public void mouseExited(MouseEvent e) {
                area.setBackground(BTN_COLOR);
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
            chkBox.get(boxCount).setForeground( TEXT_COLOR );
            descPanel.add( chkBox.get( boxCount++ ) );
        }

        JButton done = new JButton( "Done" );
        descPanel.add( done );
        
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

        frame1.revalidate();
        frame1.repaint();

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