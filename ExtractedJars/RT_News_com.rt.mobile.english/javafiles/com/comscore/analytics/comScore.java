// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.analytics;

import android.content.Context;
import com.comscore.applications.EventType;
import com.comscore.utils.TransmissionMode;
import com.comscore.utils.task.TaskExecutor;
import java.util.HashMap;

// Referenced classes of package com.comscore.analytics:
//			Core

public class comScore
{

	public comScore()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static void aggregate(HashMap hashmap)
	{
		a.notify(EventType.AGGREGATE, hashmap, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:getstatic       #25  <Field EventType EventType.AGGREGATE>
	//    2    6:aload_0         
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #29  <Method void Core.notify(EventType, HashMap, boolean)>
	//    5   11:return          
	}

	public static void allowLiveTransmission(TransmissionMode transmissionmode)
	{
		a.allowLiveTransmission(transmissionmode, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:aload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #36  <Method void Core.allowLiveTransmission(TransmissionMode, boolean)>
	//    4    8:return          
	}

	public static void allowOfflineTransmission(TransmissionMode transmissionmode)
	{
		a.allowOfflineTransmission(transmissionmode, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:aload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #39  <Method void Core.allowOfflineTransmission(TransmissionMode, boolean)>
	//    4    8:return          
	}

	public static void disableAutoUpdate()
	{
		a.disableAutoUpdate();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #42  <Method void Core.disableAutoUpdate()>
	//    2    6:return          
	}

	public static void enableAutoUpdate()
	{
		enableAutoUpdate(60, true);
	//    0    0:bipush          60
	//    1    2:iconst_1        
	//    2    3:invokestatic    #46  <Method void enableAutoUpdate(int, boolean)>
	//    3    6:return          
	}

	public static void enableAutoUpdate(int i)
	{
		enableAutoUpdate(i, true);
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #46  <Method void enableAutoUpdate(int, boolean)>
	//    3    5:return          
	}

	public static void enableAutoUpdate(int i, boolean flag)
	{
		a.enableAutoUpdate(i, flag, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #50  <Method void Core.enableAutoUpdate(int, boolean, boolean)>
	//    5    9:return          
	}

	public static void flushCache()
	{
		a.flush(true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:iconst_1        
	//    2    4:invokevirtual   #55  <Method void Core.flush(boolean)>
	//    3    7:return          
	}

	public static String getAppName()
	{
		return a.getAppName();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #59  <Method String Core.getAppName()>
	//    2    6:areturn         
	}

	public static String getAutoStartLabel(String s)
	{
		return a.getAutoStartLabel(s);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #63  <Method String Core.getAutoStartLabel(String)>
	//    3    7:areturn         
	}

	public static HashMap getAutoStartLabels()
	{
		return a.getAutoStartLabels();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #67  <Method HashMap Core.getAutoStartLabels()>
	//    2    6:areturn         
	}

	public static long getCacheFlushingInterval()
	{
		return a.getCacheFlushingInterval();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #72  <Method long Core.getCacheFlushingInterval()>
	//    2    6:lreturn         
	}

	public static int getCacheMaxBatchFiles()
	{
		return a.getCacheMaxBatchFiles();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #76  <Method int Core.getCacheMaxBatchFiles()>
	//    2    6:ireturn         
	}

	public static int getCacheMaxFlushesInARow()
	{
		return a.getCacheMaxFlushesInARow();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #79  <Method int Core.getCacheMaxFlushesInARow()>
	//    2    6:ireturn         
	}

	public static int getCacheMaxMeasurements()
	{
		return a.getCacheMaxMeasurements();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #82  <Method int Core.getCacheMaxMeasurements()>
	//    2    6:ireturn         
	}

	public static long getCacheMeasurementExpiry()
	{
		return a.getCacheMeasurementExpiry();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #85  <Method long Core.getCacheMeasurementExpiry()>
	//    2    6:lreturn         
	}

	public static long getCacheMinutesToRetry()
	{
		return a.getCacheMinutesToRetry();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #88  <Method long Core.getCacheMinutesToRetry()>
	//    2    6:lreturn         
	}

	public static Core getCore()
	{
		return a;
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:areturn         
	}

	public static String getCustomerC2()
	{
		return a.getCustomerC2();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #93  <Method String Core.getCustomerC2()>
	//    2    6:areturn         
	}

	public static boolean getErrorHandlingEnabled()
	{
		return a.getErrorHandlingEnabled();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #97  <Method boolean Core.getErrorHandlingEnabled()>
	//    2    6:ireturn         
	}

	public static long getGenesis()
	{
		return a.getGenesis();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #100 <Method long Core.getGenesis()>
	//    2    6:lreturn         
	}

	public static String getLabel(String s)
	{
		return a.getLabel(s);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #103 <Method String Core.getLabel(String)>
	//    3    7:areturn         
	}

	public static HashMap getLabels()
	{
		return a.getLabels();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #106 <Method HashMap Core.getLabels()>
	//    2    6:areturn         
	}

	public static TransmissionMode getLiveTransmissionMode()
	{
		return a.getLiveTransmissionMode();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #110 <Method TransmissionMode Core.getLiveTransmissionMode()>
	//    2    6:areturn         
	}

	public static String[] getMeasurementLabelOrder()
	{
		return a.getMeasurementLabelOrder();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #114 <Method String[] Core.getMeasurementLabelOrder()>
	//    2    6:areturn         
	}

	public static TransmissionMode getOfflineTransmissionMode()
	{
		return a.getOfflineTransmissionMode();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #117 <Method TransmissionMode Core.getOfflineTransmissionMode()>
	//    2    6:areturn         
	}

	public static String getPixelURL()
	{
		return a.getPixelURL();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #120 <Method String Core.getPixelURL()>
	//    2    6:areturn         
	}

	public static String getPublisherSecret()
	{
		return a.getPublisherSecret();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #123 <Method String Core.getPublisherSecret()>
	//    2    6:areturn         
	}

	public static String getVersion()
	{
		return a.getVersion();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #126 <Method String Core.getVersion()>
	//    2    6:areturn         
	}

	public static String getVisitorID()
	{
		return a.getVisitorId();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #130 <Method String Core.getVisitorId()>
	//    2    6:areturn         
	}

	public static void hidden()
	{
		a.notify(EventType.HIDDEN, new HashMap(), true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:getstatic       #134 <Field EventType EventType.HIDDEN>
	//    2    6:new             #136 <Class HashMap>
	//    3    9:dup             
	//    4   10:invokespecial   #137 <Method void HashMap()>
	//    5   13:iconst_1        
	//    6   14:invokevirtual   #29  <Method void Core.notify(EventType, HashMap, boolean)>
	//    7   17:return          
	}

	public static void hidden(HashMap hashmap)
	{
		a.notify(EventType.HIDDEN, hashmap, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:getstatic       #134 <Field EventType EventType.HIDDEN>
	//    2    6:aload_0         
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #29  <Method void Core.notify(EventType, HashMap, boolean)>
	//    5   11:return          
	}

	public static boolean isAutoStartEnabled()
	{
		return a.isAutoStartEnabled();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #140 <Method boolean Core.isAutoStartEnabled()>
	//    2    6:ireturn         
	}

	public static boolean isEnabled()
	{
		return a.isEnabled();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #143 <Method boolean Core.isEnabled()>
	//    2    6:ireturn         
	}

	public static boolean isKeepAliveEnabled()
	{
		return a.isKeepAliveEnabled();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #146 <Method boolean Core.isKeepAliveEnabled()>
	//    2    6:ireturn         
	}

	public static boolean isSecure()
	{
		return a.isSecure();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #149 <Method boolean Core.isSecure()>
	//    2    6:ireturn         
	}

	public static void onEnterForeground()
	{
		a.onEnterForeground();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #152 <Method void Core.onEnterForeground()>
	//    2    6:return          
	}

	public static void onExitForeground()
	{
		a.onExitForeground();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #155 <Method void Core.onExitForeground()>
	//    2    6:return          
	}

	public static void onUserInteraction()
	{
		a.onUserInteraction();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #158 <Method void Core.onUserInteraction()>
	//    2    6:return          
	}

	public static void onUxActive()
	{
		a.onUxActive();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #161 <Method void Core.onUxActive()>
	//    2    6:return          
	}

	public static void onUxInactive()
	{
		a.onUxInactive();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #164 <Method void Core.onUxInactive()>
	//    2    6:return          
	}

	public static void setAppContext(Context context)
	{
		a.setAppContext(context);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #168 <Method void Core.setAppContext(Context)>
	//    3    7:return          
	}

	public static void setAppName(String s)
	{
		a.setAppName(s, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:aload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #173 <Method void Core.setAppName(String, boolean)>
	//    4    8:return          
	}

	public static void setAutoStartEnabled(boolean flag)
	{
		a.setAutoStartEnabled(flag, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:iload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #177 <Method void Core.setAutoStartEnabled(boolean, boolean)>
	//    4    8:return          
	}

	public static void setAutoStartLabel(String s, String s1)
	{
		a.setAutoStartLabel(s, s1);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #181 <Method void Core.setAutoStartLabel(String, String)>
	//    4    8:return          
	}

	public static void setAutoStartLabels(HashMap hashmap)
	{
		a.setAutoStartLabels(hashmap);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #184 <Method void Core.setAutoStartLabels(HashMap)>
	//    3    7:return          
	}

	public static void setCacheFlushingInterval(long l)
	{
		a.setCacheFlushingInterval(l, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:lload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #189 <Method void Core.setCacheFlushingInterval(long, boolean)>
	//    4    8:return          
	}

	public static void setCacheMaxBatchFiles(int i)
	{
		a.setCacheMaxBatchFiles(i, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:iload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #192 <Method void Core.setCacheMaxBatchFiles(int, boolean)>
	//    4    8:return          
	}

	public static void setCacheMaxFlushesInARow(int i)
	{
		a.setCacheMaxFlushesInARow(i, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:iload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #195 <Method void Core.setCacheMaxFlushesInARow(int, boolean)>
	//    4    8:return          
	}

	public static void setCacheMaxMeasurements(int i)
	{
		a.setCacheMaxMeasurements(i, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:iload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #198 <Method void Core.setCacheMaxMeasurements(int, boolean)>
	//    4    8:return          
	}

	public static void setCacheMeasurementExpiry(int i)
	{
		a.setCacheMeasurementExpiry(i, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:iload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #201 <Method void Core.setCacheMeasurementExpiry(int, boolean)>
	//    4    8:return          
	}

	public static void setCacheMinutesToRetry(int i)
	{
		a.setCacheMinutesToRetry(i, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:iload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #204 <Method void Core.setCacheMinutesToRetry(int, boolean)>
	//    4    8:return          
	}

	public static void setCustomerC2(String s)
	{
		a.setCustomerC2(s, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:aload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #207 <Method void Core.setCustomerC2(String, boolean)>
	//    4    8:return          
	}

	public static void setDebug(boolean flag)
	{
		a.setDebug(flag);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:iload_0         
	//    2    4:invokevirtual   #210 <Method void Core.setDebug(boolean)>
	//    3    7:return          
	}

	public static void setEnabled(boolean flag)
	{
		a.setEnabled(flag);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:iload_0         
	//    2    4:invokevirtual   #213 <Method void Core.setEnabled(boolean)>
	//    3    7:return          
	}

	public static void setErrorHandlingEnabled(boolean flag)
	{
		a.setErrorHandlingEnabled(flag);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:iload_0         
	//    2    4:invokevirtual   #216 <Method void Core.setErrorHandlingEnabled(boolean)>
	//    3    7:return          
	}

	public static void setKeepAliveEnabled(boolean flag)
	{
		a.setKeepAliveEnabled(flag, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:iload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #219 <Method void Core.setKeepAliveEnabled(boolean, boolean)>
	//    4    8:return          
	}

	public static void setLabel(String s, String s1)
	{
		a.setLabel(s, s1, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #223 <Method void Core.setLabel(String, String, boolean)>
	//    5    9:return          
	}

	public static void setLabels(HashMap hashmap)
	{
		a.setLabels(hashmap, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:aload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #227 <Method void Core.setLabels(HashMap, boolean)>
	//    4    8:return          
	}

	public static void setMeasurementLabelOrder(String as[])
	{
		a.setMeasurementLabelOrder(as, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:aload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #232 <Method void Core.setMeasurementLabelOrder(String[], boolean)>
	//    4    8:return          
	}

	public static void setOfflineURL(String s)
	{
		a.setOfflineURL(s);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #235 <Method void Core.setOfflineURL(String)>
	//    3    7:return          
	}

	public static void setPixelURL(String s)
	{
		a.setPixelURL(s, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:aload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #238 <Method void Core.setPixelURL(String, boolean)>
	//    4    8:return          
	}

	public static void setPublisherSecret(String s)
	{
		a.setPublisherSecret(s, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:aload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #241 <Method void Core.setPublisherSecret(String, boolean)>
	//    4    8:return          
	}

	public static void setSecure(boolean flag)
	{
		a.setSecure(flag, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:iload_0         
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #244 <Method void Core.setSecure(boolean, boolean)>
	//    4    8:return          
	}

	public static void start()
	{
		a.notify(EventType.START, new HashMap(), true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:getstatic       #248 <Field EventType EventType.START>
	//    2    6:new             #136 <Class HashMap>
	//    3    9:dup             
	//    4   10:invokespecial   #137 <Method void HashMap()>
	//    5   13:iconst_1        
	//    6   14:invokevirtual   #29  <Method void Core.notify(EventType, HashMap, boolean)>
	//    7   17:return          
	}

	public static void start(HashMap hashmap)
	{
		a.notify(EventType.START, hashmap, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:getstatic       #248 <Field EventType EventType.START>
	//    2    6:aload_0         
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #29  <Method void Core.notify(EventType, HashMap, boolean)>
	//    5   11:return          
	}

	public static void update()
	{
		a.update();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #251 <Method void Core.update()>
	//    2    6:return          
	}

	public static void view()
	{
		a.notify(EventType.VIEW, new HashMap(), true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:getstatic       #255 <Field EventType EventType.VIEW>
	//    2    6:new             #136 <Class HashMap>
	//    3    9:dup             
	//    4   10:invokespecial   #137 <Method void HashMap()>
	//    5   13:iconst_1        
	//    6   14:invokevirtual   #29  <Method void Core.notify(EventType, HashMap, boolean)>
	//    7   17:return          
	}

	public static void view(HashMap hashmap)
	{
		a.notify(EventType.VIEW, hashmap, true);
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:getstatic       #255 <Field EventType EventType.VIEW>
	//    2    6:aload_0         
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #29  <Method void Core.notify(EventType, HashMap, boolean)>
	//    5   11:return          
	}

	public static void waitForTasks()
	{
		a.getTaskExecutor().waitForTasks();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #260 <Method TaskExecutor Core.getTaskExecutor()>
	//    2    6:invokevirtual   #264 <Method void TaskExecutor.waitForTasks()>
	//    3    9:return          
	}

	public boolean isAutoUpdateEnabled()
	{
		return a.isAutoUpdateEnabled();
	//    0    0:getstatic       #15  <Field Core a>
	//    1    3:invokevirtual   #267 <Method boolean Core.isAutoUpdateEnabled()>
	//    2    6:ireturn         
	}

	private static Core a = new Core();

	static 
	{
	//    0    0:new             #10  <Class Core>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void Core()>
	//    3    7:putstatic       #15  <Field Core a>
	//*   4   10:return          
	}
}
