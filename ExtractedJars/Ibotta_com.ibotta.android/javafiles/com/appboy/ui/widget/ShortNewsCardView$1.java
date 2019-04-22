// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.widget;

import android.view.View;
import com.appboy.models.cards.ShortNewsCard;

// Referenced classes of package com.appboy.ui.widget:
//			ShortNewsCardView

class ShortNewsCardView$1
	implements android.view.
{

	public void onClick(View view)
	{
		view = ((View) (ShortNewsCardView.this));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ShortNewsCardView this$0>
	//    2    4:astore_1        
		((ShortNewsCardView) (view)).handleCardClick(((ShortNewsCardView) (view)).mContext, ((com.appboy.models.cards.Card) (val$card)), ShortNewsCardView.access$000(ShortNewsCardView.this), ShortNewsCardView.access$100());
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:getfield        #31  <Field android.content.Context ShortNewsCardView.mContext>
	//    6   10:aload_0         
	//    7   11:getfield        #21  <Field ShortNewsCard val$card>
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field ShortNewsCardView this$0>
	//   10   18:invokestatic    #35  <Method com.appboy.ui.actions.IAction ShortNewsCardView.access$000(ShortNewsCardView)>
	//   11   21:invokestatic    #39  <Method String ShortNewsCardView.access$100()>
	//   12   24:invokevirtual   #43  <Method void ShortNewsCardView.handleCardClick(android.content.Context, com.appboy.models.cards.Card, com.appboy.ui.actions.IAction, String)>
	//   13   27:return          
	}

	final ShortNewsCardView this$0;
	final ShortNewsCard val$card;

	ShortNewsCardView$1()
	{
		this$0 = final_shortnewscardview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ShortNewsCardView this$0>
		val$card = ShortNewsCard.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ShortNewsCard val$card>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
