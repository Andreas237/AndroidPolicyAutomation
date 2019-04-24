// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.*;

// Referenced classes of package com.itextpdf.text.pdf.codec:
//			Base64

public static class Base64$InputStream extends FilterInputStream
{

	public int read()
		throws IOException
	{
		int i;
		int l;
		byte abyte0[];
		if(position >= 0)
			break MISSING_BLOCK_LABEL_106;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int position>
	//    2    4:ifge            106
		if(!encode)
			break MISSING_BLOCK_LABEL_128;
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field boolean encode>
	//    5   11:ifeq            128
		abyte0 = new byte[3];
	//    6   14:iconst_3        
	//    7   15:newarray        byte[]
	//    8   17:astore          5
		l = 0;
	//    9   19:iconst_0        
	//   10   20:istore_2        
		i = 0;
	//   11   21:iconst_0        
	//   12   22:istore_1        
_L2:
		if(i >= 3)
			break; /* Loop/switch isn't completed */
	//   13   23:iload_1         
	//   14   24:iconst_3        
	//   15   25:icmpge          75
		int k1 = in.read();
	//   16   28:aload_0         
	//   17   29:getfield        #61  <Field InputStream in>
	//   18   32:invokevirtual   #65  <Method int InputStream.read()>
	//   19   35:istore          4
		int j1;
		j1 = l;
	//   20   37:iload_2         
	//   21   38:istore_3        
		if(k1 >= 0)
	//*  22   39:iload           4
	//*  23   41:iflt            55
		{
			abyte0[i] = (byte)k1;
	//   24   44:aload           5
	//   25   46:iload_1         
	//   26   47:iload           4
	//   27   49:int2byte        
	//   28   50:bastore         
			j1 = l + 1;
	//   29   51:iload_2         
	//   30   52:iconst_1        
	//   31   53:iadd            
	//   32   54:istore_3        
		}
_L3:
		i++;
	//   33   55:iload_1         
	//   34   56:iconst_1        
	//   35   57:iadd            
	//   36   58:istore_1        
		l = j1;
	//   37   59:iload_3         
	//   38   60:istore_2        
		if(true) goto _L2; else goto _L1
	//   39   61:goto            23
		IOException ioexception;
		ioexception;
	//   40   64:astore          6
		j1 = l;
	//   41   66:iload_2         
	//   42   67:istore_3        
		if(i == 0)
	//*  43   68:iload_1         
	//*  44   69:ifne            55
			throw ioexception;
	//   45   72:aload           6
	//   46   74:athrow          
		  goto _L3
_L1:
		if(l <= 0)
			break MISSING_BLOCK_LABEL_126;
	//   47   75:iload_2         
	//   48   76:ifle            126
		Base64.access$200(abyte0, 0, l, buffer, 0, options);
	//   49   79:aload           5
	//   50   81:iconst_0        
	//   51   82:iload_2         
	//   52   83:aload_0         
	//   53   84:getfield        #36  <Field byte[] buffer>
	//   54   87:iconst_0        
	//   55   88:aload_0         
	//   56   89:getfield        #42  <Field int options>
	//   57   92:invokestatic    #69  <Method byte[] Base64.access$200(byte[], int, int, byte[], int, int)>
	//   58   95:pop             
		position = 0;
	//   59   96:aload_0         
	//   60   97:iconst_0        
	//   61   98:putfield        #38  <Field int position>
		numSigBytes = 4;
	//   62  101:aload_0         
	//   63  102:iconst_4        
	//   64  103:putfield        #71  <Field int numSigBytes>
		break MISSING_BLOCK_LABEL_106;
	//*  65  106:aload_0         
	//*  66  107:getfield        #38  <Field int position>
	//*  67  110:iflt            324
	//*  68  113:aload_0         
	//*  69  114:getfield        #38  <Field int position>
	//*  70  117:aload_0         
	//*  71  118:getfield        #71  <Field int numSigBytes>
	//*  72  121:icmplt          238
	//*  73  124:iconst_m1       
	//*  74  125:ireturn         
		return -1;
	//   75  126:iconst_m1       
	//   76  127:ireturn         
		byte abyte1[] = new byte[4];
	//   77  128:iconst_4        
	//   78  129:newarray        byte[]
	//   79  131:astore          5
		int j = 0;
	//   80  133:iconst_0        
	//   81  134:istore_1        
		do
		{
label0:
			{
				int i1;
				if(j < 4)
	//*  82  135:iload_1         
	//*  83  136:iconst_4        
	//*  84  137:icmpge          170
				{
					do
						i1 = in.read();
	//   85  140:aload_0         
	//   86  141:getfield        #61  <Field InputStream in>
	//   87  144:invokevirtual   #65  <Method int InputStream.read()>
	//   88  147:istore_2        
					while(i1 >= 0 && decodabet[i1 & 0x7f] <= -5);
	//   89  148:iload_2         
	//   90  149:iflt            166
	//   91  152:aload_0         
	//   92  153:getfield        #53  <Field byte[] decodabet>
	//   93  156:iload_2         
	//   94  157:bipush          127
	//   95  159:iand            
	//   96  160:baload          
	//   97  161:bipush          -5
	//   98  163:icmple          140
					if(i1 >= 0)
						break label0;
	//   99  166:iload_2         
	//  100  167:ifge            202
				}
				if(j == 4)
	//* 101  170:iload_1         
	//* 102  171:iconst_4        
	//* 103  172:icmpne          215
				{
					numSigBytes = Base64.access$300(abyte1, 0, buffer, 0, options);
	//  104  175:aload_0         
	//  105  176:aload           5
	//  106  178:iconst_0        
	//  107  179:aload_0         
	//  108  180:getfield        #36  <Field byte[] buffer>
	//  109  183:iconst_0        
	//  110  184:aload_0         
	//  111  185:getfield        #42  <Field int options>
	//  112  188:invokestatic    #75  <Method int Base64.access$300(byte[], int, byte[], int, int)>
	//  113  191:putfield        #71  <Field int numSigBytes>
					position = 0;
	//  114  194:aload_0         
	//  115  195:iconst_0        
	//  116  196:putfield        #38  <Field int position>
				} else
	//* 117  199:goto            106
	//* 118  202:aload           5
	//* 119  204:iload_1         
	//* 120  205:iload_2         
	//* 121  206:int2byte        
	//* 122  207:bastore         
	//* 123  208:iload_1         
	//* 124  209:iconst_1        
	//* 125  210:iadd            
	//* 126  211:istore_1        
	//* 127  212:goto            135
				if(j == 0)
	//* 128  215:iload_1         
	//* 129  216:ifne            221
					return -1;
	//  130  219:iconst_m1       
	//  131  220:ireturn         
				else
					throw new IOException(MessageLocalization.getComposedMessage("improperly.padded.base64.input", new Object[0]));
	//  132  221:new             #57  <Class IOException>
	//  133  224:dup             
	//  134  225:ldc1            #77  <String "improperly.padded.base64.input">
	//  135  227:iconst_0        
	//  136  228:anewarray       Object[]
	//  137  231:invokestatic    #85  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  138  234:invokespecial   #88  <Method void IOException(String)>
	//  139  237:athrow          
				continue;
			}
			abyte1[j] = (byte)i1;
			j++;
		} while(true);
		do
		{
			if(position >= 0)
			{
				if(position >= numSigBytes)
					return -1;
				if(encode && breakLines && lineLength >= 76)
	//* 140  238:aload_0         
	//* 141  239:getfield        #32  <Field boolean encode>
	//* 142  242:ifeq            269
	//* 143  245:aload_0         
	//* 144  246:getfield        #30  <Field boolean breakLines>
	//* 145  249:ifeq            269
	//* 146  252:aload_0         
	//* 147  253:getfield        #40  <Field int lineLength>
	//* 148  256:bipush          76
	//* 149  258:icmplt          269
				{
					lineLength = 0;
	//  150  261:aload_0         
	//  151  262:iconst_0        
	//  152  263:putfield        #40  <Field int lineLength>
					return 10;
	//  153  266:bipush          10
	//  154  268:ireturn         
				}
				lineLength = lineLength + 1;
	//  155  269:aload_0         
	//  156  270:aload_0         
	//  157  271:getfield        #40  <Field int lineLength>
	//  158  274:iconst_1        
	//  159  275:iadd            
	//  160  276:putfield        #40  <Field int lineLength>
				byte abyte2[] = buffer;
	//  161  279:aload_0         
	//  162  280:getfield        #36  <Field byte[] buffer>
	//  163  283:astore          5
				int k = position;
	//  164  285:aload_0         
	//  165  286:getfield        #38  <Field int position>
	//  166  289:istore_1        
				position = k + 1;
	//  167  290:aload_0         
	//  168  291:iload_1         
	//  169  292:iconst_1        
	//  170  293:iadd            
	//  171  294:putfield        #38  <Field int position>
				k = ((int) (abyte2[k]));
	//  172  297:aload           5
	//  173  299:iload_1         
	//  174  300:baload          
	//  175  301:istore_1        
				if(position >= bufferLength)
	//* 176  302:aload_0         
	//* 177  303:getfield        #38  <Field int position>
	//* 178  306:aload_0         
	//* 179  307:getfield        #34  <Field int bufferLength>
	//* 180  310:icmplt          318
					position = -1;
	//  181  313:aload_0         
	//  182  314:iconst_m1       
	//  183  315:putfield        #38  <Field int position>
				return k & 0xff;
	//  184  318:iload_1         
	//  185  319:sipush          255
	//  186  322:iand            
	//  187  323:ireturn         
			}
			throw new IOException(MessageLocalization.getComposedMessage("error.in.base64.code.reading.stream", new Object[0]));
	//  188  324:new             #57  <Class IOException>
	//  189  327:dup             
	//  190  328:ldc1            #90  <String "error.in.base64.code.reading.stream">
	//  191  330:iconst_0        
	//  192  331:anewarray       Object[]
	//  193  334:invokestatic    #85  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  194  337:invokespecial   #88  <Method void IOException(String)>
	//  195  340:athrow          
		} while(true);
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		int l;
label0:
		{
			int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
			do
			{
				l = k;
	//    2    3:iload           4
	//    3    5:istore          5
				if(k >= j)
					break label0;
	//    4    7:iload           4
	//    5    9:iload_3         
	//    6   10:icmpge          54
				l = read();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #93  <Method int read()>
	//    9   17:istore          5
				if(l < 0)
					break;
	//   10   19:iload           5
	//   11   21:iflt            42
				abyte0[i + k] = (byte)l;
	//   12   24:aload_1         
	//   13   25:iload_2         
	//   14   26:iload           4
	//   15   28:iadd            
	//   16   29:iload           5
	//   17   31:int2byte        
	//   18   32:bastore         
				k++;
	//   19   33:iload           4
	//   20   35:iconst_1        
	//   21   36:iadd            
	//   22   37:istore          4
			} while(true);
	//   23   39:goto            3
			l = k;
	//   24   42:iload           4
	//   25   44:istore          5
			if(k == 0)
	//*  26   46:iload           4
	//*  27   48:ifne            54
				l = -1;
	//   28   51:iconst_m1       
	//   29   52:istore          5
		}
		return l;
	//   30   54:iload           5
	//   31   56:ireturn         
	}

	private byte alphabet[];
	private boolean breakLines;
	private byte buffer[];
	private int bufferLength;
	private byte decodabet[];
	private boolean encode;
	private int lineLength;
	private int numSigBytes;
	private int options;
	private int position;

	public Base64$InputStream(InputStream inputstream)
	{
		this(inputstream, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #25  <Method void Base64$InputStream(InputStream, int)>
	//    4    6:return          
	}

	public Base64$InputStream(InputStream inputstream, int i)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		super(inputstream);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #28  <Method void FilterInputStream(InputStream)>
		int j;
		boolean flag;
		if((i & 8) != 8)
	//*   5    8:iload_2         
	//*   6    9:bipush          8
	//*   7   11:iand            
	//*   8   12:bipush          8
	//*   9   14:icmpeq          99
			flag = true;
	//   10   17:iconst_1        
	//   11   18:istore          4
		else
	//*  12   20:aload_0         
	//*  13   21:iload           4
	//*  14   23:putfield        #30  <Field boolean breakLines>
	//*  15   26:iload_2         
	//*  16   27:iconst_1        
	//*  17   28:iand            
	//*  18   29:iconst_1        
	//*  19   30:icmpne          105
	//*  20   33:iload           5
	//*  21   35:istore          4
	//*  22   37:aload_0         
	//*  23   38:iload           4
	//*  24   40:putfield        #32  <Field boolean encode>
	//*  25   43:aload_0         
	//*  26   44:getfield        #32  <Field boolean encode>
	//*  27   47:ifeq            111
	//*  28   50:iconst_4        
	//*  29   51:istore_3        
	//*  30   52:aload_0         
	//*  31   53:iload_3         
	//*  32   54:putfield        #34  <Field int bufferLength>
	//*  33   57:aload_0         
	//*  34   58:aload_0         
	//*  35   59:getfield        #34  <Field int bufferLength>
	//*  36   62:newarray        byte[]
	//*  37   64:putfield        #36  <Field byte[] buffer>
	//*  38   67:aload_0         
	//*  39   68:iconst_m1       
	//*  40   69:putfield        #38  <Field int position>
	//*  41   72:aload_0         
	//*  42   73:iconst_0        
	//*  43   74:putfield        #40  <Field int lineLength>
	//*  44   77:aload_0         
	//*  45   78:iload_2         
	//*  46   79:putfield        #42  <Field int options>
	//*  47   82:aload_0         
	//*  48   83:iload_2         
	//*  49   84:invokestatic    #46  <Method byte[] Base64.access$000(int)>
	//*  50   87:putfield        #48  <Field byte[] alphabet>
	//*  51   90:aload_0         
	//*  52   91:iload_2         
	//*  53   92:invokestatic    #51  <Method byte[] Base64.access$100(int)>
	//*  54   95:putfield        #53  <Field byte[] decodabet>
	//*  55   98:return          
			flag = false;
	//   56   99:iconst_0        
	//   57  100:istore          4
		breakLines = flag;
		if((i & 1) == 1)
			flag = flag1;
		else
	//*  58  102:goto            20
			flag = false;
	//   59  105:iconst_0        
	//   60  106:istore          4
		encode = flag;
		if(encode)
			j = 4;
		else
	//*  61  108:goto            37
			j = 3;
	//   62  111:iconst_3        
	//   63  112:istore_3        
		bufferLength = j;
		buffer = new byte[bufferLength];
		position = -1;
		lineLength = 0;
		options = i;
		alphabet = Base64.access$000(i);
		decodabet = Base64.access$100(i);
	//*  64  113:goto            52
	}
}
