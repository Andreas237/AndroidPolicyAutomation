// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.FileOutputStream;
import java.util.HashMap;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

class CrashlyticsController$18
	implements eOutputStreamWriteAction
{

	public void writeTo(FileOutputStream fileoutputstream)
	{
		fileoutputstream.write((new JSONObject(((java.util.Map) (new HashMap() {

			final CrashlyticsController._cls18 this$1;

			
			{
				this$1 = CrashlyticsController._cls18.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CrashlyticsController$18 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void HashMap()>
				put("session_id", ((Object) (sessionId)));
			//    5    9:aload_0         
			//    6   10:ldc1            #21  <String "session_id">
			//    7   12:aload_0         
			//    8   13:getfield        #16  <Field CrashlyticsController$18 this$1>
			//    9   16:getfield        #25  <Field String CrashlyticsController$18.val$sessionId>
			//   10   19:invokevirtual   #29  <Method Object put(Object, Object)>
			//   11   22:pop             
				put("generator", ((Object) (generator)));
			//   12   23:aload_0         
			//   13   24:ldc1            #31  <String "generator">
			//   14   26:aload_0         
			//   15   27:getfield        #16  <Field CrashlyticsController$18 this$1>
			//   16   30:getfield        #34  <Field String CrashlyticsController$18.val$generator>
			//   17   33:invokevirtual   #29  <Method Object put(Object, Object)>
			//   18   36:pop             
				put("started_at_seconds", ((Object) (Long.valueOf(startedAtSeconds))));
			//   19   37:aload_0         
			//   20   38:ldc1            #36  <String "started_at_seconds">
			//   21   40:aload_0         
			//   22   41:getfield        #16  <Field CrashlyticsController$18 this$1>
			//   23   44:getfield        #40  <Field long CrashlyticsController$18.val$startedAtSeconds>
			//   24   47:invokestatic    #46  <Method Long Long.valueOf(long)>
			//   25   50:invokevirtual   #29  <Method Object put(Object, Object)>
			//   26   53:pop             
			//   27   54:return          
			}
		}
)))).toString().getBytes());
	//    0    0:aload_1         
	//    1    1:new             #38  <Class JSONObject>
	//    2    4:dup             
	//    3    5:new             #13  <Class CrashlyticsController$18$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #41  <Method void CrashlyticsController$18$1(CrashlyticsController$18)>
	//    7   13:invokespecial   #44  <Method void JSONObject(java.util.Map)>
	//    8   16:invokevirtual   #48  <Method String JSONObject.toString()>
	//    9   19:invokevirtual   #54  <Method byte[] String.getBytes()>
	//   10   22:invokevirtual   #60  <Method void FileOutputStream.write(byte[])>
	//   11   25:return          
	}

	final CrashlyticsController this$0;
	final String val$generator;
	final String val$sessionId;
	final long val$startedAtSeconds;

	CrashlyticsController$18()
	{
		this$0 = final_crashlyticscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field CrashlyticsController this$0>
		val$sessionId = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field String val$sessionId>
		val$generator = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field String val$generator>
		val$startedAtSeconds = J.this;
	//    9   15:aload_0         
	//   10   16:lload           4
	//   11   18:putfield        #30  <Field long val$startedAtSeconds>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #33  <Method void Object()>
	//   14   25:return          
	}
}
