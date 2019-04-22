// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.fasterxml.jackson.databind:
//			DeserializationContext

public class JsonMappingException extends JsonProcessingException
{
	public static class Reference
		implements Serializable
	{

		public String getDescription()
		{
			if(_desc == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #44  <Field String _desc>
		//*   2    4:ifnonnull       182
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    3    7:new             #46  <Class StringBuilder>
		//    4   10:dup             
		//    5   11:invokespecial   #47  <Method void StringBuilder()>
		//    6   14:astore_3        
				Object obj = _from;
		//    7   15:aload_0         
		//    8   16:getfield        #30  <Field Object _from>
		//    9   19:astore_2        
				if(obj == null)
		//*  10   20:aload_2         
		//*  11   21:ifnonnull       34
				{
					stringbuilder.append("UNKNOWN");
		//   12   24:aload_3         
		//   13   25:ldc1            #49  <String "UNKNOWN">
		//   14   27:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   15   30:pop             
				} else
		//*  16   31:goto            102
				{
					if(obj instanceof Class)
		//*  17   34:aload_2         
		//*  18   35:instanceof      #55  <Class Class>
		//*  19   38:ifeq            49
						obj = ((Object) ((Class)obj));
		//   20   41:aload_2         
		//   21   42:checkcast       #55  <Class Class>
		//   22   45:astore_2        
					else
		//*  23   46:goto            54
						obj = ((Object) (obj.getClass()));
		//   24   49:aload_2         
		//   25   50:invokevirtual   #59  <Method Class Object.getClass()>
		//   26   53:astore_2        
					int i;
					for(i = 0; ((Class) (obj)).isArray(); i++)
		//*  27   54:iconst_0        
		//*  28   55:istore_1        
		//*  29   56:aload_2         
		//*  30   57:invokevirtual   #63  <Method boolean Class.isArray()>
		//*  31   60:ifeq            75
						obj = ((Object) (((Class) (obj)).getComponentType()));
		//   32   63:aload_2         
		//   33   64:invokevirtual   #66  <Method Class Class.getComponentType()>
		//   34   67:astore_2        

		//   35   68:iload_1         
		//   36   69:iconst_1        
		//   37   70:iadd            
		//   38   71:istore_1        
		//*  39   72:goto            56
					stringbuilder.append(((Class) (obj)).getName());
		//   40   75:aload_3         
		//   41   76:aload_2         
		//   42   77:invokevirtual   #69  <Method String Class.getName()>
		//   43   80:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   44   83:pop             
					do
					{
						i--;
		//   45   84:iload_1         
		//   46   85:iconst_1        
		//   47   86:isub            
		//   48   87:istore_1        
						if(i < 0)
							break;
		//   49   88:iload_1         
		//   50   89:iflt            102
						stringbuilder.append("[]");
		//   51   92:aload_3         
		//   52   93:ldc1            #71  <String "[]">
		//   53   95:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   54   98:pop             
					} while(true);
		//   55   99:goto            84
				}
				stringbuilder.append('[');
		//   56  102:aload_3         
		//   57  103:bipush          91
		//   58  105:invokevirtual   #74  <Method StringBuilder StringBuilder.append(char)>
		//   59  108:pop             
				if(_fieldName != null)
		//*  60  109:aload_0         
		//*  61  110:getfield        #33  <Field String _fieldName>
		//*  62  113:ifnull          142
				{
					stringbuilder.append('"');
		//   63  116:aload_3         
		//   64  117:bipush          34
		//   65  119:invokevirtual   #74  <Method StringBuilder StringBuilder.append(char)>
		//   66  122:pop             
					stringbuilder.append(_fieldName);
		//   67  123:aload_3         
		//   68  124:aload_0         
		//   69  125:getfield        #33  <Field String _fieldName>
		//   70  128:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   71  131:pop             
					stringbuilder.append('"');
		//   72  132:aload_3         
		//   73  133:bipush          34
		//   74  135:invokevirtual   #74  <Method StringBuilder StringBuilder.append(char)>
		//   75  138:pop             
				} else
		//*  76  139:goto            167
				{
					int j = _index;
		//   77  142:aload_0         
		//   78  143:getfield        #26  <Field int _index>
		//   79  146:istore_1        
					if(j >= 0)
		//*  80  147:iload_1         
		//*  81  148:iflt            160
						stringbuilder.append(j);
		//   82  151:aload_3         
		//   83  152:iload_1         
		//   84  153:invokevirtual   #77  <Method StringBuilder StringBuilder.append(int)>
		//   85  156:pop             
					else
		//*  86  157:goto            167
						stringbuilder.append('?');
		//   87  160:aload_3         
		//   88  161:bipush          63
		//   89  163:invokevirtual   #74  <Method StringBuilder StringBuilder.append(char)>
		//   90  166:pop             
				}
				stringbuilder.append(']');
		//   91  167:aload_3         
		//   92  168:bipush          93
		//   93  170:invokevirtual   #74  <Method StringBuilder StringBuilder.append(char)>
		//   94  173:pop             
				_desc = stringbuilder.toString();
		//   95  174:aload_0         
		//   96  175:aload_3         
		//   97  176:invokevirtual   #80  <Method String StringBuilder.toString()>
		//   98  179:putfield        #44  <Field String _desc>
			}
			return _desc;
		//   99  182:aload_0         
		//  100  183:getfield        #44  <Field String _desc>
		//  101  186:areturn         
		}

		public String toString()
		{
			return getDescription();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #82  <Method String getDescription()>
		//    2    4:areturn         
		}

		Object writeReplace()
		{
			getDescription();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #82  <Method String getDescription()>
		//    2    4:pop             
			return ((Object) (this));
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private static final long serialVersionUID = 2L;
		protected String _desc;
		protected String _fieldName;
		protected transient Object _from;
		protected int _index;

		protected Reference()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			_index = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #26  <Field int _index>
		//    5    9:return          
		}

		public Reference(Object obj, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			_index = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #26  <Field int _index>
			_from = obj;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #30  <Field Object _from>
			_index = i;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #26  <Field int _index>
		//   11   19:return          
		}

		public Reference(Object obj, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			_index = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #26  <Field int _index>
			_from = obj;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #30  <Field Object _from>
			if(s != null)
		//*   8   14:aload_2         
		//*   9   15:ifnull          24
			{
				_fieldName = s;
		//   10   18:aload_0         
		//   11   19:aload_2         
		//   12   20:putfield        #33  <Field String _fieldName>
				return;
		//   13   23:return          
			} else
			{
				throw new NullPointerException("Cannot pass null fieldName");
		//   14   24:new             #35  <Class NullPointerException>
		//   15   27:dup             
		//   16   28:ldc1            #37  <String "Cannot pass null fieldName">
		//   17   30:invokespecial   #40  <Method void NullPointerException(String)>
		//   18   33:athrow          
			}
		}
	}


	public JsonMappingException(Closeable closeable, String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #21  <Method void JsonProcessingException(String)>
		_processor = closeable;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #23  <Field Closeable _processor>
		if(closeable instanceof JsonParser)
	//*   6   10:aload_1         
	//*   7   11:instanceof      #25  <Class JsonParser>
	//*   8   14:ifeq            28
			_location = ((JsonParser)closeable).getTokenLocation();
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:checkcast       #25  <Class JsonParser>
	//   12   22:invokevirtual   #29  <Method JsonLocation JsonParser.getTokenLocation()>
	//   13   25:putfield        #33  <Field JsonLocation _location>
	//   14   28:return          
	}

	public JsonMappingException(Closeable closeable, String s, JsonLocation jsonlocation)
	{
		super(s, jsonlocation);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #38  <Method void JsonProcessingException(String, JsonLocation)>
		_processor = closeable;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #23  <Field Closeable _processor>
	//    7   11:return          
	}

	public JsonMappingException(Closeable closeable, String s, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #42  <Method void JsonProcessingException(String, Throwable)>
		_processor = closeable;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #23  <Field Closeable _processor>
		if(closeable instanceof JsonParser)
	//*   7   11:aload_1         
	//*   8   12:instanceof      #25  <Class JsonParser>
	//*   9   15:ifeq            29
			_location = ((JsonParser)closeable).getTokenLocation();
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:checkcast       #25  <Class JsonParser>
	//   13   23:invokevirtual   #29  <Method JsonLocation JsonParser.getTokenLocation()>
	//   14   26:putfield        #33  <Field JsonLocation _location>
	//   15   29:return          
	}

	public static JsonMappingException from(JsonGenerator jsongenerator, String s)
	{
		return new JsonMappingException(((Closeable) (jsongenerator)), s, (Throwable)null);
	//    0    0:new             #2   <Class JsonMappingException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:checkcast       #46  <Class Throwable>
	//    6   10:invokespecial   #48  <Method void JsonMappingException(Closeable, String, Throwable)>
	//    7   13:areturn         
	}

	public static JsonMappingException from(JsonGenerator jsongenerator, String s, Throwable throwable)
	{
		return new JsonMappingException(((Closeable) (jsongenerator)), s, throwable);
	//    0    0:new             #2   <Class JsonMappingException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #48  <Method void JsonMappingException(Closeable, String, Throwable)>
	//    6   10:areturn         
	}

	public static JsonMappingException from(JsonParser jsonparser, String s)
	{
		return new JsonMappingException(((Closeable) (jsonparser)), s);
	//    0    0:new             #2   <Class JsonMappingException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #52  <Method void JsonMappingException(Closeable, String)>
	//    5    9:areturn         
	}

	public static JsonMappingException from(JsonParser jsonparser, String s, Throwable throwable)
	{
		return new JsonMappingException(((Closeable) (jsonparser)), s, throwable);
	//    0    0:new             #2   <Class JsonMappingException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #48  <Method void JsonMappingException(Closeable, String, Throwable)>
	//    6   10:areturn         
	}

	public static JsonMappingException from(DeserializationContext deserializationcontext, String s)
	{
		return new JsonMappingException(((Closeable) (deserializationcontext.getParser())), s);
	//    0    0:new             #2   <Class JsonMappingException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #60  <Method JsonParser DeserializationContext.getParser()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #52  <Method void JsonMappingException(Closeable, String)>
	//    6   12:areturn         
	}

	public static JsonMappingException from(DeserializationContext deserializationcontext, String s, Throwable throwable)
	{
		return new JsonMappingException(((Closeable) (deserializationcontext.getParser())), s, throwable);
	//    0    0:new             #2   <Class JsonMappingException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #60  <Method JsonParser DeserializationContext.getParser()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #48  <Method void JsonMappingException(Closeable, String, Throwable)>
	//    7   13:areturn         
	}

	public static JsonMappingException fromUnexpectedIOE(IOException ioexception)
	{
		return new JsonMappingException(((Closeable) (null)), String.format("Unexpected IOException (of type %s): %s", new Object[] {
			((Object) (ioexception)).getClass().getName(), ioexception.getMessage()
		}));
	//    0    0:new             #2   <Class JsonMappingException>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:ldc1            #65  <String "Unexpected IOException (of type %s): %s">
	//    4    7:iconst_2        
	//    5    8:anewarray       Object[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:aload_0         
	//    9   14:invokevirtual   #71  <Method Class Object.getClass()>
	//   10   17:invokevirtual   #77  <Method String Class.getName()>
	//   11   20:aastore         
	//   12   21:dup             
	//   13   22:iconst_1        
	//   14   23:aload_0         
	//   15   24:invokevirtual   #82  <Method String IOException.getMessage()>
	//   16   27:aastore         
	//   17   28:invokestatic    #88  <Method String String.format(String, Object[])>
	//   18   31:invokespecial   #52  <Method void JsonMappingException(Closeable, String)>
	//   19   34:areturn         
	}

	public static JsonMappingException wrapWithPath(Throwable throwable, Reference reference)
	{
label0:
		{
			Object obj;
label1:
			{
				if(throwable instanceof JsonMappingException)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #2   <Class JsonMappingException>
	//*   2    4:ifeq            15
				{
					throwable = ((Throwable) ((JsonMappingException)throwable));
	//    3    7:aload_0         
	//    4    8:checkcast       #2   <Class JsonMappingException>
	//    5   11:astore_0        
					break label0;
	//    6   12:goto            122
				}
				String s = throwable.getMessage();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #91  <Method String Throwable.getMessage()>
	//    9   19:astore_3        
				if(s != null)
	//*  10   20:aload_3         
	//*  11   21:ifnull          33
				{
					obj = ((Object) (s));
	//   12   24:aload_3         
	//   13   25:astore_2        
					if(s.length() != 0)
						break label1;
	//   14   26:aload_3         
	//   15   27:invokevirtual   #95  <Method int String.length()>
	//   16   30:ifne            72
				}
				obj = ((Object) (new StringBuilder()));
	//   17   33:new             #97  <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #100 <Method void StringBuilder()>
	//   20   40:astore_2        
				((StringBuilder) (obj)).append("(was ");
	//   21   41:aload_2         
	//   22   42:ldc1            #102 <String "(was ">
	//   23   44:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
				((StringBuilder) (obj)).append(((Object) (throwable)).getClass().getName());
	//   25   48:aload_2         
	//   26   49:aload_0         
	//   27   50:invokevirtual   #71  <Method Class Object.getClass()>
	//   28   53:invokevirtual   #77  <Method String Class.getName()>
	//   29   56:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
				((StringBuilder) (obj)).append(")");
	//   31   60:aload_2         
	//   32   61:ldc1            #108 <String ")">
	//   33   63:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   35   67:aload_2         
	//   36   68:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   37   71:astore_2        
			}
			Object obj1 = null;
	//   38   72:aconst_null     
	//   39   73:astore          4
			Closeable closeable = ((Closeable) (obj1));
	//   40   75:aload           4
	//   41   77:astore_3        
			if(throwable instanceof JsonProcessingException)
	//*  42   78:aload_0         
	//*  43   79:instanceof      #4   <Class JsonProcessingException>
	//*  44   82:ifeq            111
			{
				Object obj2 = ((JsonProcessingException)throwable).getProcessor();
	//   45   85:aload_0         
	//   46   86:checkcast       #4   <Class JsonProcessingException>
	//   47   89:invokevirtual   #115 <Method Object JsonProcessingException.getProcessor()>
	//   48   92:astore          5
				closeable = ((Closeable) (obj1));
	//   49   94:aload           4
	//   50   96:astore_3        
				if(obj2 instanceof Closeable)
	//*  51   97:aload           5
	//*  52   99:instanceof      #117 <Class Closeable>
	//*  53  102:ifeq            111
					closeable = (Closeable)obj2;
	//   54  105:aload           5
	//   55  107:checkcast       #117 <Class Closeable>
	//   56  110:astore_3        
			}
			throwable = ((Throwable) (new JsonMappingException(closeable, ((String) (obj)), throwable)));
	//   57  111:new             #2   <Class JsonMappingException>
	//   58  114:dup             
	//   59  115:aload_3         
	//   60  116:aload_2         
	//   61  117:aload_0         
	//   62  118:invokespecial   #48  <Method void JsonMappingException(Closeable, String, Throwable)>
	//   63  121:astore_0        
		}
		((JsonMappingException) (throwable)).prependPath(reference);
	//   64  122:aload_0         
	//   65  123:aload_1         
	//   66  124:invokevirtual   #121 <Method void prependPath(JsonMappingException$Reference)>
		return ((JsonMappingException) (throwable));
	//   67  127:aload_0         
	//   68  128:areturn         
	}

	public static JsonMappingException wrapWithPath(Throwable throwable, Object obj, int i)
	{
		return wrapWithPath(throwable, new Reference(obj, i));
	//    0    0:aload_0         
	//    1    1:new             #6   <Class JsonMappingException$Reference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #125 <Method void JsonMappingException$Reference(Object, int)>
	//    6   10:invokestatic    #127 <Method JsonMappingException wrapWithPath(Throwable, JsonMappingException$Reference)>
	//    7   13:areturn         
	}

	public static JsonMappingException wrapWithPath(Throwable throwable, Object obj, String s)
	{
		return wrapWithPath(throwable, new Reference(obj, s));
	//    0    0:aload_0         
	//    1    1:new             #6   <Class JsonMappingException$Reference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #131 <Method void JsonMappingException$Reference(Object, String)>
	//    6   10:invokestatic    #127 <Method JsonMappingException wrapWithPath(Throwable, JsonMappingException$Reference)>
	//    7   13:areturn         
	}

	protected void _appendPathDesc(StringBuilder stringbuilder)
	{
		Object obj = ((Object) (_path));
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field LinkedList _path>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		obj = ((Object) (((LinkedList) (obj)).iterator()));
	//    6   10:aload_2         
	//    7   11:invokevirtual   #141 <Method Iterator LinkedList.iterator()>
	//    8   14:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//    9   15:aload_2         
	//   10   16:invokeinterface #147 <Method boolean Iterator.hasNext()>
	//   11   21:ifeq            60
			stringbuilder.append(((Reference)((Iterator) (obj)).next()).toString());
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokeinterface #150 <Method Object Iterator.next()>
	//   15   31:checkcast       #6   <Class JsonMappingException$Reference>
	//   16   34:invokevirtual   #151 <Method String JsonMappingException$Reference.toString()>
	//   17   37:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:pop             
			if(((Iterator) (obj)).hasNext())
	//*  19   41:aload_2         
	//*  20   42:invokeinterface #147 <Method boolean Iterator.hasNext()>
	//*  21   47:ifeq            15
				stringbuilder.append("->");
	//   22   50:aload_1         
	//   23   51:ldc1            #153 <String "->">
	//   24   53:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   25   56:pop             
		} while(true);
	//   26   57:goto            15
	//   27   60:return          
	}

	protected String _buildMessage()
	{
		Object obj = ((Object) (super.getMessage()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #155 <Method String JsonProcessingException.getMessage()>
	//    2    4:astore_1        
		if(_path == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #135 <Field LinkedList _path>
	//*   5    9:ifnonnull       14
			return ((String) (obj));
	//    6   12:aload_1         
	//    7   13:areturn         
		if(obj == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       29
			obj = ((Object) (new StringBuilder()));
	//   10   18:new             #97  <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #100 <Method void StringBuilder()>
	//   13   25:astore_1        
		else
	//*  14   26:goto            38
			obj = ((Object) (new StringBuilder(((String) (obj)))));
	//   15   29:new             #97  <Class StringBuilder>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:invokespecial   #156 <Method void StringBuilder(String)>
	//   19   37:astore_1        
		((StringBuilder) (obj)).append(" (through reference chain: ");
	//   20   38:aload_1         
	//   21   39:ldc1            #158 <String " (through reference chain: ">
	//   22   41:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
		obj = ((Object) (getPathReference(((StringBuilder) (obj)))));
	//   24   45:aload_0         
	//   25   46:aload_1         
	//   26   47:invokevirtual   #162 <Method StringBuilder getPathReference(StringBuilder)>
	//   27   50:astore_1        
		((StringBuilder) (obj)).append(')');
	//   28   51:aload_1         
	//   29   52:bipush          41
	//   30   54:invokevirtual   #165 <Method StringBuilder StringBuilder.append(char)>
	//   31   57:pop             
		return ((StringBuilder) (obj)).toString();
	//   32   58:aload_1         
	//   33   59:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   34   62:areturn         
	}

	public String getLocalizedMessage()
	{
		return _buildMessage();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method String _buildMessage()>
	//    2    4:areturn         
	}

	public String getMessage()
	{
		return _buildMessage();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method String _buildMessage()>
	//    2    4:areturn         
	}

	public StringBuilder getPathReference(StringBuilder stringbuilder)
	{
		_appendPathDesc(stringbuilder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #170 <Method void _appendPathDesc(StringBuilder)>
		return stringbuilder;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public Object getProcessor()
	{
		return ((Object) (_processor));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Closeable _processor>
	//    2    4:areturn         
	}

	public void prependPath(Reference reference)
	{
		if(_path == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field LinkedList _path>
	//*   2    4:ifnonnull       18
			_path = new LinkedList();
	//    3    7:aload_0         
	//    4    8:new             #137 <Class LinkedList>
	//    5   11:dup             
	//    6   12:invokespecial   #173 <Method void LinkedList()>
	//    7   15:putfield        #135 <Field LinkedList _path>
		if(_path.size() < 1000)
	//*   8   18:aload_0         
	//*   9   19:getfield        #135 <Field LinkedList _path>
	//*  10   22:invokevirtual   #176 <Method int LinkedList.size()>
	//*  11   25:sipush          1000
	//*  12   28:icmpge          39
			_path.addFirst(((Object) (reference)));
	//   13   31:aload_0         
	//   14   32:getfield        #135 <Field LinkedList _path>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #180 <Method void LinkedList.addFirst(Object)>
	//   17   39:return          
	}

	public void prependPath(Object obj, String s)
	{
		prependPath(new Reference(obj, s));
	//    0    0:aload_0         
	//    1    1:new             #6   <Class JsonMappingException$Reference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #131 <Method void JsonMappingException$Reference(Object, String)>
	//    6   10:invokevirtual   #121 <Method void prependPath(JsonMappingException$Reference)>
	//    7   13:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #97  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object)this).getClass().getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #71  <Method Class Object.getClass()>
	//    7   13:invokevirtual   #77  <Method String Class.getName()>
	//    8   16:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(": ");
	//   10   20:aload_1         
	//   11   21:ldc1            #182 <String ": ">
	//   12   23:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(getMessage());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #183 <Method String getMessage()>
	//   17   32:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		return stringbuilder.toString();
	//   19   36:aload_1         
	//   20   37:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   21   40:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected LinkedList _path;
	protected transient Closeable _processor;
}
