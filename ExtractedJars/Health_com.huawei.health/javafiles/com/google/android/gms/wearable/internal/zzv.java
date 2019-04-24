// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzu

public class zzv
	implements android.os.Parcelable.Creator
{

	public zzv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzu zzu1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zza(parcel, 2, zzu1.getToken(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #26  <Method String zzu.getToken()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #29  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zza(parcel, 3, zzu1.getNodeId(), false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #32  <Method String zzu.getNodeId()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #29  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zza(parcel, 4, zzu1.getPath(), false);
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #35  <Method String zzu.getPath()>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #29  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zzJ(parcel, i);
	//   21   35:aload_1         
	//   22   36:iload_2         
	//   23   37:invokestatic    #39  <Method void zzc.zzJ(Parcel, int)>
	//   24   40:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzkT(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #45  <Method zzu zzkT(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzpu(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #51  <Method zzu[] zzpu(int)>
	//    3    5:areturn         
	}

	public zzu zzkT(Parcel parcel)
	{
		int i = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #56  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_2        
		String s2 = null;
	//    3    5:aconst_null     
	//    4    6:astore          6
		String s1 = null;
	//    5    8:aconst_null     
	//    6    9:astore          5
		String s = null;
	//    7   11:aconst_null     
	//    8   12:astore          4
		do
			if(parcel.dataPosition() < i)
	//*   9   14:aload_1         
	//*  10   15:invokevirtual   #62  <Method int Parcel.dataPosition()>
	//*  11   18:iload_2         
	//*  12   19:icmpge          97
			{
				int j = zzb.zzaX(parcel);
	//   13   22:aload_1         
	//   14   23:invokestatic    #65  <Method int zzb.zzaX(Parcel)>
	//   15   26:istore_3        
				switch(zzb.zzdc(j))
	//*  16   27:iload_3         
	//*  17   28:invokestatic    #69  <Method int zzb.zzdc(int)>
				{
	//*  18   31:tableswitch     2 4: default 56
	//	               2 59
	//	               3 69
	//	               4 79
	//*  19   56:goto            89
				case 2: // '\002'
					s2 = zzb.zzq(parcel, j);
	//   20   59:aload_1         
	//   21   60:iload_3         
	//   22   61:invokestatic    #73  <Method String zzb.zzq(Parcel, int)>
	//   23   64:astore          6
					break;

	//*  24   66:goto            94
				case 3: // '\003'
					s1 = zzb.zzq(parcel, j);
	//   25   69:aload_1         
	//   26   70:iload_3         
	//   27   71:invokestatic    #73  <Method String zzb.zzq(Parcel, int)>
	//   28   74:astore          5
					break;

	//*  29   76:goto            94
				case 4: // '\004'
					s = zzb.zzq(parcel, j);
	//   30   79:aload_1         
	//   31   80:iload_3         
	//   32   81:invokestatic    #73  <Method String zzb.zzq(Parcel, int)>
	//   33   84:astore          4
					break;

	//*  34   86:goto            94
				default:
					zzb.zzb(parcel, j);
	//   35   89:aload_1         
	//   36   90:iload_3         
	//   37   91:invokestatic    #76  <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  38   94:goto            14
			if(parcel.dataPosition() != i)
	//*  39   97:aload_1         
	//*  40   98:invokevirtual   #62  <Method int Parcel.dataPosition()>
	//*  41  101:iload_2         
	//*  42  102:icmpeq          135
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(i).toString(), parcel);
	//   43  105:new             #78  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   44  108:dup             
	//   45  109:new             #80  <Class StringBuilder>
	//   46  112:dup             
	//   47  113:bipush          37
	//   48  115:invokespecial   #83  <Method void StringBuilder(int)>
	//   49  118:ldc1            #85  <String "Overread allowed size end=">
	//   50  120:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   51  123:iload_2         
	//   52  124:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
	//   53  127:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   54  130:aload_1         
	//   55  131:invokespecial   #98  <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   56  134:athrow          
			else
				return new zzu(s2, s1, s);
	//   57  135:new             #22  <Class zzu>
	//   58  138:dup             
	//   59  139:aload           6
	//   60  141:aload           5
	//   61  143:aload           4
	//   62  145:invokespecial   #101 <Method void zzu(String, String, String)>
	//   63  148:areturn         
		while(true);
	}

	public zzu[] zzpu(int i)
	{
		return new zzu[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzu[]
	//    2    4:areturn         
	}
}
