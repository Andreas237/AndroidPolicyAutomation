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

	static final class DataUriFetcher
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

		public DataUriFetcher(String s, DataDecoder datadecoder)
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

		public final ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new DataUrlLoader(opener)));
		//    0    0:new             #9   <Class DataUrlLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field DataUrlLoader$DataDecoder opener>
		//    4    8:invokespecial   #30  <Method void DataUrlLoader(DataUrlLoader$DataDecoder)>
		//    5   11:areturn         
		}

		public final void teardown()
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
	//    1    1:invokespecial   #33  <Method void Object()>
		dataDecoder = datadecoder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field DataUrlLoader$DataDecoder dataDecoder>
	//    5    9:return          
	}

	public volatile ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((String)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #42  <Class String>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #45  <Method ModelLoader$LoadData buildLoadData(String, int, int, Options)>
	//    7   12:areturn         
	}

	public ModelLoader.LoadData buildLoadData(String s, int i, int j, Options options)
	{
		return new ModelLoader.LoadData(((com.bumptech.glide.load.Key) (new ObjectKey(((Object) (s))))), ((DataFetcher) (new DataUriFetcher(s, dataDecoder))));
	//    0    0:new             #47  <Class ModelLoader$LoadData>
	//    1    3:dup             
	//    2    4:new             #49  <Class ObjectKey>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #52  <Method void ObjectKey(Object)>
	//    6   12:new             #12  <Class DataUrlLoader$DataUriFetcher>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #35  <Field DataUrlLoader$DataDecoder dataDecoder>
	//   11   21:invokespecial   #55  <Method void DataUrlLoader$DataUriFetcher(String, DataUrlLoader$DataDecoder)>
	//   12   24:invokespecial   #58  <Method void ModelLoader$LoadData(com.bumptech.glide.load.Key, DataFetcher)>
	//   13   27:areturn         
	}

	public volatile boolean handles(Object obj)
	{
		return handles((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #42  <Class String>
	//    3    5:invokevirtual   #64  <Method boolean handles(String)>
	//    4    8:ireturn         
	}

	public boolean handles(String s)
	{
		return s.startsWith("data:image");
	//    0    0:aload_1         
	//    1    1:ldc1            #25  <String "data:image">
	//    2    3:invokevirtual   #67  <Method boolean String.startsWith(String)>
	//    3    6:ireturn         
	}

	private static final String BASE64_TAG = ";base64";
	private static final String DATA_SCHEME_IMAGE = "data:image";
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
			if(!s.startsWith("data:image"))
		//*   0    0:aload_1         
		//*   1    1:ldc1            #38  <String "data:image">
		//*   2    3:invokevirtual   #44  <Method boolean String.startsWith(String)>
		//*   3    6:ifne            19
				throw new IllegalArgumentException("Not a valid image data URL.");
		//    4    9:new             #46  <Class IllegalArgumentException>
		//    5   12:dup             
		//    6   13:ldc1            #48  <String "Not a valid image data URL.">
		//    7   15:invokespecial   #51  <Method void IllegalArgumentException(String)>
		//    8   18:athrow          
			int i = s.indexOf(',');
		//    9   19:aload_1         
		//   10   20:bipush          44
		//   11   22:invokevirtual   #55  <Method int String.indexOf(int)>
		//   12   25:istore_2        
			if(i == -1)
		//*  13   26:iload_2         
		//*  14   27:iconst_m1       
		//*  15   28:icmpne          41
				throw new IllegalArgumentException("Missing comma in data URL.");
		//   16   31:new             #46  <Class IllegalArgumentException>
		//   17   34:dup             
		//   18   35:ldc1            #57  <String "Missing comma in data URL.">
		//   19   37:invokespecial   #51  <Method void IllegalArgumentException(String)>
		//   20   40:athrow          
			if(!s.substring(0, i).endsWith(";base64"))
		//*  21   41:aload_1         
		//*  22   42:iconst_0        
		//*  23   43:iload_2         
		//*  24   44:invokevirtual   #61  <Method String String.substring(int, int)>
		//*  25   47:ldc1            #63  <String ";base64">
		//*  26   49:invokevirtual   #66  <Method boolean String.endsWith(String)>
		//*  27   52:ifne            65
				throw new IllegalArgumentException("Not a base64 image data URL.");
		//   28   55:new             #46  <Class IllegalArgumentException>
		//   29   58:dup             
		//   30   59:ldc1            #68  <String "Not a base64 image data URL.">
		//   31   61:invokespecial   #51  <Method void IllegalArgumentException(String)>
		//   32   64:athrow          
			else
				return ((InputStream) (new ByteArrayInputStream(Base64.decode(s.substring(i + 1), 0))));
		//   33   65:new             #70  <Class ByteArrayInputStream>
		//   34   68:dup             
		//   35   69:aload_1         
		//   36   70:iload_2         
		//   37   71:iconst_1        
		//   38   72:iadd            
		//   39   73:invokevirtual   #73  <Method String String.substring(int)>
		//   40   76:iconst_0        
		//   41   77:invokestatic    #78  <Method byte[] Base64.decode(String, int)>
		//   42   80:invokespecial   #81  <Method void ByteArrayInputStream(byte[])>
		//   43   83:areturn         
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
