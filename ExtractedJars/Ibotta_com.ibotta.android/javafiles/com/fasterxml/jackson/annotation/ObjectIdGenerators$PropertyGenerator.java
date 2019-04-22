// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//			ObjectIdGenerators, ObjectIdGenerator

public static abstract class ObjectIdGenerators$PropertyGenerator extends ObjectIdGenerators.Base
{

	public volatile boolean canUseFor(ObjectIdGenerator objectidgenerator)
	{
		return super.canUseFor(objectidgenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method boolean ObjectIdGenerators$Base.canUseFor(ObjectIdGenerator)>
	//    3    5:ireturn         
	}

	private static final long serialVersionUID = 1L;

	protected ObjectIdGenerators$PropertyGenerator(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void ObjectIdGenerators$Base(Class)>
	//    3    5:return          
	}
}
