// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.*;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.core.filter:
//			TokenFilter

public class TokenFilterContext extends JsonStreamContext
{

	protected TokenFilterContext(int i, TokenFilterContext tokenfiltercontext, TokenFilter tokenfilter, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void JsonStreamContext()>
		_type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #23  <Field int _type>
		_parent = tokenfiltercontext;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field TokenFilterContext _parent>
		_filter = tokenfilter;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field TokenFilter _filter>
		_index = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #30  <Field int _index>
		_startHandled = flag;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:putfield        #32  <Field boolean _startHandled>
		_needToHandleName = false;
	//   17   30:aload_0         
	//   18   31:iconst_0        
	//   19   32:putfield        #34  <Field boolean _needToHandleName>
	//   20   35:return          
	}

	private void _writePath(JsonGenerator jsongenerator)
		throws IOException
	{
		if(_filter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field TokenFilter _filter>
	//*   2    4:ifnull          112
		{
			if(_filter == TokenFilter.INCLUDE_ALL)
	//*   3    7:aload_0         
	//*   4    8:getfield        #27  <Field TokenFilter _filter>
	//*   5   11:getstatic       #44  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*   6   14:if_acmpne       18
				return;
	//    7   17:return          
			if(_parent != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #25  <Field TokenFilterContext _parent>
	//*  10   22:ifnull          33
				_parent._writePath(jsongenerator);
	//   11   25:aload_0         
	//   12   26:getfield        #25  <Field TokenFilterContext _parent>
	//   13   29:aload_1         
	//   14   30:invokespecial   #46  <Method void _writePath(JsonGenerator)>
			if(_startHandled)
	//*  15   33:aload_0         
	//*  16   34:getfield        #32  <Field boolean _startHandled>
	//*  17   37:ifeq            61
			{
				if(_needToHandleName)
	//*  18   40:aload_0         
	//*  19   41:getfield        #34  <Field boolean _needToHandleName>
	//*  20   44:ifeq            111
				{
					_needToHandleName = false;
	//   21   47:aload_0         
	//   22   48:iconst_0        
	//   23   49:putfield        #34  <Field boolean _needToHandleName>
					jsongenerator.writeFieldName(_currentName);
	//   24   52:aload_1         
	//   25   53:aload_0         
	//   26   54:getfield        #48  <Field String _currentName>
	//   27   57:invokevirtual   #54  <Method void JsonGenerator.writeFieldName(String)>
					return;
	//   28   60:return          
				}
			} else
			{
				_startHandled = true;
	//   29   61:aload_0         
	//   30   62:iconst_1        
	//   31   63:putfield        #32  <Field boolean _startHandled>
				if(_type == 2)
	//*  32   66:aload_0         
	//*  33   67:getfield        #23  <Field int _type>
	//*  34   70:iconst_2        
	//*  35   71:icmpne          99
				{
					jsongenerator.writeStartObject();
	//   36   74:aload_1         
	//   37   75:invokevirtual   #57  <Method void JsonGenerator.writeStartObject()>
					if(_needToHandleName)
	//*  38   78:aload_0         
	//*  39   79:getfield        #34  <Field boolean _needToHandleName>
	//*  40   82:ifeq            111
					{
						_needToHandleName = false;
	//   41   85:aload_0         
	//   42   86:iconst_0        
	//   43   87:putfield        #34  <Field boolean _needToHandleName>
						jsongenerator.writeFieldName(_currentName);
	//   44   90:aload_1         
	//   45   91:aload_0         
	//   46   92:getfield        #48  <Field String _currentName>
	//   47   95:invokevirtual   #54  <Method void JsonGenerator.writeFieldName(String)>
						return;
	//   48   98:return          
					}
				} else
				if(_type == 1)
	//*  49   99:aload_0         
	//*  50  100:getfield        #23  <Field int _type>
	//*  51  103:iconst_1        
	//*  52  104:icmpne          111
					jsongenerator.writeStartArray();
	//   53  107:aload_1         
	//   54  108:invokevirtual   #60  <Method void JsonGenerator.writeStartArray()>
			}
			return;
	//   55  111:return          
		} else
		{
			return;
	//   56  112:return          
		}
	}

	public static TokenFilterContext createRootContext(TokenFilter tokenfilter)
	{
		return new TokenFilterContext(0, ((TokenFilterContext) (null)), tokenfilter, true);
	//    0    0:new             #2   <Class TokenFilterContext>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:aconst_null     
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:invokespecial   #65  <Method void TokenFilterContext(int, TokenFilterContext, TokenFilter, boolean)>
	//    7   11:areturn         
	}

	protected void appendDesc(StringBuilder stringbuilder)
	{
		if(_parent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field TokenFilterContext _parent>
	//*   2    4:ifnull          15
			_parent.appendDesc(stringbuilder);
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field TokenFilterContext _parent>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #69  <Method void appendDesc(StringBuilder)>
		if(_type == 2)
	//*   7   15:aload_0         
	//*   8   16:getfield        #23  <Field int _type>
	//*   9   19:iconst_2        
	//*  10   20:icmpne          78
		{
			stringbuilder.append('{');
	//   11   23:aload_1         
	//   12   24:bipush          123
	//   13   26:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   14   29:pop             
			if(_currentName != null)
	//*  15   30:aload_0         
	//*  16   31:getfield        #48  <Field String _currentName>
	//*  17   34:ifnull          63
			{
				stringbuilder.append('"');
	//   18   37:aload_1         
	//   19   38:bipush          34
	//   20   40:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   21   43:pop             
				stringbuilder.append(_currentName);
	//   22   44:aload_1         
	//   23   45:aload_0         
	//   24   46:getfield        #48  <Field String _currentName>
	//   25   49:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
				stringbuilder.append('"');
	//   27   53:aload_1         
	//   28   54:bipush          34
	//   29   56:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   30   59:pop             
			} else
	//*  31   60:goto            70
			{
				stringbuilder.append('?');
	//   32   63:aload_1         
	//   33   64:bipush          63
	//   34   66:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   35   69:pop             
			}
			stringbuilder.append('}');
	//   36   70:aload_1         
	//   37   71:bipush          125
	//   38   73:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   39   76:pop             
			return;
	//   40   77:return          
		}
		if(_type == 1)
	//*  41   78:aload_0         
	//*  42   79:getfield        #23  <Field int _type>
	//*  43   82:iconst_1        
	//*  44   83:icmpne          110
		{
			stringbuilder.append('[');
	//   45   86:aload_1         
	//   46   87:bipush          91
	//   47   89:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   48   92:pop             
			stringbuilder.append(getCurrentIndex());
	//   49   93:aload_1         
	//   50   94:aload_0         
	//   51   95:invokevirtual   #82  <Method int getCurrentIndex()>
	//   52   98:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//   53  101:pop             
			stringbuilder.append(']');
	//   54  102:aload_1         
	//   55  103:bipush          93
	//   56  105:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   57  108:pop             
			return;
	//   58  109:return          
		} else
		{
			stringbuilder.append("/");
	//   59  110:aload_1         
	//   60  111:ldc1            #87  <String "/">
	//   61  113:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   62  116:pop             
			return;
	//   63  117:return          
		}
	}

	public TokenFilter checkValue(TokenFilter tokenfilter)
	{
		if(_type == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field int _type>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          10
			return tokenfilter;
	//    4    8:aload_1         
	//    5    9:areturn         
		int i = _index + 1;
	//    6   10:aload_0         
	//    7   11:getfield        #30  <Field int _index>
	//    8   14:iconst_1        
	//    9   15:iadd            
	//   10   16:istore_2        
		_index = i;
	//   11   17:aload_0         
	//   12   18:iload_2         
	//   13   19:putfield        #30  <Field int _index>
		if(_type == 1)
	//*  14   22:aload_0         
	//*  15   23:getfield        #23  <Field int _type>
	//*  16   26:iconst_1        
	//*  17   27:icmpne          36
			return tokenfilter.includeElement(i);
	//   18   30:aload_1         
	//   19   31:iload_2         
	//   20   32:invokevirtual   #93  <Method TokenFilter TokenFilter.includeElement(int)>
	//   21   35:areturn         
		else
			return tokenfilter.includeRootValue(i);
	//   22   36:aload_1         
	//   23   37:iload_2         
	//   24   38:invokevirtual   #96  <Method TokenFilter TokenFilter.includeRootValue(int)>
	//   25   41:areturn         
	}

	public TokenFilterContext closeArray(JsonGenerator jsongenerator)
		throws IOException
	{
		if(_startHandled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean _startHandled>
	//*   2    4:ifeq            11
			jsongenerator.writeEndArray();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #101 <Method void JsonGenerator.writeEndArray()>
		if(_filter != null && _filter != TokenFilter.INCLUDE_ALL)
	//*   5   11:aload_0         
	//*   6   12:getfield        #27  <Field TokenFilter _filter>
	//*   7   15:ifnull          35
	//*   8   18:aload_0         
	//*   9   19:getfield        #27  <Field TokenFilter _filter>
	//*  10   22:getstatic       #44  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  11   25:if_acmpeq       35
			_filter.filterFinishArray();
	//   12   28:aload_0         
	//   13   29:getfield        #27  <Field TokenFilter _filter>
	//   14   32:invokevirtual   #104 <Method void TokenFilter.filterFinishArray()>
		return _parent;
	//   15   35:aload_0         
	//   16   36:getfield        #25  <Field TokenFilterContext _parent>
	//   17   39:areturn         
	}

	public TokenFilterContext closeObject(JsonGenerator jsongenerator)
		throws IOException
	{
		if(_startHandled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean _startHandled>
	//*   2    4:ifeq            11
			jsongenerator.writeEndObject();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #108 <Method void JsonGenerator.writeEndObject()>
		if(_filter != null && _filter != TokenFilter.INCLUDE_ALL)
	//*   5   11:aload_0         
	//*   6   12:getfield        #27  <Field TokenFilter _filter>
	//*   7   15:ifnull          35
	//*   8   18:aload_0         
	//*   9   19:getfield        #27  <Field TokenFilter _filter>
	//*  10   22:getstatic       #44  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  11   25:if_acmpeq       35
			_filter.filterFinishObject();
	//   12   28:aload_0         
	//   13   29:getfield        #27  <Field TokenFilter _filter>
	//   14   32:invokevirtual   #111 <Method void TokenFilter.filterFinishObject()>
		return _parent;
	//   15   35:aload_0         
	//   16   36:getfield        #25  <Field TokenFilterContext _parent>
	//   17   39:areturn         
	}

	public TokenFilterContext createChildArrayContext(TokenFilter tokenfilter, boolean flag)
	{
		TokenFilterContext tokenfiltercontext = _child;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field TokenFilterContext _child>
	//    2    4:astore_3        
		if(tokenfiltercontext == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       28
		{
			tokenfilter = ((TokenFilter) (new TokenFilterContext(1, this, tokenfilter, flag)));
	//    5    9:new             #2   <Class TokenFilterContext>
	//    6   12:dup             
	//    7   13:iconst_1        
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokespecial   #65  <Method void TokenFilterContext(int, TokenFilterContext, TokenFilter, boolean)>
	//   12   20:astore_1        
			_child = ((TokenFilterContext) (tokenfilter));
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:putfield        #115 <Field TokenFilterContext _child>
			return ((TokenFilterContext) (tokenfilter));
	//   16   26:aload_1         
	//   17   27:areturn         
		} else
		{
			return tokenfiltercontext.reset(1, tokenfilter, flag);
	//   18   28:aload_3         
	//   19   29:iconst_1        
	//   20   30:aload_1         
	//   21   31:iload_2         
	//   22   32:invokevirtual   #119 <Method TokenFilterContext reset(int, TokenFilter, boolean)>
	//   23   35:areturn         
		}
	}

	public TokenFilterContext createChildObjectContext(TokenFilter tokenfilter, boolean flag)
	{
		TokenFilterContext tokenfiltercontext = _child;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field TokenFilterContext _child>
	//    2    4:astore_3        
		if(tokenfiltercontext == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       28
		{
			tokenfilter = ((TokenFilter) (new TokenFilterContext(2, this, tokenfilter, flag)));
	//    5    9:new             #2   <Class TokenFilterContext>
	//    6   12:dup             
	//    7   13:iconst_2        
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokespecial   #65  <Method void TokenFilterContext(int, TokenFilterContext, TokenFilter, boolean)>
	//   12   20:astore_1        
			_child = ((TokenFilterContext) (tokenfilter));
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:putfield        #115 <Field TokenFilterContext _child>
			return ((TokenFilterContext) (tokenfilter));
	//   16   26:aload_1         
	//   17   27:areturn         
		} else
		{
			return tokenfiltercontext.reset(2, tokenfilter, flag);
	//   18   28:aload_3         
	//   19   29:iconst_2        
	//   20   30:aload_1         
	//   21   31:iload_2         
	//   22   32:invokevirtual   #119 <Method TokenFilterContext reset(int, TokenFilter, boolean)>
	//   23   35:areturn         
		}
	}

	public TokenFilterContext findChildOf(TokenFilterContext tokenfiltercontext)
	{
		if(_parent == tokenfiltercontext)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field TokenFilterContext _parent>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		TokenFilterContext tokenfiltercontext2;
		for(TokenFilterContext tokenfiltercontext1 = _parent; tokenfiltercontext1 != null; tokenfiltercontext1 = tokenfiltercontext2)
	//*   6   10:aload_0         
	//*   7   11:getfield        #25  <Field TokenFilterContext _parent>
	//*   8   14:astore_2        
	//*   9   15:aload_2         
	//*  10   16:ifnull          36
		{
			tokenfiltercontext2 = tokenfiltercontext1._parent;
	//   11   19:aload_2         
	//   12   20:getfield        #25  <Field TokenFilterContext _parent>
	//   13   23:astore_3        
			if(tokenfiltercontext2 == tokenfiltercontext)
	//*  14   24:aload_3         
	//*  15   25:aload_1         
	//*  16   26:if_acmpne       31
				return tokenfiltercontext1;
	//   17   29:aload_2         
	//   18   30:areturn         
		}

	//   19   31:aload_3         
	//   20   32:astore_2        
	//*  21   33:goto            15
		return null;
	//   22   36:aconst_null     
	//   23   37:areturn         
	}

	public final String getCurrentName()
	{
		return _currentName;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String _currentName>
	//    2    4:areturn         
	}

	public Object getCurrentValue()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public TokenFilter getFilter()
	{
		return _filter;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field TokenFilter _filter>
	//    2    4:areturn         
	}

	public volatile JsonStreamContext getParent()
	{
		return ((JsonStreamContext) (getParent()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method TokenFilterContext getParent()>
	//    2    4:areturn         
	}

	public final TokenFilterContext getParent()
	{
		return _parent;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenFilterContext _parent>
	//    2    4:areturn         
	}

	public boolean isStartHandled()
	{
		return _startHandled;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field boolean _startHandled>
	//    2    4:ireturn         
	}

	public JsonToken nextTokenToRead()
	{
		if(!_startHandled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean _startHandled>
	//*   2    4:ifne            28
		{
			_startHandled = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #32  <Field boolean _startHandled>
			if(_type == 2)
	//*   6   12:aload_0         
	//*   7   13:getfield        #23  <Field int _type>
	//*   8   16:iconst_2        
	//*   9   17:icmpne          24
				return JsonToken.START_OBJECT;
	//   10   20:getstatic       #143 <Field JsonToken JsonToken.START_OBJECT>
	//   11   23:areturn         
			else
				return JsonToken.START_ARRAY;
	//   12   24:getstatic       #146 <Field JsonToken JsonToken.START_ARRAY>
	//   13   27:areturn         
		}
		if(_needToHandleName && _type == 2)
	//*  14   28:aload_0         
	//*  15   29:getfield        #34  <Field boolean _needToHandleName>
	//*  16   32:ifeq            52
	//*  17   35:aload_0         
	//*  18   36:getfield        #23  <Field int _type>
	//*  19   39:iconst_2        
	//*  20   40:icmpne          52
		{
			_needToHandleName = false;
	//   21   43:aload_0         
	//   22   44:iconst_0        
	//   23   45:putfield        #34  <Field boolean _needToHandleName>
			return JsonToken.FIELD_NAME;
	//   24   48:getstatic       #149 <Field JsonToken JsonToken.FIELD_NAME>
	//   25   51:areturn         
		} else
		{
			return null;
	//   26   52:aconst_null     
	//   27   53:areturn         
		}
	}

	protected TokenFilterContext reset(int i, TokenFilter tokenfilter, boolean flag)
	{
		_type = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #23  <Field int _type>
		_filter = tokenfilter;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field TokenFilter _filter>
		_index = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #30  <Field int _index>
		_currentName = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #48  <Field String _currentName>
		_startHandled = flag;
	//   12   20:aload_0         
	//   13   21:iload_3         
	//   14   22:putfield        #32  <Field boolean _startHandled>
		_needToHandleName = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #34  <Field boolean _needToHandleName>
		return this;
	//   18   30:aload_0         
	//   19   31:areturn         
	}

	public void setCurrentValue(Object obj)
	{
	//    0    0:return          
	}

	public TokenFilter setFieldName(String s)
		throws JsonProcessingException
	{
		_currentName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field String _currentName>
		_needToHandleName = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #34  <Field boolean _needToHandleName>
		return _filter;
	//    6   10:aload_0         
	//    7   11:getfield        #27  <Field TokenFilter _filter>
	//    8   14:areturn         
	}

	public void skipParentChecks()
	{
		_filter = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #27  <Field TokenFilter _filter>
		for(TokenFilterContext tokenfiltercontext = _parent; tokenfiltercontext != null; tokenfiltercontext = tokenfiltercontext._parent)
	//*   3    5:aload_0         
	//*   4    6:getfield        #25  <Field TokenFilterContext _parent>
	//*   5    9:astore_1        
	//*   6   10:aload_1         
	//*   7   11:ifnull          30
			_parent._filter = null;
	//    8   14:aload_0         
	//    9   15:getfield        #25  <Field TokenFilterContext _parent>
	//   10   18:aconst_null     
	//   11   19:putfield        #27  <Field TokenFilter _filter>

	//   12   22:aload_1         
	//   13   23:getfield        #25  <Field TokenFilterContext _parent>
	//   14   26:astore_1        
	//*  15   27:goto            10
	//   16   30:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(64);
	//    0    0:new             #71  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          64
	//    3    6:invokespecial   #160 <Method void StringBuilder(int)>
	//    4    9:astore_1        
		appendDesc(stringbuilder);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #69  <Method void appendDesc(StringBuilder)>
		return stringbuilder.toString();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #162 <Method String StringBuilder.toString()>
	//   10   19:areturn         
	}

	public void writeImmediatePath(JsonGenerator jsongenerator)
		throws IOException
	{
		if(_filter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field TokenFilter _filter>
	//*   2    4:ifnull          87
		{
			if(_filter == TokenFilter.INCLUDE_ALL)
	//*   3    7:aload_0         
	//*   4    8:getfield        #27  <Field TokenFilter _filter>
	//*   5   11:getstatic       #44  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*   6   14:if_acmpne       18
				return;
	//    7   17:return          
			if(_startHandled)
	//*   8   18:aload_0         
	//*   9   19:getfield        #32  <Field boolean _startHandled>
	//*  10   22:ifeq            41
			{
				if(_needToHandleName)
	//*  11   25:aload_0         
	//*  12   26:getfield        #34  <Field boolean _needToHandleName>
	//*  13   29:ifeq            86
				{
					jsongenerator.writeFieldName(_currentName);
	//   14   32:aload_1         
	//   15   33:aload_0         
	//   16   34:getfield        #48  <Field String _currentName>
	//   17   37:invokevirtual   #54  <Method void JsonGenerator.writeFieldName(String)>
					return;
	//   18   40:return          
				}
			} else
			{
				_startHandled = true;
	//   19   41:aload_0         
	//   20   42:iconst_1        
	//   21   43:putfield        #32  <Field boolean _startHandled>
				if(_type == 2)
	//*  22   46:aload_0         
	//*  23   47:getfield        #23  <Field int _type>
	//*  24   50:iconst_2        
	//*  25   51:icmpne          74
				{
					jsongenerator.writeStartObject();
	//   26   54:aload_1         
	//   27   55:invokevirtual   #57  <Method void JsonGenerator.writeStartObject()>
					if(_needToHandleName)
	//*  28   58:aload_0         
	//*  29   59:getfield        #34  <Field boolean _needToHandleName>
	//*  30   62:ifeq            86
					{
						jsongenerator.writeFieldName(_currentName);
	//   31   65:aload_1         
	//   32   66:aload_0         
	//   33   67:getfield        #48  <Field String _currentName>
	//   34   70:invokevirtual   #54  <Method void JsonGenerator.writeFieldName(String)>
						return;
	//   35   73:return          
					}
				} else
				if(_type == 1)
	//*  36   74:aload_0         
	//*  37   75:getfield        #23  <Field int _type>
	//*  38   78:iconst_1        
	//*  39   79:icmpne          86
					jsongenerator.writeStartArray();
	//   40   82:aload_1         
	//   41   83:invokevirtual   #60  <Method void JsonGenerator.writeStartArray()>
			}
			return;
	//   42   86:return          
		} else
		{
			return;
	//   43   87:return          
		}
	}

	public void writePath(JsonGenerator jsongenerator)
		throws IOException
	{
		if(_filter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field TokenFilter _filter>
	//*   2    4:ifnull          95
		{
			if(_filter == TokenFilter.INCLUDE_ALL)
	//*   3    7:aload_0         
	//*   4    8:getfield        #27  <Field TokenFilter _filter>
	//*   5   11:getstatic       #44  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*   6   14:if_acmpne       18
				return;
	//    7   17:return          
			if(_parent != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #25  <Field TokenFilterContext _parent>
	//*  10   22:ifnull          33
				_parent._writePath(jsongenerator);
	//   11   25:aload_0         
	//   12   26:getfield        #25  <Field TokenFilterContext _parent>
	//   13   29:aload_1         
	//   14   30:invokespecial   #46  <Method void _writePath(JsonGenerator)>
			if(_startHandled)
	//*  15   33:aload_0         
	//*  16   34:getfield        #32  <Field boolean _startHandled>
	//*  17   37:ifeq            56
			{
				if(_needToHandleName)
	//*  18   40:aload_0         
	//*  19   41:getfield        #34  <Field boolean _needToHandleName>
	//*  20   44:ifeq            94
				{
					jsongenerator.writeFieldName(_currentName);
	//   21   47:aload_1         
	//   22   48:aload_0         
	//   23   49:getfield        #48  <Field String _currentName>
	//   24   52:invokevirtual   #54  <Method void JsonGenerator.writeFieldName(String)>
					return;
	//   25   55:return          
				}
			} else
			{
				_startHandled = true;
	//   26   56:aload_0         
	//   27   57:iconst_1        
	//   28   58:putfield        #32  <Field boolean _startHandled>
				if(_type == 2)
	//*  29   61:aload_0         
	//*  30   62:getfield        #23  <Field int _type>
	//*  31   65:iconst_2        
	//*  32   66:icmpne          82
				{
					jsongenerator.writeStartObject();
	//   33   69:aload_1         
	//   34   70:invokevirtual   #57  <Method void JsonGenerator.writeStartObject()>
					jsongenerator.writeFieldName(_currentName);
	//   35   73:aload_1         
	//   36   74:aload_0         
	//   37   75:getfield        #48  <Field String _currentName>
	//   38   78:invokevirtual   #54  <Method void JsonGenerator.writeFieldName(String)>
					return;
	//   39   81:return          
				}
				if(_type == 1)
	//*  40   82:aload_0         
	//*  41   83:getfield        #23  <Field int _type>
	//*  42   86:iconst_1        
	//*  43   87:icmpne          94
					jsongenerator.writeStartArray();
	//   44   90:aload_1         
	//   45   91:invokevirtual   #60  <Method void JsonGenerator.writeStartArray()>
			}
			return;
	//   46   94:return          
		} else
		{
			return;
	//   47   95:return          
		}
	}

	protected TokenFilterContext _child;
	protected String _currentName;
	protected TokenFilter _filter;
	protected boolean _needToHandleName;
	protected final TokenFilterContext _parent;
	protected boolean _startHandled;
}
