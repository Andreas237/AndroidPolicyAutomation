// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.*;
import android.widget.*;

// Referenced classes of package android.support.v7.view.menu:
//			ShowableListMenu, MenuPresenter, MenuBuilder, MenuAdapter, 
//			MenuItemImpl, MenuView

abstract class MenuPopup
	implements ShowableListMenu, MenuPresenter, android.widget.AdapterView.OnItemClickListener
{

	MenuPopup()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	protected static int measureIndividualMenuWidth(ListAdapter listadapter, ViewGroup viewgroup, Context context, int i)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//    2    3:iconst_0        
	//    3    4:iconst_0        
	//    4    5:invokestatic    #25  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    5    8:istore          9
		int l1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//    6   10:iconst_0        
	//    7   11:iconst_0        
	//    8   12:invokestatic    #25  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    9   15:istore          10
		int i2 = listadapter.getCount();
	//   10   17:aload_0         
	//   11   18:invokeinterface #31  <Method int ListAdapter.getCount()>
	//   12   23:istore          11
		Object obj = ((Object) (viewgroup));
	//   13   25:aload_1         
	//   14   26:astore          12
		int i1 = 0;
	//   15   28:iconst_0        
	//   16   29:istore          7
		int k = i1;
	//   17   31:iload           7
	//   18   33:istore          5
		viewgroup = null;
	//   19   35:aconst_null     
	//   20   36:astore_1        
		while(j < i2) 
	//*  21   37:iload           4
	//*  22   39:iload           11
	//*  23   41:icmpge          160
		{
			int j1 = listadapter.getItemViewType(j);
	//   24   44:aload_0         
	//   25   45:iload           4
	//   26   47:invokeinterface #35  <Method int ListAdapter.getItemViewType(int)>
	//   27   52:istore          8
			int l = i1;
	//   28   54:iload           7
	//   29   56:istore          6
			if(j1 != i1)
	//*  30   58:iload           8
	//*  31   60:iload           7
	//*  32   62:icmpeq          71
			{
				viewgroup = null;
	//   33   65:aconst_null     
	//   34   66:astore_1        
				l = j1;
	//   35   67:iload           8
	//   36   69:istore          6
			}
			Object obj1 = obj;
	//   37   71:aload           12
	//   38   73:astore          13
			if(obj == null)
	//*  39   75:aload           12
	//*  40   77:ifnonnull       90
				obj1 = ((Object) (new FrameLayout(context)));
	//   41   80:new             #37  <Class FrameLayout>
	//   42   83:dup             
	//   43   84:aload_2         
	//   44   85:invokespecial   #40  <Method void FrameLayout(Context)>
	//   45   88:astore          13
			viewgroup = ((ViewGroup) (listadapter.getView(j, ((View) (viewgroup)), ((ViewGroup) (obj1)))));
	//   46   90:aload_0         
	//   47   91:iload           4
	//   48   93:aload_1         
	//   49   94:aload           13
	//   50   96:invokeinterface #44  <Method View ListAdapter.getView(int, View, ViewGroup)>
	//   51  101:astore_1        
			((View) (viewgroup)).measure(k1, l1);
	//   52  102:aload_1         
	//   53  103:iload           9
	//   54  105:iload           10
	//   55  107:invokevirtual   #50  <Method void View.measure(int, int)>
			j1 = ((View) (viewgroup)).getMeasuredWidth();
	//   56  110:aload_1         
	//   57  111:invokevirtual   #53  <Method int View.getMeasuredWidth()>
	//   58  114:istore          8
			if(j1 >= i)
	//*  59  116:iload           8
	//*  60  118:iload_3         
	//*  61  119:icmplt          124
				return i;
	//   62  122:iload_3         
	//   63  123:ireturn         
			i1 = k;
	//   64  124:iload           5
	//   65  126:istore          7
			if(j1 > k)
	//*  66  128:iload           8
	//*  67  130:iload           5
	//*  68  132:icmple          139
				i1 = j1;
	//   69  135:iload           8
	//   70  137:istore          7
			j++;
	//   71  139:iload           4
	//   72  141:iconst_1        
	//   73  142:iadd            
	//   74  143:istore          4
			k = i1;
	//   75  145:iload           7
	//   76  147:istore          5
			obj = obj1;
	//   77  149:aload           13
	//   78  151:astore          12
			i1 = l;
	//   79  153:iload           6
	//   80  155:istore          7
		}
	//*  81  157:goto            37
		return k;
	//   82  160:iload           5
	//   83  162:ireturn         
	}

	protected static boolean shouldPreserveIconSpacing(MenuBuilder menubuilder)
	{
		int j = menubuilder.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method int MenuBuilder.size()>
	//    2    4:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          45
		{
			MenuItem menuitem = menubuilder.getItem(i);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #64  <Method MenuItem MenuBuilder.getItem(int)>
	//   11   17:astore_3        
			if(menuitem.isVisible() && menuitem.getIcon() != null)
	//*  12   18:aload_3         
	//*  13   19:invokeinterface #70  <Method boolean MenuItem.isVisible()>
	//*  14   24:ifeq            38
	//*  15   27:aload_3         
	//*  16   28:invokeinterface #74  <Method android.graphics.drawable.Drawable MenuItem.getIcon()>
	//*  17   33:ifnull          38
				return true;
	//   18   36:iconst_1        
	//   19   37:ireturn         
		}

	//   20   38:iload_1         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_1        
	//*  24   42:goto            7
		return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
	}

	protected static MenuAdapter toMenuAdapter(ListAdapter listadapter)
	{
		if(listadapter instanceof HeaderViewListAdapter)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #78  <Class HeaderViewListAdapter>
	//*   2    4:ifeq            18
			return (MenuAdapter)((HeaderViewListAdapter)listadapter).getWrappedAdapter();
	//    3    7:aload_0         
	//    4    8:checkcast       #78  <Class HeaderViewListAdapter>
	//    5   11:invokevirtual   #82  <Method ListAdapter HeaderViewListAdapter.getWrappedAdapter()>
	//    6   14:checkcast       #84  <Class MenuAdapter>
	//    7   17:areturn         
		else
			return (MenuAdapter)listadapter;
	//    8   18:aload_0         
	//    9   19:checkcast       #84  <Class MenuAdapter>
	//   10   22:areturn         
	}

	public abstract void addMenu(MenuBuilder menubuilder);

	protected boolean closeMenuOnSubMenuOpened()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Rect getEpicenterBounds()
	{
		return mEpicenterBounds;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Rect mEpicenterBounds>
	//    2    4:areturn         
	}

	public int getId()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public MenuView getMenuView(ViewGroup viewgroup)
	{
		throw new UnsupportedOperationException("MenuPopups manage their own views");
	//    0    0:new             #99  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #101 <String "MenuPopups manage their own views">
	//    3    6:invokespecial   #104 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void initForMenu(Context context, MenuBuilder menubuilder)
	{
	//    0    0:return          
	}

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		view = ((View) ((ListAdapter)adapterview.getAdapter()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #117 <Method android.widget.Adapter AdapterView.getAdapter()>
	//    2    4:checkcast       #27  <Class ListAdapter>
	//    3    7:astore_2        
		adapterview = ((AdapterView) (toMenuAdapter(((ListAdapter) (view))).mAdapterMenu));
	//    4    8:aload_2         
	//    5    9:invokestatic    #119 <Method MenuAdapter toMenuAdapter(ListAdapter)>
	//    6   12:getfield        #123 <Field MenuBuilder MenuAdapter.mAdapterMenu>
	//    7   15:astore_1        
		view = ((View) ((MenuItem)((ListAdapter) (view)).getItem(i)));
	//    8   16:aload_2         
	//    9   17:iload_3         
	//   10   18:invokeinterface #126 <Method Object ListAdapter.getItem(int)>
	//   11   23:checkcast       #66  <Class MenuItem>
	//   12   26:astore_2        
		if(closeMenuOnSubMenuOpened())
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #128 <Method boolean closeMenuOnSubMenuOpened()>
	//*  15   31:ifeq            39
			i = 0;
	//   16   34:iconst_0        
	//   17   35:istore_3        
		else
	//*  18   36:goto            41
			i = 4;
	//   19   39:iconst_4        
	//   20   40:istore_3        
		((MenuBuilder) (adapterview)).performItemAction(((MenuItem) (view)), ((MenuPresenter) (this)), i);
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:aload_0         
	//   24   44:iload_3         
	//   25   45:invokevirtual   #132 <Method boolean MenuBuilder.performItemAction(MenuItem, MenuPresenter, int)>
	//   26   48:pop             
	//   27   49:return          
	}

	public abstract void setAnchorView(View view);

	public void setEpicenterBounds(Rect rect)
	{
		mEpicenterBounds = rect;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field Rect mEpicenterBounds>
	//    3    5:return          
	}

	public abstract void setForceShowIcon(boolean flag);

	public abstract void setGravity(int i);

	public abstract void setHorizontalOffset(int i);

	public abstract void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener);

	public abstract void setShowTitle(boolean flag);

	public abstract void setVerticalOffset(int i);

	private Rect mEpicenterBounds;
}
