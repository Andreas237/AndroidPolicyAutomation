// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.internal.cast.*;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			zzap, MediaStatus, MediaQueueItem, zzba, 
//			zzbf, zzbh, zzau, zzat, 
//			zzbd, zzas, zzbe, zzaz, 
//			zzay, zzbc, zzaw, zzax, 
//			zzbb, zzav, zzbl, zzbi, 
//			zzaq, zzbk, zzbj, zzar, 
//			zzbg, MediaInfo, CastDevice, TextTrackStyle, 
//			Cast, zzbm, zzbn, zzbo

public class RemoteMediaPlayer
	implements Cast.MessageReceivedCallback
{
	public static interface MediaChannelResult
		extends Result
	{

		public abstract JSONObject getCustomData();
	}

	public static interface OnMetadataUpdatedListener
	{

		public abstract void onMetadataUpdated();
	}

	public static interface OnPreloadStatusUpdatedListener
	{

		public abstract void onPreloadStatusUpdated();
	}

	public static interface OnQueueStatusUpdatedListener
	{

		public abstract void onQueueStatusUpdated();
	}

	public static interface OnStatusUpdatedListener
	{

		public abstract void onStatusUpdated();
	}

	private final class zza
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

		public zza()
		{
			zzfa = RemoteMediaPlayer.this;
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

	static class zzb extends zzcf
	{

		public Result createFailedResult(Status status)
		{
			return ((Result) (new zzbo(this, status)));
		//    0    0:new             #27  <Class zzbo>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #30  <Method void zzbo(RemoteMediaPlayer$zzb, Status)>
		//    5    9:areturn         
		}

		protected void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
			throws RemoteException
		{
			zza((zzcn)anyclient);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #36  <Class zzcn>
		//    3    5:invokevirtual   #40  <Method void zza(zzcn)>
		//    4    8:return          
		}

		protected void zza(zzcn zzcn1)
		{
		//    0    0:return          
		}

		zzdm zzgc;

		zzb(GoogleApiClient googleapiclient)
		{
			super(googleapiclient);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #15  <Method void zzcf(GoogleApiClient)>
			zzgc = ((zzdm) (new zzbn(this)));
		//    3    5:aload_0         
		//    4    6:new             #17  <Class zzbn>
		//    5    9:dup             
		//    6   10:aload_0         
		//    7   11:invokespecial   #20  <Method void zzbn(RemoteMediaPlayer$zzb)>
		//    8   14:putfield        #22  <Field zzdm zzgc>
		//    9   17:return          
		}
	}

	private static final class zzc
		implements MediaChannelResult
	{

		public final JSONObject getCustomData()
		{
			return zzp;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field JSONObject zzp>
		//    2    4:areturn         
		}

		public final Status getStatus()
		{
			return zzge;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Status zzge>
		//    2    4:areturn         
		}

		private final Status zzge;
		private final JSONObject zzp;

		zzc(Status status, JSONObject jsonobject)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			zzge = status;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Status zzge>
			zzp = jsonobject;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field JSONObject zzp>
		//    8   14:return          
		}
	}


	public RemoteMediaPlayer()
	{
		this(new zzdh(((String) (null))));
	//    0    0:aload_0         
	//    1    1:new             #70  <Class zzdh>
	//    2    4:dup             
	//    3    5:aconst_null     
	//    4    6:invokespecial   #78  <Method void zzdh(String)>
	//    5    9:invokespecial   #81  <Method void RemoteMediaPlayer(zzdh)>
	//    6   12:return          
	}

	private RemoteMediaPlayer(zzdh zzdh1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void Object()>
		lock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #84  <Method void Object()>
	//    6   12:putfield        #86  <Field Object lock>
		zzeu = zzdh1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #88  <Field zzdh zzeu>
		zzeu.zza(((com.google.android.gms.internal.cast.zzdj) (new zzap(this))));
	//   10   20:aload_0         
	//   11   21:getfield        #88  <Field zzdh zzeu>
	//   12   24:new             #90  <Class zzap>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #93  <Method void zzap(RemoteMediaPlayer)>
	//   16   32:invokevirtual   #96  <Method void zzdh.zza(com.google.android.gms.internal.cast.zzdj)>
		zzev = new zza();
	//   17   35:aload_0         
	//   18   36:new             #23  <Class RemoteMediaPlayer$zza>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:invokespecial   #97  <Method void RemoteMediaPlayer$zza(RemoteMediaPlayer)>
	//   22   44:putfield        #99  <Field RemoteMediaPlayer$zza zzev>
		((zzcm) (zzeu)).zza(((zzdl) (zzev)));
	//   23   47:aload_0         
	//   24   48:getfield        #88  <Field zzdh zzeu>
	//   25   51:aload_0         
	//   26   52:getfield        #99  <Field RemoteMediaPlayer$zza zzev>
	//   27   55:invokevirtual   #104 <Method void zzcm.zza(zzdl)>
	//   28   58:return          
	}

	private final void onMetadataUpdated()
	{
		if(zzey != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field RemoteMediaPlayer$OnMetadataUpdatedListener zzey>
	//*   2    4:ifnull          16
			zzey.onMetadataUpdated();
	//    3    7:aload_0         
	//    4    8:getfield        #108 <Field RemoteMediaPlayer$OnMetadataUpdatedListener zzey>
	//    5   11:invokeinterface #110 <Method void RemoteMediaPlayer$OnMetadataUpdatedListener.onMetadataUpdated()>
	//    6   16:return          
	}

	private final void onPreloadStatusUpdated()
	{
		if(zzew != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field RemoteMediaPlayer$OnPreloadStatusUpdatedListener zzew>
	//*   2    4:ifnull          16
			zzew.onPreloadStatusUpdated();
	//    3    7:aload_0         
	//    4    8:getfield        #113 <Field RemoteMediaPlayer$OnPreloadStatusUpdatedListener zzew>
	//    5   11:invokeinterface #115 <Method void RemoteMediaPlayer$OnPreloadStatusUpdatedListener.onPreloadStatusUpdated()>
	//    6   16:return          
	}

	private final void onQueueStatusUpdated()
	{
		if(zzex != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field RemoteMediaPlayer$OnQueueStatusUpdatedListener zzex>
	//*   2    4:ifnull          16
			zzex.onQueueStatusUpdated();
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field RemoteMediaPlayer$OnQueueStatusUpdatedListener zzex>
	//    5   11:invokeinterface #120 <Method void RemoteMediaPlayer$OnQueueStatusUpdatedListener.onQueueStatusUpdated()>
	//    6   16:return          
	}

	private final void onStatusUpdated()
	{
		if(zzez != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #123 <Field RemoteMediaPlayer$OnStatusUpdatedListener zzez>
	//*   2    4:ifnull          16
			zzez.onStatusUpdated();
	//    3    7:aload_0         
	//    4    8:getfield        #123 <Field RemoteMediaPlayer$OnStatusUpdatedListener zzez>
	//    5   11:invokeinterface #125 <Method void RemoteMediaPlayer$OnStatusUpdatedListener.onStatusUpdated()>
	//    6   16:return          
	}

	static int zza(RemoteMediaPlayer remotemediaplayer, int i)
	{
		return remotemediaplayer.zzc(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #129 <Method int zzc(int)>
	//    3    5:ireturn         
	}

	static void zza(RemoteMediaPlayer remotemediaplayer)
	{
		remotemediaplayer.onStatusUpdated();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void onStatusUpdated()>
	//    2    4:return          
	}

	static void zzb(RemoteMediaPlayer remotemediaplayer)
	{
		remotemediaplayer.onMetadataUpdated();
	//    0    0:aload_0         
	//    1    1:invokespecial   #131 <Method void onMetadataUpdated()>
	//    2    4:return          
	}

	private final int zzc(int i)
	{
		MediaStatus mediastatus = getMediaStatus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method MediaStatus getMediaStatus()>
	//    2    4:astore_3        
		for(int j = 0; j < mediastatus.getQueueItemCount(); j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_3         
	//*   7    9:invokevirtual   #141 <Method int MediaStatus.getQueueItemCount()>
	//*   8   12:icmpge          36
			if(mediastatus.getQueueItem(j).getItemId() == i)
	//*   9   15:aload_3         
	//*  10   16:iload_2         
	//*  11   17:invokevirtual   #145 <Method MediaQueueItem MediaStatus.getQueueItem(int)>
	//*  12   20:invokevirtual   #150 <Method int MediaQueueItem.getItemId()>
	//*  13   23:iload_1         
	//*  14   24:icmpne          29
				return j;
	//   15   27:iload_2         
	//   16   28:ireturn         

	//   17   29:iload_2         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_2        
	//*  21   33:goto            7
		return -1;
	//   22   36:iconst_m1       
	//   23   37:ireturn         
	}

	static void zzc(RemoteMediaPlayer remotemediaplayer)
	{
		remotemediaplayer.onQueueStatusUpdated();
	//    0    0:aload_0         
	//    1    1:invokespecial   #151 <Method void onQueueStatusUpdated()>
	//    2    4:return          
	}

	static void zzd(RemoteMediaPlayer remotemediaplayer)
	{
		remotemediaplayer.onPreloadStatusUpdated();
	//    0    0:aload_0         
	//    1    1:invokespecial   #153 <Method void onPreloadStatusUpdated()>
	//    2    4:return          
	}

	static Object zze(RemoteMediaPlayer remotemediaplayer)
	{
		return remotemediaplayer.lock;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field Object lock>
	//    2    4:areturn         
	}

	static zza zzf(RemoteMediaPlayer remotemediaplayer)
	{
		return remotemediaplayer.zzev;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field RemoteMediaPlayer$zza zzev>
	//    2    4:areturn         
	}

	static zzdh zzg(RemoteMediaPlayer remotemediaplayer)
	{
		return remotemediaplayer.zzeu;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field zzdh zzeu>
	//    2    4:areturn         
	}

	public long getApproximateStreamPosition()
	{
		long l;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field Object lock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			l = zzeu.getApproximateStreamPosition();
	//    5    7:aload_0         
	//    6    8:getfield        #88  <Field zzdh zzeu>
	//    7   11:invokevirtual   #163 <Method long zzdh.getApproximateStreamPosition()>
	//    8   14:lstore_1        
		}
	//    9   15:aload_3         
	//   10   16:monitorexit     
		return l;
	//   11   17:lload_1         
	//   12   18:lreturn         
		exception;
	//   13   19:astore          4
		obj;
	//   14   21:aload_3         
		JVM INSTR monitorexit ;
	//   15   22:monitorexit     
		throw exception;
	//   16   23:aload           4
	//   17   25:athrow          
	}

	public MediaInfo getMediaInfo()
	{
		MediaInfo mediainfo;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			mediainfo = zzeu.getMediaInfo();
	//    5    7:aload_0         
	//    6    8:getfield        #88  <Field zzdh zzeu>
	//    7   11:invokevirtual   #167 <Method MediaInfo zzdh.getMediaInfo()>
	//    8   14:astore_2        
		}
	//    9   15:aload_1         
	//   10   16:monitorexit     
		return mediainfo;
	//   11   17:aload_2         
	//   12   18:areturn         
		exception;
	//   13   19:astore_2        
		obj;
	//   14   20:aload_1         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw exception;
	//   16   22:aload_2         
	//   17   23:athrow          
	}

	public MediaStatus getMediaStatus()
	{
		MediaStatus mediastatus;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			mediastatus = zzeu.getMediaStatus();
	//    5    7:aload_0         
	//    6    8:getfield        #88  <Field zzdh zzeu>
	//    7   11:invokevirtual   #168 <Method MediaStatus zzdh.getMediaStatus()>
	//    8   14:astore_2        
		}
	//    9   15:aload_1         
	//   10   16:monitorexit     
		return mediastatus;
	//   11   17:aload_2         
	//   12   18:areturn         
		exception;
	//   13   19:astore_2        
		obj;
	//   14   20:aload_1         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw exception;
	//   16   22:aload_2         
	//   17   23:athrow          
	}

	public String getNamespace()
	{
		return ((zzcm) (zzeu)).getNamespace();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field zzdh zzeu>
	//    2    4:invokevirtual   #172 <Method String zzcm.getNamespace()>
	//    3    7:areturn         
	}

	public long getStreamDuration()
	{
		long l;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field Object lock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			l = zzeu.getStreamDuration();
	//    5    7:aload_0         
	//    6    8:getfield        #88  <Field zzdh zzeu>
	//    7   11:invokevirtual   #175 <Method long zzdh.getStreamDuration()>
	//    8   14:lstore_1        
		}
	//    9   15:aload_3         
	//   10   16:monitorexit     
		return l;
	//   11   17:lload_1         
	//   12   18:lreturn         
		exception;
	//   13   19:astore          4
		obj;
	//   14   21:aload_3         
		JVM INSTR monitorexit ;
	//   15   22:monitorexit     
		throw exception;
	//   16   23:aload           4
	//   17   25:athrow          
	}

	public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo)
	{
		return load(googleapiclient, mediainfo, true, 0L, ((long []) (null)), ((JSONObject) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:lconst_0        
	//    5    5:aconst_null     
	//    6    6:aconst_null     
	//    7    7:invokevirtual   #180 <Method PendingResult load(GoogleApiClient, MediaInfo, boolean, long, long[], JSONObject)>
	//    8   10:areturn         
	}

	public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag)
	{
		return load(googleapiclient, mediainfo, flag, 0L, ((long []) (null)), ((JSONObject) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:lconst_0        
	//    5    5:aconst_null     
	//    6    6:aconst_null     
	//    7    7:invokevirtual   #180 <Method PendingResult load(GoogleApiClient, MediaInfo, boolean, long, long[], JSONObject)>
	//    8   10:areturn         
	}

	public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag, long l)
	{
		return load(googleapiclient, mediainfo, flag, l, ((long []) (null)), ((JSONObject) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:lload           4
	//    5    6:aconst_null     
	//    6    7:aconst_null     
	//    7    8:invokevirtual   #180 <Method PendingResult load(GoogleApiClient, MediaInfo, boolean, long, long[], JSONObject)>
	//    8   11:areturn         
	}

	public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag, long l, JSONObject jsonobject)
	{
		return load(googleapiclient, mediainfo, flag, l, ((long []) (null)), jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:lload           4
	//    5    6:aconst_null     
	//    6    7:aload           6
	//    7    9:invokevirtual   #180 <Method PendingResult load(GoogleApiClient, MediaInfo, boolean, long, long[], JSONObject)>
	//    8   12:areturn         
	}

	public PendingResult load(GoogleApiClient googleapiclient, MediaInfo mediainfo, boolean flag, long l, long al[], JSONObject jsonobject)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzba(this, googleapiclient, googleapiclient, flag, l, al, jsonobject, mediainfo))))));
	//    0    0:aload_1         
	//    1    1:new             #190 <Class zzba>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:iload_3         
	//    7    9:lload           4
	//    8   11:aload           6
	//    9   13:aload           7
	//   10   15:aload_2         
	//   11   16:invokespecial   #193 <Method void zzba(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, boolean, long, long[], JSONObject, MediaInfo)>
	//   12   19:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   13   22:areturn         
	}

	public void onMessageReceived(CastDevice castdevice, String s, String s1)
	{
		((zzcm) (zzeu)).zzn(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field zzdh zzeu>
	//    2    4:aload_3         
	//    3    5:invokevirtual   #205 <Method void zzcm.zzn(String)>
	//    4    8:return          
	}

	public PendingResult pause(GoogleApiClient googleapiclient)
	{
		return pause(googleapiclient, ((JSONObject) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #210 <Method PendingResult pause(GoogleApiClient, JSONObject)>
	//    4    6:areturn         
	}

	public PendingResult pause(GoogleApiClient googleapiclient, JSONObject jsonobject)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzbf(this, googleapiclient, googleapiclient, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #213 <Class zzbf>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #216 <Method void zzbf(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, JSONObject)>
	//    8   12:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//    9   15:areturn         
	}

	public PendingResult play(GoogleApiClient googleapiclient)
	{
		return play(googleapiclient, ((JSONObject) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #220 <Method PendingResult play(GoogleApiClient, JSONObject)>
	//    4    6:areturn         
	}

	public PendingResult play(GoogleApiClient googleapiclient, JSONObject jsonobject)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzbh(this, googleapiclient, googleapiclient, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #222 <Class zzbh>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #223 <Method void zzbh(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, JSONObject)>
	//    8   12:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//    9   15:areturn         
	}

	public PendingResult queueAppendItem(GoogleApiClient googleapiclient, MediaQueueItem mediaqueueitem, JSONObject jsonobject)
		throws IllegalArgumentException
	{
		return queueInsertItems(googleapiclient, new MediaQueueItem[] {
			mediaqueueitem
		}, 0, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:anewarray       MediaQueueItem[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:aload_2         
	//    7    9:aastore         
	//    8   10:iconst_0        
	//    9   11:aload_3         
	//   10   12:invokevirtual   #231 <Method PendingResult queueInsertItems(GoogleApiClient, MediaQueueItem[], int, JSONObject)>
	//   11   15:areturn         
	}

	public PendingResult queueInsertAndPlayItem(GoogleApiClient googleapiclient, MediaQueueItem mediaqueueitem, int i, long l, JSONObject jsonobject)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzau(this, googleapiclient, googleapiclient, mediaqueueitem, i, l, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #237 <Class zzau>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:iload_3         
	//    8   10:lload           4
	//    9   12:aload           6
	//   10   14:invokespecial   #240 <Method void zzau(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, MediaQueueItem, int, long, JSONObject)>
	//   11   17:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   12   20:areturn         
	}

	public PendingResult queueInsertAndPlayItem(GoogleApiClient googleapiclient, MediaQueueItem mediaqueueitem, int i, JSONObject jsonobject)
	{
		return queueInsertAndPlayItem(googleapiclient, mediaqueueitem, i, -1L, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:ldc2w           #243 <Long -1L>
	//    5    7:aload           4
	//    6    9:invokevirtual   #246 <Method PendingResult queueInsertAndPlayItem(GoogleApiClient, MediaQueueItem, int, long, JSONObject)>
	//    7   12:areturn         
	}

	public PendingResult queueInsertItems(GoogleApiClient googleapiclient, MediaQueueItem amediaqueueitem[], int i, JSONObject jsonobject)
		throws IllegalArgumentException
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzat(this, googleapiclient, googleapiclient, amediaqueueitem, i, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #249 <Class zzat>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:iload_3         
	//    8   10:aload           4
	//    9   12:invokespecial   #252 <Method void zzat(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, MediaQueueItem[], int, JSONObject)>
	//   10   15:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   11   18:areturn         
	}

	public PendingResult queueJumpToItem(GoogleApiClient googleapiclient, int i, long l, JSONObject jsonobject)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzbd(this, googleapiclient, i, googleapiclient, l, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #257 <Class zzbd>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:aload_1         
	//    7    9:lload_3         
	//    8   10:aload           5
	//    9   12:invokespecial   #260 <Method void zzbd(RemoteMediaPlayer, GoogleApiClient, int, GoogleApiClient, long, JSONObject)>
	//   10   15:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   11   18:areturn         
	}

	public PendingResult queueJumpToItem(GoogleApiClient googleapiclient, int i, JSONObject jsonobject)
	{
		return queueJumpToItem(googleapiclient, i, -1L, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:ldc2w           #243 <Long -1L>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #264 <Method PendingResult queueJumpToItem(GoogleApiClient, int, long, JSONObject)>
	//    6   10:areturn         
	}

	public PendingResult queueLoad(GoogleApiClient googleapiclient, MediaQueueItem amediaqueueitem[], int i, int j, long l, JSONObject jsonobject)
		throws IllegalArgumentException
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzas(this, googleapiclient, googleapiclient, amediaqueueitem, i, j, l, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #269 <Class zzas>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:iload_3         
	//    8   10:iload           4
	//    9   12:lload           5
	//   10   14:aload           7
	//   11   16:invokespecial   #272 <Method void zzas(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, MediaQueueItem[], int, int, long, JSONObject)>
	//   12   19:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   13   22:areturn         
	}

	public PendingResult queueLoad(GoogleApiClient googleapiclient, MediaQueueItem amediaqueueitem[], int i, int j, JSONObject jsonobject)
		throws IllegalArgumentException
	{
		return queueLoad(googleapiclient, amediaqueueitem, i, j, -1L, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:ldc2w           #243 <Long -1L>
	//    6    9:aload           5
	//    7   11:invokevirtual   #276 <Method PendingResult queueLoad(GoogleApiClient, MediaQueueItem[], int, int, long, JSONObject)>
	//    8   14:areturn         
	}

	public PendingResult queueMoveItemToNewIndex(GoogleApiClient googleapiclient, int i, int j, JSONObject jsonobject)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzbe(this, googleapiclient, i, j, googleapiclient, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #281 <Class zzbe>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:aload_1         
	//    8   10:aload           4
	//    9   12:invokespecial   #284 <Method void zzbe(RemoteMediaPlayer, GoogleApiClient, int, int, GoogleApiClient, JSONObject)>
	//   10   15:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   11   18:areturn         
	}

	public PendingResult queueNext(GoogleApiClient googleapiclient, JSONObject jsonobject)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzaz(this, googleapiclient, googleapiclient, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #288 <Class zzaz>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #289 <Method void zzaz(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, JSONObject)>
	//    8   12:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//    9   15:areturn         
	}

	public PendingResult queuePrev(GoogleApiClient googleapiclient, JSONObject jsonobject)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzay(this, googleapiclient, googleapiclient, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #292 <Class zzay>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #293 <Method void zzay(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, JSONObject)>
	//    8   12:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//    9   15:areturn         
	}

	public PendingResult queueRemoveItem(GoogleApiClient googleapiclient, int i, JSONObject jsonobject)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzbc(this, googleapiclient, i, googleapiclient, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #296 <Class zzbc>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:aload_1         
	//    7    9:aload_3         
	//    8   10:invokespecial   #299 <Method void zzbc(RemoteMediaPlayer, GoogleApiClient, int, GoogleApiClient, JSONObject)>
	//    9   13:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   10   16:areturn         
	}

	public PendingResult queueRemoveItems(GoogleApiClient googleapiclient, int ai[], JSONObject jsonobject)
		throws IllegalArgumentException
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzaw(this, googleapiclient, googleapiclient, ai, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #303 <Class zzaw>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:aload_3         
	//    8   10:invokespecial   #306 <Method void zzaw(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, int[], JSONObject)>
	//    9   13:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   10   16:areturn         
	}

	public PendingResult queueReorderItems(GoogleApiClient googleapiclient, int ai[], int i, JSONObject jsonobject)
		throws IllegalArgumentException
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzax(this, googleapiclient, googleapiclient, ai, i, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #311 <Class zzax>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:iload_3         
	//    8   10:aload           4
	//    9   12:invokespecial   #314 <Method void zzax(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, int[], int, JSONObject)>
	//   10   15:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   11   18:areturn         
	}

	public PendingResult queueSetRepeatMode(GoogleApiClient googleapiclient, int i, JSONObject jsonobject)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzbb(this, googleapiclient, googleapiclient, i, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #318 <Class zzbb>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:iload_2         
	//    7    9:aload_3         
	//    8   10:invokespecial   #321 <Method void zzbb(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, int, JSONObject)>
	//    9   13:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   10   16:areturn         
	}

	public PendingResult queueUpdateItems(GoogleApiClient googleapiclient, MediaQueueItem amediaqueueitem[], JSONObject jsonobject)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzav(this, googleapiclient, googleapiclient, amediaqueueitem, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #325 <Class zzav>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:aload_3         
	//    8   10:invokespecial   #328 <Method void zzav(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, MediaQueueItem[], JSONObject)>
	//    9   13:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   10   16:areturn         
	}

	public PendingResult requestStatus(GoogleApiClient googleapiclient)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzbl(this, googleapiclient, googleapiclient))))));
	//    0    0:aload_1         
	//    1    1:new             #332 <Class zzbl>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:invokespecial   #335 <Method void zzbl(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient)>
	//    7   11:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//    8   14:areturn         
	}

	public PendingResult seek(GoogleApiClient googleapiclient, long l)
	{
		return seek(googleapiclient, l, 0, ((JSONObject) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:iconst_0        
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #340 <Method PendingResult seek(GoogleApiClient, long, int, JSONObject)>
	//    6    8:areturn         
	}

	public PendingResult seek(GoogleApiClient googleapiclient, long l, int i)
	{
		return seek(googleapiclient, l, i, ((JSONObject) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:iload           4
	//    4    5:aconst_null     
	//    5    6:invokevirtual   #340 <Method PendingResult seek(GoogleApiClient, long, int, JSONObject)>
	//    6    9:areturn         
	}

	public PendingResult seek(GoogleApiClient googleapiclient, long l, int i, JSONObject jsonobject)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzbi(this, googleapiclient, googleapiclient, l, i, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #345 <Class zzbi>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:lload_2         
	//    7    9:iload           4
	//    8   11:aload           5
	//    9   13:invokespecial   #348 <Method void zzbi(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, long, int, JSONObject)>
	//   10   16:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   11   19:areturn         
	}

	public PendingResult setActiveMediaTracks(GoogleApiClient googleapiclient, long al[])
	{
		if(al == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("trackIds cannot be null");
	//    2    4:new             #227 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #353 <String "trackIds cannot be null">
	//    5   11:invokespecial   #354 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		else
			return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzaq(this, googleapiclient, googleapiclient, al))))));
	//    7   15:aload_1         
	//    8   16:new             #356 <Class zzaq>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokespecial   #359 <Method void zzaq(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, long[])>
	//   15   27:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   16   30:areturn         
	}

	public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener onmetadataupdatedlistener)
	{
		zzey = onmetadataupdatedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #108 <Field RemoteMediaPlayer$OnMetadataUpdatedListener zzey>
	//    3    5:return          
	}

	public void setOnPreloadStatusUpdatedListener(OnPreloadStatusUpdatedListener onpreloadstatusupdatedlistener)
	{
		zzew = onpreloadstatusupdatedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field RemoteMediaPlayer$OnPreloadStatusUpdatedListener zzew>
	//    3    5:return          
	}

	public void setOnQueueStatusUpdatedListener(OnQueueStatusUpdatedListener onqueuestatusupdatedlistener)
	{
		zzex = onqueuestatusupdatedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #118 <Field RemoteMediaPlayer$OnQueueStatusUpdatedListener zzex>
	//    3    5:return          
	}

	public void setOnStatusUpdatedListener(OnStatusUpdatedListener onstatusupdatedlistener)
	{
		zzez = onstatusupdatedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #123 <Field RemoteMediaPlayer$OnStatusUpdatedListener zzez>
	//    3    5:return          
	}

	public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag)
	{
		return setStreamMute(googleapiclient, flag, ((JSONObject) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #373 <Method PendingResult setStreamMute(GoogleApiClient, boolean, JSONObject)>
	//    5    7:areturn         
	}

	public PendingResult setStreamMute(GoogleApiClient googleapiclient, boolean flag, JSONObject jsonobject)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzbk(this, googleapiclient, googleapiclient, flag, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #376 <Class zzbk>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:iload_2         
	//    7    9:aload_3         
	//    8   10:invokespecial   #379 <Method void zzbk(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, boolean, JSONObject)>
	//    9   13:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   10   16:areturn         
	}

	public PendingResult setStreamVolume(GoogleApiClient googleapiclient, double d)
		throws IllegalArgumentException
	{
		return setStreamVolume(googleapiclient, d, ((JSONObject) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #385 <Method PendingResult setStreamVolume(GoogleApiClient, double, JSONObject)>
	//    5    7:areturn         
	}

	public PendingResult setStreamVolume(GoogleApiClient googleapiclient, double d, JSONObject jsonobject)
		throws IllegalArgumentException
	{
		if(!Double.isInfinite(d) && !Double.isNaN(d))
	//*   0    0:dload_2         
	//*   1    1:invokestatic    #392 <Method boolean Double.isInfinite(double)>
	//*   2    4:ifne            35
	//*   3    7:dload_2         
	//*   4    8:invokestatic    #395 <Method boolean Double.isNaN(double)>
	//*   5   11:ifeq            17
	//*   6   14:goto            35
		{
			return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzbj(this, googleapiclient, googleapiclient, d, jsonobject))))));
	//    7   17:aload_1         
	//    8   18:new             #397 <Class zzbj>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:aload_1         
	//   13   25:dload_2         
	//   14   26:aload           4
	//   15   28:invokespecial   #400 <Method void zzbj(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, double, JSONObject)>
	//   16   31:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   17   34:areturn         
		} else
		{
			googleapiclient = ((GoogleApiClient) (new StringBuilder(41)));
	//   18   35:new             #402 <Class StringBuilder>
	//   19   38:dup             
	//   20   39:bipush          41
	//   21   41:invokespecial   #405 <Method void StringBuilder(int)>
	//   22   44:astore_1        
			((StringBuilder) (googleapiclient)).append("Volume cannot be ");
	//   23   45:aload_1         
	//   24   46:ldc2            #407 <String "Volume cannot be ">
	//   25   49:invokevirtual   #411 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			((StringBuilder) (googleapiclient)).append(d);
	//   27   53:aload_1         
	//   28   54:dload_2         
	//   29   55:invokevirtual   #414 <Method StringBuilder StringBuilder.append(double)>
	//   30   58:pop             
			throw new IllegalArgumentException(((StringBuilder) (googleapiclient)).toString());
	//   31   59:new             #227 <Class IllegalArgumentException>
	//   32   62:dup             
	//   33   63:aload_1         
	//   34   64:invokevirtual   #417 <Method String StringBuilder.toString()>
	//   35   67:invokespecial   #354 <Method void IllegalArgumentException(String)>
	//   36   70:athrow          
		}
	}

	public PendingResult setTextTrackStyle(GoogleApiClient googleapiclient, TextTrackStyle texttrackstyle)
	{
		if(texttrackstyle == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("trackStyle cannot be null");
	//    2    4:new             #227 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #422 <String "trackStyle cannot be null">
	//    5   11:invokespecial   #354 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		else
			return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzar(this, googleapiclient, googleapiclient, texttrackstyle))))));
	//    7   15:aload_1         
	//    8   16:new             #424 <Class zzar>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokespecial   #427 <Method void zzar(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, TextTrackStyle)>
	//   15   27:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//   16   30:areturn         
	}

	public PendingResult stop(GoogleApiClient googleapiclient)
	{
		return stop(googleapiclient, ((JSONObject) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #431 <Method PendingResult stop(GoogleApiClient, JSONObject)>
	//    4    6:areturn         
	}

	public PendingResult stop(GoogleApiClient googleapiclient, JSONObject jsonobject)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzbg(this, googleapiclient, googleapiclient, jsonobject))))));
	//    0    0:aload_1         
	//    1    1:new             #433 <Class zzbg>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #434 <Method void zzbg(RemoteMediaPlayer, GoogleApiClient, GoogleApiClient, JSONObject)>
	//    8   12:invokevirtual   #199 <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//    9   15:areturn         
	}

	public static final String NAMESPACE;
	public static final int RESUME_STATE_PAUSE = 2;
	public static final int RESUME_STATE_PLAY = 1;
	public static final int RESUME_STATE_UNCHANGED = 0;
	public static final int STATUS_CANCELED = 2101;
	public static final int STATUS_FAILED = 2100;
	public static final int STATUS_REPLACED = 2103;
	public static final int STATUS_SUCCEEDED = 0;
	public static final int STATUS_TIMED_OUT = 2102;
	private final Object lock;
	private final zzdh zzeu;
	private final zza zzev;
	private OnPreloadStatusUpdatedListener zzew;
	private OnQueueStatusUpdatedListener zzex;
	private OnMetadataUpdatedListener zzey;
	private OnStatusUpdatedListener zzez;

	static 
	{
		NAMESPACE = zzdh.NAMESPACE;
	//    0    0:getstatic       #72  <Field String zzdh.NAMESPACE>
	//    1    3:putstatic       #73  <Field String NAMESPACE>
	//*   2    6:return          
	}
}
