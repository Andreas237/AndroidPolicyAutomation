// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.handler.bloodglucose;

import android.content.Context;
import android.hardware.*;
import android.os.*;
import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;
import com.samsung.android.sdk.health.sensor.handler.PrivilegeSensorProfileHandlerInterface;
import com.samsung.android.sdk.health.sensor.handler.PrivilegeSensorProfileHandlerListener;
import com.sec.android.service.health.util.LOG;
import java.io.File;
import java.util.Random;

public class InternalBGHandler
	implements PrivilegeSensorProfileHandlerInterface, SensorEventListener
{
	private class DummyDataThread extends Thread
	{

		public void run()
		{
			float f;
			InternalBGHandler.nBGState = 0;
		//    0    0:iconst_0        
		//    1    1:invokestatic    #27  <Method int InternalBGHandler.access$002(int)>
		//    2    4:pop             
			f = (new Random()).nextInt(500);
		//    3    5:new             #29  <Class Random>
		//    4    8:dup             
		//    5    9:invokespecial   #30  <Method void Random()>
		//    6   12:sipush          500
		//    7   15:invokevirtual   #33  <Method int Random.nextInt(int)>
		//    8   18:i2f             
		//    9   19:fstore_1        
_L6:
			if(InternalBGHandler.nBGState >= InternalBGHandler.testBGstate.length)
		//*  10   20:invokestatic    #37  <Method int InternalBGHandler.access$000()>
		//*  11   23:invokestatic    #41  <Method int[] InternalBGHandler.access$100()>
		//*  12   26:arraylength     
		//*  13   27:icmplt          36
			{
				InternalBGHandler.nBGState = 0;
		//   14   30:iconst_0        
		//   15   31:invokestatic    #27  <Method int InternalBGHandler.access$002(int)>
		//   16   34:pop             
				return;
		//   17   35:return          
			}
			if(InternalBGHandler.testBGstate[InternalBGHandler.nBGState] != 10) goto _L2; else goto _L1
		//   18   36:invokestatic    #41  <Method int[] InternalBGHandler.access$100()>
		//   19   39:invokestatic    #37  <Method int InternalBGHandler.access$000()>
		//   20   42:iaload          
		//   21   43:bipush          10
		//   22   45:icmpne          244
_L1:
			Thread.sleep(5000L);
		//   23   48:ldc2w           #42  <Long 5000L>
		//   24   51:invokestatic    #47  <Method void Thread.sleep(long)>
_L4:
			if(mProfileHandlerListener != null)
		//*  25   54:aload_0         
		//*  26   55:getfield        #13  <Field InternalBGHandler this$0>
		//*  27   58:getfield        #51  <Field PrivilegeSensorProfileHandlerListener InternalBGHandler.mProfileHandlerListener>
		//*  28   61:ifnull          197
			{
				Bundle abundle[] = new Bundle[1];
		//   29   64:iconst_1        
		//   30   65:anewarray       Bundle[]
		//   31   68:astore_2        
				abundle[0] = new Bundle();
		//   32   69:aload_2         
		//   33   70:iconst_0        
		//   34   71:new             #53  <Class Bundle>
		//   35   74:dup             
		//   36   75:invokespecial   #54  <Method void Bundle()>
		//   37   78:aastore         
				abundle[0].putInt("glucose_sensor_state", InternalBGHandler.testBGstate[InternalBGHandler.nBGState]);
		//   38   79:aload_2         
		//   39   80:iconst_0        
		//   40   81:aaload          
		//   41   82:ldc1            #56  <String "glucose_sensor_state">
		//   42   84:invokestatic    #41  <Method int[] InternalBGHandler.access$100()>
		//   43   87:invokestatic    #37  <Method int InternalBGHandler.access$000()>
		//   44   90:iaload          
		//   45   91:invokevirtual   #60  <Method void Bundle.putInt(String, int)>
				abundle[0].putInt("glucose_error_detail", 0);
		//   46   94:aload_2         
		//   47   95:iconst_0        
		//   48   96:aaload          
		//   49   97:ldc1            #62  <String "glucose_error_detail">
		//   50   99:iconst_0        
		//   51  100:invokevirtual   #60  <Method void Bundle.putInt(String, int)>
				abundle[0].putFloat("glucose", f);
		//   52  103:aload_2         
		//   53  104:iconst_0        
		//   54  105:aaload          
		//   55  106:ldc1            #64  <String "glucose">
		//   56  108:fload_1         
		//   57  109:invokevirtual   #68  <Method void Bundle.putFloat(String, float)>
				abundle[0].putLong("time_stamp", System.currentTimeMillis());
		//   58  112:aload_2         
		//   59  113:iconst_0        
		//   60  114:aaload          
		//   61  115:ldc1            #70  <String "time_stamp">
		//   62  117:invokestatic    #76  <Method long System.currentTimeMillis()>
		//   63  120:invokevirtual   #80  <Method void Bundle.putLong(String, long)>
				abundle[0].putInt("glucose_unit", 0x222e1);
		//   64  123:aload_2         
		//   65  124:iconst_0        
		//   66  125:aaload          
		//   67  126:ldc1            #82  <String "glucose_unit">
		//   68  128:ldc1            #83  <Int 0x222e1>
		//   69  130:invokevirtual   #60  <Method void Bundle.putInt(String, int)>
				abundle[0].putInt("sample_type", 0x15f91);
		//   70  133:aload_2         
		//   71  134:iconst_0        
		//   72  135:aaload          
		//   73  136:ldc1            #85  <String "sample_type">
		//   74  138:ldc1            #86  <Int 0x15f91>
		//   75  140:invokevirtual   #60  <Method void Bundle.putInt(String, int)>
				LOG.d(InternalBGHandler.TAG, (new StringBuilder()).append("[TBG] State : ").append(InternalBGHandler.testBGstate[InternalBGHandler.nBGState]).append(" BG value : ").append(f).toString());
		//   76  143:invokestatic    #90  <Method Class InternalBGHandler.access$200()>
		//   77  146:new             #92  <Class StringBuilder>
		//   78  149:dup             
		//   79  150:invokespecial   #93  <Method void StringBuilder()>
		//   80  153:ldc1            #95  <String "[TBG] State : ">
		//   81  155:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
		//   82  158:invokestatic    #41  <Method int[] InternalBGHandler.access$100()>
		//   83  161:invokestatic    #37  <Method int InternalBGHandler.access$000()>
		//   84  164:iaload          
		//   85  165:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
		//   86  168:ldc1            #104 <String " BG value : ">
		//   87  170:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
		//   88  173:fload_1         
		//   89  174:invokevirtual   #107 <Method StringBuilder StringBuilder.append(float)>
		//   90  177:invokevirtual   #111 <Method String StringBuilder.toString()>
		//   91  180:invokestatic    #117 <Method void LOG.d(Class, String)>
				mProfileHandlerListener.onDataReceived(3, abundle);
		//   92  183:aload_0         
		//   93  184:getfield        #13  <Field InternalBGHandler this$0>
		//   94  187:getfield        #51  <Field PrivilegeSensorProfileHandlerListener InternalBGHandler.mProfileHandlerListener>
		//   95  190:iconst_3        
		//   96  191:aload_2         
		//   97  192:invokeinterface #123 <Method void PrivilegeSensorProfileHandlerListener.onDataReceived(int, Bundle[])>
			}
			if(mDummyDataThread != null && InternalBGHandler.testBGstate[InternalBGHandler.nBGState] == 10)
		//*  98  197:aload_0         
		//*  99  198:getfield        #13  <Field InternalBGHandler this$0>
		//* 100  201:invokestatic    #127 <Method InternalBGHandler$DummyDataThread InternalBGHandler.access$300(InternalBGHandler)>
		//* 101  204:ifnull          276
		//* 102  207:invokestatic    #41  <Method int[] InternalBGHandler.access$100()>
		//* 103  210:invokestatic    #37  <Method int InternalBGHandler.access$000()>
		//* 104  213:iaload          
		//* 105  214:bipush          10
		//* 106  216:icmpne          276
			{
				mDummyDataThread.interrupt();
		//  107  219:aload_0         
		//  108  220:getfield        #13  <Field InternalBGHandler this$0>
		//  109  223:invokestatic    #127 <Method InternalBGHandler$DummyDataThread InternalBGHandler.access$300(InternalBGHandler)>
		//  110  226:invokevirtual   #130 <Method void interrupt()>
				mDummyDataThread = null;
		//  111  229:aload_0         
		//  112  230:getfield        #13  <Field InternalBGHandler this$0>
		//  113  233:aconst_null     
		//  114  234:invokestatic    #134 <Method InternalBGHandler$DummyDataThread InternalBGHandler.access$302(InternalBGHandler, InternalBGHandler$DummyDataThread)>
		//  115  237:pop             
				InternalBGHandler.nBGState = 0;
		//  116  238:iconst_0        
		//  117  239:invokestatic    #27  <Method int InternalBGHandler.access$002(int)>
		//  118  242:pop             
				return;
		//  119  243:return          
			}
			break; /* Loop/switch isn't completed */
_L2:
			Exception exception;
			if(InternalBGHandler.nBGState == 0)
		//* 120  244:invokestatic    #37  <Method int InternalBGHandler.access$000()>
		//* 121  247:ifne            267
			{
				Thread.sleep(3000L);
		//  122  250:ldc2w           #135 <Long 3000L>
		//  123  253:invokestatic    #47  <Method void Thread.sleep(long)>
				continue; /* Loop/switch isn't completed */
		//  124  256:goto            54
			}
		//* 125  259:astore_2        
		//* 126  260:aload_2         
		//* 127  261:invokevirtual   #139 <Method void Exception.printStackTrace()>
		//* 128  264:goto            54
			try
			{
				Thread.sleep(1000L);
		//  129  267:ldc2w           #140 <Long 1000L>
		//  130  270:invokestatic    #47  <Method void Thread.sleep(long)>
			}
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
			if(true) goto _L4; else goto _L3
		//  131  273:goto            54
_L3:
			int i = 
// JavaClassFileOutputException: get_constant: invalid tag

		final InternalBGHandler this$0;

		private DummyDataThread()
		{
			this$0 = InternalBGHandler.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field InternalBGHandler this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void Thread()>
		//    5    9:return          
		}

	}


	public InternalBGHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
		bListenerRegistered = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #61  <Field boolean bListenerRegistered>
		mSensorManager = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #63  <Field SensorManager mSensorManager>
		mBloogGlucoseSensor = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #65  <Field Sensor mBloogGlucoseSensor>
		raw_data_cnt = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #67  <Field int raw_data_cnt>
		mProfileHandlerListener = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #69  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
		mbloodGlucoseDevice = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #71  <Field _PrivilegeSensorDevice mbloodGlucoseDevice>
		finalData = new Bundle[1];
	//   20   34:aload_0         
	//   21   35:iconst_1        
	//   22   36:anewarray       Bundle[]
	//   23   39:putfield        #75  <Field Bundle[] finalData>
	//   24   42:return          
	}

	private boolean registerBGListener()
	{
		if(mSensorManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field SensorManager mSensorManager>
	//*   2    4:ifnull          81
		{
			mBloogGlucoseSensor = mSensorManager.getDefaultSensor(0x1001f);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #63  <Field SensorManager mSensorManager>
	//    6   12:ldc1            #26  <Int 0x1001f>
	//    7   14:invokevirtual   #98  <Method Sensor SensorManager.getDefaultSensor(int)>
	//    8   17:putfield        #65  <Field Sensor mBloogGlucoseSensor>
			bListenerRegistered = mSensorManager.registerListener(((SensorEventListener) (this)), mBloogGlucoseSensor, 3);
	//    9   20:aload_0         
	//   10   21:aload_0         
	//   11   22:getfield        #63  <Field SensorManager mSensorManager>
	//   12   25:aload_0         
	//   13   26:aload_0         
	//   14   27:getfield        #65  <Field Sensor mBloogGlucoseSensor>
	//   15   30:iconst_3        
	//   16   31:invokevirtual   #102 <Method boolean SensorManager.registerListener(SensorEventListener, Sensor, int)>
	//   17   34:putfield        #61  <Field boolean bListenerRegistered>
			Class class1 = TAG;
	//   18   37:getstatic       #49  <Field Class TAG>
	//   19   40:astore_2        
			StringBuilder stringbuilder = (new StringBuilder()).append("Internal Blood Glucose sensor was ");
	//   20   41:new             #104 <Class StringBuilder>
	//   21   44:dup             
	//   22   45:invokespecial   #105 <Method void StringBuilder()>
	//   23   48:ldc1            #107 <String "Internal Blood Glucose sensor was ">
	//   24   50:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:astore_3        
			String s;
			if(bListenerRegistered)
	//*  26   54:aload_0         
	//*  27   55:getfield        #61  <Field boolean bListenerRegistered>
	//*  28   58:ifeq            86
				s = "";
	//   29   61:ldc1            #113 <String "">
	//   30   63:astore_1        
			else
	//*  31   64:aload_2         
	//*  32   65:aload_3         
	//*  33   66:aload_1         
	//*  34   67:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//*  35   70:ldc1            #115 <String "registered">
	//*  36   72:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//*  37   75:invokevirtual   #119 <Method String StringBuilder.toString()>
	//*  38   78:invokestatic    #125 <Method void LOG.d(Class, String)>
	//*  39   81:aload_0         
	//*  40   82:getfield        #61  <Field boolean bListenerRegistered>
	//*  41   85:ireturn         
				s = "not ";
	//   42   86:ldc1            #127 <String "not ">
	//   43   88:astore_1        
			LOG.d(class1, stringbuilder.append(s).append("registered").toString());
		}
		return bListenerRegistered;
	//*  44   89:goto            64
	}

	private void setTestMode()
	{
		if((new File(Environment.getExternalStorageDirectory(), "BGTest.txt")).exists() && "eng".equals(((Object) (Build.TYPE))))
	//*   0    0:new             #130 <Class File>
	//*   1    3:dup             
	//*   2    4:invokestatic    #136 <Method File Environment.getExternalStorageDirectory()>
	//*   3    7:ldc1            #138 <String "BGTest.txt">
	//*   4    9:invokespecial   #141 <Method void File(File, String)>
	//*   5   12:invokevirtual   #144 <Method boolean File.exists()>
	//*   6   15:ifeq            42
	//*   7   18:ldc1            #146 <String "eng">
	//*   8   20:getstatic       #152 <Field String Build.TYPE>
	//*   9   23:invokevirtual   #158 <Method boolean String.equals(Object)>
	//*  10   26:ifeq            42
		{
			LOG.d(TAG, "BG Test mode is enabled");
	//   11   29:getstatic       #49  <Field Class TAG>
	//   12   32:ldc1            #160 <String "BG Test mode is enabled">
	//   13   34:invokestatic    #125 <Method void LOG.d(Class, String)>
			TEST_FLAG = true;
	//   14   37:iconst_1        
	//   15   38:putstatic       #51  <Field boolean TEST_FLAG>
			return;
	//   16   41:return          
		} else
		{
			TEST_FLAG = false;
	//   17   42:iconst_0        
	//   18   43:putstatic       #51  <Field boolean TEST_FLAG>
			return;
	//   19   46:return          
		}
	}

	private void unregisterBGListener()
	{
		LOG.d(TAG, (new StringBuilder()).append("unregisterBGListener : current state : ").append(bListenerRegistered).toString());
	//    0    0:getstatic       #49  <Field Class TAG>
	//    1    3:new             #104 <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #105 <Method void StringBuilder()>
	//    4   10:ldc1            #163 <String "unregisterBGListener : current state : ">
	//    5   12:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_0         
	//    7   16:getfield        #61  <Field boolean bListenerRegistered>
	//    8   19:invokevirtual   #166 <Method StringBuilder StringBuilder.append(boolean)>
	//    9   22:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   10   25:invokestatic    #125 <Method void LOG.d(Class, String)>
		if(mSensorManager != null)
	//*  11   28:aload_0         
	//*  12   29:getfield        #63  <Field SensorManager mSensorManager>
	//*  13   32:ifnull          56
		{
			LOG.d(TAG, "Internal Blood Glucose sensor is unregistered");
	//   14   35:getstatic       #49  <Field Class TAG>
	//   15   38:ldc1            #168 <String "Internal Blood Glucose sensor is unregistered">
	//   16   40:invokestatic    #125 <Method void LOG.d(Class, String)>
			mSensorManager.unregisterListener(((SensorEventListener) (this)));
	//   17   43:aload_0         
	//   18   44:getfield        #63  <Field SensorManager mSensorManager>
	//   19   47:aload_0         
	//   20   48:invokevirtual   #172 <Method void SensorManager.unregisterListener(SensorEventListener)>
			bListenerRegistered = false;
	//   21   51:aload_0         
	//   22   52:iconst_0        
	//   23   53:putfield        #61  <Field boolean bListenerRegistered>
		}
	//   24   56:return          
	}

	public void deinitialize()
	{
		LOG.d(TAG, (new StringBuilder()).append("deinitialize is called - bListenerRegistered : ").append(bListenerRegistered).toString());
	//    0    0:getstatic       #49  <Field Class TAG>
	//    1    3:new             #104 <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #105 <Method void StringBuilder()>
	//    4   10:ldc1            #175 <String "deinitialize is called - bListenerRegistered : ">
	//    5   12:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_0         
	//    7   16:getfield        #61  <Field boolean bListenerRegistered>
	//    8   19:invokevirtual   #166 <Method StringBuilder StringBuilder.append(boolean)>
	//    9   22:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   10   25:invokestatic    #125 <Method void LOG.d(Class, String)>
		if(bListenerRegistered)
	//*  11   28:aload_0         
	//*  12   29:getfield        #61  <Field boolean bListenerRegistered>
	//*  13   32:ifeq            39
			unregisterBGListener();
	//   14   35:aload_0         
	//   15   36:invokespecial   #177 <Method void unregisterBGListener()>
	//   16   39:return          
	}

	public _PrivilegeSensorDevice getDevice()
	{
		return mbloodGlucoseDevice;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field _PrivilegeSensorDevice mbloodGlucoseDevice>
	//    2    4:areturn         
	}

	public int initialize(Context context, PrivilegeSensorProfileHandlerListener privilegesensorprofilehandlerlistener, _PrivilegeSensorDevice _pprivilegesensordevice, Object obj)
	{
		mContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #183 <Field Context mContext>
		mbloodGlucoseDevice = _pprivilegesensordevice;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #71  <Field _PrivilegeSensorDevice mbloodGlucoseDevice>
		mProfileHandlerListener = privilegesensorprofilehandlerlistener;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #69  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
		mSensorManager = (SensorManager)context.getSystemService("sensor");
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:ldc1            #185 <String "sensor">
	//   12   19:invokevirtual   #191 <Method Object Context.getSystemService(String)>
	//   13   22:checkcast       #94  <Class SensorManager>
	//   14   25:putfield        #63  <Field SensorManager mSensorManager>
		setTestMode();
	//   15   28:aload_0         
	//   16   29:invokespecial   #193 <Method void setTestMode()>
		return 0;
	//   17   32:iconst_0        
	//   18   33:ireturn         
	}

	public void onAccuracyChanged(Sensor sensor, int i)
	{
	//    0    0:return          
	}

	public void onSensorChanged(SensorEvent sensorevent)
	{
		if(sensorevent != null && sensorevent.sensor.getType() == 0x1001f && raw_data_cnt < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          378
	//*   2    4:aload_1         
	//*   3    5:getfield        #201 <Field Sensor SensorEvent.sensor>
	//*   4    8:invokevirtual   #206 <Method int Sensor.getType()>
	//*   5   11:ldc1            #26  <Int 0x1001f>
	//*   6   13:icmpne          378
	//*   7   16:aload_0         
	//*   8   17:getfield        #67  <Field int raw_data_cnt>
	//*   9   20:iconst_1        
	//*  10   21:icmpge          378
		{
			LOG.d(TAG, (new StringBuilder()).append("IBG onSensorChanged 0 element : ").append(sensorevent.values[0]).toString());
	//   11   24:getstatic       #49  <Field Class TAG>
	//   12   27:new             #104 <Class StringBuilder>
	//   13   30:dup             
	//   14   31:invokespecial   #105 <Method void StringBuilder()>
	//   15   34:ldc1            #208 <String "IBG onSensorChanged 0 element : ">
	//   16   36:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   17   39:aload_1         
	//   18   40:getfield        #212 <Field float[] SensorEvent.values>
	//   19   43:iconst_0        
	//   20   44:faload          
	//   21   45:invokevirtual   #215 <Method StringBuilder StringBuilder.append(float)>
	//   22   48:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   23   51:invokestatic    #125 <Method void LOG.d(Class, String)>
			LOG.d(TAG, (new StringBuilder()).append("IBG onSensorChanged 1 element : ").append(sensorevent.values[1]).toString());
	//   24   54:getstatic       #49  <Field Class TAG>
	//   25   57:new             #104 <Class StringBuilder>
	//   26   60:dup             
	//   27   61:invokespecial   #105 <Method void StringBuilder()>
	//   28   64:ldc1            #217 <String "IBG onSensorChanged 1 element : ">
	//   29   66:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   30   69:aload_1         
	//   31   70:getfield        #212 <Field float[] SensorEvent.values>
	//   32   73:iconst_1        
	//   33   74:faload          
	//   34   75:invokevirtual   #215 <Method StringBuilder StringBuilder.append(float)>
	//   35   78:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   36   81:invokestatic    #125 <Method void LOG.d(Class, String)>
			LOG.d(TAG, (new StringBuilder()).append("IBG onSensorChanged 2 element : ").append(sensorevent.values[2]).toString());
	//   37   84:getstatic       #49  <Field Class TAG>
	//   38   87:new             #104 <Class StringBuilder>
	//   39   90:dup             
	//   40   91:invokespecial   #105 <Method void StringBuilder()>
	//   41   94:ldc1            #219 <String "IBG onSensorChanged 2 element : ">
	//   42   96:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   43   99:aload_1         
	//   44  100:getfield        #212 <Field float[] SensorEvent.values>
	//   45  103:iconst_2        
	//   46  104:faload          
	//   47  105:invokevirtual   #215 <Method StringBuilder StringBuilder.append(float)>
	//   48  108:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   49  111:invokestatic    #125 <Method void LOG.d(Class, String)>
			LOG.d(TAG, (new StringBuilder()).append("IBG onSensorChanged 3 element : ").append(sensorevent.values[3]).toString());
	//   50  114:getstatic       #49  <Field Class TAG>
	//   51  117:new             #104 <Class StringBuilder>
	//   52  120:dup             
	//   53  121:invokespecial   #105 <Method void StringBuilder()>
	//   54  124:ldc1            #221 <String "IBG onSensorChanged 3 element : ">
	//   55  126:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   56  129:aload_1         
	//   57  130:getfield        #212 <Field float[] SensorEvent.values>
	//   58  133:iconst_3        
	//   59  134:faload          
	//   60  135:invokevirtual   #215 <Method StringBuilder StringBuilder.append(float)>
	//   61  138:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   62  141:invokestatic    #125 <Method void LOG.d(Class, String)>
			LOG.d(TAG, (new StringBuilder()).append("IBG onSensorChanged 4 element : ").append(sensorevent.values[4]).toString());
	//   63  144:getstatic       #49  <Field Class TAG>
	//   64  147:new             #104 <Class StringBuilder>
	//   65  150:dup             
	//   66  151:invokespecial   #105 <Method void StringBuilder()>
	//   67  154:ldc1            #223 <String "IBG onSensorChanged 4 element : ">
	//   68  156:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   69  159:aload_1         
	//   70  160:getfield        #212 <Field float[] SensorEvent.values>
	//   71  163:iconst_4        
	//   72  164:faload          
	//   73  165:invokevirtual   #215 <Method StringBuilder StringBuilder.append(float)>
	//   74  168:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   75  171:invokestatic    #125 <Method void LOG.d(Class, String)>
			LOG.d(TAG, (new StringBuilder()).append("IBG onSensorChanged 5 element : ").append(sensorevent.values.length).toString());
	//   76  174:getstatic       #49  <Field Class TAG>
	//   77  177:new             #104 <Class StringBuilder>
	//   78  180:dup             
	//   79  181:invokespecial   #105 <Method void StringBuilder()>
	//   80  184:ldc1            #225 <String "IBG onSensorChanged 5 element : ">
	//   81  186:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   82  189:aload_1         
	//   83  190:getfield        #212 <Field float[] SensorEvent.values>
	//   84  193:arraylength     
	//   85  194:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   86  197:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   87  200:invokestatic    #125 <Method void LOG.d(Class, String)>
			if(mProfileHandlerListener != null)
	//*  88  203:aload_0         
	//*  89  204:getfield        #69  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//*  90  207:ifnull          378
			{
				finalData[raw_data_cnt] = new Bundle();
	//   91  210:aload_0         
	//   92  211:getfield        #75  <Field Bundle[] finalData>
	//   93  214:aload_0         
	//   94  215:getfield        #67  <Field int raw_data_cnt>
	//   95  218:new             #73  <Class Bundle>
	//   96  221:dup             
	//   97  222:invokespecial   #229 <Method void Bundle()>
	//   98  225:aastore         
				finalData[raw_data_cnt].putInt("glucose_sensor_state", (int)sensorevent.values[0]);
	//   99  226:aload_0         
	//  100  227:getfield        #75  <Field Bundle[] finalData>
	//  101  230:aload_0         
	//  102  231:getfield        #67  <Field int raw_data_cnt>
	//  103  234:aaload          
	//  104  235:ldc1            #231 <String "glucose_sensor_state">
	//  105  237:aload_1         
	//  106  238:getfield        #212 <Field float[] SensorEvent.values>
	//  107  241:iconst_0        
	//  108  242:faload          
	//  109  243:f2i             
	//  110  244:invokevirtual   #235 <Method void Bundle.putInt(String, int)>
				finalData[raw_data_cnt].putInt("glucose_error_detail", (int)sensorevent.values[1]);
	//  111  247:aload_0         
	//  112  248:getfield        #75  <Field Bundle[] finalData>
	//  113  251:aload_0         
	//  114  252:getfield        #67  <Field int raw_data_cnt>
	//  115  255:aaload          
	//  116  256:ldc1            #237 <String "glucose_error_detail">
	//  117  258:aload_1         
	//  118  259:getfield        #212 <Field float[] SensorEvent.values>
	//  119  262:iconst_1        
	//  120  263:faload          
	//  121  264:f2i             
	//  122  265:invokevirtual   #235 <Method void Bundle.putInt(String, int)>
				finalData[raw_data_cnt].putFloat("glucose", sensorevent.values[4]);
	//  123  268:aload_0         
	//  124  269:getfield        #75  <Field Bundle[] finalData>
	//  125  272:aload_0         
	//  126  273:getfield        #67  <Field int raw_data_cnt>
	//  127  276:aaload          
	//  128  277:ldc1            #239 <String "glucose">
	//  129  279:aload_1         
	//  130  280:getfield        #212 <Field float[] SensorEvent.values>
	//  131  283:iconst_4        
	//  132  284:faload          
	//  133  285:invokevirtual   #243 <Method void Bundle.putFloat(String, float)>
				finalData[raw_data_cnt].putLong("time_stamp", System.currentTimeMillis());
	//  134  288:aload_0         
	//  135  289:getfield        #75  <Field Bundle[] finalData>
	//  136  292:aload_0         
	//  137  293:getfield        #67  <Field int raw_data_cnt>
	//  138  296:aaload          
	//  139  297:ldc1            #245 <String "time_stamp">
	//  140  299:invokestatic    #251 <Method long System.currentTimeMillis()>
	//  141  302:invokevirtual   #255 <Method void Bundle.putLong(String, long)>
				finalData[raw_data_cnt].putInt("glucose_unit", 0x222e1);
	//  142  305:aload_0         
	//  143  306:getfield        #75  <Field Bundle[] finalData>
	//  144  309:aload_0         
	//  145  310:getfield        #67  <Field int raw_data_cnt>
	//  146  313:aaload          
	//  147  314:ldc2            #257 <String "glucose_unit">
	//  148  317:ldc2            #258 <Int 0x222e1>
	//  149  320:invokevirtual   #235 <Method void Bundle.putInt(String, int)>
				finalData[raw_data_cnt].putInt("sample_type", 0x15f91);
	//  150  323:aload_0         
	//  151  324:getfield        #75  <Field Bundle[] finalData>
	//  152  327:aload_0         
	//  153  328:getfield        #67  <Field int raw_data_cnt>
	//  154  331:aaload          
	//  155  332:ldc2            #260 <String "sample_type">
	//  156  335:ldc2            #261 <Int 0x15f91>
	//  157  338:invokevirtual   #235 <Method void Bundle.putInt(String, int)>
				raw_data_cnt = raw_data_cnt + 1;
	//  158  341:aload_0         
	//  159  342:aload_0         
	//  160  343:getfield        #67  <Field int raw_data_cnt>
	//  161  346:iconst_1        
	//  162  347:iadd            
	//  163  348:putfield        #67  <Field int raw_data_cnt>
				if(raw_data_cnt >= 1)
	//* 164  351:aload_0         
	//* 165  352:getfield        #67  <Field int raw_data_cnt>
	//* 166  355:iconst_1        
	//* 167  356:icmplt          378
				{
					mProfileHandlerListener.onDataReceived(3, finalData);
	//  168  359:aload_0         
	//  169  360:getfield        #69  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//  170  363:iconst_3        
	//  171  364:aload_0         
	//  172  365:getfield        #75  <Field Bundle[] finalData>
	//  173  368:invokeinterface #267 <Method void PrivilegeSensorProfileHandlerListener.onDataReceived(int, Bundle[])>
					raw_data_cnt = 0;
	//  174  373:aload_0         
	//  175  374:iconst_0        
	//  176  375:putfield        #67  <Field int raw_data_cnt>
				}
			}
		}
	//  177  378:return          
	}

	public int startReceivingData()
	{
		int i = 1;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		LOG.d(TAG, (new StringBuilder()).append("startReceivingData is called - bListenerRegistered : ").append(bListenerRegistered).toString());
	//    2    2:getstatic       #49  <Field Class TAG>
	//    3    5:new             #104 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #105 <Method void StringBuilder()>
	//    6   12:ldc2            #270 <String "startReceivingData is called - bListenerRegistered : ">
	//    7   15:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:aload_0         
	//    9   19:getfield        #61  <Field boolean bListenerRegistered>
	//   10   22:invokevirtual   #166 <Method StringBuilder StringBuilder.append(boolean)>
	//   11   25:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   12   28:invokestatic    #125 <Method void LOG.d(Class, String)>
		raw_data_cnt = 0;
	//   13   31:aload_0         
	//   14   32:iconst_0        
	//   15   33:putfield        #67  <Field int raw_data_cnt>
		if(!bListenerRegistered)
	//*  16   36:aload_0         
	//*  17   37:getfield        #61  <Field boolean bListenerRegistered>
	//*  18   40:ifne            92
		{
			registerBGListener();
	//   19   43:aload_0         
	//   20   44:invokespecial   #272 <Method boolean registerBGListener()>
	//   21   47:pop             
			if(TEST_FLAG)
	//*  22   48:getstatic       #51  <Field boolean TEST_FLAG>
	//*  23   51:ifeq            92
			{
				bListenerRegistered = true;
	//   24   54:aload_0         
	//   25   55:iconst_1        
	//   26   56:putfield        #61  <Field boolean bListenerRegistered>
				mProfileHandlerListener.onDataStarted(3, 0);
	//   27   59:aload_0         
	//   28   60:getfield        #69  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//   29   63:iconst_3        
	//   30   64:iconst_0        
	//   31   65:invokeinterface #276 <Method void PrivilegeSensorProfileHandlerListener.onDataStarted(int, int)>
				mDummyDataThread = new ((DummyDataThread)this).DummyDataThread();
	//   32   70:aload_0         
	//   33   71:new             #12  <Class InternalBGHandler$DummyDataThread>
	//   34   74:dup             
	//   35   75:aload_0         
	//   36   76:aconst_null     
	//   37   77:invokespecial   #279 <Method void InternalBGHandler$DummyDataThread(InternalBGHandler, InternalBGHandler$1)>
	//   38   80:putfield        #88  <Field InternalBGHandler$DummyDataThread mDummyDataThread>
				mDummyDataThread.start();
	//   39   83:aload_0         
	//   40   84:getfield        #88  <Field InternalBGHandler$DummyDataThread mDummyDataThread>
	//   41   87:invokevirtual   #282 <Method void InternalBGHandler$DummyDataThread.start()>
				return 0;
	//   42   90:iconst_0        
	//   43   91:ireturn         
			}
		}
		PrivilegeSensorProfileHandlerListener privilegesensorprofilehandlerlistener = mProfileHandlerListener;
	//   44   92:aload_0         
	//   45   93:getfield        #69  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//   46   96:astore_2        
		if(bListenerRegistered)
	//*  47   97:aload_0         
	//*  48   98:getfield        #61  <Field boolean bListenerRegistered>
	//*  49  101:ifeq            106
			i = 0;
	//   50  104:iconst_0        
	//   51  105:istore_1        
		privilegesensorprofilehandlerlistener.onDataStarted(3, i);
	//   52  106:aload_2         
	//   53  107:iconst_3        
	//   54  108:iload_1         
	//   55  109:invokeinterface #276 <Method void PrivilegeSensorProfileHandlerListener.onDataStarted(int, int)>
		return 0;
	//   56  114:iconst_0        
	//   57  115:ireturn         
	}

	public int stopReceivingData()
	{
		LOG.d(TAG, (new StringBuilder()).append("stopReceivingData is called - bListenerRegistered : ").append(bListenerRegistered).toString());
	//    0    0:getstatic       #49  <Field Class TAG>
	//    1    3:new             #104 <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #105 <Method void StringBuilder()>
	//    4   10:ldc2            #285 <String "stopReceivingData is called - bListenerRegistered : ">
	//    5   13:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//    6   16:aload_0         
	//    7   17:getfield        #61  <Field boolean bListenerRegistered>
	//    8   20:invokevirtual   #166 <Method StringBuilder StringBuilder.append(boolean)>
	//    9   23:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   10   26:invokestatic    #125 <Method void LOG.d(Class, String)>
		if(mDummyDataThread != null)
	//*  11   29:aload_0         
	//*  12   30:getfield        #88  <Field InternalBGHandler$DummyDataThread mDummyDataThread>
	//*  13   33:ifnull          53
		{
			mDummyDataThread.interrupt();
	//   14   36:aload_0         
	//   15   37:getfield        #88  <Field InternalBGHandler$DummyDataThread mDummyDataThread>
	//   16   40:invokevirtual   #288 <Method void InternalBGHandler$DummyDataThread.interrupt()>
			mDummyDataThread = null;
	//   17   43:aload_0         
	//   18   44:aconst_null     
	//   19   45:putfield        #88  <Field InternalBGHandler$DummyDataThread mDummyDataThread>
			bListenerRegistered = false;
	//   20   48:aload_0         
	//   21   49:iconst_0        
	//   22   50:putfield        #61  <Field boolean bListenerRegistered>
		}
		unregisterBGListener();
	//   23   53:aload_0         
	//   24   54:invokespecial   #177 <Method void unregisterBGListener()>
		raw_data_cnt = 0;
	//   25   57:aload_0         
	//   26   58:iconst_0        
	//   27   59:putfield        #67  <Field int raw_data_cnt>
		mProfileHandlerListener.onDataStopped(3, 0);
	//   28   62:aload_0         
	//   29   63:getfield        #69  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//   30   66:iconst_3        
	//   31   67:iconst_0        
	//   32   68:invokeinterface #291 <Method void PrivilegeSensorProfileHandlerListener.onDataStopped(int, int)>
		return 0;
	//   33   73:iconst_0        
	//   34   74:ireturn         
	}

	private static final int CACHED_DATA_INTERVAL_CNT = 1;
	private static final Class TAG = com/sec/android/service/health/sensor/handler/bloodglucose/InternalBGHandler;
	private static boolean TEST_FLAG = false;
	private static final int TYPE_BASE = 0x10000;
	public static final int TYPE_BLOOD_GLUCOSE = 0x1001f;
	private static int nBGState = 0;
	private static int testBGstate[] = {
		1, 2, 3, 0, 10
	};
	private boolean bListenerRegistered;
	Bundle finalData[];
	private Sensor mBloogGlucoseSensor;
	Context mContext;
	private DummyDataThread mDummyDataThread;
	PrivilegeSensorProfileHandlerListener mProfileHandlerListener;
	private SensorManager mSensorManager;
	_PrivilegeSensorDevice mbloodGlucoseDevice;
	private int raw_data_cnt;

	static 
	{
	//    0    0:ldc1            #2   <Class InternalBGHandler>
	//    1    2:putstatic       #49  <Field Class TAG>
		TEST_FLAG = false;
	//    2    5:iconst_0        
	//    3    6:putstatic       #51  <Field boolean TEST_FLAG>
	//    4    9:iconst_5        
	//    5   10:newarray        int[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:iconst_1        
	//    9   15:iastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:iconst_2        
	//   13   19:iastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:iconst_3        
	//   17   23:iastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:iconst_0        
	//   21   27:iastore         
	//   22   28:dup             
	//   23   29:iconst_4        
	//   24   30:bipush          10
	//   25   32:iastore         
	//   26   33:putstatic       #53  <Field int[] testBGstate>
	//   27   36:iconst_0        
	//   28   37:putstatic       #55  <Field int nBGState>
	//*  29   40:return          
	}


/*
	static int access$000()
	{
		return nBGState;
	//    0    0:getstatic       #55  <Field int nBGState>
	//    1    3:ireturn         
	}

*/


/*
	static int access$002(int i)
	{
		nBGState = i;
	//    0    0:iload_0         
	//    1    1:putstatic       #55  <Field int nBGState>
		return i;
	//    2    4:iload_0         
	//    3    5:ireturn         
	}

*/


/*
	static int access$008()
	{
		int i = nBGState;
	//    0    0:getstatic       #55  <Field int nBGState>
	//    1    3:istore_0        
		nBGState = i + 1;
	//    2    4:iload_0         
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putstatic       #55  <Field int nBGState>
		return i;
	//    6   10:iload_0         
	//    7   11:ireturn         
	}

*/


/*
	static int[] access$100()
	{
		return testBGstate;
	//    0    0:getstatic       #53  <Field int[] testBGstate>
	//    1    3:areturn         
	}

*/


/*
	static Class access$200()
	{
		return TAG;
	//    0    0:getstatic       #49  <Field Class TAG>
	//    1    3:areturn         
	}

*/


/*
	static DummyDataThread access$300(InternalBGHandler internalbghandler)
	{
		return internalbghandler.mDummyDataThread;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field InternalBGHandler$DummyDataThread mDummyDataThread>
	//    2    4:areturn         
	}

*/


/*
	static DummyDataThread access$302(InternalBGHandler internalbghandler, DummyDataThread dummydatathread)
	{
		internalbghandler.mDummyDataThread = dummydatathread;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field InternalBGHandler$DummyDataThread mDummyDataThread>
		return dummydatathread;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
