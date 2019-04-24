// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.*;
import com.facebook.internal.*;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.VideoUploader;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;
import org.json.*;

public final class ShareApi
{

	public ShareApi(ShareContent sharecontent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
		shareContent = sharecontent;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #57  <Field ShareContent shareContent>
		graphNode = "me";
	//    5    9:aload_0         
	//    6   10:ldc1            #37  <String "me">
	//    7   12:putfield        #59  <Field String graphNode>
	//    8   15:return          
	}

	private void addCommonParameters(Bundle bundle, ShareContent sharecontent)
	{
		List list = sharecontent.getPeopleIds();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #97  <Method List ShareContent.getPeopleIds()>
	//    2    4:astore_3        
		if(!Utility.isNullOrEmpty(((java.util.Collection) (list))))
	//*   3    5:aload_3         
	//*   4    6:invokestatic    #103 <Method boolean Utility.isNullOrEmpty(java.util.Collection)>
	//*   5    9:ifne            24
			bundle.putString("tags", TextUtils.join(", ", ((Iterable) (list))));
	//    6   12:aload_1         
	//    7   13:ldc1            #105 <String "tags">
	//    8   15:ldc1            #107 <String ", ">
	//    9   17:aload_3         
	//   10   18:invokestatic    #113 <Method String TextUtils.join(CharSequence, Iterable)>
	//   11   21:invokevirtual   #119 <Method void Bundle.putString(String, String)>
		if(!Utility.isNullOrEmpty(sharecontent.getPlaceId()))
	//*  12   24:aload_2         
	//*  13   25:invokevirtual   #123 <Method String ShareContent.getPlaceId()>
	//*  14   28:invokestatic    #126 <Method boolean Utility.isNullOrEmpty(String)>
	//*  15   31:ifne            44
			bundle.putString("place", sharecontent.getPlaceId());
	//   16   34:aload_1         
	//   17   35:ldc1            #128 <String "place">
	//   18   37:aload_2         
	//   19   38:invokevirtual   #123 <Method String ShareContent.getPlaceId()>
	//   20   41:invokevirtual   #119 <Method void Bundle.putString(String, String)>
		if(!Utility.isNullOrEmpty(sharecontent.getRef()))
	//*  21   44:aload_2         
	//*  22   45:invokevirtual   #131 <Method String ShareContent.getRef()>
	//*  23   48:invokestatic    #126 <Method boolean Utility.isNullOrEmpty(String)>
	//*  24   51:ifne            64
			bundle.putString("ref", sharecontent.getRef());
	//   25   54:aload_1         
	//   26   55:ldc1            #133 <String "ref">
	//   27   57:aload_2         
	//   28   58:invokevirtual   #131 <Method String ShareContent.getRef()>
	//   29   61:invokevirtual   #119 <Method void Bundle.putString(String, String)>
	//   30   64:return          
	}

	private String getGraphPath(String s)
	{
		try
		{
			s = String.format(Locale.ROOT, "%s/%s", new Object[] {
				URLEncoder.encode(getGraphNode(), "UTF-8"), s
			});
	//    0    0:getstatic       #141 <Field Locale Locale.ROOT>
	//    1    3:ldc1            #40  <String "%s/%s">
	//    2    5:iconst_2        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:invokevirtual   #144 <Method String getGraphNode()>
	//    8   15:ldc1            #34  <String "UTF-8">
	//    9   17:invokestatic    #150 <Method String URLEncoder.encode(String, String)>
	//   10   20:aastore         
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:aload_1         
	//   14   24:aastore         
	//   15   25:invokestatic    #156 <Method String String.format(Locale, String, Object[])>
	//   16   28:astore_1        
		}
	//*  17   29:aload_1         
	//*  18   30:areturn         
	//*  19   31:aconst_null     
	//*  20   32:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return s;
	//*  21   33:astore_1        
	//*  22   34:goto            31
	}

	private static void handleImagesOnAction(Bundle bundle)
	{
		String s = bundle.getString("image");
	//    0    0:aload_0         
	//    1    1:ldc1            #160 <String "image">
	//    2    3:invokevirtual   #163 <Method String Bundle.getString(String)>
	//    3    6:astore_2        
		if(s == null) goto _L2; else goto _L1
	//    4    7:aload_2         
	//    5    8:ifnull          113
_L1:
		JSONArray jsonarray = new JSONArray(s);
	//    6   11:new             #165 <Class JSONArray>
	//    7   14:dup             
	//    8   15:aload_2         
	//    9   16:invokespecial   #168 <Method void JSONArray(String)>
	//   10   19:astore_3        
		int i = 0;
	//   11   20:iconst_0        
	//   12   21:istore_1        
_L9:
		if(i >= jsonarray.length()) goto _L4; else goto _L3
	//   13   22:iload_1         
	//   14   23:aload_3         
	//   15   24:invokevirtual   #172 <Method int JSONArray.length()>
	//   16   27:icmpge          87
_L3:
		JSONObject jsonobject = jsonarray.optJSONObject(i);
	//   17   30:aload_3         
	//   18   31:iload_1         
	//   19   32:invokevirtual   #176 <Method JSONObject JSONArray.optJSONObject(int)>
	//   20   35:astore          4
		if(jsonobject == null) goto _L6; else goto _L5
	//   21   37:aload           4
	//   22   39:ifnull          52
_L5:
		putImageInBundleWithArrayFormat(bundle, i, jsonobject);
	//   23   42:aload_0         
	//   24   43:iload_1         
	//   25   44:aload           4
	//   26   46:invokestatic    #180 <Method void putImageInBundleWithArrayFormat(Bundle, int, JSONObject)>
		  goto _L7
	//*  27   49:goto            120
_L6:
		String s1 = jsonarray.getString(i);
	//   28   52:aload_3         
	//   29   53:iload_1         
	//   30   54:invokevirtual   #183 <Method String JSONArray.getString(int)>
	//   31   57:astore          4
		bundle.putString(String.format(Locale.ROOT, "image[%d][url]", new Object[] {
			Integer.valueOf(i)
		}), s1);
	//   32   59:aload_0         
	//   33   60:getstatic       #141 <Field Locale Locale.ROOT>
	//   34   63:ldc1            #185 <String "image[%d][url]">
	//   35   65:iconst_1        
	//   36   66:anewarray       Object[]
	//   37   69:dup             
	//   38   70:iconst_0        
	//   39   71:iload_1         
	//   40   72:invokestatic    #191 <Method Integer Integer.valueOf(int)>
	//   41   75:aastore         
	//   42   76:invokestatic    #156 <Method String String.format(Locale, String, Object[])>
	//   43   79:aload           4
	//   44   81:invokevirtual   #119 <Method void Bundle.putString(String, String)>
		  goto _L7
	//*  45   84:goto            120
_L4:
		try
		{
			bundle.remove("image");
	//   46   87:aload_0         
	//   47   88:ldc1            #160 <String "image">
	//   48   90:invokevirtual   #194 <Method void Bundle.remove(String)>
			return;
	//   49   93:return          
		}
	//*  50   94:aload_0         
	//*  51   95:iconst_0        
	//*  52   96:new             #196 <Class JSONObject>
	//*  53   99:dup             
	//*  54  100:aload_2         
	//*  55  101:invokespecial   #197 <Method void JSONObject(String)>
	//*  56  104:invokestatic    #180 <Method void putImageInBundleWithArrayFormat(Bundle, int, JSONObject)>
	//*  57  107:aload_0         
	//*  58  108:ldc1            #160 <String "image">
	//*  59  110:invokevirtual   #194 <Method void Bundle.remove(String)>
	//*  60  113:return          
		catch(JSONException jsonexception) { }
	//   61  114:astore_3        
		putImageInBundleWithArrayFormat(bundle, 0, new JSONObject(s));
		bundle.remove("image");
_L2:
		return;
	//*  62  115:goto            94
		bundle;
	//   63  118:astore_0        
		return;
	//   64  119:return          
_L7:
		i++;
	//   65  120:iload_1         
	//   66  121:iconst_1        
	//   67  122:iadd            
	//   68  123:istore_1        
		if(true) goto _L9; else goto _L8
	//   69  124:goto            22
_L8:
	}

	private static void putImageInBundleWithArrayFormat(Bundle bundle, int i, JSONObject jsonobject)
		throws JSONException
	{
		String s;
		for(Iterator iterator = jsonobject.keys(); iterator.hasNext(); bundle.putString(String.format(Locale.ROOT, "image[%d][%s]", new Object[] {
	Integer.valueOf(i), s
}), jsonobject.get(s).toString()))
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #201 <Method Iterator JSONObject.keys()>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:invokeinterface #207 <Method boolean Iterator.hasNext()>
	//*   5   11:ifeq            65
			s = (String)iterator.next();
	//    6   14:aload_3         
	//    7   15:invokeinterface #211 <Method Object Iterator.next()>
	//    8   20:checkcast       #152 <Class String>
	//    9   23:astore          4

	//   10   25:aload_0         
	//   11   26:getstatic       #141 <Field Locale Locale.ROOT>
	//   12   29:ldc1            #213 <String "image[%d][%s]">
	//   13   31:iconst_2        
	//   14   32:anewarray       Object[]
	//   15   35:dup             
	//   16   36:iconst_0        
	//   17   37:iload_1         
	//   18   38:invokestatic    #191 <Method Integer Integer.valueOf(int)>
	//   19   41:aastore         
	//   20   42:dup             
	//   21   43:iconst_1        
	//   22   44:aload           4
	//   23   46:aastore         
	//   24   47:invokestatic    #156 <Method String String.format(Locale, String, Object[])>
	//   25   50:aload_2         
	//   26   51:aload           4
	//   27   53:invokevirtual   #217 <Method Object JSONObject.get(String)>
	//   28   56:invokevirtual   #220 <Method String Object.toString()>
	//   29   59:invokevirtual   #119 <Method void Bundle.putString(String, String)>
	//*  30   62:goto            5
	//   31   65:return          
	}

	public static void share(ShareContent sharecontent, FacebookCallback facebookcallback)
	{
		(new ShareApi(sharecontent)).share(facebookcallback);
	//    0    0:new             #2   <Class ShareApi>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #225 <Method void ShareApi(ShareContent)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #228 <Method void share(FacebookCallback)>
	//    6   12:return          
	}

	private void shareLinkContent(ShareLinkContent sharelinkcontent, final FacebookCallback callback)
	{
		callback = ((FacebookCallback) (new com.facebook.GraphRequest.Callback() {

			public void onCompleted(GraphResponse graphresponse)
			{
				Object obj = ((Object) (graphresponse.getJSONObject()));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #33  <Method JSONObject GraphResponse.getJSONObject()>
			//    2    4:astore_2        
				if(obj == null)
			//*   3    5:aload_2         
			//*   4    6:ifnonnull       14
					obj = null;
			//    5    9:aconst_null     
			//    6   10:astore_2        
				else
			//*   7   11:goto            21
					obj = ((Object) (((JSONObject) (obj)).optString("id")));
			//    8   14:aload_2         
			//    9   15:ldc1            #35  <String "id">
			//   10   17:invokevirtual   #41  <Method String JSONObject.optString(String)>
			//   11   20:astore_2        
				ShareInternalUtility.invokeCallbackWithResults(callback, ((String) (obj)), graphresponse);
			//   12   21:aload_0         
			//   13   22:getfield        #21  <Field FacebookCallback val$callback>
			//   14   25:aload_2         
			//   15   26:aload_1         
			//   16   27:invokestatic    #47  <Method void ShareInternalUtility.invokeCallbackWithResults(FacebookCallback, String, GraphResponse)>
			//   17   30:return          
			}

			final ShareApi this$0;
			final FacebookCallback val$callback;

			
			{
				this$0 = ShareApi.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ShareApi this$0>
				callback = facebookcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field FacebookCallback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
));
	//    0    0:new             #18  <Class ShareApi$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokespecial   #235 <Method void ShareApi$4(ShareApi, FacebookCallback)>
	//    5    9:astore_2        
		Bundle bundle = new Bundle();
	//    6   10:new             #115 <Class Bundle>
	//    7   13:dup             
	//    8   14:invokespecial   #236 <Method void Bundle()>
	//    9   17:astore_3        
		addCommonParameters(bundle, ((ShareContent) (sharelinkcontent)));
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:aload_1         
	//   13   21:invokespecial   #238 <Method void addCommonParameters(Bundle, ShareContent)>
		bundle.putString("message", getMessage());
	//   14   24:aload_3         
	//   15   25:ldc1            #239 <String "message">
	//   16   27:aload_0         
	//   17   28:invokevirtual   #242 <Method String getMessage()>
	//   18   31:invokevirtual   #119 <Method void Bundle.putString(String, String)>
		bundle.putString("link", Utility.getUriString(sharelinkcontent.getContentUrl()));
	//   19   34:aload_3         
	//   20   35:ldc1            #244 <String "link">
	//   21   37:aload_1         
	//   22   38:invokevirtual   #250 <Method android.net.Uri ShareLinkContent.getContentUrl()>
	//   23   41:invokestatic    #254 <Method String Utility.getUriString(android.net.Uri)>
	//   24   44:invokevirtual   #119 <Method void Bundle.putString(String, String)>
		bundle.putString("picture", Utility.getUriString(sharelinkcontent.getImageUrl()));
	//   25   47:aload_3         
	//   26   48:ldc2            #256 <String "picture">
	//   27   51:aload_1         
	//   28   52:invokevirtual   #259 <Method android.net.Uri ShareLinkContent.getImageUrl()>
	//   29   55:invokestatic    #254 <Method String Utility.getUriString(android.net.Uri)>
	//   30   58:invokevirtual   #119 <Method void Bundle.putString(String, String)>
		bundle.putString("name", sharelinkcontent.getContentTitle());
	//   31   61:aload_3         
	//   32   62:ldc2            #261 <String "name">
	//   33   65:aload_1         
	//   34   66:invokevirtual   #264 <Method String ShareLinkContent.getContentTitle()>
	//   35   69:invokevirtual   #119 <Method void Bundle.putString(String, String)>
		bundle.putString("description", sharelinkcontent.getContentDescription());
	//   36   72:aload_3         
	//   37   73:ldc2            #266 <String "description">
	//   38   76:aload_1         
	//   39   77:invokevirtual   #269 <Method String ShareLinkContent.getContentDescription()>
	//   40   80:invokevirtual   #119 <Method void Bundle.putString(String, String)>
		bundle.putString("ref", sharelinkcontent.getRef());
	//   41   83:aload_3         
	//   42   84:ldc1            #133 <String "ref">
	//   43   86:aload_1         
	//   44   87:invokevirtual   #270 <Method String ShareLinkContent.getRef()>
	//   45   90:invokevirtual   #119 <Method void Bundle.putString(String, String)>
		(new GraphRequest(AccessToken.getCurrentAccessToken(), getGraphPath("feed"), bundle, HttpMethod.POST, ((com.facebook.GraphRequest.Callback) (callback)))).executeAsync();
	//   46   93:new             #272 <Class GraphRequest>
	//   47   96:dup             
	//   48   97:invokestatic    #278 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   49  100:aload_0         
	//   50  101:ldc2            #280 <String "feed">
	//   51  104:invokespecial   #71  <Method String getGraphPath(String)>
	//   52  107:aload_3         
	//   53  108:getstatic       #286 <Field HttpMethod HttpMethod.POST>
	//   54  111:aload_2         
	//   55  112:invokespecial   #289 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//   56  115:invokevirtual   #293 <Method com.facebook.GraphRequestAsyncTask GraphRequest.executeAsync()>
	//   57  118:pop             
	//   58  119:return          
	}

	private void shareOpenGraphContent(ShareOpenGraphContent shareopengraphcontent, final FacebookCallback callback)
	{
		final com.facebook.GraphRequest.Callback requestCallback = new com.facebook.GraphRequest.Callback() {

			public void onCompleted(GraphResponse graphresponse)
			{
				Object obj = ((Object) (graphresponse.getJSONObject()));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #33  <Method JSONObject GraphResponse.getJSONObject()>
			//    2    4:astore_2        
				if(obj == null)
			//*   3    5:aload_2         
			//*   4    6:ifnonnull       14
					obj = null;
			//    5    9:aconst_null     
			//    6   10:astore_2        
				else
			//*   7   11:goto            21
					obj = ((Object) (((JSONObject) (obj)).optString("id")));
			//    8   14:aload_2         
			//    9   15:ldc1            #35  <String "id">
			//   10   17:invokevirtual   #41  <Method String JSONObject.optString(String)>
			//   11   20:astore_2        
				ShareInternalUtility.invokeCallbackWithResults(callback, ((String) (obj)), graphresponse);
			//   12   21:aload_0         
			//   13   22:getfield        #21  <Field FacebookCallback val$callback>
			//   14   25:aload_2         
			//   15   26:aload_1         
			//   16   27:invokestatic    #47  <Method void ShareInternalUtility.invokeCallbackWithResults(FacebookCallback, String, GraphResponse)>
			//   17   30:return          
			}

			final ShareApi this$0;
			final FacebookCallback val$callback;

			
			{
				this$0 = ShareApi.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ShareApi this$0>
				callback = facebookcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field FacebookCallback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #6   <Class ShareApi$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokespecial   #297 <Method void ShareApi$1(ShareApi, FacebookCallback)>
	//    5    9:astore_3        
		final ShareOpenGraphAction action = shareopengraphcontent.getAction();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #303 <Method ShareOpenGraphAction ShareOpenGraphContent.getAction()>
	//    8   14:astore          4
		final Bundle parameters = action.getBundle();
	//    9   16:aload           4
	//   10   18:invokevirtual   #309 <Method Bundle ShareOpenGraphAction.getBundle()>
	//   11   21:astore          5
		addCommonParameters(parameters, ((ShareContent) (shareopengraphcontent)));
	//   12   23:aload_0         
	//   13   24:aload           5
	//   14   26:aload_1         
	//   15   27:invokespecial   #238 <Method void addCommonParameters(Bundle, ShareContent)>
		if(!Utility.isNullOrEmpty(getMessage()))
	//*  16   30:aload_0         
	//*  17   31:invokevirtual   #242 <Method String getMessage()>
	//*  18   34:invokestatic    #126 <Method boolean Utility.isNullOrEmpty(String)>
	//*  19   37:ifne            51
			parameters.putString("message", getMessage());
	//   20   40:aload           5
	//   21   42:ldc1            #239 <String "message">
	//   22   44:aload_0         
	//   23   45:invokevirtual   #242 <Method String getMessage()>
	//   24   48:invokevirtual   #119 <Method void Bundle.putString(String, String)>
		stageOpenGraphAction(parameters, new com.facebook.internal.CollectionMapper.OnMapperCompleteListener() {

			public void onComplete()
			{
				try
				{
					ShareApi.handleImagesOnAction(parameters);
			//    0    0:aload_0         
			//    1    1:getfield        #27  <Field Bundle val$parameters>
			//    2    4:invokestatic    #44  <Method void ShareApi.access$000(Bundle)>
					(new GraphRequest(AccessToken.getCurrentAccessToken(), getGraphPath(URLEncoder.encode(action.getActionType(), "UTF-8")), parameters, HttpMethod.POST, requestCallback)).executeAsync();
			//    3    7:new             #46  <Class GraphRequest>
			//    4   10:dup             
			//    5   11:invokestatic    #52  <Method AccessToken AccessToken.getCurrentAccessToken()>
			//    6   14:aload_0         
			//    7   15:getfield        #25  <Field ShareApi this$0>
			//    8   18:aload_0         
			//    9   19:getfield        #29  <Field ShareOpenGraphAction val$action>
			//   10   22:invokevirtual   #58  <Method String ShareOpenGraphAction.getActionType()>
			//   11   25:ldc1            #60  <String "UTF-8">
			//   12   27:invokestatic    #66  <Method String URLEncoder.encode(String, String)>
			//   13   30:invokestatic    #70  <Method String ShareApi.access$100(ShareApi, String)>
			//   14   33:aload_0         
			//   15   34:getfield        #27  <Field Bundle val$parameters>
			//   16   37:getstatic       #76  <Field HttpMethod HttpMethod.POST>
			//   17   40:aload_0         
			//   18   41:getfield        #31  <Field com.facebook.GraphRequest$Callback val$requestCallback>
			//   19   44:invokespecial   #79  <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
			//   20   47:invokevirtual   #83  <Method com.facebook.GraphRequestAsyncTask GraphRequest.executeAsync()>
			//   21   50:pop             
					return;
			//   22   51:return          
				}
				catch(UnsupportedEncodingException unsupportedencodingexception)
			//*  23   52:astore_1        
				{
					ShareInternalUtility.invokeCallbackWithException(callback, ((Exception) (unsupportedencodingexception)));
			//   24   53:aload_0         
			//   25   54:getfield        #33  <Field FacebookCallback val$callback>
			//   26   57:aload_1         
			//   27   58:invokestatic    #89  <Method void ShareInternalUtility.invokeCallbackWithException(FacebookCallback, Exception)>
				}
			//   28   61:return          
			}

			public void onError(FacebookException facebookexception)
			{
				ShareInternalUtility.invokeCallbackWithException(callback, ((Exception) (facebookexception)));
			//    0    0:aload_0         
			//    1    1:getfield        #33  <Field FacebookCallback val$callback>
			//    2    4:aload_1         
			//    3    5:invokestatic    #89  <Method void ShareInternalUtility.invokeCallbackWithException(FacebookCallback, Exception)>
			//    4    8:return          
			}

			final ShareApi this$0;
			final ShareOpenGraphAction val$action;
			final FacebookCallback val$callback;
			final Bundle val$parameters;
			final com.facebook.GraphRequest.Callback val$requestCallback;

			
			{
				this$0 = ShareApi.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field ShareApi this$0>
				parameters = bundle;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field Bundle val$parameters>
				action = shareopengraphaction;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field ShareOpenGraphAction val$action>
				requestCallback = callback1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #31  <Field com.facebook.GraphRequest$Callback val$requestCallback>
				callback = facebookcallback;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #33  <Field FacebookCallback val$callback>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #36  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//   25   51:aload_0         
	//   26   52:aload           5
	//   27   54:new             #14  <Class ShareApi$2>
	//   28   57:dup             
	//   29   58:aload_0         
	//   30   59:aload           5
	//   31   61:aload           4
	//   32   63:aload_3         
	//   33   64:aload_2         
	//   34   65:invokespecial   #312 <Method void ShareApi$2(ShareApi, Bundle, ShareOpenGraphAction, com.facebook.GraphRequest$Callback, FacebookCallback)>
	//   35   68:invokespecial   #316 <Method void stageOpenGraphAction(Bundle, com.facebook.internal.CollectionMapper$OnMapperCompleteListener)>
	//   36   71:return          
	}

	private void sharePhotoContent(SharePhotoContent sharephotocontent, FacebookCallback facebookcallback)
	{
		Object obj;
		Mutable mutable;
		AccessToken accesstoken;
		com.facebook.GraphRequest.Callback callback;
		mutable = new Mutable(((Object) (Integer.valueOf(0))));
	//    0    0:new             #323 <Class Mutable>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokestatic    #191 <Method Integer Integer.valueOf(int)>
	//    4    8:invokespecial   #326 <Method void Mutable(Object)>
	//    5   11:astore          5
		accesstoken = AccessToken.getCurrentAccessToken();
	//    6   13:invokestatic    #278 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    7   16:astore          6
		obj = ((Object) (new ArrayList()));
	//    8   18:new             #328 <Class ArrayList>
	//    9   21:dup             
	//   10   22:invokespecial   #329 <Method void ArrayList()>
	//   11   25:astore_3        
		callback = new com.facebook.GraphRequest.Callback() {

			public void onCompleted(GraphResponse graphresponse)
			{
				JSONObject jsonobject = graphresponse.getJSONObject();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #44  <Method JSONObject GraphResponse.getJSONObject()>
			//    2    4:astore_2        
				if(jsonobject != null)
			//*   3    5:aload_2         
			//*   4    6:ifnull          18
					results.add(((Object) (jsonobject)));
			//    5    9:aload_0         
			//    6   10:getfield        #26  <Field ArrayList val$results>
			//    7   13:aload_2         
			//    8   14:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
			//    9   17:pop             
				if(graphresponse.getError() != null)
			//*  10   18:aload_1         
			//*  11   19:invokevirtual   #54  <Method FacebookRequestError GraphResponse.getError()>
			//*  12   22:ifnull          34
					errorResponses.add(((Object) (graphresponse)));
			//   13   25:aload_0         
			//   14   26:getfield        #28  <Field ArrayList val$errorResponses>
			//   15   29:aload_1         
			//   16   30:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
			//   17   33:pop             
				requestCount.value = ((Object) (Integer.valueOf(((Integer)requestCount.value).intValue() - 1)));
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
				if(((Integer)requestCount.value).intValue() == 0)
			//*  29   59:aload_0         
			//*  30   60:getfield        #30  <Field Mutable val$requestCount>
			//*  31   63:getfield        #60  <Field Object Mutable.value>
			//*  32   66:checkcast       #62  <Class Integer>
			//*  33   69:invokevirtual   #66  <Method int Integer.intValue()>
			//*  34   72:ifne            141
				{
					if(!errorResponses.isEmpty())
			//*  35   75:aload_0         
			//*  36   76:getfield        #28  <Field ArrayList val$errorResponses>
			//*  37   79:invokevirtual   #74  <Method boolean ArrayList.isEmpty()>
			//*  38   82:ifne            105
					{
						ShareInternalUtility.invokeCallbackWithResults(callback, ((String) (null)), (GraphResponse)errorResponses.get(0));
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
					if(!results.isEmpty())
			//*  49  105:aload_0         
			//*  50  106:getfield        #26  <Field ArrayList val$results>
			//*  51  109:invokevirtual   #74  <Method boolean ArrayList.isEmpty()>
			//*  52  112:ifne            141
					{
						String s1 = ((JSONObject)results.get(0)).optString("id");
			//   53  115:aload_0         
			//   54  116:getfield        #26  <Field ArrayList val$results>
			//   55  119:iconst_0        
			//   56  120:invokevirtual   #78  <Method Object ArrayList.get(int)>
			//   57  123:checkcast       #86  <Class JSONObject>
			//   58  126:ldc1            #88  <String "id">
			//   59  128:invokevirtual   #92  <Method String JSONObject.optString(String)>
			//   60  131:astore_2        
						ShareInternalUtility.invokeCallbackWithResults(callback, s1, graphresponse);
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

			
			{
				this$0 = ShareApi.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field ShareApi this$0>
				results = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field ArrayList val$results>
				errorResponses = arraylist1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field ArrayList val$errorResponses>
				requestCount = mutable;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field Mutable val$requestCount>
				callback = facebookcallback;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #32  <Field FacebookCallback val$callback>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #35  <Method void Object()>
			//   17   31:return          
			}
		}
;
	//   12   26:new             #16  <Class ShareApi$3>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:new             #328 <Class ArrayList>
	//   16   34:dup             
	//   17   35:invokespecial   #329 <Method void ArrayList()>
	//   18   38:new             #328 <Class ArrayList>
	//   19   41:dup             
	//   20   42:invokespecial   #329 <Method void ArrayList()>
	//   21   45:aload           5
	//   22   47:aload_2         
	//   23   48:invokespecial   #332 <Method void ShareApi$3(ShareApi, ArrayList, ArrayList, Mutable, FacebookCallback)>
	//   24   51:astore          7
		Iterator iterator = sharephotocontent.getPhotos().iterator();
	//   25   53:aload_1         
	//   26   54:invokevirtual   #337 <Method List SharePhotoContent.getPhotos()>
	//   27   57:invokeinterface #342 <Method Iterator List.iterator()>
	//   28   62:astore          8
		sharephotocontent = ((SharePhotoContent) (obj));
	//   29   64:aload_3         
	//   30   65:astore_1        
_L2:
		String s;
		SharePhoto sharephoto;
		android.graphics.Bitmap bitmap;
		android.net.Uri uri;
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   31   66:aload           8
	//   32   68:invokeinterface #207 <Method boolean Iterator.hasNext()>
	//   33   73:ifeq            190
		sharephoto = (SharePhoto)iterator.next();
	//   34   76:aload           8
	//   35   78:invokeinterface #211 <Method Object Iterator.next()>
	//   36   83:checkcast       #344 <Class SharePhoto>
	//   37   86:astore          9
		bitmap = sharephoto.getBitmap();
	//   38   88:aload           9
	//   39   90:invokevirtual   #348 <Method android.graphics.Bitmap SharePhoto.getBitmap()>
	//   40   93:astore          10
		uri = sharephoto.getImageUrl();
	//   41   95:aload           9
	//   42   97:invokevirtual   #349 <Method android.net.Uri SharePhoto.getImageUrl()>
	//   43  100:astore          11
		s = sharephoto.getCaption();
	//   44  102:aload           9
	//   45  104:invokevirtual   #352 <Method String SharePhoto.getCaption()>
	//   46  107:astore          4
		obj = ((Object) (s));
	//   47  109:aload           4
	//   48  111:astore_3        
		if(s != null)
			break MISSING_BLOCK_LABEL_122;
	//   49  112:aload           4
	//   50  114:ifnonnull       122
		obj = ((Object) (getMessage()));
	//   51  117:aload_0         
	//   52  118:invokevirtual   #242 <Method String getMessage()>
	//   53  121:astore_3        
		if(bitmap == null)
			break MISSING_BLOCK_LABEL_156;
	//   54  122:aload           10
	//   55  124:ifnull          156
		((ArrayList) (sharephotocontent)).add(((Object) (GraphRequest.newUploadPhotoRequest(accesstoken, getGraphPath("photos"), bitmap, ((String) (obj)), sharephoto.getParameters(), callback))));
	//   56  127:aload_1         
	//   57  128:aload           6
	//   58  130:aload_0         
	//   59  131:ldc1            #43  <String "photos">
	//   60  133:invokespecial   #71  <Method String getGraphPath(String)>
	//   61  136:aload           10
	//   62  138:aload_3         
	//   63  139:aload           9
	//   64  141:invokevirtual   #355 <Method Bundle SharePhoto.getParameters()>
	//   65  144:aload           7
	//   66  146:invokestatic    #359 <Method GraphRequest GraphRequest.newUploadPhotoRequest(AccessToken, String, android.graphics.Bitmap, String, Bundle, com.facebook.GraphRequest$Callback)>
	//   67  149:invokevirtual   #363 <Method boolean ArrayList.add(Object)>
	//   68  152:pop             
		continue; /* Loop/switch isn't completed */
	//   69  153:goto            251
		if(uri == null)
			continue; /* Loop/switch isn't completed */
	//   70  156:aload           11
	//   71  158:ifnull          251
		((ArrayList) (sharephotocontent)).add(((Object) (GraphRequest.newUploadPhotoRequest(accesstoken, getGraphPath("photos"), uri, ((String) (obj)), sharephoto.getParameters(), callback))));
	//   72  161:aload_1         
	//   73  162:aload           6
	//   74  164:aload_0         
	//   75  165:ldc1            #43  <String "photos">
	//   76  167:invokespecial   #71  <Method String getGraphPath(String)>
	//   77  170:aload           11
	//   78  172:aload_3         
	//   79  173:aload           9
	//   80  175:invokevirtual   #355 <Method Bundle SharePhoto.getParameters()>
	//   81  178:aload           7
	//   82  180:invokestatic    #366 <Method GraphRequest GraphRequest.newUploadPhotoRequest(AccessToken, String, android.net.Uri, String, Bundle, com.facebook.GraphRequest$Callback)>
	//   83  183:invokevirtual   #363 <Method boolean ArrayList.add(Object)>
	//   84  186:pop             
		if(true) goto _L2; else goto _L1
	//   85  187:goto            251
_L1:
		try
		{
			mutable.value = ((Object) (Integer.valueOf(((Integer)mutable.value).intValue() + ((ArrayList) (sharephotocontent)).size())));
	//   86  190:aload           5
	//   87  192:aload           5
	//   88  194:getfield        #370 <Field Object Mutable.value>
	//   89  197:checkcast       #187 <Class Integer>
	//   90  200:invokevirtual   #373 <Method int Integer.intValue()>
	//   91  203:aload_1         
	//   92  204:invokevirtual   #376 <Method int ArrayList.size()>
	//   93  207:iadd            
	//   94  208:invokestatic    #191 <Method Integer Integer.valueOf(int)>
	//   95  211:putfield        #370 <Field Object Mutable.value>
			for(sharephotocontent = ((SharePhotoContent) (((ArrayList) (sharephotocontent)).iterator())); ((Iterator) (sharephotocontent)).hasNext(); ((GraphRequest)((Iterator) (sharephotocontent)).next()).executeAsync());
	//   96  214:aload_1         
	//   97  215:invokevirtual   #377 <Method Iterator ArrayList.iterator()>
	//   98  218:astore_1        
	//   99  219:aload_1         
	//  100  220:invokeinterface #207 <Method boolean Iterator.hasNext()>
	//  101  225:ifeq            250
	//  102  228:aload_1         
	//  103  229:invokeinterface #211 <Method Object Iterator.next()>
	//  104  234:checkcast       #272 <Class GraphRequest>
	//  105  237:invokevirtual   #293 <Method com.facebook.GraphRequestAsyncTask GraphRequest.executeAsync()>
	//  106  240:pop             
		}
	//* 107  241:goto            219
		// Misplaced declaration of an exception variable
		catch(SharePhotoContent sharephotocontent)
	//* 108  244:astore_1        
		{
			ShareInternalUtility.invokeCallbackWithException(facebookcallback, ((Exception) (sharephotocontent)));
	//  109  245:aload_2         
	//  110  246:aload_1         
	//  111  247:invokestatic    #383 <Method void ShareInternalUtility.invokeCallbackWithException(FacebookCallback, Exception)>
		}
		return;
	//  112  250:return          
	//* 113  251:goto            66
	}

	private void shareVideoContent(ShareVideoContent sharevideocontent, FacebookCallback facebookcallback)
	{
		try
		{
			VideoUploader.uploadAsync(sharevideocontent, getGraphNode(), facebookcallback);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #144 <Method String getGraphNode()>
	//    3    5:aload_2         
	//    4    6:invokestatic    #392 <Method void VideoUploader.uploadAsync(ShareVideoContent, String, FacebookCallback)>
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(ShareVideoContent sharevideocontent)
	//*   6   10:astore_1        
		{
			ShareInternalUtility.invokeCallbackWithException(facebookcallback, ((Exception) (sharevideocontent)));
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokestatic    #383 <Method void ShareInternalUtility.invokeCallbackWithException(FacebookCallback, Exception)>
		}
	//   10   16:return          
	}

	private void stageArrayList(final ArrayList arrayList, final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onArrayListStagedListener)
	{
		final JSONArray stagedObject = new JSONArray();
	//    0    0:new             #165 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #394 <Method void JSONArray()>
	//    3    7:astore_3        
		stageCollectionValues(new com.facebook.internal.CollectionMapper.Collection() {

			public Object get(Integer integer)
			{
				return arrayList.get(integer.intValue());
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field ArrayList val$arrayList>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #40  <Method int Integer.intValue()>
			//    4    8:invokevirtual   #45  <Method Object ArrayList.get(int)>
			//    5   11:areturn         
			}

			public volatile Object get(Object obj)
			{
				return get((Integer)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #36  <Class Integer>
			//    3    5:invokevirtual   #48  <Method Object get(Integer)>
			//    4    8:areturn         
			}

			public Iterator keyIterator()
			{
				int i = arrayList.size();
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field ArrayList val$arrayList>
			//    2    4:invokevirtual   #53  <Method int ArrayList.size()>
			//    3    7:istore_1        
				return ((_cls1) (i)). new Iterator() {

					public boolean hasNext()
					{
						return ((Integer)current.value).intValue() < size;
					//    0    0:aload_0         
					//    1    1:getfield        #24  <Field Mutable val$current>
					//    2    4:getfield        #38  <Field Object Mutable.value>
					//    3    7:checkcast       #40  <Class Integer>
					//    4   10:invokevirtual   #44  <Method int Integer.intValue()>
					//    5   13:aload_0         
					//    6   14:getfield        #26  <Field int val$size>
					//    7   17:icmpge          22
					//    8   20:iconst_1        
					//    9   21:ireturn         
					//   10   22:iconst_0        
					//   11   23:ireturn         
					}

					public Integer next()
					{
						Integer integer = (Integer)current.value;
					//    0    0:aload_0         
					//    1    1:getfield        #24  <Field Mutable val$current>
					//    2    4:getfield        #38  <Field Object Mutable.value>
					//    3    7:checkcast       #40  <Class Integer>
					//    4   10:astore_1        
						Mutable mutable = current;
					//    5   11:aload_0         
					//    6   12:getfield        #24  <Field Mutable val$current>
					//    7   15:astore_2        
						mutable.value = ((Object) (Integer.valueOf(((Integer)mutable.value).intValue() + 1)));
					//    8   16:aload_2         
					//    9   17:aload_2         
					//   10   18:getfield        #38  <Field Object Mutable.value>
					//   11   21:checkcast       #40  <Class Integer>
					//   12   24:invokevirtual   #44  <Method int Integer.intValue()>
					//   13   27:iconst_1        
					//   14   28:iadd            
					//   15   29:invokestatic    #50  <Method Integer Integer.valueOf(int)>
					//   16   32:putfield        #38  <Field Object Mutable.value>
						return integer;
					//   17   35:aload_1         
					//   18   36:areturn         
					}

					public volatile Object next()
					{
						return ((Object) (next()));
					//    0    0:aload_0         
					//    1    1:invokevirtual   #53  <Method Integer next()>
					//    2    4:areturn         
					}

					public void remove()
					{
					//    0    0:return          
					}

					final _cls5 this$1;
					final Mutable val$current;
					final int val$size;

			
			{
				this$1 = final__pcls5;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ShareApi$5 this$1>
				current = mutable;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Mutable val$current>
				size = I.this;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #26  <Field int val$size>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
				}
;
			//    4    8:new             #14  <Class ShareApi$5$1>
			//    5   11:dup             
			//    6   12:aload_0         
			//    7   13:new             #55  <Class Mutable>
			//    8   16:dup             
			//    9   17:iconst_0        
			//   10   18:invokestatic    #59  <Method Integer Integer.valueOf(int)>
			//   11   21:invokespecial   #62  <Method void Mutable(Object)>
			//   12   24:iload_1         
			//   13   25:invokespecial   #65  <Method void ShareApi$5$1(ShareApi$5, Mutable, int)>
			//   14   28:areturn         
			}

			public void set(Integer integer, Object obj, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
			{
				try
				{
					stagedObject.put(integer.intValue(), obj);
			//    0    0:aload_0         
			//    1    1:getfield        #28  <Field JSONArray val$stagedObject>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #40  <Method int Integer.intValue()>
			//    4    8:aload_2         
			//    5    9:invokevirtual   #77  <Method JSONArray JSONArray.put(int, Object)>
			//    6   12:pop             
					return;
			//    7   13:return          
				}
				// Misplaced declaration of an exception variable
				catch(Integer integer)
			//*   8   14:astore_1        
				{
					obj = ((Object) (((JSONException) (integer)).getLocalizedMessage()));
			//    9   15:aload_1         
			//   10   16:invokevirtual   #81  <Method String JSONException.getLocalizedMessage()>
			//   11   19:astore_2        
				}
				integer = ((Integer) (obj));
			//   12   20:aload_2         
			//   13   21:astore_1        
				if(obj == null)
			//*  14   22:aload_2         
			//*  15   23:ifnonnull       29
					integer = "Error staging object.";
			//   16   26:ldc1            #83  <String "Error staging object.">
			//   17   28:astore_1        
				onerrorlistener.onError(new FacebookException(((String) (integer))));
			//   18   29:aload_3         
			//   19   30:new             #85  <Class FacebookException>
			//   20   33:dup             
			//   21   34:aload_1         
			//   22   35:invokespecial   #88  <Method void FacebookException(String)>
			//   23   38:invokeinterface #94  <Method void com.facebook.internal.CollectionMapper$OnErrorListener.onError(FacebookException)>
			//   24   43:return          
			}

			public volatile void set(Object obj, Object obj1, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
			{
				set((Integer)obj, obj1, onerrorlistener);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #36  <Class Integer>
			//    3    5:aload_2         
			//    4    6:aload_3         
			//    5    7:invokevirtual   #97  <Method void set(Integer, Object, com.facebook.internal.CollectionMapper$OnErrorListener)>
			//    6   10:return          
			}

			final ShareApi this$0;
			final ArrayList val$arrayList;
			final JSONArray val$stagedObject;

			
			{
				this$0 = ShareApi.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field ShareApi this$0>
				arrayList = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field ArrayList val$arrayList>
				stagedObject = jsonarray;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field JSONArray val$stagedObject>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
		}
, new com.facebook.internal.CollectionMapper.OnMapperCompleteListener() {

			public void onComplete()
			{
				onArrayListStagedListener.onComplete(((Object) (stagedObject)));
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onArrayListStagedListener>
			//    2    4:aload_0         
			//    3    5:getfield        #25  <Field JSONArray val$stagedObject>
			//    4    8:invokeinterface #35  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onComplete(Object)>
			//    5   13:return          
			}

			public void onError(FacebookException facebookexception)
			{
				onArrayListStagedListener.onError(facebookexception);
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onArrayListStagedListener>
			//    2    4:aload_1         
			//    3    5:invokeinterface #39  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(FacebookException)>
			//    4   10:return          
			}

			final ShareApi this$0;
			final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener val$onArrayListStagedListener;
			final JSONArray val$stagedObject;

			
			{
				this$0 = ShareApi.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ShareApi this$0>
				onArrayListStagedListener = onmapvaluecompletelistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onArrayListStagedListener>
				stagedObject = jsonarray;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field JSONArray val$stagedObject>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    4    8:aload_0         
	//    5    9:new             #20  <Class ShareApi$5>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_3         
	//   10   16:invokespecial   #397 <Method void ShareApi$5(ShareApi, ArrayList, JSONArray)>
	//   11   19:new             #24  <Class ShareApi$6>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:aload_3         
	//   16   26:invokespecial   #400 <Method void ShareApi$6(ShareApi, com.facebook.internal.CollectionMapper$OnMapValueCompleteListener, JSONArray)>
	//   17   29:invokespecial   #404 <Method void stageCollectionValues(com.facebook.internal.CollectionMapper$Collection, com.facebook.internal.CollectionMapper$OnMapperCompleteListener)>
	//   18   32:return          
	}

	private void stageCollectionValues(com.facebook.internal.CollectionMapper.Collection collection, com.facebook.internal.CollectionMapper.OnMapperCompleteListener onmappercompletelistener)
	{
		CollectionMapper.iterate(collection, new com.facebook.internal.CollectionMapper.ValueMapper() {

			public void mapValue(Object obj, com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onmapvaluecompletelistener)
			{
				if(obj instanceof ArrayList)
			//*   0    0:aload_1         
			//*   1    1:instanceof      #25  <Class ArrayList>
			//*   2    4:ifeq            20
				{
					stageArrayList((ArrayList)obj, onmapvaluecompletelistener);
			//    3    7:aload_0         
			//    4    8:getfield        #17  <Field ShareApi this$0>
			//    5   11:aload_1         
			//    6   12:checkcast       #25  <Class ArrayList>
			//    7   15:aload_2         
			//    8   16:invokestatic    #29  <Method void ShareApi.access$200(ShareApi, ArrayList, com.facebook.internal.CollectionMapper$OnMapValueCompleteListener)>
					return;
			//    9   19:return          
				}
				if(obj instanceof ShareOpenGraphObject)
			//*  10   20:aload_1         
			//*  11   21:instanceof      #31  <Class ShareOpenGraphObject>
			//*  12   24:ifeq            40
				{
					stageOpenGraphObject((ShareOpenGraphObject)obj, onmapvaluecompletelistener);
			//   13   27:aload_0         
			//   14   28:getfield        #17  <Field ShareApi this$0>
			//   15   31:aload_1         
			//   16   32:checkcast       #31  <Class ShareOpenGraphObject>
			//   17   35:aload_2         
			//   18   36:invokestatic    #35  <Method void ShareApi.access$300(ShareApi, ShareOpenGraphObject, com.facebook.internal.CollectionMapper$OnMapValueCompleteListener)>
					return;
			//   19   39:return          
				}
				if(obj instanceof SharePhoto)
			//*  20   40:aload_1         
			//*  21   41:instanceof      #37  <Class SharePhoto>
			//*  22   44:ifeq            60
				{
					stagePhoto((SharePhoto)obj, onmapvaluecompletelistener);
			//   23   47:aload_0         
			//   24   48:getfield        #17  <Field ShareApi this$0>
			//   25   51:aload_1         
			//   26   52:checkcast       #37  <Class SharePhoto>
			//   27   55:aload_2         
			//   28   56:invokestatic    #41  <Method void ShareApi.access$400(ShareApi, SharePhoto, com.facebook.internal.CollectionMapper$OnMapValueCompleteListener)>
					return;
			//   29   59:return          
				} else
				{
					onmapvaluecompletelistener.onComplete(obj);
			//   30   60:aload_2         
			//   31   61:aload_1         
			//   32   62:invokeinterface #47  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onComplete(Object)>
					return;
			//   33   67:return          
				}
			}

			final ShareApi this$0;

			
			{
				this$0 = ShareApi.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ShareApi this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
, onmappercompletelistener);
	//    0    0:aload_1         
	//    1    1:new             #26  <Class ShareApi$7>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #407 <Method void ShareApi$7(ShareApi)>
	//    5    9:aload_2         
	//    6   10:invokestatic    #413 <Method void CollectionMapper.iterate(com.facebook.internal.CollectionMapper$Collection, com.facebook.internal.CollectionMapper$ValueMapper, com.facebook.internal.CollectionMapper$OnMapperCompleteListener)>
	//    7   13:return          
	}

	private void stageOpenGraphAction(final Bundle parameters, com.facebook.internal.CollectionMapper.OnMapperCompleteListener onmappercompletelistener)
	{
		stageCollectionValues(new com.facebook.internal.CollectionMapper.Collection() {

			public volatile Object get(Object obj)
			{
				return get((String)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #30  <Class String>
			//    3    5:invokevirtual   #33  <Method Object get(String)>
			//    4    8:areturn         
			}

			public Object get(String s)
			{
				return parameters.get(s);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field Bundle val$parameters>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #36  <Method Object Bundle.get(String)>
			//    4    8:areturn         
			}

			public Iterator keyIterator()
			{
				return parameters.keySet().iterator();
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field Bundle val$parameters>
			//    2    4:invokevirtual   #42  <Method Set Bundle.keySet()>
			//    3    7:invokeinterface #47  <Method Iterator Set.iterator()>
			//    4   12:areturn         
			}

			public volatile void set(Object obj, Object obj1, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
			{
				set((String)obj, obj1, onerrorlistener);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #30  <Class String>
			//    3    5:aload_2         
			//    4    6:aload_3         
			//    5    7:invokevirtual   #54  <Method void set(String, Object, com.facebook.internal.CollectionMapper$OnErrorListener)>
			//    6   10:return          
			}

			public void set(String s, Object obj, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
			{
				if(!Utility.putJSONValueInBundle(parameters, s, obj))
			//*   0    0:aload_0         
			//*   1    1:getfield        #22  <Field Bundle val$parameters>
			//*   2    4:aload_1         
			//*   3    5:aload_2         
			//*   4    6:invokestatic    #60  <Method boolean Utility.putJSONValueInBundle(Bundle, String, Object)>
			//*   5    9:ifne            53
				{
					s = ((String) (new StringBuilder()));
			//    6   12:new             #62  <Class StringBuilder>
			//    7   15:dup             
			//    8   16:invokespecial   #63  <Method void StringBuilder()>
			//    9   19:astore_1        
					((StringBuilder) (s)).append("Unexpected value: ");
			//   10   20:aload_1         
			//   11   21:ldc1            #65  <String "Unexpected value: ">
			//   12   23:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
			//   13   26:pop             
					((StringBuilder) (s)).append(obj.toString());
			//   14   27:aload_1         
			//   15   28:aload_2         
			//   16   29:invokevirtual   #73  <Method String Object.toString()>
			//   17   32:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
			//   18   35:pop             
					onerrorlistener.onError(new FacebookException(((StringBuilder) (s)).toString()));
			//   19   36:aload_3         
			//   20   37:new             #75  <Class FacebookException>
			//   21   40:dup             
			//   22   41:aload_1         
			//   23   42:invokevirtual   #76  <Method String StringBuilder.toString()>
			//   24   45:invokespecial   #79  <Method void FacebookException(String)>
			//   25   48:invokeinterface #85  <Method void com.facebook.internal.CollectionMapper$OnErrorListener.onError(FacebookException)>
				}
			//   26   53:return          
			}

			final ShareApi this$0;
			final Bundle val$parameters;

			
			{
				this$0 = ShareApi.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ShareApi this$0>
				parameters = bundle;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Bundle val$parameters>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
, onmappercompletelistener);
	//    0    0:aload_0         
	//    1    1:new             #28  <Class ShareApi$8>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #417 <Method void ShareApi$8(ShareApi, Bundle)>
	//    6   10:aload_2         
	//    7   11:invokespecial   #404 <Method void stageCollectionValues(com.facebook.internal.CollectionMapper$Collection, com.facebook.internal.CollectionMapper$OnMapperCompleteListener)>
	//    8   14:return          
	}

	private void stageOpenGraphObject(final ShareOpenGraphObject object, final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onOpenGraphObjectStagedListener)
	{
		String s = object.getString("type");
	//    0    0:aload_1         
	//    1    1:ldc2            #419 <String "type">
	//    2    4:invokevirtual   #422 <Method String ShareOpenGraphObject.getString(String)>
	//    3    7:astore          4
		final String ogType = s;
	//    4    9:aload           4
	//    5   11:astore_3        
		if(s == null)
	//*   6   12:aload           4
	//*   7   14:ifnonnull       25
			ogType = object.getString("og:type");
	//    8   17:aload_1         
	//    9   18:ldc2            #424 <String "og:type">
	//   10   21:invokevirtual   #422 <Method String ShareOpenGraphObject.getString(String)>
	//   11   24:astore_3        
		if(ogType == null)
	//*  12   25:aload_3         
	//*  13   26:ifnonnull       46
		{
			onOpenGraphObjectStagedListener.onError(new FacebookException("Open Graph objects must contain a type value."));
	//   14   29:aload_2         
	//   15   30:new             #426 <Class FacebookException>
	//   16   33:dup             
	//   17   34:ldc2            #428 <String "Open Graph objects must contain a type value.">
	//   18   37:invokespecial   #429 <Method void FacebookException(String)>
	//   19   40:invokeinterface #435 <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(FacebookException)>
			return;
	//   20   45:return          
		} else
		{
			final JSONObject stagedObject = new JSONObject();
	//   21   46:new             #196 <Class JSONObject>
	//   22   49:dup             
	//   23   50:invokespecial   #436 <Method void JSONObject()>
	//   24   53:astore          4
			stageCollectionValues(new com.facebook.internal.CollectionMapper.Collection() {

				public volatile Object get(Object obj)
				{
					return get((String)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #34  <Class String>
				//    3    5:invokevirtual   #37  <Method Object get(String)>
				//    4    8:areturn         
				}

				public Object get(String s1)
				{
					return object.get(s1);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field ShareOpenGraphObject val$object>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #40  <Method Object ShareOpenGraphObject.get(String)>
				//    4    8:areturn         
				}

				public Iterator keyIterator()
				{
					return object.keySet().iterator();
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field ShareOpenGraphObject val$object>
				//    2    4:invokevirtual   #46  <Method Set ShareOpenGraphObject.keySet()>
				//    3    7:invokeinterface #51  <Method Iterator Set.iterator()>
				//    4   12:areturn         
				}

				public volatile void set(Object obj, Object obj1, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
				{
					set((String)obj, obj1, onerrorlistener);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #34  <Class String>
				//    3    5:aload_2         
				//    4    6:aload_3         
				//    5    7:invokevirtual   #58  <Method void set(String, Object, com.facebook.internal.CollectionMapper$OnErrorListener)>
				//    6   10:return          
				}

				public void set(String s1, Object obj, com.facebook.internal.CollectionMapper.OnErrorListener onerrorlistener)
				{
					try
					{
						stagedObject.put(s1, obj);
				//    0    0:aload_0         
				//    1    1:getfield        #26  <Field JSONObject val$stagedObject>
				//    2    4:aload_1         
				//    3    5:aload_2         
				//    4    6:invokevirtual   #66  <Method JSONObject JSONObject.put(String, Object)>
				//    5    9:pop             
						return;
				//    6   10:return          
					}
					// Misplaced declaration of an exception variable
					catch(String s1)
				//*   7   11:astore_1        
					{
						obj = ((Object) (((JSONException) (s1)).getLocalizedMessage()));
				//    8   12:aload_1         
				//    9   13:invokevirtual   #70  <Method String JSONException.getLocalizedMessage()>
				//   10   16:astore_2        
					}
					s1 = ((String) (obj));
				//   11   17:aload_2         
				//   12   18:astore_1        
					if(obj == null)
				//*  13   19:aload_2         
				//*  14   20:ifnonnull       26
						s1 = "Error staging object.";
				//   15   23:ldc1            #72  <String "Error staging object.">
				//   16   25:astore_1        
					onerrorlistener.onError(new FacebookException(s1));
				//   17   26:aload_3         
				//   18   27:new             #74  <Class FacebookException>
				//   19   30:dup             
				//   20   31:aload_1         
				//   21   32:invokespecial   #77  <Method void FacebookException(String)>
				//   22   35:invokeinterface #83  <Method void com.facebook.internal.CollectionMapper$OnErrorListener.onError(FacebookException)>
				//   23   40:return          
				}

				final ShareApi this$0;
				final ShareOpenGraphObject val$object;
				final JSONObject val$stagedObject;

			
			{
				this$0 = ShareApi.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ShareApi this$0>
				object = shareopengraphobject;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field ShareOpenGraphObject val$object>
				stagedObject = jsonobject;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field JSONObject val$stagedObject>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
			}
, new com.facebook.internal.CollectionMapper.OnMapperCompleteListener() {

				public void onComplete()
				{
					Object obj1 = ((Object) (stagedObject.toString()));
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
						stringbuilder.append(URLEncoder.encode(ogType, "UTF-8"));
				//   25   49:aload           4
				//   26   51:aload_0         
				//   27   52:getfield        #29  <Field String val$ogType>
				//   28   55:ldc1            #72  <String "UTF-8">
				//   29   57:invokestatic    #78  <Method String URLEncoder.encode(String, String)>
				//   30   60:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
				//   31   63:pop             
						(new GraphRequest(((AccessToken) (obj1)), shareapi.getGraphPath(stringbuilder.toString()), ((Bundle) (obj)), HttpMethod.POST, requestCallback)).executeAsync();
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
					onOpenGraphObjectStagedListener.onError(new FacebookException(((String) (unsupportedencodingexception))));
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
					onOpenGraphObjectStagedListener.onError(facebookexception);
				//    0    0:aload_0         
				//    1    1:getfield        #33  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onOpenGraphObjectStagedListener>
				//    2    4:aload_1         
				//    3    5:invokeinterface #114 <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(FacebookException)>
				//    4   10:return          
				}

				final ShareApi this$0;
				final String val$ogType;
				final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener val$onOpenGraphObjectStagedListener;
				final com.facebook.GraphRequest.Callback val$requestCallback;
				final JSONObject val$stagedObject;

			
			{
				this$0 = ShareApi.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field ShareApi this$0>
				stagedObject = jsonobject;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field JSONObject val$stagedObject>
				ogType = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field String val$ogType>
				requestCallback = callback;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #31  <Field com.facebook.GraphRequest$Callback val$requestCallback>
				onOpenGraphObjectStagedListener = onmapvaluecompletelistener;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #33  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onOpenGraphObjectStagedListener>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #36  <Method void Object()>
			//   17   31:return          
			}
			}
);
	//   25   55:aload_0         
	//   26   56:new             #30  <Class ShareApi$9>
	//   27   59:dup             
	//   28   60:aload_0         
	//   29   61:aload_1         
	//   30   62:aload           4
	//   31   64:invokespecial   #439 <Method void ShareApi$9(ShareApi, ShareOpenGraphObject, JSONObject)>
	//   32   67:new             #10  <Class ShareApi$11>
	//   33   70:dup             
	//   34   71:aload_0         
	//   35   72:aload           4
	//   36   74:aload_3         
	//   37   75:new             #8   <Class ShareApi$10>
	//   38   78:dup             
	//   39   79:aload_0         
	//   40   80:aload_2         
	//   41   81:invokespecial   #442 <Method void ShareApi$10(ShareApi, com.facebook.internal.CollectionMapper$OnMapValueCompleteListener)>
	//   42   84:aload_2         
	//   43   85:invokespecial   #445 <Method void ShareApi$11(ShareApi, JSONObject, String, com.facebook.GraphRequest$Callback, com.facebook.internal.CollectionMapper$OnMapValueCompleteListener)>
	//   44   88:invokespecial   #404 <Method void stageCollectionValues(com.facebook.internal.CollectionMapper$Collection, com.facebook.internal.CollectionMapper$OnMapperCompleteListener)>
			return;
	//   45   91:return          
		}
	}

	private void stagePhoto(final SharePhoto photo, final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onPhotoStagedListener)
	{
		Object obj = ((Object) (photo.getBitmap()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #348 <Method android.graphics.Bitmap SharePhoto.getBitmap()>
	//    2    4:astore_3        
		android.net.Uri uri = photo.getImageUrl();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #349 <Method android.net.Uri SharePhoto.getImageUrl()>
	//    5    9:astore          4
		if(obj == null && uri == null)
	//*   6   11:aload_3         
	//*   7   12:ifnonnull       40
	//*   8   15:aload           4
	//*   9   17:ifnull          23
	//*  10   20:goto            40
		{
			onPhotoStagedListener.onError(new FacebookException("Photos must have an imageURL or bitmap."));
	//   11   23:aload_2         
	//   12   24:new             #426 <Class FacebookException>
	//   13   27:dup             
	//   14   28:ldc2            #447 <String "Photos must have an imageURL or bitmap.">
	//   15   31:invokespecial   #429 <Method void FacebookException(String)>
	//   16   34:invokeinterface #435 <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(FacebookException)>
			return;
	//   17   39:return          
		}
		photo = ((SharePhoto) (new com.facebook.GraphRequest.Callback() {

			public void onCompleted(GraphResponse graphresponse)
			{
				Object obj1 = ((Object) (graphresponse.getError()));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #39  <Method FacebookRequestError GraphResponse.getError()>
			//    2    4:astore_2        
				if(obj1 != null)
			//*   3    5:aload_2         
			//*   4    6:ifnull          42
				{
					String s1 = ((FacebookRequestError) (obj1)).getErrorMessage();
			//    5    9:aload_2         
			//    6   10:invokevirtual   #45  <Method String FacebookRequestError.getErrorMessage()>
			//    7   13:astore_3        
					obj1 = ((Object) (s1));
			//    8   14:aload_3         
			//    9   15:astore_2        
					if(s1 == null)
			//*  10   16:aload_3         
			//*  11   17:ifnonnull       23
						obj1 = "Error staging photo.";
			//   12   20:ldc1            #47  <String "Error staging photo.">
			//   13   22:astore_2        
					onPhotoStagedListener.onError(((FacebookException) (new FacebookGraphResponseException(graphresponse, ((String) (obj1))))));
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
					onPhotoStagedListener.onError(new FacebookException("Error staging photo."));
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
					onPhotoStagedListener.onError(new FacebookException("Error staging photo."));
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
				obj1 = ((Object) (new JSONObject()));
			//   50  100:new             #71  <Class JSONObject>
			//   51  103:dup             
			//   52  104:invokespecial   #76  <Method void JSONObject()>
			//   53  107:astore_2        
				try
				{
					((JSONObject) (obj1)).put("url", ((Object) (graphresponse)));
			//   54  108:aload_2         
			//   55  109:ldc1            #78  <String "url">
			//   56  111:aload_1         
			//   57  112:invokevirtual   #82  <Method JSONObject JSONObject.put(String, Object)>
			//   58  115:pop             
					((JSONObject) (obj1)).put("user_generated", photo.getUserGenerated());
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
					onPhotoStagedListener.onError(new FacebookException(((String) (graphresponse))));
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
				onPhotoStagedListener.onComplete(obj1);
			}

			final ShareApi this$0;
			final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener val$onPhotoStagedListener;
			final SharePhoto val$photo;

			
			{
				this$0 = ShareApi.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ShareApi this$0>
				onPhotoStagedListener = onmapvaluecompletelistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onPhotoStagedListener>
				photo = sharephoto;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field SharePhoto val$photo>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
));
	//   18   40:new             #12  <Class ShareApi$12>
	//   19   43:dup             
	//   20   44:aload_0         
	//   21   45:aload_2         
	//   22   46:aload_1         
	//   23   47:invokespecial   #450 <Method void ShareApi$12(ShareApi, com.facebook.internal.CollectionMapper$OnMapValueCompleteListener, SharePhoto)>
	//   24   50:astore_1        
		if(obj != null)
	//*  25   51:aload_3         
	//*  26   52:ifnull          68
		{
			ShareInternalUtility.newUploadStagingResourceWithImageRequest(AccessToken.getCurrentAccessToken(), ((android.graphics.Bitmap) (obj)), ((com.facebook.GraphRequest.Callback) (photo))).executeAsync();
	//   27   55:invokestatic    #278 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   28   58:aload_3         
	//   29   59:aload_1         
	//   30   60:invokestatic    #454 <Method GraphRequest ShareInternalUtility.newUploadStagingResourceWithImageRequest(AccessToken, android.graphics.Bitmap, com.facebook.GraphRequest$Callback)>
	//   31   63:invokevirtual   #293 <Method com.facebook.GraphRequestAsyncTask GraphRequest.executeAsync()>
	//   32   66:pop             
			return;
	//   33   67:return          
		}
		try
		{
			ShareInternalUtility.newUploadStagingResourceWithImageRequest(AccessToken.getCurrentAccessToken(), uri, ((com.facebook.GraphRequest.Callback) (photo))).executeAsync();
	//   34   68:invokestatic    #278 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   35   71:aload           4
	//   36   73:aload_1         
	//   37   74:invokestatic    #457 <Method GraphRequest ShareInternalUtility.newUploadStagingResourceWithImageRequest(AccessToken, android.net.Uri, com.facebook.GraphRequest$Callback)>
	//   38   77:invokevirtual   #293 <Method com.facebook.GraphRequestAsyncTask GraphRequest.executeAsync()>
	//   39   80:pop             
			return;
	//   40   81:return          
		}
		// Misplaced declaration of an exception variable
		catch(final SharePhoto photo)
	//*  41   82:astore_1        
		{
			obj = ((Object) (((FileNotFoundException) (photo)).getLocalizedMessage()));
	//   42   83:aload_1         
	//   43   84:invokevirtual   #460 <Method String FileNotFoundException.getLocalizedMessage()>
	//   44   87:astore_3        
		}
		photo = ((SharePhoto) (obj));
	//   45   88:aload_3         
	//   46   89:astore_1        
		if(obj == null)
	//*  47   90:aload_3         
	//*  48   91:ifnonnull       98
			photo = "Error staging photo.";
	//   49   94:ldc2            #462 <String "Error staging photo.">
	//   50   97:astore_1        
		onPhotoStagedListener.onError(new FacebookException(((String) (photo))));
	//   51   98:aload_2         
	//   52   99:new             #426 <Class FacebookException>
	//   53  102:dup             
	//   54  103:aload_1         
	//   55  104:invokespecial   #429 <Method void FacebookException(String)>
	//   56  107:invokeinterface #435 <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(FacebookException)>
	//   57  112:return          
	}

	public boolean canShare()
	{
		if(getShareContent() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #467 <Method ShareContent getShareContent()>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		Object obj = ((Object) (AccessToken.getCurrentAccessToken()));
	//    5    9:invokestatic    #278 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    6   12:astore_1        
		if(obj == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       19
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		obj = ((Object) (((AccessToken) (obj)).getPermissions()));
	//   11   19:aload_1         
	//   12   20:invokevirtual   #471 <Method Set AccessToken.getPermissions()>
	//   13   23:astore_1        
		if(obj == null || !((Set) (obj)).contains("publish_actions"))
	//*  14   24:aload_1         
	//*  15   25:ifnull          40
	//*  16   28:aload_1         
	//*  17   29:ldc2            #473 <String "publish_actions">
	//*  18   32:invokeinterface #478 <Method boolean Set.contains(Object)>
	//*  19   37:ifne            49
			Log.w("ShareApi", "The publish_actions permissions are missing, the share will fail unless this app was authorized to publish in another installation.");
	//   20   40:ldc1            #46  <String "ShareApi">
	//   21   42:ldc2            #480 <String "The publish_actions permissions are missing, the share will fail unless this app was authorized to publish in another installation.">
	//   22   45:invokestatic    #486 <Method int Log.w(String, String)>
	//   23   48:pop             
		return true;
	//   24   49:iconst_1        
	//   25   50:ireturn         
	}

	public String getGraphNode()
	{
		return graphNode;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String graphNode>
	//    2    4:areturn         
	}

	public String getMessage()
	{
		return message;
	//    0    0:aload_0         
	//    1    1:getfield        #488 <Field String message>
	//    2    4:areturn         
	}

	public ShareContent getShareContent()
	{
		return shareContent;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field ShareContent shareContent>
	//    2    4:areturn         
	}

	public void setGraphNode(String s)
	{
		graphNode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field String graphNode>
	//    3    5:return          
	}

	public void setMessage(String s)
	{
		message = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #488 <Field String message>
	//    3    5:return          
	}

	public void share(FacebookCallback facebookcallback)
	{
		if(!canShare())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #492 <Method boolean canShare()>
	//*   2    4:ifne            15
		{
			ShareInternalUtility.invokeCallbackWithError(facebookcallback, "Insufficient permissions for sharing content via Api.");
	//    3    7:aload_1         
	//    4    8:ldc2            #494 <String "Insufficient permissions for sharing content via Api.">
	//    5   11:invokestatic    #498 <Method void ShareInternalUtility.invokeCallbackWithError(FacebookCallback, String)>
			return;
	//    6   14:return          
		}
		ShareContent sharecontent = getShareContent();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #467 <Method ShareContent getShareContent()>
	//    9   19:astore_2        
		try
		{
			ShareContentValidation.validateForApiShare(sharecontent);
	//   10   20:aload_2         
	//   11   21:invokestatic    #503 <Method void ShareContentValidation.validateForApiShare(ShareContent)>
		}
	//*  12   24:aload_2         
	//*  13   25:instanceof      #246 <Class ShareLinkContent>
	//*  14   28:ifeq            41
	//*  15   31:aload_0         
	//*  16   32:aload_2         
	//*  17   33:checkcast       #246 <Class ShareLinkContent>
	//*  18   36:aload_1         
	//*  19   37:invokespecial   #505 <Method void shareLinkContent(ShareLinkContent, FacebookCallback)>
	//*  20   40:return          
	//*  21   41:aload_2         
	//*  22   42:instanceof      #334 <Class SharePhotoContent>
	//*  23   45:ifeq            58
	//*  24   48:aload_0         
	//*  25   49:aload_2         
	//*  26   50:checkcast       #334 <Class SharePhotoContent>
	//*  27   53:aload_1         
	//*  28   54:invokespecial   #507 <Method void sharePhotoContent(SharePhotoContent, FacebookCallback)>
	//*  29   57:return          
	//*  30   58:aload_2         
	//*  31   59:instanceof      #509 <Class ShareVideoContent>
	//*  32   62:ifeq            75
	//*  33   65:aload_0         
	//*  34   66:aload_2         
	//*  35   67:checkcast       #509 <Class ShareVideoContent>
	//*  36   70:aload_1         
	//*  37   71:invokespecial   #511 <Method void shareVideoContent(ShareVideoContent, FacebookCallback)>
	//*  38   74:return          
	//*  39   75:aload_2         
	//*  40   76:instanceof      #299 <Class ShareOpenGraphContent>
	//*  41   79:ifeq            91
	//*  42   82:aload_0         
	//*  43   83:aload_2         
	//*  44   84:checkcast       #299 <Class ShareOpenGraphContent>
	//*  45   87:aload_1         
	//*  46   88:invokespecial   #513 <Method void shareOpenGraphContent(ShareOpenGraphContent, FacebookCallback)>
	//*  47   91:return          
		catch(FacebookException facebookexception)
	//*  48   92:astore_2        
		{
			ShareInternalUtility.invokeCallbackWithException(facebookcallback, ((Exception) (facebookexception)));
	//   49   93:aload_1         
	//   50   94:aload_2         
	//   51   95:invokestatic    #383 <Method void ShareInternalUtility.invokeCallbackWithException(FacebookCallback, Exception)>
			return;
	//   52   98:return          
		}
		if(sharecontent instanceof ShareLinkContent)
		{
			shareLinkContent((ShareLinkContent)sharecontent, facebookcallback);
			return;
		}
		if(sharecontent instanceof SharePhotoContent)
		{
			sharePhotoContent((SharePhotoContent)sharecontent, facebookcallback);
			return;
		}
		if(sharecontent instanceof ShareVideoContent)
		{
			shareVideoContent((ShareVideoContent)sharecontent, facebookcallback);
			return;
		}
		if(sharecontent instanceof ShareOpenGraphContent)
			shareOpenGraphContent((ShareOpenGraphContent)sharecontent, facebookcallback);
	}

	private static final String DEFAULT_CHARSET = "UTF-8";
	private static final String DEFAULT_GRAPH_NODE = "me";
	private static final String GRAPH_PATH_FORMAT = "%s/%s";
	private static final String PHOTOS_EDGE = "photos";
	private static final String TAG = "ShareApi";
	private String graphNode;
	private String message;
	private final ShareContent shareContent;


/*
	static void access$000(Bundle bundle)
	{
		handleImagesOnAction(bundle);
	//    0    0:aload_0         
	//    1    1:invokestatic    #65  <Method void handleImagesOnAction(Bundle)>
		return;
	//    2    4:return          
	}

*/


/*
	static String access$100(ShareApi shareapi, String s)
	{
		return shareapi.getGraphPath(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #71  <Method String getGraphPath(String)>
	//    3    5:areturn         
	}

*/


/*
	static void access$200(ShareApi shareapi, ArrayList arraylist, com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onmapvaluecompletelistener)
	{
		shareapi.stageArrayList(arraylist, onmapvaluecompletelistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #77  <Method void stageArrayList(ArrayList, com.facebook.internal.CollectionMapper$OnMapValueCompleteListener)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$300(ShareApi shareapi, ShareOpenGraphObject shareopengraphobject, com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onmapvaluecompletelistener)
	{
		shareapi.stageOpenGraphObject(shareopengraphobject, onmapvaluecompletelistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #83  <Method void stageOpenGraphObject(ShareOpenGraphObject, com.facebook.internal.CollectionMapper$OnMapValueCompleteListener)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$400(ShareApi shareapi, SharePhoto sharephoto, com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onmapvaluecompletelistener)
	{
		shareapi.stagePhoto(sharephoto, onmapvaluecompletelistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #89  <Method void stagePhoto(SharePhoto, com.facebook.internal.CollectionMapper$OnMapValueCompleteListener)>
		return;
	//    4    6:return          
	}

*/

	// Unreferenced inner class com/facebook/share/ShareApi$10

/* anonymous class */
	class _cls10
		implements com.facebook.GraphRequest.Callback
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
				onOpenGraphObjectStagedListener.onError(((FacebookException) (new FacebookGraphResponseException(graphresponse, ((String) (obj))))));
		//   14   23:aload_0         
		//   15   24:getfield        #21  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onOpenGraphObjectStagedListener>
		//   16   27:new             #43  <Class FacebookGraphResponseException>
		//   17   30:dup             
		//   18   31:aload_1         
		//   19   32:aload_2         
		//   20   33:invokespecial   #46  <Method void FacebookGraphResponseException(GraphResponse, String)>
		//   21   36:invokeinterface #52  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(FacebookException)>
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
				onOpenGraphObjectStagedListener.onError(((FacebookException) (new FacebookGraphResponseException(graphresponse, "Error staging Open Graph object."))));
		//   28   51:aload_0         
		//   29   52:getfield        #21  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onOpenGraphObjectStagedListener>
		//   30   55:new             #43  <Class FacebookGraphResponseException>
		//   31   58:dup             
		//   32   59:aload_1         
		//   33   60:ldc1            #41  <String "Error staging Open Graph object.">
		//   34   62:invokespecial   #46  <Method void FacebookGraphResponseException(GraphResponse, String)>
		//   35   65:invokeinterface #52  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(FacebookException)>
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
				onOpenGraphObjectStagedListener.onError(((FacebookException) (new FacebookGraphResponseException(graphresponse, "Error staging Open Graph object."))));
		//   43   82:aload_0         
		//   44   83:getfield        #21  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onOpenGraphObjectStagedListener>
		//   45   86:new             #43  <Class FacebookGraphResponseException>
		//   46   89:dup             
		//   47   90:aload_1         
		//   48   91:ldc1            #41  <String "Error staging Open Graph object.">
		//   49   93:invokespecial   #46  <Method void FacebookGraphResponseException(GraphResponse, String)>
		//   50   96:invokeinterface #52  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(FacebookException)>
				return;
		//   51  101:return          
			} else
			{
				onOpenGraphObjectStagedListener.onComplete(obj);
		//   52  102:aload_0         
		//   53  103:getfield        #21  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onOpenGraphObjectStagedListener>
		//   54  106:aload_2         
		//   55  107:invokeinterface #68  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onComplete(Object)>
				return;
		//   56  112:return          
			}
		}

		final ShareApi this$0;
		final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener val$onOpenGraphObjectStagedListener;

			
			{
				this$0 = ShareApi.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ShareApi this$0>
				onOpenGraphObjectStagedListener = onmapvaluecompletelistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onOpenGraphObjectStagedListener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
	}

}
