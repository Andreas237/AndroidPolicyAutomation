// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Dialog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

// Referenced classes of package com.google.android.gms.internal:
//			zzzw, zzaax

private class zzzw$zza
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
	//   19   45:invokevirtual   #51  <Method android.app.PendingIntent ConnectionResult.getResolution()>
	//   20   48:aload_0         
	//   21   49:getfield        #17  <Field zzzw zzayK>
	//   22   52:invokestatic    #55  <Method int zzzw.zzb(zzzw)>
	//   23   55:iconst_0        
	//   24   56:invokestatic    #60  <Method android.content.Intent GoogleApiActivity.zzb(android.content.Context, android.app.PendingIntent, int, boolean)>
	//   25   59:iconst_1        
	//   26   60:invokeinterface #66  <Method void zzaax.startActivityForResult(android.content.Intent, int)>
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
			zzayK.zzaxX.zza(zzayK.getActivity(), zzayK.zzaBs, zzzw.zza(zzayK).getErrorCode(), 2, ((android.content.erface.OnCancelListener) (zzayK)));
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
			Dialog dialog = zzayK.zzaxX.zza(zzayK.getActivity(), ((android.content.erface.OnCancelListener) (zzayK)));
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
			zzayK.zzaxX.zza(zzayK.getActivity().getApplicationContext(), (() (new zzaar.zza(dialog) {

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
				final zzzw.zza zzayM;

			
			{
				zzayM = zzzw.zza.this;
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

	private zzzw$zza(zzzw zzzw1)
	{
		zzayK = zzzw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzzw zzayK>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	zzzw$zza(zzzw zzzw1, zzzw._cls1 _pcls1)
	{
		this(zzzw1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void zzzw$zza(zzzw)>
	//    3    5:return          
	}
}
