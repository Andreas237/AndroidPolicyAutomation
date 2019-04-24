// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzah

public class zzai
	implements android.os.Parcelable.Creator
{

	public zzai()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzah zzah1, Parcel parcel, int i)
	{
		int j = zzc.zzaV(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaV(Parcel)>
	//    2    4:istore_3        
		zzc.zzc(parcel, 1, zzah1.mVersionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzah.mVersionCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 2, zzah1.zzxD());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #34  <Method int zzah.zzxD()>
	//   12   20:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 3, zzah1.zzxE());
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #37  <Method int zzah.zzxE()>
	//   17   29:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 4, ((android.os.Parcelable []) (zzah1.zzxF())), i, false);
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:invokevirtual   #41  <Method Scope[] zzah.zzxF()>
	//   22   38:iload_2         
	//   23   39:iconst_0        
	//   24   40:invokestatic    #44  <Method void zzc.zza(Parcel, int, android.os.Parcelable[], int, boolean)>
		zzc.zzJ(parcel, j);
	//   25   43:aload_1         
	//   26   44:iload_3         
	//   27   45:invokestatic    #48  <Method void zzc.zzJ(Parcel, int)>
	//   28   48:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzaR(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #54  <Method zzah zzaR(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzcU(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #60  <Method zzah[] zzcU(int)>
	//    3    5:areturn         
	}

	public zzah zzaR(Parcel parcel)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int l = zzb.zzaU(parcel);
	//    2    3:aload_1         
	//    3    4:invokestatic    #65  <Method int zzb.zzaU(Parcel)>
	//    4    7:istore          5
		Scope ascope[] = null;
	//    5    9:aconst_null     
	//    6   10:astore          7
		int j = 0;
	//    7   12:iconst_0        
	//    8   13:istore_3        
		int i = 0;
	//    9   14:iconst_0        
	//   10   15:istore_2        
		do
			if(parcel.dataPosition() < l)
	//*  11   16:aload_1         
	//*  12   17:invokevirtual   #70  <Method int Parcel.dataPosition()>
	//*  13   20:iload           5
	//*  14   22:icmpge          125
			{
				int i1 = zzb.zzaT(parcel);
	//   15   25:aload_1         
	//   16   26:invokestatic    #73  <Method int zzb.zzaT(Parcel)>
	//   17   29:istore          6
				switch(zzb.zzcW(i1))
	//*  18   31:iload           6
	//*  19   33:invokestatic    #77  <Method int zzb.zzcW(int)>
				{
	//*  20   36:tableswitch     1 4: default 68
	//	               1 77
	//	               2 87
	//	               3 97
	//	               4 108
				default:
					zzb.zzb(parcel, i1);
	//   21   68:aload_1         
	//   22   69:iload           6
	//   23   71:invokestatic    #80  <Method void zzb.zzb(Parcel, int)>
					break;

	//*  24   74:goto            16
				case 1: // '\001'
					i = zzb.zzg(parcel, i1);
	//   25   77:aload_1         
	//   26   78:iload           6
	//   27   80:invokestatic    #84  <Method int zzb.zzg(Parcel, int)>
	//   28   83:istore_2        
					break;

	//*  29   84:goto            16
				case 2: // '\002'
					j = zzb.zzg(parcel, i1);
	//   30   87:aload_1         
	//   31   88:iload           6
	//   32   90:invokestatic    #84  <Method int zzb.zzg(Parcel, int)>
	//   33   93:istore_3        
					break;

	//*  34   94:goto            16
				case 3: // '\003'
					k = zzb.zzg(parcel, i1);
	//   35   97:aload_1         
	//   36   98:iload           6
	//   37  100:invokestatic    #84  <Method int zzb.zzg(Parcel, int)>
	//   38  103:istore          4
					break;

	//*  39  105:goto            16
				case 4: // '\004'
					ascope = (Scope[])zzb.zzb(parcel, i1, Scope.CREATOR);
	//   40  108:aload_1         
	//   41  109:iload           6
	//   42  111:getstatic       #90  <Field android.os.Parcelable$Creator Scope.CREATOR>
	//   43  114:invokestatic    #93  <Method Object[] zzb.zzb(Parcel, int, android.os.Parcelable$Creator)>
	//   44  117:checkcast       #95  <Class Scope[]>
	//   45  120:astore          7
					break;
				}
			} else
	//*  46  122:goto            16
			if(parcel.dataPosition() != l)
	//*  47  125:aload_1         
	//*  48  126:invokevirtual   #70  <Method int Parcel.dataPosition()>
	//*  49  129:iload           5
	//*  50  131:icmpeq          165
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(l).toString(), parcel);
	//   51  134:new             #97  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   52  137:dup             
	//   53  138:new             #99  <Class StringBuilder>
	//   54  141:dup             
	//   55  142:bipush          37
	//   56  144:invokespecial   #102 <Method void StringBuilder(int)>
	//   57  147:ldc1            #104 <String "Overread allowed size end=">
	//   58  149:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   59  152:iload           5
	//   60  154:invokevirtual   #111 <Method StringBuilder StringBuilder.append(int)>
	//   61  157:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   62  160:aload_1         
	//   63  161:invokespecial   #118 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   64  164:athrow          
			else
				return new zzah(i, j, k, ascope);
	//   65  165:new             #22  <Class zzah>
	//   66  168:dup             
	//   67  169:iload_2         
	//   68  170:iload_3         
	//   69  171:iload           4
	//   70  173:aload           7
	//   71  175:invokespecial   #121 <Method void zzah(int, int, int, Scope[])>
	//   72  178:areturn         
		while(true);
	}

	public zzah[] zzcU(int i)
	{
		return new zzah[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzah[]
	//    2    4:areturn         
	}
}
