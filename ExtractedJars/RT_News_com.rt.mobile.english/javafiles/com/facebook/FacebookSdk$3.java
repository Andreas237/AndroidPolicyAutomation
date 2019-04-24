// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import java.util.concurrent.Callable;

// Referenced classes of package com.facebook:
//			FacebookSdk, AccessTokenManager, ProfileManager, AccessToken, 
//			Profile

static final class FacebookSdk$3
	implements Callable
{

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
		throws Exception
	{
		AccessTokenManager.getInstance().loadCurrentAccessToken();
	//    0    0:invokestatic    #36  <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:invokevirtual   #40  <Method boolean AccessTokenManager.loadCurrentAccessToken()>
	//    2    6:pop             
		ProfileManager.getInstance().loadCurrentProfile();
	//    3    7:invokestatic    #45  <Method ProfileManager ProfileManager.getInstance()>
	//    4   10:invokevirtual   #48  <Method boolean ProfileManager.loadCurrentProfile()>
	//    5   13:pop             
		if(AccessToken.getCurrentAccessToken() != null && Profile.getCurrentProfile() == null)
	//*   6   14:invokestatic    #54  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//*   7   17:ifnull          29
	//*   8   20:invokestatic    #60  <Method Profile Profile.getCurrentProfile()>
	//*   9   23:ifnonnull       29
			Profile.fetchProfileForCurrentAccessToken();
	//   10   26:invokestatic    #63  <Method void Profile.fetchProfileForCurrentAccessToken()>
		if(val$callback != null)
	//*  11   29:aload_0         
	//*  12   30:getfield        #18  <Field FacebookSdk$InitializeCallback val$callback>
	//*  13   33:ifnull          45
			val$callback.onInitialized();
	//   14   36:aload_0         
	//   15   37:getfield        #18  <Field FacebookSdk$InitializeCallback val$callback>
	//   16   40:invokeinterface #68  <Method void FacebookSdk$InitializeCallback.onInitialized()>
		return null;
	//   17   45:aconst_null     
	//   18   46:areturn         
	}

	final itializeCallback val$callback;

	FacebookSdk$3(itializeCallback itializecallback)
	{
		val$callback = itializecallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field FacebookSdk$InitializeCallback val$callback>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
