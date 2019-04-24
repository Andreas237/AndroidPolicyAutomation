// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController, UserMetaData, SessionProtobufHelper, CodedOutputStream

class CrashlyticsController$25
	implements edOutputStreamWriteAction
{

	public void writeTo(CodedOutputStream codedoutputstream)
	{
		SessionProtobufHelper.writeSessionUser(codedoutputstream, val$userMetaData.id, val$userMetaData.name, val$userMetaData.email);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field UserMetaData val$userMetaData>
	//    3    5:getfield        #33  <Field String UserMetaData.id>
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field UserMetaData val$userMetaData>
	//    6   12:getfield        #36  <Field String UserMetaData.name>
	//    7   15:aload_0         
	//    8   16:getfield        #21  <Field UserMetaData val$userMetaData>
	//    9   19:getfield        #39  <Field String UserMetaData.email>
	//   10   22:invokestatic    #44  <Method void SessionProtobufHelper.writeSessionUser(CodedOutputStream, String, String, String)>
	//   11   25:return          
	}

	final CrashlyticsController this$0;
	final UserMetaData val$userMetaData;

	CrashlyticsController$25()
	{
		this$0 = final_crashlyticscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CrashlyticsController this$0>
		val$userMetaData = UserMetaData.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field UserMetaData val$userMetaData>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
