// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.view.*;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.view.menu:
//			MenuPresenter, MenuView, MenuBuilder, MenuItemImpl, 
//			SubMenuBuilder

public abstract class BaseMenuPresenter
	implements MenuPresenter
{

	public BaseMenuPresenter(Context context, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mSystemContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field Context mSystemContext>
		mSystemInflater = LayoutInflater.from(context);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #39  <Method LayoutInflater LayoutInflater.from(Context)>
	//    8   14:putfield        #41  <Field LayoutInflater mSystemInflater>
		mMenuLayoutRes = i;
	//    9   17:aload_0         
	//   10   18:iload_2         
	//   11   19:putfield        #43  <Field int mMenuLayoutRes>
		mItemLayoutRes = j;
	//   12   22:aload_0         
	//   13   23:iload_3         
	//   14   24:putfield        #45  <Field int mItemLayoutRes>
	//   15   27:return          
	}

	protected void addItemView(View view, int i)
	{
		ViewGroup viewgroup = (ViewGroup)view.getParent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method android.view.ViewParent View.getParent()>
	//    2    4:checkcast       #56  <Class ViewGroup>
	//    3    7:astore_3        
		if(viewgroup != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          17
			viewgroup.removeView(view);
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #60  <Method void ViewGroup.removeView(View)>
		((ViewGroup)mMenuView).addView(view, i);
	//    9   17:aload_0         
	//   10   18:getfield        #62  <Field MenuView mMenuView>
	//   11   21:checkcast       #56  <Class ViewGroup>
	//   12   24:aload_1         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #65  <Method void ViewGroup.addView(View, int)>
	//   15   29:return          
	}

	public abstract void bindItemView(MenuItemImpl menuitemimpl, MenuView.ItemView itemview);

	public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public MenuView.ItemView createItemView(ViewGroup viewgroup)
	{
		return (MenuView.ItemView)mSystemInflater.inflate(mItemLayoutRes, viewgroup, false);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field LayoutInflater mSystemInflater>
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field int mItemLayoutRes>
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #75  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    7   13:checkcast       #77  <Class MenuView$ItemView>
	//    8   16:areturn         
	}

	public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected boolean filterLeftoverView(ViewGroup viewgroup, int i)
	{
		viewgroup.removeViewAt(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #84  <Method void ViewGroup.removeViewAt(int)>
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	public boolean flagActionItems()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public MenuPresenter.Callback getCallback()
	{
		return mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field MenuPresenter$Callback mCallback>
	//    2    4:areturn         
	}

	public int getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int mId>
	//    2    4:ireturn         
	}

	public View getItemView(MenuItemImpl menuitemimpl, View view, ViewGroup viewgroup)
	{
		if(view instanceof MenuView.ItemView)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #77  <Class MenuView$ItemView>
	//*   2    4:ifeq            23
			view = ((View) ((MenuView.ItemView)view));
	//    3    7:aload_2         
	//    4    8:checkcast       #77  <Class MenuView$ItemView>
	//    5   11:astore_2        
		else
	//*   6   12:aload_0         
	//*   7   13:aload_1         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #98  <Method void bindItemView(MenuItemImpl, MenuView$ItemView)>
	//*  10   18:aload_2         
	//*  11   19:checkcast       #50  <Class View>
	//*  12   22:areturn         
			view = ((View) (createItemView(viewgroup)));
	//   13   23:aload_0         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #100 <Method MenuView$ItemView createItemView(ViewGroup)>
	//   16   28:astore_2        
		bindItemView(menuitemimpl, ((MenuView.ItemView) (view)));
		return (View)view;
	//*  17   29:goto            12
	}

	public MenuView getMenuView(ViewGroup viewgroup)
	{
		if(mMenuView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field MenuView mMenuView>
	//*   2    4:ifnonnull       45
		{
			mMenuView = (MenuView)mSystemInflater.inflate(mMenuLayoutRes, viewgroup, false);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field LayoutInflater mSystemInflater>
	//    6   12:aload_0         
	//    7   13:getfield        #43  <Field int mMenuLayoutRes>
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #75  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   11   21:checkcast       #104 <Class MenuView>
	//   12   24:putfield        #62  <Field MenuView mMenuView>
			mMenuView.initialize(mMenu);
	//   13   27:aload_0         
	//   14   28:getfield        #62  <Field MenuView mMenuView>
	//   15   31:aload_0         
	//   16   32:getfield        #106 <Field MenuBuilder mMenu>
	//   17   35:invokeinterface #110 <Method void MenuView.initialize(MenuBuilder)>
			updateMenuView(true);
	//   18   40:aload_0         
	//   19   41:iconst_1        
	//   20   42:invokevirtual   #114 <Method void updateMenuView(boolean)>
		}
		return mMenuView;
	//   21   45:aload_0         
	//   22   46:getfield        #62  <Field MenuView mMenuView>
	//   23   49:areturn         
	}

	public void initForMenu(Context context, MenuBuilder menubuilder)
	{
		mContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #118 <Field Context mContext>
		mInflater = LayoutInflater.from(mContext);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #118 <Field Context mContext>
	//    6   10:invokestatic    #39  <Method LayoutInflater LayoutInflater.from(Context)>
	//    7   13:putfield        #120 <Field LayoutInflater mInflater>
		mMenu = menubuilder;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #106 <Field MenuBuilder mMenu>
	//   11   21:return          
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		if(mCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field MenuPresenter$Callback mCallback>
	//*   2    4:ifnull          18
			mCallback.onCloseMenu(menubuilder, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #90  <Field MenuPresenter$Callback mCallback>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #126 <Method void MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
	//    8   18:return          
	}

	public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
	{
		if(mCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field MenuPresenter$Callback mCallback>
	//*   2    4:ifnull          18
			return mCallback.onOpenSubMenu(((MenuBuilder) (submenubuilder)));
	//    3    7:aload_0         
	//    4    8:getfield        #90  <Field MenuPresenter$Callback mCallback>
	//    5   11:aload_1         
	//    6   12:invokeinterface #132 <Method boolean MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
	//    7   17:ireturn         
		else
			return false;
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	public void setCallback(MenuPresenter.Callback callback)
	{
		mCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field MenuPresenter$Callback mCallback>
	//    3    5:return          
	}

	public void setId(int i)
	{
		mId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #94  <Field int mId>
	//    3    5:return          
	}

	public boolean shouldIncludeItem(int i, MenuItemImpl menuitemimpl)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void updateMenuView(boolean flag)
	{
		ViewGroup viewgroup = (ViewGroup)mMenuView;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field MenuView mMenuView>
	//    2    4:checkcast       #56  <Class ViewGroup>
	//    3    7:astore          7
		if(viewgroup != null)
	//*   4    9:aload           7
	//*   5   11:ifnonnull       15
	//*   6   14:return          
		{
			int j;
			if(mMenu != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #106 <Field MenuBuilder mMenu>
	//*   9   19:ifnull          201
			{
				mMenu.flagActionItems();
	//   10   22:aload_0         
	//   11   23:getfield        #106 <Field MenuBuilder mMenu>
	//   12   26:invokevirtual   #141 <Method void MenuBuilder.flagActionItems()>
				ArrayList arraylist = mMenu.getVisibleItems();
	//   13   29:aload_0         
	//   14   30:getfield        #106 <Field MenuBuilder mMenu>
	//   15   33:invokevirtual   #145 <Method ArrayList MenuBuilder.getVisibleItems()>
	//   16   36:astore          8
				int l = arraylist.size();
	//   17   38:aload           8
	//   18   40:invokevirtual   #150 <Method int ArrayList.size()>
	//   19   43:istore          5
				int k = 0;
	//   20   45:iconst_0        
	//   21   46:istore          4
				int i = 0;
	//   22   48:iconst_0        
	//   23   49:istore_2        
				do
				{
					j = i;
	//   24   50:iload_2         
	//   25   51:istore_3        
					if(k >= l)
						break;
	//   26   52:iload           4
	//   27   54:iload           5
	//   28   56:icmpge          172
					MenuItemImpl menuitemimpl1 = (MenuItemImpl)arraylist.get(k);
	//   29   59:aload           8
	//   30   61:iload           4
	//   31   63:invokevirtual   #154 <Method Object ArrayList.get(int)>
	//   32   66:checkcast       #156 <Class MenuItemImpl>
	//   33   69:astore          9
					if(shouldIncludeItem(i, menuitemimpl1))
	//*  34   71:aload_0         
	//*  35   72:iload_2         
	//*  36   73:aload           9
	//*  37   75:invokevirtual   #158 <Method boolean shouldIncludeItem(int, MenuItemImpl)>
	//*  38   78:ifeq            198
					{
						View view = viewgroup.getChildAt(i);
	//   39   81:aload           7
	//   40   83:iload_2         
	//   41   84:invokevirtual   #162 <Method View ViewGroup.getChildAt(int)>
	//   42   87:astore          10
						MenuItemImpl menuitemimpl;
						View view1;
						if(view instanceof MenuView.ItemView)
	//*  43   89:aload           10
	//*  44   91:instanceof      #77  <Class MenuView$ItemView>
	//*  45   94:ifeq            166
							menuitemimpl = ((MenuView.ItemView)view).getItemData();
	//   46   97:aload           10
	//   47   99:checkcast       #77  <Class MenuView$ItemView>
	//   48  102:invokeinterface #166 <Method MenuItemImpl MenuView$ItemView.getItemData()>
	//   49  107:astore          6
						else
	//*  50  109:aload_0         
	//*  51  110:aload           9
	//*  52  112:aload           10
	//*  53  114:aload           7
	//*  54  116:invokevirtual   #168 <Method View getItemView(MenuItemImpl, View, ViewGroup)>
	//*  55  119:astore          11
	//*  56  121:aload           9
	//*  57  123:aload           6
	//*  58  125:if_acmpeq       139
	//*  59  128:aload           11
	//*  60  130:iconst_0        
	//*  61  131:invokevirtual   #171 <Method void View.setPressed(boolean)>
	//*  62  134:aload           11
	//*  63  136:invokevirtual   #174 <Method void View.jumpDrawablesToCurrentState()>
	//*  64  139:aload           11
	//*  65  141:aload           10
	//*  66  143:if_acmpeq       153
	//*  67  146:aload_0         
	//*  68  147:aload           11
	//*  69  149:iload_2         
	//*  70  150:invokevirtual   #176 <Method void addItemView(View, int)>
	//*  71  153:iload_2         
	//*  72  154:iconst_1        
	//*  73  155:iadd            
	//*  74  156:istore_2        
	//*  75  157:iload           4
	//*  76  159:iconst_1        
	//*  77  160:iadd            
	//*  78  161:istore          4
	//*  79  163:goto            50
							menuitemimpl = null;
	//   80  166:aconst_null     
	//   81  167:astore          6
						view1 = getItemView(menuitemimpl1, view, viewgroup);
						if(menuitemimpl1 != menuitemimpl)
						{
							view1.setPressed(false);
							view1.jumpDrawablesToCurrentState();
						}
						if(view1 != view)
							addItemView(view1, i);
						i++;
					}
					k++;
				} while(true);
	//   82  169:goto            109
			} else
	//*  83  172:iload_3         
	//*  84  173:aload           7
	//*  85  175:invokevirtual   #179 <Method int ViewGroup.getChildCount()>
	//*  86  178:icmpge          14
	//*  87  181:aload_0         
	//*  88  182:aload           7
	//*  89  184:iload_3         
	//*  90  185:invokevirtual   #181 <Method boolean filterLeftoverView(ViewGroup, int)>
	//*  91  188:ifne            172
	//*  92  191:iload_3         
	//*  93  192:iconst_1        
	//*  94  193:iadd            
	//*  95  194:istore_3        
	//*  96  195:goto            172
	//*  97  198:goto            157
			{
				j = 0;
	//   98  201:iconst_0        
	//   99  202:istore_3        
			}
			while(j < viewgroup.getChildCount()) 
				if(!filterLeftoverView(viewgroup, j))
					j++;
		}
	//* 100  203:goto            172
	}

	private MenuPresenter.Callback mCallback;
	protected Context mContext;
	private int mId;
	protected LayoutInflater mInflater;
	private int mItemLayoutRes;
	protected MenuBuilder mMenu;
	private int mMenuLayoutRes;
	protected MenuView mMenuView;
	protected Context mSystemContext;
	protected LayoutInflater mSystemInflater;
}
