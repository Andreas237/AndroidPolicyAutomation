// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework.device;

import android.content.Context;
import android.text.TextUtils;
import com.samsung.android.sensor.data.*;
import com.sec.android.sensor.framework.SensorCallbackManager;
import com.sec.android.service.health.util.LOG;
import java.util.*;

public abstract class SensorDevice
{

	public transient SensorDevice(Context context, String s, int i, com.samsung.android.sensor.data.SensorTypes.SensorConnectionType sensorconnectiontype, String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		mContext = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #36  <Field Context mContext>
		mId = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #38  <Field String mId>
		mDataType = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #40  <Field int mDataType>
		mConnectionType = com.samsung.android.sensor.data.SensorTypes.SensorConnectionType.SENSOR_CONNECTION_TYPE_NONE;
	//   11   19:aload_0         
	//   12   20:getstatic       #45  <Field com.samsung.android.sensor.data.SensorTypes$SensorConnectionType com.samsung.android.sensor.data.SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_NONE>
	//   13   23:putfield        #47  <Field com.samsung.android.sensor.data.SensorTypes$SensorConnectionType mConnectionType>
		mDeviceName = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #49  <Field String mDeviceName>
		mDeviceInfo = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #51  <Field SensorDeviceInfo mDeviceInfo>
		mAccessConnectorInfoMap = new HashMap();
	//   20   36:aload_0         
	//   21   37:new             #53  <Class HashMap>
	//   22   40:dup             
	//   23   41:invokespecial   #54  <Method void HashMap()>
	//   24   44:putfield        #56  <Field HashMap mAccessConnectorInfoMap>
		mDataReceivingConnectorInfoMap = new HashMap();
	//   25   47:aload_0         
	//   26   48:new             #53  <Class HashMap>
	//   27   51:dup             
	//   28   52:invokespecial   #54  <Method void HashMap()>
	//   29   55:putfield        #58  <Field HashMap mDataReceivingConnectorInfoMap>
		mDeviceState = 2;
	//   30   58:aload_0         
	//   31   59:iconst_2        
	//   32   60:putfield        #60  <Field int mDeviceState>
		isAccessPending = false;
	//   33   63:aload_0         
	//   34   64:iconst_0        
	//   35   65:putfield        #62  <Field boolean isAccessPending>
		LOG.i(TAG, "SensorDevice()");
	//   36   68:getstatic       #29  <Field Class TAG>
	//   37   71:ldc1            #64  <String "SensorDevice()">
	//   38   73:invokestatic    #70  <Method void LOG.i(Class, String)>
		if(context == null)
	//*  39   76:aload_1         
	//*  40   77:ifnonnull       89
		{
			LOG.e(TAG, "SensorDevice() Context is null !!!");
	//   41   80:getstatic       #29  <Field Class TAG>
	//   42   83:ldc1            #72  <String "SensorDevice() Context is null !!!">
	//   43   85:invokestatic    #75  <Method void LOG.e(Class, String)>
			return;
	//   44   88:return          
		}
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  45   89:aload_2         
	//*  46   90:invokestatic    #81  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  47   93:iconst_1        
	//*  48   94:icmpne          105
			LOG.w(TAG, "SensorDevice() String id is null");
	//   49   97:getstatic       #29  <Field Class TAG>
	//   50  100:ldc1            #83  <String "SensorDevice() String id is null">
	//   51  102:invokestatic    #86  <Method void LOG.w(Class, String)>
		mContext = context;
	//   52  105:aload_0         
	//   53  106:aload_1         
	//   54  107:putfield        #36  <Field Context mContext>
		mId = s;
	//   55  110:aload_0         
	//   56  111:aload_2         
	//   57  112:putfield        #38  <Field String mId>
		mDataType = i;
	//   58  115:aload_0         
	//   59  116:iload_3         
	//   60  117:putfield        #40  <Field int mDataType>
		mConnectionType = sensorconnectiontype;
	//   61  120:aload_0         
	//   62  121:aload           4
	//   63  123:putfield        #47  <Field com.samsung.android.sensor.data.SensorTypes$SensorConnectionType mConnectionType>
		if(as.length == 0)
	//*  64  126:aload           5
	//*  65  128:arraylength     
	//*  66  129:ifne            161
			context = null;
	//   67  132:aconst_null     
	//   68  133:astore_1        
		else
	//*  69  134:aload_0         
	//*  70  135:aload_1         
	//*  71  136:putfield        #49  <Field String mDeviceName>
	//*  72  139:aload_0         
	//*  73  140:new             #88  <Class SensorDeviceInfo>
	//*  74  143:dup             
	//*  75  144:aload_2         
	//*  76  145:iload_3         
	//*  77  146:aload           4
	//*  78  148:aload_0         
	//*  79  149:getfield        #49  <Field String mDeviceName>
	//*  80  152:aconst_null     
	//*  81  153:iconst_0        
	//*  82  154:invokespecial   #91  <Method void SensorDeviceInfo(String, int, com.samsung.android.sensor.data.SensorTypes$SensorConnectionType, String, String, int)>
	//*  83  157:putfield        #51  <Field SensorDeviceInfo mDeviceInfo>
	//*  84  160:return          
			context = ((Context) (as[0]));
	//   85  161:aload           5
	//   86  163:iconst_0        
	//   87  164:aaload          
	//   88  165:astore_1        
		mDeviceName = ((String) (context));
		mDeviceInfo = new SensorDeviceInfo(s, i, sensorconnectiontype, mDeviceName, ((String) (null)), 0);
	//*  89  166:goto            134
	}

	private void notifyAccessSuccess(SensorConnectorInfo sensorconnectorinfo)
	{
		SensorCallbackManager.getInstance().invokeDeviceAccessResultComeCallback(sensorconnectorinfo.getName(), mDeviceInfo, com.samsung.android.sensor.data.SensorTypes.AccessResultCode.ACCESS_CODE_SUCCESS.ordinal());
	//    0    0:invokestatic    #99  <Method SensorCallbackManager SensorCallbackManager.getInstance()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #105 <Method String SensorConnectorInfo.getName()>
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field SensorDeviceInfo mDeviceInfo>
	//    5   11:getstatic       #111 <Field com.samsung.android.sensor.data.SensorTypes$AccessResultCode com.samsung.android.sensor.data.SensorTypes$AccessResultCode.ACCESS_CODE_SUCCESS>
	//    6   14:invokevirtual   #115 <Method int com.samsung.android.sensor.data.SensorTypes$AccessResultCode.ordinal()>
	//    7   17:invokevirtual   #119 <Method void SensorCallbackManager.invokeDeviceAccessResultComeCallback(String, SensorDeviceInfo, int)>
	//    8   20:return          
	}

	public void access(SensorConnectorInfo sensorconnectorinfo)
	{
		LOG.i(TAG, "access()");
	//    0    0:getstatic       #29  <Field Class TAG>
	//    1    3:ldc1            #122 <String "access()">
	//    2    5:invokestatic    #70  <Method void LOG.i(Class, String)>
		if(sensorconnectorinfo == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       21
		{
			LOG.e(TAG, "access() SensorConnectorInfo is null !!!");
	//    5   12:getstatic       #29  <Field Class TAG>
	//    6   15:ldc1            #124 <String "access() SensorConnectorInfo is null !!!">
	//    7   17:invokestatic    #75  <Method void LOG.e(Class, String)>
			return;
	//    8   20:return          
		}
		int i = mAccessConnectorInfoMap.size();
	//    9   21:aload_0         
	//   10   22:getfield        #56  <Field HashMap mAccessConnectorInfoMap>
	//   11   25:invokevirtual   #127 <Method int HashMap.size()>
	//   12   28:istore_2        
		LOG.d(TAG, (new StringBuilder()).append("access() connector count = ").append(i).toString());
	//   13   29:getstatic       #29  <Field Class TAG>
	//   14   32:new             #129 <Class StringBuilder>
	//   15   35:dup             
	//   16   36:invokespecial   #130 <Method void StringBuilder()>
	//   17   39:ldc1            #132 <String "access() connector count = ">
	//   18   41:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   19   44:iload_2         
	//   20   45:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
	//   21   48:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   22   51:invokestatic    #145 <Method void LOG.d(Class, String)>
		if(mAccessConnectorInfoMap.get(((Object) (sensorconnectorinfo.getName()))) != null)
	//*  23   54:aload_0         
	//*  24   55:getfield        #56  <Field HashMap mAccessConnectorInfoMap>
	//*  25   58:aload_1         
	//*  26   59:invokevirtual   #105 <Method String SensorConnectorInfo.getName()>
	//*  27   62:invokevirtual   #149 <Method Object HashMap.get(Object)>
	//*  28   65:ifnull          77
		{
			LOG.w(TAG, "Already accessed connector!!");
	//   29   68:getstatic       #29  <Field Class TAG>
	//   30   71:ldc1            #151 <String "Already accessed connector!!">
	//   31   73:invokestatic    #86  <Method void LOG.w(Class, String)>
			return;
	//   32   76:return          
		}
		if(i < 1)
	//*  33   77:iload_2         
	//*  34   78:iconst_1        
	//*  35   79:icmpge          93
		{
			accessSensor(sensorconnectorinfo);
	//   36   82:aload_0         
	//   37   83:aload_1         
	//   38   84:invokevirtual   #154 <Method void accessSensor(SensorConnectorInfo)>
			isAccessPending = true;
	//   39   87:aload_0         
	//   40   88:iconst_1        
	//   41   89:putfield        #62  <Field boolean isAccessPending>
			return;
	//   42   92:return          
		} else
		{
			notifyAccessSuccess(sensorconnectorinfo);
	//   43   93:aload_0         
	//   44   94:aload_1         
	//   45   95:invokespecial   #156 <Method void notifyAccessSuccess(SensorConnectorInfo)>
			mAccessConnectorInfoMap.put(((Object) (sensorconnectorinfo.getName())), ((Object) (sensorconnectorinfo)));
	//   46   98:aload_0         
	//   47   99:getfield        #56  <Field HashMap mAccessConnectorInfoMap>
	//   48  102:aload_1         
	//   49  103:invokevirtual   #105 <Method String SensorConnectorInfo.getName()>
	//   50  106:aload_1         
	//   51  107:invokevirtual   #160 <Method Object HashMap.put(Object, Object)>
	//   52  110:pop             
			return;
	//   53  111:return          
		}
	}

	public abstract void accessSensor(SensorConnectorInfo sensorconnectorinfo);

	public void addListener(SensorConnectorInfo sensorconnectorinfo)
	{
		LOG.i(TAG, "addListener()");
	//    0    0:getstatic       #29  <Field Class TAG>
	//    1    3:ldc1            #163 <String "addListener()">
	//    2    5:invokestatic    #70  <Method void LOG.i(Class, String)>
		if(sensorconnectorinfo == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       21
		{
			LOG.e(TAG, "addListener() SensorConnectorInfo is null !!!");
	//    5   12:getstatic       #29  <Field Class TAG>
	//    6   15:ldc1            #165 <String "addListener() SensorConnectorInfo is null !!!">
	//    7   17:invokestatic    #75  <Method void LOG.e(Class, String)>
			return;
	//    8   20:return          
		}
		int i = mDataReceivingConnectorInfoMap.size();
	//    9   21:aload_0         
	//   10   22:getfield        #58  <Field HashMap mDataReceivingConnectorInfoMap>
	//   11   25:invokevirtual   #127 <Method int HashMap.size()>
	//   12   28:istore_2        
		LOG.d(TAG, (new StringBuilder()).append("addListener() connector count = ").append(i).toString());
	//   13   29:getstatic       #29  <Field Class TAG>
	//   14   32:new             #129 <Class StringBuilder>
	//   15   35:dup             
	//   16   36:invokespecial   #130 <Method void StringBuilder()>
	//   17   39:ldc1            #167 <String "addListener() connector count = ">
	//   18   41:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   19   44:iload_2         
	//   20   45:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
	//   21   48:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   22   51:invokestatic    #145 <Method void LOG.d(Class, String)>
		if(i == 0)
	//*  23   54:iload_2         
	//*  24   55:ifne            62
			startSensor();
	//   25   58:aload_0         
	//   26   59:invokevirtual   #170 <Method void startSensor()>
		if(mDataReceivingConnectorInfoMap.containsKey(((Object) (sensorconnectorinfo.getName()))))
	//*  27   62:aload_0         
	//*  28   63:getfield        #58  <Field HashMap mDataReceivingConnectorInfoMap>
	//*  29   66:aload_1         
	//*  30   67:invokevirtual   #105 <Method String SensorConnectorInfo.getName()>
	//*  31   70:invokevirtual   #174 <Method boolean HashMap.containsKey(Object)>
	//*  32   73:ifeq            85
		{
			LOG.i(TAG, "connector is already added!!");
	//   33   76:getstatic       #29  <Field Class TAG>
	//   34   79:ldc1            #176 <String "connector is already added!!">
	//   35   81:invokestatic    #70  <Method void LOG.i(Class, String)>
			return;
	//   36   84:return          
		} else
		{
			mDataReceivingConnectorInfoMap.put(((Object) (sensorconnectorinfo.getName())), ((Object) (sensorconnectorinfo)));
	//   37   85:aload_0         
	//   38   86:getfield        #58  <Field HashMap mDataReceivingConnectorInfoMap>
	//   39   89:aload_1         
	//   40   90:invokevirtual   #105 <Method String SensorConnectorInfo.getName()>
	//   41   93:aload_1         
	//   42   94:invokevirtual   #160 <Method Object HashMap.put(Object, Object)>
	//   43   97:pop             
			return;
	//   44   98:return          
		}
	}

	public com.samsung.android.sensor.data.SensorTypes.SensorConnectionType getConnectionType()
	{
		return mConnectionType;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field com.samsung.android.sensor.data.SensorTypes$SensorConnectionType mConnectionType>
	//    2    4:areturn         
	}

	public int getDataType()
	{
		return mDataType;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int mDataType>
	//    2    4:ireturn         
	}

	public SensorDeviceInfo getDeviceInfo()
	{
		return mDeviceInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field SensorDeviceInfo mDeviceInfo>
	//    2    4:areturn         
	}

	public String getDeviceName()
	{
		return mDeviceName;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String mDeviceName>
	//    2    4:areturn         
	}

	public String getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String mId>
	//    2    4:areturn         
	}

	public void invokeDeviceAccessResultComeCallback(SensorConnectorInfo sensorconnectorinfo, com.samsung.android.sensor.data.SensorTypes.AccessResultCode accessresultcode)
	{
		LOG.i(TAG, (new StringBuilder()).append("invokeDeviceAccessResultComeCallback() resultCode = ").append(accessresultcode.name()).toString());
	//    0    0:getstatic       #29  <Field Class TAG>
	//    1    3:new             #129 <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #130 <Method void StringBuilder()>
	//    4   10:ldc1            #186 <String "invokeDeviceAccessResultComeCallback() resultCode = ">
	//    5   12:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_2         
	//    7   16:invokevirtual   #189 <Method String com.samsung.android.sensor.data.SensorTypes$AccessResultCode.name()>
	//    8   19:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   10   25:invokestatic    #70  <Method void LOG.i(Class, String)>
		if(accessresultcode == com.samsung.android.sensor.data.SensorTypes.AccessResultCode.ACCESS_CODE_SUCCESS)
	//*  11   28:aload_2         
	//*  12   29:getstatic       #111 <Field com.samsung.android.sensor.data.SensorTypes$AccessResultCode com.samsung.android.sensor.data.SensorTypes$AccessResultCode.ACCESS_CODE_SUCCESS>
	//*  13   32:if_acmpne       53
		{
			mAccessConnectorInfoMap.put(((Object) (sensorconnectorinfo.getName())), ((Object) (sensorconnectorinfo)));
	//   14   35:aload_0         
	//   15   36:getfield        #56  <Field HashMap mAccessConnectorInfoMap>
	//   16   39:aload_1         
	//   17   40:invokevirtual   #105 <Method String SensorConnectorInfo.getName()>
	//   18   43:aload_1         
	//   19   44:invokevirtual   #160 <Method Object HashMap.put(Object, Object)>
	//   20   47:pop             
			isAccessPending = false;
	//   21   48:aload_0         
	//   22   49:iconst_0        
	//   23   50:putfield        #62  <Field boolean isAccessPending>
		}
		SensorCallbackManager.getInstance().invokeDeviceAccessResultComeCallback(sensorconnectorinfo.getName(), mDeviceInfo, accessresultcode.ordinal());
	//   24   53:invokestatic    #99  <Method SensorCallbackManager SensorCallbackManager.getInstance()>
	//   25   56:aload_1         
	//   26   57:invokevirtual   #105 <Method String SensorConnectorInfo.getName()>
	//   27   60:aload_0         
	//   28   61:getfield        #51  <Field SensorDeviceInfo mDeviceInfo>
	//   29   64:aload_2         
	//   30   65:invokevirtual   #115 <Method int com.samsung.android.sensor.data.SensorTypes$AccessResultCode.ordinal()>
	//   31   68:invokevirtual   #119 <Method void SensorCallbackManager.invokeDeviceAccessResultComeCallback(String, SensorDeviceInfo, int)>
	//   32   71:return          
	}

	public void invokeDeviceDataCallback(SensorData sensordata)
	{
		LOG.i(TAG, (new StringBuilder()).append("invokeDeviceDataCallback() attached connector count = ").append(mDataReceivingConnectorInfoMap.size()).toString());
	//    0    0:getstatic       #29  <Field Class TAG>
	//    1    3:new             #129 <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #130 <Method void StringBuilder()>
	//    4   10:ldc1            #193 <String "invokeDeviceDataCallback() attached connector count = ">
	//    5   12:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_0         
	//    7   16:getfield        #58  <Field HashMap mDataReceivingConnectorInfoMap>
	//    8   19:invokevirtual   #127 <Method int HashMap.size()>
	//    9   22:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
	//   10   25:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   11   28:invokestatic    #70  <Method void LOG.i(Class, String)>
		Iterator iterator = mDataReceivingConnectorInfoMap.values().iterator();
	//   12   31:aload_0         
	//   13   32:getfield        #58  <Field HashMap mDataReceivingConnectorInfoMap>
	//   14   35:invokevirtual   #197 <Method Collection HashMap.values()>
	//   15   38:invokeinterface #203 <Method Iterator Collection.iterator()>
	//   16   43:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   17   44:aload_2         
	//   18   45:invokeinterface #209 <Method boolean Iterator.hasNext()>
	//   19   50:ifeq            82
			SensorConnectorInfo sensorconnectorinfo = (SensorConnectorInfo)iterator.next();
	//   20   53:aload_2         
	//   21   54:invokeinterface #213 <Method Object Iterator.next()>
	//   22   59:checkcast       #101 <Class SensorConnectorInfo>
	//   23   62:astore_3        
			if(sensorconnectorinfo != null)
	//*  24   63:aload_3         
	//*  25   64:ifnull          44
				SensorCallbackManager.getInstance().invokeDataCallback(sensorconnectorinfo, mDeviceInfo, sensordata);
	//   26   67:invokestatic    #99  <Method SensorCallbackManager SensorCallbackManager.getInstance()>
	//   27   70:aload_3         
	//   28   71:aload_0         
	//   29   72:getfield        #51  <Field SensorDeviceInfo mDeviceInfo>
	//   30   75:aload_1         
	//   31   76:invokevirtual   #217 <Method void SensorCallbackManager.invokeDataCallback(SensorConnectorInfo, SensorDeviceInfo, SensorData)>
		} while(true);
	//   32   79:goto            44
	//   33   82:return          
	}

	public void release(SensorConnectorInfo sensorconnectorinfo, boolean flag)
	{
		LOG.i(TAG, "release()");
	//    0    0:getstatic       #29  <Field Class TAG>
	//    1    3:ldc1            #221 <String "release()">
	//    2    5:invokestatic    #70  <Method void LOG.i(Class, String)>
		int i = mAccessConnectorInfoMap.size();
	//    3    8:aload_0         
	//    4    9:getfield        #56  <Field HashMap mAccessConnectorInfoMap>
	//    5   12:invokevirtual   #127 <Method int HashMap.size()>
	//    6   15:istore_3        
		LOG.d(TAG, (new StringBuilder()).append("release() connector count = ").append(i).append(" isAccessPending : ").append(isAccessPending).toString());
	//    7   16:getstatic       #29  <Field Class TAG>
	//    8   19:new             #129 <Class StringBuilder>
	//    9   22:dup             
	//   10   23:invokespecial   #130 <Method void StringBuilder()>
	//   11   26:ldc1            #223 <String "release() connector count = ">
	//   12   28:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:iload_3         
	//   14   32:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
	//   15   35:ldc1            #225 <String " isAccessPending : ">
	//   16   37:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   17   40:aload_0         
	//   18   41:getfield        #62  <Field boolean isAccessPending>
	//   19   44:invokevirtual   #228 <Method StringBuilder StringBuilder.append(boolean)>
	//   20   47:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   21   50:invokestatic    #145 <Method void LOG.d(Class, String)>
		if(sensorconnectorinfo == null)
	//*  22   53:aload_1         
	//*  23   54:ifnonnull       66
		{
			LOG.e(TAG, "release() SensorConnectorInfo is null !!!");
	//   24   57:getstatic       #29  <Field Class TAG>
	//   25   60:ldc1            #230 <String "release() SensorConnectorInfo is null !!!">
	//   26   62:invokestatic    #75  <Method void LOG.e(Class, String)>
		} else
	//*  27   65:return          
		{
			if(i == 1 || i == 0 && isAccessPending)
	//*  28   66:iload_3         
	//*  29   67:iconst_1        
	//*  30   68:icmpeq          82
	//*  31   71:iload_3         
	//*  32   72:ifne            161
	//*  33   75:aload_0         
	//*  34   76:getfield        #62  <Field boolean isAccessPending>
	//*  35   79:ifeq            161
			{
				SensorConnectorInfo sensorconnectorinfo1;
				for(Iterator iterator = mDataReceivingConnectorInfoMap.values().iterator(); iterator.hasNext(); removeListener(sensorconnectorinfo1))
	//*  36   82:aload_0         
	//*  37   83:getfield        #58  <Field HashMap mDataReceivingConnectorInfoMap>
	//*  38   86:invokevirtual   #197 <Method Collection HashMap.values()>
	//*  39   89:invokeinterface #203 <Method Iterator Collection.iterator()>
	//*  40   94:astore          4
	//*  41   96:aload           4
	//*  42   98:invokeinterface #209 <Method boolean Iterator.hasNext()>
	//*  43  103:ifeq            156
				{
					sensorconnectorinfo1 = (SensorConnectorInfo)iterator.next();
	//   44  106:aload           4
	//   45  108:invokeinterface #213 <Method Object Iterator.next()>
	//   46  113:checkcast       #101 <Class SensorConnectorInfo>
	//   47  116:astore          5
					LOG.d(TAG, (new StringBuilder()).append("release() : Remove remain dataReceivingConnectorInfo ").append(sensorconnectorinfo1.getName()).toString());
	//   48  118:getstatic       #29  <Field Class TAG>
	//   49  121:new             #129 <Class StringBuilder>
	//   50  124:dup             
	//   51  125:invokespecial   #130 <Method void StringBuilder()>
	//   52  128:ldc1            #232 <String "release() : Remove remain dataReceivingConnectorInfo ">
	//   53  130:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   54  133:aload           5
	//   55  135:invokevirtual   #105 <Method String SensorConnectorInfo.getName()>
	//   56  138:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   57  141:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   58  144:invokestatic    #145 <Method void LOG.d(Class, String)>
				}

	//   59  147:aload_0         
	//   60  148:aload           5
	//   61  150:invokevirtual   #235 <Method void removeListener(SensorConnectorInfo)>
	//*  62  153:goto            96
				releaseSensor(sensorconnectorinfo);
	//   63  156:aload_0         
	//   64  157:aload_1         
	//   65  158:invokevirtual   #238 <Method void releaseSensor(SensorConnectorInfo)>
			}
			if(mAccessConnectorInfoMap.get(((Object) (sensorconnectorinfo.getName()))) != null)
	//*  66  161:aload_0         
	//*  67  162:getfield        #56  <Field HashMap mAccessConnectorInfoMap>
	//*  68  165:aload_1         
	//*  69  166:invokevirtual   #105 <Method String SensorConnectorInfo.getName()>
	//*  70  169:invokevirtual   #149 <Method Object HashMap.get(Object)>
	//*  71  172:ifnull          65
			{
				mAccessConnectorInfoMap.remove(((Object) (sensorconnectorinfo.getName())));
	//   72  175:aload_0         
	//   73  176:getfield        #56  <Field HashMap mAccessConnectorInfoMap>
	//   74  179:aload_1         
	//   75  180:invokevirtual   #105 <Method String SensorConnectorInfo.getName()>
	//   76  183:invokevirtual   #241 <Method Object HashMap.remove(Object)>
	//   77  186:pop             
				LOG.i(TAG, "release() connector is removed!");
	//   78  187:getstatic       #29  <Field Class TAG>
	//   79  190:ldc1            #243 <String "release() connector is removed!">
	//   80  192:invokestatic    #70  <Method void LOG.i(Class, String)>
				return;
	//   81  195:return          
			}
		}
	}

	public void releaseAllConnector()
	{
		LOG.i(TAG, (new StringBuilder()).append("releaseAllConnector() connectorInfoListSize : ").append(mAccessConnectorInfoMap.size()).toString());
	//    0    0:getstatic       #29  <Field Class TAG>
	//    1    3:new             #129 <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #130 <Method void StringBuilder()>
	//    4   10:ldc1            #246 <String "releaseAllConnector() connectorInfoListSize : ">
	//    5   12:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_0         
	//    7   16:getfield        #56  <Field HashMap mAccessConnectorInfoMap>
	//    8   19:invokevirtual   #127 <Method int HashMap.size()>
	//    9   22:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
	//   10   25:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   11   28:invokestatic    #70  <Method void LOG.i(Class, String)>
		SensorConnectorInfo sensorconnectorinfo;
		for(Iterator iterator = mAccessConnectorInfoMap.values().iterator(); iterator.hasNext(); release(sensorconnectorinfo, false))
	//*  12   31:aload_0         
	//*  13   32:getfield        #56  <Field HashMap mAccessConnectorInfoMap>
	//*  14   35:invokevirtual   #197 <Method Collection HashMap.values()>
	//*  15   38:invokeinterface #203 <Method Iterator Collection.iterator()>
	//*  16   43:astore_1        
	//*  17   44:aload_1         
	//*  18   45:invokeinterface #209 <Method boolean Iterator.hasNext()>
	//*  19   50:ifeq            100
		{
			sensorconnectorinfo = (SensorConnectorInfo)iterator.next();
	//   20   53:aload_1         
	//   21   54:invokeinterface #213 <Method Object Iterator.next()>
	//   22   59:checkcast       #101 <Class SensorConnectorInfo>
	//   23   62:astore_2        
			LOG.i(TAG, (new StringBuilder()).append("releaseAllConnector() call release ").append(sensorconnectorinfo.getName()).toString());
	//   24   63:getstatic       #29  <Field Class TAG>
	//   25   66:new             #129 <Class StringBuilder>
	//   26   69:dup             
	//   27   70:invokespecial   #130 <Method void StringBuilder()>
	//   28   73:ldc1            #248 <String "releaseAllConnector() call release ">
	//   29   75:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   30   78:aload_2         
	//   31   79:invokevirtual   #105 <Method String SensorConnectorInfo.getName()>
	//   32   82:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   33   85:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   34   88:invokestatic    #70  <Method void LOG.i(Class, String)>
		}

	//   35   91:aload_0         
	//   36   92:aload_2         
	//   37   93:iconst_0        
	//   38   94:invokevirtual   #250 <Method void release(SensorConnectorInfo, boolean)>
	//*  39   97:goto            44
	//   40  100:return          
	}

	public abstract void releaseSensor(SensorConnectorInfo sensorconnectorinfo);

	public void removeListener(SensorConnectorInfo sensorconnectorinfo)
	{
		LOG.i(TAG, "removeListener()");
	//    0    0:getstatic       #29  <Field Class TAG>
	//    1    3:ldc1            #252 <String "removeListener()">
	//    2    5:invokestatic    #70  <Method void LOG.i(Class, String)>
		if(sensorconnectorinfo == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       21
		{
			LOG.e(TAG, "removeListener() SensorConnectorInfo is null !!!");
	//    5   12:getstatic       #29  <Field Class TAG>
	//    6   15:ldc1            #254 <String "removeListener() SensorConnectorInfo is null !!!">
	//    7   17:invokestatic    #75  <Method void LOG.e(Class, String)>
		} else
	//*   8   20:return          
		{
			int i = mDataReceivingConnectorInfoMap.size();
	//    9   21:aload_0         
	//   10   22:getfield        #58  <Field HashMap mDataReceivingConnectorInfoMap>
	//   11   25:invokevirtual   #127 <Method int HashMap.size()>
	//   12   28:istore_2        
			LOG.d(TAG, (new StringBuilder()).append("removeListener() connector count = ").append(i).toString());
	//   13   29:getstatic       #29  <Field Class TAG>
	//   14   32:new             #129 <Class StringBuilder>
	//   15   35:dup             
	//   16   36:invokespecial   #130 <Method void StringBuilder()>
	//   17   39:ldc2            #256 <String "removeListener() connector count = ">
	//   18   42:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   19   45:iload_2         
	//   20   46:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
	//   21   49:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   22   52:invokestatic    #145 <Method void LOG.d(Class, String)>
			if(i == 1)
	//*  23   55:iload_2         
	//*  24   56:iconst_1        
	//*  25   57:icmpne          64
				stopSensor();
	//   26   60:aload_0         
	//   27   61:invokevirtual   #259 <Method void stopSensor()>
			if(mDataReceivingConnectorInfoMap.remove(((Object) (sensorconnectorinfo.getName()))) != null)
	//*  28   64:aload_0         
	//*  29   65:getfield        #58  <Field HashMap mDataReceivingConnectorInfoMap>
	//*  30   68:aload_1         
	//*  31   69:invokevirtual   #105 <Method String SensorConnectorInfo.getName()>
	//*  32   72:invokevirtual   #241 <Method Object HashMap.remove(Object)>
	//*  33   75:ifnull          20
			{
				LOG.i(TAG, "removeListener() connector is removed!");
	//   34   78:getstatic       #29  <Field Class TAG>
	//   35   81:ldc2            #261 <String "removeListener() connector is removed!">
	//   36   84:invokestatic    #70  <Method void LOG.i(Class, String)>
				return;
	//   37   87:return          
			}
		}
	}

	protected abstract void startSensor();

	protected abstract void stopSensor();

	public abstract void uninitialize();

	private static final Class TAG = com/sec/android/sensor/framework/device/SensorDevice;
	private boolean isAccessPending;
	protected HashMap mAccessConnectorInfoMap;
	protected com.samsung.android.sensor.data.SensorTypes.SensorConnectionType mConnectionType;
	protected Context mContext;
	protected HashMap mDataReceivingConnectorInfoMap;
	protected int mDataType;
	protected SensorDeviceInfo mDeviceInfo;
	protected String mDeviceName;
	protected int mDeviceState;
	protected String mId;

	static 
	{
	//    0    0:ldc1            #2   <Class SensorDevice>
	//    1    2:putstatic       #29  <Field Class TAG>
	//*   2    5:return          
	}
}
