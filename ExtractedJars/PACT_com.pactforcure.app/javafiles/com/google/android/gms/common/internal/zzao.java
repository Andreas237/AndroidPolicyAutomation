// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzan

public class zzao
	implements android.os.Parcelable.Creator
{

	public zzao()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzan zzan1, Parcel parcel, int i)
	{
		i = zzc.zzaV(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaV(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 1, zzan1.mVersionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzan.mVersionCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzJ(parcel, i);
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:invokestatic    #34  <Method void zzc.zzJ(Parcel, int)>
	//   11   19:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzaS(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method zzan zzaS(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzcV(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #46  <Method zzan[] zzcV(int)>
	//    3    5:areturn         
	}

	public zzan zzaS(Parcel parcel)
	{
		int j = zzb.zzaU(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #51  <Method int zzb.zzaU(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		do
			if(parcel.dataPosition() < j)
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #57  <Method int Parcel.dataPosition()>
	//*   7   11:iload_3         
	//*   8   12:icmpge          63
			{
				int k = zzb.zzaT(parcel);
	//    9   15:aload_1         
	//   10   16:invokestatic    #60  <Method int zzb.zzaT(Parcel)>
	//   11   19:istore          4
				switch(zzb.zzcW(k))
	//*  12   21:iload           4
	//*  13   23:invokestatic    #64  <Method int zzb.zzcW(int)>
				{
	//*  14   26:tableswitch     1 1: default 44
	//	               1 53
				default:
					zzb.zzb(parcel, k);
	//   15   44:aload_1         
	//   16   45:iload           4
	//   17   47:invokestatic    #67  <Method void zzb.zzb(Parcel, int)>
					break;

	//*  18   50:goto            7
				case 1: // '\001'
					i = zzb.zzg(parcel, k);
	//   19   53:aload_1         
	//   20   54:iload           4
	//   21   56:invokestatic    #71  <Method int zzb.zzg(Parcel, int)>
	//   22   59:istore_2        
					break;
				}
			} else
	//*  23   60:goto            7
			if(parcel.dataPosition() != j)
	//*  24   63:aload_1         
	//*  25   64:invokevirtual   #57  <Method int Parcel.dataPosition()>
	//*  26   67:iload_3         
	//*  27   68:icmpeq          101
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   28   71:new             #73  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   29   74:dup             
	//   30   75:new             #75  <Class StringBuilder>
	//   31   78:dup             
	//   32   79:bipush          37
	//   33   81:invokespecial   #78  <Method void StringBuilder(int)>
	//   34   84:ldc1            #80  <String "Overread allowed size end=">
	//   35   86:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   36   89:iload_3         
	//   37   90:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   38   93:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   39   96:aload_1         
	//   40   97:invokespecial   #94  <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   41  100:athrow          
			else
				return new zzan(i);
	//   42  101:new             #22  <Class zzan>
	//   43  104:dup             
	//   44  105:iload_2         
	//   45  106:invokespecial   #95  <Method void zzan(int)>
	//   46  109:areturn         
		while(true);
	}

	public zzan[] zzcV(int i)
	{
		return new zzan[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzan[]
	//    2    4:areturn         
	}
}
