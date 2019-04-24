// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzacz, zzacw

public class zzada
	implements android.os.Parcelable.Creator
{

	public zzada()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzacz zzacz1, Parcel parcel, int i)
	{
		int j = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_3        
		zzc.zzc(parcel, 1, zzacz1.getVersionCode());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #26  <Method int zzacz.getVersionCode()>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 2, zzacz1.zzyH(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #34  <Method Parcel zzacz.zzyH()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #37  <Method void zzc.zza(Parcel, int, Parcel, boolean)>
		zzc.zza(parcel, 3, ((android.os.Parcelable) (zzacz1.zzyI())), i, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #41  <Method zzacw zzacz.zzyI()>
	//   18   30:iload_2         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #44  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zzJ(parcel, j);
	//   21   35:aload_1         
	//   22   36:iload_3         
	//   23   37:invokestatic    #48  <Method void zzc.zzJ(Parcel, int)>
	//   24   40:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzbi(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #54  <Method zzacz zzbi(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzdm(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #60  <Method zzacz[] zzdm(int)>
	//    3    5:areturn         
	}

	public zzacz zzbi(Parcel parcel)
	{
		int j = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #65  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		Parcel parcel1 = null;
	//    5    7:aconst_null     
	//    6    8:astore          6
		zzacw zzacw1 = null;
	//    7   10:aconst_null     
	//    8   11:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #70  <Method int Parcel.dataPosition()>
	//*  11   17:iload_3         
	//*  12   18:icmpge          110
			{
				int k = zzb.zzaX(parcel);
	//   13   21:aload_1         
	//   14   22:invokestatic    #73  <Method int zzb.zzaX(Parcel)>
	//   15   25:istore          4
				switch(zzb.zzdc(k))
	//*  16   27:iload           4
	//*  17   29:invokestatic    #77  <Method int zzb.zzdc(int)>
				{
	//*  18   32:tableswitch     1 3: default 60
	//	               1 63
	//	               2 73
	//	               3 84
	//*  19   60:goto            101
				case 1: // '\001'
					i = zzb.zzg(parcel, k);
	//   20   63:aload_1         
	//   21   64:iload           4
	//   22   66:invokestatic    #81  <Method int zzb.zzg(Parcel, int)>
	//   23   69:istore_2        
					break;

	//*  24   70:goto            107
				case 2: // '\002'
					parcel1 = zzb.zzF(parcel, k);
	//   25   73:aload_1         
	//   26   74:iload           4
	//   27   76:invokestatic    #85  <Method Parcel zzb.zzF(Parcel, int)>
	//   28   79:astore          6
					break;

	//*  29   81:goto            107
				case 3: // '\003'
					zzacw1 = (zzacw)zzb.zza(parcel, k, zzacw.CREATOR);
	//   30   84:aload_1         
	//   31   85:iload           4
	//   32   87:getstatic       #91  <Field android.os.Parcelable$Creator zzacw.CREATOR>
	//   33   90:invokestatic    #94  <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   34   93:checkcast       #87  <Class zzacw>
	//   35   96:astore          5
					break;

	//*  36   98:goto            107
				default:
					zzb.zzb(parcel, k);
	//   37  101:aload_1         
	//   38  102:iload           4
	//   39  104:invokestatic    #97  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  40  107:goto            13
			if(parcel.dataPosition() != j)
	//*  41  110:aload_1         
	//*  42  111:invokevirtual   #70  <Method int Parcel.dataPosition()>
	//*  43  114:iload_3         
	//*  44  115:icmpeq          148
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   45  118:new             #99  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   46  121:dup             
	//   47  122:new             #101 <Class StringBuilder>
	//   48  125:dup             
	//   49  126:bipush          37
	//   50  128:invokespecial   #104 <Method void StringBuilder(int)>
	//   51  131:ldc1            #106 <String "Overread allowed size end=">
	//   52  133:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   53  136:iload_3         
	//   54  137:invokevirtual   #113 <Method StringBuilder StringBuilder.append(int)>
	//   55  140:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   56  143:aload_1         
	//   57  144:invokespecial   #120 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   58  147:athrow          
			else
				return new zzacz(i, parcel1, zzacw1);
	//   59  148:new             #22  <Class zzacz>
	//   60  151:dup             
	//   61  152:iload_2         
	//   62  153:aload           6
	//   63  155:aload           5
	//   64  157:invokespecial   #123 <Method void zzacz(int, Parcel, zzacw)>
	//   65  160:areturn         
		while(true);
	}

	public zzacz[] zzdm(int i)
	{
		return new zzacz[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzacz[]
	//    2    4:areturn         
	}
}
