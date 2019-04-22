// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.share.model.*;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			ShareInternalUtility

public class LegacyNativeDialogParameters
{

	private static Bundle create(ShareLinkContent sharelinkcontent, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (sharelinkcontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #11  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_2        
		Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.TITLE", sharelinkcontent.getContentTitle());
	//    4    6:aload_2         
	//    5    7:ldc1            #13  <String "com.facebook.platform.extra.TITLE">
	//    6    9:aload_0         
	//    7   10:invokevirtual   #19  <Method String ShareLinkContent.getContentTitle()>
	//    8   13:invokestatic    #25  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.DESCRIPTION", sharelinkcontent.getContentDescription());
	//    9   16:aload_2         
	//   10   17:ldc1            #27  <String "com.facebook.platform.extra.DESCRIPTION">
	//   11   19:aload_0         
	//   12   20:invokevirtual   #30  <Method String ShareLinkContent.getContentDescription()>
	//   13   23:invokestatic    #25  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putUri(bundle, "com.facebook.platform.extra.IMAGE", sharelinkcontent.getImageUrl());
	//   14   26:aload_2         
	//   15   27:ldc1            #32  <String "com.facebook.platform.extra.IMAGE">
	//   16   29:aload_0         
	//   17   30:invokevirtual   #36  <Method android.net.Uri ShareLinkContent.getImageUrl()>
	//   18   33:invokestatic    #40  <Method void Utility.putUri(Bundle, String, android.net.Uri)>
		return bundle;
	//   19   36:aload_2         
	//   20   37:areturn         
	}

	private static Bundle create(ShareOpenGraphContent shareopengraphcontent, JSONObject jsonobject, boolean flag)
	{
		Bundle bundle = createBaseParameters(((ShareContent) (shareopengraphcontent)), flag);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #11  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_3        
		Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", shareopengraphcontent.getPreviewPropertyName());
	//    4    6:aload_3         
	//    5    7:ldc1            #44  <String "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME">
	//    6    9:aload_0         
	//    7   10:invokevirtual   #49  <Method String ShareOpenGraphContent.getPreviewPropertyName()>
	//    8   13:invokestatic    #25  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.ACTION_TYPE", shareopengraphcontent.getAction().getActionType());
	//    9   16:aload_3         
	//   10   17:ldc1            #51  <String "com.facebook.platform.extra.ACTION_TYPE">
	//   11   19:aload_0         
	//   12   20:invokevirtual   #55  <Method ShareOpenGraphAction ShareOpenGraphContent.getAction()>
	//   13   23:invokevirtual   #60  <Method String ShareOpenGraphAction.getActionType()>
	//   14   26:invokestatic    #25  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		if(!(jsonobject instanceof JSONObject))
	//*  15   29:aload_1         
	//*  16   30:instanceof      #62  <Class JSONObject>
	//*  17   33:ifne            44
			shareopengraphcontent = ((ShareOpenGraphContent) (jsonobject.toString()));
	//   18   36:aload_1         
	//   19   37:invokevirtual   #65  <Method String JSONObject.toString()>
	//   20   40:astore_0        
		else
	//*  21   41:goto            52
			shareopengraphcontent = ((ShareOpenGraphContent) (JSONObjectInstrumentation.toString((JSONObject)jsonobject)));
	//   22   44:aload_1         
	//   23   45:checkcast       #62  <Class JSONObject>
	//   24   48:invokestatic    #70  <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   25   51:astore_0        
		Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.ACTION", ((String) (shareopengraphcontent)));
	//   26   52:aload_3         
	//   27   53:ldc1            #72  <String "com.facebook.platform.extra.ACTION">
	//   28   55:aload_0         
	//   29   56:invokestatic    #25  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   30   59:aload_3         
	//   31   60:areturn         
	}

	private static Bundle create(SharePhotoContent sharephotocontent, List list, boolean flag)
	{
		sharephotocontent = ((SharePhotoContent) (createBaseParameters(((ShareContent) (sharephotocontent)), flag)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #11  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_0        
		((Bundle) (sharephotocontent)).putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList(((java.util.Collection) (list))));
	//    4    6:aload_0         
	//    5    7:ldc1            #75  <String "com.facebook.platform.extra.PHOTOS">
	//    6    9:new             #77  <Class ArrayList>
	//    7   12:dup             
	//    8   13:aload_1         
	//    9   14:invokespecial   #81  <Method void ArrayList(java.util.Collection)>
	//   10   17:invokevirtual   #87  <Method void Bundle.putStringArrayList(String, ArrayList)>
		return ((Bundle) (sharephotocontent));
	//   11   20:aload_0         
	//   12   21:areturn         
	}

	private static Bundle create(ShareVideoContent sharevideocontent, boolean flag)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public static Bundle create(UUID uuid, ShareContent sharecontent, boolean flag)
	{
		Validate.notNull(((Object) (sharecontent)), "shareContent");
	//    0    0:aload_1         
	//    1    1:ldc1            #95  <String "shareContent">
	//    2    3:invokestatic    #101 <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (uuid)), "callId");
	//    3    6:aload_0         
	//    4    7:ldc1            #103 <String "callId">
	//    5    9:invokestatic    #101 <Method void Validate.notNull(Object, String)>
		if(sharecontent instanceof ShareLinkContent)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #15  <Class ShareLinkContent>
	//*   8   16:ifeq            28
			return create((ShareLinkContent)sharecontent, flag);
	//    9   19:aload_1         
	//   10   20:checkcast       #15  <Class ShareLinkContent>
	//   11   23:iload_2         
	//   12   24:invokestatic    #105 <Method Bundle create(ShareLinkContent, boolean)>
	//   13   27:areturn         
		if(sharecontent instanceof SharePhotoContent)
	//*  14   28:aload_1         
	//*  15   29:instanceof      #107 <Class SharePhotoContent>
	//*  16   32:ifeq            51
		{
			sharecontent = ((ShareContent) ((SharePhotoContent)sharecontent));
	//   17   35:aload_1         
	//   18   36:checkcast       #107 <Class SharePhotoContent>
	//   19   39:astore_1        
			return create(((SharePhotoContent) (sharecontent)), ShareInternalUtility.getPhotoUrls(((SharePhotoContent) (sharecontent)), uuid), flag);
	//   20   40:aload_1         
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:invokestatic    #113 <Method List ShareInternalUtility.getPhotoUrls(SharePhotoContent, UUID)>
	//   24   46:iload_2         
	//   25   47:invokestatic    #115 <Method Bundle create(SharePhotoContent, List, boolean)>
	//   26   50:areturn         
		}
		if(sharecontent instanceof ShareVideoContent)
	//*  27   51:aload_1         
	//*  28   52:instanceof      #117 <Class ShareVideoContent>
	//*  29   55:ifeq            67
			return create((ShareVideoContent)sharecontent, flag);
	//   30   58:aload_1         
	//   31   59:checkcast       #117 <Class ShareVideoContent>
	//   32   62:iload_2         
	//   33   63:invokestatic    #119 <Method Bundle create(ShareVideoContent, boolean)>
	//   34   66:areturn         
		if(sharecontent instanceof ShareOpenGraphContent)
	//*  35   67:aload_1         
	//*  36   68:instanceof      #46  <Class ShareOpenGraphContent>
	//*  37   71:ifeq            129
		{
			sharecontent = ((ShareContent) ((ShareOpenGraphContent)sharecontent));
	//   38   74:aload_1         
	//   39   75:checkcast       #46  <Class ShareOpenGraphContent>
	//   40   78:astore_1        
			try
			{
				uuid = ((UUID) (create(((ShareOpenGraphContent) (sharecontent)), ShareInternalUtility.toJSONObjectForCall(uuid, ((ShareOpenGraphContent) (sharecontent))), flag)));
	//   41   79:aload_1         
	//   42   80:aload_0         
	//   43   81:aload_1         
	//   44   82:invokestatic    #123 <Method JSONObject ShareInternalUtility.toJSONObjectForCall(UUID, ShareOpenGraphContent)>
	//   45   85:iload_2         
	//   46   86:invokestatic    #125 <Method Bundle create(ShareOpenGraphContent, JSONObject, boolean)>
	//   47   89:astore_0        
			}
	//*  48   90:aload_0         
	//*  49   91:areturn         
			// Misplaced declaration of an exception variable
			catch(UUID uuid)
	//*  50   92:astore_0        
			{
				sharecontent = ((ShareContent) (new StringBuilder()));
	//   51   93:new             #127 <Class StringBuilder>
	//   52   96:dup             
	//   53   97:invokespecial   #130 <Method void StringBuilder()>
	//   54  100:astore_1        
				((StringBuilder) (sharecontent)).append("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
	//   55  101:aload_1         
	//   56  102:ldc1            #132 <String "Unable to create a JSON Object from the provided ShareOpenGraphContent: ">
	//   57  104:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   58  107:pop             
				((StringBuilder) (sharecontent)).append(((JSONException) (uuid)).getMessage());
	//   59  108:aload_1         
	//   60  109:aload_0         
	//   61  110:invokevirtual   #139 <Method String JSONException.getMessage()>
	//   62  113:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   63  116:pop             
				throw new FacebookException(((StringBuilder) (sharecontent)).toString());
	//   64  117:new             #141 <Class FacebookException>
	//   65  120:dup             
	//   66  121:aload_1         
	//   67  122:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   68  125:invokespecial   #145 <Method void FacebookException(String)>
	//   69  128:athrow          
			}
			return ((Bundle) (uuid));
		} else
		{
			return null;
	//   70  129:aconst_null     
	//   71  130:areturn         
		}
	}

	private static Bundle createBaseParameters(ShareContent sharecontent, boolean flag)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #83  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void Bundle()>
	//    3    7:astore_2        
		Utility.putUri(bundle, "com.facebook.platform.extra.LINK", sharecontent.getContentUrl());
	//    4    8:aload_2         
	//    5    9:ldc1            #148 <String "com.facebook.platform.extra.LINK">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #153 <Method android.net.Uri ShareContent.getContentUrl()>
	//    8   15:invokestatic    #40  <Method void Utility.putUri(Bundle, String, android.net.Uri)>
		Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.PLACE", sharecontent.getPlaceId());
	//    9   18:aload_2         
	//   10   19:ldc1            #155 <String "com.facebook.platform.extra.PLACE">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #158 <Method String ShareContent.getPlaceId()>
	//   13   25:invokestatic    #25  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.REF", sharecontent.getRef());
	//   14   28:aload_2         
	//   15   29:ldc1            #160 <String "com.facebook.platform.extra.REF">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #163 <Method String ShareContent.getRef()>
	//   18   35:invokestatic    #25  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", flag);
	//   19   38:aload_2         
	//   20   39:ldc1            #165 <String "com.facebook.platform.extra.DATA_FAILURES_FATAL">
	//   21   41:iload_1         
	//   22   42:invokevirtual   #169 <Method void Bundle.putBoolean(String, boolean)>
		sharecontent = ((ShareContent) (sharecontent.getPeopleIds()));
	//   23   45:aload_0         
	//   24   46:invokevirtual   #173 <Method List ShareContent.getPeopleIds()>
	//   25   49:astore_0        
		if(!Utility.isNullOrEmpty(((java.util.Collection) (sharecontent))))
	//*  26   50:aload_0         
	//*  27   51:invokestatic    #177 <Method boolean Utility.isNullOrEmpty(java.util.Collection)>
	//*  28   54:ifne            71
			bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList(((java.util.Collection) (sharecontent))));
	//   29   57:aload_2         
	//   30   58:ldc1            #179 <String "com.facebook.platform.extra.FRIENDS">
	//   31   60:new             #77  <Class ArrayList>
	//   32   63:dup             
	//   33   64:aload_0         
	//   34   65:invokespecial   #81  <Method void ArrayList(java.util.Collection)>
	//   35   68:invokevirtual   #87  <Method void Bundle.putStringArrayList(String, ArrayList)>
		return bundle;
	//   36   71:aload_2         
	//   37   72:areturn         
	}
}
