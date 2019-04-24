// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.os.*;
import android.util.Log;
import com.google.android.gms.common.internal.ICertData;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.stable.zzb;

// Referenced classes of package com.google.android.gms.common:
//			GoogleCertificatesQueryCreator, zzb

public class GoogleCertificatesQuery extends AbstractSafeParcelable
{

	GoogleCertificatesQuery(String s, IBinder ibinder, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void AbstractSafeParcelable()>
		zzbh = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #44  <Field String zzbh>
		zzbi = zza(ibinder);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #48  <Method GoogleCertificates$CertData zza(IBinder)>
	//    8   14:putfield        #50  <Field GoogleCertificates$CertData zzbi>
		zzbj = flag;
	//    9   17:aload_0         
	//   10   18:iload_3         
	//   11   19:putfield        #52  <Field boolean zzbj>
	//   12   22:return          
	}

	GoogleCertificatesQuery(String s, GoogleCertificates.CertData certdata, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void AbstractSafeParcelable()>
		zzbh = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #44  <Field String zzbh>
		zzbi = certdata;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #50  <Field GoogleCertificates$CertData zzbi>
		zzbj = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #52  <Field boolean zzbj>
	//   11   19:return          
	}

	private static GoogleCertificates.CertData zza(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		try
		{
			ibinder = ((IBinder) (com.google.android.gms.common.internal.ICertData.Stub.asInterface(ibinder).getBytesWrapped()));
	//    4    6:aload_0         
	//    5    7:invokestatic    #64  <Method ICertData com.google.android.gms.common.internal.ICertData$Stub.asInterface(IBinder)>
	//    6   10:invokeinterface #70  <Method com.google.android.gms.dynamic.IObjectWrapper ICertData.getBytesWrapped()>
	//    7   15:astore_0        
		}
	//*   8   16:aload_0         
	//*   9   17:ifnonnull       25
	//*  10   20:aconst_null     
	//*  11   21:astore_0        
	//*  12   22:goto            33
	//*  13   25:aload_0         
	//*  14   26:invokestatic    #76  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//*  15   29:checkcast       #78  <Class byte[]>
	//*  16   32:astore_0        
	//*  17   33:aload_0         
	//*  18   34:ifnull          46
	//*  19   37:new             #80  <Class com.google.android.gms.common.zzb>
	//*  20   40:dup             
	//*  21   41:aload_0         
	//*  22   42:invokespecial   #83  <Method void com.google.android.gms.common.zzb(byte[])>
	//*  23   45:areturn         
	//*  24   46:ldc1            #85  <String "GoogleCertificatesQuery">
	//*  25   48:ldc1            #87  <String "Could not unwrap certificate">
	//*  26   50:invokestatic    #93  <Method int Log.e(String, String)>
	//*  27   53:pop             
	//*  28   54:aconst_null     
	//*  29   55:areturn         
		// Misplaced declaration of an exception variable
		catch(IBinder ibinder)
	//*  30   56:astore_0        
		{
			Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", ((Throwable) (ibinder)));
	//   31   57:ldc1            #85  <String "GoogleCertificatesQuery">
	//   32   59:ldc1            #87  <String "Could not unwrap certificate">
	//   33   61:aload_0         
	//   34   62:invokestatic    #96  <Method int Log.e(String, String, Throwable)>
	//   35   65:pop             
			return null;
	//   36   66:aconst_null     
	//   37   67:areturn         
		}
		if(ibinder == null)
			ibinder = null;
		else
			ibinder = ((IBinder) ((byte[])ObjectWrapper.unwrap(((com.google.android.gms.dynamic.IObjectWrapper) (ibinder)))));
		if(ibinder != null)
		{
			return ((GoogleCertificates.CertData) (new com.google.android.gms.common.zzb(((byte []) (ibinder)))));
		} else
		{
			Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
			return null;
		}
	}

	public boolean getAllowTestKeys()
	{
		return zzbj;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean zzbj>
	//    2    4:ireturn         
	}

	public IBinder getCallingCertificateBinder()
	{
		if(zzbi == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field GoogleCertificates$CertData zzbi>
	//*   2    4:ifnonnull       17
		{
			Log.w("GoogleCertificatesQuery", "certificate binder is null");
	//    3    7:ldc1            #85  <String "GoogleCertificatesQuery">
	//    4    9:ldc1            #101 <String "certificate binder is null">
	//    5   11:invokestatic    #104 <Method int Log.w(String, String)>
	//    6   14:pop             
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		} else
		{
			return ((zzb) (zzbi)).asBinder();
	//    9   17:aload_0         
	//   10   18:getfield        #50  <Field GoogleCertificates$CertData zzbi>
	//   11   21:invokevirtual   #109 <Method IBinder zzb.asBinder()>
	//   12   24:areturn         
		}
	}

	public String getCallingPackage()
	{
		return zzbh;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String zzbh>
	//    2    4:areturn         
	}

	public GoogleCertificates.CertData getCertificate()
	{
		return zzbi;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleCertificates$CertData zzbi>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #120 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 1, getCallingPackage(), false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #122 <Method String getCallingPackage()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #126 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeIBinder(parcel, 2, getCallingCertificateBinder(), false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #128 <Method IBinder getCallingCertificateBinder()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #132 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 3, getAllowTestKeys());
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #134 <Method boolean getAllowTestKeys()>
	//   19   31:invokestatic    #138 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:invokestatic    #141 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   23   39:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new GoogleCertificatesQueryCreator();
	private final String zzbh;
	private final GoogleCertificates.CertData zzbi;
	private final boolean zzbj;

	static 
	{
	//    0    0:new             #32  <Class GoogleCertificatesQueryCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void GoogleCertificatesQueryCreator()>
	//    3    7:putstatic       #37  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
