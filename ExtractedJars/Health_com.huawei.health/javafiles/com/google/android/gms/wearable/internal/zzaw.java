// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzav, zzo

public class zzaw
	implements android.os.Parcelable.Creator
{

	public zzaw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzav zzav1, Parcel parcel, int i)
	{
		int j = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_3        
		zzc.zzc(parcel, 2, zzav1.statusCode);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzav.statusCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 3, ((android.os.Parcelable) (zzav1.zzbUu)), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field zzo zzav.zzbUu>
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
		return ((Object) (zzlb(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #47  <Method zzav zzlb(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzpD(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #53  <Method zzav[] zzpD(int)>
	//    3    5:areturn         
	}

	public zzav zzlb(Parcel parcel)
	{
		int j = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #58  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		zzo zzo1 = null;
	//    5    7:aconst_null     
	//    6    8:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   7   10:aload_1         
	//*   8   11:invokevirtual   #64  <Method int Parcel.dataPosition()>
	//*   9   14:iload_3         
	//*  10   15:icmpge          95
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
	//*  17   56:goto            86
				case 2: // '\002'
					i = zzb.zzg(parcel, k);
	//   18   59:aload_1         
	//   19   60:iload           4
	//   20   62:invokestatic    #75  <Method int zzb.zzg(Parcel, int)>
	//   21   65:istore_2        
					break;

	//*  22   66:goto            92
				case 3: // '\003'
					zzo1 = (zzo)zzb.zza(parcel, k, zzo.CREATOR);
	//   23   69:aload_1         
	//   24   70:iload           4
	//   25   72:getstatic       #81  <Field android.os.Parcelable$Creator zzo.CREATOR>
	//   26   75:invokestatic    #84  <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   27   78:checkcast       #77  <Class zzo>
	//   28   81:astore          5
					break;

	//*  29   83:goto            92
				default:
					zzb.zzb(parcel, k);
	//   30   86:aload_1         
	//   31   87:iload           4
	//   32   89:invokestatic    #87  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  33   92:goto            10
			if(parcel.dataPosition() != j)
	//*  34   95:aload_1         
	//*  35   96:invokevirtual   #64  <Method int Parcel.dataPosition()>
	//*  36   99:iload_3         
	//*  37  100:icmpeq          133
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   38  103:new             #89  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   39  106:dup             
	//   40  107:new             #91  <Class StringBuilder>
	//   41  110:dup             
	//   42  111:bipush          37
	//   43  113:invokespecial   #94  <Method void StringBuilder(int)>
	//   44  116:ldc1            #96  <String "Overread allowed size end=">
	//   45  118:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   46  121:iload_3         
	//   47  122:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//   48  125:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   49  128:aload_1         
	//   50  129:invokespecial   #110 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   51  132:athrow          
			else
				return new zzav(i, zzo1);
	//   52  133:new             #22  <Class zzav>
	//   53  136:dup             
	//   54  137:iload_2         
	//   55  138:aload           5
	//   56  140:invokespecial   #113 <Method void zzav(int, zzo)>
	//   57  143:areturn         
		while(true);
	}

	public zzav[] zzpD(int i)
	{
		return new zzav[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzav[]
	//    2    4:areturn         
	}
}
