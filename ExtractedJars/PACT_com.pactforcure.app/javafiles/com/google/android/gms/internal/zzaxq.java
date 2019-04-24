// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzaxp

public class zzaxq
	implements android.os.Parcelable.Creator
{

	public zzaxq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzaxp zzaxp1, Parcel parcel, int i)
	{
		int j = zzc.zzaV(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaV(Parcel)>
	//    2    4:istore_3        
		zzc.zzc(parcel, 1, zzaxp1.mVersionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzaxp.mVersionCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 2, zzaxp1.zzOk());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #34  <Method int zzaxp.zzOk()>
	//   12   20:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 3, ((android.os.Parcelable) (zzaxp1.zzOl())), i, false);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #38  <Method Intent zzaxp.zzOl()>
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
		return ((Object) (zziO(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method zzaxp zziO(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzmI(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #57  <Method zzaxp[] zzmI(int)>
	//    3    5:areturn         
	}

	public zzaxp zziO(Parcel parcel)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int k = zzb.zzaU(parcel);
	//    2    2:aload_1         
	//    3    3:invokestatic    #62  <Method int zzb.zzaU(Parcel)>
	//    4    6:istore          4
		Intent intent = null;
	//    5    8:aconst_null     
	//    6    9:astore          6
		int i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		do
			if(parcel.dataPosition() < k)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #67  <Method int Parcel.dataPosition()>
	//*  11   17:iload           4
	//*  12   19:icmpge          106
			{
				int l = zzb.zzaT(parcel);
	//   13   22:aload_1         
	//   14   23:invokestatic    #70  <Method int zzb.zzaT(Parcel)>
	//   15   26:istore          5
				switch(zzb.zzcW(l))
	//*  16   28:iload           5
	//*  17   30:invokestatic    #74  <Method int zzb.zzcW(int)>
				{
	//*  18   33:tableswitch     1 3: default 60
	//	               1 69
	//	               2 79
	//	               3 89
				default:
					zzb.zzb(parcel, l);
	//   19   60:aload_1         
	//   20   61:iload           5
	//   21   63:invokestatic    #77  <Method void zzb.zzb(Parcel, int)>
					break;

	//*  22   66:goto            13
				case 1: // '\001'
					i = zzb.zzg(parcel, l);
	//   23   69:aload_1         
	//   24   70:iload           5
	//   25   72:invokestatic    #81  <Method int zzb.zzg(Parcel, int)>
	//   26   75:istore_2        
					break;

	//*  27   76:goto            13
				case 2: // '\002'
					j = zzb.zzg(parcel, l);
	//   28   79:aload_1         
	//   29   80:iload           5
	//   30   82:invokestatic    #81  <Method int zzb.zzg(Parcel, int)>
	//   31   85:istore_3        
					break;

	//*  32   86:goto            13
				case 3: // '\003'
					intent = (Intent)zzb.zza(parcel, l, Intent.CREATOR);
	//   33   89:aload_1         
	//   34   90:iload           5
	//   35   92:getstatic       #87  <Field android.os.Parcelable$Creator Intent.CREATOR>
	//   36   95:invokestatic    #90  <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   37   98:checkcast       #83  <Class Intent>
	//   38  101:astore          6
					break;
				}
			} else
	//*  39  103:goto            13
			if(parcel.dataPosition() != k)
	//*  40  106:aload_1         
	//*  41  107:invokevirtual   #67  <Method int Parcel.dataPosition()>
	//*  42  110:iload           4
	//*  43  112:icmpeq          146
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(k).toString(), parcel);
	//   44  115:new             #92  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   45  118:dup             
	//   46  119:new             #94  <Class StringBuilder>
	//   47  122:dup             
	//   48  123:bipush          37
	//   49  125:invokespecial   #97  <Method void StringBuilder(int)>
	//   50  128:ldc1            #99  <String "Overread allowed size end=">
	//   51  130:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   52  133:iload           4
	//   53  135:invokevirtual   #106 <Method StringBuilder StringBuilder.append(int)>
	//   54  138:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   55  141:aload_1         
	//   56  142:invokespecial   #113 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   57  145:athrow          
			else
				return new zzaxp(i, j, intent);
	//   58  146:new             #22  <Class zzaxp>
	//   59  149:dup             
	//   60  150:iload_2         
	//   61  151:iload_3         
	//   62  152:aload           6
	//   63  154:invokespecial   #116 <Method void zzaxp(int, int, Intent)>
	//   64  157:areturn         
		while(true);
	}

	public zzaxp[] zzmI(int i)
	{
		return new zzaxp[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzaxp[]
	//    2    4:areturn         
	}
}
