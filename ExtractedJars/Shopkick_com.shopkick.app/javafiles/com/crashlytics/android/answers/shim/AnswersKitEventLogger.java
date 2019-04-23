// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers.shim;

import android.util.Log;
import com.crashlytics.android.answers.Answers;

// Referenced classes of package com.crashlytics.android.answers.shim:
//			KitEventLogger, KitEvent

class AnswersKitEventLogger
	implements KitEventLogger
{

	private AnswersKitEventLogger(Answers answers1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		answers = answers1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Answers answers>
	//    5    9:return          
	}

	public static AnswersKitEventLogger create()
		throws NoClassDefFoundError, IllegalStateException
	{
		return create(Answers.getInstance());
	//    0    0:invokestatic    #32  <Method Answers Answers.getInstance()>
	//    1    3:invokestatic    #35  <Method AnswersKitEventLogger create(Answers)>
	//    2    6:areturn         
	}

	static AnswersKitEventLogger create(Answers answers1)
		throws IllegalStateException
	{
		if(answers1 != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			return new AnswersKitEventLogger(answers1);
	//    2    4:new             #2   <Class AnswersKitEventLogger>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #38  <Method void AnswersKitEventLogger(Answers)>
	//    6   12:areturn         
		else
			throw new IllegalStateException("Answers must be initialized before logging kit events");
	//    7   13:new             #26  <Class IllegalStateException>
	//    8   16:dup             
	//    9   17:ldc1            #40  <String "Answers must be initialized before logging kit events">
	//   10   19:invokespecial   #43  <Method void IllegalStateException(String)>
	//   11   22:athrow          
	}

	public void logKitEvent(KitEvent kitevent)
	{
		try
		{
			answers.logCustom(kitevent.toCustomEvent());
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Answers answers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #53  <Method com.crashlytics.android.answers.CustomEvent KitEvent.toCustomEvent()>
	//    4    8:invokevirtual   #57  <Method void Answers.logCustom(com.crashlytics.android.answers.CustomEvent)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(KitEvent kitevent)
	//*   6   12:astore_1        
		{
			Log.w("AnswersKitEventLogger", "Unexpected error sending Answers event", ((Throwable) (kitevent)));
	//    7   13:ldc1            #10  <String "AnswersKitEventLogger">
	//    8   15:ldc1            #59  <String "Unexpected error sending Answers event">
	//    9   17:aload_1         
	//   10   18:invokestatic    #65  <Method int Log.w(String, String, Throwable)>
	//   11   21:pop             
		}
	//   12   22:return          
	}

	private static final String TAG = "AnswersKitEventLogger";
	private final Answers answers;
}
