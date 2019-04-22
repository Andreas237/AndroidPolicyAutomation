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
	//    6    8:invokespecial   #14  <Method void EventsFilesManager(Context, io.fabric.sdk.android.services.events.EventTransform, CurrentTimeProvider, EventsStorage, int)>
	//    7   11:return          
	}

	protected String generateUniqueRollOverFileName()
	{
		UUID uuid = UUID.randomUUID();
	//    0    0:invokestatic    #24  <Method UUID UUID.randomUUID()>
	//    1    3:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #26  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #29  <Method void StringBuilder()>
	//    5   11:astore_2        
		stringbuilder.append("sa");
	//    6   12:aload_2         
	//    7   13:ldc1            #31  <String "sa">
	//    8   15:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append("_");
	//   10   19:aload_2         
	//   11   20:ldc1            #37  <String "_">
	//   12   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append(uuid.toString());
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #40  <Method String UUID.toString()>
	//   17   31:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		stringbuilder.append("_");
	//   19   35:aload_2         
	//   20   36:ldc1            #37  <String "_">
	//   21   38:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
		stringbuilder.append(currentTimeProvider.getCurrentTimeMillis());
	//   23   42:aload_2         
	//   24   43:aload_0         
	//   25   44:getfield        #44  <Field CurrentTimeProvider currentTimeProvider>
	//   26   47:invokeinterface #50  <Method long CurrentTimeProvider.getCurrentTimeMillis()>
	//   27   52:invokevirtual   #53  <Method StringBuilder StringBuilder.append(long)>
	//   28   55:pop             
		stringbuilder.append(".tap");
	//   29   56:aload_2         
	//   30   57:ldc1            #55  <String ".tap">
	//   31   59:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   32   62:pop             
		return stringbuilder.toString();
	//   33   63:aload_2         
	//   34   64:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   35   67:areturn         
	}

	protected int getMaxByteSizePerFile()
	{
		AnalyticsSettingsData analyticssettingsdata = analyticsSettingsData;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field AnalyticsSettingsData analyticsSettingsData>
	//    2    4:astore_1        
		if(analyticssettingsdata == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			return super.getMaxByteSizePerFile();
	//    5    9:aload_0         
	//    6   10:invokespecial   #62  <Method int EventsFilesManager.getMaxByteSizePerFile()>
	//    7   13:ireturn         
		else
			return analyticssettingsdata.maxByteSizePerFile;
	//    8   14:aload_1         
	//    9   15:getfield        #68  <Field int AnalyticsSettingsData.maxByteSizePerFile>
	//   10   18:ireturn         
	}

	protected int getMaxFilesToKeep()
	{
		AnalyticsSettingsData analyticssettingsdata = analyticsSettingsData;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field AnalyticsSettingsData analyticsSettingsData>
	//    2    4:astore_1        
		if(analyticssettingsdata == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			return super.getMaxFilesToKeep();
	//    5    9:aload_0         
	//    6   10:invokespecial   #71  <Method int EventsFilesManager.getMaxFilesToKeep()>
	//    7   13:ireturn         
		else
			return analyticssettingsdata.maxPendingSendFileCount;
	//    8   14:aload_1         
	//    9   15:getfield        #74  <Field int AnalyticsSettingsData.maxPendingSendFileCount>
	//   10   18:ireturn         
	}

	void setAnalyticsSettingsData(AnalyticsSettingsData analyticssettingsdata)
	{
		analyticsSettingsData = analyticssettingsdata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field AnalyticsSettingsData analyticsSettingsData>
	//    3    5:return          
	}

	private AnalyticsSettingsData analyticsSettingsData;
}
