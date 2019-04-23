// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.lrucache;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.LruCache;
import android.widget.ImageView;
import bo.app.au;
import com.appboy.IAppboyImageLoader;
import com.appboy.enums.AppboyViewBounds;
import com.appboy.support.*;
import java.io.File;

public class AppboyLruImageLoader
	implements IAppboyImageLoader
{
	class a extends AsyncTask
	{

		protected transient Void a(File afile[])
		{
			Object obj = AppboyLruImageLoader.a(a);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field AppboyLruImageLoader a>
		//    2    4:invokestatic    #26  <Method Object AppboyLruImageLoader.a(AppboyLruImageLoader)>
		//    3    7:astore_2        
			obj;
		//    4    8:aload_2         
			JVM INSTR monitorenter ;
		//    5    9:monitorenter    
			afile = ((File []) (afile[0]));
		//    6   10:aload_1         
		//    7   11:iconst_0        
		//    8   12:aaload          
		//    9   13:astore_1        
			try
			{
				AppboyLogger.d(AppboyLruImageLoader.a(), "Initializing disk cache");
		//   10   14:invokestatic    #29  <Method String AppboyLruImageLoader.a()>
		//   11   17:ldc1            #31  <String "Initializing disk cache">
		//   12   19:invokestatic    #37  <Method int AppboyLogger.d(String, String)>
		//   13   22:pop             
				AppboyLruImageLoader.a(a, new au(((File) (afile)), 1, 1, 0x3200000L));
		//   14   23:aload_0         
		//   15   24:getfield        #13  <Field AppboyLruImageLoader a>
		//   16   27:new             #39  <Class au>
		//   17   30:dup             
		//   18   31:aload_1         
		//   19   32:iconst_1        
		//   20   33:iconst_1        
		//   21   34:ldc2w           #40  <Long 0x3200000L>
		//   22   37:invokespecial   #44  <Method void au(File, int, int, long)>
		//   23   40:invokestatic    #47  <Method au AppboyLruImageLoader.a(AppboyLruImageLoader, au)>
		//   24   43:pop             
				break MISSING_BLOCK_LABEL_58;
		//   25   44:goto            58
			}
			// Misplaced declaration of an exception variable
			catch(File afile[]) { }
		//   26   47:astore_1        
			AppboyLogger.e(AppboyLruImageLoader.a(), "Caught exception creating new disk cache. Unable to create new disk cache", ((Throwable) (afile)));
		//   27   48:invokestatic    #29  <Method String AppboyLruImageLoader.a()>
		//   28   51:ldc1            #49  <String "Caught exception creating new disk cache. Unable to create new disk cache">
		//   29   53:aload_1         
		//   30   54:invokestatic    #53  <Method int AppboyLogger.e(String, String, Throwable)>
		//   31   57:pop             
			AppboyLruImageLoader.a(a, false);
		//   32   58:aload_0         
		//   33   59:getfield        #13  <Field AppboyLruImageLoader a>
		//   34   62:iconst_0        
		//   35   63:invokestatic    #56  <Method boolean AppboyLruImageLoader.a(AppboyLruImageLoader, boolean)>
		//   36   66:pop             
			AppboyLruImageLoader.a(a).notifyAll();
		//   37   67:aload_0         
		//   38   68:getfield        #13  <Field AppboyLruImageLoader a>
		//   39   71:invokestatic    #26  <Method Object AppboyLruImageLoader.a(AppboyLruImageLoader)>
		//   40   74:invokevirtual   #61  <Method void Object.notifyAll()>
			obj;
		//   41   77:aload_2         
			JVM INSTR monitorexit ;
		//   42   78:monitorexit     
			return null;
		//   43   79:aconst_null     
		//   44   80:areturn         
			afile;
		//   45   81:astore_1        
			obj;
		//   46   82:aload_2         
			JVM INSTR monitorexit ;
		//   47   83:monitorexit     
			throw afile;
		//   48   84:aload_1         
		//   49   85:athrow          
		}

		protected Object doInBackground(Object aobj[])
		{
			return ((Object) (a((File[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #65  <Class File[]>
		//    3    5:invokevirtual   #67  <Method Void a(File[])>
		//    4    8:areturn         
		}

		final AppboyLruImageLoader a;

		private a()
		{
			a = AppboyLruImageLoader.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field AppboyLruImageLoader a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void AsyncTask()>
		//    5    9:return          
		}

	}

	class b extends AsyncTask
	{

		protected transient Bitmap a(Void avoid[])
		{
			return a.getBitmapFromUrl(c, e, d);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field AppboyLruImageLoader a>
		//    2    4:aload_0         
		//    3    5:getfield        #28  <Field Context c>
		//    4    8:aload_0         
		//    5    9:getfield        #32  <Field String e>
		//    6   12:aload_0         
		//    7   13:getfield        #30  <Field AppboyViewBounds d>
		//    8   16:invokevirtual   #47  <Method Bitmap AppboyLruImageLoader.getBitmapFromUrl(Context, String, AppboyViewBounds)>
		//    9   19:areturn         
		}

		protected void a(Bitmap bitmap)
		{
			ImageView imageview = b;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field ImageView b>
		//    2    4:astore_2        
			if(imageview != null && ((String)imageview.getTag()).equals(((Object) (e))))
		//*   3    5:aload_2         
		//*   4    6:ifnull          34
		//*   5    9:aload_2         
		//*   6   10:invokevirtual   #52  <Method Object ImageView.getTag()>
		//*   7   13:checkcast       #54  <Class String>
		//*   8   16:aload_0         
		//*   9   17:getfield        #32  <Field String e>
		//*  10   20:invokevirtual   #58  <Method boolean String.equals(Object)>
		//*  11   23:ifeq            34
				b.setImageBitmap(bitmap);
		//   12   26:aload_0         
		//   13   27:getfield        #26  <Field ImageView b>
		//   14   30:aload_1         
		//   15   31:invokevirtual   #61  <Method void ImageView.setImageBitmap(Bitmap)>
		//   16   34:return          
		}

		protected Object doInBackground(Object aobj[])
		{
			return ((Object) (a((Void[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #65  <Class Void[]>
		//    3    5:invokevirtual   #67  <Method Bitmap a(Void[])>
		//    4    8:areturn         
		}

		protected void onPostExecute(Object obj)
		{
			a((Bitmap)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #70  <Class Bitmap>
		//    3    5:invokevirtual   #72  <Method void a(Bitmap)>
		//    4    8:return          
		}

		final AppboyLruImageLoader a;
		private final ImageView b;
		private final Context c;
		private final AppboyViewBounds d;
		private final String e;

		private b(Context context, ImageView imageview, AppboyViewBounds appboyviewbounds, String s)
		{
			a = AppboyLruImageLoader.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field AppboyLruImageLoader a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void AsyncTask()>
			b = imageview;
		//    5    9:aload_0         
		//    6   10:aload_3         
		//    7   11:putfield        #26  <Field ImageView b>
			c = context;
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:putfield        #28  <Field Context c>
			d = appboyviewbounds;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #30  <Field AppboyViewBounds d>
			e = s;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #32  <Field String e>
			imageview.setTag(((Object) (s)));
		//   17   31:aload_3         
		//   18   32:aload           5
		//   19   34:invokevirtual   #38  <Method void ImageView.setTag(Object)>
		//   20   37:return          
		}

	}


	public AppboyLruImageLoader(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void Object()>
	//    6   12:putfield        #41  <Field Object d>
		e = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #43  <Field boolean e>
		f = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #45  <Field boolean f>
		b = ((LruCache) (new LruCache(AppboyImageUtils.getImageLoaderCacheSize()) {

			protected int a(String s, Bitmap bitmap)
			{
				return bitmap.getByteCount();
			//    0    0:aload_2         
			//    1    1:invokevirtual   #26  <Method int Bitmap.getByteCount()>
			//    2    4:ireturn         
			}

			protected int sizeOf(Object obj, Object obj1)
			{
				return a((String)obj, (Bitmap)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #30  <Class String>
			//    3    5:aload_2         
			//    4    6:checkcast       #22  <Class Bitmap>
			//    5    9:invokevirtual   #32  <Method int a(String, Bitmap)>
			//    6   12:ireturn         
			}

			final AppboyLruImageLoader a;

			
			{
				a = AppboyLruImageLoader.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AppboyLruImageLoader a>
				super(i);
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:invokespecial   #18  <Method void LruCache(int)>
			//    6   10:return          
			}
		}
));
	//   13   25:aload_0         
	//   14   26:new             #8   <Class AppboyLruImageLoader$1>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:invokestatic    #51  <Method int AppboyImageUtils.getImageLoaderCacheSize()>
	//   18   34:invokespecial   #54  <Method void AppboyLruImageLoader$1(AppboyLruImageLoader, int)>
	//   19   37:putfield        #56  <Field LruCache b>
		context = ((Context) (a(context, "appboy.imageloader.lru.cache")));
	//   20   40:aload_1         
	//   21   41:ldc1            #58  <String "appboy.imageloader.lru.cache">
	//   22   43:invokestatic    #61  <Method File a(Context, String)>
	//   23   46:astore_1        
		(new a()).execute(((Object []) (new File[] {
			context
		})));
	//   24   47:new             #10  <Class AppboyLruImageLoader$a>
	//   25   50:dup             
	//   26   51:aload_0         
	//   27   52:aconst_null     
	//   28   53:invokespecial   #64  <Method void AppboyLruImageLoader$a(AppboyLruImageLoader, AppboyLruImageLoader$1)>
	//   29   56:iconst_1        
	//   30   57:anewarray       File[]
	//   31   60:dup             
	//   32   61:iconst_0        
	//   33   62:aload_1         
	//   34   63:aastore         
	//   35   64:invokevirtual   #70  <Method AsyncTask AppboyLruImageLoader$a.execute(Object[])>
	//   36   67:pop             
	//   37   68:return          
	}

	static au a(AppboyLruImageLoader appboylruimageloader, au au1)
	{
		appboylruimageloader.c = au1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field au c>
		return au1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static File a(Context context, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #76  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(context.getCacheDir().getPath());
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #83  <Method File Context.getCacheDir()>
	//    7   13:invokevirtual   #87  <Method String File.getPath()>
	//    8   16:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(File.separator);
	//   10   20:aload_2         
	//   11   21:getstatic       #94  <Field String File.separator>
	//   12   24:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(s);
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		return new File(stringbuilder.toString());
	//   18   34:new             #66  <Class File>
	//   19   37:dup             
	//   20   38:aload_2         
	//   21   39:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   22   42:invokespecial   #100 <Method void File(String)>
	//   23   45:areturn         
	}

	static Object a(AppboyLruImageLoader appboylruimageloader)
	{
		return appboylruimageloader.d;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Object d>
	//    2    4:areturn         
	}

	static String a()
	{
		return a;
	//    0    0:getstatic       #34  <Field String a>
	//    1    3:areturn         
	}

	static boolean a(AppboyLruImageLoader appboylruimageloader, boolean flag)
	{
		appboylruimageloader.e = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field boolean e>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void b(String s, Bitmap bitmap)
	{
		b.put(((Object) (s)), ((Object) (bitmap)));
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field LruCache b>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #110 <Method Object LruCache.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public static void deleteStoredData(Context context)
	{
		context = ((Context) (new File(context.getCacheDir(), "appboy.imageloader.lru.cache")));
	//    0    0:new             #66  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #83  <Method File Context.getCacheDir()>
	//    4    8:ldc1            #58  <String "appboy.imageloader.lru.cache">
	//    5   10:invokespecial   #114 <Method void File(File, String)>
	//    6   13:astore_0        
		String s = a;
	//    7   14:getstatic       #34  <Field String a>
	//    8   17:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    9   18:new             #76  <Class StringBuilder>
	//   10   21:dup             
	//   11   22:invokespecial   #77  <Method void StringBuilder()>
	//   12   25:astore_2        
		stringbuilder.append("Deleting lru image cache directory at: ");
	//   13   26:aload_2         
	//   14   27:ldc1            #116 <String "Deleting lru image cache directory at: ">
	//   15   29:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(((File) (context)).getAbsolutePath());
	//   17   33:aload_2         
	//   18   34:aload_0         
	//   19   35:invokevirtual   #119 <Method String File.getAbsolutePath()>
	//   20   38:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		AppboyLogger.v(s, stringbuilder.toString());
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   25   47:invokestatic    #123 <Method int AppboyLogger.v(String, String)>
	//   26   50:pop             
		AppboyFileUtils.deleteFileOrDirectory(((File) (context)));
	//   27   51:aload_0         
	//   28   52:invokestatic    #129 <Method void AppboyFileUtils.deleteFileOrDirectory(File)>
	//   29   55:return          
	}

	Bitmap a(Context context, Uri uri, AppboyViewBounds appboyviewbounds)
	{
		return AppboyImageUtils.getBitmap(context, uri, appboyviewbounds);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #133 <Method Bitmap AppboyImageUtils.getBitmap(Context, Uri, AppboyViewBounds)>
	//    4    6:areturn         
	}

	Bitmap a(String s)
	{
		Bitmap bitmap = (Bitmap)b.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field LruCache b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #138 <Method Object LruCache.get(Object)>
	//    4    8:checkcast       #140 <Class Bitmap>
	//    5   11:astore_2        
		if(bitmap != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          56
		{
			String s2 = a;
	//    8   16:getstatic       #34  <Field String a>
	//    9   19:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   10   20:new             #76  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #77  <Method void StringBuilder()>
	//   13   27:astore          4
			stringbuilder1.append("Got bitmap from mem cache for key ");
	//   14   29:aload           4
	//   15   31:ldc1            #142 <String "Got bitmap from mem cache for key ">
	//   16   33:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
			stringbuilder1.append(s);
	//   18   37:aload           4
	//   19   39:aload_1         
	//   20   40:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
			AppboyLogger.v(s2, stringbuilder1.toString());
	//   22   44:aload_3         
	//   23   45:aload           4
	//   24   47:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   25   50:invokestatic    #123 <Method int AppboyLogger.v(String, String)>
	//   26   53:pop             
			return bitmap;
	//   27   54:aload_2         
	//   28   55:areturn         
		}
		bitmap = c(s);
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:invokevirtual   #144 <Method Bitmap c(String)>
	//   32   61:astore_2        
		if(bitmap != null)
	//*  33   62:aload_2         
	//*  34   63:ifnull          112
		{
			String s3 = a;
	//   35   66:getstatic       #34  <Field String a>
	//   36   69:astore_3        
			StringBuilder stringbuilder2 = new StringBuilder();
	//   37   70:new             #76  <Class StringBuilder>
	//   38   73:dup             
	//   39   74:invokespecial   #77  <Method void StringBuilder()>
	//   40   77:astore          4
			stringbuilder2.append("Got bitmap from disk cache for key ");
	//   41   79:aload           4
	//   42   81:ldc1            #146 <String "Got bitmap from disk cache for key ">
	//   43   83:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   44   86:pop             
			stringbuilder2.append(s);
	//   45   87:aload           4
	//   46   89:aload_1         
	//   47   90:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   48   93:pop             
			AppboyLogger.v(s3, stringbuilder2.toString());
	//   49   94:aload_3         
	//   50   95:aload           4
	//   51   97:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   52  100:invokestatic    #123 <Method int AppboyLogger.v(String, String)>
	//   53  103:pop             
			b(s, bitmap);
	//   54  104:aload_0         
	//   55  105:aload_1         
	//   56  106:aload_2         
	//   57  107:invokespecial   #148 <Method void b(String, Bitmap)>
			return bitmap;
	//   58  110:aload_2         
	//   59  111:areturn         
		} else
		{
			String s1 = a;
	//   60  112:getstatic       #34  <Field String a>
	//   61  115:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   62  116:new             #76  <Class StringBuilder>
	//   63  119:dup             
	//   64  120:invokespecial   #77  <Method void StringBuilder()>
	//   65  123:astore_3        
			stringbuilder.append("No cache hit for bitmap: ");
	//   66  124:aload_3         
	//   67  125:ldc1            #150 <String "No cache hit for bitmap: ">
	//   68  127:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   69  130:pop             
			stringbuilder.append(s);
	//   70  131:aload_3         
	//   71  132:aload_1         
	//   72  133:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   73  136:pop             
			AppboyLogger.d(s1, stringbuilder.toString());
	//   74  137:aload_2         
	//   75  138:aload_3         
	//   76  139:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   77  142:invokestatic    #152 <Method int AppboyLogger.d(String, String)>
	//   78  145:pop             
			return null;
	//   79  146:aconst_null     
	//   80  147:areturn         
		}
	}

	void a(String s, Bitmap bitmap)
	{
		if(b(s) == null)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #154 <Method Bitmap b(String)>
	//*   3    5:ifnonnull       56
		{
			String s1 = a;
	//    4    8:getstatic       #34  <Field String a>
	//    5   11:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #76  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #77  <Method void StringBuilder()>
	//    9   19:astore          4
			stringbuilder.append("Adding bitmap to mem cache for key ");
	//   10   21:aload           4
	//   11   23:ldc1            #156 <String "Adding bitmap to mem cache for key ">
	//   12   25:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
			stringbuilder.append(s);
	//   14   29:aload           4
	//   15   31:aload_1         
	//   16   32:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			AppboyLogger.d(s1, stringbuilder.toString());
	//   18   36:aload_3         
	//   19   37:aload           4
	//   20   39:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   21   42:invokestatic    #152 <Method int AppboyLogger.d(String, String)>
	//   22   45:pop             
			b.put(((Object) (s)), ((Object) (bitmap)));
	//   23   46:aload_0         
	//   24   47:getfield        #56  <Field LruCache b>
	//   25   50:aload_1         
	//   26   51:aload_2         
	//   27   52:invokevirtual   #110 <Method Object LruCache.put(Object, Object)>
	//   28   55:pop             
		}
		synchronized(d)
	//*  29   56:aload_0         
	//*  30   57:getfield        #41  <Field Object d>
	//*  31   60:astore_3        
	//*  32   61:aload_3         
	//*  33   62:monitorenter    
		{
			if(c != null && !c.b(s))
	//*  34   63:aload_0         
	//*  35   64:getfield        #73  <Field au c>
	//*  36   67:ifnull          130
	//*  37   70:aload_0         
	//*  38   71:getfield        #73  <Field au c>
	//*  39   74:aload_1         
	//*  40   75:invokevirtual   #161 <Method boolean au.b(String)>
	//*  41   78:ifne            130
			{
				String s2 = a;
	//   42   81:getstatic       #34  <Field String a>
	//   43   84:astore          4
				StringBuilder stringbuilder1 = new StringBuilder();
	//   44   86:new             #76  <Class StringBuilder>
	//   45   89:dup             
	//   46   90:invokespecial   #77  <Method void StringBuilder()>
	//   47   93:astore          5
				stringbuilder1.append("Adding bitmap to disk cache for key ");
	//   48   95:aload           5
	//   49   97:ldc1            #163 <String "Adding bitmap to disk cache for key ">
	//   50   99:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   51  102:pop             
				stringbuilder1.append(s);
	//   52  103:aload           5
	//   53  105:aload_1         
	//   54  106:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   55  109:pop             
				AppboyLogger.d(s2, stringbuilder1.toString());
	//   56  110:aload           4
	//   57  112:aload           5
	//   58  114:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   59  117:invokestatic    #152 <Method int AppboyLogger.d(String, String)>
	//   60  120:pop             
				c.a(s, bitmap);
	//   61  121:aload_0         
	//   62  122:getfield        #73  <Field au c>
	//   63  125:aload_1         
	//   64  126:aload_2         
	//   65  127:invokevirtual   #165 <Method void au.a(String, Bitmap)>
			}
		}
	//   66  130:aload_3         
	//   67  131:monitorexit     
		return;
	//   68  132:return          
		s;
	//   69  133:astore_1        
		obj;
	//   70  134:aload_3         
		JVM INSTR monitorexit ;
	//   71  135:monitorexit     
		throw s;
	//   72  136:aload_1         
	//   73  137:athrow          
	}

	Bitmap b(String s)
	{
		return (Bitmap)b.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field LruCache b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #138 <Method Object LruCache.get(Object)>
	//    4    8:checkcast       #140 <Class Bitmap>
	//    5   11:areturn         
	}

	Bitmap c(String s)
	{
label0:
		{
			synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Object d>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(!e)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #43  <Field boolean e>
	//    7   11:ifeq            18
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return null;
	//   10   16:aconst_null     
	//   11   17:areturn         
		}
		if(c == null || !c.b(s))
			break MISSING_BLOCK_LABEL_49;
	//   12   18:aload_0         
	//   13   19:getfield        #73  <Field au c>
	//   14   22:ifnull          49
	//   15   25:aload_0         
	//   16   26:getfield        #73  <Field au c>
	//   17   29:aload_1         
	//   18   30:invokevirtual   #161 <Method boolean au.b(String)>
	//   19   33:ifeq            49
		s = ((String) (c.a(s)));
	//   20   36:aload_0         
	//   21   37:getfield        #73  <Field au c>
	//   22   40:aload_1         
	//   23   41:invokevirtual   #167 <Method Bitmap au.a(String)>
	//   24   44:astore_1        
	//*  25   45:aload_2         
	//*  26   46:monitorexit     
		return ((Bitmap) (s));
	//   27   47:aload_1         
	//   28   48:areturn         
		obj;
	//   29   49:aload_2         
		JVM INSTR monitorexit ;
	//   30   50:monitorexit     
		return null;
	//   31   51:aconst_null     
	//   32   52:areturn         
		s;
	//   33   53:astore_1        
		obj;
	//   34   54:aload_2         
		JVM INSTR monitorexit ;
	//   35   55:monitorexit     
		throw s;
	//   36   56:aload_1         
	//   37   57:athrow          
	}

	public Bitmap getBitmapFromUrl(Context context, String s, AppboyViewBounds appboyviewbounds)
	{
		Bitmap bitmap = a(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #170 <Method Bitmap a(String)>
	//    3    5:astore          4
		if(bitmap != null)
	//*   4    7:aload           4
	//*   5    9:ifnull          15
			return bitmap;
	//    6   12:aload           4
	//    7   14:areturn         
		if(f)
	//*   8   15:aload_0         
	//*   9   16:getfield        #45  <Field boolean f>
	//*  10   19:ifeq            33
		{
			AppboyLogger.d(a, "Cache is currently in offline mode. Not downloading bitmap.");
	//   11   22:getstatic       #34  <Field String a>
	//   12   25:ldc1            #172 <String "Cache is currently in offline mode. Not downloading bitmap.">
	//   13   27:invokestatic    #152 <Method int AppboyLogger.d(String, String)>
	//   14   30:pop             
			return null;
	//   15   31:aconst_null     
	//   16   32:areturn         
		}
		context = ((Context) (a(context, Uri.parse(s), appboyviewbounds)));
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokestatic    #178 <Method Uri Uri.parse(String)>
	//   21   39:aload_3         
	//   22   40:invokevirtual   #180 <Method Bitmap a(Context, Uri, AppboyViewBounds)>
	//   23   43:astore_1        
		if(context != null)
	//*  24   44:aload_1         
	//*  25   45:ifnull          54
			a(s, ((Bitmap) (context)));
	//   26   48:aload_0         
	//   27   49:aload_2         
	//   28   50:aload_1         
	//   29   51:invokevirtual   #181 <Method void a(String, Bitmap)>
		return ((Bitmap) (context));
	//   30   54:aload_1         
	//   31   55:areturn         
	}

	public void renderUrlIntoView(Context context, String s, ImageView imageview, AppboyViewBounds appboyviewbounds)
	{
		(new b(context, imageview, appboyviewbounds, s)).execute(((Object []) (new Void[0])));
	//    0    0:new             #13  <Class AppboyLruImageLoader$b>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload_2         
	//    7   10:aconst_null     
	//    8   11:invokespecial   #186 <Method void AppboyLruImageLoader$b(AppboyLruImageLoader, Context, ImageView, AppboyViewBounds, String, AppboyLruImageLoader$1)>
	//    9   14:iconst_0        
	//   10   15:anewarray       Void[]
	//   11   18:invokevirtual   #189 <Method AsyncTask AppboyLruImageLoader$b.execute(Object[])>
	//   12   21:pop             
	//   13   22:return          
	}

	public void setOffline(boolean flag)
	{
		String s1 = a;
	//    0    0:getstatic       #34  <Field String a>
	//    1    3:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #76  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #77  <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("Appboy image loader outbound network requests are now ");
	//    6   13:aload           4
	//    7   15:ldc1            #193 <String "Appboy image loader outbound network requests are now ">
	//    8   17:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		String s;
		if(flag)
	//*  10   21:iload_1         
	//*  11   22:ifeq            31
			s = "disabled";
	//   12   25:ldc1            #195 <String "disabled">
	//   13   27:astore_2        
		else
	//*  14   28:goto            34
			s = "enabled";
	//   15   31:ldc1            #197 <String "enabled">
	//   16   33:astore_2        
		stringbuilder.append(s);
	//   17   34:aload           4
	//   18   36:aload_2         
	//   19   37:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
		AppboyLogger.i(s1, stringbuilder.toString());
	//   21   41:aload_3         
	//   22   42:aload           4
	//   23   44:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   24   47:invokestatic    #200 <Method int AppboyLogger.i(String, String)>
	//   25   50:pop             
		f = flag;
	//   26   51:aload_0         
	//   27   52:iload_1         
	//   28   53:putfield        #45  <Field boolean f>
	//   29   56:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/lrucache/AppboyLruImageLoader);
	private LruCache b;
	private au c;
	private final Object d = new Object();
	private boolean e;
	private boolean f;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyLruImageLoader>
	//    1    2:invokestatic    #32  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #34  <Field String a>
	//*   3    8:return          
	}
}
