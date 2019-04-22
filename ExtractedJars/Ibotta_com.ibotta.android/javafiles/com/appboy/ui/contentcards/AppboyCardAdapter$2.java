// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards;


// Referenced classes of package com.appboy.ui.contentcards:
//			AppboyCardAdapter

class AppboyCardAdapter$2
	implements Runnable
{

	public void run()
	{
		int i = val$lastVisibleIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int val$lastVisibleIndex>
	//    2    4:istore_1        
		int j = val$firstVisibleIndex;
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field int val$firstVisibleIndex>
	//    5    9:istore_2        
		notifyItemRangeChanged(j, (i - j) + 1);
	//    6   10:aload_0         
	//    7   11:getfield        #20  <Field AppboyCardAdapter this$0>
	//    8   14:iload_2         
	//    9   15:iload_1         
	//   10   16:iload_2         
	//   11   17:isub            
	//   12   18:iconst_1        
	//   13   19:iadd            
	//   14   20:invokevirtual   #32  <Method void AppboyCardAdapter.notifyItemRangeChanged(int, int)>
	//   15   23:return          
	}

	final AppboyCardAdapter this$0;
	final int val$firstVisibleIndex;
	final int val$lastVisibleIndex;

	AppboyCardAdapter$2()
	{
		this$0 = final_appboycardadapter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field AppboyCardAdapter this$0>
		val$lastVisibleIndex = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int val$lastVisibleIndex>
		val$firstVisibleIndex = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #24  <Field int val$firstVisibleIndex>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void Object()>
	//   11   19:return          
	}
}
