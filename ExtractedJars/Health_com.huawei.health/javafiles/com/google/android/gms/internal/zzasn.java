// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzasm

public class zzasn
	implements android.os.Parcelable.Creator
{

	public zzasn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void zza(zzasm zzasm1, Parcel parcel, int i)
	{
		i = zzc.zzaZ(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int zzc.zzaZ(Parcel)>
	//    2    4:istore_2        
		zzc.zza(parcel, 1, zzasm1.getRequestId(), false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #26  <Method String zzasm.getRequestId()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #29  <Method void zzc.zza(Parcel, int, String, boolean)>
		zzc.zza(parcel, 2, zzasm1.getExpirationTime());
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #33  <Method long zzasm.getExpirationTime()>
	//   13   21:invokestatic    #36  <Method void zzc.zza(Parcel, int, long)>
		zzc.zza(parcel, 3, zzasm1.zzIu());
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #40  <Method short zzasm.zzIu()>
	//   18   30:invokestatic    #43  <Method void zzc.zza(Parcel, int, short)>
		zzc.zza(parcel, 4, zzasm1.getLatitude());
	//   19   33:aload_1         
	//   20   34:iconst_4        
	//   21   35:aload_0         
	//   22   36:invokevirtual   #47  <Method double zzasm.getLatitude()>
	//   23   39:invokestatic    #50  <Method void zzc.zza(Parcel, int, double)>
		zzc.zza(parcel, 5, zzasm1.getLongitude());
	//   24   42:aload_1         
	//   25   43:iconst_5        
	//   26   44:aload_0         
	//   27   45:invokevirtual   #53  <Method double zzasm.getLongitude()>
	//   28   48:invokestatic    #50  <Method void zzc.zza(Parcel, int, double)>
		zzc.zza(parcel, 6, zzasm1.getRadius());
	//   29   51:aload_1         
	//   30   52:bipush          6
	//   31   54:aload_0         
	//   32   55:invokevirtual   #57  <Method float zzasm.getRadius()>
	//   33   58:invokestatic    #60  <Method void zzc.zza(Parcel, int, float)>
		zzc.zzc(parcel, 7, zzasm1.zzIv());
	//   34   61:aload_1         
	//   35   62:bipush          7
	//   36   64:aload_0         
	//   37   65:invokevirtual   #64  <Method int zzasm.zzIv()>
	//   38   68:invokestatic    #68  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 8, zzasm1.zzIw());
	//   39   71:aload_1         
	//   40   72:bipush          8
	//   41   74:aload_0         
	//   42   75:invokevirtual   #71  <Method int zzasm.zzIw()>
	//   43   78:invokestatic    #68  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzc(parcel, 9, zzasm1.zzIx());
	//   44   81:aload_1         
	//   45   82:bipush          9
	//   46   84:aload_0         
	//   47   85:invokevirtual   #74  <Method int zzasm.zzIx()>
	//   48   88:invokestatic    #68  <Method void zzc.zzc(Parcel, int, int)>
		zzc.zzJ(parcel, i);
	//   49   91:aload_1         
	//   50   92:iload_2         
	//   51   93:invokestatic    #78  <Method void zzc.zzJ(Parcel, int)>
	//   52   96:return          
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzgX(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #84  <Method zzasm zzgX(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzkC(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #90  <Method zzasm[] zzkC(int)>
	//    3    5:areturn         
	}

	public zzasm zzgX(Parcel parcel)
	{
		int l = zzb.zzaY(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #95  <Method int zzb.zzaY(Parcel)>
	//    2    4:istore          11
		String s = null;
	//    3    6:aconst_null     
	//    4    7:astore          15
		int k = 0;
	//    5    9:iconst_0        
	//    6   10:istore          10
		short word0 = 0;
	//    7   12:iconst_0        
	//    8   13:istore_2        
		double d1 = 0.0D;
	//    9   14:dconst_0        
	//   10   15:dstore          5
		double d = 0.0D;
	//   11   17:dconst_0        
	//   12   18:dstore_3        
		float f = 0.0F;
	//   13   19:fconst_0        
	//   14   20:fstore          7
		long l1 = 0L;
	//   15   22:lconst_0        
	//   16   23:lstore          13
		int j = 0;
	//   17   25:iconst_0        
	//   18   26:istore          9
		int i = -1;
	//   19   28:iconst_m1       
	//   20   29:istore          8
		do
			if(parcel.dataPosition() < l)
	//*  21   31:aload_1         
	//*  22   32:invokevirtual   #100 <Method int Parcel.dataPosition()>
	//*  23   35:iload           11
	//*  24   37:icmpge          209
			{
				int i1 = zzb.zzaX(parcel);
	//   25   40:aload_1         
	//   26   41:invokestatic    #103 <Method int zzb.zzaX(Parcel)>
	//   27   44:istore          12
				switch(zzb.zzdc(i1))
	//*  28   46:iload           12
	//*  29   48:invokestatic    #107 <Method int zzb.zzdc(int)>
				{
	//*  30   51:tableswitch     1 9: default 100
	//	               1 103
	//	               2 114
	//	               3 125
	//	               4 135
	//	               5 146
	//	               6 156
	//	               7 167
	//	               8 178
	//	               9 189
	//*  31  100:goto            200
				case 1: // '\001'
					s = zzb.zzq(parcel, i1);
	//   32  103:aload_1         
	//   33  104:iload           12
	//   34  106:invokestatic    #111 <Method String zzb.zzq(Parcel, int)>
	//   35  109:astore          15
					break;

	//*  36  111:goto            206
				case 2: // '\002'
					l1 = zzb.zzi(parcel, i1);
	//   37  114:aload_1         
	//   38  115:iload           12
	//   39  117:invokestatic    #115 <Method long zzb.zzi(Parcel, int)>
	//   40  120:lstore          13
					break;

	//*  41  122:goto            206
				case 3: // '\003'
					word0 = zzb.zzf(parcel, i1);
	//   42  125:aload_1         
	//   43  126:iload           12
	//   44  128:invokestatic    #119 <Method short zzb.zzf(Parcel, int)>
	//   45  131:istore_2        
					break;

	//*  46  132:goto            206
				case 4: // '\004'
					d1 = zzb.zzn(parcel, i1);
	//   47  135:aload_1         
	//   48  136:iload           12
	//   49  138:invokestatic    #123 <Method double zzb.zzn(Parcel, int)>
	//   50  141:dstore          5
					break;

	//*  51  143:goto            206
				case 5: // '\005'
					d = zzb.zzn(parcel, i1);
	//   52  146:aload_1         
	//   53  147:iload           12
	//   54  149:invokestatic    #123 <Method double zzb.zzn(Parcel, int)>
	//   55  152:dstore_3        
					break;

	//*  56  153:goto            206
				case 6: // '\006'
					f = zzb.zzl(parcel, i1);
	//   57  156:aload_1         
	//   58  157:iload           12
	//   59  159:invokestatic    #127 <Method float zzb.zzl(Parcel, int)>
	//   60  162:fstore          7
					break;

	//*  61  164:goto            206
				case 7: // '\007'
					k = zzb.zzg(parcel, i1);
	//   62  167:aload_1         
	//   63  168:iload           12
	//   64  170:invokestatic    #131 <Method int zzb.zzg(Parcel, int)>
	//   65  173:istore          10
					break;

	//*  66  175:goto            206
				case 8: // '\b'
					j = zzb.zzg(parcel, i1);
	//   67  178:aload_1         
	//   68  179:iload           12
	//   69  181:invokestatic    #131 <Method int zzb.zzg(Parcel, int)>
	//   70  184:istore          9
					break;

	//*  71  186:goto            206
				case 9: // '\t'
					i = zzb.zzg(parcel, i1);
	//   72  189:aload_1         
	//   73  190:iload           12
	//   74  192:invokestatic    #131 <Method int zzb.zzg(Parcel, int)>
	//   75  195:istore          8
					break;

	//*  76  197:goto            206
				default:
					zzb.zzb(parcel, i1);
	//   77  200:aload_1         
	//   78  201:iload           12
	//   79  203:invokestatic    #134 <Method void zzb.zzb(Parcel, int)>
					break;
				}
			} else
	//*  80  206:goto            31
			if(parcel.dataPosition() != l)
	//*  81  209:aload_1         
	//*  82  210:invokevirtual   #100 <Method int Parcel.dataPosition()>
	//*  83  213:iload           11
	//*  84  215:icmpeq          249
				throw new com.google.android.gms.common.internal.safeparcel.zzb.zza((new StringBuilder(37)).append("Overread allowed size end=").append(l).toString(), parcel);
	//   85  218:new             #136 <Class com.google.android.gms.common.internal.safeparcel.zzb$zza>
	//   86  221:dup             
	//   87  222:new             #138 <Class StringBuilder>
	//   88  225:dup             
	//   89  226:bipush          37
	//   90  228:invokespecial   #141 <Method void StringBuilder(int)>
	//   91  231:ldc1            #143 <String "Overread allowed size end=">
	//   92  233:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//   93  236:iload           11
	//   94  238:invokevirtual   #150 <Method StringBuilder StringBuilder.append(int)>
	//   95  241:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   96  244:aload_1         
	//   97  245:invokespecial   #156 <Method void com.google.android.gms.common.internal.safeparcel.zzb$zza(String, Parcel)>
	//   98  248:athrow          
			else
				return new zzasm(s, k, word0, d1, d, f, l1, j, i);
	//   99  249:new             #22  <Class zzasm>
	//  100  252:dup             
	//  101  253:aload           15
	//  102  255:iload           10
	//  103  257:iload_2         
	//  104  258:dload           5
	//  105  260:dload_3         
	//  106  261:fload           7
	//  107  263:lload           13
	//  108  265:iload           9
	//  109  267:iload           8
	//  110  269:invokespecial   #159 <Method void zzasm(String, int, short, double, double, float, long, int, int)>
	//  111  272:areturn         
		while(true);
	}

	public zzasm[] zzkC(int i)
	{
		return new zzasm[i];
	//    0    0:iload_1         
	//    1    1:anewarray       zzasm[]
	//    2    4:areturn         
	}
}
