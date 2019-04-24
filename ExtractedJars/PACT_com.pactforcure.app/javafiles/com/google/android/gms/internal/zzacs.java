// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzacr, zzaco

public class zzacs
	implements android.os.Parcelable.Creator
{

	public zzacs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzacr zzacr1, Parcel parcel, int i)
	{
		int j = zzc.zzaV(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaV(Parcel)>
	//    2    4:istore_3        
		zzc.zzc(parcel, 1, zzacr1.getVersionCode());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #26  <Method int zzacr.getVersionCode()>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 2, zzacr1.zzya(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #34  <Method Parcel zzacr.zzya()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #37  <Method void zzc.zza(Parcel, int, Parcel, boolean)>
		zzc.zza(parcel, 3, ((android.os.Parcelable) (zzacr1.zzyb())), i, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #41  <Method zzaco zzacr.zzyb()>
	//   18   30:iload_2         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #44  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zzJ(parcel, j);
	//   21   35:aload_1         
	//   22   36:iload_3         
	//   23   37:invokestatic    #48  <Method void zzc.zzJ(Parcel, int)>
	//   24   40:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzbe(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #54  <Method zzacr zzbe(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzdg(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #60  <Method zzacr[] zzdg(int)>
	//    3    5:areturn         
	}

	public zzacr zzbe(Parcel parcel)
	{
		zzaco zzaco1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		int j = zzb.zzaU(parcel);
	//    2    3:aload_1         
	//    3    4:invokestatic    #65  <Method int zzb.zzaU(Parcel)>
	//    4    7:istore_3        
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		Parcel parcel1 = null;
	//    7   10:aconst_null     
	//    8   11:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #70  <Method int Parcel.dataPosition()>
	//*  11   17:iload_3         
	//*  12   18:icmpge          107
			{
				int k = zzb.zzaT(parcel);
	//   13   21:aload_1         
	//   14   22:invokestatic    #73  <Method int zzb.zzaT(Parcel)>
	//   15   25:istore          4
				switch(zzb.zzcW(k))
	//*  16   27:iload           4
	//*  17   29:invokestatic    #77  <Method int zzb.zzcW(int)>
				{
	//*  18   32:tableswitch     1 3: default 60
	//	               1 69
	//	               2 79
	//	               3 90
				default:
					zzb.zzb(parcel, k);
	//   19   60:aload_1         
	//   20   61:iload           4
	//   21   63:invokestatic    #80  <Method void zzb.zzb(Parcel, int)>
					break;

	//*  22   66:goto            13
				case 1: // '\001'
					i = zzb.zzg(parcel, k);
	//   23   69:aload_1         
	//   24   70:iload           4
	//   25   72:invokestatic    #84  <Method int zzb.zzg(Parcel, int)>
	//   26   75:istore_2        
					break;

	//*  27   76:goto            13
				case 2: // '\002'
					parcel1 = zzb.zzF(parcel, k);
	//   28   79:aload_1         
	//   29   80:iload           4
	//   30   82:invokestatic    #88  <Method Parcel zzb.zzF(Parcel, int)>
	//   31   85:astore          5
					break;

	//*  32   87:goto            13
				case 3: // '\003'
					zzaco1 = (zzaco)zzb.zza(parcel, k, zzaco.CREATOR);
	//   33   90:aload_1         
	//   34   91:iload           4
	//   35   93:getstatic       #94  <Field android.os.Parcelable$Creator zzaco.CREATOR>
	//   36   96:invokestatic    #97  <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   37   99:checkcast       #90  <Class zzaco>
	//   38  102:astore          6
					break;
				}
			} else
	//*  39  104:goto            13
			if(parcel.dataPosition() != j)
	//*  40  107:aload_1         
	//*  41  108:invokevirtual   #70  <Method int Parcel.dataPosition()>
	//*  42  111:iload_3         
	//*  43  112:icmpeq          145
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   44  115:new             #99  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   45  118:dup             
	//   46  119:new             #101 <Class StringBuilder>
	//   47  122:dup             
	//   48  123:bipush          37
	//   49  125:invokespecial   #104 <Method void StringBuilder(int)>
	//   50  128:ldc1            #106 <String "Overread allowed size end=">
	//   51  130:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   52  133:iload_3         
	//   53  134:invokevirtual   #113 <Method StringBuilder StringBuilder.append(int)>
	//   54  137:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   55  140:aload_1         
	//   56  141:invokespecial   #120 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   57  144:athrow          
			else
				return new zzacr(i, parcel1, zzaco1);
	//   58  145:new             #22  <Class zzacr>
	//   59  148:dup             
	//   60  149:iload_2         
	//   61  150:aload           5
	//   62  152:aload           6
	//   63  154:invokespecial   #123 <Method void zzacr(int, Parcel, zzaco)>
	//   64  157:areturn         
		while(true);
	}

	public zzacr[] zzdg(int i)
	{
		return new zzacr[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzacr[]
	//    2    4:areturn         
	}
}
