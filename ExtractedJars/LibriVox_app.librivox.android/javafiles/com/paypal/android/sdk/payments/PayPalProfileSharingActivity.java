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
//			av, aw, PayPalService, ProfileSharingConsentActivity, 
//			PayPalAuthorization, LoginActivity, FuturePaymentInfoActivity, cd, 
//			au, bh

public final class PayPalProfileSharingActivity extends Activity
{

	public PayPalProfileSharingActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Activity()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class av>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #29  <Method void av(PayPalProfileSharingActivity)>
	//    7   13:putfield        #31  <Field ServiceConnection e>
	//    8   16:return          
	}

	static PayPalService a(PayPalProfileSharingActivity paypalprofilesharingactivity, PayPalService paypalservice)
	{
		paypalprofilesharingactivity.d = paypalservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field PayPalService d>
		return paypalservice;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static bh a(PayPalProfileSharingActivity paypalprofilesharingactivity)
	{
		return ((bh) (new aw(paypalprofilesharingactivity)));
	//    0    0:new             #37  <Class aw>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #38  <Method void aw(PayPalProfileSharingActivity)>
	//    4    8:areturn         
	}

	static String a()
	{
		return a;
	//    0    0:getstatic       #41  <Field String a>
	//    1    3:areturn         
	}

	static Date a(PayPalProfileSharingActivity paypalprofilesharingactivity, Date date)
	{
		paypalprofilesharingactivity.b = date;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field Date b>
		return date;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Timer a(PayPalProfileSharingActivity paypalprofilesharingactivity, Timer timer)
	{
		paypalprofilesharingactivity.c = timer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field Timer c>
		return timer;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static PayPalService b(PayPalProfileSharingActivity paypalprofilesharingactivity)
	{
		return paypalprofilesharingactivity.d;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PayPalService d>
	//    2    4:areturn         
	}

	static void c(PayPalProfileSharingActivity paypalprofilesharingactivity)
	{
		ProfileSharingConsentActivity.a(((Activity) (paypalprofilesharingactivity)), 1, paypalprofilesharingactivity.d.d());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #34  <Field PayPalService d>
	//    4    6:invokevirtual   #53  <Method PayPalConfiguration PayPalService.d()>
	//    5    9:invokestatic    #58  <Method void ProfileSharingConsentActivity.a(Activity, int, PayPalConfiguration)>
	//    6   12:return          
	}

	static Date d(PayPalProfileSharingActivity paypalprofilesharingactivity)
	{
		return paypalprofilesharingactivity.b;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Date b>
	//    2    4:areturn         
	}

	static Timer e(PayPalProfileSharingActivity paypalprofilesharingactivity)
	{
		return paypalprofilesharingactivity.c;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Timer c>
	//    2    4:areturn         
	}

	public final void finish()
	{
		super.finish();
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Activity.finish()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #65  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #66  <Method void StringBuilder()>
	//    5   11:astore_1        
		stringbuilder.append(((Object)this).getClass().getSimpleName());
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #72  <Method Class Object.getClass()>
	//    9   17:invokevirtual   #77  <Method String Class.getSimpleName()>
	//   10   20:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(".finish");
	//   12   24:aload_1         
	//   13   25:ldc1            #83  <String ".finish">
	//   14   27:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
	//   16   31:return          
	}

	protected final void onActivityResult(int i, int j, Intent intent)
	{
		super.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #87  <Method void Activity.onActivityResult(int, int, Intent)>
		StringBuilder stringbuilder = new StringBuilder();
	//    5    7:new             #65  <Class StringBuilder>
	//    6   10:dup             
	//    7   11:invokespecial   #66  <Method void StringBuilder()>
	//    8   14:astore          4
		stringbuilder.append(((Object)this).getClass().getSimpleName());
	//    9   16:aload           4
	//   10   18:aload_0         
	//   11   19:invokevirtual   #72  <Method Class Object.getClass()>
	//   12   22:invokevirtual   #77  <Method String Class.getSimpleName()>
	//   13   25:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		stringbuilder.append(".onActivityResult");
	//   15   29:aload           4
	//   16   31:ldc1            #89  <String ".onActivityResult">
	//   17   33:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		if(i == 1)
	//*  19   37:iload_1         
	//*  20   38:iconst_1        
	//*  21   39:icmpne          179
			switch(j)
	//*  22   42:iload_2         
			{
	//*  23   43:tableswitch     -1 0: default 64
	//	               -1 107
	//	               0 179
			default:
				intent = ((Intent) (a));
	//   24   64:getstatic       #41  <Field String a>
	//   25   67:astore_3        
				StringBuilder stringbuilder1 = new StringBuilder("unexpected request code ");
	//   26   68:new             #65  <Class StringBuilder>
	//   27   71:dup             
	//   28   72:ldc1            #91  <String "unexpected request code ">
	//   29   74:invokespecial   #94  <Method void StringBuilder(String)>
	//   30   77:astore          4
				stringbuilder1.append(i);
	//   31   79:aload           4
	//   32   81:iload_1         
	//   33   82:invokevirtual   #97  <Method StringBuilder StringBuilder.append(int)>
	//   34   85:pop             
				stringbuilder1.append(" call it a cancel");
	//   35   86:aload           4
	//   36   88:ldc1            #99  <String " call it a cancel">
	//   37   90:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   38   93:pop             
				Log.wtf(((String) (intent)), stringbuilder1.toString());
	//   39   94:aload_3         
	//   40   95:aload           4
	//   41   97:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   42  100:invokestatic    #108 <Method int Log.wtf(String, String)>
	//   43  103:pop             
				break;
	//   44  104:goto            179

			case 0: // '\0'
				break;

			case -1: 
				String s;
				if(intent != null)
	//*  45  107:aload_3         
	//*  46  108:ifnull          164
				{
					intent = ((Intent) ((PayPalAuthorization)intent.getParcelableExtra("com.paypal.android.sdk.authorization")));
	//   47  111:aload_3         
	//   48  112:ldc1            #110 <String "com.paypal.android.sdk.authorization">
	//   49  114:invokevirtual   #116 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   50  117:checkcast       #118 <Class PayPalAuthorization>
	//   51  120:astore_3        
					if(intent != null)
	//*  52  121:aload_3         
	//*  53  122:ifnull          153
					{
						Intent intent1 = new Intent();
	//   54  125:new             #112 <Class Intent>
	//   55  128:dup             
	//   56  129:invokespecial   #119 <Method void Intent()>
	//   57  132:astore          4
						intent1.putExtra("com.paypal.android.sdk.authorization", ((android.os.Parcelable) (intent)));
	//   58  134:aload           4
	//   59  136:ldc1            #110 <String "com.paypal.android.sdk.authorization">
	//   60  138:aload_3         
	//   61  139:invokevirtual   #123 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   62  142:pop             
						setResult(-1, intent1);
	//   63  143:aload_0         
	//   64  144:iconst_m1       
	//   65  145:aload           4
	//   66  147:invokevirtual   #127 <Method void setResult(int, Intent)>
						break;
	//   67  150:goto            179
					}
					intent = ((Intent) (a));
	//   68  153:getstatic       #41  <Field String a>
	//   69  156:astore_3        
					s = "result was OK, have data, but no authorization state in bundle, oops";
	//   70  157:ldc1            #129 <String "result was OK, have data, but no authorization state in bundle, oops">
	//   71  159:astore          4
				} else
	//*  72  161:goto            172
				{
					intent = ((Intent) (a));
	//   73  164:getstatic       #41  <Field String a>
	//   74  167:astore_3        
					s = "result was OK, no intent data, oops";
	//   75  168:ldc1            #131 <String "result was OK, no intent data, oops">
	//   76  170:astore          4
				}
				Log.e(((String) (intent)), s);
	//   77  172:aload_3         
	//   78  173:aload           4
	//   79  175:invokestatic    #133 <Method int Log.e(String, String)>
	//   80  178:pop             
				break;
			}
		finish();
	//   81  179:aload_0         
	//   82  180:invokevirtual   #134 <Method void finish()>
	//   83  183:return          
	}

	protected final void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #138 <Method void Activity.onCreate(Bundle)>
		bundle = ((Bundle) (new StringBuilder()));
	//    3    5:new             #65  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #66  <Method void StringBuilder()>
	//    6   12:astore_1        
		((StringBuilder) (bundle)).append(((Object)this).getClass().getSimpleName());
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #72  <Method Class Object.getClass()>
	//   10   18:invokevirtual   #77  <Method String Class.getSimpleName()>
	//   11   21:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		((StringBuilder) (bundle)).append(".onCreate");
	//   13   25:aload_1         
	//   14   26:ldc1            #140 <String ".onCreate">
	//   15   28:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		(new fz(((android.content.Context) (this)))).a();
	//   17   32:new             #142 <Class fz>
	//   18   35:dup             
	//   19   36:aload_0         
	//   20   37:invokespecial   #145 <Method void fz(android.content.Context)>
	//   21   40:invokevirtual   #147 <Method void fz.a()>
		(new fy(((android.content.Context) (this)))).a();
	//   22   43:new             #149 <Class fy>
	//   23   46:dup             
	//   24   47:aload_0         
	//   25   48:invokespecial   #150 <Method void fy(android.content.Context)>
	//   26   51:invokevirtual   #151 <Method void fy.a()>
		(new fx(((android.content.Context) (this)))).a(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
			((Class) (com/paypal/android/sdk/payments/PayPalProfileSharingActivity)).getName(), ((Class) (com/paypal/android/sdk/payments/LoginActivity)).getName(), ((Class) (com/paypal/android/sdk/payments/FuturePaymentInfoActivity)).getName(), ((Class) (com/paypal/android/sdk/payments/ProfileSharingConsentActivity)).getName()
		}))))));
	//   27   54:new             #153 <Class fx>
	//   28   57:dup             
	//   29   58:aload_0         
	//   30   59:invokespecial   #154 <Method void fx(android.content.Context)>
	//   31   62:iconst_4        
	//   32   63:anewarray       String[]
	//   33   66:dup             
	//   34   67:iconst_0        
	//   35   68:ldc1            #2   <Class PayPalProfileSharingActivity>
	//   36   70:invokevirtual   #159 <Method String Class.getName()>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_1        
	//   40   76:ldc1            #161 <Class LoginActivity>
	//   41   78:invokevirtual   #159 <Method String Class.getName()>
	//   42   81:aastore         
	//   43   82:dup             
	//   44   83:iconst_2        
	//   45   84:ldc1            #163 <Class FuturePaymentInfoActivity>
	//   46   86:invokevirtual   #159 <Method String Class.getName()>
	//   47   89:aastore         
	//   48   90:dup             
	//   49   91:iconst_3        
	//   50   92:ldc1            #55  <Class ProfileSharingConsentActivity>
	//   51   94:invokevirtual   #159 <Method String Class.getName()>
	//   52   97:aastore         
	//   53   98:invokestatic    #169 <Method java.util.List Arrays.asList(Object[])>
	//   54  101:invokevirtual   #172 <Method void fx.a(java.util.Collection)>
		f = bindService(cd.b(((Activity) (this))), e, 1);
	//   55  104:aload_0         
	//   56  105:aload_0         
	//   57  106:aload_0         
	//   58  107:invokestatic    #177 <Method Intent cd.b(Activity)>
	//   59  110:aload_0         
	//   60  111:getfield        #31  <Field ServiceConnection e>
	//   61  114:iconst_1        
	//   62  115:invokevirtual   #181 <Method boolean bindService(Intent, ServiceConnection, int)>
	//   63  118:putfield        #183 <Field boolean f>
		((Activity)this).setTheme(0x103006e);
	//   64  121:aload_0         
	//   65  122:ldc1            #184 <Int 0x103006e>
	//   66  124:invokevirtual   #188 <Method void Activity.setTheme(int)>
		((Activity)this).requestWindowFeature(8);
	//   67  127:aload_0         
	//   68  128:bipush          8
	//   69  130:invokevirtual   #192 <Method boolean Activity.requestWindowFeature(int)>
	//   70  133:pop             
		bundle = ((Bundle) (new fu(((android.content.Context) (this)))));
	//   71  134:new             #194 <Class fu>
	//   72  137:dup             
	//   73  138:aload_0         
	//   74  139:invokespecial   #195 <Method void fu(android.content.Context)>
	//   75  142:astore_1        
		setContentView(((android.view.View) (((fu) (bundle)).a)));
	//   76  143:aload_0         
	//   77  144:aload_1         
	//   78  145:getfield        #198 <Field android.view.ViewGroup fu.a>
	//   79  148:invokevirtual   #202 <Method void setContentView(android.view.View)>
		((fu) (bundle)).b.setText(((CharSequence) (fa.a(fc.y))));
	//   80  151:aload_1         
	//   81  152:getfield        #205 <Field TextView fu.b>
	//   82  155:getstatic       #211 <Field fc fc.y>
	//   83  158:invokestatic    #216 <Method String fa.a(fc)>
	//   84  161:invokevirtual   #222 <Method void TextView.setText(CharSequence)>
		cd.a(((Activity) (this)), ((TextView) (null)), fc.y);
	//   85  164:aload_0         
	//   86  165:aconst_null     
	//   87  166:getstatic       #211 <Field fc fc.y>
	//   88  169:invokestatic    #225 <Method void cd.a(Activity, TextView, fc)>
	//   89  172:return          
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
	//    3   25:getstatic       #230 <Field fc fc.bc>
	//    4   28:aload_2         
	//    5   29:iload_1         
	//    6   30:invokestatic    #233 <Method Dialog cd.a(Activity, fc, Bundle, int)>
	//    7   33:areturn         

		case 3: // '\003'
			return cd.a(((Activity) (this)), fc.be, bundle, i);
	//    8   34:aload_0         
	//    9   35:getstatic       #236 <Field fc fc.be>
	//   10   38:aload_2         
	//   11   39:iload_1         
	//   12   40:invokestatic    #233 <Method Dialog cd.a(Activity, fc, Bundle, int)>
	//   13   43:areturn         

		case 2: // '\002'
			return cd.a(((Activity) (this)), ((android.content.DialogInterface.OnClickListener) (new au(this))));
	//   14   44:aload_0         
	//   15   45:new             #238 <Class au>
	//   16   48:dup             
	//   17   49:aload_0         
	//   18   50:invokespecial   #239 <Method void au(PayPalProfileSharingActivity)>
	//   19   53:invokestatic    #242 <Method Dialog cd.a(Activity, android.content.DialogInterface$OnClickListener)>
	//   20   56:areturn         
		}
	}

	protected final void onDestroy()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #65  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append(((Object)this).getClass().getSimpleName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #72  <Method Class Object.getClass()>
	//    7   13:invokevirtual   #77  <Method String Class.getSimpleName()>
	//    8   16:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		((StringBuilder) (obj)).append(".onDestroy");
	//   10   20:aload_1         
	//   11   21:ldc1            #245 <String ".onDestroy">
	//   12   23:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		obj = ((Object) (d));
	//   14   27:aload_0         
	//   15   28:getfield        #34  <Field PayPalService d>
	//   16   31:astore_1        
		if(obj != null)
	//*  17   32:aload_1         
	//*  18   33:ifnull          47
		{
			((PayPalService) (obj)).o();
	//   19   36:aload_1         
	//   20   37:invokevirtual   #248 <Method void PayPalService.o()>
			d.u();
	//   21   40:aload_0         
	//   22   41:getfield        #34  <Field PayPalService d>
	//   23   44:invokevirtual   #251 <Method void PayPalService.u()>
		}
		if(f)
	//*  24   47:aload_0         
	//*  25   48:getfield        #183 <Field boolean f>
	//*  26   51:ifeq            67
		{
			unbindService(e);
	//   27   54:aload_0         
	//   28   55:aload_0         
	//   29   56:getfield        #31  <Field ServiceConnection e>
	//   30   59:invokevirtual   #255 <Method void unbindService(ServiceConnection)>
			f = false;
	//   31   62:aload_0         
	//   32   63:iconst_0        
	//   33   64:putfield        #183 <Field boolean f>
		}
		super.onDestroy();
	//   34   67:aload_0         
	//   35   68:invokespecial   #257 <Method void Activity.onDestroy()>
	//   36   71:return          
	}

	private static final String a = "PayPalProfileSharingActivity";
	private Date b;
	private Timer c;
	private PayPalService d;
	private final ServiceConnection e = new av(this);
	private boolean f;

	static 
	{
	//    0    0:return          
	}
}
