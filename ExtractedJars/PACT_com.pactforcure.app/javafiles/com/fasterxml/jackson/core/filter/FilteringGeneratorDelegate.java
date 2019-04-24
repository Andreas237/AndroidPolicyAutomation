// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.JsonGeneratorDelegate;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.core.filter:
//			TokenFilterContext, TokenFilter

public class FilteringGeneratorDelegate extends JsonGeneratorDelegate
{

	public FilteringGeneratorDelegate(JsonGenerator jsongenerator, TokenFilter tokenfilter, boolean flag, boolean flag1)
	{
		super(jsongenerator, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #21  <Method void JsonGeneratorDelegate(JsonGenerator, boolean)>
		rootFilter = tokenfilter;
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:putfield        #23  <Field TokenFilter rootFilter>
		_itemFilter = tokenfilter;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #25  <Field TokenFilter _itemFilter>
		_filterContext = TokenFilterContext.createRootContext(tokenfilter);
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokestatic    #31  <Method TokenFilterContext TokenFilterContext.createRootContext(TokenFilter)>
	//   13   21:putfield        #33  <Field TokenFilterContext _filterContext>
		_includePath = flag;
	//   14   24:aload_0         
	//   15   25:iload_3         
	//   16   26:putfield        #35  <Field boolean _includePath>
		_allowMultipleMatches = flag1;
	//   17   29:aload_0         
	//   18   30:iload           4
	//   19   32:putfield        #37  <Field boolean _allowMultipleMatches>
	//   20   35:return          
	}

	protected boolean _checkBinaryWrite()
		throws IOException
	{
		if(_itemFilter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//*   2    4:ifnonnull       9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
		{
			if(_itemFilter == TokenFilter.INCLUDE_ALL)
	//*   5    9:aload_0         
	//*   6   10:getfield        #25  <Field TokenFilter _itemFilter>
	//*   7   13:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*   8   16:if_acmpne       21
				return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
			if(_itemFilter.includeBinary())
	//*  11   21:aload_0         
	//*  12   22:getfield        #25  <Field TokenFilter _itemFilter>
	//*  13   25:invokevirtual   #50  <Method boolean TokenFilter.includeBinary()>
	//*  14   28:ifeq            7
			{
				_checkParentPath();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #54  <Method void _checkParentPath()>
				return true;
	//   17   35:iconst_1        
	//   18   36:ireturn         
			}
		}
		return false;
	}

	protected void _checkParentPath()
		throws IOException
	{
		_matchCount = _matchCount + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #57  <Field int _matchCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #57  <Field int _matchCount>
		if(_includePath)
	//*   6   10:aload_0         
	//*   7   11:getfield        #35  <Field boolean _includePath>
	//*   8   14:ifeq            28
			_filterContext.writePath(_flddelegate);
	//    9   17:aload_0         
	//   10   18:getfield        #33  <Field TokenFilterContext _filterContext>
	//   11   21:aload_0         
	//   12   22:getfield        #61  <Field JsonGenerator _flddelegate>
	//   13   25:invokevirtual   #65  <Method void TokenFilterContext.writePath(JsonGenerator)>
		if(!_allowMultipleMatches)
	//*  14   28:aload_0         
	//*  15   29:getfield        #37  <Field boolean _allowMultipleMatches>
	//*  16   32:ifne            42
			_filterContext.skipParentChecks();
	//   17   35:aload_0         
	//   18   36:getfield        #33  <Field TokenFilterContext _filterContext>
	//   19   39:invokevirtual   #68  <Method void TokenFilterContext.skipParentChecks()>
	//   20   42:return          
	}

	protected void _checkPropertyParentPath()
		throws IOException
	{
		_matchCount = _matchCount + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #57  <Field int _matchCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #57  <Field int _matchCount>
		if(!_includePath) goto _L2; else goto _L1
	//    6   10:aload_0         
	//    7   11:getfield        #35  <Field boolean _includePath>
	//    8   14:ifeq            43
_L1:
		_filterContext.writePath(_flddelegate);
	//    9   17:aload_0         
	//   10   18:getfield        #33  <Field TokenFilterContext _filterContext>
	//   11   21:aload_0         
	//   12   22:getfield        #61  <Field JsonGenerator _flddelegate>
	//   13   25:invokevirtual   #65  <Method void TokenFilterContext.writePath(JsonGenerator)>
_L4:
		if(!_allowMultipleMatches)
	//*  14   28:aload_0         
	//*  15   29:getfield        #37  <Field boolean _allowMultipleMatches>
	//*  16   32:ifne            42
			_filterContext.skipParentChecks();
	//   17   35:aload_0         
	//   18   36:getfield        #33  <Field TokenFilterContext _filterContext>
	//   19   39:invokevirtual   #68  <Method void TokenFilterContext.skipParentChecks()>
		return;
	//   20   42:return          
_L2:
		if(_includeImmediateParent)
	//*  21   43:aload_0         
	//*  22   44:getfield        #71  <Field boolean _includeImmediateParent>
	//*  23   47:ifeq            28
			_filterContext.writeImmediatePath(_flddelegate);
	//   24   50:aload_0         
	//   25   51:getfield        #33  <Field TokenFilterContext _filterContext>
	//   26   54:aload_0         
	//   27   55:getfield        #61  <Field JsonGenerator _flddelegate>
	//   28   58:invokevirtual   #74  <Method void TokenFilterContext.writeImmediatePath(JsonGenerator)>
		if(true) goto _L4; else goto _L3
	//   29   61:goto            28
_L3:
	}

	protected boolean _checkRawValueWrite()
		throws IOException
	{
		if(_itemFilter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//*   2    4:ifnonnull       9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
		{
			if(_itemFilter == TokenFilter.INCLUDE_ALL)
	//*   5    9:aload_0         
	//*   6   10:getfield        #25  <Field TokenFilter _itemFilter>
	//*   7   13:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*   8   16:if_acmpne       21
				return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
			if(_itemFilter.includeRawValue())
	//*  11   21:aload_0         
	//*  12   22:getfield        #25  <Field TokenFilter _itemFilter>
	//*  13   25:invokevirtual   #78  <Method boolean TokenFilter.includeRawValue()>
	//*  14   28:ifeq            7
			{
				_checkParentPath();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #54  <Method void _checkParentPath()>
				return true;
	//   17   35:iconst_1        
	//   18   36:ireturn         
			}
		}
		return false;
	}

	public TokenFilter getFilter()
	{
		return rootFilter;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TokenFilter rootFilter>
	//    2    4:areturn         
	}

	public JsonStreamContext getFilterContext()
	{
		return ((JsonStreamContext) (_filterContext));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field TokenFilterContext _filterContext>
	//    2    4:areturn         
	}

	public int getMatchCount()
	{
		return _matchCount;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int _matchCount>
	//    2    4:ireturn         
	}

	public JsonStreamContext getOutputContext()
	{
		return ((JsonStreamContext) (_filterContext));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field TokenFilterContext _filterContext>
	//    2    4:areturn         
	}

	public int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
		throws IOException
	{
		if(_checkBinaryWrite())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #89  <Method boolean _checkBinaryWrite()>
	//*   2    4:ifeq            18
			return _flddelegate.writeBinary(base64variant, inputstream, i);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #93  <Method int JsonGenerator.writeBinary(Base64Variant, InputStream, int)>
	//    9   17:ireturn         
		else
			return -1;
	//   10   18:iconst_m1       
	//   11   19:ireturn         
	}

	public void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
		throws IOException
	{
		if(_checkBinaryWrite())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #89  <Method boolean _checkBinaryWrite()>
	//*   2    4:ifeq            19
			_flddelegate.writeBinary(base64variant, abyte0, i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:iload_3         
	//    8   14:iload           4
	//    9   16:invokevirtual   #96  <Method void JsonGenerator.writeBinary(Base64Variant, byte[], int, int)>
	//   10   19:return          
	}

	public void writeBoolean(boolean flag)
		throws IOException
	{
		if(_itemFilter != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//    2    4:ifnonnull       8
_L1:
		return;
	//    3    7:return          
_L2:
		TokenFilter tokenfilter;
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
			break; /* Loop/switch isn't completed */
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field TokenFilter _itemFilter>
	//    6   12:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//    7   15:if_acmpeq       53
	//*   8   18:aload_0         
	//*   9   19:getfield        #33  <Field TokenFilterContext _filterContext>
	//*  10   22:aload_0         
	//*  11   23:getfield        #25  <Field TokenFilter _itemFilter>
	//*  12   26:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//*  13   29:astore_2        
		if((tokenfilter = _filterContext.checkValue(_itemFilter)) == null || tokenfilter != TokenFilter.INCLUDE_ALL && !tokenfilter.includeBoolean(flag))
			continue; /* Loop/switch isn't completed */
	//   14   30:aload_2         
	//   15   31:ifnull          7
	//   16   34:aload_2         
	//   17   35:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//   18   38:if_acmpeq       49
	//   19   41:aload_2         
	//   20   42:iload_1         
	//   21   43:invokevirtual   #106 <Method boolean TokenFilter.includeBoolean(boolean)>
	//   22   46:ifeq            7
		_checkParentPath();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #54  <Method void _checkParentPath()>
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		_flddelegate.writeBoolean(flag);
	//   25   53:aload_0         
	//   26   54:getfield        #61  <Field JsonGenerator _flddelegate>
	//   27   57:iload_1         
	//   28   58:invokevirtual   #108 <Method void JsonGenerator.writeBoolean(boolean)>
		return;
	//   29   61:return          
	}

	public void writeEndArray()
		throws IOException
	{
		_filterContext = _filterContext.closeArray(_flddelegate);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field TokenFilterContext _filterContext>
	//    3    5:aload_0         
	//    4    6:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5    9:invokevirtual   #113 <Method TokenFilterContext TokenFilterContext.closeArray(JsonGenerator)>
	//    6   12:putfield        #33  <Field TokenFilterContext _filterContext>
		if(_filterContext != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #33  <Field TokenFilterContext _filterContext>
	//*   9   19:ifnull          33
			_itemFilter = _filterContext.getFilter();
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #33  <Field TokenFilterContext _filterContext>
	//   13   27:invokevirtual   #115 <Method TokenFilter TokenFilterContext.getFilter()>
	//   14   30:putfield        #25  <Field TokenFilter _itemFilter>
	//   15   33:return          
	}

	public void writeEndObject()
		throws IOException
	{
		_filterContext = _filterContext.closeObject(_flddelegate);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field TokenFilterContext _filterContext>
	//    3    5:aload_0         
	//    4    6:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5    9:invokevirtual   #119 <Method TokenFilterContext TokenFilterContext.closeObject(JsonGenerator)>
	//    6   12:putfield        #33  <Field TokenFilterContext _filterContext>
		if(_filterContext != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #33  <Field TokenFilterContext _filterContext>
	//*   9   19:ifnull          33
			_itemFilter = _filterContext.getFilter();
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #33  <Field TokenFilterContext _filterContext>
	//   13   27:invokevirtual   #115 <Method TokenFilter TokenFilterContext.getFilter()>
	//   14   30:putfield        #25  <Field TokenFilter _itemFilter>
	//   15   33:return          
	}

	public void writeFieldName(SerializableString serializablestring)
		throws IOException
	{
		TokenFilter tokenfilter = _filterContext.setFieldName(serializablestring.getValue());
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field TokenFilterContext _filterContext>
	//    2    4:aload_1         
	//    3    5:invokeinterface #127 <Method String SerializableString.getValue()>
	//    4   10:invokevirtual   #131 <Method TokenFilter TokenFilterContext.setFieldName(String)>
	//    5   13:astore_2        
		if(tokenfilter == null)
	//*   6   14:aload_2         
	//*   7   15:ifnonnull       24
		{
			_itemFilter = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #25  <Field TokenFilter _itemFilter>
		} else
	//*  11   23:return          
		{
			if(tokenfilter == TokenFilter.INCLUDE_ALL)
	//*  12   24:aload_2         
	//*  13   25:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  14   28:if_acmpne       45
			{
				_itemFilter = tokenfilter;
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:putfield        #25  <Field TokenFilter _itemFilter>
				_flddelegate.writeFieldName(serializablestring);
	//   18   36:aload_0         
	//   19   37:getfield        #61  <Field JsonGenerator _flddelegate>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #133 <Method void JsonGenerator.writeFieldName(SerializableString)>
				return;
	//   22   44:return          
			}
			serializablestring = ((SerializableString) (tokenfilter.includeProperty(serializablestring.getValue())));
	//   23   45:aload_2         
	//   24   46:aload_1         
	//   25   47:invokeinterface #127 <Method String SerializableString.getValue()>
	//   26   52:invokevirtual   #136 <Method TokenFilter TokenFilter.includeProperty(String)>
	//   27   55:astore_1        
			_itemFilter = ((TokenFilter) (serializablestring));
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:putfield        #25  <Field TokenFilter _itemFilter>
			if(serializablestring == TokenFilter.INCLUDE_ALL)
	//*  31   61:aload_1         
	//*  32   62:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  33   65:if_acmpne       23
			{
				_checkPropertyParentPath();
	//   34   68:aload_0         
	//   35   69:invokevirtual   #138 <Method void _checkPropertyParentPath()>
				return;
	//   36   72:return          
			}
		}
	}

	public void writeFieldName(String s)
		throws IOException
	{
		TokenFilter tokenfilter = _filterContext.setFieldName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field TokenFilterContext _filterContext>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #131 <Method TokenFilter TokenFilterContext.setFieldName(String)>
	//    4    8:astore_2        
		if(tokenfilter == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       19
		{
			_itemFilter = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #25  <Field TokenFilter _itemFilter>
		} else
	//*  10   18:return          
		{
			if(tokenfilter == TokenFilter.INCLUDE_ALL)
	//*  11   19:aload_2         
	//*  12   20:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  13   23:if_acmpne       40
			{
				_itemFilter = tokenfilter;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #25  <Field TokenFilter _itemFilter>
				_flddelegate.writeFieldName(s);
	//   17   31:aload_0         
	//   18   32:getfield        #61  <Field JsonGenerator _flddelegate>
	//   19   35:aload_1         
	//   20   36:invokevirtual   #141 <Method void JsonGenerator.writeFieldName(String)>
				return;
	//   21   39:return          
			}
			s = ((String) (tokenfilter.includeProperty(s)));
	//   22   40:aload_2         
	//   23   41:aload_1         
	//   24   42:invokevirtual   #136 <Method TokenFilter TokenFilter.includeProperty(String)>
	//   25   45:astore_1        
			_itemFilter = ((TokenFilter) (s));
	//   26   46:aload_0         
	//   27   47:aload_1         
	//   28   48:putfield        #25  <Field TokenFilter _itemFilter>
			if(s == TokenFilter.INCLUDE_ALL)
	//*  29   51:aload_1         
	//*  30   52:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  31   55:if_acmpne       18
			{
				_checkPropertyParentPath();
	//   32   58:aload_0         
	//   33   59:invokevirtual   #138 <Method void _checkPropertyParentPath()>
				return;
	//   34   62:return          
			}
		}
	}

	public void writeNull()
		throws IOException
	{
		if(_itemFilter != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//    2    4:ifnonnull       8
_L1:
		return;
	//    3    7:return          
_L2:
		TokenFilter tokenfilter;
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
			break; /* Loop/switch isn't completed */
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field TokenFilter _itemFilter>
	//    6   12:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//    7   15:if_acmpeq       52
	//*   8   18:aload_0         
	//*   9   19:getfield        #33  <Field TokenFilterContext _filterContext>
	//*  10   22:aload_0         
	//*  11   23:getfield        #25  <Field TokenFilter _itemFilter>
	//*  12   26:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//*  13   29:astore_1        
		if((tokenfilter = _filterContext.checkValue(_itemFilter)) == null || tokenfilter != TokenFilter.INCLUDE_ALL && !tokenfilter.includeNull())
			continue; /* Loop/switch isn't completed */
	//   14   30:aload_1         
	//   15   31:ifnull          7
	//   16   34:aload_1         
	//   17   35:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//   18   38:if_acmpeq       48
	//   19   41:aload_1         
	//   20   42:invokevirtual   #145 <Method boolean TokenFilter.includeNull()>
	//   21   45:ifeq            7
		_checkParentPath();
	//   22   48:aload_0         
	//   23   49:invokevirtual   #54  <Method void _checkParentPath()>
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		_flddelegate.writeNull();
	//   24   52:aload_0         
	//   25   53:getfield        #61  <Field JsonGenerator _flddelegate>
	//   26   56:invokevirtual   #147 <Method void JsonGenerator.writeNull()>
		return;
	//   27   59:return          
	}

	public void writeNumber(double d)
		throws IOException
	{
		if(_itemFilter != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//    2    4:ifnonnull       8
_L1:
		return;
	//    3    7:return          
_L2:
		TokenFilter tokenfilter;
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
			break; /* Loop/switch isn't completed */
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field TokenFilter _itemFilter>
	//    6   12:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//    7   15:if_acmpeq       53
	//*   8   18:aload_0         
	//*   9   19:getfield        #33  <Field TokenFilterContext _filterContext>
	//*  10   22:aload_0         
	//*  11   23:getfield        #25  <Field TokenFilter _itemFilter>
	//*  12   26:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//*  13   29:astore_3        
		if((tokenfilter = _filterContext.checkValue(_itemFilter)) == null || tokenfilter != TokenFilter.INCLUDE_ALL && !tokenfilter.includeNumber(d))
			continue; /* Loop/switch isn't completed */
	//   14   30:aload_3         
	//   15   31:ifnull          7
	//   16   34:aload_3         
	//   17   35:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//   18   38:if_acmpeq       49
	//   19   41:aload_3         
	//   20   42:dload_1         
	//   21   43:invokevirtual   #153 <Method boolean TokenFilter.includeNumber(double)>
	//   22   46:ifeq            7
		_checkParentPath();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #54  <Method void _checkParentPath()>
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		_flddelegate.writeNumber(d);
	//   25   53:aload_0         
	//   26   54:getfield        #61  <Field JsonGenerator _flddelegate>
	//   27   57:dload_1         
	//   28   58:invokevirtual   #155 <Method void JsonGenerator.writeNumber(double)>
		return;
	//   29   61:return          
	}

	public void writeNumber(float f)
		throws IOException
	{
		if(_itemFilter != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//    2    4:ifnonnull       8
_L1:
		return;
	//    3    7:return          
_L2:
		TokenFilter tokenfilter;
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
			break; /* Loop/switch isn't completed */
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field TokenFilter _itemFilter>
	//    6   12:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//    7   15:if_acmpeq       53
	//*   8   18:aload_0         
	//*   9   19:getfield        #33  <Field TokenFilterContext _filterContext>
	//*  10   22:aload_0         
	//*  11   23:getfield        #25  <Field TokenFilter _itemFilter>
	//*  12   26:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//*  13   29:astore_2        
		if((tokenfilter = _filterContext.checkValue(_itemFilter)) == null || tokenfilter != TokenFilter.INCLUDE_ALL && !tokenfilter.includeNumber(f))
			continue; /* Loop/switch isn't completed */
	//   14   30:aload_2         
	//   15   31:ifnull          7
	//   16   34:aload_2         
	//   17   35:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//   18   38:if_acmpeq       49
	//   19   41:aload_2         
	//   20   42:fload_1         
	//   21   43:invokevirtual   #159 <Method boolean TokenFilter.includeNumber(float)>
	//   22   46:ifeq            7
		_checkParentPath();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #54  <Method void _checkParentPath()>
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		_flddelegate.writeNumber(f);
	//   25   53:aload_0         
	//   26   54:getfield        #61  <Field JsonGenerator _flddelegate>
	//   27   57:fload_1         
	//   28   58:invokevirtual   #161 <Method void JsonGenerator.writeNumber(float)>
		return;
	//   29   61:return          
	}

	public void writeNumber(int i)
		throws IOException
	{
		if(_itemFilter != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//    2    4:ifnonnull       8
_L1:
		return;
	//    3    7:return          
_L2:
		TokenFilter tokenfilter;
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
			break; /* Loop/switch isn't completed */
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field TokenFilter _itemFilter>
	//    6   12:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//    7   15:if_acmpeq       53
	//*   8   18:aload_0         
	//*   9   19:getfield        #33  <Field TokenFilterContext _filterContext>
	//*  10   22:aload_0         
	//*  11   23:getfield        #25  <Field TokenFilter _itemFilter>
	//*  12   26:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//*  13   29:astore_2        
		if((tokenfilter = _filterContext.checkValue(_itemFilter)) == null || tokenfilter != TokenFilter.INCLUDE_ALL && !tokenfilter.includeNumber(i))
			continue; /* Loop/switch isn't completed */
	//   14   30:aload_2         
	//   15   31:ifnull          7
	//   16   34:aload_2         
	//   17   35:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//   18   38:if_acmpeq       49
	//   19   41:aload_2         
	//   20   42:iload_1         
	//   21   43:invokevirtual   #165 <Method boolean TokenFilter.includeNumber(int)>
	//   22   46:ifeq            7
		_checkParentPath();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #54  <Method void _checkParentPath()>
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		_flddelegate.writeNumber(i);
	//   25   53:aload_0         
	//   26   54:getfield        #61  <Field JsonGenerator _flddelegate>
	//   27   57:iload_1         
	//   28   58:invokevirtual   #167 <Method void JsonGenerator.writeNumber(int)>
		return;
	//   29   61:return          
	}

	public void writeNumber(long l)
		throws IOException
	{
		if(_itemFilter != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//    2    4:ifnonnull       8
_L1:
		return;
	//    3    7:return          
_L2:
		TokenFilter tokenfilter;
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
			break; /* Loop/switch isn't completed */
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field TokenFilter _itemFilter>
	//    6   12:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//    7   15:if_acmpeq       53
	//*   8   18:aload_0         
	//*   9   19:getfield        #33  <Field TokenFilterContext _filterContext>
	//*  10   22:aload_0         
	//*  11   23:getfield        #25  <Field TokenFilter _itemFilter>
	//*  12   26:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//*  13   29:astore_3        
		if((tokenfilter = _filterContext.checkValue(_itemFilter)) == null || tokenfilter != TokenFilter.INCLUDE_ALL && !tokenfilter.includeNumber(l))
			continue; /* Loop/switch isn't completed */
	//   14   30:aload_3         
	//   15   31:ifnull          7
	//   16   34:aload_3         
	//   17   35:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//   18   38:if_acmpeq       49
	//   19   41:aload_3         
	//   20   42:lload_1         
	//   21   43:invokevirtual   #171 <Method boolean TokenFilter.includeNumber(long)>
	//   22   46:ifeq            7
		_checkParentPath();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #54  <Method void _checkParentPath()>
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		_flddelegate.writeNumber(l);
	//   25   53:aload_0         
	//   26   54:getfield        #61  <Field JsonGenerator _flddelegate>
	//   27   57:lload_1         
	//   28   58:invokevirtual   #173 <Method void JsonGenerator.writeNumber(long)>
		return;
	//   29   61:return          
	}

	public void writeNumber(String s)
		throws IOException, UnsupportedOperationException
	{
		if(_itemFilter != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//    2    4:ifnonnull       8
_L1:
		return;
	//    3    7:return          
_L2:
		TokenFilter tokenfilter;
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
			break; /* Loop/switch isn't completed */
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field TokenFilter _itemFilter>
	//    6   12:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//    7   15:if_acmpeq       52
	//*   8   18:aload_0         
	//*   9   19:getfield        #33  <Field TokenFilterContext _filterContext>
	//*  10   22:aload_0         
	//*  11   23:getfield        #25  <Field TokenFilter _itemFilter>
	//*  12   26:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//*  13   29:astore_2        
		if((tokenfilter = _filterContext.checkValue(_itemFilter)) == null || tokenfilter != TokenFilter.INCLUDE_ALL && !tokenfilter.includeRawValue())
			continue; /* Loop/switch isn't completed */
	//   14   30:aload_2         
	//   15   31:ifnull          7
	//   16   34:aload_2         
	//   17   35:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//   18   38:if_acmpeq       48
	//   19   41:aload_2         
	//   20   42:invokevirtual   #78  <Method boolean TokenFilter.includeRawValue()>
	//   21   45:ifeq            7
		_checkParentPath();
	//   22   48:aload_0         
	//   23   49:invokevirtual   #54  <Method void _checkParentPath()>
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		_flddelegate.writeNumber(s);
	//   24   52:aload_0         
	//   25   53:getfield        #61  <Field JsonGenerator _flddelegate>
	//   26   56:aload_1         
	//   27   57:invokevirtual   #177 <Method void JsonGenerator.writeNumber(String)>
		return;
	//   28   60:return          
	}

	public void writeNumber(BigDecimal bigdecimal)
		throws IOException
	{
		if(_itemFilter != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//    2    4:ifnonnull       8
_L1:
		return;
	//    3    7:return          
_L2:
		TokenFilter tokenfilter;
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
			break; /* Loop/switch isn't completed */
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field TokenFilter _itemFilter>
	//    6   12:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//    7   15:if_acmpeq       53
	//*   8   18:aload_0         
	//*   9   19:getfield        #33  <Field TokenFilterContext _filterContext>
	//*  10   22:aload_0         
	//*  11   23:getfield        #25  <Field TokenFilter _itemFilter>
	//*  12   26:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//*  13   29:astore_2        
		if((tokenfilter = _filterContext.checkValue(_itemFilter)) == null || tokenfilter != TokenFilter.INCLUDE_ALL && !tokenfilter.includeNumber(bigdecimal))
			continue; /* Loop/switch isn't completed */
	//   14   30:aload_2         
	//   15   31:ifnull          7
	//   16   34:aload_2         
	//   17   35:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//   18   38:if_acmpeq       49
	//   19   41:aload_2         
	//   20   42:aload_1         
	//   21   43:invokevirtual   #181 <Method boolean TokenFilter.includeNumber(BigDecimal)>
	//   22   46:ifeq            7
		_checkParentPath();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #54  <Method void _checkParentPath()>
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		_flddelegate.writeNumber(bigdecimal);
	//   25   53:aload_0         
	//   26   54:getfield        #61  <Field JsonGenerator _flddelegate>
	//   27   57:aload_1         
	//   28   58:invokevirtual   #183 <Method void JsonGenerator.writeNumber(BigDecimal)>
		return;
	//   29   61:return          
	}

	public void writeNumber(BigInteger biginteger)
		throws IOException
	{
		if(_itemFilter != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//    2    4:ifnonnull       8
_L1:
		return;
	//    3    7:return          
_L2:
		TokenFilter tokenfilter;
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
			break; /* Loop/switch isn't completed */
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field TokenFilter _itemFilter>
	//    6   12:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//    7   15:if_acmpeq       53
	//*   8   18:aload_0         
	//*   9   19:getfield        #33  <Field TokenFilterContext _filterContext>
	//*  10   22:aload_0         
	//*  11   23:getfield        #25  <Field TokenFilter _itemFilter>
	//*  12   26:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//*  13   29:astore_2        
		if((tokenfilter = _filterContext.checkValue(_itemFilter)) == null || tokenfilter != TokenFilter.INCLUDE_ALL && !tokenfilter.includeNumber(biginteger))
			continue; /* Loop/switch isn't completed */
	//   14   30:aload_2         
	//   15   31:ifnull          7
	//   16   34:aload_2         
	//   17   35:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//   18   38:if_acmpeq       49
	//   19   41:aload_2         
	//   20   42:aload_1         
	//   21   43:invokevirtual   #187 <Method boolean TokenFilter.includeNumber(BigInteger)>
	//   22   46:ifeq            7
		_checkParentPath();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #54  <Method void _checkParentPath()>
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		_flddelegate.writeNumber(biginteger);
	//   25   53:aload_0         
	//   26   54:getfield        #61  <Field JsonGenerator _flddelegate>
	//   27   57:aload_1         
	//   28   58:invokevirtual   #189 <Method void JsonGenerator.writeNumber(BigInteger)>
		return;
	//   29   61:return          
	}

	public void writeNumber(short word0)
		throws IOException
	{
		if(_itemFilter != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//    2    4:ifnonnull       8
_L1:
		return;
	//    3    7:return          
_L2:
		TokenFilter tokenfilter;
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
			break; /* Loop/switch isn't completed */
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field TokenFilter _itemFilter>
	//    6   12:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//    7   15:if_acmpeq       53
	//*   8   18:aload_0         
	//*   9   19:getfield        #33  <Field TokenFilterContext _filterContext>
	//*  10   22:aload_0         
	//*  11   23:getfield        #25  <Field TokenFilter _itemFilter>
	//*  12   26:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//*  13   29:astore_2        
		if((tokenfilter = _filterContext.checkValue(_itemFilter)) == null || tokenfilter != TokenFilter.INCLUDE_ALL && !tokenfilter.includeNumber(((int) (word0))))
			continue; /* Loop/switch isn't completed */
	//   14   30:aload_2         
	//   15   31:ifnull          7
	//   16   34:aload_2         
	//   17   35:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//   18   38:if_acmpeq       49
	//   19   41:aload_2         
	//   20   42:iload_1         
	//   21   43:invokevirtual   #165 <Method boolean TokenFilter.includeNumber(int)>
	//   22   46:ifeq            7
		_checkParentPath();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #54  <Method void _checkParentPath()>
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		_flddelegate.writeNumber(word0);
	//   25   53:aload_0         
	//   26   54:getfield        #61  <Field JsonGenerator _flddelegate>
	//   27   57:iload_1         
	//   28   58:invokevirtual   #192 <Method void JsonGenerator.writeNumber(short)>
		return;
	//   29   61:return          
	}

	public void writeObjectId(Object obj)
		throws IOException
	{
		if(_itemFilter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//*   2    4:ifnull          15
			_flddelegate.writeObjectId(obj);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #196 <Method void JsonGenerator.writeObjectId(Object)>
	//    7   15:return          
	}

	public void writeObjectRef(Object obj)
		throws IOException
	{
		if(_itemFilter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//*   2    4:ifnull          15
			_flddelegate.writeObjectRef(obj);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #199 <Method void JsonGenerator.writeObjectRef(Object)>
	//    7   15:return          
	}

	public void writeOmittedField(String s)
		throws IOException
	{
		if(_itemFilter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//*   2    4:ifnull          15
			_flddelegate.writeOmittedField(s);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #202 <Method void JsonGenerator.writeOmittedField(String)>
	//    7   15:return          
	}

	public void writeRaw(char c)
		throws IOException
	{
		if(_checkRawValueWrite())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #206 <Method boolean _checkRawValueWrite()>
	//*   2    4:ifeq            15
			_flddelegate.writeRaw(c);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #208 <Method void JsonGenerator.writeRaw(char)>
	//    7   15:return          
	}

	public void writeRaw(SerializableString serializablestring)
		throws IOException
	{
		if(_checkRawValueWrite())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #206 <Method boolean _checkRawValueWrite()>
	//*   2    4:ifeq            15
			_flddelegate.writeRaw(serializablestring);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #210 <Method void JsonGenerator.writeRaw(SerializableString)>
	//    7   15:return          
	}

	public void writeRaw(String s)
		throws IOException
	{
		if(_checkRawValueWrite())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #206 <Method boolean _checkRawValueWrite()>
	//*   2    4:ifeq            15
			_flddelegate.writeRaw(s);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #212 <Method void JsonGenerator.writeRaw(String)>
	//    7   15:return          
	}

	public void writeRaw(String s, int i, int j)
		throws IOException
	{
		if(_checkRawValueWrite())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #206 <Method boolean _checkRawValueWrite()>
	//*   2    4:ifeq            15
			_flddelegate.writeRaw(s);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #212 <Method void JsonGenerator.writeRaw(String)>
	//    7   15:return          
	}

	public void writeRaw(char ac[], int i, int j)
		throws IOException
	{
		if(_checkRawValueWrite())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #206 <Method boolean _checkRawValueWrite()>
	//*   2    4:ifeq            17
			_flddelegate.writeRaw(ac, i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #216 <Method void JsonGenerator.writeRaw(char[], int, int)>
	//    9   17:return          
	}

	public void writeRawUTF8String(byte abyte0[], int i, int j)
		throws IOException
	{
		if(_checkRawValueWrite())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #206 <Method boolean _checkRawValueWrite()>
	//*   2    4:ifeq            17
			_flddelegate.writeRawUTF8String(abyte0, i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #220 <Method void JsonGenerator.writeRawUTF8String(byte[], int, int)>
	//    9   17:return          
	}

	public void writeRawValue(String s)
		throws IOException
	{
		if(_checkRawValueWrite())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #206 <Method boolean _checkRawValueWrite()>
	//*   2    4:ifeq            15
			_flddelegate.writeRaw(s);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #212 <Method void JsonGenerator.writeRaw(String)>
	//    7   15:return          
	}

	public void writeRawValue(String s, int i, int j)
		throws IOException
	{
		if(_checkRawValueWrite())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #206 <Method boolean _checkRawValueWrite()>
	//*   2    4:ifeq            17
			_flddelegate.writeRaw(s, i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #223 <Method void JsonGenerator.writeRaw(String, int, int)>
	//    9   17:return          
	}

	public void writeRawValue(char ac[], int i, int j)
		throws IOException
	{
		if(_checkRawValueWrite())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #206 <Method boolean _checkRawValueWrite()>
	//*   2    4:ifeq            17
			_flddelegate.writeRaw(ac, i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #216 <Method void JsonGenerator.writeRaw(char[], int, int)>
	//    9   17:return          
	}

	public void writeStartArray()
		throws IOException
	{
		if(_itemFilter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//*   2    4:ifnonnull       21
		{
			_filterContext = _filterContext.createChildArrayContext(((TokenFilter) (null)), false);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field TokenFilterContext _filterContext>
	//    6   12:aconst_null     
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #228 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//    9   17:putfield        #33  <Field TokenFilterContext _filterContext>
			return;
	//   10   20:return          
		}
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
	//*  11   21:aload_0         
	//*  12   22:getfield        #25  <Field TokenFilter _itemFilter>
	//*  13   25:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  14   28:if_acmpne       55
		{
			_filterContext = _filterContext.createChildArrayContext(_itemFilter, true);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #33  <Field TokenFilterContext _filterContext>
	//   18   36:aload_0         
	//   19   37:getfield        #25  <Field TokenFilter _itemFilter>
	//   20   40:iconst_1        
	//   21   41:invokevirtual   #228 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//   22   44:putfield        #33  <Field TokenFilterContext _filterContext>
			_flddelegate.writeStartArray();
	//   23   47:aload_0         
	//   24   48:getfield        #61  <Field JsonGenerator _flddelegate>
	//   25   51:invokevirtual   #230 <Method void JsonGenerator.writeStartArray()>
			return;
	//   26   54:return          
		}
		_itemFilter = _filterContext.checkValue(_itemFilter);
	//   27   55:aload_0         
	//   28   56:aload_0         
	//   29   57:getfield        #33  <Field TokenFilterContext _filterContext>
	//   30   60:aload_0         
	//   31   61:getfield        #25  <Field TokenFilter _itemFilter>
	//   32   64:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//   33   67:putfield        #25  <Field TokenFilter _itemFilter>
		if(_itemFilter == null)
	//*  34   70:aload_0         
	//*  35   71:getfield        #25  <Field TokenFilter _itemFilter>
	//*  36   74:ifnonnull       91
		{
			_filterContext = _filterContext.createChildArrayContext(((TokenFilter) (null)), false);
	//   37   77:aload_0         
	//   38   78:aload_0         
	//   39   79:getfield        #33  <Field TokenFilterContext _filterContext>
	//   40   82:aconst_null     
	//   41   83:iconst_0        
	//   42   84:invokevirtual   #228 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//   43   87:putfield        #33  <Field TokenFilterContext _filterContext>
			return;
	//   44   90:return          
		}
		if(_itemFilter != TokenFilter.INCLUDE_ALL)
	//*  45   91:aload_0         
	//*  46   92:getfield        #25  <Field TokenFilter _itemFilter>
	//*  47   95:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  48   98:if_acmpeq       112
			_itemFilter = _itemFilter.filterStartArray();
	//   49  101:aload_0         
	//   50  102:aload_0         
	//   51  103:getfield        #25  <Field TokenFilter _itemFilter>
	//   52  106:invokevirtual   #233 <Method TokenFilter TokenFilter.filterStartArray()>
	//   53  109:putfield        #25  <Field TokenFilter _itemFilter>
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
	//*  54  112:aload_0         
	//*  55  113:getfield        #25  <Field TokenFilter _itemFilter>
	//*  56  116:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  57  119:if_acmpne       150
		{
			_checkParentPath();
	//   58  122:aload_0         
	//   59  123:invokevirtual   #54  <Method void _checkParentPath()>
			_filterContext = _filterContext.createChildArrayContext(_itemFilter, true);
	//   60  126:aload_0         
	//   61  127:aload_0         
	//   62  128:getfield        #33  <Field TokenFilterContext _filterContext>
	//   63  131:aload_0         
	//   64  132:getfield        #25  <Field TokenFilter _itemFilter>
	//   65  135:iconst_1        
	//   66  136:invokevirtual   #228 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//   67  139:putfield        #33  <Field TokenFilterContext _filterContext>
			_flddelegate.writeStartArray();
	//   68  142:aload_0         
	//   69  143:getfield        #61  <Field JsonGenerator _flddelegate>
	//   70  146:invokevirtual   #230 <Method void JsonGenerator.writeStartArray()>
			return;
	//   71  149:return          
		} else
		{
			_filterContext = _filterContext.createChildArrayContext(_itemFilter, false);
	//   72  150:aload_0         
	//   73  151:aload_0         
	//   74  152:getfield        #33  <Field TokenFilterContext _filterContext>
	//   75  155:aload_0         
	//   76  156:getfield        #25  <Field TokenFilter _itemFilter>
	//   77  159:iconst_0        
	//   78  160:invokevirtual   #228 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//   79  163:putfield        #33  <Field TokenFilterContext _filterContext>
			return;
	//   80  166:return          
		}
	}

	public void writeStartArray(int i)
		throws IOException
	{
		if(_itemFilter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//*   2    4:ifnonnull       21
		{
			_filterContext = _filterContext.createChildArrayContext(((TokenFilter) (null)), false);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field TokenFilterContext _filterContext>
	//    6   12:aconst_null     
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #228 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//    9   17:putfield        #33  <Field TokenFilterContext _filterContext>
			return;
	//   10   20:return          
		}
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
	//*  11   21:aload_0         
	//*  12   22:getfield        #25  <Field TokenFilter _itemFilter>
	//*  13   25:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  14   28:if_acmpne       56
		{
			_filterContext = _filterContext.createChildArrayContext(_itemFilter, true);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #33  <Field TokenFilterContext _filterContext>
	//   18   36:aload_0         
	//   19   37:getfield        #25  <Field TokenFilter _itemFilter>
	//   20   40:iconst_1        
	//   21   41:invokevirtual   #228 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//   22   44:putfield        #33  <Field TokenFilterContext _filterContext>
			_flddelegate.writeStartArray(i);
	//   23   47:aload_0         
	//   24   48:getfield        #61  <Field JsonGenerator _flddelegate>
	//   25   51:iload_1         
	//   26   52:invokevirtual   #235 <Method void JsonGenerator.writeStartArray(int)>
			return;
	//   27   55:return          
		}
		_itemFilter = _filterContext.checkValue(_itemFilter);
	//   28   56:aload_0         
	//   29   57:aload_0         
	//   30   58:getfield        #33  <Field TokenFilterContext _filterContext>
	//   31   61:aload_0         
	//   32   62:getfield        #25  <Field TokenFilter _itemFilter>
	//   33   65:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//   34   68:putfield        #25  <Field TokenFilter _itemFilter>
		if(_itemFilter == null)
	//*  35   71:aload_0         
	//*  36   72:getfield        #25  <Field TokenFilter _itemFilter>
	//*  37   75:ifnonnull       92
		{
			_filterContext = _filterContext.createChildArrayContext(((TokenFilter) (null)), false);
	//   38   78:aload_0         
	//   39   79:aload_0         
	//   40   80:getfield        #33  <Field TokenFilterContext _filterContext>
	//   41   83:aconst_null     
	//   42   84:iconst_0        
	//   43   85:invokevirtual   #228 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//   44   88:putfield        #33  <Field TokenFilterContext _filterContext>
			return;
	//   45   91:return          
		}
		if(_itemFilter != TokenFilter.INCLUDE_ALL)
	//*  46   92:aload_0         
	//*  47   93:getfield        #25  <Field TokenFilter _itemFilter>
	//*  48   96:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  49   99:if_acmpeq       113
			_itemFilter = _itemFilter.filterStartArray();
	//   50  102:aload_0         
	//   51  103:aload_0         
	//   52  104:getfield        #25  <Field TokenFilter _itemFilter>
	//   53  107:invokevirtual   #233 <Method TokenFilter TokenFilter.filterStartArray()>
	//   54  110:putfield        #25  <Field TokenFilter _itemFilter>
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
	//*  55  113:aload_0         
	//*  56  114:getfield        #25  <Field TokenFilter _itemFilter>
	//*  57  117:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  58  120:if_acmpne       152
		{
			_checkParentPath();
	//   59  123:aload_0         
	//   60  124:invokevirtual   #54  <Method void _checkParentPath()>
			_filterContext = _filterContext.createChildArrayContext(_itemFilter, true);
	//   61  127:aload_0         
	//   62  128:aload_0         
	//   63  129:getfield        #33  <Field TokenFilterContext _filterContext>
	//   64  132:aload_0         
	//   65  133:getfield        #25  <Field TokenFilter _itemFilter>
	//   66  136:iconst_1        
	//   67  137:invokevirtual   #228 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//   68  140:putfield        #33  <Field TokenFilterContext _filterContext>
			_flddelegate.writeStartArray(i);
	//   69  143:aload_0         
	//   70  144:getfield        #61  <Field JsonGenerator _flddelegate>
	//   71  147:iload_1         
	//   72  148:invokevirtual   #235 <Method void JsonGenerator.writeStartArray(int)>
			return;
	//   73  151:return          
		} else
		{
			_filterContext = _filterContext.createChildArrayContext(_itemFilter, false);
	//   74  152:aload_0         
	//   75  153:aload_0         
	//   76  154:getfield        #33  <Field TokenFilterContext _filterContext>
	//   77  157:aload_0         
	//   78  158:getfield        #25  <Field TokenFilter _itemFilter>
	//   79  161:iconst_0        
	//   80  162:invokevirtual   #228 <Method TokenFilterContext TokenFilterContext.createChildArrayContext(TokenFilter, boolean)>
	//   81  165:putfield        #33  <Field TokenFilterContext _filterContext>
			return;
	//   82  168:return          
		}
	}

	public void writeStartObject()
		throws IOException
	{
		if(_itemFilter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//*   2    4:ifnonnull       24
		{
			_filterContext = _filterContext.createChildObjectContext(_itemFilter, false);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field TokenFilterContext _filterContext>
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field TokenFilter _itemFilter>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #239 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//   10   20:putfield        #33  <Field TokenFilterContext _filterContext>
		} else
	//*  11   23:return          
		{
			if(_itemFilter == TokenFilter.INCLUDE_ALL)
	//*  12   24:aload_0         
	//*  13   25:getfield        #25  <Field TokenFilter _itemFilter>
	//*  14   28:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  15   31:if_acmpne       58
			{
				_filterContext = _filterContext.createChildObjectContext(_itemFilter, true);
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #33  <Field TokenFilterContext _filterContext>
	//   19   39:aload_0         
	//   20   40:getfield        #25  <Field TokenFilter _itemFilter>
	//   21   43:iconst_1        
	//   22   44:invokevirtual   #239 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//   23   47:putfield        #33  <Field TokenFilterContext _filterContext>
				_flddelegate.writeStartObject();
	//   24   50:aload_0         
	//   25   51:getfield        #61  <Field JsonGenerator _flddelegate>
	//   26   54:invokevirtual   #241 <Method void JsonGenerator.writeStartObject()>
				return;
	//   27   57:return          
			}
			TokenFilter tokenfilter1 = _filterContext.checkValue(_itemFilter);
	//   28   58:aload_0         
	//   29   59:getfield        #33  <Field TokenFilterContext _filterContext>
	//   30   62:aload_0         
	//   31   63:getfield        #25  <Field TokenFilter _itemFilter>
	//   32   66:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//   33   69:astore_2        
			if(tokenfilter1 != null)
	//*  34   70:aload_2         
	//*  35   71:ifnull          23
			{
				TokenFilter tokenfilter = tokenfilter1;
	//   36   74:aload_2         
	//   37   75:astore_1        
				if(tokenfilter1 != TokenFilter.INCLUDE_ALL)
	//*  38   76:aload_2         
	//*  39   77:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  40   80:if_acmpeq       88
					tokenfilter = tokenfilter1.filterStartObject();
	//   41   83:aload_2         
	//   42   84:invokevirtual   #244 <Method TokenFilter TokenFilter.filterStartObject()>
	//   43   87:astore_1        
				if(tokenfilter == TokenFilter.INCLUDE_ALL)
	//*  44   88:aload_1         
	//*  45   89:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//*  46   92:if_acmpne       120
				{
					_checkParentPath();
	//   47   95:aload_0         
	//   48   96:invokevirtual   #54  <Method void _checkParentPath()>
					_filterContext = _filterContext.createChildObjectContext(tokenfilter, true);
	//   49   99:aload_0         
	//   50  100:aload_0         
	//   51  101:getfield        #33  <Field TokenFilterContext _filterContext>
	//   52  104:aload_1         
	//   53  105:iconst_1        
	//   54  106:invokevirtual   #239 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//   55  109:putfield        #33  <Field TokenFilterContext _filterContext>
					_flddelegate.writeStartObject();
	//   56  112:aload_0         
	//   57  113:getfield        #61  <Field JsonGenerator _flddelegate>
	//   58  116:invokevirtual   #241 <Method void JsonGenerator.writeStartObject()>
					return;
	//   59  119:return          
				} else
				{
					_filterContext = _filterContext.createChildObjectContext(tokenfilter, false);
	//   60  120:aload_0         
	//   61  121:aload_0         
	//   62  122:getfield        #33  <Field TokenFilterContext _filterContext>
	//   63  125:aload_1         
	//   64  126:iconst_0        
	//   65  127:invokevirtual   #239 <Method TokenFilterContext TokenFilterContext.createChildObjectContext(TokenFilter, boolean)>
	//   66  130:putfield        #33  <Field TokenFilterContext _filterContext>
					return;
	//   67  133:return          
				}
			}
		}
	}

	public void writeString(SerializableString serializablestring)
		throws IOException
	{
		if(_itemFilter != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//    2    4:ifnonnull       8
_L1:
		return;
	//    3    7:return          
_L2:
		TokenFilter tokenfilter;
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
			break; /* Loop/switch isn't completed */
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field TokenFilter _itemFilter>
	//    6   12:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//    7   15:if_acmpeq       58
	//*   8   18:aload_0         
	//*   9   19:getfield        #33  <Field TokenFilterContext _filterContext>
	//*  10   22:aload_0         
	//*  11   23:getfield        #25  <Field TokenFilter _itemFilter>
	//*  12   26:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//*  13   29:astore_2        
		if((tokenfilter = _filterContext.checkValue(_itemFilter)) == null || tokenfilter != TokenFilter.INCLUDE_ALL && !tokenfilter.includeString(serializablestring.getValue()))
			continue; /* Loop/switch isn't completed */
	//   14   30:aload_2         
	//   15   31:ifnull          7
	//   16   34:aload_2         
	//   17   35:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//   18   38:if_acmpeq       54
	//   19   41:aload_2         
	//   20   42:aload_1         
	//   21   43:invokeinterface #127 <Method String SerializableString.getValue()>
	//   22   48:invokevirtual   #249 <Method boolean TokenFilter.includeString(String)>
	//   23   51:ifeq            7
		_checkParentPath();
	//   24   54:aload_0         
	//   25   55:invokevirtual   #54  <Method void _checkParentPath()>
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		_flddelegate.writeString(serializablestring);
	//   26   58:aload_0         
	//   27   59:getfield        #61  <Field JsonGenerator _flddelegate>
	//   28   62:aload_1         
	//   29   63:invokevirtual   #251 <Method void JsonGenerator.writeString(SerializableString)>
		return;
	//   30   66:return          
	}

	public void writeString(String s)
		throws IOException
	{
		if(_itemFilter != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//    2    4:ifnonnull       8
_L1:
		return;
	//    3    7:return          
_L2:
		TokenFilter tokenfilter;
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
			break; /* Loop/switch isn't completed */
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field TokenFilter _itemFilter>
	//    6   12:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//    7   15:if_acmpeq       53
	//*   8   18:aload_0         
	//*   9   19:getfield        #33  <Field TokenFilterContext _filterContext>
	//*  10   22:aload_0         
	//*  11   23:getfield        #25  <Field TokenFilter _itemFilter>
	//*  12   26:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//*  13   29:astore_2        
		if((tokenfilter = _filterContext.checkValue(_itemFilter)) == null || tokenfilter != TokenFilter.INCLUDE_ALL && !tokenfilter.includeString(s))
			continue; /* Loop/switch isn't completed */
	//   14   30:aload_2         
	//   15   31:ifnull          7
	//   16   34:aload_2         
	//   17   35:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//   18   38:if_acmpeq       49
	//   19   41:aload_2         
	//   20   42:aload_1         
	//   21   43:invokevirtual   #249 <Method boolean TokenFilter.includeString(String)>
	//   22   46:ifeq            7
		_checkParentPath();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #54  <Method void _checkParentPath()>
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		_flddelegate.writeString(s);
	//   25   53:aload_0         
	//   26   54:getfield        #61  <Field JsonGenerator _flddelegate>
	//   27   57:aload_1         
	//   28   58:invokevirtual   #253 <Method void JsonGenerator.writeString(String)>
		return;
	//   29   61:return          
	}

	public void writeString(char ac[], int i, int j)
		throws IOException
	{
		if(_itemFilter != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//    2    4:ifnonnull       8
_L1:
		return;
	//    3    7:return          
_L2:
		if(_itemFilter == TokenFilter.INCLUDE_ALL)
			break; /* Loop/switch isn't completed */
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field TokenFilter _itemFilter>
	//    6   12:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//    7   15:if_acmpeq       70
		String s = new String(ac, i, j);
	//    8   18:new             #255 <Class String>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:iload_2         
	//   12   24:iload_3         
	//   13   25:invokespecial   #257 <Method void String(char[], int, int)>
	//   14   28:astore          4
		TokenFilter tokenfilter = _filterContext.checkValue(_itemFilter);
	//   15   30:aload_0         
	//   16   31:getfield        #33  <Field TokenFilterContext _filterContext>
	//   17   34:aload_0         
	//   18   35:getfield        #25  <Field TokenFilter _itemFilter>
	//   19   38:invokevirtual   #102 <Method TokenFilter TokenFilterContext.checkValue(TokenFilter)>
	//   20   41:astore          5
		if(tokenfilter == null || tokenfilter != TokenFilter.INCLUDE_ALL && !tokenfilter.includeString(s))
			continue; /* Loop/switch isn't completed */
	//   21   43:aload           5
	//   22   45:ifnull          7
	//   23   48:aload           5
	//   24   50:getstatic       #47  <Field TokenFilter TokenFilter.INCLUDE_ALL>
	//   25   53:if_acmpeq       66
	//   26   56:aload           5
	//   27   58:aload           4
	//   28   60:invokevirtual   #249 <Method boolean TokenFilter.includeString(String)>
	//   29   63:ifeq            7
		_checkParentPath();
	//   30   66:aload_0         
	//   31   67:invokevirtual   #54  <Method void _checkParentPath()>
		break; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
		_flddelegate.writeString(ac, i, j);
	//   32   70:aload_0         
	//   33   71:getfield        #61  <Field JsonGenerator _flddelegate>
	//   34   74:aload_1         
	//   35   75:iload_2         
	//   36   76:iload_3         
	//   37   77:invokevirtual   #259 <Method void JsonGenerator.writeString(char[], int, int)>
		return;
	//   38   80:return          
	}

	public void writeTypeId(Object obj)
		throws IOException
	{
		if(_itemFilter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field TokenFilter _itemFilter>
	//*   2    4:ifnull          15
			_flddelegate.writeTypeId(obj);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #262 <Method void JsonGenerator.writeTypeId(Object)>
	//    7   15:return          
	}

	public void writeUTF8String(byte abyte0[], int i, int j)
		throws IOException
	{
		if(_checkRawValueWrite())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #206 <Method boolean _checkRawValueWrite()>
	//*   2    4:ifeq            17
			_flddelegate.writeRawUTF8String(abyte0, i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #220 <Method void JsonGenerator.writeRawUTF8String(byte[], int, int)>
	//    9   17:return          
	}

	protected boolean _allowMultipleMatches;
	protected TokenFilterContext _filterContext;
	protected boolean _includeImmediateParent;
	protected boolean _includePath;
	protected TokenFilter _itemFilter;
	protected int _matchCount;
	protected TokenFilter rootFilter;
}
