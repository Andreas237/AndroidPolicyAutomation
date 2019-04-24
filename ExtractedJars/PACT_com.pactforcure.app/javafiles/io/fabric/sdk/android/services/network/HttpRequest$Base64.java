// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.io.UnsupportedEncodingException;
import java.util.Locale;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpRequest

public static class HttpRequest$Base64
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
	//	               1 221
	//	               2 168
	//	               3 110
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

	private HttpRequest$Base64()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void Object()>
	//    2    4:return          
	}
}
