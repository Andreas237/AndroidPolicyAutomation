// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.share.model.*;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			ShareInternalUtility, ShareFeedContent

public class WebDialogParameters
{

	public static Bundle create(ShareLinkContent sharelinkcontent)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharelinkcontent)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #13  <Method Bundle createBaseParameters(ShareContent)>
	//    2    4:astore_1        
		Utility.putUri(bundle, "href", sharelinkcontent.getContentUrl());
	//    3    5:aload_1         
	//    4    6:ldc1            #15  <String "href">
	//    5    8:aload_0         
	//    6    9:invokevirtual   #21  <Method Uri ShareLinkContent.getContentUrl()>
	//    7   12:invokestatic    #27  <Method void Utility.putUri(Bundle, String, Uri)>
		Utility.putNonEmptyString(bundle, "quote", sharelinkcontent.getQuote());
	//    8   15:aload_1         
	//    9   16:ldc1            #29  <String "quote">
	//   10   18:aload_0         
	//   11   19:invokevirtual   #33  <Method String ShareLinkContent.getQuote()>
	//   12   22:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   13   25:aload_1         
	//   14   26:areturn         
	}

	public static Bundle create(ShareOpenGraphContent shareopengraphcontent)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (shareopengraphcontent)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #13  <Method Bundle createBaseParameters(ShareContent)>
	//    2    4:astore_1        
		Utility.putNonEmptyString(bundle, "action_type", shareopengraphcontent.getAction().getActionType());
	//    3    5:aload_1         
	//    4    6:ldc1            #43  <String "action_type">
	//    5    8:aload_0         
	//    6    9:invokevirtual   #49  <Method ShareOpenGraphAction ShareOpenGraphContent.getAction()>
	//    7   12:invokevirtual   #54  <Method String ShareOpenGraphAction.getActionType()>
	//    8   15:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		try
		{
			shareopengraphcontent = ((ShareOpenGraphContent) (ShareInternalUtility.removeNamespacesFromOGJsonObject(ShareInternalUtility.toJSONObjectForWeb(shareopengraphcontent), false)));
	//    9   18:aload_0         
	//   10   19:invokestatic    #60  <Method JSONObject ShareInternalUtility.toJSONObjectForWeb(ShareOpenGraphContent)>
	//   11   22:iconst_0        
	//   12   23:invokestatic    #64  <Method JSONObject ShareInternalUtility.removeNamespacesFromOGJsonObject(JSONObject, boolean)>
	//   13   26:astore_0        
		}
	//*  14   27:aload_0         
	//*  15   28:ifnull          61
	//*  16   31:aload_0         
	//*  17   32:instanceof      #66  <Class JSONObject>
	//*  18   35:ifne            46
	//*  19   38:aload_0         
	//*  20   39:invokevirtual   #69  <Method String JSONObject.toString()>
	//*  21   42:astore_0        
	//*  22   43:goto            54
	//*  23   46:aload_0         
	//*  24   47:checkcast       #66  <Class JSONObject>
	//*  25   50:invokestatic    #74  <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//*  26   53:astore_0        
	//*  27   54:aload_1         
	//*  28   55:ldc1            #76  <String "action_properties">
	//*  29   57:aload_0         
	//*  30   58:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
	//*  31   61:aload_1         
	//*  32   62:areturn         
		// Misplaced declaration of an exception variable
		catch(ShareOpenGraphContent shareopengraphcontent)
	//*  33   63:astore_0        
		{
			throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", ((Throwable) (shareopengraphcontent)));
	//   34   64:new             #78  <Class FacebookException>
	//   35   67:dup             
	//   36   68:ldc1            #80  <String "Unable to serialize the ShareOpenGraphContent to JSON">
	//   37   70:aload_0         
	//   38   71:invokespecial   #84  <Method void FacebookException(String, Throwable)>
	//   39   74:athrow          
		}
		if(shareopengraphcontent == null)
			break MISSING_BLOCK_LABEL_61;
		if(!(shareopengraphcontent instanceof JSONObject))
		{
			shareopengraphcontent = ((ShareOpenGraphContent) (((JSONObject) (shareopengraphcontent)).toString()));
			break MISSING_BLOCK_LABEL_54;
		}
		shareopengraphcontent = ((ShareOpenGraphContent) (JSONObjectInstrumentation.toString((JSONObject)shareopengraphcontent)));
		Utility.putNonEmptyString(bundle, "action_properties", ((String) (shareopengraphcontent)));
		return bundle;
	}

	public static Bundle create(SharePhotoContent sharephotocontent)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharephotocontent)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #13  <Method Bundle createBaseParameters(ShareContent)>
	//    2    4:astore_1        
		String as[] = new String[sharephotocontent.getPhotos().size()];
	//    3    5:aload_0         
	//    4    6:invokevirtual   #91  <Method List SharePhotoContent.getPhotos()>
	//    5    9:invokeinterface #97  <Method int List.size()>
	//    6   14:anewarray       String[]
	//    7   17:astore_2        
		Utility.map(sharephotocontent.getPhotos(), new com.facebook.internal.Utility.Mapper() {

			public volatile Object apply(Object obj)
			{
				return ((Object) (apply((SharePhoto)obj)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #21  <Class SharePhoto>
			//    3    5:invokevirtual   #24  <Method String apply(SharePhoto)>
			//    4    8:areturn         
			}

			public String apply(SharePhoto sharephoto)
			{
				return sharephoto.getImageUrl().toString();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #28  <Method Uri SharePhoto.getImageUrl()>
			//    2    4:invokevirtual   #34  <Method String Uri.toString()>
			//    3    7:areturn         
			}

		}
).toArray(((Object []) (as)));
	//    8   18:aload_0         
	//    9   19:invokevirtual   #91  <Method List SharePhotoContent.getPhotos()>
	//   10   22:new             #6   <Class WebDialogParameters$1>
	//   11   25:dup             
	//   12   26:invokespecial   #102 <Method void WebDialogParameters$1()>
	//   13   29:invokestatic    #106 <Method List Utility.map(List, com.facebook.internal.Utility$Mapper)>
	//   14   32:aload_2         
	//   15   33:invokeinterface #110 <Method Object[] List.toArray(Object[])>
	//   16   38:pop             
		bundle.putStringArray("media", as);
	//   17   39:aload_1         
	//   18   40:ldc1            #112 <String "media">
	//   19   42:aload_2         
	//   20   43:invokevirtual   #118 <Method void Bundle.putStringArray(String, String[])>
		return bundle;
	//   21   46:aload_1         
	//   22   47:areturn         
	}

	public static Bundle createBaseParameters(ShareContent sharecontent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #114 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #119 <Method void Bundle()>
	//    3    7:astore_1        
		sharecontent = ((ShareContent) (sharecontent.getShareHashtag()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #125 <Method ShareHashtag ShareContent.getShareHashtag()>
	//    6   12:astore_0        
		if(sharecontent != null)
	//*   7   13:aload_0         
	//*   8   14:ifnull          27
			Utility.putNonEmptyString(bundle, "hashtag", ((ShareHashtag) (sharecontent)).getHashtag());
	//    9   17:aload_1         
	//   10   18:ldc1            #127 <String "hashtag">
	//   11   20:aload_0         
	//   12   21:invokevirtual   #132 <Method String ShareHashtag.getHashtag()>
	//   13   24:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   14   27:aload_1         
	//   15   28:areturn         
	}

	public static Bundle createForFeed(ShareFeedContent sharefeedcontent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #114 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #119 <Method void Bundle()>
	//    3    7:astore_1        
		Utility.putNonEmptyString(bundle, "to", sharefeedcontent.getToId());
	//    4    8:aload_1         
	//    5    9:ldc1            #136 <String "to">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #141 <Method String ShareFeedContent.getToId()>
	//    8   15:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "link", sharefeedcontent.getLink());
	//    9   18:aload_1         
	//   10   19:ldc1            #143 <String "link">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #146 <Method String ShareFeedContent.getLink()>
	//   13   25:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "picture", sharefeedcontent.getPicture());
	//   14   28:aload_1         
	//   15   29:ldc1            #148 <String "picture">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #151 <Method String ShareFeedContent.getPicture()>
	//   18   35:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "source", sharefeedcontent.getMediaSource());
	//   19   38:aload_1         
	//   20   39:ldc1            #153 <String "source">
	//   21   41:aload_0         
	//   22   42:invokevirtual   #156 <Method String ShareFeedContent.getMediaSource()>
	//   23   45:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "name", sharefeedcontent.getLinkName());
	//   24   48:aload_1         
	//   25   49:ldc1            #158 <String "name">
	//   26   51:aload_0         
	//   27   52:invokevirtual   #161 <Method String ShareFeedContent.getLinkName()>
	//   28   55:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "caption", sharefeedcontent.getLinkCaption());
	//   29   58:aload_1         
	//   30   59:ldc1            #163 <String "caption">
	//   31   61:aload_0         
	//   32   62:invokevirtual   #166 <Method String ShareFeedContent.getLinkCaption()>
	//   33   65:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "description", sharefeedcontent.getLinkDescription());
	//   34   68:aload_1         
	//   35   69:ldc1            #168 <String "description">
	//   36   71:aload_0         
	//   37   72:invokevirtual   #171 <Method String ShareFeedContent.getLinkDescription()>
	//   38   75:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   39   78:aload_1         
	//   40   79:areturn         
	}

	public static Bundle createForFeed(ShareLinkContent sharelinkcontent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #114 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #119 <Method void Bundle()>
	//    3    7:astore_1        
		Utility.putNonEmptyString(bundle, "name", sharelinkcontent.getContentTitle());
	//    4    8:aload_1         
	//    5    9:ldc1            #158 <String "name">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #174 <Method String ShareLinkContent.getContentTitle()>
	//    8   15:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "description", sharelinkcontent.getContentDescription());
	//    9   18:aload_1         
	//   10   19:ldc1            #168 <String "description">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #177 <Method String ShareLinkContent.getContentDescription()>
	//   13   25:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "link", Utility.getUriString(sharelinkcontent.getContentUrl()));
	//   14   28:aload_1         
	//   15   29:ldc1            #143 <String "link">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #21  <Method Uri ShareLinkContent.getContentUrl()>
	//   18   35:invokestatic    #181 <Method String Utility.getUriString(Uri)>
	//   19   38:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "picture", Utility.getUriString(sharelinkcontent.getImageUrl()));
	//   20   41:aload_1         
	//   21   42:ldc1            #148 <String "picture">
	//   22   44:aload_0         
	//   23   45:invokevirtual   #184 <Method Uri ShareLinkContent.getImageUrl()>
	//   24   48:invokestatic    #181 <Method String Utility.getUriString(Uri)>
	//   25   51:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "quote", sharelinkcontent.getQuote());
	//   26   54:aload_1         
	//   27   55:ldc1            #29  <String "quote">
	//   28   57:aload_0         
	//   29   58:invokevirtual   #33  <Method String ShareLinkContent.getQuote()>
	//   30   61:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		if(sharelinkcontent.getShareHashtag() != null)
	//*  31   64:aload_0         
	//*  32   65:invokevirtual   #185 <Method ShareHashtag ShareLinkContent.getShareHashtag()>
	//*  33   68:ifnull          84
			Utility.putNonEmptyString(bundle, "hashtag", sharelinkcontent.getShareHashtag().getHashtag());
	//   34   71:aload_1         
	//   35   72:ldc1            #127 <String "hashtag">
	//   36   74:aload_0         
	//   37   75:invokevirtual   #185 <Method ShareHashtag ShareLinkContent.getShareHashtag()>
	//   38   78:invokevirtual   #132 <Method String ShareHashtag.getHashtag()>
	//   39   81:invokestatic    #37  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   40   84:aload_1         
	//   41   85:areturn         
	}
}
