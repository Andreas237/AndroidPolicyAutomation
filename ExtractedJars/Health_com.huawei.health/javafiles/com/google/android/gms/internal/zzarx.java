// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzarw

public class zzarx
	implements android.os.Parcelable.Creator
{

	public zzarx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzarw zzarw1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 1, zzarw1.uid);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzarw.uid>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 2, zzarw1.packageName, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field String zzarw.packageName>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #37  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zzJ(parcel, i);
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokestatic    #41  <Method void zzc.zzJ(Parcel, int)>
	//   17   29:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzgT(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #47  <Method zzarw zzgT(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzkv(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #53  <Method zzarw[] zzkv(int)>
	//    3    5:areturn         
	}

	public zzarw zzgT(Parcel parcel)
	{
		int j = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #58  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		String s = null;
	//    5    7:aconst_null     
	//    6    8:astore          5
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
	//	               1: 59
	//	               2: 69
	//*  17   56:goto            80
				case 1: // '\001'
					i = zzb.zzg(parcel, k);
	//   18   59:aload_1         
	//   19   60:iload           4
	//   20   62:invokestatic    #75  <Method int zzb.zzg(Parcel, int)>
	//   21   65:istore_2        
					break;

	//*  22   66:goto            86
				case 2: // '\002'
					s = zzb.zzq(parcel, k);
	//   23   69:aload_1         
	//   24   70:iload           4
	//   25   72:invokestatic    #79  <Method String zzb.zzq(Parcel, int)>
	//   26   75:astore          5
					break;

	//*  27   77:goto            86
				default:
					zzb.zzb(parcel, k);
	//   28   80:aload_1         
	//   29   81:iload           4
	//   30   83:invokestatic    #82  <Method void zzb.zzb(Parcel, int)>
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
	//   36   97:new             #84  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   37  100:dup             
	//   38  101:new             #86  <Class StringBuilder>
	//   39  104:dup             
	//   40  105:bipush          37
	//   41  107:invokespecial   #89  <Method void StringBuilder(int)>
	//   42  110:ldc1            #91  <String "Overread allowed size end=">
	//   43  112:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   44  115:iload_3         
	//   45  116:invokevirtual   #98  <Method StringBuilder StringBuilder.append(int)>
	//   46  119:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   47  122:aload_1         
	//   48  123:invokespecial   #105 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   49  126:athrow          
			else
				return new zzarw(i, s);
	//   50  127:new             #22  <Class zzarw>
	//   51  130:dup             
	//   52  131:iload_2         
	//   53  132:aload           5
	//   54  134:invokespecial   #108 <Method void zzarw(int, String)>
	//   55  137:areturn         
		while(true);
	}

	public zzarw[] zzkv(int i)
	{
		return new zzarw[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzarw[]
	//    2    4:areturn         
	}
}
