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

	public void validate(ShareLinkContent sharelinkcontent)
	{
		ShareContentValidation.access$500(sharelinkcontent, this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #25  <Method void ShareContentValidation.access$500(ShareLinkContent, ShareContentValidation$Validator)>
	//    3    5:return          
	}

	public void validate(ShareOpenGraphAction shareopengraphaction)
	{
		ShareContentValidation.access$900(shareopengraphaction, this);
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
		ShareContentValidation.access$800(shareopengraphcontent, this);
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokestatic    #35  <Method void ShareContentValidation.access$800(ShareOpenGraphContent, ShareContentValidation$Validator)>
	//    6   10:return          
	}

	public void validate(ShareOpenGraphObject shareopengraphobject)
	{
		ShareContentValidation.access$1000(shareopengraphobject, this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #40  <Method void ShareContentValidation.access$1000(ShareOpenGraphObject, ShareContentValidation$Validator)>
	//    3    5:return          
	}

	public void validate(ShareOpenGraphValueContainer shareopengraphvaluecontainer, boolean flag)
	{
		ShareContentValidation.access$1100(shareopengraphvaluecontainer, this, flag);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:iload_2         
	//    3    3:invokestatic    #45  <Method void ShareContentValidation.access$1100(ShareOpenGraphValueContainer, ShareContentValidation$Validator, boolean)>
	//    4    6:return          
	}

	public void validate(SharePhoto sharephoto)
	{
		ShareContentValidation.access$1200(sharephoto, this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #50  <Method void ShareContentValidation.access$1200(SharePhoto, ShareContentValidation$Validator)>
	//    3    5:return          
	}

	public void validate(SharePhotoContent sharephotocontent)
	{
		ShareContentValidation.access$600(sharephotocontent, this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #55  <Method void ShareContentValidation.access$600(SharePhotoContent, ShareContentValidation$Validator)>
	//    3    5:return          
	}

	public void validate(ShareVideo sharevideo)
	{
		ShareContentValidation.access$1300(sharevideo, this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #60  <Method void ShareContentValidation.access$1300(ShareVideo, ShareContentValidation$Validator)>
	//    3    5:return          
	}

	public void validate(ShareVideoContent sharevideocontent)
	{
		ShareContentValidation.access$700(sharevideocontent, this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #65  <Method void ShareContentValidation.access$700(ShareVideoContent, ShareContentValidation$Validator)>
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
