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
//			zzaaw, zzaax

public abstract class zzzw extends zzaaw
	implements android.content.DialogInterface.OnCancelListener
{
	private class zza
		implements Runnable
	{

		public void run()
		{
			if(!zzayK.mStarted)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field zzzw zzayK>
		//*   2    4:getfield        #30  <Field boolean zzzw.mStarted>
		//*   3    7:ifne            11
				return;
		//    4   10:return          
			if(zzzw.zza(zzayK).hasResolution())
		//*   5   11:aload_0         
		//*   6   12:getfield        #17  <Field zzzw zzayK>
		//*   7   15:invokestatic    #33  <Method ConnectionResult zzzw.zza(zzzw)>
		//*   8   18:invokevirtual   #39  <Method boolean ConnectionResult.hasResolution()>
		//*   9   21:ifeq            66
			{
				zzayK.zzaBs.startActivityForResult(GoogleApiActivity.zzb(((android.content.Context) (zzayK.getActivity())), zzzw.zza(zzayK).getResolution(), zzzw.zzb(zzayK), false), 1);
		//   10   24:aload_0         
		//   11   25:getfield        #17  <Field zzzw zzayK>
		//   12   28:getfield        #43  <Field zzaax zzzw.zzaBs>
		//   13   31:aload_0         
		//   14   32:getfield        #17  <Field zzzw zzayK>
		//   15   35:invokevirtual   #47  <Method Activity zzzw.getActivity()>
		//   16   38:aload_0         
		//   17   39:getfield        #17  <Field zzzw zzayK>
		//   18   42:invokestatic    #33  <Method ConnectionResult zzzw.zza(zzzw)>
		//   19   45:invokevirtual   #51  <Method PendingIntent ConnectionResult.getResolution()>
		//   20   48:aload_0         
		//   21   49:getfield        #17  <Field zzzw zzayK>
		//   22   52:invokestatic    #55  <Method int zzzw.zzb(zzzw)>
		//   23   55:iconst_0        
		//   24   56:invokestatic    #60  <Method Intent GoogleApiActivity.zzb(android.content.Context, PendingIntent, int, boolean)>
		//   25   59:iconst_1        
		//   26   60:invokeinterface #66  <Method void zzaax.startActivityForResult(Intent, int)>
				return;
		//   27   65:return          
			}
			if(zzayK.zzaxX.isUserResolvableError(zzzw.zza(zzayK).getErrorCode()))
		//*  28   66:aload_0         
		//*  29   67:getfield        #17  <Field zzzw zzayK>
		//*  30   70:getfield        #70  <Field GoogleApiAvailability zzzw.zzaxX>
		//*  31   73:aload_0         
		//*  32   74:getfield        #17  <Field zzzw zzayK>
		//*  33   77:invokestatic    #33  <Method ConnectionResult zzzw.zza(zzzw)>
		//*  34   80:invokevirtual   #74  <Method int ConnectionResult.getErrorCode()>
		//*  35   83:invokevirtual   #80  <Method boolean GoogleApiAvailability.isUserResolvableError(int)>
		//*  36   86:ifeq            130
			{
				zzayK.zzaxX.zza(zzayK.getActivity(), zzayK.zzaBs, zzzw.zza(zzayK).getErrorCode(), 2, ((android.content.DialogInterface.OnCancelListener) (zzayK)));
		//   37   89:aload_0         
		//   38   90:getfield        #17  <Field zzzw zzayK>
		//   39   93:getfield        #70  <Field GoogleApiAvailability zzzw.zzaxX>
		//   40   96:aload_0         
		//   41   97:getfield        #17  <Field zzzw zzayK>
		//   42  100:invokevirtual   #47  <Method Activity zzzw.getActivity()>
		//   43  103:aload_0         
		//   44  104:getfield        #17  <Field zzzw zzayK>
		//   45  107:getfield        #43  <Field zzaax zzzw.zzaBs>
		//   46  110:aload_0         
		//   47  111:getfield        #17  <Field zzzw zzayK>
		//   48  114:invokestatic    #33  <Method ConnectionResult zzzw.zza(zzzw)>
		//   49  117:invokevirtual   #74  <Method int ConnectionResult.getErrorCode()>
		//   50  120:iconst_2        
		//   51  121:aload_0         
		//   52  122:getfield        #17  <Field zzzw zzayK>
		//   53  125:invokevirtual   #83  <Method boolean GoogleApiAvailability.zza(Activity, zzaax, int, int, android.content.DialogInterface$OnCancelListener)>
		//   54  128:pop             
				return;
		//   55  129:return          
			}
			if(zzzw.zza(zzayK).getErrorCode() == 18)
		//*  56  130:aload_0         
		//*  57  131:getfield        #17  <Field zzzw zzayK>
		//*  58  134:invokestatic    #33  <Method ConnectionResult zzzw.zza(zzzw)>
		//*  59  137:invokevirtual   #74  <Method int ConnectionResult.getErrorCode()>
		//*  60  140:bipush          18
		//*  61  142:icmpne          198
			{
				Dialog dialog = zzayK.zzaxX.zza(zzayK.getActivity(), ((android.content.DialogInterface.OnCancelListener) (zzayK)));
		//   62  145:aload_0         
		//   63  146:getfield        #17  <Field zzzw zzayK>
		//   64  149:getfield        #70  <Field GoogleApiAvailability zzzw.zzaxX>
		//   65  152:aload_0         
		//   66  153:getfield        #17  <Field zzzw zzayK>
		//   67  156:invokevirtual   #47  <Method Activity zzzw.getActivity()>
		//   68  159:aload_0         
		//   69  160:getfield        #17  <Field zzzw zzayK>
		//   70  163:invokevirtual   #86  <Method Dialog GoogleApiAvailability.zza(Activity, android.content.DialogInterface$OnCancelListener)>
		//   71  166:astore_1        
				zzayK.zzaxX.zza(zzayK.getActivity().getApplicationContext(), ((zzaar.zza) (new zzaar.zza(this, dialog) {

					public void zzvb()
					{
						zzayM.zzayK.zzva();
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field zzzw$zza zzayM>
					//    2    4:getfield        #30  <Field zzzw zzzw$zza.zzayK>
					//    3    7:invokevirtual   #33  <Method void zzzw.zzva()>
						if(zzayL.isShowing())
					//*   4   10:aload_0         
					//*   5   11:getfield        #22  <Field Dialog zzayL>
					//*   6   14:invokevirtual   #39  <Method boolean Dialog.isShowing()>
					//*   7   17:ifeq            27
							zzayL.dismiss();
					//    8   20:aload_0         
					//    9   21:getfield        #22  <Field Dialog zzayL>
					//   10   24:invokevirtual   #42  <Method void Dialog.dismiss()>
					//   11   27:return          
					}

					final Dialog zzayL;
					final zza zzayM;

			
			{
				zzayM = zza1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field zzzw$zza zzayM>
				zzayL = dialog;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Dialog zzayL>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void zzaar$zza()>
			//    8   14:return          
			}
				}
)));
		//   72  167:aload_0         
		//   73  168:getfield        #17  <Field zzzw zzayK>
		//   74  171:getfield        #70  <Field GoogleApiAvailability zzzw.zzaxX>
		//   75  174:aload_0         
		//   76  175:getfield        #17  <Field zzzw zzayK>
		//   77  178:invokevirtual   #47  <Method Activity zzzw.getActivity()>
		//   78  181:invokevirtual   #92  <Method android.content.Context Activity.getApplicationContext()>
		//   79  184:new             #11  <Class zzzw$zza$1>
		//   80  187:dup             
		//   81  188:aload_0         
		//   82  189:aload_1         
		//   83  190:invokespecial   #95  <Method void zzzw$zza$1(zzzw$zza, Dialog)>
		//   84  193:invokevirtual   #98  <Method zzaar GoogleApiAvailability.zza(android.content.Context, zzaar$zza)>
		//   85  196:pop             
				return;
		//   86  197:return          
			} else
			{
				zzayK.zza(zzzw.zza(zzayK), zzzw.zzb(zzayK));
		//   87  198:aload_0         
		//   88  199:getfield        #17  <Field zzzw zzayK>
		//   89  202:aload_0         
		//   90  203:getfield        #17  <Field zzzw zzayK>
		//   91  206:invokestatic    #33  <Method ConnectionResult zzzw.zza(zzzw)>
		//   92  209:aload_0         
		//   93  210:getfield        #17  <Field zzzw zzayK>
		//   94  213:invokestatic    #55  <Method int zzzw.zzb(zzzw)>
		//   95  216:invokevirtual   #101 <Method void zzzw.zza(ConnectionResult, int)>
				return;
		//   96  219:return          
			}
		}

		final zzzw zzayK;

		private zza()
		{
			zzayK = zzzw.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field zzzw zzayK>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}

	}


	protected zzzw(zzaax zzaax)
	{
		this(zzaax, GoogleApiAvailability.getInstance());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #32  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//    3    5:invokespecial   #35  <Method void zzzw(zzaax, GoogleApiAvailability)>
	//    4    8:return          
	}

	zzzw(zzaax zzaax, GoogleApiAvailability googleapiavailability)
	{
		super(zzaax);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void zzaaw(zzaax)>
		zzayI = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #40  <Field int zzayI>
		zzayJ = new Handler(Looper.getMainLooper());
	//    6   10:aload_0         
	//    7   11:new             #42  <Class Handler>
	//    8   14:dup             
	//    9   15:invokestatic    #48  <Method Looper Looper.getMainLooper()>
	//   10   18:invokespecial   #51  <Method void Handler(Looper)>
	//   11   21:putfield        #53  <Field Handler zzayJ>
		zzaxX = googleapiavailability;
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:putfield        #55  <Field GoogleApiAvailability zzaxX>
	//   15   29:return          
	}

	static ConnectionResult zza(zzzw zzzw1)
	{
		return zzzw1.zzayH;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field ConnectionResult zzayH>
	//    2    4:areturn         
	}

	static int zzb(zzzw zzzw1)
	{
		return zzzw1.zzayI;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int zzayI>
	//    2    4:ireturn         
	}

	public void onActivityResult(int i, int j, Intent intent)
	{
		boolean flag;
		int k;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		k = 1;
	//    2    3:iconst_1        
	//    3    4:istore          5
		i;
	//    4    6:iload_1         
		JVM INSTR tableswitch 1 2: default 28
	//	               1 84
	//	               2 39;
	//    5    7:tableswitch     1 2: default 28
	//	               1 84
	//	               2 39
		   goto _L1 _L2 _L3
_L1:
		i = 0;
	//    6   28:iconst_0        
	//    7   29:istore_1        
_L5:
		if(i != 0)
	//*   8   30:iload_1         
	//*   9   31:ifeq            125
		{
			zzva();
	//   10   34:aload_0         
	//   11   35:invokevirtual   #66  <Method void zzva()>
			return;
	//   12   38:return          
		} else
	//*  13   39:aload_0         
	//*  14   40:getfield        #55  <Field GoogleApiAvailability zzaxX>
	//*  15   43:aload_0         
	//*  16   44:invokevirtual   #70  <Method Activity getActivity()>
	//*  17   47:invokevirtual   #74  <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(android.content.Context)>
	//*  18   50:istore          5
	//*  19   52:iload           5
	//*  20   54:ifne            144
	//*  21   57:iload           4
	//*  22   59:istore_2        
	//*  23   60:iload_2         
	//*  24   61:istore_1        
	//*  25   62:aload_0         
	//*  26   63:getfield        #58  <Field ConnectionResult zzayH>
	//*  27   66:invokevirtual   #80  <Method int ConnectionResult.getErrorCode()>
	//*  28   69:bipush          18
	//*  29   71:icmpne          30
	//*  30   74:iload_2         
	//*  31   75:istore_1        
	//*  32   76:iload           5
	//*  33   78:bipush          18
	//*  34   80:icmpne          30
	//*  35   83:return          
	//*  36   84:iload           5
	//*  37   86:istore_1        
	//*  38   87:iload_2         
	//*  39   88:iconst_m1       
	//*  40   89:icmpeq          30
	//*  41   92:iload_2         
	//*  42   93:ifne            28
	//*  43   96:aload_3         
	//*  44   97:ifnull          138
	//*  45  100:aload_3         
	//*  46  101:ldc1            #82  <String "<<ResolutionFailureErrorDetail>>">
	//*  47  103:bipush          13
	//*  48  105:invokevirtual   #88  <Method int Intent.getIntExtra(String, int)>
	//*  49  108:istore_1        
	//*  50  109:aload_0         
	//*  51  110:new             #76  <Class ConnectionResult>
	//*  52  113:dup             
	//*  53  114:iload_1         
	//*  54  115:aconst_null     
	//*  55  116:invokespecial   #91  <Method void ConnectionResult(int, PendingIntent)>
	//*  56  119:putfield        #58  <Field ConnectionResult zzayH>
	//*  57  122:goto            28
		{
			zza(zzayH, zzayI);
	//   58  125:aload_0         
	//   59  126:aload_0         
	//   60  127:getfield        #58  <Field ConnectionResult zzayH>
	//   61  130:aload_0         
	//   62  131:getfield        #40  <Field int zzayI>
	//   63  134:invokevirtual   #94  <Method void zza(ConnectionResult, int)>
			return;
	//   64  137:return          
		}
_L3:
		k = zzaxX.isGooglePlayServicesAvailable(((android.content.Context) (getActivity())));
		if(k == 0)
			j = ((int) (flag));
		else
	//*  65  138:bipush          13
	//*  66  140:istore_1        
	//*  67  141:goto            109
			j = 0;
	//   68  144:iconst_0        
	//   69  145:istore_2        
		i = j;
		if(zzayH.getErrorCode() != 18) goto _L5; else goto _L4
_L4:
		i = j;
		if(k != 18) goto _L5; else goto _L6
_L6:
		return;
_L2:
		i = k;
		if(j == -1) goto _L5; else goto _L7
_L7:
		if(j == 0)
		{
			if(intent != null)
				i = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
			else
				i = 13;
			zzayH = new ConnectionResult(i, ((PendingIntent) (null)));
		}
		if(true) goto _L1; else goto _L8
_L8:
	//*  70  146:goto            60
	}

	public void onCancel(DialogInterface dialoginterface)
	{
		zza(new ConnectionResult(13, ((PendingIntent) (null))), zzayI);
	//    0    0:aload_0         
	//    1    1:new             #76  <Class ConnectionResult>
	//    2    4:dup             
	//    3    5:bipush          13
	//    4    7:aconst_null     
	//    5    8:invokespecial   #91  <Method void ConnectionResult(int, PendingIntent)>
	//    6   11:aload_0         
	//    7   12:getfield        #40  <Field int zzayI>
	//    8   15:invokevirtual   #94  <Method void zza(ConnectionResult, int)>
		zzva();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #66  <Method void zzva()>
	//   11   22:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #100 <Method void zzaaw.onCreate(Bundle)>
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          64
		{
			zzayG = bundle.getBoolean("resolving_error", false);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #102 <String "resolving_error">
	//    8   13:iconst_0        
	//    9   14:invokevirtual   #108 <Method boolean Bundle.getBoolean(String, boolean)>
	//   10   17:putfield        #110 <Field boolean zzayG>
			if(zzayG)
	//*  11   20:aload_0         
	//*  12   21:getfield        #110 <Field boolean zzayG>
	//*  13   24:ifeq            64
			{
				zzayI = bundle.getInt("failed_client_id", -1);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:ldc1            #112 <String "failed_client_id">
	//   17   31:iconst_m1       
	//   18   32:invokevirtual   #115 <Method int Bundle.getInt(String, int)>
	//   19   35:putfield        #40  <Field int zzayI>
				zzayH = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
	//   20   38:aload_0         
	//   21   39:new             #76  <Class ConnectionResult>
	//   22   42:dup             
	//   23   43:aload_1         
	//   24   44:ldc1            #117 <String "failed_status">
	//   25   46:invokevirtual   #120 <Method int Bundle.getInt(String)>
	//   26   49:aload_1         
	//   27   50:ldc1            #122 <String "failed_resolution">
	//   28   52:invokevirtual   #126 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   29   55:checkcast       #128 <Class PendingIntent>
	//   30   58:invokespecial   #91  <Method void ConnectionResult(int, PendingIntent)>
	//   31   61:putfield        #58  <Field ConnectionResult zzayH>
			}
		}
	//   32   64:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #131 <Method void zzaaw.onSaveInstanceState(Bundle)>
		bundle.putBoolean("resolving_error", zzayG);
	//    3    5:aload_1         
	//    4    6:ldc1            #102 <String "resolving_error">
	//    5    8:aload_0         
	//    6    9:getfield        #110 <Field boolean zzayG>
	//    7   12:invokevirtual   #135 <Method void Bundle.putBoolean(String, boolean)>
		if(zzayG)
	//*   8   15:aload_0         
	//*   9   16:getfield        #110 <Field boolean zzayG>
	//*  10   19:ifeq            58
		{
			bundle.putInt("failed_client_id", zzayI);
	//   11   22:aload_1         
	//   12   23:ldc1            #112 <String "failed_client_id">
	//   13   25:aload_0         
	//   14   26:getfield        #40  <Field int zzayI>
	//   15   29:invokevirtual   #139 <Method void Bundle.putInt(String, int)>
			bundle.putInt("failed_status", zzayH.getErrorCode());
	//   16   32:aload_1         
	//   17   33:ldc1            #117 <String "failed_status">
	//   18   35:aload_0         
	//   19   36:getfield        #58  <Field ConnectionResult zzayH>
	//   20   39:invokevirtual   #80  <Method int ConnectionResult.getErrorCode()>
	//   21   42:invokevirtual   #139 <Method void Bundle.putInt(String, int)>
			bundle.putParcelable("failed_resolution", ((android.os.Parcelable) (zzayH.getResolution())));
	//   22   45:aload_1         
	//   23   46:ldc1            #122 <String "failed_resolution">
	//   24   48:aload_0         
	//   25   49:getfield        #58  <Field ConnectionResult zzayH>
	//   26   52:invokevirtual   #143 <Method PendingIntent ConnectionResult.getResolution()>
	//   27   55:invokevirtual   #147 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		}
	//   28   58:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #150 <Method void zzaaw.onStart()>
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
	//    1    1:invokespecial   #155 <Method void zzaaw.onStop()>
		mStarted = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #152 <Field boolean mStarted>
	//    5    9:return          
	}

	protected abstract void zza(ConnectionResult connectionresult, int i);

	public void zzb(ConnectionResult connectionresult, int i)
	{
		if(!zzayG)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field boolean zzayG>
	//*   2    4:ifne            39
		{
			zzayG = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #110 <Field boolean zzayG>
			zzayI = i;
	//    6   12:aload_0         
	//    7   13:iload_2         
	//    8   14:putfield        #40  <Field int zzayI>
			zzayH = connectionresult;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #58  <Field ConnectionResult zzayH>
			zzayJ.post(((Runnable) (new zza())));
	//   12   22:aload_0         
	//   13   23:getfield        #53  <Field Handler zzayJ>
	//   14   26:new             #10  <Class zzzw$zza>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:aconst_null     
	//   18   32:invokespecial   #158 <Method void zzzw$zza(zzzw, zzzw$1)>
	//   19   35:invokevirtual   #162 <Method boolean Handler.post(Runnable)>
	//   20   38:pop             
		}
	//   21   39:return          
	}

	protected abstract void zzuW();

	protected void zzva()
	{
		zzayI = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #40  <Field int zzayI>
		zzayG = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #110 <Field boolean zzayG>
		zzayH = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #58  <Field ConnectionResult zzayH>
		zzuW();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #165 <Method void zzuW()>
	//   11   19:return          
	}

	protected boolean mStarted;
	protected final GoogleApiAvailability zzaxX;
	protected boolean zzayG;
	private ConnectionResult zzayH;
	private int zzayI;
	private final Handler zzayJ;
}
