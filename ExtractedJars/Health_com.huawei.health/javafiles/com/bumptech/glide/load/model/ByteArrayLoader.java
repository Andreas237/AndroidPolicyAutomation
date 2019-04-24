// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.signature.EmptySignature;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoader, ModelLoaderFactory, MultiModelLoaderFactory

public class ByteArrayLoader
	implements ModelLoader
{
	public static class ByteBufferFactory
		implements ModelLoaderFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new ByteArrayLoader(new Converter() {

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

				final ByteBufferFactory this$0;

			
			{
				this$0 = ByteBufferFactory.this;
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
		//    5    9:invokespecial   #22  <Method void ByteArrayLoader$ByteBufferFactory$1(ByteArrayLoader$ByteBufferFactory)>
		//    6   12:invokespecial   #25  <Method void ByteArrayLoader(ByteArrayLoader$Converter)>
		//    7   15:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		public ByteBufferFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface Converter
	{

		public abstract Object convert(byte abyte0[]);

		public abstract Class getDataClass();
	}

	static class Fetcher
		implements DataFetcher
	{

		public void cancel()
		{
		//    0    0:return          
		}

		public void cleanup()
		{
		//    0    0:return          
		}

		public Class getDataClass()
		{
			return converter.getDataClass();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field ByteArrayLoader$Converter converter>
		//    2    4:invokeinterface #36  <Method Class ByteArrayLoader$Converter.getDataClass()>
		//    3    9:areturn         
		}

		public DataSource getDataSource()
		{
			return DataSource.LOCAL;
		//    0    0:getstatic       #46  <Field DataSource DataSource.LOCAL>
		//    1    3:areturn         
		}

		public void loadData(Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback datacallback)
		{
			datacallback.onDataReady(converter.convert(model));
		//    0    0:aload_2         
		//    1    1:aload_0         
		//    2    2:getfield        #24  <Field ByteArrayLoader$Converter converter>
		//    3    5:aload_0         
		//    4    6:getfield        #22  <Field byte[] model>
		//    5    9:invokeinterface #52  <Method Object ByteArrayLoader$Converter.convert(byte[])>
		//    6   14:invokeinterface #58  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
		//    7   19:return          
		}

		private final Converter converter;
		private final byte model[];

		public Fetcher(byte abyte0[], Converter converter1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			model = abyte0;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field byte[] model>
			converter = converter1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field ByteArrayLoader$Converter converter>
		//    8   14:return          
		}
	}

	public static class StreamFactory
		implements ModelLoaderFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new ByteArrayLoader(new Converter() {

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

				final StreamFactory this$0;

			
			{
				this$0 = StreamFactory.this;
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
		//    5    9:invokespecial   #22  <Method void ByteArrayLoader$StreamFactory$1(ByteArrayLoader$StreamFactory)>
		//    6   12:invokespecial   #25  <Method void ByteArrayLoader(ByteArrayLoader$Converter)>
		//    7   15:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		public StreamFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}


	public ByteArrayLoader(Converter converter1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		converter = converter1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field ByteArrayLoader$Converter converter>
	//    5    9:return          
	}

	public volatile ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((byte[])obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #40  <Class byte[]>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #43  <Method ModelLoader$LoadData buildLoadData(byte[], int, int, Options)>
	//    7   12:areturn         
	}

	public ModelLoader.LoadData buildLoadData(byte abyte0[], int i, int j, Options options)
	{
		return new ModelLoader.LoadData(((com.bumptech.glide.load.Key) (EmptySignature.obtain())), ((DataFetcher) (new Fetcher(abyte0, converter))));
	//    0    0:new             #45  <Class ModelLoader$LoadData>
	//    1    3:dup             
	//    2    4:invokestatic    #51  <Method EmptySignature EmptySignature.obtain()>
	//    3    7:new             #17  <Class ByteArrayLoader$Fetcher>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field ByteArrayLoader$Converter converter>
	//    8   16:invokespecial   #54  <Method void ByteArrayLoader$Fetcher(byte[], ByteArrayLoader$Converter)>
	//    9   19:invokespecial   #57  <Method void ModelLoader$LoadData(com.bumptech.glide.load.Key, DataFetcher)>
	//   10   22:areturn         
	}

	public volatile boolean handles(Object obj)
	{
		return handles((byte[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #40  <Class byte[]>
	//    3    5:invokevirtual   #63  <Method boolean handles(byte[])>
	//    4    8:ireturn         
	}

	public boolean handles(byte abyte0[])
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private final Converter converter;
}
