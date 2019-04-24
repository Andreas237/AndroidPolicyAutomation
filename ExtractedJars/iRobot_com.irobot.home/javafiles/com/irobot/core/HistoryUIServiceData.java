// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			RobotMissionHistoryItem

public abstract class HistoryUIServiceData
{
	private static final class CppProxy extends HistoryUIServiceData
	{

		private native void nativeDestroy(long l);

		private native int native_getAccumulatedDirtDetectCount(long l);

		private native int native_getAccumulatedNumberOfCleaningJobs(long l);

		private native int native_getAccumulatedTotalJobMinutes(long l);

		private native int native_getAccumulatedTotalSquareFeetCleaned(long l);

		private native ArrayList native_getDataStates(long l);

		private native ArrayList native_getDockEvacuationLifeTimeData(long l);

		private native long native_getDockEvacuationTotalCount(long l);

		private native RobotMissionHistoryItem native_getMissionHistoryDetails(long l, int i);

		private native int native_getMissionId(long l);

		private native String native_getMissionRuntimeChargeTimeColor(long l);

		private native String native_getMissionRuntimeChartData(long l);

		private native String native_getMissionRuntimeCleaningTimeColor(long l);

		private native String native_getMissionRuntimePauseTimeColor(long l);

		private native String native_getMissionsAreaCleanedChartData(long l);

		private native int native_getMissionsAreaCleanedChartTotalMission(long l);

		private native ArrayList native_getRobotMissionHistoryList(long l);

		private native void native_setMissionId(long l, int i);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #64  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #66  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #69  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #73  <Method void Object.finalize()>
		//    4    8:return          
		}

		public int getAccumulatedDirtDetectCount()
		{
			return native_getAccumulatedDirtDetectCount(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #77  <Method int native_getAccumulatedDirtDetectCount(long)>
		//    4    8:ireturn         
		}

		public int getAccumulatedNumberOfCleaningJobs()
		{
			return native_getAccumulatedNumberOfCleaningJobs(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #80  <Method int native_getAccumulatedNumberOfCleaningJobs(long)>
		//    4    8:ireturn         
		}

		public int getAccumulatedTotalJobMinutes()
		{
			return native_getAccumulatedTotalJobMinutes(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #83  <Method int native_getAccumulatedTotalJobMinutes(long)>
		//    4    8:ireturn         
		}

		public int getAccumulatedTotalSquareFeetCleaned()
		{
			return native_getAccumulatedTotalSquareFeetCleaned(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #86  <Method int native_getAccumulatedTotalSquareFeetCleaned(long)>
		//    4    8:ireturn         
		}

		public ArrayList getDataStates()
		{
			return native_getDataStates(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #90  <Method ArrayList native_getDataStates(long)>
		//    4    8:areturn         
		}

		public ArrayList getDockEvacuationLifeTimeData()
		{
			return native_getDockEvacuationLifeTimeData(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #95  <Method ArrayList native_getDockEvacuationLifeTimeData(long)>
		//    4    8:areturn         
		}

		public long getDockEvacuationTotalCount()
		{
			return native_getDockEvacuationTotalCount(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #100 <Method long native_getDockEvacuationTotalCount(long)>
		//    4    8:lreturn         
		}

		public RobotMissionHistoryItem getMissionHistoryDetails(int i)
		{
			return native_getMissionHistoryDetails(nativeRef, i);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:iload_1         
		//    4    6:invokespecial   #104 <Method RobotMissionHistoryItem native_getMissionHistoryDetails(long, int)>
		//    5    9:areturn         
		}

		public int getMissionId()
		{
			return native_getMissionId(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #107 <Method int native_getMissionId(long)>
		//    4    8:ireturn         
		}

		public String getMissionRuntimeChargeTimeColor()
		{
			return native_getMissionRuntimeChargeTimeColor(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #111 <Method String native_getMissionRuntimeChargeTimeColor(long)>
		//    4    8:areturn         
		}

		public String getMissionRuntimeChartData()
		{
			return native_getMissionRuntimeChartData(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #114 <Method String native_getMissionRuntimeChartData(long)>
		//    4    8:areturn         
		}

		public String getMissionRuntimeCleaningTimeColor()
		{
			return native_getMissionRuntimeCleaningTimeColor(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #117 <Method String native_getMissionRuntimeCleaningTimeColor(long)>
		//    4    8:areturn         
		}

		public String getMissionRuntimePauseTimeColor()
		{
			return native_getMissionRuntimePauseTimeColor(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #120 <Method String native_getMissionRuntimePauseTimeColor(long)>
		//    4    8:areturn         
		}

		public String getMissionsAreaCleanedChartData()
		{
			return native_getMissionsAreaCleanedChartData(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #123 <Method String native_getMissionsAreaCleanedChartData(long)>
		//    4    8:areturn         
		}

		public int getMissionsAreaCleanedChartTotalMission()
		{
			return native_getMissionsAreaCleanedChartTotalMission(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #126 <Method int native_getMissionsAreaCleanedChartTotalMission(long)>
		//    4    8:ireturn         
		}

		public ArrayList getRobotMissionHistoryList()
		{
			return native_getRobotMissionHistoryList(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #129 <Method ArrayList native_getRobotMissionHistoryList(long)>
		//    4    8:areturn         
		}

		public void setMissionId(int i)
		{
			native_setMissionId(nativeRef, i);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:iload_1         
		//    4    6:invokespecial   #134 <Method void native_setMissionId(long, int)>
		//    5    9:return          
		}

		static final boolean $assertionsDisabled = false;
		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		static 
		{
		//    0    0:return          
		}

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void HistoryUIServiceData()>
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


	public HistoryUIServiceData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static native HistoryUIServiceData create();

	public abstract int getAccumulatedDirtDetectCount();

	public abstract int getAccumulatedNumberOfCleaningJobs();

	public abstract int getAccumulatedTotalJobMinutes();

	public abstract int getAccumulatedTotalSquareFeetCleaned();

	public abstract ArrayList getDataStates();

	public abstract ArrayList getDockEvacuationLifeTimeData();

	public abstract long getDockEvacuationTotalCount();

	public abstract RobotMissionHistoryItem getMissionHistoryDetails(int i);

	public abstract int getMissionId();

	public abstract String getMissionRuntimeChargeTimeColor();

	public abstract String getMissionRuntimeChartData();

	public abstract String getMissionRuntimeCleaningTimeColor();

	public abstract String getMissionRuntimePauseTimeColor();

	public abstract String getMissionsAreaCleanedChartData();

	public abstract int getMissionsAreaCleanedChartTotalMission();

	public abstract ArrayList getRobotMissionHistoryList();

	public abstract void setMissionId(int i);
}
