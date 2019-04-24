// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.ViewConfiguration;

// Referenced classes of package android.support.v4.view:
//			ViewConfigurationCompat, ViewConfigurationCompatICS

static class ViewConfigurationCompat$IcsViewConfigurationVersionImpl extends nImpl
{

	public boolean hasPermanentMenuKey(ViewConfiguration viewconfiguration)
	{
		return ViewConfigurationCompatICS.hasPermanentMenuKey(viewconfiguration);
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method boolean ViewConfigurationCompatICS.hasPermanentMenuKey(ViewConfiguration)>
	//    2    4:ireturn         
	}

	ViewConfigurationCompat$IcsViewConfigurationVersionImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ViewConfigurationCompat$HoneycombViewConfigurationVersionImpl()>
	//    2    4:return          
	}
}
