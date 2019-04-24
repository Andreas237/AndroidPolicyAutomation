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
	//    3    5:new             #80  <Class LinkedList>
	//    4    8:dup             
	//    5    9:invokespecial   #81  <Method void LinkedList()>
	//    6   12:putfield        #83  <Field List mPendingMenus>
	//    7   15:aload_0         
	//    8   16:new             #85  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #86  <Method void ArrayList()>
	//   11   23:putfield        #88  <Field List mShowingMenus>
	//   12   26:aload_0         
	//   13   27:new             #12  <Class CascadingMenuPopup$1>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #91  <Method void CascadingMenuPopup$1(CascadingMenuPopup)>
	//   17   35:putfield        #93  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//   18   38:aload_0         
	//   19   39:new             #14  <Class CascadingMenuPopup$2>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:invokespecial   #94  <Method void CascadingMenuPopup$2(CascadingMenuPopup)>
	//   23   47:putfield        #96  <Field android.view.View$OnAttachStateChangeListener mAttachStateChangeListener>
	//   24   50:aload_0         
	//   25   51:new             #16  <Class CascadingMenuPopup$3>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:invokespecial   #97  <Method void CascadingMenuPopup$3(CascadingMenuPopup)>
	//   29   59:putfield        #99  <Field MenuItemHoverListener mMenuItemHoverListener>
		mRawDropDownGravity = 0;
	//   30   62:aload_0         
	//   31   63:iconst_0        
	//   32   64:putfield        #101 <Field int mRawDropDownGravity>
		mDropDownGravity = 0;
	//   33   67:aload_0         
	//   34   68:iconst_0        
	//   35   69:putfield        #103 <Field int mDropDownGravity>
		mContext = context;
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:putfield        #105 <Field Context mContext>
		mAnchorView = view;
	//   39   77:aload_0         
	//   40   78:aload_2         
	//   41   79:putfield        #107 <Field View mAnchorView>
		mPopupStyleAttr = i;
	//   42   82:aload_0         
	//   43   83:iload_3         
	//   44   84:putfield        #109 <Field int mPopupStyleAttr>
		mPopupStyleRes = j;
	//   45   87:aload_0         
	//   46   88:iload           4
	//   47   90:putfield        #111 <Field int mPopupStyleRes>
		mOverflowOnly = flag;
	//   48   93:aload_0         
	//   49   94:iload           5
	//   50   96:putfield        #113 <Field boolean mOverflowOnly>
		mForceShowIcon = false;
	//   51   99:aload_0         
	//   52  100:iconst_0        
	//   53  101:putfield        #115 <Field boolean mForceShowIcon>
		mLastPosition = getInitialMenuPosition();
	//   54  104:aload_0         
	//   55  105:aload_0         
	//   56  106:invokespecial   #119 <Method int getInitialMenuPosition()>
	//   57  109:putfield        #121 <Field int mLastPosition>
		context = ((Context) (context.getResources()));
	//   58  112:aload_1         
	//   59  113:invokevirtual   #127 <Method Resources Context.getResources()>
	//   60  116:astore_1        
		mMenuMaxWidth = Math.max(((Resources) (context)).getDisplayMetrics().widthPixels / 2, ((Resources) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_config_prefDialogWidth));
	//   61  117:aload_0         
	//   62  118:aload_1         
	//   63  119:invokevirtual   #133 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   64  122:getfield        #138 <Field int DisplayMetrics.widthPixels>
	//   65  125:iconst_2        
	//   66  126:idiv            
	//   67  127:aload_1         
	//   68  128:getstatic       #143 <Field int android.support.v7.appcompat.R$dimen.abc_config_prefDialogWidth>
	//   69  131:invokevirtual   #147 <Method int Resources.getDimensionPixelSize(int)>
	//   70  134:invokestatic    #153 <Method int Math.max(int, int)>
	//   71  137:putfield        #155 <Field int mMenuMaxWidth>
	//   72  140:aload_0         
	//   73  141:new             #157 <Class Handler>
	//   74  144:dup             
	//   75  145:invokespecial   #158 <Method void Handler()>
	//   76  148:putfield        #160 <Field Handler mSubMenuHoverHandler>
	//   77  151:return          
	}

	private MenuPopupWindow createPopupWindow()
	{
		MenuPopupWindow menupopupwindow = new MenuPopupWindow(mContext, ((android.util.AttributeSet) (null)), mPopupStyleAttr, mPopupStyleRes);
	//    0    0:new             #174 <Class MenuPopupWindow>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #105 <Field Context mContext>
	//    4    8:aconst_null     
	//    5    9:aload_0         
	//    6   10:getfield        #109 <Field int mPopupStyleAttr>
	//    7   13:aload_0         
	//    8   14:getfield        #111 <Field int mPopupStyleRes>
	//    9   17:invokespecial   #177 <Method void MenuPopupWindow(Context, android.util.AttributeSet, int, int)>
	//   10   20:astore_1        
		menupopupwindow.setHoverListener(mMenuItemHoverListener);
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #99  <Field MenuItemHoverListener mMenuItemHoverListener>
	//   14   26:invokevirtual   #181 <Method void MenuPopupWindow.setHoverListener(MenuItemHoverListener)>
		menupopupwindow.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (this)));
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #185 <Method void MenuPopupWindow.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		menupopupwindow.setOnDismissListener(((android.widget.PopupWindow.OnDismissListener) (this)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:invokevirtual   #189 <Method void MenuPopupWindow.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
		menupopupwindow.setAnchorView(mAnchorView);
	//   21   39:aload_1         
	//   22   40:aload_0         
	//   23   41:getfield        #107 <Field View mAnchorView>
	//   24   44:invokevirtual   #193 <Method void MenuPopupWindow.setAnchorView(View)>
		menupopupwindow.setDropDownGravity(mDropDownGravity);
	//   25   47:aload_1         
	//   26   48:aload_0         
	//   27   49:getfield        #103 <Field int mDropDownGravity>
	//   28   52:invokevirtual   #197 <Method void MenuPopupWindow.setDropDownGravity(int)>
		menupopupwindow.setModal(true);
	//   29   55:aload_1         
	//   30   56:iconst_1        
	//   31   57:invokevirtual   #201 <Method void MenuPopupWindow.setModal(boolean)>
		menupopupwindow.setInputMethodMode(2);
	//   32   60:aload_1         
	//   33   61:iconst_2        
	//   34   62:invokevirtual   #204 <Method void MenuPopupWindow.setInputMethodMode(int)>
		return menupopupwindow;
	//   35   65:aload_1         
	//   36   66:areturn         
	}

	private int findIndexOfAddedMenu(MenuBuilder menubuilder)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = mShowingMenus.size(); i < j; i++)
	//*   2    2:aload_0         
	//*   3    3:getfield        #88  <Field List mShowingMenus>
	//*   4    6:invokeinterface #211 <Method int List.size()>
	//*   5   11:istore_3        
	//*   6   12:iload_2         
	//*   7   13:iload_3         
	//*   8   14:icmpge          46
			if(menubuilder == ((CascadingMenuInfo)mShowingMenus.get(i)).menu)
	//*   9   17:aload_1         
	//*  10   18:aload_0         
	//*  11   19:getfield        #88  <Field List mShowingMenus>
	//*  12   22:iload_2         
	//*  13   23:invokeinterface #215 <Method Object List.get(int)>
	//*  14   28:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//*  15   31:getfield        #219 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		for(int j = menubuilder.size(); i < j; i++)
	//*   2    2:aload_1         
	//*   3    3:invokevirtual   #224 <Method int MenuBuilder.size()>
	//*   4    6:istore          4
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          52
		{
			MenuItem menuitem = menubuilder.getItem(i);
	//    8   14:aload_1         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #228 <Method MenuItem MenuBuilder.getItem(int)>
	//   11   19:astore          5
			if(menuitem.hasSubMenu() && menubuilder1 == menuitem.getSubMenu())
	//*  12   21:aload           5
	//*  13   23:invokeinterface #234 <Method boolean MenuItem.hasSubMenu()>
	//*  14   28:ifeq            45
	//*  15   31:aload_2         
	//*  16   32:aload           5
	//*  17   34:invokeinterface #238 <Method android.view.SubMenu MenuItem.getSubMenu()>
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
		menubuilder = ((MenuBuilder) (findMenuItemForSubmenu(cascadingmenuinfo.menu, menubuilder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #219 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//    3    5:aload_2         
	//    4    6:invokespecial   #243 <Method MenuItem findMenuItemForSubmenu(MenuBuilder, MenuBuilder)>
	//    5    9:astore_2        
		if(menubuilder != null) goto _L2; else goto _L1
	//    6   10:aload_2         
	//    7   11:ifnonnull       16
_L1:
		return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
_L2:
		int i;
		ListView listview = cascadingmenuinfo.getListView();
	//   10   16:aload_1         
	//   11   17:invokevirtual   #247 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   12   20:astore          8
		cascadingmenuinfo = ((CascadingMenuInfo) (listview.getAdapter()));
	//   13   22:aload           8
	//   14   24:invokevirtual   #253 <Method android.widget.ListAdapter ListView.getAdapter()>
	//   15   27:astore_1        
		int j;
		int k;
		byte byte0;
		int l;
		if(cascadingmenuinfo instanceof HeaderViewListAdapter)
	//*  16   28:aload_1         
	//*  17   29:instanceof      #255 <Class HeaderViewListAdapter>
	//*  18   32:ifeq            125
		{
			cascadingmenuinfo = ((CascadingMenuInfo) ((HeaderViewListAdapter)cascadingmenuinfo));
	//   19   35:aload_1         
	//   20   36:checkcast       #255 <Class HeaderViewListAdapter>
	//   21   39:astore_1        
			j = ((HeaderViewListAdapter) (cascadingmenuinfo)).getHeadersCount();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #258 <Method int HeaderViewListAdapter.getHeadersCount()>
	//   24   44:istore          4
			cascadingmenuinfo = ((CascadingMenuInfo) ((MenuAdapter)((HeaderViewListAdapter) (cascadingmenuinfo)).getWrappedAdapter()));
	//   25   46:aload_1         
	//   26   47:invokevirtual   #261 <Method android.widget.ListAdapter HeaderViewListAdapter.getWrappedAdapter()>
	//   27   50:checkcast       #263 <Class MenuAdapter>
	//   28   53:astore_1        
		} else
	//*  29   54:iconst_m1       
	//*  30   55:istore          6
	//*  31   57:iconst_0        
	//*  32   58:istore_3        
	//*  33   59:aload_1         
	//*  34   60:invokevirtual   #266 <Method int MenuAdapter.getCount()>
	//*  35   63:istore          7
	//*  36   65:iload           6
	//*  37   67:istore          5
	//*  38   69:iload_3         
	//*  39   70:iload           7
	//*  40   72:icmpge          87
	//*  41   75:aload_2         
	//*  42   76:aload_1         
	//*  43   77:iload_3         
	//*  44   78:invokevirtual   #269 <Method MenuItemImpl MenuAdapter.getItem(int)>
	//*  45   81:if_acmpne       136
	//*  46   84:iload_3         
	//*  47   85:istore          5
	//*  48   87:iload           5
	//*  49   89:iconst_m1       
	//*  50   90:icmpeq          14
	//*  51   93:iload           5
	//*  52   95:iload           4
	//*  53   97:iadd            
	//*  54   98:aload           8
	//*  55  100:invokevirtual   #272 <Method int ListView.getFirstVisiblePosition()>
	//*  56  103:isub            
	//*  57  104:istore_3        
	//*  58  105:iload_3         
	//*  59  106:iflt            14
	//*  60  109:iload_3         
	//*  61  110:aload           8
	//*  62  112:invokevirtual   #275 <Method int ListView.getChildCount()>
	//*  63  115:icmpge          14
	//*  64  118:aload           8
	//*  65  120:iload_3         
	//*  66  121:invokevirtual   #279 <Method View ListView.getChildAt(int)>
	//*  67  124:areturn         
		{
			j = 0;
	//   68  125:iconst_0        
	//   69  126:istore          4
			cascadingmenuinfo = ((CascadingMenuInfo) ((MenuAdapter)cascadingmenuinfo));
	//   70  128:aload_1         
	//   71  129:checkcast       #263 <Class MenuAdapter>
	//   72  132:astore_1        
		}
		byte0 = -1;
		i = 0;
		l = ((MenuAdapter) (cascadingmenuinfo)).getCount();
_L4:
		k = ((int) (byte0));
		if(i >= l)
			continue; /* Loop/switch isn't completed */
		if(menubuilder != ((MenuAdapter) (cascadingmenuinfo)).getItem(i))
			break MISSING_BLOCK_LABEL_136;
		k = i;
		if(k == -1) goto _L1; else goto _L3
_L3:
		i = (k + j) - listview.getFirstVisiblePosition();
		if(i >= 0 && i < listview.getChildCount())
			return listview.getChildAt(i);
		  goto _L1
	//*  73  133:goto            54
		i++;
	//   74  136:iload_3         
	//   75  137:iconst_1        
	//   76  138:iadd            
	//   77  139:istore_3        
		  goto _L4
	//*  78  140:goto            65
	}

	private int getInitialMenuPosition()
	{
		int i = 1;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		if(ViewCompat.getLayoutDirection(mAnchorView) == 1)
	//*   2    2:aload_0         
	//*   3    3:getfield        #107 <Field View mAnchorView>
	//*   4    6:invokestatic    #286 <Method int ViewCompat.getLayoutDirection(View)>
	//*   5    9:iconst_1        
	//*   6   10:icmpne          15
			i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		return i;
	//    9   15:iload_1         
	//   10   16:ireturn         
	}

	private int getNextMenuPosition(int i)
	{
		ListView listview = ((CascadingMenuInfo)mShowingMenus.get(mShowingMenus.size() - 1)).getListView();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field List mShowingMenus>
	//    2    4:aload_0         
	//    3    5:getfield        #88  <Field List mShowingMenus>
	//    4    8:invokeinterface #211 <Method int List.size()>
	//    5   13:iconst_1        
	//    6   14:isub            
	//    7   15:invokeinterface #215 <Method Object List.get(int)>
	//    8   20:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//    9   23:invokevirtual   #247 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   10   26:astore_2        
		int ai[] = new int[2];
	//   11   27:iconst_2        
	//   12   28:newarray        int[]
	//   13   30:astore_3        
		listview.getLocationOnScreen(ai);
	//   14   31:aload_2         
	//   15   32:aload_3         
	//   16   33:invokevirtual   #291 <Method void ListView.getLocationOnScreen(int[])>
		Rect rect = new Rect();
	//   17   36:new             #293 <Class Rect>
	//   18   39:dup             
	//   19   40:invokespecial   #294 <Method void Rect()>
	//   20   43:astore          4
		mShownAnchorView.getWindowVisibleDisplayFrame(rect);
	//   21   45:aload_0         
	//   22   46:getfield        #296 <Field View mShownAnchorView>
	//   23   49:aload           4
	//   24   51:invokevirtual   #302 <Method void View.getWindowVisibleDisplayFrame(Rect)>
		if(mLastPosition == 1)
	//*  25   54:aload_0         
	//*  26   55:getfield        #121 <Field int mLastPosition>
	//*  27   58:iconst_1        
	//*  28   59:icmpne          84
			return ai[0] + listview.getWidth() + i <= rect.right ? 1 : 0;
	//   29   62:aload_3         
	//   30   63:iconst_0        
	//   31   64:iaload          
	//   32   65:aload_2         
	//   33   66:invokevirtual   #305 <Method int ListView.getWidth()>
	//   34   69:iadd            
	//   35   70:iload_1         
	//   36   71:iadd            
	//   37   72:aload           4
	//   38   74:getfield        #308 <Field int Rect.right>
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
	//    1    1:getfield        #105 <Field Context mContext>
	//    2    4:invokestatic    #316 <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    7:astore          9
		Object obj = ((Object) (new MenuAdapter(menubuilder, ((LayoutInflater) (obj2)), mOverflowOnly)));
	//    4    9:new             #263 <Class MenuAdapter>
	//    5   12:dup             
	//    6   13:aload_1         
	//    7   14:aload           9
	//    8   16:aload_0         
	//    9   17:getfield        #113 <Field boolean mOverflowOnly>
	//   10   20:invokespecial   #319 <Method void MenuAdapter(MenuBuilder, LayoutInflater, boolean)>
	//   11   23:astore          6
		int l;
		Object obj1;
		MenuPopupWindow menupopupwindow;
		if(!isShowing() && mForceShowIcon)
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #322 <Method boolean isShowing()>
	//*  14   29:ifne            354
	//*  15   32:aload_0         
	//*  16   33:getfield        #115 <Field boolean mForceShowIcon>
	//*  17   36:ifeq            354
			((MenuAdapter) (obj)).setForceShowIcon(true);
	//   18   39:aload           6
	//   19   41:iconst_1        
	//   20   42:invokevirtual   #325 <Method void MenuAdapter.setForceShowIcon(boolean)>
		else
	//*  21   45:aload           6
	//*  22   47:aconst_null     
	//*  23   48:aload_0         
	//*  24   49:getfield        #105 <Field Context mContext>
	//*  25   52:aload_0         
	//*  26   53:getfield        #155 <Field int mMenuMaxWidth>
	//*  27   56:invokestatic    #329 <Method int measureIndividualMenuWidth(android.widget.ListAdapter, android.view.ViewGroup, Context, int)>
	//*  28   59:istore          5
	//*  29   61:aload_0         
	//*  30   62:invokespecial   #331 <Method MenuPopupWindow createPopupWindow()>
	//*  31   65:astore          8
	//*  32   67:aload           8
	//*  33   69:aload           6
	//*  34   71:invokevirtual   #335 <Method void MenuPopupWindow.setAdapter(android.widget.ListAdapter)>
	//*  35   74:aload           8
	//*  36   76:iload           5
	//*  37   78:invokevirtual   #338 <Method void MenuPopupWindow.setContentWidth(int)>
	//*  38   81:aload           8
	//*  39   83:aload_0         
	//*  40   84:getfield        #103 <Field int mDropDownGravity>
	//*  41   87:invokevirtual   #197 <Method void MenuPopupWindow.setDropDownGravity(int)>
	//*  42   90:aload_0         
	//*  43   91:getfield        #88  <Field List mShowingMenus>
	//*  44   94:invokeinterface #211 <Method int List.size()>
	//*  45   99:ifle            373
	//*  46  102:aload_0         
	//*  47  103:getfield        #88  <Field List mShowingMenus>
	//*  48  106:aload_0         
	//*  49  107:getfield        #88  <Field List mShowingMenus>
	//*  50  110:invokeinterface #211 <Method int List.size()>
	//*  51  115:iconst_1        
	//*  52  116:isub            
	//*  53  117:invokeinterface #215 <Method Object List.get(int)>
	//*  54  122:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//*  55  125:astore          6
	//*  56  127:aload_0         
	//*  57  128:aload           6
	//*  58  130:aload_1         
	//*  59  131:invokespecial   #340 <Method View findParentViewForSubmenu(CascadingMenuPopup$CascadingMenuInfo, MenuBuilder)>
	//*  60  134:astore          7
	//*  61  136:aload           7
	//*  62  138:ifnull          474
	//*  63  141:aload           8
	//*  64  143:iconst_0        
	//*  65  144:invokevirtual   #343 <Method void MenuPopupWindow.setTouchModal(boolean)>
	//*  66  147:aload           8
	//*  67  149:aconst_null     
	//*  68  150:invokevirtual   #347 <Method void MenuPopupWindow.setEnterTransition(Object)>
	//*  69  153:aload_0         
	//*  70  154:iload           5
	//*  71  156:invokespecial   #349 <Method int getNextMenuPosition(int)>
	//*  72  159:istore_3        
	//*  73  160:iload_3         
	//*  74  161:iconst_1        
	//*  75  162:icmpne          382
	//*  76  165:iconst_1        
	//*  77  166:istore_2        
	//*  78  167:aload_0         
	//*  79  168:iload_3         
	//*  80  169:putfield        #121 <Field int mLastPosition>
	//*  81  172:getstatic       #354 <Field int android.os.Build$VERSION.SDK_INT>
	//*  82  175:bipush          26
	//*  83  177:icmplt          387
	//*  84  180:aload           8
	//*  85  182:aload           7
	//*  86  184:invokevirtual   #193 <Method void MenuPopupWindow.setAnchorView(View)>
	//*  87  187:iconst_0        
	//*  88  188:istore          4
	//*  89  190:iconst_0        
	//*  90  191:istore_3        
	//*  91  192:aload_0         
	//*  92  193:getfield        #103 <Field int mDropDownGravity>
	//*  93  196:iconst_5        
	//*  94  197:iand            
	//*  95  198:iconst_5        
	//*  96  199:icmpne          449
	//*  97  202:iload_2         
	//*  98  203:ifeq            437
	//*  99  206:iload           4
	//* 100  208:iload           5
	//* 101  210:iadd            
	//* 102  211:istore_2        
	//* 103  212:aload           8
	//* 104  214:iload_2         
	//* 105  215:invokevirtual   #357 <Method void MenuPopupWindow.setHorizontalOffset(int)>
	//* 106  218:aload           8
	//* 107  220:iconst_1        
	//* 108  221:invokevirtual   #360 <Method void MenuPopupWindow.setOverlapAnchor(boolean)>
	//* 109  224:aload           8
	//* 110  226:iload_3         
	//* 111  227:invokevirtual   #363 <Method void MenuPopupWindow.setVerticalOffset(int)>
	//* 112  230:new             #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//* 113  233:dup             
	//* 114  234:aload           8
	//* 115  236:aload_1         
	//* 116  237:aload_0         
	//* 117  238:getfield        #121 <Field int mLastPosition>
	//* 118  241:invokespecial   #366 <Method void CascadingMenuPopup$CascadingMenuInfo(MenuPopupWindow, MenuBuilder, int)>
	//* 119  244:astore          7
	//* 120  246:aload_0         
	//* 121  247:getfield        #88  <Field List mShowingMenus>
	//* 122  250:aload           7
	//* 123  252:invokeinterface #370 <Method boolean List.add(Object)>
	//* 124  257:pop             
	//* 125  258:aload           8
	//* 126  260:invokevirtual   #373 <Method void MenuPopupWindow.show()>
	//* 127  263:aload           8
	//* 128  265:invokevirtual   #374 <Method ListView MenuPopupWindow.getListView()>
	//* 129  268:astore          7
	//* 130  270:aload           7
	//* 131  272:aload_0         
	//* 132  273:invokevirtual   #378 <Method void ListView.setOnKeyListener(android.view.View$OnKeyListener)>
	//* 133  276:aload           6
	//* 134  278:ifnonnull       353
	//* 135  281:aload_0         
	//* 136  282:getfield        #380 <Field boolean mShowTitle>
	//* 137  285:ifeq            353
	//* 138  288:aload_1         
	//* 139  289:invokevirtual   #384 <Method CharSequence MenuBuilder.getHeaderTitle()>
	//* 140  292:ifnull          353
	//* 141  295:aload           9
	//* 142  297:getstatic       #389 <Field int android.support.v7.appcompat.R$layout.abc_popup_menu_header_item_layout>
	//* 143  300:aload           7
	//* 144  302:iconst_0        
	//* 145  303:invokevirtual   #393 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//* 146  306:checkcast       #395 <Class FrameLayout>
	//* 147  309:astore          6
	//* 148  311:aload           6
	//* 149  313:ldc2            #396 <Int 0x1020016>
	//* 150  316:invokevirtual   #399 <Method View FrameLayout.findViewById(int)>
	//* 151  319:checkcast       #401 <Class TextView>
	//* 152  322:astore          9
	//* 153  324:aload           6
	//* 154  326:iconst_0        
	//* 155  327:invokevirtual   #404 <Method void FrameLayout.setEnabled(boolean)>
	//* 156  330:aload           9
	//* 157  332:aload_1         
	//* 158  333:invokevirtual   #384 <Method CharSequence MenuBuilder.getHeaderTitle()>
	//* 159  336:invokevirtual   #408 <Method void TextView.setText(CharSequence)>
	//* 160  339:aload           7
	//* 161  341:aload           6
	//* 162  343:aconst_null     
	//* 163  344:iconst_0        
	//* 164  345:invokevirtual   #412 <Method void ListView.addHeaderView(View, Object, boolean)>
	//* 165  348:aload           8
	//* 166  350:invokevirtual   #373 <Method void MenuPopupWindow.show()>
	//* 167  353:return          
		if(isShowing())
	//* 168  354:aload_0         
	//* 169  355:invokevirtual   #322 <Method boolean isShowing()>
	//* 170  358:ifeq            45
			((MenuAdapter) (obj)).setForceShowIcon(MenuPopup.shouldPreserveIconSpacing(menubuilder));
	//  171  361:aload           6
	//  172  363:aload_1         
	//  173  364:invokestatic    #416 <Method boolean MenuPopup.shouldPreserveIconSpacing(MenuBuilder)>
	//  174  367:invokevirtual   #325 <Method void MenuAdapter.setForceShowIcon(boolean)>
		l = measureIndividualMenuWidth(((android.widget.ListAdapter) (obj)), ((android.view.ViewGroup) (null)), mContext, mMenuMaxWidth);
		menupopupwindow = createPopupWindow();
		menupopupwindow.setAdapter(((android.widget.ListAdapter) (obj)));
		menupopupwindow.setContentWidth(l);
		menupopupwindow.setDropDownGravity(mDropDownGravity);
		if(mShowingMenus.size() > 0)
		{
			obj = ((Object) ((CascadingMenuInfo)mShowingMenus.get(mShowingMenus.size() - 1)));
			obj1 = ((Object) (findParentViewForSubmenu(((CascadingMenuInfo) (obj)), menubuilder)));
		} else
	//* 175  370:goto            45
		{
			obj = null;
	//  176  373:aconst_null     
	//  177  374:astore          6
			obj1 = null;
	//  178  376:aconst_null     
	//  179  377:astore          7
		}
		if(obj1 != null)
		{
			menupopupwindow.setTouchModal(false);
			menupopupwindow.setEnterTransition(((Object) (null)));
			int j = getNextMenuPosition(l);
			int i;
			int k;
			if(j == 1)
				i = 1;
			else
	//* 180  379:goto            136
				i = 0;
	//  181  382:iconst_0        
	//  182  383:istore_2        
			mLastPosition = j;
			if(android.os.Build.VERSION.SDK_INT >= 26)
			{
				menupopupwindow.setAnchorView(((View) (obj1)));
				k = 0;
				j = 0;
			} else
	//* 183  384:goto            167
			{
				int ai[] = new int[2];
	//  184  387:iconst_2        
	//  185  388:newarray        int[]
	//  186  390:astore          10
				mAnchorView.getLocationOnScreen(ai);
	//  187  392:aload_0         
	//  188  393:getfield        #107 <Field View mAnchorView>
	//  189  396:aload           10
	//  190  398:invokevirtual   #417 <Method void View.getLocationOnScreen(int[])>
				int ai1[] = new int[2];
	//  191  401:iconst_2        
	//  192  402:newarray        int[]
	//  193  404:astore          11
				((View) (obj1)).getLocationOnScreen(ai1);
	//  194  406:aload           7
	//  195  408:aload           11
	//  196  410:invokevirtual   #417 <Method void View.getLocationOnScreen(int[])>
				k = ai1[0] - ai[0];
	//  197  413:aload           11
	//  198  415:iconst_0        
	//  199  416:iaload          
	//  200  417:aload           10
	//  201  419:iconst_0        
	//  202  420:iaload          
	//  203  421:isub            
	//  204  422:istore          4
				j = ai1[1] - ai[1];
	//  205  424:aload           11
	//  206  426:iconst_1        
	//  207  427:iaload          
	//  208  428:aload           10
	//  209  430:iconst_1        
	//  210  431:iaload          
	//  211  432:isub            
	//  212  433:istore_3        
			}
			if((mDropDownGravity & 5) == 5)
			{
				if(i != 0)
					i = k + l;
				else
	//* 213  434:goto            192
					i = k - ((View) (obj1)).getWidth();
	//  214  437:iload           4
	//  215  439:aload           7
	//  216  441:invokevirtual   #418 <Method int View.getWidth()>
	//  217  444:isub            
	//  218  445:istore_2        
			} else
	//* 219  446:goto            212
			if(i != 0)
	//* 220  449:iload_2         
	//* 221  450:ifeq            465
				i = k + ((View) (obj1)).getWidth();
	//  222  453:iload           4
	//  223  455:aload           7
	//  224  457:invokevirtual   #418 <Method int View.getWidth()>
	//  225  460:iadd            
	//  226  461:istore_2        
			else
	//* 227  462:goto            212
				i = k - l;
	//  228  465:iload           4
	//  229  467:iload           5
	//  230  469:isub            
	//  231  470:istore_2        
			menupopupwindow.setHorizontalOffset(i);
			menupopupwindow.setOverlapAnchor(true);
			menupopupwindow.setVerticalOffset(j);
		} else
	//* 232  471:goto            212
		{
			if(mHasXOffset)
	//* 233  474:aload_0         
	//* 234  475:getfield        #420 <Field boolean mHasXOffset>
	//* 235  478:ifeq            490
				menupopupwindow.setHorizontalOffset(mXOffset);
	//  236  481:aload           8
	//  237  483:aload_0         
	//  238  484:getfield        #422 <Field int mXOffset>
	//  239  487:invokevirtual   #357 <Method void MenuPopupWindow.setHorizontalOffset(int)>
			if(mHasYOffset)
	//* 240  490:aload_0         
	//* 241  491:getfield        #424 <Field boolean mHasYOffset>
	//* 242  494:ifeq            506
				menupopupwindow.setVerticalOffset(mYOffset);
	//  243  497:aload           8
	//  244  499:aload_0         
	//  245  500:getfield        #426 <Field int mYOffset>
	//  246  503:invokevirtual   #363 <Method void MenuPopupWindow.setVerticalOffset(int)>
			menupopupwindow.setEpicenterBounds(getEpicenterBounds());
	//  247  506:aload           8
	//  248  508:aload_0         
	//  249  509:invokevirtual   #430 <Method Rect getEpicenterBounds()>
	//  250  512:invokevirtual   #433 <Method void MenuPopupWindow.setEpicenterBounds(Rect)>
		}
		obj1 = ((Object) (new CascadingMenuInfo(menupopupwindow, menubuilder, mLastPosition)));
		mShowingMenus.add(obj1);
		menupopupwindow.show();
		obj1 = ((Object) (menupopupwindow.getListView()));
		((ListView) (obj1)).setOnKeyListener(((android.view.View.OnKeyListener) (this)));
		if(obj == null && mShowTitle && menubuilder.getHeaderTitle() != null)
		{
			obj = ((Object) ((FrameLayout)((LayoutInflater) (obj2)).inflate(android.support.v7.appcompat.R.layout.abc_popup_menu_header_item_layout, ((android.view.ViewGroup) (obj1)), false)));
			obj2 = ((Object) ((TextView)((FrameLayout) (obj)).findViewById(0x1020016)));
			((FrameLayout) (obj)).setEnabled(false);
			((TextView) (obj2)).setText(menubuilder.getHeaderTitle());
			((ListView) (obj1)).addHeaderView(((View) (obj)), ((Object) (null)), false);
			menupopupwindow.show();
		}
	//* 251  515:goto            230
	}

	public void addMenu(MenuBuilder menubuilder)
	{
		menubuilder.addMenuPresenter(((MenuPresenter) (this)), mContext);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #105 <Field Context mContext>
	//    4    6:invokevirtual   #438 <Method void MenuBuilder.addMenuPresenter(MenuPresenter, Context)>
		if(isShowing())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #322 <Method boolean isShowing()>
	//*   7   13:ifeq            22
		{
			showMenu(menubuilder);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #440 <Method void showMenu(MenuBuilder)>
			return;
	//   11   21:return          
		} else
		{
			mPendingMenus.add(((Object) (menubuilder)));
	//   12   22:aload_0         
	//   13   23:getfield        #83  <Field List mPendingMenus>
	//   14   26:aload_1         
	//   15   27:invokeinterface #370 <Method boolean List.add(Object)>
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
	//    1    1:getfield        #88  <Field List mShowingMenus>
	//    2    4:invokeinterface #211 <Method int List.size()>
	//    3    9:istore_1        
		if(i > 0)
	//*   4   10:iload_1         
	//*   5   11:ifle            67
		{
			CascadingMenuInfo acascadingmenuinfo[] = (CascadingMenuInfo[])mShowingMenus.toArray(((Object []) (new CascadingMenuInfo[i])));
	//    6   14:aload_0         
	//    7   15:getfield        #88  <Field List mShowingMenus>
	//    8   18:iload_1         
	//    9   19:anewarray       CascadingMenuInfo[]
	//   10   22:invokeinterface #446 <Method Object[] List.toArray(Object[])>
	//   11   27:checkcast       #448 <Class CascadingMenuPopup$CascadingMenuInfo[]>
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
	//*  24   44:getfield        #452 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//*  25   47:invokevirtual   #453 <Method boolean MenuPopupWindow.isShowing()>
	//*  26   50:ifeq            60
					cascadingmenuinfo.window.dismiss();
	//   27   53:aload_3         
	//   28   54:getfield        #452 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   29   57:invokevirtual   #455 <Method void MenuPopupWindow.dismiss()>
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
	//*   1    1:getfield        #88  <Field List mShowingMenus>
	//*   2    4:invokeinterface #459 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            14
			return null;
	//    4   12:aconst_null     
	//    5   13:areturn         
		else
			return ((CascadingMenuInfo)mShowingMenus.get(mShowingMenus.size() - 1)).getListView();
	//    6   14:aload_0         
	//    7   15:getfield        #88  <Field List mShowingMenus>
	//    8   18:aload_0         
	//    9   19:getfield        #88  <Field List mShowingMenus>
	//   10   22:invokeinterface #211 <Method int List.size()>
	//   11   27:iconst_1        
	//   12   28:isub            
	//   13   29:invokeinterface #215 <Method Object List.get(int)>
	//   14   34:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   15   37:invokevirtual   #247 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   16   40:areturn         
	}

	public boolean isShowing()
	{
		return mShowingMenus.size() > 0 && ((CascadingMenuInfo)mShowingMenus.get(0)).window.isShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field List mShowingMenus>
	//    2    4:invokeinterface #211 <Method int List.size()>
	//    3    9:ifle            36
	//    4   12:aload_0         
	//    5   13:getfield        #88  <Field List mShowingMenus>
	//    6   16:iconst_0        
	//    7   17:invokeinterface #215 <Method Object List.get(int)>
	//    8   22:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//    9   25:getfield        #452 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   10   28:invokevirtual   #453 <Method boolean MenuPopupWindow.isShowing()>
	//   11   31:ifeq            36
	//   12   34:iconst_1        
	//   13   35:ireturn         
	//   14   36:iconst_0        
	//   15   37:ireturn         
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		int i = findIndexOfAddedMenu(menubuilder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #463 <Method int findIndexOfAddedMenu(MenuBuilder)>
	//    3    5:istore_3        
		if(i >= 0)
	//*   4    6:iload_3         
	//*   5    7:ifge            11
	//*   6   10:return          
		{
			int j = i + 1;
	//    7   11:iload_3         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:istore          4
			if(j < mShowingMenus.size())
	//*  11   16:iload           4
	//*  12   18:aload_0         
	//*  13   19:getfield        #88  <Field List mShowingMenus>
	//*  14   22:invokeinterface #211 <Method int List.size()>
	//*  15   27:icmpge          51
				((CascadingMenuInfo)mShowingMenus.get(j)).menu.close(false);
	//   16   30:aload_0         
	//   17   31:getfield        #88  <Field List mShowingMenus>
	//   18   34:iload           4
	//   19   36:invokeinterface #215 <Method Object List.get(int)>
	//   20   41:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   21   44:getfield        #219 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//   22   47:iconst_0        
	//   23   48:invokevirtual   #466 <Method void MenuBuilder.close(boolean)>
			CascadingMenuInfo cascadingmenuinfo = (CascadingMenuInfo)mShowingMenus.remove(i);
	//   24   51:aload_0         
	//   25   52:getfield        #88  <Field List mShowingMenus>
	//   26   55:iload_3         
	//   27   56:invokeinterface #469 <Method Object List.remove(int)>
	//   28   61:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   29   64:astore          5
			cascadingmenuinfo.menu.removeMenuPresenter(((MenuPresenter) (this)));
	//   30   66:aload           5
	//   31   68:getfield        #219 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//   32   71:aload_0         
	//   33   72:invokevirtual   #473 <Method void MenuBuilder.removeMenuPresenter(MenuPresenter)>
			if(mShouldCloseImmediately)
	//*  34   75:aload_0         
	//*  35   76:getfield        #475 <Field boolean mShouldCloseImmediately>
	//*  36   79:ifeq            100
			{
				cascadingmenuinfo.window.setExitTransition(((Object) (null)));
	//   37   82:aload           5
	//   38   84:getfield        #452 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   39   87:aconst_null     
	//   40   88:invokevirtual   #478 <Method void MenuPopupWindow.setExitTransition(Object)>
				cascadingmenuinfo.window.setAnimationStyle(0);
	//   41   91:aload           5
	//   42   93:getfield        #452 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   43   96:iconst_0        
	//   44   97:invokevirtual   #481 <Method void MenuPopupWindow.setAnimationStyle(int)>
			}
			cascadingmenuinfo.window.dismiss();
	//   45  100:aload           5
	//   46  102:getfield        #452 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   47  105:invokevirtual   #455 <Method void MenuPopupWindow.dismiss()>
			i = mShowingMenus.size();
	//   48  108:aload_0         
	//   49  109:getfield        #88  <Field List mShowingMenus>
	//   50  112:invokeinterface #211 <Method int List.size()>
	//   51  117:istore_3        
			if(i > 0)
	//*  52  118:iload_3         
	//*  53  119:ifle            224
				mLastPosition = ((CascadingMenuInfo)mShowingMenus.get(i - 1)).position;
	//   54  122:aload_0         
	//   55  123:aload_0         
	//   56  124:getfield        #88  <Field List mShowingMenus>
	//   57  127:iload_3         
	//   58  128:iconst_1        
	//   59  129:isub            
	//   60  130:invokeinterface #215 <Method Object List.get(int)>
	//   61  135:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   62  138:getfield        #484 <Field int CascadingMenuPopup$CascadingMenuInfo.position>
	//   63  141:putfield        #121 <Field int mLastPosition>
			else
	//*  64  144:iload_3         
	//*  65  145:ifne            235
	//*  66  148:aload_0         
	//*  67  149:invokevirtual   #485 <Method void dismiss()>
	//*  68  152:aload_0         
	//*  69  153:getfield        #487 <Field MenuPresenter$Callback mPresenterCallback>
	//*  70  156:ifnull          170
	//*  71  159:aload_0         
	//*  72  160:getfield        #487 <Field MenuPresenter$Callback mPresenterCallback>
	//*  73  163:aload_1         
	//*  74  164:iconst_1        
	//*  75  165:invokeinterface #491 <Method void MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
	//*  76  170:aload_0         
	//*  77  171:getfield        #166 <Field ViewTreeObserver mTreeObserver>
	//*  78  174:ifnull          203
	//*  79  177:aload_0         
	//*  80  178:getfield        #166 <Field ViewTreeObserver mTreeObserver>
	//*  81  181:invokevirtual   #496 <Method boolean ViewTreeObserver.isAlive()>
	//*  82  184:ifeq            198
	//*  83  187:aload_0         
	//*  84  188:getfield        #166 <Field ViewTreeObserver mTreeObserver>
	//*  85  191:aload_0         
	//*  86  192:getfield        #93  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//*  87  195:invokevirtual   #500 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//*  88  198:aload_0         
	//*  89  199:aconst_null     
	//*  90  200:putfield        #166 <Field ViewTreeObserver mTreeObserver>
	//*  91  203:aload_0         
	//*  92  204:getfield        #296 <Field View mShownAnchorView>
	//*  93  207:aload_0         
	//*  94  208:getfield        #96  <Field android.view.View$OnAttachStateChangeListener mAttachStateChangeListener>
	//*  95  211:invokevirtual   #504 <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
	//*  96  214:aload_0         
	//*  97  215:getfield        #506 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//*  98  218:invokeinterface #509 <Method void android.widget.PopupWindow$OnDismissListener.onDismiss()>
	//*  99  223:return          
				mLastPosition = getInitialMenuPosition();
	//  100  224:aload_0         
	//  101  225:aload_0         
	//  102  226:invokespecial   #119 <Method int getInitialMenuPosition()>
	//  103  229:putfield        #121 <Field int mLastPosition>
			if(i == 0)
			{
				dismiss();
				if(mPresenterCallback != null)
					mPresenterCallback.onCloseMenu(menubuilder, true);
				if(mTreeObserver != null)
				{
					if(mTreeObserver.isAlive())
						mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
					mTreeObserver = null;
				}
				mShownAnchorView.removeOnAttachStateChangeListener(mAttachStateChangeListener);
				mOnDismissListener.onDismiss();
				return;
			}
	//* 104  232:goto            144
			if(flag)
	//* 105  235:iload_2         
	//* 106  236:ifeq            10
			{
				((CascadingMenuInfo)mShowingMenus.get(0)).menu.close(false);
	//  107  239:aload_0         
	//  108  240:getfield        #88  <Field List mShowingMenus>
	//  109  243:iconst_0        
	//  110  244:invokeinterface #215 <Method Object List.get(int)>
	//  111  249:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//  112  252:getfield        #219 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//  113  255:iconst_0        
	//  114  256:invokevirtual   #466 <Method void MenuBuilder.close(boolean)>
				return;
	//  115  259:return          
			}
		}
	}

	public void onDismiss()
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		int i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_1        
		int j = mShowingMenus.size();
	//    4    5:aload_0         
	//    5    6:getfield        #88  <Field List mShowingMenus>
	//    6    9:invokeinterface #211 <Method int List.size()>
	//    7   14:istore_2        
		do
		{
label0:
			{
				CascadingMenuInfo cascadingmenuinfo = ((CascadingMenuInfo) (obj));
	//    8   15:aload           4
	//    9   17:astore_3        
				if(i < j)
	//*  10   18:iload_1         
	//*  11   19:iload_2         
	//*  12   20:icmpge          47
				{
					cascadingmenuinfo = (CascadingMenuInfo)mShowingMenus.get(i);
	//   13   23:aload_0         
	//   14   24:getfield        #88  <Field List mShowingMenus>
	//   15   27:iload_1         
	//   16   28:invokeinterface #215 <Method Object List.get(int)>
	//   17   33:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   18   36:astore_3        
					if(cascadingmenuinfo.window.isShowing())
						break label0;
	//   19   37:aload_3         
	//   20   38:getfield        #452 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   21   41:invokevirtual   #453 <Method boolean MenuPopupWindow.isShowing()>
	//   22   44:ifne            60
				}
				if(cascadingmenuinfo != null)
	//*  23   47:aload_3         
	//*  24   48:ifnull          59
					cascadingmenuinfo.menu.close(false);
	//   25   51:aload_3         
	//   26   52:getfield        #219 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//   27   55:iconst_0        
	//   28   56:invokevirtual   #466 <Method void MenuBuilder.close(boolean)>
				return;
	//   29   59:return          
			}
			i++;
	//   30   60:iload_1         
	//   31   61:iconst_1        
	//   32   62:iadd            
	//   33   63:istore_1        
		} while(true);
	//   34   64:goto            15
	}

	public boolean onKey(View view, int i, KeyEvent keyevent)
	{
		if(keyevent.getAction() == 1 && i == 82)
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #516 <Method int KeyEvent.getAction()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          20
	//*   4    8:iload_2         
	//*   5    9:bipush          82
	//*   6   11:icmpne          20
		{
			dismiss();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #485 <Method void dismiss()>
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
		Iterator iterator = mShowingMenus.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field List mShowingMenus>
	//    2    4:invokeinterface #526 <Method Iterator List.iterator()>
	//    3    9:astore_2        
_L4:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//    4   10:aload_2         
	//    5   11:invokeinterface #531 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            47
_L1:
		CascadingMenuInfo cascadingmenuinfo = (CascadingMenuInfo)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #535 <Method Object Iterator.next()>
	//    9   25:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   10   28:astore_3        
		if(submenubuilder != cascadingmenuinfo.menu) goto _L4; else goto _L3
	//   11   29:aload_1         
	//   12   30:aload_3         
	//   13   31:getfield        #219 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//   14   34:if_acmpne       10
_L3:
		cascadingmenuinfo.getListView().requestFocus();
	//   15   37:aload_3         
	//   16   38:invokevirtual   #247 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   17   41:invokevirtual   #538 <Method boolean ListView.requestFocus()>
	//   18   44:pop             
_L6:
		return true;
	//   19   45:iconst_1        
	//   20   46:ireturn         
_L2:
		if(submenubuilder.hasVisibleItems())
	//*  21   47:aload_1         
	//*  22   48:invokevirtual   #543 <Method boolean SubMenuBuilder.hasVisibleItems()>
	//*  23   51:ifeq            79
		{
			addMenu(((MenuBuilder) (submenubuilder)));
	//   24   54:aload_0         
	//   25   55:aload_1         
	//   26   56:invokevirtual   #545 <Method void addMenu(MenuBuilder)>
			if(mPresenterCallback != null)
	//*  27   59:aload_0         
	//*  28   60:getfield        #487 <Field MenuPresenter$Callback mPresenterCallback>
	//*  29   63:ifnull          45
			{
				mPresenterCallback.onOpenSubMenu(((MenuBuilder) (submenubuilder)));
	//   30   66:aload_0         
	//   31   67:getfield        #487 <Field MenuPresenter$Callback mPresenterCallback>
	//   32   70:aload_1         
	//   33   71:invokeinterface #548 <Method boolean MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
	//   34   76:pop             
				return true;
	//   35   77:iconst_1        
	//   36   78:ireturn         
			}
		} else
		{
			return false;
	//   37   79:iconst_0        
	//   38   80:ireturn         
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	public void setAnchorView(View view)
	{
		if(mAnchorView != view)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field View mAnchorView>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       31
		{
			mAnchorView = view;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #107 <Field View mAnchorView>
			mDropDownGravity = GravityCompat.getAbsoluteGravity(mRawDropDownGravity, ViewCompat.getLayoutDirection(mAnchorView));
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #101 <Field int mRawDropDownGravity>
	//   10   18:aload_0         
	//   11   19:getfield        #107 <Field View mAnchorView>
	//   12   22:invokestatic    #286 <Method int ViewCompat.getLayoutDirection(View)>
	//   13   25:invokestatic    #553 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   14   28:putfield        #103 <Field int mDropDownGravity>
		}
	//   15   31:return          
	}

	public void setCallback(MenuPresenter.Callback callback)
	{
		mPresenterCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #487 <Field MenuPresenter$Callback mPresenterCallback>
	//    3    5:return          
	}

	public void setForceShowIcon(boolean flag)
	{
		mForceShowIcon = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #115 <Field boolean mForceShowIcon>
	//    3    5:return          
	}

	public void setGravity(int i)
	{
		if(mRawDropDownGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field int mRawDropDownGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          28
		{
			mRawDropDownGravity = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #101 <Field int mRawDropDownGravity>
			mDropDownGravity = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(mAnchorView));
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #107 <Field View mAnchorView>
	//   11   19:invokestatic    #286 <Method int ViewCompat.getLayoutDirection(View)>
	//   12   22:invokestatic    #553 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   13   25:putfield        #103 <Field int mDropDownGravity>
		}
	//   14   28:return          
	}

	public void setHorizontalOffset(int i)
	{
		mHasXOffset = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #420 <Field boolean mHasXOffset>
		mXOffset = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #422 <Field int mXOffset>
	//    6   10:return          
	}

	public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
	{
		mOnDismissListener = ondismisslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #506 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//    3    5:return          
	}

	public void setShowTitle(boolean flag)
	{
		mShowTitle = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #380 <Field boolean mShowTitle>
	//    3    5:return          
	}

	public void setVerticalOffset(int i)
	{
		mHasYOffset = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #424 <Field boolean mHasYOffset>
		mYOffset = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #426 <Field int mYOffset>
	//    6   10:return          
	}

	public void show()
	{
		if(!isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #322 <Method boolean isShowing()>
	//*   2    4:ifeq            8
	//*   3    7:return          
		{
			for(Iterator iterator = mPendingMenus.iterator(); iterator.hasNext(); showMenu((MenuBuilder)iterator.next()));
	//    4    8:aload_0         
	//    5    9:getfield        #83  <Field List mPendingMenus>
	//    6   12:invokeinterface #526 <Method Iterator List.iterator()>
	//    7   17:astore_2        
	//    8   18:aload_2         
	//    9   19:invokeinterface #531 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            43
	//   11   27:aload_0         
	//   12   28:aload_2         
	//   13   29:invokeinterface #535 <Method Object Iterator.next()>
	//   14   34:checkcast       #223 <Class MenuBuilder>
	//   15   37:invokespecial   #440 <Method void showMenu(MenuBuilder)>
	//*  16   40:goto            18
			mPendingMenus.clear();
	//   17   43:aload_0         
	//   18   44:getfield        #83  <Field List mPendingMenus>
	//   19   47:invokeinterface #560 <Method void List.clear()>
			mShownAnchorView = mAnchorView;
	//   20   52:aload_0         
	//   21   53:aload_0         
	//   22   54:getfield        #107 <Field View mAnchorView>
	//   23   57:putfield        #296 <Field View mShownAnchorView>
			if(mShownAnchorView != null)
	//*  24   60:aload_0         
	//*  25   61:getfield        #296 <Field View mShownAnchorView>
	//*  26   64:ifnull          7
			{
				boolean flag;
				if(mTreeObserver == null)
	//*  27   67:aload_0         
	//*  28   68:getfield        #166 <Field ViewTreeObserver mTreeObserver>
	//*  29   71:ifnonnull       114
					flag = true;
	//   30   74:iconst_1        
	//   31   75:istore_1        
				else
	//*  32   76:aload_0         
	//*  33   77:aload_0         
	//*  34   78:getfield        #296 <Field View mShownAnchorView>
	//*  35   81:invokevirtual   #564 <Method ViewTreeObserver View.getViewTreeObserver()>
	//*  36   84:putfield        #166 <Field ViewTreeObserver mTreeObserver>
	//*  37   87:iload_1         
	//*  38   88:ifeq            102
	//*  39   91:aload_0         
	//*  40   92:getfield        #166 <Field ViewTreeObserver mTreeObserver>
	//*  41   95:aload_0         
	//*  42   96:getfield        #93  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//*  43   99:invokevirtual   #567 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//*  44  102:aload_0         
	//*  45  103:getfield        #296 <Field View mShownAnchorView>
	//*  46  106:aload_0         
	//*  47  107:getfield        #96  <Field android.view.View$OnAttachStateChangeListener mAttachStateChangeListener>
	//*  48  110:invokevirtual   #570 <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
	//*  49  113:return          
					flag = false;
	//   50  114:iconst_0        
	//   51  115:istore_1        
				mTreeObserver = mShownAnchorView.getViewTreeObserver();
				if(flag)
					mTreeObserver.addOnGlobalLayoutListener(mGlobalLayoutListener);
				mShownAnchorView.addOnAttachStateChangeListener(mAttachStateChangeListener);
				return;
			}
		}
	//*  52  116:goto            76
	}

	public void updateMenuView(boolean flag)
	{
		for(Iterator iterator = mShowingMenus.iterator(); iterator.hasNext(); toMenuAdapter(((CascadingMenuInfo)iterator.next()).getListView().getAdapter()).notifyDataSetChanged());
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field List mShowingMenus>
	//    2    4:invokeinterface #526 <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #531 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            43
	//    7   19:aload_2         
	//    8   20:invokeinterface #535 <Method Object Iterator.next()>
	//    9   25:checkcast       #20  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   10   28:invokevirtual   #247 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   11   31:invokevirtual   #253 <Method android.widget.ListAdapter ListView.getAdapter()>
	//   12   34:invokestatic    #575 <Method MenuAdapter toMenuAdapter(android.widget.ListAdapter)>
	//   13   37:invokevirtual   #578 <Method void MenuAdapter.notifyDataSetChanged()>
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
		//*   3    7:ifeq            76
		//*   4   10:aload_0         
		//*   5   11:getfield        #14  <Field CascadingMenuPopup this$0>
		//*   6   14:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
		//*   7   17:invokeinterface #33  <Method int List.size()>
		//*   8   22:ifle            76
		//*   9   25:aload_0         
		//*  10   26:getfield        #14  <Field CascadingMenuPopup this$0>
		//*  11   29:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
		//*  12   32:iconst_0        
		//*  13   33:invokeinterface #37  <Method Object List.get(int)>
		//*  14   38:checkcast       #39  <Class CascadingMenuPopup$CascadingMenuInfo>
		//*  15   41:getfield        #43  <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
		//*  16   44:invokevirtual   #48  <Method boolean MenuPopupWindow.isModal()>
		//*  17   47:ifne            76
			{
				View view1 = mShownAnchorView;
		//   18   50:aload_0         
		//   19   51:getfield        #14  <Field CascadingMenuPopup this$0>
		//   20   54:getfield        #52  <Field View CascadingMenuPopup.mShownAnchorView>
		//   21   57:astore_1        
				if(view1 == null || !view1.isShown())
		//*  22   58:aload_1         
		//*  23   59:ifnull          69
		//*  24   62:aload_1         
		//*  25   63:invokevirtual   #57  <Method boolean View.isShown()>
		//*  26   66:ifne            77
				{
					dismiss();
		//   27   69:aload_0         
		//   28   70:getfield        #14  <Field CascadingMenuPopup this$0>
		//   29   73:invokevirtual   #60  <Method void CascadingMenuPopup.dismiss()>
				} else
		//*  30   76:return          
				{
					Iterator iterator = mShowingMenus.iterator();
		//   31   77:aload_0         
		//   32   78:getfield        #14  <Field CascadingMenuPopup this$0>
		//   33   81:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
		//   34   84:invokeinterface #64  <Method Iterator List.iterator()>
		//   35   89:astore_1        
					while(iterator.hasNext()) 
		//*  36   90:aload_1         
		//*  37   91:invokeinterface #69  <Method boolean Iterator.hasNext()>
		//*  38   96:ifeq            76
						((CascadingMenuInfo)iterator.next()).window.show();
		//   39   99:aload_1         
		//   40  100:invokeinterface #73  <Method Object Iterator.next()>
		//   41  105:checkcast       #39  <Class CascadingMenuPopup$CascadingMenuInfo>
		//   42  108:getfield        #43  <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
		//   43  111:invokevirtual   #76  <Method void MenuPopupWindow.show()>
				}
			}
		//*  44  114:goto            90
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
			mSubMenuHoverHandler.removeCallbacksAndMessages(((Object) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field CascadingMenuPopup this$0>
		//    2    4:getfield        #27  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
		//    3    7:aconst_null     
		//    4    8:invokevirtual   #33  <Method void Handler.removeCallbacksAndMessages(Object)>
			byte byte0 = -1;
		//    5   11:iconst_m1       
		//    6   12:istore          5
			int k = 0;
		//    7   14:iconst_0        
		//    8   15:istore_3        
			int i1 = mShowingMenus.size();
		//    9   16:aload_0         
		//   10   17:getfield        #16  <Field CascadingMenuPopup this$0>
		//   11   20:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//   12   23:invokeinterface #43  <Method int List.size()>
		//   13   28:istore          6
			int l;
label0:
			do
			{
label1:
				{
					l = ((int) (byte0));
		//   14   30:iload           5
		//   15   32:istore          4
					if(k < i1)
		//*  16   34:iload_3         
		//*  17   35:iload           6
		//*  18   37:icmpge          66
					{
						if(menubuilder != ((CascadingMenuInfo)mShowingMenus.get(k)).menu)
							break label1;
		//   19   40:aload_1         
		//   20   41:aload_0         
		//   21   42:getfield        #16  <Field CascadingMenuPopup this$0>
		//   22   45:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//   23   48:iload_3         
		//   24   49:invokeinterface #47  <Method Object List.get(int)>
		//   25   54:checkcast       #49  <Class CascadingMenuPopup$CascadingMenuInfo>
		//   26   57:getfield        #53  <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
		//   27   60:if_acmpne       73
						l = k;
		//   28   63:iload_3         
		//   29   64:istore          4
					}
					if(l == -1)
		//*  30   66:iload           4
		//*  31   68:iconst_m1       
		//*  32   69:icmpne          80
						return;
		//   33   72:return          
					break label0;
				}
				k++;
		//   34   73:iload_3         
		//   35   74:iconst_1        
		//   36   75:iadd            
		//   37   76:istore_3        
			} while(true);
		//   38   77:goto            30
			k = l + 1;
		//   39   80:iload           4
		//   40   82:iconst_1        
		//   41   83:iadd            
		//   42   84:istore_3        
			long l1;
			final CascadingMenuInfo nextInfo;
			if(k < mShowingMenus.size())
		//*  43   85:iload_3         
		//*  44   86:aload_0         
		//*  45   87:getfield        #16  <Field CascadingMenuPopup this$0>
		//*  46   90:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//*  47   93:invokeinterface #43  <Method int List.size()>
		//*  48   98:icmpge          157
				nextInfo = (CascadingMenuInfo)mShowingMenus.get(k);
		//   49  101:aload_0         
		//   50  102:getfield        #16  <Field CascadingMenuPopup this$0>
		//   51  105:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//   52  108:iload_3         
		//   53  109:invokeinterface #47  <Method Object List.get(int)>
		//   54  114:checkcast       #49  <Class CascadingMenuPopup$CascadingMenuInfo>
		//   55  117:astore          9
			else
		//*  56  119:new             #10  <Class CascadingMenuPopup$3$1>
		//*  57  122:dup             
		//*  58  123:aload_0         
		//*  59  124:aload           9
		//*  60  126:aload_2         
		//*  61  127:aload_1         
		//*  62  128:invokespecial   #56  <Method void CascadingMenuPopup$3$1(CascadingMenuPopup$3, CascadingMenuPopup$CascadingMenuInfo, MenuItem, MenuBuilder)>
		//*  63  131:astore_2        
		//*  64  132:invokestatic    #62  <Method long SystemClock.uptimeMillis()>
		//*  65  135:lstore          7
		//*  66  137:aload_0         
		//*  67  138:getfield        #16  <Field CascadingMenuPopup this$0>
		//*  68  141:getfield        #27  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
		//*  69  144:aload_2         
		//*  70  145:aload_1         
		//*  71  146:lload           7
		//*  72  148:ldc2w           #63  <Long 200L>
		//*  73  151:ladd            
		//*  74  152:invokevirtual   #68  <Method boolean Handler.postAtTime(Runnable, Object, long)>
		//*  75  155:pop             
		//*  76  156:return          
				nextInfo = null;
		//   77  157:aconst_null     
		//   78  158:astore          9
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
			l1 = SystemClock.uptimeMillis();
			mSubMenuHoverHandler.postAtTime(((Runnable) (item)), ((Object) (menubuilder)), l1 + 200L);
		//*  79  160:goto            119
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
	private final List mPendingMenus = new LinkedList();
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
	//    1    1:getfield        #166 <Field ViewTreeObserver mTreeObserver>
	//    2    4:areturn         
	}

*/


/*
	static ViewTreeObserver access$002(CascadingMenuPopup cascadingmenupopup, ViewTreeObserver viewtreeobserver)
	{
		cascadingmenupopup.mTreeObserver = viewtreeobserver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #166 <Field ViewTreeObserver mTreeObserver>
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
	//    1    1:getfield        #93  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//    2    4:areturn         
	}

*/
}
