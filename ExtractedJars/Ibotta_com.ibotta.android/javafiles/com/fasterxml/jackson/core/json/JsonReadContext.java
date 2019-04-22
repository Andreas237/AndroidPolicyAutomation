// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;

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
	//*   3    5:ifeq            71
		{
			dupdetector = ((DupDetector) (dupdetector.getSource()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #50  <Method Object DupDetector.getSource()>
	//    6   12:astore_1        
			if(dupdetector instanceof JsonParser)
	//*   7   13:aload_1         
	//*   8   14:instanceof      #52  <Class JsonParser>
	//*   9   17:ifeq            28
				dupdetector = ((DupDetector) ((JsonParser)dupdetector));
	//   10   20:aload_1         
	//   11   21:checkcast       #52  <Class JsonParser>
	//   12   24:astore_1        
			else
	//*  13   25:goto            30
				dupdetector = null;
	//   14   28:aconst_null     
	//   15   29:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   16   30:new             #54  <Class StringBuilder>
	//   17   33:dup             
	//   18   34:invokespecial   #55  <Method void StringBuilder()>
	//   19   37:astore_3        
			stringbuilder.append("Duplicate field '");
	//   20   38:aload_3         
	//   21   39:ldc1            #57  <String "Duplicate field '">
	//   22   41:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			stringbuilder.append(s);
	//   24   45:aload_3         
	//   25   46:aload_2         
	//   26   47:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
			stringbuilder.append("'");
	//   28   51:aload_3         
	//   29   52:ldc1            #63  <String "'">
	//   30   54:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   31   57:pop             
			throw new JsonParseException(((JsonParser) (dupdetector)), stringbuilder.toString());
	//   32   58:new             #65  <Class JsonParseException>
	//   33   61:dup             
	//   34   62:aload_1         
	//   35   63:aload_3         
	//   36   64:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   37   67:invokespecial   #72  <Method void JsonParseException(JsonParser, String)>
	//   38   70:athrow          
		} else
		{
			return;
	//   39   71:return          
		}
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
	//    7    9:invokespecial   #77  <Method void JsonReadContext(JsonReadContext, DupDetector, int, int, int)>
	//    8   12:areturn         
	}

	public JsonReadContext clearAndGetParent()
	{
		_currentValue = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #81  <Field Object _currentValue>
		return _parent;
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field JsonReadContext _parent>
	//    5    9:areturn         
	}

	public JsonReadContext createChildArrayContext(int i, int j)
	{
		Object obj = ((Object) (_child));
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field JsonReadContext _child>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       48
		{
			obj = ((Object) (_dups));
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field DupDetector _dups>
	//    7   13:astore_3        
			if(obj == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       23
				obj = null;
	//   10   18:aconst_null     
	//   11   19:astore_3        
			else
	//*  12   20:goto            28
				obj = ((Object) (((DupDetector) (obj)).child()));
	//   13   23:aload_3         
	//   14   24:invokevirtual   #89  <Method DupDetector DupDetector.child()>
	//   15   27:astore_3        
			obj = ((Object) (new JsonReadContext(this, ((DupDetector) (obj)), 1, i, j)));
	//   16   28:new             #2   <Class JsonReadContext>
	//   17   31:dup             
	//   18   32:aload_0         
	//   19   33:aload_3         
	//   20   34:iconst_1        
	//   21   35:iload_1         
	//   22   36:iload_2         
	//   23   37:invokespecial   #77  <Method void JsonReadContext(JsonReadContext, DupDetector, int, int, int)>
	//   24   40:astore_3        
			_child = ((JsonReadContext) (obj));
	//   25   41:aload_0         
	//   26   42:aload_3         
	//   27   43:putfield        #85  <Field JsonReadContext _child>
			return ((JsonReadContext) (obj));
	//   28   46:aload_3         
	//   29   47:areturn         
		} else
		{
			((JsonReadContext) (obj)).reset(1, i, j);
	//   30   48:aload_3         
	//   31   49:iconst_1        
	//   32   50:iload_1         
	//   33   51:iload_2         
	//   34   52:invokevirtual   #93  <Method void reset(int, int, int)>
			return ((JsonReadContext) (obj));
	//   35   55:aload_3         
	//   36   56:areturn         
		}
	}

	public JsonReadContext createChildObjectContext(int i, int j)
	{
		Object obj = ((Object) (_child));
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field JsonReadContext _child>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       48
		{
			obj = ((Object) (_dups));
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field DupDetector _dups>
	//    7   13:astore_3        
			if(obj == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       23
				obj = null;
	//   10   18:aconst_null     
	//   11   19:astore_3        
			else
	//*  12   20:goto            28
				obj = ((Object) (((DupDetector) (obj)).child()));
	//   13   23:aload_3         
	//   14   24:invokevirtual   #89  <Method DupDetector DupDetector.child()>
	//   15   27:astore_3        
			obj = ((Object) (new JsonReadContext(this, ((DupDetector) (obj)), 2, i, j)));
	//   16   28:new             #2   <Class JsonReadContext>
	//   17   31:dup             
	//   18   32:aload_0         
	//   19   33:aload_3         
	//   20   34:iconst_2        
	//   21   35:iload_1         
	//   22   36:iload_2         
	//   23   37:invokespecial   #77  <Method void JsonReadContext(JsonReadContext, DupDetector, int, int, int)>
	//   24   40:astore_3        
			_child = ((JsonReadContext) (obj));
	//   25   41:aload_0         
	//   26   42:aload_3         
	//   27   43:putfield        #85  <Field JsonReadContext _child>
			return ((JsonReadContext) (obj));
	//   28   46:aload_3         
	//   29   47:areturn         
		} else
		{
			((JsonReadContext) (obj)).reset(2, i, j);
	//   30   48:aload_3         
	//   31   49:iconst_2        
	//   32   50:iload_1         
	//   33   51:iload_2         
	//   34   52:invokevirtual   #93  <Method void reset(int, int, int)>
			return ((JsonReadContext) (obj));
	//   35   55:aload_3         
	//   36   56:areturn         
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
	//    1    1:getfield        #99  <Field String _currentName>
	//    2    4:areturn         
	}

	public Object getCurrentValue()
	{
		return _currentValue;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Object _currentValue>
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
	//    1    1:invokevirtual   #105 <Method JsonReadContext getParent()>
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
	//    0    0:new             #109 <Class JsonLocation>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc2w           #110 <Long -1L>
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field int _lineNr>
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field int _columnNr>
	//    8   16:invokespecial   #114 <Method void JsonLocation(Object, long, int, int)>
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
	//   14   22:putfield        #99  <Field String _currentName>
		_currentValue = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #81  <Field Object _currentValue>
		DupDetector dupdetector = _dups;
	//   18   30:aload_0         
	//   19   31:getfield        #25  <Field DupDetector _dups>
	//   20   34:astore          4
		if(dupdetector != null)
	//*  21   36:aload           4
	//*  22   38:ifnull          46
			dupdetector.reset();
	//   23   41:aload           4
	//   24   43:invokevirtual   #116 <Method void DupDetector.reset()>
	//   25   46:return          
	}

	public void setCurrentName(String s)
		throws JsonProcessingException
	{
		_currentName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #99  <Field String _currentName>
		DupDetector dupdetector = _dups;
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field DupDetector _dups>
	//    5    9:astore_2        
		if(dupdetector != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          20
			_checkDup(dupdetector, s);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:aload_1         
	//   11   17:invokespecial   #120 <Method void _checkDup(DupDetector, String)>
	//   12   20:return          
	}

	public void setCurrentValue(Object obj)
	{
		_currentValue = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field Object _currentValue>
	//    3    5:return          
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
