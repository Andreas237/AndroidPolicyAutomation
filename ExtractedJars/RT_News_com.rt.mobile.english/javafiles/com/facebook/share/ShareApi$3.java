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
		JSONObject jsonobject = graphresponse.getJSONObject();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #44  <Method JSONObject GraphResponse.getJSONObject()>
	//    2    4:astore_2        
		if(jsonobject != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			val$results.add(((Object) (jsonobject)));
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
		val$requestCount.value = ((Object) (Integer.valueOf(((Integer)val$requestCount.value).intValue() - 1)));
	//   18   34:aload_0         
	//   19   35:getfield        #30  <Field Mutable val$requestCount>
	//   20   38:aload_0         
	//   21   39:getfield        #30  <Field Mutable val$requestCount>
	//   22   42:getfield        #60  <Field Object Mutable.value>
	//   23   45:checkcast       #62  <Class Integer>
	//   24   48:invokevirtual   #66  <Method int Integer.intValue()>
	//   25   51:iconst_1        
	//   26   52:isub            
	//   27   53:invokestatic    #70  <Method Integer Integer.valueOf(int)>
	//   28   56:putfield        #60  <Field Object Mutable.value>
		if(((Integer)val$requestCount.value).intValue() == 0)
	//*  29   59:aload_0         
	//*  30   60:getfield        #30  <Field Mutable val$requestCount>
	//*  31   63:getfield        #60  <Field Object Mutable.value>
	//*  32   66:checkcast       #62  <Class Integer>
	//*  33   69:invokevirtual   #66  <Method int Integer.intValue()>
	//*  34   72:ifne            141
		{
			if(!val$errorResponses.isEmpty())
	//*  35   75:aload_0         
	//*  36   76:getfield        #28  <Field ArrayList val$errorResponses>
	//*  37   79:invokevirtual   #74  <Method boolean ArrayList.isEmpty()>
	//*  38   82:ifne            105
			{
				ShareInternalUtility.invokeCallbackWithResults(val$callback, ((String) (null)), (GraphResponse)val$errorResponses.get(0));
	//   39   85:aload_0         
	//   40   86:getfield        #32  <Field FacebookCallback val$callback>
	//   41   89:aconst_null     
	//   42   90:aload_0         
	//   43   91:getfield        #28  <Field ArrayList val$errorResponses>
	//   44   94:iconst_0        
	//   45   95:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   46   98:checkcast       #40  <Class GraphResponse>
	//   47  101:invokestatic    #84  <Method void ShareInternalUtility.invokeCallbackWithResults(FacebookCallback, String, GraphResponse)>
				return;
	//   48  104:return          
			}
			if(!val$results.isEmpty())
	//*  49  105:aload_0         
	//*  50  106:getfield        #26  <Field ArrayList val$results>
	//*  51  109:invokevirtual   #74  <Method boolean ArrayList.isEmpty()>
	//*  52  112:ifne            141
			{
				String s = ((JSONObject)val$results.get(0)).optString("id");
	//   53  115:aload_0         
	//   54  116:getfield        #26  <Field ArrayList val$results>
	//   55  119:iconst_0        
	//   56  120:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   57  123:checkcast       #86  <Class JSONObject>
	//   58  126:ldc1            #88  <String "id">
	//   59  128:invokevirtual   #92  <Method String JSONObject.optString(String)>
	//   60  131:astore_2        
				ShareInternalUtility.invokeCallbackWithResults(val$callback, s, graphresponse);
	//   61  132:aload_0         
	//   62  133:getfield        #32  <Field FacebookCallback val$callback>
	//   63  136:aload_2         
	//   64  137:aload_1         
	//   65  138:invokestatic    #84  <Method void ShareInternalUtility.invokeCallbackWithResults(FacebookCallback, String, GraphResponse)>
			}
		}
	//   66  141:return          
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
