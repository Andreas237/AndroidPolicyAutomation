// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.signature.ObjectKey;
import java.io.*;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoader, ModelLoaderFactory, MultiModelLoaderFactory

public class FileLoader
	implements ModelLoader
{
	public static class Factory
		implements ModelLoaderFactory
	{

		public final ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new FileLoader(opener)));
		//    0    0:new             #9   <Class FileLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #20  <Field FileLoader$FileOpener opener>
		//    4    8:invokespecial   #28  <Method void FileLoader(FileLoader$FileOpener)>
		//    5   11:areturn         
		}

		public final void teardown()
		{
		//    0    0:return          
		}

		private final FileOpener opener;

		public Factory(FileOpener fileopener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			opener = fileopener;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field FileLoader$FileOpener opener>
		//    5    9:return          
		}
	}

	public static class FileDescriptorFactory extends Factory
	{

		public FileDescriptorFactory()
		{
			super(new _cls1());
		//    0    0:aload_0         
		//    1    1:new             #10  <Class FileLoader$FileDescriptorFactory$1>
		//    2    4:dup             
		//    3    5:invokespecial   #14  <Method void FileLoader$FileDescriptorFactory$1()>
		//    4    8:invokespecial   #17  <Method void FileLoader$Factory(FileLoader$FileOpener)>
		//    5   11:return          
		}
	}

	private static final class FileFetcher
		implements DataFetcher
	{

		public void cancel()
		{
		//    0    0:return          
		}

		public void cleanup()
		{
			Object obj;
			obj = data;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field Object data>
		//    2    4:astore_1        
			if(obj == null)
				break MISSING_BLOCK_LABEL_19;
		//    3    5:aload_1         
		//    4    6:ifnull          19
			opener.close(obj);
		//    5    9:aload_0         
		//    6   10:getfield        #27  <Field FileLoader$FileOpener opener>
		//    7   13:aload_1         
		//    8   14:invokeinterface #42  <Method void FileLoader$FileOpener.close(Object)>
			return;
		//    9   19:return          
			IOException ioexception;
			ioexception;
		//   10   20:astore_1        
		//   11   21:return          
		}

		public Class getDataClass()
		{
			return opener.getDataClass();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field FileLoader$FileOpener opener>
		//    2    4:invokeinterface #47  <Method Class FileLoader$FileOpener.getDataClass()>
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
				data = opener.open(file);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #27  <Field FileLoader$FileOpener opener>
		//    3    5:aload_0         
		//    4    6:getfield        #25  <Field File file>
		//    5    9:invokeinterface #65  <Method Object FileLoader$FileOpener.open(File)>
		//    6   14:putfield        #36  <Field Object data>
			}
		//*   7   17:aload_2         
		//*   8   18:aload_0         
		//*   9   19:getfield        #36  <Field Object data>
		//*  10   22:invokeinterface #70  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
		//*  11   27:return          
			// Misplaced declaration of an exception variable
			catch(Priority priority)
		//*  12   28:astore_1        
			{
				if(Log.isLoggable("FileLoader", 3))
		//*  13   29:ldc1            #72  <String "FileLoader">
		//*  14   31:iconst_3        
		//*  15   32:invokestatic    #78  <Method boolean Log.isLoggable(String, int)>
		//*  16   35:ifeq            47
					Log.d("FileLoader", "Failed to open file", ((Throwable) (priority)));
		//   17   38:ldc1            #72  <String "FileLoader">
		//   18   40:ldc1            #80  <String "Failed to open file">
		//   19   42:aload_1         
		//   20   43:invokestatic    #84  <Method int Log.d(String, String, Throwable)>
		//   21   46:pop             
				datacallback.onLoadFailed(((Exception) (priority)));
		//   22   47:aload_2         
		//   23   48:aload_1         
		//   24   49:invokeinterface #88  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onLoadFailed(Exception)>
				return;
		//   25   54:return          
			}
			datacallback.onDataReady(data);
		}

		private Object data;
		private final File file;
		private final FileOpener opener;

		FileFetcher(File file1, FileOpener fileopener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			file = file1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #25  <Field File file>
			opener = fileopener;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #27  <Field FileLoader$FileOpener opener>
		//    8   14:return          
		}
	}

	public static interface FileOpener
	{

		public abstract void close(Object obj)
			throws IOException;

		public abstract Class getDataClass();

		public abstract Object open(File file)
			throws FileNotFoundException;
	}

	public static class StreamFactory extends Factory
	{

		public StreamFactory()
		{
			super(new _cls1());
		//    0    0:aload_0         
		//    1    1:new             #10  <Class FileLoader$StreamFactory$1>
		//    2    4:dup             
		//    3    5:invokespecial   #14  <Method void FileLoader$StreamFactory$1()>
		//    4    8:invokespecial   #17  <Method void FileLoader$Factory(FileLoader$FileOpener)>
		//    5   11:return          
		}
	}


	public FileLoader(FileOpener fileopener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		fileOpener = fileopener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field FileLoader$FileOpener fileOpener>
	//    5    9:return          
	}

	public ModelLoader.LoadData buildLoadData(File file, int i, int j, Options options)
	{
		return new ModelLoader.LoadData(((com.bumptech.glide.load.Key) (new ObjectKey(((Object) (file))))), ((DataFetcher) (new FileFetcher(file, fileOpener))));
	//    0    0:new             #44  <Class ModelLoader$LoadData>
	//    1    3:dup             
	//    2    4:new             #46  <Class ObjectKey>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #49  <Method void ObjectKey(Object)>
	//    6   12:new             #17  <Class FileLoader$FileFetcher>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #36  <Field FileLoader$FileOpener fileOpener>
	//   11   21:invokespecial   #52  <Method void FileLoader$FileFetcher(File, FileLoader$FileOpener)>
	//   12   24:invokespecial   #55  <Method void ModelLoader$LoadData(com.bumptech.glide.load.Key, DataFetcher)>
	//   13   27:areturn         
	}

	public volatile ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((File)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #60  <Class File>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #62  <Method ModelLoader$LoadData buildLoadData(File, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(File file)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile boolean handles(Object obj)
	{
		return handles((File)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #60  <Class File>
	//    3    5:invokevirtual   #67  <Method boolean handles(File)>
	//    4    8:ireturn         
	}

	private final FileOpener fileOpener;

	// Unreferenced inner class com/bumptech/glide/load/model/FileLoader$FileDescriptorFactory$1

/* anonymous class */
	class FileDescriptorFactory._cls1
		implements FileOpener
	{

		public void close(ParcelFileDescriptor parcelfiledescriptor)
			throws IOException
		{
			parcelfiledescriptor.close();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #25  <Method void ParcelFileDescriptor.close()>
		//    2    4:return          
		}

		public volatile void close(Object obj)
			throws IOException
		{
			close((ParcelFileDescriptor)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #23  <Class ParcelFileDescriptor>
		//    3    5:invokevirtual   #29  <Method void close(ParcelFileDescriptor)>
		//    4    8:return          
		}

		public Class getDataClass()
		{
			return android/os/ParcelFileDescriptor;
		//    0    0:ldc1            #23  <Class ParcelFileDescriptor>
		//    1    2:areturn         
		}

		public ParcelFileDescriptor open(File file)
			throws FileNotFoundException
		{
			return ParcelFileDescriptor.open(file, 0x10000000);
		//    0    0:aload_1         
		//    1    1:ldc1            #38  <Int 0x10000000>
		//    2    3:invokestatic    #41  <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
		//    3    6:areturn         
		}

		public volatile Object open(File file)
			throws FileNotFoundException
		{
			return ((Object) (open(file)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #44  <Method ParcelFileDescriptor open(File)>
		//    3    5:areturn         
		}

	}


	// Unreferenced inner class com/bumptech/glide/load/model/FileLoader$StreamFactory$1

/* anonymous class */
	class StreamFactory._cls1
		implements FileOpener
	{

		public void close(InputStream inputstream)
			throws IOException
		{
			inputstream.close();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #25  <Method void InputStream.close()>
		//    2    4:return          
		}

		public volatile void close(Object obj)
			throws IOException
		{
			close((InputStream)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #23  <Class InputStream>
		//    3    5:invokevirtual   #29  <Method void close(InputStream)>
		//    4    8:return          
		}

		public Class getDataClass()
		{
			return java/io/InputStream;
		//    0    0:ldc1            #23  <Class InputStream>
		//    1    2:areturn         
		}

		public InputStream open(File file)
			throws FileNotFoundException
		{
			return ((InputStream) (new FileInputStream(file)));
		//    0    0:new             #39  <Class FileInputStream>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #42  <Method void FileInputStream(File)>
		//    4    8:areturn         
		}

		public volatile Object open(File file)
			throws FileNotFoundException
		{
			return ((Object) (open(file)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #45  <Method InputStream open(File)>
		//    3    5:areturn         
		}

	}

}
