// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.*;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind:
//			DeserializationContext, SerializerProvider

public class JsonMappingException extends JsonProcessingException
{
	public static class Reference
		implements Serializable
	{

		public String getFieldName()
		{
			return _fieldName;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field String _fieldName>
		//    2    4:areturn         
		}

		public Object getFrom()
		{
			return _from;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field Object _from>
		//    2    4:areturn         
		}

		public int getIndex()
		{
			return _index;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field int _index>
		//    2    4:ireturn         
		}

		public void setFieldName(String s)
		{
			_fieldName = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #40  <Field String _fieldName>
		//    3    5:return          
		}

		public void setFrom(Object obj)
		{
			_from = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field Object _from>
		//    3    5:return          
		}

		public void setIndex(int i)
		{
			_index = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #25  <Field int _index>
		//    3    5:return          
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #53  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #54  <Method void StringBuilder()>
		//    3    7:astore_2        
			Class class1;
			String s;
			if(_from instanceof Class)
		//*   4    8:aload_0         
		//*   5    9:getfield        #29  <Field Object _from>
		//*   6   12:instanceof      #56  <Class Class>
		//*   7   15:ifeq            106
				class1 = (Class)_from;
		//    8   18:aload_0         
		//    9   19:getfield        #29  <Field Object _from>
		//   10   22:checkcast       #56  <Class Class>
		//   11   25:astore_1        
			else
		//*  12   26:aload_1         
		//*  13   27:invokestatic    #62  <Method String ClassUtil.getPackageName(Class)>
		//*  14   30:astore_3        
		//*  15   31:aload_3         
		//*  16   32:ifnull          48
		//*  17   35:aload_2         
		//*  18   36:aload_3         
		//*  19   37:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//*  20   40:pop             
		//*  21   41:aload_2         
		//*  22   42:bipush          46
		//*  23   44:invokevirtual   #69  <Method StringBuilder StringBuilder.append(char)>
		//*  24   47:pop             
		//*  25   48:aload_2         
		//*  26   49:aload_1         
		//*  27   50:invokevirtual   #72  <Method String Class.getSimpleName()>
		//*  28   53:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//*  29   56:pop             
		//*  30   57:aload_2         
		//*  31   58:bipush          91
		//*  32   60:invokevirtual   #69  <Method StringBuilder StringBuilder.append(char)>
		//*  33   63:pop             
		//*  34   64:aload_0         
		//*  35   65:getfield        #40  <Field String _fieldName>
		//*  36   68:ifnull          117
		//*  37   71:aload_2         
		//*  38   72:bipush          34
		//*  39   74:invokevirtual   #69  <Method StringBuilder StringBuilder.append(char)>
		//*  40   77:pop             
		//*  41   78:aload_2         
		//*  42   79:aload_0         
		//*  43   80:getfield        #40  <Field String _fieldName>
		//*  44   83:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//*  45   86:pop             
		//*  46   87:aload_2         
		//*  47   88:bipush          34
		//*  48   90:invokevirtual   #69  <Method StringBuilder StringBuilder.append(char)>
		//*  49   93:pop             
		//*  50   94:aload_2         
		//*  51   95:bipush          93
		//*  52   97:invokevirtual   #69  <Method StringBuilder StringBuilder.append(char)>
		//*  53  100:pop             
		//*  54  101:aload_2         
		//*  55  102:invokevirtual   #74  <Method String StringBuilder.toString()>
		//*  56  105:areturn         
				class1 = _from.getClass();
		//   57  106:aload_0         
		//   58  107:getfield        #29  <Field Object _from>
		//   59  110:invokevirtual   #78  <Method Class Object.getClass()>
		//   60  113:astore_1        
			s = ClassUtil.getPackageName(class1);
			if(s != null)
			{
				stringbuilder.append(s);
				stringbuilder.append('.');
			}
			stringbuilder.append(class1.getSimpleName());
			stringbuilder.append('[');
			if(_fieldName != null)
			{
				stringbuilder.append('"');
				stringbuilder.append(_fieldName);
				stringbuilder.append('"');
			} else
		//*  61  114:goto            26
			if(_index >= 0)
		//*  62  117:aload_0         
		//*  63  118:getfield        #25  <Field int _index>
		//*  64  121:iflt            136
				stringbuilder.append(_index);
		//   65  124:aload_2         
		//   66  125:aload_0         
		//   67  126:getfield        #25  <Field int _index>
		//   68  129:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
		//   69  132:pop             
			else
		//*  70  133:goto            94
				stringbuilder.append('?');
		//   71  136:aload_2         
		//   72  137:bipush          63
		//   73  139:invokevirtual   #69  <Method StringBuilder StringBuilder.append(char)>
		//   74  142:pop             
			stringbuilder.append(']');
			return stringbuilder.toString();
		//*  75  143:goto            94
		}

		private static final long serialVersionUID = 1L;
		protected String _fieldName;
		protected Object _from;
		protected int _index;

		protected Reference()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			_index = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #25  <Field int _index>
		//    5    9:return          
		}

		public Reference(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			_index = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #25  <Field int _index>
			_from = obj;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #29  <Field Object _from>
		//    8   14:return          
		}

		public Reference(Object obj, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			_index = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #25  <Field int _index>
			_from = obj;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #29  <Field Object _from>
			_index = i;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #25  <Field int _index>
		//   11   19:return          
		}

		public Reference(Object obj, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			_index = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #25  <Field int _index>
			_from = obj;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #29  <Field Object _from>
			if(s == null)
		//*   8   14:aload_2         
		//*   9   15:ifnonnull       28
			{
				throw new NullPointerException("Can not pass null fieldName");
		//   10   18:new             #33  <Class NullPointerException>
		//   11   21:dup             
		//   12   22:ldc1            #35  <String "Can not pass null fieldName">
		//   13   24:invokespecial   #38  <Method void NullPointerException(String)>
		//   14   27:athrow          
			} else
			{
				_fieldName = s;
		//   15   28:aload_0         
		//   16   29:aload_2         
		//   17   30:putfield        #40  <Field String _fieldName>
				return;
		//   18   33:return          
			}
		}
	}


	public JsonMappingException(Closeable closeable, String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #24  <Method void JsonProcessingException(String)>
		_processor = closeable;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #26  <Field Closeable _processor>
		if(closeable instanceof JsonParser)
	//*   6   10:aload_1         
	//*   7   11:instanceof      #28  <Class JsonParser>
	//*   8   14:ifeq            28
			_location = ((JsonParser)closeable).getTokenLocation();
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:checkcast       #28  <Class JsonParser>
	//   12   22:invokevirtual   #32  <Method JsonLocation JsonParser.getTokenLocation()>
	//   13   25:putfield        #36  <Field JsonLocation _location>
	//   14   28:return          
	}

	public JsonMappingException(Closeable closeable, String s, JsonLocation jsonlocation)
	{
		super(s, jsonlocation);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #41  <Method void JsonProcessingException(String, JsonLocation)>
		_processor = closeable;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #26  <Field Closeable _processor>
	//    7   11:return          
	}

	public JsonMappingException(Closeable closeable, String s, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #45  <Method void JsonProcessingException(String, Throwable)>
		_processor = closeable;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #26  <Field Closeable _processor>
		if(closeable instanceof JsonParser)
	//*   7   11:aload_1         
	//*   8   12:instanceof      #28  <Class JsonParser>
	//*   9   15:ifeq            29
			_location = ((JsonParser)closeable).getTokenLocation();
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:checkcast       #28  <Class JsonParser>
	//   13   23:invokevirtual   #32  <Method JsonLocation JsonParser.getTokenLocation()>
	//   14   26:putfield        #36  <Field JsonLocation _location>
	//   15   29:return          
	}

	public JsonMappingException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void JsonProcessingException(String)>
	//    3    5:return          
	}

	public JsonMappingException(String s, JsonLocation jsonlocation)
	{
		super(s, jsonlocation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #41  <Method void JsonProcessingException(String, JsonLocation)>
	//    4    6:return          
	}

	public JsonMappingException(String s, JsonLocation jsonlocation, Throwable throwable)
	{
		super(s, jsonlocation, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #50  <Method void JsonProcessingException(String, JsonLocation, Throwable)>
	//    5    7:return          
	}

	public JsonMappingException(String s, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #45  <Method void JsonProcessingException(String, Throwable)>
	//    4    6:return          
	}

	public static JsonMappingException from(JsonGenerator jsongenerator, String s)
	{
		return new JsonMappingException(((Closeable) (jsongenerator)), s, (Throwable)null);
	//    0    0:new             #2   <Class JsonMappingException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:checkcast       #54  <Class Throwable>
	//    6   10:invokespecial   #56  <Method void JsonMappingException(Closeable, String, Throwable)>
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
	//    5    7:invokespecial   #56  <Method void JsonMappingException(Closeable, String, Throwable)>
	//    6   10:areturn         
	}

	public static JsonMappingException from(JsonParser jsonparser, String s)
	{
		return new JsonMappingException(((Closeable) (jsonparser)), s);
	//    0    0:new             #2   <Class JsonMappingException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #60  <Method void JsonMappingException(Closeable, String)>
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
	//    5    7:invokespecial   #56  <Method void JsonMappingException(Closeable, String, Throwable)>
	//    6   10:areturn         
	}

	public static JsonMappingException from(DeserializationContext deserializationcontext, String s)
	{
		return new JsonMappingException(((Closeable) (deserializationcontext.getParser())), s);
	//    0    0:new             #2   <Class JsonMappingException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #68  <Method JsonParser DeserializationContext.getParser()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #60  <Method void JsonMappingException(Closeable, String)>
	//    6   12:areturn         
	}

	public static JsonMappingException from(DeserializationContext deserializationcontext, String s, Throwable throwable)
	{
		return new JsonMappingException(((Closeable) (deserializationcontext.getParser())), s, throwable);
	//    0    0:new             #2   <Class JsonMappingException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #68  <Method JsonParser DeserializationContext.getParser()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #56  <Method void JsonMappingException(Closeable, String, Throwable)>
	//    7   13:areturn         
	}

	public static JsonMappingException from(SerializerProvider serializerprovider, String s)
	{
		return new JsonMappingException(((Closeable) (null)), s);
	//    0    0:new             #2   <Class JsonMappingException>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_1         
	//    4    6:invokespecial   #60  <Method void JsonMappingException(Closeable, String)>
	//    5    9:areturn         
	}

	public static JsonMappingException from(SerializerProvider serializerprovider, String s, Throwable throwable)
	{
		return new JsonMappingException(((Closeable) (null)), s, throwable);
	//    0    0:new             #2   <Class JsonMappingException>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #56  <Method void JsonMappingException(Closeable, String, Throwable)>
	//    6   10:areturn         
	}

	public static JsonMappingException fromUnexpectedIOE(IOException ioexception)
	{
		return new JsonMappingException(((Closeable) (null)), String.format("Unexpected IOException (of type %s): %s", new Object[] {
			((Object) (ioexception)).getClass().getName(), ioexception.getMessage()
		}));
	//    0    0:new             #2   <Class JsonMappingException>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:ldc1            #75  <String "Unexpected IOException (of type %s): %s">
	//    4    7:iconst_2        
	//    5    8:anewarray       Object[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:aload_0         
	//    9   14:invokevirtual   #81  <Method Class Object.getClass()>
	//   10   17:invokevirtual   #87  <Method String Class.getName()>
	//   11   20:aastore         
	//   12   21:dup             
	//   13   22:iconst_1        
	//   14   23:aload_0         
	//   15   24:invokevirtual   #92  <Method String IOException.getMessage()>
	//   16   27:aastore         
	//   17   28:invokestatic    #98  <Method String String.format(String, Object[])>
	//   18   31:invokespecial   #60  <Method void JsonMappingException(Closeable, String)>
	//   19   34:areturn         
	}

	public static JsonMappingException wrapWithPath(Throwable throwable, Reference reference)
	{
		if(!(throwable instanceof JsonMappingException)) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:instanceof      #2   <Class JsonMappingException>
	//    2    4:ifeq            19
_L1:
		throwable = ((Throwable) ((JsonMappingException)throwable));
	//    3    7:aload_0         
	//    4    8:checkcast       #2   <Class JsonMappingException>
	//    5   11:astore_0        
_L4:
		((JsonMappingException) (throwable)).prependPath(reference);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #104 <Method void prependPath(JsonMappingException$Reference)>
		return ((JsonMappingException) (throwable));
	//    9   17:aload_0         
	//   10   18:areturn         
_L2:
		String s;
label0:
		{
			String s1 = throwable.getMessage();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #105 <Method String Throwable.getMessage()>
	//   13   23:astore_3        
			if(s1 != null)
	//*  14   24:aload_3         
	//*  15   25:ifnull          37
			{
				s = s1;
	//   16   28:aload_3         
	//   17   29:astore_2        
				if(s1.length() != 0)
					break label0;
	//   18   30:aload_3         
	//   19   31:invokevirtual   #109 <Method int String.length()>
	//   20   34:ifne            68
			}
			s = (new StringBuilder()).append("(was ").append(((Object) (throwable)).getClass().getName()).append(")").toString();
	//   21   37:new             #111 <Class StringBuilder>
	//   22   40:dup             
	//   23   41:invokespecial   #114 <Method void StringBuilder()>
	//   24   44:ldc1            #116 <String "(was ">
	//   25   46:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   26   49:aload_0         
	//   27   50:invokevirtual   #81  <Method Class Object.getClass()>
	//   28   53:invokevirtual   #87  <Method String Class.getName()>
	//   29   56:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   30   59:ldc1            #122 <String ")">
	//   31   61:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   32   64:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   33   67:astore_2        
		}
		Object obj = null;
	//   34   68:aconst_null     
	//   35   69:astore          4
		Closeable closeable = ((Closeable) (obj));
	//   36   71:aload           4
	//   37   73:astore_3        
		if(throwable instanceof JsonProcessingException)
	//*  38   74:aload_0         
	//*  39   75:instanceof      #4   <Class JsonProcessingException>
	//*  40   78:ifeq            107
		{
			Object obj1 = ((JsonProcessingException)throwable).getProcessor();
	//   41   81:aload_0         
	//   42   82:checkcast       #4   <Class JsonProcessingException>
	//   43   85:invokevirtual   #129 <Method Object JsonProcessingException.getProcessor()>
	//   44   88:astore          5
			closeable = ((Closeable) (obj));
	//   45   90:aload           4
	//   46   92:astore_3        
			if(obj1 instanceof Closeable)
	//*  47   93:aload           5
	//*  48   95:instanceof      #131 <Class Closeable>
	//*  49   98:ifeq            107
				closeable = (Closeable)obj1;
	//   50  101:aload           5
	//   51  103:checkcast       #131 <Class Closeable>
	//   52  106:astore_3        
		}
		throwable = ((Throwable) (new JsonMappingException(closeable, s, throwable)));
	//   53  107:new             #2   <Class JsonMappingException>
	//   54  110:dup             
	//   55  111:aload_3         
	//   56  112:aload_2         
	//   57  113:aload_0         
	//   58  114:invokespecial   #56  <Method void JsonMappingException(Closeable, String, Throwable)>
	//   59  117:astore_0        
		if(true) goto _L4; else goto _L3
	//   60  118:goto            12
_L3:
	}

	public static JsonMappingException wrapWithPath(Throwable throwable, Object obj, int i)
	{
		return wrapWithPath(throwable, new Reference(obj, i));
	//    0    0:aload_0         
	//    1    1:new             #6   <Class JsonMappingException$Reference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #135 <Method void JsonMappingException$Reference(Object, int)>
	//    6   10:invokestatic    #137 <Method JsonMappingException wrapWithPath(Throwable, JsonMappingException$Reference)>
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
	//    5    7:invokespecial   #141 <Method void JsonMappingException$Reference(Object, String)>
	//    6   10:invokestatic    #137 <Method JsonMappingException wrapWithPath(Throwable, JsonMappingException$Reference)>
	//    7   13:areturn         
	}

	protected void _appendPathDesc(StringBuilder stringbuilder)
	{
		if(_path != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field LinkedList _path>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
		{
			Iterator iterator = _path.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #145 <Field LinkedList _path>
	//    6   12:invokevirtual   #151 <Method Iterator LinkedList.iterator()>
	//    7   15:astore_2        
			while(iterator.hasNext()) 
	//*   8   16:aload_2         
	//*   9   17:invokeinterface #157 <Method boolean Iterator.hasNext()>
	//*  10   22:ifeq            7
			{
				stringbuilder.append(((Reference)iterator.next()).toString());
	//   11   25:aload_1         
	//   12   26:aload_2         
	//   13   27:invokeinterface #160 <Method Object Iterator.next()>
	//   14   32:checkcast       #6   <Class JsonMappingException$Reference>
	//   15   35:invokevirtual   #161 <Method String JsonMappingException$Reference.toString()>
	//   16   38:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:pop             
				if(iterator.hasNext())
	//*  18   42:aload_2         
	//*  19   43:invokeinterface #157 <Method boolean Iterator.hasNext()>
	//*  20   48:ifeq            16
					stringbuilder.append("->");
	//   21   51:aload_1         
	//   22   52:ldc1            #163 <String "->">
	//   23   54:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   24   57:pop             
			}
		}
	//*  25   58:goto            16
	}

	protected String _buildMessage()
	{
		Object obj = ((Object) (super.getMessage()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #165 <Method String JsonProcessingException.getMessage()>
	//    2    4:astore_1        
		if(_path == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #145 <Field LinkedList _path>
	//*   5    9:ifnonnull       14
			return ((String) (obj));
	//    6   12:aload_1         
	//    7   13:areturn         
		if(obj == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       51
			obj = ((Object) (new StringBuilder()));
	//   10   18:new             #111 <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #114 <Method void StringBuilder()>
	//   13   25:astore_1        
		else
	//*  14   26:aload_1         
	//*  15   27:ldc1            #167 <String " (through reference chain: ">
	//*  16   29:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//*  17   32:pop             
	//*  18   33:aload_0         
	//*  19   34:aload_1         
	//*  20   35:invokevirtual   #171 <Method StringBuilder getPathReference(StringBuilder)>
	//*  21   38:astore_1        
	//*  22   39:aload_1         
	//*  23   40:bipush          41
	//*  24   42:invokevirtual   #174 <Method StringBuilder StringBuilder.append(char)>
	//*  25   45:pop             
	//*  26   46:aload_1         
	//*  27   47:invokevirtual   #125 <Method String StringBuilder.toString()>
	//*  28   50:areturn         
			obj = ((Object) (new StringBuilder(((String) (obj)))));
	//   29   51:new             #111 <Class StringBuilder>
	//   30   54:dup             
	//   31   55:aload_1         
	//   32   56:invokespecial   #175 <Method void StringBuilder(String)>
	//   33   59:astore_1        
		((StringBuilder) (obj)).append(" (through reference chain: ");
		obj = ((Object) (getPathReference(((StringBuilder) (obj)))));
		((StringBuilder) (obj)).append(')');
		return ((StringBuilder) (obj)).toString();
	//*  34   60:goto            26
	}

	public String getLocalizedMessage()
	{
		return _buildMessage();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #178 <Method String _buildMessage()>
	//    2    4:areturn         
	}

	public String getMessage()
	{
		return _buildMessage();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #178 <Method String _buildMessage()>
	//    2    4:areturn         
	}

	public List getPath()
	{
		if(_path == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field LinkedList _path>
	//*   2    4:ifnonnull       11
			return Collections.emptyList();
	//    3    7:invokestatic    #185 <Method List Collections.emptyList()>
	//    4   10:areturn         
		else
			return Collections.unmodifiableList(((List) (_path)));
	//    5   11:aload_0         
	//    6   12:getfield        #145 <Field LinkedList _path>
	//    7   15:invokestatic    #189 <Method List Collections.unmodifiableList(List)>
	//    8   18:areturn         
	}

	public String getPathReference()
	{
		return getPathReference(new StringBuilder()).toString();
	//    0    0:aload_0         
	//    1    1:new             #111 <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #114 <Method void StringBuilder()>
	//    4    8:invokevirtual   #171 <Method StringBuilder getPathReference(StringBuilder)>
	//    5   11:invokevirtual   #125 <Method String StringBuilder.toString()>
	//    6   14:areturn         
	}

	public StringBuilder getPathReference(StringBuilder stringbuilder)
	{
		_appendPathDesc(stringbuilder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #193 <Method void _appendPathDesc(StringBuilder)>
		return stringbuilder;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public void prependPath(Reference reference)
	{
		if(_path == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field LinkedList _path>
	//*   2    4:ifnonnull       18
			_path = new LinkedList();
	//    3    7:aload_0         
	//    4    8:new             #147 <Class LinkedList>
	//    5   11:dup             
	//    6   12:invokespecial   #194 <Method void LinkedList()>
	//    7   15:putfield        #145 <Field LinkedList _path>
		if(_path.size() < 1000)
	//*   8   18:aload_0         
	//*   9   19:getfield        #145 <Field LinkedList _path>
	//*  10   22:invokevirtual   #197 <Method int LinkedList.size()>
	//*  11   25:sipush          1000
	//*  12   28:icmpge          39
			_path.addFirst(((Object) (reference)));
	//   13   31:aload_0         
	//   14   32:getfield        #145 <Field LinkedList _path>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #201 <Method void LinkedList.addFirst(Object)>
	//   17   39:return          
	}

	public void prependPath(Object obj, int i)
	{
		prependPath(new Reference(obj, i));
	//    0    0:aload_0         
	//    1    1:new             #6   <Class JsonMappingException$Reference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #135 <Method void JsonMappingException$Reference(Object, int)>
	//    6   10:invokevirtual   #104 <Method void prependPath(JsonMappingException$Reference)>
	//    7   13:return          
	}

	public void prependPath(Object obj, String s)
	{
		prependPath(new Reference(obj, s));
	//    0    0:aload_0         
	//    1    1:new             #6   <Class JsonMappingException$Reference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #141 <Method void JsonMappingException$Reference(Object, String)>
	//    6   10:invokevirtual   #104 <Method void prependPath(JsonMappingException$Reference)>
	//    7   13:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getName()).append(": ").append(getMessage()).toString();
	//    0    0:new             #111 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #81  <Method Class Object.getClass()>
	//    5   11:invokevirtual   #87  <Method String Class.getName()>
	//    6   14:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #203 <String ": ">
	//    8   19:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:invokevirtual   #204 <Method String getMessage()>
	//   11   26:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   12   29:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   13   32:areturn         
	}

	static final int MAX_REFS_TO_LIST = 1000;
	private static final long serialVersionUID = 1L;
	protected LinkedList _path;
	protected Closeable _processor;
}
