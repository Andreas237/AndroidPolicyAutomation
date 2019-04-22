// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import com.appboy.ui.contentcards.AppboyCardAdapter;

// Referenced classes of package com.appboy.ui:
//			AppboyContentCardsFragment

class AppboyContentCardsFragment$3
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (val$savedInstanceState.getParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY")));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle val$savedInstanceState>
	//    2    4:ldc1            #28  <String "LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY">
	//    3    6:invokevirtual   #34  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    4    9:astore_1        
		android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = AppboyContentCardsFragment.access$800(AppboyContentCardsFragment.this).getLayoutManager();
	//    5   10:aload_0         
	//    6   11:getfield        #19  <Field AppboyContentCardsFragment this$0>
	//    7   14:invokestatic    #38  <Method RecyclerView AppboyContentCardsFragment.access$800(AppboyContentCardsFragment)>
	//    8   17:invokevirtual   #44  <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//    9   20:astore_2        
		if(obj != null && layoutmanager != null)
	//*  10   21:aload_1         
	//*  11   22:ifnull          34
	//*  12   25:aload_2         
	//*  13   26:ifnull          34
			layoutmanager.onRestoreInstanceState(((android.os.Parcelable) (obj)));
	//   14   29:aload_2         
	//   15   30:aload_1         
	//   16   31:invokevirtual   #50  <Method void android.support.v7.widget.RecyclerView$LayoutManager.onRestoreInstanceState(android.os.Parcelable)>
		obj = ((Object) (val$savedInstanceState.getStringArrayList("KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY")));
	//   17   34:aload_0         
	//   18   35:getfield        #21  <Field Bundle val$savedInstanceState>
	//   19   38:ldc1            #52  <String "KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY">
	//   20   40:invokevirtual   #56  <Method java.util.ArrayList Bundle.getStringArrayList(String)>
	//   21   43:astore_1        
		if(obj != null)
	//*  22   44:aload_1         
	//*  23   45:ifnull          59
			AppboyContentCardsFragment.access$400(AppboyContentCardsFragment.this).setImpressedCardIds(((java.util.List) (obj)));
	//   24   48:aload_0         
	//   25   49:getfield        #19  <Field AppboyContentCardsFragment this$0>
	//   26   52:invokestatic    #60  <Method AppboyCardAdapter AppboyContentCardsFragment.access$400(AppboyContentCardsFragment)>
	//   27   55:aload_1         
	//   28   56:invokevirtual   #66  <Method void AppboyCardAdapter.setImpressedCardIds(java.util.List)>
	//   29   59:return          
	}

	final AppboyContentCardsFragment this$0;
	final Bundle val$savedInstanceState;

	AppboyContentCardsFragment$3()
	{
		this$0 = final_appboycontentcardsfragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AppboyContentCardsFragment this$0>
		val$savedInstanceState = Bundle.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Bundle val$savedInstanceState>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
