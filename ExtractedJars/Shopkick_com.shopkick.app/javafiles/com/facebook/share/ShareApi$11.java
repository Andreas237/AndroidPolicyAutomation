// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share;

import android.os.Bundle;
import com.facebook.*;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share:
//			ShareApi

class ShareApi$11
	implements com.facebook.internal.pper.OnMapperCompleteListener
{

	public void onComplete()
	{
		Object obj1 = ((Object) (val$stagedObject.toString()));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field JSONObject val$stagedObject>
	//    2    4:invokevirtual   #46  <Method String JSONObject.toString()>
	//    3    7:astore_2        
		Object obj = ((Object) (new Bundle()));
	//    4    8:new             #48  <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #49  <Method void Bundle()>
	//    7   15:astore_1        
		((Bundle) (obj)).putString("object", ((String) (obj1)));
	//    8   16:aload_1         
	//    9   17:ldc1            #51  <String "object">
	//   10   19:aload_2         
	//   11   20:invokevirtual   #55  <Method void Bundle.putString(String, String)>
		try
		{
			obj1 = ((Object) (AccessToken.getCurrentAccessToken()));
	//   12   23:invokestatic    #61  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   13   26:astore_2        
			ShareApi shareapi = ShareApi.this;
	//   14   27:aload_0         
	//   15   28:getfield        #25  <Field ShareApi this$0>
	//   16   31:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   17   32:new             #63  <Class StringBuilder>
	//   18   35:dup             
	//   19   36:invokespecial   #64  <Method void StringBuilder()>
	//   20   39:astore          4
			stringbuilder.append("objects/");
	//   21   41:aload           4
	//   22   43:ldc1            #66  <String "objects/">
	//   23   45:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
			stringbuilder.append(URLEncoder.encode(val$ogType, "UTF-8"));
	//   25   49:aload           4
	//   26   51:aload_0         
	//   27   52:getfield        #29  <Field String val$ogType>
	//   28   55:ldc1            #72  <String "UTF-8">
	//   29   57:invokestatic    #78  <Method String URLEncoder.encode(String, String)>
	//   30   60:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
			(new GraphRequest(((AccessToken) (obj1)), ShareApi.access$100(shareapi, stringbuilder.toString()), ((Bundle) (obj)), HttpMethod.POST, val$requestCallback)).executeAsync();
	//   32   64:new             #80  <Class GraphRequest>
	//   33   67:dup             
	//   34   68:aload_2         
	//   35   69:aload_3         
	//   36   70:aload           4
	//   37   72:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   38   75:invokestatic    #85  <Method String ShareApi.access$100(ShareApi, String)>
	//   39   78:aload_1         
	//   40   79:getstatic       #91  <Field HttpMethod HttpMethod.POST>
	//   41   82:aload_0         
	//   42   83:getfield        #31  <Field com.facebook.GraphRequest$Callback val$requestCallback>
	//   43   86:invokespecial   #94  <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//   44   89:invokevirtual   #98  <Method com.facebook.GraphRequestAsyncTask GraphRequest.executeAsync()>
	//   45   92:pop             
			return;
	//   46   93:return          
		}
		catch(UnsupportedEncodingException unsupportedencodingexception)
	//*  47   94:astore_1        
		{
			obj1 = ((Object) (unsupportedencodingexception.getLocalizedMessage()));
	//   48   95:aload_1         
	//   49   96:invokevirtual   #101 <Method String UnsupportedEncodingException.getLocalizedMessage()>
	//   50   99:astore_2        
		}
		unsupportedencodingexception = ((UnsupportedEncodingException) (obj1));
	//   51  100:aload_2         
	//   52  101:astore_1        
		if(obj1 == null)
	//*  53  102:aload_2         
	//*  54  103:ifnonnull       109
			unsupportedencodingexception = "Error staging Open Graph object.";
	//   55  106:ldc1            #103 <String "Error staging Open Graph object.">
	//   56  108:astore_1        
		val$onOpenGraphObjectStagedListener.onError(new FacebookException(((String) (unsupportedencodingexception))));
	//   57  109:aload_0         
	//   58  110:getfield        #33  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onOpenGraphObjectStagedListener>
	//   59  113:new             #105 <Class FacebookException>
	//   60  116:dup             
	//   61  117:aload_1         
	//   62  118:invokespecial   #108 <Method void FacebookException(String)>
	//   63  121:invokeinterface #114 <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(FacebookException)>
	//   64  126:return          
	}

	public void onError(FacebookException facebookexception)
	{
		val$onOpenGraphObjectStagedListener.onError(facebookexception);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onOpenGraphObjectStagedListener>
	//    2    4:aload_1         
	//    3    5:invokeinterface #114 <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(FacebookException)>
	//    4   10:return          
	}

	final ShareApi this$0;
	final String val$ogType;
	final com.facebook.internal.pper.OnMapValueCompleteListener val$onOpenGraphObjectStagedListener;
	final com.facebook..Callback val$requestCallback;
	final JSONObject val$stagedObject;

	ShareApi$11()
	{
		this$0 = final_shareapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field ShareApi this$0>
		val$stagedObject = jsonobject;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field JSONObject val$stagedObject>
		val$ogType = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #29  <Field String val$ogType>
		val$requestCallback = callback;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #31  <Field com.facebook.GraphRequest$Callback val$requestCallback>
		val$onOpenGraphObjectStagedListener = com.facebook.internal.pper.OnMapValueCompleteListener.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #33  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onOpenGraphObjectStagedListener>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #36  <Method void Object()>
	//   17   31:return          
	}
}
