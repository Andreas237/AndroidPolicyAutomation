// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

// Referenced classes of package android.support.v7.app:
//			AlertController

public static class AlertController$RecycleListView extends ListView
{

	public void setHasDecor(boolean flag, boolean flag1)
	{
		if(!flag1 || !flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            8
	//*   2    4:iload_1         
	//*   3    5:ifne            50
		{
			int k = getPaddingLeft();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #50  <Method int getPaddingLeft()>
	//    6   12:istore          5
			int i;
			int j;
			int l;
			if(flag)
	//*   7   14:iload_1         
	//*   8   15:ifeq            51
				i = getPaddingTop();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #53  <Method int getPaddingTop()>
	//   11   22:istore_3        
			else
	//*  12   23:aload_0         
	//*  13   24:invokevirtual   #56  <Method int getPaddingRight()>
	//*  14   27:istore          6
	//*  15   29:iload_2         
	//*  16   30:ifeq            59
	//*  17   33:aload_0         
	//*  18   34:invokevirtual   #59  <Method int getPaddingBottom()>
	//*  19   37:istore          4
	//*  20   39:aload_0         
	//*  21   40:iload           5
	//*  22   42:iload_3         
	//*  23   43:iload           6
	//*  24   45:iload           4
	//*  25   47:invokevirtual   #63  <Method void setPadding(int, int, int, int)>
	//*  26   50:return          
				i = mPaddingTopNoTitle;
	//   27   51:aload_0         
	//   28   52:getfield        #44  <Field int mPaddingTopNoTitle>
	//   29   55:istore_3        
			l = getPaddingRight();
			if(flag1)
				j = getPaddingBottom();
			else
	//*  30   56:goto            23
				j = mPaddingBottomNoButtons;
	//   31   59:aload_0         
	//   32   60:getfield        #39  <Field int mPaddingBottomNoButtons>
	//   33   63:istore          4
			setPadding(k, i, l, j);
		}
	//*  34   65:goto            39
	}

	private final int mPaddingBottomNoButtons;
	private final int mPaddingTopNoTitle;

	public AlertController$RecycleListView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #15  <Method void AlertController$RecycleListView(Context, AttributeSet)>
	//    4    6:return          
	}

	public AlertController$RecycleListView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void ListView(Context, AttributeSet)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.RecycleListView)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #22  <Field int[] android.support.v7.appcompat.R$styleable.RecycleListView>
	//    7   11:invokevirtual   #28  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    8   14:astore_1        
		mPaddingBottomNoButtons = ((TypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.RecycleListView_paddingBottomNoButtons, -1);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getstatic       #31  <Field int android.support.v7.appcompat.R$styleable.RecycleListView_paddingBottomNoButtons>
	//   12   20:iconst_m1       
	//   13   21:invokevirtual   #37  <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   14   24:putfield        #39  <Field int mPaddingBottomNoButtons>
		mPaddingTopNoTitle = ((TypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.RecycleListView_paddingTopNoTitle, -1);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:getstatic       #42  <Field int android.support.v7.appcompat.R$styleable.RecycleListView_paddingTopNoTitle>
	//   18   32:iconst_m1       
	//   19   33:invokevirtual   #37  <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   20   36:putfield        #44  <Field int mPaddingTopNoTitle>
	//   21   39:return          
	}
}
