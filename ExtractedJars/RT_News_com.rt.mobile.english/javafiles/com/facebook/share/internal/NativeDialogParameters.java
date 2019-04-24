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
//			ShareInternalUtility

public class NativeDialogParameters
{

	public NativeDialogParameters()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static Bundle create(ShareLinkContent sharelinkcontent, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharelinkcontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #15  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_2        
		Utility.putNonEmptyString(bundle, "TITLE", sharelinkcontent.getContentTitle());
	//    4    6:aload_2         
	//    5    7:ldc1            #17  <String "TITLE">
	//    6    9:aload_0         
	//    7   10:invokevirtual   #23  <Method String ShareLinkContent.getContentTitle()>
	//    8   13:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "DESCRIPTION", sharelinkcontent.getContentDescription());
	//    9   16:aload_2         
	//   10   17:ldc1            #31  <String "DESCRIPTION">
	//   11   19:aload_0         
	//   12   20:invokevirtual   #34  <Method String ShareLinkContent.getContentDescription()>
	//   13   23:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putUri(bundle, "IMAGE", sharelinkcontent.getImageUrl());
	//   14   26:aload_2         
	//   15   27:ldc1            #36  <String "IMAGE">
	//   16   29:aload_0         
	//   17   30:invokevirtual   #40  <Method android.net.Uri ShareLinkContent.getImageUrl()>
	//   18   33:invokestatic    #44  <Method void Utility.putUri(Bundle, String, android.net.Uri)>
		return bundle;
	//   19   36:aload_2         
	//   20   37:areturn         
	}

	private static Bundle create(ShareOpenGraphContent shareopengraphcontent, JSONObject jsonobject, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (shareopengraphcontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #15  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_3        
		Utility.putNonEmptyString(bundle, "PREVIEW_PROPERTY_NAME", (String)ShareInternalUtility.getFieldNameAndNamespaceFromFullName(shareopengraphcontent.getPreviewPropertyName()).second);
	//    4    6:aload_3         
	//    5    7:ldc1            #47  <String "PREVIEW_PROPERTY_NAME">
	//    6    9:aload_0         
	//    7   10:invokevirtual   #52  <Method String ShareOpenGraphContent.getPreviewPropertyName()>
	//    8   13:invokestatic    #58  <Method Pair ShareInternalUtility.getFieldNameAndNamespaceFromFullName(String)>
	//    9   16:getfield        #64  <Field Object Pair.second>
	//   10   19:checkcast       #66  <Class String>
	//   11   22:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "ACTION_TYPE", shareopengraphcontent.getAction().getActionType());
	//   12   25:aload_3         
	//   13   26:ldc1            #68  <String "ACTION_TYPE">
	//   14   28:aload_0         
	//   15   29:invokevirtual   #72  <Method ShareOpenGraphAction ShareOpenGraphContent.getAction()>
	//   16   32:invokevirtual   #77  <Method String ShareOpenGraphAction.getActionType()>
	//   17   35:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "ACTION", jsonobject.toString());
	//   18   38:aload_3         
	//   19   39:ldc1            #79  <String "ACTION">
	//   20   41:aload_1         
	//   21   42:invokevirtual   #84  <Method String JSONObject.toString()>
	//   22   45:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   23   48:aload_3         
	//   24   49:areturn         
	}

	private static Bundle create(SharePhotoContent sharephotocontent, List list, boolean flag)
	{
		sharephotocontent = ((SharePhotoContent) (createBaseParameters(((ShareContent) (sharephotocontent)), flag)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #15  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_0        
		((Bundle) (sharephotocontent)).putStringArrayList("PHOTOS", new ArrayList(((java.util.Collection) (list))));
	//    4    6:aload_0         
	//    5    7:ldc1            #87  <String "PHOTOS">
	//    6    9:new             #89  <Class ArrayList>
	//    7   12:dup             
	//    8   13:aload_1         
	//    9   14:invokespecial   #92  <Method void ArrayList(java.util.Collection)>
	//   10   17:invokevirtual   #98  <Method void Bundle.putStringArrayList(String, ArrayList)>
		return ((Bundle) (sharephotocontent));
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	private static Bundle create(ShareVideoContent sharevideocontent, String s, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharevideocontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #15  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_3        
		Utility.putNonEmptyString(bundle, "TITLE", sharevideocontent.getContentTitle());
	//    4    6:aload_3         
	//    5    7:ldc1            #17  <String "TITLE">
	//    6    9:aload_0         
	//    7   10:invokevirtual   #104 <Method String ShareVideoContent.getContentTitle()>
	//    8   13:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "DESCRIPTION", sharevideocontent.getContentDescription());
	//    9   16:aload_3         
	//   10   17:ldc1            #31  <String "DESCRIPTION">
	//   11   19:aload_0         
	//   12   20:invokevirtual   #105 <Method String ShareVideoContent.getContentDescription()>
	//   13   23:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "VIDEO", s);
	//   14   26:aload_3         
	//   15   27:ldc1            #107 <String "VIDEO">
	//   16   29:aload_1         
	//   17   30:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   18   33:aload_3         
	//   19   34:areturn         
	}

	public static Bundle create(UUID uuid, ShareContent sharecontent, boolean flag)
	{
		Validate.notNull(((Object) (sharecontent)), "shareContent");
	//    0    0:aload_1         
	//    1    1:ldc1            #112 <String "shareContent">
	//    2    3:invokestatic    #118 <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (uuid)), "callId");
	//    3    6:aload_0         
	//    4    7:ldc1            #120 <String "callId">
	//    5    9:invokestatic    #118 <Method void Validate.notNull(Object, String)>
		if(sharecontent instanceof ShareLinkContent)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #19  <Class ShareLinkContent>
	//*   8   16:ifeq            28
			return create((ShareLinkContent)sharecontent, flag);
	//    9   19:aload_1         
	//   10   20:checkcast       #19  <Class ShareLinkContent>
	//   11   23:iload_2         
	//   12   24:invokestatic    #122 <Method Bundle create(ShareLinkContent, boolean)>
	//   13   27:areturn         
		if(sharecontent instanceof SharePhotoContent)
	//*  14   28:aload_1         
	//*  15   29:instanceof      #124 <Class SharePhotoContent>
	//*  16   32:ifeq            51
		{
			sharecontent = ((ShareContent) ((SharePhotoContent)sharecontent));
	//   17   35:aload_1         
	//   18   36:checkcast       #124 <Class SharePhotoContent>
	//   19   39:astore_1        
			return create(((SharePhotoContent) (sharecontent)), ShareInternalUtility.getPhotoUrls(((SharePhotoContent) (sharecontent)), uuid), flag);
	//   20   40:aload_1         
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:invokestatic    #128 <Method List ShareInternalUtility.getPhotoUrls(SharePhotoContent, UUID)>
	//   24   46:iload_2         
	//   25   47:invokestatic    #130 <Method Bundle create(SharePhotoContent, List, boolean)>
	//   26   50:areturn         
		}
		if(sharecontent instanceof ShareVideoContent)
	//*  27   51:aload_1         
	//*  28   52:instanceof      #103 <Class ShareVideoContent>
	//*  29   55:ifeq            74
		{
			sharecontent = ((ShareContent) ((ShareVideoContent)sharecontent));
	//   30   58:aload_1         
	//   31   59:checkcast       #103 <Class ShareVideoContent>
	//   32   62:astore_1        
			return create(((ShareVideoContent) (sharecontent)), ShareInternalUtility.getVideoUrl(((ShareVideoContent) (sharecontent)), uuid), flag);
	//   33   63:aload_1         
	//   34   64:aload_1         
	//   35   65:aload_0         
	//   36   66:invokestatic    #134 <Method String ShareInternalUtility.getVideoUrl(ShareVideoContent, UUID)>
	//   37   69:iload_2         
	//   38   70:invokestatic    #136 <Method Bundle create(ShareVideoContent, String, boolean)>
	//   39   73:areturn         
		}
		if(sharecontent instanceof ShareOpenGraphContent)
	//*  40   74:aload_1         
	//*  41   75:instanceof      #49  <Class ShareOpenGraphContent>
	//*  42   78:ifeq            140
		{
			sharecontent = ((ShareContent) ((ShareOpenGraphContent)sharecontent));
	//   43   81:aload_1         
	//   44   82:checkcast       #49  <Class ShareOpenGraphContent>
	//   45   85:astore_1        
			try
			{
				uuid = ((UUID) (create(((ShareOpenGraphContent) (sharecontent)), ShareInternalUtility.removeNamespacesFromOGJsonObject(ShareInternalUtility.toJSONObjectForCall(uuid, ((ShareOpenGraphContent) (sharecontent))), false), flag)));
	//   46   86:aload_1         
	//   47   87:aload_0         
	//   48   88:aload_1         
	//   49   89:invokestatic    #140 <Method JSONObject ShareInternalUtility.toJSONObjectForCall(UUID, ShareOpenGraphContent)>
	//   50   92:iconst_0        
	//   51   93:invokestatic    #144 <Method JSONObject ShareInternalUtility.removeNamespacesFromOGJsonObject(JSONObject, boolean)>
	//   52   96:iload_2         
	//   53   97:invokestatic    #146 <Method Bundle create(ShareOpenGraphContent, JSONObject, boolean)>
	//   54  100:astore_0        
			}
	//*  55  101:aload_0         
	//*  56  102:areturn         
			// Misplaced declaration of an exception variable
			catch(UUID uuid)
	//*  57  103:astore_0        
			{
				sharecontent = ((ShareContent) (new StringBuilder()));
	//   58  104:new             #148 <Class StringBuilder>
	//   59  107:dup             
	//   60  108:invokespecial   #149 <Method void StringBuilder()>
	//   61  111:astore_1        
				((StringBuilder) (sharecontent)).append("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
	//   62  112:aload_1         
	//   63  113:ldc1            #151 <String "Unable to create a JSON Object from the provided ShareOpenGraphContent: ">
	//   64  115:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   65  118:pop             
				((StringBuilder) (sharecontent)).append(((JSONException) (uuid)).getMessage());
	//   66  119:aload_1         
	//   67  120:aload_0         
	//   68  121:invokevirtual   #158 <Method String JSONException.getMessage()>
	//   69  124:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   70  127:pop             
				throw new FacebookException(((StringBuilder) (sharecontent)).toString());
	//   71  128:new             #160 <Class FacebookException>
	//   72  131:dup             
	//   73  132:aload_1         
	//   74  133:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   75  136:invokespecial   #164 <Method void FacebookException(String)>
	//   76  139:athrow          
			}
			return ((Bundle) (uuid));
		} else
		{
			return null;
	//   77  140:aconst_null     
	//   78  141:areturn         
		}
	}

	private static Bundle createBaseParameters(ShareContent sharecontent, boolean flag)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #94  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #165 <Method void Bundle()>
	//    3    7:astore_2        
		Utility.putUri(bundle, "LINK", sharecontent.getContentUrl());
	//    4    8:aload_2         
	//    5    9:ldc1            #167 <String "LINK">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #172 <Method android.net.Uri ShareContent.getContentUrl()>
	//    8   15:invokestatic    #44  <Method void Utility.putUri(Bundle, String, android.net.Uri)>
		Utility.putNonEmptyString(bundle, "PLACE", sharecontent.getPlaceId());
	//    9   18:aload_2         
	//   10   19:ldc1            #174 <String "PLACE">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #177 <Method String ShareContent.getPlaceId()>
	//   13   25:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "REF", sharecontent.getRef());
	//   14   28:aload_2         
	//   15   29:ldc1            #179 <String "REF">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #182 <Method String ShareContent.getRef()>
	//   18   35:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		bundle.putBoolean("DATA_FAILURES_FATAL", flag);
	//   19   38:aload_2         
	//   20   39:ldc1            #184 <String "DATA_FAILURES_FATAL">
	//   21   41:iload_1         
	//   22   42:invokevirtual   #188 <Method void Bundle.putBoolean(String, boolean)>
		sharecontent = ((ShareContent) (sharecontent.getPeopleIds()));
	//   23   45:aload_0         
	//   24   46:invokevirtual   #192 <Method List ShareContent.getPeopleIds()>
	//   25   49:astore_0        
		if(!Utility.isNullOrEmpty(((java.util.Collection) (sharecontent))))
	//*  26   50:aload_0         
	//*  27   51:invokestatic    #196 <Method boolean Utility.isNullOrEmpty(java.util.Collection)>
	//*  28   54:ifne            71
			bundle.putStringArrayList("FRIENDS", new ArrayList(((java.util.Collection) (sharecontent))));
	//   29   57:aload_2         
	//   30   58:ldc1            #198 <String "FRIENDS">
	//   31   60:new             #89  <Class ArrayList>
	//   32   63:dup             
	//   33   64:aload_0         
	//   34   65:invokespecial   #92  <Method void ArrayList(java.util.Collection)>
	//   35   68:invokevirtual   #98  <Method void Bundle.putStringArrayList(String, ArrayList)>
		return bundle;
	//   36   71:aload_2         
	//   37   72:areturn         
	}
}
