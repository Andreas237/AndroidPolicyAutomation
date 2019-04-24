// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.content.*;
import android.support.v7.ci;

// Referenced classes of package com.ext.ui:
//			a

public class SystemLocaleObserver extends BroadcastReceiver
{

	public SystemLocaleObserver(a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void BroadcastReceiver()>
		a = a1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field a a>
		a1 = ((a) (new IntentFilter("android.intent.action.LOCALE_CHANGED")));
	//    5    9:new             #15  <Class IntentFilter>
	//    6   12:dup             
	//    7   13:ldc1            #17  <String "android.intent.action.LOCALE_CHANGED">
	//    8   15:invokespecial   #20  <Method void IntentFilter(String)>
	//    9   18:astore_1        
		a.getContext().registerReceiver(((BroadcastReceiver) (this)), ((IntentFilter) (a1)));
	//   10   19:aload_0         
	//   11   20:getfield        #13  <Field a a>
	//   12   23:invokevirtual   #26  <Method Context a.getContext()>
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #32  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   16   31:pop             
	//   17   32:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		ci.a("SystemLocaleObserver", "system LOCALE changed");
	//    0    0:ldc1            #37  <String "SystemLocaleObserver">
	//    1    2:ldc1            #39  <String "system LOCALE changed">
	//    2    4:invokestatic    #44  <Method void ci.a(String, String)>
		a.onContentChanged();
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field a a>
	//    5   11:invokevirtual   #47  <Method void a.onContentChanged()>
	//    6   14:return          
	}

	private a a;
}
