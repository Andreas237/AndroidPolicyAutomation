// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController, SessionProtobufHelper, CodedOutputStream

class CrashlyticsController$21
	implements edOutputStreamWriteAction
{

	public void writeTo(CodedOutputStream codedoutputstream)
	{
		SessionProtobufHelper.writeSessionOS(codedoutputstream, android.os.Build.VERSION.RELEASE, android.os.Build.VERSION.CODENAME, val$isRooted);
	//    0    0:aload_1         
	//    1    1:getstatic       #33  <Field String android.os.Build$VERSION.RELEASE>
	//    2    4:getstatic       #36  <Field String android.os.Build$VERSION.CODENAME>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field boolean val$isRooted>
	//    5   11:invokestatic    #41  <Method void SessionProtobufHelper.writeSessionOS(CodedOutputStream, String, String, boolean)>
	//    6   14:return          
	}

	final CrashlyticsController this$0;
	final boolean val$isRooted;

	CrashlyticsController$21()
	{
		this$0 = final_crashlyticscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CrashlyticsController this$0>
		val$isRooted = Z.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean val$isRooted>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
