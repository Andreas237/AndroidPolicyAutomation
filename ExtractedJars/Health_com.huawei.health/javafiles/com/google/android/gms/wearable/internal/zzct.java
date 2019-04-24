// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcs, zzcg

public class zzct
	implements android.os.Parcelable.Creator
{

	public zzct()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzcs zzcs1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 2, zzcs1.statusCode);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzcs.statusCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 3, zzcs1.zzbUP);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field long zzcs.zzbUP>
	//   12   20:invokestatic    #37  <Method void zzc.zza(Parcel, int, long)>
		zzc.zzc(parcel, 4, zzcs1.zzbUR, false);
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:getfield        #41  <Field java.util.List zzcs.zzbUR>
	//   17   29:iconst_0        
	//   18   30:invokestatic    #44  <Method void zzc.zzc(Parcel, int, java.util.List, boolean)>
		zzc.zzJ(parcel, i);
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:invokestatic    #48  <Method void zzc.zzJ(Parcel, int)>
	//   22   38:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzlv(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #54  <Method zzcs zzlv(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzpX(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #60  <Method zzcs[] zzpX(int)>
	//    3    5:areturn         
	}

	public zzcs zzlv(Parcel parcel)
	{
		int j = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #65  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		long l = 0L;
	//    5    7:lconst_0        
	//    6    8:lstore          5
		java.util.ArrayList arraylist = null;
	//    7   10:aconst_null     
	//    8   11:astore          7
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
	//*  18   32:tableswitch     2 4: default 60
	//	               2 63
	//	               3 73
	//	               4 84
	//*  19   60:goto            98
				case 2: // '\002'
					i = zzb.zzg(parcel, k);
	//   20   63:aload_1         
	//   21   64:iload           4
	//   22   66:invokestatic    #82  <Method int zzb.zzg(Parcel, int)>
	//   23   69:istore_2        
					break;

	//*  24   70:goto            104
				case 3: // '\003'
					l = zzb.zzi(parcel, k);
	//   25   73:aload_1         
	//   26   74:iload           4
	//   27   76:invokestatic    #86  <Method long zzb.zzi(Parcel, int)>
	//   28   79:lstore          5
					break;

	//*  29   81:goto            104
				case 4: // '\004'
					arraylist = zzb.zzc(parcel, k, zzcg.CREATOR);
	//   30   84:aload_1         
	//   31   85:iload           4
	//   32   87:getstatic       #92  <Field android.os.Parcelable$Creator zzcg.CREATOR>
	//   33   90:invokestatic    #95  <Method java.util.ArrayList zzb.zzc(Parcel, int, android.os.Parcelable$Creator)>
	//   34   93:astore          7
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
	//   54  137:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   55  140:aload_1         
	//   56  141:invokespecial   #121 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   57  144:athrow          
			else
				return new zzcs(i, l, ((java.util.List) (arraylist)));
	//   58  145:new             #22  <Class zzcs>
	//   59  148:dup             
	//   60  149:iload_2         
	//   61  150:lload           5
	//   62  152:aload           7
	//   63  154:invokespecial   #124 <Method void zzcs(int, long, java.util.List)>
	//   64  157:areturn         
		while(true);
	}

	public zzcs[] zzpX(int i)
	{
		return new zzcs[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzcs[]
	//    2    4:areturn         
	}
}
