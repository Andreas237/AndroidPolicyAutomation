// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.a;

import android.bluetooth.BluetoothGatt;

// Referenced classes of package com.irobot.a:
//			g

class g$9
	implements Runnable
{

	public void run()
	{
		a.c.disconnect();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field g a>
	//    2    4:getfield        #25  <Field BluetoothGatt g.c>
	//    3    7:invokevirtual   #30  <Method void BluetoothGatt.disconnect()>
	//    4   10:return          
	}

	final g a;

	g$9(g g1)
	{
		a = g1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field g a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
