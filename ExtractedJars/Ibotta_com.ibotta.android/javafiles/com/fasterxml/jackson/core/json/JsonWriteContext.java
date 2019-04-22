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
	//    1    1:invokespecial   #20  <Method void JsonStreamContext()>
		_type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field int _type>
		_parent = jsonwritecontext;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field JsonWriteContext _parent>
		_dups = dupdetector;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field DupDetector _dups>
		_index = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #31  <Field int _index>
	//   14   24:return          
	}

	private final void _checkDup(DupDetector dupdetector, String s)
		throws JsonProcessingException
	{
		if(dupdetector.isDup(s))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #42  <Method boolean DupDetector.isDup(String)>
	//*   3    5:ifeq            73
		{
			dupdetector = ((DupDetector) (dupdetector.getSource()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #46  <Method Object DupDetector.getSource()>
	//    6   12:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   13:new             #48  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #49  <Method void StringBuilder()>
	//   10   20:astore_3        
			stringbuilder.append("Duplicate field '");
	//   11   21:aload_3         
	//   12   22:ldc1            #51  <String "Duplicate field '">
	//   13   24:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			stringbuilder.append(s);
	//   15   28:aload_3         
	//   16   29:aload_2         
	//   17   30:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			stringbuilder.append("'");
	//   19   34:aload_3         
	//   20   35:ldc1            #57  <String "'">
	//   21   37:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			s = stringbuilder.toString();
	//   23   41:aload_3         
	//   24   42:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   25   45:astore_2        
			if(dupdetector instanceof JsonGenerator)
	//*  26   46:aload_1         
	//*  27   47:instanceof      #63  <Class JsonGenerator>
	//*  28   50:ifeq            61
				dupdetector = ((DupDetector) ((JsonGenerator)dupdetector));
	//   29   53:aload_1         
	//   30   54:checkcast       #63  <Class JsonGenerator>
	//   31   57:astore_1        
			else
	//*  32   58:goto            63
				dupdetector = null;
	//   33   61:aconst_null     
	//   34   62:astore_1        
			throw new JsonGenerationException(s, ((JsonGenerator) (dupdetector)));
	//   35   63:new             #65  <Class JsonGenerationException>
	//   36   66:dup             
	//   37   67:aload_2         
	//   38   68:aload_1         
	//   39   69:invokespecial   #68  <Method void JsonGenerationException(String, JsonGenerator)>
	//   40   72:athrow          
		} else
		{
			return;
	//   41   73:return          
		}
	}

	public static JsonWriteContext createRootContext(DupDetector dupdetector)
	{
		return new JsonWriteContext(0, ((JsonWriteContext) (null)), dupdetector);
	//    0    0:new             #2   <Class JsonWriteContext>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:aconst_null     
	//    4    6:aload_0         
	//    5    7:invokespecial   #73  <Method void JsonWriteContext(int, JsonWriteContext, DupDetector)>
	//    6   10:areturn         
	}

	public JsonWriteContext clearAndGetParent()
	{
		_currentValue = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #77  <Field Object _currentValue>
		return _parent;
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field JsonWriteContext _parent>
	//    5    9:areturn         
	}

	public JsonWriteContext createChildArrayContext()
	{
		Object obj = ((Object) (_child));
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field JsonWriteContext _child>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       46
		{
			obj = ((Object) (_dups));
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field DupDetector _dups>
	//    7   13:astore_1        
			if(obj == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       23
				obj = null;
	//   10   18:aconst_null     
	//   11   19:astore_1        
			else
	//*  12   20:goto            28
				obj = ((Object) (((DupDetector) (obj)).child()));
	//   13   23:aload_1         
	//   14   24:invokevirtual   #84  <Method DupDetector DupDetector.child()>
	//   15   27:astore_1        
			obj = ((Object) (new JsonWriteContext(1, this, ((DupDetector) (obj)))));
	//   16   28:new             #2   <Class JsonWriteContext>
	//   17   31:dup             
	//   18   32:iconst_1        
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokespecial   #73  <Method void JsonWriteContext(int, JsonWriteContext, DupDetector)>
	//   22   38:astore_1        
			_child = ((JsonWriteContext) (obj));
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:putfield        #80  <Field JsonWriteContext _child>
			return ((JsonWriteContext) (obj));
	//   26   44:aload_1         
	//   27   45:areturn         
		} else
		{
			return ((JsonWriteContext) (obj)).reset(1);
	//   28   46:aload_1         
	//   29   47:iconst_1        
	//   30   48:invokevirtual   #88  <Method JsonWriteContext reset(int)>
	//   31   51:areturn         
		}
	}

	public JsonWriteContext createChildObjectContext()
	{
		Object obj = ((Object) (_child));
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field JsonWriteContext _child>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       46
		{
			obj = ((Object) (_dups));
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field DupDetector _dups>
	//    7   13:astore_1        
			if(obj == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       23
				obj = null;
	//   10   18:aconst_null     
	//   11   19:astore_1        
			else
	//*  12   20:goto            28
				obj = ((Object) (((DupDetector) (obj)).child()));
	//   13   23:aload_1         
	//   14   24:invokevirtual   #84  <Method DupDetector DupDetector.child()>
	//   15   27:astore_1        
			obj = ((Object) (new JsonWriteContext(2, this, ((DupDetector) (obj)))));
	//   16   28:new             #2   <Class JsonWriteContext>
	//   17   31:dup             
	//   18   32:iconst_2        
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokespecial   #73  <Method void JsonWriteContext(int, JsonWriteContext, DupDetector)>
	//   22   38:astore_1        
			_child = ((JsonWriteContext) (obj));
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:putfield        #80  <Field JsonWriteContext _child>
			return ((JsonWriteContext) (obj));
	//   26   44:aload_1         
	//   27   45:areturn         
		} else
		{
			return ((JsonWriteContext) (obj)).reset(2);
	//   28   46:aload_1         
	//   29   47:iconst_2        
	//   30   48:invokevirtual   #88  <Method JsonWriteContext reset(int)>
	//   31   51:areturn         
		}
	}

	public final String getCurrentName()
	{
		return _currentName;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field String _currentName>
	//    2    4:areturn         
	}

	public Object getCurrentValue()
	{
		return _currentValue;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field Object _currentValue>
	//    2    4:areturn         
	}

	public DupDetector getDupDetector()
	{
		return _dups;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field DupDetector _dups>
	//    2    4:areturn         
	}

	public volatile JsonStreamContext getParent()
	{
		return ((JsonStreamContext) (getParent()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method JsonWriteContext getParent()>
	//    2    4:areturn         
	}

	public final JsonWriteContext getParent()
	{
		return _parent;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field JsonWriteContext _parent>
	//    2    4:areturn         
	}

	protected JsonWriteContext reset(int i)
	{
		_type = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field int _type>
		_index = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #31  <Field int _index>
		_currentName = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #92  <Field String _currentName>
		_gotName = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #100 <Field boolean _gotName>
		_currentValue = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #77  <Field Object _currentValue>
		DupDetector dupdetector = _dups;
	//   15   25:aload_0         
	//   16   26:getfield        #28  <Field DupDetector _dups>
	//   17   29:astore_2        
		if(dupdetector != null)
	//*  18   30:aload_2         
	//*  19   31:ifnull          38
			dupdetector.reset();
	//   20   34:aload_2         
	//   21   35:invokevirtual   #102 <Method void DupDetector.reset()>
		return this;
	//   22   38:aload_0         
	//   23   39:areturn         
	}

	public void setCurrentValue(Object obj)
	{
		_currentValue = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field Object _currentValue>
	//    3    5:return          
	}

	public JsonWriteContext withDupDetector(DupDetector dupdetector)
	{
		_dups = dupdetector;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field DupDetector _dups>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public int writeFieldName(String s)
		throws JsonProcessingException
	{
		if(_type == 2 && !_gotName)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field int _type>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          56
	//*   4    8:aload_0         
	//*   5    9:getfield        #100 <Field boolean _gotName>
	//*   6   12:ifeq            18
	//*   7   15:goto            56
		{
			int i = 1;
	//    8   18:iconst_1        
	//    9   19:istore_2        
			_gotName = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #100 <Field boolean _gotName>
			_currentName = s;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #92  <Field String _currentName>
			DupDetector dupdetector = _dups;
	//   16   30:aload_0         
	//   17   31:getfield        #28  <Field DupDetector _dups>
	//   18   34:astore_3        
			if(dupdetector != null)
	//*  19   35:aload_3         
	//*  20   36:ifnull          45
				_checkDup(dupdetector, s);
	//   21   39:aload_0         
	//   22   40:aload_3         
	//   23   41:aload_1         
	//   24   42:invokespecial   #109 <Method void _checkDup(DupDetector, String)>
			if(_index < 0)
	//*  25   45:aload_0         
	//*  26   46:getfield        #31  <Field int _index>
	//*  27   49:ifge            54
				i = 0;
	//   28   52:iconst_0        
	//   29   53:istore_2        
			return i;
	//   30   54:iload_2         
	//   31   55:ireturn         
		} else
		{
			return 4;
	//   32   56:iconst_4        
	//   33   57:ireturn         
		}
	}

	public int writeValue()
	{
		if(_type == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field int _type>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          34
			if(!_gotName)
	//*   4    8:aload_0         
	//*   5    9:getfield        #100 <Field boolean _gotName>
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
	//   11   19:putfield        #100 <Field boolean _gotName>
				_index = _index + 1;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #31  <Field int _index>
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #31  <Field int _index>
				return 2;
	//   18   32:iconst_2        
	//   19   33:ireturn         
			}
		if(_type == 1)
	//*  20   34:aload_0         
	//*  21   35:getfield        #24  <Field int _type>
	//*  22   38:iconst_1        
	//*  23   39:icmpne          65
		{
			int i = _index;
	//   24   42:aload_0         
	//   25   43:getfield        #31  <Field int _index>
	//   26   46:istore_1        
			_index = _index + 1;
	//   27   47:aload_0         
	//   28   48:aload_0         
	//   29   49:getfield        #31  <Field int _index>
	//   30   52:iconst_1        
	//   31   53:iadd            
	//   32   54:putfield        #31  <Field int _index>
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
	//   41   67:getfield        #31  <Field int _index>
	//   42   70:iconst_1        
	//   43   71:iadd            
	//   44   72:putfield        #31  <Field int _index>
		return _index != 0 ? 3 : 0;
	//   45   75:aload_0         
	//   46   76:getfield        #31  <Field int _index>
	//   47   79:ifne            84
	//   48   82:iconst_0        
	//   49   83:ireturn         
	//   50   84:iconst_3        
	//   51   85:ireturn         
	}

	protected JsonWriteContext _child;
	protected String _currentName;
	protected Object _currentValue;
	protected DupDetector _dups;
	protected boolean _gotName;
	protected final JsonWriteContext _parent;
}
