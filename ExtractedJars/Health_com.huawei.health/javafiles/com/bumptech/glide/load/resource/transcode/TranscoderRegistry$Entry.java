// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.transcode;


// Referenced classes of package com.bumptech.glide.load.resource.transcode:
//			TranscoderRegistry, ResourceTranscoder

static final class TranscoderRegistry$Entry
{

	public boolean handles(Class class1, Class class2)
	{
		return fromClass.isAssignableFrom(class1) && class2.isAssignableFrom(toClass);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Class fromClass>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #38  <Method boolean Class.isAssignableFrom(Class)>
	//    4    8:ifeq            24
	//    5   11:aload_2         
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field Class toClass>
	//    8   16:invokevirtual   #38  <Method boolean Class.isAssignableFrom(Class)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	private final Class fromClass;
	private final Class toClass;
	final ResourceTranscoder transcoder;

	TranscoderRegistry$Entry(Class class1, Class class2, ResourceTranscoder resourcetranscoder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		fromClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Class fromClass>
		toClass = class2;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Class toClass>
		transcoder = resourcetranscoder;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field ResourceTranscoder transcoder>
	//   11   19:return          
	}
}
