// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.handler.hrm;

import android.os.Bundle;
import com.samsung.android.sdk.health.sensor.handler.PrivilegeSensorProfileHandlerListener;
import com.sec.android.service.health.util.LOG;

// Referenced classes of package com.sec.android.service.health.sensor.handler.hrm:
//			PulseOximeterHandler

private class PulseOximeterHandler$DummyDataThread extends Thread
{

	public void run()
	{
		try
		{
			do
			{
				do
				{
					LOG.d(PulseOximeterHandler.access$000(), "Generating dummy data");
	//    0    0:invokestatic    #24  <Method Class PulseOximeterHandler.access$000()>
	//    1    3:ldc1            #26  <String "Generating dummy data">
	//    2    5:invokestatic    #32  <Method void LOG.d(Class, String)>
					Thread.sleep(200L);
	//    3    8:ldc2w           #33  <Long 200L>
	//    4   11:invokestatic    #38  <Method void Thread.sleep(long)>
				} while(mProfileHandlerListener == null);
	//    5   14:aload_0         
	//    6   15:getfield        #13  <Field PulseOximeterHandler this$0>
	//    7   18:getfield        #42  <Field PrivilegeSensorProfileHandlerListener PulseOximeterHandler.mProfileHandlerListener>
	//    8   21:ifnull          0
				Bundle abundle[] = new Bundle[1];
	//    9   24:iconst_1        
	//   10   25:anewarray       Bundle[]
	//   11   28:astore_1        
				abundle[0] = new Bundle();
	//   12   29:aload_1         
	//   13   30:iconst_0        
	//   14   31:new             #44  <Class Bundle>
	//   15   34:dup             
	//   16   35:invokespecial   #45  <Method void Bundle()>
	//   17   38:aastore         
				abundle[0].putLong("time_stamp", System.currentTimeMillis());
	//   18   39:aload_1         
	//   19   40:iconst_0        
	//   20   41:aaload          
	//   21   42:ldc1            #47  <String "time_stamp">
	//   22   44:invokestatic    #53  <Method long System.currentTimeMillis()>
	//   23   47:invokevirtual   #57  <Method void Bundle.putLong(String, long)>
				abundle[0].putInt("heart_rate", PulseOximeterHandler.access$100(PulseOximeterHandler.this));
	//   24   50:aload_1         
	//   25   51:iconst_0        
	//   26   52:aaload          
	//   27   53:ldc1            #59  <String "heart_rate">
	//   28   55:aload_0         
	//   29   56:getfield        #13  <Field PulseOximeterHandler this$0>
	//   30   59:invokestatic    #63  <Method int PulseOximeterHandler.access$100(PulseOximeterHandler)>
	//   31   62:invokevirtual   #67  <Method void Bundle.putInt(String, int)>
				abundle[0].putLong("heart_rate_interval", PulseOximeterHandler.access$200(PulseOximeterHandler.this));
	//   32   65:aload_1         
	//   33   66:iconst_0        
	//   34   67:aaload          
	//   35   68:ldc1            #69  <String "heart_rate_interval">
	//   36   70:aload_0         
	//   37   71:getfield        #13  <Field PulseOximeterHandler this$0>
	//   38   74:invokestatic    #73  <Method long PulseOximeterHandler.access$200(PulseOximeterHandler)>
	//   39   77:invokevirtual   #57  <Method void Bundle.putLong(String, long)>
				abundle[0].putFloat("heart_rate_snr", PulseOximeterHandler.access$300(PulseOximeterHandler.this));
	//   40   80:aload_1         
	//   41   81:iconst_0        
	//   42   82:aaload          
	//   43   83:ldc1            #75  <String "heart_rate_snr">
	//   44   85:aload_0         
	//   45   86:getfield        #13  <Field PulseOximeterHandler this$0>
	//   46   89:invokestatic    #79  <Method float PulseOximeterHandler.access$300(PulseOximeterHandler)>
	//   47   92:invokevirtual   #83  <Method void Bundle.putFloat(String, float)>
				mProfileHandlerListener.onDataReceived(1, abundle);
	//   48   95:aload_0         
	//   49   96:getfield        #13  <Field PulseOximeterHandler this$0>
	//   50   99:getfield        #42  <Field PrivilegeSensorProfileHandlerListener PulseOximeterHandler.mProfileHandlerListener>
	//   51  102:iconst_1        
	//   52  103:aload_1         
	//   53  104:invokeinterface #89  <Method void PrivilegeSensorProfileHandlerListener.onDataReceived(int, Bundle[])>
			} while(true);
	//   54  109:goto            0
		}
		catch(InterruptedException interruptedexception)
	//*  55  112:astore_1        
		{
			LOG.e(PulseOximeterHandler.access$000(), "Sending of dummy data is interrupted");
	//   56  113:invokestatic    #24  <Method Class PulseOximeterHandler.access$000()>
	//   57  116:ldc1            #91  <String "Sending of dummy data is interrupted">
	//   58  118:invokestatic    #94  <Method void LOG.e(Class, String)>
			interruptedexception.printStackTrace();
	//   59  121:aload_1         
	//   60  122:invokevirtual   #97  <Method void InterruptedException.printStackTrace()>
			return;
	//   61  125:return          
		}
	}

	final PulseOximeterHandler this$0;

	private PulseOximeterHandler$DummyDataThread()
	{
		this$0 = PulseOximeterHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field PulseOximeterHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Thread()>
	//    5    9:return          
	}
}
