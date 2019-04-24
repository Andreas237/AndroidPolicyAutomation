// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.bluetooth.BluetoothAdapter;
import android.content.DialogInterface;
import android.content.IntentFilter;
import com.irobot.home.util.BluetoothStateReceiver;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			PickABraavaActivity

class PickABraavaActivity$1
	implements android.content.kListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		if(!PickABraavaActivity.a(a).enable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field PickABraavaActivity a>
	//*   2    4:invokestatic    #25  <Method BluetoothAdapter PickABraavaActivity.a(PickABraavaActivity)>
	//*   3    7:invokevirtual   #31  <Method boolean BluetoothAdapter.enable()>
	//*   4   10:ifne            28
		{
			o.e("PickABraava", "Could not enable Bluetooth!");
	//    5   13:ldc1            #33  <String "PickABraava">
	//    6   15:ldc1            #35  <String "Could not enable Bluetooth!">
	//    7   17:invokestatic    #41  <Method void o.e(String, String)>
			a.c();
	//    8   20:aload_0         
	//    9   21:getfield        #17  <Field PickABraavaActivity a>
	//   10   24:invokevirtual   #44  <Method void PickABraavaActivity.c()>
			return;
	//   11   27:return          
		} else
		{
			PickABraavaActivity.a(a, new BluetoothStateReceiver(((com.irobot.home.util..a) (a))));
	//   12   28:aload_0         
	//   13   29:getfield        #17  <Field PickABraavaActivity a>
	//   14   32:new             #46  <Class BluetoothStateReceiver>
	//   15   35:dup             
	//   16   36:aload_0         
	//   17   37:getfield        #17  <Field PickABraavaActivity a>
	//   18   40:invokespecial   #49  <Method void BluetoothStateReceiver(com.irobot.home.util.BluetoothStateReceiver$a)>
	//   19   43:invokestatic    #52  <Method BluetoothStateReceiver PickABraavaActivity.a(PickABraavaActivity, BluetoothStateReceiver)>
	//   20   46:pop             
			a.registerReceiver(((android.content.BroadcastReceiver) (PickABraavaActivity.b(a))), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
	//   21   47:aload_0         
	//   22   48:getfield        #17  <Field PickABraavaActivity a>
	//   23   51:aload_0         
	//   24   52:getfield        #17  <Field PickABraavaActivity a>
	//   25   55:invokestatic    #55  <Method BluetoothStateReceiver PickABraavaActivity.b(PickABraavaActivity)>
	//   26   58:new             #57  <Class IntentFilter>
	//   27   61:dup             
	//   28   62:ldc1            #59  <String "android.bluetooth.adapter.action.STATE_CHANGED">
	//   29   64:invokespecial   #62  <Method void IntentFilter(String)>
	//   30   67:invokevirtual   #66  <Method android.content.Intent PickABraavaActivity.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   31   70:pop             
			return;
	//   32   71:return          
		}
	}

	final PickABraavaActivity a;

	PickABraavaActivity$1(PickABraavaActivity pickabraavaactivity)
	{
		a = pickabraavaactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field PickABraavaActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
