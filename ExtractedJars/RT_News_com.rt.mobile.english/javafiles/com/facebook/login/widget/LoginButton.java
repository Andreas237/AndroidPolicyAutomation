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
import android.os.Bundle;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.*;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.LoginAuthorizationType;
import com.facebook.internal.Utility;
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
		//    2    2:putfield        #35  <Field List permissions>
			authorizationType = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #37  <Field LoginAuthorizationType authorizationType>
		//    6   10:return          
		}

		public DefaultAudience getDefaultAudience()
		{
			return defaultAudience;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field DefaultAudience defaultAudience>
		//    2    4:areturn         
		}

		public LoginBehavior getLoginBehavior()
		{
			return loginBehavior;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field LoginBehavior loginBehavior>
		//    2    4:areturn         
		}

		List getPermissions()
		{
			return permissions;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field List permissions>
		//    2    4:areturn         
		}

		public void setDefaultAudience(DefaultAudience defaultaudience)
		{
			defaultAudience = defaultaudience;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field DefaultAudience defaultAudience>
		//    3    5:return          
		}

		public void setLoginBehavior(LoginBehavior loginbehavior)
		{
			loginBehavior = loginbehavior;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #44  <Field LoginBehavior loginBehavior>
		//    3    5:return          
		}

		public void setPublishPermissions(List list)
		{
			if(LoginAuthorizationType.READ.equals(((Object) (authorizationType))))
		//*   0    0:getstatic       #68  <Field LoginAuthorizationType LoginAuthorizationType.READ>
		//*   1    3:aload_0         
		//*   2    4:getfield        #37  <Field LoginAuthorizationType authorizationType>
		//*   3    7:invokevirtual   #72  <Method boolean LoginAuthorizationType.equals(Object)>
		//*   4   10:ifeq            23
				throw new UnsupportedOperationException("Cannot call setPublishPermissions after setReadPermissions has been called.");
		//    5   13:new             #74  <Class UnsupportedOperationException>
		//    6   16:dup             
		//    7   17:ldc1            #76  <String "Cannot call setPublishPermissions after setReadPermissions has been called.">
		//    8   19:invokespecial   #79  <Method void UnsupportedOperationException(String)>
		//    9   22:athrow          
			if(Utility.isNullOrEmpty(((java.util.Collection) (list))))
		//*  10   23:aload_1         
		//*  11   24:invokestatic    #85  <Method boolean Utility.isNullOrEmpty(java.util.Collection)>
		//*  12   27:ifeq            40
			{
				throw new IllegalArgumentException("Permissions for publish actions cannot be null or empty.");
		//   13   30:new             #87  <Class IllegalArgumentException>
		//   14   33:dup             
		//   15   34:ldc1            #89  <String "Permissions for publish actions cannot be null or empty.">
		//   16   36:invokespecial   #90  <Method void IllegalArgumentException(String)>
		//   17   39:athrow          
			} else
			{
				permissions = list;
		//   18   40:aload_0         
		//   19   41:aload_1         
		//   20   42:putfield        #35  <Field List permissions>
				authorizationType = LoginAuthorizationType.PUBLISH;
		//   21   45:aload_0         
		//   22   46:getstatic       #93  <Field LoginAuthorizationType LoginAuthorizationType.PUBLISH>
		//   23   49:putfield        #37  <Field LoginAuthorizationType authorizationType>
				return;
		//   24   52:return          
			}
		}

		public void setReadPermissions(List list)
		{
			if(LoginAuthorizationType.PUBLISH.equals(((Object) (authorizationType))))
		//*   0    0:getstatic       #93  <Field LoginAuthorizationType LoginAuthorizationType.PUBLISH>
		//*   1    3:aload_0         
		//*   2    4:getfield        #37  <Field LoginAuthorizationType authorizationType>
		//*   3    7:invokevirtual   #72  <Method boolean LoginAuthorizationType.equals(Object)>
		//*   4   10:ifeq            23
			{
				throw new UnsupportedOperationException("Cannot call setReadPermissions after setPublishPermissions has been called.");
		//    5   13:new             #74  <Class UnsupportedOperationException>
		//    6   16:dup             
		//    7   17:ldc1            #97  <String "Cannot call setReadPermissions after setPublishPermissions has been called.">
		//    8   19:invokespecial   #79  <Method void UnsupportedOperationException(String)>
		//    9   22:athrow          
			} else
			{
				permissions = list;
		//   10   23:aload_0         
		//   11   24:aload_1         
		//   12   25:putfield        #35  <Field List permissions>
				authorizationType = LoginAuthorizationType.READ;
		//   13   28:aload_0         
		//   14   29:getstatic       #68  <Field LoginAuthorizationType LoginAuthorizationType.READ>
		//   15   32:putfield        #37  <Field LoginAuthorizationType authorizationType>
				return;
		//   16   35:return          
			}
		}

		private LoginAuthorizationType authorizationType;
		private DefaultAudience defaultAudience;
		private LoginBehavior loginBehavior;
		private List permissions;


/*
		static LoginAuthorizationType access$700(LoginButtonProperties loginbuttonproperties)
		{
			return loginbuttonproperties.authorizationType;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field LoginAuthorizationType authorizationType>
		//    2    4:areturn         
		}

*/


/*
		static List access$800(LoginButtonProperties loginbuttonproperties)
		{
			return loginbuttonproperties.permissions;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field List permissions>
		//    2    4:areturn         
		}

*/

		LoginButtonProperties()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			defaultAudience = DefaultAudience.FRIENDS;
		//    2    4:aload_0         
		//    3    5:getstatic       #25  <Field DefaultAudience DefaultAudience.FRIENDS>
		//    4    8:putfield        #27  <Field DefaultAudience defaultAudience>
			permissions = Collections.emptyList();
		//    5   11:aload_0         
		//    6   12:invokestatic    #33  <Method List Collections.emptyList()>
		//    7   15:putfield        #35  <Field List permissions>
			authorizationType = null;
		//    8   18:aload_0         
		//    9   19:aconst_null     
		//   10   20:putfield        #37  <Field LoginAuthorizationType authorizationType>
			loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
		//   11   23:aload_0         
		//   12   24:getstatic       #42  <Field LoginBehavior LoginBehavior.NATIVE_WITH_FALLBACK>
		//   13   27:putfield        #44  <Field LoginBehavior loginBehavior>
		//   14   30:return          
		}
	}

	private class LoginClickListener
		implements android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
			callExternalOnClickListener(view);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field LoginButton this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #30  <Method void LoginButton.access$400(LoginButton, View)>
			Object obj = ((Object) (getContext()));
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field LoginButton this$0>
		//    6   12:invokevirtual   #34  <Method Context LoginButton.getContext()>
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
				if(confirmLogout)
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
					obj = ((Object) (new android.app.AlertDialog.Builder(((Context) (obj)))));
		//   58  127:new             #87  <Class android.app.AlertDialog$Builder>
		//   59  130:dup             
		//   60  131:aload           6
		//   61  133:invokespecial   #90  <Method void android.app.AlertDialog$Builder(Context)>
		//   62  136:astore          6
					((android.app.AlertDialog.Builder) (obj)).setMessage(((CharSequence) (view))).setCancelable(true).setPositiveButton(((CharSequence) (s)), new android.content.DialogInterface.OnClickListener() {

						public void onClick(DialogInterface dialoginterface, int i)
						{
							getLoginManager().logOut();
						//    0    0:aload_0         
						//    1    1:getfield        #20  <Field LoginButton$LoginClickListener this$1>
						//    2    4:getfield        #29  <Field LoginButton LoginButton$LoginClickListener.this$0>
						//    3    7:invokevirtual   #33  <Method LoginManager LoginButton.getLoginManager()>
						//    4   10:invokevirtual   #38  <Method void LoginManager.logOut()>
						//    5   13:return          
						}

						final LoginClickListener this$1;

			
			{
				this$1 = LoginClickListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field LoginButton$LoginClickListener this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
					}
).setNegativeButton(((CharSequence) (s1)), ((android.content.DialogInterface.OnClickListener) (null)));
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
		//   94  205:invokevirtual   #130 <Method DefaultAudience LoginButton.getDefaultAudience()>
		//   95  208:invokevirtual   #134 <Method LoginManager LoginManager.setDefaultAudience(DefaultAudience)>
		//   96  211:pop             
				((LoginManager) (view)).setLoginBehavior(getLoginBehavior());
		//   97  212:aload_1         
		//   98  213:aload_0         
		//   99  214:getfield        #17  <Field LoginButton this$0>
		//  100  217:invokevirtual   #138 <Method LoginBehavior LoginButton.getLoginBehavior()>
		//  101  220:invokevirtual   #142 <Method LoginManager LoginManager.setLoginBehavior(LoginBehavior)>
		//  102  223:pop             
				if(LoginAuthorizationType.PUBLISH.equals(((Object) (properties.authorizationType))))
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
						((LoginManager) (view)).logInWithPublishPermissions(getFragment(), ((java.util.Collection) (properties.permissions)));
		//  114  253:aload_1         
		//  115  254:aload_0         
		//  116  255:getfield        #17  <Field LoginButton this$0>
		//  117  258:invokevirtual   #166 <Method android.support.v4.app.Fragment LoginButton.getFragment()>
		//  118  261:aload_0         
		//  119  262:getfield        #17  <Field LoginButton this$0>
		//  120  265:invokestatic    #152 <Method LoginButton$LoginButtonProperties LoginButton.access$600(LoginButton)>
		//  121  268:invokestatic    #170 <Method List LoginButton$LoginButtonProperties.access$800(LoginButton$LoginButtonProperties)>
		//  122  271:invokevirtual   #174 <Method void LoginManager.logInWithPublishPermissions(android.support.v4.app.Fragment, java.util.Collection)>
					else
		//* 123  274:goto            356
						((LoginManager) (view)).logInWithPublishPermissions(getActivity(), ((java.util.Collection) (properties.permissions)));
		//  124  277:aload_1         
		//  125  278:aload_0         
		//  126  279:getfield        #17  <Field LoginButton this$0>
		//  127  282:invokestatic    #178 <Method Activity LoginButton.access$900(LoginButton)>
		//  128  285:aload_0         
		//  129  286:getfield        #17  <Field LoginButton this$0>
		//  130  289:invokestatic    #152 <Method LoginButton$LoginButtonProperties LoginButton.access$600(LoginButton)>
		//  131  292:invokestatic    #170 <Method List LoginButton$LoginButtonProperties.access$800(LoginButton$LoginButtonProperties)>
		//  132  295:invokevirtual   #181 <Method void LoginManager.logInWithPublishPermissions(Activity, java.util.Collection)>
				} else
		//* 133  298:goto            356
				if(getFragment() != null)
		//* 134  301:aload_0         
		//* 135  302:getfield        #17  <Field LoginButton this$0>
		//* 136  305:invokevirtual   #166 <Method android.support.v4.app.Fragment LoginButton.getFragment()>
		//* 137  308:ifnull          335
					((LoginManager) (view)).logInWithReadPermissions(getFragment(), ((java.util.Collection) (properties.permissions)));
		//  138  311:aload_1         
		//  139  312:aload_0         
		//  140  313:getfield        #17  <Field LoginButton this$0>
		//  141  316:invokevirtual   #166 <Method android.support.v4.app.Fragment LoginButton.getFragment()>
		//  142  319:aload_0         
		//  143  320:getfield        #17  <Field LoginButton this$0>
		//  144  323:invokestatic    #152 <Method LoginButton$LoginButtonProperties LoginButton.access$600(LoginButton)>
		//  145  326:invokestatic    #170 <Method List LoginButton$LoginButtonProperties.access$800(LoginButton$LoginButtonProperties)>
		//  146  329:invokevirtual   #184 <Method void LoginManager.logInWithReadPermissions(android.support.v4.app.Fragment, java.util.Collection)>
				else
		//* 147  332:goto            356
					((LoginManager) (view)).logInWithReadPermissions(getActivity(), ((java.util.Collection) (properties.permissions)));
		//  148  335:aload_1         
		//  149  336:aload_0         
		//  150  337:getfield        #17  <Field LoginButton this$0>
		//  151  340:invokestatic    #187 <Method Activity LoginButton.access$1000(LoginButton)>
		//  152  343:aload_0         
		//  153  344:getfield        #17  <Field LoginButton this$0>
		//  154  347:invokestatic    #152 <Method LoginButton$LoginButtonProperties LoginButton.access$600(LoginButton)>
		//  155  350:invokestatic    #170 <Method List LoginButton$LoginButtonProperties.access$800(LoginButton$LoginButtonProperties)>
		//  156  353:invokevirtual   #189 <Method void LoginManager.logInWithReadPermissions(Activity, java.util.Collection)>
			}
			view = ((View) (AppEventsLogger.newLogger(getContext())));
		//  157  356:aload_0         
		//  158  357:getfield        #17  <Field LoginButton this$0>
		//  159  360:invokevirtual   #34  <Method Context LoginButton.getContext()>
		//  160  363:invokestatic    #195 <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
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
			((AppEventsLogger) (view)).logSdkEvent(loginLogoutEventName, ((Double) (null)), bundle);
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

		private LoginClickListener()
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
			int j = 0;
		//    2    4:iconst_0        
		//    3    5:istore_1        
			for(int k = atooltipmode.length; j < k; j++)
		//*   4    6:aload_3         
		//*   5    7:arraylength     
		//*   6    8:istore_2        
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
			$VALUES = (new ToolTipMode[] {
				AUTOMATIC, DISPLAY_ALWAYS, NEVER_DISPLAY
			});
		//   24   48:iconst_3        
		//   25   49:anewarray       ToolTipMode[]
		//   26   52:dup             
		//   27   53:iconst_0        
		//   28   54:getstatic       #30  <Field LoginButton$ToolTipMode AUTOMATIC>
		//   29   57:aastore         
		//   30   58:dup             
		//   31   59:iconst_1        
		//   32   60:getstatic       #35  <Field LoginButton$ToolTipMode DISPLAY_ALWAYS>
		//   33   63:aastore         
		//   34   64:dup             
		//   35   65:iconst_2        
		//   36   66:getstatic       #40  <Field LoginButton$ToolTipMode NEVER_DISPLAY>
		//   37   69:aastore         
		//   38   70:putstatic       #42  <Field LoginButton$ToolTipMode[] $VALUES>
			DEFAULT = AUTOMATIC;
		//   39   73:getstatic       #30  <Field LoginButton$ToolTipMode AUTOMATIC>
		//   40   76:putstatic       #44  <Field LoginButton$ToolTipMode DEFAULT>
		//*  41   79:return          
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
			displayToolTip(getResources().getString(com.facebook.R.string.com_facebook_tooltip_default));
	//    7   33:aload_0         
	//    8   34:aload_0         
	//    9   35:invokevirtual   #128 <Method Resources getResources()>
	//   10   38:getstatic       #134 <Field int com.facebook.R$string.com_facebook_tooltip_default>
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
					com.facebook.internal.Utility.FetchedAppSettings fetchedappsettings = Utility.queryAppSettings(appId, false);
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field String val$appId>
				//    2    4:iconst_0        
				//    3    5:invokestatic    #33  <Method com.facebook.internal.Utility$FetchedAppSettings Utility.queryAppSettings(String, boolean)>
				//    4    8:astore_1        
					getActivity().runOnUiThread(((_cls1) (fetchedappsettings)). new Runnable() {

						public void run()
						{
							showToolTipPerSettings(settings);
						//    0    0:aload_0         
						//    1    1:getfield        #19  <Field LoginButton$1 this$1>
						//    2    4:getfield        #28  <Field LoginButton LoginButton$1.this$0>
						//    3    7:aload_0         
						//    4    8:getfield        #21  <Field com.facebook.internal.Utility$FetchedAppSettings val$settings>
						//    5   11:invokestatic    #34  <Method void LoginButton.access$000(LoginButton, com.facebook.internal.Utility$FetchedAppSettings)>
						//    6   14:return          
						}

						final _cls1 this$1;
						final com.facebook.internal.Utility.FetchedAppSettings val$settings;

			
			{
				this$1 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LoginButton$1 this$1>
				settings = com.facebook.internal.Utility.FetchedAppSettings.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field com.facebook.internal.Utility$FetchedAppSettings val$settings>
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
				//   12   22:invokespecial   #40  <Method void LoginButton$1$1(LoginButton$1, com.facebook.internal.Utility$FetchedAppSettings)>
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
		context = ((Context) (context.getTheme().obtainStyledAttributes(attributeset, com.facebook.R.styleable.com_facebook_login_view, i, j)));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #212 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    5   11:aload_2         
	//    6   12:getstatic       #217 <Field int[] com.facebook.R$styleable.com_facebook_login_view>
	//    7   15:iload_3         
	//    8   16:iload           4
	//    9   18:invokevirtual   #223 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   10   21:astore_1        
		confirmLogout = ((TypedArray) (context)).getBoolean(com.facebook.R.styleable.com_facebook_login_view_com_facebook_confirm_logout, true);
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:getstatic       #226 <Field int com.facebook.R$styleable.com_facebook_login_view_com_facebook_confirm_logout>
	//   14   27:iconst_1        
	//   15   28:invokevirtual   #232 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   16   31:putfield        #110 <Field boolean confirmLogout>
		loginText = ((TypedArray) (context)).getString(com.facebook.R.styleable.com_facebook_login_view_com_facebook_login_text);
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:getstatic       #235 <Field int com.facebook.R$styleable.com_facebook_login_view_com_facebook_login_text>
	//   20   39:invokevirtual   #236 <Method String TypedArray.getString(int)>
	//   21   42:putfield        #238 <Field String loginText>
		logoutText = ((TypedArray) (context)).getString(com.facebook.R.styleable.com_facebook_login_view_com_facebook_logout_text);
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:getstatic       #241 <Field int com.facebook.R$styleable.com_facebook_login_view_com_facebook_logout_text>
	//   25   50:invokevirtual   #236 <Method String TypedArray.getString(int)>
	//   26   53:putfield        #243 <Field String logoutText>
		toolTipMode = ToolTipMode.fromInt(((TypedArray) (context)).getInt(com.facebook.R.styleable.com_facebook_login_view_com_facebook_tooltip_mode, ToolTipMode.DEFAULT.getValue()));
	//   27   56:aload_0         
	//   28   57:aload_1         
	//   29   58:getstatic       #246 <Field int com.facebook.R$styleable.com_facebook_login_view_com_facebook_tooltip_mode>
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
		if(!isInEditMode() && AccessToken.getCurrentAccessToken() != null)
	//*   3    6:aload_0         
	//*   4    7:invokevirtual   #264 <Method boolean isInEditMode()>
	//*   5   10:ifne            49
	//*   6   13:invokestatic    #270 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//*   7   16:ifnull          49
		{
			String s;
			if(logoutText != null)
	//*   8   19:aload_0         
	//*   9   20:getfield        #243 <Field String logoutText>
	//*  10   23:ifnull          34
				s = logoutText;
	//   11   26:aload_0         
	//   12   27:getfield        #243 <Field String logoutText>
	//   13   30:astore_2        
			else
	//*  14   31:goto            43
				s = resources.getString(com.facebook.R.string.com_facebook_loginview_log_out_button);
	//   15   34:aload           4
	//   16   36:getstatic       #273 <Field int com.facebook.R$string.com_facebook_loginview_log_out_button>
	//   17   39:invokevirtual   #140 <Method String Resources.getString(int)>
	//   18   42:astore_2        
			setText(((CharSequence) (s)));
	//   19   43:aload_0         
	//   20   44:aload_2         
	//   21   45:invokevirtual   #277 <Method void setText(CharSequence)>
			return;
	//   22   48:return          
		}
		if(loginText != null)
	//*  23   49:aload_0         
	//*  24   50:getfield        #238 <Field String loginText>
	//*  25   53:ifnull          65
		{
			setText(((CharSequence) (loginText)));
	//   26   56:aload_0         
	//   27   57:aload_0         
	//   28   58:getfield        #238 <Field String loginText>
	//   29   61:invokevirtual   #277 <Method void setText(CharSequence)>
			return;
	//   30   64:return          
		}
		String s2 = resources.getString(com.facebook.R.string.com_facebook_loginview_log_in_button_long);
	//   31   65:aload           4
	//   32   67:getstatic       #280 <Field int com.facebook.R$string.com_facebook_loginview_log_in_button_long>
	//   33   70:invokevirtual   #140 <Method String Resources.getString(int)>
	//   34   73:astore_3        
		int i = getWidth();
	//   35   74:aload_0         
	//   36   75:invokevirtual   #283 <Method int getWidth()>
	//   37   78:istore_1        
		String s1 = s2;
	//   38   79:aload_3         
	//   39   80:astore_2        
		if(i != 0)
	//*  40   81:iload_1         
	//*  41   82:ifeq            105
		{
			s1 = s2;
	//   42   85:aload_3         
	//   43   86:astore_2        
			if(measureButtonWidth(s2) > i)
	//*  44   87:aload_0         
	//*  45   88:aload_3         
	//*  46   89:invokespecial   #285 <Method int measureButtonWidth(String)>
	//*  47   92:iload_1         
	//*  48   93:icmple          105
				s1 = resources.getString(com.facebook.R.string.com_facebook_loginview_log_in_button);
	//   49   96:aload           4
	//   50   98:getstatic       #288 <Field int com.facebook.R$string.com_facebook_loginview_log_in_button>
	//   51  101:invokevirtual   #140 <Method String Resources.getString(int)>
	//   52  104:astore_2        
		}
		setText(((CharSequence) (s1)));
	//   53  105:aload_0         
	//   54  106:aload_2         
	//   55  107:invokevirtual   #277 <Method void setText(CharSequence)>
	//   56  110:return          
	}

	private void showToolTipPerSettings(com.facebook.internal.Utility.FetchedAppSettings fetchedappsettings)
	{
		if(fetchedappsettings != null && fetchedappsettings.getNuxEnabled() && getVisibility() == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          26
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #293 <Method boolean com.facebook.internal.Utility$FetchedAppSettings.getNuxEnabled()>
	//*   4    8:ifeq            26
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #296 <Method int getVisibility()>
	//*   7   15:ifne            26
			displayToolTip(fetchedappsettings.getNuxContent());
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #300 <Method String com.facebook.internal.Utility$FetchedAppSettings.getNuxContent()>
	//   11   23:invokespecial   #144 <Method void displayToolTip(String)>
	//   12   26:return          
	}

	public void clearPermissions()
	{
		properties.clearPermissions();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:invokevirtual   #303 <Method void LoginButton$LoginButtonProperties.clearPermissions()>
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
	//    5    6:invokespecial   #306 <Method void FacebookButtonBase.configureButton(Context, AttributeSet, int, int)>
		setInternalOnClickListener(((android.view.View.OnClickListener) (new LoginClickListener())));
	//    6    9:aload_0         
	//    7   10:new             #17  <Class LoginButton$LoginClickListener>
	//    8   13:dup             
	//    9   14:aload_0         
	//   10   15:aconst_null     
	//   11   16:invokespecial   #309 <Method void LoginButton$LoginClickListener(LoginButton, LoginButton$1)>
	//   12   19:invokevirtual   #313 <Method void setInternalOnClickListener(android.view.View$OnClickListener)>
		parseLoginButtonAttributes(context, attributeset, i, j);
	//   13   22:aload_0         
	//   14   23:aload_1         
	//   15   24:aload_2         
	//   16   25:iload_3         
	//   17   26:iload           4
	//   18   28:invokespecial   #315 <Method void parseLoginButtonAttributes(Context, AttributeSet, int, int)>
		if(isInEditMode())
	//*  19   31:aload_0         
	//*  20   32:invokevirtual   #264 <Method boolean isInEditMode()>
	//*  21   35:ifeq            62
		{
			setBackgroundColor(getResources().getColor(com.facebook.R.color.com_facebook_blue));
	//   22   38:aload_0         
	//   23   39:aload_0         
	//   24   40:invokevirtual   #128 <Method Resources getResources()>
	//   25   43:getstatic       #320 <Field int com.facebook.R$color.com_facebook_blue>
	//   26   46:invokevirtual   #324 <Method int Resources.getColor(int)>
	//   27   49:invokevirtual   #328 <Method void setBackgroundColor(int)>
			loginText = "Log in with Facebook";
	//   28   52:aload_0         
	//   29   53:ldc2            #330 <String "Log in with Facebook">
	//   30   56:putfield        #238 <Field String loginText>
		} else
	//*  31   59:goto            74
		{
			accessTokenTracker = ((AccessTokenTracker) (new AccessTokenTracker() {

				protected void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1)
				{
					setButtonText();
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field LoginButton this$0>
				//    2    4:invokestatic    #24  <Method void LoginButton.access$300(LoginButton)>
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
	//   32   62:aload_0         
	//   33   63:new             #10  <Class LoginButton$2>
	//   34   66:dup             
	//   35   67:aload_0         
	//   36   68:invokespecial   #332 <Method void LoginButton$2(LoginButton)>
	//   37   71:putfield        #334 <Field AccessTokenTracker accessTokenTracker>
		}
		setButtonText();
	//   38   74:aload_0         
	//   39   75:invokespecial   #100 <Method void setButtonText()>
	//   40   78:return          
	}

	public void dismissToolTip()
	{
		if(toolTipPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #176 <Field ToolTipPopup toolTipPopup>
	//*   2    4:ifnull          19
		{
			toolTipPopup.dismiss();
	//    3    7:aload_0         
	//    4    8:getfield        #176 <Field ToolTipPopup toolTipPopup>
	//    5   11:invokevirtual   #338 <Method void ToolTipPopup.dismiss()>
			toolTipPopup = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #176 <Field ToolTipPopup toolTipPopup>
		}
	//    9   19:return          
	}

	public DefaultAudience getDefaultAudience()
	{
		return properties.getDefaultAudience();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:invokevirtual   #342 <Method DefaultAudience LoginButton$LoginButtonProperties.getDefaultAudience()>
	//    3    7:areturn         
	}

	protected int getDefaultRequestCode()
	{
		return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
	//    0    0:getstatic       #349 <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Login>
	//    1    3:invokevirtual   #352 <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:ireturn         
	}

	protected int getDefaultStyleResource()
	{
		return com.facebook.R.style.com_facebook_loginview_default_style;
	//    0    0:getstatic       #358 <Field int com.facebook.R$style.com_facebook_loginview_default_style>
	//    1    3:ireturn         
	}

	public LoginBehavior getLoginBehavior()
	{
		return properties.getLoginBehavior();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:invokevirtual   #362 <Method LoginBehavior LoginButton$LoginButtonProperties.getLoginBehavior()>
	//    3    7:areturn         
	}

	LoginManager getLoginManager()
	{
		if(loginManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #366 <Field LoginManager loginManager>
	//*   2    4:ifnonnull       14
			loginManager = LoginManager.getInstance();
	//    3    7:aload_0         
	//    4    8:invokestatic    #371 <Method LoginManager LoginManager.getInstance()>
	//    5   11:putfield        #366 <Field LoginManager loginManager>
		return loginManager;
	//    6   14:aload_0         
	//    7   15:getfield        #366 <Field LoginManager loginManager>
	//    8   18:areturn         
	}

	List getPermissions()
	{
		return properties.getPermissions();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:invokevirtual   #375 <Method List LoginButton$LoginButtonProperties.getPermissions()>
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
	//    1    1:invokespecial   #384 <Method void FacebookButtonBase.onAttachedToWindow()>
		if(accessTokenTracker != null && !accessTokenTracker.isTracking())
	//*   2    4:aload_0         
	//*   3    5:getfield        #334 <Field AccessTokenTracker accessTokenTracker>
	//*   4    8:ifnull          32
	//*   5   11:aload_0         
	//*   6   12:getfield        #334 <Field AccessTokenTracker accessTokenTracker>
	//*   7   15:invokevirtual   #389 <Method boolean AccessTokenTracker.isTracking()>
	//*   8   18:ifne            32
		{
			accessTokenTracker.startTracking();
	//    9   21:aload_0         
	//   10   22:getfield        #334 <Field AccessTokenTracker accessTokenTracker>
	//   11   25:invokevirtual   #392 <Method void AccessTokenTracker.startTracking()>
			setButtonText();
	//   12   28:aload_0         
	//   13   29:invokespecial   #100 <Method void setButtonText()>
		}
	//   14   32:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #395 <Method void FacebookButtonBase.onDetachedFromWindow()>
		if(accessTokenTracker != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #334 <Field AccessTokenTracker accessTokenTracker>
	//*   4    8:ifnull          18
			accessTokenTracker.stopTracking();
	//    5   11:aload_0         
	//    6   12:getfield        #334 <Field AccessTokenTracker accessTokenTracker>
	//    7   15:invokevirtual   #398 <Method void AccessTokenTracker.stopTracking()>
		dismissToolTip();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #400 <Method void dismissToolTip()>
	//   10   22:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #404 <Method void FacebookButtonBase.onDraw(Canvas)>
		if(!toolTipChecked && !isInEditMode())
	//*   3    5:aload_0         
	//*   4    6:getfield        #406 <Field boolean toolTipChecked>
	//*   5    9:ifne            28
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #264 <Method boolean isInEditMode()>
	//*   8   16:ifne            28
		{
			toolTipChecked = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #406 <Field boolean toolTipChecked>
			checkToolTipSettings();
	//   12   24:aload_0         
	//   13   25:invokespecial   #408 <Method void checkToolTipSettings()>
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
	//    6    8:invokespecial   #412 <Method void FacebookButtonBase.onLayout(boolean, int, int, int, int)>
		setButtonText();
	//    7   11:aload_0         
	//    8   12:invokespecial   #100 <Method void setButtonText()>
	//    9   15:return          
	}

	protected void onMeasure(int i, int j)
	{
		Object obj = ((Object) (getPaint().getFontMetrics()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #418 <Method TextPaint getPaint()>
	//    2    4:invokevirtual   #424 <Method android.graphics.Paint$FontMetrics TextPaint.getFontMetrics()>
	//    3    7:astore          6
		j = getCompoundPaddingTop();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #427 <Method int getCompoundPaddingTop()>
	//    6   13:istore_2        
		int k = (int)Math.ceil(Math.abs(((android.graphics.Paint.FontMetrics) (obj)).top) + Math.abs(((android.graphics.Paint.FontMetrics) (obj)).bottom));
	//    7   14:aload           6
	//    8   16:getfield        #433 <Field float android.graphics.Paint$FontMetrics.top>
	//    9   19:invokestatic    #439 <Method float Math.abs(float)>
	//   10   22:aload           6
	//   11   24:getfield        #442 <Field float android.graphics.Paint$FontMetrics.bottom>
	//   12   27:invokestatic    #439 <Method float Math.abs(float)>
	//   13   30:fadd            
	//   14   31:f2d             
	//   15   32:invokestatic    #446 <Method double Math.ceil(double)>
	//   16   35:d2i             
	//   17   36:istore_3        
		int l = getCompoundPaddingBottom();
	//   18   37:aload_0         
	//   19   38:invokevirtual   #449 <Method int getCompoundPaddingBottom()>
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
			obj = ((Object) (resources.getString(com.facebook.R.string.com_facebook_loginview_log_in_button_long)));
	//   31   64:aload           8
	//   32   66:getstatic       #280 <Field int com.facebook.R$string.com_facebook_loginview_log_in_button_long>
	//   33   69:invokevirtual   #140 <Method String Resources.getString(int)>
	//   34   72:astore          6
			int i1 = measureButtonWidth(((String) (obj)));
	//   35   74:aload_0         
	//   36   75:aload           6
	//   37   77:invokespecial   #285 <Method int measureButtonWidth(String)>
	//   38   80:istore          5
			if(resolveSize(i1, i) < i1)
	//*  39   82:iload           5
	//*  40   84:iload_1         
	//*  41   85:invokestatic    #452 <Method int resolveSize(int, int)>
	//*  42   88:iload           5
	//*  43   90:icmpge          103
				obj = ((Object) (resources.getString(com.facebook.R.string.com_facebook_loginview_log_in_button)));
	//   44   93:aload           8
	//   45   95:getstatic       #288 <Field int com.facebook.R$string.com_facebook_loginview_log_in_button>
	//   46   98:invokevirtual   #140 <Method String Resources.getString(int)>
	//   47  101:astore          6
		}
		int j1 = measureButtonWidth(((String) (obj)));
	//   48  103:aload_0         
	//   49  104:aload           6
	//   50  106:invokespecial   #285 <Method int measureButtonWidth(String)>
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
			obj = ((Object) (resources.getString(com.facebook.R.string.com_facebook_loginview_log_out_button)));
	//   59  126:aload           8
	//   60  128:getstatic       #273 <Field int com.facebook.R$string.com_facebook_loginview_log_out_button>
	//   61  131:invokevirtual   #140 <Method String Resources.getString(int)>
	//   62  134:astore          6
		setMeasuredDimension(resolveSize(Math.max(j1, measureButtonWidth(((String) (obj)))), i), j + k + l);
	//   63  136:aload_0         
	//   64  137:iload           5
	//   65  139:aload_0         
	//   66  140:aload           6
	//   67  142:invokespecial   #285 <Method int measureButtonWidth(String)>
	//   68  145:invokestatic    #455 <Method int Math.max(int, int)>
	//   69  148:iload_1         
	//   70  149:invokestatic    #452 <Method int resolveSize(int, int)>
	//   71  152:iload_2         
	//   72  153:iload_3         
	//   73  154:iadd            
	//   74  155:iload           4
	//   75  157:iadd            
	//   76  158:invokevirtual   #458 <Method void setMeasuredDimension(int, int)>
	//   77  161:return          
	}

	protected void onVisibilityChanged(View view, int i)
	{
		super.onVisibilityChanged(view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #462 <Method void FacebookButtonBase.onVisibilityChanged(View, int)>
		if(i != 0)
	//*   4    6:iload_2         
	//*   5    7:ifeq            14
			dismissToolTip();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #400 <Method void dismissToolTip()>
	//    8   14:return          
	}

	public void registerCallback(CallbackManager callbackmanager, FacebookCallback facebookcallback)
	{
		getLoginManager().registerCallback(callbackmanager, facebookcallback);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #466 <Method LoginManager getLoginManager()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #468 <Method void LoginManager.registerCallback(CallbackManager, FacebookCallback)>
	//    5    9:return          
	}

	public void setDefaultAudience(DefaultAudience defaultaudience)
	{
		properties.setDefaultAudience(defaultaudience);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #473 <Method void LoginButton$LoginButtonProperties.setDefaultAudience(DefaultAudience)>
	//    4    8:return          
	}

	public void setLoginBehavior(LoginBehavior loginbehavior)
	{
		properties.setLoginBehavior(loginbehavior);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #477 <Method void LoginButton$LoginButtonProperties.setLoginBehavior(LoginBehavior)>
	//    4    8:return          
	}

	void setLoginManager(LoginManager loginmanager)
	{
		loginManager = loginmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #366 <Field LoginManager loginManager>
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
	//    3    5:invokevirtual   #485 <Method void LoginButton$LoginButtonProperties.setPublishPermissions(List)>
	//    4    8:return          
	}

	public transient void setPublishPermissions(String as[])
	{
		properties.setPublishPermissions(Arrays.asList(((Object []) (as))));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:aload_1         
	//    3    5:invokestatic    #493 <Method List Arrays.asList(Object[])>
	//    4    8:invokevirtual   #485 <Method void LoginButton$LoginButtonProperties.setPublishPermissions(List)>
	//    5   11:return          
	}

	public void setReadPermissions(List list)
	{
		properties.setReadPermissions(list);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #496 <Method void LoginButton$LoginButtonProperties.setReadPermissions(List)>
	//    4    8:return          
	}

	public transient void setReadPermissions(String as[])
	{
		properties.setReadPermissions(Arrays.asList(((Object []) (as))));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
	//    2    4:aload_1         
	//    3    5:invokestatic    #493 <Method List Arrays.asList(Object[])>
	//    4    8:invokevirtual   #496 <Method void LoginButton$LoginButtonProperties.setReadPermissions(List)>
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
	static void access$000(LoginButton loginbutton, com.facebook.internal.Utility.FetchedAppSettings fetchedappsettings)
	{
		loginbutton.showToolTipPerSettings(fetchedappsettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #86  <Method void showToolTipPerSettings(com.facebook.internal.Utility$FetchedAppSettings)>
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
	static Activity access$1000(LoginButton loginbutton)
	{
		return loginbutton.getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method Activity getActivity()>
	//    2    4:areturn         
	}

*/


/*
	static String access$1100(LoginButton loginbutton)
	{
		return loginbutton.loginLogoutEventName;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field String loginLogoutEventName>
	//    2    4:areturn         
	}

*/


/*
	static void access$300(LoginButton loginbutton)
	{
		loginbutton.setButtonText();
	//    0    0:aload_0         
	//    1    1:invokespecial   #100 <Method void setButtonText()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$400(LoginButton loginbutton, View view)
	{
		loginbutton.callExternalOnClickListener(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #106 <Method void callExternalOnClickListener(View)>
		return;
	//    3    5:return          
	}

*/


/*
	static boolean access$500(LoginButton loginbutton)
	{
		return loginbutton.confirmLogout;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field boolean confirmLogout>
	//    2    4:ireturn         
	}

*/


/*
	static LoginButtonProperties access$600(LoginButton loginbutton)
	{
		return loginbutton.properties;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field LoginButton$LoginButtonProperties properties>
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
