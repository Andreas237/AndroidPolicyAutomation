// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.cast.zzcn;
import com.google.android.gms.internal.cast.zzdf;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//			Cast, zzi, zzg, zzh, 
//			zzj, zzf, zzk, zzl, 
//			zzaf, ApplicationMetadata, LaunchOptions

public static final class Cast$CastApi$zza
	implements Cast.CastApi
{

	private final PendingResult zza(GoogleApiClient googleapiclient, String s, String s1, zzaf zzaf)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.n.ApiMethodImpl) (new zzi(this, googleapiclient, s, s1, ((zzaf) (null))))))));
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
		return ((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api$AnyClientKey) (zzdf.zzwd)))).getActiveInputState();
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
		return ((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api$AnyClientKey) (zzdf.zzwd)))).getApplicationMetadata();
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
		return ((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api$AnyClientKey) (zzdf.zzwd)))).getApplicationStatus();
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
		return ((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api$AnyClientKey) (zzdf.zzwd)))).getStandbyState();
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
		return ((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api$AnyClientKey) (zzdf.zzwd)))).getVolume();
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
		return ((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api$AnyClientKey) (zzdf.zzwd)))).isMute();
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
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.n.ApiMethodImpl) (new zzg(this, googleapiclient, s))))));
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
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.n.ApiMethodImpl) (new zzh(this, googleapiclient, s, launchoptions))))));
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
		return launchApplication(googleapiclient, s, (new lder()).setRelaunchIfRunning(flag).build());
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
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.n.ApiMethodImpl) (new zzj(this, googleapiclient))))));
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
			((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api$AnyClientKey) (zzdf.zzwd)))).removeMessageReceivedCallbacks(s);
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
			((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api$AnyClientKey) (zzdf.zzwd)))).requestStatus();
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
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.n.ApiMethodImpl) (new zzf(this, googleapiclient, s, s1))))));
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

	public final void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, vedCallback vedcallback)
		throws IOException, IllegalStateException
	{
		try
		{
			((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api$AnyClientKey) (zzdf.zzwd)))).setMessageReceivedCallbacks(s, vedcallback);
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
			((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api$AnyClientKey) (zzdf.zzwd)))).setMute(flag);
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
			((zzcn)googleapiclient.getClient(((com.google.android.gms.common.api.Api$AnyClientKey) (zzdf.zzwd)))).setVolume(d);
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
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.n.ApiMethodImpl) (new zzk(this, googleapiclient))))));
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
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.n.ApiMethodImpl) (new zzl(this, googleapiclient, s))))));
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

	public Cast$CastApi$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
