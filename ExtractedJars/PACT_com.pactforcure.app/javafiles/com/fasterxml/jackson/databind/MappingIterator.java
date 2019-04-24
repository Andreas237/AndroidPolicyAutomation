// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import java.io.Closeable;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind:
//			RuntimeJsonMappingException, JsonMappingException, JsonDeserializer, DeserializationContext, 
//			JavaType

public class MappingIterator
	implements Iterator, Closeable
{

	protected MappingIterator(JavaType javatype, JsonParser jsonparser, DeserializationContext deserializationcontext, JsonDeserializer jsondeserializer, boolean flag, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		_type = javatype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #51  <Field JavaType _type>
		_parser = jsonparser;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #53  <Field JsonParser _parser>
		_context = deserializationcontext;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #55  <Field DeserializationContext _context>
		_deserializer = jsondeserializer;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #57  <Field JsonDeserializer _deserializer>
		_closeParser = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #59  <Field boolean _closeParser>
		if(obj == null)
	//*  17   31:aload           6
	//*  18   33:ifnonnull       56
			_updatedValue = null;
	//   19   36:aload_0         
	//   20   37:aconst_null     
	//   21   38:putfield        #61  <Field Object _updatedValue>
		else
	//*  22   41:aload_2         
	//*  23   42:ifnonnull       65
	//*  24   45:aload_0         
	//*  25   46:aconst_null     
	//*  26   47:putfield        #63  <Field JsonStreamContext _seqContext>
	//*  27   50:aload_0         
	//*  28   51:iconst_0        
	//*  29   52:putfield        #65  <Field int _state>
	//*  30   55:return          
			_updatedValue = obj;
	//   31   56:aload_0         
	//   32   57:aload           6
	//   33   59:putfield        #61  <Field Object _updatedValue>
		if(jsonparser == null)
		{
			_seqContext = null;
			_state = 0;
			return;
		}
	//*  34   62:goto            41
		deserializationcontext = ((DeserializationContext) (jsonparser.getParsingContext()));
	//   35   65:aload_2         
	//   36   66:invokevirtual   #71  <Method JsonStreamContext JsonParser.getParsingContext()>
	//   37   69:astore_3        
		if(!flag || !jsonparser.isExpectedStartArrayToken()) goto _L2; else goto _L1
	//   38   70:iload           5
	//   39   72:ifeq            99
	//   40   75:aload_2         
	//   41   76:invokevirtual   #75  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//   42   79:ifeq            99
_L1:
		jsonparser.clearCurrentToken();
	//   43   82:aload_2         
	//   44   83:invokevirtual   #78  <Method void JsonParser.clearCurrentToken()>
		javatype = ((JavaType) (deserializationcontext));
	//   45   86:aload_3         
	//   46   87:astore_1        
_L4:
		_seqContext = ((JsonStreamContext) (javatype));
	//   47   88:aload_0         
	//   48   89:aload_1         
	//   49   90:putfield        #63  <Field JsonStreamContext _seqContext>
		_state = 2;
	//   50   93:aload_0         
	//   51   94:iconst_2        
	//   52   95:putfield        #65  <Field int _state>
		return;
	//   53   98:return          
_L2:
		jsonparser = ((JsonParser) (jsonparser.getCurrentToken()));
	//   54   99:aload_2         
	//   55  100:invokevirtual   #82  <Method JsonToken JsonParser.getCurrentToken()>
	//   56  103:astore_2        
		if(jsonparser != JsonToken.START_OBJECT)
	//*  57  104:aload_2         
	//*  58  105:getstatic       #88  <Field JsonToken JsonToken.START_OBJECT>
	//*  59  108:if_acmpeq       120
		{
			javatype = ((JavaType) (deserializationcontext));
	//   60  111:aload_3         
	//   61  112:astore_1        
			if(jsonparser != JsonToken.START_ARRAY)
				continue; /* Loop/switch isn't completed */
	//   62  113:aload_2         
	//   63  114:getstatic       #91  <Field JsonToken JsonToken.START_ARRAY>
	//   64  117:if_acmpne       88
		}
		javatype = ((JavaType) (((JsonStreamContext) (deserializationcontext)).getParent()));
	//   65  120:aload_3         
	//   66  121:invokevirtual   #96  <Method JsonStreamContext JsonStreamContext.getParent()>
	//   67  124:astore_1        
		if(true) goto _L4; else goto _L3
	//   68  125:goto            88
_L3:
	}

	protected static MappingIterator emptyIterator()
	{
		return EMPTY_ITERATOR;
	//    0    0:getstatic       #46  <Field MappingIterator EMPTY_ITERATOR>
	//    1    3:areturn         
	}

	protected Object _handleIOException(IOException ioexception)
	{
		throw new RuntimeException(ioexception.getMessage(), ((Throwable) (ioexception)));
	//    0    0:new             #105 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #111 <Method String IOException.getMessage()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #114 <Method void RuntimeException(String, Throwable)>
	//    6   12:athrow          
	}

	protected Object _handleMappingException(JsonMappingException jsonmappingexception)
	{
		throw new RuntimeJsonMappingException(jsonmappingexception.getMessage(), jsonmappingexception);
	//    0    0:new             #119 <Class RuntimeJsonMappingException>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #122 <Method String JsonMappingException.getMessage()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #125 <Method void RuntimeJsonMappingException(String, JsonMappingException)>
	//    6   12:athrow          
	}

	protected void _resync()
		throws IOException
	{
		JsonParser jsonparser = _parser;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field JsonParser _parser>
	//    2    4:astore_1        
		if(jsonparser.getParsingContext() == _seqContext)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #71  <Method JsonStreamContext JsonParser.getParsingContext()>
	//*   5    9:aload_0         
	//*   6   10:getfield        #63  <Field JsonStreamContext _seqContext>
	//*   7   13:if_acmpne       36
			return;
	//    8   16:return          
		JsonToken jsontoken;
		do
			while((jsontoken = jsonparser.nextToken()) != JsonToken.END_ARRAY && jsontoken != JsonToken.END_OBJECT) 
				if(jsontoken == JsonToken.START_ARRAY || jsontoken == JsonToken.START_OBJECT)
	//*   9   17:aload_2         
	//*  10   18:getstatic       #91  <Field JsonToken JsonToken.START_ARRAY>
	//*  11   21:if_acmpeq       31
	//*  12   24:aload_2         
	//*  13   25:getstatic       #88  <Field JsonToken JsonToken.START_OBJECT>
	//*  14   28:if_acmpne       71
					jsonparser.skipChildren();
	//   15   31:aload_1         
	//   16   32:invokevirtual   #131 <Method JsonParser JsonParser.skipChildren()>
	//   17   35:pop             
				else
	//*  18   36:aload_1         
	//*  19   37:invokevirtual   #134 <Method JsonToken JsonParser.nextToken()>
	//*  20   40:astore_2        
	//*  21   41:aload_2         
	//*  22   42:getstatic       #137 <Field JsonToken JsonToken.END_ARRAY>
	//*  23   45:if_acmpeq       55
	//*  24   48:aload_2         
	//*  25   49:getstatic       #140 <Field JsonToken JsonToken.END_OBJECT>
	//*  26   52:if_acmpne       17
	//*  27   55:aload_1         
	//*  28   56:invokevirtual   #71  <Method JsonStreamContext JsonParser.getParsingContext()>
	//*  29   59:aload_0         
	//*  30   60:getfield        #63  <Field JsonStreamContext _seqContext>
	//*  31   63:if_acmpne       36
	//*  32   66:aload_1         
	//*  33   67:invokevirtual   #78  <Method void JsonParser.clearCurrentToken()>
	//*  34   70:return          
				if(jsontoken == null)
	//*  35   71:aload_2         
	//*  36   72:ifnonnull       36
					return;
	//   37   75:return          
		while(jsonparser.getParsingContext() != _seqContext);
		jsonparser.clearCurrentToken();
	}

	protected Object _throwNoSuchElement()
	{
		throw new NoSuchElementException();
	//    0    0:new             #145 <Class NoSuchElementException>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void NoSuchElementException()>
	//    3    7:athrow          
	}

	public void close()
		throws IOException
	{
		if(_state != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field int _state>
	//*   2    4:ifeq            26
		{
			_state = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #65  <Field int _state>
			if(_parser != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #53  <Field JsonParser _parser>
	//*   8   16:ifnull          26
				_parser.close();
	//    9   19:aload_0         
	//   10   20:getfield        #53  <Field JsonParser _parser>
	//   11   23:invokevirtual   #150 <Method void JsonParser.close()>
		}
	//   12   26:return          
	}

	public JsonLocation getCurrentLocation()
	{
		return _parser.getCurrentLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field JsonParser _parser>
	//    2    4:invokevirtual   #154 <Method JsonLocation JsonParser.getCurrentLocation()>
	//    3    7:areturn         
	}

	public JsonParser getParser()
	{
		return _parser;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field JsonParser _parser>
	//    2    4:areturn         
	}

	public FormatSchema getParserSchema()
	{
		return _parser.getSchema();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field JsonParser _parser>
	//    2    4:invokevirtual   #160 <Method FormatSchema JsonParser.getSchema()>
	//    3    7:areturn         
	}

	public boolean hasNext()
	{
		boolean flag;
		try
		{
			flag = hasNextValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #164 <Method boolean hasNextValue()>
	//    2    4:istore_1        
		}
	//*   3    5:iload_1         
	//*   4    6:ireturn         
		catch(JsonMappingException jsonmappingexception)
	//*   5    7:astore_2        
		{
			return ((Boolean)_handleMappingException(jsonmappingexception)).booleanValue();
	//    6    8:aload_0         
	//    7    9:aload_2         
	//    8   10:invokevirtual   #166 <Method Object _handleMappingException(JsonMappingException)>
	//    9   13:checkcast       #168 <Class Boolean>
	//   10   16:invokevirtual   #171 <Method boolean Boolean.booleanValue()>
	//   11   19:ireturn         
		}
		catch(IOException ioexception)
	//*  12   20:astore_2        
		{
			return ((Boolean)_handleIOException(ioexception)).booleanValue();
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #173 <Method Object _handleIOException(IOException)>
	//   16   26:checkcast       #168 <Class Boolean>
	//   17   29:invokevirtual   #171 <Method boolean Boolean.booleanValue()>
	//   18   32:ireturn         
		}
		return flag;
	}

	public boolean hasNextValue()
		throws IOException
	{
		boolean flag;
		boolean flag1;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		flag = flag1;
	//    2    2:iload_2         
	//    3    3:istore_1        
		_state;
	//    4    4:aload_0         
	//    5    5:getfield        #65  <Field int _state>
		JVM INSTR tableswitch 0 2: default 36
	//	               0 38
	//	               1 40
	//	               2 44;
	//    6    8:tableswitch     0 2: default 36
	//	               0 38
	//	               1 40
	//	               2 44
		   goto _L1 _L2 _L3 _L4
_L2:
		break MISSING_BLOCK_LABEL_38;
_L1:
		flag = true;
	//    7   36:iconst_1        
	//    8   37:istore_1        
_L6:
		return flag;
	//    9   38:iload_1         
	//   10   39:ireturn         
_L3:
		_resync();
	//   11   40:aload_0         
	//   12   41:invokevirtual   #175 <Method void _resync()>
_L4:
		if(_parser.getCurrentToken() != null)
			break; /* Loop/switch isn't completed */
	//   13   44:aload_0         
	//   14   45:getfield        #53  <Field JsonParser _parser>
	//   15   48:invokevirtual   #82  <Method JsonToken JsonParser.getCurrentToken()>
	//   16   51:ifnonnull       105
		JsonToken jsontoken = _parser.nextToken();
	//   17   54:aload_0         
	//   18   55:getfield        #53  <Field JsonParser _parser>
	//   19   58:invokevirtual   #134 <Method JsonToken JsonParser.nextToken()>
	//   20   61:astore_3        
		if(jsontoken != null && jsontoken != JsonToken.END_ARRAY)
			break; /* Loop/switch isn't completed */
	//   21   62:aload_3         
	//   22   63:ifnull          73
	//   23   66:aload_3         
	//   24   67:getstatic       #137 <Field JsonToken JsonToken.END_ARRAY>
	//   25   70:if_acmpne       105
		_state = 0;
	//   26   73:aload_0         
	//   27   74:iconst_0        
	//   28   75:putfield        #65  <Field int _state>
		flag = flag1;
	//   29   78:iload_2         
	//   30   79:istore_1        
		if(_closeParser)
	//*  31   80:aload_0         
	//*  32   81:getfield        #59  <Field boolean _closeParser>
	//*  33   84:ifeq            38
		{
			flag = flag1;
	//   34   87:iload_2         
	//   35   88:istore_1        
			if(_parser != null)
	//*  36   89:aload_0         
	//*  37   90:getfield        #53  <Field JsonParser _parser>
	//*  38   93:ifnull          38
			{
				_parser.close();
	//   39   96:aload_0         
	//   40   97:getfield        #53  <Field JsonParser _parser>
	//   41  100:invokevirtual   #150 <Method void JsonParser.close()>
				return false;
	//   42  103:iconst_0        
	//   43  104:ireturn         
			}
		}
		if(true) goto _L6; else goto _L5
_L5:
		_state = 3;
	//   44  105:aload_0         
	//   45  106:iconst_3        
	//   46  107:putfield        #65  <Field int _state>
		return true;
	//   47  110:iconst_1        
	//   48  111:ireturn         
	}

	public Object next()
	{
		Object obj;
		try
		{
			obj = nextValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #179 <Method Object nextValue()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(JsonMappingException jsonmappingexception)
	//*   5    7:astore_1        
		{
			throw new RuntimeJsonMappingException(jsonmappingexception.getMessage(), jsonmappingexception);
	//    6    8:new             #119 <Class RuntimeJsonMappingException>
	//    7   11:dup             
	//    8   12:aload_1         
	//    9   13:invokevirtual   #122 <Method String JsonMappingException.getMessage()>
	//   10   16:aload_1         
	//   11   17:invokespecial   #125 <Method void RuntimeJsonMappingException(String, JsonMappingException)>
	//   12   20:athrow          
		}
		catch(IOException ioexception)
	//*  13   21:astore_1        
		{
			throw new RuntimeException(ioexception.getMessage(), ((Throwable) (ioexception)));
	//   14   22:new             #105 <Class RuntimeException>
	//   15   25:dup             
	//   16   26:aload_1         
	//   17   27:invokevirtual   #111 <Method String IOException.getMessage()>
	//   18   30:aload_1         
	//   19   31:invokespecial   #114 <Method void RuntimeException(String, Throwable)>
	//   20   34:athrow          
		}
		return obj;
	}

	public Object nextValue()
		throws IOException
	{
		_state;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int _state>
		JVM INSTR tableswitch 0 2: default 32
	//	               0 69
	//	               1 74
	//	               2 74;
	//    2    4:tableswitch     0 2: default 32
	//	               0 69
	//	               1 74
	//	               2 74
		   goto _L1 _L2 _L3 _L3
_L1:
		if(_updatedValue != null) goto _L5; else goto _L4
	//    3   32:aload_0         
	//    4   33:getfield        #61  <Field Object _updatedValue>
	//    5   36:ifnonnull       86
_L4:
		Object obj = _deserializer.deserialize(_parser, _context);
	//    6   39:aload_0         
	//    7   40:getfield        #57  <Field JsonDeserializer _deserializer>
	//    8   43:aload_0         
	//    9   44:getfield        #53  <Field JsonParser _parser>
	//   10   47:aload_0         
	//   11   48:getfield        #55  <Field DeserializationContext _context>
	//   12   51:invokevirtual   #186 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   13   54:astore_1        
_L7:
		_state = 2;
	//   14   55:aload_0         
	//   15   56:iconst_2        
	//   16   57:putfield        #65  <Field int _state>
		_parser.clearCurrentToken();
	//   17   60:aload_0         
	//   18   61:getfield        #53  <Field JsonParser _parser>
	//   19   64:invokevirtual   #78  <Method void JsonParser.clearCurrentToken()>
		return obj;
	//   20   67:aload_1         
	//   21   68:areturn         
_L2:
		return _throwNoSuchElement();
	//   22   69:aload_0         
	//   23   70:invokevirtual   #188 <Method Object _throwNoSuchElement()>
	//   24   73:areturn         
_L3:
		if(hasNextValue()) goto _L1; else goto _L6
	//   25   74:aload_0         
	//   26   75:invokevirtual   #164 <Method boolean hasNextValue()>
	//   27   78:ifne            32
_L6:
		return _throwNoSuchElement();
	//   28   81:aload_0         
	//   29   82:invokevirtual   #188 <Method Object _throwNoSuchElement()>
	//   30   85:areturn         
_L5:
		_deserializer.deserialize(_parser, _context, _updatedValue);
	//   31   86:aload_0         
	//   32   87:getfield        #57  <Field JsonDeserializer _deserializer>
	//   33   90:aload_0         
	//   34   91:getfield        #53  <Field JsonParser _parser>
	//   35   94:aload_0         
	//   36   95:getfield        #55  <Field DeserializationContext _context>
	//   37   98:aload_0         
	//   38   99:getfield        #61  <Field Object _updatedValue>
	//   39  102:invokevirtual   #191 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//   40  105:pop             
		obj = _updatedValue;
	//   41  106:aload_0         
	//   42  107:getfield        #61  <Field Object _updatedValue>
	//   43  110:astore_1        
		  goto _L7
	//*  44  111:goto            55
		Exception exception;
		exception;
	//   45  114:astore_1        
		_state = 1;
	//   46  115:aload_0         
	//   47  116:iconst_1        
	//   48  117:putfield        #65  <Field int _state>
		_parser.clearCurrentToken();
	//   49  120:aload_0         
	//   50  121:getfield        #53  <Field JsonParser _parser>
	//   51  124:invokevirtual   #78  <Method void JsonParser.clearCurrentToken()>
		throw exception;
	//   52  127:aload_1         
	//   53  128:athrow          
	}

	public Collection readAll(Collection collection)
		throws IOException
	{
		for(; hasNextValue(); collection.add(nextValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #164 <Method boolean hasNextValue()>
	//    2    4:ifeq            21
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #179 <Method Object nextValue()>
	//    6   12:invokeinterface #199 <Method boolean Collection.add(Object)>
	//    7   17:pop             
	//*   8   18:goto            0
		return collection;
	//    9   21:aload_1         
	//   10   22:areturn         
	}

	public List readAll()
		throws IOException
	{
		return readAll(((List) (new ArrayList())));
	//    0    0:aload_0         
	//    1    1:new             #203 <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #204 <Method void ArrayList()>
	//    4    8:invokevirtual   #207 <Method List readAll(List)>
	//    5   11:areturn         
	}

	public List readAll(List list)
		throws IOException
	{
		for(; hasNextValue(); list.add(nextValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #164 <Method boolean hasNextValue()>
	//    2    4:ifeq            21
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #179 <Method Object nextValue()>
	//    6   12:invokeinterface #211 <Method boolean List.add(Object)>
	//    7   17:pop             
	//*   8   18:goto            0
		return list;
	//    9   21:aload_1         
	//   10   22:areturn         
	}

	public void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #215 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #216 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	protected static final MappingIterator EMPTY_ITERATOR = new MappingIterator(((JavaType) (null)), ((JsonParser) (null)), ((DeserializationContext) (null)), ((JsonDeserializer) (null)), false, ((Object) (null)));
	protected static final int STATE_CLOSED = 0;
	protected static final int STATE_HAS_VALUE = 3;
	protected static final int STATE_MAY_HAVE_VALUE = 2;
	protected static final int STATE_NEED_RESYNC = 1;
	protected final boolean _closeParser;
	protected final DeserializationContext _context;
	protected final JsonDeserializer _deserializer;
	protected final JsonParser _parser;
	protected final JsonStreamContext _seqContext;
	protected int _state;
	protected final JavaType _type;
	protected final Object _updatedValue;

	static 
	{
	//    0    0:new             #2   <Class MappingIterator>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:iconst_0        
	//    7    9:aconst_null     
	//    8   10:invokespecial   #44  <Method void MappingIterator(JavaType, JsonParser, DeserializationContext, JsonDeserializer, boolean, Object)>
	//    9   13:putstatic       #46  <Field MappingIterator EMPTY_ITERATOR>
	//*  10   16:return          
	}
}
