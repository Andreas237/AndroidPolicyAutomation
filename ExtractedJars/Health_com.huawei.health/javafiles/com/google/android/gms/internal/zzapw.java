// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.internal:
//			zzapv

public class zzapw
	implements android.os.Parcelable.Creator
{

	public zzapw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzapv zzapv1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 1, zzapv1.getDataTypes(), false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #26  <Method java.util.List zzapv.getDataTypes()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #30  <Method void zzc.zzc(Parcel, int, java.util.List, boolean)>
		zzc.zzc(parcel, 1000, zzapv1.getVersionCode());
	//    9   15:aload_1         
	//   10   16:sipush          1000
	//   11   19:aload_0         
	//   12   20:invokevirtual   #34  <Method int zzapv.getVersionCode()>
	//   13   23:invokestatic    #37  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzJ(parcel, i);
	//   14   26:aload_1         
	//   15   27:iload_2         
	//   16   28:invokestatic    #41  <Method void zzc.zzJ(Parcel, int)>
	//   17   31:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzeq(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #47  <Method zzapv zzeq(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzhd(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #53  <Method zzapv[] zzhd(int)>
	//    3    5:areturn         
	}

	public zzapv zzeq(Parcel parcel)
	{
		int j = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #58  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		java.util.ArrayList arraylist = null;
	//    5    7:aconst_null     
	//    6    8:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   7   10:aload_1         
	//*   8   11:invokevirtual   #63  <Method int Parcel.dataPosition()>
	//*   9   14:iload_3         
	//*  10   15:icmpge          92
			{
				int k = zzb.zzaX(parcel);
	//   11   18:aload_1         
	//   12   19:invokestatic    #66  <Method int zzb.zzaX(Parcel)>
	//   13   22:istore          4
				switch(zzb.zzdc(k))
	//*  14   24:iload           4
	//*  15   26:invokestatic    #70  <Method int zzb.zzdc(int)>
				{
	//*  16   29:lookupswitch    2: default 56
	//	               1: 59
	//	               1000: 73
	//*  17   56:goto            83
				case 1: // '\001'
					arraylist = zzb.zzc(parcel, k, DataType.CREATOR);
	//   18   59:aload_1         
	//   19   60:iload           4
	//   20   62:getstatic       #76  <Field android.os.Parcelable$Creator DataType.CREATOR>
	//   21   65:invokestatic    #79  <Method java.util.ArrayList zzb.zzc(Parcel, int, android.os.Parcelable$Creator)>
	//   22   68:astore          5
					break;

	//*  23   70:goto            89
				case 1000: 
					i = zzb.zzg(parcel, k);
	//   24   73:aload_1         
	//   25   74:iload           4
	//   26   76:invokestatic    #83  <Method int zzb.zzg(Parcel, int)>
	//   27   79:istore_2        
					break;

	//*  28   80:goto            89
				default:
					zzb.zzb(parcel, k);
	//   29   83:aload_1         
	//   30   84:iload           4
	//   31   86:invokestatic    #86  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  32   89:goto            10
			if(parcel.dataPosition() != j)
	//*  33   92:aload_1         
	//*  34   93:invokevirtual   #63  <Method int Parcel.dataPosition()>
	//*  35   96:iload_3         
	//*  36   97:icmpeq          130
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   37  100:new             #88  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   38  103:dup             
	//   39  104:new             #90  <Class StringBuilder>
	//   40  107:dup             
	//   41  108:bipush          37
	//   42  110:invokespecial   #93  <Method void StringBuilder(int)>
	//   43  113:ldc1            #95  <String "Overread allowed size end=">
	//   44  115:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   45  118:iload_3         
	//   46  119:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   47  122:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   48  125:aload_1         
	//   49  126:invokespecial   #109 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   50  129:athrow          
			else
				return new zzapv(i, ((java.util.List) (arraylist)));
	//   51  130:new             #22  <Class zzapv>
	//   52  133:dup             
	//   53  134:iload_2         
	//   54  135:aload           5
	//   55  137:invokespecial   #112 <Method void zzapv(int, java.util.List)>
	//   56  140:areturn         
		while(true);
	}

	public zzapv[] zzhd(int i)
	{
		return new zzapv[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzapv[]
	//    2    4:areturn         
	}
}
