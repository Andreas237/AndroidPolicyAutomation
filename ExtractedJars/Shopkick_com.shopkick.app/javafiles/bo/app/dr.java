// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.net.Uri;
import com.appboy.support.AppboyLogger;
import java.net.*;

public final class dr
{

	public dr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static URI a(Uri uri)
	{
		URISyntaxException urisyntaxexception;
		Object obj;
		StringBuilder stringbuilder;
		try
		{
			obj = ((Object) (new URI(uri.toString())));
	//    0    0:new             #25  <Class URI>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #31  <Method String Uri.toString()>
	//    4    8:invokespecial   #34  <Method void URI(String)>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:areturn         
	//*   8   14:getstatic       #16  <Field String a>
	//*   9   17:astore_1        
	//*  10   18:new             #36  <Class StringBuilder>
	//*  11   21:dup             
	//*  12   22:invokespecial   #37  <Method void StringBuilder()>
	//*  13   25:astore_2        
	//*  14   26:aload_2         
	//*  15   27:ldc1            #39  <String "Could not create URI from uri [">
	//*  16   29:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//*  17   32:pop             
	//*  18   33:aload_2         
	//*  19   34:aload_0         
	//*  20   35:invokevirtual   #31  <Method String Uri.toString()>
	//*  21   38:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//*  22   41:pop             
	//*  23   42:aload_2         
	//*  24   43:ldc1            #45  <String "]">
	//*  25   45:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//*  26   48:pop             
	//*  27   49:aload_1         
	//*  28   50:aload_2         
	//*  29   51:invokevirtual   #46  <Method String StringBuilder.toString()>
	//*  30   54:invokestatic    #50  <Method int AppboyLogger.e(String, String)>
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
	//    0    0:new             #55  <Class URL>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #56  <Method String URI.toString()>
	//    4    8:invokespecial   #57  <Method void URL(String)>
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
	//   11   19:new             #36  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #37  <Method void StringBuilder()>
	//   14   26:astore_2        
			stringbuilder.append("Unable to parse URI [");
	//   15   27:aload_2         
	//   16   28:ldc1            #59  <String "Unable to parse URI [">
	//   17   30:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			stringbuilder.append(((MalformedURLException) (uri)).getMessage());
	//   19   34:aload_2         
	//   20   35:aload_0         
	//   21   36:invokevirtual   #62  <Method String MalformedURLException.getMessage()>
	//   22   39:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   23   42:pop             
			stringbuilder.append("]");
	//   24   43:aload_2         
	//   25   44:ldc1            #45  <String "]">
	//   26   46:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   27   49:pop             
			AppboyLogger.e(s, stringbuilder.toString());
	//   28   50:aload_1         
	//   29   51:aload_2         
	//   30   52:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   31   55:invokestatic    #50  <Method int AppboyLogger.e(String, String)>
	//   32   58:pop             
			return null;
	//   33   59:aconst_null     
	//   34   60:areturn         
		}
		return ((URL) (uri));
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/dr);

	static 
	{
	//    0    0:ldc1            #2   <Class dr>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String a>
	//*   3    8:return          
	}
}
