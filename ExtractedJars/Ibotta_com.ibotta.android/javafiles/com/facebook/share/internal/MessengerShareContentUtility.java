// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.Utility;
import com.facebook.share.model.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.*;

public class MessengerShareContentUtility
{

	private static void addActionButton(Bundle bundle, ShareMessengerActionButton sharemessengeractionbutton, boolean flag)
		throws JSONException
	{
		if(sharemessengeractionbutton == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(sharemessengeractionbutton instanceof ShareMessengerURLActionButton)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #27  <Class ShareMessengerURLActionButton>
	//*   5    9:ifeq            21
			addURLActionButton(bundle, (ShareMessengerURLActionButton)sharemessengeractionbutton, flag);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #27  <Class ShareMessengerURLActionButton>
	//    9   17:iload_2         
	//   10   18:invokestatic    #31  <Method void addURLActionButton(Bundle, ShareMessengerURLActionButton, boolean)>
	//   11   21:return          
	}

	public static void addGenericTemplateContent(Bundle bundle, ShareMessengerGenericTemplateContent sharemessengergenerictemplatecontent)
		throws JSONException
	{
		addGenericTemplateElementForPreview(bundle, sharemessengergenerictemplatecontent.getGenericTemplateElement());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method ShareMessengerGenericTemplateElement ShareMessengerGenericTemplateContent.getGenericTemplateElement()>
	//    3    5:invokestatic    #44  <Method void addGenericTemplateElementForPreview(Bundle, ShareMessengerGenericTemplateElement)>
		Utility.putJSONValueInBundle(bundle, "MESSENGER_PLATFORM_CONTENT", ((Object) (serializeGenericTemplateContent(sharemessengergenerictemplatecontent))));
	//    4    8:aload_0         
	//    5    9:ldc1            #46  <String "MESSENGER_PLATFORM_CONTENT">
	//    6   11:aload_1         
	//    7   12:invokestatic    #50  <Method JSONObject serializeGenericTemplateContent(ShareMessengerGenericTemplateContent)>
	//    8   15:invokestatic    #56  <Method boolean Utility.putJSONValueInBundle(Bundle, String, Object)>
	//    9   18:pop             
	//   10   19:return          
	}

	private static void addGenericTemplateElementForPreview(Bundle bundle, ShareMessengerGenericTemplateElement sharemessengergenerictemplateelement)
		throws JSONException
	{
		if(sharemessengergenerictemplateelement.getButton() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #62  <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getButton()>
	//*   2    4:ifnull          19
			addActionButton(bundle, sharemessengergenerictemplateelement.getButton(), false);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #62  <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getButton()>
	//    6   12:iconst_0        
	//    7   13:invokestatic    #64  <Method void addActionButton(Bundle, ShareMessengerActionButton, boolean)>
		else
	//*   8   16:goto            35
		if(sharemessengergenerictemplateelement.getDefaultAction() != null)
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #67  <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getDefaultAction()>
	//*  11   23:ifnull          35
			addActionButton(bundle, sharemessengergenerictemplateelement.getDefaultAction(), true);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #67  <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getDefaultAction()>
	//   15   31:iconst_1        
	//   16   32:invokestatic    #64  <Method void addActionButton(Bundle, ShareMessengerActionButton, boolean)>
		Utility.putUri(bundle, "IMAGE", sharemessengergenerictemplateelement.getImageUrl());
	//   17   35:aload_0         
	//   18   36:ldc1            #69  <String "IMAGE">
	//   19   38:aload_1         
	//   20   39:invokevirtual   #73  <Method Uri ShareMessengerGenericTemplateElement.getImageUrl()>
	//   21   42:invokestatic    #77  <Method void Utility.putUri(Bundle, String, Uri)>
		Utility.putNonEmptyString(bundle, "PREVIEW_TYPE", "DEFAULT");
	//   22   45:aload_0         
	//   23   46:ldc1            #79  <String "PREVIEW_TYPE">
	//   24   48:ldc1            #81  <String "DEFAULT">
	//   25   50:invokestatic    #85  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "TITLE", sharemessengergenerictemplateelement.getTitle());
	//   26   53:aload_0         
	//   27   54:ldc1            #87  <String "TITLE">
	//   28   56:aload_1         
	//   29   57:invokevirtual   #91  <Method String ShareMessengerGenericTemplateElement.getTitle()>
	//   30   60:invokestatic    #85  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "SUBTITLE", sharemessengergenerictemplateelement.getSubtitle());
	//   31   63:aload_0         
	//   32   64:ldc1            #93  <String "SUBTITLE">
	//   33   66:aload_1         
	//   34   67:invokevirtual   #96  <Method String ShareMessengerGenericTemplateElement.getSubtitle()>
	//   35   70:invokestatic    #85  <Method void Utility.putNonEmptyString(Bundle, String, String)>
	//   36   73:return          
	}

	public static void addMediaTemplateContent(Bundle bundle, ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent)
		throws JSONException
	{
		addMediaTemplateContentForPreview(bundle, sharemessengermediatemplatecontent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #101 <Method void addMediaTemplateContentForPreview(Bundle, ShareMessengerMediaTemplateContent)>
		Utility.putJSONValueInBundle(bundle, "MESSENGER_PLATFORM_CONTENT", ((Object) (serializeMediaTemplateContent(sharemessengermediatemplatecontent))));
	//    3    5:aload_0         
	//    4    6:ldc1            #46  <String "MESSENGER_PLATFORM_CONTENT">
	//    5    8:aload_1         
	//    6    9:invokestatic    #105 <Method JSONObject serializeMediaTemplateContent(ShareMessengerMediaTemplateContent)>
	//    7   12:invokestatic    #56  <Method boolean Utility.putJSONValueInBundle(Bundle, String, Object)>
	//    8   15:pop             
	//    9   16:return          
	}

	private static void addMediaTemplateContentForPreview(Bundle bundle, ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent)
		throws JSONException
	{
		addActionButton(bundle, sharemessengermediatemplatecontent.getButton(), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #108 <Method ShareMessengerActionButton ShareMessengerMediaTemplateContent.getButton()>
	//    3    5:iconst_0        
	//    4    6:invokestatic    #64  <Method void addActionButton(Bundle, ShareMessengerActionButton, boolean)>
		Utility.putNonEmptyString(bundle, "PREVIEW_TYPE", "DEFAULT");
	//    5    9:aload_0         
	//    6   10:ldc1            #79  <String "PREVIEW_TYPE">
	//    7   12:ldc1            #81  <String "DEFAULT">
	//    8   14:invokestatic    #85  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "ATTACHMENT_ID", sharemessengermediatemplatecontent.getAttachmentId());
	//    9   17:aload_0         
	//   10   18:ldc1            #110 <String "ATTACHMENT_ID">
	//   11   20:aload_1         
	//   12   21:invokevirtual   #113 <Method String ShareMessengerMediaTemplateContent.getAttachmentId()>
	//   13   24:invokestatic    #85  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		if(sharemessengermediatemplatecontent.getMediaUrl() != null)
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #116 <Method Uri ShareMessengerMediaTemplateContent.getMediaUrl()>
	//*  16   31:ifnull          49
			Utility.putUri(bundle, getMediaUrlKey(sharemessengermediatemplatecontent.getMediaUrl()), sharemessengermediatemplatecontent.getMediaUrl());
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokevirtual   #116 <Method Uri ShareMessengerMediaTemplateContent.getMediaUrl()>
	//   20   39:invokestatic    #120 <Method String getMediaUrlKey(Uri)>
	//   21   42:aload_1         
	//   22   43:invokevirtual   #116 <Method Uri ShareMessengerMediaTemplateContent.getMediaUrl()>
	//   23   46:invokestatic    #77  <Method void Utility.putUri(Bundle, String, Uri)>
		Utility.putNonEmptyString(bundle, "type", getMediaType(sharemessengermediatemplatecontent.getMediaType()));
	//   24   49:aload_0         
	//   25   50:ldc1            #122 <String "type">
	//   26   52:aload_1         
	//   27   53:invokevirtual   #126 <Method com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType ShareMessengerMediaTemplateContent.getMediaType()>
	//   28   56:invokestatic    #129 <Method String getMediaType(com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType)>
	//   29   59:invokestatic    #85  <Method void Utility.putNonEmptyString(Bundle, String, String)>
	//   30   62:return          
	}

	public static void addOpenGraphMusicTemplateContent(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent)
		throws JSONException
	{
		addOpenGraphMusicTemplateContentForPreview(bundle, sharemessengeropengraphmusictemplatecontent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #134 <Method void addOpenGraphMusicTemplateContentForPreview(Bundle, ShareMessengerOpenGraphMusicTemplateContent)>
		Utility.putJSONValueInBundle(bundle, "MESSENGER_PLATFORM_CONTENT", ((Object) (serializeOpenGraphMusicTemplateContent(sharemessengeropengraphmusictemplatecontent))));
	//    3    5:aload_0         
	//    4    6:ldc1            #46  <String "MESSENGER_PLATFORM_CONTENT">
	//    5    8:aload_1         
	//    6    9:invokestatic    #138 <Method JSONObject serializeOpenGraphMusicTemplateContent(ShareMessengerOpenGraphMusicTemplateContent)>
	//    7   12:invokestatic    #56  <Method boolean Utility.putJSONValueInBundle(Bundle, String, Object)>
	//    8   15:pop             
	//    9   16:return          
	}

	private static void addOpenGraphMusicTemplateContentForPreview(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent)
		throws JSONException
	{
		addActionButton(bundle, sharemessengeropengraphmusictemplatecontent.getButton(), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #141 <Method ShareMessengerActionButton ShareMessengerOpenGraphMusicTemplateContent.getButton()>
	//    3    5:iconst_0        
	//    4    6:invokestatic    #64  <Method void addActionButton(Bundle, ShareMessengerActionButton, boolean)>
		Utility.putNonEmptyString(bundle, "PREVIEW_TYPE", "OPEN_GRAPH");
	//    5    9:aload_0         
	//    6   10:ldc1            #79  <String "PREVIEW_TYPE">
	//    7   12:ldc1            #143 <String "OPEN_GRAPH">
	//    8   14:invokestatic    #85  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putUri(bundle, "OPEN_GRAPH_URL", sharemessengeropengraphmusictemplatecontent.getUrl());
	//    9   17:aload_0         
	//   10   18:ldc1            #145 <String "OPEN_GRAPH_URL">
	//   11   20:aload_1         
	//   12   21:invokevirtual   #148 <Method Uri ShareMessengerOpenGraphMusicTemplateContent.getUrl()>
	//   13   24:invokestatic    #77  <Method void Utility.putUri(Bundle, String, Uri)>
	//   14   27:return          
	}

	private static void addURLActionButton(Bundle bundle, ShareMessengerURLActionButton sharemessengerurlactionbutton, boolean flag)
		throws JSONException
	{
		Object obj;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            15
		{
			obj = ((Object) (Utility.getUriString(sharemessengerurlactionbutton.getUrl())));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #149 <Method Uri ShareMessengerURLActionButton.getUrl()>
	//    4    8:invokestatic    #152 <Method String Utility.getUriString(Uri)>
	//    5   11:astore_3        
		} else
	//*   6   12:goto            56
		{
			obj = ((Object) (new StringBuilder()));
	//    7   15:new             #154 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #157 <Method void StringBuilder()>
	//   10   22:astore_3        
			((StringBuilder) (obj)).append(sharemessengerurlactionbutton.getTitle());
	//   11   23:aload_3         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #158 <Method String ShareMessengerURLActionButton.getTitle()>
	//   14   28:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
			((StringBuilder) (obj)).append(" - ");
	//   16   32:aload_3         
	//   17   33:ldc1            #164 <String " - ">
	//   18   35:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			((StringBuilder) (obj)).append(Utility.getUriString(sharemessengerurlactionbutton.getUrl()));
	//   20   39:aload_3         
	//   21   40:aload_1         
	//   22   41:invokevirtual   #149 <Method Uri ShareMessengerURLActionButton.getUrl()>
	//   23   44:invokestatic    #152 <Method String Utility.getUriString(Uri)>
	//   24   47:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   26   51:aload_3         
	//   27   52:invokevirtual   #167 <Method String StringBuilder.toString()>
	//   28   55:astore_3        
		}
		Utility.putNonEmptyString(bundle, "TARGET_DISPLAY", ((String) (obj)));
	//   29   56:aload_0         
	//   30   57:ldc1            #169 <String "TARGET_DISPLAY">
	//   31   59:aload_3         
	//   32   60:invokestatic    #85  <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putUri(bundle, "ITEM_URL", sharemessengerurlactionbutton.getUrl());
	//   33   63:aload_0         
	//   34   64:ldc1            #171 <String "ITEM_URL">
	//   35   66:aload_1         
	//   36   67:invokevirtual   #149 <Method Uri ShareMessengerURLActionButton.getUrl()>
	//   37   70:invokestatic    #77  <Method void Utility.putUri(Bundle, String, Uri)>
	//   38   73:return          
	}

	private static String getImageRatioString(com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio imageaspectratio)
	{
		if(imageaspectratio == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "horizontal";
	//    2    4:ldc1            #175 <String "horizontal">
	//    3    6:areturn         
		static class _cls1
		{

			static final int $SwitchMap$com$facebook$share$model$ShareMessengerGenericTemplateContent$ImageAspectRatio[];
			static final int $SwitchMap$com$facebook$share$model$ShareMessengerMediaTemplateContent$MediaType[];
			static final int $SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio[];

			static 
			{
				$SwitchMap$com$facebook$share$model$ShareMessengerMediaTemplateContent$MediaType = new int[com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType.values().length];
			//    0    0:invokestatic    #20  <Method com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType[] com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #22  <Field int[] $SwitchMap$com$facebook$share$model$ShareMessengerMediaTemplateContent$MediaType>
				try
				{
					$SwitchMap$com$facebook$share$model$ShareMessengerMediaTemplateContent$MediaType[com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType.VIDEO.ordinal()] = 1;
			//    4    9:getstatic       #22  <Field int[] $SwitchMap$com$facebook$share$model$ShareMessengerMediaTemplateContent$MediaType>
			//    5   12:getstatic       #26  <Field com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType.VIDEO>
			//    6   15:invokevirtual   #30  <Method int com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:invokestatic    #35  <Method com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio[] com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio.values()>
			//*  10   23:arraylength     
			//*  11   24:newarray        int[]
			//*  12   26:putstatic       #37  <Field int[] $SwitchMap$com$facebook$share$model$ShareMessengerGenericTemplateContent$ImageAspectRatio>
			//*  13   29:getstatic       #37  <Field int[] $SwitchMap$com$facebook$share$model$ShareMessengerGenericTemplateContent$ImageAspectRatio>
			//*  14   32:getstatic       #41  <Field com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio.SQUARE>
			//*  15   35:invokevirtual   #42  <Method int com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio.ordinal()>
			//*  16   38:iconst_1        
			//*  17   39:iastore         
			//*  18   40:invokestatic    #47  <Method com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio[] com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio.values()>
			//*  19   43:arraylength     
			//*  20   44:newarray        int[]
			//*  21   46:putstatic       #49  <Field int[] $SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio>
			//*  22   49:getstatic       #49  <Field int[] $SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio>
			//*  23   52:getstatic       #53  <Field com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio.WebviewHeightRatioCompact>
			//*  24   55:invokevirtual   #54  <Method int com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio.ordinal()>
			//*  25   58:iconst_1        
			//*  26   59:iastore         
			//*  27   60:getstatic       #49  <Field int[] $SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio>
			//*  28   63:getstatic       #57  <Field com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio.WebviewHeightRatioTall>
			//*  29   66:invokevirtual   #54  <Method int com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio.ordinal()>
			//*  30   69:iconst_2        
			//*  31   70:iastore         
			//*  32   71:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   33   72:astore_0        
				$SwitchMap$com$facebook$share$model$ShareMessengerGenericTemplateContent$ImageAspectRatio = new int[com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio.values().length];
				try
				{
					$SwitchMap$com$facebook$share$model$ShareMessengerGenericTemplateContent$ImageAspectRatio[com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio.SQUARE.ordinal()] = 1;
				}
			//*  34   73:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   35   76:astore_0        
				$SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio = new int[com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.values().length];
				try
				{
					$SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio[com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.WebviewHeightRatioCompact.ordinal()] = 1;
				}
			//*  36   77:goto            40
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   37   80:astore_0        
				try
				{
					$SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio[com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.WebviewHeightRatioTall.ordinal()] = 2;
				}
			//*  38   81:goto            60
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   39   84:astore_0        
			//*  40   85:return          
			}
		}

		if(_cls1..SwitchMap.com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio[imageaspectratio.ordinal()] != 1)
	//*   4    7:getstatic       #179 <Field int[] MessengerShareContentUtility$1.$SwitchMap$com$facebook$share$model$ShareMessengerGenericTemplateContent$ImageAspectRatio>
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #185 <Method int com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio.ordinal()>
	//*   7   14:iaload          
	//*   8   15:iconst_1        
	//*   9   16:icmpeq          22
			return "horizontal";
	//   10   19:ldc1            #175 <String "horizontal">
	//   11   21:areturn         
		else
			return "square";
	//   12   22:ldc1            #187 <String "square">
	//   13   24:areturn         
	}

	private static String getMediaType(com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType mediatype)
	{
		if(mediatype == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "image";
	//    2    4:ldc1            #189 <String "image">
	//    3    6:areturn         
		if(_cls1..SwitchMap.com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType[mediatype.ordinal()] != 1)
	//*   4    7:getstatic       #192 <Field int[] MessengerShareContentUtility$1.$SwitchMap$com$facebook$share$model$ShareMessengerMediaTemplateContent$MediaType>
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #195 <Method int com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType.ordinal()>
	//*   7   14:iaload          
	//*   8   15:iconst_1        
	//*   9   16:icmpeq          22
			return "image";
	//   10   19:ldc1            #189 <String "image">
	//   11   21:areturn         
		else
			return "video";
	//   12   22:ldc1            #197 <String "video">
	//   13   24:areturn         
	}

	private static String getMediaUrlKey(Uri uri)
	{
		uri = ((Uri) (uri.getHost()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #202 <Method String Uri.getHost()>
	//    2    4:astore_0        
		if(!Utility.isNullOrEmpty(((String) (uri))) && FACEBOOK_DOMAIN.matcher(((CharSequence) (uri))).matches())
	//*   3    5:aload_0         
	//*   4    6:invokestatic    #206 <Method boolean Utility.isNullOrEmpty(String)>
	//*   5    9:ifne            28
	//*   6   12:getstatic       #20  <Field Pattern FACEBOOK_DOMAIN>
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #210 <Method Matcher Pattern.matcher(CharSequence)>
	//*   9   19:invokevirtual   #216 <Method boolean Matcher.matches()>
	//*  10   22:ifeq            28
			return "uri";
	//   11   25:ldc1            #218 <String "uri">
	//   12   27:areturn         
		else
			return "IMAGE";
	//   13   28:ldc1            #69  <String "IMAGE">
	//   14   30:areturn         
	}

	private static String getShouldHideShareButton(ShareMessengerURLActionButton sharemessengerurlactionbutton)
	{
		if(sharemessengerurlactionbutton.getShouldHideWebviewShareButton())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #223 <Method boolean ShareMessengerURLActionButton.getShouldHideWebviewShareButton()>
	//*   2    4:ifeq            10
			return "hide";
	//    3    7:ldc1            #225 <String "hide">
	//    4    9:areturn         
		else
			return null;
	//    5   10:aconst_null     
	//    6   11:areturn         
	}

	private static String getWebviewHeightRatioString(com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio webviewheightratio)
	{
		if(webviewheightratio == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "full";
	//    2    4:ldc1            #229 <String "full">
	//    3    6:areturn         
		switch(_cls1..SwitchMap.com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio[webviewheightratio.ordinal()])
	//*   4    7:getstatic       #232 <Field int[] MessengerShareContentUtility$1.$SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio>
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #235 <Method int com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio.ordinal()>
	//*   7   14:iaload          
		{
	//*   8   15:tableswitch     1 2: default 36
	//	               1 42
	//	               2 39
		default:
			return "full";
	//    9   36:ldc1            #229 <String "full">
	//   10   38:areturn         

		case 2: // '\002'
			return "tall";
	//   11   39:ldc1            #237 <String "tall">
	//   12   41:areturn         

		case 1: // '\001'
			return "compact";
	//   13   42:ldc1            #239 <String "compact">
	//   14   44:areturn         
		}
	}

	private static JSONObject serializeActionButton(ShareMessengerActionButton sharemessengeractionbutton)
		throws JSONException
	{
		return serializeActionButton(sharemessengeractionbutton, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #244 <Method JSONObject serializeActionButton(ShareMessengerActionButton, boolean)>
	//    3    5:areturn         
	}

	private static JSONObject serializeActionButton(ShareMessengerActionButton sharemessengeractionbutton, boolean flag)
		throws JSONException
	{
		if(sharemessengeractionbutton instanceof ShareMessengerURLActionButton)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #27  <Class ShareMessengerURLActionButton>
	//*   2    4:ifeq            16
			return serializeURLActionButton((ShareMessengerURLActionButton)sharemessengeractionbutton, flag);
	//    3    7:aload_0         
	//    4    8:checkcast       #27  <Class ShareMessengerURLActionButton>
	//    5   11:iload_1         
	//    6   12:invokestatic    #248 <Method JSONObject serializeURLActionButton(ShareMessengerURLActionButton, boolean)>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	private static JSONObject serializeGenericTemplateContent(ShareMessengerGenericTemplateContent sharemessengergenerictemplatecontent)
		throws JSONException
	{
		JSONArray jsonarray = (new JSONArray()).put(((Object) (serializeGenericTemplateElement(sharemessengergenerictemplatecontent.getGenericTemplateElement()))));
	//    0    0:new             #250 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #251 <Method void JSONArray()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #40  <Method ShareMessengerGenericTemplateElement ShareMessengerGenericTemplateContent.getGenericTemplateElement()>
	//    5   11:invokestatic    #255 <Method JSONObject serializeGenericTemplateElement(ShareMessengerGenericTemplateElement)>
	//    6   14:invokevirtual   #259 <Method JSONArray JSONArray.put(Object)>
	//    7   17:astore_1        
		sharemessengergenerictemplatecontent = ((ShareMessengerGenericTemplateContent) ((new JSONObject()).put("template_type", "generic").put("sharable", sharemessengergenerictemplatecontent.getIsSharable()).put("image_aspect_ratio", ((Object) (getImageRatioString(sharemessengergenerictemplatecontent.getImageAspectRatio())))).put("elements", ((Object) (jsonarray)))));
	//    8   18:new             #261 <Class JSONObject>
	//    9   21:dup             
	//   10   22:invokespecial   #262 <Method void JSONObject()>
	//   11   25:ldc2            #264 <String "template_type">
	//   12   28:ldc2            #266 <String "generic">
	//   13   31:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   14   34:ldc2            #271 <String "sharable">
	//   15   37:aload_0         
	//   16   38:invokevirtual   #274 <Method boolean ShareMessengerGenericTemplateContent.getIsSharable()>
	//   17   41:invokevirtual   #277 <Method JSONObject JSONObject.put(String, boolean)>
	//   18   44:ldc2            #279 <String "image_aspect_ratio">
	//   19   47:aload_0         
	//   20   48:invokevirtual   #283 <Method com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio ShareMessengerGenericTemplateContent.getImageAspectRatio()>
	//   21   51:invokestatic    #285 <Method String getImageRatioString(com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio)>
	//   22   54:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   23   57:ldc2            #287 <String "elements">
	//   24   60:aload_1         
	//   25   61:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   26   64:astore_0        
		sharemessengergenerictemplatecontent = ((ShareMessengerGenericTemplateContent) ((new JSONObject()).put("type", "template").put("payload", ((Object) (sharemessengergenerictemplatecontent)))));
	//   27   65:new             #261 <Class JSONObject>
	//   28   68:dup             
	//   29   69:invokespecial   #262 <Method void JSONObject()>
	//   30   72:ldc1            #122 <String "type">
	//   31   74:ldc2            #289 <String "template">
	//   32   77:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   33   80:ldc2            #291 <String "payload">
	//   34   83:aload_0         
	//   35   84:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   36   87:astore_0        
		return (new JSONObject()).put("attachment", ((Object) (sharemessengergenerictemplatecontent)));
	//   37   88:new             #261 <Class JSONObject>
	//   38   91:dup             
	//   39   92:invokespecial   #262 <Method void JSONObject()>
	//   40   95:ldc2            #293 <String "attachment">
	//   41   98:aload_0         
	//   42   99:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   43  102:areturn         
	}

	private static JSONObject serializeGenericTemplateElement(ShareMessengerGenericTemplateElement sharemessengergenerictemplateelement)
		throws JSONException
	{
		JSONObject jsonobject = (new JSONObject()).put("title", ((Object) (sharemessengergenerictemplateelement.getTitle()))).put("subtitle", ((Object) (sharemessengergenerictemplateelement.getSubtitle()))).put("image_url", ((Object) (Utility.getUriString(sharemessengergenerictemplateelement.getImageUrl()))));
	//    0    0:new             #261 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #262 <Method void JSONObject()>
	//    3    7:ldc2            #295 <String "title">
	//    4   10:aload_0         
	//    5   11:invokevirtual   #91  <Method String ShareMessengerGenericTemplateElement.getTitle()>
	//    6   14:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//    7   17:ldc2            #297 <String "subtitle">
	//    8   20:aload_0         
	//    9   21:invokevirtual   #96  <Method String ShareMessengerGenericTemplateElement.getSubtitle()>
	//   10   24:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   11   27:ldc2            #299 <String "image_url">
	//   12   30:aload_0         
	//   13   31:invokevirtual   #73  <Method Uri ShareMessengerGenericTemplateElement.getImageUrl()>
	//   14   34:invokestatic    #152 <Method String Utility.getUriString(Uri)>
	//   15   37:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   16   40:astore_1        
		if(sharemessengergenerictemplateelement.getButton() != null)
	//*  17   41:aload_0         
	//*  18   42:invokevirtual   #62  <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getButton()>
	//*  19   45:ifnull          77
		{
			JSONArray jsonarray = new JSONArray();
	//   20   48:new             #250 <Class JSONArray>
	//   21   51:dup             
	//   22   52:invokespecial   #251 <Method void JSONArray()>
	//   23   55:astore_2        
			jsonarray.put(((Object) (serializeActionButton(sharemessengergenerictemplateelement.getButton()))));
	//   24   56:aload_2         
	//   25   57:aload_0         
	//   26   58:invokevirtual   #62  <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getButton()>
	//   27   61:invokestatic    #301 <Method JSONObject serializeActionButton(ShareMessengerActionButton)>
	//   28   64:invokevirtual   #259 <Method JSONArray JSONArray.put(Object)>
	//   29   67:pop             
			jsonobject.put("buttons", ((Object) (jsonarray)));
	//   30   68:aload_1         
	//   31   69:ldc2            #303 <String "buttons">
	//   32   72:aload_2         
	//   33   73:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   34   76:pop             
		}
		if(sharemessengergenerictemplateelement.getDefaultAction() != null)
	//*  35   77:aload_0         
	//*  36   78:invokevirtual   #67  <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getDefaultAction()>
	//*  37   81:ifnull          100
			jsonobject.put("default_action", ((Object) (serializeActionButton(sharemessengergenerictemplateelement.getDefaultAction(), true))));
	//   38   84:aload_1         
	//   39   85:ldc2            #305 <String "default_action">
	//   40   88:aload_0         
	//   41   89:invokevirtual   #67  <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getDefaultAction()>
	//   42   92:iconst_1        
	//   43   93:invokestatic    #244 <Method JSONObject serializeActionButton(ShareMessengerActionButton, boolean)>
	//   44   96:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   45   99:pop             
		return jsonobject;
	//   46  100:aload_1         
	//   47  101:areturn         
	}

	private static JSONObject serializeMediaTemplateContent(ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent)
		throws JSONException
	{
		sharemessengermediatemplatecontent = ((ShareMessengerMediaTemplateContent) ((new JSONArray()).put(((Object) (serializeMediaTemplateElement(sharemessengermediatemplatecontent))))));
	//    0    0:new             #250 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #251 <Method void JSONArray()>
	//    3    7:aload_0         
	//    4    8:invokestatic    #308 <Method JSONObject serializeMediaTemplateElement(ShareMessengerMediaTemplateContent)>
	//    5   11:invokevirtual   #259 <Method JSONArray JSONArray.put(Object)>
	//    6   14:astore_0        
		sharemessengermediatemplatecontent = ((ShareMessengerMediaTemplateContent) ((new JSONObject()).put("template_type", "media").put("elements", ((Object) (sharemessengermediatemplatecontent)))));
	//    7   15:new             #261 <Class JSONObject>
	//    8   18:dup             
	//    9   19:invokespecial   #262 <Method void JSONObject()>
	//   10   22:ldc2            #264 <String "template_type">
	//   11   25:ldc2            #310 <String "media">
	//   12   28:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   13   31:ldc2            #287 <String "elements">
	//   14   34:aload_0         
	//   15   35:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   16   38:astore_0        
		sharemessengermediatemplatecontent = ((ShareMessengerMediaTemplateContent) ((new JSONObject()).put("type", "template").put("payload", ((Object) (sharemessengermediatemplatecontent)))));
	//   17   39:new             #261 <Class JSONObject>
	//   18   42:dup             
	//   19   43:invokespecial   #262 <Method void JSONObject()>
	//   20   46:ldc1            #122 <String "type">
	//   21   48:ldc2            #289 <String "template">
	//   22   51:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   23   54:ldc2            #291 <String "payload">
	//   24   57:aload_0         
	//   25   58:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   26   61:astore_0        
		return (new JSONObject()).put("attachment", ((Object) (sharemessengermediatemplatecontent)));
	//   27   62:new             #261 <Class JSONObject>
	//   28   65:dup             
	//   29   66:invokespecial   #262 <Method void JSONObject()>
	//   30   69:ldc2            #293 <String "attachment">
	//   31   72:aload_0         
	//   32   73:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   33   76:areturn         
	}

	private static JSONObject serializeMediaTemplateElement(ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent)
		throws JSONException
	{
		JSONObject jsonobject = (new JSONObject()).put("attachment_id", ((Object) (sharemessengermediatemplatecontent.getAttachmentId()))).put("url", ((Object) (Utility.getUriString(sharemessengermediatemplatecontent.getMediaUrl())))).put("media_type", ((Object) (getMediaType(sharemessengermediatemplatecontent.getMediaType()))));
	//    0    0:new             #261 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #262 <Method void JSONObject()>
	//    3    7:ldc2            #312 <String "attachment_id">
	//    4   10:aload_0         
	//    5   11:invokevirtual   #113 <Method String ShareMessengerMediaTemplateContent.getAttachmentId()>
	//    6   14:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//    7   17:ldc2            #314 <String "url">
	//    8   20:aload_0         
	//    9   21:invokevirtual   #116 <Method Uri ShareMessengerMediaTemplateContent.getMediaUrl()>
	//   10   24:invokestatic    #152 <Method String Utility.getUriString(Uri)>
	//   11   27:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   12   30:ldc2            #316 <String "media_type">
	//   13   33:aload_0         
	//   14   34:invokevirtual   #126 <Method com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType ShareMessengerMediaTemplateContent.getMediaType()>
	//   15   37:invokestatic    #129 <Method String getMediaType(com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType)>
	//   16   40:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   17   43:astore_1        
		if(sharemessengermediatemplatecontent.getButton() != null)
	//*  18   44:aload_0         
	//*  19   45:invokevirtual   #108 <Method ShareMessengerActionButton ShareMessengerMediaTemplateContent.getButton()>
	//*  20   48:ifnull          80
		{
			JSONArray jsonarray = new JSONArray();
	//   21   51:new             #250 <Class JSONArray>
	//   22   54:dup             
	//   23   55:invokespecial   #251 <Method void JSONArray()>
	//   24   58:astore_2        
			jsonarray.put(((Object) (serializeActionButton(sharemessengermediatemplatecontent.getButton()))));
	//   25   59:aload_2         
	//   26   60:aload_0         
	//   27   61:invokevirtual   #108 <Method ShareMessengerActionButton ShareMessengerMediaTemplateContent.getButton()>
	//   28   64:invokestatic    #301 <Method JSONObject serializeActionButton(ShareMessengerActionButton)>
	//   29   67:invokevirtual   #259 <Method JSONArray JSONArray.put(Object)>
	//   30   70:pop             
			jsonobject.put("buttons", ((Object) (jsonarray)));
	//   31   71:aload_1         
	//   32   72:ldc2            #303 <String "buttons">
	//   33   75:aload_2         
	//   34   76:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   35   79:pop             
		}
		return jsonobject;
	//   36   80:aload_1         
	//   37   81:areturn         
	}

	private static JSONObject serializeOpenGraphMusicTemplateContent(ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent)
		throws JSONException
	{
		sharemessengeropengraphmusictemplatecontent = ((ShareMessengerOpenGraphMusicTemplateContent) ((new JSONArray()).put(((Object) (serializeOpenGraphMusicTemplateElement(sharemessengeropengraphmusictemplatecontent))))));
	//    0    0:new             #250 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #251 <Method void JSONArray()>
	//    3    7:aload_0         
	//    4    8:invokestatic    #319 <Method JSONObject serializeOpenGraphMusicTemplateElement(ShareMessengerOpenGraphMusicTemplateContent)>
	//    5   11:invokevirtual   #259 <Method JSONArray JSONArray.put(Object)>
	//    6   14:astore_0        
		sharemessengeropengraphmusictemplatecontent = ((ShareMessengerOpenGraphMusicTemplateContent) ((new JSONObject()).put("template_type", "open_graph").put("elements", ((Object) (sharemessengeropengraphmusictemplatecontent)))));
	//    7   15:new             #261 <Class JSONObject>
	//    8   18:dup             
	//    9   19:invokespecial   #262 <Method void JSONObject()>
	//   10   22:ldc2            #264 <String "template_type">
	//   11   25:ldc2            #321 <String "open_graph">
	//   12   28:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   13   31:ldc2            #287 <String "elements">
	//   14   34:aload_0         
	//   15   35:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   16   38:astore_0        
		sharemessengeropengraphmusictemplatecontent = ((ShareMessengerOpenGraphMusicTemplateContent) ((new JSONObject()).put("type", "template").put("payload", ((Object) (sharemessengeropengraphmusictemplatecontent)))));
	//   17   39:new             #261 <Class JSONObject>
	//   18   42:dup             
	//   19   43:invokespecial   #262 <Method void JSONObject()>
	//   20   46:ldc1            #122 <String "type">
	//   21   48:ldc2            #289 <String "template">
	//   22   51:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   23   54:ldc2            #291 <String "payload">
	//   24   57:aload_0         
	//   25   58:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   26   61:astore_0        
		return (new JSONObject()).put("attachment", ((Object) (sharemessengeropengraphmusictemplatecontent)));
	//   27   62:new             #261 <Class JSONObject>
	//   28   65:dup             
	//   29   66:invokespecial   #262 <Method void JSONObject()>
	//   30   69:ldc2            #293 <String "attachment">
	//   31   72:aload_0         
	//   32   73:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   33   76:areturn         
	}

	private static JSONObject serializeOpenGraphMusicTemplateElement(ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent)
		throws JSONException
	{
		JSONObject jsonobject = (new JSONObject()).put("url", ((Object) (Utility.getUriString(sharemessengeropengraphmusictemplatecontent.getUrl()))));
	//    0    0:new             #261 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #262 <Method void JSONObject()>
	//    3    7:ldc2            #314 <String "url">
	//    4   10:aload_0         
	//    5   11:invokevirtual   #148 <Method Uri ShareMessengerOpenGraphMusicTemplateContent.getUrl()>
	//    6   14:invokestatic    #152 <Method String Utility.getUriString(Uri)>
	//    7   17:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//    8   20:astore_1        
		if(sharemessengeropengraphmusictemplatecontent.getButton() != null)
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #141 <Method ShareMessengerActionButton ShareMessengerOpenGraphMusicTemplateContent.getButton()>
	//*  11   25:ifnull          57
		{
			JSONArray jsonarray = new JSONArray();
	//   12   28:new             #250 <Class JSONArray>
	//   13   31:dup             
	//   14   32:invokespecial   #251 <Method void JSONArray()>
	//   15   35:astore_2        
			jsonarray.put(((Object) (serializeActionButton(sharemessengeropengraphmusictemplatecontent.getButton()))));
	//   16   36:aload_2         
	//   17   37:aload_0         
	//   18   38:invokevirtual   #141 <Method ShareMessengerActionButton ShareMessengerOpenGraphMusicTemplateContent.getButton()>
	//   19   41:invokestatic    #301 <Method JSONObject serializeActionButton(ShareMessengerActionButton)>
	//   20   44:invokevirtual   #259 <Method JSONArray JSONArray.put(Object)>
	//   21   47:pop             
			jsonobject.put("buttons", ((Object) (jsonarray)));
	//   22   48:aload_1         
	//   23   49:ldc2            #303 <String "buttons">
	//   24   52:aload_2         
	//   25   53:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   26   56:pop             
		}
		return jsonobject;
	//   27   57:aload_1         
	//   28   58:areturn         
	}

	private static JSONObject serializeURLActionButton(ShareMessengerURLActionButton sharemessengerurlactionbutton, boolean flag)
		throws JSONException
	{
		JSONObject jsonobject = (new JSONObject()).put("type", "web_url");
	//    0    0:new             #261 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #262 <Method void JSONObject()>
	//    3    7:ldc1            #122 <String "type">
	//    4    9:ldc2            #323 <String "web_url">
	//    5   12:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//    6   15:astore_3        
		String s;
		if(flag)
	//*   7   16:iload_1         
	//*   8   17:ifeq            25
			s = null;
	//    9   20:aconst_null     
	//   10   21:astore_2        
		else
	//*  11   22:goto            30
			s = sharemessengerurlactionbutton.getTitle();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #158 <Method String ShareMessengerURLActionButton.getTitle()>
	//   14   29:astore_2        
		return jsonobject.put("title", ((Object) (s))).put("url", ((Object) (Utility.getUriString(sharemessengerurlactionbutton.getUrl())))).put("webview_height_ratio", ((Object) (getWebviewHeightRatioString(sharemessengerurlactionbutton.getWebviewHeightRatio())))).put("messenger_extensions", sharemessengerurlactionbutton.getIsMessengerExtensionURL()).put("fallback_url", ((Object) (Utility.getUriString(sharemessengerurlactionbutton.getFallbackUrl())))).put("webview_share_button", ((Object) (getShouldHideShareButton(sharemessengerurlactionbutton))));
	//   15   30:aload_3         
	//   16   31:ldc2            #295 <String "title">
	//   17   34:aload_2         
	//   18   35:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   19   38:ldc2            #314 <String "url">
	//   20   41:aload_0         
	//   21   42:invokevirtual   #149 <Method Uri ShareMessengerURLActionButton.getUrl()>
	//   22   45:invokestatic    #152 <Method String Utility.getUriString(Uri)>
	//   23   48:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   24   51:ldc2            #325 <String "webview_height_ratio">
	//   25   54:aload_0         
	//   26   55:invokevirtual   #329 <Method com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio ShareMessengerURLActionButton.getWebviewHeightRatio()>
	//   27   58:invokestatic    #331 <Method String getWebviewHeightRatioString(com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio)>
	//   28   61:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   29   64:ldc2            #333 <String "messenger_extensions">
	//   30   67:aload_0         
	//   31   68:invokevirtual   #336 <Method boolean ShareMessengerURLActionButton.getIsMessengerExtensionURL()>
	//   32   71:invokevirtual   #277 <Method JSONObject JSONObject.put(String, boolean)>
	//   33   74:ldc2            #338 <String "fallback_url">
	//   34   77:aload_0         
	//   35   78:invokevirtual   #341 <Method Uri ShareMessengerURLActionButton.getFallbackUrl()>
	//   36   81:invokestatic    #152 <Method String Utility.getUriString(Uri)>
	//   37   84:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   38   87:ldc2            #343 <String "webview_share_button">
	//   39   90:aload_0         
	//   40   91:invokestatic    #345 <Method String getShouldHideShareButton(ShareMessengerURLActionButton)>
	//   41   94:invokevirtual   #269 <Method JSONObject JSONObject.put(String, Object)>
	//   42   97:areturn         
	}

	public static final Pattern FACEBOOK_DOMAIN = Pattern.compile("^(.+)\\.(facebook\\.com)$");

	static 
	{
	//    0    0:ldc1            #12  <String "^(.+)\\.(facebook\\.com)$">
	//    1    2:invokestatic    #18  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #20  <Field Pattern FACEBOOK_DOMAIN>
	//*   3    8:return          
	}
}
