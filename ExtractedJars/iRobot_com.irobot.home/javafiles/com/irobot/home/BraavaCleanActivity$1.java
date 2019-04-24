// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.bluetooth.BluetoothAdapter;
import android.content.DialogInterface;
import android.content.IntentFilter;
import com.irobot.home.util.BluetoothStateReceiver;

// Referenced classes of package com.irobot.home:
//			BraavaCleanActivity

class BraavaCleanActivity$1
	implements android.content.kListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		if(BraavaCleanActivity.a(a).enable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field BraavaCleanActivity a>
	//*   2    4:invokestatic    #25  <Method BluetoothAdapter BraavaCleanActivity.a(BraavaCleanActivity)>
	//*   3    7:invokevirtual   #31  <Method boolean BluetoothAdapter.enable()>
	//*   4   10:ifeq            56
		{
			BraavaCleanActivity.a(a, new BluetoothStateReceiver(((com.irobot.home.util..a) (a))));
	//    5   13:aload_0         
	//    6   14:getfield        #17  <Field BraavaCleanActivity a>
	//    7   17:new             #33  <Class BluetoothStateReceiver>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:getfield        #17  <Field BraavaCleanActivity a>
	//   11   25:invokespecial   #36  <Method void BluetoothStateReceiver(com.irobot.home.util.BluetoothStateReceiver$a)>
	//   12   28:invokestatic    #39  <Method BluetoothStateReceiver BraavaCleanActivity.a(BraavaCleanActivity, BluetoothStateReceiver)>
	//   13   31:pop             
			a.registerReceiver(((android.content.BroadcastReceiver) (BraavaCleanActivity.b(a))), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
	//   14   32:aload_0         
	//   15   33:getfield        #17  <Field BraavaCleanActivity a>
	//   16   36:aload_0         
	//   17   37:getfield        #17  <Field BraavaCleanActivity a>
	//   18   40:invokestatic    #43  <Method BluetoothStateReceiver BraavaCleanActivity.b(BraavaCleanActivity)>
	//   19   43:new             #45  <Class IntentFilter>
	//   20   46:dup             
	//   21   47:ldc1            #47  <String "android.bluetooth.adapter.action.STATE_CHANGED">
	//   22   49:invokespecial   #50  <Method void IntentFilter(String)>
	//   23   52:invokevirtual   #54  <Method android.content.Intent BraavaCleanActivity.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   24   55:pop             
		}
	//   25   56:return          
	}

	final BraavaCleanActivity a;

	BraavaCleanActivity$1(BraavaCleanActivity braavacleanactivity)
	{
		a = braavacleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BraavaCleanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
