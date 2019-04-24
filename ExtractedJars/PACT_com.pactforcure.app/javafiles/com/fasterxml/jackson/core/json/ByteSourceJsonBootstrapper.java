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
	//    1    1:invokespecial   #30  <Method void Object()>
		_bigEndian = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #32  <Field boolean _bigEndian>
		_context = iocontext;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #34  <Field IOContext _context>
		_in = inputstream;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #36  <Field InputStream _in>
		_inputBuffer = iocontext.allocReadIOBuffer();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #42  <Method byte[] IOContext.allocReadIOBuffer()>
	//   14   24:putfield        #44  <Field byte[] _inputBuffer>
		_inputPtr = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #46  <Field int _inputPtr>
		_inputEnd = 0;
	//   18   32:aload_0         
	//   19   33:iconst_0        
	//   20   34:putfield        #48  <Field int _inputEnd>
		_inputProcessed = 0;
	//   21   37:aload_0         
	//   22   38:iconst_0        
	//   23   39:putfield        #50  <Field int _inputProcessed>
		_bufferRecyclable = true;
	//   24   42:aload_0         
	//   25   43:iconst_1        
	//   26   44:putfield        #52  <Field boolean _bufferRecyclable>
	//   27   47:return          
	}

	public ByteSourceJsonBootstrapper(IOContext iocontext, byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		_bigEndian = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #32  <Field boolean _bigEndian>
		_context = iocontext;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #34  <Field IOContext _context>
		_in = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #36  <Field InputStream _in>
		_inputBuffer = abyte0;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #44  <Field byte[] _inputBuffer>
		_inputPtr = i;
	//   14   24:aload_0         
	//   15   25:iload_3         
	//   16   26:putfield        #46  <Field int _inputPtr>
		_inputEnd = i + j;
	//   17   29:aload_0         
	//   18   30:iload_3         
	//   19   31:iload           4
	//   20   33:iadd            
	//   21   34:putfield        #48  <Field int _inputEnd>
		_inputProcessed = -i;
	//   22   37:aload_0         
	//   23   38:iload_3         
	//   24   39:ineg            
	//   25   40:putfield        #50  <Field int _inputProcessed>
		_bufferRecyclable = false;
	//   26   43:aload_0         
	//   27   44:iconst_0        
	//   28   45:putfield        #52  <Field boolean _bufferRecyclable>
	//   29   48:return          
	}

	private boolean checkUTF16(int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if((0xff00 & i) != 0) goto _L2; else goto _L1
	//    2    2:ldc1            #57  <Int 65280>
	//    3    4:iload_1         
	//    4    5:iand            
	//    5    6:ifne            23
_L1:
		_bigEndian = true;
	//    6    9:aload_0         
	//    7   10:iconst_1        
	//    8   11:putfield        #32  <Field boolean _bigEndian>
_L6:
		_bytesPerChar = 2;
	//    9   14:aload_0         
	//   10   15:iconst_2        
	//   11   16:putfield        #59  <Field int _bytesPerChar>
		flag = true;
	//   12   19:iconst_1        
	//   13   20:istore_2        
_L4:
		return flag;
	//   14   21:iload_2         
	//   15   22:ireturn         
_L2:
		if((i & 0xff) != 0) goto _L4; else goto _L3
	//   16   23:iload_1         
	//   17   24:sipush          255
	//   18   27:iand            
	//   19   28:ifne            21
_L3:
		_bigEndian = false;
	//   20   31:aload_0         
	//   21   32:iconst_0        
	//   22   33:putfield        #32  <Field boolean _bigEndian>
		if(true) goto _L6; else goto _L5
	//   23   36:goto            14
_L5:
	}

	private boolean checkUTF32(int i)
		throws IOException
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(i >> 8 == 0)
	//*   2    2:iload_1         
	//*   3    3:bipush          8
	//*   4    5:ishr            
	//*   5    6:ifne            23
			_bigEndian = true;
	//    6    9:aload_0         
	//    7   10:iconst_1        
	//    8   11:putfield        #32  <Field boolean _bigEndian>
		else
	//*   9   14:aload_0         
	//*  10   15:iconst_4        
	//*  11   16:putfield        #59  <Field int _bytesPerChar>
	//*  12   19:iconst_1        
	//*  13   20:istore_2        
	//*  14   21:iload_2         
	//*  15   22:ireturn         
		if((0xffffff & i) == 0)
	//*  16   23:ldc1            #63  <Int 0xffffff>
	//*  17   25:iload_1         
	//*  18   26:iand            
	//*  19   27:ifne            38
		{
			_bigEndian = false;
	//   20   30:aload_0         
	//   21   31:iconst_0        
	//   22   32:putfield        #32  <Field boolean _bigEndian>
		} else
	//*  23   35:goto            14
		{
			if((0xff00ffff & i) != 0)
				continue;
	//   24   38:ldc1            #64  <Int 0xff00ffff>
	//   25   40:iload_1         
	//   26   41:iand            
	//   27   42:ifne            54
			reportWeirdUCS4("3412");
	//   28   45:aload_0         
	//   29   46:ldc1            #66  <String "3412">
	//   30   48:invokespecial   #70  <Method void reportWeirdUCS4(String)>
		}
		do
		{
			_bytesPerChar = 4;
			flag = true;
			do
				return flag;
			while((0xffff00ff & i) != 0);
	//   31   51:goto            14
	//   32   54:ldc1            #71  <Int -65281>
	//   33   56:iload_1         
	//   34   57:iand            
	//   35   58:ifne            21
			reportWeirdUCS4("2143");
	//   36   61:aload_0         
	//   37   62:ldc1            #73  <String "2143">
	//   38   64:invokespecial   #70  <Method void reportWeirdUCS4(String)>
		} while(true);
	//   39   67:goto            14
	}

	private boolean handleBOM(int i)
		throws IOException
	{
		i;
	//    0    0:iload_1         
		JVM INSTR lookupswitch 4: default 44
	//	               -16842752: 127
	//	               -131072: 99
	//	               65279: 77
	//	               65534: 121;
	//    1    1:lookupswitch    4: default 44
	//	               -16842752: 127
	//	               -131072: 99
	//	               65279: 77
	//	               65534: 121
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		int j;
		j = i >>> 16;
	//    2   44:iload_1         
	//    3   45:bipush          16
	//    4   47:iushr           
	//    5   48:istore_2        
		if(j == 65279)
	//*   6   49:iload_2         
	//*   7   50:ldc1            #76  <Int 65279>
	//*   8   52:icmpne          136
		{
			_inputPtr = _inputPtr + 2;
	//    9   55:aload_0         
	//   10   56:aload_0         
	//   11   57:getfield        #46  <Field int _inputPtr>
	//   12   60:iconst_2        
	//   13   61:iadd            
	//   14   62:putfield        #46  <Field int _inputPtr>
			_bytesPerChar = 2;
	//   15   65:aload_0         
	//   16   66:iconst_2        
	//   17   67:putfield        #59  <Field int _bytesPerChar>
			_bigEndian = true;
	//   18   70:aload_0         
	//   19   71:iconst_1        
	//   20   72:putfield        #32  <Field boolean _bigEndian>
			return true;
	//   21   75:iconst_1        
	//   22   76:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L4:
		_bigEndian = true;
	//   23   77:aload_0         
	//   24   78:iconst_1        
	//   25   79:putfield        #32  <Field boolean _bigEndian>
		_inputPtr = _inputPtr + 4;
	//   26   82:aload_0         
	//   27   83:aload_0         
	//   28   84:getfield        #46  <Field int _inputPtr>
	//   29   87:iconst_4        
	//   30   88:iadd            
	//   31   89:putfield        #46  <Field int _inputPtr>
		_bytesPerChar = 4;
	//   32   92:aload_0         
	//   33   93:iconst_4        
	//   34   94:putfield        #59  <Field int _bytesPerChar>
		return true;
	//   35   97:iconst_1        
	//   36   98:ireturn         
_L3:
		_inputPtr = _inputPtr + 4;
	//   37   99:aload_0         
	//   38  100:aload_0         
	//   39  101:getfield        #46  <Field int _inputPtr>
	//   40  104:iconst_4        
	//   41  105:iadd            
	//   42  106:putfield        #46  <Field int _inputPtr>
		_bytesPerChar = 4;
	//   43  109:aload_0         
	//   44  110:iconst_4        
	//   45  111:putfield        #59  <Field int _bytesPerChar>
		_bigEndian = false;
	//   46  114:aload_0         
	//   47  115:iconst_0        
	//   48  116:putfield        #32  <Field boolean _bigEndian>
		return true;
	//   49  119:iconst_1        
	//   50  120:ireturn         
_L5:
		reportWeirdUCS4("2143");
	//   51  121:aload_0         
	//   52  122:ldc1            #73  <String "2143">
	//   53  124:invokespecial   #70  <Method void reportWeirdUCS4(String)>
_L2:
		reportWeirdUCS4("3412");
	//   54  127:aload_0         
	//   55  128:ldc1            #66  <String "3412">
	//   56  130:invokespecial   #70  <Method void reportWeirdUCS4(String)>
		if(true) goto _L1; else goto _L6
	//   57  133:goto            44
_L6:
		if(j == 65534)
	//*  58  136:iload_2         
	//*  59  137:ldc1            #77  <Int 65534>
	//*  60  139:icmpne          164
		{
			_inputPtr = _inputPtr + 2;
	//   61  142:aload_0         
	//   62  143:aload_0         
	//   63  144:getfield        #46  <Field int _inputPtr>
	//   64  147:iconst_2        
	//   65  148:iadd            
	//   66  149:putfield        #46  <Field int _inputPtr>
			_bytesPerChar = 2;
	//   67  152:aload_0         
	//   68  153:iconst_2        
	//   69  154:putfield        #59  <Field int _bytesPerChar>
			_bigEndian = false;
	//   70  157:aload_0         
	//   71  158:iconst_0        
	//   72  159:putfield        #32  <Field boolean _bigEndian>
			return true;
	//   73  162:iconst_1        
	//   74  163:ireturn         
		}
		if(i >>> 8 == 0xefbbbf)
	//*  75  164:iload_1         
	//*  76  165:bipush          8
	//*  77  167:iushr           
	//*  78  168:ldc1            #78  <Int 0xefbbbf>
	//*  79  170:icmpne          195
		{
			_inputPtr = _inputPtr + 3;
	//   80  173:aload_0         
	//   81  174:aload_0         
	//   82  175:getfield        #46  <Field int _inputPtr>
	//   83  178:iconst_3        
	//   84  179:iadd            
	//   85  180:putfield        #46  <Field int _inputPtr>
			_bytesPerChar = 1;
	//   86  183:aload_0         
	//   87  184:iconst_1        
	//   88  185:putfield        #59  <Field int _bytesPerChar>
			_bigEndian = true;
	//   89  188:aload_0         
	//   90  189:iconst_1        
	//   91  190:putfield        #32  <Field boolean _bigEndian>
			return true;
	//   92  193:iconst_1        
	//   93  194:ireturn         
		} else
		{
			return false;
	//   94  195:iconst_0        
	//   95  196:ireturn         
		}
	}

	public static MatchStrength hasJSONFormat(InputAccessor inputaccessor)
		throws IOException
	{
		if(inputaccessor.hasMoreBytes()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokeinterface #86  <Method boolean InputAccessor.hasMoreBytes()>
	//    2    6:ifne            17
_L1:
		MatchStrength matchstrength = MatchStrength.INCONCLUSIVE;
	//    3    9:getstatic       #92  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//    4   12:astore          4
_L4:
		return matchstrength;
	//    5   14:aload           4
	//    6   16:areturn         
_L2:
		int i;
		MatchStrength matchstrength1;
		byte byte1 = inputaccessor.nextByte();
	//    7   17:aload_0         
	//    8   18:invokeinterface #96  <Method byte InputAccessor.nextByte()>
	//    9   23:istore_2        
		byte byte0 = byte1;
	//   10   24:iload_2         
	//   11   25:istore_1        
		if(byte1 == -17)
	//*  12   26:iload_2         
	//*  13   27:bipush          -17
	//*  14   29:icmpne          108
		{
			if(!inputaccessor.hasMoreBytes())
	//*  15   32:aload_0         
	//*  16   33:invokeinterface #86  <Method boolean InputAccessor.hasMoreBytes()>
	//*  17   38:ifne            45
				return MatchStrength.INCONCLUSIVE;
	//   18   41:getstatic       #92  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   19   44:areturn         
			if(inputaccessor.nextByte() != -69)
	//*  20   45:aload_0         
	//*  21   46:invokeinterface #96  <Method byte InputAccessor.nextByte()>
	//*  22   51:bipush          -69
	//*  23   53:icmpeq          60
				return MatchStrength.NO_MATCH;
	//   24   56:getstatic       #99  <Field MatchStrength MatchStrength.NO_MATCH>
	//   25   59:areturn         
			if(!inputaccessor.hasMoreBytes())
	//*  26   60:aload_0         
	//*  27   61:invokeinterface #86  <Method boolean InputAccessor.hasMoreBytes()>
	//*  28   66:ifne            73
				return MatchStrength.INCONCLUSIVE;
	//   29   69:getstatic       #92  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   30   72:areturn         
			if(inputaccessor.nextByte() != -65)
	//*  31   73:aload_0         
	//*  32   74:invokeinterface #96  <Method byte InputAccessor.nextByte()>
	//*  33   79:bipush          -65
	//*  34   81:icmpeq          88
				return MatchStrength.NO_MATCH;
	//   35   84:getstatic       #99  <Field MatchStrength MatchStrength.NO_MATCH>
	//   36   87:areturn         
			if(!inputaccessor.hasMoreBytes())
	//*  37   88:aload_0         
	//*  38   89:invokeinterface #86  <Method boolean InputAccessor.hasMoreBytes()>
	//*  39   94:ifne            101
				return MatchStrength.INCONCLUSIVE;
	//   40   97:getstatic       #92  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   41  100:areturn         
			byte0 = inputaccessor.nextByte();
	//   42  101:aload_0         
	//   43  102:invokeinterface #96  <Method byte InputAccessor.nextByte()>
	//   44  107:istore_1        
		}
		i = skipSpace(inputaccessor, byte0);
	//   45  108:aload_0         
	//   46  109:iload_1         
	//   47  110:invokestatic    #103 <Method int skipSpace(InputAccessor, byte)>
	//   48  113:istore_3        
		if(i < 0)
	//*  49  114:iload_3         
	//*  50  115:ifge            122
			return MatchStrength.INCONCLUSIVE;
	//   51  118:getstatic       #92  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   52  121:areturn         
		if(i == 123)
	//*  53  122:iload_3         
	//*  54  123:bipush          123
	//*  55  125:icmpne          161
		{
			i = skipSpace(inputaccessor);
	//   56  128:aload_0         
	//   57  129:invokestatic    #106 <Method int skipSpace(InputAccessor)>
	//   58  132:istore_3        
			if(i < 0)
	//*  59  133:iload_3         
	//*  60  134:ifge            141
				return MatchStrength.INCONCLUSIVE;
	//   61  137:getstatic       #92  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   62  140:areturn         
			if(i == 34 || i == 125)
	//*  63  141:iload_3         
	//*  64  142:bipush          34
	//*  65  144:icmpeq          153
	//*  66  147:iload_3         
	//*  67  148:bipush          125
	//*  68  150:icmpne          157
				return MatchStrength.SOLID_MATCH;
	//   69  153:getstatic       #109 <Field MatchStrength MatchStrength.SOLID_MATCH>
	//   70  156:areturn         
			else
				return MatchStrength.NO_MATCH;
	//   71  157:getstatic       #99  <Field MatchStrength MatchStrength.NO_MATCH>
	//   72  160:areturn         
		}
		if(i == 91)
	//*  73  161:iload_3         
	//*  74  162:bipush          91
	//*  75  164:icmpne          200
		{
			i = skipSpace(inputaccessor);
	//   76  167:aload_0         
	//   77  168:invokestatic    #106 <Method int skipSpace(InputAccessor)>
	//   78  171:istore_3        
			if(i < 0)
	//*  79  172:iload_3         
	//*  80  173:ifge            180
				return MatchStrength.INCONCLUSIVE;
	//   81  176:getstatic       #92  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   82  179:areturn         
			if(i == 93 || i == 91)
	//*  83  180:iload_3         
	//*  84  181:bipush          93
	//*  85  183:icmpeq          192
	//*  86  186:iload_3         
	//*  87  187:bipush          91
	//*  88  189:icmpne          196
				return MatchStrength.SOLID_MATCH;
	//   89  192:getstatic       #109 <Field MatchStrength MatchStrength.SOLID_MATCH>
	//   90  195:areturn         
			else
				return MatchStrength.SOLID_MATCH;
	//   91  196:getstatic       #109 <Field MatchStrength MatchStrength.SOLID_MATCH>
	//   92  199:areturn         
		}
		matchstrength1 = MatchStrength.WEAK_MATCH;
	//   93  200:getstatic       #112 <Field MatchStrength MatchStrength.WEAK_MATCH>
	//   94  203:astore          5
		matchstrength = matchstrength1;
	//   95  205:aload           5
	//   96  207:astore          4
		if(i == 34) goto _L4; else goto _L3
	//   97  209:iload_3         
	//   98  210:bipush          34
	//   99  212:icmpeq          14
_L3:
		if(i > 57)
			break; /* Loop/switch isn't completed */
	//  100  215:iload_3         
	//  101  216:bipush          57
	//  102  218:icmpgt          231
		matchstrength = matchstrength1;
	//  103  221:aload           5
	//  104  223:astore          4
		if(i >= 48) goto _L4; else goto _L5
	//  105  225:iload_3         
	//  106  226:bipush          48
	//  107  228:icmpge          14
_L5:
		if(i != 45)
			break MISSING_BLOCK_LABEL_270;
	//  108  231:iload_3         
	//  109  232:bipush          45
	//  110  234:icmpne          270
		i = skipSpace(inputaccessor);
	//  111  237:aload_0         
	//  112  238:invokestatic    #106 <Method int skipSpace(InputAccessor)>
	//  113  241:istore_3        
		if(i < 0)
	//* 114  242:iload_3         
	//* 115  243:ifge            250
			return MatchStrength.INCONCLUSIVE;
	//  116  246:getstatic       #92  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//  117  249:areturn         
		if(i > 57)
			break; /* Loop/switch isn't completed */
	//  118  250:iload_3         
	//  119  251:bipush          57
	//  120  253:icmpgt          266
		matchstrength = matchstrength1;
	//  121  256:aload           5
	//  122  258:astore          4
		if(i >= 48) goto _L4; else goto _L6
	//  123  260:iload_3         
	//  124  261:bipush          48
	//  125  263:icmpge          14
_L6:
		return MatchStrength.NO_MATCH;
	//  126  266:getstatic       #99  <Field MatchStrength MatchStrength.NO_MATCH>
	//  127  269:areturn         
		if(i == 110)
	//* 128  270:iload_3         
	//* 129  271:bipush          110
	//* 130  273:icmpne          285
			return tryMatch(inputaccessor, "ull", matchstrength1);
	//  131  276:aload_0         
	//  132  277:ldc1            #114 <String "ull">
	//  133  279:aload           5
	//  134  281:invokestatic    #118 <Method MatchStrength tryMatch(InputAccessor, String, MatchStrength)>
	//  135  284:areturn         
		if(i == 116)
	//* 136  285:iload_3         
	//* 137  286:bipush          116
	//* 138  288:icmpne          300
			return tryMatch(inputaccessor, "rue", matchstrength1);
	//  139  291:aload_0         
	//  140  292:ldc1            #120 <String "rue">
	//  141  294:aload           5
	//  142  296:invokestatic    #118 <Method MatchStrength tryMatch(InputAccessor, String, MatchStrength)>
	//  143  299:areturn         
		if(i == 102)
	//* 144  300:iload_3         
	//* 145  301:bipush          102
	//* 146  303:icmpne          315
			return tryMatch(inputaccessor, "alse", matchstrength1);
	//  147  306:aload_0         
	//  148  307:ldc1            #122 <String "alse">
	//  149  309:aload           5
	//  150  311:invokestatic    #118 <Method MatchStrength tryMatch(InputAccessor, String, MatchStrength)>
	//  151  314:areturn         
		else
			return MatchStrength.NO_MATCH;
	//  152  315:getstatic       #99  <Field MatchStrength MatchStrength.NO_MATCH>
	//  153  318:areturn         
	}

	private void reportWeirdUCS4(String s)
		throws IOException
	{
		throw new CharConversionException((new StringBuilder()).append("Unsupported UCS-4 endianness (").append(s).append(") detected").toString());
	//    0    0:new             #124 <Class CharConversionException>
	//    1    3:dup             
	//    2    4:new             #126 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #127 <Method void StringBuilder()>
	//    5   11:ldc1            #129 <String "Unsupported UCS-4 endianness (">
	//    6   13:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:ldc1            #135 <String ") detected">
	//   10   22:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   12   28:invokespecial   #141 <Method void CharConversionException(String)>
	//   13   31:athrow          
	}

	private static int skipSpace(InputAccessor inputaccessor)
		throws IOException
	{
		if(!inputaccessor.hasMoreBytes())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #86  <Method boolean InputAccessor.hasMoreBytes()>
	//*   2    6:ifne            11
			return -1;
	//    3    9:iconst_m1       
	//    4   10:ireturn         
		else
			return skipSpace(inputaccessor, inputaccessor.nextByte());
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokeinterface #96  <Method byte InputAccessor.nextByte()>
	//    8   18:invokestatic    #103 <Method int skipSpace(InputAccessor, byte)>
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
	//*  19   33:invokeinterface #86  <Method boolean InputAccessor.hasMoreBytes()>
	//*  20   38:ifne            43
				return -1;
	//   21   41:iconst_m1       
	//   22   42:ireturn         
			byte0 = inputaccessor.nextByte();
	//   23   43:aload_0         
	//   24   44:invokeinterface #96  <Method byte InputAccessor.nextByte()>
	//   25   49:istore_1        
		} while(true);
	//   26   50:goto            0
	}

	private static MatchStrength tryMatch(InputAccessor inputaccessor, String s, MatchStrength matchstrength)
		throws IOException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int j = s.length();
	//    2    2:aload_1         
	//    3    3:invokevirtual   #147 <Method int String.length()>
	//    4    6:istore          4
		do
		{
label0:
			{
				MatchStrength matchstrength1 = matchstrength;
	//    5    8:aload_2         
	//    6    9:astore          5
				if(i < j)
	//*   7   11:iload_3         
	//*   8   12:iload           4
	//*   9   14:icmpge          31
				{
					if(inputaccessor.hasMoreBytes())
						break label0;
	//   10   17:aload_0         
	//   11   18:invokeinterface #86  <Method boolean InputAccessor.hasMoreBytes()>
	//   12   23:ifne            34
					matchstrength1 = MatchStrength.INCONCLUSIVE;
	//   13   26:getstatic       #92  <Field MatchStrength MatchStrength.INCONCLUSIVE>
	//   14   29:astore          5
				}
				return matchstrength1;
	//   15   31:aload           5
	//   16   33:areturn         
			}
			if(inputaccessor.nextByte() != s.charAt(i))
	//*  17   34:aload_0         
	//*  18   35:invokeinterface #96  <Method byte InputAccessor.nextByte()>
	//*  19   40:aload_1         
	//*  20   41:iload_3         
	//*  21   42:invokevirtual   #151 <Method char String.charAt(int)>
	//*  22   45:icmpeq          52
				return MatchStrength.NO_MATCH;
	//   23   48:getstatic       #99  <Field MatchStrength MatchStrength.NO_MATCH>
	//   24   51:areturn         
			i++;
	//   25   52:iload_3         
	//   26   53:iconst_1        
	//   27   54:iadd            
	//   28   55:istore_3        
		} while(true);
	//   29   56:goto            8
	}

	public JsonParser constructParser(int i, ObjectCodec objectcodec, ByteQuadsCanonicalizer bytequadscanonicalizer, CharsToNameCanonicalizer charstonamecanonicalizer, int j)
		throws IOException
	{
		if(detectEncoding() == JsonEncoding.UTF8 && com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(j))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #157 <Method JsonEncoding detectEncoding()>
	//*   2    4:getstatic       #163 <Field JsonEncoding JsonEncoding.UTF8>
	//*   3    7:if_acmpne       63
	//*   4   10:getstatic       #169 <Field com.fasterxml.jackson.core.JsonFactory$Feature com.fasterxml.jackson.core.JsonFactory$Feature.CANONICALIZE_FIELD_NAMES>
	//*   5   13:iload           5
	//*   6   15:invokevirtual   #172 <Method boolean com.fasterxml.jackson.core.JsonFactory$Feature.enabledIn(int)>
	//*   7   18:ifeq            63
		{
			bytequadscanonicalizer = bytequadscanonicalizer.makeChild(j);
	//    8   21:aload_3         
	//    9   22:iload           5
	//   10   24:invokevirtual   #178 <Method ByteQuadsCanonicalizer ByteQuadsCanonicalizer.makeChild(int)>
	//   11   27:astore_3        
			return ((JsonParser) (new UTF8StreamJsonParser(_context, i, _in, objectcodec, bytequadscanonicalizer, _inputBuffer, _inputPtr, _inputEnd, _bufferRecyclable)));
	//   12   28:new             #180 <Class UTF8StreamJsonParser>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:getfield        #34  <Field IOContext _context>
	//   16   36:iload_1         
	//   17   37:aload_0         
	//   18   38:getfield        #36  <Field InputStream _in>
	//   19   41:aload_2         
	//   20   42:aload_3         
	//   21   43:aload_0         
	//   22   44:getfield        #44  <Field byte[] _inputBuffer>
	//   23   47:aload_0         
	//   24   48:getfield        #46  <Field int _inputPtr>
	//   25   51:aload_0         
	//   26   52:getfield        #48  <Field int _inputEnd>
	//   27   55:aload_0         
	//   28   56:getfield        #52  <Field boolean _bufferRecyclable>
	//   29   59:invokespecial   #183 <Method void UTF8StreamJsonParser(IOContext, int, InputStream, ObjectCodec, ByteQuadsCanonicalizer, byte[], int, int, boolean)>
	//   30   62:areturn         
		} else
		{
			return ((JsonParser) (new ReaderBasedJsonParser(_context, i, constructReader(), objectcodec, charstonamecanonicalizer.makeChild(j))));
	//   31   63:new             #185 <Class ReaderBasedJsonParser>
	//   32   66:dup             
	//   33   67:aload_0         
	//   34   68:getfield        #34  <Field IOContext _context>
	//   35   71:iload_1         
	//   36   72:aload_0         
	//   37   73:invokevirtual   #189 <Method Reader constructReader()>
	//   38   76:aload_2         
	//   39   77:aload           4
	//   40   79:iload           5
	//   41   81:invokevirtual   #194 <Method CharsToNameCanonicalizer CharsToNameCanonicalizer.makeChild(int)>
	//   42   84:invokespecial   #197 <Method void ReaderBasedJsonParser(IOContext, int, Reader, ObjectCodec, CharsToNameCanonicalizer)>
	//   43   87:areturn         
		}
	}

	public Reader constructReader()
		throws IOException
	{
		JsonEncoding jsonencoding = _context.getEncoding();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IOContext _context>
	//    2    4:invokevirtual   #200 <Method JsonEncoding IOContext.getEncoding()>
	//    3    7:astore_2        
		switch(jsonencoding.bits())
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #203 <Method int JsonEncoding.bits()>
		{
	//*   6   12:lookupswitch    3: default 48
	//	               8: 58
	//	               16: 58
	//	               32: 139
		default:
			throw new RuntimeException("Internal error");
	//    7   48:new             #205 <Class RuntimeException>
	//    8   51:dup             
	//    9   52:ldc1            #207 <String "Internal error">
	//   10   54:invokespecial   #208 <Method void RuntimeException(String)>
	//   11   57:athrow          

		case 8: // '\b'
		case 16: // '\020'
			Object obj = ((Object) (_in));
	//   12   58:aload_0         
	//   13   59:getfield        #36  <Field InputStream _in>
	//   14   62:astore_1        
			if(obj == null)
	//*  15   63:aload_1         
	//*  16   64:ifnonnull       100
				obj = ((Object) (new ByteArrayInputStream(_inputBuffer, _inputPtr, _inputEnd)));
	//   17   67:new             #210 <Class ByteArrayInputStream>
	//   18   70:dup             
	//   19   71:aload_0         
	//   20   72:getfield        #44  <Field byte[] _inputBuffer>
	//   21   75:aload_0         
	//   22   76:getfield        #46  <Field int _inputPtr>
	//   23   79:aload_0         
	//   24   80:getfield        #48  <Field int _inputEnd>
	//   25   83:invokespecial   #213 <Method void ByteArrayInputStream(byte[], int, int)>
	//   26   86:astore_1        
			else
	//*  27   87:new             #215 <Class InputStreamReader>
	//*  28   90:dup             
	//*  29   91:aload_1         
	//*  30   92:aload_2         
	//*  31   93:invokevirtual   #218 <Method String JsonEncoding.getJavaName()>
	//*  32   96:invokespecial   #221 <Method void InputStreamReader(InputStream, String)>
	//*  33   99:areturn         
			if(_inputPtr < _inputEnd)
	//*  34  100:aload_0         
	//*  35  101:getfield        #46  <Field int _inputPtr>
	//*  36  104:aload_0         
	//*  37  105:getfield        #48  <Field int _inputEnd>
	//*  38  108:icmpge          177
				obj = ((Object) (new MergedStream(_context, ((InputStream) (obj)), _inputBuffer, _inputPtr, _inputEnd)));
	//   39  111:new             #223 <Class MergedStream>
	//   40  114:dup             
	//   41  115:aload_0         
	//   42  116:getfield        #34  <Field IOContext _context>
	//   43  119:aload_1         
	//   44  120:aload_0         
	//   45  121:getfield        #44  <Field byte[] _inputBuffer>
	//   46  124:aload_0         
	//   47  125:getfield        #46  <Field int _inputPtr>
	//   48  128:aload_0         
	//   49  129:getfield        #48  <Field int _inputEnd>
	//   50  132:invokespecial   #226 <Method void MergedStream(IOContext, InputStream, byte[], int, int)>
	//   51  135:astore_1        
			return ((Reader) (new InputStreamReader(((InputStream) (obj)), jsonencoding.getJavaName())));

	//*  52  136:goto            87
		case 32: // ' '
			return ((Reader) (new UTF32Reader(_context, _in, _inputBuffer, _inputPtr, _inputEnd, _context.getEncoding().isBigEndian())));
	//   53  139:new             #228 <Class UTF32Reader>
	//   54  142:dup             
	//   55  143:aload_0         
	//   56  144:getfield        #34  <Field IOContext _context>
	//   57  147:aload_0         
	//   58  148:getfield        #36  <Field InputStream _in>
	//   59  151:aload_0         
	//   60  152:getfield        #44  <Field byte[] _inputBuffer>
	//   61  155:aload_0         
	//   62  156:getfield        #46  <Field int _inputPtr>
	//   63  159:aload_0         
	//   64  160:getfield        #48  <Field int _inputEnd>
	//   65  163:aload_0         
	//   66  164:getfield        #34  <Field IOContext _context>
	//   67  167:invokevirtual   #200 <Method JsonEncoding IOContext.getEncoding()>
	//   68  170:invokevirtual   #231 <Method boolean JsonEncoding.isBigEndian()>
	//   69  173:invokespecial   #234 <Method void UTF32Reader(IOContext, InputStream, byte[], int, int, boolean)>
	//   70  176:areturn         
		}
	//*  71  177:goto            87
	}

	public JsonEncoding detectEncoding()
		throws IOException
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(!ensureLoaded(4)) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:iconst_4        
	//    4    4:invokevirtual   #237 <Method boolean ensureLoaded(int)>
	//    5    7:ifeq            139
_L1:
		int i = _inputBuffer[_inputPtr] << 24 | (_inputBuffer[_inputPtr + 1] & 0xff) << 16 | (_inputBuffer[_inputPtr + 2] & 0xff) << 8 | _inputBuffer[_inputPtr + 3] & 0xff;
	//    6   10:aload_0         
	//    7   11:getfield        #44  <Field byte[] _inputBuffer>
	//    8   14:aload_0         
	//    9   15:getfield        #46  <Field int _inputPtr>
	//   10   18:baload          
	//   11   19:bipush          24
	//   12   21:ishl            
	//   13   22:aload_0         
	//   14   23:getfield        #44  <Field byte[] _inputBuffer>
	//   15   26:aload_0         
	//   16   27:getfield        #46  <Field int _inputPtr>
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:baload          
	//   20   33:sipush          255
	//   21   36:iand            
	//   22   37:bipush          16
	//   23   39:ishl            
	//   24   40:ior             
	//   25   41:aload_0         
	//   26   42:getfield        #44  <Field byte[] _inputBuffer>
	//   27   45:aload_0         
	//   28   46:getfield        #46  <Field int _inputPtr>
	//   29   49:iconst_2        
	//   30   50:iadd            
	//   31   51:baload          
	//   32   52:sipush          255
	//   33   55:iand            
	//   34   56:bipush          8
	//   35   58:ishl            
	//   36   59:ior             
	//   37   60:aload_0         
	//   38   61:getfield        #44  <Field byte[] _inputBuffer>
	//   39   64:aload_0         
	//   40   65:getfield        #46  <Field int _inputPtr>
	//   41   68:iconst_3        
	//   42   69:iadd            
	//   43   70:baload          
	//   44   71:sipush          255
	//   45   74:iand            
	//   46   75:ior             
	//   47   76:istore_3        
		if(!handleBOM(i)) goto _L4; else goto _L3
	//   48   77:aload_0         
	//   49   78:iload_3         
	//   50   79:invokespecial   #239 <Method boolean handleBOM(int)>
	//   51   82:ifeq            108
_L3:
		boolean flag = true;
	//   52   85:iconst_1        
	//   53   86:istore_1        
_L10:
		if(flag) goto _L6; else goto _L5
	//   54   87:iload_1         
	//   55   88:ifne            195
_L5:
		JsonEncoding jsonencoding = JsonEncoding.UTF8;
	//   56   91:getstatic       #163 <Field JsonEncoding JsonEncoding.UTF8>
	//   57   94:astore          4
_L8:
		_context.setEncoding(jsonencoding);
	//   58   96:aload_0         
	//   59   97:getfield        #34  <Field IOContext _context>
	//   60  100:aload           4
	//   61  102:invokevirtual   #243 <Method void IOContext.setEncoding(JsonEncoding)>
		return jsonencoding;
	//   62  105:aload           4
	//   63  107:areturn         
_L4:
		if(checkUTF32(i))
	//*  64  108:aload_0         
	//*  65  109:iload_3         
	//*  66  110:invokespecial   #245 <Method boolean checkUTF32(int)>
	//*  67  113:ifeq            121
		{
			flag = true;
	//   68  116:iconst_1        
	//   69  117:istore_1        
		} else
	//*  70  118:goto            87
		{
			flag = flag1;
	//   71  121:iload_2         
	//   72  122:istore_1        
			if(checkUTF16(i >>> 16))
	//*  73  123:aload_0         
	//*  74  124:iload_3         
	//*  75  125:bipush          16
	//*  76  127:iushr           
	//*  77  128:invokespecial   #247 <Method boolean checkUTF16(int)>
	//*  78  131:ifeq            87
				flag = true;
	//   79  134:iconst_1        
	//   80  135:istore_1        
		}
		continue; /* Loop/switch isn't completed */
	//   81  136:goto            87
_L2:
		flag = flag1;
	//   82  139:iload_2         
	//   83  140:istore_1        
		if(ensureLoaded(2))
	//*  84  141:aload_0         
	//*  85  142:iconst_2        
	//*  86  143:invokevirtual   #237 <Method boolean ensureLoaded(int)>
	//*  87  146:ifeq            87
		{
			flag = flag1;
	//   88  149:iload_2         
	//   89  150:istore_1        
			if(checkUTF16((_inputBuffer[_inputPtr] & 0xff) << 8 | _inputBuffer[_inputPtr + 1] & 0xff))
	//*  90  151:aload_0         
	//*  91  152:aload_0         
	//*  92  153:getfield        #44  <Field byte[] _inputBuffer>
	//*  93  156:aload_0         
	//*  94  157:getfield        #46  <Field int _inputPtr>
	//*  95  160:baload          
	//*  96  161:sipush          255
	//*  97  164:iand            
	//*  98  165:bipush          8
	//*  99  167:ishl            
	//* 100  168:aload_0         
	//* 101  169:getfield        #44  <Field byte[] _inputBuffer>
	//* 102  172:aload_0         
	//* 103  173:getfield        #46  <Field int _inputPtr>
	//* 104  176:iconst_1        
	//* 105  177:iadd            
	//* 106  178:baload          
	//* 107  179:sipush          255
	//* 108  182:iand            
	//* 109  183:ior             
	//* 110  184:invokespecial   #247 <Method boolean checkUTF16(int)>
	//* 111  187:ifeq            87
				flag = true;
	//  112  190:iconst_1        
	//  113  191:istore_1        
		}
		continue; /* Loop/switch isn't completed */
	//  114  192:goto            87
_L6:
		switch(_bytesPerChar)
	//* 115  195:aload_0         
	//* 116  196:getfield        #59  <Field int _bytesPerChar>
		{
	//* 117  199:tableswitch     1 4: default 228
	//	               1 238
	//	               2 246
	//	               3 228
	//	               4 269
		case 3: // '\003'
		default:
			throw new RuntimeException("Internal error");
	//  118  228:new             #205 <Class RuntimeException>
	//  119  231:dup             
	//  120  232:ldc1            #207 <String "Internal error">
	//  121  234:invokespecial   #208 <Method void RuntimeException(String)>
	//  122  237:athrow          

		case 1: // '\001'
			jsonencoding = JsonEncoding.UTF8;
	//  123  238:getstatic       #163 <Field JsonEncoding JsonEncoding.UTF8>
	//  124  241:astore          4
			break;

	//* 125  243:goto            96
		case 2: // '\002'
			if(_bigEndian)
	//* 126  246:aload_0         
	//* 127  247:getfield        #32  <Field boolean _bigEndian>
	//* 128  250:ifeq            261
				jsonencoding = JsonEncoding.UTF16_BE;
	//  129  253:getstatic       #250 <Field JsonEncoding JsonEncoding.UTF16_BE>
	//  130  256:astore          4
			else
	//* 131  258:goto            96
				jsonencoding = JsonEncoding.UTF16_LE;
	//  132  261:getstatic       #253 <Field JsonEncoding JsonEncoding.UTF16_LE>
	//  133  264:astore          4
			break;

	//* 134  266:goto            258
		case 4: // '\004'
			if(_bigEndian)
	//* 135  269:aload_0         
	//* 136  270:getfield        #32  <Field boolean _bigEndian>
	//* 137  273:ifeq            284
				jsonencoding = JsonEncoding.UTF32_BE;
	//  138  276:getstatic       #256 <Field JsonEncoding JsonEncoding.UTF32_BE>
	//  139  279:astore          4
			else
	//* 140  281:goto            96
				jsonencoding = JsonEncoding.UTF32_LE;
	//  141  284:getstatic       #259 <Field JsonEncoding JsonEncoding.UTF32_LE>
	//  142  287:astore          4
			break;
		}
		if(true) goto _L8; else goto _L7
_L7:
		if(true) goto _L10; else goto _L9
_L9:
	//* 143  289:goto            281
	}

	protected boolean ensureLoaded(int i)
		throws IOException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		int j = _inputEnd - _inputPtr;
	//    2    3:aload_0         
	//    3    4:getfield        #48  <Field int _inputEnd>
	//    4    7:aload_0         
	//    5    8:getfield        #46  <Field int _inputPtr>
	//    6   11:isub            
	//    7   12:istore_2        
		do
		{
			int k;
label0:
			{
				boolean flag = flag1;
	//    8   13:iload           5
	//    9   15:istore          4
				if(j < i)
	//*  10   17:iload_2         
	//*  11   18:iload_1         
	//*  12   19:icmpge          39
				{
					if(_in == null)
	//*  13   22:aload_0         
	//*  14   23:getfield        #36  <Field InputStream _in>
	//*  15   26:ifnonnull       42
						k = -1;
	//   16   29:iconst_m1       
	//   17   30:istore_3        
					else
	//*  18   31:iload_3         
	//*  19   32:iconst_1        
	//*  20   33:icmpge          71
	//*  21   36:iconst_0        
	//*  22   37:istore          4
	//*  23   39:iload           4
	//*  24   41:ireturn         
						k = _in.read(_inputBuffer, _inputEnd, _inputBuffer.length - _inputEnd);
	//   25   42:aload_0         
	//   26   43:getfield        #36  <Field InputStream _in>
	//   27   46:aload_0         
	//   28   47:getfield        #44  <Field byte[] _inputBuffer>
	//   29   50:aload_0         
	//   30   51:getfield        #48  <Field int _inputEnd>
	//   31   54:aload_0         
	//   32   55:getfield        #44  <Field byte[] _inputBuffer>
	//   33   58:arraylength     
	//   34   59:aload_0         
	//   35   60:getfield        #48  <Field int _inputEnd>
	//   36   63:isub            
	//   37   64:invokevirtual   #265 <Method int InputStream.read(byte[], int, int)>
	//   38   67:istore_3        
					if(k >= 1)
						break label0;
					flag = false;
				}
				return flag;
			}
	//*  39   68:goto            31
			_inputEnd = _inputEnd + k;
	//   40   71:aload_0         
	//   41   72:aload_0         
	//   42   73:getfield        #48  <Field int _inputEnd>
	//   43   76:iload_3         
	//   44   77:iadd            
	//   45   78:putfield        #48  <Field int _inputEnd>
			j += k;
	//   46   81:iload_2         
	//   47   82:iload_3         
	//   48   83:iadd            
	//   49   84:istore_2        
		} while(true);
	//   50   85:goto            13
	}

	static final byte UTF8_BOM_1 = -17;
	static final byte UTF8_BOM_2 = -69;
	static final byte UTF8_BOM_3 = -65;
	protected boolean _bigEndian;
	private final boolean _bufferRecyclable;
	protected int _bytesPerChar;
	protected final IOContext _context;
	protected final InputStream _in;
	protected final byte _inputBuffer[];
	private int _inputEnd;
	protected int _inputProcessed;
	private int _inputPtr;
}
