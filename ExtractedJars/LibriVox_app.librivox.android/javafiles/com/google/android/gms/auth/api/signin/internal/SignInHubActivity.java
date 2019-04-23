// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ca;
import android.support.v4.app.x;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//			b, p, SignInConfiguration

public class SignInHubActivity extends x
{

	public SignInHubActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void x()>
		b = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #24  <Field boolean b>
	//    5    9:return          
	}

	static int a(SignInHubActivity signinhubactivity)
	{
		return signinhubactivity.e;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int e>
	//    2    4:ireturn         
	}

	private final void a()
	{
		getSupportLoaderManager().a(0, ((Bundle) (null)), ((android.support.v4.app.cb) (new b(this, ((y) (null))))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method ca getSupportLoaderManager()>
	//    2    4:iconst_0        
	//    3    5:aconst_null     
	//    4    6:new             #33  <Class b>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #36  <Method void b(SignInHubActivity, y)>
	//    9   15:invokevirtual   #41  <Method android.support.v4.a.d ca.a(int, Bundle, android.support.v4.app.cb)>
	//   10   18:pop             
		a = false;
	//   11   19:iconst_0        
	//   12   20:putstatic       #43  <Field boolean a>
	//   13   23:return          
	}

	private final void a(int i)
	{
		Status status = new Status(i);
	//    0    0:new             #46  <Class Status>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:invokespecial   #48  <Method void Status(int)>
	//    4    8:astore_2        
		Intent intent = new Intent();
	//    5    9:new             #50  <Class Intent>
	//    6   12:dup             
	//    7   13:invokespecial   #51  <Method void Intent()>
	//    8   16:astore_3        
		intent.putExtra("googleSignInStatus", ((android.os.Parcelable) (status)));
	//    9   17:aload_3         
	//   10   18:ldc1            #53  <String "googleSignInStatus">
	//   11   20:aload_2         
	//   12   21:invokevirtual   #57  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   13   24:pop             
		setResult(0, intent);
	//   14   25:aload_0         
	//   15   26:iconst_0        
	//   16   27:aload_3         
	//   17   28:invokevirtual   #61  <Method void setResult(int, Intent)>
		finish();
	//   18   31:aload_0         
	//   19   32:invokevirtual   #64  <Method void finish()>
		a = false;
	//   20   35:iconst_0        
	//   21   36:putstatic       #43  <Field boolean a>
	//   22   39:return          
	}

	static Intent b(SignInHubActivity signinhubactivity)
	{
		return signinhubactivity.f;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Intent f>
	//    2    4:areturn         
	}

	public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean b>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		setResult(0);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #73  <Method void setResult(int)>
		if(i != 40962)
	//*   7   13:iload_1         
	//*   8   14:ldc1            #74  <Int 40962>
	//*   9   16:icmpeq          20
			return;
	//   10   19:return          
		if(intent != null)
	//*  11   20:aload_3         
	//*  12   21:ifnull          142
		{
			Object obj = ((Object) ((SignInAccount)intent.getParcelableExtra("signInAccount")));
	//   13   24:aload_3         
	//   14   25:ldc1            #76  <String "signInAccount">
	//   15   27:invokevirtual   #80  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   16   30:checkcast       #82  <Class SignInAccount>
	//   17   33:astore          4
			if(obj != null && ((SignInAccount) (obj)).a() != null)
	//*  18   35:aload           4
	//*  19   37:ifnull          106
	//*  20   40:aload           4
	//*  21   42:invokevirtual   #85  <Method com.google.android.gms.auth.api.signin.GoogleSignInAccount SignInAccount.a()>
	//*  22   45:ifnull          106
			{
				obj = ((Object) (((SignInAccount) (obj)).a()));
	//   23   48:aload           4
	//   24   50:invokevirtual   #85  <Method com.google.android.gms.auth.api.signin.GoogleSignInAccount SignInAccount.a()>
	//   25   53:astore          4
				p.a(((android.content.Context) (this))).a(c.a(), ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) (obj)));
	//   26   55:aload_0         
	//   27   56:invokestatic    #90  <Method p p.a(android.content.Context)>
	//   28   59:aload_0         
	//   29   60:getfield        #92  <Field SignInConfiguration c>
	//   30   63:invokevirtual   #97  <Method com.google.android.gms.auth.api.signin.GoogleSignInOptions SignInConfiguration.a()>
	//   31   66:aload           4
	//   32   68:invokevirtual   #100 <Method void p.a(com.google.android.gms.auth.api.signin.GoogleSignInOptions, com.google.android.gms.auth.api.signin.GoogleSignInAccount)>
				intent.removeExtra("signInAccount");
	//   33   71:aload_3         
	//   34   72:ldc1            #76  <String "signInAccount">
	//   35   74:invokevirtual   #104 <Method void Intent.removeExtra(String)>
				intent.putExtra("googleSignInAccount", ((android.os.Parcelable) (obj)));
	//   36   77:aload_3         
	//   37   78:ldc1            #106 <String "googleSignInAccount">
	//   38   80:aload           4
	//   39   82:invokevirtual   #57  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   40   85:pop             
				d = true;
	//   41   86:aload_0         
	//   42   87:iconst_1        
	//   43   88:putfield        #108 <Field boolean d>
				e = j;
	//   44   91:aload_0         
	//   45   92:iload_2         
	//   46   93:putfield        #27  <Field int e>
				f = intent;
	//   47   96:aload_0         
	//   48   97:aload_3         
	//   49   98:putfield        #67  <Field Intent f>
				a();
	//   50  101:aload_0         
	//   51  102:invokespecial   #110 <Method void a()>
				return;
	//   52  105:return          
			}
			if(intent.hasExtra("errorCode"))
	//*  53  106:aload_3         
	//*  54  107:ldc1            #112 <String "errorCode">
	//*  55  109:invokevirtual   #116 <Method boolean Intent.hasExtra(String)>
	//*  56  112:ifeq            142
			{
				j = intent.getIntExtra("errorCode", 8);
	//   57  115:aload_3         
	//   58  116:ldc1            #112 <String "errorCode">
	//   59  118:bipush          8
	//   60  120:invokevirtual   #120 <Method int Intent.getIntExtra(String, int)>
	//   61  123:istore_2        
				i = j;
	//   62  124:iload_2         
	//   63  125:istore_1        
				if(j == 13)
	//*  64  126:iload_2         
	//*  65  127:bipush          13
	//*  66  129:icmpne          136
					i = 12501;
	//   67  132:sipush          12501
	//   68  135:istore_1        
				a(i);
	//   69  136:aload_0         
	//   70  137:iload_1         
	//   71  138:invokespecial   #122 <Method void a(int)>
				return;
	//   72  141:return          
			}
		}
		a(8);
	//   73  142:aload_0         
	//   74  143:bipush          8
	//   75  145:invokespecial   #122 <Method void a(int)>
	//   76  148:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #128 <Method void x.onCreate(Bundle)>
		Intent intent = getIntent();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #132 <Method Intent getIntent()>
	//    5    9:astore          4
		String s = intent.getAction();
	//    6   11:aload           4
	//    7   13:invokevirtual   #136 <Method String Intent.getAction()>
	//    8   16:astore_3        
		if("com.google.android.gms.auth.NO_IMPL".equals(((Object) (s))))
	//*   9   17:ldc1            #138 <String "com.google.android.gms.auth.NO_IMPL">
	//*  10   19:aload_3         
	//*  11   20:invokevirtual   #144 <Method boolean String.equals(Object)>
	//*  12   23:ifeq            34
		{
			a(12500);
	//   13   26:aload_0         
	//   14   27:sipush          12500
	//   15   30:invokespecial   #122 <Method void a(int)>
			return;
	//   16   33:return          
		}
		if(!s.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !s.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN"))
	//*  17   34:aload_3         
	//*  18   35:ldc1            #146 <String "com.google.android.gms.auth.GOOGLE_SIGN_IN">
	//*  19   37:invokevirtual   #144 <Method boolean String.equals(Object)>
	//*  20   40:ifne            100
	//*  21   43:aload_3         
	//*  22   44:ldc1            #148 <String "com.google.android.gms.auth.APPAUTH_SIGN_IN">
	//*  23   46:invokevirtual   #144 <Method boolean String.equals(Object)>
	//*  24   49:ifne            100
		{
			bundle = ((Bundle) (String.valueOf(((Object) (intent.getAction())))));
	//   25   52:aload           4
	//   26   54:invokevirtual   #136 <Method String Intent.getAction()>
	//   27   57:invokestatic    #152 <Method String String.valueOf(Object)>
	//   28   60:astore_1        
			if(((String) (bundle)).length() != 0)
	//*  29   61:aload_1         
	//*  30   62:invokevirtual   #156 <Method int String.length()>
	//*  31   65:ifeq            78
				bundle = ((Bundle) ("Unknown action: ".concat(((String) (bundle)))));
	//   32   68:ldc1            #158 <String "Unknown action: ">
	//   33   70:aload_1         
	//   34   71:invokevirtual   #162 <Method String String.concat(String)>
	//   35   74:astore_1        
			else
	//*  36   75:goto            88
				bundle = ((Bundle) (new String("Unknown action: ")));
	//   37   78:new             #140 <Class String>
	//   38   81:dup             
	//   39   82:ldc1            #158 <String "Unknown action: ">
	//   40   84:invokespecial   #164 <Method void String(String)>
	//   41   87:astore_1        
			Log.e("AuthSignInClient", ((String) (bundle)));
	//   42   88:ldc1            #166 <String "AuthSignInClient">
	//   43   90:aload_1         
	//   44   91:invokestatic    #171 <Method int Log.e(String, String)>
	//   45   94:pop             
			finish();
	//   46   95:aload_0         
	//   47   96:invokevirtual   #64  <Method void finish()>
			return;
	//   48   99:return          
		}
		c = (SignInConfiguration)intent.getBundleExtra("config").getParcelable("config");
	//   49  100:aload_0         
	//   50  101:aload           4
	//   51  103:ldc1            #173 <String "config">
	//   52  105:invokevirtual   #177 <Method Bundle Intent.getBundleExtra(String)>
	//   53  108:ldc1            #173 <String "config">
	//   54  110:invokevirtual   #182 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   55  113:checkcast       #94  <Class SignInConfiguration>
	//   56  116:putfield        #92  <Field SignInConfiguration c>
		if(c == null)
	//*  57  119:aload_0         
	//*  58  120:getfield        #92  <Field SignInConfiguration c>
	//*  59  123:ifnonnull       144
		{
			Log.e("AuthSignInClient", "Activity started with invalid configuration.");
	//   60  126:ldc1            #166 <String "AuthSignInClient">
	//   61  128:ldc1            #184 <String "Activity started with invalid configuration.">
	//   62  130:invokestatic    #171 <Method int Log.e(String, String)>
	//   63  133:pop             
			setResult(0);
	//   64  134:aload_0         
	//   65  135:iconst_0        
	//   66  136:invokevirtual   #73  <Method void setResult(int)>
			finish();
	//   67  139:aload_0         
	//   68  140:invokevirtual   #64  <Method void finish()>
			return;
	//   69  143:return          
		}
		boolean flag;
		if(bundle == null)
	//*  70  144:aload_1         
	//*  71  145:ifnonnull       153
			flag = true;
	//   72  148:iconst_1        
	//   73  149:istore_2        
		else
	//*  74  150:goto            155
			flag = false;
	//   75  153:iconst_0        
	//   76  154:istore_2        
		if(flag)
	//*  77  155:iload_2         
	//*  78  156:ifeq            258
		{
			if(a)
	//*  79  159:getstatic       #43  <Field boolean a>
	//*  80  162:ifeq            178
			{
				setResult(0);
	//   81  165:aload_0         
	//   82  166:iconst_0        
	//   83  167:invokevirtual   #73  <Method void setResult(int)>
				a(12502);
	//   84  170:aload_0         
	//   85  171:sipush          12502
	//   86  174:invokespecial   #122 <Method void a(int)>
				return;
	//   87  177:return          
			}
			a = true;
	//   88  178:iconst_1        
	//   89  179:putstatic       #43  <Field boolean a>
			bundle = ((Bundle) (new Intent(s)));
	//   90  182:new             #50  <Class Intent>
	//   91  185:dup             
	//   92  186:aload_3         
	//   93  187:invokespecial   #185 <Method void Intent(String)>
	//   94  190:astore_1        
			if(s.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN"))
	//*  95  191:aload_3         
	//*  96  192:ldc1            #146 <String "com.google.android.gms.auth.GOOGLE_SIGN_IN">
	//*  97  194:invokevirtual   #144 <Method boolean String.equals(Object)>
	//*  98  197:ifeq            210
				((Intent) (bundle)).setPackage("com.google.android.gms");
	//   99  200:aload_1         
	//  100  201:ldc1            #187 <String "com.google.android.gms">
	//  101  203:invokevirtual   #191 <Method Intent Intent.setPackage(String)>
	//  102  206:pop             
			else
	//* 103  207:goto            219
				((Intent) (bundle)).setPackage(getPackageName());
	//  104  210:aload_1         
	//  105  211:aload_0         
	//  106  212:invokevirtual   #194 <Method String getPackageName()>
	//  107  215:invokevirtual   #191 <Method Intent Intent.setPackage(String)>
	//  108  218:pop             
			((Intent) (bundle)).putExtra("config", ((android.os.Parcelable) (c)));
	//  109  219:aload_1         
	//  110  220:ldc1            #173 <String "config">
	//  111  222:aload_0         
	//  112  223:getfield        #92  <Field SignInConfiguration c>
	//  113  226:invokevirtual   #57  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//  114  229:pop             
			try
			{
				startActivityForResult(((Intent) (bundle)), 40962);
	//  115  230:aload_0         
	//  116  231:aload_1         
	//  117  232:ldc1            #74  <Int 40962>
	//  118  234:invokevirtual   #198 <Method void startActivityForResult(Intent, int)>
				return;
	//  119  237:return          
			}
	//* 120  238:aload_0         
	//* 121  239:iconst_1        
	//* 122  240:putfield        #24  <Field boolean b>
	//* 123  243:ldc1            #166 <String "AuthSignInClient">
	//* 124  245:ldc1            #200 <String "Could not launch sign in Intent. Google Play Service is probably being updated...">
	//* 125  247:invokestatic    #203 <Method int Log.w(String, String)>
	//* 126  250:pop             
	//* 127  251:aload_0         
	//* 128  252:bipush          17
	//* 129  254:invokespecial   #122 <Method void a(int)>
	//* 130  257:return          
	//* 131  258:aload_0         
	//* 132  259:aload_1         
	//* 133  260:ldc1            #205 <String "signingInGoogleApiClients">
	//* 134  262:invokevirtual   #208 <Method boolean Bundle.getBoolean(String)>
	//* 135  265:putfield        #108 <Field boolean d>
	//* 136  268:aload_0         
	//* 137  269:getfield        #108 <Field boolean d>
	//* 138  272:ifeq            302
	//* 139  275:aload_0         
	//* 140  276:aload_1         
	//* 141  277:ldc1            #210 <String "signInResultCode">
	//* 142  279:invokevirtual   #214 <Method int Bundle.getInt(String)>
	//* 143  282:putfield        #27  <Field int e>
	//* 144  285:aload_0         
	//* 145  286:aload_1         
	//* 146  287:ldc1            #216 <String "signInResultData">
	//* 147  289:invokevirtual   #182 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//* 148  292:checkcast       #50  <Class Intent>
	//* 149  295:putfield        #67  <Field Intent f>
	//* 150  298:aload_0         
	//* 151  299:invokespecial   #110 <Method void a()>
	//* 152  302:return          
			// Misplaced declaration of an exception variable
			catch(Bundle bundle)
			{
				b = true;
			}
			Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
			a(17);
			return;
		}
		d = bundle.getBoolean("signingInGoogleApiClients");
		if(d)
		{
			e = bundle.getInt("signInResultCode");
			f = (Intent)bundle.getParcelable("signInResultData");
			a();
		}
	//* 153  303:astore_1        
	//* 154  304:goto            238
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #219 <Method void x.onSaveInstanceState(Bundle)>
		bundle.putBoolean("signingInGoogleApiClients", d);
	//    3    5:aload_1         
	//    4    6:ldc1            #205 <String "signingInGoogleApiClients">
	//    5    8:aload_0         
	//    6    9:getfield        #108 <Field boolean d>
	//    7   12:invokevirtual   #223 <Method void Bundle.putBoolean(String, boolean)>
		if(d)
	//*   8   15:aload_0         
	//*   9   16:getfield        #108 <Field boolean d>
	//*  10   19:ifeq            42
		{
			bundle.putInt("signInResultCode", e);
	//   11   22:aload_1         
	//   12   23:ldc1            #210 <String "signInResultCode">
	//   13   25:aload_0         
	//   14   26:getfield        #27  <Field int e>
	//   15   29:invokevirtual   #227 <Method void Bundle.putInt(String, int)>
			bundle.putParcelable("signInResultData", ((android.os.Parcelable) (f)));
	//   16   32:aload_1         
	//   17   33:ldc1            #216 <String "signInResultData">
	//   18   35:aload_0         
	//   19   36:getfield        #67  <Field Intent f>
	//   20   39:invokevirtual   #231 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		}
	//   21   42:return          
	}

	private static boolean a = false;
	private boolean b;
	private SignInConfiguration c;
	private boolean d;
	private int e;
	private Intent f;

	static 
	{
	//    0    0:return          
	}
}
