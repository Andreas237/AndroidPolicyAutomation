// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.widget.PopupWindowCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//			TintTypedArray

class AppCompatPopupWindow extends PopupWindow
{

	public AppCompatPopupWindow(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #25  <Method void PopupWindow(Context, AttributeSet, int)>
		init(context, attributeset, i, 0);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:iload_3         
	//    9   11:iconst_0        
	//   10   12:invokespecial   #29  <Method void init(Context, AttributeSet, int, int)>
	//   11   15:return          
	}

	public AppCompatPopupWindow(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #33  <Method void PopupWindow(Context, AttributeSet, int, int)>
		init(context, attributeset, i, j);
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:aload_2         
	//    9   12:iload_3         
	//   10   13:iload           4
	//   11   15:invokespecial   #29  <Method void init(Context, AttributeSet, int, int)>
	//   12   18:return          
	}

	private void init(Context context, AttributeSet attributeset, int i, int j)
	{
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.PopupWindow, i, j)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:getstatic       #39  <Field int[] android.support.v7.appcompat.R$styleable.PopupWindow>
	//    3    5:iload_3         
	//    4    6:iload           4
	//    5    8:invokestatic    #45  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//    6   11:astore_1        
		if(((TintTypedArray) (context)).hasValue(android.support.v7.appcompat.R.styleable.PopupWindow_overlapAnchor))
	//*   7   12:aload_1         
	//*   8   13:getstatic       #48  <Field int android.support.v7.appcompat.R$styleable.PopupWindow_overlapAnchor>
	//*   9   16:invokevirtual   #52  <Method boolean TintTypedArray.hasValue(int)>
	//*  10   19:ifeq            34
			setSupportOverlapAnchor(((TintTypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.PopupWindow_overlapAnchor, false));
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:getstatic       #48  <Field int android.support.v7.appcompat.R$styleable.PopupWindow_overlapAnchor>
	//   14   27:iconst_0        
	//   15   28:invokevirtual   #56  <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   16   31:invokespecial   #60  <Method void setSupportOverlapAnchor(boolean)>
		setBackgroundDrawable(((TintTypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.PopupWindow_android_popupBackground));
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:getstatic       #63  <Field int android.support.v7.appcompat.R$styleable.PopupWindow_android_popupBackground>
	//   20   39:invokevirtual   #67  <Method android.graphics.drawable.Drawable TintTypedArray.getDrawable(int)>
	//   21   42:invokevirtual   #71  <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
		((TintTypedArray) (context)).recycle();
	//   22   45:aload_1         
	//   23   46:invokevirtual   #74  <Method void TintTypedArray.recycle()>
	//   24   49:return          
	}

	private void setSupportOverlapAnchor(boolean flag)
	{
		if(COMPAT_OVERLAP_ANCHOR)
	//*   0    0:getstatic       #17  <Field boolean COMPAT_OVERLAP_ANCHOR>
	//*   1    3:ifeq            12
		{
			mOverlapAnchor = flag;
	//    2    6:aload_0         
	//    3    7:iload_1         
	//    4    8:putfield        #76  <Field boolean mOverlapAnchor>
			return;
	//    5   11:return          
		} else
		{
			PopupWindowCompat.setOverlapAnchor(((PopupWindow) (this)), flag);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokestatic    #82  <Method void PopupWindowCompat.setOverlapAnchor(PopupWindow, boolean)>
			return;
	//    9   17:return          
		}
	}

	public void showAsDropDown(View view, int i, int j)
	{
		int k = j;
	//    0    0:iload_3         
	//    1    1:istore          4
		if(COMPAT_OVERLAP_ANCHOR)
	//*   2    3:getstatic       #17  <Field boolean COMPAT_OVERLAP_ANCHOR>
	//*   3    6:ifeq            27
		{
			k = j;
	//    4    9:iload_3         
	//    5   10:istore          4
			if(mOverlapAnchor)
	//*   6   12:aload_0         
	//*   7   13:getfield        #76  <Field boolean mOverlapAnchor>
	//*   8   16:ifeq            27
				k = j - view.getHeight();
	//    9   19:iload_3         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #90  <Method int View.getHeight()>
	//   12   24:isub            
	//   13   25:istore          4
		}
		super.showAsDropDown(view, i, k);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:iload_2         
	//   17   30:iload           4
	//   18   32:invokespecial   #92  <Method void PopupWindow.showAsDropDown(View, int, int)>
	//   19   35:return          
	}

	public void showAsDropDown(View view, int i, int j, int k)
	{
		int l = j;
	//    0    0:iload_3         
	//    1    1:istore          5
		if(COMPAT_OVERLAP_ANCHOR)
	//*   2    3:getstatic       #17  <Field boolean COMPAT_OVERLAP_ANCHOR>
	//*   3    6:ifeq            27
		{
			l = j;
	//    4    9:iload_3         
	//    5   10:istore          5
			if(mOverlapAnchor)
	//*   6   12:aload_0         
	//*   7   13:getfield        #76  <Field boolean mOverlapAnchor>
	//*   8   16:ifeq            27
				l = j - view.getHeight();
	//    9   19:iload_3         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #90  <Method int View.getHeight()>
	//   12   24:isub            
	//   13   25:istore          5
		}
		super.showAsDropDown(view, i, l, k);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:iload_2         
	//   17   30:iload           5
	//   18   32:iload           4
	//   19   34:invokespecial   #95  <Method void PopupWindow.showAsDropDown(View, int, int, int)>
	//   20   37:return          
	}

	public void update(View view, int i, int j, int k, int l)
	{
		int i1 = j;
	//    0    0:iload_3         
	//    1    1:istore          6
		if(COMPAT_OVERLAP_ANCHOR)
	//*   2    3:getstatic       #17  <Field boolean COMPAT_OVERLAP_ANCHOR>
	//*   3    6:ifeq            27
		{
			i1 = j;
	//    4    9:iload_3         
	//    5   10:istore          6
			if(mOverlapAnchor)
	//*   6   12:aload_0         
	//*   7   13:getfield        #76  <Field boolean mOverlapAnchor>
	//*   8   16:ifeq            27
				i1 = j - view.getHeight();
	//    9   19:iload_3         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #90  <Method int View.getHeight()>
	//   12   24:isub            
	//   13   25:istore          6
		}
		super.update(view, i, i1, k, l);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:iload_2         
	//   17   30:iload           6
	//   18   32:iload           4
	//   19   34:iload           5
	//   20   36:invokespecial   #99  <Method void PopupWindow.update(View, int, int, int, int)>
	//   21   39:return          
	}

	private static final boolean COMPAT_OVERLAP_ANCHOR;
	private boolean mOverlapAnchor;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #15  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          13
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:goto            15
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore_0        
		COMPAT_OVERLAP_ANCHOR = flag;
	//    8   15:iload_0         
	//    9   16:putstatic       #17  <Field boolean COMPAT_OVERLAP_ANCHOR>
	//*  10   19:return          
	}
}
