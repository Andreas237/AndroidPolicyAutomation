// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.appboy.models.cards.Card;

// Referenced classes of package com.appboy.ui.contentcards.view:
//			BaseContentCardView, ContentCardViewHolder

public class DefaultContentCardView extends BaseContentCardView
{

	public DefaultContentCardView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void BaseContentCardView(Context)>
	//    3    5:return          
	}

	public void bindViewHolder(ContentCardViewHolder contentcardviewholder, Card card)
	{
	//    0    0:return          
	}

	public ContentCardViewHolder createViewHolder(ViewGroup viewgroup)
	{
		return new ContentCardViewHolder(LayoutInflater.from(viewgroup.getContext()).inflate(com.appboy.ui.R.layout.com_appboy_default_content_card, viewgroup, false), false);
	//    0    0:new             #16  <Class ContentCardViewHolder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method Context ViewGroup.getContext()>
	//    4    8:invokestatic    #28  <Method LayoutInflater LayoutInflater.from(Context)>
	//    5   11:getstatic       #34  <Field int com.appboy.ui.R$layout.com_appboy_default_content_card>
	//    6   14:aload_1         
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #38  <Method android.view.View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    9   19:iconst_0        
	//   10   20:invokespecial   #41  <Method void ContentCardViewHolder(android.view.View, boolean)>
	//   11   23:areturn         
	}
}
