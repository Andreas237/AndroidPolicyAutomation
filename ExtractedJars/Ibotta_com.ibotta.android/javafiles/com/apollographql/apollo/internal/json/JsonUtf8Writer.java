// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.json;

import java.io.IOException;
import okio.BufferedSink;

// Referenced classes of package com.apollographql.apollo.internal.json:
//			JsonWriter

final class JsonUtf8Writer extends JsonWriter
{

	JsonUtf8Writer(BufferedSink bufferedsink)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void JsonWriter()>
		separator = ":";
	//    2    4:aload_0         
	//    3    5:ldc1            #52  <String ":">
	//    4    7:putfield        #54  <Field String separator>
		if(bufferedsink != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          26
		{
			sink = bufferedsink;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #56  <Field BufferedSink sink>
			pushScope(6);
	//   10   19:aload_0         
	//   11   20:bipush          6
	//   12   22:invokevirtual   #60  <Method void pushScope(int)>
			return;
	//   13   25:return          
		} else
		{
			throw new NullPointerException("sink == null");
	//   14   26:new             #62  <Class NullPointerException>
	//   15   29:dup             
	//   16   30:ldc1            #64  <String "sink == null">
	//   17   32:invokespecial   #67  <Method void NullPointerException(String)>
	//   18   35:athrow          
		}
	}

	private void beforeName()
		throws IOException
	{
label0:
		{
			int i = peekScope();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #74  <Method int peekScope()>
	//    2    4:istore_1        
			if(i == 5)
	//*   3    5:iload_1         
	//*   4    6:iconst_5        
	//*   5    7:icmpne          25
				sink.writeByte(44);
	//    6   10:aload_0         
	//    7   11:getfield        #56  <Field BufferedSink sink>
	//    8   14:bipush          44
	//    9   16:invokeinterface #80  <Method BufferedSink BufferedSink.writeByte(int)>
	//   10   21:pop             
			else
	//*  11   22:goto            30
			if(i != 3)
				break label0;
	//   12   25:iload_1         
	//   13   26:iconst_3        
	//   14   27:icmpne          40
			newline();
	//   15   30:aload_0         
	//   16   31:invokespecial   #83  <Method void newline()>
			replaceTop(4);
	//   17   34:aload_0         
	//   18   35:iconst_4        
	//   19   36:invokevirtual   #86  <Method void replaceTop(int)>
			return;
	//   20   39:return          
		}
		throw new IllegalStateException("Nesting problem.");
	//   21   40:new             #88  <Class IllegalStateException>
	//   22   43:dup             
	//   23   44:ldc1            #90  <String "Nesting problem.">
	//   24   46:invokespecial   #91  <Method void IllegalStateException(String)>
	//   25   49:athrow          
	}

	private void beforeValue()
		throws IOException
	{
		switch(peekScope())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #74  <Method int peekScope()>
		{
	//*   2    4:tableswitch     1 7: default 48
	//	               1 122
	//	               2 105
	//	               3 48
	//	               4 85
	//	               5 48
	//	               6 78
	//	               7 58
		case 3: // '\003'
		case 5: // '\005'
		default:
			throw new IllegalStateException("Nesting problem.");
	//    3   48:new             #88  <Class IllegalStateException>
	//    4   51:dup             
	//    5   52:ldc1            #90  <String "Nesting problem.">
	//    6   54:invokespecial   #91  <Method void IllegalStateException(String)>
	//    7   57:athrow          

		case 7: // '\007'
			if(!lenient)
	//*   8   58:aload_0         
	//*   9   59:getfield        #97  <Field boolean lenient>
	//*  10   62:ifeq            68
	//*  11   65:goto            78
				throw new IllegalStateException("JSON must have only one top-level value.");
	//   12   68:new             #88  <Class IllegalStateException>
	//   13   71:dup             
	//   14   72:ldc1            #99  <String "JSON must have only one top-level value.">
	//   15   74:invokespecial   #91  <Method void IllegalStateException(String)>
	//   16   77:athrow          
			// fall through

		case 6: // '\006'
			replaceTop(7);
	//   17   78:aload_0         
	//   18   79:bipush          7
	//   19   81:invokevirtual   #86  <Method void replaceTop(int)>
			return;
	//   20   84:return          

		case 4: // '\004'
			sink.writeUtf8(separator);
	//   21   85:aload_0         
	//   22   86:getfield        #56  <Field BufferedSink sink>
	//   23   89:aload_0         
	//   24   90:getfield        #54  <Field String separator>
	//   25   93:invokeinterface #103 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//   26   98:pop             
			replaceTop(5);
	//   27   99:aload_0         
	//   28  100:iconst_5        
	//   29  101:invokevirtual   #86  <Method void replaceTop(int)>
			return;
	//   30  104:return          

		case 2: // '\002'
			sink.writeByte(44);
	//   31  105:aload_0         
	//   32  106:getfield        #56  <Field BufferedSink sink>
	//   33  109:bipush          44
	//   34  111:invokeinterface #80  <Method BufferedSink BufferedSink.writeByte(int)>
	//   35  116:pop             
			newline();
	//   36  117:aload_0         
	//   37  118:invokespecial   #83  <Method void newline()>
			return;
	//   38  121:return          

		case 1: // '\001'
			replaceTop(2);
	//   39  122:aload_0         
	//   40  123:iconst_2        
	//   41  124:invokevirtual   #86  <Method void replaceTop(int)>
			newline();
	//   42  127:aload_0         
	//   43  128:invokespecial   #83  <Method void newline()>
			return;
	//   44  131:return          
		}
	}

	private JsonWriter close(int i, int j, String s)
		throws IOException
	{
		int k = peekScope();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #74  <Method int peekScope()>
	//    2    4:istore          4
		if(k != j && k != i)
	//*   3    6:iload           4
	//*   4    8:iload_2         
	//*   5    9:icmpeq          31
	//*   6   12:iload           4
	//*   7   14:iload_1         
	//*   8   15:icmpne          21
	//*   9   18:goto            31
			throw new IllegalStateException("Nesting problem.");
	//   10   21:new             #88  <Class IllegalStateException>
	//   11   24:dup             
	//   12   25:ldc1            #90  <String "Nesting problem.">
	//   13   27:invokespecial   #91  <Method void IllegalStateException(String)>
	//   14   30:athrow          
		if(deferredName == null)
	//*  15   31:aload_0         
	//*  16   32:getfield        #107 <Field String deferredName>
	//*  17   35:ifnonnull       104
		{
			stackSize = stackSize - 1;
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #111 <Field int stackSize>
	//   21   43:iconst_1        
	//   22   44:isub            
	//   23   45:putfield        #111 <Field int stackSize>
			pathNames[stackSize] = null;
	//   24   48:aload_0         
	//   25   49:getfield        #114 <Field String[] pathNames>
	//   26   52:aload_0         
	//   27   53:getfield        #111 <Field int stackSize>
	//   28   56:aconst_null     
	//   29   57:aastore         
			int ai[] = pathIndices;
	//   30   58:aload_0         
	//   31   59:getfield        #118 <Field int[] pathIndices>
	//   32   62:astore          5
			i = stackSize - 1;
	//   33   64:aload_0         
	//   34   65:getfield        #111 <Field int stackSize>
	//   35   68:iconst_1        
	//   36   69:isub            
	//   37   70:istore_1        
			ai[i] = ai[i] + 1;
	//   38   71:aload           5
	//   39   73:iload_1         
	//   40   74:aload           5
	//   41   76:iload_1         
	//   42   77:iaload          
	//   43   78:iconst_1        
	//   44   79:iadd            
	//   45   80:iastore         
			if(k == j)
	//*  46   81:iload           4
	//*  47   83:iload_2         
	//*  48   84:icmpne          91
				newline();
	//   49   87:aload_0         
	//   50   88:invokespecial   #83  <Method void newline()>
			sink.writeUtf8(s);
	//   51   91:aload_0         
	//   52   92:getfield        #56  <Field BufferedSink sink>
	//   53   95:aload_3         
	//   54   96:invokeinterface #103 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//   55  101:pop             
			return ((JsonWriter) (this));
	//   56  102:aload_0         
	//   57  103:areturn         
		} else
		{
			s = ((String) (new StringBuilder()));
	//   58  104:new             #120 <Class StringBuilder>
	//   59  107:dup             
	//   60  108:invokespecial   #121 <Method void StringBuilder()>
	//   61  111:astore_3        
			((StringBuilder) (s)).append("Dangling name: ");
	//   62  112:aload_3         
	//   63  113:ldc1            #123 <String "Dangling name: ">
	//   64  115:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   65  118:pop             
			((StringBuilder) (s)).append(deferredName);
	//   66  119:aload_3         
	//   67  120:aload_0         
	//   68  121:getfield        #107 <Field String deferredName>
	//   69  124:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   70  127:pop             
			throw new IllegalStateException(((StringBuilder) (s)).toString());
	//   71  128:new             #88  <Class IllegalStateException>
	//   72  131:dup             
	//   73  132:aload_3         
	//   74  133:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   75  136:invokespecial   #91  <Method void IllegalStateException(String)>
	//   76  139:athrow          
		}
	}

	private void newline()
		throws IOException
	{
		if(indent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field String indent>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		sink.writeByte(10);
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field BufferedSink sink>
	//    6   12:bipush          10
	//    7   14:invokeinterface #80  <Method BufferedSink BufferedSink.writeByte(int)>
	//    8   19:pop             
		int j = stackSize;
	//    9   20:aload_0         
	//   10   21:getfield        #111 <Field int stackSize>
	//   11   24:istore_2        
		for(int i = 1; i < j; i++)
	//*  12   25:iconst_1        
	//*  13   26:istore_1        
	//*  14   27:iload_1         
	//*  15   28:iload_2         
	//*  16   29:icmpge          53
			sink.writeUtf8(indent);
	//   17   32:aload_0         
	//   18   33:getfield        #56  <Field BufferedSink sink>
	//   19   36:aload_0         
	//   20   37:getfield        #134 <Field String indent>
	//   21   40:invokeinterface #103 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//   22   45:pop             

	//   23   46:iload_1         
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:istore_1        
	//*  27   50:goto            27
	//   28   53:return          
	}

	private JsonWriter open(int i, String s)
		throws IOException
	{
		beforeValue();
	//    0    0:aload_0         
	//    1    1:invokespecial   #138 <Method void beforeValue()>
		pushScope(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #60  <Method void pushScope(int)>
		pathIndices[stackSize - 1] = 0;
	//    5    9:aload_0         
	//    6   10:getfield        #118 <Field int[] pathIndices>
	//    7   13:aload_0         
	//    8   14:getfield        #111 <Field int stackSize>
	//    9   17:iconst_1        
	//   10   18:isub            
	//   11   19:iconst_0        
	//   12   20:iastore         
		sink.writeUtf8(s);
	//   13   21:aload_0         
	//   14   22:getfield        #56  <Field BufferedSink sink>
	//   15   25:aload_2         
	//   16   26:invokeinterface #103 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//   17   31:pop             
		return ((JsonWriter) (this));
	//   18   32:aload_0         
	//   19   33:areturn         
	}

	static void string(BufferedSink bufferedsink, String s)
		throws IOException
	{
		String as[] = REPLACEMENT_CHARS;
	//    0    0:getstatic       #17  <Field String[] REPLACEMENT_CHARS>
	//    1    3:astore          9
		bufferedsink.writeByte(34);
	//    2    5:aload_0         
	//    3    6:bipush          34
	//    4    8:invokeinterface #80  <Method BufferedSink BufferedSink.writeByte(int)>
	//    5   13:pop             
		int l = s.length();
	//    6   14:aload_1         
	//    7   15:invokevirtual   #143 <Method int String.length()>
	//    8   18:istore          5
		int i = 0;
	//    9   20:iconst_0        
	//   10   21:istore_2        
		int j;
		int k;
		for(j = 0; i < l; j = k)
	//*  11   22:iconst_0        
	//*  12   23:istore_3        
	//*  13   24:iload_2         
	//*  14   25:iload           5
	//*  15   27:icmpge          136
		{
label0:
			{
				char c = s.charAt(i);
	//   16   30:aload_1         
	//   17   31:iload_2         
	//   18   32:invokevirtual   #147 <Method char String.charAt(int)>
	//   19   35:istore          6
				String s1;
				if(c < '\200')
	//*  20   37:iload           6
	//*  21   39:sipush          128
	//*  22   42:icmpge          67
				{
					String s2 = as[c];
	//   23   45:aload           9
	//   24   47:iload           6
	//   25   49:aaload          
	//   26   50:astore          8
					s1 = s2;
	//   27   52:aload           8
	//   28   54:astore          7
					if(s2 == null)
	//*  29   56:aload           8
	//*  30   58:ifnonnull       97
					{
						k = j;
	//   31   61:iload_3         
	//   32   62:istore          4
						break label0;
	//   33   64:goto            126
					}
				} else
				if(c == '\u2028')
	//*  34   67:iload           6
	//*  35   69:sipush          8232
	//*  36   72:icmpne          82
				{
					s1 = "\\u2028";
	//   37   75:ldc1            #149 <String "\\u2028">
	//   38   77:astore          7
				} else
	//*  39   79:goto            97
				{
					k = j;
	//   40   82:iload_3         
	//   41   83:istore          4
					if(c != '\u2029')
						break label0;
	//   42   85:iload           6
	//   43   87:sipush          8233
	//   44   90:icmpne          126
					s1 = "\\u2029";
	//   45   93:ldc1            #151 <String "\\u2029">
	//   46   95:astore          7
				}
				if(j < i)
	//*  47   97:iload_3         
	//*  48   98:iload_2         
	//*  49   99:icmpge          112
					bufferedsink.writeUtf8(s, j, i);
	//   50  102:aload_0         
	//   51  103:aload_1         
	//   52  104:iload_3         
	//   53  105:iload_2         
	//   54  106:invokeinterface #154 <Method BufferedSink BufferedSink.writeUtf8(String, int, int)>
	//   55  111:pop             
				bufferedsink.writeUtf8(s1);
	//   56  112:aload_0         
	//   57  113:aload           7
	//   58  115:invokeinterface #103 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//   59  120:pop             
				k = i + 1;
	//   60  121:iload_2         
	//   61  122:iconst_1        
	//   62  123:iadd            
	//   63  124:istore          4
			}
			i++;
	//   64  126:iload_2         
	//   65  127:iconst_1        
	//   66  128:iadd            
	//   67  129:istore_2        
		}

	//   68  130:iload           4
	//   69  132:istore_3        
	//*  70  133:goto            24
		if(j < l)
	//*  71  136:iload_3         
	//*  72  137:iload           5
	//*  73  139:icmpge          153
			bufferedsink.writeUtf8(s, j, l);
	//   74  142:aload_0         
	//   75  143:aload_1         
	//   76  144:iload_3         
	//   77  145:iload           5
	//   78  147:invokeinterface #154 <Method BufferedSink BufferedSink.writeUtf8(String, int, int)>
	//   79  152:pop             
		bufferedsink.writeByte(34);
	//   80  153:aload_0         
	//   81  154:bipush          34
	//   82  156:invokeinterface #80  <Method BufferedSink BufferedSink.writeByte(int)>
	//   83  161:pop             
	//   84  162:return          
	}

	private void writeDeferredName()
		throws IOException
	{
		if(deferredName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field String deferredName>
	//*   2    4:ifnull          27
		{
			beforeName();
	//    3    7:aload_0         
	//    4    8:invokespecial   #157 <Method void beforeName()>
			string(sink, deferredName);
	//    5   11:aload_0         
	//    6   12:getfield        #56  <Field BufferedSink sink>
	//    7   15:aload_0         
	//    8   16:getfield        #107 <Field String deferredName>
	//    9   19:invokestatic    #159 <Method void string(BufferedSink, String)>
			deferredName = null;
	//   10   22:aload_0         
	//   11   23:aconst_null     
	//   12   24:putfield        #107 <Field String deferredName>
		}
	//   13   27:return          
	}

	public JsonWriter beginArray()
		throws IOException
	{
		writeDeferredName();
	//    0    0:aload_0         
	//    1    1:invokespecial   #163 <Method void writeDeferredName()>
		return open(1, "[");
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:ldc1            #165 <String "[">
	//    5    8:invokespecial   #167 <Method JsonWriter open(int, String)>
	//    6   11:areturn         
	}

	public JsonWriter beginObject()
		throws IOException
	{
		writeDeferredName();
	//    0    0:aload_0         
	//    1    1:invokespecial   #163 <Method void writeDeferredName()>
		return open(3, "{");
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:ldc1            #170 <String "{">
	//    5    8:invokespecial   #167 <Method JsonWriter open(int, String)>
	//    6   11:areturn         
	}

	public void close()
		throws IOException
	{
		sink.close();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field BufferedSink sink>
	//    2    4:invokeinterface #172 <Method void BufferedSink.close()>
		int i = stackSize;
	//    3    9:aload_0         
	//    4   10:getfield        #111 <Field int stackSize>
	//    5   13:istore_1        
		if(i <= 1 && (i != 1 || scopes[i - 1] == 7))
	//*   6   14:iload_1         
	//*   7   15:iconst_1        
	//*   8   16:icmpgt          43
	//*   9   19:iload_1         
	//*  10   20:iconst_1        
	//*  11   21:icmpne          37
	//*  12   24:aload_0         
	//*  13   25:getfield        #175 <Field int[] scopes>
	//*  14   28:iload_1         
	//*  15   29:iconst_1        
	//*  16   30:isub            
	//*  17   31:iaload          
	//*  18   32:bipush          7
	//*  19   34:icmpne          43
		{
			stackSize = 0;
	//   20   37:aload_0         
	//   21   38:iconst_0        
	//   22   39:putfield        #111 <Field int stackSize>
			return;
	//   23   42:return          
		} else
		{
			throw new IOException("Incomplete document");
	//   24   43:new             #70  <Class IOException>
	//   25   46:dup             
	//   26   47:ldc1            #177 <String "Incomplete document">
	//   27   49:invokespecial   #178 <Method void IOException(String)>
	//   28   52:athrow          
		}
	}

	public JsonWriter endArray()
		throws IOException
	{
		return close(1, 2, "]");
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_2        
	//    3    3:ldc1            #181 <String "]">
	//    4    5:invokespecial   #183 <Method JsonWriter close(int, int, String)>
	//    5    8:areturn         
	}

	public JsonWriter endObject()
		throws IOException
	{
		promoteValueToName = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #187 <Field boolean promoteValueToName>
		return close(3, 5, "}");
	//    3    5:aload_0         
	//    4    6:iconst_3        
	//    5    7:iconst_5        
	//    6    8:ldc1            #189 <String "}">
	//    7   10:invokespecial   #183 <Method JsonWriter close(int, int, String)>
	//    8   13:areturn         
	}

	public void flush()
		throws IOException
	{
		if(stackSize != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field int stackSize>
	//*   2    4:ifeq            17
		{
			sink.flush();
	//    3    7:aload_0         
	//    4    8:getfield        #56  <Field BufferedSink sink>
	//    5   11:invokeinterface #192 <Method void BufferedSink.flush()>
			return;
	//    6   16:return          
		} else
		{
			throw new IllegalStateException("JsonWriter is closed.");
	//    7   17:new             #88  <Class IllegalStateException>
	//    8   20:dup             
	//    9   21:ldc1            #194 <String "JsonWriter is closed.">
	//   10   23:invokespecial   #91  <Method void IllegalStateException(String)>
	//   11   26:athrow          
		}
	}

	public JsonWriter name(String s)
		throws IOException
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          62
		{
			if(stackSize != 0)
	//*   2    4:aload_0         
	//*   3    5:getfield        #111 <Field int stackSize>
	//*   4    8:ifeq            52
			{
				if(deferredName == null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #107 <Field String deferredName>
	//*   7   15:ifnonnull       42
				{
					deferredName = s;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #107 <Field String deferredName>
					pathNames[stackSize - 1] = s;
	//   11   23:aload_0         
	//   12   24:getfield        #114 <Field String[] pathNames>
	//   13   27:aload_0         
	//   14   28:getfield        #111 <Field int stackSize>
	//   15   31:iconst_1        
	//   16   32:isub            
	//   17   33:aload_1         
	//   18   34:aastore         
					promoteValueToName = false;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #187 <Field boolean promoteValueToName>
					return ((JsonWriter) (this));
	//   22   40:aload_0         
	//   23   41:areturn         
				} else
				{
					throw new IllegalStateException("Nesting problem.");
	//   24   42:new             #88  <Class IllegalStateException>
	//   25   45:dup             
	//   26   46:ldc1            #90  <String "Nesting problem.">
	//   27   48:invokespecial   #91  <Method void IllegalStateException(String)>
	//   28   51:athrow          
				}
			} else
			{
				throw new IllegalStateException("JsonWriter is closed.");
	//   29   52:new             #88  <Class IllegalStateException>
	//   30   55:dup             
	//   31   56:ldc1            #194 <String "JsonWriter is closed.">
	//   32   58:invokespecial   #91  <Method void IllegalStateException(String)>
	//   33   61:athrow          
			}
		} else
		{
			throw new NullPointerException("name == null");
	//   34   62:new             #62  <Class NullPointerException>
	//   35   65:dup             
	//   36   66:ldc1            #198 <String "name == null">
	//   37   68:invokespecial   #67  <Method void NullPointerException(String)>
	//   38   71:athrow          
		}
	}

	public JsonWriter nullValue()
		throws IOException
	{
		if(deferredName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field String deferredName>
	//*   2    4:ifnull          28
			if(serializeNulls)
	//*   3    7:aload_0         
	//*   4    8:getfield        #202 <Field boolean serializeNulls>
	//*   5   11:ifeq            21
			{
				writeDeferredName();
	//    6   14:aload_0         
	//    7   15:invokespecial   #163 <Method void writeDeferredName()>
			} else
	//*   8   18:goto            28
			{
				deferredName = null;
	//    9   21:aload_0         
	//   10   22:aconst_null     
	//   11   23:putfield        #107 <Field String deferredName>
				return ((JsonWriter) (this));
	//   12   26:aload_0         
	//   13   27:areturn         
			}
		beforeValue();
	//   14   28:aload_0         
	//   15   29:invokespecial   #138 <Method void beforeValue()>
		sink.writeUtf8("null");
	//   16   32:aload_0         
	//   17   33:getfield        #56  <Field BufferedSink sink>
	//   18   36:ldc1            #204 <String "null">
	//   19   38:invokeinterface #103 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//   20   43:pop             
		int ai[] = pathIndices;
	//   21   44:aload_0         
	//   22   45:getfield        #118 <Field int[] pathIndices>
	//   23   48:astore_2        
		int i = stackSize - 1;
	//   24   49:aload_0         
	//   25   50:getfield        #111 <Field int stackSize>
	//   26   53:iconst_1        
	//   27   54:isub            
	//   28   55:istore_1        
		ai[i] = ai[i] + 1;
	//   29   56:aload_2         
	//   30   57:iload_1         
	//   31   58:aload_2         
	//   32   59:iload_1         
	//   33   60:iaload          
	//   34   61:iconst_1        
	//   35   62:iadd            
	//   36   63:iastore         
		return ((JsonWriter) (this));
	//   37   64:aload_0         
	//   38   65:areturn         
	}

	public JsonWriter value(Boolean boolean1)
		throws IOException
	{
		if(boolean1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return nullValue();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #208 <Method JsonWriter nullValue()>
	//    4    8:areturn         
		else
			return value(boolean1.booleanValue());
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #214 <Method boolean Boolean.booleanValue()>
	//    8   14:invokevirtual   #217 <Method JsonWriter value(boolean)>
	//    9   17:areturn         
	}

	public JsonWriter value(Number number)
		throws IOException
	{
		if(number == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return nullValue();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #208 <Method JsonWriter nullValue()>
	//    4    8:areturn         
		Object obj = ((Object) (((Object) (number)).toString()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #220 <Method String Object.toString()>
	//    7   13:astore_3        
		if(!lenient && (((String) (obj)).equals("-Infinity") || ((String) (obj)).equals("Infinity") || ((String) (obj)).equals("NaN")))
	//*   8   14:aload_0         
	//*   9   15:getfield        #97  <Field boolean lenient>
	//*  10   18:ifne            84
	//*  11   21:aload_3         
	//*  12   22:ldc1            #222 <String "-Infinity">
	//*  13   24:invokevirtual   #226 <Method boolean String.equals(Object)>
	//*  14   27:ifne            51
	//*  15   30:aload_3         
	//*  16   31:ldc1            #228 <String "Infinity">
	//*  17   33:invokevirtual   #226 <Method boolean String.equals(Object)>
	//*  18   36:ifne            51
	//*  19   39:aload_3         
	//*  20   40:ldc1            #230 <String "NaN">
	//*  21   42:invokevirtual   #226 <Method boolean String.equals(Object)>
	//*  22   45:ifne            51
	//*  23   48:goto            84
		{
			obj = ((Object) (new StringBuilder()));
	//   24   51:new             #120 <Class StringBuilder>
	//   25   54:dup             
	//   26   55:invokespecial   #121 <Method void StringBuilder()>
	//   27   58:astore_3        
			((StringBuilder) (obj)).append("Numeric values must be finite, but was ");
	//   28   59:aload_3         
	//   29   60:ldc1            #232 <String "Numeric values must be finite, but was ">
	//   30   62:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   31   65:pop             
			((StringBuilder) (obj)).append(((Object) (number)));
	//   32   66:aload_3         
	//   33   67:aload_1         
	//   34   68:invokevirtual   #235 <Method StringBuilder StringBuilder.append(Object)>
	//   35   71:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   36   72:new             #237 <Class IllegalArgumentException>
	//   37   75:dup             
	//   38   76:aload_3         
	//   39   77:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   40   80:invokespecial   #238 <Method void IllegalArgumentException(String)>
	//   41   83:athrow          
		}
		if(promoteValueToName)
	//*  42   84:aload_0         
	//*  43   85:getfield        #187 <Field boolean promoteValueToName>
	//*  44   88:ifeq            97
		{
			return name(((String) (obj)));
	//   45   91:aload_0         
	//   46   92:aload_3         
	//   47   93:invokevirtual   #240 <Method JsonWriter name(String)>
	//   48   96:areturn         
		} else
		{
			writeDeferredName();
	//   49   97:aload_0         
	//   50   98:invokespecial   #163 <Method void writeDeferredName()>
			beforeValue();
	//   51  101:aload_0         
	//   52  102:invokespecial   #138 <Method void beforeValue()>
			sink.writeUtf8(((String) (obj)));
	//   53  105:aload_0         
	//   54  106:getfield        #56  <Field BufferedSink sink>
	//   55  109:aload_3         
	//   56  110:invokeinterface #103 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//   57  115:pop             
			number = ((Number) (pathIndices));
	//   58  116:aload_0         
	//   59  117:getfield        #118 <Field int[] pathIndices>
	//   60  120:astore_1        
			int i = stackSize - 1;
	//   61  121:aload_0         
	//   62  122:getfield        #111 <Field int stackSize>
	//   63  125:iconst_1        
	//   64  126:isub            
	//   65  127:istore_2        
			number[i] = number[i] + 1;
	//   66  128:aload_1         
	//   67  129:iload_2         
	//   68  130:aload_1         
	//   69  131:iload_2         
	//   70  132:iaload          
	//   71  133:iconst_1        
	//   72  134:iadd            
	//   73  135:iastore         
			return ((JsonWriter) (this));
	//   74  136:aload_0         
	//   75  137:areturn         
		}
	}

	public JsonWriter value(String s)
		throws IOException
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return nullValue();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #208 <Method JsonWriter nullValue()>
	//    4    8:areturn         
		if(promoteValueToName)
	//*   5    9:aload_0         
	//*   6   10:getfield        #187 <Field boolean promoteValueToName>
	//*   7   13:ifeq            22
		{
			return name(s);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #240 <Method JsonWriter name(String)>
	//   11   21:areturn         
		} else
		{
			writeDeferredName();
	//   12   22:aload_0         
	//   13   23:invokespecial   #163 <Method void writeDeferredName()>
			beforeValue();
	//   14   26:aload_0         
	//   15   27:invokespecial   #138 <Method void beforeValue()>
			string(sink, s);
	//   16   30:aload_0         
	//   17   31:getfield        #56  <Field BufferedSink sink>
	//   18   34:aload_1         
	//   19   35:invokestatic    #159 <Method void string(BufferedSink, String)>
			s = ((String) (pathIndices));
	//   20   38:aload_0         
	//   21   39:getfield        #118 <Field int[] pathIndices>
	//   22   42:astore_1        
			int i = stackSize - 1;
	//   23   43:aload_0         
	//   24   44:getfield        #111 <Field int stackSize>
	//   25   47:iconst_1        
	//   26   48:isub            
	//   27   49:istore_2        
			s[i] = s[i] + 1;
	//   28   50:aload_1         
	//   29   51:iload_2         
	//   30   52:aload_1         
	//   31   53:iload_2         
	//   32   54:iaload          
	//   33   55:iconst_1        
	//   34   56:iadd            
	//   35   57:iastore         
			return ((JsonWriter) (this));
	//   36   58:aload_0         
	//   37   59:areturn         
		}
	}

	public JsonWriter value(boolean flag)
		throws IOException
	{
		writeDeferredName();
	//    0    0:aload_0         
	//    1    1:invokespecial   #163 <Method void writeDeferredName()>
		beforeValue();
	//    2    4:aload_0         
	//    3    5:invokespecial   #138 <Method void beforeValue()>
		BufferedSink bufferedsink = sink;
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field BufferedSink sink>
	//    6   12:astore          4
		String s;
		if(flag)
	//*   7   14:iload_1         
	//*   8   15:ifeq            24
			s = "true";
	//    9   18:ldc1            #243 <String "true">
	//   10   20:astore_3        
		else
	//*  11   21:goto            27
			s = "false";
	//   12   24:ldc1            #245 <String "false">
	//   13   26:astore_3        
		bufferedsink.writeUtf8(s);
	//   14   27:aload           4
	//   15   29:aload_3         
	//   16   30:invokeinterface #103 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//   17   35:pop             
		int ai[] = pathIndices;
	//   18   36:aload_0         
	//   19   37:getfield        #118 <Field int[] pathIndices>
	//   20   40:astore_3        
		int i = stackSize - 1;
	//   21   41:aload_0         
	//   22   42:getfield        #111 <Field int stackSize>
	//   23   45:iconst_1        
	//   24   46:isub            
	//   25   47:istore_2        
		ai[i] = ai[i] + 1;
	//   26   48:aload_3         
	//   27   49:iload_2         
	//   28   50:aload_3         
	//   29   51:iload_2         
	//   30   52:iaload          
	//   31   53:iconst_1        
	//   32   54:iadd            
	//   33   55:iastore         
		return ((JsonWriter) (this));
	//   34   56:aload_0         
	//   35   57:areturn         
	}

	private static final String REPLACEMENT_CHARS[];
	private String deferredName;
	private String separator;
	private final BufferedSink sink;

	static 
	{
		REPLACEMENT_CHARS = new String[128];
	//    0    0:sipush          128
	//    1    3:anewarray       String[]
	//    2    6:putstatic       #17  <Field String[] REPLACEMENT_CHARS>
		for(int i = 0; i <= 31; i++)
	//*   3    9:iconst_0        
	//*   4   10:istore_0        
	//*   5   11:iload_0         
	//*   6   12:bipush          31
	//*   7   14:icmpgt          45
			REPLACEMENT_CHARS[i] = String.format("\\u%04x", new Object[] {
				Integer.valueOf(i)
			});
	//    8   17:getstatic       #17  <Field String[] REPLACEMENT_CHARS>
	//    9   20:iload_0         
	//   10   21:ldc1            #19  <String "\\u%04x">
	//   11   23:iconst_1        
	//   12   24:anewarray       Object[]
	//   13   27:dup             
	//   14   28:iconst_0        
	//   15   29:iload_0         
	//   16   30:invokestatic    #27  <Method Integer Integer.valueOf(int)>
	//   17   33:aastore         
	//   18   34:invokestatic    #31  <Method String String.format(String, Object[])>
	//   19   37:aastore         

	//   20   38:iload_0         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_0        
	//*  24   42:goto            11
		String as[] = REPLACEMENT_CHARS;
	//   25   45:getstatic       #17  <Field String[] REPLACEMENT_CHARS>
	//   26   48:astore_1        
		as[34] = "\\\"";
	//   27   49:aload_1         
	//   28   50:bipush          34
	//   29   52:ldc1            #33  <String "\\\"">
	//   30   54:aastore         
		as[92] = "\\\\";
	//   31   55:aload_1         
	//   32   56:bipush          92
	//   33   58:ldc1            #35  <String "\\\\">
	//   34   60:aastore         
		as[9] = "\\t";
	//   35   61:aload_1         
	//   36   62:bipush          9
	//   37   64:ldc1            #37  <String "\\t">
	//   38   66:aastore         
		as[8] = "\\b";
	//   39   67:aload_1         
	//   40   68:bipush          8
	//   41   70:ldc1            #39  <String "\\b">
	//   42   72:aastore         
		as[10] = "\\n";
	//   43   73:aload_1         
	//   44   74:bipush          10
	//   45   76:ldc1            #41  <String "\\n">
	//   46   78:aastore         
		as[13] = "\\r";
	//   47   79:aload_1         
	//   48   80:bipush          13
	//   49   82:ldc1            #43  <String "\\r">
	//   50   84:aastore         
		as[12] = "\\f";
	//   51   85:aload_1         
	//   52   86:bipush          12
	//   53   88:ldc1            #45  <String "\\f">
	//   54   90:aastore         
	//*  55   91:return          
	}
}
