// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

// Referenced classes of package com.crashlytics.android.answers:
//			FirebaseAnalyticsEventMapper, AppMeasurementEventLogger, FirebaseAnalyticsEvent, EventLogger, 
//			SessionEvent

class FirebaseAnalyticsApiAdapter
{

	public FirebaseAnalyticsApiAdapter(Context context1)
	{
		this(context1, new FirebaseAnalyticsEventMapper());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #14  <Class FirebaseAnalyticsEventMapper>
	//    3    5:dup             
	//    4    6:invokespecial   #17  <Method void FirebaseAnalyticsEventMapper()>
	//    5    9:invokespecial   #20  <Method void FirebaseAnalyticsApiAdapter(Context, FirebaseAnalyticsEventMapper)>
	//    6   12:return          
	}

	public FirebaseAnalyticsApiAdapter(Context context1, FirebaseAnalyticsEventMapper firebaseanalyticseventmapper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Context context>
		eventMapper = firebaseanalyticseventmapper;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field FirebaseAnalyticsEventMapper eventMapper>
	//    8   14:return          
	}

	public EventLogger getFirebaseAnalytics()
	{
		if(eventLogger == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field EventLogger eventLogger>
	//*   2    4:ifnonnull       18
			eventLogger = AppMeasurementEventLogger.getEventLogger(context);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field Context context>
	//    6   12:invokestatic    #36  <Method EventLogger AppMeasurementEventLogger.getEventLogger(Context)>
	//    7   15:putfield        #30  <Field EventLogger eventLogger>
		return eventLogger;
	//    8   18:aload_0         
	//    9   19:getfield        #30  <Field EventLogger eventLogger>
	//   10   22:areturn         
	}

	public void processEvent(SessionEvent sessionevent)
	{
		Object obj = ((Object) (getFirebaseAnalytics()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method EventLogger getFirebaseAnalytics()>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       22
		{
			Fabric.getLogger().d("Answers", "Firebase analytics logging was enabled, but not available...");
	//    5    9:invokestatic    #46  <Method Logger Fabric.getLogger()>
	//    6   12:ldc1            #48  <String "Answers">
	//    7   14:ldc1            #50  <String "Firebase analytics logging was enabled, but not available...">
	//    8   16:invokeinterface #56  <Method void Logger.d(String, String)>
			return;
	//    9   21:return          
		}
		Object obj1 = ((Object) (eventMapper.mapEvent(sessionevent)));
	//   10   22:aload_0         
	//   11   23:getfield        #26  <Field FirebaseAnalyticsEventMapper eventMapper>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #60  <Method FirebaseAnalyticsEvent FirebaseAnalyticsEventMapper.mapEvent(SessionEvent)>
	//   14   30:astore_3        
		if(obj1 == null)
	//*  15   31:aload_3         
	//*  16   32:ifnonnull       73
		{
			obj = ((Object) (Fabric.getLogger()));
	//   17   35:invokestatic    #46  <Method Logger Fabric.getLogger()>
	//   18   38:astore_2        
			obj1 = ((Object) (new StringBuilder()));
	//   19   39:new             #62  <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #63  <Method void StringBuilder()>
	//   22   46:astore_3        
			((StringBuilder) (obj1)).append("Fabric event was not mappable to Firebase event: ");
	//   23   47:aload_3         
	//   24   48:ldc1            #65  <String "Fabric event was not mappable to Firebase event: ">
	//   25   50:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
			((StringBuilder) (obj1)).append(((Object) (sessionevent)));
	//   27   54:aload_3         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #72  <Method StringBuilder StringBuilder.append(Object)>
	//   30   59:pop             
			((Logger) (obj)).d("Answers", ((StringBuilder) (obj1)).toString());
	//   31   60:aload_2         
	//   32   61:ldc1            #48  <String "Answers">
	//   33   63:aload_3         
	//   34   64:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   35   67:invokeinterface #56  <Method void Logger.d(String, String)>
			return;
	//   36   72:return          
		}
		((EventLogger) (obj)).logEvent(((FirebaseAnalyticsEvent) (obj1)).getEventName(), ((FirebaseAnalyticsEvent) (obj1)).getEventParams());
	//   37   73:aload_2         
	//   38   74:aload_3         
	//   39   75:invokevirtual   #81  <Method String FirebaseAnalyticsEvent.getEventName()>
	//   40   78:aload_3         
	//   41   79:invokevirtual   #85  <Method android.os.Bundle FirebaseAnalyticsEvent.getEventParams()>
	//   42   82:invokeinterface #91  <Method void EventLogger.logEvent(String, android.os.Bundle)>
		if("levelEnd".equals(((Object) (sessionevent.predefinedType))))
	//*  43   87:ldc1            #93  <String "levelEnd">
	//*  44   89:aload_1         
	//*  45   90:getfield        #99  <Field String SessionEvent.predefinedType>
	//*  46   93:invokevirtual   #105 <Method boolean String.equals(Object)>
	//*  47   96:ifeq            111
			((EventLogger) (obj)).logEvent("post_score", ((FirebaseAnalyticsEvent) (obj1)).getEventParams());
	//   48   99:aload_2         
	//   49  100:ldc1            #107 <String "post_score">
	//   50  102:aload_3         
	//   51  103:invokevirtual   #85  <Method android.os.Bundle FirebaseAnalyticsEvent.getEventParams()>
	//   52  106:invokeinterface #91  <Method void EventLogger.logEvent(String, android.os.Bundle)>
	//   53  111:return          
	}

	private final Context context;
	private EventLogger eventLogger;
	private final FirebaseAnalyticsEventMapper eventMapper;
}
