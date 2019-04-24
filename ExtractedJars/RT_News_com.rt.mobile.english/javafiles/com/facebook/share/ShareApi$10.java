// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share;

import com.facebook.*;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share:
//			ShareApi

class ShareApi$10
	implements com.facebook..Callback
{

	public void onCompleted(GraphResponse graphresponse)
	{
		Object obj = ((Object) (graphresponse.getError()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method FacebookRequestError GraphResponse.getError()>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          42
		{
			String s = ((FacebookRequestError) (obj)).getErrorMessage();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #39  <Method String FacebookRequestError.getErrorMessage()>
	//    7   13:astore_3        
			obj = ((Object) (s));
	//    8   14:aload_3         
	//    9   15:astore_2        
			if(s == null)
	//*  10   16:aload_3         
	//*  11   17:ifnonnull       23
				obj = "Error staging Open Graph object.";
	//   12   20:ldc1            #41  <String "Error staging Open Graph object.">
	//   13   22:astore_2        
			val$onOpenGraphObjectStagedListener.onError(((com.facebook.FacebookException) (new FacebookGraphResponseException(graphresponse, ((String) (obj))))));
	//   14   23:aload_0         
	//   15   24:getfield        #21  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onOpenGraphObjectStagedListener>
	//   16   27:new             #43  <Class FacebookGraphResponseException>
	//   17   30:dup             
	//   18   31:aload_1         
	//   19   32:aload_2         
	//   20   33:invokespecial   #46  <Method void FacebookGraphResponseException(GraphResponse, String)>
	//   21   36:invokeinterface #52  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(com.facebook.FacebookException)>
			return;
	//   22   41:return          
		}
		obj = ((Object) (graphresponse.getJSONObject()));
	//   23   42:aload_1         
	//   24   43:invokevirtual   #56  <Method JSONObject GraphResponse.getJSONObject()>
	//   25   46:astore_2        
		if(obj == null)
	//*  26   47:aload_2         
	//*  27   48:ifnonnull       71
		{
			val$onOpenGraphObjectStagedListener.onError(((com.facebook.FacebookException) (new FacebookGraphResponseException(graphresponse, "Error staging Open Graph object."))));
	//   28   51:aload_0         
	//   29   52:getfield        #21  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onOpenGraphObjectStagedListener>
	//   30   55:new             #43  <Class FacebookGraphResponseException>
	//   31   58:dup             
	//   32   59:aload_1         
	//   33   60:ldc1            #41  <String "Error staging Open Graph object.">
	//   34   62:invokespecial   #46  <Method void FacebookGraphResponseException(GraphResponse, String)>
	//   35   65:invokeinterface #52  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(com.facebook.FacebookException)>
			return;
	//   36   70:return          
		}
		obj = ((Object) (((JSONObject) (obj)).optString("id")));
	//   37   71:aload_2         
	//   38   72:ldc1            #58  <String "id">
	//   39   74:invokevirtual   #64  <Method String JSONObject.optString(String)>
	//   40   77:astore_2        
		if(obj == null)
	//*  41   78:aload_2         
	//*  42   79:ifnonnull       102
		{
			val$onOpenGraphObjectStagedListener.onError(((com.facebook.FacebookException) (new FacebookGraphResponseException(graphresponse, "Error staging Open Graph object."))));
	//   43   82:aload_0         
	//   44   83:getfield        #21  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onOpenGraphObjectStagedListener>
	//   45   86:new             #43  <Class FacebookGraphResponseException>
	//   46   89:dup             
	//   47   90:aload_1         
	//   48   91:ldc1            #41  <String "Error staging Open Graph object.">
	//   49   93:invokespecial   #46  <Method void FacebookGraphResponseException(GraphResponse, String)>
	//   50   96:invokeinterface #52  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(com.facebook.FacebookException)>
			return;
	//   51  101:return          
		} else
		{
			val$onOpenGraphObjectStagedListener.onComplete(obj);
	//   52  102:aload_0         
	//   53  103:getfield        #21  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onOpenGraphObjectStagedListener>
	//   54  106:aload_2         
	//   55  107:invokeinterface #68  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onComplete(Object)>
			return;
	//   56  112:return          
		}
	}

	final ShareApi this$0;
	final com.facebook.internal.pper.OnMapValueCompleteListener val$onOpenGraphObjectStagedListener;

	ShareApi$10()
	{
		this$0 = final_shareapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ShareApi this$0>
		val$onOpenGraphObjectStagedListener = com.facebook.internal.pper.OnMapValueCompleteListener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onOpenGraphObjectStagedListener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
