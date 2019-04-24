// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharTypes;

// Referenced classes of package com.fasterxml.jackson.core.json:
//			DupDetector

public final class JsonReadContext extends JsonStreamContext
{

	public JsonReadContext(JsonReadContext jsonreadcontext, DupDetector dupdetector, int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void JsonStreamContext()>
		_parent = jsonreadcontext;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field JsonReadContext _parent>
		_dups = dupdetector;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field DupDetector _dups>
		_type = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #28  <Field int _type>
		_lineNr = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #30  <Field int _lineNr>
		_columnNr = k;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #32  <Field int _columnNr>
		_index = -1;
	//   17   31:aload_0         
	//   18   32:iconst_m1       
	//   19   33:putfield        #35  <Field int _index>
	//   20   36:return          
	}

	private void _checkDup(DupDetector dupdetector, String s)
		throws JsonProcessingException
	{
		if(dupdetector.isDup(s))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #46  <Method boolean DupDetector.isDup(String)>
	//*   3    5:ifeq            63
		{
			dupdetector = ((DupDetector) (dupdetector.getSource()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #50  <Method Object DupDetector.getSource()>
	//    6   12:astore_1        
			if(dupdetector instanceof JsonGenerator)
	//*   7   13:aload_1         
	//*   8   14:instanceof      #52  <Class JsonGenerator>
	//*   9   17:ifeq            58
				dupdetector = ((DupDetector) ((JsonParser)dupdetector));
	//   10   20:aload_1         
	//   11   21:checkcast       #54  <Class JsonParser>
	//   12   24:astore_1        
			else
	//*  13   25:new             #56  <Class JsonParseException>
	//*  14   28:dup             
	//*  15   29:aload_1         
	//*  16   30:new             #58  <Class StringBuilder>
	//*  17   33:dup             
	//*  18   34:invokespecial   #59  <Method void StringBuilder()>
	//*  19   37:ldc1            #61  <String "Duplicate field '">
	//*  20   39:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//*  21   42:aload_2         
	//*  22   43:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//*  23   46:ldc1            #67  <String "'">
	//*  24   48:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//*  25   51:invokevirtual   #71  <Method String StringBuilder.toString()>
	//*  26   54:invokespecial   #74  <Method void JsonParseException(JsonParser, String)>
	//*  27   57:athrow          
				dupdetector = null;
	//   28   58:aconst_null     
	//   29   59:astore_1        
			throw new JsonParseException(((JsonParser) (dupdetector)), (new StringBuilder()).append("Duplicate field '").append(s).append("'").toString());
		} else
	//*  30   60:goto            25
		{
			return;
	//   31   63:return          
		}
	}

	public static JsonReadContext createRootContext(int i, int j, DupDetector dupdetector)
	{
		return new JsonReadContext(((JsonReadContext) (null)), dupdetector, 0, i, j);
	//    0    0:new             #2   <Class JsonReadContext>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:iload_0         
	//    6    8:iload_1         
	//    7    9:invokespecial   #79  <Method void JsonReadContext(JsonReadContext, DupDetector, int, int, int)>
	//    8   12:areturn         
	}

	public static JsonReadContext createRootContext(DupDetector dupdetector)
	{
		return new JsonReadContext(((JsonReadContext) (null)), dupdetector, 0, 1, 0);
	//    0    0:new             #2   <Class JsonReadContext>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:iconst_1        
	//    6    8:iconst_0        
	//    7    9:invokespecial   #79  <Method void JsonReadContext(JsonReadContext, DupDetector, int, int, int)>
	//    8   12:areturn         
	}

	public JsonReadContext clearAndGetParent()
	{
		_currentValue = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #84  <Field Object _currentValue>
		return _parent;
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field JsonReadContext _parent>
	//    5    9:areturn         
	}

	public JsonReadContext createChildArrayContext(int i, int j)
	{
		Object obj = ((Object) (_child));
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field JsonReadContext _child>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       49
		{
			if(_dups == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #25  <Field DupDetector _dups>
	//*   7   13:ifnonnull       38
				obj = null;
	//    8   16:aconst_null     
	//    9   17:astore_3        
			else
	//*  10   18:new             #2   <Class JsonReadContext>
	//*  11   21:dup             
	//*  12   22:aload_0         
	//*  13   23:aload_3         
	//*  14   24:iconst_1        
	//*  15   25:iload_1         
	//*  16   26:iload_2         
	//*  17   27:invokespecial   #79  <Method void JsonReadContext(JsonReadContext, DupDetector, int, int, int)>
	//*  18   30:astore_3        
	//*  19   31:aload_0         
	//*  20   32:aload_3         
	//*  21   33:putfield        #88  <Field JsonReadContext _child>
	//*  22   36:aload_3         
	//*  23   37:areturn         
				obj = ((Object) (_dups.child()));
	//   24   38:aload_0         
	//   25   39:getfield        #25  <Field DupDetector _dups>
	//   26   42:invokevirtual   #92  <Method DupDetector DupDetector.child()>
	//   27   45:astore_3        
			obj = ((Object) (new JsonReadContext(this, ((DupDetector) (obj)), 1, i, j)));
			_child = ((JsonReadContext) (obj));
			return ((JsonReadContext) (obj));
		} else
	//*  28   46:goto            18
		{
			((JsonReadContext) (obj)).reset(1, i, j);
	//   29   49:aload_3         
	//   30   50:iconst_1        
	//   31   51:iload_1         
	//   32   52:iload_2         
	//   33   53:invokevirtual   #96  <Method void reset(int, int, int)>
			return ((JsonReadContext) (obj));
	//   34   56:aload_3         
	//   35   57:areturn         
		}
	}

	public JsonReadContext createChildObjectContext(int i, int j)
	{
		Object obj = ((Object) (_child));
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field JsonReadContext _child>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       49
		{
			if(_dups == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #25  <Field DupDetector _dups>
	//*   7   13:ifnonnull       38
				obj = null;
	//    8   16:aconst_null     
	//    9   17:astore_3        
			else
	//*  10   18:new             #2   <Class JsonReadContext>
	//*  11   21:dup             
	//*  12   22:aload_0         
	//*  13   23:aload_3         
	//*  14   24:iconst_2        
	//*  15   25:iload_1         
	//*  16   26:iload_2         
	//*  17   27:invokespecial   #79  <Method void JsonReadContext(JsonReadContext, DupDetector, int, int, int)>
	//*  18   30:astore_3        
	//*  19   31:aload_0         
	//*  20   32:aload_3         
	//*  21   33:putfield        #88  <Field JsonReadContext _child>
	//*  22   36:aload_3         
	//*  23   37:areturn         
				obj = ((Object) (_dups.child()));
	//   24   38:aload_0         
	//   25   39:getfield        #25  <Field DupDetector _dups>
	//   26   42:invokevirtual   #92  <Method DupDetector DupDetector.child()>
	//   27   45:astore_3        
			obj = ((Object) (new JsonReadContext(this, ((DupDetector) (obj)), 2, i, j)));
			_child = ((JsonReadContext) (obj));
			return ((JsonReadContext) (obj));
		} else
	//*  28   46:goto            18
		{
			((JsonReadContext) (obj)).reset(2, i, j);
	//   29   49:aload_3         
	//   30   50:iconst_2        
	//   31   51:iload_1         
	//   32   52:iload_2         
	//   33   53:invokevirtual   #96  <Method void reset(int, int, int)>
			return ((JsonReadContext) (obj));
	//   34   56:aload_3         
	//   35   57:areturn         
		}
	}

	public boolean expectComma()
	{
		int i = _index + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int _index>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:istore_1        
		_index = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #35  <Field int _index>
		return _type != 0 && i > 0;
	//    8   12:aload_0         
	//    9   13:getfield        #28  <Field int _type>
	//   10   16:ifeq            25
	//   11   19:iload_1         
	//   12   20:ifle            25
	//   13   23:iconst_1        
	//   14   24:ireturn         
	//   15   25:iconst_0        
	//   16   26:ireturn         
	}

	public String getCurrentName()
	{
		return _currentName;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field String _currentName>
	//    2    4:areturn         
	}

	public Object getCurrentValue()
	{
		return _currentValue;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Object _currentValue>
	//    2    4:areturn         
	}

	public DupDetector getDupDetector()
	{
		return _dups;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field DupDetector _dups>
	//    2    4:areturn         
	}

	public volatile JsonStreamContext getParent()
	{
		return ((JsonStreamContext) (getParent()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #108 <Method JsonReadContext getParent()>
	//    2    4:areturn         
	}

	public JsonReadContext getParent()
	{
		return _parent;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JsonReadContext _parent>
	//    2    4:areturn         
	}

	public JsonLocation getStartLocation(Object obj)
	{
		return new JsonLocation(obj, -1L, _lineNr, _columnNr);
	//    0    0:new             #112 <Class JsonLocation>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc2w           #113 <Long -1L>
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field int _lineNr>
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field int _columnNr>
	//    8   16:invokespecial   #117 <Method void JsonLocation(Object, long, int, int)>
	//    9   19:areturn         
	}

	protected void reset(int i, int j, int k)
	{
		_type = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int _type>
		_index = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #35  <Field int _index>
		_lineNr = j;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:putfield        #30  <Field int _lineNr>
		_columnNr = k;
	//    9   15:aload_0         
	//   10   16:iload_3         
	//   11   17:putfield        #32  <Field int _columnNr>
		_currentName = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #102 <Field String _currentName>
		_currentValue = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #84  <Field Object _currentValue>
		if(_dups != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #25  <Field DupDetector _dups>
	//*  20   34:ifnull          44
			_dups.reset();
	//   21   37:aload_0         
	//   22   38:getfield        #25  <Field DupDetector _dups>
	//   23   41:invokevirtual   #119 <Method void DupDetector.reset()>
	//   24   44:return          
	}

	public void setCurrentName(String s)
		throws JsonProcessingException
	{
		_currentName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #102 <Field String _currentName>
		if(_dups != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #25  <Field DupDetector _dups>
	//*   5    9:ifnull          21
			_checkDup(_dups, s);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field DupDetector _dups>
	//    9   17:aload_1         
	//   10   18:invokespecial   #123 <Method void _checkDup(DupDetector, String)>
	//   11   21:return          
	}

	public void setCurrentValue(Object obj)
	{
		_currentValue = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field Object _currentValue>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(64);
	//    0    0:new             #58  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          64
	//    3    6:invokespecial   #128 <Method void StringBuilder(int)>
	//    4    9:astore_1        
		_type;
	//    5   10:aload_0         
	//    6   11:getfield        #28  <Field int _type>
		JVM INSTR tableswitch 0 2: default 40
	//	               0 45
	//	               1 55
	//	               2 81;
	//    7   14:tableswitch     0 2: default 40
	//	               0 45
	//	               1 55
	//	               2 81
		   goto _L1 _L2 _L3 _L4
_L1:
		return stringbuilder.toString();
	//    8   40:aload_1         
	//    9   41:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   10   44:areturn         
_L2:
		stringbuilder.append("/");
	//   11   45:aload_1         
	//   12   46:ldc1            #130 <String "/">
	//   13   48:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   14   51:pop             
		continue; /* Loop/switch isn't completed */
	//   15   52:goto            40
_L3:
		stringbuilder.append('[');
	//   16   55:aload_1         
	//   17   56:bipush          91
	//   18   58:invokevirtual   #133 <Method StringBuilder StringBuilder.append(char)>
	//   19   61:pop             
		stringbuilder.append(getCurrentIndex());
	//   20   62:aload_1         
	//   21   63:aload_0         
	//   22   64:invokevirtual   #137 <Method int getCurrentIndex()>
	//   23   67:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
	//   24   70:pop             
		stringbuilder.append(']');
	//   25   71:aload_1         
	//   26   72:bipush          93
	//   27   74:invokevirtual   #133 <Method StringBuilder StringBuilder.append(char)>
	//   28   77:pop             
		continue; /* Loop/switch isn't completed */
	//   29   78:goto            40
_L4:
		stringbuilder.append('{');
	//   30   81:aload_1         
	//   31   82:bipush          123
	//   32   84:invokevirtual   #133 <Method StringBuilder StringBuilder.append(char)>
	//   33   87:pop             
		if(_currentName != null)
	//*  34   88:aload_0         
	//*  35   89:getfield        #102 <Field String _currentName>
	//*  36   92:ifnull          127
		{
			stringbuilder.append('"');
	//   37   95:aload_1         
	//   38   96:bipush          34
	//   39   98:invokevirtual   #133 <Method StringBuilder StringBuilder.append(char)>
	//   40  101:pop             
			CharTypes.appendQuoted(stringbuilder, _currentName);
	//   41  102:aload_1         
	//   42  103:aload_0         
	//   43  104:getfield        #102 <Field String _currentName>
	//   44  107:invokestatic    #146 <Method void CharTypes.appendQuoted(StringBuilder, String)>
			stringbuilder.append('"');
	//   45  110:aload_1         
	//   46  111:bipush          34
	//   47  113:invokevirtual   #133 <Method StringBuilder StringBuilder.append(char)>
	//   48  116:pop             
		} else
	//*  49  117:aload_1         
	//*  50  118:bipush          125
	//*  51  120:invokevirtual   #133 <Method StringBuilder StringBuilder.append(char)>
	//*  52  123:pop             
	//*  53  124:goto            40
		{
			stringbuilder.append('?');
	//   54  127:aload_1         
	//   55  128:bipush          63
	//   56  130:invokevirtual   #133 <Method StringBuilder StringBuilder.append(char)>
	//   57  133:pop             
		}
		stringbuilder.append('}');
		if(true) goto _L1; else goto _L5
	//   58  134:goto            117
_L5:
	}

	public JsonReadContext withDupDetector(DupDetector dupdetector)
	{
		_dups = dupdetector;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field DupDetector _dups>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	protected JsonReadContext _child;
	protected int _columnNr;
	protected String _currentName;
	protected Object _currentValue;
	protected DupDetector _dups;
	protected int _lineNr;
	protected final JsonReadContext _parent;
}
