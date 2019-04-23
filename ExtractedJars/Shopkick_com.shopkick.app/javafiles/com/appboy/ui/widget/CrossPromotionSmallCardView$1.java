// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.widget;

import android.view.View;
import com.appboy.models.cards.CrossPromotionSmallCard;

// Referenced classes of package com.appboy.ui.widget:
//			CrossPromotionSmallCardView, BaseCardView

class CrossPromotionSmallCardView$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		BaseCardView.handleCardClick(mContext, ((com.appboy.models.cards.Card) (val$card)), CrossPromotionSmallCardView.access$000(CrossPromotionSmallCardView.this), CrossPromotionSmallCardView.access$100());
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CrossPromotionSmallCardView this$0>
	//    2    4:getfield        #31  <Field android.content.Context CrossPromotionSmallCardView.mContext>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field CrossPromotionSmallCard val$card>
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field CrossPromotionSmallCardView this$0>
	//    7   15:invokestatic    #35  <Method com.appboy.ui.actions.IAction CrossPromotionSmallCardView.access$000(CrossPromotionSmallCardView)>
	//    8   18:invokestatic    #39  <Method String CrossPromotionSmallCardView.access$100()>
	//    9   21:invokestatic    #45  <Method void BaseCardView.handleCardClick(android.content.Context, com.appboy.models.cards.Card, com.appboy.ui.actions.IAction, String)>
	//   10   24:return          
	}

	final CrossPromotionSmallCardView this$0;
	final CrossPromotionSmallCard val$card;

	CrossPromotionSmallCardView$1()
	{
		this$0 = final_crosspromotionsmallcardview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CrossPromotionSmallCardView this$0>
		val$card = CrossPromotionSmallCard.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CrossPromotionSmallCard val$card>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
