// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.net.Uri;

class ActivityCompatApi22
{

	ActivityCompatApi22()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Uri getReferrer(Activity activity)
	{
		return activity.getReferrer();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method Uri Activity.getReferrer()>
	//    2    4:areturn         
	}
}
