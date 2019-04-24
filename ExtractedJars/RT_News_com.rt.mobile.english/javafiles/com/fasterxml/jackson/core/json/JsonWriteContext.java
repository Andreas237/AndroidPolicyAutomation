// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;

// Referenced classes of package com.fasterxml.jackson.core.json:
//			DupDetector

public class JsonWriteContext extends JsonStreamContext
{

	protected JsonWriteContext(int i, JsonWriteContext jsonwritecontext, DupDetector dupdetector)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void JsonStreamContext()>
		_type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #36  <Field int _type>
		_parent = jsonwritecontext;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field JsonWriteContext _parent>
		_dups = dupdetector;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #40  <Field DupDetector _dups>
		_index = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #43  <Field int _index>
	//   14   24:return          
	}

	private final void _checkDup(DupDetector dupdetector, String s)
		throws JsonProcessingException
	{
		if(dupdetector.isDup(s))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #54  <Method boolean DupDetector.isDup(String)>
	//*   3    5:ifeq            73
		{
			dupdetector = ((DupDetector) (dupdetector.getSource()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #58  <Method Object DupDetector.getSource()>
	//    6   12:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   13:new             #60  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #61  <Method void StringBuilder()>
	//   10   20:astore_3        
			stringbuilder.append("Duplicate field '");
	//   11   21:aload_3         
	//   12   22:ldc1            #63  <String "Duplicate field '">
	//   13   24:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			stringbuilder.append(s);
	//   15   28:aload_3         
	//   16   29:aload_2         
	//   17   30:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			stringbuilder.append("'");
	//   19   34:aload_3         
	//   20   35:ldc1            #69  <String "'">
	//   21   37:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			s = stringbuilder.toString();
	//   23   41:aload_3         
	//   24   42:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   25   45:astore_2        
			if(dupdetector instanceof JsonGenerator)
	//*  26   46:aload_1         
	//*  27   47:instanceof      #75  <Class JsonGenerator>
	//*  28   50:ifeq            61
				dupdetector = ((DupDetector) ((JsonGenerator)dupdetector));
	//   29   53:aload_1         
	//   30   54:checkcast       #75  <Class JsonGenerator>
	//   31   57:astore_1        
			else
	//*  32   58:goto            63
				dupdetector = null;
	//   33   61:aconst_null     
	//   34   62:astore_1        
			throw new JsonGenerationException(s, ((JsonGenerator) (dupdetector)));
	//   35   63:new             #77  <Class JsonGenerationException>
	//   36   66:dup             
	//   37   67:aload_2         
	//   38   68:aload_1         
	//   39   69:invokespecial   #80  <Method void JsonGenerationException(String, JsonGenerator)>
	//   40   72:athrow          
		} else
		{
			return;
	//   41   73:return          
		}
	}

	public static JsonWriteContext createRootContext()
	{
		return createRootContext(((DupDetector) (null)));
	//    0    0:aconst_null     
	//    1    1:invokestatic    #87  <Method JsonWriteContext createRootContext(DupDetector)>
	//    2    4:areturn         
	}

	public static JsonWriteContext createRootContext(DupDetector dupdetector)
	{
		return new JsonWriteContext(0, ((JsonWriteContext) (null)), dupdetector);
	//    0    0:new             #2   <Class JsonWriteContext>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:aconst_null     
	//    4    6:aload_0         
	//    5    7:invokespecial   #90  <Method void JsonWriteContext(int, JsonWriteContext, DupDetector)>
	//    6   10:areturn         
	}

	protected void appendDesc(StringBuilder stringbuilder)
	{
		if(_type == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field int _type>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          63
		{
			stringbuilder.append('{');
	//    4    8:aload_1         
	//    5    9:bipush          123
	//    6   11:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//    7   14:pop             
			if(_currentName != null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #97  <Field String _currentName>
	//*  10   19:ifnull          48
			{
				stringbuilder.append('"');
	//   11   22:aload_1         
	//   12   23:bipush          34
	//   13   25:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//   14   28:pop             
				stringbuilder.append(_currentName);
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:getfield        #97  <Field String _currentName>
	//   18   34:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
				stringbuilder.append('"');
	//   20   38:aload_1         
	//   21   39:bipush          34
	//   22   41:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//   23   44:pop             
			} else
	//*  24   45:goto            55
			{
				stringbuilder.append('?');
	//   25   48:aload_1         
	//   26   49:bipush          63
	//   27   51:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//   28   54:pop             
			}
			stringbuilder.append('}');
	//   29   55:aload_1         
	//   30   56:bipush          125
	//   31   58:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//   32   61:pop             
			return;
	//   33   62:return          
		}
		if(_type == 1)
	//*  34   63:aload_0         
	//*  35   64:getfield        #36  <Field int _type>
	//*  36   67:iconst_1        
	//*  37   68:icmpne          95
		{
			stringbuilder.append('[');
	//   38   71:aload_1         
	//   39   72:bipush          91
	//   40   74:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//   41   77:pop             
			stringbuilder.append(getCurrentIndex());
	//   42   78:aload_1         
	//   43   79:aload_0         
	//   44   80:invokevirtual   #101 <Method int getCurrentIndex()>
	//   45   83:invokevirtual   #104 <Method StringBuilder StringBuilder.append(int)>
	//   46   86:pop             
			stringbuilder.append(']');
	//   47   87:aload_1         
	//   48   88:bipush          93
	//   49   90:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//   50   93:pop             
			return;
	//   51   94:return          
		} else
		{
			stringbuilder.append("/");
	//   52   95:aload_1         
	//   53   96:ldc1            #106 <String "/">
	//   54   98:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   55  101:pop             
			return;
	//   56  102:return          
		}
	}

	public JsonWriteContext clearAndGetParent()
	{
		_currentValue = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #109 <Field Object _currentValue>
		return _parent;
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field JsonWriteContext _parent>
	//    5    9:areturn         
	}

	public JsonWriteContext createChildArrayContext()
	{
		Object obj = ((Object) (_child));
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field JsonWriteContext _child>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       47
		{
			if(_dups == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #40  <Field DupDetector _dups>
	//*   7   13:ifnonnull       21
				obj = null;
	//    8   16:aconst_null     
	//    9   17:astore_1        
			else
	//*  10   18:goto            29
				obj = ((Object) (_dups.child()));
	//   11   21:aload_0         
	//   12   22:getfield        #40  <Field DupDetector _dups>
	//   13   25:invokevirtual   #116 <Method DupDetector DupDetector.child()>
	//   14   28:astore_1        
			obj = ((Object) (new JsonWriteContext(1, this, ((DupDetector) (obj)))));
	//   15   29:new             #2   <Class JsonWriteContext>
	//   16   32:dup             
	//   17   33:iconst_1        
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokespecial   #90  <Method void JsonWriteContext(int, JsonWriteContext, DupDetector)>
	//   21   39:astore_1        
			_child = ((JsonWriteContext) (obj));
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:putfield        #112 <Field JsonWriteContext _child>
			return ((JsonWriteContext) (obj));
	//   25   45:aload_1         
	//   26   46:areturn         
		} else
		{
			return ((JsonWriteContext) (obj)).reset(1);
	//   27   47:aload_1         
	//   28   48:iconst_1        
	//   29   49:invokevirtual   #120 <Method JsonWriteContext reset(int)>
	//   30   52:areturn         
		}
	}

	public JsonWriteContext createChildObjectContext()
	{
		Object obj = ((Object) (_child));
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field JsonWriteContext _child>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       47
		{
			if(_dups == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #40  <Field DupDetector _dups>
	//*   7   13:ifnonnull       21
				obj = null;
	//    8   16:aconst_null     
	//    9   17:astore_1        
			else
	//*  10   18:goto            29
				obj = ((Object) (_dups.child()));
	//   11   21:aload_0         
	//   12   22:getfield        #40  <Field DupDetector _dups>
	//   13   25:invokevirtual   #116 <Method DupDetector DupDetector.child()>
	//   14   28:astore_1        
			obj = ((Object) (new JsonWriteContext(2, this, ((DupDetector) (obj)))));
	//   15   29:new             #2   <Class JsonWriteContext>
	//   16   32:dup             
	//   17   33:iconst_2        
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokespecial   #90  <Method void JsonWriteContext(int, JsonWriteContext, DupDetector)>
	//   21   39:astore_1        
			_child = ((JsonWriteContext) (obj));
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:putfield        #112 <Field JsonWriteContext _child>
			return ((JsonWriteContext) (obj));
	//   25   45:aload_1         
	//   26   46:areturn         
		} else
		{
			return ((JsonWriteContext) (obj)).reset(2);
	//   27   47:aload_1         
	//   28   48:iconst_2        
	//   29   49:invokevirtual   #120 <Method JsonWriteContext reset(int)>
	//   30   52:areturn         
		}
	}

	public final String getCurrentName()
	{
		return _currentName;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field String _currentName>
	//    2    4:areturn         
	}

	public Object getCurrentValue()
	{
		return _currentValue;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Object _currentValue>
	//    2    4:areturn         
	}

	public DupDetector getDupDetector()
	{
		return _dups;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field DupDetector _dups>
	//    2    4:areturn         
	}

	public volatile JsonStreamContext getParent()
	{
		return ((JsonStreamContext) (getParent()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #128 <Method JsonWriteContext getParent()>
	//    2    4:areturn         
	}

	public final JsonWriteContext getParent()
	{
		return _parent;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field JsonWriteContext _parent>
	//    2    4:areturn         
	}

	protected JsonWriteContext reset(int i)
	{
		_type = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field int _type>
		_index = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #43  <Field int _index>
		_currentName = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #97  <Field String _currentName>
		_gotName = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #130 <Field boolean _gotName>
		_currentValue = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #109 <Field Object _currentValue>
		if(_dups != null)
	//*  15   25:aload_0         
	//*  16   26:getfield        #40  <Field DupDetector _dups>
	//*  17   29:ifnull          39
			_dups.reset();
	//   18   32:aload_0         
	//   19   33:getfield        #40  <Field DupDetector _dups>
	//   20   36:invokevirtual   #132 <Method void DupDetector.reset()>
		return this;
	//   21   39:aload_0         
	//   22   40:areturn         
	}

	public void setCurrentValue(Object obj)
	{
		_currentValue = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #109 <Field Object _currentValue>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(64);
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          64
	//    3    6:invokespecial   #137 <Method void StringBuilder(int)>
	//    4    9:astore_1        
		appendDesc(stringbuilder);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #139 <Method void appendDesc(StringBuilder)>
		return stringbuilder.toString();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   10   19:areturn         
	}

	public JsonWriteContext withDupDetector(DupDetector dupdetector)
	{
		_dups = dupdetector;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field DupDetector _dups>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public int writeFieldName(String s)
		throws JsonProcessingException
	{
		if(_type == 2 && !_gotName)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field int _type>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          57
	//*   4    8:aload_0         
	//*   5    9:getfield        #130 <Field boolean _gotName>
	//*   6   12:ifeq            18
	//*   7   15:goto            57
		{
			int i = 1;
	//    8   18:iconst_1        
	//    9   19:istore_2        
			_gotName = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #130 <Field boolean _gotName>
			_currentName = s;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #97  <Field String _currentName>
			if(_dups != null)
	//*  16   30:aload_0         
	//*  17   31:getfield        #40  <Field DupDetector _dups>
	//*  18   34:ifnull          46
				_checkDup(_dups, s);
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #40  <Field DupDetector _dups>
	//   22   42:aload_1         
	//   23   43:invokespecial   #144 <Method void _checkDup(DupDetector, String)>
			if(_index < 0)
	//*  24   46:aload_0         
	//*  25   47:getfield        #43  <Field int _index>
	//*  26   50:ifge            55
				i = 0;
	//   27   53:iconst_0        
	//   28   54:istore_2        
			return i;
	//   29   55:iload_2         
	//   30   56:ireturn         
		} else
		{
			return 4;
	//   31   57:iconst_4        
	//   32   58:ireturn         
		}
	}

	public int writeValue()
	{
		if(_type == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field int _type>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          34
			if(!_gotName)
	//*   4    8:aload_0         
	//*   5    9:getfield        #130 <Field boolean _gotName>
	//*   6   12:ifne            17
			{
				return 5;
	//    7   15:iconst_5        
	//    8   16:ireturn         
			} else
			{
				_gotName = false;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #130 <Field boolean _gotName>
				_index = _index + 1;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #43  <Field int _index>
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #43  <Field int _index>
				return 2;
	//   18   32:iconst_2        
	//   19   33:ireturn         
			}
		if(_type == 1)
	//*  20   34:aload_0         
	//*  21   35:getfield        #36  <Field int _type>
	//*  22   38:iconst_1        
	//*  23   39:icmpne          65
		{
			int i = _index;
	//   24   42:aload_0         
	//   25   43:getfield        #43  <Field int _index>
	//   26   46:istore_1        
			_index = _index + 1;
	//   27   47:aload_0         
	//   28   48:aload_0         
	//   29   49:getfield        #43  <Field int _index>
	//   30   52:iconst_1        
	//   31   53:iadd            
	//   32   54:putfield        #43  <Field int _index>
			return i >= 0 ? 1 : 0;
	//   33   57:iload_1         
	//   34   58:ifge            63
	//   35   61:iconst_0        
	//   36   62:ireturn         
	//   37   63:iconst_1        
	//   38   64:ireturn         
		}
		_index = _index + 1;
	//   39   65:aload_0         
	//   40   66:aload_0         
	//   41   67:getfield        #43  <Field int _index>
	//   42   70:iconst_1        
	//   43   71:iadd            
	//   44   72:putfield        #43  <Field int _index>
		return _index != 0 ? 3 : 0;
	//   45   75:aload_0         
	//   46   76:getfield        #43  <Field int _index>
	//   47   79:ifne            84
	//   48   82:iconst_0        
	//   49   83:ireturn         
	//   50   84:iconst_3        
	//   51   85:ireturn         
	}

	public static final int STATUS_EXPECT_NAME = 5;
	public static final int STATUS_EXPECT_VALUE = 4;
	public static final int STATUS_OK_AFTER_COLON = 2;
	public static final int STATUS_OK_AFTER_COMMA = 1;
	public static final int STATUS_OK_AFTER_SPACE = 3;
	public static final int STATUS_OK_AS_IS = 0;
	protected JsonWriteContext _child;
	protected String _currentName;
	protected Object _currentValue;
	protected DupDetector _dups;
	protected boolean _gotName;
	protected final JsonWriteContext _parent;
}
