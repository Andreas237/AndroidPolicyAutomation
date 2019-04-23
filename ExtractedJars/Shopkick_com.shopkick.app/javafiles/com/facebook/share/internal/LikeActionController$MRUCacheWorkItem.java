// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

private static class LikeActionController$MRUCacheWorkItem
	implements Runnable
{

	public void run()
	{
		String s = cacheItem;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String cacheItem>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          28
		{
			mruCachedItems.remove(((Object) (s)));
	//    5    9:getstatic       #25  <Field ArrayList mruCachedItems>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #37  <Method boolean ArrayList.remove(Object)>
	//    8   16:pop             
			mruCachedItems.add(0, ((Object) (cacheItem)));
	//    9   17:getstatic       #25  <Field ArrayList mruCachedItems>
	//   10   20:iconst_0        
	//   11   21:aload_0         
	//   12   22:getfield        #30  <Field String cacheItem>
	//   13   25:invokevirtual   #41  <Method void ArrayList.add(int, Object)>
		}
		if(shouldTrim && mruCachedItems.size() >= 128)
	//*  14   28:aload_0         
	//*  15   29:getfield        #32  <Field boolean shouldTrim>
	//*  16   32:ifeq            87
	//*  17   35:getstatic       #25  <Field ArrayList mruCachedItems>
	//*  18   38:invokevirtual   #45  <Method int ArrayList.size()>
	//*  19   41:sipush          128
	//*  20   44:icmplt          87
		{
			Object obj;
			for(; 64 < mruCachedItems.size(); LikeActionController.access$400().remove(obj))
	//*  21   47:bipush          64
	//*  22   49:getstatic       #25  <Field ArrayList mruCachedItems>
	//*  23   52:invokevirtual   #45  <Method int ArrayList.size()>
	//*  24   55:icmpge          87
			{
				obj = ((Object) (mruCachedItems));
	//   25   58:getstatic       #25  <Field ArrayList mruCachedItems>
	//   26   61:astore_1        
				obj = ((Object) ((String)((ArrayList) (obj)).remove(((ArrayList) (obj)).size() - 1)));
	//   27   62:aload_1         
	//   28   63:aload_1         
	//   29   64:invokevirtual   #45  <Method int ArrayList.size()>
	//   30   67:iconst_1        
	//   31   68:isub            
	//   32   69:invokevirtual   #48  <Method Object ArrayList.remove(int)>
	//   33   72:checkcast       #50  <Class String>
	//   34   75:astore_1        
			}

	//   35   76:invokestatic    #54  <Method ConcurrentHashMap LikeActionController.access$400()>
	//   36   79:aload_1         
	//   37   80:invokevirtual   #59  <Method Object ConcurrentHashMap.remove(Object)>
	//   38   83:pop             
		}
	//*  39   84:goto            47
	//   40   87:return          
	}

	private static ArrayList mruCachedItems = new ArrayList();
	private String cacheItem;
	private boolean shouldTrim;

	static 
	{
	//    0    0:new             #20  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ArrayList()>
	//    3    7:putstatic       #25  <Field ArrayList mruCachedItems>
	//*   4   10:return          
	}

	LikeActionController$MRUCacheWorkItem(String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		cacheItem = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field String cacheItem>
		shouldTrim = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #32  <Field boolean shouldTrim>
	//    8   14:return          
	}
}
