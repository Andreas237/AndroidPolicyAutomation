// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.Context;
import com.facebook.appevents.AppEventsLogger;
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
	//    1    1:invokevirtual   #33  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
		throws Exception
	{
		AccessTokenManager.getInstance().loadCurrentAccessToken();
	//    0    0:invokestatic    #40  <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:invokevirtual   #44  <Method boolean AccessTokenManager.loadCurrentAccessToken()>
	//    2    6:pop             
		ProfileManager.getInstance().loadCurrentProfile();
	//    3    7:invokestatic    #49  <Method ProfileManager ProfileManager.getInstance()>
	//    4   10:invokevirtual   #52  <Method boolean ProfileManager.loadCurrentProfile()>
	//    5   13:pop             
		if(AccessToken.isCurrentAccessTokenActive() && Profile.getCurrentProfile() == null)
	//*   6   14:invokestatic    #57  <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//*   7   17:ifeq            29
	//*   8   20:invokestatic    #63  <Method Profile Profile.getCurrentProfile()>
	//*   9   23:ifnonnull       29
			Profile.fetchProfileForCurrentAccessToken();
	//   10   26:invokestatic    #66  <Method void Profile.fetchProfileForCurrentAccessToken()>
		itializeCallback itializecallback = val$callback;
	//   11   29:aload_0         
	//   12   30:getfield        #20  <Field FacebookSdk$InitializeCallback val$callback>
	//   13   33:astore_1        
		if(itializecallback != null)
	//*  14   34:aload_1         
	//*  15   35:ifnull          44
			itializecallback.onInitialized();
	//   16   38:aload_1         
	//   17   39:invokeinterface #71  <Method void FacebookSdk$InitializeCallback.onInitialized()>
		AppEventsLogger.initializeLib(FacebookSdk.access$000(), FacebookSdk.access$100());
	//   18   44:invokestatic    #75  <Method Context FacebookSdk.access$000()>
	//   19   47:invokestatic    #79  <Method String FacebookSdk.access$100()>
	//   20   50:invokestatic    #85  <Method void AppEventsLogger.initializeLib(Context, String)>
		AppEventsLogger.newLogger(val$applicationContext.getApplicationContext()).flush();
	//   21   53:aload_0         
	//   22   54:getfield        #22  <Field Context val$applicationContext>
	//   23   57:invokevirtual   #90  <Method Context Context.getApplicationContext()>
	//   24   60:invokestatic    #94  <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
	//   25   63:invokevirtual   #97  <Method void AppEventsLogger.flush()>
		return null;
	//   26   66:aconst_null     
	//   27   67:areturn         
	}

	final Context val$applicationContext;
	final itializeCallback val$callback;

	FacebookSdk$3(itializeCallback itializecallback, Context context)
	{
		val$callback = itializecallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field FacebookSdk$InitializeCallback val$callback>
		val$applicationContext = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Context val$applicationContext>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
