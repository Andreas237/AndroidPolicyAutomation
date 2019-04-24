// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util4Java
{

	public Util4Java()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static byte String2Byte(String s, byte byte0)
	{
		byte byte1;
		try
		{
			byte1 = Byte.parseByte(s, 16);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:invokestatic    #24  <Method byte Byte.parseByte(String, int)>
	//    3    6:istore_2        
		}
	//*   4    7:iload_2         
	//*   5    8:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6    9:astore_0        
		{
			return byte0;
	//    7   10:iload_1         
	//    8   11:ireturn         
		}
		return byte1;
	}

	public static int String2Int(String s, int i)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return i;
	//    2    4:iload_1         
	//    3    5:ireturn         
		int j;
		try
		{
			j = Integer.parseInt(s.trim());
	//    4    6:aload_0         
	//    5    7:invokevirtual   #32  <Method String String.trim()>
	//    6   10:invokestatic    #38  <Method int Integer.parseInt(String)>
	//    7   13:istore_2        
		}
	//*   8   14:iload_2         
	//*   9   15:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   16:astore_0        
		{
			return i;
	//   11   17:iload_1         
	//   12   18:ireturn         
		}
		return j;
	}

	public static String date2string(String s)
	{
		return date2string(((Date) (null)), s);
	//    0    0:aconst_null     
	//    1    1:aload_0         
	//    2    2:invokestatic    #43  <Method String date2string(Date, String)>
	//    3    5:areturn         
	}

	public static String date2string(Date date, String s)
	{
		Date date1 = date;
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(date == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       14
			date1 = new Date();
	//    4    6:new             #45  <Class Date>
	//    5    9:dup             
	//    6   10:invokespecial   #46  <Method void Date()>
	//    7   13:astore_2        
		date = ((Date) (s));
	//    8   14:aload_1         
	//    9   15:astore_0        
		if(s == null)
	//*  10   16:aload_1         
	//*  11   17:ifnonnull       23
			date = "yyyy-MM-dd HH:mm:ss";
	//   12   20:ldc1            #48  <String "yyyy-MM-dd HH:mm:ss">
	//   13   22:astore_0        
		return (new SimpleDateFormat(((String) (date)))).format(date1);
	//   14   23:new             #50  <Class SimpleDateFormat>
	//   15   26:dup             
	//   16   27:aload_0         
	//   17   28:invokespecial   #53  <Method void SimpleDateFormat(String)>
	//   18   31:aload_2         
	//   19   32:invokevirtual   #57  <Method String SimpleDateFormat.format(Date)>
	//   20   35:areturn         
	}

	public static int getBitNumber(byte byte0, int i, int j)
	{
		if(j > 8 || j < 0)
	//*   0    0:iload_2         
	//*   1    1:bipush          8
	//*   2    3:icmpgt          10
	//*   3    6:iload_2         
	//*   4    7:ifge            12
			return -1;
	//    5   10:iconst_m1       
	//    6   11:ireturn         
		i -= j;
	//    7   12:iload_1         
	//    8   13:iload_2         
	//    9   14:isub            
	//   10   15:istore_1        
		if(i < 0)
	//*  11   16:iload_1         
	//*  12   17:ifge            22
			return -1;
	//   13   20:iconst_m1       
	//   14   21:ireturn         
		else
			return model[j] & byte0 >> i;
	//   15   22:getstatic       #10  <Field int[] model>
	//   16   25:iload_2         
	//   17   26:iaload          
	//   18   27:iload_0         
	//   19   28:iload_1         
	//   20   29:ishr            
	//   21   30:iand            
	//   22   31:ireturn         
	}

	public static String getCurrentTime()
	{
		return date2string(((Date) (null)), "HH:mm:ss");
	//    0    0:aconst_null     
	//    1    1:ldc1            #62  <String "HH:mm:ss">
	//    2    3:invokestatic    #43  <Method String date2string(Date, String)>
	//    3    6:areturn         
	}

	public static String getExceptionInfo(Exception exception)
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #68  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
		PrintStream printstream = new PrintStream(((java.io.OutputStream) (bytearrayoutputstream)));
	//    4    8:new             #71  <Class PrintStream>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #74  <Method void PrintStream(java.io.OutputStream)>
	//    8   16:astore_2        
		exception.printStackTrace(printstream);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #78  <Method void Exception.printStackTrace(PrintStream)>
		exception = ((Exception) (bytearrayoutputstream.toString()));
	//   12   22:aload_1         
	//   13   23:invokevirtual   #81  <Method String ByteArrayOutputStream.toString()>
	//   14   26:astore_0        
		if(printstream != null)
	//*  15   27:aload_2         
	//*  16   28:ifnull          35
			try
			{
				printstream.close();
	//   17   31:aload_2         
	//   18   32:invokevirtual   #84  <Method void PrintStream.close()>
			}
	//*  19   35:aload_1         
	//*  20   36:ifnull          49
	//*  21   39:aload_1         
	//*  22   40:invokevirtual   #85  <Method void ByteArrayOutputStream.close()>
	//*  23   43:aload_0         
	//*  24   44:areturn         
			// Misplaced declaration of an exception variable
			catch(Exception exception)
	//*  25   45:astore_0        
			{
				return "";
	//   26   46:ldc1            #87  <String "">
	//   27   48:areturn         
			}
		if(bytearrayoutputstream == null)
			break MISSING_BLOCK_LABEL_49;
		bytearrayoutputstream.close();
		return ((String) (exception));
		return ((String) (exception));
	//   28   49:aload_0         
	//   29   50:areturn         
	}

	public static void main(String args[])
	{
		int i = String2Int(" 1 ", -2);
	//    0    0:ldc1            #91  <String " 1 ">
	//    1    2:bipush          -2
	//    2    4:invokestatic    #93  <Method int String2Int(String, int)>
	//    3    7:istore_1        
		System.out.println((new StringBuilder("result:")).append(i).toString());
	//    4    8:getstatic       #99  <Field PrintStream System.out>
	//    5   11:new             #101 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:ldc1            #103 <String "result:">
	//    8   17:invokespecial   #104 <Method void StringBuilder(String)>
	//    9   20:iload_1         
	//   10   21:invokevirtual   #108 <Method StringBuilder StringBuilder.append(int)>
	//   11   24:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   12   27:invokevirtual   #112 <Method void PrintStream.println(String)>
	//   13   30:return          
	}

	private static final int model[];

	static 
	{
		int ai[] = new int[8];
	//    0    0:bipush          8
	//    1    2:newarray        int[]
	//    2    4:astore_0        
		ai[1] = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:iconst_1        
	//    6    8:iastore         
		ai[2] = 3;
	//    7    9:aload_0         
	//    8   10:iconst_2        
	//    9   11:iconst_3        
	//   10   12:iastore         
		ai[3] = 7;
	//   11   13:aload_0         
	//   12   14:iconst_3        
	//   13   15:bipush          7
	//   14   17:iastore         
		ai[4] = 15;
	//   15   18:aload_0         
	//   16   19:iconst_4        
	//   17   20:bipush          15
	//   18   22:iastore         
		ai[5] = 31;
	//   19   23:aload_0         
	//   20   24:iconst_5        
	//   21   25:bipush          31
	//   22   27:iastore         
		ai[6] = 63;
	//   23   28:aload_0         
	//   24   29:bipush          6
	//   25   31:bipush          63
	//   26   33:iastore         
		ai[7] = 127;
	//   27   34:aload_0         
	//   28   35:bipush          7
	//   29   37:bipush          127
	//   30   39:iastore         
		model = ai;
	//   31   40:aload_0         
	//   32   41:putstatic       #10  <Field int[] model>
	//*  33   44:return          
	}
}
