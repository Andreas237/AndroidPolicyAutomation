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
//			bn, PayPalService, PaymentMethodActivity, bp, 
//			br, PaymentConfirmation, LoginActivity, PaymentConfirmActivity, 
//			cd, bm, bh

public final class PaymentActivity extends Activity
{

	public PaymentActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Activity()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class bn>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #29  <Method void bn(PaymentActivity)>
	//    7   13:putfield        #31  <Field ServiceConnection e>
	//    8   16:return          
	}

	static PayPalService a(PaymentActivity paymentactivity, PayPalService paypalservice)
	{
		paymentactivity.d = paypalservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field PayPalService d>
		return paypalservice;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static bh a(PaymentActivity paymentactivity)
	{
		return paymentactivity.c();
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

	static Timer a(PaymentActivity paymentactivity, Timer timer)
	{
		paymentactivity.b = timer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field Timer b>
		return timer;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static PayPalService b(PaymentActivity paymentactivity)
	{
		return paymentactivity.d;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PayPalService d>
	//    2    4:areturn         
	}

	private void b()
	{
		PaymentMethodActivity.a(((Activity) (this)), 1, d.d());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #34  <Field PayPalService d>
	//    4    6:invokevirtual   #50  <Method PayPalConfiguration PayPalService.d()>
	//    5    9:invokestatic    #55  <Method void PaymentMethodActivity.a(Activity, int, PayPalConfiguration)>
	//    6   12:return          
	}

	private bh c()
	{
		return ((bh) (new bp(this)));
	//    0    0:new             #57  <Class bp>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #58  <Method void bp(PaymentActivity)>
	//    4    8:areturn         
	}

	static void c(PaymentActivity paymentactivity)
	{
		if(paymentactivity.d.d() == null)
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
			paymentactivity.setResult(2);
	//    8   19:aload_0         
	//    9   20:iconst_2        
	//   10   21:invokevirtual   #69  <Method void setResult(int)>
			paymentactivity.finish();
	//   11   24:aload_0         
	//   12   25:invokevirtual   #72  <Method void finish()>
			return;
	//   13   28:return          
		}
		br br1 = new br(paymentactivity.getIntent(), paymentactivity.d.d());
	//   14   29:new             #74  <Class br>
	//   15   32:dup             
	//   16   33:aload_0         
	//   17   34:invokevirtual   #78  <Method Intent getIntent()>
	//   18   37:aload_0         
	//   19   38:getfield        #34  <Field PayPalService d>
	//   20   41:invokevirtual   #50  <Method PayPalConfiguration PayPalService.d()>
	//   21   44:invokespecial   #81  <Method void br(Intent, PayPalConfiguration)>
	//   22   47:astore_1        
		if(!br1.c())
	//*  23   48:aload_1         
	//*  24   49:invokevirtual   #84  <Method boolean br.c()>
	//*  25   52:ifne            74
		{
			Log.e(a, "Service extras invalid.  Please see the docs.");
	//   26   55:getstatic       #41  <Field String a>
	//   27   58:ldc1            #86  <String "Service extras invalid.  Please see the docs.">
	//   28   60:invokestatic    #65  <Method int Log.e(String, String)>
	//   29   63:pop             
			paymentactivity.setResult(2);
	//   30   64:aload_0         
	//   31   65:iconst_2        
	//   32   66:invokevirtual   #69  <Method void setResult(int)>
			paymentactivity.finish();
	//   33   69:aload_0         
	//   34   70:invokevirtual   #72  <Method void finish()>
			return;
	//   35   73:return          
		}
		if(!br1.a())
	//*  36   74:aload_1         
	//*  37   75:invokevirtual   #88  <Method boolean br.a()>
	//*  38   78:ifne            100
		{
			Log.e(a, "Extras invalid.  Please see the docs.");
	//   39   81:getstatic       #41  <Field String a>
	//   40   84:ldc1            #90  <String "Extras invalid.  Please see the docs.">
	//   41   86:invokestatic    #65  <Method int Log.e(String, String)>
	//   42   89:pop             
			paymentactivity.setResult(2);
	//   43   90:aload_0         
	//   44   91:iconst_2        
	//   45   92:invokevirtual   #69  <Method void setResult(int)>
			paymentactivity.finish();
	//   46   95:aload_0         
	//   47   96:invokevirtual   #72  <Method void finish()>
			return;
	//   48   99:return          
		}
		paymentactivity.d.l();
	//   49  100:aload_0         
	//   50  101:getfield        #34  <Field PayPalService d>
	//   51  104:invokevirtual   #93  <Method void PayPalService.l()>
		paymentactivity.d.c().a();
	//   52  107:aload_0         
	//   53  108:getfield        #34  <Field PayPalService d>
	//   54  111:invokevirtual   #96  <Method ck PayPalService.c()>
	//   55  114:invokevirtual   #100 <Method void ck.a()>
		if(paymentactivity.d.i())
	//*  56  117:aload_0         
	//*  57  118:getfield        #34  <Field PayPalService d>
	//*  58  121:invokevirtual   #103 <Method boolean PayPalService.i()>
	//*  59  124:ifeq            132
		{
			paymentactivity.b();
	//   60  127:aload_0         
	//   61  128:invokespecial   #105 <Method void b()>
			return;
	//   62  131:return          
		} else
		{
			Calendar calendar = Calendar.getInstance();
	//   63  132:invokestatic    #111 <Method Calendar Calendar.getInstance()>
	//   64  135:astore_1        
			calendar.add(13, 1);
	//   65  136:aload_1         
	//   66  137:bipush          13
	//   67  139:iconst_1        
	//   68  140:invokevirtual   #115 <Method void Calendar.add(int, int)>
			paymentactivity.c = calendar.getTime();
	//   69  143:aload_0         
	//   70  144:aload_1         
	//   71  145:invokevirtual   #119 <Method Date Calendar.getTime()>
	//   72  148:putfield        #121 <Field Date c>
			paymentactivity.d.a(paymentactivity.c(), false);
	//   73  151:aload_0         
	//   74  152:getfield        #34  <Field PayPalService d>
	//   75  155:aload_0         
	//   76  156:invokespecial   #38  <Method bh c()>
	//   77  159:iconst_0        
	//   78  160:invokevirtual   #124 <Method void PayPalService.a(bh, boolean)>
			return;
	//   79  163:return          
		}
	}

	static Date d(PaymentActivity paymentactivity)
	{
		return paymentactivity.c;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field Date c>
	//    2    4:areturn         
	}

	static void e(PaymentActivity paymentactivity)
	{
		paymentactivity.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method void b()>
	//    2    4:return          
	}

	static Timer f(PaymentActivity paymentactivity)
	{
		return paymentactivity.b;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Timer b>
	//    2    4:areturn         
	}

	public final void finish()
	{
		super.finish();
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method void Activity.finish()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #129 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #130 <Method void StringBuilder()>
	//    5   11:astore_1        
		stringbuilder.append(a);
	//    6   12:aload_1         
	//    7   13:getstatic       #41  <Field String a>
	//    8   16:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(".finish");
	//   10   20:aload_1         
	//   11   21:ldc1            #136 <String ".finish">
	//   12   23:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
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
	//    4    4:invokespecial   #140 <Method void Activity.onActivityResult(int, int, Intent)>
		StringBuilder stringbuilder = new StringBuilder();
	//    5    7:new             #129 <Class StringBuilder>
	//    6   10:dup             
	//    7   11:invokespecial   #130 <Method void StringBuilder()>
	//    8   14:astore          4
		stringbuilder.append(a);
	//    9   16:aload           4
	//   10   18:getstatic       #41  <Field String a>
	//   11   21:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(".onActivityResult");
	//   13   25:aload           4
	//   14   27:ldc1            #142 <String ".onActivityResult">
	//   15   29:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		if(i == 1)
	//*  17   33:iload_1         
	//*  18   34:iconst_1        
	//*  19   35:icmpne          168
			switch(j)
	//*  20   38:iload_2         
			{
	//*  21   39:tableswitch     -1 0: default 60
	//	               -1 96
	//	               0 168
			default:
				intent = ((Intent) (new StringBuilder("unexpected request code ")));
	//   22   60:new             #129 <Class StringBuilder>
	//   23   63:dup             
	//   24   64:ldc1            #144 <String "unexpected request code ">
	//   25   66:invokespecial   #147 <Method void StringBuilder(String)>
	//   26   69:astore_3        
				((StringBuilder) (intent)).append(i);
	//   27   70:aload_3         
	//   28   71:iload_1         
	//   29   72:invokevirtual   #150 <Method StringBuilder StringBuilder.append(int)>
	//   30   75:pop             
				((StringBuilder) (intent)).append(" call it a cancel");
	//   31   76:aload_3         
	//   32   77:ldc1            #152 <String " call it a cancel">
	//   33   79:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   34   82:pop             
				Log.wtf("paypal.sdk", ((StringBuilder) (intent)).toString());
	//   35   83:ldc1            #154 <String "paypal.sdk">
	//   36   85:aload_3         
	//   37   86:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   38   89:invokestatic    #160 <Method int Log.wtf(String, String)>
	//   39   92:pop             
				break;
	//   40   93:goto            168

			case 0: // '\0'
				break;

			case -1: 
				String s;
				if(intent != null)
	//*  41   96:aload_3         
	//*  42   97:ifnull          153
				{
					intent = ((Intent) ((PaymentConfirmation)intent.getParcelableExtra("com.paypal.android.sdk.paymentConfirmation")));
	//   43  100:aload_3         
	//   44  101:ldc1            #162 <String "com.paypal.android.sdk.paymentConfirmation">
	//   45  103:invokevirtual   #168 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   46  106:checkcast       #170 <Class PaymentConfirmation>
	//   47  109:astore_3        
					if(intent != null)
	//*  48  110:aload_3         
	//*  49  111:ifnull          142
					{
						Intent intent1 = new Intent();
	//   50  114:new             #164 <Class Intent>
	//   51  117:dup             
	//   52  118:invokespecial   #171 <Method void Intent()>
	//   53  121:astore          4
						intent1.putExtra("com.paypal.android.sdk.paymentConfirmation", ((android.os.Parcelable) (intent)));
	//   54  123:aload           4
	//   55  125:ldc1            #162 <String "com.paypal.android.sdk.paymentConfirmation">
	//   56  127:aload_3         
	//   57  128:invokevirtual   #175 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   58  131:pop             
						setResult(-1, intent1);
	//   59  132:aload_0         
	//   60  133:iconst_m1       
	//   61  134:aload           4
	//   62  136:invokevirtual   #178 <Method void setResult(int, Intent)>
						break;
	//   63  139:goto            168
					}
					intent = ((Intent) (a));
	//   64  142:getstatic       #41  <Field String a>
	//   65  145:astore_3        
					s = "result was OK, have data, but no payment state in bundle, oops";
	//   66  146:ldc1            #180 <String "result was OK, have data, but no payment state in bundle, oops">
	//   67  148:astore          4
				} else
	//*  68  150:goto            161
				{
					intent = ((Intent) (a));
	//   69  153:getstatic       #41  <Field String a>
	//   70  156:astore_3        
					s = "result was OK, no intent data, oops";
	//   71  157:ldc1            #182 <String "result was OK, no intent data, oops">
	//   72  159:astore          4
				}
				Log.e(((String) (intent)), s);
	//   73  161:aload_3         
	//   74  162:aload           4
	//   75  164:invokestatic    #65  <Method int Log.e(String, String)>
	//   76  167:pop             
				break;
			}
		finish();
	//   77  168:aload_0         
	//   78  169:invokevirtual   #72  <Method void finish()>
	//   79  172:return          
	}

	protected final void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #186 <Method void Activity.onCreate(Bundle)>
		bundle = ((Bundle) (new StringBuilder()));
	//    3    5:new             #129 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #130 <Method void StringBuilder()>
	//    6   12:astore_1        
		((StringBuilder) (bundle)).append(a);
	//    7   13:aload_1         
	//    8   14:getstatic       #41  <Field String a>
	//    9   17:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		((StringBuilder) (bundle)).append(".onCreate");
	//   11   21:aload_1         
	//   12   22:ldc1            #188 <String ".onCreate">
	//   13   24:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		(new fz(((android.content.Context) (this)))).a();
	//   15   28:new             #190 <Class fz>
	//   16   31:dup             
	//   17   32:aload_0         
	//   18   33:invokespecial   #193 <Method void fz(android.content.Context)>
	//   19   36:invokevirtual   #194 <Method void fz.a()>
		(new fy(((android.content.Context) (this)))).a();
	//   20   39:new             #196 <Class fy>
	//   21   42:dup             
	//   22   43:aload_0         
	//   23   44:invokespecial   #197 <Method void fy(android.content.Context)>
	//   24   47:invokevirtual   #198 <Method void fy.a()>
		(new fx(((android.content.Context) (this)))).a(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
			((Class) (com/paypal/android/sdk/payments/PaymentActivity)).getName(), ((Class) (com/paypal/android/sdk/payments/LoginActivity)).getName(), ((Class) (com/paypal/android/sdk/payments/PaymentMethodActivity)).getName(), ((Class) (com/paypal/android/sdk/payments/PaymentConfirmActivity)).getName()
		}))))));
	//   25   50:new             #200 <Class fx>
	//   26   53:dup             
	//   27   54:aload_0         
	//   28   55:invokespecial   #201 <Method void fx(android.content.Context)>
	//   29   58:iconst_4        
	//   30   59:anewarray       String[]
	//   31   62:dup             
	//   32   63:iconst_0        
	//   33   64:ldc1            #2   <Class PaymentActivity>
	//   34   66:invokevirtual   #208 <Method String Class.getName()>
	//   35   69:aastore         
	//   36   70:dup             
	//   37   71:iconst_1        
	//   38   72:ldc1            #210 <Class LoginActivity>
	//   39   74:invokevirtual   #208 <Method String Class.getName()>
	//   40   77:aastore         
	//   41   78:dup             
	//   42   79:iconst_2        
	//   43   80:ldc1            #52  <Class PaymentMethodActivity>
	//   44   82:invokevirtual   #208 <Method String Class.getName()>
	//   45   85:aastore         
	//   46   86:dup             
	//   47   87:iconst_3        
	//   48   88:ldc1            #212 <Class PaymentConfirmActivity>
	//   49   90:invokevirtual   #208 <Method String Class.getName()>
	//   50   93:aastore         
	//   51   94:invokestatic    #218 <Method java.util.List Arrays.asList(Object[])>
	//   52   97:invokevirtual   #221 <Method void fx.a(java.util.Collection)>
		f = bindService(cd.b(((Activity) (this))), e, 1);
	//   53  100:aload_0         
	//   54  101:aload_0         
	//   55  102:aload_0         
	//   56  103:invokestatic    #226 <Method Intent cd.b(Activity)>
	//   57  106:aload_0         
	//   58  107:getfield        #31  <Field ServiceConnection e>
	//   59  110:iconst_1        
	//   60  111:invokevirtual   #230 <Method boolean bindService(Intent, ServiceConnection, int)>
	//   61  114:putfield        #232 <Field boolean f>
		((Activity)this).setTheme(0x103006e);
	//   62  117:aload_0         
	//   63  118:ldc1            #233 <Int 0x103006e>
	//   64  120:invokevirtual   #236 <Method void Activity.setTheme(int)>
		((Activity)this).requestWindowFeature(8);
	//   65  123:aload_0         
	//   66  124:bipush          8
	//   67  126:invokevirtual   #240 <Method boolean Activity.requestWindowFeature(int)>
	//   68  129:pop             
		bundle = ((Bundle) (new fu(((android.content.Context) (this)))));
	//   69  130:new             #242 <Class fu>
	//   70  133:dup             
	//   71  134:aload_0         
	//   72  135:invokespecial   #243 <Method void fu(android.content.Context)>
	//   73  138:astore_1        
		setContentView(((android.view.View) (((fu) (bundle)).a)));
	//   74  139:aload_0         
	//   75  140:aload_1         
	//   76  141:getfield        #246 <Field android.view.ViewGroup fu.a>
	//   77  144:invokevirtual   #250 <Method void setContentView(android.view.View)>
		((fu) (bundle)).b.setText(((CharSequence) (fa.a(fc.y))));
	//   78  147:aload_1         
	//   79  148:getfield        #253 <Field TextView fu.b>
	//   80  151:getstatic       #259 <Field fc fc.y>
	//   81  154:invokestatic    #264 <Method String fa.a(fc)>
	//   82  157:invokevirtual   #270 <Method void TextView.setText(CharSequence)>
		cd.a(((Activity) (this)), ((TextView) (null)), fc.y);
	//   83  160:aload_0         
	//   84  161:aconst_null     
	//   85  162:getstatic       #259 <Field fc fc.y>
	//   86  165:invokestatic    #273 <Method void cd.a(Activity, TextView, fc)>
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
	//    3   25:getstatic       #278 <Field fc fc.bc>
	//    4   28:aload_2         
	//    5   29:iload_1         
	//    6   30:invokestatic    #281 <Method Dialog cd.a(Activity, fc, Bundle, int)>
	//    7   33:areturn         

		case 3: // '\003'
			return cd.a(((Activity) (this)), fc.be, bundle, i);
	//    8   34:aload_0         
	//    9   35:getstatic       #284 <Field fc fc.be>
	//   10   38:aload_2         
	//   11   39:iload_1         
	//   12   40:invokestatic    #281 <Method Dialog cd.a(Activity, fc, Bundle, int)>
	//   13   43:areturn         

		case 2: // '\002'
			return cd.a(((Activity) (this)), ((android.content.DialogInterface.OnClickListener) (new bm(this))));
	//   14   44:aload_0         
	//   15   45:new             #286 <Class bm>
	//   16   48:dup             
	//   17   49:aload_0         
	//   18   50:invokespecial   #287 <Method void bm(PaymentActivity)>
	//   19   53:invokestatic    #290 <Method Dialog cd.a(Activity, android.content.DialogInterface$OnClickListener)>
	//   20   56:areturn         
		}
	}

	protected final void onDestroy()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #129 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #130 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append(a);
	//    4    8:aload_1         
	//    5    9:getstatic       #41  <Field String a>
	//    6   12:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(".onDestroy");
	//    8   16:aload_1         
	//    9   17:ldc2            #293 <String ".onDestroy">
	//   10   20:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
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
	//   18   34:invokevirtual   #296 <Method void PayPalService.o()>
			d.u();
	//   19   37:aload_0         
	//   20   38:getfield        #34  <Field PayPalService d>
	//   21   41:invokevirtual   #299 <Method void PayPalService.u()>
		}
		if(f)
	//*  22   44:aload_0         
	//*  23   45:getfield        #232 <Field boolean f>
	//*  24   48:ifeq            64
		{
			unbindService(e);
	//   25   51:aload_0         
	//   26   52:aload_0         
	//   27   53:getfield        #31  <Field ServiceConnection e>
	//   28   56:invokevirtual   #303 <Method void unbindService(ServiceConnection)>
			f = false;
	//   29   59:aload_0         
	//   30   60:iconst_0        
	//   31   61:putfield        #232 <Field boolean f>
		}
		super.onDestroy();
	//   32   64:aload_0         
	//   33   65:invokespecial   #305 <Method void Activity.onDestroy()>
	//   34   68:return          
	}

	private static final String a = "PaymentActivity";
	private Timer b;
	private Date c;
	private PayPalService d;
	private final ServiceConnection e = new bn(this);
	private boolean f;

	static 
	{
	//    0    0:return          
	}
}
