// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.view;

import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.appboy.ui.contentcards.view:
//			ContentCardViewHolder, BannerImageContentCardView

private class BannerImageContentCardView$ViewHolder extends ContentCardViewHolder
{

	ImageView getImageView()
	{
		View view = mCardImage;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field View mCardImage>
	//    2    4:astore_1        
		if(view instanceof ImageView)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #48  <Class ImageView>
	//*   5    9:ifeq            17
			return (ImageView)view;
	//    6   12:aload_1         
	//    7   13:checkcast       #48  <Class ImageView>
	//    8   16:areturn         
		else
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
	}

	private View mCardImage;
	final BannerImageContentCardView this$0;

	BannerImageContentCardView$ViewHolder(View view)
	{
		this$0 = BannerImageContentCardView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field BannerImageContentCardView this$0>
		super(view, isUnreadIndicatorEnabled());
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #19  <Method boolean BannerImageContentCardView.isUnreadIndicatorEnabled()>
	//    7   11:invokespecial   #22  <Method void ContentCardViewHolder(View, boolean)>
		mCardImage = createCardImageWithStyle(getContext(), view, com.appboy.ui.R.style.Appboy_ContentCards_BannerImage_ImageContainer_Image, com.appboy.ui.R.id.com_appboy_content_cards_banner_image_card_image_container);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #26  <Method android.content.Context BannerImageContentCardView.getContext()>
	//   12   20:aload_2         
	//   13   21:getstatic       #32  <Field int com.appboy.ui.R$style.Appboy_ContentCards_BannerImage_ImageContainer_Image>
	//   14   24:getstatic       #37  <Field int com.appboy.ui.R$id.com_appboy_content_cards_banner_image_card_image_container>
	//   15   27:invokevirtual   #41  <Method View createCardImageWithStyle(android.content.Context, View, int, int)>
	//   16   30:putfield        #43  <Field View mCardImage>
	//   17   33:return          
	}
}
