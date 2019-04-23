// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import com.facebook.Profile;
import com.facebook.internal.LoginAuthorizationType;
import com.facebook.login.LoginManager;

// Referenced classes of package com.facebook.login.widget:
//			LoginButton

protected class LoginButton$LoginClickListener
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
	//    5    9:invokevirtual   #32  <Method com.facebook.login.DefaultAudience LoginButton.getDefaultAudience()>
	//    6   12:invokevirtual   #36  <Method LoginManager LoginManager.setDefaultAudience(com.facebook.login.DefaultAudience)>
	//    7   15:pop             
		loginmanager.setLoginBehavior(getLoginBehavior());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #17  <Field LoginButton this$0>
	//   11   21:invokevirtual   #40  <Method com.facebook.login.LoginBehavior LoginButton.getLoginBehavior()>
	//   12   24:invokevirtual   #44  <Method LoginManager LoginManager.setLoginBehavior(com.facebook.login.LoginBehavior)>
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
		if(LoginAuthorizationType.PUBLISH.equals(((Object) (es.access._mth600(LoginButton.access$500(LoginButton.this))))))
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
				loginmanager.logInWithPublishPermissions(getFragment(), ((java.util.Collection) (es.access._mth700(LoginButton.access$500(LoginButton.this)))));
	//   14   34:aload_1         
	//   15   35:aload_0         
	//   16   36:getfield        #17  <Field LoginButton this$0>
	//   17   39:invokevirtual   #90  <Method android.support.v4.app.Fragment LoginButton.getFragment()>
	//   18   42:aload_0         
	//   19   43:getfield        #17  <Field LoginButton this$0>
	//   20   46:invokestatic    #76  <Method LoginButton$LoginButtonProperties LoginButton.access$500(LoginButton)>
	//   21   49:invokestatic    #94  <Method java.util.List LoginButton$LoginButtonProperties.access$700(LoginButton$LoginButtonProperties)>
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
				loginmanager.logInWithPublishPermissions(getNativeFragment(), ((java.util.Collection) (es.access._mth700(LoginButton.access$500(LoginButton.this)))));
	//   28   66:aload_1         
	//   29   67:aload_0         
	//   30   68:getfield        #17  <Field LoginButton this$0>
	//   31   71:invokevirtual   #102 <Method android.app.Fragment LoginButton.getNativeFragment()>
	//   32   74:aload_0         
	//   33   75:getfield        #17  <Field LoginButton this$0>
	//   34   78:invokestatic    #76  <Method LoginButton$LoginButtonProperties LoginButton.access$500(LoginButton)>
	//   35   81:invokestatic    #94  <Method java.util.List LoginButton$LoginButtonProperties.access$700(LoginButton$LoginButtonProperties)>
	//   36   84:invokevirtual   #105 <Method void LoginManager.logInWithPublishPermissions(android.app.Fragment, java.util.Collection)>
				return;
	//   37   87:return          
			} else
			{
				loginmanager.logInWithPublishPermissions(LoginButton.access$800(LoginButton.this), ((java.util.Collection) (es.access._mth700(LoginButton.access$500(LoginButton.this)))));
	//   38   88:aload_1         
	//   39   89:aload_0         
	//   40   90:getfield        #17  <Field LoginButton this$0>
	//   41   93:invokestatic    #109 <Method android.app.Activity LoginButton.access$800(LoginButton)>
	//   42   96:aload_0         
	//   43   97:getfield        #17  <Field LoginButton this$0>
	//   44  100:invokestatic    #76  <Method LoginButton$LoginButtonProperties LoginButton.access$500(LoginButton)>
	//   45  103:invokestatic    #94  <Method java.util.List LoginButton$LoginButtonProperties.access$700(LoginButton$LoginButtonProperties)>
	//   46  106:invokevirtual   #112 <Method void LoginManager.logInWithPublishPermissions(android.app.Activity, java.util.Collection)>
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
			loginmanager.logInWithReadPermissions(getFragment(), ((java.util.Collection) (es.access._mth700(LoginButton.access$500(LoginButton.this)))));
	//   52  120:aload_1         
	//   53  121:aload_0         
	//   54  122:getfield        #17  <Field LoginButton this$0>
	//   55  125:invokevirtual   #90  <Method android.support.v4.app.Fragment LoginButton.getFragment()>
	//   56  128:aload_0         
	//   57  129:getfield        #17  <Field LoginButton this$0>
	//   58  132:invokestatic    #76  <Method LoginButton$LoginButtonProperties LoginButton.access$500(LoginButton)>
	//   59  135:invokestatic    #94  <Method java.util.List LoginButton$LoginButtonProperties.access$700(LoginButton$LoginButtonProperties)>
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
			loginmanager.logInWithReadPermissions(getNativeFragment(), ((java.util.Collection) (es.access._mth700(LoginButton.access$500(LoginButton.this)))));
	//   66  152:aload_1         
	//   67  153:aload_0         
	//   68  154:getfield        #17  <Field LoginButton this$0>
	//   69  157:invokevirtual   #102 <Method android.app.Fragment LoginButton.getNativeFragment()>
	//   70  160:aload_0         
	//   71  161:getfield        #17  <Field LoginButton this$0>
	//   72  164:invokestatic    #76  <Method LoginButton$LoginButtonProperties LoginButton.access$500(LoginButton)>
	//   73  167:invokestatic    #94  <Method java.util.List LoginButton$LoginButtonProperties.access$700(LoginButton$LoginButtonProperties)>
	//   74  170:invokevirtual   #117 <Method void LoginManager.logInWithReadPermissions(android.app.Fragment, java.util.Collection)>
			return;
	//   75  173:return          
		} else
		{
			loginmanager.logInWithReadPermissions(LoginButton.access$900(LoginButton.this), ((java.util.Collection) (es.access._mth700(LoginButton.access$500(LoginButton.this)))));
	//   76  174:aload_1         
	//   77  175:aload_0         
	//   78  176:getfield        #17  <Field LoginButton this$0>
	//   79  179:invokestatic    #120 <Method android.app.Activity LoginButton.access$900(LoginButton)>
	//   80  182:aload_0         
	//   81  183:getfield        #17  <Field LoginButton this$0>
	//   82  186:invokestatic    #76  <Method LoginButton$LoginButtonProperties LoginButton.access$500(LoginButton)>
	//   83  189:invokestatic    #94  <Method java.util.List LoginButton$LoginButtonProperties.access$700(LoginButton$LoginButtonProperties)>
	//   84  192:invokevirtual   #122 <Method void LoginManager.logInWithReadPermissions(android.app.Activity, java.util.Collection)>
			return;
	//   85  195:return          
		}
	}

	protected void performLogout(Context context)
	{
		final LoginManager loginManager = getLoginManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method LoginManager getLoginManager()>
	//    2    4:astore_3        
		if(LoginButton.access$1000(LoginButton.this))
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
			((android.app.AlertDialog.Builder) (context)).setMessage(((CharSequence) (obj))).setCancelable(true).setPositiveButton(((CharSequence) (s)), new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int i)
				{
					loginManager.logOut();
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field LoginManager val$loginManager>
				//    2    4:invokevirtual   #35  <Method void LoginManager.logOut()>
				//    3    7:return          
				}

				final LoginButton.LoginClickListener this$1;
				final LoginManager val$loginManager;

			
			{
				this$1 = LoginButton.LoginClickListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field LoginButton$LoginClickListener this$1>
				loginManager = loginmanager;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field LoginManager val$loginManager>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
).setNegativeButton(((CharSequence) (s1)), ((android.content.) (null)));
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
			loginManager.logOut();
	//   72  152:aload_3         
	//   73  153:invokevirtual   #202 <Method void LoginManager.logOut()>
			return;
	//   74  156:return          
		}
	}

	final LoginButton this$0;

	protected LoginButton$LoginClickListener()
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
