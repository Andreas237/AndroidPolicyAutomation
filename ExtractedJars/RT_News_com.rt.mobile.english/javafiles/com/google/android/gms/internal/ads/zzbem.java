// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbek, zzbeq, zzbeo, zzbep, 
//			zzben

final class zzbem
{

	static int zza(CharSequence charsequence)
	{
		int k;
		int i1;
label0:
		{
			i1 = charsequence.length();
	//    0    0:aload_0         
	//    1    1:invokeinterface #36  <Method int CharSequence.length()>
	//    2    6:istore          5
			boolean flag = false;
	//    3    8:iconst_0        
	//    4    9:istore          4
			int j;
			for(j = 0; j < i1 && charsequence.charAt(j) < '\200'; j++);
	//    5   11:iconst_0        
	//    6   12:istore_2        
	//    7   13:iload_2         
	//    8   14:iload           5
	//    9   16:icmpge          39
	//   10   19:aload_0         
	//   11   20:iload_2         
	//   12   21:invokeinterface #40  <Method char CharSequence.charAt(int)>
	//   13   26:sipush          128
	//   14   29:icmpge          39
	//   15   32:iload_2         
	//   16   33:iconst_1        
	//   17   34:iadd            
	//   18   35:istore_2        
	//*  19   36:goto            13
			int i = i1;
	//   20   39:iload           5
	//   21   41:istore_1        
			do
			{
				k = i;
	//   22   42:iload_1         
	//   23   43:istore_3        
				if(j >= i1)
					break label0;
	//   24   44:iload_2         
	//   25   45:iload           5
	//   26   47:icmpge          205
				k = ((int) (charsequence.charAt(j)));
	//   27   50:aload_0         
	//   28   51:iload_2         
	//   29   52:invokeinterface #40  <Method char CharSequence.charAt(int)>
	//   30   57:istore_3        
				if(k >= 2048)
					break;
	//   31   58:iload_3         
	//   32   59:sipush          2048
	//   33   62:icmpge          82
				i += 127 - k >>> 31;
	//   34   65:iload_1         
	//   35   66:bipush          127
	//   36   68:iload_3         
	//   37   69:isub            
	//   38   70:bipush          31
	//   39   72:iushr           
	//   40   73:iadd            
	//   41   74:istore_1        
				j++;
	//   42   75:iload_2         
	//   43   76:iconst_1        
	//   44   77:iadd            
	//   45   78:istore_2        
			} while(true);
	//   46   79:goto            42
			int k1 = charsequence.length();
	//   47   82:aload_0         
	//   48   83:invokeinterface #36  <Method int CharSequence.length()>
	//   49   88:istore          7
			k = ((int) (flag));
	//   50   90:iload           4
	//   51   92:istore_3        
			int l;
			for(; j < k1; j = l + 1)
	//*  52   93:iload_2         
	//*  53   94:iload           7
	//*  54   96:icmpge          201
			{
				char c = charsequence.charAt(j);
	//   55   99:aload_0         
	//   56  100:iload_2         
	//   57  101:invokeinterface #40  <Method char CharSequence.charAt(int)>
	//   58  106:istore          8
				if(c < '\u0800')
	//*  59  108:iload           8
	//*  60  110:sipush          2048
	//*  61  113:icmpge          133
				{
					k += 127 - c >>> 31;
	//   62  116:iload_3         
	//   63  117:bipush          127
	//   64  119:iload           8
	//   65  121:isub            
	//   66  122:bipush          31
	//   67  124:iushr           
	//   68  125:iadd            
	//   69  126:istore_3        
					l = j;
	//   70  127:iload_2         
	//   71  128:istore          4
					continue;
	//   72  130:goto            193
				}
				int j1 = k + 2;
	//   73  133:iload_3         
	//   74  134:iconst_2        
	//   75  135:iadd            
	//   76  136:istore          6
				k = j1;
	//   77  138:iload           6
	//   78  140:istore_3        
				l = j;
	//   79  141:iload_2         
	//   80  142:istore          4
				if('\uD800' > c)
					continue;
	//   81  144:ldc1            #41  <Int 55296>
	//   82  146:iload           8
	//   83  148:icmpgt          193
				k = j1;
	//   84  151:iload           6
	//   85  153:istore_3        
				l = j;
	//   86  154:iload_2         
	//   87  155:istore          4
				if(c > '\uDFFF')
					continue;
	//   88  157:iload           8
	//   89  159:ldc1            #42  <Int 57343>
	//   90  161:icmpgt          193
				if(Character.codePointAt(charsequence, j) < 0x10000)
	//*  91  164:aload_0         
	//*  92  165:iload_2         
	//*  93  166:invokestatic    #48  <Method int Character.codePointAt(CharSequence, int)>
	//*  94  169:ldc1            #49  <Int 0x10000>
	//*  95  171:icmpge          185
					throw new zzbep(j, k1);
	//   96  174:new             #51  <Class zzbep>
	//   97  177:dup             
	//   98  178:iload_2         
	//   99  179:iload           7
	//  100  181:invokespecial   #54  <Method void zzbep(int, int)>
	//  101  184:athrow          
				l = j + 1;
	//  102  185:iload_2         
	//  103  186:iconst_1        
	//  104  187:iadd            
	//  105  188:istore          4
				k = j1;
	//  106  190:iload           6
	//  107  192:istore_3        
			}

	//  108  193:iload           4
	//  109  195:iconst_1        
	//  110  196:iadd            
	//  111  197:istore_2        
	//* 112  198:goto            93
			k = i + k;
	//  113  201:iload_1         
	//  114  202:iload_3         
	//  115  203:iadd            
	//  116  204:istore_3        
		}
		if(k < i1)
	//* 117  205:iload_3         
	//* 118  206:iload           5
	//* 119  208:icmpge          255
		{
			long l1 = k;
	//  120  211:iload_3         
	//  121  212:i2l             
	//  122  213:lstore          9
			charsequence = ((CharSequence) (new StringBuilder(54)));
	//  123  215:new             #56  <Class StringBuilder>
	//  124  218:dup             
	//  125  219:bipush          54
	//  126  221:invokespecial   #59  <Method void StringBuilder(int)>
	//  127  224:astore_0        
			((StringBuilder) (charsequence)).append("UTF-8 length does not fit in int: ");
	//  128  225:aload_0         
	//  129  226:ldc1            #61  <String "UTF-8 length does not fit in int: ">
	//  130  228:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//  131  231:pop             
			((StringBuilder) (charsequence)).append(l1 + 0x0L);
	//  132  232:aload_0         
	//  133  233:lload           9
	//  134  235:ldc2w           #66  <Long 0x0L>
	//  135  238:ladd            
	//  136  239:invokevirtual   #70  <Method StringBuilder StringBuilder.append(long)>
	//  137  242:pop             
			throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
	//  138  243:new             #72  <Class IllegalArgumentException>
	//  139  246:dup             
	//  140  247:aload_0         
	//  141  248:invokevirtual   #76  <Method String StringBuilder.toString()>
	//  142  251:invokespecial   #79  <Method void IllegalArgumentException(String)>
	//  143  254:athrow          
		} else
		{
			return k;
	//  144  255:iload_3         
	//  145  256:ireturn         
		}
	}

	static int zza(CharSequence charsequence, byte abyte0[], int i, int j)
	{
		return zzdzz.zzb(charsequence, abyte0, i, j);
	//    0    0:getstatic       #27  <Field zzben zzdzz>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #85  <Method int zzben.zzb(CharSequence, byte[], int, int)>
	//    6   10:ireturn         
	}

	static int zzaa(int i, int j)
	{
		return zzz(i, j);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #90  <Method int zzz(int, int)>
	//    3    5:ireturn         
	}

	private static int zzda(int i)
	{
		int j = i;
	//    0    0:iload_0         
	//    1    1:istore_1        
		if(i > -12)
	//*   2    2:iload_0         
	//*   3    3:bipush          -12
	//*   4    5:icmple          10
			j = -1;
	//    5    8:iconst_m1       
	//    6    9:istore_1        
		return j;
	//    7   10:iload_1         
	//    8   11:ireturn         
	}

	static int zzdb(int i)
	{
		return zzda(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #95  <Method int zzda(int)>
	//    2    4:ireturn         
	}

	private static int zzf(int i, int j, int k)
	{
		if(i <= -12 && j <= -65 && k <= -65)
	//*   0    0:iload_0         
	//*   1    1:bipush          -12
	//*   2    3:icmpgt          33
	//*   3    6:iload_1         
	//*   4    7:bipush          -65
	//*   5    9:icmpgt          33
	//*   6   12:iload_2         
	//*   7   13:bipush          -65
	//*   8   15:icmple          21
	//*   9   18:goto            33
			return i ^ j << 8 ^ k << 16;
	//   10   21:iload_0         
	//   11   22:iload_1         
	//   12   23:bipush          8
	//   13   25:ishl            
	//   14   26:ixor            
	//   15   27:iload_2         
	//   16   28:bipush          16
	//   17   30:ishl            
	//   18   31:ixor            
	//   19   32:ireturn         
		else
			return -1;
	//   20   33:iconst_m1       
	//   21   34:ireturn         
	}

	public static boolean zzf(byte abyte0[], int i, int j)
	{
		return zzdzz.zzf(abyte0, i, j);
	//    0    0:getstatic       #27  <Field zzben zzdzz>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #100 <Method boolean zzben.zzf(byte[], int, int)>
	//    5    9:ireturn         
	}

	static int zzg(int i, int j, int k)
	{
		return zzf(i, j, k);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #103 <Method int zzf(int, int, int)>
	//    4    6:ireturn         
	}

	private static int zzg(byte abyte0[], int i, int j)
	{
		byte byte0 = abyte0[i - 1];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:isub            
	//    4    4:baload          
	//    5    5:istore_3        
		switch(j - i)
	//*   6    6:iload_2         
	//*   7    7:iload_1         
	//*   8    8:isub            
		{
	//*   9    9:tableswitch     0 2: default 36
	//	               0 65
	//	               1 57
	//	               2 44
		default:
			throw new AssertionError();
	//   10   36:new             #106 <Class AssertionError>
	//   11   39:dup             
	//   12   40:invokespecial   #107 <Method void AssertionError()>
	//   13   43:athrow          

		case 2: // '\002'
			return zzf(((int) (byte0)), ((int) (abyte0[i])), ((int) (abyte0[i + 1])));
	//   14   44:iload_3         
	//   15   45:aload_0         
	//   16   46:iload_1         
	//   17   47:baload          
	//   18   48:aload_0         
	//   19   49:iload_1         
	//   20   50:iconst_1        
	//   21   51:iadd            
	//   22   52:baload          
	//   23   53:invokestatic    #103 <Method int zzf(int, int, int)>
	//   24   56:ireturn         

		case 1: // '\001'
			return zzz(((int) (byte0)), ((int) (abyte0[i])));
	//   25   57:iload_3         
	//   26   58:aload_0         
	//   27   59:iload_1         
	//   28   60:baload          
	//   29   61:invokestatic    #90  <Method int zzz(int, int)>
	//   30   64:ireturn         

		case 0: // '\0'
			return zzda(((int) (byte0)));
	//   31   65:iload_3         
	//   32   66:invokestatic    #95  <Method int zzda(int)>
	//   33   69:ireturn         
		}
	}

	static int zzh(byte abyte0[], int i, int j)
	{
		return zzg(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #110 <Method int zzg(byte[], int, int)>
	//    4    6:ireturn         
	}

	public static boolean zzs(byte abyte0[])
	{
		return zzdzz.zzf(abyte0, 0, abyte0.length);
	//    0    0:getstatic       #27  <Field zzben zzdzz>
	//    1    3:aload_0         
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:invokevirtual   #100 <Method boolean zzben.zzf(byte[], int, int)>
	//    6   10:ireturn         
	}

	private static int zzz(int i, int j)
	{
		if(i <= -12 && j <= -65)
	//*   0    0:iload_0         
	//*   1    1:bipush          -12
	//*   2    3:icmpgt          22
	//*   3    6:iload_1         
	//*   4    7:bipush          -65
	//*   5    9:icmple          15
	//*   6   12:goto            22
			return i ^ j << 8;
	//    7   15:iload_0         
	//    8   16:iload_1         
	//    9   17:bipush          8
	//   10   19:ishl            
	//   11   20:ixor            
	//   12   21:ireturn         
		else
			return -1;
	//   13   22:iconst_m1       
	//   14   23:ireturn         
	}

	private static final zzben zzdzz;

	static 
	{
		boolean flag;
		if(zzbek.zzagf() && zzbek.zzagg())
	//*   0    0:invokestatic    #14  <Method boolean zzbek.zzagf()>
	//*   1    3:ifeq            17
	//*   2    6:invokestatic    #17  <Method boolean zzbek.zzagg()>
	//*   3    9:ifeq            17
			flag = true;
	//    4   12:iconst_1        
	//    5   13:istore_0        
		else
	//*   6   14:goto            19
			flag = false;
	//    7   17:iconst_0        
	//    8   18:istore_0        
		Object obj;
		if(flag)
	//*   9   19:iload_0         
	//*  10   20:ifeq            34
			obj = ((Object) (new zzbeq()));
	//   11   23:new             #19  <Class zzbeq>
	//   12   26:dup             
	//   13   27:invokespecial   #22  <Method void zzbeq()>
	//   14   30:astore_1        
		else
	//*  15   31:goto            42
			obj = ((Object) (new zzbeo()));
	//   16   34:new             #24  <Class zzbeo>
	//   17   37:dup             
	//   18   38:invokespecial   #25  <Method void zzbeo()>
	//   19   41:astore_1        
		zzdzz = ((zzben) (obj));
	//   20   42:aload_1         
	//   21   43:putstatic       #27  <Field zzben zzdzz>
	//*  22   46:return          
	}
}
