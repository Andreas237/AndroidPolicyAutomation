// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.support.v7.widget.CardView;

public class CardViewBindingAdapter
{

	public CardViewBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	public static void setContentPadding(CardView cardview, int i)
	{
		cardview.setContentPadding(i, i, i, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_1         
	//    3    3:iload_1         
	//    4    4:iload_1         
	//    5    5:invokevirtual   #36  <Method void CardView.setContentPadding(int, int, int, int)>
	//    6    8:return          
	}

	public static void setContentPaddingBottom(CardView cardview, int i)
	{
		cardview.setContentPadding(cardview.getContentPaddingLeft(), cardview.getContentPaddingTop(), cardview.getContentPaddingRight(), i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #43  <Method int CardView.getContentPaddingLeft()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #46  <Method int CardView.getContentPaddingTop()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #49  <Method int CardView.getContentPaddingRight()>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #36  <Method void CardView.setContentPadding(int, int, int, int)>
	//    9   17:return          
	}

	public static void setContentPaddingLeft(CardView cardview, int i)
	{
		cardview.setContentPadding(i, cardview.getContentPaddingTop(), cardview.getContentPaddingRight(), cardview.getContentPaddingBottom());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #46  <Method int CardView.getContentPaddingTop()>
	//    4    6:aload_0         
	//    5    7:invokevirtual   #49  <Method int CardView.getContentPaddingRight()>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #54  <Method int CardView.getContentPaddingBottom()>
	//    8   14:invokevirtual   #36  <Method void CardView.setContentPadding(int, int, int, int)>
	//    9   17:return          
	}

	public static void setContentPaddingRight(CardView cardview, int i)
	{
		cardview.setContentPadding(cardview.getContentPaddingLeft(), cardview.getContentPaddingTop(), i, cardview.getContentPaddingBottom());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #43  <Method int CardView.getContentPaddingLeft()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #46  <Method int CardView.getContentPaddingTop()>
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #54  <Method int CardView.getContentPaddingBottom()>
	//    8   14:invokevirtual   #36  <Method void CardView.setContentPadding(int, int, int, int)>
	//    9   17:return          
	}

	public static void setContentPaddingTop(CardView cardview, int i)
	{
		cardview.setContentPadding(cardview.getContentPaddingLeft(), i, cardview.getContentPaddingRight(), cardview.getContentPaddingBottom());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #43  <Method int CardView.getContentPaddingLeft()>
	//    3    5:iload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #49  <Method int CardView.getContentPaddingRight()>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #54  <Method int CardView.getContentPaddingBottom()>
	//    8   14:invokevirtual   #36  <Method void CardView.setContentPadding(int, int, int, int)>
	//    9   17:return          
	}
}
