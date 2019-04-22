// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.websocket;

import java.io.*;

// Referenced classes of package com.facebook.stetho.websocket:
//			MaskingHelper

class Frame
{

	Frame()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	private void decodeFirstByte(byte byte0)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		boolean flag;
		if((byte0 & 0x80) != 0)
	//*   2    2:iload_1         
	//*   3    3:sipush          128
	//*   4    6:iand            
	//*   5    7:ifeq            15
			flag = true;
	//    6   10:iconst_1        
	//    7   11:istore_2        
		else
	//*   8   12:goto            17
			flag = false;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		fin = flag;
	//   11   17:aload_0         
	//   12   18:iload_2         
	//   13   19:putfield        #36  <Field boolean fin>
		if((byte0 & 0x40) != 0)
	//*  14   22:iload_1         
	//*  15   23:bipush          64
	//*  16   25:iand            
	//*  17   26:ifeq            34
			flag = true;
	//   18   29:iconst_1        
	//   19   30:istore_2        
		else
	//*  20   31:goto            36
			flag = false;
	//   21   34:iconst_0        
	//   22   35:istore_2        
		rsv1 = flag;
	//   23   36:aload_0         
	//   24   37:iload_2         
	//   25   38:putfield        #38  <Field boolean rsv1>
		if((byte0 & 0x20) != 0)
	//*  26   41:iload_1         
	//*  27   42:bipush          32
	//*  28   44:iand            
	//*  29   45:ifeq            53
			flag = true;
	//   30   48:iconst_1        
	//   31   49:istore_2        
		else
	//*  32   50:goto            55
			flag = false;
	//   33   53:iconst_0        
	//   34   54:istore_2        
		rsv2 = flag;
	//   35   55:aload_0         
	//   36   56:iload_2         
	//   37   57:putfield        #40  <Field boolean rsv2>
		if((byte0 & 0x10) != 0)
	//*  38   60:iload_1         
	//*  39   61:bipush          16
	//*  40   63:iand            
	//*  41   64:ifeq            72
			flag = flag1;
	//   42   67:iload_3         
	//   43   68:istore_2        
		else
	//*  44   69:goto            74
			flag = false;
	//   45   72:iconst_0        
	//   46   73:istore_2        
		rsv3 = flag;
	//   47   74:aload_0         
	//   48   75:iload_2         
	//   49   76:putfield        #42  <Field boolean rsv3>
		opcode = (byte)(byte0 & 0xf);
	//   50   79:aload_0         
	//   51   80:iload_1         
	//   52   81:bipush          15
	//   53   83:iand            
	//   54   84:int2byte        
	//   55   85:putfield        #44  <Field byte opcode>
	//   56   88:return          
	}

	private long decodeLength(byte byte0, InputStream inputstream)
		throws IOException
	{
		if(byte0 <= 125)
	//*   0    0:iload_1         
	//*   1    1:bipush          125
	//*   2    3:icmpgt          9
			return (long)byte0;
	//    3    6:iload_1         
	//    4    7:i2l             
	//    5    8:lreturn         
		if(byte0 == 126)
	//*   6    9:iload_1         
	//*   7   10:bipush          126
	//*   8   12:icmpne          37
			return (long)((readByteOrThrow(inputstream) & 0xff) << 8 | readByteOrThrow(inputstream) & 0xff);
	//    9   15:aload_2         
	//   10   16:invokestatic    #52  <Method byte readByteOrThrow(InputStream)>
	//   11   19:sipush          255
	//   12   22:iand            
	//   13   23:bipush          8
	//   14   25:ishl            
	//   15   26:aload_2         
	//   16   27:invokestatic    #52  <Method byte readByteOrThrow(InputStream)>
	//   17   30:sipush          255
	//   18   33:iand            
	//   19   34:ior             
	//   20   35:i2l             
	//   21   36:lreturn         
		if(byte0 == 127)
	//*  22   37:iload_1         
	//*  23   38:bipush          127
	//*  24   40:icmpne          77
		{
			long l = 0L;
	//   25   43:lconst_0        
	//   26   44:lstore_3        
			for(byte0 = 0; byte0 < 8; byte0++)
	//*  27   45:iconst_0        
	//*  28   46:istore_1        
	//*  29   47:iload_1         
	//*  30   48:bipush          8
	//*  31   50:icmpge          75
				l = (l | (long)(readByteOrThrow(inputstream) & 0xff)) << 8;
	//   32   53:lload_3         
	//   33   54:aload_2         
	//   34   55:invokestatic    #52  <Method byte readByteOrThrow(InputStream)>
	//   35   58:sipush          255
	//   36   61:iand            
	//   37   62:i2l             
	//   38   63:lor             
	//   39   64:bipush          8
	//   40   66:lshl            
	//   41   67:lstore_3        

	//   42   68:iload_1         
	//   43   69:iconst_1        
	//   44   70:iadd            
	//   45   71:istore_1        
	//*  46   72:goto            47
			return l;
	//   47   75:lload_3         
	//   48   76:lreturn         
		} else
		{
			inputstream = ((InputStream) (new StringBuilder()));
	//   49   77:new             #54  <Class StringBuilder>
	//   50   80:dup             
	//   51   81:invokespecial   #55  <Method void StringBuilder()>
	//   52   84:astore_2        
			((StringBuilder) (inputstream)).append("Unexpected length byte: ");
	//   53   85:aload_2         
	//   54   86:ldc1            #57  <String "Unexpected length byte: ">
	//   55   88:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   56   91:pop             
			((StringBuilder) (inputstream)).append(((int) (byte0)));
	//   57   92:aload_2         
	//   58   93:iload_1         
	//   59   94:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
	//   60   97:pop             
			throw new IOException(((StringBuilder) (inputstream)).toString());
	//   61   98:new             #48  <Class IOException>
	//   62  101:dup             
	//   63  102:aload_2         
	//   64  103:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   65  106:invokespecial   #71  <Method void IOException(String)>
	//   66  109:athrow          
		}
	}

	private static byte[] decodeMaskingKey(InputStream inputstream)
		throws IOException
	{
		byte abyte0[] = new byte[4];
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:astore_1        
		readBytesOrThrow(inputstream, abyte0, 0, abyte0.length);
	//    3    4:aload_0         
	//    4    5:aload_1         
	//    5    6:iconst_0        
	//    6    7:aload_1         
	//    7    8:arraylength     
	//    8    9:invokestatic    #78  <Method void readBytesOrThrow(InputStream, byte[], int, int)>
		return abyte0;
	//    9   12:aload_1         
	//   10   13:areturn         
	}

	private byte encodeFirstByte()
	{
		byte byte1;
		if(fin)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field boolean fin>
	//*   2    4:ifeq            15
			byte1 = (byte)128;
	//    3    7:sipush          128
	//    4   10:int2byte        
	//    5   11:istore_2        
		else
	//*   6   12:goto            17
			byte1 = 0;
	//    7   15:iconst_0        
	//    8   16:istore_2        
		byte byte0 = byte1;
	//    9   17:iload_2         
	//   10   18:istore_1        
		if(rsv1)
	//*  11   19:aload_0         
	//*  12   20:getfield        #38  <Field boolean rsv1>
	//*  13   23:ifeq            32
			byte0 = (byte)(byte1 | 0x40);
	//   14   26:iload_2         
	//   15   27:bipush          64
	//   16   29:ior             
	//   17   30:int2byte        
	//   18   31:istore_1        
		byte1 = byte0;
	//   19   32:iload_1         
	//   20   33:istore_2        
		if(rsv2)
	//*  21   34:aload_0         
	//*  22   35:getfield        #40  <Field boolean rsv2>
	//*  23   38:ifeq            47
			byte1 = (byte)(byte0 | 0x20);
	//   24   41:iload_1         
	//   25   42:bipush          32
	//   26   44:ior             
	//   27   45:int2byte        
	//   28   46:istore_2        
		byte0 = byte1;
	//   29   47:iload_2         
	//   30   48:istore_1        
		if(rsv3)
	//*  31   49:aload_0         
	//*  32   50:getfield        #42  <Field boolean rsv3>
	//*  33   53:ifeq            62
			byte0 = (byte)(byte1 | 0x10);
	//   34   56:iload_2         
	//   35   57:bipush          16
	//   36   59:ior             
	//   37   60:int2byte        
	//   38   61:istore_1        
		return (byte)(byte0 | opcode & 0xf);
	//   39   62:iload_1         
	//   40   63:aload_0         
	//   41   64:getfield        #44  <Field byte opcode>
	//   42   67:bipush          15
	//   43   69:iand            
	//   44   70:ior             
	//   45   71:int2byte        
	//   46   72:ireturn         
	}

	private static byte[] encodeLength(long l)
	{
		if(l <= 125L)
	//*   0    0:lload_0         
	//*   1    1:ldc2w           #83  <Long 125L>
	//*   2    4:lcmp            
	//*   3    5:ifgt            18
			return (new byte[] {
				(byte)(int)l
			});
	//    4    8:iconst_1        
	//    5    9:newarray        byte[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:lload_0         
	//    9   14:l2i             
	//   10   15:int2byte        
	//   11   16:bastore         
	//   12   17:areturn         
		if(l <= 65535L)
	//*  13   18:lload_0         
	//*  14   19:ldc2w           #85  <Long 65535L>
	//*  15   22:lcmp            
	//*  16   23:ifgt            58
			return (new byte[] {
				126, (byte)(int)(l >> 8 & 255L), (byte)(int)(l & 255L)
			});
	//   17   26:iconst_3        
	//   18   27:newarray        byte[]
	//   19   29:dup             
	//   20   30:iconst_0        
	//   21   31:bipush          126
	//   22   33:bastore         
	//   23   34:dup             
	//   24   35:iconst_1        
	//   25   36:lload_0         
	//   26   37:bipush          8
	//   27   39:lshr            
	//   28   40:ldc2w           #87  <Long 255L>
	//   29   43:land            
	//   30   44:l2i             
	//   31   45:int2byte        
	//   32   46:bastore         
	//   33   47:dup             
	//   34   48:iconst_2        
	//   35   49:lload_0         
	//   36   50:ldc2w           #87  <Long 255L>
	//   37   53:land            
	//   38   54:l2i             
	//   39   55:int2byte        
	//   40   56:bastore         
	//   41   57:areturn         
		else
			return (new byte[] {
				127, (byte)(int)(l >> 56 & 255L), (byte)(int)(l >> 48 & 255L), (byte)(int)(l >> 40 & 255L), (byte)(int)(l >> 32 & 255L), (byte)(int)(l >> 24 & 255L), (byte)(int)(l >> 16 & 255L), (byte)(int)(l >> 8 & 255L), (byte)(int)(l & 255L)
			});
	//   42   58:bipush          9
	//   43   60:newarray        byte[]
	//   44   62:dup             
	//   45   63:iconst_0        
	//   46   64:bipush          127
	//   47   66:bastore         
	//   48   67:dup             
	//   49   68:iconst_1        
	//   50   69:lload_0         
	//   51   70:bipush          56
	//   52   72:lshr            
	//   53   73:ldc2w           #87  <Long 255L>
	//   54   76:land            
	//   55   77:l2i             
	//   56   78:int2byte        
	//   57   79:bastore         
	//   58   80:dup             
	//   59   81:iconst_2        
	//   60   82:lload_0         
	//   61   83:bipush          48
	//   62   85:lshr            
	//   63   86:ldc2w           #87  <Long 255L>
	//   64   89:land            
	//   65   90:l2i             
	//   66   91:int2byte        
	//   67   92:bastore         
	//   68   93:dup             
	//   69   94:iconst_3        
	//   70   95:lload_0         
	//   71   96:bipush          40
	//   72   98:lshr            
	//   73   99:ldc2w           #87  <Long 255L>
	//   74  102:land            
	//   75  103:l2i             
	//   76  104:int2byte        
	//   77  105:bastore         
	//   78  106:dup             
	//   79  107:iconst_4        
	//   80  108:lload_0         
	//   81  109:bipush          32
	//   82  111:lshr            
	//   83  112:ldc2w           #87  <Long 255L>
	//   84  115:land            
	//   85  116:l2i             
	//   86  117:int2byte        
	//   87  118:bastore         
	//   88  119:dup             
	//   89  120:iconst_5        
	//   90  121:lload_0         
	//   91  122:bipush          24
	//   92  124:lshr            
	//   93  125:ldc2w           #87  <Long 255L>
	//   94  128:land            
	//   95  129:l2i             
	//   96  130:int2byte        
	//   97  131:bastore         
	//   98  132:dup             
	//   99  133:bipush          6
	//  100  135:lload_0         
	//  101  136:bipush          16
	//  102  138:lshr            
	//  103  139:ldc2w           #87  <Long 255L>
	//  104  142:land            
	//  105  143:l2i             
	//  106  144:int2byte        
	//  107  145:bastore         
	//  108  146:dup             
	//  109  147:bipush          7
	//  110  149:lload_0         
	//  111  150:bipush          8
	//  112  152:lshr            
	//  113  153:ldc2w           #87  <Long 255L>
	//  114  156:land            
	//  115  157:l2i             
	//  116  158:int2byte        
	//  117  159:bastore         
	//  118  160:dup             
	//  119  161:bipush          8
	//  120  163:lload_0         
	//  121  164:ldc2w           #87  <Long 255L>
	//  122  167:land            
	//  123  168:l2i             
	//  124  169:int2byte        
	//  125  170:bastore         
	//  126  171:areturn         
	}

	private static byte readByteOrThrow(InputStream inputstream)
		throws IOException
	{
		int i = inputstream.read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #94  <Method int InputStream.read()>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          13
			return (byte)i;
	//    6   10:iload_1         
	//    7   11:int2byte        
	//    8   12:ireturn         
		else
			throw new EOFException();
	//    9   13:new             #96  <Class EOFException>
	//   10   16:dup             
	//   11   17:invokespecial   #97  <Method void EOFException()>
	//   12   20:athrow          
	}

	private static void readBytesOrThrow(InputStream inputstream, byte abyte0[], int i, int j)
		throws IOException
	{
		while(j > 0) 
	//*   0    0:iload_3         
	//*   1    1:ifle            40
		{
			int k = inputstream.read(abyte0, i, j);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokevirtual   #100 <Method int InputStream.read(byte[], int, int)>
	//    7   11:istore          4
			if(k != -1)
	//*   8   13:iload           4
	//*   9   15:iconst_m1       
	//*  10   16:icmpeq          32
			{
				j -= k;
	//   11   19:iload_3         
	//   12   20:iload           4
	//   13   22:isub            
	//   14   23:istore_3        
				i += k;
	//   15   24:iload_2         
	//   16   25:iload           4
	//   17   27:iadd            
	//   18   28:istore_2        
			} else
	//*  19   29:goto            0
			{
				throw new EOFException();
	//   20   32:new             #96  <Class EOFException>
	//   21   35:dup             
	//   22   36:invokespecial   #97  <Method void EOFException()>
	//   23   39:athrow          
			}
		}
	//   24   40:return          
	}

	public void readFrom(BufferedInputStream bufferedinputstream)
		throws IOException
	{
		decodeFirstByte(readByteOrThrow(((InputStream) (bufferedinputstream))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #52  <Method byte readByteOrThrow(InputStream)>
	//    3    5:invokespecial   #104 <Method void decodeFirstByte(byte)>
		byte byte0 = readByteOrThrow(((InputStream) (bufferedinputstream)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #52  <Method byte readByteOrThrow(InputStream)>
	//    6   12:istore_2        
		boolean flag;
		if((byte0 & 0x80) != 0)
	//*   7   13:iload_2         
	//*   8   14:sipush          128
	//*   9   17:iand            
	//*  10   18:ifeq            26
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_3        
		else
	//*  13   23:goto            28
			flag = false;
	//   14   26:iconst_0        
	//   15   27:istore_3        
		hasMask = flag;
	//   16   28:aload_0         
	//   17   29:iload_3         
	//   18   30:putfield        #106 <Field boolean hasMask>
		payloadLen = decodeLength((byte)(byte0 & 0xffffff7f), ((InputStream) (bufferedinputstream)));
	//   19   33:aload_0         
	//   20   34:aload_0         
	//   21   35:iload_2         
	//   22   36:sipush          -129
	//   23   39:iand            
	//   24   40:int2byte        
	//   25   41:aload_1         
	//   26   42:invokespecial   #108 <Method long decodeLength(byte, InputStream)>
	//   27   45:putfield        #110 <Field long payloadLen>
		byte abyte0[];
		if(hasMask)
	//*  28   48:aload_0         
	//*  29   49:getfield        #106 <Field boolean hasMask>
	//*  30   52:ifeq            64
			abyte0 = decodeMaskingKey(((InputStream) (bufferedinputstream)));
	//   31   55:aload_1         
	//   32   56:invokestatic    #112 <Method byte[] decodeMaskingKey(InputStream)>
	//   33   59:astore          6
		else
	//*  34   61:goto            67
			abyte0 = null;
	//   35   64:aconst_null     
	//   36   65:astore          6
		maskingKey = abyte0;
	//   37   67:aload_0         
	//   38   68:aload           6
	//   39   70:putfield        #114 <Field byte[] maskingKey>
		long l = payloadLen;
	//   40   73:aload_0         
	//   41   74:getfield        #110 <Field long payloadLen>
	//   42   77:lstore          4
		payloadData = new byte[(int)l];
	//   43   79:aload_0         
	//   44   80:lload           4
	//   45   82:l2i             
	//   46   83:newarray        byte[]
	//   47   85:putfield        #116 <Field byte[] payloadData>
		readBytesOrThrow(((InputStream) (bufferedinputstream)), payloadData, 0, (int)l);
	//   48   88:aload_1         
	//   49   89:aload_0         
	//   50   90:getfield        #116 <Field byte[] payloadData>
	//   51   93:iconst_0        
	//   52   94:lload           4
	//   53   96:l2i             
	//   54   97:invokestatic    #78  <Method void readBytesOrThrow(InputStream, byte[], int, int)>
		MaskingHelper.unmask(maskingKey, payloadData, 0, (int)payloadLen);
	//   55  100:aload_0         
	//   56  101:getfield        #114 <Field byte[] maskingKey>
	//   57  104:aload_0         
	//   58  105:getfield        #116 <Field byte[] payloadData>
	//   59  108:iconst_0        
	//   60  109:aload_0         
	//   61  110:getfield        #110 <Field long payloadLen>
	//   62  113:l2i             
	//   63  114:invokestatic    #122 <Method void MaskingHelper.unmask(byte[], byte[], int, int)>
	//   64  117:return          
	}

	public void writeTo(BufferedOutputStream bufferedoutputstream)
		throws IOException
	{
		bufferedoutputstream.write(((int) (encodeFirstByte())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokespecial   #126 <Method byte encodeFirstByte()>
	//    3    5:invokevirtual   #132 <Method void BufferedOutputStream.write(int)>
		byte abyte0[] = encodeLength(payloadLen);
	//    4    8:aload_0         
	//    5    9:getfield        #110 <Field long payloadLen>
	//    6   12:invokestatic    #134 <Method byte[] encodeLength(long)>
	//    7   15:astore_2        
		if(hasMask)
	//*   8   16:aload_0         
	//*   9   17:getfield        #106 <Field boolean hasMask>
	//*  10   20:ifeq            34
			abyte0[0] = (byte)(abyte0[0] | 0x80);
	//   11   23:aload_2         
	//   12   24:iconst_0        
	//   13   25:aload_2         
	//   14   26:iconst_0        
	//   15   27:baload          
	//   16   28:sipush          128
	//   17   31:ior             
	//   18   32:int2byte        
	//   19   33:bastore         
		bufferedoutputstream.write(abyte0, 0, abyte0.length);
	//   20   34:aload_1         
	//   21   35:aload_2         
	//   22   36:iconst_0        
	//   23   37:aload_2         
	//   24   38:arraylength     
	//   25   39:invokevirtual   #137 <Method void BufferedOutputStream.write(byte[], int, int)>
		if(!hasMask)
	//*  26   42:aload_0         
	//*  27   43:getfield        #106 <Field boolean hasMask>
	//*  28   46:ifne            64
		{
			bufferedoutputstream.write(payloadData, 0, (int)payloadLen);
	//   29   49:aload_1         
	//   30   50:aload_0         
	//   31   51:getfield        #116 <Field byte[] payloadData>
	//   32   54:iconst_0        
	//   33   55:aload_0         
	//   34   56:getfield        #110 <Field long payloadLen>
	//   35   59:l2i             
	//   36   60:invokevirtual   #137 <Method void BufferedOutputStream.write(byte[], int, int)>
			return;
	//   37   63:return          
		} else
		{
			throw new UnsupportedOperationException("Writing masked data not implemented");
	//   38   64:new             #139 <Class UnsupportedOperationException>
	//   39   67:dup             
	//   40   68:ldc1            #141 <String "Writing masked data not implemented">
	//   41   70:invokespecial   #142 <Method void UnsupportedOperationException(String)>
	//   42   73:athrow          
		}
	}

	public static final byte OPCODE_BINARY_FRAME = 2;
	public static final byte OPCODE_CONNECTION_CLOSE = 8;
	public static final byte OPCODE_CONNECTION_PING = 9;
	public static final byte OPCODE_CONNECTION_PONG = 10;
	public static final byte OPCODE_TEXT_FRAME = 1;
	public boolean fin;
	public boolean hasMask;
	public byte maskingKey[];
	public byte opcode;
	public byte payloadData[];
	public long payloadLen;
	public boolean rsv1;
	public boolean rsv2;
	public boolean rsv3;
}
