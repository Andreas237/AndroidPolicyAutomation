// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.*;
import android.widget.ImageView;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.models.cards.Card;

// Referenced classes of package com.appboy.ui.contentcards.view:
//			BaseContentCardView, ContentCardViewHolder

public class BannerImageContentCardView extends BaseContentCardView
{
	private class ViewHolder extends ContentCardViewHolder
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

		ViewHolder(View view)
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
		//   11   17:invokevirtual   #26  <Method Context BannerImageContentCardView.getContext()>
		//   12   20:aload_2         
		//   13   21:getstatic       #32  <Field int com.appboy.ui.R$style.Appboy_ContentCards_BannerImage_ImageContainer_Image>
		//   14   24:getstatic       #37  <Field int com.appboy.ui.R$id.com_appboy_content_cards_banner_image_card_image_container>
		//   15   27:invokevirtual   #41  <Method View createCardImageWithStyle(Context, View, int, int)>
		//   16   30:putfield        #43  <Field View mCardImage>
		//   17   33:return          
		}
	}


	public BannerImageContentCardView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void BaseContentCardView(Context)>
	//    3    5:return          
	}

	public void bindViewHolder(ContentCardViewHolder contentcardviewholder, BannerImageCard bannerimagecard)
	{
		super.bindViewHolder(contentcardviewholder, ((Card) (bannerimagecard)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void BaseContentCardView.bindViewHolder(ContentCardViewHolder, Card)>
		setOptionalCardImage(((ViewHolder)contentcardviewholder).getImageView(), bannerimagecard.getAspectRatio(), bannerimagecard.getImageUrl(), 6F);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:checkcast       #7   <Class BannerImageContentCardView$ViewHolder>
	//    7   11:invokevirtual   #25  <Method ImageView BannerImageContentCardView$ViewHolder.getImageView()>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #31  <Method float BannerImageCard.getAspectRatio()>
	//   10   18:aload_2         
	//   11   19:invokevirtual   #35  <Method String BannerImageCard.getImageUrl()>
	//   12   22:ldc1            #11  <Float 6F>
	//   13   24:invokevirtual   #39  <Method void setOptionalCardImage(ImageView, float, String, float)>
	//   14   27:return          
	}

	public volatile void bindViewHolder(ContentCardViewHolder contentcardviewholder, Card card)
	{
		bindViewHolder(contentcardviewholder, (BannerImageCard)card);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #27  <Class BannerImageCard>
	//    4    6:invokevirtual   #41  <Method void bindViewHolder(ContentCardViewHolder, BannerImageCard)>
	//    5    9:return          
	}

	public ContentCardViewHolder createViewHolder(ViewGroup viewgroup)
	{
		viewgroup = ((ViewGroup) (LayoutInflater.from(viewgroup.getContext()).inflate(com.appboy.ui.R.layout.com_appboy_banner_image_content_card, viewgroup, false)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #49  <Method Context ViewGroup.getContext()>
	//    2    4:invokestatic    #55  <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    7:getstatic       #61  <Field int com.appboy.ui.R$layout.com_appboy_banner_image_content_card>
	//    4   10:aload_1         
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #65  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    7   15:astore_1        
		((View) (viewgroup)).setBackground(getResources().getDrawable(com.appboy.ui.R.drawable.com_appboy_card_background));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #69  <Method Resources getResources()>
	//   11   21:getstatic       #74  <Field int com.appboy.ui.R$drawable.com_appboy_card_background>
	//   12   24:invokevirtual   #80  <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   13   27:invokevirtual   #86  <Method void View.setBackground(android.graphics.drawable.Drawable)>
		return ((ContentCardViewHolder) (new ViewHolder(((View) (viewgroup)))));
	//   14   30:new             #7   <Class BannerImageContentCardView$ViewHolder>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokespecial   #89  <Method void BannerImageContentCardView$ViewHolder(BannerImageContentCardView, View)>
	//   19   39:areturn         
	}

	private static final float DEFAULT_ASPECT_RATIO = 6F;
}
