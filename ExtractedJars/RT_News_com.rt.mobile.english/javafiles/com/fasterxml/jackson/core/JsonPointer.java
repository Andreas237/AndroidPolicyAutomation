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
	//    1    1:invokespecial   #22  <Method void Object()>
		_nextSegment = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #24  <Field JsonPointer _nextSegment>
		_matchingPropertyName = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #26  <String "">
	//    7   12:putfield        #28  <Field String _matchingPropertyName>
		_matchingElementIndex = -1;
	//    8   15:aload_0         
	//    9   16:iconst_m1       
	//   10   17:putfield        #30  <Field int _matchingElementIndex>
		_asString = "";
	//   11   20:aload_0         
	//   12   21:ldc1            #26  <String "">
	//   13   23:putfield        #32  <Field String _asString>
	//   14   26:return          
	}

	protected JsonPointer(String s, String s1, int i, JsonPointer jsonpointer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		_asString = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field String _asString>
		_nextSegment = jsonpointer;
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:putfield        #24  <Field JsonPointer _nextSegment>
		_matchingPropertyName = s1;
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:putfield        #28  <Field String _matchingPropertyName>
		_matchingElementIndex = i;
	//   11   20:aload_0         
	//   12   21:iload_3         
	//   13   22:putfield        #30  <Field int _matchingElementIndex>
	//   14   25:return          
	}

	protected JsonPointer(String s, String s1, JsonPointer jsonpointer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		_asString = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field String _asString>
		_nextSegment = jsonpointer;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #24  <Field JsonPointer _nextSegment>
		_matchingPropertyName = s1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #28  <Field String _matchingPropertyName>
		_matchingElementIndex = _parseIndex(s1);
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokestatic    #38  <Method int _parseIndex(String)>
	//   14   24:putfield        #30  <Field int _matchingElementIndex>
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
	//   14   27:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   15   30:pop             
		stringbuilder.append(c);
	//   16   31:aload_0         
	//   17   32:iload_1         
	//   18   33:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   19   36:pop             
	//   20   37:return          
	}

	private static final int _parseIndex(String s)
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method int String.length()>
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
	//   14   21:invokevirtual   #56  <Method char String.charAt(int)>
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
	//   45   71:invokevirtual   #56  <Method char String.charAt(int)>
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
	//*  66  105:invokestatic    #62  <Method long NumberInput.parseLong(String)>
	//*  67  108:ldc2w           #63  <Long 0x7fffffffL>
	//*  68  111:lcmp            
	//*  69  112:ifle            117
				return -1;
	//   70  115:iconst_m1       
	//   71  116:ireturn         
			else
				return NumberInput.parseInt(s);
	//   72  117:aload_0         
	//   73  118:invokestatic    #67  <Method int NumberInput.parseInt(String)>
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
	//    1    1:invokevirtual   #52  <Method int String.length()>
	//    2    4:istore          4
		StringBuilder stringbuilder = new StringBuilder(Math.max(16, k));
	//    3    6:new             #42  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:bipush          16
	//    6   12:iload           4
	//    7   14:invokestatic    #75  <Method int Math.max(int, int)>
	//    8   17:invokespecial   #78  <Method void StringBuilder(int)>
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
	//   19   34:invokevirtual   #81  <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
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
	//   28   46:invokevirtual   #56  <Method char String.charAt(int)>
	//   29   49:invokestatic    #83  <Method void _appendEscape(StringBuilder, char)>
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
	//   37   62:invokevirtual   #56  <Method char String.charAt(int)>
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
	//   46   79:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   47   82:aload_0         
	//   48   83:iload_1         
	//   49   84:invokevirtual   #91  <Method String String.substring(int)>
	//   50   87:invokestatic    #95  <Method JsonPointer _parseTail(String)>
	//   51   90:invokespecial   #97  <Method void JsonPointer(String, String, JsonPointer)>
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
	//   66  114:invokevirtual   #56  <Method char String.charAt(int)>
	//   67  117:invokestatic    #83  <Method void _appendEscape(StringBuilder, char)>
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
	//   75  130:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   76  133:pop             
			}
		}

	//*  77  134:goto            54
		return new JsonPointer(s, stringbuilder.toString(), EMPTY);
	//   78  137:new             #2   <Class JsonPointer>
	//   79  140:dup             
	//   80  141:aload_0         
	//   81  142:aload           5
	//   82  144:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   83  147:getstatic       #20  <Field JsonPointer EMPTY>
	//   84  150:invokespecial   #97  <Method void JsonPointer(String, String, JsonPointer)>
	//   85  153:areturn         
	}

	protected static JsonPointer _parseTail(String s)
	{
		int k = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method int String.length()>
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
	//   10   14:invokevirtual   #56  <Method char String.charAt(int)>
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
	//   21   34:invokevirtual   #100 <Method String String.substring(int, int)>
	//   22   37:aload_0         
	//   23   38:iload_1         
	//   24   39:invokevirtual   #91  <Method String String.substring(int)>
	//   25   42:invokestatic    #95  <Method JsonPointer _parseTail(String)>
	//   26   45:invokespecial   #97  <Method void JsonPointer(String, String, JsonPointer)>
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
	//   44   71:invokestatic    #102 <Method JsonPointer _parseQuotedTail(String, int)>
	//   45   74:areturn         
			}
		}

		return new JsonPointer(s, s.substring(1), EMPTY);
	//   46   75:new             #2   <Class JsonPointer>
	//   47   78:dup             
	//   48   79:aload_0         
	//   49   80:aload_0         
	//   50   81:iconst_1        
	//   51   82:invokevirtual   #91  <Method String String.substring(int)>
	//   52   85:getstatic       #20  <Field JsonPointer EMPTY>
	//   53   88:invokespecial   #97  <Method void JsonPointer(String, String, JsonPointer)>
	//   54   91:areturn         
	}

	public static JsonPointer compile(String s)
		throws IllegalArgumentException
	{
		if(s != null && s.length() != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          69
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #52  <Method int String.length()>
	//*   4    8:ifne            14
	//*   5   11:goto            69
		{
			if(s.charAt(0) != '/')
	//*   6   14:aload_0         
	//*   7   15:iconst_0        
	//*   8   16:invokevirtual   #56  <Method char String.charAt(int)>
	//*   9   19:bipush          47
	//*  10   21:icmpeq          64
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   11   24:new             #42  <Class StringBuilder>
	//   12   27:dup             
	//   13   28:invokespecial   #106 <Method void StringBuilder()>
	//   14   31:astore_1        
				stringbuilder.append("Invalid input: JSON Pointer expression must start with '/': \"");
	//   15   32:aload_1         
	//   16   33:ldc1            #108 <String "Invalid input: JSON Pointer expression must start with '/': \"">
	//   17   35:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
				stringbuilder.append(s);
	//   19   39:aload_1         
	//   20   40:aload_0         
	//   21   41:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
				stringbuilder.append("\"");
	//   23   45:aload_1         
	//   24   46:ldc1            #113 <String "\"">
	//   25   48:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   27   52:new             #105 <Class IllegalArgumentException>
	//   28   55:dup             
	//   29   56:aload_1         
	//   30   57:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   31   60:invokespecial   #116 <Method void IllegalArgumentException(String)>
	//   32   63:athrow          
			} else
			{
				return _parseTail(s);
	//   33   64:aload_0         
	//   34   65:invokestatic    #95  <Method JsonPointer _parseTail(String)>
	//   35   68:areturn         
			}
		} else
		{
			return EMPTY;
	//   36   69:getstatic       #20  <Field JsonPointer EMPTY>
	//   37   72:areturn         
		}
	}

	public static JsonPointer valueOf(String s)
	{
		return compile(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #120 <Method JsonPointer compile(String)>
	//    2    4:areturn         
	}

	protected JsonPointer _constructHead()
	{
		JsonPointer jsonpointer = last();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #125 <Method JsonPointer last()>
	//    2    4:astore_2        
		if(jsonpointer == this)
	//*   3    5:aload_2         
	//*   4    6:aload_0         
	//*   5    7:if_acmpne       14
		{
			return EMPTY;
	//    6   10:getstatic       #20  <Field JsonPointer EMPTY>
	//    7   13:areturn         
		} else
		{
			int i = jsonpointer._asString.length();
	//    8   14:aload_2         
	//    9   15:getfield        #32  <Field String _asString>
	//   10   18:invokevirtual   #52  <Method int String.length()>
	//   11   21:istore_1        
			JsonPointer jsonpointer1 = _nextSegment;
	//   12   22:aload_0         
	//   13   23:getfield        #24  <Field JsonPointer _nextSegment>
	//   14   26:astore_3        
			return new JsonPointer(_asString.substring(0, _asString.length() - i), _matchingPropertyName, _matchingElementIndex, jsonpointer1._constructHead(i, jsonpointer));
	//   15   27:new             #2   <Class JsonPointer>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:getfield        #32  <Field String _asString>
	//   19   35:iconst_0        
	//   20   36:aload_0         
	//   21   37:getfield        #32  <Field String _asString>
	//   22   40:invokevirtual   #52  <Method int String.length()>
	//   23   43:iload_1         
	//   24   44:isub            
	//   25   45:invokevirtual   #100 <Method String String.substring(int, int)>
	//   26   48:aload_0         
	//   27   49:getfield        #28  <Field String _matchingPropertyName>
	//   28   52:aload_0         
	//   29   53:getfield        #30  <Field int _matchingElementIndex>
	//   30   56:aload_3         
	//   31   57:iload_1         
	//   32   58:aload_2         
	//   33   59:invokevirtual   #128 <Method JsonPointer _constructHead(int, JsonPointer)>
	//   34   62:invokespecial   #130 <Method void JsonPointer(String, String, int, JsonPointer)>
	//   35   65:areturn         
		}
	}

	protected JsonPointer _constructHead(int i, JsonPointer jsonpointer)
	{
		if(this == jsonpointer)
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:if_acmpne       9
		{
			return EMPTY;
	//    3    5:getstatic       #20  <Field JsonPointer EMPTY>
	//    4    8:areturn         
		} else
		{
			JsonPointer jsonpointer1 = _nextSegment;
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field JsonPointer _nextSegment>
	//    7   13:astore_3        
			String s = _asString;
	//    8   14:aload_0         
	//    9   15:getfield        #32  <Field String _asString>
	//   10   18:astore          4
			return new JsonPointer(s.substring(0, s.length() - i), _matchingPropertyName, _matchingElementIndex, jsonpointer1._constructHead(i, jsonpointer));
	//   11   20:new             #2   <Class JsonPointer>
	//   12   23:dup             
	//   13   24:aload           4
	//   14   26:iconst_0        
	//   15   27:aload           4
	//   16   29:invokevirtual   #52  <Method int String.length()>
	//   17   32:iload_1         
	//   18   33:isub            
	//   19   34:invokevirtual   #100 <Method String String.substring(int, int)>
	//   20   37:aload_0         
	//   21   38:getfield        #28  <Field String _matchingPropertyName>
	//   22   41:aload_0         
	//   23   42:getfield        #30  <Field int _matchingElementIndex>
	//   24   45:aload_3         
	//   25   46:iload_1         
	//   26   47:aload_2         
	//   27   48:invokevirtual   #128 <Method JsonPointer _constructHead(int, JsonPointer)>
	//   28   51:invokespecial   #130 <Method void JsonPointer(String, String, int, JsonPointer)>
	//   29   54:areturn         
		}
	}

	public JsonPointer append(JsonPointer jsonpointer)
	{
		if(this == EMPTY)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #20  <Field JsonPointer EMPTY>
	//*   2    4:if_acmpne       9
			return jsonpointer;
	//    3    7:aload_1         
	//    4    8:areturn         
		if(jsonpointer == EMPTY)
	//*   5    9:aload_1         
	//*   6   10:getstatic       #20  <Field JsonPointer EMPTY>
	//*   7   13:if_acmpne       18
			return this;
	//    8   16:aload_0         
	//    9   17:areturn         
		Object obj = ((Object) (_asString));
	//   10   18:aload_0         
	//   11   19:getfield        #32  <Field String _asString>
	//   12   22:astore_3        
		String s = ((String) (obj));
	//   13   23:aload_3         
	//   14   24:astore_2        
		if(((String) (obj)).endsWith("/"))
	//*  15   25:aload_3         
	//*  16   26:ldc1            #133 <String "/">
	//*  17   28:invokevirtual   #137 <Method boolean String.endsWith(String)>
	//*  18   31:ifeq            46
			s = ((String) (obj)).substring(0, ((String) (obj)).length() - 1);
	//   19   34:aload_3         
	//   20   35:iconst_0        
	//   21   36:aload_3         
	//   22   37:invokevirtual   #52  <Method int String.length()>
	//   23   40:iconst_1        
	//   24   41:isub            
	//   25   42:invokevirtual   #100 <Method String String.substring(int, int)>
	//   26   45:astore_2        
		obj = ((Object) (new StringBuilder()));
	//   27   46:new             #42  <Class StringBuilder>
	//   28   49:dup             
	//   29   50:invokespecial   #106 <Method void StringBuilder()>
	//   30   53:astore_3        
		((StringBuilder) (obj)).append(s);
	//   31   54:aload_3         
	//   32   55:aload_2         
	//   33   56:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   34   59:pop             
		((StringBuilder) (obj)).append(jsonpointer._asString);
	//   35   60:aload_3         
	//   36   61:aload_1         
	//   37   62:getfield        #32  <Field String _asString>
	//   38   65:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   39   68:pop             
		return compile(((StringBuilder) (obj)).toString());
	//   40   69:aload_3         
	//   41   70:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   42   73:invokestatic    #120 <Method JsonPointer compile(String)>
	//   43   76:areturn         
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
	//   15   23:getfield        #32  <Field String _asString>
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class JsonPointer>
	//   18   30:getfield        #32  <Field String _asString>
	//   19   33:invokevirtual   #141 <Method boolean String.equals(Object)>
	//   20   36:ireturn         
	}

	public int getMatchingIndex()
	{
		return _matchingElementIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int _matchingElementIndex>
	//    2    4:ireturn         
	}

	public String getMatchingProperty()
	{
		return _matchingPropertyName;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String _matchingPropertyName>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return _asString.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String _asString>
	//    2    4:invokevirtual   #146 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public JsonPointer head()
	{
		JsonPointer jsonpointer = _head;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field JsonPointer _head>
	//    2    4:astore_1        
		JsonPointer jsonpointer1 = jsonpointer;
	//    3    5:aload_1         
	//    4    6:astore_2        
		if(jsonpointer == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       30
		{
			if(this != EMPTY)
	//*   7   11:aload_0         
	//*   8   12:getstatic       #20  <Field JsonPointer EMPTY>
	//*   9   15:if_acmpeq       23
				jsonpointer = _constructHead();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #151 <Method JsonPointer _constructHead()>
	//   12   22:astore_1        
			_head = jsonpointer;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:putfield        #149 <Field JsonPointer _head>
			jsonpointer1 = jsonpointer;
	//   16   28:aload_1         
	//   17   29:astore_2        
		}
		return jsonpointer1;
	//   18   30:aload_2         
	//   19   31:areturn         
	}

	public JsonPointer last()
	{
		if(this == EMPTY)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #20  <Field JsonPointer EMPTY>
	//*   2    4:if_acmpne       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		JsonPointer jsonpointer = this;
	//    5    9:aload_0         
	//    6   10:astore_1        
		do
		{
			JsonPointer jsonpointer1 = jsonpointer._nextSegment;
	//    7   11:aload_1         
	//    8   12:getfield        #24  <Field JsonPointer _nextSegment>
	//    9   15:astore_2        
			if(jsonpointer1 != EMPTY)
	//*  10   16:aload_2         
	//*  11   17:getstatic       #20  <Field JsonPointer EMPTY>
	//*  12   20:if_acmpeq       28
				jsonpointer = jsonpointer1;
	//   13   23:aload_2         
	//   14   24:astore_1        
			else
	//*  15   25:goto            11
				return jsonpointer;
	//   16   28:aload_1         
	//   17   29:areturn         
		} while(true);
	}

	public JsonPointer matchElement(int i)
	{
		if(i == _matchingElementIndex && i >= 0)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #30  <Field int _matchingElementIndex>
	//*   3    5:icmpne          20
	//*   4    8:iload_1         
	//*   5    9:ifge            15
	//*   6   12:goto            20
			return _nextSegment;
	//    7   15:aload_0         
	//    8   16:getfield        #24  <Field JsonPointer _nextSegment>
	//    9   19:areturn         
		else
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
	}

	public JsonPointer matchProperty(String s)
	{
		if(_nextSegment != null && _matchingPropertyName.equals(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field JsonPointer _nextSegment>
	//*   2    4:ifnull          23
	//*   3    7:aload_0         
	//*   4    8:getfield        #28  <Field String _matchingPropertyName>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #141 <Method boolean String.equals(Object)>
	//*   7   15:ifeq            23
			return _nextSegment;
	//    8   18:aload_0         
	//    9   19:getfield        #24  <Field JsonPointer _nextSegment>
	//   10   22:areturn         
		else
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
	}

	public boolean matches()
	{
		return _nextSegment == null;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field JsonPointer _nextSegment>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean matchesElement(int i)
	{
		return i == _matchingElementIndex && i >= 0;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field int _matchingElementIndex>
	//    3    5:icmpne          14
	//    4    8:iload_1         
	//    5    9:iflt            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean matchesProperty(String s)
	{
		return _nextSegment != null && _matchingPropertyName.equals(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field JsonPointer _nextSegment>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field String _matchingPropertyName>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #141 <Method boolean String.equals(Object)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public boolean mayMatchElement()
	{
		return _matchingElementIndex >= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int _matchingElementIndex>
	//    2    4:iflt            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean mayMatchProperty()
	{
		return _matchingPropertyName != null;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String _matchingPropertyName>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public JsonPointer tail()
	{
		return _nextSegment;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field JsonPointer _nextSegment>
	//    2    4:areturn         
	}

	public String toString()
	{
		return _asString;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String _asString>
	//    2    4:areturn         
	}

	protected static final JsonPointer EMPTY = new JsonPointer();
	protected final String _asString;
	protected volatile JsonPointer _head;
	protected final int _matchingElementIndex;
	protected final String _matchingPropertyName;
	protected final JsonPointer _nextSegment;

	static 
	{
	//    0    0:new             #2   <Class JsonPointer>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void JsonPointer()>
	//    3    7:putstatic       #20  <Field JsonPointer EMPTY>
	//*   4   10:return          
	}
}
