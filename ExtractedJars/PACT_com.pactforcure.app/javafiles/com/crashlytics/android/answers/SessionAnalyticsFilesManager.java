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
		return (new StringBuilder()).append("sa").append("_").append(uuid.toString()).append("_").append(currentTimeProvider.getCurrentTimeMillis()).append(".tap").toString();
	//    2    4:new             #33  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #36  <Method void StringBuilder()>
	//    5   11:ldc1            #12  <String "sa">
	//    6   13:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:ldc1            #42  <String "_">
	//    8   18:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #45  <Method String UUID.toString()>
	//   11   25:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:ldc1            #42  <String "_">
	//   13   30:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   14   33:aload_0         
	//   15   34:getfield        #49  <Field CurrentTimeProvider currentTimeProvider>
	//   16   37:invokeinterface #55  <Method long CurrentTimeProvider.getCurrentTimeMillis()>
	//   17   42:invokevirtual   #58  <Method StringBuilder StringBuilder.append(long)>
	//   18   45:ldc1            #9   <String ".tap">
	//   19   47:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   20   50:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   21   53:areturn         
	}

	protected int getMaxByteSizePerFile()
	{
		if(analyticsSettingsData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field AnalyticsSettingsData analyticsSettingsData>
	//*   2    4:ifnonnull       12
			return super.getMaxByteSizePerFile();
	//    3    7:aload_0         
	//    4    8:invokespecial   #65  <Method int EventsFilesManager.getMaxByteSizePerFile()>
	//    5   11:ireturn         
		else
			return analyticsSettingsData.maxByteSizePerFile;
	//    6   12:aload_0         
	//    7   13:getfield        #63  <Field AnalyticsSettingsData analyticsSettingsData>
	//    8   16:getfield        #71  <Field int AnalyticsSettingsData.maxByteSizePerFile>
	//    9   19:ireturn         
	}

	protected int getMaxFilesToKeep()
	{
		if(analyticsSettingsData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field AnalyticsSettingsData analyticsSettingsData>
	//*   2    4:ifnonnull       12
			return super.getMaxFilesToKeep();
	//    3    7:aload_0         
	//    4    8:invokespecial   #74  <Method int EventsFilesManager.getMaxFilesToKeep()>
	//    5   11:ireturn         
		else
			return analyticsSettingsData.maxPendingSendFileCount;
	//    6   12:aload_0         
	//    7   13:getfield        #63  <Field AnalyticsSettingsData analyticsSettingsData>
	//    8   16:getfield        #77  <Field int AnalyticsSettingsData.maxPendingSendFileCount>
	//    9   19:ireturn         
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
