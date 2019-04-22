// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.view.MotionEvent;
import android.widget.ListView;

// Referenced classes of package com.appboy.ui:
//			AppboyXamarinFormsFeedFragment

public class AppboyXamarinFormsFeedFragment$FeedGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
{

	public boolean onDown(MotionEvent motionevent)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
	{
		long l = (motionevent1.getEventTime() - motionevent.getEventTime()) * 2L;
	//    0    0:aload_2         
	//    1    1:invokevirtual   #27  <Method long MotionEvent.getEventTime()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method long MotionEvent.getEventTime()>
	//    4    8:lsub            
	//    5    9:ldc2w           #28  <Long 2L>
	//    6   12:lmul            
	//    7   13:lstore          6
		int i = (int)((f1 * (float)l) / 1000F);
	//    8   15:fload           4
	//    9   17:lload           6
	//   10   19:l2f             
	//   11   20:fmul            
	//   12   21:ldc1            #30  <Float 1000F>
	//   13   23:fdiv            
	//   14   24:f2i             
	//   15   25:istore          5
		getListView().smoothScrollBy(-i, (int)(l * 2L));
	//   16   27:aload_0         
	//   17   28:getfield        #13  <Field AppboyXamarinFormsFeedFragment this$0>
	//   18   31:invokevirtual   #34  <Method ListView AppboyXamarinFormsFeedFragment.getListView()>
	//   19   34:iload           5
	//   20   36:ineg            
	//   21   37:lload           6
	//   22   39:ldc2w           #28  <Long 2L>
	//   23   42:lmul            
	//   24   43:l2i             
	//   25   44:invokevirtual   #40  <Method void ListView.smoothScrollBy(int, int)>
		return true;
	//   26   47:iconst_1        
	//   27   48:ireturn         
	}

	public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
	{
		getListView().smoothScrollBy((int)f1, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field AppboyXamarinFormsFeedFragment this$0>
	//    2    4:invokevirtual   #34  <Method ListView AppboyXamarinFormsFeedFragment.getListView()>
	//    3    7:fload           4
	//    4    9:f2i             
	//    5   10:iconst_0        
	//    6   11:invokevirtual   #40  <Method void ListView.smoothScrollBy(int, int)>
		return true;
	//    7   14:iconst_1        
	//    8   15:ireturn         
	}

	final AppboyXamarinFormsFeedFragment this$0;

	public AppboyXamarinFormsFeedFragment$FeedGestureListener()
	{
		this$0 = AppboyXamarinFormsFeedFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field AppboyXamarinFormsFeedFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
	//    5    9:return          
	}
}
