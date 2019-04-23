// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.*;
import com.paypal.android.sdk.*;
import java.util.*;

// Referenced classes of package com.paypal.android.sdk.payments:
//			r, bg, PayPalService, bi, 
//			cd, g, aa, o, 
//			n, m, ah, dd, 
//			p, PayPalConfiguration, l, y, 
//			ab, ac, ad, ae, 
//			af, ag, x, w, 
//			v, u, t, z

public final class LoginActivity extends Activity
{

	public LoginActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Activity()>
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class LoginActivity>
	//    4    7:invokevirtual   #41  <Method String Class.getSimpleName()>
	//    5   10:putfield        #43  <Field String a>
	//    6   13:aload_0         
	//    7   14:new             #45  <Class r>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #48  <Method void r(LoginActivity)>
	//   11   22:putfield        #50  <Field ServiceConnection s>
	//   12   25:return          
	}

	static int a(LoginActivity loginactivity, int i1)
	{
		loginactivity.o = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #54  <Field int o>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private ep a(bg bg1)
	{
		g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void g()>
		if(bg1 == bg.b)
	//*   2    4:aload_1         
	//*   3    5:getstatic       #61  <Field bg bg.b>
	//*   4    8:if_acmpne       74
		{
			bg1 = ((bg) (ci.a()));
	//    5   11:invokestatic    #66  <Method ci ci.a()>
	//    6   14:astore_1        
			String s1 = f;
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field String f>
	//    9   19:astore_2        
			if(s1 == null)
	//*  10   20:aload_2         
	//*  11   21:ifnonnull       40
				bg1 = ((bg) (new ev(((com.paypal.android.sdk.ds) (bg1)), e)));
	//   12   24:new             #70  <Class ev>
	//   13   27:dup             
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #72  <Field String e>
	//   17   33:invokespecial   #75  <Method void ev(com.paypal.android.sdk.ds, String)>
	//   18   36:astore_1        
			else
	//*  19   37:goto            61
				bg1 = ((bg) (new ev(((com.paypal.android.sdk.ds) (bg1)), new ei(s1), e)));
	//   20   40:new             #70  <Class ev>
	//   21   43:dup             
	//   22   44:aload_1         
	//   23   45:new             #77  <Class ei>
	//   24   48:dup             
	//   25   49:aload_2         
	//   26   50:invokespecial   #80  <Method void ei(String)>
	//   27   53:aload_0         
	//   28   54:getfield        #72  <Field String e>
	//   29   57:invokespecial   #83  <Method void ev(com.paypal.android.sdk.ds, ei, String)>
	//   30   60:astore_1        
			return new ep(((ev) (bg1)), g);
	//   31   61:new             #85  <Class ep>
	//   32   64:dup             
	//   33   65:aload_1         
	//   34   66:aload_0         
	//   35   67:getfield        #87  <Field String g>
	//   36   70:invokespecial   #90  <Method void ep(ev, String)>
	//   37   73:areturn         
		}
		if(bg1 == bg.a)
	//*  38   74:aload_1         
	//*  39   75:getstatic       #92  <Field bg bg.a>
	//*  40   78:if_acmpne       97
			return new ep(c, d);
	//   41   81:new             #85  <Class ep>
	//   42   84:dup             
	//   43   85:aload_0         
	//   44   86:getfield        #94  <Field String c>
	//   45   89:aload_0         
	//   46   90:getfield        #96  <Field String d>
	//   47   93:invokespecial   #99  <Method void ep(String, String)>
	//   48   96:areturn         
		else
			return i;
	//   49   97:aload_0         
	//   50   98:getfield        #101 <Field ep i>
	//   51  101:areturn         
	}

	static PayPalService a(LoginActivity loginactivity, PayPalService paypalservice)
	{
		loginactivity.r = paypalservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #104 <Field PayPalService r>
		return paypalservice;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void a(Activity activity, int i1, dm dm1, boolean flag, boolean flag1, String s1, PayPalConfiguration paypalconfiguration)
	{
		Intent intent = new Intent(((android.content.Context) (activity)), com/paypal/android/sdk/payments/LoginActivity);
	//    0    0:new             #107 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class LoginActivity>
	//    4    7:invokespecial   #110 <Method void Intent(android.content.Context, Class)>
	//    5   10:astore          7
		intent.putExtras(activity.getIntent());
	//    6   12:aload           7
	//    7   14:aload_0         
	//    8   15:invokevirtual   #114 <Method Intent Activity.getIntent()>
	//    9   18:invokevirtual   #118 <Method Intent Intent.putExtras(Intent)>
	//   10   21:pop             
		intent.putExtra("com.paypal.android.sdk.payments.persistedLogin", ((android.os.Parcelable) (dm1)));
	//   11   22:aload           7
	//   12   24:ldc1            #120 <String "com.paypal.android.sdk.payments.persistedLogin">
	//   13   26:aload_2         
	//   14   27:invokevirtual   #124 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   15   30:pop             
		intent.putExtra("com.paypal.android.sdk.payments.useResponseTypeCode", flag);
	//   16   31:aload           7
	//   17   33:ldc1            #126 <String "com.paypal.android.sdk.payments.useResponseTypeCode">
	//   18   35:iload_3         
	//   19   36:invokevirtual   #129 <Method Intent Intent.putExtra(String, boolean)>
	//   20   39:pop             
		intent.putExtra("com.paypal.android.sdk.payments.forceLogin", flag1);
	//   21   40:aload           7
	//   22   42:ldc1            #131 <String "com.paypal.android.sdk.payments.forceLogin">
	//   23   44:iload           4
	//   24   46:invokevirtual   #129 <Method Intent Intent.putExtra(String, boolean)>
	//   25   49:pop             
		intent.putExtra("com.paypal.android.sdk.payments.requestedScopes", s1);
	//   26   50:aload           7
	//   27   52:ldc1            #133 <String "com.paypal.android.sdk.payments.requestedScopes">
	//   28   54:aload           5
	//   29   56:invokevirtual   #136 <Method Intent Intent.putExtra(String, String)>
	//   30   59:pop             
		intent.putExtra("com.paypal.android.sdk.paypalConfiguration", ((android.os.Parcelable) (paypalconfiguration)));
	//   31   60:aload           7
	//   32   62:ldc1            #138 <String "com.paypal.android.sdk.paypalConfiguration">
	//   33   64:aload           6
	//   34   66:invokevirtual   #124 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   35   69:pop             
		activity.startActivityForResult(intent, 1);
	//   36   70:aload_0         
	//   37   71:aload           7
	//   38   73:iconst_1        
	//   39   74:invokevirtual   #142 <Method void Activity.startActivityForResult(Intent, int)>
	//   40   77:return          
	}

	static void a(LoginActivity loginactivity)
	{
		loginactivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #144 <Method void h()>
	//    2    4:return          
	}

	static void a(LoginActivity loginactivity, View view)
	{
		ep ep1 = loginactivity.a(loginactivity.b);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #146 <Field bg b>
	//    3    5:invokespecial   #148 <Method ep a(bg)>
	//    4    8:astore_2        
		if(loginactivity.b == bg.b)
	//*   5    9:aload_0         
	//*   6   10:getfield        #146 <Field bg b>
	//*   7   13:getstatic       #61  <Field bg bg.b>
	//*   8   16:if_acmpne       42
		{
			loginactivity.i = new ep(ep1.d(), ((String) (null)));
	//    9   19:aload_0         
	//   10   20:new             #85  <Class ep>
	//   11   23:dup             
	//   12   24:aload_2         
	//   13   25:invokevirtual   #151 <Method ev ep.d()>
	//   14   28:aconst_null     
	//   15   29:invokespecial   #90  <Method void ep(ev, String)>
	//   16   32:putfield        #101 <Field ep i>
			view = ((View) (bg.d));
	//   17   35:getstatic       #153 <Field bg bg.d>
	//   18   38:astore_1        
		} else
	//*  19   39:goto            62
		{
			loginactivity.i = new ep(ep1.b(), ((String) (null)));
	//   20   42:aload_0         
	//   21   43:new             #85  <Class ep>
	//   22   46:dup             
	//   23   47:aload_2         
	//   24   48:invokevirtual   #155 <Method String ep.b()>
	//   25   51:aconst_null     
	//   26   52:invokespecial   #99  <Method void ep(String, String)>
	//   27   55:putfield        #101 <Field ep i>
			view = ((View) (bg.c));
	//   28   58:getstatic       #157 <Field bg bg.c>
	//   29   61:astore_1        
		}
		loginactivity.b(((bg) (view)));
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:invokespecial   #160 <Method void b(bg)>
		loginactivity.r.a(ep1, loginactivity.l, loginactivity.b(), loginactivity.c(), loginactivity.j);
	//   33   67:aload_0         
	//   34   68:getfield        #104 <Field PayPalService r>
	//   35   71:aload_2         
	//   36   72:aload_0         
	//   37   73:getfield        #162 <Field boolean l>
	//   38   76:aload_0         
	//   39   77:invokespecial   #163 <Method String b()>
	//   40   80:aload_0         
	//   41   81:invokespecial   #166 <Method boolean c()>
	//   42   84:aload_0         
	//   43   85:getfield        #168 <Field String j>
	//   44   88:invokevirtual   #173 <Method void PayPalService.a(ep, boolean, String, boolean, String)>
	//   45   91:return          
	}

	static void a(LoginActivity loginactivity, bg bg1)
	{
		loginactivity.b(bg1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method void b(bg)>
	//    3    5:return          
	}

	static void a(LoginActivity loginactivity, bi bi1)
	{
		if(bi1.b())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #179 <Method boolean bi.b()>
	//*   2    4:ifeq            12
		{
			loginactivity.d();
	//    3    7:aload_0         
	//    4    8:invokespecial   #181 <Method void d()>
			return;
	//    5   11:return          
		}
		boolean flag;
		if(bi1.a() && bi1.b.equals("invalid_user"))
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #183 <Method boolean bi.a()>
	//*   8   16:ifeq            36
	//*   9   19:aload_1         
	//*  10   20:getfield        #185 <Field String bi.b>
	//*  11   23:ldc1            #187 <String "invalid_user">
	//*  12   25:invokevirtual   #193 <Method boolean String.equals(Object)>
	//*  13   28:ifeq            36
			flag = true;
	//   14   31:iconst_1        
	//   15   32:istore_2        
		else
	//*  16   33:goto            38
			flag = false;
	//   17   36:iconst_0        
	//   18   37:istore_2        
		if(flag)
	//*  19   38:iload_2         
	//*  20   39:ifeq            58
		{
			loginactivity.o();
	//   21   42:aload_0         
	//   22   43:invokespecial   #195 <Method void o()>
			cd.a(((Activity) (loginactivity)), fa.a(fc.bt), 3);
	//   23   46:aload_0         
	//   24   47:getstatic       #201 <Field fc fc.bt>
	//   25   50:invokestatic    #206 <Method String fa.a(fc)>
	//   26   53:iconst_3        
	//   27   54:invokestatic    #211 <Method void cd.a(Activity, String, int)>
			return;
	//   28   57:return          
		}
		if(bi1.c())
	//*  29   58:aload_1         
	//*  30   59:invokevirtual   #212 <Method boolean bi.c()>
	//*  31   62:ifeq            82
		{
			loginactivity.o();
	//   32   65:aload_0         
	//   33   66:invokespecial   #195 <Method void o()>
			cd.a(((Activity) (loginactivity)), fa.a(bi1.b), 3);
	//   34   69:aload_0         
	//   35   70:aload_1         
	//   36   71:getfield        #185 <Field String bi.b>
	//   37   74:invokestatic    #215 <Method String fa.a(String)>
	//   38   77:iconst_3        
	//   39   78:invokestatic    #211 <Method void cd.a(Activity, String, int)>
			return;
	//   40   81:return          
		}
		if("invalid_nonce".equals(((Object) (bi1.b))))
	//*  41   82:ldc1            #217 <String "invalid_nonce">
	//*  42   84:aload_1         
	//*  43   85:getfield        #185 <Field String bi.b>
	//*  44   88:invokevirtual   #193 <Method boolean String.equals(Object)>
	//*  45   91:ifeq            115
		{
			loginactivity.h = null;
	//   46   94:aload_0         
	//   47   95:aconst_null     
	//   48   96:putfield        #219 <Field String h>
			loginactivity.o();
	//   49   99:aload_0         
	//   50  100:invokespecial   #195 <Method void o()>
			cd.a(((Activity) (loginactivity)), fa.a(fc.aL), 5);
	//   51  103:aload_0         
	//   52  104:getstatic       #222 <Field fc fc.aL>
	//   53  107:invokestatic    #206 <Method String fa.a(fc)>
	//   54  110:iconst_5        
	//   55  111:invokestatic    #211 <Method void cd.a(Activity, String, int)>
			return;
	//   56  114:return          
		} else
		{
			loginactivity.h = null;
	//   57  115:aload_0         
	//   58  116:aconst_null     
	//   59  117:putfield        #219 <Field String h>
			loginactivity.o();
	//   60  120:aload_0         
	//   61  121:invokespecial   #195 <Method void o()>
			cd.a(((Activity) (loginactivity)), fa.a(bi1.b), 4);
	//   62  124:aload_0         
	//   63  125:aload_1         
	//   64  126:getfield        #185 <Field String bi.b>
	//   65  129:invokestatic    #215 <Method String fa.a(String)>
	//   66  132:iconst_4        
	//   67  133:invokestatic    #211 <Method void cd.a(Activity, String, int)>
			return;
	//   68  136:return          
		}
	}

	static void a(LoginActivity loginactivity, String s1)
	{
		loginactivity.d = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #96  <Field String d>
		loginactivity.g = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #87  <Field String g>
		loginactivity.o();
	//    6   10:aload_0         
	//    7   11:invokespecial   #195 <Method void o()>
		cd.a(((Activity) (loginactivity)), fa.a(s1), 1);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokestatic    #215 <Method String fa.a(String)>
	//   11   19:iconst_1        
	//   12   20:invokestatic    #211 <Method void cd.a(Activity, String, int)>
	//   13   23:return          
	}

	private String b()
	{
		if(c())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #166 <Method boolean c()>
	//*   2    4:ifeq            10
			return "code";
	//    3    7:ldc1            #225 <String "code">
	//    4    9:areturn         
		else
			return "token";
	//    5   10:ldc1            #227 <String "token">
	//    6   12:areturn         
	}

	static void b(LoginActivity loginactivity)
	{
		loginactivity.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #229 <Method void i()>
	//    2    4:return          
	}

	static void b(LoginActivity loginactivity, View view)
	{
		loginactivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(com.paypal.android.sdk.payments.g.a())));
	//    0    0:aload_0         
	//    1    1:new             #107 <Class Intent>
	//    2    4:dup             
	//    3    5:ldc1            #231 <String "android.intent.action.VIEW">
	//    4    7:invokestatic    #235 <Method String g.a()>
	//    5   10:invokestatic    #241 <Method Uri Uri.parse(String)>
	//    6   13:invokespecial   #244 <Method void Intent(String, Uri)>
	//    7   16:invokevirtual   #248 <Method void startActivity(Intent)>
		loginactivity.r.a(ed.o, Boolean.valueOf(loginactivity.l));
	//    8   19:aload_0         
	//    9   20:getfield        #104 <Field PayPalService r>
	//   10   23:getstatic       #253 <Field ed ed.o>
	//   11   26:aload_0         
	//   12   27:getfield        #162 <Field boolean l>
	//   13   30:invokestatic    #259 <Method Boolean Boolean.valueOf(boolean)>
	//   14   33:invokevirtual   #262 <Method void PayPalService.a(ed, Boolean)>
	//   15   36:return          
	}

	static void b(LoginActivity loginactivity, String s1)
	{
		loginactivity.o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #195 <Method void o()>
		byte byte0;
		if("invalid_nonce".equals(((Object) (s1))))
	//*   2    4:ldc1            #217 <String "invalid_nonce">
	//*   3    6:aload_1         
	//*   4    7:invokevirtual   #193 <Method boolean String.equals(Object)>
	//*   5   10:ifeq            29
		{
			s1 = fa.a(fc.aL);
	//    6   13:getstatic       #222 <Field fc fc.aL>
	//    7   16:invokestatic    #206 <Method String fa.a(fc)>
	//    8   19:astore_1        
			byte0 = 5;
	//    9   20:iconst_5        
	//   10   21:istore_2        
		} else
	//*  11   22:aload_0         
	//*  12   23:aload_1         
	//*  13   24:iload_2         
	//*  14   25:invokestatic    #211 <Method void cd.a(Activity, String, int)>
	//*  15   28:return          
		{
			s1 = fa.a(s1);
	//   16   29:aload_1         
	//   17   30:invokestatic    #215 <Method String fa.a(String)>
	//   18   33:astore_1        
			byte0 = 2;
	//   19   34:iconst_2        
	//   20   35:istore_2        
		}
		cd.a(((Activity) (loginactivity)), s1, ((int) (byte0)));
	//*  21   36:goto            22
	}

	private void b(bg bg1)
	{
		(new StringBuilder("changeLoginState:")).append(((Object) (bg1)));
	//    0    0:new             #266 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #268 <String "changeLoginState:">
	//    3    7:invokespecial   #269 <Method void StringBuilder(String)>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #273 <Method StringBuilder StringBuilder.append(Object)>
	//    6   14:pop             
		if(bg1 != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          27
			b = bg1;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #146 <Field bg b>
		else
	//*  12   24:goto            45
			(new StringBuilder("null loginState, refreshing:")).append(((Object) (b)));
	//   13   27:new             #266 <Class StringBuilder>
	//   14   30:dup             
	//   15   31:ldc2            #275 <String "null loginState, refreshing:">
	//   16   34:invokespecial   #269 <Method void StringBuilder(String)>
	//   17   37:aload_0         
	//   18   38:getfield        #146 <Field bg b>
	//   19   41:invokevirtual   #273 <Method StringBuilder StringBuilder.append(Object)>
	//   20   44:pop             
		Object obj;
		try
		{
			dismissDialog(20);
	//   21   45:aload_0         
	//   22   46:bipush          20
	//   23   48:invokevirtual   #279 <Method void dismissDialog(int)>
			dismissDialog(21);
	//   24   51:aload_0         
	//   25   52:bipush          21
	//   26   54:invokevirtual   #279 <Method void dismissDialog(int)>
		}
	//*  27   57:getstatic       #284 <Field int[] aa.a>
	//*  28   60:aload_0         
	//*  29   61:getfield        #146 <Field bg b>
	//*  30   64:invokevirtual   #288 <Method int bg.ordinal()>
	//*  31   67:iaload          
	//*  32   68:tableswitch     1 13: default 136
	//	               1 508
	//	               2 491
	//	               3 405
	//	               4 325
	//	               5 316
	//	               6 279
	//	               7 268
	//	               8 514
	//	               9 497
	//	               10 242
	//	               11 331
	//	               12 139
	//	               13 331
	//*  33  136:goto            555
	//*  34  139:aload_0         
	//*  35  140:invokespecial   #290 <Method void l()>
	//*  36  143:aload_0         
	//*  37  144:invokespecial   #292 <Method void k()>
	//*  38  147:aload_0         
	//*  39  148:getfield        #294 <Field fk p>
	//*  40  151:getfield        #299 <Field fp fk.o>
	//*  41  154:getfield        #304 <Field Button fp.c>
	//*  42  157:getstatic       #307 <Field fc fc.aZ>
	//*  43  160:invokestatic    #206 <Method String fa.a(fc)>
	//*  44  163:invokevirtual   #313 <Method void Button.setText(CharSequence)>
	//*  45  166:aload_0         
	//*  46  167:getfield        #294 <Field fk p>
	//*  47  170:getfield        #316 <Field EditText fk.l>
	//*  48  173:iconst_1        
	//*  49  174:invokevirtual   #322 <Method void EditText.setEnabled(boolean)>
	//*  50  177:aload_0         
	//*  51  178:getfield        #294 <Field fk p>
	//*  52  181:getfield        #316 <Field EditText fk.l>
	//*  53  184:iconst_0        
	//*  54  185:invokevirtual   #325 <Method void EditText.setVisibility(int)>
	//*  55  188:aload_0         
	//*  56  189:getfield        #294 <Field fk p>
	//*  57  192:getfield        #316 <Field EditText fk.l>
	//*  58  195:astore_1        
	//*  59  196:aload_1         
	//*  60  197:invokevirtual   #328 <Method boolean EditText.requestFocus()>
	//*  61  200:pop             
	//*  62  201:new             #330 <Class Handler>
	//*  63  204:dup             
	//*  64  205:invokespecial   #331 <Method void Handler()>
	//*  65  208:new             #333 <Class o>
	//*  66  211:dup             
	//*  67  212:aload_0         
	//*  68  213:aload_1         
	//*  69  214:invokespecial   #336 <Method void o(LoginActivity, EditText)>
	//*  70  217:ldc2w           #337 <Long 200L>
	//*  71  220:invokevirtual   #342 <Method boolean Handler.postDelayed(Runnable, long)>
	//*  72  223:pop             
	//*  73  224:aload_0         
	//*  74  225:getfield        #294 <Field fk p>
	//*  75  228:getfield        #345 <Field LinearLayout fk.m>
	//*  76  231:iconst_0        
	//*  77  232:invokevirtual   #348 <Method void LinearLayout.setVisibility(int)>
	//*  78  235:aload_0         
	//*  79  236:invokespecial   #229 <Method void i()>
	//*  80  239:goto            555
	//*  81  242:aload_0         
	//*  82  243:invokespecial   #290 <Method void l()>
	//*  83  246:aload_0         
	//*  84  247:invokespecial   #292 <Method void k()>
	//*  85  250:aload_0         
	//*  86  251:getfield        #294 <Field fk p>
	//*  87  254:getfield        #299 <Field fp fk.o>
	//*  88  257:getfield        #304 <Field Button fp.c>
	//*  89  260:astore_2        
	//*  90  261:getstatic       #351 <Field fc fc.aY>
	//*  91  264:astore_1        
	//*  92  265:goto            434
	//*  93  268:aload_0         
	//*  94  269:invokespecial   #353 <Method void j()>
	//*  95  272:aload_0         
	//*  96  273:invokespecial   #355 <Method void n()>
	//*  97  276:goto            287
	//*  98  279:aload_0         
	//*  99  280:invokespecial   #353 <Method void j()>
	//* 100  283:aload_0         
	//* 101  284:invokespecial   #357 <Method void m()>
	//* 102  287:aload_0         
	//* 103  288:getfield        #294 <Field fk p>
	//* 104  291:getfield        #359 <Field EditText fk.b>
	//* 105  294:iconst_1        
	//* 106  295:invokevirtual   #322 <Method void EditText.setEnabled(boolean)>
	//* 107  298:aload_0         
	//* 108  299:getfield        #294 <Field fk p>
	//* 109  302:getfield        #361 <Field EditText fk.d>
	//* 110  305:iconst_1        
	//* 111  306:invokevirtual   #322 <Method void EditText.setEnabled(boolean)>
	//* 112  309:aload_0         
	//* 113  310:invokespecial   #144 <Method void h()>
	//* 114  313:goto            555
	//* 115  316:aload_0         
	//* 116  317:bipush          20
	//* 117  319:invokevirtual   #364 <Method void showDialog(int)>
	//* 118  322:goto            331
	//* 119  325:aload_0         
	//* 120  326:bipush          21
	//* 121  328:invokevirtual   #364 <Method void showDialog(int)>
	//* 122  331:aload_0         
	//* 123  332:invokespecial   #290 <Method void l()>
	//* 124  335:aload_0         
	//* 125  336:invokespecial   #292 <Method void k()>
	//* 126  339:aload_0         
	//* 127  340:getfield        #294 <Field fk p>
	//* 128  343:getfield        #299 <Field fp fk.o>
	//* 129  346:getfield        #304 <Field Button fp.c>
	//* 130  349:getstatic       #307 <Field fc fc.aZ>
	//* 131  352:invokestatic    #206 <Method String fa.a(fc)>
	//* 132  355:invokevirtual   #313 <Method void Button.setText(CharSequence)>
	//* 133  358:aload_0         
	//* 134  359:getfield        #294 <Field fk p>
	//* 135  362:getfield        #316 <Field EditText fk.l>
	//* 136  365:iconst_0        
	//* 137  366:invokevirtual   #322 <Method void EditText.setEnabled(boolean)>
	//* 138  369:aload_0         
	//* 139  370:getfield        #294 <Field fk p>
	//* 140  373:getfield        #316 <Field EditText fk.l>
	//* 141  376:iconst_0        
	//* 142  377:invokevirtual   #325 <Method void EditText.setVisibility(int)>
	//* 143  380:aload_0         
	//* 144  381:getfield        #294 <Field fk p>
	//* 145  384:getfield        #345 <Field LinearLayout fk.m>
	//* 146  387:iconst_0        
	//* 147  388:invokevirtual   #365 <Method void LinearLayout.setEnabled(boolean)>
	//* 148  391:aload_0         
	//* 149  392:getfield        #294 <Field fk p>
	//* 150  395:getfield        #345 <Field LinearLayout fk.m>
	//* 151  398:iconst_0        
	//* 152  399:invokevirtual   #348 <Method void LinearLayout.setVisibility(int)>
	//* 153  402:goto            555
	//* 154  405:aload_0         
	//* 155  406:bipush          21
	//* 156  408:invokevirtual   #364 <Method void showDialog(int)>
	//* 157  411:aload_0         
	//* 158  412:invokespecial   #290 <Method void l()>
	//* 159  415:aload_0         
	//* 160  416:invokespecial   #292 <Method void k()>
	//* 161  419:aload_0         
	//* 162  420:getfield        #294 <Field fk p>
	//* 163  423:getfield        #299 <Field fp fk.o>
	//* 164  426:getfield        #304 <Field Button fp.c>
	//* 165  429:astore_2        
	//* 166  430:getstatic       #307 <Field fc fc.aZ>
	//* 167  433:astore_1        
	//* 168  434:aload_2         
	//* 169  435:aload_1         
	//* 170  436:invokestatic    #206 <Method String fa.a(fc)>
	//* 171  439:invokevirtual   #313 <Method void Button.setText(CharSequence)>
	//* 172  442:aload_0         
	//* 173  443:getfield        #294 <Field fk p>
	//* 174  446:getfield        #316 <Field EditText fk.l>
	//* 175  449:iconst_0        
	//* 176  450:invokevirtual   #322 <Method void EditText.setEnabled(boolean)>
	//* 177  453:aload_0         
	//* 178  454:getfield        #294 <Field fk p>
	//* 179  457:getfield        #316 <Field EditText fk.l>
	//* 180  460:bipush          8
	//* 181  462:invokevirtual   #325 <Method void EditText.setVisibility(int)>
	//* 182  465:aload_0         
	//* 183  466:getfield        #294 <Field fk p>
	//* 184  469:getfield        #345 <Field LinearLayout fk.m>
	//* 185  472:iconst_0        
	//* 186  473:invokevirtual   #365 <Method void LinearLayout.setEnabled(boolean)>
	//* 187  476:aload_0         
	//* 188  477:getfield        #294 <Field fk p>
	//* 189  480:getfield        #345 <Field LinearLayout fk.m>
	//* 190  483:bipush          8
	//* 191  485:invokevirtual   #348 <Method void LinearLayout.setVisibility(int)>
	//* 192  488:goto            555
	//* 193  491:aload_0         
	//* 194  492:bipush          20
	//* 195  494:invokevirtual   #364 <Method void showDialog(int)>
	//* 196  497:aload_0         
	//* 197  498:invokespecial   #353 <Method void j()>
	//* 198  501:aload_0         
	//* 199  502:invokespecial   #355 <Method void n()>
	//* 200  505:goto            544
	//* 201  508:aload_0         
	//* 202  509:bipush          20
	//* 203  511:invokevirtual   #364 <Method void showDialog(int)>
	//* 204  514:aload_0         
	//* 205  515:invokespecial   #353 <Method void j()>
	//* 206  518:aload_0         
	//* 207  519:invokespecial   #357 <Method void m()>
	//* 208  522:aload_0         
	//* 209  523:getfield        #294 <Field fk p>
	//* 210  526:getfield        #359 <Field EditText fk.b>
	//* 211  529:iconst_0        
	//* 212  530:invokevirtual   #322 <Method void EditText.setEnabled(boolean)>
	//* 213  533:aload_0         
	//* 214  534:getfield        #294 <Field fk p>
	//* 215  537:getfield        #361 <Field EditText fk.d>
	//* 216  540:iconst_0        
	//* 217  541:invokevirtual   #322 <Method void EditText.setEnabled(boolean)>
	//* 218  544:aload_0         
	//* 219  545:getfield        #294 <Field fk p>
	//* 220  548:getfield        #367 <Field LinearLayout fk.h>
	//* 221  551:iconst_0        
	//* 222  552:invokevirtual   #365 <Method void LinearLayout.setEnabled(boolean)>
	//* 223  555:getstatic       #284 <Field int[] aa.a>
	//* 224  558:aload_0         
	//* 225  559:getfield        #146 <Field bg b>
	//* 226  562:invokevirtual   #288 <Method int bg.ordinal()>
	//* 227  565:iaload          
	//* 228  566:tableswitch     1 5: default 600
	//	               1 637
	//	               2 637
	//	               3 617
	//	               4 617
	//	               5 601
	//* 229  600:return          
	//* 230  601:aload_0         
	//* 231  602:getfield        #104 <Field PayPalService r>
	//* 232  605:new             #369 <Class n>
	//* 233  608:dup             
	//* 234  609:aload_0         
	//* 235  610:invokespecial   #370 <Method void n(LoginActivity)>
	//* 236  613:invokevirtual   #373 <Method void PayPalService.a(be)>
	//* 237  616:return          
	//* 238  617:aload_0         
	//* 239  618:getfield        #104 <Field PayPalService r>
	//* 240  621:astore_2        
	//* 241  622:new             #375 <Class m>
	//* 242  625:dup             
	//* 243  626:aload_0         
	//* 244  627:invokespecial   #376 <Method void m(LoginActivity)>
	//* 245  630:astore_1        
	//* 246  631:aload_2         
	//* 247  632:aload_1         
	//* 248  633:invokevirtual   #373 <Method void PayPalService.a(be)>
	//* 249  636:return          
	//* 250  637:aload_0         
	//* 251  638:getfield        #104 <Field PayPalService r>
	//* 252  641:astore_2        
	//* 253  642:new             #378 <Class ah>
	//* 254  645:dup             
	//* 255  646:aload_0         
	//* 256  647:invokespecial   #379 <Method void ah(LoginActivity)>
	//* 257  650:astore_1        
	//* 258  651:goto            631
		// Misplaced declaration of an exception variable
		catch(bg bg1) { }
	//  259  654:astore_1        
		aa.a[b.ordinal()];
		JVM INSTR tableswitch 1 13: default 136
	//	               1 508
	//	               2 491
	//	               3 405
	//	               4 325
	//	               5 316
	//	               6 279
	//	               7 268
	//	               8 514
	//	               9 497
	//	               10 242
	//	               11 331
	//	               12 139
	//	               13 331;
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L12
_L1:
		break MISSING_BLOCK_LABEL_555;
_L13:
		l();
		k();
		p.o.c.setText(((CharSequence) (fa.a(fc.aZ))));
		p.l.setEnabled(true);
		p.l.setVisibility(0);
		bg1 = ((bg) (p.l));
		((EditText) (bg1)).requestFocus();
		(new Handler()).postDelayed(((Runnable) (new o(this, ((EditText) (bg1))))), 200L);
		p.m.setVisibility(0);
		i();
		break MISSING_BLOCK_LABEL_555;
_L11:
		l();
		k();
		obj = ((Object) (p.o.c));
		bg1 = ((bg) (fc.aY));
		  goto _L14
_L8:
		j();
		n();
		  goto _L15
_L7:
		j();
		m();
_L15:
		p.b.setEnabled(true);
		p.d.setEnabled(true);
		h();
		break MISSING_BLOCK_LABEL_555;
_L6:
		showDialog(20);
		  goto _L12
_L5:
		showDialog(21);
_L12:
		l();
		k();
		p.o.c.setText(((CharSequence) (fa.a(fc.aZ))));
		p.l.setEnabled(false);
		p.l.setVisibility(0);
		p.m.setEnabled(false);
		p.m.setVisibility(0);
		break MISSING_BLOCK_LABEL_555;
_L4:
		showDialog(21);
		l();
		k();
		obj = ((Object) (p.o.c));
		bg1 = ((bg) (fc.aZ));
_L14:
		((Button) (obj)).setText(((CharSequence) (fa.a(((fc) (bg1))))));
		p.l.setEnabled(false);
		p.l.setVisibility(8);
		p.m.setEnabled(false);
		p.m.setVisibility(8);
		break MISSING_BLOCK_LABEL_555;
_L3:
		showDialog(20);
_L10:
		j();
		n();
		  goto _L16
_L2:
		showDialog(20);
_L9:
		j();
		m();
		p.b.setEnabled(false);
		p.d.setEnabled(false);
_L16:
		p.h.setEnabled(false);
		aa.a[b.ordinal()];
		JVM INSTR tableswitch 1 5: default 600
	//	               1 637
	//	               2 637
	//	               3 617
	//	               4 617
	//	               5 601;
		   goto _L17 _L18 _L18 _L19 _L19 _L20
_L17:
		return;
_L20:
		r.a(((be) (new n(this))));
		return;
_L19:
		obj = ((Object) (r));
		bg1 = ((bg) (new m(this)));
_L22:
		((PayPalService) (obj)).a(((be) (bg1)));
		return;
_L18:
		obj = ((Object) (r));
		bg1 = ((bg) (new ah(this)));
		if(true) goto _L22; else goto _L21
_L21:
	//* 260  655:goto            57
	}

	static void c(LoginActivity loginactivity)
	{
		loginactivity.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #381 <Method void e()>
	//    2    4:return          
	}

	static void c(LoginActivity loginactivity, View view)
	{
		loginactivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void g()>
		if(loginactivity.b == bg.b)
	//*   2    4:aload_0         
	//*   3    5:getfield        #146 <Field bg b>
	//*   4    8:getstatic       #61  <Field bg bg.b>
	//*   5   11:if_acmpne       21
			view = ((View) (bg.a));
	//    6   14:getstatic       #92  <Field bg bg.a>
	//    7   17:astore_1        
		else
	//*   8   18:goto            25
			view = ((View) (bg.b));
	//    9   21:getstatic       #61  <Field bg bg.b>
	//   10   24:astore_1        
		loginactivity.b(((bg) (view)));
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:invokespecial   #160 <Method void b(bg)>
		loginactivity.f();
	//   14   30:aload_0         
	//   15   31:invokespecial   #383 <Method void f()>
		view = ((View) (loginactivity.p));
	//   16   34:aload_0         
	//   17   35:getfield        #294 <Field fk p>
	//   18   38:astore_1        
		boolean flag;
		if(loginactivity.b == bg.a)
	//*  19   39:aload_0         
	//*  20   40:getfield        #146 <Field bg b>
	//*  21   43:getstatic       #92  <Field bg bg.a>
	//*  22   46:if_acmpne       54
			flag = true;
	//   23   49:iconst_1        
	//   24   50:istore_2        
		else
	//*  25   51:goto            56
			flag = false;
	//   26   54:iconst_0        
	//   27   55:istore_2        
		((fk) (view)).a(flag);
	//   28   56:aload_1         
	//   29   57:iload_2         
	//   30   58:invokevirtual   #385 <Method void fk.a(boolean)>
	//   31   61:return          
	}

	private boolean c()
	{
		return getIntent().getBooleanExtra("com.paypal.android.sdk.payments.useResponseTypeCode", false);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #386 <Method Intent getIntent()>
	//    2    4:ldc1            #126 <String "com.paypal.android.sdk.payments.useResponseTypeCode">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #390 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//    5   10:ireturn         
	}

	private void d()
	{
		if(r.c().f.a.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field PayPalService r>
	//*   2    4:invokevirtual   #393 <Method ck PayPalService.c()>
	//*   3    7:getfield        #398 <Field dd ck.f>
	//*   4   10:getfield        #403 <Field Map dd.a>
	//*   5   13:invokeinterface #408 <Method boolean Map.isEmpty()>
	//*   6   18:ifeq            38
		{
			o();
	//    7   21:aload_0         
	//    8   22:invokespecial   #195 <Method void o()>
			cd.a(((Activity) (this)), fa.a(fc.ba), 10);
	//    9   25:aload_0         
	//   10   26:getstatic       #411 <Field fc fc.ba>
	//   11   29:invokestatic    #206 <Method String fa.a(fc)>
	//   12   32:bipush          10
	//   13   34:invokestatic    #211 <Method void cd.a(Activity, String, int)>
			return;
	//   14   37:return          
		} else
		{
			b(bg.g);
	//   15   38:aload_0         
	//   16   39:getstatic       #413 <Field bg bg.g>
	//   17   42:invokespecial   #160 <Method void b(bg)>
			return;
	//   18   45:return          
		}
	}

	static void d(LoginActivity loginactivity)
	{
		loginactivity.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #181 <Method void d()>
	//    2    4:return          
	}

	static void d(LoginActivity loginactivity, View view)
	{
		loginactivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(dd.a())));
	//    0    0:aload_0         
	//    1    1:new             #107 <Class Intent>
	//    2    4:dup             
	//    3    5:ldc1            #231 <String "android.intent.action.VIEW">
	//    4    7:invokestatic    #416 <Method String dd.a()>
	//    5   10:invokestatic    #241 <Method Uri Uri.parse(String)>
	//    6   13:invokespecial   #244 <Method void Intent(String, Uri)>
	//    7   16:invokevirtual   #248 <Method void startActivity(Intent)>
		loginactivity.r.a(ed.n, Boolean.valueOf(loginactivity.l));
	//    8   19:aload_0         
	//    9   20:getfield        #104 <Field PayPalService r>
	//   10   23:getstatic       #418 <Field ed ed.n>
	//   11   26:aload_0         
	//   12   27:getfield        #162 <Field boolean l>
	//   13   30:invokestatic    #259 <Method Boolean Boolean.valueOf(boolean)>
	//   14   33:invokevirtual   #262 <Method void PayPalService.a(ed, Boolean)>
	//   15   36:return          
	}

	static fk e(LoginActivity loginactivity)
	{
		return loginactivity.p;
	//    0    0:aload_0         
	//    1    1:getfield        #294 <Field fk p>
	//    2    4:areturn         
	}

	private void e()
	{
		setResult(-1);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:invokevirtual   #422 <Method void setResult(int)>
		finish();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #425 <Method void finish()>
	//    5    9:return          
	}

	static void e(LoginActivity loginactivity, View view)
	{
		if(loginactivity.b == bg.j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #146 <Field bg b>
	//*   2    4:getstatic       #427 <Field bg bg.j>
	//*   3    7:if_acmpne       17
			view = ((View) (bg.i));
	//    4   10:getstatic       #429 <Field bg bg.i>
	//    5   13:astore_1        
		else
	//*   6   14:goto            21
			view = ((View) (bg.h));
	//    7   17:getstatic       #431 <Field bg bg.h>
	//    8   20:astore_1        
		loginactivity.b(((bg) (view)));
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:invokespecial   #160 <Method void b(bg)>
		loginactivity.p.l.setText("");
	//   12   26:aload_0         
	//   13   27:getfield        #294 <Field fk p>
	//   14   30:getfield        #316 <Field EditText fk.l>
	//   15   33:ldc2            #433 <String "">
	//   16   36:invokevirtual   #434 <Method void EditText.setText(CharSequence)>
		loginactivity.r.a(loginactivity.o);
	//   17   39:aload_0         
	//   18   40:getfield        #104 <Field PayPalService r>
	//   19   43:aload_0         
	//   20   44:getfield        #54  <Field int o>
	//   21   47:invokevirtual   #436 <Method void PayPalService.a(int)>
	//   22   50:return          
	}

	static PayPalService f(LoginActivity loginactivity)
	{
		return loginactivity.r;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field PayPalService r>
	//    2    4:areturn         
	}

	private void f()
	{
		cd.a(p.c.b, r.e());
	//    0    0:aload_0         
	//    1    1:getfield        #294 <Field fk p>
	//    2    4:getfield        #440 <Field fe fk.c>
	//    3    7:getfield        #445 <Field TextView fe.b>
	//    4   10:aload_0         
	//    5   11:getfield        #104 <Field PayPalService r>
	//    6   14:invokevirtual   #447 <Method String PayPalService.e()>
	//    7   17:invokestatic    #450 <Method void cd.a(TextView, String)>
		b(((bg) (null)));
	//    8   20:aload_0         
	//    9   21:aconst_null     
	//   10   22:invokespecial   #160 <Method void b(bg)>
	//   11   25:return          
	}

	static void f(LoginActivity loginactivity, View view)
	{
		loginactivity.b(bg.k);
	//    0    0:aload_0         
	//    1    1:getstatic       #452 <Field bg bg.k>
	//    2    4:invokespecial   #160 <Method void b(bg)>
		loginactivity.r.a(loginactivity.a(loginactivity.b), ((Object) (loginactivity.p.l.getText())).toString(), loginactivity.l, loginactivity.b(), loginactivity.c(), loginactivity.j);
	//    3    7:aload_0         
	//    4    8:getfield        #104 <Field PayPalService r>
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #146 <Field bg b>
	//    8   16:invokespecial   #148 <Method ep a(bg)>
	//    9   19:aload_0         
	//   10   20:getfield        #294 <Field fk p>
	//   11   23:getfield        #316 <Field EditText fk.l>
	//   12   26:invokevirtual   #456 <Method Editable EditText.getText()>
	//   13   29:invokevirtual   #461 <Method String Object.toString()>
	//   14   32:aload_0         
	//   15   33:getfield        #162 <Field boolean l>
	//   16   36:aload_0         
	//   17   37:invokespecial   #163 <Method String b()>
	//   18   40:aload_0         
	//   19   41:invokespecial   #166 <Method boolean c()>
	//   20   44:aload_0         
	//   21   45:getfield        #168 <Field String j>
	//   22   48:invokevirtual   #464 <Method void PayPalService.a(ep, String, boolean, String, boolean, String)>
	//   23   51:return          
	}

	private void g()
	{
		if(b == bg.b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #146 <Field bg b>
	//*   2    4:getstatic       #61  <Field bg bg.b>
	//*   3    7:if_acmpne       45
		{
			e = ((Object) (p.b.getText())).toString();
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #294 <Field fk p>
	//    7   15:getfield        #359 <Field EditText fk.b>
	//    8   18:invokevirtual   #456 <Method Editable EditText.getText()>
	//    9   21:invokevirtual   #461 <Method String Object.toString()>
	//   10   24:putfield        #72  <Field String e>
			g = ((Object) (p.d.getText())).toString();
	//   11   27:aload_0         
	//   12   28:aload_0         
	//   13   29:getfield        #294 <Field fk p>
	//   14   32:getfield        #361 <Field EditText fk.d>
	//   15   35:invokevirtual   #456 <Method Editable EditText.getText()>
	//   16   38:invokevirtual   #461 <Method String Object.toString()>
	//   17   41:putfield        #87  <Field String g>
			return;
	//   18   44:return          
		} else
		{
			c = ((Object) (p.b.getText())).toString();
	//   19   45:aload_0         
	//   20   46:aload_0         
	//   21   47:getfield        #294 <Field fk p>
	//   22   50:getfield        #359 <Field EditText fk.b>
	//   23   53:invokevirtual   #456 <Method Editable EditText.getText()>
	//   24   56:invokevirtual   #461 <Method String Object.toString()>
	//   25   59:putfield        #94  <Field String c>
			d = ((Object) (p.d.getText())).toString();
	//   26   62:aload_0         
	//   27   63:aload_0         
	//   28   64:getfield        #294 <Field fk p>
	//   29   67:getfield        #361 <Field EditText fk.d>
	//   30   70:invokevirtual   #456 <Method Editable EditText.getText()>
	//   31   73:invokevirtual   #461 <Method String Object.toString()>
	//   32   76:putfield        #96  <Field String d>
			return;
	//   33   79:return          
		}
	}

	static void g(LoginActivity loginactivity)
	{
		switch(aa.a[loginactivity.b.ordinal()])
	//*   0    0:getstatic       #284 <Field int[] aa.a>
	//*   1    3:aload_0         
	//*   2    4:getfield        #146 <Field bg b>
	//*   3    7:invokevirtual   #288 <Method int bg.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     8 13: default 48
	//	               8 98
	//	               9 90
	//	               10 48
	//	               11 82
	//	               12 48
	//	               13 74
		case 10: // '\n'
		case 12: // '\f'
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    6   48:new             #266 <Class StringBuilder>
	//    7   51:dup             
	//    8   52:invokespecial   #465 <Method void StringBuilder()>
	//    9   55:astore_1        
			stringbuilder.append(((Object) (loginactivity.b)));
	//   10   56:aload_1         
	//   11   57:aload_0         
	//   12   58:getfield        #146 <Field bg b>
	//   13   61:invokevirtual   #273 <Method StringBuilder StringBuilder.append(Object)>
	//   14   64:pop             
			stringbuilder.append(" case not handled");
	//   15   65:aload_1         
	//   16   66:ldc2            #467 <String " case not handled">
	//   17   69:invokevirtual   #470 <Method StringBuilder StringBuilder.append(String)>
	//   18   72:pop             
			return;
	//   19   73:return          

		case 13: // '\r'
			loginactivity.b(bg.j);
	//   20   74:aload_0         
	//   21   75:getstatic       #427 <Field bg bg.j>
	//   22   78:invokespecial   #160 <Method void b(bg)>
			return;
	//   23   81:return          

		case 11: // '\013'
			loginactivity.b(bg.j);
	//   24   82:aload_0         
	//   25   83:getstatic       #427 <Field bg bg.j>
	//   26   86:invokespecial   #160 <Method void b(bg)>
			return;
	//   27   89:return          

		case 9: // '\t'
			loginactivity.b(bg.b);
	//   28   90:aload_0         
	//   29   91:getstatic       #61  <Field bg bg.b>
	//   30   94:invokespecial   #160 <Method void b(bg)>
			return;
	//   31   97:return          

		case 8: // '\b'
			loginactivity.b(bg.a);
	//   32   98:aload_0         
	//   33   99:getstatic       #92  <Field bg bg.a>
	//   34  102:invokespecial   #160 <Method void b(bg)>
			return;
	//   35  105:return          
		}
	}

	private void h()
	{
		String s1 = ((Object) (p.b.getText())).toString();
	//    0    0:aload_0         
	//    1    1:getfield        #294 <Field fk p>
	//    2    4:getfield        #359 <Field EditText fk.b>
	//    3    7:invokevirtual   #456 <Method Editable EditText.getText()>
	//    4   10:invokevirtual   #461 <Method String Object.toString()>
	//    5   13:astore_2        
		String s2 = ((Object) (p.d.getText())).toString();
	//    6   14:aload_0         
	//    7   15:getfield        #294 <Field fk p>
	//    8   18:getfield        #361 <Field EditText fk.d>
	//    9   21:invokevirtual   #456 <Method Editable EditText.getText()>
	//   10   24:invokevirtual   #461 <Method String Object.toString()>
	//   11   27:astore_3        
		bg bg1 = b;
	//   12   28:aload_0         
	//   13   29:getfield        #146 <Field bg b>
	//   14   32:astore          4
		bg bg2 = bg.b;
	//   15   34:getstatic       #61  <Field bg bg.b>
	//   16   37:astore          5
		boolean flag = true;
	//   17   39:iconst_1        
	//   18   40:istore_1        
		if(bg1 != bg2 ? !dr.a(s1) || !dr.c(s2) : !dr.d(s1) || !dr.b(s2))
	//*  19   41:aload           4
	//*  20   43:aload           5
	//*  21   45:if_acmpne       70
	//*  22   48:aload_2         
	//*  23   49:invokestatic    #475 <Method boolean dr.d(String)>
	//*  24   52:ifeq            65
	//*  25   55:aload_3         
	//*  26   56:invokestatic    #477 <Method boolean dr.b(String)>
	//*  27   59:ifeq            65
	//*  28   62:goto            84
			flag = false;
	//   29   65:iconst_0        
	//   30   66:istore_1        
	//   31   67:goto            84
	//   32   70:aload_2         
	//   33   71:invokestatic    #479 <Method boolean dr.a(String)>
	//   34   74:ifeq            65
	//   35   77:aload_3         
	//   36   78:invokestatic    #481 <Method boolean dr.c(String)>
	//   37   81:ifeq            65
		p.h.setEnabled(flag);
	//   38   84:aload_0         
	//   39   85:getfield        #294 <Field fk p>
	//   40   88:getfield        #367 <Field LinearLayout fk.h>
	//   41   91:iload_1         
	//   42   92:invokevirtual   #365 <Method void LinearLayout.setEnabled(boolean)>
		p.h.setFocusable(flag);
	//   43   95:aload_0         
	//   44   96:getfield        #294 <Field fk p>
	//   45   99:getfield        #367 <Field LinearLayout fk.h>
	//   46  102:iload_1         
	//   47  103:invokevirtual   #484 <Method void LinearLayout.setFocusable(boolean)>
	//   48  106:return          
	}

	static void h(LoginActivity loginactivity)
	{
		bg bg1;
		if(loginactivity.i.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field ep i>
	//*   2    4:invokevirtual   #485 <Method boolean ep.a()>
	//*   3    7:ifeq            20
			bg1 = bg.a;
	//    4   10:getstatic       #92  <Field bg bg.a>
	//    5   13:astore_1        
		else
	//*   6   14:aload_0         
	//*   7   15:aload_1         
	//*   8   16:invokespecial   #160 <Method void b(bg)>
	//*   9   19:return          
			bg1 = bg.b;
	//   10   20:getstatic       #61  <Field bg bg.b>
	//   11   23:astore_1        
		loginactivity.b(bg1);
	//*  12   24:goto            14
	}

	private void i()
	{
		boolean flag;
		if(6 == ((Object) (p.l.getText())).toString().length())
	//*   0    0:bipush          6
	//*   1    2:aload_0         
	//*   2    3:getfield        #294 <Field fk p>
	//*   3    6:getfield        #316 <Field EditText fk.l>
	//*   4    9:invokevirtual   #456 <Method Editable EditText.getText()>
	//*   5   12:invokevirtual   #461 <Method String Object.toString()>
	//*   6   15:invokevirtual   #488 <Method int String.length()>
	//*   7   18:icmpne          26
			flag = true;
	//    8   21:iconst_1        
	//    9   22:istore_1        
		else
	//*  10   23:goto            28
			flag = false;
	//   11   26:iconst_0        
	//   12   27:istore_1        
		p.m.setEnabled(flag);
	//   13   28:aload_0         
	//   14   29:getfield        #294 <Field fk p>
	//   15   32:getfield        #345 <Field LinearLayout fk.m>
	//   16   35:iload_1         
	//   17   36:invokevirtual   #365 <Method void LinearLayout.setEnabled(boolean)>
	//   18   39:return          
	}

	private void j()
	{
		p.o.a.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #294 <Field fk p>
	//    2    4:getfield        #299 <Field fp fk.o>
	//    3    7:getfield        #490 <Field LinearLayout fp.a>
	//    4   10:bipush          8
	//    5   12:invokevirtual   #348 <Method void LinearLayout.setVisibility(int)>
		p.k.setEnabled(false);
	//    6   15:aload_0         
	//    7   16:getfield        #294 <Field fk p>
	//    8   19:getfield        #492 <Field TextView fk.k>
	//    9   22:iconst_0        
	//   10   23:invokevirtual   #495 <Method void TextView.setEnabled(boolean)>
		p.k.setVisibility(8);
	//   11   26:aload_0         
	//   12   27:getfield        #294 <Field fk p>
	//   13   30:getfield        #492 <Field TextView fk.k>
	//   14   33:bipush          8
	//   15   35:invokevirtual   #496 <Method void TextView.setVisibility(int)>
		p.o.c.setVisibility(8);
	//   16   38:aload_0         
	//   17   39:getfield        #294 <Field fk p>
	//   18   42:getfield        #299 <Field fp fk.o>
	//   19   45:getfield        #304 <Field Button fp.c>
	//   20   48:bipush          8
	//   21   50:invokevirtual   #497 <Method void Button.setVisibility(int)>
		p.m.setEnabled(false);
	//   22   53:aload_0         
	//   23   54:getfield        #294 <Field fk p>
	//   24   57:getfield        #345 <Field LinearLayout fk.m>
	//   25   60:iconst_0        
	//   26   61:invokevirtual   #365 <Method void LinearLayout.setEnabled(boolean)>
		p.m.setVisibility(8);
	//   27   64:aload_0         
	//   28   65:getfield        #294 <Field fk p>
	//   29   68:getfield        #345 <Field LinearLayout fk.m>
	//   30   71:bipush          8
	//   31   73:invokevirtual   #348 <Method void LinearLayout.setVisibility(int)>
		p.l.setEnabled(false);
	//   32   76:aload_0         
	//   33   77:getfield        #294 <Field fk p>
	//   34   80:getfield        #316 <Field EditText fk.l>
	//   35   83:iconst_0        
	//   36   84:invokevirtual   #322 <Method void EditText.setEnabled(boolean)>
		p.l.setVisibility(8);
	//   37   87:aload_0         
	//   38   88:getfield        #294 <Field fk p>
	//   39   91:getfield        #316 <Field EditText fk.l>
	//   40   94:bipush          8
	//   41   96:invokevirtual   #325 <Method void EditText.setVisibility(int)>
	//   42   99:return          
	}

	private void k()
	{
		cd.a(((Activity) (this)), ((TextView) (null)), fc.aT);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:getstatic       #500 <Field fc fc.aT>
	//    3    5:invokestatic    #503 <Method void cd.a(Activity, TextView, fc)>
		p.k.setEnabled(true);
	//    4    8:aload_0         
	//    5    9:getfield        #294 <Field fk p>
	//    6   12:getfield        #492 <Field TextView fk.k>
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #495 <Method void TextView.setEnabled(boolean)>
		p.k.setVisibility(0);
	//    9   19:aload_0         
	//   10   20:getfield        #294 <Field fk p>
	//   11   23:getfield        #492 <Field TextView fk.k>
	//   12   26:iconst_0        
	//   13   27:invokevirtual   #496 <Method void TextView.setVisibility(int)>
		(new StringBuilder("phone numbers: ")).append(((Object) (r.c().f.a)));
	//   14   30:new             #266 <Class StringBuilder>
	//   15   33:dup             
	//   16   34:ldc2            #505 <String "phone numbers: ">
	//   17   37:invokespecial   #269 <Method void StringBuilder(String)>
	//   18   40:aload_0         
	//   19   41:getfield        #104 <Field PayPalService r>
	//   20   44:invokevirtual   #393 <Method ck PayPalService.c()>
	//   21   47:getfield        #398 <Field dd ck.f>
	//   22   50:getfield        #403 <Field Map dd.a>
	//   23   53:invokevirtual   #273 <Method StringBuilder StringBuilder.append(Object)>
	//   24   56:pop             
		ArrayList arraylist = new ArrayList(r.c().f.a.values());
	//   25   57:new             #507 <Class ArrayList>
	//   26   60:dup             
	//   27   61:aload_0         
	//   28   62:getfield        #104 <Field PayPalService r>
	//   29   65:invokevirtual   #393 <Method ck PayPalService.c()>
	//   30   68:getfield        #398 <Field dd ck.f>
	//   31   71:getfield        #403 <Field Map dd.a>
	//   32   74:invokeinterface #511 <Method java.util.Collection Map.values()>
	//   33   79:invokespecial   #514 <Method void ArrayList(java.util.Collection)>
	//   34   82:astore_1        
		p.o.a((String)((List) (arraylist)).get(o));
	//   35   83:aload_0         
	//   36   84:getfield        #294 <Field fk p>
	//   37   87:getfield        #299 <Field fp fk.o>
	//   38   90:aload_1         
	//   39   91:aload_0         
	//   40   92:getfield        #54  <Field int o>
	//   41   95:invokeinterface #520 <Method Object List.get(int)>
	//   42  100:checkcast       #189 <Class String>
	//   43  103:invokevirtual   #522 <Method void fp.a(String)>
		p.o.a.setVisibility(0);
	//   44  106:aload_0         
	//   45  107:getfield        #294 <Field fk p>
	//   46  110:getfield        #299 <Field fp fk.o>
	//   47  113:getfield        #490 <Field LinearLayout fp.a>
	//   48  116:iconst_0        
	//   49  117:invokevirtual   #348 <Method void LinearLayout.setVisibility(int)>
		if(((List) (arraylist)).size() > 1)
	//*  50  120:aload_1         
	//*  51  121:invokeinterface #525 <Method int List.size()>
	//*  52  126:iconst_1        
	//*  53  127:icmple          193
		{
			p.o.a(true);
	//   54  130:aload_0         
	//   55  131:getfield        #294 <Field fk p>
	//   56  134:getfield        #299 <Field fp fk.o>
	//   57  137:iconst_1        
	//   58  138:invokevirtual   #526 <Method void fp.a(boolean)>
			fo fo1 = new fo(((android.content.Context) (this)), ((List) (arraylist)), o);
	//   59  141:new             #528 <Class fo>
	//   60  144:dup             
	//   61  145:aload_0         
	//   62  146:aload_1         
	//   63  147:aload_0         
	//   64  148:getfield        #54  <Field int o>
	//   65  151:invokespecial   #531 <Method void fo(android.content.Context, List, int)>
	//   66  154:astore_2        
			(new ListView(((android.content.Context) (this)))).setAdapter(((android.widget.ListAdapter) (fo1)));
	//   67  155:new             #533 <Class ListView>
	//   68  158:dup             
	//   69  159:aload_0         
	//   70  160:invokespecial   #536 <Method void ListView(android.content.Context)>
	//   71  163:aload_2         
	//   72  164:invokevirtual   #540 <Method void ListView.setAdapter(android.widget.ListAdapter)>
			p.o.b.setOnClickListener(((android.view.View.OnClickListener) (new p(this, fo1, ((List) (arraylist))))));
	//   73  167:aload_0         
	//   74  168:getfield        #294 <Field fk p>
	//   75  171:getfield        #299 <Field fp fk.o>
	//   76  174:getfield        #543 <Field RelativeLayout fp.b>
	//   77  177:new             #545 <Class p>
	//   78  180:dup             
	//   79  181:aload_0         
	//   80  182:aload_2         
	//   81  183:aload_1         
	//   82  184:invokespecial   #548 <Method void p(LoginActivity, fo, List)>
	//   83  187:invokevirtual   #554 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		} else
	//*  84  190:goto            204
		{
			p.o.a(false);
	//   85  193:aload_0         
	//   86  194:getfield        #294 <Field fk p>
	//   87  197:getfield        #299 <Field fp fk.o>
	//   88  200:iconst_0        
	//   89  201:invokevirtual   #526 <Method void fp.a(boolean)>
		}
		p.o.c.setVisibility(0);
	//   90  204:aload_0         
	//   91  205:getfield        #294 <Field fk p>
	//   92  208:getfield        #299 <Field fp fk.o>
	//   93  211:getfield        #304 <Field Button fp.c>
	//   94  214:iconst_0        
	//   95  215:invokevirtual   #497 <Method void Button.setVisibility(int)>
	//   96  218:return          
	}

	private void l()
	{
		p.h.setEnabled(false);
	//    0    0:aload_0         
	//    1    1:getfield        #294 <Field fk p>
	//    2    4:getfield        #367 <Field LinearLayout fk.h>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #365 <Method void LinearLayout.setEnabled(boolean)>
		p.h.setVisibility(8);
	//    5   11:aload_0         
	//    6   12:getfield        #294 <Field fk p>
	//    7   15:getfield        #367 <Field LinearLayout fk.h>
	//    8   18:bipush          8
	//    9   20:invokevirtual   #348 <Method void LinearLayout.setVisibility(int)>
		p.b.setEnabled(false);
	//   10   23:aload_0         
	//   11   24:getfield        #294 <Field fk p>
	//   12   27:getfield        #359 <Field EditText fk.b>
	//   13   30:iconst_0        
	//   14   31:invokevirtual   #322 <Method void EditText.setEnabled(boolean)>
		p.b.setVisibility(8);
	//   15   34:aload_0         
	//   16   35:getfield        #294 <Field fk p>
	//   17   38:getfield        #359 <Field EditText fk.b>
	//   18   41:bipush          8
	//   19   43:invokevirtual   #325 <Method void EditText.setVisibility(int)>
		p.d.setEnabled(false);
	//   20   46:aload_0         
	//   21   47:getfield        #294 <Field fk p>
	//   22   50:getfield        #361 <Field EditText fk.d>
	//   23   53:iconst_0        
	//   24   54:invokevirtual   #322 <Method void EditText.setEnabled(boolean)>
		p.d.setVisibility(8);
	//   25   57:aload_0         
	//   26   58:getfield        #294 <Field fk p>
	//   27   61:getfield        #361 <Field EditText fk.d>
	//   28   64:bipush          8
	//   29   66:invokevirtual   #325 <Method void EditText.setVisibility(int)>
		p.e.setEnabled(false);
	//   30   69:aload_0         
	//   31   70:getfield        #294 <Field fk p>
	//   32   73:getfield        #557 <Field TableLayout fk.e>
	//   33   76:iconst_0        
	//   34   77:invokevirtual   #560 <Method void TableLayout.setEnabled(boolean)>
		p.e.setVisibility(8);
	//   35   80:aload_0         
	//   36   81:getfield        #294 <Field fk p>
	//   37   84:getfield        #557 <Field TableLayout fk.e>
	//   38   87:bipush          8
	//   39   89:invokevirtual   #561 <Method void TableLayout.setVisibility(int)>
	//   40   92:return          
	}

	private void m()
	{
		cd.a(((Activity) (this)), ((TextView) (null)), fc.aq);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:getstatic       #564 <Field fc fc.aq>
	//    3    5:invokestatic    #503 <Method void cd.a(Activity, TextView, fc)>
		p.b.setVisibility(0);
	//    4    8:aload_0         
	//    5    9:getfield        #294 <Field fk p>
	//    6   12:getfield        #359 <Field EditText fk.b>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #325 <Method void EditText.setVisibility(int)>
		p.b.setText(((CharSequence) (c)));
	//    9   19:aload_0         
	//   10   20:getfield        #294 <Field fk p>
	//   11   23:getfield        #359 <Field EditText fk.b>
	//   12   26:aload_0         
	//   13   27:getfield        #94  <Field String c>
	//   14   30:invokevirtual   #434 <Method void EditText.setText(CharSequence)>
		p.b.setHint(((CharSequence) (fa.a(fc.ae))));
	//   15   33:aload_0         
	//   16   34:getfield        #294 <Field fk p>
	//   17   37:getfield        #359 <Field EditText fk.b>
	//   18   40:getstatic       #567 <Field fc fc.ae>
	//   19   43:invokestatic    #206 <Method String fa.a(fc)>
	//   20   46:invokevirtual   #570 <Method void EditText.setHint(CharSequence)>
		p.b.setInputType(33);
	//   21   49:aload_0         
	//   22   50:getfield        #294 <Field fk p>
	//   23   53:getfield        #359 <Field EditText fk.b>
	//   24   56:bipush          33
	//   25   58:invokevirtual   #573 <Method void EditText.setInputType(int)>
		p.d.setVisibility(0);
	//   26   61:aload_0         
	//   27   62:getfield        #294 <Field fk p>
	//   28   65:getfield        #361 <Field EditText fk.d>
	//   29   68:iconst_0        
	//   30   69:invokevirtual   #325 <Method void EditText.setVisibility(int)>
		p.d.setText(((CharSequence) (d)));
	//   31   72:aload_0         
	//   32   73:getfield        #294 <Field fk p>
	//   33   76:getfield        #361 <Field EditText fk.d>
	//   34   79:aload_0         
	//   35   80:getfield        #96  <Field String d>
	//   36   83:invokevirtual   #434 <Method void EditText.setText(CharSequence)>
		p.d.setHint(((CharSequence) (fa.a(fc.au))));
	//   37   86:aload_0         
	//   38   87:getfield        #294 <Field fk p>
	//   39   90:getfield        #361 <Field EditText fk.d>
	//   40   93:getstatic       #576 <Field fc fc.au>
	//   41   96:invokestatic    #206 <Method String fa.a(fc)>
	//   42   99:invokevirtual   #570 <Method void EditText.setHint(CharSequence)>
		p.d.setInputType(129);
	//   43  102:aload_0         
	//   44  103:getfield        #294 <Field fk p>
	//   45  106:getfield        #361 <Field EditText fk.d>
	//   46  109:sipush          129
	//   47  112:invokevirtual   #573 <Method void EditText.setInputType(int)>
		if(p.b.getText().length() > 0 && p.d.getText().length() == 0)
	//*  48  115:aload_0         
	//*  49  116:getfield        #294 <Field fk p>
	//*  50  119:getfield        #359 <Field EditText fk.b>
	//*  51  122:invokevirtual   #456 <Method Editable EditText.getText()>
	//*  52  125:invokeinterface #579 <Method int Editable.length()>
	//*  53  130:ifle            162
	//*  54  133:aload_0         
	//*  55  134:getfield        #294 <Field fk p>
	//*  56  137:getfield        #361 <Field EditText fk.d>
	//*  57  140:invokevirtual   #456 <Method Editable EditText.getText()>
	//*  58  143:invokeinterface #579 <Method int Editable.length()>
	//*  59  148:ifne            162
			p.d.requestFocus();
	//   60  151:aload_0         
	//   61  152:getfield        #294 <Field fk p>
	//   62  155:getfield        #361 <Field EditText fk.d>
	//   63  158:invokevirtual   #328 <Method boolean EditText.requestFocus()>
	//   64  161:pop             
		p.b.setContentDescription("Email");
	//   65  162:aload_0         
	//   66  163:getfield        #294 <Field fk p>
	//   67  166:getfield        #359 <Field EditText fk.b>
	//   68  169:ldc2            #581 <String "Email">
	//   69  172:invokevirtual   #584 <Method void EditText.setContentDescription(CharSequence)>
		p.d.setContentDescription("Password");
	//   70  175:aload_0         
	//   71  176:getfield        #294 <Field fk p>
	//   72  179:getfield        #361 <Field EditText fk.d>
	//   73  182:ldc2            #586 <String "Password">
	//   74  185:invokevirtual   #584 <Method void EditText.setContentDescription(CharSequence)>
		p.h.setVisibility(0);
	//   75  188:aload_0         
	//   76  189:getfield        #294 <Field fk p>
	//   77  192:getfield        #367 <Field LinearLayout fk.h>
	//   78  195:iconst_0        
	//   79  196:invokevirtual   #348 <Method void LinearLayout.setVisibility(int)>
		p.e.setVisibility(0);
	//   80  199:aload_0         
	//   81  200:getfield        #294 <Field fk p>
	//   82  203:getfield        #557 <Field TableLayout fk.e>
	//   83  206:iconst_0        
	//   84  207:invokevirtual   #561 <Method void TableLayout.setVisibility(int)>
		p.f.setVisibility(0);
	//   85  210:aload_0         
	//   86  211:getfield        #294 <Field fk p>
	//   87  214:getfield        #588 <Field TextView fk.f>
	//   88  217:iconst_0        
	//   89  218:invokevirtual   #496 <Method void TextView.setVisibility(int)>
		p.g.setVisibility(0);
	//   90  221:aload_0         
	//   91  222:getfield        #294 <Field fk p>
	//   92  225:getfield        #590 <Field TextView fk.g>
	//   93  228:iconst_0        
	//   94  229:invokevirtual   #496 <Method void TextView.setVisibility(int)>
		p.j.setText(((CharSequence) (fa.a(fc.bp))));
	//   95  232:aload_0         
	//   96  233:getfield        #294 <Field fk p>
	//   97  236:getfield        #592 <Field TextView fk.j>
	//   98  239:getstatic       #595 <Field fc fc.bp>
	//   99  242:invokestatic    #206 <Method String fa.a(fc)>
	//  100  245:invokevirtual   #596 <Method void TextView.setText(CharSequence)>
	//  101  248:return          
	}

	private void n()
	{
		cd.a(((Activity) (this)), ((TextView) (null)), fc.aq);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:getstatic       #564 <Field fc fc.aq>
	//    3    5:invokestatic    #503 <Method void cd.a(Activity, TextView, fc)>
		p.b.setVisibility(0);
	//    4    8:aload_0         
	//    5    9:getfield        #294 <Field fk p>
	//    6   12:getfield        #359 <Field EditText fk.b>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #325 <Method void EditText.setVisibility(int)>
		p.b.setText(((CharSequence) (e)));
	//    9   19:aload_0         
	//   10   20:getfield        #294 <Field fk p>
	//   11   23:getfield        #359 <Field EditText fk.b>
	//   12   26:aload_0         
	//   13   27:getfield        #72  <Field String e>
	//   14   30:invokevirtual   #434 <Method void EditText.setText(CharSequence)>
		p.b.setHint(((CharSequence) (fa.a(fc.aA))));
	//   15   33:aload_0         
	//   16   34:getfield        #294 <Field fk p>
	//   17   37:getfield        #359 <Field EditText fk.b>
	//   18   40:getstatic       #599 <Field fc fc.aA>
	//   19   43:invokestatic    #206 <Method String fa.a(fc)>
	//   20   46:invokevirtual   #570 <Method void EditText.setHint(CharSequence)>
		p.b.setInputType(3);
	//   21   49:aload_0         
	//   22   50:getfield        #294 <Field fk p>
	//   23   53:getfield        #359 <Field EditText fk.b>
	//   24   56:iconst_3        
	//   25   57:invokevirtual   #573 <Method void EditText.setInputType(int)>
		p.d.setVisibility(0);
	//   26   60:aload_0         
	//   27   61:getfield        #294 <Field fk p>
	//   28   64:getfield        #361 <Field EditText fk.d>
	//   29   67:iconst_0        
	//   30   68:invokevirtual   #325 <Method void EditText.setVisibility(int)>
		p.d.setText(((CharSequence) (g)));
	//   31   71:aload_0         
	//   32   72:getfield        #294 <Field fk p>
	//   33   75:getfield        #361 <Field EditText fk.d>
	//   34   78:aload_0         
	//   35   79:getfield        #87  <Field String g>
	//   36   82:invokevirtual   #434 <Method void EditText.setText(CharSequence)>
		p.d.setHint(((CharSequence) (fa.a(fc.aB))));
	//   37   85:aload_0         
	//   38   86:getfield        #294 <Field fk p>
	//   39   89:getfield        #361 <Field EditText fk.d>
	//   40   92:getstatic       #602 <Field fc fc.aB>
	//   41   95:invokestatic    #206 <Method String fa.a(fc)>
	//   42   98:invokevirtual   #570 <Method void EditText.setHint(CharSequence)>
		p.d.setInputType(18);
	//   43  101:aload_0         
	//   44  102:getfield        #294 <Field fk p>
	//   45  105:getfield        #361 <Field EditText fk.d>
	//   46  108:bipush          18
	//   47  110:invokevirtual   #573 <Method void EditText.setInputType(int)>
		if(p.b.getText().length() > 0 && p.d.getText().length() == 0)
	//*  48  113:aload_0         
	//*  49  114:getfield        #294 <Field fk p>
	//*  50  117:getfield        #359 <Field EditText fk.b>
	//*  51  120:invokevirtual   #456 <Method Editable EditText.getText()>
	//*  52  123:invokeinterface #579 <Method int Editable.length()>
	//*  53  128:ifle            160
	//*  54  131:aload_0         
	//*  55  132:getfield        #294 <Field fk p>
	//*  56  135:getfield        #361 <Field EditText fk.d>
	//*  57  138:invokevirtual   #456 <Method Editable EditText.getText()>
	//*  58  141:invokeinterface #579 <Method int Editable.length()>
	//*  59  146:ifne            160
			p.d.requestFocus();
	//   60  149:aload_0         
	//   61  150:getfield        #294 <Field fk p>
	//   62  153:getfield        #361 <Field EditText fk.d>
	//   63  156:invokevirtual   #328 <Method boolean EditText.requestFocus()>
	//   64  159:pop             
		p.b.setContentDescription("Phone");
	//   65  160:aload_0         
	//   66  161:getfield        #294 <Field fk p>
	//   67  164:getfield        #359 <Field EditText fk.b>
	//   68  167:ldc2            #604 <String "Phone">
	//   69  170:invokevirtual   #584 <Method void EditText.setContentDescription(CharSequence)>
		p.d.setContentDescription("Pin");
	//   70  173:aload_0         
	//   71  174:getfield        #294 <Field fk p>
	//   72  177:getfield        #361 <Field EditText fk.d>
	//   73  180:ldc2            #606 <String "Pin">
	//   74  183:invokevirtual   #584 <Method void EditText.setContentDescription(CharSequence)>
		p.h.setVisibility(0);
	//   75  186:aload_0         
	//   76  187:getfield        #294 <Field fk p>
	//   77  190:getfield        #367 <Field LinearLayout fk.h>
	//   78  193:iconst_0        
	//   79  194:invokevirtual   #348 <Method void LinearLayout.setVisibility(int)>
		p.e.setVisibility(0);
	//   80  197:aload_0         
	//   81  198:getfield        #294 <Field fk p>
	//   82  201:getfield        #557 <Field TableLayout fk.e>
	//   83  204:iconst_0        
	//   84  205:invokevirtual   #561 <Method void TableLayout.setVisibility(int)>
		p.f.setVisibility(0);
	//   85  208:aload_0         
	//   86  209:getfield        #294 <Field fk p>
	//   87  212:getfield        #588 <Field TextView fk.f>
	//   88  215:iconst_0        
	//   89  216:invokevirtual   #496 <Method void TextView.setVisibility(int)>
		p.g.setVisibility(4);
	//   90  219:aload_0         
	//   91  220:getfield        #294 <Field fk p>
	//   92  223:getfield        #590 <Field TextView fk.g>
	//   93  226:iconst_4        
	//   94  227:invokevirtual   #496 <Method void TextView.setVisibility(int)>
		p.j.setText(((CharSequence) (fa.a(fc.bo))));
	//   95  230:aload_0         
	//   96  231:getfield        #294 <Field fk p>
	//   97  234:getfield        #592 <Field TextView fk.j>
	//   98  237:getstatic       #609 <Field fc fc.bo>
	//   99  240:invokestatic    #206 <Method String fa.a(fc)>
	//  100  243:invokevirtual   #596 <Method void TextView.setText(CharSequence)>
	//  101  246:return          
	}

	private void o()
	{
		switch(aa.a[b.ordinal()])
	//*   0    0:getstatic       #284 <Field int[] aa.a>
	//*   1    3:aload_0         
	//*   2    4:getfield        #146 <Field bg b>
	//*   3    7:invokevirtual   #288 <Method int bg.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 5: default 44
	//	               1 94
	//	               2 86
	//	               3 78
	//	               4 78
	//	               5 70
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    6   44:new             #266 <Class StringBuilder>
	//    7   47:dup             
	//    8   48:invokespecial   #465 <Method void StringBuilder()>
	//    9   51:astore_1        
			stringbuilder.append(((Object) (b)));
	//   10   52:aload_1         
	//   11   53:aload_0         
	//   12   54:getfield        #146 <Field bg b>
	//   13   57:invokevirtual   #273 <Method StringBuilder StringBuilder.append(Object)>
	//   14   60:pop             
			stringbuilder.append(" case not handled");
	//   15   61:aload_1         
	//   16   62:ldc2            #467 <String " case not handled">
	//   17   65:invokevirtual   #470 <Method StringBuilder StringBuilder.append(String)>
	//   18   68:pop             
			return;
	//   19   69:return          

		case 5: // '\005'
			b(bg.m);
	//   20   70:aload_0         
	//   21   71:getstatic       #611 <Field bg bg.m>
	//   22   74:invokespecial   #160 <Method void b(bg)>
			return;
	//   23   77:return          

		case 3: // '\003'
		case 4: // '\004'
			b(bg.l);
	//   24   78:aload_0         
	//   25   79:getstatic       #613 <Field bg bg.l>
	//   26   82:invokespecial   #160 <Method void b(bg)>
			return;
	//   27   85:return          

		case 2: // '\002'
			b(bg.f);
	//   28   86:aload_0         
	//   29   87:getstatic       #615 <Field bg bg.f>
	//   30   90:invokespecial   #160 <Method void b(bg)>
			return;
	//   31   93:return          

		case 1: // '\001'
			b(bg.e);
	//   32   94:aload_0         
	//   33   95:getstatic       #617 <Field bg bg.e>
	//   34   98:invokespecial   #160 <Method void b(bg)>
			return;
	//   35  101:return          
		}
	}

	final void a()
	{
		Object obj;
		obj = ((Object) (r.d()));
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field PayPalService r>
	//    2    4:invokevirtual   #620 <Method PayPalConfiguration PayPalService.d()>
	//    3    7:astore_1        
		if(fa.a)
	//*   4    8:getstatic       #622 <Field boolean fa.a>
	//*   5   11:ifeq            47
		{
			p.d.setGravity(5);
	//    6   14:aload_0         
	//    7   15:getfield        #294 <Field fk p>
	//    8   18:getfield        #361 <Field EditText fk.d>
	//    9   21:iconst_5        
	//   10   22:invokevirtual   #625 <Method void EditText.setGravity(int)>
			p.b.setGravity(5);
	//   11   25:aload_0         
	//   12   26:getfield        #294 <Field fk p>
	//   13   29:getfield        #359 <Field EditText fk.b>
	//   14   32:iconst_5        
	//   15   33:invokevirtual   #625 <Method void EditText.setGravity(int)>
			p.l.setGravity(5);
	//   16   36:aload_0         
	//   17   37:getfield        #294 <Field fk p>
	//   18   40:getfield        #316 <Field EditText fk.l>
	//   19   43:iconst_5        
	//   20   44:invokevirtual   #625 <Method void EditText.setGravity(int)>
		}
		if(!dr.f(Locale.getDefault().getCountry().toLowerCase(Locale.US)) || !r.c().h)
	//*  21   47:invokestatic    #631 <Method Locale Locale.getDefault()>
	//*  22   50:invokevirtual   #634 <Method String Locale.getCountry()>
	//*  23   53:getstatic       #638 <Field Locale Locale.US>
	//*  24   56:invokevirtual   #642 <Method String String.toLowerCase(Locale)>
	//*  25   59:invokestatic    #644 <Method boolean dr.f(String)>
	//*  26   62:ifeq            78
	//*  27   65:aload_0         
	//*  28   66:getfield        #104 <Field PayPalService r>
	//*  29   69:invokevirtual   #393 <Method ck PayPalService.c()>
	//*  30   72:getfield        #646 <Field boolean ck.h>
	//*  31   75:ifne            89
			p.j.setVisibility(4);
	//   32   78:aload_0         
	//   33   79:getfield        #294 <Field fk p>
	//   34   82:getfield        #592 <Field TextView fk.j>
	//   35   85:iconst_4        
	//   36   86:invokevirtual   #496 <Method void TextView.setVisibility(int)>
		if(m)
	//*  37   89:aload_0         
	//*  38   90:getfield        #648 <Field boolean m>
	//*  39   93:ifeq            170
		{
			m = false;
	//   40   96:aload_0         
	//   41   97:iconst_0        
	//   42   98:putfield        #648 <Field boolean m>
			c = ((PayPalConfiguration) (obj)).c();
	//   43  101:aload_0         
	//   44  102:aload_1         
	//   45  103:invokevirtual   #652 <Method String PayPalConfiguration.c()>
	//   46  106:putfield        #94  <Field String c>
			String s1 = ((PayPalConfiguration) (obj)).d();
	//   47  109:aload_1         
	//   48  110:invokevirtual   #654 <Method String PayPalConfiguration.d()>
	//   49  113:astore_2        
			if(s1 != null)
	//*  50  114:aload_2         
	//*  51  115:ifnull          123
				e = s1;
	//   52  118:aload_0         
	//   53  119:aload_2         
	//   54  120:putfield        #72  <Field String e>
			s1 = ((PayPalConfiguration) (obj)).e();
	//   55  123:aload_1         
	//   56  124:invokevirtual   #655 <Method String PayPalConfiguration.e()>
	//   57  127:astore_2        
			if(s1 != null)
	//*  58  128:aload_2         
	//*  59  129:ifnull          137
				f = s1;
	//   60  132:aload_0         
	//   61  133:aload_2         
	//   62  134:putfield        #68  <Field String f>
			if(((PayPalConfiguration) (obj)).f() && !at.c(((PayPalConfiguration) (obj)).b()))
	//*  63  137:aload_1         
	//*  64  138:invokevirtual   #657 <Method boolean PayPalConfiguration.f()>
	//*  65  141:ifeq            170
	//*  66  144:aload_1         
	//*  67  145:invokevirtual   #658 <Method String PayPalConfiguration.b()>
	//*  68  148:invokestatic    #661 <Method boolean at.c(String)>
	//*  69  151:ifne            170
			{
				d = ((PayPalConfiguration) (obj)).g();
	//   70  154:aload_0         
	//   71  155:aload_1         
	//   72  156:invokevirtual   #663 <Method String PayPalConfiguration.g()>
	//   73  159:putfield        #96  <Field String d>
				g = ((PayPalConfiguration) (obj)).h();
	//   74  162:aload_0         
	//   75  163:aload_1         
	//   76  164:invokevirtual   #665 <Method String PayPalConfiguration.h()>
	//   77  167:putfield        #87  <Field String g>
			}
		}
		if(getIntent().getBooleanExtra("com.paypal.android.sdk.payments.forceLogin", false) && !n)
	//*  78  170:aload_0         
	//*  79  171:invokevirtual   #386 <Method Intent getIntent()>
	//*  80  174:ldc1            #131 <String "com.paypal.android.sdk.payments.forceLogin">
	//*  81  176:iconst_0        
	//*  82  177:invokevirtual   #390 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  83  180:ifeq            202
	//*  84  183:aload_0         
	//*  85  184:getfield        #667 <Field boolean n>
	//*  86  187:ifne            202
		{
			n = true;
	//   87  190:aload_0         
	//   88  191:iconst_1        
	//   89  192:putfield        #667 <Field boolean n>
			r.h();
	//   90  195:aload_0         
	//   91  196:getfield        #104 <Field PayPalService r>
	//   92  199:invokevirtual   #668 <Method void PayPalService.h()>
		}
		if(r.j())
			break MISSING_BLOCK_LABEL_384;
	//   93  202:aload_0         
	//   94  203:getfield        #104 <Field PayPalService r>
	//   95  206:invokevirtual   #670 <Method boolean PayPalService.j()>
	//   96  209:ifne            384
		if(!k)
	//*  97  212:aload_0         
	//*  98  213:getfield        #672 <Field boolean k>
	//*  99  216:ifne            241
		{
			k = true;
	//  100  219:aload_0         
	//  101  220:iconst_1        
	//  102  221:putfield        #672 <Field boolean k>
			r.a(ed.k, Boolean.valueOf(l));
	//  103  224:aload_0         
	//  104  225:getfield        #104 <Field PayPalService r>
	//  105  228:getstatic       #674 <Field ed ed.k>
	//  106  231:aload_0         
	//  107  232:getfield        #162 <Field boolean l>
	//  108  235:invokestatic    #259 <Method Boolean Boolean.valueOf(boolean)>
	//  109  238:invokevirtual   #262 <Method void PayPalService.a(ed, Boolean)>
		}
		if(b != null)
			break MISSING_BLOCK_LABEL_379;
	//  110  241:aload_0         
	//  111  242:getfield        #146 <Field bg b>
	//  112  245:ifnonnull       379
		obj = ((Object) ((dm)getIntent().getParcelableExtra("com.paypal.android.sdk.payments.persistedLogin")));
	//  113  248:aload_0         
	//  114  249:invokevirtual   #386 <Method Intent getIntent()>
	//  115  252:ldc1            #120 <String "com.paypal.android.sdk.payments.persistedLogin">
	//  116  254:invokevirtual   #678 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//  117  257:checkcast       #680 <Class dm>
	//  118  260:astore_1        
		if(obj == null) goto _L2; else goto _L1
	//  119  261:aload_1         
	//  120  262:ifnull          370
_L1:
		l = true;
	//  121  265:aload_0         
	//  122  266:iconst_1        
	//  123  267:putfield        #162 <Field boolean l>
		if(TextUtils.isEmpty(((CharSequence) (c))) && !TextUtils.isEmpty(((CharSequence) (((dm) (obj)).b()))))
	//* 124  270:aload_0         
	//* 125  271:getfield        #94  <Field String c>
	//* 126  274:invokestatic    #685 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 127  277:ifeq            298
	//* 128  280:aload_1         
	//* 129  281:invokevirtual   #686 <Method String dm.b()>
	//* 130  284:invokestatic    #685 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 131  287:ifne            298
			c = ((dm) (obj)).b();
	//  132  290:aload_0         
	//  133  291:aload_1         
	//  134  292:invokevirtual   #686 <Method String dm.b()>
	//  135  295:putfield        #94  <Field String c>
		if(e == null && ((dm) (obj)).a() != null)
	//* 136  298:aload_0         
	//* 137  299:getfield        #72  <Field String e>
	//* 138  302:ifnonnull       326
	//* 139  305:aload_1         
	//* 140  306:invokevirtual   #688 <Method ev dm.a()>
	//* 141  309:ifnull          326
			e = ((dm) (obj)).a().a(((com.paypal.android.sdk.ds) (ci.a())));
	//  142  312:aload_0         
	//  143  313:aload_1         
	//  144  314:invokevirtual   #688 <Method ev dm.a()>
	//  145  317:invokestatic    #66  <Method ci ci.a()>
	//  146  320:invokevirtual   #691 <Method String ev.a(com.paypal.android.sdk.ds)>
	//  147  323:putfield        #72  <Field String e>
		aa.b[((dm) (obj)).c().ordinal()];
	//  148  326:getstatic       #693 <Field int[] aa.b>
	//  149  329:aload_1         
	//  150  330:invokevirtual   #696 <Method cr dm.c()>
	//  151  333:invokevirtual   #699 <Method int cr.ordinal()>
	//  152  336:iaload          
		JVM INSTR tableswitch 1 2: default 360
	//	               1 370
	//	               2 363;
	//  153  337:tableswitch     1 2: default 360
	//	               1 370
	//	               2 363
		   goto _L3 _L2 _L4
_L3:
		break MISSING_BLOCK_LABEL_379;
	//  154  360:goto            379
_L4:
		obj = ((Object) (bg.b));
	//  155  363:getstatic       #61  <Field bg bg.b>
	//  156  366:astore_1        
		break; /* Loop/switch isn't completed */
	//  157  367:goto            374
_L2:
		obj = ((Object) (bg.a));
	//  158  370:getstatic       #92  <Field bg bg.a>
	//  159  373:astore_1        
		b(((bg) (obj)));
	//  160  374:aload_0         
	//  161  375:aload_1         
	//  162  376:invokespecial   #160 <Method void b(bg)>
		f();
	//  163  379:aload_0         
	//  164  380:invokespecial   #383 <Method void f()>
		return;
	//  165  383:return          
		e();
	//  166  384:aload_0         
	//  167  385:invokespecial   #381 <Method void e()>
		return;
	//  168  388:return          
	}

	public final void onBackPressed()
	{
		r.a(ed.p, Boolean.valueOf(l));
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field PayPalService r>
	//    2    4:getstatic       #702 <Field ed ed.p>
	//    3    7:aload_0         
	//    4    8:getfield        #162 <Field boolean l>
	//    5   11:invokestatic    #259 <Method Boolean Boolean.valueOf(boolean)>
	//    6   14:invokevirtual   #262 <Method void PayPalService.a(ed, Boolean)>
		super.onBackPressed();
	//    7   17:aload_0         
	//    8   18:invokespecial   #704 <Method void Activity.onBackPressed()>
	//    9   21:return          
	}

	protected final void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #708 <Method void Activity.onCreate(Bundle)>
		Object obj = ((Object) (new StringBuilder()));
	//    3    5:new             #266 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #465 <Method void StringBuilder()>
	//    6   12:astore_2        
		((StringBuilder) (obj)).append(((Object)this).getClass().getSimpleName());
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #712 <Method Class Object.getClass()>
	//   10   18:invokevirtual   #41  <Method String Class.getSimpleName()>
	//   11   21:invokevirtual   #470 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		((StringBuilder) (obj)).append(".onCreate");
	//   13   25:aload_2         
	//   14   26:ldc2            #714 <String ".onCreate">
	//   15   29:invokevirtual   #470 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		j = getIntent().getExtras().getString("com.paypal.android.sdk.payments.requestedScopes");
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:invokevirtual   #386 <Method Intent getIntent()>
	//   20   38:invokevirtual   #718 <Method Bundle Intent.getExtras()>
	//   21   41:ldc1            #133 <String "com.paypal.android.sdk.payments.requestedScopes">
	//   22   43:invokevirtual   #723 <Method String Bundle.getString(String)>
	//   23   46:putfield        #168 <Field String j>
		q = bindService(cd.b(((Activity) (this))), s, 1);
	//   24   49:aload_0         
	//   25   50:aload_0         
	//   26   51:aload_0         
	//   27   52:invokestatic    #726 <Method Intent cd.b(Activity)>
	//   28   55:aload_0         
	//   29   56:getfield        #50  <Field ServiceConnection s>
	//   30   59:iconst_1        
	//   31   60:invokevirtual   #730 <Method boolean bindService(Intent, ServiceConnection, int)>
	//   32   63:putfield        #732 <Field boolean q>
		((Activity)this).setTheme(0x103006e);
	//   33   66:aload_0         
	//   34   67:ldc2            #733 <Int 0x103006e>
	//   35   70:invokevirtual   #736 <Method void Activity.setTheme(int)>
		((Activity)this).requestWindowFeature(8);
	//   36   73:aload_0         
	//   37   74:bipush          8
	//   38   76:invokevirtual   #740 <Method boolean Activity.requestWindowFeature(int)>
	//   39   79:pop             
		p = new fk(((android.content.Context) (this)));
	//   40   80:aload_0         
	//   41   81:new             #296 <Class fk>
	//   42   84:dup             
	//   43   85:aload_0         
	//   44   86:invokespecial   #741 <Method void fk(android.content.Context)>
	//   45   89:putfield        #294 <Field fk p>
		setContentView(((View) (p.a)));
	//   46   92:aload_0         
	//   47   93:aload_0         
	//   48   94:getfield        #294 <Field fk p>
	//   49   97:getfield        #744 <Field android.view.ViewGroup fk.a>
	//   50  100:invokevirtual   #748 <Method void setContentView(View)>
		p.f.setText(((CharSequence) (fa.a(fc.aO))));
	//   51  103:aload_0         
	//   52  104:getfield        #294 <Field fk p>
	//   53  107:getfield        #588 <Field TextView fk.f>
	//   54  110:getstatic       #751 <Field fc fc.aO>
	//   55  113:invokestatic    #206 <Method String fa.a(fc)>
	//   56  116:invokevirtual   #596 <Method void TextView.setText(CharSequence)>
		p.g.setText(((CharSequence) (fa.a(fc.aj))));
	//   57  119:aload_0         
	//   58  120:getfield        #294 <Field fk p>
	//   59  123:getfield        #590 <Field TextView fk.g>
	//   60  126:getstatic       #754 <Field fc fc.aj>
	//   61  129:invokestatic    #206 <Method String fa.a(fc)>
	//   62  132:invokevirtual   #596 <Method void TextView.setText(CharSequence)>
		p.i.setText(((CharSequence) (fa.a(fc.ap))));
	//   63  135:aload_0         
	//   64  136:getfield        #294 <Field fk p>
	//   65  139:getfield        #756 <Field TextView fk.i>
	//   66  142:getstatic       #759 <Field fc fc.ap>
	//   67  145:invokestatic    #206 <Method String fa.a(fc)>
	//   68  148:invokevirtual   #596 <Method void TextView.setText(CharSequence)>
		p.i.setHint(((CharSequence) (fa.a(fc.ap))));
	//   69  151:aload_0         
	//   70  152:getfield        #294 <Field fk p>
	//   71  155:getfield        #756 <Field TextView fk.i>
	//   72  158:getstatic       #759 <Field fc fc.ap>
	//   73  161:invokestatic    #206 <Method String fa.a(fc)>
	//   74  164:invokevirtual   #760 <Method void TextView.setHint(CharSequence)>
		p.k.setText(((CharSequence) (fa.a(fc.aU))));
	//   75  167:aload_0         
	//   76  168:getfield        #294 <Field fk p>
	//   77  171:getfield        #492 <Field TextView fk.k>
	//   78  174:getstatic       #763 <Field fc fc.aU>
	//   79  177:invokestatic    #206 <Method String fa.a(fc)>
	//   80  180:invokevirtual   #596 <Method void TextView.setText(CharSequence)>
		p.l.setHint(((CharSequence) (fa.a(fc.aW))));
	//   81  183:aload_0         
	//   82  184:getfield        #294 <Field fk p>
	//   83  187:getfield        #316 <Field EditText fk.l>
	//   84  190:getstatic       #766 <Field fc fc.aW>
	//   85  193:invokestatic    #206 <Method String fa.a(fc)>
	//   86  196:invokevirtual   #570 <Method void EditText.setHint(CharSequence)>
		p.n.setText(((CharSequence) (fa.a(fc.ap))));
	//   87  199:aload_0         
	//   88  200:getfield        #294 <Field fk p>
	//   89  203:getfield        #768 <Field TextView fk.n>
	//   90  206:getstatic       #759 <Field fc fc.ap>
	//   91  209:invokestatic    #206 <Method String fa.a(fc)>
	//   92  212:invokevirtual   #596 <Method void TextView.setText(CharSequence)>
		p.o.b(fa.a(fc.aX));
	//   93  215:aload_0         
	//   94  216:getfield        #294 <Field fk p>
	//   95  219:getfield        #299 <Field fp fk.o>
	//   96  222:getstatic       #771 <Field fc fc.aX>
	//   97  225:invokestatic    #206 <Method String fa.a(fc)>
	//   98  228:invokevirtual   #773 <Method void fp.b(String)>
		obj = ((Object) (new l(this)));
	//   99  231:new             #775 <Class l>
	//  100  234:dup             
	//  101  235:aload_0         
	//  102  236:invokespecial   #776 <Method void l(LoginActivity)>
	//  103  239:astore_2        
		p.b.addTextChangedListener(((android.text.TextWatcher) (obj)));
	//  104  240:aload_0         
	//  105  241:getfield        #294 <Field fk p>
	//  106  244:getfield        #359 <Field EditText fk.b>
	//  107  247:aload_2         
	//  108  248:invokevirtual   #780 <Method void EditText.addTextChangedListener(android.text.TextWatcher)>
		p.d.addTextChangedListener(((android.text.TextWatcher) (obj)));
	//  109  251:aload_0         
	//  110  252:getfield        #294 <Field fk p>
	//  111  255:getfield        #361 <Field EditText fk.d>
	//  112  258:aload_2         
	//  113  259:invokevirtual   #780 <Method void EditText.addTextChangedListener(android.text.TextWatcher)>
		p.h.setOnClickListener(((android.view.View.OnClickListener) (new y(this))));
	//  114  262:aload_0         
	//  115  263:getfield        #294 <Field fk p>
	//  116  266:getfield        #367 <Field LinearLayout fk.h>
	//  117  269:new             #782 <Class y>
	//  118  272:dup             
	//  119  273:aload_0         
	//  120  274:invokespecial   #783 <Method void y(LoginActivity)>
	//  121  277:invokevirtual   #784 <Method void LinearLayout.setOnClickListener(android.view.View$OnClickListener)>
		p.g.setOnClickListener(((android.view.View.OnClickListener) (new ab(this))));
	//  122  280:aload_0         
	//  123  281:getfield        #294 <Field fk p>
	//  124  284:getfield        #590 <Field TextView fk.g>
	//  125  287:new             #786 <Class ab>
	//  126  290:dup             
	//  127  291:aload_0         
	//  128  292:invokespecial   #787 <Method void ab(LoginActivity)>
	//  129  295:invokevirtual   #788 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		p.j.setOnClickListener(((android.view.View.OnClickListener) (new ac(this))));
	//  130  298:aload_0         
	//  131  299:getfield        #294 <Field fk p>
	//  132  302:getfield        #592 <Field TextView fk.j>
	//  133  305:new             #790 <Class ac>
	//  134  308:dup             
	//  135  309:aload_0         
	//  136  310:invokespecial   #791 <Method void ac(LoginActivity)>
	//  137  313:invokevirtual   #788 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		p.f.setOnClickListener(((android.view.View.OnClickListener) (new ad(this))));
	//  138  316:aload_0         
	//  139  317:getfield        #294 <Field fk p>
	//  140  320:getfield        #588 <Field TextView fk.f>
	//  141  323:new             #793 <Class ad>
	//  142  326:dup             
	//  143  327:aload_0         
	//  144  328:invokespecial   #794 <Method void ad(LoginActivity)>
	//  145  331:invokevirtual   #788 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		p.o.c.setOnClickListener(((android.view.View.OnClickListener) (new ae(this))));
	//  146  334:aload_0         
	//  147  335:getfield        #294 <Field fk p>
	//  148  338:getfield        #299 <Field fp fk.o>
	//  149  341:getfield        #304 <Field Button fp.c>
	//  150  344:new             #796 <Class ae>
	//  151  347:dup             
	//  152  348:aload_0         
	//  153  349:invokespecial   #797 <Method void ae(LoginActivity)>
	//  154  352:invokevirtual   #798 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		p.l.addTextChangedListener(((android.text.TextWatcher) (new af(this))));
	//  155  355:aload_0         
	//  156  356:getfield        #294 <Field fk p>
	//  157  359:getfield        #316 <Field EditText fk.l>
	//  158  362:new             #800 <Class af>
	//  159  365:dup             
	//  160  366:aload_0         
	//  161  367:invokespecial   #801 <Method void af(LoginActivity)>
	//  162  370:invokevirtual   #780 <Method void EditText.addTextChangedListener(android.text.TextWatcher)>
		p.m.setOnClickListener(((android.view.View.OnClickListener) (new ag(this))));
	//  163  373:aload_0         
	//  164  374:getfield        #294 <Field fk p>
	//  165  377:getfield        #345 <Field LinearLayout fk.m>
	//  166  380:new             #803 <Class ag>
	//  167  383:dup             
	//  168  384:aload_0         
	//  169  385:invokespecial   #804 <Method void ag(LoginActivity)>
	//  170  388:invokevirtual   #784 <Method void LinearLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(bundle == null)
	//* 171  391:aload_1         
	//* 172  392:ifnonnull       408
		{
			k = false;
	//  173  395:aload_0         
	//  174  396:iconst_0        
	//  175  397:putfield        #672 <Field boolean k>
			m = true;
	//  176  400:aload_0         
	//  177  401:iconst_1        
	//  178  402:putfield        #648 <Field boolean m>
		} else
	//* 179  405:goto            562
		{
			m = false;
	//  180  408:aload_0         
	//  181  409:iconst_0        
	//  182  410:putfield        #648 <Field boolean m>
			k = bundle.getBoolean("PP_PageTrackingSent");
	//  183  413:aload_0         
	//  184  414:aload_1         
	//  185  415:ldc2            #806 <String "PP_PageTrackingSent">
	//  186  418:invokevirtual   #809 <Method boolean Bundle.getBoolean(String)>
	//  187  421:putfield        #672 <Field boolean k>
			b = (bg)bundle.getParcelable("PP_LoginType");
	//  188  424:aload_0         
	//  189  425:aload_1         
	//  190  426:ldc2            #811 <String "PP_LoginType">
	//  191  429:invokevirtual   #814 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//  192  432:checkcast       #59  <Class bg>
	//  193  435:putfield        #146 <Field bg b>
			c = bundle.getString("PP_SavedEmail");
	//  194  438:aload_0         
	//  195  439:aload_1         
	//  196  440:ldc2            #816 <String "PP_SavedEmail">
	//  197  443:invokevirtual   #723 <Method String Bundle.getString(String)>
	//  198  446:putfield        #94  <Field String c>
			e = bundle.getString("PP_SavedPhone");
	//  199  449:aload_0         
	//  200  450:aload_1         
	//  201  451:ldc2            #818 <String "PP_SavedPhone">
	//  202  454:invokevirtual   #723 <Method String Bundle.getString(String)>
	//  203  457:putfield        #72  <Field String e>
			f = bundle.getString("PP_savedPhoneCountryCode");
	//  204  460:aload_0         
	//  205  461:aload_1         
	//  206  462:ldc2            #820 <String "PP_savedPhoneCountryCode">
	//  207  465:invokevirtual   #723 <Method String Bundle.getString(String)>
	//  208  468:putfield        #68  <Field String f>
			d = bundle.getString("PP_SavedPassword");
	//  209  471:aload_0         
	//  210  472:aload_1         
	//  211  473:ldc2            #822 <String "PP_SavedPassword">
	//  212  476:invokevirtual   #723 <Method String Bundle.getString(String)>
	//  213  479:putfield        #96  <Field String d>
			g = bundle.getString("PP_SavedPIN");
	//  214  482:aload_0         
	//  215  483:aload_1         
	//  216  484:ldc2            #824 <String "PP_SavedPIN">
	//  217  487:invokevirtual   #723 <Method String Bundle.getString(String)>
	//  218  490:putfield        #87  <Field String g>
			l = bundle.getBoolean("PP_IsReturningUser");
	//  219  493:aload_0         
	//  220  494:aload_1         
	//  221  495:ldc2            #826 <String "PP_IsReturningUser">
	//  222  498:invokevirtual   #809 <Method boolean Bundle.getBoolean(String)>
	//  223  501:putfield        #162 <Field boolean l>
			n = bundle.getBoolean("PP_IsClearedLogin");
	//  224  504:aload_0         
	//  225  505:aload_1         
	//  226  506:ldc2            #828 <String "PP_IsClearedLogin">
	//  227  509:invokevirtual   #809 <Method boolean Bundle.getBoolean(String)>
	//  228  512:putfield        #667 <Field boolean n>
			j = bundle.getString("PP_RequestedScopes");
	//  229  515:aload_0         
	//  230  516:aload_1         
	//  231  517:ldc2            #830 <String "PP_RequestedScopes">
	//  232  520:invokevirtual   #723 <Method String Bundle.getString(String)>
	//  233  523:putfield        #168 <Field String j>
			h = bundle.getString("PP_SavedOTP");
	//  234  526:aload_0         
	//  235  527:aload_1         
	//  236  528:ldc2            #832 <String "PP_SavedOTP">
	//  237  531:invokevirtual   #723 <Method String Bundle.getString(String)>
	//  238  534:putfield        #219 <Field String h>
			i = (ep)bundle.getParcelable("PP_OriginalLoginData");
	//  239  537:aload_0         
	//  240  538:aload_1         
	//  241  539:ldc2            #834 <String "PP_OriginalLoginData">
	//  242  542:invokevirtual   #814 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//  243  545:checkcast       #85  <Class ep>
	//  244  548:putfield        #101 <Field ep i>
			o = bundle.getInt("PP_TwoFaSelectedPhoneNumberIndex");
	//  245  551:aload_0         
	//  246  552:aload_1         
	//  247  553:ldc2            #836 <String "PP_TwoFaSelectedPhoneNumberIndex">
	//  248  556:invokevirtual   #840 <Method int Bundle.getInt(String)>
	//  249  559:putfield        #54  <Field int o>
		}
		p.l.setText(((CharSequence) (h)));
	//  250  562:aload_0         
	//  251  563:getfield        #294 <Field fk p>
	//  252  566:getfield        #316 <Field EditText fk.l>
	//  253  569:aload_0         
	//  254  570:getfield        #219 <Field String h>
	//  255  573:invokevirtual   #434 <Method void EditText.setText(CharSequence)>
	//  256  576:return          
	}

	protected final Dialog onCreateDialog(int i1, Bundle bundle)
	{
		if(i1 != 10)
	//*   0    0:iload_1         
	//*   1    1:bipush          10
	//*   2    3:icmpeq          173
			switch(i1)
	//*   3    6:iload_1         
			{
	//*   4    7:tableswitch     1 5: default 40
	//	               1 156
	//	               2 139
	//	               3 122
	//	               4 105
	//	               5 88
			default:
				switch(i1)
	//*   5   40:iload_1         
				{
	//*   6   41:tableswitch     20 21: default 64
	//	               20 77
	//	               21 66
				default:
					return null;
	//    7   64:aconst_null     
	//    8   65:areturn         

				case 21: // '\025'
					return cd.a(((android.content.Context) (this)), fc.aV, fc.bq);
	//    9   66:aload_0         
	//   10   67:getstatic       #845 <Field fc fc.aV>
	//   11   70:getstatic       #848 <Field fc fc.bq>
	//   12   73:invokestatic    #851 <Method Dialog cd.a(android.content.Context, fc, fc)>
	//   13   76:areturn         

				case 20: // '\024'
					return cd.a(((android.content.Context) (this)), fc.c, fc.bq);
	//   14   77:aload_0         
	//   15   78:getstatic       #853 <Field fc fc.c>
	//   16   81:getstatic       #848 <Field fc fc.bq>
	//   17   84:invokestatic    #851 <Method Dialog cd.a(android.content.Context, fc, fc)>
	//   18   87:areturn         
				}

			case 5: // '\005'
				return cd.a(((Activity) (this)), fc.aM, bundle, ((android.content.DialogInterface.OnClickListener) (new x(this))));
	//   19   88:aload_0         
	//   20   89:getstatic       #856 <Field fc fc.aM>
	//   21   92:aload_2         
	//   22   93:new             #858 <Class x>
	//   23   96:dup             
	//   24   97:aload_0         
	//   25   98:invokespecial   #859 <Method void x(LoginActivity)>
	//   26  101:invokestatic    #862 <Method Dialog cd.a(Activity, fc, Bundle, android.content.DialogInterface$OnClickListener)>
	//   27  104:areturn         

			case 4: // '\004'
				return cd.a(((Activity) (this)), fc.bn, bundle, ((android.content.DialogInterface.OnClickListener) (new w(this))));
	//   28  105:aload_0         
	//   29  106:getstatic       #865 <Field fc fc.bn>
	//   30  109:aload_2         
	//   31  110:new             #867 <Class w>
	//   32  113:dup             
	//   33  114:aload_0         
	//   34  115:invokespecial   #868 <Method void w(LoginActivity)>
	//   35  118:invokestatic    #862 <Method Dialog cd.a(Activity, fc, Bundle, android.content.DialogInterface$OnClickListener)>
	//   36  121:areturn         

			case 3: // '\003'
				return cd.a(((Activity) (this)), fc.bn, bundle, ((android.content.DialogInterface.OnClickListener) (new v(this))));
	//   37  122:aload_0         
	//   38  123:getstatic       #865 <Field fc fc.bn>
	//   39  126:aload_2         
	//   40  127:new             #870 <Class v>
	//   41  130:dup             
	//   42  131:aload_0         
	//   43  132:invokespecial   #871 <Method void v(LoginActivity)>
	//   44  135:invokestatic    #862 <Method Dialog cd.a(Activity, fc, Bundle, android.content.DialogInterface$OnClickListener)>
	//   45  138:areturn         

			case 2: // '\002'
				return cd.a(((Activity) (this)), fc.bh, bundle, ((android.content.DialogInterface.OnClickListener) (new u(this))));
	//   46  139:aload_0         
	//   47  140:getstatic       #874 <Field fc fc.bh>
	//   48  143:aload_2         
	//   49  144:new             #876 <Class u>
	//   50  147:dup             
	//   51  148:aload_0         
	//   52  149:invokespecial   #877 <Method void u(LoginActivity)>
	//   53  152:invokestatic    #862 <Method Dialog cd.a(Activity, fc, Bundle, android.content.DialogInterface$OnClickListener)>
	//   54  155:areturn         

			case 1: // '\001'
				return cd.a(((Activity) (this)), fc.bn, bundle, ((android.content.DialogInterface.OnClickListener) (new t(this))));
	//   55  156:aload_0         
	//   56  157:getstatic       #865 <Field fc fc.bn>
	//   57  160:aload_2         
	//   58  161:new             #879 <Class t>
	//   59  164:dup             
	//   60  165:aload_0         
	//   61  166:invokespecial   #880 <Method void t(LoginActivity)>
	//   62  169:invokestatic    #862 <Method Dialog cd.a(Activity, fc, Bundle, android.content.DialogInterface$OnClickListener)>
	//   63  172:areturn         
			}
		else
			return cd.a(((Activity) (this)), fc.bn, bundle, ((android.content.DialogInterface.OnClickListener) (new z(this))));
	//   64  173:aload_0         
	//   65  174:getstatic       #865 <Field fc fc.bn>
	//   66  177:aload_2         
	//   67  178:new             #882 <Class z>
	//   68  181:dup             
	//   69  182:aload_0         
	//   70  183:invokespecial   #883 <Method void z(LoginActivity)>
	//   71  186:invokestatic    #862 <Method Dialog cd.a(Activity, fc, Bundle, android.content.DialogInterface$OnClickListener)>
	//   72  189:areturn         
	}

	protected final void onDestroy()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #266 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #465 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append(((Object)this).getClass().getSimpleName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #712 <Method Class Object.getClass()>
	//    7   13:invokevirtual   #41  <Method String Class.getSimpleName()>
	//    8   16:invokevirtual   #470 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		((StringBuilder) (obj)).append(".onDestroy");
	//   10   20:aload_1         
	//   11   21:ldc2            #886 <String ".onDestroy">
	//   12   24:invokevirtual   #470 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		obj = ((Object) (r));
	//   14   28:aload_0         
	//   15   29:getfield        #104 <Field PayPalService r>
	//   16   32:astore_1        
		if(obj != null)
	//*  17   33:aload_1         
	//*  18   34:ifnull          41
			((PayPalService) (obj)).n();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #887 <Method void PayPalService.n()>
		if(q)
	//*  21   41:aload_0         
	//*  22   42:getfield        #732 <Field boolean q>
	//*  23   45:ifeq            61
		{
			unbindService(s);
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:getfield        #50  <Field ServiceConnection s>
	//   27   53:invokevirtual   #891 <Method void unbindService(ServiceConnection)>
			q = false;
	//   28   56:aload_0         
	//   29   57:iconst_0        
	//   30   58:putfield        #732 <Field boolean q>
		}
		super.onDestroy();
	//   31   61:aload_0         
	//   32   62:invokespecial   #893 <Method void Activity.onDestroy()>
	//   33   65:return          
	}

	protected final void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #896 <Method void Activity.onResume()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #266 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #465 <Method void StringBuilder()>
	//    5   11:astore_1        
		stringbuilder.append(((Object)this).getClass().getSimpleName());
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #712 <Method Class Object.getClass()>
	//    9   17:invokevirtual   #41  <Method String Class.getSimpleName()>
	//   10   20:invokevirtual   #470 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(".onResume");
	//   12   24:aload_1         
	//   13   25:ldc2            #898 <String ".onResume">
	//   14   28:invokevirtual   #470 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		if(r != null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #104 <Field PayPalService r>
	//*  18   36:ifnull          43
			f();
	//   19   39:aload_0         
	//   20   40:invokespecial   #383 <Method void f()>
	//   21   43:return          
	}

	protected final void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #901 <Method void Activity.onSaveInstanceState(Bundle)>
		g();
	//    3    5:aload_0         
	//    4    6:invokespecial   #57  <Method void g()>
		bundle.putParcelable("PP_LoginType", ((android.os.Parcelable) (b)));
	//    5    9:aload_1         
	//    6   10:ldc2            #811 <String "PP_LoginType">
	//    7   13:aload_0         
	//    8   14:getfield        #146 <Field bg b>
	//    9   17:invokevirtual   #905 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		bundle.putString("PP_SavedEmail", c);
	//   10   20:aload_1         
	//   11   21:ldc2            #816 <String "PP_SavedEmail">
	//   12   24:aload_0         
	//   13   25:getfield        #94  <Field String c>
	//   14   28:invokevirtual   #908 <Method void Bundle.putString(String, String)>
		bundle.putString("PP_SavedPhone", e);
	//   15   31:aload_1         
	//   16   32:ldc2            #818 <String "PP_SavedPhone">
	//   17   35:aload_0         
	//   18   36:getfield        #72  <Field String e>
	//   19   39:invokevirtual   #908 <Method void Bundle.putString(String, String)>
		bundle.putString("PP_savedPhoneCountryCode", f);
	//   20   42:aload_1         
	//   21   43:ldc2            #820 <String "PP_savedPhoneCountryCode">
	//   22   46:aload_0         
	//   23   47:getfield        #68  <Field String f>
	//   24   50:invokevirtual   #908 <Method void Bundle.putString(String, String)>
		bundle.putString("PP_SavedPassword", d);
	//   25   53:aload_1         
	//   26   54:ldc2            #822 <String "PP_SavedPassword">
	//   27   57:aload_0         
	//   28   58:getfield        #96  <Field String d>
	//   29   61:invokevirtual   #908 <Method void Bundle.putString(String, String)>
		bundle.putString("PP_SavedPIN", g);
	//   30   64:aload_1         
	//   31   65:ldc2            #824 <String "PP_SavedPIN">
	//   32   68:aload_0         
	//   33   69:getfield        #87  <Field String g>
	//   34   72:invokevirtual   #908 <Method void Bundle.putString(String, String)>
		bundle.putBoolean("PP_IsReturningUser", l);
	//   35   75:aload_1         
	//   36   76:ldc2            #826 <String "PP_IsReturningUser">
	//   37   79:aload_0         
	//   38   80:getfield        #162 <Field boolean l>
	//   39   83:invokevirtual   #912 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBoolean("PP_PageTrackingSent", k);
	//   40   86:aload_1         
	//   41   87:ldc2            #806 <String "PP_PageTrackingSent">
	//   42   90:aload_0         
	//   43   91:getfield        #672 <Field boolean k>
	//   44   94:invokevirtual   #912 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBoolean("PP_IsClearedLogin", n);
	//   45   97:aload_1         
	//   46   98:ldc2            #828 <String "PP_IsClearedLogin">
	//   47  101:aload_0         
	//   48  102:getfield        #667 <Field boolean n>
	//   49  105:invokevirtual   #912 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putString("PP_RequestedScopes", j);
	//   50  108:aload_1         
	//   51  109:ldc2            #830 <String "PP_RequestedScopes">
	//   52  112:aload_0         
	//   53  113:getfield        #168 <Field String j>
	//   54  116:invokevirtual   #908 <Method void Bundle.putString(String, String)>
		bundle.putString("PP_SavedOTP", h);
	//   55  119:aload_1         
	//   56  120:ldc2            #832 <String "PP_SavedOTP">
	//   57  123:aload_0         
	//   58  124:getfield        #219 <Field String h>
	//   59  127:invokevirtual   #908 <Method void Bundle.putString(String, String)>
		bundle.putParcelable("PP_OriginalLoginData", ((android.os.Parcelable) (i)));
	//   60  130:aload_1         
	//   61  131:ldc2            #834 <String "PP_OriginalLoginData">
	//   62  134:aload_0         
	//   63  135:getfield        #101 <Field ep i>
	//   64  138:invokevirtual   #905 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		bundle.putInt("PP_TwoFaSelectedPhoneNumberIndex", o);
	//   65  141:aload_1         
	//   66  142:ldc2            #836 <String "PP_TwoFaSelectedPhoneNumberIndex">
	//   67  145:aload_0         
	//   68  146:getfield        #54  <Field int o>
	//   69  149:invokevirtual   #916 <Method void Bundle.putInt(String, int)>
	//   70  152:return          
	}

	private final String a = ((Class) (com/paypal/android/sdk/payments/LoginActivity)).getSimpleName();
	private bg b;
	private String c;
	private String d;
	private String e;
	private String f;
	private String g;
	private String h;
	private ep i;
	private String j;
	private boolean k;
	private boolean l;
	private boolean m;
	private boolean n;
	private int o;
	private fk p;
	private boolean q;
	private PayPalService r;
	private final ServiceConnection s = new r(this);
}
