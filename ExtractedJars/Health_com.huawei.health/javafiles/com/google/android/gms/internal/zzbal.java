// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzbak

public class zzbal
	implements android.os.Parcelable.Creator
{

	public zzbal()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzbak zzbak1, Parcel parcel, int i)
	{
		int j = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_3        
		zzc.zzc(parcel, 1, zzbak1.zzaiI);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzbak.zzaiI>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 2, zzbak1.zzPP());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #34  <Method int zzbak.zzPP()>
	//   12   20:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 3, ((android.os.Parcelable) (zzbak1.zzPQ())), i, false);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #38  <Method Intent zzbak.zzPQ()>
	//   17   29:iload_2         
	//   18   30:iconst_0        
	//   19   31:invokestatic    #41  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zzJ(parcel, j);
	//   20   34:aload_1         
	//   21   35:iload_3         
	//   22   36:invokestatic    #45  <Method void zzc.zzJ(Parcel, int)>
	//   23   39:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzju(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method zzbak zzju(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zznt(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #57  <Method zzbak[] zznt(int)>
	//    3    5:areturn         
	}

	public zzbak zzju(Parcel parcel)
	{
		int k = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #62  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		Intent intent = null;
	//    7   10:aconst_null     
	//    8   11:astore          6
		do
			if(parcel.dataPosition() < k)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #67  <Method int Parcel.dataPosition()>
	//*  11   17:iload           4
	//*  12   19:icmpge          109
			{
				int l = zzb.zzaX(parcel);
	//   13   22:aload_1         
	//   14   23:invokestatic    #70  <Method int zzb.zzaX(Parcel)>
	//   15   26:istore          5
				switch(zzb.zzdc(l))
	//*  16   28:iload           5
	//*  17   30:invokestatic    #74  <Method int zzb.zzdc(int)>
				{
	//*  18   33:tableswitch     1 3: default 60
	//	               1 63
	//	               2 73
	//	               3 83
	//*  19   60:goto            100
				case 1: // '\001'
					j = zzb.zzg(parcel, l);
	//   20   63:aload_1         
	//   21   64:iload           5
	//   22   66:invokestatic    #78  <Method int zzb.zzg(Parcel, int)>
	//   23   69:istore_3        
					break;

	//*  24   70:goto            106
				case 2: // '\002'
					i = zzb.zzg(parcel, l);
	//   25   73:aload_1         
	//   26   74:iload           5
	//   27   76:invokestatic    #78  <Method int zzb.zzg(Parcel, int)>
	//   28   79:istore_2        
					break;

	//*  29   80:goto            106
				case 3: // '\003'
					intent = (Intent)zzb.zza(parcel, l, Intent.CREATOR);
	//   30   83:aload_1         
	//   31   84:iload           5
	//   32   86:getstatic       #84  <Field android.os.Parcelable$Creator Intent.CREATOR>
	//   33   89:invokestatic    #87  <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   34   92:checkcast       #80  <Class Intent>
	//   35   95:astore          6
					break;

	//*  36   97:goto            106
				default:
					zzb.zzb(parcel, l);
	//   37  100:aload_1         
	//   38  101:iload           5
	//   39  103:invokestatic    #90  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  40  106:goto            13
			if(parcel.dataPosition() != k)
	//*  41  109:aload_1         
	//*  42  110:invokevirtual   #67  <Method int Parcel.dataPosition()>
	//*  43  113:iload           4
	//*  44  115:icmpeq          149
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(k).toString(), parcel);
	//   45  118:new             #92  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   46  121:dup             
	//   47  122:new             #94  <Class StringBuilder>
	//   48  125:dup             
	//   49  126:bipush          37
	//   50  128:invokespecial   #97  <Method void StringBuilder(int)>
	//   51  131:ldc1            #99  <String "Overread allowed size end=">
	//   52  133:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   53  136:iload           4
	//   54  138:invokevirtual   #106 <Method StringBuilder StringBuilder.append(int)>
	//   55  141:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   56  144:aload_1         
	//   57  145:invokespecial   #113 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   58  148:athrow          
			else
				return new zzbak(j, i, intent);
	//   59  149:new             #22  <Class zzbak>
	//   60  152:dup             
	//   61  153:iload_3         
	//   62  154:iload_2         
	//   63  155:aload           6
	//   64  157:invokespecial   #116 <Method void zzbak(int, int, Intent)>
	//   65  160:areturn         
		while(true);
	}

	public zzbak[] zznt(int i)
	{
		return new zzbak[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzbak[]
	//    2    4:areturn         
	}
}
