// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.*;

public final class en
{

	public static String c(String s, String s1)
	{
		String s2;
		String s3;
		Object obj;
		Object obj1;
		StringBuilder stringbuilder;
		stringbuilder = new StringBuilder();
	//    0    0:new             #12  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void StringBuilder()>
	//    3    7:astore          7
		obj1 = null;
	//    4    9:aconst_null     
	//    5   10:astore          6
		obj = null;
	//    6   12:aconst_null     
	//    7   13:astore          5
		s2 = ((String) (obj));
	//    8   15:aload           5
	//    9   17:astore_3        
		s3 = ((String) (obj1));
	//   10   18:aload           6
	//   11   20:astore          4
		s = ((String) (new File(s, s1)));
	//   12   22:new             #18  <Class File>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokespecial   #21  <Method void File(String, String)>
	//   17   31:astore_0        
		s2 = ((String) (obj));
	//   18   32:aload           5
	//   19   34:astore_3        
		s3 = ((String) (obj1));
	//   20   35:aload           6
	//   21   37:astore          4
		boolean flag = ((File) (s)).exists();
	//   22   39:aload_0         
	//   23   40:invokevirtual   #25  <Method boolean File.exists()>
	//   24   43:istore_2        
		if(!flag)
	//*  25   44:iload_2         
	//*  26   45:ifne            50
			return null;
	//   27   48:aconst_null     
	//   28   49:areturn         
		s2 = ((String) (obj));
	//   29   50:aload           5
	//   30   52:astore_3        
		s3 = ((String) (obj1));
	//   31   53:aload           6
	//   32   55:astore          4
		s = ((String) (new BufferedReader(((java.io.Reader) (new InputStreamReader(((java.io.InputStream) (new FileInputStream(((File) (s))))), "UTF-8"))))));
	//   33   57:new             #27  <Class BufferedReader>
	//   34   60:dup             
	//   35   61:new             #29  <Class InputStreamReader>
	//   36   64:dup             
	//   37   65:new             #31  <Class FileInputStream>
	//   38   68:dup             
	//   39   69:aload_0         
	//   40   70:invokespecial   #34  <Method void FileInputStream(File)>
	//   41   73:ldc1            #36  <String "UTF-8">
	//   42   75:invokespecial   #39  <Method void InputStreamReader(java.io.InputStream, String)>
	//   43   78:invokespecial   #42  <Method void BufferedReader(java.io.Reader)>
	//   44   81:astore_0        
_L2:
		s2 = s;
	//   45   82:aload_0         
	//   46   83:astore_3        
		s3 = s;
	//   47   84:aload_0         
	//   48   85:astore          4
		s1 = ((BufferedReader) (s)).readLine();
	//   49   87:aload_0         
	//   50   88:invokevirtual   #46  <Method String BufferedReader.readLine()>
	//   51   91:astore_1        
		if(s1 == null)
			break; /* Loop/switch isn't completed */
	//   52   92:aload_1         
	//   53   93:ifnull          111
		s2 = s;
	//   54   96:aload_0         
	//   55   97:astore_3        
		s3 = s;
	//   56   98:aload_0         
	//   57   99:astore          4
		stringbuilder.append(s1);
	//   58  101:aload           7
	//   59  103:aload_1         
	//   60  104:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   61  107:pop             
		if(true) goto _L2; else goto _L1
	//   62  108:goto            82
_L1:
		try
		{
			((BufferedReader) (s)).close();
	//   63  111:aload_0         
	//   64  112:invokevirtual   #53  <Method void BufferedReader.close()>
		}
	//*  65  115:goto            148
	//*  66  118:goto            148
	//*  67  121:aload           4
	//*  68  123:ifnull          148
	//*  69  126:aload           4
	//*  70  128:invokevirtual   #53  <Method void BufferedReader.close()>
	//*  71  131:goto            148
	//*  72  134:goto            148
	//*  73  137:astore_0        
	//*  74  138:aload_3         
	//*  75  139:ifnull          146
	//*  76  142:aload_3         
	//*  77  143:invokevirtual   #53  <Method void BufferedReader.close()>
	//*  78  146:aload_0         
	//*  79  147:athrow          
	//*  80  148:aload           7
	//*  81  150:invokevirtual   #56  <Method String StringBuilder.toString()>
	//*  82  153:areturn         
	//*  83  154:astore_0        
	//*  84  155:goto            121
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//   85  158:astore_0        
		  goto _L3
_L4:
		if(s3 != null)
			try
			{
				((BufferedReader) (s3)).close();
			}
	//*  86  159:goto            118
			// Misplaced declaration of an exception variable
			catch(String s) { }
	//   87  162:astore_0        
		  goto _L3
		s;
		if(s2 != null)
			try
			{
				((BufferedReader) (s2)).close();
			}
	//*  88  163:goto            134
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//   89  166:astore_1        
		throw s;
_L3:
		return stringbuilder.toString();
		s;
		  goto _L4
	//*  90  167:goto            146
	}
}
