// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzawc

public class zzawd
	implements android.os.Parcelable.Creator
{

	public zzawd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzawc zzawc1, Parcel parcel, int i)
	{
		i = zzc.zzaV(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaV(Parcel)>
	//    2    4:istore_2        
		zzc.zzc(parcel, 1, zzawc1.mVersionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int zzawc.mVersionCode>
	//    7   11:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zza(parcel, 2, zzawc1.name, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #34  <Field String zzawc.name>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #37  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zza(parcel, 3, zzawc1.zzbzt);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #41  <Field long zzawc.zzbzt>
	//   18   30:invokestatic    #44  <Method void zzc.zza(Parcel, int, long)>
		zzc.zza(parcel, 4, zzawc1.zzbgG);
	//   19   33:aload_1         
	//   20   34:iconst_4        
	//   21   35:aload_0         
	//   22   36:getfield        #48  <Field boolean zzawc.zzbgG>
	//   23   39:invokestatic    #51  <Method void zzc.zza(Parcel, int, boolean)>
		zzc.zza(parcel, 5, zzawc1.zzbgI);
	//   24   42:aload_1         
	//   25   43:iconst_5        
	//   26   44:aload_0         
	//   27   45:getfield        #55  <Field double zzawc.zzbgI>
	//   28   48:invokestatic    #58  <Method void zzc.zza(Parcel, int, double)>
		zzc.zza(parcel, 6, zzawc1.zzaFy, false);
	//   29   51:aload_1         
	//   30   52:bipush          6
	//   31   54:aload_0         
	//   32   55:getfield        #61  <Field String zzawc.zzaFy>
	//   33   58:iconst_0        
	//   34   59:invokestatic    #37  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zza(parcel, 7, zzawc1.zzbzu, false);
	//   35   62:aload_1         
	//   36   63:bipush          7
	//   37   65:aload_0         
	//   38   66:getfield        #65  <Field byte[] zzawc.zzbzu>
	//   39   69:iconst_0        
	//   40   70:invokestatic    #68  <Method void zzc.zza(Parcel, int, byte[], boolean)>
		zzc.zzc(parcel, 8, zzawc1.zzbzv);
	//   41   73:aload_1         
	//   42   74:bipush          8
	//   43   76:aload_0         
	//   44   77:getfield        #71  <Field int zzawc.zzbzv>
	//   45   80:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 9, zzawc1.zzbzw);
	//   46   83:aload_1         
	//   47   84:bipush          9
	//   48   86:aload_0         
	//   49   87:getfield        #74  <Field int zzawc.zzbzw>
	//   50   90:invokestatic    #30  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzJ(parcel, i);
	//   51   93:aload_1         
	//   52   94:iload_2         
	//   53   95:invokestatic    #78  <Method void zzc.zzJ(Parcel, int)>
	//   54   98:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zziu(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #84  <Method zzawc zziu(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzmm(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #90  <Method zzawc[] zzmm(int)>
	//    3    5:areturn         
	}

	public zzawc zziu(Parcel parcel)
	{
		byte abyte0[] = null;
	//    0    0:aconst_null     
	//    1    1:astore          12
		int i = 0;
	//    2    3:iconst_0        
	//    3    4:istore          4
		int l = zzb.zzaU(parcel);
	//    4    6:aload_1         
	//    5    7:invokestatic    #95  <Method int zzb.zzaU(Parcel)>
	//    6   10:istore          7
		long l1 = 0L;
	//    7   12:lconst_0        
	//    8   13:lstore          9
		double d = 0.0D;
	//    9   15:dconst_0        
	//   10   16:dstore_2        
		int j = 0;
	//   11   17:iconst_0        
	//   12   18:istore          5
		String s = null;
	//   13   20:aconst_null     
	//   14   21:astore          13
		boolean flag = false;
	//   15   23:iconst_0        
	//   16   24:istore          11
		String s1 = null;
	//   17   26:aconst_null     
	//   18   27:astore          14
		int k = 0;
	//   19   29:iconst_0        
	//   20   30:istore          6
		do
			if(parcel.dataPosition() < l)
	//*  21   32:aload_1         
	//*  22   33:invokevirtual   #101 <Method int Parcel.dataPosition()>
	//*  23   36:iload           7
	//*  24   38:icmpge          211
			{
				int i1 = zzb.zzaT(parcel);
	//   25   41:aload_1         
	//   26   42:invokestatic    #104 <Method int zzb.zzaT(Parcel)>
	//   27   45:istore          8
				switch(zzb.zzcW(i1))
	//*  28   47:iload           8
	//*  29   49:invokestatic    #108 <Method int zzb.zzcW(int)>
				{
	//*  30   52:tableswitch     1 9: default 104
	//	               1 113
	//	               2 124
	//	               3 135
	//	               4 146
	//	               5 157
	//	               6 167
	//	               7 178
	//	               8 189
	//	               9 200
				default:
					zzb.zzb(parcel, i1);
	//   31  104:aload_1         
	//   32  105:iload           8
	//   33  107:invokestatic    #111 <Method void zzb.zzb(Parcel, int)>
					break;

	//*  34  110:goto            32
				case 1: // '\001'
					k = zzb.zzg(parcel, i1);
	//   35  113:aload_1         
	//   36  114:iload           8
	//   37  116:invokestatic    #115 <Method int zzb.zzg(Parcel, int)>
	//   38  119:istore          6
					break;

	//*  39  121:goto            32
				case 2: // '\002'
					s1 = zzb.zzq(parcel, i1);
	//   40  124:aload_1         
	//   41  125:iload           8
	//   42  127:invokestatic    #119 <Method String zzb.zzq(Parcel, int)>
	//   43  130:astore          14
					break;

	//*  44  132:goto            32
				case 3: // '\003'
					l1 = zzb.zzi(parcel, i1);
	//   45  135:aload_1         
	//   46  136:iload           8
	//   47  138:invokestatic    #123 <Method long zzb.zzi(Parcel, int)>
	//   48  141:lstore          9
					break;

	//*  49  143:goto            32
				case 4: // '\004'
					flag = zzb.zzc(parcel, i1);
	//   50  146:aload_1         
	//   51  147:iload           8
	//   52  149:invokestatic    #126 <Method boolean zzb.zzc(Parcel, int)>
	//   53  152:istore          11
					break;

	//*  54  154:goto            32
				case 5: // '\005'
					d = zzb.zzn(parcel, i1);
	//   55  157:aload_1         
	//   56  158:iload           8
	//   57  160:invokestatic    #130 <Method double zzb.zzn(Parcel, int)>
	//   58  163:dstore_2        
					break;

	//*  59  164:goto            32
				case 6: // '\006'
					s = zzb.zzq(parcel, i1);
	//   60  167:aload_1         
	//   61  168:iload           8
	//   62  170:invokestatic    #119 <Method String zzb.zzq(Parcel, int)>
	//   63  173:astore          13
					break;

	//*  64  175:goto            32
				case 7: // '\007'
					abyte0 = zzb.zzt(parcel, i1);
	//   65  178:aload_1         
	//   66  179:iload           8
	//   67  181:invokestatic    #134 <Method byte[] zzb.zzt(Parcel, int)>
	//   68  184:astore          12
					break;

	//*  69  186:goto            32
				case 8: // '\b'
					j = zzb.zzg(parcel, i1);
	//   70  189:aload_1         
	//   71  190:iload           8
	//   72  192:invokestatic    #115 <Method int zzb.zzg(Parcel, int)>
	//   73  195:istore          5
					break;

	//*  74  197:goto            32
				case 9: // '\t'
					i = zzb.zzg(parcel, i1);
	//   75  200:aload_1         
	//   76  201:iload           8
	//   77  203:invokestatic    #115 <Method int zzb.zzg(Parcel, int)>
	//   78  206:istore          4
					break;
				}
			} else
	//*  79  208:goto            32
			if(parcel.dataPosition() != l)
	//*  80  211:aload_1         
	//*  81  212:invokevirtual   #101 <Method int Parcel.dataPosition()>
	//*  82  215:iload           7
	//*  83  217:icmpeq          251
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(l).toString(), parcel);
	//   84  220:new             #136 <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   85  223:dup             
	//   86  224:new             #138 <Class StringBuilder>
	//   87  227:dup             
	//   88  228:bipush          37
	//   89  230:invokespecial   #141 <Method void StringBuilder(int)>
	//   90  233:ldc1            #143 <String "Overread allowed size end=">
	//   91  235:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   92  238:iload           7
	//   93  240:invokevirtual   #150 <Method StringBuilder StringBuilder.append(int)>
	//   94  243:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   95  246:aload_1         
	//   96  247:invokespecial   #157 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   97  250:athrow          
			else
				return new zzawc(k, s1, l1, flag, d, s, abyte0, j, i);
	//   98  251:new             #22  <Class zzawc>
	//   99  254:dup             
	//  100  255:iload           6
	//  101  257:aload           14
	//  102  259:lload           9
	//  103  261:iload           11
	//  104  263:dload_2         
	//  105  264:aload           13
	//  106  266:aload           12
	//  107  268:iload           5
	//  108  270:iload           4
	//  109  272:invokespecial   #160 <Method void zzawc(int, String, long, boolean, double, String, byte[], int, int)>
	//  110  275:areturn         
		while(true);
	}

	public zzawc[] zzmm(int i)
	{
		return new zzawc[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzawc[]
	//    2    4:areturn         
	}
}
