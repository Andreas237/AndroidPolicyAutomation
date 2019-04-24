// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import android.support.v4.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.gigya.socialize.android.GSAPI;
import com.gigya.socialize.android.GSSession;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			FacebookProvider

class FacebookProvider$1 extends AccessTokenTracker
{

	protected void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1)
	{
		if(FacebookProvider.access$000(FacebookProvider.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field FacebookProvider this$0>
	//*   2    4:invokestatic    #22  <Method FragmentActivity FacebookProvider.access$000(FacebookProvider)>
	//*   3    7:ifnull          29
		{
			FacebookProvider.access$000(FacebookProvider.this).finish();
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field FacebookProvider this$0>
	//    6   14:invokestatic    #22  <Method FragmentActivity FacebookProvider.access$000(FacebookProvider)>
	//    7   17:invokevirtual   #27  <Method void FragmentActivity.finish()>
			FacebookProvider.access$002(FacebookProvider.this, ((FragmentActivity) (null)));
	//    8   20:aload_0         
	//    9   21:getfield        #14  <Field FacebookProvider this$0>
	//   10   24:aconst_null     
	//   11   25:invokestatic    #31  <Method FragmentActivity FacebookProvider.access$002(FacebookProvider, FragmentActivity)>
	//   12   28:pop             
		}
		FacebookProvider.access$102(FacebookProvider.this, ((com.gigya.socialize.android.GSPermissionResultHandler) (null)));
	//   13   29:aload_0         
	//   14   30:getfield        #14  <Field FacebookProvider this$0>
	//   15   33:aconst_null     
	//   16   34:invokestatic    #35  <Method com.gigya.socialize.android.GSPermissionResultHandler FacebookProvider.access$102(FacebookProvider, com.gigya.socialize.android.GSPermissionResultHandler)>
	//   17   37:pop             
		accesstoken = ((AccessToken) (GSAPI.getInstance().getSession()));
	//   18   38:invokestatic    #41  <Method GSAPI GSAPI.getInstance()>
	//   19   41:invokevirtual   #45  <Method GSSession GSAPI.getSession()>
	//   20   44:astore_1        
		if(FacebookProvider.isLoggedIn() && accesstoken != null)
	//*  21   45:invokestatic    #49  <Method boolean FacebookProvider.isLoggedIn()>
	//*  22   48:ifeq            71
	//*  23   51:aload_1         
	//*  24   52:ifnull          71
		{
			if(!((GSSession) (accesstoken)).isValid())
	//*  25   55:aload_1         
	//*  26   56:invokevirtual   #54  <Method boolean GSSession.isValid()>
	//*  27   59:ifne            63
				return;
	//   28   62:return          
			FacebookProvider.access$200(FacebookProvider.this, accesstoken1);
	//   29   63:aload_0         
	//   30   64:getfield        #14  <Field FacebookProvider this$0>
	//   31   67:aload_2         
	//   32   68:invokestatic    #58  <Method void FacebookProvider.access$200(FacebookProvider, AccessToken)>
		}
	//   33   71:return          
	}

	final FacebookProvider this$0;

	FacebookProvider$1()
	{
		this$0 = FacebookProvider.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field FacebookProvider this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AccessTokenTracker()>
	//    5    9:return          
	}
}
