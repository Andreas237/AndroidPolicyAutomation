// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.*;

public class ContentCardViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
{

	public ContentCardViewHolder(View view, boolean flag)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
		mUnreadBar = view.findViewById(com.appboy.ui.R.id.com_appboy_content_cards_unread_bar);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getstatic       #22  <Field int com.appboy.ui.R$id.com_appboy_content_cards_unread_bar>
	//    6   10:invokevirtual   #28  <Method View View.findViewById(int)>
	//    7   13:putfield        #30  <Field View mUnreadBar>
		View view1 = mUnreadBar;
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field View mUnreadBar>
	//   10   20:astore_3        
		if(view1 != null)
	//*  11   21:aload_3         
	//*  12   22:ifnull          63
			if(flag)
	//*  13   25:iload_2         
	//*  14   26:ifeq            57
			{
				view1.setVisibility(0);
	//   15   29:aload_3         
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #34  <Method void View.setVisibility(int)>
				mUnreadBar.setBackground(view.getContext().getResources().getDrawable(com.appboy.ui.R.drawable.com_appboy_content_cards_unread_bar_background));
	//   18   34:aload_0         
	//   19   35:getfield        #30  <Field View mUnreadBar>
	//   20   38:aload_1         
	//   21   39:invokevirtual   #38  <Method Context View.getContext()>
	//   22   42:invokevirtual   #44  <Method Resources Context.getResources()>
	//   23   45:getstatic       #49  <Field int com.appboy.ui.R$drawable.com_appboy_content_cards_unread_bar_background>
	//   24   48:invokevirtual   #55  <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   25   51:invokevirtual   #59  <Method void View.setBackground(android.graphics.drawable.Drawable)>
			} else
	//*  26   54:goto            63
			{
				view1.setVisibility(8);
	//   27   57:aload_3         
	//   28   58:bipush          8
	//   29   60:invokevirtual   #34  <Method void View.setVisibility(int)>
			}
		mPinnedIcon = (ImageView)view.findViewById(com.appboy.ui.R.id.com_appboy_content_cards_pinned_icon);
	//   30   63:aload_0         
	//   31   64:aload_1         
	//   32   65:getstatic       #62  <Field int com.appboy.ui.R$id.com_appboy_content_cards_pinned_icon>
	//   33   68:invokevirtual   #28  <Method View View.findViewById(int)>
	//   34   71:checkcast       #64  <Class ImageView>
	//   35   74:putfield        #66  <Field ImageView mPinnedIcon>
		mActionHint = (TextView)view.findViewById(com.appboy.ui.R.id.com_appboy_content_cards_action_hint);
	//   36   77:aload_0         
	//   37   78:aload_1         
	//   38   79:getstatic       #69  <Field int com.appboy.ui.R$id.com_appboy_content_cards_action_hint>
	//   39   82:invokevirtual   #28  <Method View View.findViewById(int)>
	//   40   85:checkcast       #71  <Class TextView>
	//   41   88:putfield        #73  <Field TextView mActionHint>
	//   42   91:return          
	}

	public View createCardImageWithStyle(Context context, View view, int i, int j)
	{
		context = ((Context) (new ImageView(((Context) (new ContextThemeWrapper(context, i))), ((android.util.AttributeSet) (null)), i)));
	//    0    0:new             #64  <Class ImageView>
	//    1    3:dup             
	//    2    4:new             #78  <Class ContextThemeWrapper>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:iload_3         
	//    6   10:invokespecial   #81  <Method void ContextThemeWrapper(Context, int)>
	//    7   13:aconst_null     
	//    8   14:iload_3         
	//    9   15:invokespecial   #84  <Method void ImageView(Context, android.util.AttributeSet, int)>
	//   10   18:astore_1        
		((View) (context)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.RelativeLayout.LayoutParams(-1, -2))));
	//   11   19:aload_1         
	//   12   20:new             #86  <Class android.widget.RelativeLayout$LayoutParams>
	//   13   23:dup             
	//   14   24:iconst_m1       
	//   15   25:bipush          -2
	//   16   27:invokespecial   #89  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   17   30:invokevirtual   #93  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		((RelativeLayout)view.findViewById(j)).addView(((View) (context)));
	//   18   33:aload_2         
	//   19   34:iload           4
	//   20   36:invokevirtual   #28  <Method View View.findViewById(int)>
	//   21   39:checkcast       #95  <Class RelativeLayout>
	//   22   42:aload_1         
	//   23   43:invokevirtual   #98  <Method void RelativeLayout.addView(View)>
		return ((View) (context));
	//   24   46:aload_1         
	//   25   47:areturn         
	}

	public void setActionHintText(String s)
	{
		TextView textview = mActionHint;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field TextView mActionHint>
	//    2    4:astore_2        
		if(textview != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			textview.setText(((CharSequence) (s)));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #104 <Method void TextView.setText(CharSequence)>
	//    8   14:return          
	}

	public void setActionHintVisible(boolean flag)
	{
		TextView textview = mActionHint;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field TextView mActionHint>
	//    2    4:astore_3        
		if(textview != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          26
		{
			byte byte0;
			if(flag)
	//*   5    9:iload_1         
	//*   6   10:ifeq            18
				byte0 = 0;
	//    7   13:iconst_0        
	//    8   14:istore_2        
			else
	//*   9   15:goto            21
				byte0 = 8;
	//   10   18:bipush          8
	//   11   20:istore_2        
			textview.setVisibility(((int) (byte0)));
	//   12   21:aload_3         
	//   13   22:iload_2         
	//   14   23:invokevirtual   #107 <Method void TextView.setVisibility(int)>
		}
	//   15   26:return          
	}

	public void setPinnedIconVisible(boolean flag)
	{
		ImageView imageview = mPinnedIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field ImageView mPinnedIcon>
	//    2    4:astore_3        
		if(imageview != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          26
		{
			byte byte0;
			if(flag)
	//*   5    9:iload_1         
	//*   6   10:ifeq            18
				byte0 = 0;
	//    7   13:iconst_0        
	//    8   14:istore_2        
			else
	//*   9   15:goto            21
				byte0 = 8;
	//   10   18:bipush          8
	//   11   20:istore_2        
			imageview.setVisibility(((int) (byte0)));
	//   12   21:aload_3         
	//   13   22:iload_2         
	//   14   23:invokevirtual   #109 <Method void ImageView.setVisibility(int)>
		}
	//   15   26:return          
	}

	public void setUnreadBarVisible(boolean flag)
	{
		View view = mUnreadBar;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field View mUnreadBar>
	//    2    4:astore_3        
		if(view != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          26
		{
			byte byte0;
			if(flag)
	//*   5    9:iload_1         
	//*   6   10:ifeq            18
				byte0 = 0;
	//    7   13:iconst_0        
	//    8   14:istore_2        
			else
	//*   9   15:goto            21
				byte0 = 8;
	//   10   18:bipush          8
	//   11   20:istore_2        
			view.setVisibility(((int) (byte0)));
	//   12   21:aload_3         
	//   13   22:iload_2         
	//   14   23:invokevirtual   #34  <Method void View.setVisibility(int)>
		}
	//   15   26:return          
	}

	private final TextView mActionHint;
	private final ImageView mPinnedIcon;
	private final View mUnreadBar;
}
