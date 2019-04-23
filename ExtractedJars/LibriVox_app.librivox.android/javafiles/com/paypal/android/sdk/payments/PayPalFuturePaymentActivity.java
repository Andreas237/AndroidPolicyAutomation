// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.paypal.android.sdk.*;
import java.util.*;

// Referenced classes of package com.paypal.android.sdk.payments:
//			am, PayPalService, FuturePaymentConsentActivity, ao, 
//			ay, PayPalAuthorization, LoginActivity, FuturePaymentInfoActivity, 
//			cd, al, bh

public final class PayPalFuturePaymentActivity extends Activity
{

	public PayPalFuturePaymentActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Activity()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class am>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #29  <Method void am(PayPalFuturePaymentActivity)>
	//    7   13:putfield        #31  <Field ServiceConnection e>
	//    8   16:return          
	}

	static PayPalService a(PayPalFuturePaymentActivity paypalfuturepaymentactivity, PayPalService paypalservice)
	{
		paypalfuturepaymentactivity.d = paypalservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field PayPalService d>
		return paypalservice;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static bh a(PayPalFuturePaymentActivity paypalfuturepaymentactivity)
	{
		return paypalfuturepaymentactivity.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method bh c()>
	//    2    4:areturn         
	}

	static String a()
	{
		return a;
	//    0    0:getstatic       #41  <Field String a>
	//    1    3:areturn         
	}

	static Timer a(PayPalFuturePaymentActivity paypalfuturepaymentactivity, Timer timer)
	{
		paypalfuturepaymentactivity.c = timer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field Timer c>
		return timer;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static PayPalService b(PayPalFuturePaymentActivity paypalfuturepaymentactivity)
	{
		return paypalfuturepaymentactivity.d;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PayPalService d>
	//    2    4:areturn         
	}

	private void b()
	{
		FuturePaymentConsentActivity.a(((Activity) (this)), 1, d.d());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #34  <Field PayPalService d>
	//    4    6:invokevirtual   #50  <Method PayPalConfiguration PayPalService.d()>
	//    5    9:invokestatic    #55  <Method void FuturePaymentConsentActivity.a(Activity, int, PayPalConfiguration)>
	//    6   12:return          
	}

	private bh c()
	{
		return ((bh) (new ao(this)));
	//    0    0:new             #57  <Class ao>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #58  <Method void ao(PayPalFuturePaymentActivity)>
	//    4    8:areturn         
	}

	static void c(PayPalFuturePaymentActivity paypalfuturepaymentactivity)
	{
		if(paypalfuturepaymentactivity.d.d() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field PayPalService d>
	//*   2    4:invokevirtual   #50  <Method PayPalConfiguration PayPalService.d()>
	//*   3    7:ifnonnull       29
		{
			Log.e(a, "Service state invalid.  Did you start the PayPalService?");
	//    4   10:getstatic       #41  <Field String a>
	//    5   13:ldc1            #60  <String "Service state invalid.  Did you start the PayPalService?">
	//    6   15:invokestatic    #65  <Method int Log.e(String, String)>
	//    7   18:pop             
			paypalfuturepaymentactivity.setResult(2);
	//    8   19:aload_0         
	//    9   20:iconst_2        
	//   10   21:invokevirtual   #69  <Method void setResult(int)>
			paypalfuturepaymentactivity.finish();
	//   11   24:aload_0         
	//   12   25:invokevirtual   #72  <Method void finish()>
			return;
	//   13   28:return          
		}
		ay ay1 = new ay(paypalfuturepaymentactivity.getIntent(), paypalfuturepaymentactivity.d.d(), false);
	//   14   29:new             #74  <Class ay>
	//   15   32:dup             
	//   16   33:aload_0         
	//   17   34:invokevirtual   #78  <Method Intent getIntent()>
	//   18   37:aload_0         
	//   19   38:getfield        #34  <Field PayPalService d>
	//   20   41:invokevirtual   #50  <Method PayPalConfiguration PayPalService.d()>
	//   21   44:iconst_0        
	//   22   45:invokespecial   #81  <Method void ay(Intent, PayPalConfiguration, boolean)>
	//   23   48:astore_1        
		if(!ay1.c())
	//*  24   49:aload_1         
	//*  25   50:invokevirtual   #84  <Method boolean ay.c()>
	//*  26   53:ifne            75
		{
			Log.e(a, "Service extras invalid.  Please see the docs.");
	//   27   56:getstatic       #41  <Field String a>
	//   28   59:ldc1            #86  <String "Service extras invalid.  Please see the docs.">
	//   29   61:invokestatic    #65  <Method int Log.e(String, String)>
	//   30   64:pop             
			paypalfuturepaymentactivity.setResult(2);
	//   31   65:aload_0         
	//   32   66:iconst_2        
	//   33   67:invokevirtual   #69  <Method void setResult(int)>
			paypalfuturepaymentactivity.finish();
	//   34   70:aload_0         
	//   35   71:invokevirtual   #72  <Method void finish()>
			return;
	//   36   74:return          
		}
		if(!ay1.a())
	//*  37   75:aload_1         
	//*  38   76:invokevirtual   #88  <Method boolean ay.a()>
	//*  39   79:ifne            101
		{
			Log.e(a, "Extras invalid.  Please see the docs.");
	//   40   82:getstatic       #41  <Field String a>
	//   41   85:ldc1            #90  <String "Extras invalid.  Please see the docs.">
	//   42   87:invokestatic    #65  <Method int Log.e(String, String)>
	//   43   90:pop             
			paypalfuturepaymentactivity.setResult(2);
	//   44   91:aload_0         
	//   45   92:iconst_2        
	//   46   93:invokevirtual   #69  <Method void setResult(int)>
			paypalfuturepaymentactivity.finish();
	//   47   96:aload_0         
	//   48   97:invokevirtual   #72  <Method void finish()>
			return;
	//   49  100:return          
		}
		if(paypalfuturepaymentactivity.d.i())
	//*  50  101:aload_0         
	//*  51  102:getfield        #34  <Field PayPalService d>
	//*  52  105:invokevirtual   #93  <Method boolean PayPalService.i()>
	//*  53  108:ifeq            116
		{
			paypalfuturepaymentactivity.b();
	//   54  111:aload_0         
	//   55  112:invokespecial   #95  <Method void b()>
			return;
	//   56  115:return          
		} else
		{
			Calendar calendar = Calendar.getInstance();
	//   57  116:invokestatic    #101 <Method Calendar Calendar.getInstance()>
	//   58  119:astore_1        
			calendar.add(13, 1);
	//   59  120:aload_1         
	//   60  121:bipush          13
	//   61  123:iconst_1        
	//   62  124:invokevirtual   #105 <Method void Calendar.add(int, int)>
			paypalfuturepaymentactivity.b = calendar.getTime();
	//   63  127:aload_0         
	//   64  128:aload_1         
	//   65  129:invokevirtual   #109 <Method Date Calendar.getTime()>
	//   66  132:putfield        #111 <Field Date b>
			paypalfuturepaymentactivity.d.a(paypalfuturepaymentactivity.c(), false);
	//   67  135:aload_0         
	//   68  136:getfield        #34  <Field PayPalService d>
	//   69  139:aload_0         
	//   70  140:invokespecial   #38  <Method bh c()>
	//   71  143:iconst_0        
	//   72  144:invokevirtual   #114 <Method void PayPalService.a(bh, boolean)>
			return;
	//   73  147:return          
		}
	}

	static Date d(PayPalFuturePaymentActivity paypalfuturepaymentactivity)
	{
		return paypalfuturepaymentactivity.b;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Date b>
	//    2    4:areturn         
	}

	static void e(PayPalFuturePaymentActivity paypalfuturepaymentactivity)
	{
		paypalfuturepaymentactivity.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method void b()>
	//    2    4:return          
	}

	static Timer f(PayPalFuturePaymentActivity paypalfuturepaymentactivity)
	{
		return paypalfuturepaymentactivity.c;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Timer c>
	//    2    4:areturn         
	}

	public final void finish()
	{
		super.finish();
	//    0    0:aload_0         
	//    1    1:invokespecial   #117 <Method void Activity.finish()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #119 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #120 <Method void StringBuilder()>
	//    5   11:astore_1        
		stringbuilder.append(a);
	//    6   12:aload_1         
	//    7   13:getstatic       #41  <Field String a>
	//    8   16:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(".finish");
	//   10   20:aload_1         
	//   11   21:ldc1            #126 <String ".finish">
	//   12   23:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
	//   14   27:return          
	}

	protected final void onActivityResult(int i, int j, Intent intent)
	{
		super.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #130 <Method void Activity.onActivityResult(int, int, Intent)>
		StringBuilder stringbuilder = new StringBuilder();
	//    5    7:new             #119 <Class StringBuilder>
	//    6   10:dup             
	//    7   11:invokespecial   #120 <Method void StringBuilder()>
	//    8   14:astore          4
		stringbuilder.append(a);
	//    9   16:aload           4
	//   10   18:getstatic       #41  <Field String a>
	//   11   21:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(".onActivityResult");
	//   13   25:aload           4
	//   14   27:ldc1            #132 <String ".onActivityResult">
	//   15   29:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		if(i == 1)
	//*  17   33:iload_1         
	//*  18   34:iconst_1        
	//*  19   35:icmpne          175
			switch(j)
	//*  20   38:iload_2         
			{
	//*  21   39:tableswitch     -1 0: default 60
	//	               -1 103
	//	               0 175
			default:
				intent = ((Intent) (a));
	//   22   60:getstatic       #41  <Field String a>
	//   23   63:astore_3        
				StringBuilder stringbuilder1 = new StringBuilder("unexpected request code ");
	//   24   64:new             #119 <Class StringBuilder>
	//   25   67:dup             
	//   26   68:ldc1            #134 <String "unexpected request code ">
	//   27   70:invokespecial   #137 <Method void StringBuilder(String)>
	//   28   73:astore          4
				stringbuilder1.append(i);
	//   29   75:aload           4
	//   30   77:iload_1         
	//   31   78:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//   32   81:pop             
				stringbuilder1.append(" call it a cancel");
	//   33   82:aload           4
	//   34   84:ldc1            #142 <String " call it a cancel">
	//   35   86:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   36   89:pop             
				Log.wtf(((String) (intent)), stringbuilder1.toString());
	//   37   90:aload_3         
	//   38   91:aload           4
	//   39   93:invokevirtual   #145 <Method String StringBuilder.toString()>
	//   40   96:invokestatic    #148 <Method int Log.wtf(String, String)>
	//   41   99:pop             
				break;
	//   42  100:goto            175

			case 0: // '\0'
				break;

			case -1: 
				String s;
				if(intent != null)
	//*  43  103:aload_3         
	//*  44  104:ifnull          160
				{
					intent = ((Intent) ((PayPalAuthorization)intent.getParcelableExtra("com.paypal.android.sdk.authorization")));
	//   45  107:aload_3         
	//   46  108:ldc1            #150 <String "com.paypal.android.sdk.authorization">
	//   47  110:invokevirtual   #156 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   48  113:checkcast       #158 <Class PayPalAuthorization>
	//   49  116:astore_3        
					if(intent != null)
	//*  50  117:aload_3         
	//*  51  118:ifnull          149
					{
						Intent intent1 = new Intent();
	//   52  121:new             #152 <Class Intent>
	//   53  124:dup             
	//   54  125:invokespecial   #159 <Method void Intent()>
	//   55  128:astore          4
						intent1.putExtra("com.paypal.android.sdk.authorization", ((android.os.Parcelable) (intent)));
	//   56  130:aload           4
	//   57  132:ldc1            #150 <String "com.paypal.android.sdk.authorization">
	//   58  134:aload_3         
	//   59  135:invokevirtual   #163 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   60  138:pop             
						setResult(-1, intent1);
	//   61  139:aload_0         
	//   62  140:iconst_m1       
	//   63  141:aload           4
	//   64  143:invokevirtual   #166 <Method void setResult(int, Intent)>
						break;
	//   65  146:goto            175
					}
					intent = ((Intent) (a));
	//   66  149:getstatic       #41  <Field String a>
	//   67  152:astore_3        
					s = "result was OK, have data, but no authorization state in bundle, oops";
	//   68  153:ldc1            #168 <String "result was OK, have data, but no authorization state in bundle, oops">
	//   69  155:astore          4
				} else
	//*  70  157:goto            168
				{
					intent = ((Intent) (a));
	//   71  160:getstatic       #41  <Field String a>
	//   72  163:astore_3        
					s = "result was OK, no intent data, oops";
	//   73  164:ldc1            #170 <String "result was OK, no intent data, oops">
	//   74  166:astore          4
				}
				Log.e(((String) (intent)), s);
	//   75  168:aload_3         
	//   76  169:aload           4
	//   77  171:invokestatic    #65  <Method int Log.e(String, String)>
	//   78  174:pop             
				break;
			}
		finish();
	//   79  175:aload_0         
	//   80  176:invokevirtual   #72  <Method void finish()>
	//   81  179:return          
	}

	protected final void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #174 <Method void Activity.onCreate(Bundle)>
		bundle = ((Bundle) (new StringBuilder()));
	//    3    5:new             #119 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #120 <Method void StringBuilder()>
	//    6   12:astore_1        
		((StringBuilder) (bundle)).append(a);
	//    7   13:aload_1         
	//    8   14:getstatic       #41  <Field String a>
	//    9   17:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		((StringBuilder) (bundle)).append(".onCreate");
	//   11   21:aload_1         
	//   12   22:ldc1            #176 <String ".onCreate">
	//   13   24:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		(new fz(((android.content.Context) (this)))).a();
	//   15   28:new             #178 <Class fz>
	//   16   31:dup             
	//   17   32:aload_0         
	//   18   33:invokespecial   #181 <Method void fz(android.content.Context)>
	//   19   36:invokevirtual   #183 <Method void fz.a()>
		(new fy(((android.content.Context) (this)))).a();
	//   20   39:new             #185 <Class fy>
	//   21   42:dup             
	//   22   43:aload_0         
	//   23   44:invokespecial   #186 <Method void fy(android.content.Context)>
	//   24   47:invokevirtual   #187 <Method void fy.a()>
		(new fx(((android.content.Context) (this)))).a(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
			((Class) (com/paypal/android/sdk/payments/PayPalFuturePaymentActivity)).getName(), ((Class) (com/paypal/android/sdk/payments/LoginActivity)).getName(), ((Class) (com/paypal/android/sdk/payments/FuturePaymentInfoActivity)).getName(), ((Class) (com/paypal/android/sdk/payments/FuturePaymentConsentActivity)).getName()
		}))))));
	//   25   50:new             #189 <Class fx>
	//   26   53:dup             
	//   27   54:aload_0         
	//   28   55:invokespecial   #190 <Method void fx(android.content.Context)>
	//   29   58:iconst_4        
	//   30   59:anewarray       String[]
	//   31   62:dup             
	//   32   63:iconst_0        
	//   33   64:ldc1            #2   <Class PayPalFuturePaymentActivity>
	//   34   66:invokevirtual   #197 <Method String Class.getName()>
	//   35   69:aastore         
	//   36   70:dup             
	//   37   71:iconst_1        
	//   38   72:ldc1            #199 <Class LoginActivity>
	//   39   74:invokevirtual   #197 <Method String Class.getName()>
	//   40   77:aastore         
	//   41   78:dup             
	//   42   79:iconst_2        
	//   43   80:ldc1            #201 <Class FuturePaymentInfoActivity>
	//   44   82:invokevirtual   #197 <Method String Class.getName()>
	//   45   85:aastore         
	//   46   86:dup             
	//   47   87:iconst_3        
	//   48   88:ldc1            #52  <Class FuturePaymentConsentActivity>
	//   49   90:invokevirtual   #197 <Method String Class.getName()>
	//   50   93:aastore         
	//   51   94:invokestatic    #207 <Method java.util.List Arrays.asList(Object[])>
	//   52   97:invokevirtual   #210 <Method void fx.a(java.util.Collection)>
		f = bindService(cd.b(((Activity) (this))), e, 1);
	//   53  100:aload_0         
	//   54  101:aload_0         
	//   55  102:aload_0         
	//   56  103:invokestatic    #215 <Method Intent cd.b(Activity)>
	//   57  106:aload_0         
	//   58  107:getfield        #31  <Field ServiceConnection e>
	//   59  110:iconst_1        
	//   60  111:invokevirtual   #219 <Method boolean bindService(Intent, ServiceConnection, int)>
	//   61  114:putfield        #221 <Field boolean f>
		((Activity)this).setTheme(0x103006e);
	//   62  117:aload_0         
	//   63  118:ldc1            #222 <Int 0x103006e>
	//   64  120:invokevirtual   #225 <Method void Activity.setTheme(int)>
		((Activity)this).requestWindowFeature(8);
	//   65  123:aload_0         
	//   66  124:bipush          8
	//   67  126:invokevirtual   #229 <Method boolean Activity.requestWindowFeature(int)>
	//   68  129:pop             
		bundle = ((Bundle) (new fu(((android.content.Context) (this)))));
	//   69  130:new             #231 <Class fu>
	//   70  133:dup             
	//   71  134:aload_0         
	//   72  135:invokespecial   #232 <Method void fu(android.content.Context)>
	//   73  138:astore_1        
		setContentView(((android.view.View) (((fu) (bundle)).a)));
	//   74  139:aload_0         
	//   75  140:aload_1         
	//   76  141:getfield        #235 <Field android.view.ViewGroup fu.a>
	//   77  144:invokevirtual   #239 <Method void setContentView(android.view.View)>
		((fu) (bundle)).b.setText(((CharSequence) (fa.a(fc.y))));
	//   78  147:aload_1         
	//   79  148:getfield        #242 <Field TextView fu.b>
	//   80  151:getstatic       #248 <Field fc fc.y>
	//   81  154:invokestatic    #253 <Method String fa.a(fc)>
	//   82  157:invokevirtual   #259 <Method void TextView.setText(CharSequence)>
		cd.a(((Activity) (this)), ((TextView) (null)), fc.y);
	//   83  160:aload_0         
	//   84  161:aconst_null     
	//   85  162:getstatic       #248 <Field fc fc.y>
	//   86  165:invokestatic    #262 <Method void cd.a(Activity, TextView, fc)>
	//   87  168:return          
	}

	protected final Dialog onCreateDialog(int i, Bundle bundle)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     2 3: default 24
	//	               2 44
	//	               3 34
		default:
			return cd.a(((Activity) (this)), fc.bc, bundle, i);
	//    2   24:aload_0         
	//    3   25:getstatic       #267 <Field fc fc.bc>
	//    4   28:aload_2         
	//    5   29:iload_1         
	//    6   30:invokestatic    #270 <Method Dialog cd.a(Activity, fc, Bundle, int)>
	//    7   33:areturn         

		case 3: // '\003'
			return cd.a(((Activity) (this)), fc.be, bundle, i);
	//    8   34:aload_0         
	//    9   35:getstatic       #273 <Field fc fc.be>
	//   10   38:aload_2         
	//   11   39:iload_1         
	//   12   40:invokestatic    #270 <Method Dialog cd.a(Activity, fc, Bundle, int)>
	//   13   43:areturn         

		case 2: // '\002'
			return cd.a(((Activity) (this)), ((android.content.DialogInterface.OnClickListener) (new al(this))));
	//   14   44:aload_0         
	//   15   45:new             #275 <Class al>
	//   16   48:dup             
	//   17   49:aload_0         
	//   18   50:invokespecial   #276 <Method void al(PayPalFuturePaymentActivity)>
	//   19   53:invokestatic    #279 <Method Dialog cd.a(Activity, android.content.DialogInterface$OnClickListener)>
	//   20   56:areturn         
		}
	}

	protected final void onDestroy()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #119 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append(a);
	//    4    8:aload_1         
	//    5    9:getstatic       #41  <Field String a>
	//    6   12:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(".onDestroy");
	//    8   16:aload_1         
	//    9   17:ldc2            #282 <String ".onDestroy">
	//   10   20:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		obj = ((Object) (d));
	//   12   24:aload_0         
	//   13   25:getfield        #34  <Field PayPalService d>
	//   14   28:astore_1        
		if(obj != null)
	//*  15   29:aload_1         
	//*  16   30:ifnull          44
		{
			((PayPalService) (obj)).o();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #285 <Method void PayPalService.o()>
			d.u();
	//   19   37:aload_0         
	//   20   38:getfield        #34  <Field PayPalService d>
	//   21   41:invokevirtual   #288 <Method void PayPalService.u()>
		}
		if(f)
	//*  22   44:aload_0         
	//*  23   45:getfield        #221 <Field boolean f>
	//*  24   48:ifeq            64
		{
			unbindService(e);
	//   25   51:aload_0         
	//   26   52:aload_0         
	//   27   53:getfield        #31  <Field ServiceConnection e>
	//   28   56:invokevirtual   #292 <Method void unbindService(ServiceConnection)>
			f = false;
	//   29   59:aload_0         
	//   30   60:iconst_0        
	//   31   61:putfield        #221 <Field boolean f>
		}
		super.onDestroy();
	//   32   64:aload_0         
	//   33   65:invokespecial   #294 <Method void Activity.onDestroy()>
	//   34   68:return          
	}

	private static final String a = "PayPalFuturePaymentActivity";
	private Date b;
	private Timer c;
	private PayPalService d;
	private final ServiceConnection e = new am(this);
	private boolean f;

	static 
	{
	//    0    0:return          
	}
}
