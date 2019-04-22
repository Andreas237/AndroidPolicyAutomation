// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards;

import android.view.*;

public class AppboyEmptyContentCardsAdapter extends android.support.v7.widget.RecyclerView.Adapter
{
	class NetworkUnavailableViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
	{

		final AppboyEmptyContentCardsAdapter this$0;

		NetworkUnavailableViewHolder(View view)
		{
			this$0 = AppboyEmptyContentCardsAdapter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field AppboyEmptyContentCardsAdapter this$0>
			super(view);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
		//    6   10:return          
		}
	}


	public AppboyEmptyContentCardsAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void android.support.v7.widget.RecyclerView$Adapter()>
	//    2    4:return          
	}

	public int getItemCount()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
	//    0    0:return          
	}

	public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		return ((android.support.v7.widget.RecyclerView.ViewHolder) (new NetworkUnavailableViewHolder(LayoutInflater.from(viewgroup.getContext()).inflate(com.appboy.ui.R.layout.com_appboy_content_cards_empty, viewgroup, false))));
	//    0    0:new             #7   <Class AppboyEmptyContentCardsAdapter$NetworkUnavailableViewHolder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #25  <Method android.content.Context ViewGroup.getContext()>
	//    5    9:invokestatic    #31  <Method LayoutInflater LayoutInflater.from(android.content.Context)>
	//    6   12:getstatic       #37  <Field int com.appboy.ui.R$layout.com_appboy_content_cards_empty>
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #41  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   10   20:invokespecial   #44  <Method void AppboyEmptyContentCardsAdapter$NetworkUnavailableViewHolder(AppboyEmptyContentCardsAdapter, View)>
	//   11   23:areturn         
	}
}
