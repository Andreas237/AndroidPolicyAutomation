// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzacr
	implements android.os.Parcelable.Creator
{

	public zzacr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzacp.zza zza1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 1, zza1.versionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzacp$zza.versionCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 2, zza1.zzaGV, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field String zzacp$zza.zzaGV>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #37  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zzc(parcel, 3, zza1.zzaGW);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #40  <Field int zzacp$zza.zzaGW>
	//   18   30:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzJ(parcel, i);
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:invokestatic    #44  <Method void zzc.zzJ(Parcel, int)>
	//   22   38:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzbd(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #50  <Method zzacp$zza zzbd(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzdh(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #56  <Method zzacp$zza[] zzdh(int)>
	//    3    5:areturn         
	}

	public zzacp.zza zzbd(Parcel parcel)
	{
		int k = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #61  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
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
	//*  12   19:icmpge          103
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
	//	               3 84
	//*  19   60:goto            94
				case 1: // '\001'
					j = zzb.zzg(parcel, l);
	//   20   63:aload_1         
	//   21   64:iload           5
	//   22   66:invokestatic    #78  <Method int zzb.zzg(Parcel, int)>
	//   23   69:istore_3        
					break;

	//*  24   70:goto            100
				case 2: // '\002'
					s = zzb.zzq(parcel, l);
	//   25   73:aload_1         
	//   26   74:iload           5
	//   27   76:invokestatic    #82  <Method String zzb.zzq(Parcel, int)>
	//   28   79:astore          6
					break;

	//*  29   81:goto            100
				case 3: // '\003'
					i = zzb.zzg(parcel, l);
	//   30   84:aload_1         
	//   31   85:iload           5
	//   32   87:invokestatic    #78  <Method int zzb.zzg(Parcel, int)>
	//   33   90:istore_2        
					break;

	//*  34   91:goto            100
				default:
					zzb.zzb(parcel, l);
	//   35   94:aload_1         
	//   36   95:iload           5
	//   37   97:invokestatic    #85  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  38  100:goto            13
			if(parcel.dataPosition() != k)
	//*  39  103:aload_1         
	//*  40  104:invokevirtual   #67  <Method int Parcel.dataPosition()>
	//*  41  107:iload           4
	//*  42  109:icmpeq          143
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(k).toString(), parcel);
	//   43  112:new             #87  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   44  115:dup             
	//   45  116:new             #89  <Class StringBuilder>
	//   46  119:dup             
	//   47  120:bipush          37
	//   48  122:invokespecial   #92  <Method void StringBuilder(int)>
	//   49  125:ldc1            #94  <String "Overread allowed size end=">
	//   50  127:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   51  130:iload           4
	//   52  132:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
	//   53  135:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   54  138:aload_1         
	//   55  139:invokespecial   #108 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   56  142:athrow          
			else
				return new zzacp.zza(j, s, i);
	//   57  143:new             #22  <Class zzacp$zza>
	//   58  146:dup             
	//   59  147:iload_3         
	//   60  148:aload           6
	//   61  150:iload_2         
	//   62  151:invokespecial   #111 <Method void zzacp$zza(int, String, int)>
	//   63  154:areturn         
		while(true);
	}

	public zzacp.zza[] zzdh(int i)
	{
		return new zzacp.zza[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzacp.zza[]
	//    2    4:areturn         
	}
}
