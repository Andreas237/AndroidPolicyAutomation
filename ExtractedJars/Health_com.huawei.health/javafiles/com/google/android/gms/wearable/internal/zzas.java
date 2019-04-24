// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzar

public class zzas
	implements android.os.Parcelable.Creator
{

	public zzas()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzar zzar1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 2, zzar1.statusCode);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzar.statusCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 3, zzar1.zzbUs);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #33  <Field int zzar.zzbUs>
	//   12   20:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzJ(parcel, i);
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:invokestatic    #37  <Method void zzc.zzJ(Parcel, int)>
	//   16   28:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzkZ(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #43  <Method zzar zzkZ(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzpB(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #49  <Method zzar[] zzpB(int)>
	//    3    5:areturn         
	}

	public zzar zzkZ(Parcel parcel)
	{
		int k = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #54  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		do
			if(parcel.dataPosition() < k)
	//*   7   10:aload_1         
	//*   8   11:invokevirtual   #60  <Method int Parcel.dataPosition()>
	//*   9   14:iload           4
	//*  10   16:icmpge          88
			{
				int l = zzb.zzaX(parcel);
	//   11   19:aload_1         
	//   12   20:invokestatic    #63  <Method int zzb.zzaX(Parcel)>
	//   13   23:istore          5
				switch(zzb.zzdc(l))
	//*  14   25:iload           5
	//*  15   27:invokestatic    #67  <Method int zzb.zzdc(int)>
				{
	//*  16   30:lookupswitch    2: default 56
	//	               2: 59
	//	               3: 69
	//*  17   56:goto            79
				case 2: // '\002'
					j = zzb.zzg(parcel, l);
	//   18   59:aload_1         
	//   19   60:iload           5
	//   20   62:invokestatic    #71  <Method int zzb.zzg(Parcel, int)>
	//   21   65:istore_3        
					break;

	//*  22   66:goto            85
				case 3: // '\003'
					i = zzb.zzg(parcel, l);
	//   23   69:aload_1         
	//   24   70:iload           5
	//   25   72:invokestatic    #71  <Method int zzb.zzg(Parcel, int)>
	//   26   75:istore_2        
					break;

	//*  27   76:goto            85
				default:
					zzb.zzb(parcel, l);
	//   28   79:aload_1         
	//   29   80:iload           5
	//   30   82:invokestatic    #74  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  31   85:goto            10
			if(parcel.dataPosition() != k)
	//*  32   88:aload_1         
	//*  33   89:invokevirtual   #60  <Method int Parcel.dataPosition()>
	//*  34   92:iload           4
	//*  35   94:icmpeq          128
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(k).toString(), parcel);
	//   36   97:new             #76  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   37  100:dup             
	//   38  101:new             #78  <Class StringBuilder>
	//   39  104:dup             
	//   40  105:bipush          37
	//   41  107:invokespecial   #81  <Method void StringBuilder(int)>
	//   42  110:ldc1            #83  <String "Overread allowed size end=">
	//   43  112:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   44  115:iload           4
	//   45  117:invokevirtual   #90  <Method StringBuilder StringBuilder.append(int)>
	//   46  120:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   47  123:aload_1         
	//   48  124:invokespecial   #97  <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   49  127:athrow          
			else
				return new zzar(j, i);
	//   50  128:new             #22  <Class zzar>
	//   51  131:dup             
	//   52  132:iload_3         
	//   53  133:iload_2         
	//   54  134:invokespecial   #100 <Method void zzar(int, int)>
	//   55  137:areturn         
		while(true);
	}

	public zzar[] zzpB(int i)
	{
		return new zzar[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzar[]
	//    2    4:areturn         
	}
}
