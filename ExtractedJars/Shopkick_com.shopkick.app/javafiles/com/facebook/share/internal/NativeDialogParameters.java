// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import android.util.Pair;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.share.model.*;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			CameraEffectJSONUtility, MessengerShareContentUtility, ShareInternalUtility

public class NativeDialogParameters
{

	public NativeDialogParameters()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static Bundle create(ShareCameraEffectContent sharecameraeffectcontent, Bundle bundle, boolean flag)
	{
		Bundle bundle1 = createBaseParameters(((ShareContent) (sharecameraeffectcontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #17  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_3        
		Utility.putNonEmptyString(bundle1, "effect_id", sharecameraeffectcontent.getEffectId());
	//    4    6:aload_3         
	//    5    7:ldc1            #19  <String "effect_id">
	//    6    9:aload_0         
	//    7   10:invokevirtual   #25  <Method String ShareCameraEffectContent.getEffectId()>
	//    8   13:invokestatic    #31  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		if(bundle != null)
	//*   9   16:aload_1         
	//*  10   17:ifnull          27
			bundle1.putBundle("effect_textures", bundle);
	//   11   20:aload_3         
	//   12   21:ldc1            #33  <String "effect_textures">
	//   13   23:aload_1         
	//   14   24:invokevirtual   #39  <Method void Bundle.putBundle(String, Bundle)>
		try
		{
			sharecameraeffectcontent = ((ShareCameraEffectContent) (CameraEffectJSONUtility.convertToJSON(sharecameraeffectcontent.getArguments())));
	//   15   27:aload_0         
	//   16   28:invokevirtual   #43  <Method com.facebook.share.model.CameraEffectArguments ShareCameraEffectContent.getArguments()>
	//   17   31:invokestatic    #49  <Method JSONObject CameraEffectJSONUtility.convertToJSON(com.facebook.share.model.CameraEffectArguments)>
	//   18   34:astore_0        
		}
	//*  19   35:aload_0         
	//*  20   36:ifnull          49
	//*  21   39:aload_3         
	//*  22   40:ldc1            #51  <String "effect_arguments">
	//*  23   42:aload_0         
	//*  24   43:invokevirtual   #56  <Method String JSONObject.toString()>
	//*  25   46:invokestatic    #31  <Method void Utility.putNonEmptyString(Bundle, String, String)>
	//*  26   49:aload_3         
	//*  27   50:areturn         
		// Misplaced declaration of an exception variable
		catch(ShareCameraEffectContent sharecameraeffectcontent)
	//*  28   51:astore_0        
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   29   52:new             #58  <Class StringBuilder>
	//   30   55:dup             
	//   31   56:invokespecial   #59  <Method void StringBuilder()>
	//   32   59:astore_1        
			((StringBuilder) (bundle)).append("Unable to create a JSON Object from the provided CameraEffectArguments: ");
	//   33   60:aload_1         
	//   34   61:ldc1            #61  <String "Unable to create a JSON Object from the provided CameraEffectArguments: ">
	//   35   63:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   36   66:pop             
			((StringBuilder) (bundle)).append(((JSONException) (sharecameraeffectcontent)).getMessage());
	//   37   67:aload_1         
	//   38   68:aload_0         
	//   39   69:invokevirtual   #68  <Method String JSONException.getMessage()>
	//   40   72:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   41   75:pop             
			throw new FacebookException(((StringBuilder) (bundle)).toString());
	//   42   76:new             #70  <Class FacebookException>
	//   43   79:dup             
	//   44   80:aload_1         
	//   45   81:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   46   84:invokespecial   #74  <Method void FacebookException(String)>
	//   47   87:athrow          
		}
		if(sharecameraeffectcontent == null)
			break MISSING_BLOCK_LABEL_49;
		Utility.putNonEmptyString(bundle1, "effect_arguments", ((JSONObject) (sharecameraeffectcontent)).toString());
		return bundle1;
	}

	private static Bundle create(ShareLinkContent sharelinkcontent, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharelinkcontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #17  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_2        
		Utility.putNonEmptyString(bundle, "TITLE", sharelinkcontent.getContentTitle());
	//    4    6:aload_2         
	//    5    7:ldc1            #77  <String "TITLE">
	//    6    9:aload_0         
	//    7   10:invokevirtual   #82  <Method String ShareLinkContent.getContentTitle()>
	//    8   13:invokestatic    #31  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "DESCRIPTION", sharelinkcontent.getContentDescription());
	//    9   16:aload_2         
	//   10   17:ldc1            #84  <String "DESCRIPTION">
	//   11   19:aload_0         
	//   12   20:invokevirtual   #87  <Method String ShareLinkContent.getContentDescription()>
	//   13   23:invokestatic    #31  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putUri(bundle, "IMAGE", sharelinkcontent.getImageUrl());
	//   14   26:aload_2         
	//   15   27:ldc1            #89  <String "IMAGE">
	//   16   29:aload_0         
	//   17   30:invokevirtual   #93  <Method android.net.Uri ShareLinkContent.getImageUrl()>
	//   18   33:invokestatic    #97  <Method void Utility.putUri(Bundle, String, android.net.Uri)>
		Utility.putNonEmptyString(bundle, "QUOTE", sharelinkcontent.getQuote());
	//   19   36:aload_2         
	//   20   37:ldc1            #99  <String "QUOTE">
	//   21   39:aload_0         
	//   22   40:invokevirtual   #102 <Method String ShareLinkContent.getQuote()>
	//   23   43:invokestatic    #31  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putUri(bundle, "MESSENGER_LINK", sharelinkcontent.getContentUrl());
	//   24   46:aload_2         
	//   25   47:ldc1            #104 <String "MESSENGER_LINK">
	//   26   49:aload_0         
	//   27   50:invokevirtual   #107 <Method android.net.Uri ShareLinkContent.getContentUrl()>
	//   28   53:invokestatic    #97  <Method void Utility.putUri(Bundle, String, android.net.Uri)>
		Utility.putUri(bundle, "TARGET_DISPLAY", sharelinkcontent.getContentUrl());
	//   29   56:aload_2         
	//   30   57:ldc1            #109 <String "TARGET_DISPLAY">
	//   31   59:aload_0         
	//   32   60:invokevirtual   #107 <Method android.net.Uri ShareLinkContent.getContentUrl()>
	//   33   63:invokestatic    #97  <Method void Utility.putUri(Bundle, String, android.net.Uri)>
		return bundle;
	//   34   66:aload_2         
	//   35   67:areturn         
	}

	private static Bundle create(ShareMediaContent sharemediacontent, List list, boolean flag)
	{
		sharemediacontent = ((ShareMediaContent) (createBaseParameters(((ShareContent) (sharemediacontent)), flag)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #17  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_0        
		((Bundle) (sharemediacontent)).putParcelableArrayList("MEDIA", new ArrayList(((java.util.Collection) (list))));
	//    4    6:aload_0         
	//    5    7:ldc1            #112 <String "MEDIA">
	//    6    9:new             #114 <Class ArrayList>
	//    7   12:dup             
	//    8   13:aload_1         
	//    9   14:invokespecial   #117 <Method void ArrayList(java.util.Collection)>
	//   10   17:invokevirtual   #121 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		return ((Bundle) (sharemediacontent));
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	private static Bundle create(ShareMessengerGenericTemplateContent sharemessengergenerictemplatecontent, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharemessengergenerictemplatecontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #17  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_2        
		try
		{
			MessengerShareContentUtility.addGenericTemplateContent(bundle, sharemessengergenerictemplatecontent);
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:invokestatic    #130 <Method void MessengerShareContentUtility.addGenericTemplateContent(Bundle, ShareMessengerGenericTemplateContent)>
		}
	//*   7   11:aload_2         
	//*   8   12:areturn         
		// Misplaced declaration of an exception variable
		catch(ShareMessengerGenericTemplateContent sharemessengergenerictemplatecontent)
	//*   9   13:astore_0        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   14:new             #58  <Class StringBuilder>
	//   11   17:dup             
	//   12   18:invokespecial   #59  <Method void StringBuilder()>
	//   13   21:astore_2        
			stringbuilder.append("Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: ");
	//   14   22:aload_2         
	//   15   23:ldc1            #132 <String "Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: ">
	//   16   25:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   17   28:pop             
			stringbuilder.append(((JSONException) (sharemessengergenerictemplatecontent)).getMessage());
	//   18   29:aload_2         
	//   19   30:aload_0         
	//   20   31:invokevirtual   #68  <Method String JSONException.getMessage()>
	//   21   34:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   22   37:pop             
			throw new FacebookException(stringbuilder.toString());
	//   23   38:new             #70  <Class FacebookException>
	//   24   41:dup             
	//   25   42:aload_2         
	//   26   43:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   27   46:invokespecial   #74  <Method void FacebookException(String)>
	//   28   49:athrow          
		}
		return bundle;
	}

	private static Bundle create(ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharemessengermediatemplatecontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #17  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_2        
		try
		{
			MessengerShareContentUtility.addMediaTemplateContent(bundle, sharemessengermediatemplatecontent);
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:invokestatic    #137 <Method void MessengerShareContentUtility.addMediaTemplateContent(Bundle, ShareMessengerMediaTemplateContent)>
		}
	//*   7   11:aload_2         
	//*   8   12:areturn         
		// Misplaced declaration of an exception variable
		catch(ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent)
	//*   9   13:astore_0        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   14:new             #58  <Class StringBuilder>
	//   11   17:dup             
	//   12   18:invokespecial   #59  <Method void StringBuilder()>
	//   13   21:astore_2        
			stringbuilder.append("Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: ");
	//   14   22:aload_2         
	//   15   23:ldc1            #139 <String "Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: ">
	//   16   25:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   17   28:pop             
			stringbuilder.append(((JSONException) (sharemessengermediatemplatecontent)).getMessage());
	//   18   29:aload_2         
	//   19   30:aload_0         
	//   20   31:invokevirtual   #68  <Method String JSONException.getMessage()>
	//   21   34:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   22   37:pop             
			throw new FacebookException(stringbuilder.toString());
	//   23   38:new             #70  <Class FacebookException>
	//   24   41:dup             
	//   25   42:aload_2         
	//   26   43:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   27   46:invokespecial   #74  <Method void FacebookException(String)>
	//   28   49:athrow          
		}
		return bundle;
	}

	private static Bundle create(ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharemessengeropengraphmusictemplatecontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #17  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_2        
		try
		{
			MessengerShareContentUtility.addOpenGraphMusicTemplateContent(bundle, sharemessengeropengraphmusictemplatecontent);
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:invokestatic    #144 <Method void MessengerShareContentUtility.addOpenGraphMusicTemplateContent(Bundle, ShareMessengerOpenGraphMusicTemplateContent)>
		}
	//*   7   11:aload_2         
	//*   8   12:areturn         
		// Misplaced declaration of an exception variable
		catch(ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent)
	//*   9   13:astore_0        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   14:new             #58  <Class StringBuilder>
	//   11   17:dup             
	//   12   18:invokespecial   #59  <Method void StringBuilder()>
	//   13   21:astore_2        
			stringbuilder.append("Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: ");
	//   14   22:aload_2         
	//   15   23:ldc1            #146 <String "Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: ">
	//   16   25:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   17   28:pop             
			stringbuilder.append(((JSONException) (sharemessengeropengraphmusictemplatecontent)).getMessage());
	//   18   29:aload_2         
	//   19   30:aload_0         
	//   20   31:invokevirtual   #68  <Method String JSONException.getMessage()>
	//   21   34:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   22   37:pop             
			throw new FacebookException(stringbuilder.toString());
	//   23   38:new             #70  <Class FacebookException>
	//   24   41:dup             
	//   25   42:aload_2         
	//   26   43:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   27   46:invokespecial   #74  <Method void FacebookException(String)>
	//   28   49:athrow          
		}
		return bundle;
	}

	private static Bundle create(ShareOpenGraphContent shareopengraphcontent, JSONObject jsonobject, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (shareopengraphcontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #17  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_3        
		Utility.putNonEmptyString(bundle, "PREVIEW_PROPERTY_NAME", (String)ShareInternalUtility.getFieldNameAndNamespaceFromFullName(shareopengraphcontent.getPreviewPropertyName()).second);
	//    4    6:aload_3         
	//    5    7:ldc1            #149 <String "PREVIEW_PROPERTY_NAME">
	//    6    9:aload_0         
	//    7   10:invokevirtual   #154 <Method String ShareOpenGraphContent.getPreviewPropertyName()>
	//    8   13:invokestatic    #160 <Method Pair ShareInternalUtility.getFieldNameAndNamespaceFromFullName(String)>
	//    9   16:getfield        #166 <Field Object Pair.second>
	//   10   19:checkcast       #168 <Class String>
	//   11   22:invokestatic    #31  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "ACTION_TYPE", shareopengraphcontent.getAction().getActionType());
	//   12   25:aload_3         
	//   13   26:ldc1            #170 <String "ACTION_TYPE">
	//   14   28:aload_0         
	//   15   29:invokevirtual   #174 <Method ShareOpenGraphAction ShareOpenGraphContent.getAction()>
	//   16   32:invokevirtual   #179 <Method String ShareOpenGraphAction.getActionType()>
	//   17   35:invokestatic    #31  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "ACTION", jsonobject.toString());
	//   18   38:aload_3         
	//   19   39:ldc1            #181 <String "ACTION">
	//   20   41:aload_1         
	//   21   42:invokevirtual   #56  <Method String JSONObject.toString()>
	//   22   45:invokestatic    #31  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   23   48:aload_3         
	//   24   49:areturn         
	}

	private static Bundle create(SharePhotoContent sharephotocontent, List list, boolean flag)
	{
		sharephotocontent = ((SharePhotoContent) (createBaseParameters(((ShareContent) (sharephotocontent)), flag)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #17  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_0        
		((Bundle) (sharephotocontent)).putStringArrayList("PHOTOS", new ArrayList(((java.util.Collection) (list))));
	//    4    6:aload_0         
	//    5    7:ldc1            #184 <String "PHOTOS">
	//    6    9:new             #114 <Class ArrayList>
	//    7   12:dup             
	//    8   13:aload_1         
	//    9   14:invokespecial   #117 <Method void ArrayList(java.util.Collection)>
	//   10   17:invokevirtual   #187 <Method void Bundle.putStringArrayList(String, ArrayList)>
		return ((Bundle) (sharephotocontent));
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	private static Bundle create(ShareStoryContent sharestorycontent, Bundle bundle, Bundle bundle1, boolean flag)
	{
		Bundle bundle2 = createBaseParameters(((ShareContent) (sharestorycontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokestatic    #17  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore          4
		if(bundle != null)
	//*   4    7:aload_1         
	//*   5    8:ifnull          19
			bundle2.putParcelable("bg_asset", ((android.os.Parcelable) (bundle)));
	//    6   11:aload           4
	//    7   13:ldc1            #192 <String "bg_asset">
	//    8   15:aload_1         
	//    9   16:invokevirtual   #196 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		if(bundle1 != null)
	//*  10   19:aload_2         
	//*  11   20:ifnull          31
			bundle2.putParcelable("interactive_asset_uri", ((android.os.Parcelable) (bundle1)));
	//   12   23:aload           4
	//   13   25:ldc1            #198 <String "interactive_asset_uri">
	//   14   27:aload_2         
	//   15   28:invokevirtual   #196 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		bundle = ((Bundle) (sharestorycontent.getBackgroundColorList()));
	//   16   31:aload_0         
	//   17   32:invokevirtual   #204 <Method List ShareStoryContent.getBackgroundColorList()>
	//   18   35:astore_1        
		if(!Utility.isNullOrEmpty(((java.util.Collection) (bundle))))
	//*  19   36:aload_1         
	//*  20   37:invokestatic    #208 <Method boolean Utility.isNullOrEmpty(java.util.Collection)>
	//*  21   40:ifne            58
			bundle2.putStringArrayList("top_background_color_list", new ArrayList(((java.util.Collection) (bundle))));
	//   22   43:aload           4
	//   23   45:ldc1            #210 <String "top_background_color_list">
	//   24   47:new             #114 <Class ArrayList>
	//   25   50:dup             
	//   26   51:aload_1         
	//   27   52:invokespecial   #117 <Method void ArrayList(java.util.Collection)>
	//   28   55:invokevirtual   #187 <Method void Bundle.putStringArrayList(String, ArrayList)>
		Utility.putNonEmptyString(bundle2, "content_url", sharestorycontent.getAttributionLink());
	//   29   58:aload           4
	//   30   60:ldc1            #212 <String "content_url">
	//   31   62:aload_0         
	//   32   63:invokevirtual   #215 <Method String ShareStoryContent.getAttributionLink()>
	//   33   66:invokestatic    #31  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle2;
	//   34   69:aload           4
	//   35   71:areturn         
	}

	private static Bundle create(ShareVideoContent sharevideocontent, String s, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharevideocontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #17  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_3        
		Utility.putNonEmptyString(bundle, "TITLE", sharevideocontent.getContentTitle());
	//    4    6:aload_3         
	//    5    7:ldc1            #77  <String "TITLE">
	//    6    9:aload_0         
	//    7   10:invokevirtual   #220 <Method String ShareVideoContent.getContentTitle()>
	//    8   13:invokestatic    #31  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "DESCRIPTION", sharevideocontent.getContentDescription());
	//    9   16:aload_3         
	//   10   17:ldc1            #84  <String "DESCRIPTION">
	//   11   19:aload_0         
	//   12   20:invokevirtual   #221 <Method String ShareVideoContent.getContentDescription()>
	//   13   23:invokestatic    #31  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "VIDEO", s);
	//   14   26:aload_3         
	//   15   27:ldc1            #223 <String "VIDEO">
	//   16   29:aload_1         
	//   17   30:invokestatic    #31  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   18   33:aload_3         
	//   19   34:areturn         
	}

	public static Bundle create(UUID uuid, ShareContent sharecontent, boolean flag)
	{
		Validate.notNull(((Object) (sharecontent)), "shareContent");
	//    0    0:aload_1         
	//    1    1:ldc1            #226 <String "shareContent">
	//    2    3:invokestatic    #232 <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (uuid)), "callId");
	//    3    6:aload_0         
	//    4    7:ldc1            #234 <String "callId">
	//    5    9:invokestatic    #232 <Method void Validate.notNull(Object, String)>
		if(sharecontent instanceof ShareLinkContent)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #79  <Class ShareLinkContent>
	//*   8   16:ifeq            28
			return create((ShareLinkContent)sharecontent, flag);
	//    9   19:aload_1         
	//   10   20:checkcast       #79  <Class ShareLinkContent>
	//   11   23:iload_2         
	//   12   24:invokestatic    #236 <Method Bundle create(ShareLinkContent, boolean)>
	//   13   27:areturn         
		if(sharecontent instanceof SharePhotoContent)
	//*  14   28:aload_1         
	//*  15   29:instanceof      #238 <Class SharePhotoContent>
	//*  16   32:ifeq            51
		{
			sharecontent = ((ShareContent) ((SharePhotoContent)sharecontent));
	//   17   35:aload_1         
	//   18   36:checkcast       #238 <Class SharePhotoContent>
	//   19   39:astore_1        
			return create(((SharePhotoContent) (sharecontent)), ShareInternalUtility.getPhotoUrls(((SharePhotoContent) (sharecontent)), uuid), flag);
	//   20   40:aload_1         
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:invokestatic    #242 <Method List ShareInternalUtility.getPhotoUrls(SharePhotoContent, UUID)>
	//   24   46:iload_2         
	//   25   47:invokestatic    #244 <Method Bundle create(SharePhotoContent, List, boolean)>
	//   26   50:areturn         
		}
		if(sharecontent instanceof ShareVideoContent)
	//*  27   51:aload_1         
	//*  28   52:instanceof      #219 <Class ShareVideoContent>
	//*  29   55:ifeq            74
		{
			sharecontent = ((ShareContent) ((ShareVideoContent)sharecontent));
	//   30   58:aload_1         
	//   31   59:checkcast       #219 <Class ShareVideoContent>
	//   32   62:astore_1        
			return create(((ShareVideoContent) (sharecontent)), ShareInternalUtility.getVideoUrl(((ShareVideoContent) (sharecontent)), uuid), flag);
	//   33   63:aload_1         
	//   34   64:aload_1         
	//   35   65:aload_0         
	//   36   66:invokestatic    #248 <Method String ShareInternalUtility.getVideoUrl(ShareVideoContent, UUID)>
	//   37   69:iload_2         
	//   38   70:invokestatic    #250 <Method Bundle create(ShareVideoContent, String, boolean)>
	//   39   73:areturn         
		}
		if(sharecontent instanceof ShareOpenGraphContent)
	//*  40   74:aload_1         
	//*  41   75:instanceof      #151 <Class ShareOpenGraphContent>
	//*  42   78:ifeq            141
		{
			sharecontent = ((ShareContent) ((ShareOpenGraphContent)sharecontent));
	//   43   81:aload_1         
	//   44   82:checkcast       #151 <Class ShareOpenGraphContent>
	//   45   85:astore_1        
			try
			{
				uuid = ((UUID) (create(((ShareOpenGraphContent) (sharecontent)), ShareInternalUtility.removeNamespacesFromOGJsonObject(ShareInternalUtility.toJSONObjectForCall(uuid, ((ShareOpenGraphContent) (sharecontent))), false), flag)));
	//   46   86:aload_1         
	//   47   87:aload_0         
	//   48   88:aload_1         
	//   49   89:invokestatic    #254 <Method JSONObject ShareInternalUtility.toJSONObjectForCall(UUID, ShareOpenGraphContent)>
	//   50   92:iconst_0        
	//   51   93:invokestatic    #258 <Method JSONObject ShareInternalUtility.removeNamespacesFromOGJsonObject(JSONObject, boolean)>
	//   52   96:iload_2         
	//   53   97:invokestatic    #260 <Method Bundle create(ShareOpenGraphContent, JSONObject, boolean)>
	//   54  100:astore_0        
			}
	//*  55  101:aload_0         
	//*  56  102:areturn         
			// Misplaced declaration of an exception variable
			catch(UUID uuid)
	//*  57  103:astore_0        
			{
				sharecontent = ((ShareContent) (new StringBuilder()));
	//   58  104:new             #58  <Class StringBuilder>
	//   59  107:dup             
	//   60  108:invokespecial   #59  <Method void StringBuilder()>
	//   61  111:astore_1        
				((StringBuilder) (sharecontent)).append("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
	//   62  112:aload_1         
	//   63  113:ldc2            #262 <String "Unable to create a JSON Object from the provided ShareOpenGraphContent: ">
	//   64  116:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   65  119:pop             
				((StringBuilder) (sharecontent)).append(((JSONException) (uuid)).getMessage());
	//   66  120:aload_1         
	//   67  121:aload_0         
	//   68  122:invokevirtual   #68  <Method String JSONException.getMessage()>
	//   69  125:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   70  128:pop             
				throw new FacebookException(((StringBuilder) (sharecontent)).toString());
	//   71  129:new             #70  <Class FacebookException>
	//   72  132:dup             
	//   73  133:aload_1         
	//   74  134:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   75  137:invokespecial   #74  <Method void FacebookException(String)>
	//   76  140:athrow          
			}
			return ((Bundle) (uuid));
		}
		if(sharecontent instanceof ShareMediaContent)
	//*  77  141:aload_1         
	//*  78  142:instanceof      #264 <Class ShareMediaContent>
	//*  79  145:ifeq            164
		{
			sharecontent = ((ShareContent) ((ShareMediaContent)sharecontent));
	//   80  148:aload_1         
	//   81  149:checkcast       #264 <Class ShareMediaContent>
	//   82  152:astore_1        
			return create(((ShareMediaContent) (sharecontent)), ShareInternalUtility.getMediaInfos(((ShareMediaContent) (sharecontent)), uuid), flag);
	//   83  153:aload_1         
	//   84  154:aload_1         
	//   85  155:aload_0         
	//   86  156:invokestatic    #268 <Method List ShareInternalUtility.getMediaInfos(ShareMediaContent, UUID)>
	//   87  159:iload_2         
	//   88  160:invokestatic    #270 <Method Bundle create(ShareMediaContent, List, boolean)>
	//   89  163:areturn         
		}
		if(sharecontent instanceof ShareCameraEffectContent)
	//*  90  164:aload_1         
	//*  91  165:instanceof      #21  <Class ShareCameraEffectContent>
	//*  92  168:ifeq            187
		{
			sharecontent = ((ShareContent) ((ShareCameraEffectContent)sharecontent));
	//   93  171:aload_1         
	//   94  172:checkcast       #21  <Class ShareCameraEffectContent>
	//   95  175:astore_1        
			return create(((ShareCameraEffectContent) (sharecontent)), ShareInternalUtility.getTextureUrlBundle(((ShareCameraEffectContent) (sharecontent)), uuid), flag);
	//   96  176:aload_1         
	//   97  177:aload_1         
	//   98  178:aload_0         
	//   99  179:invokestatic    #274 <Method Bundle ShareInternalUtility.getTextureUrlBundle(ShareCameraEffectContent, UUID)>
	//  100  182:iload_2         
	//  101  183:invokestatic    #276 <Method Bundle create(ShareCameraEffectContent, Bundle, boolean)>
	//  102  186:areturn         
		}
		if(sharecontent instanceof ShareMessengerGenericTemplateContent)
	//* 103  187:aload_1         
	//* 104  188:instanceof      #278 <Class ShareMessengerGenericTemplateContent>
	//* 105  191:ifeq            203
			return create((ShareMessengerGenericTemplateContent)sharecontent, flag);
	//  106  194:aload_1         
	//  107  195:checkcast       #278 <Class ShareMessengerGenericTemplateContent>
	//  108  198:iload_2         
	//  109  199:invokestatic    #280 <Method Bundle create(ShareMessengerGenericTemplateContent, boolean)>
	//  110  202:areturn         
		if(sharecontent instanceof ShareMessengerOpenGraphMusicTemplateContent)
	//* 111  203:aload_1         
	//* 112  204:instanceof      #282 <Class ShareMessengerOpenGraphMusicTemplateContent>
	//* 113  207:ifeq            219
			return create((ShareMessengerOpenGraphMusicTemplateContent)sharecontent, flag);
	//  114  210:aload_1         
	//  115  211:checkcast       #282 <Class ShareMessengerOpenGraphMusicTemplateContent>
	//  116  214:iload_2         
	//  117  215:invokestatic    #284 <Method Bundle create(ShareMessengerOpenGraphMusicTemplateContent, boolean)>
	//  118  218:areturn         
		if(sharecontent instanceof ShareMessengerMediaTemplateContent)
	//* 119  219:aload_1         
	//* 120  220:instanceof      #286 <Class ShareMessengerMediaTemplateContent>
	//* 121  223:ifeq            235
			return create((ShareMessengerMediaTemplateContent)sharecontent, flag);
	//  122  226:aload_1         
	//  123  227:checkcast       #286 <Class ShareMessengerMediaTemplateContent>
	//  124  230:iload_2         
	//  125  231:invokestatic    #288 <Method Bundle create(ShareMessengerMediaTemplateContent, boolean)>
	//  126  234:areturn         
		if(sharecontent instanceof ShareStoryContent)
	//* 127  235:aload_1         
	//* 128  236:instanceof      #200 <Class ShareStoryContent>
	//* 129  239:ifeq            263
		{
			sharecontent = ((ShareContent) ((ShareStoryContent)sharecontent));
	//  130  242:aload_1         
	//  131  243:checkcast       #200 <Class ShareStoryContent>
	//  132  246:astore_1        
			return create(((ShareStoryContent) (sharecontent)), ShareInternalUtility.getBackgroundAssetMediaInfo(((ShareStoryContent) (sharecontent)), uuid), ShareInternalUtility.getStickerUrl(((ShareStoryContent) (sharecontent)), uuid), flag);
	//  133  247:aload_1         
	//  134  248:aload_1         
	//  135  249:aload_0         
	//  136  250:invokestatic    #292 <Method Bundle ShareInternalUtility.getBackgroundAssetMediaInfo(ShareStoryContent, UUID)>
	//  137  253:aload_1         
	//  138  254:aload_0         
	//  139  255:invokestatic    #295 <Method Bundle ShareInternalUtility.getStickerUrl(ShareStoryContent, UUID)>
	//  140  258:iload_2         
	//  141  259:invokestatic    #297 <Method Bundle create(ShareStoryContent, Bundle, Bundle, boolean)>
	//  142  262:areturn         
		} else
		{
			return null;
	//  143  263:aconst_null     
	//  144  264:areturn         
		}
	}

	private static Bundle createBaseParameters(ShareContent sharecontent, boolean flag)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #35  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #298 <Method void Bundle()>
	//    3    7:astore_2        
		Utility.putUri(bundle, "LINK", sharecontent.getContentUrl());
	//    4    8:aload_2         
	//    5    9:ldc2            #300 <String "LINK">
	//    6   12:aload_0         
	//    7   13:invokevirtual   #303 <Method android.net.Uri ShareContent.getContentUrl()>
	//    8   16:invokestatic    #97  <Method void Utility.putUri(Bundle, String, android.net.Uri)>
		Utility.putNonEmptyString(bundle, "PLACE", sharecontent.getPlaceId());
	//    9   19:aload_2         
	//   10   20:ldc2            #305 <String "PLACE">
	//   11   23:aload_0         
	//   12   24:invokevirtual   #308 <Method String ShareContent.getPlaceId()>
	//   13   27:invokestatic    #31  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "PAGE", sharecontent.getPageId());
	//   14   30:aload_2         
	//   15   31:ldc2            #310 <String "PAGE">
	//   16   34:aload_0         
	//   17   35:invokevirtual   #313 <Method String ShareContent.getPageId()>
	//   18   38:invokestatic    #31  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "REF", sharecontent.getRef());
	//   19   41:aload_2         
	//   20   42:ldc2            #315 <String "REF">
	//   21   45:aload_0         
	//   22   46:invokevirtual   #318 <Method String ShareContent.getRef()>
	//   23   49:invokestatic    #31  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		bundle.putBoolean("DATA_FAILURES_FATAL", flag);
	//   24   52:aload_2         
	//   25   53:ldc2            #320 <String "DATA_FAILURES_FATAL">
	//   26   56:iload_1         
	//   27   57:invokevirtual   #324 <Method void Bundle.putBoolean(String, boolean)>
		List list = sharecontent.getPeopleIds();
	//   28   60:aload_0         
	//   29   61:invokevirtual   #327 <Method List ShareContent.getPeopleIds()>
	//   30   64:astore_3        
		if(!Utility.isNullOrEmpty(((java.util.Collection) (list))))
	//*  31   65:aload_3         
	//*  32   66:invokestatic    #208 <Method boolean Utility.isNullOrEmpty(java.util.Collection)>
	//*  33   69:ifne            87
			bundle.putStringArrayList("FRIENDS", new ArrayList(((java.util.Collection) (list))));
	//   34   72:aload_2         
	//   35   73:ldc2            #329 <String "FRIENDS">
	//   36   76:new             #114 <Class ArrayList>
	//   37   79:dup             
	//   38   80:aload_3         
	//   39   81:invokespecial   #117 <Method void ArrayList(java.util.Collection)>
	//   40   84:invokevirtual   #187 <Method void Bundle.putStringArrayList(String, ArrayList)>
		sharecontent = ((ShareContent) (sharecontent.getShareHashtag()));
	//   41   87:aload_0         
	//   42   88:invokevirtual   #333 <Method ShareHashtag ShareContent.getShareHashtag()>
	//   43   91:astore_0        
		if(sharecontent != null)
	//*  44   92:aload_0         
	//*  45   93:ifnull          107
			Utility.putNonEmptyString(bundle, "HASHTAG", ((ShareHashtag) (sharecontent)).getHashtag());
	//   46   96:aload_2         
	//   47   97:ldc2            #335 <String "HASHTAG">
	//   48  100:aload_0         
	//   49  101:invokevirtual   #340 <Method String ShareHashtag.getHashtag()>
	//   50  104:invokestatic    #31  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   51  107:aload_2         
	//   52  108:areturn         
	}
}
