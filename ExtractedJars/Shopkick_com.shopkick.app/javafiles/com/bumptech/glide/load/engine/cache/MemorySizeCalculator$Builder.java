// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import com.bumptech.glide.util.Preconditions;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			MemorySizeCalculator

public static final class MemorySizeCalculator$Builder
{

	public MemorySizeCalculator build()
	{
		return new MemorySizeCalculator(this);
	//    0    0:new             #6   <Class MemorySizeCalculator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #94  <Method void MemorySizeCalculator(MemorySizeCalculator$Builder)>
	//    4    8:areturn         
	}

	MemorySizeCalculator$Builder setActivityManager(ActivityManager activitymanager)
	{
		activityManager = activitymanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field ActivityManager activityManager>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MemorySizeCalculator$Builder setArrayPoolSize(int i)
	{
		arrayPoolSizeBytes = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #54  <Field int arrayPoolSizeBytes>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MemorySizeCalculator$Builder setBitmapPoolScreens(float f)
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
	//   10   14:ldc1            #103 <String "Bitmap pool screens must be greater than or equal to 0">
	//   11   16:invokestatic    #109 <Method void Preconditions.checkArgument(boolean, String)>
		bitmapPoolScreens = f;
	//   12   19:aload_0         
	//   13   20:fload_1         
	//   14   21:putfield        #48  <Field float bitmapPoolScreens>
		return this;
	//   15   24:aload_0         
	//   16   25:areturn         
	}

	public MemorySizeCalculator$Builder setLowMemoryMaxSizeMultiplier(float f)
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
	//   14   20:ldc1            #112 <String "Low memory max size multiplier must be between 0 and 1">
	//   15   22:invokestatic    #109 <Method void Preconditions.checkArgument(boolean, String)>
		lowMemoryMaxSizeMultiplier = f;
	//   16   25:aload_0         
	//   17   26:fload_1         
	//   18   27:putfield        #52  <Field float lowMemoryMaxSizeMultiplier>
		return this;
	//   19   30:aload_0         
	//   20   31:areturn         
	}

	public MemorySizeCalculator$Builder setMaxSizeMultiplier(float f)
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
	//   14   20:ldc1            #115 <String "Size multiplier must be between 0 and 1">
	//   15   22:invokestatic    #109 <Method void Preconditions.checkArgument(boolean, String)>
		maxSizeMultiplier = f;
	//   16   25:aload_0         
	//   17   26:fload_1         
	//   18   27:putfield        #50  <Field float maxSizeMultiplier>
		return this;
	//   19   30:aload_0         
	//   20   31:areturn         
	}

	public MemorySizeCalculator$Builder setMemoryCacheScreens(float f)
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
		Preconditions.checkArgument(flag, "Memory cache screens must be greater than or equal to 0");
	//    9   13:iload_2         
	//   10   14:ldc1            #118 <String "Memory cache screens must be greater than or equal to 0">
	//   11   16:invokestatic    #109 <Method void Preconditions.checkArgument(boolean, String)>
		memoryCacheScreens = f;
	//   12   19:aload_0         
	//   13   20:fload_1         
	//   14   21:putfield        #46  <Field float memoryCacheScreens>
		return this;
	//   15   24:aload_0         
	//   16   25:areturn         
	}

	MemorySizeCalculator$Builder setScreenDimensions(mensions mensions)
	{
		screenDimensions = mensions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #85  <Field MemorySizeCalculator$ScreenDimensions screenDimensions>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	static final int ARRAY_POOL_SIZE_BYTES = 0x400000;
	static final int BITMAP_POOL_TARGET_SCREENS;
	static final float LOW_MEMORY_MAX_SIZE_MULTIPLIER = 0.33F;
	static final float MAX_SIZE_MULTIPLIER = 0.4F;
	static final int MEMORY_CACHE_TARGET_SCREENS = 2;
	ActivityManager activityManager;
	int arrayPoolSizeBytes;
	float bitmapPoolScreens;
	final Context context;
	float lowMemoryMaxSizeMultiplier;
	float maxSizeMultiplier;
	float memoryCacheScreens;
	mensions screenDimensions;

	static 
	{
		int i;
		if(android.os.Build.VERSION.SDK_INT < 26)
	//*   0    0:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
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
	//    9   16:putstatic       #39  <Field int BITMAP_POOL_TARGET_SCREENS>
	//*  10   19:return          
	}

	public MemorySizeCalculator$Builder(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		memoryCacheScreens = 2.0F;
	//    2    4:aload_0         
	//    3    5:fconst_2        
	//    4    6:putfield        #46  <Field float memoryCacheScreens>
		bitmapPoolScreens = BITMAP_POOL_TARGET_SCREENS;
	//    5    9:aload_0         
	//    6   10:getstatic       #39  <Field int BITMAP_POOL_TARGET_SCREENS>
	//    7   13:i2f             
	//    8   14:putfield        #48  <Field float bitmapPoolScreens>
		maxSizeMultiplier = 0.4F;
	//    9   17:aload_0         
	//   10   18:ldc1            #16  <Float 0.4F>
	//   11   20:putfield        #50  <Field float maxSizeMultiplier>
		lowMemoryMaxSizeMultiplier = 0.33F;
	//   12   23:aload_0         
	//   13   24:ldc1            #14  <Float 0.33F>
	//   14   26:putfield        #52  <Field float lowMemoryMaxSizeMultiplier>
		arrayPoolSizeBytes = 0x400000;
	//   15   29:aload_0         
	//   16   30:ldc1            #10  <Int 0x400000>
	//   17   32:putfield        #54  <Field int arrayPoolSizeBytes>
		context = context1;
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:putfield        #56  <Field Context context>
		activityManager = (ActivityManager)context1.getSystemService("activity");
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:ldc1            #58  <String "activity">
	//   24   44:invokevirtual   #64  <Method Object Context.getSystemService(String)>
	//   25   47:checkcast       #66  <Class ActivityManager>
	//   26   50:putfield        #68  <Field ActivityManager activityManager>
		screenDimensions = ((mensions) (new etricsScreenDimensions(context1.getResources().getDisplayMetrics())));
	//   27   53:aload_0         
	//   28   54:new             #70  <Class MemorySizeCalculator$DisplayMetricsScreenDimensions>
	//   29   57:dup             
	//   30   58:aload_1         
	//   31   59:invokevirtual   #74  <Method Resources Context.getResources()>
	//   32   62:invokevirtual   #80  <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   33   65:invokespecial   #83  <Method void MemorySizeCalculator$DisplayMetricsScreenDimensions(android.util.DisplayMetrics)>
	//   34   68:putfield        #85  <Field MemorySizeCalculator$ScreenDimensions screenDimensions>
		if(android.os.Build.VERSION.SDK_INT >= 26 && MemorySizeCalculator.isLowMemoryDevice(activityManager))
	//*  35   71:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//*  36   74:bipush          26
	//*  37   76:icmplt          94
	//*  38   79:aload_0         
	//*  39   80:getfield        #68  <Field ActivityManager activityManager>
	//*  40   83:invokestatic    #89  <Method boolean MemorySizeCalculator.isLowMemoryDevice(ActivityManager)>
	//*  41   86:ifeq            94
			bitmapPoolScreens = 0.0F;
	//   42   89:aload_0         
	//   43   90:fconst_0        
	//   44   91:putfield        #48  <Field float bitmapPoolScreens>
	//   45   94:return          
	}
}
