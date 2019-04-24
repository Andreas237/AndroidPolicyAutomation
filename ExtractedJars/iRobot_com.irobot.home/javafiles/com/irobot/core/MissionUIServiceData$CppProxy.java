// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			MissionUIServiceData, DockState, EvacuationDockMode, MissionStatusAction, 
//			ResolvedMissionStatus

private static final class MissionUIServiceData$CppProxy extends MissionUIServiceData
{

	private native void nativeDestroy(long l);

	private native short native_getBatteryLevelPercentage(long l);

	private native DockState native_getDockState(long l);

	private native EvacuationDockMode native_getEvacDockMode(long l);

	private native String native_getEvacHelpContentId(long l);

	private native String native_getEvacStatusMessage(long l);

	private native ArrayList native_getEvacStatusMessageArgs(long l);

	private native String native_getHelpContentId(long l);

	private native String native_getHelpContentUrl(long l);

	private native boolean native_getIsBinfull(long l);

	private native boolean native_getIsCharging(long l);

	private native boolean native_getIsLogStreamEnabled(long l);

	private native boolean native_getIsStatusConnectionRelated(long l);

	private native boolean native_getIsTankLow(long l);

	private native boolean native_getIsTraining(long l);

	private native String native_getLogStreamData(long l);

	private native ArrayList native_getMissionDataStates(long l);

	private native MissionStatusAction native_getMissionStatusAction(long l);

	private native short native_getPauseExpireTime(long l);

	private native short native_getPauseResumeTime(long l);

	private native ResolvedMissionStatus native_getResolvedMissionStatus(long l);

	private native boolean native_getShowEvacDockTour(long l);

	private native String native_getStatusMessage(long l);

	private native ArrayList native_getStatusMessageArgs(long l);

	private native boolean native_isPaused(long l);

	private native void native_setMissionStatusAction(long l, MissionStatusAction missionstatusaction);

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #75  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #77  <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #84  <Method void Object.finalize()>
	//    4    8:return          
	}

	public short getBatteryLevelPercentage()
	{
		return native_getBatteryLevelPercentage(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #88  <Method short native_getBatteryLevelPercentage(long)>
	//    4    8:ireturn         
	}

	public DockState getDockState()
	{
		return native_getDockState(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #92  <Method DockState native_getDockState(long)>
	//    4    8:areturn         
	}

	public EvacuationDockMode getEvacDockMode()
	{
		return native_getEvacDockMode(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #96  <Method EvacuationDockMode native_getEvacDockMode(long)>
	//    4    8:areturn         
	}

	public String getEvacHelpContentId()
	{
		return native_getEvacHelpContentId(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #100 <Method String native_getEvacHelpContentId(long)>
	//    4    8:areturn         
	}

	public String getEvacStatusMessage()
	{
		return native_getEvacStatusMessage(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #103 <Method String native_getEvacStatusMessage(long)>
	//    4    8:areturn         
	}

	public ArrayList getEvacStatusMessageArgs()
	{
		return native_getEvacStatusMessageArgs(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #107 <Method ArrayList native_getEvacStatusMessageArgs(long)>
	//    4    8:areturn         
	}

	public String getHelpContentId()
	{
		return native_getHelpContentId(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #112 <Method String native_getHelpContentId(long)>
	//    4    8:areturn         
	}

	public String getHelpContentUrl()
	{
		return native_getHelpContentUrl(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #115 <Method String native_getHelpContentUrl(long)>
	//    4    8:areturn         
	}

	public boolean getIsBinfull()
	{
		return native_getIsBinfull(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #119 <Method boolean native_getIsBinfull(long)>
	//    4    8:ireturn         
	}

	public boolean getIsCharging()
	{
		return native_getIsCharging(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #122 <Method boolean native_getIsCharging(long)>
	//    4    8:ireturn         
	}

	public boolean getIsLogStreamEnabled()
	{
		return native_getIsLogStreamEnabled(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #125 <Method boolean native_getIsLogStreamEnabled(long)>
	//    4    8:ireturn         
	}

	public boolean getIsStatusConnectionRelated()
	{
		return native_getIsStatusConnectionRelated(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #128 <Method boolean native_getIsStatusConnectionRelated(long)>
	//    4    8:ireturn         
	}

	public boolean getIsTankLow()
	{
		return native_getIsTankLow(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #131 <Method boolean native_getIsTankLow(long)>
	//    4    8:ireturn         
	}

	public boolean getIsTraining()
	{
		return native_getIsTraining(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #134 <Method boolean native_getIsTraining(long)>
	//    4    8:ireturn         
	}

	public String getLogStreamData()
	{
		return native_getLogStreamData(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #137 <Method String native_getLogStreamData(long)>
	//    4    8:areturn         
	}

	public ArrayList getMissionDataStates()
	{
		return native_getMissionDataStates(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #140 <Method ArrayList native_getMissionDataStates(long)>
	//    4    8:areturn         
	}

	public MissionStatusAction getMissionStatusAction()
	{
		return native_getMissionStatusAction(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #145 <Method MissionStatusAction native_getMissionStatusAction(long)>
	//    4    8:areturn         
	}

	public short getPauseExpireTime()
	{
		return native_getPauseExpireTime(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #148 <Method short native_getPauseExpireTime(long)>
	//    4    8:ireturn         
	}

	public short getPauseResumeTime()
	{
		return native_getPauseResumeTime(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #151 <Method short native_getPauseResumeTime(long)>
	//    4    8:ireturn         
	}

	public ResolvedMissionStatus getResolvedMissionStatus()
	{
		return native_getResolvedMissionStatus(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #155 <Method ResolvedMissionStatus native_getResolvedMissionStatus(long)>
	//    4    8:areturn         
	}

	public boolean getShowEvacDockTour()
	{
		return native_getShowEvacDockTour(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #158 <Method boolean native_getShowEvacDockTour(long)>
	//    4    8:ireturn         
	}

	public String getStatusMessage()
	{
		return native_getStatusMessage(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #161 <Method String native_getStatusMessage(long)>
	//    4    8:areturn         
	}

	public ArrayList getStatusMessageArgs()
	{
		return native_getStatusMessageArgs(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #164 <Method ArrayList native_getStatusMessageArgs(long)>
	//    4    8:areturn         
	}

	public boolean isPaused()
	{
		return native_isPaused(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #167 <Method boolean native_isPaused(long)>
	//    4    8:ireturn         
	}

	public void setMissionStatusAction(MissionStatusAction missionstatusaction)
	{
		native_setMissionStatusAction(nativeRef, missionstatusaction);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #171 <Method void native_setMissionStatusAction(long, MissionStatusAction)>
	//    5    9:return          
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private MissionUIServiceData$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void MissionUIServiceData()>
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
