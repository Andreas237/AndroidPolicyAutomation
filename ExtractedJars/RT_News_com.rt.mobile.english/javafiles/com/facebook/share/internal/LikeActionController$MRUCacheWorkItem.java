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
		if(cacheItem != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field String cacheItem>
	//*   2    4:ifnull          29
		{
			mruCachedItems.remove(((Object) (cacheItem)));
	//    3    7:getstatic       #25  <Field ArrayList mruCachedItems>
	//    4   10:aload_0         
	//    5   11:getfield        #30  <Field String cacheItem>
	//    6   14:invokevirtual   #37  <Method boolean ArrayList.remove(Object)>
	//    7   17:pop             
			mruCachedItems.add(0, ((Object) (cacheItem)));
	//    8   18:getstatic       #25  <Field ArrayList mruCachedItems>
	//    9   21:iconst_0        
	//   10   22:aload_0         
	//   11   23:getfield        #30  <Field String cacheItem>
	//   12   26:invokevirtual   #41  <Method void ArrayList.add(int, Object)>
		}
		if(shouldTrim && mruCachedItems.size() >= 128)
	//*  13   29:aload_0         
	//*  14   30:getfield        #32  <Field boolean shouldTrim>
	//*  15   33:ifeq            88
	//*  16   36:getstatic       #25  <Field ArrayList mruCachedItems>
	//*  17   39:invokevirtual   #45  <Method int ArrayList.size()>
	//*  18   42:sipush          128
	//*  19   45:icmplt          88
		{
			String s;
			for(; 64 < mruCachedItems.size(); LikeActionController.access$400().remove(((Object) (s))))
	//*  20   48:bipush          64
	//*  21   50:getstatic       #25  <Field ArrayList mruCachedItems>
	//*  22   53:invokevirtual   #45  <Method int ArrayList.size()>
	//*  23   56:icmpge          88
				s = (String)mruCachedItems.remove(mruCachedItems.size() - 1);
	//   24   59:getstatic       #25  <Field ArrayList mruCachedItems>
	//   25   62:getstatic       #25  <Field ArrayList mruCachedItems>
	//   26   65:invokevirtual   #45  <Method int ArrayList.size()>
	//   27   68:iconst_1        
	//   28   69:isub            
	//   29   70:invokevirtual   #48  <Method Object ArrayList.remove(int)>
	//   30   73:checkcast       #50  <Class String>
	//   31   76:astore_1        

	//   32   77:invokestatic    #54  <Method ConcurrentHashMap LikeActionController.access$400()>
	//   33   80:aload_1         
	//   34   81:invokevirtual   #59  <Method Object ConcurrentHashMap.remove(Object)>
	//   35   84:pop             
		}
	//*  36   85:goto            48
	//   37   88:return          
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
