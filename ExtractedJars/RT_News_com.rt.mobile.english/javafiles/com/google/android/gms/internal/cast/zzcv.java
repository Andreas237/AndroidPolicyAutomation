// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.zzad;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzcw, zzcu

public final class zzcv extends AbstractSafeParcelable
{

	public zzcv()
	{
		this((0.0D / 0.0D), false, -1, ((ApplicationMetadata) (null)), -1, ((zzad) (null)));
	//    0    0:aload_0         
	//    1    1:ldc2w           #50  <Double (0.0D / 0.0D)>
	//    2    4:iconst_0        
	//    3    5:iconst_m1       
	//    4    6:aconst_null     
	//    5    7:iconst_m1       
	//    6    8:aconst_null     
	//    7    9:invokespecial   #54  <Method void zzcv(double, boolean, int, ApplicationMetadata, int, zzad)>
	//    8   12:return          
	}

	zzcv(double d, boolean flag, int i, ApplicationMetadata applicationmetadata, int j, zzad zzad)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void AbstractSafeParcelable()>
		zzei = d;
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:putfield        #59  <Field double zzei>
		zzej = flag;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #61  <Field boolean zzej>
		zzvg = i;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #63  <Field int zzvg>
		zzvr = applicationmetadata;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #65  <Field ApplicationMetadata zzvr>
		zzvh = j;
	//   14   26:aload_0         
	//   15   27:iload           6
	//   16   29:putfield        #67  <Field int zzvh>
		zzvf = zzad;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #69  <Field zzad zzvf>
	//   20   38:return          
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzcv))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzcv>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzcv)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzcv>
	//   12   20:astore_1        
		return zzei == ((zzcv) (obj)).zzei && zzej == ((zzcv) (obj)).zzej && zzvg == ((zzcv) (obj)).zzvg && zzcu.zza(((Object) (zzvr)), ((Object) (((zzcv) (obj)).zzvr))) && zzvh == ((zzcv) (obj)).zzvh && zzcu.zza(((Object) (zzvf)), ((Object) (zzvf)));
	//   13   21:aload_0         
	//   14   22:getfield        #59  <Field double zzei>
	//   15   25:aload_1         
	//   16   26:getfield        #59  <Field double zzei>
	//   17   29:dcmpl           
	//   18   30:ifne            96
	//   19   33:aload_0         
	//   20   34:getfield        #61  <Field boolean zzej>
	//   21   37:aload_1         
	//   22   38:getfield        #61  <Field boolean zzej>
	//   23   41:icmpne          96
	//   24   44:aload_0         
	//   25   45:getfield        #63  <Field int zzvg>
	//   26   48:aload_1         
	//   27   49:getfield        #63  <Field int zzvg>
	//   28   52:icmpne          96
	//   29   55:aload_0         
	//   30   56:getfield        #65  <Field ApplicationMetadata zzvr>
	//   31   59:aload_1         
	//   32   60:getfield        #65  <Field ApplicationMetadata zzvr>
	//   33   63:invokestatic    #79  <Method boolean zzcu.zza(Object, Object)>
	//   34   66:ifeq            96
	//   35   69:aload_0         
	//   36   70:getfield        #67  <Field int zzvh>
	//   37   73:aload_1         
	//   38   74:getfield        #67  <Field int zzvh>
	//   39   77:icmpne          96
	//   40   80:aload_0         
	//   41   81:getfield        #69  <Field zzad zzvf>
	//   42   84:aload_0         
	//   43   85:getfield        #69  <Field zzad zzvf>
	//   44   88:invokestatic    #79  <Method boolean zzcu.zza(Object, Object)>
	//   45   91:ifeq            96
	//   46   94:iconst_1        
	//   47   95:ireturn         
	//   48   96:iconst_0        
	//   49   97:ireturn         
	}

	public final int getActiveInputState()
	{
		return zzvg;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int zzvg>
	//    2    4:ireturn         
	}

	public final ApplicationMetadata getApplicationMetadata()
	{
		return zzvr;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field ApplicationMetadata zzvr>
	//    2    4:areturn         
	}

	public final int getStandbyState()
	{
		return zzvh;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int zzvh>
	//    2    4:ireturn         
	}

	public final double getVolume()
	{
		return zzei;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field double zzei>
	//    2    4:dreturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Double.valueOf(zzei), Boolean.valueOf(zzej), Integer.valueOf(zzvg), zzvr, Integer.valueOf(zzvh), zzvf
		});
	//    0    0:bipush          6
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #59  <Field double zzei>
	//    6   11:invokestatic    #91  <Method Double Double.valueOf(double)>
	//    7   14:aastore         
	//    8   15:dup             
	//    9   16:iconst_1        
	//   10   17:aload_0         
	//   11   18:getfield        #61  <Field boolean zzej>
	//   12   21:invokestatic    #96  <Method Boolean Boolean.valueOf(boolean)>
	//   13   24:aastore         
	//   14   25:dup             
	//   15   26:iconst_2        
	//   16   27:aload_0         
	//   17   28:getfield        #63  <Field int zzvg>
	//   18   31:invokestatic    #101 <Method Integer Integer.valueOf(int)>
	//   19   34:aastore         
	//   20   35:dup             
	//   21   36:iconst_3        
	//   22   37:aload_0         
	//   23   38:getfield        #65  <Field ApplicationMetadata zzvr>
	//   24   41:aastore         
	//   25   42:dup             
	//   26   43:iconst_4        
	//   27   44:aload_0         
	//   28   45:getfield        #67  <Field int zzvh>
	//   29   48:invokestatic    #101 <Method Integer Integer.valueOf(int)>
	//   30   51:aastore         
	//   31   52:dup             
	//   32   53:iconst_5        
	//   33   54:aload_0         
	//   34   55:getfield        #69  <Field zzad zzvf>
	//   35   58:aastore         
	//   36   59:invokestatic    #106 <Method int Objects.hashCode(Object[])>
	//   37   62:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #114 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeDouble(parcel, 2, zzei);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #59  <Field double zzei>
	//    7   11:invokestatic    #118 <Method void SafeParcelWriter.writeDouble(Parcel, int, double)>
		SafeParcelWriter.writeBoolean(parcel, 3, zzej);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #61  <Field boolean zzej>
	//   12   20:invokestatic    #122 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 4, zzvg);
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:getfield        #63  <Field int zzvg>
	//   17   29:invokestatic    #126 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeParcelable(parcel, 5, ((android.os.Parcelable) (zzvr)), i, false);
	//   18   32:aload_1         
	//   19   33:iconst_5        
	//   20   34:aload_0         
	//   21   35:getfield        #65  <Field ApplicationMetadata zzvr>
	//   22   38:iload_2         
	//   23   39:iconst_0        
	//   24   40:invokestatic    #130 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 6, zzvh);
	//   25   43:aload_1         
	//   26   44:bipush          6
	//   27   46:aload_0         
	//   28   47:getfield        #67  <Field int zzvh>
	//   29   50:invokestatic    #126 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeParcelable(parcel, 7, ((android.os.Parcelable) (zzvf)), i, false);
	//   30   53:aload_1         
	//   31   54:bipush          7
	//   32   56:aload_0         
	//   33   57:getfield        #69  <Field zzad zzvf>
	//   34   60:iload_2         
	//   35   61:iconst_0        
	//   36   62:invokestatic    #130 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   37   65:aload_1         
	//   38   66:iload_3         
	//   39   67:invokestatic    #133 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   40   70:return          
	}

	public final boolean zzcv()
	{
		return zzej;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean zzej>
	//    2    4:ireturn         
	}

	public final zzad zzcw()
	{
		return zzvf;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field zzad zzvf>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzcw();
	private double zzei;
	private boolean zzej;
	private zzad zzvf;
	private int zzvg;
	private int zzvh;
	private ApplicationMetadata zzvr;

	static 
	{
	//    0    0:new             #43  <Class zzcw>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void zzcw()>
	//    3    7:putstatic       #48  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
