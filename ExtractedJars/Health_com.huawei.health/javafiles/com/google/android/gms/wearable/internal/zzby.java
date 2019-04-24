// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.wearable.MessageApi;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcv, zzm, zzcx

public final class zzby
	implements MessageApi
{
	static final class zza extends zzm
	{

		public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
			throws RemoteException
		{
			zza((zzcx)zzb1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #48  <Class zzcx>
		//    3    5:invokevirtual   #51  <Method void zza(zzcx)>
		//    4    8:return          
		}

		protected void zza(zzcx zzcx1)
			throws RemoteException
		{
			zzcx1.zza(((com.google.android.gms.internal.zzaad.zzb) (this)), zzbUI, zzaDf, zzbUJ);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:aload_0         
		//    3    3:getfield        #30  <Field com.google.android.gms.wearable.MessageApi$MessageListener zzbUI>
		//    4    6:aload_0         
		//    5    7:getfield        #34  <Field zzabh zzaDf>
		//    6   10:aload_0         
		//    7   11:getfield        #37  <Field IntentFilter[] zzbUJ>
		//    8   14:invokevirtual   #55  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.MessageApi$MessageListener, zzabh, IntentFilter[])>
			zzbUI = null;
		//    9   17:aload_0         
		//   10   18:aconst_null     
		//   11   19:putfield        #30  <Field com.google.android.gms.wearable.MessageApi$MessageListener zzbUI>
			zzaDf = null;
		//   12   22:aload_0         
		//   13   23:aconst_null     
		//   14   24:putfield        #34  <Field zzabh zzaDf>
			zzbUJ = null;
		//   15   27:aload_0         
		//   16   28:aconst_null     
		//   17   29:putfield        #37  <Field IntentFilter[] zzbUJ>
		//   18   32:return          
		}

		public Status zzb(Status status)
		{
			zzbUI = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #30  <Field com.google.android.gms.wearable.MessageApi$MessageListener zzbUI>
			zzaDf = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #34  <Field zzabh zzaDf>
			zzbUJ = null;
		//    6   10:aload_0         
		//    7   11:aconst_null     
		//    8   12:putfield        #37  <Field IntentFilter[] zzbUJ>
			return status;
		//    9   15:aload_1         
		//   10   16:areturn         
		}

		public Result zzc(Status status)
		{
			return ((Result) (zzb(status)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #61  <Method Status zzb(Status)>
		//    3    5:areturn         
		}

		private zzabh zzaDf;
		private com.google.android.gms.wearable.MessageApi.MessageListener zzbUI;
		private IntentFilter zzbUJ[];

		private zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, zzabh zzabh1, IntentFilter aintentfilter[])
		{
			super(googleapiclient);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #20  <Method void zzm(GoogleApiClient)>
			zzbUI = (com.google.android.gms.wearable.MessageApi.MessageListener)zzac.zzw(((Object) (messagelistener)));
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokestatic    #26  <Method Object zzac.zzw(Object)>
		//    6   10:checkcast       #28  <Class com.google.android.gms.wearable.MessageApi$MessageListener>
		//    7   13:putfield        #30  <Field com.google.android.gms.wearable.MessageApi$MessageListener zzbUI>
			zzaDf = (zzabh)zzac.zzw(((Object) (zzabh1)));
		//    8   16:aload_0         
		//    9   17:aload_3         
		//   10   18:invokestatic    #26  <Method Object zzac.zzw(Object)>
		//   11   21:checkcast       #32  <Class zzabh>
		//   12   24:putfield        #34  <Field zzabh zzaDf>
			zzbUJ = (IntentFilter[])zzac.zzw(((Object) (aintentfilter)));
		//   13   27:aload_0         
		//   14   28:aload           4
		//   15   30:invokestatic    #26  <Method Object zzac.zzw(Object)>
		//   16   33:checkcast       #35  <Class IntentFilter[]>
		//   17   36:putfield        #37  <Field IntentFilter[] zzbUJ>
		//   18   39:return          
		}

	}

	public static class zzb
		implements com.google.android.gms.wearable.MessageApi.SendMessageResult
	{

		public int getRequestId()
		{
			return zzaKE;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field int zzaKE>
		//    2    4:ireturn         
		}

		public Status getStatus()
		{
			return zzair;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Status zzair>
		//    2    4:areturn         
		}

		private final int zzaKE;
		private final Status zzair;

		public zzb(Status status, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			zzair = status;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Status zzair>
			zzaKE = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int zzaKE>
		//    8   14:return          
		}
	}


	public zzby()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	private PendingResult zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zza(googleapiclient, messagelistener, googleapiclient.zzr(((Object) (messagelistener))), aintentfilter))))));
	//    0    0:aload_1         
	//    1    1:new             #12  <Class zzby$zza>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #28  <Method zzabh GoogleApiClient.zzr(Object)>
	//    8   12:aload_3         
	//    9   13:aconst_null     
	//   10   14:invokespecial   #31  <Method void zzby$zza(GoogleApiClient, com.google.android.gms.wearable.MessageApi$MessageListener, zzabh, IntentFilter[], zzby$1)>
	//   11   17:invokevirtual   #34  <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//   12   20:areturn         
	}

	public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
	{
		return zza(googleapiclient, messagelistener, new IntentFilter[] {
			zzcv.zzip("com.google.android.gms.wearable.MESSAGE_RECEIVED")
		});
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:anewarray       IntentFilter[]
	//    5    7:dup             
	//    6    8:iconst_0        
	//    7    9:ldc1            #42  <String "com.google.android.gms.wearable.MESSAGE_RECEIVED">
	//    8   11:invokestatic    #48  <Method IntentFilter zzcv.zzip(String)>
	//    9   14:aastore         
	//   10   15:invokespecial   #50  <Method PendingResult zza(GoogleApiClient, com.google.android.gms.wearable.MessageApi$MessageListener, IntentFilter[])>
	//   11   18:areturn         
	}

	public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, Uri uri, int i)
	{
		boolean flag;
		if(uri != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          10
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore          5
		else
	//*   4    7:goto            13
			flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          5
		zzac.zzb(flag, "uri must not be null");
	//    7   13:iload           5
	//    8   15:ldc1            #54  <String "uri must not be null">
	//    9   17:invokestatic    #59  <Method void zzac.zzb(boolean, Object)>
		if(i == 0 || i == 1)
	//*  10   20:iload           4
	//*  11   22:ifeq            31
	//*  12   25:iload           4
	//*  13   27:iconst_1        
	//*  14   28:icmpne          37
			flag = true;
	//   15   31:iconst_1        
	//   16   32:istore          5
		else
	//*  17   34:goto            40
			flag = false;
	//   18   37:iconst_0        
	//   19   38:istore          5
		zzac.zzb(flag, "invalid filter type");
	//   20   40:iload           5
	//   21   42:ldc1            #61  <String "invalid filter type">
	//   22   44:invokestatic    #59  <Method void zzac.zzb(boolean, Object)>
		return zza(googleapiclient, messagelistener, new IntentFilter[] {
			zzcv.zza("com.google.android.gms.wearable.MESSAGE_RECEIVED", uri, i)
		});
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:aload_2         
	//   26   50:iconst_1        
	//   27   51:anewarray       IntentFilter[]
	//   28   54:dup             
	//   29   55:iconst_0        
	//   30   56:ldc1            #42  <String "com.google.android.gms.wearable.MESSAGE_RECEIVED">
	//   31   58:aload_3         
	//   32   59:iload           4
	//   33   61:invokestatic    #64  <Method IntentFilter zzcv.zza(String, Uri, int)>
	//   34   64:aastore         
	//   35   65:invokespecial   #50  <Method PendingResult zza(GoogleApiClient, com.google.android.gms.wearable.MessageApi$MessageListener, IntentFilter[])>
	//   36   68:areturn         
	}

	public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, messagelistener) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class zzcx>
			//    3    5:invokevirtual   #29  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zza(((com.google.android.gms.internal.zzaad.zzb) (this)), zzbUH);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #16  <Field com.google.android.gms.wearable.MessageApi$MessageListener zzbUH>
			//    4    6:invokevirtual   #33  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.MessageApi$MessageListener)>
			//    5    9:return          
			}

			public Status zzb(Status status)
			{
				return status;
			//    0    0:aload_1         
			//    1    1:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzb(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #39  <Method Status zzb(Status)>
			//    3    5:areturn         
			}

			final com.google.android.gms.wearable.MessageApi.MessageListener zzbUH;

			
			{
				zzbUH = messagelistener;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #16  <Field com.google.android.gms.wearable.MessageApi$MessageListener zzbUH>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #10  <Class zzby$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #69  <Method void zzby$2(zzby, GoogleApiClient, com.google.android.gms.wearable.MessageApi$MessageListener)>
	//    7   11:invokevirtual   #34  <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1, byte abyte0[])
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, s, s1, abyte0) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #33  <Class zzcx>
			//    3    5:invokevirtual   #36  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zza(((com.google.android.gms.internal.zzaad.zzb) (this)), zzbTR, zzbUG, zzbMo);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #19  <Field String zzbTR>
			//    4    6:aload_0         
			//    5    7:getfield        #21  <Field String zzbUG>
			//    6   10:aload_0         
			//    7   11:getfield        #23  <Field byte[] zzbMo>
			//    8   14:invokevirtual   #40  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, String, String, byte[])>
			//    9   17:return          
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzca(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #46  <Method com.google.android.gms.wearable.MessageApi$SendMessageResult zzca(Status)>
			//    3    5:areturn         
			}

			protected com.google.android.gms.wearable.MessageApi.SendMessageResult zzca(Status status)
			{
				return ((com.google.android.gms.wearable.MessageApi.SendMessageResult) (new zzb(status, -1)));
			//    0    0:new             #48  <Class zzby$zzb>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:iconst_m1       
			//    4    6:invokespecial   #51  <Method void zzby$zzb(Status, int)>
			//    5    9:areturn         
			}

			final byte zzbMo[];
			final String zzbTR;
			final String zzbUG;

			
			{
				zzbTR = s;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #19  <Field String zzbTR>
				zzbUG = s1;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #21  <Field String zzbUG>
				zzbMo = abyte0;
			//    6   11:aload_0         
			//    7   12:aload           5
			//    8   14:putfield        #23  <Field byte[] zzbMo>
				super(googleapiclient);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:invokespecial   #26  <Method void zzm(GoogleApiClient)>
			//   12   22:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #8   <Class zzby$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:aload           4
	//    8   11:invokespecial   #74  <Method void zzby$1(zzby, GoogleApiClient, String, String, byte[])>
	//    9   14:invokevirtual   #34  <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//   10   17:areturn         
	}
}
