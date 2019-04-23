// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import java.nio.ByteBuffer;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoaderFactory, ByteArrayLoader, MultiModelLoaderFactory, ModelLoader

public static class ByteArrayLoader$ByteBufferFactory
	implements ModelLoaderFactory
{

	public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
	{
		return ((ModelLoader) (new ByteArrayLoader(new ByteArrayLoader.Converter() {

			public volatile Object convert(byte abyte0[])
			{
				return ((Object) (convert(abyte0)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #30  <Method ByteBuffer convert(byte[])>
			//    3    5:areturn         
			}

			public ByteBuffer convert(byte abyte0[])
			{
				return ByteBuffer.wrap(abyte0);
			//    0    0:aload_1         
			//    1    1:invokestatic    #35  <Method ByteBuffer ByteBuffer.wrap(byte[])>
			//    2    4:areturn         
			}

			public Class getDataClass()
			{
				return java/nio/ByteBuffer;
			//    0    0:ldc1            #32  <Class ByteBuffer>
			//    1    2:areturn         
			}

			final ByteArrayLoader.ByteBufferFactory this$0;

			
			{
				this$0 = ByteArrayLoader.ByteBufferFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ByteArrayLoader$ByteBufferFactory this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #24  <Method void Object()>
			//    5    9:return          
			}
		}
)));
	//    0    0:new             #9   <Class ByteArrayLoader>
	//    1    3:dup             
	//    2    4:new             #12  <Class ByteArrayLoader$ByteBufferFactory$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #23  <Method void ByteArrayLoader$ByteBufferFactory$1(ByteArrayLoader$ByteBufferFactory)>
	//    6   12:invokespecial   #26  <Method void ByteArrayLoader(ByteArrayLoader$Converter)>
	//    7   15:areturn         
	}

	public void teardown()
	{
	//    0    0:return          
	}

	public ByteArrayLoader$ByteBufferFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
