// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.LoginAuthorizationType;
import com.facebook.login.LoginManager;

// Referenced classes of package com.facebook.login.widget:
//			LoginButton

private class LoginButton$LoginClickListener
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		LoginButton.access$400(LoginButton.this, view);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field LoginButton this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #30  <Method void LoginButton.access$400(LoginButton, View)>
		Object obj = ((Object) (getContext()));
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field LoginButton this$0>
	//    6   12:invokevirtual   #34  <Method android.content.Context LoginButton.getContext()>
	//    7   15:astore          6
		AccessToken accesstoken = AccessToken.getCurrentAccessToken();
	//    8   17:invokestatic    #40  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    9   20:astore_3        
		int i = 0;
	//   10   21:iconst_0        
	//   11   22:istore_2        
		if(accesstoken != null)
	//*  12   23:aload_3         
	//*  13   24:ifnull          192
		{
			if(LoginButton.access$500(LoginButton.this))
	//*  14   27:aload_0         
	//*  15   28:getfield        #17  <Field LoginButton this$0>
	//*  16   31:invokestatic    #44  <Method boolean LoginButton.access$500(LoginButton)>
	//*  17   34:ifeq            179
			{
				String s = getResources().getString(com.facebook.R.string.com_facebook_loginview_log_out_action);
	//   18   37:aload_0         
	//   19   38:getfield        #17  <Field LoginButton this$0>
	//   20   41:invokevirtual   #48  <Method Resources LoginButton.getResources()>
	//   21   44:getstatic       #54  <Field int com.facebook.R$string.com_facebook_loginview_log_out_action>
	//   22   47:invokevirtual   #60  <Method String Resources.getString(int)>
	//   23   50:astore          4
				String s1 = getResources().getString(com.facebook.R.string.com_facebook_loginview_cancel_action);
	//   24   52:aload_0         
	//   25   53:getfield        #17  <Field LoginButton this$0>
	//   26   56:invokevirtual   #48  <Method Resources LoginButton.getResources()>
	//   27   59:getstatic       #63  <Field int com.facebook.R$string.com_facebook_loginview_cancel_action>
	//   28   62:invokevirtual   #60  <Method String Resources.getString(int)>
	//   29   65:astore          5
				view = ((View) (Profile.getCurrentProfile()));
	//   30   67:invokestatic    #69  <Method Profile Profile.getCurrentProfile()>
	//   31   70:astore_1        
				if(view != null && ((Profile) (view)).getName() != null)
	//*  32   71:aload_1         
	//*  33   72:ifnull          113
	//*  34   75:aload_1         
	//*  35   76:invokevirtual   #73  <Method String Profile.getName()>
	//*  36   79:ifnull          113
					view = ((View) (String.format(getResources().getString(com.facebook.R.string.com_facebook_loginview_logged_in_as), new Object[] {
						((Profile) (view)).getName()
					})));
	//   37   82:aload_0         
	//   38   83:getfield        #17  <Field LoginButton this$0>
	//   39   86:invokevirtual   #48  <Method Resources LoginButton.getResources()>
	//   40   89:getstatic       #76  <Field int com.facebook.R$string.com_facebook_loginview_logged_in_as>
	//   41   92:invokevirtual   #60  <Method String Resources.getString(int)>
	//   42   95:iconst_1        
	//   43   96:anewarray       Object[]
	//   44   99:dup             
	//   45  100:iconst_0        
	//   46  101:aload_1         
	//   47  102:invokevirtual   #73  <Method String Profile.getName()>
	//   48  105:aastore         
	//   49  106:invokestatic    #82  <Method String String.format(String, Object[])>
	//   50  109:astore_1        
				else
	//*  51  110:goto            127
					view = ((View) (getResources().getString(com.facebook.R.string.com_facebook_loginview_logged_in_using_facebook)));
	//   52  113:aload_0         
	//   53  114:getfield        #17  <Field LoginButton this$0>
	//   54  117:invokevirtual   #48  <Method Resources LoginButton.getResources()>
	//   55  120:getstatic       #85  <Field int com.facebook.R$string.com_facebook_loginview_logged_in_using_facebook>
	//   56  123:invokevirtual   #60  <Method String Resources.getString(int)>
	//   57  126:astore_1        
				obj = ((Object) (new android.app.AlertDialog.Builder(((android.content.Context) (obj)))));
	//   58  127:new             #87  <Class android.app.AlertDialog$Builder>
	//   59  130:dup             
	//   60  131:aload           6
	//   61  133:invokespecial   #90  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   62  136:astore          6
				((android.app.AlertDialog.Builder) (obj)).setMessage(((CharSequence) (view))).setCancelable(true).setPositiveButton(((CharSequence) (s)), new android.content.DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialoginterface, int j)
					{
						getLoginManager().logOut();
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field LoginButton$LoginClickListener this$1>
					//    2    4:getfield        #29  <Field LoginButton LoginButton$LoginClickListener.this$0>
					//    3    7:invokevirtual   #33  <Method LoginManager LoginButton.getLoginManager()>
					//    4   10:invokevirtual   #38  <Method void LoginManager.logOut()>
					//    5   13:return          
					}

					final LoginButton.LoginClickListener this$1;

			
			{
				this$1 = LoginButton.LoginClickListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field LoginButton$LoginClickListener this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
				}
).setNegativeButton(((CharSequence) (s1)), ((android.content.) (null)));
	//   63  138:aload           6
	//   64  140:aload_1         
	//   65  141:invokevirtual   #94  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   66  144:iconst_1        
	//   67  145:invokevirtual   #98  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
	//   68  148:aload           4
	//   69  150:new             #11  <Class LoginButton$LoginClickListener$1>
	//   70  153:dup             
	//   71  154:aload_0         
	//   72  155:invokespecial   #101 <Method void LoginButton$LoginClickListener$1(LoginButton$LoginClickListener)>
	//   73  158:invokevirtual   #105 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   74  161:aload           5
	//   75  163:aconst_null     
	//   76  164:invokevirtual   #108 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   77  167:pop             
				((android.app.AlertDialog.Builder) (obj)).create().show();
	//   78  168:aload           6
	//   79  170:invokevirtual   #112 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   80  173:invokevirtual   #117 <Method void AlertDialog.show()>
			} else
	//*  81  176:goto            356
			{
				getLoginManager().logOut();
	//   82  179:aload_0         
	//   83  180:getfield        #17  <Field LoginButton this$0>
	//   84  183:invokevirtual   #121 <Method LoginManager LoginButton.getLoginManager()>
	//   85  186:invokevirtual   #126 <Method void LoginManager.logOut()>
			}
		} else
	//*  86  189:goto            356
		{
			view = ((View) (getLoginManager()));
	//   87  192:aload_0         
	//   88  193:getfield        #17  <Field LoginButton this$0>
	//   89  196:invokevirtual   #121 <Method LoginManager LoginButton.getLoginManager()>
	//   90  199:astore_1        
			((LoginManager) (view)).setDefaultAudience(getDefaultAudience());
	//   91  200:aload_1         
	//   92  201:aload_0         
	//   93  202:getfield        #17  <Field LoginButton this$0>
	//   94  205:invokevirtual   #130 <Method com.facebook.login.DefaultAudience LoginButton.getDefaultAudience()>
	//   95  208:invokevirtual   #134 <Method LoginManager LoginManager.setDefaultAudience(com.facebook.login.DefaultAudience)>
	//   96  211:pop             
			((LoginManager) (view)).setLoginBehavior(getLoginBehavior());
	//   97  212:aload_1         
	//   98  213:aload_0         
	//   99  214:getfield        #17  <Field LoginButton this$0>
	//  100  217:invokevirtual   #138 <Method com.facebook.login.LoginBehavior LoginButton.getLoginBehavior()>
	//  101  220:invokevirtual   #142 <Method LoginManager LoginManager.setLoginBehavior(com.facebook.login.LoginBehavior)>
	//  102  223:pop             
			if(LoginAuthorizationType.PUBLISH.equals(((Object) (es.access._mth700(LoginButton.access$600(LoginButton.this))))))
	//* 103  224:getstatic       #148 <Field LoginAuthorizationType LoginAuthorizationType.PUBLISH>
	//* 104  227:aload_0         
	//* 105  228:getfield        #17  <Field LoginButton this$0>
	//* 106  231:invokestatic    #152 <Method LoginButton$LoginButtonProperties LoginButton.access$600(LoginButton)>
	//* 107  234:invokestatic    #158 <Method LoginAuthorizationType LoginButton$LoginButtonProperties.access$700(LoginButton$LoginButtonProperties)>
	//* 108  237:invokevirtual   #162 <Method boolean LoginAuthorizationType.equals(Object)>
	//* 109  240:ifeq            301
			{
				if(getFragment() != null)
	//* 110  243:aload_0         
	//* 111  244:getfield        #17  <Field LoginButton this$0>
	//* 112  247:invokevirtual   #166 <Method android.support.v4.app.Fragment LoginButton.getFragment()>
	//* 113  250:ifnull          277
					((LoginManager) (view)).logInWithPublishPermissions(getFragment(), ((java.util.Collection) (es.access._mth800(LoginButton.access$600(LoginButton.this)))));
	//  114  253:aload_1         
	//  115  254:aload_0         
	//  116  255:getfield        #17  <Field LoginButton this$0>
	//  117  258:invokevirtual   #166 <Method android.support.v4.app.Fragment LoginButton.getFragment()>
	//  118  261:aload_0         
	//  119  262:getfield        #17  <Field LoginButton this$0>
	//  120  265:invokestatic    #152 <Method LoginButton$LoginButtonProperties LoginButton.access$600(LoginButton)>
	//  121  268:invokestatic    #170 <Method java.util.List LoginButton$LoginButtonProperties.access$800(LoginButton$LoginButtonProperties)>
	//  122  271:invokevirtual   #174 <Method void LoginManager.logInWithPublishPermissions(android.support.v4.app.Fragment, java.util.Collection)>
				else
	//* 123  274:goto            356
					((LoginManager) (view)).logInWithPublishPermissions(LoginButton.access$900(LoginButton.this), ((java.util.Collection) (es.access._mth800(LoginButton.access$600(LoginButton.this)))));
	//  124  277:aload_1         
	//  125  278:aload_0         
	//  126  279:getfield        #17  <Field LoginButton this$0>
	//  127  282:invokestatic    #178 <Method android.app.Activity LoginButton.access$900(LoginButton)>
	//  128  285:aload_0         
	//  129  286:getfield        #17  <Field LoginButton this$0>
	//  130  289:invokestatic    #152 <Method LoginButton$LoginButtonProperties LoginButton.access$600(LoginButton)>
	//  131  292:invokestatic    #170 <Method java.util.List LoginButton$LoginButtonProperties.access$800(LoginButton$LoginButtonProperties)>
	//  132  295:invokevirtual   #181 <Method void LoginManager.logInWithPublishPermissions(android.app.Activity, java.util.Collection)>
			} else
	//* 133  298:goto            356
			if(getFragment() != null)
	//* 134  301:aload_0         
	//* 135  302:getfield        #17  <Field LoginButton this$0>
	//* 136  305:invokevirtual   #166 <Method android.support.v4.app.Fragment LoginButton.getFragment()>
	//* 137  308:ifnull          335
				((LoginManager) (view)).logInWithReadPermissions(getFragment(), ((java.util.Collection) (es.access._mth800(LoginButton.access$600(LoginButton.this)))));
	//  138  311:aload_1         
	//  139  312:aload_0         
	//  140  313:getfield        #17  <Field LoginButton this$0>
	//  141  316:invokevirtual   #166 <Method android.support.v4.app.Fragment LoginButton.getFragment()>
	//  142  319:aload_0         
	//  143  320:getfield        #17  <Field LoginButton this$0>
	//  144  323:invokestatic    #152 <Method LoginButton$LoginButtonProperties LoginButton.access$600(LoginButton)>
	//  145  326:invokestatic    #170 <Method java.util.List LoginButton$LoginButtonProperties.access$800(LoginButton$LoginButtonProperties)>
	//  146  329:invokevirtual   #184 <Method void LoginManager.logInWithReadPermissions(android.support.v4.app.Fragment, java.util.Collection)>
			else
	//* 147  332:goto            356
				((LoginManager) (view)).logInWithReadPermissions(LoginButton.access$1000(LoginButton.this), ((java.util.Collection) (es.access._mth800(LoginButton.access$600(LoginButton.this)))));
	//  148  335:aload_1         
	//  149  336:aload_0         
	//  150  337:getfield        #17  <Field LoginButton this$0>
	//  151  340:invokestatic    #187 <Method android.app.Activity LoginButton.access$1000(LoginButton)>
	//  152  343:aload_0         
	//  153  344:getfield        #17  <Field LoginButton this$0>
	//  154  347:invokestatic    #152 <Method LoginButton$LoginButtonProperties LoginButton.access$600(LoginButton)>
	//  155  350:invokestatic    #170 <Method java.util.List LoginButton$LoginButtonProperties.access$800(LoginButton$LoginButtonProperties)>
	//  156  353:invokevirtual   #189 <Method void LoginManager.logInWithReadPermissions(android.app.Activity, java.util.Collection)>
		}
		view = ((View) (AppEventsLogger.newLogger(getContext())));
	//  157  356:aload_0         
	//  158  357:getfield        #17  <Field LoginButton this$0>
	//  159  360:invokevirtual   #34  <Method android.content.Context LoginButton.getContext()>
	//  160  363:invokestatic    #195 <Method AppEventsLogger AppEventsLogger.newLogger(android.content.Context)>
	//  161  366:astore_1        
		Bundle bundle = new Bundle();
	//  162  367:new             #197 <Class Bundle>
	//  163  370:dup             
	//  164  371:invokespecial   #198 <Method void Bundle()>
	//  165  374:astore          4
		if(accesstoken == null)
	//* 166  376:aload_3         
	//* 167  377:ifnull          383
	//* 168  380:goto            385
			i = 1;
	//  169  383:iconst_1        
	//  170  384:istore_2        
		bundle.putInt("logging_in", i);
	//  171  385:aload           4
	//  172  387:ldc1            #200 <String "logging_in">
	//  173  389:iload_2         
	//  174  390:invokevirtual   #204 <Method void Bundle.putInt(String, int)>
		((AppEventsLogger) (view)).logSdkEvent(LoginButton.access$1100(LoginButton.this), ((Double) (null)), bundle);
	//  175  393:aload_1         
	//  176  394:aload_0         
	//  177  395:getfield        #17  <Field LoginButton this$0>
	//  178  398:invokestatic    #208 <Method String LoginButton.access$1100(LoginButton)>
	//  179  401:aconst_null     
	//  180  402:aload           4
	//  181  404:invokevirtual   #212 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//  182  407:return          
	}

	final LoginButton this$0;

	private LoginButton$LoginClickListener()
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

	LoginButton$LoginClickListener(LoginButton._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void LoginButton$LoginClickListener(LoginButton)>
	//    3    5:return          
	}
}
