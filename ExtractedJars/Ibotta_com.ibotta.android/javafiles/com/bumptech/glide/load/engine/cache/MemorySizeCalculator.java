// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class MemorySizeCalculator
{
	public static final class Builder
	{

		public MemorySizeCalculator build()
		{
			return new MemorySizeCalculator(this);
		//    0    0:new             #6   <Class MemorySizeCalculator>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #88  <Method void MemorySizeCalculator(MemorySizeCalculator$Builder)>
		//    4    8:areturn         
		}

		static final int BITMAP_POOL_TARGET_SCREENS;
		ActivityManager activityManager;
		int arrayPoolSizeBytes;
		float bitmapPoolScreens;
		final Context context;
		float lowMemoryMaxSizeMultiplier;
		float maxSizeMultiplier;
		float memoryCacheScreens;
		ScreenDimensions screenDimensions;

		static 
		{
			int i;
			if(android.os.Build.VERSION.SDK_INT < 26)
		//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          26
		//*   2    5:icmpge          13
				i = 4;
		//    3    8:iconst_4        
		//    4    9:istore_0        
			else
		//*   5   10:goto            15
				i = 1;
		//    6   13:iconst_1        
		//    7   14:istore_0        
			BITMAP_POOL_TARGET_SCREENS = i;
		//    8   15:iload_0         
		//    9   16:putstatic       #30  <Field int BITMAP_POOL_TARGET_SCREENS>
		//*  10   19:return          
		}

		public Builder(Context context1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
			memoryCacheScreens = 2.0F;
		//    2    4:aload_0         
		//    3    5:fconst_2        
		//    4    6:putfield        #37  <Field float memoryCacheScreens>
			bitmapPoolScreens = BITMAP_POOL_TARGET_SCREENS;
		//    5    9:aload_0         
		//    6   10:getstatic       #30  <Field int BITMAP_POOL_TARGET_SCREENS>
		//    7   13:i2f             
		//    8   14:putfield        #39  <Field float bitmapPoolScreens>
			maxSizeMultiplier = 0.4F;
		//    9   17:aload_0         
		//   10   18:ldc1            #40  <Float 0.4F>
		//   11   20:putfield        #42  <Field float maxSizeMultiplier>
			lowMemoryMaxSizeMultiplier = 0.33F;
		//   12   23:aload_0         
		//   13   24:ldc1            #43  <Float 0.33F>
		//   14   26:putfield        #45  <Field float lowMemoryMaxSizeMultiplier>
			arrayPoolSizeBytes = 0x400000;
		//   15   29:aload_0         
		//   16   30:ldc1            #46  <Int 0x400000>
		//   17   32:putfield        #48  <Field int arrayPoolSizeBytes>
			context = context1;
		//   18   35:aload_0         
		//   19   36:aload_1         
		//   20   37:putfield        #50  <Field Context context>
			activityManager = (ActivityManager)context1.getSystemService("activity");
		//   21   40:aload_0         
		//   22   41:aload_1         
		//   23   42:ldc1            #52  <String "activity">
		//   24   44:invokevirtual   #58  <Method Object Context.getSystemService(String)>
		//   25   47:checkcast       #60  <Class ActivityManager>
		//   26   50:putfield        #62  <Field ActivityManager activityManager>
			screenDimensions = ((ScreenDimensions) (new DisplayMetricsScreenDimensions(context1.getResources().getDisplayMetrics())));
		//   27   53:aload_0         
		//   28   54:new             #64  <Class MemorySizeCalculator$DisplayMetricsScreenDimensions>
		//   29   57:dup             
		//   30   58:aload_1         
		//   31   59:invokevirtual   #68  <Method Resources Context.getResources()>
		//   32   62:invokevirtual   #74  <Method DisplayMetrics Resources.getDisplayMetrics()>
		//   33   65:invokespecial   #77  <Method void MemorySizeCalculator$DisplayMetricsScreenDimensions(DisplayMetrics)>
		//   34   68:putfield        #79  <Field MemorySizeCalculator$ScreenDimensions screenDimensions>
			if(android.os.Build.VERSION.SDK_INT >= 26 && MemorySizeCalculator.isLowMemoryDevice(activityManager))
		//*  35   71:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
		//*  36   74:bipush          26
		//*  37   76:icmplt          94
		//*  38   79:aload_0         
		//*  39   80:getfield        #62  <Field ActivityManager activityManager>
		//*  40   83:invokestatic    #83  <Method boolean MemorySizeCalculator.isLowMemoryDevice(ActivityManager)>
		//*  41   86:ifeq            94
				bitmapPoolScreens = 0.0F;
		//   42   89:aload_0         
		//   43   90:fconst_0        
		//   44   91:putfield        #39  <Field float bitmapPoolScreens>
		//   45   94:return          
		}
	}

	private static final class DisplayMetricsScreenDimensions
		implements ScreenDimensions
	{

		public int getHeightPixels()
		{
			return displayMetrics.heightPixels;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field DisplayMetrics displayMetrics>
		//    2    4:getfield        #27  <Field int DisplayMetrics.heightPixels>
		//    3    7:ireturn         
		}

		public int getWidthPixels()
		{
			return displayMetrics.widthPixels;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field DisplayMetrics displayMetrics>
		//    2    4:getfield        #31  <Field int DisplayMetrics.widthPixels>
		//    3    7:ireturn         
		}

		private final DisplayMetrics displayMetrics;

		DisplayMetricsScreenDimensions(DisplayMetrics displaymetrics)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			displayMetrics = displaymetrics;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field DisplayMetrics displayMetrics>
		//    5    9:return          
		}
	}

	static interface ScreenDimensions
	{

		public abstract int getHeightPixels();

		public abstract int getWidthPixels();
	}


	MemorySizeCalculator(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		context = builder.context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #26  <Field Context MemorySizeCalculator$Builder.context>
	//    5    9:putfield        #27  <Field Context context>
		int i;
		if(isLowMemoryDevice(builder.activityManager))
	//*   6   12:aload_1         
	//*   7   13:getfield        #31  <Field ActivityManager MemorySizeCalculator$Builder.activityManager>
	//*   8   16:invokestatic    #35  <Method boolean isLowMemoryDevice(ActivityManager)>
	//*   9   19:ifeq            32
			i = builder.arrayPoolSizeBytes / 2;
	//   10   22:aload_1         
	//   11   23:getfield        #38  <Field int MemorySizeCalculator$Builder.arrayPoolSizeBytes>
	//   12   26:iconst_2        
	//   13   27:idiv            
	//   14   28:istore_3        
		else
	//*  15   29:goto            37
			i = builder.arrayPoolSizeBytes;
	//   16   32:aload_1         
	//   17   33:getfield        #38  <Field int MemorySizeCalculator$Builder.arrayPoolSizeBytes>
	//   18   36:istore_3        
		arrayPoolSize = i;
	//   19   37:aload_0         
	//   20   38:iload_3         
	//   21   39:putfield        #40  <Field int arrayPoolSize>
		i = getMaxSize(builder.activityManager, builder.maxSizeMultiplier, builder.lowMemoryMaxSizeMultiplier);
	//   22   42:aload_1         
	//   23   43:getfield        #31  <Field ActivityManager MemorySizeCalculator$Builder.activityManager>
	//   24   46:aload_1         
	//   25   47:getfield        #44  <Field float MemorySizeCalculator$Builder.maxSizeMultiplier>
	//   26   50:aload_1         
	//   27   51:getfield        #47  <Field float MemorySizeCalculator$Builder.lowMemoryMaxSizeMultiplier>
	//   28   54:invokestatic    #51  <Method int getMaxSize(ActivityManager, float, float)>
	//   29   57:istore_3        
		float f = builder.screenDimensions.getWidthPixels() * builder.screenDimensions.getHeightPixels() * 4;
	//   30   58:aload_1         
	//   31   59:getfield        #55  <Field MemorySizeCalculator$ScreenDimensions MemorySizeCalculator$Builder.screenDimensions>
	//   32   62:invokeinterface #59  <Method int MemorySizeCalculator$ScreenDimensions.getWidthPixels()>
	//   33   67:aload_1         
	//   34   68:getfield        #55  <Field MemorySizeCalculator$ScreenDimensions MemorySizeCalculator$Builder.screenDimensions>
	//   35   71:invokeinterface #62  <Method int MemorySizeCalculator$ScreenDimensions.getHeightPixels()>
	//   36   76:imul            
	//   37   77:iconst_4        
	//   38   78:imul            
	//   39   79:i2f             
	//   40   80:fstore_2        
		int j = Math.round(builder.bitmapPoolScreens * f);
	//   41   81:aload_1         
	//   42   82:getfield        #65  <Field float MemorySizeCalculator$Builder.bitmapPoolScreens>
	//   43   85:fload_2         
	//   44   86:fmul            
	//   45   87:invokestatic    #71  <Method int Math.round(float)>
	//   46   90:istore          4
		int k = Math.round(f * builder.memoryCacheScreens);
	//   47   92:fload_2         
	//   48   93:aload_1         
	//   49   94:getfield        #74  <Field float MemorySizeCalculator$Builder.memoryCacheScreens>
	//   50   97:fmul            
	//   51   98:invokestatic    #71  <Method int Math.round(float)>
	//   52  101:istore          5
		int l = i - arrayPoolSize;
	//   53  103:iload_3         
	//   54  104:aload_0         
	//   55  105:getfield        #40  <Field int arrayPoolSize>
	//   56  108:isub            
	//   57  109:istore          6
		int i1 = k + j;
	//   58  111:iload           5
	//   59  113:iload           4
	//   60  115:iadd            
	//   61  116:istore          7
		if(i1 <= l)
	//*  62  118:iload           7
	//*  63  120:iload           6
	//*  64  122:icmpgt          140
		{
			memoryCacheSize = k;
	//   65  125:aload_0         
	//   66  126:iload           5
	//   67  128:putfield        #76  <Field int memoryCacheSize>
			bitmapPoolSize = j;
	//   68  131:aload_0         
	//   69  132:iload           4
	//   70  134:putfield        #78  <Field int bitmapPoolSize>
		} else
	//*  71  137:goto            180
		{
			float f1 = (float)l / (builder.bitmapPoolScreens + builder.memoryCacheScreens);
	//   72  140:iload           6
	//   73  142:i2f             
	//   74  143:aload_1         
	//   75  144:getfield        #65  <Field float MemorySizeCalculator$Builder.bitmapPoolScreens>
	//   76  147:aload_1         
	//   77  148:getfield        #74  <Field float MemorySizeCalculator$Builder.memoryCacheScreens>
	//   78  151:fadd            
	//   79  152:fdiv            
	//   80  153:fstore_2        
			memoryCacheSize = Math.round(builder.memoryCacheScreens * f1);
	//   81  154:aload_0         
	//   82  155:aload_1         
	//   83  156:getfield        #74  <Field float MemorySizeCalculator$Builder.memoryCacheScreens>
	//   84  159:fload_2         
	//   85  160:fmul            
	//   86  161:invokestatic    #71  <Method int Math.round(float)>
	//   87  164:putfield        #76  <Field int memoryCacheSize>
			bitmapPoolSize = Math.round(f1 * builder.bitmapPoolScreens);
	//   88  167:aload_0         
	//   89  168:fload_2         
	//   90  169:aload_1         
	//   91  170:getfield        #65  <Field float MemorySizeCalculator$Builder.bitmapPoolScreens>
	//   92  173:fmul            
	//   93  174:invokestatic    #71  <Method int Math.round(float)>
	//   94  177:putfield        #78  <Field int bitmapPoolSize>
		}
		if(Log.isLoggable("MemorySizeCalculator", 3))
	//*  95  180:ldc1            #80  <String "MemorySizeCalculator">
	//*  96  182:iconst_3        
	//*  97  183:invokestatic    #86  <Method boolean Log.isLoggable(String, int)>
	//*  98  186:ifeq            367
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   99  189:new             #88  <Class StringBuilder>
	//  100  192:dup             
	//  101  193:invokespecial   #89  <Method void StringBuilder()>
	//  102  196:astore          9
			stringbuilder.append("Calculation complete, Calculated memory cache size: ");
	//  103  198:aload           9
	//  104  200:ldc1            #91  <String "Calculation complete, Calculated memory cache size: ">
	//  105  202:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  106  205:pop             
			stringbuilder.append(toMb(memoryCacheSize));
	//  107  206:aload           9
	//  108  208:aload_0         
	//  109  209:aload_0         
	//  110  210:getfield        #76  <Field int memoryCacheSize>
	//  111  213:invokespecial   #99  <Method String toMb(int)>
	//  112  216:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  113  219:pop             
			stringbuilder.append(", pool size: ");
	//  114  220:aload           9
	//  115  222:ldc1            #101 <String ", pool size: ">
	//  116  224:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  117  227:pop             
			stringbuilder.append(toMb(bitmapPoolSize));
	//  118  228:aload           9
	//  119  230:aload_0         
	//  120  231:aload_0         
	//  121  232:getfield        #78  <Field int bitmapPoolSize>
	//  122  235:invokespecial   #99  <Method String toMb(int)>
	//  123  238:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  124  241:pop             
			stringbuilder.append(", byte array size: ");
	//  125  242:aload           9
	//  126  244:ldc1            #103 <String ", byte array size: ">
	//  127  246:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  128  249:pop             
			stringbuilder.append(toMb(arrayPoolSize));
	//  129  250:aload           9
	//  130  252:aload_0         
	//  131  253:aload_0         
	//  132  254:getfield        #40  <Field int arrayPoolSize>
	//  133  257:invokespecial   #99  <Method String toMb(int)>
	//  134  260:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  135  263:pop             
			stringbuilder.append(", memory class limited? ");
	//  136  264:aload           9
	//  137  266:ldc1            #105 <String ", memory class limited? ">
	//  138  268:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  139  271:pop             
			boolean flag;
			if(i1 > i)
	//* 140  272:iload           7
	//* 141  274:iload_3         
	//* 142  275:icmple          284
				flag = true;
	//  143  278:iconst_1        
	//  144  279:istore          8
			else
	//* 145  281:goto            287
				flag = false;
	//  146  284:iconst_0        
	//  147  285:istore          8
			stringbuilder.append(flag);
	//  148  287:aload           9
	//  149  289:iload           8
	//  150  291:invokevirtual   #108 <Method StringBuilder StringBuilder.append(boolean)>
	//  151  294:pop             
			stringbuilder.append(", max size: ");
	//  152  295:aload           9
	//  153  297:ldc1            #110 <String ", max size: ">
	//  154  299:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  155  302:pop             
			stringbuilder.append(toMb(i));
	//  156  303:aload           9
	//  157  305:aload_0         
	//  158  306:iload_3         
	//  159  307:invokespecial   #99  <Method String toMb(int)>
	//  160  310:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  161  313:pop             
			stringbuilder.append(", memoryClass: ");
	//  162  314:aload           9
	//  163  316:ldc1            #112 <String ", memoryClass: ">
	//  164  318:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  165  321:pop             
			stringbuilder.append(builder.activityManager.getMemoryClass());
	//  166  322:aload           9
	//  167  324:aload_1         
	//  168  325:getfield        #31  <Field ActivityManager MemorySizeCalculator$Builder.activityManager>
	//  169  328:invokevirtual   #117 <Method int ActivityManager.getMemoryClass()>
	//  170  331:invokevirtual   #120 <Method StringBuilder StringBuilder.append(int)>
	//  171  334:pop             
			stringbuilder.append(", isLowMemoryDevice: ");
	//  172  335:aload           9
	//  173  337:ldc1            #122 <String ", isLowMemoryDevice: ">
	//  174  339:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  175  342:pop             
			stringbuilder.append(isLowMemoryDevice(builder.activityManager));
	//  176  343:aload           9
	//  177  345:aload_1         
	//  178  346:getfield        #31  <Field ActivityManager MemorySizeCalculator$Builder.activityManager>
	//  179  349:invokestatic    #35  <Method boolean isLowMemoryDevice(ActivityManager)>
	//  180  352:invokevirtual   #108 <Method StringBuilder StringBuilder.append(boolean)>
	//  181  355:pop             
			Log.d("MemorySizeCalculator", stringbuilder.toString());
	//  182  356:ldc1            #80  <String "MemorySizeCalculator">
	//  183  358:aload           9
	//  184  360:invokevirtual   #126 <Method String StringBuilder.toString()>
	//  185  363:invokestatic    #130 <Method int Log.d(String, String)>
	//  186  366:pop             
		}
	//  187  367:return          
	}

	private static int getMaxSize(ActivityManager activitymanager, float f, float f1)
	{
		int i = activitymanager.getMemoryClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method int ActivityManager.getMemoryClass()>
	//    2    4:istore          4
		boolean flag = isLowMemoryDevice(activitymanager);
	//    3    6:aload_0         
	//    4    7:invokestatic    #35  <Method boolean isLowMemoryDevice(ActivityManager)>
	//    5   10:istore          5
		float f2 = i * 1024 * 1024;
	//    6   12:iload           4
	//    7   14:sipush          1024
	//    8   17:imul            
	//    9   18:sipush          1024
	//   10   21:imul            
	//   11   22:i2f             
	//   12   23:fstore_3        
		if(flag)
	//*  13   24:iload           5
	//*  14   26:ifeq            31
			f = f1;
	//   15   29:fload_2         
	//   16   30:fstore_1        
		return Math.round(f2 * f);
	//   17   31:fload_3         
	//   18   32:fload_1         
	//   19   33:fmul            
	//   20   34:invokestatic    #71  <Method int Math.round(float)>
	//   21   37:ireturn         
	}

	static boolean isLowMemoryDevice(ActivityManager activitymanager)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #139 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return activitymanager.isLowRamDevice();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #143 <Method boolean ActivityManager.isLowRamDevice()>
	//    5   12:ireturn         
		else
			return true;
	//    6   13:iconst_1        
	//    7   14:ireturn         
	}

	private String toMb(int i)
	{
		return Formatter.formatFileSize(context, i);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Context context>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokestatic    #150 <Method String Formatter.formatFileSize(Context, long)>
	//    5    9:areturn         
	}

	public int getArrayPoolSizeInBytes()
	{
		return arrayPoolSize;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int arrayPoolSize>
	//    2    4:ireturn         
	}

	public int getBitmapPoolSize()
	{
		return bitmapPoolSize;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int bitmapPoolSize>
	//    2    4:ireturn         
	}

	public int getMemoryCacheSize()
	{
		return memoryCacheSize;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int memoryCacheSize>
	//    2    4:ireturn         
	}

	private final int arrayPoolSize;
	private final int bitmapPoolSize;
	private final Context context;
	private final int memoryCacheSize;
}
