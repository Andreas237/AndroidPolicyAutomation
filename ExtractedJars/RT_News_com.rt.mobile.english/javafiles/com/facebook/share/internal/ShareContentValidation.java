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

		public void validate(SharePhoto sharephoto)
		{
			ShareContentValidation.validatePhotoForApi(sharephoto, ((Validator) (this)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #21  <Method void ShareContentValidation.access$400(SharePhoto, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		private ApiValidator()
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

		public void validate(ShareLinkContent sharelinkcontent)
		{
			ShareContentValidation.validateLinkContent(sharelinkcontent, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #25  <Method void ShareContentValidation.access$500(ShareLinkContent, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(ShareOpenGraphAction shareopengraphaction)
		{
			ShareContentValidation.validateOpenGraphAction(shareopengraphaction, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #30  <Method void ShareContentValidation.access$900(ShareOpenGraphAction, ShareContentValidation$Validator)>
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
		//    5    7:invokestatic    #35  <Method void ShareContentValidation.access$800(ShareOpenGraphContent, ShareContentValidation$Validator)>
		//    6   10:return          
		}

		public void validate(ShareOpenGraphObject shareopengraphobject)
		{
			ShareContentValidation.validateOpenGraphObject(shareopengraphobject, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #40  <Method void ShareContentValidation.access$1000(ShareOpenGraphObject, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(ShareOpenGraphValueContainer shareopengraphvaluecontainer, boolean flag)
		{
			ShareContentValidation.validateOpenGraphValueContainer(shareopengraphvaluecontainer, this, flag);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:iload_2         
		//    3    3:invokestatic    #45  <Method void ShareContentValidation.access$1100(ShareOpenGraphValueContainer, ShareContentValidation$Validator, boolean)>
		//    4    6:return          
		}

		public void validate(SharePhoto sharephoto)
		{
			ShareContentValidation.validatePhotoForNativeDialog(sharephoto, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #50  <Method void ShareContentValidation.access$1200(SharePhoto, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(SharePhotoContent sharephotocontent)
		{
			ShareContentValidation.validatePhotoContent(sharephotocontent, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #55  <Method void ShareContentValidation.access$600(SharePhotoContent, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(ShareVideo sharevideo)
		{
			ShareContentValidation.validateVideo(sharevideo, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #60  <Method void ShareContentValidation.access$1300(ShareVideo, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(ShareVideoContent sharevideocontent)
		{
			ShareContentValidation.validateVideoContent(sharevideocontent, this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #65  <Method void ShareContentValidation.access$700(ShareVideoContent, ShareContentValidation$Validator)>
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

		public void validate(SharePhoto sharephoto)
		{
			ShareContentValidation.validatePhotoForWebDialog(sharephoto, ((Validator) (this)));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokestatic    #21  <Method void ShareContentValidation.access$300(SharePhoto, ShareContentValidation$Validator)>
		//    3    5:return          
		}

		public void validate(SharePhotoContent sharephotocontent)
		{
			throw new FacebookException("Cannot share SharePhotoContent via web sharing dialogs");
		//    0    0:new             #24  <Class FacebookException>
		//    1    3:dup             
		//    2    4:ldc1            #26  <String "Cannot share SharePhotoContent via web sharing dialogs">
		//    3    6:invokespecial   #29  <Method void FacebookException(String)>
		//    4    9:athrow          
		}

		public void validate(ShareVideoContent sharevideocontent)
		{
			throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
		//    0    0:new             #24  <Class FacebookException>
		//    1    3:dup             
		//    2    4:ldc1            #32  <String "Cannot share ShareVideoContent via web sharing dialogs">
		//    3    6:invokespecial   #29  <Method void FacebookException(String)>
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
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	private static Validator getApiValidator()
	{
		if(ApiValidator == null)
	//*   0    0:getstatic       #79  <Field ShareContentValidation$Validator ApiValidator>
	//*   1    3:ifnonnull       17
			ApiValidator = ((Validator) (new ApiValidator()));
	//    2    6:new             #8   <Class ShareContentValidation$ApiValidator>
	//    3    9:dup             
	//    4   10:aconst_null     
	//    5   11:invokespecial   #82  <Method void ShareContentValidation$ApiValidator(ShareContentValidation$1)>
	//    6   14:putstatic       #79  <Field ShareContentValidation$Validator ApiValidator>
		return ApiValidator;
	//    7   17:getstatic       #79  <Field ShareContentValidation$Validator ApiValidator>
	//    8   20:areturn         
	}

	private static Validator getDefaultValidator()
	{
		if(DefaultValidator == null)
	//*   0    0:getstatic       #85  <Field ShareContentValidation$Validator DefaultValidator>
	//*   1    3:ifnonnull       17
			DefaultValidator = new Validator();
	//    2    6:new             #11  <Class ShareContentValidation$Validator>
	//    3    9:dup             
	//    4   10:aconst_null     
	//    5   11:invokespecial   #86  <Method void ShareContentValidation$Validator(ShareContentValidation$1)>
	//    6   14:putstatic       #85  <Field ShareContentValidation$Validator DefaultValidator>
		return DefaultValidator;
	//    7   17:getstatic       #85  <Field ShareContentValidation$Validator DefaultValidator>
	//    8   20:areturn         
	}

	private static Validator getWebShareValidator()
	{
		if(WebShareValidator == null)
	//*   0    0:getstatic       #89  <Field ShareContentValidation$Validator WebShareValidator>
	//*   1    3:ifnonnull       17
			WebShareValidator = ((Validator) (new WebShareValidator()));
	//    2    6:new             #14  <Class ShareContentValidation$WebShareValidator>
	//    3    9:dup             
	//    4   10:aconst_null     
	//    5   11:invokespecial   #90  <Method void ShareContentValidation$WebShareValidator(ShareContentValidation$1)>
	//    6   14:putstatic       #89  <Field ShareContentValidation$Validator WebShareValidator>
		return WebShareValidator;
	//    7   17:getstatic       #89  <Field ShareContentValidation$Validator WebShareValidator>
	//    8   20:areturn         
	}

	private static void validate(ShareContent sharecontent, Validator validator)
		throws FacebookException
	{
		if(sharecontent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new FacebookException("Must provide non-null content to share");
	//    2    4:new             #94  <Class FacebookException>
	//    3    7:dup             
	//    4    8:ldc1            #96  <String "Must provide non-null content to share">
	//    5   10:invokespecial   #99  <Method void FacebookException(String)>
	//    6   13:athrow          
		if(sharecontent instanceof ShareLinkContent)
	//*   7   14:aload_0         
	//*   8   15:instanceof      #101 <Class ShareLinkContent>
	//*   9   18:ifeq            30
		{
			validator.validate((ShareLinkContent)sharecontent);
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:checkcast       #101 <Class ShareLinkContent>
	//   13   26:invokevirtual   #104 <Method void ShareContentValidation$Validator.validate(ShareLinkContent)>
			return;
	//   14   29:return          
		}
		if(sharecontent instanceof SharePhotoContent)
	//*  15   30:aload_0         
	//*  16   31:instanceof      #106 <Class SharePhotoContent>
	//*  17   34:ifeq            46
		{
			validator.validate((SharePhotoContent)sharecontent);
	//   18   37:aload_1         
	//   19   38:aload_0         
	//   20   39:checkcast       #106 <Class SharePhotoContent>
	//   21   42:invokevirtual   #109 <Method void ShareContentValidation$Validator.validate(SharePhotoContent)>
			return;
	//   22   45:return          
		}
		if(sharecontent instanceof ShareVideoContent)
	//*  23   46:aload_0         
	//*  24   47:instanceof      #111 <Class ShareVideoContent>
	//*  25   50:ifeq            62
		{
			validator.validate((ShareVideoContent)sharecontent);
	//   26   53:aload_1         
	//   27   54:aload_0         
	//   28   55:checkcast       #111 <Class ShareVideoContent>
	//   29   58:invokevirtual   #114 <Method void ShareContentValidation$Validator.validate(ShareVideoContent)>
			return;
	//   30   61:return          
		}
		if(sharecontent instanceof ShareOpenGraphContent)
	//*  31   62:aload_0         
	//*  32   63:instanceof      #116 <Class ShareOpenGraphContent>
	//*  33   66:ifeq            77
			validator.validate((ShareOpenGraphContent)sharecontent);
	//   34   69:aload_1         
	//   35   70:aload_0         
	//   36   71:checkcast       #116 <Class ShareOpenGraphContent>
	//   37   74:invokevirtual   #119 <Method void ShareContentValidation$Validator.validate(ShareOpenGraphContent)>
	//   38   77:return          
	}

	public static void validateForApiShare(ShareContent sharecontent)
	{
		validate(sharecontent, getApiValidator());
	//    0    0:aload_0         
	//    1    1:invokestatic    #124 <Method ShareContentValidation$Validator getApiValidator()>
	//    2    4:invokestatic    #126 <Method void validate(ShareContent, ShareContentValidation$Validator)>
	//    3    7:return          
	}

	public static void validateForMessage(ShareContent sharecontent)
	{
		validate(sharecontent, getDefaultValidator());
	//    0    0:aload_0         
	//    1    1:invokestatic    #129 <Method ShareContentValidation$Validator getDefaultValidator()>
	//    2    4:invokestatic    #126 <Method void validate(ShareContent, ShareContentValidation$Validator)>
	//    3    7:return          
	}

	public static void validateForNativeShare(ShareContent sharecontent)
	{
		validate(sharecontent, getDefaultValidator());
	//    0    0:aload_0         
	//    1    1:invokestatic    #129 <Method ShareContentValidation$Validator getDefaultValidator()>
	//    2    4:invokestatic    #126 <Method void validate(ShareContent, ShareContentValidation$Validator)>
	//    3    7:return          
	}

	public static void validateForWebShare(ShareContent sharecontent)
	{
		validate(sharecontent, getWebShareValidator());
	//    0    0:aload_0         
	//    1    1:invokestatic    #133 <Method ShareContentValidation$Validator getWebShareValidator()>
	//    2    4:invokestatic    #126 <Method void validate(ShareContent, ShareContentValidation$Validator)>
	//    3    7:return          
	}

	private static void validateLinkContent(ShareLinkContent sharelinkcontent, Validator validator)
	{
		sharelinkcontent = ((ShareLinkContent) (sharelinkcontent.getImageUrl()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #137 <Method android.net.Uri ShareLinkContent.getImageUrl()>
	//    2    4:astore_0        
		if(sharelinkcontent != null && !Utility.isWebUri(((android.net.Uri) (sharelinkcontent))))
	//*   3    5:aload_0         
	//*   4    6:ifnull          26
	//*   5    9:aload_0         
	//*   6   10:invokestatic    #143 <Method boolean Utility.isWebUri(android.net.Uri)>
	//*   7   13:ifne            26
			throw new FacebookException("Image Url must be an http:// or https:// url");
	//    8   16:new             #94  <Class FacebookException>
	//    9   19:dup             
	//   10   20:ldc1            #145 <String "Image Url must be an http:// or https:// url">
	//   11   22:invokespecial   #99  <Method void FacebookException(String)>
	//   12   25:athrow          
		else
			return;
	//   13   26:return          
	}

	private static void validateOpenGraphAction(ShareOpenGraphAction shareopengraphaction, Validator validator)
	{
		if(shareopengraphaction == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new FacebookException("Must specify a non-null ShareOpenGraphAction");
	//    2    4:new             #94  <Class FacebookException>
	//    3    7:dup             
	//    4    8:ldc1            #147 <String "Must specify a non-null ShareOpenGraphAction">
	//    5   10:invokespecial   #99  <Method void FacebookException(String)>
	//    6   13:athrow          
		if(Utility.isNullOrEmpty(shareopengraphaction.getActionType()))
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #153 <Method String ShareOpenGraphAction.getActionType()>
	//*   9   18:invokestatic    #157 <Method boolean Utility.isNullOrEmpty(String)>
	//*  10   21:ifeq            34
		{
			throw new FacebookException("ShareOpenGraphAction must have a non-empty actionType");
	//   11   24:new             #94  <Class FacebookException>
	//   12   27:dup             
	//   13   28:ldc1            #159 <String "ShareOpenGraphAction must have a non-empty actionType">
	//   14   30:invokespecial   #99  <Method void FacebookException(String)>
	//   15   33:athrow          
		} else
		{
			validator.validate(((ShareOpenGraphValueContainer) (shareopengraphaction)), false);
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:invokevirtual   #162 <Method void ShareContentValidation$Validator.validate(ShareOpenGraphValueContainer, boolean)>
			return;
	//   20   40:return          
		}
	}

	private static void validateOpenGraphContent(ShareOpenGraphContent shareopengraphcontent, Validator validator)
	{
		validator.validate(shareopengraphcontent.getAction());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #166 <Method ShareOpenGraphAction ShareOpenGraphContent.getAction()>
	//    3    5:invokevirtual   #169 <Method void ShareContentValidation$Validator.validate(ShareOpenGraphAction)>
		validator = ((Validator) (shareopengraphcontent.getPreviewPropertyName()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #172 <Method String ShareOpenGraphContent.getPreviewPropertyName()>
	//    6   12:astore_1        
		if(Utility.isNullOrEmpty(((String) (validator))))
	//*   7   13:aload_1         
	//*   8   14:invokestatic    #157 <Method boolean Utility.isNullOrEmpty(String)>
	//*   9   17:ifeq            30
			throw new FacebookException("Must specify a previewPropertyName.");
	//   10   20:new             #94  <Class FacebookException>
	//   11   23:dup             
	//   12   24:ldc1            #174 <String "Must specify a previewPropertyName.">
	//   13   26:invokespecial   #99  <Method void FacebookException(String)>
	//   14   29:athrow          
		if(shareopengraphcontent.getAction().get(((String) (validator))) == null)
	//*  15   30:aload_0         
	//*  16   31:invokevirtual   #166 <Method ShareOpenGraphAction ShareOpenGraphContent.getAction()>
	//*  17   34:aload_1         
	//*  18   35:invokevirtual   #178 <Method Object ShareOpenGraphAction.get(String)>
	//*  19   38:ifnonnull       95
		{
			shareopengraphcontent = ((ShareOpenGraphContent) (new StringBuilder()));
	//   20   41:new             #180 <Class StringBuilder>
	//   21   44:dup             
	//   22   45:invokespecial   #181 <Method void StringBuilder()>
	//   23   48:astore_0        
			((StringBuilder) (shareopengraphcontent)).append("Property \"");
	//   24   49:aload_0         
	//   25   50:ldc1            #183 <String "Property \"">
	//   26   52:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
			((StringBuilder) (shareopengraphcontent)).append(((String) (validator)));
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
			((StringBuilder) (shareopengraphcontent)).append("\" was not found on the action. ");
	//   32   62:aload_0         
	//   33   63:ldc1            #189 <String "\" was not found on the action. ">
	//   34   65:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
			((StringBuilder) (shareopengraphcontent)).append("The name of the preview property must match the name of an ");
	//   36   69:aload_0         
	//   37   70:ldc1            #191 <String "The name of the preview property must match the name of an ">
	//   38   72:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   39   75:pop             
			((StringBuilder) (shareopengraphcontent)).append("action property.");
	//   40   76:aload_0         
	//   41   77:ldc1            #193 <String "action property.">
	//   42   79:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   43   82:pop             
			throw new FacebookException(((StringBuilder) (shareopengraphcontent)).toString());
	//   44   83:new             #94  <Class FacebookException>
	//   45   86:dup             
	//   46   87:aload_0         
	//   47   88:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   48   91:invokespecial   #99  <Method void FacebookException(String)>
	//   49   94:athrow          
		} else
		{
			return;
	//   50   95:return          
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
	//    4    6:ldc1            #200 <String ":">
	//    5    8:invokevirtual   #206 <Method String[] String.split(String)>
	//    6   11:astore          4
		if(as.length < 2)
	//*   7   13:aload           4
	//*   8   15:arraylength     
	//*   9   16:iconst_2        
	//*  10   17:icmpge          38
			throw new FacebookException("Open Graph keys must be namespaced: %s", new Object[] {
				s
			});
	//   11   20:new             #94  <Class FacebookException>
	//   12   23:dup             
	//   13   24:ldc1            #208 <String "Open Graph keys must be namespaced: %s">
	//   14   26:iconst_1        
	//   15   27:anewarray       Object[]
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:aload_0         
	//   19   33:aastore         
	//   20   34:invokespecial   #211 <Method void FacebookException(String, Object[])>
	//   21   37:athrow          
		int j = as.length;
	//   22   38:aload           4
	//   23   40:arraylength     
	//   24   41:istore_3        
		for(int i = 0; i < j; i++)
	//*  25   42:iconst_0        
	//*  26   43:istore_2        
	//*  27   44:iload_2         
	//*  28   45:iload_3         
	//*  29   46:icmpge          84
			if(as[i].isEmpty())
	//*  30   49:aload           4
	//*  31   51:iload_2         
	//*  32   52:aaload          
	//*  33   53:invokevirtual   #215 <Method boolean String.isEmpty()>
	//*  34   56:ifeq            77
				throw new FacebookException("Invalid key found in Open Graph dictionary: %s", new Object[] {
					s
				});
	//   35   59:new             #94  <Class FacebookException>
	//   36   62:dup             
	//   37   63:ldc1            #217 <String "Invalid key found in Open Graph dictionary: %s">
	//   38   65:iconst_1        
	//   39   66:anewarray       Object[]
	//   40   69:dup             
	//   41   70:iconst_0        
	//   42   71:aload_0         
	//   43   72:aastore         
	//   44   73:invokespecial   #211 <Method void FacebookException(String, Object[])>
	//   45   76:athrow          

	//   46   77:iload_2         
	//   47   78:iconst_1        
	//   48   79:iadd            
	//   49   80:istore_2        
	//*  50   81:goto            44
	//   51   84:return          
	}

	private static void validateOpenGraphObject(ShareOpenGraphObject shareopengraphobject, Validator validator)
	{
		if(shareopengraphobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new FacebookException("Cannot share a null ShareOpenGraphObject");
	//    2    4:new             #94  <Class FacebookException>
	//    3    7:dup             
	//    4    8:ldc1            #219 <String "Cannot share a null ShareOpenGraphObject">
	//    5   10:invokespecial   #99  <Method void FacebookException(String)>
	//    6   13:athrow          
		} else
		{
			validator.validate(((ShareOpenGraphValueContainer) (shareopengraphobject)), true);
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:iconst_1        
	//   10   17:invokevirtual   #162 <Method void ShareContentValidation$Validator.validate(ShareOpenGraphValueContainer, boolean)>
			return;
	//   11   20:return          
		}
	}

	private static void validateOpenGraphValueContainer(ShareOpenGraphValueContainer shareopengraphvaluecontainer, Validator validator, boolean flag)
	{
		for(Iterator iterator = shareopengraphvaluecontainer.keySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #225 <Method Set ShareOpenGraphValueContainer.keySet()>
	//*   2    4:invokeinterface #231 <Method Iterator Set.iterator()>
	//*   3    9:astore_3        
	//*   4   10:aload_3         
	//*   5   11:invokeinterface #236 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            116
		{
			Object obj = ((Object) ((String)iterator.next()));
	//    7   19:aload_3         
	//    8   20:invokeinterface #240 <Method Object Iterator.next()>
	//    9   25:checkcast       #202 <Class String>
	//   10   28:astore          4
			validateOpenGraphKey(((String) (obj)), flag);
	//   11   30:aload           4
	//   12   32:iload_2         
	//   13   33:invokestatic    #242 <Method void validateOpenGraphKey(String, boolean)>
			obj = shareopengraphvaluecontainer.get(((String) (obj)));
	//   14   36:aload_0         
	//   15   37:aload           4
	//   16   39:invokevirtual   #243 <Method Object ShareOpenGraphValueContainer.get(String)>
	//   17   42:astore          4
			if(obj instanceof List)
	//*  18   44:aload           4
	//*  19   46:instanceof      #245 <Class List>
	//*  20   49:ifeq            107
			{
				obj = ((Object) (((List)obj).iterator()));
	//   21   52:aload           4
	//   22   54:checkcast       #245 <Class List>
	//   23   57:invokeinterface #246 <Method Iterator List.iterator()>
	//   24   62:astore          4
				while(((Iterator) (obj)).hasNext()) 
	//*  25   64:aload           4
	//*  26   66:invokeinterface #236 <Method boolean Iterator.hasNext()>
	//*  27   71:ifeq            10
				{
					Object obj1 = ((Iterator) (obj)).next();
	//   28   74:aload           4
	//   29   76:invokeinterface #240 <Method Object Iterator.next()>
	//   30   81:astore          5
					if(obj1 == null)
	//*  31   83:aload           5
	//*  32   85:ifnonnull       98
						throw new FacebookException("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
	//   33   88:new             #94  <Class FacebookException>
	//   34   91:dup             
	//   35   92:ldc1            #248 <String "Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions">
	//   36   94:invokespecial   #99  <Method void FacebookException(String)>
	//   37   97:athrow          
					validateOpenGraphValueContainerObject(obj1, validator);
	//   38   98:aload           5
	//   39  100:aload_1         
	//   40  101:invokestatic    #252 <Method void validateOpenGraphValueContainerObject(Object, ShareContentValidation$Validator)>
				}
			} else
	//*  41  104:goto            64
			{
				validateOpenGraphValueContainerObject(obj, validator);
	//   42  107:aload           4
	//   43  109:aload_1         
	//   44  110:invokestatic    #252 <Method void validateOpenGraphValueContainerObject(Object, ShareContentValidation$Validator)>
			}
		}

	//*  45  113:goto            10
	//   46  116:return          
	}

	private static void validateOpenGraphValueContainerObject(Object obj, Validator validator)
	{
		if(obj instanceof ShareOpenGraphObject)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #254 <Class ShareOpenGraphObject>
	//*   2    4:ifeq            16
		{
			validator.validate((ShareOpenGraphObject)obj);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:checkcast       #254 <Class ShareOpenGraphObject>
	//    6   12:invokevirtual   #257 <Method void ShareContentValidation$Validator.validate(ShareOpenGraphObject)>
			return;
	//    7   15:return          
		}
		if(obj instanceof SharePhoto)
	//*   8   16:aload_0         
	//*   9   17:instanceof      #259 <Class SharePhoto>
	//*  10   20:ifeq            31
			validator.validate((SharePhoto)obj);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:checkcast       #259 <Class SharePhoto>
	//   14   28:invokevirtual   #262 <Method void ShareContentValidation$Validator.validate(SharePhoto)>
	//   15   31:return          
	}

	private static void validatePhotoContent(SharePhotoContent sharephotocontent, Validator validator)
	{
		sharephotocontent = ((SharePhotoContent) (sharephotocontent.getPhotos()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #266 <Method List SharePhotoContent.getPhotos()>
	//    2    4:astore_0        
		if(sharephotocontent != null && !((List) (sharephotocontent)).isEmpty())
	//*   3    5:aload_0         
	//*   4    6:ifnull          94
	//*   5    9:aload_0         
	//*   6   10:invokeinterface #267 <Method boolean List.isEmpty()>
	//*   7   15:ifeq            21
	//*   8   18:goto            94
		{
			if(((List) (sharephotocontent)).size() > 6)
	//*   9   21:aload_0         
	//*  10   22:invokeinterface #271 <Method int List.size()>
	//*  11   27:bipush          6
	//*  12   29:icmple          61
				throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d photos.", new Object[] {
					Integer.valueOf(6)
				}));
	//   13   32:new             #94  <Class FacebookException>
	//   14   35:dup             
	//   15   36:getstatic       #277 <Field Locale Locale.ROOT>
	//   16   39:ldc2            #279 <String "Cannot add more than %d photos.">
	//   17   42:iconst_1        
	//   18   43:anewarray       Object[]
	//   19   46:dup             
	//   20   47:iconst_0        
	//   21   48:bipush          6
	//   22   50:invokestatic    #285 <Method Integer Integer.valueOf(int)>
	//   23   53:aastore         
	//   24   54:invokestatic    #289 <Method String String.format(Locale, String, Object[])>
	//   25   57:invokespecial   #99  <Method void FacebookException(String)>
	//   26   60:athrow          
			for(sharephotocontent = ((SharePhotoContent) (((List) (sharephotocontent)).iterator())); ((Iterator) (sharephotocontent)).hasNext(); validator.validate((SharePhoto)((Iterator) (sharephotocontent)).next()));
	//   27   61:aload_0         
	//   28   62:invokeinterface #246 <Method Iterator List.iterator()>
	//   29   67:astore_0        
	//   30   68:aload_0         
	//   31   69:invokeinterface #236 <Method boolean Iterator.hasNext()>
	//   32   74:ifeq            93
	//   33   77:aload_1         
	//   34   78:aload_0         
	//   35   79:invokeinterface #240 <Method Object Iterator.next()>
	//   36   84:checkcast       #259 <Class SharePhoto>
	//   37   87:invokevirtual   #262 <Method void ShareContentValidation$Validator.validate(SharePhoto)>
	//*  38   90:goto            68
			return;
	//   39   93:return          
		} else
		{
			throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
	//   40   94:new             #94  <Class FacebookException>
	//   41   97:dup             
	//   42   98:ldc2            #291 <String "Must specify at least one Photo in SharePhotoContent.">
	//   43  101:invokespecial   #99  <Method void FacebookException(String)>
	//   44  104:athrow          
		}
	}

	private static void validatePhotoForApi(SharePhoto sharephoto, Validator validator)
	{
		if(sharephoto == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new FacebookException("Cannot share a null SharePhoto");
	//    2    4:new             #94  <Class FacebookException>
	//    3    7:dup             
	//    4    8:ldc2            #293 <String "Cannot share a null SharePhoto">
	//    5   11:invokespecial   #99  <Method void FacebookException(String)>
	//    6   14:athrow          
		android.graphics.Bitmap bitmap = sharephoto.getBitmap();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #297 <Method android.graphics.Bitmap SharePhoto.getBitmap()>
	//    9   19:astore_2        
		sharephoto = ((SharePhoto) (sharephoto.getImageUrl()));
	//   10   20:aload_0         
	//   11   21:invokevirtual   #298 <Method android.net.Uri SharePhoto.getImageUrl()>
	//   12   24:astore_0        
		if(bitmap == null)
	//*  13   25:aload_2         
	//*  14   26:ifnonnull       69
		{
			if(sharephoto == null)
	//*  15   29:aload_0         
	//*  16   30:ifnonnull       44
				throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
	//   17   33:new             #94  <Class FacebookException>
	//   18   36:dup             
	//   19   37:ldc2            #300 <String "SharePhoto does not have a Bitmap or ImageUrl specified">
	//   20   40:invokespecial   #99  <Method void FacebookException(String)>
	//   21   43:athrow          
			if(Utility.isWebUri(((android.net.Uri) (sharephoto))) && !validator.isOpenGraphContent())
	//*  22   44:aload_0         
	//*  23   45:invokestatic    #143 <Method boolean Utility.isWebUri(android.net.Uri)>
	//*  24   48:ifeq            69
	//*  25   51:aload_1         
	//*  26   52:invokevirtual   #303 <Method boolean ShareContentValidation$Validator.isOpenGraphContent()>
	//*  27   55:ifne            69
				throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
	//   28   58:new             #94  <Class FacebookException>
	//   29   61:dup             
	//   30   62:ldc2            #305 <String "Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent">
	//   31   65:invokespecial   #99  <Method void FacebookException(String)>
	//   32   68:athrow          
		}
	//   33   69:return          
	}

	private static void validatePhotoForNativeDialog(SharePhoto sharephoto, Validator validator)
	{
		validatePhotoForApi(sharephoto, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #50  <Method void validatePhotoForApi(SharePhoto, ShareContentValidation$Validator)>
		if(sharephoto.getBitmap() != null || !Utility.isWebUri(sharephoto.getImageUrl()))
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #297 <Method android.graphics.Bitmap SharePhoto.getBitmap()>
	//*   5    9:ifnonnull       22
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #298 <Method android.net.Uri SharePhoto.getImageUrl()>
	//*   8   16:invokestatic    #143 <Method boolean Utility.isWebUri(android.net.Uri)>
	//*   9   19:ifne            28
			Validate.hasContentProvider(FacebookSdk.getApplicationContext());
	//   10   22:invokestatic    #311 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   11   25:invokestatic    #317 <Method void Validate.hasContentProvider(android.content.Context)>
	//   12   28:return          
	}

	private static void validatePhotoForWebDialog(SharePhoto sharephoto, Validator validator)
	{
		if(sharephoto == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new FacebookException("Cannot share a null SharePhoto");
	//    2    4:new             #94  <Class FacebookException>
	//    3    7:dup             
	//    4    8:ldc2            #293 <String "Cannot share a null SharePhoto">
	//    5   11:invokespecial   #99  <Method void FacebookException(String)>
	//    6   14:athrow          
		sharephoto = ((SharePhoto) (sharephoto.getImageUrl()));
	//    7   15:aload_0         
	//    8   16:invokevirtual   #298 <Method android.net.Uri SharePhoto.getImageUrl()>
	//    9   19:astore_0        
		if(sharephoto != null && Utility.isWebUri(((android.net.Uri) (sharephoto))))
	//*  10   20:aload_0         
	//*  11   21:ifnull          35
	//*  12   24:aload_0         
	//*  13   25:invokestatic    #143 <Method boolean Utility.isWebUri(android.net.Uri)>
	//*  14   28:ifne            34
	//*  15   31:goto            35
			return;
	//   16   34:return          
		else
			throw new FacebookException("SharePhoto must have a non-null imageUrl set to the Uri of an image on the web");
	//   17   35:new             #94  <Class FacebookException>
	//   18   38:dup             
	//   19   39:ldc2            #319 <String "SharePhoto must have a non-null imageUrl set to the Uri of an image on the web">
	//   20   42:invokespecial   #99  <Method void FacebookException(String)>
	//   21   45:athrow          
	}

	private static void validateVideo(ShareVideo sharevideo, Validator validator)
	{
		if(sharevideo == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
			throw new FacebookException("Cannot share a null ShareVideo");
	//    2    4:new             #94  <Class FacebookException>
	//    3    7:dup             
	//    4    8:ldc2            #321 <String "Cannot share a null ShareVideo">
	//    5   11:invokespecial   #99  <Method void FacebookException(String)>
	//    6   14:athrow          
		sharevideo = ((ShareVideo) (sharevideo.getLocalUrl()));
	//    7   15:aload_0         
	//    8   16:invokevirtual   #326 <Method android.net.Uri ShareVideo.getLocalUrl()>
	//    9   19:astore_0        
		if(sharevideo == null)
	//*  10   20:aload_0         
	//*  11   21:ifnonnull       35
			throw new FacebookException("ShareVideo does not have a LocalUrl specified");
	//   12   24:new             #94  <Class FacebookException>
	//   13   27:dup             
	//   14   28:ldc2            #328 <String "ShareVideo does not have a LocalUrl specified">
	//   15   31:invokespecial   #99  <Method void FacebookException(String)>
	//   16   34:athrow          
		if(!Utility.isContentUri(((android.net.Uri) (sharevideo))) && !Utility.isFileUri(((android.net.Uri) (sharevideo))))
	//*  17   35:aload_0         
	//*  18   36:invokestatic    #331 <Method boolean Utility.isContentUri(android.net.Uri)>
	//*  19   39:ifne            60
	//*  20   42:aload_0         
	//*  21   43:invokestatic    #334 <Method boolean Utility.isFileUri(android.net.Uri)>
	//*  22   46:ifne            60
			throw new FacebookException("ShareVideo must reference a video that is on the device");
	//   23   49:new             #94  <Class FacebookException>
	//   24   52:dup             
	//   25   53:ldc2            #336 <String "ShareVideo must reference a video that is on the device">
	//   26   56:invokespecial   #99  <Method void FacebookException(String)>
	//   27   59:athrow          
		else
			return;
	//   28   60:return          
	}

	private static void validateVideoContent(ShareVideoContent sharevideocontent, Validator validator)
	{
		validator.validate(sharevideocontent.getVideo());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #340 <Method ShareVideo ShareVideoContent.getVideo()>
	//    3    5:invokevirtual   #343 <Method void ShareContentValidation$Validator.validate(ShareVideo)>
		sharevideocontent = ((ShareVideoContent) (sharevideocontent.getPreviewPhoto()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #347 <Method SharePhoto ShareVideoContent.getPreviewPhoto()>
	//    6   12:astore_0        
		if(sharevideocontent != null)
	//*   7   13:aload_0         
	//*   8   14:ifnull          22
			validator.validate(((SharePhoto) (sharevideocontent)));
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #262 <Method void ShareContentValidation$Validator.validate(SharePhoto)>
	//   12   22:return          
	}

	private static Validator ApiValidator;
	private static Validator DefaultValidator;
	private static Validator WebShareValidator;


/*
	static void access$1000(ShareOpenGraphObject shareopengraphobject, Validator validator)
	{
		validateOpenGraphObject(shareopengraphobject, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #27  <Method void validateOpenGraphObject(ShareOpenGraphObject, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$1100(ShareOpenGraphValueContainer shareopengraphvaluecontainer, Validator validator, boolean flag)
	{
		validateOpenGraphValueContainer(shareopengraphvaluecontainer, validator, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #32  <Method void validateOpenGraphValueContainer(ShareOpenGraphValueContainer, ShareContentValidation$Validator, boolean)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$1200(SharePhoto sharephoto, Validator validator)
	{
		validatePhotoForNativeDialog(sharephoto, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #37  <Method void validatePhotoForNativeDialog(SharePhoto, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$1300(ShareVideo sharevideo, Validator validator)
	{
		validateVideo(sharevideo, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #42  <Method void validateVideo(ShareVideo, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$300(SharePhoto sharephoto, Validator validator)
	{
		validatePhotoForWebDialog(sharephoto, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #46  <Method void validatePhotoForWebDialog(SharePhoto, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$400(SharePhoto sharephoto, Validator validator)
	{
		validatePhotoForApi(sharephoto, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #50  <Method void validatePhotoForApi(SharePhoto, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$500(ShareLinkContent sharelinkcontent, Validator validator)
	{
		validateLinkContent(sharelinkcontent, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #55  <Method void validateLinkContent(ShareLinkContent, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$600(SharePhotoContent sharephotocontent, Validator validator)
	{
		validatePhotoContent(sharephotocontent, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #60  <Method void validatePhotoContent(SharePhotoContent, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$700(ShareVideoContent sharevideocontent, Validator validator)
	{
		validateVideoContent(sharevideocontent, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #65  <Method void validateVideoContent(ShareVideoContent, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$800(ShareOpenGraphContent shareopengraphcontent, Validator validator)
	{
		validateOpenGraphContent(shareopengraphcontent, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #70  <Method void validateOpenGraphContent(ShareOpenGraphContent, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$900(ShareOpenGraphAction shareopengraphaction, Validator validator)
	{
		validateOpenGraphAction(shareopengraphaction, validator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #75  <Method void validateOpenGraphAction(ShareOpenGraphAction, ShareContentValidation$Validator)>
		return;
	//    3    5:return          
	}

*/
}
