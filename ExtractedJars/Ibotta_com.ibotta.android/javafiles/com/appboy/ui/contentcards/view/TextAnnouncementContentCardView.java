// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.*;
import android.widget.TextView;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.TextAnnouncementCard;
import com.appboy.support.StringUtils;

// Referenced classes of package com.appboy.ui.contentcards.view:
//			BaseContentCardView, ContentCardViewHolder

public class TextAnnouncementContentCardView extends BaseContentCardView
{
	private class ViewHolder extends ContentCardViewHolder
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

		ViewHolder(View view)
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


	public TextAnnouncementContentCardView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void BaseContentCardView(Context)>
	//    3    5:return          
	}

	public volatile void bindViewHolder(ContentCardViewHolder contentcardviewholder, Card card)
	{
		bindViewHolder(contentcardviewholder, (TextAnnouncementCard)card);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #17  <Class TextAnnouncementCard>
	//    4    6:invokevirtual   #20  <Method void bindViewHolder(ContentCardViewHolder, TextAnnouncementCard)>
	//    5    9:return          
	}

	public void bindViewHolder(ContentCardViewHolder contentcardviewholder, TextAnnouncementCard textannouncementcard)
	{
		super.bindViewHolder(contentcardviewholder, ((Card) (textannouncementcard)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void BaseContentCardView.bindViewHolder(ContentCardViewHolder, Card)>
		ViewHolder viewholder = (ViewHolder)contentcardviewholder;
	//    4    6:aload_1         
	//    5    7:checkcast       #7   <Class TextAnnouncementContentCardView$ViewHolder>
	//    6   10:astore_3        
		viewholder.getTitle().setText(((CharSequence) (textannouncementcard.getTitle())));
	//    7   11:aload_3         
	//    8   12:invokevirtual   #26  <Method TextView TextAnnouncementContentCardView$ViewHolder.getTitle()>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #29  <Method String TextAnnouncementCard.getTitle()>
	//   11   19:invokevirtual   #35  <Method void TextView.setText(CharSequence)>
		viewholder.getDescription().setText(((CharSequence) (textannouncementcard.getDescription())));
	//   12   22:aload_3         
	//   13   23:invokevirtual   #38  <Method TextView TextAnnouncementContentCardView$ViewHolder.getDescription()>
	//   14   26:aload_2         
	//   15   27:invokevirtual   #40  <Method String TextAnnouncementCard.getDescription()>
	//   16   30:invokevirtual   #35  <Method void TextView.setText(CharSequence)>
		if(StringUtils.isNullOrBlank(textannouncementcard.getDomain()))
	//*  17   33:aload_2         
	//*  18   34:invokevirtual   #43  <Method String TextAnnouncementCard.getDomain()>
	//*  19   37:invokestatic    #49  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  20   40:ifeq            51
			contentcardviewholder = ((ContentCardViewHolder) (textannouncementcard.getUrl()));
	//   21   43:aload_2         
	//   22   44:invokevirtual   #52  <Method String TextAnnouncementCard.getUrl()>
	//   23   47:astore_1        
		else
	//*  24   48:goto            56
			contentcardviewholder = ((ContentCardViewHolder) (textannouncementcard.getDomain()));
	//   25   51:aload_2         
	//   26   52:invokevirtual   #43  <Method String TextAnnouncementCard.getDomain()>
	//   27   55:astore_1        
		viewholder.setActionHintText(((String) (contentcardviewholder)));
	//   28   56:aload_3         
	//   29   57:aload_1         
	//   30   58:invokevirtual   #56  <Method void TextAnnouncementContentCardView$ViewHolder.setActionHintText(String)>
	//   31   61:return          
	}

	public ContentCardViewHolder createViewHolder(ViewGroup viewgroup)
	{
		viewgroup = ((ViewGroup) (LayoutInflater.from(viewgroup.getContext()).inflate(com.appboy.ui.R.layout.com_appboy_text_announcement_content_card, viewgroup, false)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #64  <Method Context ViewGroup.getContext()>
	//    2    4:invokestatic    #70  <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    7:getstatic       #76  <Field int com.appboy.ui.R$layout.com_appboy_text_announcement_content_card>
	//    4   10:aload_1         
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #80  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    7   15:astore_1        
		((View) (viewgroup)).setBackground(getResources().getDrawable(com.appboy.ui.R.drawable.com_appboy_card_background));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #84  <Method Resources getResources()>
	//   11   21:getstatic       #89  <Field int com.appboy.ui.R$drawable.com_appboy_card_background>
	//   12   24:invokevirtual   #95  <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   13   27:invokevirtual   #101 <Method void View.setBackground(android.graphics.drawable.Drawable)>
		return ((ContentCardViewHolder) (new ViewHolder(((View) (viewgroup)))));
	//   14   30:new             #7   <Class TextAnnouncementContentCardView$ViewHolder>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokespecial   #104 <Method void TextAnnouncementContentCardView$ViewHolder(TextAnnouncementContentCardView, View)>
	//   19   39:areturn         
	}
}
