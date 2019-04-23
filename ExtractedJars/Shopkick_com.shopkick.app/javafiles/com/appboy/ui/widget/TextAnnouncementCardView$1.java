// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.widget;

import android.view.View;
import com.appboy.models.cards.TextAnnouncementCard;

// Referenced classes of package com.appboy.ui.widget:
//			TextAnnouncementCardView, BaseCardView

class TextAnnouncementCardView$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		BaseCardView.handleCardClick(mContext, ((com.appboy.models.cards.Card) (val$card)), TextAnnouncementCardView.access$000(TextAnnouncementCardView.this), TextAnnouncementCardView.access$100());
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field TextAnnouncementCardView this$0>
	//    2    4:getfield        #31  <Field android.content.Context TextAnnouncementCardView.mContext>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field TextAnnouncementCard val$card>
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field TextAnnouncementCardView this$0>
	//    7   15:invokestatic    #35  <Method com.appboy.ui.actions.IAction TextAnnouncementCardView.access$000(TextAnnouncementCardView)>
	//    8   18:invokestatic    #39  <Method String TextAnnouncementCardView.access$100()>
	//    9   21:invokestatic    #45  <Method void BaseCardView.handleCardClick(android.content.Context, com.appboy.models.cards.Card, com.appboy.ui.actions.IAction, String)>
	//   10   24:return          
	}

	final TextAnnouncementCardView this$0;
	final TextAnnouncementCard val$card;

	TextAnnouncementCardView$1()
	{
		this$0 = final_textannouncementcardview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field TextAnnouncementCardView this$0>
		val$card = TextAnnouncementCard.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field TextAnnouncementCard val$card>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
