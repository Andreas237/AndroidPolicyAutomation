// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.signature.ObjectKey;
import java.io.*;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoader, ModelLoaderFactory, MultiModelLoaderFactory

public final class DataUrlLoader
	implements ModelLoader
{
	public static interface DataDecoder
	{

		public abstract void close(Object obj)
			throws IOException;

		public abstract Object decode(String s)
			throws IllegalArgumentException;

		public abstract Class getDataClass();
	}

	private static final class DataUriFetcher
		implements DataFetcher
	{

		public void cancel()
		{
		//    0    0:return          
		}

		public void cleanup()
		{
			try
			{
				reader.close(data);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field DataUrlLoader$DataDecoder reader>
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field Object data>
		//    4    8:invokeinterface #42  <Method void DataUrlLoader$DataDecoder.close(Object)>
				return;
		//    5   13:return          
			}
			catch(IOException ioexception)
		//*   6   14:astore_1        
			{
				return;
		//    7   15:return          
			}
		}

		public Class getDataClass()
		{
			return reader.getDataClass();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field DataUrlLoader$DataDecoder reader>
		//    2    4:invokeinterface #47  <Method Class DataUrlLoader$DataDecoder.getDataClass()>
		//    3    9:areturn         
		}

		public DataSource getDataSource()
		{
			return DataSource.LOCAL;
		//    0    0:getstatic       #57  <Field DataSource DataSource.LOCAL>
		//    1    3:areturn         
		}

		public void loadData(Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback datacallback)
		{
			try
			{
				data = reader.decode(dataUri);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #27  <Field DataUrlLoader$DataDecoder reader>
		//    3    5:aload_0         
		//    4    6:getfield        #25  <Field String dataUri>
		//    5    9:invokeinterface #65  <Method Object DataUrlLoader$DataDecoder.decode(String)>
		//    6   14:putfield        #36  <Field Object data>
				datacallback.onDataReady(data);
		//    7   17:aload_2         
		//    8   18:aload_0         
		//    9   19:getfield        #36  <Field Object data>
		//   10   22:invokeinterface #70  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
				return;
		//   11   27:return          
			}
			// Misplaced declaration of an exception variable
			catch(Priority priority)
		//*  12   28:astore_1        
			{
				datacallback.onLoadFailed(((Exception) (priority)));
		//   13   29:aload_2         
		//   14   30:aload_1         
		//   15   31:invokeinterface #74  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onLoadFailed(Exception)>
			}
		//   16   36:return          
		}

		private Object data;
		private final String dataUri;
		private final DataDecoder reader;

		DataUriFetcher(String s, DataDecoder datadecoder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			dataUri = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #25  <Field String dataUri>
			reader = datadecoder;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #27  <Field DataUrlLoader$DataDecoder reader>
		//    8   14:return          
		}
	}

	public static final class StreamFactory
		implements ModelLoaderFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new DataUrlLoader(opener)));
		//    0    0:new             #9   <Class DataUrlLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field DataUrlLoader$DataDecoder opener>
		//    4    8:invokespecial   #31  <Method void DataUrlLoader(DataUrlLoader$DataDecoder)>
		//    5   11:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		private final DataDecoder opener = new _cls1();

		public StreamFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #12  <Class DataUrlLoader$StreamFactory$1>
		//    4    8:dup             
		//    5    9:aload_0         
		//    6   10:invokespecial   #22  <Method void DataUrlLoader$StreamFactory$1(DataUrlLoader$StreamFactory)>
		//    7   13:putfield        #24  <Field DataUrlLoader$DataDecoder opener>
		//    8   16:return          
		}
	}


	public DataUrlLoader(DataDecoder datadecoder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		dataDecoder = datadecoder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field DataUrlLoader$DataDecoder dataDecoder>
	//    5    9:return          
	}

	public ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return new ModelLoader.LoadData(((com.bumptech.glide.load.Key) (new ObjectKey(obj))), ((DataFetcher) (new DataUriFetcher(obj.toString(), dataDecoder))));
	//    0    0:new             #36  <Class ModelLoader$LoadData>
	//    1    3:dup             
	//    2    4:new             #38  <Class ObjectKey>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #41  <Method void ObjectKey(Object)>
	//    6   12:new             #12  <Class DataUrlLoader$DataUriFetcher>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokevirtual   #45  <Method String Object.toString()>
	//   10   20:aload_0         
	//   11   21:getfield        #28  <Field DataUrlLoader$DataDecoder dataDecoder>
	//   12   24:invokespecial   #48  <Method void DataUrlLoader$DataUriFetcher(String, DataUrlLoader$DataDecoder)>
	//   13   27:invokespecial   #51  <Method void ModelLoader$LoadData(com.bumptech.glide.load.Key, DataFetcher)>
	//   14   30:areturn         
	}

	public boolean handles(Object obj)
	{
		return obj.toString().startsWith("data:image");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #45  <Method String Object.toString()>
	//    2    4:ldc1            #57  <String "data:image">
	//    3    6:invokevirtual   #63  <Method boolean String.startsWith(String)>
	//    4    9:ireturn         
	}

	private final DataDecoder dataDecoder;

	// Unreferenced inner class com/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1

/* anonymous class */
	class StreamFactory._cls1
		implements DataDecoder
	{

		public void close(InputStream inputstream)
			throws IOException
		{
			inputstream.close();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #30  <Method void InputStream.close()>
		//    2    4:return          
		}

		public volatile void close(Object obj)
			throws IOException
		{
			close((InputStream)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #28  <Class InputStream>
		//    3    5:invokevirtual   #34  <Method void close(InputStream)>
		//    4    8:return          
		}

		public InputStream decode(String s)
		{
			if(s.startsWith("data:image"))
		//*   0    0:aload_1         
		//*   1    1:ldc1            #38  <String "data:image">
		//*   2    3:invokevirtual   #44  <Method boolean String.startsWith(String)>
		//*   3    6:ifeq            74
			{
				int i = s.indexOf(',');
		//    4    9:aload_1         
		//    5   10:bipush          44
		//    6   12:invokevirtual   #48  <Method int String.indexOf(int)>
		//    7   15:istore_2        
				if(i != -1)
		//*   8   16:iload_2         
		//*   9   17:iconst_m1       
		//*  10   18:icmpeq          64
				{
					if(s.substring(0, i).endsWith(";base64"))
		//*  11   21:aload_1         
		//*  12   22:iconst_0        
		//*  13   23:iload_2         
		//*  14   24:invokevirtual   #52  <Method String String.substring(int, int)>
		//*  15   27:ldc1            #54  <String ";base64">
		//*  16   29:invokevirtual   #57  <Method boolean String.endsWith(String)>
		//*  17   32:ifeq            54
						return ((InputStream) (new ByteArrayInputStream(Base64.decode(s.substring(i + 1), 0))));
		//   18   35:new             #59  <Class ByteArrayInputStream>
		//   19   38:dup             
		//   20   39:aload_1         
		//   21   40:iload_2         
		//   22   41:iconst_1        
		//   23   42:iadd            
		//   24   43:invokevirtual   #62  <Method String String.substring(int)>
		//   25   46:iconst_0        
		//   26   47:invokestatic    #67  <Method byte[] Base64.decode(String, int)>
		//   27   50:invokespecial   #70  <Method void ByteArrayInputStream(byte[])>
		//   28   53:areturn         
					else
						throw new IllegalArgumentException("Not a base64 image data URL.");
		//   29   54:new             #72  <Class IllegalArgumentException>
		//   30   57:dup             
		//   31   58:ldc1            #74  <String "Not a base64 image data URL.">
		//   32   60:invokespecial   #77  <Method void IllegalArgumentException(String)>
		//   33   63:athrow          
				} else
				{
					throw new IllegalArgumentException("Missing comma in data URL.");
		//   34   64:new             #72  <Class IllegalArgumentException>
		//   35   67:dup             
		//   36   68:ldc1            #79  <String "Missing comma in data URL.">
		//   37   70:invokespecial   #77  <Method void IllegalArgumentException(String)>
		//   38   73:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("Not a valid image data URL.");
		//   39   74:new             #72  <Class IllegalArgumentException>
		//   40   77:dup             
		//   41   78:ldc1            #81  <String "Not a valid image data URL.">
		//   42   80:invokespecial   #77  <Method void IllegalArgumentException(String)>
		//   43   83:athrow          
			}
		}

		public volatile Object decode(String s)
			throws IllegalArgumentException
		{
			return ((Object) (decode(s)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #84  <Method InputStream decode(String)>
		//    3    5:areturn         
		}

		public Class getDataClass()
		{
			return java/io/InputStream;
		//    0    0:ldc1            #28  <Class InputStream>
		//    1    2:areturn         
		}

		final StreamFactory this$0;

			
			{
				this$0 = StreamFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field DataUrlLoader$StreamFactory this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
	}

}
