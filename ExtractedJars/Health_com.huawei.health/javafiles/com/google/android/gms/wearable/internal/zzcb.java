// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcv, zzb, zzm, zzcx

public final class zzcb
	implements NodeApi
{
	public static class zza
		implements com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult
	{

		public List getNodes()
		{
			return zzbUL;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field List zzbUL>
		//    2    4:areturn         
		}

		public Status getStatus()
		{
			return zzair;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Status zzair>
		//    2    4:areturn         
		}

		private final Status zzair;
		private final List zzbUL;

		public zza(Status status, List list)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			zzair = status;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field Status zzair>
			zzbUL = list;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field List zzbUL>
		//    8   14:return          
		}
	}

	public static class zzb
		implements com.google.android.gms.wearable.NodeApi.GetLocalNodeResult
	{

		public Node getNode()
		{
			return zzbUM;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Node zzbUM>
		//    2    4:areturn         
		}

		public Status getStatus()
		{
			return zzair;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Status zzair>
		//    2    4:areturn         
		}

		private final Status zzair;
		private final Node zzbUM;

		public zzb(Status status, Node node)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			zzair = status;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Status zzair>
			zzbUM = node;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field Node zzbUM>
		//    8   14:return          
		}
	}


	public zzcb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	private static zzb.zza zza(IntentFilter aintentfilter[])
	{
		return new zzb.zza(aintentfilter) {

			public void zza(zzcx zzcx1, com.google.android.gms.internal.zzaad.zzb zzb1, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener, zzabh zzabh)
				throws RemoteException
			{
				zzcx1.zza(zzb1, nodelistener, zzabh, zzbTK);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:aload_3         
			//    3    3:aload           4
			//    4    5:aload_0         
			//    5    6:getfield        #18  <Field IntentFilter[] zzbTK>
			//    6    9:invokevirtual   #30  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.NodeApi$NodeListener, zzabh, IntentFilter[])>
			//    7   12:return          
			}

			public volatile void zza(zzcx zzcx1, com.google.android.gms.internal.zzaad.zzb zzb1, Object obj, zzabh zzabh)
				throws RemoteException
			{
				zza(zzcx1, zzb1, (com.google.android.gms.wearable.NodeApi.NodeListener)obj, zzabh);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aload_3         
			//    4    4:checkcast       #36  <Class com.google.android.gms.wearable.NodeApi$NodeListener>
			//    5    7:aload           4
			//    6    9:invokevirtual   #38  <Method void zza(zzcx, com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.NodeApi$NodeListener, zzabh)>
			//    7   12:return          
			}

			final IntentFilter zzbTK[];

			
			{
				zzbTK = aintentfilter;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field IntentFilter[] zzbTK>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #12  <Class zzcb$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #29  <Method void zzcb$3(IntentFilter[])>
	//    4    8:areturn         
	}

	public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
	{
		return com.google.android.gms.wearable.internal.zzb.zza(googleapiclient, zza(new IntentFilter[] {
			zzcv.zzip("com.google.android.gms.wearable.NODE_CHANGED")
		}), ((Object) (nodelistener)));
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:anewarray       IntentFilter[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:ldc1            #37  <String "com.google.android.gms.wearable.NODE_CHANGED">
	//    6    9:invokestatic    #43  <Method IntentFilter zzcv.zzip(String)>
	//    7   12:aastore         
	//    8   13:invokestatic    #45  <Method zzb$zza zza(IntentFilter[])>
	//    9   16:aload_2         
	//   10   17:invokestatic    #50  <Method PendingResult zzb.zza(GoogleApiClient, zzb$zza, Object)>
	//   11   20:areturn         
	}

	public PendingResult getConnectedNodes(GoogleApiClient googleapiclient)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #22  <Class zzcx>
			//    3    5:invokevirtual   #25  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zzy(((com.google.android.gms.internal.zzaad.zzb) (this)));
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:invokevirtual   #30  <Method void zzcx.zzy(com.google.android.gms.internal.zzaad$zzb)>
			//    3    5:return          
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzcc(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #36  <Method com.google.android.gms.wearable.NodeApi$GetConnectedNodesResult zzcc(Status)>
			//    3    5:areturn         
			}

			protected com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult zzcc(Status status)
			{
				return ((com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult) (new zza(status, ((List) (new ArrayList())))));
			//    0    0:new             #38  <Class zzcb$zza>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:new             #40  <Class ArrayList>
			//    4    8:dup             
			//    5    9:invokespecial   #43  <Method void ArrayList()>
			//    6   12:invokespecial   #46  <Method void zzcb$zza(Status, List)>
			//    7   15:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:invokespecial   #15  <Method void zzm(GoogleApiClient)>
			//    3    5:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #10  <Class zzcb$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #56  <Method void zzcb$2(zzcb, GoogleApiClient)>
	//    6   10:invokevirtual   #61  <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//    7   13:areturn         
	}

	public PendingResult getLocalNode(GoogleApiClient googleapiclient)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #22  <Class zzcx>
			//    3    5:invokevirtual   #25  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zzx(((com.google.android.gms.internal.zzaad.zzb) (this)));
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:invokevirtual   #30  <Method void zzcx.zzx(com.google.android.gms.internal.zzaad$zzb)>
			//    3    5:return          
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzcb(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #36  <Method com.google.android.gms.wearable.NodeApi$GetLocalNodeResult zzcb(Status)>
			//    3    5:areturn         
			}

			protected com.google.android.gms.wearable.NodeApi.GetLocalNodeResult zzcb(Status status)
			{
				return ((com.google.android.gms.wearable.NodeApi.GetLocalNodeResult) (new zzb(status, ((Node) (null)))));
			//    0    0:new             #38  <Class zzcb$zzb>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #41  <Method void zzcb$zzb(Status, Node)>
			//    5    9:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:invokespecial   #15  <Method void zzm(GoogleApiClient)>
			//    3    5:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #8   <Class zzcb$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #64  <Method void zzcb$1(zzcb, GoogleApiClient)>
	//    6   10:invokevirtual   #61  <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//    7   13:areturn         
	}

	public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, nodelistener) {

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
				zzcx1.zza(((com.google.android.gms.internal.zzaad.zzb) (this)), zzbUK);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #16  <Field com.google.android.gms.wearable.NodeApi$NodeListener zzbUK>
			//    4    6:invokevirtual   #33  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.NodeApi$NodeListener)>
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

			final com.google.android.gms.wearable.NodeApi.NodeListener zzbUK;

			
			{
				zzbUK = nodelistener;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #16  <Field com.google.android.gms.wearable.NodeApi$NodeListener zzbUK>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #14  <Class zzcb$4>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #69  <Method void zzcb$4(zzcb, GoogleApiClient, com.google.android.gms.wearable.NodeApi$NodeListener)>
	//    7   11:invokevirtual   #61  <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//    8   14:areturn         
	}
}
