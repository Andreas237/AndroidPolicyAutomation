// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzaco

public class zzacp
	implements android.os.Parcelable.Creator
{

	public zzacp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzaco zzaco1, Parcel parcel, int i)
	{
		i = zzc.zzaV(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaV(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 1, zzaco1.mVersionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzaco.mVersionCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 2, ((java.util.List) (zzaco1.zzxX())), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #34  <Method java.util.ArrayList zzaco.zzxX()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #37  <Method void zzc.zzc(Parcel, int, java.util.List, boolean)>
		zzc.zza(parcel, 3, zzaco1.zzxY(), false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #41  <Method String zzaco.zzxY()>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #44  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zzJ(parcel, i);
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:invokestatic    #48  <Method void zzc.zzJ(Parcel, int)>
	//   23   39:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzbc(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #54  <Method zzaco zzbc(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzde(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #60  <Method zzaco[] zzde(int)>
	//    3    5:areturn         
	}

	public zzaco zzbc(Parcel parcel)
	{
		String s = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		int j = zzb.zzaU(parcel);
	//    2    3:aload_1         
	//    3    4:invokestatic    #65  <Method int zzb.zzaU(Parcel)>
	//    4    7:istore_3        
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		java.util.ArrayList arraylist = null;
	//    7   10:aconst_null     
	//    8   11:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #71  <Method int Parcel.dataPosition()>
	//*  11   17:iload_3         
	//*  12   18:icmpge          104
			{
				int k = zzb.zzaT(parcel);
	//   13   21:aload_1         
	//   14   22:invokestatic    #74  <Method int zzb.zzaT(Parcel)>
	//   15   25:istore          4
				switch(zzb.zzcW(k))
	//*  16   27:iload           4
	//*  17   29:invokestatic    #78  <Method int zzb.zzcW(int)>
				{
	//*  18   32:tableswitch     1 3: default 60
	//	               1 69
	//	               2 79
	//	               3 93
				default:
					zzb.zzb(parcel, k);
	//   19   60:aload_1         
	//   20   61:iload           4
	//   21   63:invokestatic    #81  <Method void zzb.zzb(Parcel, int)>
					break;

	//*  22   66:goto            13
				case 1: // '\001'
					i = zzb.zzg(parcel, k);
	//   23   69:aload_1         
	//   24   70:iload           4
	//   25   72:invokestatic    #85  <Method int zzb.zzg(Parcel, int)>
	//   26   75:istore_2        
					break;

	//*  27   76:goto            13
				case 2: // '\002'
					arraylist = zzb.zzc(parcel, k, zzaco.zza.CREATOR);
	//   28   79:aload_1         
	//   29   80:iload           4
	//   30   82:getstatic       #91  <Field android.os.Parcelable$Creator zzaco$zza.CREATOR>
	//   31   85:invokestatic    #94  <Method java.util.ArrayList zzb.zzc(Parcel, int, android.os.Parcelable$Creator)>
	//   32   88:astore          5
					break;

	//*  33   90:goto            13
				case 3: // '\003'
					s = zzb.zzq(parcel, k);
	//   34   93:aload_1         
	//   35   94:iload           4
	//   36   96:invokestatic    #98  <Method String zzb.zzq(Parcel, int)>
	//   37   99:astore          6
					break;
				}
			} else
	//*  38  101:goto            13
			if(parcel.dataPosition() != j)
	//*  39  104:aload_1         
	//*  40  105:invokevirtual   #71  <Method int Parcel.dataPosition()>
	//*  41  108:iload_3         
	//*  42  109:icmpeq          142
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   43  112:new             #100 <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   44  115:dup             
	//   45  116:new             #102 <Class StringBuilder>
	//   46  119:dup             
	//   47  120:bipush          37
	//   48  122:invokespecial   #105 <Method void StringBuilder(int)>
	//   49  125:ldc1            #107 <String "Overread allowed size end=">
	//   50  127:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   51  130:iload_3         
	//   52  131:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   53  134:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   54  137:aload_1         
	//   55  138:invokespecial   #120 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   56  141:athrow          
			else
				return new zzaco(i, arraylist, s);
	//   57  142:new             #22  <Class zzaco>
	//   58  145:dup             
	//   59  146:iload_2         
	//   60  147:aload           5
	//   61  149:aload           6
	//   62  151:invokespecial   #123 <Method void zzaco(int, java.util.ArrayList, String)>
	//   63  154:areturn         
		while(true);
	}

	public zzaco[] zzde(int i)
	{
		return new zzaco[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzaco[]
	//    2    4:areturn         
	}
}
