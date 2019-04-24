// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.util.TypeKey;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			ResolvableSerializer

public final class SerializerCache
{

	public SerializerCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class HashMap>
	//    4    8:dup             
	//    5    9:bipush          64
	//    6   11:invokespecial   #19  <Method void HashMap(int)>
	//    7   14:putfield        #21  <Field HashMap _sharedMap>
	//    8   17:aload_0         
	//    9   18:new             #23  <Class AtomicReference>
	//   10   21:dup             
	//   11   22:invokespecial   #24  <Method void AtomicReference()>
	//   12   25:putfield        #26  <Field AtomicReference _readOnlyMap>
	//   13   28:return          
	}

	private final ReadOnlyClassToSerializerMap _makeReadOnlyLookupMap()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ReadOnlyClassToSerializerMap readonlyclasstoserializermap1 = (ReadOnlyClassToSerializerMap)_readOnlyMap.get();
	//    2    2:aload_0         
	//    3    3:getfield        #26  <Field AtomicReference _readOnlyMap>
	//    4    6:invokevirtual   #33  <Method Object AtomicReference.get()>
	//    5    9:checkcast       #35  <Class ReadOnlyClassToSerializerMap>
	//    6   12:astore_2        
		ReadOnlyClassToSerializerMap readonlyclasstoserializermap;
		readonlyclasstoserializermap = readonlyclasstoserializermap1;
	//    7   13:aload_2         
	//    8   14:astore_1        
		if(readonlyclasstoserializermap1 != null)
			break MISSING_BLOCK_LABEL_35;
	//    9   15:aload_2         
	//   10   16:ifnonnull       35
		readonlyclasstoserializermap = ReadOnlyClassToSerializerMap.from(_sharedMap);
	//   11   19:aload_0         
	//   12   20:getfield        #21  <Field HashMap _sharedMap>
	//   13   23:invokestatic    #39  <Method ReadOnlyClassToSerializerMap ReadOnlyClassToSerializerMap.from(HashMap)>
	//   14   26:astore_1        
		_readOnlyMap.set(((Object) (readonlyclasstoserializermap)));
	//   15   27:aload_0         
	//   16   28:getfield        #26  <Field AtomicReference _readOnlyMap>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #43  <Method void AtomicReference.set(Object)>
		this;
	//   19   35:aload_0         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return readonlyclasstoserializermap;
	//   21   37:aload_1         
	//   22   38:areturn         
		Exception exception;
		exception;
	//   23   39:astore_1        
	//*  24   40:aload_0         
		throw exception;
	//   25   41:monitorexit     
	//   26   42:aload_1         
	//   27   43:athrow          
	}

	public void addAndResolveNonTypedSerializer(JavaType javatype, JsonSerializer jsonserializer, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(_sharedMap.put(((Object) (new TypeKey(javatype, false))), ((Object) (jsonserializer))) == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #21  <Field HashMap _sharedMap>
	//*   4    6:new             #49  <Class TypeKey>
	//*   5    9:dup             
	//*   6   10:aload_1         
	//*   7   11:iconst_0        
	//*   8   12:invokespecial   #52  <Method void TypeKey(JavaType, boolean)>
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #56  <Method Object HashMap.put(Object, Object)>
	//*  11   19:ifnonnull       30
			_readOnlyMap.set(((Object) (null)));
	//   12   22:aload_0         
	//   13   23:getfield        #26  <Field AtomicReference _readOnlyMap>
	//   14   26:aconst_null     
	//   15   27:invokevirtual   #43  <Method void AtomicReference.set(Object)>
		if(jsonserializer instanceof ResolvableSerializer)
	//*  16   30:aload_2         
	//*  17   31:instanceof      #58  <Class ResolvableSerializer>
	//*  18   34:ifeq            47
			((ResolvableSerializer)jsonserializer).resolve(serializerprovider);
	//   19   37:aload_2         
	//   20   38:checkcast       #58  <Class ResolvableSerializer>
	//   21   41:aload_3         
	//   22   42:invokeinterface #62  <Method void ResolvableSerializer.resolve(SerializerProvider)>
		this;
	//   23   47:aload_0         
		JVM INSTR monitorexit ;
	//   24   48:monitorexit     
		return;
	//   25   49:return          
		javatype;
	//   26   50:astore_1        
		this;
	//   27   51:aload_0         
		JVM INSTR monitorexit ;
	//   28   52:monitorexit     
		throw javatype;
	//   29   53:aload_1         
	//   30   54:athrow          
	}

	public void addAndResolveNonTypedSerializer(Class class1, JavaType javatype, JsonSerializer jsonserializer, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		class1 = ((Class) (_sharedMap.put(((Object) (new TypeKey(class1, false))), ((Object) (jsonserializer)))));
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field HashMap _sharedMap>
	//    4    6:new             #49  <Class TypeKey>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokespecial   #69  <Method void TypeKey(Class, boolean)>
	//    9   15:aload_3         
	//   10   16:invokevirtual   #56  <Method Object HashMap.put(Object, Object)>
	//   11   19:astore_1        
		javatype = ((JavaType) (_sharedMap.put(((Object) (new TypeKey(javatype, false))), ((Object) (jsonserializer)))));
	//   12   20:aload_0         
	//   13   21:getfield        #21  <Field HashMap _sharedMap>
	//   14   24:new             #49  <Class TypeKey>
	//   15   27:dup             
	//   16   28:aload_2         
	//   17   29:iconst_0        
	//   18   30:invokespecial   #52  <Method void TypeKey(JavaType, boolean)>
	//   19   33:aload_3         
	//   20   34:invokevirtual   #56  <Method Object HashMap.put(Object, Object)>
	//   21   37:astore_2        
		if(class1 != null && javatype != null)
			break MISSING_BLOCK_LABEL_54;
	//   22   38:aload_1         
	//   23   39:ifnull          46
	//   24   42:aload_2         
	//   25   43:ifnonnull       54
		_readOnlyMap.set(((Object) (null)));
	//   26   46:aload_0         
	//   27   47:getfield        #26  <Field AtomicReference _readOnlyMap>
	//   28   50:aconst_null     
	//   29   51:invokevirtual   #43  <Method void AtomicReference.set(Object)>
		if(jsonserializer instanceof ResolvableSerializer)
	//*  30   54:aload_3         
	//*  31   55:instanceof      #58  <Class ResolvableSerializer>
	//*  32   58:ifeq            72
			((ResolvableSerializer)jsonserializer).resolve(serializerprovider);
	//   33   61:aload_3         
	//   34   62:checkcast       #58  <Class ResolvableSerializer>
	//   35   65:aload           4
	//   36   67:invokeinterface #62  <Method void ResolvableSerializer.resolve(SerializerProvider)>
		this;
	//   37   72:aload_0         
		JVM INSTR monitorexit ;
	//   38   73:monitorexit     
		return;
	//   39   74:return          
		class1;
	//   40   75:astore_1        
		this;
	//   41   76:aload_0         
		JVM INSTR monitorexit ;
	//   42   77:monitorexit     
		throw class1;
	//   43   78:aload_1         
	//   44   79:athrow          
	}

	public void addAndResolveNonTypedSerializer(Class class1, JsonSerializer jsonserializer, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(_sharedMap.put(((Object) (new TypeKey(class1, false))), ((Object) (jsonserializer))) == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #21  <Field HashMap _sharedMap>
	//*   4    6:new             #49  <Class TypeKey>
	//*   5    9:dup             
	//*   6   10:aload_1         
	//*   7   11:iconst_0        
	//*   8   12:invokespecial   #69  <Method void TypeKey(Class, boolean)>
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #56  <Method Object HashMap.put(Object, Object)>
	//*  11   19:ifnonnull       30
			_readOnlyMap.set(((Object) (null)));
	//   12   22:aload_0         
	//   13   23:getfield        #26  <Field AtomicReference _readOnlyMap>
	//   14   26:aconst_null     
	//   15   27:invokevirtual   #43  <Method void AtomicReference.set(Object)>
		if(jsonserializer instanceof ResolvableSerializer)
	//*  16   30:aload_2         
	//*  17   31:instanceof      #58  <Class ResolvableSerializer>
	//*  18   34:ifeq            47
			((ResolvableSerializer)jsonserializer).resolve(serializerprovider);
	//   19   37:aload_2         
	//   20   38:checkcast       #58  <Class ResolvableSerializer>
	//   21   41:aload_3         
	//   22   42:invokeinterface #62  <Method void ResolvableSerializer.resolve(SerializerProvider)>
		this;
	//   23   47:aload_0         
		JVM INSTR monitorexit ;
	//   24   48:monitorexit     
		return;
	//   25   49:return          
		class1;
	//   26   50:astore_1        
		this;
	//   27   51:aload_0         
		JVM INSTR monitorexit ;
	//   28   52:monitorexit     
		throw class1;
	//   29   53:aload_1         
	//   30   54:athrow          
	}

	public void addTypedSerializer(JavaType javatype, JsonSerializer jsonserializer)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(_sharedMap.put(((Object) (new TypeKey(javatype, true))), ((Object) (jsonserializer))) == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #21  <Field HashMap _sharedMap>
	//*   4    6:new             #49  <Class TypeKey>
	//*   5    9:dup             
	//*   6   10:aload_1         
	//*   7   11:iconst_1        
	//*   8   12:invokespecial   #52  <Method void TypeKey(JavaType, boolean)>
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #56  <Method Object HashMap.put(Object, Object)>
	//*  11   19:ifnonnull       30
			_readOnlyMap.set(((Object) (null)));
	//   12   22:aload_0         
	//   13   23:getfield        #26  <Field AtomicReference _readOnlyMap>
	//   14   26:aconst_null     
	//   15   27:invokevirtual   #43  <Method void AtomicReference.set(Object)>
		this;
	//   16   30:aload_0         
		JVM INSTR monitorexit ;
	//   17   31:monitorexit     
		return;
	//   18   32:return          
		javatype;
	//   19   33:astore_1        
		this;
	//   20   34:aload_0         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		throw javatype;
	//   22   36:aload_1         
	//   23   37:athrow          
	}

	public void addTypedSerializer(Class class1, JsonSerializer jsonserializer)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(_sharedMap.put(((Object) (new TypeKey(class1, true))), ((Object) (jsonserializer))) == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #21  <Field HashMap _sharedMap>
	//*   4    6:new             #49  <Class TypeKey>
	//*   5    9:dup             
	//*   6   10:aload_1         
	//*   7   11:iconst_1        
	//*   8   12:invokespecial   #69  <Method void TypeKey(Class, boolean)>
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #56  <Method Object HashMap.put(Object, Object)>
	//*  11   19:ifnonnull       30
			_readOnlyMap.set(((Object) (null)));
	//   12   22:aload_0         
	//   13   23:getfield        #26  <Field AtomicReference _readOnlyMap>
	//   14   26:aconst_null     
	//   15   27:invokevirtual   #43  <Method void AtomicReference.set(Object)>
		this;
	//   16   30:aload_0         
		JVM INSTR monitorexit ;
	//   17   31:monitorexit     
		return;
	//   18   32:return          
		class1;
	//   19   33:astore_1        
		this;
	//   20   34:aload_0         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		throw class1;
	//   22   36:aload_1         
	//   23   37:athrow          
	}

	public void flush()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		_sharedMap.clear();
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field HashMap _sharedMap>
	//    4    6:invokevirtual   #81  <Method void HashMap.clear()>
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		Exception exception;
		exception;
	//    8   12:astore_1        
	//*   9   13:aload_0         
		throw exception;
	//   10   14:monitorexit     
	//   11   15:aload_1         
	//   12   16:athrow          
	}

	public ReadOnlyClassToSerializerMap getReadOnlyLookupMap()
	{
		ReadOnlyClassToSerializerMap readonlyclasstoserializermap = (ReadOnlyClassToSerializerMap)_readOnlyMap.get();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field AtomicReference _readOnlyMap>
	//    2    4:invokevirtual   #33  <Method Object AtomicReference.get()>
	//    3    7:checkcast       #35  <Class ReadOnlyClassToSerializerMap>
	//    4   10:astore_1        
		if(readonlyclasstoserializermap != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          17
			return readonlyclasstoserializermap;
	//    7   15:aload_1         
	//    8   16:areturn         
		else
			return _makeReadOnlyLookupMap();
	//    9   17:aload_0         
	//   10   18:invokespecial   #84  <Method ReadOnlyClassToSerializerMap _makeReadOnlyLookupMap()>
	//   11   21:areturn         
	}

	public int size()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = _sharedMap.size();
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field HashMap _sharedMap>
	//    4    6:invokevirtual   #88  <Method int HashMap.size()>
	//    5    9:istore_1        
		this;
	//    6   10:aload_0         
		JVM INSTR monitorexit ;
	//    7   11:monitorexit     
		return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
		Exception exception;
		exception;
	//   10   14:astore_2        
	//*  11   15:aload_0         
		throw exception;
	//   12   16:monitorexit     
	//   13   17:aload_2         
	//   14   18:athrow          
	}

	public JsonSerializer typedValueSerializer(JavaType javatype)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		javatype = ((JavaType) ((JsonSerializer)_sharedMap.get(((Object) (new TypeKey(javatype, true))))));
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field HashMap _sharedMap>
	//    4    6:new             #49  <Class TypeKey>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:invokespecial   #52  <Method void TypeKey(JavaType, boolean)>
	//    9   15:invokevirtual   #93  <Method Object HashMap.get(Object)>
	//   10   18:checkcast       #95  <Class JsonSerializer>
	//   11   21:astore_1        
		this;
	//   12   22:aload_0         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return ((JsonSerializer) (javatype));
	//   14   24:aload_1         
	//   15   25:areturn         
		javatype;
	//   16   26:astore_1        
		this;
	//   17   27:aload_0         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		throw javatype;
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	public JsonSerializer typedValueSerializer(Class class1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		class1 = ((Class) ((JsonSerializer)_sharedMap.get(((Object) (new TypeKey(class1, true))))));
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field HashMap _sharedMap>
	//    4    6:new             #49  <Class TypeKey>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:invokespecial   #69  <Method void TypeKey(Class, boolean)>
	//    9   15:invokevirtual   #93  <Method Object HashMap.get(Object)>
	//   10   18:checkcast       #95  <Class JsonSerializer>
	//   11   21:astore_1        
		this;
	//   12   22:aload_0         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return ((JsonSerializer) (class1));
	//   14   24:aload_1         
	//   15   25:areturn         
		class1;
	//   16   26:astore_1        
		this;
	//   17   27:aload_0         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		throw class1;
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	public JsonSerializer untypedValueSerializer(JavaType javatype)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		javatype = ((JavaType) ((JsonSerializer)_sharedMap.get(((Object) (new TypeKey(javatype, false))))));
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field HashMap _sharedMap>
	//    4    6:new             #49  <Class TypeKey>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokespecial   #52  <Method void TypeKey(JavaType, boolean)>
	//    9   15:invokevirtual   #93  <Method Object HashMap.get(Object)>
	//   10   18:checkcast       #95  <Class JsonSerializer>
	//   11   21:astore_1        
		this;
	//   12   22:aload_0         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return ((JsonSerializer) (javatype));
	//   14   24:aload_1         
	//   15   25:areturn         
		javatype;
	//   16   26:astore_1        
		this;
	//   17   27:aload_0         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		throw javatype;
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	public JsonSerializer untypedValueSerializer(Class class1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		class1 = ((Class) ((JsonSerializer)_sharedMap.get(((Object) (new TypeKey(class1, false))))));
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field HashMap _sharedMap>
	//    4    6:new             #49  <Class TypeKey>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokespecial   #69  <Method void TypeKey(Class, boolean)>
	//    9   15:invokevirtual   #93  <Method Object HashMap.get(Object)>
	//   10   18:checkcast       #95  <Class JsonSerializer>
	//   11   21:astore_1        
		this;
	//   12   22:aload_0         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return ((JsonSerializer) (class1));
	//   14   24:aload_1         
	//   15   25:areturn         
		class1;
	//   16   26:astore_1        
		this;
	//   17   27:aload_0         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		throw class1;
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	private final AtomicReference _readOnlyMap = new AtomicReference();
	private final HashMap _sharedMap = new HashMap(64);
}
