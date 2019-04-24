// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.rt.mobile.english;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Environment;
import android.support.multidex.MultiDex;
import com.comscore.analytics.comScore;
import com.crashlytics.android.Crashlytics;
import com.facebook.stetho.Stetho;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.UsingFreqLimitedMemoryCache;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.rt.mobile.english.data.LocaleHelper;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.YandexMetricaConfig;
import dagger.ObjectGraph;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import java.io.File;

// Referenced classes of package com.rt.mobile.english:
//			Utils, RTModule

public class RTApp extends Application
{

	public RTApp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Application()>
	//    2    4:return          
	}

	public static RTApp get(Context context)
	{
		return (RTApp)context.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method Context Context.getApplicationContext()>
	//    2    4:checkcast       #2   <Class RTApp>
	//    3    7:areturn         
	}

	private void initComScore()
	{
		comScore.setAppContext(getApplicationContext());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method Context getApplicationContext()>
	//    2    4:invokestatic    #29  <Method void comScore.setAppContext(Context)>
		comScore.enableAutoUpdate(120, true);
	//    3    7:bipush          120
	//    4    9:iconst_1        
	//    5   10:invokestatic    #33  <Method void comScore.enableAutoUpdate(int, boolean)>
		comScore.setCustomerC2("17935924");
	//    6   13:ldc1            #35  <String "17935924">
	//    7   15:invokestatic    #39  <Method void comScore.setCustomerC2(String)>
		comScore.setPublisherSecret("2a6056823cfcf552475464749871edc3");
	//    8   18:ldc1            #41  <String "2a6056823cfcf552475464749871edc3">
	//    9   20:invokestatic    #44  <Method void comScore.setPublisherSecret(String)>
		comScore.setAppName("RT News");
	//   10   23:ldc1            #46  <String "RT News">
	//   11   25:invokestatic    #49  <Method void comScore.setAppName(String)>
	//   12   28:return          
	}

	private void initUniversalImageLoader()
	{
		Object obj = ((Object) ((new com.nostra13.universalimageloader.core.DisplayImageOptions.Builder()).showImageOnLoading(((android.graphics.drawable.Drawable) (new ColorDrawable(Color.parseColor("#f0f0f0"))))).resetViewBeforeLoading(true).cacheInMemory(true).cacheOnDisk(true).considerExifParams(true).imageScaleType(ImageScaleType.EXACTLY_STRETCHED).bitmapConfig(android.graphics.Bitmap.Config.RGB_565).build()));
	//    0    0:new             #52  <Class com.nostra13.universalimageloader.core.DisplayImageOptions$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void com.nostra13.universalimageloader.core.DisplayImageOptions$Builder()>
	//    3    7:new             #55  <Class ColorDrawable>
	//    4   10:dup             
	//    5   11:ldc1            #57  <String "#f0f0f0">
	//    6   13:invokestatic    #63  <Method int Color.parseColor(String)>
	//    7   16:invokespecial   #66  <Method void ColorDrawable(int)>
	//    8   19:invokevirtual   #70  <Method com.nostra13.universalimageloader.core.DisplayImageOptions$Builder com.nostra13.universalimageloader.core.DisplayImageOptions$Builder.showImageOnLoading(android.graphics.drawable.Drawable)>
	//    9   22:iconst_1        
	//   10   23:invokevirtual   #74  <Method com.nostra13.universalimageloader.core.DisplayImageOptions$Builder com.nostra13.universalimageloader.core.DisplayImageOptions$Builder.resetViewBeforeLoading(boolean)>
	//   11   26:iconst_1        
	//   12   27:invokevirtual   #77  <Method com.nostra13.universalimageloader.core.DisplayImageOptions$Builder com.nostra13.universalimageloader.core.DisplayImageOptions$Builder.cacheInMemory(boolean)>
	//   13   30:iconst_1        
	//   14   31:invokevirtual   #80  <Method com.nostra13.universalimageloader.core.DisplayImageOptions$Builder com.nostra13.universalimageloader.core.DisplayImageOptions$Builder.cacheOnDisk(boolean)>
	//   15   34:iconst_1        
	//   16   35:invokevirtual   #83  <Method com.nostra13.universalimageloader.core.DisplayImageOptions$Builder com.nostra13.universalimageloader.core.DisplayImageOptions$Builder.considerExifParams(boolean)>
	//   17   38:getstatic       #89  <Field ImageScaleType ImageScaleType.EXACTLY_STRETCHED>
	//   18   41:invokevirtual   #93  <Method com.nostra13.universalimageloader.core.DisplayImageOptions$Builder com.nostra13.universalimageloader.core.DisplayImageOptions$Builder.imageScaleType(ImageScaleType)>
	//   19   44:getstatic       #99  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//   20   47:invokevirtual   #103 <Method com.nostra13.universalimageloader.core.DisplayImageOptions$Builder com.nostra13.universalimageloader.core.DisplayImageOptions$Builder.bitmapConfig(android.graphics.Bitmap$Config)>
	//   21   50:invokevirtual   #107 <Method com.nostra13.universalimageloader.core.DisplayImageOptions com.nostra13.universalimageloader.core.DisplayImageOptions$Builder.build()>
	//   22   53:astore_2        
		int i = (0x100000 * ((ActivityManager)getSystemService("activity")).getMemoryClass()) / 8;
	//   23   54:ldc1            #108 <Int 0x100000>
	//   24   56:aload_0         
	//   25   57:ldc1            #110 <String "activity">
	//   26   59:invokevirtual   #114 <Method Object getSystemService(String)>
	//   27   62:checkcast       #116 <Class ActivityManager>
	//   28   65:invokevirtual   #120 <Method int ActivityManager.getMemoryClass()>
	//   29   68:imul            
	//   30   69:bipush          8
	//   31   71:idiv            
	//   32   72:istore_1        
		Object obj1 = ((Object) (new StringBuilder()));
	//   33   73:new             #122 <Class StringBuilder>
	//   34   76:dup             
	//   35   77:invokespecial   #123 <Method void StringBuilder()>
	//   36   80:astore_3        
		((StringBuilder) (obj1)).append(Environment.getExternalStorageDirectory().getPath());
	//   37   81:aload_3         
	//   38   82:invokestatic    #129 <Method File Environment.getExternalStorageDirectory()>
	//   39   85:invokevirtual   #135 <Method String File.getPath()>
	//   40   88:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   41   91:pop             
		((StringBuilder) (obj1)).append("/rtnews/cache");
	//   42   92:aload_3         
	//   43   93:ldc1            #141 <String "/rtnews/cache">
	//   44   95:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   45   98:pop             
		obj1 = ((Object) (new File(((StringBuilder) (obj1)).toString())));
	//   46   99:new             #131 <Class File>
	//   47  102:dup             
	//   48  103:aload_3         
	//   49  104:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   50  107:invokespecial   #146 <Method void File(String)>
	//   51  110:astore_3        
		obj = ((Object) ((new com.nostra13.universalimageloader.core.ImageLoaderConfiguration.Builder(((Context) (this)))).threadPoolSize(3).threadPriority(3).denyCacheImageMultipleSizesInMemory().diskCacheFileNameGenerator(((com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator) (new Md5FileNameGenerator()))).memoryCache(((com.nostra13.universalimageloader.cache.memory.MemoryCache) (new UsingFreqLimitedMemoryCache(i)))).memoryCacheSize(i).diskCacheSize(0x3200000).tasksProcessingOrder(QueueProcessingType.LIFO).diskCache(((com.nostra13.universalimageloader.cache.disc.DiskCache) (new UnlimitedDiskCache(((File) (obj1)))))).imageDownloader(((com.nostra13.universalimageloader.core.download.ImageDownloader) (new BaseImageDownloader(((Context) (this)), 5000, 30000)))).defaultDisplayImageOptions(((com.nostra13.universalimageloader.core.DisplayImageOptions) (obj))).build()));
	//   52  111:new             #148 <Class com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder>
	//   53  114:dup             
	//   54  115:aload_0         
	//   55  116:invokespecial   #150 <Method void com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder(Context)>
	//   56  119:iconst_3        
	//   57  120:invokevirtual   #154 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.threadPoolSize(int)>
	//   58  123:iconst_3        
	//   59  124:invokevirtual   #157 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.threadPriority(int)>
	//   60  127:invokevirtual   #161 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.denyCacheImageMultipleSizesInMemory()>
	//   61  130:new             #163 <Class Md5FileNameGenerator>
	//   62  133:dup             
	//   63  134:invokespecial   #164 <Method void Md5FileNameGenerator()>
	//   64  137:invokevirtual   #168 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.diskCacheFileNameGenerator(com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator)>
	//   65  140:new             #170 <Class UsingFreqLimitedMemoryCache>
	//   66  143:dup             
	//   67  144:iload_1         
	//   68  145:invokespecial   #171 <Method void UsingFreqLimitedMemoryCache(int)>
	//   69  148:invokevirtual   #175 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.memoryCache(com.nostra13.universalimageloader.cache.memory.MemoryCache)>
	//   70  151:iload_1         
	//   71  152:invokevirtual   #178 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.memoryCacheSize(int)>
	//   72  155:ldc1            #179 <Int 0x3200000>
	//   73  157:invokevirtual   #182 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.diskCacheSize(int)>
	//   74  160:getstatic       #188 <Field QueueProcessingType QueueProcessingType.LIFO>
	//   75  163:invokevirtual   #192 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.tasksProcessingOrder(QueueProcessingType)>
	//   76  166:new             #194 <Class UnlimitedDiskCache>
	//   77  169:dup             
	//   78  170:aload_3         
	//   79  171:invokespecial   #197 <Method void UnlimitedDiskCache(File)>
	//   80  174:invokevirtual   #201 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.diskCache(com.nostra13.universalimageloader.cache.disc.DiskCache)>
	//   81  177:new             #203 <Class BaseImageDownloader>
	//   82  180:dup             
	//   83  181:aload_0         
	//   84  182:sipush          5000
	//   85  185:sipush          30000
	//   86  188:invokespecial   #206 <Method void BaseImageDownloader(Context, int, int)>
	//   87  191:invokevirtual   #210 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.imageDownloader(com.nostra13.universalimageloader.core.download.ImageDownloader)>
	//   88  194:aload_2         
	//   89  195:invokevirtual   #214 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.defaultDisplayImageOptions(com.nostra13.universalimageloader.core.DisplayImageOptions)>
	//   90  198:invokevirtual   #217 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.build()>
	//   91  201:astore_2        
		ImageLoader.getInstance().init(((com.nostra13.universalimageloader.core.ImageLoaderConfiguration) (obj)));
	//   92  202:invokestatic    #223 <Method ImageLoader ImageLoader.getInstance()>
	//   93  205:aload_2         
	//   94  206:invokevirtual   #227 <Method void ImageLoader.init(com.nostra13.universalimageloader.core.ImageLoaderConfiguration)>
	//   95  209:return          
	}

	private void initYM()
	{
		com.yandex.metrica.YandexMetricaConfig.Builder builder = YandexMetricaConfig.newConfigBuilder("5c2e6c43-45f5-4669-a5f3-73ea86b9889a");
	//    0    0:ldc1            #230 <String "5c2e6c43-45f5-4669-a5f3-73ea86b9889a">
	//    1    2:invokestatic    #236 <Method com.yandex.metrica.YandexMetricaConfig$Builder YandexMetricaConfig.newConfigBuilder(String)>
	//    2    5:astore_1        
		YandexMetrica.activate(getApplicationContext(), builder.build());
	//    3    6:aload_0         
	//    4    7:invokevirtual   #23  <Method Context getApplicationContext()>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #241 <Method YandexMetricaConfig com.yandex.metrica.YandexMetricaConfig$Builder.build()>
	//    7   14:invokestatic    #247 <Method void YandexMetrica.activate(Context, YandexMetricaConfig)>
		YandexMetrica.enableActivityAutoTracking(((Application) (this)));
	//    8   17:aload_0         
	//    9   18:invokestatic    #251 <Method void YandexMetrica.enableActivityAutoTracking(Application)>
	//   10   21:return          
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(LocaleHelper.onAttach(context));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #258 <Method Context LocaleHelper.onAttach(Context)>
	//    3    5:invokespecial   #260 <Method void Application.attachBaseContext(Context)>
		MultiDex.install(((Context) (this)));
	//    4    8:aload_0         
	//    5    9:invokestatic    #265 <Method void MultiDex.install(Context)>
	//    6   12:return          
	}

	public Tracker getTracker()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Tracker tracker1;
		if(tracker == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #269 <Field Tracker tracker>
	//*   4    6:ifnonnull       31
		{
			tracker = GoogleAnalytics.getInstance(((Context) (this))).newTracker(0x7f140001);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokestatic    #274 <Method GoogleAnalytics GoogleAnalytics.getInstance(Context)>
	//    8   14:ldc2            #275 <Int 0x7f140001>
	//    9   17:invokevirtual   #279 <Method Tracker GoogleAnalytics.newTracker(int)>
	//   10   20:putfield        #269 <Field Tracker tracker>
			tracker.enableAdvertisingIdCollection(true);
	//   11   23:aload_0         
	//   12   24:getfield        #269 <Field Tracker tracker>
	//   13   27:iconst_1        
	//   14   28:invokevirtual   #285 <Method void Tracker.enableAdvertisingIdCollection(boolean)>
		}
		tracker1 = tracker;
	//   15   31:aload_0         
	//   16   32:getfield        #269 <Field Tracker tracker>
	//   17   35:astore_1        
		this;
	//   18   36:aload_0         
		JVM INSTR monitorexit ;
	//   19   37:monitorexit     
		return tracker1;
	//   20   38:aload_1         
	//   21   39:areturn         
		Exception exception;
		exception;
	//   22   40:astore_1        
	//*  23   41:aload_0         
		throw exception;
	//   24   42:monitorexit     
	//   25   43:aload_1         
	//   26   44:athrow          
	}

	public void inject(Object obj)
	{
		objectGraph.inject(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #289 <Field ObjectGraph objectGraph>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #294 <Method Object ObjectGraph.inject(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #298 <Method void Application.onConfigurationChanged(Configuration)>
		LocaleHelper.onAttach(((Context) (this)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #258 <Method Context LocaleHelper.onAttach(Context)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #301 <Method void Application.onCreate()>
		resetObjectGraph();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #304 <Method void resetObjectGraph()>
		Fabric.with(((Context) (this)), new Kit[] {
			new Crashlytics()
		});
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:anewarray       Kit[]
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:new             #308 <Class Crashlytics>
	//   10   18:dup             
	//   11   19:invokespecial   #309 <Method void Crashlytics()>
	//   12   22:aastore         
	//   13   23:invokestatic    #315 <Method Fabric Fabric.with(Context, Kit[])>
	//   14   26:pop             
		Stetho.initialize(Stetho.newInitializerBuilder(((Context) (this))).enableDumpapp(Stetho.defaultDumperPluginsProvider(((Context) (this)))).enableWebKitInspector(Stetho.defaultInspectorModulesProvider(((Context) (this)))).build());
	//   15   27:aload_0         
	//   16   28:invokestatic    #321 <Method com.facebook.stetho.Stetho$InitializerBuilder Stetho.newInitializerBuilder(Context)>
	//   17   31:aload_0         
	//   18   32:invokestatic    #325 <Method com.facebook.stetho.DumperPluginsProvider Stetho.defaultDumperPluginsProvider(Context)>
	//   19   35:invokevirtual   #331 <Method com.facebook.stetho.Stetho$InitializerBuilder com.facebook.stetho.Stetho$InitializerBuilder.enableDumpapp(com.facebook.stetho.DumperPluginsProvider)>
	//   20   38:aload_0         
	//   21   39:invokestatic    #335 <Method com.facebook.stetho.InspectorModulesProvider Stetho.defaultInspectorModulesProvider(Context)>
	//   22   42:invokevirtual   #339 <Method com.facebook.stetho.Stetho$InitializerBuilder com.facebook.stetho.Stetho$InitializerBuilder.enableWebKitInspector(com.facebook.stetho.InspectorModulesProvider)>
	//   23   45:invokevirtual   #342 <Method com.facebook.stetho.Stetho$Initializer com.facebook.stetho.Stetho$InitializerBuilder.build()>
	//   24   48:invokestatic    #346 <Method void Stetho.initialize(com.facebook.stetho.Stetho$Initializer)>
		Utils.setInstance(new Utils(getApplicationContext()));
	//   25   51:new             #348 <Class Utils>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:invokevirtual   #23  <Method Context getApplicationContext()>
	//   29   59:invokespecial   #349 <Method void Utils(Context)>
	//   30   62:invokestatic    #353 <Method void Utils.setInstance(Utils)>
		if(!Utils.getInstance().getLocale().equals("none"))
	//*  31   65:invokestatic    #356 <Method Utils Utils.getInstance()>
	//*  32   68:invokevirtual   #359 <Method String Utils.getLocale()>
	//*  33   71:ldc2            #361 <String "none">
	//*  34   74:invokevirtual   #367 <Method boolean String.equals(Object)>
	//*  35   77:ifne            122
		{
			getTracker().setLanguage(Utils.getInstance().getLocale());
	//   36   80:aload_0         
	//   37   81:invokevirtual   #369 <Method Tracker getTracker()>
	//   38   84:invokestatic    #356 <Method Utils Utils.getInstance()>
	//   39   87:invokevirtual   #359 <Method String Utils.getLocale()>
	//   40   90:invokevirtual   #372 <Method void Tracker.setLanguage(String)>
			getTracker().set("&cd1", Utils.getInstance().getLocale());
	//   41   93:aload_0         
	//   42   94:invokevirtual   #369 <Method Tracker getTracker()>
	//   43   97:ldc2            #374 <String "&cd1">
	//   44  100:invokestatic    #356 <Method Utils Utils.getInstance()>
	//   45  103:invokevirtual   #359 <Method String Utils.getLocale()>
	//   46  106:invokevirtual   #378 <Method void Tracker.set(String, String)>
			Utils.getInstance().setLocale(((Context) (this)), Utils.getInstance().getLocale());
	//   47  109:invokestatic    #356 <Method Utils Utils.getInstance()>
	//   48  112:aload_0         
	//   49  113:invokestatic    #356 <Method Utils Utils.getInstance()>
	//   50  116:invokevirtual   #359 <Method String Utils.getLocale()>
	//   51  119:invokevirtual   #382 <Method void Utils.setLocale(Context, String)>
		}
		initComScore();
	//   52  122:aload_0         
	//   53  123:invokespecial   #384 <Method void initComScore()>
		initYM();
	//   54  126:aload_0         
	//   55  127:invokespecial   #386 <Method void initYM()>
		initUniversalImageLoader();
	//   56  130:aload_0         
	//   57  131:invokespecial   #388 <Method void initUniversalImageLoader()>
	//   58  134:return          
	}

	public void resetObjectGraph()
	{
		objectGraph = ObjectGraph.create(new Object[] {
			new RTModule(this)
		});
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:anewarray       Object[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:new             #392 <Class RTModule>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:invokespecial   #395 <Method void RTModule(RTApp)>
	//    9   15:aastore         
	//   10   16:invokestatic    #399 <Method ObjectGraph ObjectGraph.create(Object[])>
	//   11   19:putfield        #289 <Field ObjectGraph objectGraph>
		objectGraph.inject(((Object) (this)));
	//   12   22:aload_0         
	//   13   23:getfield        #289 <Field ObjectGraph objectGraph>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #294 <Method Object ObjectGraph.inject(Object)>
	//   16   30:pop             
	//   17   31:return          
	}

	private ObjectGraph objectGraph;
	private Tracker tracker;
}
