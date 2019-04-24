// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzayx, zzayz

public class zzayy
	implements android.os.Parcelable.Creator
{

	public zzayy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzayx zzayx1, Parcel parcel, int i)
	{
		int j = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_3        
		zzc.zzc(parcel, 2, zzayx1.zzbBy);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzayx.zzbBy>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 3, ((android.os.Parcelable []) (zzayx1.zzbBz)), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field zzayz[] zzayx.zzbBz>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #37  <Method void zzc.zza(Parcel, int, android.os.Parcelable[], int, boolean)>
		zzc.zza(parcel, 4, zzayx1.zzbBA, false);
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:getfield        #41  <Field String[] zzayx.zzbBA>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #44  <Method void zzc.zza(Parcel, int, String[], boolean)>
		zzc.zzJ(parcel, j);
	//   21   35:aload_1         
	//   22   36:iload_3         
	//   23   37:invokestatic    #48  <Method void zzc.zzJ(Parcel, int)>
	//   24   40:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzja(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #54  <Method zzayx zzja(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzmX(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #60  <Method zzayx[] zzmX(int)>
	//    3    5:areturn         
	}

	public zzayx zzja(Parcel parcel)
	{
		int j = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #65  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		zzayz azzayz[] = null;
	//    5    7:aconst_null     
	//    6    8:astore          6
		String as[] = null;
	//    7   10:aconst_null     
	//    8   11:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #71  <Method int Parcel.dataPosition()>
	//*  11   17:iload_3         
	//*  12   18:icmpge          110
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
	//	               4 90
	//*  19   60:goto            101
				case 2: // '\002'
					i = zzb.zzg(parcel, k);
	//   20   63:aload_1         
	//   21   64:iload           4
	//   22   66:invokestatic    #82  <Method int zzb.zzg(Parcel, int)>
	//   23   69:istore_2        
					break;

	//*  24   70:goto            107
				case 3: // '\003'
					azzayz = (zzayz[])zzb.zzb(parcel, k, zzayz.CREATOR);
	//   25   73:aload_1         
	//   26   74:iload           4
	//   27   76:getstatic       #88  <Field android.os.Parcelable$Creator zzayz.CREATOR>
	//   28   79:invokestatic    #92  <Method Object[] zzb.zzb(Parcel, int, android.os.Parcelable$Creator)>
	//   29   82:checkcast       #93  <Class zzayz[]>
	//   30   85:astore          6
					break;

	//*  31   87:goto            107
				case 4: // '\004'
					as = zzb.zzC(parcel, k);
	//   32   90:aload_1         
	//   33   91:iload           4
	//   34   93:invokestatic    #97  <Method String[] zzb.zzC(Parcel, int)>
	//   35   96:astore          5
					break;

	//*  36   98:goto            107
				default:
					zzb.zzb(parcel, k);
	//   37  101:aload_1         
	//   38  102:iload           4
	//   39  104:invokestatic    #99  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  40  107:goto            13
			if(parcel.dataPosition() != j)
	//*  41  110:aload_1         
	//*  42  111:invokevirtual   #71  <Method int Parcel.dataPosition()>
	//*  43  114:iload_3         
	//*  44  115:icmpeq          148
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
	//   45  118:new             #101 <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   46  121:dup             
	//   47  122:new             #103 <Class StringBuilder>
	//   48  125:dup             
	//   49  126:bipush          37
	//   50  128:invokespecial   #106 <Method void StringBuilder(int)>
	//   51  131:ldc1            #108 <String "Overread allowed size end=">
	//   52  133:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   53  136:iload_3         
	//   54  137:invokevirtual   #115 <Method StringBuilder StringBuilder.append(int)>
	//   55  140:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   56  143:aload_1         
	//   57  144:invokespecial   #122 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   58  147:athrow          
			else
				return new zzayx(i, azzayz, as);
	//   59  148:new             #22  <Class zzayx>
	//   60  151:dup             
	//   61  152:iload_2         
	//   62  153:aload           6
	//   63  155:aload           5
	//   64  157:invokespecial   #125 <Method void zzayx(int, zzayz[], String[])>
	//   65  160:areturn         
		while(true);
	}

	public zzayx[] zzmX(int i)
	{
		return new zzayx[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzayx[]
	//    2    4:areturn         
	}
}
