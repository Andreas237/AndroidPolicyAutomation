// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.facebook.*;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.GSAPI;
import com.gigya.socialize.android.GSSession;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			FacebookProvider

class FacebookProvider$2
	implements com.gigya.socialize.android.ui.tivityHandler
{

	public void onActivityResult(FragmentActivity fragmentactivity, int i, int j, Intent intent)
	{
		FacebookProvider.access$500(FacebookProvider.this).onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field FacebookProvider this$0>
	//    2    4:invokestatic    #45  <Method CallbackManager FacebookProvider.access$500(FacebookProvider)>
	//    3    7:iload_2         
	//    4    8:iload_3         
	//    5    9:aload           4
	//    6   11:invokeinterface #50  <Method boolean CallbackManager.onActivityResult(int, int, Intent)>
	//    7   16:pop             
	//    8   17:return          
	}

	public void onCancel(FragmentActivity fragmentactivity)
	{
		cancel(val$callback);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field FacebookProvider this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field LoginProvider$ProviderCallback val$callback>
	//    4    8:invokevirtual   #56  <Method void FacebookProvider.cancel(LoginProvider$ProviderCallback)>
	//    5   11:return          
	}

	public void onCreate(final FragmentActivity activity, Bundle bundle)
	{
		try
		{
			FacebookProvider.access$400(FacebookProvider.this).setLoginBehavior(FacebookProvider.access$300(FacebookProvider.this, val$params));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field FacebookProvider this$0>
	//    2    4:invokestatic    #64  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field FacebookProvider this$0>
	//    5   11:aload_0         
	//    6   12:getfield        #29  <Field GSObject val$params>
	//    7   15:invokestatic    #68  <Method com.facebook.login.LoginBehavior FacebookProvider.access$300(FacebookProvider, GSObject)>
	//    8   18:invokevirtual   #74  <Method LoginManager LoginManager.setLoginBehavior(com.facebook.login.LoginBehavior)>
	//    9   21:pop             
			FacebookProvider.access$400(FacebookProvider.this).registerCallback(FacebookProvider.access$500(FacebookProvider.this), new FacebookCallback() {

				public void onCancel()
				{
					activity.finish();
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field FragmentActivity val$activity>
				//    2    4:invokevirtual   #32  <Method void FragmentActivity.finish()>
					cancel(callback);
				//    3    7:aload_0         
				//    4    8:getfield        #20  <Field FacebookProvider$2 this$1>
				//    5   11:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
				//    6   14:aload_0         
				//    7   15:getfield        #20  <Field FacebookProvider$2 this$1>
				//    8   18:getfield        #40  <Field LoginProvider$ProviderCallback FacebookProvider$2.val$callback>
				//    9   21:invokevirtual   #46  <Method void FacebookProvider.cancel(LoginProvider$ProviderCallback)>
					FacebookProvider.access$400(this$0).registerCallback(FacebookProvider.access$500(this$0), ((FacebookCallback) (null)));
				//   10   24:aload_0         
				//   11   25:getfield        #20  <Field FacebookProvider$2 this$1>
				//   12   28:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
				//   13   31:invokestatic    #50  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
				//   14   34:aload_0         
				//   15   35:getfield        #20  <Field FacebookProvider$2 this$1>
				//   16   38:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
				//   17   41:invokestatic    #54  <Method CallbackManager FacebookProvider.access$500(FacebookProvider)>
				//   18   44:aconst_null     
				//   19   45:invokevirtual   #60  <Method void LoginManager.registerCallback(CallbackManager, FacebookCallback)>
				//   20   48:return          
				}

				public void onError(FacebookException facebookexception)
				{
					activity.finish();
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field FragmentActivity val$activity>
				//    2    4:invokevirtual   #32  <Method void FragmentActivity.finish()>
					fail(callback, facebookexception.getMessage());
				//    3    7:aload_0         
				//    4    8:getfield        #20  <Field FacebookProvider$2 this$1>
				//    5   11:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
				//    6   14:aload_0         
				//    7   15:getfield        #20  <Field FacebookProvider$2 this$1>
				//    8   18:getfield        #40  <Field LoginProvider$ProviderCallback FacebookProvider$2.val$callback>
				//    9   21:aload_1         
				//   10   22:invokevirtual   #68  <Method String FacebookException.getMessage()>
				//   11   25:invokevirtual   #72  <Method void FacebookProvider.fail(LoginProvider$ProviderCallback, String)>
					FacebookProvider.access$400(this$0).registerCallback(FacebookProvider.access$500(this$0), ((FacebookCallback) (null)));
				//   12   28:aload_0         
				//   13   29:getfield        #20  <Field FacebookProvider$2 this$1>
				//   14   32:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
				//   15   35:invokestatic    #50  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
				//   16   38:aload_0         
				//   17   39:getfield        #20  <Field FacebookProvider$2 this$1>
				//   18   42:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
				//   19   45:invokestatic    #54  <Method CallbackManager FacebookProvider.access$500(FacebookProvider)>
				//   20   48:aconst_null     
				//   21   49:invokevirtual   #60  <Method void LoginManager.registerCallback(CallbackManager, FacebookCallback)>
				//   22   52:return          
				}

				public void onSuccess(LoginResult loginresult)
				{
					activity.finish();
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field FragmentActivity val$activity>
				//    2    4:invokevirtual   #32  <Method void FragmentActivity.finish()>
					loginresult = ((LoginResult) (GSAPI.getInstance().getSession()));
				//    3    7:invokestatic    #80  <Method GSAPI GSAPI.getInstance()>
				//    4   10:invokevirtual   #84  <Method GSSession GSAPI.getSession()>
				//    5   13:astore_1        
					AccessToken accesstoken = FacebookProvider.access$600();
				//    6   14:invokestatic    #88  <Method AccessToken FacebookProvider.access$600()>
				//    7   17:astore          4
					AccessToken accesstoken1 = fbAccessTokenBeforeLogin;
				//    8   19:aload_0         
				//    9   20:getfield        #20  <Field FacebookProvider$2 this$1>
				//   10   23:getfield        #92  <Field AccessToken FacebookProvider$2.val$fbAccessTokenBeforeLogin>
				//   11   26:astore          5
					boolean flag1 = true;
				//   12   28:iconst_1        
				//   13   29:istore_3        
					boolean flag;
					if(accesstoken1 != null)
				//*  14   30:aload           5
				//*  15   32:ifnull          80
					{
						flag = accesstoken.getApplicationId().equals(((Object) (fbAccessTokenBeforeLogin.getApplicationId()))) ^ true;
				//   16   35:aload           4
				//   17   37:invokevirtual   #97  <Method String AccessToken.getApplicationId()>
				//   18   40:aload_0         
				//   19   41:getfield        #20  <Field FacebookProvider$2 this$1>
				//   20   44:getfield        #92  <Field AccessToken FacebookProvider$2.val$fbAccessTokenBeforeLogin>
				//   21   47:invokevirtual   #97  <Method String AccessToken.getApplicationId()>
				//   22   50:invokevirtual   #103 <Method boolean String.equals(Object)>
				//   23   53:iconst_1        
				//   24   54:ixor            
				//   25   55:istore_2        
						flag1 = true ^ accesstoken.getUserId().equals(((Object) (fbAccessTokenBeforeLogin.getUserId())));
				//   26   56:iconst_1        
				//   27   57:aload           4
				//   28   59:invokevirtual   #106 <Method String AccessToken.getUserId()>
				//   29   62:aload_0         
				//   30   63:getfield        #20  <Field FacebookProvider$2 this$1>
				//   31   66:getfield        #92  <Field AccessToken FacebookProvider$2.val$fbAccessTokenBeforeLogin>
				//   32   69:invokevirtual   #106 <Method String AccessToken.getUserId()>
				//   33   72:invokevirtual   #103 <Method boolean String.equals(Object)>
				//   34   75:ixor            
				//   35   76:istore_3        
					} else
				//*  36   77:goto            82
					{
						flag = true;
				//   37   80:iconst_1        
				//   38   81:istore_2        
					}
					if(!flag && !flag1 && loginresult != null && ((GSSession) (loginresult)).isValid())
				//*  39   82:iload_2         
				//*  40   83:ifne            119
				//*  41   86:iload_3         
				//*  42   87:ifne            119
				//*  43   90:aload_1         
				//*  44   91:ifnull          119
				//*  45   94:aload_1         
				//*  46   95:invokevirtual   #112 <Method boolean GSSession.isValid()>
				//*  47   98:ifne            104
				//*  48  101:goto            119
						FacebookProvider.access$200(this$0, accesstoken);
				//   49  104:aload_0         
				//   50  105:getfield        #20  <Field FacebookProvider$2 this$1>
				//   51  108:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
				//   52  111:aload           4
				//   53  113:invokestatic    #116 <Method void FacebookProvider.access$200(FacebookProvider, AccessToken)>
					else
				//*  54  116:goto            149
						success(callback, accesstoken.getToken(), accesstoken.getExpires().getTime());
				//   55  119:aload_0         
				//   56  120:getfield        #20  <Field FacebookProvider$2 this$1>
				//   57  123:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
				//   58  126:aload_0         
				//   59  127:getfield        #20  <Field FacebookProvider$2 this$1>
				//   60  130:getfield        #40  <Field LoginProvider$ProviderCallback FacebookProvider$2.val$callback>
				//   61  133:aload           4
				//   62  135:invokevirtual   #119 <Method String AccessToken.getToken()>
				//   63  138:aload           4
				//   64  140:invokevirtual   #123 <Method Date AccessToken.getExpires()>
				//   65  143:invokevirtual   #129 <Method long Date.getTime()>
				//   66  146:invokevirtual   #133 <Method void FacebookProvider.success(LoginProvider$ProviderCallback, String, long)>
					FacebookProvider.access$400(this$0).registerCallback(FacebookProvider.access$500(this$0), ((FacebookCallback) (null)));
				//   67  149:aload_0         
				//   68  150:getfield        #20  <Field FacebookProvider$2 this$1>
				//   69  153:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
				//   70  156:invokestatic    #50  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
				//   71  159:aload_0         
				//   72  160:getfield        #20  <Field FacebookProvider$2 this$1>
				//   73  163:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
				//   74  166:invokestatic    #54  <Method CallbackManager FacebookProvider.access$500(FacebookProvider)>
				//   75  169:aconst_null     
				//   76  170:invokevirtual   #60  <Method void LoginManager.registerCallback(CallbackManager, FacebookCallback)>
				//   77  173:return          
				}

				public volatile void onSuccess(Object obj)
				{
					onSuccess((LoginResult)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #136 <Class LoginResult>
				//    3    5:invokevirtual   #138 <Method void onSuccess(LoginResult)>
				//    4    8:return          
				}

				final FacebookProvider._cls2 this$1;
				final FragmentActivity val$activity;

			
			{
				this$1 = FacebookProvider._cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field FacebookProvider$2 this$1>
				activity = fragmentactivity;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field FragmentActivity val$activity>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   10   22:aload_0         
	//   11   23:getfield        #27  <Field FacebookProvider this$0>
	//   12   26:invokestatic    #64  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
	//   13   29:aload_0         
	//   14   30:getfield        #27  <Field FacebookProvider this$0>
	//   15   33:invokestatic    #45  <Method CallbackManager FacebookProvider.access$500(FacebookProvider)>
	//   16   36:new             #13  <Class FacebookProvider$2$1>
	//   17   39:dup             
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:invokespecial   #77  <Method void FacebookProvider$2$1(FacebookProvider$2, FragmentActivity)>
	//   21   45:invokevirtual   #81  <Method void LoginManager.registerCallback(CallbackManager, FacebookCallback)>
			FacebookProvider.access$400(FacebookProvider.this).logInWithReadPermissions(((android.app.Activity) (activity)), ((java.util.Collection) (val$permissions)));
	//   22   48:aload_0         
	//   23   49:getfield        #27  <Field FacebookProvider this$0>
	//   24   52:invokestatic    #64  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
	//   25   55:aload_1         
	//   26   56:aload_0         
	//   27   57:getfield        #35  <Field List val$permissions>
	//   28   60:invokevirtual   #85  <Method void LoginManager.logInWithReadPermissions(android.app.Activity, java.util.Collection)>
			return;
	//   29   63:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  30   64:astore_2        
		{
			activity.finish();
	//   31   65:aload_1         
	//   32   66:invokevirtual   #90  <Method void FragmentActivity.finish()>
		}
		fail(val$callback, ((Exception) (bundle)).getMessage());
	//   33   69:aload_0         
	//   34   70:getfield        #27  <Field FacebookProvider this$0>
	//   35   73:aload_0         
	//   36   74:getfield        #33  <Field LoginProvider$ProviderCallback val$callback>
	//   37   77:aload_2         
	//   38   78:invokevirtual   #94  <Method String Exception.getMessage()>
	//   39   81:invokevirtual   #98  <Method void FacebookProvider.fail(LoginProvider$ProviderCallback, String)>
	//   40   84:return          
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
	final derCallback val$callback;
	final AccessToken val$fbAccessTokenBeforeLogin;
	final GSObject val$params;
	final List val$permissions;

	FacebookProvider$2()
	{
		this$0 = final_facebookprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field FacebookProvider this$0>
		val$params = gsobject;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #29  <Field GSObject val$params>
		val$fbAccessTokenBeforeLogin = accesstoken;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #31  <Field AccessToken val$fbAccessTokenBeforeLogin>
		val$callback = dercallback;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #33  <Field LoginProvider$ProviderCallback val$callback>
		val$permissions = List.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #35  <Field List val$permissions>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #38  <Method void Object()>
	//   17   31:return          
	}
}
