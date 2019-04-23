// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;


// Referenced classes of package com.bumptech.glide.load.model:
//			MultiModelLoaderFactory, ModelLoaderFactory

private static class MultiModelLoaderFactory$Entry
{

	public boolean handles(Class class1)
	{
		return modelClass.isAssignableFrom(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Class modelClass>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method boolean Class.isAssignableFrom(Class)>
	//    4    8:ireturn         
	}

	public boolean handles(Class class1, Class class2)
	{
		return handles(class1) && dataClass.isAssignableFrom(class2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #43  <Method boolean handles(Class)>
	//    3    5:ifeq            21
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field Class dataClass>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #39  <Method boolean Class.isAssignableFrom(Class)>
	//    8   16:ifeq            21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	final Class dataClass;
	final ModelLoaderFactory factory;
	private final Class modelClass;

	public MultiModelLoaderFactory$Entry(Class class1, Class class2, ModelLoaderFactory modelloaderfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		modelClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Class modelClass>
		dataClass = class2;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field Class dataClass>
		factory = modelloaderfactory;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field ModelLoaderFactory factory>
	//   11   19:return          
	}
}
