// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.pm.PackageManager;
import com.appboy.support.AppboyLogger;
import com.google.android.gms.common.GoogleApiAvailability;

public final class dp
{

	public dp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static boolean a(Context context)
	{
		int i;
		try
		{
			Class.forName("com.google.android.gms.common.GoogleApiAvailability");
	//    0    0:ldc1            #25  <String "com.google.android.gms.common.GoogleApiAvailability">
	//    1    2:invokestatic    #31  <Method Class Class.forName(String)>
	//    2    5:pop             
		}
	//*   3    6:invokestatic    #37  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #41  <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(Context)>
	//*   6   13:istore_1        
	//*   7   14:iload_1         
	//*   8   15:ifne            29
	//*   9   18:getstatic       #16  <Field String a>
	//*  10   21:ldc1            #43  <String "Google Play Services is available.">
	//*  11   23:invokestatic    #47  <Method int AppboyLogger.d(String, String)>
	//*  12   26:pop             
	//*  13   27:iconst_1        
	//*  14   28:ireturn         
	//*  15   29:getstatic       #16  <Field String a>
	//*  16   32:astore_0        
	//*  17   33:new             #49  <Class StringBuilder>
	//*  18   36:dup             
	//*  19   37:invokespecial   #50  <Method void StringBuilder()>
	//*  20   40:astore_2        
	//*  21   41:aload_2         
	//*  22   42:ldc1            #52  <String "Google Play Services is unavailable. Connection result: ">
	//*  23   44:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  24   47:pop             
	//*  25   48:aload_2         
	//*  26   49:iload_1         
	//*  27   50:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//*  28   53:pop             
	//*  29   54:aload_0         
	//*  30   55:aload_2         
	//*  31   56:invokevirtual   #63  <Method String StringBuilder.toString()>
	//*  32   59:invokestatic    #66  <Method int AppboyLogger.i(String, String)>
	//*  33   62:pop             
	//*  34   63:iconst_0        
	//*  35   64:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  36   65:astore_0        
		{
			AppboyLogger.i(a, "Google Play Services Availability API not found. Google Play Services not enabled.", ((Throwable) (context)));
	//   37   66:getstatic       #16  <Field String a>
	//   38   69:ldc1            #68  <String "Google Play Services Availability API not found. Google Play Services not enabled.">
	//   39   71:aload_0         
	//   40   72:invokestatic    #71  <Method int AppboyLogger.i(String, String, Throwable)>
	//   41   75:pop             
			return false;
	//   42   76:iconst_0        
	//   43   77:ireturn         
		}
		i = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
		if(i == 0)
		{
			AppboyLogger.d(a, "Google Play Services is available.");
			return true;
		} else
		{
			context = ((Context) (a));
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("Google Play Services is unavailable. Connection result: ");
			stringbuilder.append(i);
			AppboyLogger.i(((String) (context)), stringbuilder.toString());
			return false;
		}
	}

	public static boolean b(Context context)
	{
		try
		{
			context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc1            #82  <String "com.google.android.gsf">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #88  <Method android.content.pm.PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   10:pop             
		}
	//*   6   11:iconst_1        
	//*   7   12:ireturn         
	//*   8   13:getstatic       #16  <Field String a>
	//*   9   16:ldc1            #90  <String "Unexpected exception while checking for com.google.android.gsf">
	//*  10   18:invokestatic    #93  <Method int AppboyLogger.e(String, String)>
	//*  11   21:pop             
	//*  12   22:iconst_0        
	//*  13   23:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  14   24:astore_0        
		{
			return false;
	//   15   25:iconst_0        
	//   16   26:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			AppboyLogger.e(a, "Unexpected exception while checking for com.google.android.gsf");
			return false;
		}
		return true;
	//*  17   27:astore_0        
	//*  18   28:goto            13
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/dp);

	static 
	{
	//    0    0:ldc1            #2   <Class dp>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String a>
	//*   3    8:return          
	}
}
