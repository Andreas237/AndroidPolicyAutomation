// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.view;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.appboy.ui.contentcards.view:
//			ContentCardViewHolder, TextAnnouncementContentCardView

private class TextAnnouncementContentCardView$ViewHolder extends ContentCardViewHolder
{

	TextView getDescription()
	{
		return mDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field TextView mDescription>
	//    2    4:areturn         
	}

	TextView getTitle()
	{
		return mTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field TextView mTitle>
	//    2    4:areturn         
	}

	private final TextView mDescription;
	private final TextView mTitle;
	final TextAnnouncementContentCardView this$0;

	TextAnnouncementContentCardView$ViewHolder(View view)
	{
		this$0 = TextAnnouncementContentCardView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field TextAnnouncementContentCardView this$0>
		super(view, isUnreadIndicatorEnabled());
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #20  <Method boolean TextAnnouncementContentCardView.isUnreadIndicatorEnabled()>
	//    7   11:invokespecial   #23  <Method void ContentCardViewHolder(View, boolean)>
		mTitle = (TextView)view.findViewById(com.appboy.ui.R.id.com_appboy_content_cards_text_announcement_card_title);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:getstatic       #29  <Field int com.appboy.ui.R$id.com_appboy_content_cards_text_announcement_card_title>
	//   11   19:invokevirtual   #35  <Method View View.findViewById(int)>
	//   12   22:checkcast       #37  <Class TextView>
	//   13   25:putfield        #39  <Field TextView mTitle>
		mDescription = (TextView)view.findViewById(com.appboy.ui.R.id.com_appboy_content_cards_text_announcement_card_description);
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:getstatic       #42  <Field int com.appboy.ui.R$id.com_appboy_content_cards_text_announcement_card_description>
	//   17   33:invokevirtual   #35  <Method View View.findViewById(int)>
	//   18   36:checkcast       #37  <Class TextView>
	//   19   39:putfield        #44  <Field TextView mDescription>
	//   20   42:return          
	}
}
