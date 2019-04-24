// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.*;
import android.widget.*;

// Referenced classes of package android.support.v7.view.menu:
//			MenuPresenter, ShowableListMenu, MenuBuilder, MenuAdapter, 
//			MenuItemImpl, MenuView

abstract class MenuPopup
	implements MenuPresenter, ShowableListMenu, android.widget.AdapterView.OnItemClickListener
{

	MenuPopup()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	protected static int measureIndividualMenuWidth(ListAdapter listadapter, ViewGroup viewgroup, Context context, int i)
	{
		int k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//    0    0:iconst_0        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #25  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    3    5:istore          9
		int l1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//    4    7:iconst_0        
	//    5    8:iconst_0        
	//    6    9:invokestatic    #25  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    7   12:istore          10
		int i2 = listadapter.getCount();
	//    8   14:aload_0         
	//    9   15:invokeinterface #31  <Method int ListAdapter.getCount()>
	//   10   20:istore          11
		int k = 0;
	//   11   22:iconst_0        
	//   12   23:istore          5
		int i1 = 0;
	//   13   25:iconst_0        
	//   14   26:istore          7
		View view = null;
	//   15   28:aconst_null     
	//   16   29:astore          12
		int j = 0;
	//   17   31:iconst_0        
	//   18   32:istore          4
		while(k < i2) 
	//*  19   34:iload           5
	//*  20   36:iload           11
	//*  21   38:icmpge          143
		{
			int j1 = listadapter.getItemViewType(k);
	//   22   41:aload_0         
	//   23   42:iload           5
	//   24   44:invokeinterface #35  <Method int ListAdapter.getItemViewType(int)>
	//   25   49:istore          8
			int l = i1;
	//   26   51:iload           7
	//   27   53:istore          6
			if(j1 != i1)
	//*  28   55:iload           8
	//*  29   57:iload           7
	//*  30   59:icmpeq          69
			{
				l = j1;
	//   31   62:iload           8
	//   32   64:istore          6
				view = null;
	//   33   66:aconst_null     
	//   34   67:astore          12
			}
			if(viewgroup == null)
	//*  35   69:aload_1         
	//*  36   70:ifnonnull       146
				viewgroup = ((ViewGroup) (new FrameLayout(context)));
	//   37   73:new             #37  <Class FrameLayout>
	//   38   76:dup             
	//   39   77:aload_2         
	//   40   78:invokespecial   #40  <Method void FrameLayout(Context)>
	//   41   81:astore_1        
			view = listadapter.getView(k, view, viewgroup);
	//   42   82:aload_0         
	//   43   83:iload           5
	//   44   85:aload           12
	//   45   87:aload_1         
	//   46   88:invokeinterface #44  <Method View ListAdapter.getView(int, View, ViewGroup)>
	//   47   93:astore          12
			view.measure(k1, l1);
	//   48   95:aload           12
	//   49   97:iload           9
	//   50   99:iload           10
	//   51  101:invokevirtual   #50  <Method void View.measure(int, int)>
			i1 = view.getMeasuredWidth();
	//   52  104:aload           12
	//   53  106:invokevirtual   #53  <Method int View.getMeasuredWidth()>
	//   54  109:istore          7
			if(i1 >= i)
	//*  55  111:iload           7
	//*  56  113:iload_3         
	//*  57  114:icmplt          119
				return i;
	//   58  117:iload_3         
	//   59  118:ireturn         
			if(i1 > j)
	//*  60  119:iload           7
	//*  61  121:iload           4
	//*  62  123:icmple          149
				j = i1;
	//   63  126:iload           7
	//   64  128:istore          4
			k++;
	//   65  130:iload           5
	//   66  132:iconst_1        
	//   67  133:iadd            
	//   68  134:istore          5
			i1 = l;
	//   69  136:iload           6
	//   70  138:istore          7
		}
	//*  71  140:goto            34
		return j;
	//   72  143:iload           4
	//   73  145:ireturn         
	//*  74  146:goto            82
	//*  75  149:goto            130
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
