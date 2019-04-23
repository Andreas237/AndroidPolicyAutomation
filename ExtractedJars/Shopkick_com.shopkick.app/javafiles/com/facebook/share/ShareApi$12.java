// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share;

import com.facebook.*;
import com.facebook.share.model.SharePhoto;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share:
//			ShareApi

class ShareApi$12
	implements com.facebook..Callback
{

	public void onCompleted(GraphResponse graphresponse)
	{
		Object obj = ((Object) (graphresponse.getError()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #39  <Method FacebookRequestError GraphResponse.getError()>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          42
		{
			String s1 = ((FacebookRequestError) (obj)).getErrorMessage();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #45  <Method String FacebookRequestError.getErrorMessage()>
	//    7   13:astore_3        
			obj = ((Object) (s1));
	//    8   14:aload_3         
	//    9   15:astore_2        
			if(s1 == null)
	//*  10   16:aload_3         
	//*  11   17:ifnonnull       23
				obj = "Error staging photo.";
	//   12   20:ldc1            #47  <String "Error staging photo.">
	//   13   22:astore_2        
			val$onPhotoStagedListener.onError(((FacebookException) (new FacebookGraphResponseException(graphresponse, ((String) (obj))))));
	//   14   23:aload_0         
	//   15   24:getfield        #23  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onPhotoStagedListener>
	//   16   27:new             #49  <Class FacebookGraphResponseException>
	//   17   30:dup             
	//   18   31:aload_1         
	//   19   32:aload_2         
	//   20   33:invokespecial   #52  <Method void FacebookGraphResponseException(GraphResponse, String)>
	//   21   36:invokeinterface #58  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(FacebookException)>
			return;
	//   22   41:return          
		}
		graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
	//   23   42:aload_1         
	//   24   43:invokevirtual   #62  <Method JSONObject GraphResponse.getJSONObject()>
	//   25   46:astore_1        
		if(graphresponse == null)
	//*  26   47:aload_1         
	//*  27   48:ifnonnull       70
		{
			val$onPhotoStagedListener.onError(new FacebookException("Error staging photo."));
	//   28   51:aload_0         
	//   29   52:getfield        #23  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onPhotoStagedListener>
	//   30   55:new             #64  <Class FacebookException>
	//   31   58:dup             
	//   32   59:ldc1            #47  <String "Error staging photo.">
	//   33   61:invokespecial   #67  <Method void FacebookException(String)>
	//   34   64:invokeinterface #58  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(FacebookException)>
			return;
	//   35   69:return          
		}
		graphresponse = ((GraphResponse) (((JSONObject) (graphresponse)).optString("uri")));
	//   36   70:aload_1         
	//   37   71:ldc1            #69  <String "uri">
	//   38   73:invokevirtual   #75  <Method String JSONObject.optString(String)>
	//   39   76:astore_1        
		if(graphresponse == null)
	//*  40   77:aload_1         
	//*  41   78:ifnonnull       100
		{
			val$onPhotoStagedListener.onError(new FacebookException("Error staging photo."));
	//   42   81:aload_0         
	//   43   82:getfield        #23  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onPhotoStagedListener>
	//   44   85:new             #64  <Class FacebookException>
	//   45   88:dup             
	//   46   89:ldc1            #47  <String "Error staging photo.">
	//   47   91:invokespecial   #67  <Method void FacebookException(String)>
	//   48   94:invokeinterface #58  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(FacebookException)>
			return;
	//   49   99:return          
		}
		obj = ((Object) (new JSONObject()));
	//   50  100:new             #71  <Class JSONObject>
	//   51  103:dup             
	//   52  104:invokespecial   #76  <Method void JSONObject()>
	//   53  107:astore_2        
		try
		{
			((JSONObject) (obj)).put("url", ((Object) (graphresponse)));
	//   54  108:aload_2         
	//   55  109:ldc1            #78  <String "url">
	//   56  111:aload_1         
	//   57  112:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
	//   58  115:pop             
			((JSONObject) (obj)).put("user_generated", val$photo.getUserGenerated());
	//   59  116:aload_2         
	//   60  117:ldc1            #84  <String "user_generated">
	//   61  119:aload_0         
	//   62  120:getfield        #25  <Field SharePhoto val$photo>
	//   63  123:invokevirtual   #90  <Method boolean SharePhoto.getUserGenerated()>
	//   64  126:invokevirtual   #93  <Method JSONObject JSONObject.put(String, boolean)>
	//   65  129:pop             
		}
	//*  66  130:aload_0         
	//*  67  131:getfield        #23  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onPhotoStagedListener>
	//*  68  134:aload_2         
	//*  69  135:invokeinterface #97  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onComplete(Object)>
	//*  70  140:return          
		// Misplaced declaration of an exception variable
		catch(GraphResponse graphresponse)
	//*  71  141:astore_1        
		{
			String s = ((JSONException) (graphresponse)).getLocalizedMessage();
	//   72  142:aload_1         
	//   73  143:invokevirtual   #100 <Method String JSONException.getLocalizedMessage()>
	//   74  146:astore_2        
			graphresponse = ((GraphResponse) (s));
	//   75  147:aload_2         
	//   76  148:astore_1        
			if(s == null)
	//*  77  149:aload_2         
	//*  78  150:ifnonnull       156
				graphresponse = "Error staging photo.";
	//   79  153:ldc1            #47  <String "Error staging photo.">
	//   80  155:astore_1        
			val$onPhotoStagedListener.onError(new FacebookException(((String) (graphresponse))));
	//   81  156:aload_0         
	//   82  157:getfield        #23  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onPhotoStagedListener>
	//   83  160:new             #64  <Class FacebookException>
	//   84  163:dup             
	//   85  164:aload_1         
	//   86  165:invokespecial   #67  <Method void FacebookException(String)>
	//   87  168:invokeinterface #58  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(FacebookException)>
			return;
	//   88  173:return          
		}
		val$onPhotoStagedListener.onComplete(obj);
	}

	final ShareApi this$0;
	final com.facebook.internal.pper.OnMapValueCompleteListener val$onPhotoStagedListener;
	final SharePhoto val$photo;

	ShareApi$12()
	{
		this$0 = final_shareapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ShareApi this$0>
		val$onPhotoStagedListener = onmapvaluecompletelistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onPhotoStagedListener>
		val$photo = SharePhoto.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field SharePhoto val$photo>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
