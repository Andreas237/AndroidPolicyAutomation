// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.tubesock;

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
		int k = 0;
	//   13   22:iconst_0        
	//   14   23:istore_2        
		int i1;
		int j1;
		for(i1 = 0; k < i; i1 = j1)
	//*  15   24:iconst_0        
	//*  16   25:istore_3        
	//*  17   26:iload_2         
	//*  18   27:iload_1         
	//*  19   28:icmpge          61
		{
			j1 = i1;
	//   20   31:iload_3         
	//   21   32:istore          4
			if(IA[s.charAt(k)] < 0)
	//*  22   34:getstatic       #22  <Field int[] IA>
	//*  23   37:aload_0         
	//*  24   38:iload_2         
	//*  25   39:invokevirtual   #42  <Method char String.charAt(int)>
	//*  26   42:iaload          
	//*  27   43:ifge            51
				j1 = i1 + 1;
	//   28   46:iload_3         
	//   29   47:iconst_1        
	//   30   48:iadd            
	//   31   49:istore          4
			k++;
	//   32   51:iload_2         
	//   33   52:iconst_1        
	//   34   53:iadd            
	//   35   54:istore_2        
		}

	//   36   55:iload           4
	//   37   57:istore_3        
	//*  38   58:goto            26
		int k1 = i - i1;
	//   39   61:iload_1         
	//   40   62:iload_3         
	//   41   63:isub            
	//   42   64:istore          4
		if(k1 % 4 != 0)
	//*  43   66:iload           4
	//*  44   68:iconst_4        
	//*  45   69:irem            
	//*  46   70:ifeq            75
			return null;
	//   47   73:aconst_null     
	//   48   74:areturn         
		k = 0;
	//   49   75:iconst_0        
	//   50   76:istore_2        
		do
		{
			if(i <= 1)
				break;
	//   51   77:iload_1         
	//   52   78:iconst_1        
	//   53   79:icmple          123
			int ai[] = IA;
	//   54   82:getstatic       #22  <Field int[] IA>
	//   55   85:astore          7
			i1 = i - 1;
	//   56   87:iload_1         
	//   57   88:iconst_1        
	//   58   89:isub            
	//   59   90:istore_3        
			if(ai[s.charAt(i1)] > 0)
				break;
	//   60   91:aload           7
	//   61   93:aload_0         
	//   62   94:iload_3         
	//   63   95:invokevirtual   #42  <Method char String.charAt(int)>
	//   64   98:iaload          
	//   65   99:ifgt            123
			i = i1;
	//   66  102:iload_3         
	//   67  103:istore_1        
			if(s.charAt(i1) == '=')
	//*  68  104:aload_0         
	//*  69  105:iload_3         
	//*  70  106:invokevirtual   #42  <Method char String.charAt(int)>
	//*  71  109:bipush          61
	//*  72  111:icmpne          77
			{
				k++;
	//   73  114:iload_2         
	//   74  115:iconst_1        
	//   75  116:iadd            
	//   76  117:istore_2        
				i = i1;
	//   77  118:iload_3         
	//   78  119:istore_1        
			}
		} while(true);
	//   79  120:goto            77
		int j2 = (k1 * 6 >> 3) - k;
	//   80  123:iload           4
	//   81  125:bipush          6
	//   82  127:imul            
	//   83  128:iconst_3        
	//   84  129:ishr            
	//   85  130:iload_2         
	//   86  131:isub            
	//   87  132:istore          6
		byte abyte0[] = new byte[j2];
	//   88  134:iload           6
	//   89  136:newarray        byte[]
	//   90  138:astore          7
		i1 = 0;
	//   91  140:iconst_0        
	//   92  141:istore_3        
		int l;
		for(int j = 0; i1 < j2; j = l)
	//*  93  142:iconst_0        
	//*  94  143:istore_1        
	//*  95  144:iload_3         
	//*  96  145:iload           6
	//*  97  147:icmpge          278
		{
			boolean flag = false;
	//   98  150:iconst_0        
	//   99  151:istore          5
			int l1 = 0;
	//  100  153:iconst_0        
	//  101  154:istore          4
			l = j;
	//  102  156:iload_1         
	//  103  157:istore_2        
			for(j = ((int) (flag)); j < 4;)
	//* 104  158:iload           5
	//* 105  160:istore_1        
	//* 106  161:iload_1         
	//* 107  162:iconst_4        
	//* 108  163:icmpge          215
			{
				int i2 = IA[s.charAt(l)];
	//  109  166:getstatic       #22  <Field int[] IA>
	//  110  169:aload_0         
	//  111  170:iload_2         
	//  112  171:invokevirtual   #42  <Method char String.charAt(int)>
	//  113  174:iaload          
	//  114  175:istore          5
				if(i2 >= 0)
	//* 115  177:iload           5
	//* 116  179:iflt            200
					l1 |= i2 << 18 - j * 6;
	//  117  182:iload           4
	//  118  184:iload           5
	//  119  186:bipush          18
	//  120  188:iload_1         
	//  121  189:bipush          6
	//  122  191:imul            
	//  123  192:isub            
	//  124  193:ishl            
	//  125  194:ior             
	//  126  195:istore          4
				else
	//* 127  197:goto            204
					j--;
	//  128  200:iload_1         
	//  129  201:iconst_1        
	//  130  202:isub            
	//  131  203:istore_1        
				j++;
	//  132  204:iload_1         
	//  133  205:iconst_1        
	//  134  206:iadd            
	//  135  207:istore_1        
				l++;
	//  136  208:iload_2         
	//  137  209:iconst_1        
	//  138  210:iadd            
	//  139  211:istore_2        
			}

	//* 140  212:goto            161
			j = i1 + 1;
	//  141  215:iload_3         
	//  142  216:iconst_1        
	//  143  217:iadd            
	//  144  218:istore_1        
			abyte0[i1] = (byte)(l1 >> 16);
	//  145  219:aload           7
	//  146  221:iload_3         
	//  147  222:iload           4
	//  148  224:bipush          16
	//  149  226:ishr            
	//  150  227:int2byte        
	//  151  228:bastore         
			if(j < j2)
	//* 152  229:iload_1         
	//* 153  230:iload           6
	//* 154  232:icmpge          271
			{
				i1 = j + 1;
	//  155  235:iload_1         
	//  156  236:iconst_1        
	//  157  237:iadd            
	//  158  238:istore_3        
				abyte0[j] = (byte)(l1 >> 8);
	//  159  239:aload           7
	//  160  241:iload_1         
	//  161  242:iload           4
	//  162  244:bipush          8
	//  163  246:ishr            
	//  164  247:int2byte        
	//  165  248:bastore         
				j = i1;
	//  166  249:iload_3         
	//  167  250:istore_1        
				if(i1 < j2)
	//* 168  251:iload_3         
	//* 169  252:iload           6
	//* 170  254:icmpge          271
				{
					abyte0[i1] = (byte)l1;
	//  171  257:aload           7
	//  172  259:iload_3         
	//  173  260:iload           4
	//  174  262:int2byte        
	//  175  263:bastore         
					j = i1 + 1;
	//  176  264:iload_3         
	//  177  265:iconst_1        
	//  178  266:iadd            
	//  179  267:istore_1        
				}
			}
	//* 180  268:goto            271
			i1 = j;
	//  181  271:iload_1         
	//  182  272:istore_3        
		}

	//  183  273:iload_2         
	//  184  274:istore_1        
	//* 185  275:goto            144
		return abyte0;
	//  186  278:aload           7
	//  187  280:areturn         
	}

	public static final byte[] decode(byte abyte0[])
	{
		int l1 = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore          4
		int i = 0;
	//    3    4:iconst_0        
	//    4    5:istore_1        
		int k;
		int i1;
		for(k = 0; i < l1; k = i1)
	//*   5    6:iconst_0        
	//*   6    7:istore_2        
	//*   7    8:iload_1         
	//*   8    9:iload           4
	//*   9   11:icmpge          43
		{
			i1 = k;
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
				i1 = k + 1;
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
		int j2 = l1 - k;
	//   31   43:iload           4
	//   32   45:iload_2         
	//   33   46:isub            
	//   34   47:istore          5
		if(j2 % 4 != 0)
	//*  35   49:iload           5
	//*  36   51:iconst_4        
	//*  37   52:irem            
	//*  38   53:ifeq            58
			return null;
	//   39   56:aconst_null     
	//   40   57:areturn         
		k = 0;
	//   41   58:iconst_0        
	//   42   59:istore_2        
		i = l1;
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
			int j1 = i - 1;
	//   50   73:iload_1         
	//   51   74:iconst_1        
	//   52   75:isub            
	//   53   76:istore_3        
			if(ai[abyte0[j1] & 0xff] > 0)
				break;
	//   54   77:aload           7
	//   55   79:aload_0         
	//   56   80:iload_3         
	//   57   81:baload          
	//   58   82:sipush          255
	//   59   85:iand            
	//   60   86:iaload          
	//   61   87:ifgt            109
			i = j1;
	//   62   90:iload_3         
	//   63   91:istore_1        
			if(abyte0[j1] == 61)
	//*  64   92:aload_0         
	//*  65   93:iload_3         
	//*  66   94:baload          
	//*  67   95:bipush          61
	//*  68   97:icmpne          63
			{
				k++;
	//   69  100:iload_2         
	//   70  101:iconst_1        
	//   71  102:iadd            
	//   72  103:istore_2        
				i = j1;
	//   73  104:iload_3         
	//   74  105:istore_1        
			}
		} while(true);
	//   75  106:goto            63
		int l2 = (j2 * 6 >> 3) - k;
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
		int k1 = 0;
	//   87  126:iconst_0        
	//   88  127:istore_3        
		int l;
		for(int j = 0; k1 < l2; j = l)
	//*  89  128:iconst_0        
	//*  90  129:istore_1        
	//*  91  130:iload_3         
	//*  92  131:iload           6
	//*  93  133:icmpge          266
		{
			boolean flag = false;
	//   94  136:iconst_0        
	//   95  137:istore          5
			int i2 = 0;
	//   96  139:iconst_0        
	//   97  140:istore          4
			l = j;
	//   98  142:iload_1         
	//   99  143:istore_2        
			for(j = ((int) (flag)); j < 4;)
	//* 100  144:iload           5
	//* 101  146:istore_1        
	//* 102  147:iload_1         
	//* 103  148:iconst_4        
	//* 104  149:icmpge          203
			{
				int k2 = IA[abyte0[l] & 0xff];
	//  105  152:getstatic       #22  <Field int[] IA>
	//  106  155:aload_0         
	//  107  156:iload_2         
	//  108  157:baload          
	//  109  158:sipush          255
	//  110  161:iand            
	//  111  162:iaload          
	//  112  163:istore          5
				if(k2 >= 0)
	//* 113  165:iload           5
	//* 114  167:iflt            188
					i2 |= k2 << 18 - j * 6;
	//  115  170:iload           4
	//  116  172:iload           5
	//  117  174:bipush          18
	//  118  176:iload_1         
	//  119  177:bipush          6
	//  120  179:imul            
	//  121  180:isub            
	//  122  181:ishl            
	//  123  182:ior             
	//  124  183:istore          4
				else
	//* 125  185:goto            192
					j--;
	//  126  188:iload_1         
	//  127  189:iconst_1        
	//  128  190:isub            
	//  129  191:istore_1        
				j++;
	//  130  192:iload_1         
	//  131  193:iconst_1        
	//  132  194:iadd            
	//  133  195:istore_1        
				l++;
	//  134  196:iload_2         
	//  135  197:iconst_1        
	//  136  198:iadd            
	//  137  199:istore_2        
			}

	//* 138  200:goto            147
			j = k1 + 1;
	//  139  203:iload_3         
	//  140  204:iconst_1        
	//  141  205:iadd            
	//  142  206:istore_1        
			abyte1[k1] = (byte)(i2 >> 16);
	//  143  207:aload           7
	//  144  209:iload_3         
	//  145  210:iload           4
	//  146  212:bipush          16
	//  147  214:ishr            
	//  148  215:int2byte        
	//  149  216:bastore         
			if(j < l2)
	//* 150  217:iload_1         
	//* 151  218:iload           6
	//* 152  220:icmpge          259
			{
				k1 = j + 1;
	//  153  223:iload_1         
	//  154  224:iconst_1        
	//  155  225:iadd            
	//  156  226:istore_3        
				abyte1[j] = (byte)(i2 >> 8);
	//  157  227:aload           7
	//  158  229:iload_1         
	//  159  230:iload           4
	//  160  232:bipush          8
	//  161  234:ishr            
	//  162  235:int2byte        
	//  163  236:bastore         
				j = k1;
	//  164  237:iload_3         
	//  165  238:istore_1        
				if(k1 < l2)
	//* 166  239:iload_3         
	//* 167  240:iload           6
	//* 168  242:icmpge          259
				{
					abyte1[k1] = (byte)i2;
	//  169  245:aload           7
	//  170  247:iload_3         
	//  171  248:iload           4
	//  172  250:int2byte        
	//  173  251:bastore         
					j = k1 + 1;
	//  174  252:iload_3         
	//  175  253:iconst_1        
	//  176  254:iadd            
	//  177  255:istore_1        
				}
			}
	//* 178  256:goto            259
			k1 = j;
	//  179  259:iload_1         
	//  180  260:istore_3        
		}

	//  181  261:iload_2         
	//  182  262:istore_1        
	//* 183  263:goto            130
		return abyte1;
	//  184  266:aload           7
	//  185  268:areturn         
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
		int k = 0;
	//   13   20:iconst_0        
	//   14   21:istore_2        
		int i1;
		int j1;
		for(i1 = 0; k < i; i1 = j1)
	//*  15   22:iconst_0        
	//*  16   23:istore_3        
	//*  17   24:iload_2         
	//*  18   25:iload_1         
	//*  19   26:icmpge          57
		{
			j1 = i1;
	//   20   29:iload_3         
	//   21   30:istore          4
			if(IA[ac[k]] < 0)
	//*  22   32:getstatic       #22  <Field int[] IA>
	//*  23   35:aload_0         
	//*  24   36:iload_2         
	//*  25   37:caload          
	//*  26   38:iaload          
	//*  27   39:ifge            47
				j1 = i1 + 1;
	//   28   42:iload_3         
	//   29   43:iconst_1        
	//   30   44:iadd            
	//   31   45:istore          4
			k++;
	//   32   47:iload_2         
	//   33   48:iconst_1        
	//   34   49:iadd            
	//   35   50:istore_2        
		}

	//   36   51:iload           4
	//   37   53:istore_3        
	//*  38   54:goto            24
		int k1 = i - i1;
	//   39   57:iload_1         
	//   40   58:iload_3         
	//   41   59:isub            
	//   42   60:istore          4
		if(k1 % 4 != 0)
	//*  43   62:iload           4
	//*  44   64:iconst_4        
	//*  45   65:irem            
	//*  46   66:ifeq            71
			return null;
	//   47   69:aconst_null     
	//   48   70:areturn         
		k = 0;
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
			i1 = i - 1;
	//   56   83:iload_1         
	//   57   84:iconst_1        
	//   58   85:isub            
	//   59   86:istore_3        
			if(ai[ac[i1]] > 0)
				break;
	//   60   87:aload           7
	//   61   89:aload_0         
	//   62   90:iload_3         
	//   63   91:caload          
	//   64   92:iaload          
	//   65   93:ifgt            115
			i = i1;
	//   66   96:iload_3         
	//   67   97:istore_1        
			if(ac[i1] == '=')
	//*  68   98:aload_0         
	//*  69   99:iload_3         
	//*  70  100:caload          
	//*  71  101:bipush          61
	//*  72  103:icmpne          73
			{
				k++;
	//   73  106:iload_2         
	//   74  107:iconst_1        
	//   75  108:iadd            
	//   76  109:istore_2        
				i = i1;
	//   77  110:iload_3         
	//   78  111:istore_1        
			}
		} while(true);
	//   79  112:goto            73
		int j2 = (k1 * 6 >> 3) - k;
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
		i1 = 0;
	//   91  132:iconst_0        
	//   92  133:istore_3        
		int l;
		for(int j = 0; i1 < j2; j = l)
	//*  93  134:iconst_0        
	//*  94  135:istore_1        
	//*  95  136:iload_3         
	//*  96  137:iload           6
	//*  97  139:icmpge          268
		{
			boolean flag = false;
	//   98  142:iconst_0        
	//   99  143:istore          5
			int l1 = 0;
	//  100  145:iconst_0        
	//  101  146:istore          4
			l = j;
	//  102  148:iload_1         
	//  103  149:istore_2        
			for(j = ((int) (flag)); j < 4;)
	//* 104  150:iload           5
	//* 105  152:istore_1        
	//* 106  153:iload_1         
	//* 107  154:iconst_4        
	//* 108  155:icmpge          205
			{
				int i2 = IA[ac[l]];
	//  109  158:getstatic       #22  <Field int[] IA>
	//  110  161:aload_0         
	//  111  162:iload_2         
	//  112  163:caload          
	//  113  164:iaload          
	//  114  165:istore          5
				if(i2 >= 0)
	//* 115  167:iload           5
	//* 116  169:iflt            190
					l1 |= i2 << 18 - j * 6;
	//  117  172:iload           4
	//  118  174:iload           5
	//  119  176:bipush          18
	//  120  178:iload_1         
	//  121  179:bipush          6
	//  122  181:imul            
	//  123  182:isub            
	//  124  183:ishl            
	//  125  184:ior             
	//  126  185:istore          4
				else
	//* 127  187:goto            194
					j--;
	//  128  190:iload_1         
	//  129  191:iconst_1        
	//  130  192:isub            
	//  131  193:istore_1        
				j++;
	//  132  194:iload_1         
	//  133  195:iconst_1        
	//  134  196:iadd            
	//  135  197:istore_1        
				l++;
	//  136  198:iload_2         
	//  137  199:iconst_1        
	//  138  200:iadd            
	//  139  201:istore_2        
			}

	//* 140  202:goto            153
			j = i1 + 1;
	//  141  205:iload_3         
	//  142  206:iconst_1        
	//  143  207:iadd            
	//  144  208:istore_1        
			abyte0[i1] = (byte)(l1 >> 16);
	//  145  209:aload           7
	//  146  211:iload_3         
	//  147  212:iload           4
	//  148  214:bipush          16
	//  149  216:ishr            
	//  150  217:int2byte        
	//  151  218:bastore         
			if(j < j2)
	//* 152  219:iload_1         
	//* 153  220:iload           6
	//* 154  222:icmpge          261
			{
				i1 = j + 1;
	//  155  225:iload_1         
	//  156  226:iconst_1        
	//  157  227:iadd            
	//  158  228:istore_3        
				abyte0[j] = (byte)(l1 >> 8);
	//  159  229:aload           7
	//  160  231:iload_1         
	//  161  232:iload           4
	//  162  234:bipush          8
	//  163  236:ishr            
	//  164  237:int2byte        
	//  165  238:bastore         
				j = i1;
	//  166  239:iload_3         
	//  167  240:istore_1        
				if(i1 < j2)
	//* 168  241:iload_3         
	//* 169  242:iload           6
	//* 170  244:icmpge          261
				{
					abyte0[i1] = (byte)l1;
	//  171  247:aload           7
	//  172  249:iload_3         
	//  173  250:iload           4
	//  174  252:int2byte        
	//  175  253:bastore         
					j = i1 + 1;
	//  176  254:iload_3         
	//  177  255:iconst_1        
	//  178  256:iadd            
	//  179  257:istore_1        
				}
			}
	//* 180  258:goto            261
			i1 = j;
	//  181  261:iload_1         
	//  182  262:istore_3        
		}

	//  183  263:iload_2         
	//  184  264:istore_1        
	//* 185  265:goto            136
		return abyte0;
	//  186  268:aload           7
	//  187  270:areturn         
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
	//* 128  200:icmpge          366
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
			i1 = l2 + 1;
	//  141  223:iload           11
	//  142  225:iconst_1        
	//  143  226:iadd            
	//  144  227:istore          4
			l2 = ai[abyte0[l2]];
	//  145  229:aload           15
	//  146  231:aload_0         
	//  147  232:iload           11
	//  148  234:baload          
	//  149  235:iaload          
	//  150  236:istore          11
			int i3 = i1 + 1;
	//  151  238:iload           4
	//  152  240:iconst_1        
	//  153  241:iadd            
	//  154  242:istore          12
			int j3 = ai[abyte0[i1]];
	//  155  244:aload           15
	//  156  246:aload_0         
	//  157  247:iload           4
	//  158  249:baload          
	//  159  250:iaload          
	//  160  251:istore          13
			i1 = i3 + 1;
	//  161  253:iload           12
	//  162  255:iconst_1        
	//  163  256:iadd            
	//  164  257:istore          4
			l2 = i2 << 18 | l2 << 12 | j3 << 6 | ai[abyte0[i3]];
	//  165  259:iload           8
	//  166  261:bipush          18
	//  167  263:ishl            
	//  168  264:iload           11
	//  169  266:bipush          12
	//  170  268:ishl            
	//  171  269:ior             
	//  172  270:iload           13
	//  173  272:bipush          6
	//  174  274:ishl            
	//  175  275:ior             
	//  176  276:aload           15
	//  177  278:aload_0         
	//  178  279:iload           12
	//  179  281:baload          
	//  180  282:iaload          
	//  181  283:ior             
	//  182  284:istore          11
			i3 = j + 1;
	//  183  286:iload_2         
	//  184  287:iconst_1        
	//  185  288:iadd            
	//  186  289:istore          12
			abyte1[j] = (byte)(l2 >> 16);
	//  187  291:aload           14
	//  188  293:iload_2         
	//  189  294:iload           11
	//  190  296:bipush          16
	//  191  298:ishr            
	//  192  299:int2byte        
	//  193  300:bastore         
			i2 = i3 + 1;
	//  194  301:iload           12
	//  195  303:iconst_1        
	//  196  304:iadd            
	//  197  305:istore          8
			abyte1[i3] = (byte)(l2 >> 8);
	//  198  307:aload           14
	//  199  309:iload           12
	//  200  311:iload           11
	//  201  313:bipush          8
	//  202  315:ishr            
	//  203  316:int2byte        
	//  204  317:bastore         
			abyte1[i2] = (byte)l2;
	//  205  318:aload           14
	//  206  320:iload           8
	//  207  322:iload           11
	//  208  324:int2byte        
	//  209  325:bastore         
			j = k;
	//  210  326:iload_3         
	//  211  327:istore_2        
			if(k1 > 0)
	//* 212  328:iload           6
	//* 213  330:ifle            356
			{
				k++;
	//  214  333:iload_3         
	//  215  334:iconst_1        
	//  216  335:iadd            
	//  217  336:istore_3        
				j = k;
	//  218  337:iload_3         
	//  219  338:istore_2        
				if(k == 19)
	//* 220  339:iload_3         
	//* 221  340:bipush          19
	//* 222  342:icmpne          356
				{
					i1 += 2;
	//  223  345:iload           4
	//  224  347:iconst_2        
	//  225  348:iadd            
	//  226  349:istore          4
					k = 0;
	//  227  351:iconst_0        
	//  228  352:istore_3        
					continue;
	//  229  353:goto            358
				}
			}
			k = j;
	//  230  356:iload_2         
	//  231  357:istore_3        
		}

	//  232  358:iload           8
	//  233  360:iconst_1        
	//  234  361:iadd            
	//  235  362:istore_2        
	//* 236  363:goto            195
		if(j < j2)
	//* 237  366:iload_2         
	//* 238  367:iload           9
	//* 239  369:icmpge          451
		{
			int l1 = 0;
	//  240  372:iconst_0        
	//  241  373:istore          6
			int l = ((int) (flag));
	//  242  375:iload           7
	//  243  377:istore_3        
			for(; i1 <= j1 - i; i1++)
	//* 244  378:iload           4
	//* 245  380:iload           5
	//* 246  382:iload_1         
	//* 247  383:isub            
	//* 248  384:icmpgt          422
			{
				l |= IA[abyte0[i1]] << 18 - l1 * 6;
	//  249  387:iload_3         
	//  250  388:getstatic       #22  <Field int[] IA>
	//  251  391:aload_0         
	//  252  392:iload           4
	//  253  394:baload          
	//  254  395:iaload          
	//  255  396:bipush          18
	//  256  398:iload           6
	//  257  400:bipush          6
	//  258  402:imul            
	//  259  403:isub            
	//  260  404:ishl            
	//  261  405:ior             
	//  262  406:istore_3        
				l1++;
	//  263  407:iload           6
	//  264  409:iconst_1        
	//  265  410:iadd            
	//  266  411:istore          6
			}

	//  267  413:iload           4
	//  268  415:iconst_1        
	//  269  416:iadd            
	//  270  417:istore          4
	//* 271  419:goto            378
			i = 16;
	//  272  422:bipush          16
	//  273  424:istore_1        
			for(; j < j2; j++)
	//* 274  425:iload_2         
	//* 275  426:iload           9
	//* 276  428:icmpge          451
			{
				abyte1[j] = (byte)(l >> i);
	//  277  431:aload           14
	//  278  433:iload_2         
	//  279  434:iload_3         
	//  280  435:iload_1         
	//  281  436:ishr            
	//  282  437:int2byte        
	//  283  438:bastore         
				i -= 8;
	//  284  439:iload_1         
	//  285  440:bipush          8
	//  286  442:isub            
	//  287  443:istore_1        
			}

	//  288  444:iload_2         
	//  289  445:iconst_1        
	//  290  446:iadd            
	//  291  447:istore_2        
		}
	//* 292  448:goto            425
		return abyte1;
	//  293  451:aload           14
	//  294  453:areturn         
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
	//* 124  192:icmpge          358
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
			i1 = l2 + 1;
	//  137  215:iload           11
	//  138  217:iconst_1        
	//  139  218:iadd            
	//  140  219:istore          4
			l2 = ai[ac[l2]];
	//  141  221:aload           15
	//  142  223:aload_0         
	//  143  224:iload           11
	//  144  226:caload          
	//  145  227:iaload          
	//  146  228:istore          11
			int i3 = i1 + 1;
	//  147  230:iload           4
	//  148  232:iconst_1        
	//  149  233:iadd            
	//  150  234:istore          12
			int j3 = ai[ac[i1]];
	//  151  236:aload           15
	//  152  238:aload_0         
	//  153  239:iload           4
	//  154  241:caload          
	//  155  242:iaload          
	//  156  243:istore          13
			i1 = i3 + 1;
	//  157  245:iload           12
	//  158  247:iconst_1        
	//  159  248:iadd            
	//  160  249:istore          4
			l2 = i2 << 18 | l2 << 12 | j3 << 6 | ai[ac[i3]];
	//  161  251:iload           8
	//  162  253:bipush          18
	//  163  255:ishl            
	//  164  256:iload           11
	//  165  258:bipush          12
	//  166  260:ishl            
	//  167  261:ior             
	//  168  262:iload           13
	//  169  264:bipush          6
	//  170  266:ishl            
	//  171  267:ior             
	//  172  268:aload           15
	//  173  270:aload_0         
	//  174  271:iload           12
	//  175  273:caload          
	//  176  274:iaload          
	//  177  275:ior             
	//  178  276:istore          11
			i3 = j + 1;
	//  179  278:iload_2         
	//  180  279:iconst_1        
	//  181  280:iadd            
	//  182  281:istore          12
			abyte0[j] = (byte)(l2 >> 16);
	//  183  283:aload           14
	//  184  285:iload_2         
	//  185  286:iload           11
	//  186  288:bipush          16
	//  187  290:ishr            
	//  188  291:int2byte        
	//  189  292:bastore         
			i2 = i3 + 1;
	//  190  293:iload           12
	//  191  295:iconst_1        
	//  192  296:iadd            
	//  193  297:istore          8
			abyte0[i3] = (byte)(l2 >> 8);
	//  194  299:aload           14
	//  195  301:iload           12
	//  196  303:iload           11
	//  197  305:bipush          8
	//  198  307:ishr            
	//  199  308:int2byte        
	//  200  309:bastore         
			abyte0[i2] = (byte)l2;
	//  201  310:aload           14
	//  202  312:iload           8
	//  203  314:iload           11
	//  204  316:int2byte        
	//  205  317:bastore         
			j = k;
	//  206  318:iload_3         
	//  207  319:istore_2        
			if(k1 > 0)
	//* 208  320:iload           6
	//* 209  322:ifle            348
			{
				k++;
	//  210  325:iload_3         
	//  211  326:iconst_1        
	//  212  327:iadd            
	//  213  328:istore_3        
				j = k;
	//  214  329:iload_3         
	//  215  330:istore_2        
				if(k == 19)
	//* 216  331:iload_3         
	//* 217  332:bipush          19
	//* 218  334:icmpne          348
				{
					i1 += 2;
	//  219  337:iload           4
	//  220  339:iconst_2        
	//  221  340:iadd            
	//  222  341:istore          4
					k = 0;
	//  223  343:iconst_0        
	//  224  344:istore_3        
					continue;
	//  225  345:goto            350
				}
			}
			k = j;
	//  226  348:iload_2         
	//  227  349:istore_3        
		}

	//  228  350:iload           8
	//  229  352:iconst_1        
	//  230  353:iadd            
	//  231  354:istore_2        
	//* 232  355:goto            187
		if(j < j2)
	//* 233  358:iload_2         
	//* 234  359:iload           9
	//* 235  361:icmpge          443
		{
			int l1 = 0;
	//  236  364:iconst_0        
	//  237  365:istore          6
			int l = ((int) (flag));
	//  238  367:iload           7
	//  239  369:istore_3        
			for(; i1 <= j1 - i; i1++)
	//* 240  370:iload           4
	//* 241  372:iload           5
	//* 242  374:iload_1         
	//* 243  375:isub            
	//* 244  376:icmpgt          414
			{
				l |= IA[ac[i1]] << 18 - l1 * 6;
	//  245  379:iload_3         
	//  246  380:getstatic       #22  <Field int[] IA>
	//  247  383:aload_0         
	//  248  384:iload           4
	//  249  386:caload          
	//  250  387:iaload          
	//  251  388:bipush          18
	//  252  390:iload           6
	//  253  392:bipush          6
	//  254  394:imul            
	//  255  395:isub            
	//  256  396:ishl            
	//  257  397:ior             
	//  258  398:istore_3        
				l1++;
	//  259  399:iload           6
	//  260  401:iconst_1        
	//  261  402:iadd            
	//  262  403:istore          6
			}

	//  263  405:iload           4
	//  264  407:iconst_1        
	//  265  408:iadd            
	//  266  409:istore          4
	//* 267  411:goto            370
			i = 16;
	//  268  414:bipush          16
	//  269  416:istore_1        
			for(; j < j2; j++)
	//* 270  417:iload_2         
	//* 271  418:iload           9
	//* 272  420:icmpge          443
			{
				abyte0[j] = (byte)(l >> i);
	//  273  423:aload           14
	//  274  425:iload_2         
	//  275  426:iload_3         
	//  276  427:iload_1         
	//  277  428:ishr            
	//  278  429:int2byte        
	//  279  430:bastore         
				i -= 8;
	//  280  431:iload_1         
	//  281  432:bipush          8
	//  282  434:isub            
	//  283  435:istore_1        
			}

	//  284  436:iload_2         
	//  285  437:iconst_1        
	//  286  438:iadd            
	//  287  439:istore_2        
		}
	//* 288  440:goto            417
		return abyte0;
	//  289  443:aload           14
	//  290  445:areturn         
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
	//*  61   94:icmpge          317
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
			char ac[] = CA;
	//   98  149:getstatic       #20  <Field char[] CA>
	//   99  152:astore          15
			abyte1[l] = (byte)ac[j >>> 18 & 0x3f];
	//  100  154:aload           14
	//  101  156:iload           4
	//  102  158:aload           15
	//  103  160:iload_3         
	//  104  161:bipush          18
	//  105  163:iushr           
	//  106  164:bipush          63
	//  107  166:iand            
	//  108  167:caload          
	//  109  168:int2byte        
	//  110  169:bastore         
			l = k1 + 1;
	//  111  170:iload           7
	//  112  172:iconst_1        
	//  113  173:iadd            
	//  114  174:istore          4
			abyte1[k1] = (byte)ac[j >>> 12 & 0x3f];
	//  115  176:aload           14
	//  116  178:iload           7
	//  117  180:aload           15
	//  118  182:iload_3         
	//  119  183:bipush          12
	//  120  185:iushr           
	//  121  186:bipush          63
	//  122  188:iand            
	//  123  189:caload          
	//  124  190:int2byte        
	//  125  191:bastore         
			int l2 = l + 1;
	//  126  192:iload           4
	//  127  194:iconst_1        
	//  128  195:iadd            
	//  129  196:istore          13
			abyte1[l] = (byte)ac[j >>> 6 & 0x3f];
	//  130  198:aload           14
	//  131  200:iload           4
	//  132  202:aload           15
	//  133  204:iload_3         
	//  134  205:bipush          6
	//  135  207:iushr           
	//  136  208:bipush          63
	//  137  210:iand            
	//  138  211:caload          
	//  139  212:int2byte        
	//  140  213:bastore         
			k1 = l2 + 1;
	//  141  214:iload           13
	//  142  216:iconst_1        
	//  143  217:iadd            
	//  144  218:istore          7
			abyte1[l2] = (byte)ac[j & 0x3f];
	//  145  220:aload           14
	//  146  222:iload           13
	//  147  224:aload           15
	//  148  226:iload_3         
	//  149  227:bipush          63
	//  150  229:iand            
	//  151  230:caload          
	//  152  231:int2byte        
	//  153  232:bastore         
			l = k1;
	//  154  233:iload           7
	//  155  235:istore          4
			j = j1;
	//  156  237:iload           6
	//  157  239:istore_3        
			if(flag)
	//* 158  240:iload_1         
	//* 159  241:ifeq            305
			{
				j1++;
	//  160  244:iload           6
	//  161  246:iconst_1        
	//  162  247:iadd            
	//  163  248:istore          6
				l = k1;
	//  164  250:iload           7
	//  165  252:istore          4
				j = j1;
	//  166  254:iload           6
	//  167  256:istore_3        
				if(j1 == 19)
	//* 168  257:iload           6
	//* 169  259:bipush          19
	//* 170  261:icmpne          305
				{
					l = k1;
	//  171  264:iload           7
	//  172  266:istore          4
					j = j1;
	//  173  268:iload           6
	//  174  270:istore_3        
					if(k1 < j2 - 2)
	//* 175  271:iload           7
	//* 176  273:iload           11
	//* 177  275:iconst_2        
	//* 178  276:isub            
	//* 179  277:icmpge          305
					{
						j = k1 + 1;
	//  180  280:iload           7
	//  181  282:iconst_1        
	//  182  283:iadd            
	//  183  284:istore_3        
						abyte1[k1] = 13;
	//  184  285:aload           14
	//  185  287:iload           7
	//  186  289:bipush          13
	//  187  291:bastore         
						l = j + 1;
	//  188  292:iload_3         
	//  189  293:iconst_1        
	//  190  294:iadd            
	//  191  295:istore          4
						abyte1[j] = 10;
	//  192  297:aload           14
	//  193  299:iload_3         
	//  194  300:bipush          10
	//  195  302:bastore         
						j = 0;
	//  196  303:iconst_0        
	//  197  304:istore_3        
					}
				}
			}
			k1 = k2 + 1;
	//  198  305:iload           12
	//  199  307:iconst_1        
	//  200  308:iadd            
	//  201  309:istore          7
		}

	//  202  311:iload_3         
	//  203  312:istore          6
	//* 204  314:goto            90
		l = i1 - i2;
	//  205  317:iload           5
	//  206  319:iload           10
	//  207  321:isub            
	//  208  322:istore          4
		if(l > 0)
	//* 209  324:iload           4
	//* 210  326:ifle            439
		{
			byte byte1 = abyte0[i2];
	//  211  329:aload_0         
	//  212  330:iload           10
	//  213  332:baload          
	//  214  333:istore          5
			int k = ((int) (flag1));
	//  215  335:iload           8
	//  216  337:istore_3        
			if(l == 2)
	//* 217  338:iload           4
	//* 218  340:iconst_2        
	//* 219  341:icmpne          355
				k = (abyte0[l1] & 0xff) << 2;
	//  220  344:aload_0         
	//  221  345:iload           9
	//  222  347:baload          
	//  223  348:sipush          255
	//  224  351:iand            
	//  225  352:iconst_2        
	//  226  353:ishl            
	//  227  354:istore_3        
			k = (byte1 & 0xff) << 10 | k;
	//  228  355:iload           5
	//  229  357:sipush          255
	//  230  360:iand            
	//  231  361:bipush          10
	//  232  363:ishl            
	//  233  364:iload_3         
	//  234  365:ior             
	//  235  366:istore_3        
			abyte0 = ((byte []) (CA));
	//  236  367:getstatic       #20  <Field char[] CA>
	//  237  370:astore_0        
			abyte1[j2 - 4] = abyte0[k >> 12];
	//  238  371:aload           14
	//  239  373:iload           11
	//  240  375:iconst_4        
	//  241  376:isub            
	//  242  377:aload_0         
	//  243  378:iload_3         
	//  244  379:bipush          12
	//  245  381:ishr            
	//  246  382:caload          
	//  247  383:int2byte        
	//  248  384:bastore         
			abyte1[j2 - 3] = abyte0[k >>> 6 & 0x3f];
	//  249  385:aload           14
	//  250  387:iload           11
	//  251  389:iconst_3        
	//  252  390:isub            
	//  253  391:aload_0         
	//  254  392:iload_3         
	//  255  393:bipush          6
	//  256  395:iushr           
	//  257  396:bipush          63
	//  258  398:iand            
	//  259  399:caload          
	//  260  400:int2byte        
	//  261  401:bastore         
			byte byte0;
			if(l == 2)
	//* 262  402:iload           4
	//* 263  404:iconst_2        
	//* 264  405:icmpne          419
				byte0 = abyte0[k & 0x3f];
	//  265  408:aload_0         
	//  266  409:iload_3         
	//  267  410:bipush          63
	//  268  412:iand            
	//  269  413:caload          
	//  270  414:int2byte        
	//  271  415:istore_2        
			else
	//* 272  416:goto            422
				byte0 = 61;
	//  273  419:bipush          61
	//  274  421:istore_2        
			abyte1[j2 - 2] = byte0;
	//  275  422:aload           14
	//  276  424:iload           11
	//  277  426:iconst_2        
	//  278  427:isub            
	//  279  428:iload_2         
	//  280  429:bastore         
			abyte1[j2 - 1] = 61;
	//  281  430:aload           14
	//  282  432:iload           11
	//  283  434:iconst_1        
	//  284  435:isub            
	//  285  436:bipush          61
	//  286  438:bastore         
		}
		return abyte1;
	//  287  439:aload           14
	//  288  441:areturn         
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
	//*  61   94:icmpge          313
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
			char ac1[] = CA;
	//   98  149:getstatic       #20  <Field char[] CA>
	//   99  152:astore          15
			ac[l] = ac1[j >>> 18 & 0x3f];
	//  100  154:aload           14
	//  101  156:iload           4
	//  102  158:aload           15
	//  103  160:iload_3         
	//  104  161:bipush          18
	//  105  163:iushr           
	//  106  164:bipush          63
	//  107  166:iand            
	//  108  167:caload          
	//  109  168:castore         
			l = k1 + 1;
	//  110  169:iload           7
	//  111  171:iconst_1        
	//  112  172:iadd            
	//  113  173:istore          4
			ac[k1] = ac1[j >>> 12 & 0x3f];
	//  114  175:aload           14
	//  115  177:iload           7
	//  116  179:aload           15
	//  117  181:iload_3         
	//  118  182:bipush          12
	//  119  184:iushr           
	//  120  185:bipush          63
	//  121  187:iand            
	//  122  188:caload          
	//  123  189:castore         
			int l2 = l + 1;
	//  124  190:iload           4
	//  125  192:iconst_1        
	//  126  193:iadd            
	//  127  194:istore          13
			ac[l] = ac1[j >>> 6 & 0x3f];
	//  128  196:aload           14
	//  129  198:iload           4
	//  130  200:aload           15
	//  131  202:iload_3         
	//  132  203:bipush          6
	//  133  205:iushr           
	//  134  206:bipush          63
	//  135  208:iand            
	//  136  209:caload          
	//  137  210:castore         
			k1 = l2 + 1;
	//  138  211:iload           13
	//  139  213:iconst_1        
	//  140  214:iadd            
	//  141  215:istore          7
			ac[l2] = ac1[j & 0x3f];
	//  142  217:aload           14
	//  143  219:iload           13
	//  144  221:aload           15
	//  145  223:iload_3         
	//  146  224:bipush          63
	//  147  226:iand            
	//  148  227:caload          
	//  149  228:castore         
			l = k1;
	//  150  229:iload           7
	//  151  231:istore          4
			j = j1;
	//  152  233:iload           6
	//  153  235:istore_3        
			if(flag)
	//* 154  236:iload_1         
	//* 155  237:ifeq            301
			{
				j1++;
	//  156  240:iload           6
	//  157  242:iconst_1        
	//  158  243:iadd            
	//  159  244:istore          6
				l = k1;
	//  160  246:iload           7
	//  161  248:istore          4
				j = j1;
	//  162  250:iload           6
	//  163  252:istore_3        
				if(j1 == 19)
	//* 164  253:iload           6
	//* 165  255:bipush          19
	//* 166  257:icmpne          301
				{
					l = k1;
	//  167  260:iload           7
	//  168  262:istore          4
					j = j1;
	//  169  264:iload           6
	//  170  266:istore_3        
					if(k1 < j2 - 2)
	//* 171  267:iload           7
	//* 172  269:iload           11
	//* 173  271:iconst_2        
	//* 174  272:isub            
	//* 175  273:icmpge          301
					{
						j = k1 + 1;
	//  176  276:iload           7
	//  177  278:iconst_1        
	//  178  279:iadd            
	//  179  280:istore_3        
						ac[k1] = '\r';
	//  180  281:aload           14
	//  181  283:iload           7
	//  182  285:bipush          13
	//  183  287:castore         
						l = j + 1;
	//  184  288:iload_3         
	//  185  289:iconst_1        
	//  186  290:iadd            
	//  187  291:istore          4
						ac[j] = '\n';
	//  188  293:aload           14
	//  189  295:iload_3         
	//  190  296:bipush          10
	//  191  298:castore         
						j = 0;
	//  192  299:iconst_0        
	//  193  300:istore_3        
					}
				}
			}
			k1 = k2 + 1;
	//  194  301:iload           12
	//  195  303:iconst_1        
	//  196  304:iadd            
	//  197  305:istore          7
		}

	//  198  307:iload_3         
	//  199  308:istore          6
	//* 200  310:goto            90
		l = i1 - i2;
	//  201  313:iload           5
	//  202  315:iload           10
	//  203  317:isub            
	//  204  318:istore          4
		if(l > 0)
	//* 205  320:iload           4
	//* 206  322:ifle            432
		{
			byte byte0 = abyte0[i2];
	//  207  325:aload_0         
	//  208  326:iload           10
	//  209  328:baload          
	//  210  329:istore          5
			int k = ((int) (flag1));
	//  211  331:iload           8
	//  212  333:istore_3        
			if(l == 2)
	//* 213  334:iload           4
	//* 214  336:iconst_2        
	//* 215  337:icmpne          351
				k = (abyte0[l1] & 0xff) << 2;
	//  216  340:aload_0         
	//  217  341:iload           9
	//  218  343:baload          
	//  219  344:sipush          255
	//  220  347:iand            
	//  221  348:iconst_2        
	//  222  349:ishl            
	//  223  350:istore_3        
			k = (byte0 & 0xff) << 10 | k;
	//  224  351:iload           5
	//  225  353:sipush          255
	//  226  356:iand            
	//  227  357:bipush          10
	//  228  359:ishl            
	//  229  360:iload_3         
	//  230  361:ior             
	//  231  362:istore_3        
			abyte0 = ((byte []) (CA));
	//  232  363:getstatic       #20  <Field char[] CA>
	//  233  366:astore_0        
			ac[j2 - 4] = ((char) (abyte0[k >> 12]));
	//  234  367:aload           14
	//  235  369:iload           11
	//  236  371:iconst_4        
	//  237  372:isub            
	//  238  373:aload_0         
	//  239  374:iload_3         
	//  240  375:bipush          12
	//  241  377:ishr            
	//  242  378:caload          
	//  243  379:castore         
			ac[j2 - 3] = ((char) (abyte0[k >>> 6 & 0x3f]));
	//  244  380:aload           14
	//  245  382:iload           11
	//  246  384:iconst_3        
	//  247  385:isub            
	//  248  386:aload_0         
	//  249  387:iload_3         
	//  250  388:bipush          6
	//  251  390:iushr           
	//  252  391:bipush          63
	//  253  393:iand            
	//  254  394:caload          
	//  255  395:castore         
			char c;
			if(l == 2)
	//* 256  396:iload           4
	//* 257  398:iconst_2        
	//* 258  399:icmpne          412
				c = ((char) (abyte0[k & 0x3f]));
	//  259  402:aload_0         
	//  260  403:iload_3         
	//  261  404:bipush          63
	//  262  406:iand            
	//  263  407:caload          
	//  264  408:istore_2        
			else
	//* 265  409:goto            415
				c = '=';
	//  266  412:bipush          61
	//  267  414:istore_2        
			ac[j2 - 2] = c;
	//  268  415:aload           14
	//  269  417:iload           11
	//  270  419:iconst_2        
	//  271  420:isub            
	//  272  421:iload_2         
	//  273  422:castore         
			ac[j2 - 1] = '=';
	//  274  423:aload           14
	//  275  425:iload           11
	//  276  427:iconst_1        
	//  277  428:isub            
	//  278  429:bipush          61
	//  279  431:castore         
		}
		return ac;
	//  280  432:aload           14
	//  281  434:areturn         
	}

	public static final String encodeToString(byte abyte0[], boolean flag)
	{
		return new String(encodeToChar(abyte0, flag));
	//    0    0:new             #14  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokestatic    #53  <Method char[] encodeToChar(byte[], boolean)>
	//    5    9:invokespecial   #56  <Method void String(char[])>
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
