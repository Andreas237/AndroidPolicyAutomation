// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.TypeKey;
import java.util.*;

public final class ReadOnlyClassToSerializerMap
{
	private static final class Bucket
	{

		public boolean matchesTyped(JavaType javatype)
		{
			return _isTyped && javatype.equals(((Object) (_type)));
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field boolean _isTyped>
		//    2    4:ifeq            20
		//    3    7:aload_1         
		//    4    8:aload_0         
		//    5    9:getfield        #48  <Field JavaType _type>
		//    6   12:invokevirtual   #59  <Method boolean JavaType.equals(Object)>
		//    7   15:ifeq            20
		//    8   18:iconst_1        
		//    9   19:ireturn         
		//   10   20:iconst_0        
		//   11   21:ireturn         
		}

		public boolean matchesTyped(Class class1)
		{
			return _class == class1 && _isTyped;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field Class _class>
		//    2    4:aload_1         
		//    3    5:if_acmpne       17
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field boolean _isTyped>
		//    6   12:ifeq            17
		//    7   15:iconst_1        
		//    8   16:ireturn         
		//    9   17:iconst_0        
		//   10   18:ireturn         
		}

		public boolean matchesUntyped(JavaType javatype)
		{
			return !_isTyped && javatype.equals(((Object) (_type)));
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field boolean _isTyped>
		//    2    4:ifne            20
		//    3    7:aload_1         
		//    4    8:aload_0         
		//    5    9:getfield        #48  <Field JavaType _type>
		//    6   12:invokevirtual   #59  <Method boolean JavaType.equals(Object)>
		//    7   15:ifeq            20
		//    8   18:iconst_1        
		//    9   19:ireturn         
		//   10   20:iconst_0        
		//   11   21:ireturn         
		}

		public boolean matchesUntyped(Class class1)
		{
			return _class == class1 && !_isTyped;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field Class _class>
		//    2    4:aload_1         
		//    3    5:if_acmpne       17
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field boolean _isTyped>
		//    6   12:ifne            17
		//    7   15:iconst_1        
		//    8   16:ireturn         
		//    9   17:iconst_0        
		//   10   18:ireturn         
		}

		protected final Class _class;
		protected final boolean _isTyped;
		protected final JavaType _type;
		public final Bucket next;
		public final JsonSerializer value;

		public Bucket(Bucket bucket, TypeKey typekey, JsonSerializer jsonserializer)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			next = bucket;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #26  <Field ReadOnlyClassToSerializerMap$Bucket next>
			value = jsonserializer;
		//    5    9:aload_0         
		//    6   10:aload_3         
		//    7   11:putfield        #28  <Field JsonSerializer value>
			_isTyped = typekey.isTyped();
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #34  <Method boolean TypeKey.isTyped()>
		//   11   19:putfield        #36  <Field boolean _isTyped>
			_class = typekey.getRawType();
		//   12   22:aload_0         
		//   13   23:aload_2         
		//   14   24:invokevirtual   #40  <Method Class TypeKey.getRawType()>
		//   15   27:putfield        #42  <Field Class _class>
			_type = typekey.getType();
		//   16   30:aload_0         
		//   17   31:aload_2         
		//   18   32:invokevirtual   #46  <Method JavaType TypeKey.getType()>
		//   19   35:putfield        #48  <Field JavaType _type>
		//   20   38:return          
		}
	}


	public ReadOnlyClassToSerializerMap(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		int i = findSize(map.size());
	//    2    4:aload_1         
	//    3    5:invokeinterface #23  <Method int Map.size()>
	//    4   10:invokestatic    #27  <Method int findSize(int)>
	//    5   13:istore_2        
		_size = i;
	//    6   14:aload_0         
	//    7   15:iload_2         
	//    8   16:putfield        #29  <Field int _size>
		_mask = i - 1;
	//    9   19:aload_0         
	//   10   20:iload_2         
	//   11   21:iconst_1        
	//   12   22:isub            
	//   13   23:putfield        #31  <Field int _mask>
		Bucket abucket[] = new Bucket[i];
	//   14   26:iload_2         
	//   15   27:anewarray       Bucket[]
	//   16   30:astore_3        
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext();)
	//*  17   31:aload_1         
	//*  18   32:invokeinterface #35  <Method Set Map.entrySet()>
	//*  19   37:invokeinterface #41  <Method Iterator Set.iterator()>
	//*  20   42:astore_1        
	//*  21   43:aload_1         
	//*  22   44:invokeinterface #47  <Method boolean Iterator.hasNext()>
	//*  23   49:ifeq            114
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   24   52:aload_1         
	//   25   53:invokeinterface #51  <Method Object Iterator.next()>
	//   26   58:checkcast       #53  <Class java.util.Map$Entry>
	//   27   61:astore          4
			TypeKey typekey = (TypeKey)entry.getKey();
	//   28   63:aload           4
	//   29   65:invokeinterface #56  <Method Object java.util.Map$Entry.getKey()>
	//   30   70:checkcast       #58  <Class TypeKey>
	//   31   73:astore          5
			int j = typekey.hashCode() & _mask;
	//   32   75:aload           5
	//   33   77:invokevirtual   #61  <Method int TypeKey.hashCode()>
	//   34   80:aload_0         
	//   35   81:getfield        #31  <Field int _mask>
	//   36   84:iand            
	//   37   85:istore_2        
			abucket[j] = new Bucket(abucket[j], typekey, (JsonSerializer)entry.getValue());
	//   38   86:aload_3         
	//   39   87:iload_2         
	//   40   88:new             #6   <Class ReadOnlyClassToSerializerMap$Bucket>
	//   41   91:dup             
	//   42   92:aload_3         
	//   43   93:iload_2         
	//   44   94:aaload          
	//   45   95:aload           5
	//   46   97:aload           4
	//   47   99:invokeinterface #64  <Method Object java.util.Map$Entry.getValue()>
	//   48  104:checkcast       #66  <Class JsonSerializer>
	//   49  107:invokespecial   #69  <Method void ReadOnlyClassToSerializerMap$Bucket(ReadOnlyClassToSerializerMap$Bucket, TypeKey, JsonSerializer)>
	//   50  110:aastore         
		}

	//*  51  111:goto            43
		_buckets = abucket;
	//   52  114:aload_0         
	//   53  115:aload_3         
	//   54  116:putfield        #71  <Field ReadOnlyClassToSerializerMap$Bucket[] _buckets>
	//   55  119:return          
	}

	private static final int findSize(int i)
	{
		int j;
		if(i <= 64)
	//*   0    0:iload_0         
	//*   1    1:bipush          64
	//*   2    3:icmpgt          25
			i += i;
	//    3    6:iload_0         
	//    4    7:iload_0         
	//    5    8:iadd            
	//    6    9:istore_0        
		else
	//*   7   10:bipush          8
	//*   8   12:istore_1        
	//*   9   13:iload_1         
	//*  10   14:iload_0         
	//*  11   15:icmpge          34
	//*  12   18:iload_1         
	//*  13   19:iload_1         
	//*  14   20:iadd            
	//*  15   21:istore_1        
	//*  16   22:goto            13
			i += i >> 2;
	//   17   25:iload_0         
	//   18   26:iload_0         
	//   19   27:iconst_2        
	//   20   28:ishr            
	//   21   29:iadd            
	//   22   30:istore_0        
		for(j = 8; j < i; j += j);
	//*  23   31:goto            10
		return j;
	//   24   34:iload_1         
	//   25   35:ireturn         
	}

	public static ReadOnlyClassToSerializerMap from(HashMap hashmap)
	{
		return new ReadOnlyClassToSerializerMap(((Map) (hashmap)));
	//    0    0:new             #2   <Class ReadOnlyClassToSerializerMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #78  <Method void ReadOnlyClassToSerializerMap(Map)>
	//    4    8:areturn         
	}

	public int size()
	{
		return _size;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int _size>
	//    2    4:ireturn         
	}

	public JsonSerializer typedValueSerializer(JavaType javatype)
	{
		Bucket bucket1 = _buckets[TypeKey.typedHash(javatype) & _mask];
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ReadOnlyClassToSerializerMap$Bucket[] _buckets>
	//    2    4:aload_1         
	//    3    5:invokestatic    #85  <Method int TypeKey.typedHash(JavaType)>
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field int _mask>
	//    6   12:iand            
	//    7   13:aaload          
	//    8   14:astore_3        
		if(bucket1 != null) goto _L2; else goto _L1
	//    9   15:aload_3         
	//   10   16:ifnonnull       21
_L1:
		return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
_L2:
		Bucket bucket = bucket1;
	//   13   21:aload_3         
	//   14   22:astore_2        
		if(bucket1.matchesTyped(javatype))
	//*  15   23:aload_3         
	//*  16   24:aload_1         
	//*  17   25:invokevirtual   #89  <Method boolean ReadOnlyClassToSerializerMap$Bucket.matchesTyped(JavaType)>
	//*  18   28:ifeq            36
			return bucket1.value;
	//   19   31:aload_3         
	//   20   32:getfield        #93  <Field JsonSerializer ReadOnlyClassToSerializerMap$Bucket.value>
	//   21   35:areturn         
		do
		{
			Bucket bucket2 = bucket.next;
	//   22   36:aload_2         
	//   23   37:getfield        #96  <Field ReadOnlyClassToSerializerMap$Bucket ReadOnlyClassToSerializerMap$Bucket.next>
	//   24   40:astore_3        
			if(bucket2 == null)
				continue; /* Loop/switch isn't completed */
	//   25   41:aload_3         
	//   26   42:ifnull          19
			bucket = bucket2;
	//   27   45:aload_3         
	//   28   46:astore_2        
			if(bucket2.matchesTyped(javatype))
	//*  29   47:aload_3         
	//*  30   48:aload_1         
	//*  31   49:invokevirtual   #89  <Method boolean ReadOnlyClassToSerializerMap$Bucket.matchesTyped(JavaType)>
	//*  32   52:ifeq            36
				return bucket2.value;
	//   33   55:aload_3         
	//   34   56:getfield        #93  <Field JsonSerializer ReadOnlyClassToSerializerMap$Bucket.value>
	//   35   59:areturn         
		} while(true);
		if(true) goto _L1; else goto _L3
_L3:
	}

	public JsonSerializer typedValueSerializer(Class class1)
	{
		Bucket bucket1 = _buckets[TypeKey.typedHash(class1) & _mask];
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ReadOnlyClassToSerializerMap$Bucket[] _buckets>
	//    2    4:aload_1         
	//    3    5:invokestatic    #101 <Method int TypeKey.typedHash(Class)>
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field int _mask>
	//    6   12:iand            
	//    7   13:aaload          
	//    8   14:astore_3        
		if(bucket1 != null) goto _L2; else goto _L1
	//    9   15:aload_3         
	//   10   16:ifnonnull       21
_L1:
		return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
_L2:
		Bucket bucket = bucket1;
	//   13   21:aload_3         
	//   14   22:astore_2        
		if(bucket1.matchesTyped(class1))
	//*  15   23:aload_3         
	//*  16   24:aload_1         
	//*  17   25:invokevirtual   #104 <Method boolean ReadOnlyClassToSerializerMap$Bucket.matchesTyped(Class)>
	//*  18   28:ifeq            36
			return bucket1.value;
	//   19   31:aload_3         
	//   20   32:getfield        #93  <Field JsonSerializer ReadOnlyClassToSerializerMap$Bucket.value>
	//   21   35:areturn         
		do
		{
			Bucket bucket2 = bucket.next;
	//   22   36:aload_2         
	//   23   37:getfield        #96  <Field ReadOnlyClassToSerializerMap$Bucket ReadOnlyClassToSerializerMap$Bucket.next>
	//   24   40:astore_3        
			if(bucket2 == null)
				continue; /* Loop/switch isn't completed */
	//   25   41:aload_3         
	//   26   42:ifnull          19
			bucket = bucket2;
	//   27   45:aload_3         
	//   28   46:astore_2        
			if(bucket2.matchesTyped(class1))
	//*  29   47:aload_3         
	//*  30   48:aload_1         
	//*  31   49:invokevirtual   #104 <Method boolean ReadOnlyClassToSerializerMap$Bucket.matchesTyped(Class)>
	//*  32   52:ifeq            36
				return bucket2.value;
	//   33   55:aload_3         
	//   34   56:getfield        #93  <Field JsonSerializer ReadOnlyClassToSerializerMap$Bucket.value>
	//   35   59:areturn         
		} while(true);
		if(true) goto _L1; else goto _L3
_L3:
	}

	public JsonSerializer untypedValueSerializer(JavaType javatype)
	{
		Bucket bucket1 = _buckets[TypeKey.untypedHash(javatype) & _mask];
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ReadOnlyClassToSerializerMap$Bucket[] _buckets>
	//    2    4:aload_1         
	//    3    5:invokestatic    #109 <Method int TypeKey.untypedHash(JavaType)>
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field int _mask>
	//    6   12:iand            
	//    7   13:aaload          
	//    8   14:astore_3        
		if(bucket1 != null) goto _L2; else goto _L1
	//    9   15:aload_3         
	//   10   16:ifnonnull       21
_L1:
		return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
_L2:
		Bucket bucket = bucket1;
	//   13   21:aload_3         
	//   14   22:astore_2        
		if(bucket1.matchesUntyped(javatype))
	//*  15   23:aload_3         
	//*  16   24:aload_1         
	//*  17   25:invokevirtual   #112 <Method boolean ReadOnlyClassToSerializerMap$Bucket.matchesUntyped(JavaType)>
	//*  18   28:ifeq            36
			return bucket1.value;
	//   19   31:aload_3         
	//   20   32:getfield        #93  <Field JsonSerializer ReadOnlyClassToSerializerMap$Bucket.value>
	//   21   35:areturn         
		do
		{
			Bucket bucket2 = bucket.next;
	//   22   36:aload_2         
	//   23   37:getfield        #96  <Field ReadOnlyClassToSerializerMap$Bucket ReadOnlyClassToSerializerMap$Bucket.next>
	//   24   40:astore_3        
			if(bucket2 == null)
				continue; /* Loop/switch isn't completed */
	//   25   41:aload_3         
	//   26   42:ifnull          19
			bucket = bucket2;
	//   27   45:aload_3         
	//   28   46:astore_2        
			if(bucket2.matchesUntyped(javatype))
	//*  29   47:aload_3         
	//*  30   48:aload_1         
	//*  31   49:invokevirtual   #112 <Method boolean ReadOnlyClassToSerializerMap$Bucket.matchesUntyped(JavaType)>
	//*  32   52:ifeq            36
				return bucket2.value;
	//   33   55:aload_3         
	//   34   56:getfield        #93  <Field JsonSerializer ReadOnlyClassToSerializerMap$Bucket.value>
	//   35   59:areturn         
		} while(true);
		if(true) goto _L1; else goto _L3
_L3:
	}

	public JsonSerializer untypedValueSerializer(Class class1)
	{
		Bucket bucket1 = _buckets[TypeKey.untypedHash(class1) & _mask];
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ReadOnlyClassToSerializerMap$Bucket[] _buckets>
	//    2    4:aload_1         
	//    3    5:invokestatic    #114 <Method int TypeKey.untypedHash(Class)>
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field int _mask>
	//    6   12:iand            
	//    7   13:aaload          
	//    8   14:astore_3        
		if(bucket1 != null) goto _L2; else goto _L1
	//    9   15:aload_3         
	//   10   16:ifnonnull       21
_L1:
		return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
_L2:
		Bucket bucket = bucket1;
	//   13   21:aload_3         
	//   14   22:astore_2        
		if(bucket1.matchesUntyped(class1))
	//*  15   23:aload_3         
	//*  16   24:aload_1         
	//*  17   25:invokevirtual   #116 <Method boolean ReadOnlyClassToSerializerMap$Bucket.matchesUntyped(Class)>
	//*  18   28:ifeq            36
			return bucket1.value;
	//   19   31:aload_3         
	//   20   32:getfield        #93  <Field JsonSerializer ReadOnlyClassToSerializerMap$Bucket.value>
	//   21   35:areturn         
		do
		{
			Bucket bucket2 = bucket.next;
	//   22   36:aload_2         
	//   23   37:getfield        #96  <Field ReadOnlyClassToSerializerMap$Bucket ReadOnlyClassToSerializerMap$Bucket.next>
	//   24   40:astore_3        
			if(bucket2 == null)
				continue; /* Loop/switch isn't completed */
	//   25   41:aload_3         
	//   26   42:ifnull          19
			bucket = bucket2;
	//   27   45:aload_3         
	//   28   46:astore_2        
			if(bucket2.matchesUntyped(class1))
	//*  29   47:aload_3         
	//*  30   48:aload_1         
	//*  31   49:invokevirtual   #116 <Method boolean ReadOnlyClassToSerializerMap$Bucket.matchesUntyped(Class)>
	//*  32   52:ifeq            36
				return bucket2.value;
	//   33   55:aload_3         
	//   34   56:getfield        #93  <Field JsonSerializer ReadOnlyClassToSerializerMap$Bucket.value>
	//   35   59:areturn         
		} while(true);
		if(true) goto _L1; else goto _L3
_L3:
	}

	private final Bucket _buckets[];
	private final int _mask;
	private final int _size;
}
