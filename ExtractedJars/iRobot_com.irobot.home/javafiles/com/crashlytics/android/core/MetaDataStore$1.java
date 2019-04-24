// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.core:
//			MetaDataStore, UserMetaData

static final class MetaDataStore$1 extends JSONObject
{

	final UserMetaData val$userData;

	MetaDataStore$1(UserMetaData usermetadata)
	{
		val$userData = usermetadata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field UserMetaData val$userData>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void JSONObject()>
		put("userId", ((Object) (val$userData.id)));
	//    5    9:aload_0         
	//    6   10:ldc1            #20  <String "userId">
	//    7   12:aload_0         
	//    8   13:getfield        #15  <Field UserMetaData val$userData>
	//    9   16:getfield        #26  <Field String UserMetaData.id>
	//   10   19:invokevirtual   #30  <Method JSONObject put(String, Object)>
	//   11   22:pop             
		put("userName", ((Object) (val$userData.name)));
	//   12   23:aload_0         
	//   13   24:ldc1            #32  <String "userName">
	//   14   26:aload_0         
	//   15   27:getfield        #15  <Field UserMetaData val$userData>
	//   16   30:getfield        #35  <Field String UserMetaData.name>
	//   17   33:invokevirtual   #30  <Method JSONObject put(String, Object)>
	//   18   36:pop             
		put("userEmail", ((Object) (val$userData.email)));
	//   19   37:aload_0         
	//   20   38:ldc1            #37  <String "userEmail">
	//   21   40:aload_0         
	//   22   41:getfield        #15  <Field UserMetaData val$userData>
	//   23   44:getfield        #40  <Field String UserMetaData.email>
	//   24   47:invokevirtual   #30  <Method JSONObject put(String, Object)>
	//   25   50:pop             
	//   26   51:return          
	}
}
