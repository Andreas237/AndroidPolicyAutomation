// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.HashMap;

// Referenced classes of package com.amap.api.mapcore.util:
//			eq, fh, fd

class fh$1 extends eq
{

	protected int a(String s, Bitmap bitmap)
	{
		int i = fh.a(bitmap);
	//    0    0:aload_2         
	//    1    1:invokestatic    #24  <Method int fh.a(Bitmap)>
	//    2    4:istore_3        
		if(i == 0)
	//*   3    5:iload_3         
	//*   4    6:ifne            11
			return 1;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		else
			return i;
	//    7   11:iload_3         
	//    8   12:ireturn         
	}

	protected volatile void a(boolean flag, Object obj, Object obj1, Object obj2)
	{
		a(flag, (String)obj, (Bitmap)obj1, (Bitmap)obj2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #27  <Class String>
	//    4    6:aload_3         
	//    5    7:checkcast       #29  <Class Bitmap>
	//    6   10:aload           4
	//    7   12:checkcast       #29  <Class Bitmap>
	//    8   15:invokevirtual   #32  <Method void a(boolean, String, Bitmap, Bitmap)>
	//    9   18:return          
	}

	protected void a(boolean flag, String s, Bitmap bitmap, Bitmap bitmap1)
	{
		if(fd.c() && fh.a(a) != null && bitmap != null && !bitmap.isRecycled())
	//*   0    0:invokestatic    #38  <Method boolean fd.c()>
	//*   1    3:ifeq            47
	//*   2    6:aload_0         
	//*   3    7:getfield        #16  <Field fh a>
	//*   4   10:invokestatic    #41  <Method HashMap fh.a(fh)>
	//*   5   13:ifnull          47
	//*   6   16:aload_3         
	//*   7   17:ifnull          47
	//*   8   20:aload_3         
	//*   9   21:invokevirtual   #44  <Method boolean Bitmap.isRecycled()>
	//*  10   24:ifne            47
			fh.a(a).put(((Object) (s)), ((Object) (new WeakReference(((Object) (bitmap))))));
	//   11   27:aload_0         
	//   12   28:getfield        #16  <Field fh a>
	//   13   31:invokestatic    #41  <Method HashMap fh.a(fh)>
	//   14   34:aload_2         
	//   15   35:new             #46  <Class WeakReference>
	//   16   38:dup             
	//   17   39:aload_3         
	//   18   40:invokespecial   #49  <Method void WeakReference(Object)>
	//   19   43:invokevirtual   #55  <Method Object HashMap.put(Object, Object)>
	//   20   46:pop             
	//   21   47:return          
	}

	protected int b(Object obj, Object obj1)
	{
		return a((String)obj, (Bitmap)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class String>
	//    3    5:aload_2         
	//    4    6:checkcast       #29  <Class Bitmap>
	//    5    9:invokevirtual   #58  <Method int a(String, Bitmap)>
	//    6   12:ireturn         
	}

	final fh a;

	fh$1(fh fh1, int i)
	{
		a = fh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field fh a>
		super(i);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokespecial   #19  <Method void eq(int)>
	//    6   10:return          
	}
}
