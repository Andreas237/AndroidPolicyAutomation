// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.facebook.CallbackManager;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginManager;
import com.gigya.socialize.android.GSPermissionResultHandler;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			FacebookProvider

class FacebookProvider$3
	implements com.gigya.socialize.android.ui.tivityHandler
{

	public void onActivityResult(FragmentActivity fragmentactivity, int i, int j, Intent intent)
	{
		FacebookProvider.access$500(FacebookProvider.this).onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field FacebookProvider this$0>
	//    2    4:invokestatic    #39  <Method CallbackManager FacebookProvider.access$500(FacebookProvider)>
	//    3    7:iload_2         
	//    4    8:iload_3         
	//    5    9:aload           4
	//    6   11:invokeinterface #44  <Method boolean CallbackManager.onActivityResult(int, int, Intent)>
	//    7   16:pop             
	//    8   17:return          
	}

	public void onCancel(FragmentActivity fragmentactivity)
	{
		val$callback.onResult(false, ((Exception) (null)), ((List) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field GSPermissionResultHandler val$callback>
	//    2    4:iconst_0        
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokeinterface #52  <Method void GSPermissionResultHandler.onResult(boolean, Exception, List)>
	//    6   12:return          
	}

	public void onCreate(FragmentActivity fragmentactivity, Bundle bundle)
	{
		FacebookProvider.access$002(FacebookProvider.this, fragmentactivity);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field FacebookProvider this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #58  <Method FragmentActivity FacebookProvider.access$002(FacebookProvider, FragmentActivity)>
	//    4    8:pop             
		FacebookProvider.access$702(FacebookProvider.this, ((List) (new ArrayList(((java.util.Collection) (val$permissions))))));
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field FacebookProvider this$0>
	//    7   13:new             #60  <Class ArrayList>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #25  <Field List val$permissions>
	//   11   21:invokespecial   #63  <Method void ArrayList(java.util.Collection)>
	//   12   24:invokestatic    #67  <Method List FacebookProvider.access$702(FacebookProvider, List)>
	//   13   27:pop             
		FacebookProvider.access$400(FacebookProvider.this).setDefaultAudience(DefaultAudience.FRIENDS);
	//   14   28:aload_0         
	//   15   29:getfield        #23  <Field FacebookProvider this$0>
	//   16   32:invokestatic    #71  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
	//   17   35:getstatic       #77  <Field DefaultAudience DefaultAudience.FRIENDS>
	//   18   38:invokevirtual   #83  <Method LoginManager LoginManager.setDefaultAudience(DefaultAudience)>
	//   19   41:pop             
		if(val$type.equals("publish"))
	//*  20   42:aload_0         
	//*  21   43:getfield        #27  <Field String val$type>
	//*  22   46:ldc1            #85  <String "publish">
	//*  23   48:invokevirtual   #91  <Method boolean String.equals(Object)>
	//*  24   51:ifeq            70
		{
			FacebookProvider.access$400(FacebookProvider.this).logInWithPublishPermissions(((android.app.Activity) (fragmentactivity)), ((java.util.Collection) (val$permissions)));
	//   25   54:aload_0         
	//   26   55:getfield        #23  <Field FacebookProvider this$0>
	//   27   58:invokestatic    #71  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
	//   28   61:aload_1         
	//   29   62:aload_0         
	//   30   63:getfield        #25  <Field List val$permissions>
	//   31   66:invokevirtual   #95  <Method void LoginManager.logInWithPublishPermissions(android.app.Activity, java.util.Collection)>
			return;
	//   32   69:return          
		} else
		{
			FacebookProvider.access$400(FacebookProvider.this).logInWithReadPermissions(((android.app.Activity) (fragmentactivity)), ((java.util.Collection) (val$permissions)));
	//   33   70:aload_0         
	//   34   71:getfield        #23  <Field FacebookProvider this$0>
	//   35   74:invokestatic    #71  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
	//   36   77:aload_1         
	//   37   78:aload_0         
	//   38   79:getfield        #25  <Field List val$permissions>
	//   39   82:invokevirtual   #98  <Method void LoginManager.logInWithReadPermissions(android.app.Activity, java.util.Collection)>
			return;
	//   40   85:return          
		}
	}

	public void onResume(FragmentActivity fragmentactivity)
	{
	//    0    0:return          
	}

	public void onStart(FragmentActivity fragmentactivity)
	{
	//    0    0:return          
	}

	final FacebookProvider this$0;
	final GSPermissionResultHandler val$callback;
	final List val$permissions;
	final String val$type;

	FacebookProvider$3()
	{
		this$0 = final_facebookprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field FacebookProvider this$0>
		val$permissions = list;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field List val$permissions>
		val$type = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field String val$type>
		val$callback = GSPermissionResultHandler.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field GSPermissionResultHandler val$callback>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
