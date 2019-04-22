// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.*;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import java.io.*;

// Referenced classes of package com.fasterxml.jackson.core.json:
//			UTF8StreamJsonParser, ReaderBasedJsonParser

public final class ByteSourceJsonBootstrapper
{

	public ByteSourceJsonBootstrapper(IOContext iocontext, InputStream inputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		_bigEndian = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #24  <Field boolean _bigEndian>
		_context = iocontext;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #26  <Field IOContext _context>
		_in = inputstream;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #28  <Field InputStream _in>
		_inputBuffer = iocontext.allocReadIOBuffer();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #34  <Method byte[] IOContext.allocReadIOBuffer()>
	//   14   24:putfield        #36  <Field byte[] _inputBuffer>
		_inputPtr = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #38  <Field int _inputPtr>
		_inputEnd = 0;
	//   18   32:aload_0         
	//   19   33:iconst_0        
	//   20   34:putfield        #40  <Field int _inputEnd>
		_bufferRecyclable = true;
	//   21   37:aload_0         
	//   22   38:iconst_1        
	//   23   39:putfield        #42  <Field boolean _bufferRecyclable>
	//   24   42:return          
	}

	public ByteSourceJsonBootstrapper(IOContext iocontext, byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		_bigEndian = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #24  <Field boolean _bigEndian>
		_context = iocontext;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #26  <Field IOContext _context>
		_in = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #28  <Field InputStream _in>
		_inputBuffer = abyte0;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #36  <Field byte[] _inputBuffer>
		_inputPtr = i;
	//   14   24:aload_0         
	//   15   25:iload_3         
	//   16   26:putfield        #38  <Field int _inputPtr>
		_inputEnd = i + j;
	//   17   29:aload_0         
	//   18   30:iload_3         
	//   19   31:iload           4
	//   20   33:iadd            
	//   21   34:putfield        #40  <Field int _inputEnd>
		_bufferRecyclable = false;
	//   22   37:aload_0         
	//   23   38:iconst_0        
	//   24   39:putfield        #42  <Field boolean _bufferRecyclable>
	//   25   42:return          
	}

	private boolean checkUTF16(int i)
	{
label0:
		{
			if((0xff00 & i) == 0)
	//*   0    0:ldc1            #47  <Int 65280>
	//*   1    2:iload_1         
	//*   2    3:iand            
	//*   3    4:ifne            15
			{
				_bigEndian = true;
	//    4    7:aload_0         
	//    5    8:iconst_1        
	//    6    9:putfield        #24  <Field boolean _bigEndian>
			} else
	//*   7   12:goto            28
			{
				if((i & 0xff) != 0)
					break label0;
	//    8   15:iload_1         
	//    9   16:sipush          255
	//   10   19:iand            
	//   11   20:ifne            35
				_bigEndian = false;
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:putfield        #24  <Field boolean _bigEndian>
			}
			_bytesPerChar = 2;
	//   15   28:aload_0         
	//   16   29:iconst_2        
	//   17   30:putfield        #49  <Field int _bytesPerChar>
			return true;
	//   18   33:iconst_1        
	//   19   34:ireturn         
		}
		return false;
	//   20   35:iconst_0        
	//   21   36:ireturn         
	}

	private boolean checkUTF32(int i)
		throws IOException
	{
label0:
		{
			if(i >> 8 == 0)
	//*   0    0:iload_1         
	//*   1    1:bipush          8
	//*   2    3:ishr            
	//*   3    4:ifne            15
				_bigEndian = true;
	//    4    7:aload_0         
	//    5    8:iconst_1        
	//    6    9:putfield        #24  <Field boolean _bigEndian>
			else
	//*   7   12:goto            59
			if((0xffffff & i) == 0)
	//*   8   15:ldc1            #53  <Int 0xffffff>
	//*   9   17:iload_1         
	//*  10   18:iand            
	//*  11   19:ifne            30
				_bigEndian = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #24  <Field boolean _bigEndian>
			else
	//*  15   27:goto            59
			if((0xff00ffff & i) == 0)
	//*  16   30:ldc1            #54  <Int 0xff00ffff>
	//*  17   32:iload_1         
	//*  18   33:iand            
	//*  19   34:ifne            46
			{
				reportWeirdUCS4("3412");
	//   20   37:aload_0         
	//   21   38:ldc1            #56  <String "3412">
	//   22   40:invokespecial   #60  <Method void reportWeirdUCS4(String)>
			} else
	//*  23   43:goto            59
			{
				if((i & 0xffff00ff) != 0)
					break label0;
	//   24   46:iload_1         
	//   25   47:ldc1            #61  <Int -65281>
	//   26   49:iand            
	//   27   50:ifne            66
				reportWeirdUCS4("2143");
	//   28   53:aload_0         
	//   29   54:ldc1            #63  <String "2143">
	//   30   56:invokespecial   #60  <Method void reportWeirdUCS4(String)>
			}
			_bytesPerChar = 4;
	//   31   59:aload_0         
	//   32   60:iconst_4        
	//   33   61:putfield        #49  <Field int _bytesPerChar>
			return true;
	//   34   64:iconst_1        
	//   35   65:ireturn         
		}
		return false;
	//   36   66:iconst_0        
	//   37   67:ireturn         
	}

	private boolean handleBOM(int i)
		throws IOException
	{
		if(i != 0xfeff0000)
	//*   0    0:iload_1         
	//*   1    1:ldc1            #66  <Int 0xfeff0000>
	//*   2    3:icmpeq          80
		{
			if(i != 0xfffe0000)
	//*   3    6:iload_1         
	//*   4    7:ldc1            #67  <Int 0xfffe0000>
	//*   5    9:icmpeq          58
			{
				if(i != 65279)
	//*   6   12:iload_1         
	//*   7   13:ldc1            #68  <Int 65279>
	//*   8   15:icmpeq          36
				{
					if(i == 65534)
	//*   9   18:iload_1         
	//*  10   19:ldc1            #69  <Int 65534>
	//*  11   21:icmpeq          27
	//*  12   24:goto            86
						reportWeirdUCS4("2143");
	//   13   27:aload_0         
	//   14   28:ldc1            #63  <String "2143">
	//   15   30:invokespecial   #60  <Method void reportWeirdUCS4(String)>
				} else
	//*  16   33:goto            86
				{
					_bigEndian = true;
	//   17   36:aload_0         
	//   18   37:iconst_1        
	//   19   38:putfield        #24  <Field boolean _bigEndian>
					_inputPtr = _inputPtr + 4;
	//   20   41:aload_0         
	//   21   42:aload_0         
	//   22   43:getfield        #38  <Field int _inputPtr>
	//   23   46:iconst_4        
	//   24   47:iadd            
	//   25   48:putfield        #38  <Field int _inputPtr>
					_bytesPerChar = 4;
	//   26   51:aload_0         
	//   27   52:iconst_4        
	//   28   53:putfield        #49  <Field int _bytesPerChar>
					return true;
	//   29   56:iconst_1        
	//   30   57:ireturn         
				}
			} else
			{
				_inputPtr = _inputPtr + 4;
	//   31   58:aload_0         
	//   32   59:aload_0         
	//   33   60:getfield        #38  <Field int _inputPtr>
	//   34   63:iconst_4        
	//   35   64:iadd            
	//   36   65:putfield        #38  <Field int _inputPtr>
				_bytesPerChar = 4;
	//   37   68:aload_0         
	//   38   69:iconst_4        
	//   39   70:putfield        #49  <Field int _bytesPerChar>
				_bigEndian = false;
	//   40   73:aload_0         
	//   41   74:iconst_0        
	//   42   75:putfield        #24  <Field boolean _bigEndian>
				return true;
	//   43   78:iconst_1        
	//   44   79:ireturn         
			}
		} else
		{
			reportWeirdUCS4("3412");
	//   45   80:aload_0         
	//   46   81:ldc1            #56  <String "3412">
	//   47   83:invokespecial   #60  <Method void reportWeirdUCS4(String)>
		}
		int j = i >>> 16;
	//   48   86:iload_1         
	//   49   87:bipush          16
	//   50   89:iushr           
	//   51   90:istore_2        
		if(j == 65279)
	//*  52   91:iload_2         
	//*  53   92:ldc1            #68  <Int 65279>
	//*  54   94:icmpne          119
		{
			_inputPtr = _inputPtr + 2;
	//   55   97:aload_0         
	//   56   98:aload_0         
	//   57   99:getfield        #38  <Field int _inputPtr>
	//   58  102:iconst_2        
	//   59  103:iadd            
	//   60  104:putfield        #38  <Field int _inputPtr>
			_bytesPerChar = 2;
	//   61  107:aload_0         
	//   62  108:iconst_2        
	//   63  109:putfield        #49  <Field int _bytesPerChar>
			_bigEndian = true;
	//   64  112:aload_0         
	//   65  113:iconst_1        
	//   66  114:putfield        #24  <Field boolean _bigEndian>
			return true;
	//   67  117:iconst_1        
	//   68  118:ireturn         
		}
		if(j == 65534)
	//*  69  119:iload_2         
	//*  70  120:ldc1            #69  <Int 65534>
	//*  71  122:icmpne          147
		{
			_inputPtr = _inputPtr + 2;
	//   72  125:aload_0         
	//   73  126:aload_0         
	//   74  127:getfield        #38  <Field int _inputPtr>
	//   75  130:iconst_2        
	//   76  131:iadd            
	//   77  132:putfield        #38  <Field int _inputPtr>
			_bytesPerChar = 2;
	//   78  135:aload_0         
	//   79  136:iconst_2        
	//   80  137:putfield        #49  <Field int _bytesPerChar>
			_bigEndian = false;
	//   81  140:aload_0         
	//   82  141:iconst_0        
	//   83  142:putfield        #24  <Field boolean _bigEndian>
			return true;
	//   84  145:iconst_1        
	//   85  146:ireturn         
		}
		if(i >>> 8 == 0xefbbbf)
	//*  86  147:iload_1         
	//*  87  148:bipush          8
	//*  88  150:iushr           
	//*  89  151:ldc1            #70  <Int 0xefbbbf>
	//*  90  153:icmpne          178
		{
			_inputPtr = _inputPtr + 3;
	//   91  156:aload_0         
	//   92  157:aload_0         
	//   93  158:getfield        #38  <Field int _inputPtr>
	//   94  161:iconst_3        
	//   95  162:iadd            
	//   96  163:putfield        #38  <Field int _inputPtr>
			_bytesPerChar = 1;
	//   97  166:aload_0         
	//   98  167:iconst_1        
	//   99  168:putfield        #49  <Field int _bytesPerChar>
			_bigEndian = true;
	//  100  171:aload_0         
	//  101  172:iconst_1        
	//  102  173:putfield        #24  <Field boolean _bigEndian>
			return true;
	//  103  176:iconst_1        
	//  104  177:ireturn         
		} else
		{
			return false;
	//  105  178:iconst_0        
	//  106  179:ireturn         
		}
	}

	public static MatchStrength hasJSONFormat(InputAccessor inputaccessor)
		throws IOException
	{
		if(!inputaccessor.hasMoreBytes())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #78  <Method boolean InputAccessor.hasMoreBytes()>
	//*   2    6:ifne            13
			return MatchStrength.INCONCLUSIVE;
	//    3    9:getstatic       #84  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//    4   12:areturn         
		byte byte1 = inputaccessor.nextByte();
	//    5   13:aload_0         
	//    6   14:invokeinterface #88  <Method byte InputAccessor.nextByte()>
	//    7   19:istore_2        
		byte byte0 = byte1;
	//    8   20:iload_2         
	//    9   21:istore_1        
		if(byte1 == -17)
	//*  10   22:iload_2         
	//*  11   23:bipush          -17
	//*  12   25:icmpne          104
		{
			if(!inputaccessor.hasMoreBytes())
	//*  13   28:aload_0         
	//*  14   29:invokeinterface #78  <Method boolean InputAccessor.hasMoreBytes()>
	//*  15   34:ifne            41
				return MatchStrength.INCONCLUSIVE;
	//   16   37:getstatic       #84  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   17   40:areturn         
			if(inputaccessor.nextByte() != -69)
	//*  18   41:aload_0         
	//*  19   42:invokeinterface #88  <Method byte InputAccessor.nextByte()>
	//*  20   47:bipush          -69
	//*  21   49:icmpeq          56
				return MatchStrength.NO_MATCH;
	//   22   52:getstatic       #91  <Field MatchStrength MatchStrength.NO_MATCH>
	//   23   55:areturn         
			if(!inputaccessor.hasMoreBytes())
	//*  24   56:aload_0         
	//*  25   57:invokeinterface #78  <Method boolean InputAccessor.hasMoreBytes()>
	//*  26   62:ifne            69
				return MatchStrength.INCONCLUSIVE;
	//   27   65:getstatic       #84  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   28   68:areturn         
			if(inputaccessor.nextByte() != -65)
	//*  29   69:aload_0         
	//*  30   70:invokeinterface #88  <Method byte InputAccessor.nextByte()>
	//*  31   75:bipush          -65
	//*  32   77:icmpeq          84
				return MatchStrength.NO_MATCH;
	//   33   80:getstatic       #91  <Field MatchStrength MatchStrength.NO_MATCH>
	//   34   83:areturn         
			if(!inputaccessor.hasMoreBytes())
	//*  35   84:aload_0         
	//*  36   85:invokeinterface #78  <Method boolean InputAccessor.hasMoreBytes()>
	//*  37   90:ifne            97
				return MatchStrength.INCONCLUSIVE;
	//   38   93:getstatic       #84  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   39   96:areturn         
			byte0 = inputaccessor.nextByte();
	//   40   97:aload_0         
	//   41   98:invokeinterface #88  <Method byte InputAccessor.nextByte()>
	//   42  103:istore_1        
		}
		int i = skipSpace(inputaccessor, byte0);
	//   43  104:aload_0         
	//   44  105:iload_1         
	//   45  106:invokestatic    #95  <Method int skipSpace(InputAccessor, byte)>
	//   46  109:istore_3        
		if(i < 0)
	//*  47  110:iload_3         
	//*  48  111:ifge            118
			return MatchStrength.INCONCLUSIVE;
	//   49  114:getstatic       #84  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   50  117:areturn         
		if(i == 123)
	//*  51  118:iload_3         
	//*  52  119:bipush          123
	//*  53  121:icmpne          160
		{
			i = skipSpace(inputaccessor);
	//   54  124:aload_0         
	//   55  125:invokestatic    #98  <Method int skipSpace(InputAccessor)>
	//   56  128:istore_3        
			if(i < 0)
	//*  57  129:iload_3         
	//*  58  130:ifge            137
				return MatchStrength.INCONCLUSIVE;
	//   59  133:getstatic       #84  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   60  136:areturn         
			if(i != 34 && i != 125)
	//*  61  137:iload_3         
	//*  62  138:bipush          34
	//*  63  140:icmpeq          156
	//*  64  143:iload_3         
	//*  65  144:bipush          125
	//*  66  146:icmpne          152
	//*  67  149:goto            156
				return MatchStrength.NO_MATCH;
	//   68  152:getstatic       #91  <Field MatchStrength MatchStrength.NO_MATCH>
	//   69  155:areturn         
			else
				return MatchStrength.SOLID_MATCH;
	//   70  156:getstatic       #101 <Field MatchStrength MatchStrength.SOLID_MATCH>
	//   71  159:areturn         
		}
		if(i == 91)
	//*  72  160:iload_3         
	//*  73  161:bipush          91
	//*  74  163:icmpne          202
		{
			i = skipSpace(inputaccessor);
	//   75  166:aload_0         
	//   76  167:invokestatic    #98  <Method int skipSpace(InputAccessor)>
	//   77  170:istore_3        
			if(i < 0)
	//*  78  171:iload_3         
	//*  79  172:ifge            179
				return MatchStrength.INCONCLUSIVE;
	//   80  175:getstatic       #84  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   81  178:areturn         
			if(i != 93 && i != 91)
	//*  82  179:iload_3         
	//*  83  180:bipush          93
	//*  84  182:icmpeq          198
	//*  85  185:iload_3         
	//*  86  186:bipush          91
	//*  87  188:icmpne          194
	//*  88  191:goto            198
				return MatchStrength.SOLID_MATCH;
	//   89  194:getstatic       #101 <Field MatchStrength MatchStrength.SOLID_MATCH>
	//   90  197:areturn         
			else
				return MatchStrength.SOLID_MATCH;
	//   91  198:getstatic       #101 <Field MatchStrength MatchStrength.SOLID_MATCH>
	//   92  201:areturn         
		}
		MatchStrength matchstrength = MatchStrength.WEAK_MATCH;
	//   93  202:getstatic       #104 <Field MatchStrength MatchStrength.WEAK_MATCH>
	//   94  205:astore          4
		if(i == 34)
	//*  95  207:iload_3         
	//*  96  208:bipush          34
	//*  97  210:icmpne          216
			return matchstrength;
	//   98  213:aload           4
	//   99  215:areturn         
		if(i <= 57 && i >= 48)
	//* 100  216:iload_3         
	//* 101  217:bipush          57
	//* 102  219:icmpgt          231
	//* 103  222:iload_3         
	//* 104  223:bipush          48
	//* 105  225:icmplt          231
			return matchstrength;
	//  106  228:aload           4
	//  107  230:areturn         
		if(i == 45)
	//* 108  231:iload_3         
	//* 109  232:bipush          45
	//* 110  234:icmpne          269
		{
			i = skipSpace(inputaccessor);
	//  111  237:aload_0         
	//  112  238:invokestatic    #98  <Method int skipSpace(InputAccessor)>
	//  113  241:istore_3        
			if(i < 0)
	//* 114  242:iload_3         
	//* 115  243:ifge            250
				return MatchStrength.INCONCLUSIVE;
	//  116  246:getstatic       #84  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//  117  249:areturn         
			if(i <= 57 && i >= 48)
	//* 118  250:iload_3         
	//* 119  251:bipush          57
	//* 120  253:icmpgt          265
	//* 121  256:iload_3         
	//* 122  257:bipush          48
	//* 123  259:icmplt          265
				return matchstrength;
	//  124  262:aload           4
	//  125  264:areturn         
			else
				return MatchStrength.NO_MATCH;
	//  126  265:getstatic       #91  <Field MatchStrength MatchStrength.NO_MATCH>
	//  127  268:areturn         
		}
		if(i == 110)
	//* 128  269:iload_3         
	//* 129  270:bipush          110
	//* 130  272:icmpne          284
			return tryMatch(inputaccessor, "ull", matchstrength);
	//  131  275:aload_0         
	//  132  276:ldc1            #106 <String "ull">
	//  133  278:aload           4
	//  134  280:invokestatic    #110 <Method MatchStrength tryMatch(InputAccessor, String, MatchStrength)>
	//  135  283:areturn         
		if(i == 116)
	//* 136  284:iload_3         
	//* 137  285:bipush          116
	//* 138  287:icmpne          299
			return tryMatch(inputaccessor, "rue", matchstrength);
	//  139  290:aload_0         
	//  140  291:ldc1            #112 <String "rue">
	//  141  293:aload           4
	//  142  295:invokestatic    #110 <Method MatchStrength tryMatch(InputAccessor, String, MatchStrength)>
	//  143  298:areturn         
		if(i == 102)
	//* 144  299:iload_3         
	//* 145  300:bipush          102
	//* 146  302:icmpne          314
			return tryMatch(inputaccessor, "alse", matchstrength);
	//  147  305:aload_0         
	//  148  306:ldc1            #114 <String "alse">
	//  149  308:aload           4
	//  150  310:invokestatic    #110 <Method MatchStrength tryMatch(InputAccessor, String, MatchStrength)>
	//  151  313:areturn         
		else
			return MatchStrength.NO_MATCH;
	//  152  314:getstatic       #91  <Field MatchStrength MatchStrength.NO_MATCH>
	//  153  317:areturn         
	}

	private void reportWeirdUCS4(String s)
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #116 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #117 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Unsupported UCS-4 endianness (");
	//    4    8:aload_2         
	//    5    9:ldc1            #119 <String "Unsupported UCS-4 endianness (">
	//    6   11:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(") detected");
	//   12   21:aload_2         
	//   13   22:ldc1            #125 <String ") detected">
	//   14   24:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		throw new CharConversionException(stringbuilder.toString());
	//   16   28:new             #127 <Class CharConversionException>
	//   17   31:dup             
	//   18   32:aload_2         
	//   19   33:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   20   36:invokespecial   #133 <Method void CharConversionException(String)>
	//   21   39:athrow          
	}

	private static int skipSpace(InputAccessor inputaccessor)
		throws IOException
	{
		if(!inputaccessor.hasMoreBytes())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #78  <Method boolean InputAccessor.hasMoreBytes()>
	//*   2    6:ifne            11
			return -1;
	//    3    9:iconst_m1       
	//    4   10:ireturn         
		else
			return skipSpace(inputaccessor, inputaccessor.nextByte());
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokeinterface #88  <Method byte InputAccessor.nextByte()>
	//    8   18:invokestatic    #95  <Method int skipSpace(InputAccessor, byte)>
	//    9   21:ireturn         
	}

	private static int skipSpace(InputAccessor inputaccessor, byte byte0)
		throws IOException
	{
		do
		{
			byte0 &= 0xff;
	//    0    0:iload_1         
	//    1    1:sipush          255
	//    2    4:iand            
	//    3    5:istore_1        
			if(byte0 != 32 && byte0 != 13 && byte0 != 10 && byte0 != 9)
	//*   4    6:iload_1         
	//*   5    7:bipush          32
	//*   6    9:icmpeq          32
	//*   7   12:iload_1         
	//*   8   13:bipush          13
	//*   9   15:icmpeq          32
	//*  10   18:iload_1         
	//*  11   19:bipush          10
	//*  12   21:icmpeq          32
	//*  13   24:iload_1         
	//*  14   25:bipush          9
	//*  15   27:icmpeq          32
				return ((int) (byte0));
	//   16   30:iload_1         
	//   17   31:ireturn         
			if(!inputaccessor.hasMoreBytes())
	//*  18   32:aload_0         
	//*  19   33:invokeinterface #78  <Method boolean InputAccessor.hasMoreBytes()>
	//*  20   38:ifne            43
				return -1;
	//   21   41:iconst_m1       
	//   22   42:ireturn         
			byte0 = inputaccessor.nextByte();
	//   23   43:aload_0         
	//   24   44:invokeinterface #88  <Method byte InputAccessor.nextByte()>
	//   25   49:istore_1        
		} while(true);
	//   26   50:goto            0
	}

	private static MatchStrength tryMatch(InputAccessor inputaccessor, String s, MatchStrength matchstrength)
		throws IOException
	{
		int j = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #139 <Method int String.length()>
	//    2    4:istore          4
		for(int i = 0; i < j; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          52
		{
			if(!inputaccessor.hasMoreBytes())
	//*   8   14:aload_0         
	//*   9   15:invokeinterface #78  <Method boolean InputAccessor.hasMoreBytes()>
	//*  10   20:ifne            27
				return MatchStrength.INCONCLUSIVE;
	//   11   23:getstatic       #84  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   12   26:areturn         
			if(inputaccessor.nextByte() != s.charAt(i))
	//*  13   27:aload_0         
	//*  14   28:invokeinterface #88  <Method byte InputAccessor.nextByte()>
	//*  15   33:aload_1         
	//*  16   34:iload_3         
	//*  17   35:invokevirtual   #143 <Method char String.charAt(int)>
	//*  18   38:icmpeq          45
				return MatchStrength.NO_MATCH;
	//   19   41:getstatic       #91  <Field MatchStrength MatchStrength.NO_MATCH>
	//   20   44:areturn         
		}

	//   21   45:iload_3         
	//   22   46:iconst_1        
	//   23   47:iadd            
	//   24   48:istore_3        
	//*  25   49:goto            8
		return matchstrength;
	//   26   52:aload_2         
	//   27   53:areturn         
	}

	public JsonParser constructParser(int i, ObjectCodec objectcodec, ByteQuadsCanonicalizer bytequadscanonicalizer, CharsToNameCanonicalizer charstonamecanonicalizer, int j)
		throws IOException
	{
		if(detectEncoding() == JsonEncoding.UTF8 && com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(j))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #149 <Method JsonEncoding detectEncoding()>
	//*   2    4:getstatic       #155 <Field JsonEncoding JsonEncoding.UTF8>
	//*   3    7:if_acmpne       63
	//*   4   10:getstatic       #161 <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.CANONICALIZE_FIELD_NAMES>
	//*   5   13:iload           5
	//*   6   15:invokevirtual   #164 <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//*   7   18:ifeq            63
		{
			bytequadscanonicalizer = bytequadscanonicalizer.makeChild(j);
	//    8   21:aload_3         
	//    9   22:iload           5
	//   10   24:invokevirtual   #170 <Method ByteQuadsCanonicalizer ByteQuadsCanonicalizer.makeChild(int)>
	//   11   27:astore_3        
			return ((JsonParser) (new UTF8StreamJsonParser(_context, i, _in, objectcodec, bytequadscanonicalizer, _inputBuffer, _inputPtr, _inputEnd, _bufferRecyclable)));
	//   12   28:new             #172 <Class UTF8StreamJsonParser>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:getfield        #26  <Field IOContext _context>
	//   16   36:iload_1         
	//   17   37:aload_0         
	//   18   38:getfield        #28  <Field InputStream _in>
	//   19   41:aload_2         
	//   20   42:aload_3         
	//   21   43:aload_0         
	//   22   44:getfield        #36  <Field byte[] _inputBuffer>
	//   23   47:aload_0         
	//   24   48:getfield        #38  <Field int _inputPtr>
	//   25   51:aload_0         
	//   26   52:getfield        #40  <Field int _inputEnd>
	//   27   55:aload_0         
	//   28   56:getfield        #42  <Field boolean _bufferRecyclable>
	//   29   59:invokespecial   #175 <Method void UTF8StreamJsonParser(IOContext, int, InputStream, ObjectCodec, ByteQuadsCanonicalizer, byte[], int, int, boolean)>
	//   30   62:areturn         
		} else
		{
			return ((JsonParser) (new ReaderBasedJsonParser(_context, i, constructReader(), objectcodec, charstonamecanonicalizer.makeChild(j))));
	//   31   63:new             #177 <Class ReaderBasedJsonParser>
	//   32   66:dup             
	//   33   67:aload_0         
	//   34   68:getfield        #26  <Field IOContext _context>
	//   35   71:iload_1         
	//   36   72:aload_0         
	//   37   73:invokevirtual   #181 <Method Reader constructReader()>
	//   38   76:aload_2         
	//   39   77:aload           4
	//   40   79:iload           5
	//   41   81:invokevirtual   #186 <Method CharsToNameCanonicalizer CharsToNameCanonicalizer.makeChild(int)>
	//   42   84:invokespecial   #189 <Method void ReaderBasedJsonParser(IOContext, int, Reader, ObjectCodec, CharsToNameCanonicalizer)>
	//   43   87:areturn         
		}
	}

	public Reader constructReader()
		throws IOException
	{
		JsonEncoding jsonencoding = _context.getEncoding();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IOContext _context>
	//    2    4:invokevirtual   #192 <Method JsonEncoding IOContext.getEncoding()>
	//    3    7:astore          5
		int i = jsonencoding.bits();
	//    4    9:aload           5
	//    5   11:invokevirtual   #195 <Method int JsonEncoding.bits()>
	//    6   14:istore_1        
		if(i != 8 && i != 16)
	//*   7   15:iload_1         
	//*   8   16:bipush          8
	//*   9   18:icmpeq          80
	//*  10   21:iload_1         
	//*  11   22:bipush          16
	//*  12   24:icmpeq          80
			if(i == 32)
	//*  13   27:iload_1         
	//*  14   28:bipush          32
	//*  15   30:icmpne          70
			{
				IOContext iocontext = _context;
	//   16   33:aload_0         
	//   17   34:getfield        #26  <Field IOContext _context>
	//   18   37:astore_3        
				return ((Reader) (new UTF32Reader(iocontext, _in, _inputBuffer, _inputPtr, _inputEnd, iocontext.getEncoding().isBigEndian())));
	//   19   38:new             #197 <Class UTF32Reader>
	//   20   41:dup             
	//   21   42:aload_3         
	//   22   43:aload_0         
	//   23   44:getfield        #28  <Field InputStream _in>
	//   24   47:aload_0         
	//   25   48:getfield        #36  <Field byte[] _inputBuffer>
	//   26   51:aload_0         
	//   27   52:getfield        #38  <Field int _inputPtr>
	//   28   55:aload_0         
	//   29   56:getfield        #40  <Field int _inputEnd>
	//   30   59:aload_3         
	//   31   60:invokevirtual   #192 <Method JsonEncoding IOContext.getEncoding()>
	//   32   63:invokevirtual   #200 <Method boolean JsonEncoding.isBigEndian()>
	//   33   66:invokespecial   #203 <Method void UTF32Reader(IOContext, InputStream, byte[], int, int, boolean)>
	//   34   69:areturn         
			} else
			{
				throw new RuntimeException("Internal error");
	//   35   70:new             #205 <Class RuntimeException>
	//   36   73:dup             
	//   37   74:ldc1            #207 <String "Internal error">
	//   38   76:invokespecial   #208 <Method void RuntimeException(String)>
	//   39   79:athrow          
			}
		InputStream inputstream = _in;
	//   40   80:aload_0         
	//   41   81:getfield        #28  <Field InputStream _in>
	//   42   84:astore          4
		Object obj;
		if(inputstream == null)
	//*  43   86:aload           4
	//*  44   88:ifnonnull       114
		{
			obj = ((Object) (new ByteArrayInputStream(_inputBuffer, _inputPtr, _inputEnd)));
	//   45   91:new             #210 <Class ByteArrayInputStream>
	//   46   94:dup             
	//   47   95:aload_0         
	//   48   96:getfield        #36  <Field byte[] _inputBuffer>
	//   49   99:aload_0         
	//   50  100:getfield        #38  <Field int _inputPtr>
	//   51  103:aload_0         
	//   52  104:getfield        #40  <Field int _inputEnd>
	//   53  107:invokespecial   #213 <Method void ByteArrayInputStream(byte[], int, int)>
	//   54  110:astore_3        
		} else
	//*  55  111:goto            152
		{
			int j = _inputPtr;
	//   56  114:aload_0         
	//   57  115:getfield        #38  <Field int _inputPtr>
	//   58  118:istore_1        
			int k = _inputEnd;
	//   59  119:aload_0         
	//   60  120:getfield        #40  <Field int _inputEnd>
	//   61  123:istore_2        
			obj = ((Object) (inputstream));
	//   62  124:aload           4
	//   63  126:astore_3        
			if(j < k)
	//*  64  127:iload_1         
	//*  65  128:iload_2         
	//*  66  129:icmpge          152
				obj = ((Object) (new MergedStream(_context, inputstream, _inputBuffer, j, k)));
	//   67  132:new             #215 <Class MergedStream>
	//   68  135:dup             
	//   69  136:aload_0         
	//   70  137:getfield        #26  <Field IOContext _context>
	//   71  140:aload           4
	//   72  142:aload_0         
	//   73  143:getfield        #36  <Field byte[] _inputBuffer>
	//   74  146:iload_1         
	//   75  147:iload_2         
	//   76  148:invokespecial   #218 <Method void MergedStream(IOContext, InputStream, byte[], int, int)>
	//   77  151:astore_3        
		}
		return ((Reader) (new InputStreamReader(((InputStream) (obj)), jsonencoding.getJavaName())));
	//   78  152:new             #220 <Class InputStreamReader>
	//   79  155:dup             
	//   80  156:aload_3         
	//   81  157:aload           5
	//   82  159:invokevirtual   #223 <Method String JsonEncoding.getJavaName()>
	//   83  162:invokespecial   #226 <Method void InputStreamReader(InputStream, String)>
	//   84  165:areturn         
	}

	public JsonEncoding detectEncoding()
		throws IOException
	{
		boolean flag;
label0:
		{
			boolean flag1 = ensureLoaded(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #229 <Method boolean ensureLoaded(int)>
	//    3    5:istore          6
			flag = true;
	//    4    7:iconst_1        
	//    5    8:istore_1        
			if(flag1)
	//*   6    9:iload           6
	//*   7   11:ifeq            123
			{
				byte abyte0[] = _inputBuffer;
	//    8   14:aload_0         
	//    9   15:getfield        #36  <Field byte[] _inputBuffer>
	//   10   18:astore          7
				int j = _inputPtr;
	//   11   20:aload_0         
	//   12   21:getfield        #38  <Field int _inputPtr>
	//   13   24:istore_2        
				byte byte0 = abyte0[j];
	//   14   25:aload           7
	//   15   27:iload_2         
	//   16   28:baload          
	//   17   29:istore_3        
				byte byte2 = abyte0[j + 1];
	//   18   30:aload           7
	//   19   32:iload_2         
	//   20   33:iconst_1        
	//   21   34:iadd            
	//   22   35:baload          
	//   23   36:istore          4
				byte byte3 = abyte0[j + 2];
	//   24   38:aload           7
	//   25   40:iload_2         
	//   26   41:iconst_2        
	//   27   42:iadd            
	//   28   43:baload          
	//   29   44:istore          5
				j = abyte0[j + 3] & 0xff | (byte0 << 24 | (byte2 & 0xff) << 16 | (byte3 & 0xff) << 8);
	//   30   46:aload           7
	//   31   48:iload_2         
	//   32   49:iconst_3        
	//   33   50:iadd            
	//   34   51:baload          
	//   35   52:sipush          255
	//   36   55:iand            
	//   37   56:iload_3         
	//   38   57:bipush          24
	//   39   59:ishl            
	//   40   60:iload           4
	//   41   62:sipush          255
	//   42   65:iand            
	//   43   66:bipush          16
	//   44   68:ishl            
	//   45   69:ior             
	//   46   70:iload           5
	//   47   72:sipush          255
	//   48   75:iand            
	//   49   76:bipush          8
	//   50   78:ishl            
	//   51   79:ior             
	//   52   80:ior             
	//   53   81:istore_2        
				if(!handleBOM(j) && !checkUTF32(j) && !checkUTF16(j >>> 16))
	//*  54   82:aload_0         
	//*  55   83:iload_2         
	//*  56   84:invokespecial   #231 <Method boolean handleBOM(int)>
	//*  57   87:ifeq            93
	//*  58   90:goto            178
	//*  59   93:aload_0         
	//*  60   94:iload_2         
	//*  61   95:invokespecial   #233 <Method boolean checkUTF32(int)>
	//*  62   98:ifeq            104
	//*  63  101:goto            178
	//*  64  104:aload_0         
	//*  65  105:iload_2         
	//*  66  106:bipush          16
	//*  67  108:iushr           
	//*  68  109:invokespecial   #235 <Method boolean checkUTF16(int)>
	//*  69  112:ifeq            118
	//*  70  115:goto            178
					flag = false;
	//   71  118:iconst_0        
	//   72  119:istore_1        
				break label0;
	//   73  120:goto            178
			}
			if(ensureLoaded(2))
	//*  74  123:aload_0         
	//*  75  124:iconst_2        
	//*  76  125:invokevirtual   #229 <Method boolean ensureLoaded(int)>
	//*  77  128:ifeq            176
			{
				byte abyte1[] = _inputBuffer;
	//   78  131:aload_0         
	//   79  132:getfield        #36  <Field byte[] _inputBuffer>
	//   80  135:astore          7
				int k = _inputPtr;
	//   81  137:aload_0         
	//   82  138:getfield        #38  <Field int _inputPtr>
	//   83  141:istore_2        
				byte byte1 = abyte1[k];
	//   84  142:aload           7
	//   85  144:iload_2         
	//   86  145:baload          
	//   87  146:istore_3        
				if(checkUTF16(abyte1[k + 1] & 0xff | (byte1 & 0xff) << 8))
	//*  88  147:aload_0         
	//*  89  148:aload           7
	//*  90  150:iload_2         
	//*  91  151:iconst_1        
	//*  92  152:iadd            
	//*  93  153:baload          
	//*  94  154:sipush          255
	//*  95  157:iand            
	//*  96  158:iload_3         
	//*  97  159:sipush          255
	//*  98  162:iand            
	//*  99  163:bipush          8
	//* 100  165:ishl            
	//* 101  166:ior             
	//* 102  167:invokespecial   #235 <Method boolean checkUTF16(int)>
	//* 103  170:ifeq            176
					break label0;
	//  104  173:goto            178
			}
			flag = false;
	//  105  176:iconst_0        
	//  106  177:istore_1        
		}
		JsonEncoding jsonencoding;
		if(!flag)
	//* 107  178:iload_1         
	//* 108  179:ifne            190
		{
			jsonencoding = JsonEncoding.UTF8;
	//  109  182:getstatic       #155 <Field JsonEncoding JsonEncoding.UTF8>
	//  110  185:astore          7
		} else
	//* 111  187:goto            285
		{
			int i = _bytesPerChar;
	//  112  190:aload_0         
	//  113  191:getfield        #49  <Field int _bytesPerChar>
	//  114  194:istore_1        
			if(i != 4)
	//* 115  195:iload_1         
	//* 116  196:iconst_4        
	//* 117  197:icmpeq          265
				switch(i)
	//* 118  200:iload_1         
				{
	//* 119  201:tableswitch     1 2: default 224
	//	               1 257
	//	               2 234
				default:
					throw new RuntimeException("Internal error");
	//  120  224:new             #205 <Class RuntimeException>
	//  121  227:dup             
	//  122  228:ldc1            #207 <String "Internal error">
	//  123  230:invokespecial   #208 <Method void RuntimeException(String)>
	//  124  233:athrow          

				case 2: // '\002'
					if(_bigEndian)
	//* 125  234:aload_0         
	//* 126  235:getfield        #24  <Field boolean _bigEndian>
	//* 127  238:ifeq            249
						jsonencoding = JsonEncoding.UTF16_BE;
	//  128  241:getstatic       #238 <Field JsonEncoding JsonEncoding.UTF16_BE>
	//  129  244:astore          7
					else
	//* 130  246:goto            285
						jsonencoding = JsonEncoding.UTF16_LE;
	//  131  249:getstatic       #241 <Field JsonEncoding JsonEncoding.UTF16_LE>
	//  132  252:astore          7
					break;

	//* 133  254:goto            285
				case 1: // '\001'
					jsonencoding = JsonEncoding.UTF8;
	//  134  257:getstatic       #155 <Field JsonEncoding JsonEncoding.UTF8>
	//  135  260:astore          7
					break;
				}
			else
	//* 136  262:goto            285
			if(_bigEndian)
	//* 137  265:aload_0         
	//* 138  266:getfield        #24  <Field boolean _bigEndian>
	//* 139  269:ifeq            280
				jsonencoding = JsonEncoding.UTF32_BE;
	//  140  272:getstatic       #244 <Field JsonEncoding JsonEncoding.UTF32_BE>
	//  141  275:astore          7
			else
	//* 142  277:goto            285
				jsonencoding = JsonEncoding.UTF32_LE;
	//  143  280:getstatic       #247 <Field JsonEncoding JsonEncoding.UTF32_LE>
	//  144  283:astore          7
		}
		_context.setEncoding(jsonencoding);
	//  145  285:aload_0         
	//  146  286:getfield        #26  <Field IOContext _context>
	//  147  289:aload           7
	//  148  291:invokevirtual   #251 <Method void IOContext.setEncoding(JsonEncoding)>
		return jsonencoding;
	//  149  294:aload           7
	//  150  296:areturn         
	}

	protected boolean ensureLoaded(int i)
		throws IOException
	{
		int k;
		for(int j = _inputEnd - _inputPtr; j < i; j += k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field int _inputEnd>
	//*   2    4:aload_0         
	//*   3    5:getfield        #38  <Field int _inputPtr>
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_1         
	//*   8   12:icmpge          80
		{
			InputStream inputstream = _in;
	//    9   15:aload_0         
	//   10   16:getfield        #28  <Field InputStream _in>
	//   11   19:astore          4
			if(inputstream == null)
	//*  12   21:aload           4
	//*  13   23:ifnonnull       31
			{
				k = -1;
	//   14   26:iconst_m1       
	//   15   27:istore_3        
			} else
	//*  16   28:goto            56
			{
				byte abyte0[] = _inputBuffer;
	//   17   31:aload_0         
	//   18   32:getfield        #36  <Field byte[] _inputBuffer>
	//   19   35:astore          5
				k = _inputEnd;
	//   20   37:aload_0         
	//   21   38:getfield        #40  <Field int _inputEnd>
	//   22   41:istore_3        
				k = inputstream.read(abyte0, k, abyte0.length - k);
	//   23   42:aload           4
	//   24   44:aload           5
	//   25   46:iload_3         
	//   26   47:aload           5
	//   27   49:arraylength     
	//   28   50:iload_3         
	//   29   51:isub            
	//   30   52:invokevirtual   #257 <Method int InputStream.read(byte[], int, int)>
	//   31   55:istore_3        
			}
			if(k < 1)
	//*  32   56:iload_3         
	//*  33   57:iconst_1        
	//*  34   58:icmpge          63
				return false;
	//   35   61:iconst_0        
	//   36   62:ireturn         
			_inputEnd = _inputEnd + k;
	//   37   63:aload_0         
	//   38   64:aload_0         
	//   39   65:getfield        #40  <Field int _inputEnd>
	//   40   68:iload_3         
	//   41   69:iadd            
	//   42   70:putfield        #40  <Field int _inputEnd>
		}

	//   43   73:iload_2         
	//   44   74:iload_3         
	//   45   75:iadd            
	//   46   76:istore_2        
	//*  47   77:goto            10
		return true;
	//   48   80:iconst_1        
	//   49   81:ireturn         
	}

	private boolean _bigEndian;
	private final boolean _bufferRecyclable;
	private int _bytesPerChar;
	private final IOContext _context;
	private final InputStream _in;
	private final byte _inputBuffer[];
	private int _inputEnd;
	private int _inputPtr;
}
