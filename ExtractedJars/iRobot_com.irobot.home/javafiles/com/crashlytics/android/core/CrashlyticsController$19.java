// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController, AppData, SessionProtobufHelper, CodedOutputStream

class CrashlyticsController$19
	implements edOutputStreamWriteAction
{

	public void writeTo(CodedOutputStream codedoutputstream)
	{
		SessionProtobufHelper.writeSessionApp(codedoutputstream, val$appIdentifier, CrashlyticsController.access$1900(CrashlyticsController.this).apiKey, val$versionCode, val$versionName, val$installUuid, val$deliveryMechanism, CrashlyticsController.access$2000(CrashlyticsController.this));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field String val$appIdentifier>
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field CrashlyticsController this$0>
	//    5    9:invokestatic    #44  <Method AppData CrashlyticsController.access$1900(CrashlyticsController)>
	//    6   12:getfield        #49  <Field String AppData.apiKey>
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field String val$versionCode>
	//    9   19:aload_0         
	//   10   20:getfield        #30  <Field String val$versionName>
	//   11   23:aload_0         
	//   12   24:getfield        #32  <Field String val$installUuid>
	//   13   27:aload_0         
	//   14   28:getfield        #34  <Field int val$deliveryMechanism>
	//   15   31:aload_0         
	//   16   32:getfield        #24  <Field CrashlyticsController this$0>
	//   17   35:invokestatic    #53  <Method String CrashlyticsController.access$2000(CrashlyticsController)>
	//   18   38:invokestatic    #58  <Method void SessionProtobufHelper.writeSessionApp(CodedOutputStream, String, String, String, String, String, int, String)>
	//   19   41:return          
	}

	final CrashlyticsController this$0;
	final String val$appIdentifier;
	final int val$deliveryMechanism;
	final String val$installUuid;
	final String val$versionCode;
	final String val$versionName;

	CrashlyticsController$19()
	{
		this$0 = final_crashlyticscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field CrashlyticsController this$0>
		val$appIdentifier = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field String val$appIdentifier>
		val$versionCode = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field String val$versionCode>
		val$versionName = s2;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field String val$versionName>
		val$installUuid = s3;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #32  <Field String val$installUuid>
		val$deliveryMechanism = I.this;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #34  <Field int val$deliveryMechanism>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #37  <Method void Object()>
	//   20   37:return          
	}
}
