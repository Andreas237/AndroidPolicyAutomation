// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzr;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class Api
{
	public static interface ApiOptions
	{
	}

	public static interface ApiOptions.HasOptions
		extends ApiOptions
	{
	}

	public static final class ApiOptions.NoOptions
		implements ApiOptions.NotRequiredOptions
	{

		private ApiOptions.NoOptions()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface ApiOptions.NotRequiredOptions
		extends ApiOptions
	{
	}

	public static interface ApiOptions.Optional
		extends ApiOptions.HasOptions, ApiOptions.NotRequiredOptions
	{
	}

	public static abstract class zza extends zzd
	{

		public abstract zze zza(Context context, Looper looper, com.google.android.gms.common.internal.zzg zzg1, Object obj, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener);

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Api$zzd()>
		//    2    4:return          
		}
	}

	public static interface zzb
	{
	}

	public static class zzc
	{

		public zzc()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}
	}

	public static abstract class zzd
	{

		public int getPriority()
		{
			return 0x7fffffff;
		//    0    0:ldc1            #16  <Int 0x7fffffff>
		//    1    2:ireturn         
		}

		public List zzp(Object obj)
		{
			return Collections.emptyList();
		//    0    0:invokestatic    #24  <Method List Collections.emptyList()>
		//    1    3:areturn         
		}

		public zzd()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface zze
		extends zzb
	{

		public abstract void disconnect();

		public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

		public abstract boolean isConnected();

		public abstract boolean isConnecting();

		public abstract void zza(com.google.android.gms.common.internal.zzf.zzf zzf1);

		public abstract void zza(zzr zzr, Set set);

		public abstract boolean zzqD();

		public abstract boolean zzqS();

		public abstract Intent zzqT();

		public abstract boolean zzuI();

		public abstract IBinder zzuJ();
	}

	public static final class zzf extends zzc
	{

		public zzf()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Api$zzc()>
		//    2    4:return          
		}
	}

	public static interface zzg
		extends zzb
	{

		public abstract String zzeu();

		public abstract String zzev();

		public abstract IInterface zzh(IBinder ibinder);
	}

	public static abstract class zzh extends zzd
	{
	}

	public static final class zzi extends zzc
	{
	}


	public Api(String s, zza zza1, zzf zzf1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
		zzac.zzb(((Object) (zza1)), "Cannot construct an Api with a null ClientBuilder");
	//    2    4:aload_2         
	//    3    5:ldc1            #68  <String "Cannot construct an Api with a null ClientBuilder">
	//    4    7:invokestatic    #73  <Method Object zzac.zzb(Object, Object)>
	//    5   10:pop             
		zzac.zzb(((Object) (zzf1)), "Cannot construct an Api with a null ClientKey");
	//    6   11:aload_3         
	//    7   12:ldc1            #75  <String "Cannot construct an Api with a null ClientKey">
	//    8   14:invokestatic    #73  <Method Object zzac.zzb(Object, Object)>
	//    9   17:pop             
		mName = s;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #77  <Field String mName>
		zzaxu = zza1;
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:putfield        #79  <Field Api$zza zzaxu>
	//   16   28:aload_0         
	//   17   29:aconst_null     
	//   18   30:putfield        #81  <Field Api$zzh zzaxv>
		zzaxw = zzf1;
	//   19   33:aload_0         
	//   20   34:aload_3         
	//   21   35:putfield        #83  <Field Api$zzf zzaxw>
	//   22   38:aload_0         
	//   23   39:aconst_null     
	//   24   40:putfield        #85  <Field Api$zzi zzaxx>
	//   25   43:return          
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String mName>
	//    2    4:areturn         
	}

	public zzd zzuF()
	{
		return ((zzd) (zzaxu));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Api$zza zzaxu>
	//    2    4:areturn         
	}

	public zza zzuG()
	{
		boolean flag;
		if(zzaxu != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field Api$zza zzaxu>
	//*   2    4:ifnull          20
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:iload_1         
	//*   6   10:ldc1            #97  <String "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder">
	//*   7   12:invokestatic    #100 <Method void zzac.zza(boolean, Object)>
	//*   8   15:aload_0         
	//*   9   16:getfield        #79  <Field Api$zza zzaxu>
	//*  10   19:areturn         
			flag = false;
	//   11   20:iconst_0        
	//   12   21:istore_1        
		zzac.zza(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
		return zzaxu;
	//*  13   22:goto            9
	}

	public zzc zzuH()
	{
		if(zzaxw != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field Api$zzf zzaxw>
	//*   2    4:ifnull          12
			return ((zzc) (zzaxw));
	//    3    7:aload_0         
	//    4    8:getfield        #83  <Field Api$zzf zzaxw>
	//    5   11:areturn         
		else
			throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
	//    6   12:new             #105 <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #107 <String "This API was constructed with null client keys. This should not be possible.">
	//    9   18:invokespecial   #110 <Method void IllegalStateException(String)>
	//   10   21:athrow          
	}

	private final String mName;
	private final zza zzaxu;
	private final zzh zzaxv = null;
	private final zzf zzaxw;
	private final zzi zzaxx = null;
}
