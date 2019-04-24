// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.*;
import com.gigya.socialize.android.log.GigyaLog;
import com.gigya.socialize.android.login.LoginProviderFactory;
import com.gigya.socialize.android.utils.SimpleRunnableQueue;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI

class GSAPI$11
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		if(gsresponse.getErrorCode() == 0 && gsresponse.getData() != null)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #28  <Method int GSResponse.getErrorCode()>
	//*   2    4:ifne            78
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #32  <Method GSObject GSResponse.getData()>
	//*   5   11:ifnonnull       17
	//*   6   14:goto            78
		{
			GSAPI.access$702(GSAPI.this, gsresponse.getData());
	//    7   17:aload_0         
	//    8   18:getfield        #17  <Field GSAPI this$0>
	//    9   21:aload_2         
	//   10   22:invokevirtual   #32  <Method GSObject GSResponse.getData()>
	//   11   25:invokestatic    #36  <Method GSObject GSAPI.access$702(GSAPI, GSObject)>
	//   12   28:pop             
			s = ((String) (GSAPI.access$700(GSAPI.this).getObject("ids", ((GSObject) (null)))));
	//   13   29:aload_0         
	//   14   30:getfield        #17  <Field GSAPI this$0>
	//   15   33:invokestatic    #40  <Method GSObject GSAPI.access$700(GSAPI)>
	//   16   36:ldc1            #42  <String "ids">
	//   17   38:aconst_null     
	//   18   39:invokevirtual   #48  <Method GSObject GSObject.getObject(String, GSObject)>
	//   19   42:astore_1        
			if(s != null)
	//*  20   43:aload_1         
	//*  21   44:ifnull          129
			{
				GSAPI.access$800(GSAPI.this, ((GSObject) (s)).getString("ucid", ((String) (null))));
	//   22   47:aload_0         
	//   23   48:getfield        #17  <Field GSAPI this$0>
	//   24   51:aload_1         
	//   25   52:ldc1            #50  <String "ucid">
	//   26   54:aconst_null     
	//   27   55:invokevirtual   #54  <Method String GSObject.getString(String, String)>
	//   28   58:invokestatic    #58  <Method void GSAPI.access$800(GSAPI, String)>
				GSAPI.access$900(GSAPI.this, ((GSObject) (s)).getString("gmid", ((String) (null))));
	//   29   61:aload_0         
	//   30   62:getfield        #17  <Field GSAPI this$0>
	//   31   65:aload_1         
	//   32   66:ldc1            #60  <String "gmid">
	//   33   68:aconst_null     
	//   34   69:invokevirtual   #54  <Method String GSObject.getString(String, String)>
	//   35   72:invokestatic    #63  <Method void GSAPI.access$900(GSAPI, String)>
			}
		} else
	//*  36   75:goto            129
		{
			GSAPI.access$702(GSAPI.this, new GSObject());
	//   37   78:aload_0         
	//   38   79:getfield        #17  <Field GSAPI this$0>
	//   39   82:new             #44  <Class GSObject>
	//   40   85:dup             
	//   41   86:invokespecial   #64  <Method void GSObject()>
	//   42   89:invokestatic    #36  <Method GSObject GSAPI.access$702(GSAPI, GSObject)>
	//   43   92:pop             
			s = GSAPI.access$000();
	//   44   93:invokestatic    #68  <Method String GSAPI.access$000()>
	//   45   96:astore_1        
			obj = ((Object) (new StringBuilder()));
	//   46   97:new             #70  <Class StringBuilder>
	//   47  100:dup             
	//   48  101:invokespecial   #71  <Method void StringBuilder()>
	//   49  104:astore_3        
			((StringBuilder) (obj)).append("Unable to load config from server:");
	//   50  105:aload_3         
	//   51  106:ldc1            #73  <String "Unable to load config from server:">
	//   52  108:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   53  111:pop             
			((StringBuilder) (obj)).append(gsresponse.getLog());
	//   54  112:aload_3         
	//   55  113:aload_2         
	//   56  114:invokevirtual   #80  <Method String GSResponse.getLog()>
	//   57  117:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   58  120:pop             
			GigyaLog.e(s, ((StringBuilder) (obj)).toString());
	//   59  121:aload_1         
	//   60  122:aload_3         
	//   61  123:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   62  126:invokestatic    #89  <Method void GigyaLog.e(String, String)>
		}
		loginProviderFactory.validatePermissions(GSAPI.access$700(GSAPI.this));
	//   63  129:aload_0         
	//   64  130:getfield        #17  <Field GSAPI this$0>
	//   65  133:getfield        #93  <Field LoginProviderFactory GSAPI.loginProviderFactory>
	//   66  136:aload_0         
	//   67  137:getfield        #17  <Field GSAPI this$0>
	//   68  140:invokestatic    #40  <Method GSObject GSAPI.access$700(GSAPI)>
	//   69  143:invokevirtual   #99  <Method void LoginProviderFactory.validatePermissions(GSObject)>
		GSAPI.access$1000(GSAPI.this).release();
	//   70  146:aload_0         
	//   71  147:getfield        #17  <Field GSAPI this$0>
	//   72  150:invokestatic    #103 <Method SimpleRunnableQueue GSAPI.access$1000(GSAPI)>
	//   73  153:invokevirtual   #108 <Method void SimpleRunnableQueue.release()>
	//   74  156:return          
	}

	final GSAPI this$0;

	GSAPI$11()
	{
		this$0 = GSAPI.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GSAPI this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
