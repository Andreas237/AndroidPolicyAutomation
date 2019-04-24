// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.handler.bodytemperature;

import android.os.Bundle;
import com.samsung.android.sdk.health.sensor.handler.PrivilegeSensorProfileHandlerListener;

// Referenced classes of package com.sec.android.service.health.sensor.handler.bodytemperature:
//			BodyTemperatureHandler

class BodyTemperatureHandler$1 extends Thread
{

	public void run()
	{
		Bundle abundle[];
		try
		{
			Thread.sleep(1000L);
	//    0    0:ldc2w           #23  <Long 1000L>
	//    1    3:invokestatic    #28  <Method void Thread.sleep(long)>
		}
	//*   2    6:iconst_1        
	//*   3    7:anewarray       Bundle[]
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:iconst_0        
	//*   7   13:new             #30  <Class Bundle>
	//*   8   16:dup             
	//*   9   17:invokespecial   #31  <Method void Bundle()>
	//*  10   20:aastore         
	//*  11   21:aload_1         
	//*  12   22:iconst_0        
	//*  13   23:aaload          
	//*  14   24:ldc1            #33  <String "temperature">
	//*  15   26:ldc1            #34  <Float 40F>
	//*  16   28:invokevirtual   #38  <Method void Bundle.putFloat(String, float)>
	//*  17   31:aload_1         
	//*  18   32:iconst_0        
	//*  19   33:aaload          
	//*  20   34:ldc1            #40  <String "time_stamp">
	//*  21   36:invokestatic    #46  <Method long System.currentTimeMillis()>
	//*  22   39:invokevirtual   #50  <Method void Bundle.putLong(String, long)>
	//*  23   42:aload_1         
	//*  24   43:iconst_0        
	//*  25   44:aaload          
	//*  26   45:ldc1            #52  <String "temperature_unit">
	//*  27   47:ldc1            #53  <Int 0x27101>
	//*  28   49:invokevirtual   #57  <Method void Bundle.putInt(String, int)>
	//*  29   52:aload_1         
	//*  30   53:iconst_0        
	//*  31   54:aaload          
	//*  32   55:ldc1            #59  <String "temperature_type">
	//*  33   57:ldc1            #60  <Int 0x11171>
	//*  34   59:invokevirtual   #57  <Method void Bundle.putInt(String, int)>
	//*  35   62:aload_0         
	//*  36   63:getfield        #15  <Field BodyTemperatureHandler this$0>
	//*  37   66:getfield        #64  <Field PrivilegeSensorProfileHandlerListener BodyTemperatureHandler.mProfileHandlerListener>
	//*  38   69:bipush          7
	//*  39   71:aload_1         
	//*  40   72:invokeinterface #70  <Method void PrivilegeSensorProfileHandlerListener.onDataReceived(int, Bundle[])>
	//*  41   77:return          
		catch(Exception exception)
	//*  42   78:astore_1        
		{
			exception.printStackTrace();
	//   43   79:aload_1         
	//   44   80:invokevirtual   #73  <Method void Exception.printStackTrace()>
		}
		abundle = new Bundle[1];
		abundle[0] = new Bundle();
		abundle[0].putFloat("temperature", 40F);
		abundle[0].putLong("time_stamp", System.currentTimeMillis());
		abundle[0].putInt("temperature_unit", 0x27101);
		abundle[0].putInt("temperature_type", 0x11171);
		mProfileHandlerListener.onDataReceived(7, abundle);
	//*  45   83:goto            6
	}

	final BodyTemperatureHandler this$0;

	BodyTemperatureHandler$1()
	{
		this$0 = BodyTemperatureHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field BodyTemperatureHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Thread()>
	//    5    9:return          
	}
}
