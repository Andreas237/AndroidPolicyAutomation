// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.events.EventsFilesManager;
import io.fabric.sdk.android.services.events.EventsStorage;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.io.IOException;
import java.util.UUID;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionEventTransform

class SessionAnalyticsFilesManager extends EventsFilesManager
{

	SessionAnalyticsFilesManager(Context context, SessionEventTransform sessioneventtransform, CurrentTimeProvider currenttimeprovider, EventsStorage eventsstorage)
		throws IOException
	{
		super(context, ((io.fabric.sdk.android.services.events.EventTransform) (sessioneventtransform)), currenttimeprovider, eventsstorage, 100);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:bipush          100
	//    6    8:invokespecial   #21  <Method void EventsFilesManager(Context, io.fabric.sdk.android.services.events.EventTransform, CurrentTimeProvider, EventsStorage, int)>
	//    7   11:return          
	}

	protected String generateUniqueRollOverFileName()
	{
		UUID uuid = UUID.randomUUID();
	//    0    0:invokestatic    #31  <Method UUID UUID.randomUUID()>
	//    1    3:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #33  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #36  <Method void StringBuilder()>
	//    5   11:astore_2        
		stringbuilder.append("sa");
	//    6   12:aload_2         
	//    7   13:ldc1            #12  <String "sa">
	//    8   15:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append("_");
	//   10   19:aload_2         
	//   11   20:ldc1            #42  <String "_">
	//   12   22:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append(uuid.toString());
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #45  <Method String UUID.toString()>
	//   17   31:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		stringbuilder.append("_");
	//   19   35:aload_2         
	//   20   36:ldc1            #42  <String "_">
	//   21   38:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
		stringbuilder.append(currentTimeProvider.getCurrentTimeMillis());
	//   23   42:aload_2         
	//   24   43:aload_0         
	//   25   44:getfield        #49  <Field CurrentTimeProvider currentTimeProvider>
	//   26   47:invokeinterface #55  <Method long CurrentTimeProvider.getCurrentTimeMillis()>
	//   27   52:invokevirtual   #58  <Method StringBuilder StringBuilder.append(long)>
	//   28   55:pop             
		stringbuilder.append(".tap");
	//   29   56:aload_2         
	//   30   57:ldc1            #9   <String ".tap">
	//   31   59:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   32   62:pop             
		return stringbuilder.toString();
	//   33   63:aload_2         
	//   34   64:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   35   67:areturn         
	}

	protected int getMaxByteSizePerFile()
	{
		AnalyticsSettingsData analyticssettingsdata = analyticsSettingsData;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field AnalyticsSettingsData analyticsSettingsData>
	//    2    4:astore_1        
		if(analyticssettingsdata == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			return super.getMaxByteSizePerFile();
	//    5    9:aload_0         
	//    6   10:invokespecial   #65  <Method int EventsFilesManager.getMaxByteSizePerFile()>
	//    7   13:ireturn         
		else
			return analyticssettingsdata.maxByteSizePerFile;
	//    8   14:aload_1         
	//    9   15:getfield        #71  <Field int AnalyticsSettingsData.maxByteSizePerFile>
	//   10   18:ireturn         
	}

	protected int getMaxFilesToKeep()
	{
		AnalyticsSettingsData analyticssettingsdata = analyticsSettingsData;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field AnalyticsSettingsData analyticsSettingsData>
	//    2    4:astore_1        
		if(analyticssettingsdata == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			return super.getMaxFilesToKeep();
	//    5    9:aload_0         
	//    6   10:invokespecial   #74  <Method int EventsFilesManager.getMaxFilesToKeep()>
	//    7   13:ireturn         
		else
			return analyticssettingsdata.maxPendingSendFileCount;
	//    8   14:aload_1         
	//    9   15:getfield        #77  <Field int AnalyticsSettingsData.maxPendingSendFileCount>
	//   10   18:ireturn         
	}

	void setAnalyticsSettingsData(AnalyticsSettingsData analyticssettingsdata)
	{
		analyticsSettingsData = analyticssettingsdata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field AnalyticsSettingsData analyticsSettingsData>
	//    3    5:return          
	}

	private static final String SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION = ".tap";
	private static final String SESSION_ANALYTICS_TO_SEND_FILE_PREFIX = "sa";
	private AnalyticsSettingsData analyticsSettingsData;
}
