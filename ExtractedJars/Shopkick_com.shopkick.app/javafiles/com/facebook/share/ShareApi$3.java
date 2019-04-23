// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share;

import com.facebook.FacebookCallback;
import com.facebook.GraphResponse;
import com.facebook.internal.Mutable;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.ArrayList;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share:
//			ShareApi

class ShareApi$3
	implements com.facebook.t.Callback
{

	public void onCompleted(GraphResponse graphresponse)
	{
		Object obj = ((Object) (graphresponse.getJSONObject()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #44  <Method JSONObject GraphResponse.getJSONObject()>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			val$results.add(obj);
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field ArrayList val$results>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
	//    9   17:pop             
		if(graphresponse.getError() != null)
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #54  <Method com.facebook.FacebookRequestError GraphResponse.getError()>
	//*  12   22:ifnull          34
			val$errorResponses.add(((Object) (graphresponse)));
	//   13   25:aload_0         
	//   14   26:getfield        #28  <Field ArrayList val$errorResponses>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
	//   17   33:pop             
		obj = ((Object) (val$requestCount));
	//   18   34:aload_0         
	//   19   35:getfield        #30  <Field Mutable val$requestCount>
	//   20   38:astore_2        
		obj.value = ((Object) (Integer.valueOf(((Integer)((Mutable) (obj)).value).intValue() - 1)));
	//   21   39:aload_2         
	//   22   40:aload_2         
	//   23   41:getfield        #60  <Field Object Mutable.value>
	//   24   44:checkcast       #62  <Class Integer>
	//   25   47:invokevirtual   #66  <Method int Integer.intValue()>
	//   26   50:iconst_1        
	//   27   51:isub            
	//   28   52:invokestatic    #70  <Method Integer Integer.valueOf(int)>
	//   29   55:putfield        #60  <Field Object Mutable.value>
		if(((Integer)val$requestCount.value).intValue() == 0)
	//*  30   58:aload_0         
	//*  31   59:getfield        #30  <Field Mutable val$requestCount>
	//*  32   62:getfield        #60  <Field Object Mutable.value>
	//*  33   65:checkcast       #62  <Class Integer>
	//*  34   68:invokevirtual   #66  <Method int Integer.intValue()>
	//*  35   71:ifne            140
		{
			if(!val$errorResponses.isEmpty())
	//*  36   74:aload_0         
	//*  37   75:getfield        #28  <Field ArrayList val$errorResponses>
	//*  38   78:invokevirtual   #74  <Method boolean ArrayList.isEmpty()>
	//*  39   81:ifne            104
			{
				ShareInternalUtility.invokeCallbackWithResults(val$callback, ((String) (null)), (GraphResponse)val$errorResponses.get(0));
	//   40   84:aload_0         
	//   41   85:getfield        #32  <Field FacebookCallback val$callback>
	//   42   88:aconst_null     
	//   43   89:aload_0         
	//   44   90:getfield        #28  <Field ArrayList val$errorResponses>
	//   45   93:iconst_0        
	//   46   94:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   47   97:checkcast       #40  <Class GraphResponse>
	//   48  100:invokestatic    #84  <Method void ShareInternalUtility.invokeCallbackWithResults(FacebookCallback, String, GraphResponse)>
				return;
	//   49  103:return          
			}
			if(!val$results.isEmpty())
	//*  50  104:aload_0         
	//*  51  105:getfield        #26  <Field ArrayList val$results>
	//*  52  108:invokevirtual   #74  <Method boolean ArrayList.isEmpty()>
	//*  53  111:ifne            140
			{
				String s = ((JSONObject)val$results.get(0)).optString("id");
	//   54  114:aload_0         
	//   55  115:getfield        #26  <Field ArrayList val$results>
	//   56  118:iconst_0        
	//   57  119:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   58  122:checkcast       #86  <Class JSONObject>
	//   59  125:ldc1            #88  <String "id">
	//   60  127:invokevirtual   #92  <Method String JSONObject.optString(String)>
	//   61  130:astore_2        
				ShareInternalUtility.invokeCallbackWithResults(val$callback, s, graphresponse);
	//   62  131:aload_0         
	//   63  132:getfield        #32  <Field FacebookCallback val$callback>
	//   64  135:aload_2         
	//   65  136:aload_1         
	//   66  137:invokestatic    #84  <Method void ShareInternalUtility.invokeCallbackWithResults(FacebookCallback, String, GraphResponse)>
			}
		}
	//   67  140:return          
	}

	final ShareApi this$0;
	final FacebookCallback val$callback;
	final ArrayList val$errorResponses;
	final Mutable val$requestCount;
	final ArrayList val$results;

	ShareApi$3()
	{
		this$0 = final_shareapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field ShareApi this$0>
		val$results = arraylist;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field ArrayList val$results>
		val$errorResponses = arraylist1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field ArrayList val$errorResponses>
		val$requestCount = mutable;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field Mutable val$requestCount>
		val$callback = FacebookCallback.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #32  <Field FacebookCallback val$callback>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #35  <Method void Object()>
	//   17   31:return          
	}
}
