// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.*;
import android.widget.*;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.view.menu:
//			MenuPresenter, ExpandedMenuView, MenuBuilder, SubMenuBuilder, 
//			MenuDialogHelper, MenuItemImpl, MenuView

public class ListMenuPresenter
	implements MenuPresenter, android.widget.AdapterView.OnItemClickListener
{
	private class MenuAdapter extends BaseAdapter
	{

		void findExpandedIndex()
		{
			MenuItemImpl menuitemimpl = mMenu.getExpandedItem();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field ListMenuPresenter this$0>
		//    2    4:getfield        #28  <Field MenuBuilder ListMenuPresenter.mMenu>
		//    3    7:invokevirtual   #34  <Method MenuItemImpl MenuBuilder.getExpandedItem()>
		//    4   10:astore_3        
			if(menuitemimpl != null)
		//*   5   11:aload_3         
		//*   6   12:ifnull          66
			{
				ArrayList arraylist = mMenu.getNonActionItems();
		//    7   15:aload_0         
		//    8   16:getfield        #15  <Field ListMenuPresenter this$0>
		//    9   19:getfield        #28  <Field MenuBuilder ListMenuPresenter.mMenu>
		//   10   22:invokevirtual   #38  <Method ArrayList MenuBuilder.getNonActionItems()>
		//   11   25:astore          4
				int j = arraylist.size();
		//   12   27:aload           4
		//   13   29:invokevirtual   #44  <Method int ArrayList.size()>
		//   14   32:istore_2        
				for(int i = 0; i < j; i++)
		//*  15   33:iconst_0        
		//*  16   34:istore_1        
		//*  17   35:iload_1         
		//*  18   36:iload_2         
		//*  19   37:icmpge          66
					if((MenuItemImpl)arraylist.get(i) == menuitemimpl)
		//*  20   40:aload           4
		//*  21   42:iload_1         
		//*  22   43:invokevirtual   #48  <Method Object ArrayList.get(int)>
		//*  23   46:checkcast       #50  <Class MenuItemImpl>
		//*  24   49:aload_3         
		//*  25   50:if_acmpne       59
					{
						mExpandedIndex = i;
		//   26   53:aload_0         
		//   27   54:iload_1         
		//   28   55:putfield        #20  <Field int mExpandedIndex>
						return;
		//   29   58:return          
					}

		//   30   59:iload_1         
		//   31   60:iconst_1        
		//   32   61:iadd            
		//   33   62:istore_1        
			}
		//*  34   63:goto            35
			mExpandedIndex = -1;
		//   35   66:aload_0         
		//   36   67:iconst_m1       
		//   37   68:putfield        #20  <Field int mExpandedIndex>
		//   38   71:return          
		}

		public int getCount()
		{
			int i = mMenu.getNonActionItems().size() - mItemIndexOffset;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field ListMenuPresenter this$0>
		//    2    4:getfield        #28  <Field MenuBuilder ListMenuPresenter.mMenu>
		//    3    7:invokevirtual   #38  <Method ArrayList MenuBuilder.getNonActionItems()>
		//    4   10:invokevirtual   #44  <Method int ArrayList.size()>
		//    5   13:aload_0         
		//    6   14:getfield        #15  <Field ListMenuPresenter this$0>
		//    7   17:getfield        #54  <Field int ListMenuPresenter.mItemIndexOffset>
		//    8   20:isub            
		//    9   21:istore_1        
			if(mExpandedIndex < 0)
		//*  10   22:aload_0         
		//*  11   23:getfield        #20  <Field int mExpandedIndex>
		//*  12   26:ifge            31
				return i;
		//   13   29:iload_1         
		//   14   30:ireturn         
			else
				return i - 1;
		//   15   31:iload_1         
		//   16   32:iconst_1        
		//   17   33:isub            
		//   18   34:ireturn         
		}

		public MenuItemImpl getItem(int i)
		{
			ArrayList arraylist = mMenu.getNonActionItems();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field ListMenuPresenter this$0>
		//    2    4:getfield        #28  <Field MenuBuilder ListMenuPresenter.mMenu>
		//    3    7:invokevirtual   #38  <Method ArrayList MenuBuilder.getNonActionItems()>
		//    4   10:astore          4
			int j = i + mItemIndexOffset;
		//    5   12:iload_1         
		//    6   13:aload_0         
		//    7   14:getfield        #15  <Field ListMenuPresenter this$0>
		//    8   17:getfield        #54  <Field int ListMenuPresenter.mItemIndexOffset>
		//    9   20:iadd            
		//   10   21:istore_2        
			int k = mExpandedIndex;
		//   11   22:aload_0         
		//   12   23:getfield        #20  <Field int mExpandedIndex>
		//   13   26:istore_3        
			i = j;
		//   14   27:iload_2         
		//   15   28:istore_1        
			if(k >= 0)
		//*  16   29:iload_3         
		//*  17   30:iflt            44
			{
				i = j;
		//   18   33:iload_2         
		//   19   34:istore_1        
				if(j >= k)
		//*  20   35:iload_2         
		//*  21   36:iload_3         
		//*  22   37:icmplt          44
					i = j + 1;
		//   23   40:iload_2         
		//   24   41:iconst_1        
		//   25   42:iadd            
		//   26   43:istore_1        
			}
			return (MenuItemImpl)arraylist.get(i);
		//   27   44:aload           4
		//   28   46:iload_1         
		//   29   47:invokevirtual   #48  <Method Object ArrayList.get(int)>
		//   30   50:checkcast       #50  <Class MenuItemImpl>
		//   31   53:areturn         
		}

		public volatile Object getItem(int i)
		{
			return ((Object) (getItem(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #58  <Method MenuItemImpl getItem(int)>
		//    3    5:areturn         
		}

		public long getItemId(int i)
		{
			return (long)i;
		//    0    0:iload_1         
		//    1    1:i2l             
		//    2    2:lreturn         
		}

		public View getView(int i, View view, ViewGroup viewgroup)
		{
			View view1 = view;
		//    0    0:aload_2         
		//    1    1:astore          4
			if(view == null)
		//*   2    3:aload_2         
		//*   3    4:ifnonnull       28
				view1 = mInflater.inflate(mItemLayoutRes, viewgroup, false);
		//    4    7:aload_0         
		//    5    8:getfield        #15  <Field ListMenuPresenter this$0>
		//    6   11:getfield        #66  <Field LayoutInflater ListMenuPresenter.mInflater>
		//    7   14:aload_0         
		//    8   15:getfield        #15  <Field ListMenuPresenter this$0>
		//    9   18:getfield        #69  <Field int ListMenuPresenter.mItemLayoutRes>
		//   10   21:aload_3         
		//   11   22:iconst_0        
		//   12   23:invokevirtual   #75  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   13   26:astore          4
			((MenuView.ItemView)view1).initialize(getItem(i), 0);
		//   14   28:aload           4
		//   15   30:checkcast       #77  <Class MenuView$ItemView>
		//   16   33:aload_0         
		//   17   34:iload_1         
		//   18   35:invokevirtual   #58  <Method MenuItemImpl getItem(int)>
		//   19   38:iconst_0        
		//   20   39:invokeinterface #81  <Method void MenuView$ItemView.initialize(MenuItemImpl, int)>
			return view1;
		//   21   44:aload           4
		//   22   46:areturn         
		}

		public void notifyDataSetChanged()
		{
			findExpandedIndex();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #23  <Method void findExpandedIndex()>
			super.notifyDataSetChanged();
		//    2    4:aload_0         
		//    3    5:invokespecial   #84  <Method void BaseAdapter.notifyDataSetChanged()>
		//    4    8:return          
		}

		private int mExpandedIndex;
		final ListMenuPresenter this$0;

		public MenuAdapter()
		{
			this$0 = ListMenuPresenter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ListMenuPresenter this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void BaseAdapter()>
			mExpandedIndex = -1;
		//    5    9:aload_0         
		//    6   10:iconst_m1       
		//    7   11:putfield        #20  <Field int mExpandedIndex>
			findExpandedIndex();
		//    8   14:aload_0         
		//    9   15:invokevirtual   #23  <Method void findExpandedIndex()>
		//   10   18:return          
		}
	}


	public ListMenuPresenter(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		mItemLayoutRes = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #46  <Field int mItemLayoutRes>
		mThemeRes = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #48  <Field int mThemeRes>
	//    8   14:return          
	}

	public ListMenuPresenter(Context context, int i)
	{
		this(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #52  <Method void ListMenuPresenter(int, int)>
		mContext = context;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #54  <Field Context mContext>
		mInflater = LayoutInflater.from(mContext);
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:getfield        #54  <Field Context mContext>
	//   10   16:invokestatic    #60  <Method LayoutInflater LayoutInflater.from(Context)>
	//   11   19:putfield        #62  <Field LayoutInflater mInflater>
	//   12   22:return          
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

	public boolean flagActionItems()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public ListAdapter getAdapter()
	{
		if(mAdapter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field ListMenuPresenter$MenuAdapter mAdapter>
	//*   2    4:ifnonnull       19
			mAdapter = new MenuAdapter();
	//    3    7:aload_0         
	//    4    8:new             #10  <Class ListMenuPresenter$MenuAdapter>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #74  <Method void ListMenuPresenter$MenuAdapter(ListMenuPresenter)>
	//    8   16:putfield        #71  <Field ListMenuPresenter$MenuAdapter mAdapter>
		return ((ListAdapter) (mAdapter));
	//    9   19:aload_0         
	//   10   20:getfield        #71  <Field ListMenuPresenter$MenuAdapter mAdapter>
	//   11   23:areturn         
	}

	public int getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int mId>
	//    2    4:ireturn         
	}

	int getItemIndexOffset()
	{
		return mItemIndexOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int mItemIndexOffset>
	//    2    4:ireturn         
	}

	public MenuView getMenuView(ViewGroup viewgroup)
	{
		if(mMenuView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field ExpandedMenuView mMenuView>
	//*   2    4:ifnonnull       64
		{
			mMenuView = (ExpandedMenuView)mInflater.inflate(android.support.v7.appcompat.R.layout.abc_expanded_menu_layout, viewgroup, false);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #62  <Field LayoutInflater mInflater>
	//    6   12:getstatic       #90  <Field int android.support.v7.appcompat.R$layout.abc_expanded_menu_layout>
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #94  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   10   20:checkcast       #96  <Class ExpandedMenuView>
	//   11   23:putfield        #85  <Field ExpandedMenuView mMenuView>
			if(mAdapter == null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #71  <Field ListMenuPresenter$MenuAdapter mAdapter>
	//*  14   30:ifnonnull       45
				mAdapter = new MenuAdapter();
	//   15   33:aload_0         
	//   16   34:new             #10  <Class ListMenuPresenter$MenuAdapter>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #74  <Method void ListMenuPresenter$MenuAdapter(ListMenuPresenter)>
	//   20   42:putfield        #71  <Field ListMenuPresenter$MenuAdapter mAdapter>
			mMenuView.setAdapter(((ListAdapter) (mAdapter)));
	//   21   45:aload_0         
	//   22   46:getfield        #85  <Field ExpandedMenuView mMenuView>
	//   23   49:aload_0         
	//   24   50:getfield        #71  <Field ListMenuPresenter$MenuAdapter mAdapter>
	//   25   53:invokevirtual   #100 <Method void ExpandedMenuView.setAdapter(ListAdapter)>
			mMenuView.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (this)));
	//   26   56:aload_0         
	//   27   57:getfield        #85  <Field ExpandedMenuView mMenuView>
	//   28   60:aload_0         
	//   29   61:invokevirtual   #104 <Method void ExpandedMenuView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		}
		return ((MenuView) (mMenuView));
	//   30   64:aload_0         
	//   31   65:getfield        #85  <Field ExpandedMenuView mMenuView>
	//   32   68:areturn         
	}

	public void initForMenu(Context context, MenuBuilder menubuilder)
	{
		int i = mThemeRes;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int mThemeRes>
	//    2    4:istore_3        
		if(i != 0)
	//*   3    5:iload_3         
	//*   4    6:ifeq            36
		{
			mContext = ((Context) (new ContextThemeWrapper(context, i)));
	//    5    9:aload_0         
	//    6   10:new             #108 <Class ContextThemeWrapper>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:iload_3         
	//   10   16:invokespecial   #110 <Method void ContextThemeWrapper(Context, int)>
	//   11   19:putfield        #54  <Field Context mContext>
			mInflater = LayoutInflater.from(mContext);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #54  <Field Context mContext>
	//   15   27:invokestatic    #60  <Method LayoutInflater LayoutInflater.from(Context)>
	//   16   30:putfield        #62  <Field LayoutInflater mInflater>
		} else
	//*  17   33:goto            66
		if(mContext != null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #54  <Field Context mContext>
	//*  20   40:ifnull          66
		{
			mContext = context;
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:putfield        #54  <Field Context mContext>
			if(mInflater == null)
	//*  24   48:aload_0         
	//*  25   49:getfield        #62  <Field LayoutInflater mInflater>
	//*  26   52:ifnonnull       66
				mInflater = LayoutInflater.from(mContext);
	//   27   55:aload_0         
	//   28   56:aload_0         
	//   29   57:getfield        #54  <Field Context mContext>
	//   30   60:invokestatic    #60  <Method LayoutInflater LayoutInflater.from(Context)>
	//   31   63:putfield        #62  <Field LayoutInflater mInflater>
		}
		mMenu = menubuilder;
	//   32   66:aload_0         
	//   33   67:aload_2         
	//   34   68:putfield        #112 <Field MenuBuilder mMenu>
		context = ((Context) (mAdapter));
	//   35   71:aload_0         
	//   36   72:getfield        #71  <Field ListMenuPresenter$MenuAdapter mAdapter>
	//   37   75:astore_1        
		if(context != null)
	//*  38   76:aload_1         
	//*  39   77:ifnull          84
			((MenuAdapter) (context)).notifyDataSetChanged();
	//   40   80:aload_1         
	//   41   81:invokevirtual   #115 <Method void ListMenuPresenter$MenuAdapter.notifyDataSetChanged()>
	//   42   84:return          
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		MenuPresenter.Callback callback = mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MenuPresenter$Callback mCallback>
	//    2    4:astore_3        
		if(callback != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
			callback.onCloseMenu(menubuilder, flag);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokeinterface #123 <Method void MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
	//    9   17:return          
	}

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		mMenu.performItemAction(((android.view.MenuItem) (mAdapter.getItem(i))), ((MenuPresenter) (this)), 0);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field MenuBuilder mMenu>
	//    2    4:aload_0         
	//    3    5:getfield        #71  <Field ListMenuPresenter$MenuAdapter mAdapter>
	//    4    8:iload_3         
	//    5    9:invokevirtual   #129 <Method MenuItemImpl ListMenuPresenter$MenuAdapter.getItem(int)>
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #135 <Method boolean MenuBuilder.performItemAction(android.view.MenuItem, MenuPresenter, int)>
	//    9   17:pop             
	//   10   18:return          
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		restoreHierarchyState((Bundle)parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #141 <Class Bundle>
	//    3    5:invokevirtual   #145 <Method void restoreHierarchyState(Bundle)>
	//    4    8:return          
	}

	public Parcelable onSaveInstanceState()
	{
		if(mMenuView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field ExpandedMenuView mMenuView>
	//*   2    4:ifnonnull       9
		{
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		} else
		{
			Bundle bundle = new Bundle();
	//    5    9:new             #141 <Class Bundle>
	//    6   12:dup             
	//    7   13:invokespecial   #148 <Method void Bundle()>
	//    8   16:astore_1        
			saveHierarchyState(bundle);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #151 <Method void saveHierarchyState(Bundle)>
			return ((Parcelable) (bundle));
	//   12   22:aload_1         
	//   13   23:areturn         
		}
	}

	public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
	{
		if(!submenubuilder.hasVisibleItems())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #158 <Method boolean SubMenuBuilder.hasVisibleItems()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		(new MenuDialogHelper(((MenuBuilder) (submenubuilder)))).show(((android.os.IBinder) (null)));
	//    5    9:new             #160 <Class MenuDialogHelper>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #163 <Method void MenuDialogHelper(MenuBuilder)>
	//    9   17:aconst_null     
	//   10   18:invokevirtual   #167 <Method void MenuDialogHelper.show(android.os.IBinder)>
		MenuPresenter.Callback callback = mCallback;
	//   11   21:aload_0         
	//   12   22:getfield        #119 <Field MenuPresenter$Callback mCallback>
	//   13   25:astore_2        
		if(callback != null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          38
			callback.onOpenSubMenu(((MenuBuilder) (submenubuilder)));
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:invokeinterface #171 <Method boolean MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
	//   19   37:pop             
		return true;
	//   20   38:iconst_1        
	//   21   39:ireturn         
	}

	public void restoreHierarchyState(Bundle bundle)
	{
		bundle = ((Bundle) (bundle.getSparseParcelableArray("android:menu:list")));
	//    0    0:aload_1         
	//    1    1:ldc1            #22  <String "android:menu:list">
	//    2    3:invokevirtual   #175 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//    3    6:astore_1        
		if(bundle != null)
	//*   4    7:aload_1         
	//*   5    8:ifnull          19
			((View) (mMenuView)).restoreHierarchyState(((SparseArray) (bundle)));
	//    6   11:aload_0         
	//    7   12:getfield        #85  <Field ExpandedMenuView mMenuView>
	//    8   15:aload_1         
	//    9   16:invokevirtual   #180 <Method void View.restoreHierarchyState(SparseArray)>
	//   10   19:return          
	}

	public void saveHierarchyState(Bundle bundle)
	{
		SparseArray sparsearray = new SparseArray();
	//    0    0:new             #182 <Class SparseArray>
	//    1    3:dup             
	//    2    4:invokespecial   #183 <Method void SparseArray()>
	//    3    7:astore_2        
		ExpandedMenuView expandedmenuview = mMenuView;
	//    4    8:aload_0         
	//    5    9:getfield        #85  <Field ExpandedMenuView mMenuView>
	//    6   12:astore_3        
		if(expandedmenuview != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          22
			((View) (expandedmenuview)).saveHierarchyState(sparsearray);
	//    9   17:aload_3         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #185 <Method void View.saveHierarchyState(SparseArray)>
		bundle.putSparseParcelableArray("android:menu:list", sparsearray);
	//   12   22:aload_1         
	//   13   23:ldc1            #22  <String "android:menu:list">
	//   14   25:aload_2         
	//   15   26:invokevirtual   #189 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
	//   16   29:return          
	}

	public void setCallback(MenuPresenter.Callback callback)
	{
		mCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #119 <Field MenuPresenter$Callback mCallback>
	//    3    5:return          
	}

	public void setId(int i)
	{
		mId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field int mId>
	//    3    5:return          
	}

	public void setItemIndexOffset(int i)
	{
		mItemIndexOffset = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #81  <Field int mItemIndexOffset>
		if(mMenuView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #85  <Field ExpandedMenuView mMenuView>
	//*   5    9:ifnull          17
			updateMenuView(false);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #198 <Method void updateMenuView(boolean)>
	//    9   17:return          
	}

	public void updateMenuView(boolean flag)
	{
		MenuAdapter menuadapter = mAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ListMenuPresenter$MenuAdapter mAdapter>
	//    2    4:astore_2        
		if(menuadapter != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          13
			menuadapter.notifyDataSetChanged();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #115 <Method void ListMenuPresenter$MenuAdapter.notifyDataSetChanged()>
	//    7   13:return          
	}

	private static final String TAG = "ListMenuPresenter";
	public static final String VIEWS_TAG = "android:menu:list";
	MenuAdapter mAdapter;
	private MenuPresenter.Callback mCallback;
	Context mContext;
	private int mId;
	LayoutInflater mInflater;
	int mItemIndexOffset;
	int mItemLayoutRes;
	MenuBuilder mMenu;
	ExpandedMenuView mMenuView;
	int mThemeRes;
}
