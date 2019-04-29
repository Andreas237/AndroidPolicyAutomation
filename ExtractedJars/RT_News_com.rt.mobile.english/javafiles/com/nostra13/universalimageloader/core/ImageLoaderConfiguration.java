// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.nostra13.universalimageloader.core;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.nostra13.universalimageloader.cache.disc.DiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.MemoryCache;
import com.nostra13.universalimageloader.cache.memory.impl.FuzzyKeyMemoryCache;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.decode.ImageDecoder;
import com.nostra13.universalimageloader.core.download.ImageDownloader;
import com.nostra13.universalimageloader.core.process.BitmapProcessor;
import com.nostra13.universalimageloader.utils.L;
import com.nostra13.universalimageloader.utils.MemoryCacheUtils;
import java.util.concurrent.Executor;

// Referenced classes of package com.nostra13.universalimageloader.core:
//			DisplayImageOptions, DefaultConfigurationFactory

public final class ImageLoaderConfiguration
{
	public static class Builder
	{

		private void initEmptyFieldsWithDefaultValues()
		{
			if(taskExecutor == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #87  <Field Executor taskExecutor>
		//*   2    4:ifnonnull       29
				taskExecutor = DefaultConfigurationFactory.createExecutor(threadPoolSize, threadPriority, tasksProcessingType);
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #95  <Field int threadPoolSize>
		//    6   12:aload_0         
		//    7   13:getfield        #97  <Field int threadPriority>
		//    8   16:aload_0         
		//    9   17:getfield        #101 <Field QueueProcessingType tasksProcessingType>
		//   10   20:invokestatic    #166 <Method Executor DefaultConfigurationFactory.createExecutor(int, int, QueueProcessingType)>
		//   11   23:putfield        #87  <Field Executor taskExecutor>
			else
		//*  12   26:goto            34
				customExecutor = true;
		//   13   29:aload_0         
		//   14   30:iconst_1        
		//   15   31:putfield        #91  <Field boolean customExecutor>
			if(taskExecutorForCachedImages == null)
		//*  16   34:aload_0         
		//*  17   35:getfield        #89  <Field Executor taskExecutorForCachedImages>
		//*  18   38:ifnonnull       63
				taskExecutorForCachedImages = DefaultConfigurationFactory.createExecutor(threadPoolSize, threadPriority, tasksProcessingType);
		//   19   41:aload_0         
		//   20   42:aload_0         
		//   21   43:getfield        #95  <Field int threadPoolSize>
		//   22   46:aload_0         
		//   23   47:getfield        #97  <Field int threadPriority>
		//   24   50:aload_0         
		//   25   51:getfield        #101 <Field QueueProcessingType tasksProcessingType>
		//   26   54:invokestatic    #166 <Method Executor DefaultConfigurationFactory.createExecutor(int, int, QueueProcessingType)>
		//   27   57:putfield        #89  <Field Executor taskExecutorForCachedImages>
			else
		//*  28   60:goto            68
				customExecutorForCachedImages = true;
		//   29   63:aload_0         
		//   30   64:iconst_1        
		//   31   65:putfield        #93  <Field boolean customExecutorForCachedImages>
			if(diskCache == null)
		//*  32   68:aload_0         
		//*  33   69:getfield        #111 <Field DiskCache diskCache>
		//*  34   72:ifnonnull       112
			{
				if(diskCacheFileNameGenerator == null)
		//*  35   75:aload_0         
		//*  36   76:getfield        #113 <Field FileNameGenerator diskCacheFileNameGenerator>
		//*  37   79:ifnonnull       89
					diskCacheFileNameGenerator = DefaultConfigurationFactory.createFileNameGenerator();
		//   38   82:aload_0         
		//   39   83:invokestatic    #170 <Method FileNameGenerator DefaultConfigurationFactory.createFileNameGenerator()>
		//   40   86:putfield        #113 <Field FileNameGenerator diskCacheFileNameGenerator>
				diskCache = DefaultConfigurationFactory.createDiskCache(context, diskCacheFileNameGenerator, diskCacheSize, diskCacheFileCount);
		//   41   89:aload_0         
		//   42   90:aload_0         
		//   43   91:getfield        #127 <Field Context context>
		//   44   94:aload_0         
		//   45   95:getfield        #113 <Field FileNameGenerator diskCacheFileNameGenerator>
		//   46   98:aload_0         
		//   47   99:getfield        #105 <Field long diskCacheSize>
		//   48  102:aload_0         
		//   49  103:getfield        #107 <Field int diskCacheFileCount>
		//   50  106:invokestatic    #174 <Method DiskCache DefaultConfigurationFactory.createDiskCache(Context, FileNameGenerator, long, int)>
		//   51  109:putfield        #111 <Field DiskCache diskCache>
			}
			if(memoryCache == null)
		//*  52  112:aload_0         
		//*  53  113:getfield        #109 <Field MemoryCache memoryCache>
		//*  54  116:ifnonnull       134
				memoryCache = DefaultConfigurationFactory.createMemoryCache(context, memoryCacheSize);
		//   55  119:aload_0         
		//   56  120:aload_0         
		//   57  121:getfield        #127 <Field Context context>
		//   58  124:aload_0         
		//   59  125:getfield        #103 <Field int memoryCacheSize>
		//   60  128:invokestatic    #178 <Method MemoryCache DefaultConfigurationFactory.createMemoryCache(Context, int)>
		//   61  131:putfield        #109 <Field MemoryCache memoryCache>
			if(denyCacheImageMultipleSizesInMemory)
		//*  62  134:aload_0         
		//*  63  135:getfield        #99  <Field boolean denyCacheImageMultipleSizesInMemory>
		//*  64  138:ifeq            159
				memoryCache = ((MemoryCache) (new FuzzyKeyMemoryCache(memoryCache, MemoryCacheUtils.createFuzzyKeyComparator())));
		//   65  141:aload_0         
		//   66  142:new             #180 <Class FuzzyKeyMemoryCache>
		//   67  145:dup             
		//   68  146:aload_0         
		//   69  147:getfield        #109 <Field MemoryCache memoryCache>
		//   70  150:invokestatic    #186 <Method java.util.Comparator MemoryCacheUtils.createFuzzyKeyComparator()>
		//   71  153:invokespecial   #189 <Method void FuzzyKeyMemoryCache(MemoryCache, java.util.Comparator)>
		//   72  156:putfield        #109 <Field MemoryCache memoryCache>
			if(downloader == null)
		//*  73  159:aload_0         
		//*  74  160:getfield        #115 <Field ImageDownloader downloader>
		//*  75  163:ifnonnull       177
				downloader = DefaultConfigurationFactory.createImageDownloader(context);
		//   76  166:aload_0         
		//   77  167:aload_0         
		//   78  168:getfield        #127 <Field Context context>
		//   79  171:invokestatic    #193 <Method ImageDownloader DefaultConfigurationFactory.createImageDownloader(Context)>
		//   80  174:putfield        #115 <Field ImageDownloader downloader>
			if(decoder == null)
		//*  81  177:aload_0         
		//*  82  178:getfield        #145 <Field ImageDecoder decoder>
		//*  83  181:ifnonnull       195
				decoder = DefaultConfigurationFactory.createImageDecoder(writeLogs);
		//   84  184:aload_0         
		//   85  185:aload_0         
		//   86  186:getfield        #119 <Field boolean writeLogs>
		//   87  189:invokestatic    #197 <Method ImageDecoder DefaultConfigurationFactory.createImageDecoder(boolean)>
		//   88  192:putfield        #145 <Field ImageDecoder decoder>
			if(defaultDisplayImageOptions == null)
		//*  89  195:aload_0         
		//*  90  196:getfield        #117 <Field DisplayImageOptions defaultDisplayImageOptions>
		//*  91  199:ifnonnull       209
				defaultDisplayImageOptions = DisplayImageOptions.createSimple();
		//   92  202:aload_0         
		//   93  203:invokestatic    #203 <Method DisplayImageOptions DisplayImageOptions.createSimple()>
		//   94  206:putfield        #117 <Field DisplayImageOptions defaultDisplayImageOptions>
		//   95  209:return          
		}

		public ImageLoaderConfiguration build()
		{
			initEmptyFieldsWithDefaultValues();
		//    0    0:aload_0         
		//    1    1:invokespecial   #207 <Method void initEmptyFieldsWithDefaultValues()>
			return new ImageLoaderConfiguration(this, ((_cls1) (null)));
		//    2    4:new             #6   <Class ImageLoaderConfiguration>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:aconst_null     
		//    6   10:invokespecial   #210 <Method void ImageLoaderConfiguration(ImageLoaderConfiguration$Builder, ImageLoaderConfiguration$1)>
		//    7   13:areturn         
		}

		public Builder defaultDisplayImageOptions(DisplayImageOptions displayimageoptions)
		{
			defaultDisplayImageOptions = displayimageoptions;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #117 <Field DisplayImageOptions defaultDisplayImageOptions>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder denyCacheImageMultipleSizesInMemory()
		{
			denyCacheImageMultipleSizesInMemory = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #99  <Field boolean denyCacheImageMultipleSizesInMemory>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder discCache(DiskCache diskcache)
		{
			return diskCache(diskcache);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #217 <Method ImageLoaderConfiguration$Builder diskCache(DiskCache)>
		//    3    5:areturn         
		}

		public Builder discCacheExtraOptions(int i, int j, BitmapProcessor bitmapprocessor)
		{
			return diskCacheExtraOptions(i, j, bitmapprocessor);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #223 <Method ImageLoaderConfiguration$Builder diskCacheExtraOptions(int, int, BitmapProcessor)>
		//    5    7:areturn         
		}

		public Builder discCacheFileCount(int i)
		{
			return diskCacheFileCount(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #227 <Method ImageLoaderConfiguration$Builder diskCacheFileCount(int)>
		//    3    5:areturn         
		}

		public Builder discCacheFileNameGenerator(FileNameGenerator filenamegenerator)
		{
			return diskCacheFileNameGenerator(filenamegenerator);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #231 <Method ImageLoaderConfiguration$Builder diskCacheFileNameGenerator(FileNameGenerator)>
		//    3    5:areturn         
		}

		public Builder discCacheSize(int i)
		{
			return diskCacheSize(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #234 <Method ImageLoaderConfiguration$Builder diskCacheSize(int)>
		//    3    5:areturn         
		}

		public Builder diskCache(DiskCache diskcache)
		{
			if(diskCacheSize > 0L || diskCacheFileCount > 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #105 <Field long diskCacheSize>
		//*   2    4:lconst_0        
		//*   3    5:lcmp            
		//*   4    6:ifgt            16
		//*   5    9:aload_0         
		//*   6   10:getfield        #107 <Field int diskCacheFileCount>
		//*   7   13:ifle            25
				L.w("diskCache(), diskCacheSize() and diskCacheFileCount calls overlap each other", new Object[0]);
		//    8   16:ldc1            #20  <String "diskCache(), diskCacheSize() and diskCacheFileCount calls overlap each other">
		//    9   18:iconst_0        
		//   10   19:anewarray       Object[]
		//   11   22:invokestatic    #240 <Method void L.w(String, Object[])>
			if(diskCacheFileNameGenerator != null)
		//*  12   25:aload_0         
		//*  13   26:getfield        #113 <Field FileNameGenerator diskCacheFileNameGenerator>
		//*  14   29:ifnull          41
				L.w("diskCache() and diskCacheFileNameGenerator() calls overlap each other", new Object[0]);
		//   15   32:ldc1            #17  <String "diskCache() and diskCacheFileNameGenerator() calls overlap each other">
		//   16   34:iconst_0        
		//   17   35:anewarray       Object[]
		//   18   38:invokestatic    #240 <Method void L.w(String, Object[])>
			diskCache = diskcache;
		//   19   41:aload_0         
		//   20   42:aload_1         
		//   21   43:putfield        #111 <Field DiskCache diskCache>
			return this;
		//   22   46:aload_0         
		//   23   47:areturn         
		}

		public Builder diskCacheExtraOptions(int i, int j, BitmapProcessor bitmapprocessor)
		{
			maxImageWidthForDiskCache = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #81  <Field int maxImageWidthForDiskCache>
			maxImageHeightForDiskCache = j;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #83  <Field int maxImageHeightForDiskCache>
			processorForDiskCache = bitmapprocessor;
		//    6   10:aload_0         
		//    7   11:aload_3         
		//    8   12:putfield        #85  <Field BitmapProcessor processorForDiskCache>
			return this;
		//    9   15:aload_0         
		//   10   16:areturn         
		}

		public Builder diskCacheFileCount(int i)
		{
			if(i <= 0)
		//*   0    0:iload_1         
		//*   1    1:ifgt            14
				throw new IllegalArgumentException("maxFileCount must be a positive number");
		//    2    4:new             #242 <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #244 <String "maxFileCount must be a positive number">
		//    5   10:invokespecial   #247 <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			if(diskCache != null)
		//*   7   14:aload_0         
		//*   8   15:getfield        #111 <Field DiskCache diskCache>
		//*   9   18:ifnull          30
				L.w("diskCache(), diskCacheSize() and diskCacheFileCount calls overlap each other", new Object[0]);
		//   10   21:ldc1            #20  <String "diskCache(), diskCacheSize() and diskCacheFileCount calls overlap each other">
		//   11   23:iconst_0        
		//   12   24:anewarray       Object[]
		//   13   27:invokestatic    #240 <Method void L.w(String, Object[])>
			diskCacheFileCount = i;
		//   14   30:aload_0         
		//   15   31:iload_1         
		//   16   32:putfield        #107 <Field int diskCacheFileCount>
			return this;
		//   17   35:aload_0         
		//   18   36:areturn         
		}

		public Builder diskCacheFileNameGenerator(FileNameGenerator filenamegenerator)
		{
			if(diskCache != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #111 <Field DiskCache diskCache>
		//*   2    4:ifnull          16
				L.w("diskCache() and diskCacheFileNameGenerator() calls overlap each other", new Object[0]);
		//    3    7:ldc1            #17  <String "diskCache() and diskCacheFileNameGenerator() calls overlap each other">
		//    4    9:iconst_0        
		//    5   10:anewarray       Object[]
		//    6   13:invokestatic    #240 <Method void L.w(String, Object[])>
			diskCacheFileNameGenerator = filenamegenerator;
		//    7   16:aload_0         
		//    8   17:aload_1         
		//    9   18:putfield        #113 <Field FileNameGenerator diskCacheFileNameGenerator>
			return this;
		//   10   21:aload_0         
		//   11   22:areturn         
		}

		public Builder diskCacheSize(int i)
		{
			if(i <= 0)
		//*   0    0:iload_1         
		//*   1    1:ifgt            14
				throw new IllegalArgumentException("maxCacheSize must be a positive number");
		//    2    4:new             #242 <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #249 <String "maxCacheSize must be a positive number">
		//    5   10:invokespecial   #247 <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			if(diskCache != null)
		//*   7   14:aload_0         
		//*   8   15:getfield        #111 <Field DiskCache diskCache>
		//*   9   18:ifnull          30
				L.w("diskCache(), diskCacheSize() and diskCacheFileCount calls overlap each other", new Object[0]);
		//   10   21:ldc1            #20  <String "diskCache(), diskCacheSize() and diskCacheFileCount calls overlap each other">
		//   11   23:iconst_0        
		//   12   24:anewarray       Object[]
		//   13   27:invokestatic    #240 <Method void L.w(String, Object[])>
			diskCacheSize = i;
		//   14   30:aload_0         
		//   15   31:iload_1         
		//   16   32:i2l             
		//   17   33:putfield        #105 <Field long diskCacheSize>
			return this;
		//   18   36:aload_0         
		//   19   37:areturn         
		}

		public Builder imageDecoder(ImageDecoder imagedecoder)
		{
			decoder = imagedecoder;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #145 <Field ImageDecoder decoder>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder imageDownloader(ImageDownloader imagedownloader)
		{
			downloader = imagedownloader;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #115 <Field ImageDownloader downloader>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder memoryCache(MemoryCache memorycache)
		{
			if(memoryCacheSize != 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #103 <Field int memoryCacheSize>
		//*   2    4:ifeq            16
				L.w("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
		//    3    7:ldc1            #26  <String "memoryCache() and memoryCacheSize() calls overlap each other">
		//    4    9:iconst_0        
		//    5   10:anewarray       Object[]
		//    6   13:invokestatic    #240 <Method void L.w(String, Object[])>
			memoryCache = memorycache;
		//    7   16:aload_0         
		//    8   17:aload_1         
		//    9   18:putfield        #109 <Field MemoryCache memoryCache>
			return this;
		//   10   21:aload_0         
		//   11   22:areturn         
		}

		public Builder memoryCacheExtraOptions(int i, int j)
		{
			maxImageWidthForMemoryCache = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #77  <Field int maxImageWidthForMemoryCache>
			maxImageHeightForMemoryCache = j;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #79  <Field int maxImageHeightForMemoryCache>
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		public Builder memoryCacheSize(int i)
		{
			if(i <= 0)
		//*   0    0:iload_1         
		//*   1    1:ifgt            15
				throw new IllegalArgumentException("memoryCacheSize must be a positive number");
		//    2    4:new             #242 <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc2            #258 <String "memoryCacheSize must be a positive number">
		//    5   11:invokespecial   #247 <Method void IllegalArgumentException(String)>
		//    6   14:athrow          
			if(memoryCache != null)
		//*   7   15:aload_0         
		//*   8   16:getfield        #109 <Field MemoryCache memoryCache>
		//*   9   19:ifnull          31
				L.w("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
		//   10   22:ldc1            #26  <String "memoryCache() and memoryCacheSize() calls overlap each other">
		//   11   24:iconst_0        
		//   12   25:anewarray       Object[]
		//   13   28:invokestatic    #240 <Method void L.w(String, Object[])>
			memoryCacheSize = i;
		//   14   31:aload_0         
		//   15   32:iload_1         
		//   16   33:putfield        #103 <Field int memoryCacheSize>
			return this;
		//   17   36:aload_0         
		//   18   37:areturn         
		}

		public Builder memoryCacheSizePercentage(int i)
		{
			if(i > 0 && i < 100)
		//*   0    0:iload_1         
		//*   1    1:ifle            50
		//*   2    4:iload_1         
		//*   3    5:bipush          100
		//*   4    7:icmplt          13
		//*   5   10:goto            50
			{
				if(memoryCache != null)
		//*   6   13:aload_0         
		//*   7   14:getfield        #109 <Field MemoryCache memoryCache>
		//*   8   17:ifnull          29
					L.w("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
		//    9   20:ldc1            #26  <String "memoryCache() and memoryCacheSize() calls overlap each other">
		//   10   22:iconst_0        
		//   11   23:anewarray       Object[]
		//   12   26:invokestatic    #240 <Method void L.w(String, Object[])>
				memoryCacheSize = (int)((float)Runtime.getRuntime().maxMemory() * ((float)i / 100F));
		//   13   29:aload_0         
		//   14   30:invokestatic    #265 <Method Runtime Runtime.getRuntime()>
		//   15   33:invokevirtual   #269 <Method long Runtime.maxMemory()>
		//   16   36:l2f             
		//   17   37:iload_1         
		//   18   38:i2f             
		//   19   39:ldc2            #270 <Float 100F>
		//   20   42:fdiv            
		//   21   43:fmul            
		//   22   44:f2i             
		//   23   45:putfield        #103 <Field int memoryCacheSize>
				return this;
		//   24   48:aload_0         
		//   25   49:areturn         
			} else
			{
				throw new IllegalArgumentException("availableMemoryPercent must be in range (0 < % < 100)");
		//   26   50:new             #242 <Class IllegalArgumentException>
		//   27   53:dup             
		//   28   54:ldc2            #272 <String "availableMemoryPercent must be in range (0 < % < 100)">
		//   29   57:invokespecial   #247 <Method void IllegalArgumentException(String)>
		//   30   60:athrow          
			}
		}

		public Builder taskExecutor(Executor executor)
		{
			if(threadPoolSize != 3 || threadPriority != 3 || tasksProcessingType != DEFAULT_TASK_PROCESSING_TYPE)
		//*   0    0:aload_0         
		//*   1    1:getfield        #95  <Field int threadPoolSize>
		//*   2    4:iconst_3        
		//*   3    5:icmpne          26
		//*   4    8:aload_0         
		//*   5    9:getfield        #97  <Field int threadPriority>
		//*   6   12:iconst_3        
		//*   7   13:icmpne          26
		//*   8   16:aload_0         
		//*   9   17:getfield        #101 <Field QueueProcessingType tasksProcessingType>
		//*  10   20:getstatic       #70  <Field QueueProcessingType DEFAULT_TASK_PROCESSING_TYPE>
		//*  11   23:if_acmpeq       35
				L.w("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
		//   12   26:ldc1            #23  <String "threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.">
		//   13   28:iconst_0        
		//   14   29:anewarray       Object[]
		//   15   32:invokestatic    #240 <Method void L.w(String, Object[])>
			taskExecutor = executor;
		//   16   35:aload_0         
		//   17   36:aload_1         
		//   18   37:putfield        #87  <Field Executor taskExecutor>
			return this;
		//   19   40:aload_0         
		//   20   41:areturn         
		}

		public Builder taskExecutorForCachedImages(Executor executor)
		{
			if(threadPoolSize != 3 || threadPriority != 3 || tasksProcessingType != DEFAULT_TASK_PROCESSING_TYPE)
		//*   0    0:aload_0         
		//*   1    1:getfield        #95  <Field int threadPoolSize>
		//*   2    4:iconst_3        
		//*   3    5:icmpne          26
		//*   4    8:aload_0         
		//*   5    9:getfield        #97  <Field int threadPriority>
		//*   6   12:iconst_3        
		//*   7   13:icmpne          26
		//*   8   16:aload_0         
		//*   9   17:getfield        #101 <Field QueueProcessingType tasksProcessingType>
		//*  10   20:getstatic       #70  <Field QueueProcessingType DEFAULT_TASK_PROCESSING_TYPE>
		//*  11   23:if_acmpeq       35
				L.w("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
		//   12   26:ldc1            #23  <String "threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.">
		//   13   28:iconst_0        
		//   14   29:anewarray       Object[]
		//   15   32:invokestatic    #240 <Method void L.w(String, Object[])>
			taskExecutorForCachedImages = executor;
		//   16   35:aload_0         
		//   17   36:aload_1         
		//   18   37:putfield        #89  <Field Executor taskExecutorForCachedImages>
			return this;
		//   19   40:aload_0         
		//   20   41:areturn         
		}

		public Builder tasksProcessingOrder(QueueProcessingType queueprocessingtype)
		{
			if(taskExecutor != null || taskExecutorForCachedImages != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #87  <Field Executor taskExecutor>
		//*   2    4:ifnonnull       14
		//*   3    7:aload_0         
		//*   4    8:getfield        #89  <Field Executor taskExecutorForCachedImages>
		//*   5   11:ifnull          23
				L.w("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
		//    6   14:ldc1            #23  <String "threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.">
		//    7   16:iconst_0        
		//    8   17:anewarray       Object[]
		//    9   20:invokestatic    #240 <Method void L.w(String, Object[])>
			tasksProcessingType = queueprocessingtype;
		//   10   23:aload_0         
		//   11   24:aload_1         
		//   12   25:putfield        #101 <Field QueueProcessingType tasksProcessingType>
			return this;
		//   13   28:aload_0         
		//   14   29:areturn         
		}

		public Builder threadPoolSize(int i)
		{
			if(taskExecutor != null || taskExecutorForCachedImages != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #87  <Field Executor taskExecutor>
		//*   2    4:ifnonnull       14
		//*   3    7:aload_0         
		//*   4    8:getfield        #89  <Field Executor taskExecutorForCachedImages>
		//*   5   11:ifnull          23
				L.w("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
		//    6   14:ldc1            #23  <String "threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.">
		//    7   16:iconst_0        
		//    8   17:anewarray       Object[]
		//    9   20:invokestatic    #240 <Method void L.w(String, Object[])>
			threadPoolSize = i;
		//   10   23:aload_0         
		//   11   24:iload_1         
		//   12   25:putfield        #95  <Field int threadPoolSize>
			return this;
		//   13   28:aload_0         
		//   14   29:areturn         
		}

		public Builder threadPriority(int i)
		{
			if(taskExecutor != null || taskExecutorForCachedImages != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #87  <Field Executor taskExecutor>
		//*   2    4:ifnonnull       14
		//*   3    7:aload_0         
		//*   4    8:getfield        #89  <Field Executor taskExecutorForCachedImages>
		//*   5   11:ifnull          23
				L.w("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
		//    6   14:ldc1            #23  <String "threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.">
		//    7   16:iconst_0        
		//    8   17:anewarray       Object[]
		//    9   20:invokestatic    #240 <Method void L.w(String, Object[])>
			if(i < 1)
		//*  10   23:iload_1         
		//*  11   24:iconst_1        
		//*  12   25:icmpge          35
			{
				threadPriority = 1;
		//   13   28:aload_0         
		//   14   29:iconst_1        
		//   15   30:putfield        #97  <Field int threadPriority>
				return this;
		//   16   33:aload_0         
		//   17   34:areturn         
			}
			if(i > 10)
		//*  18   35:iload_1         
		//*  19   36:bipush          10
		//*  20   38:icmple          49
			{
				threadPriority = 10;
		//   21   41:aload_0         
		//   22   42:bipush          10
		//   23   44:putfield        #97  <Field int threadPriority>
				return this;
		//   24   47:aload_0         
		//   25   48:areturn         
			} else
			{
				threadPriority = i;
		//   26   49:aload_0         
		//   27   50:iload_1         
		//   28   51:putfield        #97  <Field int threadPriority>
				return this;
		//   29   54:aload_0         
		//   30   55:areturn         
			}
		}

		public Builder writeDebugLogs()
		{
			writeLogs = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #119 <Field boolean writeLogs>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public static final QueueProcessingType DEFAULT_TASK_PROCESSING_TYPE;
		public static final int DEFAULT_THREAD_POOL_SIZE = 3;
		public static final int DEFAULT_THREAD_PRIORITY = 3;
		private static final String WARNING_OVERLAP_DISK_CACHE_NAME_GENERATOR = "diskCache() and diskCacheFileNameGenerator() calls overlap each other";
		private static final String WARNING_OVERLAP_DISK_CACHE_PARAMS = "diskCache(), diskCacheSize() and diskCacheFileCount calls overlap each other";
		private static final String WARNING_OVERLAP_EXECUTOR = "threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.";
		private static final String WARNING_OVERLAP_MEMORY_CACHE = "memoryCache() and memoryCacheSize() calls overlap each other";
		private Context context;
		private boolean customExecutor;
		private boolean customExecutorForCachedImages;
		private ImageDecoder decoder;
		private DisplayImageOptions defaultDisplayImageOptions;
		private boolean denyCacheImageMultipleSizesInMemory;
		private DiskCache diskCache;
		private int diskCacheFileCount;
		private FileNameGenerator diskCacheFileNameGenerator;
		private long diskCacheSize;
		private ImageDownloader downloader;
		private int maxImageHeightForDiskCache;
		private int maxImageHeightForMemoryCache;
		private int maxImageWidthForDiskCache;
		private int maxImageWidthForMemoryCache;
		private MemoryCache memoryCache;
		private int memoryCacheSize;
		private BitmapProcessor processorForDiskCache;
		private Executor taskExecutor;
		private Executor taskExecutorForCachedImages;
		private QueueProcessingType tasksProcessingType;
		private int threadPoolSize;
		private int threadPriority;
		private boolean writeLogs;

		static 
		{
			DEFAULT_TASK_PROCESSING_TYPE = QueueProcessingType.FIFO;
		//    0    0:getstatic       #68  <Field QueueProcessingType QueueProcessingType.FIFO>
		//    1    3:putstatic       #70  <Field QueueProcessingType DEFAULT_TASK_PROCESSING_TYPE>
		//*   2    6:return          
		}


/*
		static Context access$000(Builder builder)
		{
			return builder.context;
		//    0    0:aload_0         
		//    1    1:getfield        #127 <Field Context context>
		//    2    4:areturn         
		}

*/


/*
		static int access$100(Builder builder)
		{
			return builder.maxImageWidthForMemoryCache;
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field int maxImageWidthForMemoryCache>
		//    2    4:ireturn         
		}

*/


/*
		static QueueProcessingType access$1000(Builder builder)
		{
			return builder.tasksProcessingType;
		//    0    0:aload_0         
		//    1    1:getfield        #101 <Field QueueProcessingType tasksProcessingType>
		//    2    4:areturn         
		}

*/


/*
		static DiskCache access$1100(Builder builder)
		{
			return builder.diskCache;
		//    0    0:aload_0         
		//    1    1:getfield        #111 <Field DiskCache diskCache>
		//    2    4:areturn         
		}

*/


/*
		static MemoryCache access$1200(Builder builder)
		{
			return builder.memoryCache;
		//    0    0:aload_0         
		//    1    1:getfield        #109 <Field MemoryCache memoryCache>
		//    2    4:areturn         
		}

*/


/*
		static DisplayImageOptions access$1300(Builder builder)
		{
			return builder.defaultDisplayImageOptions;
		//    0    0:aload_0         
		//    1    1:getfield        #117 <Field DisplayImageOptions defaultDisplayImageOptions>
		//    2    4:areturn         
		}

*/


/*
		static ImageDownloader access$1400(Builder builder)
		{
			return builder.downloader;
		//    0    0:aload_0         
		//    1    1:getfield        #115 <Field ImageDownloader downloader>
		//    2    4:areturn         
		}

*/


/*
		static ImageDecoder access$1500(Builder builder)
		{
			return builder.decoder;
		//    0    0:aload_0         
		//    1    1:getfield        #145 <Field ImageDecoder decoder>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$1600(Builder builder)
		{
			return builder.customExecutor;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field boolean customExecutor>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$1700(Builder builder)
		{
			return builder.customExecutorForCachedImages;
		//    0    0:aload_0         
		//    1    1:getfield        #93  <Field boolean customExecutorForCachedImages>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$1800(Builder builder)
		{
			return builder.writeLogs;
		//    0    0:aload_0         
		//    1    1:getfield        #119 <Field boolean writeLogs>
		//    2    4:ireturn         
		}

*/


/*
		static int access$200(Builder builder)
		{
			return builder.maxImageHeightForMemoryCache;
		//    0    0:aload_0         
		//    1    1:getfield        #79  <Field int maxImageHeightForMemoryCache>
		//    2    4:ireturn         
		}

*/


/*
		static int access$300(Builder builder)
		{
			return builder.maxImageWidthForDiskCache;
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field int maxImageWidthForDiskCache>
		//    2    4:ireturn         
		}

*/


/*
		static int access$400(Builder builder)
		{
			return builder.maxImageHeightForDiskCache;
		//    0    0:aload_0         
		//    1    1:getfield        #83  <Field int maxImageHeightForDiskCache>
		//    2    4:ireturn         
		}

*/


/*
		static BitmapProcessor access$500(Builder builder)
		{
			return builder.processorForDiskCache;
		//    0    0:aload_0         
		//    1    1:getfield        #85  <Field BitmapProcessor processorForDiskCache>
		//    2    4:areturn         
		}

*/


/*
		static Executor access$600(Builder builder)
		{
			return builder.taskExecutor;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field Executor taskExecutor>
		//    2    4:areturn         
		}

*/


/*
		static Executor access$700(Builder builder)
		{
			return builder.taskExecutorForCachedImages;
		//    0    0:aload_0         
		//    1    1:getfield        #89  <Field Executor taskExecutorForCachedImages>
		//    2    4:areturn         
		}

*/


/*
		static int access$800(Builder builder)
		{
			return builder.threadPoolSize;
		//    0    0:aload_0         
		//    1    1:getfield        #95  <Field int threadPoolSize>
		//    2    4:ireturn         
		}

*/


/*
		static int access$900(Builder builder)
		{
			return builder.threadPriority;
		//    0    0:aload_0         
		//    1    1:getfield        #97  <Field int threadPriority>
		//    2    4:ireturn         
		}

*/

		public Builder(Context context1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #75  <Method void Object()>
			maxImageWidthForMemoryCache = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #77  <Field int maxImageWidthForMemoryCache>
			maxImageHeightForMemoryCache = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #79  <Field int maxImageHeightForMemoryCache>
			maxImageWidthForDiskCache = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #81  <Field int maxImageWidthForDiskCache>
			maxImageHeightForDiskCache = 0;
		//   11   19:aload_0         
		//   12   20:iconst_0        
		//   13   21:putfield        #83  <Field int maxImageHeightForDiskCache>
			processorForDiskCache = null;
		//   14   24:aload_0         
		//   15   25:aconst_null     
		//   16   26:putfield        #85  <Field BitmapProcessor processorForDiskCache>
			taskExecutor = null;
		//   17   29:aload_0         
		//   18   30:aconst_null     
		//   19   31:putfield        #87  <Field Executor taskExecutor>
			taskExecutorForCachedImages = null;
		//   20   34:aload_0         
		//   21   35:aconst_null     
		//   22   36:putfield        #89  <Field Executor taskExecutorForCachedImages>
			customExecutor = false;
		//   23   39:aload_0         
		//   24   40:iconst_0        
		//   25   41:putfield        #91  <Field boolean customExecutor>
			customExecutorForCachedImages = false;
		//   26   44:aload_0         
		//   27   45:iconst_0        
		//   28   46:putfield        #93  <Field boolean customExecutorForCachedImages>
			threadPoolSize = 3;
		//   29   49:aload_0         
		//   30   50:iconst_3        
		//   31   51:putfield        #95  <Field int threadPoolSize>
			threadPriority = 3;
		//   32   54:aload_0         
		//   33   55:iconst_3        
		//   34   56:putfield        #97  <Field int threadPriority>
			denyCacheImageMultipleSizesInMemory = false;
		//   35   59:aload_0         
		//   36   60:iconst_0        
		//   37   61:putfield        #99  <Field boolean denyCacheImageMultipleSizesInMemory>
			tasksProcessingType = DEFAULT_TASK_PROCESSING_TYPE;
		//   38   64:aload_0         
		//   39   65:getstatic       #70  <Field QueueProcessingType DEFAULT_TASK_PROCESSING_TYPE>
		//   40   68:putfield        #101 <Field QueueProcessingType tasksProcessingType>
			memoryCacheSize = 0;
		//   41   71:aload_0         
		//   42   72:iconst_0        
		//   43   73:putfield        #103 <Field int memoryCacheSize>
			diskCacheSize = 0L;
		//   44   76:aload_0         
		//   45   77:lconst_0        
		//   46   78:putfield        #105 <Field long diskCacheSize>
			diskCacheFileCount = 0;
		//   47   81:aload_0         
		//   48   82:iconst_0        
		//   49   83:putfield        #107 <Field int diskCacheFileCount>
			memoryCache = null;
		//   50   86:aload_0         
		//   51   87:aconst_null     
		//   52   88:putfield        #109 <Field MemoryCache memoryCache>
			diskCache = null;
		//   53   91:aload_0         
		//   54   92:aconst_null     
		//   55   93:putfield        #111 <Field DiskCache diskCache>
			diskCacheFileNameGenerator = null;
		//   56   96:aload_0         
		//   57   97:aconst_null     
		//   58   98:putfield        #113 <Field FileNameGenerator diskCacheFileNameGenerator>
			downloader = null;
		//   59  101:aload_0         
		//   60  102:aconst_null     
		//   61  103:putfield        #115 <Field ImageDownloader downloader>
			defaultDisplayImageOptions = null;
		//   62  106:aload_0         
		//   63  107:aconst_null     
		//   64  108:putfield        #117 <Field DisplayImageOptions defaultDisplayImageOptions>
			writeLogs = false;
		//   65  111:aload_0         
		//   66  112:iconst_0        
		//   67  113:putfield        #119 <Field boolean writeLogs>
			context = context1.getApplicationContext();
		//   68  116:aload_0         
		//   69  117:aload_1         
		//   70  118:invokevirtual   #125 <Method Context Context.getApplicationContext()>
		//   71  121:putfield        #127 <Field Context context>
		//   72  124:return          
		}
	}


	private ImageLoaderConfiguration(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		resources = builder.context.getResources();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #51  <Method Context ImageLoaderConfiguration$Builder.access$000(ImageLoaderConfiguration$Builder)>
	//    5    9:invokevirtual   #57  <Method Resources Context.getResources()>
	//    6   12:putfield        #59  <Field Resources resources>
		maxImageWidthForMemoryCache = builder.maxImageWidthForMemoryCache;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #63  <Method int ImageLoaderConfiguration$Builder.access$100(ImageLoaderConfiguration$Builder)>
	//   10   20:putfield        #65  <Field int maxImageWidthForMemoryCache>
		maxImageHeightForMemoryCache = builder.maxImageHeightForMemoryCache;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokestatic    #68  <Method int ImageLoaderConfiguration$Builder.access$200(ImageLoaderConfiguration$Builder)>
	//   14   28:putfield        #70  <Field int maxImageHeightForMemoryCache>
		maxImageWidthForDiskCache = builder.maxImageWidthForDiskCache;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokestatic    #73  <Method int ImageLoaderConfiguration$Builder.access$300(ImageLoaderConfiguration$Builder)>
	//   18   36:putfield        #75  <Field int maxImageWidthForDiskCache>
		maxImageHeightForDiskCache = builder.maxImageHeightForDiskCache;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokestatic    #78  <Method int ImageLoaderConfiguration$Builder.access$400(ImageLoaderConfiguration$Builder)>
	//   22   44:putfield        #80  <Field int maxImageHeightForDiskCache>
		processorForDiskCache = builder.processorForDiskCache;
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokestatic    #84  <Method BitmapProcessor ImageLoaderConfiguration$Builder.access$500(ImageLoaderConfiguration$Builder)>
	//   26   52:putfield        #86  <Field BitmapProcessor processorForDiskCache>
		taskExecutor = builder.taskExecutor;
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokestatic    #90  <Method Executor ImageLoaderConfiguration$Builder.access$600(ImageLoaderConfiguration$Builder)>
	//   30   60:putfield        #92  <Field Executor taskExecutor>
		taskExecutorForCachedImages = builder.taskExecutorForCachedImages;
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:invokestatic    #95  <Method Executor ImageLoaderConfiguration$Builder.access$700(ImageLoaderConfiguration$Builder)>
	//   34   68:putfield        #97  <Field Executor taskExecutorForCachedImages>
		threadPoolSize = builder.threadPoolSize;
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:invokestatic    #100 <Method int ImageLoaderConfiguration$Builder.access$800(ImageLoaderConfiguration$Builder)>
	//   38   76:putfield        #102 <Field int threadPoolSize>
		threadPriority = builder.threadPriority;
	//   39   79:aload_0         
	//   40   80:aload_1         
	//   41   81:invokestatic    #105 <Method int ImageLoaderConfiguration$Builder.access$900(ImageLoaderConfiguration$Builder)>
	//   42   84:putfield        #107 <Field int threadPriority>
		tasksProcessingType = builder.tasksProcessingType;
	//   43   87:aload_0         
	//   44   88:aload_1         
	//   45   89:invokestatic    #111 <Method QueueProcessingType ImageLoaderConfiguration$Builder.access$1000(ImageLoaderConfiguration$Builder)>
	//   46   92:putfield        #113 <Field QueueProcessingType tasksProcessingType>
		diskCache = builder.diskCache;
	//   47   95:aload_0         
	//   48   96:aload_1         
	//   49   97:invokestatic    #117 <Method DiskCache ImageLoaderConfiguration$Builder.access$1100(ImageLoaderConfiguration$Builder)>
	//   50  100:putfield        #119 <Field DiskCache diskCache>
		memoryCache = builder.memoryCache;
	//   51  103:aload_0         
	//   52  104:aload_1         
	//   53  105:invokestatic    #123 <Method MemoryCache ImageLoaderConfiguration$Builder.access$1200(ImageLoaderConfiguration$Builder)>
	//   54  108:putfield        #125 <Field MemoryCache memoryCache>
		defaultDisplayImageOptions = builder.defaultDisplayImageOptions;
	//   55  111:aload_0         
	//   56  112:aload_1         
	//   57  113:invokestatic    #129 <Method DisplayImageOptions ImageLoaderConfiguration$Builder.access$1300(ImageLoaderConfiguration$Builder)>
	//   58  116:putfield        #131 <Field DisplayImageOptions defaultDisplayImageOptions>
		downloader = builder.downloader;
	//   59  119:aload_0         
	//   60  120:aload_1         
	//   61  121:invokestatic    #135 <Method ImageDownloader ImageLoaderConfiguration$Builder.access$1400(ImageLoaderConfiguration$Builder)>
	//   62  124:putfield        #137 <Field ImageDownloader downloader>
		decoder = builder.decoder;
	//   63  127:aload_0         
	//   64  128:aload_1         
	//   65  129:invokestatic    #141 <Method ImageDecoder ImageLoaderConfiguration$Builder.access$1500(ImageLoaderConfiguration$Builder)>
	//   66  132:putfield        #143 <Field ImageDecoder decoder>
		customExecutor = builder.customExecutor;
	//   67  135:aload_0         
	//   68  136:aload_1         
	//   69  137:invokestatic    #147 <Method boolean ImageLoaderConfiguration$Builder.access$1600(ImageLoaderConfiguration$Builder)>
	//   70  140:putfield        #149 <Field boolean customExecutor>
		customExecutorForCachedImages = builder.customExecutorForCachedImages;
	//   71  143:aload_0         
	//   72  144:aload_1         
	//   73  145:invokestatic    #152 <Method boolean ImageLoaderConfiguration$Builder.access$1700(ImageLoaderConfiguration$Builder)>
	//   74  148:putfield        #154 <Field boolean customExecutorForCachedImages>
	/* block-local class not found */
	class NetworkDeniedImageDownloader {}

		networkDeniedDownloader = ((ImageDownloader) (new NetworkDeniedImageDownloader(downloader)));
	//   75  151:aload_0         
	//   76  152:new             #9   <Class ImageLoaderConfiguration$NetworkDeniedImageDownloader>
	//   77  155:dup             
	//   78  156:aload_0         
	//   79  157:getfield        #137 <Field ImageDownloader downloader>
	//   80  160:invokespecial   #157 <Method void ImageLoaderConfiguration$NetworkDeniedImageDownloader(ImageDownloader)>
	//   81  163:putfield        #159 <Field ImageDownloader networkDeniedDownloader>
	/* block-local class not found */
	class SlowNetworkImageDownloader {}

		slowNetworkDownloader = ((ImageDownloader) (new SlowNetworkImageDownloader(downloader)));
	//   82  166:aload_0         
	//   83  167:new             #11  <Class ImageLoaderConfiguration$SlowNetworkImageDownloader>
	//   84  170:dup             
	//   85  171:aload_0         
	//   86  172:getfield        #137 <Field ImageDownloader downloader>
	//   87  175:invokespecial   #160 <Method void ImageLoaderConfiguration$SlowNetworkImageDownloader(ImageDownloader)>
	//   88  178:putfield        #162 <Field ImageDownloader slowNetworkDownloader>
		L.writeDebugLogs(builder.writeLogs);
	//   89  181:aload_1         
	//   90  182:invokestatic    #165 <Method boolean ImageLoaderConfiguration$Builder.access$1800(ImageLoaderConfiguration$Builder)>
	//   91  185:invokestatic    #171 <Method void L.writeDebugLogs(boolean)>
	//   92  188:return          
	}

	ImageLoaderConfiguration(Builder builder, _cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #175 <Method void ImageLoaderConfiguration(ImageLoaderConfiguration$Builder)>
	//    3    5:return          
	}

	public static ImageLoaderConfiguration createDefault(Context context)
	{
		return (new Builder(context)).build();
	//    0    0:new             #6   <Class ImageLoaderConfiguration$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #180 <Method void ImageLoaderConfiguration$Builder(Context)>
	//    4    8:invokevirtual   #184 <Method ImageLoaderConfiguration ImageLoaderConfiguration$Builder.build()>
	//    5   11:areturn         
	}

	ImageSize getMaxImageSize()
	{
		DisplayMetrics displaymetrics = resources.getDisplayMetrics();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Resources resources>
	//    2    4:invokevirtual   #192 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    7:astore          4
		int j = maxImageWidthForMemoryCache;
	//    4    9:aload_0         
	//    5   10:getfield        #65  <Field int maxImageWidthForMemoryCache>
	//    6   13:istore_2        
		int i = j;
	//    7   14:iload_2         
	//    8   15:istore_1        
		if(j <= 0)
	//*   9   16:iload_2         
	//*  10   17:ifgt            26
			i = displaymetrics.widthPixels;
	//   11   20:aload           4
	//   12   22:getfield        #197 <Field int DisplayMetrics.widthPixels>
	//   13   25:istore_1        
		int k = maxImageHeightForMemoryCache;
	//   14   26:aload_0         
	//   15   27:getfield        #70  <Field int maxImageHeightForMemoryCache>
	//   16   30:istore_3        
		j = k;
	//   17   31:iload_3         
	//   18   32:istore_2        
		if(k <= 0)
	//*  19   33:iload_3         
	//*  20   34:ifgt            43
			j = displaymetrics.heightPixels;
	//   21   37:aload           4
	//   22   39:getfield        #200 <Field int DisplayMetrics.heightPixels>
	//   23   42:istore_2        
		return new ImageSize(i, j);
	//   24   43:new             #202 <Class ImageSize>
	//   25   46:dup             
	//   26   47:iload_1         
	//   27   48:iload_2         
	//   28   49:invokespecial   #205 <Method void ImageSize(int, int)>
	//   29   52:areturn         
	}

	final boolean customExecutor;
	final boolean customExecutorForCachedImages;
	final ImageDecoder decoder;
	final DisplayImageOptions defaultDisplayImageOptions;
	final DiskCache diskCache;
	final ImageDownloader downloader;
	final int maxImageHeightForDiskCache;
	final int maxImageHeightForMemoryCache;
	final int maxImageWidthForDiskCache;
	final int maxImageWidthForMemoryCache;
	final MemoryCache memoryCache;
	final ImageDownloader networkDeniedDownloader;
	final BitmapProcessor processorForDiskCache;
	final Resources resources;
	final ImageDownloader slowNetworkDownloader;
	final Executor taskExecutor;
	final Executor taskExecutorForCachedImages;
	final QueueProcessingType tasksProcessingType;
	final int threadPoolSize;
	final int threadPriority;
}