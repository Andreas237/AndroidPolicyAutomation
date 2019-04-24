// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.*;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//			zze, ApplicationMetadata, LaunchOptions, zzi, 
//			zzg, zzh, zzj, zzf, 
//			zzk, zzl, zzaf, CastDevice, 
//			zzm

public final class Cast
{
	public static interface ApplicationConnectionResult
		extends Result
	{

		public abstract ApplicationMetadata getApplicationMetadata();

		public abstract String getApplicationStatus();

		public abstract String getSessionId();

		public abstract boolean getWasLaunched();
	}

	public static interface CastApi
	{

		public abstract int getActiveInputState(GoogleApiClient googleapiclient)
			throws IllegalStateException;

		public abstract ApplicationMetadata getApplicationMetadata(GoogleApiClient googleapiclient)
			throws IllegalStateException;

		public abstract String getApplicationStatus(GoogleApiClient googleapiclient)
			throws IllegalStateException;

		public abstract int getStandbyState(GoogleApiClient googleapiclient)
			throws IllegalStateException;

		public abstract double getVolume(GoogleApiClient googleapiclient)
			throws IllegalStateException;

		public abstract boolean isMute(GoogleApiClient googleapiclient)
			throws IllegalStateException;

		public abstract PendingResult joinApplication(GoogleApiClient googleapiclient);

		public abstract PendingResult joinApplication(GoogleApiClient googleapiclient, String s);

		public abstract PendingResult joinApplication(GoogleApiClient googleapiclient, String s, String s1);

		public abstract PendingResult launchApplication(GoogleApiClient googleapiclient, String s);

		public abstract PendingResult launchApplication(GoogleApiClient googleapiclient, String s, LaunchOptions launchoptions);

		public abstract PendingResult launchApplication(GoogleApiClient googleapiclient, String s, boolean flag);

		public abstract PendingResult leaveApplication(GoogleApiClient googleapiclient);

		public abstract void removeMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s)
			throws IOException, IllegalArgumentException;

		public abstract void requestStatus(GoogleApiClient googleapiclient)
			throws IOException, IllegalStateException;

		public abstract PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1);

		public abstract void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, MessageReceivedCallback messagereceivedcallback)
			throws IOException, IllegalStateException;

		public abstract void setMute(GoogleApiClient googleapiclient, boolean flag)
			throws IOException, IllegalStateException;

		public abstract void setVolume(GoogleApiClient googleapiclient, double d)
			throws IOException, IllegalArgumentException, IllegalStateException;

		public abstract PendingResult stopApplication(GoogleApiClient googleapiclient);

		public abstract PendingResult stopApplication(GoogleApiClient googleapiclient, String s);
	}

	public static final class CastApi.zza
		implements CastApi
	{

		private final PendingResult zza(GoogleApiClient googleapiclient, String s, String s1, zzaf zzaf)
		{
			return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzi(this, googleapiclient, s, s1, ((zzaf) (null))))))));
		//    0    0:aload_1         
		//    1    1:new             #18  <Class zzi>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:aconst_null     
		//    8   10:invokespecial   #21  <Method void zzi(Cast$CastApi$zza, GoogleApiClient, String, String, zzaf)>
		//    9   13:invokevirtual   #27  <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
		//   10   16:areturn         
		}

		public final int getActiveInputState(GoogleApiClient googleapiclient)
			throws IllegalStateException
		{
			return ((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api.AnyClientKey) (zzdf.zzwd)))).getActiveInputState();
		//    0    0:aload_1         
		//    1    1:getstatic       #39  <Field com.google.android.gms.common.api.Api$ClientKey zzdf.zzwd>
		//    2    4:invokevirtual   #43  <Method com.google.android.gms.common.api.Api$Client GoogleApiClient.getClient(com.google.android.gms.common.api.Api$AnyClientKey)>
		//    3    7:checkcast       #45  <Class zzcn>
		//    4   10:invokevirtual   #48  <Method int zzcn.getActiveInputState()>
		//    5   13:ireturn         
		}

		public final ApplicationMetadata getApplicationMetadata(GoogleApiClient googleapiclient)
			throws IllegalStateException
		{
			return ((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api.AnyClientKey) (zzdf.zzwd)))).getApplicationMetadata();
		//    0    0:aload_1         
		//    1    1:getstatic       #39  <Field com.google.android.gms.common.api.Api$ClientKey zzdf.zzwd>
		//    2    4:invokevirtual   #43  <Method com.google.android.gms.common.api.Api$Client GoogleApiClient.getClient(com.google.android.gms.common.api.Api$AnyClientKey)>
		//    3    7:checkcast       #45  <Class zzcn>
		//    4   10:invokevirtual   #54  <Method ApplicationMetadata zzcn.getApplicationMetadata()>
		//    5   13:areturn         
		}

		public final String getApplicationStatus(GoogleApiClient googleapiclient)
			throws IllegalStateException
		{
			return ((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api.AnyClientKey) (zzdf.zzwd)))).getApplicationStatus();
		//    0    0:aload_1         
		//    1    1:getstatic       #39  <Field com.google.android.gms.common.api.Api$ClientKey zzdf.zzwd>
		//    2    4:invokevirtual   #43  <Method com.google.android.gms.common.api.Api$Client GoogleApiClient.getClient(com.google.android.gms.common.api.Api$AnyClientKey)>
		//    3    7:checkcast       #45  <Class zzcn>
		//    4   10:invokevirtual   #59  <Method String zzcn.getApplicationStatus()>
		//    5   13:areturn         
		}

		public final int getStandbyState(GoogleApiClient googleapiclient)
			throws IllegalStateException
		{
			return ((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api.AnyClientKey) (zzdf.zzwd)))).getStandbyState();
		//    0    0:aload_1         
		//    1    1:getstatic       #39  <Field com.google.android.gms.common.api.Api$ClientKey zzdf.zzwd>
		//    2    4:invokevirtual   #43  <Method com.google.android.gms.common.api.Api$Client GoogleApiClient.getClient(com.google.android.gms.common.api.Api$AnyClientKey)>
		//    3    7:checkcast       #45  <Class zzcn>
		//    4   10:invokevirtual   #62  <Method int zzcn.getStandbyState()>
		//    5   13:ireturn         
		}

		public final double getVolume(GoogleApiClient googleapiclient)
			throws IllegalStateException
		{
			return ((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api.AnyClientKey) (zzdf.zzwd)))).getVolume();
		//    0    0:aload_1         
		//    1    1:getstatic       #39  <Field com.google.android.gms.common.api.Api$ClientKey zzdf.zzwd>
		//    2    4:invokevirtual   #43  <Method com.google.android.gms.common.api.Api$Client GoogleApiClient.getClient(com.google.android.gms.common.api.Api$AnyClientKey)>
		//    3    7:checkcast       #45  <Class zzcn>
		//    4   10:invokevirtual   #67  <Method double zzcn.getVolume()>
		//    5   13:dreturn         
		}

		public final boolean isMute(GoogleApiClient googleapiclient)
			throws IllegalStateException
		{
			return ((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api.AnyClientKey) (zzdf.zzwd)))).isMute();
		//    0    0:aload_1         
		//    1    1:getstatic       #39  <Field com.google.android.gms.common.api.Api$ClientKey zzdf.zzwd>
		//    2    4:invokevirtual   #43  <Method com.google.android.gms.common.api.Api$Client GoogleApiClient.getClient(com.google.android.gms.common.api.Api$AnyClientKey)>
		//    3    7:checkcast       #45  <Class zzcn>
		//    4   10:invokevirtual   #72  <Method boolean zzcn.isMute()>
		//    5   13:ireturn         
		}

		public final PendingResult joinApplication(GoogleApiClient googleapiclient)
		{
			return zza(googleapiclient, ((String) (null)), ((String) (null)), ((zzaf) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:aconst_null     
		//    4    4:aconst_null     
		//    5    5:invokespecial   #76  <Method PendingResult zza(GoogleApiClient, String, String, zzaf)>
		//    6    8:areturn         
		}

		public final PendingResult joinApplication(GoogleApiClient googleapiclient, String s)
		{
			return zza(googleapiclient, s, ((String) (null)), ((zzaf) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aconst_null     
		//    4    4:aconst_null     
		//    5    5:invokespecial   #76  <Method PendingResult zza(GoogleApiClient, String, String, zzaf)>
		//    6    8:areturn         
		}

		public final PendingResult joinApplication(GoogleApiClient googleapiclient, String s, String s1)
		{
			return zza(googleapiclient, s, s1, ((zzaf) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aconst_null     
		//    5    5:invokespecial   #76  <Method PendingResult zza(GoogleApiClient, String, String, zzaf)>
		//    6    8:areturn         
		}

		public final PendingResult launchApplication(GoogleApiClient googleapiclient, String s)
		{
			return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzg(this, googleapiclient, s))))));
		//    0    0:aload_1         
		//    1    1:new             #84  <Class zzg>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:invokespecial   #87  <Method void zzg(Cast$CastApi$zza, GoogleApiClient, String)>
		//    7   11:invokevirtual   #27  <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
		//    8   14:areturn         
		}

		public final PendingResult launchApplication(GoogleApiClient googleapiclient, String s, LaunchOptions launchoptions)
		{
			return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzh(this, googleapiclient, s, launchoptions))))));
		//    0    0:aload_1         
		//    1    1:new             #90  <Class zzh>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokespecial   #93  <Method void zzh(Cast$CastApi$zza, GoogleApiClient, String, LaunchOptions)>
		//    8   12:invokevirtual   #27  <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
		//    9   15:areturn         
		}

		public final PendingResult launchApplication(GoogleApiClient googleapiclient, String s, boolean flag)
		{
			return launchApplication(googleapiclient, s, (new LaunchOptions.Builder()).setRelaunchIfRunning(flag).build());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:new             #98  <Class LaunchOptions$Builder>
		//    4    6:dup             
		//    5    7:invokespecial   #99  <Method void LaunchOptions$Builder()>
		//    6   10:iload_3         
		//    7   11:invokevirtual   #103 <Method LaunchOptions$Builder LaunchOptions$Builder.setRelaunchIfRunning(boolean)>
		//    8   14:invokevirtual   #107 <Method LaunchOptions LaunchOptions$Builder.build()>
		//    9   17:invokevirtual   #109 <Method PendingResult launchApplication(GoogleApiClient, String, LaunchOptions)>
		//   10   20:areturn         
		}

		public final PendingResult leaveApplication(GoogleApiClient googleapiclient)
		{
			return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzj(this, googleapiclient))))));
		//    0    0:aload_1         
		//    1    1:new             #114 <Class zzj>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #117 <Method void zzj(Cast$CastApi$zza, GoogleApiClient)>
		//    6   10:invokevirtual   #27  <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
		//    7   13:areturn         
		}

		public final void removeMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s)
			throws IOException, IllegalArgumentException
		{
			try
			{
				((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api.AnyClientKey) (zzdf.zzwd)))).removeMessageReceivedCallbacks(s);
		//    0    0:aload_1         
		//    1    1:getstatic       #39  <Field com.google.android.gms.common.api.Api$ClientKey zzdf.zzwd>
		//    2    4:invokevirtual   #43  <Method com.google.android.gms.common.api.Api$Client GoogleApiClient.getClient(com.google.android.gms.common.api.Api$AnyClientKey)>
		//    3    7:checkcast       #45  <Class zzcn>
		//    4   10:aload_2         
		//    5   11:invokevirtual   #129 <Method void zzcn.removeMessageReceivedCallbacks(String)>
				return;
		//    6   14:return          
			}
		//*   7   15:new             #122 <Class IOException>
		//*   8   18:dup             
		//*   9   19:ldc1            #131 <String "service error">
		//*  10   21:invokespecial   #133 <Method void IOException(String)>
		//*  11   24:athrow          
			// Misplaced declaration of an exception variable
			catch(GoogleApiClient googleapiclient)
			{
				throw new IOException("service error");
			}
		//*  12   25:astore_1        
		//*  13   26:goto            15
		}

		public final void requestStatus(GoogleApiClient googleapiclient)
			throws IOException, IllegalStateException
		{
			try
			{
				((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api.AnyClientKey) (zzdf.zzwd)))).requestStatus();
		//    0    0:aload_1         
		//    1    1:getstatic       #39  <Field com.google.android.gms.common.api.Api$ClientKey zzdf.zzwd>
		//    2    4:invokevirtual   #43  <Method com.google.android.gms.common.api.Api$Client GoogleApiClient.getClient(com.google.android.gms.common.api.Api$AnyClientKey)>
		//    3    7:checkcast       #45  <Class zzcn>
		//    4   10:invokevirtual   #137 <Method void zzcn.requestStatus()>
				return;
		//    5   13:return          
			}
		//*   6   14:new             #122 <Class IOException>
		//*   7   17:dup             
		//*   8   18:ldc1            #131 <String "service error">
		//*   9   20:invokespecial   #133 <Method void IOException(String)>
		//*  10   23:athrow          
			// Misplaced declaration of an exception variable
			catch(GoogleApiClient googleapiclient)
			{
				throw new IOException("service error");
			}
		//*  11   24:astore_1        
		//*  12   25:goto            14
		}

		public final PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1)
		{
			return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzf(this, googleapiclient, s, s1))))));
		//    0    0:aload_1         
		//    1    1:new             #140 <Class zzf>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokespecial   #143 <Method void zzf(Cast$CastApi$zza, GoogleApiClient, String, String)>
		//    8   12:invokevirtual   #27  <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
		//    9   15:areturn         
		}

		public final void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, MessageReceivedCallback messagereceivedcallback)
			throws IOException, IllegalStateException
		{
			try
			{
				((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api.AnyClientKey) (zzdf.zzwd)))).setMessageReceivedCallbacks(s, messagereceivedcallback);
		//    0    0:aload_1         
		//    1    1:getstatic       #39  <Field com.google.android.gms.common.api.Api$ClientKey zzdf.zzwd>
		//    2    4:invokevirtual   #43  <Method com.google.android.gms.common.api.Api$Client GoogleApiClient.getClient(com.google.android.gms.common.api.Api$AnyClientKey)>
		//    3    7:checkcast       #45  <Class zzcn>
		//    4   10:aload_2         
		//    5   11:aload_3         
		//    6   12:invokevirtual   #149 <Method void zzcn.setMessageReceivedCallbacks(String, Cast$MessageReceivedCallback)>
				return;
		//    7   15:return          
			}
		//*   8   16:new             #122 <Class IOException>
		//*   9   19:dup             
		//*  10   20:ldc1            #131 <String "service error">
		//*  11   22:invokespecial   #133 <Method void IOException(String)>
		//*  12   25:athrow          
			// Misplaced declaration of an exception variable
			catch(GoogleApiClient googleapiclient)
			{
				throw new IOException("service error");
			}
		//*  13   26:astore_1        
		//*  14   27:goto            16
		}

		public final void setMute(GoogleApiClient googleapiclient, boolean flag)
			throws IOException, IllegalStateException
		{
			try
			{
				((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api.AnyClientKey) (zzdf.zzwd)))).setMute(flag);
		//    0    0:aload_1         
		//    1    1:getstatic       #39  <Field com.google.android.gms.common.api.Api$ClientKey zzdf.zzwd>
		//    2    4:invokevirtual   #43  <Method com.google.android.gms.common.api.Api$Client GoogleApiClient.getClient(com.google.android.gms.common.api.Api$AnyClientKey)>
		//    3    7:checkcast       #45  <Class zzcn>
		//    4   10:iload_2         
		//    5   11:invokevirtual   #154 <Method void zzcn.setMute(boolean)>
				return;
		//    6   14:return          
			}
		//*   7   15:new             #122 <Class IOException>
		//*   8   18:dup             
		//*   9   19:ldc1            #131 <String "service error">
		//*  10   21:invokespecial   #133 <Method void IOException(String)>
		//*  11   24:athrow          
			// Misplaced declaration of an exception variable
			catch(GoogleApiClient googleapiclient)
			{
				throw new IOException("service error");
			}
		//*  12   25:astore_1        
		//*  13   26:goto            15
		}

		public final void setVolume(GoogleApiClient googleapiclient, double d)
			throws IOException, IllegalArgumentException, IllegalStateException
		{
			try
			{
				((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api.AnyClientKey) (zzdf.zzwd)))).setVolume(d);
		//    0    0:aload_1         
		//    1    1:getstatic       #39  <Field com.google.android.gms.common.api.Api$ClientKey zzdf.zzwd>
		//    2    4:invokevirtual   #43  <Method com.google.android.gms.common.api.Api$Client GoogleApiClient.getClient(com.google.android.gms.common.api.Api$AnyClientKey)>
		//    3    7:checkcast       #45  <Class zzcn>
		//    4   10:dload_2         
		//    5   11:invokevirtual   #159 <Method void zzcn.setVolume(double)>
				return;
		//    6   14:return          
			}
		//*   7   15:new             #122 <Class IOException>
		//*   8   18:dup             
		//*   9   19:ldc1            #131 <String "service error">
		//*  10   21:invokespecial   #133 <Method void IOException(String)>
		//*  11   24:athrow          
			// Misplaced declaration of an exception variable
			catch(GoogleApiClient googleapiclient)
			{
				throw new IOException("service error");
			}
		//*  12   25:astore_1        
		//*  13   26:goto            15
		}

		public final PendingResult stopApplication(GoogleApiClient googleapiclient)
		{
			return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzk(this, googleapiclient))))));
		//    0    0:aload_1         
		//    1    1:new             #162 <Class zzk>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #163 <Method void zzk(Cast$CastApi$zza, GoogleApiClient)>
		//    6   10:invokevirtual   #27  <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
		//    7   13:areturn         
		}

		public final PendingResult stopApplication(GoogleApiClient googleapiclient, String s)
		{
			return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzl(this, googleapiclient, s))))));
		//    0    0:aload_1         
		//    1    1:new             #165 <Class zzl>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:invokespecial   #166 <Method void zzl(Cast$CastApi$zza, GoogleApiClient, String)>
		//    7   11:invokevirtual   #27  <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
		//    8   14:areturn         
		}

		public CastApi.zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class CastOptions
		implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
	{

		public static Builder builder(CastDevice castdevice, Listener listener)
		{
			return new Builder(castdevice, listener);
		//    0    0:new             #11  <Class Cast$CastOptions$Builder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #53  <Method void Cast$CastOptions$Builder(CastDevice, Cast$Listener)>
		//    5    9:areturn         
		}

		static int zza(CastOptions castoptions)
		{
			return castoptions.zzak;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field int zzak>
		//    2    4:ireturn         
		}

		final Bundle extras;
		final CastDevice zzai;
		final Listener zzaj;
		private final int zzak;

		private CastOptions(Builder builder1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			zzai = builder1.zzai;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #27  <Field CastDevice Cast$CastOptions$Builder.zzai>
		//    5    9:putfield        #28  <Field CastDevice zzai>
			zzaj = builder1.zzaj;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:getfield        #30  <Field Cast$Listener Cast$CastOptions$Builder.zzaj>
		//    9   17:putfield        #31  <Field Cast$Listener zzaj>
			zzak = Builder.zza(builder1);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokestatic    #35  <Method int Cast$CastOptions$Builder.zza(Cast$CastOptions$Builder)>
		//   13   25:putfield        #37  <Field int zzak>
			extras = Builder.zzb(builder1);
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:invokestatic    #41  <Method Bundle Cast$CastOptions$Builder.zzb(Cast$CastOptions$Builder)>
		//   17   33:putfield        #43  <Field Bundle extras>
		//   18   36:return          
		}

		CastOptions(Builder builder1, zze zze1)
		{
			this(builder1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #47  <Method void Cast$CastOptions(Cast$CastOptions$Builder)>
		//    3    5:return          
		}
	}

	public static final class CastOptions.Builder
	{

		static int zza(CastOptions.Builder builder)
		{
			return builder.zzak;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field int zzak>
		//    2    4:ireturn         
		}

		static Bundle zzb(CastOptions.Builder builder)
		{
			return builder.extras;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Bundle extras>
		//    2    4:areturn         
		}

		public final CastOptions build()
		{
			return new CastOptions(this, ((zze) (null)));
		//    0    0:new             #6   <Class Cast$CastOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #51  <Method void Cast$CastOptions(Cast$CastOptions$Builder, zze)>
		//    5    9:areturn         
		}

		public final CastOptions.Builder setVerboseLoggingEnabled(boolean flag)
		{
			int i;
			if(flag)
		//*   0    0:iload_1         
		//*   1    1:ifeq            18
				i = zzak | 1;
		//    2    4:aload_0         
		//    3    5:getfield        #39  <Field int zzak>
		//    4    8:iconst_1        
		//    5    9:ior             
		//    6   10:istore_2        
			else
		//*   7   11:aload_0         
		//*   8   12:iload_2         
		//*   9   13:putfield        #39  <Field int zzak>
		//*  10   16:aload_0         
		//*  11   17:areturn         
				i = zzak & -2;
		//   12   18:aload_0         
		//   13   19:getfield        #39  <Field int zzak>
		//   14   22:bipush          -2
		//   15   24:iand            
		//   16   25:istore_2        
			zzak = i;
			return this;
		//*  17   26:goto            11
		}

		public final CastOptions.Builder zza(Bundle bundle)
		{
			extras = bundle;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #46  <Field Bundle extras>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private Bundle extras;
		CastDevice zzai;
		Listener zzaj;
		private int zzak;

		public CastOptions.Builder(CastDevice castdevice, Listener listener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			Preconditions.checkNotNull(((Object) (castdevice)), "CastDevice parameter cannot be null");
		//    2    4:aload_1         
		//    3    5:ldc1            #25  <String "CastDevice parameter cannot be null">
		//    4    7:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    5   10:pop             
			Preconditions.checkNotNull(((Object) (listener)), "CastListener parameter cannot be null");
		//    6   11:aload_2         
		//    7   12:ldc1            #33  <String "CastListener parameter cannot be null">
		//    8   14:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    9   17:pop             
			zzai = castdevice;
		//   10   18:aload_0         
		//   11   19:aload_1         
		//   12   20:putfield        #35  <Field CastDevice zzai>
			zzaj = listener;
		//   13   23:aload_0         
		//   14   24:aload_2         
		//   15   25:putfield        #37  <Field Cast$Listener zzaj>
			zzak = 0;
		//   16   28:aload_0         
		//   17   29:iconst_0        
		//   18   30:putfield        #39  <Field int zzak>
		//   19   33:return          
		}
	}

	public static class Listener
	{

		public void onActiveInputStateChanged(int i)
		{
		//    0    0:return          
		}

		public void onApplicationDisconnected(int i)
		{
		//    0    0:return          
		}

		public void onApplicationMetadataChanged(ApplicationMetadata applicationmetadata)
		{
		//    0    0:return          
		}

		public void onApplicationStatusChanged()
		{
		//    0    0:return          
		}

		public void onStandbyStateChanged(int i)
		{
		//    0    0:return          
		}

		public void onVolumeChanged()
		{
		//    0    0:return          
		}

		public Listener()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface MessageReceivedCallback
	{

		public abstract void onMessageReceived(CastDevice castdevice, String s, String s1);
	}

	static class zza extends zzcf
	{

		public Result createFailedResult(Status status)
		{
			return ((Result) (new zzm(this, status)));
		//    0    0:new             #18  <Class zzm>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #21  <Method void zzm(Cast$zza, Status)>
		//    5    9:areturn         
		}

		public void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
			throws RemoteException
		{
			zza((zzcn)anyclient);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #27  <Class zzcn>
		//    3    5:invokevirtual   #30  <Method void zza(zzcn)>
		//    4    8:return          
		}

		public void zza(zzcn zzcn1)
			throws RemoteException
		{
		//    0    0:return          
		}

		public zza(GoogleApiClient googleapiclient)
		{
			super(googleapiclient);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void zzcf(GoogleApiClient)>
		//    3    5:return          
		}
	}


	private Cast()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
	//    2    4:return          
	}

	public static final int ACTIVE_INPUT_STATE_NO = 0;
	public static final int ACTIVE_INPUT_STATE_UNKNOWN = -1;
	public static final int ACTIVE_INPUT_STATE_YES = 1;
	public static final Api API;
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER;
	public static final CastApi CastApi = new CastApi.zza();
	public static final String EXTRA_APP_NO_LONGER_RUNNING = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
	public static final int MAX_MESSAGE_LENGTH = 0x10000;
	public static final int MAX_NAMESPACE_LENGTH = 128;
	public static final int STANDBY_STATE_NO = 0;
	public static final int STANDBY_STATE_UNKNOWN = -1;
	public static final int STANDBY_STATE_YES = 1;

	static 
	{
		CLIENT_BUILDER = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new zze()));
	//    0    0:new             #57  <Class zze>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void zze()>
	//    3    7:putstatic       #62  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
		API = new Api("Cast.API", CLIENT_BUILDER, zzdf.zzwd);
	//    4   10:new             #64  <Class Api>
	//    5   13:dup             
	//    6   14:ldc1            #66  <String "Cast.API">
	//    7   16:getstatic       #62  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
	//    8   19:getstatic       #72  <Field com.google.android.gms.common.api.Api$ClientKey zzdf.zzwd>
	//    9   22:invokespecial   #75  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   10   25:putstatic       #77  <Field Api API>
	//   11   28:new             #12  <Class Cast$CastApi$zza>
	//   12   31:dup             
	//   13   32:invokespecial   #78  <Method void Cast$CastApi$zza()>
	//   14   35:putstatic       #80  <Field Cast$CastApi CastApi>
	//*  15   38:return          
	}
}
