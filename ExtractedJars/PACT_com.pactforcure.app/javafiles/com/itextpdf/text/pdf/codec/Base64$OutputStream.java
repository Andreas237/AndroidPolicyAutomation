// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.*;

// Referenced classes of package com.itextpdf.text.pdf.codec:
//			Base64

public static class Base64$OutputStream extends FilterOutputStream
{

	public void close()
		throws IOException
	{
		flushBase64();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method void flushBase64()>
		super.close();
	//    2    4:aload_0         
	//    3    5:invokespecial   #67  <Method void FilterOutputStream.close()>
		buffer = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #37  <Field byte[] buffer>
		out = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #71  <Field OutputStream out>
	//   10   18:return          
	}

	public void flushBase64()
		throws IOException
	{
label0:
		{
			if(position > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field int position>
	//*   2    4:ifle            45
			{
				if(!encode)
					break label0;
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field boolean encode>
	//    5   11:ifeq            46
				out.write(Base64.access$400(b4, buffer, position, options));
	//    6   14:aload_0         
	//    7   15:getfield        #71  <Field OutputStream out>
	//    8   18:aload_0         
	//    9   19:getfield        #45  <Field byte[] b4>
	//   10   22:aload_0         
	//   11   23:getfield        #37  <Field byte[] buffer>
	//   12   26:aload_0         
	//   13   27:getfield        #39  <Field int position>
	//   14   30:aload_0         
	//   15   31:getfield        #47  <Field int options>
	//   16   34:invokestatic    #76  <Method byte[] Base64.access$400(byte[], byte[], int, int)>
	//   17   37:invokevirtual   #82  <Method void OutputStream.write(byte[])>
				position = 0;
	//   18   40:aload_0         
	//   19   41:iconst_0        
	//   20   42:putfield        #39  <Field int position>
			}
			return;
	//   21   45:return          
		}
		throw new IOException(MessageLocalization.getComposedMessage("base64.input.not.properly.padded", new Object[0]));
	//   22   46:new             #62  <Class IOException>
	//   23   49:dup             
	//   24   50:ldc1            #84  <String "base64.input.not.properly.padded">
	//   25   52:iconst_0        
	//   26   53:anewarray       Object[]
	//   27   56:invokestatic    #92  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   28   59:invokespecial   #95  <Method void IOException(String)>
	//   29   62:athrow          
	}

	public void resumeEncoding()
	{
		suspendEncoding = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #43  <Field boolean suspendEncoding>
	//    3    5:return          
	}

	public void suspendEncoding()
		throws IOException
	{
		flushBase64();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method void flushBase64()>
		suspendEncoding = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #43  <Field boolean suspendEncoding>
	//    5    9:return          
	}

	public void write(int i)
		throws IOException
	{
		if(!suspendEncoding) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean suspendEncoding>
	//    2    4:ifeq            16
_L1:
		super.out.write(i);
	//    3    7:aload_0         
	//    4    8:getfield        #98  <Field OutputStream FilterOutputStream.out>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #100 <Method void OutputStream.write(int)>
_L4:
		return;
	//    7   15:return          
_L2:
		if(!encode)
			break; /* Loop/switch isn't completed */
	//    8   16:aload_0         
	//    9   17:getfield        #33  <Field boolean encode>
	//   10   20:ifeq            128
		byte abyte0[] = buffer;
	//   11   23:aload_0         
	//   12   24:getfield        #37  <Field byte[] buffer>
	//   13   27:astore_3        
		int j = position;
	//   14   28:aload_0         
	//   15   29:getfield        #39  <Field int position>
	//   16   32:istore_2        
		position = j + 1;
	//   17   33:aload_0         
	//   18   34:iload_2         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:putfield        #39  <Field int position>
		abyte0[j] = (byte)i;
	//   22   40:aload_3         
	//   23   41:iload_2         
	//   24   42:iload_1         
	//   25   43:int2byte        
	//   26   44:bastore         
		if(position >= bufferLength)
	//*  27   45:aload_0         
	//*  28   46:getfield        #39  <Field int position>
	//*  29   49:aload_0         
	//*  30   50:getfield        #35  <Field int bufferLength>
	//*  31   53:icmplt          15
		{
			out.write(Base64.access$400(b4, buffer, bufferLength, options));
	//   32   56:aload_0         
	//   33   57:getfield        #71  <Field OutputStream out>
	//   34   60:aload_0         
	//   35   61:getfield        #45  <Field byte[] b4>
	//   36   64:aload_0         
	//   37   65:getfield        #37  <Field byte[] buffer>
	//   38   68:aload_0         
	//   39   69:getfield        #35  <Field int bufferLength>
	//   40   72:aload_0         
	//   41   73:getfield        #47  <Field int options>
	//   42   76:invokestatic    #76  <Method byte[] Base64.access$400(byte[], byte[], int, int)>
	//   43   79:invokevirtual   #82  <Method void OutputStream.write(byte[])>
			lineLength = lineLength + 4;
	//   44   82:aload_0         
	//   45   83:aload_0         
	//   46   84:getfield        #41  <Field int lineLength>
	//   47   87:iconst_4        
	//   48   88:iadd            
	//   49   89:putfield        #41  <Field int lineLength>
			if(breakLines && lineLength >= 76)
	//*  50   92:aload_0         
	//*  51   93:getfield        #31  <Field boolean breakLines>
	//*  52   96:ifeq            122
	//*  53   99:aload_0         
	//*  54  100:getfield        #41  <Field int lineLength>
	//*  55  103:bipush          76
	//*  56  105:icmplt          122
			{
				out.write(10);
	//   57  108:aload_0         
	//   58  109:getfield        #71  <Field OutputStream out>
	//   59  112:bipush          10
	//   60  114:invokevirtual   #100 <Method void OutputStream.write(int)>
				lineLength = 0;
	//   61  117:aload_0         
	//   62  118:iconst_0        
	//   63  119:putfield        #41  <Field int lineLength>
			}
			position = 0;
	//   64  122:aload_0         
	//   65  123:iconst_0        
	//   66  124:putfield        #39  <Field int position>
			return;
	//   67  127:return          
		}
		if(true) goto _L4; else goto _L3
_L3:
		if(decodabet[i & 0x7f] <= -5)
			continue; /* Loop/switch isn't completed */
	//   68  128:aload_0         
	//   69  129:getfield        #58  <Field byte[] decodabet>
	//   70  132:iload_1         
	//   71  133:bipush          127
	//   72  135:iand            
	//   73  136:baload          
	//   74  137:bipush          -5
	//   75  139:icmple          212
		byte abyte1[] = buffer;
	//   76  142:aload_0         
	//   77  143:getfield        #37  <Field byte[] buffer>
	//   78  146:astore_3        
		int k = position;
	//   79  147:aload_0         
	//   80  148:getfield        #39  <Field int position>
	//   81  151:istore_2        
		position = k + 1;
	//   82  152:aload_0         
	//   83  153:iload_2         
	//   84  154:iconst_1        
	//   85  155:iadd            
	//   86  156:putfield        #39  <Field int position>
		abyte1[k] = (byte)i;
	//   87  159:aload_3         
	//   88  160:iload_2         
	//   89  161:iload_1         
	//   90  162:int2byte        
	//   91  163:bastore         
		if(position < bufferLength) goto _L4; else goto _L5
	//   92  164:aload_0         
	//   93  165:getfield        #39  <Field int position>
	//   94  168:aload_0         
	//   95  169:getfield        #35  <Field int bufferLength>
	//   96  172:icmplt          15
_L5:
		i = Base64.access$300(buffer, 0, b4, 0, options);
	//   97  175:aload_0         
	//   98  176:getfield        #37  <Field byte[] buffer>
	//   99  179:iconst_0        
	//  100  180:aload_0         
	//  101  181:getfield        #45  <Field byte[] b4>
	//  102  184:iconst_0        
	//  103  185:aload_0         
	//  104  186:getfield        #47  <Field int options>
	//  105  189:invokestatic    #104 <Method int Base64.access$300(byte[], int, byte[], int, int)>
	//  106  192:istore_1        
		out.write(b4, 0, i);
	//  107  193:aload_0         
	//  108  194:getfield        #71  <Field OutputStream out>
	//  109  197:aload_0         
	//  110  198:getfield        #45  <Field byte[] b4>
	//  111  201:iconst_0        
	//  112  202:iload_1         
	//  113  203:invokevirtual   #107 <Method void OutputStream.write(byte[], int, int)>
		position = 0;
	//  114  206:aload_0         
	//  115  207:iconst_0        
	//  116  208:putfield        #39  <Field int position>
		return;
	//  117  211:return          
		if(decodabet[i & 0x7f] == -5) goto _L4; else goto _L6
	//  118  212:aload_0         
	//  119  213:getfield        #58  <Field byte[] decodabet>
	//  120  216:iload_1         
	//  121  217:bipush          127
	//  122  219:iand            
	//  123  220:baload          
	//  124  221:bipush          -5
	//  125  223:icmpeq          15
_L6:
		throw new IOException(MessageLocalization.getComposedMessage("invalid.character.in.base64.data", new Object[0]));
	//  126  226:new             #62  <Class IOException>
	//  127  229:dup             
	//  128  230:ldc1            #109 <String "invalid.character.in.base64.data">
	//  129  232:iconst_0        
	//  130  233:anewarray       Object[]
	//  131  236:invokestatic    #92  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  132  239:invokespecial   #95  <Method void IOException(String)>
	//  133  242:athrow          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		if(suspendEncoding)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field boolean suspendEncoding>
	//*   2    4:ifeq            18
		{
			super.out.write(abyte0, i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #98  <Field OutputStream FilterOutputStream.out>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #107 <Method void OutputStream.write(byte[], int, int)>
		} else
	//*   9   17:return          
		{
			int k = 0;
	//   10   18:iconst_0        
	//   11   19:istore          4
			while(k < j) 
	//*  12   21:iload           4
	//*  13   23:iload_3         
	//*  14   24:icmpge          17
			{
				write(((int) (abyte0[i + k])));
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:iload_2         
	//   18   30:iload           4
	//   19   32:iadd            
	//   20   33:baload          
	//   21   34:invokevirtual   #110 <Method void write(int)>
				k++;
	//   22   37:iload           4
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore          4
			}
		}
	//*  26   43:goto            21
	}

	private byte alphabet[];
	private byte b4[];
	private boolean breakLines;
	private byte buffer[];
	private int bufferLength;
	private byte decodabet[];
	private boolean encode;
	private int lineLength;
	private int options;
	private int position;
	private boolean suspendEncoding;

	public Base64$OutputStream(OutputStream outputstream)
	{
		this(outputstream, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #26  <Method void Base64$OutputStream(OutputStream, int)>
	//    4    6:return          
	}

	public Base64$OutputStream(OutputStream outputstream, int i)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		super(outputstream);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokespecial   #29  <Method void FilterOutputStream(OutputStream)>
		int j;
		boolean flag;
		if((i & 8) != 8)
	//*   5    8:iload_2         
	//*   6    9:bipush          8
	//*   7   11:iand            
	//*   8   12:bipush          8
	//*   9   14:icmpeq          111
			flag = true;
	//   10   17:iconst_1        
	//   11   18:istore          4
		else
	//*  12   20:aload_0         
	//*  13   21:iload           4
	//*  14   23:putfield        #31  <Field boolean breakLines>
	//*  15   26:iload_2         
	//*  16   27:iconst_1        
	//*  17   28:iand            
	//*  18   29:iconst_1        
	//*  19   30:icmpne          117
	//*  20   33:iload           5
	//*  21   35:istore          4
	//*  22   37:aload_0         
	//*  23   38:iload           4
	//*  24   40:putfield        #33  <Field boolean encode>
	//*  25   43:aload_0         
	//*  26   44:getfield        #33  <Field boolean encode>
	//*  27   47:ifeq            123
	//*  28   50:iconst_3        
	//*  29   51:istore_3        
	//*  30   52:aload_0         
	//*  31   53:iload_3         
	//*  32   54:putfield        #35  <Field int bufferLength>
	//*  33   57:aload_0         
	//*  34   58:aload_0         
	//*  35   59:getfield        #35  <Field int bufferLength>
	//*  36   62:newarray        byte[]
	//*  37   64:putfield        #37  <Field byte[] buffer>
	//*  38   67:aload_0         
	//*  39   68:iconst_0        
	//*  40   69:putfield        #39  <Field int position>
	//*  41   72:aload_0         
	//*  42   73:iconst_0        
	//*  43   74:putfield        #41  <Field int lineLength>
	//*  44   77:aload_0         
	//*  45   78:iconst_0        
	//*  46   79:putfield        #43  <Field boolean suspendEncoding>
	//*  47   82:aload_0         
	//*  48   83:iconst_4        
	//*  49   84:newarray        byte[]
	//*  50   86:putfield        #45  <Field byte[] b4>
	//*  51   89:aload_0         
	//*  52   90:iload_2         
	//*  53   91:putfield        #47  <Field int options>
	//*  54   94:aload_0         
	//*  55   95:iload_2         
	//*  56   96:invokestatic    #51  <Method byte[] Base64.access$000(int)>
	//*  57   99:putfield        #53  <Field byte[] alphabet>
	//*  58  102:aload_0         
	//*  59  103:iload_2         
	//*  60  104:invokestatic    #56  <Method byte[] Base64.access$100(int)>
	//*  61  107:putfield        #58  <Field byte[] decodabet>
	//*  62  110:return          
			flag = false;
	//   63  111:iconst_0        
	//   64  112:istore          4
		breakLines = flag;
		if((i & 1) == 1)
			flag = flag1;
		else
	//*  65  114:goto            20
			flag = false;
	//   66  117:iconst_0        
	//   67  118:istore          4
		encode = flag;
		if(encode)
			j = 3;
		else
	//*  68  120:goto            37
			j = 4;
	//   69  123:iconst_4        
	//   70  124:istore_3        
		bufferLength = j;
		buffer = new byte[bufferLength];
		position = 0;
		lineLength = 0;
		suspendEncoding = false;
		b4 = new byte[4];
		options = i;
		alphabet = Base64.access$000(i);
		decodabet = Base64.access$100(i);
	//*  71  125:goto            52
	}
}
