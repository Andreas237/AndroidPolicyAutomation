// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.provider;

import com.bumptech.glide.load.Encoder;

// Referenced classes of package com.bumptech.glide.provider:
//			EncoderRegistry

private static final class EncoderRegistry$Entry
{

	boolean handles(Class class1)
	{
		return dataClass.isAssignableFrom(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Class dataClass>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method boolean Class.isAssignableFrom(Class)>
	//    4    8:ireturn         
	}

	private final Class dataClass;
	final Encoder encoder;

	EncoderRegistry$Entry(Class class1, Encoder encoder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		dataClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Class dataClass>
		encoder = encoder1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Encoder encoder>
	//    8   14:return          
	}
}
