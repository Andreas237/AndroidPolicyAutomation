// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.core.util:
//			JsonParserDelegate

public class JsonParserSequence extends JsonParserDelegate
{

	protected JsonParserSequence(boolean flag, JsonParser ajsonparser[])
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		super(ajsonparser[0]);
	//    2    3:aload_0         
	//    3    4:aload_2         
	//    4    5:iconst_0        
	//    5    6:aaload          
	//    6    7:invokespecial   #16  <Method void JsonParserDelegate(JsonParser)>
		_checkForExistingToken = flag;
	//    7   10:aload_0         
	//    8   11:iload_1         
	//    9   12:putfield        #18  <Field boolean _checkForExistingToken>
		boolean flag1 = flag2;
	//   10   15:iload           4
	//   11   17:istore_3        
		if(flag)
	//*  12   18:iload_1         
	//*  13   19:ifeq            37
		{
			flag1 = flag2;
	//   14   22:iload           4
	//   15   24:istore_3        
			if(_flddelegate.hasCurrentToken())
	//*  16   25:aload_0         
	//*  17   26:getfield        #22  <Field JsonParser _flddelegate>
	//*  18   29:invokevirtual   #28  <Method boolean JsonParser.hasCurrentToken()>
	//*  19   32:ifeq            37
				flag1 = true;
	//   20   35:iconst_1        
	//   21   36:istore_3        
		}
		_hasToken = flag1;
	//   22   37:aload_0         
	//   23   38:iload_3         
	//   24   39:putfield        #30  <Field boolean _hasToken>
		_parsers = ajsonparser;
	//   25   42:aload_0         
	//   26   43:aload_2         
	//   27   44:putfield        #32  <Field JsonParser[] _parsers>
		_nextParserIndex = 1;
	//   28   47:aload_0         
	//   29   48:iconst_1        
	//   30   49:putfield        #34  <Field int _nextParserIndex>
	//   31   52:return          
	}

	public static JsonParserSequence createFlattened(boolean flag, JsonParser jsonparser, JsonParser jsonparser1)
	{
		boolean flag1 = jsonparser instanceof JsonParserSequence;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class JsonParserSequence>
	//    2    4:istore_3        
		if(!flag1 && !(jsonparser1 instanceof JsonParserSequence))
	//*   3    5:iload_3         
	//*   4    6:ifne            37
	//*   5    9:aload_2         
	//*   6   10:instanceof      #2   <Class JsonParserSequence>
	//*   7   13:ifne            37
			return new JsonParserSequence(flag, new JsonParser[] {
				jsonparser, jsonparser1
			});
	//    8   16:new             #2   <Class JsonParserSequence>
	//    9   19:dup             
	//   10   20:iload_0         
	//   11   21:iconst_2        
	//   12   22:anewarray       JsonParser[]
	//   13   25:dup             
	//   14   26:iconst_0        
	//   15   27:aload_1         
	//   16   28:aastore         
	//   17   29:dup             
	//   18   30:iconst_1        
	//   19   31:aload_2         
	//   20   32:aastore         
	//   21   33:invokespecial   #39  <Method void JsonParserSequence(boolean, JsonParser[])>
	//   22   36:areturn         
		ArrayList arraylist = new ArrayList();
	//   23   37:new             #41  <Class ArrayList>
	//   24   40:dup             
	//   25   41:invokespecial   #44  <Method void ArrayList()>
	//   26   44:astore          4
		if(flag1)
	//*  27   46:iload_3         
	//*  28   47:ifeq            62
			((JsonParserSequence)jsonparser).addFlattenedActiveParsers(((List) (arraylist)));
	//   29   50:aload_1         
	//   30   51:checkcast       #2   <Class JsonParserSequence>
	//   31   54:aload           4
	//   32   56:invokevirtual   #48  <Method void addFlattenedActiveParsers(List)>
		else
	//*  33   59:goto            69
			arraylist.add(((Object) (jsonparser)));
	//   34   62:aload           4
	//   35   64:aload_1         
	//   36   65:invokevirtual   #52  <Method boolean ArrayList.add(Object)>
	//   37   68:pop             
		if(jsonparser1 instanceof JsonParserSequence)
	//*  38   69:aload_2         
	//*  39   70:instanceof      #2   <Class JsonParserSequence>
	//*  40   73:ifeq            88
			((JsonParserSequence)jsonparser1).addFlattenedActiveParsers(((List) (arraylist)));
	//   41   76:aload_2         
	//   42   77:checkcast       #2   <Class JsonParserSequence>
	//   43   80:aload           4
	//   44   82:invokevirtual   #48  <Method void addFlattenedActiveParsers(List)>
		else
	//*  45   85:goto            95
			arraylist.add(((Object) (jsonparser1)));
	//   46   88:aload           4
	//   47   90:aload_2         
	//   48   91:invokevirtual   #52  <Method boolean ArrayList.add(Object)>
	//   49   94:pop             
		return new JsonParserSequence(flag, (JsonParser[])arraylist.toArray(((Object []) (new JsonParser[arraylist.size()]))));
	//   50   95:new             #2   <Class JsonParserSequence>
	//   51   98:dup             
	//   52   99:iload_0         
	//   53  100:aload           4
	//   54  102:aload           4
	//   55  104:invokevirtual   #56  <Method int ArrayList.size()>
	//   56  107:anewarray       JsonParser[]
	//   57  110:invokevirtual   #60  <Method Object[] ArrayList.toArray(Object[])>
	//   58  113:checkcast       #61  <Class JsonParser[]>
	//   59  116:invokespecial   #39  <Method void JsonParserSequence(boolean, JsonParser[])>
	//   60  119:areturn         
	}

	protected void addFlattenedActiveParsers(List list)
	{
		int i = _nextParserIndex - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int _nextParserIndex>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_2        
		for(int j = _parsers.length; i < j; i++)
	//*   5    7:aload_0         
	//*   6    8:getfield        #32  <Field JsonParser[] _parsers>
	//*   7   11:arraylength     
	//*   8   12:istore_3        
	//*   9   13:iload_2         
	//*  10   14:iload_3         
	//*  11   15:icmpge          62
		{
			JsonParser jsonparser = _parsers[i];
	//   12   18:aload_0         
	//   13   19:getfield        #32  <Field JsonParser[] _parsers>
	//   14   22:iload_2         
	//   15   23:aaload          
	//   16   24:astore          4
			if(jsonparser instanceof JsonParserSequence)
	//*  17   26:aload           4
	//*  18   28:instanceof      #2   <Class JsonParserSequence>
	//*  19   31:ifeq            46
				((JsonParserSequence)jsonparser).addFlattenedActiveParsers(list);
	//   20   34:aload           4
	//   21   36:checkcast       #2   <Class JsonParserSequence>
	//   22   39:aload_1         
	//   23   40:invokevirtual   #48  <Method void addFlattenedActiveParsers(List)>
			else
	//*  24   43:goto            55
				list.add(((Object) (jsonparser)));
	//   25   46:aload_1         
	//   26   47:aload           4
	//   27   49:invokeinterface #64  <Method boolean List.add(Object)>
	//   28   54:pop             
		}

	//   29   55:iload_2         
	//   30   56:iconst_1        
	//   31   57:iadd            
	//   32   58:istore_2        
	//*  33   59:goto            13
	//   34   62:return          
	}

	public void close()
		throws IOException
	{
		do
			_flddelegate.close();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #71  <Method void JsonParser.close()>
		while(switchToNext());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #74  <Method boolean switchToNext()>
	//    5   11:ifne            0
	//    6   14:return          
	}

	public JsonToken nextToken()
		throws IOException
	{
		if(_flddelegate == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field JsonParser _flddelegate>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(_hasToken)
	//*   5    9:aload_0         
	//*   6   10:getfield        #30  <Field boolean _hasToken>
	//*   7   13:ifeq            29
		{
			_hasToken = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #30  <Field boolean _hasToken>
			return _flddelegate.currentToken();
	//   11   21:aload_0         
	//   12   22:getfield        #22  <Field JsonParser _flddelegate>
	//   13   25:invokevirtual   #80  <Method JsonToken JsonParser.currentToken()>
	//   14   28:areturn         
		}
		JsonToken jsontoken = _flddelegate.nextToken();
	//   15   29:aload_0         
	//   16   30:getfield        #22  <Field JsonParser _flddelegate>
	//   17   33:invokevirtual   #82  <Method JsonToken JsonParser.nextToken()>
	//   18   36:astore_1        
		if(jsontoken == null)
	//*  19   37:aload_1         
	//*  20   38:ifnonnull       46
			return switchAndReturnNext();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #85  <Method JsonToken switchAndReturnNext()>
	//   23   45:areturn         
		else
			return jsontoken;
	//   24   46:aload_1         
	//   25   47:areturn         
	}

	public JsonParser skipChildren()
		throws IOException
	{
		if(_flddelegate.currentToken() != JsonToken.START_OBJECT && _flddelegate.currentToken() != JsonToken.START_ARRAY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field JsonParser _flddelegate>
	//*   2    4:invokevirtual   #80  <Method JsonToken JsonParser.currentToken()>
	//*   3    7:getstatic       #93  <Field JsonToken JsonToken.START_OBJECT>
	//*   4   10:if_acmpeq       28
	//*   5   13:aload_0         
	//*   6   14:getfield        #22  <Field JsonParser _flddelegate>
	//*   7   17:invokevirtual   #80  <Method JsonToken JsonParser.currentToken()>
	//*   8   20:getstatic       #96  <Field JsonToken JsonToken.START_ARRAY>
	//*   9   23:if_acmpeq       28
			return ((JsonParser) (this));
	//   10   26:aload_0         
	//   11   27:areturn         
		int i = 1;
	//   12   28:iconst_1        
	//   13   29:istore_1        
		int j;
		do
		{
			JsonToken jsontoken;
			do
				do
				{
					jsontoken = nextToken();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #97  <Method JsonToken nextToken()>
	//   16   34:astore_3        
					if(jsontoken == null)
	//*  17   35:aload_3         
	//*  18   36:ifnonnull       41
						return ((JsonParser) (this));
	//   19   39:aload_0         
	//   20   40:areturn         
					if(!jsontoken.isStructStart())
						break;
	//   21   41:aload_3         
	//   22   42:invokevirtual   #100 <Method boolean JsonToken.isStructStart()>
	//   23   45:ifeq            55
					i++;
	//   24   48:iload_1         
	//   25   49:iconst_1        
	//   26   50:iadd            
	//   27   51:istore_1        
				} while(true);
	//   28   52:goto            30
			while(!jsontoken.isStructEnd());
	//   29   55:aload_3         
	//   30   56:invokevirtual   #103 <Method boolean JsonToken.isStructEnd()>
	//   31   59:ifeq            30
			j = i - 1;
	//   32   62:iload_1         
	//   33   63:iconst_1        
	//   34   64:isub            
	//   35   65:istore_2        
			i = j;
	//   36   66:iload_2         
	//   37   67:istore_1        
		} while(j != 0);
	//   38   68:iload_2         
	//   39   69:ifne            30
		return ((JsonParser) (this));
	//   40   72:aload_0         
	//   41   73:areturn         
	}

	protected JsonToken switchAndReturnNext()
		throws IOException
	{
		do
		{
			int i = _nextParserIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int _nextParserIndex>
	//    2    4:istore_1        
			JsonParser ajsonparser[] = _parsers;
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field JsonParser[] _parsers>
	//    5    9:astore_2        
			if(i < ajsonparser.length)
	//*   6   10:iload_1         
	//*   7   11:aload_2         
	//*   8   12:arraylength     
	//*   9   13:icmpge          69
			{
				_nextParserIndex = i + 1;
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:iconst_1        
	//   13   19:iadd            
	//   14   20:putfield        #34  <Field int _nextParserIndex>
				_flddelegate = ajsonparser[i];
	//   15   23:aload_0         
	//   16   24:aload_2         
	//   17   25:iload_1         
	//   18   26:aaload          
	//   19   27:putfield        #22  <Field JsonParser _flddelegate>
				if(_checkForExistingToken && _flddelegate.hasCurrentToken())
	//*  20   30:aload_0         
	//*  21   31:getfield        #18  <Field boolean _checkForExistingToken>
	//*  22   34:ifeq            55
	//*  23   37:aload_0         
	//*  24   38:getfield        #22  <Field JsonParser _flddelegate>
	//*  25   41:invokevirtual   #28  <Method boolean JsonParser.hasCurrentToken()>
	//*  26   44:ifeq            55
					return _flddelegate.getCurrentToken();
	//   27   47:aload_0         
	//   28   48:getfield        #22  <Field JsonParser _flddelegate>
	//   29   51:invokevirtual   #106 <Method JsonToken JsonParser.getCurrentToken()>
	//   30   54:areturn         
				JsonToken jsontoken = _flddelegate.nextToken();
	//   31   55:aload_0         
	//   32   56:getfield        #22  <Field JsonParser _flddelegate>
	//   33   59:invokevirtual   #82  <Method JsonToken JsonParser.nextToken()>
	//   34   62:astore_2        
				if(jsontoken != null)
	//*  35   63:aload_2         
	//*  36   64:ifnull          0
					return jsontoken;
	//   37   67:aload_2         
	//   38   68:areturn         
			} else
			{
				return null;
	//   39   69:aconst_null     
	//   40   70:areturn         
			}
		} while(true);
	}

	protected boolean switchToNext()
	{
		int i = _nextParserIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int _nextParserIndex>
	//    2    4:istore_1        
		JsonParser ajsonparser[] = _parsers;
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field JsonParser[] _parsers>
	//    5    9:astore_2        
		if(i < ajsonparser.length)
	//*   6   10:iload_1         
	//*   7   11:aload_2         
	//*   8   12:arraylength     
	//*   9   13:icmpge          32
		{
			_nextParserIndex = i + 1;
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:iconst_1        
	//   13   19:iadd            
	//   14   20:putfield        #34  <Field int _nextParserIndex>
			_flddelegate = ajsonparser[i];
	//   15   23:aload_0         
	//   16   24:aload_2         
	//   17   25:iload_1         
	//   18   26:aaload          
	//   19   27:putfield        #22  <Field JsonParser _flddelegate>
			return true;
	//   20   30:iconst_1        
	//   21   31:ireturn         
		} else
		{
			return false;
	//   22   32:iconst_0        
	//   23   33:ireturn         
		}
	}

	protected final boolean _checkForExistingToken;
	protected boolean _hasToken;
	protected int _nextParserIndex;
	protected final JsonParser _parsers[];
}
