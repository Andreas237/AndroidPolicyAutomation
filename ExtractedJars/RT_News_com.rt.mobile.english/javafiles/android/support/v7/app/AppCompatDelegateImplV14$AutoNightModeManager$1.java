// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.*;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV14

class AppCompatDelegateImplV14$AutoNightModeManager$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		dispatchTimeChanged();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field AppCompatDelegateImplV14$AutoNightModeManager this$1>
	//    2    4:invokevirtual   #26  <Method void AppCompatDelegateImplV14$AutoNightModeManager.dispatchTimeChanged()>
	//    3    7:return          
	}

	final AppCompatDelegateImplV14.AutoNightModeManager this$1;

	AppCompatDelegateImplV14$AutoNightModeManager$1()
	{
		this$1 = AppCompatDelegateImplV14.AutoNightModeManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AppCompatDelegateImplV14$AutoNightModeManager this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
