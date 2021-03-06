// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonToken;
import java.util.TreeMap;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			TokenBuffer

protected static final class TokenBuffer$Segment
{

	private final int _objectIdIndex(int i)
	{
		return i + i + 1;
	//    0    0:iload_1         
	//    1    1:iload_1         
	//    2    2:iadd            
	//    3    3:iconst_1        
	//    4    4:iadd            
	//    5    5:ireturn         
	}

	private final int _typeIdIndex(int i)
	{
		return i + i;
	//    0    0:iload_1         
	//    1    1:iload_1         
	//    2    2:iadd            
	//    3    3:ireturn         
	}

	private final void assignNativeIds(int i, Object obj, Object obj1)
	{
		if(_nativeIds == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field TreeMap _nativeIds>
	//*   2    4:ifnonnull       18
			_nativeIds = new TreeMap();
	//    3    7:aload_0         
	//    4    8:new             #65  <Class TreeMap>
	//    5   11:dup             
	//    6   12:invokespecial   #66  <Method void TreeMap()>
	//    7   15:putfield        #63  <Field TreeMap _nativeIds>
		if(obj != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          39
			_nativeIds.put(((Object) (Integer.valueOf(_objectIdIndex(i)))), obj);
	//   10   22:aload_0         
	//   11   23:getfield        #63  <Field TreeMap _nativeIds>
	//   12   26:aload_0         
	//   13   27:iload_1         
	//   14   28:invokespecial   #68  <Method int _objectIdIndex(int)>
	//   15   31:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//   16   34:aload_2         
	//   17   35:invokevirtual   #78  <Method Object TreeMap.put(Object, Object)>
	//   18   38:pop             
		if(obj1 != null)
	//*  19   39:aload_3         
	//*  20   40:ifnull          60
			_nativeIds.put(((Object) (Integer.valueOf(_typeIdIndex(i)))), obj1);
	//   21   43:aload_0         
	//   22   44:getfield        #63  <Field TreeMap _nativeIds>
	//   23   47:aload_0         
	//   24   48:iload_1         
	//   25   49:invokespecial   #80  <Method int _typeIdIndex(int)>
	//   26   52:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//   27   55:aload_3         
	//   28   56:invokevirtual   #78  <Method Object TreeMap.put(Object, Object)>
	//   29   59:pop             
	//   30   60:return          
	}

	private Object findObjectId(int i)
	{
		TreeMap treemap = _nativeIds;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field TreeMap _nativeIds>
	//    2    4:astore_2        
		if(treemap == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return treemap.get(((Object) (Integer.valueOf(_objectIdIndex(i)))));
	//    7   11:aload_2         
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokespecial   #68  <Method int _objectIdIndex(int)>
	//   11   17:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//   12   20:invokevirtual   #84  <Method Object TreeMap.get(Object)>
	//   13   23:areturn         
	}

	private Object findTypeId(int i)
	{
		TreeMap treemap = _nativeIds;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field TreeMap _nativeIds>
	//    2    4:astore_2        
		if(treemap == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return treemap.get(((Object) (Integer.valueOf(_typeIdIndex(i)))));
	//    7   11:aload_2         
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokespecial   #80  <Method int _typeIdIndex(int)>
	//   11   17:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//   12   20:invokevirtual   #84  <Method Object TreeMap.get(Object)>
	//   13   23:areturn         
	}

	private void set(int i, JsonToken jsontoken)
	{
		long l1 = jsontoken.ordinal();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #90  <Method int JsonToken.ordinal()>
	//    2    4:i2l             
	//    3    5:lstore          5
		long l = l1;
	//    4    7:lload           5
	//    5    9:lstore_3        
		if(i > 0)
	//*   6   10:iload_1         
	//*   7   11:ifle            21
			l = l1 << (i << 2);
	//    8   14:lload           5
	//    9   16:iload_1         
	//   10   17:iconst_2        
	//   11   18:ishl            
	//   12   19:lshl            
	//   13   20:lstore_3        
		_tokenTypes = _tokenTypes | l;
	//   14   21:aload_0         
	//   15   22:aload_0         
	//   16   23:getfield        #92  <Field long _tokenTypes>
	//   17   26:lload_3         
	//   18   27:lor             
	//   19   28:putfield        #92  <Field long _tokenTypes>
	//   20   31:return          
	}

	private void set(int i, JsonToken jsontoken, Object obj)
	{
		_tokens[i] = obj;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Object[] _tokens>
	//    2    4:iload_1         
	//    3    5:aload_3         
	//    4    6:aastore         
		long l1 = jsontoken.ordinal();
	//    5    7:aload_2         
	//    6    8:invokevirtual   #90  <Method int JsonToken.ordinal()>
	//    7   11:i2l             
	//    8   12:lstore          6
		long l = l1;
	//    9   14:lload           6
	//   10   16:lstore          4
		if(i > 0)
	//*  11   18:iload_1         
	//*  12   19:ifle            30
			l = l1 << (i << 2);
	//   13   22:lload           6
	//   14   24:iload_1         
	//   15   25:iconst_2        
	//   16   26:ishl            
	//   17   27:lshl            
	//   18   28:lstore          4
		_tokenTypes = _tokenTypes | l;
	//   19   30:aload_0         
	//   20   31:aload_0         
	//   21   32:getfield        #92  <Field long _tokenTypes>
	//   22   35:lload           4
	//   23   37:lor             
	//   24   38:putfield        #92  <Field long _tokenTypes>
	//   25   41:return          
	}

	private void set(int i, JsonToken jsontoken, Object obj, Object obj1)
	{
		long l1 = jsontoken.ordinal();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #90  <Method int JsonToken.ordinal()>
	//    2    4:i2l             
	//    3    5:lstore          7
		long l = l1;
	//    4    7:lload           7
	//    5    9:lstore          5
		if(i > 0)
	//*   6   11:iload_1         
	//*   7   12:ifle            23
			l = l1 << (i << 2);
	//    8   15:lload           7
	//    9   17:iload_1         
	//   10   18:iconst_2        
	//   11   19:ishl            
	//   12   20:lshl            
	//   13   21:lstore          5
		_tokenTypes = l | _tokenTypes;
	//   14   23:aload_0         
	//   15   24:lload           5
	//   16   26:aload_0         
	//   17   27:getfield        #92  <Field long _tokenTypes>
	//   18   30:lor             
	//   19   31:putfield        #92  <Field long _tokenTypes>
		assignNativeIds(i, obj, obj1);
	//   20   34:aload_0         
	//   21   35:iload_1         
	//   22   36:aload_3         
	//   23   37:aload           4
	//   24   39:invokespecial   #96  <Method void assignNativeIds(int, Object, Object)>
	//   25   42:return          
	}

	private void set(int i, JsonToken jsontoken, Object obj, Object obj1, Object obj2)
	{
		_tokens[i] = obj;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Object[] _tokens>
	//    2    4:iload_1         
	//    3    5:aload_3         
	//    4    6:aastore         
		long l1 = jsontoken.ordinal();
	//    5    7:aload_2         
	//    6    8:invokevirtual   #90  <Method int JsonToken.ordinal()>
	//    7   11:i2l             
	//    8   12:lstore          8
		long l = l1;
	//    9   14:lload           8
	//   10   16:lstore          6
		if(i > 0)
	//*  11   18:iload_1         
	//*  12   19:ifle            30
			l = l1 << (i << 2);
	//   13   22:lload           8
	//   14   24:iload_1         
	//   15   25:iconst_2        
	//   16   26:ishl            
	//   17   27:lshl            
	//   18   28:lstore          6
		_tokenTypes = l | _tokenTypes;
	//   19   30:aload_0         
	//   20   31:lload           6
	//   21   33:aload_0         
	//   22   34:getfield        #92  <Field long _tokenTypes>
	//   23   37:lor             
	//   24   38:putfield        #92  <Field long _tokenTypes>
		assignNativeIds(i, obj1, obj2);
	//   25   41:aload_0         
	//   26   42:iload_1         
	//   27   43:aload           4
	//   28   45:aload           5
	//   29   47:invokespecial   #96  <Method void assignNativeIds(int, Object, Object)>
	//   30   50:return          
	}

	public TokenBuffer$Segment append(int i, JsonToken jsontoken)
	{
		if(i < 16)
	//*   0    0:iload_1         
	//*   1    1:bipush          16
	//*   2    3:icmpge          14
		{
			set(i, jsontoken);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:aload_2         
	//    6    9:invokespecial   #101 <Method void set(int, JsonToken)>
			return null;
	//    7   12:aconst_null     
	//    8   13:areturn         
		} else
		{
			_next = new TokenBuffer$Segment();
	//    9   14:aload_0         
	//   10   15:new             #2   <Class TokenBuffer$Segment>
	//   11   18:dup             
	//   12   19:invokespecial   #102 <Method void TokenBuffer$Segment()>
	//   13   22:putfield        #104 <Field TokenBuffer$Segment _next>
			_next.set(0, jsontoken);
	//   14   25:aload_0         
	//   15   26:getfield        #104 <Field TokenBuffer$Segment _next>
	//   16   29:iconst_0        
	//   17   30:aload_2         
	//   18   31:invokespecial   #101 <Method void set(int, JsonToken)>
			return _next;
	//   19   34:aload_0         
	//   20   35:getfield        #104 <Field TokenBuffer$Segment _next>
	//   21   38:areturn         
		}
	}

	public TokenBuffer$Segment append(int i, JsonToken jsontoken, Object obj)
	{
		if(i < 16)
	//*   0    0:iload_1         
	//*   1    1:bipush          16
	//*   2    3:icmpge          15
		{
			set(i, jsontoken, obj);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:aload_2         
	//    6    9:aload_3         
	//    7   10:invokespecial   #107 <Method void set(int, JsonToken, Object)>
			return null;
	//    8   13:aconst_null     
	//    9   14:areturn         
		} else
		{
			_next = new TokenBuffer$Segment();
	//   10   15:aload_0         
	//   11   16:new             #2   <Class TokenBuffer$Segment>
	//   12   19:dup             
	//   13   20:invokespecial   #102 <Method void TokenBuffer$Segment()>
	//   14   23:putfield        #104 <Field TokenBuffer$Segment _next>
			_next.set(0, jsontoken, obj);
	//   15   26:aload_0         
	//   16   27:getfield        #104 <Field TokenBuffer$Segment _next>
	//   17   30:iconst_0        
	//   18   31:aload_2         
	//   19   32:aload_3         
	//   20   33:invokespecial   #107 <Method void set(int, JsonToken, Object)>
			return _next;
	//   21   36:aload_0         
	//   22   37:getfield        #104 <Field TokenBuffer$Segment _next>
	//   23   40:areturn         
		}
	}

	public TokenBuffer$Segment append(int i, JsonToken jsontoken, Object obj, Object obj1)
	{
		if(i < 16)
	//*   0    0:iload_1         
	//*   1    1:bipush          16
	//*   2    3:icmpge          17
		{
			set(i, jsontoken, obj, obj1);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:aload_2         
	//    6    9:aload_3         
	//    7   10:aload           4
	//    8   12:invokespecial   #110 <Method void set(int, JsonToken, Object, Object)>
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			_next = new TokenBuffer$Segment();
	//   11   17:aload_0         
	//   12   18:new             #2   <Class TokenBuffer$Segment>
	//   13   21:dup             
	//   14   22:invokespecial   #102 <Method void TokenBuffer$Segment()>
	//   15   25:putfield        #104 <Field TokenBuffer$Segment _next>
			_next.set(0, jsontoken, obj, obj1);
	//   16   28:aload_0         
	//   17   29:getfield        #104 <Field TokenBuffer$Segment _next>
	//   18   32:iconst_0        
	//   19   33:aload_2         
	//   20   34:aload_3         
	//   21   35:aload           4
	//   22   37:invokespecial   #110 <Method void set(int, JsonToken, Object, Object)>
			return _next;
	//   23   40:aload_0         
	//   24   41:getfield        #104 <Field TokenBuffer$Segment _next>
	//   25   44:areturn         
		}
	}

	public TokenBuffer$Segment append(int i, JsonToken jsontoken, Object obj, Object obj1, Object obj2)
	{
		if(i < 16)
	//*   0    0:iload_1         
	//*   1    1:bipush          16
	//*   2    3:icmpge          19
		{
			set(i, jsontoken, obj, obj1, obj2);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:aload_2         
	//    6    9:aload_3         
	//    7   10:aload           4
	//    8   12:aload           5
	//    9   14:invokespecial   #113 <Method void set(int, JsonToken, Object, Object, Object)>
			return null;
	//   10   17:aconst_null     
	//   11   18:areturn         
		} else
		{
			_next = new TokenBuffer$Segment();
	//   12   19:aload_0         
	//   13   20:new             #2   <Class TokenBuffer$Segment>
	//   14   23:dup             
	//   15   24:invokespecial   #102 <Method void TokenBuffer$Segment()>
	//   16   27:putfield        #104 <Field TokenBuffer$Segment _next>
			_next.set(0, jsontoken, obj, obj1, obj2);
	//   17   30:aload_0         
	//   18   31:getfield        #104 <Field TokenBuffer$Segment _next>
	//   19   34:iconst_0        
	//   20   35:aload_2         
	//   21   36:aload_3         
	//   22   37:aload           4
	//   23   39:aload           5
	//   24   41:invokespecial   #113 <Method void set(int, JsonToken, Object, Object, Object)>
			return _next;
	//   25   44:aload_0         
	//   26   45:getfield        #104 <Field TokenBuffer$Segment _next>
	//   27   48:areturn         
		}
	}

	public Object get(int i)
	{
		return _tokens[i];
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Object[] _tokens>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public boolean hasIds()
	{
		return _nativeIds != null;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field TreeMap _nativeIds>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public TokenBuffer$Segment next()
	{
		return _next;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field TokenBuffer$Segment _next>
	//    2    4:areturn         
	}

	public JsonToken type(int i)
	{
		long l1 = _tokenTypes;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field long _tokenTypes>
	//    2    4:lstore          4
		long l = l1;
	//    3    6:lload           4
	//    4    8:lstore_2        
		if(i > 0)
	//*   5    9:iload_1         
	//*   6   10:ifle            20
			l = l1 >> (i << 2);
	//    7   13:lload           4
	//    8   15:iload_1         
	//    9   16:iconst_2        
	//   10   17:ishl            
	//   11   18:lshr            
	//   12   19:lstore_2        
		i = (int)l;
	//   13   20:lload_2         
	//   14   21:l2i             
	//   15   22:istore_1        
		return TOKEN_TYPES_BY_INDEX[i & 0xf];
	//   16   23:getstatic       #24  <Field JsonToken[] TOKEN_TYPES_BY_INDEX>
	//   17   26:iload_1         
	//   18   27:bipush          15
	//   19   29:iand            
	//   20   30:aaload          
	//   21   31:areturn         
	}

	private static final JsonToken TOKEN_TYPES_BY_INDEX[];
	protected TreeMap _nativeIds;
	protected TokenBuffer$Segment _next;
	protected long _tokenTypes;
	protected final Object _tokens[] = new Object[16];

	static 
	{
		TOKEN_TYPES_BY_INDEX = new JsonToken[16];
	//    0    0:bipush          16
	//    1    2:anewarray       JsonToken[]
	//    2    5:putstatic       #24  <Field JsonToken[] TOKEN_TYPES_BY_INDEX>
		JsonToken ajsontoken[] = JsonToken.values();
	//    3    8:invokestatic    #28  <Method JsonToken[] JsonToken.values()>
	//    4   11:astore_0        
		System.arraycopy(((Object) (ajsontoken)), 1, ((Object) (TOKEN_TYPES_BY_INDEX)), 1, Math.min(15, ajsontoken.length - 1));
	//    5   12:aload_0         
	//    6   13:iconst_1        
	//    7   14:getstatic       #24  <Field JsonToken[] TOKEN_TYPES_BY_INDEX>
	//    8   17:iconst_1        
	//    9   18:bipush          15
	//   10   20:aload_0         
	//   11   21:arraylength     
	//   12   22:iconst_1        
	//   13   23:isub            
	//   14   24:invokestatic    #34  <Method int Math.min(int, int)>
	//   15   27:invokestatic    #40  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  16   30:return          
	}


/*
	static Object access$000(TokenBuffer$Segment tokenbuffer$segment, int i)
	{
		return tokenbuffer$segment.findObjectId(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #55  <Method Object findObjectId(int)>
	//    3    5:areturn         
	}

*/


/*
	static Object access$100(TokenBuffer$Segment tokenbuffer$segment, int i)
	{
		return tokenbuffer$segment.findTypeId(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #59  <Method Object findTypeId(int)>
	//    3    5:areturn         
	}

*/

	public TokenBuffer$Segment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          16
	//    4    7:anewarray       Object[]
	//    5   10:putfield        #46  <Field Object[] _tokens>
	//    6   13:return          
	}
}
