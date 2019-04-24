// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.location.places:
//			PlaceReport

public class zzl
	implements android.os.Parcelable.Creator
{

	public zzl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(PlaceReport placereport, Parcel parcel, int i)
	{
		i = zzc.zzaV(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaV(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 1, placereport.mVersionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int PlaceReport.mVersionCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 2, placereport.getPlaceId(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #34  <Method String PlaceReport.getPlaceId()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #37  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zza(parcel, 3, placereport.getTag(), false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #40  <Method String PlaceReport.getTag()>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #37  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zza(parcel, 4, placereport.getSource(), false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #43  <Method String PlaceReport.getSource()>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #37  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zzJ(parcel, i);
	//   26   44:aload_1         
	//   27   45:iload_2         
	//   28   46:invokestatic    #47  <Method void zzc.zzJ(Parcel, int)>
	//   29   49:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzhb(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #53  <Method PlaceReport zzhb(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzkD(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #59  <Method PlaceReport[] zzkD(int)>
	//    3    5:areturn         
	}

	public PlaceReport zzhb(Parcel parcel)
	{
		String s2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		int j = zzb.zzaU(parcel);
	//    2    3:aload_1         
	//    3    4:invokestatic    #64  <Method int zzb.zzaU(Parcel)>
	//    4    7:istore_3        
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		String s1 = null;
	//    7   10:aconst_null     
	//    8   11:astore          6
		String s = null;
	//    9   13:aconst_null     
	//   10   14:astore          5
		do
			if(parcel.dataPosition() < j)
	//*  11   16:aload_1         
	//*  12   17:invokevirtual   #70  <Method int Parcel.dataPosition()>
	//*  13   20:iload_3         
	//*  14   21:icmpge          116
			{
				int k = zzb.zzaT(parcel);
	//   15   24:aload_1         
	//   16   25:invokestatic    #73  <Method int zzb.zzaT(Parcel)>
	//   17   28:istore          4
				switch(zzb.zzcW(k))
	//*  18   30:iload           4
	//*  19   32:invokestatic    #77  <Method int zzb.zzcW(int)>
				{
	//*  20   35:tableswitch     1 4: default 64
	//	               1 73
	//	               2 83
	//	               3 94
	//	               4 105
				default:
					zzb.zzb(parcel, k);
	//   21   64:aload_1         
	//   22   65:iload           4
	//   23   67:invokestatic    #80  <Method void zzb.zzb(Parcel, int)>
					break;

	//*  24   70:goto            16
				case 1: // '\001'
					i = zzb.zzg(parcel, k);
	//   25   73:aload_1         
	//   26   74:iload           4
	//   27   76:invokestatic    #84  <Method int zzb.zzg(Parcel, int)>
	//   28   79:istore_2        
					break;

	//*  29   80:goto            16
				case 2: // '\002'
					s = zzb.zzq(parcel, k);
	//   30   83:aload_1         
	//   31   84:iload           4
	//   32   86:invokestatic    #88  <Method String zzb.zzq(Parcel, int)>
	//   33   89:astore          5
					break;

	//*  34   91:goto            16
				case 3: // '\003'
					s1 = zzb.zzq(parcel, k);
	//   35   94:aload_1         
	//   36   95:iload           4
	//   37   97:invokestatic    #88  <Method String zzb.zzq(Parcel, int)>
	//   38  100:astore          6
					break;

	//*  39  102:goto            16
				case 4: // '\004'
					s2 = zzb.zzq(parcel, k);
	//   40  105:aload_1         
	//   41  106:iload           4
	//   42  108:invokestatic    #88  <Method String zzb.zzq(Parcel, int)>
	//   43  111:astore          7
					break;
				}
			} else
	//*  44  113:goto            16
			if(parcel.dataPosition() != j)
	//*  45  116:aload_1         
	//*  46  117:invokevirtual   #70  <Method int Parcel.dataPosition()>
	//*  47  120:iload_3         
	//*  48  121:icmpeq          154
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   49  124:new             #90  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   50  127:dup             
	//   51  128:new             #92  <Class StringBuilder>
	//   52  131:dup             
	//   53  132:bipush          37
	//   54  134:invokespecial   #95  <Method void StringBuilder(int)>
	//   55  137:ldc1            #97  <String "Overread allowed size end=">
	//   56  139:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   57  142:iload_3         
	//   58  143:invokevirtual   #104 <Method StringBuilder StringBuilder.append(int)>
	//   59  146:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   60  149:aload_1         
	//   61  150:invokespecial   #110 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   62  153:athrow          
			else
				return new PlaceReport(i, s, s1, s2);
	//   63  154:new             #22  <Class PlaceReport>
	//   64  157:dup             
	//   65  158:iload_2         
	//   66  159:aload           5
	//   67  161:aload           6
	//   68  163:aload           7
	//   69  165:invokespecial   #113 <Method void PlaceReport(int, String, String, String)>
	//   70  168:areturn         
		while(true);
	}

	public PlaceReport[] zzkD(int i)
	{
		return new PlaceReport[i];
	//    0    0:iload_1         
	//    1    1:anewarray       PlaceReport[]
	//    2    4:areturn         
	}
}
