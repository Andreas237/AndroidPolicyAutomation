// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize;

import java.util.Arrays;

public class Base64
{

	public Base64()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	public static final byte[] decode(String s)
	{
		int i;
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
			i = s.length();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #38  <Method int String.length()>
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		if(i == 0)
	//*   8   14:iload_1         
	//*   9   15:ifne            22
			return new byte[0];
	//   10   18:iconst_0        
	//   11   19:newarray        byte[]
	//   12   21:areturn         
		int j = 0;
	//   13   22:iconst_0        
	//   14   23:istore_2        
		int l;
		int i1;
		for(l = 0; j < i; l = i1)
	//*  15   24:iconst_0        
	//*  16   25:istore_3        
	//*  17   26:iload_2         
	//*  18   27:iload_1         
	//*  19   28:icmpge          61
		{
			i1 = l;
	//   20   31:iload_3         
	//   21   32:istore          4
			if(IA[s.charAt(j)] < 0)
	//*  22   34:getstatic       #22  <Field int[] IA>
	//*  23   37:aload_0         
	//*  24   38:iload_2         
	//*  25   39:invokevirtual   #42  <Method char String.charAt(int)>
	//*  26   42:iaload          
	//*  27   43:ifge            51
				i1 = l + 1;
	//   28   46:iload_3         
	//   29   47:iconst_1        
	//   30   48:iadd            
	//   31   49:istore          4
			j++;
	//   32   51:iload_2         
	//   33   52:iconst_1        
	//   34   53:iadd            
	//   35   54:istore_2        
		}

	//   36   55:iload           4
	//   37   57:istore_3        
	//*  38   58:goto            26
		int j1 = i - l;
	//   39   61:iload_1         
	//   40   62:iload_3         
	//   41   63:isub            
	//   42   64:istore          4
		if(j1 % 4 != 0)
	//*  43   66:iload           4
	//*  44   68:iconst_4        
	//*  45   69:irem            
	//*  46   70:ifeq            110
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   47   73:new             #44  <Class StringBuilder>
	//   48   76:dup             
	//   49   77:invokespecial   #45  <Method void StringBuilder()>
	//   50   80:astore          7
			stringbuilder.append("Unable to decode Base 64 string ");
	//   51   82:aload           7
	//   52   84:ldc1            #47  <String "Unable to decode Base 64 string ">
	//   53   86:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   54   89:pop             
			stringbuilder.append(s);
	//   55   90:aload           7
	//   56   92:aload_0         
	//   57   93:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   58   96:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   59   97:new             #53  <Class IllegalArgumentException>
	//   60  100:dup             
	//   61  101:aload           7
	//   62  103:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   63  106:invokespecial   #60  <Method void IllegalArgumentException(String)>
	//   64  109:athrow          
		}
		j = 0;
	//   65  110:iconst_0        
	//   66  111:istore_2        
		do
		{
			if(i <= 1)
				break;
	//   67  112:iload_1         
	//   68  113:iconst_1        
	//   69  114:icmple          158
			int ai[] = IA;
	//   70  117:getstatic       #22  <Field int[] IA>
	//   71  120:astore          7
			l = i - 1;
	//   72  122:iload_1         
	//   73  123:iconst_1        
	//   74  124:isub            
	//   75  125:istore_3        
			if(ai[s.charAt(l)] > 0)
				break;
	//   76  126:aload           7
	//   77  128:aload_0         
	//   78  129:iload_3         
	//   79  130:invokevirtual   #42  <Method char String.charAt(int)>
	//   80  133:iaload          
	//   81  134:ifgt            158
			i = l;
	//   82  137:iload_3         
	//   83  138:istore_1        
			if(s.charAt(l) == '=')
	//*  84  139:aload_0         
	//*  85  140:iload_3         
	//*  86  141:invokevirtual   #42  <Method char String.charAt(int)>
	//*  87  144:bipush          61
	//*  88  146:icmpne          112
			{
				j++;
	//   89  149:iload_2         
	//   90  150:iconst_1        
	//   91  151:iadd            
	//   92  152:istore_2        
				i = l;
	//   93  153:iload_3         
	//   94  154:istore_1        
			}
		} while(true);
	//   95  155:goto            112
		int j2 = (j1 * 6 >> 3) - j;
	//   96  158:iload           4
	//   97  160:bipush          6
	//   98  162:imul            
	//   99  163:iconst_3        
	//  100  164:ishr            
	//  101  165:iload_2         
	//  102  166:isub            
	//  103  167:istore          6
		byte abyte0[] = new byte[j2];
	//  104  169:iload           6
	//  105  171:newarray        byte[]
	//  106  173:astore          7
		l = 0;
	//  107  175:iconst_0        
	//  108  176:istore_3        
		i = 0;
	//  109  177:iconst_0        
	//  110  178:istore_1        
		int k;
		for(; l < j2; l = k)
	//* 111  179:iload_3         
	//* 112  180:iload           6
	//* 113  182:icmpge          309
		{
			k = 0;
	//  114  185:iconst_0        
	//  115  186:istore_2        
			int k1 = 0;
	//  116  187:iconst_0        
	//  117  188:istore          4
			while(k < 4) 
	//* 118  190:iload_2         
	//* 119  191:iconst_4        
	//* 120  192:icmpge          244
			{
				int l1 = IA[s.charAt(i)];
	//  121  195:getstatic       #22  <Field int[] IA>
	//  122  198:aload_0         
	//  123  199:iload_1         
	//  124  200:invokevirtual   #42  <Method char String.charAt(int)>
	//  125  203:iaload          
	//  126  204:istore          5
				if(l1 >= 0)
	//* 127  206:iload           5
	//* 128  208:iflt            229
					k1 = l1 << 18 - k * 6 | k1;
	//  129  211:iload           5
	//  130  213:bipush          18
	//  131  215:iload_2         
	//  132  216:bipush          6
	//  133  218:imul            
	//  134  219:isub            
	//  135  220:ishl            
	//  136  221:iload           4
	//  137  223:ior             
	//  138  224:istore          4
				else
	//* 139  226:goto            233
					k--;
	//  140  229:iload_2         
	//  141  230:iconst_1        
	//  142  231:isub            
	//  143  232:istore_2        
				k++;
	//  144  233:iload_2         
	//  145  234:iconst_1        
	//  146  235:iadd            
	//  147  236:istore_2        
				i++;
	//  148  237:iload_1         
	//  149  238:iconst_1        
	//  150  239:iadd            
	//  151  240:istore_1        
			}
	//* 152  241:goto            190
			int i2 = l + 1;
	//  153  244:iload_3         
	//  154  245:iconst_1        
	//  155  246:iadd            
	//  156  247:istore          5
			abyte0[l] = (byte)(k1 >> 16);
	//  157  249:aload           7
	//  158  251:iload_3         
	//  159  252:iload           4
	//  160  254:bipush          16
	//  161  256:ishr            
	//  162  257:int2byte        
	//  163  258:bastore         
			k = i2;
	//  164  259:iload           5
	//  165  261:istore_2        
			if(i2 >= j2)
				continue;
	//  166  262:iload           5
	//  167  264:iload           6
	//  168  266:icmpge          304
			l = i2 + 1;
	//  169  269:iload           5
	//  170  271:iconst_1        
	//  171  272:iadd            
	//  172  273:istore_3        
			abyte0[i2] = (byte)(k1 >> 8);
	//  173  274:aload           7
	//  174  276:iload           5
	//  175  278:iload           4
	//  176  280:bipush          8
	//  177  282:ishr            
	//  178  283:int2byte        
	//  179  284:bastore         
			k = l;
	//  180  285:iload_3         
	//  181  286:istore_2        
			if(l < j2)
	//* 182  287:iload_3         
	//* 183  288:iload           6
	//* 184  290:icmpge          304
			{
				k = l + 1;
	//  185  293:iload_3         
	//  186  294:iconst_1        
	//  187  295:iadd            
	//  188  296:istore_2        
				abyte0[l] = (byte)k1;
	//  189  297:aload           7
	//  190  299:iload_3         
	//  191  300:iload           4
	//  192  302:int2byte        
	//  193  303:bastore         
			}
		}

	//  194  304:iload_2         
	//  195  305:istore_3        
	//* 196  306:goto            179
		return abyte0;
	//  197  309:aload           7
	//  198  311:areturn         
	}

	public static final byte[] decode(byte abyte0[])
	{
		int k1 = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore          4
		int i = 0;
	//    3    4:iconst_0        
	//    4    5:istore_1        
		int j;
		int l;
		for(j = 0; i < k1; j = l)
	//*   5    6:iconst_0        
	//*   6    7:istore_2        
	//*   7    8:iload_1         
	//*   8    9:iload           4
	//*   9   11:icmpge          43
		{
			l = j;
	//   10   14:iload_2         
	//   11   15:istore_3        
			if(IA[abyte0[i] & 0xff] < 0)
	//*  12   16:getstatic       #22  <Field int[] IA>
	//*  13   19:aload_0         
	//*  14   20:iload_1         
	//*  15   21:baload          
	//*  16   22:sipush          255
	//*  17   25:iand            
	//*  18   26:iaload          
	//*  19   27:ifge            34
				l = j + 1;
	//   20   30:iload_2         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:istore_3        
			i++;
	//   24   34:iload_1         
	//   25   35:iconst_1        
	//   26   36:iadd            
	//   27   37:istore_1        
		}

	//   28   38:iload_3         
	//   29   39:istore_2        
	//*  30   40:goto            8
		int i2 = k1 - j;
	//   31   43:iload           4
	//   32   45:iload_2         
	//   33   46:isub            
	//   34   47:istore          5
		if(i2 % 4 != 0)
	//*  35   49:iload           5
	//*  36   51:iconst_4        
	//*  37   52:irem            
	//*  38   53:ifeq            58
			return null;
	//   39   56:aconst_null     
	//   40   57:areturn         
		j = 0;
	//   41   58:iconst_0        
	//   42   59:istore_2        
		i = k1;
	//   43   60:iload           4
	//   44   62:istore_1        
		do
		{
			if(i <= 1)
				break;
	//   45   63:iload_1         
	//   46   64:iconst_1        
	//   47   65:icmple          109
			int ai[] = IA;
	//   48   68:getstatic       #22  <Field int[] IA>
	//   49   71:astore          7
			int i1 = i - 1;
	//   50   73:iload_1         
	//   51   74:iconst_1        
	//   52   75:isub            
	//   53   76:istore_3        
			if(ai[abyte0[i1] & 0xff] > 0)
				break;
	//   54   77:aload           7
	//   55   79:aload_0         
	//   56   80:iload_3         
	//   57   81:baload          
	//   58   82:sipush          255
	//   59   85:iand            
	//   60   86:iaload          
	//   61   87:ifgt            109
			i = i1;
	//   62   90:iload_3         
	//   63   91:istore_1        
			if(abyte0[i1] == 61)
	//*  64   92:aload_0         
	//*  65   93:iload_3         
	//*  66   94:baload          
	//*  67   95:bipush          61
	//*  68   97:icmpne          63
			{
				j++;
	//   69  100:iload_2         
	//   70  101:iconst_1        
	//   71  102:iadd            
	//   72  103:istore_2        
				i = i1;
	//   73  104:iload_3         
	//   74  105:istore_1        
			}
		} while(true);
	//   75  106:goto            63
		int l2 = (i2 * 6 >> 3) - j;
	//   76  109:iload           5
	//   77  111:bipush          6
	//   78  113:imul            
	//   79  114:iconst_3        
	//   80  115:ishr            
	//   81  116:iload_2         
	//   82  117:isub            
	//   83  118:istore          6
		byte abyte1[] = new byte[l2];
	//   84  120:iload           6
	//   85  122:newarray        byte[]
	//   86  124:astore          7
		int j1 = 0;
	//   87  126:iconst_0        
	//   88  127:istore_3        
		i = 0;
	//   89  128:iconst_0        
	//   90  129:istore_1        
		int k;
		for(; j1 < l2; j1 = k)
	//*  91  130:iload_3         
	//*  92  131:iload           6
	//*  93  133:icmpge          262
		{
			k = 0;
	//   94  136:iconst_0        
	//   95  137:istore_2        
			int l1 = 0;
	//   96  138:iconst_0        
	//   97  139:istore          4
			while(k < 4) 
	//*  98  141:iload_2         
	//*  99  142:iconst_4        
	//* 100  143:icmpge          197
			{
				int j2 = IA[abyte0[i] & 0xff];
	//  101  146:getstatic       #22  <Field int[] IA>
	//  102  149:aload_0         
	//  103  150:iload_1         
	//  104  151:baload          
	//  105  152:sipush          255
	//  106  155:iand            
	//  107  156:iaload          
	//  108  157:istore          5
				if(j2 >= 0)
	//* 109  159:iload           5
	//* 110  161:iflt            182
					l1 = j2 << 18 - k * 6 | l1;
	//  111  164:iload           5
	//  112  166:bipush          18
	//  113  168:iload_2         
	//  114  169:bipush          6
	//  115  171:imul            
	//  116  172:isub            
	//  117  173:ishl            
	//  118  174:iload           4
	//  119  176:ior             
	//  120  177:istore          4
				else
	//* 121  179:goto            186
					k--;
	//  122  182:iload_2         
	//  123  183:iconst_1        
	//  124  184:isub            
	//  125  185:istore_2        
				k++;
	//  126  186:iload_2         
	//  127  187:iconst_1        
	//  128  188:iadd            
	//  129  189:istore_2        
				i++;
	//  130  190:iload_1         
	//  131  191:iconst_1        
	//  132  192:iadd            
	//  133  193:istore_1        
			}
	//* 134  194:goto            141
			int k2 = j1 + 1;
	//  135  197:iload_3         
	//  136  198:iconst_1        
	//  137  199:iadd            
	//  138  200:istore          5
			abyte1[j1] = (byte)(l1 >> 16);
	//  139  202:aload           7
	//  140  204:iload_3         
	//  141  205:iload           4
	//  142  207:bipush          16
	//  143  209:ishr            
	//  144  210:int2byte        
	//  145  211:bastore         
			k = k2;
	//  146  212:iload           5
	//  147  214:istore_2        
			if(k2 >= l2)
				continue;
	//  148  215:iload           5
	//  149  217:iload           6
	//  150  219:icmpge          257
			j1 = k2 + 1;
	//  151  222:iload           5
	//  152  224:iconst_1        
	//  153  225:iadd            
	//  154  226:istore_3        
			abyte1[k2] = (byte)(l1 >> 8);
	//  155  227:aload           7
	//  156  229:iload           5
	//  157  231:iload           4
	//  158  233:bipush          8
	//  159  235:ishr            
	//  160  236:int2byte        
	//  161  237:bastore         
			k = j1;
	//  162  238:iload_3         
	//  163  239:istore_2        
			if(j1 < l2)
	//* 164  240:iload_3         
	//* 165  241:iload           6
	//* 166  243:icmpge          257
			{
				k = j1 + 1;
	//  167  246:iload_3         
	//  168  247:iconst_1        
	//  169  248:iadd            
	//  170  249:istore_2        
				abyte1[j1] = (byte)l1;
	//  171  250:aload           7
	//  172  252:iload_3         
	//  173  253:iload           4
	//  174  255:int2byte        
	//  175  256:bastore         
			}
		}

	//  176  257:iload_2         
	//  177  258:istore_3        
	//* 178  259:goto            130
		return abyte1;
	//  179  262:aload           7
	//  180  264:areturn         
	}

	public static final byte[] decode(char ac[])
	{
		int i;
		if(ac != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          10
			i = ac.length;
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:istore_1        
		else
	//*   5    7:goto            12
			i = 0;
	//    6   10:iconst_0        
	//    7   11:istore_1        
		if(i == 0)
	//*   8   12:iload_1         
	//*   9   13:ifne            20
			return new byte[0];
	//   10   16:iconst_0        
	//   11   17:newarray        byte[]
	//   12   19:areturn         
		int j = 0;
	//   13   20:iconst_0        
	//   14   21:istore_2        
		int l;
		int i1;
		for(l = 0; j < i; l = i1)
	//*  15   22:iconst_0        
	//*  16   23:istore_3        
	//*  17   24:iload_2         
	//*  18   25:iload_1         
	//*  19   26:icmpge          57
		{
			i1 = l;
	//   20   29:iload_3         
	//   21   30:istore          4
			if(IA[ac[j]] < 0)
	//*  22   32:getstatic       #22  <Field int[] IA>
	//*  23   35:aload_0         
	//*  24   36:iload_2         
	//*  25   37:caload          
	//*  26   38:iaload          
	//*  27   39:ifge            47
				i1 = l + 1;
	//   28   42:iload_3         
	//   29   43:iconst_1        
	//   30   44:iadd            
	//   31   45:istore          4
			j++;
	//   32   47:iload_2         
	//   33   48:iconst_1        
	//   34   49:iadd            
	//   35   50:istore_2        
		}

	//   36   51:iload           4
	//   37   53:istore_3        
	//*  38   54:goto            24
		int j1 = i - l;
	//   39   57:iload_1         
	//   40   58:iload_3         
	//   41   59:isub            
	//   42   60:istore          4
		if(j1 % 4 != 0)
	//*  43   62:iload           4
	//*  44   64:iconst_4        
	//*  45   65:irem            
	//*  46   66:ifeq            71
			return null;
	//   47   69:aconst_null     
	//   48   70:areturn         
		j = 0;
	//   49   71:iconst_0        
	//   50   72:istore_2        
		do
		{
			if(i <= 1)
				break;
	//   51   73:iload_1         
	//   52   74:iconst_1        
	//   53   75:icmple          115
			int ai[] = IA;
	//   54   78:getstatic       #22  <Field int[] IA>
	//   55   81:astore          7
			l = i - 1;
	//   56   83:iload_1         
	//   57   84:iconst_1        
	//   58   85:isub            
	//   59   86:istore_3        
			if(ai[ac[l]] > 0)
				break;
	//   60   87:aload           7
	//   61   89:aload_0         
	//   62   90:iload_3         
	//   63   91:caload          
	//   64   92:iaload          
	//   65   93:ifgt            115
			i = l;
	//   66   96:iload_3         
	//   67   97:istore_1        
			if(ac[l] == '=')
	//*  68   98:aload_0         
	//*  69   99:iload_3         
	//*  70  100:caload          
	//*  71  101:bipush          61
	//*  72  103:icmpne          73
			{
				j++;
	//   73  106:iload_2         
	//   74  107:iconst_1        
	//   75  108:iadd            
	//   76  109:istore_2        
				i = l;
	//   77  110:iload_3         
	//   78  111:istore_1        
			}
		} while(true);
	//   79  112:goto            73
		int j2 = (j1 * 6 >> 3) - j;
	//   80  115:iload           4
	//   81  117:bipush          6
	//   82  119:imul            
	//   83  120:iconst_3        
	//   84  121:ishr            
	//   85  122:iload_2         
	//   86  123:isub            
	//   87  124:istore          6
		byte abyte0[] = new byte[j2];
	//   88  126:iload           6
	//   89  128:newarray        byte[]
	//   90  130:astore          7
		l = 0;
	//   91  132:iconst_0        
	//   92  133:istore_3        
		i = 0;
	//   93  134:iconst_0        
	//   94  135:istore_1        
		int k;
		for(; l < j2; l = k)
	//*  95  136:iload_3         
	//*  96  137:iload           6
	//*  97  139:icmpge          264
		{
			k = 0;
	//   98  142:iconst_0        
	//   99  143:istore_2        
			int k1 = 0;
	//  100  144:iconst_0        
	//  101  145:istore          4
			while(k < 4) 
	//* 102  147:iload_2         
	//* 103  148:iconst_4        
	//* 104  149:icmpge          199
			{
				int l1 = IA[ac[i]];
	//  105  152:getstatic       #22  <Field int[] IA>
	//  106  155:aload_0         
	//  107  156:iload_1         
	//  108  157:caload          
	//  109  158:iaload          
	//  110  159:istore          5
				if(l1 >= 0)
	//* 111  161:iload           5
	//* 112  163:iflt            184
					k1 = l1 << 18 - k * 6 | k1;
	//  113  166:iload           5
	//  114  168:bipush          18
	//  115  170:iload_2         
	//  116  171:bipush          6
	//  117  173:imul            
	//  118  174:isub            
	//  119  175:ishl            
	//  120  176:iload           4
	//  121  178:ior             
	//  122  179:istore          4
				else
	//* 123  181:goto            188
					k--;
	//  124  184:iload_2         
	//  125  185:iconst_1        
	//  126  186:isub            
	//  127  187:istore_2        
				k++;
	//  128  188:iload_2         
	//  129  189:iconst_1        
	//  130  190:iadd            
	//  131  191:istore_2        
				i++;
	//  132  192:iload_1         
	//  133  193:iconst_1        
	//  134  194:iadd            
	//  135  195:istore_1        
			}
	//* 136  196:goto            147
			int i2 = l + 1;
	//  137  199:iload_3         
	//  138  200:iconst_1        
	//  139  201:iadd            
	//  140  202:istore          5
			abyte0[l] = (byte)(k1 >> 16);
	//  141  204:aload           7
	//  142  206:iload_3         
	//  143  207:iload           4
	//  144  209:bipush          16
	//  145  211:ishr            
	//  146  212:int2byte        
	//  147  213:bastore         
			k = i2;
	//  148  214:iload           5
	//  149  216:istore_2        
			if(i2 >= j2)
				continue;
	//  150  217:iload           5
	//  151  219:iload           6
	//  152  221:icmpge          259
			l = i2 + 1;
	//  153  224:iload           5
	//  154  226:iconst_1        
	//  155  227:iadd            
	//  156  228:istore_3        
			abyte0[i2] = (byte)(k1 >> 8);
	//  157  229:aload           7
	//  158  231:iload           5
	//  159  233:iload           4
	//  160  235:bipush          8
	//  161  237:ishr            
	//  162  238:int2byte        
	//  163  239:bastore         
			k = l;
	//  164  240:iload_3         
	//  165  241:istore_2        
			if(l < j2)
	//* 166  242:iload_3         
	//* 167  243:iload           6
	//* 168  245:icmpge          259
			{
				k = l + 1;
	//  169  248:iload_3         
	//  170  249:iconst_1        
	//  171  250:iadd            
	//  172  251:istore_2        
				abyte0[l] = (byte)k1;
	//  173  252:aload           7
	//  174  254:iload_3         
	//  175  255:iload           4
	//  176  257:int2byte        
	//  177  258:bastore         
			}
		}

	//  178  259:iload_2         
	//  179  260:istore_3        
	//* 180  261:goto            136
		return abyte0;
	//  181  264:aload           7
	//  182  266:areturn         
	}

	public static final byte[] decodeFast(String s)
	{
		int k = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method int String.length()>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore          7
		if(k == 0)
	//*   5    8:iload_3         
	//*   6    9:ifne            16
			return new byte[0];
	//    7   12:iconst_0        
	//    8   13:newarray        byte[]
	//    9   15:areturn         
		int i = k - 1;
	//   10   16:iload_3         
	//   11   17:iconst_1        
	//   12   18:isub            
	//   13   19:istore_1        
		int j = 0;
	//   14   20:iconst_0        
	//   15   21:istore_2        
		int j1;
		do
		{
			j1 = i;
	//   16   22:iload_1         
	//   17   23:istore          5
			if(j >= i)
				break;
	//   18   25:iload_2         
	//   19   26:iload_1         
	//   20   27:icmpge          56
			j1 = i;
	//   21   30:iload_1         
	//   22   31:istore          5
			if(IA[s.charAt(j) & 0xff] >= 0)
				break;
	//   23   33:getstatic       #22  <Field int[] IA>
	//   24   36:aload_0         
	//   25   37:iload_2         
	//   26   38:invokevirtual   #42  <Method char String.charAt(int)>
	//   27   41:sipush          255
	//   28   44:iand            
	//   29   45:iaload          
	//   30   46:ifge            56
			j++;
	//   31   49:iload_2         
	//   32   50:iconst_1        
	//   33   51:iadd            
	//   34   52:istore_2        
		} while(true);
	//   35   53:goto            22
		for(; j1 > 0 && IA[s.charAt(j1) & 0xff] < 0; j1--);
	//   36   56:iload           5
	//   37   58:ifle            87
	//   38   61:getstatic       #22  <Field int[] IA>
	//   39   64:aload_0         
	//   40   65:iload           5
	//   41   67:invokevirtual   #42  <Method char String.charAt(int)>
	//   42   70:sipush          255
	//   43   73:iand            
	//   44   74:iaload          
	//   45   75:ifge            87
	//   46   78:iload           5
	//   47   80:iconst_1        
	//   48   81:isub            
	//   49   82:istore          5
	//*  50   84:goto            56
		if(s.charAt(j1) == '=')
	//*  51   87:aload_0         
	//*  52   88:iload           5
	//*  53   90:invokevirtual   #42  <Method char String.charAt(int)>
	//*  54   93:bipush          61
	//*  55   95:icmpne          121
		{
			if(s.charAt(j1 - 1) == '=')
	//*  56   98:aload_0         
	//*  57   99:iload           5
	//*  58  101:iconst_1        
	//*  59  102:isub            
	//*  60  103:invokevirtual   #42  <Method char String.charAt(int)>
	//*  61  106:bipush          61
	//*  62  108:icmpne          116
				i = 2;
	//   63  111:iconst_2        
	//   64  112:istore_1        
			else
	//*  65  113:goto            123
				i = 1;
	//   66  116:iconst_1        
	//   67  117:istore_1        
		} else
	//*  68  118:goto            123
		{
			i = 0;
	//   69  121:iconst_0        
	//   70  122:istore_1        
		}
		int i1 = (j1 - j) + 1;
	//   71  123:iload           5
	//   72  125:iload_2         
	//   73  126:isub            
	//   74  127:iconst_1        
	//   75  128:iadd            
	//   76  129:istore          4
		int k1;
		if(k > 76)
	//*  77  131:iload_3         
	//*  78  132:bipush          76
	//*  79  134:icmple          167
		{
			if(s.charAt(76) == '\r')
	//*  80  137:aload_0         
	//*  81  138:bipush          76
	//*  82  140:invokevirtual   #42  <Method char String.charAt(int)>
	//*  83  143:bipush          13
	//*  84  145:icmpne          157
				k = i1 / 78;
	//   85  148:iload           4
	//   86  150:bipush          78
	//   87  152:idiv            
	//   88  153:istore_3        
			else
	//*  89  154:goto            159
				k = 0;
	//   90  157:iconst_0        
	//   91  158:istore_3        
			k1 = k << 1;
	//   92  159:iload_3         
	//   93  160:iconst_1        
	//   94  161:ishl            
	//   95  162:istore          6
		} else
	//*  96  164:goto            170
		{
			k1 = 0;
	//   97  167:iconst_0        
	//   98  168:istore          6
		}
		int j2 = ((i1 - k1) * 6 >> 3) - i;
	//   99  170:iload           4
	//  100  172:iload           6
	//  101  174:isub            
	//  102  175:bipush          6
	//  103  177:imul            
	//  104  178:iconst_3        
	//  105  179:ishr            
	//  106  180:iload_1         
	//  107  181:isub            
	//  108  182:istore          9
		byte abyte0[] = new byte[j2];
	//  109  184:iload           9
	//  110  186:newarray        byte[]
	//  111  188:astore          14
		int k2 = j2 / 3;
	//  112  190:iload           9
	//  113  192:iconst_3        
	//  114  193:idiv            
	//  115  194:istore          10
		int i2 = 0;
	//  116  196:iconst_0        
	//  117  197:istore          8
		k = 0;
	//  118  199:iconst_0        
	//  119  200:istore_3        
		i1 = j;
	//  120  201:iload_2         
	//  121  202:istore          4
		for(j = i2; j < k2 * 3; j = i2 + 1)
	//* 122  204:iload           8
	//* 123  206:istore_2        
	//* 124  207:iload_2         
	//* 125  208:iload           10
	//* 126  210:iconst_3        
	//* 127  211:imul            
	//* 128  212:icmpge          401
		{
			int ai[] = IA;
	//  129  215:getstatic       #22  <Field int[] IA>
	//  130  218:astore          15
			int l2 = i1 + 1;
	//  131  220:iload           4
	//  132  222:iconst_1        
	//  133  223:iadd            
	//  134  224:istore          11
			i2 = ai[s.charAt(i1)];
	//  135  226:aload           15
	//  136  228:aload_0         
	//  137  229:iload           4
	//  138  231:invokevirtual   #42  <Method char String.charAt(int)>
	//  139  234:iaload          
	//  140  235:istore          8
			ai = IA;
	//  141  237:getstatic       #22  <Field int[] IA>
	//  142  240:astore          15
			i1 = l2 + 1;
	//  143  242:iload           11
	//  144  244:iconst_1        
	//  145  245:iadd            
	//  146  246:istore          4
			l2 = ai[s.charAt(l2)];
	//  147  248:aload           15
	//  148  250:aload_0         
	//  149  251:iload           11
	//  150  253:invokevirtual   #42  <Method char String.charAt(int)>
	//  151  256:iaload          
	//  152  257:istore          11
			ai = IA;
	//  153  259:getstatic       #22  <Field int[] IA>
	//  154  262:astore          15
			int i3 = i1 + 1;
	//  155  264:iload           4
	//  156  266:iconst_1        
	//  157  267:iadd            
	//  158  268:istore          12
			int j3 = ai[s.charAt(i1)];
	//  159  270:aload           15
	//  160  272:aload_0         
	//  161  273:iload           4
	//  162  275:invokevirtual   #42  <Method char String.charAt(int)>
	//  163  278:iaload          
	//  164  279:istore          13
			ai = IA;
	//  165  281:getstatic       #22  <Field int[] IA>
	//  166  284:astore          15
			i1 = i3 + 1;
	//  167  286:iload           12
	//  168  288:iconst_1        
	//  169  289:iadd            
	//  170  290:istore          4
			l2 = i2 << 18 | l2 << 12 | j3 << 6 | ai[s.charAt(i3)];
	//  171  292:iload           8
	//  172  294:bipush          18
	//  173  296:ishl            
	//  174  297:iload           11
	//  175  299:bipush          12
	//  176  301:ishl            
	//  177  302:ior             
	//  178  303:iload           13
	//  179  305:bipush          6
	//  180  307:ishl            
	//  181  308:ior             
	//  182  309:aload           15
	//  183  311:aload_0         
	//  184  312:iload           12
	//  185  314:invokevirtual   #42  <Method char String.charAt(int)>
	//  186  317:iaload          
	//  187  318:ior             
	//  188  319:istore          11
			i3 = j + 1;
	//  189  321:iload_2         
	//  190  322:iconst_1        
	//  191  323:iadd            
	//  192  324:istore          12
			abyte0[j] = (byte)(l2 >> 16);
	//  193  326:aload           14
	//  194  328:iload_2         
	//  195  329:iload           11
	//  196  331:bipush          16
	//  197  333:ishr            
	//  198  334:int2byte        
	//  199  335:bastore         
			i2 = i3 + 1;
	//  200  336:iload           12
	//  201  338:iconst_1        
	//  202  339:iadd            
	//  203  340:istore          8
			abyte0[i3] = (byte)(l2 >> 8);
	//  204  342:aload           14
	//  205  344:iload           12
	//  206  346:iload           11
	//  207  348:bipush          8
	//  208  350:ishr            
	//  209  351:int2byte        
	//  210  352:bastore         
			abyte0[i2] = (byte)l2;
	//  211  353:aload           14
	//  212  355:iload           8
	//  213  357:iload           11
	//  214  359:int2byte        
	//  215  360:bastore         
			j = k;
	//  216  361:iload_3         
	//  217  362:istore_2        
			if(k1 > 0)
	//* 218  363:iload           6
	//* 219  365:ifle            391
			{
				k++;
	//  220  368:iload_3         
	//  221  369:iconst_1        
	//  222  370:iadd            
	//  223  371:istore_3        
				j = k;
	//  224  372:iload_3         
	//  225  373:istore_2        
				if(k == 19)
	//* 226  374:iload_3         
	//* 227  375:bipush          19
	//* 228  377:icmpne          391
				{
					i1 += 2;
	//  229  380:iload           4
	//  230  382:iconst_2        
	//  231  383:iadd            
	//  232  384:istore          4
					k = 0;
	//  233  386:iconst_0        
	//  234  387:istore_3        
					continue;
	//  235  388:goto            393
				}
			}
			k = j;
	//  236  391:iload_2         
	//  237  392:istore_3        
		}

	//  238  393:iload           8
	//  239  395:iconst_1        
	//  240  396:iadd            
	//  241  397:istore_2        
	//* 242  398:goto            207
		if(j < j2)
	//* 243  401:iload_2         
	//* 244  402:iload           9
	//* 245  404:icmpge          488
		{
			int l1 = 0;
	//  246  407:iconst_0        
	//  247  408:istore          6
			int l = ((int) (flag));
	//  248  410:iload           7
	//  249  412:istore_3        
			for(; i1 <= j1 - i; i1++)
	//* 250  413:iload           4
	//* 251  415:iload           5
	//* 252  417:iload_1         
	//* 253  418:isub            
	//* 254  419:icmpgt          459
			{
				l |= IA[s.charAt(i1)] << 18 - l1 * 6;
	//  255  422:iload_3         
	//  256  423:getstatic       #22  <Field int[] IA>
	//  257  426:aload_0         
	//  258  427:iload           4
	//  259  429:invokevirtual   #42  <Method char String.charAt(int)>
	//  260  432:iaload          
	//  261  433:bipush          18
	//  262  435:iload           6
	//  263  437:bipush          6
	//  264  439:imul            
	//  265  440:isub            
	//  266  441:ishl            
	//  267  442:ior             
	//  268  443:istore_3        
				l1++;
	//  269  444:iload           6
	//  270  446:iconst_1        
	//  271  447:iadd            
	//  272  448:istore          6
			}

	//  273  450:iload           4
	//  274  452:iconst_1        
	//  275  453:iadd            
	//  276  454:istore          4
	//* 277  456:goto            413
			i = 16;
	//  278  459:bipush          16
	//  279  461:istore_1        
			for(; j < j2; j++)
	//* 280  462:iload_2         
	//* 281  463:iload           9
	//* 282  465:icmpge          488
			{
				abyte0[j] = (byte)(l >> i);
	//  283  468:aload           14
	//  284  470:iload_2         
	//  285  471:iload_3         
	//  286  472:iload_1         
	//  287  473:ishr            
	//  288  474:int2byte        
	//  289  475:bastore         
				i -= 8;
	//  290  476:iload_1         
	//  291  477:bipush          8
	//  292  479:isub            
	//  293  480:istore_1        
			}

	//  294  481:iload_2         
	//  295  482:iconst_1        
	//  296  483:iadd            
	//  297  484:istore_2        
		}
	//* 298  485:goto            462
		return abyte0;
	//  299  488:aload           14
	//  300  490:areturn         
	}

	public static final byte[] decodeFast(byte abyte0[])
	{
		int k = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_3        
		boolean flag = false;
	//    3    3:iconst_0        
	//    4    4:istore          7
		if(k == 0)
	//*   5    6:iload_3         
	//*   6    7:ifne            14
			return new byte[0];
	//    7   10:iconst_0        
	//    8   11:newarray        byte[]
	//    9   13:areturn         
		int i = k - 1;
	//   10   14:iload_3         
	//   11   15:iconst_1        
	//   12   16:isub            
	//   13   17:istore_1        
		int j = 0;
	//   14   18:iconst_0        
	//   15   19:istore_2        
		int j1;
		do
		{
			j1 = i;
	//   16   20:iload_1         
	//   17   21:istore          5
			if(j >= i)
				break;
	//   18   23:iload_2         
	//   19   24:iload_1         
	//   20   25:icmpge          52
			j1 = i;
	//   21   28:iload_1         
	//   22   29:istore          5
			if(IA[abyte0[j] & 0xff] >= 0)
				break;
	//   23   31:getstatic       #22  <Field int[] IA>
	//   24   34:aload_0         
	//   25   35:iload_2         
	//   26   36:baload          
	//   27   37:sipush          255
	//   28   40:iand            
	//   29   41:iaload          
	//   30   42:ifge            52
			j++;
	//   31   45:iload_2         
	//   32   46:iconst_1        
	//   33   47:iadd            
	//   34   48:istore_2        
		} while(true);
	//   35   49:goto            20
		for(; j1 > 0 && IA[abyte0[j1] & 0xff] < 0; j1--);
	//   36   52:iload           5
	//   37   54:ifle            81
	//   38   57:getstatic       #22  <Field int[] IA>
	//   39   60:aload_0         
	//   40   61:iload           5
	//   41   63:baload          
	//   42   64:sipush          255
	//   43   67:iand            
	//   44   68:iaload          
	//   45   69:ifge            81
	//   46   72:iload           5
	//   47   74:iconst_1        
	//   48   75:isub            
	//   49   76:istore          5
	//*  50   78:goto            52
		if(abyte0[j1] == 61)
	//*  51   81:aload_0         
	//*  52   82:iload           5
	//*  53   84:baload          
	//*  54   85:bipush          61
	//*  55   87:icmpne          111
		{
			if(abyte0[j1 - 1] == 61)
	//*  56   90:aload_0         
	//*  57   91:iload           5
	//*  58   93:iconst_1        
	//*  59   94:isub            
	//*  60   95:baload          
	//*  61   96:bipush          61
	//*  62   98:icmpne          106
				i = 2;
	//   63  101:iconst_2        
	//   64  102:istore_1        
			else
	//*  65  103:goto            113
				i = 1;
	//   66  106:iconst_1        
	//   67  107:istore_1        
		} else
	//*  68  108:goto            113
		{
			i = 0;
	//   69  111:iconst_0        
	//   70  112:istore_1        
		}
		int i1 = (j1 - j) + 1;
	//   71  113:iload           5
	//   72  115:iload_2         
	//   73  116:isub            
	//   74  117:iconst_1        
	//   75  118:iadd            
	//   76  119:istore          4
		int k1;
		if(k > 76)
	//*  77  121:iload_3         
	//*  78  122:bipush          76
	//*  79  124:icmple          155
		{
			if(abyte0[76] == 13)
	//*  80  127:aload_0         
	//*  81  128:bipush          76
	//*  82  130:baload          
	//*  83  131:bipush          13
	//*  84  133:icmpne          145
				k = i1 / 78;
	//   85  136:iload           4
	//   86  138:bipush          78
	//   87  140:idiv            
	//   88  141:istore_3        
			else
	//*  89  142:goto            147
				k = 0;
	//   90  145:iconst_0        
	//   91  146:istore_3        
			k1 = k << 1;
	//   92  147:iload_3         
	//   93  148:iconst_1        
	//   94  149:ishl            
	//   95  150:istore          6
		} else
	//*  96  152:goto            158
		{
			k1 = 0;
	//   97  155:iconst_0        
	//   98  156:istore          6
		}
		int j2 = ((i1 - k1) * 6 >> 3) - i;
	//   99  158:iload           4
	//  100  160:iload           6
	//  101  162:isub            
	//  102  163:bipush          6
	//  103  165:imul            
	//  104  166:iconst_3        
	//  105  167:ishr            
	//  106  168:iload_1         
	//  107  169:isub            
	//  108  170:istore          9
		byte abyte1[] = new byte[j2];
	//  109  172:iload           9
	//  110  174:newarray        byte[]
	//  111  176:astore          14
		int k2 = j2 / 3;
	//  112  178:iload           9
	//  113  180:iconst_3        
	//  114  181:idiv            
	//  115  182:istore          10
		int i2 = 0;
	//  116  184:iconst_0        
	//  117  185:istore          8
		k = 0;
	//  118  187:iconst_0        
	//  119  188:istore_3        
		i1 = j;
	//  120  189:iload_2         
	//  121  190:istore          4
		for(j = i2; j < k2 * 3; j = i2 + 1)
	//* 122  192:iload           8
	//* 123  194:istore_2        
	//* 124  195:iload_2         
	//* 125  196:iload           10
	//* 126  198:iconst_3        
	//* 127  199:imul            
	//* 128  200:icmpge          381
		{
			int ai[] = IA;
	//  129  203:getstatic       #22  <Field int[] IA>
	//  130  206:astore          15
			int l2 = i1 + 1;
	//  131  208:iload           4
	//  132  210:iconst_1        
	//  133  211:iadd            
	//  134  212:istore          11
			i2 = ai[abyte0[i1]];
	//  135  214:aload           15
	//  136  216:aload_0         
	//  137  217:iload           4
	//  138  219:baload          
	//  139  220:iaload          
	//  140  221:istore          8
			ai = IA;
	//  141  223:getstatic       #22  <Field int[] IA>
	//  142  226:astore          15
			i1 = l2 + 1;
	//  143  228:iload           11
	//  144  230:iconst_1        
	//  145  231:iadd            
	//  146  232:istore          4
			l2 = ai[abyte0[l2]];
	//  147  234:aload           15
	//  148  236:aload_0         
	//  149  237:iload           11
	//  150  239:baload          
	//  151  240:iaload          
	//  152  241:istore          11
			ai = IA;
	//  153  243:getstatic       #22  <Field int[] IA>
	//  154  246:astore          15
			int i3 = i1 + 1;
	//  155  248:iload           4
	//  156  250:iconst_1        
	//  157  251:iadd            
	//  158  252:istore          12
			int j3 = ai[abyte0[i1]];
	//  159  254:aload           15
	//  160  256:aload_0         
	//  161  257:iload           4
	//  162  259:baload          
	//  163  260:iaload          
	//  164  261:istore          13
			ai = IA;
	//  165  263:getstatic       #22  <Field int[] IA>
	//  166  266:astore          15
			i1 = i3 + 1;
	//  167  268:iload           12
	//  168  270:iconst_1        
	//  169  271:iadd            
	//  170  272:istore          4
			l2 = i2 << 18 | l2 << 12 | j3 << 6 | ai[abyte0[i3]];
	//  171  274:iload           8
	//  172  276:bipush          18
	//  173  278:ishl            
	//  174  279:iload           11
	//  175  281:bipush          12
	//  176  283:ishl            
	//  177  284:ior             
	//  178  285:iload           13
	//  179  287:bipush          6
	//  180  289:ishl            
	//  181  290:ior             
	//  182  291:aload           15
	//  183  293:aload_0         
	//  184  294:iload           12
	//  185  296:baload          
	//  186  297:iaload          
	//  187  298:ior             
	//  188  299:istore          11
			i3 = j + 1;
	//  189  301:iload_2         
	//  190  302:iconst_1        
	//  191  303:iadd            
	//  192  304:istore          12
			abyte1[j] = (byte)(l2 >> 16);
	//  193  306:aload           14
	//  194  308:iload_2         
	//  195  309:iload           11
	//  196  311:bipush          16
	//  197  313:ishr            
	//  198  314:int2byte        
	//  199  315:bastore         
			i2 = i3 + 1;
	//  200  316:iload           12
	//  201  318:iconst_1        
	//  202  319:iadd            
	//  203  320:istore          8
			abyte1[i3] = (byte)(l2 >> 8);
	//  204  322:aload           14
	//  205  324:iload           12
	//  206  326:iload           11
	//  207  328:bipush          8
	//  208  330:ishr            
	//  209  331:int2byte        
	//  210  332:bastore         
			abyte1[i2] = (byte)l2;
	//  211  333:aload           14
	//  212  335:iload           8
	//  213  337:iload           11
	//  214  339:int2byte        
	//  215  340:bastore         
			j = k;
	//  216  341:iload_3         
	//  217  342:istore_2        
			if(k1 > 0)
	//* 218  343:iload           6
	//* 219  345:ifle            371
			{
				k++;
	//  220  348:iload_3         
	//  221  349:iconst_1        
	//  222  350:iadd            
	//  223  351:istore_3        
				j = k;
	//  224  352:iload_3         
	//  225  353:istore_2        
				if(k == 19)
	//* 226  354:iload_3         
	//* 227  355:bipush          19
	//* 228  357:icmpne          371
				{
					i1 += 2;
	//  229  360:iload           4
	//  230  362:iconst_2        
	//  231  363:iadd            
	//  232  364:istore          4
					k = 0;
	//  233  366:iconst_0        
	//  234  367:istore_3        
					continue;
	//  235  368:goto            373
				}
			}
			k = j;
	//  236  371:iload_2         
	//  237  372:istore_3        
		}

	//  238  373:iload           8
	//  239  375:iconst_1        
	//  240  376:iadd            
	//  241  377:istore_2        
	//* 242  378:goto            195
		if(j < j2)
	//* 243  381:iload_2         
	//* 244  382:iload           9
	//* 245  384:icmpge          466
		{
			int l1 = 0;
	//  246  387:iconst_0        
	//  247  388:istore          6
			int l = ((int) (flag));
	//  248  390:iload           7
	//  249  392:istore_3        
			for(; i1 <= j1 - i; i1++)
	//* 250  393:iload           4
	//* 251  395:iload           5
	//* 252  397:iload_1         
	//* 253  398:isub            
	//* 254  399:icmpgt          437
			{
				l |= IA[abyte0[i1]] << 18 - l1 * 6;
	//  255  402:iload_3         
	//  256  403:getstatic       #22  <Field int[] IA>
	//  257  406:aload_0         
	//  258  407:iload           4
	//  259  409:baload          
	//  260  410:iaload          
	//  261  411:bipush          18
	//  262  413:iload           6
	//  263  415:bipush          6
	//  264  417:imul            
	//  265  418:isub            
	//  266  419:ishl            
	//  267  420:ior             
	//  268  421:istore_3        
				l1++;
	//  269  422:iload           6
	//  270  424:iconst_1        
	//  271  425:iadd            
	//  272  426:istore          6
			}

	//  273  428:iload           4
	//  274  430:iconst_1        
	//  275  431:iadd            
	//  276  432:istore          4
	//* 277  434:goto            393
			i = 16;
	//  278  437:bipush          16
	//  279  439:istore_1        
			for(; j < j2; j++)
	//* 280  440:iload_2         
	//* 281  441:iload           9
	//* 282  443:icmpge          466
			{
				abyte1[j] = (byte)(l >> i);
	//  283  446:aload           14
	//  284  448:iload_2         
	//  285  449:iload_3         
	//  286  450:iload_1         
	//  287  451:ishr            
	//  288  452:int2byte        
	//  289  453:bastore         
				i -= 8;
	//  290  454:iload_1         
	//  291  455:bipush          8
	//  292  457:isub            
	//  293  458:istore_1        
			}

	//  294  459:iload_2         
	//  295  460:iconst_1        
	//  296  461:iadd            
	//  297  462:istore_2        
		}
	//* 298  463:goto            440
		return abyte1;
	//  299  466:aload           14
	//  300  468:areturn         
	}

	public static final byte[] decodeFast(char ac[])
	{
		int k = ac.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_3        
		boolean flag = false;
	//    3    3:iconst_0        
	//    4    4:istore          7
		if(k == 0)
	//*   5    6:iload_3         
	//*   6    7:ifne            14
			return new byte[0];
	//    7   10:iconst_0        
	//    8   11:newarray        byte[]
	//    9   13:areturn         
		int i = k - 1;
	//   10   14:iload_3         
	//   11   15:iconst_1        
	//   12   16:isub            
	//   13   17:istore_1        
		int j = 0;
	//   14   18:iconst_0        
	//   15   19:istore_2        
		int j1;
		do
		{
			j1 = i;
	//   16   20:iload_1         
	//   17   21:istore          5
			if(j >= i)
				break;
	//   18   23:iload_2         
	//   19   24:iload_1         
	//   20   25:icmpge          48
			j1 = i;
	//   21   28:iload_1         
	//   22   29:istore          5
			if(IA[ac[j]] >= 0)
				break;
	//   23   31:getstatic       #22  <Field int[] IA>
	//   24   34:aload_0         
	//   25   35:iload_2         
	//   26   36:caload          
	//   27   37:iaload          
	//   28   38:ifge            48
			j++;
	//   29   41:iload_2         
	//   30   42:iconst_1        
	//   31   43:iadd            
	//   32   44:istore_2        
		} while(true);
	//   33   45:goto            20
		for(; j1 > 0 && IA[ac[j1]] < 0; j1--);
	//   34   48:iload           5
	//   35   50:ifle            73
	//   36   53:getstatic       #22  <Field int[] IA>
	//   37   56:aload_0         
	//   38   57:iload           5
	//   39   59:caload          
	//   40   60:iaload          
	//   41   61:ifge            73
	//   42   64:iload           5
	//   43   66:iconst_1        
	//   44   67:isub            
	//   45   68:istore          5
	//*  46   70:goto            48
		if(ac[j1] == '=')
	//*  47   73:aload_0         
	//*  48   74:iload           5
	//*  49   76:caload          
	//*  50   77:bipush          61
	//*  51   79:icmpne          103
		{
			if(ac[j1 - 1] == '=')
	//*  52   82:aload_0         
	//*  53   83:iload           5
	//*  54   85:iconst_1        
	//*  55   86:isub            
	//*  56   87:caload          
	//*  57   88:bipush          61
	//*  58   90:icmpne          98
				i = 2;
	//   59   93:iconst_2        
	//   60   94:istore_1        
			else
	//*  61   95:goto            105
				i = 1;
	//   62   98:iconst_1        
	//   63   99:istore_1        
		} else
	//*  64  100:goto            105
		{
			i = 0;
	//   65  103:iconst_0        
	//   66  104:istore_1        
		}
		int i1 = (j1 - j) + 1;
	//   67  105:iload           5
	//   68  107:iload_2         
	//   69  108:isub            
	//   70  109:iconst_1        
	//   71  110:iadd            
	//   72  111:istore          4
		int k1;
		if(k > 76)
	//*  73  113:iload_3         
	//*  74  114:bipush          76
	//*  75  116:icmple          147
		{
			if(ac[76] == '\r')
	//*  76  119:aload_0         
	//*  77  120:bipush          76
	//*  78  122:caload          
	//*  79  123:bipush          13
	//*  80  125:icmpne          137
				k = i1 / 78;
	//   81  128:iload           4
	//   82  130:bipush          78
	//   83  132:idiv            
	//   84  133:istore_3        
			else
	//*  85  134:goto            139
				k = 0;
	//   86  137:iconst_0        
	//   87  138:istore_3        
			k1 = k << 1;
	//   88  139:iload_3         
	//   89  140:iconst_1        
	//   90  141:ishl            
	//   91  142:istore          6
		} else
	//*  92  144:goto            150
		{
			k1 = 0;
	//   93  147:iconst_0        
	//   94  148:istore          6
		}
		int j2 = ((i1 - k1) * 6 >> 3) - i;
	//   95  150:iload           4
	//   96  152:iload           6
	//   97  154:isub            
	//   98  155:bipush          6
	//   99  157:imul            
	//  100  158:iconst_3        
	//  101  159:ishr            
	//  102  160:iload_1         
	//  103  161:isub            
	//  104  162:istore          9
		byte abyte0[] = new byte[j2];
	//  105  164:iload           9
	//  106  166:newarray        byte[]
	//  107  168:astore          14
		int k2 = j2 / 3;
	//  108  170:iload           9
	//  109  172:iconst_3        
	//  110  173:idiv            
	//  111  174:istore          10
		int i2 = 0;
	//  112  176:iconst_0        
	//  113  177:istore          8
		k = 0;
	//  114  179:iconst_0        
	//  115  180:istore_3        
		i1 = j;
	//  116  181:iload_2         
	//  117  182:istore          4
		for(j = i2; j < k2 * 3; j = i2 + 1)
	//* 118  184:iload           8
	//* 119  186:istore_2        
	//* 120  187:iload_2         
	//* 121  188:iload           10
	//* 122  190:iconst_3        
	//* 123  191:imul            
	//* 124  192:icmpge          373
		{
			int ai[] = IA;
	//  125  195:getstatic       #22  <Field int[] IA>
	//  126  198:astore          15
			int l2 = i1 + 1;
	//  127  200:iload           4
	//  128  202:iconst_1        
	//  129  203:iadd            
	//  130  204:istore          11
			i2 = ai[ac[i1]];
	//  131  206:aload           15
	//  132  208:aload_0         
	//  133  209:iload           4
	//  134  211:caload          
	//  135  212:iaload          
	//  136  213:istore          8
			ai = IA;
	//  137  215:getstatic       #22  <Field int[] IA>
	//  138  218:astore          15
			i1 = l2 + 1;
	//  139  220:iload           11
	//  140  222:iconst_1        
	//  141  223:iadd            
	//  142  224:istore          4
			l2 = ai[ac[l2]];
	//  143  226:aload           15
	//  144  228:aload_0         
	//  145  229:iload           11
	//  146  231:caload          
	//  147  232:iaload          
	//  148  233:istore          11
			ai = IA;
	//  149  235:getstatic       #22  <Field int[] IA>
	//  150  238:astore          15
			int i3 = i1 + 1;
	//  151  240:iload           4
	//  152  242:iconst_1        
	//  153  243:iadd            
	//  154  244:istore          12
			int j3 = ai[ac[i1]];
	//  155  246:aload           15
	//  156  248:aload_0         
	//  157  249:iload           4
	//  158  251:caload          
	//  159  252:iaload          
	//  160  253:istore          13
			ai = IA;
	//  161  255:getstatic       #22  <Field int[] IA>
	//  162  258:astore          15
			i1 = i3 + 1;
	//  163  260:iload           12
	//  164  262:iconst_1        
	//  165  263:iadd            
	//  166  264:istore          4
			l2 = i2 << 18 | l2 << 12 | j3 << 6 | ai[ac[i3]];
	//  167  266:iload           8
	//  168  268:bipush          18
	//  169  270:ishl            
	//  170  271:iload           11
	//  171  273:bipush          12
	//  172  275:ishl            
	//  173  276:ior             
	//  174  277:iload           13
	//  175  279:bipush          6
	//  176  281:ishl            
	//  177  282:ior             
	//  178  283:aload           15
	//  179  285:aload_0         
	//  180  286:iload           12
	//  181  288:caload          
	//  182  289:iaload          
	//  183  290:ior             
	//  184  291:istore          11
			i3 = j + 1;
	//  185  293:iload_2         
	//  186  294:iconst_1        
	//  187  295:iadd            
	//  188  296:istore          12
			abyte0[j] = (byte)(l2 >> 16);
	//  189  298:aload           14
	//  190  300:iload_2         
	//  191  301:iload           11
	//  192  303:bipush          16
	//  193  305:ishr            
	//  194  306:int2byte        
	//  195  307:bastore         
			i2 = i3 + 1;
	//  196  308:iload           12
	//  197  310:iconst_1        
	//  198  311:iadd            
	//  199  312:istore          8
			abyte0[i3] = (byte)(l2 >> 8);
	//  200  314:aload           14
	//  201  316:iload           12
	//  202  318:iload           11
	//  203  320:bipush          8
	//  204  322:ishr            
	//  205  323:int2byte        
	//  206  324:bastore         
			abyte0[i2] = (byte)l2;
	//  207  325:aload           14
	//  208  327:iload           8
	//  209  329:iload           11
	//  210  331:int2byte        
	//  211  332:bastore         
			j = k;
	//  212  333:iload_3         
	//  213  334:istore_2        
			if(k1 > 0)
	//* 214  335:iload           6
	//* 215  337:ifle            363
			{
				k++;
	//  216  340:iload_3         
	//  217  341:iconst_1        
	//  218  342:iadd            
	//  219  343:istore_3        
				j = k;
	//  220  344:iload_3         
	//  221  345:istore_2        
				if(k == 19)
	//* 222  346:iload_3         
	//* 223  347:bipush          19
	//* 224  349:icmpne          363
				{
					i1 += 2;
	//  225  352:iload           4
	//  226  354:iconst_2        
	//  227  355:iadd            
	//  228  356:istore          4
					k = 0;
	//  229  358:iconst_0        
	//  230  359:istore_3        
					continue;
	//  231  360:goto            365
				}
			}
			k = j;
	//  232  363:iload_2         
	//  233  364:istore_3        
		}

	//  234  365:iload           8
	//  235  367:iconst_1        
	//  236  368:iadd            
	//  237  369:istore_2        
	//* 238  370:goto            187
		if(j < j2)
	//* 239  373:iload_2         
	//* 240  374:iload           9
	//* 241  376:icmpge          458
		{
			int l1 = 0;
	//  242  379:iconst_0        
	//  243  380:istore          6
			int l = ((int) (flag));
	//  244  382:iload           7
	//  245  384:istore_3        
			for(; i1 <= j1 - i; i1++)
	//* 246  385:iload           4
	//* 247  387:iload           5
	//* 248  389:iload_1         
	//* 249  390:isub            
	//* 250  391:icmpgt          429
			{
				l |= IA[ac[i1]] << 18 - l1 * 6;
	//  251  394:iload_3         
	//  252  395:getstatic       #22  <Field int[] IA>
	//  253  398:aload_0         
	//  254  399:iload           4
	//  255  401:caload          
	//  256  402:iaload          
	//  257  403:bipush          18
	//  258  405:iload           6
	//  259  407:bipush          6
	//  260  409:imul            
	//  261  410:isub            
	//  262  411:ishl            
	//  263  412:ior             
	//  264  413:istore_3        
				l1++;
	//  265  414:iload           6
	//  266  416:iconst_1        
	//  267  417:iadd            
	//  268  418:istore          6
			}

	//  269  420:iload           4
	//  270  422:iconst_1        
	//  271  423:iadd            
	//  272  424:istore          4
	//* 273  426:goto            385
			i = 16;
	//  274  429:bipush          16
	//  275  431:istore_1        
			for(; j < j2; j++)
	//* 276  432:iload_2         
	//* 277  433:iload           9
	//* 278  435:icmpge          458
			{
				abyte0[j] = (byte)(l >> i);
	//  279  438:aload           14
	//  280  440:iload_2         
	//  281  441:iload_3         
	//  282  442:iload_1         
	//  283  443:ishr            
	//  284  444:int2byte        
	//  285  445:bastore         
				i -= 8;
	//  286  446:iload_1         
	//  287  447:bipush          8
	//  288  449:isub            
	//  289  450:istore_1        
			}

	//  290  451:iload_2         
	//  291  452:iconst_1        
	//  292  453:iadd            
	//  293  454:istore_2        
		}
	//* 294  455:goto            432
		return abyte0;
	//  295  458:aload           14
	//  296  460:areturn         
	}

	public static final byte[] encodeToByte(byte abyte0[], boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          8
		int i1;
		if(abyte0 != null)
	//*   2    3:aload_0         
	//*   3    4:ifnull          14
			i1 = abyte0.length;
	//    4    7:aload_0         
	//    5    8:arraylength     
	//    6    9:istore          5
		else
	//*   7   11:goto            17
			i1 = 0;
	//    8   14:iconst_0        
	//    9   15:istore          5
		if(i1 == 0)
	//*  10   17:iload           5
	//*  11   19:ifne            26
			return new byte[0];
	//   12   22:iconst_0        
	//   13   23:newarray        byte[]
	//   14   25:areturn         
		int i2 = (i1 / 3) * 3;
	//   15   26:iload           5
	//   16   28:iconst_3        
	//   17   29:idiv            
	//   18   30:iconst_3        
	//   19   31:imul            
	//   20   32:istore          10
		int l1 = i1 - 1;
	//   21   34:iload           5
	//   22   36:iconst_1        
	//   23   37:isub            
	//   24   38:istore          9
		int l = l1 / 3 + 1 << 2;
	//   25   40:iload           9
	//   26   42:iconst_3        
	//   27   43:idiv            
	//   28   44:iconst_1        
	//   29   45:iadd            
	//   30   46:iconst_2        
	//   31   47:ishl            
	//   32   48:istore          4
		int i;
		if(flag)
	//*  33   50:iload_1         
	//*  34   51:ifeq            67
			i = (l - 1) / 76 << 1;
	//   35   54:iload           4
	//   36   56:iconst_1        
	//   37   57:isub            
	//   38   58:bipush          76
	//   39   60:idiv            
	//   40   61:iconst_1        
	//   41   62:ishl            
	//   42   63:istore_3        
		else
	//*  43   64:goto            69
			i = 0;
	//   44   67:iconst_0        
	//   45   68:istore_3        
		int j2 = l + i;
	//   46   69:iload           4
	//   47   71:iload_3         
	//   48   72:iadd            
	//   49   73:istore          11
		byte abyte1[] = new byte[j2];
	//   50   75:iload           11
	//   51   77:newarray        byte[]
	//   52   79:astore          14
		int k1 = 0;
	//   53   81:iconst_0        
	//   54   82:istore          7
		l = 0;
	//   55   84:iconst_0        
	//   56   85:istore          4
		int j;
		for(int j1 = 0; k1 < i2; j1 = j)
	//*  57   87:iconst_0        
	//*  58   88:istore          6
	//*  59   90:iload           7
	//*  60   92:iload           10
	//*  61   94:icmpge          316
		{
			j = k1 + 1;
	//   62   97:iload           7
	//   63   99:iconst_1        
	//   64  100:iadd            
	//   65  101:istore_3        
			k1 = ((int) (abyte0[k1]));
	//   66  102:aload_0         
	//   67  103:iload           7
	//   68  105:baload          
	//   69  106:istore          7
			int k2 = j + 1;
	//   70  108:iload_3         
	//   71  109:iconst_1        
	//   72  110:iadd            
	//   73  111:istore          12
			j = (k1 & 0xff) << 16 | (abyte0[j] & 0xff) << 8 | abyte0[k2] & 0xff;
	//   74  113:iload           7
	//   75  115:sipush          255
	//   76  118:iand            
	//   77  119:bipush          16
	//   78  121:ishl            
	//   79  122:aload_0         
	//   80  123:iload_3         
	//   81  124:baload          
	//   82  125:sipush          255
	//   83  128:iand            
	//   84  129:bipush          8
	//   85  131:ishl            
	//   86  132:ior             
	//   87  133:aload_0         
	//   88  134:iload           12
	//   89  136:baload          
	//   90  137:sipush          255
	//   91  140:iand            
	//   92  141:ior             
	//   93  142:istore_3        
			k1 = l + 1;
	//   94  143:iload           4
	//   95  145:iconst_1        
	//   96  146:iadd            
	//   97  147:istore          7
			abyte1[l] = (byte)CA[j >>> 18 & 0x3f];
	//   98  149:aload           14
	//   99  151:iload           4
	//  100  153:getstatic       #20  <Field char[] CA>
	//  101  156:iload_3         
	//  102  157:bipush          18
	//  103  159:iushr           
	//  104  160:bipush          63
	//  105  162:iand            
	//  106  163:caload          
	//  107  164:int2byte        
	//  108  165:bastore         
			l = k1 + 1;
	//  109  166:iload           7
	//  110  168:iconst_1        
	//  111  169:iadd            
	//  112  170:istore          4
			abyte1[k1] = (byte)CA[j >>> 12 & 0x3f];
	//  113  172:aload           14
	//  114  174:iload           7
	//  115  176:getstatic       #20  <Field char[] CA>
	//  116  179:iload_3         
	//  117  180:bipush          12
	//  118  182:iushr           
	//  119  183:bipush          63
	//  120  185:iand            
	//  121  186:caload          
	//  122  187:int2byte        
	//  123  188:bastore         
			int l2 = l + 1;
	//  124  189:iload           4
	//  125  191:iconst_1        
	//  126  192:iadd            
	//  127  193:istore          13
			abyte1[l] = (byte)CA[j >>> 6 & 0x3f];
	//  128  195:aload           14
	//  129  197:iload           4
	//  130  199:getstatic       #20  <Field char[] CA>
	//  131  202:iload_3         
	//  132  203:bipush          6
	//  133  205:iushr           
	//  134  206:bipush          63
	//  135  208:iand            
	//  136  209:caload          
	//  137  210:int2byte        
	//  138  211:bastore         
			k1 = l2 + 1;
	//  139  212:iload           13
	//  140  214:iconst_1        
	//  141  215:iadd            
	//  142  216:istore          7
			abyte1[l2] = (byte)CA[j & 0x3f];
	//  143  218:aload           14
	//  144  220:iload           13
	//  145  222:getstatic       #20  <Field char[] CA>
	//  146  225:iload_3         
	//  147  226:bipush          63
	//  148  228:iand            
	//  149  229:caload          
	//  150  230:int2byte        
	//  151  231:bastore         
			l = k1;
	//  152  232:iload           7
	//  153  234:istore          4
			j = j1;
	//  154  236:iload           6
	//  155  238:istore_3        
			if(flag)
	//* 156  239:iload_1         
	//* 157  240:ifeq            304
			{
				j1++;
	//  158  243:iload           6
	//  159  245:iconst_1        
	//  160  246:iadd            
	//  161  247:istore          6
				l = k1;
	//  162  249:iload           7
	//  163  251:istore          4
				j = j1;
	//  164  253:iload           6
	//  165  255:istore_3        
				if(j1 == 19)
	//* 166  256:iload           6
	//* 167  258:bipush          19
	//* 168  260:icmpne          304
				{
					l = k1;
	//  169  263:iload           7
	//  170  265:istore          4
					j = j1;
	//  171  267:iload           6
	//  172  269:istore_3        
					if(k1 < j2 - 2)
	//* 173  270:iload           7
	//* 174  272:iload           11
	//* 175  274:iconst_2        
	//* 176  275:isub            
	//* 177  276:icmpge          304
					{
						j = k1 + 1;
	//  178  279:iload           7
	//  179  281:iconst_1        
	//  180  282:iadd            
	//  181  283:istore_3        
						abyte1[k1] = 13;
	//  182  284:aload           14
	//  183  286:iload           7
	//  184  288:bipush          13
	//  185  290:bastore         
						l = j + 1;
	//  186  291:iload_3         
	//  187  292:iconst_1        
	//  188  293:iadd            
	//  189  294:istore          4
						abyte1[j] = 10;
	//  190  296:aload           14
	//  191  298:iload_3         
	//  192  299:bipush          10
	//  193  301:bastore         
						j = 0;
	//  194  302:iconst_0        
	//  195  303:istore_3        
					}
				}
			}
			k1 = k2 + 1;
	//  196  304:iload           12
	//  197  306:iconst_1        
	//  198  307:iadd            
	//  199  308:istore          7
		}

	//  200  310:iload_3         
	//  201  311:istore          6
	//* 202  313:goto            90
		l = i1 - i2;
	//  203  316:iload           5
	//  204  318:iload           10
	//  205  320:isub            
	//  206  321:istore          4
		if(l > 0)
	//* 207  323:iload           4
	//* 208  325:ifle            440
		{
			byte byte1 = abyte0[i2];
	//  209  328:aload_0         
	//  210  329:iload           10
	//  211  331:baload          
	//  212  332:istore          5
			int k = ((int) (flag1));
	//  213  334:iload           8
	//  214  336:istore_3        
			if(l == 2)
	//* 215  337:iload           4
	//* 216  339:iconst_2        
	//* 217  340:icmpne          354
				k = (abyte0[l1] & 0xff) << 2;
	//  218  343:aload_0         
	//  219  344:iload           9
	//  220  346:baload          
	//  221  347:sipush          255
	//  222  350:iand            
	//  223  351:iconst_2        
	//  224  352:ishl            
	//  225  353:istore_3        
			k = (byte1 & 0xff) << 10 | k;
	//  226  354:iload           5
	//  227  356:sipush          255
	//  228  359:iand            
	//  229  360:bipush          10
	//  230  362:ishl            
	//  231  363:iload_3         
	//  232  364:ior             
	//  233  365:istore_3        
			abyte1[j2 - 4] = (byte)CA[k >> 12];
	//  234  366:aload           14
	//  235  368:iload           11
	//  236  370:iconst_4        
	//  237  371:isub            
	//  238  372:getstatic       #20  <Field char[] CA>
	//  239  375:iload_3         
	//  240  376:bipush          12
	//  241  378:ishr            
	//  242  379:caload          
	//  243  380:int2byte        
	//  244  381:bastore         
			abyte1[j2 - 3] = (byte)CA[k >>> 6 & 0x3f];
	//  245  382:aload           14
	//  246  384:iload           11
	//  247  386:iconst_3        
	//  248  387:isub            
	//  249  388:getstatic       #20  <Field char[] CA>
	//  250  391:iload_3         
	//  251  392:bipush          6
	//  252  394:iushr           
	//  253  395:bipush          63
	//  254  397:iand            
	//  255  398:caload          
	//  256  399:int2byte        
	//  257  400:bastore         
			byte byte0;
			if(l == 2)
	//* 258  401:iload           4
	//* 259  403:iconst_2        
	//* 260  404:icmpne          420
				byte0 = (byte)CA[k & 0x3f];
	//  261  407:getstatic       #20  <Field char[] CA>
	//  262  410:iload_3         
	//  263  411:bipush          63
	//  264  413:iand            
	//  265  414:caload          
	//  266  415:int2byte        
	//  267  416:istore_2        
			else
	//* 268  417:goto            423
				byte0 = 61;
	//  269  420:bipush          61
	//  270  422:istore_2        
			abyte1[j2 - 2] = byte0;
	//  271  423:aload           14
	//  272  425:iload           11
	//  273  427:iconst_2        
	//  274  428:isub            
	//  275  429:iload_2         
	//  276  430:bastore         
			abyte1[j2 - 1] = 61;
	//  277  431:aload           14
	//  278  433:iload           11
	//  279  435:iconst_1        
	//  280  436:isub            
	//  281  437:bipush          61
	//  282  439:bastore         
		}
		return abyte1;
	//  283  440:aload           14
	//  284  442:areturn         
	}

	public static final char[] encodeToChar(byte abyte0[], boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          8
		int i1;
		if(abyte0 != null)
	//*   2    3:aload_0         
	//*   3    4:ifnull          14
			i1 = abyte0.length;
	//    4    7:aload_0         
	//    5    8:arraylength     
	//    6    9:istore          5
		else
	//*   7   11:goto            17
			i1 = 0;
	//    8   14:iconst_0        
	//    9   15:istore          5
		if(i1 == 0)
	//*  10   17:iload           5
	//*  11   19:ifne            26
			return new char[0];
	//   12   22:iconst_0        
	//   13   23:newarray        char[]
	//   14   25:areturn         
		int i2 = (i1 / 3) * 3;
	//   15   26:iload           5
	//   16   28:iconst_3        
	//   17   29:idiv            
	//   18   30:iconst_3        
	//   19   31:imul            
	//   20   32:istore          10
		int l1 = i1 - 1;
	//   21   34:iload           5
	//   22   36:iconst_1        
	//   23   37:isub            
	//   24   38:istore          9
		int l = l1 / 3 + 1 << 2;
	//   25   40:iload           9
	//   26   42:iconst_3        
	//   27   43:idiv            
	//   28   44:iconst_1        
	//   29   45:iadd            
	//   30   46:iconst_2        
	//   31   47:ishl            
	//   32   48:istore          4
		int i;
		if(flag)
	//*  33   50:iload_1         
	//*  34   51:ifeq            67
			i = (l - 1) / 76 << 1;
	//   35   54:iload           4
	//   36   56:iconst_1        
	//   37   57:isub            
	//   38   58:bipush          76
	//   39   60:idiv            
	//   40   61:iconst_1        
	//   41   62:ishl            
	//   42   63:istore_3        
		else
	//*  43   64:goto            69
			i = 0;
	//   44   67:iconst_0        
	//   45   68:istore_3        
		int j2 = l + i;
	//   46   69:iload           4
	//   47   71:iload_3         
	//   48   72:iadd            
	//   49   73:istore          11
		char ac[] = new char[j2];
	//   50   75:iload           11
	//   51   77:newarray        char[]
	//   52   79:astore          14
		int k1 = 0;
	//   53   81:iconst_0        
	//   54   82:istore          7
		l = 0;
	//   55   84:iconst_0        
	//   56   85:istore          4
		int j;
		for(int j1 = 0; k1 < i2; j1 = j)
	//*  57   87:iconst_0        
	//*  58   88:istore          6
	//*  59   90:iload           7
	//*  60   92:iload           10
	//*  61   94:icmpge          312
		{
			j = k1 + 1;
	//   62   97:iload           7
	//   63   99:iconst_1        
	//   64  100:iadd            
	//   65  101:istore_3        
			k1 = ((int) (abyte0[k1]));
	//   66  102:aload_0         
	//   67  103:iload           7
	//   68  105:baload          
	//   69  106:istore          7
			int k2 = j + 1;
	//   70  108:iload_3         
	//   71  109:iconst_1        
	//   72  110:iadd            
	//   73  111:istore          12
			j = (k1 & 0xff) << 16 | (abyte0[j] & 0xff) << 8 | abyte0[k2] & 0xff;
	//   74  113:iload           7
	//   75  115:sipush          255
	//   76  118:iand            
	//   77  119:bipush          16
	//   78  121:ishl            
	//   79  122:aload_0         
	//   80  123:iload_3         
	//   81  124:baload          
	//   82  125:sipush          255
	//   83  128:iand            
	//   84  129:bipush          8
	//   85  131:ishl            
	//   86  132:ior             
	//   87  133:aload_0         
	//   88  134:iload           12
	//   89  136:baload          
	//   90  137:sipush          255
	//   91  140:iand            
	//   92  141:ior             
	//   93  142:istore_3        
			k1 = l + 1;
	//   94  143:iload           4
	//   95  145:iconst_1        
	//   96  146:iadd            
	//   97  147:istore          7
			ac[l] = CA[j >>> 18 & 0x3f];
	//   98  149:aload           14
	//   99  151:iload           4
	//  100  153:getstatic       #20  <Field char[] CA>
	//  101  156:iload_3         
	//  102  157:bipush          18
	//  103  159:iushr           
	//  104  160:bipush          63
	//  105  162:iand            
	//  106  163:caload          
	//  107  164:castore         
			l = k1 + 1;
	//  108  165:iload           7
	//  109  167:iconst_1        
	//  110  168:iadd            
	//  111  169:istore          4
			ac[k1] = CA[j >>> 12 & 0x3f];
	//  112  171:aload           14
	//  113  173:iload           7
	//  114  175:getstatic       #20  <Field char[] CA>
	//  115  178:iload_3         
	//  116  179:bipush          12
	//  117  181:iushr           
	//  118  182:bipush          63
	//  119  184:iand            
	//  120  185:caload          
	//  121  186:castore         
			int l2 = l + 1;
	//  122  187:iload           4
	//  123  189:iconst_1        
	//  124  190:iadd            
	//  125  191:istore          13
			ac[l] = CA[j >>> 6 & 0x3f];
	//  126  193:aload           14
	//  127  195:iload           4
	//  128  197:getstatic       #20  <Field char[] CA>
	//  129  200:iload_3         
	//  130  201:bipush          6
	//  131  203:iushr           
	//  132  204:bipush          63
	//  133  206:iand            
	//  134  207:caload          
	//  135  208:castore         
			k1 = l2 + 1;
	//  136  209:iload           13
	//  137  211:iconst_1        
	//  138  212:iadd            
	//  139  213:istore          7
			ac[l2] = CA[j & 0x3f];
	//  140  215:aload           14
	//  141  217:iload           13
	//  142  219:getstatic       #20  <Field char[] CA>
	//  143  222:iload_3         
	//  144  223:bipush          63
	//  145  225:iand            
	//  146  226:caload          
	//  147  227:castore         
			l = k1;
	//  148  228:iload           7
	//  149  230:istore          4
			j = j1;
	//  150  232:iload           6
	//  151  234:istore_3        
			if(flag)
	//* 152  235:iload_1         
	//* 153  236:ifeq            300
			{
				j1++;
	//  154  239:iload           6
	//  155  241:iconst_1        
	//  156  242:iadd            
	//  157  243:istore          6
				l = k1;
	//  158  245:iload           7
	//  159  247:istore          4
				j = j1;
	//  160  249:iload           6
	//  161  251:istore_3        
				if(j1 == 19)
	//* 162  252:iload           6
	//* 163  254:bipush          19
	//* 164  256:icmpne          300
				{
					l = k1;
	//  165  259:iload           7
	//  166  261:istore          4
					j = j1;
	//  167  263:iload           6
	//  168  265:istore_3        
					if(k1 < j2 - 2)
	//* 169  266:iload           7
	//* 170  268:iload           11
	//* 171  270:iconst_2        
	//* 172  271:isub            
	//* 173  272:icmpge          300
					{
						j = k1 + 1;
	//  174  275:iload           7
	//  175  277:iconst_1        
	//  176  278:iadd            
	//  177  279:istore_3        
						ac[k1] = '\r';
	//  178  280:aload           14
	//  179  282:iload           7
	//  180  284:bipush          13
	//  181  286:castore         
						l = j + 1;
	//  182  287:iload_3         
	//  183  288:iconst_1        
	//  184  289:iadd            
	//  185  290:istore          4
						ac[j] = '\n';
	//  186  292:aload           14
	//  187  294:iload_3         
	//  188  295:bipush          10
	//  189  297:castore         
						j = 0;
	//  190  298:iconst_0        
	//  191  299:istore_3        
					}
				}
			}
			k1 = k2 + 1;
	//  192  300:iload           12
	//  193  302:iconst_1        
	//  194  303:iadd            
	//  195  304:istore          7
		}

	//  196  306:iload_3         
	//  197  307:istore          6
	//* 198  309:goto            90
		l = i1 - i2;
	//  199  312:iload           5
	//  200  314:iload           10
	//  201  316:isub            
	//  202  317:istore          4
		if(l > 0)
	//* 203  319:iload           4
	//* 204  321:ifle            433
		{
			byte byte0 = abyte0[i2];
	//  205  324:aload_0         
	//  206  325:iload           10
	//  207  327:baload          
	//  208  328:istore          5
			int k = ((int) (flag1));
	//  209  330:iload           8
	//  210  332:istore_3        
			if(l == 2)
	//* 211  333:iload           4
	//* 212  335:iconst_2        
	//* 213  336:icmpne          350
				k = (abyte0[l1] & 0xff) << 2;
	//  214  339:aload_0         
	//  215  340:iload           9
	//  216  342:baload          
	//  217  343:sipush          255
	//  218  346:iand            
	//  219  347:iconst_2        
	//  220  348:ishl            
	//  221  349:istore_3        
			k = (byte0 & 0xff) << 10 | k;
	//  222  350:iload           5
	//  223  352:sipush          255
	//  224  355:iand            
	//  225  356:bipush          10
	//  226  358:ishl            
	//  227  359:iload_3         
	//  228  360:ior             
	//  229  361:istore_3        
			ac[j2 - 4] = CA[k >> 12];
	//  230  362:aload           14
	//  231  364:iload           11
	//  232  366:iconst_4        
	//  233  367:isub            
	//  234  368:getstatic       #20  <Field char[] CA>
	//  235  371:iload_3         
	//  236  372:bipush          12
	//  237  374:ishr            
	//  238  375:caload          
	//  239  376:castore         
			ac[j2 - 3] = CA[k >>> 6 & 0x3f];
	//  240  377:aload           14
	//  241  379:iload           11
	//  242  381:iconst_3        
	//  243  382:isub            
	//  244  383:getstatic       #20  <Field char[] CA>
	//  245  386:iload_3         
	//  246  387:bipush          6
	//  247  389:iushr           
	//  248  390:bipush          63
	//  249  392:iand            
	//  250  393:caload          
	//  251  394:castore         
			char c;
			if(l == 2)
	//* 252  395:iload           4
	//* 253  397:iconst_2        
	//* 254  398:icmpne          413
				c = CA[k & 0x3f];
	//  255  401:getstatic       #20  <Field char[] CA>
	//  256  404:iload_3         
	//  257  405:bipush          63
	//  258  407:iand            
	//  259  408:caload          
	//  260  409:istore_2        
			else
	//* 261  410:goto            416
				c = '=';
	//  262  413:bipush          61
	//  263  415:istore_2        
			ac[j2 - 2] = c;
	//  264  416:aload           14
	//  265  418:iload           11
	//  266  420:iconst_2        
	//  267  421:isub            
	//  268  422:iload_2         
	//  269  423:castore         
			ac[j2 - 1] = '=';
	//  270  424:aload           14
	//  271  426:iload           11
	//  272  428:iconst_1        
	//  273  429:isub            
	//  274  430:bipush          61
	//  275  432:castore         
		}
		return ac;
	//  276  433:aload           14
	//  277  435:areturn         
	}

	public static final String encodeToString(byte abyte0[], boolean flag)
	{
		return new String(encodeToChar(abyte0, flag));
	//    0    0:new             #14  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokestatic    #71  <Method char[] encodeToChar(byte[], boolean)>
	//    5    9:invokespecial   #74  <Method void String(char[])>
	//    6   12:areturn         
	}

	private static final char CA[];
	private static final int IA[];

	static 
	{
		CA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
	//    0    0:ldc1            #12  <String "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/">
	//    1    2:invokevirtual   #18  <Method char[] String.toCharArray()>
	//    2    5:putstatic       #20  <Field char[] CA>
		IA = new int[256];
	//    3    8:sipush          256
	//    4   11:newarray        int[]
	//    5   13:putstatic       #22  <Field int[] IA>
		Arrays.fill(IA, -1);
	//    6   16:getstatic       #22  <Field int[] IA>
	//    7   19:iconst_m1       
	//    8   20:invokestatic    #28  <Method void Arrays.fill(int[], int)>
		int j = CA.length;
	//    9   23:getstatic       #20  <Field char[] CA>
	//   10   26:arraylength     
	//   11   27:istore_1        
		for(int i = 0; i < j; i++)
	//*  12   28:iconst_0        
	//*  13   29:istore_0        
	//*  14   30:iload_0         
	//*  15   31:iload_1         
	//*  16   32:icmpge          52
			IA[CA[i]] = i;
	//   17   35:getstatic       #22  <Field int[] IA>
	//   18   38:getstatic       #20  <Field char[] CA>
	//   19   41:iload_0         
	//   20   42:caload          
	//   21   43:iload_0         
	//   22   44:iastore         

	//   23   45:iload_0         
	//   24   46:iconst_1        
	//   25   47:iadd            
	//   26   48:istore_0        
	//*  27   49:goto            30
		IA[61] = 0;
	//   28   52:getstatic       #22  <Field int[] IA>
	//   29   55:bipush          61
	//   30   57:iconst_0        
	//   31   58:iastore         
	//*  32   59:return          
	}
}
