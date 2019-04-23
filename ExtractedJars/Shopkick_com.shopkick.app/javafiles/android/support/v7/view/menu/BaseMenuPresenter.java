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
		MenuPresenter.Callback callback = mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field MenuPresenter$Callback mCallback>
	//    2    4:astore_3        
		if(callback != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
			callback.onCloseMenu(menubuilder, flag);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokeinterface #126 <Method void MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
	//    9   17:return          
	}

	public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
	{
		MenuPresenter.Callback callback = mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field MenuPresenter$Callback mCallback>
	//    2    4:astore_2        
		if(callback != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			return callback.onOpenSubMenu(((MenuBuilder) (submenubuilder)));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #132 <Method boolean MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
	//    8   16:ireturn         
		else
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
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
		MenuBuilder menubuilder = mMenu;
	//    7   15:aload_0         
	//    8   16:getfield        #106 <Field MenuBuilder mMenu>
	//    9   19:astore          6
		int i = 0;
	//   10   21:iconst_0        
	//   11   22:istore_2        
		if(menubuilder != null)
	//*  12   23:aload           6
	//*  13   25:ifnull          176
		{
			menubuilder.flagActionItems();
	//   14   28:aload           6
	//   15   30:invokevirtual   #141 <Method void MenuBuilder.flagActionItems()>
			ArrayList arraylist = mMenu.getVisibleItems();
	//   16   33:aload_0         
	//   17   34:getfield        #106 <Field MenuBuilder mMenu>
	//   18   37:invokevirtual   #145 <Method ArrayList MenuBuilder.getVisibleItems()>
	//   19   40:astore          8
			int l = arraylist.size();
	//   20   42:aload           8
	//   21   44:invokevirtual   #150 <Method int ArrayList.size()>
	//   22   47:istore          5
			int j = 0;
	//   23   49:iconst_0        
	//   24   50:istore_3        
			int k;
			for(i = j; j < l; i = k)
	//*  25   51:iload_3         
	//*  26   52:istore_2        
	//*  27   53:iload_3         
	//*  28   54:iload           5
	//*  29   56:icmpge          176
			{
				MenuItemImpl menuitemimpl1 = (MenuItemImpl)arraylist.get(j);
	//   30   59:aload           8
	//   31   61:iload_3         
	//   32   62:invokevirtual   #154 <Method Object ArrayList.get(int)>
	//   33   65:checkcast       #156 <Class MenuItemImpl>
	//   34   68:astore          9
				k = i;
	//   35   70:iload_2         
	//   36   71:istore          4
				if(shouldIncludeItem(i, menuitemimpl1))
	//*  37   73:aload_0         
	//*  38   74:iload_2         
	//*  39   75:aload           9
	//*  40   77:invokevirtual   #158 <Method boolean shouldIncludeItem(int, MenuItemImpl)>
	//*  41   80:ifeq            166
				{
					View view = viewgroup.getChildAt(i);
	//   42   83:aload           7
	//   43   85:iload_2         
	//   44   86:invokevirtual   #162 <Method View ViewGroup.getChildAt(int)>
	//   45   89:astore          10
					MenuItemImpl menuitemimpl;
					if(view instanceof MenuView.ItemView)
	//*  46   91:aload           10
	//*  47   93:instanceof      #77  <Class MenuView$ItemView>
	//*  48   96:ifeq            114
						menuitemimpl = ((MenuView.ItemView)view).getItemData();
	//   49   99:aload           10
	//   50  101:checkcast       #77  <Class MenuView$ItemView>
	//   51  104:invokeinterface #166 <Method MenuItemImpl MenuView$ItemView.getItemData()>
	//   52  109:astore          6
					else
	//*  53  111:goto            117
						menuitemimpl = null;
	//   54  114:aconst_null     
	//   55  115:astore          6
					View view1 = getItemView(menuitemimpl1, view, viewgroup);
	//   56  117:aload_0         
	//   57  118:aload           9
	//   58  120:aload           10
	//   59  122:aload           7
	//   60  124:invokevirtual   #168 <Method View getItemView(MenuItemImpl, View, ViewGroup)>
	//   61  127:astore          11
					if(menuitemimpl1 != menuitemimpl)
	//*  62  129:aload           9
	//*  63  131:aload           6
	//*  64  133:if_acmpeq       147
					{
						view1.setPressed(false);
	//   65  136:aload           11
	//   66  138:iconst_0        
	//   67  139:invokevirtual   #171 <Method void View.setPressed(boolean)>
						view1.jumpDrawablesToCurrentState();
	//   68  142:aload           11
	//   69  144:invokevirtual   #174 <Method void View.jumpDrawablesToCurrentState()>
					}
					if(view1 != view)
	//*  70  147:aload           11
	//*  71  149:aload           10
	//*  72  151:if_acmpeq       161
						addItemView(view1, i);
	//   73  154:aload_0         
	//   74  155:aload           11
	//   75  157:iload_2         
	//   76  158:invokevirtual   #176 <Method void addItemView(View, int)>
					k = i + 1;
	//   77  161:iload_2         
	//   78  162:iconst_1        
	//   79  163:iadd            
	//   80  164:istore          4
				}
				j++;
	//   81  166:iload_3         
	//   82  167:iconst_1        
	//   83  168:iadd            
	//   84  169:istore_3        
			}

	//   85  170:iload           4
	//   86  172:istore_2        
		}
	//*  87  173:goto            53
		do
		{
			if(i >= viewgroup.getChildCount())
				break;
	//   88  176:iload_2         
	//   89  177:aload           7
	//   90  179:invokevirtual   #179 <Method int ViewGroup.getChildCount()>
	//   91  182:icmpge          202
			if(!filterLeftoverView(viewgroup, i))
	//*  92  185:aload_0         
	//*  93  186:aload           7
	//*  94  188:iload_2         
	//*  95  189:invokevirtual   #181 <Method boolean filterLeftoverView(ViewGroup, int)>
	//*  96  192:ifne            176
				i++;
	//   97  195:iload_2         
	//   98  196:iconst_1        
	//   99  197:iadd            
	//  100  198:istore_2        
		} while(true);
	//  101  199:goto            176
	//  102  202:return          
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
