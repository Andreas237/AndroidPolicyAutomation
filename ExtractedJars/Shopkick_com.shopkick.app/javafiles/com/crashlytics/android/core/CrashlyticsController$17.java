// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController, SessionProtobufHelper, CodedOutputStream

class CrashlyticsController$17
	implements edOutputStreamWriteAction
{

	public void writeTo(CodedOutputStream codedoutputstream)
		throws Exception
	{
		SessionProtobufHelper.writeBeginSession(codedoutputstream, val$sessionId, val$generator, val$startedAtSeconds);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field String val$sessionId>
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field String val$generator>
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field long val$startedAtSeconds>
	//    7   13:invokestatic    #41  <Method void SessionProtobufHelper.writeBeginSession(CodedOutputStream, String, String, long)>
	//    8   16:return          
	}

	final CrashlyticsController this$0;
	final String val$generator;
	final String val$sessionId;
	final long val$startedAtSeconds;

	CrashlyticsController$17()
	{
		this$0 = final_crashlyticscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field CrashlyticsController this$0>
		val$sessionId = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field String val$sessionId>
		val$generator = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field String val$generator>
		val$startedAtSeconds = J.this;
	//    9   15:aload_0         
	//   10   16:lload           4
	//   11   18:putfield        #28  <Field long val$startedAtSeconds>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
