// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//			ObjectIdGenerator, ObjectIdGenerators

private static abstract class ObjectIdGenerators$Base extends ObjectIdGenerator
{

	public boolean canUseFor(ObjectIdGenerator objectidgenerator)
	{
		return ((Object) (objectidgenerator)).getClass() == ((Object)this).getClass() && objectidgenerator.getScope() == _scope;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method Class Object.getClass()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #29  <Method Class Object.getClass()>
	//    4    8:if_acmpne       24
	//    5   11:aload_1         
	//    6   12:invokevirtual   #32  <Method Class ObjectIdGenerator.getScope()>
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field Class _scope>
	//    9   19:if_acmpne       24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public abstract Object generateId(Object obj);

	public final Class getScope()
	{
		return _scope;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Class _scope>
	//    2    4:areturn         
	}

	protected final Class _scope;

	protected ObjectIdGenerators$Base(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void ObjectIdGenerator()>
		_scope = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Class _scope>
	//    5    9:return          
	}
}
