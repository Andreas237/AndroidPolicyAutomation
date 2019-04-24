// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.itextpdf.xmp.impl:
//			ByteBuffer

public class Latin1Converter
{

	private Latin1Converter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static ByteBuffer convert(ByteBuffer bytebuffer)
	{
		int i;
		int j;
		int k;
		int l;
		ByteBuffer bytebuffer1;
		byte abyte0[];
		if(!"UTF-8".equals(((Object) (bytebuffer.getEncoding()))))
			break MISSING_BLOCK_LABEL_296;
	//    0    0:ldc1            #18  <String "UTF-8">
	//    1    2:aload_0         
	//    2    3:invokevirtual   #24  <Method String ByteBuffer.getEncoding()>
	//    3    6:invokevirtual   #30  <Method boolean String.equals(Object)>
	//    4    9:ifeq            296
		abyte0 = new byte[8];
	//    5   12:bipush          8
	//    6   14:newarray        byte[]
	//    7   16:astore          8
		i = 0;
	//    8   18:iconst_0        
	//    9   19:istore_1        
		l = 0;
	//   10   20:iconst_0        
	//   11   21:istore          4
		bytebuffer1 = new ByteBuffer((bytebuffer.length() * 4) / 3);
	//   12   23:new             #20  <Class ByteBuffer>
	//   13   26:dup             
	//   14   27:aload_0         
	//   15   28:invokevirtual   #34  <Method int ByteBuffer.length()>
	//   16   31:iconst_4        
	//   17   32:imul            
	//   18   33:iconst_3        
	//   19   34:idiv            
	//   20   35:invokespecial   #37  <Method void ByteBuffer(int)>
	//   21   38:astore          7
		j = 0;
	//   22   40:iconst_0        
	//   23   41:istore_2        
		k = 0;
	//   24   42:iconst_0        
	//   25   43:istore_3        
_L2:
		int i1;
		if(k >= bytebuffer.length())
			break MISSING_BLOCK_LABEL_258;
	//   26   44:iload_3         
	//   27   45:aload_0         
	//   28   46:invokevirtual   #34  <Method int ByteBuffer.length()>
	//   29   49:icmpge          258
		i1 = bytebuffer.charAt(k);
	//   30   52:aload_0         
	//   31   53:iload_3         
	//   32   54:invokevirtual   #41  <Method int ByteBuffer.charAt(int)>
	//   33   57:istore          5
		switch(j)
	//*  34   59:iload_2         
		{
	//*  35   60:tableswitch     11 11: default 80
	//	               11 178
		default:
			if(i1 < 127)
	//*  36   80:iload           5
	//*  37   82:bipush          127
	//*  38   84:icmpge          102
				bytebuffer1.append((byte)i1);
	//   39   87:aload           7
	//   40   89:iload           5
	//   41   91:int2byte        
	//   42   92:invokevirtual   #45  <Method void ByteBuffer.append(byte)>
			else
	//*  43   95:iload_3         
	//*  44   96:iconst_1        
	//*  45   97:iadd            
	//*  46   98:istore_3        
	//*  47   99:goto            44
			if(i1 >= 192)
	//*  48  102:iload           5
	//*  49  104:sipush          192
	//*  50  107:icmplt          164
			{
				l = -1;
	//   51  110:iconst_m1       
	//   52  111:istore          4
				for(j = i1; l < 8 && (j & 0x80) == 128; j <<= 1)
	//*  53  113:iload           5
	//*  54  115:istore_2        
	//*  55  116:iload           4
	//*  56  118:bipush          8
	//*  57  120:icmpge          147
	//*  58  123:iload_2         
	//*  59  124:sipush          128
	//*  60  127:iand            
	//*  61  128:sipush          128
	//*  62  131:icmpne          147
					l++;
	//   63  134:iload           4
	//   64  136:iconst_1        
	//   65  137:iadd            
	//   66  138:istore          4

	//   67  140:iload_2         
	//   68  141:iconst_1        
	//   69  142:ishl            
	//   70  143:istore_2        
	//*  71  144:goto            116
				abyte0[i] = (byte)i1;
	//   72  147:aload           8
	//   73  149:iload_1         
	//   74  150:iload           5
	//   75  152:int2byte        
	//   76  153:bastore         
				j = 11;
	//   77  154:bipush          11
	//   78  156:istore_2        
				i++;
	//   79  157:iload_1         
	//   80  158:iconst_1        
	//   81  159:iadd            
	//   82  160:istore_1        
			} else
	//*  83  161:goto            95
			{
				bytebuffer1.append(convertToUTF8((byte)i1));
	//   84  164:aload           7
	//   85  166:iload           5
	//   86  168:int2byte        
	//   87  169:invokestatic    #49  <Method byte[] convertToUTF8(byte)>
	//   88  172:invokevirtual   #52  <Method void ByteBuffer.append(byte[])>
			}
			break;

		case 11: // '\013'
			break; /* Loop/switch isn't completed */
		}
_L3:
		k++;
		if(true) goto _L2; else goto _L1
	//*  89  175:goto            95
_L1:
		if(l > 0 && (i1 & 0xc0) == 128)
	//*  90  178:iload           4
	//*  91  180:ifle            235
	//*  92  183:iload           5
	//*  93  185:sipush          192
	//*  94  188:iand            
	//*  95  189:sipush          128
	//*  96  192:icmpne          235
		{
			int j1 = i + 1;
	//   97  195:iload_1         
	//   98  196:iconst_1        
	//   99  197:iadd            
	//  100  198:istore          6
			abyte0[i] = (byte)i1;
	//  101  200:aload           8
	//  102  202:iload_1         
	//  103  203:iload           5
	//  104  205:int2byte        
	//  105  206:bastore         
			l--;
	//  106  207:iload           4
	//  107  209:iconst_1        
	//  108  210:isub            
	//  109  211:istore          4
			if(l == 0)
	//* 110  213:iload           4
	//* 111  215:ifne            298
			{
				bytebuffer1.append(abyte0, 0, j1);
	//  112  218:aload           7
	//  113  220:aload           8
	//  114  222:iconst_0        
	//  115  223:iload           6
	//  116  225:invokevirtual   #55  <Method void ByteBuffer.append(byte[], int, int)>
				i = 0;
	//  117  228:iconst_0        
	//  118  229:istore_1        
				j = 0;
	//  119  230:iconst_0        
	//  120  231:istore_2        
			} else
	//* 121  232:goto            95
	//* 122  235:aload           7
	//* 123  237:aload           8
	//* 124  239:iconst_0        
	//* 125  240:baload          
	//* 126  241:invokestatic    #49  <Method byte[] convertToUTF8(byte)>
	//* 127  244:invokevirtual   #52  <Method void ByteBuffer.append(byte[])>
	//* 128  247:iload_3         
	//* 129  248:iload_1         
	//* 130  249:isub            
	//* 131  250:istore_3        
	//* 132  251:iconst_0        
	//* 133  252:istore_1        
	//* 134  253:iconst_0        
	//* 135  254:istore_2        
	//* 136  255:goto            95
	//* 137  258:aload           7
	//* 138  260:astore_0        
	//* 139  261:iload_2         
	//* 140  262:bipush          11
	//* 141  264:icmpne          296
	//* 142  267:iconst_0        
	//* 143  268:istore_2        
	//* 144  269:aload           7
	//* 145  271:astore_0        
	//* 146  272:iload_2         
	//* 147  273:iload_1         
	//* 148  274:icmpge          296
	//* 149  277:aload           7
	//* 150  279:aload           8
	//* 151  281:iload_2         
	//* 152  282:baload          
	//* 153  283:invokestatic    #49  <Method byte[] convertToUTF8(byte)>
	//* 154  286:invokevirtual   #52  <Method void ByteBuffer.append(byte[])>
	//* 155  289:iload_2         
	//* 156  290:iconst_1        
	//* 157  291:iadd            
	//* 158  292:istore_2        
	//* 159  293:goto            269
	//* 160  296:aload_0         
	//* 161  297:areturn         
			{
				i = j1;
	//  162  298:iload           6
	//  163  300:istore_1        
			}
		} else
		{
			bytebuffer1.append(convertToUTF8(abyte0[0]));
			k -= i;
			i = 0;
			j = 0;
		}
		  goto _L3
		  goto _L2
		bytebuffer = bytebuffer1;
		if(j == 11)
		{
			j = 0;
			do
			{
				bytebuffer = bytebuffer1;
				if(j >= i)
					break;
				bytebuffer1.append(convertToUTF8(abyte0[j]));
				j++;
			} while(true);
		}
		return bytebuffer;
		if(true) goto _L2; else goto _L4
_L4:
	//* 164  301:goto            95
	}

	private static byte[] convertToUTF8(byte byte0)
	{
		int i = byte0 & 0xff;
	//    0    0:iload_0         
	//    1    1:sipush          255
	//    2    4:iand            
	//    3    5:istore_1        
		if(i < 128)
			break MISSING_BLOCK_LABEL_82;
	//    4    6:iload_1         
	//    5    7:sipush          128
	//    6   10:icmplt          82
		if(i != 129 && i != 141 && i != 143 && i != 144 && i != 157)
			break MISSING_BLOCK_LABEL_57;
	//    7   13:iload_1         
	//    8   14:sipush          129
	//    9   17:icmpeq          48
	//   10   20:iload_1         
	//   11   21:sipush          141
	//   12   24:icmpeq          48
	//   13   27:iload_1         
	//   14   28:sipush          143
	//   15   31:icmpeq          48
	//   16   34:iload_1         
	//   17   35:sipush          144
	//   18   38:icmpeq          48
	//   19   41:iload_1         
	//   20   42:sipush          157
	//   21   45:icmpne          57
		return (new byte[] {
			32
		});
	//   22   48:iconst_1        
	//   23   49:newarray        byte[]
	//   24   51:dup             
	//   25   52:iconst_0        
	//   26   53:bipush          32
	//   27   55:bastore         
	//   28   56:areturn         
		byte abyte0[] = (new String(new byte[] {
			byte0
		}, "cp1252")).getBytes("UTF-8");
	//   29   57:new             #26  <Class String>
	//   30   60:dup             
	//   31   61:iconst_1        
	//   32   62:newarray        byte[]
	//   33   64:dup             
	//   34   65:iconst_0        
	//   35   66:iload_0         
	//   36   67:bastore         
	//   37   68:ldc1            #59  <String "cp1252">
	//   38   70:invokespecial   #62  <Method void String(byte[], String)>
	//   39   73:ldc1            #18  <String "UTF-8">
	//   40   75:invokevirtual   #66  <Method byte[] String.getBytes(String)>
	//   41   78:astore_2        
		return abyte0;
	//   42   79:aload_2         
	//   43   80:areturn         
		UnsupportedEncodingException unsupportedencodingexception;
		unsupportedencodingexception;
	//   44   81:astore_2        
		return (new byte[] {
			byte0
		});
	//   45   82:iconst_1        
	//   46   83:newarray        byte[]
	//   47   85:dup             
	//   48   86:iconst_0        
	//   49   87:iload_0         
	//   50   88:bastore         
	//   51   89:areturn         
	}

	private static final int STATE_START = 0;
	private static final int STATE_UTF8CHAR = 11;
}
