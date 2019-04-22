// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;

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
	mensions screenDimensions;

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

	public MemorySizeCalculator$Builder(Context context1)
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
		screenDimensions = ((mensions) (new etricsScreenDimensions(context1.getResources().getDisplayMetrics())));
	//   27   53:aload_0         
	//   28   54:new             #64  <Class MemorySizeCalculator$DisplayMetricsScreenDimensions>
	//   29   57:dup             
	//   30   58:aload_1         
	//   31   59:invokevirtual   #68  <Method Resources Context.getResources()>
	//   32   62:invokevirtual   #74  <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   33   65:invokespecial   #77  <Method void MemorySizeCalculator$DisplayMetricsScreenDimensions(android.util.DisplayMetrics)>
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
