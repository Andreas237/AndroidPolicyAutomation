// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.widget;

import android.view.View;
import com.appboy.models.cards.TextAnnouncementCard;

// Referenced classes of package com.appboy.ui.widget:
//			TextAnnouncementCardView

class TextAnnouncementCardView$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		view = ((View) (TextAnnouncementCardView.this));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field TextAnnouncementCardView this$0>
	//    2    4:astore_1        
		((TextAnnouncementCardView) (view)).handleCardClick(((TextAnnouncementCardView) (view)).mContext, ((com.appboy.models.cards.Card) (val$card)), TextAnnouncementCardView.access$000(TextAnnouncementCardView.this), TextAnnouncementCardView.access$100());
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:getfield        #31  <Field android.content.Context TextAnnouncementCardView.mContext>
	//    6   10:aload_0         
	//    7   11:getfield        #21  <Field TextAnnouncementCard val$card>
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field TextAnnouncementCardView this$0>
	//   10   18:invokestatic    #35  <Method com.appboy.ui.actions.IAction TextAnnouncementCardView.access$000(TextAnnouncementCardView)>
	//   11   21:invokestatic    #39  <Method String TextAnnouncementCardView.access$100()>
	//   12   24:invokevirtual   #43  <Method void TextAnnouncementCardView.handleCardClick(android.content.Context, com.appboy.models.cards.Card, com.appboy.ui.actions.IAction, String)>
	//   13   27:return          
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
