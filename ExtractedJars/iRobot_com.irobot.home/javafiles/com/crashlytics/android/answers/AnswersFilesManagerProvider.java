// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Looper;
import b.a.a.a.a.b.t;
import b.a.a.a.a.d.g;
import b.a.a.a.a.f.a;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionEventTransform, SessionAnalyticsFilesManager

class AnswersFilesManagerProvider
{

	public AnswersFilesManagerProvider(Context context1, a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Context context>
		fileStore = a1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field a fileStore>
	//    8   14:return          
	}

	public SessionAnalyticsFilesManager getAnalyticsFilesManager()
	{
		if(Looper.myLooper() == Looper.getMainLooper())
	//*   0    0:invokestatic    #33  <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #36  <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpne       19
		{
			throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
	//    3    9:new             #38  <Class IllegalStateException>
	//    4   12:dup             
	//    5   13:ldc1            #40  <String "AnswersFilesManagerProvider cannot be called on the main thread">
	//    6   15:invokespecial   #43  <Method void IllegalStateException(String)>
	//    7   18:athrow          
		} else
		{
			SessionEventTransform sessioneventtransform = new SessionEventTransform();
	//    8   19:new             #45  <Class SessionEventTransform>
	//    9   22:dup             
	//   10   23:invokespecial   #46  <Method void SessionEventTransform()>
	//   11   26:astore_1        
			t t1 = new t();
	//   12   27:new             #48  <Class t>
	//   13   30:dup             
	//   14   31:invokespecial   #49  <Method void t()>
	//   15   34:astore_2        
			Object obj = ((Object) (fileStore.a()));
	//   16   35:aload_0         
	//   17   36:getfield        #24  <Field a fileStore>
	//   18   39:invokeinterface #55  <Method java.io.File a.a()>
	//   19   44:astore_3        
			obj = ((Object) (new g(context, ((java.io.File) (obj)), "session_analytics.tap", "session_analytics_to_send")));
	//   20   45:new             #57  <Class g>
	//   21   48:dup             
	//   22   49:aload_0         
	//   23   50:getfield        #22  <Field Context context>
	//   24   53:aload_3         
	//   25   54:ldc1            #8   <String "session_analytics.tap">
	//   26   56:ldc1            #11  <String "session_analytics_to_send">
	//   27   58:invokespecial   #60  <Method void g(Context, java.io.File, String, String)>
	//   28   61:astore_3        
			return new SessionAnalyticsFilesManager(context, sessioneventtransform, ((b.a.a.a.a.b.k) (t1)), ((b.a.a.a.a.d.c) (obj)));
	//   29   62:new             #62  <Class SessionAnalyticsFilesManager>
	//   30   65:dup             
	//   31   66:aload_0         
	//   32   67:getfield        #22  <Field Context context>
	//   33   70:aload_1         
	//   34   71:aload_2         
	//   35   72:aload_3         
	//   36   73:invokespecial   #65  <Method void SessionAnalyticsFilesManager(Context, SessionEventTransform, b.a.a.a.a.b.k, b.a.a.a.a.d.c)>
	//   37   76:areturn         
		}
	}

	static final String SESSION_ANALYTICS_FILE_NAME = "session_analytics.tap";
	static final String SESSION_ANALYTICS_TO_SEND_DIR = "session_analytics_to_send";
	final Context context;
	final a fileStore;
}
