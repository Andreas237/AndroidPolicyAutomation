// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.share.model.ShareStoryContent;

// Referenced classes of package com.facebook.share.internal:
//			ShareContentValidation

private static class ShareContentValidation$StoryShareValidator extends ShareContentValidation.Validator
{

	public void validate(ShareStoryContent sharestorycontent)
	{
		ShareContentValidation.access$400(sharestorycontent, ((ShareContentValidation.Validator) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #21  <Method void ShareContentValidation.access$400(ShareStoryContent, ShareContentValidation$Validator)>
	//    3    5:return          
	}

	private ShareContentValidation$StoryShareValidator()
	{
		super(((ShareContentValidation._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #12  <Method void ShareContentValidation$Validator(ShareContentValidation$1)>
	//    3    5:return          
	}

	ShareContentValidation$StoryShareValidator(ShareContentValidation._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ShareContentValidation$StoryShareValidator()>
	//    2    4:return          
	}
}
