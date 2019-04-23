// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.share.model.*;
import java.util.*;

public class ShareContentValidation
{
	private static class ApiValidator extends Validator
	{

		public void validate(ShareLinkContent sharelinkcontent)
		{
			if(Utility.isNullOrEmpty(sharelinkcontent.getQuote()))
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #23  <Method String ShareLinkContent.getQuote()>
		//*   2    4:invokestatic    #29  <Method boolean Utility.isNullOrEmpty(String)>
		//*   3    7:ifeq            11
				return;
		//    4   10:return          
			else
				throw new FacebookException("Cannot share link content with quote using the share api");
		//    5   11:new             #31  <Class FacebookException>
		//    6   14:dup             
		//    7   15:ldc1            #33  <String "Cannot share link content with quote using the share api">
		//    8   17:invokespecial   #36  <Method void FacebookException(String)>
		//    9   20:athrow          
		}

		public void validate(ShareMediaContent sharemediacontent)
		{
			throw new FacebookException("Cannot share ShareMediaContent using the share api");
		//    0    0:new             #31  <Class FacebookException>
		//    1    3:dup             
		//    2    4:ldc1            #39  <String "Cannot share ShareMediaContent using the share api">
		//    3    6:invokespecial   #36  <Method void FacebookException(String)>
		//    4    9:athrow          
		}

		public void validate(SharePhoto sharephoto)
		{
			ShareContentValidation.validatePhotoForApi(sharephoto, ((Validator) (this)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #44  <Method void ShareContentValidation.access$600(SharePhoto, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(ShareVideoContent sharevideocontent)
		{
			if(Utility.isNullOrEmpty(sharevideocontent.getPlaceId()))
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #50  <Method String ShareVideoContent.getPlaceId()>
		//*   2    4:invokestatic    #29  <Method boolean Utility.isNullOrEmpty(String)>
		//*   3    7:ifeq            51
			{
				if(Utility.isNullOrEmpty(((java.util.Collection) (sharevideocontent.getPeopleIds()))))
		//*   4   10:aload_1         
		//*   5   11:invokevirtual   #54  <Method List ShareVideoContent.getPeopleIds()>
		//*   6   14:invokestatic    #57  <Method boolean Utility.isNullOrEmpty(java.util.Collection)>
		//*   7   17:ifeq            41
				{
					if(Utility.isNullOrEmpty(sharevideocontent.getRef()))
		//*   8   20:aload_1         
		//*   9   21:invokevirtual   #60  <Method String ShareVideoContent.getRef()>
		//*  10   24:invokestatic    #29  <Method boolean Utility.isNullOrEmpty(String)>
		//*  11   27:ifeq            31
						return;
		//   12   30:return          
					else
						throw new FacebookException("Cannot share video content with referrer URL using the share api");
		//   13   31:new             #31  <Class FacebookException>
		//   14   34:dup             
		//   15   35:ldc1            #62  <String "Cannot share video content with referrer URL using the share api">
		//   16   37:invokespecial   #36  <Method void FacebookException(String)>
		//   17   40:athrow          
				} else
				{
					throw new FacebookException("Cannot share video content with people IDs using the share api");
		//   18   41:new             #31  <Class FacebookException>
		//   19   44:dup             
		//   20   45:ldc1            #64  <String "Cannot share video content with people IDs using the share api">
		//   21   47:invokespecial   #36  <Method void FacebookException(String)>
		//   22   50:athrow          
				}
			} else
			{
				throw new FacebookException("Cannot share video content with place IDs using the share api");
		//   23   51:new             #31  <Class FacebookException>
		//   24   54:dup             
		//   25   55:ldc1            #66  <String "Cannot share video content with place IDs using the share api">
		//   26   57:invokespecial   #36  <Method void FacebookException(String)>
		//   27   60:athrow          
			}
		}

		private ApiValidator()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #12  <Method void ShareContentValidation$Validator(ShareContentValidation$1)>
		//    3    5:return          
		}

	}

	private static class StoryShareValidator extends Validator
	{

		public void validate(ShareStoryContent sharestorycontent)
		{
			ShareContentValidation.validateStoryContent(sharestorycontent, ((Validator) (this)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #21  <Method void ShareContentValidation.access$400(ShareStoryContent, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		private StoryShareValidator()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #12  <Method void ShareContentValidation$Validator(ShareContentValidation$1)>
		//    3    5:return          
		}

	}

	private static class Validator
	{

		public boolean isOpenGraphContent()
		{
			return isOpenGraphContent;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field boolean isOpenGraphContent>
		//    2    4:ireturn         
		}

		public void validate(ShareCameraEffectContent sharecameraeffectcontent)
		{
			ShareContentValidation.validateCameraEffectContent(sharecameraeffectcontent, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #25  <Method void ShareContentValidation.access$1100(ShareCameraEffectContent, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(ShareLinkContent sharelinkcontent)
		{
			ShareContentValidation.validateLinkContent(sharelinkcontent, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #30  <Method void ShareContentValidation.access$700(ShareLinkContent, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(ShareMedia sharemedia)
		{
			ShareContentValidation.validateMedium(sharemedia, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #35  <Method void ShareContentValidation.validateMedium(ShareMedia, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(ShareMediaContent sharemediacontent)
		{
			ShareContentValidation.validateMediaContent(sharemediacontent, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #40  <Method void ShareContentValidation.access$1000(ShareMediaContent, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(ShareMessengerGenericTemplateContent sharemessengergenerictemplatecontent)
		{
			ShareContentValidation.validateShareMessengerGenericTemplateContent(sharemessengergenerictemplatecontent);
		//    0    0:aload_1         
		//    1    1:invokestatic    #44  <Method void ShareContentValidation.access$1900(ShareMessengerGenericTemplateContent)>
		//    2    4:return          
		}

		public void validate(ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent)
		{
			ShareContentValidation.validateShareMessengerMediaTemplateContent(sharemessengermediatemplatecontent);
		//    0    0:aload_1         
		//    1    1:invokestatic    #48  <Method void ShareContentValidation.access$2000(ShareMessengerMediaTemplateContent)>
		//    2    4:return          
		}

		public void validate(ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent)
		{
			ShareContentValidation.validateMessengerOpenGraphMusicTemplate(sharemessengeropengraphmusictemplatecontent);
		//    0    0:aload_1         
		//    1    1:invokestatic    #52  <Method void ShareContentValidation.access$1800(ShareMessengerOpenGraphMusicTemplateContent)>
		//    2    4:return          
		}

		public void validate(ShareOpenGraphAction shareopengraphaction)
		{
			ShareContentValidation.validateOpenGraphAction(shareopengraphaction, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #57  <Method void ShareContentValidation.access$1300(ShareOpenGraphAction, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(ShareOpenGraphContent shareopengraphcontent)
		{
			isOpenGraphContent = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #15  <Field boolean isOpenGraphContent>
			ShareContentValidation.validateOpenGraphContent(shareopengraphcontent, this);
		//    3    5:aload_1         
		//    4    6:aload_0         
		//    5    7:invokestatic    #62  <Method void ShareContentValidation.access$1200(ShareOpenGraphContent, ShareContentValidation$Validator)>
		//    6   10:return          
		}

		public void validate(ShareOpenGraphObject shareopengraphobject)
		{
			ShareContentValidation.validateOpenGraphObject(shareopengraphobject, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #67  <Method void ShareContentValidation.access$1400(ShareOpenGraphObject, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(ShareOpenGraphValueContainer shareopengraphvaluecontainer, boolean flag)
		{
			ShareContentValidation.validateOpenGraphValueContainer(shareopengraphvaluecontainer, this, flag);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:iload_2         
		//    3    3:invokestatic    #72  <Method void ShareContentValidation.access$1500(ShareOpenGraphValueContainer, ShareContentValidation$Validator, boolean)>
		//    4    6:return          
		}

		public void validate(SharePhoto sharephoto)
		{
			ShareContentValidation.validatePhotoForNativeDialog(sharephoto, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #77  <Method void ShareContentValidation.access$1600(SharePhoto, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(SharePhotoContent sharephotocontent)
		{
			ShareContentValidation.validatePhotoContent(sharephotocontent, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #82  <Method void ShareContentValidation.access$800(SharePhotoContent, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(ShareStoryContent sharestorycontent)
		{
			ShareContentValidation.validateStoryContent(sharestorycontent, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #87  <Method void ShareContentValidation.access$400(ShareStoryContent, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(ShareVideo sharevideo)
		{
			ShareContentValidation.validateVideo(sharevideo, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #92  <Method void ShareContentValidation.access$1700(ShareVideo, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(ShareVideoContent sharevideocontent)
		{
			ShareContentValidation.validateVideoContent(sharevideocontent, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #97  <Method void ShareContentValidation.access$900(ShareVideoContent, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		private boolean isOpenGraphContent;

		private Validator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
			isOpenGraphContent = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #15  <Field boolean isOpenGraphContent>
		//    5    9:return          
		}

	}

	private static class WebShareValidator extends Validator
	{

		public void validate(ShareMediaContent sharemediacontent)
		{
			throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
		//    0    0:new             #19  <Class FacebookException>
		//    1    3:dup             
		//    2    4:ldc1            #21  <String "Cannot share ShareMediaContent via web sharing dialogs">
		//    3    6:invokespecial   #24  <Method void FacebookException(String)>
		//    4    9:athrow          
		}

		public void validate(SharePhoto sharephoto)
		{
			ShareContentValidation.validatePhotoForWebDialog(sharephoto, ((Validator) (this)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #29  <Method void ShareContentValidation.access$500(SharePhoto, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(ShareVideoContent sharevideocontent)
		{
			throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
		//    0    0:new             #19  <Class FacebookException>
		//    1    3:dup             
		//    2    4:ldc1            #32  <String "Cannot share ShareVideoContent via web sharing dialogs">
		//    3    6:invokespecial   #24  <Method void FacebookException(String)>
		//    4    9:athrow          
		}

		private WebShareValidator()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #12  <Method void ShareContentValidation$Validator(ShareContentValidation$1)>
		//    3    5:return          
		}

	}


	public ShareContentValidation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	private static Validator getApiValidator()
	{
		if(ApiValidator == null)
	//*   0    0:getstatic       #113 <Field ShareContentValidation$Validator ApiValidator>
	//*   1    3:ifnonnull       17
			ApiValidator = ((Validator) (new ApiValidator()));
	//    2    6:new             #8   <Class ShareContentValidation$ApiValidator>
	//    3    9:dup             
	//    4   10:aconst_null     
	//    5   11:invokespecial   #116 <Method void ShareContentValidation$ApiValidator(ShareContentValidation$1)>
	//    6   14:putstatic       #113 <Field ShareContentValidation$Validator ApiValidator>
		return ApiValidator;
	//    7   17:getstatic       #113 <Field ShareContentValidation$Validator ApiValidator>
	//    8   20:areturn         
	}

	private static Validator getDefaultValidator()
	{
		if(DefaultValidator == null)
	//*   0    0:getstatic       #119 <Field ShareContentValidation$Validator DefaultValidator>
	//*   1    3:ifnonnull       17
			DefaultValidator = new Validator();
	//    2    6:new             #14  <Class ShareContentValidation$Validator>
	//    3    9:dup             
	//    4   10:aconst_null     
	//    5   11:invokespecial   #120 <Method void ShareContentValidation$Validator(ShareContentValidation$1)>
	//    6   14:putstatic       #119 <Field ShareContentValidation$Validator DefaultValidator>
		return DefaultValidator;
	//    7   17:getstatic       #119 <Field ShareContentValidation$Validator DefaultValidator>
	//    8   20:areturn         
	}

	private static Validator getStoryValidator()
	{
		if(StoryValidator == null)
	//*   0    0:getstatic       #123 <Field ShareContentValidation$Validator StoryValidator>
	//*   1    3:ifnonnull       17
			StoryValidator = ((Validator) (new StoryShareValidator()));
	//    2    6:new             #11  <Class ShareContentValidation$StoryShareValidator>
	//    3    9:dup             
	//    4   10:aconst_null     
	//    5   11:invokespecial   #124 <Method void ShareContentValidation$StoryShareValidator(ShareContentValidation$1)>
	//    6   14:putstatic       #123 <Field ShareContentValidation$Validator StoryValidator>
		return StoryValidator;
	//    7   17:getstatic       #123 <Field ShareContentValidation$Validator StoryValidator>
	//    8   20:areturn         
	}

	private static Validator getWebShareValidator()
	{
		if(WebShareValidator == null)
	//*   0    0:getstatic       #127 <Field ShareContentValidation$Validator WebShareValidator>
	//*   1    3:ifnonnull       17
			WebShareValidator = ((Validator) (new WebShareValidator()));
	//    2    6:new             #17  <Class ShareContentValidation$WebShareValidator>
	//    3    9:dup             
	//    4   10:aconst_null     
	//    5   11:invokespecial   #128 <Method void ShareContentValidation$WebShareValidator(ShareContentValidation$1)>
	//    6   14:putstatic       #127 <Field ShareContentValidation$Validator WebShareValidator>
		return WebShareValidator;
	//    7   17:getstatic       #127 <Field ShareContentValidation$Validator WebShareValidator>
	//    8   20:areturn         
	}

	private static void validate(ShareContent sharecontent, Validator validator)
		throws FacebookException
	{
		if(sharecontent != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          164
		{
			if(sharecontent instanceof ShareLinkContent)
	//*   2    4:aload_0         
	//*   3    5:instanceof      #134 <Class ShareLinkContent>
	//*   4    8:ifeq            20
			{
				validator.validate((ShareLinkContent)sharecontent);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:checkcast       #134 <Class ShareLinkContent>
	//    8   16:invokevirtual   #137 <Method void ShareContentValidation$Validator.validate(ShareLinkContent)>
				return;
	//    9   19:return          
			}
			if(sharecontent instanceof SharePhotoContent)
	//*  10   20:aload_0         
	//*  11   21:instanceof      #139 <Class SharePhotoContent>
	//*  12   24:ifeq            36
			{
				validator.validate((SharePhotoContent)sharecontent);
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:checkcast       #139 <Class SharePhotoContent>
	//   16   32:invokevirtual   #142 <Method void ShareContentValidation$Validator.validate(SharePhotoContent)>
				return;
	//   17   35:return          
			}
			if(sharecontent instanceof ShareVideoContent)
	//*  18   36:aload_0         
	//*  19   37:instanceof      #144 <Class ShareVideoContent>
	//*  20   40:ifeq            52
			{
				validator.validate((ShareVideoContent)sharecontent);
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:checkcast       #144 <Class ShareVideoContent>
	//   24   48:invokevirtual   #147 <Method void ShareContentValidation$Validator.validate(ShareVideoContent)>
				return;
	//   25   51:return          
			}
			if(sharecontent instanceof ShareOpenGraphContent)
	//*  26   52:aload_0         
	//*  27   53:instanceof      #149 <Class ShareOpenGraphContent>
	//*  28   56:ifeq            68
			{
				validator.validate((ShareOpenGraphContent)sharecontent);
	//   29   59:aload_1         
	//   30   60:aload_0         
	//   31   61:checkcast       #149 <Class ShareOpenGraphContent>
	//   32   64:invokevirtual   #152 <Method void ShareContentValidation$Validator.validate(ShareOpenGraphContent)>
				return;
	//   33   67:return          
			}
			if(sharecontent instanceof ShareMediaContent)
	//*  34   68:aload_0         
	//*  35   69:instanceof      #154 <Class ShareMediaContent>
	//*  36   72:ifeq            84
			{
				validator.validate((ShareMediaContent)sharecontent);
	//   37   75:aload_1         
	//   38   76:aload_0         
	//   39   77:checkcast       #154 <Class ShareMediaContent>
	//   40   80:invokevirtual   #157 <Method void ShareContentValidation$Validator.validate(ShareMediaContent)>
				return;
	//   41   83:return          
			}
			if(sharecontent instanceof ShareCameraEffectContent)
	//*  42   84:aload_0         
	//*  43   85:instanceof      #159 <Class ShareCameraEffectContent>
	//*  44   88:ifeq            100
			{
				validator.validate((ShareCameraEffectContent)sharecontent);
	//   45   91:aload_1         
	//   46   92:aload_0         
	//   47   93:checkcast       #159 <Class ShareCameraEffectContent>
	//   48   96:invokevirtual   #162 <Method void ShareContentValidation$Validator.validate(ShareCameraEffectContent)>
				return;
	//   49   99:return          
			}
			if(sharecontent instanceof ShareMessengerOpenGraphMusicTemplateContent)
	//*  50  100:aload_0         
	//*  51  101:instanceof      #164 <Class ShareMessengerOpenGraphMusicTemplateContent>
	//*  52  104:ifeq            116
			{
				validator.validate((ShareMessengerOpenGraphMusicTemplateContent)sharecontent);
	//   53  107:aload_1         
	//   54  108:aload_0         
	//   55  109:checkcast       #164 <Class ShareMessengerOpenGraphMusicTemplateContent>
	//   56  112:invokevirtual   #166 <Method void ShareContentValidation$Validator.validate(ShareMessengerOpenGraphMusicTemplateContent)>
				return;
	//   57  115:return          
			}
			if(sharecontent instanceof ShareMessengerMediaTemplateContent)
	//*  58  116:aload_0         
	//*  59  117:instanceof      #168 <Class ShareMessengerMediaTemplateContent>
	//*  60  120:ifeq            132
			{
				validator.validate((ShareMessengerMediaTemplateContent)sharecontent);
	//   61  123:aload_1         
	//   62  124:aload_0         
	//   63  125:checkcast       #168 <Class ShareMessengerMediaTemplateContent>
	//   64  128:invokevirtual   #170 <Method void ShareContentValidation$Validator.validate(ShareMessengerMediaTemplateContent)>
				return;
	//   65  131:return          
			}
			if(sharecontent instanceof ShareMessengerGenericTemplateContent)
	//*  66  132:aload_0         
	//*  67  133:instanceof      #172 <Class ShareMessengerGenericTemplateContent>
	//*  68  136:ifeq            148
			{
				validator.validate((ShareMessengerGenericTemplateContent)sharecontent);
	//   69  139:aload_1         
	//   70  140:aload_0         
	//   71  141:checkcast       #172 <Class ShareMessengerGenericTemplateContent>
	//   72  144:invokevirtual   #174 <Method void ShareContentValidation$Validator.validate(ShareMessengerGenericTemplateContent)>
				return;
	//   73  147:return          
			}
			if(sharecontent instanceof ShareStoryContent)
	//*  74  148:aload_0         
	//*  75  149:instanceof      #176 <Class ShareStoryContent>
	//*  76  152:ifeq            163
				validator.validate((ShareStoryContent)sharecontent);
	//   77  155:aload_1         
	//   78  156:aload_0         
	//   79  157:checkcast       #176 <Class ShareStoryContent>
	//   80  160:invokevirtual   #179 <Method void ShareContentValidation$Validator.validate(ShareStoryContent)>
			return;
	//   81  163:return          
		} else
		{
			throw new FacebookException("Must provide non-null content to share");
	//   82  164:new             #132 <Class FacebookException>
	//   83  167:dup             
	//   84  168:ldc1            #181 <String "Must provide non-null content to share">
	//   85  170:invokespecial   #184 <Method void FacebookException(String)>
	//   86  173:athrow          
		}
	}

	private static void validateCameraEffectContent(ShareCameraEffectContent sharecameraeffectcontent, Validator validator)
	{
		if(!Utility.isNullOrEmpty(sharecameraeffectcontent.getEffectId()))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #189 <Method String ShareCameraEffectContent.getEffectId()>
	//*   2    4:invokestatic    #195 <Method boolean Utility.isNullOrEmpty(String)>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		else
			throw new FacebookException("Must specify a non-empty effectId");
	//    5   11:new             #132 <Class FacebookException>
	//    6   14:dup             
	//    7   15:ldc1            #197 <String "Must specify a non-empty effectId">
	//    8   17:invokespecial   #184 <Method void FacebookException(String)>
	//    9   20:athrow          
	}

	public static void validateForApiShare(ShareContent sharecontent)
	{
		validate(sharecontent, getApiValidator());
	//    0    0:aload_0         
	//    1    1:invokestatic    #201 <Method ShareContentValidation$Validator getApiValidator()>
	//    2    4:invokestatic    #203 <Method void validate(ShareContent, ShareContentValidation$Validator)>
	//    3    7:return          
	}

	public static void validateForMessage(ShareContent sharecontent)
	{
		validate(sharecontent, getDefaultValidator());
	//    0    0:aload_0         
	//    1    1:invokestatic    #206 <Method ShareContentValidation$Validator getDefaultValidator()>
	//    2    4:invokestatic    #203 <Method void validate(ShareContent, ShareContentValidation$Validator)>
	//    3    7:return          
	}

	public static void validateForNativeShare(ShareContent sharecontent)
	{
		validate(sharecontent, getDefaultValidator());
	//    0    0:aload_0         
	//    1    1:invokestatic    #206 <Method ShareContentValidation$Validator getDefaultValidator()>
	//    2    4:invokestatic    #203 <Method void validate(ShareContent, ShareContentValidation$Validator)>
	//    3    7:return          
	}

	public static void validateForStoryShare(ShareContent sharecontent)
	{
		validate(sharecontent, getStoryValidator());
	//    0    0:aload_0         
	//    1    1:invokestatic    #210 <Method ShareContentValidation$Validator getStoryValidator()>
	//    2    4:invokestatic    #203 <Method void validate(ShareContent, ShareContentValidation$Validator)>
	//    3    7:return          
	}

	public static void validateForWebShare(ShareContent sharecontent)
	{
		validate(sharecontent, getWebShareValidator());
	//    0    0:aload_0         
	//    1    1:invokestatic    #213 <Method ShareContentValidation$Validator getWebShareValidator()>
	//    2    4:invokestatic    #203 <Method void validate(ShareContent, ShareContentValidation$Validator)>
	//    3    7:return          
	}

	private static void validateLinkContent(ShareLinkContent sharelinkcontent, Validator validator)
	{
		sharelinkcontent = ((ShareLinkContent) (sharelinkcontent.getImageUrl()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method android.net.Uri ShareLinkContent.getImageUrl()>
	//    2    4:astore_0        
		if(sharelinkcontent != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          27
		{
			if(Utility.isWebUri(((android.net.Uri) (sharelinkcontent))))
	//*   5    9:aload_0         
	//*   6   10:invokestatic    #221 <Method boolean Utility.isWebUri(android.net.Uri)>
	//*   7   13:ifeq            17
				return;
	//    8   16:return          
			else
				throw new FacebookException("Image Url must be an http:// or https:// url");
	//    9   17:new             #132 <Class FacebookException>
	//   10   20:dup             
	//   11   21:ldc1            #223 <String "Image Url must be an http:// or https:// url">
	//   12   23:invokespecial   #184 <Method void FacebookException(String)>
	//   13   26:athrow          
		} else
		{
			return;
	//   14   27:return          
		}
	}

	private static void validateMediaContent(ShareMediaContent sharemediacontent, Validator validator)
	{
		sharemediacontent = ((ShareMediaContent) (sharemediacontent.getMedia()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #227 <Method List ShareMediaContent.getMedia()>
	//    2    4:astore_0        
		if(sharemediacontent != null && !((List) (sharemediacontent)).isEmpty())
	//*   3    5:aload_0         
	//*   4    6:ifnull          91
	//*   5    9:aload_0         
	//*   6   10:invokeinterface #233 <Method boolean List.isEmpty()>
	//*   7   15:ifne            91
		{
			if(((List) (sharemediacontent)).size() <= 6)
	//*   8   18:aload_0         
	//*   9   19:invokeinterface #237 <Method int List.size()>
	//*  10   24:bipush          6
	//*  11   26:icmpgt          62
			{
				for(sharemediacontent = ((ShareMediaContent) (((List) (sharemediacontent)).iterator())); ((Iterator) (sharemediacontent)).hasNext(); validator.validate((ShareMedia)((Iterator) (sharemediacontent)).next()));
	//   12   29:aload_0         
	//   13   30:invokeinterface #241 <Method Iterator List.iterator()>
	//   14   35:astore_0        
	//   15   36:aload_0         
	//   16   37:invokeinterface #246 <Method boolean Iterator.hasNext()>
	//   17   42:ifeq            61
	//   18   45:aload_1         
	//   19   46:aload_0         
	//   20   47:invokeinterface #250 <Method Object Iterator.next()>
	//   21   52:checkcast       #252 <Class ShareMedia>
	//   22   55:invokevirtual   #255 <Method void ShareContentValidation$Validator.validate(ShareMedia)>
	//*  23   58:goto            36
				return;
	//   24   61:return          
			} else
			{
				throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d media.", new Object[] {
					Integer.valueOf(6)
				}));
	//   25   62:new             #132 <Class FacebookException>
	//   26   65:dup             
	//   27   66:getstatic       #261 <Field Locale Locale.ROOT>
	//   28   69:ldc2            #263 <String "Cannot add more than %d media.">
	//   29   72:iconst_1        
	//   30   73:anewarray       Object[]
	//   31   76:dup             
	//   32   77:iconst_0        
	//   33   78:bipush          6
	//   34   80:invokestatic    #269 <Method Integer Integer.valueOf(int)>
	//   35   83:aastore         
	//   36   84:invokestatic    #275 <Method String String.format(Locale, String, Object[])>
	//   37   87:invokespecial   #184 <Method void FacebookException(String)>
	//   38   90:athrow          
			}
		} else
		{
			throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
	//   39   91:new             #132 <Class FacebookException>
	//   40   94:dup             
	//   41   95:ldc2            #277 <String "Must specify at least one medium in ShareMediaContent.">
	//   42   98:invokespecial   #184 <Method void FacebookException(String)>
	//   43  101:athrow          
		}
	}

	public static void validateMedium(ShareMedia sharemedia, Validator validator)
	{
		if(sharemedia instanceof SharePhoto)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #281 <Class SharePhoto>
	//*   2    4:ifeq            16
		{
			validator.validate((SharePhoto)sharemedia);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:checkcast       #281 <Class SharePhoto>
	//    6   12:invokevirtual   #284 <Method void ShareContentValidation$Validator.validate(SharePhoto)>
			return;
	//    7   15:return          
		}
		if(sharemedia instanceof ShareVideo)
	//*   8   16:aload_0         
	//*   9   17:instanceof      #286 <Class ShareVideo>
	//*  10   20:ifeq            32
		{
			validator.validate((ShareVideo)sharemedia);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:checkcast       #286 <Class ShareVideo>
	//   14   28:invokevirtual   #289 <Method void ShareContentValidation$Validator.validate(ShareVideo)>
			return;
	//   15   31:return          
		} else
		{
			throw new FacebookException(String.format(Locale.ROOT, "Invalid media type: %s", new Object[] {
				((Object) (sharemedia)).getClass().getSimpleName()
			}));
	//   16   32:new             #132 <Class FacebookException>
	//   17   35:dup             
	//   18   36:getstatic       #261 <Field Locale Locale.ROOT>
	//   19   39:ldc2            #291 <String "Invalid media type: %s">
	//   20   42:iconst_1        
	//   21   43:anewarray       Object[]
	//   22   46:dup             
	//   23   47:iconst_0        
	//   24   48:aload_0         
	//   25   49:invokevirtual   #295 <Method Class Object.getClass()>
	//   26   52:invokevirtual   #300 <Method String Class.getSimpleName()>
	//   27   55:aastore         
	//   28   56:invokestatic    #275 <Method String String.format(Locale, String, Object[])>
	//   29   59:invokespecial   #184 <Method void FacebookException(String)>
	//   30   62:athrow          
		}
	}

	private static void validateMessengerOpenGraphMusicTemplate(ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent)
	{
		if(!Utility.isNullOrEmpty(sharemessengeropengraphmusictemplatecontent.getPageId()))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #303 <Method String ShareMessengerOpenGraphMusicTemplateContent.getPageId()>
	//*   2    4:invokestatic    #195 <Method boolean Utility.isNullOrEmpty(String)>
	//*   3    7:ifne            36
		{
			if(sharemessengeropengraphmusictemplatecontent.getUrl() != null)
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #306 <Method android.net.Uri ShareMessengerOpenGraphMusicTemplateContent.getUrl()>
	//*   6   14:ifnull          25
			{
				validateShareMessengerActionButton(sharemessengeropengraphmusictemplatecontent.getButton());
	//    7   17:aload_0         
	//    8   18:invokevirtual   #310 <Method ShareMessengerActionButton ShareMessengerOpenGraphMusicTemplateContent.getButton()>
	//    9   21:invokestatic    #314 <Method void validateShareMessengerActionButton(ShareMessengerActionButton)>
				return;
	//   10   24:return          
			} else
			{
				throw new FacebookException("Must specify url for ShareMessengerOpenGraphMusicTemplateContent");
	//   11   25:new             #132 <Class FacebookException>
	//   12   28:dup             
	//   13   29:ldc2            #316 <String "Must specify url for ShareMessengerOpenGraphMusicTemplateContent">
	//   14   32:invokespecial   #184 <Method void FacebookException(String)>
	//   15   35:athrow          
			}
		} else
		{
			throw new FacebookException("Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent");
	//   16   36:new             #132 <Class FacebookException>
	//   17   39:dup             
	//   18   40:ldc2            #318 <String "Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent">
	//   19   43:invokespecial   #184 <Method void FacebookException(String)>
	//   20   46:athrow          
		}
	}

	private static void validateOpenGraphAction(ShareOpenGraphAction shareopengraphaction, Validator validator)
	{
		if(shareopengraphaction != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          32
		{
			if(!Utility.isNullOrEmpty(shareopengraphaction.getActionType()))
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #323 <Method String ShareOpenGraphAction.getActionType()>
	//*   4    8:invokestatic    #195 <Method boolean Utility.isNullOrEmpty(String)>
	//*   5   11:ifne            21
			{
				validator.validate(((ShareOpenGraphValueContainer) (shareopengraphaction)), false);
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #326 <Method void ShareContentValidation$Validator.validate(ShareOpenGraphValueContainer, boolean)>
				return;
	//   10   20:return          
			} else
			{
				throw new FacebookException("ShareOpenGraphAction must have a non-empty actionType");
	//   11   21:new             #132 <Class FacebookException>
	//   12   24:dup             
	//   13   25:ldc2            #328 <String "ShareOpenGraphAction must have a non-empty actionType">
	//   14   28:invokespecial   #184 <Method void FacebookException(String)>
	//   15   31:athrow          
			}
		} else
		{
			throw new FacebookException("Must specify a non-null ShareOpenGraphAction");
	//   16   32:new             #132 <Class FacebookException>
	//   17   35:dup             
	//   18   36:ldc2            #330 <String "Must specify a non-null ShareOpenGraphAction">
	//   19   39:invokespecial   #184 <Method void FacebookException(String)>
	//   20   42:athrow          
		}
	}

	private static void validateOpenGraphContent(ShareOpenGraphContent shareopengraphcontent, Validator validator)
	{
		validator.validate(shareopengraphcontent.getAction());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #334 <Method ShareOpenGraphAction ShareOpenGraphContent.getAction()>
	//    3    5:invokevirtual   #337 <Method void ShareContentValidation$Validator.validate(ShareOpenGraphAction)>
		validator = ((Validator) (shareopengraphcontent.getPreviewPropertyName()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #340 <Method String ShareOpenGraphContent.getPreviewPropertyName()>
	//    6   12:astore_1        
		if(!Utility.isNullOrEmpty(((String) (validator))))
	//*   7   13:aload_1         
	//*   8   14:invokestatic    #195 <Method boolean Utility.isNullOrEmpty(String)>
	//*   9   17:ifne            74
		{
			if(shareopengraphcontent.getAction().get(((String) (validator))) != null)
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #334 <Method ShareOpenGraphAction ShareOpenGraphContent.getAction()>
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #344 <Method Object ShareOpenGraphAction.get(String)>
	//*  14   28:ifnull          32
			{
				return;
	//   15   31:return          
			} else
			{
				shareopengraphcontent = ((ShareOpenGraphContent) (new StringBuilder()));
	//   16   32:new             #346 <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #347 <Method void StringBuilder()>
	//   19   39:astore_0        
				((StringBuilder) (shareopengraphcontent)).append("Property \"");
	//   20   40:aload_0         
	//   21   41:ldc2            #349 <String "Property \"">
	//   22   44:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
				((StringBuilder) (shareopengraphcontent)).append(((String) (validator)));
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
				((StringBuilder) (shareopengraphcontent)).append("\" was not found on the action. The name of the preview property must match the name of an action property.");
	//   28   54:aload_0         
	//   29   55:ldc2            #355 <String "\" was not found on the action. The name of the preview property must match the name of an action property.">
	//   30   58:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
				throw new FacebookException(((StringBuilder) (shareopengraphcontent)).toString());
	//   32   62:new             #132 <Class FacebookException>
	//   33   65:dup             
	//   34   66:aload_0         
	//   35   67:invokevirtual   #358 <Method String StringBuilder.toString()>
	//   36   70:invokespecial   #184 <Method void FacebookException(String)>
	//   37   73:athrow          
			}
		} else
		{
			throw new FacebookException("Must specify a previewPropertyName.");
	//   38   74:new             #132 <Class FacebookException>
	//   39   77:dup             
	//   40   78:ldc2            #360 <String "Must specify a previewPropertyName.">
	//   41   81:invokespecial   #184 <Method void FacebookException(String)>
	//   42   84:athrow          
		}
	}

	private static void validateOpenGraphKey(String s, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_1         
	//*   1    1:ifne            5
			return;
	//    2    4:return          
		String as[] = s.split(":");
	//    3    5:aload_0         
	//    4    6:ldc2            #364 <String ":">
	//    5    9:invokevirtual   #368 <Method String[] String.split(String)>
	//    6   12:astore          4
		if(as.length >= 2)
	//*   7   14:aload           4
	//*   8   16:arraylength     
	//*   9   17:iconst_2        
	//*  10   18:icmplt          69
		{
			int j = as.length;
	//   11   21:aload           4
	//   12   23:arraylength     
	//   13   24:istore_3        
			for(int i = 0; i < j;)
	//*  14   25:iconst_0        
	//*  15   26:istore_2        
	//*  16   27:iload_2         
	//*  17   28:iload_3         
	//*  18   29:icmpge          68
				if(!as[i].isEmpty())
	//*  19   32:aload           4
	//*  20   34:iload_2         
	//*  21   35:aaload          
	//*  22   36:invokevirtual   #369 <Method boolean String.isEmpty()>
	//*  23   39:ifne            49
					i++;
	//   24   42:iload_2         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore_2        
				else
	//*  28   46:goto            27
					throw new FacebookException("Invalid key found in Open Graph dictionary: %s", new Object[] {
						s
					});
	//   29   49:new             #132 <Class FacebookException>
	//   30   52:dup             
	//   31   53:ldc2            #371 <String "Invalid key found in Open Graph dictionary: %s">
	//   32   56:iconst_1        
	//   33   57:anewarray       Object[]
	//   34   60:dup             
	//   35   61:iconst_0        
	//   36   62:aload_0         
	//   37   63:aastore         
	//   38   64:invokespecial   #374 <Method void FacebookException(String, Object[])>
	//   39   67:athrow          

			return;
	//   40   68:return          
		} else
		{
			throw new FacebookException("Open Graph keys must be namespaced: %s", new Object[] {
				s
			});
	//   41   69:new             #132 <Class FacebookException>
	//   42   72:dup             
	//   43   73:ldc2            #376 <String "Open Graph keys must be namespaced: %s">
	//   44   76:iconst_1        
	//   45   77:anewarray       Object[]
	//   46   80:dup             
	//   47   81:iconst_0        
	//   48   82:aload_0         
	//   49   83:aastore         
	//   50   84:invokespecial   #374 <Method void FacebookException(String, Object[])>
	//   51   87:athrow          
		}
	}

	private static void validateOpenGraphObject(ShareOpenGraphObject shareopengraphobject, Validator validator)
	{
		if(shareopengraphobject != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
		{
			validator.validate(((ShareOpenGraphValueContainer) (shareopengraphobject)), true);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #326 <Method void ShareContentValidation$Validator.validate(ShareOpenGraphValueContainer, boolean)>
			return;
	//    6   10:return          
		} else
		{
			throw new FacebookException("Cannot share a null ShareOpenGraphObject");
	//    7   11:new             #132 <Class FacebookException>
	//    8   14:dup             
	//    9   15:ldc2            #378 <String "Cannot share a null ShareOpenGraphObject">
	//   10   18:invokespecial   #184 <Method void FacebookException(String)>
	//   11   21:athrow          
		}
	}

	private static void validateOpenGraphValueContainer(ShareOpenGraphValueContainer shareopengraphvaluecontainer, Validator validator, boolean flag)
	{
		for(Iterator iterator = shareopengraphvaluecontainer.keySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #384 <Method Set ShareOpenGraphValueContainer.keySet()>
	//*   2    4:invokeinterface #387 <Method Iterator Set.iterator()>
	//*   3    9:astore_3        
	//*   4   10:aload_3         
	//*   5   11:invokeinterface #246 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            117
		{
			Object obj = ((Object) ((String)iterator.next()));
	//    7   19:aload_3         
	//    8   20:invokeinterface #250 <Method Object Iterator.next()>
	//    9   25:checkcast       #271 <Class String>
	//   10   28:astore          4
			validateOpenGraphKey(((String) (obj)), flag);
	//   11   30:aload           4
	//   12   32:iload_2         
	//   13   33:invokestatic    #389 <Method void validateOpenGraphKey(String, boolean)>
			obj = shareopengraphvaluecontainer.get(((String) (obj)));
	//   14   36:aload_0         
	//   15   37:aload           4
	//   16   39:invokevirtual   #390 <Method Object ShareOpenGraphValueContainer.get(String)>
	//   17   42:astore          4
			if(obj instanceof List)
	//*  18   44:aload           4
	//*  19   46:instanceof      #229 <Class List>
	//*  20   49:ifeq            108
			{
				obj = ((Object) (((List)obj).iterator()));
	//   21   52:aload           4
	//   22   54:checkcast       #229 <Class List>
	//   23   57:invokeinterface #241 <Method Iterator List.iterator()>
	//   24   62:astore          4
				while(((Iterator) (obj)).hasNext()) 
	//*  25   64:aload           4
	//*  26   66:invokeinterface #246 <Method boolean Iterator.hasNext()>
	//*  27   71:ifeq            10
				{
					Object obj1 = ((Iterator) (obj)).next();
	//   28   74:aload           4
	//   29   76:invokeinterface #250 <Method Object Iterator.next()>
	//   30   81:astore          5
					if(obj1 != null)
	//*  31   83:aload           5
	//*  32   85:ifnull          97
						validateOpenGraphValueContainerObject(obj1, validator);
	//   33   88:aload           5
	//   34   90:aload_1         
	//   35   91:invokestatic    #394 <Method void validateOpenGraphValueContainerObject(Object, ShareContentValidation$Validator)>
					else
	//*  36   94:goto            64
						throw new FacebookException("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
	//   37   97:new             #132 <Class FacebookException>
	//   38  100:dup             
	//   39  101:ldc2            #396 <String "Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions">
	//   40  104:invokespecial   #184 <Method void FacebookException(String)>
	//   41  107:athrow          
				}
			} else
			{
				validateOpenGraphValueContainerObject(obj, validator);
	//   42  108:aload           4
	//   43  110:aload_1         
	//   44  111:invokestatic    #394 <Method void validateOpenGraphValueContainerObject(Object, ShareContentValidation$Validator)>
			}
		}

	//*  45  114:goto            10
	//   46  117:return          
	}

	private static void validateOpenGraphValueContainerObject(Object obj, Validator validator)
	{
		if(obj instanceof ShareOpenGraphObject)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #398 <Class ShareOpenGraphObject>
	//*   2    4:ifeq            16
		{
			validator.validate((ShareOpenGraphObject)obj);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:checkcast       #398 <Class ShareOpenGraphObject>
	//    6   12:invokevirtual   #401 <Method void ShareContentValidation$Validator.validate(ShareOpenGraphObject)>
			return;
	//    7   15:return          
		}
		if(obj instanceof SharePhoto)
	//*   8   16:aload_0         
	//*   9   17:instanceof      #281 <Class SharePhoto>
	//*  10   20:ifeq            31
			validator.validate((SharePhoto)obj);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:checkcast       #281 <Class SharePhoto>
	//   14   28:invokevirtual   #284 <Method void ShareContentValidation$Validator.validate(SharePhoto)>
	//   15   31:return          
	}

	private static void validatePhoto(SharePhoto sharephoto)
	{
		if(sharephoto != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          35
		{
			android.graphics.Bitmap bitmap = sharephoto.getBitmap();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #406 <Method android.graphics.Bitmap SharePhoto.getBitmap()>
	//    4    8:astore_1        
			sharephoto = ((SharePhoto) (sharephoto.getImageUrl()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #407 <Method android.net.Uri SharePhoto.getImageUrl()>
	//    7   13:astore_0        
			if(bitmap == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       34
			{
				if(sharephoto != null)
	//*  10   18:aload_0         
	//*  11   19:ifnull          23
					return;
	//   12   22:return          
				else
					throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
	//   13   23:new             #132 <Class FacebookException>
	//   14   26:dup             
	//   15   27:ldc2            #409 <String "SharePhoto does not have a Bitmap or ImageUrl specified">
	//   16   30:invokespecial   #184 <Method void FacebookException(String)>
	//   17   33:athrow          
			} else
			{
				return;
	//   18   34:return          
			}
		} else
		{
			throw new FacebookException("Cannot share a null SharePhoto");
	//   19   35:new             #132 <Class FacebookException>
	//   20   38:dup             
	//   21   39:ldc2            #411 <String "Cannot share a null SharePhoto">
	//   22   42:invokespecial   #184 <Method void FacebookException(String)>
	//   23   45:athrow          
		}
	}

	private static void validatePhotoContent(SharePhotoContent sharephotocontent, Validator validator)
	{
		sharephotocontent = ((SharePhotoContent) (sharephotocontent.getPhotos()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #414 <Method List SharePhotoContent.getPhotos()>
	//    2    4:astore_0        
		if(sharephotocontent != null && !((List) (sharephotocontent)).isEmpty())
	//*   3    5:aload_0         
	//*   4    6:ifnull          91
	//*   5    9:aload_0         
	//*   6   10:invokeinterface #233 <Method boolean List.isEmpty()>
	//*   7   15:ifne            91
		{
			if(((List) (sharephotocontent)).size() <= 6)
	//*   8   18:aload_0         
	//*   9   19:invokeinterface #237 <Method int List.size()>
	//*  10   24:bipush          6
	//*  11   26:icmpgt          62
			{
				for(sharephotocontent = ((SharePhotoContent) (((List) (sharephotocontent)).iterator())); ((Iterator) (sharephotocontent)).hasNext(); validator.validate((SharePhoto)((Iterator) (sharephotocontent)).next()));
	//   12   29:aload_0         
	//   13   30:invokeinterface #241 <Method Iterator List.iterator()>
	//   14   35:astore_0        
	//   15   36:aload_0         
	//   16   37:invokeinterface #246 <Method boolean Iterator.hasNext()>
	//   17   42:ifeq            61
	//   18   45:aload_1         
	//   19   46:aload_0         
	//   20   47:invokeinterface #250 <Method Object Iterator.next()>
	//   21   52:checkcast       #281 <Class SharePhoto>
	//   22   55:invokevirtual   #284 <Method void ShareContentValidation$Validator.validate(SharePhoto)>
	//*  23   58:goto            36
				return;
	//   24   61:return          
			} else
			{
				throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d photos.", new Object[] {
					Integer.valueOf(6)
				}));
	//   25   62:new             #132 <Class FacebookException>
	//   26   65:dup             
	//   27   66:getstatic       #261 <Field Locale Locale.ROOT>
	//   28   69:ldc2            #416 <String "Cannot add more than %d photos.">
	//   29   72:iconst_1        
	//   30   73:anewarray       Object[]
	//   31   76:dup             
	//   32   77:iconst_0        
	//   33   78:bipush          6
	//   34   80:invokestatic    #269 <Method Integer Integer.valueOf(int)>
	//   35   83:aastore         
	//   36   84:invokestatic    #275 <Method String String.format(Locale, String, Object[])>
	//   37   87:invokespecial   #184 <Method void FacebookException(String)>
	//   38   90:athrow          
			}
		} else
		{
			throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
	//   39   91:new             #132 <Class FacebookException>
	//   40   94:dup             
	//   41   95:ldc2            #418 <String "Must specify at least one Photo in SharePhotoContent.">
	//   42   98:invokespecial   #184 <Method void FacebookException(String)>
	//   43  101:athrow          
		}
	}

	private static void validatePhotoForApi(SharePhoto sharephoto, Validator validator)
	{
		validatePhoto(sharephoto);
	//    0    0:aload_0         
	//    1    1:invokestatic    #420 <Method void validatePhoto(SharePhoto)>
		android.graphics.Bitmap bitmap = sharephoto.getBitmap();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #406 <Method android.graphics.Bitmap SharePhoto.getBitmap()>
	//    4    8:astore_2        
		sharephoto = ((SharePhoto) (sharephoto.getImageUrl()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #407 <Method android.net.Uri SharePhoto.getImageUrl()>
	//    7   13:astore_0        
		if(bitmap == null && Utility.isWebUri(((android.net.Uri) (sharephoto))))
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       44
	//*  10   18:aload_0         
	//*  11   19:invokestatic    #221 <Method boolean Utility.isWebUri(android.net.Uri)>
	//*  12   22:ifeq            44
		{
			if(validator.isOpenGraphContent())
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #423 <Method boolean ShareContentValidation$Validator.isOpenGraphContent()>
	//*  15   29:ifeq            33
				return;
	//   16   32:return          
			else
				throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
	//   17   33:new             #132 <Class FacebookException>
	//   18   36:dup             
	//   19   37:ldc2            #425 <String "Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent">
	//   20   40:invokespecial   #184 <Method void FacebookException(String)>
	//   21   43:athrow          
		} else
		{
			return;
	//   22   44:return          
		}
	}

	private static void validatePhotoForNativeDialog(SharePhoto sharephoto, Validator validator)
	{
		validatePhotoForApi(sharephoto, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #94  <Method void validatePhotoForApi(SharePhoto, ShareContentValidation$Validator)>
		if(sharephoto.getBitmap() != null || !Utility.isWebUri(sharephoto.getImageUrl()))
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #406 <Method android.graphics.Bitmap SharePhoto.getBitmap()>
	//*   5    9:ifnonnull       22
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #407 <Method android.net.Uri SharePhoto.getImageUrl()>
	//*   8   16:invokestatic    #221 <Method boolean Utility.isWebUri(android.net.Uri)>
	//*   9   19:ifne            28
			Validate.hasContentProvider(FacebookSdk.getApplicationContext());
	//   10   22:invokestatic    #431 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   11   25:invokestatic    #437 <Method void Validate.hasContentProvider(android.content.Context)>
	//   12   28:return          
	}

	private static void validatePhotoForWebDialog(SharePhoto sharephoto, Validator validator)
	{
		validatePhoto(sharephoto);
	//    0    0:aload_0         
	//    1    1:invokestatic    #420 <Method void validatePhoto(SharePhoto)>
	//    2    4:return          
	}

	private static void validateShareMessengerActionButton(ShareMessengerActionButton sharemessengeractionbutton)
	{
		if(sharemessengeractionbutton == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(!Utility.isNullOrEmpty(sharemessengeractionbutton.getTitle()))
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #442 <Method String ShareMessengerActionButton.getTitle()>
	//*   5    9:invokestatic    #195 <Method boolean Utility.isNullOrEmpty(String)>
	//*   6   12:ifne            30
		{
			if(sharemessengeractionbutton instanceof ShareMessengerURLActionButton)
	//*   7   15:aload_0         
	//*   8   16:instanceof      #444 <Class ShareMessengerURLActionButton>
	//*   9   19:ifeq            29
				validateShareMessengerURLActionButton((ShareMessengerURLActionButton)sharemessengeractionbutton);
	//   10   22:aload_0         
	//   11   23:checkcast       #444 <Class ShareMessengerURLActionButton>
	//   12   26:invokestatic    #448 <Method void validateShareMessengerURLActionButton(ShareMessengerURLActionButton)>
			return;
	//   13   29:return          
		} else
		{
			throw new FacebookException("Must specify title for ShareMessengerActionButton");
	//   14   30:new             #132 <Class FacebookException>
	//   15   33:dup             
	//   16   34:ldc2            #450 <String "Must specify title for ShareMessengerActionButton">
	//   17   37:invokespecial   #184 <Method void FacebookException(String)>
	//   18   40:athrow          
		}
	}

	private static void validateShareMessengerGenericTemplateContent(ShareMessengerGenericTemplateContent sharemessengergenerictemplatecontent)
	{
		if(!Utility.isNullOrEmpty(sharemessengergenerictemplatecontent.getPageId()))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #451 <Method String ShareMessengerGenericTemplateContent.getPageId()>
	//*   2    4:invokestatic    #195 <Method boolean Utility.isNullOrEmpty(String)>
	//*   3    7:ifne            63
		{
			if(sharemessengergenerictemplatecontent.getGenericTemplateElement() != null)
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #455 <Method ShareMessengerGenericTemplateElement ShareMessengerGenericTemplateContent.getGenericTemplateElement()>
	//*   6   14:ifnull          52
			{
				if(!Utility.isNullOrEmpty(sharemessengergenerictemplatecontent.getGenericTemplateElement().getTitle()))
	//*   7   17:aload_0         
	//*   8   18:invokevirtual   #455 <Method ShareMessengerGenericTemplateElement ShareMessengerGenericTemplateContent.getGenericTemplateElement()>
	//*   9   21:invokevirtual   #458 <Method String ShareMessengerGenericTemplateElement.getTitle()>
	//*  10   24:invokestatic    #195 <Method boolean Utility.isNullOrEmpty(String)>
	//*  11   27:ifne            41
				{
					validateShareMessengerActionButton(sharemessengergenerictemplatecontent.getGenericTemplateElement().getButton());
	//   12   30:aload_0         
	//   13   31:invokevirtual   #455 <Method ShareMessengerGenericTemplateElement ShareMessengerGenericTemplateContent.getGenericTemplateElement()>
	//   14   34:invokevirtual   #459 <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.getButton()>
	//   15   37:invokestatic    #314 <Method void validateShareMessengerActionButton(ShareMessengerActionButton)>
					return;
	//   16   40:return          
				} else
				{
					throw new FacebookException("Must specify title for ShareMessengerGenericTemplateElement");
	//   17   41:new             #132 <Class FacebookException>
	//   18   44:dup             
	//   19   45:ldc2            #461 <String "Must specify title for ShareMessengerGenericTemplateElement">
	//   20   48:invokespecial   #184 <Method void FacebookException(String)>
	//   21   51:athrow          
				}
			} else
			{
				throw new FacebookException("Must specify element for ShareMessengerGenericTemplateContent");
	//   22   52:new             #132 <Class FacebookException>
	//   23   55:dup             
	//   24   56:ldc2            #463 <String "Must specify element for ShareMessengerGenericTemplateContent">
	//   25   59:invokespecial   #184 <Method void FacebookException(String)>
	//   26   62:athrow          
			}
		} else
		{
			throw new FacebookException("Must specify Page Id for ShareMessengerGenericTemplateContent");
	//   27   63:new             #132 <Class FacebookException>
	//   28   66:dup             
	//   29   67:ldc2            #465 <String "Must specify Page Id for ShareMessengerGenericTemplateContent">
	//   30   70:invokespecial   #184 <Method void FacebookException(String)>
	//   31   73:athrow          
		}
	}

	private static void validateShareMessengerMediaTemplateContent(ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent)
	{
		if(!Utility.isNullOrEmpty(sharemessengermediatemplatecontent.getPageId()))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #466 <Method String ShareMessengerMediaTemplateContent.getPageId()>
	//*   2    4:invokestatic    #195 <Method boolean Utility.isNullOrEmpty(String)>
	//*   3    7:ifne            49
		{
			if(sharemessengermediatemplatecontent.getMediaUrl() == null && Utility.isNullOrEmpty(sharemessengermediatemplatecontent.getAttachmentId()))
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #469 <Method android.net.Uri ShareMessengerMediaTemplateContent.getMediaUrl()>
	//*   6   14:ifnonnull       41
	//*   7   17:aload_0         
	//*   8   18:invokevirtual   #472 <Method String ShareMessengerMediaTemplateContent.getAttachmentId()>
	//*   9   21:invokestatic    #195 <Method boolean Utility.isNullOrEmpty(String)>
	//*  10   24:ifne            30
	//*  11   27:goto            41
			{
				throw new FacebookException("Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent");
	//   12   30:new             #132 <Class FacebookException>
	//   13   33:dup             
	//   14   34:ldc2            #474 <String "Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent">
	//   15   37:invokespecial   #184 <Method void FacebookException(String)>
	//   16   40:athrow          
			} else
			{
				validateShareMessengerActionButton(sharemessengermediatemplatecontent.getButton());
	//   17   41:aload_0         
	//   18   42:invokevirtual   #475 <Method ShareMessengerActionButton ShareMessengerMediaTemplateContent.getButton()>
	//   19   45:invokestatic    #314 <Method void validateShareMessengerActionButton(ShareMessengerActionButton)>
				return;
	//   20   48:return          
			}
		} else
		{
			throw new FacebookException("Must specify Page Id for ShareMessengerMediaTemplateContent");
	//   21   49:new             #132 <Class FacebookException>
	//   22   52:dup             
	//   23   53:ldc2            #477 <String "Must specify Page Id for ShareMessengerMediaTemplateContent">
	//   24   56:invokespecial   #184 <Method void FacebookException(String)>
	//   25   59:athrow          
		}
	}

	private static void validateShareMessengerURLActionButton(ShareMessengerURLActionButton sharemessengerurlactionbutton)
	{
		if(sharemessengerurlactionbutton.getUrl() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #478 <Method android.net.Uri ShareMessengerURLActionButton.getUrl()>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		else
			throw new FacebookException("Must specify url for ShareMessengerURLActionButton");
	//    4    8:new             #132 <Class FacebookException>
	//    5   11:dup             
	//    6   12:ldc2            #480 <String "Must specify url for ShareMessengerURLActionButton">
	//    7   15:invokespecial   #184 <Method void FacebookException(String)>
	//    8   18:athrow          
	}

	private static void validateStoryContent(ShareStoryContent sharestorycontent, Validator validator)
	{
		if(sharestorycontent != null && (sharestorycontent.getBackgroundAsset() != null || sharestorycontent.getStickerAsset() != null))
	//*   0    0:aload_0         
	//*   1    1:ifnull          49
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #484 <Method ShareMedia ShareStoryContent.getBackgroundAsset()>
	//*   4    8:ifnonnull       18
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #488 <Method SharePhoto ShareStoryContent.getStickerAsset()>
	//*   7   15:ifnull          49
		{
			if(sharestorycontent.getBackgroundAsset() != null)
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #484 <Method ShareMedia ShareStoryContent.getBackgroundAsset()>
	//*  10   22:ifnull          33
				validator.validate(sharestorycontent.getBackgroundAsset());
	//   11   25:aload_1         
	//   12   26:aload_0         
	//   13   27:invokevirtual   #484 <Method ShareMedia ShareStoryContent.getBackgroundAsset()>
	//   14   30:invokevirtual   #255 <Method void ShareContentValidation$Validator.validate(ShareMedia)>
			if(sharestorycontent.getStickerAsset() != null)
	//*  15   33:aload_0         
	//*  16   34:invokevirtual   #488 <Method SharePhoto ShareStoryContent.getStickerAsset()>
	//*  17   37:ifnull          48
				validator.validate(sharestorycontent.getStickerAsset());
	//   18   40:aload_1         
	//   19   41:aload_0         
	//   20   42:invokevirtual   #488 <Method SharePhoto ShareStoryContent.getStickerAsset()>
	//   21   45:invokevirtual   #284 <Method void ShareContentValidation$Validator.validate(SharePhoto)>
			return;
	//   22   48:return          
		} else
		{
			throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
	//   23   49:new             #132 <Class FacebookException>
	//   24   52:dup             
	//   25   53:ldc2            #490 <String "Must pass the Facebook app a background asset, a sticker asset, or both">
	//   26   56:invokespecial   #184 <Method void FacebookException(String)>
	//   27   59:athrow          
		}
	}

	private static void validateVideo(ShareVideo sharevideo, Validator validator)
	{
		if(sharevideo != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          51
		{
			sharevideo = ((ShareVideo) (sharevideo.getLocalUrl()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #493 <Method android.net.Uri ShareVideo.getLocalUrl()>
	//    4    8:astore_0        
			if(sharevideo != null)
	//*   5    9:aload_0         
	//*   6   10:ifnull          40
			{
				if(!Utility.isContentUri(((android.net.Uri) (sharevideo))))
	//*   7   13:aload_0         
	//*   8   14:invokestatic    #496 <Method boolean Utility.isContentUri(android.net.Uri)>
	//*   9   17:ifne            39
				{
					if(Utility.isFileUri(((android.net.Uri) (sharevideo))))
	//*  10   20:aload_0         
	//*  11   21:invokestatic    #499 <Method boolean Utility.isFileUri(android.net.Uri)>
	//*  12   24:ifeq            28
						return;
	//   13   27:return          
					else
						throw new FacebookException("ShareVideo must reference a video that is on the device");
	//   14   28:new             #132 <Class FacebookException>
	//   15   31:dup             
	//   16   32:ldc2            #501 <String "ShareVideo must reference a video that is on the device">
	//   17   35:invokespecial   #184 <Method void FacebookException(String)>
	//   18   38:athrow          
				} else
				{
					return;
	//   19   39:return          
				}
			} else
			{
				throw new FacebookException("ShareVideo does not have a LocalUrl specified");
	//   20   40:new             #132 <Class FacebookException>
	//   21   43:dup             
	//   22   44:ldc2            #503 <String "ShareVideo does not have a LocalUrl specified">
	//   23   47:invokespecial   #184 <Method void FacebookException(String)>
	//   24   50:athrow          
			}
		} else
		{
			throw new FacebookException("Cannot share a null ShareVideo");
	//   25   51:new             #132 <Class FacebookException>
	//   26   54:dup             
	//   27   55:ldc2            #505 <String "Cannot share a null ShareVideo">
	//   28   58:invokespecial   #184 <Method void FacebookException(String)>
	//   29   61:athrow          
		}
	}

	private static void validateVideoContent(ShareVideoContent sharevideocontent, Validator validator)
	{
		validator.validate(sharevideocontent.getVideo());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #509 <Method ShareVideo ShareVideoContent.getVideo()>
	//    3    5:invokevirtual   #289 <Method void ShareContentValidation$Validator.validate(ShareVideo)>
		sharevideocontent = ((ShareVideoContent) (sharevideocontent.getPreviewPhoto()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #512 <Method SharePhoto ShareVideoContent.getPreviewPhoto()>
	//    6   12:astore_0        
		if(sharevideocontent != null)
	//*   7   13:aload_0         
	//*   8   14:ifnull          22
			validator.validate(((SharePhoto) (sharevideocontent)));
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #284 <Method void ShareContentValidation$Validator.validate(SharePhoto)>
	//   12   22:return          
	}

	private static Validator ApiValidator;
	private static Validator DefaultValidator;
	private static Validator StoryValidator;
	private static Validator WebShareValidator;


/*
	static void access$1000(ShareMediaContent sharemediacontent, Validator validator)
	{
		validateMediaContent(sharemediacontent, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #31  <Method void validateMediaContent(ShareMediaContent, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$1100(ShareCameraEffectContent sharecameraeffectcontent, Validator validator)
	{
		validateCameraEffectContent(sharecameraeffectcontent, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #36  <Method void validateCameraEffectContent(ShareCameraEffectContent, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$1200(ShareOpenGraphContent shareopengraphcontent, Validator validator)
	{
		validateOpenGraphContent(shareopengraphcontent, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #41  <Method void validateOpenGraphContent(ShareOpenGraphContent, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$1300(ShareOpenGraphAction shareopengraphaction, Validator validator)
	{
		validateOpenGraphAction(shareopengraphaction, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #46  <Method void validateOpenGraphAction(ShareOpenGraphAction, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$1400(ShareOpenGraphObject shareopengraphobject, Validator validator)
	{
		validateOpenGraphObject(shareopengraphobject, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #51  <Method void validateOpenGraphObject(ShareOpenGraphObject, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$1500(ShareOpenGraphValueContainer shareopengraphvaluecontainer, Validator validator, boolean flag)
	{
		validateOpenGraphValueContainer(shareopengraphvaluecontainer, validator, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #56  <Method void validateOpenGraphValueContainer(ShareOpenGraphValueContainer, ShareContentValidation$Validator, boolean)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$1600(SharePhoto sharephoto, Validator validator)
	{
		validatePhotoForNativeDialog(sharephoto, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #61  <Method void validatePhotoForNativeDialog(SharePhoto, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$1700(ShareVideo sharevideo, Validator validator)
	{
		validateVideo(sharevideo, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #66  <Method void validateVideo(ShareVideo, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$1800(ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent)
	{
		validateMessengerOpenGraphMusicTemplate(sharemessengeropengraphmusictemplatecontent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #71  <Method void validateMessengerOpenGraphMusicTemplate(ShareMessengerOpenGraphMusicTemplateContent)>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$1900(ShareMessengerGenericTemplateContent sharemessengergenerictemplatecontent)
	{
		validateShareMessengerGenericTemplateContent(sharemessengergenerictemplatecontent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #76  <Method void validateShareMessengerGenericTemplateContent(ShareMessengerGenericTemplateContent)>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$2000(ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent)
	{
		validateShareMessengerMediaTemplateContent(sharemessengermediatemplatecontent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #81  <Method void validateShareMessengerMediaTemplateContent(ShareMessengerMediaTemplateContent)>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$400(ShareStoryContent sharestorycontent, Validator validator)
	{
		validateStoryContent(sharestorycontent, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #86  <Method void validateStoryContent(ShareStoryContent, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$500(SharePhoto sharephoto, Validator validator)
	{
		validatePhotoForWebDialog(sharephoto, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #90  <Method void validatePhotoForWebDialog(SharePhoto, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$600(SharePhoto sharephoto, Validator validator)
	{
		validatePhotoForApi(sharephoto, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #94  <Method void validatePhotoForApi(SharePhoto, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$700(ShareLinkContent sharelinkcontent, Validator validator)
	{
		validateLinkContent(sharelinkcontent, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #99  <Method void validateLinkContent(ShareLinkContent, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$800(SharePhotoContent sharephotocontent, Validator validator)
	{
		validatePhotoContent(sharephotocontent, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #104 <Method void validatePhotoContent(SharePhotoContent, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$900(ShareVideoContent sharevideocontent, Validator validator)
	{
		validateVideoContent(sharevideocontent, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #109 <Method void validateVideoContent(ShareVideoContent, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/
}
