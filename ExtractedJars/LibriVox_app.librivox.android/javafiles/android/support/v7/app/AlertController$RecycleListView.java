// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

public class AlertController$RecycleListView extends ListView
{

	public void setHasDecor(boolean flag, boolean flag1)
	{
		if(!flag1 || !flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            8
	//*   2    4:iload_1         
	//*   3    5:ifne            67
		{
			int k = getPaddingLeft();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #48  <Method int getPaddingLeft()>
	//    6   12:istore          5
			int i;
			if(flag)
	//*   7   14:iload_1         
	//*   8   15:ifeq            26
				i = getPaddingTop();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #51  <Method int getPaddingTop()>
	//   11   22:istore_3        
			else
	//*  12   23:goto            31
				i = mPaddingTopNoTitle;
	//   13   26:aload_0         
	//   14   27:getfield        #42  <Field int mPaddingTopNoTitle>
	//   15   30:istore_3        
			int l = getPaddingRight();
	//   16   31:aload_0         
	//   17   32:invokevirtual   #54  <Method int getPaddingRight()>
	//   18   35:istore          6
			int j;
			if(flag1)
	//*  19   37:iload_2         
	//*  20   38:ifeq            50
				j = getPaddingBottom();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #57  <Method int getPaddingBottom()>
	//   23   45:istore          4
			else
	//*  24   47:goto            56
				j = mPaddingBottomNoButtons;
	//   25   50:aload_0         
	//   26   51:getfield        #37  <Field int mPaddingBottomNoButtons>
	//   27   54:istore          4
			setPadding(k, i, l, j);
	//   28   56:aload_0         
	//   29   57:iload           5
	//   30   59:iload_3         
	//   31   60:iload           6
	//   32   62:iload           4
	//   33   64:invokevirtual   #61  <Method void setPadding(int, int, int, int)>
		}
	//   34   67:return          
	}

	private final int mPaddingBottomNoButtons;
	private final int mPaddingTopNoTitle;

	public AlertController$RecycleListView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #12  <Method void AlertController$RecycleListView(Context, AttributeSet)>
	//    4    6:return          
	}

	public AlertController$RecycleListView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void ListView(Context, AttributeSet)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.RecycleListView)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #20  <Field int[] android.support.v7.appcompat.R$styleable.RecycleListView>
	//    7   11:invokevirtual   #26  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    8   14:astore_1        
		mPaddingBottomNoButtons = ((TypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.RecycleListView_paddingBottomNoButtons, -1);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getstatic       #29  <Field int android.support.v7.appcompat.R$styleable.RecycleListView_paddingBottomNoButtons>
	//   12   20:iconst_m1       
	//   13   21:invokevirtual   #35  <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   14   24:putfield        #37  <Field int mPaddingBottomNoButtons>
		mPaddingTopNoTitle = ((TypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.RecycleListView_paddingTopNoTitle, -1);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:getstatic       #40  <Field int android.support.v7.appcompat.R$styleable.RecycleListView_paddingTopNoTitle>
	//   18   32:iconst_m1       
	//   19   33:invokevirtual   #35  <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   20   36:putfield        #42  <Field int mPaddingTopNoTitle>
	//   21   39:return          
	}
}
