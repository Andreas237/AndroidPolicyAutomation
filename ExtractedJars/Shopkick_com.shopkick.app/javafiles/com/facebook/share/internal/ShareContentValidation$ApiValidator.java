// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.share.model.*;

// Referenced classes of package com.facebook.share.internal:
//			ShareContentValidation

private static class ShareContentValidation$ApiValidator extends ShareContentValidation.Validator
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
		ShareContentValidation.access$600(sharephoto, ((ShareContentValidation.Validator) (this)));
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
	//*   5   11:invokevirtual   #54  <Method java.util.List ShareVideoContent.getPeopleIds()>
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

	private ShareContentValidation$ApiValidator()
	{
		super(((ShareContentValidation._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #12  <Method void ShareContentValidation$Validator(ShareContentValidation$1)>
	//    3    5:return          
	}

	ShareContentValidation$ApiValidator(ShareContentValidation._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ShareContentValidation$ApiValidator()>
	//    2    4:return          
	}
}
