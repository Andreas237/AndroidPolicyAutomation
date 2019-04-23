// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;

public interface ICancelToken
	extends IInterface
{
	public static abstract class Stub extends zzb
		implements ICancelToken
	{

		public static ICancelToken asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "com.google.android.gms.common.internal.ICancelToken">
		//    6    9:invokeinterface #26  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface instanceof ICancelToken)
		//*   8   15:aload_1         
		//*   9   16:instanceof      #6   <Class ICancelToken>
		//*  10   19:ifeq            27
				return (ICancelToken)iinterface;
		//   11   22:aload_1         
		//   12   23:checkcast       #6   <Class ICancelToken>
		//   13   26:areturn         
			else
				return ((ICancelToken) (new zza(ibinder)));
		//   14   27:new             #9   <Class ICancelToken$Stub$zza>
		//   15   30:dup             
		//   16   31:aload_0         
		//   17   32:invokespecial   #29  <Method void ICancelToken$Stub$zza(IBinder)>
		//   18   35:areturn         
		}

		public Stub()
		{
			super("com.google.android.gms.common.internal.ICancelToken");
		//    0    0:aload_0         
		//    1    1:ldc1            #14  <String "com.google.android.gms.common.internal.ICancelToken">
		//    2    3:invokespecial   #17  <Method void zzb(String)>
		//    3    6:return          
		}
	}

	public static final class Stub.zza extends com.google.android.gms.internal.common.zza
		implements ICancelToken
	{

		public final void cancel()
			throws RemoteException
		{
			((com.google.android.gms.internal.common.zza)this).zzc(2, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:aload_0         
		//    3    3:invokevirtual   #25  <Method android.os.Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    6:invokevirtual   #29  <Method void com.google.android.gms.internal.common.zza.zzc(int, android.os.Parcel)>
		//    5    9:return          
		}

		Stub.zza(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.common.internal.ICancelToken");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.ICancelToken">
		//    3    4:invokespecial   #17  <Method void com.google.android.gms.internal.common.zza(IBinder, String)>
		//    4    7:return          
		}
	}


	public abstract void cancel()
		throws RemoteException;
}
