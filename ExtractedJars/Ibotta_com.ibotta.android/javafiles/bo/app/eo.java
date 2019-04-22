// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class eo
{

	public eo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static String a(String s, String s1)
	{
		String s2;
		String s3;
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		s3 = null;
	//    2    3:aconst_null     
	//    3    4:astore_3        
		s2 = s3;
	//    4    5:aload_3         
	//    5    6:astore_2        
		Process process = Runtime.getRuntime().exec(new String[] {
			"/system/bin/getprop", s
		});
	//    6    7:invokestatic    #29  <Method Runtime Runtime.getRuntime()>
	//    7   10:iconst_2        
	//    8   11:anewarray       String[]
	//    9   14:dup             
	//   10   15:iconst_0        
	//   11   16:ldc1            #33  <String "/system/bin/getprop">
	//   12   18:aastore         
	//   13   19:dup             
	//   14   20:iconst_1        
	//   15   21:aload_0         
	//   16   22:aastore         
	//   17   23:invokevirtual   #37  <Method Process Runtime.exec(String[])>
	//   18   26:astore          5
		s2 = s3;
	//   19   28:aload_3         
	//   20   29:astore_2        
		s = ((String) (new BufferedReader(((java.io.Reader) (new InputStreamReader(process.getInputStream(), "UTF-8"))))));
	//   21   30:new             #39  <Class BufferedReader>
	//   22   33:dup             
	//   23   34:new             #41  <Class InputStreamReader>
	//   24   37:dup             
	//   25   38:aload           5
	//   26   40:invokevirtual   #47  <Method java.io.InputStream Process.getInputStream()>
	//   27   43:ldc1            #49  <String "UTF-8">
	//   28   45:invokespecial   #52  <Method void InputStreamReader(java.io.InputStream, String)>
	//   29   48:invokespecial   #55  <Method void BufferedReader(java.io.Reader)>
	//   30   51:astore_0        
		s3 = ((BufferedReader) (s)).readLine();
	//   31   52:aload_0         
	//   32   53:invokevirtual   #59  <Method String BufferedReader.readLine()>
	//   33   56:astore_3        
		s1 = s3;
	//   34   57:aload_3         
	//   35   58:astore_1        
		process.destroy();
	//   36   59:aload           5
	//   37   61:invokevirtual   #62  <Method void Process.destroy()>
		s2 = s3;
	//   38   64:aload_3         
	//   39   65:astore_2        
		try
		{
			((BufferedReader) (s)).close();
	//   40   66:aload_0         
	//   41   67:invokevirtual   #65  <Method void BufferedReader.close()>
		}
	//*  42   70:aload_3         
	//*  43   71:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  44   72:astore_0        
		{
			AppboyLogger.e(a, "Caught exception while trying to close system properties reader.", ((Throwable) (s)));
	//   45   73:getstatic       #16  <Field String a>
	//   46   76:ldc1            #67  <String "Caught exception while trying to close system properties reader.">
	//   47   78:aload_0         
	//   48   79:invokestatic    #71  <Method int AppboyLogger.e(String, String, Throwable)>
	//   49   82:pop             
			return s2;
	//   50   83:aload_2         
	//   51   84:areturn         
		}
		return s3;
		s1;
	//   52   85:astore_1        
		s2 = s;
	//   53   86:aload_0         
	//   54   87:astore_2        
		s = s1;
	//   55   88:aload_1         
	//   56   89:astore_0        
		break MISSING_BLOCK_LABEL_129;
	//   57   90:goto            129
		Exception exception;
		exception;
	//   58   93:astore_3        
		break MISSING_BLOCK_LABEL_105;
	//   59   94:goto            105
		s;
	//   60   97:astore_0        
		break MISSING_BLOCK_LABEL_129;
	//   61   98:goto            129
		exception;
	//   62  101:astore_3        
		s = ((String) (obj));
	//   63  102:aload           4
	//   64  104:astore_0        
		s2 = s;
	//   65  105:aload_0         
	//   66  106:astore_2        
		AppboyLogger.e(a, "Caught exception while trying to read Braze logger tag from system properties.", ((Throwable) (exception)));
	//   67  107:getstatic       #16  <Field String a>
	//   68  110:ldc1            #73  <String "Caught exception while trying to read Braze logger tag from system properties.">
	//   69  112:aload_3         
	//   70  113:invokestatic    #71  <Method int AppboyLogger.e(String, String, Throwable)>
	//   71  116:pop             
		if(s == null)
			break MISSING_BLOCK_LABEL_127;
	//   72  117:aload_0         
	//   73  118:ifnull          127
		s2 = s1;
	//   74  121:aload_1         
	//   75  122:astore_2        
		((BufferedReader) (s)).close();
	//   76  123:aload_0         
	//   77  124:invokevirtual   #65  <Method void BufferedReader.close()>
		return s1;
	//   78  127:aload_1         
	//   79  128:areturn         
		if(s2 != null)
	//*  80  129:aload_2         
	//*  81  130:ifnull          151
			try
			{
				((BufferedReader) (s2)).close();
	//   82  133:aload_2         
	//   83  134:invokevirtual   #65  <Method void BufferedReader.close()>
			}
	//*  84  137:goto            151
			// Misplaced declaration of an exception variable
			catch(String s1)
	//*  85  140:astore_1        
			{
				AppboyLogger.e(a, "Caught exception while trying to close system properties reader.", ((Throwable) (s1)));
	//   86  141:getstatic       #16  <Field String a>
	//   87  144:ldc1            #67  <String "Caught exception while trying to close system properties reader.">
	//   88  146:aload_1         
	//   89  147:invokestatic    #71  <Method int AppboyLogger.e(String, String, Throwable)>
	//   90  150:pop             
			}
		throw s;
	//   91  151:aload_0         
	//   92  152:athrow          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/eo);

	static 
	{
	//    0    0:ldc1            #2   <Class eo>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String a>
	//*   3    8:return          
	}
}
