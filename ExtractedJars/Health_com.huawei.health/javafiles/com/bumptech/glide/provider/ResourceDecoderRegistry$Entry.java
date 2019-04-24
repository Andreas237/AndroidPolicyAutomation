// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.provider;

import com.bumptech.glide.load.ResourceDecoder;

// Referenced classes of package com.bumptech.glide.provider:
//			ResourceDecoderRegistry

static class ResourceDecoderRegistry$Entry
{

	public boolean handles(Class class1, Class class2)
	{
		return dataClass.isAssignableFrom(class1) && class2.isAssignableFrom(resourceClass);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Class dataClass>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #38  <Method boolean Class.isAssignableFrom(Class)>
	//    4    8:ifeq            24
	//    5   11:aload_2         
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field Class resourceClass>
	//    8   16:invokevirtual   #38  <Method boolean Class.isAssignableFrom(Class)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	private final Class dataClass;
	final ResourceDecoder decoder;
	final Class resourceClass;

	public ResourceDecoderRegistry$Entry(Class class1, Class class2, ResourceDecoder resourcedecoder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		dataClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Class dataClass>
		resourceClass = class2;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Class resourceClass>
		decoder = resourcedecoder;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field ResourceDecoder decoder>
	//   11   19:return          
	}
}
