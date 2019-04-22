// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.*;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

public class GoogleApiActivity extends Activity
	implements android.content.DialogInterface.OnCancelListener, TraceFieldInterface
{

	public GoogleApiActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Activity()>
		zzct = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field int zzct>
	//    5    9:return          
	}

	public static PendingIntent zza(Context context, PendingIntent pendingintent, int i)
	{
		return PendingIntent.getActivity(context, 0, zza(context, pendingintent, i, true), 0x8000000);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:iload_2         
	//    5    5:iconst_1        
	//    6    6:invokestatic    #26  <Method Intent zza(Context, PendingIntent, int, boolean)>
	//    7    9:ldc1            #27  <Int 0x8000000>
	//    8   11:invokestatic    #33  <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//    9   14:areturn         
	}

	public static Intent zza(Context context, PendingIntent pendingintent, int i, boolean flag)
	{
		context = ((Context) (new Intent(context, com/google/android/gms/common/api/GoogleApiActivity)));
	//    0    0:new             #35  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class GoogleApiActivity>
	//    4    7:invokespecial   #38  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).putExtra("pending_intent", ((android.os.Parcelable) (pendingintent)));
	//    6   11:aload_0         
	//    7   12:ldc1            #40  <String "pending_intent">
	//    8   14:aload_1         
	//    9   15:invokevirtual   #44  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   10   18:pop             
		((Intent) (context)).putExtra("failing_client_id", i);
	//   11   19:aload_0         
	//   12   20:ldc1            #46  <String "failing_client_id">
	//   13   22:iload_2         
	//   14   23:invokevirtual   #49  <Method Intent Intent.putExtra(String, int)>
	//   15   26:pop             
		((Intent) (context)).putExtra("notify_manager", flag);
	//   16   27:aload_0         
	//   17   28:ldc1            #51  <String "notify_manager">
	//   18   30:iload_3         
	//   19   31:invokevirtual   #54  <Method Intent Intent.putExtra(String, boolean)>
	//   20   34:pop             
		return ((Intent) (context));
	//   21   35:aload_0         
	//   22   36:areturn         
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		super.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #58  <Method void Activity.onActivityResult(int, int, Intent)>
		if(i == 1)
	//*   5    7:iload_1         
	//*   6    8:iconst_1        
	//*   7    9:icmpne          105
		{
			boolean flag = getIntent().getBooleanExtra("notify_manager", true);
	//    8   12:aload_0         
	//    9   13:invokevirtual   #62  <Method Intent getIntent()>
	//   10   16:ldc1            #51  <String "notify_manager">
	//   11   18:iconst_1        
	//   12   19:invokevirtual   #66  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   13   22:istore          4
			zzct = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #20  <Field int zzct>
			setResult(j, intent);
	//   17   29:aload_0         
	//   18   30:iload_2         
	//   19   31:aload_3         
	//   20   32:invokevirtual   #70  <Method void setResult(int, Intent)>
			if(flag)
	//*  21   35:iload           4
	//*  22   37:ifeq            121
			{
				intent = ((Intent) (GoogleApiManager.zzb(((Context) (this)))));
	//   23   40:aload_0         
	//   24   41:invokestatic    #76  <Method GoogleApiManager GoogleApiManager.zzb(Context)>
	//   25   44:astore_3        
				switch(j)
	//*  26   45:iload_2         
				{
	//*  27   46:tableswitch     -1 0: default 68
	//	               -1 98
	//	               0 71
	//*  28   68:goto            121
				case 0: // '\0'
					((GoogleApiManager) (intent)).zza(new ConnectionResult(13, ((PendingIntent) (null))), getIntent().getIntExtra("failing_client_id", -1));
	//   29   71:aload_3         
	//   30   72:new             #78  <Class ConnectionResult>
	//   31   75:dup             
	//   32   76:bipush          13
	//   33   78:aconst_null     
	//   34   79:invokespecial   #81  <Method void ConnectionResult(int, PendingIntent)>
	//   35   82:aload_0         
	//   36   83:invokevirtual   #62  <Method Intent getIntent()>
	//   37   86:ldc1            #46  <String "failing_client_id">
	//   38   88:iconst_m1       
	//   39   89:invokevirtual   #85  <Method int Intent.getIntExtra(String, int)>
	//   40   92:invokevirtual   #88  <Method void GoogleApiManager.zza(ConnectionResult, int)>
					break;

	//*  41   95:goto            121
				case -1: 
					((GoogleApiManager) (intent)).zzr();
	//   42   98:aload_3         
	//   43   99:invokevirtual   #91  <Method void GoogleApiManager.zzr()>
					break;
				}
			}
		} else
	//*  44  102:goto            121
		if(i == 2)
	//*  45  105:iload_1         
	//*  46  106:iconst_2        
	//*  47  107:icmpne          121
		{
			zzct = 0;
	//   48  110:aload_0         
	//   49  111:iconst_0        
	//   50  112:putfield        #20  <Field int zzct>
			setResult(j, intent);
	//   51  115:aload_0         
	//   52  116:iload_2         
	//   53  117:aload_3         
	//   54  118:invokevirtual   #70  <Method void setResult(int, Intent)>
		}
		finish();
	//   55  121:aload_0         
	//   56  122:invokevirtual   #94  <Method void finish()>
	//   57  125:return          
	}

	public void onCancel(DialogInterface dialoginterface)
	{
		zzct = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #20  <Field int zzct>
		setResult(0);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #99  <Method void setResult(int)>
		finish();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #94  <Method void finish()>
	//    8   14:return          
	}

	protected void onCreate(Bundle bundle)
	{
		TraceMachine.startTracing("GoogleApiActivity");
	//    0    0:ldc1            #107 <String "GoogleApiActivity">
	//    1    2:invokestatic    #113 <Method void TraceMachine.startTracing(String)>
		TraceMachine.enterMethod(_nr_trace, "GoogleApiActivity#onCreate", ((java.util.ArrayList) (null)));
	//    2    5:aload_0         
	//    3    6:getfield        #115 <Field Trace _nr_trace>
	//    4    9:ldc1            #117 <String "GoogleApiActivity#onCreate">
	//    5   11:aconst_null     
	//    6   12:invokestatic    #121 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   7   15:goto            25
_L5:
		TraceMachine.enterMethod(((Trace) (null)), "GoogleApiActivity#onCreate", ((java.util.ArrayList) (null)));
	//    8   18:aconst_null     
	//    9   19:ldc1            #117 <String "GoogleApiActivity#onCreate">
	//   10   21:aconst_null     
	//   11   22:invokestatic    #121 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		Object obj;
		super.onCreate(bundle);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokespecial   #123 <Method void Activity.onCreate(Bundle)>
		if(bundle != null)
	//*  15   30:aload_1         
	//*  16   31:ifnull          44
			zzct = bundle.getInt("resolution");
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:ldc1            #125 <String "resolution">
	//   20   38:invokevirtual   #131 <Method int Bundle.getInt(String)>
	//   21   41:putfield        #20  <Field int zzct>
		if(zzct == 1)
			break MISSING_BLOCK_LABEL_174;
	//   22   44:aload_0         
	//   23   45:getfield        #20  <Field int zzct>
	//   24   48:iconst_1        
	//   25   49:icmpeq          174
		obj = ((Object) (getIntent().getExtras()));
	//   26   52:aload_0         
	//   27   53:invokevirtual   #62  <Method Intent getIntent()>
	//   28   56:invokevirtual   #135 <Method Bundle Intent.getExtras()>
	//   29   59:astore_2        
		if(obj == null)
	//*  30   60:aload_2         
	//*  31   61:ifnonnull       82
		{
			bundle = "Activity started without extras";
	//   32   64:ldc1            #137 <String "Activity started without extras">
	//   33   66:astore_1        
		} else
	//*  34   67:ldc1            #107 <String "GoogleApiActivity">
	//*  35   69:aload_1         
	//*  36   70:invokestatic    #143 <Method int Log.e(String, String)>
	//*  37   73:pop             
	//*  38   74:aload_0         
	//*  39   75:invokevirtual   #94  <Method void finish()>
	//*  40   78:invokestatic    #146 <Method void TraceMachine.exitMethod()>
	//*  41   81:return          
		{
label0:
			{
				bundle = ((Bundle) ((PendingIntent)((Bundle) (obj)).get("pending_intent")));
	//   42   82:aload_2         
	//   43   83:ldc1            #40  <String "pending_intent">
	//   44   85:invokevirtual   #150 <Method Object Bundle.get(String)>
	//   45   88:checkcast       #29  <Class PendingIntent>
	//   46   91:astore_1        
				obj = ((Object) ((Integer)((Bundle) (obj)).get("error_code")));
	//   47   92:aload_2         
	//   48   93:ldc1            #152 <String "error_code">
	//   49   95:invokevirtual   #150 <Method Object Bundle.get(String)>
	//   50   98:checkcast       #154 <Class Integer>
	//   51  101:astore_2        
				if(bundle != null || obj != null)
					break label0;
	//   52  102:aload_1         
	//   53  103:ifnonnull       116
	//   54  106:aload_2         
	//   55  107:ifnonnull       116
				bundle = "Activity started without resolution";
	//   56  110:ldc1            #156 <String "Activity started without resolution">
	//   57  112:astore_1        
			}
		}
		Log.e("GoogleApiActivity", ((String) (bundle)));
_L3:
		finish();
		TraceMachine.exitMethod();
		return;
	//*  58  113:goto            67
		if(bundle == null)
			break MISSING_BLOCK_LABEL_155;
	//   59  116:aload_1         
	//   60  117:ifnull          155
		startIntentSenderForResult(((PendingIntent) (bundle)).getIntentSender(), 1, ((Intent) (null)), 0, 0, 0);
	//   61  120:aload_0         
	//   62  121:aload_1         
	//   63  122:invokevirtual   #160 <Method android.content.IntentSender PendingIntent.getIntentSender()>
	//   64  125:iconst_1        
	//   65  126:aconst_null     
	//   66  127:iconst_0        
	//   67  128:iconst_0        
	//   68  129:iconst_0        
	//   69  130:invokevirtual   #164 <Method void startIntentSenderForResult(android.content.IntentSender, int, Intent, int, int, int)>
		zzct = 1;
	//   70  133:aload_0         
	//   71  134:iconst_1        
	//   72  135:putfield        #20  <Field int zzct>
		TraceMachine.exitMethod();
	//   73  138:invokestatic    #146 <Method void TraceMachine.exitMethod()>
		return;
	//   74  141:return          
		bundle;
	//   75  142:astore_1        
		Log.e("GoogleApiActivity", "Failed to launch pendingIntent", ((Throwable) (bundle)));
	//   76  143:ldc1            #107 <String "GoogleApiActivity">
	//   77  145:ldc1            #166 <String "Failed to launch pendingIntent">
	//   78  147:aload_1         
	//   79  148:invokestatic    #169 <Method int Log.e(String, String, Throwable)>
	//   80  151:pop             
		if(true) goto _L3; else goto _L2
	//   81  152:goto            74
_L2:
		GoogleApiAvailability.getInstance().showErrorDialogFragment(((Activity) (this)), ((Integer) (obj)).intValue(), 2, ((android.content.DialogInterface.OnCancelListener) (this)));
	//   82  155:invokestatic    #175 <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//   83  158:aload_0         
	//   84  159:aload_2         
	//   85  160:invokevirtual   #179 <Method int Integer.intValue()>
	//   86  163:iconst_2        
	//   87  164:aload_0         
	//   88  165:invokevirtual   #183 <Method boolean GoogleApiAvailability.showErrorDialogFragment(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
	//   89  168:pop             
		zzct = 1;
	//   90  169:aload_0         
	//   91  170:iconst_1        
	//   92  171:putfield        #20  <Field int zzct>
		TraceMachine.exitMethod();
	//   93  174:invokestatic    #146 <Method void TraceMachine.exitMethod()>
		return;
	//   94  177:return          
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   95  178:astore_2        
		if(true) goto _L5; else goto _L4
_L4:
	//*  96  179:goto            18
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		bundle.putInt("resolution", zzct);
	//    0    0:aload_1         
	//    1    1:ldc1            #125 <String "resolution">
	//    2    3:aload_0         
	//    3    4:getfield        #20  <Field int zzct>
	//    4    7:invokevirtual   #188 <Method void Bundle.putInt(String, int)>
		super.onSaveInstanceState(bundle);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokespecial   #190 <Method void Activity.onSaveInstanceState(Bundle)>
	//    8   15:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #193 <Method void Activity.onStart()>
		ApplicationStateMonitor.getInstance().activityStarted();
	//    2    4:invokestatic    #198 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #201 <Method void ApplicationStateMonitor.activityStarted()>
	//    4   10:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #204 <Method void Activity.onStop()>
		ApplicationStateMonitor.getInstance().activityStopped();
	//    2    4:invokestatic    #198 <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    3    7:invokevirtual   #207 <Method void ApplicationStateMonitor.activityStopped()>
	//    4   10:return          
	}

	public Trace _nr_trace;
	private int zzct;
}
