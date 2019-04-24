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
	//*   2    3:icmpne          16
			c = '~';
	//    3    6:bipush          126
	//    4    8:istore_1        
		else
	//*   5    9:aload_0         
	//*   6   10:iload_1         
	//*   7   11:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//*   8   14:pop             
	//*   9   15:return          
		if(c == '1')
	//*  10   16:iload_1         
	//*  11   17:bipush          49
	//*  12   19:icmpne          28
			c = '/';
	//   13   22:bipush          47
	//   14   24:istore_1        
		else
	//*  15   25:goto            9
			stringbuilder.append('~');
	//   16   28:aload_0         
	//   17   29:bipush          126
	//   18   31:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   19   34:pop             
		stringbuilder.append(c);
	//*  20   35:goto            9
	}

	private static final int _parseIndex(String s)
	{
		int i;
		int j;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		j = s.length();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #52  <Method int String.length()>
	//    4    6:istore_2        
		if(j != 0 && j <= 10) goto _L2; else goto _L1
	//    5    7:iload_2         
	//    6    8:ifeq            17
	//    7   11:iload_2         
	//    8   12:bipush          10
	//    9   14:icmple          19
_L1:
		return -1;
	//   10   17:iconst_m1       
	//   11   18:ireturn         
_L2:
		char c;
		c = s.charAt(0);
	//   12   19:aload_0         
	//   13   20:iconst_0        
	//   14   21:invokevirtual   #56  <Method char String.charAt(int)>
	//   15   24:istore_3        
		if(c <= '0')
	//*  16   25:iload_3         
	//*  17   26:bipush          48
	//*  18   28:icmpgt          49
		{
			if(j != 1 || c != '0')
	//*  19   31:iload_2         
	//*  20   32:iconst_1        
	//*  21   33:icmpne          44
	//*  22   36:iload_3         
	//*  23   37:bipush          48
	//*  24   39:icmpne          44
	//*  25   42:iload_1         
	//*  26   43:ireturn         
				i = -1;
	//   27   44:iconst_m1       
	//   28   45:istore_1        
			return i;
		}
	//*  29   46:goto            42
		if(c > '9') goto _L1; else goto _L3
	//   30   49:iload_3         
	//   31   50:bipush          57
	//   32   52:icmpgt          17
_L3:
		i = 1;
	//   33   55:iconst_1        
	//   34   56:istore_1        
_L5:
		if(i >= j)
			continue; /* Loop/switch isn't completed */
	//   35   57:iload_1         
	//   36   58:iload_2         
	//   37   59:icmpge          87
		c = s.charAt(i);
	//   38   62:aload_0         
	//   39   63:iload_1         
	//   40   64:invokevirtual   #56  <Method char String.charAt(int)>
	//   41   67:istore_3        
		if(c > '9' || c < '0') goto _L1; else goto _L4
	//   42   68:iload_3         
	//   43   69:bipush          57
	//   44   71:icmpgt          17
	//   45   74:iload_3         
	//   46   75:bipush          48
	//   47   77:icmplt          17
_L4:
		i++;
	//   48   80:iload_1         
	//   49   81:iconst_1        
	//   50   82:iadd            
	//   51   83:istore_1        
		  goto _L5
	//*  52   84:goto            57
		if(j == 10 && NumberInput.parseLong(s) > 0x7fffffffL) goto _L1; else goto _L6
	//   53   87:iload_2         
	//   54   88:bipush          10
	//   55   90:icmpne          104
	//   56   93:aload_0         
	//   57   94:invokestatic    #62  <Method long NumberInput.parseLong(String)>
	//   58   97:ldc2w           #63  <Long 0x7fffffffL>
	//   59  100:lcmp            
	//   60  101:ifgt            17
_L6:
		return NumberInput.parseInt(s);
	//   61  104:aload_0         
	//   62  105:invokestatic    #67  <Method int NumberInput.parseInt(String)>
	//   63  108:ireturn         
	}

	protected static JsonPointer _parseQuotedTail(String s, int i)
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method int String.length()>
	//    2    4:istore_3        
		StringBuilder stringbuilder = new StringBuilder(Math.max(16, j));
	//    3    5:new             #42  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:bipush          16
	//    6   11:iload_3         
	//    7   12:invokestatic    #75  <Method int Math.max(int, int)>
	//    8   15:invokespecial   #78  <Method void StringBuilder(int)>
	//    9   18:astore          4
		if(i > 2)
	//*  10   20:iload_1         
	//*  11   21:iconst_2        
	//*  12   22:icmple          36
			stringbuilder.append(((CharSequence) (s)), 1, i - 1);
	//   13   25:aload           4
	//   14   27:aload_0         
	//   15   28:iconst_1        
	//   16   29:iload_1         
	//   17   30:iconst_1        
	//   18   31:isub            
	//   19   32:invokevirtual   #81  <Method StringBuilder StringBuilder.append(CharSequence, int, int)>
	//   20   35:pop             
		_appendEscape(stringbuilder, s.charAt(i));
	//   21   36:aload           4
	//   22   38:aload_0         
	//   23   39:iload_1         
	//   24   40:invokevirtual   #56  <Method char String.charAt(int)>
	//   25   43:invokestatic    #83  <Method void _appendEscape(StringBuilder, char)>
		for(i++; i < j;)
	//*  26   46:iload_1         
	//*  27   47:iconst_1        
	//*  28   48:iadd            
	//*  29   49:istore_1        
	//*  30   50:iload_1         
	//*  31   51:iload_3         
	//*  32   52:icmpge          131
		{
			char c = s.charAt(i);
	//   33   55:aload_0         
	//   34   56:iload_1         
	//   35   57:invokevirtual   #56  <Method char String.charAt(int)>
	//   36   60:istore_2        
			if(c == '/')
	//*  37   61:iload_2         
	//*  38   62:bipush          47
	//*  39   64:icmpne          89
				return new JsonPointer(s, stringbuilder.toString(), _parseTail(s.substring(i)));
	//   40   67:new             #2   <Class JsonPointer>
	//   41   70:dup             
	//   42   71:aload_0         
	//   43   72:aload           4
	//   44   74:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   45   77:aload_0         
	//   46   78:iload_1         
	//   47   79:invokevirtual   #91  <Method String String.substring(int)>
	//   48   82:invokestatic    #95  <Method JsonPointer _parseTail(String)>
	//   49   85:invokespecial   #97  <Method void JsonPointer(String, String, JsonPointer)>
	//   50   88:areturn         
			i++;
	//   51   89:iload_1         
	//   52   90:iconst_1        
	//   53   91:iadd            
	//   54   92:istore_1        
			if(c == '~' && i < j)
	//*  55   93:iload_2         
	//*  56   94:bipush          126
	//*  57   96:icmpne          121
	//*  58   99:iload_1         
	//*  59  100:iload_3         
	//*  60  101:icmpge          121
			{
				_appendEscape(stringbuilder, s.charAt(i));
	//   61  104:aload           4
	//   62  106:aload_0         
	//   63  107:iload_1         
	//   64  108:invokevirtual   #56  <Method char String.charAt(int)>
	//   65  111:invokestatic    #83  <Method void _appendEscape(StringBuilder, char)>
				i++;
	//   66  114:iload_1         
	//   67  115:iconst_1        
	//   68  116:iadd            
	//   69  117:istore_1        
			} else
	//*  70  118:goto            50
			{
				stringbuilder.append(c);
	//   71  121:aload           4
	//   72  123:iload_2         
	//   73  124:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   74  127:pop             
			}
		}

	//*  75  128:goto            50
		return new JsonPointer(s, stringbuilder.toString(), EMPTY);
	//   76  131:new             #2   <Class JsonPointer>
	//   77  134:dup             
	//   78  135:aload_0         
	//   79  136:aload           4
	//   80  138:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   81  141:getstatic       #20  <Field JsonPointer EMPTY>
	//   82  144:invokespecial   #97  <Method void JsonPointer(String, String, JsonPointer)>
	//   83  147:areturn         
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
		if(s == null || s.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #52  <Method int String.length()>
	//*   4    8:ifne            15
			return EMPTY;
	//    5   11:getstatic       #20  <Field JsonPointer EMPTY>
	//    6   14:areturn         
		if(s.charAt(0) != '/')
	//*   7   15:aload_0         
	//*   8   16:iconst_0        
	//*   9   17:invokevirtual   #56  <Method char String.charAt(int)>
	//*  10   20:bipush          47
	//*  11   22:icmpeq          57
			throw new IllegalArgumentException((new StringBuilder()).append("Invalid input: JSON Pointer expression must start with '/': \"").append(s).append("\"").toString());
	//   12   25:new             #105 <Class IllegalArgumentException>
	//   13   28:dup             
	//   14   29:new             #42  <Class StringBuilder>
	//   15   32:dup             
	//   16   33:invokespecial   #106 <Method void StringBuilder()>
	//   17   36:ldc1            #108 <String "Invalid input: JSON Pointer expression must start with '/': \"">
	//   18   38:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:aload_0         
	//   20   42:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   21   45:ldc1            #113 <String "\"">
	//   22   47:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   23   50:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   24   53:invokespecial   #116 <Method void IllegalArgumentException(String)>
	//   25   56:athrow          
		else
			return _parseTail(s);
	//   26   57:aload_0         
	//   27   58:invokestatic    #95  <Method JsonPointer _parseTail(String)>
	//   28   61:areturn         
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
		String s1 = _asString;
	//   10   18:aload_0         
	//   11   19:getfield        #32  <Field String _asString>
	//   12   22:astore_3        
		String s = s1;
	//   13   23:aload_3         
	//   14   24:astore_2        
		if(s1.endsWith("/"))
	//*  15   25:aload_3         
	//*  16   26:ldc1            #133 <String "/">
	//*  17   28:invokevirtual   #137 <Method boolean String.endsWith(String)>
	//*  18   31:ifeq            46
			s = s1.substring(0, s1.length() - 1);
	//   19   34:aload_3         
	//   20   35:iconst_0        
	//   21   36:aload_3         
	//   22   37:invokevirtual   #52  <Method int String.length()>
	//   23   40:iconst_1        
	//   24   41:isub            
	//   25   42:invokevirtual   #100 <Method String String.substring(int, int)>
	//   26   45:astore_2        
		return compile((new StringBuilder()).append(s).append(jsonpointer._asString).toString());
	//   27   46:new             #42  <Class StringBuilder>
	//   28   49:dup             
	//   29   50:invokespecial   #106 <Method void StringBuilder()>
	//   30   53:aload_2         
	//   31   54:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   32   57:aload_1         
	//   33   58:getfield        #32  <Field String _asString>
	//   34   61:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   35   64:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   36   67:invokestatic    #120 <Method JsonPointer compile(String)>
	//   37   70:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if(obj == this)
	//*   2    2:aload_1         
	//*   3    3:aload_0         
	//*   4    4:if_acmpne       11
		{
			flag = true;
	//    5    7:iconst_1        
	//    6    8:istore_2        
		} else
	//*   7    9:iload_2         
	//*   8   10:ireturn         
		{
			flag = flag1;
	//    9   11:iload_3         
	//   10   12:istore_2        
			if(obj != null)
	//*  11   13:aload_1         
	//*  12   14:ifnull          9
			{
				flag = flag1;
	//   13   17:iload_3         
	//   14   18:istore_2        
				if(obj instanceof JsonPointer)
	//*  15   19:aload_1         
	//*  16   20:instanceof      #2   <Class JsonPointer>
	//*  17   23:ifeq            9
					return _asString.equals(((Object) (((JsonPointer)obj)._asString)));
	//   18   26:aload_0         
	//   19   27:getfield        #32  <Field String _asString>
	//   20   30:aload_1         
	//   21   31:checkcast       #2   <Class JsonPointer>
	//   22   34:getfield        #32  <Field String _asString>
	//   23   37:invokevirtual   #141 <Method boolean String.equals(Object)>
	//   24   40:ireturn         
			}
		}
		return flag;
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
		JsonPointer jsonpointer1 = this;
	//    0    0:aload_0         
	//    1    1:astore_2        
		JsonPointer jsonpointer = jsonpointer1;
	//    2    2:aload_2         
	//    3    3:astore_1        
		if(jsonpointer1 == EMPTY)
	//*   4    4:aload_2         
	//*   5    5:getstatic       #20  <Field JsonPointer EMPTY>
	//*   6    8:if_acmpne       13
			return null;
	//    7   11:aconst_null     
	//    8   12:areturn         
		do
		{
			JsonPointer jsonpointer2 = jsonpointer._nextSegment;
	//    9   13:aload_1         
	//   10   14:getfield        #24  <Field JsonPointer _nextSegment>
	//   11   17:astore_2        
			if(jsonpointer2 != EMPTY)
	//*  12   18:aload_2         
	//*  13   19:getstatic       #20  <Field JsonPointer EMPTY>
	//*  14   22:if_acmpeq       30
				jsonpointer = jsonpointer2;
	//   15   25:aload_2         
	//   16   26:astore_1        
			else
	//*  17   27:goto            13
				return jsonpointer;
	//   18   30:aload_1         
	//   19   31:areturn         
		} while(true);
	}

	public JsonPointer matchElement(int i)
	{
		if(i != _matchingElementIndex || i < 0)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #30  <Field int _matchingElementIndex>
	//*   3    5:icmpne          12
	//*   4    8:iload_1         
	//*   5    9:ifge            14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return _nextSegment;
	//    8   14:aload_0         
	//    9   15:getfield        #24  <Field JsonPointer _nextSegment>
	//   10   18:areturn         
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
