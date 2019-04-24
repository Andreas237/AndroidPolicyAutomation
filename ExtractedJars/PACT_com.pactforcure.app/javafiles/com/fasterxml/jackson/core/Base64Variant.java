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
	//*  31   61:icmpeq          97
			throw new IllegalArgumentException((new StringBuilder()).append("Base64Alphabet length must be exactly 64 (was ").append(j).append(")").toString());
	//   32   64:new             #70  <Class IllegalArgumentException>
	//   33   67:dup             
	//   34   68:new             #72  <Class StringBuilder>
	//   35   71:dup             
	//   36   72:invokespecial   #73  <Method void StringBuilder()>
	//   37   75:ldc1            #75  <String "Base64Alphabet length must be exactly 64 (was ">
	//   38   77:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   39   80:iload           6
	//   40   82:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   41   85:ldc1            #84  <String ")">
	//   42   87:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   43   90:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   44   93:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   45   96:athrow          
		s1.getChars(0, j, _base64ToAsciiC, 0);
	//   46   97:aload_2         
	//   47   98:iconst_0        
	//   48   99:iload           6
	//   49  101:aload_0         
	//   50  102:getfield        #49  <Field char[] _base64ToAsciiC>
	//   51  105:iconst_0        
	//   52  106:invokevirtual   #95  <Method void String.getChars(int, int, char[], int)>
		Arrays.fill(_asciiToBase64, -1);
	//   53  109:aload_0         
	//   54  110:getfield        #47  <Field int[] _asciiToBase64>
	//   55  113:iconst_m1       
	//   56  114:invokestatic    #101 <Method void Arrays.fill(int[], int)>
		for(i = 0; i < j; i++)
	//*  57  117:iconst_0        
	//*  58  118:istore          5
	//*  59  120:iload           5
	//*  60  122:iload           6
	//*  61  124:icmpge          164
		{
			char c1 = _base64ToAsciiC[i];
	//   62  127:aload_0         
	//   63  128:getfield        #49  <Field char[] _base64ToAsciiC>
	//   64  131:iload           5
	//   65  133:caload          
	//   66  134:istore          7
			_base64ToAsciiB[i] = (byte)c1;
	//   67  136:aload_0         
	//   68  137:getfield        #51  <Field byte[] _base64ToAsciiB>
	//   69  140:iload           5
	//   70  142:iload           7
	//   71  144:int2byte        
	//   72  145:bastore         
			_asciiToBase64[c1] = i;
	//   73  146:aload_0         
	//   74  147:getfield        #47  <Field int[] _asciiToBase64>
	//   75  150:iload           7
	//   76  152:iload           5
	//   77  154:iastore         
		}

	//   78  155:iload           5
	//   79  157:iconst_1        
	//   80  158:iadd            
	//   81  159:istore          5
	//*  82  161:goto            120
		if(flag)
	//*  83  164:iload_3         
	//*  84  165:ifeq            177
			_asciiToBase64[c] = -2;
	//   85  168:aload_0         
	//   86  169:getfield        #47  <Field int[] _asciiToBase64>
	//   87  172:iload           4
	//   88  174:bipush          -2
	//   89  176:iastore         
	//   90  177:return          
	}

	protected void _reportBase64EOF()
		throws IllegalArgumentException
	{
		throw new IllegalArgumentException("Unexpected end-of-String in base64 content");
	//    0    0:new             #70  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #104 <String "Unexpected end-of-String in base64 content">
	//    3    6:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//    4    9:athrow          
	}

	protected void _reportInvalidBase64(char c, int i, String s)
		throws IllegalArgumentException
	{
		String s1;
		String s2;
		if(c <= ' ')
	//*   0    0:iload_1         
	//*   1    1:bipush          32
	//*   2    3:icmpgt          90
			s1 = (new StringBuilder()).append("Illegal white space character (code 0x").append(Integer.toHexString(((int) (c)))).append(") as character #").append(i + 1).append(" of 4-char base64 unit: can only used between units").toString();
	//    3    6:new             #72  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #73  <Method void StringBuilder()>
	//    6   13:ldc1            #109 <String "Illegal white space character (code 0x">
	//    7   15:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:iload_1         
	//    9   19:invokestatic    #115 <Method String Integer.toHexString(int)>
	//   10   22:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc1            #117 <String ") as character #">
	//   12   27:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:iload_2         
	//   14   31:iconst_1        
	//   15   32:iadd            
	//   16   33:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   17   36:ldc1            #119 <String " of 4-char base64 unit: can only used between units">
	//   18   38:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   19   41:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   20   44:astore          4
		else
	//*  21   46:aload           4
	//*  22   48:astore          5
	//*  23   50:aload_3         
	//*  24   51:ifnull          80
	//*  25   54:new             #72  <Class StringBuilder>
	//*  26   57:dup             
	//*  27   58:invokespecial   #73  <Method void StringBuilder()>
	//*  28   61:aload           4
	//*  29   63:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  30   66:ldc1            #121 <String ": ">
	//*  31   68:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  32   71:aload_3         
	//*  33   72:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  34   75:invokevirtual   #88  <Method String StringBuilder.toString()>
	//*  35   78:astore          5
	//*  36   80:new             #70  <Class IllegalArgumentException>
	//*  37   83:dup             
	//*  38   84:aload           5
	//*  39   86:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//*  40   89:athrow          
		if(usesPaddingChar(c))
	//*  41   90:aload_0         
	//*  42   91:iload_1         
	//*  43   92:invokevirtual   #125 <Method boolean usesPaddingChar(char)>
	//*  44   95:ifeq            141
			s1 = (new StringBuilder()).append("Unexpected padding character ('").append(getPaddingChar()).append("') as character #").append(i + 1).append(" of 4-char base64 unit: padding only legal as 3rd or 4th character").toString();
	//   45   98:new             #72  <Class StringBuilder>
	//   46  101:dup             
	//   47  102:invokespecial   #73  <Method void StringBuilder()>
	//   48  105:ldc1            #127 <String "Unexpected padding character ('">
	//   49  107:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   50  110:aload_0         
	//   51  111:invokevirtual   #131 <Method char getPaddingChar()>
	//   52  114:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   53  117:ldc1            #136 <String "') as character #">
	//   54  119:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   55  122:iload_2         
	//   56  123:iconst_1        
	//   57  124:iadd            
	//   58  125:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   59  128:ldc1            #138 <String " of 4-char base64 unit: padding only legal as 3rd or 4th character">
	//   60  130:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   61  133:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   62  136:astore          4
		else
	//*  63  138:goto            46
		if(!Character.isDefined(c) || Character.isISOControl(c))
	//*  64  141:iload_1         
	//*  65  142:invokestatic    #143 <Method boolean Character.isDefined(char)>
	//*  66  145:ifeq            155
	//*  67  148:iload_1         
	//*  68  149:invokestatic    #146 <Method boolean Character.isISOControl(char)>
	//*  69  152:ifeq            187
			s1 = (new StringBuilder()).append("Illegal character (code 0x").append(Integer.toHexString(((int) (c)))).append(") in base64 content").toString();
	//   70  155:new             #72  <Class StringBuilder>
	//   71  158:dup             
	//   72  159:invokespecial   #73  <Method void StringBuilder()>
	//   73  162:ldc1            #148 <String "Illegal character (code 0x">
	//   74  164:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   75  167:iload_1         
	//   76  168:invokestatic    #115 <Method String Integer.toHexString(int)>
	//   77  171:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   78  174:ldc1            #150 <String ") in base64 content">
	//   79  176:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   80  179:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   81  182:astore          4
		else
	//*  82  184:goto            46
			s1 = (new StringBuilder()).append("Illegal character '").append(c).append("' (code 0x").append(Integer.toHexString(((int) (c)))).append(") in base64 content").toString();
	//   83  187:new             #72  <Class StringBuilder>
	//   84  190:dup             
	//   85  191:invokespecial   #73  <Method void StringBuilder()>
	//   86  194:ldc1            #152 <String "Illegal character '">
	//   87  196:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   88  199:iload_1         
	//   89  200:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   90  203:ldc1            #154 <String "' (code 0x">
	//   91  205:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   92  208:iload_1         
	//   93  209:invokestatic    #115 <Method String Integer.toHexString(int)>
	//   94  212:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   95  215:ldc1            #150 <String ") in base64 content">
	//   96  217:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   97  220:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   98  223:astore          4
		s2 = s1;
		if(s != null)
			s2 = (new StringBuilder()).append(s1).append(": ").append(s).toString();
		throw new IllegalArgumentException(s2);
	//*  99  225:goto            46
	}

	public void decode(String s, ByteArrayBuilder bytearraybuilder)
		throws IllegalArgumentException
	{
		int i;
		int k;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		k = s.length();
	//    2    3:aload_1         
	//    3    4:invokevirtual   #68  <Method int String.length()>
	//    4    7:istore          6
_L4:
		if(i >= k) goto _L2; else goto _L1
	//    5    9:iload           4
	//    6   11:iload           6
	//    7   13:icmpge          36
_L1:
		char c;
		int j;
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
		if(j < k) goto _L3; else goto _L2
	//   16   29:iload           5
	//   17   31:iload           6
	//   18   33:icmplt          37
_L2:
		return;
	//   19   36:return          
_L3:
label0:
		{
			if(c <= ' ')
				break label0;
	//   20   37:iload_3         
	//   21   38:bipush          32
	//   22   40:icmple          359
			int l = decodeBase64Char(c);
	//   23   43:aload_0         
	//   24   44:iload_3         
	//   25   45:invokevirtual   #164 <Method int decodeBase64Char(char)>
	//   26   48:istore          7
			if(l < 0)
	//*  27   50:iload           7
	//*  28   52:ifge            62
				_reportInvalidBase64(c, 0, ((String) (null)));
	//   29   55:aload_0         
	//   30   56:iload_3         
	//   31   57:iconst_0        
	//   32   58:aconst_null     
	//   33   59:invokevirtual   #166 <Method void _reportInvalidBase64(char, int, String)>
			if(j >= k)
	//*  34   62:iload           5
	//*  35   64:iload           6
	//*  36   66:icmplt          73
				_reportBase64EOF();
	//   37   69:aload_0         
	//   38   70:invokevirtual   #168 <Method void _reportBase64EOF()>
			i = j + 1;
	//   39   73:iload           5
	//   40   75:iconst_1        
	//   41   76:iadd            
	//   42   77:istore          4
			c = s.charAt(j);
	//   43   79:aload_1         
	//   44   80:iload           5
	//   45   82:invokevirtual   #160 <Method char String.charAt(int)>
	//   46   85:istore_3        
			j = decodeBase64Char(c);
	//   47   86:aload_0         
	//   48   87:iload_3         
	//   49   88:invokevirtual   #164 <Method int decodeBase64Char(char)>
	//   50   91:istore          5
			if(j < 0)
	//*  51   93:iload           5
	//*  52   95:ifge            105
				_reportInvalidBase64(c, 1, ((String) (null)));
	//   53   98:aload_0         
	//   54   99:iload_3         
	//   55  100:iconst_1        
	//   56  101:aconst_null     
	//   57  102:invokevirtual   #166 <Method void _reportInvalidBase64(char, int, String)>
			l = l << 6 | j;
	//   58  105:iload           7
	//   59  107:bipush          6
	//   60  109:ishl            
	//   61  110:iload           5
	//   62  112:ior             
	//   63  113:istore          7
			if(i >= k)
	//*  64  115:iload           4
	//*  65  117:iload           6
	//*  66  119:icmplt          142
			{
				if(!usesPadding())
	//*  67  122:aload_0         
	//*  68  123:invokevirtual   #172 <Method boolean usesPadding()>
	//*  69  126:ifne            138
				{
					bytearraybuilder.append(l >> 4);
	//   70  129:aload_2         
	//   71  130:iload           7
	//   72  132:iconst_4        
	//   73  133:ishr            
	//   74  134:invokevirtual   #177 <Method void ByteArrayBuilder.append(int)>
					return;
	//   75  137:return          
				}
				_reportBase64EOF();
	//   76  138:aload_0         
	//   77  139:invokevirtual   #168 <Method void _reportBase64EOF()>
			}
			j = i + 1;
	//   78  142:iload           4
	//   79  144:iconst_1        
	//   80  145:iadd            
	//   81  146:istore          5
			c = s.charAt(i);
	//   82  148:aload_1         
	//   83  149:iload           4
	//   84  151:invokevirtual   #160 <Method char String.charAt(int)>
	//   85  154:istore_3        
			i = decodeBase64Char(c);
	//   86  155:aload_0         
	//   87  156:iload_3         
	//   88  157:invokevirtual   #164 <Method int decodeBase64Char(char)>
	//   89  160:istore          4
			if(i < 0)
	//*  90  162:iload           4
	//*  91  164:ifge            257
			{
				if(i != -2)
	//*  92  167:iload           4
	//*  93  169:bipush          -2
	//*  94  171:icmpeq          181
					_reportInvalidBase64(c, 2, ((String) (null)));
	//   95  174:aload_0         
	//   96  175:iload_3         
	//   97  176:iconst_2        
	//   98  177:aconst_null     
	//   99  178:invokevirtual   #166 <Method void _reportInvalidBase64(char, int, String)>
				if(j >= k)
	//* 100  181:iload           5
	//* 101  183:iload           6
	//* 102  185:icmplt          192
					_reportBase64EOF();
	//  103  188:aload_0         
	//  104  189:invokevirtual   #168 <Method void _reportBase64EOF()>
				i = j + 1;
	//  105  192:iload           5
	//  106  194:iconst_1        
	//  107  195:iadd            
	//  108  196:istore          4
				c = s.charAt(j);
	//  109  198:aload_1         
	//  110  199:iload           5
	//  111  201:invokevirtual   #160 <Method char String.charAt(int)>
	//  112  204:istore_3        
				if(!usesPaddingChar(c))
	//* 113  205:aload_0         
	//* 114  206:iload_3         
	//* 115  207:invokevirtual   #125 <Method boolean usesPaddingChar(char)>
	//* 116  210:ifne            246
					_reportInvalidBase64(c, 3, (new StringBuilder()).append("expected padding character '").append(getPaddingChar()).append("'").toString());
	//  117  213:aload_0         
	//  118  214:iload_3         
	//  119  215:iconst_3        
	//  120  216:new             #72  <Class StringBuilder>
	//  121  219:dup             
	//  122  220:invokespecial   #73  <Method void StringBuilder()>
	//  123  223:ldc1            #179 <String "expected padding character '">
	//  124  225:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  125  228:aload_0         
	//  126  229:invokevirtual   #131 <Method char getPaddingChar()>
	//  127  232:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//  128  235:ldc1            #181 <String "'">
	//  129  237:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  130  240:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  131  243:invokevirtual   #166 <Method void _reportInvalidBase64(char, int, String)>
				bytearraybuilder.append(l >> 4);
	//  132  246:aload_2         
	//  133  247:iload           7
	//  134  249:iconst_4        
	//  135  250:ishr            
	//  136  251:invokevirtual   #177 <Method void ByteArrayBuilder.append(int)>
			} else
	//* 137  254:goto            9
			{
				l = l << 6 | i;
	//  138  257:iload           7
	//  139  259:bipush          6
	//  140  261:ishl            
	//  141  262:iload           4
	//  142  264:ior             
	//  143  265:istore          7
				if(j >= k)
	//* 144  267:iload           5
	//* 145  269:iload           6
	//* 146  271:icmplt          294
				{
					if(!usesPadding())
	//* 147  274:aload_0         
	//* 148  275:invokevirtual   #172 <Method boolean usesPadding()>
	//* 149  278:ifne            290
					{
						bytearraybuilder.appendTwoBytes(l >> 2);
	//  150  281:aload_2         
	//  151  282:iload           7
	//  152  284:iconst_2        
	//  153  285:ishr            
	//  154  286:invokevirtual   #184 <Method void ByteArrayBuilder.appendTwoBytes(int)>
						return;
	//  155  289:return          
					}
					_reportBase64EOF();
	//  156  290:aload_0         
	//  157  291:invokevirtual   #168 <Method void _reportBase64EOF()>
				}
				i = j + 1;
	//  158  294:iload           5
	//  159  296:iconst_1        
	//  160  297:iadd            
	//  161  298:istore          4
				char c1 = s.charAt(j);
	//  162  300:aload_1         
	//  163  301:iload           5
	//  164  303:invokevirtual   #160 <Method char String.charAt(int)>
	//  165  306:istore_3        
				j = decodeBase64Char(c1);
	//  166  307:aload_0         
	//  167  308:iload_3         
	//  168  309:invokevirtual   #164 <Method int decodeBase64Char(char)>
	//  169  312:istore          5
				if(j < 0)
	//* 170  314:iload           5
	//* 171  316:ifge            344
				{
					if(j != -2)
	//* 172  319:iload           5
	//* 173  321:bipush          -2
	//* 174  323:icmpeq          333
						_reportInvalidBase64(c1, 3, ((String) (null)));
	//  175  326:aload_0         
	//  176  327:iload_3         
	//  177  328:iconst_3        
	//  178  329:aconst_null     
	//  179  330:invokevirtual   #166 <Method void _reportInvalidBase64(char, int, String)>
					bytearraybuilder.appendTwoBytes(l >> 2);
	//  180  333:aload_2         
	//  181  334:iload           7
	//  182  336:iconst_2        
	//  183  337:ishr            
	//  184  338:invokevirtual   #184 <Method void ByteArrayBuilder.appendTwoBytes(int)>
				} else
	//* 185  341:goto            9
				{
					bytearraybuilder.appendThreeBytes(l << 6 | j);
	//  186  344:aload_2         
	//  187  345:iload           7
	//  188  347:bipush          6
	//  189  349:ishl            
	//  190  350:iload           5
	//  191  352:ior             
	//  192  353:invokevirtual   #187 <Method void ByteArrayBuilder.appendThreeBytes(int)>
				}
			}
		}
		  goto _L4
	//* 193  356:goto            9
		i = j;
	//  194  359:iload           5
	//  195  361:istore          4
		  goto _L1
	//* 196  363:goto            16
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
		if(byte0 <= 127)
	//*   0    0:iload_1         
	//*   1    1:bipush          127
	//*   2    3:icmpgt          13
			return _asciiToBase64[byte0];
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
		int l = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          5
		StringBuilder stringbuilder = new StringBuilder((l >> 2) + l + (l >> 3));
	//    3    4:new             #72  <Class StringBuilder>
	//    4    7:dup             
	//    5    8:iload           5
	//    6   10:iconst_2        
	//    7   11:ishr            
	//    8   12:iload           5
	//    9   14:iadd            
	//   10   15:iload           5
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
	//   20   33:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   21   36:pop             
		int i = getMaxLineLength() >> 2;
	//   22   37:aload_0         
	//   23   38:invokevirtual   #208 <Method int getMaxLineLength()>
	//   24   41:iconst_2        
	//   25   42:ishr            
	//   26   43:istore_3        
		int k;
		int i1;
		for(k = 0; k <= l - 3; k = i1 + 1)
	//*  27   44:iconst_0        
	//*  28   45:istore          4
	//*  29   47:iload           4
	//*  30   49:iload           5
	//*  31   51:iconst_3        
	//*  32   52:isub            
	//*  33   53:icmpgt          151
		{
			int k1 = k + 1;
	//   34   56:iload           4
	//   35   58:iconst_1        
	//   36   59:iadd            
	//   37   60:istore          7
			k = ((int) (abyte0[k]));
	//   38   62:aload_1         
	//   39   63:iload           4
	//   40   65:baload          
	//   41   66:istore          4
			i1 = k1 + 1;
	//   42   68:iload           7
	//   43   70:iconst_1        
	//   44   71:iadd            
	//   45   72:istore          6
			encodeBase64Chunk(stringbuilder, (k << 8 | abyte0[k1] & 0xff) << 8 | abyte0[i1] & 0xff);
	//   46   74:aload_0         
	//   47   75:aload           8
	//   48   77:iload           4
	//   49   79:bipush          8
	//   50   81:ishl            
	//   51   82:aload_1         
	//   52   83:iload           7
	//   53   85:baload          
	//   54   86:sipush          255
	//   55   89:iand            
	//   56   90:ior             
	//   57   91:bipush          8
	//   58   93:ishl            
	//   59   94:aload_1         
	//   60   95:iload           6
	//   61   97:baload          
	//   62   98:sipush          255
	//   63  101:iand            
	//   64  102:ior             
	//   65  103:invokevirtual   #212 <Method void encodeBase64Chunk(StringBuilder, int)>
			k = i - 1;
	//   66  106:iload_3         
	//   67  107:iconst_1        
	//   68  108:isub            
	//   69  109:istore          4
			i = k;
	//   70  111:iload           4
	//   71  113:istore_3        
			if(k <= 0)
	//*  72  114:iload           4
	//*  73  116:ifgt            142
			{
				stringbuilder.append('\\');
	//   74  119:aload           8
	//   75  121:bipush          92
	//   76  123:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   77  126:pop             
				stringbuilder.append('n');
	//   78  127:aload           8
	//   79  129:bipush          110
	//   80  131:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   81  134:pop             
				i = getMaxLineLength() >> 2;
	//   82  135:aload_0         
	//   83  136:invokevirtual   #208 <Method int getMaxLineLength()>
	//   84  139:iconst_2        
	//   85  140:ishr            
	//   86  141:istore_3        
			}
		}

	//   87  142:iload           6
	//   88  144:iconst_1        
	//   89  145:iadd            
	//   90  146:istore          4
	//*  91  148:goto            47
		l -= k;
	//   92  151:iload           5
	//   93  153:iload           4
	//   94  155:isub            
	//   95  156:istore          5
		if(l > 0)
	//*  96  158:iload           5
	//*  97  160:ifle            229
		{
			int j1 = k + 1;
	//   98  163:iload           4
	//   99  165:iconst_1        
	//  100  166:iadd            
	//  101  167:istore          6
			k = abyte0[k] << 16;
	//  102  169:aload_1         
	//  103  170:iload           4
	//  104  172:baload          
	//  105  173:bipush          16
	//  106  175:ishl            
	//  107  176:istore          4
			int j = k;
	//  108  178:iload           4
	//  109  180:istore_3        
			if(l == 2)
	//* 110  181:iload           5
	//* 111  183:iconst_2        
	//* 112  184:icmpne          202
				j = k | (abyte0[j1] & 0xff) << 8;
	//  113  187:iload           4
	//  114  189:aload_1         
	//  115  190:iload           6
	//  116  192:baload          
	//  117  193:sipush          255
	//  118  196:iand            
	//  119  197:bipush          8
	//  120  199:ishl            
	//  121  200:ior             
	//  122  201:istore_3        
			encodeBase64Partial(stringbuilder, j, l);
	//  123  202:aload_0         
	//  124  203:aload           8
	//  125  205:iload_3         
	//  126  206:iload           5
	//  127  208:invokevirtual   #216 <Method void encodeBase64Partial(StringBuilder, int, int)>
		}
		if(flag)
	//* 128  211:iload_2         
	//* 129  212:ifeq            223
			stringbuilder.append('"');
	//  130  215:aload           8
	//  131  217:bipush          34
	//  132  219:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//  133  222:pop             
		return stringbuilder.toString();
	//  134  223:aload           8
	//  135  225:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  136  228:areturn         
	//* 137  229:goto            211
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
	//    9   13:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
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
	//   20   30:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
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
	//   31   47:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   32   50:pop             
		stringbuilder.append(_base64ToAsciiC[i & 0x3f]);
	//   33   51:aload_1         
	//   34   52:aload_0         
	//   35   53:getfield        #49  <Field char[] _base64ToAsciiC>
	//   36   56:iload_2         
	//   37   57:bipush          63
	//   38   59:iand            
	//   39   60:caload          
	//   40   61:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
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
	//*  32   48:ifeq            111
		{
			byte byte1 = (byte)_paddingChar;
	//   33   51:aload_0         
	//   34   52:getfield        #38  <Field char _paddingChar>
	//   35   55:int2byte        
	//   36   56:istore          6
			int j1 = l + 1;
	//   37   58:iload           7
	//   38   60:iconst_1        
	//   39   61:iadd            
	//   40   62:istore          8
			byte byte0;
			if(j == 2)
	//*  41   64:iload_2         
	//*  42   65:iconst_2        
	//*  43   66:icmpne          104
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
	//*  53   83:aload_3         
	//*  54   84:iload           7
	//*  55   86:iload           5
	//*  56   88:bastore         
	//*  57   89:iload           8
	//*  58   91:iconst_1        
	//*  59   92:iadd            
	//*  60   93:istore          4
	//*  61   95:aload_3         
	//*  62   96:iload           8
	//*  63   98:iload           6
	//*  64  100:bastore         
	//*  65  101:iload           4
	//*  66  103:ireturn         
				byte0 = byte1;
	//   67  104:iload           6
	//   68  106:istore          5
			abyte0[l] = byte0;
			k = j1 + 1;
			abyte0[j1] = byte1;
		} else
	//*  69  108:goto            83
		{
			k = l;
	//   70  111:iload           7
	//   71  113:istore          4
			if(j == 2)
	//*  72  115:iload_2         
	//*  73  116:iconst_2        
	//*  74  117:icmpne          101
			{
				abyte0[l] = _base64ToAsciiB[i >> 6 & 0x3f];
	//   75  120:aload_3         
	//   76  121:iload           7
	//   77  123:aload_0         
	//   78  124:getfield        #51  <Field byte[] _base64ToAsciiB>
	//   79  127:iload_1         
	//   80  128:bipush          6
	//   81  130:ishr            
	//   82  131:bipush          63
	//   83  133:iand            
	//   84  134:baload          
	//   85  135:bastore         
				return l + 1;
	//   86  136:iload           7
	//   87  138:iconst_1        
	//   88  139:iadd            
	//   89  140:ireturn         
			}
		}
		return k;
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
	//*  32   48:ifeq            108
		{
			int j1 = l + 1;
	//   33   51:iload           6
	//   34   53:iconst_1        
	//   35   54:iadd            
	//   36   55:istore          7
			char c;
			if(j == 2)
	//*  37   57:iload_2         
	//*  38   58:iconst_2        
	//*  39   59:icmpne          99
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
	//*  49   76:aload_3         
	//*  50   77:iload           6
	//*  51   79:iload           5
	//*  52   81:castore         
	//*  53   82:iload           7
	//*  54   84:iconst_1        
	//*  55   85:iadd            
	//*  56   86:istore          4
	//*  57   88:aload_3         
	//*  58   89:iload           7
	//*  59   91:aload_0         
	//*  60   92:getfield        #38  <Field char _paddingChar>
	//*  61   95:castore         
	//*  62   96:iload           4
	//*  63   98:ireturn         
				c = _paddingChar;
	//   64   99:aload_0         
	//   65  100:getfield        #38  <Field char _paddingChar>
	//   66  103:istore          5
			ac[l] = c;
			k = j1 + 1;
			ac[j1] = _paddingChar;
		} else
	//*  67  105:goto            76
		{
			k = l;
	//   68  108:iload           6
	//   69  110:istore          4
			if(j == 2)
	//*  70  112:iload_2         
	//*  71  113:iconst_2        
	//*  72  114:icmpne          96
			{
				ac[l] = _base64ToAsciiC[i >> 6 & 0x3f];
	//   73  117:aload_3         
	//   74  118:iload           6
	//   75  120:aload_0         
	//   76  121:getfield        #49  <Field char[] _base64ToAsciiC>
	//   77  124:iload_1         
	//   78  125:bipush          6
	//   79  127:ishr            
	//   80  128:bipush          63
	//   81  130:iand            
	//   82  131:caload          
	//   83  132:castore         
				return l + 1;
	//   84  133:iload           6
	//   85  135:iconst_1        
	//   86  136:iadd            
	//   87  137:ireturn         
			}
		}
		return k;
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
	//    9   13:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
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
	//   20   30:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
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
	//*  27   43:icmpne          77
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
	//*  37   60:aload_1         
	//*  38   61:iload           4
	//*  39   63:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//*  40   66:pop             
	//*  41   67:aload_1         
	//*  42   68:aload_0         
	//*  43   69:getfield        #38  <Field char _paddingChar>
	//*  44   72:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//*  45   75:pop             
	//*  46   76:return          
				c = _paddingChar;
	//   47   77:aload_0         
	//   48   78:getfield        #38  <Field char _paddingChar>
	//   49   81:istore          4
			stringbuilder.append(c);
			stringbuilder.append(_paddingChar);
		} else
	//*  50   83:goto            60
		if(j == 2)
	//*  51   86:iload_3         
	//*  52   87:iconst_2        
	//*  53   88:icmpne          76
		{
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
	//   63  104:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   64  107:pop             
			return;
	//   65  108:return          
		}
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
	protected final transient int _maxLineLength;
	protected final String _name;
	protected final transient char _paddingChar;
	protected final transient boolean _usesPadding;
}
