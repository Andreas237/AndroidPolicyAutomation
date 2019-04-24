// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.location.ActivityRecognitionApi;

// Referenced classes of package com.google.android.gms.internal:
//			zzash

public class zzaru
	implements ActivityRecognitionApi
{
	static abstract class zza extends com.google.android.gms.location.ActivityRecognition.zza
	{

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
		//    2    2:invokevirtual   #19  <Method Status zzb(Status)>
		//    3    5:areturn         
		}

		public zza(GoogleApiClient googleapiclient)
		{
			super(googleapiclient);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void com.google.android.gms.location.ActivityRecognition$zza(GoogleApiClient)>
		//    3    5:return          
		}
	}


	public zzaru()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public PendingResult removeActivityUpdates(GoogleApiClient googleapiclient, PendingIntent pendingintent)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zza(googleapiclient, pendingintent) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzash)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class zzash>
			//    3    5:invokevirtual   #28  <Method void zza(zzash)>
			//    4    8:return          
			}

			protected void zza(zzash zzash1)
				throws RemoteException
			{
				zzash1.zzc(zzbkr);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #15  <Field PendingIntent zzbkr>
			//    3    5:invokevirtual   #33  <Method void zzash.zzc(PendingIntent)>
				zzb(((Result) (Status.zzazx)));
			//    4    8:aload_0         
			//    5    9:getstatic       #39  <Field Status Status.zzazx>
			//    6   12:invokevirtual   #43  <Method void zzb(Result)>
			//    7   15:return          
			}

			final PendingIntent zzbkr;

			
			{
				zzbkr = pendingintent;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field PendingIntent zzbkr>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaru$zza(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #10  <Class zzaru$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #23  <Method void zzaru$2(zzaru, GoogleApiClient, PendingIntent)>
	//    7   11:invokevirtual   #29  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult requestActivityUpdates(GoogleApiClient googleapiclient, long l, PendingIntent pendingintent)
	{
		return ((PendingResult) (googleapiclient.zzb(((zzaad.zza) (new zza(googleapiclient, l, pendingintent) {

			protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
				throws RemoteException
			{
				zza((zzash)zzb);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #29  <Class zzash>
			//    3    5:invokevirtual   #32  <Method void zza(zzash)>
			//    4    8:return          
			}

			protected void zza(zzash zzash1)
				throws RemoteException
			{
				zzash1.zza(zzbkq, zzbkr);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #17  <Field long zzbkq>
			//    3    5:aload_0         
			//    4    6:getfield        #19  <Field PendingIntent zzbkr>
			//    5    9:invokevirtual   #36  <Method void zzash.zza(long, PendingIntent)>
				zzb(((Result) (Status.zzazx)));
			//    6   12:aload_0         
			//    7   13:getstatic       #42  <Field Status Status.zzazx>
			//    8   16:invokevirtual   #46  <Method void zzb(Result)>
			//    9   19:return          
			}

			final long zzbkq;
			final PendingIntent zzbkr;

			
			{
				zzbkq = l;
			//    0    0:aload_0         
			//    1    1:lload_3         
			//    2    2:putfield        #17  <Field long zzbkq>
				zzbkr = pendingintent;
			//    3    5:aload_0         
			//    4    6:aload           5
			//    5    8:putfield        #19  <Field PendingIntent zzbkr>
				super(googleapiclient);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:invokespecial   #22  <Method void zzaru$zza(GoogleApiClient)>
			//    9   16:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #8   <Class zzaru$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:lload_2         
	//    6    8:aload           4
	//    7   10:invokespecial   #36  <Method void zzaru$1(zzaru, GoogleApiClient, long, PendingIntent)>
	//    8   13:invokevirtual   #29  <Method zzaad$zza GoogleApiClient.zzb(zzaad$zza)>
	//    9   16:areturn         
	}
}
