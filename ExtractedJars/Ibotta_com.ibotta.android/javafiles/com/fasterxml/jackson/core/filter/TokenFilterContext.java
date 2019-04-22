// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.*;

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

	public static TokenFilterContext createRootContext(TokenFilter tokenfilter)
	{
		return new TokenFilterContext(0, ((TokenFilterContext) (null)), tokenfilter, true);
	//    0    0:new             #2   <Class TokenFilterContext>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:aconst_null     
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:invokespecial   #39  <Method void TokenFilterContext(int, TokenFilterContext, TokenFilter, boolean)>
	//    7   11:areturn         
	}

	protected void appendDesc(StringBuilder stringbuilder)
	{
		TokenFilterContext tokenfiltercontext = _parent;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenFilterContext _parent>
	//    2    4:astore_2        
		if(tokenfiltercontext != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			tokenfiltercontext.appendDesc(stringbuilder);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #43  <Method void appendDesc(StringBuilder)>
		if(_type == 2)
	//*   8   14:aload_0         
	//*   9   15:getfield        #23  <Field int _type>
	//*  10   18:iconst_2        
	//*  11   19:icmpne          77
		{
			stringbuilder.append('{');
	//   12   22:aload_1         
	//   13   23:bipush          123
	//   14   25:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//   15   28:pop             
			if(_currentName != null)
	//*  16   29:aload_0         
	//*  17   30:getfield        #51  <Field String _currentName>
	//*  18   33:ifnull          62
			{
				stringbuilder.append('"');
	//   19   36:aload_1         
	//   20   37:bipush          34
	//   21   39:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//   22   42:pop             
				stringbuilder.append(_currentName);
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:getfield        #51  <Field String _currentName>
	//   26   48:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
				stringbuilder.append('"');
	//   28   52:aload_1         
	//   29   53:bipush          34
	//   30   55:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//   31   58:pop             
			} else
	//*  32   59:goto            69
			{
				stringbuilder.append('?');
	//   33   62:aload_1         
	//   34   63:bipush          63
	//   35   65:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//   36   68:pop             
			}
			stringbuilder.append('}');
	//   37   69:aload_1         
	//   38   70:bipush          125
	//   39   72:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//   40   75:pop             
			return;
	//   41   76:return          
		}
		if(_type == 1)
	//*  42   77:aload_0         
	//*  43   78:getfield        #23  <Field int _type>
	//*  44   81:iconst_1        
	//*  45   82:icmpne          109
		{
			stringbuilder.append('[');
	//   46   85:aload_1         
	//   47   86:bipush          91
	//   48   88:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//   49   91:pop             
			stringbuilder.append(getCurrentIndex());
	//   50   92:aload_1         
	//   51   93:aload_0         
	//   52   94:invokevirtual   #58  <Method int getCurrentIndex()>
	//   53   97:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   54  100:pop             
			stringbuilder.append(']');
	//   55  101:aload_1         
	//   56  102:bipush          93
	//   57  104:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//   58  107:pop             
			return;
	//   59  108:return          
		} else
		{
			stringbuilder.append("/");
	//   60  109:aload_1         
	//   61  110:ldc1            #63  <String "/">
	//   62  112:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   63  115:pop             
			return;
	//   64  116:return          
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
	//   20   32:invokevirtual   #71  <Method TokenFilter TokenFilter.includeElement(int)>
	//   21   35:areturn         
		else
			return tokenfilter.includeRootValue(i);
	//   22   36:aload_1         
	//   23   37:iload_2         
	//   24   38:invokevirtual   #74  <Method TokenFilter TokenFilter.includeRootValue(int)>
	//   25   41:areturn         
	}

	public TokenFilterContext createChildArrayContext(TokenFilter tokenfilter, boolean flag)
	{
		TokenFilterContext tokenfiltercontext = _child;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field TokenFilterContext _child>
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
	//   11   17:invokespecial   #39  <Method void TokenFilterContext(int, TokenFilterContext, TokenFilter, boolean)>
	//   12   20:astore_1        
			_child = ((TokenFilterContext) (tokenfilter));
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:putfield        #78  <Field TokenFilterContext _child>
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
	//   22   32:invokevirtual   #82  <Method TokenFilterContext reset(int, TokenFilter, boolean)>
	//   23   35:areturn         
		}
	}

	public TokenFilterContext createChildObjectContext(TokenFilter tokenfilter, boolean flag)
	{
		TokenFilterContext tokenfiltercontext = _child;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field TokenFilterContext _child>
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
	//   11   17:invokespecial   #39  <Method void TokenFilterContext(int, TokenFilterContext, TokenFilter, boolean)>
	//   12   20:astore_1        
			_child = ((TokenFilterContext) (tokenfilter));
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:putfield        #78  <Field TokenFilterContext _child>
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
	//   22   32:invokevirtual   #82  <Method TokenFilterContext reset(int, TokenFilter, boolean)>
	//   23   35:areturn         
		}
	}

	public TokenFilterContext findChildOf(TokenFilterContext tokenfiltercontext)
	{
		TokenFilterContext tokenfiltercontext2 = _parent;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenFilterContext _parent>
	//    2    4:astore_3        
		TokenFilterContext tokenfiltercontext1 = tokenfiltercontext2;
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(tokenfiltercontext2 == tokenfiltercontext)
	//*   5    7:aload_3         
	//*   6    8:aload_1         
	//*   7    9:if_acmpne       14
			return this;
	//    8   12:aload_0         
	//    9   13:areturn         
		TokenFilterContext tokenfiltercontext3;
		for(; tokenfiltercontext1 != null; tokenfiltercontext1 = tokenfiltercontext3)
	//*  10   14:aload_2         
	//*  11   15:ifnull          35
		{
			tokenfiltercontext3 = tokenfiltercontext1._parent;
	//   12   18:aload_2         
	//   13   19:getfield        #25  <Field TokenFilterContext _parent>
	//   14   22:astore_3        
			if(tokenfiltercontext3 == tokenfiltercontext)
	//*  15   23:aload_3         
	//*  16   24:aload_1         
	//*  17   25:if_acmpne       30
				return tokenfiltercontext1;
	//   18   28:aload_2         
	//   19   29:areturn         
		}

	//   20   30:aload_3         
	//   21   31:astore_2        
	//*  22   32:goto            14
		return null;
	//   23   35:aconst_null     
	//   24   36:areturn         
	}

	public final String getCurrentName()
	{
		return _currentName;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String _currentName>
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
	//    1    1:invokevirtual   #96  <Method TokenFilterContext getParent()>
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
	//   10   20:getstatic       #106 <Field JsonToken JsonToken.START_OBJECT>
	//   11   23:areturn         
			else
				return JsonToken.START_ARRAY;
	//   12   24:getstatic       #109 <Field JsonToken JsonToken.START_ARRAY>
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
	//   24   48:getstatic       #112 <Field JsonToken JsonToken.FIELD_NAME>
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
	//   11   17:putfield        #51  <Field String _currentName>
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
	//    2    2:putfield        #51  <Field String _currentName>
		_needToHandleName = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #34  <Field boolean _needToHandleName>
		return _filter;
	//    6   10:aload_0         
	//    7   11:getfield        #27  <Field TokenFilter _filter>
	//    8   14:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(64);
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          64
	//    3    6:invokespecial   #123 <Method void StringBuilder(int)>
	//    4    9:astore_1        
		appendDesc(stringbuilder);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #43  <Method void appendDesc(StringBuilder)>
		return stringbuilder.toString();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   10   19:areturn         
	}

	protected TokenFilterContext _child;
	protected String _currentName;
	protected TokenFilter _filter;
	protected boolean _needToHandleName;
	protected final TokenFilterContext _parent;
	protected boolean _startHandled;
}
