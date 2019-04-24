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

public class GoogleApiActivity extends Activity
	implements android.content.DialogInterface.OnCancelListener
{

	public GoogleApiActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Activity()>
		zzct = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #15  <Field int zzct>
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
	//    6    6:invokestatic    #21  <Method Intent zza(Context, PendingIntent, int, boolean)>
	//    7    9:ldc1            #22  <Int 0x8000000>
	//    8   11:invokestatic    #28  <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//    9   14:areturn         
	}

	public static Intent zza(Context context, PendingIntent pendingintent, int i, boolean flag)
	{
		context = ((Context) (new Intent(context, com/google/android/gms/common/api/GoogleApiActivity)));
	//    0    0:new             #30  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class GoogleApiActivity>
	//    4    7:invokespecial   #33  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).putExtra("pending_intent", ((android.os.Parcelable) (pendingintent)));
	//    6   11:aload_0         
	//    7   12:ldc1            #35  <String "pending_intent">
	//    8   14:aload_1         
	//    9   15:invokevirtual   #39  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   10   18:pop             
		((Intent) (context)).putExtra("failing_client_id", i);
	//   11   19:aload_0         
	//   12   20:ldc1            #41  <String "failing_client_id">
	//   13   22:iload_2         
	//   14   23:invokevirtual   #44  <Method Intent Intent.putExtra(String, int)>
	//   15   26:pop             
		((Intent) (context)).putExtra("notify_manager", flag);
	//   16   27:aload_0         
	//   17   28:ldc1            #46  <String "notify_manager">
	//   18   30:iload_3         
	//   19   31:invokevirtual   #49  <Method Intent Intent.putExtra(String, boolean)>
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
	//    4    4:invokespecial   #53  <Method void Activity.onActivityResult(int, int, Intent)>
		if(i == 1)
	//*   5    7:iload_1         
	//*   6    8:iconst_1        
	//*   7    9:icmpne          105
		{
			boolean flag = getIntent().getBooleanExtra("notify_manager", true);
	//    8   12:aload_0         
	//    9   13:invokevirtual   #57  <Method Intent getIntent()>
	//   10   16:ldc1            #46  <String "notify_manager">
	//   11   18:iconst_1        
	//   12   19:invokevirtual   #61  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   13   22:istore          4
			zzct = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #15  <Field int zzct>
			setResult(j, intent);
	//   17   29:aload_0         
	//   18   30:iload_2         
	//   19   31:aload_3         
	//   20   32:invokevirtual   #65  <Method void setResult(int, Intent)>
			if(flag)
	//*  21   35:iload           4
	//*  22   37:ifeq            121
			{
				intent = ((Intent) (GoogleApiManager.zzb(((Context) (this)))));
	//   23   40:aload_0         
	//   24   41:invokestatic    #71  <Method GoogleApiManager GoogleApiManager.zzb(Context)>
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
	//   30   72:new             #73  <Class ConnectionResult>
	//   31   75:dup             
	//   32   76:bipush          13
	//   33   78:aconst_null     
	//   34   79:invokespecial   #76  <Method void ConnectionResult(int, PendingIntent)>
	//   35   82:aload_0         
	//   36   83:invokevirtual   #57  <Method Intent getIntent()>
	//   37   86:ldc1            #41  <String "failing_client_id">
	//   38   88:iconst_m1       
	//   39   89:invokevirtual   #80  <Method int Intent.getIntExtra(String, int)>
	//   40   92:invokevirtual   #83  <Method void GoogleApiManager.zza(ConnectionResult, int)>
					break;

	//*  41   95:goto            121
				case -1: 
					((GoogleApiManager) (intent)).zzr();
	//   42   98:aload_3         
	//   43   99:invokevirtual   #86  <Method void GoogleApiManager.zzr()>
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
	//   50  112:putfield        #15  <Field int zzct>
			setResult(j, intent);
	//   51  115:aload_0         
	//   52  116:iload_2         
	//   53  117:aload_3         
	//   54  118:invokevirtual   #65  <Method void setResult(int, Intent)>
		}
		finish();
	//   55  121:aload_0         
	//   56  122:invokevirtual   #89  <Method void finish()>
	//   57  125:return          
	}

	public void onCancel(DialogInterface dialoginterface)
	{
		zzct = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #15  <Field int zzct>
		setResult(0);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #94  <Method void setResult(int)>
		finish();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #89  <Method void finish()>
	//    8   14:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #100 <Method void Activity.onCreate(Bundle)>
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
			zzct = bundle.getInt("resolution");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #102 <String "resolution">
	//    8   13:invokevirtual   #108 <Method int Bundle.getInt(String)>
	//    9   16:putfield        #15  <Field int zzct>
		if(zzct == 1) goto _L2; else goto _L1
	//   10   19:aload_0         
	//   11   20:getfield        #15  <Field int zzct>
	//   12   23:iconst_1        
	//   13   24:icmpeq          143
_L1:
		Object obj = ((Object) (getIntent().getExtras()));
	//   14   27:aload_0         
	//   15   28:invokevirtual   #57  <Method Intent getIntent()>
	//   16   31:invokevirtual   #112 <Method Bundle Intent.getExtras()>
	//   17   34:astore_2        
		if(obj != null) goto _L4; else goto _L3
	//   18   35:aload_2         
	//   19   36:ifnonnull       54
_L3:
		bundle = "Activity started without extras";
	//   20   39:ldc1            #114 <String "Activity started without extras">
	//   21   41:astore_1        
_L8:
		Log.e("GoogleApiActivity", ((String) (bundle)));
	//   22   42:ldc1            #116 <String "GoogleApiActivity">
	//   23   44:aload_1         
	//   24   45:invokestatic    #122 <Method int Log.e(String, String)>
	//   25   48:pop             
_L6:
		finish();
	//   26   49:aload_0         
	//   27   50:invokevirtual   #89  <Method void finish()>
		return;
	//   28   53:return          
_L4:
		bundle = ((Bundle) ((PendingIntent)((Bundle) (obj)).get("pending_intent")));
	//   29   54:aload_2         
	//   30   55:ldc1            #35  <String "pending_intent">
	//   31   57:invokevirtual   #126 <Method Object Bundle.get(String)>
	//   32   60:checkcast       #24  <Class PendingIntent>
	//   33   63:astore_1        
		obj = ((Object) ((Integer)((Bundle) (obj)).get("error_code")));
	//   34   64:aload_2         
	//   35   65:ldc1            #128 <String "error_code">
	//   36   67:invokevirtual   #126 <Method Object Bundle.get(String)>
	//   37   70:checkcast       #130 <Class Integer>
	//   38   73:astore_2        
		if(bundle == null && obj == null)
	//*  39   74:aload_1         
	//*  40   75:ifnonnull       88
	//*  41   78:aload_2         
	//*  42   79:ifnonnull       88
		{
			bundle = "Activity started without resolution";
	//   43   82:ldc1            #132 <String "Activity started without resolution">
	//   44   84:astore_1        
			continue; /* Loop/switch isn't completed */
	//   45   85:goto            42
		}
		if(bundle == null)
			break; /* Loop/switch isn't completed */
	//   46   88:aload_1         
	//   47   89:ifnull          124
		try
		{
			startIntentSenderForResult(((PendingIntent) (bundle)).getIntentSender(), 1, ((Intent) (null)), 0, 0, 0);
	//   48   92:aload_0         
	//   49   93:aload_1         
	//   50   94:invokevirtual   #136 <Method android.content.IntentSender PendingIntent.getIntentSender()>
	//   51   97:iconst_1        
	//   52   98:aconst_null     
	//   53   99:iconst_0        
	//   54  100:iconst_0        
	//   55  101:iconst_0        
	//   56  102:invokevirtual   #140 <Method void startIntentSenderForResult(android.content.IntentSender, int, Intent, int, int, int)>
			zzct = 1;
	//   57  105:aload_0         
	//   58  106:iconst_1        
	//   59  107:putfield        #15  <Field int zzct>
			return;
	//   60  110:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  61  111:astore_1        
		{
			Log.e("GoogleApiActivity", "Failed to launch pendingIntent", ((Throwable) (bundle)));
	//   62  112:ldc1            #116 <String "GoogleApiActivity">
	//   63  114:ldc1            #142 <String "Failed to launch pendingIntent">
	//   64  116:aload_1         
	//   65  117:invokestatic    #145 <Method int Log.e(String, String, Throwable)>
	//   66  120:pop             
		}
		if(true) goto _L6; else goto _L5
	//   67  121:goto            49
_L5:
		GoogleApiAvailability.getInstance().showErrorDialogFragment(((Activity) (this)), ((Integer) (obj)).intValue(), 2, ((android.content.DialogInterface.OnCancelListener) (this)));
	//   68  124:invokestatic    #151 <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//   69  127:aload_0         
	//   70  128:aload_2         
	//   71  129:invokevirtual   #155 <Method int Integer.intValue()>
	//   72  132:iconst_2        
	//   73  133:aload_0         
	//   74  134:invokevirtual   #159 <Method boolean GoogleApiAvailability.showErrorDialogFragment(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
	//   75  137:pop             
		zzct = 1;
	//   76  138:aload_0         
	//   77  139:iconst_1        
	//   78  140:putfield        #15  <Field int zzct>
_L2:
		return;
	//   79  143:return          
		if(true) goto _L8; else goto _L7
_L7:
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		bundle.putInt("resolution", zzct);
	//    0    0:aload_1         
	//    1    1:ldc1            #102 <String "resolution">
	//    2    3:aload_0         
	//    3    4:getfield        #15  <Field int zzct>
	//    4    7:invokevirtual   #164 <Method void Bundle.putInt(String, int)>
		super.onSaveInstanceState(bundle);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokespecial   #166 <Method void Activity.onSaveInstanceState(Bundle)>
	//    8   15:return          
	}

	private int zzct;
}
