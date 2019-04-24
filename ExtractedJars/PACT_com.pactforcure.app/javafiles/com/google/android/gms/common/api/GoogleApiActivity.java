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
import com.google.android.gms.internal.zzaap;

public class GoogleApiActivity extends Activity
	implements android.content.DialogInterface.OnCancelListener
{

	public GoogleApiActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Activity()>
		zzaxL = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #14  <Field int zzaxL>
	//    5    9:return          
	}

	public static PendingIntent zza(Context context, PendingIntent pendingintent, int i)
	{
		return zza(context, pendingintent, i, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:invokestatic    #20  <Method PendingIntent zza(Context, PendingIntent, int, boolean)>
	//    5    7:areturn         
	}

	public static PendingIntent zza(Context context, PendingIntent pendingintent, int i, boolean flag)
	{
		return PendingIntent.getActivity(context, 0, zzb(context, pendingintent, i, flag), 0x8000000);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:iload_2         
	//    5    5:iload_3         
	//    6    6:invokestatic    #24  <Method Intent zzb(Context, PendingIntent, int, boolean)>
	//    7    9:ldc1            #25  <Int 0x8000000>
	//    8   11:invokestatic    #31  <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//    9   14:areturn         
	}

	private void zza(int i, zzaap zzaap1)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     -1 0: default 24
	//	               -1 50
	//	               0 25
		default:
			return;
	//    2   24:return          

		case 0: // '\0'
			zzaap1.zza(new ConnectionResult(13, ((PendingIntent) (null))), getIntent().getIntExtra("failing_client_id", -1));
	//    3   25:aload_2         
	//    4   26:new             #34  <Class ConnectionResult>
	//    5   29:dup             
	//    6   30:bipush          13
	//    7   32:aconst_null     
	//    8   33:invokespecial   #37  <Method void ConnectionResult(int, PendingIntent)>
	//    9   36:aload_0         
	//   10   37:invokevirtual   #41  <Method Intent getIntent()>
	//   11   40:ldc1            #43  <String "failing_client_id">
	//   12   42:iconst_m1       
	//   13   43:invokevirtual   #49  <Method int Intent.getIntExtra(String, int)>
	//   14   46:invokevirtual   #54  <Method void zzaap.zza(ConnectionResult, int)>
			return;
	//   15   49:return          

		case -1: 
			zzaap1.zzuW();
	//   16   50:aload_2         
	//   17   51:invokevirtual   #57  <Method void zzaap.zzuW()>
			return;
	//   18   54:return          
		}
	}

	public static Intent zzb(Context context, PendingIntent pendingintent, int i, boolean flag)
	{
		context = ((Context) (new Intent(context, com/google/android/gms/common/api/GoogleApiActivity)));
	//    0    0:new             #45  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class GoogleApiActivity>
	//    4    7:invokespecial   #60  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).putExtra("pending_intent", ((android.os.Parcelable) (pendingintent)));
	//    6   11:aload_0         
	//    7   12:ldc1            #62  <String "pending_intent">
	//    8   14:aload_1         
	//    9   15:invokevirtual   #66  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   10   18:pop             
		((Intent) (context)).putExtra("failing_client_id", i);
	//   11   19:aload_0         
	//   12   20:ldc1            #43  <String "failing_client_id">
	//   13   22:iload_2         
	//   14   23:invokevirtual   #69  <Method Intent Intent.putExtra(String, int)>
	//   15   26:pop             
		((Intent) (context)).putExtra("notify_manager", flag);
	//   16   27:aload_0         
	//   17   28:ldc1            #71  <String "notify_manager">
	//   18   30:iload_3         
	//   19   31:invokevirtual   #74  <Method Intent Intent.putExtra(String, boolean)>
	//   20   34:pop             
		return ((Intent) (context));
	//   21   35:aload_0         
	//   22   36:areturn         
	}

	private void zzuL()
	{
		Object obj = ((Object) (getIntent().getExtras()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method Intent getIntent()>
	//    2    4:invokevirtual   #81  <Method Bundle Intent.getExtras()>
	//    3    7:astore_2        
		if(obj == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       25
		{
			Log.e("GoogleApiActivity", "Activity started without extras");
	//    6   12:ldc1            #83  <String "GoogleApiActivity">
	//    7   14:ldc1            #85  <String "Activity started without extras">
	//    8   16:invokestatic    #91  <Method int Log.e(String, String)>
	//    9   19:pop             
			finish();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #94  <Method void finish()>
			return;
	//   12   24:return          
		}
		PendingIntent pendingintent = (PendingIntent)((Bundle) (obj)).get("pending_intent");
	//   13   25:aload_2         
	//   14   26:ldc1            #62  <String "pending_intent">
	//   15   28:invokevirtual   #100 <Method Object Bundle.get(String)>
	//   16   31:checkcast       #27  <Class PendingIntent>
	//   17   34:astore_1        
		obj = ((Object) ((Integer)((Bundle) (obj)).get("error_code")));
	//   18   35:aload_2         
	//   19   36:ldc1            #102 <String "error_code">
	//   20   38:invokevirtual   #100 <Method Object Bundle.get(String)>
	//   21   41:checkcast       #104 <Class Integer>
	//   22   44:astore_2        
		if(pendingintent == null && obj == null)
	//*  23   45:aload_1         
	//*  24   46:ifnonnull       66
	//*  25   49:aload_2         
	//*  26   50:ifnonnull       66
		{
			Log.e("GoogleApiActivity", "Activity started without resolution");
	//   27   53:ldc1            #83  <String "GoogleApiActivity">
	//   28   55:ldc1            #106 <String "Activity started without resolution">
	//   29   57:invokestatic    #91  <Method int Log.e(String, String)>
	//   30   60:pop             
			finish();
	//   31   61:aload_0         
	//   32   62:invokevirtual   #94  <Method void finish()>
			return;
	//   33   65:return          
		}
		if(pendingintent != null)
	//*  34   66:aload_1         
	//*  35   67:ifnull          104
		{
			try
			{
				startIntentSenderForResult(pendingintent.getIntentSender(), 1, ((Intent) (null)), 0, 0, 0);
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:invokevirtual   #110 <Method android.content.IntentSender PendingIntent.getIntentSender()>
	//   39   75:iconst_1        
	//   40   76:aconst_null     
	//   41   77:iconst_0        
	//   42   78:iconst_0        
	//   43   79:iconst_0        
	//   44   80:invokevirtual   #114 <Method void startIntentSenderForResult(android.content.IntentSender, int, Intent, int, int, int)>
				zzaxL = 1;
	//   45   83:aload_0         
	//   46   84:iconst_1        
	//   47   85:putfield        #14  <Field int zzaxL>
				return;
	//   48   88:return          
			}
			catch(android.content.IntentSender.SendIntentException sendintentexception)
	//*  49   89:astore_1        
			{
				Log.e("GoogleApiActivity", "Failed to launch pendingIntent", ((Throwable) (sendintentexception)));
	//   50   90:ldc1            #83  <String "GoogleApiActivity">
	//   51   92:ldc1            #116 <String "Failed to launch pendingIntent">
	//   52   94:aload_1         
	//   53   95:invokestatic    #119 <Method int Log.e(String, String, Throwable)>
	//   54   98:pop             
			}
			finish();
	//   55   99:aload_0         
	//   56  100:invokevirtual   #94  <Method void finish()>
			return;
	//   57  103:return          
		} else
		{
			GoogleApiAvailability.getInstance().showErrorDialogFragment(((Activity) (this)), ((Integer) (obj)).intValue(), 2, ((android.content.DialogInterface.OnCancelListener) (this)));
	//   58  104:invokestatic    #125 <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//   59  107:aload_0         
	//   60  108:aload_2         
	//   61  109:invokevirtual   #129 <Method int Integer.intValue()>
	//   62  112:iconst_2        
	//   63  113:aload_0         
	//   64  114:invokevirtual   #133 <Method boolean GoogleApiAvailability.showErrorDialogFragment(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
	//   65  117:pop             
			zzaxL = 1;
	//   66  118:aload_0         
	//   67  119:iconst_1        
	//   68  120:putfield        #14  <Field int zzaxL>
			return;
	//   69  123:return          
		}
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		super.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #137 <Method void Activity.onActivityResult(int, int, Intent)>
		if(i != 1) goto _L2; else goto _L1
	//    5    7:iload_1         
	//    6    8:iconst_1        
	//    7    9:icmpne          53
_L1:
		boolean flag = getIntent().getBooleanExtra("notify_manager", true);
	//    8   12:aload_0         
	//    9   13:invokevirtual   #41  <Method Intent getIntent()>
	//   10   16:ldc1            #71  <String "notify_manager">
	//   11   18:iconst_1        
	//   12   19:invokevirtual   #141 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   13   22:istore          4
		zzaxL = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #14  <Field int zzaxL>
		setResultCode(j);
	//   17   29:aload_0         
	//   18   30:iload_2         
	//   19   31:invokevirtual   #145 <Method void setResultCode(int)>
		if(flag)
	//*  20   34:iload           4
	//*  21   36:ifeq            48
			zza(j, zzaap.zzax(((Context) (this))));
	//   22   39:aload_0         
	//   23   40:iload_2         
	//   24   41:aload_0         
	//   25   42:invokestatic    #149 <Method zzaap zzaap.zzax(Context)>
	//   26   45:invokespecial   #151 <Method void zza(int, zzaap)>
_L4:
		finish();
	//   27   48:aload_0         
	//   28   49:invokevirtual   #94  <Method void finish()>
		return;
	//   29   52:return          
_L2:
		if(i == 2)
	//*  30   53:iload_1         
	//*  31   54:iconst_2        
	//*  32   55:icmpne          48
		{
			zzaxL = 0;
	//   33   58:aload_0         
	//   34   59:iconst_0        
	//   35   60:putfield        #14  <Field int zzaxL>
			setResultCode(j);
	//   36   63:aload_0         
	//   37   64:iload_2         
	//   38   65:invokevirtual   #145 <Method void setResultCode(int)>
		}
		if(true) goto _L4; else goto _L3
	//   39   68:goto            48
_L3:
	}

	public void onCancel(DialogInterface dialoginterface)
	{
		zzaxL = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #14  <Field int zzaxL>
		setResult(0);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #156 <Method void setResult(int)>
		finish();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #94  <Method void finish()>
	//    8   14:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method void Activity.onCreate(Bundle)>
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
			zzaxL = bundle.getInt("resolution");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #162 <String "resolution">
	//    8   13:invokevirtual   #166 <Method int Bundle.getInt(String)>
	//    9   16:putfield        #14  <Field int zzaxL>
		if(zzaxL != 1)
	//*  10   19:aload_0         
	//*  11   20:getfield        #14  <Field int zzaxL>
	//*  12   23:iconst_1        
	//*  13   24:icmpeq          31
			zzuL();
	//   14   27:aload_0         
	//   15   28:invokespecial   #168 <Method void zzuL()>
	//   16   31:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		bundle.putInt("resolution", zzaxL);
	//    0    0:aload_1         
	//    1    1:ldc1            #162 <String "resolution">
	//    2    3:aload_0         
	//    3    4:getfield        #14  <Field int zzaxL>
	//    4    7:invokevirtual   #173 <Method void Bundle.putInt(String, int)>
		super.onSaveInstanceState(bundle);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokespecial   #175 <Method void Activity.onSaveInstanceState(Bundle)>
	//    8   15:return          
	}

	protected void setResultCode(int i)
	{
		setResult(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #156 <Method void setResult(int)>
	//    3    5:return          
	}

	protected int zzaxL;
}
