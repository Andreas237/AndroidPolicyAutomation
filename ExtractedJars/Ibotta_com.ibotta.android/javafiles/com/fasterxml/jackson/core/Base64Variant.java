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
	//    4    4:getfield        #28  <Field boolean _usesPadding>
	//    5    7:aload_1         
	//    6    8:getfield        #30  <Field char _paddingChar>
	//    7   11:iload_3         
	//    8   12:invokespecial   #33  <Method void Base64Variant(Base64Variant, String, boolean, char, int)>
	//    9   15:return          
	}

	public Base64Variant(Base64Variant base64variant, String s, boolean flag, char c, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		_asciiToBase64 = new int[128];
	//    2    4:aload_0         
	//    3    5:sipush          128
	//    4    8:newarray        int[]
	//    5   10:putfield        #39  <Field int[] _asciiToBase64>
		_base64ToAsciiC = new char[64];
	//    6   13:aload_0         
	//    7   14:bipush          64
	//    8   16:newarray        char[]
	//    9   18:putfield        #41  <Field char[] _base64ToAsciiC>
		_base64ToAsciiB = new byte[64];
	//   10   21:aload_0         
	//   11   22:bipush          64
	//   12   24:newarray        byte[]
	//   13   26:putfield        #43  <Field byte[] _base64ToAsciiB>
		_name = s;
	//   14   29:aload_0         
	//   15   30:aload_2         
	//   16   31:putfield        #45  <Field String _name>
		s = ((String) (base64variant._base64ToAsciiB));
	//   17   34:aload_1         
	//   18   35:getfield        #43  <Field byte[] _base64ToAsciiB>
	//   19   38:astore_2        
		System.arraycopy(((Object) (s)), 0, ((Object) (_base64ToAsciiB)), 0, s.length);
	//   20   39:aload_2         
	//   21   40:iconst_0        
	//   22   41:aload_0         
	//   23   42:getfield        #43  <Field byte[] _base64ToAsciiB>
	//   24   45:iconst_0        
	//   25   46:aload_2         
	//   26   47:arraylength     
	//   27   48:invokestatic    #51  <Method void System.arraycopy(Object, int, Object, int, int)>
		s = ((String) (base64variant._base64ToAsciiC));
	//   28   51:aload_1         
	//   29   52:getfield        #41  <Field char[] _base64ToAsciiC>
	//   30   55:astore_2        
		System.arraycopy(((Object) (s)), 0, ((Object) (_base64ToAsciiC)), 0, s.length);
	//   31   56:aload_2         
	//   32   57:iconst_0        
	//   33   58:aload_0         
	//   34   59:getfield        #41  <Field char[] _base64ToAsciiC>
	//   35   62:iconst_0        
	//   36   63:aload_2         
	//   37   64:arraylength     
	//   38   65:invokestatic    #51  <Method void System.arraycopy(Object, int, Object, int, int)>
		base64variant = ((Base64Variant) (base64variant._asciiToBase64));
	//   39   68:aload_1         
	//   40   69:getfield        #39  <Field int[] _asciiToBase64>
	//   41   72:astore_1        
		System.arraycopy(((Object) (base64variant)), 0, ((Object) (_asciiToBase64)), 0, base64variant.length);
	//   42   73:aload_1         
	//   43   74:iconst_0        
	//   44   75:aload_0         
	//   45   76:getfield        #39  <Field int[] _asciiToBase64>
	//   46   79:iconst_0        
	//   47   80:aload_1         
	//   48   81:arraylength     
	//   49   82:invokestatic    #51  <Method void System.arraycopy(Object, int, Object, int, int)>
		_usesPadding = flag;
	//   50   85:aload_0         
	//   51   86:iload_3         
	//   52   87:putfield        #28  <Field boolean _usesPadding>
		_paddingChar = c;
	//   53   90:aload_0         
	//   54   91:iload           4
	//   55   93:putfield        #30  <Field char _paddingChar>
		_maxLineLength = i;
	//   56   96:aload_0         
	//   57   97:iload           5
	//   58   99:putfield        #53  <Field int _maxLineLength>
	//   59  102:return          
	}

	public Base64Variant(String s, String s1, boolean flag, char c, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		_asciiToBase64 = new int[128];
	//    2    4:aload_0         
	//    3    5:sipush          128
	//    4    8:newarray        int[]
	//    5   10:putfield        #39  <Field int[] _asciiToBase64>
		_base64ToAsciiC = new char[64];
	//    6   13:aload_0         
	//    7   14:bipush          64
	//    8   16:newarray        char[]
	//    9   18:putfield        #41  <Field char[] _base64ToAsciiC>
		_base64ToAsciiB = new byte[64];
	//   10   21:aload_0         
	//   11   22:bipush          64
	//   12   24:newarray        byte[]
	//   13   26:putfield        #43  <Field byte[] _base64ToAsciiB>
		_name = s;
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:putfield        #45  <Field String _name>
		_usesPadding = flag;
	//   17   34:aload_0         
	//   18   35:iload_3         
	//   19   36:putfield        #28  <Field boolean _usesPadding>
		_paddingChar = c;
	//   20   39:aload_0         
	//   21   40:iload           4
	//   22   42:putfield        #30  <Field char _paddingChar>
		_maxLineLength = i;
	//   23   45:aload_0         
	//   24   46:iload           5
	//   25   48:putfield        #53  <Field int _maxLineLength>
		int j = s1.length();
	//   26   51:aload_2         
	//   27   52:invokevirtual   #60  <Method int String.length()>
	//   28   55:istore          6
		if(j == 64)
	//*  29   57:iload           6
	//*  30   59:bipush          64
	//*  31   61:icmpne          147
		{
			s = ((String) (_base64ToAsciiC));
	//   32   64:aload_0         
	//   33   65:getfield        #41  <Field char[] _base64ToAsciiC>
	//   34   68:astore_1        
			i = 0;
	//   35   69:iconst_0        
	//   36   70:istore          5
			s1.getChars(0, j, ((char []) (s)), 0);
	//   37   72:aload_2         
	//   38   73:iconst_0        
	//   39   74:iload           6
	//   40   76:aload_1         
	//   41   77:iconst_0        
	//   42   78:invokevirtual   #64  <Method void String.getChars(int, int, char[], int)>
			Arrays.fill(_asciiToBase64, -1);
	//   43   81:aload_0         
	//   44   82:getfield        #39  <Field int[] _asciiToBase64>
	//   45   85:iconst_m1       
	//   46   86:invokestatic    #70  <Method void Arrays.fill(int[], int)>
			for(; i < j; i++)
	//*  47   89:iload           5
	//*  48   91:iload           6
	//*  49   93:icmpge          133
			{
				char c1 = _base64ToAsciiC[i];
	//   50   96:aload_0         
	//   51   97:getfield        #41  <Field char[] _base64ToAsciiC>
	//   52  100:iload           5
	//   53  102:caload          
	//   54  103:istore          7
				_base64ToAsciiB[i] = (byte)c1;
	//   55  105:aload_0         
	//   56  106:getfield        #43  <Field byte[] _base64ToAsciiB>
	//   57  109:iload           5
	//   58  111:iload           7
	//   59  113:int2byte        
	//   60  114:bastore         
				_asciiToBase64[c1] = i;
	//   61  115:aload_0         
	//   62  116:getfield        #39  <Field int[] _asciiToBase64>
	//   63  119:iload           7
	//   64  121:iload           5
	//   65  123:iastore         
			}

	//   66  124:iload           5
	//   67  126:iconst_1        
	//   68  127:iadd            
	//   69  128:istore          5
	//*  70  130:goto            89
			if(flag)
	//*  71  133:iload_3         
	//*  72  134:ifeq            146
				_asciiToBase64[c] = -2;
	//   73  137:aload_0         
	//   74  138:getfield        #39  <Field int[] _asciiToBase64>
	//   75  141:iload           4
	//   76  143:bipush          -2
	//   77  145:iastore         
			return;
	//   78  146:return          
		} else
		{
			s = ((String) (new StringBuilder()));
	//   79  147:new             #72  <Class StringBuilder>
	//   80  150:dup             
	//   81  151:invokespecial   #73  <Method void StringBuilder()>
	//   82  154:astore_1        
			((StringBuilder) (s)).append("Base64Alphabet length must be exactly 64 (was ");
	//   83  155:aload_1         
	//   84  156:ldc1            #75  <String "Base64Alphabet length must be exactly 64 (was ">
	//   85  158:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   86  161:pop             
			((StringBuilder) (s)).append(j);
	//   87  162:aload_1         
	//   88  163:iload           6
	//   89  165:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   90  168:pop             
			((StringBuilder) (s)).append(")");
	//   91  169:aload_1         
	//   92  170:ldc1            #84  <String ")">
	//   93  172:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   94  175:pop             
			throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   95  176:new             #86  <Class IllegalArgumentException>
	//   96  179:dup             
	//   97  180:aload_1         
	//   98  181:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   99  184:invokespecial   #93  <Method void IllegalArgumentException(String)>
	//  100  187:athrow          
		}
	}

	protected void _reportBase64EOF()
		throws IllegalArgumentException
	{
		throw new IllegalArgumentException("Unexpected end-of-String in base64 content");
	//    0    0:new             #86  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #96  <String "Unexpected end-of-String in base64 content">
	//    3    6:invokespecial   #93  <Method void IllegalArgumentException(String)>
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
	//    3    6:new             #72  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #73  <Method void StringBuilder()>
	//    6   13:astore          4
			((StringBuilder) (obj)).append("Illegal white space character (code 0x");
	//    7   15:aload           4
	//    8   17:ldc1            #101 <String "Illegal white space character (code 0x">
	//    9   19:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			((StringBuilder) (obj)).append(Integer.toHexString(((int) (c))));
	//   11   23:aload           4
	//   12   25:iload_1         
	//   13   26:invokestatic    #107 <Method String Integer.toHexString(int)>
	//   14   29:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
			((StringBuilder) (obj)).append(") as character #");
	//   16   33:aload           4
	//   17   35:ldc1            #109 <String ") as character #">
	//   18   37:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
			((StringBuilder) (obj)).append(i + 1);
	//   20   41:aload           4
	//   21   43:iload_2         
	//   22   44:iconst_1        
	//   23   45:iadd            
	//   24   46:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   25   49:pop             
			((StringBuilder) (obj)).append(" of 4-char base64 unit: can only used between units");
	//   26   50:aload           4
	//   27   52:ldc1            #111 <String " of 4-char base64 unit: can only used between units">
	//   28   54:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   30   58:aload           4
	//   31   60:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   32   63:astore          4
		} else
	//*  33   65:goto            257
		if(usesPaddingChar(c))
	//*  34   68:aload_0         
	//*  35   69:iload_1         
	//*  36   70:invokevirtual   #115 <Method boolean usesPaddingChar(char)>
	//*  37   73:ifeq            138
		{
			obj = ((Object) (new StringBuilder()));
	//   38   76:new             #72  <Class StringBuilder>
	//   39   79:dup             
	//   40   80:invokespecial   #73  <Method void StringBuilder()>
	//   41   83:astore          4
			((StringBuilder) (obj)).append("Unexpected padding character ('");
	//   42   85:aload           4
	//   43   87:ldc1            #117 <String "Unexpected padding character ('">
	//   44   89:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   45   92:pop             
			((StringBuilder) (obj)).append(getPaddingChar());
	//   46   93:aload           4
	//   47   95:aload_0         
	//   48   96:invokevirtual   #121 <Method char getPaddingChar()>
	//   49   99:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
	//   50  102:pop             
			((StringBuilder) (obj)).append("') as character #");
	//   51  103:aload           4
	//   52  105:ldc1            #126 <String "') as character #">
	//   53  107:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   54  110:pop             
			((StringBuilder) (obj)).append(i + 1);
	//   55  111:aload           4
	//   56  113:iload_2         
	//   57  114:iconst_1        
	//   58  115:iadd            
	//   59  116:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   60  119:pop             
			((StringBuilder) (obj)).append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
	//   61  120:aload           4
	//   62  122:ldc1            #128 <String " of 4-char base64 unit: padding only legal as 3rd or 4th character">
	//   63  124:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   64  127:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   65  128:aload           4
	//   66  130:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   67  133:astore          4
		} else
	//*  68  135:goto            257
		if(Character.isDefined(c) && !Character.isISOControl(c))
	//*  69  138:iload_1         
	//*  70  139:invokestatic    #133 <Method boolean Character.isDefined(char)>
	//*  71  142:ifeq            215
	//*  72  145:iload_1         
	//*  73  146:invokestatic    #136 <Method boolean Character.isISOControl(char)>
	//*  74  149:ifeq            155
	//*  75  152:goto            215
		{
			obj = ((Object) (new StringBuilder()));
	//   76  155:new             #72  <Class StringBuilder>
	//   77  158:dup             
	//   78  159:invokespecial   #73  <Method void StringBuilder()>
	//   79  162:astore          4
			((StringBuilder) (obj)).append("Illegal character '");
	//   80  164:aload           4
	//   81  166:ldc1            #138 <String "Illegal character '">
	//   82  168:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   83  171:pop             
			((StringBuilder) (obj)).append(c);
	//   84  172:aload           4
	//   85  174:iload_1         
	//   86  175:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
	//   87  178:pop             
			((StringBuilder) (obj)).append("' (code 0x");
	//   88  179:aload           4
	//   89  181:ldc1            #140 <String "' (code 0x">
	//   90  183:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   91  186:pop             
			((StringBuilder) (obj)).append(Integer.toHexString(((int) (c))));
	//   92  187:aload           4
	//   93  189:iload_1         
	//   94  190:invokestatic    #107 <Method String Integer.toHexString(int)>
	//   95  193:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   96  196:pop             
			((StringBuilder) (obj)).append(") in base64 content");
	//   97  197:aload           4
	//   98  199:ldc1            #142 <String ") in base64 content">
	//   99  201:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  100  204:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  101  205:aload           4
	//  102  207:invokevirtual   #90  <Method String StringBuilder.toString()>
	//  103  210:astore          4
		} else
	//* 104  212:goto            257
		{
			obj = ((Object) (new StringBuilder()));
	//  105  215:new             #72  <Class StringBuilder>
	//  106  218:dup             
	//  107  219:invokespecial   #73  <Method void StringBuilder()>
	//  108  222:astore          4
			((StringBuilder) (obj)).append("Illegal character (code 0x");
	//  109  224:aload           4
	//  110  226:ldc1            #144 <String "Illegal character (code 0x">
	//  111  228:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  112  231:pop             
			((StringBuilder) (obj)).append(Integer.toHexString(((int) (c))));
	//  113  232:aload           4
	//  114  234:iload_1         
	//  115  235:invokestatic    #107 <Method String Integer.toHexString(int)>
	//  116  238:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  117  241:pop             
			((StringBuilder) (obj)).append(") in base64 content");
	//  118  242:aload           4
	//  119  244:ldc1            #142 <String ") in base64 content">
	//  120  246:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  121  249:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  122  250:aload           4
	//  123  252:invokevirtual   #90  <Method String StringBuilder.toString()>
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
	//  129  265:new             #72  <Class StringBuilder>
	//  130  268:dup             
	//  131  269:invokespecial   #73  <Method void StringBuilder()>
	//  132  272:astore          5
			((StringBuilder) (obj1)).append(((String) (obj)));
	//  133  274:aload           5
	//  134  276:aload           4
	//  135  278:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  136  281:pop             
			((StringBuilder) (obj1)).append(": ");
	//  137  282:aload           5
	//  138  284:ldc1            #146 <String ": ">
	//  139  286:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  140  289:pop             
			((StringBuilder) (obj1)).append(s);
	//  141  290:aload           5
	//  142  292:aload_3         
	//  143  293:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  144  296:pop             
			obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//  145  297:aload           5
	//  146  299:invokevirtual   #90  <Method String StringBuilder.toString()>
	//  147  302:astore          5
		}
		throw new IllegalArgumentException(((String) (obj1)));
	//  148  304:new             #86  <Class IllegalArgumentException>
	//  149  307:dup             
	//  150  308:aload           5
	//  151  310:invokespecial   #93  <Method void IllegalArgumentException(String)>
	//  152  313:athrow          
	}

	public void decode(String s, ByteArrayBuilder bytearraybuilder)
		throws IllegalArgumentException
	{
		int k = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #60  <Method int String.length()>
	//    2    4:istore          6
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		do
		{
			if(i >= k)
	//*   5    9:iload           4
	//*   6   11:iload           6
	//*   7   13:icmplt          17
				return;
	//    8   16:return          
			int j = i + 1;
	//    9   17:iload           4
	//   10   19:iconst_1        
	//   11   20:iadd            
	//   12   21:istore          5
			char c = s.charAt(i);
	//   13   23:aload_1         
	//   14   24:iload           4
	//   15   26:invokevirtual   #152 <Method char String.charAt(int)>
	//   16   29:istore_3        
			if(c > ' ')
	//*  17   30:iload_3         
	//*  18   31:bipush          32
	//*  19   33:icmple          365
			{
				int l = decodeBase64Char(c);
	//   20   36:aload_0         
	//   21   37:iload_3         
	//   22   38:invokevirtual   #156 <Method int decodeBase64Char(char)>
	//   23   41:istore          7
				if(l < 0)
	//*  24   43:iload           7
	//*  25   45:ifge            55
					_reportInvalidBase64(c, 0, ((String) (null)));
	//   26   48:aload_0         
	//   27   49:iload_3         
	//   28   50:iconst_0        
	//   29   51:aconst_null     
	//   30   52:invokevirtual   #158 <Method void _reportInvalidBase64(char, int, String)>
				if(j >= k)
	//*  31   55:iload           5
	//*  32   57:iload           6
	//*  33   59:icmplt          66
					_reportBase64EOF();
	//   34   62:aload_0         
	//   35   63:invokevirtual   #160 <Method void _reportBase64EOF()>
				i = j + 1;
	//   36   66:iload           5
	//   37   68:iconst_1        
	//   38   69:iadd            
	//   39   70:istore          4
				c = s.charAt(j);
	//   40   72:aload_1         
	//   41   73:iload           5
	//   42   75:invokevirtual   #152 <Method char String.charAt(int)>
	//   43   78:istore_3        
				j = decodeBase64Char(c);
	//   44   79:aload_0         
	//   45   80:iload_3         
	//   46   81:invokevirtual   #156 <Method int decodeBase64Char(char)>
	//   47   84:istore          5
				if(j < 0)
	//*  48   86:iload           5
	//*  49   88:ifge            98
					_reportInvalidBase64(c, 1, ((String) (null)));
	//   50   91:aload_0         
	//   51   92:iload_3         
	//   52   93:iconst_1        
	//   53   94:aconst_null     
	//   54   95:invokevirtual   #158 <Method void _reportInvalidBase64(char, int, String)>
				l = l << 6 | j;
	//   55   98:iload           7
	//   56  100:bipush          6
	//   57  102:ishl            
	//   58  103:iload           5
	//   59  105:ior             
	//   60  106:istore          7
				if(i >= k)
	//*  61  108:iload           4
	//*  62  110:iload           6
	//*  63  112:icmplt          135
				{
					if(!usesPadding())
	//*  64  115:aload_0         
	//*  65  116:invokevirtual   #164 <Method boolean usesPadding()>
	//*  66  119:ifne            131
					{
						bytearraybuilder.append(l >> 4);
	//   67  122:aload_2         
	//   68  123:iload           7
	//   69  125:iconst_4        
	//   70  126:ishr            
	//   71  127:invokevirtual   #169 <Method void ByteArrayBuilder.append(int)>
						return;
	//   72  130:return          
					}
					_reportBase64EOF();
	//   73  131:aload_0         
	//   74  132:invokevirtual   #160 <Method void _reportBase64EOF()>
				}
				j = i + 1;
	//   75  135:iload           4
	//   76  137:iconst_1        
	//   77  138:iadd            
	//   78  139:istore          5
				c = s.charAt(i);
	//   79  141:aload_1         
	//   80  142:iload           4
	//   81  144:invokevirtual   #152 <Method char String.charAt(int)>
	//   82  147:istore_3        
				i = decodeBase64Char(c);
	//   83  148:aload_0         
	//   84  149:iload_3         
	//   85  150:invokevirtual   #156 <Method int decodeBase64Char(char)>
	//   86  153:istore          4
				if(i < 0)
	//*  87  155:iload           4
	//*  88  157:ifge            263
				{
					if(i != -2)
	//*  89  160:iload           4
	//*  90  162:bipush          -2
	//*  91  164:icmpeq          174
						_reportInvalidBase64(c, 2, ((String) (null)));
	//   92  167:aload_0         
	//   93  168:iload_3         
	//   94  169:iconst_2        
	//   95  170:aconst_null     
	//   96  171:invokevirtual   #158 <Method void _reportInvalidBase64(char, int, String)>
					if(j >= k)
	//*  97  174:iload           5
	//*  98  176:iload           6
	//*  99  178:icmplt          185
						_reportBase64EOF();
	//  100  181:aload_0         
	//  101  182:invokevirtual   #160 <Method void _reportBase64EOF()>
					i = j + 1;
	//  102  185:iload           5
	//  103  187:iconst_1        
	//  104  188:iadd            
	//  105  189:istore          4
					c = s.charAt(j);
	//  106  191:aload_1         
	//  107  192:iload           5
	//  108  194:invokevirtual   #152 <Method char String.charAt(int)>
	//  109  197:istore_3        
					if(!usesPaddingChar(c))
	//* 110  198:aload_0         
	//* 111  199:iload_3         
	//* 112  200:invokevirtual   #115 <Method boolean usesPaddingChar(char)>
	//* 113  203:ifne            252
					{
						StringBuilder stringbuilder = new StringBuilder();
	//  114  206:new             #72  <Class StringBuilder>
	//  115  209:dup             
	//  116  210:invokespecial   #73  <Method void StringBuilder()>
	//  117  213:astore          8
						stringbuilder.append("expected padding character '");
	//  118  215:aload           8
	//  119  217:ldc1            #171 <String "expected padding character '">
	//  120  219:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  121  222:pop             
						stringbuilder.append(getPaddingChar());
	//  122  223:aload           8
	//  123  225:aload_0         
	//  124  226:invokevirtual   #121 <Method char getPaddingChar()>
	//  125  229:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
	//  126  232:pop             
						stringbuilder.append("'");
	//  127  233:aload           8
	//  128  235:ldc1            #173 <String "'">
	//  129  237:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  130  240:pop             
						_reportInvalidBase64(c, 3, stringbuilder.toString());
	//  131  241:aload_0         
	//  132  242:iload_3         
	//  133  243:iconst_3        
	//  134  244:aload           8
	//  135  246:invokevirtual   #90  <Method String StringBuilder.toString()>
	//  136  249:invokevirtual   #158 <Method void _reportInvalidBase64(char, int, String)>
					}
					bytearraybuilder.append(l >> 4);
	//  137  252:aload_2         
	//  138  253:iload           7
	//  139  255:iconst_4        
	//  140  256:ishr            
	//  141  257:invokevirtual   #169 <Method void ByteArrayBuilder.append(int)>
				} else
	//* 142  260:goto            9
				{
					i = l << 6 | i;
	//  143  263:iload           7
	//  144  265:bipush          6
	//  145  267:ishl            
	//  146  268:iload           4
	//  147  270:ior             
	//  148  271:istore          4
					if(j >= k)
	//* 149  273:iload           5
	//* 150  275:iload           6
	//* 151  277:icmplt          300
					{
						if(!usesPadding())
	//* 152  280:aload_0         
	//* 153  281:invokevirtual   #164 <Method boolean usesPadding()>
	//* 154  284:ifne            296
						{
							bytearraybuilder.appendTwoBytes(i >> 2);
	//  155  287:aload_2         
	//  156  288:iload           4
	//  157  290:iconst_2        
	//  158  291:ishr            
	//  159  292:invokevirtual   #176 <Method void ByteArrayBuilder.appendTwoBytes(int)>
							return;
	//  160  295:return          
						}
						_reportBase64EOF();
	//  161  296:aload_0         
	//  162  297:invokevirtual   #160 <Method void _reportBase64EOF()>
					}
					char c1 = s.charAt(j);
	//  163  300:aload_1         
	//  164  301:iload           5
	//  165  303:invokevirtual   #152 <Method char String.charAt(int)>
	//  166  306:istore_3        
					l = decodeBase64Char(c1);
	//  167  307:aload_0         
	//  168  308:iload_3         
	//  169  309:invokevirtual   #156 <Method int decodeBase64Char(char)>
	//  170  312:istore          7
					if(l < 0)
	//* 171  314:iload           7
	//* 172  316:ifge            344
					{
						if(l != -2)
	//* 173  319:iload           7
	//* 174  321:bipush          -2
	//* 175  323:icmpeq          333
							_reportInvalidBase64(c1, 3, ((String) (null)));
	//  176  326:aload_0         
	//  177  327:iload_3         
	//  178  328:iconst_3        
	//  179  329:aconst_null     
	//  180  330:invokevirtual   #158 <Method void _reportInvalidBase64(char, int, String)>
						bytearraybuilder.appendTwoBytes(i >> 2);
	//  181  333:aload_2         
	//  182  334:iload           4
	//  183  336:iconst_2        
	//  184  337:ishr            
	//  185  338:invokevirtual   #176 <Method void ByteArrayBuilder.appendTwoBytes(int)>
					} else
	//* 186  341:goto            356
					{
						bytearraybuilder.appendThreeBytes(i << 6 | l);
	//  187  344:aload_2         
	//  188  345:iload           4
	//  189  347:bipush          6
	//  190  349:ishl            
	//  191  350:iload           7
	//  192  352:ior             
	//  193  353:invokevirtual   #179 <Method void ByteArrayBuilder.appendThreeBytes(int)>
					}
					i = j + 1;
	//  194  356:iload           5
	//  195  358:iconst_1        
	//  196  359:iadd            
	//  197  360:istore          4
				}
			} else
	//* 198  362:goto            9
			{
				i = j;
	//  199  365:iload           5
	//  200  367:istore          4
			}
		} while(true);
	//  201  369:goto            9
	}

	public byte[] decode(String s)
		throws IllegalArgumentException
	{
		ByteArrayBuilder bytearraybuilder = new ByteArrayBuilder();
	//    0    0:new             #166 <Class ByteArrayBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #181 <Method void ByteArrayBuilder()>
	//    3    7:astore_2        
		decode(s, bytearraybuilder);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #183 <Method void decode(String, ByteArrayBuilder)>
		return bytearraybuilder.toByteArray();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #187 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   10   18:areturn         
	}

	public int decodeBase64Char(char c)
	{
		if(c <= '\177')
	//*   0    0:iload_1         
	//*   1    1:bipush          127
	//*   2    3:icmpgt          13
			return _asciiToBase64[c];
	//    3    6:aload_0         
	//    4    7:getfield        #39  <Field int[] _asciiToBase64>
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
	//    4    7:getfield        #39  <Field int[] _asciiToBase64>
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
	//    3    3:invokevirtual   #193 <Method String encode(byte[], boolean)>
	//    4    6:areturn         
	}

	public String encode(byte abyte0[], boolean flag)
	{
		int j1 = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          6
		StringBuilder stringbuilder = new StringBuilder((j1 >> 2) + j1 + (j1 >> 3));
	//    3    4:new             #72  <Class StringBuilder>
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
	//   14   20:invokespecial   #195 <Method void StringBuilder(int)>
	//   15   23:astore          8
		if(flag)
	//*  16   25:iload_2         
	//*  17   26:ifeq            37
			stringbuilder.append('"');
	//   18   29:aload           8
	//   19   31:bipush          34
	//   20   33:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
	//   21   36:pop             
		int j = getMaxLineLength() >> 2;
	//   22   37:aload_0         
	//   23   38:invokevirtual   #198 <Method int getMaxLineLength()>
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
	//   65   98:invokevirtual   #202 <Method void encodeBase64Chunk(StringBuilder, int)>
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
	//   76  119:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
	//   77  122:pop             
				stringbuilder.append('n');
	//   78  123:aload           8
	//   79  125:bipush          110
	//   80  127:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
	//   81  130:pop             
				i = getMaxLineLength() >> 2;
	//   82  131:aload_0         
	//   83  132:invokevirtual   #198 <Method int getMaxLineLength()>
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
	//  129  206:invokevirtual   #206 <Method void encodeBase64Partial(StringBuilder, int, int)>
		}
		if(flag)
	//* 130  209:iload_2         
	//* 131  210:ifeq            221
			stringbuilder.append('"');
	//  132  213:aload           8
	//  133  215:bipush          34
	//  134  217:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
	//  135  220:pop             
		return stringbuilder.toString();
	//  136  221:aload           8
	//  137  223:invokevirtual   #90  <Method String StringBuilder.toString()>
	//  138  226:areturn         
	}

	public int encodeBase64Chunk(int i, byte abyte0[], int j)
	{
		int k = j + 1;
	//    0    0:iload_3         
	//    1    1:iconst_1        
	//    2    2:iadd            
	//    3    3:istore          4
		byte abyte1[] = _base64ToAsciiB;
	//    4    5:aload_0         
	//    5    6:getfield        #43  <Field byte[] _base64ToAsciiB>
	//    6    9:astore          5
		abyte0[j] = abyte1[i >> 18 & 0x3f];
	//    7   11:aload_2         
	//    8   12:iload_3         
	//    9   13:aload           5
	//   10   15:iload_1         
	//   11   16:bipush          18
	//   12   18:ishr            
	//   13   19:bipush          63
	//   14   21:iand            
	//   15   22:baload          
	//   16   23:bastore         
		j = k + 1;
	//   17   24:iload           4
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:istore_3        
		abyte0[k] = abyte1[i >> 12 & 0x3f];
	//   21   29:aload_2         
	//   22   30:iload           4
	//   23   32:aload           5
	//   24   34:iload_1         
	//   25   35:bipush          12
	//   26   37:ishr            
	//   27   38:bipush          63
	//   28   40:iand            
	//   29   41:baload          
	//   30   42:bastore         
		k = j + 1;
	//   31   43:iload_3         
	//   32   44:iconst_1        
	//   33   45:iadd            
	//   34   46:istore          4
		abyte0[j] = abyte1[i >> 6 & 0x3f];
	//   35   48:aload_2         
	//   36   49:iload_3         
	//   37   50:aload           5
	//   38   52:iload_1         
	//   39   53:bipush          6
	//   40   55:ishr            
	//   41   56:bipush          63
	//   42   58:iand            
	//   43   59:baload          
	//   44   60:bastore         
		abyte0[k] = abyte1[i & 0x3f];
	//   45   61:aload_2         
	//   46   62:iload           4
	//   47   64:aload           5
	//   48   66:iload_1         
	//   49   67:bipush          63
	//   50   69:iand            
	//   51   70:baload          
	//   52   71:bastore         
		return k + 1;
	//   53   72:iload           4
	//   54   74:iconst_1        
	//   55   75:iadd            
	//   56   76:ireturn         
	}

	public int encodeBase64Chunk(int i, char ac[], int j)
	{
		int k = j + 1;
	//    0    0:iload_3         
	//    1    1:iconst_1        
	//    2    2:iadd            
	//    3    3:istore          4
		char ac1[] = _base64ToAsciiC;
	//    4    5:aload_0         
	//    5    6:getfield        #41  <Field char[] _base64ToAsciiC>
	//    6    9:astore          5
		ac[j] = ac1[i >> 18 & 0x3f];
	//    7   11:aload_2         
	//    8   12:iload_3         
	//    9   13:aload           5
	//   10   15:iload_1         
	//   11   16:bipush          18
	//   12   18:ishr            
	//   13   19:bipush          63
	//   14   21:iand            
	//   15   22:caload          
	//   16   23:castore         
		j = k + 1;
	//   17   24:iload           4
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:istore_3        
		ac[k] = ac1[i >> 12 & 0x3f];
	//   21   29:aload_2         
	//   22   30:iload           4
	//   23   32:aload           5
	//   24   34:iload_1         
	//   25   35:bipush          12
	//   26   37:ishr            
	//   27   38:bipush          63
	//   28   40:iand            
	//   29   41:caload          
	//   30   42:castore         
		k = j + 1;
	//   31   43:iload_3         
	//   32   44:iconst_1        
	//   33   45:iadd            
	//   34   46:istore          4
		ac[j] = ac1[i >> 6 & 0x3f];
	//   35   48:aload_2         
	//   36   49:iload_3         
	//   37   50:aload           5
	//   38   52:iload_1         
	//   39   53:bipush          6
	//   40   55:ishr            
	//   41   56:bipush          63
	//   42   58:iand            
	//   43   59:caload          
	//   44   60:castore         
		ac[k] = ac1[i & 0x3f];
	//   45   61:aload_2         
	//   46   62:iload           4
	//   47   64:aload           5
	//   48   66:iload_1         
	//   49   67:bipush          63
	//   50   69:iand            
	//   51   70:caload          
	//   52   71:castore         
		return k + 1;
	//   53   72:iload           4
	//   54   74:iconst_1        
	//   55   75:iadd            
	//   56   76:ireturn         
	}

	public void encodeBase64Chunk(StringBuilder stringbuilder, int i)
	{
		stringbuilder.append(_base64ToAsciiC[i >> 18 & 0x3f]);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field char[] _base64ToAsciiC>
	//    3    5:iload_2         
	//    4    6:bipush          18
	//    5    8:ishr            
	//    6    9:bipush          63
	//    7   11:iand            
	//    8   12:caload          
	//    9   13:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
	//   10   16:pop             
		stringbuilder.append(_base64ToAsciiC[i >> 12 & 0x3f]);
	//   11   17:aload_1         
	//   12   18:aload_0         
	//   13   19:getfield        #41  <Field char[] _base64ToAsciiC>
	//   14   22:iload_2         
	//   15   23:bipush          12
	//   16   25:ishr            
	//   17   26:bipush          63
	//   18   28:iand            
	//   19   29:caload          
	//   20   30:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
	//   21   33:pop             
		stringbuilder.append(_base64ToAsciiC[i >> 6 & 0x3f]);
	//   22   34:aload_1         
	//   23   35:aload_0         
	//   24   36:getfield        #41  <Field char[] _base64ToAsciiC>
	//   25   39:iload_2         
	//   26   40:bipush          6
	//   27   42:ishr            
	//   28   43:bipush          63
	//   29   45:iand            
	//   30   46:caload          
	//   31   47:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
	//   32   50:pop             
		stringbuilder.append(_base64ToAsciiC[i & 0x3f]);
	//   33   51:aload_1         
	//   34   52:aload_0         
	//   35   53:getfield        #41  <Field char[] _base64ToAsciiC>
	//   36   56:iload_2         
	//   37   57:bipush          63
	//   38   59:iand            
	//   39   60:caload          
	//   40   61:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
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
		byte abyte1[] = _base64ToAsciiB;
	//    4    6:aload_0         
	//    5    7:getfield        #43  <Field byte[] _base64ToAsciiB>
	//    6   10:astore          9
		abyte0[k] = abyte1[i >> 18 & 0x3f];
	//    7   12:aload_3         
	//    8   13:iload           4
	//    9   15:aload           9
	//   10   17:iload_1         
	//   11   18:bipush          18
	//   12   20:ishr            
	//   13   21:bipush          63
	//   14   23:iand            
	//   15   24:baload          
	//   16   25:bastore         
		int l = i1 + 1;
	//   17   26:iload           8
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:istore          7
		abyte0[i1] = abyte1[i >> 12 & 0x3f];
	//   21   32:aload_3         
	//   22   33:iload           8
	//   23   35:aload           9
	//   24   37:iload_1         
	//   25   38:bipush          12
	//   26   40:ishr            
	//   27   41:bipush          63
	//   28   43:iand            
	//   29   44:baload          
	//   30   45:bastore         
		if(_usesPadding)
	//*  31   46:aload_0         
	//*  32   47:getfield        #28  <Field boolean _usesPadding>
	//*  33   50:ifeq            107
		{
			byte byte1 = (byte)_paddingChar;
	//   34   53:aload_0         
	//   35   54:getfield        #30  <Field char _paddingChar>
	//   36   57:int2byte        
	//   37   58:istore          6
			k = l + 1;
	//   38   60:iload           7
	//   39   62:iconst_1        
	//   40   63:iadd            
	//   41   64:istore          4
			byte byte0;
			if(j == 2)
	//*  42   66:iload_2         
	//*  43   67:iconst_2        
	//*  44   68:icmpne          86
				byte0 = abyte1[i >> 6 & 0x3f];
	//   45   71:aload           9
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
	//*  72  113:icmpne          136
		{
			abyte0[l] = abyte1[i >> 6 & 0x3f];
	//   73  116:aload_3         
	//   74  117:iload           7
	//   75  119:aload           9
	//   76  121:iload_1         
	//   77  122:bipush          6
	//   78  124:ishr            
	//   79  125:bipush          63
	//   80  127:iand            
	//   81  128:baload          
	//   82  129:bastore         
			k = l + 1;
	//   83  130:iload           7
	//   84  132:iconst_1        
	//   85  133:iadd            
	//   86  134:istore          4
		}
		return k;
	//   87  136:iload           4
	//   88  138:ireturn         
	}

	public int encodeBase64Partial(int i, int j, char ac[], int k)
	{
		int i1 = k + 1;
	//    0    0:iload           4
	//    1    2:iconst_1        
	//    2    3:iadd            
	//    3    4:istore          7
		char ac1[] = _base64ToAsciiC;
	//    4    6:aload_0         
	//    5    7:getfield        #41  <Field char[] _base64ToAsciiC>
	//    6   10:astore          8
		ac[k] = ac1[i >> 18 & 0x3f];
	//    7   12:aload_3         
	//    8   13:iload           4
	//    9   15:aload           8
	//   10   17:iload_1         
	//   11   18:bipush          18
	//   12   20:ishr            
	//   13   21:bipush          63
	//   14   23:iand            
	//   15   24:caload          
	//   16   25:castore         
		int l = i1 + 1;
	//   17   26:iload           7
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:istore          6
		ac[i1] = ac1[i >> 12 & 0x3f];
	//   21   32:aload_3         
	//   22   33:iload           7
	//   23   35:aload           8
	//   24   37:iload_1         
	//   25   38:bipush          12
	//   26   40:ishr            
	//   27   41:bipush          63
	//   28   43:iand            
	//   29   44:caload          
	//   30   45:castore         
		if(_usesPadding)
	//*  31   46:aload_0         
	//*  32   47:getfield        #28  <Field boolean _usesPadding>
	//*  33   50:ifeq            104
		{
			k = l + 1;
	//   34   53:iload           6
	//   35   55:iconst_1        
	//   36   56:iadd            
	//   37   57:istore          4
			char c;
			if(j == 2)
	//*  38   59:iload_2         
	//*  39   60:iconst_2        
	//*  40   61:icmpne          79
				c = ac1[i >> 6 & 0x3f];
	//   41   64:aload           8
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
	//   51   80:getfield        #30  <Field char _paddingChar>
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
	//   60   95:getfield        #30  <Field char _paddingChar>
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
	//*  70  110:icmpne          133
		{
			ac[l] = ac1[i >> 6 & 0x3f];
	//   71  113:aload_3         
	//   72  114:iload           6
	//   73  116:aload           8
	//   74  118:iload_1         
	//   75  119:bipush          6
	//   76  121:ishr            
	//   77  122:bipush          63
	//   78  124:iand            
	//   79  125:caload          
	//   80  126:castore         
			k = l + 1;
	//   81  127:iload           6
	//   82  129:iconst_1        
	//   83  130:iadd            
	//   84  131:istore          4
		}
		return k;
	//   85  133:iload           4
	//   86  135:ireturn         
	}

	public void encodeBase64Partial(StringBuilder stringbuilder, int i, int j)
	{
		stringbuilder.append(_base64ToAsciiC[i >> 18 & 0x3f]);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field char[] _base64ToAsciiC>
	//    3    5:iload_2         
	//    4    6:bipush          18
	//    5    8:ishr            
	//    6    9:bipush          63
	//    7   11:iand            
	//    8   12:caload          
	//    9   13:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
	//   10   16:pop             
		stringbuilder.append(_base64ToAsciiC[i >> 12 & 0x3f]);
	//   11   17:aload_1         
	//   12   18:aload_0         
	//   13   19:getfield        #41  <Field char[] _base64ToAsciiC>
	//   14   22:iload_2         
	//   15   23:bipush          12
	//   16   25:ishr            
	//   17   26:bipush          63
	//   18   28:iand            
	//   19   29:caload          
	//   20   30:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
	//   21   33:pop             
		if(_usesPadding)
	//*  22   34:aload_0         
	//*  23   35:getfield        #28  <Field boolean _usesPadding>
	//*  24   38:ifeq            86
		{
			char c;
			if(j == 2)
	//*  25   41:iload_3         
	//*  26   42:iconst_2        
	//*  27   43:icmpne          63
				c = _base64ToAsciiC[i >> 6 & 0x3f];
	//   28   46:aload_0         
	//   29   47:getfield        #41  <Field char[] _base64ToAsciiC>
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
	//   39   64:getfield        #30  <Field char _paddingChar>
	//   40   67:istore          4
			stringbuilder.append(c);
	//   41   69:aload_1         
	//   42   70:iload           4
	//   43   72:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
	//   44   75:pop             
			stringbuilder.append(_paddingChar);
	//   45   76:aload_1         
	//   46   77:aload_0         
	//   47   78:getfield        #30  <Field char _paddingChar>
	//   48   81:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
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
	//   56   93:getfield        #41  <Field char[] _base64ToAsciiC>
	//   57   96:iload_2         
	//   58   97:bipush          6
	//   59   99:ishr            
	//   60  100:bipush          63
	//   61  102:iand            
	//   62  103:caload          
	//   63  104:invokevirtual   #124 <Method StringBuilder StringBuilder.append(char)>
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
	//    1    1:getfield        #53  <Field int _maxLineLength>
	//    2    4:ireturn         
	}

	public char getPaddingChar()
	{
		return _paddingChar;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field char _paddingChar>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return _name.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String _name>
	//    2    4:invokevirtual   #215 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	protected Object readResolve()
	{
		return ((Object) (Base64Variants.valueOf(_name)));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String _name>
	//    2    4:invokestatic    #223 <Method Base64Variant Base64Variants.valueOf(String)>
	//    3    7:areturn         
	}

	public String toString()
	{
		return _name;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String _name>
	//    2    4:areturn         
	}

	public boolean usesPadding()
	{
		return _usesPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean _usesPadding>
	//    2    4:ireturn         
	}

	public boolean usesPaddingChar(char c)
	{
		return c == _paddingChar;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field char _paddingChar>
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
	//    2    2:getfield        #30  <Field char _paddingChar>
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private static final long serialVersionUID = 1L;
	private final transient int _asciiToBase64[];
	private final transient byte _base64ToAsciiB[];
	private final transient char _base64ToAsciiC[];
	private final transient int _maxLineLength;
	final String _name;
	private final transient char _paddingChar;
	private final transient boolean _usesPadding;
}
