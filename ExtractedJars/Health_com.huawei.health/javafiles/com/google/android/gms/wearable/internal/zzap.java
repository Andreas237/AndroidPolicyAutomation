// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzao

public class zzap
	implements android.os.Parcelable.Creator
{

	public zzap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzao zzao1, Parcel parcel, int i)
	{
		int j = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_3        
		zzc.zza(parcel, 2, ((android.os.Parcelable) (zzao1.getUri())), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #26  <Method Uri zzao.getUri()>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #29  <Method void zzc.zza(Parcel, int, android.os.Parcelable, int, boolean)>
		zzc.zza(parcel, 4, zzao1.zzUg(), false);
	//   10   16:aload_1         
	//   11   17:iconst_4        
	//   12   18:aload_0         
	//   13   19:invokevirtual   #33  <Method android.os.Bundle zzao.zzUg()>
	//   14   22:iconst_0        
	//   15   23:invokestatic    #36  <Method void zzc.zza(Parcel, int, android.os.Bundle, boolean)>
		zzc.zza(parcel, 5, zzao1.getData(), false);
	//   16   26:aload_1         
	//   17   27:iconst_5        
	//   18   28:aload_0         
	//   19   29:invokevirtual   #40  <Method byte[] zzao.getData()>
	//   20   32:iconst_0        
	//   21   33:invokestatic    #43  <Method void zzc.zza(Parcel, int, byte[], boolean)>
		zzc.zzJ(parcel, j);
	//   22   36:aload_1         
	//   23   37:iload_3         
	//   24   38:invokestatic    #47  <Method void zzc.zzJ(Parcel, int)>
	//   25   41:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzkY(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #53  <Method zzao zzkY(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzpA(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #59  <Method zzao[] zzpA(int)>
	//    3    5:areturn         
	}

	public zzao zzkY(Parcel parcel)
	{
		int i = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #64  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore_2        
		Uri uri = null;
	//    3    5:aconst_null     
	//    4    6:astore          6
		android.os.Bundle bundle = null;
	//    5    8:aconst_null     
	//    6    9:astore          5
		byte abyte0[] = null;
	//    7   11:aconst_null     
	//    8   12:astore          4
		do
		{
			if(parcel.dataPosition() >= i)
				break;
	//    9   14:aload_1         
	//   10   15:invokevirtual   #70  <Method int Parcel.dataPosition()>
	//   11   18:iload_2         
	//   12   19:icmpge          107
			int j = zzb.zzaX(parcel);
	//   13   22:aload_1         
	//   14   23:invokestatic    #73  <Method int zzb.zzaX(Parcel)>
	//   15   26:istore_3        
			switch(zzb.zzdc(j))
	//*  16   27:iload_3         
	//*  17   28:invokestatic    #77  <Method int zzb.zzdc(int)>
			{
	//*  18   31:tableswitch     2 5: default 60
	//	               2 63
	//	               3 99
	//	               4 79
	//	               5 89
	//*  19   60:goto            99
			case 2: // '\002'
				uri = (Uri)zzb.zza(parcel, j, Uri.CREATOR);
	//   20   63:aload_1         
	//   21   64:iload_3         
	//   22   65:getstatic       #83  <Field android.os.Parcelable$Creator Uri.CREATOR>
	//   23   68:invokestatic    #86  <Method android.os.Parcelable zzb.zza(Parcel, int, android.os.Parcelable$Creator)>
	//   24   71:checkcast       #79  <Class Uri>
	//   25   74:astore          6
				break;

	//*  26   76:goto            104
			case 4: // '\004'
				bundle = zzb.zzs(parcel, j);
	//   27   79:aload_1         
	//   28   80:iload_3         
	//   29   81:invokestatic    #90  <Method android.os.Bundle zzb.zzs(Parcel, int)>
	//   30   84:astore          5
				break;

	//*  31   86:goto            104
			case 5: // '\005'
				abyte0 = zzb.zzt(parcel, j);
	//   32   89:aload_1         
	//   33   90:iload_3         
	//   34   91:invokestatic    #94  <Method byte[] zzb.zzt(Parcel, int)>
	//   35   94:astore          4
				break;

	//*  36   96:goto            104
			case 3: // '\003'
			default:
				zzb.zzb(parcel, j);
	//   37   99:aload_1         
	//   38  100:iload_3         
	//   39  101:invokestatic    #97  <Method void zzb.zzb(Parcel, int)>
				break;
			}
		} while(true);
	//*  40  104:goto            14
		if(parcel.dataPosition() != i)
	//*  41  107:aload_1         
	//*  42  108:invokevirtual   #70  <Method int Parcel.dataPosition()>
	//*  43  111:iload_2         
	//*  44  112:icmpeq          145
			throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(i).toString(), parcel);
	//   45  115:new             #99  <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   46  118:dup             
	//   47  119:new             #101 <Class StringBuilder>
	//   48  122:dup             
	//   49  123:bipush          37
	//   50  125:invokespecial   #104 <Method void StringBuilder(int)>
	//   51  128:ldc1            #106 <String "Overread allowed size end=">
	//   52  130:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   53  133:iload_2         
	//   54  134:invokevirtual   #113 <Method StringBuilder StringBuilder.append(int)>
	//   55  137:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   56  140:aload_1         
	//   57  141:invokespecial   #120 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   58  144:athrow          
		else
			return new zzao(uri, bundle, abyte0);
	//   59  145:new             #22  <Class zzao>
	//   60  148:dup             
	//   61  149:aload           6
	//   62  151:aload           5
	//   63  153:aload           4
	//   64  155:invokespecial   #123 <Method void zzao(Uri, android.os.Bundle, byte[])>
	//   65  158:areturn         
	}

	public zzao[] zzpA(int i)
	{
		return new zzao[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzao[]
	//    2    4:areturn         
	}
}
