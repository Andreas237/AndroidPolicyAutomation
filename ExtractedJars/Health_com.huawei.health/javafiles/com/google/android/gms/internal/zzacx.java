// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzacw

public class zzacx
	implements android.os.Parcelable.Creator
{

	public zzacx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzacw zzacw1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 1, zzacw1.zzaiI);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzacw.zzaiI>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 2, ((java.util.List) (zzacw1.zzyE())), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #34  <Method java.util.ArrayList zzacw.zzyE()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #37  <Method void zzc.zzc(Parcel, int, java.util.List, boolean)>
		zzc.zza(parcel, 3, zzacw1.zzyF(), false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #41  <Method String zzacw.zzyF()>
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
		return ((Object) (zzbg(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #54  <Method zzacw zzbg(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzdk(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #60  <Method zzacw[] zzdk(int)>
	//    3    5:areturn         
	}

	public zzacw zzbg(Parcel parcel)
	{
		int j = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #65  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		java.util.ArrayList arraylist = null;
	//    5    7:aconst_null     
	//    6    8:astore          6
		String s = null;
	//    7   10:aconst_null     
	//    8   11:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #71  <Method int Parcel.dataPosition()>
	//*  11   17:iload_3         
	//*  12   18:icmpge          107
			{
				int k = zzb.zzaX(parcel);
	//   13   21:aload_1         
	//   14   22:invokestatic    #74  <Method int zzb.zzaX(Parcel)>
	//   15   25:istore          4
				switch(zzb.zzdc(k))
	//*  16   27:iload           4
	//*  17   29:invokestatic    #78  <Method int zzb.zzdc(int)>
				{
	//*  18   32:tableswitch     1 3: default 60
	//	               1 63
	//	               2 73
	//	               3 87
	//*  19   60:goto            98
				case 1: // '\001'
					i = zzb.zzg(parcel, k);
	//   20   63:aload_1         
	//   21   64:iload           4
	//   22   66:invokestatic    #82  <Method int zzb.zzg(Parcel, int)>
	//   23   69:istore_2        
					break;

	//*  24   70:goto            104
				case 2: // '\002'
					arraylist = zzb.zzc(parcel, k, zzacw.zza.CREATOR);
	//   25   73:aload_1         
	//   26   74:iload           4
	//   27   76:getstatic       #88  <Field android.os.Parcelable$Creator zzacw$zza.CREATOR>
	//   28   79:invokestatic    #91  <Method java.util.ArrayList zzb.zzc(Parcel, int, android.os.Parcelable$Creator)>
	//   29   82:astore          6
					break;

	//*  30   84:goto            104
				case 3: // '\003'
					s = zzb.zzq(parcel, k);
	//   31   87:aload_1         
	//   32   88:iload           4
	//   33   90:invokestatic    #95  <Method String zzb.zzq(Parcel, int)>
	//   34   93:astore          5
					break;

	//*  35   95:goto            104
				default:
					zzb.zzb(parcel, k);
	//   36   98:aload_1         
	//   37   99:iload           4
	//   38  101:invokestatic    #98  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  39  104:goto            13
			if(parcel.dataPosition() != j)
	//*  40  107:aload_1         
	//*  41  108:invokevirtual   #71  <Method int Parcel.dataPosition()>
	//*  42  111:iload_3         
	//*  43  112:icmpeq          145
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   44  115:new             #100 <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   45  118:dup             
	//   46  119:new             #102 <Class StringBuilder>
	//   47  122:dup             
	//   48  123:bipush          37
	//   49  125:invokespecial   #105 <Method void StringBuilder(int)>
	//   50  128:ldc1            #107 <String "Overread allowed size end=">
	//   51  130:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   52  133:iload_3         
	//   53  134:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   54  137:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   55  140:aload_1         
	//   56  141:invokespecial   #120 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   57  144:athrow          
			else
				return new zzacw(i, arraylist, s);
	//   58  145:new             #22  <Class zzacw>
	//   59  148:dup             
	//   60  149:iload_2         
	//   61  150:aload           6
	//   62  152:aload           5
	//   63  154:invokespecial   #123 <Method void zzacw(int, java.util.ArrayList, String)>
	//   64  157:areturn         
		while(true);
	}

	public zzacw[] zzdk(int i)
	{
		return new zzacw[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzacw[]
	//    2    4:areturn         
	}
}
