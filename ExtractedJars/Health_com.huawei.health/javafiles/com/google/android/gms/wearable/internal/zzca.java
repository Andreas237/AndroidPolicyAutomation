// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzbz

public class zzca
	implements android.os.Parcelable.Creator
{

	public zzca()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzbz zzbz1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 2, zzbz1.getRequestId());
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #26  <Method int zzbz.getRequestId()>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 3, zzbz1.getPath(), false);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #34  <Method String zzbz.getPath()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #37  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zza(parcel, 4, zzbz1.getData(), false);
	//   14   24:aload_1         
	//   15   25:iconst_4        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #41  <Method byte[] zzbz.getData()>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #44  <Method void zzc.zza(Parcel, int, byte[], boolean)>
		zzc.zza(parcel, 5, zzbz1.getSourceNodeId(), false);
	//   20   34:aload_1         
	//   21   35:iconst_5        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #47  <Method String zzbz.getSourceNodeId()>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #37  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zzJ(parcel, i);
	//   26   44:aload_1         
	//   27   45:iload_2         
	//   28   46:invokestatic    #51  <Method void zzc.zzJ(Parcel, int)>
	//   29   49:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzln(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #57  <Method zzbz zzln(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzpP(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #63  <Method zzbz[] zzpP(int)>
	//    3    5:areturn         
	}

	public zzbz zzln(Parcel parcel)
	{
		int j = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #68  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		String s1 = null;
	//    5    7:aconst_null     
	//    6    8:astore          7
		byte abyte0[] = null;
	//    7   10:aconst_null     
	//    8   11:astore          6
		String s = null;
	//    9   13:aconst_null     
	//   10   14:astore          5
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
	//	               3 77
	//	               4 88
	//	               5 99
	//*  21   64:goto            110
				case 2: // '\002'
					i = zzb.zzg(parcel, k);
	//   22   67:aload_1         
	//   23   68:iload           4
	//   24   70:invokestatic    #84  <Method int zzb.zzg(Parcel, int)>
	//   25   73:istore_2        
					break;

	//*  26   74:goto            116
				case 3: // '\003'
					s1 = zzb.zzq(parcel, k);
	//   27   77:aload_1         
	//   28   78:iload           4
	//   29   80:invokestatic    #88  <Method String zzb.zzq(Parcel, int)>
	//   30   83:astore          7
					break;

	//*  31   85:goto            116
				case 4: // '\004'
					abyte0 = zzb.zzt(parcel, k);
	//   32   88:aload_1         
	//   33   89:iload           4
	//   34   91:invokestatic    #92  <Method byte[] zzb.zzt(Parcel, int)>
	//   35   94:astore          6
					break;

	//*  36   96:goto            116
				case 5: // '\005'
					s = zzb.zzq(parcel, k);
	//   37   99:aload_1         
	//   38  100:iload           4
	//   39  102:invokestatic    #88  <Method String zzb.zzq(Parcel, int)>
	//   40  105:astore          5
					break;

	//*  41  107:goto            116
				default:
					zzb.zzb(parcel, k);
	//   42  110:aload_1         
	//   43  111:iload           4
	//   44  113:invokestatic    #95  <Method void zzb.zzb(Parcel, int)>
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
	//   50  127:new             #97  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   51  130:dup             
	//   52  131:new             #99  <Class StringBuilder>
	//   53  134:dup             
	//   54  135:bipush          37
	//   55  137:invokespecial   #102 <Method void StringBuilder(int)>
	//   56  140:ldc1            #104 <String "Overread allowed size end=">
	//   57  142:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   58  145:iload_3         
	//   59  146:invokevirtual   #111 <Method StringBuilder StringBuilder.append(int)>
	//   60  149:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   61  152:aload_1         
	//   62  153:invokespecial   #117 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   63  156:athrow          
			else
				return new zzbz(i, s1, abyte0, s);
	//   64  157:new             #22  <Class zzbz>
	//   65  160:dup             
	//   66  161:iload_2         
	//   67  162:aload           7
	//   68  164:aload           6
	//   69  166:aload           5
	//   70  168:invokespecial   #120 <Method void zzbz(int, String, byte[], String)>
	//   71  171:areturn         
		while(true);
	}

	public zzbz[] zzpP(int i)
	{
		return new zzbz[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzbz[]
	//    2    4:areturn         
	}
}
