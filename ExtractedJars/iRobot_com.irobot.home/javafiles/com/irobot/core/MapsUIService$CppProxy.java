// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			MapsUIService, MissionMapType, RenderPresenter, MapsUIServiceData, 
//			RobotMissionHistoryItem, MapsUIServiceDataCallback, MapsUIServiceCommand

private static final class MapsUIService$CppProxy extends MapsUIService
{

	private native void nativeDestroy(long l);

	private native RenderPresenter native_getMissionMapRenderer(long l, MissionMapType missionmaptype);

	private native ArrayList native_getMissionMapTypes(long l);

	private native MapsUIServiceData native_getServiceData(long l);

	private native boolean native_isMapAtDefaultZoom(long l, MissionMapType missionmaptype);

	private native void native_queryMissionMap(long l, RobotMissionHistoryItem robotmissionhistoryitem, MissionMapType missionmaptype, float f, float f1);

	private native void native_queryStaticMap(long l, String s, MissionMapType missionmaptype, float f, float f1);

	private native boolean native_registerSubscriber(long l, MapsUIServiceDataCallback mapsuiservicedatacallback);

	private native boolean native_registerUISubscriber(long l, MapsUIServiceDataCallback mapsuiservicedatacallback);

	private native void native_sendCommand(long l, MapsUIServiceCommand mapsuiservicecommand, MapsUIServiceData mapsuiservicedata);

	private native void native_setMissionDetailsInfo(long l, int i, int j, int k, boolean flag);

	private native boolean native_unregisterSubscriber(long l, MapsUIServiceDataCallback mapsuiservicedatacallback);

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #61  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #63  <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #70  <Method void Object.finalize()>
	//    4    8:return          
	}

	public RenderPresenter getMissionMapRenderer(MissionMapType missionmaptype)
	{
		return native_getMissionMapRenderer(nativeRef, missionmaptype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #74  <Method RenderPresenter native_getMissionMapRenderer(long, MissionMapType)>
	//    5    9:areturn         
	}

	public ArrayList getMissionMapTypes()
	{
		return native_getMissionMapTypes(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #78  <Method ArrayList native_getMissionMapTypes(long)>
	//    4    8:areturn         
	}

	public MapsUIServiceData getServiceData()
	{
		return native_getServiceData(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #84  <Method MapsUIServiceData native_getServiceData(long)>
	//    4    8:areturn         
	}

	public boolean isMapAtDefaultZoom(MissionMapType missionmaptype)
	{
		return native_isMapAtDefaultZoom(nativeRef, missionmaptype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #88  <Method boolean native_isMapAtDefaultZoom(long, MissionMapType)>
	//    5    9:ireturn         
	}

	public void queryMissionMap(RobotMissionHistoryItem robotmissionhistoryitem, MissionMapType missionmaptype, float f, float f1)
	{
		native_queryMissionMap(nativeRef, robotmissionhistoryitem, missionmaptype, f, f1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:fload_3         
	//    6    8:fload           4
	//    7   10:invokespecial   #92  <Method void native_queryMissionMap(long, RobotMissionHistoryItem, MissionMapType, float, float)>
	//    8   13:return          
	}

	public void queryStaticMap(String s, MissionMapType missionmaptype, float f, float f1)
	{
		native_queryStaticMap(nativeRef, s, missionmaptype, f, f1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:fload_3         
	//    6    8:fload           4
	//    7   10:invokespecial   #96  <Method void native_queryStaticMap(long, String, MissionMapType, float, float)>
	//    8   13:return          
	}

	public boolean registerSubscriber(MapsUIServiceDataCallback mapsuiservicedatacallback)
	{
		return native_registerSubscriber(nativeRef, mapsuiservicedatacallback);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #100 <Method boolean native_registerSubscriber(long, MapsUIServiceDataCallback)>
	//    5    9:ireturn         
	}

	public boolean registerUISubscriber(MapsUIServiceDataCallback mapsuiservicedatacallback)
	{
		return native_registerUISubscriber(nativeRef, mapsuiservicedatacallback);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #103 <Method boolean native_registerUISubscriber(long, MapsUIServiceDataCallback)>
	//    5    9:ireturn         
	}

	public void sendCommand(MapsUIServiceCommand mapsuiservicecommand, MapsUIServiceData mapsuiservicedata)
	{
		native_sendCommand(nativeRef, mapsuiservicecommand, mapsuiservicedata);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #107 <Method void native_sendCommand(long, MapsUIServiceCommand, MapsUIServiceData)>
	//    6   10:return          
	}

	public void setMissionDetailsInfo(int i, int j, int k, boolean flag)
	{
		native_setMissionDetailsInfo(nativeRef, i, j, k, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #111 <Method void native_setMissionDetailsInfo(long, int, int, int, boolean)>
	//    8   13:return          
	}

	public boolean unregisterSubscriber(MapsUIServiceDataCallback mapsuiservicedatacallback)
	{
		return native_unregisterSubscriber(nativeRef, mapsuiservicedatacallback);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #114 <Method boolean native_unregisterSubscriber(long, MapsUIServiceDataCallback)>
	//    5    9:ireturn         
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private MapsUIService$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void MapsUIService()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
	//    7   13:putfield        #26  <Field AtomicBoolean destroyed>
		if(l == 0L)
	//*   8   16:lload_1         
	//*   9   17:lconst_0        
	//*  10   18:lcmp            
	//*  11   19:ifne            32
		{
			throw new RuntimeException("nativeRef is zero");
	//   12   22:new             #28  <Class RuntimeException>
	//   13   25:dup             
	//   14   26:ldc1            #30  <String "nativeRef is zero">
	//   15   28:invokespecial   #33  <Method void RuntimeException(String)>
	//   16   31:athrow          
		} else
		{
			nativeRef = l;
	//   17   32:aload_0         
	//   18   33:lload_1         
	//   19   34:putfield        #35  <Field long nativeRef>
			return;
	//   20   37:return          
		}
	}
}
