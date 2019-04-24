// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzawa, zzawc

public class zzawb
	implements android.os.Parcelable.Creator
{

	public zzawb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzawa zzawa1, Parcel parcel, int i)
	{
		int j = zzc.zzaV(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaV(Parcel)>
	//    2    4:istore_3        
		zzc.zzc(parcel, 1, zzawa1.mVersionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzawa.mVersionCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 2, zzawa1.zzbzp);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #33  <Field int zzawa.zzbzp>
	//   12   20:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 3, ((android.os.Parcelable []) (zzawa1.zzbzq)), i, false);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #37  <Field zzawc[] zzawa.zzbzq>
	//   17   29:iload_2         
	//   18   30:iconst_0        
	//   19   31:invokestatic    #40  <Method void zzc.zza(Parcel, int, android.os.Parcelable[], int, boolean)>
		zzc.zza(parcel, 4, zzawa1.zzbzr, false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:getfield        #44  <Field String[] zzawa.zzbzr>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #47  <Method void zzc.zza(Parcel, int, String[], boolean)>
		zzc.zzJ(parcel, j);
	//   26   44:aload_1         
	//   27   45:iload_3         
	//   28   46:invokestatic    #51  <Method void zzc.zzJ(Parcel, int)>
	//   29   49:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzit(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #57  <Method zzawa zzit(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzml(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #63  <Method zzawa[] zzml(int)>
	//    3    5:areturn         
	}

	public zzawa zzit(Parcel parcel)
	{
		int i;
		int j;
		int l;
		String as[];
		zzawc azzawc[];
		as = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		j = 0;
	//    2    3:iconst_0        
	//    3    4:istore_3        
		l = zzb.zzaU(parcel);
	//    4    5:aload_1         
	//    5    6:invokestatic    #68  <Method int zzb.zzaU(Parcel)>
	//    6    9:istore          5
		azzawc = null;
	//    7   11:aconst_null     
	//    8   12:astore          7
		i = 0;
	//    9   14:iconst_0        
	//   10   15:istore_2        
_L7:
		int k;
		if(parcel.dataPosition() >= l)
			break MISSING_BLOCK_LABEL_169;
	//   11   16:aload_1         
	//   12   17:invokevirtual   #74  <Method int Parcel.dataPosition()>
	//   13   20:iload           5
	//   14   22:icmpge          169
		k = zzb.zzaT(parcel);
	//   15   25:aload_1         
	//   16   26:invokestatic    #77  <Method int zzb.zzaT(Parcel)>
	//   17   29:istore          4
		zzb.zzcW(k);
	//   18   31:iload           4
	//   19   33:invokestatic    #81  <Method int zzb.zzcW(int)>
		JVM INSTR tableswitch 1 4: default 68
	//	               1 93
	//	               2 109
	//	               3 125
	//	               4 150;
	//   20   36:tableswitch     1 4: default 68
	//	               1 93
	//	               2 109
	//	               3 125
	//	               4 150
		   goto _L1 _L2 _L3 _L4 _L5
_L5:
		break MISSING_BLOCK_LABEL_150;
_L2:
		break; /* Loop/switch isn't completed */
_L1:
		zzb.zzb(parcel, k);
	//   21   68:aload_1         
	//   22   69:iload           4
	//   23   71:invokestatic    #84  <Method void zzb.zzb(Parcel, int)>
		k = j;
	//   24   74:iload_3         
	//   25   75:istore          4
		j = i;
	//   26   77:iload_2         
	//   27   78:istore_3        
		i = k;
	//   28   79:iload           4
	//   29   81:istore_2        
_L8:
		k = j;
	//   30   82:iload_3         
	//   31   83:istore          4
		j = i;
	//   32   85:iload_2         
	//   33   86:istore_3        
		i = k;
	//   34   87:iload           4
	//   35   89:istore_2        
		if(true) goto _L7; else goto _L6
	//   36   90:goto            16
_L6:
		k = zzb.zzg(parcel, k);
	//   37   93:aload_1         
	//   38   94:iload           4
	//   39   96:invokestatic    #88  <Method int zzb.zzg(Parcel, int)>
	//   40   99:istore          4
		i = j;
	//   41  101:iload_3         
	//   42  102:istore_2        
		j = k;
	//   43  103:iload           4
	//   44  105:istore_3        
		  goto _L8
	//*  45  106:goto            82
_L3:
		k = zzb.zzg(parcel, k);
	//   46  109:aload_1         
	//   47  110:iload           4
	//   48  112:invokestatic    #88  <Method int zzb.zzg(Parcel, int)>
	//   49  115:istore          4
		j = i;
	//   50  117:iload_2         
	//   51  118:istore_3        
		i = k;
	//   52  119:iload           4
	//   53  121:istore_2        
		  goto _L8
	//*  54  122:goto            82
_L4:
		azzawc = (zzawc[])zzb.zzb(parcel, k, zzawc.CREATOR);
	//   55  125:aload_1         
	//   56  126:iload           4
	//   57  128:getstatic       #94  <Field android.os.Parcelable$Creator zzawc.CREATOR>
	//   58  131:invokestatic    #97  <Method Object[] zzb.zzb(Parcel, int, android.os.Parcelable$Creator)>
	//   59  134:checkcast       #98  <Class zzawc[]>
	//   60  137:astore          7
		k = i;
	//   61  139:iload_2         
	//   62  140:istore          4
		i = j;
	//   63  142:iload_3         
	//   64  143:istore_2        
		j = k;
	//   65  144:iload           4
	//   66  146:istore_3        
		  goto _L8
	//*  67  147:goto            82
		as = zzb.zzC(parcel, k);
	//   68  150:aload_1         
	//   69  151:iload           4
	//   70  153:invokestatic    #102 <Method String[] zzb.zzC(Parcel, int)>
	//   71  156:astore          6
		k = i;
	//   72  158:iload_2         
	//   73  159:istore          4
		i = j;
	//   74  161:iload_3         
	//   75  162:istore_2        
		j = k;
	//   76  163:iload           4
	//   77  165:istore_3        
		  goto _L8
	//*  78  166:goto            82
		if(parcel.dataPosition() != l)
	//*  79  169:aload_1         
	//*  80  170:invokevirtual   #74  <Method int Parcel.dataPosition()>
	//*  81  173:iload           5
	//*  82  175:icmpeq          209
			throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(l).toString(), parcel);
	//   83  178:new             #104 <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   84  181:dup             
	//   85  182:new             #106 <Class StringBuilder>
	//   86  185:dup             
	//   87  186:bipush          37
	//   88  188:invokespecial   #109 <Method void StringBuilder(int)>
	//   89  191:ldc1            #111 <String "Overread allowed size end=">
	//   90  193:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   91  196:iload           5
	//   92  198:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//   93  201:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   94  204:aload_1         
	//   95  205:invokespecial   #125 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   96  208:athrow          
		else
			return new zzawa(i, j, azzawc, as);
	//   97  209:new             #22  <Class zzawa>
	//   98  212:dup             
	//   99  213:iload_2         
	//  100  214:iload_3         
	//  101  215:aload           7
	//  102  217:aload           6
	//  103  219:invokespecial   #128 <Method void zzawa(int, int, zzawc[], String[])>
	//  104  222:areturn         
	}

	public zzawa[] zzml(int i)
	{
		return new zzawa[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzawa[]
	//    2    4:areturn         
	}
}
