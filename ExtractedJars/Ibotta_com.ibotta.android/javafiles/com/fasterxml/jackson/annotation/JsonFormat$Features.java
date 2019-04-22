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
		int l = afeature.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore          5
		int k = 0;
	//    3    4:iconst_0        
	//    4    5:istore          4
		int j = 0;
	//    5    7:iconst_0        
	//    6    8:istore_3        
		int i = 0;
	//    7    9:iconst_0        
	//    8   10:istore_2        
		for(; j < l; j++)
	//*   9   11:iload_3         
	//*  10   12:iload           5
	//*  11   14:icmpge          35
			i |= 1 << afeature[j].ordinal();
	//   12   17:iload_2         
	//   13   18:iconst_1        
	//   14   19:aload_0         
	//   15   20:iload_3         
	//   16   21:aaload          
	//   17   22:invokevirtual   #45  <Method int JsonFormat$Feature.ordinal()>
	//   18   25:ishl            
	//   19   26:ior             
	//   20   27:istore_2        

	//   21   28:iload_3         
	//   22   29:iconst_1        
	//   23   30:iadd            
	//   24   31:istore_3        
	//*  25   32:goto            11
		int i1 = afeature1.length;
	//   26   35:aload_1         
	//   27   36:arraylength     
	//   28   37:istore          6
		l = 0;
	//   29   39:iconst_0        
	//   30   40:istore          5
		j = k;
	//   31   42:iload           4
	//   32   44:istore_3        
		k = l;
	//   33   45:iload           5
	//   34   47:istore          4
		for(; j < i1; j++)
	//*  35   49:iload_3         
	//*  36   50:iload           6
	//*  37   52:icmpge          75
			k |= 1 << afeature1[j].ordinal();
	//   38   55:iload           4
	//   39   57:iconst_1        
	//   40   58:aload_1         
	//   41   59:iload_3         
	//   42   60:aaload          
	//   43   61:invokevirtual   #45  <Method int JsonFormat$Feature.ordinal()>
	//   44   64:ishl            
	//   45   65:ior             
	//   46   66:istore          4

	//   47   68:iload_3         
	//   48   69:iconst_1        
	//   49   70:iadd            
	//   50   71:istore_3        
	//*  51   72:goto            49
		return new JsonFormat$Features(i, k);
	//   52   75:new             #2   <Class JsonFormat$Features>
	//   53   78:dup             
	//   54   79:iload_2         
	//   55   80:iload           4
	//   56   82:invokespecial   #18  <Method void JsonFormat$Features(int, int)>
	//   57   85:areturn         
	}

	public static JsonFormat$Features empty()
	{
		return EMPTY;
	//    0    0:getstatic       #20  <Field JsonFormat$Features EMPTY>
	//    1    3:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
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
		return ((JsonFormat$Features) (obj))._enabled == _enabled && ((JsonFormat$Features) (obj))._disabled == _disabled;
	//   19   31:aload_1         
	//   20   32:getfield        #25  <Field int _enabled>
	//   21   35:aload_0         
	//   22   36:getfield        #25  <Field int _enabled>
	//   23   39:icmpne          55
	//   24   42:aload_1         
	//   25   43:getfield        #27  <Field int _disabled>
	//   26   46:aload_0         
	//   27   47:getfield        #27  <Field int _disabled>
	//   28   50:icmpne          55
	//   29   53:iconst_1        
	//   30   54:ireturn         
	//   31   55:iconst_0        
	//   32   56:ireturn         
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
		if((i & _enabled) != 0)
	//*  12   20:iload_2         
	//*  13   21:aload_0         
	//*  14   22:getfield        #25  <Field int _enabled>
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

	public JsonFormat$Features withOverrides(JsonFormat$Features jsonformat$features)
	{
		if(jsonformat$features == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		int l = jsonformat$features._disabled;
	//    4    6:aload_1         
	//    5    7:getfield        #27  <Field int _disabled>
	//    6   10:istore          5
		int i1 = jsonformat$features._enabled;
	//    7   12:aload_1         
	//    8   13:getfield        #25  <Field int _enabled>
	//    9   16:istore          6
		if(l == 0 && i1 == 0)
	//*  10   18:iload           5
	//*  11   20:ifne            30
	//*  12   23:iload           6
	//*  13   25:ifne            30
			return this;
	//   14   28:aload_0         
	//   15   29:areturn         
		if(_enabled == 0 && _disabled == 0)
	//*  16   30:aload_0         
	//*  17   31:getfield        #25  <Field int _enabled>
	//*  18   34:ifne            46
	//*  19   37:aload_0         
	//*  20   38:getfield        #27  <Field int _disabled>
	//*  21   41:ifne            46
			return jsonformat$features;
	//   22   44:aload_1         
	//   23   45:areturn         
		int i = _enabled;
	//   24   46:aload_0         
	//   25   47:getfield        #25  <Field int _enabled>
	//   26   50:istore_2        
		int j = l & i | i1;
	//   27   51:iload           5
	//   28   53:iload_2         
	//   29   54:iand            
	//   30   55:iload           6
	//   31   57:ior             
	//   32   58:istore_3        
		int k = _disabled;
	//   33   59:aload_0         
	//   34   60:getfield        #27  <Field int _disabled>
	//   35   63:istore          4
		l |= i1 & k;
	//   36   65:iload           5
	//   37   67:iload           6
	//   38   69:iload           4
	//   39   71:iand            
	//   40   72:ior             
	//   41   73:istore          5
		if(j == i && l == k)
	//*  42   75:iload_3         
	//*  43   76:iload_2         
	//*  44   77:icmpne          89
	//*  45   80:iload           5
	//*  46   82:iload           4
	//*  47   84:icmpne          89
			return this;
	//   48   87:aload_0         
	//   49   88:areturn         
		else
			return new JsonFormat$Features(j, l);
	//   50   89:new             #2   <Class JsonFormat$Features>
	//   51   92:dup             
	//   52   93:iload_3         
	//   53   94:iload           5
	//   54   96:invokespecial   #18  <Method void JsonFormat$Features(int, int)>
	//   55   99:areturn         
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
