// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			LruBitmapPool

static class LruBitmapPool$ThrowingBitmapTracker
	implements LruBitmapPool.BitmapTracker
{

	public void add(Bitmap bitmap)
	{
		if(bitmaps.contains(((Object) (bitmap))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Set bitmaps>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #36  <Method boolean Set.contains(Object)>
	//*   4   10:ifeq            69
		{
			throw new IllegalStateException((new StringBuilder()).append("Can't add already added bitmap: ").append(((Object) (bitmap))).append(" [").append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).append("]").toString());
	//    5   13:new             #38  <Class IllegalStateException>
	//    6   16:dup             
	//    7   17:new             #40  <Class StringBuilder>
	//    8   20:dup             
	//    9   21:invokespecial   #41  <Method void StringBuilder()>
	//   10   24:ldc1            #43  <String "Can't add already added bitmap: ">
	//   11   26:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   12   29:aload_1         
	//   13   30:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//   14   33:ldc1            #52  <String " [">
	//   15   35:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   16   38:aload_1         
	//   17   39:invokevirtual   #58  <Method int Bitmap.getWidth()>
	//   18   42:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   19   45:ldc1            #63  <String "x">
	//   20   47:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   21   50:aload_1         
	//   22   51:invokevirtual   #66  <Method int Bitmap.getHeight()>
	//   23   54:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   24   57:ldc1            #68  <String "]">
	//   25   59:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   26   62:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   27   65:invokespecial   #75  <Method void IllegalStateException(String)>
	//   28   68:athrow          
		} else
		{
			bitmaps.add(((Object) (bitmap)));
	//   29   69:aload_0         
	//   30   70:getfield        #27  <Field Set bitmaps>
	//   31   73:aload_1         
	//   32   74:invokeinterface #77  <Method boolean Set.add(Object)>
	//   33   79:pop             
			return;
	//   34   80:return          
		}
	}

	public void remove(Bitmap bitmap)
	{
		if(!bitmaps.contains(((Object) (bitmap))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Set bitmaps>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #36  <Method boolean Set.contains(Object)>
	//*   4   10:ifne            23
		{
			throw new IllegalStateException("Cannot remove bitmap not in tracker");
	//    5   13:new             #38  <Class IllegalStateException>
	//    6   16:dup             
	//    7   17:ldc1            #80  <String "Cannot remove bitmap not in tracker">
	//    8   19:invokespecial   #75  <Method void IllegalStateException(String)>
	//    9   22:athrow          
		} else
		{
			bitmaps.remove(((Object) (bitmap)));
	//   10   23:aload_0         
	//   11   24:getfield        #27  <Field Set bitmaps>
	//   12   27:aload_1         
	//   13   28:invokeinterface #82  <Method boolean Set.remove(Object)>
	//   14   33:pop             
			return;
	//   15   34:return          
		}
	}

	private final Set bitmaps = Collections.synchronizedSet(((Set) (new HashSet())));

	private LruBitmapPool$ThrowingBitmapTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void HashSet()>
	//    6   12:invokestatic    #25  <Method Set Collections.synchronizedSet(Set)>
	//    7   15:putfield        #27  <Field Set bitmaps>
	//    8   18:return          
	}
}
