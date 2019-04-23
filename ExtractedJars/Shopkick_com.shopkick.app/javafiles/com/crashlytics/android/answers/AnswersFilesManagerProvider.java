// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.services.common.SystemCurrentTimeProvider;
import io.fabric.sdk.android.services.events.GZIPQueueFileEventStorage;
import io.fabric.sdk.android.services.persistence.FileStore;
import java.io.IOException;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionEventTransform, SessionAnalyticsFilesManager

class AnswersFilesManagerProvider
{

	public AnswersFilesManagerProvider(Context context1, FileStore filestore)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Context context>
		fileStore = filestore;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field FileStore fileStore>
	//    8   14:return          
	}

	public SessionAnalyticsFilesManager getAnalyticsFilesManager()
		throws IOException
	{
		if(Looper.myLooper() != Looper.getMainLooper())
	//*   0    0:invokestatic    #35  <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #38  <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpeq       67
		{
			SessionEventTransform sessioneventtransform = new SessionEventTransform();
	//    3    9:new             #40  <Class SessionEventTransform>
	//    4   12:dup             
	//    5   13:invokespecial   #41  <Method void SessionEventTransform()>
	//    6   16:astore_1        
			SystemCurrentTimeProvider systemcurrenttimeprovider = new SystemCurrentTimeProvider();
	//    7   17:new             #43  <Class SystemCurrentTimeProvider>
	//    8   20:dup             
	//    9   21:invokespecial   #44  <Method void SystemCurrentTimeProvider()>
	//   10   24:astore_2        
			Object obj = ((Object) (fileStore.getFilesDir()));
	//   11   25:aload_0         
	//   12   26:getfield        #24  <Field FileStore fileStore>
	//   13   29:invokeinterface #50  <Method java.io.File FileStore.getFilesDir()>
	//   14   34:astore_3        
			obj = ((Object) (new GZIPQueueFileEventStorage(context, ((java.io.File) (obj)), "session_analytics.tap", "session_analytics_to_send")));
	//   15   35:new             #52  <Class GZIPQueueFileEventStorage>
	//   16   38:dup             
	//   17   39:aload_0         
	//   18   40:getfield        #22  <Field Context context>
	//   19   43:aload_3         
	//   20   44:ldc1            #8   <String "session_analytics.tap">
	//   21   46:ldc1            #11  <String "session_analytics_to_send">
	//   22   48:invokespecial   #55  <Method void GZIPQueueFileEventStorage(Context, java.io.File, String, String)>
	//   23   51:astore_3        
			return new SessionAnalyticsFilesManager(context, sessioneventtransform, ((io.fabric.sdk.android.services.common.CurrentTimeProvider) (systemcurrenttimeprovider)), ((io.fabric.sdk.android.services.events.EventsStorage) (obj)));
	//   24   52:new             #57  <Class SessionAnalyticsFilesManager>
	//   25   55:dup             
	//   26   56:aload_0         
	//   27   57:getfield        #22  <Field Context context>
	//   28   60:aload_1         
	//   29   61:aload_2         
	//   30   62:aload_3         
	//   31   63:invokespecial   #60  <Method void SessionAnalyticsFilesManager(Context, SessionEventTransform, io.fabric.sdk.android.services.common.CurrentTimeProvider, io.fabric.sdk.android.services.events.EventsStorage)>
	//   32   66:areturn         
		} else
		{
			throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
	//   33   67:new             #62  <Class IllegalStateException>
	//   34   70:dup             
	//   35   71:ldc1            #64  <String "AnswersFilesManagerProvider cannot be called on the main thread">
	//   36   73:invokespecial   #67  <Method void IllegalStateException(String)>
	//   37   76:athrow          
		}
	}

	static final String SESSION_ANALYTICS_FILE_NAME = "session_analytics.tap";
	static final String SESSION_ANALYTICS_TO_SEND_DIR = "session_analytics_to_send";
	final Context context;
	final FileStore fileStore;
}
