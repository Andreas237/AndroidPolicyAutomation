// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.content.res.AppCompatResources;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.*;
import com.facebook.internal.*;
import com.facebook.login.*;
import java.util.*;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.login.widget:
//			ToolTipPopup

public class LoginButton extends FacebookButtonBase
{
	static class LoginButtonProperties
	{

		public void clearPermissions()
		{
			permissions = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #37  <Field List permissions>
			authorizationType = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #39  <Field LoginAuthorizationType authorizationType>
		//    6   10:return          
		}

		public String getAuthType()
		{
			return authType;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field String authType>
		//    2    4:areturn         
		}

		public DefaultAudience getDefaultAudience()
		{
			return defaultAudience;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field DefaultAudience defaultAudience>
		//    2    4:areturn         
		}

		public LoginBehavior getLoginBehavior()
		{
			return loginBehavior;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field LoginBehavior loginBehavior>
		//    2    4:areturn         
		}

		List getPermissions()
		{
			return permissions;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field List permissions>
		//    2    4:areturn         
		}

		public void setAuthType(String s)
		{
			authType = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #50  <Field String authType>
		//    3    5:return          
		}

		public void setDefaultAudience(DefaultAudience defaultaudience)
		{
			defaultAudience = defaultaudience;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field DefaultAudience defaultAudience>
		//    3    5:return          
		}

		public void setLoginBehavior(LoginBehavior loginbehavior)
		{
			loginBehavior = loginbehavior;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #46  <Field LoginBehavior loginBehavior>
		//    3    5:return          
		}

		public void setPublishPermissions(List list)
		{
			if(!LoginAuthorizationType.READ.equals(((Object) (authorizationType))))
		//*   0    0:getstatic       #78  <Field LoginAuthorizationType LoginAuthorizationType.READ>
		//*   1    3:aload_0         
		//*   2    4:getfield        #39  <Field LoginAuthorizationType authorizationType>
		//*   3    7:invokevirtual   #82  <Method boolean LoginAuthorizationType.equals(Object)>
		//*   4   10:ifne            43
			{
				if(!Utility.isNullOrEmpty(((java.util.Collection) (list))))
		//*   5   13:aload_1         
		//*   6   14:invokestatic    #88  <Method boolean Utility.isNullOrEmpty(java.util.Collection)>
		//*   7   17:ifne            33
				{
					permissions = list;
		//    8   20:aload_0         
		//    9   21:aload_1         
		//   10   22:putfield        #37  <Field List permissions>
					authorizationType = LoginAuthorizationType.PUBLISH;
		//   11   25:aload_0         
		//   12   26:getstatic       #91  <Field LoginAuthorizationType LoginAuthorizationType.PUBLISH>
		//   13   29:putfield        #39  <Field LoginAuthorizationType authorizationType>
					return;
		//   14   32:return          
				} else
				{
					throw new IllegalArgumentException("Permissions for publish actions cannot be null or empty.");
		//   15   33:new             #93  <Class IllegalArgumentException>
		//   16   36:dup             
		//   17   37:ldc1            #95  <String "Permissions for publish actions cannot be null or empty.">
		//   18   39:invokespecial   #97  <Method void IllegalArgumentException(String)>
		//   19   42:athrow          
				}
			} else
			{
				throw new UnsupportedOperationException("Cannot call setPublishPermissions after setReadPermissions has been called.");
		//   20   43:new             #99  <Class UnsupportedOperationException>
		//   21   46:dup             
		//   22   47:ldc1            #101 <String "Cannot call setPublishPermissions after setReadPermissions has been called.">
		//   23   49:invokespecial   #102 <Method void UnsupportedOperationException(String)>
		//   24   52:athrow          
			}
		}

		public void setReadPermissions(List list)
		{
			if(!LoginAuthorizationType.PUBLISH.equals(((Object) (authorizationType))))
		//*   0    0:getstatic       #91  <Field LoginAuthorizationType LoginAuthorizationType.PUBLISH>
		//*   1    3:aload_0         
		//*   2    4:getfield        #39  <Field LoginAuthorizationType authorizationType>
		//*   3    7:invokevirtual   #82  <Method boolean LoginAuthorizationType.equals(Object)>
		//*   4   10:ifne            26
			{
				permissions = list;
		//    5   13:aload_0         
		//    6   14:aload_1         
		//    7   15:putfield        #37  <Field List permissions>
				authorizationType = LoginAuthorizationType.READ;
		//    8   18:aload_0         
		//    9   19:getstatic       #78  <Field LoginAuthorizationType LoginAuthorizationType.READ>
		//   10   22:putfield        #39  <Field LoginAuthorizationType authorizationType>
				return;
		//   11   25:return          
			} else
			{
				throw new UnsupportedOperationException("Cannot call setReadPermissions after setPublishPermissions has been called.");
		//   12   26:new             #99  <Class UnsupportedOperationException>
		//   13   29:dup             
		//   14   30:ldc1            #106 <String "Cannot call setReadPermissions after setPublishPermissions has been called.">
		//   15   32:invokespecial   #102 <Method void UnsupportedOperationException(String)>
		//   16   35:athrow          
			}
		}

		private String authType;
		private LoginAuthorizationType authorizationType;
		private DefaultAudience defaultAudience;
		private LoginBehavior loginBehavior;
		private List permissions;


/*
		static LoginAuthorizationType access$600(LoginButtonProperties loginbuttonproperties)
		{
			return loginbuttonproperties.authorizationType;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field LoginAuthorizationType authorizationType>
		//    2    4:areturn         
		}

*/


/*
		static List access$700(LoginButtonProperties loginbuttonproperties)
		{
			return loginbuttonproperties.permissions;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field List permissions>
		//    2    4:areturn         
		}

*/

		LoginButtonProperties()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			defaultAudience = DefaultAudience.FRIENDS;
		//    2    4:aload_0         
		//    3    5:getstatic       #27  <Field DefaultAudience DefaultAudience.FRIENDS>
		//    4    8:putfield        #29  <Field DefaultAudience defaultAudience>
			permissions = Collections.emptyList();
		//    5   11:aload_0         
		//    6   12:invokestatic    #35  <Method List Collections.emptyList()>
		//    7   15:putfield        #37  <Field List permissions>
			authorizationType = null;
		//    8   18:aload_0         
		//    9   19:aconst_null     
		//   10   20:putfield        #39  <Field LoginAuthorizationType authorizationType>
			loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
		//   11   23:aload_0         
		//   12   24:getstatic       #44  <Field LoginBehavior LoginBehavior.NATIVE_WITH_FALLBACK>
		//   13   27:putfield        #46  <Field LoginBehavior loginBehavior>
			authType = "rerequest";
		//   14   30:aload_0         
		//   15   31:ldc1            #48  <String "rerequest">
		//   16   33:putfield        #50  <Field String authType>
		//   17   36:return          
		}
	}

	protected class LoginClickListener
		implements android.view.View.OnClickListener
	{

		protected LoginManager getLoginManager()
		{
			LoginManager loginmanager = LoginManager.getInstance();
		//    0    0:invokestatic    #28  <Method LoginManager LoginManager.getInstance()>
		//    1    3:astore_1        
			loginmanager.setDefaultAudience(getDefaultAudience());
		//    2    4:aload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #17  <Field LoginButton this$0>
		//    5    9:invokevirtual   #32  <Method DefaultAudience LoginButton.getDefaultAudience()>
		//    6   12:invokevirtual   #36  <Method LoginManager LoginManager.setDefaultAudience(DefaultAudience)>
		//    7   15:pop             
			loginmanager.setLoginBehavior(getLoginBehavior());
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #17  <Field LoginButton this$0>
		//   11   21:invokevirtual   #40  <Method LoginBehavior LoginButton.getLoginBehavior()>
		//   12   24:invokevirtual   #44  <Method LoginManager LoginManager.setLoginBehavior(LoginBehavior)>
		//   13   27:pop             
			loginmanager.setAuthType(getAuthType());
		//   14   28:aload_1         
		//   15   29:aload_0         
		//   16   30:getfield        #17  <Field LoginButton this$0>
		//   17   33:invokevirtual   #48  <Method String LoginButton.getAuthType()>
		//   18   36:invokevirtual   #52  <Method LoginManager LoginManager.setAuthType(String)>
		//   19   39:pop             
			return loginmanager;
		//   20   40:aload_1         
		//   21   41:areturn         
		}

		public void onClick(View view)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #56  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #58  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #63  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		protected void performLogin()
		{
			LoginManager loginmanager = getLoginManager();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #66  <Method LoginManager getLoginManager()>
		//    2    4:astore_1        
			if(LoginAuthorizationType.PUBLISH.equals(((Object) (properties.authorizationType))))
		//*   3    5:getstatic       #72  <Field LoginAuthorizationType LoginAuthorizationType.PUBLISH>
		//*   4    8:aload_0         
		//*   5    9:getfield        #17  <Field LoginButton this$0>
		//*   6   12:invokestatic    #76  <Method LoginButton$LoginButtonProperties LoginButton.access$500(LoginButton)>
		//*   7   15:invokestatic    #82  <Method LoginAuthorizationType LoginButton$LoginButtonProperties.access$600(LoginButton$LoginButtonProperties)>
		//*   8   18:invokevirtual   #86  <Method boolean LoginAuthorizationType.equals(Object)>
		//*   9   21:ifeq            110
			{
				if(getFragment() != null)
		//*  10   24:aload_0         
		//*  11   25:getfield        #17  <Field LoginButton this$0>
		//*  12   28:invokevirtual   #90  <Method android.support.v4.app.Fragment LoginButton.getFragment()>
		//*  13   31:ifnull          56
				{
					loginmanager.logInWithPublishPermissions(getFragment(), ((java.util.Collection) (properties.permissions)));
		//   14   34:aload_1         
		//   15   35:aload_0         
		//   16   36:getfield        #17  <Field LoginButton this$0>
		//   17   39:invokevirtual   #90  <Method android.support.v4.app.Fragment LoginButton.getFragment()>
		//   18   42:aload_0         
		//   19   43:getfield        #17  <Field LoginButton this$0>
		//   20   46:invokestatic    #76  <Method LoginButton$LoginButtonProperties LoginButton.access$500(LoginButton)>
		//   21   49:invokestatic    #94  <Method List LoginButton$LoginButtonProperties.access$700(LoginButton$LoginButtonProperties)>
		//   22   52:invokevirtual   #98  <Method void LoginManager.logInWithPublishPermissions(android.support.v4.app.Fragment, java.util.Collection)>
					return;
		//   23   55:return          
				}
				if(getNativeFragment() != null)
		//*  24   56:aload_0         
		//*  25   57:getfield        #17  <Field LoginButton this$0>
		//*  26   60:invokevirtual   #102 <Method android.app.Fragment LoginButton.getNativeFragment()>
		//*  27   63:ifnull          88
				{
					loginmanager.logInWithPublishPermissions(getNativeFragment(), ((java.util.Collection) (properties.permissions)));
		//   28   66:aload_1         
		//   29   67:aload_0         
		//   30   68:getfield        #17  <Field LoginButton this$0>
		//   31   71:invokevirtual   #102 <Method android.app.Fragment LoginButton.getNativeFragment()>
		//   32   74:aload_0         
		//   33   75:getfield        #17  <Field LoginButton this$0>
		//   34   78:invokestatic    #76  <Method LoginButton$LoginButtonProperties LoginButton.access$500(LoginButton)>
		//   35   81:invokestatic    #94  <Method List LoginButton$LoginButtonProperties.access$700(LoginButton$LoginButtonProperties)>
		//   36   84:invokevirtual   #105 <Method void LoginManager.logInWithPublishPermissions(android.app.Fragment, java.util.Collection)>
					return;
		//   37   87:return          
				} else
				{
					loginmanager.logInWithPublishPermissions(getActivity(), ((java.util.Collection) (properties.permissions)));
		//   38   88:aload_1         
		//   39   89:aload_0         
		//   40   90:getfield        #17  <Field LoginButton this$0>
		//   41   93:invokestatic    #109 <Method Activity LoginButton.access$800(LoginButton)>
		//   42   96:aload_0         
		//   43   97:getfield        #17  <Field LoginButton this$0>
		//   44  100:invokestatic    #76  <Method LoginButton$LoginButtonProperties LoginButton.access$500(LoginButton)>
		//   45  103:invokestatic    #94  <Method List LoginButton$LoginButtonProperties.access$700(LoginButton$LoginButtonProperties)>
		//   46  106:invokevirtual   #112 <Method void LoginManager.logInWithPublishPermissions(Activity, java.util.Collection)>
					return;
		//   47  109:return          
				}
			}
			if(getFragment() != null)
		//*  48  110:aload_0         
		//*  49  111:getfield        #17  <Field LoginButton this$0>
		//*  50  114:invokevirtual   #90  <Method android.support.v4.app.Fragment LoginButton.getFragment()>
		//*  51  117:ifnull          142
			{
				loginmanager.logInWithReadPermissions(getFragment(), ((java.util.Collection) (properties.permissions)));
		//   52  120:aload_1         
		//   53  121:aload_0         
		//   54  122:getfield        #17  <Field LoginButton this$0>
		//   55  125:invokevirtual   #90  <Method android.support.v4.app.Fragment LoginButton.getFragment()>
		//   56  128:aload_0         
		//   57  129:getfield        #17  <Field LoginButton this$0>
		//   58  132:invokestatic    #76  <Method LoginButton$LoginButtonProperties LoginButton.access$500(LoginButton)>
		//   59  135:invokestatic    #94  <Method List LoginButton$LoginButtonProperties.access$700(LoginButton$LoginButtonProperties)>
		//   60  138:invokevirtual   #115 <Method void LoginManager.logInWithReadPermissions(android.support.v4.app.Fragment, java.util.Collection)>
				return;
		//   61  141:return          
			}
			if(getNativeFragment() != null)
		//*  62  142:aload_0         
		//*  63  143:getfield        #17  <Field LoginButton this$0>
		//*  64  146:invokevirtual   #102 <Method android.app.Fragment LoginButton.getNativeFragment()>
		//*  65  149:ifnull          174
			{
				loginmanager.logInWithReadPermissions(getNativeFragment(), ((java.util.Collection) (properties.permissions)));
		//   66  152:aload_1         
		//   67  153:aload_0         
		//   68  154:getfield        #17  <Field LoginButton this$0>
		//   69  157:invokevirtual   #102 <Method android.app.Fragment LoginButton.getNativeFragment()>
		//   70  160:aload_0         
		//   71  161:getfield        #17  <Field LoginButton this$0>
		//   72  164:invokestatic    #76  <Method LoginButton$LoginButtonProperties LoginButton.access$500(LoginButton)>
		//   73  167:invokestatic    #94  <Method List LoginButton$LoginButtonProperties.access$700(LoginButton$LoginButtonProperties)>
		//   74  170:invokevirtual   #117 <Method void LoginManager.logInWithReadPermissions(android.app.Fragment, java.util.Collection)>
				return;
		//   75  173:return          
			} else
			{
				loginmanager.logInWithReadPermissions(getActivity(), ((java.util.Collection) (properties.permissions)));
		//   76  174:aload_1         
		//   77  175:aload_0         
		//   78  176:getfield        #17  <Field LoginButton this$0>
		//   79  179:invokestatic    #120 <Method Activity LoginButton.access$900(LoginButton)>
		//   80  182:aload_0         
		//   81  183:getfield        #17  <Field LoginButton this$0>
		//   82  186:invokestatic    #76  <Method LoginButton$LoginButtonProperties LoginButton.access$500(LoginButton)>
		//   83  189:invokestatic    #94  <Method List LoginButton$LoginButtonProperties.access$700(LoginButton$LoginButtonProperties)>
		//   84  192:invokevirtual   #122 <Method void LoginManager.logInWithReadPermissions(Activity, java.util.Collection)>
				return;
		//   85  195:return          
			}
		}

		protected void performLogout(Context context)
		{
			LoginManager loginmanager = getLoginManager();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #66  <Method LoginManager getLoginManager()>
		//    2    4:astore_3        
			if(confirmLogout)
		//*   3    5:aload_0         
		//*   4    6:getfield        #17  <Field LoginButton this$0>
		//*   5    9:invokestatic    #128 <Method boolean LoginButton.access$1000(LoginButton)>
		//*   6   12:ifeq            152
			{
				String s = getResources().getString(com.facebook.login.R.string.com_facebook_loginview_log_out_action);
		//    7   15:aload_0         
		//    8   16:getfield        #17  <Field LoginButton this$0>
		//    9   19:invokevirtual   #132 <Method Resources LoginButton.getResources()>
		//   10   22:getstatic       #138 <Field int com.facebook.login.R$string.com_facebook_loginview_log_out_action>
		//   11   25:invokevirtual   #144 <Method String Resources.getString(int)>
		//   12   28:astore          4
				String s1 = getResources().getString(com.facebook.login.R.string.com_facebook_loginview_cancel_action);
		//   13   30:aload_0         
		//   14   31:getfield        #17  <Field LoginButton this$0>
		//   15   34:invokevirtual   #132 <Method Resources LoginButton.getResources()>
		//   16   37:getstatic       #147 <Field int com.facebook.login.R$string.com_facebook_loginview_cancel_action>
		//   17   40:invokevirtual   #144 <Method String Resources.getString(int)>
		//   18   43:astore          5
				Object obj = ((Object) (Profile.getCurrentProfile()));
		//   19   45:invokestatic    #153 <Method Profile Profile.getCurrentProfile()>
		//   20   48:astore_2        
				if(obj != null && ((Profile) (obj)).getName() != null)
		//*  21   49:aload_2         
		//*  22   50:ifnull          91
		//*  23   53:aload_2         
		//*  24   54:invokevirtual   #156 <Method String Profile.getName()>
		//*  25   57:ifnull          91
					obj = ((Object) (String.format(getResources().getString(com.facebook.login.R.string.com_facebook_loginview_logged_in_as), new Object[] {
						((Profile) (obj)).getName()
					})));
		//   26   60:aload_0         
		//   27   61:getfield        #17  <Field LoginButton this$0>
		//   28   64:invokevirtual   #132 <Method Resources LoginButton.getResources()>
		//   29   67:getstatic       #159 <Field int com.facebook.login.R$string.com_facebook_loginview_logged_in_as>
		//   30   70:invokevirtual   #144 <Method String Resources.getString(int)>
		//   31   73:iconst_1        
		//   32   74:anewarray       Object[]
		//   33   77:dup             
		//   34   78:iconst_0        
		//   35   79:aload_2         
		//   36   80:invokevirtual   #156 <Method String Profile.getName()>
		//   37   83:aastore         
		//   38   84:invokestatic    #165 <Method String String.format(String, Object[])>
		//   39   87:astore_2        
				else
		//*  40   88:goto            105
					obj = ((Object) (getResources().getString(com.facebook.login.R.string.com_facebook_loginview_logged_in_using_facebook)));
		//   41   91:aload_0         
		//   42   92:getfield        #17  <Field LoginButton this$0>
		//   43   95:invokevirtual   #132 <Method Resources LoginButton.getResources()>
		//   44   98:getstatic       #168 <Field int com.facebook.login.R$string.com_facebook_loginview_logged_in_using_facebook>
		//   45  101:invokevirtual   #144 <Method String Resources.getString(int)>
		//   46  104:astore_2        
				context = ((Context) (new android.app.AlertDialog.Builder(context)));
		//   47  105:new             #170 <Class android.app.AlertDialog$Builder>
		//   48  108:dup             
		//   49  109:aload_1         
		//   50  110:invokespecial   #172 <Method void android.app.AlertDialog$Builder(Context)>
		//   51  113:astore_1        
				((android.app.AlertDialog.Builder) (context)).setMessage(((CharSequence) (obj))).setCancelable(true).setPositiveButton(((CharSequence) (s)), ((_cls1) (loginmanager)). new android.content.DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialoginterface, int i)
					{
						loginManager.logOut();
					//    0    0:aload_0         
					//    1    1:getfield        #24  <Field LoginManager val$loginManager>
					//    2    4:invokevirtual   #35  <Method void LoginManager.logOut()>
					//    3    7:return          
					}

					final LoginClickListener this$1;
					final LoginManager val$loginManager;

			
			{
				this$1 = final_loginclicklistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field LoginButton$LoginClickListener this$1>
				loginManager = LoginManager.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field LoginManager val$loginManager>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
				}
).setNegativeButton(((CharSequence) (s1)), ((android.content.DialogInterface.OnClickListener) (null)));
		//   52  114:aload_1         
		//   53  115:aload_2         
		//   54  116:invokevirtual   #176 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
		//   55  119:iconst_1        
		//   56  120:invokevirtual   #180 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
		//   57  123:aload           4
		//   58  125:new             #11  <Class LoginButton$LoginClickListener$1>
		//   59  128:dup             
		//   60  129:aload_0         
		//   61  130:aload_3         
		//   62  131:invokespecial   #183 <Method void LoginButton$LoginClickListener$1(LoginButton$LoginClickListener, LoginManager)>
		//   63  134:invokevirtual   #187 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
		//   64  137:aload           5
		//   65  139:aconst_null     
		//   66  140:invokevirtual   #190 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
		//   67  143:pop             
				((android.app.AlertDialog.Builder) (context)).create().show();
		//   68  144:aload_1         
		//   69  145:invokevirtual   #194 <Method AlertDialog android.app.AlertDialog$Builder.create()>
		//   70  148:invokevirtual   #199 <Method void AlertDialog.show()>
				return;
		//   71  151:return          
			} else
			{
				loginmanager.logOut();
		//   72  152:aload_3         
		//   73  153:invokevirtual   #202 <Method void LoginManager.logOut()>
				return;
		//   74  156:return          
			}
		}

		final LoginButton this$0;

		protected LoginClickListener()
		{
			this$0 = LoginButton.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field LoginButton this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}
	}

	public static final class ToolTipMode extends Enum
	{

		public static ToolTipMode fromInt(int i)
		{
			ToolTipMode atooltipmode[] = values();
		//    0    0:invokestatic    #59  <Method LoginButton$ToolTipMode[] values()>
		//    1    3:astore_3        
			int k = atooltipmode.length;
		//    2    4:aload_3         
		//    3    5:arraylength     
		//    4    6:istore_2        
			for(int j = 0; j < k; j++)
		//*   5    7:iconst_0        
		//*   6    8:istore_1        
		//*   7    9:iload_1         
		//*   8   10:iload_2         
		//*   9   11:icmpge          38
			{
				ToolTipMode tooltipmode = atooltipmode[j];
		//   10   14:aload_3         
		//   11   15:iload_1         
		//   12   16:aaload          
		//   13   17:astore          4
				if(tooltipmode.getValue() == i)
		//*  14   19:aload           4
		//*  15   21:invokevirtual   #63  <Method int getValue()>
		//*  16   24:iload_0         
		//*  17   25:icmpne          31
					return tooltipmode;
		//   18   28:aload           4
		//   19   30:areturn         
			}

		//   20   31:iload_1         
		//   21   32:iconst_1        
		//   22   33:iadd            
		//   23   34:istore_1        
		//*  24   35:goto            9
			return null;
		//   25   38:aconst_null     
		//   26   39:areturn         
		}

		public static ToolTipMode valueOf(String s)
		{
			return (ToolTipMode)Enum.valueOf(com/facebook/login/widget/LoginButton$ToolTipMode, s);
		//    0    0:ldc1            #2   <Class LoginButton$ToolTipMode>
		//    1    2:aload_0         
		//    2    3:invokestatic    #68  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LoginButton$ToolTipMode>
		//    4    9:areturn         
		}

		public static ToolTipMode[] values()
		{
			return (ToolTipMode[])((ToolTipMode []) ($VALUES)).clone();
		//    0    0:getstatic       #42  <Field LoginButton$ToolTipMode[] $VALUES>
		//    1    3:invokevirtual   #73  <Method Object _5B_Lcom.facebook.login.widget.LoginButton$ToolTipMode_3B_.clone()>
		//    2    6:checkcast       #69  <Class LoginButton$ToolTipMode[]>
		//    3    9:areturn         
		}

		public int getValue()
		{
			return intValue;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field int intValue>
		//    2    4:ireturn         
		}

		public String toString()
		{
			return stringValue;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field String stringValue>
		//    2    4:areturn         
		}

		private static final ToolTipMode $VALUES[];
		public static final ToolTipMode AUTOMATIC;
		public static ToolTipMode DEFAULT;
		public static final ToolTipMode DISPLAY_ALWAYS;
		public static final ToolTipMode NEVER_DISPLAY;
		private int intValue;
		private String stringValue;

		static 
		{
			AUTOMATIC = new ToolTipMode("AUTOMATIC", 0, "automatic", 0);
		//    0    0:new             #2   <Class LoginButton$ToolTipMode>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "AUTOMATIC">
		//    3    6:iconst_0        
		//    4    7:ldc1            #24  <String "automatic">
		//    5    9:iconst_0        
		//    6   10:invokespecial   #28  <Method void LoginButton$ToolTipMode(String, int, String, int)>
		//    7   13:putstatic       #30  <Field LoginButton$ToolTipMode AUTOMATIC>
			DISPLAY_ALWAYS = new ToolTipMode("DISPLAY_ALWAYS", 1, "display_always", 1);
		//    8   16:new             #2   <Class LoginButton$ToolTipMode>
		//    9   19:dup             
		//   10   20:ldc1            #31  <String "DISPLAY_ALWAYS">
		//   11   22:iconst_1        
		//   12   23:ldc1            #33  <String "display_always">
		//   13   25:iconst_1        
		//   14   26:invokespecial   #28  <Method void LoginButton$ToolTipMode(String, int, String, int)>
		//   15   29:putstatic       #35  <Field LoginButton$ToolTipMode DISPLAY_ALWAYS>
			NEVER_DISPLAY = new ToolTipMode("NEVER_DISPLAY", 2, "never_display", 2);
		//   16   32:new             #2   <Class LoginButton$ToolTipMode>
		//   17   35:dup             
		//   18   36:ldc1            #36  <String "NEVER_DISPLAY">
		//   19   38:iconst_2        
		//   20   39:ldc1            #38  <String "never_display">
		//   21   41:iconst_2        
		//   22   42:invokespecial   #28  <Method void LoginButton$ToolTipMode(String, int, String, int)>
		//   23   45:putstatic       #40  <Field LoginButton$ToolTipMode NEVER_DISPLAY>
			ToolTipMode tooltipmode = AUTOMATIC;
		//   24   48:getstatic       #30  <Field LoginButton$ToolTipMode AUTOMATIC>
		//   25   51:astore_0        
			$VALUES = (new ToolTipMode[] {
				tooltipmode, DISPLAY_ALWAYS, NEVER_DISPLAY
			});
		//   26   52:iconst_3        
		//   27   53:anewarray       ToolTipMode[]
		//   28   56:dup             
		//   29   57:iconst_0        
		//   30   58:aload_0         
		//   31   59:aastore         
		//   32   60:dup             
		//   33   61:iconst_1        
		//   34   62:getstatic       #35  <Field LoginButton$ToolTipMode DISPLAY_ALWAYS>
		//   35   65:aastore         
		//   36   66:dup             
		//   37   67:iconst_2        
		//   38   68:getstatic       #40  <Field LoginButton$ToolTipMode NEVER_DISPLAY>
		//   39   71:aastore         
		//   40   72:putstatic       #42  <Field LoginButton$ToolTipMode[] $VALUES>
			DEFAULT = tooltipmode;
		//   41   75:aload_0         
		//   42   76:putstatic       #44  <Field LoginButton$ToolTipMode DEFAULT>
		//*  43   79:return          
		}

		private ToolTipMode(String s, int i, String s1, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #48  <Method void Enum(String, int)>
			stringValue = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #50  <Field String stringValue>
			intValue = j;
		//    7   11:aload_0         
		//    8   12:iload           4
		//    9   14:putfield        #52  <Field int intValue>
		//   10   17:return          
		}
	}


	public LoginButton(Context context)
	{
		super(context, ((AttributeSet) (null)), 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:ldc1            #54  <String "fb_login_button_create">
	//    6    7:ldc1            #56  <String "fb_login_button_did_tap">
	//    7    9:invokespecial   #59  <Method void FacebookButtonBase(Context, AttributeSet, int, int, String, String)>
		properties = new LoginButtonProperties();
	//    8   12:aload_0         
	//    9   13:new             #14  <Class LoginButton$LoginButtonProperties>
	//   10   16:dup             
	//   11   17:invokespecial   #61  <Method void LoginButton$LoginButtonProperties()>
	//   12   20:putfield        #63  <Field LoginButton$LoginButtonProperties properties>
		loginLogoutEventName = "fb_login_view_usage";
	//   13   23:aload_0         
	//   14   24:ldc1            #65  <String "fb_login_view_usage">
	//   15   26:putfield        #67  <Field String loginLogoutEventName>
		toolTipStyle = ToolTipPopup.Style.BLUE;
	//   16   29:aload_0         
	//   17   30:getstatic       #72  <Field ToolTipPopup$Style ToolTipPopup$Style.BLUE>
	//   18   33:putfield        #74  <Field ToolTipPopup$Style toolTipStyle>
		toolTipDisplayTime = 6000L;
	//   19   36:aload_0         
	//   20   37:ldc2w           #75  <Long 6000L>
	//   21   40:putfield        #78  <Field long toolTipDisplayTime>
	//   22   43:return          
	}

	public LoginButton(Context context, AttributeSet attributeset)
	{
		super(context, attributeset, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:ldc1            #54  <String "fb_login_button_create">
	//    6    7:ldc1            #56  <String "fb_login_button_did_tap">
	//    7    9:invokespecial   #59  <Method void FacebookButtonBase(Context, AttributeSet, int, int, String, String)>
		properties = new LoginButtonProperties();
	//    8   12:aload_0         
	//    9   13:new             #14  <Class LoginButton$LoginButtonProperties>
	//   10   16:dup             
	//   11   17:invokespecial   #61  <Method void LoginButton$LoginButtonProperties()>
	//   12   20:putfield        #63  <Field LoginButton$LoginButtonProperties properties>
		loginLogoutEventName = "fb_login_view_usage";
	//   13   23:aload_0         
	//   14   24:ldc1            #65  <String "fb_login_view_usage">
	//   15   26:putfield        #67  <Field String loginLogoutEventName>
		toolTipStyle = ToolTipPopup.Style.BLUE;
	//   16   29:aload_0         
	//   17   30:getstatic       #72  <Field ToolTipPopup$Style ToolTipPopup$Style.BLUE>
	//   18   33:putfield        #74  <Field ToolTipPopup$Style toolTipStyle>
		toolTipDisplayTime = 6000L;
	//   19   36:aload_0         
	//   20   37:ldc2w           #75  <Long 6000L>
	//   21   40:putfield        #78  <Field long toolTipDisplayTime>
	//   22   43:return          
	}

	public LoginButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i, 0, "fb_login_button_create", "fb_login_button_did_tap");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:ldc1            #54  <String "fb_login_button_create">
	//    6    7:ldc1            #56  <String "fb_login_button_did_tap">
	//    7    9:invokespecial   #59  <Method void FacebookButtonBase(Context, AttributeSet, int, int, String, String)>
		properties = new LoginButtonProperties();
	//    8   12:aload_0         
	//    9   13:new             #14  <Class LoginButton$LoginButtonProperties>
	//   10   16:dup             
	//   11   17:invokespecial   #61  <Method void LoginButton$LoginButtonProperties()>
	//   12   20:putfield        #63  <Field LoginButton$LoginButtonProperties properties>
		loginLogoutEventName = "fb_login_view_usage";
	//   13   23:aload_0         
	//   14   24:ldc1            #65  <String "fb_login_view_usage">
	//   15   26:putfield        #67  <Field String loginLogoutEventName>
		toolTipStyle = ToolTipPopup.Style.BLUE;
	//   16   29:aload_0         
	//   17   30:getstatic       #72  <Field ToolTipPopup$Style ToolTipPopup$Style.BLUE>
	//   18   33:putfield        #74  <Field ToolTipPopup$Style toolTipStyle>
		toolTipDisplayTime = 6000L;
	//   19   36:aload_0         
	//   20   37:ldc2w           #75  <Long 6000L>
	//   21   40:putfield        #78  <Field long toolTipDisplayTime>
	//   22   43:return          
	}

	private void checkToolTipSettings()
	{
		static class _cls3
		{

			static final int $SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode[];

			static 
			{
				$SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode = new int[ToolTipMode.values().length];
			//    0    0:invokestatic    #18  <Method LoginButton$ToolTipMode[] LoginButton$ToolTipMode.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode>
				try
				{
					$SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode[ToolTipMode.AUTOMATIC.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode>
			//    5   12:getstatic       #24  <Field LoginButton$ToolTipMode LoginButton$ToolTipMode.AUTOMATIC>
			//    6   15:invokevirtual   #28  <Method int LoginButton$ToolTipMode.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode>
			//*  10   23:getstatic       #31  <Field LoginButton$ToolTipMode LoginButton$ToolTipMode.DISPLAY_ALWAYS>
			//*  11   26:invokevirtual   #28  <Method int LoginButton$ToolTipMode.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode>
			//*  15   34:getstatic       #34  <Field LoginButton$ToolTipMode LoginButton$ToolTipMode.NEVER_DISPLAY>
			//*  16   37:invokevirtual   #28  <Method int LoginButton$ToolTipMode.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					$SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode[ToolTipMode.DISPLAY_ALWAYS.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					$SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode[ToolTipMode.NEVER_DISPLAY.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		switch(_cls3..SwitchMap.com.facebook.login.widget.LoginButton.ToolTipMode[toolTipMode.ordinal()])
	//*   0    0:getstatic       #118 <Field int[] LoginButton$3.$SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode>
	//*   1    3:aload_0         
	//*   2    4:getfield        #120 <Field LoginButton$ToolTipMode toolTipMode>
	//*   3    7:invokevirtual   #124 <Method int LoginButton$ToolTipMode.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 2: default 32
	//	               1 48
	//	               2 33
		default:
			return;
	//    6   32:return          

		case 2: // '\002'
			displayToolTip(getResources().getString(com.facebook.login.R.string.com_facebook_tooltip_default));
	//    7   33:aload_0         
	//    8   34:aload_0         
	//    9   35:invokevirtual   #128 <Method Resources getResources()>
	//   10   38:getstatic       #134 <Field int com.facebook.login.R$string.com_facebook_tooltip_default>
	//   11   41:invokevirtual   #140 <Method String Resources.getString(int)>
	//   12   44:invokespecial   #144 <Method void displayToolTip(String)>
			return;
	//   13   47:return          

		case 1: // '\001'
			final String appId = Utility.getMetadataApplicationId(getContext());
	//   14   48:aload_0         
	//   15   49:invokevirtual   #148 <Method Context getContext()>
	//   16   52:invokestatic    #154 <Method String Utility.getMetadataApplicationId(Context)>
	//   17   55:astore_1        
			FacebookSdk.getExecutor().execute(new Runnable() {

				public void run()
				{
					FetchedAppSettings fetchedappsettings = FetchedAppSettingsManager.queryAppSettings(appId, false);
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field String val$appId>
				//    2    4:iconst_0        
				//    3    5:invokestatic    #33  <Method FetchedAppSettings FetchedAppSettingsManager.queryAppSettings(String, boolean)>
				//    4    8:astore_1        
					getActivity().runOnUiThread(((_cls1) (fetchedappsettings)). new Runnable() {

						public void run()
						{
							showToolTipPerSettings(settings);
						//    0    0:aload_0         
						//    1    1:getfield        #19  <Field LoginButton$1 this$1>
						//    2    4:getfield        #28  <Field LoginButton LoginButton$1.this$0>
						//    3    7:aload_0         
						//    4    8:getfield        #21  <Field FetchedAppSettings val$settings>
						//    5   11:invokestatic    #34  <Method void LoginButton.access$000(LoginButton, FetchedAppSettings)>
						//    6   14:return          
						}

						final _cls1 this$1;
						final FetchedAppSettings val$settings;

			
			{
				this$1 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LoginButton$1 this$1>
				settings = FetchedAppSettings.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field FetchedAppSettings val$settings>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
					}
);
				//    5    9:aload_0         
				//    6   10:getfield        #21  <Field LoginButton this$0>
				//    7   13:invokestatic    #37  <Method Activity LoginButton.access$100(LoginButton)>
				//    8   16:new             #13  <Class LoginButton$1$1>
				//    9   19:dup             
				//   10   20:aload_0         
				//   11   21:aload_1         
				//   12   22:invokespecial   #40  <Method void LoginButton$1$1(LoginButton$1, FetchedAppSettings)>
				//   13   25:invokevirtual   #46  <Method void Activity.runOnUiThread(Runnable)>
				//   14   28:return          
				}

				final LoginButton this$0;
				final String val$appId;

			
			{
				this$0 = LoginButton.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field LoginButton this$0>
				appId = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String val$appId>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   18   56:invokestatic    #160 <Method Executor FacebookSdk.getExecutor()>
	//   19   59:new             #6   <Class LoginButton$1>
	//   20   62:dup             
	//   21   63:aload_0         
	//   22   64:aload_1         
	//   23   65:invokespecial   #163 <Method void LoginButton$1(LoginButton, String)>
	//   24   68:invokeinterface #169 <Method void Executor.execute(Runnable)>
			return;
	//   25   73:return          
		}
	}

	private void displayToolTip(String s)
	{
		toolTipPopup = new ToolTipPopup(s, ((View) (this)));
	//    0    0:aload_0         
	//    1    1:new             #171 <Class ToolTipPopup>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokespecial   #174 <Method void ToolTipPopup(String, View)>
	//    6   10:putfield        #176 <Field ToolTipPopup toolTipPopup>
		toolTipPopup.setStyle(toolTipStyle);
	//    7   13:aload_0         
	//    8   14:getfield        #176 <Field ToolTipPopup toolTipPopup>
	//    9   17:aload_0         
	//   10   18:getfield        #74  <Field ToolTipPopup$Style toolTipStyle>
	//   11   21:invokevirtual   #180 <Method void ToolTipPopup.setStyle(ToolTipPopup$Style)>
		toolTipPopup.setNuxDisplayTime(toolTipDisplayTime);
	//   12   24:aload_0         
	//   13   25:getfield        #176 <Field ToolTipPopup toolTipPopup>
	//   14   28:aload_0         
	//   15   29:getfield        #78  <Field long toolTipDisplayTime>
	//   16   32:invokevirtual   #184 <Method void ToolTipPopup.setNuxDisplayTime(long)>
		toolTipPopup.show();
	//   17   35:aload_0         
	//   18   36:getfield        #176 <Field ToolTipPopup toolTipPopup>
	//   19   39:invokevirtual   #187 <Method void ToolTipPopup.show()>
	//   20   42:return          
	}

	private int measureButtonWidth(String s)
	{
		int i = measureTextWidth(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #192 <Method int measureTextWidth(String)>
	//    3    5:istore_2        
		return getCompoundPaddingLeft() + getCompoundDrawablePadding() + i + getCompoundPaddingRight();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #195 <Method int getCompoundPaddingLeft()>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #198 <Method int getCompoundDrawablePadding()>
	//    8   14:iadd            
	//    9   15:iload_2         
	//   10   16:iadd            
	//   11   17:aload_0         
	//   12   18:invokevirtual   #201 <Method int getCompoundPaddingRight()>
	//   13   21:iadd            
	//   14   22:ireturn         
	}

	private void parseLoginButtonAttributes(Context context, AttributeSet attributeset, int i, int j)
	{
		toolTipMode = ToolTipMode.DEFAULT;
	//    0    0:aload_0         
	//    1    1:getstatic       #206 <Field LoginButton$ToolTipMode LoginButton$ToolTipMode.DEFAULT>
	//    2    4:putfield        #120 <Field LoginButton$ToolTipMode toolTipMode>
		context = ((Context) (context.getTheme().obtainStyledAttributes(attributeset, com.facebook.login.R.styleable.com_facebook_login_view, i, j)));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #212 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    5   11:aload_2         
	//    6   12:getstatic       #217 <Field int[] com.facebook.login.R$styleable.com_facebook_login_view>
	//    7   15:iload_3         
	//    8   16:iload           4
	//    9   18:invokevirtual   #223 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   10   21:astore_1        
		confirmLogout = ((TypedArray) (context)).getBoolean(com.facebook.login.R.styleable.com_facebook_login_view_com_facebook_confirm_logout, true);
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:getstatic       #226 <Field int com.facebook.login.R$styleable.com_facebook_login_view_com_facebook_confirm_logout>
	//   14   27:iconst_1        
	//   15   28:invokevirtual   #232 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   16   31:putfield        #96  <Field boolean confirmLogout>
		loginText = ((TypedArray) (context)).getString(com.facebook.login.R.styleable.com_facebook_login_view_com_facebook_login_text);
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:getstatic       #235 <Field int com.facebook.login.R$styleable.com_facebook_login_view_com_facebook_login_text>
	//   20   39:invokevirtual   #236 <Method String TypedArray.getString(int)>
	//   21   42:putfield        #238 <Field String loginText>
		logoutText = ((TypedArray) (context)).getString(com.facebook.login.R.styleable.com_facebook_login_view_com_facebook_logout_text);
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:getstatic       #241 <Field int com.facebook.login.R$styleable.com_facebook_login_view_com_facebook_logout_text>
	//   25   50:invokevirtual   #236 <Method String TypedArray.getString(int)>
	//   26   53:putfield        #243 <Field String logoutText>
		toolTipMode = ToolTipMode.fromInt(((TypedArray) (context)).getInt(com.facebook.login.R.styleable.com_facebook_login_view_com_facebook_tooltip_mode, ToolTipMode.DEFAULT.getValue()));
	//   27   56:aload_0         
	//   28   57:aload_1         
	//   29   58:getstatic       #246 <Field int com.facebook.login.R$styleable.com_facebook_login_view_com_facebook_tooltip_mode>
	//   30   61:getstatic       #206 <Field LoginButton$ToolTipMode LoginButton$ToolTipMode.DEFAULT>
	//   31   64:invokevirtual   #249 <Method int LoginButton$ToolTipMode.getValue()>
	//   32   67:invokevirtual   #253 <Method int TypedArray.getInt(int, int)>
	//   33   70:invokestatic    #257 <Method LoginButton$ToolTipMode LoginButton$ToolTipMode.fromInt(int)>
	//   34   73:putfield        #120 <Field LoginButton$ToolTipMode toolTipMode>
		((TypedArray) (context)).recycle();
	//   35   76:aload_1         
	//   36   77:invokevirtual   #260 <Method void TypedArray.recycle()>
		return;
	//   37   80:return          
		attributeset;
	//   38   81:astore_2        
		((TypedArray) (context)).recycle();
	//   39   82:aload_1         
	//   40   83:invokevirtual   #260 <Method void TypedArray.recycle()>
		throw attributeset;
	//   41   86:aload_2         
	//   42   87:athrow          
	}

	private void setButtonText()
	{
		Resources resources = getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #128 <Method Resources getResources()>
	//    2    4:astore          4
		if(!isInEditMode() && AccessToken.isCurrentAccessTokenActive())
	//*   3    6:aload_0         
	//*   4    7:invokevirtual   #264 <Method boolean isInEditMode()>
	//*   5   10:ifne            46
	//*   6   13:invokestatic    #269 <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//*   7   16:ifeq            46
		{
			String s = logoutText;
	//    8   19:aload_0         
	//    9   20:getfield        #243 <Field String logoutText>
	//   10   23:astore_2        
			if(s == null)
	//*  11   24:aload_2         
	//*  12   25:ifnull          31
	//*  13   28:goto            40
				s = resources.getString(com.facebook.login.R.string.com_facebook_loginview_log_out_button);
	//   14   31:aload           4
	//   15   33:getstatic       #272 <Field int com.facebook.login.R$string.com_facebook_loginview_log_out_button>
	//   16   36:invokevirtual   #140 <Method String Resources.getString(int)>
	//   17   39:astore_2        
			setText(((CharSequence) (s)));
	//   18   40:aload_0         
	//   19   41:aload_2         
	//   20   42:invokevirtual   #276 <Method void setText(CharSequence)>
			return;
	//   21   45:return          
		}
		String s1 = loginText;
	//   22   46:aload_0         
	//   23   47:getfield        #238 <Field String loginText>
	//   24   50:astore_2        
		if(s1 != null)
	//*  25   51:aload_2         
	//*  26   52:ifnull          61
		{
			setText(((CharSequence) (s1)));
	//   27   55:aload_0         
	//   28   56:aload_2         
	//   29   57:invokevirtual   #276 <Method void setText(CharSequence)>
			return;
	//   30   60:return          
		}
		String s2 = resources.getString(com.facebook.login.R.string.com_facebook_loginview_log_in_button_continue);
	//   31   61:aload           4
	//   32   63:getstatic       #279 <Field int com.facebook.login.R$string.com_facebook_loginview_log_in_button_continue>
	//   33   66:invokevirtual   #140 <Method String Resources.getString(int)>
	//   34   69:astore_3        
		int i = getWidth();
	//   35   70:aload_0         
	//   36   71:invokevirtual   #282 <Method int getWidth()>
	//   37   74:istore_1        
		s1 = s2;
	//   38   75:aload_3         
	//   39   76:astore_2        
		if(i != 0)
	//*  40   77:iload_1         
	//*  41   78:ifeq            101
		{
			s1 = s2;
	//   42   81:aload_3         
	//   43   82:astore_2        
			if(measureButtonWidth(s2) > i)
	//*  44   83:aload_0         
	//*  45   84:aload_3         
	//*  46   85:invokespecial   #284 <Method int measureButtonWidth(String)>
	//*  47   88:iload_1         
	//*  48   89:icmple          101
				s1 = resources.getString(com.facebook.login.R.string.com_facebook_loginview_log_in_button);
	//   49   92:aload           4
	//   50   94:getstatic       #287 <Field int com.facebook.login.R$string.com_facebook_loginview_log_in_button>
	//   51   97:invokevirtual   #140 <Method String Resources.getString(int)>
	//   52  100:astore_2        
		}
		setText(((CharSequence) (s1)));
	//   53  101:aload_0         
	//   54  102:aload_2         
	//   55  103:invokevirtual   #276 <Method void setText(CharSequence)>
	//   56  106:return          
	}

	private void showToolTipPerSettings(FetchedAppSettings fetchedappsettings)
	{
		if(fetchedappsettings != null && fetchedappsettings.getNuxEnabled() && getVisibility() == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          26
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #292 <Method boolean FetchedAppSettings.getNuxEnabled()>
	//*   4    8:ifeq            26
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #295 <Method int getVisibility()>
	//*   7   15:ifne            26
			displayToolTip(fetchedappsettings.getNuxContent());
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #299 <Method String FetchedAppSettings.getNuxContent()>
	//   11   23:invokespecial   #144 <Method void displayToolTip(String)>
	//   12   26:return          
	}

	public void clearPermissions()
	{
		properties.clearPermissions();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:invokevirtual   #302 <Method void LoginButton$LoginButtonProperties.clearPermissions()>
	//    3    7:return          
	}

	protected void configureButton(Context context, AttributeSet attributeset, int i, int j)
	{
		super.configureButton(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #305 <Method void FacebookButtonBase.configureButton(Context, AttributeSet, int, int)>
		setInternalOnClickListener(((android.view.View.OnClickListener) (getNewLoginClickListener())));
	//    6    9:aload_0         
	//    7   10:aload_0         
	//    8   11:invokevirtual   #309 <Method LoginButton$LoginClickListener getNewLoginClickListener()>
	//    9   14:invokevirtual   #313 <Method void setInternalOnClickListener(android.view.View$OnClickListener)>
		parseLoginButtonAttributes(context, attributeset, i, j);
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:aload_2         
	//   13   20:iload_3         
	//   14   21:iload           4
	//   15   23:invokespecial   #315 <Method void parseLoginButtonAttributes(Context, AttributeSet, int, int)>
		if(isInEditMode())
	//*  16   26:aload_0         
	//*  17   27:invokevirtual   #264 <Method boolean isInEditMode()>
	//*  18   30:ifeq            57
		{
			setBackgroundColor(getResources().getColor(com.facebook.common.R.color.com_facebook_blue));
	//   19   33:aload_0         
	//   20   34:aload_0         
	//   21   35:invokevirtual   #128 <Method Resources getResources()>
	//   22   38:getstatic       #320 <Field int com.facebook.common.R$color.com_facebook_blue>
	//   23   41:invokevirtual   #324 <Method int Resources.getColor(int)>
	//   24   44:invokevirtual   #328 <Method void setBackgroundColor(int)>
			loginText = "Continue with Facebook";
	//   25   47:aload_0         
	//   26   48:ldc2            #330 <String "Continue with Facebook">
	//   27   51:putfield        #238 <Field String loginText>
		} else
	//*  28   54:goto            69
		{
			accessTokenTracker = ((AccessTokenTracker) (new AccessTokenTracker() {

				protected void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1)
				{
					setButtonText();
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field LoginButton this$0>
				//    2    4:invokestatic    #24  <Method void LoginButton.access$200(LoginButton)>
				//    3    7:return          
				}

				final LoginButton this$0;

			
			{
				this$0 = LoginButton.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field LoginButton this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AccessTokenTracker()>
			//    5    9:return          
			}
			}
));
	//   29   57:aload_0         
	//   30   58:new             #10  <Class LoginButton$2>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:invokespecial   #332 <Method void LoginButton$2(LoginButton)>
	//   34   66:putfield        #334 <Field AccessTokenTracker accessTokenTracker>
		}
		setButtonText();
	//   35   69:aload_0         
	//   36   70:invokespecial   #101 <Method void setButtonText()>
		setCompoundDrawablesWithIntrinsicBounds(AppCompatResources.getDrawable(getContext(), com.facebook.login.R.drawable.com_facebook_button_login_logo), ((android.graphics.drawable.Drawable) (null)), ((android.graphics.drawable.Drawable) (null)), ((android.graphics.drawable.Drawable) (null)));
	//   37   73:aload_0         
	//   38   74:aload_0         
	//   39   75:invokevirtual   #148 <Method Context getContext()>
	//   40   78:getstatic       #339 <Field int com.facebook.login.R$drawable.com_facebook_button_login_logo>
	//   41   81:invokestatic    #345 <Method android.graphics.drawable.Drawable AppCompatResources.getDrawable(Context, int)>
	//   42   84:aconst_null     
	//   43   85:aconst_null     
	//   44   86:aconst_null     
	//   45   87:invokevirtual   #349 <Method void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable)>
	//   46   90:return          
	}

	public void dismissToolTip()
	{
		ToolTipPopup tooltippopup = toolTipPopup;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field ToolTipPopup toolTipPopup>
	//    2    4:astore_1        
		if(tooltippopup != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			tooltippopup.dismiss();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #353 <Method void ToolTipPopup.dismiss()>
			toolTipPopup = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #176 <Field ToolTipPopup toolTipPopup>
		}
	//   10   18:return          
	}

	public String getAuthType()
	{
		return properties.getAuthType();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:invokevirtual   #356 <Method String LoginButton$LoginButtonProperties.getAuthType()>
	//    3    7:areturn         
	}

	public DefaultAudience getDefaultAudience()
	{
		return properties.getDefaultAudience();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:invokevirtual   #360 <Method DefaultAudience LoginButton$LoginButtonProperties.getDefaultAudience()>
	//    3    7:areturn         
	}

	protected int getDefaultRequestCode()
	{
		return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
	//    0    0:getstatic       #367 <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Login>
	//    1    3:invokevirtual   #370 <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:ireturn         
	}

	protected int getDefaultStyleResource()
	{
		return com.facebook.login.R.style.com_facebook_loginview_default_style;
	//    0    0:getstatic       #376 <Field int com.facebook.login.R$style.com_facebook_loginview_default_style>
	//    1    3:ireturn         
	}

	public LoginBehavior getLoginBehavior()
	{
		return properties.getLoginBehavior();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:invokevirtual   #380 <Method LoginBehavior LoginButton$LoginButtonProperties.getLoginBehavior()>
	//    3    7:areturn         
	}

	LoginManager getLoginManager()
	{
		if(loginManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #384 <Field LoginManager loginManager>
	//*   2    4:ifnonnull       14
			loginManager = LoginManager.getInstance();
	//    3    7:aload_0         
	//    4    8:invokestatic    #389 <Method LoginManager LoginManager.getInstance()>
	//    5   11:putfield        #384 <Field LoginManager loginManager>
		return loginManager;
	//    6   14:aload_0         
	//    7   15:getfield        #384 <Field LoginManager loginManager>
	//    8   18:areturn         
	}

	protected LoginClickListener getNewLoginClickListener()
	{
		return new LoginClickListener();
	//    0    0:new             #17  <Class LoginButton$LoginClickListener>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #390 <Method void LoginButton$LoginClickListener(LoginButton)>
	//    4    8:areturn         
	}

	List getPermissions()
	{
		return properties.getPermissions();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:invokevirtual   #394 <Method List LoginButton$LoginButtonProperties.getPermissions()>
	//    3    7:areturn         
	}

	public long getToolTipDisplayTime()
	{
		return toolTipDisplayTime;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field long toolTipDisplayTime>
	//    2    4:lreturn         
	}

	public ToolTipMode getToolTipMode()
	{
		return toolTipMode;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field LoginButton$ToolTipMode toolTipMode>
	//    2    4:areturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #403 <Method void FacebookButtonBase.onAttachedToWindow()>
		AccessTokenTracker accesstokentracker = accessTokenTracker;
	//    2    4:aload_0         
	//    3    5:getfield        #334 <Field AccessTokenTracker accessTokenTracker>
	//    4    8:astore_1        
		if(accesstokentracker != null && !accesstokentracker.isTracking())
	//*   5    9:aload_1         
	//*   6   10:ifnull          31
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #408 <Method boolean AccessTokenTracker.isTracking()>
	//*   9   17:ifne            31
		{
			accessTokenTracker.startTracking();
	//   10   20:aload_0         
	//   11   21:getfield        #334 <Field AccessTokenTracker accessTokenTracker>
	//   12   24:invokevirtual   #411 <Method void AccessTokenTracker.startTracking()>
			setButtonText();
	//   13   27:aload_0         
	//   14   28:invokespecial   #101 <Method void setButtonText()>
		}
	//   15   31:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #414 <Method void FacebookButtonBase.onDetachedFromWindow()>
		AccessTokenTracker accesstokentracker = accessTokenTracker;
	//    2    4:aload_0         
	//    3    5:getfield        #334 <Field AccessTokenTracker accessTokenTracker>
	//    4    8:astore_1        
		if(accesstokentracker != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
			accesstokentracker.stopTracking();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #417 <Method void AccessTokenTracker.stopTracking()>
		dismissToolTip();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #419 <Method void dismissToolTip()>
	//   11   21:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #423 <Method void FacebookButtonBase.onDraw(Canvas)>
		if(!toolTipChecked && !isInEditMode())
	//*   3    5:aload_0         
	//*   4    6:getfield        #425 <Field boolean toolTipChecked>
	//*   5    9:ifne            28
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #264 <Method boolean isInEditMode()>
	//*   8   16:ifne            28
		{
			toolTipChecked = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #425 <Field boolean toolTipChecked>
			checkToolTipSettings();
	//   12   24:aload_0         
	//   13   25:invokespecial   #427 <Method void checkToolTipSettings()>
		}
	//   14   28:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		super.onLayout(flag, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #431 <Method void FacebookButtonBase.onLayout(boolean, int, int, int, int)>
		setButtonText();
	//    7   11:aload_0         
	//    8   12:invokespecial   #101 <Method void setButtonText()>
	//    9   15:return          
	}

	protected void onMeasure(int i, int j)
	{
		Object obj = ((Object) (getPaint().getFontMetrics()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #437 <Method TextPaint getPaint()>
	//    2    4:invokevirtual   #443 <Method android.graphics.Paint$FontMetrics TextPaint.getFontMetrics()>
	//    3    7:astore          6
		j = getCompoundPaddingTop();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #446 <Method int getCompoundPaddingTop()>
	//    6   13:istore_2        
		int k = (int)Math.ceil(Math.abs(((android.graphics.Paint.FontMetrics) (obj)).top) + Math.abs(((android.graphics.Paint.FontMetrics) (obj)).bottom));
	//    7   14:aload           6
	//    8   16:getfield        #452 <Field float android.graphics.Paint$FontMetrics.top>
	//    9   19:invokestatic    #458 <Method float Math.abs(float)>
	//   10   22:aload           6
	//   11   24:getfield        #461 <Field float android.graphics.Paint$FontMetrics.bottom>
	//   12   27:invokestatic    #458 <Method float Math.abs(float)>
	//   13   30:fadd            
	//   14   31:f2d             
	//   15   32:invokestatic    #465 <Method double Math.ceil(double)>
	//   16   35:d2i             
	//   17   36:istore_3        
		int l = getCompoundPaddingBottom();
	//   18   37:aload_0         
	//   19   38:invokevirtual   #468 <Method int getCompoundPaddingBottom()>
	//   20   41:istore          4
		Resources resources = getResources();
	//   21   43:aload_0         
	//   22   44:invokevirtual   #128 <Method Resources getResources()>
	//   23   47:astore          8
		String s = loginText;
	//   24   49:aload_0         
	//   25   50:getfield        #238 <Field String loginText>
	//   26   53:astore          7
		obj = ((Object) (s));
	//   27   55:aload           7
	//   28   57:astore          6
		if(s == null)
	//*  29   59:aload           7
	//*  30   61:ifnonnull       103
		{
			obj = ((Object) (resources.getString(com.facebook.login.R.string.com_facebook_loginview_log_in_button_continue)));
	//   31   64:aload           8
	//   32   66:getstatic       #279 <Field int com.facebook.login.R$string.com_facebook_loginview_log_in_button_continue>
	//   33   69:invokevirtual   #140 <Method String Resources.getString(int)>
	//   34   72:astore          6
			int i1 = measureButtonWidth(((String) (obj)));
	//   35   74:aload_0         
	//   36   75:aload           6
	//   37   77:invokespecial   #284 <Method int measureButtonWidth(String)>
	//   38   80:istore          5
			if(resolveSize(i1, i) < i1)
	//*  39   82:iload           5
	//*  40   84:iload_1         
	//*  41   85:invokestatic    #471 <Method int resolveSize(int, int)>
	//*  42   88:iload           5
	//*  43   90:icmpge          103
				obj = ((Object) (resources.getString(com.facebook.login.R.string.com_facebook_loginview_log_in_button)));
	//   44   93:aload           8
	//   45   95:getstatic       #287 <Field int com.facebook.login.R$string.com_facebook_loginview_log_in_button>
	//   46   98:invokevirtual   #140 <Method String Resources.getString(int)>
	//   47  101:astore          6
		}
		int j1 = measureButtonWidth(((String) (obj)));
	//   48  103:aload_0         
	//   49  104:aload           6
	//   50  106:invokespecial   #284 <Method int measureButtonWidth(String)>
	//   51  109:istore          5
		s = logoutText;
	//   52  111:aload_0         
	//   53  112:getfield        #243 <Field String logoutText>
	//   54  115:astore          7
		obj = ((Object) (s));
	//   55  117:aload           7
	//   56  119:astore          6
		if(s == null)
	//*  57  121:aload           7
	//*  58  123:ifnonnull       136
			obj = ((Object) (resources.getString(com.facebook.login.R.string.com_facebook_loginview_log_out_button)));
	//   59  126:aload           8
	//   60  128:getstatic       #272 <Field int com.facebook.login.R$string.com_facebook_loginview_log_out_button>
	//   61  131:invokevirtual   #140 <Method String Resources.getString(int)>
	//   62  134:astore          6
		setMeasuredDimension(resolveSize(Math.max(j1, measureButtonWidth(((String) (obj)))), i), j + k + l);
	//   63  136:aload_0         
	//   64  137:iload           5
	//   65  139:aload_0         
	//   66  140:aload           6
	//   67  142:invokespecial   #284 <Method int measureButtonWidth(String)>
	//   68  145:invokestatic    #474 <Method int Math.max(int, int)>
	//   69  148:iload_1         
	//   70  149:invokestatic    #471 <Method int resolveSize(int, int)>
	//   71  152:iload_2         
	//   72  153:iload_3         
	//   73  154:iadd            
	//   74  155:iload           4
	//   75  157:iadd            
	//   76  158:invokevirtual   #477 <Method void setMeasuredDimension(int, int)>
	//   77  161:return          
	}

	protected void onVisibilityChanged(View view, int i)
	{
		super.onVisibilityChanged(view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #481 <Method void FacebookButtonBase.onVisibilityChanged(View, int)>
		if(i != 0)
	//*   4    6:iload_2         
	//*   5    7:ifeq            14
			dismissToolTip();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #419 <Method void dismissToolTip()>
	//    8   14:return          
	}

	public void registerCallback(CallbackManager callbackmanager, FacebookCallback facebookcallback)
	{
		getLoginManager().registerCallback(callbackmanager, facebookcallback);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #485 <Method LoginManager getLoginManager()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #487 <Method void LoginManager.registerCallback(CallbackManager, FacebookCallback)>
	//    5    9:return          
	}

	public void setAuthType(String s)
	{
		properties.setAuthType(s);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #491 <Method void LoginButton$LoginButtonProperties.setAuthType(String)>
	//    4    8:return          
	}

	public void setDefaultAudience(DefaultAudience defaultaudience)
	{
		properties.setDefaultAudience(defaultaudience);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #495 <Method void LoginButton$LoginButtonProperties.setDefaultAudience(DefaultAudience)>
	//    4    8:return          
	}

	public void setLoginBehavior(LoginBehavior loginbehavior)
	{
		properties.setLoginBehavior(loginbehavior);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #499 <Method void LoginButton$LoginButtonProperties.setLoginBehavior(LoginBehavior)>
	//    4    8:return          
	}

	void setLoginManager(LoginManager loginmanager)
	{
		loginManager = loginmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #384 <Field LoginManager loginManager>
	//    3    5:return          
	}

	void setProperties(LoginButtonProperties loginbuttonproperties)
	{
		properties = loginbuttonproperties;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    3    5:return          
	}

	public void setPublishPermissions(List list)
	{
		properties.setPublishPermissions(list);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #507 <Method void LoginButton$LoginButtonProperties.setPublishPermissions(List)>
	//    4    8:return          
	}

	public transient void setPublishPermissions(String as[])
	{
		properties.setPublishPermissions(Arrays.asList(((Object []) (as))));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:aload_1         
	//    3    5:invokestatic    #515 <Method List Arrays.asList(Object[])>
	//    4    8:invokevirtual   #507 <Method void LoginButton$LoginButtonProperties.setPublishPermissions(List)>
	//    5   11:return          
	}

	public void setReadPermissions(List list)
	{
		properties.setReadPermissions(list);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #518 <Method void LoginButton$LoginButtonProperties.setReadPermissions(List)>
	//    4    8:return          
	}

	public transient void setReadPermissions(String as[])
	{
		properties.setReadPermissions(Arrays.asList(((Object []) (as))));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:aload_1         
	//    3    5:invokestatic    #515 <Method List Arrays.asList(Object[])>
	//    4    8:invokevirtual   #518 <Method void LoginButton$LoginButtonProperties.setReadPermissions(List)>
	//    5   11:return          
	}

	public void setToolTipDisplayTime(long l)
	{
		toolTipDisplayTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #78  <Field long toolTipDisplayTime>
	//    3    5:return          
	}

	public void setToolTipMode(ToolTipMode tooltipmode)
	{
		toolTipMode = tooltipmode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #120 <Field LoginButton$ToolTipMode toolTipMode>
	//    3    5:return          
	}

	public void setToolTipStyle(ToolTipPopup.Style style)
	{
		toolTipStyle = style;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #74  <Field ToolTipPopup$Style toolTipStyle>
	//    3    5:return          
	}

	public void unregisterCallback(CallbackManager callbackmanager)
	{
		getLoginManager().unregisterCallback(callbackmanager);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #485 <Method LoginManager getLoginManager()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #526 <Method void LoginManager.unregisterCallback(CallbackManager)>
	//    4    8:return          
	}

	private static final String TAG = "com.facebook.login.widget.LoginButton";
	private AccessTokenTracker accessTokenTracker;
	private boolean confirmLogout;
	private String loginLogoutEventName;
	private LoginManager loginManager;
	private String loginText;
	private String logoutText;
	private LoginButtonProperties properties;
	private boolean toolTipChecked;
	private long toolTipDisplayTime;
	private ToolTipMode toolTipMode;
	private ToolTipPopup toolTipPopup;
	private ToolTipPopup.Style toolTipStyle;

	static 
	{
	//    0    0:return          
	}


/*
	static void access$000(LoginButton loginbutton, FetchedAppSettings fetchedappsettings)
	{
		loginbutton.showToolTipPerSettings(fetchedappsettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #86  <Method void showToolTipPerSettings(FetchedAppSettings)>
		return;
	//    3    5:return          
	}

*/


/*
	static Activity access$100(LoginButton loginbutton)
	{
		return loginbutton.getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method Activity getActivity()>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$1000(LoginButton loginbutton)
	{
		return loginbutton.confirmLogout;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field boolean confirmLogout>
	//    2    4:ireturn         
	}

*/


/*
	static void access$200(LoginButton loginbutton)
	{
		loginbutton.setButtonText();
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method void setButtonText()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$300(LoginButton loginbutton, View view)
	{
		loginbutton.callExternalOnClickListener(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #107 <Method void callExternalOnClickListener(View)>
		return;
	//    3    5:return          
	}

*/


/*
	static String access$400(LoginButton loginbutton)
	{
		return loginbutton.loginLogoutEventName;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field String loginLogoutEventName>
	//    2    4:areturn         
	}

*/


/*
	static LoginButtonProperties access$500(LoginButton loginbutton)
	{
		return loginbutton.properties;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:areturn         
	}

*/


/*
	static Activity access$800(LoginButton loginbutton)
	{
		return loginbutton.getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method Activity getActivity()>
	//    2    4:areturn         
	}

*/


/*
	static Activity access$900(LoginButton loginbutton)
	{
		return loginbutton.getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method Activity getActivity()>
	//    2    4:areturn         
	}

*/
}
