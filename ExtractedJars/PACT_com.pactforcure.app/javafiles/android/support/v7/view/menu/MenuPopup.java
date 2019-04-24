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
		Object obj1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          13
		int i1 = 0;
	//    4    6:iconst_0        
	//    5    7:istore          7
		int k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//    6    9:iconst_0        
	//    7   10:iconst_0        
	//    8   11:invokestatic    #25  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    9   14:istore          9
		int l1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   10   16:iconst_0        
	//   11   17:iconst_0        
	//   12   18:invokestatic    #25  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   13   21:istore          10
		int i2 = listadapter.getCount();
	//   14   23:aload_0         
	//   15   24:invokeinterface #31  <Method int ListAdapter.getCount()>
	//   16   29:istore          11
		int k = 0;
	//   17   31:iconst_0        
	//   18   32:istore          5
		Object obj = ((Object) (viewgroup));
	//   19   34:aload_1         
	//   20   35:astore          12
		viewgroup = ((ViewGroup) (obj1));
	//   21   37:aload           13
	//   22   39:astore_1        
		while(k < i2) 
	//*  23   40:iload           5
	//*  24   42:iload           11
	//*  25   44:icmpge          163
		{
			int j1 = listadapter.getItemViewType(k);
	//   26   47:aload_0         
	//   27   48:iload           5
	//   28   50:invokeinterface #35  <Method int ListAdapter.getItemViewType(int)>
	//   29   55:istore          8
			int l = i1;
	//   30   57:iload           7
	//   31   59:istore          6
			if(j1 != i1)
	//*  32   61:iload           8
	//*  33   63:iload           7
	//*  34   65:icmpeq          74
			{
				l = j1;
	//   35   68:iload           8
	//   36   70:istore          6
				viewgroup = null;
	//   37   72:aconst_null     
	//   38   73:astore_1        
			}
			Object obj2 = obj;
	//   39   74:aload           12
	//   40   76:astore          13
			if(obj == null)
	//*  41   78:aload           12
	//*  42   80:ifnonnull       93
				obj2 = ((Object) (new FrameLayout(context)));
	//   43   83:new             #37  <Class FrameLayout>
	//   44   86:dup             
	//   45   87:aload_2         
	//   46   88:invokespecial   #40  <Method void FrameLayout(Context)>
	//   47   91:astore          13
			viewgroup = ((ViewGroup) (listadapter.getView(k, ((View) (viewgroup)), ((ViewGroup) (obj2)))));
	//   48   93:aload_0         
	//   49   94:iload           5
	//   50   96:aload_1         
	//   51   97:aload           13
	//   52   99:invokeinterface #44  <Method View ListAdapter.getView(int, View, ViewGroup)>
	//   53  104:astore_1        
			((View) (viewgroup)).measure(k1, l1);
	//   54  105:aload_1         
	//   55  106:iload           9
	//   56  108:iload           10
	//   57  110:invokevirtual   #50  <Method void View.measure(int, int)>
			i1 = ((View) (viewgroup)).getMeasuredWidth();
	//   58  113:aload_1         
	//   59  114:invokevirtual   #53  <Method int View.getMeasuredWidth()>
	//   60  117:istore          7
			if(i1 >= i)
	//*  61  119:iload           7
	//*  62  121:iload_3         
	//*  63  122:icmplt          127
				return i;
	//   64  125:iload_3         
	//   65  126:ireturn         
			j1 = j;
	//   66  127:iload           4
	//   67  129:istore          8
			if(i1 > j)
	//*  68  131:iload           7
	//*  69  133:iload           4
	//*  70  135:icmple          142
				j1 = i1;
	//   71  138:iload           7
	//   72  140:istore          8
			k++;
	//   73  142:iload           5
	//   74  144:iconst_1        
	//   75  145:iadd            
	//   76  146:istore          5
			i1 = l;
	//   77  148:iload           6
	//   78  150:istore          7
			j = j1;
	//   79  152:iload           8
	//   80  154:istore          4
			obj = obj2;
	//   81  156:aload           13
	//   82  158:astore          12
		}
	//*  83  160:goto            40
		return j;
	//   84  163:iload           4
	//   85  165:ireturn         
	}

	protected static boolean shouldPreserveIconSpacing(MenuBuilder menubuilder)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int j = menubuilder.size();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #60  <Method int MenuBuilder.size()>
	//    4    7:istore_2        
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_1        
		do
		{
label0:
			{
				boolean flag = flag1;
	//    7   10:iload           4
	//    8   12:istore_3        
				if(i < j)
	//*   9   13:iload_1         
	//*  10   14:iload_2         
	//*  11   15:icmpge          47
				{
					MenuItem menuitem = menubuilder.getItem(i);
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:invokevirtual   #64  <Method MenuItem MenuBuilder.getItem(int)>
	//   15   23:astore          5
					if(!menuitem.isVisible() || menuitem.getIcon() == null)
						break label0;
	//   16   25:aload           5
	//   17   27:invokeinterface #70  <Method boolean MenuItem.isVisible()>
	//   18   32:ifeq            49
	//   19   35:aload           5
	//   20   37:invokeinterface #74  <Method android.graphics.drawable.Drawable MenuItem.getIcon()>
	//   21   42:ifnull          49
					flag = true;
	//   22   45:iconst_1        
	//   23   46:istore_3        
				}
				return flag;
	//   24   47:iload_3         
	//   25   48:ireturn         
			}
			i++;
	//   26   49:iload_1         
	//   27   50:iconst_1        
	//   28   51:iadd            
	//   29   52:istore_1        
		} while(true);
	//   30   53:goto            10
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
	//*  15   31:ifeq            45
			i = 0;
	//   16   34:iconst_0        
	//   17   35:istore_3        
		else
	//*  18   36:aload_1         
	//*  19   37:aload_2         
	//*  20   38:aload_0         
	//*  21   39:iload_3         
	//*  22   40:invokevirtual   #132 <Method boolean MenuBuilder.performItemAction(MenuItem, MenuPresenter, int)>
	//*  23   43:pop             
	//*  24   44:return          
			i = 4;
	//   25   45:iconst_4        
	//   26   46:istore_3        
		((MenuBuilder) (adapterview)).performItemAction(((MenuItem) (view)), ((MenuPresenter) (this)), i);
	//*  27   47:goto            36
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
