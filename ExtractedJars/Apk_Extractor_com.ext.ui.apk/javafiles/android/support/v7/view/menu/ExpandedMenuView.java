// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.*;

// Referenced classes of package android.support.v7.view.menu:
//			MenuView, MenuBuilder, MenuItemImpl

public final class ExpandedMenuView extends ListView
	implements MenuBuilder.ItemInvoker, MenuView, android.widget.AdapterView.OnItemClickListener
{

	public ExpandedMenuView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0x1010074);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #30  <Int 0x1010074>
	//    4    5:invokespecial   #33  <Method void ExpandedMenuView(Context, AttributeSet, int)>
	//    5    8:return          
	}

	public ExpandedMenuView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #35  <Method void ListView(Context, AttributeSet)>
		setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (this)));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #39  <Method void setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, attributeset, TINT_ATTRS, i, 0)));
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:getstatic       #26  <Field int[] TINT_ATTRS>
	//   10   16:iload_3         
	//   11   17:iconst_0        
	//   12   18:invokestatic    #45  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   13   21:astore_1        
		if(((TintTypedArray) (context)).hasValue(0))
	//*  14   22:aload_1         
	//*  15   23:iconst_0        
	//*  16   24:invokevirtual   #49  <Method boolean TintTypedArray.hasValue(int)>
	//*  17   27:ifeq            39
			setBackgroundDrawable(((TintTypedArray) (context)).getDrawable(0));
	//   18   30:aload_0         
	//   19   31:aload_1         
	//   20   32:iconst_0        
	//   21   33:invokevirtual   #53  <Method android.graphics.drawable.Drawable TintTypedArray.getDrawable(int)>
	//   22   36:invokevirtual   #57  <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
		if(((TintTypedArray) (context)).hasValue(1))
	//*  23   39:aload_1         
	//*  24   40:iconst_1        
	//*  25   41:invokevirtual   #49  <Method boolean TintTypedArray.hasValue(int)>
	//*  26   44:ifeq            56
			setDivider(((TintTypedArray) (context)).getDrawable(1));
	//   27   47:aload_0         
	//   28   48:aload_1         
	//   29   49:iconst_1        
	//   30   50:invokevirtual   #53  <Method android.graphics.drawable.Drawable TintTypedArray.getDrawable(int)>
	//   31   53:invokevirtual   #60  <Method void setDivider(android.graphics.drawable.Drawable)>
		((TintTypedArray) (context)).recycle();
	//   32   56:aload_1         
	//   33   57:invokevirtual   #63  <Method void TintTypedArray.recycle()>
	//   34   60:return          
	}

	public int getWindowAnimations()
	{
		return mAnimations;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int mAnimations>
	//    2    4:ireturn         
	}

	public void initialize(MenuBuilder menubuilder)
	{
		mMenu = menubuilder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #71  <Field MenuBuilder mMenu>
	//    3    5:return          
	}

	public boolean invokeItem(MenuItemImpl menuitemimpl)
	{
		return mMenu.performItemAction(((android.view.MenuItem) (menuitemimpl)), 0);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field MenuBuilder mMenu>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #79  <Method boolean MenuBuilder.performItemAction(android.view.MenuItem, int)>
	//    5    9:ireturn         
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void ListView.onDetachedFromWindow()>
		setChildrenDrawingCacheEnabled(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #86  <Method void setChildrenDrawingCacheEnabled(boolean)>
	//    5    9:return          
	}

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		invokeItem((MenuItemImpl)getAdapter().getItem(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #92  <Method ListAdapter getAdapter()>
	//    3    5:iload_3         
	//    4    6:invokeinterface #98  <Method Object ListAdapter.getItem(int)>
	//    5   11:checkcast       #100 <Class MenuItemImpl>
	//    6   14:invokevirtual   #102 <Method boolean invokeItem(MenuItemImpl)>
	//    7   17:pop             
	//    8   18:return          
	}

	private static final int TINT_ATTRS[] = {
		0x10100d4, 0x1010129
	};
	private int mAnimations;
	private MenuBuilder mMenu;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #23  <Int 0x10100d4>
	//    5    7:iastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #24  <Int 0x1010129>
	//    9   12:iastore         
	//   10   13:putstatic       #26  <Field int[] TINT_ATTRS>
	//*  11   16:return          
	}
}
