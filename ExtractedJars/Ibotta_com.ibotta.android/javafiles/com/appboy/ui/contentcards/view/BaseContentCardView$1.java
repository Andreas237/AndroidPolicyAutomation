// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.view;

import android.view.View;
import com.appboy.models.cards.Card;
import com.appboy.ui.actions.UriAction;

// Referenced classes of package com.appboy.ui.contentcards.view:
//			BaseContentCardView

class BaseContentCardView$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		view = ((View) (BaseContentCardView.this));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field BaseContentCardView this$0>
	//    2    4:astore_1        
		BaseContentCardView.access$100(((BaseContentCardView) (view)), BaseContentCardView.access$000(((BaseContentCardView) (view))), val$card, ((com.appboy.ui.actions.IAction) (val$mCardAction)), getClassLogTag());
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokestatic    #35  <Method android.content.Context BaseContentCardView.access$000(BaseContentCardView)>
	//    6   10:aload_0         
	//    7   11:getfield        #23  <Field Card val$card>
	//    8   14:aload_0         
	//    9   15:getfield        #25  <Field UriAction val$mCardAction>
	//   10   18:aload_0         
	//   11   19:getfield        #21  <Field BaseContentCardView this$0>
	//   12   22:invokevirtual   #39  <Method String BaseContentCardView.getClassLogTag()>
	//   13   25:invokestatic    #43  <Method void BaseContentCardView.access$100(BaseContentCardView, android.content.Context, Card, com.appboy.ui.actions.IAction, String)>
	//   14   28:return          
	}

	final BaseContentCardView this$0;
	final Card val$card;
	final UriAction val$mCardAction;

	BaseContentCardView$1()
	{
		this$0 = final_basecontentcardview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field BaseContentCardView this$0>
		val$card = card1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Card val$card>
		val$mCardAction = UriAction.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field UriAction val$mCardAction>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
