// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.*;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.MenuItemHoverListener;
import android.support.v7.widget.MenuPopupWindow;
import android.util.DisplayMetrics;
import android.view.*;
import android.widget.*;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package android.support.v7.view.menu:
//			MenuPopup, MenuPresenter, MenuBuilder, MenuAdapter, 
//			SubMenuBuilder

final class CascadingMenuPopup extends MenuPopup
	implements MenuPresenter, android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener
{
	private static class CascadingMenuInfo
	{

		public ListView getListView()
		{
			return window.getListView();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MenuPopupWindow window>
		//    2    4:invokevirtual   #33  <Method ListView MenuPopupWindow.getListView()>
		//    3    7:areturn         
		}

		public final MenuBuilder menu;
		public final int position;
		public final MenuPopupWindow window;

		public CascadingMenuInfo(MenuPopupWindow menupopupwindow, MenuBuilder menubuilder, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			window = menupopupwindow;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field MenuPopupWindow window>
			menu = menubuilder;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field MenuBuilder menu>
			position = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #25  <Field int position>
		//   11   19:return          
		}
	}

	public static interface HorizPosition
		extends Annotation
	{
	}


	public CascadingMenuPopup(Context context, View view, int i, int j, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void MenuPopup()>
	//    2    4:aload_0         
	//    3    5:new             #80  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #81  <Method void ArrayList()>
	//    6   12:putfield        #83  <Field List mPendingMenus>
	//    7   15:aload_0         
	//    8   16:new             #80  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #81  <Method void ArrayList()>
	//   11   23:putfield        #85  <Field List mShowingMenus>
	//   12   26:aload_0         
	//   13   27:new             #12  <Class CascadingMenuPopup$1>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #88  <Method void CascadingMenuPopup$1(CascadingMenuPopup)>
	//   17   35:putfield        #90  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//   18   38:aload_0         
	//   19   39:new             #14  <Class CascadingMenuPopup$2>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:invokespecial   #91  <Method void CascadingMenuPopup$2(CascadingMenuPopup)>
	//   23   47:putfield        #93  <Field android.view.View$OnAttachStateChangeListener mAttachStateChangeListener>
	//   24   50:aload_0         
	//   25   51:new             #16  <Class CascadingMenuPopup$3>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:invokespecial   #94  <Method void CascadingMenuPopup$3(CascadingMenuPopup)>
	//   29   59:putfield        #96  <Field MenuItemHoverListener mMenuItemHoverListener>
		mRawDropDownGravity = 0;
	//   30   62:aload_0         
	//   31   63:iconst_0        
	//   32   64:putfield        #98  <Field int mRawDropDownGravity>
		mDropDownGravity = 0;
	//   33   67:aload_0         
	//   34   68:iconst_0        
	//   35   69:putfield        #100 <Field int mDropDownGravity>
		mContext = context;
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:putfield        #102 <Field Context mContext>
		mAnchorView = view;
	//   39   77:aload_0         
	//   40   78:aload_2         
	//   41   79:putfield        #104 <Field View mAnchorView>
		mPopupStyleAttr = i;
	//   42   82:aload_0         
	//   43   83:iload_3         
	//   44   84:putfield        #106 <Field int mPopupStyleAttr>
		mPopupStyleRes = j;
	//   45   87:aload_0         
	//   46   88:iload           4
	//   47   90:putfield        #108 <Field int mPopupStyleRes>
		mOverflowOnly = flag;
	//   48   93:aload_0         
	//   49   94:iload           5
	//   50   96:putfield        #110 <Field boolean mOverflowOnly>
		mForceShowIcon = false;
	//   51   99:aload_0         
	//   52  100:iconst_0        
	//   53  101:putfield        #112 <Field boolean mForceShowIcon>
		mLastPosition = getInitialMenuPosition();
	//   54  104:aload_0         
	//   55  105:aload_0         
	//   56  106:invokespecial   #116 <Method int getInitialMenuPosition()>
	//   57  109:putfield        #118 <Field int mLastPosition>
		context = ((Context) (context.getResources()));
	//   58  112:aload_1         
	//   59  113:invokevirtual   #124 <Method Resources Context.getResources()>
	//   60  116:astore_1        
		mMenuMaxWidth = Math.max(((Resources) (context)).getDisplayMetrics().widthPixels / 2, ((Resources) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_config_prefDialogWidth));
	//   61  117:aload_0         
	//   62  118:aload_1         
	//   63  119:invokevirtual   #130 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   64  122:getfield        #135 <Field int DisplayMetrics.widthPixels>
	//   65  125:iconst_2        
	//   66  126:idiv            
	//   67  127:aload_1         
	//   68  128:getstatic       #140 <Field int android.support.v7.appcompat.R$dimen.abc_config_prefDialogWidth>
	//   69  131:invokevirtual   #144 <Method int Resources.getDimensionPixelSize(int)>
	//   70  134:invokestatic    #150 <Method int Math.max(int, int)>
	//   71  137:putfield        #152 <Field int mMenuMaxWidth>
	//   72  140:aload_0         
	//   73  141:new             #154 <Class Handler>
	//   74  144:dup             
	//   75  145:invokespecial   #155 <Method void Handler()>
	//   76  148:putfield        #157 <Field Handler mSubMenuHoverHandler>
	//   77  151:return          
	}

	private MenuPopupWindow createPopupWindow()
	{
		MenuPopupWindow menupopupwindow = new MenuPopupWindow(mContext, ((android.util.AttributeSet) (null)), mPopupStyleAttr, mPopupStyleRes);
	//    0    0:new             #171 <Class MenuPopupWindow>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #102 <Field Context mContext>
	//    4    8:aconst_null     
	//    5    9:aload_0         
	//    6   10:getfield        #106 <Field int mPopupStyleAttr>
	//    7   13:aload_0         
	//    8   14:getfield        #108 <Field int mPopupStyleRes>
	//    9   17:invokespecial   #174 <Method void MenuPopupWindow(Context, android.util.AttributeSet, int, int)>
	//   10   20:astore_1        
		menupopupwindow.setHoverListener(mMenuItemHoverListener);
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #96  <Field MenuItemHoverListener mMenuItemHoverListener>
	//   14   26:invokevirtual   #178 <Method void MenuPopupWindow.setHoverListener(MenuItemHoverListener)>
		menupopupwindow.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (this)));
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #182 <Method void MenuPopupWindow.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		menupopupwindow.setOnDismissListener(((android.widget.PopupWindow.OnDismissListener) (this)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:invokevirtual   #186 <Method void MenuPopupWindow.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
		menupopupwindow.setAnchorView(mAnchorView);
	//   21   39:aload_1         
	//   22   40:aload_0         
	//   23   41:getfield        #104 <Field View mAnchorView>
	//   24   44:invokevirtual   #190 <Method void MenuPopupWindow.setAnchorView(View)>
		menupopupwindow.setDropDownGravity(mDropDownGravity);
	//   25   47:aload_1         
	//   26   48:aload_0         
	//   27   49:getfield        #100 <Field int mDropDownGravity>
	//   28   52:invokevirtual   #194 <Method void MenuPopupWindow.setDropDownGravity(int)>
		menupopupwindow.setModal(true);
	//   29   55:aload_1         
	//   30   56:iconst_1        
	//   31   57:invokevirtual   #198 <Method void MenuPopupWindow.setModal(boolean)>
		menupopupwindow.setInputMethodMode(2);
	//   32   60:aload_1         
	//   33   61:iconst_2        
	//   34   62:invokevirtual   #201 <Method void MenuPopupWindow.setInputMethodMode(int)>
		return menupopupwindow;
	//   35   65:aload_1         
	//   36   66:areturn         
	}

	private int findIndexOfAddedMenu(MenuBuilder menubuilder)
	{
		int j = mShowingMenus.size();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field List mShowingMenus>
	//    2    4:invokeinterface #208 <Method int List.size()>
	//    3    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:iload_3         
	//*   8   14:icmpge          46
			if(menubuilder == ((CascadingMenuInfo)mShowingMenus.get(i)).menu)
	//*   9   17:aload_1         
	//*  10   18:aload_0         
	//*  11   19:getfield        #85  <Field List mShowingMenus>
	//*  12   22:iload_2         
	//*  13   23:invokeinterface #212 <Method Object List.get(int)>
	//*  14   28:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//*  15   31:getfield        #216 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//*  16   34:if_acmpne       39
				return i;
	//   17   37:iload_2         
	//   18   38:ireturn         

	//   19   39:iload_2         
	//   20   40:iconst_1        
	//   21   41:iadd            
	//   22   42:istore_2        
	//*  23   43:goto            12
		return -1;
	//   24   46:iconst_m1       
	//   25   47:ireturn         
	}

	private MenuItem findMenuItemForSubmenu(MenuBuilder menubuilder, MenuBuilder menubuilder1)
	{
		int j = menubuilder.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #221 <Method int MenuBuilder.size()>
	//    2    4:istore          4
		for(int i = 0; i < j; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          52
		{
			MenuItem menuitem = menubuilder.getItem(i);
	//    8   14:aload_1         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #225 <Method MenuItem MenuBuilder.getItem(int)>
	//   11   19:astore          5
			if(menuitem.hasSubMenu() && menubuilder1 == menuitem.getSubMenu())
	//*  12   21:aload           5
	//*  13   23:invokeinterface #231 <Method boolean MenuItem.hasSubMenu()>
	//*  14   28:ifeq            45
	//*  15   31:aload_2         
	//*  16   32:aload           5
	//*  17   34:invokeinterface #235 <Method android.view.SubMenu MenuItem.getSubMenu()>
	//*  18   39:if_acmpne       45
				return menuitem;
	//   19   42:aload           5
	//   20   44:areturn         
		}

	//   21   45:iload_3         
	//   22   46:iconst_1        
	//   23   47:iadd            
	//   24   48:istore_3        
	//*  25   49:goto            8
		return null;
	//   26   52:aconst_null     
	//   27   53:areturn         
	}

	private View findParentViewForSubmenu(CascadingMenuInfo cascadingmenuinfo, MenuBuilder menubuilder)
	{
		int i;
		int j;
		ListView listview;
label0:
		{
			menubuilder = ((MenuBuilder) (findMenuItemForSubmenu(cascadingmenuinfo.menu, menubuilder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #216 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//    3    5:aload_2         
	//    4    6:invokespecial   #240 <Method MenuItem findMenuItemForSubmenu(MenuBuilder, MenuBuilder)>
	//    5    9:astore_2        
			if(menubuilder == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       16
				return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
			listview = cascadingmenuinfo.getListView();
	//   10   16:aload_1         
	//   11   17:invokevirtual   #244 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   12   20:astore          7
			cascadingmenuinfo = ((CascadingMenuInfo) (listview.getAdapter()));
	//   13   22:aload           7
	//   14   24:invokevirtual   #250 <Method android.widget.ListAdapter ListView.getAdapter()>
	//   15   27:astore_1        
			boolean flag = cascadingmenuinfo instanceof HeaderViewListAdapter;
	//   16   28:aload_1         
	//   17   29:instanceof      #252 <Class HeaderViewListAdapter>
	//   18   32:istore          6
			i = 0;
	//   19   34:iconst_0        
	//   20   35:istore_3        
			if(flag)
	//*  21   36:iload           6
	//*  22   38:ifeq            63
			{
				cascadingmenuinfo = ((CascadingMenuInfo) ((HeaderViewListAdapter)cascadingmenuinfo));
	//   23   41:aload_1         
	//   24   42:checkcast       #252 <Class HeaderViewListAdapter>
	//   25   45:astore_1        
				j = ((HeaderViewListAdapter) (cascadingmenuinfo)).getHeadersCount();
	//   26   46:aload_1         
	//   27   47:invokevirtual   #255 <Method int HeaderViewListAdapter.getHeadersCount()>
	//   28   50:istore          4
				cascadingmenuinfo = ((CascadingMenuInfo) ((MenuAdapter)((HeaderViewListAdapter) (cascadingmenuinfo)).getWrappedAdapter()));
	//   29   52:aload_1         
	//   30   53:invokevirtual   #258 <Method android.widget.ListAdapter HeaderViewListAdapter.getWrappedAdapter()>
	//   31   56:checkcast       #260 <Class MenuAdapter>
	//   32   59:astore_1        
			} else
	//*  33   60:goto            71
			{
				cascadingmenuinfo = ((CascadingMenuInfo) ((MenuAdapter)cascadingmenuinfo));
	//   34   63:aload_1         
	//   35   64:checkcast       #260 <Class MenuAdapter>
	//   36   67:astore_1        
				j = 0;
	//   37   68:iconst_0        
	//   38   69:istore          4
			}
			for(int k = ((MenuAdapter) (cascadingmenuinfo)).getCount(); i < k; i++)
	//*  39   71:aload_1         
	//*  40   72:invokevirtual   #263 <Method int MenuAdapter.getCount()>
	//*  41   75:istore          5
	//*  42   77:iload_3         
	//*  43   78:iload           5
	//*  44   80:icmpge          102
				if(menubuilder == ((MenuAdapter) (cascadingmenuinfo)).getItem(i))
	//*  45   83:aload_2         
	//*  46   84:aload_1         
	//*  47   85:iload_3         
	//*  48   86:invokevirtual   #266 <Method MenuItemImpl MenuAdapter.getItem(int)>
	//*  49   89:if_acmpne       95
					break label0;
	//   50   92:goto            104

	//   51   95:iload_3         
	//   52   96:iconst_1        
	//   53   97:iadd            
	//   54   98:istore_3        
	//*  55   99:goto            77
			i = -1;
	//   56  102:iconst_m1       
	//   57  103:istore_3        
		}
		if(i == -1)
	//*  58  104:iload_3         
	//*  59  105:iconst_m1       
	//*  60  106:icmpne          111
			return null;
	//   61  109:aconst_null     
	//   62  110:areturn         
		i = (i + j) - listview.getFirstVisiblePosition();
	//   63  111:iload_3         
	//   64  112:iload           4
	//   65  114:iadd            
	//   66  115:aload           7
	//   67  117:invokevirtual   #269 <Method int ListView.getFirstVisiblePosition()>
	//   68  120:isub            
	//   69  121:istore_3        
		if(i >= 0)
	//*  70  122:iload_3         
	//*  71  123:iflt            144
		{
			if(i >= listview.getChildCount())
	//*  72  126:iload_3         
	//*  73  127:aload           7
	//*  74  129:invokevirtual   #272 <Method int ListView.getChildCount()>
	//*  75  132:icmplt          137
				return null;
	//   76  135:aconst_null     
	//   77  136:areturn         
			else
				return listview.getChildAt(i);
	//   78  137:aload           7
	//   79  139:iload_3         
	//   80  140:invokevirtual   #276 <Method View ListView.getChildAt(int)>
	//   81  143:areturn         
		} else
		{
			return null;
	//   82  144:aconst_null     
	//   83  145:areturn         
		}
	}

	private int getInitialMenuPosition()
	{
		int j = ViewCompat.getLayoutDirection(mAnchorView);
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field View mAnchorView>
	//    2    4:invokestatic    #283 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    7:istore_2        
		int i = 1;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		if(j == 1)
	//*   6   10:iload_2         
	//*   7   11:iconst_1        
	//*   8   12:icmpne          17
			i = 0;
	//    9   15:iconst_0        
	//   10   16:istore_1        
		return i;
	//   11   17:iload_1         
	//   12   18:ireturn         
	}

	private int getNextMenuPosition(int i)
	{
		ListView listview = ((CascadingMenuInfo)mShowingMenus.get(mShowingMenus.size() - 1)).getListView();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field List mShowingMenus>
	//    2    4:aload_0         
	//    3    5:getfield        #85  <Field List mShowingMenus>
	//    4    8:invokeinterface #208 <Method int List.size()>
	//    5   13:iconst_1        
	//    6   14:isub            
	//    7   15:invokeinterface #212 <Method Object List.get(int)>
	//    8   20:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//    9   23:invokevirtual   #244 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   10   26:astore_2        
		int ai[] = new int[2];
	//   11   27:iconst_2        
	//   12   28:newarray        int[]
	//   13   30:astore_3        
		listview.getLocationOnScreen(ai);
	//   14   31:aload_2         
	//   15   32:aload_3         
	//   16   33:invokevirtual   #288 <Method void ListView.getLocationOnScreen(int[])>
		Rect rect = new Rect();
	//   17   36:new             #290 <Class Rect>
	//   18   39:dup             
	//   19   40:invokespecial   #291 <Method void Rect()>
	//   20   43:astore          4
		mShownAnchorView.getWindowVisibleDisplayFrame(rect);
	//   21   45:aload_0         
	//   22   46:getfield        #293 <Field View mShownAnchorView>
	//   23   49:aload           4
	//   24   51:invokevirtual   #299 <Method void View.getWindowVisibleDisplayFrame(Rect)>
		if(mLastPosition == 1)
	//*  25   54:aload_0         
	//*  26   55:getfield        #118 <Field int mLastPosition>
	//*  27   58:iconst_1        
	//*  28   59:icmpne          84
			return ai[0] + listview.getWidth() + i <= rect.right ? 1 : 0;
	//   29   62:aload_3         
	//   30   63:iconst_0        
	//   31   64:iaload          
	//   32   65:aload_2         
	//   33   66:invokevirtual   #302 <Method int ListView.getWidth()>
	//   34   69:iadd            
	//   35   70:iload_1         
	//   36   71:iadd            
	//   37   72:aload           4
	//   38   74:getfield        #305 <Field int Rect.right>
	//   39   77:icmple          82
	//   40   80:iconst_0        
	//   41   81:ireturn         
	//   42   82:iconst_1        
	//   43   83:ireturn         
		return ai[0] - i >= 0 ? 0 : 1;
	//   44   84:aload_3         
	//   45   85:iconst_0        
	//   46   86:iaload          
	//   47   87:iload_1         
	//   48   88:isub            
	//   49   89:ifge            94
	//   50   92:iconst_1        
	//   51   93:ireturn         
	//   52   94:iconst_0        
	//   53   95:ireturn         
	}

	private void showMenu(MenuBuilder menubuilder)
	{
		Object obj2 = ((Object) (LayoutInflater.from(mContext)));
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Context mContext>
	//    2    4:invokestatic    #313 <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    7:astore          9
		Object obj = ((Object) (new MenuAdapter(menubuilder, ((LayoutInflater) (obj2)), mOverflowOnly)));
	//    4    9:new             #260 <Class MenuAdapter>
	//    5   12:dup             
	//    6   13:aload_1         
	//    7   14:aload           9
	//    8   16:aload_0         
	//    9   17:getfield        #110 <Field boolean mOverflowOnly>
	//   10   20:invokespecial   #316 <Method void MenuAdapter(MenuBuilder, LayoutInflater, boolean)>
	//   11   23:astore          6
		if(!isShowing() && mForceShowIcon)
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #319 <Method boolean isShowing()>
	//*  14   29:ifne            48
	//*  15   32:aload_0         
	//*  16   33:getfield        #112 <Field boolean mForceShowIcon>
	//*  17   36:ifeq            48
			((MenuAdapter) (obj)).setForceShowIcon(true);
	//   18   39:aload           6
	//   19   41:iconst_1        
	//   20   42:invokevirtual   #322 <Method void MenuAdapter.setForceShowIcon(boolean)>
		else
	//*  21   45:goto            64
		if(isShowing())
	//*  22   48:aload_0         
	//*  23   49:invokevirtual   #319 <Method boolean isShowing()>
	//*  24   52:ifeq            64
			((MenuAdapter) (obj)).setForceShowIcon(MenuPopup.shouldPreserveIconSpacing(menubuilder));
	//   25   55:aload           6
	//   26   57:aload_1         
	//   27   58:invokestatic    #326 <Method boolean MenuPopup.shouldPreserveIconSpacing(MenuBuilder)>
	//   28   61:invokevirtual   #322 <Method void MenuAdapter.setForceShowIcon(boolean)>
		int l = measureIndividualMenuWidth(((android.widget.ListAdapter) (obj)), ((android.view.ViewGroup) (null)), mContext, mMenuMaxWidth);
	//   29   64:aload           6
	//   30   66:aconst_null     
	//   31   67:aload_0         
	//   32   68:getfield        #102 <Field Context mContext>
	//   33   71:aload_0         
	//   34   72:getfield        #152 <Field int mMenuMaxWidth>
	//   35   75:invokestatic    #330 <Method int measureIndividualMenuWidth(android.widget.ListAdapter, android.view.ViewGroup, Context, int)>
	//   36   78:istore          5
		MenuPopupWindow menupopupwindow = createPopupWindow();
	//   37   80:aload_0         
	//   38   81:invokespecial   #332 <Method MenuPopupWindow createPopupWindow()>
	//   39   84:astore          8
		menupopupwindow.setAdapter(((android.widget.ListAdapter) (obj)));
	//   40   86:aload           8
	//   41   88:aload           6
	//   42   90:invokevirtual   #336 <Method void MenuPopupWindow.setAdapter(android.widget.ListAdapter)>
		menupopupwindow.setContentWidth(l);
	//   43   93:aload           8
	//   44   95:iload           5
	//   45   97:invokevirtual   #339 <Method void MenuPopupWindow.setContentWidth(int)>
		menupopupwindow.setDropDownGravity(mDropDownGravity);
	//   46  100:aload           8
	//   47  102:aload_0         
	//   48  103:getfield        #100 <Field int mDropDownGravity>
	//   49  106:invokevirtual   #194 <Method void MenuPopupWindow.setDropDownGravity(int)>
		Object obj1;
		if(mShowingMenus.size() > 0)
	//*  50  109:aload_0         
	//*  51  110:getfield        #85  <Field List mShowingMenus>
	//*  52  113:invokeinterface #208 <Method int List.size()>
	//*  53  118:ifle            158
		{
			obj = ((Object) ((CascadingMenuInfo)mShowingMenus.get(mShowingMenus.size() - 1)));
	//   54  121:aload_0         
	//   55  122:getfield        #85  <Field List mShowingMenus>
	//   56  125:aload_0         
	//   57  126:getfield        #85  <Field List mShowingMenus>
	//   58  129:invokeinterface #208 <Method int List.size()>
	//   59  134:iconst_1        
	//   60  135:isub            
	//   61  136:invokeinterface #212 <Method Object List.get(int)>
	//   62  141:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   63  144:astore          6
			obj1 = ((Object) (findParentViewForSubmenu(((CascadingMenuInfo) (obj)), menubuilder)));
	//   64  146:aload_0         
	//   65  147:aload           6
	//   66  149:aload_1         
	//   67  150:invokespecial   #341 <Method View findParentViewForSubmenu(CascadingMenuPopup$CascadingMenuInfo, MenuBuilder)>
	//   68  153:astore          7
		} else
	//*  69  155:goto            165
		{
			obj = null;
	//   70  158:aconst_null     
	//   71  159:astore          6
			obj1 = obj;
	//   72  161:aload           6
	//   73  163:astore          7
		}
		if(obj1 != null)
	//*  74  165:aload           7
	//*  75  167:ifnull          395
		{
			menupopupwindow.setTouchModal(false);
	//   76  170:aload           8
	//   77  172:iconst_0        
	//   78  173:invokevirtual   #344 <Method void MenuPopupWindow.setTouchModal(boolean)>
			menupopupwindow.setEnterTransition(((Object) (null)));
	//   79  176:aload           8
	//   80  178:aconst_null     
	//   81  179:invokevirtual   #348 <Method void MenuPopupWindow.setEnterTransition(Object)>
			int j = getNextMenuPosition(l);
	//   82  182:aload_0         
	//   83  183:iload           5
	//   84  185:invokespecial   #350 <Method int getNextMenuPosition(int)>
	//   85  188:istore_3        
			int i;
			if(j == 1)
	//*  86  189:iload_3         
	//*  87  190:iconst_1        
	//*  88  191:icmpne          199
				i = 1;
	//   89  194:iconst_1        
	//   90  195:istore_2        
			else
	//*  91  196:goto            201
				i = 0;
	//   92  199:iconst_0        
	//   93  200:istore_2        
			mLastPosition = j;
	//   94  201:aload_0         
	//   95  202:iload_3         
	//   96  203:putfield        #118 <Field int mLastPosition>
			int k;
			if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  97  206:getstatic       #355 <Field int android.os.Build$VERSION.SDK_INT>
	//*  98  209:bipush          26
	//*  99  211:icmplt          229
			{
				menupopupwindow.setAnchorView(((View) (obj1)));
	//  100  214:aload           8
	//  101  216:aload           7
	//  102  218:invokevirtual   #190 <Method void MenuPopupWindow.setAnchorView(View)>
				j = 0;
	//  103  221:iconst_0        
	//  104  222:istore_3        
				k = j;
	//  105  223:iload_3         
	//  106  224:istore          4
			} else
	//* 107  226:goto            317
			{
				int ai[] = new int[2];
	//  108  229:iconst_2        
	//  109  230:newarray        int[]
	//  110  232:astore          10
				mAnchorView.getLocationOnScreen(ai);
	//  111  234:aload_0         
	//  112  235:getfield        #104 <Field View mAnchorView>
	//  113  238:aload           10
	//  114  240:invokevirtual   #356 <Method void View.getLocationOnScreen(int[])>
				int ai1[] = new int[2];
	//  115  243:iconst_2        
	//  116  244:newarray        int[]
	//  117  246:astore          11
				((View) (obj1)).getLocationOnScreen(ai1);
	//  118  248:aload           7
	//  119  250:aload           11
	//  120  252:invokevirtual   #356 <Method void View.getLocationOnScreen(int[])>
				if((mDropDownGravity & 7) == 5)
	//* 121  255:aload_0         
	//* 122  256:getfield        #100 <Field int mDropDownGravity>
	//* 123  259:bipush          7
	//* 124  261:iand            
	//* 125  262:iconst_5        
	//* 126  263:icmpne          296
				{
					ai[0] = ai[0] + mAnchorView.getWidth();
	//  127  266:aload           10
	//  128  268:iconst_0        
	//  129  269:aload           10
	//  130  271:iconst_0        
	//  131  272:iaload          
	//  132  273:aload_0         
	//  133  274:getfield        #104 <Field View mAnchorView>
	//  134  277:invokevirtual   #357 <Method int View.getWidth()>
	//  135  280:iadd            
	//  136  281:iastore         
					ai1[0] = ai1[0] + ((View) (obj1)).getWidth();
	//  137  282:aload           11
	//  138  284:iconst_0        
	//  139  285:aload           11
	//  140  287:iconst_0        
	//  141  288:iaload          
	//  142  289:aload           7
	//  143  291:invokevirtual   #357 <Method int View.getWidth()>
	//  144  294:iadd            
	//  145  295:iastore         
				}
				k = ai1[0] - ai[0];
	//  146  296:aload           11
	//  147  298:iconst_0        
	//  148  299:iaload          
	//  149  300:aload           10
	//  150  302:iconst_0        
	//  151  303:iaload          
	//  152  304:isub            
	//  153  305:istore          4
				j = ai1[1] - ai[1];
	//  154  307:aload           11
	//  155  309:iconst_1        
	//  156  310:iaload          
	//  157  311:aload           10
	//  158  313:iconst_1        
	//  159  314:iaload          
	//  160  315:isub            
	//  161  316:istore_3        
			}
			if((mDropDownGravity & 5) == 5)
	//* 162  317:aload_0         
	//* 163  318:getfield        #100 <Field int mDropDownGravity>
	//* 164  321:iconst_5        
	//* 165  322:iand            
	//* 166  323:iconst_5        
	//* 167  324:icmpne          352
			{
				if(i != 0)
	//* 168  327:iload_2         
	//* 169  328:ifeq            340
					i = k + l;
	//  170  331:iload           4
	//  171  333:iload           5
	//  172  335:iadd            
	//  173  336:istore_2        
				else
	//* 174  337:goto            374
					i = k - ((View) (obj1)).getWidth();
	//  175  340:iload           4
	//  176  342:aload           7
	//  177  344:invokevirtual   #357 <Method int View.getWidth()>
	//  178  347:isub            
	//  179  348:istore_2        
			} else
	//* 180  349:goto            374
			if(i != 0)
	//* 181  352:iload_2         
	//* 182  353:ifeq            368
				i = k + ((View) (obj1)).getWidth();
	//  183  356:iload           4
	//  184  358:aload           7
	//  185  360:invokevirtual   #357 <Method int View.getWidth()>
	//  186  363:iadd            
	//  187  364:istore_2        
			else
	//* 188  365:goto            374
				i = k - l;
	//  189  368:iload           4
	//  190  370:iload           5
	//  191  372:isub            
	//  192  373:istore_2        
			menupopupwindow.setHorizontalOffset(i);
	//  193  374:aload           8
	//  194  376:iload_2         
	//  195  377:invokevirtual   #360 <Method void MenuPopupWindow.setHorizontalOffset(int)>
			menupopupwindow.setOverlapAnchor(true);
	//  196  380:aload           8
	//  197  382:iconst_1        
	//  198  383:invokevirtual   #363 <Method void MenuPopupWindow.setOverlapAnchor(boolean)>
			menupopupwindow.setVerticalOffset(j);
	//  199  386:aload           8
	//  200  388:iload_3         
	//  201  389:invokevirtual   #366 <Method void MenuPopupWindow.setVerticalOffset(int)>
		} else
	//* 202  392:goto            436
		{
			if(mHasXOffset)
	//* 203  395:aload_0         
	//* 204  396:getfield        #368 <Field boolean mHasXOffset>
	//* 205  399:ifeq            411
				menupopupwindow.setHorizontalOffset(mXOffset);
	//  206  402:aload           8
	//  207  404:aload_0         
	//  208  405:getfield        #370 <Field int mXOffset>
	//  209  408:invokevirtual   #360 <Method void MenuPopupWindow.setHorizontalOffset(int)>
			if(mHasYOffset)
	//* 210  411:aload_0         
	//* 211  412:getfield        #372 <Field boolean mHasYOffset>
	//* 212  415:ifeq            427
				menupopupwindow.setVerticalOffset(mYOffset);
	//  213  418:aload           8
	//  214  420:aload_0         
	//  215  421:getfield        #374 <Field int mYOffset>
	//  216  424:invokevirtual   #366 <Method void MenuPopupWindow.setVerticalOffset(int)>
			menupopupwindow.setEpicenterBounds(getEpicenterBounds());
	//  217  427:aload           8
	//  218  429:aload_0         
	//  219  430:invokevirtual   #378 <Method Rect getEpicenterBounds()>
	//  220  433:invokevirtual   #381 <Method void MenuPopupWindow.setEpicenterBounds(Rect)>
		}
		obj1 = ((Object) (new CascadingMenuInfo(menupopupwindow, menubuilder, mLastPosition)));
	//  221  436:new             #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//  222  439:dup             
	//  223  440:aload           8
	//  224  442:aload_1         
	//  225  443:aload_0         
	//  226  444:getfield        #118 <Field int mLastPosition>
	//  227  447:invokespecial   #384 <Method void CascadingMenuPopup$CascadingMenuInfo(MenuPopupWindow, MenuBuilder, int)>
	//  228  450:astore          7
		mShowingMenus.add(obj1);
	//  229  452:aload_0         
	//  230  453:getfield        #85  <Field List mShowingMenus>
	//  231  456:aload           7
	//  232  458:invokeinterface #388 <Method boolean List.add(Object)>
	//  233  463:pop             
		menupopupwindow.show();
	//  234  464:aload           8
	//  235  466:invokevirtual   #391 <Method void MenuPopupWindow.show()>
		obj1 = ((Object) (menupopupwindow.getListView()));
	//  236  469:aload           8
	//  237  471:invokevirtual   #392 <Method ListView MenuPopupWindow.getListView()>
	//  238  474:astore          7
		((ListView) (obj1)).setOnKeyListener(((android.view.View.OnKeyListener) (this)));
	//  239  476:aload           7
	//  240  478:aload_0         
	//  241  479:invokevirtual   #396 <Method void ListView.setOnKeyListener(android.view.View$OnKeyListener)>
		if(obj == null && mShowTitle && menubuilder.getHeaderTitle() != null)
	//* 242  482:aload           6
	//* 243  484:ifnonnull       559
	//* 244  487:aload_0         
	//* 245  488:getfield        #398 <Field boolean mShowTitle>
	//* 246  491:ifeq            559
	//* 247  494:aload_1         
	//* 248  495:invokevirtual   #402 <Method CharSequence MenuBuilder.getHeaderTitle()>
	//* 249  498:ifnull          559
		{
			FrameLayout framelayout = (FrameLayout)((LayoutInflater) (obj2)).inflate(android.support.v7.appcompat.R.layout.abc_popup_menu_header_item_layout, ((android.view.ViewGroup) (obj1)), false);
	//  250  501:aload           9
	//  251  503:getstatic       #407 <Field int android.support.v7.appcompat.R$layout.abc_popup_menu_header_item_layout>
	//  252  506:aload           7
	//  253  508:iconst_0        
	//  254  509:invokevirtual   #411 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//  255  512:checkcast       #413 <Class FrameLayout>
	//  256  515:astore          6
			obj2 = ((Object) ((TextView)framelayout.findViewById(0x1020016)));
	//  257  517:aload           6
	//  258  519:ldc2            #414 <Int 0x1020016>
	//  259  522:invokevirtual   #417 <Method View FrameLayout.findViewById(int)>
	//  260  525:checkcast       #419 <Class TextView>
	//  261  528:astore          9
			framelayout.setEnabled(false);
	//  262  530:aload           6
	//  263  532:iconst_0        
	//  264  533:invokevirtual   #422 <Method void FrameLayout.setEnabled(boolean)>
			((TextView) (obj2)).setText(menubuilder.getHeaderTitle());
	//  265  536:aload           9
	//  266  538:aload_1         
	//  267  539:invokevirtual   #402 <Method CharSequence MenuBuilder.getHeaderTitle()>
	//  268  542:invokevirtual   #426 <Method void TextView.setText(CharSequence)>
			((ListView) (obj1)).addHeaderView(((View) (framelayout)), ((Object) (null)), false);
	//  269  545:aload           7
	//  270  547:aload           6
	//  271  549:aconst_null     
	//  272  550:iconst_0        
	//  273  551:invokevirtual   #430 <Method void ListView.addHeaderView(View, Object, boolean)>
			menupopupwindow.show();
	//  274  554:aload           8
	//  275  556:invokevirtual   #391 <Method void MenuPopupWindow.show()>
		}
	//  276  559:return          
	}

	public void addMenu(MenuBuilder menubuilder)
	{
		menubuilder.addMenuPresenter(((MenuPresenter) (this)), mContext);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #102 <Field Context mContext>
	//    4    6:invokevirtual   #435 <Method void MenuBuilder.addMenuPresenter(MenuPresenter, Context)>
		if(isShowing())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #319 <Method boolean isShowing()>
	//*   7   13:ifeq            22
		{
			showMenu(menubuilder);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #437 <Method void showMenu(MenuBuilder)>
			return;
	//   11   21:return          
		} else
		{
			mPendingMenus.add(((Object) (menubuilder)));
	//   12   22:aload_0         
	//   13   23:getfield        #83  <Field List mPendingMenus>
	//   14   26:aload_1         
	//   15   27:invokeinterface #388 <Method boolean List.add(Object)>
	//   16   32:pop             
			return;
	//   17   33:return          
		}
	}

	protected boolean closeMenuOnSubMenuOpened()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void dismiss()
	{
		int i = mShowingMenus.size();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field List mShowingMenus>
	//    2    4:invokeinterface #208 <Method int List.size()>
	//    3    9:istore_1        
		if(i > 0)
	//*   4   10:iload_1         
	//*   5   11:ifle            67
		{
			CascadingMenuInfo acascadingmenuinfo[] = (CascadingMenuInfo[])mShowingMenus.toArray(((Object []) (new CascadingMenuInfo[i])));
	//    6   14:aload_0         
	//    7   15:getfield        #85  <Field List mShowingMenus>
	//    8   18:iload_1         
	//    9   19:anewarray       CascadingMenuInfo[]
	//   10   22:invokeinterface #443 <Method Object[] List.toArray(Object[])>
	//   11   27:checkcast       #445 <Class CascadingMenuPopup$CascadingMenuInfo[]>
	//   12   30:astore_2        
			for(i--; i >= 0; i--)
	//*  13   31:iload_1         
	//*  14   32:iconst_1        
	//*  15   33:isub            
	//*  16   34:istore_1        
	//*  17   35:iload_1         
	//*  18   36:iflt            67
			{
				CascadingMenuInfo cascadingmenuinfo = acascadingmenuinfo[i];
	//   19   39:aload_2         
	//   20   40:iload_1         
	//   21   41:aaload          
	//   22   42:astore_3        
				if(cascadingmenuinfo.window.isShowing())
	//*  23   43:aload_3         
	//*  24   44:getfield        #449 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//*  25   47:invokevirtual   #450 <Method boolean MenuPopupWindow.isShowing()>
	//*  26   50:ifeq            60
					cascadingmenuinfo.window.dismiss();
	//   27   53:aload_3         
	//   28   54:getfield        #449 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   29   57:invokevirtual   #452 <Method void MenuPopupWindow.dismiss()>
			}

	//   30   60:iload_1         
	//   31   61:iconst_1        
	//   32   62:isub            
	//   33   63:istore_1        
		}
	//*  34   64:goto            35
	//   35   67:return          
	}

	public boolean flagActionItems()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public ListView getListView()
	{
		if(mShowingMenus.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field List mShowingMenus>
	//*   2    4:invokeinterface #456 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            14
			return null;
	//    4   12:aconst_null     
	//    5   13:areturn         
		else
			return ((CascadingMenuInfo)mShowingMenus.get(mShowingMenus.size() - 1)).getListView();
	//    6   14:aload_0         
	//    7   15:getfield        #85  <Field List mShowingMenus>
	//    8   18:aload_0         
	//    9   19:getfield        #85  <Field List mShowingMenus>
	//   10   22:invokeinterface #208 <Method int List.size()>
	//   11   27:iconst_1        
	//   12   28:isub            
	//   13   29:invokeinterface #212 <Method Object List.get(int)>
	//   14   34:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   15   37:invokevirtual   #244 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   16   40:areturn         
	}

	public boolean isShowing()
	{
		int i = mShowingMenus.size();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field List mShowingMenus>
	//    2    4:invokeinterface #208 <Method int List.size()>
	//    3    9:istore_1        
		boolean flag1 = false;
	//    4   10:iconst_0        
	//    5   11:istore_3        
		boolean flag = flag1;
	//    6   12:iload_3         
	//    7   13:istore_2        
		if(i > 0)
	//*   8   14:iload_1         
	//*   9   15:ifle            44
		{
			flag = flag1;
	//   10   18:iload_3         
	//   11   19:istore_2        
			if(((CascadingMenuInfo)mShowingMenus.get(0)).window.isShowing())
	//*  12   20:aload_0         
	//*  13   21:getfield        #85  <Field List mShowingMenus>
	//*  14   24:iconst_0        
	//*  15   25:invokeinterface #212 <Method Object List.get(int)>
	//*  16   30:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//*  17   33:getfield        #449 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//*  18   36:invokevirtual   #450 <Method boolean MenuPopupWindow.isShowing()>
	//*  19   39:ifeq            44
				flag = true;
	//   20   42:iconst_1        
	//   21   43:istore_2        
		}
		return flag;
	//   22   44:iload_2         
	//   23   45:ireturn         
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		int i = findIndexOfAddedMenu(menubuilder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #460 <Method int findIndexOfAddedMenu(MenuBuilder)>
	//    3    5:istore_3        
		if(i < 0)
	//*   4    6:iload_3         
	//*   5    7:ifge            11
			return;
	//    6   10:return          
		int j = i + 1;
	//    7   11:iload_3         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:istore          4
		if(j < mShowingMenus.size())
	//*  11   16:iload           4
	//*  12   18:aload_0         
	//*  13   19:getfield        #85  <Field List mShowingMenus>
	//*  14   22:invokeinterface #208 <Method int List.size()>
	//*  15   27:icmpge          51
			((CascadingMenuInfo)mShowingMenus.get(j)).menu.close(false);
	//   16   30:aload_0         
	//   17   31:getfield        #85  <Field List mShowingMenus>
	//   18   34:iload           4
	//   19   36:invokeinterface #212 <Method Object List.get(int)>
	//   20   41:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   21   44:getfield        #216 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//   22   47:iconst_0        
	//   23   48:invokevirtual   #463 <Method void MenuBuilder.close(boolean)>
		CascadingMenuInfo cascadingmenuinfo = (CascadingMenuInfo)mShowingMenus.remove(i);
	//   24   51:aload_0         
	//   25   52:getfield        #85  <Field List mShowingMenus>
	//   26   55:iload_3         
	//   27   56:invokeinterface #466 <Method Object List.remove(int)>
	//   28   61:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   29   64:astore          5
		cascadingmenuinfo.menu.removeMenuPresenter(((MenuPresenter) (this)));
	//   30   66:aload           5
	//   31   68:getfield        #216 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//   32   71:aload_0         
	//   33   72:invokevirtual   #470 <Method void MenuBuilder.removeMenuPresenter(MenuPresenter)>
		if(mShouldCloseImmediately)
	//*  34   75:aload_0         
	//*  35   76:getfield        #472 <Field boolean mShouldCloseImmediately>
	//*  36   79:ifeq            100
		{
			cascadingmenuinfo.window.setExitTransition(((Object) (null)));
	//   37   82:aload           5
	//   38   84:getfield        #449 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   39   87:aconst_null     
	//   40   88:invokevirtual   #475 <Method void MenuPopupWindow.setExitTransition(Object)>
			cascadingmenuinfo.window.setAnimationStyle(0);
	//   41   91:aload           5
	//   42   93:getfield        #449 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   43   96:iconst_0        
	//   44   97:invokevirtual   #478 <Method void MenuPopupWindow.setAnimationStyle(int)>
		}
		cascadingmenuinfo.window.dismiss();
	//   45  100:aload           5
	//   46  102:getfield        #449 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   47  105:invokevirtual   #452 <Method void MenuPopupWindow.dismiss()>
		i = mShowingMenus.size();
	//   48  108:aload_0         
	//   49  109:getfield        #85  <Field List mShowingMenus>
	//   50  112:invokeinterface #208 <Method int List.size()>
	//   51  117:istore_3        
		if(i > 0)
	//*  52  118:iload_3         
	//*  53  119:ifle            147
			mLastPosition = ((CascadingMenuInfo)mShowingMenus.get(i - 1)).position;
	//   54  122:aload_0         
	//   55  123:aload_0         
	//   56  124:getfield        #85  <Field List mShowingMenus>
	//   57  127:iload_3         
	//   58  128:iconst_1        
	//   59  129:isub            
	//   60  130:invokeinterface #212 <Method Object List.get(int)>
	//   61  135:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   62  138:getfield        #481 <Field int CascadingMenuPopup$CascadingMenuInfo.position>
	//   63  141:putfield        #118 <Field int mLastPosition>
		else
	//*  64  144:goto            155
			mLastPosition = getInitialMenuPosition();
	//   65  147:aload_0         
	//   66  148:aload_0         
	//   67  149:invokespecial   #116 <Method int getInitialMenuPosition()>
	//   68  152:putfield        #118 <Field int mLastPosition>
		if(i == 0)
	//*  69  155:iload_3         
	//*  70  156:ifne            235
		{
			dismiss();
	//   71  159:aload_0         
	//   72  160:invokevirtual   #482 <Method void dismiss()>
			if(mPresenterCallback != null)
	//*  73  163:aload_0         
	//*  74  164:getfield        #484 <Field MenuPresenter$Callback mPresenterCallback>
	//*  75  167:ifnull          181
				mPresenterCallback.onCloseMenu(menubuilder, true);
	//   76  170:aload_0         
	//   77  171:getfield        #484 <Field MenuPresenter$Callback mPresenterCallback>
	//   78  174:aload_1         
	//   79  175:iconst_1        
	//   80  176:invokeinterface #488 <Method void MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
			if(mTreeObserver != null)
	//*  81  181:aload_0         
	//*  82  182:getfield        #163 <Field ViewTreeObserver mTreeObserver>
	//*  83  185:ifnull          214
			{
				if(mTreeObserver.isAlive())
	//*  84  188:aload_0         
	//*  85  189:getfield        #163 <Field ViewTreeObserver mTreeObserver>
	//*  86  192:invokevirtual   #493 <Method boolean ViewTreeObserver.isAlive()>
	//*  87  195:ifeq            209
					mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
	//   88  198:aload_0         
	//   89  199:getfield        #163 <Field ViewTreeObserver mTreeObserver>
	//   90  202:aload_0         
	//   91  203:getfield        #90  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//   92  206:invokevirtual   #497 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				mTreeObserver = null;
	//   93  209:aload_0         
	//   94  210:aconst_null     
	//   95  211:putfield        #163 <Field ViewTreeObserver mTreeObserver>
			}
			mShownAnchorView.removeOnAttachStateChangeListener(mAttachStateChangeListener);
	//   96  214:aload_0         
	//   97  215:getfield        #293 <Field View mShownAnchorView>
	//   98  218:aload_0         
	//   99  219:getfield        #93  <Field android.view.View$OnAttachStateChangeListener mAttachStateChangeListener>
	//  100  222:invokevirtual   #501 <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
			mOnDismissListener.onDismiss();
	//  101  225:aload_0         
	//  102  226:getfield        #503 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//  103  229:invokeinterface #506 <Method void android.widget.PopupWindow$OnDismissListener.onDismiss()>
			return;
	//  104  234:return          
		}
		if(flag)
	//* 105  235:iload_2         
	//* 106  236:ifeq            259
			((CascadingMenuInfo)mShowingMenus.get(0)).menu.close(false);
	//  107  239:aload_0         
	//  108  240:getfield        #85  <Field List mShowingMenus>
	//  109  243:iconst_0        
	//  110  244:invokeinterface #212 <Method Object List.get(int)>
	//  111  249:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//  112  252:getfield        #216 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//  113  255:iconst_0        
	//  114  256:invokevirtual   #463 <Method void MenuBuilder.close(boolean)>
	//  115  259:return          
	}

	public void onDismiss()
	{
		CascadingMenuInfo cascadingmenuinfo;
label0:
		{
			int j = mShowingMenus.size();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field List mShowingMenus>
	//    2    4:invokeinterface #208 <Method int List.size()>
	//    3    9:istore_2        
			for(int i = 0; i < j; i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:iload_2         
	//*   8   14:icmpge          51
			{
				cascadingmenuinfo = (CascadingMenuInfo)mShowingMenus.get(i);
	//    9   17:aload_0         
	//   10   18:getfield        #85  <Field List mShowingMenus>
	//   11   21:iload_1         
	//   12   22:invokeinterface #212 <Method Object List.get(int)>
	//   13   27:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   14   30:astore_3        
				if(!cascadingmenuinfo.window.isShowing())
	//*  15   31:aload_3         
	//*  16   32:getfield        #449 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//*  17   35:invokevirtual   #450 <Method boolean MenuPopupWindow.isShowing()>
	//*  18   38:ifne            44
					break label0;
	//   19   41:goto            53
			}

	//   20   44:iload_1         
	//   21   45:iconst_1        
	//   22   46:iadd            
	//   23   47:istore_1        
	//*  24   48:goto            12
			cascadingmenuinfo = null;
	//   25   51:aconst_null     
	//   26   52:astore_3        
		}
		if(cascadingmenuinfo != null)
	//*  27   53:aload_3         
	//*  28   54:ifnull          65
			cascadingmenuinfo.menu.close(false);
	//   29   57:aload_3         
	//   30   58:getfield        #216 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//   31   61:iconst_0        
	//   32   62:invokevirtual   #463 <Method void MenuBuilder.close(boolean)>
	//   33   65:return          
	}

	public boolean onKey(View view, int i, KeyEvent keyevent)
	{
		if(keyevent.getAction() == 1 && i == 82)
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #513 <Method int KeyEvent.getAction()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          20
	//*   4    8:iload_2         
	//*   5    9:bipush          82
	//*   6   11:icmpne          20
		{
			dismiss();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #482 <Method void dismiss()>
			return true;
	//    9   18:iconst_1        
	//   10   19:ireturn         
		} else
		{
			return false;
	//   11   20:iconst_0        
	//   12   21:ireturn         
		}
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
	//    0    0:return          
	}

	public Parcelable onSaveInstanceState()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
	{
		for(Iterator iterator = mShowingMenus.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field List mShowingMenus>
	//*   2    4:invokeinterface #523 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #528 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            47
		{
			CascadingMenuInfo cascadingmenuinfo = (CascadingMenuInfo)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #532 <Method Object Iterator.next()>
	//    9   25:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   10   28:astore_3        
			if(submenubuilder == cascadingmenuinfo.menu)
	//*  11   29:aload_1         
	//*  12   30:aload_3         
	//*  13   31:getfield        #216 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//*  14   34:if_acmpne       10
			{
				cascadingmenuinfo.getListView().requestFocus();
	//   15   37:aload_3         
	//   16   38:invokevirtual   #244 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   17   41:invokevirtual   #535 <Method boolean ListView.requestFocus()>
	//   18   44:pop             
				return true;
	//   19   45:iconst_1        
	//   20   46:ireturn         
			}
		}

		if(submenubuilder.hasVisibleItems())
	//*  21   47:aload_1         
	//*  22   48:invokevirtual   #540 <Method boolean SubMenuBuilder.hasVisibleItems()>
	//*  23   51:ifeq            79
		{
			addMenu(((MenuBuilder) (submenubuilder)));
	//   24   54:aload_0         
	//   25   55:aload_1         
	//   26   56:invokevirtual   #542 <Method void addMenu(MenuBuilder)>
			if(mPresenterCallback != null)
	//*  27   59:aload_0         
	//*  28   60:getfield        #484 <Field MenuPresenter$Callback mPresenterCallback>
	//*  29   63:ifnull          77
				mPresenterCallback.onOpenSubMenu(((MenuBuilder) (submenubuilder)));
	//   30   66:aload_0         
	//   31   67:getfield        #484 <Field MenuPresenter$Callback mPresenterCallback>
	//   32   70:aload_1         
	//   33   71:invokeinterface #545 <Method boolean MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
	//   34   76:pop             
			return true;
	//   35   77:iconst_1        
	//   36   78:ireturn         
		} else
		{
			return false;
	//   37   79:iconst_0        
	//   38   80:ireturn         
		}
	}

	public void setAnchorView(View view)
	{
		if(mAnchorView != view)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field View mAnchorView>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       31
		{
			mAnchorView = view;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #104 <Field View mAnchorView>
			mDropDownGravity = GravityCompat.getAbsoluteGravity(mRawDropDownGravity, ViewCompat.getLayoutDirection(mAnchorView));
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #98  <Field int mRawDropDownGravity>
	//   10   18:aload_0         
	//   11   19:getfield        #104 <Field View mAnchorView>
	//   12   22:invokestatic    #283 <Method int ViewCompat.getLayoutDirection(View)>
	//   13   25:invokestatic    #550 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   14   28:putfield        #100 <Field int mDropDownGravity>
		}
	//   15   31:return          
	}

	public void setCallback(MenuPresenter.Callback callback)
	{
		mPresenterCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #484 <Field MenuPresenter$Callback mPresenterCallback>
	//    3    5:return          
	}

	public void setForceShowIcon(boolean flag)
	{
		mForceShowIcon = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #112 <Field boolean mForceShowIcon>
	//    3    5:return          
	}

	public void setGravity(int i)
	{
		if(mRawDropDownGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field int mRawDropDownGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          28
		{
			mRawDropDownGravity = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #98  <Field int mRawDropDownGravity>
			mDropDownGravity = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(mAnchorView));
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #104 <Field View mAnchorView>
	//   11   19:invokestatic    #283 <Method int ViewCompat.getLayoutDirection(View)>
	//   12   22:invokestatic    #550 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   13   25:putfield        #100 <Field int mDropDownGravity>
		}
	//   14   28:return          
	}

	public void setHorizontalOffset(int i)
	{
		mHasXOffset = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #368 <Field boolean mHasXOffset>
		mXOffset = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #370 <Field int mXOffset>
	//    6   10:return          
	}

	public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
	{
		mOnDismissListener = ondismisslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #503 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//    3    5:return          
	}

	public void setShowTitle(boolean flag)
	{
		mShowTitle = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #398 <Field boolean mShowTitle>
	//    3    5:return          
	}

	public void setVerticalOffset(int i)
	{
		mHasYOffset = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #372 <Field boolean mHasYOffset>
		mYOffset = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #374 <Field int mYOffset>
	//    6   10:return          
	}

	public void show()
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #319 <Method boolean isShowing()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		for(Iterator iterator = mPendingMenus.iterator(); iterator.hasNext(); showMenu((MenuBuilder)iterator.next()));
	//    4    8:aload_0         
	//    5    9:getfield        #83  <Field List mPendingMenus>
	//    6   12:invokeinterface #523 <Method Iterator List.iterator()>
	//    7   17:astore_2        
	//    8   18:aload_2         
	//    9   19:invokeinterface #528 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            43
	//   11   27:aload_0         
	//   12   28:aload_2         
	//   13   29:invokeinterface #532 <Method Object Iterator.next()>
	//   14   34:checkcast       #220 <Class MenuBuilder>
	//   15   37:invokespecial   #437 <Method void showMenu(MenuBuilder)>
	//*  16   40:goto            18
		mPendingMenus.clear();
	//   17   43:aload_0         
	//   18   44:getfield        #83  <Field List mPendingMenus>
	//   19   47:invokeinterface #557 <Method void List.clear()>
		mShownAnchorView = mAnchorView;
	//   20   52:aload_0         
	//   21   53:aload_0         
	//   22   54:getfield        #104 <Field View mAnchorView>
	//   23   57:putfield        #293 <Field View mShownAnchorView>
		if(mShownAnchorView != null)
	//*  24   60:aload_0         
	//*  25   61:getfield        #293 <Field View mShownAnchorView>
	//*  26   64:ifnull          118
		{
			boolean flag;
			if(mTreeObserver == null)
	//*  27   67:aload_0         
	//*  28   68:getfield        #163 <Field ViewTreeObserver mTreeObserver>
	//*  29   71:ifnonnull       79
				flag = true;
	//   30   74:iconst_1        
	//   31   75:istore_1        
			else
	//*  32   76:goto            81
				flag = false;
	//   33   79:iconst_0        
	//   34   80:istore_1        
			mTreeObserver = mShownAnchorView.getViewTreeObserver();
	//   35   81:aload_0         
	//   36   82:aload_0         
	//   37   83:getfield        #293 <Field View mShownAnchorView>
	//   38   86:invokevirtual   #561 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   39   89:putfield        #163 <Field ViewTreeObserver mTreeObserver>
			if(flag)
	//*  40   92:iload_1         
	//*  41   93:ifeq            107
				mTreeObserver.addOnGlobalLayoutListener(mGlobalLayoutListener);
	//   42   96:aload_0         
	//   43   97:getfield        #163 <Field ViewTreeObserver mTreeObserver>
	//   44  100:aload_0         
	//   45  101:getfield        #90  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//   46  104:invokevirtual   #564 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			mShownAnchorView.addOnAttachStateChangeListener(mAttachStateChangeListener);
	//   47  107:aload_0         
	//   48  108:getfield        #293 <Field View mShownAnchorView>
	//   49  111:aload_0         
	//   50  112:getfield        #93  <Field android.view.View$OnAttachStateChangeListener mAttachStateChangeListener>
	//   51  115:invokevirtual   #567 <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		}
	//   52  118:return          
	}

	public void updateMenuView(boolean flag)
	{
		for(Iterator iterator = mShowingMenus.iterator(); iterator.hasNext(); toMenuAdapter(((CascadingMenuInfo)iterator.next()).getListView().getAdapter()).notifyDataSetChanged());
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field List mShowingMenus>
	//    2    4:invokeinterface #523 <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #528 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            43
	//    7   19:aload_2         
	//    8   20:invokeinterface #532 <Method Object Iterator.next()>
	//    9   25:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   10   28:invokevirtual   #244 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   11   31:invokevirtual   #250 <Method android.widget.ListAdapter ListView.getAdapter()>
	//   12   34:invokestatic    #572 <Method MenuAdapter toMenuAdapter(android.widget.ListAdapter)>
	//   13   37:invokevirtual   #575 <Method void MenuAdapter.notifyDataSetChanged()>
	//*  14   40:goto            10
	//   15   43:return          
	}

	static final int HORIZ_POSITION_LEFT = 0;
	static final int HORIZ_POSITION_RIGHT = 1;
	static final int SUBMENU_TIMEOUT_MS = 200;
	private View mAnchorView;
	private final android.view.View.OnAttachStateChangeListener mAttachStateChangeListener = new android.view.View.OnAttachStateChangeListener() {

		public void onViewAttachedToWindow(View view1)
		{
		//    0    0:return          
		}

		public void onViewDetachedFromWindow(View view1)
		{
			if(mTreeObserver != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field CascadingMenuPopup this$0>
		//*   2    4:invokestatic    #25  <Method ViewTreeObserver CascadingMenuPopup.access$000(CascadingMenuPopup)>
		//*   3    7:ifnull          52
			{
				if(!mTreeObserver.isAlive())
		//*   4   10:aload_0         
		//*   5   11:getfield        #14  <Field CascadingMenuPopup this$0>
		//*   6   14:invokestatic    #25  <Method ViewTreeObserver CascadingMenuPopup.access$000(CascadingMenuPopup)>
		//*   7   17:invokevirtual   #31  <Method boolean ViewTreeObserver.isAlive()>
		//*   8   20:ifne            35
					mTreeObserver = view1.getViewTreeObserver();
		//    9   23:aload_0         
		//   10   24:getfield        #14  <Field CascadingMenuPopup this$0>
		//   11   27:aload_1         
		//   12   28:invokevirtual   #37  <Method ViewTreeObserver View.getViewTreeObserver()>
		//   13   31:invokestatic    #41  <Method ViewTreeObserver CascadingMenuPopup.access$002(CascadingMenuPopup, ViewTreeObserver)>
		//   14   34:pop             
				mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
		//   15   35:aload_0         
		//   16   36:getfield        #14  <Field CascadingMenuPopup this$0>
		//   17   39:invokestatic    #25  <Method ViewTreeObserver CascadingMenuPopup.access$000(CascadingMenuPopup)>
		//   18   42:aload_0         
		//   19   43:getfield        #14  <Field CascadingMenuPopup this$0>
		//   20   46:invokestatic    #45  <Method android.view.ViewTreeObserver$OnGlobalLayoutListener CascadingMenuPopup.access$100(CascadingMenuPopup)>
		//   21   49:invokevirtual   #49  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			}
			view1.removeOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
		//   22   52:aload_1         
		//   23   53:aload_0         
		//   24   54:invokevirtual   #53  <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		//   25   57:return          
		}

		final CascadingMenuPopup this$0;

			
			{
				this$0 = CascadingMenuPopup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field CascadingMenuPopup this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final Context mContext;
	private int mDropDownGravity;
	private boolean mForceShowIcon;
	private final android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

		public void onGlobalLayout()
		{
			if(isShowing() && mShowingMenus.size() > 0 && !((CascadingMenuInfo)mShowingMenus.get(0)).window.isModal())
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field CascadingMenuPopup this$0>
		//*   2    4:invokevirtual   #23  <Method boolean CascadingMenuPopup.isShowing()>
		//*   3    7:ifeq            119
		//*   4   10:aload_0         
		//*   5   11:getfield        #14  <Field CascadingMenuPopup this$0>
		//*   6   14:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
		//*   7   17:invokeinterface #33  <Method int List.size()>
		//*   8   22:ifle            119
		//*   9   25:aload_0         
		//*  10   26:getfield        #14  <Field CascadingMenuPopup this$0>
		//*  11   29:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
		//*  12   32:iconst_0        
		//*  13   33:invokeinterface #37  <Method Object List.get(int)>
		//*  14   38:checkcast       #39  <Class CascadingMenuPopup$CascadingMenuInfo>
		//*  15   41:getfield        #43  <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
		//*  16   44:invokevirtual   #48  <Method boolean MenuPopupWindow.isModal()>
		//*  17   47:ifne            119
			{
				View view1 = mShownAnchorView;
		//   18   50:aload_0         
		//   19   51:getfield        #14  <Field CascadingMenuPopup this$0>
		//   20   54:getfield        #52  <Field View CascadingMenuPopup.mShownAnchorView>
		//   21   57:astore_1        
				if(view1 != null && view1.isShown())
		//*  22   58:aload_1         
		//*  23   59:ifnull          112
		//*  24   62:aload_1         
		//*  25   63:invokevirtual   #57  <Method boolean View.isShown()>
		//*  26   66:ifne            72
		//*  27   69:goto            112
				{
					for(Iterator iterator = mShowingMenus.iterator(); iterator.hasNext(); ((CascadingMenuInfo)iterator.next()).window.show());
		//   28   72:aload_0         
		//   29   73:getfield        #14  <Field CascadingMenuPopup this$0>
		//   30   76:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
		//   31   79:invokeinterface #61  <Method Iterator List.iterator()>
		//   32   84:astore_1        
		//   33   85:aload_1         
		//   34   86:invokeinterface #66  <Method boolean Iterator.hasNext()>
		//   35   91:ifeq            119
		//   36   94:aload_1         
		//   37   95:invokeinterface #70  <Method Object Iterator.next()>
		//   38  100:checkcast       #39  <Class CascadingMenuPopup$CascadingMenuInfo>
		//   39  103:getfield        #43  <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
		//   40  106:invokevirtual   #73  <Method void MenuPopupWindow.show()>
				} else
		//*  41  109:goto            85
				{
					dismiss();
		//   42  112:aload_0         
		//   43  113:getfield        #14  <Field CascadingMenuPopup this$0>
		//   44  116:invokevirtual   #76  <Method void CascadingMenuPopup.dismiss()>
				}
			}
		//   45  119:return          
		}

		final CascadingMenuPopup this$0;

			
			{
				this$0 = CascadingMenuPopup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field CascadingMenuPopup this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private boolean mHasXOffset;
	private boolean mHasYOffset;
	private int mLastPosition;
	private final MenuItemHoverListener mMenuItemHoverListener = new MenuItemHoverListener() {

		public void onItemHoverEnter(MenuBuilder menubuilder, final MenuItem item)
		{
			int k;
			final CascadingMenuInfo nextInfo;
label0:
			{
				Handler handler = mSubMenuHoverHandler;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field CascadingMenuPopup this$0>
		//    2    4:getfield        #27  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
		//    3    7:astore          8
				nextInfo = null;
		//    4    9:aconst_null     
		//    5   10:astore          7
				handler.removeCallbacksAndMessages(((Object) (null)));
		//    6   12:aload           8
		//    7   14:aconst_null     
		//    8   15:invokevirtual   #33  <Method void Handler.removeCallbacksAndMessages(Object)>
				int l = mShowingMenus.size();
		//    9   18:aload_0         
		//   10   19:getfield        #16  <Field CascadingMenuPopup this$0>
		//   11   22:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//   12   25:invokeinterface #43  <Method int List.size()>
		//   13   30:istore          4
				for(k = 0; k < l; k++)
		//*  14   32:iconst_0        
		//*  15   33:istore_3        
		//*  16   34:iload_3         
		//*  17   35:iload           4
		//*  18   37:icmpge          73
					if(menubuilder == ((CascadingMenuInfo)mShowingMenus.get(k)).menu)
		//*  19   40:aload_1         
		//*  20   41:aload_0         
		//*  21   42:getfield        #16  <Field CascadingMenuPopup this$0>
		//*  22   45:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//*  23   48:iload_3         
		//*  24   49:invokeinterface #47  <Method Object List.get(int)>
		//*  25   54:checkcast       #49  <Class CascadingMenuPopup$CascadingMenuInfo>
		//*  26   57:getfield        #53  <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
		//*  27   60:if_acmpne       66
						break label0;
		//   28   63:goto            75

		//   29   66:iload_3         
		//   30   67:iconst_1        
		//   31   68:iadd            
		//   32   69:istore_3        
		//*  33   70:goto            34
				k = -1;
		//   34   73:iconst_m1       
		//   35   74:istore_3        
			}
			if(k == -1)
		//*  36   75:iload_3         
		//*  37   76:iconst_m1       
		//*  38   77:icmpne          81
				return;
		//   39   80:return          
			k++;
		//   40   81:iload_3         
		//   41   82:iconst_1        
		//   42   83:iadd            
		//   43   84:istore_3        
			if(k < mShowingMenus.size())
		//*  44   85:iload_3         
		//*  45   86:aload_0         
		//*  46   87:getfield        #16  <Field CascadingMenuPopup this$0>
		//*  47   90:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//*  48   93:invokeinterface #43  <Method int List.size()>
		//*  49   98:icmpge          119
				nextInfo = (CascadingMenuInfo)mShowingMenus.get(k);
		//   50  101:aload_0         
		//   51  102:getfield        #16  <Field CascadingMenuPopup this$0>
		//   52  105:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//   53  108:iload_3         
		//   54  109:invokeinterface #47  <Method Object List.get(int)>
		//   55  114:checkcast       #49  <Class CascadingMenuPopup$CascadingMenuInfo>
		//   56  117:astore          7
			item = ((MenuItem) (((_cls1) (menubuilder)). new Runnable() {

				public void run()
				{
					if(nextInfo != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #25  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
				//*   2    4:ifnull          40
					{
						mShouldCloseImmediately = true;
				//    3    7:aload_0         
				//    4    8:getfield        #23  <Field CascadingMenuPopup$3 this$1>
				//    5   11:getfield        #38  <Field CascadingMenuPopup CascadingMenuPopup$3.this$0>
				//    6   14:iconst_1        
				//    7   15:putfield        #44  <Field boolean CascadingMenuPopup.mShouldCloseImmediately>
						nextInfo.menu.close(false);
				//    8   18:aload_0         
				//    9   19:getfield        #25  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
				//   10   22:getfield        #49  <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
				//   11   25:iconst_0        
				//   12   26:invokevirtual   #55  <Method void MenuBuilder.close(boolean)>
						mShouldCloseImmediately = false;
				//   13   29:aload_0         
				//   14   30:getfield        #23  <Field CascadingMenuPopup$3 this$1>
				//   15   33:getfield        #38  <Field CascadingMenuPopup CascadingMenuPopup$3.this$0>
				//   16   36:iconst_0        
				//   17   37:putfield        #44  <Field boolean CascadingMenuPopup.mShouldCloseImmediately>
					}
					if(item.isEnabled() && item.hasSubMenu())
				//*  18   40:aload_0         
				//*  19   41:getfield        #27  <Field MenuItem val$item>
				//*  20   44:invokeinterface #61  <Method boolean MenuItem.isEnabled()>
				//*  21   49:ifeq            77
				//*  22   52:aload_0         
				//*  23   53:getfield        #27  <Field MenuItem val$item>
				//*  24   56:invokeinterface #64  <Method boolean MenuItem.hasSubMenu()>
				//*  25   61:ifeq            77
						menu.performItemAction(item, 4);
				//   26   64:aload_0         
				//   27   65:getfield        #29  <Field MenuBuilder val$menu>
				//   28   68:aload_0         
				//   29   69:getfield        #27  <Field MenuItem val$item>
				//   30   72:iconst_4        
				//   31   73:invokevirtual   #68  <Method boolean MenuBuilder.performItemAction(MenuItem, int)>
				//   32   76:pop             
				//   33   77:return          
				}

				final _cls3 this$1;
				final MenuItem val$item;
				final MenuBuilder val$menu;
				final CascadingMenuInfo val$nextInfo;

			
			{
				this$1 = final__pcls3;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CascadingMenuPopup$3 this$1>
				nextInfo = cascadingmenuinfo;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
				item = menuitem;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field MenuItem val$item>
				menu = MenuBuilder.this;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field MenuBuilder val$menu>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
));
		//   57  119:new             #10  <Class CascadingMenuPopup$3$1>
		//   58  122:dup             
		//   59  123:aload_0         
		//   60  124:aload           7
		//   61  126:aload_2         
		//   62  127:aload_1         
		//   63  128:invokespecial   #56  <Method void CascadingMenuPopup$3$1(CascadingMenuPopup$3, CascadingMenuPopup$CascadingMenuInfo, MenuItem, MenuBuilder)>
		//   64  131:astore_2        
			long l1 = SystemClock.uptimeMillis();
		//   65  132:invokestatic    #62  <Method long SystemClock.uptimeMillis()>
		//   66  135:lstore          5
			mSubMenuHoverHandler.postAtTime(((Runnable) (item)), ((Object) (menubuilder)), l1 + 200L);
		//   67  137:aload_0         
		//   68  138:getfield        #16  <Field CascadingMenuPopup this$0>
		//   69  141:getfield        #27  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
		//   70  144:aload_2         
		//   71  145:aload_1         
		//   72  146:lload           5
		//   73  148:ldc2w           #63  <Long 200L>
		//   74  151:ladd            
		//   75  152:invokevirtual   #68  <Method boolean Handler.postAtTime(Runnable, Object, long)>
		//   76  155:pop             
		//   77  156:return          
		}

		public void onItemHoverExit(MenuBuilder menubuilder, MenuItem menuitem)
		{
			mSubMenuHoverHandler.removeCallbacksAndMessages(((Object) (menubuilder)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field CascadingMenuPopup this$0>
		//    2    4:getfield        #27  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #33  <Method void Handler.removeCallbacksAndMessages(Object)>
		//    5   11:return          
		}

		final CascadingMenuPopup this$0;

			
			{
				this$0 = CascadingMenuPopup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CascadingMenuPopup this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final int mMenuMaxWidth;
	private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
	private final boolean mOverflowOnly;
	private final List mPendingMenus = new ArrayList();
	private final int mPopupStyleAttr;
	private final int mPopupStyleRes;
	private MenuPresenter.Callback mPresenterCallback;
	private int mRawDropDownGravity;
	boolean mShouldCloseImmediately;
	private boolean mShowTitle;
	final List mShowingMenus = new ArrayList();
	View mShownAnchorView;
	final Handler mSubMenuHoverHandler = new Handler();
	private ViewTreeObserver mTreeObserver;
	private int mXOffset;
	private int mYOffset;


/*
	static ViewTreeObserver access$000(CascadingMenuPopup cascadingmenupopup)
	{
		return cascadingmenupopup.mTreeObserver;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field ViewTreeObserver mTreeObserver>
	//    2    4:areturn         
	}

*/


/*
	static ViewTreeObserver access$002(CascadingMenuPopup cascadingmenupopup, ViewTreeObserver viewtreeobserver)
	{
		cascadingmenupopup.mTreeObserver = viewtreeobserver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #163 <Field ViewTreeObserver mTreeObserver>
		return viewtreeobserver;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static android.view.ViewTreeObserver.OnGlobalLayoutListener access$100(CascadingMenuPopup cascadingmenupopup)
	{
		return cascadingmenupopup.mGlobalLayoutListener;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//    2    4:areturn         
	}

*/
}
