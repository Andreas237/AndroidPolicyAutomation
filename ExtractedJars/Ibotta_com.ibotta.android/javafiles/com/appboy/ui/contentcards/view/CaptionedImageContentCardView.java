// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.CaptionedImageCard;
import com.appboy.models.cards.Card;
import com.appboy.support.StringUtils;

// Referenced classes of package com.appboy.ui.contentcards.view:
//			BaseContentCardView, ContentCardViewHolder

public class CaptionedImageContentCardView extends BaseContentCardView
{
	private class ViewHolder extends ContentCardViewHolder
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
		final CaptionedImageContentCardView this$0;

		ViewHolder(View view)
		{
			this$0 = CaptionedImageContentCardView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field CaptionedImageContentCardView this$0>
			super(view, isUnreadIndicatorEnabled());
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #22  <Method boolean CaptionedImageContentCardView.isUnreadIndicatorEnabled()>
		//    7   11:invokespecial   #25  <Method void ContentCardViewHolder(View, boolean)>
			mCardImage = createCardImageWithStyle(getContext(), view, com.appboy.ui.R.style.Appboy_ContentCards_CaptionedImage_ImageContainer_Image, com.appboy.ui.R.id.com_appboy_content_cards_captioned_image_card_image_container);
		//    8   14:aload_0         
		//    9   15:aload_0         
		//   10   16:aload_1         
		//   11   17:invokevirtual   #29  <Method Context CaptionedImageContentCardView.getContext()>
		//   12   20:aload_2         
		//   13   21:getstatic       #35  <Field int com.appboy.ui.R$style.Appboy_ContentCards_CaptionedImage_ImageContainer_Image>
		//   14   24:getstatic       #40  <Field int com.appboy.ui.R$id.com_appboy_content_cards_captioned_image_card_image_container>
		//   15   27:invokevirtual   #44  <Method View createCardImageWithStyle(Context, View, int, int)>
		//   16   30:putfield        #46  <Field View mCardImage>
			mTitle = (TextView)view.findViewById(com.appboy.ui.R.id.com_appboy_content_cards_captioned_image_title);
		//   17   33:aload_0         
		//   18   34:aload_2         
		//   19   35:getstatic       #49  <Field int com.appboy.ui.R$id.com_appboy_content_cards_captioned_image_title>
		//   20   38:invokevirtual   #55  <Method View View.findViewById(int)>
		//   21   41:checkcast       #57  <Class TextView>
		//   22   44:putfield        #59  <Field TextView mTitle>
			mDescription = (TextView)view.findViewById(com.appboy.ui.R.id.com_appboy_content_cards_captioned_image_description);
		//   23   47:aload_0         
		//   24   48:aload_2         
		//   25   49:getstatic       #62  <Field int com.appboy.ui.R$id.com_appboy_content_cards_captioned_image_description>
		//   26   52:invokevirtual   #55  <Method View View.findViewById(int)>
		//   27   55:checkcast       #57  <Class TextView>
		//   28   58:putfield        #64  <Field TextView mDescription>
		//   29   61:return          
		}
	}


	public CaptionedImageContentCardView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void BaseContentCardView(Context)>
	//    3    5:return          
	}

	public void bindViewHolder(ContentCardViewHolder contentcardviewholder, CaptionedImageCard captionedimagecard)
	{
		super.bindViewHolder(contentcardviewholder, ((Card) (captionedimagecard)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void BaseContentCardView.bindViewHolder(ContentCardViewHolder, Card)>
		ViewHolder viewholder = (ViewHolder)contentcardviewholder;
	//    4    6:aload_1         
	//    5    7:checkcast       #7   <Class CaptionedImageContentCardView$ViewHolder>
	//    6   10:astore_3        
		viewholder.getTitle().setText(((CharSequence) (captionedimagecard.getTitle())));
	//    7   11:aload_3         
	//    8   12:invokevirtual   #25  <Method TextView CaptionedImageContentCardView$ViewHolder.getTitle()>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #30  <Method String CaptionedImageCard.getTitle()>
	//   11   19:invokevirtual   #36  <Method void TextView.setText(CharSequence)>
		viewholder.getDescription().setText(((CharSequence) (captionedimagecard.getDescription())));
	//   12   22:aload_3         
	//   13   23:invokevirtual   #39  <Method TextView CaptionedImageContentCardView$ViewHolder.getDescription()>
	//   14   26:aload_2         
	//   15   27:invokevirtual   #41  <Method String CaptionedImageCard.getDescription()>
	//   16   30:invokevirtual   #36  <Method void TextView.setText(CharSequence)>
		if(StringUtils.isNullOrBlank(captionedimagecard.getDomain()))
	//*  17   33:aload_2         
	//*  18   34:invokevirtual   #44  <Method String CaptionedImageCard.getDomain()>
	//*  19   37:invokestatic    #50  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  20   40:ifeq            51
			contentcardviewholder = ((ContentCardViewHolder) (captionedimagecard.getUrl()));
	//   21   43:aload_2         
	//   22   44:invokevirtual   #53  <Method String CaptionedImageCard.getUrl()>
	//   23   47:astore_1        
		else
	//*  24   48:goto            56
			contentcardviewholder = ((ContentCardViewHolder) (captionedimagecard.getDomain()));
	//   25   51:aload_2         
	//   26   52:invokevirtual   #44  <Method String CaptionedImageCard.getDomain()>
	//   27   55:astore_1        
		viewholder.setActionHintText(((String) (contentcardviewholder)));
	//   28   56:aload_3         
	//   29   57:aload_1         
	//   30   58:invokevirtual   #57  <Method void CaptionedImageContentCardView$ViewHolder.setActionHintText(String)>
		setOptionalCardImage(viewholder.getImageView(), captionedimagecard.getAspectRatio(), captionedimagecard.getImageUrl(), 1.333333F);
	//   31   61:aload_0         
	//   32   62:aload_3         
	//   33   63:invokevirtual   #61  <Method ImageView CaptionedImageContentCardView$ViewHolder.getImageView()>
	//   34   66:aload_2         
	//   35   67:invokevirtual   #65  <Method float CaptionedImageCard.getAspectRatio()>
	//   36   70:aload_2         
	//   37   71:invokevirtual   #68  <Method String CaptionedImageCard.getImageUrl()>
	//   38   74:ldc1            #11  <Float 1.333333F>
	//   39   76:invokevirtual   #72  <Method void setOptionalCardImage(ImageView, float, String, float)>
	//   40   79:return          
	}

	public volatile void bindViewHolder(ContentCardViewHolder contentcardviewholder, Card card)
	{
		bindViewHolder(contentcardviewholder, (CaptionedImageCard)card);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #27  <Class CaptionedImageCard>
	//    4    6:invokevirtual   #74  <Method void bindViewHolder(ContentCardViewHolder, CaptionedImageCard)>
	//    5    9:return          
	}

	public ContentCardViewHolder createViewHolder(ViewGroup viewgroup)
	{
		viewgroup = ((ViewGroup) (LayoutInflater.from(viewgroup.getContext()).inflate(com.appboy.ui.R.layout.com_appboy_captioned_image_content_card, viewgroup, false)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #82  <Method Context ViewGroup.getContext()>
	//    2    4:invokestatic    #88  <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    7:getstatic       #94  <Field int com.appboy.ui.R$layout.com_appboy_captioned_image_content_card>
	//    4   10:aload_1         
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #98  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    7   15:astore_1        
		((View) (viewgroup)).setBackground(getResources().getDrawable(com.appboy.ui.R.drawable.com_appboy_card_background));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #102 <Method Resources getResources()>
	//   11   21:getstatic       #107 <Field int com.appboy.ui.R$drawable.com_appboy_card_background>
	//   12   24:invokevirtual   #113 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   13   27:invokevirtual   #119 <Method void View.setBackground(android.graphics.drawable.Drawable)>
		return ((ContentCardViewHolder) (new ViewHolder(((View) (viewgroup)))));
	//   14   30:new             #7   <Class CaptionedImageContentCardView$ViewHolder>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokespecial   #122 <Method void CaptionedImageContentCardView$ViewHolder(CaptionedImageContentCardView, View)>
	//   19   39:areturn         
	}

	private static final float DEFAULT_ASPECT_RATIO = 1.333333F;
}
