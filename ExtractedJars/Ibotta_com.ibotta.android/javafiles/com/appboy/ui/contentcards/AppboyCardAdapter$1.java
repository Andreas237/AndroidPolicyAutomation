// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards;


// Referenced classes of package com.appboy.ui.contentcards:
//			AppboyCardAdapter

class AppboyCardAdapter$1
	implements Runnable
{

	public void run()
	{
		notifyItemChanged(val$adapterPosition);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AppboyCardAdapter this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field int val$adapterPosition>
	//    4    8:invokevirtual   #30  <Method void AppboyCardAdapter.notifyItemChanged(int)>
	//    5   11:return          
	}

	final AppboyCardAdapter this$0;
	final int val$adapterPosition;

	AppboyCardAdapter$1()
	{
		this$0 = final_appboycardadapter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AppboyCardAdapter this$0>
		val$adapterPosition = I.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field int val$adapterPosition>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
