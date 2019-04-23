// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.share.model.*;

// Referenced classes of package com.facebook.share.internal:
//			ShareContentValidation

private static class ShareContentValidation$Validator
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
		ShareContentValidation.access$1100(sharecameraeffectcontent, this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #25  <Method void ShareContentValidation.access$1100(ShareCameraEffectContent, ShareContentValidation$Validator)>
	//    3    5:return          
	}

	public void validate(ShareLinkContent sharelinkcontent)
	{
		ShareContentValidation.access$700(sharelinkcontent, this);
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
		ShareContentValidation.access$1000(sharemediacontent, this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #40  <Method void ShareContentValidation.access$1000(ShareMediaContent, ShareContentValidation$Validator)>
	//    3    5:return          
	}

	public void validate(ShareMessengerGenericTemplateContent sharemessengergenerictemplatecontent)
	{
		ShareContentValidation.access$1900(sharemessengergenerictemplatecontent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #44  <Method void ShareContentValidation.access$1900(ShareMessengerGenericTemplateContent)>
	//    2    4:return          
	}

	public void validate(ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent)
	{
		ShareContentValidation.access$2000(sharemessengermediatemplatecontent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #48  <Method void ShareContentValidation.access$2000(ShareMessengerMediaTemplateContent)>
	//    2    4:return          
	}

	public void validate(ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent)
	{
		ShareContentValidation.access$1800(sharemessengeropengraphmusictemplatecontent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #52  <Method void ShareContentValidation.access$1800(ShareMessengerOpenGraphMusicTemplateContent)>
	//    2    4:return          
	}

	public void validate(ShareOpenGraphAction shareopengraphaction)
	{
		ShareContentValidation.access$1300(shareopengraphaction, this);
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
		ShareContentValidation.access$1200(shareopengraphcontent, this);
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokestatic    #62  <Method void ShareContentValidation.access$1200(ShareOpenGraphContent, ShareContentValidation$Validator)>
	//    6   10:return          
	}

	public void validate(ShareOpenGraphObject shareopengraphobject)
	{
		ShareContentValidation.access$1400(shareopengraphobject, this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #67  <Method void ShareContentValidation.access$1400(ShareOpenGraphObject, ShareContentValidation$Validator)>
	//    3    5:return          
	}

	public void validate(ShareOpenGraphValueContainer shareopengraphvaluecontainer, boolean flag)
	{
		ShareContentValidation.access$1500(shareopengraphvaluecontainer, this, flag);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:iload_2         
	//    3    3:invokestatic    #72  <Method void ShareContentValidation.access$1500(ShareOpenGraphValueContainer, ShareContentValidation$Validator, boolean)>
	//    4    6:return          
	}

	public void validate(SharePhoto sharephoto)
	{
		ShareContentValidation.access$1600(sharephoto, this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #77  <Method void ShareContentValidation.access$1600(SharePhoto, ShareContentValidation$Validator)>
	//    3    5:return          
	}

	public void validate(SharePhotoContent sharephotocontent)
	{
		ShareContentValidation.access$800(sharephotocontent, this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #82  <Method void ShareContentValidation.access$800(SharePhotoContent, ShareContentValidation$Validator)>
	//    3    5:return          
	}

	public void validate(ShareStoryContent sharestorycontent)
	{
		ShareContentValidation.access$400(sharestorycontent, this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #87  <Method void ShareContentValidation.access$400(ShareStoryContent, ShareContentValidation$Validator)>
	//    3    5:return          
	}

	public void validate(ShareVideo sharevideo)
	{
		ShareContentValidation.access$1700(sharevideo, this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #92  <Method void ShareContentValidation.access$1700(ShareVideo, ShareContentValidation$Validator)>
	//    3    5:return          
	}

	public void validate(ShareVideoContent sharevideocontent)
	{
		ShareContentValidation.access$900(sharevideocontent, this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #97  <Method void ShareContentValidation.access$900(ShareVideoContent, ShareContentValidation$Validator)>
	//    3    5:return          
	}

	private boolean isOpenGraphContent;

	private ShareContentValidation$Validator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		isOpenGraphContent = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #15  <Field boolean isOpenGraphContent>
	//    5    9:return          
	}

	ShareContentValidation$Validator(ShareContentValidation._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void ShareContentValidation$Validator()>
	//    2    4:return          
	}
}
