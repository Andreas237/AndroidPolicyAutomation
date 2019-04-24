// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.nostra13.universalimageloader.core;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.nostra13.universalimageloader.cache.disc.DiskCache;
import com.nostra13.universalimageloader.cache.memory.MemoryCache;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.assist.LoadedFrom;
import com.nostra13.universalimageloader.core.assist.ViewScaleType;
import com.nostra13.universalimageloader.core.display.BitmapDisplayer;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;
import com.nostra13.universalimageloader.core.imageaware.ImageViewAware;
import com.nostra13.universalimageloader.core.imageaware.NonViewAware;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;
import com.nostra13.universalimageloader.core.listener.ImageLoadingProgressListener;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;
import com.nostra13.universalimageloader.utils.*;

// Referenced classes of package com.nostra13.universalimageloader.core:
//			DisplayImageOptions, ImageLoaderEngine, ImageLoaderConfiguration, ImageLoadingInfo, 
//			ProcessAndDisplayImageTask, LoadAndDisplayImageTask

public class ImageLoader
{

	protected ImageLoader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		defaultListener = ((ImageLoadingListener) (new SimpleImageLoadingListener()));
	//    2    4:aload_0         
	//    3    5:new             #47  <Class SimpleImageLoadingListener>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void SimpleImageLoadingListener()>
	//    6   12:putfield        #50  <Field ImageLoadingListener defaultListener>
	//    7   15:return          
	}

	private void checkConfiguration()
	{
		if(configuration == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//*   2    4:ifnonnull       17
			throw new IllegalStateException("ImageLoader must be init with configuration before using");
	//    3    7:new             #55  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #13  <String "ImageLoader must be init with configuration before using">
	//    6   13:invokespecial   #58  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return;
	//    8   17:return          
	}

	private static Handler defineHandler(DisplayImageOptions displayimageoptions)
	{
		Handler handler = displayimageoptions.getHandler();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method Handler DisplayImageOptions.getHandler()>
	//    2    4:astore_1        
		if(displayimageoptions.isSyncLoading())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #70  <Method boolean DisplayImageOptions.isSyncLoading()>
	//*   5    9:ifeq            14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		displayimageoptions = ((DisplayImageOptions) (handler));
	//    8   14:aload_1         
	//    9   15:astore_0        
		if(handler == null)
	//*  10   16:aload_1         
	//*  11   17:ifnonnull       39
		{
			displayimageoptions = ((DisplayImageOptions) (handler));
	//   12   20:aload_1         
	//   13   21:astore_0        
			if(Looper.myLooper() == Looper.getMainLooper())
	//*  14   22:invokestatic    #76  <Method Looper Looper.myLooper()>
	//*  15   25:invokestatic    #79  <Method Looper Looper.getMainLooper()>
	//*  16   28:if_acmpne       39
				displayimageoptions = ((DisplayImageOptions) (new Handler()));
	//   17   31:new             #81  <Class Handler>
	//   18   34:dup             
	//   19   35:invokespecial   #82  <Method void Handler()>
	//   20   38:astore_0        
		}
		return ((Handler) (displayimageoptions));
	//   21   39:aload_0         
	//   22   40:areturn         
	}

	public static ImageLoader getInstance()
	{
		if(instance != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:getstatic       #86  <Field ImageLoader instance>
	//    1    3:ifnonnull       37
		com/nostra13/universalimageloader/core/ImageLoader;
	//    2    6:ldc1            #2   <Class ImageLoader>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(instance == null)
	//*   4    9:getstatic       #86  <Field ImageLoader instance>
	//*   5   12:ifnonnull       25
			instance = new ImageLoader();
	//    6   15:new             #2   <Class ImageLoader>
	//    7   18:dup             
	//    8   19:invokespecial   #87  <Method void ImageLoader()>
	//    9   22:putstatic       #86  <Field ImageLoader instance>
		com/nostra13/universalimageloader/core/ImageLoader;
	//   10   25:ldc1            #2   <Class ImageLoader>
		JVM INSTR monitorexit ;
	//   11   27:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   12   28:goto            37
		Exception exception;
		exception;
	//   13   31:astore_0        
		com/nostra13/universalimageloader/core/ImageLoader;
	//   14   32:ldc1            #2   <Class ImageLoader>
		JVM INSTR monitorexit ;
	//   15   34:monitorexit     
		throw exception;
	//   16   35:aload_0         
	//   17   36:athrow          
		return instance;
	//   18   37:getstatic       #86  <Field ImageLoader instance>
	//   19   40:areturn         
	}

	public void cancelDisplayTask(ImageView imageview)
	{
		engine.cancelDisplayTaskFor(((ImageAware) (new ImageViewAware(imageview))));
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ImageLoaderEngine engine>
	//    2    4:new             #93  <Class ImageViewAware>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #95  <Method void ImageViewAware(ImageView)>
	//    6   12:invokevirtual   #101 <Method void ImageLoaderEngine.cancelDisplayTaskFor(ImageAware)>
	//    7   15:return          
	}

	public void cancelDisplayTask(ImageAware imageaware)
	{
		engine.cancelDisplayTaskFor(imageaware);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ImageLoaderEngine engine>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #101 <Method void ImageLoaderEngine.cancelDisplayTaskFor(ImageAware)>
	//    4    8:return          
	}

	public void clearDiscCache()
	{
		clearDiskCache();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #106 <Method void clearDiskCache()>
	//    2    4:return          
	}

	public void clearDiskCache()
	{
		checkConfiguration();
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method void checkConfiguration()>
		configuration.diskCache.clear();
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//    4    8:getfield        #115 <Field DiskCache ImageLoaderConfiguration.diskCache>
	//    5   11:invokeinterface #120 <Method void DiskCache.clear()>
	//    6   16:return          
	}

	public void clearMemoryCache()
	{
		checkConfiguration();
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method void checkConfiguration()>
		configuration.memoryCache.clear();
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//    4    8:getfield        #125 <Field MemoryCache ImageLoaderConfiguration.memoryCache>
	//    5   11:invokeinterface #128 <Method void MemoryCache.clear()>
	//    6   16:return          
	}

	public void denyNetworkDownloads(boolean flag)
	{
		engine.denyNetworkDownloads(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ImageLoaderEngine engine>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #132 <Method void ImageLoaderEngine.denyNetworkDownloads(boolean)>
	//    4    8:return          
	}

	public void destroy()
	{
		if(configuration != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//*   2    4:ifnull          16
			L.d("Destroy ImageLoader", new Object[0]);
	//    3    7:ldc1            #19  <String "Destroy ImageLoader">
	//    4    9:iconst_0        
	//    5   10:anewarray       Object[]
	//    6   13:invokestatic    #139 <Method void L.d(String, Object[])>
		stop();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #142 <Method void stop()>
		configuration.diskCache.close();
	//    9   20:aload_0         
	//   10   21:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//   11   24:getfield        #115 <Field DiskCache ImageLoaderConfiguration.diskCache>
	//   12   27:invokeinterface #145 <Method void DiskCache.close()>
		engine = null;
	//   13   32:aload_0         
	//   14   33:aconst_null     
	//   15   34:putfield        #91  <Field ImageLoaderEngine engine>
		configuration = null;
	//   16   37:aload_0         
	//   17   38:aconst_null     
	//   18   39:putfield        #53  <Field ImageLoaderConfiguration configuration>
	//   19   42:return          
	}

	public void displayImage(String s, ImageView imageview)
	{
		displayImage(s, ((ImageAware) (new ImageViewAware(imageview))), ((DisplayImageOptions) (null)), ((ImageLoadingListener) (null)), ((ImageLoadingProgressListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #93  <Class ImageViewAware>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #95  <Method void ImageViewAware(ImageView)>
	//    6   10:aconst_null     
	//    7   11:aconst_null     
	//    8   12:aconst_null     
	//    9   13:invokevirtual   #150 <Method void displayImage(String, ImageAware, DisplayImageOptions, ImageLoadingListener, ImageLoadingProgressListener)>
	//   10   16:return          
	}

	public void displayImage(String s, ImageView imageview, DisplayImageOptions displayimageoptions)
	{
		displayImage(s, ((ImageAware) (new ImageViewAware(imageview))), displayimageoptions, ((ImageLoadingListener) (null)), ((ImageLoadingProgressListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #93  <Class ImageViewAware>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #95  <Method void ImageViewAware(ImageView)>
	//    6   10:aload_3         
	//    7   11:aconst_null     
	//    8   12:aconst_null     
	//    9   13:invokevirtual   #150 <Method void displayImage(String, ImageAware, DisplayImageOptions, ImageLoadingListener, ImageLoadingProgressListener)>
	//   10   16:return          
	}

	public void displayImage(String s, ImageView imageview, DisplayImageOptions displayimageoptions, ImageLoadingListener imageloadinglistener)
	{
		displayImage(s, imageview, displayimageoptions, imageloadinglistener, ((ImageLoadingProgressListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:invokevirtual   #155 <Method void displayImage(String, ImageView, DisplayImageOptions, ImageLoadingListener, ImageLoadingProgressListener)>
	//    7   10:return          
	}

	public void displayImage(String s, ImageView imageview, DisplayImageOptions displayimageoptions, ImageLoadingListener imageloadinglistener, ImageLoadingProgressListener imageloadingprogresslistener)
	{
		displayImage(s, ((ImageAware) (new ImageViewAware(imageview))), displayimageoptions, imageloadinglistener, imageloadingprogresslistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #93  <Class ImageViewAware>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #95  <Method void ImageViewAware(ImageView)>
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:aload           5
	//    9   15:invokevirtual   #150 <Method void displayImage(String, ImageAware, DisplayImageOptions, ImageLoadingListener, ImageLoadingProgressListener)>
	//   10   18:return          
	}

	public void displayImage(String s, ImageView imageview, ImageLoadingListener imageloadinglistener)
	{
		displayImage(s, ((ImageAware) (new ImageViewAware(imageview))), ((DisplayImageOptions) (null)), imageloadinglistener, ((ImageLoadingProgressListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #93  <Class ImageViewAware>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #95  <Method void ImageViewAware(ImageView)>
	//    6   10:aconst_null     
	//    7   11:aload_3         
	//    8   12:aconst_null     
	//    9   13:invokevirtual   #150 <Method void displayImage(String, ImageAware, DisplayImageOptions, ImageLoadingListener, ImageLoadingProgressListener)>
	//   10   16:return          
	}

	public void displayImage(String s, ImageAware imageaware)
	{
		displayImage(s, imageaware, ((DisplayImageOptions) (null)), ((ImageLoadingListener) (null)), ((ImageLoadingProgressListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #150 <Method void displayImage(String, ImageAware, DisplayImageOptions, ImageLoadingListener, ImageLoadingProgressListener)>
	//    7    9:return          
	}

	public void displayImage(String s, ImageAware imageaware, DisplayImageOptions displayimageoptions)
	{
		displayImage(s, imageaware, displayimageoptions, ((ImageLoadingListener) (null)), ((ImageLoadingProgressListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #150 <Method void displayImage(String, ImageAware, DisplayImageOptions, ImageLoadingListener, ImageLoadingProgressListener)>
	//    7    9:return          
	}

	public void displayImage(String s, ImageAware imageaware, DisplayImageOptions displayimageoptions, ImageLoadingListener imageloadinglistener)
	{
		displayImage(s, imageaware, displayimageoptions, imageloadinglistener, ((ImageLoadingProgressListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:invokevirtual   #150 <Method void displayImage(String, ImageAware, DisplayImageOptions, ImageLoadingListener, ImageLoadingProgressListener)>
	//    7   10:return          
	}

	public void displayImage(String s, ImageAware imageaware, DisplayImageOptions displayimageoptions, ImageLoadingListener imageloadinglistener, ImageLoadingProgressListener imageloadingprogresslistener)
	{
		checkConfiguration();
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method void checkConfiguration()>
		if(imageaware == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("Wrong arguments were passed to displayImage() method (ImageView reference must not be null)");
	//    4    8:new             #161 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #16  <String "Wrong arguments were passed to displayImage() method (ImageView reference must not be null)">
	//    7   14:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		ImageLoadingListener imageloadinglistener1 = imageloadinglistener;
	//    9   18:aload           4
	//   10   20:astore          6
		if(imageloadinglistener == null)
	//*  11   22:aload           4
	//*  12   24:ifnonnull       33
			imageloadinglistener1 = defaultListener;
	//   13   27:aload_0         
	//   14   28:getfield        #50  <Field ImageLoadingListener defaultListener>
	//   15   31:astore          6
		imageloadinglistener = ((ImageLoadingListener) (displayimageoptions));
	//   16   33:aload_3         
	//   17   34:astore          4
		if(displayimageoptions == null)
	//*  18   36:aload_3         
	//*  19   37:ifnonnull       49
			imageloadinglistener = ((ImageLoadingListener) (configuration.defaultDisplayImageOptions));
	//   20   40:aload_0         
	//   21   41:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//   22   44:getfield        #166 <Field DisplayImageOptions ImageLoaderConfiguration.defaultDisplayImageOptions>
	//   23   47:astore          4
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  24   49:aload_1         
	//*  25   50:invokestatic    #172 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  26   53:ifeq            132
		{
			engine.cancelDisplayTaskFor(imageaware);
	//   27   56:aload_0         
	//   28   57:getfield        #91  <Field ImageLoaderEngine engine>
	//   29   60:aload_2         
	//   30   61:invokevirtual   #101 <Method void ImageLoaderEngine.cancelDisplayTaskFor(ImageAware)>
			imageloadinglistener1.onLoadingStarted(s, imageaware.getWrappedView());
	//   31   64:aload           6
	//   32   66:aload_1         
	//   33   67:aload_2         
	//   34   68:invokeinterface #178 <Method android.view.View ImageAware.getWrappedView()>
	//   35   73:invokeinterface #184 <Method void ImageLoadingListener.onLoadingStarted(String, android.view.View)>
			if(((DisplayImageOptions) (imageloadinglistener)).shouldShowImageForEmptyUri())
	//*  36   78:aload           4
	//*  37   80:invokevirtual   #187 <Method boolean DisplayImageOptions.shouldShowImageForEmptyUri()>
	//*  38   83:ifeq            108
				imageaware.setImageDrawable(((DisplayImageOptions) (imageloadinglistener)).getImageForEmptyUri(configuration.resources));
	//   39   86:aload_2         
	//   40   87:aload           4
	//   41   89:aload_0         
	//   42   90:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//   43   93:getfield        #191 <Field android.content.res.Resources ImageLoaderConfiguration.resources>
	//   44   96:invokevirtual   #195 <Method android.graphics.drawable.Drawable DisplayImageOptions.getImageForEmptyUri(android.content.res.Resources)>
	//   45   99:invokeinterface #199 <Method boolean ImageAware.setImageDrawable(android.graphics.drawable.Drawable)>
	//   46  104:pop             
			else
	//*  47  105:goto            116
				imageaware.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//   48  108:aload_2         
	//   49  109:aconst_null     
	//   50  110:invokeinterface #199 <Method boolean ImageAware.setImageDrawable(android.graphics.drawable.Drawable)>
	//   51  115:pop             
			imageloadinglistener1.onLoadingComplete(s, imageaware.getWrappedView(), ((Bitmap) (null)));
	//   52  116:aload           6
	//   53  118:aload_1         
	//   54  119:aload_2         
	//   55  120:invokeinterface #178 <Method android.view.View ImageAware.getWrappedView()>
	//   56  125:aconst_null     
	//   57  126:invokeinterface #203 <Method void ImageLoadingListener.onLoadingComplete(String, android.view.View, Bitmap)>
			return;
	//   58  131:return          
		}
		ImageSize imagesize = ImageSizeUtils.defineTargetSizeForView(imageaware, configuration.getMaxImageSize());
	//   59  132:aload_2         
	//   60  133:aload_0         
	//   61  134:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//   62  137:invokevirtual   #207 <Method ImageSize ImageLoaderConfiguration.getMaxImageSize()>
	//   63  140:invokestatic    #213 <Method ImageSize ImageSizeUtils.defineTargetSizeForView(ImageAware, ImageSize)>
	//   64  143:astore          7
		String s1 = MemoryCacheUtils.generateKey(s, imagesize);
	//   65  145:aload_1         
	//   66  146:aload           7
	//   67  148:invokestatic    #219 <Method String MemoryCacheUtils.generateKey(String, ImageSize)>
	//   68  151:astore          8
		engine.prepareDisplayTaskFor(imageaware, s1);
	//   69  153:aload_0         
	//   70  154:getfield        #91  <Field ImageLoaderEngine engine>
	//   71  157:aload_2         
	//   72  158:aload           8
	//   73  160:invokevirtual   #223 <Method void ImageLoaderEngine.prepareDisplayTaskFor(ImageAware, String)>
		imageloadinglistener1.onLoadingStarted(s, imageaware.getWrappedView());
	//   74  163:aload           6
	//   75  165:aload_1         
	//   76  166:aload_2         
	//   77  167:invokeinterface #178 <Method android.view.View ImageAware.getWrappedView()>
	//   78  172:invokeinterface #184 <Method void ImageLoadingListener.onLoadingStarted(String, android.view.View)>
		displayimageoptions = ((DisplayImageOptions) (configuration.memoryCache.get(s1)));
	//   79  177:aload_0         
	//   80  178:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//   81  181:getfield        #125 <Field MemoryCache ImageLoaderConfiguration.memoryCache>
	//   82  184:aload           8
	//   83  186:invokeinterface #227 <Method Bitmap MemoryCache.get(String)>
	//   84  191:astore_3        
		if(displayimageoptions != null && !((Bitmap) (displayimageoptions)).isRecycled())
	//*  85  192:aload_3         
	//*  86  193:ifnull          325
	//*  87  196:aload_3         
	//*  88  197:invokevirtual   #232 <Method boolean Bitmap.isRecycled()>
	//*  89  200:ifne            325
		{
			L.d("Load image from memory cache [%s]", new Object[] {
				s1
			});
	//   90  203:ldc1            #25  <String "Load image from memory cache [%s]">
	//   91  205:iconst_1        
	//   92  206:anewarray       Object[]
	//   93  209:dup             
	//   94  210:iconst_0        
	//   95  211:aload           8
	//   96  213:aastore         
	//   97  214:invokestatic    #139 <Method void L.d(String, Object[])>
			if(((DisplayImageOptions) (imageloadinglistener)).shouldPostProcess())
	//*  98  217:aload           4
	//*  99  219:invokevirtual   #235 <Method boolean DisplayImageOptions.shouldPostProcess()>
	//* 100  222:ifeq            294
			{
				s = ((String) (new ImageLoadingInfo(s, imageaware, imagesize, s1, ((DisplayImageOptions) (imageloadinglistener)), imageloadinglistener1, imageloadingprogresslistener, engine.getLockForUri(s))));
	//  101  225:new             #237 <Class ImageLoadingInfo>
	//  102  228:dup             
	//  103  229:aload_1         
	//  104  230:aload_2         
	//  105  231:aload           7
	//  106  233:aload           8
	//  107  235:aload           4
	//  108  237:aload           6
	//  109  239:aload           5
	//  110  241:aload_0         
	//  111  242:getfield        #91  <Field ImageLoaderEngine engine>
	//  112  245:aload_1         
	//  113  246:invokevirtual   #241 <Method java.util.concurrent.locks.ReentrantLock ImageLoaderEngine.getLockForUri(String)>
	//  114  249:invokespecial   #244 <Method void ImageLoadingInfo(String, ImageAware, ImageSize, String, DisplayImageOptions, ImageLoadingListener, ImageLoadingProgressListener, java.util.concurrent.locks.ReentrantLock)>
	//  115  252:astore_1        
				s = ((String) (new ProcessAndDisplayImageTask(engine, ((Bitmap) (displayimageoptions)), ((ImageLoadingInfo) (s)), defineHandler(((DisplayImageOptions) (imageloadinglistener))))));
	//  116  253:new             #246 <Class ProcessAndDisplayImageTask>
	//  117  256:dup             
	//  118  257:aload_0         
	//  119  258:getfield        #91  <Field ImageLoaderEngine engine>
	//  120  261:aload_3         
	//  121  262:aload_1         
	//  122  263:aload           4
	//  123  265:invokestatic    #248 <Method Handler defineHandler(DisplayImageOptions)>
	//  124  268:invokespecial   #251 <Method void ProcessAndDisplayImageTask(ImageLoaderEngine, Bitmap, ImageLoadingInfo, Handler)>
	//  125  271:astore_1        
				if(((DisplayImageOptions) (imageloadinglistener)).isSyncLoading())
	//* 126  272:aload           4
	//* 127  274:invokevirtual   #70  <Method boolean DisplayImageOptions.isSyncLoading()>
	//* 128  277:ifeq            285
				{
					((ProcessAndDisplayImageTask) (s)).run();
	//  129  280:aload_1         
	//  130  281:invokevirtual   #254 <Method void ProcessAndDisplayImageTask.run()>
					return;
	//  131  284:return          
				} else
				{
					engine.submit(((ProcessAndDisplayImageTask) (s)));
	//  132  285:aload_0         
	//  133  286:getfield        #91  <Field ImageLoaderEngine engine>
	//  134  289:aload_1         
	//  135  290:invokevirtual   #258 <Method void ImageLoaderEngine.submit(ProcessAndDisplayImageTask)>
					return;
	//  136  293:return          
				}
			} else
			{
				((DisplayImageOptions) (imageloadinglistener)).getDisplayer().display(((Bitmap) (displayimageoptions)), imageaware, LoadedFrom.MEMORY_CACHE);
	//  137  294:aload           4
	//  138  296:invokevirtual   #262 <Method BitmapDisplayer DisplayImageOptions.getDisplayer()>
	//  139  299:aload_3         
	//  140  300:aload_2         
	//  141  301:getstatic       #268 <Field LoadedFrom LoadedFrom.MEMORY_CACHE>
	//  142  304:invokeinterface #274 <Method void BitmapDisplayer.display(Bitmap, ImageAware, LoadedFrom)>
				imageloadinglistener1.onLoadingComplete(s, imageaware.getWrappedView(), ((Bitmap) (displayimageoptions)));
	//  143  309:aload           6
	//  144  311:aload_1         
	//  145  312:aload_2         
	//  146  313:invokeinterface #178 <Method android.view.View ImageAware.getWrappedView()>
	//  147  318:aload_3         
	//  148  319:invokeinterface #203 <Method void ImageLoadingListener.onLoadingComplete(String, android.view.View, Bitmap)>
				return;
	//  149  324:return          
			}
		}
		if(((DisplayImageOptions) (imageloadinglistener)).shouldShowImageOnLoading())
	//* 150  325:aload           4
	//* 151  327:invokevirtual   #277 <Method boolean DisplayImageOptions.shouldShowImageOnLoading()>
	//* 152  330:ifeq            355
			imageaware.setImageDrawable(((DisplayImageOptions) (imageloadinglistener)).getImageOnLoading(configuration.resources));
	//  153  333:aload_2         
	//  154  334:aload           4
	//  155  336:aload_0         
	//  156  337:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//  157  340:getfield        #191 <Field android.content.res.Resources ImageLoaderConfiguration.resources>
	//  158  343:invokevirtual   #280 <Method android.graphics.drawable.Drawable DisplayImageOptions.getImageOnLoading(android.content.res.Resources)>
	//  159  346:invokeinterface #199 <Method boolean ImageAware.setImageDrawable(android.graphics.drawable.Drawable)>
	//  160  351:pop             
		else
	//* 161  352:goto            371
		if(((DisplayImageOptions) (imageloadinglistener)).isResetViewBeforeLoading())
	//* 162  355:aload           4
	//* 163  357:invokevirtual   #283 <Method boolean DisplayImageOptions.isResetViewBeforeLoading()>
	//* 164  360:ifeq            371
			imageaware.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//  165  363:aload_2         
	//  166  364:aconst_null     
	//  167  365:invokeinterface #199 <Method boolean ImageAware.setImageDrawable(android.graphics.drawable.Drawable)>
	//  168  370:pop             
		s = ((String) (new ImageLoadingInfo(s, imageaware, imagesize, s1, ((DisplayImageOptions) (imageloadinglistener)), imageloadinglistener1, imageloadingprogresslistener, engine.getLockForUri(s))));
	//  169  371:new             #237 <Class ImageLoadingInfo>
	//  170  374:dup             
	//  171  375:aload_1         
	//  172  376:aload_2         
	//  173  377:aload           7
	//  174  379:aload           8
	//  175  381:aload           4
	//  176  383:aload           6
	//  177  385:aload           5
	//  178  387:aload_0         
	//  179  388:getfield        #91  <Field ImageLoaderEngine engine>
	//  180  391:aload_1         
	//  181  392:invokevirtual   #241 <Method java.util.concurrent.locks.ReentrantLock ImageLoaderEngine.getLockForUri(String)>
	//  182  395:invokespecial   #244 <Method void ImageLoadingInfo(String, ImageAware, ImageSize, String, DisplayImageOptions, ImageLoadingListener, ImageLoadingProgressListener, java.util.concurrent.locks.ReentrantLock)>
	//  183  398:astore_1        
		s = ((String) (new LoadAndDisplayImageTask(engine, ((ImageLoadingInfo) (s)), defineHandler(((DisplayImageOptions) (imageloadinglistener))))));
	//  184  399:new             #285 <Class LoadAndDisplayImageTask>
	//  185  402:dup             
	//  186  403:aload_0         
	//  187  404:getfield        #91  <Field ImageLoaderEngine engine>
	//  188  407:aload_1         
	//  189  408:aload           4
	//  190  410:invokestatic    #248 <Method Handler defineHandler(DisplayImageOptions)>
	//  191  413:invokespecial   #288 <Method void LoadAndDisplayImageTask(ImageLoaderEngine, ImageLoadingInfo, Handler)>
	//  192  416:astore_1        
		if(((DisplayImageOptions) (imageloadinglistener)).isSyncLoading())
	//* 193  417:aload           4
	//* 194  419:invokevirtual   #70  <Method boolean DisplayImageOptions.isSyncLoading()>
	//* 195  422:ifeq            430
		{
			((LoadAndDisplayImageTask) (s)).run();
	//  196  425:aload_1         
	//  197  426:invokevirtual   #289 <Method void LoadAndDisplayImageTask.run()>
			return;
	//  198  429:return          
		} else
		{
			engine.submit(((LoadAndDisplayImageTask) (s)));
	//  199  430:aload_0         
	//  200  431:getfield        #91  <Field ImageLoaderEngine engine>
	//  201  434:aload_1         
	//  202  435:invokevirtual   #292 <Method void ImageLoaderEngine.submit(LoadAndDisplayImageTask)>
			return;
	//  203  438:return          
		}
	}

	public void displayImage(String s, ImageAware imageaware, ImageLoadingListener imageloadinglistener)
	{
		displayImage(s, imageaware, ((DisplayImageOptions) (null)), imageloadinglistener, ((ImageLoadingProgressListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #150 <Method void displayImage(String, ImageAware, DisplayImageOptions, ImageLoadingListener, ImageLoadingProgressListener)>
	//    7    9:return          
	}

	public DiskCache getDiscCache()
	{
		return getDiskCache();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method DiskCache getDiskCache()>
	//    2    4:areturn         
	}

	public DiskCache getDiskCache()
	{
		checkConfiguration();
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method void checkConfiguration()>
		return configuration.diskCache;
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//    4    8:getfield        #115 <Field DiskCache ImageLoaderConfiguration.diskCache>
	//    5   11:areturn         
	}

	public String getLoadingUriForView(ImageView imageview)
	{
		return engine.getLoadingUriForView(((ImageAware) (new ImageViewAware(imageview))));
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ImageLoaderEngine engine>
	//    2    4:new             #93  <Class ImageViewAware>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #95  <Method void ImageViewAware(ImageView)>
	//    6   12:invokevirtual   #303 <Method String ImageLoaderEngine.getLoadingUriForView(ImageAware)>
	//    7   15:areturn         
	}

	public String getLoadingUriForView(ImageAware imageaware)
	{
		return engine.getLoadingUriForView(imageaware);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ImageLoaderEngine engine>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #303 <Method String ImageLoaderEngine.getLoadingUriForView(ImageAware)>
	//    4    8:areturn         
	}

	public MemoryCache getMemoryCache()
	{
		checkConfiguration();
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method void checkConfiguration()>
		return configuration.memoryCache;
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//    4    8:getfield        #125 <Field MemoryCache ImageLoaderConfiguration.memoryCache>
	//    5   11:areturn         
	}

	public void handleSlowNetwork(boolean flag)
	{
		engine.handleSlowNetwork(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ImageLoaderEngine engine>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #308 <Method void ImageLoaderEngine.handleSlowNetwork(boolean)>
	//    4    8:return          
	}

	public void init(ImageLoaderConfiguration imageloaderconfiguration)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(imageloaderconfiguration != null)
			break MISSING_BLOCK_LABEL_16;
	//    2    2:aload_1         
	//    3    3:ifnonnull       16
		throw new IllegalArgumentException("ImageLoader configuration can not be initialized with null");
	//    4    6:new             #161 <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #10  <String "ImageLoader configuration can not be initialized with null">
	//    7   12:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
		if(configuration == null)
	//*   9   16:aload_0         
	//*  10   17:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//*  11   20:ifnonnull       52
		{
			L.d("Initialize ImageLoader with configuration", new Object[0]);
	//   12   23:ldc1            #22  <String "Initialize ImageLoader with configuration">
	//   13   25:iconst_0        
	//   14   26:anewarray       Object[]
	//   15   29:invokestatic    #139 <Method void L.d(String, Object[])>
			engine = new ImageLoaderEngine(imageloaderconfiguration);
	//   16   32:aload_0         
	//   17   33:new             #97  <Class ImageLoaderEngine>
	//   18   36:dup             
	//   19   37:aload_1         
	//   20   38:invokespecial   #312 <Method void ImageLoaderEngine(ImageLoaderConfiguration)>
	//   21   41:putfield        #91  <Field ImageLoaderEngine engine>
			configuration = imageloaderconfiguration;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:putfield        #53  <Field ImageLoaderConfiguration configuration>
			break MISSING_BLOCK_LABEL_61;
	//   25   49:goto            61
		}
		L.w("Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.", new Object[0]);
	//   26   52:ldc1            #31  <String "Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.">
	//   27   54:iconst_0        
	//   28   55:anewarray       Object[]
	//   29   58:invokestatic    #315 <Method void L.w(String, Object[])>
		this;
	//   30   61:aload_0         
		JVM INSTR monitorexit ;
	//   31   62:monitorexit     
		return;
	//   32   63:return          
	//*  33   64:aload_0         
_L2:
		throw imageloaderconfiguration;
	//   34   65:monitorexit     
	//   35   66:aload_1         
	//   36   67:athrow          
		imageloaderconfiguration;
	//   37   68:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  38   69:goto            64
	}

	public boolean isInited()
	{
		return configuration != null;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void loadImage(String s, DisplayImageOptions displayimageoptions, ImageLoadingListener imageloadinglistener)
	{
		loadImage(s, ((ImageSize) (null)), displayimageoptions, imageloadinglistener, ((ImageLoadingProgressListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #321 <Method void loadImage(String, ImageSize, DisplayImageOptions, ImageLoadingListener, ImageLoadingProgressListener)>
	//    7    9:return          
	}

	public void loadImage(String s, ImageSize imagesize, DisplayImageOptions displayimageoptions, ImageLoadingListener imageloadinglistener)
	{
		loadImage(s, imagesize, displayimageoptions, imageloadinglistener, ((ImageLoadingProgressListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:invokevirtual   #321 <Method void loadImage(String, ImageSize, DisplayImageOptions, ImageLoadingListener, ImageLoadingProgressListener)>
	//    7   10:return          
	}

	public void loadImage(String s, ImageSize imagesize, DisplayImageOptions displayimageoptions, ImageLoadingListener imageloadinglistener, ImageLoadingProgressListener imageloadingprogresslistener)
	{
		checkConfiguration();
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method void checkConfiguration()>
		ImageSize imagesize1 = imagesize;
	//    2    4:aload_2         
	//    3    5:astore          6
		if(imagesize == null)
	//*   4    7:aload_2         
	//*   5    8:ifnonnull       20
			imagesize1 = configuration.getMaxImageSize();
	//    6   11:aload_0         
	//    7   12:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//    8   15:invokevirtual   #207 <Method ImageSize ImageLoaderConfiguration.getMaxImageSize()>
	//    9   18:astore          6
		imagesize = ((ImageSize) (displayimageoptions));
	//   10   20:aload_3         
	//   11   21:astore_2        
		if(displayimageoptions == null)
	//*  12   22:aload_3         
	//*  13   23:ifnonnull       34
			imagesize = ((ImageSize) (configuration.defaultDisplayImageOptions));
	//   14   26:aload_0         
	//   15   27:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//   16   30:getfield        #166 <Field DisplayImageOptions ImageLoaderConfiguration.defaultDisplayImageOptions>
	//   17   33:astore_2        
		displayImage(s, ((ImageAware) (new NonViewAware(s, imagesize1, ViewScaleType.CROP))), ((DisplayImageOptions) (imagesize)), imageloadinglistener, imageloadingprogresslistener);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:new             #324 <Class NonViewAware>
	//   21   39:dup             
	//   22   40:aload_1         
	//   23   41:aload           6
	//   24   43:getstatic       #330 <Field ViewScaleType ViewScaleType.CROP>
	//   25   46:invokespecial   #333 <Method void NonViewAware(String, ImageSize, ViewScaleType)>
	//   26   49:aload_2         
	//   27   50:aload           4
	//   28   52:aload           5
	//   29   54:invokevirtual   #150 <Method void displayImage(String, ImageAware, DisplayImageOptions, ImageLoadingListener, ImageLoadingProgressListener)>
	//   30   57:return          
	}

	public void loadImage(String s, ImageSize imagesize, ImageLoadingListener imageloadinglistener)
	{
		loadImage(s, imagesize, ((DisplayImageOptions) (null)), imageloadinglistener, ((ImageLoadingProgressListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #321 <Method void loadImage(String, ImageSize, DisplayImageOptions, ImageLoadingListener, ImageLoadingProgressListener)>
	//    7    9:return          
	}

	public void loadImage(String s, ImageLoadingListener imageloadinglistener)
	{
		loadImage(s, ((ImageSize) (null)), ((DisplayImageOptions) (null)), imageloadinglistener, ((ImageLoadingProgressListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:aload_2         
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #321 <Method void loadImage(String, ImageSize, DisplayImageOptions, ImageLoadingListener, ImageLoadingProgressListener)>
	//    7    9:return          
	}

	public Bitmap loadImageSync(String s)
	{
		return loadImageSync(s, ((ImageSize) (null)), ((DisplayImageOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #339 <Method Bitmap loadImageSync(String, ImageSize, DisplayImageOptions)>
	//    5    7:areturn         
	}

	public Bitmap loadImageSync(String s, DisplayImageOptions displayimageoptions)
	{
		return loadImageSync(s, ((ImageSize) (null)), displayimageoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokevirtual   #339 <Method Bitmap loadImageSync(String, ImageSize, DisplayImageOptions)>
	//    5    7:areturn         
	}

	public Bitmap loadImageSync(String s, ImageSize imagesize)
	{
		return loadImageSync(s, imagesize, ((DisplayImageOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #339 <Method Bitmap loadImageSync(String, ImageSize, DisplayImageOptions)>
	//    5    7:areturn         
	}

	public Bitmap loadImageSync(String s, ImageSize imagesize, DisplayImageOptions displayimageoptions)
	{
		Object obj = ((Object) (displayimageoptions));
	//    0    0:aload_3         
	//    1    1:astore          4
		if(displayimageoptions == null)
	//*   2    3:aload_3         
	//*   3    4:ifnonnull       16
			obj = ((Object) (configuration.defaultDisplayImageOptions));
	//    4    7:aload_0         
	//    5    8:getfield        #53  <Field ImageLoaderConfiguration configuration>
	//    6   11:getfield        #166 <Field DisplayImageOptions ImageLoaderConfiguration.defaultDisplayImageOptions>
	//    7   14:astore          4
		displayimageoptions = (new DisplayImageOptions.Builder()).cloneFrom(((DisplayImageOptions) (obj))).syncLoading(true).build();
	//    8   16:new             #343 <Class DisplayImageOptions$Builder>
	//    9   19:dup             
	//   10   20:invokespecial   #344 <Method void DisplayImageOptions$Builder()>
	//   11   23:aload           4
	//   12   25:invokevirtual   #348 <Method DisplayImageOptions$Builder DisplayImageOptions$Builder.cloneFrom(DisplayImageOptions)>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #352 <Method DisplayImageOptions$Builder DisplayImageOptions$Builder.syncLoading(boolean)>
	//   15   32:invokevirtual   #356 <Method DisplayImageOptions DisplayImageOptions$Builder.build()>
	//   16   35:astore_3        
	/* block-local class not found */
	class SyncImageLoadingListener {}

		obj = ((Object) (new SyncImageLoadingListener(((_cls1) (null)))));
	//   17   36:new             #6   <Class ImageLoader$SyncImageLoadingListener>
	//   18   39:dup             
	//   19   40:aconst_null     
	//   20   41:invokespecial   #359 <Method void ImageLoader$SyncImageLoadingListener(ImageLoader$1)>
	//   21   44:astore          4
		loadImage(s, imagesize, displayimageoptions, ((ImageLoadingListener) (obj)));
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:aload_2         
	//   25   49:aload_3         
	//   26   50:aload           4
	//   27   52:invokevirtual   #361 <Method void loadImage(String, ImageSize, DisplayImageOptions, ImageLoadingListener)>
		return ((SyncImageLoadingListener) (obj)).getLoadedBitmap();
	//   28   55:aload           4
	//   29   57:invokevirtual   #365 <Method Bitmap ImageLoader$SyncImageLoadingListener.getLoadedBitmap()>
	//   30   60:areturn         
	}

	public void pause()
	{
		engine.pause();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ImageLoaderEngine engine>
	//    2    4:invokevirtual   #368 <Method void ImageLoaderEngine.pause()>
	//    3    7:return          
	}

	public void resume()
	{
		engine.resume();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ImageLoaderEngine engine>
	//    2    4:invokevirtual   #371 <Method void ImageLoaderEngine.resume()>
	//    3    7:return          
	}

	public void setDefaultLoadingListener(ImageLoadingListener imageloadinglistener)
	{
		Object obj = ((Object) (imageloadinglistener));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(imageloadinglistener == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       14
			obj = ((Object) (new SimpleImageLoadingListener()));
	//    4    6:new             #47  <Class SimpleImageLoadingListener>
	//    5    9:dup             
	//    6   10:invokespecial   #48  <Method void SimpleImageLoadingListener()>
	//    7   13:astore_2        
		defaultListener = ((ImageLoadingListener) (obj));
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #50  <Field ImageLoadingListener defaultListener>
	//   11   19:return          
	}

	public void stop()
	{
		engine.stop();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ImageLoaderEngine engine>
	//    2    4:invokevirtual   #374 <Method void ImageLoaderEngine.stop()>
	//    3    7:return          
	}

	private static final String ERROR_INIT_CONFIG_WITH_NULL = "ImageLoader configuration can not be initialized with null";
	private static final String ERROR_NOT_INIT = "ImageLoader must be init with configuration before using";
	private static final String ERROR_WRONG_ARGUMENTS = "Wrong arguments were passed to displayImage() method (ImageView reference must not be null)";
	static final String LOG_DESTROY = "Destroy ImageLoader";
	static final String LOG_INIT_CONFIG = "Initialize ImageLoader with configuration";
	static final String LOG_LOAD_IMAGE_FROM_MEMORY_CACHE = "Load image from memory cache [%s]";
	public static final String TAG = "ImageLoader";
	private static final String WARNING_RE_INIT_CONFIG = "Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.";
	private static volatile ImageLoader instance;
	private ImageLoaderConfiguration configuration;
	private ImageLoadingListener defaultListener;
	private ImageLoaderEngine engine;

	static 
	{
	//    0    0:return          
	}
}
