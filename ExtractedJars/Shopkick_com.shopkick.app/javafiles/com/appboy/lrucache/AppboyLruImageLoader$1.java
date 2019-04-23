// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.lrucache;

import android.graphics.Bitmap;
import android.util.LruCache;

// Referenced classes of package com.appboy.lrucache:
//			AppboyLruImageLoader

class AppboyLruImageLoader$1 extends LruCache
{

	protected int a(String s, Bitmap bitmap)
	{
		return bitmap.getByteCount();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #26  <Method int Bitmap.getByteCount()>
	//    2    4:ireturn         
	}

	protected int sizeOf(Object obj, Object obj1)
	{
		return a((String)obj, (Bitmap)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class String>
	//    3    5:aload_2         
	//    4    6:checkcast       #22  <Class Bitmap>
	//    5    9:invokevirtual   #32  <Method int a(String, Bitmap)>
	//    6   12:ireturn         
	}

	final AppboyLruImageLoader a;

	AppboyLruImageLoader$1(AppboyLruImageLoader appboylruimageloader, int i)
	{
		a = appboylruimageloader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AppboyLruImageLoader a>
		super(i);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokespecial   #18  <Method void LruCache(int)>
	//    6   10:return          
	}
}
