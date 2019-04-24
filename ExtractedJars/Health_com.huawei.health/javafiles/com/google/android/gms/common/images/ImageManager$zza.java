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

static final class ImageManager$zza extends LruCache
{

	private static int zzaR(Context context)
	{
		ActivityManager activitymanager = (ActivityManager)context.getSystemService("activity");
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <String "activity">
	//    2    3:invokevirtual   #26  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #28  <Class ActivityManager>
	//    4    9:astore_2        
		boolean flag;
		if((context.getApplicationInfo().flags & 0x100000) != 0)
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #32  <Method ApplicationInfo Context.getApplicationInfo()>
	//*   7   14:getfield        #38  <Field int ApplicationInfo.flags>
	//*   8   17:ldc1            #39  <Int 0x100000>
	//*   9   19:iand            
	//*  10   20:ifeq            28
			flag = true;
	//   11   23:iconst_1        
	//   12   24:istore_1        
		else
	//*  13   25:goto            30
			flag = false;
	//   14   28:iconst_0        
	//   15   29:istore_1        
		int i;
		if(flag)
	//*  16   30:iload_1         
	//*  17   31:ifeq            42
			i = activitymanager.getLargeMemoryClass();
	//   18   34:aload_2         
	//   19   35:invokevirtual   #43  <Method int ActivityManager.getLargeMemoryClass()>
	//   20   38:istore_1        
		else
	//*  21   39:goto            47
			i = activitymanager.getMemoryClass();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #46  <Method int ActivityManager.getMemoryClass()>
	//   24   46:istore_1        
		return (int)((float)(0x100000 * i) * 0.33F);
	//   25   47:ldc1            #39  <Int 0x100000>
	//   26   49:iload_1         
	//   27   50:imul            
	//   28   51:i2f             
	//   29   52:ldc1            #47  <Float 0.33F>
	//   30   54:fmul            
	//   31   55:f2i             
	//   32   56:ireturn         
	}

	public void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
	{
		zza(flag, (zza.zza)obj, (Bitmap)obj1, (Bitmap)obj2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #51  <Class zza$zza>
	//    4    6:aload_3         
	//    5    7:checkcast       #53  <Class Bitmap>
	//    6   10:aload           4
	//    7   12:checkcast       #53  <Class Bitmap>
	//    8   15:invokevirtual   #56  <Method void zza(boolean, zza$zza, Bitmap, Bitmap)>
	//    9   18:return          
	}

	public int sizeOf(Object obj, Object obj1)
	{
		return zza((zza.zza)obj, (Bitmap)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #51  <Class zza$zza>
	//    3    5:aload_2         
	//    4    6:checkcast       #53  <Class Bitmap>
	//    5    9:invokevirtual   #61  <Method int zza(zza$zza, Bitmap)>
	//    6   12:ireturn         
	}

	protected int zza(zza.zza zza1, Bitmap bitmap)
	{
		return bitmap.getHeight() * bitmap.getRowBytes();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #64  <Method int Bitmap.getHeight()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #67  <Method int Bitmap.getRowBytes()>
	//    4    8:imul            
	//    5    9:ireturn         
	}

	protected void zza(boolean flag, zza.zza zza1, Bitmap bitmap, Bitmap bitmap1)
	{
		super.entryRemoved(flag, ((Object) (zza1)), ((Object) (bitmap)), ((Object) (bitmap1)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #69  <Method void LruCache.entryRemoved(boolean, Object, Object, Object)>
	//    6    9:return          
	}

	public ImageManager$zza(Context context)
	{
		super(zzaR(context));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #14  <Method int zzaR(Context)>
	//    3    5:invokespecial   #17  <Method void LruCache(int)>
	//    4    8:return          
	}
}
