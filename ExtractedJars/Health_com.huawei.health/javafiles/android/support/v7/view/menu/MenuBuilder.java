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
	//*  29   65:goto            76
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
		if(bundle == null || mPresenters.isEmpty())
	//*   4    7:aload_1         
	//*   5    8:ifnull          21
	//*   6   11:aload_0         
	//*   7   12:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//*   8   15:invokevirtual   #142 <Method boolean CopyOnWriteArrayList.isEmpty()>
	//*   9   18:ifeq            22
			return;
	//   10   21:return          
		Iterator iterator = mPresenters.iterator();
	//   11   22:aload_0         
	//   12   23:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   13   26:invokevirtual   #149 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   14   29:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   15   30:aload_3         
	//   16   31:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//   17   36:ifeq            117
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
	//*  33   75:goto            114
			{
				int i = menupresenter.getId();
	//   34   78:aload           4
	//   35   80:invokeinterface #187 <Method int MenuPresenter.getId()>
	//   36   85:istore_2        
				if(i > 0)
	//*  37   86:iload_2         
	//*  38   87:ifle            114
				{
					Parcelable parcelable = (Parcelable)((SparseArray) (bundle)).get(i);
	//   39   90:aload_1         
	//   40   91:iload_2         
	//   41   92:invokevirtual   #192 <Method Object SparseArray.get(int)>
	//   42   95:checkcast       #194 <Class Parcelable>
	//   43   98:astore          5
					if(parcelable != null)
	//*  44  100:aload           5
	//*  45  102:ifnull          114
						menupresenter.onRestoreInstanceState(parcelable);
	//   46  105:aload           4
	//   47  107:aload           5
	//   48  109:invokeinterface #198 <Method void MenuPresenter.onRestoreInstanceState(Parcelable)>
				}
			}
		} while(true);
	//   49  114:goto            30
	//   50  117:return          
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
	//*  31   75:goto            111
			{
				int i = menupresenter.getId();
	//   32   78:aload           6
	//   33   80:invokeinterface #187 <Method int MenuPresenter.getId()>
	//   34   85:istore_2        
				if(i > 0)
	//*  35   86:iload_2         
	//*  36   87:ifle            111
				{
					Parcelable parcelable = menupresenter.onSaveInstanceState();
	//   37   90:aload           6
	//   38   92:invokeinterface #204 <Method Parcelable MenuPresenter.onSaveInstanceState()>
	//   39   97:astore          5
					if(parcelable != null)
	//*  40   99:aload           5
	//*  41  101:ifnull          111
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
		if(mPresenters.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//*   2    4:invokevirtual   #142 <Method boolean CopyOnWriteArrayList.isEmpty()>
	//*   3    7:ifeq            12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		boolean flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		if(menupresenter != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          26
			flag = menupresenter.onSubMenuSelected(submenubuilder);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokeinterface #218 <Method boolean MenuPresenter.onSubMenuSelected(SubMenuBuilder)>
	//   13   25:istore_3        
		boolean flag1;
		for(menupresenter = ((MenuPresenter) (mPresenters.iterator())); ((Iterator) (menupresenter)).hasNext(); flag = flag1)
	//*  14   26:aload_0         
	//*  15   27:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//*  16   30:invokevirtual   #149 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  17   33:astore_2        
	//*  18   34:aload_2         
	//*  19   35:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//*  20   40:ifeq            108
		{
			WeakReference weakreference = (WeakReference)((Iterator) (menupresenter)).next();
	//   21   43:aload_2         
	//   22   44:invokeinterface #158 <Method Object Iterator.next()>
	//   23   49:checkcast       #160 <Class WeakReference>
	//   24   52:astore          5
			MenuPresenter menupresenter1 = (MenuPresenter)weakreference.get();
	//   25   54:aload           5
	//   26   56:invokevirtual   #163 <Method Object WeakReference.get()>
	//   27   59:checkcast       #165 <Class MenuPresenter>
	//   28   62:astore          6
			if(menupresenter1 == null)
	//*  29   64:aload           6
	//*  30   66:ifnonnull       85
			{
				mPresenters.remove(((Object) (weakreference)));
	//   31   69:aload_0         
	//   32   70:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   33   73:aload           5
	//   34   75:invokevirtual   #169 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   35   78:pop             
				flag1 = flag;
	//   36   79:iload_3         
	//   37   80:istore          4
				continue;
	//   38   82:goto            102
			}
			flag1 = flag;
	//   39   85:iload_3         
	//   40   86:istore          4
			if(!flag)
	//*  41   88:iload_3         
	//*  42   89:ifne            102
				flag1 = menupresenter1.onSubMenuSelected(submenubuilder);
	//   43   92:aload           6
	//   44   94:aload_1         
	//   45   95:invokeinterface #218 <Method boolean MenuPresenter.onSubMenuSelected(SubMenuBuilder)>
	//   46  100:istore          4
		}

	//   47  102:iload           4
	//   48  104:istore_3        
	//*  49  105:goto            34
		return flag;
	//   50  108:iload_3         
	//   51  109:ireturn         
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
		if(i < 0 || i >= mItems.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            15
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #116 <Field ArrayList mItems>
	//*   5    9:invokevirtual   #223 <Method int ArrayList.size()>
	//*   6   12:icmplt          16
			return;
	//    7   15:return          
		mItems.remove(i);
	//    8   16:aload_0         
	//    9   17:getfield        #116 <Field ArrayList mItems>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #243 <Method Object ArrayList.remove(int)>
	//   12   24:pop             
		if(flag)
	//*  13   25:iload_2         
	//*  14   26:ifeq            34
			onItemsChanged(true);
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:invokevirtual   #246 <Method void onItemsChanged(boolean)>
	//   18   34:return          
	}

	private void setHeaderInternal(int i, CharSequence charsequence, int j, Drawable drawable, View view)
	{
		Resources resources = getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #249 <Method Resources getResources()>
	//    2    4:astore          6
		if(view != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          30
		{
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
		} else
	//*  14   27:goto            91
		{
			if(i > 0)
	//*  15   30:iload_1         
	//*  16   31:ifle            47
				mHeaderTitle = resources.getText(i);
	//   17   34:aload_0         
	//   18   35:aload           6
	//   19   37:iload_1         
	//   20   38:invokevirtual   #261 <Method CharSequence Resources.getText(int)>
	//   21   41:putfield        #253 <Field CharSequence mHeaderTitle>
			else
	//*  22   44:goto            56
			if(charsequence != null)
	//*  23   47:aload_2         
	//*  24   48:ifnull          56
				mHeaderTitle = charsequence;
	//   25   51:aload_0         
	//   26   52:aload_2         
	//   27   53:putfield        #253 <Field CharSequence mHeaderTitle>
			if(j > 0)
	//*  28   56:iload_3         
	//*  29   57:ifle            75
				mHeaderIcon = ContextCompat.getDrawable(getContext(), j);
	//   30   60:aload_0         
	//   31   61:aload_0         
	//   32   62:invokevirtual   #265 <Method Context getContext()>
	//   33   65:iload_3         
	//   34   66:invokestatic    #271 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//   35   69:putfield        #255 <Field Drawable mHeaderIcon>
			else
	//*  36   72:goto            86
			if(drawable != null)
	//*  37   75:aload           4
	//*  38   77:ifnull          86
				mHeaderIcon = drawable;
	//   39   80:aload_0         
	//   40   81:aload           4
	//   41   83:putfield        #255 <Field Drawable mHeaderIcon>
			mHeaderView = null;
	//   42   86:aload_0         
	//   43   87:aconst_null     
	//   44   88:putfield        #251 <Field View mHeaderView>
		}
		onItemsChanged(false);
	//   45   91:aload_0         
	//   46   92:iconst_0        
	//   47   93:invokevirtual   #246 <Method void onItemsChanged(boolean)>
	//   48   96:return          
	}

	private void setShortcutsVisibleInner(boolean flag)
	{
		if(flag && mResources.getConfiguration().keyboard != 1 && mResources.getBoolean(android.support.v7.appcompat.R.bool.abc_config_showMenuShortcutsWhenKeyboardPresent))
	//*   0    0:iload_1         
	//*   1    1:ifeq            36
	//*   2    4:aload_0         
	//*   3    5:getfield        #114 <Field Resources mResources>
	//*   4    8:invokevirtual   #275 <Method Configuration Resources.getConfiguration()>
	//*   5   11:getfield        #280 <Field int Configuration.keyboard>
	//*   6   14:iconst_1        
	//*   7   15:icmpeq          36
	//*   8   18:aload_0         
	//*   9   19:getfield        #114 <Field Resources mResources>
	//*  10   22:getstatic       #285 <Field int android.support.v7.appcompat.R$bool.abc_config_showMenuShortcutsWhenKeyboardPresent>
	//*  11   25:invokevirtual   #289 <Method boolean Resources.getBoolean(int)>
	//*  12   28:ifeq            36
			flag = true;
	//   13   31:iconst_1        
	//   14   32:istore_1        
		else
	//*  15   33:goto            38
			flag = false;
	//   16   36:iconst_0        
	//   17   37:istore_1        
		mShortcutsVisible = flag;
	//   18   38:aload_0         
	//   19   39:iload_1         
	//   20   40:putfield        #291 <Field boolean mShortcutsVisible>
	//   21   43:return          
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
	//*  12   25:ifnull          40
			i1 = list.size();
	//   13   28:aload           11
	//   14   30:invokeinterface #318 <Method int List.size()>
	//   15   35:istore          9
		else
	//*  16   37:goto            43
			i1 = 0;
	//   17   40:iconst_0        
	//   18   41:istore          9
		if((l & 1) == 0)
	//*  19   43:iload           7
	//*  20   45:iconst_1        
	//*  21   46:iand            
	//*  22   47:ifne            55
			removeGroup(i);
	//   23   50:aload_0         
	//   24   51:iload_1         
	//   25   52:invokevirtual   #322 <Method void removeGroup(int)>
		for(l = 0; l < i1; l++)
	//*  26   55:iconst_0        
	//*  27   56:istore          7
	//*  28   58:iload           7
	//*  29   60:iload           9
	//*  30   62:icmpge          214
		{
			ResolveInfo resolveinfo = (ResolveInfo)list.get(l);
	//   31   65:aload           11
	//   32   67:iload           7
	//   33   69:invokeinterface #323 <Method Object List.get(int)>
	//   34   74:checkcast       #325 <Class ResolveInfo>
	//   35   77:astore          12
			if(resolveinfo.specificIndex < 0)
	//*  36   79:aload           12
	//*  37   81:getfield        #328 <Field int ResolveInfo.specificIndex>
	//*  38   84:ifge            94
				componentname = ((ComponentName) (intent));
	//   39   87:aload           6
	//   40   89:astore          4
			else
	//*  41   91:goto            104
				componentname = ((ComponentName) (aintent[resolveinfo.specificIndex]));
	//   42   94:aload           5
	//   43   96:aload           12
	//   44   98:getfield        #328 <Field int ResolveInfo.specificIndex>
	//   45  101:aaload          
	//   46  102:astore          4
			componentname = ((ComponentName) (new Intent(((Intent) (componentname)))));
	//   47  104:new             #330 <Class Intent>
	//   48  107:dup             
	//   49  108:aload           4
	//   50  110:invokespecial   #333 <Method void Intent(Intent)>
	//   51  113:astore          4
			((Intent) (componentname)).setComponent(new ComponentName(resolveinfo.activityInfo.applicationInfo.packageName, resolveinfo.activityInfo.name));
	//   52  115:aload           4
	//   53  117:new             #335 <Class ComponentName>
	//   54  120:dup             
	//   55  121:aload           12
	//   56  123:getfield        #339 <Field ActivityInfo ResolveInfo.activityInfo>
	//   57  126:getfield        #345 <Field ApplicationInfo ActivityInfo.applicationInfo>
	//   58  129:getfield        #350 <Field String ApplicationInfo.packageName>
	//   59  132:aload           12
	//   60  134:getfield        #339 <Field ActivityInfo ResolveInfo.activityInfo>
	//   61  137:getfield        #353 <Field String ActivityInfo.name>
	//   62  140:invokespecial   #356 <Method void ComponentName(String, String)>
	//   63  143:invokevirtual   #360 <Method Intent Intent.setComponent(ComponentName)>
	//   64  146:pop             
			componentname = ((ComponentName) (add(i, j, k, resolveinfo.loadLabel(packagemanager)).setIcon(resolveinfo.loadIcon(packagemanager)).setIntent(((Intent) (componentname)))));
	//   65  147:aload_0         
	//   66  148:iload_1         
	//   67  149:iload_2         
	//   68  150:iload_3         
	//   69  151:aload           12
	//   70  153:aload           10
	//   71  155:invokevirtual   #364 <Method CharSequence ResolveInfo.loadLabel(PackageManager)>
	//   72  158:invokevirtual   #366 <Method MenuItem add(int, int, int, CharSequence)>
	//   73  161:aload           12
	//   74  163:aload           10
	//   75  165:invokevirtual   #370 <Method Drawable ResolveInfo.loadIcon(PackageManager)>
	//   76  168:invokeinterface #376 <Method MenuItem MenuItem.setIcon(Drawable)>
	//   77  173:aload           4
	//   78  175:invokeinterface #380 <Method MenuItem MenuItem.setIntent(Intent)>
	//   79  180:astore          4
			if(amenuitem != null && resolveinfo.specificIndex >= 0)
	//*  80  182:aload           8
	//*  81  184:ifnull          205
	//*  82  187:aload           12
	//*  83  189:getfield        #328 <Field int ResolveInfo.specificIndex>
	//*  84  192:iflt            205
				amenuitem[resolveinfo.specificIndex] = ((MenuItem) (componentname));
	//   85  195:aload           8
	//   86  197:aload           12
	//   87  199:getfield        #328 <Field int ResolveInfo.specificIndex>
	//   88  202:aload           4
	//   89  204:aastore         
		}

	//   90  205:iload           7
	//   91  207:iconst_1        
	//   92  208:iadd            
	//   93  209:istore          7
	//*  94  211:goto            58
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
	//*  29   63:goto            75
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
		if(mPresenters.isEmpty() || mExpandedItem != menuitemimpl)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//*   2    4:invokevirtual   #142 <Method boolean CopyOnWriteArrayList.isEmpty()>
	//*   3    7:ifne            18
	//*   4   10:aload_0         
	//*   5   11:getfield        #434 <Field MenuItemImpl mExpandedItem>
	//*   6   14:aload_1         
	//*   7   15:if_acmpeq       20
			return false;
	//    8   18:iconst_0        
	//    9   19:ireturn         
		boolean flag = false;
	//   10   20:iconst_0        
	//   11   21:istore_2        
		stopDispatchingItemsChanged();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #145 <Method void stopDispatchingItemsChanged()>
		Iterator iterator = mPresenters.iterator();
	//   14   26:aload_0         
	//   15   27:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   16   30:invokevirtual   #149 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   17   33:astore          5
		boolean flag1;
		do
		{
			flag1 = flag;
	//   18   35:iload_2         
	//   19   36:istore_3        
			if(!iterator.hasNext())
				break;
	//   20   37:aload           5
	//   21   39:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            120
			WeakReference weakreference = (WeakReference)iterator.next();
	//   23   47:aload           5
	//   24   49:invokeinterface #158 <Method Object Iterator.next()>
	//   25   54:checkcast       #160 <Class WeakReference>
	//   26   57:astore          6
			MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
	//   27   59:aload           6
	//   28   61:invokevirtual   #163 <Method Object WeakReference.get()>
	//   29   64:checkcast       #165 <Class MenuPresenter>
	//   30   67:astore          7
			if(menupresenter == null)
	//*  31   69:aload           7
	//*  32   71:ifnonnull       89
			{
				mPresenters.remove(((Object) (weakreference)));
	//   33   74:aload_0         
	//   34   75:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   35   78:aload           6
	//   36   80:invokevirtual   #169 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   37   83:pop             
				flag1 = flag;
	//   38   84:iload_2         
	//   39   85:istore_3        
			} else
	//*  40   86:goto            115
			{
				boolean flag2 = menupresenter.collapseItemActionView(this, menuitemimpl);
	//   41   89:aload           7
	//   42   91:aload_0         
	//   43   92:aload_1         
	//   44   93:invokeinterface #455 <Method boolean MenuPresenter.collapseItemActionView(MenuBuilder, MenuItemImpl)>
	//   45   98:istore          4
				flag = flag2;
	//   46  100:iload           4
	//   47  102:istore_2        
				flag1 = flag;
	//   48  103:iload_2         
	//   49  104:istore_3        
				if(flag2)
	//*  50  105:iload           4
	//*  51  107:ifeq            115
				{
					flag1 = flag;
	//   52  110:iload_2         
	//   53  111:istore_3        
					break;
	//   54  112:goto            120
				}
			}
			flag = flag1;
	//   55  115:iload_3         
	//   56  116:istore_2        
		} while(true);
	//   57  117:goto            35
		startDispatchingItemsChanged();
	//   58  120:aload_0         
	//   59  121:invokevirtual   #175 <Method void startDispatchingItemsChanged()>
		if(flag1)
	//*  60  124:iload_3         
	//*  61  125:ifeq            133
			mExpandedItem = null;
	//   62  128:aload_0         
	//   63  129:aconst_null     
	//   64  130:putfield        #434 <Field MenuItemImpl mExpandedItem>
		return flag1;
	//   65  133:iload_3         
	//   66  134:ireturn         
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
		if(mPresenters.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//*   2    4:invokevirtual   #142 <Method boolean CopyOnWriteArrayList.isEmpty()>
	//*   3    7:ifeq            12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		boolean flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		stopDispatchingItemsChanged();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #145 <Method void stopDispatchingItemsChanged()>
		Iterator iterator = mPresenters.iterator();
	//   10   18:aload_0         
	//   11   19:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   12   22:invokevirtual   #149 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   13   25:astore          5
		boolean flag1;
		do
		{
			flag1 = flag;
	//   14   27:iload_2         
	//   15   28:istore_3        
			if(!iterator.hasNext())
				break;
	//   16   29:aload           5
	//   17   31:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//   18   36:ifeq            112
			WeakReference weakreference = (WeakReference)iterator.next();
	//   19   39:aload           5
	//   20   41:invokeinterface #158 <Method Object Iterator.next()>
	//   21   46:checkcast       #160 <Class WeakReference>
	//   22   49:astore          6
			MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
	//   23   51:aload           6
	//   24   53:invokevirtual   #163 <Method Object WeakReference.get()>
	//   25   56:checkcast       #165 <Class MenuPresenter>
	//   26   59:astore          7
			if(menupresenter == null)
	//*  27   61:aload           7
	//*  28   63:ifnonnull       81
			{
				mPresenters.remove(((Object) (weakreference)));
	//   29   66:aload_0         
	//   30   67:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//   31   70:aload           6
	//   32   72:invokevirtual   #169 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   33   75:pop             
				flag1 = flag;
	//   34   76:iload_2         
	//   35   77:istore_3        
			} else
	//*  36   78:goto            107
			{
				boolean flag2 = menupresenter.expandItemActionView(this, menuitemimpl);
	//   37   81:aload           7
	//   38   83:aload_0         
	//   39   84:aload_1         
	//   40   85:invokeinterface #463 <Method boolean MenuPresenter.expandItemActionView(MenuBuilder, MenuItemImpl)>
	//   41   90:istore          4
				flag = flag2;
	//   42   92:iload           4
	//   43   94:istore_2        
				flag1 = flag;
	//   44   95:iload_2         
	//   45   96:istore_3        
				if(flag2)
	//*  46   97:iload           4
	//*  47   99:ifeq            107
				{
					flag1 = flag;
	//   48  102:iload_2         
	//   49  103:istore_3        
					break;
	//   50  104:goto            112
				}
			}
			flag = flag1;
	//   51  107:iload_3         
	//   52  108:istore_2        
		} while(true);
	//   53  109:goto            27
		startDispatchingItemsChanged();
	//   54  112:aload_0         
	//   55  113:invokevirtual   #175 <Method void startDispatchingItemsChanged()>
		if(flag1)
	//*  56  116:iload_3         
	//*  57  117:ifeq            125
			mExpandedItem = menuitemimpl;
	//   58  120:aload_0         
	//   59  121:aload_1         
	//   60  122:putfield        #434 <Field MenuItemImpl mExpandedItem>
		return flag1;
	//   61  125:iload_3         
	//   62  126:ireturn         
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
		int k = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #468 <Method int size()>
	//    2    4:istore_3        
		for(int j = 0; j < k; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          73
		{
			Object obj = ((Object) ((MenuItemImpl)mItems.get(j)));
	//    8   12:aload_0         
	//    9   13:getfield        #116 <Field ArrayList mItems>
	//   10   16:iload_2         
	//   11   17:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   12   20:checkcast       #134 <Class MenuItemImpl>
	//   13   23:astore          4
			if(((MenuItemImpl) (obj)).getItemId() == i)
	//*  14   25:aload           4
	//*  15   27:invokevirtual   #475 <Method int MenuItemImpl.getItemId()>
	//*  16   30:iload_1         
	//*  17   31:icmpne          37
				return ((MenuItem) (obj));
	//   18   34:aload           4
	//   19   36:areturn         
			if(!((MenuItemImpl) (obj)).hasSubMenu())
				continue;
	//   20   37:aload           4
	//   21   39:invokevirtual   #478 <Method boolean MenuItemImpl.hasSubMenu()>
	//   22   42:ifeq            66
			obj = ((Object) (((MenuItemImpl) (obj)).getSubMenu().findItem(i)));
	//   23   45:aload           4
	//   24   47:invokevirtual   #482 <Method SubMenu MenuItemImpl.getSubMenu()>
	//   25   50:iload_1         
	//   26   51:invokeinterface #486 <Method MenuItem SubMenu.findItem(int)>
	//   27   56:astore          4
			if(obj != null)
	//*  28   58:aload           4
	//*  29   60:ifnull          66
				return ((MenuItem) (obj));
	//   30   63:aload           4
	//   31   65:areturn         
		}

	//   32   66:iload_2         
	//   33   67:iconst_1        
	//   34   68:iadd            
	//   35   69:istore_2        
	//*  36   70:goto            7
		return null;
	//   37   73:aconst_null     
	//   38   74:areturn         
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
		ArrayList arraylist = mTempShortcutItemList;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field ArrayList mTempShortcutItemList>
	//    2    4:astore          8
		arraylist.clear();
	//    3    6:aload           8
	//    4    8:invokevirtual   #440 <Method void ArrayList.clear()>
		findItemsWithShortcutForKey(((List) (arraylist)), i, keyevent);
	//    5   11:aload_0         
	//    6   12:aload           8
	//    7   14:iload_1         
	//    8   15:aload_2         
	//    9   16:invokevirtual   #493 <Method void findItemsWithShortcutForKey(List, int, KeyEvent)>
		if(arraylist.isEmpty())
	//*  10   19:aload           8
	//*  11   21:invokevirtual   #494 <Method boolean ArrayList.isEmpty()>
	//*  12   24:ifeq            29
			return null;
	//   13   27:aconst_null     
	//   14   28:areturn         
		int k = keyevent.getMetaState();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #499 <Method int KeyEvent.getMetaState()>
	//   17   33:istore          5
		android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
	//   18   35:new             #501 <Class android.view.KeyCharacterMap$KeyData>
	//   19   38:dup             
	//   20   39:invokespecial   #502 <Method void android.view.KeyCharacterMap$KeyData()>
	//   21   42:astore          9
		keyevent.getKeyData(keydata);
	//   22   44:aload_2         
	//   23   45:aload           9
	//   24   47:invokevirtual   #506 <Method boolean KeyEvent.getKeyData(android.view.KeyCharacterMap$KeyData)>
	//   25   50:pop             
		int l = arraylist.size();
	//   26   51:aload           8
	//   27   53:invokevirtual   #223 <Method int ArrayList.size()>
	//   28   56:istore          6
		if(l == 1)
	//*  29   58:iload           6
	//*  30   60:iconst_1        
	//*  31   61:icmpne          74
			return (MenuItemImpl)arraylist.get(0);
	//   32   64:aload           8
	//   33   66:iconst_0        
	//   34   67:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   35   70:checkcast       #134 <Class MenuItemImpl>
	//   36   73:areturn         
		boolean flag = isQwertyMode();
	//   37   74:aload_0         
	//   38   75:invokevirtual   #509 <Method boolean isQwertyMode()>
	//   39   78:istore          7
		for(int j = 0; j < l; j++)
	//*  40   80:iconst_0        
	//*  41   81:istore_3        
	//*  42   82:iload_3         
	//*  43   83:iload           6
	//*  44   85:icmpge          183
		{
			keyevent = ((KeyEvent) ((MenuItemImpl)arraylist.get(j)));
	//   45   88:aload           8
	//   46   90:iload_3         
	//   47   91:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   48   94:checkcast       #134 <Class MenuItemImpl>
	//   49   97:astore_2        
			char c;
			if(flag)
	//*  50   98:iload           7
	//*  51  100:ifeq            112
				c = ((MenuItemImpl) (keyevent)).getAlphabeticShortcut();
	//   52  103:aload_2         
	//   53  104:invokevirtual   #513 <Method char MenuItemImpl.getAlphabeticShortcut()>
	//   54  107:istore          4
			else
	//*  55  109:goto            118
				c = ((MenuItemImpl) (keyevent)).getNumericShortcut();
	//   56  112:aload_2         
	//   57  113:invokevirtual   #516 <Method char MenuItemImpl.getNumericShortcut()>
	//   58  116:istore          4
			if(c == keydata.meta[0] && (k & 2) == 0 || c == keydata.meta[2] && (k & 2) != 0 || flag && c == '\b' && i == 67)
	//*  59  118:iload           4
	//*  60  120:aload           9
	//*  61  122:getfield        #520 <Field char[] android.view.KeyCharacterMap$KeyData.meta>
	//*  62  125:iconst_0        
	//*  63  126:caload          
	//*  64  127:icmpne          137
	//*  65  130:iload           5
	//*  66  132:iconst_2        
	//*  67  133:iand            
	//*  68  134:ifeq            174
	//*  69  137:iload           4
	//*  70  139:aload           9
	//*  71  141:getfield        #520 <Field char[] android.view.KeyCharacterMap$KeyData.meta>
	//*  72  144:iconst_2        
	//*  73  145:caload          
	//*  74  146:icmpne          156
	//*  75  149:iload           5
	//*  76  151:iconst_2        
	//*  77  152:iand            
	//*  78  153:ifne            174
	//*  79  156:iload           7
	//*  80  158:ifeq            176
	//*  81  161:iload           4
	//*  82  163:bipush          8
	//*  83  165:icmpne          176
	//*  84  168:iload_1         
	//*  85  169:bipush          67
	//*  86  171:icmpne          176
				return ((MenuItemImpl) (keyevent));
	//   87  174:aload_2         
	//   88  175:areturn         
		}

	//   89  176:iload_3         
	//   90  177:iconst_1        
	//   91  178:iadd            
	//   92  179:istore_3        
	//*  93  180:goto            82
		return null;
	//   94  183:aconst_null     
	//   95  184:areturn         
	}

	void findItemsWithShortcutForKey(List list, int i, KeyEvent keyevent)
	{
		boolean flag = isQwertyMode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #509 <Method boolean isQwertyMode()>
	//    2    4:istore          8
		int k = keyevent.getMetaState();
	//    3    6:aload_3         
	//    4    7:invokevirtual   #499 <Method int KeyEvent.getMetaState()>
	//    5   10:istore          6
		android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
	//    6   12:new             #501 <Class android.view.KeyCharacterMap$KeyData>
	//    7   15:dup             
	//    8   16:invokespecial   #502 <Method void android.view.KeyCharacterMap$KeyData()>
	//    9   19:astore          9
		if(!keyevent.getKeyData(keydata) && i != 67)
	//*  10   21:aload_3         
	//*  11   22:aload           9
	//*  12   24:invokevirtual   #506 <Method boolean KeyEvent.getKeyData(android.view.KeyCharacterMap$KeyData)>
	//*  13   27:ifne            37
	//*  14   30:iload_2         
	//*  15   31:bipush          67
	//*  16   33:icmpeq          37
			return;
	//   17   36:return          
		int l = mItems.size();
	//   18   37:aload_0         
	//   19   38:getfield        #116 <Field ArrayList mItems>
	//   20   41:invokevirtual   #223 <Method int ArrayList.size()>
	//   21   44:istore          7
		for(int j = 0; j < l; j++)
	//*  22   46:iconst_0        
	//*  23   47:istore          4
	//*  24   49:iload           4
	//*  25   51:iload           7
	//*  26   53:icmpge          194
		{
			MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(j);
	//   27   56:aload_0         
	//   28   57:getfield        #116 <Field ArrayList mItems>
	//   29   60:iload           4
	//   30   62:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   31   65:checkcast       #134 <Class MenuItemImpl>
	//   32   68:astore          10
			if(menuitemimpl.hasSubMenu())
	//*  33   70:aload           10
	//*  34   72:invokevirtual   #478 <Method boolean MenuItemImpl.hasSubMenu()>
	//*  35   75:ifeq            92
				((MenuBuilder)menuitemimpl.getSubMenu()).findItemsWithShortcutForKey(list, i, keyevent);
	//   36   78:aload           10
	//   37   80:invokevirtual   #482 <Method SubMenu MenuItemImpl.getSubMenu()>
	//   38   83:checkcast       #2   <Class MenuBuilder>
	//   39   86:aload_1         
	//   40   87:iload_2         
	//   41   88:aload_3         
	//   42   89:invokevirtual   #493 <Method void findItemsWithShortcutForKey(List, int, KeyEvent)>
			char c;
			if(flag)
	//*  43   92:iload           8
	//*  44   94:ifeq            107
				c = menuitemimpl.getAlphabeticShortcut();
	//   45   97:aload           10
	//   46   99:invokevirtual   #513 <Method char MenuItemImpl.getAlphabeticShortcut()>
	//   47  102:istore          5
			else
	//*  48  104:goto            114
				c = menuitemimpl.getNumericShortcut();
	//   49  107:aload           10
	//   50  109:invokevirtual   #516 <Method char MenuItemImpl.getNumericShortcut()>
	//   51  112:istore          5
			if((k & 5) == 0 && c != 0 && (c == keydata.meta[0] || c == keydata.meta[2] || flag && c == '\b' && i == 67) && menuitemimpl.isEnabled())
	//*  52  114:iload           6
	//*  53  116:iconst_5        
	//*  54  117:iand            
	//*  55  118:ifne            185
	//*  56  121:iload           5
	//*  57  123:ifeq            185
	//*  58  126:iload           5
	//*  59  128:aload           9
	//*  60  130:getfield        #520 <Field char[] android.view.KeyCharacterMap$KeyData.meta>
	//*  61  133:iconst_0        
	//*  62  134:caload          
	//*  63  135:icmpeq          168
	//*  64  138:iload           5
	//*  65  140:aload           9
	//*  66  142:getfield        #520 <Field char[] android.view.KeyCharacterMap$KeyData.meta>
	//*  67  145:iconst_2        
	//*  68  146:caload          
	//*  69  147:icmpeq          168
	//*  70  150:iload           8
	//*  71  152:ifeq            185
	//*  72  155:iload           5
	//*  73  157:bipush          8
	//*  74  159:icmpne          185
	//*  75  162:iload_2         
	//*  76  163:bipush          67
	//*  77  165:icmpne          185
	//*  78  168:aload           10
	//*  79  170:invokevirtual   #523 <Method boolean MenuItemImpl.isEnabled()>
	//*  80  173:ifeq            185
				list.add(((Object) (menuitemimpl)));
	//   81  176:aload_1         
	//   82  177:aload           10
	//   83  179:invokeinterface #524 <Method boolean List.add(Object)>
	//   84  184:pop             
		}

	//   85  185:iload           4
	//   86  187:iconst_1        
	//   87  188:iadd            
	//   88  189:istore          4
	//*  89  191:goto            49
	//   90  194:return          
	}

	public void flagActionItems()
	{
		ArrayList arraylist = getVisibleItems();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #530 <Method ArrayList getVisibleItems()>
	//    2    4:astore_3        
		if(!mIsActionItemsStale)
	//*   3    5:aload_0         
	//*   4    6:getfield        #126 <Field boolean mIsActionItemsStale>
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		boolean flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		for(Iterator iterator = mPresenters.iterator(); iterator.hasNext();)
	//*   9   15:aload_0         
	//*  10   16:getfield        #104 <Field CopyOnWriteArrayList mPresenters>
	//*  11   19:invokevirtual   #149 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  12   22:astore          4
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
	//*  31   71:goto            84
				flag |= menupresenter.flagActionItems();
	//   32   74:iload_1         
	//   33   75:aload           6
	//   34   77:invokeinterface #532 <Method boolean MenuPresenter.flagActionItems()>
	//   35   82:ior             
	//   36   83:istore_1        
		}

	//*  37   84:goto            24
		if(flag)
	//*  38   87:iload_1         
	//*  39   88:ifeq            168
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
			for(int i = 0; i < j; i++)
	//*  49  110:iconst_0        
	//*  50  111:istore_1        
	//*  51  112:iload_1         
	//*  52  113:iload_2         
	//*  53  114:icmpge          165
			{
				MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(i);
	//   54  117:aload_3         
	//   55  118:iload_1         
	//   56  119:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   57  122:checkcast       #134 <Class MenuItemImpl>
	//   58  125:astore          4
				if(menuitemimpl.isActionButton())
	//*  59  127:aload           4
	//*  60  129:invokevirtual   #535 <Method boolean MenuItemImpl.isActionButton()>
	//*  61  132:ifeq            148
					mActionItems.add(((Object) (menuitemimpl)));
	//   62  135:aload_0         
	//   63  136:getfield        #122 <Field ArrayList mActionItems>
	//   64  139:aload           4
	//   65  141:invokevirtual   #536 <Method boolean ArrayList.add(Object)>
	//   66  144:pop             
				else
	//*  67  145:goto            158
					mNonActionItems.add(((Object) (menuitemimpl)));
	//   68  148:aload_0         
	//   69  149:getfield        #124 <Field ArrayList mNonActionItems>
	//   70  152:aload           4
	//   71  154:invokevirtual   #536 <Method boolean ArrayList.add(Object)>
	//   72  157:pop             
			}

	//   73  158:iload_1         
	//   74  159:iconst_1        
	//   75  160:iadd            
	//   76  161:istore_1        
		} else
	//*  77  162:goto            112
	//*  78  165:goto            194
		{
			mActionItems.clear();
	//   79  168:aload_0         
	//   80  169:getfield        #122 <Field ArrayList mActionItems>
	//   81  172:invokevirtual   #440 <Method void ArrayList.clear()>
			mNonActionItems.clear();
	//   82  175:aload_0         
	//   83  176:getfield        #124 <Field ArrayList mNonActionItems>
	//   84  179:invokevirtual   #440 <Method void ArrayList.clear()>
			mNonActionItems.addAll(((java.util.Collection) (getVisibleItems())));
	//   85  182:aload_0         
	//   86  183:getfield        #124 <Field ArrayList mNonActionItems>
	//   87  186:aload_0         
	//   88  187:invokevirtual   #530 <Method ArrayList getVisibleItems()>
	//   89  190:invokevirtual   #540 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   90  193:pop             
		}
		mIsActionItemsStale = false;
	//   91  194:aload_0         
	//   92  195:iconst_0        
	//   93  196:putfield        #126 <Field boolean mIsActionItemsStale>
	//   94  199:return          
	}

	public ArrayList getActionItems()
	{
		flagActionItems();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #543 <Method void flagActionItems()>
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
	//    1    1:invokevirtual   #543 <Method void flagActionItems()>
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
	//*  25   47:invokevirtual   #563 <Method boolean MenuItemImpl.isVisible()>
	//*  26   50:ifeq            62
				mVisibleItems.add(((Object) (menuitemimpl)));
	//   27   53:aload_0         
	//   28   54:getfield        #118 <Field ArrayList mVisibleItems>
	//   29   57:aload_3         
	//   30   58:invokevirtual   #536 <Method boolean ArrayList.add(Object)>
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
	//*   1    1:getfield        #567 <Field boolean mOverrideVisibleItems>
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
	//*  18   32:invokevirtual   #563 <Method boolean MenuItemImpl.isVisible()>
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
	//    1    1:getfield        #569 <Field boolean mQwertyMode>
	//    2    4:ireturn         
	}

	public boolean isShortcutKey(int i, KeyEvent keyevent)
	{
		return findItemWithShortcutForKey(i, keyevent) != null;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #573 <Method MenuItemImpl findItemWithShortcutForKey(int, KeyEvent)>
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
	//   13   23:invokespecial   #579 <Method void dispatchPresenterUpdate(boolean)>
			return;
	//   14   26:return          
		}
		mItemsChangedWhileDispatchPrevented = true;
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:putfield        #88  <Field boolean mItemsChangedWhileDispatchPrevented>
		if(flag)
	//*  18   32:iload_1         
	//*  19   33:ifeq            41
			mStructureChangedWhileDispatchPrevented = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #90  <Field boolean mStructureChangedWhileDispatchPrevented>
	//   23   41:return          
	}

	public boolean performIdentifierAction(int i, int j)
	{
		return performItemAction(findItem(i), j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #582 <Method MenuItem findItem(int)>
	//    4    6:iload_2         
	//    5    7:invokevirtual   #586 <Method boolean performItemAction(MenuItem, int)>
	//    6   10:ireturn         
	}

	public boolean performItemAction(MenuItem menuitem, int i)
	{
		return performItemAction(menuitem, ((MenuPresenter) (null)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iload_2         
	//    4    4:invokevirtual   #589 <Method boolean performItemAction(MenuItem, MenuPresenter, int)>
	//    5    7:ireturn         
	}

	public boolean performItemAction(MenuItem menuitem, MenuPresenter menupresenter, int i)
	{
		Object obj = ((Object) ((MenuItemImpl)menuitem));
	//    0    0:aload_1         
	//    1    1:checkcast       #134 <Class MenuItemImpl>
	//    2    4:astore          7
		if(obj == null || !((MenuItemImpl) (obj)).isEnabled())
	//*   3    6:aload           7
	//*   4    8:ifnull          19
	//*   5   11:aload           7
	//*   6   13:invokevirtual   #523 <Method boolean MenuItemImpl.isEnabled()>
	//*   7   16:ifne            21
			return false;
	//    8   19:iconst_0        
	//    9   20:ireturn         
		boolean flag2 = ((MenuItemImpl) (obj)).invoke();
	//   10   21:aload           7
	//   11   23:invokevirtual   #592 <Method boolean MenuItemImpl.invoke()>
	//   12   26:istore          6
		menuitem = ((MenuItem) (((MenuItemImpl) (obj)).getSupportActionProvider()));
	//   13   28:aload           7
	//   14   30:invokevirtual   #596 <Method ActionProvider MenuItemImpl.getSupportActionProvider()>
	//   15   33:astore_1        
		boolean flag;
		if(menuitem != null && ((ActionProvider) (menuitem)).hasSubMenu())
	//*  16   34:aload_1         
	//*  17   35:ifnull          51
	//*  18   38:aload_1         
	//*  19   39:invokevirtual   #599 <Method boolean ActionProvider.hasSubMenu()>
	//*  20   42:ifeq            51
			flag = true;
	//   21   45:iconst_1        
	//   22   46:istore          4
		else
	//*  23   48:goto            54
			flag = false;
	//   24   51:iconst_0        
	//   25   52:istore          4
		boolean flag1;
		if(((MenuItemImpl) (obj)).hasCollapsibleActionView())
	//*  26   54:aload           7
	//*  27   56:invokevirtual   #602 <Method boolean MenuItemImpl.hasCollapsibleActionView()>
	//*  28   59:ifeq            89
		{
			flag2 |= ((MenuItemImpl) (obj)).expandActionView();
	//   29   62:iload           6
	//   30   64:aload           7
	//   31   66:invokevirtual   #605 <Method boolean MenuItemImpl.expandActionView()>
	//   32   69:ior             
	//   33   70:istore          6
			flag1 = flag2;
	//   34   72:iload           6
	//   35   74:istore          5
			if(flag2)
	//*  36   76:iload           6
	//*  37   78:ifeq            205
			{
				close(true);
	//   38   81:aload_0         
	//   39   82:iconst_1        
	//   40   83:invokevirtual   #448 <Method void close(boolean)>
				return flag2;
	//   41   86:iload           6
	//   42   88:ireturn         
			}
		} else
		{
			if(((MenuItemImpl) (obj)).hasSubMenu() || flag)
	//*  43   89:aload           7
	//*  44   91:invokevirtual   #478 <Method boolean MenuItemImpl.hasSubMenu()>
	//*  45   94:ifne            102
	//*  46   97:iload           4
	//*  47   99:ifeq            186
			{
				if((i & 4) == 0)
	//*  48  102:iload_3         
	//*  49  103:iconst_4        
	//*  50  104:iand            
	//*  51  105:ifne            113
					close(false);
	//   52  108:aload_0         
	//   53  109:iconst_0        
	//   54  110:invokevirtual   #448 <Method void close(boolean)>
				if(!((MenuItemImpl) (obj)).hasSubMenu())
	//*  55  113:aload           7
	//*  56  115:invokevirtual   #478 <Method boolean MenuItemImpl.hasSubMenu()>
	//*  57  118:ifne            140
					((MenuItemImpl) (obj)).setSubMenu(new SubMenuBuilder(getContext(), this, ((MenuItemImpl) (obj))));
	//   58  121:aload           7
	//   59  123:new             #416 <Class SubMenuBuilder>
	//   60  126:dup             
	//   61  127:aload_0         
	//   62  128:invokevirtual   #265 <Method Context getContext()>
	//   63  131:aload_0         
	//   64  132:aload           7
	//   65  134:invokespecial   #419 <Method void SubMenuBuilder(Context, MenuBuilder, MenuItemImpl)>
	//   66  137:invokevirtual   #423 <Method void MenuItemImpl.setSubMenu(SubMenuBuilder)>
				obj = ((Object) ((SubMenuBuilder)((MenuItemImpl) (obj)).getSubMenu()));
	//   67  140:aload           7
	//   68  142:invokevirtual   #482 <Method SubMenu MenuItemImpl.getSubMenu()>
	//   69  145:checkcast       #416 <Class SubMenuBuilder>
	//   70  148:astore          7
				if(flag)
	//*  71  150:iload           4
	//*  72  152:ifeq            161
					((ActionProvider) (menuitem)).onPrepareSubMenu(((SubMenu) (obj)));
	//   73  155:aload_1         
	//   74  156:aload           7
	//   75  158:invokevirtual   #609 <Method void ActionProvider.onPrepareSubMenu(SubMenu)>
				flag1 = flag2 | dispatchSubMenuSelected(((SubMenuBuilder) (obj)), menupresenter);
	//   76  161:iload           6
	//   77  163:aload_0         
	//   78  164:aload           7
	//   79  166:aload_2         
	//   80  167:invokespecial   #611 <Method boolean dispatchSubMenuSelected(SubMenuBuilder, MenuPresenter)>
	//   81  170:ior             
	//   82  171:istore          5
				if(!flag1)
	//*  83  173:iload           5
	//*  84  175:ifne            183
					close(true);
	//   85  178:aload_0         
	//   86  179:iconst_1        
	//   87  180:invokevirtual   #448 <Method void close(boolean)>
				return flag1;
	//   88  183:iload           5
	//   89  185:ireturn         
			}
			flag1 = flag2;
	//   90  186:iload           6
	//   91  188:istore          5
			if((i & 1) == 0)
	//*  92  190:iload_3         
	//*  93  191:iconst_1        
	//*  94  192:iand            
	//*  95  193:ifne            205
			{
				close(true);
	//   96  196:aload_0         
	//   97  197:iconst_1        
	//   98  198:invokevirtual   #448 <Method void close(boolean)>
				flag1 = flag2;
	//   99  201:iload           6
	//  100  203:istore          5
			}
		}
		return flag1;
	//  101  205:iload           5
	//  102  207:ireturn         
	}

	public boolean performShortcut(int i, KeyEvent keyevent, int j)
	{
		keyevent = ((KeyEvent) (findItemWithShortcutForKey(i, keyevent)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #573 <Method MenuItemImpl findItemWithShortcutForKey(int, KeyEvent)>
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
	//   12   17:invokevirtual   #586 <Method boolean performItemAction(MenuItem, int)>
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
		int l = findGroupIndex(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #615 <Method int findGroupIndex(int)>
	//    3    5:istore          4
		if(l >= 0)
	//*   4    7:iload           4
	//*   5    9:iflt            72
		{
			int i1 = mItems.size();
	//    6   12:aload_0         
	//    7   13:getfield        #116 <Field ArrayList mItems>
	//    8   16:invokevirtual   #223 <Method int ArrayList.size()>
	//    9   19:istore          5
			int j = 0;
	//   10   21:iconst_0        
	//   11   22:istore_2        
			do
			{
				int k = j + 1;
	//   12   23:iload_2         
	//   13   24:iconst_1        
	//   14   25:iadd            
	//   15   26:istore_3        
				if(j >= i1 - l || ((MenuItemImpl)mItems.get(l)).getGroupId() != i)
					break;
	//   16   27:iload_2         
	//   17   28:iload           5
	//   18   30:iload           4
	//   19   32:isub            
	//   20   33:icmpge          67
	//   21   36:aload_0         
	//   22   37:getfield        #116 <Field ArrayList mItems>
	//   23   40:iload           4
	//   24   42:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   25   45:checkcast       #134 <Class MenuItemImpl>
	//   26   48:invokevirtual   #471 <Method int MenuItemImpl.getGroupId()>
	//   27   51:iload_1         
	//   28   52:icmpne          67
				removeItemAtInt(l, false);
	//   29   55:aload_0         
	//   30   56:iload           4
	//   31   58:iconst_0        
	//   32   59:invokespecial   #617 <Method void removeItemAtInt(int, boolean)>
				j = k;
	//   33   62:iload_3         
	//   34   63:istore_2        
			} while(true);
	//   35   64:goto            23
			onItemsChanged(true);
	//   36   67:aload_0         
	//   37   68:iconst_1        
	//   38   69:invokevirtual   #246 <Method void onItemsChanged(boolean)>
		}
	//   39   72:return          
	}

	public void removeItem(int i)
	{
		removeItemAtInt(findItemIndex(i), true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #620 <Method int findItemIndex(int)>
	//    4    6:iconst_1        
	//    5    7:invokespecial   #617 <Method void removeItemAtInt(int, boolean)>
	//    6   10:return          
	}

	public void removeItemAt(int i)
	{
		removeItemAtInt(i, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #617 <Method void removeItemAtInt(int, boolean)>
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
	//*  19   44:if_acmpne       56
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
		if(bundle == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		SparseArray sparsearray = bundle.getSparseParcelableArray(getActionViewStatesKey());
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #625 <Method String getActionViewStatesKey()>
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
	//   18   29:invokevirtual   #627 <Method MenuItem getItem(int)>
	//   19   32:astore          5
			View view = menuitem.getActionView();
	//   20   34:aload           5
	//   21   36:invokeinterface #630 <Method View MenuItem.getActionView()>
	//   22   41:astore          6
			if(view != null && view.getId() != -1)
	//*  23   43:aload           6
	//*  24   45:ifnull          64
	//*  25   48:aload           6
	//*  26   50:invokevirtual   #633 <Method int View.getId()>
	//*  27   53:iconst_m1       
	//*  28   54:icmpeq          64
				view.restoreHierarchyState(sparsearray);
	//   29   57:aload           6
	//   30   59:aload           4
	//   31   61:invokevirtual   #637 <Method void View.restoreHierarchyState(SparseArray)>
			if(menuitem.hasSubMenu())
	//*  32   64:aload           5
	//*  33   66:invokeinterface #638 <Method boolean MenuItem.hasSubMenu()>
	//*  34   71:ifeq            88
				((SubMenuBuilder)menuitem.getSubMenu()).restoreActionViewStates(bundle);
	//   35   74:aload           5
	//   36   76:invokeinterface #639 <Method SubMenu MenuItem.getSubMenu()>
	//   37   81:checkcast       #416 <Class SubMenuBuilder>
	//   38   84:aload_1         
	//   39   85:invokevirtual   #641 <Method void SubMenuBuilder.restoreActionViewStates(Bundle)>
		}

	//   40   88:iload_2         
	//   41   89:iconst_1        
	//   42   90:iadd            
	//   43   91:istore_2        
	//*  44   92:goto            22
		int j = bundle.getInt("android:menu:expandedactionview");
	//   45   95:aload_1         
	//   46   96:ldc1            #23  <String "android:menu:expandedactionview">
	//   47   98:invokevirtual   #645 <Method int Bundle.getInt(String)>
	//   48  101:istore_2        
		if(j > 0)
	//*  49  102:iload_2         
	//*  50  103:ifle            123
		{
			bundle = ((Bundle) (findItem(j)));
	//   51  106:aload_0         
	//   52  107:iload_2         
	//   53  108:invokevirtual   #582 <Method MenuItem findItem(int)>
	//   54  111:astore_1        
			if(bundle != null)
	//*  55  112:aload_1         
	//*  56  113:ifnull          123
				((MenuItem) (bundle)).expandActionView();
	//   57  116:aload_1         
	//   58  117:invokeinterface #646 <Method boolean MenuItem.expandActionView()>
	//   59  122:pop             
		}
	//   60  123:return          
	}

	public void restorePresenterStates(Bundle bundle)
	{
		dispatchRestoreInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #649 <Method void dispatchRestoreInstanceState(Bundle)>
	//    3    5:return          
	}

	public void saveActionViewStates(Bundle bundle)
	{
		SparseArray sparsearray = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		int j = size();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #468 <Method int size()>
	//    4    7:istore_3        
		for(int i = 0; i < j;)
	//*   5    8:iconst_0        
	//*   6    9:istore_2        
	//*   7   10:iload_2         
	//*   8   11:iload_3         
	//*   9   12:icmpge          144
		{
			MenuItem menuitem = getItem(i);
	//   10   15:aload_0         
	//   11   16:iload_2         
	//   12   17:invokevirtual   #627 <Method MenuItem getItem(int)>
	//   13   20:astore          7
			View view = menuitem.getActionView();
	//   14   22:aload           7
	//   15   24:invokeinterface #630 <Method View MenuItem.getActionView()>
	//   16   29:astore          8
			SparseArray sparsearray2 = sparsearray;
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
	//*  24   46:invokevirtual   #633 <Method int View.getId()>
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
	//   37   75:invokevirtual   #653 <Method void View.saveHierarchyState(SparseArray)>
					sparsearray2 = sparsearray1;
	//   38   78:aload           5
	//   39   80:astore          6
					if(menuitem.isActionViewExpanded())
	//*  40   82:aload           7
	//*  41   84:invokeinterface #656 <Method boolean MenuItem.isActionViewExpanded()>
	//*  42   89:ifeq            109
					{
						bundle.putInt("android:menu:expandedactionview", menuitem.getItemId());
	//   43   92:aload_1         
	//   44   93:ldc1            #23  <String "android:menu:expandedactionview">
	//   45   95:aload           7
	//   46   97:invokeinterface #657 <Method int MenuItem.getItemId()>
	//   47  102:invokevirtual   #661 <Method void Bundle.putInt(String, int)>
						sparsearray2 = sparsearray1;
	//   48  105:aload           5
	//   49  107:astore          6
					}
				}
			}
			if(menuitem.hasSubMenu())
	//*  50  109:aload           7
	//*  51  111:invokeinterface #638 <Method boolean MenuItem.hasSubMenu()>
	//*  52  116:ifeq            133
				((SubMenuBuilder)menuitem.getSubMenu()).saveActionViewStates(bundle);
	//   53  119:aload           7
	//   54  121:invokeinterface #639 <Method SubMenu MenuItem.getSubMenu()>
	//   55  126:checkcast       #416 <Class SubMenuBuilder>
	//   56  129:aload_1         
	//   57  130:invokevirtual   #663 <Method void SubMenuBuilder.saveActionViewStates(Bundle)>
			i++;
	//   58  133:iload_2         
	//   59  134:iconst_1        
	//   60  135:iadd            
	//   61  136:istore_2        
			sparsearray = sparsearray2;
	//   62  137:aload           6
	//   63  139:astore          4
		}

	//*  64  141:goto            10
		if(sparsearray != null)
	//*  65  144:aload           4
	//*  66  146:ifnull          159
			bundle.putSparseParcelableArray(getActionViewStatesKey(), sparsearray);
	//   67  149:aload_1         
	//   68  150:aload_0         
	//   69  151:invokevirtual   #625 <Method String getActionViewStatesKey()>
	//   70  154:aload           4
	//   71  156:invokevirtual   #212 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
	//   72  159:return          
	}

	public void savePresenterStates(Bundle bundle)
	{
		dispatchSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #666 <Method void dispatchSaveInstanceState(Bundle)>
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
	//    1    1:invokeinterface #674 <Method int MenuItem.getGroupId()>
	//    2    6:istore_3        
		int k = mItems.size();
	//    3    7:aload_0         
	//    4    8:getfield        #116 <Field ArrayList mItems>
	//    5   11:invokevirtual   #223 <Method int ArrayList.size()>
	//    6   14:istore          4
		stopDispatchingItemsChanged();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #145 <Method void stopDispatchingItemsChanged()>
		for(int i = 0; i < k; i++)
	//*   9   20:iconst_0        
	//*  10   21:istore_2        
	//*  11   22:iload_2         
	//*  12   23:iload           4
	//*  13   25:icmpge          101
		{
			MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(i);
	//   14   28:aload_0         
	//   15   29:getfield        #116 <Field ArrayList mItems>
	//   16   32:iload_2         
	//   17   33:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   18   36:checkcast       #134 <Class MenuItemImpl>
	//   19   39:astore          6
			if(menuitemimpl.getGroupId() != j || !menuitemimpl.isExclusiveCheckable() || !menuitemimpl.isCheckable())
	//*  20   41:aload           6
	//*  21   43:invokevirtual   #471 <Method int MenuItemImpl.getGroupId()>
	//*  22   46:iload_3         
	//*  23   47:icmpne          94
	//*  24   50:aload           6
	//*  25   52:invokevirtual   #677 <Method boolean MenuItemImpl.isExclusiveCheckable()>
	//*  26   55:ifne            61
	//*  27   58:goto            94
	//*  28   61:aload           6
	//*  29   63:invokevirtual   #680 <Method boolean MenuItemImpl.isCheckable()>
	//*  30   66:ifne            72
				continue;
	//   31   69:goto            94
			boolean flag;
			if(menuitemimpl == menuitem)
	//*  32   72:aload           6
	//*  33   74:aload_1         
	//*  34   75:if_acmpne       84
				flag = true;
	//   35   78:iconst_1        
	//   36   79:istore          5
			else
	//*  37   81:goto            87
				flag = false;
	//   38   84:iconst_0        
	//   39   85:istore          5
			menuitemimpl.setCheckedInt(flag);
	//   40   87:aload           6
	//   41   89:iload           5
	//   42   91:invokevirtual   #683 <Method void MenuItemImpl.setCheckedInt(boolean)>
		}

	//   43   94:iload_2         
	//   44   95:iconst_1        
	//   45   96:iadd            
	//   46   97:istore_2        
	//*  47   98:goto            22
		startDispatchingItemsChanged();
	//   48  101:aload_0         
	//   49  102:invokevirtual   #175 <Method void startDispatchingItemsChanged()>
	//   50  105:return          
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
	//   21   45:invokevirtual   #688 <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
				menuitemimpl.setCheckable(flag);
	//   22   48:aload           6
	//   23   50:iload_2         
	//   24   51:invokevirtual   #692 <Method MenuItem MenuItemImpl.setCheckable(boolean)>
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
	//   21   42:invokevirtual   #696 <Method MenuItem MenuItemImpl.setEnabled(boolean)>
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
	//    3    7:istore          6
		boolean flag1 = false;
	//    4    9:iconst_0        
	//    5   10:istore          4
		for(int j = 0; j < k;)
	//*   6   12:iconst_0        
	//*   7   13:istore_3        
	//*   8   14:iload_3         
	//*   9   15:iload           6
	//*  10   17:icmpge          73
		{
			MenuItemImpl menuitemimpl = (MenuItemImpl)mItems.get(j);
	//   11   20:aload_0         
	//   12   21:getfield        #116 <Field ArrayList mItems>
	//   13   24:iload_3         
	//   14   25:invokevirtual   #224 <Method Object ArrayList.get(int)>
	//   15   28:checkcast       #134 <Class MenuItemImpl>
	//   16   31:astore          7
			boolean flag2 = flag1;
	//   17   33:iload           4
	//   18   35:istore          5
			if(menuitemimpl.getGroupId() == i)
	//*  19   37:aload           7
	//*  20   39:invokevirtual   #471 <Method int MenuItemImpl.getGroupId()>
	//*  21   42:iload_1         
	//*  22   43:icmpne          62
			{
				flag2 = flag1;
	//   23   46:iload           4
	//   24   48:istore          5
				if(menuitemimpl.setVisibleInt(flag))
	//*  25   50:aload           7
	//*  26   52:iload_2         
	//*  27   53:invokevirtual   #701 <Method boolean MenuItemImpl.setVisibleInt(boolean)>
	//*  28   56:ifeq            62
					flag2 = true;
	//   29   59:iconst_1        
	//   30   60:istore          5
			}
			j++;
	//   31   62:iload_3         
	//   32   63:iconst_1        
	//   33   64:iadd            
	//   34   65:istore_3        
			flag1 = flag2;
	//   35   66:iload           5
	//   36   68:istore          4
		}

	//*  37   70:goto            14
		if(flag1)
	//*  38   73:iload           4
	//*  39   75:ifeq            83
			onItemsChanged(true);
	//   40   78:aload_0         
	//   41   79:iconst_1        
	//   42   80:invokevirtual   #246 <Method void onItemsChanged(boolean)>
	//   43   83:return          
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
	//    6    6:invokespecial   #704 <Method void setHeaderInternal(int, CharSequence, int, Drawable, View)>
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
	//    6    6:invokespecial   #704 <Method void setHeaderInternal(int, CharSequence, int, Drawable, View)>
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
	//    6    6:invokespecial   #704 <Method void setHeaderInternal(int, CharSequence, int, Drawable, View)>
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
	//    6    6:invokespecial   #704 <Method void setHeaderInternal(int, CharSequence, int, Drawable, View)>
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
	//    6    6:invokespecial   #704 <Method void setHeaderInternal(int, CharSequence, int, Drawable, View)>
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
	//    2    2:putfield        #567 <Field boolean mOverrideVisibleItems>
	//    3    5:return          
	}

	public void setQwertyMode(boolean flag)
	{
		mQwertyMode = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #569 <Field boolean mQwertyMode>
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
