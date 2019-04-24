// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.util.UUID;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			ObjectIdGenerators, ObjectIdGenerator

public static final class ObjectIdGenerators$UUIDGenerator extends ObjectIdGenerators.Base
{

	public boolean canUseFor(ObjectIdGenerator objectidgenerator)
	{
		return ((Object) (objectidgenerator)).getClass() == ((Object)this).getClass();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method Class Object.getClass()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #29  <Method Class Object.getClass()>
	//    4    8:if_acmpne       13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public ObjectIdGenerator forScope(Class class1)
	{
		return ((ObjectIdGenerator) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public volatile Object generateId(Object obj)
	{
		return ((Object) (generateId(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #38  <Method UUID generateId(Object)>
	//    3    5:areturn         
	}

	public UUID generateId(Object obj)
	{
		return UUID.randomUUID();
	//    0    0:invokestatic    #44  <Method UUID UUID.randomUUID()>
	//    1    3:areturn         
	}

	public ObjectIdGenerator.IdKey key(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new ObjectIdGenerator.IdKey(((Object)this).getClass(), ((Class) (null)), obj);
	//    4    6:new             #48  <Class ObjectIdGenerator$IdKey>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokevirtual   #29  <Method Class Object.getClass()>
	//    8   14:aconst_null     
	//    9   15:aload_1         
	//   10   16:invokespecial   #51  <Method void ObjectIdGenerator$IdKey(Class, Class, Object)>
	//   11   19:areturn         
	}

	public ObjectIdGenerator newForSerialization(Object obj)
	{
		return ((ObjectIdGenerator) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private static final long serialVersionUID = 1L;

	public ObjectIdGenerators$UUIDGenerator()
	{
		this(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <Class Object>
	//    2    3:invokespecial   #19  <Method void ObjectIdGenerators$UUIDGenerator(Class)>
	//    3    6:return          
	}

	private ObjectIdGenerators$UUIDGenerator(Class class1)
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <Class Object>
	//    2    3:invokespecial   #21  <Method void ObjectIdGenerators$Base(Class)>
	//    3    6:return          
	}
}
