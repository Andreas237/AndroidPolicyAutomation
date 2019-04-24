// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.text.TextUtils;
import java.io.FileOutputStream;
import java.util.HashMap;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController, AppData

class CrashlyticsController$20
	implements eOutputStreamWriteAction
{

	public void writeTo(FileOutputStream fileoutputstream)
	{
		fileoutputstream.write((new JSONObject(((java.util.Map) (new HashMap() {

			final CrashlyticsController._cls20 this$1;

			
			{
				this$1 = CrashlyticsController._cls20.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CrashlyticsController$20 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void HashMap()>
				put("app_identifier", ((Object) (appIdentifier)));
			//    5    9:aload_0         
			//    6   10:ldc1            #21  <String "app_identifier">
			//    7   12:aload_0         
			//    8   13:getfield        #16  <Field CrashlyticsController$20 this$1>
			//    9   16:getfield        #25  <Field String CrashlyticsController$20.val$appIdentifier>
			//   10   19:invokevirtual   #29  <Method Object put(Object, Object)>
			//   11   22:pop             
				put("api_key", ((Object) (CrashlyticsController.access$1900(this$0).apiKey)));
			//   12   23:aload_0         
			//   13   24:ldc1            #31  <String "api_key">
			//   14   26:aload_0         
			//   15   27:getfield        #16  <Field CrashlyticsController$20 this$1>
			//   16   30:getfield        #35  <Field CrashlyticsController CrashlyticsController$20.this$0>
			//   17   33:invokestatic    #41  <Method AppData CrashlyticsController.access$1900(CrashlyticsController)>
			//   18   36:getfield        #46  <Field String AppData.apiKey>
			//   19   39:invokevirtual   #29  <Method Object put(Object, Object)>
			//   20   42:pop             
				put("version_code", ((Object) (versionCode)));
			//   21   43:aload_0         
			//   22   44:ldc1            #48  <String "version_code">
			//   23   46:aload_0         
			//   24   47:getfield        #16  <Field CrashlyticsController$20 this$1>
			//   25   50:getfield        #51  <Field String CrashlyticsController$20.val$versionCode>
			//   26   53:invokevirtual   #29  <Method Object put(Object, Object)>
			//   27   56:pop             
				put("version_name", ((Object) (versionName)));
			//   28   57:aload_0         
			//   29   58:ldc1            #53  <String "version_name">
			//   30   60:aload_0         
			//   31   61:getfield        #16  <Field CrashlyticsController$20 this$1>
			//   32   64:getfield        #56  <Field String CrashlyticsController$20.val$versionName>
			//   33   67:invokevirtual   #29  <Method Object put(Object, Object)>
			//   34   70:pop             
				put("install_uuid", ((Object) (installUuid)));
			//   35   71:aload_0         
			//   36   72:ldc1            #58  <String "install_uuid">
			//   37   74:aload_0         
			//   38   75:getfield        #16  <Field CrashlyticsController$20 this$1>
			//   39   78:getfield        #61  <Field String CrashlyticsController$20.val$installUuid>
			//   40   81:invokevirtual   #29  <Method Object put(Object, Object)>
			//   41   84:pop             
				put("delivery_mechanism", ((Object) (Integer.valueOf(deliveryMechanism))));
			//   42   85:aload_0         
			//   43   86:ldc1            #63  <String "delivery_mechanism">
			//   44   88:aload_0         
			//   45   89:getfield        #16  <Field CrashlyticsController$20 this$1>
			//   46   92:getfield        #67  <Field int CrashlyticsController$20.val$deliveryMechanism>
			//   47   95:invokestatic    #73  <Method Integer Integer.valueOf(int)>
			//   48   98:invokevirtual   #29  <Method Object put(Object, Object)>
			//   49  101:pop             
				if(TextUtils.isEmpty(((CharSequence) (CrashlyticsController.access$2000(this$0)))))
			//*  50  102:aload_0         
			//*  51  103:getfield        #16  <Field CrashlyticsController$20 this$1>
			//*  52  106:getfield        #35  <Field CrashlyticsController CrashlyticsController$20.this$0>
			//*  53  109:invokestatic    #77  <Method String CrashlyticsController.access$2000(CrashlyticsController)>
			//*  54  112:invokestatic    #83  <Method boolean TextUtils.isEmpty(CharSequence)>
			//*  55  115:ifeq            124
					_pcls20 = "";
			//   56  118:ldc1            #85  <String "">
			//   57  120:astore_1        
				else
			//*  58  121:goto            135
					_pcls20 = ((CrashlyticsController._cls20) (CrashlyticsController.access$2000(this$0)));
			//   59  124:aload_0         
			//   60  125:getfield        #16  <Field CrashlyticsController$20 this$1>
			//   61  128:getfield        #35  <Field CrashlyticsController CrashlyticsController$20.this$0>
			//   62  131:invokestatic    #77  <Method String CrashlyticsController.access$2000(CrashlyticsController)>
			//   63  134:astore_1        
				put("unity_version", ((Object) (CrashlyticsController._cls20.this)));
			//   64  135:aload_0         
			//   65  136:ldc1            #87  <String "unity_version">
			//   66  138:aload_1         
			//   67  139:invokevirtual   #29  <Method Object put(Object, Object)>
			//   68  142:pop             
			//   69  143:return          
			}
		}
)))).toString().getBytes());
	//    0    0:aload_1         
	//    1    1:new             #44  <Class JSONObject>
	//    2    4:dup             
	//    3    5:new             #13  <Class CrashlyticsController$20$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #47  <Method void CrashlyticsController$20$1(CrashlyticsController$20)>
	//    7   13:invokespecial   #50  <Method void JSONObject(java.util.Map)>
	//    8   16:invokevirtual   #54  <Method String JSONObject.toString()>
	//    9   19:invokevirtual   #60  <Method byte[] String.getBytes()>
	//   10   22:invokevirtual   #66  <Method void FileOutputStream.write(byte[])>
	//   11   25:return          
	}

	final CrashlyticsController this$0;
	final String val$appIdentifier;
	final int val$deliveryMechanism;
	final String val$installUuid;
	final String val$versionCode;
	final String val$versionName;

	CrashlyticsController$20()
	{
		this$0 = final_crashlyticscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field CrashlyticsController this$0>
		val$appIdentifier = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field String val$appIdentifier>
		val$versionCode = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field String val$versionCode>
		val$versionName = s2;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field String val$versionName>
		val$installUuid = s3;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #34  <Field String val$installUuid>
		val$deliveryMechanism = I.this;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #36  <Field int val$deliveryMechanism>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #39  <Method void Object()>
	//   20   37:return          
	}
}
