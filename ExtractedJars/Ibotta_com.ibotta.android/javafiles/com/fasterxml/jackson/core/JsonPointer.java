// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.NumberInput;

public class JsonPointer
{

	protected JsonPointer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		_nextSegment = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #23  <Field JsonPointer _nextSegment>
		_matchingPropertyName = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #25  <String "">
	//    7   12:putfield        #27  <Field String _matchingPropertyName>
		_matchingElementIndex = -1;
	//    8   15:aload_0         
	//    9   16:iconst_m1       
	//   10   17:putfield        #29  <Field int _matchingElementIndex>
		_asString = "";
	//   11   20:aload_0         
	//   12   21:ldc1            #25  <String "">
	//   13   23:putfield        #31  <Field String _asString>
	//   14   26:return          
	}

	protected JsonPointer(String s, String s1, JsonPointer jsonpointer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		_asString = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field String _asString>
		_nextSegment = jsonpointer;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #23  <Field JsonPointer _nextSegment>
		_matchingPropertyName = s1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #27  <Field String _matchingPropertyName>
		_matchingElementIndex = _parseIndex(s1);
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokestatic    #36  <Method int _parseIndex(String)>
	//   14   24:putfield        #29  <Field int _matchingElementIndex>
	//   15   27:return          
	}

	private static void _appendEscape(StringBuilder stringbuilder, char c)
	{
		if(c == '0')
	//*   0    0:iload_1         
	//*   1    1:bipush          48
	//*   2    3:icmpne          12
			c = '~';
	//    3    6:bipush          126
	//    4    8:istore_1        
		else
	//*   5    9:goto            31
		if(c == '1')
	//*   6   12:iload_1         
	//*   7   13:bipush          49
	//*   8   15:icmpne          24
			c = '/';
	//    9   18:bipush          47
	//   10   20:istore_1        
		else
	//*  11   21:goto            31
			stringbuilder.append('~');
	//   12   24:aload_0         
	//   13   25:bipush          126
	//   14   27:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
	//   15   30:pop             
		stringbuilder.append(c);
	//   16   31:aload_0         
	//   17   32:iload_1         
	//   18   33:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
	//   19   36:pop             
	//   20   37:return          
	}

	private static final int _parseIndex(String s)
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method int String.length()>
	//    2    4:istore_3        
		byte byte0 = -1;
	//    3    5:iconst_m1       
	//    4    6:istore_2        
		if(j != 0)
	//*   5    7:iload_3         
	//*   6    8:ifeq            122
		{
			if(j > 10)
	//*   7   11:iload_3         
	//*   8   12:bipush          10
	//*   9   14:icmple          19
				return -1;
	//   10   17:iconst_m1       
	//   11   18:ireturn         
			char c1 = s.charAt(0);
	//   12   19:aload_0         
	//   13   20:iconst_0        
	//   14   21:invokevirtual   #54  <Method char String.charAt(int)>
	//   15   24:istore          4
			int i = 1;
	//   16   26:iconst_1        
	//   17   27:istore_1        
			if(c1 <= '0')
	//*  18   28:iload           4
	//*  19   30:bipush          48
	//*  20   32:icmpgt          55
			{
				i = ((int) (byte0));
	//   21   35:iload_2         
	//   22   36:istore_1        
				if(j == 1)
	//*  23   37:iload_3         
	//*  24   38:iconst_1        
	//*  25   39:icmpne          53
				{
					i = ((int) (byte0));
	//   26   42:iload_2         
	//   27   43:istore_1        
					if(c1 == '0')
	//*  28   44:iload           4
	//*  29   46:bipush          48
	//*  30   48:icmpne          53
						i = 0;
	//   31   51:iconst_0        
	//   32   52:istore_1        
				}
				return i;
	//   33   53:iload_1         
	//   34   54:ireturn         
			}
			if(c1 > '9')
	//*  35   55:iload           4
	//*  36   57:bipush          57
	//*  37   59:icmple          64
				return -1;
	//   38   62:iconst_m1       
	//   39   63:ireturn         
			while(i < j) 
	//*  40   64:iload_1         
	//*  41   65:iload_3         
	//*  42   66:icmpge          98
			{
				char c = s.charAt(i);
	//   43   69:aload_0         
	//   44   70:iload_1         
	//   45   71:invokevirtual   #54  <Method char String.charAt(int)>
	//   46   74:istore_2        
				if(c <= '9')
	//*  47   75:iload_2         
	//*  48   76:bipush          57
	//*  49   78:icmpgt          96
				{
					if(c < '0')
	//*  50   81:iload_2         
	//*  51   82:bipush          48
	//*  52   84:icmpge          89
						return -1;
	//   53   87:iconst_m1       
	//   54   88:ireturn         
					i++;
	//   55   89:iload_1         
	//   56   90:iconst_1        
	//   57   91:iadd            
	//   58   92:istore_1        
				} else
	//*  59   93:goto            64
				{
					return -1;
	//   60   96:iconst_m1       
	//   61   97:ireturn         
				}
			}
			if(j == 10 && NumberInput.parseLong(s) > 0x7fffffffL)
	//*  62   98:iload_3         
	//*  63   99:bipush          10
	//*  64  101:icmpne          117
	//*  65  104:aload_0         
	//*  66  105:invokestatic    #60  <Method long NumberInput.parseLong(String)>
	//*  67  108:ldc2w           #61  <Long 0x7fffffffL>
	//*  68  111:lcmp            
	//*  69  112:ifle            117
				return -1;
	//   70  115:iconst_m1       
	//   71  116:ireturn         
			else
				return NumberInput.parseInt(s);
	//   72  117:aload_0         
	//   73  118:invokestatic    #65  <Method int NumberInput.parseInt(String)>
	//   74  121:ireturn         
		} else
		{
			return -1;
	//   75  122:iconst_m1       
	//   76  123:ireturn         
		}
	}

	protected static JsonPointer _parseQuotedTail(String s, int i)
	{
		int k = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method int String.length()>
	//    2    4:istore          4
		StringBuilder stringbuilder = new StringBuilder(Math.max(16, k));
	//    3    6:new             #40  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:bipush          16
	//    6   12:iload           4
	//    7   14:invokestatic    #73  <Method int Math.max(int, int)>
	//    8   17:invokespecial   #76  <Method void StringBuilder(int)>
	//    9   20:astore          5
		if(i > 2)
	//*  10   22:iload_1         
	//*  11   23:iconst_2        
	//*  12   24:icmple          38
			stringbuilder.append(((CharSequence) (s)), 1, i - 1);
	//   13   27:aload           5
	//   14   29:aload_0         
	//   15   30:iconst_1        
	//   16   31:iload_1         
	//   17   32:iconst_1        
	//   18   33:isub            
	//   19   34:invokevirtual   #79  <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   20   37:pop             
		int j = i + 1;
	//   21   38:iload_1         
	//   22   39:iconst_1        
	//   23   40:iadd            
	//   24   41:istore_3        
		_appendEscape(stringbuilder, s.charAt(i));
	//   25   42:aload           5
	//   26   44:aload_0         
	//   27   45:iload_1         
	//   28   46:invokevirtual   #54  <Method char String.charAt(int)>
	//   29   49:invokestatic    #81  <Method void _appendEscape(StringBuilder, char)>
		for(i = j; i < k;)
	//*  30   52:iload_3         
	//*  31   53:istore_1        
	//*  32   54:iload_1         
	//*  33   55:iload           4
	//*  34   57:icmpge          137
		{
			char c = s.charAt(i);
	//   35   60:aload_0         
	//   36   61:iload_1         
	//   37   62:invokevirtual   #54  <Method char String.charAt(int)>
	//   38   65:istore_2        
			if(c == '/')
	//*  39   66:iload_2         
	//*  40   67:bipush          47
	//*  41   69:icmpne          94
				return new JsonPointer(s, stringbuilder.toString(), _parseTail(s.substring(i)));
	//   42   72:new             #2   <Class JsonPointer>
	//   43   75:dup             
	//   44   76:aload_0         
	//   45   77:aload           5
	//   46   79:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   47   82:aload_0         
	//   48   83:iload_1         
	//   49   84:invokevirtual   #89  <Method String String.substring(int)>
	//   50   87:invokestatic    #93  <Method JsonPointer _parseTail(String)>
	//   51   90:invokespecial   #95  <Method void JsonPointer(String, String, JsonPointer)>
	//   52   93:areturn         
			i++;
	//   53   94:iload_1         
	//   54   95:iconst_1        
	//   55   96:iadd            
	//   56   97:istore_1        
			if(c == '~' && i < k)
	//*  57   98:iload_2         
	//*  58   99:bipush          126
	//*  59  101:icmpne          127
	//*  60  104:iload_1         
	//*  61  105:iload           4
	//*  62  107:icmpge          127
			{
				_appendEscape(stringbuilder, s.charAt(i));
	//   63  110:aload           5
	//   64  112:aload_0         
	//   65  113:iload_1         
	//   66  114:invokevirtual   #54  <Method char String.charAt(int)>
	//   67  117:invokestatic    #81  <Method void _appendEscape(StringBuilder, char)>
				i++;
	//   68  120:iload_1         
	//   69  121:iconst_1        
	//   70  122:iadd            
	//   71  123:istore_1        
			} else
	//*  72  124:goto            54
			{
				stringbuilder.append(c);
	//   73  127:aload           5
	//   74  129:iload_2         
	//   75  130:invokevirtual   #44  <Method StringBuilder StringBuilder.append(char)>
	//   76  133:pop             
			}
		}

	//*  77  134:goto            54
		return new JsonPointer(s, stringbuilder.toString(), EMPTY);
	//   78  137:new             #2   <Class JsonPointer>
	//   79  140:dup             
	//   80  141:aload_0         
	//   81  142:aload           5
	//   82  144:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   83  147:getstatic       #19  <Field JsonPointer EMPTY>
	//   84  150:invokespecial   #95  <Method void JsonPointer(String, String, JsonPointer)>
	//   85  153:areturn         
	}

	protected static JsonPointer _parseTail(String s)
	{
		int k = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method int String.length()>
	//    2    4:istore_3        
		for(int i = 1; i < k;)
	//*   3    5:iconst_1        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_3         
	//*   7    9:icmpge          75
		{
			char c = s.charAt(i);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #54  <Method char String.charAt(int)>
	//   11   17:istore          4
			if(c == '/')
	//*  12   19:iload           4
	//*  13   21:bipush          47
	//*  14   23:icmpne          49
				return new JsonPointer(s, s.substring(1, i), _parseTail(s.substring(i)));
	//   15   26:new             #2   <Class JsonPointer>
	//   16   29:dup             
	//   17   30:aload_0         
	//   18   31:aload_0         
	//   19   32:iconst_1        
	//   20   33:iload_1         
	//   21   34:invokevirtual   #98  <Method String String.substring(int, int)>
	//   22   37:aload_0         
	//   23   38:iload_1         
	//   24   39:invokevirtual   #89  <Method String String.substring(int)>
	//   25   42:invokestatic    #93  <Method JsonPointer _parseTail(String)>
	//   26   45:invokespecial   #95  <Method void JsonPointer(String, String, JsonPointer)>
	//   27   48:areturn         
			int j = i + 1;
	//   28   49:iload_1         
	//   29   50:iconst_1        
	//   30   51:iadd            
	//   31   52:istore_2        
			i = j;
	//   32   53:iload_2         
	//   33   54:istore_1        
			if(c == '~')
	//*  34   55:iload           4
	//*  35   57:bipush          126
	//*  36   59:icmpne          7
			{
				i = j;
	//   37   62:iload_2         
	//   38   63:istore_1        
				if(j < k)
	//*  39   64:iload_2         
	//*  40   65:iload_3         
	//*  41   66:icmpge          7
					return _parseQuotedTail(s, j);
	//   42   69:aload_0         
	//   43   70:iload_2         
	//   44   71:invokestatic    #100 <Method JsonPointer _parseQuotedTail(String, int)>
	//   45   74:areturn         
			}
		}

		return new JsonPointer(s, s.substring(1), EMPTY);
	//   46   75:new             #2   <Class JsonPointer>
	//   47   78:dup             
	//   48   79:aload_0         
	//   49   80:aload_0         
	//   50   81:iconst_1        
	//   51   82:invokevirtual   #89  <Method String String.substring(int)>
	//   52   85:getstatic       #19  <Field JsonPointer EMPTY>
	//   53   88:invokespecial   #95  <Method void JsonPointer(String, String, JsonPointer)>
	//   54   91:areturn         
	}

	public static JsonPointer compile(String s)
		throws IllegalArgumentException
	{
		if(s != null && s.length() != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          69
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #50  <Method int String.length()>
	//*   4    8:ifne            14
	//*   5   11:goto            69
		{
			if(s.charAt(0) == '/')
	//*   6   14:aload_0         
	//*   7   15:iconst_0        
	//*   8   16:invokevirtual   #54  <Method char String.charAt(int)>
	//*   9   19:bipush          47
	//*  10   21:icmpne          29
			{
				return _parseTail(s);
	//   11   24:aload_0         
	//   12   25:invokestatic    #93  <Method JsonPointer _parseTail(String)>
	//   13   28:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   14   29:new             #40  <Class StringBuilder>
	//   15   32:dup             
	//   16   33:invokespecial   #104 <Method void StringBuilder()>
	//   17   36:astore_1        
				stringbuilder.append("Invalid input: JSON Pointer expression must start with '/': \"");
	//   18   37:aload_1         
	//   19   38:ldc1            #106 <String "Invalid input: JSON Pointer expression must start with '/': \"">
	//   20   40:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
				stringbuilder.append(s);
	//   22   44:aload_1         
	//   23   45:aload_0         
	//   24   46:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
				stringbuilder.append("\"");
	//   26   50:aload_1         
	//   27   51:ldc1            #111 <String "\"">
	//   28   53:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   30   57:new             #103 <Class IllegalArgumentException>
	//   31   60:dup             
	//   32   61:aload_1         
	//   33   62:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   34   65:invokespecial   #114 <Method void IllegalArgumentException(String)>
	//   35   68:athrow          
			}
		} else
		{
			return EMPTY;
	//   36   69:getstatic       #19  <Field JsonPointer EMPTY>
	//   37   72:areturn         
		}
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(!(obj instanceof JsonPointer))
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class JsonPointer>
	//*  11   17:ifne            22
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		else
			return _asString.equals(((Object) (((JsonPointer)obj)._asString)));
	//   14   22:aload_0         
	//   15   23:getfield        #31  <Field String _asString>
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class JsonPointer>
	//   18   30:getfield        #31  <Field String _asString>
	//   19   33:invokevirtual   #119 <Method boolean String.equals(Object)>
	//   20   36:ireturn         
	}

	public int getMatchingIndex()
	{
		return _matchingElementIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int _matchingElementIndex>
	//    2    4:ireturn         
	}

	public String getMatchingProperty()
	{
		return _matchingPropertyName;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String _matchingPropertyName>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return _asString.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String _asString>
	//    2    4:invokevirtual   #124 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public boolean matches()
	{
		return _nextSegment == null;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JsonPointer _nextSegment>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public JsonPointer tail()
	{
		return _nextSegment;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JsonPointer _nextSegment>
	//    2    4:areturn         
	}

	public String toString()
	{
		return _asString;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String _asString>
	//    2    4:areturn         
	}

	protected static final JsonPointer EMPTY = new JsonPointer();
	protected final String _asString;
	protected final int _matchingElementIndex;
	protected final String _matchingPropertyName;
	protected final JsonPointer _nextSegment;

	static 
	{
	//    0    0:new             #2   <Class JsonPointer>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void JsonPointer()>
	//    3    7:putstatic       #19  <Field JsonPointer EMPTY>
	//*   4   10:return          
	}
}
