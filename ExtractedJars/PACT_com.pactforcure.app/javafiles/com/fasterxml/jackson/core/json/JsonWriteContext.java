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
	//*   3    5:ifeq            65
		{
			dupdetector = ((DupDetector) (dupdetector.getSource()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #58  <Method Object DupDetector.getSource()>
	//    6   12:astore_1        
			s = (new StringBuilder()).append("Duplicate field '").append(s).append("'").toString();
	//    7   13:new             #60  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #61  <Method void StringBuilder()>
	//   10   20:ldc1            #63  <String "Duplicate field '">
	//   11   22:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:aload_2         
	//   13   26:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:ldc1            #69  <String "'">
	//   15   31:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   17   37:astore_2        
			if(dupdetector instanceof JsonGenerator)
	//*  18   38:aload_1         
	//*  19   39:instanceof      #75  <Class JsonGenerator>
	//*  20   42:ifeq            60
				dupdetector = ((DupDetector) ((JsonGenerator)dupdetector));
	//   21   45:aload_1         
	//   22   46:checkcast       #75  <Class JsonGenerator>
	//   23   49:astore_1        
			else
	//*  24   50:new             #77  <Class JsonGenerationException>
	//*  25   53:dup             
	//*  26   54:aload_2         
	//*  27   55:aload_1         
	//*  28   56:invokespecial   #80  <Method void JsonGenerationException(String, JsonGenerator)>
	//*  29   59:athrow          
				dupdetector = null;
	//   30   60:aconst_null     
	//   31   61:astore_1        
			throw new JsonGenerationException(s, ((JsonGenerator) (dupdetector)));
		} else
	//*  32   62:goto            50
		{
			return;
	//   33   65:return          
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
	//*  10   19:ifnull          53
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
	//*  24   45:aload_1         
	//*  25   46:bipush          125
	//*  26   48:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//*  27   51:pop             
	//*  28   52:return          
			{
				stringbuilder.append('?');
	//   29   53:aload_1         
	//   30   54:bipush          63
	//   31   56:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//   32   59:pop             
			}
			stringbuilder.append('}');
			return;
		}
	//*  33   60:goto            45
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
	//*   7   13:ifnonnull       36
				obj = null;
	//    8   16:aconst_null     
	//    9   17:astore_1        
			else
	//*  10   18:new             #2   <Class JsonWriteContext>
	//*  11   21:dup             
	//*  12   22:iconst_1        
	//*  13   23:aload_0         
	//*  14   24:aload_1         
	//*  15   25:invokespecial   #90  <Method void JsonWriteContext(int, JsonWriteContext, DupDetector)>
	//*  16   28:astore_1        
	//*  17   29:aload_0         
	//*  18   30:aload_1         
	//*  19   31:putfield        #112 <Field JsonWriteContext _child>
	//*  20   34:aload_1         
	//*  21   35:areturn         
				obj = ((Object) (_dups.child()));
	//   22   36:aload_0         
	//   23   37:getfield        #40  <Field DupDetector _dups>
	//   24   40:invokevirtual   #116 <Method DupDetector DupDetector.child()>
	//   25   43:astore_1        
			obj = ((Object) (new JsonWriteContext(1, this, ((DupDetector) (obj)))));
			_child = ((JsonWriteContext) (obj));
			return ((JsonWriteContext) (obj));
		} else
	//*  26   44:goto            18
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
	//*   7   13:ifnonnull       36
				obj = null;
	//    8   16:aconst_null     
	//    9   17:astore_1        
			else
	//*  10   18:new             #2   <Class JsonWriteContext>
	//*  11   21:dup             
	//*  12   22:iconst_2        
	//*  13   23:aload_0         
	//*  14   24:aload_1         
	//*  15   25:invokespecial   #90  <Method void JsonWriteContext(int, JsonWriteContext, DupDetector)>
	//*  16   28:astore_1        
	//*  17   29:aload_0         
	//*  18   30:aload_1         
	//*  19   31:putfield        #112 <Field JsonWriteContext _child>
	//*  20   34:aload_1         
	//*  21   35:areturn         
				obj = ((Object) (_dups.child()));
	//   22   36:aload_0         
	//   23   37:getfield        #40  <Field DupDetector _dups>
	//   24   40:invokevirtual   #116 <Method DupDetector DupDetector.child()>
	//   25   43:astore_1        
			obj = ((Object) (new JsonWriteContext(2, this, ((DupDetector) (obj)))));
			_child = ((JsonWriteContext) (obj));
			return ((JsonWriteContext) (obj));
		} else
	//*  26   44:goto            18
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
		byte byte0 = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(_gotName)
	//*   2    2:aload_0         
	//*   3    3:getfield        #130 <Field boolean _gotName>
	//*   4    6:ifeq            13
		{
			byte0 = 4;
	//    5    9:iconst_4        
	//    6   10:istore_2        
		} else
	//*   7   11:iload_2         
	//*   8   12:ireturn         
		{
			_gotName = true;
	//    9   13:aload_0         
	//   10   14:iconst_1        
	//   11   15:putfield        #130 <Field boolean _gotName>
			_currentName = s;
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:putfield        #97  <Field String _currentName>
			if(_dups != null)
	//*  15   23:aload_0         
	//*  16   24:getfield        #40  <Field DupDetector _dups>
	//*  17   27:ifnull          39
				_checkDup(_dups, s);
	//   18   30:aload_0         
	//   19   31:aload_0         
	//   20   32:getfield        #40  <Field DupDetector _dups>
	//   21   35:aload_1         
	//   22   36:invokespecial   #144 <Method void _checkDup(DupDetector, String)>
			if(_index < 0)
	//*  23   39:aload_0         
	//*  24   40:getfield        #43  <Field int _index>
	//*  25   43:ifge            11
				return 0;
	//   26   46:iconst_0        
	//   27   47:ireturn         
		}
		return ((int) (byte0));
	}

	public int writeValue()
	{
		byte byte0 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(_type != 2) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #36  <Field int _type>
	//    4    6:iconst_2        
	//    5    7:icmpne          38
_L1:
		if(_gotName) goto _L4; else goto _L3
	//    6   10:aload_0         
	//    7   11:getfield        #130 <Field boolean _gotName>
	//    8   14:ifne            21
_L3:
		byte0 = 5;
	//    9   17:iconst_5        
	//   10   18:istore_1        
_L6:
		return ((int) (byte0));
	//   11   19:iload_1         
	//   12   20:ireturn         
_L4:
		_gotName = false;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #130 <Field boolean _gotName>
		_index = _index + 1;
	//   16   26:aload_0         
	//   17   27:aload_0         
	//   18   28:getfield        #43  <Field int _index>
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:putfield        #43  <Field int _index>
		return 2;
	//   22   36:iconst_2        
	//   23   37:ireturn         
_L2:
		if(_type != 1)
			break; /* Loop/switch isn't completed */
	//   24   38:aload_0         
	//   25   39:getfield        #36  <Field int _type>
	//   26   42:iconst_1        
	//   27   43:icmpne          67
		int i = _index;
	//   28   46:aload_0         
	//   29   47:getfield        #43  <Field int _index>
	//   30   50:istore_2        
		_index = _index + 1;
	//   31   51:aload_0         
	//   32   52:aload_0         
	//   33   53:getfield        #43  <Field int _index>
	//   34   56:iconst_1        
	//   35   57:iadd            
	//   36   58:putfield        #43  <Field int _index>
		if(i >= 0)
	//*  37   61:iload_2         
	//*  38   62:iflt            19
			return 1;
	//   39   65:iconst_1        
	//   40   66:ireturn         
		if(true) goto _L6; else goto _L5
_L5:
		_index = _index + 1;
	//   41   67:aload_0         
	//   42   68:aload_0         
	//   43   69:getfield        #43  <Field int _index>
	//   44   72:iconst_1        
	//   45   73:iadd            
	//   46   74:putfield        #43  <Field int _index>
		if(_index != 0)
	//*  47   77:aload_0         
	//*  48   78:getfield        #43  <Field int _index>
	//*  49   81:ifeq            19
			return 3;
	//   50   84:iconst_3        
	//   51   85:ireturn         
		if(true) goto _L6; else goto _L7
_L7:
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
