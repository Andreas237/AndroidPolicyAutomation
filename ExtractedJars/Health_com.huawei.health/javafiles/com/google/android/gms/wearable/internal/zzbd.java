// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzbe

public class zzbd
	implements android.os.Parcelable.Creator
{

	public zzbd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzbe zzbe1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 2, zzbe1.statusCode);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzbe.statusCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 3, zzbe1.zzbUx);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field boolean zzbe.zzbUx>
	//   12   20:invokestatic    #37  <Method void zzc.zza(Parcel, int, boolean)>
		zzc.zza(parcel, 4, zzbe1.zzbUy);
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:getfield        #40  <Field boolean zzbe.zzbUy>
	//   17   29:invokestatic    #37  <Method void zzc.zza(Parcel, int, boolean)>
		zzc.zzJ(parcel, i);
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:invokestatic    #44  <Method void zzc.zzJ(Parcel, int)>
	//   21   37:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzlf(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #50  <Method zzbe zzlf(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzpH(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #56  <Method zzbe[] zzpH(int)>
	//    3    5:areturn         
	}

	public zzbe zzlf(Parcel parcel)
	{
		int j = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #61  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		boolean flag1 = false;
	//    5    7:iconst_0        
	//    6    8:istore          6
		boolean flag = false;
	//    7   10:iconst_0        
	//    8   11:istore          5
		do
			if(parcel.dataPosition() < j)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #67  <Method int Parcel.dataPosition()>
	//*  11   17:iload_3         
	//*  12   18:icmpge          104
			{
				int k = zzb.zzaX(parcel);
	//   13   21:aload_1         
	//   14   22:invokestatic    #70  <Method int zzb.zzaX(Parcel)>
	//   15   25:istore          4
				switch(zzb.zzdc(k))
	//*  16   27:iload           4
	//*  17   29:invokestatic    #74  <Method int zzb.zzdc(int)>
				{
	//*  18   32:tableswitch     2 4: default 60
	//	               2 63
	//	               3 73
	//	               4 84
	//*  19   60:goto            95
				case 2: // '\002'
					i = zzb.zzg(parcel, k);
	//   20   63:aload_1         
	//   21   64:iload           4
	//   22   66:invokestatic    #78  <Method int zzb.zzg(Parcel, int)>
	//   23   69:istore_2        
					break;

	//*  24   70:goto            101
				case 3: // '\003'
					flag1 = zzb.zzc(parcel, k);
	//   25   73:aload_1         
	//   26   74:iload           4
	//   27   76:invokestatic    #81  <Method boolean zzb.zzc(Parcel, int)>
	//   28   79:istore          6
					break;

	//*  29   81:goto            101
				case 4: // '\004'
					flag = zzb.zzc(parcel, k);
	//   30   84:aload_1         
	//   31   85:iload           4
	//   32   87:invokestatic    #81  <Method boolean zzb.zzc(Parcel, int)>
	//   33   90:istore          5
					break;

	//*  34   92:goto            101
				default:
					zzb.zzb(parcel, k);
	//   35   95:aload_1         
	//   36   96:iload           4
	//   37   98:invokestatic    #84  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  38  101:goto            13
			if(parcel.dataPosition() != j)
	//*  39  104:aload_1         
	//*  40  105:invokevirtual   #67  <Method int Parcel.dataPosition()>
	//*  41  108:iload_3         
	//*  42  109:icmpeq          142
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   43  112:new             #86  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   44  115:dup             
	//   45  116:new             #88  <Class StringBuilder>
	//   46  119:dup             
	//   47  120:bipush          37
	//   48  122:invokespecial   #91  <Method void StringBuilder(int)>
	//   49  125:ldc1            #93  <String "Overread allowed size end=">
	//   50  127:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   51  130:iload_3         
	//   52  131:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   53  134:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   54  137:aload_1         
	//   55  138:invokespecial   #107 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   56  141:athrow          
			else
				return new zzbe(i, flag1, flag);
	//   57  142:new             #22  <Class zzbe>
	//   58  145:dup             
	//   59  146:iload_2         
	//   60  147:iload           6
	//   61  149:iload           5
	//   62  151:invokespecial   #110 <Method void zzbe(int, boolean, boolean)>
	//   63  154:areturn         
		while(true);
	}

	public zzbe[] zzpH(int i)
	{
		return new zzbe[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzbe[]
	//    2    4:areturn         
	}
}
