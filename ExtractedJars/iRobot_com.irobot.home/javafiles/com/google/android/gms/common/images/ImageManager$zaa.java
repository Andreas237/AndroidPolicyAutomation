// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.support.v4.f.g;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageManager, zab

private static final class ImageManager$zaa extends g
{

	protected final void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
	{
		super.entryRemoved(flag, ((Object) ((zab)obj)), ((Object) ((Bitmap)obj1)), ((Object) ((Bitmap)obj2)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #12  <Class zab>
	//    4    6:aload_3         
	//    5    7:checkcast       #14  <Class Bitmap>
	//    6   10:aload           4
	//    7   12:checkcast       #14  <Class Bitmap>
	//    8   15:invokespecial   #16  <Method void g.entryRemoved(boolean, Object, Object, Object)>
	//    9   18:return          
	}

	protected final int sizeOf(Object obj, Object obj1)
	{
		obj = ((Object) ((Bitmap)obj1));
	//    0    0:aload_2         
	//    1    1:checkcast       #14  <Class Bitmap>
	//    2    4:astore_1        
		return ((Bitmap) (obj)).getHeight() * ((Bitmap) (obj)).getRowBytes();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #23  <Method int Bitmap.getHeight()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #26  <Method int Bitmap.getRowBytes()>
	//    7   13:imul            
	//    8   14:ireturn         
	}
}
