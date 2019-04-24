// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.content.*;

public class BluetoothStateReceiver extends BroadcastReceiver
{
	public static interface a
	{

		public abstract void x();
	}


	public BluetoothStateReceiver(a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void BroadcastReceiver()>
		a = a1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field BluetoothStateReceiver$a a>
	//    5    9:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		if("android.bluetooth.adapter.action.STATE_CHANGED".equals(((Object) (intent.getAction()))) && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) == 12)
	//*   0    0:ldc1            #20  <String "android.bluetooth.adapter.action.STATE_CHANGED">
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #26  <Method String Intent.getAction()>
	//*   3    6:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*   4    9:ifeq            33
	//*   5   12:aload_2         
	//*   6   13:ldc1            #34  <String "android.bluetooth.adapter.extra.STATE">
	//*   7   15:iconst_m1       
	//*   8   16:invokevirtual   #38  <Method int Intent.getIntExtra(String, int)>
	//*   9   19:bipush          12
	//*  10   21:icmpne          33
			a.x();
	//   11   24:aload_0         
	//   12   25:getfield        #15  <Field BluetoothStateReceiver$a a>
	//   13   28:invokeinterface #41  <Method void BluetoothStateReceiver$a.x()>
	//   14   33:return          
	}

	a a;
}
