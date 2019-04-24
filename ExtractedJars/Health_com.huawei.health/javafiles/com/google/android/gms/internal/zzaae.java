// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.*;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

// Referenced classes of package com.google.android.gms.internal:
//			zzabe, zzabf

public abstract class zzaae extends zzabe
	implements android.content.DialogInterface.OnCancelListener
{
	class zza
		implements Runnable
	{

		public void run()
		{
			if(!zzaAd.mStarted)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field zzaae zzaAd>
		//*   2    4:getfield        #30  <Field boolean zzaae.mStarted>
		//*   3    7:ifne            11
				return;
		//    4   10:return          
			if(zzaae.zza(zzaAd).hasResolution())
		//*   5   11:aload_0         
		//*   6   12:getfield        #17  <Field zzaae zzaAd>
		//*   7   15:invokestatic    #33  <Method ConnectionResult zzaae.zza(zzaae)>
		//*   8   18:invokevirtual   #39  <Method boolean ConnectionResult.hasResolution()>
		//*   9   21:ifeq            66
			{
				zzaAd.zzaCR.startActivityForResult(GoogleApiActivity.zzb(((android.content.Context) (zzaAd.getActivity())), zzaae.zza(zzaAd).getResolution(), zzaae.zzb(zzaAd), false), 1);
		//   10   24:aload_0         
		//   11   25:getfield        #17  <Field zzaae zzaAd>
		//   12   28:getfield        #43  <Field zzabf zzaae.zzaCR>
		//   13   31:aload_0         
		//   14   32:getfield        #17  <Field zzaae zzaAd>
		//   15   35:invokevirtual   #47  <Method Activity zzaae.getActivity()>
		//   16   38:aload_0         
		//   17   39:getfield        #17  <Field zzaae zzaAd>
		//   18   42:invokestatic    #33  <Method ConnectionResult zzaae.zza(zzaae)>
		//   19   45:invokevirtual   #51  <Method PendingIntent ConnectionResult.getResolution()>
		//   20   48:aload_0         
		//   21   49:getfield        #17  <Field zzaae zzaAd>
		//   22   52:invokestatic    #55  <Method int zzaae.zzb(zzaae)>
		//   23   55:iconst_0        
		//   24   56:invokestatic    #60  <Method Intent GoogleApiActivity.zzb(android.content.Context, PendingIntent, int, boolean)>
		//   25   59:iconst_1        
		//   26   60:invokeinterface #66  <Method void zzabf.startActivityForResult(Intent, int)>
				return;
		//   27   65:return          
			}
			if(zzaAd.zzazn.isUserResolvableError(zzaae.zza(zzaAd).getErrorCode()))
		//*  28   66:aload_0         
		//*  29   67:getfield        #17  <Field zzaae zzaAd>
		//*  30   70:getfield        #70  <Field GoogleApiAvailability zzaae.zzazn>
		//*  31   73:aload_0         
		//*  32   74:getfield        #17  <Field zzaae zzaAd>
		//*  33   77:invokestatic    #33  <Method ConnectionResult zzaae.zza(zzaae)>
		//*  34   80:invokevirtual   #74  <Method int ConnectionResult.getErrorCode()>
		//*  35   83:invokevirtual   #80  <Method boolean GoogleApiAvailability.isUserResolvableError(int)>
		//*  36   86:ifeq            130
			{
				zzaAd.zzazn.zza(zzaAd.getActivity(), zzaAd.zzaCR, zzaae.zza(zzaAd).getErrorCode(), 2, ((android.content.DialogInterface.OnCancelListener) (zzaAd)));
		//   37   89:aload_0         
		//   38   90:getfield        #17  <Field zzaae zzaAd>
		//   39   93:getfield        #70  <Field GoogleApiAvailability zzaae.zzazn>
		//   40   96:aload_0         
		//   41   97:getfield        #17  <Field zzaae zzaAd>
		//   42  100:invokevirtual   #47  <Method Activity zzaae.getActivity()>
		//   43  103:aload_0         
		//   44  104:getfield        #17  <Field zzaae zzaAd>
		//   45  107:getfield        #43  <Field zzabf zzaae.zzaCR>
		//   46  110:aload_0         
		//   47  111:getfield        #17  <Field zzaae zzaAd>
		//   48  114:invokestatic    #33  <Method ConnectionResult zzaae.zza(zzaae)>
		//   49  117:invokevirtual   #74  <Method int ConnectionResult.getErrorCode()>
		//   50  120:iconst_2        
		//   51  121:aload_0         
		//   52  122:getfield        #17  <Field zzaae zzaAd>
		//   53  125:invokevirtual   #83  <Method boolean GoogleApiAvailability.zza(Activity, zzabf, int, int, android.content.DialogInterface$OnCancelListener)>
		//   54  128:pop             
				return;
		//   55  129:return          
			}
			if(zzaae.zza(zzaAd).getErrorCode() == 18)
		//*  56  130:aload_0         
		//*  57  131:getfield        #17  <Field zzaae zzaAd>
		//*  58  134:invokestatic    #33  <Method ConnectionResult zzaae.zza(zzaae)>
		//*  59  137:invokevirtual   #74  <Method int ConnectionResult.getErrorCode()>
		//*  60  140:bipush          18
		//*  61  142:icmpne          198
			{
				Dialog dialog = zzaAd.zzazn.zza(zzaAd.getActivity(), ((android.content.DialogInterface.OnCancelListener) (zzaAd)));
		//   62  145:aload_0         
		//   63  146:getfield        #17  <Field zzaae zzaAd>
		//   64  149:getfield        #70  <Field GoogleApiAvailability zzaae.zzazn>
		//   65  152:aload_0         
		//   66  153:getfield        #17  <Field zzaae zzaAd>
		//   67  156:invokevirtual   #47  <Method Activity zzaae.getActivity()>
		//   68  159:aload_0         
		//   69  160:getfield        #17  <Field zzaae zzaAd>
		//   70  163:invokevirtual   #86  <Method Dialog GoogleApiAvailability.zza(Activity, android.content.DialogInterface$OnCancelListener)>
		//   71  166:astore_1        
				zzaAd.zzazn.zza(zzaAd.getActivity().getApplicationContext(), ((zzaaz.zza) (new zzaaz.zza(this, dialog) {

					public void zzvE()
					{
						zzaAf.zzaAd.zzvD();
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field zzaae$zza zzaAf>
					//    2    4:getfield        #30  <Field zzaae zzaae$zza.zzaAd>
					//    3    7:invokevirtual   #33  <Method void zzaae.zzvD()>
						if(zzaAe.isShowing())
					//*   4   10:aload_0         
					//*   5   11:getfield        #22  <Field Dialog zzaAe>
					//*   6   14:invokevirtual   #39  <Method boolean Dialog.isShowing()>
					//*   7   17:ifeq            27
							zzaAe.dismiss();
					//    8   20:aload_0         
					//    9   21:getfield        #22  <Field Dialog zzaAe>
					//   10   24:invokevirtual   #42  <Method void Dialog.dismiss()>
					//   11   27:return          
					}

					final Dialog zzaAe;
					final zza zzaAf;

			
			{
				zzaAf = zza1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field zzaae$zza zzaAf>
				zzaAe = dialog;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Dialog zzaAe>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void zzaaz$zza()>
			//    8   14:return          
			}
				}
)));
		//   72  167:aload_0         
		//   73  168:getfield        #17  <Field zzaae zzaAd>
		//   74  171:getfield        #70  <Field GoogleApiAvailability zzaae.zzazn>
		//   75  174:aload_0         
		//   76  175:getfield        #17  <Field zzaae zzaAd>
		//   77  178:invokevirtual   #47  <Method Activity zzaae.getActivity()>
		//   78  181:invokevirtual   #92  <Method android.content.Context Activity.getApplicationContext()>
		//   79  184:new             #11  <Class zzaae$zza$1>
		//   80  187:dup             
		//   81  188:aload_0         
		//   82  189:aload_1         
		//   83  190:invokespecial   #95  <Method void zzaae$zza$1(zzaae$zza, Dialog)>
		//   84  193:invokevirtual   #98  <Method zzaaz GoogleApiAvailability.zza(android.content.Context, zzaaz$zza)>
		//   85  196:pop             
				return;
		//   86  197:return          
			} else
			{
				zzaAd.zza(zzaae.zza(zzaAd), zzaae.zzb(zzaAd));
		//   87  198:aload_0         
		//   88  199:getfield        #17  <Field zzaae zzaAd>
		//   89  202:aload_0         
		//   90  203:getfield        #17  <Field zzaae zzaAd>
		//   91  206:invokestatic    #33  <Method ConnectionResult zzaae.zza(zzaae)>
		//   92  209:aload_0         
		//   93  210:getfield        #17  <Field zzaae zzaAd>
		//   94  213:invokestatic    #55  <Method int zzaae.zzb(zzaae)>
		//   95  216:invokevirtual   #101 <Method void zzaae.zza(ConnectionResult, int)>
				return;
		//   96  219:return          
			}
		}

		final zzaae zzaAd;

		private zza()
		{
			zzaAd = zzaae.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field zzaae zzaAd>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}

	}


	protected zzaae(zzabf zzabf)
	{
		this(zzabf, GoogleApiAvailability.getInstance());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #32  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//    3    5:invokespecial   #35  <Method void zzaae(zzabf, GoogleApiAvailability)>
	//    4    8:return          
	}

	zzaae(zzabf zzabf, GoogleApiAvailability googleapiavailability)
	{
		super(zzabf);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void zzabe(zzabf)>
		zzaAb = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #40  <Field int zzaAb>
		zzaAc = new Handler(Looper.getMainLooper());
	//    6   10:aload_0         
	//    7   11:new             #42  <Class Handler>
	//    8   14:dup             
	//    9   15:invokestatic    #48  <Method Looper Looper.getMainLooper()>
	//   10   18:invokespecial   #51  <Method void Handler(Looper)>
	//   11   21:putfield        #53  <Field Handler zzaAc>
		zzazn = googleapiavailability;
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:putfield        #55  <Field GoogleApiAvailability zzazn>
	//   15   29:return          
	}

	static ConnectionResult zza(zzaae zzaae1)
	{
		return zzaae1.zzaAa;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field ConnectionResult zzaAa>
	//    2    4:areturn         
	}

	static int zzb(zzaae zzaae1)
	{
		return zzaae1.zzaAb;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int zzaAb>
	//    2    4:ireturn         
	}

	public void onActivityResult(int i, int j, Intent intent)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		boolean flag = false;
	//    2    3:iconst_0        
	//    3    4:istore          5
		switch(i)
	//*   4    6:iload_1         
		{
	//*   5    7:lookupswitch    2: default 32
	//	               1: 85
	//	               2: 38
		default:
			i = k;
	//    6   32:iload           4
	//    7   34:istore_1        
			break;

	//*   8   35:goto            134
		case 2: // '\002'
			k = zzazn.isGooglePlayServicesAvailable(((android.content.Context) (getActivity())));
	//    9   38:aload_0         
	//   10   39:getfield        #55  <Field GoogleApiAvailability zzazn>
	//   11   42:aload_0         
	//   12   43:invokevirtual   #66  <Method Activity getActivity()>
	//   13   46:invokevirtual   #70  <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(android.content.Context)>
	//   14   49:istore          4
			j = ((int) (flag));
	//   15   51:iload           5
	//   16   53:istore_2        
			if(k == 0)
	//*  17   54:iload           4
	//*  18   56:ifne            61
				j = 1;
	//   19   59:iconst_1        
	//   20   60:istore_2        
			i = j;
	//   21   61:iload_2         
	//   22   62:istore_1        
			if(zzaAa.getErrorCode() == 18)
	//*  23   63:aload_0         
	//*  24   64:getfield        #58  <Field ConnectionResult zzaAa>
	//*  25   67:invokevirtual   #76  <Method int ConnectionResult.getErrorCode()>
	//*  26   70:bipush          18
	//*  27   72:icmpne          134
			{
				i = j;
	//   28   75:iload_2         
	//   29   76:istore_1        
				if(k == 18)
	//*  30   77:iload           4
	//*  31   79:bipush          18
	//*  32   81:icmpne          134
					return;
	//   33   84:return          
			}
			break;

		case 1: // '\001'
			if(j == -1)
	//*  34   85:iload_2         
	//*  35   86:iconst_m1       
	//*  36   87:icmpne          95
			{
				i = 1;
	//   37   90:iconst_1        
	//   38   91:istore_1        
			} else
	//*  39   92:goto            134
			{
				i = k;
	//   40   95:iload           4
	//   41   97:istore_1        
				if(j == 0)
	//*  42   98:iload_2         
	//*  43   99:ifne            134
				{
					i = 13;
	//   44  102:bipush          13
	//   45  104:istore_1        
					if(intent != null)
	//*  46  105:aload_3         
	//*  47  106:ifnull          118
						i = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
	//   48  109:aload_3         
	//   49  110:ldc1            #78  <String "<<ResolutionFailureErrorDetail>>">
	//   50  112:bipush          13
	//   51  114:invokevirtual   #84  <Method int Intent.getIntExtra(String, int)>
	//   52  117:istore_1        
					zzaAa = new ConnectionResult(i, ((PendingIntent) (null)));
	//   53  118:aload_0         
	//   54  119:new             #72  <Class ConnectionResult>
	//   55  122:dup             
	//   56  123:iload_1         
	//   57  124:aconst_null     
	//   58  125:invokespecial   #87  <Method void ConnectionResult(int, PendingIntent)>
	//   59  128:putfield        #58  <Field ConnectionResult zzaAa>
					i = k;
	//   60  131:iload           4
	//   61  133:istore_1        
				}
			}
			break;
		}
		if(i != 0)
	//*  62  134:iload_1         
	//*  63  135:ifeq            143
		{
			zzvD();
	//   64  138:aload_0         
	//   65  139:invokevirtual   #91  <Method void zzvD()>
			return;
	//   66  142:return          
		} else
		{
			zza(zzaAa, zzaAb);
	//   67  143:aload_0         
	//   68  144:aload_0         
	//   69  145:getfield        #58  <Field ConnectionResult zzaAa>
	//   70  148:aload_0         
	//   71  149:getfield        #40  <Field int zzaAb>
	//   72  152:invokevirtual   #94  <Method void zza(ConnectionResult, int)>
			return;
	//   73  155:return          
		}
	}

	public void onCancel(DialogInterface dialoginterface)
	{
		zza(new ConnectionResult(13, ((PendingIntent) (null))), zzaAb);
	//    0    0:aload_0         
	//    1    1:new             #72  <Class ConnectionResult>
	//    2    4:dup             
	//    3    5:bipush          13
	//    4    7:aconst_null     
	//    5    8:invokespecial   #87  <Method void ConnectionResult(int, PendingIntent)>
	//    6   11:aload_0         
	//    7   12:getfield        #40  <Field int zzaAb>
	//    8   15:invokevirtual   #94  <Method void zza(ConnectionResult, int)>
		zzvD();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #91  <Method void zzvD()>
	//   11   22:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #100 <Method void zzabe.onCreate(Bundle)>
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          64
		{
			zzazZ = bundle.getBoolean("resolving_error", false);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #102 <String "resolving_error">
	//    8   13:iconst_0        
	//    9   14:invokevirtual   #108 <Method boolean Bundle.getBoolean(String, boolean)>
	//   10   17:putfield        #110 <Field boolean zzazZ>
			if(zzazZ)
	//*  11   20:aload_0         
	//*  12   21:getfield        #110 <Field boolean zzazZ>
	//*  13   24:ifeq            64
			{
				zzaAb = bundle.getInt("failed_client_id", -1);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:ldc1            #112 <String "failed_client_id">
	//   17   31:iconst_m1       
	//   18   32:invokevirtual   #115 <Method int Bundle.getInt(String, int)>
	//   19   35:putfield        #40  <Field int zzaAb>
				zzaAa = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
	//   20   38:aload_0         
	//   21   39:new             #72  <Class ConnectionResult>
	//   22   42:dup             
	//   23   43:aload_1         
	//   24   44:ldc1            #117 <String "failed_status">
	//   25   46:invokevirtual   #120 <Method int Bundle.getInt(String)>
	//   26   49:aload_1         
	//   27   50:ldc1            #122 <String "failed_resolution">
	//   28   52:invokevirtual   #126 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   29   55:checkcast       #128 <Class PendingIntent>
	//   30   58:invokespecial   #87  <Method void ConnectionResult(int, PendingIntent)>
	//   31   61:putfield        #58  <Field ConnectionResult zzaAa>
			}
		}
	//   32   64:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #131 <Method void zzabe.onSaveInstanceState(Bundle)>
		bundle.putBoolean("resolving_error", zzazZ);
	//    3    5:aload_1         
	//    4    6:ldc1            #102 <String "resolving_error">
	//    5    8:aload_0         
	//    6    9:getfield        #110 <Field boolean zzazZ>
	//    7   12:invokevirtual   #135 <Method void Bundle.putBoolean(String, boolean)>
		if(zzazZ)
	//*   8   15:aload_0         
	//*   9   16:getfield        #110 <Field boolean zzazZ>
	//*  10   19:ifeq            58
		{
			bundle.putInt("failed_client_id", zzaAb);
	//   11   22:aload_1         
	//   12   23:ldc1            #112 <String "failed_client_id">
	//   13   25:aload_0         
	//   14   26:getfield        #40  <Field int zzaAb>
	//   15   29:invokevirtual   #139 <Method void Bundle.putInt(String, int)>
			bundle.putInt("failed_status", zzaAa.getErrorCode());
	//   16   32:aload_1         
	//   17   33:ldc1            #117 <String "failed_status">
	//   18   35:aload_0         
	//   19   36:getfield        #58  <Field ConnectionResult zzaAa>
	//   20   39:invokevirtual   #76  <Method int ConnectionResult.getErrorCode()>
	//   21   42:invokevirtual   #139 <Method void Bundle.putInt(String, int)>
			bundle.putParcelable("failed_resolution", ((android.os.Parcelable) (zzaAa.getResolution())));
	//   22   45:aload_1         
	//   23   46:ldc1            #122 <String "failed_resolution">
	//   24   48:aload_0         
	//   25   49:getfield        #58  <Field ConnectionResult zzaAa>
	//   26   52:invokevirtual   #143 <Method PendingIntent ConnectionResult.getResolution()>
	//   27   55:invokevirtual   #147 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		}
	//   28   58:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #150 <Method void zzabe.onStart()>
		mStarted = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #152 <Field boolean mStarted>
	//    5    9:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #155 <Method void zzabe.onStop()>
		mStarted = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #152 <Field boolean mStarted>
	//    5    9:return          
	}

	protected abstract void zza(ConnectionResult connectionresult, int i);

	public void zzb(ConnectionResult connectionresult, int i)
	{
		if(!zzazZ)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field boolean zzazZ>
	//*   2    4:ifne            39
		{
			zzazZ = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #110 <Field boolean zzazZ>
			zzaAb = i;
	//    6   12:aload_0         
	//    7   13:iload_2         
	//    8   14:putfield        #40  <Field int zzaAb>
			zzaAa = connectionresult;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #58  <Field ConnectionResult zzaAa>
			zzaAc.post(((Runnable) (new zza())));
	//   12   22:aload_0         
	//   13   23:getfield        #53  <Field Handler zzaAc>
	//   14   26:new             #10  <Class zzaae$zza>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:aconst_null     
	//   18   32:invokespecial   #158 <Method void zzaae$zza(zzaae, zzaae$1)>
	//   19   35:invokevirtual   #162 <Method boolean Handler.post(Runnable)>
	//   20   38:pop             
		}
	//   21   39:return          
	}

	protected void zzvD()
	{
		zzaAb = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #40  <Field int zzaAb>
		zzazZ = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #110 <Field boolean zzazZ>
		zzaAa = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #58  <Field ConnectionResult zzaAa>
		zzvx();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #165 <Method void zzvx()>
	//   11   19:return          
	}

	protected abstract void zzvx();

	protected boolean mStarted;
	private ConnectionResult zzaAa;
	private int zzaAb;
	private final Handler zzaAc;
	protected boolean zzazZ;
	protected final GoogleApiAvailability zzazn;
}
