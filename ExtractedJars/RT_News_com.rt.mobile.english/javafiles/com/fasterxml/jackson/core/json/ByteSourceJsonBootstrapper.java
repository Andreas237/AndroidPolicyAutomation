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
	//    1    1:invokespecial   #29  <Method void Object()>
		_bigEndian = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #31  <Field boolean _bigEndian>
		_context = iocontext;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #33  <Field IOContext _context>
		_in = inputstream;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #35  <Field InputStream _in>
		_inputBuffer = iocontext.allocReadIOBuffer();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #41  <Method byte[] IOContext.allocReadIOBuffer()>
	//   14   24:putfield        #43  <Field byte[] _inputBuffer>
		_inputPtr = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #45  <Field int _inputPtr>
		_inputEnd = 0;
	//   18   32:aload_0         
	//   19   33:iconst_0        
	//   20   34:putfield        #47  <Field int _inputEnd>
		_bufferRecyclable = true;
	//   21   37:aload_0         
	//   22   38:iconst_1        
	//   23   39:putfield        #49  <Field boolean _bufferRecyclable>
	//   24   42:return          
	}

	public ByteSourceJsonBootstrapper(IOContext iocontext, byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		_bigEndian = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #31  <Field boolean _bigEndian>
		_context = iocontext;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #33  <Field IOContext _context>
		_in = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #35  <Field InputStream _in>
		_inputBuffer = abyte0;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #43  <Field byte[] _inputBuffer>
		_inputPtr = i;
	//   14   24:aload_0         
	//   15   25:iload_3         
	//   16   26:putfield        #45  <Field int _inputPtr>
		_inputEnd = i + j;
	//   17   29:aload_0         
	//   18   30:iload_3         
	//   19   31:iload           4
	//   20   33:iadd            
	//   21   34:putfield        #47  <Field int _inputEnd>
		_bufferRecyclable = false;
	//   22   37:aload_0         
	//   23   38:iconst_0        
	//   24   39:putfield        #49  <Field boolean _bufferRecyclable>
	//   25   42:return          
	}

	private boolean checkUTF16(int i)
	{
label0:
		{
			if((0xff00 & i) == 0)
	//*   0    0:ldc1            #54  <Int 65280>
	//*   1    2:iload_1         
	//*   2    3:iand            
	//*   3    4:ifne            15
			{
				_bigEndian = true;
	//    4    7:aload_0         
	//    5    8:iconst_1        
	//    6    9:putfield        #31  <Field boolean _bigEndian>
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
	//   14   25:putfield        #31  <Field boolean _bigEndian>
			}
			_bytesPerChar = 2;
	//   15   28:aload_0         
	//   16   29:iconst_2        
	//   17   30:putfield        #56  <Field int _bytesPerChar>
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
	//    6    9:putfield        #31  <Field boolean _bigEndian>
			else
	//*   7   12:goto            59
			if((0xffffff & i) == 0)
	//*   8   15:ldc1            #60  <Int 0xffffff>
	//*   9   17:iload_1         
	//*  10   18:iand            
	//*  11   19:ifne            30
				_bigEndian = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #31  <Field boolean _bigEndian>
			else
	//*  15   27:goto            59
			if((0xff00ffff & i) == 0)
	//*  16   30:ldc1            #61  <Int 0xff00ffff>
	//*  17   32:iload_1         
	//*  18   33:iand            
	//*  19   34:ifne            46
			{
				reportWeirdUCS4("3412");
	//   20   37:aload_0         
	//   21   38:ldc1            #63  <String "3412">
	//   22   40:invokespecial   #67  <Method void reportWeirdUCS4(String)>
			} else
	//*  23   43:goto            59
			{
				if((i & 0xffff00ff) != 0)
					break label0;
	//   24   46:iload_1         
	//   25   47:ldc1            #68  <Int -65281>
	//   26   49:iand            
	//   27   50:ifne            66
				reportWeirdUCS4("2143");
	//   28   53:aload_0         
	//   29   54:ldc1            #70  <String "2143">
	//   30   56:invokespecial   #67  <Method void reportWeirdUCS4(String)>
			}
			_bytesPerChar = 4;
	//   31   59:aload_0         
	//   32   60:iconst_4        
	//   33   61:putfield        #56  <Field int _bytesPerChar>
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
	//*   1    1:ldc1            #73  <Int 0xfeff0000>
	//*   2    3:icmpeq          80
		{
			if(i != 0xfffe0000)
	//*   3    6:iload_1         
	//*   4    7:ldc1            #74  <Int 0xfffe0000>
	//*   5    9:icmpeq          58
			{
				if(i != 65279)
	//*   6   12:iload_1         
	//*   7   13:ldc1            #75  <Int 65279>
	//*   8   15:icmpeq          36
				{
					if(i == 65534)
	//*   9   18:iload_1         
	//*  10   19:ldc1            #76  <Int 65534>
	//*  11   21:icmpeq          27
	//*  12   24:goto            86
						reportWeirdUCS4("2143");
	//   13   27:aload_0         
	//   14   28:ldc1            #70  <String "2143">
	//   15   30:invokespecial   #67  <Method void reportWeirdUCS4(String)>
				} else
	//*  16   33:goto            86
				{
					_bigEndian = true;
	//   17   36:aload_0         
	//   18   37:iconst_1        
	//   19   38:putfield        #31  <Field boolean _bigEndian>
					_inputPtr = _inputPtr + 4;
	//   20   41:aload_0         
	//   21   42:aload_0         
	//   22   43:getfield        #45  <Field int _inputPtr>
	//   23   46:iconst_4        
	//   24   47:iadd            
	//   25   48:putfield        #45  <Field int _inputPtr>
					_bytesPerChar = 4;
	//   26   51:aload_0         
	//   27   52:iconst_4        
	//   28   53:putfield        #56  <Field int _bytesPerChar>
					return true;
	//   29   56:iconst_1        
	//   30   57:ireturn         
				}
			} else
			{
				_inputPtr = _inputPtr + 4;
	//   31   58:aload_0         
	//   32   59:aload_0         
	//   33   60:getfield        #45  <Field int _inputPtr>
	//   34   63:iconst_4        
	//   35   64:iadd            
	//   36   65:putfield        #45  <Field int _inputPtr>
				_bytesPerChar = 4;
	//   37   68:aload_0         
	//   38   69:iconst_4        
	//   39   70:putfield        #56  <Field int _bytesPerChar>
				_bigEndian = false;
	//   40   73:aload_0         
	//   41   74:iconst_0        
	//   42   75:putfield        #31  <Field boolean _bigEndian>
				return true;
	//   43   78:iconst_1        
	//   44   79:ireturn         
			}
		} else
		{
			reportWeirdUCS4("3412");
	//   45   80:aload_0         
	//   46   81:ldc1            #63  <String "3412">
	//   47   83:invokespecial   #67  <Method void reportWeirdUCS4(String)>
		}
		int j = i >>> 16;
	//   48   86:iload_1         
	//   49   87:bipush          16
	//   50   89:iushr           
	//   51   90:istore_2        
		if(j == 65279)
	//*  52   91:iload_2         
	//*  53   92:ldc1            #75  <Int 65279>
	//*  54   94:icmpne          119
		{
			_inputPtr = _inputPtr + 2;
	//   55   97:aload_0         
	//   56   98:aload_0         
	//   57   99:getfield        #45  <Field int _inputPtr>
	//   58  102:iconst_2        
	//   59  103:iadd            
	//   60  104:putfield        #45  <Field int _inputPtr>
			_bytesPerChar = 2;
	//   61  107:aload_0         
	//   62  108:iconst_2        
	//   63  109:putfield        #56  <Field int _bytesPerChar>
			_bigEndian = true;
	//   64  112:aload_0         
	//   65  113:iconst_1        
	//   66  114:putfield        #31  <Field boolean _bigEndian>
			return true;
	//   67  117:iconst_1        
	//   68  118:ireturn         
		}
		if(j == 65534)
	//*  69  119:iload_2         
	//*  70  120:ldc1            #76  <Int 65534>
	//*  71  122:icmpne          147
		{
			_inputPtr = _inputPtr + 2;
	//   72  125:aload_0         
	//   73  126:aload_0         
	//   74  127:getfield        #45  <Field int _inputPtr>
	//   75  130:iconst_2        
	//   76  131:iadd            
	//   77  132:putfield        #45  <Field int _inputPtr>
			_bytesPerChar = 2;
	//   78  135:aload_0         
	//   79  136:iconst_2        
	//   80  137:putfield        #56  <Field int _bytesPerChar>
			_bigEndian = false;
	//   81  140:aload_0         
	//   82  141:iconst_0        
	//   83  142:putfield        #31  <Field boolean _bigEndian>
			return true;
	//   84  145:iconst_1        
	//   85  146:ireturn         
		}
		if(i >>> 8 == 0xefbbbf)
	//*  86  147:iload_1         
	//*  87  148:bipush          8
	//*  88  150:iushr           
	//*  89  151:ldc1            #77  <Int 0xefbbbf>
	//*  90  153:icmpne          178
		{
			_inputPtr = _inputPtr + 3;
	//   91  156:aload_0         
	//   92  157:aload_0         
	//   93  158:getfield        #45  <Field int _inputPtr>
	//   94  161:iconst_3        
	//   95  162:iadd            
	//   96  163:putfield        #45  <Field int _inputPtr>
			_bytesPerChar = 1;
	//   97  166:aload_0         
	//   98  167:iconst_1        
	//   99  168:putfield        #56  <Field int _bytesPerChar>
			_bigEndian = true;
	//  100  171:aload_0         
	//  101  172:iconst_1        
	//  102  173:putfield        #31  <Field boolean _bigEndian>
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
	//*   1    1:invokeinterface #85  <Method boolean InputAccessor.hasMoreBytes()>
	//*   2    6:ifne            13
			return MatchStrength.INCONCLUSIVE;
	//    3    9:getstatic       #91  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//    4   12:areturn         
		byte byte1 = inputaccessor.nextByte();
	//    5   13:aload_0         
	//    6   14:invokeinterface #95  <Method byte InputAccessor.nextByte()>
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
	//*  14   29:invokeinterface #85  <Method boolean InputAccessor.hasMoreBytes()>
	//*  15   34:ifne            41
				return MatchStrength.INCONCLUSIVE;
	//   16   37:getstatic       #91  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   17   40:areturn         
			if(inputaccessor.nextByte() != -69)
	//*  18   41:aload_0         
	//*  19   42:invokeinterface #95  <Method byte InputAccessor.nextByte()>
	//*  20   47:bipush          -69
	//*  21   49:icmpeq          56
				return MatchStrength.NO_MATCH;
	//   22   52:getstatic       #98  <Field MatchStrength MatchStrength.NO_MATCH>
	//   23   55:areturn         
			if(!inputaccessor.hasMoreBytes())
	//*  24   56:aload_0         
	//*  25   57:invokeinterface #85  <Method boolean InputAccessor.hasMoreBytes()>
	//*  26   62:ifne            69
				return MatchStrength.INCONCLUSIVE;
	//   27   65:getstatic       #91  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   28   68:areturn         
			if(inputaccessor.nextByte() != -65)
	//*  29   69:aload_0         
	//*  30   70:invokeinterface #95  <Method byte InputAccessor.nextByte()>
	//*  31   75:bipush          -65
	//*  32   77:icmpeq          84
				return MatchStrength.NO_MATCH;
	//   33   80:getstatic       #98  <Field MatchStrength MatchStrength.NO_MATCH>
	//   34   83:areturn         
			if(!inputaccessor.hasMoreBytes())
	//*  35   84:aload_0         
	//*  36   85:invokeinterface #85  <Method boolean InputAccessor.hasMoreBytes()>
	//*  37   90:ifne            97
				return MatchStrength.INCONCLUSIVE;
	//   38   93:getstatic       #91  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   39   96:areturn         
			byte0 = inputaccessor.nextByte();
	//   40   97:aload_0         
	//   41   98:invokeinterface #95  <Method byte InputAccessor.nextByte()>
	//   42  103:istore_1        
		}
		int i = skipSpace(inputaccessor, byte0);
	//   43  104:aload_0         
	//   44  105:iload_1         
	//   45  106:invokestatic    #102 <Method int skipSpace(InputAccessor, byte)>
	//   46  109:istore_3        
		if(i < 0)
	//*  47  110:iload_3         
	//*  48  111:ifge            118
			return MatchStrength.INCONCLUSIVE;
	//   49  114:getstatic       #91  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   50  117:areturn         
		if(i == 123)
	//*  51  118:iload_3         
	//*  52  119:bipush          123
	//*  53  121:icmpne          160
		{
			i = skipSpace(inputaccessor);
	//   54  124:aload_0         
	//   55  125:invokestatic    #105 <Method int skipSpace(InputAccessor)>
	//   56  128:istore_3        
			if(i < 0)
	//*  57  129:iload_3         
	//*  58  130:ifge            137
				return MatchStrength.INCONCLUSIVE;
	//   59  133:getstatic       #91  <Field MatchStrength MatchStrength.INCONCLUSIVE>
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
	//   68  152:getstatic       #98  <Field MatchStrength MatchStrength.NO_MATCH>
	//   69  155:areturn         
			else
				return MatchStrength.SOLID_MATCH;
	//   70  156:getstatic       #108 <Field MatchStrength MatchStrength.SOLID_MATCH>
	//   71  159:areturn         
		}
		if(i == 91)
	//*  72  160:iload_3         
	//*  73  161:bipush          91
	//*  74  163:icmpne          202
		{
			i = skipSpace(inputaccessor);
	//   75  166:aload_0         
	//   76  167:invokestatic    #105 <Method int skipSpace(InputAccessor)>
	//   77  170:istore_3        
			if(i < 0)
	//*  78  171:iload_3         
	//*  79  172:ifge            179
				return MatchStrength.INCONCLUSIVE;
	//   80  175:getstatic       #91  <Field MatchStrength MatchStrength.INCONCLUSIVE>
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
	//   89  194:getstatic       #108 <Field MatchStrength MatchStrength.SOLID_MATCH>
	//   90  197:areturn         
			else
				return MatchStrength.SOLID_MATCH;
	//   91  198:getstatic       #108 <Field MatchStrength MatchStrength.SOLID_MATCH>
	//   92  201:areturn         
		}
		MatchStrength matchstrength = MatchStrength.WEAK_MATCH;
	//   93  202:getstatic       #111 <Field MatchStrength MatchStrength.WEAK_MATCH>
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
	//  112  238:invokestatic    #105 <Method int skipSpace(InputAccessor)>
	//  113  241:istore_3        
			if(i < 0)
	//* 114  242:iload_3         
	//* 115  243:ifge            250
				return MatchStrength.INCONCLUSIVE;
	//  116  246:getstatic       #91  <Field MatchStrength MatchStrength.INCONCLUSIVE>
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
	//  126  265:getstatic       #98  <Field MatchStrength MatchStrength.NO_MATCH>
	//  127  268:areturn         
		}
		if(i == 110)
	//* 128  269:iload_3         
	//* 129  270:bipush          110
	//* 130  272:icmpne          284
			return tryMatch(inputaccessor, "ull", matchstrength);
	//  131  275:aload_0         
	//  132  276:ldc1            #113 <String "ull">
	//  133  278:aload           4
	//  134  280:invokestatic    #117 <Method MatchStrength tryMatch(InputAccessor, String, MatchStrength)>
	//  135  283:areturn         
		if(i == 116)
	//* 136  284:iload_3         
	//* 137  285:bipush          116
	//* 138  287:icmpne          299
			return tryMatch(inputaccessor, "rue", matchstrength);
	//  139  290:aload_0         
	//  140  291:ldc1            #119 <String "rue">
	//  141  293:aload           4
	//  142  295:invokestatic    #117 <Method MatchStrength tryMatch(InputAccessor, String, MatchStrength)>
	//  143  298:areturn         
		if(i == 102)
	//* 144  299:iload_3         
	//* 145  300:bipush          102
	//* 146  302:icmpne          314
			return tryMatch(inputaccessor, "alse", matchstrength);
	//  147  305:aload_0         
	//  148  306:ldc1            #121 <String "alse">
	//  149  308:aload           4
	//  150  310:invokestatic    #117 <Method MatchStrength tryMatch(InputAccessor, String, MatchStrength)>
	//  151  313:areturn         
		else
			return MatchStrength.NO_MATCH;
	//  152  314:getstatic       #98  <Field MatchStrength MatchStrength.NO_MATCH>
	//  153  317:areturn         
	}

	private void reportWeirdUCS4(String s)
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #123 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Unsupported UCS-4 endianness (");
	//    4    8:aload_2         
	//    5    9:ldc1            #126 <String "Unsupported UCS-4 endianness (">
	//    6   11:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(") detected");
	//   12   21:aload_2         
	//   13   22:ldc1            #132 <String ") detected">
	//   14   24:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		throw new CharConversionException(stringbuilder.toString());
	//   16   28:new             #134 <Class CharConversionException>
	//   17   31:dup             
	//   18   32:aload_2         
	//   19   33:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   20   36:invokespecial   #140 <Method void CharConversionException(String)>
	//   21   39:athrow          
	}

	private static int skipSpace(InputAccessor inputaccessor)
		throws IOException
	{
		if(!inputaccessor.hasMoreBytes())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #85  <Method boolean InputAccessor.hasMoreBytes()>
	//*   2    6:ifne            11
			return -1;
	//    3    9:iconst_m1       
	//    4   10:ireturn         
		else
			return skipSpace(inputaccessor, inputaccessor.nextByte());
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokeinterface #95  <Method byte InputAccessor.nextByte()>
	//    8   18:invokestatic    #102 <Method int skipSpace(InputAccessor, byte)>
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
	//*  19   33:invokeinterface #85  <Method boolean InputAccessor.hasMoreBytes()>
	//*  20   38:ifne            43
				return -1;
	//   21   41:iconst_m1       
	//   22   42:ireturn         
			byte0 = inputaccessor.nextByte();
	//   23   43:aload_0         
	//   24   44:invokeinterface #95  <Method byte InputAccessor.nextByte()>
	//   25   49:istore_1        
		} while(true);
	//   26   50:goto            0
	}

	public static int skipUTF8BOM(DataInput datainput)
		throws IOException
	{
		int i = datainput.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokeinterface #148 <Method int DataInput.readUnsignedByte()>
	//    2    6:istore_1        
		if(i != 239)
	//*   3    7:iload_1         
	//*   4    8:sipush          239
	//*   5   11:icmpeq          16
			return i;
	//    6   14:iload_1         
	//    7   15:ireturn         
		i = datainput.readUnsignedByte();
	//    8   16:aload_0         
	//    9   17:invokeinterface #148 <Method int DataInput.readUnsignedByte()>
	//   10   22:istore_1        
		if(i != 187)
	//*  11   23:iload_1         
	//*  12   24:sipush          187
	//*  13   27:icmpeq          73
		{
			datainput = ((DataInput) (new StringBuilder()));
	//   14   30:new             #123 <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #124 <Method void StringBuilder()>
	//   17   37:astore_0        
			((StringBuilder) (datainput)).append("Unexpected byte 0x");
	//   18   38:aload_0         
	//   19   39:ldc1            #150 <String "Unexpected byte 0x">
	//   20   41:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			((StringBuilder) (datainput)).append(Integer.toHexString(i));
	//   22   45:aload_0         
	//   23   46:iload_1         
	//   24   47:invokestatic    #156 <Method String Integer.toHexString(int)>
	//   25   50:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
			((StringBuilder) (datainput)).append(" following 0xEF; should get 0xBB as part of UTF-8 BOM");
	//   27   54:aload_0         
	//   28   55:ldc1            #158 <String " following 0xEF; should get 0xBB as part of UTF-8 BOM">
	//   29   57:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   30   60:pop             
			throw new IOException(((StringBuilder) (datainput)).toString());
	//   31   61:new             #59  <Class IOException>
	//   32   64:dup             
	//   33   65:aload_0         
	//   34   66:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   35   69:invokespecial   #159 <Method void IOException(String)>
	//   36   72:athrow          
		}
		i = datainput.readUnsignedByte();
	//   37   73:aload_0         
	//   38   74:invokeinterface #148 <Method int DataInput.readUnsignedByte()>
	//   39   79:istore_1        
		if(i != 191)
	//*  40   80:iload_1         
	//*  41   81:sipush          191
	//*  42   84:icmpeq          130
		{
			datainput = ((DataInput) (new StringBuilder()));
	//   43   87:new             #123 <Class StringBuilder>
	//   44   90:dup             
	//   45   91:invokespecial   #124 <Method void StringBuilder()>
	//   46   94:astore_0        
			((StringBuilder) (datainput)).append("Unexpected byte 0x");
	//   47   95:aload_0         
	//   48   96:ldc1            #150 <String "Unexpected byte 0x">
	//   49   98:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   50  101:pop             
			((StringBuilder) (datainput)).append(Integer.toHexString(i));
	//   51  102:aload_0         
	//   52  103:iload_1         
	//   53  104:invokestatic    #156 <Method String Integer.toHexString(int)>
	//   54  107:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   55  110:pop             
			((StringBuilder) (datainput)).append(" following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
	//   56  111:aload_0         
	//   57  112:ldc1            #161 <String " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM">
	//   58  114:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   59  117:pop             
			throw new IOException(((StringBuilder) (datainput)).toString());
	//   60  118:new             #59  <Class IOException>
	//   61  121:dup             
	//   62  122:aload_0         
	//   63  123:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   64  126:invokespecial   #159 <Method void IOException(String)>
	//   65  129:athrow          
		} else
		{
			return datainput.readUnsignedByte();
	//   66  130:aload_0         
	//   67  131:invokeinterface #148 <Method int DataInput.readUnsignedByte()>
	//   68  136:ireturn         
		}
	}

	private static MatchStrength tryMatch(InputAccessor inputaccessor, String s, MatchStrength matchstrength)
		throws IOException
	{
		int j = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #166 <Method int String.length()>
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
	//*   9   15:invokeinterface #85  <Method boolean InputAccessor.hasMoreBytes()>
	//*  10   20:ifne            27
				return MatchStrength.INCONCLUSIVE;
	//   11   23:getstatic       #91  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   12   26:areturn         
			if(inputaccessor.nextByte() != s.charAt(i))
	//*  13   27:aload_0         
	//*  14   28:invokeinterface #95  <Method byte InputAccessor.nextByte()>
	//*  15   33:aload_1         
	//*  16   34:iload_3         
	//*  17   35:invokevirtual   #170 <Method char String.charAt(int)>
	//*  18   38:icmpeq          45
				return MatchStrength.NO_MATCH;
	//   19   41:getstatic       #98  <Field MatchStrength MatchStrength.NO_MATCH>
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
	//*   1    1:invokevirtual   #176 <Method JsonEncoding detectEncoding()>
	//*   2    4:getstatic       #182 <Field JsonEncoding JsonEncoding.UTF8>
	//*   3    7:if_acmpne       63
	//*   4   10:getstatic       #188 <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.CANONICALIZE_FIELD_NAMES>
	//*   5   13:iload           5
	//*   6   15:invokevirtual   #191 <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//*   7   18:ifeq            63
		{
			bytequadscanonicalizer = bytequadscanonicalizer.makeChild(j);
	//    8   21:aload_3         
	//    9   22:iload           5
	//   10   24:invokevirtual   #197 <Method ByteQuadsCanonicalizer ByteQuadsCanonicalizer.makeChild(int)>
	//   11   27:astore_3        
			return ((JsonParser) (new UTF8StreamJsonParser(_context, i, _in, objectcodec, bytequadscanonicalizer, _inputBuffer, _inputPtr, _inputEnd, _bufferRecyclable)));
	//   12   28:new             #199 <Class UTF8StreamJsonParser>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:getfield        #33  <Field IOContext _context>
	//   16   36:iload_1         
	//   17   37:aload_0         
	//   18   38:getfield        #35  <Field InputStream _in>
	//   19   41:aload_2         
	//   20   42:aload_3         
	//   21   43:aload_0         
	//   22   44:getfield        #43  <Field byte[] _inputBuffer>
	//   23   47:aload_0         
	//   24   48:getfield        #45  <Field int _inputPtr>
	//   25   51:aload_0         
	//   26   52:getfield        #47  <Field int _inputEnd>
	//   27   55:aload_0         
	//   28   56:getfield        #49  <Field boolean _bufferRecyclable>
	//   29   59:invokespecial   #202 <Method void UTF8StreamJsonParser(IOContext, int, InputStream, ObjectCodec, ByteQuadsCanonicalizer, byte[], int, int, boolean)>
	//   30   62:areturn         
		} else
		{
			return ((JsonParser) (new ReaderBasedJsonParser(_context, i, constructReader(), objectcodec, charstonamecanonicalizer.makeChild(j))));
	//   31   63:new             #204 <Class ReaderBasedJsonParser>
	//   32   66:dup             
	//   33   67:aload_0         
	//   34   68:getfield        #33  <Field IOContext _context>
	//   35   71:iload_1         
	//   36   72:aload_0         
	//   37   73:invokevirtual   #208 <Method Reader constructReader()>
	//   38   76:aload_2         
	//   39   77:aload           4
	//   40   79:iload           5
	//   41   81:invokevirtual   #213 <Method CharsToNameCanonicalizer CharsToNameCanonicalizer.makeChild(int)>
	//   42   84:invokespecial   #216 <Method void ReaderBasedJsonParser(IOContext, int, Reader, ObjectCodec, CharsToNameCanonicalizer)>
	//   43   87:areturn         
		}
	}

	public Reader constructReader()
		throws IOException
	{
		JsonEncoding jsonencoding = _context.getEncoding();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field IOContext _context>
	//    2    4:invokevirtual   #219 <Method JsonEncoding IOContext.getEncoding()>
	//    3    7:astore          4
		int i = jsonencoding.bits();
	//    4    9:aload           4
	//    5   11:invokevirtual   #222 <Method int JsonEncoding.bits()>
	//    6   14:istore_1        
		if(i != 8 && i != 16)
	//*   7   15:iload_1         
	//*   8   16:bipush          8
	//*   9   18:icmpeq          81
	//*  10   21:iload_1         
	//*  11   22:bipush          16
	//*  12   24:icmpeq          81
			if(i != 32)
	//*  13   27:iload_1         
	//*  14   28:bipush          32
	//*  15   30:icmpeq          43
				throw new RuntimeException("Internal error");
	//   16   33:new             #224 <Class RuntimeException>
	//   17   36:dup             
	//   18   37:ldc1            #226 <String "Internal error">
	//   19   39:invokespecial   #227 <Method void RuntimeException(String)>
	//   20   42:athrow          
			else
				return ((Reader) (new UTF32Reader(_context, _in, _inputBuffer, _inputPtr, _inputEnd, _context.getEncoding().isBigEndian())));
	//   21   43:new             #229 <Class UTF32Reader>
	//   22   46:dup             
	//   23   47:aload_0         
	//   24   48:getfield        #33  <Field IOContext _context>
	//   25   51:aload_0         
	//   26   52:getfield        #35  <Field InputStream _in>
	//   27   55:aload_0         
	//   28   56:getfield        #43  <Field byte[] _inputBuffer>
	//   29   59:aload_0         
	//   30   60:getfield        #45  <Field int _inputPtr>
	//   31   63:aload_0         
	//   32   64:getfield        #47  <Field int _inputEnd>
	//   33   67:aload_0         
	//   34   68:getfield        #33  <Field IOContext _context>
	//   35   71:invokevirtual   #219 <Method JsonEncoding IOContext.getEncoding()>
	//   36   74:invokevirtual   #232 <Method boolean JsonEncoding.isBigEndian()>
	//   37   77:invokespecial   #235 <Method void UTF32Reader(IOContext, InputStream, byte[], int, int, boolean)>
	//   38   80:areturn         
		InputStream inputstream = _in;
	//   39   81:aload_0         
	//   40   82:getfield        #35  <Field InputStream _in>
	//   41   85:astore_3        
		Object obj;
		if(inputstream == null)
	//*  42   86:aload_3         
	//*  43   87:ifnonnull       113
		{
			obj = ((Object) (new ByteArrayInputStream(_inputBuffer, _inputPtr, _inputEnd)));
	//   44   90:new             #237 <Class ByteArrayInputStream>
	//   45   93:dup             
	//   46   94:aload_0         
	//   47   95:getfield        #43  <Field byte[] _inputBuffer>
	//   48   98:aload_0         
	//   49   99:getfield        #45  <Field int _inputPtr>
	//   50  102:aload_0         
	//   51  103:getfield        #47  <Field int _inputEnd>
	//   52  106:invokespecial   #240 <Method void ByteArrayInputStream(byte[], int, int)>
	//   53  109:astore_2        
		} else
	//*  54  110:goto            151
		{
			obj = ((Object) (inputstream));
	//   55  113:aload_3         
	//   56  114:astore_2        
			if(_inputPtr < _inputEnd)
	//*  57  115:aload_0         
	//*  58  116:getfield        #45  <Field int _inputPtr>
	//*  59  119:aload_0         
	//*  60  120:getfield        #47  <Field int _inputEnd>
	//*  61  123:icmpge          151
				obj = ((Object) (new MergedStream(_context, inputstream, _inputBuffer, _inputPtr, _inputEnd)));
	//   62  126:new             #242 <Class MergedStream>
	//   63  129:dup             
	//   64  130:aload_0         
	//   65  131:getfield        #33  <Field IOContext _context>
	//   66  134:aload_3         
	//   67  135:aload_0         
	//   68  136:getfield        #43  <Field byte[] _inputBuffer>
	//   69  139:aload_0         
	//   70  140:getfield        #45  <Field int _inputPtr>
	//   71  143:aload_0         
	//   72  144:getfield        #47  <Field int _inputEnd>
	//   73  147:invokespecial   #245 <Method void MergedStream(IOContext, InputStream, byte[], int, int)>
	//   74  150:astore_2        
		}
		return ((Reader) (new InputStreamReader(((InputStream) (obj)), jsonencoding.getJavaName())));
	//   75  151:new             #247 <Class InputStreamReader>
	//   76  154:dup             
	//   77  155:aload_2         
	//   78  156:aload           4
	//   79  158:invokevirtual   #250 <Method String JsonEncoding.getJavaName()>
	//   80  161:invokespecial   #253 <Method void InputStreamReader(InputStream, String)>
	//   81  164:areturn         
	}

	public JsonEncoding detectEncoding()
		throws IOException
	{
		boolean flag1 = ensureLoaded(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #256 <Method boolean ensureLoaded(int)>
	//    3    5:istore_3        
		boolean flag = true;
	//    4    6:iconst_1        
	//    5    7:istore_1        
		int j;
		if(flag1 ? !handleBOM(j = _inputBuffer[_inputPtr] << 24 | (_inputBuffer[_inputPtr + 1] & 0xff) << 16 | (_inputBuffer[_inputPtr + 2] & 0xff) << 8 | _inputBuffer[_inputPtr + 3] & 0xff) && !checkUTF32(j) && !checkUTF16(j >>> 16) : !ensureLoaded(2) || !checkUTF16((_inputBuffer[_inputPtr] & 0xff) << 8 | _inputBuffer[_inputPtr + 1] & 0xff))
	//*   6    8:iload_3         
	//*   7    9:ifeq            115
	//*   8   12:aload_0         
	//*   9   13:getfield        #43  <Field byte[] _inputBuffer>
	//*  10   16:aload_0         
	//*  11   17:getfield        #45  <Field int _inputPtr>
	//*  12   20:baload          
	//*  13   21:bipush          24
	//*  14   23:ishl            
	//*  15   24:aload_0         
	//*  16   25:getfield        #43  <Field byte[] _inputBuffer>
	//*  17   28:aload_0         
	//*  18   29:getfield        #45  <Field int _inputPtr>
	//*  19   32:iconst_1        
	//*  20   33:iadd            
	//*  21   34:baload          
	//*  22   35:sipush          255
	//*  23   38:iand            
	//*  24   39:bipush          16
	//*  25   41:ishl            
	//*  26   42:ior             
	//*  27   43:aload_0         
	//*  28   44:getfield        #43  <Field byte[] _inputBuffer>
	//*  29   47:aload_0         
	//*  30   48:getfield        #45  <Field int _inputPtr>
	//*  31   51:iconst_2        
	//*  32   52:iadd            
	//*  33   53:baload          
	//*  34   54:sipush          255
	//*  35   57:iand            
	//*  36   58:bipush          8
	//*  37   60:ishl            
	//*  38   61:ior             
	//*  39   62:aload_0         
	//*  40   63:getfield        #43  <Field byte[] _inputBuffer>
	//*  41   66:aload_0         
	//*  42   67:getfield        #45  <Field int _inputPtr>
	//*  43   70:iconst_3        
	//*  44   71:iadd            
	//*  45   72:baload          
	//*  46   73:sipush          255
	//*  47   76:iand            
	//*  48   77:ior             
	//*  49   78:istore_2        
	//*  50   79:aload_0         
	//*  51   80:iload_2         
	//*  52   81:invokespecial   #258 <Method boolean handleBOM(int)>
	//*  53   84:ifeq            90
	//*  54   87:goto            167
	//*  55   90:aload_0         
	//*  56   91:iload_2         
	//*  57   92:invokespecial   #260 <Method boolean checkUTF32(int)>
	//*  58   95:ifeq            101
	//*  59   98:goto            167
	//*  60  101:aload_0         
	//*  61  102:iload_2         
	//*  62  103:bipush          16
	//*  63  105:iushr           
	//*  64  106:invokespecial   #262 <Method boolean checkUTF16(int)>
	//*  65  109:ifeq            165
	//*  66  112:goto            167
	//*  67  115:aload_0         
	//*  68  116:iconst_2        
	//*  69  117:invokevirtual   #256 <Method boolean ensureLoaded(int)>
	//*  70  120:ifeq            165
	//*  71  123:aload_0         
	//*  72  124:aload_0         
	//*  73  125:getfield        #43  <Field byte[] _inputBuffer>
	//*  74  128:aload_0         
	//*  75  129:getfield        #45  <Field int _inputPtr>
	//*  76  132:baload          
	//*  77  133:sipush          255
	//*  78  136:iand            
	//*  79  137:bipush          8
	//*  80  139:ishl            
	//*  81  140:aload_0         
	//*  82  141:getfield        #43  <Field byte[] _inputBuffer>
	//*  83  144:aload_0         
	//*  84  145:getfield        #45  <Field int _inputPtr>
	//*  85  148:iconst_1        
	//*  86  149:iadd            
	//*  87  150:baload          
	//*  88  151:sipush          255
	//*  89  154:iand            
	//*  90  155:ior             
	//*  91  156:invokespecial   #262 <Method boolean checkUTF16(int)>
	//*  92  159:ifeq            165
	//*  93  162:goto            167
			flag = false;
	//   94  165:iconst_0        
	//   95  166:istore_1        
		JsonEncoding jsonencoding;
		if(!flag)
	//*  96  167:iload_1         
	//*  97  168:ifne            179
		{
			jsonencoding = JsonEncoding.UTF8;
	//   98  171:getstatic       #182 <Field JsonEncoding JsonEncoding.UTF8>
	//   99  174:astore          4
		} else
	//* 100  176:goto            273
		{
			int i = _bytesPerChar;
	//  101  179:aload_0         
	//  102  180:getfield        #56  <Field int _bytesPerChar>
	//  103  183:istore_1        
			if(i != 4)
	//* 104  184:iload_1         
	//* 105  185:iconst_4        
	//* 106  186:icmpeq          253
				switch(i)
	//* 107  189:iload_1         
				{
	//* 108  190:tableswitch     1 2: default 212
	//	               1 245
	//	               2 222
				default:
					throw new RuntimeException("Internal error");
	//  109  212:new             #224 <Class RuntimeException>
	//  110  215:dup             
	//  111  216:ldc1            #226 <String "Internal error">
	//  112  218:invokespecial   #227 <Method void RuntimeException(String)>
	//  113  221:athrow          

				case 2: // '\002'
					if(_bigEndian)
	//* 114  222:aload_0         
	//* 115  223:getfield        #31  <Field boolean _bigEndian>
	//* 116  226:ifeq            237
						jsonencoding = JsonEncoding.UTF16_BE;
	//  117  229:getstatic       #265 <Field JsonEncoding JsonEncoding.UTF16_BE>
	//  118  232:astore          4
					else
	//* 119  234:goto            273
						jsonencoding = JsonEncoding.UTF16_LE;
	//  120  237:getstatic       #268 <Field JsonEncoding JsonEncoding.UTF16_LE>
	//  121  240:astore          4
					break;

	//* 122  242:goto            273
				case 1: // '\001'
					jsonencoding = JsonEncoding.UTF8;
	//  123  245:getstatic       #182 <Field JsonEncoding JsonEncoding.UTF8>
	//  124  248:astore          4
					break;
				}
			else
	//* 125  250:goto            273
			if(_bigEndian)
	//* 126  253:aload_0         
	//* 127  254:getfield        #31  <Field boolean _bigEndian>
	//* 128  257:ifeq            268
				jsonencoding = JsonEncoding.UTF32_BE;
	//  129  260:getstatic       #271 <Field JsonEncoding JsonEncoding.UTF32_BE>
	//  130  263:astore          4
			else
	//* 131  265:goto            273
				jsonencoding = JsonEncoding.UTF32_LE;
	//  132  268:getstatic       #274 <Field JsonEncoding JsonEncoding.UTF32_LE>
	//  133  271:astore          4
		}
		_context.setEncoding(jsonencoding);
	//  134  273:aload_0         
	//  135  274:getfield        #33  <Field IOContext _context>
	//  136  277:aload           4
	//  137  279:invokevirtual   #278 <Method void IOContext.setEncoding(JsonEncoding)>
		return jsonencoding;
	//  138  282:aload           4
	//  139  284:areturn         
	}

	protected boolean ensureLoaded(int i)
		throws IOException
	{
		int k;
		for(int j = _inputEnd - _inputPtr; j < i; j += k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int _inputEnd>
	//*   2    4:aload_0         
	//*   3    5:getfield        #45  <Field int _inputPtr>
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_1         
	//*   8   12:icmpge          77
		{
			if(_in == null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #35  <Field InputStream _in>
	//*  11   19:ifnonnull       27
				k = -1;
	//   12   22:iconst_m1       
	//   13   23:istore_3        
			else
	//*  14   24:goto            53
				k = _in.read(_inputBuffer, _inputEnd, _inputBuffer.length - _inputEnd);
	//   15   27:aload_0         
	//   16   28:getfield        #35  <Field InputStream _in>
	//   17   31:aload_0         
	//   18   32:getfield        #43  <Field byte[] _inputBuffer>
	//   19   35:aload_0         
	//   20   36:getfield        #47  <Field int _inputEnd>
	//   21   39:aload_0         
	//   22   40:getfield        #43  <Field byte[] _inputBuffer>
	//   23   43:arraylength     
	//   24   44:aload_0         
	//   25   45:getfield        #47  <Field int _inputEnd>
	//   26   48:isub            
	//   27   49:invokevirtual   #284 <Method int InputStream.read(byte[], int, int)>
	//   28   52:istore_3        
			if(k < 1)
	//*  29   53:iload_3         
	//*  30   54:iconst_1        
	//*  31   55:icmpge          60
				return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
			_inputEnd = _inputEnd + k;
	//   34   60:aload_0         
	//   35   61:aload_0         
	//   36   62:getfield        #47  <Field int _inputEnd>
	//   37   65:iload_3         
	//   38   66:iadd            
	//   39   67:putfield        #47  <Field int _inputEnd>
		}

	//   40   70:iload_2         
	//   41   71:iload_3         
	//   42   72:iadd            
	//   43   73:istore_2        
	//*  44   74:goto            10
		return true;
	//   45   77:iconst_1        
	//   46   78:ireturn         
	}

	static final byte UTF8_BOM_1 = -17;
	static final byte UTF8_BOM_2 = -69;
	static final byte UTF8_BOM_3 = -65;
	private boolean _bigEndian;
	private final boolean _bufferRecyclable;
	private int _bytesPerChar;
	private final IOContext _context;
	private final InputStream _in;
	private final byte _inputBuffer[];
	private int _inputEnd;
	private int _inputPtr;
}
