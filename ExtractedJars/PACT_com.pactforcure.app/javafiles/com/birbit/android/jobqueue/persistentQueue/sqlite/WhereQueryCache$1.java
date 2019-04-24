// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.persistentQueue.sqlite;

import android.support.v4.util.LruCache;

// Referenced classes of package com.birbit.android.jobqueue.persistentQueue.sqlite:
//			WhereQueryCache, Where

class WhereQueryCache$1 extends LruCache
{

	protected void entryRemoved(boolean flag, Long long1, Where where, Where where1)
	{
		where.destroy();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #25  <Method void Where.destroy()>
	//    2    4:return          
	}

	protected volatile void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
	{
		entryRemoved(flag, (Long)obj, (Where)obj1, (Where)obj2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #28  <Class Long>
	//    4    6:aload_3         
	//    5    7:checkcast       #21  <Class Where>
	//    6   10:aload           4
	//    7   12:checkcast       #21  <Class Where>
	//    8   15:invokevirtual   #30  <Method void entryRemoved(boolean, Long, Where, Where)>
	//    9   18:return          
	}

	final WhereQueryCache this$0;

	WhereQueryCache$1(int i)
	{
		this$0 = WhereQueryCache.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field WhereQueryCache this$0>
		super(i);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokespecial   #16  <Method void LruCache(int)>
	//    6   10:return          
	}
}
