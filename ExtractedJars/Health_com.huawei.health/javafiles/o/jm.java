// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.util.Log;

public final class jm
{

	protected static void b(String s)
	{
		if(s.equals("GPS_SATELLITE"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #17  <String "GPS_SATELLITE">
	//*   2    3:invokevirtual   #23  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            10
			return;
	//    4    9:return          
		else
			return;
	//    5   10:return          
	}

	protected static boolean e(Context context)
	{
		if(context != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
		{
			a = context.getPackageName();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #31  <Method String Context.getPackageName()>
	//    4    8:putstatic       #12  <Field String a>
			return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		} else
		{
			Log.d(a, "Error: No SD Card!");
	//    7   13:getstatic       #12  <Field String a>
	//    8   16:ldc1            #33  <String "Error: No SD Card!">
	//    9   18:invokestatic    #39  <Method int Log.d(String, String)>
	//   10   21:pop             
			return false;
	//   11   22:iconst_0        
	//   12   23:ireturn         
		}
	}

	private static String a = "";

	static 
	{
	//    0    0:ldc1            #10  <String "">
	//    1    2:putstatic       #12  <Field String a>
	//*   2    5:return          
	}
}
