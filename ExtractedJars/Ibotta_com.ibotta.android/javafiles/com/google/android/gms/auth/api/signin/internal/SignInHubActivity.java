// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//			zzq, SignInConfiguration, zzf, zzz

public class SignInHubActivity extends FragmentActivity
	implements TraceFieldInterface
{
	private final class zzd
		implements android.support.v4.app.LoaderManager.LoaderCallbacks
	{

		public final Loader onCreateLoader(int i, Bundle bundle)
		{
			return ((Loader) (new zzf(((android.content.Context) (zzfm)), GoogleApiClient.getAllClients())));
		//    0    0:new             #27  <Class zzf>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #16  <Field SignInHubActivity zzfm>
		//    4    8:invokestatic    #33  <Method java.util.Set GoogleApiClient.getAllClients()>
		//    5   11:invokespecial   #36  <Method void zzf(android.content.Context, java.util.Set)>
		//    6   14:areturn         
		}

		public final void onLoadFinished(Loader loader, Object obj)
		{
			loader = ((Loader) (zzfm));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SignInHubActivity zzfm>
		//    2    4:astore_1        
			((SignInHubActivity) (loader)).setResult(SignInHubActivity.zzd(((SignInHubActivity) (loader))), SignInHubActivity.zze(zzfm));
		//    3    5:aload_1         
		//    4    6:aload_1         
		//    5    7:invokestatic    #43  <Method int SignInHubActivity.zzd(SignInHubActivity)>
		//    6   10:aload_0         
		//    7   11:getfield        #16  <Field SignInHubActivity zzfm>
		//    8   14:invokestatic    #47  <Method Intent SignInHubActivity.zze(SignInHubActivity)>
		//    9   17:invokevirtual   #51  <Method void SignInHubActivity.setResult(int, Intent)>
			zzfm.finish();
		//   10   20:aload_0         
		//   11   21:getfield        #16  <Field SignInHubActivity zzfm>
		//   12   24:invokevirtual   #54  <Method void SignInHubActivity.finish()>
		//   13   27:return          
		}

		public final void onLoaderReset(Loader loader)
		{
		//    0    0:return          
		}

		private final SignInHubActivity zzfm;

		private zzd()
		{
			zzfm = SignInHubActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field SignInHubActivity zzfm>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
		//    5    9:return          
		}

		zzd(zzz zzz)
		{
			this();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #23  <Method void SignInHubActivity$zzd(SignInHubActivity)>
		//    3    5:return          
		}
	}


	public SignInHubActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void FragmentActivity()>
		zzfh = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #32  <Field boolean zzfh>
	//    5    9:return          
	}

	static int zzd(SignInHubActivity signinhubactivity)
	{
		return signinhubactivity.zzfk;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int zzfk>
	//    2    4:ireturn         
	}

	private final void zzd(int i)
	{
		Status status = new Status(i);
	//    0    0:new             #38  <Class Status>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:invokespecial   #40  <Method void Status(int)>
	//    4    8:astore_2        
		Intent intent = new Intent();
	//    5    9:new             #42  <Class Intent>
	//    6   12:dup             
	//    7   13:invokespecial   #43  <Method void Intent()>
	//    8   16:astore_3        
		intent.putExtra("googleSignInStatus", ((android.os.Parcelable) (status)));
	//    9   17:aload_3         
	//   10   18:ldc1            #45  <String "googleSignInStatus">
	//   11   20:aload_2         
	//   12   21:invokevirtual   #49  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   13   24:pop             
		setResult(0, intent);
	//   14   25:aload_0         
	//   15   26:iconst_0        
	//   16   27:aload_3         
	//   17   28:invokevirtual   #53  <Method void setResult(int, Intent)>
		finish();
	//   18   31:aload_0         
	//   19   32:invokevirtual   #56  <Method void finish()>
		zzfg = false;
	//   20   35:iconst_0        
	//   21   36:putstatic       #58  <Field boolean zzfg>
	//   22   39:return          
	}

	static Intent zze(SignInHubActivity signinhubactivity)
	{
		return signinhubactivity.zzfl;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Intent zzfl>
	//    2    4:areturn         
	}

	private final void zzu()
	{
		getSupportLoaderManager().initLoader(0, ((Bundle) (null)), ((android.support.v4.app.LoaderManager.LoaderCallbacks) (new zzd(((zzz) (null))))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method LoaderManager getSupportLoaderManager()>
	//    2    4:iconst_0        
	//    3    5:aconst_null     
	//    4    6:new             #8   <Class SignInHubActivity$zzd>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #70  <Method void SignInHubActivity$zzd(SignInHubActivity, zzz)>
	//    9   15:invokevirtual   #76  <Method Loader LoaderManager.initLoader(int, Bundle, android.support.v4.app.LoaderManager$LoaderCallbacks)>
	//   10   18:pop             
		zzfg = false;
	//   11   19:iconst_0        
	//   12   20:putstatic       #58  <Field boolean zzfg>
	//   13   23:return          
	}

	public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		if(zzfh)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean zzfh>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		setResult(0);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #82  <Method void setResult(int)>
		if(i != 40962)
	//*   7   13:iload_1         
	//*   8   14:ldc1            #83  <Int 40962>
	//*   9   16:icmpeq          20
			return;
	//   10   19:return          
		if(intent != null)
	//*  11   20:aload_3         
	//*  12   21:ifnull          128
		{
			Object obj = ((Object) ((SignInAccount)intent.getParcelableExtra("signInAccount")));
	//   13   24:aload_3         
	//   14   25:ldc1            #85  <String "signInAccount">
	//   15   27:invokevirtual   #89  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   16   30:checkcast       #91  <Class SignInAccount>
	//   17   33:astore          4
			if(obj != null && ((SignInAccount) (obj)).getGoogleSignInAccount() != null)
	//*  18   35:aload           4
	//*  19   37:ifnull          106
	//*  20   40:aload           4
	//*  21   42:invokevirtual   #95  <Method com.google.android.gms.auth.api.signin.GoogleSignInAccount SignInAccount.getGoogleSignInAccount()>
	//*  22   45:ifnull          106
			{
				obj = ((Object) (((SignInAccount) (obj)).getGoogleSignInAccount()));
	//   23   48:aload           4
	//   24   50:invokevirtual   #95  <Method com.google.android.gms.auth.api.signin.GoogleSignInAccount SignInAccount.getGoogleSignInAccount()>
	//   25   53:astore          4
				zzq.zze(((android.content.Context) (this))).zzd(zzfi.zzt(), ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) (obj)));
	//   26   55:aload_0         
	//   27   56:invokestatic    #100 <Method zzq zzq.zze(android.content.Context)>
	//   28   59:aload_0         
	//   29   60:getfield        #102 <Field SignInConfiguration zzfi>
	//   30   63:invokevirtual   #108 <Method com.google.android.gms.auth.api.signin.GoogleSignInOptions SignInConfiguration.zzt()>
	//   31   66:aload           4
	//   32   68:invokevirtual   #111 <Method void zzq.zzd(com.google.android.gms.auth.api.signin.GoogleSignInOptions, com.google.android.gms.auth.api.signin.GoogleSignInAccount)>
				intent.removeExtra("signInAccount");
	//   33   71:aload_3         
	//   34   72:ldc1            #85  <String "signInAccount">
	//   35   74:invokevirtual   #115 <Method void Intent.removeExtra(String)>
				intent.putExtra("googleSignInAccount", ((android.os.Parcelable) (obj)));
	//   36   77:aload_3         
	//   37   78:ldc1            #117 <String "googleSignInAccount">
	//   38   80:aload           4
	//   39   82:invokevirtual   #49  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   40   85:pop             
				zzfj = true;
	//   41   86:aload_0         
	//   42   87:iconst_1        
	//   43   88:putfield        #119 <Field boolean zzfj>
				zzfk = j;
	//   44   91:aload_0         
	//   45   92:iload_2         
	//   46   93:putfield        #35  <Field int zzfk>
				zzfl = intent;
	//   47   96:aload_0         
	//   48   97:aload_3         
	//   49   98:putfield        #62  <Field Intent zzfl>
				zzu();
	//   50  101:aload_0         
	//   51  102:invokespecial   #121 <Method void zzu()>
				return;
	//   52  105:return          
			}
			if(intent.hasExtra("errorCode"))
	//*  53  106:aload_3         
	//*  54  107:ldc1            #123 <String "errorCode">
	//*  55  109:invokevirtual   #127 <Method boolean Intent.hasExtra(String)>
	//*  56  112:ifeq            128
			{
				zzd(intent.getIntExtra("errorCode", 8));
	//   57  115:aload_0         
	//   58  116:aload_3         
	//   59  117:ldc1            #123 <String "errorCode">
	//   60  119:bipush          8
	//   61  121:invokevirtual   #131 <Method int Intent.getIntExtra(String, int)>
	//   62  124:invokespecial   #133 <Method void zzd(int)>
				return;
	//   63  127:return          
			}
		}
		zzd(8);
	//   64  128:aload_0         
	//   65  129:bipush          8
	//   66  131:invokespecial   #133 <Method void zzd(int)>
	//   67  134:return          
	}

	protected void onCreate(Bundle bundle)
	{
		TraceMachine.startTracing("SignInHubActivity");
	//    0    0:ldc1            #141 <String "SignInHubActivity">
	//    1    2:invokestatic    #146 <Method void TraceMachine.startTracing(String)>
		TraceMachine.enterMethod(_nr_trace, "SignInHubActivity#onCreate", ((java.util.ArrayList) (null)));
	//    2    5:aload_0         
	//    3    6:getfield        #148 <Field Trace _nr_trace>
	//    4    9:ldc1            #150 <String "SignInHubActivity#onCreate">
	//    5   11:aconst_null     
	//    6   12:invokestatic    #154 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   7   15:goto            25
_L10:
		TraceMachine.enterMethod(((Trace) (null)), "SignInHubActivity#onCreate", ((java.util.ArrayList) (null)));
	//    8   18:aconst_null     
	//    9   19:ldc1            #150 <String "SignInHubActivity#onCreate">
	//   10   21:aconst_null     
	//   11   22:invokestatic    #154 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		Intent intent;
		String s;
		super.onCreate(bundle);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokespecial   #156 <Method void FragmentActivity.onCreate(Bundle)>
		intent = getIntent();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #160 <Method Intent getIntent()>
	//   17   34:astore_3        
		s = intent.getAction();
	//   18   35:aload_3         
	//   19   36:invokevirtual   #164 <Method String Intent.getAction()>
	//   20   39:astore          4
		if(!"com.google.android.gms.auth.NO_IMPL".equals(((Object) (s)))) goto _L3; else goto _L2
	//   21   41:ldc1            #166 <String "com.google.android.gms.auth.NO_IMPL">
	//   22   43:aload           4
	//   23   45:invokevirtual   #172 <Method boolean String.equals(Object)>
	//   24   48:ifeq            64
_L2:
		char c = '\u30D4';
	//   25   51:sipush          12500
	//   26   54:istore_2        
_L9:
		zzd(((int) (c)));
	//   27   55:aload_0         
	//   28   56:iload_2         
	//   29   57:invokespecial   #133 <Method void zzd(int)>
_L5:
		TraceMachine.exitMethod();
	//   30   60:invokestatic    #175 <Method void TraceMachine.exitMethod()>
		return;
	//   31   63:return          
_L3:
		if(s.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || s.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN"))
			break; /* Loop/switch isn't completed */
	//   32   64:aload           4
	//   33   66:ldc1            #177 <String "com.google.android.gms.auth.GOOGLE_SIGN_IN">
	//   34   68:invokevirtual   #172 <Method boolean String.equals(Object)>
	//   35   71:ifne            133
	//   36   74:aload           4
	//   37   76:ldc1            #179 <String "com.google.android.gms.auth.APPAUTH_SIGN_IN">
	//   38   78:invokevirtual   #172 <Method boolean String.equals(Object)>
	//   39   81:ifne            133
		bundle = ((Bundle) (String.valueOf(((Object) (intent.getAction())))));
	//   40   84:aload_3         
	//   41   85:invokevirtual   #164 <Method String Intent.getAction()>
	//   42   88:invokestatic    #183 <Method String String.valueOf(Object)>
	//   43   91:astore_1        
		if(((String) (bundle)).length() != 0)
	//*  44   92:aload_1         
	//*  45   93:invokevirtual   #187 <Method int String.length()>
	//*  46   96:ifeq            109
			bundle = ((Bundle) ("Unknown action: ".concat(((String) (bundle)))));
	//   47   99:ldc1            #189 <String "Unknown action: ">
	//   48  101:aload_1         
	//   49  102:invokevirtual   #193 <Method String String.concat(String)>
	//   50  105:astore_1        
		else
	//*  51  106:goto            119
			bundle = ((Bundle) (new String("Unknown action: ")));
	//   52  109:new             #168 <Class String>
	//   53  112:dup             
	//   54  113:ldc1            #189 <String "Unknown action: ">
	//   55  115:invokespecial   #195 <Method void String(String)>
	//   56  118:astore_1        
		Log.e("AuthSignInClient", ((String) (bundle)));
	//   57  119:ldc1            #197 <String "AuthSignInClient">
	//   58  121:aload_1         
	//   59  122:invokestatic    #203 <Method int Log.e(String, String)>
	//   60  125:pop             
_L6:
		finish();
	//   61  126:aload_0         
	//   62  127:invokevirtual   #56  <Method void finish()>
		if(true) goto _L5; else goto _L4
	//   63  130:goto            60
_L4:
label0:
		{
			zzfi = (SignInConfiguration)intent.getBundleExtra("config").getParcelable("config");
	//   64  133:aload_0         
	//   65  134:aload_3         
	//   66  135:ldc1            #205 <String "config">
	//   67  137:invokevirtual   #209 <Method Bundle Intent.getBundleExtra(String)>
	//   68  140:ldc1            #205 <String "config">
	//   69  142:invokevirtual   #214 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   70  145:checkcast       #104 <Class SignInConfiguration>
	//   71  148:putfield        #102 <Field SignInConfiguration zzfi>
			if(zzfi != null)
				break label0;
	//   72  151:aload_0         
	//   73  152:getfield        #102 <Field SignInConfiguration zzfi>
	//   74  155:ifnonnull       174
			Log.e("AuthSignInClient", "Activity started with invalid configuration.");
	//   75  158:ldc1            #197 <String "AuthSignInClient">
	//   76  160:ldc1            #216 <String "Activity started with invalid configuration.">
	//   77  162:invokestatic    #203 <Method int Log.e(String, String)>
	//   78  165:pop             
			setResult(0);
	//   79  166:aload_0         
	//   80  167:iconst_0        
	//   81  168:invokevirtual   #82  <Method void setResult(int)>
		}
		  goto _L6
		if(true) goto _L5; else goto _L7
	//*  82  171:goto            126
_L7:
		if(bundle == null)
	//*  83  174:aload_1         
	//*  84  175:ifnonnull       183
			c = '\001';
	//   85  178:iconst_1        
	//   86  179:istore_2        
		else
	//*  87  180:goto            185
			c = '\0';
	//   88  183:iconst_0        
	//   89  184:istore_2        
		if(c == 0)
			break; /* Loop/switch isn't completed */
	//   90  185:iload_2         
	//   91  186:ifeq            289
		if(zzfg)
	//*  92  189:getstatic       #58  <Field boolean zzfg>
	//*  93  192:ifeq            207
		{
			setResult(0);
	//   94  195:aload_0         
	//   95  196:iconst_0        
	//   96  197:invokevirtual   #82  <Method void setResult(int)>
			c = '\u30D6';
	//   97  200:sipush          12502
	//   98  203:istore_2        
			continue; /* Loop/switch isn't completed */
	//   99  204:goto            55
		}
		zzfg = true;
	//  100  207:iconst_1        
	//  101  208:putstatic       #58  <Field boolean zzfg>
		intent = new Intent(s);
	//  102  211:new             #42  <Class Intent>
	//  103  214:dup             
	//  104  215:aload           4
	//  105  217:invokespecial   #217 <Method void Intent(String)>
	//  106  220:astore_3        
		if(s.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN"))
	//* 107  221:aload           4
	//* 108  223:ldc1            #177 <String "com.google.android.gms.auth.GOOGLE_SIGN_IN">
	//* 109  225:invokevirtual   #172 <Method boolean String.equals(Object)>
	//* 110  228:ifeq            237
			bundle = "com.google.android.gms";
	//  111  231:ldc1            #219 <String "com.google.android.gms">
	//  112  233:astore_1        
		else
	//* 113  234:goto            242
			bundle = ((Bundle) (getPackageName()));
	//  114  237:aload_0         
	//  115  238:invokevirtual   #222 <Method String getPackageName()>
	//  116  241:astore_1        
		intent.setPackage(((String) (bundle)));
	//  117  242:aload_3         
	//  118  243:aload_1         
	//  119  244:invokevirtual   #226 <Method Intent Intent.setPackage(String)>
	//  120  247:pop             
		intent.putExtra("config", ((android.os.Parcelable) (zzfi)));
	//  121  248:aload_3         
	//  122  249:ldc1            #205 <String "config">
	//  123  251:aload_0         
	//  124  252:getfield        #102 <Field SignInConfiguration zzfi>
	//  125  255:invokevirtual   #49  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//  126  258:pop             
		startActivityForResult(intent, 40962);
	//  127  259:aload_0         
	//  128  260:aload_3         
	//  129  261:ldc1            #83  <Int 40962>
	//  130  263:invokevirtual   #230 <Method void startActivityForResult(Intent, int)>
		TraceMachine.exitMethod();
	//  131  266:invokestatic    #175 <Method void TraceMachine.exitMethod()>
		return;
	//  132  269:return          
_L11:
		zzfh = true;
	//  133  270:aload_0         
	//  134  271:iconst_1        
	//  135  272:putfield        #32  <Field boolean zzfh>
		Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
	//  136  275:ldc1            #197 <String "AuthSignInClient">
	//  137  277:ldc1            #232 <String "Could not launch sign in Intent. Google Play Service is probably being updated...">
	//  138  279:invokestatic    #235 <Method int Log.w(String, String)>
	//  139  282:pop             
		c = '\021';
	//  140  283:bipush          17
	//  141  285:istore_2        
		if(true) goto _L9; else goto _L8
	//  142  286:goto            55
_L8:
		zzfj = bundle.getBoolean("signingInGoogleApiClients");
	//  143  289:aload_0         
	//  144  290:aload_1         
	//  145  291:ldc1            #237 <String "signingInGoogleApiClients">
	//  146  293:invokevirtual   #240 <Method boolean Bundle.getBoolean(String)>
	//  147  296:putfield        #119 <Field boolean zzfj>
		if(zzfj)
	//* 148  299:aload_0         
	//* 149  300:getfield        #119 <Field boolean zzfj>
	//* 150  303:ifeq            333
		{
			zzfk = bundle.getInt("signInResultCode");
	//  151  306:aload_0         
	//  152  307:aload_1         
	//  153  308:ldc1            #242 <String "signInResultCode">
	//  154  310:invokevirtual   #246 <Method int Bundle.getInt(String)>
	//  155  313:putfield        #35  <Field int zzfk>
			zzfl = (Intent)bundle.getParcelable("signInResultData");
	//  156  316:aload_0         
	//  157  317:aload_1         
	//  158  318:ldc1            #248 <String "signInResultData">
	//  159  320:invokevirtual   #214 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//  160  323:checkcast       #42  <Class Intent>
	//  161  326:putfield        #62  <Field Intent zzfl>
			zzu();
	//  162  329:aload_0         
	//  163  330:invokespecial   #121 <Method void zzu()>
		}
		TraceMachine.exitMethod();
	//  164  333:invokestatic    #175 <Method void TraceMachine.exitMethod()>
		return;
	//  165  336:return          
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//  166  337:astore_3        
		  goto _L10
	//* 167  338:goto            18
		bundle;
	//  168  341:astore_1        
		  goto _L11
	//* 169  342:goto            270
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #251 <Method void FragmentActivity.onSaveInstanceState(Bundle)>
		bundle.putBoolean("signingInGoogleApiClients", zzfj);
	//    3    5:aload_1         
	//    4    6:ldc1            #237 <String "signingInGoogleApiClients">
	//    5    8:aload_0         
	//    6    9:getfield        #119 <Field boolean zzfj>
	//    7   12:invokevirtual   #255 <Method void Bundle.putBoolean(String, boolean)>
		if(zzfj)
	//*   8   15:aload_0         
	//*   9   16:getfield        #119 <Field boolean zzfj>
	//*  10   19:ifeq            42
		{
			bundle.putInt("signInResultCode", zzfk);
	//   11   22:aload_1         
	//   12   23:ldc1            #242 <String "signInResultCode">
	//   13   25:aload_0         
	//   14   26:getfield        #35  <Field int zzfk>
	//   15   29:invokevirtual   #259 <Method void Bundle.putInt(String, int)>
			bundle.putParcelable("signInResultData", ((android.os.Parcelable) (zzfl)));
	//   16   32:aload_1         
	//   17   33:ldc1            #248 <String "signInResultData">
	//   18   35:aload_0         
	//   19   36:getfield        #62  <Field Intent zzfl>
	//   20   39:invokevirtual   #263 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		}
	//   21   42:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #266 <Method void FragmentActivity.onStart()>
		ApplicationStateMonitor.getInstance().activityStarted();
	//    2    4:invokestatic    #272 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #275 <Method void ApplicationStateMonitor.activityStarted()>
	//    4   10:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #278 <Method void FragmentActivity.onStop()>
		ApplicationStateMonitor.getInstance().activityStopped();
	//    2    4:invokestatic    #272 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #281 <Method void ApplicationStateMonitor.activityStopped()>
	//    4   10:return          
	}

	private static boolean zzfg = false;
	public Trace _nr_trace;
	private boolean zzfh;
	private SignInConfiguration zzfi;
	private boolean zzfj;
	private int zzfk;
	private Intent zzfl;

	static 
	{
	//    0    0:return          
	}
}
