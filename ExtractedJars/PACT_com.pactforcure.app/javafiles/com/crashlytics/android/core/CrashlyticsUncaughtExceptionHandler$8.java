// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsUncaughtExceptionHandler, MetaDataStore, UserMetaData

class CrashlyticsUncaughtExceptionHandler$8
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
		throws Exception
	{
		String s = CrashlyticsUncaughtExceptionHandler.access$500(CrashlyticsUncaughtExceptionHandler.this);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//    2    4:invokestatic    #44  <Method String CrashlyticsUncaughtExceptionHandler.access$500(CrashlyticsUncaughtExceptionHandler)>
	//    3    7:astore_1        
		(new MetaDataStore(CrashlyticsUncaughtExceptionHandler.access$600(CrashlyticsUncaughtExceptionHandler.this))).writeUserData(s, new UserMetaData(val$userId, val$userName, val$userEmail));
	//    4    8:new             #46  <Class MetaDataStore>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//    8   16:invokestatic    #50  <Method java.io.File CrashlyticsUncaughtExceptionHandler.access$600(CrashlyticsUncaughtExceptionHandler)>
	//    9   19:invokespecial   #53  <Method void MetaDataStore(java.io.File)>
	//   10   22:aload_1         
	//   11   23:new             #55  <Class UserMetaData>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:getfield        #24  <Field String val$userId>
	//   15   31:aload_0         
	//   16   32:getfield        #26  <Field String val$userName>
	//   17   35:aload_0         
	//   18   36:getfield        #28  <Field String val$userEmail>
	//   19   39:invokespecial   #57  <Method void UserMetaData(String, String, String)>
	//   20   42:invokevirtual   #61  <Method void MetaDataStore.writeUserData(String, UserMetaData)>
		return null;
	//   21   45:aconst_null     
	//   22   46:areturn         
	}

	final CrashlyticsUncaughtExceptionHandler this$0;
	final String val$userEmail;
	final String val$userId;
	final String val$userName;

	CrashlyticsUncaughtExceptionHandler$8()
	{
		this$0 = final_crashlyticsuncaughtexceptionhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field CrashlyticsUncaughtExceptionHandler this$0>
		val$userId = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field String val$userId>
		val$userName = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field String val$userName>
		val$userEmail = String.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field String val$userEmail>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
