// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			MissionSubsystem, ResolvedMissionStatusEvent, LogStreamUIServiceDataCallback, MissionUIServiceDataCallback, 
//			CommandType, MissionUIServiceCommand, MissionUIServiceData

private static final class MissionSubsystem$CppProxy extends MissionSubsystem
{

	private native void nativeDestroy(long l);

	private native HashSet native_availableCommands(long l);

	private native int native_getMissionRuntime(long l);

	private native ResolvedMissionStatusEvent native_getResolvedMissionStatus(long l);

	private native void native_queryResolvedMissionStatus(long l);

	private native boolean native_registerLogStreamSubscriber(long l, LogStreamUIServiceDataCallback logstreamuiservicedatacallback);

	private native boolean native_registerSubscriber(long l, MissionUIServiceDataCallback missionuiservicedatacallback);

	private native boolean native_registerUISubscriber(long l, MissionUIServiceDataCallback missionuiservicedatacallback);

	private native void native_sendCommand(long l, CommandType commandtype);

	private native void native_sendCommandJson(long l, String s);

	private native void native_sendServiceCommand(long l, MissionUIServiceCommand missionuiservicecommand, MissionUIServiceData missionuiservicedata);

	private native boolean native_unregisterLogStreamSubscriber(long l, LogStreamUIServiceDataCallback logstreamuiservicedatacallback);

	private native boolean native_unregisterSubscriber(long l, MissionUIServiceDataCallback missionuiservicedatacallback);

	public HashSet availableCommands()
	{
		return native_availableCommands(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #60  <Method HashSet native_availableCommands(long)>
	//    4    8:areturn         
	}

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #67  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #69  <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #76  <Method void Object.finalize()>
	//    4    8:return          
	}

	public int getMissionRuntime()
	{
		return native_getMissionRuntime(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #80  <Method int native_getMissionRuntime(long)>
	//    4    8:ireturn         
	}

	public ResolvedMissionStatusEvent getResolvedMissionStatus()
	{
		return native_getResolvedMissionStatus(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #84  <Method ResolvedMissionStatusEvent native_getResolvedMissionStatus(long)>
	//    4    8:areturn         
	}

	public void queryResolvedMissionStatus()
	{
		native_queryResolvedMissionStatus(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #87  <Method void native_queryResolvedMissionStatus(long)>
	//    4    8:return          
	}

	public boolean registerLogStreamSubscriber(LogStreamUIServiceDataCallback logstreamuiservicedatacallback)
	{
		return native_registerLogStreamSubscriber(nativeRef, logstreamuiservicedatacallback);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #91  <Method boolean native_registerLogStreamSubscriber(long, LogStreamUIServiceDataCallback)>
	//    5    9:ireturn         
	}

	public boolean registerSubscriber(MissionUIServiceDataCallback missionuiservicedatacallback)
	{
		return native_registerSubscriber(nativeRef, missionuiservicedatacallback);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #95  <Method boolean native_registerSubscriber(long, MissionUIServiceDataCallback)>
	//    5    9:ireturn         
	}

	public boolean registerUISubscriber(MissionUIServiceDataCallback missionuiservicedatacallback)
	{
		return native_registerUISubscriber(nativeRef, missionuiservicedatacallback);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #98  <Method boolean native_registerUISubscriber(long, MissionUIServiceDataCallback)>
	//    5    9:ireturn         
	}

	public void sendCommand(CommandType commandtype)
	{
		native_sendCommand(nativeRef, commandtype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #102 <Method void native_sendCommand(long, CommandType)>
	//    5    9:return          
	}

	public void sendCommandJson(String s)
	{
		native_sendCommandJson(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #105 <Method void native_sendCommandJson(long, String)>
	//    5    9:return          
	}

	public void sendServiceCommand(MissionUIServiceCommand missionuiservicecommand, MissionUIServiceData missionuiservicedata)
	{
		native_sendServiceCommand(nativeRef, missionuiservicecommand, missionuiservicedata);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #109 <Method void native_sendServiceCommand(long, MissionUIServiceCommand, MissionUIServiceData)>
	//    6   10:return          
	}

	public boolean unregisterLogStreamSubscriber(LogStreamUIServiceDataCallback logstreamuiservicedatacallback)
	{
		return native_unregisterLogStreamSubscriber(nativeRef, logstreamuiservicedatacallback);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #112 <Method boolean native_unregisterLogStreamSubscriber(long, LogStreamUIServiceDataCallback)>
	//    5    9:ireturn         
	}

	public boolean unregisterSubscriber(MissionUIServiceDataCallback missionuiservicedatacallback)
	{
		return native_unregisterSubscriber(nativeRef, missionuiservicedatacallback);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #115 <Method boolean native_unregisterSubscriber(long, MissionUIServiceDataCallback)>
	//    5    9:ireturn         
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private MissionSubsystem$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void MissionSubsystem()>
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
