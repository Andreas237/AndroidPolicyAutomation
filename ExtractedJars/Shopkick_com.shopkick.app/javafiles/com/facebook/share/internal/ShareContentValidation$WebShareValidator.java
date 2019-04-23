// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.FacebookException;
import com.facebook.share.model.*;

// Referenced classes of package com.facebook.share.internal:
//			ShareContentValidation

private static class ShareContentValidation$WebShareValidator extends ShareContentValidation.Validator
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
		ShareContentValidation.access$500(sharephoto, ((ShareContentValidation.Validator) (this)));
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

	private ShareContentValidation$WebShareValidator()
	{
		super(((ShareContentValidation._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #12  <Method void ShareContentValidation$Validator(ShareContentValidation$1)>
	//    3    5:return          
	}

	ShareContentValidation$WebShareValidator(ShareContentValidation._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ShareContentValidation$WebShareValidator()>
	//    2    4:return          
	}
}
