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
	//*   2    4:ifeq            15
			view = ((View) ((MenuView.ItemView)view));
	//    3    7:aload_2         
	//    4    8:checkcast       #77  <Class MenuView$ItemView>
	//    5   11:astore_2        
		else
	//*   6   12:goto            21
			view = ((View) (createItemView(viewgroup)));
	//    7   15:aload_0         
	//    8   16:aload_3         
	//    9   17:invokevirtual   #98  <Method MenuView$ItemView createItemView(ViewGroup)>
	//   10   20:astore_2        
		bindItemView(menuitemimpl, ((MenuView.ItemView) (view)));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #100 <Method void bindItemView(MenuItemImpl, MenuView$ItemView)>
		return (View)view;
	//   15   27:aload_2         
	//   16   28:checkcast       #50  <Class View>
	//   17   31:areturn         
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
		if(viewgroup == null)
	//*   4    9:aload           7
	//*   5   11:ifnonnull       15
			return;
	//    6   14:return          
		int j = 0;
	//    7   15:iconst_0        
	//    8   16:istore_3        
		int i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		if(mMenu != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #106 <Field MenuBuilder mMenu>
	//*  13   23:ifnull          178
		{
			mMenu.flagActionItems();
	//   14   26:aload_0         
	//   15   27:getfield        #106 <Field MenuBuilder mMenu>
	//   16   30:invokevirtual   #141 <Method void MenuBuilder.flagActionItems()>
			ArrayList arraylist = mMenu.getVisibleItems();
	//   17   33:aload_0         
	//   18   34:getfield        #106 <Field MenuBuilder mMenu>
	//   19   37:invokevirtual   #145 <Method ArrayList MenuBuilder.getVisibleItems()>
	//   20   40:astore          8
			int l = arraylist.size();
	//   21   42:aload           8
	//   22   44:invokevirtual   #150 <Method int ArrayList.size()>
	//   23   47:istore          5
			int k = 0;
	//   24   49:iconst_0        
	//   25   50:istore          4
			do
			{
				j = i;
	//   26   52:iload_2         
	//   27   53:istore_3        
				if(k >= l)
					break;
	//   28   54:iload           4
	//   29   56:iload           5
	//   30   58:icmpge          178
				MenuItemImpl menuitemimpl1 = (MenuItemImpl)arraylist.get(k);
	//   31   61:aload           8
	//   32   63:iload           4
	//   33   65:invokevirtual   #154 <Method Object ArrayList.get(int)>
	//   34   68:checkcast       #156 <Class MenuItemImpl>
	//   35   71:astore          9
				j = i;
	//   36   73:iload_2         
	//   37   74:istore_3        
				if(shouldIncludeItem(i, menuitemimpl1))
	//*  38   75:aload_0         
	//*  39   76:iload_2         
	//*  40   77:aload           9
	//*  41   79:invokevirtual   #158 <Method boolean shouldIncludeItem(int, MenuItemImpl)>
	//*  42   82:ifeq            167
				{
					View view = viewgroup.getChildAt(i);
	//   43   85:aload           7
	//   44   87:iload_2         
	//   45   88:invokevirtual   #162 <Method View ViewGroup.getChildAt(int)>
	//   46   91:astore          10
					MenuItemImpl menuitemimpl;
					if(view instanceof MenuView.ItemView)
	//*  47   93:aload           10
	//*  48   95:instanceof      #77  <Class MenuView$ItemView>
	//*  49   98:ifeq            116
						menuitemimpl = ((MenuView.ItemView)view).getItemData();
	//   50  101:aload           10
	//   51  103:checkcast       #77  <Class MenuView$ItemView>
	//   52  106:invokeinterface #166 <Method MenuItemImpl MenuView$ItemView.getItemData()>
	//   53  111:astore          6
					else
	//*  54  113:goto            119
						menuitemimpl = null;
	//   55  116:aconst_null     
	//   56  117:astore          6
					View view1 = getItemView(menuitemimpl1, view, viewgroup);
	//   57  119:aload_0         
	//   58  120:aload           9
	//   59  122:aload           10
	//   60  124:aload           7
	//   61  126:invokevirtual   #168 <Method View getItemView(MenuItemImpl, View, ViewGroup)>
	//   62  129:astore          11
					if(menuitemimpl1 != menuitemimpl)
	//*  63  131:aload           9
	//*  64  133:aload           6
	//*  65  135:if_acmpeq       149
					{
						view1.setPressed(false);
	//   66  138:aload           11
	//   67  140:iconst_0        
	//   68  141:invokevirtual   #171 <Method void View.setPressed(boolean)>
						view1.jumpDrawablesToCurrentState();
	//   69  144:aload           11
	//   70  146:invokevirtual   #174 <Method void View.jumpDrawablesToCurrentState()>
					}
					if(view1 != view)
	//*  71  149:aload           11
	//*  72  151:aload           10
	//*  73  153:if_acmpeq       163
						addItemView(view1, i);
	//   74  156:aload_0         
	//   75  157:aload           11
	//   76  159:iload_2         
	//   77  160:invokevirtual   #176 <Method void addItemView(View, int)>
					j = i + 1;
	//   78  163:iload_2         
	//   79  164:iconst_1        
	//   80  165:iadd            
	//   81  166:istore_3        
				}
				k++;
	//   82  167:iload           4
	//   83  169:iconst_1        
	//   84  170:iadd            
	//   85  171:istore          4
				i = j;
	//   86  173:iload_3         
	//   87  174:istore_2        
			} while(true);
	//   88  175:goto            52
		}
		do
		{
			if(j >= viewgroup.getChildCount())
				break;
	//   89  178:iload_3         
	//   90  179:aload           7
	//   91  181:invokevirtual   #179 <Method int ViewGroup.getChildCount()>
	//   92  184:icmpge          204
			if(!filterLeftoverView(viewgroup, j))
	//*  93  187:aload_0         
	//*  94  188:aload           7
	//*  95  190:iload_3         
	//*  96  191:invokevirtual   #181 <Method boolean filterLeftoverView(ViewGroup, int)>
	//*  97  194:ifne            178
				j++;
	//   98  197:iload_3         
	//   99  198:iconst_1        
	//  100  199:iadd            
	//  101  200:istore_3        
		} while(true);
	//  102  201:goto            178
	//  103  204:return          
	}

	private MenuPresenter.Callback mCallback;
	protected Context mContext;
	private int mId;
	protected LayoutInflater mInflater;
	private int mItemLayoutRes;
	public MenuBuilder mMenu;
	private int mMenuLayoutRes;
	public MenuView mMenuView;
	protected Context mSystemContext;
	protected LayoutInflater mSystemInflater;
}
