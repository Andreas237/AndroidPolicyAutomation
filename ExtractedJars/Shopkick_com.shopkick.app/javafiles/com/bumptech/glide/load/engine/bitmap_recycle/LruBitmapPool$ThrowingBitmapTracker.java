// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			LruBitmapPool

private static class LruBitmapPool$ThrowingBitmapTracker
	implements LruBitmapPool.BitmapTracker
{

	public void add(Bitmap bitmap)
	{
		if(!bitmaps.contains(((Object) (bitmap))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Set bitmaps>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #36  <Method boolean Set.contains(Object)>
	//*   4   10:ifne            25
		{
			bitmaps.add(((Object) (bitmap)));
	//    5   13:aload_0         
	//    6   14:getfield        #27  <Field Set bitmaps>
	//    7   17:aload_1         
	//    8   18:invokeinterface #38  <Method boolean Set.add(Object)>
	//    9   23:pop             
			return;
	//   10   24:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   25:new             #40  <Class StringBuilder>
	//   12   28:dup             
	//   13   29:invokespecial   #41  <Method void StringBuilder()>
	//   14   32:astore_2        
			stringbuilder.append("Can't add already added bitmap: ");
	//   15   33:aload_2         
	//   16   34:ldc1            #43  <String "Can't add already added bitmap: ">
	//   17   36:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   18   39:pop             
			stringbuilder.append(((Object) (bitmap)));
	//   19   40:aload_2         
	//   20   41:aload_1         
	//   21   42:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//   22   45:pop             
			stringbuilder.append(" [");
	//   23   46:aload_2         
	//   24   47:ldc1            #52  <String " [">
	//   25   49:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			stringbuilder.append(bitmap.getWidth());
	//   27   53:aload_2         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #58  <Method int Bitmap.getWidth()>
	//   30   58:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   31   61:pop             
			stringbuilder.append("x");
	//   32   62:aload_2         
	//   33   63:ldc1            #63  <String "x">
	//   34   65:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
			stringbuilder.append(bitmap.getHeight());
	//   36   69:aload_2         
	//   37   70:aload_1         
	//   38   71:invokevirtual   #66  <Method int Bitmap.getHeight()>
	//   39   74:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   40   77:pop             
			stringbuilder.append("]");
	//   41   78:aload_2         
	//   42   79:ldc1            #68  <String "]">
	//   43   81:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   44   84:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   45   85:new             #70  <Class IllegalStateException>
	//   46   88:dup             
	//   47   89:aload_2         
	//   48   90:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   49   93:invokespecial   #77  <Method void IllegalStateException(String)>
	//   50   96:athrow          
		}
	}

	public void remove(Bitmap bitmap)
	{
		if(bitmaps.contains(((Object) (bitmap))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Set bitmaps>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #36  <Method boolean Set.contains(Object)>
	//*   4   10:ifeq            25
		{
			bitmaps.remove(((Object) (bitmap)));
	//    5   13:aload_0         
	//    6   14:getfield        #27  <Field Set bitmaps>
	//    7   17:aload_1         
	//    8   18:invokeinterface #80  <Method boolean Set.remove(Object)>
	//    9   23:pop             
			return;
	//   10   24:return          
		} else
		{
			throw new IllegalStateException("Cannot remove bitmap not in tracker");
	//   11   25:new             #70  <Class IllegalStateException>
	//   12   28:dup             
	//   13   29:ldc1            #82  <String "Cannot remove bitmap not in tracker">
	//   14   31:invokespecial   #77  <Method void IllegalStateException(String)>
	//   15   34:athrow          
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
