// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.a;

import android.bluetooth.BluetoothGatt;
import android.util.Log;
import java.util.TimerTask;

// Referenced classes of package com.irobot.a:
//			g

class g$22 extends TimerTask
{

	public void run()
	{
		if(a.c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field g a>
	//*   2    4:getfield        #23  <Field BluetoothGatt g.c>
	//*   3    7:ifnull          29
		{
			a.c.readCharacteristic(a.v);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field g a>
	//    6   14:getfield        #23  <Field BluetoothGatt g.c>
	//    7   17:aload_0         
	//    8   18:getfield        #14  <Field g a>
	//    9   21:getfield        #27  <Field android.bluetooth.BluetoothGattCharacteristic g.v>
	//   10   24:invokevirtual   #33  <Method boolean BluetoothGatt.readCharacteristic(android.bluetooth.BluetoothGattCharacteristic)>
	//   11   27:pop             
			return;
	//   12   28:return          
		} else
		{
			Log.e("AltadenaLib", "updateStatus called on disconnected robot");
	//   13   29:ldc1            #35  <String "AltadenaLib">
	//   14   31:ldc1            #37  <String "updateStatus called on disconnected robot">
	//   15   33:invokestatic    #43  <Method int Log.e(String, String)>
	//   16   36:pop             
			a.a.p(a, ((d) (null)));
	//   17   37:aload_0         
	//   18   38:getfield        #14  <Field g a>
	//   19   41:getfield        #46  <Field g$f g.a>
	//   20   44:aload_0         
	//   21   45:getfield        #14  <Field g a>
	//   22   48:aconst_null     
	//   23   49:invokeinterface #52  <Method void g$f.p(g, d)>
			return;
	//   24   54:return          
		}
	}

	final g a;

	g$22(g g1)
	{
		a = g1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field g a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void TimerTask()>
	//    5    9:return          
	}
}
