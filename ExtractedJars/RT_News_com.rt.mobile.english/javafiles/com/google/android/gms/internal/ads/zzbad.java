// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbu, zzbae, zzbbp, zzbef, 
//			zzbah, zzbbq, zzbem, zzbbt

final class zzbad
{

	static int zza(int i, byte abyte0[], int j, int k, zzbae zzbae1)
		throws zzbbu
	{
		if(i >>> 3 == 0)
	//*   0    0:iload_0         
	//*   1    1:iconst_3        
	//*   2    2:iushr           
	//*   3    3:ifne            10
			throw zzbbu.zzado();
	//    4    6:invokestatic    #12  <Method zzbbu zzbbu.zzado()>
	//    5    9:athrow          
		int l = i & 7;
	//    6   10:iload_0         
	//    7   11:bipush          7
	//    8   13:iand            
	//    9   14:istore          5
		if(l != 5)
	//*  10   16:iload           5
	//*  11   18:iconst_5        
	//*  12   19:icmpeq          170
			switch(l)
	//*  13   22:iload           5
			{
	//*  14   24:tableswitch     0 3: default 56
	//	               0 162
	//	               1 157
	//	               2 143
	//	               3 60
			default:
				throw zzbbu.zzado();
	//   15   56:invokestatic    #12  <Method zzbbu zzbbu.zzado()>
	//   16   59:athrow          

			case 3: // '\003'
				int k1 = i & -8 | 4;
	//   17   60:iload_0         
	//   18   61:bipush          -8
	//   19   63:iand            
	//   20   64:iconst_4        
	//   21   65:ior             
	//   22   66:istore          7
				i = 0;
	//   23   68:iconst_0        
	//   24   69:istore_0        
				int i1;
				int j1;
				do
				{
					i1 = i;
	//   25   70:iload_0         
	//   26   71:istore          5
					j1 = j;
	//   27   73:iload_2         
	//   28   74:istore          6
					if(j >= k)
						break;
	//   29   76:iload_2         
	//   30   77:iload_3         
	//   31   78:icmpge          120
					j = zza(abyte0, j, zzbae1);
	//   32   81:aload_1         
	//   33   82:iload_2         
	//   34   83:aload           4
	//   35   85:invokestatic    #15  <Method int zza(byte[], int, zzbae)>
	//   36   88:istore_2        
					i = zzbae1.zzdpl;
	//   37   89:aload           4
	//   38   91:getfield        #21  <Field int zzbae.zzdpl>
	//   39   94:istore_0        
					i1 = i;
	//   40   95:iload_0         
	//   41   96:istore          5
					j1 = j;
	//   42   98:iload_2         
	//   43   99:istore          6
					if(i == k1)
						break;
	//   44  101:iload_0         
	//   45  102:iload           7
	//   46  104:icmpeq          120
					j = zza(i, abyte0, j, k, zzbae1);
	//   47  107:iload_0         
	//   48  108:aload_1         
	//   49  109:iload_2         
	//   50  110:iload_3         
	//   51  111:aload           4
	//   52  113:invokestatic    #23  <Method int zza(int, byte[], int, int, zzbae)>
	//   53  116:istore_2        
				} while(true);
	//   54  117:goto            70
				if(j1 <= k && i1 == k1)
	//*  55  120:iload           6
	//*  56  122:iload_3         
	//*  57  123:icmpgt          139
	//*  58  126:iload           5
	//*  59  128:iload           7
	//*  60  130:icmpeq          136
	//*  61  133:goto            139
					return j1;
	//   62  136:iload           6
	//   63  138:ireturn         
				else
					throw zzbbu.zzadr();
	//   64  139:invokestatic    #26  <Method zzbbu zzbbu.zzadr()>
	//   65  142:athrow          

			case 2: // '\002'
				return zza(abyte0, j, zzbae1) + zzbae1.zzdpl;
	//   66  143:aload_1         
	//   67  144:iload_2         
	//   68  145:aload           4
	//   69  147:invokestatic    #15  <Method int zza(byte[], int, zzbae)>
	//   70  150:aload           4
	//   71  152:getfield        #21  <Field int zzbae.zzdpl>
	//   72  155:iadd            
	//   73  156:ireturn         

			case 1: // '\001'
				return j + 8;
	//   74  157:iload_2         
	//   75  158:bipush          8
	//   76  160:iadd            
	//   77  161:ireturn         

			case 0: // '\0'
				return zzb(abyte0, j, zzbae1);
	//   78  162:aload_1         
	//   79  163:iload_2         
	//   80  164:aload           4
	//   81  166:invokestatic    #29  <Method int zzb(byte[], int, zzbae)>
	//   82  169:ireturn         
			}
		else
			return j + 4;
	//   83  170:iload_2         
	//   84  171:iconst_4        
	//   85  172:iadd            
	//   86  173:ireturn         
	}

	static int zza(int i, byte abyte0[], int j, int k, zzbbt zzbbt, zzbae zzbae1)
	{
		zzbbt = ((zzbbt) ((zzbbp)zzbbt));
	//    0    0:aload           4
	//    1    2:checkcast       #34  <Class zzbbp>
	//    2    5:astore          4
		j = zza(abyte0, j, zzbae1);
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:aload           5
	//    6   11:invokestatic    #15  <Method int zza(byte[], int, zzbae)>
	//    7   14:istore_2        
		do
		{
			((zzbbp) (zzbbt)).zzco(zzbae1.zzdpl);
	//    8   15:aload           4
	//    9   17:aload           5
	//   10   19:getfield        #21  <Field int zzbae.zzdpl>
	//   11   22:invokevirtual   #38  <Method void zzbbp.zzco(int)>
			if(j >= k)
				break;
	//   12   25:iload_2         
	//   13   26:iload_3         
	//   14   27:icmpge          60
			int l = zza(abyte0, j, zzbae1);
	//   15   30:aload_1         
	//   16   31:iload_2         
	//   17   32:aload           5
	//   18   34:invokestatic    #15  <Method int zza(byte[], int, zzbae)>
	//   19   37:istore          6
			if(i != zzbae1.zzdpl)
				break;
	//   20   39:iload_0         
	//   21   40:aload           5
	//   22   42:getfield        #21  <Field int zzbae.zzdpl>
	//   23   45:icmpne          60
			j = zza(abyte0, l, zzbae1);
	//   24   48:aload_1         
	//   25   49:iload           6
	//   26   51:aload           5
	//   27   53:invokestatic    #15  <Method int zza(byte[], int, zzbae)>
	//   28   56:istore_2        
		} while(true);
	//   29   57:goto            15
		return j;
	//   30   60:iload_2         
	//   31   61:ireturn         
	}

	static int zza(int i, byte abyte0[], int j, int k, zzbef zzbef1, zzbae zzbae1)
		throws IOException
	{
		int l;
		if(i >>> 3 == 0)
	//*   0    0:iload_0         
	//*   1    1:iconst_3        
	//*   2    2:iushr           
	//*   3    3:ifne            10
			throw zzbbu.zzado();
	//    4    6:invokestatic    #12  <Method zzbbu zzbbu.zzado()>
	//    5    9:athrow          
		l = i & 7;
	//    6   10:iload_0         
	//    7   11:bipush          7
	//    8   13:iand            
	//    9   14:istore          6
		if(l == 5) goto _L2; else goto _L1
	//   10   16:iload           6
	//   11   18:iconst_5        
	//   12   19:icmpeq          255
_L1:
		l;
	//   13   22:iload           6
		JVM INSTR tableswitch 0 3: default 56
	//	               0 231
	//	               1 212
	//	               2 166
	//	               3 60;
	//   14   24:tableswitch     0 3: default 56
	//	               0 231
	//	               1 212
	//	               2 166
	//	               3 60
		   goto _L3 _L4 _L5 _L6 _L7
_L3:
		throw zzbbu.zzado();
	//   15   56:invokestatic    #12  <Method zzbbu zzbbu.zzado()>
	//   16   59:athrow          
_L7:
		int j1;
		zzbef zzbef2;
		zzbef2 = zzbef.zzagd();
	//   17   60:invokestatic    #49  <Method zzbef zzbef.zzagd()>
	//   18   63:astore          9
		j1 = i & -8 | 4;
	//   19   65:iload_0         
	//   20   66:bipush          -8
	//   21   68:iand            
	//   22   69:iconst_4        
	//   23   70:ior             
	//   24   71:istore          8
		l = 0;
	//   25   73:iconst_0        
	//   26   74:istore          6
_L12:
		int i1;
		i1 = l;
	//   27   76:iload           6
	//   28   78:istore          7
		l = j;
	//   29   80:iload_2         
	//   30   81:istore          6
		if(j >= k) goto _L9; else goto _L8
	//   31   83:iload_2         
	//   32   84:iload_3         
	//   33   85:icmpge          135
_L8:
		l = zza(abyte0, j, zzbae1);
	//   34   88:aload_1         
	//   35   89:iload_2         
	//   36   90:aload           5
	//   37   92:invokestatic    #15  <Method int zza(byte[], int, zzbae)>
	//   38   95:istore          6
		j = zzbae1.zzdpl;
	//   39   97:aload           5
	//   40   99:getfield        #21  <Field int zzbae.zzdpl>
	//   41  102:istore_2        
		if(j == j1) goto _L11; else goto _L10
	//   42  103:iload_2         
	//   43  104:iload           8
	//   44  106:icmpeq          132
_L10:
		i1 = zza(j, abyte0, l, k, zzbef2, zzbae1);
	//   45  109:iload_2         
	//   46  110:aload_1         
	//   47  111:iload           6
	//   48  113:iload_3         
	//   49  114:aload           9
	//   50  116:aload           5
	//   51  118:invokestatic    #51  <Method int zza(int, byte[], int, int, zzbef, zzbae)>
	//   52  121:istore          7
		l = j;
	//   53  123:iload_2         
	//   54  124:istore          6
		j = i1;
	//   55  126:iload           7
	//   56  128:istore_2        
		  goto _L12
	//*  57  129:goto            76
_L11:
		i1 = j;
	//   58  132:iload_2         
	//   59  133:istore          7
_L9:
		if(l <= k && i1 == j1)
	//*  60  135:iload           6
	//*  61  137:iload_3         
	//*  62  138:icmpgt          162
	//*  63  141:iload           7
	//*  64  143:iload           8
	//*  65  145:icmpeq          151
	//*  66  148:goto            162
		{
			zzbef1.zzb(i, ((Object) (zzbef2)));
	//   67  151:aload           4
	//   68  153:iload_0         
	//   69  154:aload           9
	//   70  156:invokevirtual   #54  <Method void zzbef.zzb(int, Object)>
			return l;
	//   71  159:iload           6
	//   72  161:ireturn         
		} else
		{
			throw zzbbu.zzadr();
	//   73  162:invokestatic    #26  <Method zzbbu zzbbu.zzadr()>
	//   74  165:athrow          
		}
_L6:
		j = zza(abyte0, j, zzbae1);
	//   75  166:aload_1         
	//   76  167:iload_2         
	//   77  168:aload           5
	//   78  170:invokestatic    #15  <Method int zza(byte[], int, zzbae)>
	//   79  173:istore_2        
		k = zzbae1.zzdpl;
	//   80  174:aload           5
	//   81  176:getfield        #21  <Field int zzbae.zzdpl>
	//   82  179:istore_3        
		if(k == 0)
	//*  83  180:iload_3         
	//*  84  181:ifne            198
			abyte0 = ((byte []) (zzbah.zzdpq));
	//   85  184:getstatic       #60  <Field zzbah zzbah.zzdpq>
	//   86  187:astore_1        
		else
	//*  87  188:aload           4
	//*  88  190:iload_0         
	//*  89  191:aload_1         
	//*  90  192:invokevirtual   #54  <Method void zzbef.zzb(int, Object)>
	//*  91  195:goto            208
			abyte0 = ((byte []) (zzbah.zzc(abyte0, j, k)));
	//   92  198:aload_1         
	//   93  199:iload_2         
	//   94  200:iload_3         
	//   95  201:invokestatic    #64  <Method zzbah zzbah.zzc(byte[], int, int)>
	//   96  204:astore_1        
		zzbef1.zzb(i, ((Object) (abyte0)));
	//*  97  205:goto            188
		return j + k;
	//   98  208:iload_2         
	//   99  209:iload_3         
	//  100  210:iadd            
	//  101  211:ireturn         
_L5:
		zzbef1.zzb(i, ((Object) (Long.valueOf(zzf(abyte0, j)))));
	//  102  212:aload           4
	//  103  214:iload_0         
	//  104  215:aload_1         
	//  105  216:iload_2         
	//  106  217:invokestatic    #68  <Method long zzf(byte[], int)>
	//  107  220:invokestatic    #74  <Method Long Long.valueOf(long)>
	//  108  223:invokevirtual   #54  <Method void zzbef.zzb(int, Object)>
		return j + 8;
	//  109  226:iload_2         
	//  110  227:bipush          8
	//  111  229:iadd            
	//  112  230:ireturn         
_L4:
		j = zzb(abyte0, j, zzbae1);
	//  113  231:aload_1         
	//  114  232:iload_2         
	//  115  233:aload           5
	//  116  235:invokestatic    #29  <Method int zzb(byte[], int, zzbae)>
	//  117  238:istore_2        
		zzbef1.zzb(i, ((Object) (Long.valueOf(zzbae1.zzdpm))));
	//  118  239:aload           4
	//  119  241:iload_0         
	//  120  242:aload           5
	//  121  244:getfield        #78  <Field long zzbae.zzdpm>
	//  122  247:invokestatic    #74  <Method Long Long.valueOf(long)>
	//  123  250:invokevirtual   #54  <Method void zzbef.zzb(int, Object)>
		return j;
	//  124  253:iload_2         
	//  125  254:ireturn         
_L2:
		zzbef1.zzb(i, ((Object) (Integer.valueOf(zze(abyte0, j)))));
	//  126  255:aload           4
	//  127  257:iload_0         
	//  128  258:aload_1         
	//  129  259:iload_2         
	//  130  260:invokestatic    #82  <Method int zze(byte[], int)>
	//  131  263:invokestatic    #87  <Method Integer Integer.valueOf(int)>
	//  132  266:invokevirtual   #54  <Method void zzbef.zzb(int, Object)>
		return j + 4;
	//  133  269:iload_2         
	//  134  270:iconst_4        
	//  135  271:iadd            
	//  136  272:ireturn         
	}

	static int zza(int i, byte abyte0[], int j, zzbae zzbae1)
	{
		int i1;
		i1 = i & 0x7f;
	//    0    0:iload_0         
	//    1    1:bipush          127
	//    2    3:iand            
	//    3    4:istore          5
		i = j + 1;
	//    4    6:iload_2         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:istore_0        
		j = ((int) (abyte0[j]));
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:baload          
	//   11   13:istore_2        
		if(j < 0) goto _L2; else goto _L1
	//   12   14:iload_2         
	//   13   15:iflt            37
_L1:
		int k;
		k = j << 7;
	//   14   18:iload_2         
	//   15   19:bipush          7
	//   16   21:ishl            
	//   17   22:istore          4
		j = i1;
	//   18   24:iload           5
	//   19   26:istore_2        
_L8:
		zzbae1.zzdpl = j | k;
	//   20   27:aload_3         
	//   21   28:iload_2         
	//   22   29:iload           4
	//   23   31:ior             
	//   24   32:putfield        #21  <Field int zzbae.zzdpl>
		return i;
	//   25   35:iload_0         
	//   26   36:ireturn         
_L2:
		j = i1 | (j & 0x7f) << 7;
	//   27   37:iload           5
	//   28   39:iload_2         
	//   29   40:bipush          127
	//   30   42:iand            
	//   31   43:bipush          7
	//   32   45:ishl            
	//   33   46:ior             
	//   34   47:istore_2        
		k = i + 1;
	//   35   48:iload_0         
	//   36   49:iconst_1        
	//   37   50:iadd            
	//   38   51:istore          4
		i = ((int) (abyte0[i]));
	//   39   53:aload_1         
	//   40   54:iload_0         
	//   41   55:baload          
	//   42   56:istore_0        
		if(i < 0) goto _L4; else goto _L3
	//   43   57:iload_0         
	//   44   58:iflt            84
_L3:
		int j1 = i << 14;
	//   45   61:iload_0         
	//   46   62:bipush          14
	//   47   64:ishl            
	//   48   65:istore          5
		i = k;
	//   49   67:iload           4
	//   50   69:istore_0        
		k = j1;
	//   51   70:iload           5
	//   52   72:istore          4
_L6:
		zzbae1.zzdpl = j | k;
	//   53   74:aload_3         
	//   54   75:iload_2         
	//   55   76:iload           4
	//   56   78:ior             
	//   57   79:putfield        #21  <Field int zzbae.zzdpl>
		return i;
	//   58   82:iload_0         
	//   59   83:ireturn         
_L4:
		j |= (i & 0x7f) << 14;
	//   60   84:iload_2         
	//   61   85:iload_0         
	//   62   86:bipush          127
	//   63   88:iand            
	//   64   89:bipush          14
	//   65   91:ishl            
	//   66   92:ior             
	//   67   93:istore_2        
		int k1 = k + 1;
	//   68   94:iload           4
	//   69   96:iconst_1        
	//   70   97:iadd            
	//   71   98:istore          5
		i = ((int) (abyte0[k]));
	//   72  100:aload_1         
	//   73  101:iload           4
	//   74  103:baload          
	//   75  104:istore_0        
		if(i >= 0)
	//*  76  105:iload_0         
	//*  77  106:iflt            121
		{
			k = i << 21;
	//   78  109:iload_0         
	//   79  110:bipush          21
	//   80  112:ishl            
	//   81  113:istore          4
			i = k1;
	//   82  115:iload           5
	//   83  117:istore_0        
			continue; /* Loop/switch isn't completed */
	//   84  118:goto            27
		}
		j |= (i & 0x7f) << 21;
	//   85  121:iload_2         
	//   86  122:iload_0         
	//   87  123:bipush          127
	//   88  125:iand            
	//   89  126:bipush          21
	//   90  128:ishl            
	//   91  129:ior             
	//   92  130:istore_2        
		i = k1 + 1;
	//   93  131:iload           5
	//   94  133:iconst_1        
	//   95  134:iadd            
	//   96  135:istore_0        
		k1 = ((int) (abyte0[k1]));
	//   97  136:aload_1         
	//   98  137:iload           5
	//   99  139:baload          
	//  100  140:istore          5
		if(k1 >= 0)
	//* 101  142:iload           5
	//* 102  144:iflt            157
			k = k1 << 28;
	//  103  147:iload           5
	//  104  149:bipush          28
	//  105  151:ishl            
	//  106  152:istore          4
		else
	//* 107  154:goto            74
			do
			{
				int l = i + 1;
	//  108  157:iload_0         
	//  109  158:iconst_1        
	//  110  159:iadd            
	//  111  160:istore          4
				if(abyte0[i] >= 0)
	//* 112  162:aload_1         
	//* 113  163:iload_0         
	//* 114  164:baload          
	//* 115  165:iflt            185
				{
					zzbae1.zzdpl = j | (k1 & 0x7f) << 28;
	//  116  168:aload_3         
	//  117  169:iload_2         
	//  118  170:iload           5
	//  119  172:bipush          127
	//  120  174:iand            
	//  121  175:bipush          28
	//  122  177:ishl            
	//  123  178:ior             
	//  124  179:putfield        #21  <Field int zzbae.zzdpl>
					return l;
	//  125  182:iload           4
	//  126  184:ireturn         
				}
				i = l;
	//  127  185:iload           4
	//  128  187:istore_0        
			} while(true);
	//  129  188:goto            157
		if(true) goto _L6; else goto _L5
_L5:
		if(true) goto _L8; else goto _L7
_L7:
	}

	static int zza(byte abyte0[], int i, zzbae zzbae1)
	{
		int j = i + 1;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:iadd            
	//    3    3:istore_3        
		i = ((int) (abyte0[i]));
	//    4    4:aload_0         
	//    5    5:iload_1         
	//    6    6:baload          
	//    7    7:istore_1        
		if(i >= 0)
	//*   8    8:iload_1         
	//*   9    9:iflt            19
		{
			zzbae1.zzdpl = i;
	//   10   12:aload_2         
	//   11   13:iload_1         
	//   12   14:putfield        #21  <Field int zzbae.zzdpl>
			return j;
	//   13   17:iload_3         
	//   14   18:ireturn         
		} else
		{
			return zza(i, abyte0, j, zzbae1);
	//   15   19:iload_1         
	//   16   20:aload_0         
	//   17   21:iload_3         
	//   18   22:aload_2         
	//   19   23:invokestatic    #90  <Method int zza(int, byte[], int, zzbae)>
	//   20   26:ireturn         
		}
	}

	static int zza(byte abyte0[], int i, zzbbt zzbbt, zzbae zzbae1)
		throws IOException
	{
		zzbbt = ((zzbbt) ((zzbbp)zzbbt));
	//    0    0:aload_2         
	//    1    1:checkcast       #34  <Class zzbbp>
	//    2    4:astore_2        
		i = zza(abyte0, i, zzbae1);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_3         
	//    6    8:invokestatic    #15  <Method int zza(byte[], int, zzbae)>
	//    7   11:istore_1        
		int j;
		for(j = zzbae1.zzdpl + i; i < j;)
	//*   8   12:aload_3         
	//*   9   13:getfield        #21  <Field int zzbae.zzdpl>
	//*  10   16:iload_1         
	//*  11   17:iadd            
	//*  12   18:istore          4
	//*  13   20:iload_1         
	//*  14   21:iload           4
	//*  15   23:icmpge          44
		{
			i = zza(abyte0, i, zzbae1);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:aload_3         
	//   19   29:invokestatic    #15  <Method int zza(byte[], int, zzbae)>
	//   20   32:istore_1        
			((zzbbp) (zzbbt)).zzco(zzbae1.zzdpl);
	//   21   33:aload_2         
	//   22   34:aload_3         
	//   23   35:getfield        #21  <Field int zzbae.zzdpl>
	//   24   38:invokevirtual   #38  <Method void zzbbp.zzco(int)>
		}

	//*  25   41:goto            20
		if(i != j)
	//*  26   44:iload_1         
	//*  27   45:iload           4
	//*  28   47:icmpeq          54
			throw zzbbu.zzadl();
	//   29   50:invokestatic    #94  <Method zzbbu zzbbu.zzadl()>
	//   30   53:athrow          
		else
			return i;
	//   31   54:iload_1         
	//   32   55:ireturn         
	}

	static int zzb(byte abyte0[], int i, zzbae zzbae1)
	{
		int j = i + 1;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:iadd            
	//    3    3:istore_3        
		long l = abyte0[i];
	//    4    4:aload_0         
	//    5    5:iload_1         
	//    6    6:baload          
	//    7    7:i2l             
	//    8    8:lstore          5
		if(l >= 0L)
	//*   9   10:lload           5
	//*  10   12:lconst_0        
	//*  11   13:lcmp            
	//*  12   14:iflt            25
		{
			zzbae1.zzdpm = l;
	//   13   17:aload_2         
	//   14   18:lload           5
	//   15   20:putfield        #78  <Field long zzbae.zzdpm>
			return j;
	//   16   23:iload_3         
	//   17   24:ireturn         
		}
		i = j + 1;
	//   18   25:iload_3         
	//   19   26:iconst_1        
	//   20   27:iadd            
	//   21   28:istore_1        
		byte byte0 = abyte0[j];
	//   22   29:aload_0         
	//   23   30:iload_3         
	//   24   31:baload          
	//   25   32:istore          4
		l = l & 127L | (long)(byte0 & 0x7f) << 7;
	//   26   34:lload           5
	//   27   36:ldc2w           #96  <Long 127L>
	//   28   39:land            
	//   29   40:iload           4
	//   30   42:bipush          127
	//   31   44:iand            
	//   32   45:i2l             
	//   33   46:bipush          7
	//   34   48:lshl            
	//   35   49:lor             
	//   36   50:lstore          5
		j = 7;
	//   37   52:bipush          7
	//   38   54:istore_3        
		while(byte0 < 0) 
	//*  39   55:iload           4
	//*  40   57:ifge            90
		{
			byte0 = abyte0[i];
	//   41   60:aload_0         
	//   42   61:iload_1         
	//   43   62:baload          
	//   44   63:istore          4
			j += 7;
	//   45   65:iload_3         
	//   46   66:bipush          7
	//   47   68:iadd            
	//   48   69:istore_3        
			l |= (long)(byte0 & 0x7f) << j;
	//   49   70:lload           5
	//   50   72:iload           4
	//   51   74:bipush          127
	//   52   76:iand            
	//   53   77:i2l             
	//   54   78:iload_3         
	//   55   79:lshl            
	//   56   80:lor             
	//   57   81:lstore          5
			i++;
	//   58   83:iload_1         
	//   59   84:iconst_1        
	//   60   85:iadd            
	//   61   86:istore_1        
		}
	//*  62   87:goto            55
		zzbae1.zzdpm = l;
	//   63   90:aload_2         
	//   64   91:lload           5
	//   65   93:putfield        #78  <Field long zzbae.zzdpm>
		return i;
	//   66   96:iload_1         
	//   67   97:ireturn         
	}

	static int zzc(byte abyte0[], int i, zzbae zzbae1)
	{
		i = zza(abyte0, i, zzbae1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #15  <Method int zza(byte[], int, zzbae)>
	//    4    6:istore_1        
		int j = zzbae1.zzdpl;
	//    5    7:aload_2         
	//    6    8:getfield        #21  <Field int zzbae.zzdpl>
	//    7   11:istore_3        
		if(j == 0)
	//*   8   12:iload_3         
	//*   9   13:ifne            24
		{
			zzbae1.zzdpn = "";
	//   10   16:aload_2         
	//   11   17:ldc1            #99  <String "">
	//   12   19:putfield        #103 <Field Object zzbae.zzdpn>
			return i;
	//   13   22:iload_1         
	//   14   23:ireturn         
		} else
		{
			zzbae1.zzdpn = ((Object) (new String(abyte0, i, j, zzbbq.UTF_8)));
	//   15   24:aload_2         
	//   16   25:new             #105 <Class String>
	//   17   28:dup             
	//   18   29:aload_0         
	//   19   30:iload_1         
	//   20   31:iload_3         
	//   21   32:getstatic       #111 <Field java.nio.charset.Charset zzbbq.UTF_8>
	//   22   35:invokespecial   #115 <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   23   38:putfield        #103 <Field Object zzbae.zzdpn>
			return i + j;
	//   24   41:iload_1         
	//   25   42:iload_3         
	//   26   43:iadd            
	//   27   44:ireturn         
		}
	}

	static int zzd(byte abyte0[], int i, zzbae zzbae1)
		throws IOException
	{
		i = zza(abyte0, i, zzbae1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #15  <Method int zza(byte[], int, zzbae)>
	//    4    6:istore_1        
		int j = zzbae1.zzdpl;
	//    5    7:aload_2         
	//    6    8:getfield        #21  <Field int zzbae.zzdpl>
	//    7   11:istore_3        
		if(j == 0)
	//*   8   12:iload_3         
	//*   9   13:ifne            24
		{
			zzbae1.zzdpn = "";
	//   10   16:aload_2         
	//   11   17:ldc1            #99  <String "">
	//   12   19:putfield        #103 <Field Object zzbae.zzdpn>
			return i;
	//   13   22:iload_1         
	//   14   23:ireturn         
		}
		int k = i + j;
	//   15   24:iload_1         
	//   16   25:iload_3         
	//   17   26:iadd            
	//   18   27:istore          4
		if(!zzbem.zzf(abyte0, i, k))
	//*  19   29:aload_0         
	//*  20   30:iload_1         
	//*  21   31:iload           4
	//*  22   33:invokestatic    #121 <Method boolean zzbem.zzf(byte[], int, int)>
	//*  23   36:ifne            43
		{
			throw zzbbu.zzads();
	//   24   39:invokestatic    #124 <Method zzbbu zzbbu.zzads()>
	//   25   42:athrow          
		} else
		{
			zzbae1.zzdpn = ((Object) (new String(abyte0, i, j, zzbbq.UTF_8)));
	//   26   43:aload_2         
	//   27   44:new             #105 <Class String>
	//   28   47:dup             
	//   29   48:aload_0         
	//   30   49:iload_1         
	//   31   50:iload_3         
	//   32   51:getstatic       #111 <Field java.nio.charset.Charset zzbbq.UTF_8>
	//   33   54:invokespecial   #115 <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   34   57:putfield        #103 <Field Object zzbae.zzdpn>
			return k;
	//   35   60:iload           4
	//   36   62:ireturn         
		}
	}

	static int zze(byte abyte0[], int i)
	{
		byte byte0 = abyte0[i];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:baload          
	//    3    3:istore_2        
		byte byte1 = abyte0[i + 1];
	//    4    4:aload_0         
	//    5    5:iload_1         
	//    6    6:iconst_1        
	//    7    7:iadd            
	//    8    8:baload          
	//    9    9:istore_3        
		byte byte2 = abyte0[i + 2];
	//   10   10:aload_0         
	//   11   11:iload_1         
	//   12   12:iconst_2        
	//   13   13:iadd            
	//   14   14:baload          
	//   15   15:istore          4
		return (abyte0[i + 3] & 0xff) << 24 | (byte0 & 0xff | (byte1 & 0xff) << 8 | (byte2 & 0xff) << 16);
	//   16   17:aload_0         
	//   17   18:iload_1         
	//   18   19:iconst_3        
	//   19   20:iadd            
	//   20   21:baload          
	//   21   22:sipush          255
	//   22   25:iand            
	//   23   26:bipush          24
	//   24   28:ishl            
	//   25   29:iload_2         
	//   26   30:sipush          255
	//   27   33:iand            
	//   28   34:iload_3         
	//   29   35:sipush          255
	//   30   38:iand            
	//   31   39:bipush          8
	//   32   41:ishl            
	//   33   42:ior             
	//   34   43:iload           4
	//   35   45:sipush          255
	//   36   48:iand            
	//   37   49:bipush          16
	//   38   51:ishl            
	//   39   52:ior             
	//   40   53:ior             
	//   41   54:ireturn         
	}

	static int zze(byte abyte0[], int i, zzbae zzbae1)
	{
		i = zza(abyte0, i, zzbae1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #15  <Method int zza(byte[], int, zzbae)>
	//    4    6:istore_1        
		int j = zzbae1.zzdpl;
	//    5    7:aload_2         
	//    6    8:getfield        #21  <Field int zzbae.zzdpl>
	//    7   11:istore_3        
		if(j == 0)
	//*   8   12:iload_3         
	//*   9   13:ifne            25
		{
			zzbae1.zzdpn = ((Object) (zzbah.zzdpq));
	//   10   16:aload_2         
	//   11   17:getstatic       #60  <Field zzbah zzbah.zzdpq>
	//   12   20:putfield        #103 <Field Object zzbae.zzdpn>
			return i;
	//   13   23:iload_1         
	//   14   24:ireturn         
		} else
		{
			zzbae1.zzdpn = ((Object) (zzbah.zzc(abyte0, i, j)));
	//   15   25:aload_2         
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:iload_3         
	//   19   29:invokestatic    #64  <Method zzbah zzbah.zzc(byte[], int, int)>
	//   20   32:putfield        #103 <Field Object zzbae.zzdpn>
			return i + j;
	//   21   35:iload_1         
	//   22   36:iload_3         
	//   23   37:iadd            
	//   24   38:ireturn         
		}
	}

	static long zzf(byte abyte0[], int i)
	{
		return (long)abyte0[i] & 255L | ((long)abyte0[i + 1] & 255L) << 8 | ((long)abyte0[i + 2] & 255L) << 16 | ((long)abyte0[i + 3] & 255L) << 24 | ((long)abyte0[i + 4] & 255L) << 32 | ((long)abyte0[i + 5] & 255L) << 40 | ((long)abyte0[i + 6] & 255L) << 48 | ((long)abyte0[i + 7] & 255L) << 56;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:baload          
	//    3    3:i2l             
	//    4    4:ldc2w           #125 <Long 255L>
	//    5    7:land            
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:iconst_1        
	//    9   11:iadd            
	//   10   12:baload          
	//   11   13:i2l             
	//   12   14:ldc2w           #125 <Long 255L>
	//   13   17:land            
	//   14   18:bipush          8
	//   15   20:lshl            
	//   16   21:lor             
	//   17   22:aload_0         
	//   18   23:iload_1         
	//   19   24:iconst_2        
	//   20   25:iadd            
	//   21   26:baload          
	//   22   27:i2l             
	//   23   28:ldc2w           #125 <Long 255L>
	//   24   31:land            
	//   25   32:bipush          16
	//   26   34:lshl            
	//   27   35:lor             
	//   28   36:aload_0         
	//   29   37:iload_1         
	//   30   38:iconst_3        
	//   31   39:iadd            
	//   32   40:baload          
	//   33   41:i2l             
	//   34   42:ldc2w           #125 <Long 255L>
	//   35   45:land            
	//   36   46:bipush          24
	//   37   48:lshl            
	//   38   49:lor             
	//   39   50:aload_0         
	//   40   51:iload_1         
	//   41   52:iconst_4        
	//   42   53:iadd            
	//   43   54:baload          
	//   44   55:i2l             
	//   45   56:ldc2w           #125 <Long 255L>
	//   46   59:land            
	//   47   60:bipush          32
	//   48   62:lshl            
	//   49   63:lor             
	//   50   64:aload_0         
	//   51   65:iload_1         
	//   52   66:iconst_5        
	//   53   67:iadd            
	//   54   68:baload          
	//   55   69:i2l             
	//   56   70:ldc2w           #125 <Long 255L>
	//   57   73:land            
	//   58   74:bipush          40
	//   59   76:lshl            
	//   60   77:lor             
	//   61   78:aload_0         
	//   62   79:iload_1         
	//   63   80:bipush          6
	//   64   82:iadd            
	//   65   83:baload          
	//   66   84:i2l             
	//   67   85:ldc2w           #125 <Long 255L>
	//   68   88:land            
	//   69   89:bipush          48
	//   70   91:lshl            
	//   71   92:lor             
	//   72   93:aload_0         
	//   73   94:iload_1         
	//   74   95:bipush          7
	//   75   97:iadd            
	//   76   98:baload          
	//   77   99:i2l             
	//   78  100:ldc2w           #125 <Long 255L>
	//   79  103:land            
	//   80  104:bipush          56
	//   81  106:lshl            
	//   82  107:lor             
	//   83  108:lreturn         
	}

	static double zzg(byte abyte0[], int i)
	{
		return Double.longBitsToDouble(zzf(abyte0, i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #68  <Method long zzf(byte[], int)>
	//    3    5:invokestatic    #134 <Method double Double.longBitsToDouble(long)>
	//    4    8:dreturn         
	}

	static float zzh(byte abyte0[], int i)
	{
		return Float.intBitsToFloat(zze(abyte0, i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #82  <Method int zze(byte[], int)>
	//    3    5:invokestatic    #142 <Method float Float.intBitsToFloat(int)>
	//    4    8:freturn         
	}
}
