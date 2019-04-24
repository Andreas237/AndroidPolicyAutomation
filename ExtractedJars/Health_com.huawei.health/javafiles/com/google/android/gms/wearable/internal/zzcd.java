// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcc

public class zzcd
	implements android.os.Parcelable.Creator
{

	public zzcd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzcc zzcc1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zza(parcel, 2, zzcc1.getId(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #26  <Method String zzcc.getId()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #29  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zza(parcel, 3, zzcc1.getDisplayName(), false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #32  <Method String zzcc.getDisplayName()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #29  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zzc(parcel, 4, zzcc1.getHopCount());
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #36  <Method int zzcc.getHopCount()>
	//   19   31:invokestatic    #40  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 5, zzcc1.isNearby());
	//   20   34:aload_1         
	//   21   35:iconst_5        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #44  <Method boolean zzcc.isNearby()>
	//   24   40:invokestatic    #47  <Method void zzc.zza(Parcel, int, boolean)>
		zzc.zzJ(parcel, i);
	//   25   43:aload_1         
	//   26   44:iload_2         
	//   27   45:invokestatic    #51  <Method void zzc.zzJ(Parcel, int)>
	//   28   48:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzlo(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #57  <Method zzcc zzlo(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzpQ(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #63  <Method zzcc[] zzpQ(int)>
	//    3    5:areturn         
	}

	public zzcc zzlo(Parcel parcel)
	{
		int j = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #68  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_3        
		String s1 = null;
	//    3    5:aconst_null     
	//    4    6:astore          7
		String s = null;
	//    5    8:aconst_null     
	//    6    9:astore          6
		int i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		boolean flag = false;
	//    9   13:iconst_0        
	//   10   14:istore          5
		do
			if(parcel.dataPosition() < j)
	//*  11   16:aload_1         
	//*  12   17:invokevirtual   #73  <Method int Parcel.dataPosition()>
	//*  13   20:iload_3         
	//*  14   21:icmpge          119
			{
				int k = zzb.zzaX(parcel);
	//   15   24:aload_1         
	//   16   25:invokestatic    #76  <Method int zzb.zzaX(Parcel)>
	//   17   28:istore          4
				switch(zzb.zzdc(k))
	//*  18   30:iload           4
	//*  19   32:invokestatic    #80  <Method int zzb.zzdc(int)>
				{
	//*  20   35:tableswitch     2 5: default 64
	//	               2 67
	//	               3 78
	//	               4 89
	//	               5 99
	//*  21   64:goto            110
				case 2: // '\002'
					s1 = zzb.zzq(parcel, k);
	//   22   67:aload_1         
	//   23   68:iload           4
	//   24   70:invokestatic    #84  <Method String zzb.zzq(Parcel, int)>
	//   25   73:astore          7
					break;

	//*  26   75:goto            116
				case 3: // '\003'
					s = zzb.zzq(parcel, k);
	//   27   78:aload_1         
	//   28   79:iload           4
	//   29   81:invokestatic    #84  <Method String zzb.zzq(Parcel, int)>
	//   30   84:astore          6
					break;

	//*  31   86:goto            116
				case 4: // '\004'
					i = zzb.zzg(parcel, k);
	//   32   89:aload_1         
	//   33   90:iload           4
	//   34   92:invokestatic    #88  <Method int zzb.zzg(Parcel, int)>
	//   35   95:istore_2        
					break;

	//*  36   96:goto            116
				case 5: // '\005'
					flag = zzb.zzc(parcel, k);
	//   37   99:aload_1         
	//   38  100:iload           4
	//   39  102:invokestatic    #91  <Method boolean zzb.zzc(Parcel, int)>
	//   40  105:istore          5
					break;

	//*  41  107:goto            116
				default:
					zzb.zzb(parcel, k);
	//   42  110:aload_1         
	//   43  111:iload           4
	//   44  113:invokestatic    #94  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  45  116:goto            16
			if(parcel.dataPosition() != j)
	//*  46  119:aload_1         
	//*  47  120:invokevirtual   #73  <Method int Parcel.dataPosition()>
	//*  48  123:iload_3         
	//*  49  124:icmpeq          157
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   50  127:new             #96  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   51  130:dup             
	//   52  131:new             #98  <Class StringBuilder>
	//   53  134:dup             
	//   54  135:bipush          37
	//   55  137:invokespecial   #101 <Method void StringBuilder(int)>
	//   56  140:ldc1            #103 <String "Overread allowed size end=">
	//   57  142:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   58  145:iload_3         
	//   59  146:invokevirtual   #110 <Method StringBuilder StringBuilder.append(int)>
	//   60  149:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   61  152:aload_1         
	//   62  153:invokespecial   #116 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   63  156:athrow          
			else
				return new zzcc(s1, s, i, flag);
	//   64  157:new             #22  <Class zzcc>
	//   65  160:dup             
	//   66  161:aload           7
	//   67  163:aload           6
	//   68  165:iload_2         
	//   69  166:iload           5
	//   70  168:invokespecial   #119 <Method void zzcc(String, String, int, boolean)>
	//   71  171:areturn         
		while(true);
	}

	public zzcc[] zzpQ(int i)
	{
		return new zzcc[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzcc[]
	//    2    4:areturn         
	}
}
