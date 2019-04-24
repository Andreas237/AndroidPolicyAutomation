// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.FileOutputStream;
import java.util.HashMap;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

class CrashlyticsController$22$1 extends HashMap
{

	final CrashlyticsController._cls22 this$1;

	CrashlyticsController$22$1()
	{
		this$1 = CrashlyticsController._cls22.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field CrashlyticsController$22 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void HashMap()>
		put("version", ((Object) (android.os.Build.VERSION.RELEASE)));
	//    5    9:aload_0         
	//    6   10:ldc1            #21  <String "version">
	//    7   12:getstatic       #27  <Field String android.os.Build$VERSION.RELEASE>
	//    8   15:invokevirtual   #31  <Method Object put(Object, Object)>
	//    9   18:pop             
		put("build_version", ((Object) (android.os.Build.VERSION.CODENAME)));
	//   10   19:aload_0         
	//   11   20:ldc1            #33  <String "build_version">
	//   12   22:getstatic       #36  <Field String android.os.Build$VERSION.CODENAME>
	//   13   25:invokevirtual   #31  <Method Object put(Object, Object)>
	//   14   28:pop             
		put("is_rooted", ((Object) (Boolean.valueOf(val$isRooted))));
	//   15   29:aload_0         
	//   16   30:ldc1            #38  <String "is_rooted">
	//   17   32:aload_0         
	//   18   33:getfield        #16  <Field CrashlyticsController$22 this$1>
	//   19   36:getfield        #42  <Field boolean CrashlyticsController$22.val$isRooted>
	//   20   39:invokestatic    #48  <Method Boolean Boolean.valueOf(boolean)>
	//   21   42:invokevirtual   #31  <Method Object put(Object, Object)>
	//   22   45:pop             
	//   23   46:return          
	}

	// Unreferenced inner class com/crashlytics/android/core/CrashlyticsController$22

/* anonymous class */
	class CrashlyticsController._cls22
		implements CrashlyticsController.FileOutputStreamWriteAction
	{

		public void writeTo(FileOutputStream fileoutputstream)
		{
			fileoutputstream.write((new JSONObject(((java.util.Map) (new CrashlyticsController._cls22._cls1())))).toString().getBytes());
		//    0    0:aload_1         
		//    1    1:new             #31  <Class JSONObject>
		//    2    4:dup             
		//    3    5:new             #13  <Class CrashlyticsController$22$1>
		//    4    8:dup             
		//    5    9:aload_0         
		//    6   10:invokespecial   #34  <Method void CrashlyticsController$22$1(CrashlyticsController$22)>
		//    7   13:invokespecial   #37  <Method void JSONObject(java.util.Map)>
		//    8   16:invokevirtual   #41  <Method String JSONObject.toString()>
		//    9   19:invokevirtual   #47  <Method byte[] String.getBytes()>
		//   10   22:invokevirtual   #53  <Method void FileOutputStream.write(byte[])>
		//   11   25:return          
		}

		final CrashlyticsController this$0;
		final boolean val$isRooted;

			
			{
				this$0 = final_crashlyticscontroller;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CrashlyticsController this$0>
				isRooted = Z.this;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field boolean val$isRooted>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}

}
