// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.SessionsApi;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.*;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//			zzaok, zzapr, zzaoz

public class zzapq
	implements SessionsApi
{
	static class zza extends zzapd.zza
	{

		public void zza(SessionReadResult sessionreadresult)
			throws RemoteException
		{
			zzaGN.setResult(((Object) (sessionreadresult)));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field zzaad$zzb zzaGN>
		//    2    4:aload_1         
		//    3    5:invokeinterface #32  <Method void zzaad$zzb.setResult(Object)>
		//    4   10:return          
		}

		private final zzaad.zzb zzaGN;

		private zza(zzaad.zzb zzb1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void zzapd$zza()>
			zzaGN = zzb1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field zzaad$zzb zzaGN>
		//    5    9:return          
		}

	}

	static class zzb extends zzape.zza
	{

		public void zza(SessionStopResult sessionstopresult)
		{
			zzaGN.setResult(((Object) (sessionstopresult)));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field zzaad$zzb zzaGN>
		//    2    4:aload_1         
		//    3    5:invokeinterface #31  <Method void zzaad$zzb.setResult(Object)>
		//    4   10:return          
		}

		private final zzaad.zzb zzaGN;

		private zzb(zzaad.zzb zzb1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void zzape$zza()>
			zzaGN = zzb1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field zzaad$zzb zzaGN>
		//    5    9:return          
		}

	}


	public zzapq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	private PendingResult zza(final GoogleApiClient final_googleapiclient, String s, String s1)
	{
		return ((PendingResult) (final_googleapiclient.zzb(((zzaad.zza) (new zzaok.zza(s, s1) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzaok)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #28  <Class zzaok>
			//    3    5:invokevirtual   #31  <Method void zza(zzaok)>
			//    4    8:return          
			}

			protected void zza(zzaok zzaok1)
				throws RemoteException
			{
				zzb zzb1 = new zzb(((zzaad.zzb) (this)));
			//    0    0:new             #34  <Class zzapq$zzb>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #37  <Method void zzapq$zzb(zzaad$zzb, zzapq$1)>
			//    5    9:astore_2        
				((zzaoz)zzaok1.zzxD()).zza(new zzbf(name, zzaVi, ((zzape) (zzb1))));
			//    6   10:aload_1         
			//    7   11:invokevirtual   #41  <Method android.os.IInterface zzaok.zzxD()>
			//    8   14:checkcast       #43  <Class zzaoz>
			//    9   17:new             #45  <Class zzbf>
			//   10   20:dup             
			//   11   21:aload_0         
			//   12   22:getfield        #17  <Field String val$name>
			//   13   25:aload_0         
			//   14   26:getfield        #19  <Field String zzaVi>
			//   15   29:aload_2         
			//   16   30:invokespecial   #48  <Method void zzbf(String, String, zzape)>
			//   17   33:invokeinterface #51  <Method void zzaoz.zza(zzbf)>
			//   18   38:return          
			}

			protected SessionStopResult zzab(Status status)
			{
				return SessionStopResult.zzaj(status);
			//    0    0:aload_1         
			//    1    1:invokestatic    #58  <Method SessionStopResult SessionStopResult.zzaj(Status)>
			//    2    4:areturn         
			}

			protected Result zzc(Status status)
			{
				return ((Result) (zzab(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #62  <Method SessionStopResult zzab(Status)>
			//    3    5:areturn         
			}

			final String val$name;
			final String zzaVi;

			
			{
				name = s;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #17  <Field String val$name>
				zzaVi = s1;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #19  <Field String zzaVi>
				super(final_googleapiclient);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:invokespecial   #22  <Method void zzaok$zza(GoogleApiClient)>
			//    9   16:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #10  <Class zzapq$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #33  <Method void zzapq$2(zzapq, GoogleApiClient, String, String)>
	//    8   12:invokevirtual   #38  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    9   15:areturn         
	}

	public PendingResult insertSession(GoogleApiClient googleapiclient, SessionInsertRequest sessioninsertrequest)
	{
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaok.zzc(googleapiclient, sessioninsertrequest) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzaok)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzaok>
			//    3    5:invokevirtual   #28  <Method void zza(zzaok)>
			//    4    8:return          
			}

			protected void zza(zzaok zzaok1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #31  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #34  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaoz)zzaok1.zzxD()).zza(new SessionInsertRequest(zzaVj, ((zzapf) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #38  <Method android.os.IInterface zzaok.zzxD()>
			//    7   13:checkcast       #40  <Class zzaoz>
			//    8   16:new             #42  <Class SessionInsertRequest>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field SessionInsertRequest zzaVj>
			//   12   24:aload_2         
			//   13   25:invokespecial   #45  <Method void SessionInsertRequest(SessionInsertRequest, zzapf)>
			//   14   28:invokeinterface #48  <Method void zzaoz.zza(SessionInsertRequest)>
			//   15   33:return          
			}

			final SessionInsertRequest zzaVj;

			
			{
				zzaVj = sessioninsertrequest;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field SessionInsertRequest zzaVj>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaok$zzc(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #12  <Class zzapq$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #45  <Method void zzapq$3(zzapq, GoogleApiClient, SessionInsertRequest)>
	//    7   11:invokevirtual   #47  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult readSession(GoogleApiClient googleapiclient, SessionReadRequest sessionreadrequest)
	{
		return ((PendingResult) (googleapiclient.zza(((zzaad.zza) (new zzaok.zza(googleapiclient, sessionreadrequest) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzaok)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class zzaok>
			//    3    5:invokevirtual   #29  <Method void zza(zzaok)>
			//    4    8:return          
			}

			protected void zza(zzaok zzaok1)
				throws RemoteException
			{
				zza zza1 = new zza(((zzaad.zzb) (this)));
			//    0    0:new             #32  <Class zzapq$zza>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #35  <Method void zzapq$zza(zzaad$zzb, zzapq$1)>
			//    5    9:astore_2        
				((zzaoz)zzaok1.zzxD()).zza(new SessionReadRequest(zzaVk, ((zzapd) (zza1))));
			//    6   10:aload_1         
			//    7   11:invokevirtual   #39  <Method android.os.IInterface zzaok.zzxD()>
			//    8   14:checkcast       #41  <Class zzaoz>
			//    9   17:new             #43  <Class SessionReadRequest>
			//   10   20:dup             
			//   11   21:aload_0         
			//   12   22:getfield        #16  <Field SessionReadRequest zzaVk>
			//   13   25:aload_2         
			//   14   26:invokespecial   #46  <Method void SessionReadRequest(SessionReadRequest, zzapd)>
			//   15   29:invokeinterface #49  <Method void zzaoz.zza(SessionReadRequest)>
			//   16   34:return          
			}

			protected SessionReadResult zzac(Status status)
			{
				return SessionReadResult.zzai(status);
			//    0    0:aload_1         
			//    1    1:invokestatic    #56  <Method SessionReadResult SessionReadResult.zzai(Status)>
			//    2    4:areturn         
			}

			protected Result zzc(Status status)
			{
				return ((Result) (zzac(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #60  <Method SessionReadResult zzac(Status)>
			//    3    5:areturn         
			}

			final SessionReadRequest zzaVk;

			
			{
				zzaVk = sessionreadrequest;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #16  <Field SessionReadRequest zzaVk>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzaok$zza(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #14  <Class zzapq$4>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #53  <Method void zzapq$4(zzapq, GoogleApiClient, SessionReadRequest)>
	//    7   11:invokevirtual   #47  <Method zzaad$zza GoogleApiClient.zza(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult registerForSessions(GoogleApiClient googleapiclient, PendingIntent pendingintent)
	{
		return zza(googleapiclient, pendingintent, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #59  <Method PendingResult zza(GoogleApiClient, PendingIntent, int)>
	//    5    7:areturn         
	}

	public PendingResult startSession(GoogleApiClient googleapiclient, Session session)
	{
		zzac.zzb(((Object) (session)), "Session cannot be null");
	//    0    0:aload_2         
	//    1    1:ldc1            #64  <String "Session cannot be null">
	//    2    3:invokestatic    #69  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		boolean flag;
		if(session.getEndTime(TimeUnit.MILLISECONDS) == 0L)
	//*   4    7:aload_2         
	//*   5    8:getstatic       #75  <Field TimeUnit TimeUnit.MILLISECONDS>
	//*   6   11:invokevirtual   #81  <Method long Session.getEndTime(TimeUnit)>
	//*   7   14:lconst_0        
	//*   8   15:lcmp            
	//*   9   16:ifne            24
			flag = true;
	//   10   19:iconst_1        
	//   11   20:istore_3        
		else
	//*  12   21:goto            26
			flag = false;
	//   13   24:iconst_0        
	//   14   25:istore_3        
		zzac.zzb(flag, "Cannot start a session which has already ended");
	//   15   26:iload_3         
	//   16   27:ldc1            #83  <String "Cannot start a session which has already ended">
	//   17   29:invokestatic    #86  <Method void zzac.zzb(boolean, Object)>
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zzaok.zzc(googleapiclient, session) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzaok)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzaok>
			//    3    5:invokevirtual   #28  <Method void zza(zzaok)>
			//    4    8:return          
			}

			protected void zza(zzaok zzaok1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #31  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #34  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaoz)zzaok1.zzxD()).zza(new zzbd(zzaVh, ((zzapf) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #38  <Method android.os.IInterface zzaok.zzxD()>
			//    7   13:checkcast       #40  <Class zzaoz>
			//    8   16:new             #42  <Class zzbd>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field Session zzaVh>
			//   12   24:aload_2         
			//   13   25:invokespecial   #45  <Method void zzbd(Session, zzapf)>
			//   14   28:invokeinterface #48  <Method void zzaoz.zza(zzbd)>
			//   15   33:return          
			}

			final Session zzaVh;

			
			{
				zzaVh = session;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field Session zzaVh>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaok$zzc(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//   18   32:aload_1         
	//   19   33:new             #8   <Class zzapq$1>
	//   20   36:dup             
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:aload_2         
	//   24   40:invokespecial   #89  <Method void zzapq$1(zzapq, GoogleApiClient, Session)>
	//   25   43:invokevirtual   #38  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//   26   46:areturn         
	}

	public PendingResult stopSession(GoogleApiClient googleapiclient, String s)
	{
		return zza(googleapiclient, ((String) (null)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokespecial   #94  <Method PendingResult zza(GoogleApiClient, String, String)>
	//    5    7:areturn         
	}

	public PendingResult unregisterForSessions(GoogleApiClient googleapiclient, PendingIntent pendingintent)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zzaok.zzc(googleapiclient, pendingintent) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzaok)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzaok>
			//    3    5:invokevirtual   #28  <Method void zza(zzaok)>
			//    4    8:return          
			}

			protected void zza(zzaok zzaok1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #31  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #34  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaoz)zzaok1.zzxD()).zza(new zzbh(zzaVc, ((zzapf) (zzapr1))));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #38  <Method android.os.IInterface zzaok.zzxD()>
			//    7   13:checkcast       #40  <Class zzaoz>
			//    8   16:new             #42  <Class zzbh>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field PendingIntent zzaVc>
			//   12   24:aload_2         
			//   13   25:invokespecial   #45  <Method void zzbh(PendingIntent, zzapf)>
			//   14   28:invokeinterface #48  <Method void zzaoz.zza(zzbh)>
			//   15   33:return          
			}

			final PendingIntent zzaVc;

			
			{
				zzaVc = pendingintent;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field PendingIntent zzaVc>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaok$zzc(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #18  <Class zzapq$6>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #99  <Method void zzapq$6(zzapq, GoogleApiClient, PendingIntent)>
	//    7   11:invokevirtual   #38  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult zza(GoogleApiClient googleapiclient, PendingIntent pendingintent, int i)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zzaok.zzc(googleapiclient, pendingintent, i) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzaok)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #28  <Class zzaok>
			//    3    5:invokevirtual   #31  <Method void zza(zzaok)>
			//    4    8:return          
			}

			protected void zza(zzaok zzaok1)
				throws RemoteException
			{
				zzapr zzapr1 = new zzapr(((zzaad.zzb) (this)));
			//    0    0:new             #34  <Class zzapr>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #37  <Method void zzapr(zzaad$zzb)>
			//    4    8:astore_2        
				((zzaoz)zzaok1.zzxD()).zza(new zzbb(zzaVc, ((zzapf) (zzapr1)), zzaVl));
			//    5    9:aload_1         
			//    6   10:invokevirtual   #41  <Method android.os.IInterface zzaok.zzxD()>
			//    7   13:checkcast       #43  <Class zzaoz>
			//    8   16:new             #45  <Class zzbb>
			//    9   19:dup             
			//   10   20:aload_0         
			//   11   21:getfield        #17  <Field PendingIntent zzaVc>
			//   12   24:aload_2         
			//   13   25:aload_0         
			//   14   26:getfield        #19  <Field int zzaVl>
			//   15   29:invokespecial   #48  <Method void zzbb(PendingIntent, zzapf, int)>
			//   16   32:invokeinterface #51  <Method void zzaoz.zza(zzbb)>
			//   17   37:return          
			}

			final PendingIntent zzaVc;
			final int zzaVl;

			
			{
				zzaVc = pendingintent;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #17  <Field PendingIntent zzaVc>
				zzaVl = i;
			//    3    5:aload_0         
			//    4    6:iload           4
			//    5    8:putfield        #19  <Field int zzaVl>
				super(googleapiclient);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:invokespecial   #22  <Method void zzaok$zzc(GoogleApiClient)>
			//    9   16:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #16  <Class zzapq$5>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:invokespecial   #102 <Method void zzapq$5(zzapq, GoogleApiClient, PendingIntent, int)>
	//    8   12:invokevirtual   #38  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    9   15:areturn         
	}
}
