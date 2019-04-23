// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.widget;

import android.view.View;
import com.appboy.models.cards.BannerImageCard;

// Referenced classes of package com.appboy.ui.widget:
//			BannerImageCardView, BaseCardView

class BannerImageCardView$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		BaseCardView.handleCardClick(mContext, ((com.appboy.models.cards.Card) (val$card)), BannerImageCardView.access$000(BannerImageCardView.this), BannerImageCardView.access$100(), false);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BannerImageCardView this$0>
	//    2    4:getfield        #31  <Field android.content.Context BannerImageCardView.mContext>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field BannerImageCard val$card>
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field BannerImageCardView this$0>
	//    7   15:invokestatic    #35  <Method com.appboy.ui.actions.IAction BannerImageCardView.access$000(BannerImageCardView)>
	//    8   18:invokestatic    #39  <Method String BannerImageCardView.access$100()>
	//    9   21:iconst_0        
	//   10   22:invokestatic    #45  <Method void BaseCardView.handleCardClick(android.content.Context, com.appboy.models.cards.Card, com.appboy.ui.actions.IAction, String, boolean)>
	//   11   25:return          
	}

	final BannerImageCardView this$0;
	final BannerImageCard val$card;

	BannerImageCardView$1()
	{
		this$0 = final_bannerimagecardview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BannerImageCardView this$0>
		val$card = BannerImageCard.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field BannerImageCard val$card>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
