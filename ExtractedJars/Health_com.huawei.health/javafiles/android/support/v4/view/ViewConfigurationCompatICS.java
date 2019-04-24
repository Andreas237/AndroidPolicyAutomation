// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.ViewConfiguration;

class ViewConfigurationCompatICS
{

	ViewConfigurationCompatICS()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static boolean hasPermanentMenuKey(ViewConfiguration viewconfiguration)
	{
		return viewconfiguration.hasPermanentMenuKey();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method boolean ViewConfiguration.hasPermanentMenuKey()>
	//    2    4:ireturn         
	}
}
