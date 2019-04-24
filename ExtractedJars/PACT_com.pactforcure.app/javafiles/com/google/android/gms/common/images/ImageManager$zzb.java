// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import com.google.android.gms.common.util.zzs;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageManager

private static final class ImageManager$zzb extends LruCache
{

	private static int zzaz(Context context)
	{
		ActivityManager activitymanager = (ActivityManager)context.getSystemService("activity");
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <String "activity">
	//    2    3:invokevirtual   #29  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #31  <Class ActivityManager>
	//    4    9:astore_2        
		int i;
		if((context.getApplicationInfo().flags & 0x100000) != 0)
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #35  <Method ApplicationInfo Context.getApplicationInfo()>
	//*   7   14:getfield        #41  <Field int ApplicationInfo.flags>
	//*   8   17:ldc1            #42  <Int 0x100000>
	//*   9   19:iand            
	//*  10   20:ifeq            50
			i = 1;
	//   11   23:iconst_1        
	//   12   24:istore_1        
		else
	//*  13   25:iload_1         
	//*  14   26:ifeq            55
	//*  15   29:invokestatic    #48  <Method boolean zzs.zzyx()>
	//*  16   32:ifeq            55
	//*  17   35:aload_2         
	//*  18   36:invokestatic    #54  <Method int ImageManager$zza.zza(ActivityManager)>
	//*  19   39:istore_1        
	//*  20   40:iload_1         
	//*  21   41:ldc1            #42  <Int 0x100000>
	//*  22   43:imul            
	//*  23   44:i2f             
	//*  24   45:ldc1            #55  <Float 0.33F>
	//*  25   47:fmul            
	//*  26   48:f2i             
	//*  27   49:ireturn         
			i = 0;
	//   28   50:iconst_0        
	//   29   51:istore_1        
		if(i != 0 && zzs.zzyx())
			i = ImageManager$zza.zza(activitymanager);
		else
	//*  30   52:goto            25
			i = activitymanager.getMemoryClass();
	//   31   55:aload_2         
	//   32   56:invokevirtual   #59  <Method int ActivityManager.getMemoryClass()>
	//   33   59:istore_1        
		return (int)((float)(i * 0x100000) * 0.33F);
	//*  34   60:goto            40
	}

	protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
	{
		zza(flag, (zza.zza)obj, (Bitmap)obj1, (Bitmap)obj2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #64  <Class zza$zza>
	//    4    6:aload_3         
	//    5    7:checkcast       #66  <Class Bitmap>
	//    6   10:aload           4
	//    7   12:checkcast       #66  <Class Bitmap>
	//    8   15:invokevirtual   #69  <Method void zza(boolean, zza$zza, Bitmap, Bitmap)>
	//    9   18:return          
	}

	protected int sizeOf(Object obj, Object obj1)
	{
		return zza((zza.zza)obj, (Bitmap)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #64  <Class zza$zza>
	//    3    5:aload_2         
	//    4    6:checkcast       #66  <Class Bitmap>
	//    5    9:invokevirtual   #74  <Method int zza(zza$zza, Bitmap)>
	//    6   12:ireturn         
	}

	protected int zza(zza.zza zza1, Bitmap bitmap)
	{
		return bitmap.getHeight() * bitmap.getRowBytes();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #77  <Method int Bitmap.getHeight()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #80  <Method int Bitmap.getRowBytes()>
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
	//    5    6:invokespecial   #82  <Method void LruCache.entryRemoved(boolean, Object, Object, Object)>
	//    6    9:return          
	}

	public ImageManager$zzb(Context context)
	{
		super(zzaz(context));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #14  <Method int zzaz(Context)>
	//    3    5:invokespecial   #17  <Method void LruCache(int)>
	//    4    8:return          
	}
}
