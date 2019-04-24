// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.core:
//			Base64Variants

public final class Base64Variant
	implements Serializable
{

	public Base64Variant(Base64Variant base64variant, String s, int i)
	{
		this(base64variant, s, base64variant._usesPadding, base64variant._paddingChar, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:getfield        #36  <Field boolean _usesPadding>
	//    5    7:aload_1         
	//    6    8:getfield        #38  <Field char _paddingChar>
	//    7   11:iload_3         
	//    8   12:invokespecial   #41  <Method void Base64Variant(Base64Variant, String, boolean, char, int)>
	//    9   15:return          
	}

	public Base64Variant(Base64Variant base64variant, String s, boolean flag, char c, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		_asciiToBase64 = new int[128];
	//    2    4:aload_0         
	//    3    5:sipush          128
	//    4    8:newarray        int[]
	//    5   10:putfield        #47  <Field int[] _asciiToBase64>
		_base64ToAsciiC = new char[64];
	//    6   13:aload_0         
	//    7   14:bipush          64
	//    8   16:newarray        char[]
	//    9   18:putfield        #49  <Field char[] _base64ToAsciiC>
		_base64ToAsciiB = new byte[64];
	//   10   21:aload_0         
	//   11   22:bipush          64
	//   12   24:newarray        byte[]
	//   13   26:putfield        #51  <Field byte[] _base64ToAsciiB>
		_name = s;
	//   14   29:aload_0         
	//   15   30:aload_2         
	//   16   31:putfield        #53  <Field String _name>
		s = ((String) (base64variant._base64ToAsciiB));
	//   17   34:aload_1         
	//   18   35:getfield        #51  <Field byte[] _base64ToAsciiB>
	//   19   38:astore_2        
		System.arraycopy(((Object) (s)), 0, ((Object) (_base64ToAsciiB)), 0, s.length);
	//   20   39:aload_2         
	//   21   40:iconst_0        
	//   22   41:aload_0         
	//   23   42:getfield        #51  <Field byte[] _base64ToAsciiB>
	//   24   45:iconst_0        
	//   25   46:aload_2         
	//   26   47:arraylength     
	//   27   48:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
		s = ((String) (base64variant._base64ToAsciiC));
	//   28   51:aload_1         
	//   29   52:getfield        #49  <Field char[] _base64ToAsciiC>
	//   30   55:astore_2        
		System.arraycopy(((Object) (s)), 0, ((Object) (_base64ToAsciiC)), 0, s.length);
	//   31   56:aload_2         
	//   32   57:iconst_0        
	//   33   58:aload_0         
	//   34   59:getfield        #49  <Field char[] _base64ToAsciiC>
	//   35   62:iconst_0        
	//   36   63:aload_2         
	//   37   64:arraylength     
	//   38   65:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
		base64variant = ((Base64Variant) (base64variant._asciiToBase64));
	//   39   68:aload_1         
	//   40   69:getfield        #47  <Field int[] _asciiToBase64>
	//   41   72:astore_1        
		System.arraycopy(((Object) (base64variant)), 0, ((Object) (_asciiToBase64)), 0, base64variant.length);
	//   42   73:aload_1         
	//   43   74:iconst_0        
	//   44   75:aload_0         
	//   45   76:getfield        #47  <Field int[] _asciiToBase64>
	//   46   79:iconst_0        
	//   47   80:aload_1         
	//   48   81:arraylength     
	//   49   82:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
		_usesPadding = flag;
	//   50   85:aload_0         
	//   51   86:iload_3         
	//   52   87:putfield        #36  <Field boolean _usesPadding>
		_paddingChar = c;
	//   53   90:aload_0         
	//   54   91:iload           4
	//   55   93:putfield        #38  <Field char _paddingChar>
		_maxLineLength = i;
	//   56   96:aload_0         
	//   57   97:iload           5
	//   58   99:putfield        #61  <Field int _maxLineLength>
	//   59  102:return          
	}

	public Base64Variant(String s, String s1, boolean flag, char c, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		_asciiToBase64 = new int[128];
	//    2    4:aload_0         
	//    3    5:sipush          128
	//    4    8:newarray        int[]
	//    5   10:putfield        #47  <Field int[] _asciiToBase64>
		_base64ToAsciiC = new char[64];
	//    6   13:aload_0         
	//    7   14:bipush          64
	//    8   16:newarray        char[]
	//    9   18:putfield        #49  <Field char[] _base64ToAsciiC>
		_base64ToAsciiB = new byte[64];
	//   10   21:aload_0         
	//   11   22:bipush          64
	//   12   24:newarray        byte[]
	//   13   26:putfield        #51  <Field byte[] _base64ToAsciiB>
		_name = s;
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:putfield        #53  <Field String _name>
		_usesPadding = flag;
	//   17   34:aload_0         
	//   18   35:iload_3         
	//   19   36:putfield        #36  <Field boolean _usesPadding>
		_paddingChar = c;
	//   20   39:aload_0         
	//   21   40:iload           4
	//   22   42:putfield        #38  <Field char _paddingChar>
		_maxLineLength = i;
	//   23   45:aload_0         
	//   24   46:iload           5
	//   25   48:putfield        #61  <Field int _maxLineLength>
		int j = s1.length();
	//   26   51:aload_2         
	//   27   52:invokevirtual   #68  <Method int String.length()>
	//   28   55:istore          6
		if(j != 64)
	//*  29   57:iload           6
	//*  30   59:bipush          64
	//*  31   61:icmpeq          105
		{
			s = ((String) (new StringBuilder()));
	//   32   64:new             #70  <Class StringBuilder>
	//   33   67:dup             
	//   34   68:invokespecial   #71  <Method void StringBuilder()>
	//   35   71:astore_1        
			((StringBuilder) (s)).append("Base64Alphabet length must be exactly 64 (was ");
	//   36   72:aload_1         
	//   37   73:ldc1            #73  <String "Base64Alphabet length must be exactly 64 (was ">
	//   38   75:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
			((StringBuilder) (s)).append(j);
	//   40   79:aload_1         
	//   41   80:iload           6
	//   42   82:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
	//   43   85:pop             
			((StringBuilder) (s)).append(")");
	//   44   86:aload_1         
	//   45   87:ldc1            #82  <String ")">
	//   46   89:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   47   92:pop             
			throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   48   93:new             #84  <Class IllegalArgumentException>
	//   49   96:dup             
	//   50   97:aload_1         
	//   51   98:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   52  101:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   53  104:athrow          
		}
		s = ((String) (_base64ToAsciiC));
	//   54  105:aload_0         
	//   55  106:getfield        #49  <Field char[] _base64ToAsciiC>
	//   56  109:astore_1        
		i = 0;
	//   57  110:iconst_0        
	//   58  111:istore          5
		s1.getChars(0, j, ((char []) (s)), 0);
	//   59  113:aload_2         
	//   60  114:iconst_0        
	//   61  115:iload           6
	//   62  117:aload_1         
	//   63  118:iconst_0        
	//   64  119:invokevirtual   #95  <Method void String.getChars(int, int, char[], int)>
		Arrays.fill(_asciiToBase64, -1);
	//   65  122:aload_0         
	//   66  123:getfield        #47  <Field int[] _asciiToBase64>
	//   67  126:iconst_m1       
	//   68  127:invokestatic    #101 <Method void Arrays.fill(int[], int)>
		for(; i < j; i++)
	//*  69  130:iload           5
	//*  70  132:iload           6
	//*  71  134:icmpge          174
		{
			char c1 = _base64ToAsciiC[i];
	//   72  137:aload_0         
	//   73  138:getfield        #49  <Field char[] _base64ToAsciiC>
	//   74  141:iload           5
	//   75  143:caload          
	//   76  144:istore          7
			_base64ToAsciiB[i] = (byte)c1;
	//   77  146:aload_0         
	//   78  147:getfield        #51  <Field byte[] _base64ToAsciiB>
	//   79  150:iload           5
	//   80  152:iload           7
	//   81  154:int2byte        
	//   82  155:bastore         
			_asciiToBase64[c1] = i;
	//   83  156:aload_0         
	//   84  157:getfield        #47  <Field int[] _asciiToBase64>
	//   85  160:iload           7
	//   86  162:iload           5
	//   87  164:iastore         
		}

	//   88  165:iload           5
	//   89  167:iconst_1        
	//   90  168:iadd            
	//   91  169:istore          5
	//*  92  171:goto            130
		if(flag)
	//*  93  174:iload_3         
	//*  94  175:ifeq            187
			_asciiToBase64[c] = -2;
	//   95  178:aload_0         
	//   96  179:getfield        #47  <Field int[] _asciiToBase64>
	//   97  182:iload           4
	//   98  184:bipush          -2
	//   99  186:iastore         
	//  100  187:return          
	}

	protected void _reportBase64EOF()
		throws IllegalArgumentException
	{
		throw new IllegalArgumentException("Unexpected end-of-String in base64 content");
	//    0    0:new             #84  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #104 <String "Unexpected end-of-String in base64 content">
	//    3    6:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//    4    9:athrow          
	}

	protected void _reportInvalidBase64(char c, int i, String s)
		throws IllegalArgumentException
	{
		Object obj;
		if(c <= ' ')
	//*   0    0:iload_1         
	//*   1    1:bipush          32
	//*   2    3:icmpgt          68
		{
			obj = ((Object) (new StringBuilder()));
	//    3    6:new             #70  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #71  <Method void StringBuilder()>
	//    6   13:astore          4
			((StringBuilder) (obj)).append("Illegal white space character (code 0x");
	//    7   15:aload           4
	//    8   17:ldc1            #109 <String "Illegal white space character (code 0x">
	//    9   19:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			((StringBuilder) (obj)).append(Integer.toHexString(((int) (c))));
	//   11   23:aload           4
	//   12   25:iload_1         
	//   13   26:invokestatic    #115 <Method String Integer.toHexString(int)>
	//   14   29:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
			((StringBuilder) (obj)).append(") as character #");
	//   16   33:aload           4
	//   17   35:ldc1            #117 <String ") as character #">
	//   18   37:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
			((StringBuilder) (obj)).append(i + 1);
	//   20   41:aload           4
	//   21   43:iload_2         
	//   22   44:iconst_1        
	//   23   45:iadd            
	//   24   46:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
	//   25   49:pop             
			((StringBuilder) (obj)).append(" of 4-char base64 unit: can only used between units");
	//   26   50:aload           4
	//   27   52:ldc1            #119 <String " of 4-char base64 unit: can only used between units">
	//   28   54:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   30   58:aload           4
	//   31   60:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   32   63:astore          4
		} else
	//*  33   65:goto            257
		if(usesPaddingChar(c))
	//*  34   68:aload_0         
	//*  35   69:iload_1         
	//*  36   70:invokevirtual   #123 <Method boolean usesPaddingChar(char)>
	//*  37   73:ifeq            138
		{
			obj = ((Object) (new StringBuilder()));
	//   38   76:new             #70  <Class StringBuilder>
	//   39   79:dup             
	//   40   80:invokespecial   #71  <Method void StringBuilder()>
	//   41   83:astore          4
			((StringBuilder) (obj)).append("Unexpected padding character ('");
	//   42   85:aload           4
	//   43   87:ldc1            #125 <String "Unexpected padding character ('">
	//   44   89:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   45   92:pop             
			((StringBuilder) (obj)).append(getPaddingChar());
	//   46   93:aload           4
	//   47   95:aload_0         
	//   48   96:invokevirtual   #129 <Method char getPaddingChar()>
	//   49   99:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//   50  102:pop             
			((StringBuilder) (obj)).append("') as character #");
	//   51  103:aload           4
	//   52  105:ldc1            #134 <String "') as character #">
	//   53  107:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   54  110:pop             
			((StringBuilder) (obj)).append(i + 1);
	//   55  111:aload           4
	//   56  113:iload_2         
	//   57  114:iconst_1        
	//   58  115:iadd            
	//   59  116:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
	//   60  119:pop             
			((StringBuilder) (obj)).append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
	//   61  120:aload           4
	//   62  122:ldc1            #136 <String " of 4-char base64 unit: padding only legal as 3rd or 4th character">
	//   63  124:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   64  127:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   65  128:aload           4
	//   66  130:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   67  133:astore          4
		} else
	//*  68  135:goto            257
		if(Character.isDefined(c) && !Character.isISOControl(c))
	//*  69  138:iload_1         
	//*  70  139:invokestatic    #141 <Method boolean Character.isDefined(char)>
	//*  71  142:ifeq            215
	//*  72  145:iload_1         
	//*  73  146:invokestatic    #144 <Method boolean Character.isISOControl(char)>
	//*  74  149:ifeq            155
	//*  75  152:goto            215
		{
			obj = ((Object) (new StringBuilder()));
	//   76  155:new             #70  <Class StringBuilder>
	//   77  158:dup             
	//   78  159:invokespecial   #71  <Method void StringBuilder()>
	//   79  162:astore          4
			((StringBuilder) (obj)).append("Illegal character '");
	//   80  164:aload           4
	//   81  166:ldc1            #146 <String "Illegal character '">
	//   82  168:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   83  171:pop             
			((StringBuilder) (obj)).append(c);
	//   84  172:aload           4
	//   85  174:iload_1         
	//   86  175:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//   87  178:pop             
			((StringBuilder) (obj)).append("' (code 0x");
	//   88  179:aload           4
	//   89  181:ldc1            #148 <String "' (code 0x">
	//   90  183:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   91  186:pop             
			((StringBuilder) (obj)).append(Integer.toHexString(((int) (c))));
	//   92  187:aload           4
	//   93  189:iload_1         
	//   94  190:invokestatic    #115 <Method String Integer.toHexString(int)>
	//   95  193:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   96  196:pop             
			((StringBuilder) (obj)).append(") in base64 content");
	//   97  197:aload           4
	//   98  199:ldc1            #150 <String ") in base64 content">
	//   99  201:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  100  204:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  101  205:aload           4
	//  102  207:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  103  210:astore          4
		} else
	//* 104  212:goto            257
		{
			obj = ((Object) (new StringBuilder()));
	//  105  215:new             #70  <Class StringBuilder>
	//  106  218:dup             
	//  107  219:invokespecial   #71  <Method void StringBuilder()>
	//  108  222:astore          4
			((StringBuilder) (obj)).append("Illegal character (code 0x");
	//  109  224:aload           4
	//  110  226:ldc1            #152 <String "Illegal character (code 0x">
	//  111  228:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  112  231:pop             
			((StringBuilder) (obj)).append(Integer.toHexString(((int) (c))));
	//  113  232:aload           4
	//  114  234:iload_1         
	//  115  235:invokestatic    #115 <Method String Integer.toHexString(int)>
	//  116  238:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  117  241:pop             
			((StringBuilder) (obj)).append(") in base64 content");
	//  118  242:aload           4
	//  119  244:ldc1            #150 <String ") in base64 content">
	//  120  246:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  121  249:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  122  250:aload           4
	//  123  252:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  124  255:astore          4
		}
		Object obj1 = obj;
	//  125  257:aload           4
	//  126  259:astore          5
		if(s != null)
	//* 127  261:aload_3         
	//* 128  262:ifnull          304
		{
			obj1 = ((Object) (new StringBuilder()));
	//  129  265:new             #70  <Class StringBuilder>
	//  130  268:dup             
	//  131  269:invokespecial   #71  <Method void StringBuilder()>
	//  132  272:astore          5
			((StringBuilder) (obj1)).append(((String) (obj)));
	//  133  274:aload           5
	//  134  276:aload           4
	//  135  278:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  136  281:pop             
			((StringBuilder) (obj1)).append(": ");
	//  137  282:aload           5
	//  138  284:ldc1            #154 <String ": ">
	//  139  286:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  140  289:pop             
			((StringBuilder) (obj1)).append(s);
	//  141  290:aload           5
	//  142  292:aload_3         
	//  143  293:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  144  296:pop             
			obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//  145  297:aload           5
	//  146  299:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  147  302:astore          5
		}
		throw new IllegalArgumentException(((String) (obj1)));
	//  148  304:new             #84  <Class IllegalArgumentException>
	//  149  307:dup             
	//  150  308:aload           5
	//  151  310:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//  152  313:athrow          
	}

	public void decode(String s, ByteArrayBuilder bytearraybuilder)
		throws IllegalArgumentException
	{
		int k = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #68  <Method int String.length()>
	//    2    4:istore          6
		for(int i = 0; i < k;)
	//*   3    6:iconst_0        
	//*   4    7:istore          4
	//*   5    9:iload           4
	//*   6   11:iload           6
	//*   7   13:icmpge          381
		{
			char c;
			int j;
			do
			{
				j = i + 1;
	//    8   16:iload           4
	//    9   18:iconst_1        
	//   10   19:iadd            
	//   11   20:istore          5
				c = s.charAt(i);
	//   12   22:aload_1         
	//   13   23:iload           4
	//   14   25:invokevirtual   #160 <Method char String.charAt(int)>
	//   15   28:istore_3        
				if(j >= k || c > ' ')
	//*  16   29:iload           5
	//*  17   31:iload           6
	//*  18   33:icmpge          52
	//*  19   36:iload_3         
	//*  20   37:bipush          32
	//*  21   39:icmple          45
					break;
	//   22   42:goto            52
				i = j;
	//   23   45:iload           5
	//   24   47:istore          4
			} while(true);
	//   25   49:goto            16
			int l = decodeBase64Char(c);
	//   26   52:aload_0         
	//   27   53:iload_3         
	//   28   54:invokevirtual   #164 <Method int decodeBase64Char(char)>
	//   29   57:istore          7
			if(l < 0)
	//*  30   59:iload           7
	//*  31   61:ifge            71
				_reportInvalidBase64(c, 0, ((String) (null)));
	//   32   64:aload_0         
	//   33   65:iload_3         
	//   34   66:iconst_0        
	//   35   67:aconst_null     
	//   36   68:invokevirtual   #166 <Method void _reportInvalidBase64(char, int, String)>
			if(j >= k)
	//*  37   71:iload           5
	//*  38   73:iload           6
	//*  39   75:icmplt          82
				_reportBase64EOF();
	//   40   78:aload_0         
	//   41   79:invokevirtual   #168 <Method void _reportBase64EOF()>
			i = j + 1;
	//   42   82:iload           5
	//   43   84:iconst_1        
	//   44   85:iadd            
	//   45   86:istore          4
			c = s.charAt(j);
	//   46   88:aload_1         
	//   47   89:iload           5
	//   48   91:invokevirtual   #160 <Method char String.charAt(int)>
	//   49   94:istore_3        
			j = decodeBase64Char(c);
	//   50   95:aload_0         
	//   51   96:iload_3         
	//   52   97:invokevirtual   #164 <Method int decodeBase64Char(char)>
	//   53  100:istore          5
			if(j < 0)
	//*  54  102:iload           5
	//*  55  104:ifge            114
				_reportInvalidBase64(c, 1, ((String) (null)));
	//   56  107:aload_0         
	//   57  108:iload_3         
	//   58  109:iconst_1        
	//   59  110:aconst_null     
	//   60  111:invokevirtual   #166 <Method void _reportInvalidBase64(char, int, String)>
			l = l << 6 | j;
	//   61  114:iload           7
	//   62  116:bipush          6
	//   63  118:ishl            
	//   64  119:iload           5
	//   65  121:ior             
	//   66  122:istore          7
			if(i >= k)
	//*  67  124:iload           4
	//*  68  126:iload           6
	//*  69  128:icmplt          151
			{
				if(!usesPadding())
	//*  70  131:aload_0         
	//*  71  132:invokevirtual   #172 <Method boolean usesPadding()>
	//*  72  135:ifne            147
				{
					bytearraybuilder.append(l >> 4);
	//   73  138:aload_2         
	//   74  139:iload           7
	//   75  141:iconst_4        
	//   76  142:ishr            
	//   77  143:invokevirtual   #177 <Method void ByteArrayBuilder.append(int)>
					return;
	//   78  146:return          
				}
				_reportBase64EOF();
	//   79  147:aload_0         
	//   80  148:invokevirtual   #168 <Method void _reportBase64EOF()>
			}
			j = i + 1;
	//   81  151:iload           4
	//   82  153:iconst_1        
	//   83  154:iadd            
	//   84  155:istore          5
			c = s.charAt(i);
	//   85  157:aload_1         
	//   86  158:iload           4
	//   87  160:invokevirtual   #160 <Method char String.charAt(int)>
	//   88  163:istore_3        
			i = decodeBase64Char(c);
	//   89  164:aload_0         
	//   90  165:iload_3         
	//   91  166:invokevirtual   #164 <Method int decodeBase64Char(char)>
	//   92  169:istore          4
			if(i < 0)
	//*  93  171:iload           4
	//*  94  173:ifge            279
			{
				if(i != -2)
	//*  95  176:iload           4
	//*  96  178:bipush          -2
	//*  97  180:icmpeq          190
					_reportInvalidBase64(c, 2, ((String) (null)));
	//   98  183:aload_0         
	//   99  184:iload_3         
	//  100  185:iconst_2        
	//  101  186:aconst_null     
	//  102  187:invokevirtual   #166 <Method void _reportInvalidBase64(char, int, String)>
				if(j >= k)
	//* 103  190:iload           5
	//* 104  192:iload           6
	//* 105  194:icmplt          201
					_reportBase64EOF();
	//  106  197:aload_0         
	//  107  198:invokevirtual   #168 <Method void _reportBase64EOF()>
				i = j + 1;
	//  108  201:iload           5
	//  109  203:iconst_1        
	//  110  204:iadd            
	//  111  205:istore          4
				c = s.charAt(j);
	//  112  207:aload_1         
	//  113  208:iload           5
	//  114  210:invokevirtual   #160 <Method char String.charAt(int)>
	//  115  213:istore_3        
				if(!usesPaddingChar(c))
	//* 116  214:aload_0         
	//* 117  215:iload_3         
	//* 118  216:invokevirtual   #123 <Method boolean usesPaddingChar(char)>
	//* 119  219:ifne            268
				{
					StringBuilder stringbuilder = new StringBuilder();
	//  120  222:new             #70  <Class StringBuilder>
	//  121  225:dup             
	//  122  226:invokespecial   #71  <Method void StringBuilder()>
	//  123  229:astore          8
					stringbuilder.append("expected padding character '");
	//  124  231:aload           8
	//  125  233:ldc1            #179 <String "expected padding character '">
	//  126  235:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  127  238:pop             
					stringbuilder.append(getPaddingChar());
	//  128  239:aload           8
	//  129  241:aload_0         
	//  130  242:invokevirtual   #129 <Method char getPaddingChar()>
	//  131  245:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//  132  248:pop             
					stringbuilder.append("'");
	//  133  249:aload           8
	//  134  251:ldc1            #181 <String "'">
	//  135  253:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  136  256:pop             
					_reportInvalidBase64(c, 3, stringbuilder.toString());
	//  137  257:aload_0         
	//  138  258:iload_3         
	//  139  259:iconst_3        
	//  140  260:aload           8
	//  141  262:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  142  265:invokevirtual   #166 <Method void _reportInvalidBase64(char, int, String)>
				}
				bytearraybuilder.append(l >> 4);
	//  143  268:aload_2         
	//  144  269:iload           7
	//  145  271:iconst_4        
	//  146  272:ishr            
	//  147  273:invokevirtual   #177 <Method void ByteArrayBuilder.append(int)>
			} else
	//* 148  276:goto            9
			{
				i = l << 6 | i;
	//  149  279:iload           7
	//  150  281:bipush          6
	//  151  283:ishl            
	//  152  284:iload           4
	//  153  286:ior             
	//  154  287:istore          4
				if(j >= k)
	//* 155  289:iload           5
	//* 156  291:iload           6
	//* 157  293:icmplt          316
				{
					if(!usesPadding())
	//* 158  296:aload_0         
	//* 159  297:invokevirtual   #172 <Method boolean usesPadding()>
	//* 160  300:ifne            312
					{
						bytearraybuilder.appendTwoBytes(i >> 2);
	//  161  303:aload_2         
	//  162  304:iload           4
	//  163  306:iconst_2        
	//  164  307:ishr            
	//  165  308:invokevirtual   #184 <Method void ByteArrayBuilder.appendTwoBytes(int)>
						return;
	//  166  311:return          
					}
					_reportBase64EOF();
	//  167  312:aload_0         
	//  168  313:invokevirtual   #168 <Method void _reportBase64EOF()>
				}
				char c1 = s.charAt(j);
	//  169  316:aload_1         
	//  170  317:iload           5
	//  171  319:invokevirtual   #160 <Method char String.charAt(int)>
	//  172  322:istore_3        
				l = decodeBase64Char(c1);
	//  173  323:aload_0         
	//  174  324:iload_3         
	//  175  325:invokevirtual   #164 <Method int decodeBase64Char(char)>
	//  176  328:istore          7
				if(l < 0)
	//* 177  330:iload           7
	//* 178  332:ifge            360
				{
					if(l != -2)
	//* 179  335:iload           7
	//* 180  337:bipush          -2
	//* 181  339:icmpeq          349
						_reportInvalidBase64(c1, 3, ((String) (null)));
	//  182  342:aload_0         
	//  183  343:iload_3         
	//  184  344:iconst_3        
	//  185  345:aconst_null     
	//  186  346:invokevirtual   #166 <Method void _reportInvalidBase64(char, int, String)>
					bytearraybuilder.appendTwoBytes(i >> 2);
	//  187  349:aload_2         
	//  188  350:iload           4
	//  189  352:iconst_2        
	//  190  353:ishr            
	//  191  354:invokevirtual   #184 <Method void ByteArrayBuilder.appendTwoBytes(int)>
				} else
	//* 192  357:goto            372
				{
					bytearraybuilder.appendThreeBytes(i << 6 | l);
	//  193  360:aload_2         
	//  194  361:iload           4
	//  195  363:bipush          6
	//  196  365:ishl            
	//  197  366:iload           7
	//  198  368:ior             
	//  199  369:invokevirtual   #187 <Method void ByteArrayBuilder.appendThreeBytes(int)>
				}
				i = j + 1;
	//  200  372:iload           5
	//  201  374:iconst_1        
	//  202  375:iadd            
	//  203  376:istore          4
			}
		}

	//* 204  378:goto            9
	//  205  381:return          
	}

	public byte[] decode(String s)
		throws IllegalArgumentException
	{
		ByteArrayBuilder bytearraybuilder = new ByteArrayBuilder();
	//    0    0:new             #174 <Class ByteArrayBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #189 <Method void ByteArrayBuilder()>
	//    3    7:astore_2        
		decode(s, bytearraybuilder);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #191 <Method void decode(String, ByteArrayBuilder)>
		return bytearraybuilder.toByteArray();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #195 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   10   18:areturn         
	}

	public int decodeBase64Byte(byte byte0)
	{
		if(byte0 < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            6
			return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
		else
			return _asciiToBase64[byte0];
	//    4    6:aload_0         
	//    5    7:getfield        #47  <Field int[] _asciiToBase64>
	//    6   10:iload_1         
	//    7   11:iaload          
	//    8   12:ireturn         
	}

	public int decodeBase64Char(char c)
	{
		if(c <= '\177')
	//*   0    0:iload_1         
	//*   1    1:bipush          127
	//*   2    3:icmpgt          13
			return _asciiToBase64[c];
	//    3    6:aload_0         
	//    4    7:getfield        #47  <Field int[] _asciiToBase64>
	//    5   10:iload_1         
	//    6   11:iaload          
	//    7   12:ireturn         
		else
			return -1;
	//    8   13:iconst_m1       
	//    9   14:ireturn         
	}

	public int decodeBase64Char(int i)
	{
		if(i <= 127)
	//*   0    0:iload_1         
	//*   1    1:bipush          127
	//*   2    3:icmpgt          13
			return _asciiToBase64[i];
	//    3    6:aload_0         
	//    4    7:getfield        #47  <Field int[] _asciiToBase64>
	//    5   10:iload_1         
	//    6   11:iaload          
	//    7   12:ireturn         
		else
			return -1;
	//    8   13:iconst_m1       
	//    9   14:ireturn         
	}

	public String encode(byte abyte0[])
	{
		return encode(abyte0, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #203 <Method String encode(byte[], boolean)>
	//    4    6:areturn         
	}

	public String encode(byte abyte0[], boolean flag)
	{
		int j1 = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          6
		StringBuilder stringbuilder = new StringBuilder((j1 >> 2) + j1 + (j1 >> 3));
	//    3    4:new             #70  <Class StringBuilder>
	//    4    7:dup             
	//    5    8:iload           6
	//    6   10:iconst_2        
	//    7   11:ishr            
	//    8   12:iload           6
	//    9   14:iadd            
	//   10   15:iload           6
	//   11   17:iconst_3        
	//   12   18:ishr            
	//   13   19:iadd            
	//   14   20:invokespecial   #205 <Method void StringBuilder(int)>
	//   15   23:astore          8
		if(flag)
	//*  16   25:iload_2         
	//*  17   26:ifeq            37
			stringbuilder.append('"');
	//   18   29:aload           8
	//   19   31:bipush          34
	//   20   33:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//   21   36:pop             
		int j = getMaxLineLength() >> 2;
	//   22   37:aload_0         
	//   23   38:invokevirtual   #208 <Method int getMaxLineLength()>
	//   24   41:iconst_2        
	//   25   42:ishr            
	//   26   43:istore          4
		int i;
		int l;
		for(i = 0; i <= j1 - 3; i = l)
	//*  27   45:iconst_0        
	//*  28   46:istore_3        
	//*  29   47:iload_3         
	//*  30   48:iload           6
	//*  31   50:iconst_3        
	//*  32   51:isub            
	//*  33   52:icmpgt          153
		{
			int k1 = i + 1;
	//   34   55:iload_3         
	//   35   56:iconst_1        
	//   36   57:iadd            
	//   37   58:istore          7
			i = ((int) (abyte0[i]));
	//   38   60:aload_1         
	//   39   61:iload_3         
	//   40   62:baload          
	//   41   63:istore_3        
			l = k1 + 1;
	//   42   64:iload           7
	//   43   66:iconst_1        
	//   44   67:iadd            
	//   45   68:istore          5
			encodeBase64Chunk(stringbuilder, (i << 8 | abyte0[k1] & 0xff) << 8 | abyte0[l] & 0xff);
	//   46   70:aload_0         
	//   47   71:aload           8
	//   48   73:iload_3         
	//   49   74:bipush          8
	//   50   76:ishl            
	//   51   77:aload_1         
	//   52   78:iload           7
	//   53   80:baload          
	//   54   81:sipush          255
	//   55   84:iand            
	//   56   85:ior             
	//   57   86:bipush          8
	//   58   88:ishl            
	//   59   89:aload_1         
	//   60   90:iload           5
	//   61   92:baload          
	//   62   93:sipush          255
	//   63   96:iand            
	//   64   97:ior             
	//   65   98:invokevirtual   #212 <Method void encodeBase64Chunk(StringBuilder, int)>
			j--;
	//   66  101:iload           4
	//   67  103:iconst_1        
	//   68  104:isub            
	//   69  105:istore          4
			i = j;
	//   70  107:iload           4
	//   71  109:istore_3        
			if(j <= 0)
	//*  72  110:iload           4
	//*  73  112:ifgt            138
			{
				stringbuilder.append('\\');
	//   74  115:aload           8
	//   75  117:bipush          92
	//   76  119:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//   77  122:pop             
				stringbuilder.append('n');
	//   78  123:aload           8
	//   79  125:bipush          110
	//   80  127:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//   81  130:pop             
				i = getMaxLineLength() >> 2;
	//   82  131:aload_0         
	//   83  132:invokevirtual   #208 <Method int getMaxLineLength()>
	//   84  135:iconst_2        
	//   85  136:ishr            
	//   86  137:istore_3        
			}
			l++;
	//   87  138:iload           5
	//   88  140:iconst_1        
	//   89  141:iadd            
	//   90  142:istore          5
			j = i;
	//   91  144:iload_3         
	//   92  145:istore          4
		}

	//   93  147:iload           5
	//   94  149:istore_3        
	//*  95  150:goto            47
		j1 -= i;
	//   96  153:iload           6
	//   97  155:iload_3         
	//   98  156:isub            
	//   99  157:istore          6
		if(j1 > 0)
	//* 100  159:iload           6
	//* 101  161:ifle            209
		{
			int i1 = abyte0[i] << 16;
	//  102  164:aload_1         
	//  103  165:iload_3         
	//  104  166:baload          
	//  105  167:bipush          16
	//  106  169:ishl            
	//  107  170:istore          5
			int k = i1;
	//  108  172:iload           5
	//  109  174:istore          4
			if(j1 == 2)
	//* 110  176:iload           6
	//* 111  178:iconst_2        
	//* 112  179:icmpne          199
				k = i1 | (abyte0[i + 1] & 0xff) << 8;
	//  113  182:iload           5
	//  114  184:aload_1         
	//  115  185:iload_3         
	//  116  186:iconst_1        
	//  117  187:iadd            
	//  118  188:baload          
	//  119  189:sipush          255
	//  120  192:iand            
	//  121  193:bipush          8
	//  122  195:ishl            
	//  123  196:ior             
	//  124  197:istore          4
			encodeBase64Partial(stringbuilder, k, j1);
	//  125  199:aload_0         
	//  126  200:aload           8
	//  127  202:iload           4
	//  128  204:iload           6
	//  129  206:invokevirtual   #216 <Method void encodeBase64Partial(StringBuilder, int, int)>
		}
		if(flag)
	//* 130  209:iload_2         
	//* 131  210:ifeq            221
			stringbuilder.append('"');
	//  132  213:aload           8
	//  133  215:bipush          34
	//  134  217:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//  135  220:pop             
		return stringbuilder.toString();
	//  136  221:aload           8
	//  137  223:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  138  226:areturn         
	}

	public byte encodeBase64BitsAsByte(int i)
	{
		return _base64ToAsciiB[i];
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field byte[] _base64ToAsciiB>
	//    2    4:iload_1         
	//    3    5:baload          
	//    4    6:ireturn         
	}

	public char encodeBase64BitsAsChar(int i)
	{
		return _base64ToAsciiC[i];
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field char[] _base64ToAsciiC>
	//    2    4:iload_1         
	//    3    5:caload          
	//    4    6:ireturn         
	}

	public int encodeBase64Chunk(int i, byte abyte0[], int j)
	{
		int k = j + 1;
	//    0    0:iload_3         
	//    1    1:iconst_1        
	//    2    2:iadd            
	//    3    3:istore          4
		abyte0[j] = _base64ToAsciiB[i >> 18 & 0x3f];
	//    4    5:aload_2         
	//    5    6:iload_3         
	//    6    7:aload_0         
	//    7    8:getfield        #51  <Field byte[] _base64ToAsciiB>
	//    8   11:iload_1         
	//    9   12:bipush          18
	//   10   14:ishr            
	//   11   15:bipush          63
	//   12   17:iand            
	//   13   18:baload          
	//   14   19:bastore         
		j = k + 1;
	//   15   20:iload           4
	//   16   22:iconst_1        
	//   17   23:iadd            
	//   18   24:istore_3        
		abyte0[k] = _base64ToAsciiB[i >> 12 & 0x3f];
	//   19   25:aload_2         
	//   20   26:iload           4
	//   21   28:aload_0         
	//   22   29:getfield        #51  <Field byte[] _base64ToAsciiB>
	//   23   32:iload_1         
	//   24   33:bipush          12
	//   25   35:ishr            
	//   26   36:bipush          63
	//   27   38:iand            
	//   28   39:baload          
	//   29   40:bastore         
		k = j + 1;
	//   30   41:iload_3         
	//   31   42:iconst_1        
	//   32   43:iadd            
	//   33   44:istore          4
		abyte0[j] = _base64ToAsciiB[i >> 6 & 0x3f];
	//   34   46:aload_2         
	//   35   47:iload_3         
	//   36   48:aload_0         
	//   37   49:getfield        #51  <Field byte[] _base64ToAsciiB>
	//   38   52:iload_1         
	//   39   53:bipush          6
	//   40   55:ishr            
	//   41   56:bipush          63
	//   42   58:iand            
	//   43   59:baload          
	//   44   60:bastore         
		abyte0[k] = _base64ToAsciiB[i & 0x3f];
	//   45   61:aload_2         
	//   46   62:iload           4
	//   47   64:aload_0         
	//   48   65:getfield        #51  <Field byte[] _base64ToAsciiB>
	//   49   68:iload_1         
	//   50   69:bipush          63
	//   51   71:iand            
	//   52   72:baload          
	//   53   73:bastore         
		return k + 1;
	//   54   74:iload           4
	//   55   76:iconst_1        
	//   56   77:iadd            
	//   57   78:ireturn         
	}

	public int encodeBase64Chunk(int i, char ac[], int j)
	{
		int k = j + 1;
	//    0    0:iload_3         
	//    1    1:iconst_1        
	//    2    2:iadd            
	//    3    3:istore          4
		ac[j] = _base64ToAsciiC[i >> 18 & 0x3f];
	//    4    5:aload_2         
	//    5    6:iload_3         
	//    6    7:aload_0         
	//    7    8:getfield        #49  <Field char[] _base64ToAsciiC>
	//    8   11:iload_1         
	//    9   12:bipush          18
	//   10   14:ishr            
	//   11   15:bipush          63
	//   12   17:iand            
	//   13   18:caload          
	//   14   19:castore         
		j = k + 1;
	//   15   20:iload           4
	//   16   22:iconst_1        
	//   17   23:iadd            
	//   18   24:istore_3        
		ac[k] = _base64ToAsciiC[i >> 12 & 0x3f];
	//   19   25:aload_2         
	//   20   26:iload           4
	//   21   28:aload_0         
	//   22   29:getfield        #49  <Field char[] _base64ToAsciiC>
	//   23   32:iload_1         
	//   24   33:bipush          12
	//   25   35:ishr            
	//   26   36:bipush          63
	//   27   38:iand            
	//   28   39:caload          
	//   29   40:castore         
		k = j + 1;
	//   30   41:iload_3         
	//   31   42:iconst_1        
	//   32   43:iadd            
	//   33   44:istore          4
		ac[j] = _base64ToAsciiC[i >> 6 & 0x3f];
	//   34   46:aload_2         
	//   35   47:iload_3         
	//   36   48:aload_0         
	//   37   49:getfield        #49  <Field char[] _base64ToAsciiC>
	//   38   52:iload_1         
	//   39   53:bipush          6
	//   40   55:ishr            
	//   41   56:bipush          63
	//   42   58:iand            
	//   43   59:caload          
	//   44   60:castore         
		ac[k] = _base64ToAsciiC[i & 0x3f];
	//   45   61:aload_2         
	//   46   62:iload           4
	//   47   64:aload_0         
	//   48   65:getfield        #49  <Field char[] _base64ToAsciiC>
	//   49   68:iload_1         
	//   50   69:bipush          63
	//   51   71:iand            
	//   52   72:caload          
	//   53   73:castore         
		return k + 1;
	//   54   74:iload           4
	//   55   76:iconst_1        
	//   56   77:iadd            
	//   57   78:ireturn         
	}

	public void encodeBase64Chunk(StringBuilder stringbuilder, int i)
	{
		stringbuilder.append(_base64ToAsciiC[i >> 18 & 0x3f]);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field char[] _base64ToAsciiC>
	//    3    5:iload_2         
	//    4    6:bipush          18
	//    5    8:ishr            
	//    6    9:bipush          63
	//    7   11:iand            
	//    8   12:caload          
	//    9   13:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//   10   16:pop             
		stringbuilder.append(_base64ToAsciiC[i >> 12 & 0x3f]);
	//   11   17:aload_1         
	//   12   18:aload_0         
	//   13   19:getfield        #49  <Field char[] _base64ToAsciiC>
	//   14   22:iload_2         
	//   15   23:bipush          12
	//   16   25:ishr            
	//   17   26:bipush          63
	//   18   28:iand            
	//   19   29:caload          
	//   20   30:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//   21   33:pop             
		stringbuilder.append(_base64ToAsciiC[i >> 6 & 0x3f]);
	//   22   34:aload_1         
	//   23   35:aload_0         
	//   24   36:getfield        #49  <Field char[] _base64ToAsciiC>
	//   25   39:iload_2         
	//   26   40:bipush          6
	//   27   42:ishr            
	//   28   43:bipush          63
	//   29   45:iand            
	//   30   46:caload          
	//   31   47:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//   32   50:pop             
		stringbuilder.append(_base64ToAsciiC[i & 0x3f]);
	//   33   51:aload_1         
	//   34   52:aload_0         
	//   35   53:getfield        #49  <Field char[] _base64ToAsciiC>
	//   36   56:iload_2         
	//   37   57:bipush          63
	//   38   59:iand            
	//   39   60:caload          
	//   40   61:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//   41   64:pop             
	//   42   65:return          
	}

	public int encodeBase64Partial(int i, int j, byte abyte0[], int k)
	{
		int i1 = k + 1;
	//    0    0:iload           4
	//    1    2:iconst_1        
	//    2    3:iadd            
	//    3    4:istore          8
		abyte0[k] = _base64ToAsciiB[i >> 18 & 0x3f];
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:aload_0         
	//    7   10:getfield        #51  <Field byte[] _base64ToAsciiB>
	//    8   13:iload_1         
	//    9   14:bipush          18
	//   10   16:ishr            
	//   11   17:bipush          63
	//   12   19:iand            
	//   13   20:baload          
	//   14   21:bastore         
		int l = i1 + 1;
	//   15   22:iload           8
	//   16   24:iconst_1        
	//   17   25:iadd            
	//   18   26:istore          7
		abyte0[i1] = _base64ToAsciiB[i >> 12 & 0x3f];
	//   19   28:aload_3         
	//   20   29:iload           8
	//   21   31:aload_0         
	//   22   32:getfield        #51  <Field byte[] _base64ToAsciiB>
	//   23   35:iload_1         
	//   24   36:bipush          12
	//   25   38:ishr            
	//   26   39:bipush          63
	//   27   41:iand            
	//   28   42:baload          
	//   29   43:bastore         
		if(_usesPadding)
	//*  30   44:aload_0         
	//*  31   45:getfield        #36  <Field boolean _usesPadding>
	//*  32   48:ifeq            107
		{
			byte byte1 = (byte)_paddingChar;
	//   33   51:aload_0         
	//   34   52:getfield        #38  <Field char _paddingChar>
	//   35   55:int2byte        
	//   36   56:istore          6
			k = l + 1;
	//   37   58:iload           7
	//   38   60:iconst_1        
	//   39   61:iadd            
	//   40   62:istore          4
			byte byte0;
			if(j == 2)
	//*  41   64:iload_2         
	//*  42   65:iconst_2        
	//*  43   66:icmpne          86
				byte0 = _base64ToAsciiB[i >> 6 & 0x3f];
	//   44   69:aload_0         
	//   45   70:getfield        #51  <Field byte[] _base64ToAsciiB>
	//   46   73:iload_1         
	//   47   74:bipush          6
	//   48   76:ishr            
	//   49   77:bipush          63
	//   50   79:iand            
	//   51   80:baload          
	//   52   81:istore          5
			else
	//*  53   83:goto            90
				byte0 = byte1;
	//   54   86:iload           6
	//   55   88:istore          5
			abyte0[l] = byte0;
	//   56   90:aload_3         
	//   57   91:iload           7
	//   58   93:iload           5
	//   59   95:bastore         
			abyte0[k] = byte1;
	//   60   96:aload_3         
	//   61   97:iload           4
	//   62   99:iload           6
	//   63  101:bastore         
			return k + 1;
	//   64  102:iload           4
	//   65  104:iconst_1        
	//   66  105:iadd            
	//   67  106:ireturn         
		}
		k = l;
	//   68  107:iload           7
	//   69  109:istore          4
		if(j == 2)
	//*  70  111:iload_2         
	//*  71  112:iconst_2        
	//*  72  113:icmpne          138
		{
			abyte0[l] = _base64ToAsciiB[i >> 6 & 0x3f];
	//   73  116:aload_3         
	//   74  117:iload           7
	//   75  119:aload_0         
	//   76  120:getfield        #51  <Field byte[] _base64ToAsciiB>
	//   77  123:iload_1         
	//   78  124:bipush          6
	//   79  126:ishr            
	//   80  127:bipush          63
	//   81  129:iand            
	//   82  130:baload          
	//   83  131:bastore         
			k = l + 1;
	//   84  132:iload           7
	//   85  134:iconst_1        
	//   86  135:iadd            
	//   87  136:istore          4
		}
		return k;
	//   88  138:iload           4
	//   89  140:ireturn         
	}

	public int encodeBase64Partial(int i, int j, char ac[], int k)
	{
		int i1 = k + 1;
	//    0    0:iload           4
	//    1    2:iconst_1        
	//    2    3:iadd            
	//    3    4:istore          7
		ac[k] = _base64ToAsciiC[i >> 18 & 0x3f];
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:aload_0         
	//    7   10:getfield        #49  <Field char[] _base64ToAsciiC>
	//    8   13:iload_1         
	//    9   14:bipush          18
	//   10   16:ishr            
	//   11   17:bipush          63
	//   12   19:iand            
	//   13   20:caload          
	//   14   21:castore         
		int l = i1 + 1;
	//   15   22:iload           7
	//   16   24:iconst_1        
	//   17   25:iadd            
	//   18   26:istore          6
		ac[i1] = _base64ToAsciiC[i >> 12 & 0x3f];
	//   19   28:aload_3         
	//   20   29:iload           7
	//   21   31:aload_0         
	//   22   32:getfield        #49  <Field char[] _base64ToAsciiC>
	//   23   35:iload_1         
	//   24   36:bipush          12
	//   25   38:ishr            
	//   26   39:bipush          63
	//   27   41:iand            
	//   28   42:caload          
	//   29   43:castore         
		if(_usesPadding)
	//*  30   44:aload_0         
	//*  31   45:getfield        #36  <Field boolean _usesPadding>
	//*  32   48:ifeq            104
		{
			k = l + 1;
	//   33   51:iload           6
	//   34   53:iconst_1        
	//   35   54:iadd            
	//   36   55:istore          4
			char c;
			if(j == 2)
	//*  37   57:iload_2         
	//*  38   58:iconst_2        
	//*  39   59:icmpne          79
				c = _base64ToAsciiC[i >> 6 & 0x3f];
	//   40   62:aload_0         
	//   41   63:getfield        #49  <Field char[] _base64ToAsciiC>
	//   42   66:iload_1         
	//   43   67:bipush          6
	//   44   69:ishr            
	//   45   70:bipush          63
	//   46   72:iand            
	//   47   73:caload          
	//   48   74:istore          5
			else
	//*  49   76:goto            85
				c = _paddingChar;
	//   50   79:aload_0         
	//   51   80:getfield        #38  <Field char _paddingChar>
	//   52   83:istore          5
			ac[l] = c;
	//   53   85:aload_3         
	//   54   86:iload           6
	//   55   88:iload           5
	//   56   90:castore         
			ac[k] = _paddingChar;
	//   57   91:aload_3         
	//   58   92:iload           4
	//   59   94:aload_0         
	//   60   95:getfield        #38  <Field char _paddingChar>
	//   61   98:castore         
			return k + 1;
	//   62   99:iload           4
	//   63  101:iconst_1        
	//   64  102:iadd            
	//   65  103:ireturn         
		}
		k = l;
	//   66  104:iload           6
	//   67  106:istore          4
		if(j == 2)
	//*  68  108:iload_2         
	//*  69  109:iconst_2        
	//*  70  110:icmpne          135
		{
			ac[l] = _base64ToAsciiC[i >> 6 & 0x3f];
	//   71  113:aload_3         
	//   72  114:iload           6
	//   73  116:aload_0         
	//   74  117:getfield        #49  <Field char[] _base64ToAsciiC>
	//   75  120:iload_1         
	//   76  121:bipush          6
	//   77  123:ishr            
	//   78  124:bipush          63
	//   79  126:iand            
	//   80  127:caload          
	//   81  128:castore         
			k = l + 1;
	//   82  129:iload           6
	//   83  131:iconst_1        
	//   84  132:iadd            
	//   85  133:istore          4
		}
		return k;
	//   86  135:iload           4
	//   87  137:ireturn         
	}

	public void encodeBase64Partial(StringBuilder stringbuilder, int i, int j)
	{
		stringbuilder.append(_base64ToAsciiC[i >> 18 & 0x3f]);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field char[] _base64ToAsciiC>
	//    3    5:iload_2         
	//    4    6:bipush          18
	//    5    8:ishr            
	//    6    9:bipush          63
	//    7   11:iand            
	//    8   12:caload          
	//    9   13:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//   10   16:pop             
		stringbuilder.append(_base64ToAsciiC[i >> 12 & 0x3f]);
	//   11   17:aload_1         
	//   12   18:aload_0         
	//   13   19:getfield        #49  <Field char[] _base64ToAsciiC>
	//   14   22:iload_2         
	//   15   23:bipush          12
	//   16   25:ishr            
	//   17   26:bipush          63
	//   18   28:iand            
	//   19   29:caload          
	//   20   30:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//   21   33:pop             
		if(_usesPadding)
	//*  22   34:aload_0         
	//*  23   35:getfield        #36  <Field boolean _usesPadding>
	//*  24   38:ifeq            86
		{
			char c;
			if(j == 2)
	//*  25   41:iload_3         
	//*  26   42:iconst_2        
	//*  27   43:icmpne          63
				c = _base64ToAsciiC[i >> 6 & 0x3f];
	//   28   46:aload_0         
	//   29   47:getfield        #49  <Field char[] _base64ToAsciiC>
	//   30   50:iload_2         
	//   31   51:bipush          6
	//   32   53:ishr            
	//   33   54:bipush          63
	//   34   56:iand            
	//   35   57:caload          
	//   36   58:istore          4
			else
	//*  37   60:goto            69
				c = _paddingChar;
	//   38   63:aload_0         
	//   39   64:getfield        #38  <Field char _paddingChar>
	//   40   67:istore          4
			stringbuilder.append(c);
	//   41   69:aload_1         
	//   42   70:iload           4
	//   43   72:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//   44   75:pop             
			stringbuilder.append(_paddingChar);
	//   45   76:aload_1         
	//   46   77:aload_0         
	//   47   78:getfield        #38  <Field char _paddingChar>
	//   48   81:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//   49   84:pop             
			return;
	//   50   85:return          
		}
		if(j == 2)
	//*  51   86:iload_3         
	//*  52   87:iconst_2        
	//*  53   88:icmpne          108
			stringbuilder.append(_base64ToAsciiC[i >> 6 & 0x3f]);
	//   54   91:aload_1         
	//   55   92:aload_0         
	//   56   93:getfield        #49  <Field char[] _base64ToAsciiC>
	//   57   96:iload_2         
	//   58   97:bipush          6
	//   59   99:ishr            
	//   60  100:bipush          63
	//   61  102:iand            
	//   62  103:caload          
	//   63  104:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//   64  107:pop             
	//   65  108:return          
	}

	public boolean equals(Object obj)
	{
		return obj == this;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpne       7
	//    3    5:iconst_1        
	//    4    6:ireturn         
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}

	public int getMaxLineLength()
	{
		return _maxLineLength;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _maxLineLength>
	//    2    4:ireturn         
	}

	public String getName()
	{
		return _name;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String _name>
	//    2    4:areturn         
	}

	public byte getPaddingByte()
	{
		return (byte)_paddingChar;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field char _paddingChar>
	//    2    4:int2byte        
	//    3    5:ireturn         
	}

	public char getPaddingChar()
	{
		return _paddingChar;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field char _paddingChar>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return _name.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String _name>
	//    2    4:invokevirtual   #231 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	protected Object readResolve()
	{
		return ((Object) (Base64Variants.valueOf(_name)));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String _name>
	//    2    4:invokestatic    #239 <Method Base64Variant Base64Variants.valueOf(String)>
	//    3    7:areturn         
	}

	public String toString()
	{
		return _name;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String _name>
	//    2    4:areturn         
	}

	public boolean usesPadding()
	{
		return _usesPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean _usesPadding>
	//    2    4:ireturn         
	}

	public boolean usesPaddingChar(char c)
	{
		return c == _paddingChar;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field char _paddingChar>
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean usesPaddingChar(int i)
	{
		return i == _paddingChar;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field char _paddingChar>
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public static final int BASE64_VALUE_INVALID = -1;
	public static final int BASE64_VALUE_PADDING = -2;
	private static final int INT_SPACE = 32;
	static final char PADDING_CHAR_NONE = 0;
	private static final long serialVersionUID = 1L;
	private final transient int _asciiToBase64[];
	private final transient byte _base64ToAsciiB[];
	private final transient char _base64ToAsciiC[];
	private final transient int _maxLineLength;
	final String _name;
	private final transient char _paddingChar;
	private final transient boolean _usesPadding;
}
