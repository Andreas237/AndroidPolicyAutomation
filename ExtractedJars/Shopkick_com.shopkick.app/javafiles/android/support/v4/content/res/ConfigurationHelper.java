// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.res;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class ConfigurationHelper
{

	private ConfigurationHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static int getDensityDpi(Resources resources)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          16
			return resources.getConfiguration().densityDpi;
	//    3    8:aload_0         
	//    4    9:invokevirtual   #24  <Method Configuration Resources.getConfiguration()>
	//    5   12:getfield        #29  <Field int Configuration.densityDpi>
	//    6   15:ireturn         
		else
			return resources.getDisplayMetrics().densityDpi;
	//    7   16:aload_0         
	//    8   17:invokevirtual   #33  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    9   20:getfield        #36  <Field int DisplayMetrics.densityDpi>
	//   10   23:ireturn         
	}
}
