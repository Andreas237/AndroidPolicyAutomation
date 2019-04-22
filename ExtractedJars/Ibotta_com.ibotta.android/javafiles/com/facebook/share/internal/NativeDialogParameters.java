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
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			CameraEffectJSONUtility, MessengerShareContentUtility, ShareInternalUtility

public class NativeDialogParameters
{

	private static Bundle create(ShareCameraEffectContent sharecameraeffectcontent, Bundle bundle, boolean flag)
	{
		Bundle bundle1 = createBaseParameters(((ShareContent) (sharecameraeffectcontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #13  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_3        
		Utility.putNonEmptyString(bundle1, "effect_id", sharecameraeffectcontent.getEffectId());
	//    4    6:aload_3         
	//    5    7:ldc1            #15  <String "effect_id">
	//    6    9:aload_0         
	//    7   10:invokevirtual   #21  <Method String ShareCameraEffectContent.getEffectId()>
	//    8   13:invokestatic    #27  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		if(bundle != null)
	//*   9   16:aload_1         
	//*  10   17:ifnull          27
			bundle1.putBundle("effect_textures", bundle);
	//   11   20:aload_3         
	//   12   21:ldc1            #29  <String "effect_textures">
	//   13   23:aload_1         
	//   14   24:invokevirtual   #35  <Method void Bundle.putBundle(String, Bundle)>
		try
		{
			sharecameraeffectcontent = ((ShareCameraEffectContent) (CameraEffectJSONUtility.convertToJSON(sharecameraeffectcontent.getArguments())));
	//   15   27:aload_0         
	//   16   28:invokevirtual   #39  <Method com.facebook.share.model.CameraEffectArguments ShareCameraEffectContent.getArguments()>
	//   17   31:invokestatic    #45  <Method JSONObject CameraEffectJSONUtility.convertToJSON(com.facebook.share.model.CameraEffectArguments)>
	//   18   34:astore_0        
		}
	//*  19   35:aload_0         
	//*  20   36:ifnull          69
	//*  21   39:aload_0         
	//*  22   40:instanceof      #47  <Class JSONObject>
	//*  23   43:ifne            54
	//*  24   46:aload_0         
	//*  25   47:invokevirtual   #50  <Method String JSONObject.toString()>
	//*  26   50:astore_0        
	//*  27   51:goto            62
	//*  28   54:aload_0         
	//*  29   55:checkcast       #47  <Class JSONObject>
	//*  30   58:invokestatic    #55  <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//*  31   61:astore_0        
	//*  32   62:aload_3         
	//*  33   63:ldc1            #57  <String "effect_arguments">
	//*  34   65:aload_0         
	//*  35   66:invokestatic    #27  <Method void Utility.putNonEmptyString(Bundle, String, String)>
	//*  36   69:aload_3         
	//*  37   70:areturn         
		// Misplaced declaration of an exception variable
		catch(ShareCameraEffectContent sharecameraeffectcontent)
	//*  38   71:astore_0        
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   39   72:new             #59  <Class StringBuilder>
	//   40   75:dup             
	//   41   76:invokespecial   #63  <Method void StringBuilder()>
	//   42   79:astore_1        
			((StringBuilder) (bundle)).append("Unable to create a JSON Object from the provided CameraEffectArguments: ");
	//   43   80:aload_1         
	//   44   81:ldc1            #65  <String "Unable to create a JSON Object from the provided CameraEffectArguments: ">
	//   45   83:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   46   86:pop             
			((StringBuilder) (bundle)).append(((JSONException) (sharecameraeffectcontent)).getMessage());
	//   47   87:aload_1         
	//   48   88:aload_0         
	//   49   89:invokevirtual   #72  <Method String JSONException.getMessage()>
	//   50   92:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   51   95:pop             
			throw new FacebookException(((StringBuilder) (bundle)).toString());
	//   52   96:new             #74  <Class FacebookException>
	//   53   99:dup             
	//   54  100:aload_1         
	//   55  101:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   56  104:invokespecial   #78  <Method void FacebookException(String)>
	//   57  107:athrow          
		}
		if(sharecameraeffectcontent == null)
			break MISSING_BLOCK_LABEL_69;
		if(!(sharecameraeffectcontent instanceof JSONObject))
		{
			sharecameraeffectcontent = ((ShareCameraEffectContent) (((JSONObject) (sharecameraeffectcontent)).toString()));
			break MISSING_BLOCK_LABEL_62;
		}
		sharecameraeffectcontent = ((ShareCameraEffectContent) (JSONObjectInstrumentation.toString((JSONObject)sharecameraeffectcontent)));
		Utility.putNonEmptyString(bundle1, "effect_arguments", ((String) (sharecameraeffectcontent)));
		return bundle1;
	}

	private static Bundle create(ShareLinkContent sharelinkcontent, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharelinkcontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #13  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_2        
		Utility.putNonEmptyString(bundle, "TITLE", sharelinkcontent.getContentTitle());
	//    4    6:aload_2         
	//    5    7:ldc1            #82  <String "TITLE">
	//    6    9:aload_0         
	//    7   10:invokevirtual   #87  <Method String ShareLinkContent.getContentTitle()>
	//    8   13:invokestatic    #27  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "DESCRIPTION", sharelinkcontent.getContentDescription());
	//    9   16:aload_2         
	//   10   17:ldc1            #89  <String "DESCRIPTION">
	//   11   19:aload_0         
	//   12   20:invokevirtual   #92  <Method String ShareLinkContent.getContentDescription()>
	//   13   23:invokestatic    #27  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putUri(bundle, "IMAGE", sharelinkcontent.getImageUrl());
	//   14   26:aload_2         
	//   15   27:ldc1            #94  <String "IMAGE">
	//   16   29:aload_0         
	//   17   30:invokevirtual   #98  <Method android.net.Uri ShareLinkContent.getImageUrl()>
	//   18   33:invokestatic    #102 <Method void Utility.putUri(Bundle, String, android.net.Uri)>
		Utility.putNonEmptyString(bundle, "QUOTE", sharelinkcontent.getQuote());
	//   19   36:aload_2         
	//   20   37:ldc1            #104 <String "QUOTE">
	//   21   39:aload_0         
	//   22   40:invokevirtual   #107 <Method String ShareLinkContent.getQuote()>
	//   23   43:invokestatic    #27  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putUri(bundle, "MESSENGER_LINK", sharelinkcontent.getContentUrl());
	//   24   46:aload_2         
	//   25   47:ldc1            #109 <String "MESSENGER_LINK">
	//   26   49:aload_0         
	//   27   50:invokevirtual   #112 <Method android.net.Uri ShareLinkContent.getContentUrl()>
	//   28   53:invokestatic    #102 <Method void Utility.putUri(Bundle, String, android.net.Uri)>
		Utility.putUri(bundle, "TARGET_DISPLAY", sharelinkcontent.getContentUrl());
	//   29   56:aload_2         
	//   30   57:ldc1            #114 <String "TARGET_DISPLAY">
	//   31   59:aload_0         
	//   32   60:invokevirtual   #112 <Method android.net.Uri ShareLinkContent.getContentUrl()>
	//   33   63:invokestatic    #102 <Method void Utility.putUri(Bundle, String, android.net.Uri)>
		return bundle;
	//   34   66:aload_2         
	//   35   67:areturn         
	}

	private static Bundle create(ShareMediaContent sharemediacontent, List list, boolean flag)
	{
		sharemediacontent = ((ShareMediaContent) (createBaseParameters(((ShareContent) (sharemediacontent)), flag)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #13  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_0        
		((Bundle) (sharemediacontent)).putParcelableArrayList("MEDIA", new ArrayList(((java.util.Collection) (list))));
	//    4    6:aload_0         
	//    5    7:ldc1            #117 <String "MEDIA">
	//    6    9:new             #119 <Class ArrayList>
	//    7   12:dup             
	//    8   13:aload_1         
	//    9   14:invokespecial   #122 <Method void ArrayList(java.util.Collection)>
	//   10   17:invokevirtual   #126 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		return ((Bundle) (sharemediacontent));
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	private static Bundle create(ShareMessengerGenericTemplateContent sharemessengergenerictemplatecontent, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharemessengergenerictemplatecontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #13  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_2        
		try
		{
			MessengerShareContentUtility.addGenericTemplateContent(bundle, sharemessengergenerictemplatecontent);
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:invokestatic    #135 <Method void MessengerShareContentUtility.addGenericTemplateContent(Bundle, ShareMessengerGenericTemplateContent)>
		}
	//*   7   11:aload_2         
	//*   8   12:areturn         
		// Misplaced declaration of an exception variable
		catch(ShareMessengerGenericTemplateContent sharemessengergenerictemplatecontent)
	//*   9   13:astore_0        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   14:new             #59  <Class StringBuilder>
	//   11   17:dup             
	//   12   18:invokespecial   #63  <Method void StringBuilder()>
	//   13   21:astore_2        
			stringbuilder.append("Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: ");
	//   14   22:aload_2         
	//   15   23:ldc1            #137 <String "Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: ">
	//   16   25:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   17   28:pop             
			stringbuilder.append(((JSONException) (sharemessengergenerictemplatecontent)).getMessage());
	//   18   29:aload_2         
	//   19   30:aload_0         
	//   20   31:invokevirtual   #72  <Method String JSONException.getMessage()>
	//   21   34:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   22   37:pop             
			throw new FacebookException(stringbuilder.toString());
	//   23   38:new             #74  <Class FacebookException>
	//   24   41:dup             
	//   25   42:aload_2         
	//   26   43:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   27   46:invokespecial   #78  <Method void FacebookException(String)>
	//   28   49:athrow          
		}
		return bundle;
	}

	private static Bundle create(ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharemessengermediatemplatecontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #13  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_2        
		try
		{
			MessengerShareContentUtility.addMediaTemplateContent(bundle, sharemessengermediatemplatecontent);
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:invokestatic    #142 <Method void MessengerShareContentUtility.addMediaTemplateContent(Bundle, ShareMessengerMediaTemplateContent)>
		}
	//*   7   11:aload_2         
	//*   8   12:areturn         
		// Misplaced declaration of an exception variable
		catch(ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent)
	//*   9   13:astore_0        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   14:new             #59  <Class StringBuilder>
	//   11   17:dup             
	//   12   18:invokespecial   #63  <Method void StringBuilder()>
	//   13   21:astore_2        
			stringbuilder.append("Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: ");
	//   14   22:aload_2         
	//   15   23:ldc1            #144 <String "Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: ">
	//   16   25:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   17   28:pop             
			stringbuilder.append(((JSONException) (sharemessengermediatemplatecontent)).getMessage());
	//   18   29:aload_2         
	//   19   30:aload_0         
	//   20   31:invokevirtual   #72  <Method String JSONException.getMessage()>
	//   21   34:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   22   37:pop             
			throw new FacebookException(stringbuilder.toString());
	//   23   38:new             #74  <Class FacebookException>
	//   24   41:dup             
	//   25   42:aload_2         
	//   26   43:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   27   46:invokespecial   #78  <Method void FacebookException(String)>
	//   28   49:athrow          
		}
		return bundle;
	}

	private static Bundle create(ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharemessengeropengraphmusictemplatecontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #13  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_2        
		try
		{
			MessengerShareContentUtility.addOpenGraphMusicTemplateContent(bundle, sharemessengeropengraphmusictemplatecontent);
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:invokestatic    #149 <Method void MessengerShareContentUtility.addOpenGraphMusicTemplateContent(Bundle, ShareMessengerOpenGraphMusicTemplateContent)>
		}
	//*   7   11:aload_2         
	//*   8   12:areturn         
		// Misplaced declaration of an exception variable
		catch(ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent)
	//*   9   13:astore_0        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   14:new             #59  <Class StringBuilder>
	//   11   17:dup             
	//   12   18:invokespecial   #63  <Method void StringBuilder()>
	//   13   21:astore_2        
			stringbuilder.append("Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: ");
	//   14   22:aload_2         
	//   15   23:ldc1            #151 <String "Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: ">
	//   16   25:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   17   28:pop             
			stringbuilder.append(((JSONException) (sharemessengeropengraphmusictemplatecontent)).getMessage());
	//   18   29:aload_2         
	//   19   30:aload_0         
	//   20   31:invokevirtual   #72  <Method String JSONException.getMessage()>
	//   21   34:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   22   37:pop             
			throw new FacebookException(stringbuilder.toString());
	//   23   38:new             #74  <Class FacebookException>
	//   24   41:dup             
	//   25   42:aload_2         
	//   26   43:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   27   46:invokespecial   #78  <Method void FacebookException(String)>
	//   28   49:athrow          
		}
		return bundle;
	}

	private static Bundle create(ShareOpenGraphContent shareopengraphcontent, JSONObject jsonobject, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (shareopengraphcontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #13  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_3        
		Utility.putNonEmptyString(bundle, "PREVIEW_PROPERTY_NAME", (String)ShareInternalUtility.getFieldNameAndNamespaceFromFullName(shareopengraphcontent.getPreviewPropertyName()).second);
	//    4    6:aload_3         
	//    5    7:ldc1            #154 <String "PREVIEW_PROPERTY_NAME">
	//    6    9:aload_0         
	//    7   10:invokevirtual   #159 <Method String ShareOpenGraphContent.getPreviewPropertyName()>
	//    8   13:invokestatic    #165 <Method Pair ShareInternalUtility.getFieldNameAndNamespaceFromFullName(String)>
	//    9   16:getfield        #171 <Field Object Pair.second>
	//   10   19:checkcast       #173 <Class String>
	//   11   22:invokestatic    #27  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "ACTION_TYPE", shareopengraphcontent.getAction().getActionType());
	//   12   25:aload_3         
	//   13   26:ldc1            #175 <String "ACTION_TYPE">
	//   14   28:aload_0         
	//   15   29:invokevirtual   #179 <Method ShareOpenGraphAction ShareOpenGraphContent.getAction()>
	//   16   32:invokevirtual   #184 <Method String ShareOpenGraphAction.getActionType()>
	//   17   35:invokestatic    #27  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		if(!(jsonobject instanceof JSONObject))
	//*  18   38:aload_1         
	//*  19   39:instanceof      #47  <Class JSONObject>
	//*  20   42:ifne            53
			shareopengraphcontent = ((ShareOpenGraphContent) (jsonobject.toString()));
	//   21   45:aload_1         
	//   22   46:invokevirtual   #50  <Method String JSONObject.toString()>
	//   23   49:astore_0        
		else
	//*  24   50:goto            61
			shareopengraphcontent = ((ShareOpenGraphContent) (JSONObjectInstrumentation.toString((JSONObject)jsonobject)));
	//   25   53:aload_1         
	//   26   54:checkcast       #47  <Class JSONObject>
	//   27   57:invokestatic    #55  <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   28   60:astore_0        
		Utility.putNonEmptyString(bundle, "ACTION", ((String) (shareopengraphcontent)));
	//   29   61:aload_3         
	//   30   62:ldc1            #186 <String "ACTION">
	//   31   64:aload_0         
	//   32   65:invokestatic    #27  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   33   68:aload_3         
	//   34   69:areturn         
	}

	private static Bundle create(SharePhotoContent sharephotocontent, List list, boolean flag)
	{
		sharephotocontent = ((SharePhotoContent) (createBaseParameters(((ShareContent) (sharephotocontent)), flag)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #13  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_0        
		((Bundle) (sharephotocontent)).putStringArrayList("PHOTOS", new ArrayList(((java.util.Collection) (list))));
	//    4    6:aload_0         
	//    5    7:ldc1            #189 <String "PHOTOS">
	//    6    9:new             #119 <Class ArrayList>
	//    7   12:dup             
	//    8   13:aload_1         
	//    9   14:invokespecial   #122 <Method void ArrayList(java.util.Collection)>
	//   10   17:invokevirtual   #192 <Method void Bundle.putStringArrayList(String, ArrayList)>
		return ((Bundle) (sharephotocontent));
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	private static Bundle create(ShareVideoContent sharevideocontent, String s, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharevideocontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #13  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_3        
		Utility.putNonEmptyString(bundle, "TITLE", sharevideocontent.getContentTitle());
	//    4    6:aload_3         
	//    5    7:ldc1            #82  <String "TITLE">
	//    6    9:aload_0         
	//    7   10:invokevirtual   #197 <Method String ShareVideoContent.getContentTitle()>
	//    8   13:invokestatic    #27  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "DESCRIPTION", sharevideocontent.getContentDescription());
	//    9   16:aload_3         
	//   10   17:ldc1            #89  <String "DESCRIPTION">
	//   11   19:aload_0         
	//   12   20:invokevirtual   #198 <Method String ShareVideoContent.getContentDescription()>
	//   13   23:invokestatic    #27  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "VIDEO", s);
	//   14   26:aload_3         
	//   15   27:ldc1            #200 <String "VIDEO">
	//   16   29:aload_1         
	//   17   30:invokestatic    #27  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   18   33:aload_3         
	//   19   34:areturn         
	}

	public static Bundle create(UUID uuid, ShareContent sharecontent, boolean flag)
	{
		Validate.notNull(((Object) (sharecontent)), "shareContent");
	//    0    0:aload_1         
	//    1    1:ldc1            #203 <String "shareContent">
	//    2    3:invokestatic    #209 <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (uuid)), "callId");
	//    3    6:aload_0         
	//    4    7:ldc1            #211 <String "callId">
	//    5    9:invokestatic    #209 <Method void Validate.notNull(Object, String)>
		if(sharecontent instanceof ShareLinkContent)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #84  <Class ShareLinkContent>
	//*   8   16:ifeq            28
			return create((ShareLinkContent)sharecontent, flag);
	//    9   19:aload_1         
	//   10   20:checkcast       #84  <Class ShareLinkContent>
	//   11   23:iload_2         
	//   12   24:invokestatic    #213 <Method Bundle create(ShareLinkContent, boolean)>
	//   13   27:areturn         
		if(sharecontent instanceof SharePhotoContent)
	//*  14   28:aload_1         
	//*  15   29:instanceof      #215 <Class SharePhotoContent>
	//*  16   32:ifeq            51
		{
			sharecontent = ((ShareContent) ((SharePhotoContent)sharecontent));
	//   17   35:aload_1         
	//   18   36:checkcast       #215 <Class SharePhotoContent>
	//   19   39:astore_1        
			return create(((SharePhotoContent) (sharecontent)), ShareInternalUtility.getPhotoUrls(((SharePhotoContent) (sharecontent)), uuid), flag);
	//   20   40:aload_1         
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:invokestatic    #219 <Method List ShareInternalUtility.getPhotoUrls(SharePhotoContent, UUID)>
	//   24   46:iload_2         
	//   25   47:invokestatic    #221 <Method Bundle create(SharePhotoContent, List, boolean)>
	//   26   50:areturn         
		}
		if(sharecontent instanceof ShareVideoContent)
	//*  27   51:aload_1         
	//*  28   52:instanceof      #196 <Class ShareVideoContent>
	//*  29   55:ifeq            74
		{
			sharecontent = ((ShareContent) ((ShareVideoContent)sharecontent));
	//   30   58:aload_1         
	//   31   59:checkcast       #196 <Class ShareVideoContent>
	//   32   62:astore_1        
			return create(((ShareVideoContent) (sharecontent)), ShareInternalUtility.getVideoUrl(((ShareVideoContent) (sharecontent)), uuid), flag);
	//   33   63:aload_1         
	//   34   64:aload_1         
	//   35   65:aload_0         
	//   36   66:invokestatic    #225 <Method String ShareInternalUtility.getVideoUrl(ShareVideoContent, UUID)>
	//   37   69:iload_2         
	//   38   70:invokestatic    #227 <Method Bundle create(ShareVideoContent, String, boolean)>
	//   39   73:areturn         
		}
		if(sharecontent instanceof ShareOpenGraphContent)
	//*  40   74:aload_1         
	//*  41   75:instanceof      #156 <Class ShareOpenGraphContent>
	//*  42   78:ifeq            140
		{
			sharecontent = ((ShareContent) ((ShareOpenGraphContent)sharecontent));
	//   43   81:aload_1         
	//   44   82:checkcast       #156 <Class ShareOpenGraphContent>
	//   45   85:astore_1        
			try
			{
				uuid = ((UUID) (create(((ShareOpenGraphContent) (sharecontent)), ShareInternalUtility.removeNamespacesFromOGJsonObject(ShareInternalUtility.toJSONObjectForCall(uuid, ((ShareOpenGraphContent) (sharecontent))), false), flag)));
	//   46   86:aload_1         
	//   47   87:aload_0         
	//   48   88:aload_1         
	//   49   89:invokestatic    #231 <Method JSONObject ShareInternalUtility.toJSONObjectForCall(UUID, ShareOpenGraphContent)>
	//   50   92:iconst_0        
	//   51   93:invokestatic    #235 <Method JSONObject ShareInternalUtility.removeNamespacesFromOGJsonObject(JSONObject, boolean)>
	//   52   96:iload_2         
	//   53   97:invokestatic    #237 <Method Bundle create(ShareOpenGraphContent, JSONObject, boolean)>
	//   54  100:astore_0        
			}
	//*  55  101:aload_0         
	//*  56  102:areturn         
			// Misplaced declaration of an exception variable
			catch(UUID uuid)
	//*  57  103:astore_0        
			{
				sharecontent = ((ShareContent) (new StringBuilder()));
	//   58  104:new             #59  <Class StringBuilder>
	//   59  107:dup             
	//   60  108:invokespecial   #63  <Method void StringBuilder()>
	//   61  111:astore_1        
				((StringBuilder) (sharecontent)).append("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
	//   62  112:aload_1         
	//   63  113:ldc1            #239 <String "Unable to create a JSON Object from the provided ShareOpenGraphContent: ">
	//   64  115:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   65  118:pop             
				((StringBuilder) (sharecontent)).append(((JSONException) (uuid)).getMessage());
	//   66  119:aload_1         
	//   67  120:aload_0         
	//   68  121:invokevirtual   #72  <Method String JSONException.getMessage()>
	//   69  124:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   70  127:pop             
				throw new FacebookException(((StringBuilder) (sharecontent)).toString());
	//   71  128:new             #74  <Class FacebookException>
	//   72  131:dup             
	//   73  132:aload_1         
	//   74  133:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   75  136:invokespecial   #78  <Method void FacebookException(String)>
	//   76  139:athrow          
			}
			return ((Bundle) (uuid));
		}
		if(sharecontent instanceof ShareMediaContent)
	//*  77  140:aload_1         
	//*  78  141:instanceof      #241 <Class ShareMediaContent>
	//*  79  144:ifeq            163
		{
			sharecontent = ((ShareContent) ((ShareMediaContent)sharecontent));
	//   80  147:aload_1         
	//   81  148:checkcast       #241 <Class ShareMediaContent>
	//   82  151:astore_1        
			return create(((ShareMediaContent) (sharecontent)), ShareInternalUtility.getMediaInfos(((ShareMediaContent) (sharecontent)), uuid), flag);
	//   83  152:aload_1         
	//   84  153:aload_1         
	//   85  154:aload_0         
	//   86  155:invokestatic    #245 <Method List ShareInternalUtility.getMediaInfos(ShareMediaContent, UUID)>
	//   87  158:iload_2         
	//   88  159:invokestatic    #247 <Method Bundle create(ShareMediaContent, List, boolean)>
	//   89  162:areturn         
		}
		if(sharecontent instanceof ShareCameraEffectContent)
	//*  90  163:aload_1         
	//*  91  164:instanceof      #17  <Class ShareCameraEffectContent>
	//*  92  167:ifeq            186
		{
			sharecontent = ((ShareContent) ((ShareCameraEffectContent)sharecontent));
	//   93  170:aload_1         
	//   94  171:checkcast       #17  <Class ShareCameraEffectContent>
	//   95  174:astore_1        
			return create(((ShareCameraEffectContent) (sharecontent)), ShareInternalUtility.getTextureUrlBundle(((ShareCameraEffectContent) (sharecontent)), uuid), flag);
	//   96  175:aload_1         
	//   97  176:aload_1         
	//   98  177:aload_0         
	//   99  178:invokestatic    #251 <Method Bundle ShareInternalUtility.getTextureUrlBundle(ShareCameraEffectContent, UUID)>
	//  100  181:iload_2         
	//  101  182:invokestatic    #253 <Method Bundle create(ShareCameraEffectContent, Bundle, boolean)>
	//  102  185:areturn         
		}
		if(sharecontent instanceof ShareMessengerGenericTemplateContent)
	//* 103  186:aload_1         
	//* 104  187:instanceof      #255 <Class ShareMessengerGenericTemplateContent>
	//* 105  190:ifeq            202
			return create((ShareMessengerGenericTemplateContent)sharecontent, flag);
	//  106  193:aload_1         
	//  107  194:checkcast       #255 <Class ShareMessengerGenericTemplateContent>
	//  108  197:iload_2         
	//  109  198:invokestatic    #257 <Method Bundle create(ShareMessengerGenericTemplateContent, boolean)>
	//  110  201:areturn         
		if(sharecontent instanceof ShareMessengerOpenGraphMusicTemplateContent)
	//* 111  202:aload_1         
	//* 112  203:instanceof      #259 <Class ShareMessengerOpenGraphMusicTemplateContent>
	//* 113  206:ifeq            218
			return create((ShareMessengerOpenGraphMusicTemplateContent)sharecontent, flag);
	//  114  209:aload_1         
	//  115  210:checkcast       #259 <Class ShareMessengerOpenGraphMusicTemplateContent>
	//  116  213:iload_2         
	//  117  214:invokestatic    #261 <Method Bundle create(ShareMessengerOpenGraphMusicTemplateContent, boolean)>
	//  118  217:areturn         
		if(sharecontent instanceof ShareMessengerMediaTemplateContent)
	//* 119  218:aload_1         
	//* 120  219:instanceof      #263 <Class ShareMessengerMediaTemplateContent>
	//* 121  222:ifeq            234
			return create((ShareMessengerMediaTemplateContent)sharecontent, flag);
	//  122  225:aload_1         
	//  123  226:checkcast       #263 <Class ShareMessengerMediaTemplateContent>
	//  124  229:iload_2         
	//  125  230:invokestatic    #265 <Method Bundle create(ShareMessengerMediaTemplateContent, boolean)>
	//  126  233:areturn         
		else
			return null;
	//  127  234:aconst_null     
	//  128  235:areturn         
	}

	private static Bundle createBaseParameters(ShareContent sharecontent, boolean flag)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #31  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #266 <Method void Bundle()>
	//    3    7:astore_2        
		Utility.putUri(bundle, "LINK", sharecontent.getContentUrl());
	//    4    8:aload_2         
	//    5    9:ldc2            #268 <String "LINK">
	//    6   12:aload_0         
	//    7   13:invokevirtual   #271 <Method android.net.Uri ShareContent.getContentUrl()>
	//    8   16:invokestatic    #102 <Method void Utility.putUri(Bundle, String, android.net.Uri)>
		Utility.putNonEmptyString(bundle, "PLACE", sharecontent.getPlaceId());
	//    9   19:aload_2         
	//   10   20:ldc2            #273 <String "PLACE">
	//   11   23:aload_0         
	//   12   24:invokevirtual   #276 <Method String ShareContent.getPlaceId()>
	//   13   27:invokestatic    #27  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "PAGE", sharecontent.getPageId());
	//   14   30:aload_2         
	//   15   31:ldc2            #278 <String "PAGE">
	//   16   34:aload_0         
	//   17   35:invokevirtual   #281 <Method String ShareContent.getPageId()>
	//   18   38:invokestatic    #27  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "REF", sharecontent.getRef());
	//   19   41:aload_2         
	//   20   42:ldc2            #283 <String "REF">
	//   21   45:aload_0         
	//   22   46:invokevirtual   #286 <Method String ShareContent.getRef()>
	//   23   49:invokestatic    #27  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		bundle.putBoolean("DATA_FAILURES_FATAL", flag);
	//   24   52:aload_2         
	//   25   53:ldc2            #288 <String "DATA_FAILURES_FATAL">
	//   26   56:iload_1         
	//   27   57:invokevirtual   #292 <Method void Bundle.putBoolean(String, boolean)>
		List list = sharecontent.getPeopleIds();
	//   28   60:aload_0         
	//   29   61:invokevirtual   #296 <Method List ShareContent.getPeopleIds()>
	//   30   64:astore_3        
		if(!Utility.isNullOrEmpty(((java.util.Collection) (list))))
	//*  31   65:aload_3         
	//*  32   66:invokestatic    #300 <Method boolean Utility.isNullOrEmpty(java.util.Collection)>
	//*  33   69:ifne            87
			bundle.putStringArrayList("FRIENDS", new ArrayList(((java.util.Collection) (list))));
	//   34   72:aload_2         
	//   35   73:ldc2            #302 <String "FRIENDS">
	//   36   76:new             #119 <Class ArrayList>
	//   37   79:dup             
	//   38   80:aload_3         
	//   39   81:invokespecial   #122 <Method void ArrayList(java.util.Collection)>
	//   40   84:invokevirtual   #192 <Method void Bundle.putStringArrayList(String, ArrayList)>
		sharecontent = ((ShareContent) (sharecontent.getShareHashtag()));
	//   41   87:aload_0         
	//   42   88:invokevirtual   #306 <Method ShareHashtag ShareContent.getShareHashtag()>
	//   43   91:astore_0        
		if(sharecontent != null)
	//*  44   92:aload_0         
	//*  45   93:ifnull          107
			Utility.putNonEmptyString(bundle, "HASHTAG", ((ShareHashtag) (sharecontent)).getHashtag());
	//   46   96:aload_2         
	//   47   97:ldc2            #308 <String "HASHTAG">
	//   48  100:aload_0         
	//   49  101:invokevirtual   #313 <Method String ShareHashtag.getHashtag()>
	//   50  104:invokestatic    #27  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   51  107:aload_2         
	//   52  108:areturn         
	}
}
