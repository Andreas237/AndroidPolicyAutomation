// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzacf, zzach

public class zzacg
	implements android.os.Parcelable.Creator
{

	public zzacg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzacf zzacf1, Parcel parcel, int i)
	{
		int j = zzc.zzaV(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaV(Parcel)>
	//    2    4:istore_3        
		zzc.zzc(parcel, 1, zzacf1.mVersionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzacf.mVersionCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 2, ((android.os.Parcelable) (zzacf1.zzxH())), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #34  <Method zzach zzacf.zzxH()>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #37  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zzJ(parcel, j);
	//   15   25:aload_1         
	//   16   26:iload_3         
	//   17   27:invokestatic    #41  <Method void zzc.zzJ(Parcel, int)>
	//   18   30:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzaX(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #47  <Method zzacf zzaX(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzcZ(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #53  <Method zzacf[] zzcZ(int)>
	//    3    5:areturn         
	}

	public zzacf zzaX(Parcel parcel)
	{
		int j = zzb.zzaU(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #58  <Method int zzb.zzaU(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		zzach zzach1 = null;
	//    5    7:aconst_null     
	//    6    8:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   7   10:aload_1         
	//*   8   11:invokevirtual   #64  <Method int Parcel.dataPosition()>
	//*   9   14:iload_3         
	//*  10   15:icmpge          88
			{
				int k = zzb.zzaT(parcel);
	//   11   18:aload_1         
	//   12   19:invokestatic    #67  <Method int zzb.zzaT(Parcel)>
	//   13   22:istore          4
				switch(zzb.zzcW(k))
	//*  14   24:iload           4
	//*  15   26:invokestatic    #71  <Method int zzb.zzcW(int)>
				{
	//*  16   29:tableswitch     1 2: default 52
	//	               1 61
	//	               2 71
				default:
					zzb.zzb(parcel, k);
	//   17   52:aload_1         
	//   18   53:iload           4
	//   19   55:invokestatic    #74  <Method void zzb.zzb(Parcel, int)>
					break;

	//*  20   58:goto            10
				case 1: // '\001'
					i = zzb.zzg(parcel, k);
	//   21   61:aload_1         
	//   22   62:iload           4
	//   23   64:invokestatic    #78  <Method int zzb.zzg(Parcel, int)>
	//   24   67:istore_2        
					break;

	//*  25   68:goto            10
				case 2: // '\002'
					zzach1 = (zzach)zzb.zza(parcel, k, zzach.CREATOR);
	//   26   71:aload_1         
	//   27   72:iload           4
	//   28   74:getstatic       #84  <Field android.os.Parcelable$Creator zzach.CREATOR>
	//   29   77:invokestatic    #87  <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   30   80:checkcast       #80  <Class zzach>
	//   31   83:astore          5
					break;
				}
			} else
	//*  32   85:goto            10
			if(parcel.dataPosition() != j)
	//*  33   88:aload_1         
	//*  34   89:invokevirtual   #64  <Method int Parcel.dataPosition()>
	//*  35   92:iload_3         
	//*  36   93:icmpeq          126
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   37   96:new             #89  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   38   99:dup             
	//   39  100:new             #91  <Class StringBuilder>
	//   40  103:dup             
	//   41  104:bipush          37
	//   42  106:invokespecial   #94  <Method void StringBuilder(int)>
	//   43  109:ldc1            #96  <String "Overread allowed size end=">
	//   44  111:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   45  114:iload_3         
	//   46  115:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//   47  118:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   48  121:aload_1         
	//   49  122:invokespecial   #110 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   50  125:athrow          
			else
				return new zzacf(i, zzach1);
	//   51  126:new             #22  <Class zzacf>
	//   52  129:dup             
	//   53  130:iload_2         
	//   54  131:aload           5
	//   55  133:invokespecial   #113 <Method void zzacf(int, zzach)>
	//   56  136:areturn         
		while(true);
	}

	public zzacf[] zzcZ(int i)
	{
		return new zzacf[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzacf[]
	//    2    4:areturn         
	}
}
