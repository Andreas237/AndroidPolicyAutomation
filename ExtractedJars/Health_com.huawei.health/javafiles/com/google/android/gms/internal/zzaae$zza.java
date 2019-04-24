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
//			zzaae, zzabf

class zzaae$zza
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
	//   19   45:invokevirtual   #51  <Method android.app.PendingIntent ConnectionResult.getResolution()>
	//   20   48:aload_0         
	//   21   49:getfield        #17  <Field zzaae zzaAd>
	//   22   52:invokestatic    #55  <Method int zzaae.zzb(zzaae)>
	//   23   55:iconst_0        
	//   24   56:invokestatic    #60  <Method android.content.Intent GoogleApiActivity.zzb(android.content.Context, android.app.PendingIntent, int, boolean)>
	//   25   59:iconst_1        
	//   26   60:invokeinterface #66  <Method void zzabf.startActivityForResult(android.content.Intent, int)>
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
			zzaAd.zzazn.zza(zzaAd.getActivity(), zzaAd.zzaCR, zzaae.zza(zzaAd).getErrorCode(), 2, ((android.content.rface.OnCancelListener) (zzaAd)));
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
			Dialog dialog = zzaAd.zzazn.zza(zzaAd.getActivity(), ((android.content.rface.OnCancelListener) (zzaAd)));
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
			zzaAd.zzazn.zza(zzaAd.getActivity().getApplicationContext(), ((zzaaz$zza) (new zzaaz.zza(dialog) {

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
				final zzaae.zza zzaAf;

			
			{
				zzaAf = zzaae.zza.this;
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

	private zzaae$zza(zzaae zzaae1)
	{
		zzaAd = zzaae1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzaae zzaAd>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	zzaae$zza(zzaae zzaae1, zzaae._cls1 _pcls1)
	{
		this(zzaae1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void zzaae$zza(zzaae)>
	//    3    5:return          
	}
}
