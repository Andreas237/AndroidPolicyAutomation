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
	//    1    1:invokespecial   #14  <Method void Activity()>
		zabp = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #16  <Field int zabp>
	//    5    9:return          
	}

	public static PendingIntent zaa(Context context, PendingIntent pendingintent, int i)
	{
		return PendingIntent.getActivity(context, 0, zaa(context, pendingintent, i, true), 0x8000000);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:iload_2         
	//    5    5:iconst_1        
	//    6    6:invokestatic    #22  <Method Intent zaa(Context, PendingIntent, int, boolean)>
	//    7    9:ldc1            #23  <Int 0x8000000>
	//    8   11:invokestatic    #29  <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//    9   14:areturn         
	}

	public static Intent zaa(Context context, PendingIntent pendingintent, int i, boolean flag)
	{
		context = ((Context) (new Intent(context, com/google/android/gms/common/api/GoogleApiActivity)));
	//    0    0:new             #31  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class GoogleApiActivity>
	//    4    7:invokespecial   #34  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).putExtra("pending_intent", ((android.os.Parcelable) (pendingintent)));
	//    6   11:aload_0         
	//    7   12:ldc1            #36  <String "pending_intent">
	//    8   14:aload_1         
	//    9   15:invokevirtual   #40  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   10   18:pop             
		((Intent) (context)).putExtra("failing_client_id", i);
	//   11   19:aload_0         
	//   12   20:ldc1            #42  <String "failing_client_id">
	//   13   22:iload_2         
	//   14   23:invokevirtual   #45  <Method Intent Intent.putExtra(String, int)>
	//   15   26:pop             
		((Intent) (context)).putExtra("notify_manager", flag);
	//   16   27:aload_0         
	//   17   28:ldc1            #47  <String "notify_manager">
	//   18   30:iload_3         
	//   19   31:invokevirtual   #50  <Method Intent Intent.putExtra(String, boolean)>
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
	//    4    4:invokespecial   #54  <Method void Activity.onActivityResult(int, int, Intent)>
		if(i == 1)
	//*   5    7:iload_1         
	//*   6    8:iconst_1        
	//*   7    9:icmpne          105
		{
			boolean flag = getIntent().getBooleanExtra("notify_manager", true);
	//    8   12:aload_0         
	//    9   13:invokevirtual   #58  <Method Intent getIntent()>
	//   10   16:ldc1            #47  <String "notify_manager">
	//   11   18:iconst_1        
	//   12   19:invokevirtual   #62  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   13   22:istore          4
			zabp = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #16  <Field int zabp>
			setResult(j, intent);
	//   17   29:aload_0         
	//   18   30:iload_2         
	//   19   31:aload_3         
	//   20   32:invokevirtual   #66  <Method void setResult(int, Intent)>
			if(flag)
	//*  21   35:iload           4
	//*  22   37:ifeq            121
			{
				intent = ((Intent) (GoogleApiManager.zab(((Context) (this)))));
	//   23   40:aload_0         
	//   24   41:invokestatic    #72  <Method GoogleApiManager GoogleApiManager.zab(Context)>
	//   25   44:astore_3        
				switch(j)
	//*  26   45:iload_2         
				{
	//*  27   46:tableswitch     -1 0: default 68
	//	               -1 98
	//	               0 71
	//*  28   68:goto            121
				case 0: // '\0'
					((GoogleApiManager) (intent)).zaa(new ConnectionResult(13, ((PendingIntent) (null))), getIntent().getIntExtra("failing_client_id", -1));
	//   29   71:aload_3         
	//   30   72:new             #74  <Class ConnectionResult>
	//   31   75:dup             
	//   32   76:bipush          13
	//   33   78:aconst_null     
	//   34   79:invokespecial   #77  <Method void ConnectionResult(int, PendingIntent)>
	//   35   82:aload_0         
	//   36   83:invokevirtual   #58  <Method Intent getIntent()>
	//   37   86:ldc1            #42  <String "failing_client_id">
	//   38   88:iconst_m1       
	//   39   89:invokevirtual   #81  <Method int Intent.getIntExtra(String, int)>
	//   40   92:invokevirtual   #84  <Method void GoogleApiManager.zaa(ConnectionResult, int)>
					break;

	//*  41   95:goto            121
				case -1: 
					((GoogleApiManager) (intent)).zao();
	//   42   98:aload_3         
	//   43   99:invokevirtual   #87  <Method void GoogleApiManager.zao()>
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
			zabp = 0;
	//   48  110:aload_0         
	//   49  111:iconst_0        
	//   50  112:putfield        #16  <Field int zabp>
			setResult(j, intent);
	//   51  115:aload_0         
	//   52  116:iload_2         
	//   53  117:aload_3         
	//   54  118:invokevirtual   #66  <Method void setResult(int, Intent)>
		}
		finish();
	//   55  121:aload_0         
	//   56  122:invokevirtual   #90  <Method void finish()>
	//   57  125:return          
	}

	public void onCancel(DialogInterface dialoginterface)
	{
		zabp = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #16  <Field int zabp>
		setResult(0);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #95  <Method void setResult(int)>
		finish();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #90  <Method void finish()>
	//    8   14:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #101 <Method void Activity.onCreate(Bundle)>
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
			zabp = bundle.getInt("resolution");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #103 <String "resolution">
	//    8   13:invokevirtual   #109 <Method int Bundle.getInt(String)>
	//    9   16:putfield        #16  <Field int zabp>
		if(zabp != 1)
	//*  10   19:aload_0         
	//*  11   20:getfield        #16  <Field int zabp>
	//*  12   23:iconst_1        
	//*  13   24:icmpeq          150
		{
			Object obj = ((Object) (getIntent().getExtras()));
	//   14   27:aload_0         
	//   15   28:invokevirtual   #58  <Method Intent getIntent()>
	//   16   31:invokevirtual   #113 <Method Bundle Intent.getExtras()>
	//   17   34:astore_2        
			if(obj == null)
	//*  18   35:aload_2         
	//*  19   36:ifnonnull       52
			{
				Log.e("GoogleApiActivity", "Activity started without extras");
	//   20   39:ldc1            #115 <String "GoogleApiActivity">
	//   21   41:ldc1            #117 <String "Activity started without extras">
	//   22   43:invokestatic    #123 <Method int Log.e(String, String)>
	//   23   46:pop             
				finish();
	//   24   47:aload_0         
	//   25   48:invokevirtual   #90  <Method void finish()>
				return;
	//   26   51:return          
			}
			bundle = ((Bundle) ((PendingIntent)((Bundle) (obj)).get("pending_intent")));
	//   27   52:aload_2         
	//   28   53:ldc1            #36  <String "pending_intent">
	//   29   55:invokevirtual   #127 <Method Object Bundle.get(String)>
	//   30   58:checkcast       #25  <Class PendingIntent>
	//   31   61:astore_1        
			obj = ((Object) ((Integer)((Bundle) (obj)).get("error_code")));
	//   32   62:aload_2         
	//   33   63:ldc1            #129 <String "error_code">
	//   34   65:invokevirtual   #127 <Method Object Bundle.get(String)>
	//   35   68:checkcast       #131 <Class Integer>
	//   36   71:astore_2        
			if(bundle == null && obj == null)
	//*  37   72:aload_1         
	//*  38   73:ifnonnull       93
	//*  39   76:aload_2         
	//*  40   77:ifnonnull       93
			{
				Log.e("GoogleApiActivity", "Activity started without resolution");
	//   41   80:ldc1            #115 <String "GoogleApiActivity">
	//   42   82:ldc1            #133 <String "Activity started without resolution">
	//   43   84:invokestatic    #123 <Method int Log.e(String, String)>
	//   44   87:pop             
				finish();
	//   45   88:aload_0         
	//   46   89:invokevirtual   #90  <Method void finish()>
				return;
	//   47   92:return          
			}
			if(bundle != null)
	//*  48   93:aload_1         
	//*  49   94:ifnull          131
			{
				try
				{
					startIntentSenderForResult(((PendingIntent) (bundle)).getIntentSender(), 1, ((Intent) (null)), 0, 0, 0);
	//   50   97:aload_0         
	//   51   98:aload_1         
	//   52   99:invokevirtual   #137 <Method android.content.IntentSender PendingIntent.getIntentSender()>
	//   53  102:iconst_1        
	//   54  103:aconst_null     
	//   55  104:iconst_0        
	//   56  105:iconst_0        
	//   57  106:iconst_0        
	//   58  107:invokevirtual   #141 <Method void startIntentSenderForResult(android.content.IntentSender, int, Intent, int, int, int)>
					zabp = 1;
	//   59  110:aload_0         
	//   60  111:iconst_1        
	//   61  112:putfield        #16  <Field int zabp>
					return;
	//   62  115:return          
				}
				// Misplaced declaration of an exception variable
				catch(Bundle bundle)
	//*  63  116:astore_1        
				{
					Log.e("GoogleApiActivity", "Failed to launch pendingIntent", ((Throwable) (bundle)));
	//   64  117:ldc1            #115 <String "GoogleApiActivity">
	//   65  119:ldc1            #143 <String "Failed to launch pendingIntent">
	//   66  121:aload_1         
	//   67  122:invokestatic    #146 <Method int Log.e(String, String, Throwable)>
	//   68  125:pop             
				}
				finish();
	//   69  126:aload_0         
	//   70  127:invokevirtual   #90  <Method void finish()>
				return;
	//   71  130:return          
			}
			GoogleApiAvailability.getInstance().showErrorDialogFragment(((Activity) (this)), ((Integer) (obj)).intValue(), 2, ((android.content.DialogInterface.OnCancelListener) (this)));
	//   72  131:invokestatic    #152 <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//   73  134:aload_0         
	//   74  135:aload_2         
	//   75  136:invokevirtual   #156 <Method int Integer.intValue()>
	//   76  139:iconst_2        
	//   77  140:aload_0         
	//   78  141:invokevirtual   #160 <Method boolean GoogleApiAvailability.showErrorDialogFragment(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
	//   79  144:pop             
			zabp = 1;
	//   80  145:aload_0         
	//   81  146:iconst_1        
	//   82  147:putfield        #16  <Field int zabp>
		}
	//   83  150:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		bundle.putInt("resolution", zabp);
	//    0    0:aload_1         
	//    1    1:ldc1            #103 <String "resolution">
	//    2    3:aload_0         
	//    3    4:getfield        #16  <Field int zabp>
	//    4    7:invokevirtual   #165 <Method void Bundle.putInt(String, int)>
		super.onSaveInstanceState(bundle);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokespecial   #167 <Method void Activity.onSaveInstanceState(Bundle)>
	//    8   15:return          
	}

	private int zabp;
}
