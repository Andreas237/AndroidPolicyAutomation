// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.o.c;

import android.bluetooth.BluetoothGatt;

// Referenced classes of package com.irobot.home.o.c:
//			d

class d$5
	implements Runnable
{

	public void run()
	{
		if(a.c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field d a>
	//*   2    4:getfield        #24  <Field BluetoothGatt d.c>
	//*   3    7:ifnonnull       19
		{
			a.b = null;
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field d a>
	//    6   14:aconst_null     
	//    7   15:putfield        #28  <Field android.bluetooth.BluetoothDevice d.b>
			return;
	//    8   18:return          
		}
		synchronized(d.a(a))
	//*   9   19:aload_0         
	//*  10   20:getfield        #17  <Field d a>
	//*  11   23:invokestatic    #31  <Method Object d.a(d)>
	//*  12   26:astore_1        
	//*  13   27:aload_1         
	//*  14   28:monitorenter    
		{
			a.c.disconnect();
	//   15   29:aload_0         
	//   16   30:getfield        #17  <Field d a>
	//   17   33:getfield        #24  <Field BluetoothGatt d.c>
	//   18   36:invokevirtual   #36  <Method void BluetoothGatt.disconnect()>
		}
	//   19   39:aload_1         
	//   20   40:monitorexit     
		return;
	//   21   41:return          
		exception;
	//   22   42:astore_2        
		obj;
	//   23   43:aload_1         
		JVM INSTR monitorexit ;
	//   24   44:monitorexit     
		throw exception;
	//   25   45:aload_2         
	//   26   46:athrow          
	}

	final d a;

	d$5(d d1)
	{
		a = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field d a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
