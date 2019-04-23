// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileNotFoundException;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoader, ModelLoaderFactory, MultiModelLoaderFactory

public final class MediaStoreFileLoader
	implements ModelLoader
{
	public static final class Factory
		implements ModelLoaderFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new MediaStoreFileLoader(context)));
		//    0    0:new             #9   <Class MediaStoreFileLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field Context context>
		//    4    8:invokespecial   #25  <Method void MediaStoreFileLoader(Context)>
		//    5   11:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		private final Context context;

		public Factory(Context context1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			context = context1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Context context>
		//    5    9:return          
		}
	}

	private static class FilePathFetcher
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
			return java/io/File;
		//    0    0:ldc1            #40  <Class File>
		//    1    2:areturn         
		}

		public DataSource getDataSource()
		{
			return DataSource.LOCAL;
		//    0    0:getstatic       #51  <Field DataSource DataSource.LOCAL>
		//    1    3:areturn         
		}

		public void loadData(Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback datacallback)
		{
			Cursor cursor;
			cursor = context.getContentResolver().query(uri, PROJECTION, ((String) (null)), ((String []) (null)), ((String) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Context context>
		//    2    4:invokevirtual   #59  <Method ContentResolver Context.getContentResolver()>
		//    3    7:aload_0         
		//    4    8:getfield        #33  <Field Uri uri>
		//    5   11:getstatic       #24  <Field String[] PROJECTION>
		//    6   14:aconst_null     
		//    7   15:aconst_null     
		//    8   16:aconst_null     
		//    9   17:invokevirtual   #65  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
		//   10   20:astore          4
			priority = null;
		//   11   22:aconst_null     
		//   12   23:astore_1        
			Object obj = null;
		//   13   24:aconst_null     
		//   14   25:astore_3        
			if(cursor == null)
				break MISSING_BLOCK_LABEL_80;
		//   15   26:aload           4
		//   16   28:ifnull          80
			priority = ((Priority) (obj));
		//   17   31:aload_3         
		//   18   32:astore_1        
			if(cursor.moveToFirst())
		//*  19   33:aload           4
		//*  20   35:invokeinterface #71  <Method boolean Cursor.moveToFirst()>
		//*  21   40:ifeq            60
				priority = ((Priority) (cursor.getString(cursor.getColumnIndexOrThrow("_data"))));
		//   22   43:aload           4
		//   23   45:aload           4
		//   24   47:ldc1            #22  <String "_data">
		//   25   49:invokeinterface #75  <Method int Cursor.getColumnIndexOrThrow(String)>
		//   26   54:invokeinterface #79  <Method String Cursor.getString(int)>
		//   27   59:astore_1        
			cursor.close();
		//   28   60:aload           4
		//   29   62:invokeinterface #82  <Method void Cursor.close()>
			break MISSING_BLOCK_LABEL_80;
		//   30   67:goto            80
			priority;
		//   31   70:astore_1        
			cursor.close();
		//   32   71:aload           4
		//   33   73:invokeinterface #82  <Method void Cursor.close()>
			throw priority;
		//   34   78:aload_1         
		//   35   79:athrow          
			if(TextUtils.isEmpty(((CharSequence) (priority))))
		//*  36   80:aload_1         
		//*  37   81:invokestatic    #88  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  38   84:ifeq            129
			{
				priority = ((Priority) (new StringBuilder()));
		//   39   87:new             #90  <Class StringBuilder>
		//   40   90:dup             
		//   41   91:invokespecial   #91  <Method void StringBuilder()>
		//   42   94:astore_1        
				((StringBuilder) (priority)).append("Failed to find file path for: ");
		//   43   95:aload_1         
		//   44   96:ldc1            #93  <String "Failed to find file path for: ">
		//   45   98:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
		//   46  101:pop             
				((StringBuilder) (priority)).append(((Object) (uri)));
		//   47  102:aload_1         
		//   48  103:aload_0         
		//   49  104:getfield        #33  <Field Uri uri>
		//   50  107:invokevirtual   #100 <Method StringBuilder StringBuilder.append(Object)>
		//   51  110:pop             
				datacallback.onLoadFailed(((Exception) (new FileNotFoundException(((StringBuilder) (priority)).toString()))));
		//   52  111:aload_2         
		//   53  112:new             #102 <Class FileNotFoundException>
		//   54  115:dup             
		//   55  116:aload_1         
		//   56  117:invokevirtual   #106 <Method String StringBuilder.toString()>
		//   57  120:invokespecial   #109 <Method void FileNotFoundException(String)>
		//   58  123:invokeinterface #115 <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onLoadFailed(Exception)>
				return;
		//   59  128:return          
			} else
			{
				datacallback.onDataReady(((Object) (new File(((String) (priority))))));
		//   60  129:aload_2         
		//   61  130:new             #40  <Class File>
		//   62  133:dup             
		//   63  134:aload_1         
		//   64  135:invokespecial   #116 <Method void File(String)>
		//   65  138:invokeinterface #120 <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
				return;
		//   66  143:return          
			}
		}

		private static final String PROJECTION[] = {
			"_data"
		};
		private final Context context;
		private final Uri uri;

		static 
		{
		//    0    0:iconst_1        
		//    1    1:anewarray       String[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:ldc1            #22  <String "_data">
		//    5    8:aastore         
		//    6    9:putstatic       #24  <Field String[] PROJECTION>
		//*   7   12:return          
		}

		FilePathFetcher(Context context1, Uri uri1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void Object()>
			context = context1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #31  <Field Context context>
			uri = uri1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #33  <Field Uri uri>
		//    8   14:return          
		}
	}


	public MediaStoreFileLoader(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Context context>
	//    5    9:return          
	}

	public ModelLoader.LoadData buildLoadData(Uri uri, int i, int j, Options options)
	{
		return new ModelLoader.LoadData(((com.bumptech.glide.load.Key) (new ObjectKey(((Object) (uri))))), ((DataFetcher) (new FilePathFetcher(context, uri))));
	//    0    0:new             #28  <Class ModelLoader$LoadData>
	//    1    3:dup             
	//    2    4:new             #30  <Class ObjectKey>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #33  <Method void ObjectKey(Object)>
	//    6   12:new             #12  <Class MediaStoreFileLoader$FilePathFetcher>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #22  <Field Context context>
	//   10   20:aload_1         
	//   11   21:invokespecial   #36  <Method void MediaStoreFileLoader$FilePathFetcher(Context, Uri)>
	//   12   24:invokespecial   #39  <Method void ModelLoader$LoadData(com.bumptech.glide.load.Key, DataFetcher)>
	//   13   27:areturn         
	}

	public volatile ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((Uri)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #45  <Class Uri>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #47  <Method ModelLoader$LoadData buildLoadData(Uri, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(Uri uri)
	{
		return MediaStoreUtil.isMediaStoreUri(uri);
	//    0    0:aload_1         
	//    1    1:invokestatic    #54  <Method boolean MediaStoreUtil.isMediaStoreUri(Uri)>
	//    2    4:ireturn         
	}

	public volatile boolean handles(Object obj)
	{
		return handles((Uri)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #45  <Class Uri>
	//    3    5:invokevirtual   #57  <Method boolean handles(Uri)>
	//    4    8:ireturn         
	}

	private final Context context;
}
