// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//			JsonFormat

public static class JsonFormat$Features
{

	public static JsonFormat$Features construct(JsonFormat jsonformat)
	{
		return construct(jsonformat.with(), jsonformat.without());
	//    0    0:aload_0         
	//    1    1:invokeinterface #33  <Method JsonFormat$Feature[] JsonFormat.with()>
	//    2    6:aload_0         
	//    3    7:invokeinterface #36  <Method JsonFormat$Feature[] JsonFormat.without()>
	//    4   12:invokestatic    #39  <Method JsonFormat$Features construct(JsonFormat$Feature[], JsonFormat$Feature[])>
	//    5   15:areturn         
	}

	public static JsonFormat$Features construct(JsonFormat.Feature afeature[], JsonFormat.Feature afeature1[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int l = afeature.length;
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:istore          4
		for(int j = 0; j < l; j++)
	//*   5    6:iconst_0        
	//*   6    7:istore_3        
	//*   7    8:iload_3         
	//*   8    9:iload           4
	//*   9   11:icmpge          32
			i |= 1 << afeature[j].ordinal();
	//   10   14:iload_2         
	//   11   15:iconst_1        
	//   12   16:aload_0         
	//   13   17:iload_3         
	//   14   18:aaload          
	//   15   19:invokevirtual   #45  <Method int JsonFormat$Feature.ordinal()>
	//   16   22:ishl            
	//   17   23:ior             
	//   18   24:istore_2        

	//   19   25:iload_3         
	//   20   26:iconst_1        
	//   21   27:iadd            
	//   22   28:istore_3        
	//*  23   29:goto            8
		l = 0;
	//   24   32:iconst_0        
	//   25   33:istore          4
		int i1 = afeature1.length;
	//   26   35:aload_1         
	//   27   36:arraylength     
	//   28   37:istore          5
		for(int k = 0; k < i1; k++)
	//*  29   39:iconst_0        
	//*  30   40:istore_3        
	//*  31   41:iload_3         
	//*  32   42:iload           5
	//*  33   44:icmpge          67
			l |= 1 << afeature1[k].ordinal();
	//   34   47:iload           4
	//   35   49:iconst_1        
	//   36   50:aload_1         
	//   37   51:iload_3         
	//   38   52:aaload          
	//   39   53:invokevirtual   #45  <Method int JsonFormat$Feature.ordinal()>
	//   40   56:ishl            
	//   41   57:ior             
	//   42   58:istore          4

	//   43   60:iload_3         
	//   44   61:iconst_1        
	//   45   62:iadd            
	//   46   63:istore_3        
	//*  47   64:goto            41
		return new JsonFormat$Features(i, l);
	//   48   67:new             #2   <Class JsonFormat$Features>
	//   49   70:dup             
	//   50   71:iload_2         
	//   51   72:iload           4
	//   52   74:invokespecial   #18  <Method void JsonFormat$Features(int, int)>
	//   53   77:areturn         
	}

	public static JsonFormat$Features empty()
	{
		return EMPTY;
	//    0    0:getstatic       #20  <Field JsonFormat$Features EMPTY>
	//    1    3:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
				return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
			if(obj.getClass() != ((Object)this).getClass())
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #53  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #53  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
				return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
			obj = ((Object) ((JsonFormat$Features)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class JsonFormat$Features>
	//   18   30:astore_1        
			if(((JsonFormat$Features) (obj))._enabled != _enabled || ((JsonFormat$Features) (obj))._disabled != _disabled)
	//*  19   31:aload_1         
	//*  20   32:getfield        #25  <Field int _enabled>
	//*  21   35:aload_0         
	//*  22   36:getfield        #25  <Field int _enabled>
	//*  23   39:icmpne          53
	//*  24   42:aload_1         
	//*  25   43:getfield        #27  <Field int _disabled>
	//*  26   46:aload_0         
	//*  27   47:getfield        #27  <Field int _disabled>
	//*  28   50:icmpeq          5
				return false;
	//   29   53:iconst_0        
	//   30   54:ireturn         
		}
		return true;
	}

	public Boolean get(JsonFormat.Feature feature)
	{
		int i = 1 << feature.ordinal();
	//    0    0:iconst_1        
	//    1    1:aload_1         
	//    2    2:invokevirtual   #45  <Method int JsonFormat$Feature.ordinal()>
	//    3    5:ishl            
	//    4    6:istore_2        
		if((_disabled & i) != 0)
	//*   5    7:aload_0         
	//*   6    8:getfield        #27  <Field int _disabled>
	//*   7   11:iload_2         
	//*   8   12:iand            
	//*   9   13:ifeq            20
			return Boolean.FALSE;
	//   10   16:getstatic       #61  <Field Boolean Boolean.FALSE>
	//   11   19:areturn         
		if((_enabled & i) != 0)
	//*  12   20:aload_0         
	//*  13   21:getfield        #25  <Field int _enabled>
	//*  14   24:iload_2         
	//*  15   25:iand            
	//*  16   26:ifeq            33
			return Boolean.TRUE;
	//   17   29:getstatic       #64  <Field Boolean Boolean.TRUE>
	//   18   32:areturn         
		else
			return null;
	//   19   33:aconst_null     
	//   20   34:areturn         
	}

	public int hashCode()
	{
		return _disabled + _enabled;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int _disabled>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field int _enabled>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public transient JsonFormat$Features with(JsonFormat.Feature afeature[])
	{
		int j = _enabled;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int _enabled>
	//    2    4:istore_3        
		int k = afeature.length;
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:istore          4
		for(int i = 0; i < k; i++)
	//*   6    9:iconst_0        
	//*   7   10:istore_2        
	//*   8   11:iload_2         
	//*   9   12:iload           4
	//*  10   14:icmpge          35
			j |= 1 << afeature[i].ordinal();
	//   11   17:iload_3         
	//   12   18:iconst_1        
	//   13   19:aload_1         
	//   14   20:iload_2         
	//   15   21:aaload          
	//   16   22:invokevirtual   #45  <Method int JsonFormat$Feature.ordinal()>
	//   17   25:ishl            
	//   18   26:ior             
	//   19   27:istore_3        

	//   20   28:iload_2         
	//   21   29:iconst_1        
	//   22   30:iadd            
	//   23   31:istore_2        
	//*  24   32:goto            11
		if(j == _enabled)
	//*  25   35:iload_3         
	//*  26   36:aload_0         
	//*  27   37:getfield        #25  <Field int _enabled>
	//*  28   40:icmpne          45
			return this;
	//   29   43:aload_0         
	//   30   44:areturn         
		else
			return new JsonFormat$Features(j, _disabled);
	//   31   45:new             #2   <Class JsonFormat$Features>
	//   32   48:dup             
	//   33   49:iload_3         
	//   34   50:aload_0         
	//   35   51:getfield        #27  <Field int _disabled>
	//   36   54:invokespecial   #18  <Method void JsonFormat$Features(int, int)>
	//   37   57:areturn         
	}

	public JsonFormat$Features withOverrides(JsonFormat$Features jsonformat$features)
	{
		if(jsonformat$features != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
	//*   2    4:aload_0         
	//*   3    5:areturn         
		{
			int j = jsonformat$features._disabled;
	//    4    6:aload_1         
	//    5    7:getfield        #27  <Field int _disabled>
	//    6   10:istore_3        
			int k = jsonformat$features._enabled;
	//    7   11:aload_1         
	//    8   12:getfield        #25  <Field int _enabled>
	//    9   15:istore          4
			if(j != 0 || k != 0)
	//*  10   17:iload_3         
	//*  11   18:ifne            26
	//*  12   21:iload           4
	//*  13   23:ifeq            4
			{
				if(_enabled == 0 && _disabled == 0)
	//*  14   26:aload_0         
	//*  15   27:getfield        #25  <Field int _enabled>
	//*  16   30:ifne            42
	//*  17   33:aload_0         
	//*  18   34:getfield        #27  <Field int _disabled>
	//*  19   37:ifne            42
					return jsonformat$features;
	//   20   40:aload_1         
	//   21   41:areturn         
				int i = _enabled & ~j | k;
	//   22   42:aload_0         
	//   23   43:getfield        #25  <Field int _enabled>
	//   24   46:iload_3         
	//   25   47:iconst_m1       
	//   26   48:ixor            
	//   27   49:iand            
	//   28   50:iload           4
	//   29   52:ior             
	//   30   53:istore_2        
				j = _disabled & ~k | j;
	//   31   54:aload_0         
	//   32   55:getfield        #27  <Field int _disabled>
	//   33   58:iload           4
	//   34   60:iconst_m1       
	//   35   61:ixor            
	//   36   62:iand            
	//   37   63:iload_3         
	//   38   64:ior             
	//   39   65:istore_3        
				if(i != _enabled || j != _disabled)
	//*  40   66:iload_2         
	//*  41   67:aload_0         
	//*  42   68:getfield        #25  <Field int _enabled>
	//*  43   71:icmpne          82
	//*  44   74:iload_3         
	//*  45   75:aload_0         
	//*  46   76:getfield        #27  <Field int _disabled>
	//*  47   79:icmpeq          4
					return new JsonFormat$Features(i, j);
	//   48   82:new             #2   <Class JsonFormat$Features>
	//   49   85:dup             
	//   50   86:iload_2         
	//   51   87:iload_3         
	//   52   88:invokespecial   #18  <Method void JsonFormat$Features(int, int)>
	//   53   91:areturn         
			}
		}
		return this;
	}

	public transient JsonFormat$Features without(JsonFormat.Feature afeature[])
	{
		int j = _disabled;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int _disabled>
	//    2    4:istore_3        
		int k = afeature.length;
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:istore          4
		for(int i = 0; i < k; i++)
	//*   6    9:iconst_0        
	//*   7   10:istore_2        
	//*   8   11:iload_2         
	//*   9   12:iload           4
	//*  10   14:icmpge          35
			j |= 1 << afeature[i].ordinal();
	//   11   17:iload_3         
	//   12   18:iconst_1        
	//   13   19:aload_1         
	//   14   20:iload_2         
	//   15   21:aaload          
	//   16   22:invokevirtual   #45  <Method int JsonFormat$Feature.ordinal()>
	//   17   25:ishl            
	//   18   26:ior             
	//   19   27:istore_3        

	//   20   28:iload_2         
	//   21   29:iconst_1        
	//   22   30:iadd            
	//   23   31:istore_2        
	//*  24   32:goto            11
		if(j == _disabled)
	//*  25   35:iload_3         
	//*  26   36:aload_0         
	//*  27   37:getfield        #27  <Field int _disabled>
	//*  28   40:icmpne          45
			return this;
	//   29   43:aload_0         
	//   30   44:areturn         
		else
			return new JsonFormat$Features(_enabled, j);
	//   31   45:new             #2   <Class JsonFormat$Features>
	//   32   48:dup             
	//   33   49:aload_0         
	//   34   50:getfield        #25  <Field int _enabled>
	//   35   53:iload_3         
	//   36   54:invokespecial   #18  <Method void JsonFormat$Features(int, int)>
	//   37   57:areturn         
	}

	private static final JsonFormat$Features EMPTY = new JsonFormat$Features(0, 0);
	private final int _disabled;
	private final int _enabled;

	static 
	{
	//    0    0:new             #2   <Class JsonFormat$Features>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:invokespecial   #18  <Method void JsonFormat$Features(int, int)>
	//    5    9:putstatic       #20  <Field JsonFormat$Features EMPTY>
	//*   6   12:return          
	}

	private JsonFormat$Features(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		_enabled = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field int _enabled>
		_disabled = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #27  <Field int _disabled>
	//    8   14:return          
	}
}
