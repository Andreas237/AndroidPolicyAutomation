// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.handler.hrm;

import android.content.Context;
import android.hardware.*;
import android.os.Bundle;
import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;
import com.samsung.android.sdk.health.sensor.handler.PrivilegeSensorProfileHandlerInterface;
import com.samsung.android.sdk.health.sensor.handler.PrivilegeSensorProfileHandlerListener;
import com.sec.android.service.health.util.LOG;

public class PulseOximeterHandler
	implements PrivilegeSensorProfileHandlerInterface
{
	private class DummyDataThread extends Thread
	{

		public void run()
		{
			try
			{
				do
				{
					do
					{
						LOG.d(PulseOximeterHandler.TAG, "Generating dummy data");
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
					abundle[0].putInt("heart_rate", mHeartRate);
		//   24   50:aload_1         
		//   25   51:iconst_0        
		//   26   52:aaload          
		//   27   53:ldc1            #59  <String "heart_rate">
		//   28   55:aload_0         
		//   29   56:getfield        #13  <Field PulseOximeterHandler this$0>
		//   30   59:invokestatic    #63  <Method int PulseOximeterHandler.access$100(PulseOximeterHandler)>
		//   31   62:invokevirtual   #67  <Method void Bundle.putInt(String, int)>
					abundle[0].putLong("heart_rate_interval", mInterval);
		//   32   65:aload_1         
		//   33   66:iconst_0        
		//   34   67:aaload          
		//   35   68:ldc1            #69  <String "heart_rate_interval">
		//   36   70:aload_0         
		//   37   71:getfield        #13  <Field PulseOximeterHandler this$0>
		//   38   74:invokestatic    #73  <Method long PulseOximeterHandler.access$200(PulseOximeterHandler)>
		//   39   77:invokevirtual   #57  <Method void Bundle.putLong(String, long)>
					abundle[0].putFloat("heart_rate_snr", mSNR);
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
				LOG.e(PulseOximeterHandler.TAG, "Sending of dummy data is interrupted");
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

		private DummyDataThread()
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


	public PulseOximeterHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		bListenerRegistered = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #59  <Field boolean bListenerRegistered>
		sensorManager = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #61  <Field SensorManager sensorManager>
		mSpO2Sensor = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #63  <Field Sensor mSpO2Sensor>
		mProfileHandlerListener = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #65  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
		mPulseOximeterDevice = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #67  <Field _PrivilegeSensorDevice mPulseOximeterDevice>
		raw_data_cnt = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #69  <Field int raw_data_cnt>
		mHeartRate = -1;
	//   20   34:aload_0         
	//   21   35:iconst_m1       
	//   22   36:putfield        #71  <Field int mHeartRate>
		mInterval = 0L;
	//   23   39:aload_0         
	//   24   40:lconst_0        
	//   25   41:putfield        #73  <Field long mInterval>
		mSNR = 0.0F;
	//   26   44:aload_0         
	//   27   45:fconst_0        
	//   28   46:putfield        #75  <Field float mSNR>
		mPulseOximetry = 0.0F;
	//   29   49:aload_0         
	//   30   50:fconst_0        
	//   31   51:putfield        #77  <Field float mPulseOximetry>
		mSNRUnit = 0x4baf1;
	//   32   54:aload_0         
	//   33   55:ldc1            #78  <Int 0x4baf1>
	//   34   57:putfield        #80  <Field int mSNRUnit>
		finalData = new Bundle[1];
	//   35   60:aload_0         
	//   36   61:iconst_1        
	//   37   62:anewarray       Bundle[]
	//   38   65:putfield        #84  <Field Bundle[] finalData>
		SpO2Listener = new SensorEventListener() {

			public void onAccuracyChanged(Sensor sensor, int i)
			{
			//    0    0:return          
			}

			public void onSensorChanged(SensorEvent sensorevent)
			{
				if(sensorevent != null && sensorevent.sensor != null && sensorevent.sensor.getType() == 0x1001a && raw_data_cnt < 1)
			//*   0    0:aload_1         
			//*   1    1:ifnull          11
			//*   2    4:aload_1         
			//*   3    5:getfield        #28  <Field Sensor SensorEvent.sensor>
			//*   4    8:ifnonnull       12
			//*   5   11:return          
			//*   6   12:aload_1         
			//*   7   13:getfield        #28  <Field Sensor SensorEvent.sensor>
			//*   8   16:invokevirtual   #34  <Method int Sensor.getType()>
			//*   9   19:ldc1            #35  <Int 0x1001a>
			//*  10   21:icmpne          11
			//*  11   24:aload_0         
			//*  12   25:getfield        #14  <Field PulseOximeterHandler this$0>
			//*  13   28:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
			//*  14   31:iconst_1        
			//*  15   32:icmpge          11
				{
					finalData[raw_data_cnt] = new Bundle();
			//   16   35:aload_0         
			//   17   36:getfield        #14  <Field PulseOximeterHandler this$0>
			//   18   39:invokestatic    #43  <Method Bundle[] PulseOximeterHandler.access$500(PulseOximeterHandler)>
			//   19   42:aload_0         
			//   20   43:getfield        #14  <Field PulseOximeterHandler this$0>
			//   21   46:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
			//   22   49:new             #45  <Class Bundle>
			//   23   52:dup             
			//   24   53:invokespecial   #46  <Method void Bundle()>
			//   25   56:aastore         
					mHeartRate = (int)sensorevent.values[0];
			//   26   57:aload_0         
			//   27   58:getfield        #14  <Field PulseOximeterHandler this$0>
			//   28   61:aload_1         
			//   29   62:getfield        #50  <Field float[] SensorEvent.values>
			//   30   65:iconst_0        
			//   31   66:faload          
			//   32   67:f2i             
			//   33   68:invokestatic    #54  <Method int PulseOximeterHandler.access$102(PulseOximeterHandler, int)>
			//   34   71:pop             
					mInterval = (long)sensorevent.values[1];
			//   35   72:aload_0         
			//   36   73:getfield        #14  <Field PulseOximeterHandler this$0>
			//   37   76:aload_1         
			//   38   77:getfield        #50  <Field float[] SensorEvent.values>
			//   39   80:iconst_1        
			//   40   81:faload          
			//   41   82:f2l             
			//   42   83:invokestatic    #58  <Method long PulseOximeterHandler.access$202(PulseOximeterHandler, long)>
			//   43   86:pop2            
					mSNR = sensorevent.values[2];
			//   44   87:aload_0         
			//   45   88:getfield        #14  <Field PulseOximeterHandler this$0>
			//   46   91:aload_1         
			//   47   92:getfield        #50  <Field float[] SensorEvent.values>
			//   48   95:iconst_2        
			//   49   96:faload          
			//   50   97:invokestatic    #62  <Method float PulseOximeterHandler.access$302(PulseOximeterHandler, float)>
			//   51  100:pop             
					mPulseOximetry = sensorevent.values[4];
			//   52  101:aload_0         
			//   53  102:getfield        #14  <Field PulseOximeterHandler this$0>
			//   54  105:aload_1         
			//   55  106:getfield        #50  <Field float[] SensorEvent.values>
			//   56  109:iconst_4        
			//   57  110:faload          
			//   58  111:invokestatic    #65  <Method float PulseOximeterHandler.access$602(PulseOximeterHandler, float)>
			//   59  114:pop             
					finalData[raw_data_cnt].putLong("time_stamp", System.currentTimeMillis());
			//   60  115:aload_0         
			//   61  116:getfield        #14  <Field PulseOximeterHandler this$0>
			//   62  119:invokestatic    #43  <Method Bundle[] PulseOximeterHandler.access$500(PulseOximeterHandler)>
			//   63  122:aload_0         
			//   64  123:getfield        #14  <Field PulseOximeterHandler this$0>
			//   65  126:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
			//   66  129:aaload          
			//   67  130:ldc1            #67  <String "time_stamp">
			//   68  132:invokestatic    #73  <Method long System.currentTimeMillis()>
			//   69  135:invokevirtual   #77  <Method void Bundle.putLong(String, long)>
					finalData[raw_data_cnt].putInt("heart_rate", mHeartRate);
			//   70  138:aload_0         
			//   71  139:getfield        #14  <Field PulseOximeterHandler this$0>
			//   72  142:invokestatic    #43  <Method Bundle[] PulseOximeterHandler.access$500(PulseOximeterHandler)>
			//   73  145:aload_0         
			//   74  146:getfield        #14  <Field PulseOximeterHandler this$0>
			//   75  149:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
			//   76  152:aaload          
			//   77  153:ldc1            #79  <String "heart_rate">
			//   78  155:aload_0         
			//   79  156:getfield        #14  <Field PulseOximeterHandler this$0>
			//   80  159:invokestatic    #82  <Method int PulseOximeterHandler.access$100(PulseOximeterHandler)>
			//   81  162:invokevirtual   #86  <Method void Bundle.putInt(String, int)>
					finalData[raw_data_cnt].putLong("heart_rate_interval", mInterval);
			//   82  165:aload_0         
			//   83  166:getfield        #14  <Field PulseOximeterHandler this$0>
			//   84  169:invokestatic    #43  <Method Bundle[] PulseOximeterHandler.access$500(PulseOximeterHandler)>
			//   85  172:aload_0         
			//   86  173:getfield        #14  <Field PulseOximeterHandler this$0>
			//   87  176:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
			//   88  179:aaload          
			//   89  180:ldc1            #88  <String "heart_rate_interval">
			//   90  182:aload_0         
			//   91  183:getfield        #14  <Field PulseOximeterHandler this$0>
			//   92  186:invokestatic    #92  <Method long PulseOximeterHandler.access$200(PulseOximeterHandler)>
			//   93  189:invokevirtual   #77  <Method void Bundle.putLong(String, long)>
					finalData[raw_data_cnt].putFloat("heart_rate_snr", mSNR);
			//   94  192:aload_0         
			//   95  193:getfield        #14  <Field PulseOximeterHandler this$0>
			//   96  196:invokestatic    #43  <Method Bundle[] PulseOximeterHandler.access$500(PulseOximeterHandler)>
			//   97  199:aload_0         
			//   98  200:getfield        #14  <Field PulseOximeterHandler this$0>
			//   99  203:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
			//  100  206:aaload          
			//  101  207:ldc1            #94  <String "heart_rate_snr">
			//  102  209:aload_0         
			//  103  210:getfield        #14  <Field PulseOximeterHandler this$0>
			//  104  213:invokestatic    #98  <Method float PulseOximeterHandler.access$300(PulseOximeterHandler)>
			//  105  216:invokevirtual   #102 <Method void Bundle.putFloat(String, float)>
					finalData[raw_data_cnt].putInt("heart_rate_unit", mSNRUnit);
			//  106  219:aload_0         
			//  107  220:getfield        #14  <Field PulseOximeterHandler this$0>
			//  108  223:invokestatic    #43  <Method Bundle[] PulseOximeterHandler.access$500(PulseOximeterHandler)>
			//  109  226:aload_0         
			//  110  227:getfield        #14  <Field PulseOximeterHandler this$0>
			//  111  230:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
			//  112  233:aaload          
			//  113  234:ldc1            #104 <String "heart_rate_unit">
			//  114  236:aload_0         
			//  115  237:getfield        #14  <Field PulseOximeterHandler this$0>
			//  116  240:invokestatic    #107 <Method int PulseOximeterHandler.access$700(PulseOximeterHandler)>
			//  117  243:invokevirtual   #86  <Method void Bundle.putInt(String, int)>
					finalData[raw_data_cnt].putFloat("pulse_oximetry", mPulseOximetry);
			//  118  246:aload_0         
			//  119  247:getfield        #14  <Field PulseOximeterHandler this$0>
			//  120  250:invokestatic    #43  <Method Bundle[] PulseOximeterHandler.access$500(PulseOximeterHandler)>
			//  121  253:aload_0         
			//  122  254:getfield        #14  <Field PulseOximeterHandler this$0>
			//  123  257:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
			//  124  260:aaload          
			//  125  261:ldc1            #109 <String "pulse_oximetry">
			//  126  263:aload_0         
			//  127  264:getfield        #14  <Field PulseOximeterHandler this$0>
			//  128  267:invokestatic    #112 <Method float PulseOximeterHandler.access$600(PulseOximeterHandler)>
			//  129  270:invokevirtual   #102 <Method void Bundle.putFloat(String, float)>
					int i = ((lang) (this)).;
			//  130  273:aload_0         
			//  131  274:getfield        #14  <Field PulseOximeterHandler this$0>
			//  132  277:invokestatic    #115 <Method int PulseOximeterHandler.access$408(PulseOximeterHandler)>
			//  133  280:pop             
					LOG.d(PulseOximeterHandler.TAG, (new StringBuilder()).append("HRMListener => heartrate = ").append(mHeartRate).append(" interval = ").append(mInterval).append(" SNR = ").append(mSNR).toString());
			//  134  281:invokestatic    #119 <Method Class PulseOximeterHandler.access$000()>
			//  135  284:new             #121 <Class StringBuilder>
			//  136  287:dup             
			//  137  288:invokespecial   #122 <Method void StringBuilder()>
			//  138  291:ldc1            #124 <String "HRMListener => heartrate = ">
			//  139  293:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
			//  140  296:aload_0         
			//  141  297:getfield        #14  <Field PulseOximeterHandler this$0>
			//  142  300:invokestatic    #82  <Method int PulseOximeterHandler.access$100(PulseOximeterHandler)>
			//  143  303:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
			//  144  306:ldc1            #133 <String " interval = ">
			//  145  308:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
			//  146  311:aload_0         
			//  147  312:getfield        #14  <Field PulseOximeterHandler this$0>
			//  148  315:invokestatic    #92  <Method long PulseOximeterHandler.access$200(PulseOximeterHandler)>
			//  149  318:invokevirtual   #136 <Method StringBuilder StringBuilder.append(long)>
			//  150  321:ldc1            #138 <String " SNR = ">
			//  151  323:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
			//  152  326:aload_0         
			//  153  327:getfield        #14  <Field PulseOximeterHandler this$0>
			//  154  330:invokestatic    #98  <Method float PulseOximeterHandler.access$300(PulseOximeterHandler)>
			//  155  333:invokevirtual   #141 <Method StringBuilder StringBuilder.append(float)>
			//  156  336:invokevirtual   #145 <Method String StringBuilder.toString()>
			//  157  339:invokestatic    #151 <Method void LOG.d(Class, String)>
					if(mProfileHandlerListener != null && raw_data_cnt == 1)
			//* 158  342:aload_0         
			//* 159  343:getfield        #14  <Field PulseOximeterHandler this$0>
			//* 160  346:getfield        #155 <Field PrivilegeSensorProfileHandlerListener PulseOximeterHandler.mProfileHandlerListener>
			//* 161  349:ifnull          11
			//* 162  352:aload_0         
			//* 163  353:getfield        #14  <Field PulseOximeterHandler this$0>
			//* 164  356:invokestatic    #39  <Method int PulseOximeterHandler.access$400(PulseOximeterHandler)>
			//* 165  359:iconst_1        
			//* 166  360:icmpne          11
					{
						mProfileHandlerListener.onDataReceived(2, finalData);
			//  167  363:aload_0         
			//  168  364:getfield        #14  <Field PulseOximeterHandler this$0>
			//  169  367:getfield        #155 <Field PrivilegeSensorProfileHandlerListener PulseOximeterHandler.mProfileHandlerListener>
			//  170  370:iconst_2        
			//  171  371:aload_0         
			//  172  372:getfield        #14  <Field PulseOximeterHandler this$0>
			//  173  375:invokestatic    #43  <Method Bundle[] PulseOximeterHandler.access$500(PulseOximeterHandler)>
			//  174  378:invokeinterface #161 <Method void PrivilegeSensorProfileHandlerListener.onDataReceived(int, Bundle[])>
						raw_data_cnt = 0;
			//  175  383:aload_0         
			//  176  384:getfield        #14  <Field PulseOximeterHandler this$0>
			//  177  387:iconst_0        
			//  178  388:invokestatic    #164 <Method int PulseOximeterHandler.access$402(PulseOximeterHandler, int)>
			//  179  391:pop             
						return;
			//  180  392:return          
					}
				}
			}

			final PulseOximeterHandler this$0;

			
			{
				this$0 = PulseOximeterHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field PulseOximeterHandler this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   39   68:aload_0         
	//   40   69:new             #8   <Class PulseOximeterHandler$1>
	//   41   72:dup             
	//   42   73:aload_0         
	//   43   74:invokespecial   #87  <Method void PulseOximeterHandler$1(PulseOximeterHandler)>
	//   44   77:putfield        #89  <Field SensorEventListener SpO2Listener>
	//   45   80:return          
	}

	private boolean registerSpO2Listener()
	{
		if(sensorManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field SensorManager sensorManager>
	//*   2    4:ifnull          113
		{
			mSpO2Sensor = sensorManager.getDefaultSensor(0x1001a);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #61  <Field SensorManager sensorManager>
	//    6   12:ldc1            #24  <Int 0x1001a>
	//    7   14:invokevirtual   #119 <Method Sensor SensorManager.getDefaultSensor(int)>
	//    8   17:putfield        #63  <Field Sensor mSpO2Sensor>
			boolean flag = sensorManager.registerListener(SpO2Listener, mSpO2Sensor, 0);
	//    9   20:aload_0         
	//   10   21:getfield        #61  <Field SensorManager sensorManager>
	//   11   24:aload_0         
	//   12   25:getfield        #89  <Field SensorEventListener SpO2Listener>
	//   13   28:aload_0         
	//   14   29:getfield        #63  <Field Sensor mSpO2Sensor>
	//   15   32:iconst_0        
	//   16   33:invokevirtual   #123 <Method boolean SensorManager.registerListener(SensorEventListener, Sensor, int)>
	//   17   36:istore_1        
			Class class1 = TAG;
	//   18   37:getstatic       #53  <Field Class TAG>
	//   19   40:astore_3        
			StringBuilder stringbuilder = (new StringBuilder()).append("HRM sensor TYPE_HRM_BIO was ");
	//   20   41:new             #125 <Class StringBuilder>
	//   21   44:dup             
	//   22   45:invokespecial   #126 <Method void StringBuilder()>
	//   23   48:ldc1            #128 <String "HRM sensor TYPE_HRM_BIO was ">
	//   24   50:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:astore          4
			String s;
			if(flag)
	//*  26   55:iload_1         
	//*  27   56:ifeq            118
				s = "";
	//   28   59:ldc1            #134 <String "">
	//   29   61:astore_2        
			else
	//*  30   62:aload_3         
	//*  31   63:aload           4
	//*  32   65:aload_2         
	//*  33   66:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//*  34   69:ldc1            #136 <String "registered">
	//*  35   71:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//*  36   74:invokevirtual   #140 <Method String StringBuilder.toString()>
	//*  37   77:invokestatic    #146 <Method void LOG.d(Class, String)>
	//*  38   80:aload_0         
	//*  39   81:iload_1         
	//*  40   82:putfield        #59  <Field boolean bListenerRegistered>
	//*  41   85:getstatic       #53  <Field Class TAG>
	//*  42   88:new             #125 <Class StringBuilder>
	//*  43   91:dup             
	//*  44   92:invokespecial   #126 <Method void StringBuilder()>
	//*  45   95:ldc1            #148 <String "HRM sensor bListenerRegistered :  ">
	//*  46   97:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//*  47  100:aload_0         
	//*  48  101:getfield        #59  <Field boolean bListenerRegistered>
	//*  49  104:invokevirtual   #151 <Method StringBuilder StringBuilder.append(boolean)>
	//*  50  107:invokevirtual   #140 <Method String StringBuilder.toString()>
	//*  51  110:invokestatic    #146 <Method void LOG.d(Class, String)>
	//*  52  113:aload_0         
	//*  53  114:getfield        #59  <Field boolean bListenerRegistered>
	//*  54  117:ireturn         
				s = "not ";
	//   55  118:ldc1            #153 <String "not ">
	//   56  120:astore_2        
			LOG.d(class1, stringbuilder.append(s).append("registered").toString());
			bListenerRegistered = flag;
			LOG.d(TAG, (new StringBuilder()).append("HRM sensor bListenerRegistered :  ").append(bListenerRegistered).toString());
		}
		return bListenerRegistered;
	//*  57  121:goto            62
	}

	private boolean unregisterSpO2Listener()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		LOG.d(TAG, (new StringBuilder()).append("unregisterSpO2Listener : current state : ").append(bListenerRegistered).toString());
	//    2    2:getstatic       #53  <Field Class TAG>
	//    3    5:new             #125 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #126 <Method void StringBuilder()>
	//    6   12:ldc1            #156 <String "unregisterSpO2Listener : current state : ">
	//    7   14:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:aload_0         
	//    9   18:getfield        #59  <Field boolean bListenerRegistered>
	//   10   21:invokevirtual   #151 <Method StringBuilder StringBuilder.append(boolean)>
	//   11   24:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   12   27:invokestatic    #146 <Method void LOG.d(Class, String)>
		if(sensorManager != null)
	//*  13   30:aload_0         
	//*  14   31:getfield        #61  <Field SensorManager sensorManager>
	//*  15   34:ifnull          63
		{
			LOG.d(TAG, "unregisterSensorManager is called");
	//   16   37:getstatic       #53  <Field Class TAG>
	//   17   40:ldc1            #158 <String "unregisterSensorManager is called">
	//   18   42:invokestatic    #146 <Method void LOG.d(Class, String)>
			sensorManager.unregisterListener(SpO2Listener);
	//   19   45:aload_0         
	//   20   46:getfield        #61  <Field SensorManager sensorManager>
	//   21   49:aload_0         
	//   22   50:getfield        #89  <Field SensorEventListener SpO2Listener>
	//   23   53:invokevirtual   #162 <Method void SensorManager.unregisterListener(SensorEventListener)>
			bListenerRegistered = false;
	//   24   56:aload_0         
	//   25   57:iconst_0        
	//   26   58:putfield        #59  <Field boolean bListenerRegistered>
			flag = true;
	//   27   61:iconst_1        
	//   28   62:istore_1        
		}
		return flag;
	//   29   63:iload_1         
	//   30   64:ireturn         
	}

	public void deinitialize()
	{
		LOG.d(TAG, "deinitialize is called");
	//    0    0:getstatic       #53  <Field Class TAG>
	//    1    3:ldc1            #165 <String "deinitialize is called">
	//    2    5:invokestatic    #146 <Method void LOG.d(Class, String)>
		if(bListenerRegistered)
	//*   3    8:aload_0         
	//*   4    9:getfield        #59  <Field boolean bListenerRegistered>
	//*   5   12:ifeq            20
			unregisterSpO2Listener();
	//    6   15:aload_0         
	//    7   16:invokespecial   #167 <Method boolean unregisterSpO2Listener()>
	//    8   19:pop             
	//    9   20:return          
	}

	public _PrivilegeSensorDevice getDevice()
	{
		return mPulseOximeterDevice;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field _PrivilegeSensorDevice mPulseOximeterDevice>
	//    2    4:areturn         
	}

	public PrivilegeSensorProfileHandlerListener getProfileHandlerListener()
	{
		return mProfileHandlerListener;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//    2    4:areturn         
	}

	public _PrivilegeSensorDevice get_ShealthSensorDevice()
	{
		return mPulseOximeterDevice;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field _PrivilegeSensorDevice mPulseOximeterDevice>
	//    2    4:areturn         
	}

	public int initialize(Context context, PrivilegeSensorProfileHandlerListener privilegesensorprofilehandlerlistener, _PrivilegeSensorDevice _pprivilegesensordevice, Object obj)
	{
		mContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #176 <Field Context mContext>
		mPulseOximeterDevice = _pprivilegesensordevice;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #67  <Field _PrivilegeSensorDevice mPulseOximeterDevice>
		mProfileHandlerListener = privilegesensorprofilehandlerlistener;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #65  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
		sensorManager = (SensorManager)context.getSystemService("sensor");
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:ldc1            #178 <String "sensor">
	//   12   19:invokevirtual   #184 <Method Object Context.getSystemService(String)>
	//   13   22:checkcast       #115 <Class SensorManager>
	//   14   25:putfield        #61  <Field SensorManager sensorManager>
		return 0;
	//   15   28:iconst_0        
	//   16   29:ireturn         
	}

	public void initiallize(Context context, Object obj)
	{
		mContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #176 <Field Context mContext>
		sensorManager = (SensorManager)context.getSystemService("sensor");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #178 <String "sensor">
	//    6    9:invokevirtual   #184 <Method Object Context.getSystemService(String)>
	//    7   12:checkcast       #115 <Class SensorManager>
	//    8   15:putfield        #61  <Field SensorManager sensorManager>
	//    9   18:return          
	}

	public void setProfileHandlerListener(PrivilegeSensorProfileHandlerListener privilegesensorprofilehandlerlistener)
	{
		mProfileHandlerListener = privilegesensorprofilehandlerlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//    3    5:return          
	}

	public void set_ShealthSensorDevice(_PrivilegeSensorDevice _pprivilegesensordevice)
	{
		mPulseOximeterDevice = _pprivilegesensordevice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field _PrivilegeSensorDevice mPulseOximeterDevice>
	//    3    5:return          
	}

	public int startReceivingData()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(!bListenerRegistered)
	//*   2    2:aload_0         
	//*   3    3:getfield        #59  <Field boolean bListenerRegistered>
	//*   4    6:ifne            18
			if(registerSpO2Listener())
	//*   5    9:aload_0         
	//*   6   10:invokespecial   #194 <Method boolean registerSpO2Listener()>
	//*   7   13:ifeq            63
				i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_1        
			else
	//*  10   18:aload_0         
	//*  11   19:getfield        #65  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//*  12   22:ifnull          36
	//*  13   25:aload_0         
	//*  14   26:getfield        #65  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//*  15   29:iconst_2        
	//*  16   30:iload_1         
	//*  17   31:invokeinterface #200 <Method void PrivilegeSensorProfileHandlerListener.onDataStarted(int, int)>
	//*  18   36:getstatic       #53  <Field Class TAG>
	//*  19   39:new             #125 <Class StringBuilder>
	//*  20   42:dup             
	//*  21   43:invokespecial   #126 <Method void StringBuilder()>
	//*  22   46:ldc1            #202 <String "startReceivingData() is called. ret : ">
	//*  23   48:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//*  24   51:iload_1         
	//*  25   52:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//*  26   55:invokevirtual   #140 <Method String StringBuilder.toString()>
	//*  27   58:invokestatic    #146 <Method void LOG.d(Class, String)>
	//*  28   61:iload_1         
	//*  29   62:ireturn         
				i = 1;
	//   30   63:iconst_1        
	//   31   64:istore_1        
		if(mProfileHandlerListener != null)
			mProfileHandlerListener.onDataStarted(2, i);
		LOG.d(TAG, (new StringBuilder()).append("startReceivingData() is called. ret : ").append(i).toString());
		return i;
	//*  32   65:goto            18
	}

	public int stopReceivingData()
	{
		int i;
		if(unregisterSpO2Listener())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #167 <Method boolean unregisterSpO2Listener()>
	//*   2    4:ifeq            54
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		else
	//*   5    9:aload_0         
	//*   6   10:getfield        #65  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//*   7   13:ifnull          27
	//*   8   16:aload_0         
	//*   9   17:getfield        #65  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//*  10   20:iconst_2        
	//*  11   21:iload_1         
	//*  12   22:invokeinterface #209 <Method void PrivilegeSensorProfileHandlerListener.onDataStopped(int, int)>
	//*  13   27:getstatic       #53  <Field Class TAG>
	//*  14   30:new             #125 <Class StringBuilder>
	//*  15   33:dup             
	//*  16   34:invokespecial   #126 <Method void StringBuilder()>
	//*  17   37:ldc1            #211 <String "stopReceivingData() is called. ret : ">
	//*  18   39:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//*  19   42:iload_1         
	//*  20   43:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//*  21   46:invokevirtual   #140 <Method String StringBuilder.toString()>
	//*  22   49:invokestatic    #146 <Method void LOG.d(Class, String)>
	//*  23   52:iload_1         
	//*  24   53:ireturn         
			i = 1;
	//   25   54:iconst_1        
	//   26   55:istore_1        
		if(mProfileHandlerListener != null)
			mProfileHandlerListener.onDataStopped(2, i);
		LOG.d(TAG, (new StringBuilder()).append("stopReceivingData() is called. ret : ").append(i).toString());
		return i;
	//*  27   56:goto            9
	}

	private static final int CACHED_DATA_INTERVAL_CNT = 1;
	private static final Class TAG = com/sec/android/service/health/sensor/handler/hrm/PulseOximeterHandler;
	private static final boolean TEST_FLAG = false;
	private static final int TYPE_BASE = 0x10000;
	public static final int TYPE_HRM_BIO = 0x1001a;
	SensorEventListener SpO2Listener;
	private boolean bListenerRegistered;
	private Bundle finalData[];
	Context mContext;
	private DummyDataThread mDummyDataThread;
	private int mHeartRate;
	private long mInterval;
	PrivilegeSensorProfileHandlerListener mProfileHandlerListener;
	_PrivilegeSensorDevice mPulseOximeterDevice;
	private float mPulseOximetry;
	private float mSNR;
	private int mSNRUnit;
	private Sensor mSpO2Sensor;
	private int raw_data_cnt;
	private SensorManager sensorManager;

	static 
	{
	//    0    0:ldc1            #2   <Class PulseOximeterHandler>
	//    1    2:putstatic       #53  <Field Class TAG>
	//*   2    5:return          
	}


/*
	static Class access$000()
	{
		return TAG;
	//    0    0:getstatic       #53  <Field Class TAG>
	//    1    3:areturn         
	}

*/


/*
	static int access$100(PulseOximeterHandler pulseoximeterhandler)
	{
		return pulseoximeterhandler.mHeartRate;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int mHeartRate>
	//    2    4:ireturn         
	}

*/


/*
	static int access$102(PulseOximeterHandler pulseoximeterhandler, int i)
	{
		pulseoximeterhandler.mHeartRate = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field int mHeartRate>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static long access$200(PulseOximeterHandler pulseoximeterhandler)
	{
		return pulseoximeterhandler.mInterval;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field long mInterval>
	//    2    4:lreturn         
	}

*/


/*
	static long access$202(PulseOximeterHandler pulseoximeterhandler, long l)
	{
		pulseoximeterhandler.mInterval = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #73  <Field long mInterval>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

*/


/*
	static float access$300(PulseOximeterHandler pulseoximeterhandler)
	{
		return pulseoximeterhandler.mSNR;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field float mSNR>
	//    2    4:freturn         
	}

*/


/*
	static float access$302(PulseOximeterHandler pulseoximeterhandler, float f)
	{
		pulseoximeterhandler.mSNR = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #75  <Field float mSNR>
		return f;
	//    3    5:fload_1         
	//    4    6:freturn         
	}

*/


/*
	static int access$400(PulseOximeterHandler pulseoximeterhandler)
	{
		return pulseoximeterhandler.raw_data_cnt;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int raw_data_cnt>
	//    2    4:ireturn         
	}

*/


/*
	static int access$402(PulseOximeterHandler pulseoximeterhandler, int i)
	{
		pulseoximeterhandler.raw_data_cnt = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field int raw_data_cnt>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$408(PulseOximeterHandler pulseoximeterhandler)
	{
		int i = pulseoximeterhandler.raw_data_cnt;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int raw_data_cnt>
	//    2    4:istore_1        
		pulseoximeterhandler.raw_data_cnt = i + 1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #69  <Field int raw_data_cnt>
		return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
	}

*/


/*
	static Bundle[] access$500(PulseOximeterHandler pulseoximeterhandler)
	{
		return pulseoximeterhandler.finalData;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Bundle[] finalData>
	//    2    4:areturn         
	}

*/


/*
	static float access$600(PulseOximeterHandler pulseoximeterhandler)
	{
		return pulseoximeterhandler.mPulseOximetry;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field float mPulseOximetry>
	//    2    4:freturn         
	}

*/


/*
	static float access$602(PulseOximeterHandler pulseoximeterhandler, float f)
	{
		pulseoximeterhandler.mPulseOximetry = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #77  <Field float mPulseOximetry>
		return f;
	//    3    5:fload_1         
	//    4    6:freturn         
	}

*/


/*
	static int access$700(PulseOximeterHandler pulseoximeterhandler)
	{
		return pulseoximeterhandler.mSNRUnit;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int mSNRUnit>
	//    2    4:ireturn         
	}

*/
}
