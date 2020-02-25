package com.vvit.logger;

import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class App
{
public static void main(String args[])
{
	 Logger logger=Logger.getLogger(App.class.getName());
     logger.log(Level.INFO,"lets estimate the home construction cost");
     HouseLogger house=new HouseLogger();
            String material="",automated="";
            int area=0;
            try
            {
              File fileObj = new File("src/main/java/input1.txt");
              Scanner Reader = new Scanner(fileObj);
              material=Reader.nextLine();
              String s=Reader.nextLine();
              area=Integer.parseInt(s);
              automated=Reader.nextLine();
              Reader.close();
            }

            catch(Exception e)
            {
             System.out.println("No file");
            }
            try
            {
            FileWriter Writer = new FileWriter("src/main/java/result.txt");
              Writer.write("Construction cost of the house is:"+house.constructionPrice(material,area,automated));
              Writer.close();
            }
            catch(Exception e)
            {
             System.out.println("no file");
            }
}
}