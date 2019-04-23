// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.share.model.*;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			ShareInternalUtility, ShareFeedContent

public class WebDialogParameters
{

	public WebDialogParameters()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static Bundle create(AppGroupCreationContent appgroupcreationcontent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #15  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void Bundle()>
	//    3    7:astore_1        
		Utility.putNonEmptyString(bundle, "name", appgroupcreationcontent.getName());
	//    4    8:aload_1         
	//    5    9:ldc1            #18  <String "name">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #24  <Method String AppGroupCreationContent.getName()>
	//    8   15:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "description", appgroupcreationcontent.getDescription());
	//    9   18:aload_1         
	//   10   19:ldc1            #32  <String "description">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #35  <Method String AppGroupCreationContent.getDescription()>
	//   13   25:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		appgroupcreationcontent = ((AppGroupCreationContent) (appgroupcreationcontent.getAppGroupPrivacy()));
	//   14   28:aload_0         
	//   15   29:invokevirtual   #39  <Method com.facebook.share.model.AppGroupCreationContent$AppGroupPrivacy AppGroupCreationContent.getAppGroupPrivacy()>
	//   16   32:astore_0        
		if(appgroupcreationcontent != null)
	//*  17   33:aload_0         
	//*  18   34:ifnull          53
			Utility.putNonEmptyString(bundle, "privacy", ((com.facebook.share.model.AppGroupCreationContent.AppGroupPrivacy) (appgroupcreationcontent)).toString().toLowerCase(Locale.ENGLISH));
	//   19   37:aload_1         
	//   20   38:ldc1            #41  <String "privacy">
	//   21   40:aload_0         
	//   22   41:invokevirtual   #46  <Method String com.facebook.share.model.AppGroupCreationContent$AppGroupPrivacy.toString()>
	//   23   44:getstatic       #52  <Field Locale Locale.ENGLISH>
	//   24   47:invokevirtual   #58  <Method String String.toLowerCase(Locale)>
	//   25   50:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   26   53:aload_1         
	//   27   54:areturn         
	}

	public static Bundle create(GameRequestContent gamerequestcontent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #15  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void Bundle()>
	//    3    7:astore_1        
		Utility.putNonEmptyString(bundle, "message", gamerequestcontent.getMessage());
	//    4    8:aload_1         
	//    5    9:ldc1            #61  <String "message">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #66  <Method String GameRequestContent.getMessage()>
	//    8   15:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putCommaSeparatedStringList(bundle, "to", gamerequestcontent.getRecipients());
	//    9   18:aload_1         
	//   10   19:ldc1            #68  <String "to">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #72  <Method List GameRequestContent.getRecipients()>
	//   13   25:invokestatic    #76  <Method void Utility.putCommaSeparatedStringList(Bundle, String, List)>
		Utility.putNonEmptyString(bundle, "title", gamerequestcontent.getTitle());
	//   14   28:aload_1         
	//   15   29:ldc1            #78  <String "title">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #81  <Method String GameRequestContent.getTitle()>
	//   18   35:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "data", gamerequestcontent.getData());
	//   19   38:aload_1         
	//   20   39:ldc1            #83  <String "data">
	//   21   41:aload_0         
	//   22   42:invokevirtual   #86  <Method String GameRequestContent.getData()>
	//   23   45:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		if(gamerequestcontent.getActionType() != null)
	//*  24   48:aload_0         
	//*  25   49:invokevirtual   #90  <Method com.facebook.share.model.GameRequestContent$ActionType GameRequestContent.getActionType()>
	//*  26   52:ifnull          74
			Utility.putNonEmptyString(bundle, "action_type", gamerequestcontent.getActionType().toString().toLowerCase(Locale.ENGLISH));
	//   27   55:aload_1         
	//   28   56:ldc1            #92  <String "action_type">
	//   29   58:aload_0         
	//   30   59:invokevirtual   #90  <Method com.facebook.share.model.GameRequestContent$ActionType GameRequestContent.getActionType()>
	//   31   62:invokevirtual   #95  <Method String com.facebook.share.model.GameRequestContent$ActionType.toString()>
	//   32   65:getstatic       #52  <Field Locale Locale.ENGLISH>
	//   33   68:invokevirtual   #58  <Method String String.toLowerCase(Locale)>
	//   34   71:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "object_id", gamerequestcontent.getObjectId());
	//   35   74:aload_1         
	//   36   75:ldc1            #97  <String "object_id">
	//   37   77:aload_0         
	//   38   78:invokevirtual   #100 <Method String GameRequestContent.getObjectId()>
	//   39   81:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		if(gamerequestcontent.getFilters() != null)
	//*  40   84:aload_0         
	//*  41   85:invokevirtual   #104 <Method com.facebook.share.model.GameRequestContent$Filters GameRequestContent.getFilters()>
	//*  42   88:ifnull          110
			Utility.putNonEmptyString(bundle, "filters", gamerequestcontent.getFilters().toString().toLowerCase(Locale.ENGLISH));
	//   43   91:aload_1         
	//   44   92:ldc1            #106 <String "filters">
	//   45   94:aload_0         
	//   46   95:invokevirtual   #104 <Method com.facebook.share.model.GameRequestContent$Filters GameRequestContent.getFilters()>
	//   47   98:invokevirtual   #109 <Method String com.facebook.share.model.GameRequestContent$Filters.toString()>
	//   48  101:getstatic       #52  <Field Locale Locale.ENGLISH>
	//   49  104:invokevirtual   #58  <Method String String.toLowerCase(Locale)>
	//   50  107:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putCommaSeparatedStringList(bundle, "suggestions", gamerequestcontent.getSuggestions());
	//   51  110:aload_1         
	//   52  111:ldc1            #111 <String "suggestions">
	//   53  113:aload_0         
	//   54  114:invokevirtual   #114 <Method List GameRequestContent.getSuggestions()>
	//   55  117:invokestatic    #76  <Method void Utility.putCommaSeparatedStringList(Bundle, String, List)>
		return bundle;
	//   56  120:aload_1         
	//   57  121:areturn         
	}

	public static Bundle create(ShareLinkContent sharelinkcontent)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharelinkcontent)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #119 <Method Bundle createBaseParameters(ShareContent)>
	//    2    4:astore_1        
		Utility.putUri(bundle, "href", sharelinkcontent.getContentUrl());
	//    3    5:aload_1         
	//    4    6:ldc1            #121 <String "href">
	//    5    8:aload_0         
	//    6    9:invokevirtual   #127 <Method Uri ShareLinkContent.getContentUrl()>
	//    7   12:invokestatic    #131 <Method void Utility.putUri(Bundle, String, Uri)>
		Utility.putNonEmptyString(bundle, "quote", sharelinkcontent.getQuote());
	//    8   15:aload_1         
	//    9   16:ldc1            #133 <String "quote">
	//   10   18:aload_0         
	//   11   19:invokevirtual   #136 <Method String ShareLinkContent.getQuote()>
	//   12   22:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   13   25:aload_1         
	//   14   26:areturn         
	}

	public static Bundle create(ShareOpenGraphContent shareopengraphcontent)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (shareopengraphcontent)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #119 <Method Bundle createBaseParameters(ShareContent)>
	//    2    4:astore_1        
		Utility.putNonEmptyString(bundle, "action_type", shareopengraphcontent.getAction().getActionType());
	//    3    5:aload_1         
	//    4    6:ldc1            #92  <String "action_type">
	//    5    8:aload_0         
	//    6    9:invokevirtual   #145 <Method ShareOpenGraphAction ShareOpenGraphContent.getAction()>
	//    7   12:invokevirtual   #149 <Method String ShareOpenGraphAction.getActionType()>
	//    8   15:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		try
		{
			shareopengraphcontent = ((ShareOpenGraphContent) (ShareInternalUtility.removeNamespacesFromOGJsonObject(ShareInternalUtility.toJSONObjectForWeb(shareopengraphcontent), false)));
	//    9   18:aload_0         
	//   10   19:invokestatic    #155 <Method JSONObject ShareInternalUtility.toJSONObjectForWeb(ShareOpenGraphContent)>
	//   11   22:iconst_0        
	//   12   23:invokestatic    #159 <Method JSONObject ShareInternalUtility.removeNamespacesFromOGJsonObject(JSONObject, boolean)>
	//   13   26:astore_0        
		}
	//*  14   27:aload_0         
	//*  15   28:ifnull          41
	//*  16   31:aload_1         
	//*  17   32:ldc1            #161 <String "action_properties">
	//*  18   34:aload_0         
	//*  19   35:invokevirtual   #164 <Method String JSONObject.toString()>
	//*  20   38:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
	//*  21   41:aload_1         
	//*  22   42:areturn         
		// Misplaced declaration of an exception variable
		catch(ShareOpenGraphContent shareopengraphcontent)
	//*  23   43:astore_0        
		{
			throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", ((Throwable) (shareopengraphcontent)));
	//   24   44:new             #166 <Class FacebookException>
	//   25   47:dup             
	//   26   48:ldc1            #168 <String "Unable to serialize the ShareOpenGraphContent to JSON">
	//   27   50:aload_0         
	//   28   51:invokespecial   #171 <Method void FacebookException(String, Throwable)>
	//   29   54:athrow          
		}
		if(shareopengraphcontent == null)
			break MISSING_BLOCK_LABEL_41;
		Utility.putNonEmptyString(bundle, "action_properties", ((JSONObject) (shareopengraphcontent)).toString());
		return bundle;
	}

	public static Bundle create(SharePhotoContent sharephotocontent)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharephotocontent)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #119 <Method Bundle createBaseParameters(ShareContent)>
	//    2    4:astore_1        
		String as[] = new String[sharephotocontent.getPhotos().size()];
	//    3    5:aload_0         
	//    4    6:invokevirtual   #177 <Method List SharePhotoContent.getPhotos()>
	//    5    9:invokeinterface #183 <Method int List.size()>
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
	//    9   19:invokevirtual   #177 <Method List SharePhotoContent.getPhotos()>
	//   10   22:new             #6   <Class WebDialogParameters$1>
	//   11   25:dup             
	//   12   26:invokespecial   #184 <Method void WebDialogParameters$1()>
	//   13   29:invokestatic    #188 <Method List Utility.map(List, com.facebook.internal.Utility$Mapper)>
	//   14   32:aload_2         
	//   15   33:invokeinterface #192 <Method Object[] List.toArray(Object[])>
	//   16   38:pop             
		bundle.putStringArray("media", as);
	//   17   39:aload_1         
	//   18   40:ldc1            #194 <String "media">
	//   19   42:aload_2         
	//   20   43:invokevirtual   #198 <Method void Bundle.putStringArray(String, String[])>
		return bundle;
	//   21   46:aload_1         
	//   22   47:areturn         
	}

	public static Bundle createBaseParameters(ShareContent sharecontent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #15  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void Bundle()>
	//    3    7:astore_1        
		sharecontent = ((ShareContent) (sharecontent.getShareHashtag()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #204 <Method ShareHashtag ShareContent.getShareHashtag()>
	//    6   12:astore_0        
		if(sharecontent != null)
	//*   7   13:aload_0         
	//*   8   14:ifnull          27
			Utility.putNonEmptyString(bundle, "hashtag", ((ShareHashtag) (sharecontent)).getHashtag());
	//    9   17:aload_1         
	//   10   18:ldc1            #206 <String "hashtag">
	//   11   20:aload_0         
	//   12   21:invokevirtual   #211 <Method String ShareHashtag.getHashtag()>
	//   13   24:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   14   27:aload_1         
	//   15   28:areturn         
	}

	public static Bundle createForFeed(ShareFeedContent sharefeedcontent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #15  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void Bundle()>
	//    3    7:astore_1        
		Utility.putNonEmptyString(bundle, "to", sharefeedcontent.getToId());
	//    4    8:aload_1         
	//    5    9:ldc1            #68  <String "to">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #218 <Method String ShareFeedContent.getToId()>
	//    8   15:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "link", sharefeedcontent.getLink());
	//    9   18:aload_1         
	//   10   19:ldc1            #220 <String "link">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #223 <Method String ShareFeedContent.getLink()>
	//   13   25:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "picture", sharefeedcontent.getPicture());
	//   14   28:aload_1         
	//   15   29:ldc1            #225 <String "picture">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #228 <Method String ShareFeedContent.getPicture()>
	//   18   35:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "source", sharefeedcontent.getMediaSource());
	//   19   38:aload_1         
	//   20   39:ldc1            #230 <String "source">
	//   21   41:aload_0         
	//   22   42:invokevirtual   #233 <Method String ShareFeedContent.getMediaSource()>
	//   23   45:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "name", sharefeedcontent.getLinkName());
	//   24   48:aload_1         
	//   25   49:ldc1            #18  <String "name">
	//   26   51:aload_0         
	//   27   52:invokevirtual   #236 <Method String ShareFeedContent.getLinkName()>
	//   28   55:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "caption", sharefeedcontent.getLinkCaption());
	//   29   58:aload_1         
	//   30   59:ldc1            #238 <String "caption">
	//   31   61:aload_0         
	//   32   62:invokevirtual   #241 <Method String ShareFeedContent.getLinkCaption()>
	//   33   65:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "description", sharefeedcontent.getLinkDescription());
	//   34   68:aload_1         
	//   35   69:ldc1            #32  <String "description">
	//   36   71:aload_0         
	//   37   72:invokevirtual   #244 <Method String ShareFeedContent.getLinkDescription()>
	//   38   75:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   39   78:aload_1         
	//   40   79:areturn         
	}

	public static Bundle createForFeed(ShareLinkContent sharelinkcontent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #15  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void Bundle()>
	//    3    7:astore_1        
		Utility.putNonEmptyString(bundle, "name", sharelinkcontent.getContentTitle());
	//    4    8:aload_1         
	//    5    9:ldc1            #18  <String "name">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #247 <Method String ShareLinkContent.getContentTitle()>
	//    8   15:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "description", sharelinkcontent.getContentDescription());
	//    9   18:aload_1         
	//   10   19:ldc1            #32  <String "description">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #250 <Method String ShareLinkContent.getContentDescription()>
	//   13   25:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "link", Utility.getUriString(sharelinkcontent.getContentUrl()));
	//   14   28:aload_1         
	//   15   29:ldc1            #220 <String "link">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #127 <Method Uri ShareLinkContent.getContentUrl()>
	//   18   35:invokestatic    #254 <Method String Utility.getUriString(Uri)>
	//   19   38:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "picture", Utility.getUriString(sharelinkcontent.getImageUrl()));
	//   20   41:aload_1         
	//   21   42:ldc1            #225 <String "picture">
	//   22   44:aload_0         
	//   23   45:invokevirtual   #257 <Method Uri ShareLinkContent.getImageUrl()>
	//   24   48:invokestatic    #254 <Method String Utility.getUriString(Uri)>
	//   25   51:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "quote", sharelinkcontent.getQuote());
	//   26   54:aload_1         
	//   27   55:ldc1            #133 <String "quote">
	//   28   57:aload_0         
	//   29   58:invokevirtual   #136 <Method String ShareLinkContent.getQuote()>
	//   30   61:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		if(sharelinkcontent.getShareHashtag() != null)
	//*  31   64:aload_0         
	//*  32   65:invokevirtual   #258 <Method ShareHashtag ShareLinkContent.getShareHashtag()>
	//*  33   68:ifnull          84
			Utility.putNonEmptyString(bundle, "hashtag", sharelinkcontent.getShareHashtag().getHashtag());
	//   34   71:aload_1         
	//   35   72:ldc1            #206 <String "hashtag">
	//   36   74:aload_0         
	//   37   75:invokevirtual   #258 <Method ShareHashtag ShareLinkContent.getShareHashtag()>
	//   38   78:invokevirtual   #211 <Method String ShareHashtag.getHashtag()>
	//   39   81:invokestatic    #30  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   40   84:aload_1         
	//   41   85:areturn         
	}
}
