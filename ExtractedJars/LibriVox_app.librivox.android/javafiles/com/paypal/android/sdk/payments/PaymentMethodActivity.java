// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.*;
import com.paypal.android.sdk.*;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Timer;

// Referenced classes of package com.paypal.android.sdk.payments:
//			cu, PayPalService, cl, PaymentConfirmActivity, 
//			dj, bs, PayPalPayment, PayPalConfiguration, 
//			cw, cd, cr, PaymentConfirmation, 
//			cn, co, cp, cq, 
//			ct, cs

public final class PaymentMethodActivity extends Activity
{

	public PaymentMethodActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Activity()>
	//    2    4:aload_0         
	//    3    5:new             #32  <Class cu>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #35  <Method void cu(PaymentMethodActivity)>
	//    7   13:putfield        #37  <Field ServiceConnection j>
	//    8   16:return          
	}

	static PayPalService a(PaymentMethodActivity paymentmethodactivity, PayPalService paypalservice)
	{
		paymentmethodactivity.i = paypalservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field PayPalService i>
		return paypalservice;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static String a()
	{
		return a;
	//    0    0:getstatic       #43  <Field String a>
	//    1    3:areturn         
	}

	static void a(Activity activity, int l, PayPalConfiguration paypalconfiguration)
	{
		Intent intent = new Intent(((android.content.Context) (activity)), com/paypal/android/sdk/payments/PaymentMethodActivity);
	//    0    0:new             #46  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class PaymentMethodActivity>
	//    4    7:invokespecial   #49  <Method void Intent(android.content.Context, Class)>
	//    5   10:astore_3        
		intent.putExtras(activity.getIntent());
	//    6   11:aload_3         
	//    7   12:aload_0         
	//    8   13:invokevirtual   #53  <Method Intent Activity.getIntent()>
	//    9   16:invokevirtual   #57  <Method Intent Intent.putExtras(Intent)>
	//   10   19:pop             
		intent.putExtra("com.paypal.android.sdk.paypalConfiguration", ((android.os.Parcelable) (paypalconfiguration)));
	//   11   20:aload_3         
	//   12   21:ldc1            #59  <String "com.paypal.android.sdk.paypalConfiguration">
	//   13   23:aload_2         
	//   14   24:invokevirtual   #63  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   15   27:pop             
		activity.startActivityForResult(intent, 1);
	//   16   28:aload_0         
	//   17   29:aload_3         
	//   18   30:iconst_1        
	//   19   31:invokevirtual   #67  <Method void Activity.startActivityForResult(Intent, int)>
	//   20   34:return          
	}

	static void a(PaymentMethodActivity paymentmethodactivity)
	{
		paymentmethodactivity.i.a(ed.e);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field PayPalService i>
	//    2    4:getstatic       #72  <Field ed ed.e>
	//    3    7:invokevirtual   #77  <Method void PayPalService.a(ed)>
		PaymentConfirmActivity.a(((Activity) (paymentmethodactivity)), 2, cl.a, ((android.os.Parcelable) (null)), paymentmethodactivity.i.d(), true);
	//    4   10:aload_0         
	//    5   11:iconst_2        
	//    6   12:getstatic       #82  <Field cl cl.a>
	//    7   15:aconst_null     
	//    8   16:aload_0         
	//    9   17:getfield        #40  <Field PayPalService i>
	//   10   20:invokevirtual   #85  <Method PayPalConfiguration PayPalService.d()>
	//   11   23:iconst_1        
	//   12   24:invokestatic    #90  <Method void PaymentConfirmActivity.a(Activity, int, cl, android.os.Parcelable, PayPalConfiguration, boolean)>
	//   13   27:return          
	}

	static boolean a(PaymentMethodActivity paymentmethodactivity, boolean flag)
	{
		paymentmethodactivity.e = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #93  <Field boolean e>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void b()
	{
		if(e && !d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field boolean e>
	//*   2    4:ifeq            57
	//*   3    7:aload_0         
	//*   4    8:getfield        #95  <Field boolean d>
	//*   5   11:ifne            57
		{
			g.m.setImageBitmap(cc.c("iVBORw0KGgoAAAANSUhEUgAAADcAAAAsCAYAAADByiAeAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAohJREFUeNrcWYGRgjAQJMwXQAl0IFbwWMFrBS8VvHYAFagVoBVIB2IFaAV8B08H/GUm/GA+CUouBL2ZTByEwCZ3m70LcRCsrusQutDBswranhBSOTYNgC1rM1ZA82yD+6nN2Urn21xNYAF0Jmf33Ro45DhDH9+1ObN3mMe84yVXTusd7ojjTds7iIzeoZtAU7mE1/E/5p536fj/yvbFb+VmDK2sn9c27b2RcKuVOs9vdJVnVN0QBsyHrjAQQ9RNMmhn5j5tC1g8zQ0A3AK4dbNqKbJ7nJjevIeYKN3HBpSOjy2h6DjznuxLQR4xpZvbYj4MX5+CO2S9aJvGCCEL+LnGEgBv2EEsWRXqIj4HJpeA3ML9FRq5IbhioEiHCsVz6V9s/H9WlwdiDHArSfycHpicpWSM0ia4UvJRRY+xlsiJcKwrnBPBtbSnLEt594b427O9cvisgL2cr6XobMobwbWdDXAitvvUTW8E5JTbAHcWXMOQUiHnHRcb4CrBXoYhBiYSjTooOH5GfSRB4I8BnI/xAV0eoTNxaOCUWfBjdh0DOFFsZAjgMkGtZnBCCTH3pIb2BewY2gDn8bkbU/q5xpgJ5t6pK7++BNcWHdUqmUV8GsQUj72irGD1KNvNHgQY8VJOIccGz+c8ybhxR9pyVOSCsW4+11S/asOZeMCIwWvdnyvuxygzJhgrh3pYiHiYqZ3P8XXI4t6SniTJ3WAWhjHBNUripKqNKNyQFoVXmB+DFXOqWDyw/tLEGItBCv6DpUkmTouSBlyJqOrHYlHjlocXA0Y9JGvAbSWpxrPajoaAy6mKVwBIDyHjG7ZkanyqKXxtu+IacEQ3bCmgZt8gixlhZdEBzK8AAwBIvuGtI5K/kgAAAABJRU5ErkJggg==", ((android.content.Context) (this))));
	//    6   14:aload_0         
	//    7   15:getfield        #97  <Field fm g>
	//    8   18:getfield        #103 <Field ImageView fm.m>
	//    9   21:ldc1            #105 <String "iVBORw0KGgoAAAANSUhEUgAAADcAAAAsCAYAAADByiAeAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAohJREFUeNrcWYGRgjAQJMwXQAl0IFbwWMFrBS8VvHYAFagVoBVIB2IFaAV8B08H/GUm/GA+CUouBL2ZTByEwCZ3m70LcRCsrusQutDBswranhBSOTYNgC1rM1ZA82yD+6nN2Urn21xNYAF0Jmf33Ro45DhDH9+1ObN3mMe84yVXTusd7ojjTds7iIzeoZtAU7mE1/E/5p536fj/yvbFb+VmDK2sn9c27b2RcKuVOs9vdJVnVN0QBsyHrjAQQ9RNMmhn5j5tC1g8zQ0A3AK4dbNqKbJ7nJjevIeYKN3HBpSOjy2h6DjznuxLQR4xpZvbYj4MX5+CO2S9aJvGCCEL+LnGEgBv2EEsWRXqIj4HJpeA3ML9FRq5IbhioEiHCsVz6V9s/H9WlwdiDHArSfycHpicpWSM0ia4UvJRRY+xlsiJcKwrnBPBtbSnLEt594b427O9cvisgL2cr6XobMobwbWdDXAitvvUTW8E5JTbAHcWXMOQUiHnHRcb4CrBXoYhBiYSjTooOH5GfSRB4I8BnI/xAV0eoTNxaOCUWfBjdh0DOFFsZAjgMkGtZnBCCTH3pIb2BewY2gDn8bkbU/q5xpgJ5t6pK7++BNcWHdUqmUV8GsQUj72irGD1KNvNHgQY8VJOIccGz+c8ybhxR9pyVOSCsW4+11S/asOZeMCIwWvdnyvuxygzJhgrh3pYiHiYqZ3P8XXI4t6SniTJ3WAWhjHBNUripKqNKNyQFoVXmB+DFXOqWDyw/tLEGItBCv6DpUkmTouSBlyJqOrHYlHjlocXA0Y9JGvAbSWpxrPajoaAy6mKVwBIDyHjG7ZkanyqKXxtu+IacEQ3bCmgZt8gixlhZdEBzK8AAwBIvuGtI5K/kgAAAABJRU5ErkJggg==">
	//   10   23:aload_0         
	//   11   24:invokestatic    #110 <Method android.graphics.Bitmap cc.c(String, android.content.Context)>
	//   12   27:invokevirtual   #116 <Method void ImageView.setImageBitmap(android.graphics.Bitmap)>
			g.m.setVisibility(0);
	//   13   30:aload_0         
	//   14   31:getfield        #97  <Field fm g>
	//   15   34:getfield        #103 <Field ImageView fm.m>
	//   16   37:iconst_0        
	//   17   38:invokevirtual   #120 <Method void ImageView.setVisibility(int)>
			g.m.setContentDescription(((CharSequence) (fa.a(fc.bs))));
	//   18   41:aload_0         
	//   19   42:getfield        #97  <Field fm g>
	//   20   45:getfield        #103 <Field ImageView fm.m>
	//   21   48:getstatic       #126 <Field fc fc.bs>
	//   22   51:invokestatic    #131 <Method String fa.a(fc)>
	//   23   54:invokevirtual   #135 <Method void ImageView.setContentDescription(CharSequence)>
		}
	//   24   57:return          
	}

	static void b(PaymentMethodActivity paymentmethodactivity)
	{
		paymentmethodactivity.showDialog(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #138 <Method void showDialog(int)>
	//    3    5:return          
	}

	private void c()
	{
label0:
		{
			Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #140 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #141 <Method void StringBuilder()>
	//    3    7:astore_1        
			((StringBuilder) (obj)).append(a);
	//    4    8:aload_1         
	//    5    9:getstatic       #43  <Field String a>
	//    6   12:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
			((StringBuilder) (obj)).append(".refreshPayment");
	//    8   16:aload_1         
	//    9   17:ldc1            #147 <String ".refreshPayment">
	//   10   19:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
			if(dj.a(((android.content.Context) (this)), i))
	//*  12   23:aload_0         
	//*  13   24:aload_0         
	//*  14   25:getfield        #40  <Field PayPalService i>
	//*  15   28:invokestatic    #152 <Method boolean dj.a(android.content.Context, PayPalService)>
	//*  16   31:ifeq            41
				i.h();
	//   17   34:aload_0         
	//   18   35:getfield        #40  <Field PayPalService i>
	//   19   38:invokevirtual   #154 <Method void PayPalService.h()>
			obj = ((Object) (h.a()));
	//   20   41:aload_0         
	//   21   42:getfield        #156 <Field bs h>
	//   22   45:invokevirtual   #161 <Method PayPalPayment bs.a()>
	//   23   48:astore_1        
			Object obj2 = ((Object) (ci.a()));
	//   24   49:invokestatic    #166 <Method ci ci.a()>
	//   25   52:astore_2        
			obj2 = ((Object) (dj.a(Locale.getDefault(), ((ci) (obj2)).c().a(), ((PayPalPayment) (obj)).c().doubleValue(), ((PayPalPayment) (obj)).f(), true)));
	//   26   53:invokestatic    #172 <Method Locale Locale.getDefault()>
	//   27   56:aload_2         
	//   28   57:invokevirtual   #175 <Method ei ci.c()>
	//   29   60:invokevirtual   #179 <Method String ei.a()>
	//   30   63:aload_1         
	//   31   64:invokevirtual   #184 <Method BigDecimal PayPalPayment.c()>
	//   32   67:invokevirtual   #190 <Method double BigDecimal.doubleValue()>
	//   33   70:aload_1         
	//   34   71:invokevirtual   #192 <Method String PayPalPayment.f()>
	//   35   74:iconst_1        
	//   36   75:invokestatic    #197 <Method String dj.a(Locale, String, double, String, boolean)>
	//   37   78:astore_2        
			g.c.d.setText(((CharSequence) (((PayPalPayment) (obj)).d())));
	//   38   79:aload_0         
	//   39   80:getfield        #97  <Field fm g>
	//   40   83:getfield        #200 <Field fr fm.c>
	//   41   86:getfield        #205 <Field TextView fr.d>
	//   42   89:aload_1         
	//   43   90:invokevirtual   #207 <Method String PayPalPayment.d()>
	//   44   93:invokevirtual   #212 <Method void TextView.setText(CharSequence)>
			g.c.c.setText(((CharSequence) (obj2)));
	//   45   96:aload_0         
	//   46   97:getfield        #97  <Field fm g>
	//   47  100:getfield        #200 <Field fr fm.c>
	//   48  103:getfield        #214 <Field TextView fr.c>
	//   49  106:aload_2         
	//   50  107:invokevirtual   #212 <Method void TextView.setText(CharSequence)>
			if(i.j() && i.c().g.a())
	//*  51  110:aload_0         
	//*  52  111:getfield        #40  <Field PayPalService i>
	//*  53  114:invokevirtual   #217 <Method boolean PayPalService.j()>
	//*  54  117:ifeq            187
	//*  55  120:aload_0         
	//*  56  121:getfield        #40  <Field PayPalService i>
	//*  57  124:invokevirtual   #220 <Method ck PayPalService.c()>
	//*  58  127:getfield        #225 <Field dw ck.g>
	//*  59  130:invokevirtual   #229 <Method boolean dw.a()>
	//*  60  133:ifeq            187
			{
				String s = i.r();
	//   61  136:aload_0         
	//   62  137:getfield        #40  <Field PayPalService i>
	//   63  140:invokevirtual   #232 <Method String PayPalService.r()>
	//   64  143:astore_1        
				if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  65  144:aload_1         
	//*  66  145:invokestatic    #238 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  67  148:ifne            187
				{
					g.d.setText(((CharSequence) (s)));
	//   68  151:aload_0         
	//   69  152:getfield        #97  <Field fm g>
	//   70  155:getfield        #239 <Field TextView fm.d>
	//   71  158:aload_1         
	//   72  159:invokevirtual   #212 <Method void TextView.setText(CharSequence)>
					g.d.setVisibility(0);
	//   73  162:aload_0         
	//   74  163:getfield        #97  <Field fm g>
	//   75  166:getfield        #239 <Field TextView fm.d>
	//   76  169:iconst_0        
	//   77  170:invokevirtual   #240 <Method void TextView.setVisibility(int)>
					g.b.setVisibility(0);
	//   78  173:aload_0         
	//   79  174:getfield        #97  <Field fm g>
	//   80  177:getfield        #243 <Field Button fm.b>
	//   81  180:iconst_0        
	//   82  181:invokevirtual   #246 <Method void Button.setVisibility(int)>
					break label0;
	//   83  184:goto            211
				}
			}
			g.d.setVisibility(8);
	//   84  187:aload_0         
	//   85  188:getfield        #97  <Field fm g>
	//   86  191:getfield        #239 <Field TextView fm.d>
	//   87  194:bipush          8
	//   88  196:invokevirtual   #240 <Method void TextView.setVisibility(int)>
			g.b.setVisibility(8);
	//   89  199:aload_0         
	//   90  200:getfield        #97  <Field fm g>
	//   91  203:getfield        #243 <Field Button fm.b>
	//   92  206:bipush          8
	//   93  208:invokevirtual   #246 <Method void Button.setVisibility(int)>
		}
		if(i.d().i())
	//*  94  211:aload_0         
	//*  95  212:getfield        #40  <Field PayPalService i>
	//*  96  215:invokevirtual   #85  <Method PayPalConfiguration PayPalService.d()>
	//*  97  218:invokevirtual   #250 <Method boolean PayPalConfiguration.i()>
	//*  98  221:ifeq            437
		{
			(new cw(this, (byte)0)).execute(((Object []) (new Void[0])));
	//   99  224:new             #252 <Class cw>
	//  100  227:dup             
	//  101  228:aload_0         
	//  102  229:iconst_0        
	//  103  230:invokespecial   #255 <Method void cw(PaymentMethodActivity, byte)>
	//  104  233:iconst_0        
	//  105  234:anewarray       Void[]
	//  106  237:invokevirtual   #261 <Method android.os.AsyncTask cw.execute(Object[])>
	//  107  240:pop             
			Object obj1 = ((Object) (i.s()));
	//  108  241:aload_0         
	//  109  242:getfield        #40  <Field PayPalService i>
	//  110  245:invokevirtual   #265 <Method dt PayPalService.s()>
	//  111  248:astore_1        
			if(obj1 != null && ((dt) (obj1)).b())
	//* 112  249:aload_1         
	//* 113  250:ifnull          390
	//* 114  253:aload_1         
	//* 115  254:invokevirtual   #269 <Method boolean dt.b()>
	//* 116  257:ifeq            390
			{
				d = true;
	//  117  260:aload_0         
	//  118  261:iconst_1        
	//  119  262:putfield        #95  <Field boolean d>
				g.m.setVisibility(8);
	//  120  265:aload_0         
	//  121  266:getfield        #97  <Field fm g>
	//  122  269:getfield        #103 <Field ImageView fm.m>
	//  123  272:bipush          8
	//  124  274:invokevirtual   #120 <Method void ImageView.setVisibility(int)>
				g.e.setText(((CharSequence) (((dt) (obj1)).d())));
	//  125  277:aload_0         
	//  126  278:getfield        #97  <Field fm g>
	//  127  281:getfield        #271 <Field TextView fm.e>
	//  128  284:aload_1         
	//  129  285:invokevirtual   #272 <Method String dt.d()>
	//  130  288:invokevirtual   #212 <Method void TextView.setText(CharSequence)>
				obj1 = ((Object) (cd.a(((dt) (obj1)))));
	//  131  291:aload_1         
	//  132  292:invokestatic    #277 <Method Enum cd.a(dt)>
	//  133  295:astore_1        
				g.g.setImageBitmap(cd.a(((Activity) (this)), ((Enum) (obj1))));
	//  134  296:aload_0         
	//  135  297:getfield        #97  <Field fm g>
	//  136  300:getfield        #279 <Field ImageView fm.g>
	//  137  303:aload_0         
	//  138  304:aload_1         
	//  139  305:invokestatic    #282 <Method android.graphics.Bitmap cd.a(Activity, Enum)>
	//  140  308:invokevirtual   #116 <Method void ImageView.setImageBitmap(android.graphics.Bitmap)>
				g.g.setContentDescription(((CharSequence) (((Enum) (obj1)).toString())));
	//  141  311:aload_0         
	//  142  312:getfield        #97  <Field fm g>
	//  143  315:getfield        #279 <Field ImageView fm.g>
	//  144  318:aload_1         
	//  145  319:invokevirtual   #287 <Method String Enum.toString()>
	//  146  322:invokevirtual   #135 <Method void ImageView.setContentDescription(CharSequence)>
				g.g.setVisibility(0);
	//  147  325:aload_0         
	//  148  326:getfield        #97  <Field fm g>
	//  149  329:getfield        #279 <Field ImageView fm.g>
	//  150  332:iconst_0        
	//  151  333:invokevirtual   #120 <Method void ImageView.setVisibility(int)>
				obj1 = ((Object) (fa.a(fc.z)));
	//  152  336:getstatic       #290 <Field fc fc.z>
	//  153  339:invokestatic    #131 <Method String fa.a(fc)>
	//  154  342:astore_1        
				g.k.setText(((CharSequence) (obj1)));
	//  155  343:aload_0         
	//  156  344:getfield        #97  <Field fm g>
	//  157  347:getfield        #292 <Field Button fm.k>
	//  158  350:aload_1         
	//  159  351:invokevirtual   #293 <Method void Button.setText(CharSequence)>
				g.k.setVisibility(0);
	//  160  354:aload_0         
	//  161  355:getfield        #97  <Field fm g>
	//  162  358:getfield        #292 <Field Button fm.k>
	//  163  361:iconst_0        
	//  164  362:invokevirtual   #246 <Method void Button.setVisibility(int)>
				g.h.setVisibility(0);
	//  165  365:aload_0         
	//  166  366:getfield        #97  <Field fm g>
	//  167  369:getfield        #296 <Field LinearLayout fm.h>
	//  168  372:iconst_0        
	//  169  373:invokevirtual   #299 <Method void LinearLayout.setVisibility(int)>
				g.k.setVisibility(0);
	//  170  376:aload_0         
	//  171  377:getfield        #97  <Field fm g>
	//  172  380:getfield        #292 <Field Button fm.k>
	//  173  383:iconst_0        
	//  174  384:invokevirtual   #246 <Method void Button.setVisibility(int)>
			} else
	//* 175  387:goto            430
			{
				g.g.setVisibility(8);
	//  176  390:aload_0         
	//  177  391:getfield        #97  <Field fm g>
	//  178  394:getfield        #279 <Field ImageView fm.g>
	//  179  397:bipush          8
	//  180  399:invokevirtual   #120 <Method void ImageView.setVisibility(int)>
				g.e.setText(((CharSequence) (fa.a(fc.ax))));
	//  181  402:aload_0         
	//  182  403:getfield        #97  <Field fm g>
	//  183  406:getfield        #271 <Field TextView fm.e>
	//  184  409:getstatic       #302 <Field fc fc.ax>
	//  185  412:invokestatic    #131 <Method String fa.a(fc)>
	//  186  415:invokevirtual   #212 <Method void TextView.setText(CharSequence)>
				g.k.setVisibility(8);
	//  187  418:aload_0         
	//  188  419:getfield        #97  <Field fm g>
	//  189  422:getfield        #292 <Field Button fm.k>
	//  190  425:bipush          8
	//  191  427:invokevirtual   #246 <Method void Button.setVisibility(int)>
			}
			b();
	//  192  430:aload_0         
	//  193  431:invokespecial   #304 <Method void b()>
		} else
	//* 194  434:goto            461
		{
			g.h.setVisibility(8);
	//  195  437:aload_0         
	//  196  438:getfield        #97  <Field fm g>
	//  197  441:getfield        #296 <Field LinearLayout fm.h>
	//  198  444:bipush          8
	//  199  446:invokevirtual   #299 <Method void LinearLayout.setVisibility(int)>
			g.k.setVisibility(8);
	//  200  449:aload_0         
	//  201  450:getfield        #97  <Field fm g>
	//  202  453:getfield        #292 <Field Button fm.k>
	//  203  456:bipush          8
	//  204  458:invokevirtual   #246 <Method void Button.setVisibility(int)>
		}
		cd.a(g.i.b, i.d().b());
	//  205  461:aload_0         
	//  206  462:getfield        #97  <Field fm g>
	//  207  465:getfield        #307 <Field fe fm.i>
	//  208  468:getfield        #311 <Field TextView fe.b>
	//  209  471:aload_0         
	//  210  472:getfield        #40  <Field PayPalService i>
	//  211  475:invokevirtual   #85  <Method PayPalConfiguration PayPalService.d()>
	//  212  478:invokevirtual   #313 <Method String PayPalConfiguration.b()>
	//  213  481:invokestatic    #316 <Method void cd.a(TextView, String)>
	//  214  484:return          
	}

	static void c(PaymentMethodActivity paymentmethodactivity)
	{
		paymentmethodactivity.i.a(ed.f);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field PayPalService i>
	//    2    4:getstatic       #318 <Field ed ed.f>
	//    3    7:invokevirtual   #77  <Method void PayPalService.a(ed)>
		dt dt1 = paymentmethodactivity.i.s();
	//    4   10:aload_0         
	//    5   11:getfield        #40  <Field PayPalService i>
	//    6   14:invokevirtual   #265 <Method dt PayPalService.s()>
	//    7   17:astore_1        
		if(dt1 != null && dt1.b())
	//*   8   18:aload_1         
	//*   9   19:ifnull          46
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #269 <Method boolean dt.b()>
	//*  12   26:ifeq            46
		{
			PaymentConfirmActivity.a(((Activity) (paymentmethodactivity)), 2, cl.c, ((android.os.Parcelable) (null)), paymentmethodactivity.i.d());
	//   13   29:aload_0         
	//   14   30:iconst_2        
	//   15   31:getstatic       #320 <Field cl cl.c>
	//   16   34:aconst_null     
	//   17   35:aload_0         
	//   18   36:getfield        #40  <Field PayPalService i>
	//   19   39:invokevirtual   #85  <Method PayPalConfiguration PayPalService.d()>
	//   20   42:invokestatic    #323 <Method void PaymentConfirmActivity.a(Activity, int, cl, android.os.Parcelable, PayPalConfiguration)>
			return;
	//   21   45:return          
		} else
		{
			Object obj = ((Object) (paymentmethodactivity.i.d().a()));
	//   22   46:aload_0         
	//   23   47:getfield        #40  <Field PayPalService i>
	//   24   50:invokevirtual   #85  <Method PayPalConfiguration PayPalService.d()>
	//   25   53:invokevirtual   #324 <Method String PayPalConfiguration.a()>
	//   26   56:astore_2        
			Intent intent = new Intent(((android.content.Context) (paymentmethodactivity)), cd.a("io.card.payment.CardIOActivity"));
	//   27   57:new             #46  <Class Intent>
	//   28   60:dup             
	//   29   61:aload_0         
	//   30   62:ldc2            #326 <String "io.card.payment.CardIOActivity">
	//   31   65:invokestatic    #329 <Method Class cd.a(String)>
	//   32   68:invokespecial   #49  <Method void Intent(android.content.Context, Class)>
	//   33   71:astore_1        
			intent.putExtra(cd.a("io.card.payment.CardIOActivity", "EXTRA_LANGUAGE_OR_LOCALE"), ((String) (obj)));
	//   34   72:aload_1         
	//   35   73:ldc2            #326 <String "io.card.payment.CardIOActivity">
	//   36   76:ldc2            #331 <String "EXTRA_LANGUAGE_OR_LOCALE">
	//   37   79:invokestatic    #334 <Method String cd.a(String, String)>
	//   38   82:aload_2         
	//   39   83:invokevirtual   #337 <Method Intent Intent.putExtra(String, String)>
	//   40   86:pop             
			intent.putExtra(cd.a("io.card.payment.CardIOActivity", "EXTRA_REQUIRE_EXPIRY"), true);
	//   41   87:aload_1         
	//   42   88:ldc2            #326 <String "io.card.payment.CardIOActivity">
	//   43   91:ldc2            #339 <String "EXTRA_REQUIRE_EXPIRY">
	//   44   94:invokestatic    #334 <Method String cd.a(String, String)>
	//   45   97:iconst_1        
	//   46   98:invokevirtual   #342 <Method Intent Intent.putExtra(String, boolean)>
	//   47  101:pop             
			intent.putExtra(cd.a("io.card.payment.CardIOActivity", "EXTRA_REQUIRE_CVV"), true);
	//   48  102:aload_1         
	//   49  103:ldc2            #326 <String "io.card.payment.CardIOActivity">
	//   50  106:ldc2            #344 <String "EXTRA_REQUIRE_CVV">
	//   51  109:invokestatic    #334 <Method String cd.a(String, String)>
	//   52  112:iconst_1        
	//   53  113:invokevirtual   #342 <Method Intent Intent.putExtra(String, boolean)>
	//   54  116:pop             
			obj = ((Object) (new StringBuilder("startActivityForResult(")));
	//   55  117:new             #140 <Class StringBuilder>
	//   56  120:dup             
	//   57  121:ldc2            #346 <String "startActivityForResult(">
	//   58  124:invokespecial   #349 <Method void StringBuilder(String)>
	//   59  127:astore_2        
			((StringBuilder) (obj)).append(((Object) (intent)));
	//   60  128:aload_2         
	//   61  129:aload_1         
	//   62  130:invokevirtual   #352 <Method StringBuilder StringBuilder.append(Object)>
	//   63  133:pop             
			((StringBuilder) (obj)).append(", 1");
	//   64  134:aload_2         
	//   65  135:ldc2            #354 <String ", 1">
	//   66  138:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   67  141:pop             
			((StringBuilder) (obj)).append(")");
	//   68  142:aload_2         
	//   69  143:ldc2            #356 <String ")">
	//   70  146:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   71  149:pop             
			paymentmethodactivity.startActivityForResult(intent, 1);
	//   72  150:aload_0         
	//   73  151:aload_1         
	//   74  152:iconst_1        
	//   75  153:invokevirtual   #357 <Method void startActivityForResult(Intent, int)>
			return;
	//   76  156:return          
		}
	}

	private void d()
	{
		k = bindService(cd.b(((Activity) (this))), j, 1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:invokestatic    #360 <Method Intent cd.b(Activity)>
	//    4    6:aload_0         
	//    5    7:getfield        #37  <Field ServiceConnection j>
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #364 <Method boolean bindService(Intent, ServiceConnection, int)>
	//    8   14:putfield        #366 <Field boolean k>
	//    9   17:return          
	}

	static void d(PaymentMethodActivity paymentmethodactivity)
	{
		paymentmethodactivity.showDialog(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #138 <Method void showDialog(int)>
	//    3    5:return          
	}

	static boolean e(PaymentMethodActivity paymentmethodactivity)
	{
		return paymentmethodactivity.e;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field boolean e>
	//    2    4:ireturn         
	}

	static void f(PaymentMethodActivity paymentmethodactivity)
	{
		paymentmethodactivity.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #304 <Method void b()>
	//    2    4:return          
	}

	static PayPalService g(PaymentMethodActivity paymentmethodactivity)
	{
		return paymentmethodactivity.i;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field PayPalService i>
	//    2    4:areturn         
	}

	static void h(PaymentMethodActivity paymentmethodactivity)
	{
		paymentmethodactivity.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #370 <Method void c()>
	//    2    4:return          
	}

	static void i(PaymentMethodActivity paymentmethodactivity)
	{
		if(!paymentmethodactivity.f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #372 <Field boolean f>
	//*   2    4:ifne            22
		{
			paymentmethodactivity.f = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #372 <Field boolean f>
			paymentmethodactivity.i.a(ed.c);
	//    6   12:aload_0         
	//    7   13:getfield        #40  <Field PayPalService i>
	//    8   16:getstatic       #374 <Field ed ed.c>
	//    9   19:invokevirtual   #77  <Method void PayPalService.a(ed)>
		}
		boolean flag;
		if(!paymentmethodactivity.c && (!paymentmethodactivity.i.d().i() || paymentmethodactivity.i.s() == null))
	//*  10   22:aload_0         
	//*  11   23:getfield        #376 <Field boolean c>
	//*  12   26:ifne            57
	//*  13   29:aload_0         
	//*  14   30:getfield        #40  <Field PayPalService i>
	//*  15   33:invokevirtual   #85  <Method PayPalConfiguration PayPalService.d()>
	//*  16   36:invokevirtual   #250 <Method boolean PayPalConfiguration.i()>
	//*  17   39:ifeq            52
	//*  18   42:aload_0         
	//*  19   43:getfield        #40  <Field PayPalService i>
	//*  20   46:invokevirtual   #265 <Method dt PayPalService.s()>
	//*  21   49:ifnonnull       57
			flag = true;
	//   22   52:iconst_1        
	//   23   53:istore_1        
		else
	//*  24   54:goto            59
			flag = false;
	//   25   57:iconst_0        
	//   26   58:istore_1        
		(new StringBuilder("autoAdvanceToPayPalConfirmIfLoggedIn: ")).append(flag);
	//   27   59:new             #140 <Class StringBuilder>
	//   28   62:dup             
	//   29   63:ldc2            #378 <String "autoAdvanceToPayPalConfirmIfLoggedIn: ">
	//   30   66:invokespecial   #349 <Method void StringBuilder(String)>
	//   31   69:iload_1         
	//   32   70:invokevirtual   #381 <Method StringBuilder StringBuilder.append(boolean)>
	//   33   73:pop             
		if(!dj.a(((android.content.Context) (paymentmethodactivity)), paymentmethodactivity.i) && (!paymentmethodactivity.i.d().i() && !paymentmethodactivity.c || flag && paymentmethodactivity.i.j() && paymentmethodactivity.i.c().g.a()))
	//*  34   74:aload_0         
	//*  35   75:aload_0         
	//*  36   76:getfield        #40  <Field PayPalService i>
	//*  37   79:invokestatic    #152 <Method boolean dj.a(android.content.Context, PayPalService)>
	//*  38   82:ifne            179
	//*  39   85:aload_0         
	//*  40   86:getfield        #40  <Field PayPalService i>
	//*  41   89:invokevirtual   #85  <Method PayPalConfiguration PayPalService.d()>
	//*  42   92:invokevirtual   #250 <Method boolean PayPalConfiguration.i()>
	//*  43   95:ifne            105
	//*  44   98:aload_0         
	//*  45   99:getfield        #376 <Field boolean c>
	//*  46  102:ifeq            135
	//*  47  105:iload_1         
	//*  48  106:ifeq            179
	//*  49  109:aload_0         
	//*  50  110:getfield        #40  <Field PayPalService i>
	//*  51  113:invokevirtual   #217 <Method boolean PayPalService.j()>
	//*  52  116:ifeq            179
	//*  53  119:aload_0         
	//*  54  120:getfield        #40  <Field PayPalService i>
	//*  55  123:invokevirtual   #220 <Method ck PayPalService.c()>
	//*  56  126:getfield        #225 <Field dw ck.g>
	//*  57  129:invokevirtual   #229 <Method boolean dw.a()>
	//*  58  132:ifeq            179
		{
			paymentmethodactivity.showDialog(3);
	//   59  135:aload_0         
	//   60  136:iconst_3        
	//   61  137:invokevirtual   #138 <Method void showDialog(int)>
			paymentmethodactivity.c = true;
	//   62  140:aload_0         
	//   63  141:iconst_1        
	//   64  142:putfield        #376 <Field boolean c>
			paymentmethodactivity.b = new Timer();
	//   65  145:aload_0         
	//   66  146:new             #383 <Class Timer>
	//   67  149:dup             
	//   68  150:invokespecial   #384 <Method void Timer()>
	//   69  153:putfield        #386 <Field Timer b>
			paymentmethodactivity.b.schedule(((java.util.TimerTask) (new cr(paymentmethodactivity))), 1000L);
	//   70  156:aload_0         
	//   71  157:getfield        #386 <Field Timer b>
	//   72  160:new             #388 <Class cr>
	//   73  163:dup             
	//   74  164:aload_0         
	//   75  165:invokespecial   #389 <Method void cr(PaymentMethodActivity)>
	//   76  168:ldc2w           #390 <Long 1000L>
	//   77  171:invokevirtual   #395 <Method void Timer.schedule(java.util.TimerTask, long)>
			paymentmethodactivity.c = true;
	//   78  174:aload_0         
	//   79  175:iconst_1        
	//   80  176:putfield        #376 <Field boolean c>
		}
		paymentmethodactivity.c();
	//   81  179:aload_0         
	//   82  180:invokespecial   #370 <Method void c()>
	//   83  183:return          
	}

	protected final void onActivityResult(int l, int i1, Intent intent)
	{
		super.onActivityResult(l, i1, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #399 <Method void Activity.onActivityResult(int, int, Intent)>
		StringBuilder stringbuilder = new StringBuilder();
	//    5    7:new             #140 <Class StringBuilder>
	//    6   10:dup             
	//    7   11:invokespecial   #141 <Method void StringBuilder()>
	//    8   14:astore          4
		stringbuilder.append(a);
	//    9   16:aload           4
	//   10   18:getstatic       #43  <Field String a>
	//   11   21:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(".onActivityResult (requestCode: ");
	//   13   25:aload           4
	//   14   27:ldc2            #401 <String ".onActivityResult (requestCode: ">
	//   15   30:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		stringbuilder.append(l);
	//   17   34:aload           4
	//   18   36:iload_1         
	//   19   37:invokevirtual   #404 <Method StringBuilder StringBuilder.append(int)>
	//   20   40:pop             
		stringbuilder.append(", resultCode: ");
	//   21   41:aload           4
	//   22   43:ldc2            #406 <String ", resultCode: ">
	//   23   46:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
		stringbuilder.append(i1);
	//   25   50:aload           4
	//   26   52:iload_2         
	//   27   53:invokevirtual   #404 <Method StringBuilder StringBuilder.append(int)>
	//   28   56:pop             
		stringbuilder.append(")");
	//   29   57:aload           4
	//   30   59:ldc2            #356 <String ")">
	//   31   62:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   32   65:pop             
		switch(l)
	//*  33   66:iload_1         
		{
	//*  34   67:tableswitch     1 2: default 88
	//	               1 146
	//	               2 89
		default:
			return;
	//   35   88:return          

		case 2: // '\002'
			if(i1 == -1)
	//*  36   89:iload_2         
	//*  37   90:iconst_m1       
	//*  38   91:icmpne          136
			{
				intent = ((Intent) ((PaymentConfirmation)intent.getParcelableExtra("com.paypal.android.sdk.paymentConfirmation")));
	//   39   94:aload_3         
	//   40   95:ldc2            #408 <String "com.paypal.android.sdk.paymentConfirmation">
	//   41   98:invokevirtual   #412 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   42  101:checkcast       #414 <Class PaymentConfirmation>
	//   43  104:astore_3        
				Intent intent1 = new Intent();
	//   44  105:new             #46  <Class Intent>
	//   45  108:dup             
	//   46  109:invokespecial   #415 <Method void Intent()>
	//   47  112:astore          4
				intent1.putExtra("com.paypal.android.sdk.paymentConfirmation", ((android.os.Parcelable) (intent)));
	//   48  114:aload           4
	//   49  116:ldc2            #408 <String "com.paypal.android.sdk.paymentConfirmation">
	//   50  119:aload_3         
	//   51  120:invokevirtual   #63  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   52  123:pop             
				setResult(i1, intent1);
	//   53  124:aload_0         
	//   54  125:iload_2         
	//   55  126:aload           4
	//   56  128:invokevirtual   #419 <Method void setResult(int, Intent)>
				finish();
	//   57  131:aload_0         
	//   58  132:invokevirtual   #422 <Method void finish()>
				return;
	//   59  135:return          
			}
			if(i1 == 0)
	//*  60  136:iload_2         
	//*  61  137:ifne            202
			{
				c = true;
	//   62  140:aload_0         
	//   63  141:iconst_1        
	//   64  142:putfield        #376 <Field boolean c>
				return;
	//   65  145:return          
			}
			break;

		case 1: // '\001'
			if(intent != null && intent.hasExtra(cd.a("io.card.payment.CardIOActivity", "EXTRA_SCAN_RESULT")))
	//*  66  146:aload_3         
	//*  67  147:ifnull          202
	//*  68  150:aload_3         
	//*  69  151:ldc2            #326 <String "io.card.payment.CardIOActivity">
	//*  70  154:ldc2            #424 <String "EXTRA_SCAN_RESULT">
	//*  71  157:invokestatic    #334 <Method String cd.a(String, String)>
	//*  72  160:invokevirtual   #428 <Method boolean Intent.hasExtra(String)>
	//*  73  163:ifeq            202
			{
				intent = ((Intent) (intent.getParcelableExtra(cd.a("io.card.payment.CardIOActivity", "EXTRA_SCAN_RESULT"))));
	//   74  166:aload_3         
	//   75  167:ldc2            #326 <String "io.card.payment.CardIOActivity">
	//   76  170:ldc2            #424 <String "EXTRA_SCAN_RESULT">
	//   77  173:invokestatic    #334 <Method String cd.a(String, String)>
	//   78  176:invokevirtual   #412 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   79  179:astore_3        
				PaymentConfirmActivity.a(((Activity) (this)), 2, cl.b, ((android.os.Parcelable) (intent)), (PayPalConfiguration)getIntent().getParcelableExtra("com.paypal.android.sdk.paypalConfiguration"), true);
	//   80  180:aload_0         
	//   81  181:iconst_2        
	//   82  182:getstatic       #430 <Field cl cl.b>
	//   83  185:aload_3         
	//   84  186:aload_0         
	//   85  187:invokevirtual   #431 <Method Intent getIntent()>
	//   86  190:ldc1            #59  <String "com.paypal.android.sdk.paypalConfiguration">
	//   87  192:invokevirtual   #412 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   88  195:checkcast       #248 <Class PayPalConfiguration>
	//   89  198:iconst_1        
	//   90  199:invokestatic    #90  <Method void PaymentConfirmActivity.a(Activity, int, cl, android.os.Parcelable, PayPalConfiguration, boolean)>
			}
			break;
		}
	//   91  202:return          
	}

	public final void onBackPressed()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #140 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #141 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append(a);
	//    4    8:aload_1         
	//    5    9:getstatic       #43  <Field String a>
	//    6   12:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(".onBackPressed");
	//    8   16:aload_1         
	//    9   17:ldc2            #434 <String ".onBackPressed">
	//   10   20:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		obj = ((Object) (i));
	//   12   24:aload_0         
	//   13   25:getfield        #40  <Field PayPalService i>
	//   14   28:astore_1        
		if(obj != null)
	//*  15   29:aload_1         
	//*  16   30:ifnull          40
			((PayPalService) (obj)).a(ed.d);
	//   17   33:aload_1         
	//   18   34:getstatic       #436 <Field ed ed.d>
	//   19   37:invokevirtual   #77  <Method void PayPalService.a(ed)>
		obj = ((Object) (b));
	//   20   40:aload_0         
	//   21   41:getfield        #386 <Field Timer b>
	//   22   44:astore_1        
		if(obj != null)
	//*  23   45:aload_1         
	//*  24   46:ifnull          53
			((Timer) (obj)).cancel();
	//   25   49:aload_1         
	//   26   50:invokevirtual   #439 <Method void Timer.cancel()>
		super.onBackPressed();
	//   27   53:aload_0         
	//   28   54:invokespecial   #441 <Method void Activity.onBackPressed()>
	//   29   57:return          
	}

	protected final void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #445 <Method void Activity.onCreate(Bundle)>
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #140 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #141 <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append(a);
	//    7   13:aload_3         
	//    8   14:getstatic       #43  <Field String a>
	//    9   17:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append(".onCreate");
	//   11   21:aload_3         
	//   12   22:ldc2            #447 <String ".onCreate">
	//   13   25:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		((Activity)this).setTheme(0x103006e);
	//   15   29:aload_0         
	//   16   30:ldc2            #448 <Int 0x103006e>
	//   17   33:invokevirtual   #451 <Method void Activity.setTheme(int)>
		((Activity)this).requestWindowFeature(8);
	//   18   36:aload_0         
	//   19   37:bipush          8
	//   20   39:invokevirtual   #455 <Method boolean Activity.requestWindowFeature(int)>
	//   21   42:pop             
		d();
	//   22   43:aload_0         
	//   23   44:invokespecial   #457 <Method void d()>
		g = new fm(((android.content.Context) (this)));
	//   24   47:aload_0         
	//   25   48:new             #99  <Class fm>
	//   26   51:dup             
	//   27   52:aload_0         
	//   28   53:invokespecial   #460 <Method void fm(android.content.Context)>
	//   29   56:putfield        #97  <Field fm g>
		h = new bs(getIntent());
	//   30   59:aload_0         
	//   31   60:new             #158 <Class bs>
	//   32   63:dup             
	//   33   64:aload_0         
	//   34   65:invokevirtual   #431 <Method Intent getIntent()>
	//   35   68:invokespecial   #463 <Method void bs(Intent)>
	//   36   71:putfield        #156 <Field bs h>
		setContentView(((android.view.View) (g.a)));
	//   37   74:aload_0         
	//   38   75:aload_0         
	//   39   76:getfield        #97  <Field fm g>
	//   40   79:getfield        #466 <Field android.view.ViewGroup fm.a>
	//   41   82:invokevirtual   #470 <Method void setContentView(android.view.View)>
		cd.a(((Activity) (this)), g.l, fc.bi);
	//   42   85:aload_0         
	//   43   86:aload_0         
	//   44   87:getfield        #97  <Field fm g>
	//   45   90:getfield        #473 <Field TextView fm.l>
	//   46   93:getstatic       #476 <Field fc fc.bi>
	//   47   96:invokestatic    #479 <Method void cd.a(Activity, TextView, fc)>
		g.f.setText(((CharSequence) (fa.a(fc.aw))));
	//   48   99:aload_0         
	//   49  100:getfield        #97  <Field fm g>
	//   50  103:getfield        #481 <Field TextView fm.f>
	//   51  106:getstatic       #484 <Field fc fc.aw>
	//   52  109:invokestatic    #131 <Method String fa.a(fc)>
	//   53  112:invokevirtual   #212 <Method void TextView.setText(CharSequence)>
		g.b.setText(((CharSequence) (fa.a(fc.ar))));
	//   54  115:aload_0         
	//   55  116:getfield        #97  <Field fm g>
	//   56  119:getfield        #243 <Field Button fm.b>
	//   57  122:getstatic       #487 <Field fc fc.ar>
	//   58  125:invokestatic    #131 <Method String fa.a(fc)>
	//   59  128:invokevirtual   #293 <Method void Button.setText(CharSequence)>
		g.j.setOnClickListener(((android.view.View.OnClickListener) (new cn(this))));
	//   60  131:aload_0         
	//   61  132:getfield        #97  <Field fm g>
	//   62  135:getfield        #489 <Field LinearLayout fm.j>
	//   63  138:new             #491 <Class cn>
	//   64  141:dup             
	//   65  142:aload_0         
	//   66  143:invokespecial   #492 <Method void cn(PaymentMethodActivity)>
	//   67  146:invokevirtual   #496 <Method void LinearLayout.setOnClickListener(android.view.View$OnClickListener)>
		g.b.setOnClickListener(((android.view.View.OnClickListener) (new co(this))));
	//   68  149:aload_0         
	//   69  150:getfield        #97  <Field fm g>
	//   70  153:getfield        #243 <Field Button fm.b>
	//   71  156:new             #498 <Class co>
	//   72  159:dup             
	//   73  160:aload_0         
	//   74  161:invokespecial   #499 <Method void co(PaymentMethodActivity)>
	//   75  164:invokevirtual   #500 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		g.h.setOnClickListener(((android.view.View.OnClickListener) (new cp(this))));
	//   76  167:aload_0         
	//   77  168:getfield        #97  <Field fm g>
	//   78  171:getfield        #296 <Field LinearLayout fm.h>
	//   79  174:new             #502 <Class cp>
	//   80  177:dup             
	//   81  178:aload_0         
	//   82  179:invokespecial   #503 <Method void cp(PaymentMethodActivity)>
	//   83  182:invokevirtual   #496 <Method void LinearLayout.setOnClickListener(android.view.View$OnClickListener)>
		g.k.setOnClickListener(((android.view.View.OnClickListener) (new cq(this))));
	//   84  185:aload_0         
	//   85  186:getfield        #97  <Field fm g>
	//   86  189:getfield        #292 <Field Button fm.k>
	//   87  192:new             #505 <Class cq>
	//   88  195:dup             
	//   89  196:aload_0         
	//   90  197:invokespecial   #506 <Method void cq(PaymentMethodActivity)>
	//   91  200:invokevirtual   #500 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		boolean flag;
		if(bundle == null)
	//*  92  203:aload_1         
	//*  93  204:ifnonnull       223
		{
			if(!cd.a(((Activity) (this))))
	//*  94  207:aload_0         
	//*  95  208:invokestatic    #509 <Method boolean cd.a(Activity)>
	//*  96  211:ifne            218
				finish();
	//   97  214:aload_0         
	//   98  215:invokevirtual   #422 <Method void finish()>
			flag = false;
	//   99  218:iconst_0        
	//  100  219:istore_2        
		} else
	//* 101  220:goto            242
		{
			c = bundle.getBoolean("PP_PreventAutoLogin");
	//  102  223:aload_0         
	//  103  224:aload_1         
	//  104  225:ldc2            #511 <String "PP_PreventAutoLogin">
	//  105  228:invokevirtual   #516 <Method boolean Bundle.getBoolean(String)>
	//  106  231:putfield        #376 <Field boolean c>
			flag = bundle.getBoolean("PP_PageTrackingSent");
	//  107  234:aload_1         
	//  108  235:ldc2            #518 <String "PP_PageTrackingSent">
	//  109  238:invokevirtual   #516 <Method boolean Bundle.getBoolean(String)>
	//  110  241:istore_2        
		}
		f = flag;
	//  111  242:aload_0         
	//  112  243:iload_2         
	//  113  244:putfield        #372 <Field boolean f>
		b = null;
	//  114  247:aload_0         
	//  115  248:aconst_null     
	//  116  249:putfield        #386 <Field Timer b>
	//  117  252:return          
	}

	protected final Dialog onCreateDialog(int l, Bundle bundle)
	{
		switch(l)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 60
	//	               2 41
	//	               3 30
		default:
			return null;
	//    2   28:aconst_null     
	//    3   29:areturn         

		case 3: // '\003'
			return cd.a(((android.content.Context) (this)), fc.c, fc.bq);
	//    4   30:aload_0         
	//    5   31:getstatic       #522 <Field fc fc.c>
	//    6   34:getstatic       #525 <Field fc fc.bq>
	//    7   37:invokestatic    #528 <Method Dialog cd.a(android.content.Context, fc, fc)>
	//    8   40:areturn         

		case 2: // '\002'
			return ((Dialog) (cd.a(((Activity) (this)), fc.bk, fc.B, ((android.content.DialogInterface.OnClickListener) (new ct(this))))));
	//    9   41:aload_0         
	//   10   42:getstatic       #531 <Field fc fc.bk>
	//   11   45:getstatic       #534 <Field fc fc.B>
	//   12   48:new             #536 <Class ct>
	//   13   51:dup             
	//   14   52:aload_0         
	//   15   53:invokespecial   #537 <Method void ct(PaymentMethodActivity)>
	//   16   56:invokestatic    #540 <Method android.app.AlertDialog cd.a(Activity, fc, fc, android.content.DialogInterface$OnClickListener)>
	//   17   59:areturn         

		case 1: // '\001'
			return ((Dialog) (cd.a(((Activity) (this)), fc.as, fc.D, ((android.content.DialogInterface.OnClickListener) (new cs(this))))));
	//   18   60:aload_0         
	//   19   61:getstatic       #543 <Field fc fc.as>
	//   20   64:getstatic       #546 <Field fc fc.D>
	//   21   67:new             #548 <Class cs>
	//   22   70:dup             
	//   23   71:aload_0         
	//   24   72:invokespecial   #549 <Method void cs(PaymentMethodActivity)>
	//   25   75:invokestatic    #540 <Method android.app.AlertDialog cd.a(Activity, fc, fc, android.content.DialogInterface$OnClickListener)>
	//   26   78:areturn         
		}
	}

	protected final void onDestroy()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #140 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #141 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(a);
	//    4    8:aload_1         
	//    5    9:getstatic       #43  <Field String a>
	//    6   12:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(".onDestroy");
	//    8   16:aload_1         
	//    9   17:ldc2            #552 <String ".onDestroy">
	//   10   20:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		if(k)
	//*  12   24:aload_0         
	//*  13   25:getfield        #366 <Field boolean k>
	//*  14   28:ifeq            44
		{
			unbindService(j);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #37  <Field ServiceConnection j>
	//   18   36:invokevirtual   #556 <Method void unbindService(ServiceConnection)>
			k = false;
	//   19   39:aload_0         
	//   20   40:iconst_0        
	//   21   41:putfield        #366 <Field boolean k>
		}
		super.onDestroy();
	//   22   44:aload_0         
	//   23   45:invokespecial   #558 <Method void Activity.onDestroy()>
	//   24   48:return          
	}

	protected final void onRestart()
	{
		super.onRestart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #561 <Method void Activity.onRestart()>
		d();
	//    2    4:aload_0         
	//    3    5:invokespecial   #457 <Method void d()>
	//    4    8:return          
	}

	protected final void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #564 <Method void Activity.onResume()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #140 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #141 <Method void StringBuilder()>
	//    5   11:astore_1        
		stringbuilder.append(a);
	//    6   12:aload_1         
	//    7   13:getstatic       #43  <Field String a>
	//    8   16:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(".onResume");
	//   10   20:aload_1         
	//   11   21:ldc2            #566 <String ".onResume">
	//   12   24:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		if(i != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #40  <Field PayPalService i>
	//*  16   32:ifnull          39
			c();
	//   17   35:aload_0         
	//   18   36:invokespecial   #370 <Method void c()>
	//   19   39:return          
	}

	protected final void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #569 <Method void Activity.onSaveInstanceState(Bundle)>
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #140 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #141 <Method void StringBuilder()>
	//    6   12:astore_2        
		stringbuilder.append(a);
	//    7   13:aload_2         
	//    8   14:getstatic       #43  <Field String a>
	//    9   17:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append(".onSaveInstanceState");
	//   11   21:aload_2         
	//   12   22:ldc2            #571 <String ".onSaveInstanceState">
	//   13   25:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		bundle.putBoolean("PP_PreventAutoLogin", c);
	//   15   29:aload_1         
	//   16   30:ldc2            #511 <String "PP_PreventAutoLogin">
	//   17   33:aload_0         
	//   18   34:getfield        #376 <Field boolean c>
	//   19   37:invokevirtual   #575 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBoolean("PP_PageTrackingSent", f);
	//   20   40:aload_1         
	//   21   41:ldc2            #518 <String "PP_PageTrackingSent">
	//   22   44:aload_0         
	//   23   45:getfield        #372 <Field boolean f>
	//   24   48:invokevirtual   #575 <Method void Bundle.putBoolean(String, boolean)>
	//   25   51:return          
	}

	public final void onWindowFocusChanged(boolean flag)
	{
		super.onWindowFocusChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #579 <Method void Activity.onWindowFocusChanged(boolean)>
		g.c.a();
	//    3    5:aload_0         
	//    4    6:getfield        #97  <Field fm g>
	//    5    9:getfield        #200 <Field fr fm.c>
	//    6   12:invokevirtual   #581 <Method void fr.a()>
	//    7   15:return          
	}

	private static final String a = "PaymentMethodActivity";
	private Timer b;
	private boolean c;
	private boolean d;
	private boolean e;
	private boolean f;
	private fm g;
	private bs h;
	private PayPalService i;
	private final ServiceConnection j = new cu(this);
	private boolean k;

	static 
	{
	//    0    0:return          
	}
}
