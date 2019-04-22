// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.net.Uri;
import com.appboy.support.AppboyLogger;
import java.net.*;

public final class ei
{

	public ei()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static transient String a(Object aobj[])
	{
		int j = aobj.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_2        
		int i = 0;
	//    3    3:iconst_0        
	//    4    4:istore_1        
		long l = 1L;
	//    5    5:lconst_1        
	//    6    6:lstore          4
		for(; i < j; i++)
	//*   7    8:iload_1         
	//*   8    9:iload_2         
	//*   9   10:icmpge          48
		{
			int k = aobj[i].hashCode();
	//   10   13:aload_0         
	//   11   14:iload_1         
	//   12   15:aaload          
	//   13   16:invokevirtual   #25  <Method int Object.hashCode()>
	//   14   19:istore_3        
			long l1;
			if(k == 0)
	//*  15   20:iload_3         
	//*  16   21:ifne            30
				l1 = 1L;
	//   17   24:lconst_1        
	//   18   25:lstore          6
			else
	//*  19   27:goto            34
				l1 = k;
	//   20   30:iload_3         
	//   21   31:i2l             
	//   22   32:lstore          6
			l *= l1;
	//   23   34:lload           4
	//   24   36:lload           6
	//   25   38:lmul            
	//   26   39:lstore          4
		}

	//   27   41:iload_1         
	//   28   42:iconst_1        
	//   29   43:iadd            
	//   30   44:istore_1        
	//*  31   45:goto            8
		return Long.toHexString(l);
	//   32   48:lload           4
	//   33   50:invokestatic    #31  <Method String Long.toHexString(long)>
	//   34   53:areturn         
	}

	public static URI a(Uri uri)
	{
		URISyntaxException urisyntaxexception;
		Object obj;
		StringBuilder stringbuilder;
		try
		{
			obj = ((Object) (new URI(uri.toString())));
	//    0    0:new             #36  <Class URI>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #42  <Method String Uri.toString()>
	//    4    8:invokespecial   #45  <Method void URI(String)>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:areturn         
	//*   8   14:getstatic       #16  <Field String a>
	//*   9   17:astore_1        
	//*  10   18:new             #47  <Class StringBuilder>
	//*  11   21:dup             
	//*  12   22:invokespecial   #48  <Method void StringBuilder()>
	//*  13   25:astore_2        
	//*  14   26:aload_2         
	//*  15   27:ldc1            #50  <String "Could not create URI from uri [">
	//*  16   29:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*  17   32:pop             
	//*  18   33:aload_2         
	//*  19   34:aload_0         
	//*  20   35:invokevirtual   #42  <Method String Uri.toString()>
	//*  21   38:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*  22   41:pop             
	//*  23   42:aload_2         
	//*  24   43:ldc1            #56  <String "]">
	//*  25   45:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//*  26   48:pop             
	//*  27   49:aload_1         
	//*  28   50:aload_2         
	//*  29   51:invokevirtual   #57  <Method String StringBuilder.toString()>
	//*  30   54:invokestatic    #61  <Method int AppboyLogger.e(String, String)>
	//*  31   57:pop             
	//*  32   58:aconst_null     
	//*  33   59:areturn         
		// Misplaced declaration of an exception variable
		catch(URISyntaxException urisyntaxexception)
		{
			obj = ((Object) (a));
			stringbuilder = new StringBuilder();
			stringbuilder.append("Could not create URI from uri [");
			stringbuilder.append(uri.toString());
			stringbuilder.append("]");
			AppboyLogger.e(((String) (obj)), stringbuilder.toString());
			return null;
		}
		return ((URI) (obj));
	//*  34   60:astore_1        
	//*  35   61:goto            14
	}

	public static URL a(URI uri)
	{
		try
		{
			uri = ((URI) (new URL(uri.toString())));
	//    0    0:new             #66  <Class URL>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #67  <Method String URI.toString()>
	//    4    8:invokespecial   #68  <Method void URL(String)>
	//    5   11:astore_0        
		}
	//*   6   12:aload_0         
	//*   7   13:areturn         
		// Misplaced declaration of an exception variable
		catch(URI uri)
	//*   8   14:astore_0        
		{
			String s = a;
	//    9   15:getstatic       #16  <Field String a>
	//   10   18:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   11   19:new             #47  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #48  <Method void StringBuilder()>
	//   14   26:astore_2        
			stringbuilder.append("Unable to parse URI [");
	//   15   27:aload_2         
	//   16   28:ldc1            #70  <String "Unable to parse URI [">
	//   17   30:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			stringbuilder.append(((MalformedURLException) (uri)).getMessage());
	//   19   34:aload_2         
	//   20   35:aload_0         
	//   21   36:invokevirtual   #73  <Method String MalformedURLException.getMessage()>
	//   22   39:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   23   42:pop             
			stringbuilder.append("]");
	//   24   43:aload_2         
	//   25   44:ldc1            #56  <String "]">
	//   26   46:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   27   49:pop             
			AppboyLogger.e(s, stringbuilder.toString(), ((Throwable) (uri)));
	//   28   50:aload_1         
	//   29   51:aload_2         
	//   30   52:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   31   55:aload_0         
	//   32   56:invokestatic    #76  <Method int AppboyLogger.e(String, String, Throwable)>
	//   33   59:pop             
			return null;
	//   34   60:aconst_null     
	//   35   61:areturn         
		}
		return ((URL) (uri));
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ei);

	static 
	{
	//    0    0:ldc1            #2   <Class ei>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String a>
	//*   3    8:return          
	}
}
