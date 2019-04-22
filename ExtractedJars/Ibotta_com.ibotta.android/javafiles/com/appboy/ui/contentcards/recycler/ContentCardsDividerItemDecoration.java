// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.recycler;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.appboy.ui.contentcards.AppboyCardAdapter;

public class ContentCardsDividerItemDecoration extends android.support.v7.widget.RecyclerView.ItemDecoration
{

	public ContentCardsDividerItemDecoration(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void android.support.v7.widget.RecyclerView$ItemDecoration()>
		mContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #20  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #22  <Field Context mContext>
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokespecial   #26  <Method int getItemDividerHeight()>
	//    9   17:putfield        #28  <Field int mItemDividerHeight>
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:invokespecial   #31  <Method int getContentCardsItemMaxWidth()>
	//   13   25:putfield        #33  <Field int mItemDividerMaxWidth>
	//   14   28:return          
	}

	private int getContentCardsItemMaxWidth()
	{
		return mContext.getResources().getDimensionPixelSize(com.appboy.ui.R.dimen.com_appboy_content_cards_max_width);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Context mContext>
	//    2    4:invokevirtual   #38  <Method Resources Context.getResources()>
	//    3    7:getstatic       #43  <Field int com.appboy.ui.R$dimen.com_appboy_content_cards_max_width>
	//    4   10:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
	//    5   13:ireturn         
	}

	private int getItemDividerHeight()
	{
		return mContext.getResources().getDimensionPixelSize(com.appboy.ui.R.dimen.com_appboy_content_cards_divider_height);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Context mContext>
	//    2    4:invokevirtual   #38  <Method Resources Context.getResources()>
	//    3    7:getstatic       #52  <Field int com.appboy.ui.R$dimen.com_appboy_content_cards_divider_height>
	//    4   10:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
	//    5   13:ireturn         
	}

	private int getSidePaddingValue(int i)
	{
		return Math.max((i - mItemDividerMaxWidth) / 2, 0);
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field int mItemDividerMaxWidth>
	//    3    5:isub            
	//    4    6:iconst_2        
	//    5    7:idiv            
	//    6    8:iconst_0        
	//    7    9:invokestatic    #59  <Method int Math.max(int, int)>
	//    8   12:ireturn         
	}

	public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
	{
		boolean flag;
		int k;
		boolean flag1;
label0:
		{
			super.getItemOffsets(rect, view, recyclerview, state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #63  <Method void android.support.v7.widget.RecyclerView$ItemDecoration.getItemOffsets(Rect, View, RecyclerView, android.support.v7.widget.RecyclerView$State)>
			k = recyclerview.getChildAdapterPosition(view);
	//    6    9:aload_3         
	//    7   10:aload_2         
	//    8   11:invokevirtual   #69  <Method int RecyclerView.getChildAdapterPosition(View)>
	//    9   14:istore          7
			flag1 = recyclerview.getAdapter() instanceof AppboyCardAdapter;
	//   10   16:aload_3         
	//   11   17:invokevirtual   #73  <Method android.support.v7.widget.RecyclerView$Adapter RecyclerView.getAdapter()>
	//   12   20:instanceof      #75  <Class AppboyCardAdapter>
	//   13   23:istore          8
			flag = false;
	//   14   25:iconst_0        
	//   15   26:istore          6
			if(flag1)
	//*  16   28:iload           8
	//*  17   30:ifeq            57
			{
				view = ((View) ((AppboyCardAdapter)recyclerview.getAdapter()));
	//   18   33:aload_3         
	//   19   34:invokevirtual   #73  <Method android.support.v7.widget.RecyclerView$Adapter RecyclerView.getAdapter()>
	//   20   37:checkcast       #75  <Class AppboyCardAdapter>
	//   21   40:astore_2        
				if(k > 0)
	//*  22   41:iload           7
	//*  23   43:ifle            57
				{
					flag1 = ((AppboyCardAdapter) (view)).isControlCardAtPosition(k);
	//   24   46:aload_2         
	//   25   47:iload           7
	//   26   49:invokevirtual   #79  <Method boolean AppboyCardAdapter.isControlCardAtPosition(int)>
	//   27   52:istore          8
					break label0;
	//   28   54:goto            60
				}
			}
			flag1 = false;
	//   29   57:iconst_0        
	//   30   58:istore          8
		}
		int i;
		if(flag1)
	//*  31   60:iload           8
	//*  32   62:ifeq            71
			i = 0;
	//   33   65:iconst_0        
	//   34   66:istore          5
		else
	//*  35   68:goto            77
			i = mItemDividerHeight;
	//   36   71:aload_0         
	//   37   72:getfield        #28  <Field int mItemDividerHeight>
	//   38   75:istore          5
		rect.bottom = i;
	//   39   77:aload_1         
	//   40   78:iload           5
	//   41   80:putfield        #84  <Field int Rect.bottom>
		if(k == 0)
	//*  42   83:iload           7
	//*  43   85:ifne            112
		{
			int j;
			if(flag1)
	//*  44   88:iload           8
	//*  45   90:ifeq            100
				j = ((int) (flag));
	//   46   93:iload           6
	//   47   95:istore          5
			else
	//*  48   97:goto            106
				j = mItemDividerHeight;
	//   49  100:aload_0         
	//   50  101:getfield        #28  <Field int mItemDividerHeight>
	//   51  104:istore          5
			rect.top = j;
	//   52  106:aload_1         
	//   53  107:iload           5
	//   54  109:putfield        #87  <Field int Rect.top>
		}
		rect.left = getSidePaddingValue(recyclerview.getWidth());
	//   55  112:aload_1         
	//   56  113:aload_0         
	//   57  114:aload_3         
	//   58  115:invokevirtual   #90  <Method int RecyclerView.getWidth()>
	//   59  118:invokespecial   #92  <Method int getSidePaddingValue(int)>
	//   60  121:putfield        #95  <Field int Rect.left>
	//   61  124:return          
	}

	private final Context mContext;
	private final int mItemDividerHeight = getItemDividerHeight();
	private final int mItemDividerMaxWidth = getContentCardsItemMaxWidth();
}
