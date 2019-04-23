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

	public MessengerShareContentUtility()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #128 <Method void Object()>
	//    2    4:return          
	}

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
	//*   4    6:instanceof      #134 <Class ShareMessengerURLActionButton>
	//*   5    9:ifeq            21
			addURLActionButton(bundle, (ShareMessengerURLActionButton)sharemessengeractionbutton, flag);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #134 <Class ShareMessengerURLActionButton>
	//    9   17:iload_2         
	//   10   18:invokestatic    #138 <Method void addURLActionButton(Bundle, ShareMessengerURLActionButton, boolean)>
	//   11   21:return          
	}

	public static void addGenericTemplateContent(Bundle bundle, ShareMessengerGenericTemplateContent sharemessengergenerictemplatecontent)
		throws JSONException
	{
		addGenericTemplateElementForPreview(bundle, sharemessengergenerictemplatecontent.getGenericTemplateElement());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #147 <Method ShareMessengerGenericTemplateElement ShareMessengerGenericTemplateContent.getGenericTemplateElement()>
	//    3    5:invokestatic    #151 <Method void addGenericTemplateElementForPreview(Bundle, ShareMessengerGenericTemplateElement)>
		Utility.putJSONValueInBundle(bundle, "MESSENGER_PLATFORM_CONTENT", ((Object) (serializeGenericTemplateContent(sharemessengergenerictemplatecontent))));
	//    4    8:aload_0         
	//    5    9:ldc1            #153 <String "MESSENGER_PLATFORM_CONTENT">
	//    6   11:aload_1         
	//    7   12:invokestatic    #157 <Method JSONObject serializeGenericTemplateContent(ShareMessengerGenericTemplateContent)>
	//    8   15:invokestatic    #163 <Method boolean Utility.putJSONValueInBundle(Bundle, String, Object)>
	//    9   18:pop             
	//   10   19:return          
	}

	private static void addGenericTemplateElementForPreview(Bundle bundle, ShareMessengerGenericTemplateElement sharemessengergenerictemplateelement)
		throws JSONException
	{
		if(sharemessengergenerictemplateelement.getButton() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #169 <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getButton()>
	//*   2    4:ifnull          19
			addActionButton(bundle, sharemessengergenerictemplateelement.getButton(), false);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #169 <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getButton()>
	//    6   12:iconst_0        
	//    7   13:invokestatic    #171 <Method void addActionButton(Bundle, ShareMessengerActionButton, boolean)>
		else
	//*   8   16:goto            35
		if(sharemessengergenerictemplateelement.getDefaultAction() != null)
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #174 <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getDefaultAction()>
	//*  11   23:ifnull          35
			addActionButton(bundle, sharemessengergenerictemplateelement.getDefaultAction(), true);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #174 <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getDefaultAction()>
	//   15   31:iconst_1        
	//   16   32:invokestatic    #171 <Method void addActionButton(Bundle, ShareMessengerActionButton, boolean)>
		Utility.putUri(bundle, "IMAGE", sharemessengergenerictemplateelement.getImageUrl());
	//   17   35:aload_0         
	//   18   36:ldc1            #176 <String "IMAGE">
	//   19   38:aload_1         
	//   20   39:invokevirtual   #180 <Method Uri ShareMessengerGenericTemplateElement.getImageUrl()>
	//   21   42:invokestatic    #184 <Method void Utility.putUri(Bundle, String, Uri)>
		Utility.putNonEmptyString(bundle, "PREVIEW_TYPE", "DEFAULT");
	//   22   45:aload_0         
	//   23   46:ldc1            #186 <String "PREVIEW_TYPE">
	//   24   48:ldc1            #67  <String "DEFAULT">
	//   25   50:invokestatic    #190 <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "TITLE", sharemessengergenerictemplateelement.getTitle());
	//   26   53:aload_0         
	//   27   54:ldc1            #191 <String "TITLE">
	//   28   56:aload_1         
	//   29   57:invokevirtual   #195 <Method String ShareMessengerGenericTemplateElement.getTitle()>
	//   30   60:invokestatic    #190 <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "SUBTITLE", sharemessengergenerictemplateelement.getSubtitle());
	//   31   63:aload_0         
	//   32   64:ldc1            #196 <String "SUBTITLE">
	//   33   66:aload_1         
	//   34   67:invokevirtual   #199 <Method String ShareMessengerGenericTemplateElement.getSubtitle()>
	//   35   70:invokestatic    #190 <Method void Utility.putNonEmptyString(Bundle, String, String)>
	//   36   73:return          
	}

	public static void addMediaTemplateContent(Bundle bundle, ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent)
		throws JSONException
	{
		addMediaTemplateContentForPreview(bundle, sharemessengermediatemplatecontent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #204 <Method void addMediaTemplateContentForPreview(Bundle, ShareMessengerMediaTemplateContent)>
		Utility.putJSONValueInBundle(bundle, "MESSENGER_PLATFORM_CONTENT", ((Object) (serializeMediaTemplateContent(sharemessengermediatemplatecontent))));
	//    3    5:aload_0         
	//    4    6:ldc1            #153 <String "MESSENGER_PLATFORM_CONTENT">
	//    5    8:aload_1         
	//    6    9:invokestatic    #208 <Method JSONObject serializeMediaTemplateContent(ShareMessengerMediaTemplateContent)>
	//    7   12:invokestatic    #163 <Method boolean Utility.putJSONValueInBundle(Bundle, String, Object)>
	//    8   15:pop             
	//    9   16:return          
	}

	private static void addMediaTemplateContentForPreview(Bundle bundle, ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent)
		throws JSONException
	{
		addActionButton(bundle, sharemessengermediatemplatecontent.getButton(), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #211 <Method ShareMessengerActionButton ShareMessengerMediaTemplateContent.getButton()>
	//    3    5:iconst_0        
	//    4    6:invokestatic    #171 <Method void addActionButton(Bundle, ShareMessengerActionButton, boolean)>
		Utility.putNonEmptyString(bundle, "PREVIEW_TYPE", "DEFAULT");
	//    5    9:aload_0         
	//    6   10:ldc1            #186 <String "PREVIEW_TYPE">
	//    7   12:ldc1            #67  <String "DEFAULT">
	//    8   14:invokestatic    #190 <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putNonEmptyString(bundle, "ATTACHMENT_ID", sharemessengermediatemplatecontent.getAttachmentId());
	//    9   17:aload_0         
	//   10   18:ldc1            #212 <String "ATTACHMENT_ID">
	//   11   20:aload_1         
	//   12   21:invokevirtual   #215 <Method String ShareMessengerMediaTemplateContent.getAttachmentId()>
	//   13   24:invokestatic    #190 <Method void Utility.putNonEmptyString(Bundle, String, String)>
		if(sharemessengermediatemplatecontent.getMediaUrl() != null)
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #218 <Method Uri ShareMessengerMediaTemplateContent.getMediaUrl()>
	//*  16   31:ifnull          49
			Utility.putUri(bundle, getMediaUrlKey(sharemessengermediatemplatecontent.getMediaUrl()), sharemessengermediatemplatecontent.getMediaUrl());
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokevirtual   #218 <Method Uri ShareMessengerMediaTemplateContent.getMediaUrl()>
	//   20   39:invokestatic    #222 <Method String getMediaUrlKey(Uri)>
	//   21   42:aload_1         
	//   22   43:invokevirtual   #218 <Method Uri ShareMessengerMediaTemplateContent.getMediaUrl()>
	//   23   46:invokestatic    #184 <Method void Utility.putUri(Bundle, String, Uri)>
		Utility.putNonEmptyString(bundle, "type", getMediaType(sharemessengermediatemplatecontent.getMediaType()));
	//   24   49:aload_0         
	//   25   50:ldc1            #22  <String "type">
	//   26   52:aload_1         
	//   27   53:invokevirtual   #226 <Method com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType ShareMessengerMediaTemplateContent.getMediaType()>
	//   28   56:invokestatic    #229 <Method String getMediaType(com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType)>
	//   29   59:invokestatic    #190 <Method void Utility.putNonEmptyString(Bundle, String, String)>
	//   30   62:return          
	}

	public static void addOpenGraphMusicTemplateContent(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent)
		throws JSONException
	{
		addOpenGraphMusicTemplateContentForPreview(bundle, sharemessengeropengraphmusictemplatecontent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #234 <Method void addOpenGraphMusicTemplateContentForPreview(Bundle, ShareMessengerOpenGraphMusicTemplateContent)>
		Utility.putJSONValueInBundle(bundle, "MESSENGER_PLATFORM_CONTENT", ((Object) (serializeOpenGraphMusicTemplateContent(sharemessengeropengraphmusictemplatecontent))));
	//    3    5:aload_0         
	//    4    6:ldc1            #153 <String "MESSENGER_PLATFORM_CONTENT">
	//    5    8:aload_1         
	//    6    9:invokestatic    #238 <Method JSONObject serializeOpenGraphMusicTemplateContent(ShareMessengerOpenGraphMusicTemplateContent)>
	//    7   12:invokestatic    #163 <Method boolean Utility.putJSONValueInBundle(Bundle, String, Object)>
	//    8   15:pop             
	//    9   16:return          
	}

	private static void addOpenGraphMusicTemplateContentForPreview(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent)
		throws JSONException
	{
		addActionButton(bundle, sharemessengeropengraphmusictemplatecontent.getButton(), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #241 <Method ShareMessengerActionButton ShareMessengerOpenGraphMusicTemplateContent.getButton()>
	//    3    5:iconst_0        
	//    4    6:invokestatic    #171 <Method void addActionButton(Bundle, ShareMessengerActionButton, boolean)>
		Utility.putNonEmptyString(bundle, "PREVIEW_TYPE", "OPEN_GRAPH");
	//    5    9:aload_0         
	//    6   10:ldc1            #186 <String "PREVIEW_TYPE">
	//    7   12:ldc1            #70  <String "OPEN_GRAPH">
	//    8   14:invokestatic    #190 <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putUri(bundle, "OPEN_GRAPH_URL", sharemessengeropengraphmusictemplatecontent.getUrl());
	//    9   17:aload_0         
	//   10   18:ldc1            #243 <String "OPEN_GRAPH_URL">
	//   11   20:aload_1         
	//   12   21:invokevirtual   #246 <Method Uri ShareMessengerOpenGraphMusicTemplateContent.getUrl()>
	//   13   24:invokestatic    #184 <Method void Utility.putUri(Bundle, String, Uri)>
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
	//    3    5:invokevirtual   #247 <Method Uri ShareMessengerURLActionButton.getUrl()>
	//    4    8:invokestatic    #250 <Method String Utility.getUriString(Uri)>
	//    5   11:astore_3        
		} else
	//*   6   12:goto            57
		{
			obj = ((Object) (new StringBuilder()));
	//    7   15:new             #252 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #253 <Method void StringBuilder()>
	//   10   22:astore_3        
			((StringBuilder) (obj)).append(sharemessengerurlactionbutton.getTitle());
	//   11   23:aload_3         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #254 <Method String ShareMessengerURLActionButton.getTitle()>
	//   14   28:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
			((StringBuilder) (obj)).append(" - ");
	//   16   32:aload_3         
	//   17   33:ldc2            #260 <String " - ">
	//   18   36:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
			((StringBuilder) (obj)).append(Utility.getUriString(sharemessengerurlactionbutton.getUrl()));
	//   20   40:aload_3         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #247 <Method Uri ShareMessengerURLActionButton.getUrl()>
	//   23   45:invokestatic    #250 <Method String Utility.getUriString(Uri)>
	//   24   48:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   26   52:aload_3         
	//   27   53:invokevirtual   #263 <Method String StringBuilder.toString()>
	//   28   56:astore_3        
		}
		Utility.putNonEmptyString(bundle, "TARGET_DISPLAY", ((String) (obj)));
	//   29   57:aload_0         
	//   30   58:ldc2            #265 <String "TARGET_DISPLAY">
	//   31   61:aload_3         
	//   32   62:invokestatic    #190 <Method void Utility.putNonEmptyString(Bundle, String, String)>
		Utility.putUri(bundle, "ITEM_URL", sharemessengerurlactionbutton.getUrl());
	//   33   65:aload_0         
	//   34   66:ldc2            #267 <String "ITEM_URL">
	//   35   69:aload_1         
	//   36   70:invokevirtual   #247 <Method Uri ShareMessengerURLActionButton.getUrl()>
	//   37   73:invokestatic    #184 <Method void Utility.putUri(Bundle, String, Uri)>
	//   38   76:return          
	}

	private static String getImageRatioString(com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio imageaspectratio)
	{
		if(imageaspectratio == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "horizontal";
	//    2    4:ldc1            #46  <String "horizontal">
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
	//*   4    7:getstatic       #273 <Field int[] MessengerShareContentUtility$1.$SwitchMap$com$facebook$share$model$ShareMessengerGenericTemplateContent$ImageAspectRatio>
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #279 <Method int com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio.ordinal()>
	//*   7   14:iaload          
	//*   8   15:iconst_1        
	//*   9   16:icmpeq          22
			return "horizontal";
	//   10   19:ldc1            #46  <String "horizontal">
	//   11   21:areturn         
		else
			return "square";
	//   12   22:ldc1            #49  <String "square">
	//   13   24:areturn         
	}

	private static String getMediaType(com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType mediatype)
	{
		if(mediatype == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "image";
	//    2    4:ldc1            #55  <String "image">
	//    3    6:areturn         
		if(_cls1..SwitchMap.com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType[mediatype.ordinal()] != 1)
	//*   4    7:getstatic       #282 <Field int[] MessengerShareContentUtility$1.$SwitchMap$com$facebook$share$model$ShareMessengerMediaTemplateContent$MediaType>
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #285 <Method int com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType.ordinal()>
	//*   7   14:iaload          
	//*   8   15:iconst_1        
	//*   9   16:icmpeq          22
			return "image";
	//   10   19:ldc1            #55  <String "image">
	//   11   21:areturn         
		else
			return "video";
	//   12   22:ldc1            #61  <String "video">
	//   13   24:areturn         
	}

	private static String getMediaUrlKey(Uri uri)
	{
		uri = ((Uri) (uri.getHost()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #290 <Method String Uri.getHost()>
	//    2    4:astore_0        
		if(!Utility.isNullOrEmpty(((String) (uri))) && FACEBOOK_DOMAIN.matcher(((CharSequence) (uri))).matches())
	//*   3    5:aload_0         
	//*   4    6:invokestatic    #294 <Method boolean Utility.isNullOrEmpty(String)>
	//*   5    9:ifne            29
	//*   6   12:getstatic       #124 <Field Pattern FACEBOOK_DOMAIN>
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #298 <Method Matcher Pattern.matcher(CharSequence)>
	//*   9   19:invokevirtual   #304 <Method boolean Matcher.matches()>
	//*  10   22:ifeq            29
			return "uri";
	//   11   25:ldc2            #306 <String "uri">
	//   12   28:areturn         
		else
			return "IMAGE";
	//   13   29:ldc1            #176 <String "IMAGE">
	//   14   31:areturn         
	}

	private static String getShouldHideShareButton(ShareMessengerURLActionButton sharemessengerurlactionbutton)
	{
		if(sharemessengerurlactionbutton.getShouldHideWebviewShareButton())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #311 <Method boolean ShareMessengerURLActionButton.getShouldHideWebviewShareButton()>
	//*   2    4:ifeq            10
			return "hide";
	//    3    7:ldc1            #76  <String "hide">
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
	//    2    4:ldc1            #106 <String "full">
	//    3    6:areturn         
		switch(_cls1..SwitchMap.com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio[webviewheightratio.ordinal()])
	//*   4    7:getstatic       #316 <Field int[] MessengerShareContentUtility$1.$SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio>
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #319 <Method int com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio.ordinal()>
	//*   7   14:iaload          
		{
	//*   8   15:tableswitch     1 2: default 36
	//	               1 42
	//	               2 39
		default:
			return "full";
	//    9   36:ldc1            #106 <String "full">
	//   10   38:areturn         

		case 2: // '\002'
			return "tall";
	//   11   39:ldc1            #109 <String "tall">
	//   12   41:areturn         

		case 1: // '\001'
			return "compact";
	//   13   42:ldc1            #103 <String "compact">
	//   14   44:areturn         
		}
	}

	private static JSONObject serializeActionButton(ShareMessengerActionButton sharemessengeractionbutton)
		throws JSONException
	{
		return serializeActionButton(sharemessengeractionbutton, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #324 <Method JSONObject serializeActionButton(ShareMessengerActionButton, boolean)>
	//    3    5:areturn         
	}

	private static JSONObject serializeActionButton(ShareMessengerActionButton sharemessengeractionbutton, boolean flag)
		throws JSONException
	{
		if(sharemessengeractionbutton instanceof ShareMessengerURLActionButton)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #134 <Class ShareMessengerURLActionButton>
	//*   2    4:ifeq            16
			return serializeURLActionButton((ShareMessengerURLActionButton)sharemessengeractionbutton, flag);
	//    3    7:aload_0         
	//    4    8:checkcast       #134 <Class ShareMessengerURLActionButton>
	//    5   11:iload_1         
	//    6   12:invokestatic    #328 <Method JSONObject serializeURLActionButton(ShareMessengerURLActionButton, boolean)>
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
	//    0    0:new             #330 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #331 <Method void JSONArray()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #147 <Method ShareMessengerGenericTemplateElement ShareMessengerGenericTemplateContent.getGenericTemplateElement()>
	//    5   11:invokestatic    #335 <Method JSONObject serializeGenericTemplateElement(ShareMessengerGenericTemplateElement)>
	//    6   14:invokevirtual   #339 <Method JSONArray JSONArray.put(Object)>
	//    7   17:astore_1        
		sharemessengergenerictemplatecontent = ((ShareMessengerGenericTemplateContent) ((new JSONObject()).put("template_type", "generic").put("sharable", sharemessengergenerictemplatecontent.getIsSharable()).put("image_aspect_ratio", ((Object) (getImageRatioString(sharemessengergenerictemplatecontent.getImageAspectRatio())))).put("elements", ((Object) (jsonarray)))));
	//    8   18:new             #341 <Class JSONObject>
	//    9   21:dup             
	//   10   22:invokespecial   #342 <Method void JSONObject()>
	//   11   25:ldc1            #91  <String "template_type">
	//   12   27:ldc1            #82  <String "generic">
	//   13   29:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   14   32:ldc1            #73  <String "sharable">
	//   15   34:aload_0         
	//   16   35:invokevirtual   #348 <Method boolean ShareMessengerGenericTemplateContent.getIsSharable()>
	//   17   38:invokevirtual   #351 <Method JSONObject JSONObject.put(String, boolean)>
	//   18   41:ldc1            #43  <String "image_aspect_ratio">
	//   19   43:aload_0         
	//   20   44:invokevirtual   #355 <Method com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio ShareMessengerGenericTemplateContent.getImageAspectRatio()>
	//   21   47:invokestatic    #357 <Method String getImageRatioString(com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio)>
	//   22   50:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   23   53:ldc1            #35  <String "elements">
	//   24   55:aload_1         
	//   25   56:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   26   59:astore_0        
		sharemessengergenerictemplatecontent = ((ShareMessengerGenericTemplateContent) ((new JSONObject()).put("type", "template").put("payload", ((Object) (sharemessengergenerictemplatecontent)))));
	//   27   60:new             #341 <Class JSONObject>
	//   28   63:dup             
	//   29   64:invokespecial   #342 <Method void JSONObject()>
	//   30   67:ldc1            #22  <String "type">
	//   31   69:ldc1            #19  <String "template">
	//   32   71:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   33   74:ldc1            #16  <String "payload">
	//   34   76:aload_0         
	//   35   77:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   36   80:astore_0        
		return (new JSONObject()).put("attachment", ((Object) (sharemessengergenerictemplatecontent)));
	//   37   81:new             #341 <Class JSONObject>
	//   38   84:dup             
	//   39   85:invokespecial   #342 <Method void JSONObject()>
	//   40   88:ldc1            #10  <String "attachment">
	//   41   90:aload_0         
	//   42   91:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   43   94:areturn         
	}

	private static JSONObject serializeGenericTemplateElement(ShareMessengerGenericTemplateElement sharemessengergenerictemplateelement)
		throws JSONException
	{
		JSONObject jsonobject = (new JSONObject()).put("title", ((Object) (sharemessengergenerictemplateelement.getTitle()))).put("subtitle", ((Object) (sharemessengergenerictemplateelement.getSubtitle()))).put("image_url", ((Object) (Utility.getUriString(sharemessengergenerictemplateelement.getImageUrl()))));
	//    0    0:new             #341 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #342 <Method void JSONObject()>
	//    3    7:ldc1            #94  <String "title">
	//    4    9:aload_0         
	//    5   10:invokevirtual   #195 <Method String ShareMessengerGenericTemplateElement.getTitle()>
	//    6   13:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//    7   16:ldc1            #79  <String "subtitle">
	//    8   18:aload_0         
	//    9   19:invokevirtual   #199 <Method String ShareMessengerGenericTemplateElement.getSubtitle()>
	//   10   22:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   11   25:ldc1            #52  <String "image_url">
	//   12   27:aload_0         
	//   13   28:invokevirtual   #180 <Method Uri ShareMessengerGenericTemplateElement.getImageUrl()>
	//   14   31:invokestatic    #250 <Method String Utility.getUriString(Uri)>
	//   15   34:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   16   37:astore_1        
		if(sharemessengergenerictemplateelement.getButton() != null)
	//*  17   38:aload_0         
	//*  18   39:invokevirtual   #169 <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getButton()>
	//*  19   42:ifnull          73
		{
			JSONArray jsonarray = new JSONArray();
	//   20   45:new             #330 <Class JSONArray>
	//   21   48:dup             
	//   22   49:invokespecial   #331 <Method void JSONArray()>
	//   23   52:astore_2        
			jsonarray.put(((Object) (serializeActionButton(sharemessengergenerictemplateelement.getButton()))));
	//   24   53:aload_2         
	//   25   54:aload_0         
	//   26   55:invokevirtual   #169 <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getButton()>
	//   27   58:invokestatic    #359 <Method JSONObject serializeActionButton(ShareMessengerActionButton)>
	//   28   61:invokevirtual   #339 <Method JSONArray JSONArray.put(Object)>
	//   29   64:pop             
			jsonobject.put("buttons", ((Object) (jsonarray)));
	//   30   65:aload_1         
	//   31   66:ldc1            #25  <String "buttons">
	//   32   68:aload_2         
	//   33   69:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   34   72:pop             
		}
		if(sharemessengergenerictemplateelement.getDefaultAction() != null)
	//*  35   73:aload_0         
	//*  36   74:invokevirtual   #174 <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getDefaultAction()>
	//*  37   77:ifnull          95
			jsonobject.put("default_action", ((Object) (serializeActionButton(sharemessengergenerictemplateelement.getDefaultAction(), true))));
	//   38   80:aload_1         
	//   39   81:ldc1            #32  <String "default_action">
	//   40   83:aload_0         
	//   41   84:invokevirtual   #174 <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getDefaultAction()>
	//   42   87:iconst_1        
	//   43   88:invokestatic    #324 <Method JSONObject serializeActionButton(ShareMessengerActionButton, boolean)>
	//   44   91:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   45   94:pop             
		return jsonobject;
	//   46   95:aload_1         
	//   47   96:areturn         
	}

	private static JSONObject serializeMediaTemplateContent(ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent)
		throws JSONException
	{
		sharemessengermediatemplatecontent = ((ShareMessengerMediaTemplateContent) ((new JSONArray()).put(((Object) (serializeMediaTemplateElement(sharemessengermediatemplatecontent))))));
	//    0    0:new             #330 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #331 <Method void JSONArray()>
	//    3    7:aload_0         
	//    4    8:invokestatic    #362 <Method JSONObject serializeMediaTemplateElement(ShareMessengerMediaTemplateContent)>
	//    5   11:invokevirtual   #339 <Method JSONArray JSONArray.put(Object)>
	//    6   14:astore_0        
		sharemessengermediatemplatecontent = ((ShareMessengerMediaTemplateContent) ((new JSONObject()).put("template_type", "media").put("elements", ((Object) (sharemessengermediatemplatecontent)))));
	//    7   15:new             #341 <Class JSONObject>
	//    8   18:dup             
	//    9   19:invokespecial   #342 <Method void JSONObject()>
	//   10   22:ldc1            #91  <String "template_type">
	//   11   24:ldc1            #85  <String "media">
	//   12   26:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   13   29:ldc1            #35  <String "elements">
	//   14   31:aload_0         
	//   15   32:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   16   35:astore_0        
		sharemessengermediatemplatecontent = ((ShareMessengerMediaTemplateContent) ((new JSONObject()).put("type", "template").put("payload", ((Object) (sharemessengermediatemplatecontent)))));
	//   17   36:new             #341 <Class JSONObject>
	//   18   39:dup             
	//   19   40:invokespecial   #342 <Method void JSONObject()>
	//   20   43:ldc1            #22  <String "type">
	//   21   45:ldc1            #19  <String "template">
	//   22   47:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   23   50:ldc1            #16  <String "payload">
	//   24   52:aload_0         
	//   25   53:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   26   56:astore_0        
		return (new JSONObject()).put("attachment", ((Object) (sharemessengermediatemplatecontent)));
	//   27   57:new             #341 <Class JSONObject>
	//   28   60:dup             
	//   29   61:invokespecial   #342 <Method void JSONObject()>
	//   30   64:ldc1            #10  <String "attachment">
	//   31   66:aload_0         
	//   32   67:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   33   70:areturn         
	}

	private static JSONObject serializeMediaTemplateElement(ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent)
		throws JSONException
	{
		JSONObject jsonobject = (new JSONObject()).put("attachment_id", ((Object) (sharemessengermediatemplatecontent.getAttachmentId()))).put("url", ((Object) (Utility.getUriString(sharemessengermediatemplatecontent.getMediaUrl())))).put("media_type", ((Object) (getMediaType(sharemessengermediatemplatecontent.getMediaType()))));
	//    0    0:new             #341 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #342 <Method void JSONObject()>
	//    3    7:ldc1            #13  <String "attachment_id">
	//    4    9:aload_0         
	//    5   10:invokevirtual   #215 <Method String ShareMessengerMediaTemplateContent.getAttachmentId()>
	//    6   13:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//    7   16:ldc1            #97  <String "url">
	//    8   18:aload_0         
	//    9   19:invokevirtual   #218 <Method Uri ShareMessengerMediaTemplateContent.getMediaUrl()>
	//   10   22:invokestatic    #250 <Method String Utility.getUriString(Uri)>
	//   11   25:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   12   28:ldc1            #58  <String "media_type">
	//   13   30:aload_0         
	//   14   31:invokevirtual   #226 <Method com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType ShareMessengerMediaTemplateContent.getMediaType()>
	//   15   34:invokestatic    #229 <Method String getMediaType(com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType)>
	//   16   37:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   17   40:astore_1        
		if(sharemessengermediatemplatecontent.getButton() != null)
	//*  18   41:aload_0         
	//*  19   42:invokevirtual   #211 <Method ShareMessengerActionButton ShareMessengerMediaTemplateContent.getButton()>
	//*  20   45:ifnull          76
		{
			JSONArray jsonarray = new JSONArray();
	//   21   48:new             #330 <Class JSONArray>
	//   22   51:dup             
	//   23   52:invokespecial   #331 <Method void JSONArray()>
	//   24   55:astore_2        
			jsonarray.put(((Object) (serializeActionButton(sharemessengermediatemplatecontent.getButton()))));
	//   25   56:aload_2         
	//   26   57:aload_0         
	//   27   58:invokevirtual   #211 <Method ShareMessengerActionButton ShareMessengerMediaTemplateContent.getButton()>
	//   28   61:invokestatic    #359 <Method JSONObject serializeActionButton(ShareMessengerActionButton)>
	//   29   64:invokevirtual   #339 <Method JSONArray JSONArray.put(Object)>
	//   30   67:pop             
			jsonobject.put("buttons", ((Object) (jsonarray)));
	//   31   68:aload_1         
	//   32   69:ldc1            #25  <String "buttons">
	//   33   71:aload_2         
	//   34   72:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   35   75:pop             
		}
		return jsonobject;
	//   36   76:aload_1         
	//   37   77:areturn         
	}

	private static JSONObject serializeOpenGraphMusicTemplateContent(ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent)
		throws JSONException
	{
		sharemessengeropengraphmusictemplatecontent = ((ShareMessengerOpenGraphMusicTemplateContent) ((new JSONArray()).put(((Object) (serializeOpenGraphMusicTemplateElement(sharemessengeropengraphmusictemplatecontent))))));
	//    0    0:new             #330 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #331 <Method void JSONArray()>
	//    3    7:aload_0         
	//    4    8:invokestatic    #365 <Method JSONObject serializeOpenGraphMusicTemplateElement(ShareMessengerOpenGraphMusicTemplateContent)>
	//    5   11:invokevirtual   #339 <Method JSONArray JSONArray.put(Object)>
	//    6   14:astore_0        
		sharemessengeropengraphmusictemplatecontent = ((ShareMessengerOpenGraphMusicTemplateContent) ((new JSONObject()).put("template_type", "open_graph").put("elements", ((Object) (sharemessengeropengraphmusictemplatecontent)))));
	//    7   15:new             #341 <Class JSONObject>
	//    8   18:dup             
	//    9   19:invokespecial   #342 <Method void JSONObject()>
	//   10   22:ldc1            #91  <String "template_type">
	//   11   24:ldc1            #88  <String "open_graph">
	//   12   26:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   13   29:ldc1            #35  <String "elements">
	//   14   31:aload_0         
	//   15   32:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   16   35:astore_0        
		sharemessengeropengraphmusictemplatecontent = ((ShareMessengerOpenGraphMusicTemplateContent) ((new JSONObject()).put("type", "template").put("payload", ((Object) (sharemessengeropengraphmusictemplatecontent)))));
	//   17   36:new             #341 <Class JSONObject>
	//   18   39:dup             
	//   19   40:invokespecial   #342 <Method void JSONObject()>
	//   20   43:ldc1            #22  <String "type">
	//   21   45:ldc1            #19  <String "template">
	//   22   47:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   23   50:ldc1            #16  <String "payload">
	//   24   52:aload_0         
	//   25   53:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   26   56:astore_0        
		return (new JSONObject()).put("attachment", ((Object) (sharemessengeropengraphmusictemplatecontent)));
	//   27   57:new             #341 <Class JSONObject>
	//   28   60:dup             
	//   29   61:invokespecial   #342 <Method void JSONObject()>
	//   30   64:ldc1            #10  <String "attachment">
	//   31   66:aload_0         
	//   32   67:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   33   70:areturn         
	}

	private static JSONObject serializeOpenGraphMusicTemplateElement(ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent)
		throws JSONException
	{
		JSONObject jsonobject = (new JSONObject()).put("url", ((Object) (Utility.getUriString(sharemessengeropengraphmusictemplatecontent.getUrl()))));
	//    0    0:new             #341 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #342 <Method void JSONObject()>
	//    3    7:ldc1            #97  <String "url">
	//    4    9:aload_0         
	//    5   10:invokevirtual   #246 <Method Uri ShareMessengerOpenGraphMusicTemplateContent.getUrl()>
	//    6   13:invokestatic    #250 <Method String Utility.getUriString(Uri)>
	//    7   16:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//    8   19:astore_1        
		if(sharemessengeropengraphmusictemplatecontent.getButton() != null)
	//*   9   20:aload_0         
	//*  10   21:invokevirtual   #241 <Method ShareMessengerActionButton ShareMessengerOpenGraphMusicTemplateContent.getButton()>
	//*  11   24:ifnull          55
		{
			JSONArray jsonarray = new JSONArray();
	//   12   27:new             #330 <Class JSONArray>
	//   13   30:dup             
	//   14   31:invokespecial   #331 <Method void JSONArray()>
	//   15   34:astore_2        
			jsonarray.put(((Object) (serializeActionButton(sharemessengeropengraphmusictemplatecontent.getButton()))));
	//   16   35:aload_2         
	//   17   36:aload_0         
	//   18   37:invokevirtual   #241 <Method ShareMessengerActionButton ShareMessengerOpenGraphMusicTemplateContent.getButton()>
	//   19   40:invokestatic    #359 <Method JSONObject serializeActionButton(ShareMessengerActionButton)>
	//   20   43:invokevirtual   #339 <Method JSONArray JSONArray.put(Object)>
	//   21   46:pop             
			jsonobject.put("buttons", ((Object) (jsonarray)));
	//   22   47:aload_1         
	//   23   48:ldc1            #25  <String "buttons">
	//   24   50:aload_2         
	//   25   51:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   26   54:pop             
		}
		return jsonobject;
	//   27   55:aload_1         
	//   28   56:areturn         
	}

	private static JSONObject serializeURLActionButton(ShareMessengerURLActionButton sharemessengerurlactionbutton, boolean flag)
		throws JSONException
	{
		JSONObject jsonobject = (new JSONObject()).put("type", "web_url");
	//    0    0:new             #341 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #342 <Method void JSONObject()>
	//    3    7:ldc1            #22  <String "type">
	//    4    9:ldc1            #29  <String "web_url">
	//    5   11:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//    6   14:astore_3        
		String s;
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            24
			s = null;
	//    9   19:aconst_null     
	//   10   20:astore_2        
		else
	//*  11   21:goto            29
			s = sharemessengerurlactionbutton.getTitle();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #254 <Method String ShareMessengerURLActionButton.getTitle()>
	//   14   28:astore_2        
		return jsonobject.put("title", ((Object) (s))).put("url", ((Object) (Utility.getUriString(sharemessengerurlactionbutton.getUrl())))).put("webview_height_ratio", ((Object) (getWebviewHeightRatioString(sharemessengerurlactionbutton.getWebviewHeightRatio())))).put("messenger_extensions", sharemessengerurlactionbutton.getIsMessengerExtensionURL()).put("fallback_url", ((Object) (Utility.getUriString(sharemessengerurlactionbutton.getFallbackUrl())))).put("webview_share_button", ((Object) (getShouldHideShareButton(sharemessengerurlactionbutton))));
	//   15   29:aload_3         
	//   16   30:ldc1            #94  <String "title">
	//   17   32:aload_2         
	//   18   33:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   19   36:ldc1            #97  <String "url">
	//   20   38:aload_0         
	//   21   39:invokevirtual   #247 <Method Uri ShareMessengerURLActionButton.getUrl()>
	//   22   42:invokestatic    #250 <Method String Utility.getUriString(Uri)>
	//   23   45:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   24   48:ldc1            #100 <String "webview_height_ratio">
	//   25   50:aload_0         
	//   26   51:invokevirtual   #369 <Method com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio ShareMessengerURLActionButton.getWebviewHeightRatio()>
	//   27   54:invokestatic    #371 <Method String getWebviewHeightRatioString(com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio)>
	//   28   57:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   29   60:ldc1            #64  <String "messenger_extensions">
	//   30   62:aload_0         
	//   31   63:invokevirtual   #374 <Method boolean ShareMessengerURLActionButton.getIsMessengerExtensionURL()>
	//   32   66:invokevirtual   #351 <Method JSONObject JSONObject.put(String, boolean)>
	//   33   69:ldc1            #40  <String "fallback_url">
	//   34   71:aload_0         
	//   35   72:invokevirtual   #377 <Method Uri ShareMessengerURLActionButton.getFallbackUrl()>
	//   36   75:invokestatic    #250 <Method String Utility.getUriString(Uri)>
	//   37   78:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   38   81:ldc1            #112 <String "webview_share_button">
	//   39   83:aload_0         
	//   40   84:invokestatic    #379 <Method String getShouldHideShareButton(ShareMessengerURLActionButton)>
	//   41   87:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//   42   90:areturn         
	}

	public static final String ATTACHMENT = "attachment";
	public static final String ATTACHMENT_ID = "attachment_id";
	public static final String ATTACHMENT_PAYLOAD = "payload";
	public static final String ATTACHMENT_TEMPLATE_TYPE = "template";
	public static final String ATTACHMENT_TYPE = "type";
	public static final String BUTTONS = "buttons";
	public static final String BUTTON_TYPE = "type";
	public static final String BUTTON_URL_TYPE = "web_url";
	public static final String DEFAULT_ACTION = "default_action";
	public static final String ELEMENTS = "elements";
	public static final Pattern FACEBOOK_DOMAIN = Pattern.compile("^(.+)\\.(facebook\\.com)$");
	public static final String FALLBACK_URL = "fallback_url";
	public static final String IMAGE_ASPECT_RATIO = "image_aspect_ratio";
	public static final String IMAGE_RATIO_HORIZONTAL = "horizontal";
	public static final String IMAGE_RATIO_SQUARE = "square";
	public static final String IMAGE_URL = "image_url";
	public static final String MEDIA_IMAGE = "image";
	public static final String MEDIA_TYPE = "media_type";
	public static final String MEDIA_VIDEO = "video";
	public static final String MESSENGER_EXTENSIONS = "messenger_extensions";
	public static final String PREVIEW_DEFAULT = "DEFAULT";
	public static final String PREVIEW_OPEN_GRAPH = "OPEN_GRAPH";
	public static final String SHARABLE = "sharable";
	public static final String SHARE_BUTTON_HIDE = "hide";
	public static final String SUBTITLE = "subtitle";
	public static final String TEMPLATE_GENERIC_TYPE = "generic";
	public static final String TEMPLATE_MEDIA_TYPE = "media";
	public static final String TEMPLATE_OPEN_GRAPH_TYPE = "open_graph";
	public static final String TEMPLATE_TYPE = "template_type";
	public static final String TITLE = "title";
	public static final String URL = "url";
	public static final String WEBVIEW_RATIO = "webview_height_ratio";
	public static final String WEBVIEW_RATIO_COMPACT = "compact";
	public static final String WEBVIEW_RATIO_FULL = "full";
	public static final String WEBVIEW_RATIO_TALL = "tall";
	public static final String WEBVIEW_SHARE_BUTTON = "webview_share_button";

	static 
	{
	//    0    0:ldc1            #116 <String "^(.+)\\.(facebook\\.com)$">
	//    1    2:invokestatic    #122 <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #124 <Field Pattern FACEBOOK_DOMAIN>
	//*   3    8:return          
	}
}
