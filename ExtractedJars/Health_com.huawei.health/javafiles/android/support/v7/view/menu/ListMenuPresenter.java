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
	class MenuAdapter extends BaseAdapter
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
		//    4   10:astore_3        
			int j = i + mItemIndexOffset;
		//    5   11:iload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #15  <Field ListMenuPresenter this$0>
		//    8   16:getfield        #54  <Field int ListMenuPresenter.mItemIndexOffset>
		//    9   19:iadd            
		//   10   20:istore_2        
			i = j;
		//   11   21:iload_2         
		//   12   22:istore_1        
			if(mExpandedIndex >= 0)
		//*  13   23:aload_0         
		//*  14   24:getfield        #20  <Field int mExpandedIndex>
		//*  15   27:iflt            44
			{
				i = j;
		//   16   30:iload_2         
		//   17   31:istore_1        
				if(j >= mExpandedIndex)
		//*  18   32:iload_2         
		//*  19   33:aload_0         
		//*  20   34:getfield        #20  <Field int mExpandedIndex>
		//*  21   37:icmplt          44
					i = j + 1;
		//   22   40:iload_2         
		//   23   41:iconst_1        
		//   24   42:iadd            
		//   25   43:istore_1        
			}
			return (MenuItemImpl)arraylist.get(i);
		//   26   44:aload_3         
		//   27   45:iload_1         
		//   28   46:invokevirtual   #48  <Method Object ArrayList.get(int)>
		//   29   49:checkcast       #50  <Class MenuItemImpl>
		//   30   52:areturn         
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
		if(mThemeRes != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field int mThemeRes>
	//*   2    4:ifeq            37
		{
			mContext = ((Context) (new ContextThemeWrapper(context, mThemeRes)));
	//    3    7:aload_0         
	//    4    8:new             #108 <Class ContextThemeWrapper>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #48  <Field int mThemeRes>
	//    9   17:invokespecial   #110 <Method void ContextThemeWrapper(Context, int)>
	//   10   20:putfield        #54  <Field Context mContext>
			mInflater = LayoutInflater.from(mContext);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #54  <Field Context mContext>
	//   14   28:invokestatic    #60  <Method LayoutInflater LayoutInflater.from(Context)>
	//   15   31:putfield        #62  <Field LayoutInflater mInflater>
		} else
	//*  16   34:goto            67
		if(mContext != null)
	//*  17   37:aload_0         
	//*  18   38:getfield        #54  <Field Context mContext>
	//*  19   41:ifnull          67
		{
			mContext = context;
	//   20   44:aload_0         
	//   21   45:aload_1         
	//   22   46:putfield        #54  <Field Context mContext>
			if(mInflater == null)
	//*  23   49:aload_0         
	//*  24   50:getfield        #62  <Field LayoutInflater mInflater>
	//*  25   53:ifnonnull       67
				mInflater = LayoutInflater.from(mContext);
	//   26   56:aload_0         
	//   27   57:aload_0         
	//   28   58:getfield        #54  <Field Context mContext>
	//   29   61:invokestatic    #60  <Method LayoutInflater LayoutInflater.from(Context)>
	//   30   64:putfield        #62  <Field LayoutInflater mInflater>
		}
		mMenu = menubuilder;
	//   31   67:aload_0         
	//   32   68:aload_2         
	//   33   69:putfield        #112 <Field MenuBuilder mMenu>
		if(mAdapter != null)
	//*  34   72:aload_0         
	//*  35   73:getfield        #71  <Field ListMenuPresenter$MenuAdapter mAdapter>
	//*  36   76:ifnull          86
			mAdapter.notifyDataSetChanged();
	//   37   79:aload_0         
	//   38   80:getfield        #71  <Field ListMenuPresenter$MenuAdapter mAdapter>
	//   39   83:invokevirtual   #115 <Method void ListMenuPresenter$MenuAdapter.notifyDataSetChanged()>
	//   40   86:return          
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		if(mCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #119 <Field MenuPresenter$Callback mCallback>
	//*   2    4:ifnull          18
			mCallback.onCloseMenu(menubuilder, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #119 <Field MenuPresenter$Callback mCallback>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #123 <Method void MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
	//    8   18:return          
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
		if(mCallback != null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #119 <Field MenuPresenter$Callback mCallback>
	//*  13   25:ifnull          39
			mCallback.onOpenSubMenu(((MenuBuilder) (submenubuilder)));
	//   14   28:aload_0         
	//   15   29:getfield        #119 <Field MenuPresenter$Callback mCallback>
	//   16   32:aload_1         
	//   17   33:invokeinterface #171 <Method boolean MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
	//   18   38:pop             
		return true;
	//   19   39:iconst_1        
	//   20   40:ireturn         
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
		if(mMenuView != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #85  <Field ExpandedMenuView mMenuView>
	//*   6   12:ifnull          23
			((View) (mMenuView)).saveHierarchyState(sparsearray);
	//    7   15:aload_0         
	//    8   16:getfield        #85  <Field ExpandedMenuView mMenuView>
	//    9   19:aload_2         
	//   10   20:invokevirtual   #185 <Method void View.saveHierarchyState(SparseArray)>
		bundle.putSparseParcelableArray("android:menu:list", sparsearray);
	//   11   23:aload_1         
	//   12   24:ldc1            #22  <String "android:menu:list">
	//   13   26:aload_2         
	//   14   27:invokevirtual   #189 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
	//   15   30:return          
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
		if(mAdapter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field ListMenuPresenter$MenuAdapter mAdapter>
	//*   2    4:ifnull          14
			mAdapter.notifyDataSetChanged();
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field ListMenuPresenter$MenuAdapter mAdapter>
	//    5   11:invokevirtual   #115 <Method void ListMenuPresenter$MenuAdapter.notifyDataSetChanged()>
	//    6   14:return          
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
