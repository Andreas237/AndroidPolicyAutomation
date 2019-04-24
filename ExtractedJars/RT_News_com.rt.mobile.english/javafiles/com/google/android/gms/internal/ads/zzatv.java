// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzatw, zzbfi, zzbfh, zzba

public final class zzatv extends AbstractSafeParcelable
{

	zzatv(int i, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void AbstractSafeParcelable()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #41  <Field int versionCode>
		zzdhe = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #43  <Field zzba zzdhe>
		zzdhf = abyte0;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #45  <Field byte[] zzdhf>
		zzwf();
	//   11   19:aload_0         
	//   12   20:invokespecial   #48  <Method void zzwf()>
	//   13   23:return          
	}

	private final void zzwf()
	{
		if(zzdhe == null && zzdhf != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field zzba zzdhe>
	//*   2    4:ifnonnull       15
	//*   3    7:aload_0         
	//*   4    8:getfield        #45  <Field byte[] zzdhf>
	//*   5   11:ifnull          15
			return;
	//    6   14:return          
		if(zzdhe != null && zzdhf == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #43  <Field zzba zzdhe>
	//*   9   19:ifnull          30
	//*  10   22:aload_0         
	//*  11   23:getfield        #45  <Field byte[] zzdhf>
	//*  12   26:ifnonnull       30
			return;
	//   13   29:return          
		if(zzdhe != null && zzdhf != null)
	//*  14   30:aload_0         
	//*  15   31:getfield        #43  <Field zzba zzdhe>
	//*  16   34:ifnull          54
	//*  17   37:aload_0         
	//*  18   38:getfield        #45  <Field byte[] zzdhf>
	//*  19   41:ifnull          54
			throw new IllegalStateException("Invalid internal representation - full");
	//   20   44:new             #52  <Class IllegalStateException>
	//   21   47:dup             
	//   22   48:ldc1            #54  <String "Invalid internal representation - full">
	//   23   50:invokespecial   #57  <Method void IllegalStateException(String)>
	//   24   53:athrow          
		if(zzdhe == null && zzdhf == null)
	//*  25   54:aload_0         
	//*  26   55:getfield        #43  <Field zzba zzdhe>
	//*  27   58:ifnonnull       78
	//*  28   61:aload_0         
	//*  29   62:getfield        #45  <Field byte[] zzdhf>
	//*  30   65:ifnonnull       78
			throw new IllegalStateException("Invalid internal representation - empty");
	//   31   68:new             #52  <Class IllegalStateException>
	//   32   71:dup             
	//   33   72:ldc1            #59  <String "Invalid internal representation - empty">
	//   34   74:invokespecial   #57  <Method void IllegalStateException(String)>
	//   35   77:athrow          
		else
			throw new IllegalStateException("Impossible");
	//   36   78:new             #52  <Class IllegalStateException>
	//   37   81:dup             
	//   38   82:ldc1            #61  <String "Impossible">
	//   39   84:invokespecial   #57  <Method void IllegalStateException(String)>
	//   40   87:athrow          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #69  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, versionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #41  <Field int versionCode>
	//    7   11:invokestatic    #73  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		byte abyte0[];
		if(zzdhf != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #45  <Field byte[] zzdhf>
	//*  10   18:ifnull          29
			abyte0 = zzdhf;
	//   11   21:aload_0         
	//   12   22:getfield        #45  <Field byte[] zzdhf>
	//   13   25:astore_3        
		else
	//*  14   26:goto            37
			abyte0 = zzbfi.zzb(((zzbfi) (zzdhe)));
	//   15   29:aload_0         
	//   16   30:getfield        #43  <Field zzba zzdhe>
	//   17   33:invokestatic    #79  <Method byte[] zzbfi.zzb(zzbfi)>
	//   18   36:astore_3        
		SafeParcelWriter.writeByteArray(parcel, 2, abyte0, false);
	//   19   37:aload_1         
	//   20   38:iconst_2        
	//   21   39:aload_3         
	//   22   40:iconst_0        
	//   23   41:invokestatic    #83  <Method void SafeParcelWriter.writeByteArray(Parcel, int, byte[], boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   24   44:aload_1         
	//   25   45:iload_2         
	//   26   46:invokestatic    #86  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   27   49:return          
	}

	public final zzba zzwe()
	{
		boolean flag;
		if(zzdhe != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field zzba zzdhe>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		if(!flag)
	//*   8   14:iload_1         
	//*   9   15:ifne            59
			try
			{
				byte abyte0[] = zzdhf;
	//   10   18:aload_0         
	//   11   19:getfield        #45  <Field byte[] zzdhf>
	//   12   22:astore_2        
				zzdhe = (zzba)zzbfi.zza(((zzbfi) (new zzba())), abyte0);
	//   13   23:aload_0         
	//   14   24:new             #92  <Class zzba>
	//   15   27:dup             
	//   16   28:invokespecial   #93  <Method void zzba()>
	//   17   31:aload_2         
	//   18   32:invokestatic    #97  <Method zzbfi zzbfi.zza(zzbfi, byte[])>
	//   19   35:checkcast       #92  <Class zzba>
	//   20   38:putfield        #43  <Field zzba zzdhe>
				zzdhf = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #45  <Field byte[] zzdhf>
			}
	//*  24   46:goto            59
			catch(zzbfh zzbfh1)
	//*  25   49:astore_2        
			{
				throw new IllegalStateException(((Throwable) (zzbfh1)));
	//   26   50:new             #52  <Class IllegalStateException>
	//   27   53:dup             
	//   28   54:aload_2         
	//   29   55:invokespecial   #100 <Method void IllegalStateException(Throwable)>
	//   30   58:athrow          
			}
		zzwf();
	//   31   59:aload_0         
	//   32   60:invokespecial   #48  <Method void zzwf()>
		return zzdhe;
	//   33   63:aload_0         
	//   34   64:getfield        #43  <Field zzba zzdhe>
	//   35   67:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzatw();
	private final int versionCode;
	private zzba zzdhe;
	private byte zzdhf[];

	static 
	{
	//    0    0:new             #29  <Class zzatw>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void zzatw()>
	//    3    7:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
