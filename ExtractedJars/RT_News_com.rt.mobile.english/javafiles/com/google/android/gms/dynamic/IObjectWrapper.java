// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzb;

public interface IObjectWrapper
	extends IInterface
{
	public static class Stub extends zzb
		implements IObjectWrapper
	{

		public static IObjectWrapper asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "com.google.android.gms.dynamic.IObjectWrapper">
		//    6    9:invokeinterface #26  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface instanceof IObjectWrapper)
		//*   8   15:aload_1         
		//*   9   16:instanceof      #6   <Class IObjectWrapper>
		//*  10   19:ifeq            27
				return (IObjectWrapper)iinterface;
		//   11   22:aload_1         
		//   12   23:checkcast       #6   <Class IObjectWrapper>
		//   13   26:areturn         
			else
				return ((IObjectWrapper) (new Proxy(ibinder)));
		//   14   27:new             #9   <Class IObjectWrapper$Stub$Proxy>
		//   15   30:dup             
		//   16   31:aload_0         
		//   17   32:invokespecial   #29  <Method void IObjectWrapper$Stub$Proxy(IBinder)>
		//   18   35:areturn         
		}

		public Stub()
		{
			super("com.google.android.gms.dynamic.IObjectWrapper");
		//    0    0:aload_0         
		//    1    1:ldc1            #14  <String "com.google.android.gms.dynamic.IObjectWrapper">
		//    2    3:invokespecial   #17  <Method void zzb(String)>
		//    3    6:return          
		}
	}

	public static class Stub.Proxy extends zza
		implements IObjectWrapper
	{

		Stub.Proxy(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.dynamic.IObjectWrapper");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.dynamic.IObjectWrapper">
		//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
		//    4    7:return          
		}
	}

}
