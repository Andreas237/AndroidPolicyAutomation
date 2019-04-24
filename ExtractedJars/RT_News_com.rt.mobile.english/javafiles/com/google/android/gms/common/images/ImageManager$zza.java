// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageManager

private static final class ImageManager$zza extends LruCache
{

	protected final void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
	{
		super.entryRemoved(flag, ((Object) ((ImageRequest$zza)obj)), ((Object) ((Bitmap)obj1)), ((Object) ((Bitmap)obj2)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #47  <Class ImageRequest$zza>
	//    4    6:aload_3         
	//    5    7:checkcast       #49  <Class Bitmap>
	//    6   10:aload           4
	//    7   12:checkcast       #49  <Class Bitmap>
	//    8   15:invokespecial   #51  <Method void LruCache.entryRemoved(boolean, Object, Object, Object)>
	//    9   18:return          
	}

	protected final int sizeOf(Object obj, Object obj1)
	{
		obj = ((Object) ((Bitmap)obj1));
	//    0    0:aload_2         
	//    1    1:checkcast       #49  <Class Bitmap>
	//    2    4:astore_1        
		return ((Bitmap) (obj)).getHeight() * ((Bitmap) (obj)).getRowBytes();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #56  <Method int Bitmap.getHeight()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #59  <Method int Bitmap.getRowBytes()>
	//    7   13:imul            
	//    8   14:ireturn         
	}

	public ImageManager$zza(Context context)
	{
		ActivityManager activitymanager = (ActivityManager)context.getSystemService("activity");
	//    0    0:aload_1         
	//    1    1:ldc1            #12  <String "activity">
	//    2    3:invokevirtual   #18  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #20  <Class ActivityManager>
	//    4    9:astore_3        
		boolean flag;
		if((context.getApplicationInfo().flags & 0x100000) != 0)
	//*   5   10:aload_1         
	//*   6   11:invokevirtual   #24  <Method ApplicationInfo Context.getApplicationInfo()>
	//*   7   14:getfield        #30  <Field int ApplicationInfo.flags>
	//*   8   17:ldc1            #31  <Int 0x100000>
	//*   9   19:iand            
	//*  10   20:ifeq            28
			flag = true;
	//   11   23:iconst_1        
	//   12   24:istore_2        
		else
	//*  13   25:goto            30
			flag = false;
	//   14   28:iconst_0        
	//   15   29:istore_2        
		int i;
		if(flag)
	//*  16   30:iload_2         
	//*  17   31:ifeq            42
			i = activitymanager.getLargeMemoryClass();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #35  <Method int ActivityManager.getLargeMemoryClass()>
	//   20   38:istore_2        
		else
	//*  21   39:goto            47
			i = activitymanager.getMemoryClass();
	//   22   42:aload_3         
	//   23   43:invokevirtual   #38  <Method int ActivityManager.getMemoryClass()>
	//   24   46:istore_2        
		super((int)(0.33F * (float)(i * 0x100000)));
	//   25   47:aload_0         
	//   26   48:ldc1            #39  <Float 0.33F>
	//   27   50:iload_2         
	//   28   51:ldc1            #31  <Int 0x100000>
	//   29   53:imul            
	//   30   54:i2f             
	//   31   55:fmul            
	//   32   56:f2i             
	//   33   57:invokespecial   #42  <Method void LruCache(int)>
	//   34   60:return          
	}
}
