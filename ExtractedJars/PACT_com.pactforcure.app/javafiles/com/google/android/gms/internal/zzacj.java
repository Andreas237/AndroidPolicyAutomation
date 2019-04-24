// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzacj
	implements android.os.Parcelable.Creator
{

	public zzacj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzach.zza zza1, Parcel parcel, int i)
	{
		i = zzc.zzaV(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaV(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 1, zza1.versionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzach$zza.versionCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 2, zza1.zzaFy, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field String zzach$zza.zzaFy>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #37  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zzc(parcel, 3, zza1.zzaFz);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #40  <Field int zzach$zza.zzaFz>
	//   18   30:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzJ(parcel, i);
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:invokestatic    #44  <Method void zzc.zzJ(Parcel, int)>
	//   22   38:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzaZ(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #50  <Method zzach$zza zzaZ(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzdb(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #56  <Method zzach$zza[] zzdb(int)>
	//    3    5:areturn         
	}

	public zzach.zza zzaZ(Parcel parcel)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int k = zzb.zzaU(parcel);
	//    2    2:aload_1         
	//    3    3:invokestatic    #61  <Method int zzb.zzaU(Parcel)>
	//    4    6:istore          4
		String s = null;
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
	//*  12   19:icmpge          100
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
	//	               3 90
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
					s = zzb.zzq(parcel, l);
	//   28   79:aload_1         
	//   29   80:iload           5
	//   30   82:invokestatic    #85  <Method String zzb.zzq(Parcel, int)>
	//   31   85:astore          6
					break;

	//*  32   87:goto            13
				case 3: // '\003'
					j = zzb.zzg(parcel, l);
	//   33   90:aload_1         
	//   34   91:iload           5
	//   35   93:invokestatic    #81  <Method int zzb.zzg(Parcel, int)>
	//   36   96:istore_3        
					break;
				}
			} else
	//*  37   97:goto            13
			if(parcel.dataPosition() != k)
	//*  38  100:aload_1         
	//*  39  101:invokevirtual   #67  <Method int Parcel.dataPosition()>
	//*  40  104:iload           4
	//*  41  106:icmpeq          140
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(k).toString(), parcel);
	//   42  109:new             #87  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   43  112:dup             
	//   44  113:new             #89  <Class StringBuilder>
	//   45  116:dup             
	//   46  117:bipush          37
	//   47  119:invokespecial   #92  <Method void StringBuilder(int)>
	//   48  122:ldc1            #94  <String "Overread allowed size end=">
	//   49  124:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   50  127:iload           4
	//   51  129:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
	//   52  132:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   53  135:aload_1         
	//   54  136:invokespecial   #108 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   55  139:athrow          
			else
				return new zzach.zza(i, s, j);
	//   56  140:new             #22  <Class zzach$zza>
	//   57  143:dup             
	//   58  144:iload_2         
	//   59  145:aload           6
	//   60  147:iload_3         
	//   61  148:invokespecial   #111 <Method void zzach$zza(int, String, int)>
	//   62  151:areturn         
		while(true);
	}

	public zzach.zza[] zzdb(int i)
	{
		return new zzach.zza[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzach.zza[]
	//    2    4:areturn         
	}
}
