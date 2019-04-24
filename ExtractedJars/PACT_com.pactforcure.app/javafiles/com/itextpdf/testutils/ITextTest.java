// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.testutils;

import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import java.io.File;
import java.io.IOException;

public abstract class ITextTest
{

	public ITextTest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	protected void assertPdf(String s)
		throws Exception
	{
	//    0    0:return          
	}

	protected void comparePdf(String s, String s1)
		throws Exception
	{
	//    0    0:return          
	}

	protected void deleteDirectory(File file)
	{
		while(file == null || !file.exists()) 
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
	//    3    5:aload_1         
	//    4    6:invokevirtual   #41  <Method boolean File.exists()>
	//    5    9:ifeq            4
		File afile[] = file.listFiles();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #45  <Method File[] File.listFiles()>
	//    8   16:astore          4
		int j = afile.length;
	//    9   18:aload           4
	//   10   20:arraylength     
	//   11   21:istore_3        
		int i = 0;
	//   12   22:iconst_0        
	//   13   23:istore_2        
		while(i < j) 
	//*  14   24:iload_2         
	//*  15   25:iload_3         
	//*  16   26:icmpge          71
		{
			File file1 = afile[i];
	//   17   29:aload           4
	//   18   31:iload_2         
	//   19   32:aaload          
	//   20   33:astore          5
			if(file1.isDirectory())
	//*  21   35:aload           5
	//*  22   37:invokevirtual   #48  <Method boolean File.isDirectory()>
	//*  23   40:ifeq            62
			{
				deleteDirectory(file1);
	//   24   43:aload_0         
	//   25   44:aload           5
	//   26   46:invokevirtual   #50  <Method void deleteDirectory(File)>
				file1.delete();
	//   27   49:aload           5
	//   28   51:invokevirtual   #53  <Method boolean File.delete()>
	//   29   54:pop             
			} else
	//*  30   55:iload_2         
	//*  31   56:iconst_1        
	//*  32   57:iadd            
	//*  33   58:istore_2        
	//*  34   59:goto            24
			{
				file1.delete();
	//   35   62:aload           5
	//   36   64:invokevirtual   #53  <Method boolean File.delete()>
	//   37   67:pop             
			}
			i++;
		}
	//*  38   68:goto            55
		file.delete();
	//   39   71:aload_1         
	//   40   72:invokevirtual   #53  <Method boolean File.delete()>
	//   41   75:pop             
	//   42   76:return          
	}

	protected void deleteFiles(File file)
	{
		if(file != null && file.exists())
	//*   0    0:aload_1         
	//*   1    1:ifnull          40
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #41  <Method boolean File.exists()>
	//*   4    8:ifeq            40
		{
			file = ((File) (file.listFiles()));
	//    5   11:aload_1         
	//    6   12:invokevirtual   #45  <Method File[] File.listFiles()>
	//    7   15:astore_1        
			int j = file.length;
	//    8   16:aload_1         
	//    9   17:arraylength     
	//   10   18:istore_3        
			for(int i = 0; i < j; i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_2        
	//*  13   21:iload_2         
	//*  14   22:iload_3         
	//*  15   23:icmpge          40
				((File) (file[i])).delete();
	//   16   26:aload_1         
	//   17   27:iload_2         
	//   18   28:aaload          
	//   19   29:invokevirtual   #53  <Method boolean File.delete()>
	//   20   32:pop             

	//   21   33:iload_2         
	//   22   34:iconst_1        
	//   23   35:iadd            
	//   24   36:istore_2        
		}
	//*  25   37:goto            21
	//   26   40:return          
	}

	protected String getCmpPdf()
	{
		return "";
	//    0    0:ldc1            #57  <String "">
	//    1    2:areturn         
	}

	protected abstract String getOutPdf();

	protected abstract void makePdf(String s)
		throws Exception;

	public void runTest()
		throws Exception
	{
		LOGGER.info("Starting test.");
	//    0    0:getstatic       #22  <Field Logger LOGGER>
	//    1    3:ldc1            #62  <String "Starting test.">
	//    2    5:invokeinterface #67  <Method void Logger.info(String)>
		String s = getOutPdf();
	//    3   10:aload_0         
	//    4   11:invokevirtual   #69  <Method String getOutPdf()>
	//    5   14:astore_1        
		if(s == null || s.length() == 0)
	//*   6   15:aload_1         
	//*   7   16:ifnull          26
	//*   8   19:aload_1         
	//*   9   20:invokevirtual   #75  <Method int String.length()>
	//*  10   23:ifne            36
		{
			throw new IOException("outPdf cannot be empty!");
	//   11   26:new             #77  <Class IOException>
	//   12   29:dup             
	//   13   30:ldc1            #79  <String "outPdf cannot be empty!">
	//   14   32:invokespecial   #81  <Method void IOException(String)>
	//   15   35:athrow          
		} else
		{
			makePdf(s);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:invokevirtual   #83  <Method void makePdf(String)>
			assertPdf(s);
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:invokevirtual   #85  <Method void assertPdf(String)>
			comparePdf(s, getCmpPdf());
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:aload_0         
	//   25   49:invokevirtual   #87  <Method String getCmpPdf()>
	//   26   52:invokevirtual   #89  <Method void comparePdf(String, String)>
			LOGGER.info("Test complete.");
	//   27   55:getstatic       #22  <Field Logger LOGGER>
	//   28   58:ldc1            #91  <String "Test complete.">
	//   29   60:invokeinterface #67  <Method void Logger.info(String)>
			return;
	//   30   65:return          
		}
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(((Class) (com/itextpdf/testutils/ITextTest)).getName());

	static 
	{
	//    0    0:ldc1            #2   <Class ITextTest>
	//    1    2:invokevirtual   #14  <Method String Class.getName()>
	//    2    5:invokestatic    #20  <Method Logger LoggerFactory.getLogger(String)>
	//    3    8:putstatic       #22  <Field Logger LOGGER>
	//*   4   11:return          
	}
}
