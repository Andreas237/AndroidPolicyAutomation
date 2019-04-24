// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzbc

public class zzbb
	implements android.os.Parcelable.Creator
{

	public zzbb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzbc zzbc1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 2, zzbc1.statusCode);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzbc.statusCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 3, zzbc1.zzbUw);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field boolean zzbc.zzbUw>
	//   12   20:invokestatic    #37  <Method void zzc.zza(Parcel, int, boolean)>
		zzc.zzJ(parcel, i);
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:invokestatic    #41  <Method void zzc.zzJ(Parcel, int)>
	//   16   28:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzle(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #47  <Method zzbc zzle(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzpG(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #53  <Method zzbc[] zzpG(int)>
	//    3    5:areturn         
	}

	public zzbc zzle(Parcel parcel)
	{
		int j = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #58  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		boolean flag = false;
	//    5    7:iconst_0        
	//    6    8:istore          5
		do
			if(parcel.dataPosition() < j)
	//*   7   10:aload_1         
	//*   8   11:invokevirtual   #64  <Method int Parcel.dataPosition()>
	//*   9   14:iload_3         
	//*  10   15:icmpge          89
			{
				int k = zzb.zzaX(parcel);
	//   11   18:aload_1         
	//   12   19:invokestatic    #67  <Method int zzb.zzaX(Parcel)>
	//   13   22:istore          4
				switch(zzb.zzdc(k))
	//*  14   24:iload           4
	//*  15   26:invokestatic    #71  <Method int zzb.zzdc(int)>
				{
	//*  16   29:lookupswitch    2: default 56
	//	               2: 59
	//	               3: 69
	//*  17   56:goto            80
				case 2: // '\002'
					i = zzb.zzg(parcel, k);
	//   18   59:aload_1         
	//   19   60:iload           4
	//   20   62:invokestatic    #75  <Method int zzb.zzg(Parcel, int)>
	//   21   65:istore_2        
					break;

	//*  22   66:goto            86
				case 3: // '\003'
					flag = zzb.zzc(parcel, k);
	//   23   69:aload_1         
	//   24   70:iload           4
	//   25   72:invokestatic    #78  <Method boolean zzb.zzc(Parcel, int)>
	//   26   75:istore          5
					break;

	//*  27   77:goto            86
				default:
					zzb.zzb(parcel, k);
	//   28   80:aload_1         
	//   29   81:iload           4
	//   30   83:invokestatic    #81  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  31   86:goto            10
			if(parcel.dataPosition() != j)
	//*  32   89:aload_1         
	//*  33   90:invokevirtual   #64  <Method int Parcel.dataPosition()>
	//*  34   93:iload_3         
	//*  35   94:icmpeq          127
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   36   97:new             #83  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   37  100:dup             
	//   38  101:new             #85  <Class StringBuilder>
	//   39  104:dup             
	//   40  105:bipush          37
	//   41  107:invokespecial   #88  <Method void StringBuilder(int)>
	//   42  110:ldc1            #90  <String "Overread allowed size end=">
	//   43  112:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   44  115:iload_3         
	//   45  116:invokevirtual   #97  <Method StringBuilder StringBuilder.append(int)>
	//   46  119:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   47  122:aload_1         
	//   48  123:invokespecial   #104 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   49  126:athrow          
			else
				return new zzbc(i, flag);
	//   50  127:new             #22  <Class zzbc>
	//   51  130:dup             
	//   52  131:iload_2         
	//   53  132:iload           5
	//   54  134:invokespecial   #107 <Method void zzbc(int, boolean)>
	//   55  137:areturn         
		while(true);
	}

	public zzbc[] zzpG(int i)
	{
		return new zzbc[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzbc[]
	//    2    4:areturn         
	}
}
