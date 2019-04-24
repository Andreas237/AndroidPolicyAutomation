// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			NetworkScenarios, NetworkStatisticsToken, NetworkStatisticsResult, PersistenceHandler, 
//			DeviceInfoHandler

public abstract class NetworkStatistics
{
	private static final class CppProxy extends NetworkStatistics
	{

		private native void nativeDestroy(long l);

		private native NetworkStatisticsToken native_beginMeasurement(long l, NetworkScenarios networkscenarios, int i);

		private native void native_clearAssetStatistics(long l, String s);

		private native void native_countFailures(long l);

		private native void native_endAssetMeasurement(long l, String s, NetworkStatisticsToken networkstatisticstoken, NetworkStatisticsResult networkstatisticsresult, String s1);

		private native void native_endMeasurement(long l, NetworkStatisticsToken networkstatisticstoken, NetworkStatisticsResult networkstatisticsresult, String s);

		private native HashMap native_failureNetworkInterfaces(long l);

		private native void native_ignoreFailures(long l);

		private native void native_logStatistics(long l);

		private native void native_resetStatistics(long l);

		private native void native_setHandlers(long l, PersistenceHandler persistencehandler, DeviceInfoHandler deviceinfohandler);

		private native long native_statisticFailureAverageTimeMsec(long l, NetworkScenarios networkscenarios);

		private native long native_statisticFailureCount(long l, NetworkScenarios networkscenarios);

		private native long native_statisticFailureLowSignalStrengthCount(long l, NetworkScenarios networkscenarios);

		private native long native_statisticSuccessAverageTimeMsec(long l, NetworkScenarios networkscenarios);

		private native long native_statisticSuccessCount(long l, NetworkScenarios networkscenarios);

		private native long native_statisticTotalAttempts(long l, NetworkScenarios networkscenarios);

		private native HashSet native_successfulBssids(long l, String s);

		private native HashMap native_successfulNetworkInterfaces(long l);

		private native HashSet native_successfulSsids(long l, String s);

		private native short native_totalDiscountedFailures(long l);

		public NetworkStatisticsToken beginMeasurement(NetworkScenarios networkscenarios, int i)
		{
			return native_beginMeasurement(nativeRef, networkscenarios, i);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #69  <Method NetworkStatisticsToken native_beginMeasurement(long, NetworkScenarios, int)>
		//    6   10:areturn         
		}

		public void clearAssetStatistics(String s)
		{
			native_clearAssetStatistics(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #72  <Method void native_clearAssetStatistics(long, String)>
		//    5    9:return          
		}

		public void countFailures()
		{
			native_countFailures(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #75  <Method void native_countFailures(long)>
		//    4    8:return          
		}

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #80  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #82  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		public void endAssetMeasurement(String s, NetworkStatisticsToken networkstatisticstoken, NetworkStatisticsResult networkstatisticsresult, String s1)
		{
			native_endAssetMeasurement(nativeRef, s, networkstatisticstoken, networkstatisticsresult, s1);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:aload_3         
		//    6    8:aload           4
		//    7   10:invokespecial   #86  <Method void native_endAssetMeasurement(long, String, NetworkStatisticsToken, NetworkStatisticsResult, String)>
		//    8   13:return          
		}

		public void endMeasurement(NetworkStatisticsToken networkstatisticstoken, NetworkStatisticsResult networkstatisticsresult, String s)
		{
			native_endMeasurement(nativeRef, networkstatisticstoken, networkstatisticsresult, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:aload_3         
		//    6    8:invokespecial   #90  <Method void native_endMeasurement(long, NetworkStatisticsToken, NetworkStatisticsResult, String)>
		//    7   11:return          
		}

		public HashMap failureNetworkInterfaces()
		{
			return native_failureNetworkInterfaces(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #94  <Method HashMap native_failureNetworkInterfaces(long)>
		//    4    8:areturn         
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #99  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #103 <Method void Object.finalize()>
		//    4    8:return          
		}

		public void ignoreFailures()
		{
			native_ignoreFailures(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #106 <Method void native_ignoreFailures(long)>
		//    4    8:return          
		}

		public void logStatistics()
		{
			native_logStatistics(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #109 <Method void native_logStatistics(long)>
		//    4    8:return          
		}

		public void resetStatistics()
		{
			native_resetStatistics(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #112 <Method void native_resetStatistics(long)>
		//    4    8:return          
		}

		public void setHandlers(PersistenceHandler persistencehandler, DeviceInfoHandler deviceinfohandler)
		{
			native_setHandlers(nativeRef, persistencehandler, deviceinfohandler);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #116 <Method void native_setHandlers(long, PersistenceHandler, DeviceInfoHandler)>
		//    6   10:return          
		}

		public long statisticFailureAverageTimeMsec(NetworkScenarios networkscenarios)
		{
			return native_statisticFailureAverageTimeMsec(nativeRef, networkscenarios);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #120 <Method long native_statisticFailureAverageTimeMsec(long, NetworkScenarios)>
		//    5    9:lreturn         
		}

		public long statisticFailureCount(NetworkScenarios networkscenarios)
		{
			return native_statisticFailureCount(nativeRef, networkscenarios);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #123 <Method long native_statisticFailureCount(long, NetworkScenarios)>
		//    5    9:lreturn         
		}

		public long statisticFailureLowSignalStrengthCount(NetworkScenarios networkscenarios)
		{
			return native_statisticFailureLowSignalStrengthCount(nativeRef, networkscenarios);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #126 <Method long native_statisticFailureLowSignalStrengthCount(long, NetworkScenarios)>
		//    5    9:lreturn         
		}

		public long statisticSuccessAverageTimeMsec(NetworkScenarios networkscenarios)
		{
			return native_statisticSuccessAverageTimeMsec(nativeRef, networkscenarios);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #129 <Method long native_statisticSuccessAverageTimeMsec(long, NetworkScenarios)>
		//    5    9:lreturn         
		}

		public long statisticSuccessCount(NetworkScenarios networkscenarios)
		{
			return native_statisticSuccessCount(nativeRef, networkscenarios);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #132 <Method long native_statisticSuccessCount(long, NetworkScenarios)>
		//    5    9:lreturn         
		}

		public long statisticTotalAttempts(NetworkScenarios networkscenarios)
		{
			return native_statisticTotalAttempts(nativeRef, networkscenarios);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #135 <Method long native_statisticTotalAttempts(long, NetworkScenarios)>
		//    5    9:lreturn         
		}

		public HashSet successfulBssids(String s)
		{
			return native_successfulBssids(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #139 <Method HashSet native_successfulBssids(long, String)>
		//    5    9:areturn         
		}

		public HashMap successfulNetworkInterfaces()
		{
			return native_successfulNetworkInterfaces(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #143 <Method HashMap native_successfulNetworkInterfaces(long)>
		//    4    8:areturn         
		}

		public HashSet successfulSsids(String s)
		{
			return native_successfulSsids(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #146 <Method HashSet native_successfulSsids(long, String)>
		//    5    9:areturn         
		}

		public short totalDiscountedFailures()
		{
			return native_totalDiscountedFailures(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #150 <Method short native_totalDiscountedFailures(long)>
		//    4    8:ireturn         
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
		//    1    1:invokespecial   #19  <Method void NetworkStatistics()>
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


	public NetworkStatistics()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public abstract NetworkStatisticsToken beginMeasurement(NetworkScenarios networkscenarios, int i);

	public abstract void clearAssetStatistics(String s);

	public abstract void countFailures();

	public abstract void endAssetMeasurement(String s, NetworkStatisticsToken networkstatisticstoken, NetworkStatisticsResult networkstatisticsresult, String s1);

	public abstract void endMeasurement(NetworkStatisticsToken networkstatisticstoken, NetworkStatisticsResult networkstatisticsresult, String s);

	public abstract HashMap failureNetworkInterfaces();

	public abstract void ignoreFailures();

	public abstract void logStatistics();

	public abstract void resetStatistics();

	public abstract void setHandlers(PersistenceHandler persistencehandler, DeviceInfoHandler deviceinfohandler);

	public abstract long statisticFailureAverageTimeMsec(NetworkScenarios networkscenarios);

	public abstract long statisticFailureCount(NetworkScenarios networkscenarios);

	public abstract long statisticFailureLowSignalStrengthCount(NetworkScenarios networkscenarios);

	public abstract long statisticSuccessAverageTimeMsec(NetworkScenarios networkscenarios);

	public abstract long statisticSuccessCount(NetworkScenarios networkscenarios);

	public abstract long statisticTotalAttempts(NetworkScenarios networkscenarios);

	public abstract HashSet successfulBssids(String s);

	public abstract HashMap successfulNetworkInterfaces();

	public abstract HashSet successfulSsids(String s);

	public abstract short totalDiscountedFailures();

	public static final String NETWORK_INTERFACE_UNKNOWN = "u";
}
