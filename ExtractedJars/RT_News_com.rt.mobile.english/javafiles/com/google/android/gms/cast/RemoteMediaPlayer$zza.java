// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.cast.zzdl;

// Referenced classes of package com.google.android.gms.cast:
//			RemoteMediaPlayer, Cast, zzbm

private final class RemoteMediaPlayer$zza
	implements zzdl
{

	public final void zza(GoogleApiClient googleapiclient)
	{
		zzfy = googleapiclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field GoogleApiClient zzfy>
	//    3    5:return          
	}

	public final void zza(String s, String s1, long l, String s2)
	{
		if(zzfy == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field GoogleApiClient zzfy>
	//*   2    4:ifnonnull       17
		{
			throw new IllegalStateException("No GoogleApiClient available");
	//    3    7:new             #31  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #33  <String "No GoogleApiClient available">
	//    6   13:invokespecial   #36  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		} else
		{
			Cast.CastApi.sendMessage(zzfy, s, s1).setResultCallback(((com.google.android.gms.common.api.ResultCallback) (new zzbm(this, l))));
	//    8   17:getstatic       #42  <Field Cast$CastApi Cast.CastApi>
	//    9   20:aload_0         
	//   10   21:getfield        #28  <Field GoogleApiClient zzfy>
	//   11   24:aload_1         
	//   12   25:aload_2         
	//   13   26:invokeinterface #48  <Method PendingResult Cast$CastApi.sendMessage(GoogleApiClient, String, String)>
	//   14   31:new             #50  <Class zzbm>
	//   15   34:dup             
	//   16   35:aload_0         
	//   17   36:lload_3         
	//   18   37:invokespecial   #53  <Method void zzbm(RemoteMediaPlayer$zza, long)>
	//   19   40:invokevirtual   #59  <Method void PendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback)>
			return;
	//   20   43:return          
		}
	}

	public final long zzl()
	{
		long l = zzfz + 1L;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field long zzfz>
	//    2    4:lconst_1        
	//    3    5:ladd            
	//    4    6:lstore_1        
		zzfz = l;
	//    5    7:aload_0         
	//    6    8:lload_1         
	//    7    9:putfield        #24  <Field long zzfz>
		return l;
	//    8   12:lload_1         
	//    9   13:lreturn         
	}

	final RemoteMediaPlayer zzfa;
	private GoogleApiClient zzfy;
	private long zzfz;

	public RemoteMediaPlayer$zza(RemoteMediaPlayer remotemediaplayer)
	{
		zzfa = remotemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RemoteMediaPlayer zzfa>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		zzfz = 0L;
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:putfield        #24  <Field long zzfz>
	//    8   14:return          
	}
}
