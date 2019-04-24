// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.share.model.*;
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
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Bundle create(AppGroupCreationContent appgroupcreationcontent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #13  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void Bundle()>
	//    3    7:astore_1        
		Utility.putNonEmptyString(bundle, "name", appgroupcreationcontent.getName());
	//    4    8:aload_1         
	//    5    9:ldc1            #16  <String "name">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #22  <Method String AppGroupCreationContent.getName()>
	//    8   15:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "description", appgroupcreationcontent.getDescription());
	//    9   18:aload_1         
	//   10   19:ldc1            #30  <String "description">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #33  <Method String AppGroupCreationContent.getDescription()>
	//   13   25:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		appgroupcreationcontent = ((AppGroupCreationContent) (appgroupcreationcontent.getAppGroupPrivacy()));
	//   14   28:aload_0         
	//   15   29:invokevirtual   #37  <Method com.facebook.share.model.AppGroupCreationContent$AppGroupPrivacy AppGroupCreationContent.getAppGroupPrivacy()>
	//   16   32:astore_0        
		if(appgroupcreationcontent != null)
	//*  17   33:aload_0         
	//*  18   34:ifnull          53
			Utility.putNonEmptyString(bundle, "privacy", ((com.facebook.share.model.AppGroupCreationContent.AppGroupPrivacy) (appgroupcreationcontent)).toString().toLowerCase(Locale.ENGLISH));
	//   19   37:aload_1         
	//   20   38:ldc1            #39  <String "privacy">
	//   21   40:aload_0         
	//   22   41:invokevirtual   #44  <Method String com.facebook.share.model.AppGroupCreationContent$AppGroupPrivacy.toString()>
	//   23   44:getstatic       #50  <Field Locale Locale.ENGLISH>
	//   24   47:invokevirtual   #56  <Method String String.toLowerCase(Locale)>
	//   25   50:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   26   53:aload_1         
	//   27   54:areturn         
	}

	public static Bundle create(GameRequestContent gamerequestcontent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #13  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void Bundle()>
	//    3    7:astore_1        
		Utility.putNonEmptyString(bundle, "message", gamerequestcontent.getMessage());
	//    4    8:aload_1         
	//    5    9:ldc1            #59  <String "message">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #64  <Method String GameRequestContent.getMessage()>
	//    8   15:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "to", gamerequestcontent.getTo());
	//    9   18:aload_1         
	//   10   19:ldc1            #66  <String "to">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #69  <Method String GameRequestContent.getTo()>
	//   13   25:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "title", gamerequestcontent.getTitle());
	//   14   28:aload_1         
	//   15   29:ldc1            #71  <String "title">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #74  <Method String GameRequestContent.getTitle()>
	//   18   35:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "data", gamerequestcontent.getData());
	//   19   38:aload_1         
	//   20   39:ldc1            #76  <String "data">
	//   21   41:aload_0         
	//   22   42:invokevirtual   #79  <Method String GameRequestContent.getData()>
	//   23   45:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		if(gamerequestcontent.getActionType() != null)
	//*  24   48:aload_0         
	//*  25   49:invokevirtual   #83  <Method com.facebook.share.model.GameRequestContent$ActionType GameRequestContent.getActionType()>
	//*  26   52:ifnull          74
			Utility.putNonEmptyString(bundle, "action_type", gamerequestcontent.getActionType().toString().toLowerCase(Locale.ENGLISH));
	//   27   55:aload_1         
	//   28   56:ldc1            #85  <String "action_type">
	//   29   58:aload_0         
	//   30   59:invokevirtual   #83  <Method com.facebook.share.model.GameRequestContent$ActionType GameRequestContent.getActionType()>
	//   31   62:invokevirtual   #88  <Method String com.facebook.share.model.GameRequestContent$ActionType.toString()>
	//   32   65:getstatic       #50  <Field Locale Locale.ENGLISH>
	//   33   68:invokevirtual   #56  <Method String String.toLowerCase(Locale)>
	//   34   71:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "object_id", gamerequestcontent.getObjectId());
	//   35   74:aload_1         
	//   36   75:ldc1            #90  <String "object_id">
	//   37   77:aload_0         
	//   38   78:invokevirtual   #93  <Method String GameRequestContent.getObjectId()>
	//   39   81:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		if(gamerequestcontent.getFilters() != null)
	//*  40   84:aload_0         
	//*  41   85:invokevirtual   #97  <Method com.facebook.share.model.GameRequestContent$Filters GameRequestContent.getFilters()>
	//*  42   88:ifnull          110
			Utility.putNonEmptyString(bundle, "filters", gamerequestcontent.getFilters().toString().toLowerCase(Locale.ENGLISH));
	//   43   91:aload_1         
	//   44   92:ldc1            #99  <String "filters">
	//   45   94:aload_0         
	//   46   95:invokevirtual   #97  <Method com.facebook.share.model.GameRequestContent$Filters GameRequestContent.getFilters()>
	//   47   98:invokevirtual   #102 <Method String com.facebook.share.model.GameRequestContent$Filters.toString()>
	//   48  101:getstatic       #50  <Field Locale Locale.ENGLISH>
	//   49  104:invokevirtual   #56  <Method String String.toLowerCase(Locale)>
	//   50  107:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putCommaSeparatedStringList(bundle, "suggestions", gamerequestcontent.getSuggestions());
	//   51  110:aload_1         
	//   52  111:ldc1            #104 <String "suggestions">
	//   53  113:aload_0         
	//   54  114:invokevirtual   #108 <Method java.util.ArrayList GameRequestContent.getSuggestions()>
	//   55  117:invokestatic    #112 <Method void Utility.putCommaSeparatedStringList(Bundle, String, java.util.ArrayList)>
		return bundle;
	//   56  120:aload_1         
	//   57  121:areturn         
	}

	public static Bundle create(ShareLinkContent sharelinkcontent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #13  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void Bundle()>
	//    3    7:astore_1        
		Utility.putUri(bundle, "href", sharelinkcontent.getContentUrl());
	//    4    8:aload_1         
	//    5    9:ldc1            #115 <String "href">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #121 <Method android.net.Uri ShareLinkContent.getContentUrl()>
	//    8   15:invokestatic    #125 <Method void Utility.putUri(Bundle, String, android.net.Uri)>
		return bundle;
	//    9   18:aload_1         
	//   10   19:areturn         
	}

	public static Bundle create(ShareOpenGraphContent shareopengraphcontent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #13  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void Bundle()>
	//    3    7:astore_1        
		Utility.putNonEmptyString(bundle, "action_type", shareopengraphcontent.getAction().getActionType());
	//    4    8:aload_1         
	//    5    9:ldc1            #85  <String "action_type">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #134 <Method ShareOpenGraphAction ShareOpenGraphContent.getAction()>
	//    8   15:invokevirtual   #138 <Method String ShareOpenGraphAction.getActionType()>
	//    9   18:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		try
		{
			shareopengraphcontent = ((ShareOpenGraphContent) (ShareInternalUtility.removeNamespacesFromOGJsonObject(ShareInternalUtility.toJSONObjectForWeb(shareopengraphcontent), false)));
	//   10   21:aload_0         
	//   11   22:invokestatic    #144 <Method JSONObject ShareInternalUtility.toJSONObjectForWeb(ShareOpenGraphContent)>
	//   12   25:iconst_0        
	//   13   26:invokestatic    #148 <Method JSONObject ShareInternalUtility.removeNamespacesFromOGJsonObject(JSONObject, boolean)>
	//   14   29:astore_0        
		}
	//*  15   30:aload_0         
	//*  16   31:ifnull          44
	//*  17   34:aload_1         
	//*  18   35:ldc1            #150 <String "action_properties">
	//*  19   37:aload_0         
	//*  20   38:invokevirtual   #153 <Method String JSONObject.toString()>
	//*  21   41:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
	//*  22   44:aload_1         
	//*  23   45:areturn         
		// Misplaced declaration of an exception variable
		catch(ShareOpenGraphContent shareopengraphcontent)
	//*  24   46:astore_0        
		{
			throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", ((Throwable) (shareopengraphcontent)));
	//   25   47:new             #155 <Class FacebookException>
	//   26   50:dup             
	//   27   51:ldc1            #157 <String "Unable to serialize the ShareOpenGraphContent to JSON">
	//   28   53:aload_0         
	//   29   54:invokespecial   #160 <Method void FacebookException(String, Throwable)>
	//   30   57:athrow          
		}
		if(shareopengraphcontent == null)
			break MISSING_BLOCK_LABEL_44;
		Utility.putNonEmptyString(bundle, "action_properties", ((JSONObject) (shareopengraphcontent)).toString());
		return bundle;
	}

	public static Bundle createForFeed(ShareFeedContent sharefeedcontent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #13  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void Bundle()>
	//    3    7:astore_1        
		Utility.putNonEmptyString(bundle, "to", sharefeedcontent.getToId());
	//    4    8:aload_1         
	//    5    9:ldc1            #66  <String "to">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #167 <Method String ShareFeedContent.getToId()>
	//    8   15:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "link", sharefeedcontent.getLink());
	//    9   18:aload_1         
	//   10   19:ldc1            #169 <String "link">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #172 <Method String ShareFeedContent.getLink()>
	//   13   25:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "picture", sharefeedcontent.getPicture());
	//   14   28:aload_1         
	//   15   29:ldc1            #174 <String "picture">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #177 <Method String ShareFeedContent.getPicture()>
	//   18   35:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "source", sharefeedcontent.getMediaSource());
	//   19   38:aload_1         
	//   20   39:ldc1            #179 <String "source">
	//   21   41:aload_0         
	//   22   42:invokevirtual   #182 <Method String ShareFeedContent.getMediaSource()>
	//   23   45:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "name", sharefeedcontent.getLinkName());
	//   24   48:aload_1         
	//   25   49:ldc1            #16  <String "name">
	//   26   51:aload_0         
	//   27   52:invokevirtual   #185 <Method String ShareFeedContent.getLinkName()>
	//   28   55:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "caption", sharefeedcontent.getLinkCaption());
	//   29   58:aload_1         
	//   30   59:ldc1            #187 <String "caption">
	//   31   61:aload_0         
	//   32   62:invokevirtual   #190 <Method String ShareFeedContent.getLinkCaption()>
	//   33   65:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "description", sharefeedcontent.getLinkDescription());
	//   34   68:aload_1         
	//   35   69:ldc1            #30  <String "description">
	//   36   71:aload_0         
	//   37   72:invokevirtual   #193 <Method String ShareFeedContent.getLinkDescription()>
	//   38   75:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   39   78:aload_1         
	//   40   79:areturn         
	}

	public static Bundle createForFeed(ShareLinkContent sharelinkcontent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #13  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void Bundle()>
	//    3    7:astore_1        
		Utility.putNonEmptyString(bundle, "name", sharelinkcontent.getContentTitle());
	//    4    8:aload_1         
	//    5    9:ldc1            #16  <String "name">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #196 <Method String ShareLinkContent.getContentTitle()>
	//    8   15:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "description", sharelinkcontent.getContentDescription());
	//    9   18:aload_1         
	//   10   19:ldc1            #30  <String "description">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #199 <Method String ShareLinkContent.getContentDescription()>
	//   13   25:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "link", Utility.getUriString(sharelinkcontent.getContentUrl()));
	//   14   28:aload_1         
	//   15   29:ldc1            #169 <String "link">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #121 <Method android.net.Uri ShareLinkContent.getContentUrl()>
	//   18   35:invokestatic    #203 <Method String Utility.getUriString(android.net.Uri)>
	//   19   38:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "picture", Utility.getUriString(sharelinkcontent.getImageUrl()));
	//   20   41:aload_1         
	//   21   42:ldc1            #174 <String "picture">
	//   22   44:aload_0         
	//   23   45:invokevirtual   #206 <Method android.net.Uri ShareLinkContent.getImageUrl()>
	//   24   48:invokestatic    #203 <Method String Utility.getUriString(android.net.Uri)>
	//   25   51:invokestatic    #28  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   26   54:aload_1         
	//   27   55:areturn         
	}
}
