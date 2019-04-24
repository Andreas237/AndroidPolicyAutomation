// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzat, zzo

public class zzau
	implements android.os.Parcelable.Creator
{

	public zzau()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzat zzat1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 2, zzat1.statusCode);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzat.statusCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 3, zzat1.zzbUt, false);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field java.util.List zzat.zzbUt>
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
		return ((Object) (zzla(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #47  <Method zzat zzla(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzpC(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #53  <Method zzat[] zzpC(int)>
	//    3    5:areturn         
	}

	public zzat zzla(Parcel parcel)
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
	//*   8   11:invokevirtual   #64  <Method int Parcel.dataPosition()>
	//*   9   14:iload_3         
	//*  10   15:icmpge          92
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
	//*  17   56:goto            83
				case 2: // '\002'
					i = zzb.zzg(parcel, k);
	//   18   59:aload_1         
	//   19   60:iload           4
	//   20   62:invokestatic    #75  <Method int zzb.zzg(Parcel, int)>
	//   21   65:istore_2        
					break;

	//*  22   66:goto            89
				case 3: // '\003'
					arraylist = zzb.zzc(parcel, k, zzo.CREATOR);
	//   23   69:aload_1         
	//   24   70:iload           4
	//   25   72:getstatic       #81  <Field android.os.Parcelable$Creator zzo.CREATOR>
	//   26   75:invokestatic    #84  <Method java.util.ArrayList zzb.zzc(Parcel, int, android.os.Parcelable$Creator)>
	//   27   78:astore          5
					break;

	//*  28   80:goto            89
				default:
					zzb.zzb(parcel, k);
	//   29   83:aload_1         
	//   30   84:iload           4
	//   31   86:invokestatic    #87  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  32   89:goto            10
			if(parcel.dataPosition() != j)
	//*  33   92:aload_1         
	//*  34   93:invokevirtual   #64  <Method int Parcel.dataPosition()>
	//*  35   96:iload_3         
	//*  36   97:icmpeq          130
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   37  100:new             #89  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   38  103:dup             
	//   39  104:new             #91  <Class StringBuilder>
	//   40  107:dup             
	//   41  108:bipush          37
	//   42  110:invokespecial   #94  <Method void StringBuilder(int)>
	//   43  113:ldc1            #96  <String "Overread allowed size end=">
	//   44  115:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   45  118:iload_3         
	//   46  119:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//   47  122:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   48  125:aload_1         
	//   49  126:invokespecial   #110 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   50  129:athrow          
			else
				return new zzat(i, ((java.util.List) (arraylist)));
	//   51  130:new             #22  <Class zzat>
	//   52  133:dup             
	//   53  134:iload_2         
	//   54  135:aload           5
	//   55  137:invokespecial   #113 <Method void zzat(int, java.util.List)>
	//   56  140:areturn         
		while(true);
	}

	public zzat[] zzpC(int i)
	{
		return new zzat[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzat[]
	//    2    4:areturn         
	}
}
