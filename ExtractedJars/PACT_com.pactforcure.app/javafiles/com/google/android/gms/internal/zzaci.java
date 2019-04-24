// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzach

public class zzaci
	implements android.os.Parcelable.Creator
{

	public zzaci()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzach zzach1, Parcel parcel, int i)
	{
		i = zzc.zzaV(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaV(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 1, zzach1.mVersionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzach.mVersionCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 2, ((java.util.List) (zzach1.zzxJ())), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #34  <Method java.util.ArrayList zzach.zzxJ()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #37  <Method void zzc.zzc(Parcel, int, java.util.List, boolean)>
		zzc.zzJ(parcel, i);
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokestatic    #41  <Method void zzc.zzJ(Parcel, int)>
	//   17   29:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzaY(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #47  <Method zzach zzaY(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzda(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #53  <Method zzach[] zzda(int)>
	//    3    5:areturn         
	}

	public zzach zzaY(Parcel parcel)
	{
		int j = zzb.zzaU(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #58  <Method int zzb.zzaU(Parcel)>
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
	//*   8   11:invokevirtual   #64  <Method int Parcel.dataPosition()>
	//*   9   14:iload_3         
	//*  10   15:icmpge          85
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
					arraylist = zzb.zzc(parcel, k, zzach.zza.CREATOR);
	//   26   71:aload_1         
	//   27   72:iload           4
	//   28   74:getstatic       #84  <Field android.os.Parcelable$Creator zzach$zza.CREATOR>
	//   29   77:invokestatic    #87  <Method java.util.ArrayList zzb.zzc(Parcel, int, android.os.Parcelable$Creator)>
	//   30   80:astore          5
					break;
				}
			} else
	//*  31   82:goto            10
			if(parcel.dataPosition() != j)
	//*  32   85:aload_1         
	//*  33   86:invokevirtual   #64  <Method int Parcel.dataPosition()>
	//*  34   89:iload_3         
	//*  35   90:icmpeq          123
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   36   93:new             #89  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   37   96:dup             
	//   38   97:new             #91  <Class StringBuilder>
	//   39  100:dup             
	//   40  101:bipush          37
	//   41  103:invokespecial   #94  <Method void StringBuilder(int)>
	//   42  106:ldc1            #96  <String "Overread allowed size end=">
	//   43  108:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   44  111:iload_3         
	//   45  112:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//   46  115:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   47  118:aload_1         
	//   48  119:invokespecial   #110 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   49  122:athrow          
			else
				return new zzach(i, arraylist);
	//   50  123:new             #22  <Class zzach>
	//   51  126:dup             
	//   52  127:iload_2         
	//   53  128:aload           5
	//   54  130:invokespecial   #113 <Method void zzach(int, java.util.ArrayList)>
	//   55  133:areturn         
		while(true);
	}

	public zzach[] zzda(int i)
	{
		return new zzach[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzach[]
	//    2    4:areturn         
	}
}
