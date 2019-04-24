// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcg

public class zzch
	implements android.os.Parcelable.Creator
{

	public zzch()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzcg zzcg1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zza(parcel, 2, zzcg1.packageName, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field String zzcg.packageName>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #29  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zza(parcel, 3, zzcg1.label, false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #32  <Field String zzcg.label>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #29  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zza(parcel, 4, zzcg1.zzbUP);
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:getfield        #36  <Field long zzcg.zzbUP>
	//   19   31:invokestatic    #39  <Method void zzc.zza(Parcel, int, long)>
		zzc.zzJ(parcel, i);
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:invokestatic    #43  <Method void zzc.zzJ(Parcel, int)>
	//   23   39:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzlq(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #49  <Method zzcg zzlq(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzpS(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #55  <Method zzcg[] zzpS(int)>
	//    3    5:areturn         
	}

	public zzcg zzlq(Parcel parcel)
	{
		int i = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #60  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_2        
		String s1 = null;
	//    3    5:aconst_null     
	//    4    6:astore          7
		String s = null;
	//    5    8:aconst_null     
	//    6    9:astore          6
		long l = 0L;
	//    7   11:lconst_0        
	//    8   12:lstore          4
		do
			if(parcel.dataPosition() < i)
	//*   9   14:aload_1         
	//*  10   15:invokevirtual   #66  <Method int Parcel.dataPosition()>
	//*  11   18:iload_2         
	//*  12   19:icmpge          97
			{
				int j = zzb.zzaX(parcel);
	//   13   22:aload_1         
	//   14   23:invokestatic    #69  <Method int zzb.zzaX(Parcel)>
	//   15   26:istore_3        
				switch(zzb.zzdc(j))
	//*  16   27:iload_3         
	//*  17   28:invokestatic    #73  <Method int zzb.zzdc(int)>
				{
	//*  18   31:tableswitch     2 4: default 56
	//	               2 59
	//	               3 69
	//	               4 79
	//*  19   56:goto            89
				case 2: // '\002'
					s1 = zzb.zzq(parcel, j);
	//   20   59:aload_1         
	//   21   60:iload_3         
	//   22   61:invokestatic    #77  <Method String zzb.zzq(Parcel, int)>
	//   23   64:astore          7
					break;

	//*  24   66:goto            94
				case 3: // '\003'
					s = zzb.zzq(parcel, j);
	//   25   69:aload_1         
	//   26   70:iload_3         
	//   27   71:invokestatic    #77  <Method String zzb.zzq(Parcel, int)>
	//   28   74:astore          6
					break;

	//*  29   76:goto            94
				case 4: // '\004'
					l = zzb.zzi(parcel, j);
	//   30   79:aload_1         
	//   31   80:iload_3         
	//   32   81:invokestatic    #81  <Method long zzb.zzi(Parcel, int)>
	//   33   84:lstore          4
					break;

	//*  34   86:goto            94
				default:
					zzb.zzb(parcel, j);
	//   35   89:aload_1         
	//   36   90:iload_3         
	//   37   91:invokestatic    #84  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  38   94:goto            14
			if(parcel.dataPosition() != i)
	//*  39   97:aload_1         
	//*  40   98:invokevirtual   #66  <Method int Parcel.dataPosition()>
	//*  41  101:iload_2         
	//*  42  102:icmpeq          135
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(i).toString(), parcel);
	//   43  105:new             #86  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   44  108:dup             
	//   45  109:new             #88  <Class StringBuilder>
	//   46  112:dup             
	//   47  113:bipush          37
	//   48  115:invokespecial   #91  <Method void StringBuilder(int)>
	//   49  118:ldc1            #93  <String "Overread allowed size end=">
	//   50  120:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   51  123:iload_2         
	//   52  124:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   53  127:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   54  130:aload_1         
	//   55  131:invokespecial   #107 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   56  134:athrow          
			else
				return new zzcg(s1, s, l);
	//   57  135:new             #22  <Class zzcg>
	//   58  138:dup             
	//   59  139:aload           7
	//   60  141:aload           6
	//   61  143:lload           4
	//   62  145:invokespecial   #110 <Method void zzcg(String, String, long)>
	//   63  148:areturn         
		while(true);
	}

	public zzcg[] zzpS(int i)
	{
		return new zzcg[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzcg[]
	//    2    4:areturn         
	}
}
