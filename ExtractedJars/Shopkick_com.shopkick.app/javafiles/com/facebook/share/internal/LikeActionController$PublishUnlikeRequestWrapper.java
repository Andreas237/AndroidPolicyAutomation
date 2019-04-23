// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.*;
import com.facebook.internal.Logger;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

private class LikeActionController$PublishUnlikeRequestWrapper extends LikeActionController.AbstractRequestWrapper
{

	protected void processError(FacebookRequestError facebookrequesterror)
	{
		Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error unliking object with unlike token '%s' : %s", new Object[] {
			unlikeToken, facebookrequesterror
		});
	//    0    0:getstatic       #50  <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//    1    3:invokestatic    #54  <Method String LikeActionController.access$100()>
	//    2    6:ldc1            #56  <String "Error unliking object with unlike token '%s' : %s">
	//    3    8:iconst_2        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_0         
	//    8   15:getfield        #20  <Field String unlikeToken>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:aload_1         
	//   13   22:aastore         
	//   14   23:invokestatic    #64  <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		LikeActionController.access$2400(LikeActionController.this, "publish_unlike", facebookrequesterror);
	//   15   26:aload_0         
	//   16   27:getfield        #15  <Field LikeActionController this$0>
	//   17   30:ldc1            #66  <String "publish_unlike">
	//   18   32:aload_1         
	//   19   33:invokestatic    #70  <Method void LikeActionController.access$2400(LikeActionController, String, FacebookRequestError)>
	//   20   36:return          
	}

	protected void processSuccess(GraphResponse graphresponse)
	{
	//    0    0:return          
	}

	final LikeActionController this$0;
	private String unlikeToken;

	LikeActionController$PublishUnlikeRequestWrapper(String s)
	{
		this$0 = LikeActionController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field LikeActionController this$0>
		super(LikeActionController.this, ((String) (null)), ((com.facebook.share.widget.LikeView.ObjectType) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:aconst_null     
	//    7    9:invokespecial   #18  <Method void LikeActionController$AbstractRequestWrapper(LikeActionController, String, com.facebook.share.widget.LikeView$ObjectType)>
		unlikeToken = s;
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:putfield        #20  <Field String unlikeToken>
		setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), s, ((android.os.Bundle) (null)), HttpMethod.DELETE));
	//   11   17:aload_0         
	//   12   18:new             #22  <Class GraphRequest>
	//   13   21:dup             
	//   14   22:invokestatic    #28  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   15   25:aload_2         
	//   16   26:aconst_null     
	//   17   27:getstatic       #34  <Field HttpMethod HttpMethod.DELETE>
	//   18   30:invokespecial   #37  <Method void GraphRequest(AccessToken, String, android.os.Bundle, HttpMethod)>
	//   19   33:invokevirtual   #41  <Method void setRequest(GraphRequest)>
	//   20   36:return          
	}
}
