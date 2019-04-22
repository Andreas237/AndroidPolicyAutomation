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
	//    1    1:invokespecial   #19  <Method void Writer()>
		_context = iocontext;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field IOContext _context>
		_out = outputstream;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field OutputStream _out>
		_outBuffer = iocontext.allocWriteEncodingBuffer();
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #29  <Method byte[] IOContext.allocWriteEncodingBuffer()>
	//   11   19:putfield        #31  <Field byte[] _outBuffer>
		_outBufferEnd = _outBuffer.length - 4;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #31  <Field byte[] _outBuffer>
	//   15   27:arraylength     
	//   16   28:iconst_4        
	//   17   29:isub            
	//   18   30:putfield        #33  <Field int _outBufferEnd>
		_outPtr = 0;
	//   19   33:aload_0         
	//   20   34:iconst_0        
	//   21   35:putfield        #35  <Field int _outPtr>
	//   22   38:return          
	}

	protected static void illegalSurrogate(int i)
		throws IOException
	{
		throw new IOException(illegalSurrogateDesc(i));
	//    0    0:new             #40  <Class IOException>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokestatic    #44  <Method String illegalSurrogateDesc(int)>
	//    4    8:invokespecial   #47  <Method void IOException(String)>
	//    5   11:athrow          
	}

	protected static String illegalSurrogateDesc(int i)
	{
		if(i > 0x10ffff)
	//*   0    0:iload_0         
	//*   1    1:ldc1            #49  <Int 0x10ffff>
	//*   2    3:icmple          42
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    6:new             #51  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #52  <Method void StringBuilder()>
	//    6   13:astore_1        
			stringbuilder.append("Illegal character point (0x");
	//    7   14:aload_1         
	//    8   15:ldc1            #54  <String "Illegal character point (0x">
	//    9   17:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
			stringbuilder.append(Integer.toHexString(i));
	//   11   21:aload_1         
	//   12   22:iload_0         
	//   13   23:invokestatic    #63  <Method String Integer.toHexString(int)>
	//   14   26:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			stringbuilder.append(") to output; max is 0x10FFFF as per RFC 4627");
	//   16   30:aload_1         
	//   17   31:ldc1            #65  <String ") to output; max is 0x10FFFF as per RFC 4627">
	//   18   33:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
			return stringbuilder.toString();
	//   20   37:aload_1         
	//   21   38:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   22   41:areturn         
		}
		if(i >= 55296)
	//*  23   42:iload_0         
	//*  24   43:ldc1            #70  <Int 55296>
	//*  25   45:icmplt          126
		{
			if(i <= 56319)
	//*  26   48:iload_0         
	//*  27   49:ldc1            #71  <Int 56319>
	//*  28   51:icmpgt          90
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   29   54:new             #51  <Class StringBuilder>
	//   30   57:dup             
	//   31   58:invokespecial   #52  <Method void StringBuilder()>
	//   32   61:astore_1        
				stringbuilder1.append("Unmatched first part of surrogate pair (0x");
	//   33   62:aload_1         
	//   34   63:ldc1            #73  <String "Unmatched first part of surrogate pair (0x">
	//   35   65:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
				stringbuilder1.append(Integer.toHexString(i));
	//   37   69:aload_1         
	//   38   70:iload_0         
	//   39   71:invokestatic    #63  <Method String Integer.toHexString(int)>
	//   40   74:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   41   77:pop             
				stringbuilder1.append(")");
	//   42   78:aload_1         
	//   43   79:ldc1            #75  <String ")">
	//   44   81:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   45   84:pop             
				return stringbuilder1.toString();
	//   46   85:aload_1         
	//   47   86:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   48   89:areturn         
			} else
			{
				StringBuilder stringbuilder2 = new StringBuilder();
	//   49   90:new             #51  <Class StringBuilder>
	//   50   93:dup             
	//   51   94:invokespecial   #52  <Method void StringBuilder()>
	//   52   97:astore_1        
				stringbuilder2.append("Unmatched second part of surrogate pair (0x");
	//   53   98:aload_1         
	//   54   99:ldc1            #77  <String "Unmatched second part of surrogate pair (0x">
	//   55  101:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   56  104:pop             
				stringbuilder2.append(Integer.toHexString(i));
	//   57  105:aload_1         
	//   58  106:iload_0         
	//   59  107:invokestatic    #63  <Method String Integer.toHexString(int)>
	//   60  110:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   61  113:pop             
				stringbuilder2.append(")");
	//   62  114:aload_1         
	//   63  115:ldc1            #75  <String ")">
	//   64  117:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   65  120:pop             
				return stringbuilder2.toString();
	//   66  121:aload_1         
	//   67  122:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   68  125:areturn         
			}
		} else
		{
			StringBuilder stringbuilder3 = new StringBuilder();
	//   69  126:new             #51  <Class StringBuilder>
	//   70  129:dup             
	//   71  130:invokespecial   #52  <Method void StringBuilder()>
	//   72  133:astore_1        
			stringbuilder3.append("Illegal character point (0x");
	//   73  134:aload_1         
	//   74  135:ldc1            #54  <String "Illegal character point (0x">
	//   75  137:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   76  140:pop             
			stringbuilder3.append(Integer.toHexString(i));
	//   77  141:aload_1         
	//   78  142:iload_0         
	//   79  143:invokestatic    #63  <Method String Integer.toHexString(int)>
	//   80  146:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   81  149:pop             
			stringbuilder3.append(") to output");
	//   82  150:aload_1         
	//   83  151:ldc1            #79  <String ") to output">
	//   84  153:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   85  156:pop             
			return stringbuilder3.toString();
	//   86  157:aload_1         
	//   87  158:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   88  161:areturn         
		}
	}

	public Writer append(char c)
		throws IOException
	{
		write(((int) (c)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #83  <Method void write(int)>
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
	//    2    2:invokevirtual   #86  <Method Writer append(char)>
	//    3    5:areturn         
	}

	public void close()
		throws IOException
	{
		OutputStream outputstream = _out;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field OutputStream _out>
	//    2    4:astore_2        
		if(outputstream != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          87
		{
			int i = _outPtr;
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field int _outPtr>
	//    7   13:istore_1        
			if(i > 0)
	//*   8   14:iload_1         
	//*   9   15:ifle            33
			{
				outputstream.write(_outBuffer, 0, i);
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:getfield        #31  <Field byte[] _outBuffer>
	//   13   23:iconst_0        
	//   14   24:iload_1         
	//   15   25:invokevirtual   #92  <Method void OutputStream.write(byte[], int, int)>
				_outPtr = 0;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #35  <Field int _outPtr>
			}
			outputstream = _out;
	//   19   33:aload_0         
	//   20   34:getfield        #23  <Field OutputStream _out>
	//   21   37:astore_2        
			_out = null;
	//   22   38:aload_0         
	//   23   39:aconst_null     
	//   24   40:putfield        #23  <Field OutputStream _out>
			byte abyte0[] = _outBuffer;
	//   25   43:aload_0         
	//   26   44:getfield        #31  <Field byte[] _outBuffer>
	//   27   47:astore_3        
			if(abyte0 != null)
	//*  28   48:aload_3         
	//*  29   49:ifnull          65
			{
				_outBuffer = null;
	//   30   52:aload_0         
	//   31   53:aconst_null     
	//   32   54:putfield        #31  <Field byte[] _outBuffer>
				_context.releaseWriteEncodingBuffer(abyte0);
	//   33   57:aload_0         
	//   34   58:getfield        #21  <Field IOContext _context>
	//   35   61:aload_3         
	//   36   62:invokevirtual   #96  <Method void IOContext.releaseWriteEncodingBuffer(byte[])>
			}
			outputstream.close();
	//   37   65:aload_2         
	//   38   66:invokevirtual   #98  <Method void OutputStream.close()>
			i = _surrogate;
	//   39   69:aload_0         
	//   40   70:getfield        #100 <Field int _surrogate>
	//   41   73:istore_1        
			_surrogate = 0;
	//   42   74:aload_0         
	//   43   75:iconst_0        
	//   44   76:putfield        #100 <Field int _surrogate>
			if(i > 0)
	//*  45   79:iload_1         
	//*  46   80:ifle            87
				illegalSurrogate(i);
	//   47   83:iload_1         
	//   48   84:invokestatic    #102 <Method void illegalSurrogate(int)>
		}
	//   49   87:return          
	}

	protected int convertSurrogate(int i)
		throws IOException
	{
		int j = _surrogate;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field int _surrogate>
	//    2    4:istore_2        
		_surrogate = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #100 <Field int _surrogate>
		if(i >= 56320 && i <= 57343)
	//*   6   10:iload_1         
	//*   7   11:ldc1            #105 <Int 56320>
	//*   8   13:icmplt          38
	//*   9   16:iload_1         
	//*  10   17:ldc1            #106 <Int 57343>
	//*  11   19:icmpgt          38
		{
			return (j - 55296 << 10) + 0x10000 + (i - 56320);
	//   12   22:iload_2         
	//   13   23:ldc1            #70  <Int 55296>
	//   14   25:isub            
	//   15   26:bipush          10
	//   16   28:ishl            
	//   17   29:ldc1            #107 <Int 0x10000>
	//   18   31:iadd            
	//   19   32:iload_1         
	//   20   33:ldc1            #105 <Int 56320>
	//   21   35:isub            
	//   22   36:iadd            
	//   23   37:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   24   38:new             #51  <Class StringBuilder>
	//   25   41:dup             
	//   26   42:invokespecial   #52  <Method void StringBuilder()>
	//   27   45:astore_3        
			stringbuilder.append("Broken surrogate pair: first char 0x");
	//   28   46:aload_3         
	//   29   47:ldc1            #109 <String "Broken surrogate pair: first char 0x">
	//   30   49:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   31   52:pop             
			stringbuilder.append(Integer.toHexString(j));
	//   32   53:aload_3         
	//   33   54:iload_2         
	//   34   55:invokestatic    #63  <Method String Integer.toHexString(int)>
	//   35   58:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   36   61:pop             
			stringbuilder.append(", second 0x");
	//   37   62:aload_3         
	//   38   63:ldc1            #111 <String ", second 0x">
	//   39   65:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   40   68:pop             
			stringbuilder.append(Integer.toHexString(i));
	//   41   69:aload_3         
	//   42   70:iload_1         
	//   43   71:invokestatic    #63  <Method String Integer.toHexString(int)>
	//   44   74:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   45   77:pop             
			stringbuilder.append("; illegal combination");
	//   46   78:aload_3         
	//   47   79:ldc1            #113 <String "; illegal combination">
	//   48   81:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   49   84:pop             
			throw new IOException(stringbuilder.toString());
	//   50   85:new             #40  <Class IOException>
	//   51   88:dup             
	//   52   89:aload_3         
	//   53   90:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   54   93:invokespecial   #47  <Method void IOException(String)>
	//   55   96:athrow          
		}
	}

	public void flush()
		throws IOException
	{
		OutputStream outputstream = _out;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field OutputStream _out>
	//    2    4:astore_2        
		if(outputstream != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          40
		{
			int i = _outPtr;
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field int _outPtr>
	//    7   13:istore_1        
			if(i > 0)
	//*   8   14:iload_1         
	//*   9   15:ifle            33
			{
				outputstream.write(_outBuffer, 0, i);
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:getfield        #31  <Field byte[] _outBuffer>
	//   13   23:iconst_0        
	//   14   24:iload_1         
	//   15   25:invokevirtual   #92  <Method void OutputStream.write(byte[], int, int)>
				_outPtr = 0;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #35  <Field int _outPtr>
			}
			_out.flush();
	//   19   33:aload_0         
	//   20   34:getfield        #23  <Field OutputStream _out>
	//   21   37:invokevirtual   #116 <Method void OutputStream.flush()>
		}
	//   22   40:return          
	}

	public void write(int i)
		throws IOException
	{
		int j;
		if(_surrogate > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field int _surrogate>
	//*   2    4:ifle            16
		{
			j = convertSurrogate(i);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokevirtual   #118 <Method int convertSurrogate(int)>
	//    6   12:istore_2        
		} else
	//*   7   13:goto            48
		{
			j = i;
	//    8   16:iload_1         
	//    9   17:istore_2        
			if(i >= 55296)
	//*  10   18:iload_1         
	//*  11   19:ldc1            #70  <Int 55296>
	//*  12   21:icmplt          48
			{
				j = i;
	//   13   24:iload_1         
	//   14   25:istore_2        
				if(i <= 57343)
	//*  15   26:iload_1         
	//*  16   27:ldc1            #106 <Int 57343>
	//*  17   29:icmpgt          48
				{
					if(i > 56319)
	//*  18   32:iload_1         
	//*  19   33:ldc1            #71  <Int 56319>
	//*  20   35:icmple          42
						illegalSurrogate(i);
	//   21   38:iload_1         
	//   22   39:invokestatic    #102 <Method void illegalSurrogate(int)>
					_surrogate = i;
	//   23   42:aload_0         
	//   24   43:iload_1         
	//   25   44:putfield        #100 <Field int _surrogate>
					return;
	//   26   47:return          
				}
			}
		}
		i = _outPtr;
	//   27   48:aload_0         
	//   28   49:getfield        #35  <Field int _outPtr>
	//   29   52:istore_1        
		if(i >= _outBufferEnd)
	//*  30   53:iload_1         
	//*  31   54:aload_0         
	//*  32   55:getfield        #33  <Field int _outBufferEnd>
	//*  33   58:icmplt          79
		{
			_out.write(_outBuffer, 0, i);
	//   34   61:aload_0         
	//   35   62:getfield        #23  <Field OutputStream _out>
	//   36   65:aload_0         
	//   37   66:getfield        #31  <Field byte[] _outBuffer>
	//   38   69:iconst_0        
	//   39   70:iload_1         
	//   40   71:invokevirtual   #92  <Method void OutputStream.write(byte[], int, int)>
			_outPtr = 0;
	//   41   74:aload_0         
	//   42   75:iconst_0        
	//   43   76:putfield        #35  <Field int _outPtr>
		}
		if(j < 128)
	//*  44   79:iload_2         
	//*  45   80:sipush          128
	//*  46   83:icmpge          111
		{
			byte abyte0[] = _outBuffer;
	//   47   86:aload_0         
	//   48   87:getfield        #31  <Field byte[] _outBuffer>
	//   49   90:astore          4
			i = _outPtr;
	//   50   92:aload_0         
	//   51   93:getfield        #35  <Field int _outPtr>
	//   52   96:istore_1        
			_outPtr = i + 1;
	//   53   97:aload_0         
	//   54   98:iload_1         
	//   55   99:iconst_1        
	//   56  100:iadd            
	//   57  101:putfield        #35  <Field int _outPtr>
			abyte0[i] = (byte)j;
	//   58  104:aload           4
	//   59  106:iload_1         
	//   60  107:iload_2         
	//   61  108:int2byte        
	//   62  109:bastore         
			return;
	//   63  110:return          
		}
		i = _outPtr;
	//   64  111:aload_0         
	//   65  112:getfield        #35  <Field int _outPtr>
	//   66  115:istore_1        
		if(j < 2048)
	//*  67  116:iload_2         
	//*  68  117:sipush          2048
	//*  69  120:icmpge          166
		{
			byte abyte1[] = _outBuffer;
	//   70  123:aload_0         
	//   71  124:getfield        #31  <Field byte[] _outBuffer>
	//   72  127:astore          4
			int k = i + 1;
	//   73  129:iload_1         
	//   74  130:iconst_1        
	//   75  131:iadd            
	//   76  132:istore_3        
			abyte1[i] = (byte)(j >> 6 | 0xc0);
	//   77  133:aload           4
	//   78  135:iload_1         
	//   79  136:iload_2         
	//   80  137:bipush          6
	//   81  139:ishr            
	//   82  140:sipush          192
	//   83  143:ior             
	//   84  144:int2byte        
	//   85  145:bastore         
			i = k + 1;
	//   86  146:iload_3         
	//   87  147:iconst_1        
	//   88  148:iadd            
	//   89  149:istore_1        
			abyte1[k] = (byte)(j & 0x3f | 0x80);
	//   90  150:aload           4
	//   91  152:iload_3         
	//   92  153:iload_2         
	//   93  154:bipush          63
	//   94  156:iand            
	//   95  157:sipush          128
	//   96  160:ior             
	//   97  161:int2byte        
	//   98  162:bastore         
		} else
	//*  99  163:goto            325
		if(j <= 65535)
	//* 100  166:iload_2         
	//* 101  167:ldc1            #119 <Int 65535>
	//* 102  169:icmpgt          235
		{
			byte abyte2[] = _outBuffer;
	//  103  172:aload_0         
	//  104  173:getfield        #31  <Field byte[] _outBuffer>
	//  105  176:astore          4
			int l = i + 1;
	//  106  178:iload_1         
	//  107  179:iconst_1        
	//  108  180:iadd            
	//  109  181:istore_3        
			abyte2[i] = (byte)(j >> 12 | 0xe0);
	//  110  182:aload           4
	//  111  184:iload_1         
	//  112  185:iload_2         
	//  113  186:bipush          12
	//  114  188:ishr            
	//  115  189:sipush          224
	//  116  192:ior             
	//  117  193:int2byte        
	//  118  194:bastore         
			i = l + 1;
	//  119  195:iload_3         
	//  120  196:iconst_1        
	//  121  197:iadd            
	//  122  198:istore_1        
			abyte2[l] = (byte)(j >> 6 & 0x3f | 0x80);
	//  123  199:aload           4
	//  124  201:iload_3         
	//  125  202:iload_2         
	//  126  203:bipush          6
	//  127  205:ishr            
	//  128  206:bipush          63
	//  129  208:iand            
	//  130  209:sipush          128
	//  131  212:ior             
	//  132  213:int2byte        
	//  133  214:bastore         
			abyte2[i] = (byte)(j & 0x3f | 0x80);
	//  134  215:aload           4
	//  135  217:iload_1         
	//  136  218:iload_2         
	//  137  219:bipush          63
	//  138  221:iand            
	//  139  222:sipush          128
	//  140  225:ior             
	//  141  226:int2byte        
	//  142  227:bastore         
			i++;
	//  143  228:iload_1         
	//  144  229:iconst_1        
	//  145  230:iadd            
	//  146  231:istore_1        
		} else
	//* 147  232:goto            325
		{
			if(j > 0x10ffff)
	//* 148  235:iload_2         
	//* 149  236:ldc1            #49  <Int 0x10ffff>
	//* 150  238:icmple          245
				illegalSurrogate(j);
	//  151  241:iload_2         
	//  152  242:invokestatic    #102 <Method void illegalSurrogate(int)>
			byte abyte3[] = _outBuffer;
	//  153  245:aload_0         
	//  154  246:getfield        #31  <Field byte[] _outBuffer>
	//  155  249:astore          4
			int i1 = i + 1;
	//  156  251:iload_1         
	//  157  252:iconst_1        
	//  158  253:iadd            
	//  159  254:istore_3        
			abyte3[i] = (byte)(j >> 18 | 0xf0);
	//  160  255:aload           4
	//  161  257:iload_1         
	//  162  258:iload_2         
	//  163  259:bipush          18
	//  164  261:ishr            
	//  165  262:sipush          240
	//  166  265:ior             
	//  167  266:int2byte        
	//  168  267:bastore         
			i = i1 + 1;
	//  169  268:iload_3         
	//  170  269:iconst_1        
	//  171  270:iadd            
	//  172  271:istore_1        
			abyte3[i1] = (byte)(j >> 12 & 0x3f | 0x80);
	//  173  272:aload           4
	//  174  274:iload_3         
	//  175  275:iload_2         
	//  176  276:bipush          12
	//  177  278:ishr            
	//  178  279:bipush          63
	//  179  281:iand            
	//  180  282:sipush          128
	//  181  285:ior             
	//  182  286:int2byte        
	//  183  287:bastore         
			i1 = i + 1;
	//  184  288:iload_1         
	//  185  289:iconst_1        
	//  186  290:iadd            
	//  187  291:istore_3        
			abyte3[i] = (byte)(j >> 6 & 0x3f | 0x80);
	//  188  292:aload           4
	//  189  294:iload_1         
	//  190  295:iload_2         
	//  191  296:bipush          6
	//  192  298:ishr            
	//  193  299:bipush          63
	//  194  301:iand            
	//  195  302:sipush          128
	//  196  305:ior             
	//  197  306:int2byte        
	//  198  307:bastore         
			i = i1 + 1;
	//  199  308:iload_3         
	//  200  309:iconst_1        
	//  201  310:iadd            
	//  202  311:istore_1        
			abyte3[i1] = (byte)(j & 0x3f | 0x80);
	//  203  312:aload           4
	//  204  314:iload_3         
	//  205  315:iload_2         
	//  206  316:bipush          63
	//  207  318:iand            
	//  208  319:sipush          128
	//  209  322:ior             
	//  210  323:int2byte        
	//  211  324:bastore         
		}
		_outPtr = i;
	//  212  325:aload_0         
	//  213  326:iload_1         
	//  214  327:putfield        #35  <Field int _outPtr>
	//  215  330:return          
	}

	public void write(String s)
		throws IOException
	{
		write(s, 0, s.length());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:invokevirtual   #125 <Method int String.length()>
	//    5    7:invokevirtual   #128 <Method void write(String, int, int)>
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
	//    9   13:invokevirtual   #132 <Method char String.charAt(int)>
	//   10   16:invokevirtual   #83  <Method void write(int)>
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
	//*  17   27:getfield        #100 <Field int _surrogate>
	//*  18   30:ifle            60
		{
			k = ((int) (s.charAt(i)));
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:invokevirtual   #132 <Method char String.charAt(int)>
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
	//   30   49:invokevirtual   #118 <Method int convertSurrogate(int)>
	//   31   52:invokevirtual   #83  <Method void write(int)>
			k = i + 1;
	//   32   55:iload_2         
	//   33   56:iconst_1        
	//   34   57:iadd            
	//   35   58:istore          4
		}
		i = _outPtr;
	//   36   60:aload_0         
	//   37   61:getfield        #35  <Field int _outPtr>
	//   38   64:istore_2        
		byte abyte0[] = _outBuffer;
	//   39   65:aload_0         
	//   40   66:getfield        #31  <Field byte[] _outBuffer>
	//   41   69:astore          10
		int j2 = _outBufferEnd;
	//   42   71:aload_0         
	//   43   72:getfield        #33  <Field int _outBufferEnd>
	//   44   75:istore          8
		int k2 = l + k;
	//   45   77:iload           5
	//   46   79:iload           4
	//   47   81:iadd            
	//   48   82:istore          9
		j = k;
	//   49   84:iload           4
	//   50   86:istore_3        
label0:
		do
		{
			k = i;
	//   51   87:iload_2         
	//   52   88:istore          4
			if(j >= k2)
				break;
	//   53   90:iload_3         
	//   54   91:iload           9
	//   55   93:icmpge          547
			k = i;
	//   56   96:iload_2         
	//   57   97:istore          4
			if(i >= j2)
	//*  58   99:iload_2         
	//*  59  100:iload           8
	//*  60  102:icmplt          119
			{
				_out.write(abyte0, 0, i);
	//   61  105:aload_0         
	//   62  106:getfield        #23  <Field OutputStream _out>
	//   63  109:aload           10
	//   64  111:iconst_0        
	//   65  112:iload_2         
	//   66  113:invokevirtual   #92  <Method void OutputStream.write(byte[], int, int)>
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
	//   75  126:invokevirtual   #132 <Method char String.charAt(int)>
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
	//*  85  146:icmpge          251
			{
				i = k + 1;
	//   86  149:iload           4
	//   87  151:iconst_1        
	//   88  152:iadd            
	//   89  153:istore_2        
				abyte0[k] = (byte)c;
	//   90  154:aload           10
	//   91  156:iload           4
	//   92  158:iload           7
	//   93  160:int2byte        
	//   94  161:bastore         
				j = k2 - i1;
	//   95  162:iload           9
	//   96  164:iload           5
	//   97  166:isub            
	//   98  167:istore_3        
				i2 = j2 - i;
	//   99  168:iload           8
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
	//  124  209:invokevirtual   #132 <Method char String.charAt(int)>
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
	//  135  231:goto            251
					}
					abyte0[i] = (byte)c1;
	//  136  234:aload           10
	//  137  236:iload_2         
	//  138  237:iload           7
	//  139  239:int2byte        
	//  140  240:bastore         
					j = i2;
	//  141  241:iload           6
	//  142  243:istore_3        
					i++;
	//  143  244:iload_2         
	//  144  245:iconst_1        
	//  145  246:iadd            
	//  146  247:istore_2        
				} while(true);
	//  147  248:goto            190
			}
			if(i2 < 2048)
	//* 148  251:iload           6
	//* 149  253:sipush          2048
	//* 150  256:icmpge          307
			{
				int j1 = j + 1;
	//  151  259:iload_3         
	//  152  260:iconst_1        
	//  153  261:iadd            
	//  154  262:istore          5
				abyte0[j] = (byte)(i2 >> 6 | 0xc0);
	//  155  264:aload           10
	//  156  266:iload_3         
	//  157  267:iload           6
	//  158  269:bipush          6
	//  159  271:ishr            
	//  160  272:sipush          192
	//  161  275:ior             
	//  162  276:int2byte        
	//  163  277:bastore         
				k = j1 + 1;
	//  164  278:iload           5
	//  165  280:iconst_1        
	//  166  281:iadd            
	//  167  282:istore          4
				abyte0[j1] = (byte)(i2 & 0x3f | 0x80);
	//  168  284:aload           10
	//  169  286:iload           5
	//  170  288:iload           6
	//  171  290:bipush          63
	//  172  292:iand            
	//  173  293:sipush          128
	//  174  296:ior             
	//  175  297:int2byte        
	//  176  298:bastore         
				j = i;
	//  177  299:iload_2         
	//  178  300:istore_3        
				i = k;
	//  179  301:iload           4
	//  180  303:istore_2        
				continue;
	//  181  304:goto            87
			}
			if(i2 >= 55296 && i2 <= 57343)
	//* 182  307:iload           6
	//* 183  309:ldc1            #70  <Int 55296>
	//* 184  311:icmplt          479
	//* 185  314:iload           6
	//* 186  316:ldc1            #106 <Int 57343>
	//* 187  318:icmple          324
	//* 188  321:goto            479
			{
				if(i2 > 56319)
	//* 189  324:iload           6
	//* 190  326:ldc1            #71  <Int 56319>
	//* 191  328:icmple          341
				{
					_outPtr = j;
	//  192  331:aload_0         
	//  193  332:iload_3         
	//  194  333:putfield        #35  <Field int _outPtr>
					illegalSurrogate(i2);
	//  195  336:iload           6
	//  196  338:invokestatic    #102 <Method void illegalSurrogate(int)>
				}
				_surrogate = i2;
	//  197  341:aload_0         
	//  198  342:iload           6
	//  199  344:putfield        #100 <Field int _surrogate>
				if(i >= k2)
	//* 200  347:iload_2         
	//* 201  348:iload           9
	//* 202  350:icmplt          359
				{
					k = j;
	//  203  353:iload_3         
	//  204  354:istore          4
					break;
	//  205  356:goto            547
				}
				k = i + 1;
	//  206  359:iload_2         
	//  207  360:iconst_1        
	//  208  361:iadd            
	//  209  362:istore          4
				int k1 = convertSurrogate(((int) (s.charAt(i))));
	//  210  364:aload_0         
	//  211  365:aload_1         
	//  212  366:iload_2         
	//  213  367:invokevirtual   #132 <Method char String.charAt(int)>
	//  214  370:invokevirtual   #118 <Method int convertSurrogate(int)>
	//  215  373:istore          5
				if(k1 > 0x10ffff)
	//* 216  375:iload           5
	//* 217  377:ldc1            #49  <Int 0x10ffff>
	//* 218  379:icmple          392
				{
					_outPtr = j;
	//  219  382:aload_0         
	//  220  383:iload_3         
	//  221  384:putfield        #35  <Field int _outPtr>
					illegalSurrogate(k1);
	//  222  387:iload           5
	//  223  389:invokestatic    #102 <Method void illegalSurrogate(int)>
				}
				i = j + 1;
	//  224  392:iload_3         
	//  225  393:iconst_1        
	//  226  394:iadd            
	//  227  395:istore_2        
				abyte0[j] = (byte)(k1 >> 18 | 0xf0);
	//  228  396:aload           10
	//  229  398:iload_3         
	//  230  399:iload           5
	//  231  401:bipush          18
	//  232  403:ishr            
	//  233  404:sipush          240
	//  234  407:ior             
	//  235  408:int2byte        
	//  236  409:bastore         
				j = i + 1;
	//  237  410:iload_2         
	//  238  411:iconst_1        
	//  239  412:iadd            
	//  240  413:istore_3        
				abyte0[i] = (byte)(k1 >> 12 & 0x3f | 0x80);
	//  241  414:aload           10
	//  242  416:iload_2         
	//  243  417:iload           5
	//  244  419:bipush          12
	//  245  421:ishr            
	//  246  422:bipush          63
	//  247  424:iand            
	//  248  425:sipush          128
	//  249  428:ior             
	//  250  429:int2byte        
	//  251  430:bastore         
				i2 = j + 1;
	//  252  431:iload_3         
	//  253  432:iconst_1        
	//  254  433:iadd            
	//  255  434:istore          6
				abyte0[j] = (byte)(k1 >> 6 & 0x3f | 0x80);
	//  256  436:aload           10
	//  257  438:iload_3         
	//  258  439:iload           5
	//  259  441:bipush          6
	//  260  443:ishr            
	//  261  444:bipush          63
	//  262  446:iand            
	//  263  447:sipush          128
	//  264  450:ior             
	//  265  451:int2byte        
	//  266  452:bastore         
				i = i2 + 1;
	//  267  453:iload           6
	//  268  455:iconst_1        
	//  269  456:iadd            
	//  270  457:istore_2        
				abyte0[i2] = (byte)(k1 & 0x3f | 0x80);
	//  271  458:aload           10
	//  272  460:iload           6
	//  273  462:iload           5
	//  274  464:bipush          63
	//  275  466:iand            
	//  276  467:sipush          128
	//  277  470:ior             
	//  278  471:int2byte        
	//  279  472:bastore         
				j = k;
	//  280  473:iload           4
	//  281  475:istore_3        
			} else
	//* 282  476:goto            87
			{
				k = j + 1;
	//  283  479:iload_3         
	//  284  480:iconst_1        
	//  285  481:iadd            
	//  286  482:istore          4
				abyte0[j] = (byte)(i2 >> 12 | 0xe0);
	//  287  484:aload           10
	//  288  486:iload_3         
	//  289  487:iload           6
	//  290  489:bipush          12
	//  291  491:ishr            
	//  292  492:sipush          224
	//  293  495:ior             
	//  294  496:int2byte        
	//  295  497:bastore         
				int l1 = k + 1;
	//  296  498:iload           4
	//  297  500:iconst_1        
	//  298  501:iadd            
	//  299  502:istore          5
				abyte0[k] = (byte)(i2 >> 6 & 0x3f | 0x80);
	//  300  504:aload           10
	//  301  506:iload           4
	//  302  508:iload           6
	//  303  510:bipush          6
	//  304  512:ishr            
	//  305  513:bipush          63
	//  306  515:iand            
	//  307  516:sipush          128
	//  308  519:ior             
	//  309  520:int2byte        
	//  310  521:bastore         
				abyte0[l1] = (byte)(i2 & 0x3f | 0x80);
	//  311  522:aload           10
	//  312  524:iload           5
	//  313  526:iload           6
	//  314  528:bipush          63
	//  315  530:iand            
	//  316  531:sipush          128
	//  317  534:ior             
	//  318  535:int2byte        
	//  319  536:bastore         
				j = i;
	//  320  537:iload_2         
	//  321  538:istore_3        
				i = l1 + 1;
	//  322  539:iload           5
	//  323  541:iconst_1        
	//  324  542:iadd            
	//  325  543:istore_2        
			}
		} while(true);
	//  326  544:goto            87
		_outPtr = k;
	//  327  547:aload_0         
	//  328  548:iload           4
	//  329  550:putfield        #35  <Field int _outPtr>
	//  330  553:return          
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
	//    5    5:invokevirtual   #136 <Method void write(char[], int, int)>
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
	//   10   14:invokevirtual   #83  <Method void write(int)>
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
	//*  17   25:getfield        #100 <Field int _surrogate>
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
	//   30   45:invokevirtual   #118 <Method int convertSurrogate(int)>
	//   31   48:invokevirtual   #83  <Method void write(int)>
			k = i + 1;
	//   32   51:iload_2         
	//   33   52:iconst_1        
	//   34   53:iadd            
	//   35   54:istore          4
		}
		i = _outPtr;
	//   36   56:aload_0         
	//   37   57:getfield        #35  <Field int _outPtr>
	//   38   60:istore_2        
		byte abyte0[] = _outBuffer;
	//   39   61:aload_0         
	//   40   62:getfield        #31  <Field byte[] _outBuffer>
	//   41   65:astore          10
		int j2 = _outBufferEnd;
	//   42   67:aload_0         
	//   43   68:getfield        #33  <Field int _outBufferEnd>
	//   44   71:istore          8
		int k2 = l + k;
	//   45   73:iload           5
	//   46   75:iload           4
	//   47   77:iadd            
	//   48   78:istore          9
		j = k;
	//   49   80:iload           4
	//   50   82:istore_3        
label0:
		do
		{
			k = i;
	//   51   83:iload_2         
	//   52   84:istore          4
			if(j >= k2)
				break;
	//   53   86:iload_3         
	//   54   87:iload           9
	//   55   89:icmpge          537
			k = i;
	//   56   92:iload_2         
	//   57   93:istore          4
			if(i >= j2)
	//*  58   95:iload_2         
	//*  59   96:iload           8
	//*  60   98:icmplt          115
			{
				_out.write(abyte0, 0, i);
	//   61  101:aload_0         
	//   62  102:getfield        #23  <Field OutputStream _out>
	//   63  105:aload           10
	//   64  107:iconst_0        
	//   65  108:iload_2         
	//   66  109:invokevirtual   #92  <Method void OutputStream.write(byte[], int, int)>
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
	//*  85  140:icmpge          243
			{
				i = k + 1;
	//   86  143:iload           4
	//   87  145:iconst_1        
	//   88  146:iadd            
	//   89  147:istore_2        
				abyte0[k] = (byte)c;
	//   90  148:aload           10
	//   91  150:iload           4
	//   92  152:iload           7
	//   93  154:int2byte        
	//   94  155:bastore         
				j = k2 - i1;
	//   95  156:iload           9
	//   96  158:iload           5
	//   97  160:isub            
	//   98  161:istore_3        
				i2 = j2 - i;
	//   99  162:iload           8
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
	//  135  223:goto            243
					}
					abyte0[i] = (byte)c1;
	//  136  226:aload           10
	//  137  228:iload_2         
	//  138  229:iload           7
	//  139  231:int2byte        
	//  140  232:bastore         
					j = i2;
	//  141  233:iload           6
	//  142  235:istore_3        
					i++;
	//  143  236:iload_2         
	//  144  237:iconst_1        
	//  145  238:iadd            
	//  146  239:istore_2        
				} while(true);
	//  147  240:goto            184
			}
			if(i2 < 2048)
	//* 148  243:iload           6
	//* 149  245:sipush          2048
	//* 150  248:icmpge          299
			{
				int j1 = j + 1;
	//  151  251:iload_3         
	//  152  252:iconst_1        
	//  153  253:iadd            
	//  154  254:istore          5
				abyte0[j] = (byte)(i2 >> 6 | 0xc0);
	//  155  256:aload           10
	//  156  258:iload_3         
	//  157  259:iload           6
	//  158  261:bipush          6
	//  159  263:ishr            
	//  160  264:sipush          192
	//  161  267:ior             
	//  162  268:int2byte        
	//  163  269:bastore         
				k = j1 + 1;
	//  164  270:iload           5
	//  165  272:iconst_1        
	//  166  273:iadd            
	//  167  274:istore          4
				abyte0[j1] = (byte)(i2 & 0x3f | 0x80);
	//  168  276:aload           10
	//  169  278:iload           5
	//  170  280:iload           6
	//  171  282:bipush          63
	//  172  284:iand            
	//  173  285:sipush          128
	//  174  288:ior             
	//  175  289:int2byte        
	//  176  290:bastore         
				j = i;
	//  177  291:iload_2         
	//  178  292:istore_3        
				i = k;
	//  179  293:iload           4
	//  180  295:istore_2        
				continue;
	//  181  296:goto            83
			}
			if(i2 >= 55296 && i2 <= 57343)
	//* 182  299:iload           6
	//* 183  301:ldc1            #70  <Int 55296>
	//* 184  303:icmplt          469
	//* 185  306:iload           6
	//* 186  308:ldc1            #106 <Int 57343>
	//* 187  310:icmple          316
	//* 188  313:goto            469
			{
				if(i2 > 56319)
	//* 189  316:iload           6
	//* 190  318:ldc1            #71  <Int 56319>
	//* 191  320:icmple          333
				{
					_outPtr = j;
	//  192  323:aload_0         
	//  193  324:iload_3         
	//  194  325:putfield        #35  <Field int _outPtr>
					illegalSurrogate(i2);
	//  195  328:iload           6
	//  196  330:invokestatic    #102 <Method void illegalSurrogate(int)>
				}
				_surrogate = i2;
	//  197  333:aload_0         
	//  198  334:iload           6
	//  199  336:putfield        #100 <Field int _surrogate>
				if(i >= k2)
	//* 200  339:iload_2         
	//* 201  340:iload           9
	//* 202  342:icmplt          351
				{
					k = j;
	//  203  345:iload_3         
	//  204  346:istore          4
					break;
	//  205  348:goto            537
				}
				k = i + 1;
	//  206  351:iload_2         
	//  207  352:iconst_1        
	//  208  353:iadd            
	//  209  354:istore          4
				int k1 = convertSurrogate(((int) (ac[i])));
	//  210  356:aload_0         
	//  211  357:aload_1         
	//  212  358:iload_2         
	//  213  359:caload          
	//  214  360:invokevirtual   #118 <Method int convertSurrogate(int)>
	//  215  363:istore          5
				if(k1 > 0x10ffff)
	//* 216  365:iload           5
	//* 217  367:ldc1            #49  <Int 0x10ffff>
	//* 218  369:icmple          382
				{
					_outPtr = j;
	//  219  372:aload_0         
	//  220  373:iload_3         
	//  221  374:putfield        #35  <Field int _outPtr>
					illegalSurrogate(k1);
	//  222  377:iload           5
	//  223  379:invokestatic    #102 <Method void illegalSurrogate(int)>
				}
				i = j + 1;
	//  224  382:iload_3         
	//  225  383:iconst_1        
	//  226  384:iadd            
	//  227  385:istore_2        
				abyte0[j] = (byte)(k1 >> 18 | 0xf0);
	//  228  386:aload           10
	//  229  388:iload_3         
	//  230  389:iload           5
	//  231  391:bipush          18
	//  232  393:ishr            
	//  233  394:sipush          240
	//  234  397:ior             
	//  235  398:int2byte        
	//  236  399:bastore         
				j = i + 1;
	//  237  400:iload_2         
	//  238  401:iconst_1        
	//  239  402:iadd            
	//  240  403:istore_3        
				abyte0[i] = (byte)(k1 >> 12 & 0x3f | 0x80);
	//  241  404:aload           10
	//  242  406:iload_2         
	//  243  407:iload           5
	//  244  409:bipush          12
	//  245  411:ishr            
	//  246  412:bipush          63
	//  247  414:iand            
	//  248  415:sipush          128
	//  249  418:ior             
	//  250  419:int2byte        
	//  251  420:bastore         
				i2 = j + 1;
	//  252  421:iload_3         
	//  253  422:iconst_1        
	//  254  423:iadd            
	//  255  424:istore          6
				abyte0[j] = (byte)(k1 >> 6 & 0x3f | 0x80);
	//  256  426:aload           10
	//  257  428:iload_3         
	//  258  429:iload           5
	//  259  431:bipush          6
	//  260  433:ishr            
	//  261  434:bipush          63
	//  262  436:iand            
	//  263  437:sipush          128
	//  264  440:ior             
	//  265  441:int2byte        
	//  266  442:bastore         
				i = i2 + 1;
	//  267  443:iload           6
	//  268  445:iconst_1        
	//  269  446:iadd            
	//  270  447:istore_2        
				abyte0[i2] = (byte)(k1 & 0x3f | 0x80);
	//  271  448:aload           10
	//  272  450:iload           6
	//  273  452:iload           5
	//  274  454:bipush          63
	//  275  456:iand            
	//  276  457:sipush          128
	//  277  460:ior             
	//  278  461:int2byte        
	//  279  462:bastore         
				j = k;
	//  280  463:iload           4
	//  281  465:istore_3        
			} else
	//* 282  466:goto            83
			{
				k = j + 1;
	//  283  469:iload_3         
	//  284  470:iconst_1        
	//  285  471:iadd            
	//  286  472:istore          4
				abyte0[j] = (byte)(i2 >> 12 | 0xe0);
	//  287  474:aload           10
	//  288  476:iload_3         
	//  289  477:iload           6
	//  290  479:bipush          12
	//  291  481:ishr            
	//  292  482:sipush          224
	//  293  485:ior             
	//  294  486:int2byte        
	//  295  487:bastore         
				int l1 = k + 1;
	//  296  488:iload           4
	//  297  490:iconst_1        
	//  298  491:iadd            
	//  299  492:istore          5
				abyte0[k] = (byte)(i2 >> 6 & 0x3f | 0x80);
	//  300  494:aload           10
	//  301  496:iload           4
	//  302  498:iload           6
	//  303  500:bipush          6
	//  304  502:ishr            
	//  305  503:bipush          63
	//  306  505:iand            
	//  307  506:sipush          128
	//  308  509:ior             
	//  309  510:int2byte        
	//  310  511:bastore         
				abyte0[l1] = (byte)(i2 & 0x3f | 0x80);
	//  311  512:aload           10
	//  312  514:iload           5
	//  313  516:iload           6
	//  314  518:bipush          63
	//  315  520:iand            
	//  316  521:sipush          128
	//  317  524:ior             
	//  318  525:int2byte        
	//  319  526:bastore         
				j = i;
	//  320  527:iload_2         
	//  321  528:istore_3        
				i = l1 + 1;
	//  322  529:iload           5
	//  323  531:iconst_1        
	//  324  532:iadd            
	//  325  533:istore_2        
			}
		} while(true);
	//  326  534:goto            83
		_outPtr = k;
	//  327  537:aload_0         
	//  328  538:iload           4
	//  329  540:putfield        #35  <Field int _outPtr>
	//  330  543:return          
	}

	private final IOContext _context;
	private OutputStream _out;
	private byte _outBuffer[];
	private final int _outBufferEnd;
	private int _outPtr;
	private int _surrogate;
}
