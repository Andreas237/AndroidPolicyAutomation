// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.io.*;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;

public class HttpRequest
{
	public static class Base64
	{

		public static String encode(String s)
		{
			byte abyte0[] = s.getBytes("US-ASCII");
		//    0    0:aload_0         
		//    1    1:ldc1            #14  <String "US-ASCII">
		//    2    3:invokevirtual   #98  <Method byte[] String.getBytes(String)>
		//    3    6:astore_1        
			s = ((String) (abyte0));
		//    4    7:aload_1         
		//    5    8:astore_0        
_L2:
			return encodeBytes(((byte []) (s)));
		//    6    9:aload_0         
		//    7   10:invokestatic    #102 <Method String encodeBytes(byte[])>
		//    8   13:areturn         
			UnsupportedEncodingException unsupportedencodingexception;
			unsupportedencodingexception;
		//    9   14:astore_1        
			s = ((String) (s.getBytes()));
		//   10   15:aload_0         
		//   11   16:invokevirtual   #105 <Method byte[] String.getBytes()>
		//   12   19:astore_0        
			if(true) goto _L2; else goto _L1
		//   13   20:goto            9
_L1:
		}

		private static byte[] encode3to4(byte abyte0[], int i, int j, byte abyte1[], int k)
		{
			int j1 = 0;
		//    0    0:iconst_0        
		//    1    1:istore          7
			byte abyte2[] = _STANDARD_ALPHABET;
		//    2    3:getstatic       #84  <Field byte[] _STANDARD_ALPHABET>
		//    3    6:astore          8
			int l;
			int i1;
			if(j > 0)
		//*   4    8:iload_2         
		//*   5    9:ifle            98
				l = (abyte0[i] << 24) >>> 8;
		//    6   12:aload_0         
		//    7   13:iload_1         
		//    8   14:baload          
		//    9   15:bipush          24
		//   10   17:ishl            
		//   11   18:bipush          8
		//   12   20:iushr           
		//   13   21:istore          5
			else
		//*  14   23:iload_2         
		//*  15   24:iconst_1        
		//*  16   25:icmple          104
		//*  17   28:aload_0         
		//*  18   29:iload_1         
		//*  19   30:iconst_1        
		//*  20   31:iadd            
		//*  21   32:baload          
		//*  22   33:bipush          24
		//*  23   35:ishl            
		//*  24   36:bipush          16
		//*  25   38:iushr           
		//*  26   39:istore          6
		//*  27   41:iload_2         
		//*  28   42:iconst_2        
		//*  29   43:icmple          59
		//*  30   46:aload_0         
		//*  31   47:iload_1         
		//*  32   48:iconst_2        
		//*  33   49:iadd            
		//*  34   50:baload          
		//*  35   51:bipush          24
		//*  36   53:ishl            
		//*  37   54:bipush          24
		//*  38   56:iushr           
		//*  39   57:istore          7
		//*  40   59:iload           6
		//*  41   61:iload           5
		//*  42   63:ior             
		//*  43   64:iload           7
		//*  44   66:ior             
		//*  45   67:istore_1        
		//*  46   68:iload_2         
		//*  47   69:tableswitch     1 3: default 96
		//		               1 221
		//		               2 168
		//		               3 110
		//*  48   96:aload_3         
		//*  49   97:areturn         
				l = 0;
		//   50   98:iconst_0        
		//   51   99:istore          5
			if(j > 1)
				i1 = (abyte0[i + 1] << 24) >>> 16;
			else
		//*  52  101:goto            23
				i1 = 0;
		//   53  104:iconst_0        
		//   54  105:istore          6
			if(j > 2)
				j1 = (abyte0[i + 2] << 24) >>> 24;
			i = i1 | l | j1;
			switch(j)
			{
			default:
				return abyte1;

		//*  55  107:goto            41
			case 3: // '\003'
				abyte1[k] = abyte2[i >>> 18];
		//   56  110:aload_3         
		//   57  111:iload           4
		//   58  113:aload           8
		//   59  115:iload_1         
		//   60  116:bipush          18
		//   61  118:iushr           
		//   62  119:baload          
		//   63  120:bastore         
				abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
		//   64  121:aload_3         
		//   65  122:iload           4
		//   66  124:iconst_1        
		//   67  125:iadd            
		//   68  126:aload           8
		//   69  128:iload_1         
		//   70  129:bipush          12
		//   71  131:iushr           
		//   72  132:bipush          63
		//   73  134:iand            
		//   74  135:baload          
		//   75  136:bastore         
				abyte1[k + 2] = abyte2[i >>> 6 & 0x3f];
		//   76  137:aload_3         
		//   77  138:iload           4
		//   78  140:iconst_2        
		//   79  141:iadd            
		//   80  142:aload           8
		//   81  144:iload_1         
		//   82  145:bipush          6
		//   83  147:iushr           
		//   84  148:bipush          63
		//   85  150:iand            
		//   86  151:baload          
		//   87  152:bastore         
				abyte1[k + 3] = abyte2[i & 0x3f];
		//   88  153:aload_3         
		//   89  154:iload           4
		//   90  156:iconst_3        
		//   91  157:iadd            
		//   92  158:aload           8
		//   93  160:iload_1         
		//   94  161:bipush          63
		//   95  163:iand            
		//   96  164:baload          
		//   97  165:bastore         
				return abyte1;
		//   98  166:aload_3         
		//   99  167:areturn         

			case 2: // '\002'
				abyte1[k] = abyte2[i >>> 18];
		//  100  168:aload_3         
		//  101  169:iload           4
		//  102  171:aload           8
		//  103  173:iload_1         
		//  104  174:bipush          18
		//  105  176:iushr           
		//  106  177:baload          
		//  107  178:bastore         
				abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
		//  108  179:aload_3         
		//  109  180:iload           4
		//  110  182:iconst_1        
		//  111  183:iadd            
		//  112  184:aload           8
		//  113  186:iload_1         
		//  114  187:bipush          12
		//  115  189:iushr           
		//  116  190:bipush          63
		//  117  192:iand            
		//  118  193:baload          
		//  119  194:bastore         
				abyte1[k + 2] = abyte2[i >>> 6 & 0x3f];
		//  120  195:aload_3         
		//  121  196:iload           4
		//  122  198:iconst_2        
		//  123  199:iadd            
		//  124  200:aload           8
		//  125  202:iload_1         
		//  126  203:bipush          6
		//  127  205:iushr           
		//  128  206:bipush          63
		//  129  208:iand            
		//  130  209:baload          
		//  131  210:bastore         
				abyte1[k + 3] = 61;
		//  132  211:aload_3         
		//  133  212:iload           4
		//  134  214:iconst_3        
		//  135  215:iadd            
		//  136  216:bipush          61
		//  137  218:bastore         
				return abyte1;
		//  138  219:aload_3         
		//  139  220:areturn         

			case 1: // '\001'
				abyte1[k] = abyte2[i >>> 18];
		//  140  221:aload_3         
		//  141  222:iload           4
		//  142  224:aload           8
		//  143  226:iload_1         
		//  144  227:bipush          18
		//  145  229:iushr           
		//  146  230:baload          
		//  147  231:bastore         
				abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
		//  148  232:aload_3         
		//  149  233:iload           4
		//  150  235:iconst_1        
		//  151  236:iadd            
		//  152  237:aload           8
		//  153  239:iload_1         
		//  154  240:bipush          12
		//  155  242:iushr           
		//  156  243:bipush          63
		//  157  245:iand            
		//  158  246:baload          
		//  159  247:bastore         
				abyte1[k + 2] = 61;
		//  160  248:aload_3         
		//  161  249:iload           4
		//  162  251:iconst_2        
		//  163  252:iadd            
		//  164  253:bipush          61
		//  165  255:bastore         
				abyte1[k + 3] = 61;
		//  166  256:aload_3         
		//  167  257:iload           4
		//  168  259:iconst_3        
		//  169  260:iadd            
		//  170  261:bipush          61
		//  171  263:bastore         
				return abyte1;
		//  172  264:aload_3         
		//  173  265:areturn         
			}
		}

		public static String encodeBytes(byte abyte0[])
		{
			return encodeBytes(abyte0, 0, abyte0.length);
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:aload_0         
		//    3    3:arraylength     
		//    4    4:invokestatic    #110 <Method String encodeBytes(byte[], int, int)>
		//    5    7:areturn         
		}

		public static String encodeBytes(byte abyte0[], int i, int j)
		{
			abyte0 = encodeBytesToBytes(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokestatic    #114 <Method byte[] encodeBytesToBytes(byte[], int, int)>
		//    4    6:astore_0        
			String s;
			try
			{
				s = new String(abyte0, "US-ASCII");
		//    5    7:new             #94  <Class String>
		//    6   10:dup             
		//    7   11:aload_0         
		//    8   12:ldc1            #14  <String "US-ASCII">
		//    9   14:invokespecial   #117 <Method void String(byte[], String)>
		//   10   17:astore_3        
			}
		//*  11   18:aload_3         
		//*  12   19:areturn         
			catch(UnsupportedEncodingException unsupportedencodingexception)
		//*  13   20:astore_3        
			{
				return new String(abyte0);
		//   14   21:new             #94  <Class String>
		//   15   24:dup             
		//   16   25:aload_0         
		//   17   26:invokespecial   #120 <Method void String(byte[])>
		//   18   29:areturn         
			}
			return s;
		}

		public static byte[] encodeBytesToBytes(byte abyte0[], int i, int j)
		{
			if(abyte0 == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       14
				throw new NullPointerException("Cannot serialize a null array.");
		//    2    4:new             #122 <Class NullPointerException>
		//    3    7:dup             
		//    4    8:ldc1            #124 <String "Cannot serialize a null array.">
		//    5   10:invokespecial   #127 <Method void NullPointerException(String)>
		//    6   13:athrow          
			if(i < 0)
		//*   7   14:iload_1         
		//*   8   15:ifge            45
				throw new IllegalArgumentException((new StringBuilder()).append("Cannot have negative offset: ").append(i).toString());
		//    9   18:new             #129 <Class IllegalArgumentException>
		//   10   21:dup             
		//   11   22:new             #131 <Class StringBuilder>
		//   12   25:dup             
		//   13   26:invokespecial   #132 <Method void StringBuilder()>
		//   14   29:ldc1            #134 <String "Cannot have negative offset: ">
		//   15   31:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   16   34:iload_1         
		//   17   35:invokevirtual   #141 <Method StringBuilder StringBuilder.append(int)>
		//   18   38:invokevirtual   #145 <Method String StringBuilder.toString()>
		//   19   41:invokespecial   #146 <Method void IllegalArgumentException(String)>
		//   20   44:athrow          
			if(j < 0)
		//*  21   45:iload_2         
		//*  22   46:ifge            76
				throw new IllegalArgumentException((new StringBuilder()).append("Cannot have length offset: ").append(j).toString());
		//   23   49:new             #129 <Class IllegalArgumentException>
		//   24   52:dup             
		//   25   53:new             #131 <Class StringBuilder>
		//   26   56:dup             
		//   27   57:invokespecial   #132 <Method void StringBuilder()>
		//   28   60:ldc1            #148 <String "Cannot have length offset: ">
		//   29   62:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
		//   30   65:iload_2         
		//   31   66:invokevirtual   #141 <Method StringBuilder StringBuilder.append(int)>
		//   32   69:invokevirtual   #145 <Method String StringBuilder.toString()>
		//   33   72:invokespecial   #146 <Method void IllegalArgumentException(String)>
		//   34   75:athrow          
			if(i + j > abyte0.length)
		//*  35   76:iload_1         
		//*  36   77:iload_2         
		//*  37   78:iadd            
		//*  38   79:aload_0         
		//*  39   80:arraylength     
		//*  40   81:icmple          126
				throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Cannot have offset of %d and length of %d with array of length %d", new Object[] {
					Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(abyte0.length)
				}));
		//   41   84:new             #129 <Class IllegalArgumentException>
		//   42   87:dup             
		//   43   88:getstatic       #154 <Field Locale Locale.ENGLISH>
		//   44   91:ldc1            #156 <String "Cannot have offset of %d and length of %d with array of length %d">
		//   45   93:iconst_3        
		//   46   94:anewarray       Object[]
		//   47   97:dup             
		//   48   98:iconst_0        
		//   49   99:iload_1         
		//   50  100:invokestatic    #162 <Method Integer Integer.valueOf(int)>
		//   51  103:aastore         
		//   52  104:dup             
		//   53  105:iconst_1        
		//   54  106:iload_2         
		//   55  107:invokestatic    #162 <Method Integer Integer.valueOf(int)>
		//   56  110:aastore         
		//   57  111:dup             
		//   58  112:iconst_2        
		//   59  113:aload_0         
		//   60  114:arraylength     
		//   61  115:invokestatic    #162 <Method Integer Integer.valueOf(int)>
		//   62  118:aastore         
		//   63  119:invokestatic    #166 <Method String String.format(Locale, String, Object[])>
		//   64  122:invokespecial   #146 <Method void IllegalArgumentException(String)>
		//   65  125:athrow          
			int l = j / 3;
		//   66  126:iload_2         
		//   67  127:iconst_3        
		//   68  128:idiv            
		//   69  129:istore          4
			int k;
			byte abyte1[];
			if(j % 3 > 0)
		//*  70  131:iload_2         
		//*  71  132:iconst_3        
		//*  72  133:irem            
		//*  73  134:ifle            188
				k = 4;
		//   74  137:iconst_4        
		//   75  138:istore_3        
			else
		//*  76  139:iload           4
		//*  77  141:iconst_4        
		//*  78  142:imul            
		//*  79  143:iload_3         
		//*  80  144:iadd            
		//*  81  145:newarray        byte[]
		//*  82  147:astore          6
		//*  83  149:iconst_0        
		//*  84  150:istore          4
		//*  85  152:iconst_0        
		//*  86  153:istore_3        
		//*  87  154:iload           4
		//*  88  156:iload_2         
		//*  89  157:iconst_2        
		//*  90  158:isub            
		//*  91  159:icmpge          193
		//*  92  162:aload_0         
		//*  93  163:iload           4
		//*  94  165:iload_1         
		//*  95  166:iadd            
		//*  96  167:iconst_3        
		//*  97  168:aload           6
		//*  98  170:iload_3         
		//*  99  171:invokestatic    #168 <Method byte[] encode3to4(byte[], int, int, byte[], int)>
		//* 100  174:pop             
		//* 101  175:iload           4
		//* 102  177:iconst_3        
		//* 103  178:iadd            
		//* 104  179:istore          4
		//* 105  181:iload_3         
		//* 106  182:iconst_4        
		//* 107  183:iadd            
		//* 108  184:istore_3        
		//* 109  185:goto            154
				k = 0;
		//  110  188:iconst_0        
		//  111  189:istore_3        
			abyte1 = new byte[l * 4 + k];
			l = 0;
			for(k = 0; l < j - 2; k += 4)
			{
				encode3to4(abyte0, l + i, 3, abyte1, k);
				l += 3;
			}

		//* 112  190:goto            139
			int i1 = k;
		//  113  193:iload_3         
		//  114  194:istore          5
			if(l < j)
		//* 115  196:iload           4
		//* 116  198:iload_2         
		//* 117  199:icmpge          223
			{
				encode3to4(abyte0, l + i, j - l, abyte1, k);
		//  118  202:aload_0         
		//  119  203:iload           4
		//  120  205:iload_1         
		//  121  206:iadd            
		//  122  207:iload_2         
		//  123  208:iload           4
		//  124  210:isub            
		//  125  211:aload           6
		//  126  213:iload_3         
		//  127  214:invokestatic    #168 <Method byte[] encode3to4(byte[], int, int, byte[], int)>
		//  128  217:pop             
				i1 = k + 4;
		//  129  218:iload_3         
		//  130  219:iconst_4        
		//  131  220:iadd            
		//  132  221:istore          5
			}
			if(i1 <= abyte1.length - 1)
		//* 133  223:iload           5
		//* 134  225:aload           6
		//* 135  227:arraylength     
		//* 136  228:iconst_1        
		//* 137  229:isub            
		//* 138  230:icmpgt          250
			{
				abyte0 = new byte[i1];
		//  139  233:iload           5
		//  140  235:newarray        byte[]
		//  141  237:astore_0        
				System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), 0, i1);
		//  142  238:aload           6
		//  143  240:iconst_0        
		//  144  241:aload_0         
		//  145  242:iconst_0        
		//  146  243:iload           5
		//  147  245:invokestatic    #174 <Method void System.arraycopy(Object, int, Object, int, int)>
				return abyte0;
		//  148  248:aload_0         
		//  149  249:areturn         
			} else
			{
				return abyte1;
		//  150  250:aload           6
		//  151  252:areturn         
			}
		}

		private static final byte EQUALS_SIGN = 61;
		private static final String PREFERRED_ENCODING = "US-ASCII";
		private static final byte _STANDARD_ALPHABET[] = {
			65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
			75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
			85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
			101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
			111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
			121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
			56, 57, 43, 47
		};

		static 
		{
		//    0    0:bipush          64
		//    1    2:newarray        byte[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:ldc1            #19  <Int 65>
		//    5    8:bastore         
		//    6    9:dup             
		//    7   10:iconst_1        
		//    8   11:ldc1            #20  <Int 66>
		//    9   13:bastore         
		//   10   14:dup             
		//   11   15:iconst_2        
		//   12   16:ldc1            #21  <Int 67>
		//   13   18:bastore         
		//   14   19:dup             
		//   15   20:iconst_3        
		//   16   21:ldc1            #22  <Int 68>
		//   17   23:bastore         
		//   18   24:dup             
		//   19   25:iconst_4        
		//   20   26:ldc1            #23  <Int 69>
		//   21   28:bastore         
		//   22   29:dup             
		//   23   30:iconst_5        
		//   24   31:ldc1            #24  <Int 70>
		//   25   33:bastore         
		//   26   34:dup             
		//   27   35:bipush          6
		//   28   37:ldc1            #25  <Int 71>
		//   29   39:bastore         
		//   30   40:dup             
		//   31   41:bipush          7
		//   32   43:ldc1            #26  <Int 72>
		//   33   45:bastore         
		//   34   46:dup             
		//   35   47:bipush          8
		//   36   49:ldc1            #27  <Int 73>
		//   37   51:bastore         
		//   38   52:dup             
		//   39   53:bipush          9
		//   40   55:ldc1            #28  <Int 74>
		//   41   57:bastore         
		//   42   58:dup             
		//   43   59:bipush          10
		//   44   61:ldc1            #29  <Int 75>
		//   45   63:bastore         
		//   46   64:dup             
		//   47   65:bipush          11
		//   48   67:ldc1            #30  <Int 76>
		//   49   69:bastore         
		//   50   70:dup             
		//   51   71:bipush          12
		//   52   73:ldc1            #31  <Int 77>
		//   53   75:bastore         
		//   54   76:dup             
		//   55   77:bipush          13
		//   56   79:ldc1            #32  <Int 78>
		//   57   81:bastore         
		//   58   82:dup             
		//   59   83:bipush          14
		//   60   85:ldc1            #33  <Int 79>
		//   61   87:bastore         
		//   62   88:dup             
		//   63   89:bipush          15
		//   64   91:ldc1            #34  <Int 80>
		//   65   93:bastore         
		//   66   94:dup             
		//   67   95:bipush          16
		//   68   97:ldc1            #35  <Int 81>
		//   69   99:bastore         
		//   70  100:dup             
		//   71  101:bipush          17
		//   72  103:ldc1            #36  <Int 82>
		//   73  105:bastore         
		//   74  106:dup             
		//   75  107:bipush          18
		//   76  109:ldc1            #37  <Int 83>
		//   77  111:bastore         
		//   78  112:dup             
		//   79  113:bipush          19
		//   80  115:ldc1            #38  <Int 84>
		//   81  117:bastore         
		//   82  118:dup             
		//   83  119:bipush          20
		//   84  121:ldc1            #39  <Int 85>
		//   85  123:bastore         
		//   86  124:dup             
		//   87  125:bipush          21
		//   88  127:ldc1            #40  <Int 86>
		//   89  129:bastore         
		//   90  130:dup             
		//   91  131:bipush          22
		//   92  133:ldc1            #41  <Int 87>
		//   93  135:bastore         
		//   94  136:dup             
		//   95  137:bipush          23
		//   96  139:ldc1            #42  <Int 88>
		//   97  141:bastore         
		//   98  142:dup             
		//   99  143:bipush          24
		//  100  145:ldc1            #43  <Int 89>
		//  101  147:bastore         
		//  102  148:dup             
		//  103  149:bipush          25
		//  104  151:ldc1            #44  <Int 90>
		//  105  153:bastore         
		//  106  154:dup             
		//  107  155:bipush          26
		//  108  157:ldc1            #45  <Int 97>
		//  109  159:bastore         
		//  110  160:dup             
		//  111  161:bipush          27
		//  112  163:ldc1            #46  <Int 98>
		//  113  165:bastore         
		//  114  166:dup             
		//  115  167:bipush          28
		//  116  169:ldc1            #47  <Int 99>
		//  117  171:bastore         
		//  118  172:dup             
		//  119  173:bipush          29
		//  120  175:ldc1            #48  <Int 100>
		//  121  177:bastore         
		//  122  178:dup             
		//  123  179:bipush          30
		//  124  181:ldc1            #49  <Int 101>
		//  125  183:bastore         
		//  126  184:dup             
		//  127  185:bipush          31
		//  128  187:ldc1            #50  <Int 102>
		//  129  189:bastore         
		//  130  190:dup             
		//  131  191:bipush          32
		//  132  193:ldc1            #51  <Int 103>
		//  133  195:bastore         
		//  134  196:dup             
		//  135  197:bipush          33
		//  136  199:ldc1            #52  <Int 104>
		//  137  201:bastore         
		//  138  202:dup             
		//  139  203:bipush          34
		//  140  205:ldc1            #53  <Int 105>
		//  141  207:bastore         
		//  142  208:dup             
		//  143  209:bipush          35
		//  144  211:ldc1            #54  <Int 106>
		//  145  213:bastore         
		//  146  214:dup             
		//  147  215:bipush          36
		//  148  217:ldc1            #55  <Int 107>
		//  149  219:bastore         
		//  150  220:dup             
		//  151  221:bipush          37
		//  152  223:ldc1            #56  <Int 108>
		//  153  225:bastore         
		//  154  226:dup             
		//  155  227:bipush          38
		//  156  229:ldc1            #57  <Int 109>
		//  157  231:bastore         
		//  158  232:dup             
		//  159  233:bipush          39
		//  160  235:ldc1            #58  <Int 110>
		//  161  237:bastore         
		//  162  238:dup             
		//  163  239:bipush          40
		//  164  241:ldc1            #59  <Int 111>
		//  165  243:bastore         
		//  166  244:dup             
		//  167  245:bipush          41
		//  168  247:ldc1            #60  <Int 112>
		//  169  249:bastore         
		//  170  250:dup             
		//  171  251:bipush          42
		//  172  253:ldc1            #61  <Int 113>
		//  173  255:bastore         
		//  174  256:dup             
		//  175  257:bipush          43
		//  176  259:ldc1            #62  <Int 114>
		//  177  261:bastore         
		//  178  262:dup             
		//  179  263:bipush          44
		//  180  265:ldc1            #63  <Int 115>
		//  181  267:bastore         
		//  182  268:dup             
		//  183  269:bipush          45
		//  184  271:ldc1            #64  <Int 116>
		//  185  273:bastore         
		//  186  274:dup             
		//  187  275:bipush          46
		//  188  277:ldc1            #65  <Int 117>
		//  189  279:bastore         
		//  190  280:dup             
		//  191  281:bipush          47
		//  192  283:ldc1            #66  <Int 118>
		//  193  285:bastore         
		//  194  286:dup             
		//  195  287:bipush          48
		//  196  289:ldc1            #67  <Int 119>
		//  197  291:bastore         
		//  198  292:dup             
		//  199  293:bipush          49
		//  200  295:ldc1            #68  <Int 120>
		//  201  297:bastore         
		//  202  298:dup             
		//  203  299:bipush          50
		//  204  301:ldc1            #69  <Int 121>
		//  205  303:bastore         
		//  206  304:dup             
		//  207  305:bipush          51
		//  208  307:ldc1            #70  <Int 122>
		//  209  309:bastore         
		//  210  310:dup             
		//  211  311:bipush          52
		//  212  313:ldc1            #71  <Int 48>
		//  213  315:bastore         
		//  214  316:dup             
		//  215  317:bipush          53
		//  216  319:ldc1            #72  <Int 49>
		//  217  321:bastore         
		//  218  322:dup             
		//  219  323:bipush          54
		//  220  325:ldc1            #73  <Int 50>
		//  221  327:bastore         
		//  222  328:dup             
		//  223  329:bipush          55
		//  224  331:ldc1            #74  <Int 51>
		//  225  333:bastore         
		//  226  334:dup             
		//  227  335:bipush          56
		//  228  337:ldc1            #75  <Int 52>
		//  229  339:bastore         
		//  230  340:dup             
		//  231  341:bipush          57
		//  232  343:ldc1            #76  <Int 53>
		//  233  345:bastore         
		//  234  346:dup             
		//  235  347:bipush          58
		//  236  349:ldc1            #77  <Int 54>
		//  237  351:bastore         
		//  238  352:dup             
		//  239  353:bipush          59
		//  240  355:ldc1            #78  <Int 55>
		//  241  357:bastore         
		//  242  358:dup             
		//  243  359:bipush          60
		//  244  361:ldc1            #79  <Int 56>
		//  245  363:bastore         
		//  246  364:dup             
		//  247  365:bipush          61
		//  248  367:ldc1            #80  <Int 57>
		//  249  369:bastore         
		//  250  370:dup             
		//  251  371:bipush          62
		//  252  373:ldc1            #81  <Int 43>
		//  253  375:bastore         
		//  254  376:dup             
		//  255  377:bipush          63
		//  256  379:ldc1            #82  <Int 47>
		//  257  381:bastore         
		//  258  382:putstatic       #84  <Field byte[] _STANDARD_ALPHABET>
		//* 259  385:return          
		}

		private Base64()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #88  <Method void Object()>
		//    2    4:return          
		}
	}

	protected static abstract class CloseOperation extends Operation
	{

		protected void done()
			throws IOException
		{
			if(closeable instanceof Flushable)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field Closeable closeable>
		//*   2    4:instanceof      #27  <Class Flushable>
		//*   3    7:ifeq            22
				((Flushable)closeable).flush();
		//    4   10:aload_0         
		//    5   11:getfield        #19  <Field Closeable closeable>
		//    6   14:checkcast       #27  <Class Flushable>
		//    7   17:invokeinterface #30  <Method void Flushable.flush()>
			if(ignoreCloseExceptions)
		//*   8   22:aload_0         
		//*   9   23:getfield        #21  <Field boolean ignoreCloseExceptions>
		//*  10   26:ifeq            39
			{
				try
				{
					closeable.close();
		//   11   29:aload_0         
		//   12   30:getfield        #19  <Field Closeable closeable>
		//   13   33:invokeinterface #35  <Method void Closeable.close()>
					return;
		//   14   38:return          
				}
		//*  15   39:aload_0         
		//*  16   40:getfield        #19  <Field Closeable closeable>
		//*  17   43:invokeinterface #35  <Method void Closeable.close()>
		//*  18   48:return          
				catch(IOException ioexception)
		//*  19   49:astore_1        
				{
					return;
		//   20   50:return          
				}
			} else
			{
				closeable.close();
				return;
			}
		}

		private final Closeable closeable;
		private final boolean ignoreCloseExceptions;

		protected CloseOperation(Closeable closeable1, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void HttpRequest$Operation()>
			closeable = closeable1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Closeable closeable>
			ignoreCloseExceptions = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field boolean ignoreCloseExceptions>
		//    8   14:return          
		}
	}

	public static interface ConnectionFactory
	{

		public abstract HttpURLConnection create(URL url1)
			throws IOException;

		public abstract HttpURLConnection create(URL url1, Proxy proxy)
			throws IOException;

		public static final ConnectionFactory DEFAULT = new ConnectionFactory() {

			public HttpURLConnection create(URL url1)
				throws IOException
			{
				return (HttpURLConnection)url1.openConnection();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #24  <Method java.net.URLConnection URL.openConnection()>
			//    2    4:checkcast       #26  <Class HttpURLConnection>
			//    3    7:areturn         
			}

			public HttpURLConnection create(URL url1, Proxy proxy)
				throws IOException
			{
				return (HttpURLConnection)url1.openConnection(proxy);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #31  <Method java.net.URLConnection URL.openConnection(Proxy)>
			//    3    5:checkcast       #26  <Class HttpURLConnection>
			//    4    8:areturn         
			}

		}
;

		/* static  */
		/* { */
		//    0    0:new             #9   <Class HttpRequest$ConnectionFactory$1>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void HttpRequest$ConnectionFactory$1()>
		//    3    7:putstatic       #18  <Field HttpRequest$ConnectionFactory DEFAULT>
		//*   4   10:return          
		/* } */
	}

	protected static abstract class FlushOperation extends Operation
	{

		protected void done()
			throws IOException
		{
			flushable.flush();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field Flushable flushable>
		//    2    4:invokeinterface #26  <Method void Flushable.flush()>
		//    3    9:return          
		}

		private final Flushable flushable;

		protected FlushOperation(Flushable flushable1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void HttpRequest$Operation()>
			flushable = flushable1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field Flushable flushable>
		//    5    9:return          
		}
	}

	public static class HttpRequestException extends RuntimeException
	{

		public IOException getCause()
		{
			return (IOException)super.getCause();
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method Throwable RuntimeException.getCause()>
		//    2    4:checkcast       #24  <Class IOException>
		//    3    7:areturn         
		}

		public volatile Throwable getCause()
		{
			return ((Throwable) (getCause()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method IOException getCause()>
		//    2    4:areturn         
		}

		private static final long serialVersionUID = 0x64bcfdc9L;

		protected HttpRequestException(IOException ioexception)
		{
			super(((Throwable) (ioexception)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #16  <Method void RuntimeException(Throwable)>
		//    3    5:return          
		}
	}

	protected static abstract class Operation
		implements Callable
	{

		public Object call()
			throws HttpRequestException
		{
			boolean flag = false;
		//    0    0:iconst_0        
		//    1    1:istore_1        
			Object obj = run();
		//    2    2:aload_0         
		//    3    3:invokevirtual   #24  <Method Object run()>
		//    4    6:astore_2        
			done();
		//    5    7:aload_0         
		//    6    8:invokevirtual   #27  <Method void done()>
_L2:
			return obj;
		//    7   11:aload_2         
		//    8   12:areturn         
			IOException ioexception;
			ioexception;
		//    9   13:astore_3        
			if(false) goto _L2; else goto _L1
		//   10   14:iconst_0        
		//   11   15:ifne            11
_L1:
			throw new HttpRequestException(ioexception);
		//   12   18:new             #19  <Class HttpRequest$HttpRequestException>
		//   13   21:dup             
		//   14   22:aload_3         
		//   15   23:invokespecial   #30  <Method void HttpRequest$HttpRequestException(IOException)>
		//   16   26:athrow          
			Object obj1;
			obj1;
		//   17   27:astore_2        
			flag = true;
		//   18   28:iconst_1        
		//   19   29:istore_1        
			throw obj1;
		//   20   30:aload_2         
		//   21   31:athrow          
			obj1;
		//   22   32:astore_2        
			try
			{
				done();
		//   23   33:aload_0         
		//   24   34:invokevirtual   #27  <Method void done()>
			}
		//*  25   37:aload_2         
		//*  26   38:athrow          
		//*  27   39:astore_2        
		//*  28   40:iconst_1        
		//*  29   41:istore_1        
		//*  30   42:new             #19  <Class HttpRequest$HttpRequestException>
		//*  31   45:dup             
		//*  32   46:aload_2         
		//*  33   47:invokespecial   #30  <Method void HttpRequest$HttpRequestException(IOException)>
		//*  34   50:athrow          
			catch(IOException ioexception1)
		//*  35   51:astore_3        
			{
				if(!flag)
		//*  36   52:iload_1         
		//*  37   53:ifne            37
					throw new HttpRequestException(ioexception1);
		//   38   56:new             #19  <Class HttpRequest$HttpRequestException>
		//   39   59:dup             
		//   40   60:aload_3         
		//   41   61:invokespecial   #30  <Method void HttpRequest$HttpRequestException(IOException)>
		//   42   64:athrow          
			}
			throw obj1;
			obj1;
			flag = true;
			throw new HttpRequestException(((IOException) (obj1)));
		}

		protected abstract void done()
			throws IOException;

		protected abstract Object run()
			throws HttpRequestException, IOException;

		protected Operation()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class RequestOutputStream extends BufferedOutputStream
	{

		public RequestOutputStream write(String s)
			throws IOException
		{
			s = ((String) (encoder.encode(CharBuffer.wrap(((CharSequence) (s))))));
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field CharsetEncoder encoder>
		//    2    4:aload_1         
		//    3    5:invokestatic    #43  <Method CharBuffer CharBuffer.wrap(CharSequence)>
		//    4    8:invokevirtual   #49  <Method ByteBuffer CharsetEncoder.encode(CharBuffer)>
		//    5   11:astore_1        
			super.write(((ByteBuffer) (s)).array(), 0, ((ByteBuffer) (s)).limit());
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #55  <Method byte[] ByteBuffer.array()>
		//    9   17:iconst_0        
		//   10   18:aload_1         
		//   11   19:invokevirtual   #59  <Method int ByteBuffer.limit()>
		//   12   22:invokespecial   #62  <Method void BufferedOutputStream.write(byte[], int, int)>
			return this;
		//   13   25:aload_0         
		//   14   26:areturn         
		}

		private final CharsetEncoder encoder;


/*
		static CharsetEncoder access$200(RequestOutputStream requestoutputstream)
		{
			return requestoutputstream.encoder;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field CharsetEncoder encoder>
		//    2    4:areturn         
		}

*/

		public RequestOutputStream(OutputStream outputstream, String s, int i)
		{
			super(outputstream, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_3         
		//    3    3:invokespecial   #14  <Method void BufferedOutputStream(OutputStream, int)>
			encoder = Charset.forName(HttpRequest.getValidCharset(s)).newEncoder();
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokestatic    #18  <Method String HttpRequest.access$000(String)>
		//    7   11:invokestatic    #24  <Method Charset Charset.forName(String)>
		//    8   14:invokevirtual   #28  <Method CharsetEncoder Charset.newEncoder()>
		//    9   17:putfield        #30  <Field CharsetEncoder encoder>
		//   10   20:return          
		}
	}


	public HttpRequest(CharSequence charsequence, String s)
		throws HttpRequestException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #181 <Method void Object()>
		connection = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #183 <Field HttpURLConnection connection>
		ignoreCloseExceptions = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #185 <Field boolean ignoreCloseExceptions>
		uncompress = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #187 <Field boolean uncompress>
		bufferSize = 8192;
	//   11   19:aload_0         
	//   12   20:sipush          8192
	//   13   23:putfield        #189 <Field int bufferSize>
		try
		{
			url = new URL(charsequence.toString());
	//   14   26:aload_0         
	//   15   27:new             #191 <Class URL>
	//   16   30:dup             
	//   17   31:aload_1         
	//   18   32:invokeinterface #197 <Method String CharSequence.toString()>
	//   19   37:invokespecial   #200 <Method void URL(String)>
	//   20   40:putfield        #202 <Field URL url>
		}
	//*  21   43:aload_0         
	//*  22   44:aload_2         
	//*  23   45:putfield        #204 <Field String requestMethod>
	//*  24   48:return          
		// Misplaced declaration of an exception variable
		catch(CharSequence charsequence)
	//*  25   49:astore_1        
		{
			throw new HttpRequestException(((IOException) (charsequence)));
	//   26   50:new             #36  <Class HttpRequest$HttpRequestException>
	//   27   53:dup             
	//   28   54:aload_1         
	//   29   55:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   30   58:athrow          
		}
		requestMethod = s;
	}

	public HttpRequest(URL url1, String s)
		throws HttpRequestException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #181 <Method void Object()>
		connection = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #183 <Field HttpURLConnection connection>
		ignoreCloseExceptions = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #185 <Field boolean ignoreCloseExceptions>
		uncompress = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #187 <Field boolean uncompress>
		bufferSize = 8192;
	//   11   19:aload_0         
	//   12   20:sipush          8192
	//   13   23:putfield        #189 <Field int bufferSize>
		url = url1;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #202 <Field URL url>
		requestMethod = s;
	//   17   31:aload_0         
	//   18   32:aload_2         
	//   19   33:putfield        #204 <Field String requestMethod>
	//   20   36:return          
	}

	private static StringBuilder addParamPrefix(String s, StringBuilder stringbuilder)
	{
		int i = s.indexOf('?');
	//    0    0:aload_0         
	//    1    1:bipush          63
	//    2    3:invokevirtual   #222 <Method int String.indexOf(int)>
	//    3    6:istore_2        
		int j = stringbuilder.length() - 1;
	//    4    7:aload_1         
	//    5    8:invokevirtual   #228 <Method int StringBuilder.length()>
	//    6   11:iconst_1        
	//    7   12:isub            
	//    8   13:istore_3        
		if(i == -1)
	//*   9   14:iload_2         
	//*  10   15:iconst_m1       
	//*  11   16:icmpne          28
			stringbuilder.append('?');
	//   12   19:aload_1         
	//   13   20:bipush          63
	//   14   22:invokevirtual   #232 <Method StringBuilder StringBuilder.append(char)>
	//   15   25:pop             
		else
	//*  16   26:aload_1         
	//*  17   27:areturn         
		if(i < j && s.charAt(j) != '&')
	//*  18   28:iload_2         
	//*  19   29:iload_3         
	//*  20   30:icmpge          26
	//*  21   33:aload_0         
	//*  22   34:iload_3         
	//*  23   35:invokevirtual   #236 <Method char String.charAt(int)>
	//*  24   38:bipush          38
	//*  25   40:icmpeq          26
		{
			stringbuilder.append('&');
	//   26   43:aload_1         
	//   27   44:bipush          38
	//   28   46:invokevirtual   #232 <Method StringBuilder StringBuilder.append(char)>
	//   29   49:pop             
			return stringbuilder;
	//   30   50:aload_1         
	//   31   51:areturn         
		}
		return stringbuilder;
	}

	private static StringBuilder addPathSeparator(String s, StringBuilder stringbuilder)
	{
		if(s.indexOf(':') + 2 == s.lastIndexOf('/'))
	//*   0    0:aload_0         
	//*   1    1:bipush          58
	//*   2    3:invokevirtual   #222 <Method int String.indexOf(int)>
	//*   3    6:iconst_2        
	//*   4    7:iadd            
	//*   5    8:aload_0         
	//*   6    9:bipush          47
	//*   7   11:invokevirtual   #240 <Method int String.lastIndexOf(int)>
	//*   8   14:icmpne          24
			stringbuilder.append('/');
	//    9   17:aload_1         
	//   10   18:bipush          47
	//   11   20:invokevirtual   #232 <Method StringBuilder StringBuilder.append(char)>
	//   12   23:pop             
		return stringbuilder;
	//   13   24:aload_1         
	//   14   25:areturn         
	}

	public static String append(CharSequence charsequence, Map map)
	{
		Object obj = ((Object) (charsequence.toString()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #197 <Method String CharSequence.toString()>
	//    2    6:astore_2        
		if(map == null || map.isEmpty())
	//*   3    7:aload_1         
	//*   4    8:ifnull          20
	//*   5   11:aload_1         
	//*   6   12:invokeinterface #247 <Method boolean Map.isEmpty()>
	//*   7   17:ifeq            22
			return ((String) (obj));
	//    8   20:aload_2         
	//    9   21:areturn         
		charsequence = ((CharSequence) (new StringBuilder(((String) (obj)))));
	//   10   22:new             #224 <Class StringBuilder>
	//   11   25:dup             
	//   12   26:aload_2         
	//   13   27:invokespecial   #248 <Method void StringBuilder(String)>
	//   14   30:astore_0        
		addPathSeparator(((String) (obj)), ((StringBuilder) (charsequence)));
	//   15   31:aload_2         
	//   16   32:aload_0         
	//   17   33:invokestatic    #250 <Method StringBuilder addPathSeparator(String, StringBuilder)>
	//   18   36:pop             
		addParamPrefix(((String) (obj)), ((StringBuilder) (charsequence)));
	//   19   37:aload_2         
	//   20   38:aload_0         
	//   21   39:invokestatic    #252 <Method StringBuilder addParamPrefix(String, StringBuilder)>
	//   22   42:pop             
		map = ((Map) (map.entrySet().iterator()));
	//   23   43:aload_1         
	//   24   44:invokeinterface #256 <Method Set Map.entrySet()>
	//   25   49:invokeinterface #262 <Method Iterator Set.iterator()>
	//   26   54:astore_1        
		obj = ((Object) ((java.util.Map.Entry)((Iterator) (map)).next()));
	//   27   55:aload_1         
	//   28   56:invokeinterface #268 <Method Object Iterator.next()>
	//   29   61:checkcast       #270 <Class java.util.Map$Entry>
	//   30   64:astore_2        
		((StringBuilder) (charsequence)).append(((java.util.Map.Entry) (obj)).getKey().toString());
	//   31   65:aload_0         
	//   32   66:aload_2         
	//   33   67:invokeinterface #273 <Method Object java.util.Map$Entry.getKey()>
	//   34   72:invokevirtual   #274 <Method String Object.toString()>
	//   35   75:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   36   78:pop             
		((StringBuilder) (charsequence)).append('=');
	//   37   79:aload_0         
	//   38   80:bipush          61
	//   39   82:invokevirtual   #232 <Method StringBuilder StringBuilder.append(char)>
	//   40   85:pop             
		obj = ((java.util.Map.Entry) (obj)).getValue();
	//   41   86:aload_2         
	//   42   87:invokeinterface #280 <Method Object java.util.Map$Entry.getValue()>
	//   43   92:astore_2        
		if(obj != null)
	//*  44   93:aload_2         
	//*  45   94:ifnull          103
			((StringBuilder) (charsequence)).append(obj);
	//   46   97:aload_0         
	//   47   98:aload_2         
	//   48   99:invokevirtual   #283 <Method StringBuilder StringBuilder.append(Object)>
	//   49  102:pop             
		do
		{
			if(!((Iterator) (map)).hasNext())
				break;
	//   50  103:aload_1         
	//   51  104:invokeinterface #286 <Method boolean Iterator.hasNext()>
	//   52  109:ifeq            170
			((StringBuilder) (charsequence)).append('&');
	//   53  112:aload_0         
	//   54  113:bipush          38
	//   55  115:invokevirtual   #232 <Method StringBuilder StringBuilder.append(char)>
	//   56  118:pop             
			Object obj1 = ((Object) ((java.util.Map.Entry)((Iterator) (map)).next()));
	//   57  119:aload_1         
	//   58  120:invokeinterface #268 <Method Object Iterator.next()>
	//   59  125:checkcast       #270 <Class java.util.Map$Entry>
	//   60  128:astore_2        
			((StringBuilder) (charsequence)).append(((java.util.Map.Entry) (obj1)).getKey().toString());
	//   61  129:aload_0         
	//   62  130:aload_2         
	//   63  131:invokeinterface #273 <Method Object java.util.Map$Entry.getKey()>
	//   64  136:invokevirtual   #274 <Method String Object.toString()>
	//   65  139:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   66  142:pop             
			((StringBuilder) (charsequence)).append('=');
	//   67  143:aload_0         
	//   68  144:bipush          61
	//   69  146:invokevirtual   #232 <Method StringBuilder StringBuilder.append(char)>
	//   70  149:pop             
			obj1 = ((java.util.Map.Entry) (obj1)).getValue();
	//   71  150:aload_2         
	//   72  151:invokeinterface #280 <Method Object java.util.Map$Entry.getValue()>
	//   73  156:astore_2        
			if(obj1 != null)
	//*  74  157:aload_2         
	//*  75  158:ifnull          103
				((StringBuilder) (charsequence)).append(obj1);
	//   76  161:aload_0         
	//   77  162:aload_2         
	//   78  163:invokevirtual   #283 <Method StringBuilder StringBuilder.append(Object)>
	//   79  166:pop             
		} while(true);
	//   80  167:goto            103
		return ((StringBuilder) (charsequence)).toString();
	//   81  170:aload_0         
	//   82  171:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   83  174:areturn         
	}

	public static transient String append(CharSequence charsequence, Object aobj[])
	{
		Object obj = ((Object) (charsequence.toString()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #197 <Method String CharSequence.toString()>
	//    2    6:astore_3        
		if(aobj == null || aobj.length == 0)
	//*   3    7:aload_1         
	//*   4    8:ifnull          16
	//*   5   11:aload_1         
	//*   6   12:arraylength     
	//*   7   13:ifne            18
			return ((String) (obj));
	//    8   16:aload_3         
	//    9   17:areturn         
		if(aobj.length % 2 != 0)
	//*  10   18:aload_1         
	//*  11   19:arraylength     
	//*  12   20:iconst_2        
	//*  13   21:irem            
	//*  14   22:ifeq            36
			throw new IllegalArgumentException("Must specify an even number of parameter names/values");
	//   15   25:new             #292 <Class IllegalArgumentException>
	//   16   28:dup             
	//   17   29:ldc2            #294 <String "Must specify an even number of parameter names/values">
	//   18   32:invokespecial   #295 <Method void IllegalArgumentException(String)>
	//   19   35:athrow          
		charsequence = ((CharSequence) (new StringBuilder(((String) (obj)))));
	//   20   36:new             #224 <Class StringBuilder>
	//   21   39:dup             
	//   22   40:aload_3         
	//   23   41:invokespecial   #248 <Method void StringBuilder(String)>
	//   24   44:astore_0        
		addPathSeparator(((String) (obj)), ((StringBuilder) (charsequence)));
	//   25   45:aload_3         
	//   26   46:aload_0         
	//   27   47:invokestatic    #250 <Method StringBuilder addPathSeparator(String, StringBuilder)>
	//   28   50:pop             
		addParamPrefix(((String) (obj)), ((StringBuilder) (charsequence)));
	//   29   51:aload_3         
	//   30   52:aload_0         
	//   31   53:invokestatic    #252 <Method StringBuilder addParamPrefix(String, StringBuilder)>
	//   32   56:pop             
		((StringBuilder) (charsequence)).append(aobj[0]);
	//   33   57:aload_0         
	//   34   58:aload_1         
	//   35   59:iconst_0        
	//   36   60:aaload          
	//   37   61:invokevirtual   #283 <Method StringBuilder StringBuilder.append(Object)>
	//   38   64:pop             
		((StringBuilder) (charsequence)).append('=');
	//   39   65:aload_0         
	//   40   66:bipush          61
	//   41   68:invokevirtual   #232 <Method StringBuilder StringBuilder.append(char)>
	//   42   71:pop             
		obj = aobj[1];
	//   43   72:aload_1         
	//   44   73:iconst_1        
	//   45   74:aaload          
	//   46   75:astore_3        
		if(obj != null)
	//*  47   76:aload_3         
	//*  48   77:ifnull          86
			((StringBuilder) (charsequence)).append(obj);
	//   49   80:aload_0         
	//   50   81:aload_3         
	//   51   82:invokevirtual   #283 <Method StringBuilder StringBuilder.append(Object)>
	//   52   85:pop             
		for(int i = 2; i < aobj.length; i += 2)
	//*  53   86:iconst_2        
	//*  54   87:istore_2        
	//*  55   88:iload_2         
	//*  56   89:aload_1         
	//*  57   90:arraylength     
	//*  58   91:icmpge          139
		{
			((StringBuilder) (charsequence)).append('&');
	//   59   94:aload_0         
	//   60   95:bipush          38
	//   61   97:invokevirtual   #232 <Method StringBuilder StringBuilder.append(char)>
	//   62  100:pop             
			((StringBuilder) (charsequence)).append(aobj[i]);
	//   63  101:aload_0         
	//   64  102:aload_1         
	//   65  103:iload_2         
	//   66  104:aaload          
	//   67  105:invokevirtual   #283 <Method StringBuilder StringBuilder.append(Object)>
	//   68  108:pop             
			((StringBuilder) (charsequence)).append('=');
	//   69  109:aload_0         
	//   70  110:bipush          61
	//   71  112:invokevirtual   #232 <Method StringBuilder StringBuilder.append(char)>
	//   72  115:pop             
			Object obj1 = aobj[i + 1];
	//   73  116:aload_1         
	//   74  117:iload_2         
	//   75  118:iconst_1        
	//   76  119:iadd            
	//   77  120:aaload          
	//   78  121:astore_3        
			if(obj1 != null)
	//*  79  122:aload_3         
	//*  80  123:ifnull          132
				((StringBuilder) (charsequence)).append(obj1);
	//   81  126:aload_0         
	//   82  127:aload_3         
	//   83  128:invokevirtual   #283 <Method StringBuilder StringBuilder.append(Object)>
	//   84  131:pop             
		}

	//   85  132:iload_2         
	//   86  133:iconst_2        
	//   87  134:iadd            
	//   88  135:istore_2        
	//*  89  136:goto            88
		return ((StringBuilder) (charsequence)).toString();
	//   90  139:aload_0         
	//   91  140:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   92  143:areturn         
	}

	private HttpURLConnection createConnection()
	{
		HttpURLConnection httpurlconnection;
		if(httpProxyHost == null)
			break MISSING_BLOCK_LABEL_34;
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field String httpProxyHost>
	//    2    4:ifnull          34
		httpurlconnection = CONNECTION_FACTORY.create(url, createProxy());
	//    3    7:getstatic       #174 <Field HttpRequest$ConnectionFactory CONNECTION_FACTORY>
	//    4   10:aload_0         
	//    5   11:getfield        #202 <Field URL url>
	//    6   14:aload_0         
	//    7   15:invokespecial   #305 <Method Proxy createProxy()>
	//    8   18:invokeinterface #309 <Method HttpURLConnection HttpRequest$ConnectionFactory.create(URL, Proxy)>
	//    9   23:astore_1        
_L1:
		httpurlconnection.setRequestMethod(requestMethod);
	//   10   24:aload_1         
	//   11   25:aload_0         
	//   12   26:getfield        #204 <Field String requestMethod>
	//   13   29:invokevirtual   #314 <Method void HttpURLConnection.setRequestMethod(String)>
		return httpurlconnection;
	//   14   32:aload_1         
	//   15   33:areturn         
		try
		{
			httpurlconnection = CONNECTION_FACTORY.create(url);
	//   16   34:getstatic       #174 <Field HttpRequest$ConnectionFactory CONNECTION_FACTORY>
	//   17   37:aload_0         
	//   18   38:getfield        #202 <Field URL url>
	//   19   41:invokeinterface #317 <Method HttpURLConnection HttpRequest$ConnectionFactory.create(URL)>
	//   20   46:astore_1        
		}
	//*  21   47:goto            24
		catch(IOException ioexception)
	//*  22   50:astore_1        
		{
			throw new HttpRequestException(ioexception);
	//   23   51:new             #36  <Class HttpRequest$HttpRequestException>
	//   24   54:dup             
	//   25   55:aload_1         
	//   26   56:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   27   59:athrow          
		}
		  goto _L1
	}

	private Proxy createProxy()
	{
		return new Proxy(java.net.Proxy.Type.HTTP, ((java.net.SocketAddress) (new InetSocketAddress(httpProxyHost, httpProxyPort))));
	//    0    0:new             #319 <Class Proxy>
	//    1    3:dup             
	//    2    4:getstatic       #325 <Field java.net.Proxy$Type java.net.Proxy$Type.HTTP>
	//    3    7:new             #327 <Class InetSocketAddress>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #301 <Field String httpProxyHost>
	//    7   15:aload_0         
	//    8   16:getfield        #329 <Field int httpProxyPort>
	//    9   19:invokespecial   #332 <Method void InetSocketAddress(String, int)>
	//   10   22:invokespecial   #335 <Method void Proxy(java.net.Proxy$Type, java.net.SocketAddress)>
	//   11   25:areturn         
	}

	public static HttpRequest delete(CharSequence charsequence)
		throws HttpRequestException
	{
		return new HttpRequest(charsequence, "DELETE");
	//    0    0:new             #2   <Class HttpRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #126 <String "DELETE">
	//    4    7:invokespecial   #339 <Method void HttpRequest(CharSequence, String)>
	//    5   10:areturn         
	}

	public static HttpRequest delete(CharSequence charsequence, Map map, boolean flag)
	{
		map = ((Map) (append(charsequence, map)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #342 <Method String append(CharSequence, Map)>
	//    3    5:astore_1        
		charsequence = ((CharSequence) (map));
	//    4    6:aload_1         
	//    5    7:astore_0        
		if(flag)
	//*   6    8:iload_2         
	//*   7    9:ifeq            17
			charsequence = ((CharSequence) (encode(((CharSequence) (map)))));
	//    8   12:aload_1         
	//    9   13:invokestatic    #346 <Method String encode(CharSequence)>
	//   10   16:astore_0        
		return delete(charsequence);
	//   11   17:aload_0         
	//   12   18:invokestatic    #348 <Method HttpRequest delete(CharSequence)>
	//   13   21:areturn         
	}

	public static transient HttpRequest delete(CharSequence charsequence, boolean flag, Object aobj[])
	{
		aobj = ((Object []) (append(charsequence, aobj)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #352 <Method String append(CharSequence, Object[])>
	//    3    5:astore_2        
		charsequence = ((CharSequence) (aobj));
	//    4    6:aload_2         
	//    5    7:astore_0        
		if(flag)
	//*   6    8:iload_1         
	//*   7    9:ifeq            17
			charsequence = ((CharSequence) (encode(((CharSequence) (aobj)))));
	//    8   12:aload_2         
	//    9   13:invokestatic    #346 <Method String encode(CharSequence)>
	//   10   16:astore_0        
		return delete(charsequence);
	//   11   17:aload_0         
	//   12   18:invokestatic    #348 <Method HttpRequest delete(CharSequence)>
	//   13   21:areturn         
	}

	public static HttpRequest delete(URL url1)
		throws HttpRequestException
	{
		return new HttpRequest(url1, "DELETE");
	//    0    0:new             #2   <Class HttpRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #126 <String "DELETE">
	//    4    7:invokespecial   #355 <Method void HttpRequest(URL, String)>
	//    5   10:areturn         
	}

	public static String encode(CharSequence charsequence)
		throws HttpRequestException
	{
		int i;
		String s;
		URL url1;
		try
		{
			url1 = new URL(charsequence.toString());
	//    0    0:new             #191 <Class URL>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #197 <Method String CharSequence.toString()>
	//    4   10:invokespecial   #200 <Method void URL(String)>
	//    5   13:astore_3        
		}
	//*   6   14:aload_3         
	//*   7   15:invokevirtual   #360 <Method String URL.getHost()>
	//*   8   18:astore_2        
	//*   9   19:aload_3         
	//*  10   20:invokevirtual   #363 <Method int URL.getPort()>
	//*  11   23:istore_1        
	//*  12   24:aload_2         
	//*  13   25:astore_0        
	//*  14   26:iload_1         
	//*  15   27:iconst_m1       
	//*  16   28:icmpeq          58
	//*  17   31:new             #224 <Class StringBuilder>
	//*  18   34:dup             
	//*  19   35:invokespecial   #364 <Method void StringBuilder()>
	//*  20   38:aload_2         
	//*  21   39:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//*  22   42:bipush          58
	//*  23   44:invokevirtual   #232 <Method StringBuilder StringBuilder.append(char)>
	//*  24   47:iload_1         
	//*  25   48:invokestatic    #369 <Method String Integer.toString(int)>
	//*  26   51:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//*  27   54:invokevirtual   #287 <Method String StringBuilder.toString()>
	//*  28   57:astore_0        
	//*  29   58:new             #371 <Class URI>
	//*  30   61:dup             
	//*  31   62:aload_3         
	//*  32   63:invokevirtual   #374 <Method String URL.getProtocol()>
	//*  33   66:aload_0         
	//*  34   67:aload_3         
	//*  35   68:invokevirtual   #377 <Method String URL.getPath()>
	//*  36   71:aload_3         
	//*  37   72:invokevirtual   #380 <Method String URL.getQuery()>
	//*  38   75:aconst_null     
	//*  39   76:invokespecial   #383 <Method void URI(String, String, String, String, String)>
	//*  40   79:invokevirtual   #386 <Method String URI.toASCIIString()>
	//*  41   82:astore_2        
	//*  42   83:aload_2         
	//*  43   84:bipush          63
	//*  44   86:invokevirtual   #222 <Method int String.indexOf(int)>
	//*  45   89:istore_1        
	//*  46   90:aload_2         
	//*  47   91:astore_0        
	//*  48   92:iload_1         
	//*  49   93:ifle            149
	//*  50   96:aload_2         
	//*  51   97:astore_0        
	//*  52   98:iload_1         
	//*  53   99:iconst_1        
	//*  54  100:iadd            
	//*  55  101:aload_2         
	//*  56  102:invokevirtual   #387 <Method int String.length()>
	//*  57  105:icmpge          149
	//*  58  108:new             #224 <Class StringBuilder>
	//*  59  111:dup             
	//*  60  112:invokespecial   #364 <Method void StringBuilder()>
	//*  61  115:aload_2         
	//*  62  116:iconst_0        
	//*  63  117:iload_1         
	//*  64  118:iconst_1        
	//*  65  119:iadd            
	//*  66  120:invokevirtual   #391 <Method String String.substring(int, int)>
	//*  67  123:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//*  68  126:aload_2         
	//*  69  127:iload_1         
	//*  70  128:iconst_1        
	//*  71  129:iadd            
	//*  72  130:invokevirtual   #393 <Method String String.substring(int)>
	//*  73  133:ldc2            #395 <String "+">
	//*  74  136:ldc2            #397 <String "%2B">
	//*  75  139:invokevirtual   #401 <Method String String.replace(CharSequence, CharSequence)>
	//*  76  142:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//*  77  145:invokevirtual   #287 <Method String StringBuilder.toString()>
	//*  78  148:astore_0        
	//*  79  149:aload_0         
	//*  80  150:areturn         
		// Misplaced declaration of an exception variable
		catch(CharSequence charsequence)
	//*  81  151:astore_0        
		{
			throw new HttpRequestException(((IOException) (charsequence)));
	//   82  152:new             #36  <Class HttpRequest$HttpRequestException>
	//   83  155:dup             
	//   84  156:aload_0         
	//   85  157:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   86  160:athrow          
		}
		s = url1.getHost();
		i = url1.getPort();
		charsequence = ((CharSequence) (s));
		if(i != -1)
			charsequence = ((CharSequence) ((new StringBuilder()).append(s).append(':').append(Integer.toString(i)).toString()));
		try
		{
			s = (new URI(url1.getProtocol(), ((String) (charsequence)), url1.getPath(), url1.getQuery(), ((String) (null)))).toASCIIString();
			i = s.indexOf('?');
		}
		// Misplaced declaration of an exception variable
		catch(CharSequence charsequence)
	//*  87  161:astore_0        
		{
			IOException ioexception = new IOException("Parsing URI failed");
	//   88  162:new             #299 <Class IOException>
	//   89  165:dup             
	//   90  166:ldc2            #403 <String "Parsing URI failed">
	//   91  169:invokespecial   #404 <Method void IOException(String)>
	//   92  172:astore_2        
			ioexception.initCause(((Throwable) (charsequence)));
	//   93  173:aload_2         
	//   94  174:aload_0         
	//   95  175:invokevirtual   #408 <Method Throwable IOException.initCause(Throwable)>
	//   96  178:pop             
			throw new HttpRequestException(ioexception);
	//   97  179:new             #36  <Class HttpRequest$HttpRequestException>
	//   98  182:dup             
	//   99  183:aload_2         
	//  100  184:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//  101  187:athrow          
		}
		charsequence = ((CharSequence) (s));
		if(i <= 0)
			break MISSING_BLOCK_LABEL_149;
		charsequence = ((CharSequence) (s));
		if(i + 1 < s.length())
			charsequence = ((CharSequence) ((new StringBuilder()).append(s.substring(0, i + 1)).append(s.substring(i + 1).replace("+", "%2B")).toString()));
		return ((String) (charsequence));
	}

	public static HttpRequest get(CharSequence charsequence)
		throws HttpRequestException
	{
		return new HttpRequest(charsequence, "GET");
	//    0    0:new             #2   <Class HttpRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #129 <String "GET">
	//    4    7:invokespecial   #339 <Method void HttpRequest(CharSequence, String)>
	//    5   10:areturn         
	}

	public static HttpRequest get(CharSequence charsequence, Map map, boolean flag)
	{
		map = ((Map) (append(charsequence, map)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #342 <Method String append(CharSequence, Map)>
	//    3    5:astore_1        
		charsequence = ((CharSequence) (map));
	//    4    6:aload_1         
	//    5    7:astore_0        
		if(flag)
	//*   6    8:iload_2         
	//*   7    9:ifeq            17
			charsequence = ((CharSequence) (encode(((CharSequence) (map)))));
	//    8   12:aload_1         
	//    9   13:invokestatic    #346 <Method String encode(CharSequence)>
	//   10   16:astore_0        
		return get(charsequence);
	//   11   17:aload_0         
	//   12   18:invokestatic    #411 <Method HttpRequest get(CharSequence)>
	//   13   21:areturn         
	}

	public static transient HttpRequest get(CharSequence charsequence, boolean flag, Object aobj[])
	{
		aobj = ((Object []) (append(charsequence, aobj)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #352 <Method String append(CharSequence, Object[])>
	//    3    5:astore_2        
		charsequence = ((CharSequence) (aobj));
	//    4    6:aload_2         
	//    5    7:astore_0        
		if(flag)
	//*   6    8:iload_1         
	//*   7    9:ifeq            17
			charsequence = ((CharSequence) (encode(((CharSequence) (aobj)))));
	//    8   12:aload_2         
	//    9   13:invokestatic    #346 <Method String encode(CharSequence)>
	//   10   16:astore_0        
		return get(charsequence);
	//   11   17:aload_0         
	//   12   18:invokestatic    #411 <Method HttpRequest get(CharSequence)>
	//   13   21:areturn         
	}

	public static HttpRequest get(URL url1)
		throws HttpRequestException
	{
		return new HttpRequest(url1, "GET");
	//    0    0:new             #2   <Class HttpRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #129 <String "GET">
	//    4    7:invokespecial   #355 <Method void HttpRequest(URL, String)>
	//    5   10:areturn         
	}

	private static String getValidCharset(String s)
	{
		if(s != null && s.length() > 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #387 <Method int String.length()>
	//*   4    8:ifle            13
			return s;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return "UTF-8";
	//    7   13:ldc1            #50  <String "UTF-8">
	//    8   15:areturn         
	}

	public static HttpRequest head(CharSequence charsequence)
		throws HttpRequestException
	{
		return new HttpRequest(charsequence, "HEAD");
	//    0    0:new             #2   <Class HttpRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #132 <String "HEAD">
	//    4    7:invokespecial   #339 <Method void HttpRequest(CharSequence, String)>
	//    5   10:areturn         
	}

	public static HttpRequest head(CharSequence charsequence, Map map, boolean flag)
	{
		map = ((Map) (append(charsequence, map)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #342 <Method String append(CharSequence, Map)>
	//    3    5:astore_1        
		charsequence = ((CharSequence) (map));
	//    4    6:aload_1         
	//    5    7:astore_0        
		if(flag)
	//*   6    8:iload_2         
	//*   7    9:ifeq            17
			charsequence = ((CharSequence) (encode(((CharSequence) (map)))));
	//    8   12:aload_1         
	//    9   13:invokestatic    #346 <Method String encode(CharSequence)>
	//   10   16:astore_0        
		return head(charsequence);
	//   11   17:aload_0         
	//   12   18:invokestatic    #414 <Method HttpRequest head(CharSequence)>
	//   13   21:areturn         
	}

	public static transient HttpRequest head(CharSequence charsequence, boolean flag, Object aobj[])
	{
		aobj = ((Object []) (append(charsequence, aobj)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #352 <Method String append(CharSequence, Object[])>
	//    3    5:astore_2        
		charsequence = ((CharSequence) (aobj));
	//    4    6:aload_2         
	//    5    7:astore_0        
		if(flag)
	//*   6    8:iload_1         
	//*   7    9:ifeq            17
			charsequence = ((CharSequence) (encode(((CharSequence) (aobj)))));
	//    8   12:aload_2         
	//    9   13:invokestatic    #346 <Method String encode(CharSequence)>
	//   10   16:astore_0        
		return head(charsequence);
	//   11   17:aload_0         
	//   12   18:invokestatic    #414 <Method HttpRequest head(CharSequence)>
	//   13   21:areturn         
	}

	public static HttpRequest head(URL url1)
		throws HttpRequestException
	{
		return new HttpRequest(url1, "HEAD");
	//    0    0:new             #2   <Class HttpRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #132 <String "HEAD">
	//    4    7:invokespecial   #355 <Method void HttpRequest(URL, String)>
	//    5   10:areturn         
	}

	public static void keepAlive(boolean flag)
	{
		setProperty("http.keepAlive", Boolean.toString(flag));
	//    0    0:ldc2            #418 <String "http.keepAlive">
	//    1    3:iload_0         
	//    2    4:invokestatic    #423 <Method String Boolean.toString(boolean)>
	//    3    7:invokestatic    #427 <Method String setProperty(String, String)>
	//    4   10:pop             
	//    5   11:return          
	}

	public static transient void nonProxyHosts(String as[])
	{
		if(as != null && as.length > 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          69
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifle            69
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #224 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #364 <Method void StringBuilder()>
	//    8   16:astore_3        
			int j = as.length - 1;
	//    9   17:aload_0         
	//   10   18:arraylength     
	//   11   19:iconst_1        
	//   12   20:isub            
	//   13   21:istore_2        
			for(int i = 0; i < j; i++)
	//*  14   22:iconst_0        
	//*  15   23:istore_1        
	//*  16   24:iload_1         
	//*  17   25:iload_2         
	//*  18   26:icmpge          49
				stringbuilder.append(as[i]).append('|');
	//   19   29:aload_3         
	//   20   30:aload_0         
	//   21   31:iload_1         
	//   22   32:aaload          
	//   23   33:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   24   36:bipush          124
	//   25   38:invokevirtual   #232 <Method StringBuilder StringBuilder.append(char)>
	//   26   41:pop             

	//   27   42:iload_1         
	//   28   43:iconst_1        
	//   29   44:iadd            
	//   30   45:istore_1        
	//*  31   46:goto            24
			stringbuilder.append(as[j]);
	//   32   49:aload_3         
	//   33   50:aload_0         
	//   34   51:iload_2         
	//   35   52:aaload          
	//   36   53:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   37   56:pop             
			setProperty("http.nonProxyHosts", stringbuilder.toString());
	//   38   57:ldc2            #431 <String "http.nonProxyHosts">
	//   39   60:aload_3         
	//   40   61:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   41   64:invokestatic    #427 <Method String setProperty(String, String)>
	//   42   67:pop             
			return;
	//   43   68:return          
		} else
		{
			setProperty("http.nonProxyHosts", ((String) (null)));
	//   44   69:ldc2            #431 <String "http.nonProxyHosts">
	//   45   72:aconst_null     
	//   46   73:invokestatic    #427 <Method String setProperty(String, String)>
	//   47   76:pop             
			return;
	//   48   77:return          
		}
	}

	public static HttpRequest options(CharSequence charsequence)
		throws HttpRequestException
	{
		return new HttpRequest(charsequence, "OPTIONS");
	//    0    0:new             #2   <Class HttpRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #135 <String "OPTIONS">
	//    4    7:invokespecial   #339 <Method void HttpRequest(CharSequence, String)>
	//    5   10:areturn         
	}

	public static HttpRequest options(URL url1)
		throws HttpRequestException
	{
		return new HttpRequest(url1, "OPTIONS");
	//    0    0:new             #2   <Class HttpRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #135 <String "OPTIONS">
	//    4    7:invokespecial   #355 <Method void HttpRequest(URL, String)>
	//    5   10:areturn         
	}

	public static HttpRequest post(CharSequence charsequence)
		throws HttpRequestException
	{
		return new HttpRequest(charsequence, "POST");
	//    0    0:new             #2   <Class HttpRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #138 <String "POST">
	//    4    7:invokespecial   #339 <Method void HttpRequest(CharSequence, String)>
	//    5   10:areturn         
	}

	public static HttpRequest post(CharSequence charsequence, Map map, boolean flag)
	{
		map = ((Map) (append(charsequence, map)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #342 <Method String append(CharSequence, Map)>
	//    3    5:astore_1        
		charsequence = ((CharSequence) (map));
	//    4    6:aload_1         
	//    5    7:astore_0        
		if(flag)
	//*   6    8:iload_2         
	//*   7    9:ifeq            17
			charsequence = ((CharSequence) (encode(((CharSequence) (map)))));
	//    8   12:aload_1         
	//    9   13:invokestatic    #346 <Method String encode(CharSequence)>
	//   10   16:astore_0        
		return post(charsequence);
	//   11   17:aload_0         
	//   12   18:invokestatic    #435 <Method HttpRequest post(CharSequence)>
	//   13   21:areturn         
	}

	public static transient HttpRequest post(CharSequence charsequence, boolean flag, Object aobj[])
	{
		aobj = ((Object []) (append(charsequence, aobj)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #352 <Method String append(CharSequence, Object[])>
	//    3    5:astore_2        
		charsequence = ((CharSequence) (aobj));
	//    4    6:aload_2         
	//    5    7:astore_0        
		if(flag)
	//*   6    8:iload_1         
	//*   7    9:ifeq            17
			charsequence = ((CharSequence) (encode(((CharSequence) (aobj)))));
	//    8   12:aload_2         
	//    9   13:invokestatic    #346 <Method String encode(CharSequence)>
	//   10   16:astore_0        
		return post(charsequence);
	//   11   17:aload_0         
	//   12   18:invokestatic    #435 <Method HttpRequest post(CharSequence)>
	//   13   21:areturn         
	}

	public static HttpRequest post(URL url1)
		throws HttpRequestException
	{
		return new HttpRequest(url1, "POST");
	//    0    0:new             #2   <Class HttpRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #138 <String "POST">
	//    4    7:invokespecial   #355 <Method void HttpRequest(URL, String)>
	//    5   10:areturn         
	}

	public static void proxyHost(String s)
	{
		setProperty("http.proxyHost", s);
	//    0    0:ldc2            #438 <String "http.proxyHost">
	//    1    3:aload_0         
	//    2    4:invokestatic    #427 <Method String setProperty(String, String)>
	//    3    7:pop             
		setProperty("https.proxyHost", s);
	//    4    8:ldc2            #440 <String "https.proxyHost">
	//    5   11:aload_0         
	//    6   12:invokestatic    #427 <Method String setProperty(String, String)>
	//    7   15:pop             
	//    8   16:return          
	}

	public static void proxyPort(int i)
	{
		String s = Integer.toString(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #369 <Method String Integer.toString(int)>
	//    2    4:astore_1        
		setProperty("http.proxyPort", s);
	//    3    5:ldc2            #444 <String "http.proxyPort">
	//    4    8:aload_1         
	//    5    9:invokestatic    #427 <Method String setProperty(String, String)>
	//    6   12:pop             
		setProperty("https.proxyPort", s);
	//    7   13:ldc2            #446 <String "https.proxyPort">
	//    8   16:aload_1         
	//    9   17:invokestatic    #427 <Method String setProperty(String, String)>
	//   10   20:pop             
	//   11   21:return          
	}

	public static HttpRequest put(CharSequence charsequence)
		throws HttpRequestException
	{
		return new HttpRequest(charsequence, "PUT");
	//    0    0:new             #2   <Class HttpRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #141 <String "PUT">
	//    4    7:invokespecial   #339 <Method void HttpRequest(CharSequence, String)>
	//    5   10:areturn         
	}

	public static HttpRequest put(CharSequence charsequence, Map map, boolean flag)
	{
		map = ((Map) (append(charsequence, map)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #342 <Method String append(CharSequence, Map)>
	//    3    5:astore_1        
		charsequence = ((CharSequence) (map));
	//    4    6:aload_1         
	//    5    7:astore_0        
		if(flag)
	//*   6    8:iload_2         
	//*   7    9:ifeq            17
			charsequence = ((CharSequence) (encode(((CharSequence) (map)))));
	//    8   12:aload_1         
	//    9   13:invokestatic    #346 <Method String encode(CharSequence)>
	//   10   16:astore_0        
		return put(charsequence);
	//   11   17:aload_0         
	//   12   18:invokestatic    #449 <Method HttpRequest put(CharSequence)>
	//   13   21:areturn         
	}

	public static transient HttpRequest put(CharSequence charsequence, boolean flag, Object aobj[])
	{
		aobj = ((Object []) (append(charsequence, aobj)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #352 <Method String append(CharSequence, Object[])>
	//    3    5:astore_2        
		charsequence = ((CharSequence) (aobj));
	//    4    6:aload_2         
	//    5    7:astore_0        
		if(flag)
	//*   6    8:iload_1         
	//*   7    9:ifeq            17
			charsequence = ((CharSequence) (encode(((CharSequence) (aobj)))));
	//    8   12:aload_2         
	//    9   13:invokestatic    #346 <Method String encode(CharSequence)>
	//   10   16:astore_0        
		return put(charsequence);
	//   11   17:aload_0         
	//   12   18:invokestatic    #449 <Method HttpRequest put(CharSequence)>
	//   13   21:areturn         
	}

	public static HttpRequest put(URL url1)
		throws HttpRequestException
	{
		return new HttpRequest(url1, "PUT");
	//    0    0:new             #2   <Class HttpRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #141 <String "PUT">
	//    4    7:invokespecial   #355 <Method void HttpRequest(URL, String)>
	//    5   10:areturn         
	}

	public static void setConnectionFactory(ConnectionFactory connectionfactory)
	{
		if(connectionfactory == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       11
		{
			CONNECTION_FACTORY = ConnectionFactory.DEFAULT;
	//    2    4:getstatic       #172 <Field HttpRequest$ConnectionFactory HttpRequest$ConnectionFactory.DEFAULT>
	//    3    7:putstatic       #174 <Field HttpRequest$ConnectionFactory CONNECTION_FACTORY>
			return;
	//    4   10:return          
		} else
		{
			CONNECTION_FACTORY = connectionfactory;
	//    5   11:aload_0         
	//    6   12:putstatic       #174 <Field HttpRequest$ConnectionFactory CONNECTION_FACTORY>
			return;
	//    7   15:return          
		}
	}

	private static String setProperty(String s, String s1)
	{
		if(s1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
			s = ((String) (new PrivilegedAction(s, s1) {

				public volatile Object run()
				{
					return ((Object) (run()));
				//    0    0:aload_0         
				//    1    1:invokevirtual   #30  <Method String run()>
				//    2    4:areturn         
				}

				public String run()
				{
					return System.setProperty(name, value);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field String val$name>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field String val$value>
				//    4    8:invokestatic    #33  <Method String System.setProperty(String, String)>
				//    5   11:areturn         
				}

				final String val$name;
				final String val$value;

			
			{
				name = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field String val$name>
				value = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$value>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//    2    4:new             #6   <Class HttpRequest$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #454 <Method void HttpRequest$1(String, String)>
	//    7   13:astore_0        
		else
	//*   8   14:aload_0         
	//*   9   15:invokestatic    #460 <Method Object AccessController.doPrivileged(PrivilegedAction)>
	//*  10   18:checkcast       #167 <Class String>
	//*  11   21:areturn         
			s = ((String) (new PrivilegedAction(s) {

				public volatile Object run()
				{
					return ((Object) (run()));
				//    0    0:aload_0         
				//    1    1:invokevirtual   #27  <Method String run()>
				//    2    4:areturn         
				}

				public String run()
				{
					return System.clearProperty(name);
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field String val$name>
				//    2    4:invokestatic    #33  <Method String System.clearProperty(String)>
				//    3    7:areturn         
				}

				final String val$name;

			
			{
				name = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field String val$name>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
			}
));
	//   12   22:new             #8   <Class HttpRequest$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #461 <Method void HttpRequest$2(String)>
	//   16   30:astore_0        
		return (String)AccessController.doPrivileged(((PrivilegedAction) (s)));
	//*  17   31:goto            14
	}

	public static HttpRequest trace(CharSequence charsequence)
		throws HttpRequestException
	{
		return new HttpRequest(charsequence, "TRACE");
	//    0    0:new             #2   <Class HttpRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #144 <String "TRACE">
	//    4    7:invokespecial   #339 <Method void HttpRequest(CharSequence, String)>
	//    5   10:areturn         
	}

	public static HttpRequest trace(URL url1)
		throws HttpRequestException
	{
		return new HttpRequest(url1, "TRACE");
	//    0    0:new             #2   <Class HttpRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #144 <String "TRACE">
	//    4    7:invokespecial   #355 <Method void HttpRequest(URL, String)>
	//    5   10:areturn         
	}

	public HttpRequest accept(String s)
	{
		return header("Accept", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #72  <String "Accept">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #468 <Method HttpRequest header(String, String)>
	//    4    7:areturn         
	}

	public HttpRequest acceptCharset(String s)
	{
		return header("Accept-Charset", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #75  <String "Accept-Charset">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #468 <Method HttpRequest header(String, String)>
	//    4    7:areturn         
	}

	public HttpRequest acceptEncoding(String s)
	{
		return header("Accept-Encoding", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #78  <String "Accept-Encoding">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #468 <Method HttpRequest header(String, String)>
	//    4    7:areturn         
	}

	public HttpRequest acceptGzipEncoding()
	{
		return acceptEncoding("gzip");
	//    0    0:aload_0         
	//    1    1:ldc1            #69  <String "gzip">
	//    2    3:invokevirtual   #474 <Method HttpRequest acceptEncoding(String)>
	//    3    6:areturn         
	}

	public HttpRequest acceptJson()
	{
		return accept("application/json");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "application/json">
	//    2    3:invokevirtual   #477 <Method HttpRequest accept(String)>
	//    3    6:areturn         
	}

	public HttpRequest authorization(String s)
	{
		return header("Authorization", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #81  <String "Authorization">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #468 <Method HttpRequest header(String, String)>
	//    4    7:areturn         
	}

	public boolean badRequest()
		throws HttpRequestException
	{
		return 400 == code();
	//    0    0:sipush          400
	//    1    3:aload_0         
	//    2    4:invokevirtual   #482 <Method int code()>
	//    3    7:icmpne          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public HttpRequest basic(String s, String s1)
	{
		return authorization((new StringBuilder()).append("Basic ").append(Base64.encode((new StringBuilder()).append(s).append(':').append(s1).toString())).toString());
	//    0    0:aload_0         
	//    1    1:new             #224 <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #364 <Method void StringBuilder()>
	//    4    8:ldc2            #485 <String "Basic ">
	//    5   11:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:new             #224 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #364 <Method void StringBuilder()>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:bipush          58
	//   12   27:invokevirtual   #232 <Method StringBuilder StringBuilder.append(char)>
	//   13   30:aload_2         
	//   14   31:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   15   34:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   16   37:invokestatic    #487 <Method String HttpRequest$Base64.encode(String)>
	//   17   40:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   18   43:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   19   46:invokevirtual   #489 <Method HttpRequest authorization(String)>
	//   20   49:areturn         
	}

	public HttpRequest body(AtomicReference atomicreference)
		throws HttpRequestException
	{
		atomicreference.set(((Object) (body())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #493 <Method String body()>
	//    3    5:invokevirtual   #499 <Method void AtomicReference.set(Object)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public HttpRequest body(AtomicReference atomicreference, String s)
		throws HttpRequestException
	{
		atomicreference.set(((Object) (body(s))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #503 <Method String body(String)>
	//    4    6:invokevirtual   #499 <Method void AtomicReference.set(Object)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public String body()
		throws HttpRequestException
	{
		return body(charset());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #506 <Method String charset()>
	//    3    5:invokevirtual   #503 <Method String body(String)>
	//    4    8:areturn         
	}

	public String body(String s)
		throws HttpRequestException
	{
		ByteArrayOutputStream bytearrayoutputstream = byteStream();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #510 <Method ByteArrayOutputStream byteStream()>
	//    2    4:astore_2        
		try
		{
			copy(((InputStream) (buffer())), ((OutputStream) (bytearrayoutputstream)));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #514 <Method BufferedInputStream buffer()>
	//    6   10:aload_2         
	//    7   11:invokevirtual   #518 <Method HttpRequest copy(InputStream, OutputStream)>
	//    8   14:pop             
			s = bytearrayoutputstream.toString(getValidCharset(s));
	//    9   15:aload_2         
	//   10   16:aload_1         
	//   11   17:invokestatic    #214 <Method String getValidCharset(String)>
	//   12   20:invokevirtual   #522 <Method String ByteArrayOutputStream.toString(String)>
	//   13   23:astore_1        
		}
	//*  14   24:aload_1         
	//*  15   25:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  16   26:astore_1        
		{
			throw new HttpRequestException(((IOException) (s)));
	//   17   27:new             #36  <Class HttpRequest$HttpRequestException>
	//   18   30:dup             
	//   19   31:aload_1         
	//   20   32:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   21   35:athrow          
		}
		return s;
	}

	public BufferedInputStream buffer()
		throws HttpRequestException
	{
		return new BufferedInputStream(stream(), bufferSize);
	//    0    0:new             #524 <Class BufferedInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #528 <Method InputStream stream()>
	//    4    8:aload_0         
	//    5    9:getfield        #189 <Field int bufferSize>
	//    6   12:invokespecial   #531 <Method void BufferedInputStream(InputStream, int)>
	//    7   15:areturn         
	}

	public int bufferSize()
	{
		return bufferSize;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field int bufferSize>
	//    2    4:ireturn         
	}

	public HttpRequest bufferSize(int i)
	{
		if(i < 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          16
		{
			throw new IllegalArgumentException("Size must be greater than zero");
	//    3    5:new             #292 <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:ldc2            #534 <String "Size must be greater than zero">
	//    6   12:invokespecial   #295 <Method void IllegalArgumentException(String)>
	//    7   15:athrow          
		} else
		{
			bufferSize = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #189 <Field int bufferSize>
			return this;
	//   11   21:aload_0         
	//   12   22:areturn         
		}
	}

	public BufferedReader bufferedReader()
		throws HttpRequestException
	{
		return bufferedReader(charset());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #506 <Method String charset()>
	//    3    5:invokevirtual   #539 <Method BufferedReader bufferedReader(String)>
	//    4    8:areturn         
	}

	public BufferedReader bufferedReader(String s)
		throws HttpRequestException
	{
		return new BufferedReader(((Reader) (reader(s))), bufferSize);
	//    0    0:new             #541 <Class BufferedReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #545 <Method InputStreamReader reader(String)>
	//    5    9:aload_0         
	//    6   10:getfield        #189 <Field int bufferSize>
	//    7   13:invokespecial   #548 <Method void BufferedReader(Reader, int)>
	//    8   16:areturn         
	}

	protected ByteArrayOutputStream byteStream()
	{
		int i = contentLength();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #551 <Method int contentLength()>
	//    2    4:istore_1        
		if(i > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            18
			return new ByteArrayOutputStream(i);
	//    5    9:new             #520 <Class ByteArrayOutputStream>
	//    6   12:dup             
	//    7   13:iload_1         
	//    8   14:invokespecial   #553 <Method void ByteArrayOutputStream(int)>
	//    9   17:areturn         
		else
			return new ByteArrayOutputStream();
	//   10   18:new             #520 <Class ByteArrayOutputStream>
	//   11   21:dup             
	//   12   22:invokespecial   #554 <Method void ByteArrayOutputStream()>
	//   13   25:areturn         
	}

	public byte[] bytes()
		throws HttpRequestException
	{
		ByteArrayOutputStream bytearrayoutputstream = byteStream();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #510 <Method ByteArrayOutputStream byteStream()>
	//    2    4:astore_1        
		try
		{
			copy(((InputStream) (buffer())), ((OutputStream) (bytearrayoutputstream)));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #514 <Method BufferedInputStream buffer()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #518 <Method HttpRequest copy(InputStream, OutputStream)>
	//    8   14:pop             
		}
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #559 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  11   19:areturn         
		catch(IOException ioexception)
	//*  12   20:astore_1        
		{
			throw new HttpRequestException(ioexception);
	//   13   21:new             #36  <Class HttpRequest$HttpRequestException>
	//   14   24:dup             
	//   15   25:aload_1         
	//   16   26:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   17   29:athrow          
		}
		return bytearrayoutputstream.toByteArray();
	}

	public String cacheControl()
	{
		return header("Cache-Control");
	//    0    0:aload_0         
	//    1    1:ldc1            #84  <String "Cache-Control">
	//    2    3:invokevirtual   #562 <Method String header(String)>
	//    3    6:areturn         
	}

	public String charset()
	{
		return parameter("Content-Type", "charset");
	//    0    0:aload_0         
	//    1    1:ldc1            #93  <String "Content-Type">
	//    2    3:ldc1            #147 <String "charset">
	//    3    5:invokevirtual   #565 <Method String parameter(String, String)>
	//    4    8:areturn         
	}

	public HttpRequest chunk(int i)
	{
		getConnection().setChunkedStreamingMode(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #572 <Method void HttpURLConnection.setChunkedStreamingMode(int)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	protected HttpRequest closeOutput()
		throws IOException
	{
		if(output == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//*   2    4:ifnonnull       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		if(multipart)
	//*   5    9:aload_0         
	//*   6   10:getfield        #577 <Field boolean multipart>
	//*   7   13:ifeq            27
			output.write("\r\n--00content0boundary00--\r\n");
	//    8   16:aload_0         
	//    9   17:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//   10   20:ldc2            #579 <String "\r\n--00content0boundary00--\r\n">
	//   11   23:invokevirtual   #583 <Method HttpRequest$RequestOutputStream HttpRequest$RequestOutputStream.write(String)>
	//   12   26:pop             
		if(ignoreCloseExceptions)
	//*  13   27:aload_0         
	//*  14   28:getfield        #185 <Field boolean ignoreCloseExceptions>
	//*  15   31:ifeq            48
			try
			{
				output.close();
	//   16   34:aload_0         
	//   17   35:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//   18   38:invokevirtual   #586 <Method void HttpRequest$RequestOutputStream.close()>
			}
	//*  19   41:aload_0         
	//*  20   42:aconst_null     
	//*  21   43:putfield        #575 <Field HttpRequest$RequestOutputStream output>
	//*  22   46:aload_0         
	//*  23   47:areturn         
	//*  24   48:aload_0         
	//*  25   49:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//*  26   52:invokevirtual   #586 <Method void HttpRequest$RequestOutputStream.close()>
	//*  27   55:goto            41
			catch(IOException ioexception) { }
	//   28   58:astore_1        
		else
			output.close();
		output = null;
		return this;
	//*  29   59:goto            41
	}

	protected HttpRequest closeOutputQuietly()
		throws HttpRequestException
	{
		HttpRequest httprequest;
		try
		{
			httprequest = closeOutput();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #589 <Method HttpRequest closeOutput()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(IOException ioexception)
	//*   5    7:astore_1        
		{
			throw new HttpRequestException(ioexception);
	//    6    8:new             #36  <Class HttpRequest$HttpRequestException>
	//    7   11:dup             
	//    8   12:aload_1         
	//    9   13:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   10   16:athrow          
		}
		return httprequest;
	}

	public int code()
		throws HttpRequestException
	{
		int i;
		try
		{
			closeOutput();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #589 <Method HttpRequest closeOutput()>
	//    2    4:pop             
			i = getConnection().getResponseCode();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    5    9:invokevirtual   #592 <Method int HttpURLConnection.getResponseCode()>
	//    6   12:istore_1        
		}
	//*   7   13:iload_1         
	//*   8   14:ireturn         
		catch(IOException ioexception)
	//*   9   15:astore_2        
		{
			throw new HttpRequestException(ioexception);
	//   10   16:new             #36  <Class HttpRequest$HttpRequestException>
	//   11   19:dup             
	//   12   20:aload_2         
	//   13   21:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   14   24:athrow          
		}
		return i;
	}

	public HttpRequest code(AtomicInteger atomicinteger)
		throws HttpRequestException
	{
		atomicinteger.set(code());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #482 <Method int code()>
	//    3    5:invokevirtual   #597 <Method void AtomicInteger.set(int)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public HttpRequest connectTimeout(int i)
	{
		getConnection().setConnectTimeout(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #601 <Method void HttpURLConnection.setConnectTimeout(int)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public String contentEncoding()
	{
		return header("Content-Encoding");
	//    0    0:aload_0         
	//    1    1:ldc1            #87  <String "Content-Encoding">
	//    2    3:invokevirtual   #562 <Method String header(String)>
	//    3    6:areturn         
	}

	public int contentLength()
	{
		return intHeader("Content-Length");
	//    0    0:aload_0         
	//    1    1:ldc1            #90  <String "Content-Length">
	//    2    3:invokevirtual   #606 <Method int intHeader(String)>
	//    3    6:ireturn         
	}

	public HttpRequest contentLength(int i)
	{
		getConnection().setFixedLengthStreamingMode(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #609 <Method void HttpURLConnection.setFixedLengthStreamingMode(int)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public HttpRequest contentLength(String s)
	{
		return contentLength(Integer.parseInt(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #612 <Method int Integer.parseInt(String)>
	//    3    5:invokevirtual   #614 <Method HttpRequest contentLength(int)>
	//    4    8:areturn         
	}

	public HttpRequest contentType(String s)
	{
		return contentType(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #617 <Method HttpRequest contentType(String, String)>
	//    4    6:areturn         
	}

	public HttpRequest contentType(String s, String s1)
	{
		if(s1 != null && s1.length() > 0)
	//*   0    0:aload_2         
	//*   1    1:ifnull          42
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #387 <Method int String.length()>
	//*   4    8:ifle            42
			return header("Content-Type", (new StringBuilder()).append(s).append("; charset=").append(s1).toString());
	//    5   11:aload_0         
	//    6   12:ldc1            #93  <String "Content-Type">
	//    7   14:new             #224 <Class StringBuilder>
	//    8   17:dup             
	//    9   18:invokespecial   #364 <Method void StringBuilder()>
	//   10   21:aload_1         
	//   11   22:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:ldc2            #619 <String "; charset=">
	//   13   28:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   14   31:aload_2         
	//   15   32:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   16   35:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   17   38:invokevirtual   #468 <Method HttpRequest header(String, String)>
	//   18   41:areturn         
		else
			return header("Content-Type", s);
	//   19   42:aload_0         
	//   20   43:ldc1            #93  <String "Content-Type">
	//   21   45:aload_1         
	//   22   46:invokevirtual   #468 <Method HttpRequest header(String, String)>
	//   23   49:areturn         
	}

	public String contentType()
	{
		return header("Content-Type");
	//    0    0:aload_0         
	//    1    1:ldc1            #93  <String "Content-Type">
	//    2    3:invokevirtual   #562 <Method String header(String)>
	//    3    6:areturn         
	}

	protected HttpRequest copy(final InputStream final_closeable, OutputStream outputstream)
		throws IOException
	{
		return (HttpRequest)((_cls6) (new CloseOperation(final_closeable, outputstream) {

			public HttpRequest run()
				throws IOException
			{
				byte abyte0[] = new byte[bufferSize];
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field HttpRequest this$0>
			//    2    4:invokestatic    #36  <Method int HttpRequest.access$100(HttpRequest)>
			//    3    7:newarray        byte[]
			//    4    9:astore_2        
				do
				{
					int i = input.read(abyte0);
			//    5   10:aload_0         
			//    6   11:getfield        #22  <Field InputStream val$input>
			//    7   14:aload_2         
			//    8   15:invokevirtual   #42  <Method int InputStream.read(byte[])>
			//    9   18:istore_1        
					if(i != -1)
			//*  10   19:iload_1         
			//*  11   20:iconst_m1       
			//*  12   21:icmpeq          37
						output.write(abyte0, 0, i);
			//   13   24:aload_0         
			//   14   25:getfield        #24  <Field OutputStream val$output>
			//   15   28:aload_2         
			//   16   29:iconst_0        
			//   17   30:iload_1         
			//   18   31:invokevirtual   #48  <Method void OutputStream.write(byte[], int, int)>
					else
			//*  19   34:goto            10
						return HttpRequest.this;
			//   20   37:aload_0         
			//   21   38:getfield        #20  <Field HttpRequest this$0>
			//   22   41:areturn         
				} while(true);
			}

			public volatile Object run()
				throws HttpRequestException, IOException
			{
				return ((Object) (run()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #54  <Method HttpRequest run()>
			//    2    4:areturn         
			}

			final HttpRequest this$0;
			final InputStream val$input;
			final OutputStream val$output;

			
			{
				this$0 = HttpRequest.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field HttpRequest this$0>
				input = inputstream;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #22  <Field InputStream val$input>
				output = outputstream;
			//    6   11:aload_0         
			//    7   12:aload           5
			//    8   14:putfield        #24  <Field OutputStream val$output>
				super(final_closeable, final_flag);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:iload_3         
			//   12   20:invokespecial   #27  <Method void HttpRequest$CloseOperation(Closeable, boolean)>
			//   13   23:return          
			}
		}
)).call();
	//    0    0:new             #16  <Class HttpRequest$6>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #185 <Field boolean ignoreCloseExceptions>
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #622 <Method void HttpRequest$6(HttpRequest, Closeable, boolean, InputStream, OutputStream)>
	//    9   15:invokevirtual   #625 <Method Object HttpRequest$6.call()>
	//   10   18:checkcast       #2   <Class HttpRequest>
	//   11   21:areturn         
	}

	protected HttpRequest copy(final Reader final_closeable, Writer writer1)
		throws IOException
	{
		return (HttpRequest)((_cls7) (new CloseOperation(final_closeable, writer1) {

			public HttpRequest run()
				throws IOException
			{
				char ac[] = new char[bufferSize];
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field HttpRequest this$0>
			//    2    4:invokestatic    #36  <Method int HttpRequest.access$100(HttpRequest)>
			//    3    7:newarray        char[]
			//    4    9:astore_2        
				do
				{
					int i = input.read(ac);
			//    5   10:aload_0         
			//    6   11:getfield        #22  <Field Reader val$input>
			//    7   14:aload_2         
			//    8   15:invokevirtual   #42  <Method int Reader.read(char[])>
			//    9   18:istore_1        
					if(i != -1)
			//*  10   19:iload_1         
			//*  11   20:iconst_m1       
			//*  12   21:icmpeq          37
						output.write(ac, 0, i);
			//   13   24:aload_0         
			//   14   25:getfield        #24  <Field Writer val$output>
			//   15   28:aload_2         
			//   16   29:iconst_0        
			//   17   30:iload_1         
			//   18   31:invokevirtual   #48  <Method void Writer.write(char[], int, int)>
					else
			//*  19   34:goto            10
						return HttpRequest.this;
			//   20   37:aload_0         
			//   21   38:getfield        #20  <Field HttpRequest this$0>
			//   22   41:areturn         
				} while(true);
			}

			public volatile Object run()
				throws HttpRequestException, IOException
			{
				return ((Object) (run()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #54  <Method HttpRequest run()>
			//    2    4:areturn         
			}

			final HttpRequest this$0;
			final Reader val$input;
			final Writer val$output;

			
			{
				this$0 = HttpRequest.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field HttpRequest this$0>
				input = reader1;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #22  <Field Reader val$input>
				output = writer1;
			//    6   11:aload_0         
			//    7   12:aload           5
			//    8   14:putfield        #24  <Field Writer val$output>
				super(final_closeable, final_flag);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:iload_3         
			//   12   20:invokespecial   #27  <Method void HttpRequest$CloseOperation(Closeable, boolean)>
			//   13   23:return          
			}
		}
)).call();
	//    0    0:new             #18  <Class HttpRequest$7>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #185 <Field boolean ignoreCloseExceptions>
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #629 <Method void HttpRequest$7(HttpRequest, Closeable, boolean, Reader, Writer)>
	//    9   15:invokevirtual   #630 <Method Object HttpRequest$7.call()>
	//   10   18:checkcast       #2   <Class HttpRequest>
	//   11   21:areturn         
	}

	public boolean created()
		throws HttpRequestException
	{
		return 201 == code();
	//    0    0:sipush          201
	//    1    3:aload_0         
	//    2    4:invokevirtual   #482 <Method int code()>
	//    3    7:icmpne          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public long date()
	{
		return dateHeader("Date");
	//    0    0:aload_0         
	//    1    1:ldc1            #96  <String "Date">
	//    2    3:invokevirtual   #637 <Method long dateHeader(String)>
	//    3    6:lreturn         
	}

	public long dateHeader(String s)
		throws HttpRequestException
	{
		return dateHeader(s, -1L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2w           #638 <Long -1L>
	//    3    5:invokevirtual   #642 <Method long dateHeader(String, long)>
	//    4    8:lreturn         
	}

	public long dateHeader(String s, long l)
		throws HttpRequestException
	{
		closeOutputQuietly();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #644 <Method HttpRequest closeOutputQuietly()>
	//    2    4:pop             
		return getConnection().getHeaderFieldDate(s, l);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    5    9:aload_1         
	//    6   10:lload_2         
	//    7   11:invokevirtual   #647 <Method long HttpURLConnection.getHeaderFieldDate(String, long)>
	//    8   14:lreturn         
	}

	public HttpRequest disconnect()
	{
		getConnection().disconnect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    2    4:invokevirtual   #650 <Method void HttpURLConnection.disconnect()>
		return this;
	//    3    7:aload_0         
	//    4    8:areturn         
	}

	public String eTag()
	{
		return header("ETag");
	//    0    0:aload_0         
	//    1    1:ldc1            #99  <String "ETag">
	//    2    3:invokevirtual   #562 <Method String header(String)>
	//    3    6:areturn         
	}

	public long expires()
	{
		return dateHeader("Expires");
	//    0    0:aload_0         
	//    1    1:ldc1            #102 <String "Expires">
	//    2    3:invokevirtual   #637 <Method long dateHeader(String)>
	//    3    6:lreturn         
	}

	public HttpRequest followRedirects(boolean flag)
	{
		getConnection().setInstanceFollowRedirects(flag);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #657 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public HttpRequest form(Object obj, Object obj1)
		throws HttpRequestException
	{
		return form(obj, obj1, "UTF-8");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #50  <String "UTF-8">
	//    4    5:invokevirtual   #661 <Method HttpRequest form(Object, Object, String)>
	//    5    8:areturn         
	}

	public HttpRequest form(Object obj, Object obj1, String s)
		throws HttpRequestException
	{
		boolean flag;
		if(!form)
	//*   0    0:aload_0         
	//*   1    1:getfield        #663 <Field boolean form>
	//*   2    4:ifne            99
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore          4
		else
	//*   5   10:iload           4
	//*   6   12:ifeq            28
	//*   7   15:aload_0         
	//*   8   16:ldc1            #55  <String "application/x-www-form-urlencoded">
	//*   9   18:aload_3         
	//*  10   19:invokevirtual   #617 <Method HttpRequest contentType(String, String)>
	//*  11   22:pop             
	//*  12   23:aload_0         
	//*  13   24:iconst_1        
	//*  14   25:putfield        #663 <Field boolean form>
	//*  15   28:aload_3         
	//*  16   29:invokestatic    #214 <Method String getValidCharset(String)>
	//*  17   32:astore_3        
	//*  18   33:aload_0         
	//*  19   34:invokevirtual   #666 <Method HttpRequest openOutput()>
	//*  20   37:pop             
	//*  21   38:iload           4
	//*  22   40:ifne            52
	//*  23   43:aload_0         
	//*  24   44:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//*  25   47:bipush          38
	//*  26   49:invokevirtual   #668 <Method void HttpRequest$RequestOutputStream.write(int)>
	//*  27   52:aload_0         
	//*  28   53:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//*  29   56:aload_1         
	//*  30   57:invokevirtual   #274 <Method String Object.toString()>
	//*  31   60:aload_3         
	//*  32   61:invokestatic    #672 <Method String URLEncoder.encode(String, String)>
	//*  33   64:invokevirtual   #583 <Method HttpRequest$RequestOutputStream HttpRequest$RequestOutputStream.write(String)>
	//*  34   67:pop             
	//*  35   68:aload_0         
	//*  36   69:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//*  37   72:bipush          61
	//*  38   74:invokevirtual   #668 <Method void HttpRequest$RequestOutputStream.write(int)>
	//*  39   77:aload_2         
	//*  40   78:ifnull          97
	//*  41   81:aload_0         
	//*  42   82:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//*  43   85:aload_2         
	//*  44   86:invokevirtual   #274 <Method String Object.toString()>
	//*  45   89:aload_3         
	//*  46   90:invokestatic    #672 <Method String URLEncoder.encode(String, String)>
	//*  47   93:invokevirtual   #583 <Method HttpRequest$RequestOutputStream HttpRequest$RequestOutputStream.write(String)>
	//*  48   96:pop             
	//*  49   97:aload_0         
	//*  50   98:areturn         
			flag = false;
	//   51   99:iconst_0        
	//   52  100:istore          4
		if(flag)
		{
			contentType("application/x-www-form-urlencoded", s);
			form = true;
		}
		s = getValidCharset(s);
		try
		{
			openOutput();
		}
	//*  53  102:goto            10
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  54  105:astore_1        
		{
			throw new HttpRequestException(((IOException) (obj)));
	//   55  106:new             #36  <Class HttpRequest$HttpRequestException>
	//   56  109:dup             
	//   57  110:aload_1         
	//   58  111:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   59  114:athrow          
		}
		if(flag)
			break MISSING_BLOCK_LABEL_52;
		output.write(38);
		output.write(URLEncoder.encode(obj.toString(), s));
		output.write(61);
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_97;
		output.write(URLEncoder.encode(obj1.toString(), s));
		return this;
	}

	public HttpRequest form(java.util.Map.Entry entry)
		throws HttpRequestException
	{
		return form(entry, "UTF-8");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #50  <String "UTF-8">
	//    3    4:invokevirtual   #676 <Method HttpRequest form(java.util.Map$Entry, String)>
	//    4    7:areturn         
	}

	public HttpRequest form(java.util.Map.Entry entry, String s)
		throws HttpRequestException
	{
		return form(entry.getKey(), entry.getValue(), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #273 <Method Object java.util.Map$Entry.getKey()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #280 <Method Object java.util.Map$Entry.getValue()>
	//    5   13:aload_2         
	//    6   14:invokevirtual   #661 <Method HttpRequest form(Object, Object, String)>
	//    7   17:areturn         
	}

	public HttpRequest form(Map map)
		throws HttpRequestException
	{
		return form(map, "UTF-8");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #50  <String "UTF-8">
	//    3    4:invokevirtual   #682 <Method HttpRequest form(Map, String)>
	//    4    7:areturn         
	}

	public HttpRequest form(Map map, String s)
		throws HttpRequestException
	{
		if(!map.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #247 <Method boolean Map.isEmpty()>
	//*   2    6:ifne            48
			for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); form((java.util.Map.Entry)((Iterator) (map)).next(), s));
	//    3    9:aload_1         
	//    4   10:invokeinterface #256 <Method Set Map.entrySet()>
	//    5   15:invokeinterface #262 <Method Iterator Set.iterator()>
	//    6   20:astore_1        
	//    7   21:aload_1         
	//    8   22:invokeinterface #286 <Method boolean Iterator.hasNext()>
	//    9   27:ifeq            48
	//   10   30:aload_0         
	//   11   31:aload_1         
	//   12   32:invokeinterface #268 <Method Object Iterator.next()>
	//   13   37:checkcast       #270 <Class java.util.Map$Entry>
	//   14   40:aload_2         
	//   15   41:invokevirtual   #676 <Method HttpRequest form(java.util.Map$Entry, String)>
	//   16   44:pop             
	//*  17   45:goto            21
		return this;
	//   18   48:aload_0         
	//   19   49:areturn         
	}

	public HttpURLConnection getConnection()
	{
		if(connection == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field HttpURLConnection connection>
	//*   2    4:ifnonnull       15
			connection = createConnection();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #686 <Method HttpURLConnection createConnection()>
	//    6   12:putfield        #183 <Field HttpURLConnection connection>
		return connection;
	//    7   15:aload_0         
	//    8   16:getfield        #183 <Field HttpURLConnection connection>
	//    9   19:areturn         
	}

	protected String getParam(String s, String s1)
	{
		if(s != null && s.length() != 0) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          11
	//    2    4:aload_1         
	//    3    5:invokevirtual   #387 <Method int String.length()>
	//    4    8:ifne            15
_L1:
		s = null;
	//    5   11:aconst_null     
	//    6   12:astore_1        
_L4:
		return s;
	//    7   13:aload_1         
	//    8   14:areturn         
_L2:
		int j = s.length();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #387 <Method int String.length()>
	//   11   19:istore          4
		int l = s.indexOf(';') + 1;
	//   12   21:aload_1         
	//   13   22:bipush          59
	//   14   24:invokevirtual   #222 <Method int String.indexOf(int)>
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:istore          6
		if(l == 0 || l == j)
	//*  18   31:iload           6
	//*  19   33:ifeq            43
	//*  20   36:iload           6
	//*  21   38:iload           4
	//*  22   40:icmpne          45
			return null;
	//   23   43:aconst_null     
	//   24   44:areturn         
		int j1 = s.indexOf(';', l);
	//   25   45:aload_1         
	//   26   46:bipush          59
	//   27   48:iload           6
	//   28   50:invokevirtual   #690 <Method int String.indexOf(int, int)>
	//   29   53:istore          7
		int i = j1;
	//   30   55:iload           7
	//   31   57:istore_3        
		int k = l;
	//   32   58:iload           6
	//   33   60:istore          5
		if(j1 == -1)
	//*  34   62:iload           7
	//*  35   64:iconst_m1       
	//*  36   65:icmpne          75
		{
			i = j;
	//   37   68:iload           4
	//   38   70:istore_3        
			k = l;
	//   39   71:iload           6
	//   40   73:istore          5
		}
		do
		{
			if(k >= i)
				break;
	//   41   75:iload           5
	//   42   77:iload_3         
	//   43   78:icmpge          236
			int i1 = s.indexOf('=', k);
	//   44   81:aload_1         
	//   45   82:bipush          61
	//   46   84:iload           5
	//   47   86:invokevirtual   #690 <Method int String.indexOf(int, int)>
	//   48   89:istore          6
			if(i1 != -1 && i1 < i && s1.equals(((Object) (s.substring(k, i1).trim()))))
	//*  49   91:iload           6
	//*  50   93:iconst_m1       
	//*  51   94:icmpeq          198
	//*  52   97:iload           6
	//*  53   99:iload_3         
	//*  54  100:icmpge          198
	//*  55  103:aload_2         
	//*  56  104:aload_1         
	//*  57  105:iload           5
	//*  58  107:iload           6
	//*  59  109:invokevirtual   #391 <Method String String.substring(int, int)>
	//*  60  112:invokevirtual   #693 <Method String String.trim()>
	//*  61  115:invokevirtual   #697 <Method boolean String.equals(Object)>
	//*  62  118:ifeq            198
			{
				String s2 = s.substring(i1 + 1, i).trim();
	//   63  121:aload_1         
	//   64  122:iload           6
	//   65  124:iconst_1        
	//   66  125:iadd            
	//   67  126:iload_3         
	//   68  127:invokevirtual   #391 <Method String String.substring(int, int)>
	//   69  130:invokevirtual   #693 <Method String String.trim()>
	//   70  133:astore          8
				k = s2.length();
	//   71  135:aload           8
	//   72  137:invokevirtual   #387 <Method int String.length()>
	//   73  140:istore          5
				if(k != 0)
	//*  74  142:iload           5
	//*  75  144:ifeq            198
				{
					s = s2;
	//   76  147:aload           8
	//   77  149:astore_1        
					if(k > 2)
	//*  78  150:iload           5
	//*  79  152:iconst_2        
	//*  80  153:icmple          13
					{
						s = s2;
	//   81  156:aload           8
	//   82  158:astore_1        
						if('"' == s2.charAt(0))
	//*  83  159:bipush          34
	//*  84  161:aload           8
	//*  85  163:iconst_0        
	//*  86  164:invokevirtual   #236 <Method char String.charAt(int)>
	//*  87  167:icmpne          13
						{
							s = s2;
	//   88  170:aload           8
	//   89  172:astore_1        
							if('"' == s2.charAt(k - 1))
	//*  90  173:bipush          34
	//*  91  175:aload           8
	//*  92  177:iload           5
	//*  93  179:iconst_1        
	//*  94  180:isub            
	//*  95  181:invokevirtual   #236 <Method char String.charAt(int)>
	//*  96  184:icmpne          13
								return s2.substring(1, k - 1);
	//   97  187:aload           8
	//   98  189:iconst_1        
	//   99  190:iload           5
	//  100  192:iconst_1        
	//  101  193:isub            
	//  102  194:invokevirtual   #391 <Method String String.substring(int, int)>
	//  103  197:areturn         
						}
					}
					continue; /* Loop/switch isn't completed */
				}
			}
			i1 = i + 1;
	//  104  198:iload_3         
	//  105  199:iconst_1        
	//  106  200:iadd            
	//  107  201:istore          6
			int k1 = s.indexOf(';', i1);
	//  108  203:aload_1         
	//  109  204:bipush          59
	//  110  206:iload           6
	//  111  208:invokevirtual   #690 <Method int String.indexOf(int, int)>
	//  112  211:istore          7
			i = k1;
	//  113  213:iload           7
	//  114  215:istore_3        
			k = i1;
	//  115  216:iload           6
	//  116  218:istore          5
			if(k1 == -1)
	//* 117  220:iload           7
	//* 118  222:iconst_m1       
	//* 119  223:icmpne          75
			{
				i = j;
	//  120  226:iload           4
	//  121  228:istore_3        
				k = i1;
	//  122  229:iload           6
	//  123  231:istore          5
			}
		} while(true);
	//  124  233:goto            75
		return null;
	//  125  236:aconst_null     
	//  126  237:areturn         
		if(true) goto _L4; else goto _L3
_L3:
	}

	protected Map getParams(String s)
	{
		if(s != null && s.length() != 0) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          11
	//    2    4:aload_1         
	//    3    5:invokevirtual   #387 <Method int String.length()>
	//    4    8:ifne            19
_L1:
		Object obj = ((Object) (Collections.emptyMap()));
	//    5   11:invokestatic    #705 <Method Map Collections.emptyMap()>
	//    6   14:astore          7
_L4:
		return ((Map) (obj));
	//    7   16:aload           7
	//    8   18:areturn         
_L2:
		int j = s.length();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #387 <Method int String.length()>
	//   11   23:istore_3        
		int k = s.indexOf(';') + 1;
	//   12   24:aload_1         
	//   13   25:bipush          59
	//   14   27:invokevirtual   #222 <Method int String.indexOf(int)>
	//   15   30:iconst_1        
	//   16   31:iadd            
	//   17   32:istore          4
		if(k == 0 || k == j)
	//*  18   34:iload           4
	//*  19   36:ifeq            45
	//*  20   39:iload           4
	//*  21   41:iload_3         
	//*  22   42:icmpne          49
			return Collections.emptyMap();
	//   23   45:invokestatic    #705 <Method Map Collections.emptyMap()>
	//   24   48:areturn         
		int l = s.indexOf(';', k);
	//   25   49:aload_1         
	//   26   50:bipush          59
	//   27   52:iload           4
	//   28   54:invokevirtual   #690 <Method int String.indexOf(int, int)>
	//   29   57:istore          5
		int i = l;
	//   30   59:iload           5
	//   31   61:istore_2        
		if(l == -1)
	//*  32   62:iload           5
	//*  33   64:iconst_m1       
	//*  34   65:icmpne          70
			i = j;
	//   35   68:iload_3         
	//   36   69:istore_2        
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//   37   70:new             #707 <Class LinkedHashMap>
	//   38   73:dup             
	//   39   74:invokespecial   #708 <Method void LinkedHashMap()>
	//   40   77:astore          8
		do
		{
			obj = ((Object) (linkedhashmap));
	//   41   79:aload           8
	//   42   81:astore          7
			if(k >= i)
				continue;
	//   43   83:iload           4
	//   44   85:iload_2         
	//   45   86:icmpge          16
			int i1 = s.indexOf('=', k);
	//   46   89:aload_1         
	//   47   90:bipush          61
	//   48   92:iload           4
	//   49   94:invokevirtual   #690 <Method int String.indexOf(int, int)>
	//   50   97:istore          5
			if(i1 != -1 && i1 < i)
	//*  51   99:iload           5
	//*  52  101:iconst_m1       
	//*  53  102:icmpeq          209
	//*  54  105:iload           5
	//*  55  107:iload_2         
	//*  56  108:icmpge          209
			{
				String s1 = s.substring(k, i1).trim();
	//   57  111:aload_1         
	//   58  112:iload           4
	//   59  114:iload           5
	//   60  116:invokevirtual   #391 <Method String String.substring(int, int)>
	//   61  119:invokevirtual   #693 <Method String String.trim()>
	//   62  122:astore          7
				if(s1.length() > 0)
	//*  63  124:aload           7
	//*  64  126:invokevirtual   #387 <Method int String.length()>
	//*  65  129:ifle            209
				{
					String s2 = s.substring(i1 + 1, i).trim();
	//   66  132:aload_1         
	//   67  133:iload           5
	//   68  135:iconst_1        
	//   69  136:iadd            
	//   70  137:iload_2         
	//   71  138:invokevirtual   #391 <Method String String.substring(int, int)>
	//   72  141:invokevirtual   #693 <Method String String.trim()>
	//   73  144:astore          9
					k = s2.length();
	//   74  146:aload           9
	//   75  148:invokevirtual   #387 <Method int String.length()>
	//   76  151:istore          4
					int j1;
					if(k != 0)
	//*  77  153:iload           4
	//*  78  155:ifeq            209
						if(k > 2 && '"' == s2.charAt(0) && '"' == s2.charAt(k - 1))
	//*  79  158:iload           4
	//*  80  160:iconst_2        
	//*  81  161:icmple          246
	//*  82  164:bipush          34
	//*  83  166:aload           9
	//*  84  168:iconst_0        
	//*  85  169:invokevirtual   #236 <Method char String.charAt(int)>
	//*  86  172:icmpne          246
	//*  87  175:bipush          34
	//*  88  177:aload           9
	//*  89  179:iload           4
	//*  90  181:iconst_1        
	//*  91  182:isub            
	//*  92  183:invokevirtual   #236 <Method char String.charAt(int)>
	//*  93  186:icmpne          246
							((Map) (linkedhashmap)).put(((Object) (s1)), ((Object) (s2.substring(1, k - 1))));
	//   94  189:aload           8
	//   95  191:aload           7
	//   96  193:aload           9
	//   97  195:iconst_1        
	//   98  196:iload           4
	//   99  198:iconst_1        
	//  100  199:isub            
	//  101  200:invokevirtual   #391 <Method String String.substring(int, int)>
	//  102  203:invokeinterface #711 <Method Object Map.put(Object, Object)>
	//  103  208:pop             
						else
	//* 104  209:iload_2         
	//* 105  210:iconst_1        
	//* 106  211:iadd            
	//* 107  212:istore          5
	//* 108  214:aload_1         
	//* 109  215:bipush          59
	//* 110  217:iload           5
	//* 111  219:invokevirtual   #690 <Method int String.indexOf(int, int)>
	//* 112  222:istore          6
	//* 113  224:iload           6
	//* 114  226:istore_2        
	//* 115  227:iload           5
	//* 116  229:istore          4
	//* 117  231:iload           6
	//* 118  233:iconst_m1       
	//* 119  234:icmpne          79
	//* 120  237:iload_3         
	//* 121  238:istore_2        
	//* 122  239:iload           5
	//* 123  241:istore          4
	//* 124  243:goto            79
							((Map) (linkedhashmap)).put(((Object) (s1)), ((Object) (s2)));
	//  125  246:aload           8
	//  126  248:aload           7
	//  127  250:aload           9
	//  128  252:invokeinterface #711 <Method Object Map.put(Object, Object)>
	//  129  257:pop             
				}
			}
			i1 = i + 1;
			j1 = s.indexOf(';', i1);
			i = j1;
			k = i1;
			if(j1 == -1)
			{
				i = j;
				k = i1;
			}
		} while(true);
	//  130  258:goto            209
		if(true) goto _L4; else goto _L3
_L3:
	}

	public HttpRequest header(String s, Number number)
	{
		if(number != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          16
			number = ((Number) (((Object) (number)).toString()));
	//    2    4:aload_2         
	//    3    5:invokevirtual   #274 <Method String Object.toString()>
	//    4    8:astore_2        
		else
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #468 <Method HttpRequest header(String, String)>
	//*   9   15:areturn         
			number = null;
	//   10   16:aconst_null     
	//   11   17:astore_2        
		return header(s, ((String) (number)));
	//*  12   18:goto            9
	}

	public HttpRequest header(String s, String s1)
	{
		getConnection().setRequestProperty(s, s1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #716 <Method void HttpURLConnection.setRequestProperty(String, String)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public HttpRequest header(java.util.Map.Entry entry)
	{
		return header((String)entry.getKey(), (String)entry.getValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #273 <Method Object java.util.Map$Entry.getKey()>
	//    3    7:checkcast       #167 <Class String>
	//    4   10:aload_1         
	//    5   11:invokeinterface #280 <Method Object java.util.Map$Entry.getValue()>
	//    6   16:checkcast       #167 <Class String>
	//    7   19:invokevirtual   #468 <Method HttpRequest header(String, String)>
	//    8   22:areturn         
	}

	public String header(String s)
		throws HttpRequestException
	{
		closeOutputQuietly();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #644 <Method HttpRequest closeOutputQuietly()>
	//    2    4:pop             
		return getConnection().getHeaderField(s);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #720 <Method String HttpURLConnection.getHeaderField(String)>
	//    7   13:areturn         
	}

	public HttpRequest headers(Map map)
	{
		if(!map.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #247 <Method boolean Map.isEmpty()>
	//*   2    6:ifne            47
			for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); header((java.util.Map.Entry)((Iterator) (map)).next()));
	//    3    9:aload_1         
	//    4   10:invokeinterface #256 <Method Set Map.entrySet()>
	//    5   15:invokeinterface #262 <Method Iterator Set.iterator()>
	//    6   20:astore_1        
	//    7   21:aload_1         
	//    8   22:invokeinterface #286 <Method boolean Iterator.hasNext()>
	//    9   27:ifeq            47
	//   10   30:aload_0         
	//   11   31:aload_1         
	//   12   32:invokeinterface #268 <Method Object Iterator.next()>
	//   13   37:checkcast       #270 <Class java.util.Map$Entry>
	//   14   40:invokevirtual   #723 <Method HttpRequest header(java.util.Map$Entry)>
	//   15   43:pop             
	//*  16   44:goto            21
		return this;
	//   17   47:aload_0         
	//   18   48:areturn         
	}

	public Map headers()
		throws HttpRequestException
	{
		closeOutputQuietly();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #644 <Method HttpRequest closeOutputQuietly()>
	//    2    4:pop             
		return getConnection().getHeaderFields();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    5    9:invokevirtual   #727 <Method Map HttpURLConnection.getHeaderFields()>
	//    6   12:areturn         
	}

	public String[] headers(String s)
	{
		Map map = headers();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #731 <Method Map headers()>
	//    2    4:astore_2        
		if(map == null || map.isEmpty())
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
	//*   5    9:aload_2         
	//*   6   10:invokeinterface #247 <Method boolean Map.isEmpty()>
	//*   7   15:ifeq            22
			return EMPTY_STRINGS;
	//    8   18:getstatic       #169 <Field String[] EMPTY_STRINGS>
	//    9   21:areturn         
		s = ((String) ((List)map.get(((Object) (s)))));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokeinterface #734 <Method Object Map.get(Object)>
	//   13   29:checkcast       #736 <Class List>
	//   14   32:astore_1        
		if(s != null && !((List) (s)).isEmpty())
	//*  15   33:aload_1         
	//*  16   34:ifnull          65
	//*  17   37:aload_1         
	//*  18   38:invokeinterface #737 <Method boolean List.isEmpty()>
	//*  19   43:ifne            65
			return (String[])((List) (s)).toArray(((Object []) (new String[((List) (s)).size()])));
	//   20   46:aload_1         
	//   21   47:aload_1         
	//   22   48:invokeinterface #740 <Method int List.size()>
	//   23   53:anewarray       String[]
	//   24   56:invokeinterface #744 <Method Object[] List.toArray(Object[])>
	//   25   61:checkcast       #745 <Class String[]>
	//   26   64:areturn         
		else
			return EMPTY_STRINGS;
	//   27   65:getstatic       #169 <Field String[] EMPTY_STRINGS>
	//   28   68:areturn         
	}

	public HttpRequest ifModifiedSince(long l)
	{
		getConnection().setIfModifiedSince(l);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #751 <Method void HttpURLConnection.setIfModifiedSince(long)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public HttpRequest ifNoneMatch(String s)
	{
		return header("If-None-Match", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #105 <String "If-None-Match">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #468 <Method HttpRequest header(String, String)>
	//    4    7:areturn         
	}

	public HttpRequest ignoreCloseExceptions(boolean flag)
	{
		ignoreCloseExceptions = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #185 <Field boolean ignoreCloseExceptions>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public boolean ignoreCloseExceptions()
	{
		return ignoreCloseExceptions;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field boolean ignoreCloseExceptions>
	//    2    4:ireturn         
	}

	public int intHeader(String s)
		throws HttpRequestException
	{
		return intHeader(s, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #755 <Method int intHeader(String, int)>
	//    4    6:ireturn         
	}

	public int intHeader(String s, int i)
		throws HttpRequestException
	{
		closeOutputQuietly();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #644 <Method HttpRequest closeOutputQuietly()>
	//    2    4:pop             
		return getConnection().getHeaderFieldInt(s, i);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokevirtual   #758 <Method int HttpURLConnection.getHeaderFieldInt(String, int)>
	//    8   14:ireturn         
	}

	public boolean isBodyEmpty()
		throws HttpRequestException
	{
		return contentLength() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #551 <Method int contentLength()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public long lastModified()
	{
		return dateHeader("Last-Modified");
	//    0    0:aload_0         
	//    1    1:ldc1            #108 <String "Last-Modified">
	//    2    3:invokevirtual   #637 <Method long dateHeader(String)>
	//    3    6:lreturn         
	}

	public String location()
	{
		return header("Location");
	//    0    0:aload_0         
	//    1    1:ldc1            #111 <String "Location">
	//    2    3:invokevirtual   #562 <Method String header(String)>
	//    3    6:areturn         
	}

	public String message()
		throws HttpRequestException
	{
		String s;
		try
		{
			closeOutput();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #589 <Method HttpRequest closeOutput()>
	//    2    4:pop             
			s = getConnection().getResponseMessage();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    5    9:invokevirtual   #765 <Method String HttpURLConnection.getResponseMessage()>
	//    6   12:astore_1        
		}
	//*   7   13:aload_1         
	//*   8   14:areturn         
		catch(IOException ioexception)
	//*   9   15:astore_1        
		{
			throw new HttpRequestException(ioexception);
	//   10   16:new             #36  <Class HttpRequest$HttpRequestException>
	//   11   19:dup             
	//   12   20:aload_1         
	//   13   21:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   14   24:athrow          
		}
		return s;
	}

	public String method()
	{
		return getConnection().getRequestMethod();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    2    4:invokevirtual   #769 <Method String HttpURLConnection.getRequestMethod()>
	//    3    7:areturn         
	}

	public boolean notFound()
		throws HttpRequestException
	{
		return 404 == code();
	//    0    0:sipush          404
	//    1    3:aload_0         
	//    2    4:invokevirtual   #482 <Method int code()>
	//    3    7:icmpne          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean notModified()
		throws HttpRequestException
	{
		return 304 == code();
	//    0    0:sipush          304
	//    1    3:aload_0         
	//    2    4:invokevirtual   #482 <Method int code()>
	//    3    7:icmpne          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean ok()
		throws HttpRequestException
	{
		return 200 == code();
	//    0    0:sipush          200
	//    1    3:aload_0         
	//    2    4:invokevirtual   #482 <Method int code()>
	//    3    7:icmpne          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	protected HttpRequest openOutput()
		throws IOException
	{
		if(output != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//*   2    4:ifnull          9
		{
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		} else
		{
			getConnection().setDoOutput(true);
	//    5    9:aload_0         
	//    6   10:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #775 <Method void HttpURLConnection.setDoOutput(boolean)>
			String s = getParam(getConnection().getRequestProperty("Content-Type"), "charset");
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//   12   22:ldc1            #93  <String "Content-Type">
	//   13   24:invokevirtual   #778 <Method String HttpURLConnection.getRequestProperty(String)>
	//   14   27:ldc1            #147 <String "charset">
	//   15   29:invokevirtual   #780 <Method String getParam(String, String)>
	//   16   32:astore_1        
			output = new RequestOutputStream(getConnection().getOutputStream(), s, bufferSize);
	//   17   33:aload_0         
	//   18   34:new             #42  <Class HttpRequest$RequestOutputStream>
	//   19   37:dup             
	//   20   38:aload_0         
	//   21   39:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//   22   42:invokevirtual   #784 <Method OutputStream HttpURLConnection.getOutputStream()>
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:getfield        #189 <Field int bufferSize>
	//   26   50:invokespecial   #787 <Method void HttpRequest$RequestOutputStream(OutputStream, String, int)>
	//   27   53:putfield        #575 <Field HttpRequest$RequestOutputStream output>
			return this;
	//   28   56:aload_0         
	//   29   57:areturn         
		}
	}

	public String parameter(String s, String s1)
	{
		return getParam(header(s), s1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #562 <Method String header(String)>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #780 <Method String getParam(String, String)>
	//    6   10:areturn         
	}

	public Map parameters(String s)
	{
		return getParams(header(s));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #562 <Method String header(String)>
	//    4    6:invokevirtual   #790 <Method Map getParams(String)>
	//    5    9:areturn         
	}

	public HttpRequest part(String s, File file)
		throws HttpRequestException
	{
		return part(s, ((String) (null)), file);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokevirtual   #795 <Method HttpRequest part(String, String, File)>
	//    5    7:areturn         
	}

	public HttpRequest part(String s, InputStream inputstream)
		throws HttpRequestException
	{
		return part(s, ((String) (null)), ((String) (null)), inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:aload_2         
	//    5    5:invokevirtual   #799 <Method HttpRequest part(String, String, String, InputStream)>
	//    6    8:areturn         
	}

	public HttpRequest part(String s, Number number)
		throws HttpRequestException
	{
		return part(s, ((String) (null)), number);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokevirtual   #802 <Method HttpRequest part(String, String, Number)>
	//    5    7:areturn         
	}

	public HttpRequest part(String s, String s1)
	{
		return part(s, ((String) (null)), s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokevirtual   #805 <Method HttpRequest part(String, String, String)>
	//    5    7:areturn         
	}

	public HttpRequest part(String s, String s1, File file)
		throws HttpRequestException
	{
		return part(s, s1, ((String) (null)), file);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:invokevirtual   #808 <Method HttpRequest part(String, String, String, File)>
	//    6    8:areturn         
	}

	public HttpRequest part(String s, String s1, Number number)
		throws HttpRequestException
	{
		if(number != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          17
			number = ((Number) (((Object) (number)).toString()));
	//    2    4:aload_3         
	//    3    5:invokevirtual   #274 <Method String Object.toString()>
	//    4    8:astore_3        
		else
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:aload_3         
	//*   9   13:invokevirtual   #805 <Method HttpRequest part(String, String, String)>
	//*  10   16:areturn         
			number = null;
	//   11   17:aconst_null     
	//   12   18:astore_3        
		return part(s, s1, ((String) (number)));
	//*  13   19:goto            9
	}

	public HttpRequest part(String s, String s1, String s2)
		throws HttpRequestException
	{
		return part(s, s1, ((String) (null)), s2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:invokevirtual   #811 <Method HttpRequest part(String, String, String, String)>
	//    6    8:areturn         
	}

	public HttpRequest part(String s, String s1, String s2, File file)
		throws HttpRequestException
	{
		File file1;
		Object obj;
		file1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          6
		file = ((File) (new BufferedInputStream(((InputStream) (new FileInputStream(file))))));
	//    4    6:new             #524 <Class BufferedInputStream>
	//    5    9:dup             
	//    6   10:new             #813 <Class FileInputStream>
	//    7   13:dup             
	//    8   14:aload           4
	//    9   16:invokespecial   #816 <Method void FileInputStream(File)>
	//   10   19:invokespecial   #819 <Method void BufferedInputStream(InputStream)>
	//   11   22:astore          4
		s = ((String) (part(s, s1, s2, ((InputStream) (file)))));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:aload_3         
	//   16   28:aload           4
	//   17   30:invokevirtual   #799 <Method HttpRequest part(String, String, String, InputStream)>
	//   18   33:astore_1        
		if(file != null)
	//*  19   34:aload           4
	//*  20   36:ifnull          44
			try
			{
				((InputStream) (file)).close();
	//   21   39:aload           4
	//   22   41:invokevirtual   #822 <Method void InputStream.close()>
			}
	//*  23   44:aload_1         
	//*  24   45:areturn         
	//*  25   46:astore_1        
	//*  26   47:aload           6
	//*  27   49:astore          5
	//*  28   51:new             #36  <Class HttpRequest$HttpRequestException>
	//*  29   54:dup             
	//*  30   55:aload_1         
	//*  31   56:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//*  32   59:athrow          
	//*  33   60:astore_1        
	//*  34   61:aload           5
	//*  35   63:ifnull          71
	//*  36   66:aload           5
	//*  37   68:invokevirtual   #822 <Method void InputStream.close()>
	//*  38   71:aload_1         
	//*  39   72:athrow          
			// Misplaced declaration of an exception variable
			catch(String s1)
	//*  40   73:astore_2        
			{
				return ((HttpRequest) (s));
	//   41   74:aload_1         
	//   42   75:areturn         
			}
		return ((HttpRequest) (s));
		s;
		file1 = ((File) (obj));
_L4:
		throw new HttpRequestException(((IOException) (s)));
		s;
_L2:
		if(file1 != null)
			try
			{
				((InputStream) (file1)).close();
			}
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//   43   76:astore_2        
		throw s;
	//*  44   77:goto            71
		s;
	//   45   80:astore_1        
		file1 = file;
	//   46   81:aload           4
	//   47   83:astore          5
		if(true) goto _L2; else goto _L1
	//   48   85:goto            61
_L1:
		s;
	//   49   88:astore_1        
		file1 = file;
	//   50   89:aload           4
	//   51   91:astore          5
		if(true) goto _L4; else goto _L3
	//   52   93:goto            51
_L3:
	}

	public HttpRequest part(String s, String s1, String s2, InputStream inputstream)
		throws HttpRequestException
	{
		try
		{
			startPart();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #825 <Method HttpRequest startPart()>
	//    2    4:pop             
			writePartHeader(s, s1, s2);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #828 <Method HttpRequest writePartHeader(String, String, String)>
	//    8   12:pop             
			copy(inputstream, ((OutputStream) (output)));
	//    9   13:aload_0         
	//   10   14:aload           4
	//   11   16:aload_0         
	//   12   17:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//   13   20:invokevirtual   #518 <Method HttpRequest copy(InputStream, OutputStream)>
	//   14   23:pop             
		}
	//*  15   24:aload_0         
	//*  16   25:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  17   26:astore_1        
		{
			throw new HttpRequestException(((IOException) (s)));
	//   18   27:new             #36  <Class HttpRequest$HttpRequestException>
	//   19   30:dup             
	//   20   31:aload_1         
	//   21   32:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   22   35:athrow          
		}
		return this;
	}

	public HttpRequest part(String s, String s1, String s2, String s3)
		throws HttpRequestException
	{
		try
		{
			startPart();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #825 <Method HttpRequest startPart()>
	//    2    4:pop             
			writePartHeader(s, s1, s2);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #828 <Method HttpRequest writePartHeader(String, String, String)>
	//    8   12:pop             
			output.write(s3);
	//    9   13:aload_0         
	//   10   14:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//   11   17:aload           4
	//   12   19:invokevirtual   #583 <Method HttpRequest$RequestOutputStream HttpRequest$RequestOutputStream.write(String)>
	//   13   22:pop             
		}
	//*  14   23:aload_0         
	//*  15   24:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  16   25:astore_1        
		{
			throw new HttpRequestException(((IOException) (s)));
	//   17   26:new             #36  <Class HttpRequest$HttpRequestException>
	//   18   29:dup             
	//   19   30:aload_1         
	//   20   31:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   21   34:athrow          
		}
		return this;
	}

	public HttpRequest partHeader(String s, String s1)
		throws HttpRequestException
	{
		return send(((CharSequence) (s))).send(": ").send(((CharSequence) (s1))).send("\r\n");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #832 <Method HttpRequest send(CharSequence)>
	//    3    5:ldc2            #834 <String ": ">
	//    4    8:invokevirtual   #832 <Method HttpRequest send(CharSequence)>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #832 <Method HttpRequest send(CharSequence)>
	//    7   15:ldc1            #64  <String "\r\n">
	//    8   17:invokevirtual   #832 <Method HttpRequest send(CharSequence)>
	//    9   20:areturn         
	}

	public HttpRequest proxyAuthorization(String s)
	{
		return header("Proxy-Authorization", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #114 <String "Proxy-Authorization">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #468 <Method HttpRequest header(String, String)>
	//    4    7:areturn         
	}

	public HttpRequest proxyBasic(String s, String s1)
	{
		return proxyAuthorization((new StringBuilder()).append("Basic ").append(Base64.encode((new StringBuilder()).append(s).append(':').append(s1).toString())).toString());
	//    0    0:aload_0         
	//    1    1:new             #224 <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #364 <Method void StringBuilder()>
	//    4    8:ldc2            #485 <String "Basic ">
	//    5   11:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:new             #224 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #364 <Method void StringBuilder()>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:bipush          58
	//   12   27:invokevirtual   #232 <Method StringBuilder StringBuilder.append(char)>
	//   13   30:aload_2         
	//   14   31:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   15   34:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   16   37:invokestatic    #487 <Method String HttpRequest$Base64.encode(String)>
	//   17   40:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   18   43:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   19   46:invokevirtual   #838 <Method HttpRequest proxyAuthorization(String)>
	//   20   49:areturn         
	}

	public HttpRequest readTimeout(int i)
	{
		getConnection().setReadTimeout(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #842 <Method void HttpURLConnection.setReadTimeout(int)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public InputStreamReader reader()
		throws HttpRequestException
	{
		return reader(charset());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #506 <Method String charset()>
	//    3    5:invokevirtual   #545 <Method InputStreamReader reader(String)>
	//    4    8:areturn         
	}

	public InputStreamReader reader(String s)
		throws HttpRequestException
	{
		try
		{
			s = ((String) (new InputStreamReader(stream(), getValidCharset(s))));
	//    0    0:new             #847 <Class InputStreamReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #528 <Method InputStream stream()>
	//    4    8:aload_1         
	//    5    9:invokestatic    #214 <Method String getValidCharset(String)>
	//    6   12:invokespecial   #850 <Method void InputStreamReader(InputStream, String)>
	//    7   15:astore_1        
		}
	//*   8   16:aload_1         
	//*   9   17:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   18:astore_1        
		{
			throw new HttpRequestException(((IOException) (s)));
	//   11   19:new             #36  <Class HttpRequest$HttpRequestException>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   15   27:athrow          
		}
		return ((InputStreamReader) (s));
	}

	public HttpRequest receive(final File final_closeable)
		throws HttpRequestException
	{
		try
		{
			final_closeable = ((File) (new BufferedOutputStream(((OutputStream) (new FileOutputStream(final_closeable))), bufferSize)));
	//    0    0:new             #856 <Class BufferedOutputStream>
	//    1    3:dup             
	//    2    4:new             #858 <Class FileOutputStream>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #859 <Method void FileOutputStream(File)>
	//    6   12:aload_0         
	//    7   13:getfield        #189 <Field int bufferSize>
	//    8   16:invokespecial   #862 <Method void BufferedOutputStream(OutputStream, int)>
	//    9   19:astore_1        
		}
	//*  10   20:new             #10  <Class HttpRequest$3>
	//*  11   23:dup             
	//*  12   24:aload_0         
	//*  13   25:aload_1         
	//*  14   26:aload_0         
	//*  15   27:getfield        #185 <Field boolean ignoreCloseExceptions>
	//*  16   30:aload_1         
	//*  17   31:invokespecial   #865 <Method void HttpRequest$3(HttpRequest, Closeable, boolean, OutputStream)>
	//*  18   34:invokevirtual   #866 <Method Object HttpRequest$3.call()>
	//*  19   37:checkcast       #2   <Class HttpRequest>
	//*  20   40:areturn         
		// Misplaced declaration of an exception variable
		catch(final File final_closeable)
	//*  21   41:astore_1        
		{
			throw new HttpRequestException(((IOException) (final_closeable)));
	//   22   42:new             #36  <Class HttpRequest$HttpRequestException>
	//   23   45:dup             
	//   24   46:aload_1         
	//   25   47:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   26   50:athrow          
		}
		return (HttpRequest)((_cls3) (new CloseOperation(ignoreCloseExceptions, ((OutputStream) (final_closeable))) {

			protected HttpRequest run()
				throws HttpRequestException, IOException
			{
				return receive(output);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field HttpRequest this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field OutputStream val$output>
			//    4    8:invokevirtual   #33  <Method HttpRequest HttpRequest.receive(OutputStream)>
			//    5   11:areturn         
			}

			protected volatile Object run()
				throws HttpRequestException, IOException
			{
				return ((Object) (run()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #37  <Method HttpRequest run()>
			//    2    4:areturn         
			}

			final HttpRequest this$0;
			final OutputStream val$output;

			
			{
				this$0 = HttpRequest.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field HttpRequest this$0>
				output = outputstream;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #20  <Field OutputStream val$output>
				super(final_closeable, flag);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:iload_3         
			//    9   14:invokespecial   #23  <Method void HttpRequest$CloseOperation(Closeable, boolean)>
			//   10   17:return          
			}
		}
)).call();
	}

	public HttpRequest receive(OutputStream outputstream)
		throws HttpRequestException
	{
		try
		{
			outputstream = ((OutputStream) (copy(((InputStream) (buffer())), outputstream)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #514 <Method BufferedInputStream buffer()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #518 <Method HttpRequest copy(InputStream, OutputStream)>
	//    5    9:astore_1        
		}
	//*   6   10:aload_1         
	//*   7   11:areturn         
		// Misplaced declaration of an exception variable
		catch(OutputStream outputstream)
	//*   8   12:astore_1        
		{
			throw new HttpRequestException(((IOException) (outputstream)));
	//    9   13:new             #36  <Class HttpRequest$HttpRequestException>
	//   10   16:dup             
	//   11   17:aload_1         
	//   12   18:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   13   21:athrow          
		}
		return ((HttpRequest) (outputstream));
	}

	public HttpRequest receive(PrintStream printstream)
		throws HttpRequestException
	{
		return receive(((OutputStream) (printstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #870 <Method HttpRequest receive(OutputStream)>
	//    3    5:areturn         
	}

	public HttpRequest receive(Writer writer1)
		throws HttpRequestException
	{
		final BufferedReader final_closeable = bufferedReader();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #873 <Method BufferedReader bufferedReader()>
	//    2    4:astore_2        
		return (HttpRequest)((_cls5) (new CloseOperation(final_closeable, writer1) {

			public HttpRequest run()
				throws IOException
			{
				return copy(((Reader) (reader)), writer);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field HttpRequest this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field BufferedReader val$reader>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field Writer val$writer>
			//    6   12:invokevirtual   #36  <Method HttpRequest HttpRequest.copy(Reader, Writer)>
			//    7   15:areturn         
			}

			public volatile Object run()
				throws HttpRequestException, IOException
			{
				return ((Object) (run()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #42  <Method HttpRequest run()>
			//    2    4:areturn         
			}

			final HttpRequest this$0;
			final BufferedReader val$reader;
			final Writer val$writer;

			
			{
				this$0 = HttpRequest.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field HttpRequest this$0>
				reader = bufferedreader;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #22  <Field BufferedReader val$reader>
				writer = writer1;
			//    6   11:aload_0         
			//    7   12:aload           5
			//    8   14:putfield        #24  <Field Writer val$writer>
				super(final_closeable, final_flag);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:iload_3         
			//   12   20:invokespecial   #27  <Method void HttpRequest$CloseOperation(Closeable, boolean)>
			//   13   23:return          
			}
		}
)).call();
	//    3    5:new             #14  <Class HttpRequest$5>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:getfield        #185 <Field boolean ignoreCloseExceptions>
	//    9   15:aload_2         
	//   10   16:aload_1         
	//   11   17:invokespecial   #876 <Method void HttpRequest$5(HttpRequest, Closeable, boolean, BufferedReader, Writer)>
	//   12   20:invokevirtual   #877 <Method Object HttpRequest$5.call()>
	//   13   23:checkcast       #2   <Class HttpRequest>
	//   14   26:areturn         
	}

	public HttpRequest receive(Appendable appendable)
		throws HttpRequestException
	{
		final BufferedReader final_closeable = bufferedReader();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #873 <Method BufferedReader bufferedReader()>
	//    2    4:astore_2        
		return (HttpRequest)((_cls4) (new CloseOperation(final_closeable, appendable) {

			public HttpRequest run()
				throws IOException
			{
				CharBuffer charbuffer = CharBuffer.allocate(bufferSize);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field HttpRequest this$0>
			//    2    4:invokestatic    #36  <Method int HttpRequest.access$100(HttpRequest)>
			//    3    7:invokestatic    #42  <Method CharBuffer CharBuffer.allocate(int)>
			//    4   10:astore_2        
				do
				{
					int i = reader.read(charbuffer);
			//    5   11:aload_0         
			//    6   12:getfield        #22  <Field BufferedReader val$reader>
			//    7   15:aload_2         
			//    8   16:invokevirtual   #48  <Method int BufferedReader.read(CharBuffer)>
			//    9   19:istore_1        
					if(i != -1)
			//*  10   20:iload_1         
			//*  11   21:iconst_m1       
			//*  12   22:icmpeq          51
					{
						charbuffer.rewind();
			//   13   25:aload_2         
			//   14   26:invokevirtual   #52  <Method java.nio.Buffer CharBuffer.rewind()>
			//   15   29:pop             
						appendable.append(((CharSequence) (charbuffer)), 0, i);
			//   16   30:aload_0         
			//   17   31:getfield        #24  <Field Appendable val$appendable>
			//   18   34:aload_2         
			//   19   35:iconst_0        
			//   20   36:iload_1         
			//   21   37:invokeinterface #58  <Method Appendable Appendable.append(CharSequence, int, int)>
			//   22   42:pop             
						charbuffer.rewind();
			//   23   43:aload_2         
			//   24   44:invokevirtual   #52  <Method java.nio.Buffer CharBuffer.rewind()>
			//   25   47:pop             
					} else
			//*  26   48:goto            11
					{
						return HttpRequest.this;
			//   27   51:aload_0         
			//   28   52:getfield        #20  <Field HttpRequest this$0>
			//   29   55:areturn         
					}
				} while(true);
			}

			public volatile Object run()
				throws HttpRequestException, IOException
			{
				return ((Object) (run()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #64  <Method HttpRequest run()>
			//    2    4:areturn         
			}

			final HttpRequest this$0;
			final Appendable val$appendable;
			final BufferedReader val$reader;

			
			{
				this$0 = HttpRequest.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field HttpRequest this$0>
				reader = bufferedreader;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #22  <Field BufferedReader val$reader>
				appendable = appendable1;
			//    6   11:aload_0         
			//    7   12:aload           5
			//    8   14:putfield        #24  <Field Appendable val$appendable>
				super(final_closeable, final_flag);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:iload_3         
			//   12   20:invokespecial   #27  <Method void HttpRequest$CloseOperation(Closeable, boolean)>
			//   13   23:return          
			}
		}
)).call();
	//    3    5:new             #12  <Class HttpRequest$4>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:getfield        #185 <Field boolean ignoreCloseExceptions>
	//    9   15:aload_2         
	//   10   16:aload_1         
	//   11   17:invokespecial   #881 <Method void HttpRequest$4(HttpRequest, Closeable, boolean, BufferedReader, Appendable)>
	//   12   20:invokevirtual   #882 <Method Object HttpRequest$4.call()>
	//   13   23:checkcast       #2   <Class HttpRequest>
	//   14   26:areturn         
	}

	public HttpRequest referer(String s)
	{
		return header("Referer", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #117 <String "Referer">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #468 <Method HttpRequest header(String, String)>
	//    4    7:areturn         
	}

	public HttpRequest send(File file)
		throws HttpRequestException
	{
		try
		{
			file = ((File) (new BufferedInputStream(((InputStream) (new FileInputStream(file))))));
	//    0    0:new             #524 <Class BufferedInputStream>
	//    1    3:dup             
	//    2    4:new             #813 <Class FileInputStream>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #816 <Method void FileInputStream(File)>
	//    6   12:invokespecial   #819 <Method void BufferedInputStream(InputStream)>
	//    7   15:astore_1        
		}
	//*   8   16:aload_0         
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #886 <Method HttpRequest send(InputStream)>
	//*  11   21:areturn         
		// Misplaced declaration of an exception variable
		catch(File file)
	//*  12   22:astore_1        
		{
			throw new HttpRequestException(((IOException) (file)));
	//   13   23:new             #36  <Class HttpRequest$HttpRequestException>
	//   14   26:dup             
	//   15   27:aload_1         
	//   16   28:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   17   31:athrow          
		}
		return send(((InputStream) (file)));
	}

	public HttpRequest send(InputStream inputstream)
		throws HttpRequestException
	{
		try
		{
			openOutput();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #666 <Method HttpRequest openOutput()>
	//    2    4:pop             
			copy(inputstream, ((OutputStream) (output)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//    7   11:invokevirtual   #518 <Method HttpRequest copy(InputStream, OutputStream)>
	//    8   14:pop             
		}
	//*   9   15:aload_0         
	//*  10   16:areturn         
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  11   17:astore_1        
		{
			throw new HttpRequestException(((IOException) (inputstream)));
	//   12   18:new             #36  <Class HttpRequest$HttpRequestException>
	//   13   21:dup             
	//   14   22:aload_1         
	//   15   23:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   16   26:athrow          
		}
		return this;
	}

	public HttpRequest send(final Reader input)
		throws HttpRequestException
	{
		final OutputStreamWriter final_flushable;
		try
		{
			openOutput();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #666 <Method HttpRequest openOutput()>
	//    2    4:pop             
		}
	//*   3    5:new             #889 <Class OutputStreamWriter>
	//*   4    8:dup             
	//*   5    9:aload_0         
	//*   6   10:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//*   7   13:aload_0         
	//*   8   14:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//*   9   17:invokestatic    #893 <Method CharsetEncoder HttpRequest$RequestOutputStream.access$200(HttpRequest$RequestOutputStream)>
	//*  10   20:invokevirtual   #898 <Method Charset CharsetEncoder.charset()>
	//*  11   23:invokespecial   #901 <Method void OutputStreamWriter(OutputStream, Charset)>
	//*  12   26:astore_2        
	//*  13   27:new             #20  <Class HttpRequest$8>
	//*  14   30:dup             
	//*  15   31:aload_0         
	//*  16   32:aload_2         
	//*  17   33:aload_1         
	//*  18   34:aload_2         
	//*  19   35:invokespecial   #904 <Method void HttpRequest$8(HttpRequest, Flushable, Reader, Writer)>
	//*  20   38:invokevirtual   #905 <Method Object HttpRequest$8.call()>
	//*  21   41:checkcast       #2   <Class HttpRequest>
	//*  22   44:areturn         
		// Misplaced declaration of an exception variable
		catch(final Reader input)
	//*  23   45:astore_1        
		{
			throw new HttpRequestException(((IOException) (input)));
	//   24   46:new             #36  <Class HttpRequest$HttpRequestException>
	//   25   49:dup             
	//   26   50:aload_1         
	//   27   51:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   28   54:athrow          
		}
		final_flushable = new OutputStreamWriter(((OutputStream) (output)), output.encoder.charset());
		return (HttpRequest)((_cls8) (new FlushOperation(((Writer) (final_flushable))) {

			protected HttpRequest run()
				throws IOException
			{
				return copy(input, writer);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field HttpRequest this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field Reader val$input>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field Writer val$writer>
			//    6   12:invokevirtual   #36  <Method HttpRequest HttpRequest.copy(Reader, Writer)>
			//    7   15:areturn         
			}

			protected volatile Object run()
				throws HttpRequestException, IOException
			{
				return ((Object) (run()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #42  <Method HttpRequest run()>
			//    2    4:areturn         
			}

			final HttpRequest this$0;
			final Reader val$input;
			final Writer val$writer;

			
			{
				this$0 = HttpRequest.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field HttpRequest this$0>
				input = reader1;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field Reader val$input>
				writer = writer1;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #24  <Field Writer val$writer>
				super(final_flushable);
			//    9   16:aload_0         
			//   10   17:aload_2         
			//   11   18:invokespecial   #27  <Method void HttpRequest$FlushOperation(Flushable)>
			//   12   21:return          
			}
		}
)).call();
	}

	public HttpRequest send(CharSequence charsequence)
		throws HttpRequestException
	{
		try
		{
			openOutput();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #666 <Method HttpRequest openOutput()>
	//    2    4:pop             
			output.write(charsequence.toString());
	//    3    5:aload_0         
	//    4    6:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//    5    9:aload_1         
	//    6   10:invokeinterface #197 <Method String CharSequence.toString()>
	//    7   15:invokevirtual   #583 <Method HttpRequest$RequestOutputStream HttpRequest$RequestOutputStream.write(String)>
	//    8   18:pop             
		}
	//*   9   19:aload_0         
	//*  10   20:areturn         
		// Misplaced declaration of an exception variable
		catch(CharSequence charsequence)
	//*  11   21:astore_1        
		{
			throw new HttpRequestException(((IOException) (charsequence)));
	//   12   22:new             #36  <Class HttpRequest$HttpRequestException>
	//   13   25:dup             
	//   14   26:aload_1         
	//   15   27:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   16   30:athrow          
		}
		return this;
	}

	public HttpRequest send(byte abyte0[])
		throws HttpRequestException
	{
		return send(((InputStream) (new ByteArrayInputStream(abyte0))));
	//    0    0:aload_0         
	//    1    1:new             #908 <Class ByteArrayInputStream>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #911 <Method void ByteArrayInputStream(byte[])>
	//    5    9:invokevirtual   #886 <Method HttpRequest send(InputStream)>
	//    6   12:areturn         
	}

	public String server()
	{
		return header("Server");
	//    0    0:aload_0         
	//    1    1:ldc1            #120 <String "Server">
	//    2    3:invokevirtual   #562 <Method String header(String)>
	//    3    6:areturn         
	}

	public boolean serverError()
		throws HttpRequestException
	{
		return 500 == code();
	//    0    0:sipush          500
	//    1    3:aload_0         
	//    2    4:invokevirtual   #482 <Method int code()>
	//    3    7:icmpne          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	protected HttpRequest startPart()
		throws IOException
	{
		if(!multipart)
	//*   0    0:aload_0         
	//*   1    1:getfield        #577 <Field boolean multipart>
	//*   2    4:ifne            35
		{
			multipart = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #577 <Field boolean multipart>
			contentType("multipart/form-data; boundary=00content0boundary00").openOutput();
	//    6   12:aload_0         
	//    7   13:ldc1            #61  <String "multipart/form-data; boundary=00content0boundary00">
	//    8   15:invokevirtual   #915 <Method HttpRequest contentType(String)>
	//    9   18:invokevirtual   #666 <Method HttpRequest openOutput()>
	//   10   21:pop             
			output.write("--00content0boundary00\r\n");
	//   11   22:aload_0         
	//   12   23:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//   13   26:ldc2            #917 <String "--00content0boundary00\r\n">
	//   14   29:invokevirtual   #583 <Method HttpRequest$RequestOutputStream HttpRequest$RequestOutputStream.write(String)>
	//   15   32:pop             
			return this;
	//   16   33:aload_0         
	//   17   34:areturn         
		} else
		{
			output.write("\r\n--00content0boundary00\r\n");
	//   18   35:aload_0         
	//   19   36:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//   20   39:ldc2            #919 <String "\r\n--00content0boundary00\r\n">
	//   21   42:invokevirtual   #583 <Method HttpRequest$RequestOutputStream HttpRequest$RequestOutputStream.write(String)>
	//   22   45:pop             
			return this;
	//   23   46:aload_0         
	//   24   47:areturn         
		}
	}

	public InputStream stream()
		throws HttpRequestException
	{
		if(code() >= 400) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #482 <Method int code()>
	//    2    4:sipush          400
	//    3    7:icmpge          49
_L1:
		Object obj;
		try
		{
			obj = ((Object) (getConnection().getInputStream()));
	//    4   10:aload_0         
	//    5   11:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    6   14:invokevirtual   #922 <Method InputStream HttpURLConnection.getInputStream()>
	//    7   17:astore_1        
		}
	//*   8   18:aload_0         
	//*   9   19:getfield        #187 <Field boolean uncompress>
	//*  10   22:ifeq            37
	//*  11   25:ldc1            #69  <String "gzip">
	//*  12   27:aload_0         
	//*  13   28:invokevirtual   #924 <Method String contentEncoding()>
	//*  14   31:invokevirtual   #697 <Method boolean String.equals(Object)>
	//*  15   34:ifne            84
	//*  16   37:aload_1         
	//*  17   38:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  18   39:astore_1        
		{
			throw new HttpRequestException(((IOException) (obj)));
	//   19   40:new             #36  <Class HttpRequest$HttpRequestException>
	//   20   43:dup             
	//   21   44:aload_1         
	//   22   45:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   23   48:athrow          
		}
_L4:
		if(!uncompress || !"gzip".equals(((Object) (contentEncoding()))))
			return ((InputStream) (obj));
		break; /* Loop/switch isn't completed */
_L2:
		InputStream inputstream = getConnection().getErrorStream();
	//   24   49:aload_0         
	//   25   50:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//   26   53:invokevirtual   #927 <Method InputStream HttpURLConnection.getErrorStream()>
	//   27   56:astore_2        
		obj = ((Object) (inputstream));
	//   28   57:aload_2         
	//   29   58:astore_1        
		if(inputstream == null)
	//*  30   59:aload_2         
	//*  31   60:ifnonnull       18
			try
			{
				obj = ((Object) (getConnection().getInputStream()));
	//   32   63:aload_0         
	//   33   64:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//   34   67:invokevirtual   #922 <Method InputStream HttpURLConnection.getInputStream()>
	//   35   70:astore_1        
			}
	//*  36   71:goto            18
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  37   74:astore_1        
			{
				throw new HttpRequestException(((IOException) (obj)));
	//   38   75:new             #36  <Class HttpRequest$HttpRequestException>
	//   39   78:dup             
	//   40   79:aload_1         
	//   41   80:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   42   83:athrow          
			}
		if(true) goto _L4; else goto _L3
_L3:
		try
		{
			obj = ((Object) (new GZIPInputStream(((InputStream) (obj)))));
	//   43   84:new             #929 <Class GZIPInputStream>
	//   44   87:dup             
	//   45   88:aload_1         
	//   46   89:invokespecial   #930 <Method void GZIPInputStream(InputStream)>
	//   47   92:astore_1        
		}
	//*  48   93:aload_1         
	//*  49   94:areturn         
		catch(IOException ioexception)
	//*  50   95:astore_1        
		{
			throw new HttpRequestException(ioexception);
	//   51   96:new             #36  <Class HttpRequest$HttpRequestException>
	//   52   99:dup             
	//   53  100:aload_1         
	//   54  101:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   55  104:athrow          
		}
		return ((InputStream) (obj));
	}

	public String toString()
	{
		return (new StringBuilder()).append(method()).append(' ').append(((Object) (url()))).toString();
	//    0    0:new             #224 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #364 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #932 <Method String method()>
	//    5   11:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:bipush          32
	//    7   16:invokevirtual   #232 <Method StringBuilder StringBuilder.append(char)>
	//    8   19:aload_0         
	//    9   20:invokevirtual   #935 <Method URL url()>
	//   10   23:invokevirtual   #283 <Method StringBuilder StringBuilder.append(Object)>
	//   11   26:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   12   29:areturn         
	}

	public HttpRequest trustAllCerts()
		throws HttpRequestException
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public HttpRequest trustAllHosts()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public HttpRequest uncompress(boolean flag)
	{
		uncompress = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #187 <Field boolean uncompress>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public URL url()
	{
		return getConnection().getURL();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    2    4:invokevirtual   #940 <Method URL HttpURLConnection.getURL()>
	//    3    7:areturn         
	}

	public HttpRequest useCaches(boolean flag)
	{
		getConnection().setUseCaches(flag);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #569 <Method HttpURLConnection getConnection()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #944 <Method void HttpURLConnection.setUseCaches(boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public HttpRequest useProxy(String s, int i)
	{
		if(connection != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field HttpURLConnection connection>
	//*   2    4:ifnull          18
		{
			throw new IllegalStateException("The connection has already been created. This method must be called before reading or writing to the request.");
	//    3    7:new             #948 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #950 <String "The connection has already been created. This method must be called before reading or writing to the request.">
	//    6   14:invokespecial   #951 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			httpProxyHost = s;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #301 <Field String httpProxyHost>
			httpProxyPort = i;
	//   11   23:aload_0         
	//   12   24:iload_2         
	//   13   25:putfield        #329 <Field int httpProxyPort>
			return this;
	//   14   28:aload_0         
	//   15   29:areturn         
		}
	}

	public HttpRequest userAgent(String s)
	{
		return header("User-Agent", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #123 <String "User-Agent">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #468 <Method HttpRequest header(String, String)>
	//    4    7:areturn         
	}

	protected HttpRequest writePartHeader(String s, String s1)
		throws IOException
	{
		return writePartHeader(s, s1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #828 <Method HttpRequest writePartHeader(String, String, String)>
	//    5    7:areturn         
	}

	protected HttpRequest writePartHeader(String s, String s1, String s2)
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #224 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #364 <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("form-data; name=\"").append(s);
	//    4    9:aload           4
	//    5   11:ldc2            #954 <String "form-data; name=\"">
	//    6   14:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		if(s1 != null)
	//*  10   22:aload_2         
	//*  11   23:ifnull          39
			stringbuilder.append("\"; filename=\"").append(s1);
	//   12   26:aload           4
	//   13   28:ldc2            #956 <String "\"; filename=\"">
	//   14   31:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   15   34:aload_2         
	//   16   35:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   17   38:pop             
		stringbuilder.append('"');
	//   18   39:aload           4
	//   19   41:bipush          34
	//   20   43:invokevirtual   #232 <Method StringBuilder StringBuilder.append(char)>
	//   21   46:pop             
		partHeader("Content-Disposition", stringbuilder.toString());
	//   22   47:aload_0         
	//   23   48:ldc2            #958 <String "Content-Disposition">
	//   24   51:aload           4
	//   25   53:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   26   56:invokevirtual   #960 <Method HttpRequest partHeader(String, String)>
	//   27   59:pop             
		if(s2 != null)
	//*  28   60:aload_3         
	//*  29   61:ifnull          72
			partHeader("Content-Type", s2);
	//   30   64:aload_0         
	//   31   65:ldc1            #93  <String "Content-Type">
	//   32   67:aload_3         
	//   33   68:invokevirtual   #960 <Method HttpRequest partHeader(String, String)>
	//   34   71:pop             
		return send("\r\n");
	//   35   72:aload_0         
	//   36   73:ldc1            #64  <String "\r\n">
	//   37   75:invokevirtual   #832 <Method HttpRequest send(CharSequence)>
	//   38   78:areturn         
	}

	public OutputStreamWriter writer()
		throws HttpRequestException
	{
		OutputStreamWriter outputstreamwriter;
		try
		{
			openOutput();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #666 <Method HttpRequest openOutput()>
	//    2    4:pop             
			outputstreamwriter = new OutputStreamWriter(((OutputStream) (output)), output.encoder.charset());
	//    3    5:new             #889 <Class OutputStreamWriter>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//    7   13:aload_0         
	//    8   14:getfield        #575 <Field HttpRequest$RequestOutputStream output>
	//    9   17:invokestatic    #893 <Method CharsetEncoder HttpRequest$RequestOutputStream.access$200(HttpRequest$RequestOutputStream)>
	//   10   20:invokevirtual   #898 <Method Charset CharsetEncoder.charset()>
	//   11   23:invokespecial   #901 <Method void OutputStreamWriter(OutputStream, Charset)>
	//   12   26:astore_1        
		}
	//*  13   27:aload_1         
	//*  14   28:areturn         
		catch(IOException ioexception)
	//*  15   29:astore_1        
		{
			throw new HttpRequestException(ioexception);
	//   16   30:new             #36  <Class HttpRequest$HttpRequestException>
	//   17   33:dup             
	//   18   34:aload_1         
	//   19   35:invokespecial   #207 <Method void HttpRequest$HttpRequestException(IOException)>
	//   20   38:athrow          
		}
		return outputstreamwriter;
	}

	private static final String BOUNDARY = "00content0boundary00";
	public static final String CHARSET_UTF8 = "UTF-8";
	private static ConnectionFactory CONNECTION_FACTORY;
	public static final String CONTENT_TYPE_FORM = "application/x-www-form-urlencoded";
	public static final String CONTENT_TYPE_JSON = "application/json";
	private static final String CONTENT_TYPE_MULTIPART = "multipart/form-data; boundary=00content0boundary00";
	private static final String CRLF = "\r\n";
	private static final String EMPTY_STRINGS[] = new String[0];
	public static final String ENCODING_GZIP = "gzip";
	public static final String HEADER_ACCEPT = "Accept";
	public static final String HEADER_ACCEPT_CHARSET = "Accept-Charset";
	public static final String HEADER_ACCEPT_ENCODING = "Accept-Encoding";
	public static final String HEADER_AUTHORIZATION = "Authorization";
	public static final String HEADER_CACHE_CONTROL = "Cache-Control";
	public static final String HEADER_CONTENT_ENCODING = "Content-Encoding";
	public static final String HEADER_CONTENT_LENGTH = "Content-Length";
	public static final String HEADER_CONTENT_TYPE = "Content-Type";
	public static final String HEADER_DATE = "Date";
	public static final String HEADER_ETAG = "ETag";
	public static final String HEADER_EXPIRES = "Expires";
	public static final String HEADER_IF_NONE_MATCH = "If-None-Match";
	public static final String HEADER_LAST_MODIFIED = "Last-Modified";
	public static final String HEADER_LOCATION = "Location";
	public static final String HEADER_PROXY_AUTHORIZATION = "Proxy-Authorization";
	public static final String HEADER_REFERER = "Referer";
	public static final String HEADER_SERVER = "Server";
	public static final String HEADER_USER_AGENT = "User-Agent";
	public static final String METHOD_DELETE = "DELETE";
	public static final String METHOD_GET = "GET";
	public static final String METHOD_HEAD = "HEAD";
	public static final String METHOD_OPTIONS = "OPTIONS";
	public static final String METHOD_POST = "POST";
	public static final String METHOD_PUT = "PUT";
	public static final String METHOD_TRACE = "TRACE";
	public static final String PARAM_CHARSET = "charset";
	private int bufferSize;
	private HttpURLConnection connection;
	private boolean form;
	private String httpProxyHost;
	private int httpProxyPort;
	private boolean ignoreCloseExceptions;
	private boolean multipart;
	private RequestOutputStream output;
	private final String requestMethod;
	private boolean uncompress;
	public final URL url;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       String[]
	//    2    4:putstatic       #169 <Field String[] EMPTY_STRINGS>
		CONNECTION_FACTORY = ConnectionFactory.DEFAULT;
	//    3    7:getstatic       #172 <Field HttpRequest$ConnectionFactory HttpRequest$ConnectionFactory.DEFAULT>
	//    4   10:putstatic       #174 <Field HttpRequest$ConnectionFactory CONNECTION_FACTORY>
	//*   5   13:return          
	}


/*
	static String access$000(String s)
	{
		return getValidCharset(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #214 <Method String getValidCharset(String)>
	//    2    4:areturn         
	}

*/


/*
	static int access$100(HttpRequest httprequest)
	{
		return httprequest.bufferSize;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field int bufferSize>
	//    2    4:ireturn         
	}

*/
}
