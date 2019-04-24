// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.*;
import android.content.pm.*;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ActionProvider;
import android.util.SparseArray;
import android.view.*;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package android.support.v7.view.menu:
//			MenuItemImpl, MenuPresenter, SubMenuBuilder

public class MenuBuilder
	implements SupportMenu
{
	public static interface Callback
	{

		public abstract boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem);

		public abstract void onMenuModeChange(MenuBuilder menubuilder);
	}

	public static interface ItemInvoker
	{

		public abstract boolean invokeItem(MenuItemImpl menuitemimpl);
	}


	public MenuBuilder(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
		mDefaultShowAsAction = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #84  <Field int mDefaultShowAsAction>
		mPreventDispatchingItemsChanged = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #86  <Field boolean mPreventDispatchingItemsChanged>
		mItemsChangedWhileDispatchPrevented = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #88  <Field boolean mItemsChangedWhileDispatchPrevented>
		mStructureChangedWhileDispatchPrevented = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #90  <Field boolean mStructureChangedWhileDispatchPrevented>
		mOptionalIconsVisible = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #92  <Field boolean mOptionalIconsVisible>
		mIsClosing = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #94  <Field boolean mIsClosing>
		mTempShortcutItemList = new ArrayList();
	//   20   34:aload_0         
	//   21   35:new             #96  <Class ArrayList>
	//   22   38:dup             
	//   23   39:invokespecial   #97  <Method void ArrayList()>
	//   24   42:putfield        #99  <Field ArrayList mTempShortcutItemList>
		mPresenters = new CopyOnWriteArrayList();
	//   25   45:aload_0         
	//   26   46:new             #101 <Class CopyOnWriteArrayList>
	//   27   49:dup             
	//   28   50:invokespecial   #102 <Method void CopyOnWriteArrayList()>
	//   29   53:putfield        #104 <Field CopyOnWriteArrayList mPresenters>
		mContext = context;
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:putfield        #106 <Field Context mContext>
		mResources = context.getResources();
	//   33   61:aload_0         
	//   34   62:aload_1         
	//   35   63:invokevirtual   #112 <Method Resources Context.getResources()>
	//   36   66:putfield        #114 <Field Resources mResources>
		mItems = new ArrayList();
	//   37   69:aload_0         
	//   38   70:new             #96  <Class ArrayList>
	//   39   73:dup             
	//   40   74:invokespecial   #97  <Method void ArrayList()>
	//   41   77:putfield        #116 <Field ArrayList mItems>
		mVisibleItems = new ArrayList();
	//   42   80:aload_0         
	//   43   81:new             #96  <Class ArrayList>
	//   44   84:dup             
	//   45   85:invokespecial   #97  <Method void ArrayList()>
	//   46   88:putfield        #118 <Field ArrayList mVisibleItems>
		mIsVisibleItemsStale = true;
	//   47   91:aload_0         
	//   48   92:iconst_1        
	//   49   93:putfield        #120 <Field boolean mIsVisibleItemsStale>
		mActionItems = new ArrayList();
	//   50   96:aload_0         
	//   51   97:new             #96  <Class ArrayList>
	//   52  100:dup             
	//   53  101:invokespecial   #97  <Method void ArrayList()>
	//   54  104:putfield        #122 <Field ArrayList mActionItems>
		mNonActionItems = new ArrayList();
	//   55  107:aload_0         
	//   56  108:new             #96  <Class ArrayList>
	//   57  111:dup             
	//   58  112:invokespecial   #97  <Method void ArrayList()>
	//   59  115:putfield        #124 <Field ArrayList mNonActionItems>
		mIsActionItemsStale = true;
	//   60  118:aload_0         
	//   61  119:iconst_1        
	//   62  120:putfield        #126 <Field boolean mIsActionItemsStale>
		setShortcutsVisibleInner(true);
	//   63  123:aload_0         
	//   64  124:iconst_1        
	//   65  125:invokespecial   #130 <Method void setShortcutsVisibleInner(boolean)>
	//   66  128:return          
	}

	private MenuItemImpl createNewMenuItem(int i, int j, int k, int l, CharSequence charsequence, int i1)
	{
		return new MenuItemImpl(this, i, j, k, l, charsequence, i1);
	//    0    0:new             #134 <Class MenuItemImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:aload           5
	//    8   12:iload           6
	//    9   14:invokespecial   #137 <Method void MenuItemImpl(MenuBuilder, int, int, int, int, CharSequence, int)>
	//   10   17:areturn         
	}

	private void dispatchPresenterUpdate(boolean flag)
	{
		if(mPresenters.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//*   2    4:invokevirtual   #142 <Method boolean CopyOnWriteArrayList.isEmpty()>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		stopDispatchingItemsChanged();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #145 <Method void stopDispatchingItemsChanged()>
		for(Iterator iterator = mPresenters.iterator(); iterator.hasNext();)
	//*   7   15:aload_0         
	//*   8   16:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//*   9   19:invokevirtual   #149 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  10   22:astore_2        
	//*  11   23:aload_2         
	//*  12   24:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//*  13   29:ifeq            79
		{
			WeakReference weakreference = (WeakReference)iterator.next();
	//   14   32:aload_2         
	//   15   33:invokeinterface #158 <Method Object Iterator.next()>
	//   16   38:checkcast       #160 <Class WeakReference>
	//   17   41:astore_3        
			MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
	//   18   42:aload_3         
	//   19   43:invokevirtual   #163 <Method Object WeakReference.get()>
	//   20   46:checkcast       #165 <Class MenuPresenter>
	//   21   49:astore          4
			if(menupresenter == null)
	//*  22   51:aload           4
	//*  23   53:ifnonnull       68
				mPresenters.remove(((Object) (weakreference)));
	//   24   56:aload_0         
	//   25   57:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   26   60:aload_3         
	//   27   61:invokevirtual   #169 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   28   64:pop             
			else
	//*  29   65:goto            23
				menupresenter.updateMenuView(flag);
	//   30   68:aload           4
	//   31   70:iload_1         
	//   32   71:invokeinterface #172 <Method void MenuPresenter.updateMenuView(boolean)>
		}

	//*  33   76:goto            23
		startDispatchingItemsChanged();
	//   34   79:aload_0         
	//   35   80:invokevirtual   #175 <Method void startDispatchingItemsChanged()>
	//   36   83:return          
	}

	private void dispatchRestoreInstanceState(Bundle bundle)
	{
		bundle = ((Bundle) (bundle.getSparseParcelableArray("android:menu:presenters")));
	//    0    0:aload_1         
	//    1    1:ldc1            #26  <String "android:menu:presenters">
	//    2    3:invokevirtual   #183 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//    3    6:astore_1        
		if(bundle != null && !mPresenters.isEmpty())
	//*   4    7:aload_1         
	//*   5    8:ifnull          21
	//*   6   11:aload_0         
	//*   7   12:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//*   8   15:invokevirtual   #142 <Method boolean CopyOnWriteArrayList.isEmpty()>
	//*   9   18:ifeq            22
	//*  10   21:return          
		{
			Iterator iterator = mPresenters.iterator();
	//   11   22:aload_0         
	//   12   23:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   13   26:invokevirtual   #149 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   14   29:astore_3        
			while(iterator.hasNext()) 
	//*  15   30:aload_3         
	//*  16   31:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//*  17   36:ifeq            21
			{
				WeakReference weakreference = (WeakReference)iterator.next();
	//   18   39:aload_3         
	//   19   40:invokeinterface #158 <Method Object Iterator.next()>
	//   20   45:checkcast       #160 <Class WeakReference>
	//   21   48:astore          5
				MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
	//   22   50:aload           5
	//   23   52:invokevirtual   #163 <Method Object WeakReference.get()>
	//   24   55:checkcast       #165 <Class MenuPresenter>
	//   25   58:astore          4
				if(menupresenter == null)
	//*  26   60:aload           4
	//*  27   62:ifnonnull       78
				{
					mPresenters.remove(((Object) (weakreference)));
	//   28   65:aload_0         
	//   29   66:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   30   69:aload           5
	//   31   71:invokevirtual   #169 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   32   74:pop             
				} else
	//*  33   75:goto            30
				{
					int i = menupresenter.getId();
	//   34   78:aload           4
	//   35   80:invokeinterface #187 <Method int MenuPresenter.getId()>
	//   36   85:istore_2        
					if(i > 0)
	//*  37   86:iload_2         
	//*  38   87:ifle            30
					{
						Parcelable parcelable = (Parcelable)((SparseArray) (bundle)).get(i);
	//   39   90:aload_1         
	//   40   91:iload_2         
	//   41   92:invokevirtual   #192 <Method Object SparseArray.get(int)>
	//   42   95:checkcast       #194 <Class Parcelable>
	//   43   98:astore          5
						if(parcelable != null)
	//*  44  100:aload           5
	//*  45  102:ifnull          30
							menupresenter.onRestoreInstanceState(parcelable);
	//   46  105:aload           4
	//   47  107:aload           5
	//   48  109:invokeinterface #198 <Method void MenuPresenter.onRestoreInstanceState(Parcelable)>
					}
				}
			}
		}
	//*  49  114:goto            30
	}

	private void dispatchSaveInstanceState(Bundle bundle)
	{
		if(mPresenters.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//*   2    4:invokevirtual   #142 <Method boolean CopyOnWriteArrayList.isEmpty()>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		SparseArray sparsearray = new SparseArray();
	//    5   11:new             #189 <Class SparseArray>
	//    6   14:dup             
	//    7   15:invokespecial   #200 <Method void SparseArray()>
	//    8   18:astore_3        
		Iterator iterator = mPresenters.iterator();
	//    9   19:aload_0         
	//   10   20:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   11   23:invokevirtual   #149 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   12   26:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   13   28:aload           4
	//   14   30:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//   15   35:ifeq            114
			WeakReference weakreference = (WeakReference)iterator.next();
	//   16   38:aload           4
	//   17   40:invokeinterface #158 <Method Object Iterator.next()>
	//   18   45:checkcast       #160 <Class WeakReference>
	//   19   48:astore          5
			MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
	//   20   50:aload           5
	//   21   52:invokevirtual   #163 <Method Object WeakReference.get()>
	//   22   55:checkcast       #165 <Class MenuPresenter>
	//   23   58:astore          6
			if(menupresenter == null)
	//*  24   60:aload           6
	//*  25   62:ifnonnull       78
			{
				mPresenters.remove(((Object) (weakreference)));
	//   26   65:aload_0         
	//   27   66:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   28   69:aload           5
	//   29   71:invokevirtual   #169 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   30   74:pop             
			} else
	//*  31   75:goto            28
			{
				int i = menupresenter.getId();
	//   32   78:aload           6
	//   33   80:invokeinterface #187 <Method int MenuPresenter.getId()>
	//   34   85:istore_2        
				if(i > 0)
	//*  35   86:iload_2         
	//*  36   87:ifle            28
				{
					Parcelable parcelable = menupresenter.onSaveInstanceState();
	//   37   90:aload           6
	//   38   92:invokeinterface #204 <Method Parcelable MenuPresenter.onSaveInstanceState()>
	//   39   97:astore          5
					if(parcelable != null)
	//*  40   99:aload           5
	//*  41  101:ifnull          28
						sparsearray.put(i, ((Object) (parcelable)));
	//   42  104:aload_3         
	//   43  105:iload_2         
	//   44  106:aload           5
	//   45  108:invokevirtual   #208 <Method void SparseArray.put(int, Object)>
				}
			}
		} while(true);
	//   46  111:goto            28
		bundle.putSparseParcelableArray("android:menu:presenters", sparsearray);
	//   47  114:aload_1         
	//   48  115:ldc1            #26  <String "android:menu:presenters">
	//   49  117:aload_3         
	//   50  118:invokevirtual   #212 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
	//   51  121:return          
	}

	private boolean dispatchSubMenuSelected(SubMenuBuilder submenubuilder, MenuPresenter menupresenter)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(mPresenters.isEmpty())
	//*   2    2:aload_0         
	//*   3    3:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//*   4    6:invokevirtual   #142 <Method boolean CopyOnWriteArrayList.isEmpty()>
	//*   5    9:ifeq            14
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		if(menupresenter != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          26
			flag = menupresenter.onSubMenuSelected(submenubuilder);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokeinterface #218 <Method boolean MenuPresenter.onSubMenuSelected(SubMenuBuilder)>
	//   13   25:istore_3        
		menupresenter = ((MenuPresenter) (mPresenters.iterator()));
	//   14   26:aload_0         
	//   15   27:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   16   30:invokevirtual   #149 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   17   33:astore_2        
		do
		{
			if(!((Iterator) (menupresenter)).hasNext())
				break;
	//   18   34:aload_2         
	//   19   35:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//   20   40:ifeq            98
			WeakReference weakreference = (WeakReference)((Iterator) (menupresenter)).next();
	//   21   43:aload_2         
	//   22   44:invokeinterface #158 <Method Object Iterator.next()>
	//   23   49:checkcast       #160 <Class WeakReference>
	//   24   52:astore          4
			MenuPresenter menupresenter1 = (MenuPresenter)weakreference.get();
	//   25   54:aload           4
	//   26   56:invokevirtual   #163 <Method Object WeakReference.get()>
	//   27   59:checkcast       #165 <Class MenuPresenter>
	//   28   62:astore          5
			if(menupresenter1 == null)
	//*  29   64:aload           5
	//*  30   66:ifnonnull       82
				mPresenters.remove(((Object) (weakreference)));
	//   31   69:aload_0         
	//   32   70:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   33   73:aload           4
	//   34   75:invokevirtual   #169 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   35   78:pop             
			else
	//*  36   79:goto            34
			if(!flag)
	//*  37   82:iload_3         
	//*  38   83:ifne            100
				flag = menupresenter1.onSubMenuSelected(submenubuilder);
	//   39   86:aload           5
	//   40   88:aload_1         
	//   41   89:invokeinterface #218 <Method boolean MenuPresenter.onSubMenuSelected(SubMenuBuilder)>
	//   42   94:istore_3        
		} while(true);
	//   43   95:goto            79
		return flag;
	//   44   98:iload_3         
	//   45   99:ireturn         
	//*  46  100:goto            79
	}

	private static int findInsertIndex(ArrayList arraylist, int i)
	{
		for(int j = arraylist.size() - 1; j >= 0; j--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #223 <Method int ArrayList.size()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            37
			if(((MenuItemImpl)arraylist.get(j)).getOrdering() <= i)
	//*   7   11:aload_0         
	//*   8   12:iload_2         
	//*   9   13:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//*  10   16:checkcast       #134 <Class MenuItemImpl>
	//*  11   19:invokevirtual   #227 <Method int MenuItemImpl.getOrdering()>
	//*  12   22:iload_1         
	//*  13   23:icmpgt          30
				return j + 1;
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:ireturn         

	//   18   30:iload_2         
	//   19   31:iconst_1        
	//   20   32:isub            
	//   21   33:istore_2        
	//*  22   34:goto            7
		return 0;
	//   23   37:iconst_0        
	//   24   38:ireturn         
	}

	private static int getOrdering(int i)
	{
		int j = (0xffff0000 & i) >> 16;
	//    0    0:ldc1            #231 <Int 0xffff0000>
	//    1    2:iload_0         
	//    2    3:iand            
	//    3    4:bipush          16
	//    4    6:ishr            
	//    5    7:istore_1        
		if(j < 0 || j >= sCategoryToOrder.length)
	//*   6    8:iload_1         
	//*   7    9:iflt            20
	//*   8   12:iload_1         
	//*   9   13:getstatic       #77  <Field int[] sCategoryToOrder>
	//*  10   16:arraylength     
	//*  11   17:icmplt          30
			throw new IllegalArgumentException("order does not contain a valid category.");
	//   12   20:new             #233 <Class IllegalArgumentException>
	//   13   23:dup             
	//   14   24:ldc1            #235 <String "order does not contain a valid category.">
	//   15   26:invokespecial   #238 <Method void IllegalArgumentException(String)>
	//   16   29:athrow          
		else
			return sCategoryToOrder[j] << 16 | 0xffff & i;
	//   17   30:getstatic       #77  <Field int[] sCategoryToOrder>
	//   18   33:iload_1         
	//   19   34:iaload          
	//   20   35:bipush          16
	//   21   37:ishl            
	//   22   38:ldc1            #239 <Int 65535>
	//   23   40:iload_0         
	//   24   41:iand            
	//   25   42:ior             
	//   26   43:ireturn         
	}

	private void removeItemAtInt(int i, boolean flag)
	{
		if(i >= 0 && i < mItems.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            15
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #116 <Field ArrayList mItems>
	//*   5    9:invokevirtual   #223 <Method int ArrayList.size()>
	//*   6   12:icmplt          16
	//*   7   15:return          
		{
			mItems.remove(i);
	//    8   16:aload_0         
	//    9   17:getfield        #116 <Field ArrayList mItems>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #243 <Method Object ArrayList.remove(int)>
	//   12   24:pop             
			if(flag)
	//*  13   25:iload_2         
	//*  14   26:ifeq            15
			{
				onItemsChanged(true);
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:invokevirtual   #246 <Method void onItemsChanged(boolean)>
				return;
	//   18   34:return          
			}
		}
	}

	private void setHeaderInternal(int i, CharSequence charsequence, int j, Drawable drawable, View view)
	{
		Resources resources = getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #249 <Method Resources getResources()>
	//    2    4:astore          6
		if(view == null) goto _L2; else goto _L1
	//    3    6:aload           5
	//    4    8:ifnull          33
_L1:
		mHeaderView = view;
	//    5   11:aload_0         
	//    6   12:aload           5
	//    7   14:putfield        #251 <Field View mHeaderView>
		mHeaderTitle = null;
	//    8   17:aload_0         
	//    9   18:aconst_null     
	//   10   19:putfield        #253 <Field CharSequence mHeaderTitle>
		mHeaderIcon = null;
	//   11   22:aload_0         
	//   12   23:aconst_null     
	//   13   24:putfield        #255 <Field Drawable mHeaderIcon>
_L4:
		onItemsChanged(false);
	//   14   27:aload_0         
	//   15   28:iconst_0        
	//   16   29:invokevirtual   #246 <Method void onItemsChanged(boolean)>
		return;
	//   17   32:return          
_L2:
		if(i > 0)
	//*  18   33:iload_1         
	//*  19   34:ifle            71
			mHeaderTitle = resources.getText(i);
	//   20   37:aload_0         
	//   21   38:aload           6
	//   22   40:iload_1         
	//   23   41:invokevirtual   #261 <Method CharSequence Resources.getText(int)>
	//   24   44:putfield        #253 <Field CharSequence mHeaderTitle>
		else
	//*  25   47:iload_3         
	//*  26   48:ifle            83
	//*  27   51:aload_0         
	//*  28   52:aload_0         
	//*  29   53:invokevirtual   #265 <Method Context getContext()>
	//*  30   56:iload_3         
	//*  31   57:invokestatic    #271 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//*  32   60:putfield        #255 <Field Drawable mHeaderIcon>
	//*  33   63:aload_0         
	//*  34   64:aconst_null     
	//*  35   65:putfield        #251 <Field View mHeaderView>
	//*  36   68:goto            27
		if(charsequence != null)
	//*  37   71:aload_2         
	//*  38   72:ifnull          47
			mHeaderTitle = charsequence;
	//   39   75:aload_0         
	//   40   76:aload_2         
	//   41   77:putfield        #253 <Field CharSequence mHeaderTitle>
		if(j <= 0)
			break; /* Loop/switch isn't completed */
		mHeaderIcon = ContextCompat.getDrawable(getContext(), j);
_L6:
		mHeaderView = null;
		if(true) goto _L4; else goto _L3
	//*  42   80:goto            47
_L3:
		if(drawable == null) goto _L6; else goto _L5
	//   43   83:aload           4
	//   44   85:ifnull          63
_L5:
		mHeaderIcon = drawable;
	//   45   88:aload_0         
	//   46   89:aload           4
	//   47   91:putfield        #255 <Field Drawable mHeaderIcon>
		  goto _L6
	//*  48   94:goto            63
	}

	private void setShortcutsVisibleInner(boolean flag)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(flag && mResources.getConfiguration().keyboard != 1 && mResources.getBoolean(android.support.v7.appcompat.R.bool.abc_config_showMenuShortcutsWhenKeyboardPresent))
	//*   2    2:iload_1         
	//*   3    3:ifeq            41
	//*   4    6:aload_0         
	//*   5    7:getfield        #114 <Field Resources mResources>
	//*   6   10:invokevirtual   #275 <Method Configuration Resources.getConfiguration()>
	//*   7   13:getfield        #280 <Field int Configuration.keyboard>
	//*   8   16:iconst_1        
	//*   9   17:icmpeq          41
	//*  10   20:aload_0         
	//*  11   21:getfield        #114 <Field Resources mResources>
	//*  12   24:getstatic       #285 <Field int android.support.v7.appcompat.R$bool.abc_config_showMenuShortcutsWhenKeyboardPresent>
	//*  13   27:invokevirtual   #289 <Method boolean Resources.getBoolean(int)>
	//*  14   30:ifeq            41
			flag = flag1;
	//   15   33:iload_2         
	//   16   34:istore_1        
		else
	//*  17   35:aload_0         
	//*  18   36:iload_1         
	//*  19   37:putfield        #291 <Field boolean mShortcutsVisible>
	//*  20   40:return          
			flag = false;
	//   21   41:iconst_0        
	//   22   42:istore_1        
		mShortcutsVisible = flag;
	//*  23   43:goto            35
	}

	public MenuItem add(int i)
	{
		return addInternal(0, 0, 0, ((CharSequence) (mResources.getString(i))));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:aload_0         
	//    5    5:getfield        #114 <Field Resources mResources>
	//    6    8:iload_1         
	//    7    9:invokevirtual   #297 <Method String Resources.getString(int)>
	//    8   12:invokevirtual   #301 <Method MenuItem addInternal(int, int, int, CharSequence)>
	//    9   15:areturn         
	}

	public MenuItem add(int i, int j, int k, int l)
	{
		return addInternal(i, j, k, ((CharSequence) (mResources.getString(l))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload_0         
	//    5    5:getfield        #114 <Field Resources mResources>
	//    6    8:iload           4
	//    7   10:invokevirtual   #297 <Method String Resources.getString(int)>
	//    8   13:invokevirtual   #301 <Method MenuItem addInternal(int, int, int, CharSequence)>
	//    9   16:areturn         
	}

	public MenuItem add(int i, int j, int k, CharSequence charsequence)
	{
		return addInternal(i, j, k, charsequence);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #301 <Method MenuItem addInternal(int, int, int, CharSequence)>
	//    6    9:areturn         
	}

	public MenuItem add(CharSequence charsequence)
	{
		return addInternal(0, 0, 0, charsequence);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:aload_1         
	//    5    5:invokevirtual   #301 <Method MenuItem addInternal(int, int, int, CharSequence)>
	//    6    8:areturn         
	}

	public int addIntentOptions(int i, int j, int k, ComponentName componentname, Intent aintent[], Intent intent, int l, 
			MenuItem amenuitem[])
	{
		PackageManager packagemanager = mContext.getPackageManager();
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Context mContext>
	//    2    4:invokevirtual   #309 <Method PackageManager Context.getPackageManager()>
	//    3    7:astore          10
		List list = packagemanager.queryIntentActivityOptions(componentname, aintent, intent, 0);
	//    4    9:aload           10
	//    5   11:aload           4
	//    6   13:aload           5
	//    7   15:aload           6
	//    8   17:iconst_0        
	//    9   18:invokevirtual   #315 <Method List PackageManager.queryIntentActivityOptions(ComponentName, Intent[], Intent, int)>
	//   10   21:astore          11
		int i1;
		if(list != null)
	//*  11   23:aload           11
	//*  12   25:ifnull          195
			i1 = list.size();
	//   13   28:aload           11
	//   14   30:invokeinterface #318 <Method int List.size()>
	//   15   35:istore          9
		else
	//*  16   37:iload           7
	//*  17   39:iconst_1        
	//*  18   40:iand            
	//*  19   41:ifne            49
	//*  20   44:aload_0         
	//*  21   45:iload_1         
	//*  22   46:invokevirtual   #322 <Method void removeGroup(int)>
	//*  23   49:iconst_0        
	//*  24   50:istore          7
	//*  25   52:iload           7
	//*  26   54:iload           9
	//*  27   56:icmpge          214
	//*  28   59:aload           11
	//*  29   61:iload           7
	//*  30   63:invokeinterface #323 <Method Object List.get(int)>
	//*  31   68:checkcast       #325 <Class ResolveInfo>
	//*  32   71:astore          12
	//*  33   73:aload           12
	//*  34   75:getfield        #328 <Field int ResolveInfo.specificIndex>
	//*  35   78:ifge            201
	//*  36   81:aload           6
	//*  37   83:astore          4
	//*  38   85:new             #330 <Class Intent>
	//*  39   88:dup             
	//*  40   89:aload           4
	//*  41   91:invokespecial   #333 <Method void Intent(Intent)>
	//*  42   94:astore          4
	//*  43   96:aload           4
	//*  44   98:new             #335 <Class ComponentName>
	//*  45  101:dup             
	//*  46  102:aload           12
	//*  47  104:getfield        #339 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  48  107:getfield        #345 <Field ApplicationInfo ActivityInfo.applicationInfo>
	//*  49  110:getfield        #350 <Field String ApplicationInfo.packageName>
	//*  50  113:aload           12
	//*  51  115:getfield        #339 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  52  118:getfield        #353 <Field String ActivityInfo.name>
	//*  53  121:invokespecial   #356 <Method void ComponentName(String, String)>
	//*  54  124:invokevirtual   #360 <Method Intent Intent.setComponent(ComponentName)>
	//*  55  127:pop             
	//*  56  128:aload_0         
	//*  57  129:iload_1         
	//*  58  130:iload_2         
	//*  59  131:iload_3         
	//*  60  132:aload           12
	//*  61  134:aload           10
	//*  62  136:invokevirtual   #364 <Method CharSequence ResolveInfo.loadLabel(PackageManager)>
	//*  63  139:invokevirtual   #366 <Method MenuItem add(int, int, int, CharSequence)>
	//*  64  142:aload           12
	//*  65  144:aload           10
	//*  66  146:invokevirtual   #370 <Method Drawable ResolveInfo.loadIcon(PackageManager)>
	//*  67  149:invokeinterface #376 <Method MenuItem MenuItem.setIcon(Drawable)>
	//*  68  154:aload           4
	//*  69  156:invokeinterface #380 <Method MenuItem MenuItem.setIntent(Intent)>
	//*  70  161:astore          4
	//*  71  163:aload           8
	//*  72  165:ifnull          186
	//*  73  168:aload           12
	//*  74  170:getfield        #328 <Field int ResolveInfo.specificIndex>
	//*  75  173:iflt            186
	//*  76  176:aload           8
	//*  77  178:aload           12
	//*  78  180:getfield        #328 <Field int ResolveInfo.specificIndex>
	//*  79  183:aload           4
	//*  80  185:aastore         
	//*  81  186:iload           7
	//*  82  188:iconst_1        
	//*  83  189:iadd            
	//*  84  190:istore          7
	//*  85  192:goto            52
			i1 = 0;
	//   86  195:iconst_0        
	//   87  196:istore          9
		if((l & 1) == 0)
			removeGroup(i);
		l = 0;
		while(l < i1) 
		{
			ResolveInfo resolveinfo = (ResolveInfo)list.get(l);
			if(resolveinfo.specificIndex < 0)
				componentname = ((ComponentName) (intent));
			else
	//*  88  198:goto            37
				componentname = ((ComponentName) (aintent[resolveinfo.specificIndex]));
	//   89  201:aload           5
	//   90  203:aload           12
	//   91  205:getfield        #328 <Field int ResolveInfo.specificIndex>
	//   92  208:aaload          
	//   93  209:astore          4
			componentname = ((ComponentName) (new Intent(((Intent) (componentname)))));
			((Intent) (componentname)).setComponent(new ComponentName(resolveinfo.activityInfo.applicationInfo.packageName, resolveinfo.activityInfo.name));
			componentname = ((ComponentName) (add(i, j, k, resolveinfo.loadLabel(packagemanager)).setIcon(resolveinfo.loadIcon(packagemanager)).setIntent(((Intent) (componentname)))));
			if(amenuitem != null && resolveinfo.specificIndex >= 0)
				amenuitem[resolveinfo.specificIndex] = ((MenuItem) (componentname));
			l++;
		}
	//*  94  211:goto            85
		return i1;
	//   95  214:iload           9
	//   96  216:ireturn         
	}

	protected MenuItem addInternal(int i, int j, int k, CharSequence charsequence)
	{
		int l = getOrdering(k);
	//    0    0:iload_3         
	//    1    1:invokestatic    #382 <Method int getOrdering(int)>
	//    2    4:istore          5
		charsequence = ((CharSequence) (createNewMenuItem(i, j, k, l, charsequence, mDefaultShowAsAction)));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iload_2         
	//    6    9:iload_3         
	//    7   10:iload           5
	//    8   12:aload           4
	//    9   14:aload_0         
	//   10   15:getfield        #84  <Field int mDefaultShowAsAction>
	//   11   18:invokespecial   #384 <Method MenuItemImpl createNewMenuItem(int, int, int, int, CharSequence, int)>
	//   12   21:astore          4
		if(mCurrentMenuInfo != null)
	//*  13   23:aload_0         
	//*  14   24:getfield        #386 <Field android.view.ContextMenu$ContextMenuInfo mCurrentMenuInfo>
	//*  15   27:ifnull          39
			((MenuItemImpl) (charsequence)).setMenuInfo(mCurrentMenuInfo);
	//   16   30:aload           4
	//   17   32:aload_0         
	//   18   33:getfield        #386 <Field android.view.ContextMenu$ContextMenuInfo mCurrentMenuInfo>
	//   19   36:invokevirtual   #390 <Method void MenuItemImpl.setMenuInfo(android.view.ContextMenu$ContextMenuInfo)>
		mItems.add(findInsertIndex(mItems, l), ((Object) (charsequence)));
	//   20   39:aload_0         
	//   21   40:getfield        #116 <Field ArrayList mItems>
	//   22   43:aload_0         
	//   23   44:getfield        #116 <Field ArrayList mItems>
	//   24   47:iload           5
	//   25   49:invokestatic    #392 <Method int findInsertIndex(ArrayList, int)>
	//   26   52:aload           4
	//   27   54:invokevirtual   #394 <Method void ArrayList.add(int, Object)>
		onItemsChanged(true);
	//   28   57:aload_0         
	//   29   58:iconst_1        
	//   30   59:invokevirtual   #246 <Method void onItemsChanged(boolean)>
		return ((MenuItem) (charsequence));
	//   31   62:aload           4
	//   32   64:areturn         
	}

	public void addMenuPresenter(MenuPresenter menupresenter)
	{
		addMenuPresenter(menupresenter, mContext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #106 <Field Context mContext>
	//    4    6:invokevirtual   #399 <Method void addMenuPresenter(MenuPresenter, Context)>
	//    5    9:return          
	}

	public void addMenuPresenter(MenuPresenter menupresenter, Context context)
	{
		mPresenters.add(((Object) (new WeakReference(((Object) (menupresenter))))));
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//    2    4:new             #160 <Class WeakReference>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #402 <Method void WeakReference(Object)>
	//    6   12:invokevirtual   #404 <Method boolean CopyOnWriteArrayList.add(Object)>
	//    7   15:pop             
		menupresenter.initForMenu(context, this);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:invokeinterface #408 <Method void MenuPresenter.initForMenu(Context, MenuBuilder)>
		mIsActionItemsStale = true;
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:putfield        #126 <Field boolean mIsActionItemsStale>
	//   15   29:return          
	}

	public SubMenu addSubMenu(int i)
	{
		return addSubMenu(0, 0, 0, ((CharSequence) (mResources.getString(i))));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:aload_0         
	//    5    5:getfield        #114 <Field Resources mResources>
	//    6    8:iload_1         
	//    7    9:invokevirtual   #297 <Method String Resources.getString(int)>
	//    8   12:invokevirtual   #413 <Method SubMenu addSubMenu(int, int, int, CharSequence)>
	//    9   15:areturn         
	}

	public SubMenu addSubMenu(int i, int j, int k, int l)
	{
		return addSubMenu(i, j, k, ((CharSequence) (mResources.getString(l))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload_0         
	//    5    5:getfield        #114 <Field Resources mResources>
	//    6    8:iload           4
	//    7   10:invokevirtual   #297 <Method String Resources.getString(int)>
	//    8   13:invokevirtual   #413 <Method SubMenu addSubMenu(int, int, int, CharSequence)>
	//    9   16:areturn         
	}

	public SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
	{
		charsequence = ((CharSequence) ((MenuItemImpl)addInternal(i, j, k, charsequence)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #301 <Method MenuItem addInternal(int, int, int, CharSequence)>
	//    6    9:checkcast       #134 <Class MenuItemImpl>
	//    7   12:astore          4
		SubMenuBuilder submenubuilder = new SubMenuBuilder(mContext, this, ((MenuItemImpl) (charsequence)));
	//    8   14:new             #416 <Class SubMenuBuilder>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:getfield        #106 <Field Context mContext>
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:invokespecial   #419 <Method void SubMenuBuilder(Context, MenuBuilder, MenuItemImpl)>
	//   15   28:astore          5
		((MenuItemImpl) (charsequence)).setSubMenu(submenubuilder);
	//   16   30:aload           4
	//   17   32:aload           5
	//   18   34:invokevirtual   #423 <Method void MenuItemImpl.setSubMenu(SubMenuBuilder)>
		return ((SubMenu) (submenubuilder));
	//   19   37:aload           5
	//   20   39:areturn         
	}

	public SubMenu addSubMenu(CharSequence charsequence)
	{
		return addSubMenu(0, 0, 0, charsequence);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:aload_1         
	//    5    5:invokevirtual   #413 <Method SubMenu addSubMenu(int, int, int, CharSequence)>
	//    6    8:areturn         
	}

	public void changeMenuMode()
	{
		if(mCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #427 <Field MenuBuilder$Callback mCallback>
	//*   2    4:ifnull          17
			mCallback.onMenuModeChange(this);
	//    3    7:aload_0         
	//    4    8:getfield        #427 <Field MenuBuilder$Callback mCallback>
	//    5   11:aload_0         
	//    6   12:invokeinterface #431 <Method void MenuBuilder$Callback.onMenuModeChange(MenuBuilder)>
	//    7   17:return          
	}

	public void clear()
	{
		if(mExpandedItem != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #434 <Field MenuItemImpl mExpandedItem>
	//*   2    4:ifnull          16
			collapseItemActionView(mExpandedItem);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #434 <Field MenuItemImpl mExpandedItem>
	//    6   12:invokevirtual   #438 <Method boolean collapseItemActionView(MenuItemImpl)>
	//    7   15:pop             
		mItems.clear();
	//    8   16:aload_0         
	//    9   17:getfield        #116 <Field ArrayList mItems>
	//   10   20:invokevirtual   #440 <Method void ArrayList.clear()>
		onItemsChanged(true);
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:invokevirtual   #246 <Method void onItemsChanged(boolean)>
	//   14   28:return          
	}

	public void clearAll()
	{
		mPreventDispatchingItemsChanged = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #86  <Field boolean mPreventDispatchingItemsChanged>
		clear();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #442 <Method void clear()>
		clearHeader();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #445 <Method void clearHeader()>
		mPreventDispatchingItemsChanged = false;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #86  <Field boolean mPreventDispatchingItemsChanged>
		mItemsChangedWhileDispatchPrevented = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #88  <Field boolean mItemsChangedWhileDispatchPrevented>
		mStructureChangedWhileDispatchPrevented = false;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #90  <Field boolean mStructureChangedWhileDispatchPrevented>
		onItemsChanged(true);
	//   16   28:aload_0         
	//   17   29:iconst_1        
	//   18   30:invokevirtual   #246 <Method void onItemsChanged(boolean)>
	//   19   33:return          
	}

	public void clearHeader()
	{
		mHeaderIcon = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #255 <Field Drawable mHeaderIcon>
		mHeaderTitle = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #253 <Field CharSequence mHeaderTitle>
		mHeaderView = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #251 <Field View mHeaderView>
		onItemsChanged(false);
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:invokevirtual   #246 <Method void onItemsChanged(boolean)>
	//   12   20:return          
	}

	public void close()
	{
		close(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #448 <Method void close(boolean)>
	//    3    5:return          
	}

	public final void close(boolean flag)
	{
		if(mIsClosing)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field boolean mIsClosing>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mIsClosing = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #94  <Field boolean mIsClosing>
		for(Iterator iterator = mPresenters.iterator(); iterator.hasNext();)
	//*   7   13:aload_0         
	//*   8   14:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//*   9   17:invokevirtual   #149 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  10   20:astore_2        
	//*  11   21:aload_2         
	//*  12   22:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//*  13   27:ifeq            78
		{
			WeakReference weakreference = (WeakReference)iterator.next();
	//   14   30:aload_2         
	//   15   31:invokeinterface #158 <Method Object Iterator.next()>
	//   16   36:checkcast       #160 <Class WeakReference>
	//   17   39:astore_3        
			MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
	//   18   40:aload_3         
	//   19   41:invokevirtual   #163 <Method Object WeakReference.get()>
	//   20   44:checkcast       #165 <Class MenuPresenter>
	//   21   47:astore          4
			if(menupresenter == null)
	//*  22   49:aload           4
	//*  23   51:ifnonnull       66
				mPresenters.remove(((Object) (weakreference)));
	//   24   54:aload_0         
	//   25   55:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   26   58:aload_3         
	//   27   59:invokevirtual   #169 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   28   62:pop             
			else
	//*  29   63:goto            21
				menupresenter.onCloseMenu(this, flag);
	//   30   66:aload           4
	//   31   68:aload_0         
	//   32   69:iload_1         
	//   33   70:invokeinterface #452 <Method void MenuPresenter.onCloseMenu(MenuBuilder, boolean)>
		}

	//*  34   75:goto            21
		mIsClosing = false;
	//   35   78:aload_0         
	//   36   79:iconst_0        
	//   37   80:putfield        #94  <Field boolean mIsClosing>
	//   38   83:return          
	}

	public boolean collapseItemActionView(MenuItemImpl menuitemimpl)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		boolean flag2 = flag;
	//    2    2:iload_2         
	//    3    3:istore_3        
		if(!mPresenters.isEmpty())
	//*   4    4:aload_0         
	//*   5    5:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//*   6    8:invokevirtual   #142 <Method boolean CopyOnWriteArrayList.isEmpty()>
	//*   7   11:ifne            24
			if(mExpandedItem != menuitemimpl)
	//*   8   14:aload_0         
	//*   9   15:getfield        #434 <Field MenuItemImpl mExpandedItem>
	//*  10   18:aload_1         
	//*  11   19:if_acmpeq       26
			{
				flag2 = flag;
	//   12   22:iload_2         
	//   13   23:istore_3        
			} else
	//*  14   24:iload_3         
	//*  15   25:ireturn         
			{
				stopDispatchingItemsChanged();
	//   16   26:aload_0         
	//   17   27:invokevirtual   #145 <Method void stopDispatchingItemsChanged()>
				Iterator iterator = mPresenters.iterator();
	//   18   30:aload_0         
	//   19   31:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   20   34:invokevirtual   #149 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   21   37:astore          4
				boolean flag1 = false;
	//   22   39:iconst_0        
	//   23   40:istore_2        
				do
				{
					if(!iterator.hasNext())
						break;
	//   24   41:aload           4
	//   25   43:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//   26   48:ifeq            126
					WeakReference weakreference = (WeakReference)iterator.next();
	//   27   51:aload           4
	//   28   53:invokeinterface #158 <Method Object Iterator.next()>
	//   29   58:checkcast       #160 <Class WeakReference>
	//   30   61:astore          5
					MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
	//   31   63:aload           5
	//   32   65:invokevirtual   #163 <Method Object WeakReference.get()>
	//   33   68:checkcast       #165 <Class MenuPresenter>
	//   34   71:astore          6
					if(menupresenter == null)
	//*  35   73:aload           6
	//*  36   75:ifnonnull       91
					{
						mPresenters.remove(((Object) (weakreference)));
	//   37   78:aload_0         
	//   38   79:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   39   82:aload           5
	//   40   84:invokevirtual   #169 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   41   87:pop             
						continue;
	//   42   88:goto            41
					}
					flag2 = menupresenter.collapseItemActionView(this, menuitemimpl);
	//   43   91:aload           6
	//   44   93:aload_0         
	//   45   94:aload_1         
	//   46   95:invokeinterface #455 <Method boolean MenuPresenter.collapseItemActionView(MenuBuilder, MenuItemImpl)>
	//   47  100:istore_3        
					flag1 = flag2;
	//   48  101:iload_3         
	//   49  102:istore_2        
					if(!flag2)
						continue;
	//   50  103:iload_3         
	//   51  104:ifeq            88
					flag1 = flag2;
	//   52  107:iload_3         
	//   53  108:istore_2        
					break;
				} while(true);
				startDispatchingItemsChanged();
	//   54  109:aload_0         
	//   55  110:invokevirtual   #175 <Method void startDispatchingItemsChanged()>
				flag2 = flag1;
	//   56  113:iload_2         
	//   57  114:istore_3        
				if(flag1)
	//*  58  115:iload_2         
	//*  59  116:ifeq            24
				{
					mExpandedItem = null;
	//   60  119:aload_0         
	//   61  120:aconst_null     
	//   62  121:putfield        #434 <Field MenuItemImpl mExpandedItem>
					return flag1;
	//   63  124:iload_2         
	//   64  125:ireturn         
				}
			}
		return flag2;
	//*  65  126:goto            109
	}

	boolean dispatchMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
	{
		return mCallback != null && mCallback.onMenuItemSelected(menubuilder, menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #427 <Field MenuBuilder$Callback mCallback>
	//    2    4:ifnull          23
	//    3    7:aload_0         
	//    4    8:getfield        #427 <Field MenuBuilder$Callback mCallback>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #460 <Method boolean MenuBuilder$Callback.onMenuItemSelected(MenuBuilder, MenuItem)>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public boolean expandItemActionView(MenuItemImpl menuitemimpl)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(!mPresenters.isEmpty())
	//*   2    2:aload_0         
	//*   3    3:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//*   4    6:invokevirtual   #142 <Method boolean CopyOnWriteArrayList.isEmpty()>
	//*   5    9:ifeq            14
	//*   6   12:iload_3         
	//*   7   13:ireturn         
		{
			stopDispatchingItemsChanged();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #145 <Method void stopDispatchingItemsChanged()>
			Iterator iterator = mPresenters.iterator();
	//   10   18:aload_0         
	//   11   19:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   12   22:invokevirtual   #149 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   13   25:astore          4
			boolean flag = false;
	//   14   27:iconst_0        
	//   15   28:istore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//   16   29:aload           4
	//   17   31:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//   18   36:ifeq            114
				WeakReference weakreference = (WeakReference)iterator.next();
	//   19   39:aload           4
	//   20   41:invokeinterface #158 <Method Object Iterator.next()>
	//   21   46:checkcast       #160 <Class WeakReference>
	//   22   49:astore          5
				MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
	//   23   51:aload           5
	//   24   53:invokevirtual   #163 <Method Object WeakReference.get()>
	//   25   56:checkcast       #165 <Class MenuPresenter>
	//   26   59:astore          6
				if(menupresenter == null)
	//*  27   61:aload           6
	//*  28   63:ifnonnull       79
				{
					mPresenters.remove(((Object) (weakreference)));
	//   29   66:aload_0         
	//   30   67:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   31   70:aload           5
	//   32   72:invokevirtual   #169 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   33   75:pop             
					continue;
	//   34   76:goto            29
				}
				flag1 = menupresenter.expandItemActionView(this, menuitemimpl);
	//   35   79:aload           6
	//   36   81:aload_0         
	//   37   82:aload_1         
	//   38   83:invokeinterface #463 <Method boolean MenuPresenter.expandItemActionView(MenuBuilder, MenuItemImpl)>
	//   39   88:istore_3        
				flag = flag1;
	//   40   89:iload_3         
	//   41   90:istore_2        
				if(!flag1)
					continue;
	//   42   91:iload_3         
	//   43   92:ifeq            76
				flag = flag1;
	//   44   95:iload_3         
	//   45   96:istore_2        
				break;
			} while(true);
			startDispatchingItemsChanged();
	//   46   97:aload_0         
	//   47   98:invokevirtual   #175 <Method void startDispatchingItemsChanged()>
			flag1 = flag;
	//   48  101:iload_2         
	//   49  102:istore_3        
			if(flag)
	//*  50  103:iload_2         
	//*  51  104:ifeq            12
			{
				mExpandedItem = menuitemimpl;
	//   52  107:aload_0         
	//   53  108:aload_1         
	//   54  109:putfield        #434 <Field MenuItemImpl mExpandedItem>
				return flag;
	//   55  112:iload_2         
	//   56  113:ireturn         
			}
		}
		return flag1;
	//*  57  114:goto            97
	}

	public int findGroupIndex(int i)
	{
		return findGroupIndex(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #467 <Method int findGroupIndex(int, int)>
	//    4    6:ireturn         
	}

	public int findGroupIndex(int i, int j)
	{
		int l = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #468 <Method int size()>
	//    2    4:istore          4
		int k = j;
	//    3    6:iload_2         
	//    4    7:istore_3        
		if(j < 0)
	//*   5    8:iload_2         
	//*   6    9:ifge            14
			k = 0;
	//    7   12:iconst_0        
	//    8   13:istore_3        
		for(; k < l; k++)
	//*   9   14:iload_3         
	//*  10   15:iload           4
	//*  11   17:icmpge          47
			if(((MenuItemImpl)mItems.get(k)).getGroupId() == i)
	//*  12   20:aload_0         
	//*  13   21:getfield        #116 <Field ArrayList mItems>
	//*  14   24:iload_3         
	//*  15   25:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//*  16   28:checkcast       #134 <Class MenuItemImpl>
	//*  17   31:invokevirtual   #471 <Method int MenuItemImpl.getGroupId()>
	//*  18   34:iload_1         
	//*  19   35:icmpne          40
				return k;
	//   20   38:iload_3         
	//   21   39:ireturn         

	//   22   40:iload_3         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_3        
	//*  26   44:goto            14
		return -1;
	//   27   47:iconst_m1       
	//   28   48:ireturn         
	}

	public MenuItem findItem(int i)
	{
		int j;
		int k;
		k = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #468 <Method int size()>
	//    2    4:istore_3        
		j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
_L6:
		if(j >= k) goto _L2; else goto _L1
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:icmpge          74
_L1:
		Object obj = ((Object) ((MenuItemImpl)mItems.get(j)));
	//    8   12:aload_0         
	//    9   13:getfield        #116 <Field ArrayList mItems>
	//   10   16:iload_2         
	//   11   17:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   12   20:checkcast       #134 <Class MenuItemImpl>
	//   13   23:astore          4
		if(((MenuItemImpl) (obj)).getItemId() != i) goto _L4; else goto _L3
	//   14   25:aload           4
	//   15   27:invokevirtual   #475 <Method int MenuItemImpl.getItemId()>
	//   16   30:iload_1         
	//   17   31:icmpne          37
_L3:
		return ((MenuItem) (obj));
	//   18   34:aload           4
	//   19   36:areturn         
_L4:
		MenuItem menuitem;
		if(!((MenuItemImpl) (obj)).hasSubMenu())
			continue; /* Loop/switch isn't completed */
	//   20   37:aload           4
	//   21   39:invokevirtual   #478 <Method boolean MenuItemImpl.hasSubMenu()>
	//   22   42:ifeq            67
		menuitem = ((MenuItemImpl) (obj)).getSubMenu().findItem(i);
	//   23   45:aload           4
	//   24   47:invokevirtual   #482 <Method SubMenu MenuItemImpl.getSubMenu()>
	//   25   50:iload_1         
	//   26   51:invokeinterface #486 <Method MenuItem SubMenu.findItem(int)>
	//   27   56:astore          5
		obj = ((Object) (menuitem));
	//   28   58:aload           5
	//   29   60:astore          4
		if(menuitem != null) goto _L3; else goto _L5
	//   30   62:aload           5
	//   31   64:ifnonnull       34
_L5:
		j++;
	//   32   67:iload_2         
	//   33   68:iconst_1        
	//   34   69:iadd            
	//   35   70:istore_2        
		  goto _L6
	//*  36   71:goto            7
_L2:
		return null;
	//   37   74:aconst_null     
	//   38   75:areturn         
	}

	public int findItemIndex(int i)
	{
		int k = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #468 <Method int size()>
	//    2    4:istore_3        
		for(int j = 0; j < k; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          39
			if(((MenuItemImpl)mItems.get(j)).getItemId() == i)
	//*   8   12:aload_0         
	//*   9   13:getfield        #116 <Field ArrayList mItems>
	//*  10   16:iload_2         
	//*  11   17:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//*  12   20:checkcast       #134 <Class MenuItemImpl>
	//*  13   23:invokevirtual   #475 <Method int MenuItemImpl.getItemId()>
	//*  14   26:iload_1         
	//*  15   27:icmpne          32
				return j;
	//   16   30:iload_2         
	//   17   31:ireturn         

	//   18   32:iload_2         
	//   19   33:iconst_1        
	//   20   34:iadd            
	//   21   35:istore_2        
	//*  22   36:goto            7
		return -1;
	//   23   39:iconst_m1       
	//   24   40:ireturn         
	}

	MenuItemImpl findItemWithShortcutForKey(int i, KeyEvent keyevent)
	{
		ArrayList arraylist;
		arraylist = mTempShortcutItemList;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field ArrayList mTempShortcutItemList>
	//    2    4:astore          9
		arraylist.clear();
	//    3    6:aload           9
	//    4    8:invokevirtual   #440 <Method void ArrayList.clear()>
		findItemsWithShortcutForKey(((List) (arraylist)), i, keyevent);
	//    5   11:aload_0         
	//    6   12:aload           9
	//    7   14:iload_1         
	//    8   15:aload_2         
	//    9   16:invokevirtual   #493 <Method void findItemsWithShortcutForKey(List, int, KeyEvent)>
		if(!arraylist.isEmpty()) goto _L2; else goto _L1
	//   10   19:aload           9
	//   11   21:invokevirtual   #494 <Method boolean ArrayList.isEmpty()>
	//   12   24:ifeq            31
_L1:
		keyevent = null;
	//   13   27:aconst_null     
	//   14   28:astore_2        
_L6:
		return ((MenuItemImpl) (keyevent));
	//   15   29:aload_2         
	//   16   30:areturn         
_L2:
		int j;
		int k;
		int l;
		boolean flag;
		android.view.KeyCharacterMap.KeyData keydata;
		k = keyevent.getMetaState();
	//   17   31:aload_2         
	//   18   32:invokevirtual   #499 <Method int KeyEvent.getMetaState()>
	//   19   35:istore          5
		keydata = new android.view.KeyCharacterMap.KeyData();
	//   20   37:new             #501 <Class android.view.KeyCharacterMap$KeyData>
	//   21   40:dup             
	//   22   41:invokespecial   #502 <Method void android.view.KeyCharacterMap$KeyData()>
	//   23   44:astore          10
		keyevent.getKeyData(keydata);
	//   24   46:aload_2         
	//   25   47:aload           10
	//   26   49:invokevirtual   #506 <Method boolean KeyEvent.getKeyData(android.view.KeyCharacterMap$KeyData)>
	//   27   52:pop             
		l = arraylist.size();
	//   28   53:aload           9
	//   29   55:invokevirtual   #223 <Method int ArrayList.size()>
	//   30   58:istore          6
		if(l == 1)
	//*  31   60:iload           6
	//*  32   62:iconst_1        
	//*  33   63:icmpne          76
			return (MenuItemImpl)arraylist.get(0);
	//   34   66:aload           9
	//   35   68:iconst_0        
	//   36   69:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   37   72:checkcast       #134 <Class MenuItemImpl>
	//   38   75:areturn         
		flag = isQwertyMode();
	//   39   76:aload_0         
	//   40   77:invokevirtual   #509 <Method boolean isQwertyMode()>
	//   41   80:istore          7
		j = 0;
	//   42   82:iconst_0        
	//   43   83:istore_3        
_L9:
		if(j >= l) goto _L4; else goto _L3
	//   44   84:iload_3         
	//   45   85:iload           6
	//   46   87:icmpge          195
_L3:
		MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(j);
	//   47   90:aload           9
	//   48   92:iload_3         
	//   49   93:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   50   96:checkcast       #134 <Class MenuItemImpl>
	//   51   99:astore          8
		char c;
		if(flag)
	//*  52  101:iload           7
	//*  53  103:ifeq            185
			c = menuitemimpl.getAlphabeticShortcut();
	//   54  106:aload           8
	//   55  108:invokevirtual   #513 <Method char MenuItemImpl.getAlphabeticShortcut()>
	//   56  111:istore          4
		else
	//*  57  113:iload           4
	//*  58  115:aload           10
	//*  59  117:getfield        #517 <Field char[] android.view.KeyCharacterMap$KeyData.meta>
	//*  60  120:iconst_0        
	//*  61  121:caload          
	//*  62  122:icmpne          135
	//*  63  125:aload           8
	//*  64  127:astore_2        
	//*  65  128:iload           5
	//*  66  130:iconst_2        
	//*  67  131:iand            
	//*  68  132:ifeq            29
	//*  69  135:iload           4
	//*  70  137:aload           10
	//*  71  139:getfield        #517 <Field char[] android.view.KeyCharacterMap$KeyData.meta>
	//*  72  142:iconst_2        
	//*  73  143:caload          
	//*  74  144:icmpne          157
	//*  75  147:aload           8
	//*  76  149:astore_2        
	//*  77  150:iload           5
	//*  78  152:iconst_2        
	//*  79  153:iand            
	//*  80  154:ifne            29
	//*  81  157:iload           7
	//*  82  159:ifeq            178
	//*  83  162:iload           4
	//*  84  164:bipush          8
	//*  85  166:icmpne          178
	//*  86  169:aload           8
	//*  87  171:astore_2        
	//*  88  172:iload_1         
	//*  89  173:bipush          67
	//*  90  175:icmpeq          29
	//*  91  178:iload_3         
	//*  92  179:iconst_1        
	//*  93  180:iadd            
	//*  94  181:istore_3        
	//*  95  182:goto            84
			c = menuitemimpl.getNumericShortcut();
	//   96  185:aload           8
	//   97  187:invokevirtual   #520 <Method char MenuItemImpl.getNumericShortcut()>
	//   98  190:istore          4
		if(c != keydata.meta[0])
			break; /* Loop/switch isn't completed */
		keyevent = ((KeyEvent) (menuitemimpl));
		if((k & 2) == 0) goto _L6; else goto _L5
_L5:
		if(c != keydata.meta[2])
			break; /* Loop/switch isn't completed */
		keyevent = ((KeyEvent) (menuitemimpl));
		if((k & 2) != 0) goto _L6; else goto _L7
_L7:
		if(!flag || c != '\b')
			continue; /* Loop/switch isn't completed */
		keyevent = ((KeyEvent) (menuitemimpl));
		if(i == 67) goto _L6; else goto _L8
_L8:
		j++;
		  goto _L9
	//*  99  192:goto            113
_L4:
		return null;
	//  100  195:aconst_null     
	//  101  196:areturn         
	}

	void findItemsWithShortcutForKey(List list, int i, KeyEvent keyevent)
	{
		boolean flag = isQwertyMode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #509 <Method boolean isQwertyMode()>
	//    2    4:istore          9
		int l = keyevent.getModifiers();
	//    3    6:aload_3         
	//    4    7:invokevirtual   #523 <Method int KeyEvent.getModifiers()>
	//    5   10:istore          7
		android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
	//    6   12:new             #501 <Class android.view.KeyCharacterMap$KeyData>
	//    7   15:dup             
	//    8   16:invokespecial   #502 <Method void android.view.KeyCharacterMap$KeyData()>
	//    9   19:astore          10
		if(keyevent.getKeyData(keydata) || i == 67)
	//*  10   21:aload_3         
	//*  11   22:aload           10
	//*  12   24:invokevirtual   #506 <Method boolean KeyEvent.getKeyData(android.view.KeyCharacterMap$KeyData)>
	//*  13   27:ifne            37
	//*  14   30:iload_2         
	//*  15   31:bipush          67
	//*  16   33:icmpeq          37
	//*  17   36:return          
		{
			int i1 = mItems.size();
	//   18   37:aload_0         
	//   19   38:getfield        #116 <Field ArrayList mItems>
	//   20   41:invokevirtual   #223 <Method int ArrayList.size()>
	//   21   44:istore          8
			int j = 0;
	//   22   46:iconst_0        
	//   23   47:istore          4
			while(j < i1) 
	//*  24   49:iload           4
	//*  25   51:iload           8
	//*  26   53:icmpge          36
			{
				MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(j);
	//   27   56:aload_0         
	//   28   57:getfield        #116 <Field ArrayList mItems>
	//   29   60:iload           4
	//   30   62:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   31   65:checkcast       #134 <Class MenuItemImpl>
	//   32   68:astore          11
				if(menuitemimpl.hasSubMenu())
	//*  33   70:aload           11
	//*  34   72:invokevirtual   #478 <Method boolean MenuItemImpl.hasSubMenu()>
	//*  35   75:ifeq            92
					((MenuBuilder)menuitemimpl.getSubMenu()).findItemsWithShortcutForKey(list, i, keyevent);
	//   36   78:aload           11
	//   37   80:invokevirtual   #482 <Method SubMenu MenuItemImpl.getSubMenu()>
	//   38   83:checkcast       #2   <Class MenuBuilder>
	//   39   86:aload_1         
	//   40   87:iload_2         
	//   41   88:aload_3         
	//   42   89:invokevirtual   #493 <Method void findItemsWithShortcutForKey(List, int, KeyEvent)>
				char c;
				int k;
				if(flag)
	//*  43   92:iload           9
	//*  44   94:ifeq            212
					c = menuitemimpl.getAlphabeticShortcut();
	//   45   97:aload           11
	//   46   99:invokevirtual   #513 <Method char MenuItemImpl.getAlphabeticShortcut()>
	//   47  102:istore          5
				else
	//*  48  104:iload           9
	//*  49  106:ifeq            222
	//*  50  109:aload           11
	//*  51  111:invokevirtual   #526 <Method int MenuItemImpl.getAlphabeticModifiers()>
	//*  52  114:istore          6
	//*  53  116:iload           7
	//*  54  118:ldc2            #527 <Int 0x1100f>
	//*  55  121:iand            
	//*  56  122:iload           6
	//*  57  124:ldc2            #527 <Int 0x1100f>
	//*  58  127:iand            
	//*  59  128:icmpne          232
	//*  60  131:iconst_1        
	//*  61  132:istore          6
	//*  62  134:iload           6
	//*  63  136:ifeq            203
	//*  64  139:iload           5
	//*  65  141:ifeq            203
	//*  66  144:iload           5
	//*  67  146:aload           10
	//*  68  148:getfield        #517 <Field char[] android.view.KeyCharacterMap$KeyData.meta>
	//*  69  151:iconst_0        
	//*  70  152:caload          
	//*  71  153:icmpeq          186
	//*  72  156:iload           5
	//*  73  158:aload           10
	//*  74  160:getfield        #517 <Field char[] android.view.KeyCharacterMap$KeyData.meta>
	//*  75  163:iconst_2        
	//*  76  164:caload          
	//*  77  165:icmpeq          186
	//*  78  168:iload           9
	//*  79  170:ifeq            203
	//*  80  173:iload           5
	//*  81  175:bipush          8
	//*  82  177:icmpne          203
	//*  83  180:iload_2         
	//*  84  181:bipush          67
	//*  85  183:icmpne          203
	//*  86  186:aload           11
	//*  87  188:invokevirtual   #530 <Method boolean MenuItemImpl.isEnabled()>
	//*  88  191:ifeq            203
	//*  89  194:aload_1         
	//*  90  195:aload           11
	//*  91  197:invokeinterface #531 <Method boolean List.add(Object)>
	//*  92  202:pop             
	//*  93  203:iload           4
	//*  94  205:iconst_1        
	//*  95  206:iadd            
	//*  96  207:istore          4
	//*  97  209:goto            49
					c = menuitemimpl.getNumericShortcut();
	//   98  212:aload           11
	//   99  214:invokevirtual   #520 <Method char MenuItemImpl.getNumericShortcut()>
	//  100  217:istore          5
				if(flag)
					k = menuitemimpl.getAlphabeticModifiers();
				else
	//* 101  219:goto            104
					k = menuitemimpl.getNumericModifiers();
	//  102  222:aload           11
	//  103  224:invokevirtual   #534 <Method int MenuItemImpl.getNumericModifiers()>
	//  104  227:istore          6
				if((l & 0x1100f) == (k & 0x1100f))
					k = 1;
				else
	//* 105  229:goto            116
					k = 0;
	//  106  232:iconst_0        
	//  107  233:istore          6
				if(k != 0 && c != 0 && (c == keydata.meta[0] || c == keydata.meta[2] || flag && c == '\b' && i == 67) && menuitemimpl.isEnabled())
					list.add(((Object) (menuitemimpl)));
				j++;
			}
		}
	//* 108  235:goto            134
	}

	public void flagActionItems()
	{
		ArrayList arraylist = getVisibleItems();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #540 <Method ArrayList getVisibleItems()>
	//    2    4:astore_3        
		if(!mIsActionItemsStale)
	//*   3    5:aload_0         
	//*   4    6:getfield        #126 <Field boolean mIsActionItemsStale>
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		Iterator iterator = mPresenters.iterator();
	//    7   13:aload_0         
	//    8   14:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//    9   17:invokevirtual   #149 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   10   20:astore          4
		boolean flag = false;
	//   11   22:iconst_0        
	//   12   23:istore_1        
		while(iterator.hasNext()) 
	//*  13   24:aload           4
	//*  14   26:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//*  15   31:ifeq            87
		{
			WeakReference weakreference = (WeakReference)iterator.next();
	//   16   34:aload           4
	//   17   36:invokeinterface #158 <Method Object Iterator.next()>
	//   18   41:checkcast       #160 <Class WeakReference>
	//   19   44:astore          5
			MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
	//   20   46:aload           5
	//   21   48:invokevirtual   #163 <Method Object WeakReference.get()>
	//   22   51:checkcast       #165 <Class MenuPresenter>
	//   23   54:astore          6
			if(menupresenter == null)
	//*  24   56:aload           6
	//*  25   58:ifnonnull       74
				mPresenters.remove(((Object) (weakreference)));
	//   26   61:aload_0         
	//   27   62:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   28   65:aload           5
	//   29   67:invokevirtual   #169 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   30   70:pop             
			else
	//*  31   71:goto            24
				flag = menupresenter.flagActionItems() | flag;
	//   32   74:aload           6
	//   33   76:invokeinterface #542 <Method boolean MenuPresenter.flagActionItems()>
	//   34   81:iload_1         
	//   35   82:ior             
	//   36   83:istore_1        
		}
	//*  37   84:goto            71
		if(flag)
	//*  38   87:iload_1         
	//*  39   88:ifeq            165
		{
			mActionItems.clear();
	//   40   91:aload_0         
	//   41   92:getfield        #122 <Field ArrayList mActionItems>
	//   42   95:invokevirtual   #440 <Method void ArrayList.clear()>
			mNonActionItems.clear();
	//   43   98:aload_0         
	//   44   99:getfield        #124 <Field ArrayList mNonActionItems>
	//   45  102:invokevirtual   #440 <Method void ArrayList.clear()>
			int j = arraylist.size();
	//   46  105:aload_3         
	//   47  106:invokevirtual   #223 <Method int ArrayList.size()>
	//   48  109:istore_2        
			int i = 0;
	//   49  110:iconst_0        
	//   50  111:istore_1        
			while(i < j) 
	//*  51  112:iload_1         
	//*  52  113:iload_2         
	//*  53  114:icmpge          191
			{
				MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(i);
	//   54  117:aload_3         
	//   55  118:iload_1         
	//   56  119:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   57  122:checkcast       #134 <Class MenuItemImpl>
	//   58  125:astore          4
				if(menuitemimpl.isActionButton())
	//*  59  127:aload           4
	//*  60  129:invokevirtual   #545 <Method boolean MenuItemImpl.isActionButton()>
	//*  61  132:ifeq            152
					mActionItems.add(((Object) (menuitemimpl)));
	//   62  135:aload_0         
	//   63  136:getfield        #122 <Field ArrayList mActionItems>
	//   64  139:aload           4
	//   65  141:invokevirtual   #546 <Method boolean ArrayList.add(Object)>
	//   66  144:pop             
				else
	//*  67  145:iload_1         
	//*  68  146:iconst_1        
	//*  69  147:iadd            
	//*  70  148:istore_1        
	//*  71  149:goto            112
					mNonActionItems.add(((Object) (menuitemimpl)));
	//   72  152:aload_0         
	//   73  153:getfield        #124 <Field ArrayList mNonActionItems>
	//   74  156:aload           4
	//   75  158:invokevirtual   #546 <Method boolean ArrayList.add(Object)>
	//   76  161:pop             
				i++;
			}
		} else
	//*  77  162:goto            145
		{
			mActionItems.clear();
	//   78  165:aload_0         
	//   79  166:getfield        #122 <Field ArrayList mActionItems>
	//   80  169:invokevirtual   #440 <Method void ArrayList.clear()>
			mNonActionItems.clear();
	//   81  172:aload_0         
	//   82  173:getfield        #124 <Field ArrayList mNonActionItems>
	//   83  176:invokevirtual   #440 <Method void ArrayList.clear()>
			mNonActionItems.addAll(((java.util.Collection) (getVisibleItems())));
	//   84  179:aload_0         
	//   85  180:getfield        #124 <Field ArrayList mNonActionItems>
	//   86  183:aload_0         
	//   87  184:invokevirtual   #540 <Method ArrayList getVisibleItems()>
	//   88  187:invokevirtual   #550 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   89  190:pop             
		}
		mIsActionItemsStale = false;
	//   90  191:aload_0         
	//   91  192:iconst_0        
	//   92  193:putfield        #126 <Field boolean mIsActionItemsStale>
	//   93  196:return          
	}

	public ArrayList getActionItems()
	{
		flagActionItems();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #553 <Method void flagActionItems()>
		return mActionItems;
	//    2    4:aload_0         
	//    3    5:getfield        #122 <Field ArrayList mActionItems>
	//    4    8:areturn         
	}

	protected String getActionViewStatesKey()
	{
		return "android:menu:actionviewstates";
	//    0    0:ldc1            #20  <String "android:menu:actionviewstates">
	//    1    2:areturn         
	}

	public Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Context mContext>
	//    2    4:areturn         
	}

	public MenuItemImpl getExpandedItem()
	{
		return mExpandedItem;
	//    0    0:aload_0         
	//    1    1:getfield        #434 <Field MenuItemImpl mExpandedItem>
	//    2    4:areturn         
	}

	public Drawable getHeaderIcon()
	{
		return mHeaderIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field Drawable mHeaderIcon>
	//    2    4:areturn         
	}

	public CharSequence getHeaderTitle()
	{
		return mHeaderTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field CharSequence mHeaderTitle>
	//    2    4:areturn         
	}

	public View getHeaderView()
	{
		return mHeaderView;
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field View mHeaderView>
	//    2    4:areturn         
	}

	public MenuItem getItem(int i)
	{
		return (MenuItem)mItems.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field ArrayList mItems>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #372 <Class MenuItem>
	//    5   11:areturn         
	}

	public ArrayList getNonActionItems()
	{
		flagActionItems();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #553 <Method void flagActionItems()>
		return mNonActionItems;
	//    2    4:aload_0         
	//    3    5:getfield        #124 <Field ArrayList mNonActionItems>
	//    4    8:areturn         
	}

	boolean getOptionalIconsVisible()
	{
		return mOptionalIconsVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field boolean mOptionalIconsVisible>
	//    2    4:ireturn         
	}

	Resources getResources()
	{
		return mResources;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field Resources mResources>
	//    2    4:areturn         
	}

	public MenuBuilder getRootMenu()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public ArrayList getVisibleItems()
	{
		if(!mIsVisibleItemsStale)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field boolean mIsVisibleItemsStale>
	//*   2    4:ifne            12
			return mVisibleItems;
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field ArrayList mVisibleItems>
	//    5   11:areturn         
		mVisibleItems.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #118 <Field ArrayList mVisibleItems>
	//    8   16:invokevirtual   #440 <Method void ArrayList.clear()>
		int j = mItems.size();
	//    9   19:aload_0         
	//   10   20:getfield        #116 <Field ArrayList mItems>
	//   11   23:invokevirtual   #223 <Method int ArrayList.size()>
	//   12   26:istore_2        
		for(int i = 0; i < j; i++)
	//*  13   27:iconst_0        
	//*  14   28:istore_1        
	//*  15   29:iload_1         
	//*  16   30:iload_2         
	//*  17   31:icmpge          69
		{
			MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(i);
	//   18   34:aload_0         
	//   19   35:getfield        #116 <Field ArrayList mItems>
	//   20   38:iload_1         
	//   21   39:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   22   42:checkcast       #134 <Class MenuItemImpl>
	//   23   45:astore_3        
			if(menuitemimpl.isVisible())
	//*  24   46:aload_3         
	//*  25   47:invokevirtual   #573 <Method boolean MenuItemImpl.isVisible()>
	//*  26   50:ifeq            62
				mVisibleItems.add(((Object) (menuitemimpl)));
	//   27   53:aload_0         
	//   28   54:getfield        #118 <Field ArrayList mVisibleItems>
	//   29   57:aload_3         
	//   30   58:invokevirtual   #546 <Method boolean ArrayList.add(Object)>
	//   31   61:pop             
		}

	//   32   62:iload_1         
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:istore_1        
	//*  36   66:goto            29
		mIsVisibleItemsStale = false;
	//   37   69:aload_0         
	//   38   70:iconst_0        
	//   39   71:putfield        #120 <Field boolean mIsVisibleItemsStale>
		mIsActionItemsStale = true;
	//   40   74:aload_0         
	//   41   75:iconst_1        
	//   42   76:putfield        #126 <Field boolean mIsActionItemsStale>
		return mVisibleItems;
	//   43   79:aload_0         
	//   44   80:getfield        #118 <Field ArrayList mVisibleItems>
	//   45   83:areturn         
	}

	public boolean hasVisibleItems()
	{
		if(mOverrideVisibleItems)
	//*   0    0:aload_0         
	//*   1    1:getfield        #577 <Field boolean mOverrideVisibleItems>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		int j = size();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #468 <Method int size()>
	//    7   13:istore_2        
		for(int i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          47
			if(((MenuItemImpl)mItems.get(i)).isVisible())
	//*  13   21:aload_0         
	//*  14   22:getfield        #116 <Field ArrayList mItems>
	//*  15   25:iload_1         
	//*  16   26:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//*  17   29:checkcast       #134 <Class MenuItemImpl>
	//*  18   32:invokevirtual   #573 <Method boolean MenuItemImpl.isVisible()>
	//*  19   35:ifeq            40
				return true;
	//   20   38:iconst_1        
	//   21   39:ireturn         

	//   22   40:iload_1         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_1        
	//*  26   44:goto            16
		return false;
	//   27   47:iconst_0        
	//   28   48:ireturn         
	}

	boolean isQwertyMode()
	{
		return mQwertyMode;
	//    0    0:aload_0         
	//    1    1:getfield        #579 <Field boolean mQwertyMode>
	//    2    4:ireturn         
	}

	public boolean isShortcutKey(int i, KeyEvent keyevent)
	{
		return findItemWithShortcutForKey(i, keyevent) != null;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #583 <Method MenuItemImpl findItemWithShortcutForKey(int, KeyEvent)>
	//    4    6:ifnull          11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean isShortcutsVisible()
	{
		return mShortcutsVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #291 <Field boolean mShortcutsVisible>
	//    2    4:ireturn         
	}

	void onItemActionRequestChanged(MenuItemImpl menuitemimpl)
	{
		mIsActionItemsStale = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #126 <Field boolean mIsActionItemsStale>
		onItemsChanged(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #246 <Method void onItemsChanged(boolean)>
	//    6   10:return          
	}

	void onItemVisibleChanged(MenuItemImpl menuitemimpl)
	{
		mIsVisibleItemsStale = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #120 <Field boolean mIsVisibleItemsStale>
		onItemsChanged(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #246 <Method void onItemsChanged(boolean)>
	//    6   10:return          
	}

	public void onItemsChanged(boolean flag)
	{
		if(!mPreventDispatchingItemsChanged)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field boolean mPreventDispatchingItemsChanged>
	//*   2    4:ifne            27
		{
			if(flag)
	//*   3    7:iload_1         
	//*   4    8:ifeq            21
			{
				mIsVisibleItemsStale = true;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #120 <Field boolean mIsVisibleItemsStale>
				mIsActionItemsStale = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #126 <Field boolean mIsActionItemsStale>
			}
			dispatchPresenterUpdate(flag);
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:invokespecial   #589 <Method void dispatchPresenterUpdate(boolean)>
		} else
	//*  14   26:return          
		{
			mItemsChangedWhileDispatchPrevented = true;
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:putfield        #88  <Field boolean mItemsChangedWhileDispatchPrevented>
			if(flag)
	//*  18   32:iload_1         
	//*  19   33:ifeq            26
			{
				mStructureChangedWhileDispatchPrevented = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #90  <Field boolean mStructureChangedWhileDispatchPrevented>
				return;
	//   23   41:return          
			}
		}
	}

	public boolean performIdentifierAction(int i, int j)
	{
		return performItemAction(findItem(i), j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #592 <Method MenuItem findItem(int)>
	//    4    6:iload_2         
	//    5    7:invokevirtual   #596 <Method boolean performItemAction(MenuItem, int)>
	//    6   10:ireturn         
	}

	public boolean performItemAction(MenuItem menuitem, int i)
	{
		return performItemAction(menuitem, ((MenuPresenter) (null)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iload_2         
	//    4    4:invokevirtual   #599 <Method boolean performItemAction(MenuItem, MenuPresenter, int)>
	//    5    7:ireturn         
	}

	public boolean performItemAction(MenuItem menuitem, MenuPresenter menupresenter, int i)
	{
		boolean flag1;
		boolean flag2;
		Object obj;
		flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		obj = ((Object) ((MenuItemImpl)menuitem));
	//    2    3:aload_1         
	//    3    4:checkcast       #134 <Class MenuItemImpl>
	//    4    7:astore          7
		flag1 = flag2;
	//    5    9:iload           6
	//    6   11:istore          5
		if(obj == null) goto _L2; else goto _L1
	//    7   13:aload           7
	//    8   15:ifnull          30
_L1:
		if(((MenuItemImpl) (obj)).isEnabled()) goto _L4; else goto _L3
	//    9   18:aload           7
	//   10   20:invokevirtual   #530 <Method boolean MenuItemImpl.isEnabled()>
	//   11   23:ifne            33
_L3:
		flag1 = flag2;
	//   12   26:iload           6
	//   13   28:istore          5
_L2:
		return flag1;
	//   14   30:iload           5
	//   15   32:ireturn         
_L4:
		boolean flag;
		flag1 = ((MenuItemImpl) (obj)).invoke();
	//   16   33:aload           7
	//   17   35:invokevirtual   #602 <Method boolean MenuItemImpl.invoke()>
	//   18   38:istore          5
		menuitem = ((MenuItem) (((MenuItemImpl) (obj)).getSupportActionProvider()));
	//   19   40:aload           7
	//   20   42:invokevirtual   #606 <Method ActionProvider MenuItemImpl.getSupportActionProvider()>
	//   21   45:astore_1        
		boolean flag3;
		if(menuitem != null && ((ActionProvider) (menuitem)).hasSubMenu())
	//*  22   46:aload_1         
	//*  23   47:ifnull          95
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #609 <Method boolean ActionProvider.hasSubMenu()>
	//*  26   54:ifeq            95
			flag = true;
	//   27   57:iconst_1        
	//   28   58:istore          4
		else
	//*  29   60:aload           7
	//*  30   62:invokevirtual   #612 <Method boolean MenuItemImpl.hasCollapsibleActionView()>
	//*  31   65:ifeq            101
	//*  32   68:aload           7
	//*  33   70:invokevirtual   #615 <Method boolean MenuItemImpl.expandActionView()>
	//*  34   73:iload           5
	//*  35   75:ior             
	//*  36   76:istore          6
	//*  37   78:iload           6
	//*  38   80:istore          5
	//*  39   82:iload           6
	//*  40   84:ifeq            30
	//*  41   87:aload_0         
	//*  42   88:iconst_1        
	//*  43   89:invokevirtual   #448 <Method void close(boolean)>
	//*  44   92:iload           6
	//*  45   94:ireturn         
			flag = false;
	//   46   95:iconst_0        
	//   47   96:istore          4
		if(!((MenuItemImpl) (obj)).hasCollapsibleActionView())
			break; /* Loop/switch isn't completed */
		flag3 = ((MenuItemImpl) (obj)).expandActionView() | flag1;
		flag1 = flag3;
		if(flag3)
		{
			close(true);
			return flag3;
		}
		if(true) goto _L2; else goto _L5
	//*  48   98:goto            60
_L5:
		if(((MenuItemImpl) (obj)).hasSubMenu() || flag)
	//*  49  101:aload           7
	//*  50  103:invokevirtual   #478 <Method boolean MenuItemImpl.hasSubMenu()>
	//*  51  106:ifne            114
	//*  52  109:iload           4
	//*  53  111:ifeq            202
		{
			if((i & 4) == 0)
	//*  54  114:iload_3         
	//*  55  115:iconst_4        
	//*  56  116:iand            
	//*  57  117:ifne            125
				close(false);
	//   58  120:aload_0         
	//   59  121:iconst_0        
	//   60  122:invokevirtual   #448 <Method void close(boolean)>
			if(!((MenuItemImpl) (obj)).hasSubMenu())
	//*  61  125:aload           7
	//*  62  127:invokevirtual   #478 <Method boolean MenuItemImpl.hasSubMenu()>
	//*  63  130:ifne            152
				((MenuItemImpl) (obj)).setSubMenu(new SubMenuBuilder(getContext(), this, ((MenuItemImpl) (obj))));
	//   64  133:aload           7
	//   65  135:new             #416 <Class SubMenuBuilder>
	//   66  138:dup             
	//   67  139:aload_0         
	//   68  140:invokevirtual   #265 <Method Context getContext()>
	//   69  143:aload_0         
	//   70  144:aload           7
	//   71  146:invokespecial   #419 <Method void SubMenuBuilder(Context, MenuBuilder, MenuItemImpl)>
	//   72  149:invokevirtual   #423 <Method void MenuItemImpl.setSubMenu(SubMenuBuilder)>
			obj = ((Object) ((SubMenuBuilder)((MenuItemImpl) (obj)).getSubMenu()));
	//   73  152:aload           7
	//   74  154:invokevirtual   #482 <Method SubMenu MenuItemImpl.getSubMenu()>
	//   75  157:checkcast       #416 <Class SubMenuBuilder>
	//   76  160:astore          7
			if(flag)
	//*  77  162:iload           4
	//*  78  164:ifeq            173
				((ActionProvider) (menuitem)).onPrepareSubMenu(((SubMenu) (obj)));
	//   79  167:aload_1         
	//   80  168:aload           7
	//   81  170:invokevirtual   #619 <Method void ActionProvider.onPrepareSubMenu(SubMenu)>
			boolean flag4 = dispatchSubMenuSelected(((SubMenuBuilder) (obj)), menupresenter) | flag1;
	//   82  173:aload_0         
	//   83  174:aload           7
	//   84  176:aload_2         
	//   85  177:invokespecial   #621 <Method boolean dispatchSubMenuSelected(SubMenuBuilder, MenuPresenter)>
	//   86  180:iload           5
	//   87  182:ior             
	//   88  183:istore          6
			flag1 = flag4;
	//   89  185:iload           6
	//   90  187:istore          5
			if(!flag4)
	//*  91  189:iload           6
	//*  92  191:ifne            30
			{
				close(true);
	//   93  194:aload_0         
	//   94  195:iconst_1        
	//   95  196:invokevirtual   #448 <Method void close(boolean)>
				return flag4;
	//   96  199:iload           6
	//   97  201:ireturn         
			}
		} else
		{
			if((i & 1) == 0)
	//*  98  202:iload_3         
	//*  99  203:iconst_1        
	//* 100  204:iand            
	//* 101  205:ifne            213
				close(true);
	//  102  208:aload_0         
	//  103  209:iconst_1        
	//  104  210:invokevirtual   #448 <Method void close(boolean)>
			return flag1;
	//  105  213:iload           5
	//  106  215:ireturn         
		}
		if(true) goto _L2; else goto _L6
_L6:
	}

	public boolean performShortcut(int i, KeyEvent keyevent, int j)
	{
		keyevent = ((KeyEvent) (findItemWithShortcutForKey(i, keyevent)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #583 <Method MenuItemImpl findItemWithShortcutForKey(int, KeyEvent)>
	//    4    6:astore_2        
		boolean flag = false;
	//    5    7:iconst_0        
	//    6    8:istore          4
		if(keyevent != null)
	//*   7   10:aload_2         
	//*   8   11:ifnull          22
			flag = performItemAction(((MenuItem) (keyevent)), j);
	//    9   14:aload_0         
	//   10   15:aload_2         
	//   11   16:iload_3         
	//   12   17:invokevirtual   #596 <Method boolean performItemAction(MenuItem, int)>
	//   13   20:istore          4
		if((j & 2) != 0)
	//*  14   22:iload_3         
	//*  15   23:iconst_2        
	//*  16   24:iand            
	//*  17   25:ifeq            33
			close(true);
	//   18   28:aload_0         
	//   19   29:iconst_1        
	//   20   30:invokevirtual   #448 <Method void close(boolean)>
		return flag;
	//   21   33:iload           4
	//   22   35:ireturn         
	}

	public void removeGroup(int i)
	{
		int k = findGroupIndex(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #625 <Method int findGroupIndex(int)>
	//    3    5:istore_3        
		if(k >= 0)
	//*   4    6:iload_3         
	//*   5    7:iflt            65
		{
			int l = mItems.size();
	//    6   10:aload_0         
	//    7   11:getfield        #116 <Field ArrayList mItems>
	//    8   14:invokevirtual   #223 <Method int ArrayList.size()>
	//    9   17:istore          4
			for(int j = 0; j < l - k && ((MenuItemImpl)mItems.get(k)).getGroupId() == i; j++)
	//*  10   19:iconst_0        
	//*  11   20:istore_2        
	//*  12   21:iload_2         
	//*  13   22:iload           4
	//*  14   24:iload_3         
	//*  15   25:isub            
	//*  16   26:icmpge          60
	//*  17   29:aload_0         
	//*  18   30:getfield        #116 <Field ArrayList mItems>
	//*  19   33:iload_3         
	//*  20   34:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//*  21   37:checkcast       #134 <Class MenuItemImpl>
	//*  22   40:invokevirtual   #471 <Method int MenuItemImpl.getGroupId()>
	//*  23   43:iload_1         
	//*  24   44:icmpne          60
				removeItemAtInt(k, false);
	//   25   47:aload_0         
	//   26   48:iload_3         
	//   27   49:iconst_0        
	//   28   50:invokespecial   #627 <Method void removeItemAtInt(int, boolean)>

	//   29   53:iload_2         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore_2        
	//*  33   57:goto            21
			onItemsChanged(true);
	//   34   60:aload_0         
	//   35   61:iconst_1        
	//   36   62:invokevirtual   #246 <Method void onItemsChanged(boolean)>
		}
	//   37   65:return          
	}

	public void removeItem(int i)
	{
		removeItemAtInt(findItemIndex(i), true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #630 <Method int findItemIndex(int)>
	//    4    6:iconst_1        
	//    5    7:invokespecial   #627 <Method void removeItemAtInt(int, boolean)>
	//    6   10:return          
	}

	public void removeItemAt(int i)
	{
		removeItemAtInt(i, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #627 <Method void removeItemAtInt(int, boolean)>
	//    4    6:return          
	}

	public void removeMenuPresenter(MenuPresenter menupresenter)
	{
		Iterator iterator = mPresenters.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//    2    4:invokevirtual   #149 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    8:aload_2         
	//    5    9:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            59
			WeakReference weakreference = (WeakReference)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #158 <Method Object Iterator.next()>
	//    9   23:checkcast       #160 <Class WeakReference>
	//   10   26:astore_3        
			MenuPresenter menupresenter1 = (MenuPresenter)weakreference.get();
	//   11   27:aload_3         
	//   12   28:invokevirtual   #163 <Method Object WeakReference.get()>
	//   13   31:checkcast       #165 <Class MenuPresenter>
	//   14   34:astore          4
			if(menupresenter1 == null || menupresenter1 == menupresenter)
	//*  15   36:aload           4
	//*  16   38:ifnull          47
	//*  17   41:aload           4
	//*  18   43:aload_1         
	//*  19   44:if_acmpne       8
				mPresenters.remove(((Object) (weakreference)));
	//   20   47:aload_0         
	//   21   48:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   22   51:aload_3         
	//   23   52:invokevirtual   #169 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   24   55:pop             
		} while(true);
	//   25   56:goto            8
	//   26   59:return          
	}

	public void restoreActionViewStates(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
	//*   2    4:return          
		{
			SparseArray sparsearray = bundle.getSparseParcelableArray(getActionViewStatesKey());
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #635 <Method String getActionViewStatesKey()>
	//    6   10:invokevirtual   #183 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//    7   13:astore          4
			int k = size();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #468 <Method int size()>
	//   10   19:istore_3        
			for(int i = 0; i < k; i++)
	//*  11   20:iconst_0        
	//*  12   21:istore_2        
	//*  13   22:iload_2         
	//*  14   23:iload_3         
	//*  15   24:icmpge          95
			{
				MenuItem menuitem = getItem(i);
	//   16   27:aload_0         
	//   17   28:iload_2         
	//   18   29:invokevirtual   #637 <Method MenuItem getItem(int)>
	//   19   32:astore          5
				View view = menuitem.getActionView();
	//   20   34:aload           5
	//   21   36:invokeinterface #640 <Method View MenuItem.getActionView()>
	//   22   41:astore          6
				if(view != null && view.getId() != -1)
	//*  23   43:aload           6
	//*  24   45:ifnull          64
	//*  25   48:aload           6
	//*  26   50:invokevirtual   #643 <Method int View.getId()>
	//*  27   53:iconst_m1       
	//*  28   54:icmpeq          64
					view.restoreHierarchyState(sparsearray);
	//   29   57:aload           6
	//   30   59:aload           4
	//   31   61:invokevirtual   #647 <Method void View.restoreHierarchyState(SparseArray)>
				if(menuitem.hasSubMenu())
	//*  32   64:aload           5
	//*  33   66:invokeinterface #648 <Method boolean MenuItem.hasSubMenu()>
	//*  34   71:ifeq            88
					((SubMenuBuilder)menuitem.getSubMenu()).restoreActionViewStates(bundle);
	//   35   74:aload           5
	//   36   76:invokeinterface #649 <Method SubMenu MenuItem.getSubMenu()>
	//   37   81:checkcast       #416 <Class SubMenuBuilder>
	//   38   84:aload_1         
	//   39   85:invokevirtual   #651 <Method void SubMenuBuilder.restoreActionViewStates(Bundle)>
			}

	//   40   88:iload_2         
	//   41   89:iconst_1        
	//   42   90:iadd            
	//   43   91:istore_2        
	//*  44   92:goto            22
			int j = bundle.getInt("android:menu:expandedactionview");
	//   45   95:aload_1         
	//   46   96:ldc1            #23  <String "android:menu:expandedactionview">
	//   47   98:invokevirtual   #655 <Method int Bundle.getInt(String)>
	//   48  101:istore_2        
			if(j > 0)
	//*  49  102:iload_2         
	//*  50  103:ifle            4
			{
				bundle = ((Bundle) (findItem(j)));
	//   51  106:aload_0         
	//   52  107:iload_2         
	//   53  108:invokevirtual   #592 <Method MenuItem findItem(int)>
	//   54  111:astore_1        
				if(bundle != null)
	//*  55  112:aload_1         
	//*  56  113:ifnull          4
				{
					((MenuItem) (bundle)).expandActionView();
	//   57  116:aload_1         
	//   58  117:invokeinterface #656 <Method boolean MenuItem.expandActionView()>
	//   59  122:pop             
					return;
	//   60  123:return          
				}
			}
		}
	}

	public void restorePresenterStates(Bundle bundle)
	{
		dispatchRestoreInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #659 <Method void dispatchRestoreInstanceState(Bundle)>
	//    3    5:return          
	}

	public void saveActionViewStates(Bundle bundle)
	{
		int j = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #468 <Method int size()>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		SparseArray sparsearray;
		SparseArray sparsearray2;
		for(sparsearray = null; i < j; sparsearray = sparsearray2)
	//*   5    7:aconst_null     
	//*   6    8:astore          4
	//*   7   10:iload_2         
	//*   8   11:iload_3         
	//*   9   12:icmpge          144
		{
			MenuItem menuitem = getItem(i);
	//   10   15:aload_0         
	//   11   16:iload_2         
	//   12   17:invokevirtual   #637 <Method MenuItem getItem(int)>
	//   13   20:astore          7
			View view = menuitem.getActionView();
	//   14   22:aload           7
	//   15   24:invokeinterface #640 <Method View MenuItem.getActionView()>
	//   16   29:astore          8
			sparsearray2 = sparsearray;
	//   17   31:aload           4
	//   18   33:astore          6
			if(view != null)
	//*  19   35:aload           8
	//*  20   37:ifnull          109
			{
				sparsearray2 = sparsearray;
	//   21   40:aload           4
	//   22   42:astore          6
				if(view.getId() != -1)
	//*  23   44:aload           8
	//*  24   46:invokevirtual   #643 <Method int View.getId()>
	//*  25   49:iconst_m1       
	//*  26   50:icmpeq          109
				{
					SparseArray sparsearray1 = sparsearray;
	//   27   53:aload           4
	//   28   55:astore          5
					if(sparsearray == null)
	//*  29   57:aload           4
	//*  30   59:ifnonnull       71
						sparsearray1 = new SparseArray();
	//   31   62:new             #189 <Class SparseArray>
	//   32   65:dup             
	//   33   66:invokespecial   #200 <Method void SparseArray()>
	//   34   69:astore          5
					view.saveHierarchyState(sparsearray1);
	//   35   71:aload           8
	//   36   73:aload           5
	//   37   75:invokevirtual   #663 <Method void View.saveHierarchyState(SparseArray)>
					sparsearray2 = sparsearray1;
	//   38   78:aload           5
	//   39   80:astore          6
					if(menuitem.isActionViewExpanded())
	//*  40   82:aload           7
	//*  41   84:invokeinterface #666 <Method boolean MenuItem.isActionViewExpanded()>
	//*  42   89:ifeq            109
					{
						bundle.putInt("android:menu:expandedactionview", menuitem.getItemId());
	//   43   92:aload_1         
	//   44   93:ldc1            #23  <String "android:menu:expandedactionview">
	//   45   95:aload           7
	//   46   97:invokeinterface #667 <Method int MenuItem.getItemId()>
	//   47  102:invokevirtual   #671 <Method void Bundle.putInt(String, int)>
						sparsearray2 = sparsearray1;
	//   48  105:aload           5
	//   49  107:astore          6
					}
				}
			}
			if(menuitem.hasSubMenu())
	//*  50  109:aload           7
	//*  51  111:invokeinterface #648 <Method boolean MenuItem.hasSubMenu()>
	//*  52  116:ifeq            133
				((SubMenuBuilder)menuitem.getSubMenu()).saveActionViewStates(bundle);
	//   53  119:aload           7
	//   54  121:invokeinterface #649 <Method SubMenu MenuItem.getSubMenu()>
	//   55  126:checkcast       #416 <Class SubMenuBuilder>
	//   56  129:aload_1         
	//   57  130:invokevirtual   #673 <Method void SubMenuBuilder.saveActionViewStates(Bundle)>
			i++;
	//   58  133:iload_2         
	//   59  134:iconst_1        
	//   60  135:iadd            
	//   61  136:istore_2        
		}

	//   62  137:aload           6
	//   63  139:astore          4
	//*  64  141:goto            10
		if(sparsearray != null)
	//*  65  144:aload           4
	//*  66  146:ifnull          159
			bundle.putSparseParcelableArray(getActionViewStatesKey(), sparsearray);
	//   67  149:aload_1         
	//   68  150:aload_0         
	//   69  151:invokevirtual   #635 <Method String getActionViewStatesKey()>
	//   70  154:aload           4
	//   71  156:invokevirtual   #212 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
	//   72  159:return          
	}

	public void savePresenterStates(Bundle bundle)
	{
		dispatchSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #676 <Method void dispatchSaveInstanceState(Bundle)>
	//    3    5:return          
	}

	public void setCallback(Callback callback)
	{
		mCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #427 <Field MenuBuilder$Callback mCallback>
	//    3    5:return          
	}

	public void setCurrentMenuInfo(android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
	{
		mCurrentMenuInfo = contextmenuinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #386 <Field android.view.ContextMenu$ContextMenuInfo mCurrentMenuInfo>
	//    3    5:return          
	}

	public MenuBuilder setDefaultShowAsAction(int i)
	{
		mDefaultShowAsAction = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #84  <Field int mDefaultShowAsAction>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	void setExclusiveItemChecked(MenuItem menuitem)
	{
		int j = menuitem.getGroupId();
	//    0    0:aload_1         
	//    1    1:invokeinterface #684 <Method int MenuItem.getGroupId()>
	//    2    6:istore_3        
		int k = mItems.size();
	//    3    7:aload_0         
	//    4    8:getfield        #116 <Field ArrayList mItems>
	//    5   11:invokevirtual   #223 <Method int ArrayList.size()>
	//    6   14:istore          4
		stopDispatchingItemsChanged();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #145 <Method void stopDispatchingItemsChanged()>
		int i = 0;
	//    9   20:iconst_0        
	//   10   21:istore_2        
		do
		{
			if(i >= k)
				break;
	//   11   22:iload_2         
	//   12   23:iload           4
	//   13   25:icmpge          98
			MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(i);
	//   14   28:aload_0         
	//   15   29:getfield        #116 <Field ArrayList mItems>
	//   16   32:iload_2         
	//   17   33:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   18   36:checkcast       #134 <Class MenuItemImpl>
	//   19   39:astore          6
			if(menuitemimpl.getGroupId() == j && menuitemimpl.isExclusiveCheckable() && menuitemimpl.isCheckable())
	//*  20   41:aload           6
	//*  21   43:invokevirtual   #471 <Method int MenuItemImpl.getGroupId()>
	//*  22   46:iload_3         
	//*  23   47:icmpne          58
	//*  24   50:aload           6
	//*  25   52:invokevirtual   #687 <Method boolean MenuItemImpl.isExclusiveCheckable()>
	//*  26   55:ifne            65
	//*  27   58:iload_2         
	//*  28   59:iconst_1        
	//*  29   60:iadd            
	//*  30   61:istore_2        
	//*  31   62:goto            22
	//*  32   65:aload           6
	//*  33   67:invokevirtual   #690 <Method boolean MenuItemImpl.isCheckable()>
	//*  34   70:ifeq            58
			{
				boolean flag;
				if(menuitemimpl == menuitem)
	//*  35   73:aload           6
	//*  36   75:aload_1         
	//*  37   76:if_acmpne       92
					flag = true;
	//   38   79:iconst_1        
	//   39   80:istore          5
				else
	//*  40   82:aload           6
	//*  41   84:iload           5
	//*  42   86:invokevirtual   #693 <Method void MenuItemImpl.setCheckedInt(boolean)>
	//*  43   89:goto            58
					flag = false;
	//   44   92:iconst_0        
	//   45   93:istore          5
				menuitemimpl.setCheckedInt(flag);
			}
			i++;
		} while(true);
	//*  46   95:goto            82
		startDispatchingItemsChanged();
	//   47   98:aload_0         
	//   48   99:invokevirtual   #175 <Method void startDispatchingItemsChanged()>
	//   49  102:return          
	}

	public void setGroupCheckable(int i, boolean flag, boolean flag1)
	{
		int k = mItems.size();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field ArrayList mItems>
	//    2    4:invokevirtual   #223 <Method int ArrayList.size()>
	//    3    7:istore          5
		for(int j = 0; j < k; j++)
	//*   4    9:iconst_0        
	//*   5   10:istore          4
	//*   6   12:iload           4
	//*   7   14:iload           5
	//*   8   16:icmpge          64
		{
			MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(j);
	//    9   19:aload_0         
	//   10   20:getfield        #116 <Field ArrayList mItems>
	//   11   23:iload           4
	//   12   25:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   13   28:checkcast       #134 <Class MenuItemImpl>
	//   14   31:astore          6
			if(menuitemimpl.getGroupId() == i)
	//*  15   33:aload           6
	//*  16   35:invokevirtual   #471 <Method int MenuItemImpl.getGroupId()>
	//*  17   38:iload_1         
	//*  18   39:icmpne          55
			{
				menuitemimpl.setExclusiveCheckable(flag1);
	//   19   42:aload           6
	//   20   44:iload_3         
	//   21   45:invokevirtual   #698 <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
				menuitemimpl.setCheckable(flag);
	//   22   48:aload           6
	//   23   50:iload_2         
	//   24   51:invokevirtual   #702 <Method MenuItem MenuItemImpl.setCheckable(boolean)>
	//   25   54:pop             
			}
		}

	//   26   55:iload           4
	//   27   57:iconst_1        
	//   28   58:iadd            
	//   29   59:istore          4
	//*  30   61:goto            12
	//   31   64:return          
	}

	public void setGroupEnabled(int i, boolean flag)
	{
		int k = mItems.size();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field ArrayList mItems>
	//    2    4:invokevirtual   #223 <Method int ArrayList.size()>
	//    3    7:istore          4
		for(int j = 0; j < k; j++)
	//*   4    9:iconst_0        
	//*   5   10:istore_3        
	//*   6   11:iload_3         
	//*   7   12:iload           4
	//*   8   14:icmpge          53
		{
			MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(j);
	//    9   17:aload_0         
	//   10   18:getfield        #116 <Field ArrayList mItems>
	//   11   21:iload_3         
	//   12   22:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #134 <Class MenuItemImpl>
	//   14   28:astore          5
			if(menuitemimpl.getGroupId() == i)
	//*  15   30:aload           5
	//*  16   32:invokevirtual   #471 <Method int MenuItemImpl.getGroupId()>
	//*  17   35:iload_1         
	//*  18   36:icmpne          46
				menuitemimpl.setEnabled(flag);
	//   19   39:aload           5
	//   20   41:iload_2         
	//   21   42:invokevirtual   #706 <Method MenuItem MenuItemImpl.setEnabled(boolean)>
	//   22   45:pop             
		}

	//   23   46:iload_3         
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:istore_3        
	//*  27   50:goto            11
	//   28   53:return          
	}

	public void setGroupVisible(int i, boolean flag)
	{
		int k = mItems.size();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field ArrayList mItems>
	//    2    4:invokevirtual   #223 <Method int ArrayList.size()>
	//    3    7:istore          5
		int j = 0;
	//    4    9:iconst_0        
	//    5   10:istore          4
		boolean flag1 = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		for(; j < k; j++)
	//*   8   14:iload           4
	//*   9   16:iload           5
	//*  10   18:icmpge          64
		{
			MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(j);
	//   11   21:aload_0         
	//   12   22:getfield        #116 <Field ArrayList mItems>
	//   13   25:iload           4
	//   14   27:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   15   30:checkcast       #134 <Class MenuItemImpl>
	//   16   33:astore          6
			if(menuitemimpl.getGroupId() == i && menuitemimpl.setVisibleInt(flag))
	//*  17   35:aload           6
	//*  18   37:invokevirtual   #471 <Method int MenuItemImpl.getGroupId()>
	//*  19   40:iload_1         
	//*  20   41:icmpne          74
	//*  21   44:aload           6
	//*  22   46:iload_2         
	//*  23   47:invokevirtual   #711 <Method boolean MenuItemImpl.setVisibleInt(boolean)>
	//*  24   50:ifeq            74
				flag1 = true;
	//   25   53:iconst_1        
	//   26   54:istore_3        
		}

	//   27   55:iload           4
	//   28   57:iconst_1        
	//   29   58:iadd            
	//   30   59:istore          4
	//*  31   61:goto            14
		if(flag1)
	//*  32   64:iload_3         
	//*  33   65:ifeq            73
			onItemsChanged(true);
	//   34   68:aload_0         
	//   35   69:iconst_1        
	//   36   70:invokevirtual   #246 <Method void onItemsChanged(boolean)>
	//   37   73:return          
	//*  38   74:goto            55
	}

	protected MenuBuilder setHeaderIconInt(int i)
	{
		setHeaderInternal(0, ((CharSequence) (null)), i, ((Drawable) (null)), ((View) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aconst_null     
	//    3    3:iload_1         
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #714 <Method void setHeaderInternal(int, CharSequence, int, Drawable, View)>
		return this;
	//    7    9:aload_0         
	//    8   10:areturn         
	}

	protected MenuBuilder setHeaderIconInt(Drawable drawable)
	{
		setHeaderInternal(0, ((CharSequence) (null)), 0, drawable, ((View) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:aload_1         
	//    5    5:aconst_null     
	//    6    6:invokespecial   #714 <Method void setHeaderInternal(int, CharSequence, int, Drawable, View)>
		return this;
	//    7    9:aload_0         
	//    8   10:areturn         
	}

	protected MenuBuilder setHeaderTitleInt(int i)
	{
		setHeaderInternal(i, ((CharSequence) (null)), 0, ((Drawable) (null)), ((View) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #714 <Method void setHeaderInternal(int, CharSequence, int, Drawable, View)>
		return this;
	//    7    9:aload_0         
	//    8   10:areturn         
	}

	protected MenuBuilder setHeaderTitleInt(CharSequence charsequence)
	{
		setHeaderInternal(0, charsequence, 0, ((Drawable) (null)), ((View) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:iconst_0        
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #714 <Method void setHeaderInternal(int, CharSequence, int, Drawable, View)>
		return this;
	//    7    9:aload_0         
	//    8   10:areturn         
	}

	protected MenuBuilder setHeaderViewInt(View view)
	{
		setHeaderInternal(0, ((CharSequence) (null)), 0, ((Drawable) (null)), view);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:aconst_null     
	//    5    5:aload_1         
	//    6    6:invokespecial   #714 <Method void setHeaderInternal(int, CharSequence, int, Drawable, View)>
		return this;
	//    7    9:aload_0         
	//    8   10:areturn         
	}

	public void setOptionalIconsVisible(boolean flag)
	{
		mOptionalIconsVisible = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #92  <Field boolean mOptionalIconsVisible>
	//    3    5:return          
	}

	public void setOverrideVisibleItems(boolean flag)
	{
		mOverrideVisibleItems = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #577 <Field boolean mOverrideVisibleItems>
	//    3    5:return          
	}

	public void setQwertyMode(boolean flag)
	{
		mQwertyMode = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #579 <Field boolean mQwertyMode>
		onItemsChanged(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #246 <Method void onItemsChanged(boolean)>
	//    6   10:return          
	}

	public void setShortcutsVisible(boolean flag)
	{
		if(mShortcutsVisible == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #291 <Field boolean mShortcutsVisible>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			setShortcutsVisibleInner(flag);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokespecial   #130 <Method void setShortcutsVisibleInner(boolean)>
			onItemsChanged(false);
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #246 <Method void onItemsChanged(boolean)>
			return;
	//   11   19:return          
		}
	}

	public int size()
	{
		return mItems.size();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field ArrayList mItems>
	//    2    4:invokevirtual   #223 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public void startDispatchingItemsChanged()
	{
		mPreventDispatchingItemsChanged = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #86  <Field boolean mPreventDispatchingItemsChanged>
		if(mItemsChangedWhileDispatchPrevented)
	//*   3    5:aload_0         
	//*   4    6:getfield        #88  <Field boolean mItemsChangedWhileDispatchPrevented>
	//*   5    9:ifeq            25
		{
			mItemsChangedWhileDispatchPrevented = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #88  <Field boolean mItemsChangedWhileDispatchPrevented>
			onItemsChanged(mStructureChangedWhileDispatchPrevented);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #90  <Field boolean mStructureChangedWhileDispatchPrevented>
	//   12   22:invokevirtual   #246 <Method void onItemsChanged(boolean)>
		}
	//   13   25:return          
	}

	public void stopDispatchingItemsChanged()
	{
		if(!mPreventDispatchingItemsChanged)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field boolean mPreventDispatchingItemsChanged>
	//*   2    4:ifne            22
		{
			mPreventDispatchingItemsChanged = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #86  <Field boolean mPreventDispatchingItemsChanged>
			mItemsChangedWhileDispatchPrevented = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #88  <Field boolean mItemsChangedWhileDispatchPrevented>
			mStructureChangedWhileDispatchPrevented = false;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #90  <Field boolean mStructureChangedWhileDispatchPrevented>
		}
	//   12   22:return          
	}

	private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
	private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
	private static final String PRESENTER_KEY = "android:menu:presenters";
	private static final String TAG = "MenuBuilder";
	private static final int sCategoryToOrder[] = {
		1, 4, 5, 3, 2, 0
	};
	private ArrayList mActionItems;
	private Callback mCallback;
	private final Context mContext;
	private android.view.ContextMenu.ContextMenuInfo mCurrentMenuInfo;
	private int mDefaultShowAsAction;
	private MenuItemImpl mExpandedItem;
	private SparseArray mFrozenViewStates;
	Drawable mHeaderIcon;
	CharSequence mHeaderTitle;
	View mHeaderView;
	private boolean mIsActionItemsStale;
	private boolean mIsClosing;
	private boolean mIsVisibleItemsStale;
	private ArrayList mItems;
	private boolean mItemsChangedWhileDispatchPrevented;
	private ArrayList mNonActionItems;
	private boolean mOptionalIconsVisible;
	private boolean mOverrideVisibleItems;
	private CopyOnWriteArrayList mPresenters;
	private boolean mPreventDispatchingItemsChanged;
	private boolean mQwertyMode;
	private final Resources mResources;
	private boolean mShortcutsVisible;
	private boolean mStructureChangedWhileDispatchPrevented;
	private ArrayList mTempShortcutItemList;
	private ArrayList mVisibleItems;

	static 
	{
	//    0    0:bipush          6
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_1        
	//    5    7:iastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:iconst_4        
	//    9   11:iastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:iconst_5        
	//   13   15:iastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:iconst_3        
	//   17   19:iastore         
	//   18   20:dup             
	//   19   21:iconst_4        
	//   20   22:iconst_2        
	//   21   23:iastore         
	//   22   24:dup             
	//   23   25:iconst_5        
	//   24   26:iconst_0        
	//   25   27:iastore         
	//   26   28:putstatic       #77  <Field int[] sCategoryToOrder>
	//*  27   31:return          
	}
}
