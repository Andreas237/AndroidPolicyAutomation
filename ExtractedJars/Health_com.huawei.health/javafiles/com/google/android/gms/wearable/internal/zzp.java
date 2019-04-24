// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzo, zzcc

public class zzp
	implements android.os.Parcelable.Creator
{

	public zzp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzo zzo1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zza(parcel, 2, zzo1.getName(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #26  <Method String zzo.getName()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #29  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zzc(parcel, 3, zzo1.zzUt(), false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #33  <Method java.util.List zzo.zzUt()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #37  <Method void zzc.zzc(Parcel, int, java.util.List, boolean)>
		zzc.zzJ(parcel, i);
	//   15   25:aload_1         
	//   16   26:iload_2         
	//   17   27:invokestatic    #41  <Method void zzc.zzJ(Parcel, int)>
	//   18   30:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzkR(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #47  <Method zzo zzkR(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzpq(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #53  <Method zzo[] zzpq(int)>
	//    3    5:areturn         
	}

	public zzo zzkR(Parcel parcel)
	{
		int i = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #58  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_2        
		String s = null;
	//    3    5:aconst_null     
	//    4    6:astore          5
		java.util.ArrayList arraylist = null;
	//    5    8:aconst_null     
	//    6    9:astore          4
		do
			if(parcel.dataPosition() < i)
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #64  <Method int Parcel.dataPosition()>
	//*   9   15:iload_2         
	//*  10   16:icmpge          90
			{
				int j = zzb.zzaX(parcel);
	//   11   19:aload_1         
	//   12   20:invokestatic    #67  <Method int zzb.zzaX(Parcel)>
	//   13   23:istore_3        
				switch(zzb.zzdc(j))
	//*  14   24:iload_3         
	//*  15   25:invokestatic    #71  <Method int zzb.zzdc(int)>
				{
	//*  16   28:lookupswitch    2: default 56
	//	               2: 59
	//	               3: 69
	//*  17   56:goto            82
				case 2: // '\002'
					s = zzb.zzq(parcel, j);
	//   18   59:aload_1         
	//   19   60:iload_3         
	//   20   61:invokestatic    #75  <Method String zzb.zzq(Parcel, int)>
	//   21   64:astore          5
					break;

	//*  22   66:goto            87
				case 3: // '\003'
					arraylist = zzb.zzc(parcel, j, zzcc.CREATOR);
	//   23   69:aload_1         
	//   24   70:iload_3         
	//   25   71:getstatic       #81  <Field android.os.Parcelable$Creator zzcc.CREATOR>
	//   26   74:invokestatic    #84  <Method java.util.ArrayList zzb.zzc(Parcel, int, android.os.Parcelable$Creator)>
	//   27   77:astore          4
					break;

	//*  28   79:goto            87
				default:
					zzb.zzb(parcel, j);
	//   29   82:aload_1         
	//   30   83:iload_3         
	//   31   84:invokestatic    #87  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  32   87:goto            11
			if(parcel.dataPosition() != i)
	//*  33   90:aload_1         
	//*  34   91:invokevirtual   #64  <Method int Parcel.dataPosition()>
	//*  35   94:iload_2         
	//*  36   95:icmpeq          128
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(i).toString(), parcel);
	//   37   98:new             #89  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   38  101:dup             
	//   39  102:new             #91  <Class StringBuilder>
	//   40  105:dup             
	//   41  106:bipush          37
	//   42  108:invokespecial   #94  <Method void StringBuilder(int)>
	//   43  111:ldc1            #96  <String "Overread allowed size end=">
	//   44  113:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   45  116:iload_2         
	//   46  117:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//   47  120:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   48  123:aload_1         
	//   49  124:invokespecial   #109 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   50  127:athrow          
			else
				return new zzo(s, ((java.util.List) (arraylist)));
	//   51  128:new             #22  <Class zzo>
	//   52  131:dup             
	//   53  132:aload           5
	//   54  134:aload           4
	//   55  136:invokespecial   #112 <Method void zzo(String, java.util.List)>
	//   56  139:areturn         
		while(true);
	}

	public zzo[] zzpq(int i)
	{
		return new zzo[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzo[]
	//    2    4:areturn         
	}
}
