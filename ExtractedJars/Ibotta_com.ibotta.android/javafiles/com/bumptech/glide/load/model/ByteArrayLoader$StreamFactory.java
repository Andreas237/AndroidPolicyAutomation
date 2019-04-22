// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoaderFactory, ByteArrayLoader, MultiModelLoaderFactory, ModelLoader

public static class ByteArrayLoader$StreamFactory
	implements ModelLoaderFactory
{

	public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
	{
		return ((ModelLoader) (new ByteArrayLoader(new ByteArrayLoader.Converter() {

			public InputStream convert(byte abyte0[])
			{
				return ((InputStream) (new ByteArrayInputStream(abyte0)));
			//    0    0:new             #29  <Class ByteArrayInputStream>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #32  <Method void ByteArrayInputStream(byte[])>
			//    4    8:areturn         
			}

			public volatile Object convert(byte abyte0[])
			{
				return ((Object) (convert(abyte0)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #35  <Method InputStream convert(byte[])>
			//    3    5:areturn         
			}

			public Class getDataClass()
			{
				return java/io/InputStream;
			//    0    0:ldc1            #39  <Class InputStream>
			//    1    2:areturn         
			}

			final ByteArrayLoader.StreamFactory this$0;

			
			{
				this$0 = ByteArrayLoader.StreamFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ByteArrayLoader$StreamFactory this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #24  <Method void Object()>
			//    5    9:return          
			}
		}
)));
	//    0    0:new             #9   <Class ByteArrayLoader>
	//    1    3:dup             
	//    2    4:new             #12  <Class ByteArrayLoader$StreamFactory$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #23  <Method void ByteArrayLoader$StreamFactory$1(ByteArrayLoader$StreamFactory)>
	//    6   12:invokespecial   #26  <Method void ByteArrayLoader(ByteArrayLoader$Converter)>
	//    7   15:areturn         
	}

	public void teardown()
	{
	//    0    0:return          
	}

	public ByteArrayLoader$StreamFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
