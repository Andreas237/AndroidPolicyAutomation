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
	//*   2    3:icmple          42
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    6:new             #59  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #60  <Method void StringBuilder()>
	//    6   13:astore_1        
			stringbuilder.append("Illegal character point (0x");
	//    7   14:aload_1         
	//    8   15:ldc1            #62  <String "Illegal character point (0x">
	//    9   17:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
			stringbuilder.append(Integer.toHexString(i));
	//   11   21:aload_1         
	//   12   22:iload_0         
	//   13   23:invokestatic    #71  <Method String Integer.toHexString(int)>
	//   14   26:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			stringbuilder.append(") to output; max is 0x10FFFF as per RFC 4627");
	//   16   30:aload_1         
	//   17   31:ldc1            #73  <String ") to output; max is 0x10FFFF as per RFC 4627">
	//   18   33:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
			return stringbuilder.toString();
	//   20   37:aload_1         
	//   21   38:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   22   41:areturn         
		}
		if(i >= 55296)
	//*  23   42:iload_0         
	//*  24   43:ldc1            #7   <Int 55296>
	//*  25   45:icmplt          126
		{
			if(i <= 56319)
	//*  26   48:iload_0         
	//*  27   49:ldc1            #9   <Int 56319>
	//*  28   51:icmpgt          90
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   29   54:new             #59  <Class StringBuilder>
	//   30   57:dup             
	//   31   58:invokespecial   #60  <Method void StringBuilder()>
	//   32   61:astore_1        
				stringbuilder1.append("Unmatched first part of surrogate pair (0x");
	//   33   62:aload_1         
	//   34   63:ldc1            #79  <String "Unmatched first part of surrogate pair (0x">
	//   35   65:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
				stringbuilder1.append(Integer.toHexString(i));
	//   37   69:aload_1         
	//   38   70:iload_0         
	//   39   71:invokestatic    #71  <Method String Integer.toHexString(int)>
	//   40   74:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   41   77:pop             
				stringbuilder1.append(")");
	//   42   78:aload_1         
	//   43   79:ldc1            #81  <String ")">
	//   44   81:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   45   84:pop             
				return stringbuilder1.toString();
	//   46   85:aload_1         
	//   47   86:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   48   89:areturn         
			} else
			{
				StringBuilder stringbuilder2 = new StringBuilder();
	//   49   90:new             #59  <Class StringBuilder>
	//   50   93:dup             
	//   51   94:invokespecial   #60  <Method void StringBuilder()>
	//   52   97:astore_1        
				stringbuilder2.append("Unmatched second part of surrogate pair (0x");
	//   53   98:aload_1         
	//   54   99:ldc1            #83  <String "Unmatched second part of surrogate pair (0x">
	//   55  101:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   56  104:pop             
				stringbuilder2.append(Integer.toHexString(i));
	//   57  105:aload_1         
	//   58  106:iload_0         
	//   59  107:invokestatic    #71  <Method String Integer.toHexString(int)>
	//   60  110:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   61  113:pop             
				stringbuilder2.append(")");
	//   62  114:aload_1         
	//   63  115:ldc1            #81  <String ")">
	//   64  117:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   65  120:pop             
				return stringbuilder2.toString();
	//   66  121:aload_1         
	//   67  122:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   68  125:areturn         
			}
		} else
		{
			StringBuilder stringbuilder3 = new StringBuilder();
	//   69  126:new             #59  <Class StringBuilder>
	//   70  129:dup             
	//   71  130:invokespecial   #60  <Method void StringBuilder()>
	//   72  133:astore_1        
			stringbuilder3.append("Illegal character point (0x");
	//   73  134:aload_1         
	//   74  135:ldc1            #62  <String "Illegal character point (0x">
	//   75  137:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   76  140:pop             
			stringbuilder3.append(Integer.toHexString(i));
	//   77  141:aload_1         
	//   78  142:iload_0         
	//   79  143:invokestatic    #71  <Method String Integer.toHexString(int)>
	//   80  146:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   81  149:pop             
			stringbuilder3.append(") to output");
	//   82  150:aload_1         
	//   83  151:ldc1            #85  <String ") to output">
	//   84  153:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   85  156:pop             
			return stringbuilder3.toString();
	//   86  157:aload_1         
	//   87  158:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   88  161:areturn         
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
		if(i >= 56320 && i <= 57343)
	//*   6   10:iload_1         
	//*   7   11:ldc1            #11  <Int 56320>
	//*   8   13:icmplt          41
	//*   9   16:iload_1         
	//*  10   17:ldc1            #13  <Int 57343>
	//*  11   19:icmple          25
	//*  12   22:goto            41
		{
			return 0x10000 + (j - 55296 << 10) + (i - 56320);
	//   13   25:ldc1            #111 <Int 0x10000>
	//   14   27:iload_2         
	//   15   28:ldc1            #7   <Int 55296>
	//   16   30:isub            
	//   17   31:bipush          10
	//   18   33:ishl            
	//   19   34:iadd            
	//   20   35:iload_1         
	//   21   36:ldc1            #11  <Int 56320>
	//   22   38:isub            
	//   23   39:iadd            
	//   24   40:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   25   41:new             #59  <Class StringBuilder>
	//   26   44:dup             
	//   27   45:invokespecial   #60  <Method void StringBuilder()>
	//   28   48:astore_3        
			stringbuilder.append("Broken surrogate pair: first char 0x");
	//   29   49:aload_3         
	//   30   50:ldc1            #113 <String "Broken surrogate pair: first char 0x">
	//   31   52:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   32   55:pop             
			stringbuilder.append(Integer.toHexString(j));
	//   33   56:aload_3         
	//   34   57:iload_2         
	//   35   58:invokestatic    #71  <Method String Integer.toHexString(int)>
	//   36   61:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   37   64:pop             
			stringbuilder.append(", second 0x");
	//   38   65:aload_3         
	//   39   66:ldc1            #115 <String ", second 0x">
	//   40   68:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   41   71:pop             
			stringbuilder.append(Integer.toHexString(i));
	//   42   72:aload_3         
	//   43   73:iload_1         
	//   44   74:invokestatic    #71  <Method String Integer.toHexString(int)>
	//   45   77:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   46   80:pop             
			stringbuilder.append("; illegal combination");
	//   47   81:aload_3         
	//   48   82:ldc1            #117 <String "; illegal combination">
	//   49   84:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   50   87:pop             
			throw new IOException(stringbuilder.toString());
	//   51   88:new             #48  <Class IOException>
	//   52   91:dup             
	//   53   92:aload_3         
	//   54   93:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   55   96:invokespecial   #55  <Method void IOException(String)>
	//   56   99:athrow          
		}
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
	//*   2    4:ifle            16
		{
			j = convertSurrogate(i);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokevirtual   #122 <Method int convertSurrogate(int)>
	//    6   12:istore_2        
		} else
	//*   7   13:goto            48
		{
			j = i;
	//    8   16:iload_1         
	//    9   17:istore_2        
			if(i >= 55296)
	//*  10   18:iload_1         
	//*  11   19:ldc1            #7   <Int 55296>
	//*  12   21:icmplt          48
			{
				j = i;
	//   13   24:iload_1         
	//   14   25:istore_2        
				if(i <= 57343)
	//*  15   26:iload_1         
	//*  16   27:ldc1            #13  <Int 57343>
	//*  17   29:icmpgt          48
				{
					if(i > 56319)
	//*  18   32:iload_1         
	//*  19   33:ldc1            #9   <Int 56319>
	//*  20   35:icmple          42
						illegalSurrogate(i);
	//   21   38:iload_1         
	//   22   39:invokestatic    #108 <Method void illegalSurrogate(int)>
					_surrogate = i;
	//   23   42:aload_0         
	//   24   43:iload_1         
	//   25   44:putfield        #106 <Field int _surrogate>
					return;
	//   26   47:return          
				}
			}
		}
		if(_outPtr >= _outBufferEnd)
	//*  27   48:aload_0         
	//*  28   49:getfield        #43  <Field int _outPtr>
	//*  29   52:aload_0         
	//*  30   53:getfield        #41  <Field int _outBufferEnd>
	//*  31   56:icmplt          80
		{
			_out.write(_outBuffer, 0, _outPtr);
	//   32   59:aload_0         
	//   33   60:getfield        #31  <Field OutputStream _out>
	//   34   63:aload_0         
	//   35   64:getfield        #39  <Field byte[] _outBuffer>
	//   36   67:iconst_0        
	//   37   68:aload_0         
	//   38   69:getfield        #43  <Field int _outPtr>
	//   39   72:invokevirtual   #98  <Method void OutputStream.write(byte[], int, int)>
			_outPtr = 0;
	//   40   75:aload_0         
	//   41   76:iconst_0        
	//   42   77:putfield        #43  <Field int _outPtr>
		}
		if(j < 128)
	//*  43   80:iload_2         
	//*  44   81:sipush          128
	//*  45   84:icmpge          112
		{
			byte abyte0[] = _outBuffer;
	//   46   87:aload_0         
	//   47   88:getfield        #39  <Field byte[] _outBuffer>
	//   48   91:astore          4
			i = _outPtr;
	//   49   93:aload_0         
	//   50   94:getfield        #43  <Field int _outPtr>
	//   51   97:istore_1        
			_outPtr = i + 1;
	//   52   98:aload_0         
	//   53   99:iload_1         
	//   54  100:iconst_1        
	//   55  101:iadd            
	//   56  102:putfield        #43  <Field int _outPtr>
			abyte0[i] = (byte)j;
	//   57  105:aload           4
	//   58  107:iload_1         
	//   59  108:iload_2         
	//   60  109:int2byte        
	//   61  110:bastore         
			return;
	//   62  111:return          
		}
		i = _outPtr;
	//   63  112:aload_0         
	//   64  113:getfield        #43  <Field int _outPtr>
	//   65  116:istore_1        
		if(j < 2048)
	//*  66  117:iload_2         
	//*  67  118:sipush          2048
	//*  68  121:icmpge          173
		{
			byte abyte1[] = _outBuffer;
	//   69  124:aload_0         
	//   70  125:getfield        #39  <Field byte[] _outBuffer>
	//   71  128:astore          4
			int k = i + 1;
	//   72  130:iload_1         
	//   73  131:iconst_1        
	//   74  132:iadd            
	//   75  133:istore_3        
			abyte1[i] = (byte)(0xc0 | j >> 6);
	//   76  134:aload           4
	//   77  136:iload_1         
	//   78  137:sipush          192
	//   79  140:iload_2         
	//   80  141:bipush          6
	//   81  143:ishr            
	//   82  144:ior             
	//   83  145:int2byte        
	//   84  146:bastore         
			abyte1 = _outBuffer;
	//   85  147:aload_0         
	//   86  148:getfield        #39  <Field byte[] _outBuffer>
	//   87  151:astore          4
			i = k + 1;
	//   88  153:iload_3         
	//   89  154:iconst_1        
	//   90  155:iadd            
	//   91  156:istore_1        
			abyte1[k] = (byte)(j & 0x3f | 0x80);
	//   92  157:aload           4
	//   93  159:iload_3         
	//   94  160:iload_2         
	//   95  161:bipush          63
	//   96  163:iand            
	//   97  164:sipush          128
	//   98  167:ior             
	//   99  168:int2byte        
	//  100  169:bastore         
		} else
	//* 101  170:goto            358
		if(j <= 65535)
	//* 102  173:iload_2         
	//* 103  174:ldc1            #123 <Int 65535>
	//* 104  176:icmpgt          250
		{
			byte abyte2[] = _outBuffer;
	//  105  179:aload_0         
	//  106  180:getfield        #39  <Field byte[] _outBuffer>
	//  107  183:astore          4
			int l = i + 1;
	//  108  185:iload_1         
	//  109  186:iconst_1        
	//  110  187:iadd            
	//  111  188:istore_3        
			abyte2[i] = (byte)(0xe0 | j >> 12);
	//  112  189:aload           4
	//  113  191:iload_1         
	//  114  192:sipush          224
	//  115  195:iload_2         
	//  116  196:bipush          12
	//  117  198:ishr            
	//  118  199:ior             
	//  119  200:int2byte        
	//  120  201:bastore         
			abyte2 = _outBuffer;
	//  121  202:aload_0         
	//  122  203:getfield        #39  <Field byte[] _outBuffer>
	//  123  206:astore          4
			i = l + 1;
	//  124  208:iload_3         
	//  125  209:iconst_1        
	//  126  210:iadd            
	//  127  211:istore_1        
			abyte2[l] = (byte)(j >> 6 & 0x3f | 0x80);
	//  128  212:aload           4
	//  129  214:iload_3         
	//  130  215:iload_2         
	//  131  216:bipush          6
	//  132  218:ishr            
	//  133  219:bipush          63
	//  134  221:iand            
	//  135  222:sipush          128
	//  136  225:ior             
	//  137  226:int2byte        
	//  138  227:bastore         
			_outBuffer[i] = (byte)(j & 0x3f | 0x80);
	//  139  228:aload_0         
	//  140  229:getfield        #39  <Field byte[] _outBuffer>
	//  141  232:iload_1         
	//  142  233:iload_2         
	//  143  234:bipush          63
	//  144  236:iand            
	//  145  237:sipush          128
	//  146  240:ior             
	//  147  241:int2byte        
	//  148  242:bastore         
			i++;
	//  149  243:iload_1         
	//  150  244:iconst_1        
	//  151  245:iadd            
	//  152  246:istore_1        
		} else
	//* 153  247:goto            358
		{
			if(j > 0x10ffff)
	//* 154  250:iload_2         
	//* 155  251:ldc1            #57  <Int 0x10ffff>
	//* 156  253:icmple          260
				illegalSurrogate(j);
	//  157  256:iload_2         
	//  158  257:invokestatic    #108 <Method void illegalSurrogate(int)>
			byte abyte3[] = _outBuffer;
	//  159  260:aload_0         
	//  160  261:getfield        #39  <Field byte[] _outBuffer>
	//  161  264:astore          4
			int i1 = i + 1;
	//  162  266:iload_1         
	//  163  267:iconst_1        
	//  164  268:iadd            
	//  165  269:istore_3        
			abyte3[i] = (byte)(0xf0 | j >> 18);
	//  166  270:aload           4
	//  167  272:iload_1         
	//  168  273:sipush          240
	//  169  276:iload_2         
	//  170  277:bipush          18
	//  171  279:ishr            
	//  172  280:ior             
	//  173  281:int2byte        
	//  174  282:bastore         
			abyte3 = _outBuffer;
	//  175  283:aload_0         
	//  176  284:getfield        #39  <Field byte[] _outBuffer>
	//  177  287:astore          4
			i = i1 + 1;
	//  178  289:iload_3         
	//  179  290:iconst_1        
	//  180  291:iadd            
	//  181  292:istore_1        
			abyte3[i1] = (byte)(j >> 12 & 0x3f | 0x80);
	//  182  293:aload           4
	//  183  295:iload_3         
	//  184  296:iload_2         
	//  185  297:bipush          12
	//  186  299:ishr            
	//  187  300:bipush          63
	//  188  302:iand            
	//  189  303:sipush          128
	//  190  306:ior             
	//  191  307:int2byte        
	//  192  308:bastore         
			abyte3 = _outBuffer;
	//  193  309:aload_0         
	//  194  310:getfield        #39  <Field byte[] _outBuffer>
	//  195  313:astore          4
			i1 = i + 1;
	//  196  315:iload_1         
	//  197  316:iconst_1        
	//  198  317:iadd            
	//  199  318:istore_3        
			abyte3[i] = (byte)(j >> 6 & 0x3f | 0x80);
	//  200  319:aload           4
	//  201  321:iload_1         
	//  202  322:iload_2         
	//  203  323:bipush          6
	//  204  325:ishr            
	//  205  326:bipush          63
	//  206  328:iand            
	//  207  329:sipush          128
	//  208  332:ior             
	//  209  333:int2byte        
	//  210  334:bastore         
			abyte3 = _outBuffer;
	//  211  335:aload_0         
	//  212  336:getfield        #39  <Field byte[] _outBuffer>
	//  213  339:astore          4
			i = i1 + 1;
	//  214  341:iload_3         
	//  215  342:iconst_1        
	//  216  343:iadd            
	//  217  344:istore_1        
			abyte3[i1] = (byte)(j & 0x3f | 0x80);
	//  218  345:aload           4
	//  219  347:iload_3         
	//  220  348:iload_2         
	//  221  349:bipush          63
	//  222  351:iand            
	//  223  352:sipush          128
	//  224  355:ior             
	//  225  356:int2byte        
	//  226  357:bastore         
		}
		_outPtr = i;
	//  227  358:aload_0         
	//  228  359:iload_1         
	//  229  360:putfield        #43  <Field int _outPtr>
	//  230  363:return          
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
		int l = j;
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
			l = j - 1;
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
		byte abyte0[] = _outBuffer;
	//   39   65:aload_0         
	//   40   66:getfield        #39  <Field byte[] _outBuffer>
	//   41   69:astore          11
		int k2 = _outBufferEnd;
	//   42   71:aload_0         
	//   43   72:getfield        #41  <Field int _outBufferEnd>
	//   44   75:istore          9
		int l2 = l + k;
	//   45   77:iload           5
	//   46   79:iload           4
	//   47   81:iadd            
	//   48   82:istore          10
		j = k;
	//   49   84:iload           4
	//   50   86:istore_3        
label0:
		do
		{
			k = i;
	//   51   87:iload_2         
	//   52   88:istore          4
			if(j >= l2)
				break;
	//   53   90:iload_3         
	//   54   91:iload           10
	//   55   93:icmpge          551
			k = i;
	//   56   96:iload_2         
	//   57   97:istore          4
			if(i >= k2)
	//*  58   99:iload_2         
	//*  59  100:iload           9
	//*  60  102:icmplt          119
			{
				_out.write(abyte0, 0, i);
	//   61  105:aload_0         
	//   62  106:getfield        #31  <Field OutputStream _out>
	//   63  109:aload           11
	//   64  111:iconst_0        
	//   65  112:iload_2         
	//   66  113:invokevirtual   #98  <Method void OutputStream.write(byte[], int, int)>
				k = 0;
	//   67  116:iconst_0        
	//   68  117:istore          4
			}
			int i1 = j + 1;
	//   69  119:iload_3         
	//   70  120:iconst_1        
	//   71  121:iadd            
	//   72  122:istore          5
			char c = s.charAt(j);
	//   73  124:aload_1         
	//   74  125:iload_3         
	//   75  126:invokevirtual   #136 <Method char String.charAt(int)>
	//   76  129:istore          7
			j = k;
	//   77  131:iload           4
	//   78  133:istore_3        
			i = i1;
	//   79  134:iload           5
	//   80  136:istore_2        
			int i2 = ((int) (c));
	//   81  137:iload           7
	//   82  139:istore          6
			if(c < '\200')
	//*  83  141:iload           7
	//*  84  143:sipush          128
	//*  85  146:icmpge          255
			{
				i = k + 1;
	//   86  149:iload           4
	//   87  151:iconst_1        
	//   88  152:iadd            
	//   89  153:istore_2        
				abyte0[k] = (byte)c;
	//   90  154:aload           11
	//   91  156:iload           4
	//   92  158:iload           7
	//   93  160:int2byte        
	//   94  161:bastore         
				j = l2 - i1;
	//   95  162:iload           10
	//   96  164:iload           5
	//   97  166:isub            
	//   98  167:istore_3        
				i2 = k2 - i;
	//   99  168:iload           9
	//  100  170:iload_2         
	//  101  171:isub            
	//  102  172:istore          6
				k = j;
	//  103  174:iload_3         
	//  104  175:istore          4
				if(j > i2)
	//* 105  177:iload_3         
	//* 106  178:iload           6
	//* 107  180:icmple          187
					k = i2;
	//  108  183:iload           6
	//  109  185:istore          4
				j = i1;
	//  110  187:iload           5
	//  111  189:istore_3        
				do
				{
					if(j >= k + i1)
	//* 112  190:iload_3         
	//* 113  191:iload           4
	//* 114  193:iload           5
	//* 115  195:iadd            
	//* 116  196:icmplt          202
						continue label0;
	//  117  199:goto            87
					i2 = j + 1;
	//  118  202:iload_3         
	//  119  203:iconst_1        
	//  120  204:iadd            
	//  121  205:istore          6
					char c1 = s.charAt(j);
	//  122  207:aload_1         
	//  123  208:iload_3         
	//  124  209:invokevirtual   #136 <Method char String.charAt(int)>
	//  125  212:istore          7
					if(c1 >= '\200')
	//* 126  214:iload           7
	//* 127  216:sipush          128
	//* 128  219:icmplt          234
					{
						j = i;
	//  129  222:iload_2         
	//  130  223:istore_3        
						i = i2;
	//  131  224:iload           6
	//  132  226:istore_2        
						i2 = ((int) (c1));
	//  133  227:iload           7
	//  134  229:istore          6
						break;
	//  135  231:goto            255
					}
					int j2 = i + 1;
	//  136  234:iload_2         
	//  137  235:iconst_1        
	//  138  236:iadd            
	//  139  237:istore          8
					abyte0[i] = (byte)c1;
	//  140  239:aload           11
	//  141  241:iload_2         
	//  142  242:iload           7
	//  143  244:int2byte        
	//  144  245:bastore         
					j = i2;
	//  145  246:iload           6
	//  146  248:istore_3        
					i = j2;
	//  147  249:iload           8
	//  148  251:istore_2        
				} while(true);
	//  149  252:goto            190
			}
			if(i2 < 2048)
	//* 150  255:iload           6
	//* 151  257:sipush          2048
	//* 152  260:icmpge          311
			{
				int j1 = j + 1;
	//  153  263:iload_3         
	//  154  264:iconst_1        
	//  155  265:iadd            
	//  156  266:istore          5
				abyte0[j] = (byte)(0xc0 | i2 >> 6);
	//  157  268:aload           11
	//  158  270:iload_3         
	//  159  271:sipush          192
	//  160  274:iload           6
	//  161  276:bipush          6
	//  162  278:ishr            
	//  163  279:ior             
	//  164  280:int2byte        
	//  165  281:bastore         
				k = j1 + 1;
	//  166  282:iload           5
	//  167  284:iconst_1        
	//  168  285:iadd            
	//  169  286:istore          4
				abyte0[j1] = (byte)(i2 & 0x3f | 0x80);
	//  170  288:aload           11
	//  171  290:iload           5
	//  172  292:iload           6
	//  173  294:bipush          63
	//  174  296:iand            
	//  175  297:sipush          128
	//  176  300:ior             
	//  177  301:int2byte        
	//  178  302:bastore         
				j = i;
	//  179  303:iload_2         
	//  180  304:istore_3        
				i = k;
	//  181  305:iload           4
	//  182  307:istore_2        
				continue;
	//  183  308:goto            87
			}
			if(i2 >= 55296 && i2 <= 57343)
	//* 184  311:iload           6
	//* 185  313:ldc1            #7   <Int 55296>
	//* 186  315:icmplt          483
	//* 187  318:iload           6
	//* 188  320:ldc1            #13  <Int 57343>
	//* 189  322:icmple          328
	//* 190  325:goto            483
			{
				if(i2 > 56319)
	//* 191  328:iload           6
	//* 192  330:ldc1            #9   <Int 56319>
	//* 193  332:icmple          345
				{
					_outPtr = j;
	//  194  335:aload_0         
	//  195  336:iload_3         
	//  196  337:putfield        #43  <Field int _outPtr>
					illegalSurrogate(i2);
	//  197  340:iload           6
	//  198  342:invokestatic    #108 <Method void illegalSurrogate(int)>
				}
				_surrogate = i2;
	//  199  345:aload_0         
	//  200  346:iload           6
	//  201  348:putfield        #106 <Field int _surrogate>
				if(i >= l2)
	//* 202  351:iload_2         
	//* 203  352:iload           10
	//* 204  354:icmplt          363
				{
					k = j;
	//  205  357:iload_3         
	//  206  358:istore          4
					break;
	//  207  360:goto            551
				}
				k = i + 1;
	//  208  363:iload_2         
	//  209  364:iconst_1        
	//  210  365:iadd            
	//  211  366:istore          4
				int k1 = convertSurrogate(((int) (s.charAt(i))));
	//  212  368:aload_0         
	//  213  369:aload_1         
	//  214  370:iload_2         
	//  215  371:invokevirtual   #136 <Method char String.charAt(int)>
	//  216  374:invokevirtual   #122 <Method int convertSurrogate(int)>
	//  217  377:istore          5
				if(k1 > 0x10ffff)
	//* 218  379:iload           5
	//* 219  381:ldc1            #57  <Int 0x10ffff>
	//* 220  383:icmple          396
				{
					_outPtr = j;
	//  221  386:aload_0         
	//  222  387:iload_3         
	//  223  388:putfield        #43  <Field int _outPtr>
					illegalSurrogate(k1);
	//  224  391:iload           5
	//  225  393:invokestatic    #108 <Method void illegalSurrogate(int)>
				}
				i = j + 1;
	//  226  396:iload_3         
	//  227  397:iconst_1        
	//  228  398:iadd            
	//  229  399:istore_2        
				abyte0[j] = (byte)(0xf0 | k1 >> 18);
	//  230  400:aload           11
	//  231  402:iload_3         
	//  232  403:sipush          240
	//  233  406:iload           5
	//  234  408:bipush          18
	//  235  410:ishr            
	//  236  411:ior             
	//  237  412:int2byte        
	//  238  413:bastore         
				j = i + 1;
	//  239  414:iload_2         
	//  240  415:iconst_1        
	//  241  416:iadd            
	//  242  417:istore_3        
				abyte0[i] = (byte)(k1 >> 12 & 0x3f | 0x80);
	//  243  418:aload           11
	//  244  420:iload_2         
	//  245  421:iload           5
	//  246  423:bipush          12
	//  247  425:ishr            
	//  248  426:bipush          63
	//  249  428:iand            
	//  250  429:sipush          128
	//  251  432:ior             
	//  252  433:int2byte        
	//  253  434:bastore         
				i2 = j + 1;
	//  254  435:iload_3         
	//  255  436:iconst_1        
	//  256  437:iadd            
	//  257  438:istore          6
				abyte0[j] = (byte)(k1 >> 6 & 0x3f | 0x80);
	//  258  440:aload           11
	//  259  442:iload_3         
	//  260  443:iload           5
	//  261  445:bipush          6
	//  262  447:ishr            
	//  263  448:bipush          63
	//  264  450:iand            
	//  265  451:sipush          128
	//  266  454:ior             
	//  267  455:int2byte        
	//  268  456:bastore         
				i = i2 + 1;
	//  269  457:iload           6
	//  270  459:iconst_1        
	//  271  460:iadd            
	//  272  461:istore_2        
				abyte0[i2] = (byte)(k1 & 0x3f | 0x80);
	//  273  462:aload           11
	//  274  464:iload           6
	//  275  466:iload           5
	//  276  468:bipush          63
	//  277  470:iand            
	//  278  471:sipush          128
	//  279  474:ior             
	//  280  475:int2byte        
	//  281  476:bastore         
				j = k;
	//  282  477:iload           4
	//  283  479:istore_3        
			} else
	//* 284  480:goto            87
			{
				k = j + 1;
	//  285  483:iload_3         
	//  286  484:iconst_1        
	//  287  485:iadd            
	//  288  486:istore          4
				abyte0[j] = (byte)(0xe0 | i2 >> 12);
	//  289  488:aload           11
	//  290  490:iload_3         
	//  291  491:sipush          224
	//  292  494:iload           6
	//  293  496:bipush          12
	//  294  498:ishr            
	//  295  499:ior             
	//  296  500:int2byte        
	//  297  501:bastore         
				int l1 = k + 1;
	//  298  502:iload           4
	//  299  504:iconst_1        
	//  300  505:iadd            
	//  301  506:istore          5
				abyte0[k] = (byte)(i2 >> 6 & 0x3f | 0x80);
	//  302  508:aload           11
	//  303  510:iload           4
	//  304  512:iload           6
	//  305  514:bipush          6
	//  306  516:ishr            
	//  307  517:bipush          63
	//  308  519:iand            
	//  309  520:sipush          128
	//  310  523:ior             
	//  311  524:int2byte        
	//  312  525:bastore         
				abyte0[l1] = (byte)(i2 & 0x3f | 0x80);
	//  313  526:aload           11
	//  314  528:iload           5
	//  315  530:iload           6
	//  316  532:bipush          63
	//  317  534:iand            
	//  318  535:sipush          128
	//  319  538:ior             
	//  320  539:int2byte        
	//  321  540:bastore         
				j = i;
	//  322  541:iload_2         
	//  323  542:istore_3        
				i = l1 + 1;
	//  324  543:iload           5
	//  325  545:iconst_1        
	//  326  546:iadd            
	//  327  547:istore_2        
			}
		} while(true);
	//  328  548:goto            87
		_outPtr = k;
	//  329  551:aload_0         
	//  330  552:iload           4
	//  331  554:putfield        #43  <Field int _outPtr>
	//  332  557:return          
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
		int l = j;
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
			l = j - 1;
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
		byte abyte0[] = _outBuffer;
	//   39   61:aload_0         
	//   40   62:getfield        #39  <Field byte[] _outBuffer>
	//   41   65:astore          11
		int k2 = _outBufferEnd;
	//   42   67:aload_0         
	//   43   68:getfield        #41  <Field int _outBufferEnd>
	//   44   71:istore          9
		int l2 = l + k;
	//   45   73:iload           5
	//   46   75:iload           4
	//   47   77:iadd            
	//   48   78:istore          10
		j = k;
	//   49   80:iload           4
	//   50   82:istore_3        
label0:
		do
		{
			k = i;
	//   51   83:iload_2         
	//   52   84:istore          4
			if(j >= l2)
				break;
	//   53   86:iload_3         
	//   54   87:iload           10
	//   55   89:icmpge          541
			k = i;
	//   56   92:iload_2         
	//   57   93:istore          4
			if(i >= k2)
	//*  58   95:iload_2         
	//*  59   96:iload           9
	//*  60   98:icmplt          115
			{
				_out.write(abyte0, 0, i);
	//   61  101:aload_0         
	//   62  102:getfield        #31  <Field OutputStream _out>
	//   63  105:aload           11
	//   64  107:iconst_0        
	//   65  108:iload_2         
	//   66  109:invokevirtual   #98  <Method void OutputStream.write(byte[], int, int)>
				k = 0;
	//   67  112:iconst_0        
	//   68  113:istore          4
			}
			int i1 = j + 1;
	//   69  115:iload_3         
	//   70  116:iconst_1        
	//   71  117:iadd            
	//   72  118:istore          5
			char c = ac[j];
	//   73  120:aload_1         
	//   74  121:iload_3         
	//   75  122:caload          
	//   76  123:istore          7
			j = k;
	//   77  125:iload           4
	//   78  127:istore_3        
			i = i1;
	//   79  128:iload           5
	//   80  130:istore_2        
			int i2 = ((int) (c));
	//   81  131:iload           7
	//   82  133:istore          6
			if(c < '\200')
	//*  83  135:iload           7
	//*  84  137:sipush          128
	//*  85  140:icmpge          247
			{
				i = k + 1;
	//   86  143:iload           4
	//   87  145:iconst_1        
	//   88  146:iadd            
	//   89  147:istore_2        
				abyte0[k] = (byte)c;
	//   90  148:aload           11
	//   91  150:iload           4
	//   92  152:iload           7
	//   93  154:int2byte        
	//   94  155:bastore         
				j = l2 - i1;
	//   95  156:iload           10
	//   96  158:iload           5
	//   97  160:isub            
	//   98  161:istore_3        
				i2 = k2 - i;
	//   99  162:iload           9
	//  100  164:iload_2         
	//  101  165:isub            
	//  102  166:istore          6
				k = j;
	//  103  168:iload_3         
	//  104  169:istore          4
				if(j > i2)
	//* 105  171:iload_3         
	//* 106  172:iload           6
	//* 107  174:icmple          181
					k = i2;
	//  108  177:iload           6
	//  109  179:istore          4
				j = i1;
	//  110  181:iload           5
	//  111  183:istore_3        
				do
				{
					if(j >= k + i1)
	//* 112  184:iload_3         
	//* 113  185:iload           4
	//* 114  187:iload           5
	//* 115  189:iadd            
	//* 116  190:icmplt          196
						continue label0;
	//  117  193:goto            83
					i2 = j + 1;
	//  118  196:iload_3         
	//  119  197:iconst_1        
	//  120  198:iadd            
	//  121  199:istore          6
					char c1 = ac[j];
	//  122  201:aload_1         
	//  123  202:iload_3         
	//  124  203:caload          
	//  125  204:istore          7
					if(c1 >= '\200')
	//* 126  206:iload           7
	//* 127  208:sipush          128
	//* 128  211:icmplt          226
					{
						j = i;
	//  129  214:iload_2         
	//  130  215:istore_3        
						i = i2;
	//  131  216:iload           6
	//  132  218:istore_2        
						i2 = ((int) (c1));
	//  133  219:iload           7
	//  134  221:istore          6
						break;
	//  135  223:goto            247
					}
					int j2 = i + 1;
	//  136  226:iload_2         
	//  137  227:iconst_1        
	//  138  228:iadd            
	//  139  229:istore          8
					abyte0[i] = (byte)c1;
	//  140  231:aload           11
	//  141  233:iload_2         
	//  142  234:iload           7
	//  143  236:int2byte        
	//  144  237:bastore         
					j = i2;
	//  145  238:iload           6
	//  146  240:istore_3        
					i = j2;
	//  147  241:iload           8
	//  148  243:istore_2        
				} while(true);
	//  149  244:goto            184
			}
			if(i2 < 2048)
	//* 150  247:iload           6
	//* 151  249:sipush          2048
	//* 152  252:icmpge          303
			{
				int j1 = j + 1;
	//  153  255:iload_3         
	//  154  256:iconst_1        
	//  155  257:iadd            
	//  156  258:istore          5
				abyte0[j] = (byte)(0xc0 | i2 >> 6);
	//  157  260:aload           11
	//  158  262:iload_3         
	//  159  263:sipush          192
	//  160  266:iload           6
	//  161  268:bipush          6
	//  162  270:ishr            
	//  163  271:ior             
	//  164  272:int2byte        
	//  165  273:bastore         
				k = j1 + 1;
	//  166  274:iload           5
	//  167  276:iconst_1        
	//  168  277:iadd            
	//  169  278:istore          4
				abyte0[j1] = (byte)(i2 & 0x3f | 0x80);
	//  170  280:aload           11
	//  171  282:iload           5
	//  172  284:iload           6
	//  173  286:bipush          63
	//  174  288:iand            
	//  175  289:sipush          128
	//  176  292:ior             
	//  177  293:int2byte        
	//  178  294:bastore         
				j = i;
	//  179  295:iload_2         
	//  180  296:istore_3        
				i = k;
	//  181  297:iload           4
	//  182  299:istore_2        
				continue;
	//  183  300:goto            83
			}
			if(i2 >= 55296 && i2 <= 57343)
	//* 184  303:iload           6
	//* 185  305:ldc1            #7   <Int 55296>
	//* 186  307:icmplt          473
	//* 187  310:iload           6
	//* 188  312:ldc1            #13  <Int 57343>
	//* 189  314:icmple          320
	//* 190  317:goto            473
			{
				if(i2 > 56319)
	//* 191  320:iload           6
	//* 192  322:ldc1            #9   <Int 56319>
	//* 193  324:icmple          337
				{
					_outPtr = j;
	//  194  327:aload_0         
	//  195  328:iload_3         
	//  196  329:putfield        #43  <Field int _outPtr>
					illegalSurrogate(i2);
	//  197  332:iload           6
	//  198  334:invokestatic    #108 <Method void illegalSurrogate(int)>
				}
				_surrogate = i2;
	//  199  337:aload_0         
	//  200  338:iload           6
	//  201  340:putfield        #106 <Field int _surrogate>
				if(i >= l2)
	//* 202  343:iload_2         
	//* 203  344:iload           10
	//* 204  346:icmplt          355
				{
					k = j;
	//  205  349:iload_3         
	//  206  350:istore          4
					break;
	//  207  352:goto            541
				}
				k = i + 1;
	//  208  355:iload_2         
	//  209  356:iconst_1        
	//  210  357:iadd            
	//  211  358:istore          4
				int k1 = convertSurrogate(((int) (ac[i])));
	//  212  360:aload_0         
	//  213  361:aload_1         
	//  214  362:iload_2         
	//  215  363:caload          
	//  216  364:invokevirtual   #122 <Method int convertSurrogate(int)>
	//  217  367:istore          5
				if(k1 > 0x10ffff)
	//* 218  369:iload           5
	//* 219  371:ldc1            #57  <Int 0x10ffff>
	//* 220  373:icmple          386
				{
					_outPtr = j;
	//  221  376:aload_0         
	//  222  377:iload_3         
	//  223  378:putfield        #43  <Field int _outPtr>
					illegalSurrogate(k1);
	//  224  381:iload           5
	//  225  383:invokestatic    #108 <Method void illegalSurrogate(int)>
				}
				i = j + 1;
	//  226  386:iload_3         
	//  227  387:iconst_1        
	//  228  388:iadd            
	//  229  389:istore_2        
				abyte0[j] = (byte)(0xf0 | k1 >> 18);
	//  230  390:aload           11
	//  231  392:iload_3         
	//  232  393:sipush          240
	//  233  396:iload           5
	//  234  398:bipush          18
	//  235  400:ishr            
	//  236  401:ior             
	//  237  402:int2byte        
	//  238  403:bastore         
				j = i + 1;
	//  239  404:iload_2         
	//  240  405:iconst_1        
	//  241  406:iadd            
	//  242  407:istore_3        
				abyte0[i] = (byte)(k1 >> 12 & 0x3f | 0x80);
	//  243  408:aload           11
	//  244  410:iload_2         
	//  245  411:iload           5
	//  246  413:bipush          12
	//  247  415:ishr            
	//  248  416:bipush          63
	//  249  418:iand            
	//  250  419:sipush          128
	//  251  422:ior             
	//  252  423:int2byte        
	//  253  424:bastore         
				i2 = j + 1;
	//  254  425:iload_3         
	//  255  426:iconst_1        
	//  256  427:iadd            
	//  257  428:istore          6
				abyte0[j] = (byte)(k1 >> 6 & 0x3f | 0x80);
	//  258  430:aload           11
	//  259  432:iload_3         
	//  260  433:iload           5
	//  261  435:bipush          6
	//  262  437:ishr            
	//  263  438:bipush          63
	//  264  440:iand            
	//  265  441:sipush          128
	//  266  444:ior             
	//  267  445:int2byte        
	//  268  446:bastore         
				i = i2 + 1;
	//  269  447:iload           6
	//  270  449:iconst_1        
	//  271  450:iadd            
	//  272  451:istore_2        
				abyte0[i2] = (byte)(k1 & 0x3f | 0x80);
	//  273  452:aload           11
	//  274  454:iload           6
	//  275  456:iload           5
	//  276  458:bipush          63
	//  277  460:iand            
	//  278  461:sipush          128
	//  279  464:ior             
	//  280  465:int2byte        
	//  281  466:bastore         
				j = k;
	//  282  467:iload           4
	//  283  469:istore_3        
			} else
	//* 284  470:goto            83
			{
				k = j + 1;
	//  285  473:iload_3         
	//  286  474:iconst_1        
	//  287  475:iadd            
	//  288  476:istore          4
				abyte0[j] = (byte)(0xe0 | i2 >> 12);
	//  289  478:aload           11
	//  290  480:iload_3         
	//  291  481:sipush          224
	//  292  484:iload           6
	//  293  486:bipush          12
	//  294  488:ishr            
	//  295  489:ior             
	//  296  490:int2byte        
	//  297  491:bastore         
				int l1 = k + 1;
	//  298  492:iload           4
	//  299  494:iconst_1        
	//  300  495:iadd            
	//  301  496:istore          5
				abyte0[k] = (byte)(i2 >> 6 & 0x3f | 0x80);
	//  302  498:aload           11
	//  303  500:iload           4
	//  304  502:iload           6
	//  305  504:bipush          6
	//  306  506:ishr            
	//  307  507:bipush          63
	//  308  509:iand            
	//  309  510:sipush          128
	//  310  513:ior             
	//  311  514:int2byte        
	//  312  515:bastore         
				abyte0[l1] = (byte)(i2 & 0x3f | 0x80);
	//  313  516:aload           11
	//  314  518:iload           5
	//  315  520:iload           6
	//  316  522:bipush          63
	//  317  524:iand            
	//  318  525:sipush          128
	//  319  528:ior             
	//  320  529:int2byte        
	//  321  530:bastore         
				j = i;
	//  322  531:iload_2         
	//  323  532:istore_3        
				i = l1 + 1;
	//  324  533:iload           5
	//  325  535:iconst_1        
	//  326  536:iadd            
	//  327  537:istore_2        
			}
		} while(true);
	//  328  538:goto            83
		_outPtr = k;
	//  329  541:aload_0         
	//  330  542:iload           4
	//  331  544:putfield        #43  <Field int _outPtr>
	//  332  547:return          
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
