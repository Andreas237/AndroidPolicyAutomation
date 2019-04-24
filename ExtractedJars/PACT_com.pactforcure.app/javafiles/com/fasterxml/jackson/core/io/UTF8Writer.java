// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import java.io.*;

// Referenced classes of package com.fasterxml.jackson.core.io:
//			IOContext

public final class UTF8Writer extends Writer
{

	public UTF8Writer(IOContext iocontext, OutputStream outputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Writer()>
		_context = iocontext;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field IOContext _context>
		_out = outputstream;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field OutputStream _out>
		_outBuffer = iocontext.allocWriteEncodingBuffer();
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #37  <Method byte[] IOContext.allocWriteEncodingBuffer()>
	//   11   19:putfield        #39  <Field byte[] _outBuffer>
		_outBufferEnd = _outBuffer.length - 4;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #39  <Field byte[] _outBuffer>
	//   15   27:arraylength     
	//   16   28:iconst_4        
	//   17   29:isub            
	//   18   30:putfield        #41  <Field int _outBufferEnd>
		_outPtr = 0;
	//   19   33:aload_0         
	//   20   34:iconst_0        
	//   21   35:putfield        #43  <Field int _outPtr>
	//   22   38:return          
	}

	protected static void illegalSurrogate(int i)
		throws IOException
	{
		throw new IOException(illegalSurrogateDesc(i));
	//    0    0:new             #48  <Class IOException>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokestatic    #52  <Method String illegalSurrogateDesc(int)>
	//    4    8:invokespecial   #55  <Method void IOException(String)>
	//    5   11:athrow          
	}

	protected static String illegalSurrogateDesc(int i)
	{
		if(i > 0x10ffff)
	//*   0    0:iload_0         
	//*   1    1:ldc1            #57  <Int 0x10ffff>
	//*   2    3:icmple          34
			return (new StringBuilder()).append("Illegal character point (0x").append(Integer.toHexString(i)).append(") to output; max is 0x10FFFF as per RFC 4627").toString();
	//    3    6:new             #59  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #60  <Method void StringBuilder()>
	//    6   13:ldc1            #62  <String "Illegal character point (0x">
	//    7   15:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:iload_0         
	//    9   19:invokestatic    #71  <Method String Integer.toHexString(int)>
	//   10   22:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #73  <String ") to output; max is 0x10FFFF as per RFC 4627">
	//   12   27:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   14   33:areturn         
		if(i >= 55296)
	//*  15   34:iload_0         
	//*  16   35:ldc1            #7   <Int 55296>
	//*  17   37:icmplt          102
		{
			if(i <= 56319)
	//*  18   40:iload_0         
	//*  19   41:ldc1            #9   <Int 56319>
	//*  20   43:icmpgt          74
				return (new StringBuilder()).append("Unmatched first part of surrogate pair (0x").append(Integer.toHexString(i)).append(")").toString();
	//   21   46:new             #59  <Class StringBuilder>
	//   22   49:dup             
	//   23   50:invokespecial   #60  <Method void StringBuilder()>
	//   24   53:ldc1            #79  <String "Unmatched first part of surrogate pair (0x">
	//   25   55:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   26   58:iload_0         
	//   27   59:invokestatic    #71  <Method String Integer.toHexString(int)>
	//   28   62:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   29   65:ldc1            #81  <String ")">
	//   30   67:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   31   70:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   32   73:areturn         
			else
				return (new StringBuilder()).append("Unmatched second part of surrogate pair (0x").append(Integer.toHexString(i)).append(")").toString();
	//   33   74:new             #59  <Class StringBuilder>
	//   34   77:dup             
	//   35   78:invokespecial   #60  <Method void StringBuilder()>
	//   36   81:ldc1            #83  <String "Unmatched second part of surrogate pair (0x">
	//   37   83:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   38   86:iload_0         
	//   39   87:invokestatic    #71  <Method String Integer.toHexString(int)>
	//   40   90:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   41   93:ldc1            #81  <String ")">
	//   42   95:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   43   98:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   44  101:areturn         
		} else
		{
			return (new StringBuilder()).append("Illegal character point (0x").append(Integer.toHexString(i)).append(") to output").toString();
	//   45  102:new             #59  <Class StringBuilder>
	//   46  105:dup             
	//   47  106:invokespecial   #60  <Method void StringBuilder()>
	//   48  109:ldc1            #62  <String "Illegal character point (0x">
	//   49  111:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   50  114:iload_0         
	//   51  115:invokestatic    #71  <Method String Integer.toHexString(int)>
	//   52  118:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   53  121:ldc1            #85  <String ") to output">
	//   54  123:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   55  126:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   56  129:areturn         
		}
	}

	public Writer append(char c)
		throws IOException
	{
		write(((int) (c)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #89  <Method void write(int)>
		return ((Writer) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile Appendable append(char c)
		throws IOException
	{
		return ((Appendable) (append(c)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #92  <Method Writer append(char)>
	//    3    5:areturn         
	}

	public void close()
		throws IOException
	{
		if(_out != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field OutputStream _out>
	//*   2    4:ifnull          89
		{
			if(_outPtr > 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #43  <Field int _outPtr>
	//*   5   11:ifle            35
			{
				_out.write(_outBuffer, 0, _outPtr);
	//    6   14:aload_0         
	//    7   15:getfield        #31  <Field OutputStream _out>
	//    8   18:aload_0         
	//    9   19:getfield        #39  <Field byte[] _outBuffer>
	//   10   22:iconst_0        
	//   11   23:aload_0         
	//   12   24:getfield        #43  <Field int _outPtr>
	//   13   27:invokevirtual   #98  <Method void OutputStream.write(byte[], int, int)>
				_outPtr = 0;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #43  <Field int _outPtr>
			}
			OutputStream outputstream = _out;
	//   17   35:aload_0         
	//   18   36:getfield        #31  <Field OutputStream _out>
	//   19   39:astore_2        
			_out = null;
	//   20   40:aload_0         
	//   21   41:aconst_null     
	//   22   42:putfield        #31  <Field OutputStream _out>
			byte abyte0[] = _outBuffer;
	//   23   45:aload_0         
	//   24   46:getfield        #39  <Field byte[] _outBuffer>
	//   25   49:astore_3        
			if(abyte0 != null)
	//*  26   50:aload_3         
	//*  27   51:ifnull          67
			{
				_outBuffer = null;
	//   28   54:aload_0         
	//   29   55:aconst_null     
	//   30   56:putfield        #39  <Field byte[] _outBuffer>
				_context.releaseWriteEncodingBuffer(abyte0);
	//   31   59:aload_0         
	//   32   60:getfield        #29  <Field IOContext _context>
	//   33   63:aload_3         
	//   34   64:invokevirtual   #102 <Method void IOContext.releaseWriteEncodingBuffer(byte[])>
			}
			outputstream.close();
	//   35   67:aload_2         
	//   36   68:invokevirtual   #104 <Method void OutputStream.close()>
			int i = _surrogate;
	//   37   71:aload_0         
	//   38   72:getfield        #106 <Field int _surrogate>
	//   39   75:istore_1        
			_surrogate = 0;
	//   40   76:aload_0         
	//   41   77:iconst_0        
	//   42   78:putfield        #106 <Field int _surrogate>
			if(i > 0)
	//*  43   81:iload_1         
	//*  44   82:ifle            89
				illegalSurrogate(i);
	//   45   85:iload_1         
	//   46   86:invokestatic    #108 <Method void illegalSurrogate(int)>
		}
	//   47   89:return          
	}

	protected int convertSurrogate(int i)
		throws IOException
	{
		int j = _surrogate;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int _surrogate>
	//    2    4:istore_2        
		_surrogate = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #106 <Field int _surrogate>
		if(i < 56320 || i > 57343)
	//*   6   10:iload_1         
	//*   7   11:ldc1            #11  <Int 56320>
	//*   8   13:icmplt          22
	//*   9   16:iload_1         
	//*  10   17:ldc1            #13  <Int 57343>
	//*  11   19:icmple          69
			throw new IOException((new StringBuilder()).append("Broken surrogate pair: first char 0x").append(Integer.toHexString(j)).append(", second 0x").append(Integer.toHexString(i)).append("; illegal combination").toString());
	//   12   22:new             #48  <Class IOException>
	//   13   25:dup             
	//   14   26:new             #59  <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #60  <Method void StringBuilder()>
	//   17   33:ldc1            #112 <String "Broken surrogate pair: first char 0x">
	//   18   35:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:iload_2         
	//   20   39:invokestatic    #71  <Method String Integer.toHexString(int)>
	//   21   42:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   22   45:ldc1            #114 <String ", second 0x">
	//   23   47:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   24   50:iload_1         
	//   25   51:invokestatic    #71  <Method String Integer.toHexString(int)>
	//   26   54:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   27   57:ldc1            #116 <String "; illegal combination">
	//   28   59:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   29   62:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   30   65:invokespecial   #55  <Method void IOException(String)>
	//   31   68:athrow          
		else
			return 0x10000 + (j - 55296 << 10) + (i - 56320);
	//   32   69:ldc1            #117 <Int 0x10000>
	//   33   71:iload_2         
	//   34   72:ldc1            #7   <Int 55296>
	//   35   74:isub            
	//   36   75:bipush          10
	//   37   77:ishl            
	//   38   78:iadd            
	//   39   79:iload_1         
	//   40   80:ldc1            #11  <Int 56320>
	//   41   82:isub            
	//   42   83:iadd            
	//   43   84:ireturn         
	}

	public void flush()
		throws IOException
	{
		if(_out != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field OutputStream _out>
	//*   2    4:ifnull          42
		{
			if(_outPtr > 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #43  <Field int _outPtr>
	//*   5   11:ifle            35
			{
				_out.write(_outBuffer, 0, _outPtr);
	//    6   14:aload_0         
	//    7   15:getfield        #31  <Field OutputStream _out>
	//    8   18:aload_0         
	//    9   19:getfield        #39  <Field byte[] _outBuffer>
	//   10   22:iconst_0        
	//   11   23:aload_0         
	//   12   24:getfield        #43  <Field int _outPtr>
	//   13   27:invokevirtual   #98  <Method void OutputStream.write(byte[], int, int)>
				_outPtr = 0;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #43  <Field int _outPtr>
			}
			_out.flush();
	//   17   35:aload_0         
	//   18   36:getfield        #31  <Field OutputStream _out>
	//   19   39:invokevirtual   #120 <Method void OutputStream.flush()>
		}
	//   20   42:return          
	}

	public void write(int i)
		throws IOException
	{
		int j;
		if(_surrogate > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field int _surrogate>
	//*   2    4:ifle            77
		{
			j = convertSurrogate(i);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokevirtual   #122 <Method int convertSurrogate(int)>
	//    6   12:istore_2        
		} else
	//*   7   13:aload_0         
	//*   8   14:getfield        #43  <Field int _outPtr>
	//*   9   17:aload_0         
	//*  10   18:getfield        #41  <Field int _outBufferEnd>
	//*  11   21:icmplt          45
	//*  12   24:aload_0         
	//*  13   25:getfield        #31  <Field OutputStream _out>
	//*  14   28:aload_0         
	//*  15   29:getfield        #39  <Field byte[] _outBuffer>
	//*  16   32:iconst_0        
	//*  17   33:aload_0         
	//*  18   34:getfield        #43  <Field int _outPtr>
	//*  19   37:invokevirtual   #98  <Method void OutputStream.write(byte[], int, int)>
	//*  20   40:aload_0         
	//*  21   41:iconst_0        
	//*  22   42:putfield        #43  <Field int _outPtr>
	//*  23   45:iload_2         
	//*  24   46:sipush          128
	//*  25   49:icmpge          109
	//*  26   52:aload_0         
	//*  27   53:getfield        #39  <Field byte[] _outBuffer>
	//*  28   56:astore          4
	//*  29   58:aload_0         
	//*  30   59:getfield        #43  <Field int _outPtr>
	//*  31   62:istore_1        
	//*  32   63:aload_0         
	//*  33   64:iload_1         
	//*  34   65:iconst_1        
	//*  35   66:iadd            
	//*  36   67:putfield        #43  <Field int _outPtr>
	//*  37   70:aload           4
	//*  38   72:iload_1         
	//*  39   73:iload_2         
	//*  40   74:int2byte        
	//*  41   75:bastore         
	//*  42   76:return          
		{
			j = i;
	//   43   77:iload_1         
	//   44   78:istore_2        
			if(i >= 55296)
	//*  45   79:iload_1         
	//*  46   80:ldc1            #7   <Int 55296>
	//*  47   82:icmplt          13
			{
				j = i;
	//   48   85:iload_1         
	//   49   86:istore_2        
				if(i <= 57343)
	//*  50   87:iload_1         
	//*  51   88:ldc1            #13  <Int 57343>
	//*  52   90:icmpgt          13
				{
					if(i > 56319)
	//*  53   93:iload_1         
	//*  54   94:ldc1            #9   <Int 56319>
	//*  55   96:icmple          103
						illegalSurrogate(i);
	//   56   99:iload_1         
	//   57  100:invokestatic    #108 <Method void illegalSurrogate(int)>
					_surrogate = i;
	//   58  103:aload_0         
	//   59  104:iload_1         
	//   60  105:putfield        #106 <Field int _surrogate>
					return;
	//   61  108:return          
				}
			}
		}
		if(_outPtr >= _outBufferEnd)
		{
			_out.write(_outBuffer, 0, _outPtr);
			_outPtr = 0;
		}
		if(j < 128)
		{
			byte abyte0[] = _outBuffer;
			i = _outPtr;
			_outPtr = i + 1;
			abyte0[i] = (byte)j;
			return;
		}
		i = _outPtr;
	//   62  109:aload_0         
	//   63  110:getfield        #43  <Field int _outPtr>
	//   64  113:istore_1        
		if(j < 2048)
	//*  65  114:iload_2         
	//*  66  115:sipush          2048
	//*  67  118:icmpge          173
		{
			byte abyte1[] = _outBuffer;
	//   68  121:aload_0         
	//   69  122:getfield        #39  <Field byte[] _outBuffer>
	//   70  125:astore          4
			int k = i + 1;
	//   71  127:iload_1         
	//   72  128:iconst_1        
	//   73  129:iadd            
	//   74  130:istore_3        
			abyte1[i] = (byte)(j >> 6 | 0xc0);
	//   75  131:aload           4
	//   76  133:iload_1         
	//   77  134:iload_2         
	//   78  135:bipush          6
	//   79  137:ishr            
	//   80  138:sipush          192
	//   81  141:ior             
	//   82  142:int2byte        
	//   83  143:bastore         
			abyte1 = _outBuffer;
	//   84  144:aload_0         
	//   85  145:getfield        #39  <Field byte[] _outBuffer>
	//   86  148:astore          4
			i = k + 1;
	//   87  150:iload_3         
	//   88  151:iconst_1        
	//   89  152:iadd            
	//   90  153:istore_1        
			abyte1[k] = (byte)(j & 0x3f | 0x80);
	//   91  154:aload           4
	//   92  156:iload_3         
	//   93  157:iload_2         
	//   94  158:bipush          63
	//   95  160:iand            
	//   96  161:sipush          128
	//   97  164:ior             
	//   98  165:int2byte        
	//   99  166:bastore         
		} else
	//* 100  167:aload_0         
	//* 101  168:iload_1         
	//* 102  169:putfield        #43  <Field int _outPtr>
	//* 103  172:return          
		if(j <= 65535)
	//* 104  173:iload_2         
	//* 105  174:ldc1            #123 <Int 65535>
	//* 106  176:icmpgt          250
		{
			byte abyte2[] = _outBuffer;
	//  107  179:aload_0         
	//  108  180:getfield        #39  <Field byte[] _outBuffer>
	//  109  183:astore          4
			int l = i + 1;
	//  110  185:iload_1         
	//  111  186:iconst_1        
	//  112  187:iadd            
	//  113  188:istore_3        
			abyte2[i] = (byte)(j >> 12 | 0xe0);
	//  114  189:aload           4
	//  115  191:iload_1         
	//  116  192:iload_2         
	//  117  193:bipush          12
	//  118  195:ishr            
	//  119  196:sipush          224
	//  120  199:ior             
	//  121  200:int2byte        
	//  122  201:bastore         
			abyte2 = _outBuffer;
	//  123  202:aload_0         
	//  124  203:getfield        #39  <Field byte[] _outBuffer>
	//  125  206:astore          4
			i = l + 1;
	//  126  208:iload_3         
	//  127  209:iconst_1        
	//  128  210:iadd            
	//  129  211:istore_1        
			abyte2[l] = (byte)(j >> 6 & 0x3f | 0x80);
	//  130  212:aload           4
	//  131  214:iload_3         
	//  132  215:iload_2         
	//  133  216:bipush          6
	//  134  218:ishr            
	//  135  219:bipush          63
	//  136  221:iand            
	//  137  222:sipush          128
	//  138  225:ior             
	//  139  226:int2byte        
	//  140  227:bastore         
			_outBuffer[i] = (byte)(j & 0x3f | 0x80);
	//  141  228:aload_0         
	//  142  229:getfield        #39  <Field byte[] _outBuffer>
	//  143  232:iload_1         
	//  144  233:iload_2         
	//  145  234:bipush          63
	//  146  236:iand            
	//  147  237:sipush          128
	//  148  240:ior             
	//  149  241:int2byte        
	//  150  242:bastore         
			i++;
	//  151  243:iload_1         
	//  152  244:iconst_1        
	//  153  245:iadd            
	//  154  246:istore_1        
		} else
	//* 155  247:goto            167
		{
			if(j > 0x10ffff)
	//* 156  250:iload_2         
	//* 157  251:ldc1            #57  <Int 0x10ffff>
	//* 158  253:icmple          260
				illegalSurrogate(j);
	//  159  256:iload_2         
	//  160  257:invokestatic    #108 <Method void illegalSurrogate(int)>
			byte abyte3[] = _outBuffer;
	//  161  260:aload_0         
	//  162  261:getfield        #39  <Field byte[] _outBuffer>
	//  163  264:astore          4
			int i1 = i + 1;
	//  164  266:iload_1         
	//  165  267:iconst_1        
	//  166  268:iadd            
	//  167  269:istore_3        
			abyte3[i] = (byte)(j >> 18 | 0xf0);
	//  168  270:aload           4
	//  169  272:iload_1         
	//  170  273:iload_2         
	//  171  274:bipush          18
	//  172  276:ishr            
	//  173  277:sipush          240
	//  174  280:ior             
	//  175  281:int2byte        
	//  176  282:bastore         
			abyte3 = _outBuffer;
	//  177  283:aload_0         
	//  178  284:getfield        #39  <Field byte[] _outBuffer>
	//  179  287:astore          4
			i = i1 + 1;
	//  180  289:iload_3         
	//  181  290:iconst_1        
	//  182  291:iadd            
	//  183  292:istore_1        
			abyte3[i1] = (byte)(j >> 12 & 0x3f | 0x80);
	//  184  293:aload           4
	//  185  295:iload_3         
	//  186  296:iload_2         
	//  187  297:bipush          12
	//  188  299:ishr            
	//  189  300:bipush          63
	//  190  302:iand            
	//  191  303:sipush          128
	//  192  306:ior             
	//  193  307:int2byte        
	//  194  308:bastore         
			abyte3 = _outBuffer;
	//  195  309:aload_0         
	//  196  310:getfield        #39  <Field byte[] _outBuffer>
	//  197  313:astore          4
			i1 = i + 1;
	//  198  315:iload_1         
	//  199  316:iconst_1        
	//  200  317:iadd            
	//  201  318:istore_3        
			abyte3[i] = (byte)(j >> 6 & 0x3f | 0x80);
	//  202  319:aload           4
	//  203  321:iload_1         
	//  204  322:iload_2         
	//  205  323:bipush          6
	//  206  325:ishr            
	//  207  326:bipush          63
	//  208  328:iand            
	//  209  329:sipush          128
	//  210  332:ior             
	//  211  333:int2byte        
	//  212  334:bastore         
			abyte3 = _outBuffer;
	//  213  335:aload_0         
	//  214  336:getfield        #39  <Field byte[] _outBuffer>
	//  215  339:astore          4
			i = i1 + 1;
	//  216  341:iload_3         
	//  217  342:iconst_1        
	//  218  343:iadd            
	//  219  344:istore_1        
			abyte3[i1] = (byte)(j & 0x3f | 0x80);
	//  220  345:aload           4
	//  221  347:iload_3         
	//  222  348:iload_2         
	//  223  349:bipush          63
	//  224  351:iand            
	//  225  352:sipush          128
	//  226  355:ior             
	//  227  356:int2byte        
	//  228  357:bastore         
		}
		_outPtr = i;
	//* 229  358:goto            167
	}

	public void write(String s)
		throws IOException
	{
		write(s, 0, s.length());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:invokevirtual   #129 <Method int String.length()>
	//    5    7:invokevirtual   #132 <Method void write(String, int, int)>
	//    6   10:return          
	}

	public void write(String s, int i, int j)
		throws IOException
	{
		int l1;
		int i2;
		byte abyte0[];
		if(j < 2)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:icmpge          20
		{
			if(j == 1)
	//*   3    5:iload_3         
	//*   4    6:iconst_1        
	//*   5    7:icmpne          19
				write(((int) (s.charAt(i))));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iload_2         
	//    9   13:invokevirtual   #136 <Method char String.charAt(int)>
	//   10   16:invokevirtual   #89  <Method void write(int)>
			return;
	//   11   19:return          
		}
		int k = i;
	//   12   20:iload_2         
	//   13   21:istore          4
		int i1 = j;
	//   14   23:iload_3         
	//   15   24:istore          5
		if(_surrogate > 0)
	//*  16   26:aload_0         
	//*  17   27:getfield        #106 <Field int _surrogate>
	//*  18   30:ifle            60
		{
			k = ((int) (s.charAt(i)));
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:invokevirtual   #136 <Method char String.charAt(int)>
	//   22   38:istore          4
			i1 = j - 1;
	//   23   40:iload_3         
	//   24   41:iconst_1        
	//   25   42:isub            
	//   26   43:istore          5
			write(convertSurrogate(k));
	//   27   45:aload_0         
	//   28   46:aload_0         
	//   29   47:iload           4
	//   30   49:invokevirtual   #122 <Method int convertSurrogate(int)>
	//   31   52:invokevirtual   #89  <Method void write(int)>
			k = i + 1;
	//   32   55:iload_2         
	//   33   56:iconst_1        
	//   34   57:iadd            
	//   35   58:istore          4
		}
		i = _outPtr;
	//   36   60:aload_0         
	//   37   61:getfield        #43  <Field int _outPtr>
	//   38   64:istore_2        
		abyte0 = _outBuffer;
	//   39   65:aload_0         
	//   40   66:getfield        #39  <Field byte[] _outBuffer>
	//   41   69:astore          10
		l1 = _outBufferEnd;
	//   42   71:aload_0         
	//   43   72:getfield        #41  <Field int _outBufferEnd>
	//   44   75:istore          8
		i2 = i1 + k;
	//   45   77:iload           5
	//   46   79:iload           4
	//   47   81:iadd            
	//   48   82:istore          9
		j = k;
	//   49   84:iload           4
	//   50   86:istore_3        
_L3:
		if(j >= i2) goto _L2; else goto _L1
	//   51   87:iload_3         
	//   52   88:iload           9
	//   53   90:icmpge          540
_L1:
		int l;
		int j1;
		int k1;
		l = i;
	//   54   93:iload_2         
	//   55   94:istore          4
		if(i >= l1)
	//*  56   96:iload_2         
	//*  57   97:iload           8
	//*  58   99:icmplt          116
		{
			_out.write(abyte0, 0, i);
	//   59  102:aload_0         
	//   60  103:getfield        #31  <Field OutputStream _out>
	//   61  106:aload           10
	//   62  108:iconst_0        
	//   63  109:iload_2         
	//   64  110:invokevirtual   #98  <Method void OutputStream.write(byte[], int, int)>
			l = 0;
	//   65  113:iconst_0        
	//   66  114:istore          4
		}
		j1 = j + 1;
	//   67  116:iload_3         
	//   68  117:iconst_1        
	//   69  118:iadd            
	//   70  119:istore          5
		k1 = ((int) (s.charAt(j)));
	//   71  121:aload_1         
	//   72  122:iload_3         
	//   73  123:invokevirtual   #136 <Method char String.charAt(int)>
	//   74  126:istore          6
		if(k1 >= 128)
			break MISSING_BLOCK_LABEL_527;
	//   75  128:iload           6
	//   76  130:sipush          128
	//   77  133:icmpge          527
		i = l + 1;
	//   78  136:iload           4
	//   79  138:iconst_1        
	//   80  139:iadd            
	//   81  140:istore_2        
		abyte0[l] = (byte)k1;
	//   82  141:aload           10
	//   83  143:iload           4
	//   84  145:iload           6
	//   85  147:int2byte        
	//   86  148:bastore         
		j = i2 - j1;
	//   87  149:iload           9
	//   88  151:iload           5
	//   89  153:isub            
	//   90  154:istore_3        
		k1 = l1 - i;
	//   91  155:iload           8
	//   92  157:iload_2         
	//   93  158:isub            
	//   94  159:istore          6
		l = j;
	//   95  161:iload_3         
	//   96  162:istore          4
		if(j > k1)
	//*  97  164:iload_3         
	//*  98  165:iload           6
	//*  99  167:icmple          174
			l = k1;
	//  100  170:iload           6
	//  101  172:istore          4
		j = j1;
	//  102  174:iload           5
	//  103  176:istore_3        
_L7:
		if(j < l + j1) goto _L4; else goto _L3
	//  104  177:iload_3         
	//  105  178:iload           4
	//  106  180:iload           5
	//  107  182:iadd            
	//  108  183:icmplt          189
	//* 109  186:goto            87
_L4:
		char c;
		k1 = j + 1;
	//  110  189:iload_3         
	//  111  190:iconst_1        
	//  112  191:iadd            
	//  113  192:istore          6
		c = s.charAt(j);
	//  114  194:aload_1         
	//  115  195:iload_3         
	//  116  196:invokevirtual   #136 <Method char String.charAt(int)>
	//  117  199:istore          7
		if(c < '\200') goto _L6; else goto _L5
	//  118  201:iload           7
	//  119  203:sipush          128
	//  120  206:icmplt          274
_L5:
		j = i;
	//  121  209:iload_2         
	//  122  210:istore_3        
		i = k1;
	//  123  211:iload           6
	//  124  213:istore_2        
		l = ((int) (c));
	//  125  214:iload           7
	//  126  216:istore          4
_L10:
		if(l < 2048)
	//* 127  218:iload           4
	//* 128  220:sipush          2048
	//* 129  223:icmpge          291
		{
			j1 = j + 1;
	//  130  226:iload_3         
	//  131  227:iconst_1        
	//  132  228:iadd            
	//  133  229:istore          5
			abyte0[j] = (byte)(l >> 6 | 0xc0);
	//  134  231:aload           10
	//  135  233:iload_3         
	//  136  234:iload           4
	//  137  236:bipush          6
	//  138  238:ishr            
	//  139  239:sipush          192
	//  140  242:ior             
	//  141  243:int2byte        
	//  142  244:bastore         
			abyte0[j1] = (byte)(l & 0x3f | 0x80);
	//  143  245:aload           10
	//  144  247:iload           5
	//  145  249:iload           4
	//  146  251:bipush          63
	//  147  253:iand            
	//  148  254:sipush          128
	//  149  257:ior             
	//  150  258:int2byte        
	//  151  259:bastore         
			l = j1 + 1;
	//  152  260:iload           5
	//  153  262:iconst_1        
	//  154  263:iadd            
	//  155  264:istore          4
			j = i;
	//  156  266:iload_2         
	//  157  267:istore_3        
			i = l;
	//  158  268:iload           4
	//  159  270:istore_2        
		} else
	//* 160  271:goto            87
	//* 161  274:aload           10
	//* 162  276:iload_2         
	//* 163  277:iload           7
	//* 164  279:int2byte        
	//* 165  280:bastore         
	//* 166  281:iload_2         
	//* 167  282:iconst_1        
	//* 168  283:iadd            
	//* 169  284:istore_2        
	//* 170  285:iload           6
	//* 171  287:istore_3        
	//* 172  288:goto            177
		{
label0:
			{
				if(l >= 55296 && l <= 57343)
					break label0;
	//  173  291:iload           4
	//  174  293:ldc1            #7   <Int 55296>
	//  175  295:icmplt          305
	//  176  298:iload           4
	//  177  300:ldc1            #13  <Int 57343>
	//  178  302:icmple          374
				j1 = j + 1;
	//  179  305:iload_3         
	//  180  306:iconst_1        
	//  181  307:iadd            
	//  182  308:istore          5
				abyte0[j] = (byte)(l >> 12 | 0xe0);
	//  183  310:aload           10
	//  184  312:iload_3         
	//  185  313:iload           4
	//  186  315:bipush          12
	//  187  317:ishr            
	//  188  318:sipush          224
	//  189  321:ior             
	//  190  322:int2byte        
	//  191  323:bastore         
				j = j1 + 1;
	//  192  324:iload           5
	//  193  326:iconst_1        
	//  194  327:iadd            
	//  195  328:istore_3        
				abyte0[j1] = (byte)(l >> 6 & 0x3f | 0x80);
	//  196  329:aload           10
	//  197  331:iload           5
	//  198  333:iload           4
	//  199  335:bipush          6
	//  200  337:ishr            
	//  201  338:bipush          63
	//  202  340:iand            
	//  203  341:sipush          128
	//  204  344:ior             
	//  205  345:int2byte        
	//  206  346:bastore         
				j1 = j + 1;
	//  207  347:iload_3         
	//  208  348:iconst_1        
	//  209  349:iadd            
	//  210  350:istore          5
				abyte0[j] = (byte)(l & 0x3f | 0x80);
	//  211  352:aload           10
	//  212  354:iload_3         
	//  213  355:iload           4
	//  214  357:bipush          63
	//  215  359:iand            
	//  216  360:sipush          128
	//  217  363:ior             
	//  218  364:int2byte        
	//  219  365:bastore         
				j = i;
	//  220  366:iload_2         
	//  221  367:istore_3        
				i = j1;
	//  222  368:iload           5
	//  223  370:istore_2        
			}
		}
		  goto _L3
_L6:
		abyte0[i] = (byte)c;
		i++;
		j = k1;
		  goto _L7
	//* 224  371:goto            87
		if(l > 56319)
	//* 225  374:iload           4
	//* 226  376:ldc1            #9   <Int 56319>
	//* 227  378:icmple          391
		{
			_outPtr = j;
	//  228  381:aload_0         
	//  229  382:iload_3         
	//  230  383:putfield        #43  <Field int _outPtr>
			illegalSurrogate(l);
	//  231  386:iload           4
	//  232  388:invokestatic    #108 <Method void illegalSurrogate(int)>
		}
		_surrogate = l;
	//  233  391:aload_0         
	//  234  392:iload           4
	//  235  394:putfield        #106 <Field int _surrogate>
		if(i < i2) goto _L9; else goto _L8
	//  236  397:iload_2         
	//  237  398:iload           9
	//  238  400:icmplt          411
_L8:
		i = j;
	//  239  403:iload_3         
	//  240  404:istore_2        
_L2:
		_outPtr = i;
	//  241  405:aload_0         
	//  242  406:iload_2         
	//  243  407:putfield        #43  <Field int _outPtr>
		return;
	//  244  410:return          
_L9:
		l = i + 1;
	//  245  411:iload_2         
	//  246  412:iconst_1        
	//  247  413:iadd            
	//  248  414:istore          4
		i = convertSurrogate(((int) (s.charAt(i))));
	//  249  416:aload_0         
	//  250  417:aload_1         
	//  251  418:iload_2         
	//  252  419:invokevirtual   #136 <Method char String.charAt(int)>
	//  253  422:invokevirtual   #122 <Method int convertSurrogate(int)>
	//  254  425:istore_2        
		if(i > 0x10ffff)
	//* 255  426:iload_2         
	//* 256  427:ldc1            #57  <Int 0x10ffff>
	//* 257  429:icmple          441
		{
			_outPtr = j;
	//  258  432:aload_0         
	//  259  433:iload_3         
	//  260  434:putfield        #43  <Field int _outPtr>
			illegalSurrogate(i);
	//  261  437:iload_2         
	//  262  438:invokestatic    #108 <Method void illegalSurrogate(int)>
		}
		j1 = j + 1;
	//  263  441:iload_3         
	//  264  442:iconst_1        
	//  265  443:iadd            
	//  266  444:istore          5
		abyte0[j] = (byte)(i >> 18 | 0xf0);
	//  267  446:aload           10
	//  268  448:iload_3         
	//  269  449:iload_2         
	//  270  450:bipush          18
	//  271  452:ishr            
	//  272  453:sipush          240
	//  273  456:ior             
	//  274  457:int2byte        
	//  275  458:bastore         
		j = j1 + 1;
	//  276  459:iload           5
	//  277  461:iconst_1        
	//  278  462:iadd            
	//  279  463:istore_3        
		abyte0[j1] = (byte)(i >> 12 & 0x3f | 0x80);
	//  280  464:aload           10
	//  281  466:iload           5
	//  282  468:iload_2         
	//  283  469:bipush          12
	//  284  471:ishr            
	//  285  472:bipush          63
	//  286  474:iand            
	//  287  475:sipush          128
	//  288  478:ior             
	//  289  479:int2byte        
	//  290  480:bastore         
		j1 = j + 1;
	//  291  481:iload_3         
	//  292  482:iconst_1        
	//  293  483:iadd            
	//  294  484:istore          5
		abyte0[j] = (byte)(i >> 6 & 0x3f | 0x80);
	//  295  486:aload           10
	//  296  488:iload_3         
	//  297  489:iload_2         
	//  298  490:bipush          6
	//  299  492:ishr            
	//  300  493:bipush          63
	//  301  495:iand            
	//  302  496:sipush          128
	//  303  499:ior             
	//  304  500:int2byte        
	//  305  501:bastore         
		abyte0[j1] = (byte)(i & 0x3f | 0x80);
	//  306  502:aload           10
	//  307  504:iload           5
	//  308  506:iload_2         
	//  309  507:bipush          63
	//  310  509:iand            
	//  311  510:sipush          128
	//  312  513:ior             
	//  313  514:int2byte        
	//  314  515:bastore         
		i = j1 + 1;
	//  315  516:iload           5
	//  316  518:iconst_1        
	//  317  519:iadd            
	//  318  520:istore_2        
		j = l;
	//  319  521:iload           4
	//  320  523:istore_3        
		  goto _L3
	//* 321  524:goto            271
		j = l;
	//  322  527:iload           4
	//  323  529:istore_3        
		i = j1;
	//  324  530:iload           5
	//  325  532:istore_2        
		l = k1;
	//  326  533:iload           6
	//  327  535:istore          4
		  goto _L10
	//* 328  537:goto            218
	//* 329  540:goto            405
	}

	public void write(char ac[])
		throws IOException
	{
		write(ac, 0, ac.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #140 <Method void write(char[], int, int)>
	//    6    8:return          
	}

	public void write(char ac[], int i, int j)
		throws IOException
	{
		int l1;
		int i2;
		byte abyte0[];
		if(j < 2)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:icmpge          18
		{
			if(j == 1)
	//*   3    5:iload_3         
	//*   4    6:iconst_1        
	//*   5    7:icmpne          17
				write(((int) (ac[i])));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iload_2         
	//    9   13:caload          
	//   10   14:invokevirtual   #89  <Method void write(int)>
			return;
	//   11   17:return          
		}
		int k = i;
	//   12   18:iload_2         
	//   13   19:istore          4
		int i1 = j;
	//   14   21:iload_3         
	//   15   22:istore          5
		if(_surrogate > 0)
	//*  16   24:aload_0         
	//*  17   25:getfield        #106 <Field int _surrogate>
	//*  18   28:ifle            56
		{
			k = ((int) (ac[i]));
	//   19   31:aload_1         
	//   20   32:iload_2         
	//   21   33:caload          
	//   22   34:istore          4
			i1 = j - 1;
	//   23   36:iload_3         
	//   24   37:iconst_1        
	//   25   38:isub            
	//   26   39:istore          5
			write(convertSurrogate(k));
	//   27   41:aload_0         
	//   28   42:aload_0         
	//   29   43:iload           4
	//   30   45:invokevirtual   #122 <Method int convertSurrogate(int)>
	//   31   48:invokevirtual   #89  <Method void write(int)>
			k = i + 1;
	//   32   51:iload_2         
	//   33   52:iconst_1        
	//   34   53:iadd            
	//   35   54:istore          4
		}
		i = _outPtr;
	//   36   56:aload_0         
	//   37   57:getfield        #43  <Field int _outPtr>
	//   38   60:istore_2        
		abyte0 = _outBuffer;
	//   39   61:aload_0         
	//   40   62:getfield        #39  <Field byte[] _outBuffer>
	//   41   65:astore          10
		l1 = _outBufferEnd;
	//   42   67:aload_0         
	//   43   68:getfield        #41  <Field int _outBufferEnd>
	//   44   71:istore          8
		i2 = i1 + k;
	//   45   73:iload           5
	//   46   75:iload           4
	//   47   77:iadd            
	//   48   78:istore          9
		j = k;
	//   49   80:iload           4
	//   50   82:istore_3        
_L3:
		if(j >= i2) goto _L2; else goto _L1
	//   51   83:iload_3         
	//   52   84:iload           9
	//   53   86:icmpge          530
_L1:
		int l;
		int j1;
		int k1;
		l = i;
	//   54   89:iload_2         
	//   55   90:istore          4
		if(i >= l1)
	//*  56   92:iload_2         
	//*  57   93:iload           8
	//*  58   95:icmplt          112
		{
			_out.write(abyte0, 0, i);
	//   59   98:aload_0         
	//   60   99:getfield        #31  <Field OutputStream _out>
	//   61  102:aload           10
	//   62  104:iconst_0        
	//   63  105:iload_2         
	//   64  106:invokevirtual   #98  <Method void OutputStream.write(byte[], int, int)>
			l = 0;
	//   65  109:iconst_0        
	//   66  110:istore          4
		}
		j1 = j + 1;
	//   67  112:iload_3         
	//   68  113:iconst_1        
	//   69  114:iadd            
	//   70  115:istore          5
		k1 = ((int) (ac[j]));
	//   71  117:aload_1         
	//   72  118:iload_3         
	//   73  119:caload          
	//   74  120:istore          6
		if(k1 >= 128)
			break MISSING_BLOCK_LABEL_517;
	//   75  122:iload           6
	//   76  124:sipush          128
	//   77  127:icmpge          517
		i = l + 1;
	//   78  130:iload           4
	//   79  132:iconst_1        
	//   80  133:iadd            
	//   81  134:istore_2        
		abyte0[l] = (byte)k1;
	//   82  135:aload           10
	//   83  137:iload           4
	//   84  139:iload           6
	//   85  141:int2byte        
	//   86  142:bastore         
		j = i2 - j1;
	//   87  143:iload           9
	//   88  145:iload           5
	//   89  147:isub            
	//   90  148:istore_3        
		k1 = l1 - i;
	//   91  149:iload           8
	//   92  151:iload_2         
	//   93  152:isub            
	//   94  153:istore          6
		l = j;
	//   95  155:iload_3         
	//   96  156:istore          4
		if(j > k1)
	//*  97  158:iload_3         
	//*  98  159:iload           6
	//*  99  161:icmple          168
			l = k1;
	//  100  164:iload           6
	//  101  166:istore          4
		j = j1;
	//  102  168:iload           5
	//  103  170:istore_3        
_L7:
		if(j < l + j1) goto _L4; else goto _L3
	//  104  171:iload_3         
	//  105  172:iload           4
	//  106  174:iload           5
	//  107  176:iadd            
	//  108  177:icmplt          183
	//* 109  180:goto            83
_L4:
		char c;
		k1 = j + 1;
	//  110  183:iload_3         
	//  111  184:iconst_1        
	//  112  185:iadd            
	//  113  186:istore          6
		c = ac[j];
	//  114  188:aload_1         
	//  115  189:iload_3         
	//  116  190:caload          
	//  117  191:istore          7
		if(c < '\200') goto _L6; else goto _L5
	//  118  193:iload           7
	//  119  195:sipush          128
	//  120  198:icmplt          266
_L5:
		j = i;
	//  121  201:iload_2         
	//  122  202:istore_3        
		i = k1;
	//  123  203:iload           6
	//  124  205:istore_2        
		l = ((int) (c));
	//  125  206:iload           7
	//  126  208:istore          4
_L10:
		if(l < 2048)
	//* 127  210:iload           4
	//* 128  212:sipush          2048
	//* 129  215:icmpge          283
		{
			j1 = j + 1;
	//  130  218:iload_3         
	//  131  219:iconst_1        
	//  132  220:iadd            
	//  133  221:istore          5
			abyte0[j] = (byte)(l >> 6 | 0xc0);
	//  134  223:aload           10
	//  135  225:iload_3         
	//  136  226:iload           4
	//  137  228:bipush          6
	//  138  230:ishr            
	//  139  231:sipush          192
	//  140  234:ior             
	//  141  235:int2byte        
	//  142  236:bastore         
			abyte0[j1] = (byte)(l & 0x3f | 0x80);
	//  143  237:aload           10
	//  144  239:iload           5
	//  145  241:iload           4
	//  146  243:bipush          63
	//  147  245:iand            
	//  148  246:sipush          128
	//  149  249:ior             
	//  150  250:int2byte        
	//  151  251:bastore         
			l = j1 + 1;
	//  152  252:iload           5
	//  153  254:iconst_1        
	//  154  255:iadd            
	//  155  256:istore          4
			j = i;
	//  156  258:iload_2         
	//  157  259:istore_3        
			i = l;
	//  158  260:iload           4
	//  159  262:istore_2        
		} else
	//* 160  263:goto            83
	//* 161  266:aload           10
	//* 162  268:iload_2         
	//* 163  269:iload           7
	//* 164  271:int2byte        
	//* 165  272:bastore         
	//* 166  273:iload_2         
	//* 167  274:iconst_1        
	//* 168  275:iadd            
	//* 169  276:istore_2        
	//* 170  277:iload           6
	//* 171  279:istore_3        
	//* 172  280:goto            171
		{
label0:
			{
				if(l >= 55296 && l <= 57343)
					break label0;
	//  173  283:iload           4
	//  174  285:ldc1            #7   <Int 55296>
	//  175  287:icmplt          297
	//  176  290:iload           4
	//  177  292:ldc1            #13  <Int 57343>
	//  178  294:icmple          366
				j1 = j + 1;
	//  179  297:iload_3         
	//  180  298:iconst_1        
	//  181  299:iadd            
	//  182  300:istore          5
				abyte0[j] = (byte)(l >> 12 | 0xe0);
	//  183  302:aload           10
	//  184  304:iload_3         
	//  185  305:iload           4
	//  186  307:bipush          12
	//  187  309:ishr            
	//  188  310:sipush          224
	//  189  313:ior             
	//  190  314:int2byte        
	//  191  315:bastore         
				j = j1 + 1;
	//  192  316:iload           5
	//  193  318:iconst_1        
	//  194  319:iadd            
	//  195  320:istore_3        
				abyte0[j1] = (byte)(l >> 6 & 0x3f | 0x80);
	//  196  321:aload           10
	//  197  323:iload           5
	//  198  325:iload           4
	//  199  327:bipush          6
	//  200  329:ishr            
	//  201  330:bipush          63
	//  202  332:iand            
	//  203  333:sipush          128
	//  204  336:ior             
	//  205  337:int2byte        
	//  206  338:bastore         
				j1 = j + 1;
	//  207  339:iload_3         
	//  208  340:iconst_1        
	//  209  341:iadd            
	//  210  342:istore          5
				abyte0[j] = (byte)(l & 0x3f | 0x80);
	//  211  344:aload           10
	//  212  346:iload_3         
	//  213  347:iload           4
	//  214  349:bipush          63
	//  215  351:iand            
	//  216  352:sipush          128
	//  217  355:ior             
	//  218  356:int2byte        
	//  219  357:bastore         
				j = i;
	//  220  358:iload_2         
	//  221  359:istore_3        
				i = j1;
	//  222  360:iload           5
	//  223  362:istore_2        
			}
		}
		  goto _L3
_L6:
		abyte0[i] = (byte)c;
		i++;
		j = k1;
		  goto _L7
	//* 224  363:goto            83
		if(l > 56319)
	//* 225  366:iload           4
	//* 226  368:ldc1            #9   <Int 56319>
	//* 227  370:icmple          383
		{
			_outPtr = j;
	//  228  373:aload_0         
	//  229  374:iload_3         
	//  230  375:putfield        #43  <Field int _outPtr>
			illegalSurrogate(l);
	//  231  378:iload           4
	//  232  380:invokestatic    #108 <Method void illegalSurrogate(int)>
		}
		_surrogate = l;
	//  233  383:aload_0         
	//  234  384:iload           4
	//  235  386:putfield        #106 <Field int _surrogate>
		if(i < i2) goto _L9; else goto _L8
	//  236  389:iload_2         
	//  237  390:iload           9
	//  238  392:icmplt          403
_L8:
		i = j;
	//  239  395:iload_3         
	//  240  396:istore_2        
_L2:
		_outPtr = i;
	//  241  397:aload_0         
	//  242  398:iload_2         
	//  243  399:putfield        #43  <Field int _outPtr>
		return;
	//  244  402:return          
_L9:
		l = i + 1;
	//  245  403:iload_2         
	//  246  404:iconst_1        
	//  247  405:iadd            
	//  248  406:istore          4
		i = convertSurrogate(((int) (ac[i])));
	//  249  408:aload_0         
	//  250  409:aload_1         
	//  251  410:iload_2         
	//  252  411:caload          
	//  253  412:invokevirtual   #122 <Method int convertSurrogate(int)>
	//  254  415:istore_2        
		if(i > 0x10ffff)
	//* 255  416:iload_2         
	//* 256  417:ldc1            #57  <Int 0x10ffff>
	//* 257  419:icmple          431
		{
			_outPtr = j;
	//  258  422:aload_0         
	//  259  423:iload_3         
	//  260  424:putfield        #43  <Field int _outPtr>
			illegalSurrogate(i);
	//  261  427:iload_2         
	//  262  428:invokestatic    #108 <Method void illegalSurrogate(int)>
		}
		j1 = j + 1;
	//  263  431:iload_3         
	//  264  432:iconst_1        
	//  265  433:iadd            
	//  266  434:istore          5
		abyte0[j] = (byte)(i >> 18 | 0xf0);
	//  267  436:aload           10
	//  268  438:iload_3         
	//  269  439:iload_2         
	//  270  440:bipush          18
	//  271  442:ishr            
	//  272  443:sipush          240
	//  273  446:ior             
	//  274  447:int2byte        
	//  275  448:bastore         
		j = j1 + 1;
	//  276  449:iload           5
	//  277  451:iconst_1        
	//  278  452:iadd            
	//  279  453:istore_3        
		abyte0[j1] = (byte)(i >> 12 & 0x3f | 0x80);
	//  280  454:aload           10
	//  281  456:iload           5
	//  282  458:iload_2         
	//  283  459:bipush          12
	//  284  461:ishr            
	//  285  462:bipush          63
	//  286  464:iand            
	//  287  465:sipush          128
	//  288  468:ior             
	//  289  469:int2byte        
	//  290  470:bastore         
		j1 = j + 1;
	//  291  471:iload_3         
	//  292  472:iconst_1        
	//  293  473:iadd            
	//  294  474:istore          5
		abyte0[j] = (byte)(i >> 6 & 0x3f | 0x80);
	//  295  476:aload           10
	//  296  478:iload_3         
	//  297  479:iload_2         
	//  298  480:bipush          6
	//  299  482:ishr            
	//  300  483:bipush          63
	//  301  485:iand            
	//  302  486:sipush          128
	//  303  489:ior             
	//  304  490:int2byte        
	//  305  491:bastore         
		abyte0[j1] = (byte)(i & 0x3f | 0x80);
	//  306  492:aload           10
	//  307  494:iload           5
	//  308  496:iload_2         
	//  309  497:bipush          63
	//  310  499:iand            
	//  311  500:sipush          128
	//  312  503:ior             
	//  313  504:int2byte        
	//  314  505:bastore         
		i = j1 + 1;
	//  315  506:iload           5
	//  316  508:iconst_1        
	//  317  509:iadd            
	//  318  510:istore_2        
		j = l;
	//  319  511:iload           4
	//  320  513:istore_3        
		  goto _L3
	//* 321  514:goto            263
		j = l;
	//  322  517:iload           4
	//  323  519:istore_3        
		i = j1;
	//  324  520:iload           5
	//  325  522:istore_2        
		l = k1;
	//  326  523:iload           6
	//  327  525:istore          4
		  goto _L10
	//* 328  527:goto            210
	//* 329  530:goto            397
	}

	static final int SURR1_FIRST = 55296;
	static final int SURR1_LAST = 56319;
	static final int SURR2_FIRST = 56320;
	static final int SURR2_LAST = 57343;
	private final IOContext _context;
	private OutputStream _out;
	private byte _outBuffer[];
	private final int _outBufferEnd;
	private int _outPtr;
	private int _surrogate;
}
