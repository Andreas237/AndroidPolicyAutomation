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
import com.bumptech.glide.util.Preconditions;

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
		//    3    5:invokespecial   #106 <Method void MemorySizeCalculator(MemorySizeCalculator$Builder)>
		//    4    8:areturn         
		}

		Builder setActivityManager(ActivityManager activitymanager)
		{
			activityManager = activitymanager;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #67  <Field ActivityManager activityManager>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setArrayPoolSize(int i)
		{
			arrayPoolSizeBytes = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #53  <Field int arrayPoolSizeBytes>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setBitmapPoolScreens(float f)
		{
			boolean flag;
			if(f >= 0.0F)
		//*   0    0:fload_1         
		//*   1    1:fconst_0        
		//*   2    2:fcmpl           
		//*   3    3:iflt            11
				flag = true;
		//    4    6:iconst_1        
		//    5    7:istore_2        
			else
		//*   6    8:goto            13
				flag = false;
		//    7   11:iconst_0        
		//    8   12:istore_2        
			Preconditions.checkArgument(flag, "Bitmap pool screens must be greater than or equal to 0");
		//    9   13:iload_2         
		//   10   14:ldc1            #114 <String "Bitmap pool screens must be greater than or equal to 0">
		//   11   16:invokestatic    #120 <Method void Preconditions.checkArgument(boolean, String)>
			bitmapPoolScreens = f;
		//   12   19:aload_0         
		//   13   20:fload_1         
		//   14   21:putfield        #47  <Field float bitmapPoolScreens>
			return this;
		//   15   24:aload_0         
		//   16   25:areturn         
		}

		public Builder setLowMemoryMaxSizeMultiplier(float f)
		{
			boolean flag;
			if(f >= 0.0F && f <= 1.0F)
		//*   0    0:fload_1         
		//*   1    1:fconst_0        
		//*   2    2:fcmpl           
		//*   3    3:iflt            17
		//*   4    6:fload_1         
		//*   5    7:fconst_1        
		//*   6    8:fcmpg           
		//*   7    9:ifgt            17
				flag = true;
		//    8   12:iconst_1        
		//    9   13:istore_2        
			else
		//*  10   14:goto            19
				flag = false;
		//   11   17:iconst_0        
		//   12   18:istore_2        
			Preconditions.checkArgument(flag, "Low memory max size multiplier must be between 0 and 1");
		//   13   19:iload_2         
		//   14   20:ldc1            #123 <String "Low memory max size multiplier must be between 0 and 1">
		//   15   22:invokestatic    #120 <Method void Preconditions.checkArgument(boolean, String)>
			lowMemoryMaxSizeMultiplier = f;
		//   16   25:aload_0         
		//   17   26:fload_1         
		//   18   27:putfield        #51  <Field float lowMemoryMaxSizeMultiplier>
			return this;
		//   19   30:aload_0         
		//   20   31:areturn         
		}

		public Builder setMaxSizeMultiplier(float f)
		{
			boolean flag;
			if(f >= 0.0F && f <= 1.0F)
		//*   0    0:fload_1         
		//*   1    1:fconst_0        
		//*   2    2:fcmpl           
		//*   3    3:iflt            17
		//*   4    6:fload_1         
		//*   5    7:fconst_1        
		//*   6    8:fcmpg           
		//*   7    9:ifgt            17
				flag = true;
		//    8   12:iconst_1        
		//    9   13:istore_2        
			else
		//*  10   14:goto            19
				flag = false;
		//   11   17:iconst_0        
		//   12   18:istore_2        
			Preconditions.checkArgument(flag, "Size multiplier must be between 0 and 1");
		//   13   19:iload_2         
		//   14   20:ldc1            #126 <String "Size multiplier must be between 0 and 1">
		//   15   22:invokestatic    #120 <Method void Preconditions.checkArgument(boolean, String)>
			maxSizeMultiplier = f;
		//   16   25:aload_0         
		//   17   26:fload_1         
		//   18   27:putfield        #49  <Field float maxSizeMultiplier>
			return this;
		//   19   30:aload_0         
		//   20   31:areturn         
		}

		public Builder setMemoryCacheScreens(float f)
		{
			boolean flag;
			if(bitmapPoolScreens >= 0.0F)
		//*   0    0:aload_0         
		//*   1    1:getfield        #47  <Field float bitmapPoolScreens>
		//*   2    4:fconst_0        
		//*   3    5:fcmpl           
		//*   4    6:iflt            14
				flag = true;
		//    5    9:iconst_1        
		//    6   10:istore_2        
			else
		//*   7   11:goto            16
				flag = false;
		//    8   14:iconst_0        
		//    9   15:istore_2        
			Preconditions.checkArgument(flag, "Memory cache screens must be greater than or equal to 0");
		//   10   16:iload_2         
		//   11   17:ldc1            #129 <String "Memory cache screens must be greater than or equal to 0">
		//   12   19:invokestatic    #120 <Method void Preconditions.checkArgument(boolean, String)>
			memoryCacheScreens = f;
		//   13   22:aload_0         
		//   14   23:fload_1         
		//   15   24:putfield        #45  <Field float memoryCacheScreens>
			return this;
		//   16   27:aload_0         
		//   17   28:areturn         
		}

		Builder setScreenDimensions(ScreenDimensions screendimensions)
		{
			screenDimensions = screendimensions;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #84  <Field MemorySizeCalculator$ScreenDimensions screenDimensions>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		static final int ARRAY_POOL_SIZE_BYTES = 0x400000;
		static final int BITMAP_POOL_TARGET_SCREENS;
		static final float LOW_MEMORY_MAX_SIZE_MULTIPLIER = 0.33F;
		static final float MAX_SIZE_MULTIPLIER = 0.4F;
		static final int MEMORY_CACHE_TARGET_SCREENS = 2;
		private ActivityManager activityManager;
		private int arrayPoolSizeBytes;
		private float bitmapPoolScreens;
		private final Context context;
		private float lowMemoryMaxSizeMultiplier;
		private float maxSizeMultiplier;
		private float memoryCacheScreens;
		private ScreenDimensions screenDimensions;

		static 
		{
			int i;
			if(android.os.Build.VERSION.SDK_INT > 26)
		//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          26
		//*   2    5:icmple          13
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
		//    9   16:putstatic       #38  <Field int BITMAP_POOL_TARGET_SCREENS>
		//*  10   19:return          
		}


/*
		static Context access$000(Builder builder)
		{
			return builder.context;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field Context context>
		//    2    4:areturn         
		}

*/


/*
		static ActivityManager access$100(Builder builder)
		{
			return builder.activityManager;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field ActivityManager activityManager>
		//    2    4:areturn         
		}

*/


/*
		static int access$200(Builder builder)
		{
			return builder.arrayPoolSizeBytes;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field int arrayPoolSizeBytes>
		//    2    4:ireturn         
		}

*/


/*
		static float access$300(Builder builder)
		{
			return builder.maxSizeMultiplier;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field float maxSizeMultiplier>
		//    2    4:freturn         
		}

*/


/*
		static float access$400(Builder builder)
		{
			return builder.lowMemoryMaxSizeMultiplier;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field float lowMemoryMaxSizeMultiplier>
		//    2    4:freturn         
		}

*/


/*
		static ScreenDimensions access$500(Builder builder)
		{
			return builder.screenDimensions;
		//    0    0:aload_0         
		//    1    1:getfield        #84  <Field MemorySizeCalculator$ScreenDimensions screenDimensions>
		//    2    4:areturn         
		}

*/


/*
		static float access$600(Builder builder)
		{
			return builder.bitmapPoolScreens;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field float bitmapPoolScreens>
		//    2    4:freturn         
		}

*/


/*
		static float access$700(Builder builder)
		{
			return builder.memoryCacheScreens;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field float memoryCacheScreens>
		//    2    4:freturn         
		}

*/

		public Builder(Context context1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #43  <Method void Object()>
			memoryCacheScreens = 2.0F;
		//    2    4:aload_0         
		//    3    5:fconst_2        
		//    4    6:putfield        #45  <Field float memoryCacheScreens>
			bitmapPoolScreens = BITMAP_POOL_TARGET_SCREENS;
		//    5    9:aload_0         
		//    6   10:getstatic       #38  <Field int BITMAP_POOL_TARGET_SCREENS>
		//    7   13:i2f             
		//    8   14:putfield        #47  <Field float bitmapPoolScreens>
			maxSizeMultiplier = 0.4F;
		//    9   17:aload_0         
		//   10   18:ldc1            #16  <Float 0.4F>
		//   11   20:putfield        #49  <Field float maxSizeMultiplier>
			lowMemoryMaxSizeMultiplier = 0.33F;
		//   12   23:aload_0         
		//   13   24:ldc1            #14  <Float 0.33F>
		//   14   26:putfield        #51  <Field float lowMemoryMaxSizeMultiplier>
			arrayPoolSizeBytes = 0x400000;
		//   15   29:aload_0         
		//   16   30:ldc1            #10  <Int 0x400000>
		//   17   32:putfield        #53  <Field int arrayPoolSizeBytes>
			context = context1;
		//   18   35:aload_0         
		//   19   36:aload_1         
		//   20   37:putfield        #55  <Field Context context>
			activityManager = (ActivityManager)context1.getSystemService("activity");
		//   21   40:aload_0         
		//   22   41:aload_1         
		//   23   42:ldc1            #57  <String "activity">
		//   24   44:invokevirtual   #63  <Method Object Context.getSystemService(String)>
		//   25   47:checkcast       #65  <Class ActivityManager>
		//   26   50:putfield        #67  <Field ActivityManager activityManager>
			screenDimensions = ((ScreenDimensions) (new DisplayMetricsScreenDimensions(context1.getResources().getDisplayMetrics())));
		//   27   53:aload_0         
		//   28   54:new             #69  <Class MemorySizeCalculator$DisplayMetricsScreenDimensions>
		//   29   57:dup             
		//   30   58:aload_1         
		//   31   59:invokevirtual   #73  <Method Resources Context.getResources()>
		//   32   62:invokevirtual   #79  <Method DisplayMetrics Resources.getDisplayMetrics()>
		//   33   65:invokespecial   #82  <Method void MemorySizeCalculator$DisplayMetricsScreenDimensions(DisplayMetrics)>
		//   34   68:putfield        #84  <Field MemorySizeCalculator$ScreenDimensions screenDimensions>
			if(android.os.Build.VERSION.SDK_INT >= 26 && MemorySizeCalculator.isLowMemoryDevice(activityManager))
		//*  35   71:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
		//*  36   74:bipush          26
		//*  37   76:icmplt          94
		//*  38   79:aload_0         
		//*  39   80:getfield        #67  <Field ActivityManager activityManager>
		//*  40   83:invokestatic    #88  <Method boolean MemorySizeCalculator.access$800(ActivityManager)>
		//*  41   86:ifeq            94
				bitmapPoolScreens = 0.0F;
		//   42   89:aload_0         
		//   43   90:fconst_0        
		//   44   91:putfield        #47  <Field float bitmapPoolScreens>
		//   45   94:return          
		}
	}

	static final class DisplayMetricsScreenDimensions
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

		public DisplayMetricsScreenDimensions(DisplayMetrics displaymetrics)
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
	//    1    1:invokespecial   #32  <Method void Object()>
		context = builder.context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #36  <Method Context MemorySizeCalculator$Builder.access$000(MemorySizeCalculator$Builder)>
	//    5    9:putfield        #38  <Field Context context>
		int i;
		if(isLowMemoryDevice(builder.activityManager))
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #42  <Method ActivityManager MemorySizeCalculator$Builder.access$100(MemorySizeCalculator$Builder)>
	//*   8   16:invokestatic    #46  <Method boolean isLowMemoryDevice(ActivityManager)>
	//*   9   19:ifeq            32
			i = builder.arrayPoolSizeBytes / 2;
	//   10   22:aload_1         
	//   11   23:invokestatic    #50  <Method int MemorySizeCalculator$Builder.access$200(MemorySizeCalculator$Builder)>
	//   12   26:iconst_2        
	//   13   27:idiv            
	//   14   28:istore_3        
		else
	//*  15   29:goto            37
			i = builder.arrayPoolSizeBytes;
	//   16   32:aload_1         
	//   17   33:invokestatic    #50  <Method int MemorySizeCalculator$Builder.access$200(MemorySizeCalculator$Builder)>
	//   18   36:istore_3        
		arrayPoolSize = i;
	//   19   37:aload_0         
	//   20   38:iload_3         
	//   21   39:putfield        #52  <Field int arrayPoolSize>
		i = getMaxSize(builder.activityManager, builder.maxSizeMultiplier, builder.lowMemoryMaxSizeMultiplier);
	//   22   42:aload_1         
	//   23   43:invokestatic    #42  <Method ActivityManager MemorySizeCalculator$Builder.access$100(MemorySizeCalculator$Builder)>
	//   24   46:aload_1         
	//   25   47:invokestatic    #56  <Method float MemorySizeCalculator$Builder.access$300(MemorySizeCalculator$Builder)>
	//   26   50:aload_1         
	//   27   51:invokestatic    #59  <Method float MemorySizeCalculator$Builder.access$400(MemorySizeCalculator$Builder)>
	//   28   54:invokestatic    #63  <Method int getMaxSize(ActivityManager, float, float)>
	//   29   57:istore_3        
		int k = builder.screenDimensions.getWidthPixels() * builder.screenDimensions.getHeightPixels() * 4;
	//   30   58:aload_1         
	//   31   59:invokestatic    #67  <Method MemorySizeCalculator$ScreenDimensions MemorySizeCalculator$Builder.access$500(MemorySizeCalculator$Builder)>
	//   32   62:invokeinterface #71  <Method int MemorySizeCalculator$ScreenDimensions.getWidthPixels()>
	//   33   67:aload_1         
	//   34   68:invokestatic    #67  <Method MemorySizeCalculator$ScreenDimensions MemorySizeCalculator$Builder.access$500(MemorySizeCalculator$Builder)>
	//   35   71:invokeinterface #74  <Method int MemorySizeCalculator$ScreenDimensions.getHeightPixels()>
	//   36   76:imul            
	//   37   77:iconst_4        
	//   38   78:imul            
	//   39   79:istore          5
		int j = Math.round((float)k * builder.bitmapPoolScreens);
	//   40   81:iload           5
	//   41   83:i2f             
	//   42   84:aload_1         
	//   43   85:invokestatic    #77  <Method float MemorySizeCalculator$Builder.access$600(MemorySizeCalculator$Builder)>
	//   44   88:fmul            
	//   45   89:invokestatic    #83  <Method int Math.round(float)>
	//   46   92:istore          4
		k = Math.round((float)k * builder.memoryCacheScreens);
	//   47   94:iload           5
	//   48   96:i2f             
	//   49   97:aload_1         
	//   50   98:invokestatic    #86  <Method float MemorySizeCalculator$Builder.access$700(MemorySizeCalculator$Builder)>
	//   51  101:fmul            
	//   52  102:invokestatic    #83  <Method int Math.round(float)>
	//   53  105:istore          5
		int l = i - arrayPoolSize;
	//   54  107:iload_3         
	//   55  108:aload_0         
	//   56  109:getfield        #52  <Field int arrayPoolSize>
	//   57  112:isub            
	//   58  113:istore          6
		if(k + j <= l)
	//*  59  115:iload           5
	//*  60  117:iload           4
	//*  61  119:iadd            
	//*  62  120:iload           6
	//*  63  122:icmpgt          140
		{
			memoryCacheSize = k;
	//   64  125:aload_0         
	//   65  126:iload           5
	//   66  128:putfield        #88  <Field int memoryCacheSize>
			bitmapPoolSize = j;
	//   67  131:aload_0         
	//   68  132:iload           4
	//   69  134:putfield        #90  <Field int bitmapPoolSize>
		} else
	//*  70  137:goto            180
		{
			float f = (float)l / (builder.bitmapPoolScreens + builder.memoryCacheScreens);
	//   71  140:iload           6
	//   72  142:i2f             
	//   73  143:aload_1         
	//   74  144:invokestatic    #77  <Method float MemorySizeCalculator$Builder.access$600(MemorySizeCalculator$Builder)>
	//   75  147:aload_1         
	//   76  148:invokestatic    #86  <Method float MemorySizeCalculator$Builder.access$700(MemorySizeCalculator$Builder)>
	//   77  151:fadd            
	//   78  152:fdiv            
	//   79  153:fstore_2        
			memoryCacheSize = Math.round(builder.memoryCacheScreens * f);
	//   80  154:aload_0         
	//   81  155:aload_1         
	//   82  156:invokestatic    #86  <Method float MemorySizeCalculator$Builder.access$700(MemorySizeCalculator$Builder)>
	//   83  159:fload_2         
	//   84  160:fmul            
	//   85  161:invokestatic    #83  <Method int Math.round(float)>
	//   86  164:putfield        #88  <Field int memoryCacheSize>
			bitmapPoolSize = Math.round(builder.bitmapPoolScreens * f);
	//   87  167:aload_0         
	//   88  168:aload_1         
	//   89  169:invokestatic    #77  <Method float MemorySizeCalculator$Builder.access$600(MemorySizeCalculator$Builder)>
	//   90  172:fload_2         
	//   91  173:fmul            
	//   92  174:invokestatic    #83  <Method int Math.round(float)>
	//   93  177:putfield        #90  <Field int bitmapPoolSize>
		}
		if(Log.isLoggable("MemorySizeCalculator", 3))
	//*  94  180:ldc1            #22  <String "MemorySizeCalculator">
	//*  95  182:iconst_3        
	//*  96  183:invokestatic    #96  <Method boolean Log.isLoggable(String, int)>
	//*  97  186:ifeq            328
		{
			StringBuilder stringbuilder = (new StringBuilder()).append("Calculation complete, Calculated memory cache size: ").append(toMb(memoryCacheSize)).append(", pool size: ").append(toMb(bitmapPoolSize)).append(", byte array size: ").append(toMb(arrayPoolSize)).append(", memory class limited? ");
	//   98  189:new             #98  <Class StringBuilder>
	//   99  192:dup             
	//  100  193:invokespecial   #99  <Method void StringBuilder()>
	//  101  196:ldc1            #101 <String "Calculation complete, Calculated memory cache size: ">
	//  102  198:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  103  201:aload_0         
	//  104  202:aload_0         
	//  105  203:getfield        #88  <Field int memoryCacheSize>
	//  106  206:invokespecial   #109 <Method String toMb(int)>
	//  107  209:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  108  212:ldc1            #111 <String ", pool size: ">
	//  109  214:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  110  217:aload_0         
	//  111  218:aload_0         
	//  112  219:getfield        #90  <Field int bitmapPoolSize>
	//  113  222:invokespecial   #109 <Method String toMb(int)>
	//  114  225:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  115  228:ldc1            #113 <String ", byte array size: ">
	//  116  230:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  117  233:aload_0         
	//  118  234:aload_0         
	//  119  235:getfield        #52  <Field int arrayPoolSize>
	//  120  238:invokespecial   #109 <Method String toMb(int)>
	//  121  241:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  122  244:ldc1            #115 <String ", memory class limited? ">
	//  123  246:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  124  249:astore          8
			boolean flag;
			if(k + j > i)
	//* 125  251:iload           5
	//* 126  253:iload           4
	//* 127  255:iadd            
	//* 128  256:iload_3         
	//* 129  257:icmple          266
				flag = true;
	//  130  260:iconst_1        
	//  131  261:istore          7
			else
	//* 132  263:goto            269
				flag = false;
	//  133  266:iconst_0        
	//  134  267:istore          7
			Log.d("MemorySizeCalculator", stringbuilder.append(flag).append(", max size: ").append(toMb(i)).append(", memoryClass: ").append(builder.activityManager.getMemoryClass()).append(", isLowMemoryDevice: ").append(isLowMemoryDevice(builder.activityManager)).toString());
	//  135  269:ldc1            #22  <String "MemorySizeCalculator">
	//  136  271:aload           8
	//  137  273:iload           7
	//  138  275:invokevirtual   #118 <Method StringBuilder StringBuilder.append(boolean)>
	//  139  278:ldc1            #120 <String ", max size: ">
	//  140  280:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  141  283:aload_0         
	//  142  284:iload_3         
	//  143  285:invokespecial   #109 <Method String toMb(int)>
	//  144  288:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  145  291:ldc1            #122 <String ", memoryClass: ">
	//  146  293:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  147  296:aload_1         
	//  148  297:invokestatic    #42  <Method ActivityManager MemorySizeCalculator$Builder.access$100(MemorySizeCalculator$Builder)>
	//  149  300:invokevirtual   #127 <Method int ActivityManager.getMemoryClass()>
	//  150  303:invokevirtual   #130 <Method StringBuilder StringBuilder.append(int)>
	//  151  306:ldc1            #132 <String ", isLowMemoryDevice: ">
	//  152  308:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  153  311:aload_1         
	//  154  312:invokestatic    #42  <Method ActivityManager MemorySizeCalculator$Builder.access$100(MemorySizeCalculator$Builder)>
	//  155  315:invokestatic    #46  <Method boolean isLowMemoryDevice(ActivityManager)>
	//  156  318:invokevirtual   #118 <Method StringBuilder StringBuilder.append(boolean)>
	//  157  321:invokevirtual   #136 <Method String StringBuilder.toString()>
	//  158  324:invokestatic    #140 <Method int Log.d(String, String)>
	//  159  327:pop             
		}
	//  160  328:return          
	}

	private static int getMaxSize(ActivityManager activitymanager, float f, float f1)
	{
		int i = activitymanager.getMemoryClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #127 <Method int ActivityManager.getMemoryClass()>
	//    2    4:istore          4
		boolean flag = isLowMemoryDevice(activitymanager);
	//    3    6:aload_0         
	//    4    7:invokestatic    #46  <Method boolean isLowMemoryDevice(ActivityManager)>
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
	//*  14   26:ifeq            34
			f = f1;
	//   15   29:fload_2         
	//   16   30:fstore_1        
	//*  17   31:goto            34
		return Math.round(f2 * f);
	//   18   34:fload_3         
	//   19   35:fload_1         
	//   20   36:fmul            
	//   21   37:invokestatic    #83  <Method int Math.round(float)>
	//   22   40:ireturn         
	}

	private static boolean isLowMemoryDevice(ActivityManager activitymanager)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #147 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return activitymanager.isLowRamDevice();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #151 <Method boolean ActivityManager.isLowRamDevice()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	private String toMb(int i)
	{
		return Formatter.formatFileSize(context, i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Context context>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokestatic    #157 <Method String Formatter.formatFileSize(Context, long)>
	//    5    9:areturn         
	}

	public int getArrayPoolSizeInBytes()
	{
		return arrayPoolSize;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int arrayPoolSize>
	//    2    4:ireturn         
	}

	public int getBitmapPoolSize()
	{
		return bitmapPoolSize;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field int bitmapPoolSize>
	//    2    4:ireturn         
	}

	public int getMemoryCacheSize()
	{
		return memoryCacheSize;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int memoryCacheSize>
	//    2    4:ireturn         
	}

	static final int BYTES_PER_ARGB_8888_PIXEL = 4;
	static final int LOW_MEMORY_BYTE_ARRAY_POOL_DIVISOR = 2;
	private static final String TAG = "MemorySizeCalculator";
	private final int arrayPoolSize;
	private final int bitmapPoolSize;
	private final Context context;
	private final int memoryCacheSize;


/*
	static boolean access$800(ActivityManager activitymanager)
	{
		return isLowMemoryDevice(activitymanager);
	//    0    0:aload_0         
	//    1    1:invokestatic    #46  <Method boolean isLowMemoryDevice(ActivityManager)>
	//    2    4:ireturn         
	}

*/
}
