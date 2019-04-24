// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.handler.bodytemperature;

import android.content.Context;
import android.hardware.*;
import android.os.Bundle;
import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;
import com.samsung.android.sdk.health.sensor.handler.PrivilegeSensorProfileHandlerInterface;
import com.samsung.android.sdk.health.sensor.handler.PrivilegeSensorProfileHandlerListener;
import com.sec.android.service.health.util.LOG;

public class BodyTemperatureHandler
	implements SensorEventListener, PrivilegeSensorProfileHandlerInterface
{

	public BodyTemperatureHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		bListenerRegistered = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #49  <Field boolean bListenerRegistered>
		mSensorManager = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #51  <Field SensorManager mSensorManager>
		mBodyTemperatureSensor = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #53  <Field Sensor mBodyTemperatureSensor>
		raw_data_cnt = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #55  <Field int raw_data_cnt>
		mProfileHandlerListener = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #57  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
		mbodytemperatureDevice = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #59  <Field _PrivilegeSensorDevice mbodytemperatureDevice>
		finalData = new Bundle[1];
	//   20   34:aload_0         
	//   21   35:iconst_1        
	//   22   36:anewarray       Bundle[]
	//   23   39:putfield        #63  <Field Bundle[] finalData>
	//   24   42:return          
	}

	private boolean registerTemperatureListener()
	{
		if(mSensorManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field SensorManager mSensorManager>
	//*   2    4:ifnull          81
		{
			mBodyTemperatureSensor = mSensorManager.getDefaultSensor(0x1001e);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field SensorManager mSensorManager>
	//    6   12:ldc1            #23  <Int 0x1001e>
	//    7   14:invokevirtual   #71  <Method Sensor SensorManager.getDefaultSensor(int)>
	//    8   17:putfield        #53  <Field Sensor mBodyTemperatureSensor>
			bListenerRegistered = mSensorManager.registerListener(((SensorEventListener) (this)), mBodyTemperatureSensor, 0);
	//    9   20:aload_0         
	//   10   21:aload_0         
	//   11   22:getfield        #51  <Field SensorManager mSensorManager>
	//   12   25:aload_0         
	//   13   26:aload_0         
	//   14   27:getfield        #53  <Field Sensor mBodyTemperatureSensor>
	//   15   30:iconst_0        
	//   16   31:invokevirtual   #75  <Method boolean SensorManager.registerListener(SensorEventListener, Sensor, int)>
	//   17   34:putfield        #49  <Field boolean bListenerRegistered>
			Class class1 = TAG;
	//   18   37:getstatic       #41  <Field Class TAG>
	//   19   40:astore_2        
			StringBuilder stringbuilder = (new StringBuilder()).append("Temperature sensor was ");
	//   20   41:new             #77  <Class StringBuilder>
	//   21   44:dup             
	//   22   45:invokespecial   #78  <Method void StringBuilder()>
	//   23   48:ldc1            #80  <String "Temperature sensor was ">
	//   24   50:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   25   53:astore_3        
			String s;
			if(bListenerRegistered)
	//*  26   54:aload_0         
	//*  27   55:getfield        #49  <Field boolean bListenerRegistered>
	//*  28   58:ifeq            86
				s = "";
	//   29   61:ldc1            #86  <String "">
	//   30   63:astore_1        
			else
	//*  31   64:aload_2         
	//*  32   65:aload_3         
	//*  33   66:aload_1         
	//*  34   67:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//*  35   70:ldc1            #88  <String "registered">
	//*  36   72:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//*  37   75:invokevirtual   #92  <Method String StringBuilder.toString()>
	//*  38   78:invokestatic    #98  <Method void LOG.d(Class, String)>
	//*  39   81:aload_0         
	//*  40   82:getfield        #49  <Field boolean bListenerRegistered>
	//*  41   85:ireturn         
				s = "not ";
	//   42   86:ldc1            #100 <String "not ">
	//   43   88:astore_1        
			LOG.d(class1, stringbuilder.append(s).append("registered").toString());
		}
		return bListenerRegistered;
	//*  44   89:goto            64
	}

	private void unregisterTemperatureListener()
	{
		LOG.d(TAG, (new StringBuilder()).append("unregisterTemperatureListener : current state : ").append(bListenerRegistered).toString());
	//    0    0:getstatic       #41  <Field Class TAG>
	//    1    3:new             #77  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #78  <Method void StringBuilder()>
	//    4   10:ldc1            #103 <String "unregisterTemperatureListener : current state : ">
	//    5   12:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_0         
	//    7   16:getfield        #49  <Field boolean bListenerRegistered>
	//    8   19:invokevirtual   #106 <Method StringBuilder StringBuilder.append(boolean)>
	//    9   22:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   10   25:invokestatic    #98  <Method void LOG.d(Class, String)>
		if(mSensorManager != null)
	//*  11   28:aload_0         
	//*  12   29:getfield        #51  <Field SensorManager mSensorManager>
	//*  13   32:ifnull          56
		{
			LOG.d(TAG, "unregisterSensorManager is called");
	//   14   35:getstatic       #41  <Field Class TAG>
	//   15   38:ldc1            #108 <String "unregisterSensorManager is called">
	//   16   40:invokestatic    #98  <Method void LOG.d(Class, String)>
			mSensorManager.unregisterListener(((SensorEventListener) (this)));
	//   17   43:aload_0         
	//   18   44:getfield        #51  <Field SensorManager mSensorManager>
	//   19   47:aload_0         
	//   20   48:invokevirtual   #112 <Method void SensorManager.unregisterListener(SensorEventListener)>
			bListenerRegistered = false;
	//   21   51:aload_0         
	//   22   52:iconst_0        
	//   23   53:putfield        #49  <Field boolean bListenerRegistered>
		}
	//   24   56:return          
	}

	public void deinitialize()
	{
		LOG.d(TAG, "deinitialize is called");
	//    0    0:getstatic       #41  <Field Class TAG>
	//    1    3:ldc1            #115 <String "deinitialize is called">
	//    2    5:invokestatic    #98  <Method void LOG.d(Class, String)>
		if(bListenerRegistered)
	//*   3    8:aload_0         
	//*   4    9:getfield        #49  <Field boolean bListenerRegistered>
	//*   5   12:ifeq            19
			unregisterTemperatureListener();
	//    6   15:aload_0         
	//    7   16:invokespecial   #117 <Method void unregisterTemperatureListener()>
	//    8   19:return          
	}

	public _PrivilegeSensorDevice getDevice()
	{
		return mbodytemperatureDevice;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field _PrivilegeSensorDevice mbodytemperatureDevice>
	//    2    4:areturn         
	}

	public int initialize(Context context, PrivilegeSensorProfileHandlerListener privilegesensorprofilehandlerlistener, _PrivilegeSensorDevice _pprivilegesensordevice, Object obj)
	{
		mContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #123 <Field Context mContext>
		mbodytemperatureDevice = _pprivilegesensordevice;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #59  <Field _PrivilegeSensorDevice mbodytemperatureDevice>
		mProfileHandlerListener = privilegesensorprofilehandlerlistener;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #57  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
		mSensorManager = (SensorManager)context.getSystemService("sensor");
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:ldc1            #125 <String "sensor">
	//   12   19:invokevirtual   #131 <Method Object Context.getSystemService(String)>
	//   13   22:checkcast       #67  <Class SensorManager>
	//   14   25:putfield        #51  <Field SensorManager mSensorManager>
		return 0;
	//   15   28:iconst_0        
	//   16   29:ireturn         
	}

	public void onAccuracyChanged(Sensor sensor, int i)
	{
	//    0    0:return          
	}

	public void onSensorChanged(SensorEvent sensorevent)
	{
		if(sensorevent.sensor.getType() == 0x1001e && raw_data_cnt < 1)
	//*   0    0:aload_1         
	//*   1    1:getfield        #139 <Field Sensor SensorEvent.sensor>
	//*   2    4:invokevirtual   #145 <Method int Sensor.getType()>
	//*   3    7:ldc1            #23  <Int 0x1001e>
	//*   4    9:icmpne          187
	//*   5   12:aload_0         
	//*   6   13:getfield        #55  <Field int raw_data_cnt>
	//*   7   16:iconst_1        
	//*   8   17:icmpge          187
		{
			LOG.d(TAG, (new StringBuilder()).append("BodyTemperature onSensorChanged 3rd element : ").append(sensorevent.values[3]).toString());
	//    9   20:getstatic       #41  <Field Class TAG>
	//   10   23:new             #77  <Class StringBuilder>
	//   11   26:dup             
	//   12   27:invokespecial   #78  <Method void StringBuilder()>
	//   13   30:ldc1            #147 <String "BodyTemperature onSensorChanged 3rd element : ">
	//   14   32:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   15   35:aload_1         
	//   16   36:getfield        #151 <Field float[] SensorEvent.values>
	//   17   39:iconst_3        
	//   18   40:faload          
	//   19   41:invokevirtual   #154 <Method StringBuilder StringBuilder.append(float)>
	//   20   44:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   21   47:invokestatic    #98  <Method void LOG.d(Class, String)>
			if(mProfileHandlerListener != null)
	//*  22   50:aload_0         
	//*  23   51:getfield        #57  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//*  24   54:ifnull          142
			{
				finalData[raw_data_cnt] = new Bundle();
	//   25   57:aload_0         
	//   26   58:getfield        #63  <Field Bundle[] finalData>
	//   27   61:aload_0         
	//   28   62:getfield        #55  <Field int raw_data_cnt>
	//   29   65:new             #61  <Class Bundle>
	//   30   68:dup             
	//   31   69:invokespecial   #155 <Method void Bundle()>
	//   32   72:aastore         
				finalData[raw_data_cnt].putFloat("temperature", sensorevent.values[3]);
	//   33   73:aload_0         
	//   34   74:getfield        #63  <Field Bundle[] finalData>
	//   35   77:aload_0         
	//   36   78:getfield        #55  <Field int raw_data_cnt>
	//   37   81:aaload          
	//   38   82:ldc1            #157 <String "temperature">
	//   39   84:aload_1         
	//   40   85:getfield        #151 <Field float[] SensorEvent.values>
	//   41   88:iconst_3        
	//   42   89:faload          
	//   43   90:invokevirtual   #161 <Method void Bundle.putFloat(String, float)>
				finalData[raw_data_cnt].putLong("time_stamp", System.currentTimeMillis());
	//   44   93:aload_0         
	//   45   94:getfield        #63  <Field Bundle[] finalData>
	//   46   97:aload_0         
	//   47   98:getfield        #55  <Field int raw_data_cnt>
	//   48  101:aaload          
	//   49  102:ldc1            #163 <String "time_stamp">
	//   50  104:invokestatic    #169 <Method long System.currentTimeMillis()>
	//   51  107:invokevirtual   #173 <Method void Bundle.putLong(String, long)>
				finalData[raw_data_cnt].putInt("temperature_unit", 0x27101);
	//   52  110:aload_0         
	//   53  111:getfield        #63  <Field Bundle[] finalData>
	//   54  114:aload_0         
	//   55  115:getfield        #55  <Field int raw_data_cnt>
	//   56  118:aaload          
	//   57  119:ldc1            #175 <String "temperature_unit">
	//   58  121:ldc1            #176 <Int 0x27101>
	//   59  123:invokevirtual   #180 <Method void Bundle.putInt(String, int)>
				finalData[raw_data_cnt].putInt("temperature_type", 0x11171);
	//   60  126:aload_0         
	//   61  127:getfield        #63  <Field Bundle[] finalData>
	//   62  130:aload_0         
	//   63  131:getfield        #55  <Field int raw_data_cnt>
	//   64  134:aaload          
	//   65  135:ldc1            #182 <String "temperature_type">
	//   66  137:ldc1            #183 <Int 0x11171>
	//   67  139:invokevirtual   #180 <Method void Bundle.putInt(String, int)>
			}
			raw_data_cnt = raw_data_cnt + 1;
	//   68  142:aload_0         
	//   69  143:aload_0         
	//   70  144:getfield        #55  <Field int raw_data_cnt>
	//   71  147:iconst_1        
	//   72  148:iadd            
	//   73  149:putfield        #55  <Field int raw_data_cnt>
			if(raw_data_cnt >= 1)
	//*  74  152:aload_0         
	//*  75  153:getfield        #55  <Field int raw_data_cnt>
	//*  76  156:iconst_1        
	//*  77  157:icmplt          187
			{
				if(mProfileHandlerListener != null)
	//*  78  160:aload_0         
	//*  79  161:getfield        #57  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//*  80  164:ifnull          182
					mProfileHandlerListener.onDataReceived(7, finalData);
	//   81  167:aload_0         
	//   82  168:getfield        #57  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//   83  171:bipush          7
	//   84  173:aload_0         
	//   85  174:getfield        #63  <Field Bundle[] finalData>
	//   86  177:invokeinterface #189 <Method void PrivilegeSensorProfileHandlerListener.onDataReceived(int, Bundle[])>
				raw_data_cnt = 0;
	//   87  182:aload_0         
	//   88  183:iconst_0        
	//   89  184:putfield        #55  <Field int raw_data_cnt>
			}
		}
	//   90  187:return          
	}

	public int startReceivingData()
	{
		raw_data_cnt = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #55  <Field int raw_data_cnt>
		if(!bListenerRegistered)
	//*   3    5:aload_0         
	//*   4    6:getfield        #49  <Field boolean bListenerRegistered>
	//*   5    9:ifne            48
		{
			registerTemperatureListener();
	//    6   12:aload_0         
	//    7   13:invokespecial   #192 <Method boolean registerTemperatureListener()>
	//    8   16:pop             
			if(TEST_FLAG)
	//*   9   17:getstatic       #43  <Field boolean TEST_FLAG>
	//*  10   20:ifeq            48
			{
				mProfileHandlerListener.onDataStarted(7, 0);
	//   11   23:aload_0         
	//   12   24:getfield        #57  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//   13   27:bipush          7
	//   14   29:iconst_0        
	//   15   30:invokeinterface #196 <Method void PrivilegeSensorProfileHandlerListener.onDataStarted(int, int)>
				((_cls1) (new Thread() {

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
)).start();
	//   16   35:new             #10  <Class BodyTemperatureHandler$1>
	//   17   38:dup             
	//   18   39:aload_0         
	//   19   40:invokespecial   #199 <Method void BodyTemperatureHandler$1(BodyTemperatureHandler)>
	//   20   43:invokevirtual   #202 <Method void BodyTemperatureHandler$1.start()>
				return 0;
	//   21   46:iconst_0        
	//   22   47:ireturn         
			}
		}
		PrivilegeSensorProfileHandlerListener privilegesensorprofilehandlerlistener = mProfileHandlerListener;
	//   23   48:aload_0         
	//   24   49:getfield        #57  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//   25   52:astore_2        
		int i;
		if(bListenerRegistered)
	//*  26   53:aload_0         
	//*  27   54:getfield        #49  <Field boolean bListenerRegistered>
	//*  28   57:ifeq            73
			i = 0;
	//   29   60:iconst_0        
	//   30   61:istore_1        
		else
	//*  31   62:aload_2         
	//*  32   63:bipush          7
	//*  33   65:iload_1         
	//*  34   66:invokeinterface #196 <Method void PrivilegeSensorProfileHandlerListener.onDataStarted(int, int)>
	//*  35   71:iconst_0        
	//*  36   72:ireturn         
			i = 1;
	//   37   73:iconst_1        
	//   38   74:istore_1        
		privilegesensorprofilehandlerlistener.onDataStarted(7, i);
		return 0;
	//*  39   75:goto            62
	}

	public int stopReceivingData()
	{
		unregisterTemperatureListener();
	//    0    0:aload_0         
	//    1    1:invokespecial   #117 <Method void unregisterTemperatureListener()>
		raw_data_cnt = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #55  <Field int raw_data_cnt>
		mProfileHandlerListener.onDataStopped(7, 0);
	//    5    9:aload_0         
	//    6   10:getfield        #57  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//    7   13:bipush          7
	//    8   15:iconst_0        
	//    9   16:invokeinterface #206 <Method void PrivilegeSensorProfileHandlerListener.onDataStopped(int, int)>
		return 0;
	//   10   21:iconst_0        
	//   11   22:ireturn         
	}

	private static final int CACHED_DATA_INTERVAL_CNT = 1;
	private static final Class TAG = com/sec/android/service/health/sensor/handler/bodytemperature/BodyTemperatureHandler;
	public static boolean TEST_FLAG = false;
	private static final int TYPE_BASE = 0x10000;
	public static final int TYPE_BODY_TEMPERATURE = 0x1001e;
	private boolean bListenerRegistered;
	Bundle finalData[];
	private Sensor mBodyTemperatureSensor;
	Context mContext;
	PrivilegeSensorProfileHandlerListener mProfileHandlerListener;
	private SensorManager mSensorManager;
	_PrivilegeSensorDevice mbodytemperatureDevice;
	private int raw_data_cnt;

	static 
	{
	//    0    0:ldc1            #2   <Class BodyTemperatureHandler>
	//    1    2:putstatic       #41  <Field Class TAG>
		TEST_FLAG = false;
	//    2    5:iconst_0        
	//    3    6:putstatic       #43  <Field boolean TEST_FLAG>
	//*   4    9:return          
	}
}
