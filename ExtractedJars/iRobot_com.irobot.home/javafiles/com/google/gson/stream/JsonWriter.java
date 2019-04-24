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
	{
		int i = peek();
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method int peek()>
	//    2    4:istore_1        
		if(i == 5)
	//*   3    5:iload_1         
	//*   4    6:iconst_5        
	//*   5    7:icmpne          22
			out.write(44);
	//    6   10:aload_0         
	//    7   11:getfield        #102 <Field Writer out>
	//    8   14:bipush          44
	//    9   16:invokevirtual   #112 <Method void Writer.write(int)>
		else
	//*  10   19:goto            37
		if(i != 3)
	//*  11   22:iload_1         
	//*  12   23:iconst_3        
	//*  13   24:icmpeq          37
			throw new IllegalStateException("Nesting problem.");
	//   14   27:new             #114 <Class IllegalStateException>
	//   15   30:dup             
	//   16   31:ldc1            #116 <String "Nesting problem.">
	//   17   33:invokespecial   #117 <Method void IllegalStateException(String)>
	//   18   36:athrow          
		newline();
	//   19   37:aload_0         
	//   20   38:invokespecial   #120 <Method void newline()>
		replaceTop(4);
	//   21   41:aload_0         
	//   22   42:iconst_4        
	//   23   43:invokespecial   #123 <Method void replaceTop(int)>
	//   24   46:return          
	}

	private void beforeValue(boolean flag)
	{
		peek();
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method int peek()>
		JVM INSTR tableswitch 1 7: default 48
	//	               1 135
	//	               2 122
	//	               3 48
	//	               4 102
	//	               5 48
	//	               6 75
	//	               7 58;
	//    2    4:tableswitch     1 7: default 48
	//	               1 135
	//	               2 122
	//	               3 48
	//	               4 102
	//	               5 48
	//	               6 75
	//	               7 58
		   goto _L1 _L2 _L3 _L1 _L4 _L1 _L5 _L6
_L1:
		throw new IllegalStateException("Nesting problem.");
	//    3   48:new             #114 <Class IllegalStateException>
	//    4   51:dup             
	//    5   52:ldc1            #116 <String "Nesting problem.">
	//    6   54:invokespecial   #117 <Method void IllegalStateException(String)>
	//    7   57:athrow          
_L6:
		if(!lenient)
	//*   8   58:aload_0         
	//*   9   59:getfield        #127 <Field boolean lenient>
	//*  10   62:ifne            75
			throw new IllegalStateException("JSON must have only one top-level value.");
	//   11   65:new             #114 <Class IllegalStateException>
	//   12   68:dup             
	//   13   69:ldc1            #129 <String "JSON must have only one top-level value.">
	//   14   71:invokespecial   #117 <Method void IllegalStateException(String)>
	//   15   74:athrow          
_L5:
		byte byte0;
		if(!lenient && !flag)
	//*  16   75:aload_0         
	//*  17   76:getfield        #127 <Field boolean lenient>
	//*  18   79:ifne            96
	//*  19   82:iload_1         
	//*  20   83:ifne            96
			throw new IllegalStateException("JSON must start with an array or an object.");
	//   21   86:new             #114 <Class IllegalStateException>
	//   22   89:dup             
	//   23   90:ldc1            #131 <String "JSON must start with an array or an object.">
	//   24   92:invokespecial   #117 <Method void IllegalStateException(String)>
	//   25   95:athrow          
		byte0 = 7;
	//   26   96:bipush          7
	//   27   98:istore_2        
		  goto _L7
	//*  28   99:goto            116
_L4:
		out.append(((CharSequence) (separator)));
	//   29  102:aload_0         
	//   30  103:getfield        #102 <Field Writer out>
	//   31  106:aload_0         
	//   32  107:getfield        #91  <Field String separator>
	//   33  110:invokevirtual   #135 <Method Writer Writer.append(CharSequence)>
	//   34  113:pop             
		byte0 = 5;
	//   35  114:iconst_5        
	//   36  115:istore_2        
_L7:
		replaceTop(((int) (byte0)));
	//   37  116:aload_0         
	//   38  117:iload_2         
	//   39  118:invokespecial   #123 <Method void replaceTop(int)>
		return;
	//   40  121:return          
_L3:
		out.append(',');
	//   41  122:aload_0         
	//   42  123:getfield        #102 <Field Writer out>
	//   43  126:bipush          44
	//   44  128:invokevirtual   #138 <Method Writer Writer.append(char)>
	//   45  131:pop             
		break; /* Loop/switch isn't completed */
	//   46  132:goto            140
_L2:
		replaceTop(2);
	//   47  135:aload_0         
	//   48  136:iconst_2        
	//   49  137:invokespecial   #123 <Method void replaceTop(int)>
		newline();
	//   50  140:aload_0         
	//   51  141:invokespecial   #120 <Method void newline()>
		return;
	//   52  144:return          
	}

	private JsonWriter close(int i, int j, String s)
	{
		int k = peek();
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method int peek()>
	//    2    4:istore          4
		if(k != j && k != i)
	//*   3    6:iload           4
	//*   4    8:iload_2         
	//*   5    9:icmpeq          28
	//*   6   12:iload           4
	//*   7   14:iload_1         
	//*   8   15:icmpeq          28
			throw new IllegalStateException("Nesting problem.");
	//    9   18:new             #114 <Class IllegalStateException>
	//   10   21:dup             
	//   11   22:ldc1            #116 <String "Nesting problem.">
	//   12   24:invokespecial   #117 <Method void IllegalStateException(String)>
	//   13   27:athrow          
		if(deferredName != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #142 <Field String deferredName>
	//*  16   32:ifnull          71
		{
			s = ((String) (new StringBuilder()));
	//   17   35:new             #144 <Class StringBuilder>
	//   18   38:dup             
	//   19   39:invokespecial   #145 <Method void StringBuilder()>
	//   20   42:astore_3        
			((StringBuilder) (s)).append("Dangling name: ");
	//   21   43:aload_3         
	//   22   44:ldc1            #147 <String "Dangling name: ">
	//   23   46:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
			((StringBuilder) (s)).append(deferredName);
	//   25   50:aload_3         
	//   26   51:aload_0         
	//   27   52:getfield        #142 <Field String deferredName>
	//   28   55:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
			throw new IllegalStateException(((StringBuilder) (s)).toString());
	//   30   59:new             #114 <Class IllegalStateException>
	//   31   62:dup             
	//   32   63:aload_3         
	//   33   64:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   34   67:invokespecial   #117 <Method void IllegalStateException(String)>
	//   35   70:athrow          
		}
		stackSize = stackSize - 1;
	//   36   71:aload_0         
	//   37   72:aload_0         
	//   38   73:getfield        #83  <Field int stackSize>
	//   39   76:iconst_1        
	//   40   77:isub            
	//   41   78:putfield        #83  <Field int stackSize>
		if(k == j)
	//*  42   81:iload           4
	//*  43   83:iload_2         
	//*  44   84:icmpne          91
			newline();
	//   45   87:aload_0         
	//   46   88:invokespecial   #120 <Method void newline()>
		out.write(s);
	//   47   91:aload_0         
	//   48   92:getfield        #102 <Field Writer out>
	//   49   95:aload_3         
	//   50   96:invokevirtual   #156 <Method void Writer.write(String)>
		return this;
	//   51   99:aload_0         
	//   52  100:areturn         
	}

	private void newline()
	{
		if(indent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field String indent>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		out.write("\n");
	//    4    8:aload_0         
	//    5    9:getfield        #102 <Field Writer out>
	//    6   12:ldc1            #160 <String "\n">
	//    7   14:invokevirtual   #156 <Method void Writer.write(String)>
		int j = stackSize;
	//    8   17:aload_0         
	//    9   18:getfield        #83  <Field int stackSize>
	//   10   21:istore_2        
		for(int i = 1; i < j; i++)
	//*  11   22:iconst_1        
	//*  12   23:istore_1        
	//*  13   24:iload_1         
	//*  14   25:iload_2         
	//*  15   26:icmpge          47
			out.write(indent);
	//   16   29:aload_0         
	//   17   30:getfield        #102 <Field Writer out>
	//   18   33:aload_0         
	//   19   34:getfield        #158 <Field String indent>
	//   20   37:invokevirtual   #156 <Method void Writer.write(String)>

	//   21   40:iload_1         
	//   22   41:iconst_1        
	//   23   42:iadd            
	//   24   43:istore_1        
	//*  25   44:goto            24
	//   26   47:return          
	}

	private JsonWriter open(int i, String s)
	{
		beforeValue(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #164 <Method void beforeValue(boolean)>
		push(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #87  <Method void push(int)>
		out.write(s);
	//    6   10:aload_0         
	//    7   11:getfield        #102 <Field Writer out>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #156 <Method void Writer.write(String)>
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
	//    3    7:new             #114 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #166 <String "JsonWriter is closed.">
	//    6   13:invokespecial   #117 <Method void IllegalStateException(String)>
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
	//   19   32:invokestatic    #172 <Method void System.arraycopy(Object, int, Object, int, int)>
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
	{
		String as[];
		if(htmlSafe)
	//*   0    0:aload_0         
	//*   1    1:getfield        #175 <Field boolean htmlSafe>
	//*   2    4:ifeq            15
			as = HTML_SAFE_REPLACEMENT_CHARS;
	//    3    7:getstatic       #64  <Field String[] HTML_SAFE_REPLACEMENT_CHARS>
	//    4   10:astore          8
		else
	//*   5   12:goto            20
			as = REPLACEMENT_CHARS;
	//    6   15:getstatic       #31  <Field String[] REPLACEMENT_CHARS>
	//    7   18:astore          8
		out.write("\"");
	//    8   20:aload_0         
	//    9   21:getfield        #102 <Field Writer out>
	//   10   24:ldc1            #177 <String "\"">
	//   11   26:invokevirtual   #156 <Method void Writer.write(String)>
		int l = s.length();
	//   12   29:aload_1         
	//   13   30:invokevirtual   #180 <Method int String.length()>
	//   14   33:istore          5
		int i = 0;
	//   15   35:iconst_0        
	//   16   36:istore_2        
		int j;
		int k;
		for(j = 0; i < l; j = k)
	//*  17   37:iconst_0        
	//*  18   38:istore_3        
	//*  19   39:iload_2         
	//*  20   40:iload           5
	//*  21   42:icmpge          153
		{
label0:
			{
				char c = s.charAt(i);
	//   22   45:aload_1         
	//   23   46:iload_2         
	//   24   47:invokevirtual   #184 <Method char String.charAt(int)>
	//   25   50:istore          6
				String s1;
				if(c < '\200')
	//*  26   52:iload           6
	//*  27   54:sipush          128
	//*  28   57:icmpge          82
				{
					String s2 = as[c];
	//   29   60:aload           8
	//   30   62:iload           6
	//   31   64:aaload          
	//   32   65:astore          9
					s1 = s2;
	//   33   67:aload           9
	//   34   69:astore          7
					if(s2 == null)
	//*  35   71:aload           9
	//*  36   73:ifnonnull       112
					{
						k = j;
	//   37   76:iload_3         
	//   38   77:istore          4
						break label0;
	//   39   79:goto            143
					}
				} else
				if(c == '\u2028')
	//*  40   82:iload           6
	//*  41   84:sipush          8232
	//*  42   87:icmpne          97
				{
					s1 = "\\u2028";
	//   43   90:ldc1            #186 <String "\\u2028">
	//   44   92:astore          7
				} else
	//*  45   94:goto            112
				{
					k = j;
	//   46   97:iload_3         
	//   47   98:istore          4
					if(c != '\u2029')
						break label0;
	//   48  100:iload           6
	//   49  102:sipush          8233
	//   50  105:icmpne          143
					s1 = "\\u2029";
	//   51  108:ldc1            #188 <String "\\u2029">
	//   52  110:astore          7
				}
				if(j < i)
	//*  53  112:iload_3         
	//*  54  113:iload_2         
	//*  55  114:icmpge          129
					out.write(s, j, i - j);
	//   56  117:aload_0         
	//   57  118:getfield        #102 <Field Writer out>
	//   58  121:aload_1         
	//   59  122:iload_3         
	//   60  123:iload_2         
	//   61  124:iload_3         
	//   62  125:isub            
	//   63  126:invokevirtual   #191 <Method void Writer.write(String, int, int)>
				out.write(s1);
	//   64  129:aload_0         
	//   65  130:getfield        #102 <Field Writer out>
	//   66  133:aload           7
	//   67  135:invokevirtual   #156 <Method void Writer.write(String)>
				k = i + 1;
	//   68  138:iload_2         
	//   69  139:iconst_1        
	//   70  140:iadd            
	//   71  141:istore          4
			}
			i++;
	//   72  143:iload_2         
	//   73  144:iconst_1        
	//   74  145:iadd            
	//   75  146:istore_2        
		}

	//   76  147:iload           4
	//   77  149:istore_3        
	//*  78  150:goto            39
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
	//   89  169:invokevirtual   #191 <Method void Writer.write(String, int, int)>
		out.write("\"");
	//   90  172:aload_0         
	//   91  173:getfield        #102 <Field Writer out>
	//   92  176:ldc1            #177 <String "\"">
	//   93  178:invokevirtual   #156 <Method void Writer.write(String)>
	//   94  181:return          
	}

	private void writeDeferredName()
	{
		if(deferredName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #142 <Field String deferredName>
	//*   2    4:ifnull          24
		{
			beforeName();
	//    3    7:aload_0         
	//    4    8:invokespecial   #194 <Method void beforeName()>
			string(deferredName);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #142 <Field String deferredName>
	//    8   16:invokespecial   #196 <Method void string(String)>
			deferredName = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #142 <Field String deferredName>
		}
	//   12   24:return          
	}

	public JsonWriter beginArray()
	{
		writeDeferredName();
	//    0    0:aload_0         
	//    1    1:invokespecial   #200 <Method void writeDeferredName()>
		return open(1, "[");
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:ldc1            #202 <String "[">
	//    5    8:invokespecial   #204 <Method JsonWriter open(int, String)>
	//    6   11:areturn         
	}

	public JsonWriter beginObject()
	{
		writeDeferredName();
	//    0    0:aload_0         
	//    1    1:invokespecial   #200 <Method void writeDeferredName()>
		return open(3, "{");
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:ldc1            #207 <String "{">
	//    5    8:invokespecial   #204 <Method JsonWriter open(int, String)>
	//    6   11:areturn         
	}

	public void close()
	{
		out.close();
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Writer out>
	//    2    4:invokevirtual   #209 <Method void Writer.close()>
		int i = stackSize;
	//    3    7:aload_0         
	//    4    8:getfield        #83  <Field int stackSize>
	//    5   11:istore_1        
		if(i <= 1 && (i != 1 || stack[i - 1] == 7))
	//*   6   12:iload_1         
	//*   7   13:iconst_1        
	//*   8   14:icmpgt          44
	//*   9   17:iload_1         
	//*  10   18:iconst_1        
	//*  11   19:icmpne          38
	//*  12   22:aload_0         
	//*  13   23:getfield        #81  <Field int[] stack>
	//*  14   26:iload_1         
	//*  15   27:iconst_1        
	//*  16   28:isub            
	//*  17   29:iaload          
	//*  18   30:bipush          7
	//*  19   32:icmpeq          38
	//*  20   35:goto            44
		{
			stackSize = 0;
	//   21   38:aload_0         
	//   22   39:iconst_0        
	//   23   40:putfield        #83  <Field int stackSize>
			return;
	//   24   43:return          
		} else
		{
			throw new IOException("Incomplete document");
	//   25   44:new             #211 <Class IOException>
	//   26   47:dup             
	//   27   48:ldc1            #213 <String "Incomplete document">
	//   28   50:invokespecial   #214 <Method void IOException(String)>
	//   29   53:athrow          
		}
	}

	public JsonWriter endArray()
	{
		return close(1, 2, "]");
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_2        
	//    3    3:ldc1            #217 <String "]">
	//    4    5:invokespecial   #219 <Method JsonWriter close(int, int, String)>
	//    5    8:areturn         
	}

	public JsonWriter endObject()
	{
		return close(3, 5, "}");
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:iconst_5        
	//    3    3:ldc1            #222 <String "}">
	//    4    5:invokespecial   #219 <Method JsonWriter close(int, int, String)>
	//    5    8:areturn         
	}

	public void flush()
	{
		if(stackSize == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field int stackSize>
	//*   2    4:ifne            17
		{
			throw new IllegalStateException("JsonWriter is closed.");
	//    3    7:new             #114 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #166 <String "JsonWriter is closed.">
	//    6   13:invokespecial   #117 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		} else
		{
			out.flush();
	//    8   17:aload_0         
	//    9   18:getfield        #102 <Field Writer out>
	//   10   21:invokevirtual   #225 <Method void Writer.flush()>
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
	//    1    1:getfield        #175 <Field boolean htmlSafe>
	//    2    4:ireturn         
	}

	public boolean isLenient()
	{
		return lenient;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field boolean lenient>
	//    2    4:ireturn         
	}

	public JsonWriter name(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("name == null");
	//    2    4:new             #95  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #233 <String "name == null">
	//    5   10:invokespecial   #100 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(deferredName != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #142 <Field String deferredName>
	//*   9   18:ifnull          29
			throw new IllegalStateException();
	//   10   21:new             #114 <Class IllegalStateException>
	//   11   24:dup             
	//   12   25:invokespecial   #234 <Method void IllegalStateException()>
	//   13   28:athrow          
		if(stackSize == 0)
	//*  14   29:aload_0         
	//*  15   30:getfield        #83  <Field int stackSize>
	//*  16   33:ifne            46
		{
			throw new IllegalStateException("JsonWriter is closed.");
	//   17   36:new             #114 <Class IllegalStateException>
	//   18   39:dup             
	//   19   40:ldc1            #166 <String "JsonWriter is closed.">
	//   20   42:invokespecial   #117 <Method void IllegalStateException(String)>
	//   21   45:athrow          
		} else
		{
			deferredName = s;
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:putfield        #142 <Field String deferredName>
			return this;
	//   25   51:aload_0         
	//   26   52:areturn         
		}
	}

	public JsonWriter nullValue()
	{
		if(deferredName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #142 <Field String deferredName>
	//*   2    4:ifnull          28
			if(serializeNulls)
	//*   3    7:aload_0         
	//*   4    8:getfield        #93  <Field boolean serializeNulls>
	//*   5   11:ifeq            21
			{
				writeDeferredName();
	//    6   14:aload_0         
	//    7   15:invokespecial   #200 <Method void writeDeferredName()>
			} else
	//*   8   18:goto            28
			{
				deferredName = null;
	//    9   21:aload_0         
	//   10   22:aconst_null     
	//   11   23:putfield        #142 <Field String deferredName>
				return this;
	//   12   26:aload_0         
	//   13   27:areturn         
			}
		beforeValue(false);
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:invokespecial   #164 <Method void beforeValue(boolean)>
		out.write("null");
	//   17   33:aload_0         
	//   18   34:getfield        #102 <Field Writer out>
	//   19   37:ldc1            #237 <String "null">
	//   20   39:invokevirtual   #156 <Method void Writer.write(String)>
		return this;
	//   21   42:aload_0         
	//   22   43:areturn         
	}

	public final void setHtmlSafe(boolean flag)
	{
		htmlSafe = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #175 <Field boolean htmlSafe>
	//    3    5:return          
	}

	public final void setIndent(String s)
	{
		if(s.length() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #180 <Method int String.length()>
	//*   2    4:ifne            21
		{
			indent = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #158 <Field String indent>
			s = ":";
	//    6   12:ldc1            #89  <String ":">
	//    7   14:astore_1        
		} else
	//*   8   15:aload_0         
	//*   9   16:aload_1         
	//*  10   17:putfield        #91  <Field String separator>
	//*  11   20:return          
		{
			indent = s;
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:putfield        #158 <Field String indent>
			s = ": ";
	//   15   26:ldc1            #241 <String ": ">
	//   16   28:astore_1        
		}
		separator = s;
	//*  17   29:goto            15
	}

	public final void setLenient(boolean flag)
	{
		lenient = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #127 <Field boolean lenient>
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
	{
		if(!Double.isNaN(d) && !Double.isInfinite(d))
	//*   0    0:dload_1         
	//*   1    1:invokestatic    #251 <Method boolean Double.isNaN(double)>
	//*   2    4:ifne            40
	//*   3    7:dload_1         
	//*   4    8:invokestatic    #254 <Method boolean Double.isInfinite(double)>
	//*   5   11:ifeq            17
	//*   6   14:goto            40
		{
			writeDeferredName();
	//    7   17:aload_0         
	//    8   18:invokespecial   #200 <Method void writeDeferredName()>
			beforeValue(false);
	//    9   21:aload_0         
	//   10   22:iconst_0        
	//   11   23:invokespecial   #164 <Method void beforeValue(boolean)>
			out.append(((CharSequence) (Double.toString(d))));
	//   12   26:aload_0         
	//   13   27:getfield        #102 <Field Writer out>
	//   14   30:dload_1         
	//   15   31:invokestatic    #257 <Method String Double.toString(double)>
	//   16   34:invokevirtual   #135 <Method Writer Writer.append(CharSequence)>
	//   17   37:pop             
			return this;
	//   18   38:aload_0         
	//   19   39:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   20   40:new             #144 <Class StringBuilder>
	//   21   43:dup             
	//   22   44:invokespecial   #145 <Method void StringBuilder()>
	//   23   47:astore_3        
			stringbuilder.append("Numeric values must be finite, but was ");
	//   24   48:aload_3         
	//   25   49:ldc2            #259 <String "Numeric values must be finite, but was ">
	//   26   52:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
			stringbuilder.append(d);
	//   28   56:aload_3         
	//   29   57:dload_1         
	//   30   58:invokevirtual   #262 <Method StringBuilder StringBuilder.append(double)>
	//   31   61:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   32   62:new             #264 <Class IllegalArgumentException>
	//   33   65:dup             
	//   34   66:aload_3         
	//   35   67:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   36   70:invokespecial   #265 <Method void IllegalArgumentException(String)>
	//   37   73:athrow          
		}
	}

	public JsonWriter value(long l)
	{
		writeDeferredName();
	//    0    0:aload_0         
	//    1    1:invokespecial   #200 <Method void writeDeferredName()>
		beforeValue(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #164 <Method void beforeValue(boolean)>
		out.write(Long.toString(l));
	//    5    9:aload_0         
	//    6   10:getfield        #102 <Field Writer out>
	//    7   13:lload_1         
	//    8   14:invokestatic    #271 <Method String Long.toString(long)>
	//    9   17:invokevirtual   #156 <Method void Writer.write(String)>
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public JsonWriter value(Number number)
	{
		if(number == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return nullValue();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #274 <Method JsonWriter nullValue()>
	//    4    8:areturn         
		writeDeferredName();
	//    5    9:aload_0         
	//    6   10:invokespecial   #200 <Method void writeDeferredName()>
		Object obj = ((Object) (((Object) (number)).toString()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #275 <Method String Object.toString()>
	//    9   17:astore_2        
		if(!lenient && (((String) (obj)).equals("-Infinity") || ((String) (obj)).equals("Infinity") || ((String) (obj)).equals("NaN")))
	//*  10   18:aload_0         
	//*  11   19:getfield        #127 <Field boolean lenient>
	//*  12   22:ifne            89
	//*  13   25:aload_2         
	//*  14   26:ldc2            #277 <String "-Infinity">
	//*  15   29:invokevirtual   #281 <Method boolean String.equals(Object)>
	//*  16   32:ifne            55
	//*  17   35:aload_2         
	//*  18   36:ldc2            #283 <String "Infinity">
	//*  19   39:invokevirtual   #281 <Method boolean String.equals(Object)>
	//*  20   42:ifne            55
	//*  21   45:aload_2         
	//*  22   46:ldc2            #285 <String "NaN">
	//*  23   49:invokevirtual   #281 <Method boolean String.equals(Object)>
	//*  24   52:ifeq            89
		{
			obj = ((Object) (new StringBuilder()));
	//   25   55:new             #144 <Class StringBuilder>
	//   26   58:dup             
	//   27   59:invokespecial   #145 <Method void StringBuilder()>
	//   28   62:astore_2        
			((StringBuilder) (obj)).append("Numeric values must be finite, but was ");
	//   29   63:aload_2         
	//   30   64:ldc2            #259 <String "Numeric values must be finite, but was ">
	//   31   67:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   32   70:pop             
			((StringBuilder) (obj)).append(((Object) (number)));
	//   33   71:aload_2         
	//   34   72:aload_1         
	//   35   73:invokevirtual   #288 <Method StringBuilder StringBuilder.append(Object)>
	//   36   76:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   37   77:new             #264 <Class IllegalArgumentException>
	//   38   80:dup             
	//   39   81:aload_2         
	//   40   82:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   41   85:invokespecial   #265 <Method void IllegalArgumentException(String)>
	//   42   88:athrow          
		} else
		{
			beforeValue(false);
	//   43   89:aload_0         
	//   44   90:iconst_0        
	//   45   91:invokespecial   #164 <Method void beforeValue(boolean)>
			out.append(((CharSequence) (obj)));
	//   46   94:aload_0         
	//   47   95:getfield        #102 <Field Writer out>
	//   48   98:aload_2         
	//   49   99:invokevirtual   #135 <Method Writer Writer.append(CharSequence)>
	//   50  102:pop             
			return this;
	//   51  103:aload_0         
	//   52  104:areturn         
		}
	}

	public JsonWriter value(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
		{
			return nullValue();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #274 <Method JsonWriter nullValue()>
	//    4    8:areturn         
		} else
		{
			writeDeferredName();
	//    5    9:aload_0         
	//    6   10:invokespecial   #200 <Method void writeDeferredName()>
			beforeValue(false);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokespecial   #164 <Method void beforeValue(boolean)>
			string(s);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokespecial   #196 <Method void string(String)>
			return this;
	//   13   23:aload_0         
	//   14   24:areturn         
		}
	}

	public JsonWriter value(boolean flag)
	{
		writeDeferredName();
	//    0    0:aload_0         
	//    1    1:invokespecial   #200 <Method void writeDeferredName()>
		beforeValue(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #164 <Method void beforeValue(boolean)>
		Writer writer = out;
	//    5    9:aload_0         
	//    6   10:getfield        #102 <Field Writer out>
	//    7   13:astore_3        
		String s;
		if(flag)
	//*   8   14:iload_1         
	//*   9   15:ifeq            25
			s = "true";
	//   10   18:ldc2            #291 <String "true">
	//   11   21:astore_2        
		else
	//*  12   22:goto            29
			s = "false";
	//   13   25:ldc2            #293 <String "false">
	//   14   28:astore_2        
		writer.write(s);
	//   15   29:aload_3         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #156 <Method void Writer.write(String)>
		return this;
	//   18   34:aload_0         
	//   19   35:areturn         
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
