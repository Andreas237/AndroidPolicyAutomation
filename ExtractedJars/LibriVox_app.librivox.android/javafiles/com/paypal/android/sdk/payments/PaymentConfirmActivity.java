// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import com.paypal.android.sdk.*;
import java.math.BigDecimal;
import java.util.*;

// Referenced classes of package com.paypal.android.sdk.payments:
//			bz, PayPalPayment, ck, dx, 
//			bs, PayPalService, cl, dj, 
//			PayPalConfiguration, LoginActivity, PayPalPaymentDetails, ShippingAddress, 
//			ce, cb, cg, cd, 
//			bx, bw, bt, by, 
//			ci, cj, bu, bv, 
//			ch, bh

public final class PaymentConfirmActivity extends Activity
{

	public PaymentConfirmActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Activity()>
	//    2    4:aload_0         
	//    3    5:new             #37  <Class bz>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #40  <Method void bz(PaymentConfirmActivity)>
	//    7   13:putfield        #42  <Field ServiceConnection l>
	//    8   16:return          
	}

	private static er a(PayPalPayment paypalpayment)
	{
		return new er(new BigDecimal(dj.a(paypalpayment.c().doubleValue(), paypalpayment.f()).trim()), paypalpayment.f());
	//    0    0:new             #45  <Class er>
	//    1    3:dup             
	//    2    4:new             #47  <Class BigDecimal>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokevirtual   #52  <Method BigDecimal PayPalPayment.c()>
	//    6   12:invokevirtual   #56  <Method double BigDecimal.doubleValue()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #59  <Method String PayPalPayment.f()>
	//    9   19:invokestatic    #64  <Method String dj.a(double, String)>
	//   10   22:invokevirtual   #69  <Method String String.trim()>
	//   11   25:invokespecial   #72  <Method void BigDecimal(String)>
	//   12   28:aload_0         
	//   13   29:invokevirtual   #59  <Method String PayPalPayment.f()>
	//   14   32:invokespecial   #75  <Method void er(BigDecimal, String)>
	//   15   35:areturn         
	}

	static PayPalService a(PaymentConfirmActivity paymentconfirmactivity, PayPalService paypalservice)
	{
		paymentconfirmactivity.k = paypalservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field PayPalService k>
		return paypalservice;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static String a()
	{
		return a;
	//    0    0:getstatic       #80  <Field String a>
	//    1    3:areturn         
	}

	private void a(int i1)
	{
		setResult(i1, new Intent());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:new             #83  <Class Intent>
	//    3    5:dup             
	//    4    6:invokespecial   #84  <Method void Intent()>
	//    5    9:invokevirtual   #88  <Method void setResult(int, Intent)>
	//    6   12:return          
	}

	static void a(Activity activity, int i1, cl cl1, Parcelable parcelable, PayPalConfiguration paypalconfiguration)
	{
		a(activity, 2, cl1, ((Parcelable) (null)), paypalconfiguration, false);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload           4
	//    5    6:iconst_0        
	//    6    7:invokestatic    #92  <Method void a(Activity, int, cl, Parcelable, PayPalConfiguration, boolean)>
	//    7   10:return          
	}

	static void a(Activity activity, int i1, cl cl1, Parcelable parcelable, PayPalConfiguration paypalconfiguration, boolean flag)
	{
		Intent intent = new Intent(((android.content.Context) (activity)), com/paypal/android/sdk/payments/PaymentConfirmActivity);
	//    0    0:new             #83  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class PaymentConfirmActivity>
	//    4    7:invokespecial   #95  <Method void Intent(android.content.Context, Class)>
	//    5   10:astore          6
		intent.putExtras(activity.getIntent());
	//    6   12:aload           6
	//    7   14:aload_0         
	//    8   15:invokevirtual   #99  <Method Intent Activity.getIntent()>
	//    9   18:invokevirtual   #103 <Method Intent Intent.putExtras(Intent)>
	//   10   21:pop             
		intent.putExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_PAYMENT_KIND", ((java.io.Serializable) (cl1)));
	//   11   22:aload           6
	//   12   24:ldc1            #105 <String "com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_PAYMENT_KIND">
	//   13   26:aload_2         
	//   14   27:invokevirtual   #109 <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   15   30:pop             
		intent.putExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_CREDIT_CARD", parcelable);
	//   16   31:aload           6
	//   17   33:ldc1            #111 <String "com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_CREDIT_CARD">
	//   18   35:aload_3         
	//   19   36:invokevirtual   #114 <Method Intent Intent.putExtra(String, Parcelable)>
	//   20   39:pop             
		intent.putExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_RESET_PP_REQUEST_ID", flag);
	//   21   40:aload           6
	//   22   42:ldc1            #116 <String "com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_RESET_PP_REQUEST_ID">
	//   23   44:iload           5
	//   24   46:invokevirtual   #119 <Method Intent Intent.putExtra(String, boolean)>
	//   25   49:pop             
		intent.putExtra("com.paypal.android.sdk.paypalConfiguration", ((Parcelable) (paypalconfiguration)));
	//   26   50:aload           6
	//   27   52:ldc1            #121 <String "com.paypal.android.sdk.paypalConfiguration">
	//   28   54:aload           4
	//   29   56:invokevirtual   #114 <Method Intent Intent.putExtra(String, Parcelable)>
	//   30   59:pop             
		activity.startActivityForResult(intent, i1);
	//   31   60:aload_0         
	//   32   61:aload           6
	//   33   63:iload_1         
	//   34   64:invokevirtual   #125 <Method void Activity.startActivityForResult(Intent, int)>
	//   35   67:return          
	}

	private void a(Bundle bundle)
	{
		String s = bundle.getString("authAccount");
	//    0    0:aload_1         
	//    1    1:ldc1            #128 <String "authAccount">
	//    2    3:invokevirtual   #134 <Method String Bundle.getString(String)>
	//    3    6:astore          4
		String s1 = bundle.getString("authtoken");
	//    4    8:aload_1         
	//    5    9:ldc1            #136 <String "authtoken">
	//    6   11:invokevirtual   #134 <Method String Bundle.getString(String)>
	//    7   14:astore          5
		String s2 = bundle.getString("scope");
	//    8   16:aload_1         
	//    9   17:ldc1            #138 <String "scope">
	//   10   19:invokevirtual   #134 <Method String Bundle.getString(String)>
	//   11   22:astore          6
		long l1 = bundle.getLong("valid_until");
	//   12   24:aload_1         
	//   13   25:ldc1            #140 <String "valid_until">
	//   14   27:invokevirtual   #144 <Method long Bundle.getLong(String)>
	//   15   30:lstore_2        
		for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext();)
	//*  16   31:aload_1         
	//*  17   32:invokevirtual   #148 <Method Set Bundle.keySet()>
	//*  18   35:invokeinterface #154 <Method Iterator Set.iterator()>
	//*  19   40:astore          7
	//*  20   42:aload           7
	//*  21   44:invokeinterface #160 <Method boolean Iterator.hasNext()>
	//*  22   49:ifeq            132
		{
			String s3 = (String)iterator.next();
	//   23   52:aload           7
	//   24   54:invokeinterface #164 <Method Object Iterator.next()>
	//   25   59:checkcast       #66  <Class String>
	//   26   62:astore          8
			Object obj = bundle.get(s3);
	//   27   64:aload_1         
	//   28   65:aload           8
	//   29   67:invokevirtual   #168 <Method Object Bundle.get(String)>
	//   30   70:astore          9
			if(obj == null)
	//*  31   72:aload           9
	//*  32   74:ifnonnull       95
				String.format("%s:null", new Object[] {
					s3
				});
	//   33   77:ldc1            #170 <String "%s:null">
	//   34   79:iconst_1        
	//   35   80:anewarray       Object[]
	//   36   83:dup             
	//   37   84:iconst_0        
	//   38   85:aload           8
	//   39   87:aastore         
	//   40   88:invokestatic    #176 <Method String String.format(String, Object[])>
	//   41   91:pop             
			else
	//*  42   92:goto            42
				String.format("%s:%s (%s)", new Object[] {
					s3, obj.toString(), obj.getClass().getName()
				});
	//   43   95:ldc1            #178 <String "%s:%s (%s)">
	//   44   97:iconst_3        
	//   45   98:anewarray       Object[]
	//   46  101:dup             
	//   47  102:iconst_0        
	//   48  103:aload           8
	//   49  105:aastore         
	//   50  106:dup             
	//   51  107:iconst_1        
	//   52  108:aload           9
	//   53  110:invokevirtual   #181 <Method String Object.toString()>
	//   54  113:aastore         
	//   55  114:dup             
	//   56  115:iconst_2        
	//   57  116:aload           9
	//   58  118:invokevirtual   #185 <Method Class Object.getClass()>
	//   59  121:invokevirtual   #190 <Method String Class.getName()>
	//   60  124:aastore         
	//   61  125:invokestatic    #176 <Method String String.format(String, Object[])>
	//   62  128:pop             
		}

	//*  63  129:goto            42
		bundle = ((Bundle) (new dw(s1, s2, l1, false)));
	//   64  132:new             #192 <Class dw>
	//   65  135:dup             
	//   66  136:aload           5
	//   67  138:aload           6
	//   68  140:lload_2         
	//   69  141:iconst_0        
	//   70  142:invokespecial   #195 <Method void dw(String, String, long, boolean)>
	//   71  145:astore_1        
		if(k == null)
	//*  72  146:aload_0         
	//*  73  147:getfield        #78  <Field PayPalService k>
	//*  74  150:ifnonnull       169
		{
			b = new com.paypal.android.sdk.payments.ck(this, s, ((dw) (bundle)));
	//   75  153:aload_0         
	//   76  154:new             #197 <Class com.paypal.android.sdk.payments.ck>
	//   77  157:dup             
	//   78  158:aload_0         
	//   79  159:aload           4
	//   80  161:aload_1         
	//   81  162:invokespecial   #200 <Method void com.paypal.android.sdk.payments.ck(PaymentConfirmActivity, String, dw)>
	//   82  165:putfield        #202 <Field com.paypal.android.sdk.payments.ck b>
			return;
	//   83  168:return          
		} else
		{
			a(s, ((dw) (bundle)));
	//   84  169:aload_0         
	//   85  170:aload           4
	//   86  172:aload_1         
	//   87  173:invokespecial   #205 <Method void a(String, dw)>
			return;
	//   88  176:return          
		}
	}

	static void a(PaymentConfirmActivity paymentconfirmactivity)
	{
		paymentconfirmactivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #207 <Method void g()>
	//    2    4:return          
	}

	static void a(PaymentConfirmActivity paymentconfirmactivity, eh eh)
	{
		paymentconfirmactivity.c = new dx(eh, paymentconfirmactivity.h.a().o());
	//    0    0:aload_0         
	//    1    1:new             #210 <Class dx>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #212 <Field bs h>
	//    6   10:invokevirtual   #217 <Method PayPalPayment com.paypal.android.sdk.payments.bs.a()>
	//    7   13:invokevirtual   #221 <Method ShippingAddress PayPalPayment.o()>
	//    8   16:invokespecial   #224 <Method void dx(eh, ShippingAddress)>
	//    9   19:putfield        #226 <Field dx c>
		paymentconfirmactivity.getIntent().putExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_PAYMENT_INFO", ((Parcelable) (paymentconfirmactivity.c)));
	//   10   22:aload_0         
	//   11   23:invokevirtual   #227 <Method Intent getIntent()>
	//   12   26:ldc1            #229 <String "com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_PAYMENT_INFO">
	//   13   28:aload_0         
	//   14   29:getfield        #226 <Field dx c>
	//   15   32:invokevirtual   #114 <Method Intent Intent.putExtra(String, Parcelable)>
	//   16   35:pop             
		paymentconfirmactivity.b();
	//   17   36:aload_0         
	//   18   37:invokespecial   #231 <Method void b()>
		paymentconfirmactivity.j();
	//   19   40:aload_0         
	//   20   41:invokespecial   #233 <Method void j()>
	//   21   44:return          
	}

	static void a(PaymentConfirmActivity paymentconfirmactivity, List list, int i1)
	{
		paymentconfirmactivity.h.b().a(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field bs h>
	//    2    4:invokevirtual   #237 <Method dx bs.b()>
	//    3    7:iload_2         
	//    4    8:invokevirtual   #239 <Method void com.paypal.android.sdk.payments.dx.a(int)>
		paymentconfirmactivity.g.a(((android.content.Context) (paymentconfirmactivity)), (ff)list.get(i1));
	//    5   11:aload_0         
	//    6   12:getfield        #241 <Field fl g>
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:invokeinterface #246 <Method Object List.get(int)>
	//   11   23:checkcast       #248 <Class ff>
	//   12   26:invokevirtual   #253 <Method void fl.a(android.content.Context, ff)>
	//   13   29:return          
	}

	private void a(String s)
	{
		g.a(s);
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field fl g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #255 <Method void fl.a(String)>
	//    4    8:return          
	}

	private void a(String s, dw dw1)
	{
		k.c().c = s;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field PayPalService k>
	//    2    4:invokevirtual   #260 <Method ck PayPalService.c()>
	//    3    7:aload_1         
	//    4    8:putfield        #264 <Field String ck.c>
		a(s);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #265 <Method void a(String)>
		k.c().g = dw1;
	//    8   16:aload_0         
	//    9   17:getfield        #78  <Field PayPalService k>
	//   10   20:invokevirtual   #260 <Method ck PayPalService.c()>
	//   11   23:aload_2         
	//   12   24:putfield        #268 <Field dw ck.g>
		if(i != com.paypal.android.sdk.payments.cl.a)
	//*  13   27:aload_0         
	//*  14   28:getfield        #270 <Field cl i>
	//*  15   31:getstatic       #274 <Field cl com.paypal.android.sdk.payments.cl.a>
	//*  16   34:if_acmpeq       45
			g.b(true);
	//   17   37:aload_0         
	//   18   38:getfield        #241 <Field fl g>
	//   19   41:iconst_1        
	//   20   42:invokevirtual   #277 <Method void fl.b(boolean)>
	//   21   45:return          
	}

	private void a(boolean flag)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #279 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #280 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(a);
	//    4    8:aload_2         
	//    5    9:getstatic       #80  <Field String a>
	//    6   12:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(".doLogin");
	//    8   16:aload_2         
	//    9   17:ldc2            #286 <String ".doLogin">
	//   10   20:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		if(com.paypal.android.sdk.payments.dj.a(((android.content.Context) (this)), k))
	//*  12   24:aload_0         
	//*  13   25:aload_0         
	//*  14   26:getfield        #78  <Field PayPalService k>
	//*  15   29:invokestatic    #291 <Method boolean com.paypal.android.sdk.payments.dj.a(android.content.Context, PayPalService)>
	//*  16   32:ifeq            199
		{
			Object obj;
			if(flag)
	//*  17   35:iload_1         
	//*  18   36:ifeq            46
				obj = ((Object) (cu.b));
	//   19   39:getstatic       #296 <Field cu cu.b>
	//   20   42:astore_2        
			else
	//*  21   43:goto            50
				obj = ((Object) (cu.a));
	//   22   46:getstatic       #298 <Field cu cu.a>
	//   23   49:astore_2        
			obj = ((Object) ((new ct()).a(k.d().k(), ((cu) (obj)), cv.a, k.b().d().e())));
	//   24   50:new             #300 <Class ct>
	//   25   53:dup             
	//   26   54:invokespecial   #301 <Method void ct()>
	//   27   57:aload_0         
	//   28   58:getfield        #78  <Field PayPalService k>
	//   29   61:invokevirtual   #304 <Method PayPalConfiguration PayPalService.d()>
	//   30   64:invokevirtual   #308 <Method String PayPalConfiguration.k()>
	//   31   67:aload_2         
	//   32   68:getstatic       #313 <Field cv cv.a>
	//   33   71:aload_0         
	//   34   72:getfield        #78  <Field PayPalService k>
	//   35   75:invokevirtual   #316 <Method av PayPalService.b()>
	//   36   78:invokevirtual   #321 <Method a av.d()>
	//   37   81:invokevirtual   #325 <Method String a.e()>
	//   38   84:invokevirtual   #328 <Method Intent ct.a(String, cu, cv, String)>
	//   39   87:astore_2        
			((Intent) (obj)).putExtra("scope", "https://uri.paypal.com/services/payments/basic");
	//   40   88:aload_2         
	//   41   89:ldc1            #138 <String "scope">
	//   42   91:ldc2            #330 <String "https://uri.paypal.com/services/payments/basic">
	//   43   94:invokevirtual   #333 <Method Intent Intent.putExtra(String, String)>
	//   44   97:pop             
			StringBuilder stringbuilder1 = new StringBuilder("startActivityForResult(");
	//   45   98:new             #279 <Class StringBuilder>
	//   46  101:dup             
	//   47  102:ldc2            #335 <String "startActivityForResult(">
	//   48  105:invokespecial   #336 <Method void StringBuilder(String)>
	//   49  108:astore_3        
			stringbuilder1.append(obj);
	//   50  109:aload_3         
	//   51  110:aload_2         
	//   52  111:invokevirtual   #339 <Method StringBuilder StringBuilder.append(Object)>
	//   53  114:pop             
			stringbuilder1.append(", 2");
	//   54  115:aload_3         
	//   55  116:ldc2            #341 <String ", 2">
	//   56  119:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   57  122:pop             
			stringbuilder1.append(")");
	//   58  123:aload_3         
	//   59  124:ldc2            #343 <String ")">
	//   60  127:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   61  130:pop             
			stringbuilder1 = new StringBuilder("requesting ");
	//   62  131:new             #279 <Class StringBuilder>
	//   63  134:dup             
	//   64  135:ldc2            #345 <String "requesting ">
	//   65  138:invokespecial   #336 <Method void StringBuilder(String)>
	//   66  141:astore_3        
			stringbuilder1.append(((Intent) (obj)).getStringExtra("response_type"));
	//   67  142:aload_3         
	//   68  143:aload_2         
	//   69  144:ldc2            #347 <String "response_type">
	//   70  147:invokevirtual   #350 <Method String Intent.getStringExtra(String)>
	//   71  150:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   72  153:pop             
			stringbuilder1.append(" with scope={");
	//   73  154:aload_3         
	//   74  155:ldc2            #352 <String " with scope={">
	//   75  158:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   76  161:pop             
			stringbuilder1.append(((Intent) (obj)).getStringExtra("scope"));
	//   77  162:aload_3         
	//   78  163:aload_2         
	//   79  164:ldc1            #138 <String "scope">
	//   80  166:invokevirtual   #350 <Method String Intent.getStringExtra(String)>
	//   81  169:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   82  172:pop             
			stringbuilder1.append("} from Authenticator.");
	//   83  173:aload_3         
	//   84  174:ldc2            #354 <String "} from Authenticator.">
	//   85  177:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   86  180:pop             
			Log.w("paypal.sdk", stringbuilder1.toString());
	//   87  181:ldc2            #356 <String "paypal.sdk">
	//   88  184:aload_3         
	//   89  185:invokevirtual   #357 <Method String StringBuilder.toString()>
	//   90  188:invokestatic    #363 <Method int Log.w(String, String)>
	//   91  191:pop             
			startActivityForResult(((Intent) (obj)), 2);
	//   92  192:aload_0         
	//   93  193:aload_2         
	//   94  194:iconst_2        
	//   95  195:invokevirtual   #364 <Method void startActivityForResult(Intent, int)>
			return;
	//   96  198:return          
		} else
		{
			com.paypal.android.sdk.payments.LoginActivity.a(((Activity) (this)), 1, k.q(), false, flag, "https://uri.paypal.com/services/payments/basic", k.d());
	//   97  199:aload_0         
	//   98  200:iconst_1        
	//   99  201:aload_0         
	//  100  202:getfield        #78  <Field PayPalService k>
	//  101  205:invokevirtual   #368 <Method com.paypal.android.sdk.dm PayPalService.q()>
	//  102  208:iconst_0        
	//  103  209:iload_1         
	//  104  210:ldc2            #330 <String "https://uri.paypal.com/services/payments/basic">
	//  105  213:aload_0         
	//  106  214:getfield        #78  <Field PayPalService k>
	//  107  217:invokevirtual   #304 <Method PayPalConfiguration PayPalService.d()>
	//  108  220:invokestatic    #373 <Method void com.paypal.android.sdk.payments.LoginActivity.a(Activity, int, com.paypal.android.sdk.dm, boolean, boolean, String, PayPalConfiguration)>
			return;
	//  109  223:return          
		}
	}

	static boolean a(PaymentConfirmActivity paymentconfirmactivity, boolean flag)
	{
		paymentconfirmactivity.f = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #376 <Field boolean f>
		return false;
	//    3    5:iconst_0        
	//    4    6:ireturn         
	}

	private static Map b(PayPalPayment paypalpayment)
	{
		if(paypalpayment != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          125
		{
			HashMap hashmap = new HashMap();
	//    2    4:new             #379 <Class HashMap>
	//    3    7:dup             
	//    4    8:invokespecial   #380 <Method void HashMap()>
	//    5   11:astore_1        
			PayPalPaymentDetails paypalpaymentdetails = paypalpayment.i();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #383 <Method PayPalPaymentDetails PayPalPayment.i()>
	//    8   16:astore_2        
			if(paypalpaymentdetails != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          114
			{
				if(paypalpaymentdetails.c() != null)
	//*  11   21:aload_2         
	//*  12   22:invokevirtual   #386 <Method BigDecimal PayPalPaymentDetails.c()>
	//*  13   25:ifnull          52
					((Map) (hashmap)).put("shipping", ((Object) (dj.a(paypalpaymentdetails.c().doubleValue(), paypalpayment.f()))));
	//   14   28:aload_1         
	//   15   29:ldc2            #388 <String "shipping">
	//   16   32:aload_2         
	//   17   33:invokevirtual   #386 <Method BigDecimal PayPalPaymentDetails.c()>
	//   18   36:invokevirtual   #56  <Method double BigDecimal.doubleValue()>
	//   19   39:aload_0         
	//   20   40:invokevirtual   #59  <Method String PayPalPayment.f()>
	//   21   43:invokestatic    #64  <Method String dj.a(double, String)>
	//   22   46:invokeinterface #394 <Method Object Map.put(Object, Object)>
	//   23   51:pop             
				if(paypalpaymentdetails.b() != null)
	//*  24   52:aload_2         
	//*  25   53:invokevirtual   #396 <Method BigDecimal PayPalPaymentDetails.b()>
	//*  26   56:ifnull          83
					((Map) (hashmap)).put("subtotal", ((Object) (dj.a(paypalpaymentdetails.b().doubleValue(), paypalpayment.f()))));
	//   27   59:aload_1         
	//   28   60:ldc2            #398 <String "subtotal">
	//   29   63:aload_2         
	//   30   64:invokevirtual   #396 <Method BigDecimal PayPalPaymentDetails.b()>
	//   31   67:invokevirtual   #56  <Method double BigDecimal.doubleValue()>
	//   32   70:aload_0         
	//   33   71:invokevirtual   #59  <Method String PayPalPayment.f()>
	//   34   74:invokestatic    #64  <Method String dj.a(double, String)>
	//   35   77:invokeinterface #394 <Method Object Map.put(Object, Object)>
	//   36   82:pop             
				if(paypalpaymentdetails.d() != null)
	//*  37   83:aload_2         
	//*  38   84:invokevirtual   #400 <Method BigDecimal PayPalPaymentDetails.d()>
	//*  39   87:ifnull          114
					((Map) (hashmap)).put("tax", ((Object) (dj.a(paypalpaymentdetails.d().doubleValue(), paypalpayment.f()))));
	//   40   90:aload_1         
	//   41   91:ldc2            #402 <String "tax">
	//   42   94:aload_2         
	//   43   95:invokevirtual   #400 <Method BigDecimal PayPalPaymentDetails.d()>
	//   44   98:invokevirtual   #56  <Method double BigDecimal.doubleValue()>
	//   45  101:aload_0         
	//   46  102:invokevirtual   #59  <Method String PayPalPayment.f()>
	//   47  105:invokestatic    #64  <Method String dj.a(double, String)>
	//   48  108:invokeinterface #394 <Method Object Map.put(Object, Object)>
	//   49  113:pop             
			}
			if(!((Map) (hashmap)).isEmpty())
	//*  50  114:aload_1         
	//*  51  115:invokeinterface #405 <Method boolean Map.isEmpty()>
	//*  52  120:ifne            125
				return ((Map) (hashmap));
	//   53  123:aload_1         
	//   54  124:areturn         
		}
		return null;
	//   55  125:aconst_null     
	//   56  126:areturn         
	}

	private void b()
	{
		dx dx1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field dx c>
	//    2    4:astore_3        
		if(dx1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          339
		{
			Object obj = null;
	//    5    9:aconst_null     
	//    6   10:astore_2        
			if(dx1.b() != null)
	//*   7   11:aload_3         
	//*   8   12:invokevirtual   #407 <Method ShippingAddress dx.b()>
	//*   9   15:ifnull          29
				obj = ((Object) (c.b().a()));
	//   10   18:aload_0         
	//   11   19:getfield        #226 <Field dx c>
	//   12   22:invokevirtual   #407 <Method ShippingAddress dx.b()>
	//   13   25:invokevirtual   #412 <Method org.json.JSONObject com.paypal.android.sdk.payments.ShippingAddress.a()>
	//   14   28:astore_2        
			int i1 = c.h();
	//   15   29:aload_0         
	//   16   30:getfield        #226 <Field dx c>
	//   17   33:invokevirtual   #415 <Method int dx.h()>
	//   18   36:istore_1        
			obj = ((Object) (fs.a(((org.json.JSONObject) (obj)), c.a(), c.i())));
	//   19   37:aload_2         
	//   20   38:aload_0         
	//   21   39:getfield        #226 <Field dx c>
	//   22   42:invokevirtual   #418 <Method org.json.JSONArray com.paypal.android.sdk.payments.dx.a()>
	//   23   45:aload_0         
	//   24   46:getfield        #226 <Field dx c>
	//   25   49:invokevirtual   #420 <Method int dx.i()>
	//   26   52:invokestatic    #425 <Method ArrayList fs.a(org.json.JSONObject, org.json.JSONArray, int)>
	//   27   55:astore_2        
			if(!h.a().a() && obj != null && ((ArrayList) (obj)).size() > 0)
	//*  28   56:aload_0         
	//*  29   57:getfield        #212 <Field bs h>
	//*  30   60:invokevirtual   #217 <Method PayPalPayment com.paypal.android.sdk.payments.bs.a()>
	//*  31   63:invokevirtual   #427 <Method boolean com.paypal.android.sdk.payments.PayPalPayment.a()>
	//*  32   66:ifne            164
	//*  33   69:aload_2         
	//*  34   70:ifnull          164
	//*  35   73:aload_2         
	//*  36   74:invokevirtual   #432 <Method int ArrayList.size()>
	//*  37   77:ifle            164
			{
				g.f().setVisibility(0);
	//   38   80:aload_0         
	//   39   81:getfield        #241 <Field fl g>
	//   40   84:invokevirtual   #435 <Method View fl.f()>
	//   41   87:iconst_0        
	//   42   88:invokevirtual   #440 <Method void View.setVisibility(int)>
				g.f().setClickable(true);
	//   43   91:aload_0         
	//   44   92:getfield        #241 <Field fl g>
	//   45   95:invokevirtual   #435 <Method View fl.f()>
	//   46   98:iconst_1        
	//   47   99:invokevirtual   #443 <Method void View.setClickable(boolean)>
				g.a(getApplicationContext(), (fs)((ArrayList) (obj)).get(i1));
	//   48  102:aload_0         
	//   49  103:getfield        #241 <Field fl g>
	//   50  106:aload_0         
	//   51  107:invokevirtual   #447 <Method android.content.Context getApplicationContext()>
	//   52  110:aload_2         
	//   53  111:iload_1         
	//   54  112:invokevirtual   #448 <Method Object ArrayList.get(int)>
	//   55  115:checkcast       #422 <Class fs>
	//   56  118:invokevirtual   #451 <Method void fl.a(android.content.Context, fs)>
				ft ft1 = new ft(((android.content.Context) (this)), ((ArrayList) (obj)), i1);
	//   57  121:new             #453 <Class ft>
	//   58  124:dup             
	//   59  125:aload_0         
	//   60  126:aload_2         
	//   61  127:iload_1         
	//   62  128:invokespecial   #456 <Method void ft(android.content.Context, ArrayList, int)>
	//   63  131:astore_3        
				(new ListView(((android.content.Context) (this)))).setAdapter(((android.widget.ListAdapter) (ft1)));
	//   64  132:new             #458 <Class ListView>
	//   65  135:dup             
	//   66  136:aload_0         
	//   67  137:invokespecial   #461 <Method void ListView(android.content.Context)>
	//   68  140:aload_3         
	//   69  141:invokevirtual   #465 <Method void ListView.setAdapter(android.widget.ListAdapter)>
				g.d(((android.view.View.OnClickListener) (new ce(this, ft1, ((ArrayList) (obj))))));
	//   70  144:aload_0         
	//   71  145:getfield        #241 <Field fl g>
	//   72  148:new             #467 <Class ce>
	//   73  151:dup             
	//   74  152:aload_0         
	//   75  153:aload_3         
	//   76  154:aload_2         
	//   77  155:invokespecial   #470 <Method void ce(PaymentConfirmActivity, ft, ArrayList)>
	//   78  158:invokevirtual   #473 <Method void fl.d(android.view.View$OnClickListener)>
			} else
	//*  79  161:goto            187
			{
				g.f().setClickable(false);
	//   80  164:aload_0         
	//   81  165:getfield        #241 <Field fl g>
	//   82  168:invokevirtual   #435 <Method View fl.f()>
	//   83  171:iconst_0        
	//   84  172:invokevirtual   #443 <Method void View.setClickable(boolean)>
				g.f().setVisibility(8);
	//   85  175:aload_0         
	//   86  176:getfield        #241 <Field fl g>
	//   87  179:invokevirtual   #435 <Method View fl.f()>
	//   88  182:bipush          8
	//   89  184:invokevirtual   #440 <Method void View.setVisibility(int)>
			}
			i1 = c.g();
	//   90  187:aload_0         
	//   91  188:getfield        #226 <Field dx c>
	//   92  191:invokevirtual   #475 <Method int dx.g()>
	//   93  194:istore_1        
			obj = ((Object) (ff.a(c.c(), c.d())));
	//   94  195:aload_0         
	//   95  196:getfield        #226 <Field dx c>
	//   96  199:invokevirtual   #477 <Method org.json.JSONObject dx.c()>
	//   97  202:aload_0         
	//   98  203:getfield        #226 <Field dx c>
	//   99  206:invokevirtual   #479 <Method org.json.JSONArray dx.d()>
	//  100  209:invokestatic    #482 <Method ArrayList ff.a(org.json.JSONObject, org.json.JSONArray)>
	//  101  212:astore_2        
			if(obj != null && ((ArrayList) (obj)).size() > 0)
	//* 102  213:aload_2         
	//* 103  214:ifnull          308
	//* 104  217:aload_2         
	//* 105  218:invokevirtual   #432 <Method int ArrayList.size()>
	//* 106  221:ifle            308
			{
				g.e().setVisibility(0);
	//  107  224:aload_0         
	//  108  225:getfield        #241 <Field fl g>
	//  109  228:invokevirtual   #484 <Method View fl.e()>
	//  110  231:iconst_0        
	//  111  232:invokevirtual   #440 <Method void View.setVisibility(int)>
				g.e().setClickable(true);
	//  112  235:aload_0         
	//  113  236:getfield        #241 <Field fl g>
	//  114  239:invokevirtual   #484 <Method View fl.e()>
	//  115  242:iconst_1        
	//  116  243:invokevirtual   #443 <Method void View.setClickable(boolean)>
				g.a(getApplicationContext(), (ff)((ArrayList) (obj)).get(i1));
	//  117  246:aload_0         
	//  118  247:getfield        #241 <Field fl g>
	//  119  250:aload_0         
	//  120  251:invokevirtual   #447 <Method android.content.Context getApplicationContext()>
	//  121  254:aload_2         
	//  122  255:iload_1         
	//  123  256:invokevirtual   #448 <Method Object ArrayList.get(int)>
	//  124  259:checkcast       #248 <Class ff>
	//  125  262:invokevirtual   #253 <Method void fl.a(android.content.Context, ff)>
				fh fh1 = new fh(((android.content.Context) (this)), ((ArrayList) (obj)), i1);
	//  126  265:new             #486 <Class fh>
	//  127  268:dup             
	//  128  269:aload_0         
	//  129  270:aload_2         
	//  130  271:iload_1         
	//  131  272:invokespecial   #487 <Method void fh(android.content.Context, ArrayList, int)>
	//  132  275:astore_3        
				(new ListView(((android.content.Context) (this)))).setAdapter(((android.widget.ListAdapter) (fh1)));
	//  133  276:new             #458 <Class ListView>
	//  134  279:dup             
	//  135  280:aload_0         
	//  136  281:invokespecial   #461 <Method void ListView(android.content.Context)>
	//  137  284:aload_3         
	//  138  285:invokevirtual   #465 <Method void ListView.setAdapter(android.widget.ListAdapter)>
				g.c(((android.view.View.OnClickListener) (new cb(this, fh1, ((ArrayList) (obj))))));
	//  139  288:aload_0         
	//  140  289:getfield        #241 <Field fl g>
	//  141  292:new             #489 <Class cb>
	//  142  295:dup             
	//  143  296:aload_0         
	//  144  297:aload_3         
	//  145  298:aload_2         
	//  146  299:invokespecial   #492 <Method void cb(PaymentConfirmActivity, fh, ArrayList)>
	//  147  302:invokevirtual   #494 <Method void fl.c(android.view.View$OnClickListener)>
			} else
	//* 148  305:goto            331
			{
				g.e().setClickable(false);
	//  149  308:aload_0         
	//  150  309:getfield        #241 <Field fl g>
	//  151  312:invokevirtual   #484 <Method View fl.e()>
	//  152  315:iconst_0        
	//  153  316:invokevirtual   #443 <Method void View.setClickable(boolean)>
				g.e().setVisibility(8);
	//  154  319:aload_0         
	//  155  320:getfield        #241 <Field fl g>
	//  156  323:invokevirtual   #484 <Method View fl.e()>
	//  157  326:bipush          8
	//  158  328:invokevirtual   #440 <Method void View.setVisibility(int)>
			}
			g.b(true);
	//  159  331:aload_0         
	//  160  332:getfield        #241 <Field fl g>
	//  161  335:iconst_1        
	//  162  336:invokevirtual   #277 <Method void fl.b(boolean)>
		}
	//  163  339:return          
	}

	static void b(PaymentConfirmActivity paymentconfirmactivity)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #279 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #280 <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append(a);
	//    4    8:aload_2         
	//    5    9:getstatic       #80  <Field String a>
	//    6   12:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(".postBindSetup()");
	//    8   16:aload_2         
	//    9   17:ldc2            #496 <String ".postBindSetup()">
	//   10   20:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		if(paymentconfirmactivity.i.equals(((Object) (com.paypal.android.sdk.payments.cl.a))))
	//*  12   24:aload_0         
	//*  13   25:getfield        #270 <Field cl i>
	//*  14   28:getstatic       #274 <Field cl com.paypal.android.sdk.payments.cl.a>
	//*  15   31:invokevirtual   #500 <Method boolean cl.equals(Object)>
	//*  16   34:ifeq            62
		{
			obj = ((Object) (cd.b(paymentconfirmactivity.k.d().a())));
	//   17   37:aload_0         
	//   18   38:getfield        #78  <Field PayPalService k>
	//   19   41:invokevirtual   #304 <Method PayPalConfiguration PayPalService.d()>
	//   20   44:invokevirtual   #502 <Method String com.paypal.android.sdk.payments.PayPalConfiguration.a()>
	//   21   47:invokestatic    #507 <Method android.text.SpannableString cd.b(String)>
	//   22   50:astore_2        
			paymentconfirmactivity.g.a(((android.text.SpannableString) (obj)));
	//   23   51:aload_0         
	//   24   52:getfield        #241 <Field fl g>
	//   25   55:aload_2         
	//   26   56:invokevirtual   #510 <Method void fl.a(android.text.SpannableString)>
		} else
	//*  27   59:goto            70
		{
			paymentconfirmactivity.g.a(((android.text.SpannableString) (null)));
	//   28   62:aload_0         
	//   29   63:getfield        #241 <Field fl g>
	//   30   66:aconst_null     
	//   31   67:invokevirtual   #510 <Method void fl.a(android.text.SpannableString)>
		}
		obj = ((Object) (paymentconfirmactivity.b));
	//   32   70:aload_0         
	//   33   71:getfield        #202 <Field com.paypal.android.sdk.payments.ck b>
	//   34   74:astore_2        
		if(obj != null)
	//*  35   75:aload_2         
	//*  36   76:ifnull          99
		{
			paymentconfirmactivity.a(((com.paypal.android.sdk.payments.ck) (obj)).a, paymentconfirmactivity.b.b);
	//   37   79:aload_0         
	//   38   80:aload_2         
	//   39   81:getfield        #511 <Field String com.paypal.android.sdk.payments.ck.a>
	//   40   84:aload_0         
	//   41   85:getfield        #202 <Field com.paypal.android.sdk.payments.ck b>
	//   42   88:getfield        #513 <Field dw ck.b>
	//   43   91:invokespecial   #205 <Method void a(String, dw)>
			paymentconfirmactivity.b = null;
	//   44   94:aload_0         
	//   45   95:aconst_null     
	//   46   96:putfield        #202 <Field com.paypal.android.sdk.payments.ck b>
		}
		if(paymentconfirmactivity.getIntent().getBooleanExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_RESET_PP_REQUEST_ID", false))
	//*  47   99:aload_0         
	//*  48  100:invokevirtual   #227 <Method Intent getIntent()>
	//*  49  103:ldc1            #116 <String "com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_RESET_PP_REQUEST_ID">
	//*  50  105:iconst_0        
	//*  51  106:invokevirtual   #517 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  52  109:ifeq            122
			paymentconfirmactivity.k.c().a();
	//   53  112:aload_0         
	//   54  113:getfield        #78  <Field PayPalService k>
	//   55  116:invokevirtual   #260 <Method ck PayPalService.c()>
	//   56  119:invokevirtual   #519 <Method void ck.a()>
		boolean flag = paymentconfirmactivity.e();
	//   57  122:aload_0         
	//   58  123:invokespecial   #521 <Method boolean e()>
	//   59  126:istore_1        
		if(!paymentconfirmactivity.d)
	//*  60  127:aload_0         
	//*  61  128:getfield        #523 <Field boolean d>
	//*  62  131:ifne            149
		{
			paymentconfirmactivity.d = true;
	//   63  134:aload_0         
	//   64  135:iconst_1        
	//   65  136:putfield        #523 <Field boolean d>
			paymentconfirmactivity.k.a(ed.g);
	//   66  139:aload_0         
	//   67  140:getfield        #78  <Field PayPalService k>
	//   68  143:getstatic       #528 <Field ed ed.g>
	//   69  146:invokevirtual   #531 <Method void com.paypal.android.sdk.payments.PayPalService.a(ed)>
		}
		paymentconfirmactivity.f();
	//   70  149:aload_0         
	//   71  150:invokespecial   #533 <Method void f()>
		paymentconfirmactivity.k.b(((be) (new cg(paymentconfirmactivity))));
	//   72  153:aload_0         
	//   73  154:getfield        #78  <Field PayPalService k>
	//   74  157:new             #535 <Class cg>
	//   75  160:dup             
	//   76  161:aload_0         
	//   77  162:invokespecial   #536 <Method void cg(PaymentConfirmActivity)>
	//   78  165:invokevirtual   #539 <Method void PayPalService.b(be)>
		if(com.paypal.android.sdk.payments.cl.a == paymentconfirmactivity.i && !flag && !paymentconfirmactivity.f && paymentconfirmactivity.c == null)
	//*  79  168:getstatic       #274 <Field cl com.paypal.android.sdk.payments.cl.a>
	//*  80  171:aload_0         
	//*  81  172:getfield        #270 <Field cl i>
	//*  82  175:if_acmpne       200
	//*  83  178:iload_1         
	//*  84  179:ifne            200
	//*  85  182:aload_0         
	//*  86  183:getfield        #376 <Field boolean f>
	//*  87  186:ifne            200
	//*  88  189:aload_0         
	//*  89  190:getfield        #226 <Field dx c>
	//*  90  193:ifnonnull       200
			paymentconfirmactivity.i();
	//   91  196:aload_0         
	//   92  197:invokespecial   #541 <Method void i()>
	//   93  200:return          
	}

	static void b(PaymentConfirmActivity paymentconfirmactivity, List list, int i1)
	{
		paymentconfirmactivity.h.b().b(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field bs h>
	//    2    4:invokevirtual   #237 <Method dx bs.b()>
	//    3    7:iload_2         
	//    4    8:invokevirtual   #543 <Method void dx.b(int)>
		paymentconfirmactivity.g.a(((android.content.Context) (paymentconfirmactivity)), (fs)list.get(i1));
	//    5   11:aload_0         
	//    6   12:getfield        #241 <Field fl g>
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:invokeinterface #246 <Method Object List.get(int)>
	//   11   23:checkcast       #422 <Class fs>
	//   12   26:invokevirtual   #451 <Method void fl.a(android.content.Context, fs)>
	//   13   29:return          
	}

	static void b(PaymentConfirmActivity paymentconfirmactivity, boolean flag)
	{
		paymentconfirmactivity.a(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #546 <Method void a(boolean)>
	//    3    5:return          
	}

	static PayPalService c(PaymentConfirmActivity paymentconfirmactivity)
	{
		return paymentconfirmactivity.k;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field PayPalService k>
	//    2    4:areturn         
	}

	private void c()
	{
		if(k.c().g != null && !k.c().g.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field PayPalService k>
	//*   2    4:invokevirtual   #260 <Method ck PayPalService.c()>
	//*   3    7:getfield        #268 <Field dw ck.g>
	//*   4   10:ifnull          51
	//*   5   13:aload_0         
	//*   6   14:getfield        #78  <Field PayPalService k>
	//*   7   17:invokevirtual   #260 <Method ck PayPalService.c()>
	//*   8   20:getfield        #268 <Field dw ck.g>
	//*   9   23:invokevirtual   #548 <Method boolean dw.a()>
	//*  10   26:ifne            51
		{
			k.c().g = null;
	//   11   29:aload_0         
	//   12   30:getfield        #78  <Field PayPalService k>
	//   13   33:invokevirtual   #260 <Method ck PayPalService.c()>
	//   14   36:aconst_null     
	//   15   37:putfield        #268 <Field dw ck.g>
			k.c().c = null;
	//   16   40:aload_0         
	//   17   41:getfield        #78  <Field PayPalService k>
	//   18   44:invokevirtual   #260 <Method ck PayPalService.c()>
	//   19   47:aconst_null     
	//   20   48:putfield        #264 <Field String ck.c>
		}
	//   21   51:return          
	}

	static bs d(PaymentConfirmActivity paymentconfirmactivity)
	{
		return paymentconfirmactivity.h;
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field bs h>
	//    2    4:areturn         
	}

	private void d()
	{
		m = bindService(cd.b(((Activity) (this))), l, 1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:invokestatic    #554 <Method Intent cd.b(Activity)>
	//    4    6:aload_0         
	//    5    7:getfield        #42  <Field ServiceConnection l>
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #558 <Method boolean bindService(Intent, ServiceConnection, int)>
	//    8   14:putfield        #560 <Field boolean m>
	//    9   17:return          
	}

	static void e(PaymentConfirmActivity paymentconfirmactivity)
	{
		paymentconfirmactivity.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #562 <Method void c()>
	//    2    4:return          
	}

	private boolean e()
	{
		if(i.equals(((Object) (com.paypal.android.sdk.payments.cl.a))) && !k.j() && !e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #270 <Field cl i>
	//*   2    4:getstatic       #274 <Field cl com.paypal.android.sdk.payments.cl.a>
	//*   3    7:invokevirtual   #500 <Method boolean cl.equals(Object)>
	//*   4   10:ifeq            42
	//*   5   13:aload_0         
	//*   6   14:getfield        #78  <Field PayPalService k>
	//*   7   17:invokevirtual   #564 <Method boolean PayPalService.j()>
	//*   8   20:ifne            42
	//*   9   23:aload_0         
	//*  10   24:getfield        #566 <Field boolean e>
	//*  11   27:ifne            42
		{
			e = true;
	//   12   30:aload_0         
	//   13   31:iconst_1        
	//   14   32:putfield        #566 <Field boolean e>
			a(false);
	//   15   35:aload_0         
	//   16   36:iconst_0        
	//   17   37:invokespecial   #546 <Method void a(boolean)>
			return true;
	//   18   40:iconst_1        
	//   19   41:ireturn         
		} else
		{
			return false;
	//   20   42:iconst_0        
	//   21   43:ireturn         
		}
	}

	private void f()
	{
		PayPalPayment paypalpayment = h.a();
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field bs h>
	//    2    4:invokevirtual   #217 <Method PayPalPayment com.paypal.android.sdk.payments.bs.a()>
	//    3    7:astore_3        
		Object obj = ((Object) (ci.a()));
	//    4    8:invokestatic    #571 <Method ci ci.a()>
	//    5   11:astore          4
		obj = ((Object) (dj.a(Locale.getDefault(), ((ci) (obj)).c().a(), paypalpayment.c().doubleValue(), paypalpayment.f(), true)));
	//    6   13:invokestatic    #577 <Method Locale Locale.getDefault()>
	//    7   16:aload           4
	//    8   18:invokevirtual   #580 <Method ei ci.c()>
	//    9   21:invokevirtual   #583 <Method String ei.a()>
	//   10   24:aload_3         
	//   11   25:invokevirtual   #52  <Method BigDecimal PayPalPayment.c()>
	//   12   28:invokevirtual   #56  <Method double BigDecimal.doubleValue()>
	//   13   31:aload_3         
	//   14   32:invokevirtual   #59  <Method String PayPalPayment.f()>
	//   15   35:iconst_1        
	//   16   36:invokestatic    #586 <Method String dj.a(Locale, String, double, String, boolean)>
	//   17   39:astore          4
		g.a(paypalpayment.d(), ((String) (obj)));
	//   18   41:aload_0         
	//   19   42:getfield        #241 <Field fl g>
	//   20   45:aload_3         
	//   21   46:invokevirtual   #588 <Method String PayPalPayment.d()>
	//   22   49:aload           4
	//   23   51:invokevirtual   #591 <Method void fl.a(String, String)>
		if(i == com.paypal.android.sdk.payments.cl.a)
	//*  24   54:aload_0         
	//*  25   55:getfield        #270 <Field cl i>
	//*  26   58:getstatic       #274 <Field cl com.paypal.android.sdk.payments.cl.a>
	//*  27   61:if_acmpne       86
		{
			g.a(true);
	//   28   64:aload_0         
	//   29   65:getfield        #241 <Field fl g>
	//   30   68:iconst_1        
	//   31   69:invokevirtual   #592 <Method void fl.a(boolean)>
			a(k.r());
	//   32   72:aload_0         
	//   33   73:aload_0         
	//   34   74:getfield        #78  <Field PayPalService k>
	//   35   77:invokevirtual   #595 <Method String PayPalService.r()>
	//   36   80:invokespecial   #265 <Method void a(String)>
		} else
	//*  37   83:goto            301
		if(i != cl.b && i != cl.c)
	//*  38   86:aload_0         
	//*  39   87:getfield        #270 <Field cl i>
	//*  40   90:getstatic       #597 <Field cl cl.b>
	//*  41   93:if_acmpeq       159
	//*  42   96:aload_0         
	//*  43   97:getfield        #270 <Field cl i>
	//*  44  100:getstatic       #599 <Field cl cl.c>
	//*  45  103:if_acmpne       109
	//*  46  106:goto            159
		{
			String s = a;
	//   47  109:getstatic       #80  <Field String a>
	//   48  112:astore_3        
			StringBuilder stringbuilder = new StringBuilder("Unknown payment type: ");
	//   49  113:new             #279 <Class StringBuilder>
	//   50  116:dup             
	//   51  117:ldc2            #601 <String "Unknown payment type: ">
	//   52  120:invokespecial   #336 <Method void StringBuilder(String)>
	//   53  123:astore          4
			stringbuilder.append(i.toString());
	//   54  125:aload           4
	//   55  127:aload_0         
	//   56  128:getfield        #270 <Field cl i>
	//   57  131:invokevirtual   #602 <Method String cl.toString()>
	//   58  134:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   59  137:pop             
			Log.wtf(s, stringbuilder.toString());
	//   60  138:aload_3         
	//   61  139:aload           4
	//   62  141:invokevirtual   #357 <Method String StringBuilder.toString()>
	//   63  144:invokestatic    #605 <Method int Log.wtf(String, String)>
	//   64  147:pop             
			com.paypal.android.sdk.payments.cd.a(((Activity) (this)), "The payment is not a valid type. Please try again.", 3);
	//   65  148:aload_0         
	//   66  149:ldc2            #607 <String "The payment is not a valid type. Please try again.">
	//   67  152:iconst_3        
	//   68  153:invokestatic    #610 <Method void com.paypal.android.sdk.payments.cd.a(Activity, String, int)>
		} else
	//*  69  156:goto            301
		{
			g.a(false);
	//   70  159:aload_0         
	//   71  160:getfield        #241 <Field fl g>
	//   72  163:iconst_0        
	//   73  164:invokevirtual   #592 <Method void fl.a(boolean)>
			int i1;
			int j1;
			String s1;
			Object obj1;
			if(i == cl.b)
	//*  74  167:aload_0         
	//*  75  168:getfield        #270 <Field cl i>
	//*  76  171:getstatic       #597 <Field cl cl.b>
	//*  77  174:if_acmpne       222
			{
				s1 = dt.a(com.paypal.android.sdk.payments.cd.a(j));
	//   78  177:aload_0         
	//   79  178:getfield        #612 <Field Parcelable j>
	//   80  181:invokestatic    #615 <Method String com.paypal.android.sdk.payments.cd.a(Parcelable)>
	//   81  184:invokestatic    #619 <Method String dt.a(String)>
	//   82  187:astore_3        
				i1 = cd.b(j, "expiryMonth");
	//   83  188:aload_0         
	//   84  189:getfield        #612 <Field Parcelable j>
	//   85  192:ldc2            #621 <String "expiryMonth">
	//   86  195:invokestatic    #624 <Method int cd.b(Parcelable, String)>
	//   87  198:istore_1        
				j1 = cd.b(j, "expiryYear");
	//   88  199:aload_0         
	//   89  200:getfield        #612 <Field Parcelable j>
	//   90  203:ldc2            #626 <String "expiryYear">
	//   91  206:invokestatic    #624 <Method int cd.b(Parcelable, String)>
	//   92  209:istore_2        
				obj1 = ((Object) (cd.b(j)));
	//   93  210:aload_0         
	//   94  211:getfield        #612 <Field Parcelable j>
	//   95  214:invokestatic    #629 <Method Enum cd.b(Parcelable)>
	//   96  217:astore          4
			} else
	//*  97  219:goto            256
			{
				obj1 = ((Object) (k.s()));
	//   98  222:aload_0         
	//   99  223:getfield        #78  <Field PayPalService k>
	//  100  226:invokevirtual   #633 <Method dt PayPalService.s()>
	//  101  229:astore          4
				s1 = ((dt) (obj1)).d();
	//  102  231:aload           4
	//  103  233:invokevirtual   #634 <Method String dt.d()>
	//  104  236:astore_3        
				i1 = ((dt) (obj1)).f();
	//  105  237:aload           4
	//  106  239:invokevirtual   #636 <Method int dt.f()>
	//  107  242:istore_1        
				j1 = ((dt) (obj1)).g();
	//  108  243:aload           4
	//  109  245:invokevirtual   #637 <Method int dt.g()>
	//  110  248:istore_2        
				obj1 = ((Object) (com.paypal.android.sdk.payments.cd.a(((dt) (obj1)))));
	//  111  249:aload           4
	//  112  251:invokestatic    #640 <Method Enum com.paypal.android.sdk.payments.cd.a(dt)>
	//  113  254:astore          4
			}
			String s2 = String.format(Locale.getDefault(), "%02d / %04d", new Object[] {
				Integer.valueOf(i1), Integer.valueOf(j1)
			});
	//  114  256:invokestatic    #577 <Method Locale Locale.getDefault()>
	//  115  259:ldc2            #642 <String "%02d / %04d">
	//  116  262:iconst_2        
	//  117  263:anewarray       Object[]
	//  118  266:dup             
	//  119  267:iconst_0        
	//  120  268:iload_1         
	//  121  269:invokestatic    #648 <Method Integer Integer.valueOf(int)>
	//  122  272:aastore         
	//  123  273:dup             
	//  124  274:iconst_1        
	//  125  275:iload_2         
	//  126  276:invokestatic    #648 <Method Integer Integer.valueOf(int)>
	//  127  279:aastore         
	//  128  280:invokestatic    #651 <Method String String.format(Locale, String, Object[])>
	//  129  283:astore          5
			g.a(s1, com.paypal.android.sdk.payments.cd.a(((Activity) (this)), ((Enum) (obj1))), s2);
	//  130  285:aload_0         
	//  131  286:getfield        #241 <Field fl g>
	//  132  289:aload_3         
	//  133  290:aload_0         
	//  134  291:aload           4
	//  135  293:invokestatic    #654 <Method android.graphics.Bitmap com.paypal.android.sdk.payments.cd.a(Activity, Enum)>
	//  136  296:aload           5
	//  137  298:invokevirtual   #657 <Method void fl.a(String, android.graphics.Bitmap, String)>
		}
		com.paypal.android.sdk.payments.cd.a(g.d(), k.e());
	//  138  301:aload_0         
	//  139  302:getfield        #241 <Field fl g>
	//  140  305:invokevirtual   #660 <Method android.widget.TextView fl.d()>
	//  141  308:aload_0         
	//  142  309:getfield        #78  <Field PayPalService k>
	//  143  312:invokevirtual   #661 <Method String PayPalService.e()>
	//  144  315:invokestatic    #664 <Method void com.paypal.android.sdk.payments.cd.a(android.widget.TextView, String)>
	//  145  318:return          
	}

	static void f(PaymentConfirmActivity paymentconfirmactivity)
	{
		paymentconfirmactivity.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #233 <Method void j()>
	//    2    4:return          
	}

	static cl g(PaymentConfirmActivity paymentconfirmactivity)
	{
		return paymentconfirmactivity.i;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field cl i>
	//    2    4:areturn         
	}

	private void g()
	{
		boolean flag;
label0:
		{
			int i1 = com.paypal.android.sdk.payments.bx.a[i.ordinal()];
	//    0    0:getstatic       #670 <Field int[] com.paypal.android.sdk.payments.bx.a>
	//    1    3:aload_0         
	//    2    4:getfield        #270 <Field cl i>
	//    3    7:invokevirtual   #673 <Method int cl.ordinal()>
	//    4   10:iaload          
	//    5   11:istore_2        
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
			switch(i1)
	//*   8   14:iload_2         
			{
			default:
				break;

	//*   9   15:tableswitch     1 3: default 40
	//	               1 97
	//	               2 43
	//	               3 43
	//*  10   40:goto            104
			case 2: // '\002'
			case 3: // '\003'
				if(k.i())
					break;
	//   11   43:aload_0         
	//   12   44:getfield        #78  <Field PayPalService k>
	//   13   47:invokevirtual   #675 <Method boolean PayPalService.i()>
	//   14   50:ifne            104
				showDialog(2);
	//   15   53:aload_0         
	//   16   54:iconst_2        
	//   17   55:invokevirtual   #678 <Method void showDialog(int)>
				(new StringBuilder("token is expired, get new one. AccessToken: ")).append(((Object) (k.c().b)));
	//   18   58:new             #279 <Class StringBuilder>
	//   19   61:dup             
	//   20   62:ldc2            #680 <String "token is expired, get new one. AccessToken: ">
	//   21   65:invokespecial   #336 <Method void StringBuilder(String)>
	//   22   68:aload_0         
	//   23   69:getfield        #78  <Field PayPalService k>
	//   24   72:invokevirtual   #260 <Method ck PayPalService.c()>
	//   25   75:getfield        #681 <Field dw ck.b>
	//   26   78:invokevirtual   #339 <Method StringBuilder StringBuilder.append(Object)>
	//   27   81:pop             
				k.a(h(), true);
	//   28   82:aload_0         
	//   29   83:getfield        #78  <Field PayPalService k>
	//   30   86:aload_0         
	//   31   87:invokespecial   #684 <Method bh h()>
	//   32   90:iconst_1        
	//   33   91:invokevirtual   #687 <Method void com.paypal.android.sdk.payments.PayPalService.a(bh, boolean)>
				break label0;
	//   34   94:goto            106

			case 1: // '\001'
				if(e())
					break label0;
	//   35   97:aload_0         
	//   36   98:invokespecial   #521 <Method boolean e()>
	//   37  101:ifne            106
				break;
			}
			flag = true;
	//   38  104:iconst_1        
	//   39  105:istore_1        
		}
		if(!flag)
	//*  40  106:iload_1         
	//*  41  107:ifne            111
			return;
	//   42  110:return          
		showDialog(2);
	//   43  111:aload_0         
	//   44  112:iconst_2        
	//   45  113:invokevirtual   #678 <Method void showDialog(int)>
		bs bs1 = h;
	//   46  116:aload_0         
	//   47  117:getfield        #212 <Field bs h>
	//   48  120:astore          4
		if(bs1 != null && bs1.a() != null && (i != com.paypal.android.sdk.payments.cl.a || h.b() != null))
	//*  49  122:aload           4
	//*  50  124:ifnull          534
	//*  51  127:aload           4
	//*  52  129:invokevirtual   #217 <Method PayPalPayment com.paypal.android.sdk.payments.bs.a()>
	//*  53  132:ifnull          534
	//*  54  135:aload_0         
	//*  55  136:getfield        #270 <Field cl i>
	//*  56  139:getstatic       #274 <Field cl com.paypal.android.sdk.payments.cl.a>
	//*  57  142:if_acmpne       158
	//*  58  145:aload_0         
	//*  59  146:getfield        #212 <Field bs h>
	//*  60  149:invokevirtual   #237 <Method dx bs.b()>
	//*  61  152:ifnonnull       158
	//*  62  155:goto            534
		{
			PayPalPayment paypalpayment = h.a();
	//   63  158:aload_0         
	//   64  159:getfield        #212 <Field bs h>
	//   65  162:invokevirtual   #217 <Method PayPalPayment com.paypal.android.sdk.payments.bs.a()>
	//   66  165:astore          6
			Object obj = ((Object) (a(paypalpayment)));
	//   67  167:aload           6
	//   68  169:invokestatic    #689 <Method er a(PayPalPayment)>
	//   69  172:astore          4
			Object obj1 = ((Object) (b(paypalpayment)));
	//   70  174:aload           6
	//   71  176:invokestatic    #691 <Method Map b(PayPalPayment)>
	//   72  179:astore          5
			Object obj2 = ((Object) (paypalpayment.d()));
	//   73  181:aload           6
	//   74  183:invokevirtual   #588 <Method String PayPalPayment.d()>
	//   75  186:astore          7
			boolean flag1 = k.d().j();
	//   76  188:aload_0         
	//   77  189:getfield        #78  <Field PayPalService k>
	//   78  192:invokevirtual   #304 <Method PayPalConfiguration PayPalService.d()>
	//   79  195:invokevirtual   #692 <Method boolean PayPalConfiguration.j()>
	//   80  198:istore_3        
			String s;
			String s2;
			switch(com.paypal.android.sdk.payments.bx.a[i.ordinal()])
	//*  81  199:getstatic       #670 <Field int[] com.paypal.android.sdk.payments.bx.a>
	//*  82  202:aload_0         
	//*  83  203:getfield        #270 <Field cl i>
	//*  84  206:invokevirtual   #673 <Method int cl.ordinal()>
	//*  85  209:iaload          
			{
	//*  86  210:tableswitch     1 3: default 236
	//	               1 443
	//	               2 353
	//	               3 237
			default:
				return;
	//   87  236:return          

			case 3: // '\003'
				PayPalService paypalservice = k;
	//   88  237:aload_0         
	//   89  238:getfield        #78  <Field PayPalService k>
	//   90  241:astore          8
				paypalservice.a(paypalservice.c().b(), cd.b(j).name().toLowerCase(Locale.US), com.paypal.android.sdk.payments.cd.a(j, "cardNumber"), com.paypal.android.sdk.payments.cd.a(j, "cvv"), cd.b(j, "expiryMonth"), cd.b(j, "expiryYear"), ((er) (obj)), ((Map) (obj1)), paypalpayment.j(), ((String) (obj2)), flag1, paypalpayment.g(), paypalpayment.e().toString(), paypalpayment.k(), paypalpayment.l(), paypalpayment.m());
	//   91  243:aload           8
	//   92  245:aload           8
	//   93  247:invokevirtual   #260 <Method ck PayPalService.c()>
	//   94  250:invokevirtual   #694 <Method String ck.b()>
	//   95  253:aload_0         
	//   96  254:getfield        #612 <Field Parcelable j>
	//   97  257:invokestatic    #629 <Method Enum cd.b(Parcelable)>
	//   98  260:invokevirtual   #699 <Method String Enum.name()>
	//   99  263:getstatic       #703 <Field Locale Locale.US>
	//  100  266:invokevirtual   #707 <Method String String.toLowerCase(Locale)>
	//  101  269:aload_0         
	//  102  270:getfield        #612 <Field Parcelable j>
	//  103  273:ldc2            #709 <String "cardNumber">
	//  104  276:invokestatic    #712 <Method String com.paypal.android.sdk.payments.cd.a(Parcelable, String)>
	//  105  279:aload_0         
	//  106  280:getfield        #612 <Field Parcelable j>
	//  107  283:ldc2            #714 <String "cvv">
	//  108  286:invokestatic    #712 <Method String com.paypal.android.sdk.payments.cd.a(Parcelable, String)>
	//  109  289:aload_0         
	//  110  290:getfield        #612 <Field Parcelable j>
	//  111  293:ldc2            #621 <String "expiryMonth">
	//  112  296:invokestatic    #624 <Method int cd.b(Parcelable, String)>
	//  113  299:aload_0         
	//  114  300:getfield        #612 <Field Parcelable j>
	//  115  303:ldc2            #626 <String "expiryYear">
	//  116  306:invokestatic    #624 <Method int cd.b(Parcelable, String)>
	//  117  309:aload           4
	//  118  311:aload           5
	//  119  313:aload           6
	//  120  315:invokevirtual   #717 <Method PayPalItem[] PayPalPayment.j()>
	//  121  318:aload           7
	//  122  320:iload_3         
	//  123  321:aload           6
	//  124  323:invokevirtual   #719 <Method String PayPalPayment.g()>
	//  125  326:aload           6
	//  126  328:invokevirtual   #720 <Method String PayPalPayment.e()>
	//  127  331:invokevirtual   #721 <Method String String.toString()>
	//  128  334:aload           6
	//  129  336:invokevirtual   #722 <Method String PayPalPayment.k()>
	//  130  339:aload           6
	//  131  341:invokevirtual   #724 <Method String PayPalPayment.l()>
	//  132  344:aload           6
	//  133  346:invokevirtual   #726 <Method String PayPalPayment.m()>
	//  134  349:invokevirtual   #729 <Method void com.paypal.android.sdk.payments.PayPalService.a(String, String, String, String, int, int, er, Map, PayPalItem[], String, boolean, String, String, String, String, String)>
				return;
	//  135  352:return          

			case 2: // '\002'
				dt dt1 = k.s();
	//  136  353:aload_0         
	//  137  354:getfield        #78  <Field PayPalService k>
	//  138  357:invokevirtual   #633 <Method dt PayPalService.s()>
	//  139  360:astore          8
				String s1 = k.a(dt1.a());
	//  140  362:aload_0         
	//  141  363:getfield        #78  <Field PayPalService k>
	//  142  366:aload           8
	//  143  368:invokevirtual   #730 <Method String dt.a()>
	//  144  371:invokevirtual   #731 <Method String com.paypal.android.sdk.payments.PayPalService.a(String)>
	//  145  374:astore          9
				PayPalService paypalservice1 = k;
	//  146  376:aload_0         
	//  147  377:getfield        #78  <Field PayPalService k>
	//  148  380:astore          10
				paypalservice1.a(paypalservice1.c().b(), dt1.e(), ((er) (obj)), ((Map) (obj1)), paypalpayment.j(), ((String) (obj2)), flag1, s1, paypalpayment.g(), paypalpayment.e().toString(), paypalpayment.k(), paypalpayment.l(), paypalpayment.m());
	//  149  382:aload           10
	//  150  384:aload           10
	//  151  386:invokevirtual   #260 <Method ck PayPalService.c()>
	//  152  389:invokevirtual   #694 <Method String ck.b()>
	//  153  392:aload           8
	//  154  394:invokevirtual   #732 <Method String dt.e()>
	//  155  397:aload           4
	//  156  399:aload           5
	//  157  401:aload           6
	//  158  403:invokevirtual   #717 <Method PayPalItem[] PayPalPayment.j()>
	//  159  406:aload           7
	//  160  408:iload_3         
	//  161  409:aload           9
	//  162  411:aload           6
	//  163  413:invokevirtual   #719 <Method String PayPalPayment.g()>
	//  164  416:aload           6
	//  165  418:invokevirtual   #720 <Method String PayPalPayment.e()>
	//  166  421:invokevirtual   #721 <Method String String.toString()>
	//  167  424:aload           6
	//  168  426:invokevirtual   #722 <Method String PayPalPayment.k()>
	//  169  429:aload           6
	//  170  431:invokevirtual   #724 <Method String PayPalPayment.l()>
	//  171  434:aload           6
	//  172  436:invokevirtual   #726 <Method String PayPalPayment.m()>
	//  173  439:invokevirtual   #735 <Method void com.paypal.android.sdk.payments.PayPalService.a(String, String, er, Map, PayPalItem[], String, boolean, String, String, String, String, String, String)>
				return;
	//  174  442:return          

			case 1: // '\001'
				obj1 = ((Object) (h.b()));
	//  175  443:aload_0         
	//  176  444:getfield        #212 <Field bs h>
	//  177  447:invokevirtual   #237 <Method dx bs.b()>
	//  178  450:astore          5
				obj2 = ((Object) (k));
	//  179  452:aload_0         
	//  180  453:getfield        #78  <Field PayPalService k>
	//  181  456:astore          7
				s = ((dx) (obj1)).e();
	//  182  458:aload           5
	//  183  460:invokevirtual   #736 <Method String dx.e()>
	//  184  463:astore          8
				s2 = ((dx) (obj1)).f();
	//  185  465:aload           5
	//  186  467:invokevirtual   #737 <Method String dx.f()>
	//  187  470:astore          9
				break;
			}
			if(((dx) (obj1)).k())
	//* 188  472:aload           5
	//* 189  474:invokevirtual   #739 <Method boolean dx.k()>
	//* 190  477:ifeq            490
				obj = ((Object) (((dx) (obj1)).m()));
	//  191  480:aload           5
	//  192  482:invokevirtual   #741 <Method org.json.JSONObject dx.m()>
	//  193  485:astore          4
			else
	//* 194  487:goto            493
				obj = null;
	//  195  490:aconst_null     
	//  196  491:astore          4
			if(((dx) (obj1)).j())
	//* 197  493:aload           5
	//* 198  495:invokevirtual   #742 <Method boolean dx.j()>
	//* 199  498:ifeq            511
				obj1 = ((Object) (((dx) (obj1)).l()));
	//  200  501:aload           5
	//  201  503:invokevirtual   #744 <Method org.json.JSONObject dx.l()>
	//  202  506:astore          5
			else
	//* 203  508:goto            514
				obj1 = null;
	//  204  511:aconst_null     
	//  205  512:astore          5
			((PayPalService) (obj2)).a(flag1, s, s2, ((org.json.JSONObject) (obj)), ((org.json.JSONObject) (obj1)), paypalpayment.g());
	//  206  514:aload           7
	//  207  516:iload_3         
	//  208  517:aload           8
	//  209  519:aload           9
	//  210  521:aload           4
	//  211  523:aload           5
	//  212  525:aload           6
	//  213  527:invokevirtual   #719 <Method String PayPalPayment.g()>
	//  214  530:invokevirtual   #747 <Method void com.paypal.android.sdk.payments.PayPalService.a(boolean, String, String, org.json.JSONObject, org.json.JSONObject, String)>
			return;
	//  215  533:return          
		} else
		{
			onBackPressed();
	//  216  534:aload_0         
	//  217  535:invokevirtual   #750 <Method void onBackPressed()>
			return;
	//  218  538:return          
		}
	}

	private bh h()
	{
		return ((bh) (new bw(this)));
	//    0    0:new             #752 <Class bw>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #753 <Method void bw(PaymentConfirmActivity)>
	//    4    8:areturn         
	}

	static bh h(PaymentConfirmActivity paymentconfirmactivity)
	{
		return paymentconfirmactivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #684 <Method bh h()>
	//    2    4:areturn         
	}

	static fl i(PaymentConfirmActivity paymentconfirmactivity)
	{
		return paymentconfirmactivity.g;
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field fl g>
	//    2    4:areturn         
	}

	private void i()
	{
		PayPalService paypalservice = k;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field PayPalService k>
	//    2    4:astore_2        
		if(paypalservice != null && paypalservice.c().g != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          128
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #260 <Method ck PayPalService.c()>
	//*   7   13:getfield        #268 <Field dw ck.g>
	//*   8   16:ifnull          128
		{
			showDialog(2);
	//    9   19:aload_0         
	//   10   20:iconst_2        
	//   11   21:invokevirtual   #678 <Method void showDialog(int)>
			PayPalPayment paypalpayment = h.a();
	//   12   24:aload_0         
	//   13   25:getfield        #212 <Field bs h>
	//   14   28:invokevirtual   #217 <Method PayPalPayment com.paypal.android.sdk.payments.bs.a()>
	//   15   31:astore_2        
			er er1 = a(paypalpayment);
	//   16   32:aload_2         
	//   17   33:invokestatic    #689 <Method er a(PayPalPayment)>
	//   18   36:astore_3        
			Map map = b(paypalpayment);
	//   19   37:aload_2         
	//   20   38:invokestatic    #691 <Method Map b(PayPalPayment)>
	//   21   41:astore          4
			String s = paypalpayment.d();
	//   22   43:aload_2         
	//   23   44:invokevirtual   #588 <Method String PayPalPayment.d()>
	//   24   47:astore          5
			boolean flag = k.d().j();
	//   25   49:aload_0         
	//   26   50:getfield        #78  <Field PayPalService k>
	//   27   53:invokevirtual   #304 <Method PayPalConfiguration PayPalService.d()>
	//   28   56:invokevirtual   #692 <Method boolean PayPalConfiguration.j()>
	//   29   59:istore_1        
			k.a(er1, map, paypalpayment.j(), s, flag, paypalpayment.g(), paypalpayment.e().toString(), paypalpayment.n(), paypalpayment.k(), paypalpayment.l(), paypalpayment.m(), paypalpayment.a(), paypalpayment.h());
	//   30   60:aload_0         
	//   31   61:getfield        #78  <Field PayPalService k>
	//   32   64:aload_3         
	//   33   65:aload           4
	//   34   67:aload_2         
	//   35   68:invokevirtual   #717 <Method PayPalItem[] PayPalPayment.j()>
	//   36   71:aload           5
	//   37   73:iload_1         
	//   38   74:aload_2         
	//   39   75:invokevirtual   #719 <Method String PayPalPayment.g()>
	//   40   78:aload_2         
	//   41   79:invokevirtual   #720 <Method String PayPalPayment.e()>
	//   42   82:invokevirtual   #721 <Method String String.toString()>
	//   43   85:aload_2         
	//   44   86:invokevirtual   #758 <Method boolean PayPalPayment.n()>
	//   45   89:aload_2         
	//   46   90:invokevirtual   #722 <Method String PayPalPayment.k()>
	//   47   93:aload_2         
	//   48   94:invokevirtual   #724 <Method String PayPalPayment.l()>
	//   49   97:aload_2         
	//   50   98:invokevirtual   #726 <Method String PayPalPayment.m()>
	//   51  101:aload_2         
	//   52  102:invokevirtual   #427 <Method boolean com.paypal.android.sdk.payments.PayPalPayment.a()>
	//   53  105:aload_2         
	//   54  106:invokevirtual   #760 <Method String PayPalPayment.h()>
	//   55  109:invokevirtual   #763 <Method void com.paypal.android.sdk.payments.PayPalService.a(er, Map, PayPalItem[], String, boolean, String, String, boolean, String, String, String, boolean, String)>
			f = true;
	//   56  112:aload_0         
	//   57  113:iconst_1        
	//   58  114:putfield        #376 <Field boolean f>
			a(k.r());
	//   59  117:aload_0         
	//   60  118:aload_0         
	//   61  119:getfield        #78  <Field PayPalService k>
	//   62  122:invokevirtual   #595 <Method String PayPalService.r()>
	//   63  125:invokespecial   #265 <Method void a(String)>
		}
	//   64  128:return          
	}

	private void j()
	{
		try
		{
			dismissDialog(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #768 <Method void dismissDialog(int)>
			return;
	//    3    5:return          
		}
		catch(IllegalArgumentException illegalargumentexception)
	//*   4    6:astore_1        
		{
			return;
	//    5    7:return          
		}
	}

	static void j(PaymentConfirmActivity paymentconfirmactivity)
	{
		paymentconfirmactivity.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #541 <Method void i()>
	//    2    4:return          
	}

	static void k(PaymentConfirmActivity paymentconfirmactivity)
	{
		paymentconfirmactivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #207 <Method void g()>
	//    2    4:return          
	}

	public final void finish()
	{
		super.finish();
	//    0    0:aload_0         
	//    1    1:invokespecial   #771 <Method void Activity.finish()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #279 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #280 <Method void StringBuilder()>
	//    5   11:astore_1        
		stringbuilder.append(a);
	//    6   12:aload_1         
	//    7   13:getstatic       #80  <Field String a>
	//    8   16:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(".finish");
	//   10   20:aload_1         
	//   11   21:ldc2            #773 <String ".finish">
	//   12   24:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
	//   14   28:return          
	}

	protected final void onActivityResult(int i1, int j1, Intent intent)
	{
		super.onActivityResult(i1, j1, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #777 <Method void Activity.onActivityResult(int, int, Intent)>
		StringBuilder stringbuilder = new StringBuilder();
	//    5    7:new             #279 <Class StringBuilder>
	//    6   10:dup             
	//    7   11:invokespecial   #280 <Method void StringBuilder()>
	//    8   14:astore          4
		stringbuilder.append(a);
	//    9   16:aload           4
	//   10   18:getstatic       #80  <Field String a>
	//   11   21:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(".onActivityResult(requestCode:");
	//   13   25:aload           4
	//   14   27:ldc2            #779 <String ".onActivityResult(requestCode:">
	//   15   30:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		stringbuilder.append(i1);
	//   17   34:aload           4
	//   18   36:iload_1         
	//   19   37:invokevirtual   #782 <Method StringBuilder StringBuilder.append(int)>
	//   20   40:pop             
		stringbuilder.append(", resultCode:");
	//   21   41:aload           4
	//   22   43:ldc2            #784 <String ", resultCode:">
	//   23   46:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
		stringbuilder.append(j1);
	//   25   50:aload           4
	//   26   52:iload_2         
	//   27   53:invokevirtual   #782 <Method StringBuilder StringBuilder.append(int)>
	//   28   56:pop             
		stringbuilder.append(", data:");
	//   29   57:aload           4
	//   30   59:ldc2            #786 <String ", data:">
	//   31   62:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   32   65:pop             
		stringbuilder.append(((Object) (intent)));
	//   33   66:aload           4
	//   34   68:aload_3         
	//   35   69:invokevirtual   #339 <Method StringBuilder StringBuilder.append(Object)>
	//   36   72:pop             
		stringbuilder.append(")");
	//   37   73:aload           4
	//   38   75:ldc2            #343 <String ")">
	//   39   78:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   40   81:pop             
		i1;
	//   41   82:iload_1         
		JVM INSTR tableswitch 1 2: default 104
	//	               1 186
	//	               2 138;
	//   42   83:tableswitch     1 2: default 104
	//	               1 186
	//	               2 138
		   goto _L1 _L2 _L3
_L1:
		intent = ((Intent) (a));
	//   43  104:getstatic       #80  <Field String a>
	//   44  107:astore_3        
		StringBuilder stringbuilder1 = new StringBuilder("unhandled requestCode ");
	//   45  108:new             #279 <Class StringBuilder>
	//   46  111:dup             
	//   47  112:ldc2            #788 <String "unhandled requestCode ">
	//   48  115:invokespecial   #336 <Method void StringBuilder(String)>
	//   49  118:astore          4
		stringbuilder1.append(i1);
	//   50  120:aload           4
	//   51  122:iload_1         
	//   52  123:invokevirtual   #782 <Method StringBuilder StringBuilder.append(int)>
	//   53  126:pop             
		Log.e(((String) (intent)), stringbuilder1.toString());
	//   54  127:aload_3         
	//   55  128:aload           4
	//   56  130:invokevirtual   #357 <Method String StringBuilder.toString()>
	//   57  133:invokestatic    #790 <Method int Log.e(String, String)>
	//   58  136:pop             
		return;
	//   59  137:return          
_L3:
		e = false;
	//   60  138:aload_0         
	//   61  139:iconst_0        
	//   62  140:putfield        #566 <Field boolean e>
		if(j1 == -1)
	//*  63  143:iload_2         
	//*  64  144:iconst_m1       
	//*  65  145:icmpne          176
		{
			g.b(true);
	//   66  148:aload_0         
	//   67  149:getfield        #241 <Field fl g>
	//   68  152:iconst_1        
	//   69  153:invokevirtual   #277 <Method void fl.b(boolean)>
			a(intent.getExtras());
	//   70  156:aload_0         
	//   71  157:aload_3         
	//   72  158:invokevirtual   #794 <Method Bundle Intent.getExtras()>
	//   73  161:invokespecial   #796 <Method void a(Bundle)>
			if(k != null)
	//*  74  164:aload_0         
	//*  75  165:getfield        #78  <Field PayPalService k>
	//*  76  168:ifnull          221
			{
				i();
	//   77  171:aload_0         
	//   78  172:invokespecial   #541 <Method void i()>
				return;
	//   79  175:return          
			}
			break; /* Loop/switch isn't completed */
		}
_L5:
		a(j1);
	//   80  176:aload_0         
	//   81  177:iload_2         
	//   82  178:invokespecial   #797 <Method void a(int)>
		finish();
	//   83  181:aload_0         
	//   84  182:invokevirtual   #798 <Method void finish()>
		return;
	//   85  185:return          
_L2:
		e = false;
	//   86  186:aload_0         
	//   87  187:iconst_0        
	//   88  188:putfield        #566 <Field boolean e>
		if(j1 != -1)
			continue; /* Loop/switch isn't completed */
	//   89  191:iload_2         
	//   90  192:iconst_m1       
	//   91  193:icmpne          176
		intent = ((Intent) (g));
	//   92  196:aload_0         
	//   93  197:getfield        #241 <Field fl g>
	//   94  200:astore_3        
		if(intent != null)
	//*  95  201:aload_3         
	//*  96  202:ifnull          210
			((fl) (intent)).b(false);
	//   97  205:aload_3         
	//   98  206:iconst_0        
	//   99  207:invokevirtual   #277 <Method void fl.b(boolean)>
		if(k != null)
	//* 100  210:aload_0         
	//* 101  211:getfield        #78  <Field PayPalService k>
	//* 102  214:ifnull          221
			i();
	//  103  217:aload_0         
	//  104  218:invokespecial   #541 <Method void i()>
		break; /* Loop/switch isn't completed */
		if(true) goto _L5; else goto _L4
_L4:
	//  105  221:return          
	}

	public final void onBackPressed()
	{
		PayPalService paypalservice = k;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field PayPalService k>
	//    2    4:astore_1        
		if(paypalservice != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
		{
			paypalservice.a(ed.i);
	//    5    9:aload_1         
	//    6   10:getstatic       #800 <Field ed ed.i>
	//    7   13:invokevirtual   #531 <Method void com.paypal.android.sdk.payments.PayPalService.a(ed)>
			c();
	//    8   16:aload_0         
	//    9   17:invokespecial   #562 <Method void c()>
		}
		super.onBackPressed();
	//   10   20:aload_0         
	//   11   21:invokespecial   #801 <Method void Activity.onBackPressed()>
	//   12   24:return          
	}

	protected final void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #804 <Method void Activity.onCreate(Bundle)>
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #279 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #280 <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append(a);
	//    7   13:aload_3         
	//    8   14:getstatic       #80  <Field String a>
	//    9   17:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append(".onCreate");
	//   11   21:aload_3         
	//   12   22:ldc2            #806 <String ".onCreate">
	//   13   25:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		d();
	//   15   29:aload_0         
	//   16   30:invokespecial   #808 <Method void d()>
		boolean flag = false;
	//   17   33:iconst_0        
	//   18   34:istore_2        
		if(bundle == null)
	//*  19   35:aload_1         
	//*  20   36:ifnonnull       58
		{
			if(!com.paypal.android.sdk.payments.cd.a(((Activity) (this))))
	//*  21   39:aload_0         
	//*  22   40:invokestatic    #811 <Method boolean com.paypal.android.sdk.payments.cd.a(Activity)>
	//*  23   43:ifne            50
				finish();
	//   24   46:aload_0         
	//   25   47:invokevirtual   #798 <Method void finish()>
			d = false;
	//   26   50:aload_0         
	//   27   51:iconst_0        
	//   28   52:putfield        #523 <Field boolean d>
		} else
	//*  29   55:goto            91
		{
			d = bundle.getBoolean("pageTrackingSent");
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:ldc2            #813 <String "pageTrackingSent">
	//   33   63:invokevirtual   #817 <Method boolean Bundle.getBoolean(String)>
	//   34   66:putfield        #523 <Field boolean d>
			e = bundle.getBoolean("isLoginActivityInProgress");
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:ldc2            #819 <String "isLoginActivityInProgress">
	//   38   74:invokevirtual   #817 <Method boolean Bundle.getBoolean(String)>
	//   39   77:putfield        #566 <Field boolean e>
			f = bundle.getBoolean("isSFOPaymentRequestInProgress");
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:ldc2            #821 <String "isSFOPaymentRequestInProgress">
	//   43   85:invokevirtual   #817 <Method boolean Bundle.getBoolean(String)>
	//   44   88:putfield        #376 <Field boolean f>
		}
		if(getIntent().getExtras() == null)
	//*  45   91:aload_0         
	//*  46   92:invokevirtual   #227 <Method Intent getIntent()>
	//*  47   95:invokevirtual   #794 <Method Bundle Intent.getExtras()>
	//*  48   98:ifnonnull       106
		{
			onBackPressed();
	//   49  101:aload_0         
	//   50  102:invokevirtual   #750 <Method void onBackPressed()>
			return;
	//   51  105:return          
		}
		i = (cl)getIntent().getSerializableExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_PAYMENT_KIND");
	//   52  106:aload_0         
	//   53  107:aload_0         
	//   54  108:invokevirtual   #227 <Method Intent getIntent()>
	//   55  111:ldc1            #105 <String "com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_PAYMENT_KIND">
	//   56  113:invokevirtual   #825 <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//   57  116:checkcast       #272 <Class cl>
	//   58  119:putfield        #270 <Field cl i>
		j = getIntent().getParcelableExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_CREDIT_CARD");
	//   59  122:aload_0         
	//   60  123:aload_0         
	//   61  124:invokevirtual   #227 <Method Intent getIntent()>
	//   62  127:ldc1            #111 <String "com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_CREDIT_CARD">
	//   63  129:invokevirtual   #829 <Method Parcelable Intent.getParcelableExtra(String)>
	//   64  132:putfield        #612 <Field Parcelable j>
		h = new bs(getIntent());
	//   65  135:aload_0         
	//   66  136:new             #214 <Class bs>
	//   67  139:dup             
	//   68  140:aload_0         
	//   69  141:invokevirtual   #227 <Method Intent getIntent()>
	//   70  144:invokespecial   #832 <Method void bs(Intent)>
	//   71  147:putfield        #212 <Field bs h>
		((Activity)this).setTheme(0x103006e);
	//   72  150:aload_0         
	//   73  151:ldc2            #833 <Int 0x103006e>
	//   74  154:invokevirtual   #836 <Method void Activity.setTheme(int)>
		((Activity)this).requestWindowFeature(8);
	//   75  157:aload_0         
	//   76  158:bipush          8
	//   77  160:invokevirtual   #840 <Method boolean Activity.requestWindowFeature(int)>
	//   78  163:pop             
		if(i == com.paypal.android.sdk.payments.cl.a)
	//*  79  164:aload_0         
	//*  80  165:getfield        #270 <Field cl i>
	//*  81  168:getstatic       #274 <Field cl com.paypal.android.sdk.payments.cl.a>
	//*  82  171:if_acmpne       176
			flag = true;
	//   83  174:iconst_1        
	//   84  175:istore_2        
		g = new fl(((android.content.Context) (this)), flag);
	//   85  176:aload_0         
	//   86  177:new             #250 <Class fl>
	//   87  180:dup             
	//   88  181:aload_0         
	//   89  182:iload_2         
	//   90  183:invokespecial   #843 <Method void fl(android.content.Context, boolean)>
	//   91  186:putfield        #241 <Field fl g>
		setContentView(g.a());
	//   92  189:aload_0         
	//   93  190:aload_0         
	//   94  191:getfield        #241 <Field fl g>
	//   95  194:invokevirtual   #845 <Method View fl.a()>
	//   96  197:invokevirtual   #849 <Method void setContentView(View)>
		com.paypal.android.sdk.payments.cd.a(((Activity) (this)), g.b(), fc.A);
	//   97  200:aload_0         
	//   98  201:aload_0         
	//   99  202:getfield        #241 <Field fl g>
	//  100  205:invokevirtual   #851 <Method android.widget.TextView fl.b()>
	//  101  208:getstatic       #857 <Field fc fc.A>
	//  102  211:invokestatic    #860 <Method void com.paypal.android.sdk.payments.cd.a(Activity, android.widget.TextView, fc)>
		g.b(((android.view.View.OnClickListener) (new bt(this))));
	//  103  214:aload_0         
	//  104  215:getfield        #241 <Field fl g>
	//  105  218:new             #862 <Class bt>
	//  106  221:dup             
	//  107  222:aload_0         
	//  108  223:invokespecial   #863 <Method void bt(PaymentConfirmActivity)>
	//  109  226:invokevirtual   #865 <Method void fl.b(android.view.View$OnClickListener)>
		g.a(((android.view.View.OnClickListener) (new by(this))));
	//  110  229:aload_0         
	//  111  230:getfield        #241 <Field fl g>
	//  112  233:new             #867 <Class by>
	//  113  236:dup             
	//  114  237:aload_0         
	//  115  238:invokespecial   #868 <Method void by(PaymentConfirmActivity)>
	//  116  241:invokevirtual   #870 <Method void fl.a(android.view.View$OnClickListener)>
		if(com.paypal.android.sdk.payments.cl.a == i)
	//* 117  244:getstatic       #274 <Field cl com.paypal.android.sdk.payments.cl.a>
	//* 118  247:aload_0         
	//* 119  248:getfield        #270 <Field cl i>
	//* 120  251:if_acmpne       274
		{
			c = (dx)getIntent().getParcelableExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_PAYMENT_INFO");
	//  121  254:aload_0         
	//  122  255:aload_0         
	//  123  256:invokevirtual   #227 <Method Intent getIntent()>
	//  124  259:ldc1            #229 <String "com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_PAYMENT_INFO">
	//  125  261:invokevirtual   #829 <Method Parcelable Intent.getParcelableExtra(String)>
	//  126  264:checkcast       #210 <Class dx>
	//  127  267:putfield        #226 <Field dx c>
			b();
	//  128  270:aload_0         
	//  129  271:invokespecial   #231 <Method void b()>
		}
	//  130  274:return          
	}

	protected final Dialog onCreateDialog(int i1, Bundle bundle)
	{
		switch(i1)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 5: default 36
	//	               1 286
	//	               2 275
	//	               3 265
	//	               4 248
	//	               5 38
		default:
			return null;
	//    2   36:aconst_null     
	//    3   37:areturn         

		case 5: // '\005'
			fa.a(fc.bf);
	//    4   38:getstatic       #875 <Field fc fc.bf>
	//    5   41:invokestatic    #880 <Method String fa.a(fc)>
	//    6   44:pop             
			if(bundle != null && cd.b(((CharSequence) (bundle.getString("BUNDLE_ERROR_CODE")))))
	//*   7   45:aload_2         
	//*   8   46:ifnull          158
	//*   9   49:aload_2         
	//*  10   50:ldc2            #882 <String "BUNDLE_ERROR_CODE">
	//*  11   53:invokevirtual   #134 <Method String Bundle.getString(String)>
	//*  12   56:invokestatic    #885 <Method boolean cd.b(CharSequence)>
	//*  13   59:ifeq            158
			{
				String s = bundle.getString("BUNDLE_ERROR_CODE");
	//   14   62:aload_2         
	//   15   63:ldc2            #882 <String "BUNDLE_ERROR_CODE">
	//   16   66:invokevirtual   #134 <Method String Bundle.getString(String)>
	//   17   69:astore_3        
				bundle = ((Bundle) (fc.bh));
	//   18   70:getstatic       #888 <Field fc fc.bh>
	//   19   73:astore_2        
				s = fa.a(s);
	//   20   74:aload_3         
	//   21   75:invokestatic    #889 <Method String fa.a(String)>
	//   22   78:astore_3        
				fc fc2 = fc.aR;
	//   23   79:getstatic       #892 <Field fc fc.aR>
	//   24   82:astore          4
				fc fc4 = fc.f;
	//   25   84:getstatic       #894 <Field fc fc.f>
	//   26   87:astore          5
				com.paypal.android.sdk.payments.ci ci1 = new com.paypal.android.sdk.payments.ci(this);
	//   27   89:new             #896 <Class com.paypal.android.sdk.payments.ci>
	//   28   92:dup             
	//   29   93:aload_0         
	//   30   94:invokespecial   #897 <Method void com.paypal.android.sdk.payments.ci(PaymentConfirmActivity)>
	//   31   97:astore          6
				cj cj1 = new cj(this);
	//   32   99:new             #899 <Class cj>
	//   33  102:dup             
	//   34  103:aload_0         
	//   35  104:invokespecial   #900 <Method void cj(PaymentConfirmActivity)>
	//   36  107:astore          7
				return ((Dialog) ((new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setIcon(0x1080027).setTitle(((CharSequence) (fa.a(((fc) (bundle)))))).setMessage(((CharSequence) (s))).setPositiveButton(((CharSequence) (fa.a(fc2))), ((android.content.DialogInterface.OnClickListener) (ci1))).setNegativeButton(((CharSequence) (fa.a(fc4))), ((android.content.DialogInterface.OnClickListener) (cj1))).create()));
	//   37  109:new             #902 <Class android.app.AlertDialog$Builder>
	//   38  112:dup             
	//   39  113:aload_0         
	//   40  114:invokespecial   #903 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   41  117:ldc2            #904 <Int 0x1080027>
	//   42  120:invokevirtual   #908 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setIcon(int)>
	//   43  123:aload_2         
	//   44  124:invokestatic    #880 <Method String fa.a(fc)>
	//   45  127:invokevirtual   #912 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   46  130:aload_3         
	//   47  131:invokevirtual   #915 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   48  134:aload           4
	//   49  136:invokestatic    #880 <Method String fa.a(fc)>
	//   50  139:aload           6
	//   51  141:invokevirtual   #919 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   52  144:aload           5
	//   53  146:invokestatic    #880 <Method String fa.a(fc)>
	//   54  149:aload           7
	//   55  151:invokevirtual   #922 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   56  154:invokevirtual   #926 <Method android.app.AlertDialog android.app.AlertDialog$Builder.create()>
	//   57  157:areturn         
			} else
			{
				bundle = ((Bundle) (fc.bh));
	//   58  158:getstatic       #888 <Field fc fc.bh>
	//   59  161:astore_2        
				fc fc1 = fc.bf;
	//   60  162:getstatic       #875 <Field fc fc.bf>
	//   61  165:astore_3        
				fc fc3 = fc.aR;
	//   62  166:getstatic       #892 <Field fc fc.aR>
	//   63  169:astore          4
				fc fc5 = fc.f;
	//   64  171:getstatic       #894 <Field fc fc.f>
	//   65  174:astore          5
				bu bu1 = new bu(this);
	//   66  176:new             #928 <Class bu>
	//   67  179:dup             
	//   68  180:aload_0         
	//   69  181:invokespecial   #929 <Method void bu(PaymentConfirmActivity)>
	//   70  184:astore          6
				bv bv1 = new bv(this);
	//   71  186:new             #931 <Class bv>
	//   72  189:dup             
	//   73  190:aload_0         
	//   74  191:invokespecial   #932 <Method void bv(PaymentConfirmActivity)>
	//   75  194:astore          7
				return ((Dialog) ((new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setIcon(0x1080027).setTitle(((CharSequence) (fa.a(((fc) (bundle)))))).setMessage(((CharSequence) (fa.a(fc1)))).setPositiveButton(((CharSequence) (fa.a(fc3))), ((android.content.DialogInterface.OnClickListener) (bu1))).setNegativeButton(((CharSequence) (fa.a(fc5))), ((android.content.DialogInterface.OnClickListener) (bv1))).create()));
	//   76  196:new             #902 <Class android.app.AlertDialog$Builder>
	//   77  199:dup             
	//   78  200:aload_0         
	//   79  201:invokespecial   #903 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   80  204:ldc2            #904 <Int 0x1080027>
	//   81  207:invokevirtual   #908 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setIcon(int)>
	//   82  210:aload_2         
	//   83  211:invokestatic    #880 <Method String fa.a(fc)>
	//   84  214:invokevirtual   #912 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   85  217:aload_3         
	//   86  218:invokestatic    #880 <Method String fa.a(fc)>
	//   87  221:invokevirtual   #915 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   88  224:aload           4
	//   89  226:invokestatic    #880 <Method String fa.a(fc)>
	//   90  229:aload           6
	//   91  231:invokevirtual   #919 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   92  234:aload           5
	//   93  236:invokestatic    #880 <Method String fa.a(fc)>
	//   94  239:aload           7
	//   95  241:invokevirtual   #922 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   96  244:invokevirtual   #926 <Method android.app.AlertDialog android.app.AlertDialog$Builder.create()>
	//   97  247:areturn         
			}

		case 4: // '\004'
			return com.paypal.android.sdk.payments.cd.a(((Activity) (this)), fc.aM, bundle, ((android.content.DialogInterface.OnClickListener) (new ch(this))));
	//   98  248:aload_0         
	//   99  249:getstatic       #935 <Field fc fc.aM>
	//  100  252:aload_2         
	//  101  253:new             #937 <Class ch>
	//  102  256:dup             
	//  103  257:aload_0         
	//  104  258:invokespecial   #938 <Method void ch(PaymentConfirmActivity)>
	//  105  261:invokestatic    #941 <Method Dialog com.paypal.android.sdk.payments.cd.a(Activity, fc, Bundle, android.content.DialogInterface$OnClickListener)>
	//  106  264:areturn         

		case 3: // '\003'
			return com.paypal.android.sdk.payments.cd.a(((Activity) (this)), fc.an, bundle, i1);
	//  107  265:aload_0         
	//  108  266:getstatic       #944 <Field fc fc.an>
	//  109  269:aload_2         
	//  110  270:iload_1         
	//  111  271:invokestatic    #947 <Method Dialog com.paypal.android.sdk.payments.cd.a(Activity, fc, Bundle, int)>
	//  112  274:areturn         

		case 2: // '\002'
			return com.paypal.android.sdk.payments.cd.a(((android.content.Context) (this)), fc.aE, fc.bq);
	//  113  275:aload_0         
	//  114  276:getstatic       #950 <Field fc fc.aE>
	//  115  279:getstatic       #953 <Field fc fc.bq>
	//  116  282:invokestatic    #956 <Method Dialog com.paypal.android.sdk.payments.cd.a(android.content.Context, fc, fc)>
	//  117  285:areturn         

		case 1: // '\001'
			return com.paypal.android.sdk.payments.cd.a(((Activity) (this)), fc.br, bundle);
	//  118  286:aload_0         
	//  119  287:getstatic       #959 <Field fc fc.br>
	//  120  290:aload_2         
	//  121  291:invokestatic    #962 <Method Dialog com.paypal.android.sdk.payments.cd.a(Activity, fc, Bundle)>
	//  122  294:areturn         
		}
	}

	protected final void onDestroy()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #279 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #280 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append(a);
	//    4    8:aload_1         
	//    5    9:getstatic       #80  <Field String a>
	//    6   12:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(".onDestroy");
	//    8   16:aload_1         
	//    9   17:ldc2            #965 <String ".onDestroy">
	//   10   20:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		obj = ((Object) (k));
	//   12   24:aload_0         
	//   13   25:getfield        #78  <Field PayPalService k>
	//   14   28:astore_1        
		if(obj != null)
	//*  15   29:aload_1         
	//*  16   30:ifnull          37
			((PayPalService) (obj)).m();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #967 <Method void PayPalService.m()>
		if(m)
	//*  19   37:aload_0         
	//*  20   38:getfield        #560 <Field boolean m>
	//*  21   41:ifeq            57
		{
			unbindService(l);
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:getfield        #42  <Field ServiceConnection l>
	//   25   49:invokevirtual   #971 <Method void unbindService(ServiceConnection)>
			m = false;
	//   26   52:aload_0         
	//   27   53:iconst_0        
	//   28   54:putfield        #560 <Field boolean m>
		}
		super.onDestroy();
	//   29   57:aload_0         
	//   30   58:invokespecial   #973 <Method void Activity.onDestroy()>
	//   31   61:return          
	}

	protected final void onRestart()
	{
		super.onRestart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #976 <Method void Activity.onRestart()>
		d();
	//    2    4:aload_0         
	//    3    5:invokespecial   #808 <Method void d()>
	//    4    8:return          
	}

	protected final void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #979 <Method void Activity.onResume()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #279 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #280 <Method void StringBuilder()>
	//    5   11:astore_1        
		stringbuilder.append(a);
	//    6   12:aload_1         
	//    7   13:getstatic       #80  <Field String a>
	//    8   16:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(".onResume");
	//   10   20:aload_1         
	//   11   21:ldc2            #981 <String ".onResume">
	//   12   24:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		if(k != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #78  <Field PayPalService k>
	//*  16   32:ifnull          39
			f();
	//   17   35:aload_0         
	//   18   36:invokespecial   #533 <Method void f()>
	//   19   39:return          
	}

	protected final void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #984 <Method void Activity.onSaveInstanceState(Bundle)>
		bundle.putBoolean("pageTrackingSent", d);
	//    3    5:aload_1         
	//    4    6:ldc2            #813 <String "pageTrackingSent">
	//    5    9:aload_0         
	//    6   10:getfield        #523 <Field boolean d>
	//    7   13:invokevirtual   #988 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBoolean("isLoginActivityInProgress", e);
	//    8   16:aload_1         
	//    9   17:ldc2            #819 <String "isLoginActivityInProgress">
	//   10   20:aload_0         
	//   11   21:getfield        #566 <Field boolean e>
	//   12   24:invokevirtual   #988 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBoolean("isSFOPaymentRequestInProgress", f);
	//   13   27:aload_1         
	//   14   28:ldc2            #821 <String "isSFOPaymentRequestInProgress">
	//   15   31:aload_0         
	//   16   32:getfield        #376 <Field boolean f>
	//   17   35:invokevirtual   #988 <Method void Bundle.putBoolean(String, boolean)>
	//   18   38:return          
	}

	public final void onWindowFocusChanged(boolean flag)
	{
		super.onWindowFocusChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #991 <Method void Activity.onWindowFocusChanged(boolean)>
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #279 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #280 <Method void StringBuilder()>
	//    6   12:astore_2        
		stringbuilder.append(a);
	//    7   13:aload_2         
	//    8   14:getstatic       #80  <Field String a>
	//    9   17:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append(".onWindowFocusChanged");
	//   11   21:aload_2         
	//   12   22:ldc2            #993 <String ".onWindowFocusChanged">
	//   13   25:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		g.c();
	//   15   29:aload_0         
	//   16   30:getfield        #241 <Field fl g>
	//   17   33:invokevirtual   #994 <Method void fl.c()>
	//   18   36:return          
	}

	private static final String a = "PaymentConfirmActivity";
	private com.paypal.android.sdk.payments.ck b;
	private dx c;
	private boolean d;
	private boolean e;
	private boolean f;
	private fl g;
	private bs h;
	private cl i;
	private Parcelable j;
	private PayPalService k;
	private final ServiceConnection l = new bz(this);
	private boolean m;

	static 
	{
	//    0    0:return          
	}
}
