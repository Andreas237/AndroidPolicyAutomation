// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.appboy.ui.contentcards.view:
//			ContentCardViewHolder, ShortNewsContentCardView

private class ShortNewsContentCardView$ViewHolder extends ContentCardViewHolder
{

	TextView getDescription()
	{
		return mDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field TextView mDescription>
	//    2    4:areturn         
	}

	ImageView getImageView()
	{
		View view = mCardImage;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field View mCardImage>
	//    2    4:astore_1        
		if(view instanceof ImageView)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #71  <Class ImageView>
	//*   5    9:ifeq            17
			return (ImageView)view;
	//    6   12:aload_1         
	//    7   13:checkcast       #71  <Class ImageView>
	//    8   16:areturn         
		else
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
	}

	TextView getTitle()
	{
		return mTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field TextView mTitle>
	//    2    4:areturn         
	}

	private View mCardImage;
	private final TextView mDescription;
	private final TextView mTitle;
	final ShortNewsContentCardView this$0;

	ShortNewsContentCardView$ViewHolder(View view)
	{
		this$0 = ShortNewsContentCardView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ShortNewsContentCardView this$0>
		super(view, isUnreadIndicatorEnabled());
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #22  <Method boolean ShortNewsContentCardView.isUnreadIndicatorEnabled()>
	//    7   11:invokespecial   #25  <Method void ContentCardViewHolder(View, boolean)>
		mCardImage = createCardImageWithStyle(getContext(), view, com.appboy.ui.R.style.Appboy_ContentCards_ShortNews_ImageContainer_Image, com.appboy.ui.R.id.com_appboy_content_cards_short_news_card_image_container);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #29  <Method android.content.Context ShortNewsContentCardView.getContext()>
	//   12   20:aload_2         
	//   13   21:getstatic       #35  <Field int com.appboy.ui.R$style.Appboy_ContentCards_ShortNews_ImageContainer_Image>
	//   14   24:getstatic       #40  <Field int com.appboy.ui.R$id.com_appboy_content_cards_short_news_card_image_container>
	//   15   27:invokevirtual   #44  <Method View createCardImageWithStyle(android.content.Context, View, int, int)>
	//   16   30:putfield        #46  <Field View mCardImage>
		mTitle = (TextView)view.findViewById(com.appboy.ui.R.id.com_appboy_content_cards_short_news_card_title);
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:getstatic       #49  <Field int com.appboy.ui.R$id.com_appboy_content_cards_short_news_card_title>
	//   20   38:invokevirtual   #55  <Method View View.findViewById(int)>
	//   21   41:checkcast       #57  <Class TextView>
	//   22   44:putfield        #59  <Field TextView mTitle>
		mDescription = (TextView)view.findViewById(com.appboy.ui.R.id.com_appboy_content_cards_short_news_card_description);
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:getstatic       #62  <Field int com.appboy.ui.R$id.com_appboy_content_cards_short_news_card_description>
	//   26   52:invokevirtual   #55  <Method View View.findViewById(int)>
	//   27   55:checkcast       #57  <Class TextView>
	//   28   58:putfield        #64  <Field TextView mDescription>
	//   29   61:return          
	}
}
