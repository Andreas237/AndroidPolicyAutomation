// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.share.model.*;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			ShareInternalUtility

public class LegacyNativeDialogParameters
{

	public LegacyNativeDialogParameters()
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
		Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.TITLE", sharelinkcontent.getContentTitle());
	//    4    6:aload_2         
	//    5    7:ldc1            #17  <String "com.facebook.platform.extra.TITLE">
	//    6    9:aload_0         
	//    7   10:invokevirtual   #23  <Method String ShareLinkContent.getContentTitle()>
	//    8   13:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.DESCRIPTION", sharelinkcontent.getContentDescription());
	//    9   16:aload_2         
	//   10   17:ldc1            #31  <String "com.facebook.platform.extra.DESCRIPTION">
	//   11   19:aload_0         
	//   12   20:invokevirtual   #34  <Method String ShareLinkContent.getContentDescription()>
	//   13   23:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putUri(bundle, "com.facebook.platform.extra.IMAGE", sharelinkcontent.getImageUrl());
	//   14   26:aload_2         
	//   15   27:ldc1            #36  <String "com.facebook.platform.extra.IMAGE">
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
		Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", shareopengraphcontent.getPreviewPropertyName());
	//    4    6:aload_3         
	//    5    7:ldc1            #47  <String "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME">
	//    6    9:aload_0         
	//    7   10:invokevirtual   #52  <Method String ShareOpenGraphContent.getPreviewPropertyName()>
	//    8   13:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.ACTION_TYPE", shareopengraphcontent.getAction().getActionType());
	//    9   16:aload_3         
	//   10   17:ldc1            #54  <String "com.facebook.platform.extra.ACTION_TYPE">
	//   11   19:aload_0         
	//   12   20:invokevirtual   #58  <Method ShareOpenGraphAction ShareOpenGraphContent.getAction()>
	//   13   23:invokevirtual   #63  <Method String ShareOpenGraphAction.getActionType()>
	//   14   26:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.ACTION", jsonobject.toString());
	//   15   29:aload_3         
	//   16   30:ldc1            #65  <String "com.facebook.platform.extra.ACTION">
	//   17   32:aload_1         
	//   18   33:invokevirtual   #70  <Method String JSONObject.toString()>
	//   19   36:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		return bundle;
	//   20   39:aload_3         
	//   21   40:areturn         
	}

	private static Bundle create(SharePhotoContent sharephotocontent, List list, boolean flag)
	{
		sharephotocontent = ((SharePhotoContent) (createBaseParameters(((ShareContent) (sharephotocontent)), flag)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #15  <Method Bundle createBaseParameters(ShareContent, boolean)>
	//    3    5:astore_0        
		((Bundle) (sharephotocontent)).putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList(((java.util.Collection) (list))));
	//    4    6:aload_0         
	//    5    7:ldc1            #73  <String "com.facebook.platform.extra.PHOTOS">
	//    6    9:new             #75  <Class ArrayList>
	//    7   12:dup             
	//    8   13:aload_1         
	//    9   14:invokespecial   #78  <Method void ArrayList(java.util.Collection)>
	//   10   17:invokevirtual   #84  <Method void Bundle.putStringArrayList(String, ArrayList)>
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
	//    1    1:ldc1            #92  <String "shareContent">
	//    2    3:invokestatic    #98  <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (uuid)), "callId");
	//    3    6:aload_0         
	//    4    7:ldc1            #100 <String "callId">
	//    5    9:invokestatic    #98  <Method void Validate.notNull(Object, String)>
		if(sharecontent instanceof ShareLinkContent)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #19  <Class ShareLinkContent>
	//*   8   16:ifeq            28
			return create((ShareLinkContent)sharecontent, flag);
	//    9   19:aload_1         
	//   10   20:checkcast       #19  <Class ShareLinkContent>
	//   11   23:iload_2         
	//   12   24:invokestatic    #102 <Method Bundle create(ShareLinkContent, boolean)>
	//   13   27:areturn         
		if(sharecontent instanceof SharePhotoContent)
	//*  14   28:aload_1         
	//*  15   29:instanceof      #104 <Class SharePhotoContent>
	//*  16   32:ifeq            51
		{
			sharecontent = ((ShareContent) ((SharePhotoContent)sharecontent));
	//   17   35:aload_1         
	//   18   36:checkcast       #104 <Class SharePhotoContent>
	//   19   39:astore_1        
			return create(((SharePhotoContent) (sharecontent)), ShareInternalUtility.getPhotoUrls(((SharePhotoContent) (sharecontent)), uuid), flag);
	//   20   40:aload_1         
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:invokestatic    #110 <Method List ShareInternalUtility.getPhotoUrls(SharePhotoContent, UUID)>
	//   24   46:iload_2         
	//   25   47:invokestatic    #112 <Method Bundle create(SharePhotoContent, List, boolean)>
	//   26   50:areturn         
		}
		if(sharecontent instanceof ShareVideoContent)
	//*  27   51:aload_1         
	//*  28   52:instanceof      #114 <Class ShareVideoContent>
	//*  29   55:ifeq            67
			return create((ShareVideoContent)sharecontent, flag);
	//   30   58:aload_1         
	//   31   59:checkcast       #114 <Class ShareVideoContent>
	//   32   62:iload_2         
	//   33   63:invokestatic    #116 <Method Bundle create(ShareVideoContent, boolean)>
	//   34   66:areturn         
		if(sharecontent instanceof ShareOpenGraphContent)
	//*  35   67:aload_1         
	//*  36   68:instanceof      #49  <Class ShareOpenGraphContent>
	//*  37   71:ifeq            129
		{
			sharecontent = ((ShareContent) ((ShareOpenGraphContent)sharecontent));
	//   38   74:aload_1         
	//   39   75:checkcast       #49  <Class ShareOpenGraphContent>
	//   40   78:astore_1        
			try
			{
				uuid = ((UUID) (create(((ShareOpenGraphContent) (sharecontent)), ShareInternalUtility.toJSONObjectForCall(uuid, ((ShareOpenGraphContent) (sharecontent))), flag)));
	//   41   79:aload_1         
	//   42   80:aload_0         
	//   43   81:aload_1         
	//   44   82:invokestatic    #120 <Method JSONObject ShareInternalUtility.toJSONObjectForCall(UUID, ShareOpenGraphContent)>
	//   45   85:iload_2         
	//   46   86:invokestatic    #122 <Method Bundle create(ShareOpenGraphContent, JSONObject, boolean)>
	//   47   89:astore_0        
			}
	//*  48   90:aload_0         
	//*  49   91:areturn         
			// Misplaced declaration of an exception variable
			catch(UUID uuid)
	//*  50   92:astore_0        
			{
				sharecontent = ((ShareContent) (new StringBuilder()));
	//   51   93:new             #124 <Class StringBuilder>
	//   52   96:dup             
	//   53   97:invokespecial   #125 <Method void StringBuilder()>
	//   54  100:astore_1        
				((StringBuilder) (sharecontent)).append("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
	//   55  101:aload_1         
	//   56  102:ldc1            #127 <String "Unable to create a JSON Object from the provided ShareOpenGraphContent: ">
	//   57  104:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   58  107:pop             
				((StringBuilder) (sharecontent)).append(((JSONException) (uuid)).getMessage());
	//   59  108:aload_1         
	//   60  109:aload_0         
	//   61  110:invokevirtual   #134 <Method String JSONException.getMessage()>
	//   62  113:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   63  116:pop             
				throw new FacebookException(((StringBuilder) (sharecontent)).toString());
	//   64  117:new             #136 <Class FacebookException>
	//   65  120:dup             
	//   66  121:aload_1         
	//   67  122:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   68  125:invokespecial   #140 <Method void FacebookException(String)>
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
	//    0    0:new             #80  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #141 <Method void Bundle()>
	//    3    7:astore_2        
		Utility.putUri(bundle, "com.facebook.platform.extra.LINK", sharecontent.getContentUrl());
	//    4    8:aload_2         
	//    5    9:ldc1            #143 <String "com.facebook.platform.extra.LINK">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #148 <Method android.net.Uri ShareContent.getContentUrl()>
	//    8   15:invokestatic    #44  <Method void Utility.putUri(Bundle, String, android.net.Uri)>
		Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.PLACE", sharecontent.getPlaceId());
	//    9   18:aload_2         
	//   10   19:ldc1            #150 <String "com.facebook.platform.extra.PLACE">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #153 <Method String ShareContent.getPlaceId()>
	//   13   25:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.REF", sharecontent.getRef());
	//   14   28:aload_2         
	//   15   29:ldc1            #155 <String "com.facebook.platform.extra.REF">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #158 <Method String ShareContent.getRef()>
	//   18   35:invokestatic    #29  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", flag);
	//   19   38:aload_2         
	//   20   39:ldc1            #160 <String "com.facebook.platform.extra.DATA_FAILURES_FATAL">
	//   21   41:iload_1         
	//   22   42:invokevirtual   #164 <Method void Bundle.putBoolean(String, boolean)>
		sharecontent = ((ShareContent) (sharecontent.getPeopleIds()));
	//   23   45:aload_0         
	//   24   46:invokevirtual   #168 <Method List ShareContent.getPeopleIds()>
	//   25   49:astore_0        
		if(!Utility.isNullOrEmpty(((java.util.Collection) (sharecontent))))
	//*  26   50:aload_0         
	//*  27   51:invokestatic    #172 <Method boolean Utility.isNullOrEmpty(java.util.Collection)>
	//*  28   54:ifne            71
			bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList(((java.util.Collection) (sharecontent))));
	//   29   57:aload_2         
	//   30   58:ldc1            #174 <String "com.facebook.platform.extra.FRIENDS">
	//   31   60:new             #75  <Class ArrayList>
	//   32   63:dup             
	//   33   64:aload_0         
	//   34   65:invokespecial   #78  <Method void ArrayList(java.util.Collection)>
	//   35   68:invokevirtual   #84  <Method void Bundle.putStringArrayList(String, ArrayList)>
		return bundle;
	//   36   71:aload_2         
	//   37   72:areturn         
	}
}
