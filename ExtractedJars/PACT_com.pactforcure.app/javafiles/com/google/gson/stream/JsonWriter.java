// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.stream;

import java.io.*;

public class JsonWriter
	implements Closeable, Flushable
{

	public JsonWriter(Writer writer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void Object()>
		stack = new int[32];
	//    2    4:aload_0         
	//    3    5:bipush          32
	//    4    7:newarray        int[]
	//    5    9:putfield        #81  <Field int[] stack>
		stackSize = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #83  <Field int stackSize>
		push(6);
	//    9   17:aload_0         
	//   10   18:bipush          6
	//   11   20:invokespecial   #87  <Method void push(int)>
		separator = ":";
	//   12   23:aload_0         
	//   13   24:ldc1            #89  <String ":">
	//   14   26:putfield        #91  <Field String separator>
		serializeNulls = true;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #93  <Field boolean serializeNulls>
		if(writer == null)
	//*  18   34:aload_1         
	//*  19   35:ifnonnull       48
		{
			throw new NullPointerException("out == null");
	//   20   38:new             #95  <Class NullPointerException>
	//   21   41:dup             
	//   22   42:ldc1            #97  <String "out == null">
	//   23   44:invokespecial   #100 <Method void NullPointerException(String)>
	//   24   47:athrow          
		} else
		{
			out = writer;
	//   25   48:aload_0         
	//   26   49:aload_1         
	//   27   50:putfield        #102 <Field Writer out>
			return;
	//   28   53:return          
		}
	}

	private void beforeName()
		throws IOException
	{
		int i = peek();
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method int peek()>
	//    2    4:istore_1        
		if(i == 5)
	//*   3    5:iload_1         
	//*   4    6:iconst_5        
	//*   5    7:icmpne          29
			out.write(44);
	//    6   10:aload_0         
	//    7   11:getfield        #102 <Field Writer out>
	//    8   14:bipush          44
	//    9   16:invokevirtual   #114 <Method void Writer.write(int)>
		else
	//*  10   19:aload_0         
	//*  11   20:invokespecial   #117 <Method void newline()>
	//*  12   23:aload_0         
	//*  13   24:iconst_4        
	//*  14   25:invokespecial   #120 <Method void replaceTop(int)>
	//*  15   28:return          
		if(i != 3)
	//*  16   29:iload_1         
	//*  17   30:iconst_3        
	//*  18   31:icmpeq          19
			throw new IllegalStateException("Nesting problem.");
	//   19   34:new             #122 <Class IllegalStateException>
	//   20   37:dup             
	//   21   38:ldc1            #124 <String "Nesting problem.">
	//   22   40:invokespecial   #125 <Method void IllegalStateException(String)>
	//   23   43:athrow          
		newline();
		replaceTop(4);
	}

	private void beforeValue(boolean flag)
		throws IOException
	{
		switch(peek())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #109 <Method int peek()>
		{
	//*   2    4:tableswitch     1 7: default 48
	//	               1 103
	//	               2 113
	//	               3 48
	//	               4 128
	//	               5 48
	//	               6 75
	//	               7 58
		case 3: // '\003'
		case 5: // '\005'
		default:
			throw new IllegalStateException("Nesting problem.");
	//    3   48:new             #122 <Class IllegalStateException>
	//    4   51:dup             
	//    5   52:ldc1            #124 <String "Nesting problem.">
	//    6   54:invokespecial   #125 <Method void IllegalStateException(String)>
	//    7   57:athrow          

		case 7: // '\007'
			if(!lenient)
	//*   8   58:aload_0         
	//*   9   59:getfield        #130 <Field boolean lenient>
	//*  10   62:ifne            75
				throw new IllegalStateException("JSON must have only one top-level value.");
	//   11   65:new             #122 <Class IllegalStateException>
	//   12   68:dup             
	//   13   69:ldc1            #132 <String "JSON must have only one top-level value.">
	//   14   71:invokespecial   #125 <Method void IllegalStateException(String)>
	//   15   74:athrow          
			// fall through

		case 6: // '\006'
			if(!lenient && !flag)
	//*  16   75:aload_0         
	//*  17   76:getfield        #130 <Field boolean lenient>
	//*  18   79:ifne            96
	//*  19   82:iload_1         
	//*  20   83:ifne            96
			{
				throw new IllegalStateException("JSON must start with an array or an object.");
	//   21   86:new             #122 <Class IllegalStateException>
	//   22   89:dup             
	//   23   90:ldc1            #134 <String "JSON must start with an array or an object.">
	//   24   92:invokespecial   #125 <Method void IllegalStateException(String)>
	//   25   95:athrow          
			} else
			{
				replaceTop(7);
	//   26   96:aload_0         
	//   27   97:bipush          7
	//   28   99:invokespecial   #120 <Method void replaceTop(int)>
				return;
	//   29  102:return          
			}

		case 1: // '\001'
			replaceTop(2);
	//   30  103:aload_0         
	//   31  104:iconst_2        
	//   32  105:invokespecial   #120 <Method void replaceTop(int)>
			newline();
	//   33  108:aload_0         
	//   34  109:invokespecial   #117 <Method void newline()>
			return;
	//   35  112:return          

		case 2: // '\002'
			out.append(',');
	//   36  113:aload_0         
	//   37  114:getfield        #102 <Field Writer out>
	//   38  117:bipush          44
	//   39  119:invokevirtual   #138 <Method Writer Writer.append(char)>
	//   40  122:pop             
			newline();
	//   41  123:aload_0         
	//   42  124:invokespecial   #117 <Method void newline()>
			return;
	//   43  127:return          

		case 4: // '\004'
			out.append(((CharSequence) (separator)));
	//   44  128:aload_0         
	//   45  129:getfield        #102 <Field Writer out>
	//   46  132:aload_0         
	//   47  133:getfield        #91  <Field String separator>
	//   48  136:invokevirtual   #141 <Method Writer Writer.append(CharSequence)>
	//   49  139:pop             
			replaceTop(5);
	//   50  140:aload_0         
	//   51  141:iconst_5        
	//   52  142:invokespecial   #120 <Method void replaceTop(int)>
			return;
	//   53  145:return          
		}
	}

	private JsonWriter close(int i, int j, String s)
		throws IOException
	{
		int k = peek();
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method int peek()>
	//    2    4:istore          4
		if(k != j && k != i)
	//*   3    6:iload           4
	//*   4    8:iload_2         
	//*   5    9:icmpeq          28
	//*   6   12:iload           4
	//*   7   14:iload_1         
	//*   8   15:icmpeq          28
			throw new IllegalStateException("Nesting problem.");
	//    9   18:new             #122 <Class IllegalStateException>
	//   10   21:dup             
	//   11   22:ldc1            #124 <String "Nesting problem.">
	//   12   24:invokespecial   #125 <Method void IllegalStateException(String)>
	//   13   27:athrow          
		if(deferredName != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #145 <Field String deferredName>
	//*  16   32:ifnull          65
			throw new IllegalStateException((new StringBuilder()).append("Dangling name: ").append(deferredName).toString());
	//   17   35:new             #122 <Class IllegalStateException>
	//   18   38:dup             
	//   19   39:new             #147 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #148 <Method void StringBuilder()>
	//   22   46:ldc1            #150 <String "Dangling name: ">
	//   23   48:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:aload_0         
	//   25   52:getfield        #145 <Field String deferredName>
	//   26   55:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   27   58:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   28   61:invokespecial   #125 <Method void IllegalStateException(String)>
	//   29   64:athrow          
		stackSize = stackSize - 1;
	//   30   65:aload_0         
	//   31   66:aload_0         
	//   32   67:getfield        #83  <Field int stackSize>
	//   33   70:iconst_1        
	//   34   71:isub            
	//   35   72:putfield        #83  <Field int stackSize>
		if(k == j)
	//*  36   75:iload           4
	//*  37   77:iload_2         
	//*  38   78:icmpne          85
			newline();
	//   39   81:aload_0         
	//   40   82:invokespecial   #117 <Method void newline()>
		out.write(s);
	//   41   85:aload_0         
	//   42   86:getfield        #102 <Field Writer out>
	//   43   89:aload_3         
	//   44   90:invokevirtual   #159 <Method void Writer.write(String)>
		return this;
	//   45   93:aload_0         
	//   46   94:areturn         
	}

	private void newline()
		throws IOException
	{
		if(indent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #161 <Field String indent>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
		{
			out.write("\n");
	//    4    8:aload_0         
	//    5    9:getfield        #102 <Field Writer out>
	//    6   12:ldc1            #163 <String "\n">
	//    7   14:invokevirtual   #159 <Method void Writer.write(String)>
			int i = 1;
	//    8   17:iconst_1        
	//    9   18:istore_1        
			int j = stackSize;
	//   10   19:aload_0         
	//   11   20:getfield        #83  <Field int stackSize>
	//   12   23:istore_2        
			while(i < j) 
	//*  13   24:iload_1         
	//*  14   25:iload_2         
	//*  15   26:icmpge          7
			{
				out.write(indent);
	//   16   29:aload_0         
	//   17   30:getfield        #102 <Field Writer out>
	//   18   33:aload_0         
	//   19   34:getfield        #161 <Field String indent>
	//   20   37:invokevirtual   #159 <Method void Writer.write(String)>
				i++;
	//   21   40:iload_1         
	//   22   41:iconst_1        
	//   23   42:iadd            
	//   24   43:istore_1        
			}
		}
	//*  25   44:goto            24
	}

	private JsonWriter open(int i, String s)
		throws IOException
	{
		beforeValue(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #167 <Method void beforeValue(boolean)>
		push(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #87  <Method void push(int)>
		out.write(s);
	//    6   10:aload_0         
	//    7   11:getfield        #102 <Field Writer out>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #159 <Method void Writer.write(String)>
		return this;
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	private int peek()
	{
		if(stackSize == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field int stackSize>
	//*   2    4:ifne            17
			throw new IllegalStateException("JsonWriter is closed.");
	//    3    7:new             #122 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #169 <String "JsonWriter is closed.">
	//    6   13:invokespecial   #125 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return stack[stackSize - 1];
	//    8   17:aload_0         
	//    9   18:getfield        #81  <Field int[] stack>
	//   10   21:aload_0         
	//   11   22:getfield        #83  <Field int stackSize>
	//   12   25:iconst_1        
	//   13   26:isub            
	//   14   27:iaload          
	//   15   28:ireturn         
	}

	private void push(int i)
	{
		if(stackSize == stack.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field int stackSize>
	//*   2    4:aload_0         
	//*   3    5:getfield        #81  <Field int[] stack>
	//*   4    8:arraylength     
	//*   5    9:icmpne          40
		{
			int ai[] = new int[stackSize * 2];
	//    6   12:aload_0         
	//    7   13:getfield        #83  <Field int stackSize>
	//    8   16:iconst_2        
	//    9   17:imul            
	//   10   18:newarray        int[]
	//   11   20:astore_3        
			System.arraycopy(((Object) (stack)), 0, ((Object) (ai)), 0, stackSize);
	//   12   21:aload_0         
	//   13   22:getfield        #81  <Field int[] stack>
	//   14   25:iconst_0        
	//   15   26:aload_3         
	//   16   27:iconst_0        
	//   17   28:aload_0         
	//   18   29:getfield        #83  <Field int stackSize>
	//   19   32:invokestatic    #175 <Method void System.arraycopy(Object, int, Object, int, int)>
			stack = ai;
	//   20   35:aload_0         
	//   21   36:aload_3         
	//   22   37:putfield        #81  <Field int[] stack>
		}
		int ai1[] = stack;
	//   23   40:aload_0         
	//   24   41:getfield        #81  <Field int[] stack>
	//   25   44:astore_3        
		int j = stackSize;
	//   26   45:aload_0         
	//   27   46:getfield        #83  <Field int stackSize>
	//   28   49:istore_2        
		stackSize = j + 1;
	//   29   50:aload_0         
	//   30   51:iload_2         
	//   31   52:iconst_1        
	//   32   53:iadd            
	//   33   54:putfield        #83  <Field int stackSize>
		ai1[j] = i;
	//   34   57:aload_3         
	//   35   58:iload_2         
	//   36   59:iload_1         
	//   37   60:iastore         
	//   38   61:return          
	}

	private void replaceTop(int i)
	{
		stack[stackSize - 1] = i;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int[] stack>
	//    2    4:aload_0         
	//    3    5:getfield        #83  <Field int stackSize>
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:iload_1         
	//    7   11:iastore         
	//    8   12:return          
	}

	private void string(String s)
		throws IOException
	{
		int i;
		int j;
		int k;
		int l;
		char c;
		String s1;
		String as[];
		String s2;
		if(htmlSafe)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field boolean htmlSafe>
	//*   2    4:ifeq            81
			as = HTML_SAFE_REPLACEMENT_CHARS;
	//    3    7:getstatic       #64  <Field String[] HTML_SAFE_REPLACEMENT_CHARS>
	//    4   10:astore          8
		else
	//*   5   12:aload_0         
	//*   6   13:getfield        #102 <Field Writer out>
	//*   7   16:ldc1            #180 <String "\"">
	//*   8   18:invokevirtual   #159 <Method void Writer.write(String)>
	//*   9   21:iconst_0        
	//*  10   22:istore_3        
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #183 <Method int String.length()>
	//*  13   27:istore          5
	//*  14   29:iconst_0        
	//*  15   30:istore_2        
	//*  16   31:iload_2         
	//*  17   32:iload           5
	//*  18   34:icmpge          153
	//*  19   37:aload_1         
	//*  20   38:iload_2         
	//*  21   39:invokevirtual   #187 <Method char String.charAt(int)>
	//*  22   42:istore          6
	//*  23   44:iload           6
	//*  24   46:sipush          128
	//*  25   49:icmpge          89
	//*  26   52:aload           8
	//*  27   54:iload           6
	//*  28   56:aaload          
	//*  29   57:astore          9
	//*  30   59:aload           9
	//*  31   61:astore          7
	//*  32   63:aload           9
	//*  33   65:ifnonnull       101
	//*  34   68:iload_3         
	//*  35   69:istore          4
	//*  36   71:iload_2         
	//*  37   72:iconst_1        
	//*  38   73:iadd            
	//*  39   74:istore_2        
	//*  40   75:iload           4
	//*  41   77:istore_3        
	//*  42   78:goto            31
			as = REPLACEMENT_CHARS;
	//   43   81:getstatic       #31  <Field String[] REPLACEMENT_CHARS>
	//   44   84:astore          8
		out.write("\"");
		j = 0;
		l = s.length();
		i = 0;
		if(i >= l)
			break MISSING_BLOCK_LABEL_153;
		c = s.charAt(i);
		if(c >= '\200') goto _L2; else goto _L1
_L1:
		s2 = as[c];
		s1 = s2;
		if(s2 != null) goto _L4; else goto _L3
_L3:
		k = j;
_L6:
		i++;
		j = k;
		break MISSING_BLOCK_LABEL_31;
	//*  45   86:goto            12
_L2:
		if(c != '\u2028')
			break; /* Loop/switch isn't completed */
	//   46   89:iload           6
	//   47   91:sipush          8232
	//   48   94:icmpne          135
		s1 = "\\u2028";
	//   49   97:ldc1            #189 <String "\\u2028">
	//   50   99:astore          7
_L4:
		if(j < i)
	//*  51  101:iload_3         
	//*  52  102:iload_2         
	//*  53  103:icmpge          118
			out.write(s, j, i - j);
	//   54  106:aload_0         
	//   55  107:getfield        #102 <Field Writer out>
	//   56  110:aload_1         
	//   57  111:iload_3         
	//   58  112:iload_2         
	//   59  113:iload_3         
	//   60  114:isub            
	//   61  115:invokevirtual   #192 <Method void Writer.write(String, int, int)>
		out.write(s1);
	//   62  118:aload_0         
	//   63  119:getfield        #102 <Field Writer out>
	//   64  122:aload           7
	//   65  124:invokevirtual   #159 <Method void Writer.write(String)>
		k = i + 1;
	//   66  127:iload_2         
	//   67  128:iconst_1        
	//   68  129:iadd            
	//   69  130:istore          4
		if(true) goto _L6; else goto _L5
	//   70  132:goto            71
_L5:
		k = j;
	//   71  135:iload_3         
	//   72  136:istore          4
		if(c != '\u2029') goto _L6; else goto _L7
	//   73  138:iload           6
	//   74  140:sipush          8233
	//   75  143:icmpne          71
_L7:
		s1 = "\\u2029";
	//   76  146:ldc1            #194 <String "\\u2029">
	//   77  148:astore          7
		  goto _L4
	//*  78  150:goto            101
		if(j < l)
	//*  79  153:iload_3         
	//*  80  154:iload           5
	//*  81  156:icmpge          172
			out.write(s, j, l - j);
	//   82  159:aload_0         
	//   83  160:getfield        #102 <Field Writer out>
	//   84  163:aload_1         
	//   85  164:iload_3         
	//   86  165:iload           5
	//   87  167:iload_3         
	//   88  168:isub            
	//   89  169:invokevirtual   #192 <Method void Writer.write(String, int, int)>
		out.write("\"");
	//   90  172:aload_0         
	//   91  173:getfield        #102 <Field Writer out>
	//   92  176:ldc1            #180 <String "\"">
	//   93  178:invokevirtual   #159 <Method void Writer.write(String)>
		return;
	//   94  181:return          
	}

	private void writeDeferredName()
		throws IOException
	{
		if(deferredName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field String deferredName>
	//*   2    4:ifnull          24
		{
			beforeName();
	//    3    7:aload_0         
	//    4    8:invokespecial   #197 <Method void beforeName()>
			string(deferredName);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #145 <Field String deferredName>
	//    8   16:invokespecial   #199 <Method void string(String)>
			deferredName = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #145 <Field String deferredName>
		}
	//   12   24:return          
	}

	public JsonWriter beginArray()
		throws IOException
	{
		writeDeferredName();
	//    0    0:aload_0         
	//    1    1:invokespecial   #203 <Method void writeDeferredName()>
		return open(1, "[");
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:ldc1            #205 <String "[">
	//    5    8:invokespecial   #207 <Method JsonWriter open(int, String)>
	//    6   11:areturn         
	}

	public JsonWriter beginObject()
		throws IOException
	{
		writeDeferredName();
	//    0    0:aload_0         
	//    1    1:invokespecial   #203 <Method void writeDeferredName()>
		return open(3, "{");
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:ldc1            #210 <String "{">
	//    5    8:invokespecial   #207 <Method JsonWriter open(int, String)>
	//    6   11:areturn         
	}

	public void close()
		throws IOException
	{
		out.close();
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Writer out>
	//    2    4:invokevirtual   #212 <Method void Writer.close()>
		int i = stackSize;
	//    3    7:aload_0         
	//    4    8:getfield        #83  <Field int stackSize>
	//    5   11:istore_1        
		if(i > 1 || i == 1 && stack[i - 1] != 7)
	//*   6   12:iload_1         
	//*   7   13:iconst_1        
	//*   8   14:icmpgt          35
	//*   9   17:iload_1         
	//*  10   18:iconst_1        
	//*  11   19:icmpne          45
	//*  12   22:aload_0         
	//*  13   23:getfield        #81  <Field int[] stack>
	//*  14   26:iload_1         
	//*  15   27:iconst_1        
	//*  16   28:isub            
	//*  17   29:iaload          
	//*  18   30:bipush          7
	//*  19   32:icmpeq          45
		{
			throw new IOException("Incomplete document");
	//   20   35:new             #105 <Class IOException>
	//   21   38:dup             
	//   22   39:ldc1            #214 <String "Incomplete document">
	//   23   41:invokespecial   #215 <Method void IOException(String)>
	//   24   44:athrow          
		} else
		{
			stackSize = 0;
	//   25   45:aload_0         
	//   26   46:iconst_0        
	//   27   47:putfield        #83  <Field int stackSize>
			return;
	//   28   50:return          
		}
	}

	public JsonWriter endArray()
		throws IOException
	{
		return close(1, 2, "]");
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_2        
	//    3    3:ldc1            #218 <String "]">
	//    4    5:invokespecial   #220 <Method JsonWriter close(int, int, String)>
	//    5    8:areturn         
	}

	public JsonWriter endObject()
		throws IOException
	{
		return close(3, 5, "}");
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:iconst_5        
	//    3    3:ldc1            #223 <String "}">
	//    4    5:invokespecial   #220 <Method JsonWriter close(int, int, String)>
	//    5    8:areturn         
	}

	public void flush()
		throws IOException
	{
		if(stackSize == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field int stackSize>
	//*   2    4:ifne            17
		{
			throw new IllegalStateException("JsonWriter is closed.");
	//    3    7:new             #122 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #169 <String "JsonWriter is closed.">
	//    6   13:invokespecial   #125 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		} else
		{
			out.flush();
	//    8   17:aload_0         
	//    9   18:getfield        #102 <Field Writer out>
	//   10   21:invokevirtual   #226 <Method void Writer.flush()>
			return;
	//   11   24:return          
		}
	}

	public final boolean getSerializeNulls()
	{
		return serializeNulls;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field boolean serializeNulls>
	//    2    4:ireturn         
	}

	public final boolean isHtmlSafe()
	{
		return htmlSafe;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field boolean htmlSafe>
	//    2    4:ireturn         
	}

	public boolean isLenient()
	{
		return lenient;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field boolean lenient>
	//    2    4:ireturn         
	}

	public JsonWriter jsonValue(String s)
		throws IOException
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
		{
			return nullValue();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #235 <Method JsonWriter nullValue()>
	//    4    8:areturn         
		} else
		{
			writeDeferredName();
	//    5    9:aload_0         
	//    6   10:invokespecial   #203 <Method void writeDeferredName()>
			beforeValue(false);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokespecial   #167 <Method void beforeValue(boolean)>
			out.append(((CharSequence) (s)));
	//   10   18:aload_0         
	//   11   19:getfield        #102 <Field Writer out>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #141 <Method Writer Writer.append(CharSequence)>
	//   14   26:pop             
			return this;
	//   15   27:aload_0         
	//   16   28:areturn         
		}
	}

	public JsonWriter name(String s)
		throws IOException
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("name == null");
	//    2    4:new             #95  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #238 <String "name == null">
	//    5   10:invokespecial   #100 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(deferredName != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #145 <Field String deferredName>
	//*   9   18:ifnull          29
			throw new IllegalStateException();
	//   10   21:new             #122 <Class IllegalStateException>
	//   11   24:dup             
	//   12   25:invokespecial   #239 <Method void IllegalStateException()>
	//   13   28:athrow          
		if(stackSize == 0)
	//*  14   29:aload_0         
	//*  15   30:getfield        #83  <Field int stackSize>
	//*  16   33:ifne            46
		{
			throw new IllegalStateException("JsonWriter is closed.");
	//   17   36:new             #122 <Class IllegalStateException>
	//   18   39:dup             
	//   19   40:ldc1            #169 <String "JsonWriter is closed.">
	//   20   42:invokespecial   #125 <Method void IllegalStateException(String)>
	//   21   45:athrow          
		} else
		{
			deferredName = s;
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:putfield        #145 <Field String deferredName>
			return this;
	//   25   51:aload_0         
	//   26   52:areturn         
		}
	}

	public JsonWriter nullValue()
		throws IOException
	{
label0:
		{
			if(deferredName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field String deferredName>
	//*   2    4:ifnull          18
			{
				if(!serializeNulls)
					break label0;
	//    3    7:aload_0         
	//    4    8:getfield        #93  <Field boolean serializeNulls>
	//    5   11:ifeq            34
				writeDeferredName();
	//    6   14:aload_0         
	//    7   15:invokespecial   #203 <Method void writeDeferredName()>
			}
			beforeValue(false);
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:invokespecial   #167 <Method void beforeValue(boolean)>
			out.write("null");
	//   11   23:aload_0         
	//   12   24:getfield        #102 <Field Writer out>
	//   13   27:ldc1            #241 <String "null">
	//   14   29:invokevirtual   #159 <Method void Writer.write(String)>
			return this;
	//   15   32:aload_0         
	//   16   33:areturn         
		}
		deferredName = null;
	//   17   34:aload_0         
	//   18   35:aconst_null     
	//   19   36:putfield        #145 <Field String deferredName>
		return this;
	//   20   39:aload_0         
	//   21   40:areturn         
	}

	public final void setHtmlSafe(boolean flag)
	{
		htmlSafe = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #178 <Field boolean htmlSafe>
	//    3    5:return          
	}

	public final void setIndent(String s)
	{
		if(s.length() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #183 <Method int String.length()>
	//*   2    4:ifne            19
		{
			indent = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #161 <Field String indent>
			separator = ":";
	//    6   12:aload_0         
	//    7   13:ldc1            #89  <String ":">
	//    8   15:putfield        #91  <Field String separator>
			return;
	//    9   18:return          
		} else
		{
			indent = s;
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:putfield        #161 <Field String indent>
			separator = ": ";
	//   13   24:aload_0         
	//   14   25:ldc1            #245 <String ": ">
	//   15   27:putfield        #91  <Field String separator>
			return;
	//   16   30:return          
		}
	}

	public final void setLenient(boolean flag)
	{
		lenient = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #130 <Field boolean lenient>
	//    3    5:return          
	}

	public final void setSerializeNulls(boolean flag)
	{
		serializeNulls = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #93  <Field boolean serializeNulls>
	//    3    5:return          
	}

	public JsonWriter value(double d)
		throws IOException
	{
		if(Double.isNaN(d) || Double.isInfinite(d))
	//*   0    0:dload_1         
	//*   1    1:invokestatic    #255 <Method boolean Double.isNaN(double)>
	//*   2    4:ifne            14
	//*   3    7:dload_1         
	//*   4    8:invokestatic    #258 <Method boolean Double.isInfinite(double)>
	//*   5   11:ifeq            42
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Numeric values must be finite, but was ").append(d).toString());
	//    6   14:new             #260 <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:new             #147 <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #148 <Method void StringBuilder()>
	//   11   25:ldc2            #262 <String "Numeric values must be finite, but was ">
	//   12   28:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:dload_1         
	//   14   32:invokevirtual   #265 <Method StringBuilder StringBuilder.append(double)>
	//   15   35:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #266 <Method void IllegalArgumentException(String)>
	//   17   41:athrow          
		} else
		{
			writeDeferredName();
	//   18   42:aload_0         
	//   19   43:invokespecial   #203 <Method void writeDeferredName()>
			beforeValue(false);
	//   20   46:aload_0         
	//   21   47:iconst_0        
	//   22   48:invokespecial   #167 <Method void beforeValue(boolean)>
			out.append(((CharSequence) (Double.toString(d))));
	//   23   51:aload_0         
	//   24   52:getfield        #102 <Field Writer out>
	//   25   55:dload_1         
	//   26   56:invokestatic    #269 <Method String Double.toString(double)>
	//   27   59:invokevirtual   #141 <Method Writer Writer.append(CharSequence)>
	//   28   62:pop             
			return this;
	//   29   63:aload_0         
	//   30   64:areturn         
		}
	}

	public JsonWriter value(long l)
		throws IOException
	{
		writeDeferredName();
	//    0    0:aload_0         
	//    1    1:invokespecial   #203 <Method void writeDeferredName()>
		beforeValue(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #167 <Method void beforeValue(boolean)>
		out.write(Long.toString(l));
	//    5    9:aload_0         
	//    6   10:getfield        #102 <Field Writer out>
	//    7   13:lload_1         
	//    8   14:invokestatic    #275 <Method String Long.toString(long)>
	//    9   17:invokevirtual   #159 <Method void Writer.write(String)>
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public JsonWriter value(Number number)
		throws IOException
	{
		if(number == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return nullValue();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #235 <Method JsonWriter nullValue()>
	//    4    8:areturn         
		writeDeferredName();
	//    5    9:aload_0         
	//    6   10:invokespecial   #203 <Method void writeDeferredName()>
		String s = ((Object) (number)).toString();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #277 <Method String Object.toString()>
	//    9   17:astore_2        
		if(!lenient && (s.equals("-Infinity") || s.equals("Infinity") || s.equals("NaN")))
	//*  10   18:aload_0         
	//*  11   19:getfield        #130 <Field boolean lenient>
	//*  12   22:ifne            83
	//*  13   25:aload_2         
	//*  14   26:ldc2            #279 <String "-Infinity">
	//*  15   29:invokevirtual   #283 <Method boolean String.equals(Object)>
	//*  16   32:ifne            55
	//*  17   35:aload_2         
	//*  18   36:ldc2            #285 <String "Infinity">
	//*  19   39:invokevirtual   #283 <Method boolean String.equals(Object)>
	//*  20   42:ifne            55
	//*  21   45:aload_2         
	//*  22   46:ldc2            #287 <String "NaN">
	//*  23   49:invokevirtual   #283 <Method boolean String.equals(Object)>
	//*  24   52:ifeq            83
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Numeric values must be finite, but was ").append(((Object) (number))).toString());
	//   25   55:new             #260 <Class IllegalArgumentException>
	//   26   58:dup             
	//   27   59:new             #147 <Class StringBuilder>
	//   28   62:dup             
	//   29   63:invokespecial   #148 <Method void StringBuilder()>
	//   30   66:ldc2            #262 <String "Numeric values must be finite, but was ">
	//   31   69:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   32   72:aload_1         
	//   33   73:invokevirtual   #290 <Method StringBuilder StringBuilder.append(Object)>
	//   34   76:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   35   79:invokespecial   #266 <Method void IllegalArgumentException(String)>
	//   36   82:athrow          
		} else
		{
			beforeValue(false);
	//   37   83:aload_0         
	//   38   84:iconst_0        
	//   39   85:invokespecial   #167 <Method void beforeValue(boolean)>
			out.append(((CharSequence) (s)));
	//   40   88:aload_0         
	//   41   89:getfield        #102 <Field Writer out>
	//   42   92:aload_2         
	//   43   93:invokevirtual   #141 <Method Writer Writer.append(CharSequence)>
	//   44   96:pop             
			return this;
	//   45   97:aload_0         
	//   46   98:areturn         
		}
	}

	public JsonWriter value(String s)
		throws IOException
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
		{
			return nullValue();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #235 <Method JsonWriter nullValue()>
	//    4    8:areturn         
		} else
		{
			writeDeferredName();
	//    5    9:aload_0         
	//    6   10:invokespecial   #203 <Method void writeDeferredName()>
			beforeValue(false);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokespecial   #167 <Method void beforeValue(boolean)>
			string(s);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokespecial   #199 <Method void string(String)>
			return this;
	//   13   23:aload_0         
	//   14   24:areturn         
		}
	}

	public JsonWriter value(boolean flag)
		throws IOException
	{
		writeDeferredName();
	//    0    0:aload_0         
	//    1    1:invokespecial   #203 <Method void writeDeferredName()>
		beforeValue(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #167 <Method void beforeValue(boolean)>
		Writer writer = out;
	//    5    9:aload_0         
	//    6   10:getfield        #102 <Field Writer out>
	//    7   13:astore_3        
		String s;
		if(flag)
	//*   8   14:iload_1         
	//*   9   15:ifeq            29
			s = "true";
	//   10   18:ldc2            #293 <String "true">
	//   11   21:astore_2        
		else
	//*  12   22:aload_3         
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #159 <Method void Writer.write(String)>
	//*  15   27:aload_0         
	//*  16   28:areturn         
			s = "false";
	//   17   29:ldc2            #295 <String "false">
	//   18   32:astore_2        
		writer.write(s);
		return this;
	//*  19   33:goto            22
	}

	private static final String HTML_SAFE_REPLACEMENT_CHARS[];
	private static final String REPLACEMENT_CHARS[];
	private String deferredName;
	private boolean htmlSafe;
	private String indent;
	private boolean lenient;
	private final Writer out;
	private String separator;
	private boolean serializeNulls;
	private int stack[];
	private int stackSize;

	static 
	{
		REPLACEMENT_CHARS = new String[128];
	//    0    0:sipush          128
	//    1    3:anewarray       String[]
	//    2    6:putstatic       #31  <Field String[] REPLACEMENT_CHARS>
		for(int i = 0; i <= 31; i++)
	//*   3    9:iconst_0        
	//*   4   10:istore_0        
	//*   5   11:iload_0         
	//*   6   12:bipush          31
	//*   7   14:icmpgt          45
			REPLACEMENT_CHARS[i] = String.format("\\u%04x", new Object[] {
				Integer.valueOf(i)
			});
	//    8   17:getstatic       #31  <Field String[] REPLACEMENT_CHARS>
	//    9   20:iload_0         
	//   10   21:ldc1            #33  <String "\\u%04x">
	//   11   23:iconst_1        
	//   12   24:anewarray       Object[]
	//   13   27:dup             
	//   14   28:iconst_0        
	//   15   29:iload_0         
	//   16   30:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   17   33:aastore         
	//   18   34:invokestatic    #43  <Method String String.format(String, Object[])>
	//   19   37:aastore         

	//   20   38:iload_0         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_0        
	//*  24   42:goto            11
		REPLACEMENT_CHARS[34] = "\\\"";
	//   25   45:getstatic       #31  <Field String[] REPLACEMENT_CHARS>
	//   26   48:bipush          34
	//   27   50:ldc1            #45  <String "\\\"">
	//   28   52:aastore         
		REPLACEMENT_CHARS[92] = "\\\\";
	//   29   53:getstatic       #31  <Field String[] REPLACEMENT_CHARS>
	//   30   56:bipush          92
	//   31   58:ldc1            #47  <String "\\\\">
	//   32   60:aastore         
		REPLACEMENT_CHARS[9] = "\\t";
	//   33   61:getstatic       #31  <Field String[] REPLACEMENT_CHARS>
	//   34   64:bipush          9
	//   35   66:ldc1            #49  <String "\\t">
	//   36   68:aastore         
		REPLACEMENT_CHARS[8] = "\\b";
	//   37   69:getstatic       #31  <Field String[] REPLACEMENT_CHARS>
	//   38   72:bipush          8
	//   39   74:ldc1            #51  <String "\\b">
	//   40   76:aastore         
		REPLACEMENT_CHARS[10] = "\\n";
	//   41   77:getstatic       #31  <Field String[] REPLACEMENT_CHARS>
	//   42   80:bipush          10
	//   43   82:ldc1            #53  <String "\\n">
	//   44   84:aastore         
		REPLACEMENT_CHARS[13] = "\\r";
	//   45   85:getstatic       #31  <Field String[] REPLACEMENT_CHARS>
	//   46   88:bipush          13
	//   47   90:ldc1            #55  <String "\\r">
	//   48   92:aastore         
		REPLACEMENT_CHARS[12] = "\\f";
	//   49   93:getstatic       #31  <Field String[] REPLACEMENT_CHARS>
	//   50   96:bipush          12
	//   51   98:ldc1            #57  <String "\\f">
	//   52  100:aastore         
		HTML_SAFE_REPLACEMENT_CHARS = (String[])((String []) (REPLACEMENT_CHARS)).clone();
	//   53  101:getstatic       #31  <Field String[] REPLACEMENT_CHARS>
	//   54  104:invokevirtual   #62  <Method Object _5B_Ljava.lang.String_3B_.clone()>
	//   55  107:checkcast       #58  <Class String[]>
	//   56  110:putstatic       #64  <Field String[] HTML_SAFE_REPLACEMENT_CHARS>
		HTML_SAFE_REPLACEMENT_CHARS[60] = "\\u003c";
	//   57  113:getstatic       #64  <Field String[] HTML_SAFE_REPLACEMENT_CHARS>
	//   58  116:bipush          60
	//   59  118:ldc1            #66  <String "\\u003c">
	//   60  120:aastore         
		HTML_SAFE_REPLACEMENT_CHARS[62] = "\\u003e";
	//   61  121:getstatic       #64  <Field String[] HTML_SAFE_REPLACEMENT_CHARS>
	//   62  124:bipush          62
	//   63  126:ldc1            #68  <String "\\u003e">
	//   64  128:aastore         
		HTML_SAFE_REPLACEMENT_CHARS[38] = "\\u0026";
	//   65  129:getstatic       #64  <Field String[] HTML_SAFE_REPLACEMENT_CHARS>
	//   66  132:bipush          38
	//   67  134:ldc1            #70  <String "\\u0026">
	//   68  136:aastore         
		HTML_SAFE_REPLACEMENT_CHARS[61] = "\\u003d";
	//   69  137:getstatic       #64  <Field String[] HTML_SAFE_REPLACEMENT_CHARS>
	//   70  140:bipush          61
	//   71  142:ldc1            #72  <String "\\u003d">
	//   72  144:aastore         
		HTML_SAFE_REPLACEMENT_CHARS[39] = "\\u0027";
	//   73  145:getstatic       #64  <Field String[] HTML_SAFE_REPLACEMENT_CHARS>
	//   74  148:bipush          39
	//   75  150:ldc1            #74  <String "\\u0027">
	//   76  152:aastore         
	//*  77  153:return          
	}
}
