// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.core.util:
//			JsonParserDelegate

public class JsonParserSequence extends JsonParserDelegate
{

	protected JsonParserSequence(JsonParser ajsonparser[])
	{
		super(ajsonparser[0]);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aaload          
	//    4    4:invokespecial   #13  <Method void JsonParserDelegate(JsonParser)>
		_parsers = ajsonparser;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #15  <Field JsonParser[] _parsers>
		_nextParser = 1;
	//    8   12:aload_0         
	//    9   13:iconst_1        
	//   10   14:putfield        #17  <Field int _nextParser>
	//   11   17:return          
	}

	public static JsonParserSequence createFlattened(JsonParser jsonparser, JsonParser jsonparser1)
	{
		if(!(jsonparser instanceof JsonParserSequence) && !(jsonparser1 instanceof JsonParserSequence))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #2   <Class JsonParserSequence>
	//*   2    4:ifne            34
	//*   3    7:aload_1         
	//*   4    8:instanceof      #2   <Class JsonParserSequence>
	//*   5   11:ifne            34
			return new JsonParserSequence(new JsonParser[] {
				jsonparser, jsonparser1
			});
	//    6   14:new             #2   <Class JsonParserSequence>
	//    7   17:dup             
	//    8   18:iconst_2        
	//    9   19:anewarray       JsonParser[]
	//   10   22:dup             
	//   11   23:iconst_0        
	//   12   24:aload_0         
	//   13   25:aastore         
	//   14   26:dup             
	//   15   27:iconst_1        
	//   16   28:aload_1         
	//   17   29:aastore         
	//   18   30:invokespecial   #24  <Method void JsonParserSequence(JsonParser[])>
	//   19   33:areturn         
		ArrayList arraylist = new ArrayList();
	//   20   34:new             #26  <Class ArrayList>
	//   21   37:dup             
	//   22   38:invokespecial   #29  <Method void ArrayList()>
	//   23   41:astore_2        
		if(jsonparser instanceof JsonParserSequence)
	//*  24   42:aload_0         
	//*  25   43:instanceof      #2   <Class JsonParserSequence>
	//*  26   46:ifeq            94
			((JsonParserSequence)jsonparser).addFlattenedActiveParsers(((List) (arraylist)));
	//   27   49:aload_0         
	//   28   50:checkcast       #2   <Class JsonParserSequence>
	//   29   53:aload_2         
	//   30   54:invokevirtual   #33  <Method void addFlattenedActiveParsers(List)>
		else
	//*  31   57:aload_1         
	//*  32   58:instanceof      #2   <Class JsonParserSequence>
	//*  33   61:ifeq            103
	//*  34   64:aload_1         
	//*  35   65:checkcast       #2   <Class JsonParserSequence>
	//*  36   68:aload_2         
	//*  37   69:invokevirtual   #33  <Method void addFlattenedActiveParsers(List)>
	//*  38   72:new             #2   <Class JsonParserSequence>
	//*  39   75:dup             
	//*  40   76:aload_2         
	//*  41   77:aload_2         
	//*  42   78:invokevirtual   #37  <Method int ArrayList.size()>
	//*  43   81:anewarray       JsonParser[]
	//*  44   84:invokevirtual   #41  <Method Object[] ArrayList.toArray(Object[])>
	//*  45   87:checkcast       #42  <Class JsonParser[]>
	//*  46   90:invokespecial   #24  <Method void JsonParserSequence(JsonParser[])>
	//*  47   93:areturn         
			arraylist.add(((Object) (jsonparser)));
	//   48   94:aload_2         
	//   49   95:aload_0         
	//   50   96:invokevirtual   #46  <Method boolean ArrayList.add(Object)>
	//   51   99:pop             
		if(jsonparser1 instanceof JsonParserSequence)
			((JsonParserSequence)jsonparser1).addFlattenedActiveParsers(((List) (arraylist)));
		else
	//*  52  100:goto            57
			arraylist.add(((Object) (jsonparser1)));
	//   53  103:aload_2         
	//   54  104:aload_1         
	//   55  105:invokevirtual   #46  <Method boolean ArrayList.add(Object)>
	//   56  108:pop             
		return new JsonParserSequence((JsonParser[])arraylist.toArray(((Object []) (new JsonParser[arraylist.size()]))));
	//*  57  109:goto            72
	}

	protected void addFlattenedActiveParsers(List list)
	{
		int i = _nextParser - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int _nextParser>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_2        
		int j = _parsers.length;
	//    5    7:aload_0         
	//    6    8:getfield        #15  <Field JsonParser[] _parsers>
	//    7   11:arraylength     
	//    8   12:istore_3        
		while(i < j) 
	//*   9   13:iload_2         
	//*  10   14:iload_3         
	//*  11   15:icmpge          62
		{
			JsonParser jsonparser = _parsers[i];
	//   12   18:aload_0         
	//   13   19:getfield        #15  <Field JsonParser[] _parsers>
	//   14   22:iload_2         
	//   15   23:aaload          
	//   16   24:astore          4
			if(jsonparser instanceof JsonParserSequence)
	//*  17   26:aload           4
	//*  18   28:instanceof      #2   <Class JsonParserSequence>
	//*  19   31:ifeq            50
				((JsonParserSequence)jsonparser).addFlattenedActiveParsers(list);
	//   20   34:aload           4
	//   21   36:checkcast       #2   <Class JsonParserSequence>
	//   22   39:aload_1         
	//   23   40:invokevirtual   #33  <Method void addFlattenedActiveParsers(List)>
			else
	//*  24   43:iload_2         
	//*  25   44:iconst_1        
	//*  26   45:iadd            
	//*  27   46:istore_2        
	//*  28   47:goto            13
				list.add(((Object) (jsonparser)));
	//   29   50:aload_1         
	//   30   51:aload           4
	//   31   53:invokeinterface #49  <Method boolean List.add(Object)>
	//   32   58:pop             
			i++;
		}
	//*  33   59:goto            43
	//   34   62:return          
	}

	public void close()
		throws IOException
	{
		do
			_flddelegate.close();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #60  <Method void JsonParser.close()>
		while(switchToNext());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #64  <Method boolean switchToNext()>
	//    5   11:ifne            0
	//    6   14:return          
	}

	public int containedParsersCount()
	{
		return _parsers.length;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field JsonParser[] _parsers>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public JsonToken nextToken()
		throws IOException, JsonParseException
	{
		JsonToken jsontoken = _flddelegate.nextToken();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #72  <Method JsonToken JsonParser.nextToken()>
	//    3    7:astore_1        
		if(jsontoken != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          14
			return jsontoken;
	//    6   12:aload_1         
	//    7   13:areturn         
		while(switchToNext()) 
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #64  <Method boolean switchToNext()>
	//*  10   18:ifeq            35
		{
			JsonToken jsontoken1 = _flddelegate.nextToken();
	//   11   21:aload_0         
	//   12   22:getfield        #58  <Field JsonParser _flddelegate>
	//   13   25:invokevirtual   #72  <Method JsonToken JsonParser.nextToken()>
	//   14   28:astore_1        
			if(jsontoken1 != null)
	//*  15   29:aload_1         
	//*  16   30:ifnull          14
				return jsontoken1;
	//   17   33:aload_1         
	//   18   34:areturn         
		}
		return null;
	//   19   35:aconst_null     
	//   20   36:areturn         
	}

	protected boolean switchToNext()
	{
		if(_nextParser >= _parsers.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field int _nextParser>
	//*   2    4:aload_0         
	//*   3    5:getfield        #15  <Field JsonParser[] _parsers>
	//*   4    8:arraylength     
	//*   5    9:icmplt          14
		{
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		} else
		{
			JsonParser ajsonparser[] = _parsers;
	//    8   14:aload_0         
	//    9   15:getfield        #15  <Field JsonParser[] _parsers>
	//   10   18:astore_2        
			int i = _nextParser;
	//   11   19:aload_0         
	//   12   20:getfield        #17  <Field int _nextParser>
	//   13   23:istore_1        
			_nextParser = i + 1;
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:putfield        #17  <Field int _nextParser>
			_flddelegate = ajsonparser[i];
	//   19   31:aload_0         
	//   20   32:aload_2         
	//   21   33:iload_1         
	//   22   34:aaload          
	//   23   35:putfield        #58  <Field JsonParser _flddelegate>
			return true;
	//   24   38:iconst_1        
	//   25   39:ireturn         
		}
	}

	protected int _nextParser;
	protected final JsonParser _parsers[];
}
