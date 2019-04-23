// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.view.ac;
import android.support.v4.view.l;
import android.support.v7.widget.MenuItemHoverListener;
import android.support.v7.widget.MenuPopupWindow;
import android.util.DisplayMetrics;
import android.view.*;
import android.widget.*;
import java.util.*;

// Referenced classes of package android.support.v7.view.menu:
//			MenuPopup, MenuPresenter, MenuBuilder, MenuAdapter, 
//			a

final class CascadingMenuPopup extends MenuPopup
	implements MenuPresenter, android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener
{

	public CascadingMenuPopup(Context context, View view, int i, int j, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void MenuPopup()>
	//    2    4:aload_0         
	//    3    5:new             #71  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #72  <Method void ArrayList()>
	//    6   12:putfield        #74  <Field List mPendingMenus>
	//    7   15:aload_0         
	//    8   16:new             #71  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #72  <Method void ArrayList()>
	//   11   23:putfield        #76  <Field List mShowingMenus>
	//   12   26:aload_0         
	//   13   27:new             #78  <Class CascadingMenuPopup$1>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #81  <Method void CascadingMenuPopup$1(CascadingMenuPopup)>
	//   17   35:putfield        #83  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//   18   38:aload_0         
	//   19   39:new             #85  <Class CascadingMenuPopup$2>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:invokespecial   #86  <Method void CascadingMenuPopup$2(CascadingMenuPopup)>
	//   23   47:putfield        #88  <Field android.view.View$OnAttachStateChangeListener mAttachStateChangeListener>
	//   24   50:aload_0         
	//   25   51:new             #90  <Class CascadingMenuPopup$3>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:invokespecial   #91  <Method void CascadingMenuPopup$3(CascadingMenuPopup)>
	//   29   59:putfield        #93  <Field MenuItemHoverListener mMenuItemHoverListener>
		mRawDropDownGravity = 0;
	//   30   62:aload_0         
	//   31   63:iconst_0        
	//   32   64:putfield        #95  <Field int mRawDropDownGravity>
		mDropDownGravity = 0;
	//   33   67:aload_0         
	//   34   68:iconst_0        
	//   35   69:putfield        #97  <Field int mDropDownGravity>
		mContext = context;
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:putfield        #99  <Field Context mContext>
		mAnchorView = view;
	//   39   77:aload_0         
	//   40   78:aload_2         
	//   41   79:putfield        #101 <Field View mAnchorView>
		mPopupStyleAttr = i;
	//   42   82:aload_0         
	//   43   83:iload_3         
	//   44   84:putfield        #103 <Field int mPopupStyleAttr>
		mPopupStyleRes = j;
	//   45   87:aload_0         
	//   46   88:iload           4
	//   47   90:putfield        #105 <Field int mPopupStyleRes>
		mOverflowOnly = flag;
	//   48   93:aload_0         
	//   49   94:iload           5
	//   50   96:putfield        #107 <Field boolean mOverflowOnly>
		mForceShowIcon = false;
	//   51   99:aload_0         
	//   52  100:iconst_0        
	//   53  101:putfield        #109 <Field boolean mForceShowIcon>
		mLastPosition = getInitialMenuPosition();
	//   54  104:aload_0         
	//   55  105:aload_0         
	//   56  106:invokespecial   #113 <Method int getInitialMenuPosition()>
	//   57  109:putfield        #115 <Field int mLastPosition>
		context = ((Context) (context.getResources()));
	//   58  112:aload_1         
	//   59  113:invokevirtual   #121 <Method Resources Context.getResources()>
	//   60  116:astore_1        
		mMenuMaxWidth = Math.max(((Resources) (context)).getDisplayMetrics().widthPixels / 2, ((Resources) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_config_prefDialogWidth));
	//   61  117:aload_0         
	//   62  118:aload_1         
	//   63  119:invokevirtual   #127 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   64  122:getfield        #132 <Field int DisplayMetrics.widthPixels>
	//   65  125:iconst_2        
	//   66  126:idiv            
	//   67  127:aload_1         
	//   68  128:getstatic       #137 <Field int android.support.v7.appcompat.R$dimen.abc_config_prefDialogWidth>
	//   69  131:invokevirtual   #141 <Method int Resources.getDimensionPixelSize(int)>
	//   70  134:invokestatic    #147 <Method int Math.max(int, int)>
	//   71  137:putfield        #149 <Field int mMenuMaxWidth>
	//   72  140:aload_0         
	//   73  141:new             #151 <Class Handler>
	//   74  144:dup             
	//   75  145:invokespecial   #152 <Method void Handler()>
	//   76  148:putfield        #154 <Field Handler mSubMenuHoverHandler>
	//   77  151:return          
	}

	private MenuPopupWindow createPopupWindow()
	{
		MenuPopupWindow menupopupwindow = new MenuPopupWindow(mContext, ((android.util.AttributeSet) (null)), mPopupStyleAttr, mPopupStyleRes);
	//    0    0:new             #158 <Class MenuPopupWindow>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #99  <Field Context mContext>
	//    4    8:aconst_null     
	//    5    9:aload_0         
	//    6   10:getfield        #103 <Field int mPopupStyleAttr>
	//    7   13:aload_0         
	//    8   14:getfield        #105 <Field int mPopupStyleRes>
	//    9   17:invokespecial   #161 <Method void MenuPopupWindow(Context, android.util.AttributeSet, int, int)>
	//   10   20:astore_1        
		menupopupwindow.setHoverListener(mMenuItemHoverListener);
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #93  <Field MenuItemHoverListener mMenuItemHoverListener>
	//   14   26:invokevirtual   #165 <Method void MenuPopupWindow.setHoverListener(MenuItemHoverListener)>
		menupopupwindow.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (this)));
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #169 <Method void MenuPopupWindow.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		menupopupwindow.setOnDismissListener(((android.widget.PopupWindow.OnDismissListener) (this)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:invokevirtual   #173 <Method void MenuPopupWindow.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
		menupopupwindow.setAnchorView(mAnchorView);
	//   21   39:aload_1         
	//   22   40:aload_0         
	//   23   41:getfield        #101 <Field View mAnchorView>
	//   24   44:invokevirtual   #177 <Method void MenuPopupWindow.setAnchorView(View)>
		menupopupwindow.setDropDownGravity(mDropDownGravity);
	//   25   47:aload_1         
	//   26   48:aload_0         
	//   27   49:getfield        #97  <Field int mDropDownGravity>
	//   28   52:invokevirtual   #181 <Method void MenuPopupWindow.setDropDownGravity(int)>
		menupopupwindow.setModal(true);
	//   29   55:aload_1         
	//   30   56:iconst_1        
	//   31   57:invokevirtual   #185 <Method void MenuPopupWindow.setModal(boolean)>
		menupopupwindow.setInputMethodMode(2);
	//   32   60:aload_1         
	//   33   61:iconst_2        
	//   34   62:invokevirtual   #188 <Method void MenuPopupWindow.setInputMethodMode(int)>
		return menupopupwindow;
	//   35   65:aload_1         
	//   36   66:areturn         
	}

	private int findIndexOfAddedMenu(MenuBuilder menubuilder)
	{
		int j = mShowingMenus.size();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field List mShowingMenus>
	//    2    4:invokeinterface #195 <Method int List.size()>
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
	//*  11   19:getfield        #76  <Field List mShowingMenus>
	//*  12   22:iload_2         
	//*  13   23:invokeinterface #199 <Method Object List.get(int)>
	//*  14   28:checkcast       #201 <Class CascadingMenuPopup$CascadingMenuInfo>
	//*  15   31:getfield        #205 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
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
	//    1    1:invokevirtual   #210 <Method int MenuBuilder.size()>
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
	//   10   16:invokevirtual   #214 <Method MenuItem MenuBuilder.getItem(int)>
	//   11   19:astore          5
			if(menuitem.hasSubMenu() && menubuilder1 == menuitem.getSubMenu())
	//*  12   21:aload           5
	//*  13   23:invokeinterface #220 <Method boolean MenuItem.hasSubMenu()>
	//*  14   28:ifeq            45
	//*  15   31:aload_2         
	//*  16   32:aload           5
	//*  17   34:invokeinterface #224 <Method android.view.SubMenu MenuItem.getSubMenu()>
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
	//    2    2:getfield        #205 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//    3    5:aload_2         
	//    4    6:invokespecial   #228 <Method MenuItem findMenuItemForSubmenu(MenuBuilder, MenuBuilder)>
	//    5    9:astore_2        
			if(menubuilder == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       16
				return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
			listview = cascadingmenuinfo.getListView();
	//   10   16:aload_1         
	//   11   17:invokevirtual   #232 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   12   20:astore          7
			cascadingmenuinfo = ((CascadingMenuInfo) (listview.getAdapter()));
	//   13   22:aload           7
	//   14   24:invokevirtual   #238 <Method android.widget.ListAdapter ListView.getAdapter()>
	//   15   27:astore_1        
			boolean flag = cascadingmenuinfo instanceof HeaderViewListAdapter;
	//   16   28:aload_1         
	//   17   29:instanceof      #240 <Class HeaderViewListAdapter>
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
	//   24   42:checkcast       #240 <Class HeaderViewListAdapter>
	//   25   45:astore_1        
				j = ((HeaderViewListAdapter) (cascadingmenuinfo)).getHeadersCount();
	//   26   46:aload_1         
	//   27   47:invokevirtual   #243 <Method int HeaderViewListAdapter.getHeadersCount()>
	//   28   50:istore          4
				cascadingmenuinfo = ((CascadingMenuInfo) ((MenuAdapter)((HeaderViewListAdapter) (cascadingmenuinfo)).getWrappedAdapter()));
	//   29   52:aload_1         
	//   30   53:invokevirtual   #246 <Method android.widget.ListAdapter HeaderViewListAdapter.getWrappedAdapter()>
	//   31   56:checkcast       #248 <Class MenuAdapter>
	//   32   59:astore_1        
			} else
	//*  33   60:goto            71
			{
				cascadingmenuinfo = ((CascadingMenuInfo) ((MenuAdapter)cascadingmenuinfo));
	//   34   63:aload_1         
	//   35   64:checkcast       #248 <Class MenuAdapter>
	//   36   67:astore_1        
				j = 0;
	//   37   68:iconst_0        
	//   38   69:istore          4
			}
			for(int k = ((MenuAdapter) (cascadingmenuinfo)).getCount(); i < k; i++)
	//*  39   71:aload_1         
	//*  40   72:invokevirtual   #251 <Method int MenuAdapter.getCount()>
	//*  41   75:istore          5
	//*  42   77:iload_3         
	//*  43   78:iload           5
	//*  44   80:icmpge          102
				if(menubuilder == ((MenuAdapter) (cascadingmenuinfo)).getItem(i))
	//*  45   83:aload_2         
	//*  46   84:aload_1         
	//*  47   85:iload_3         
	//*  48   86:invokevirtual   #254 <Method MenuItemImpl MenuAdapter.getItem(int)>
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
	//   67  117:invokevirtual   #257 <Method int ListView.getFirstVisiblePosition()>
	//   68  120:isub            
	//   69  121:istore_3        
		if(i >= 0)
	//*  70  122:iload_3         
	//*  71  123:iflt            144
		{
			if(i >= listview.getChildCount())
	//*  72  126:iload_3         
	//*  73  127:aload           7
	//*  74  129:invokevirtual   #260 <Method int ListView.getChildCount()>
	//*  75  132:icmplt          137
				return null;
	//   76  135:aconst_null     
	//   77  136:areturn         
			else
				return listview.getChildAt(i);
	//   78  137:aload           7
	//   79  139:iload_3         
	//   80  140:invokevirtual   #264 <Method View ListView.getChildAt(int)>
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
		int j = ac.f(mAnchorView);
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field View mAnchorView>
	//    2    4:invokestatic    #270 <Method int ac.f(View)>
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
		Object obj = ((Object) (mShowingMenus));
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field List mShowingMenus>
	//    2    4:astore_2        
		obj = ((Object) (((CascadingMenuInfo)((List) (obj)).get(((List) (obj)).size() - 1)).getListView()));
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:invokeinterface #195 <Method int List.size()>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:invokeinterface #199 <Method Object List.get(int)>
	//    9   19:checkcast       #201 <Class CascadingMenuPopup$CascadingMenuInfo>
	//   10   22:invokevirtual   #232 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   11   25:astore_2        
		int ai[] = new int[2];
	//   12   26:iconst_2        
	//   13   27:newarray        int[]
	//   14   29:astore_3        
		((ListView) (obj)).getLocationOnScreen(ai);
	//   15   30:aload_2         
	//   16   31:aload_3         
	//   17   32:invokevirtual   #275 <Method void ListView.getLocationOnScreen(int[])>
		Rect rect = new Rect();
	//   18   35:new             #277 <Class Rect>
	//   19   38:dup             
	//   20   39:invokespecial   #278 <Method void Rect()>
	//   21   42:astore          4
		mShownAnchorView.getWindowVisibleDisplayFrame(rect);
	//   22   44:aload_0         
	//   23   45:getfield        #280 <Field View mShownAnchorView>
	//   24   48:aload           4
	//   25   50:invokevirtual   #286 <Method void View.getWindowVisibleDisplayFrame(Rect)>
		if(mLastPosition == 1)
	//*  26   53:aload_0         
	//*  27   54:getfield        #115 <Field int mLastPosition>
	//*  28   57:iconst_1        
	//*  29   58:icmpne          83
			return ai[0] + ((ListView) (obj)).getWidth() + i <= rect.right ? 1 : 0;
	//   30   61:aload_3         
	//   31   62:iconst_0        
	//   32   63:iaload          
	//   33   64:aload_2         
	//   34   65:invokevirtual   #289 <Method int ListView.getWidth()>
	//   35   68:iadd            
	//   36   69:iload_1         
	//   37   70:iadd            
	//   38   71:aload           4
	//   39   73:getfield        #292 <Field int Rect.right>
	//   40   76:icmple          81
	//   41   79:iconst_0        
	//   42   80:ireturn         
	//   43   81:iconst_1        
	//   44   82:ireturn         
		return ai[0] - i >= 0 ? 0 : 1;
	//   45   83:aload_3         
	//   46   84:iconst_0        
	//   47   85:iaload          
	//   48   86:iload_1         
	//   49   87:isub            
	//   50   88:ifge            93
	//   51   91:iconst_1        
	//   52   92:ireturn         
	//   53   93:iconst_0        
	//   54   94:ireturn         
	}

	private void showMenu(MenuBuilder menubuilder)
	{
		Object obj2 = ((Object) (LayoutInflater.from(mContext)));
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Context mContext>
	//    2    4:invokestatic    #300 <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    7:astore          9
		Object obj = ((Object) (new MenuAdapter(menubuilder, ((LayoutInflater) (obj2)), mOverflowOnly, ITEM_LAYOUT)));
	//    4    9:new             #248 <Class MenuAdapter>
	//    5   12:dup             
	//    6   13:aload_1         
	//    7   14:aload           9
	//    8   16:aload_0         
	//    9   17:getfield        #107 <Field boolean mOverflowOnly>
	//   10   20:getstatic       #64  <Field int ITEM_LAYOUT>
	//   11   23:invokespecial   #303 <Method void MenuAdapter(MenuBuilder, LayoutInflater, boolean, int)>
	//   12   26:astore          6
		if(!isShowing() && mForceShowIcon)
	//*  13   28:aload_0         
	//*  14   29:invokevirtual   #306 <Method boolean isShowing()>
	//*  15   32:ifne            51
	//*  16   35:aload_0         
	//*  17   36:getfield        #109 <Field boolean mForceShowIcon>
	//*  18   39:ifeq            51
			((MenuAdapter) (obj)).setForceShowIcon(true);
	//   19   42:aload           6
	//   20   44:iconst_1        
	//   21   45:invokevirtual   #309 <Method void MenuAdapter.setForceShowIcon(boolean)>
		else
	//*  22   48:goto            67
		if(isShowing())
	//*  23   51:aload_0         
	//*  24   52:invokevirtual   #306 <Method boolean isShowing()>
	//*  25   55:ifeq            67
			((MenuAdapter) (obj)).setForceShowIcon(MenuPopup.shouldPreserveIconSpacing(menubuilder));
	//   26   58:aload           6
	//   27   60:aload_1         
	//   28   61:invokestatic    #313 <Method boolean MenuPopup.shouldPreserveIconSpacing(MenuBuilder)>
	//   29   64:invokevirtual   #309 <Method void MenuAdapter.setForceShowIcon(boolean)>
		int i1 = measureIndividualMenuWidth(((android.widget.ListAdapter) (obj)), ((android.view.ViewGroup) (null)), mContext, mMenuMaxWidth);
	//   30   67:aload           6
	//   31   69:aconst_null     
	//   32   70:aload_0         
	//   33   71:getfield        #99  <Field Context mContext>
	//   34   74:aload_0         
	//   35   75:getfield        #149 <Field int mMenuMaxWidth>
	//   36   78:invokestatic    #317 <Method int measureIndividualMenuWidth(android.widget.ListAdapter, android.view.ViewGroup, Context, int)>
	//   37   81:istore          5
		MenuPopupWindow menupopupwindow = createPopupWindow();
	//   38   83:aload_0         
	//   39   84:invokespecial   #319 <Method MenuPopupWindow createPopupWindow()>
	//   40   87:astore          8
		menupopupwindow.setAdapter(((android.widget.ListAdapter) (obj)));
	//   41   89:aload           8
	//   42   91:aload           6
	//   43   93:invokevirtual   #323 <Method void MenuPopupWindow.setAdapter(android.widget.ListAdapter)>
		menupopupwindow.setContentWidth(i1);
	//   44   96:aload           8
	//   45   98:iload           5
	//   46  100:invokevirtual   #326 <Method void MenuPopupWindow.setContentWidth(int)>
		menupopupwindow.setDropDownGravity(mDropDownGravity);
	//   47  103:aload           8
	//   48  105:aload_0         
	//   49  106:getfield        #97  <Field int mDropDownGravity>
	//   50  109:invokevirtual   #181 <Method void MenuPopupWindow.setDropDownGravity(int)>
		Object obj1;
		if(mShowingMenus.size() > 0)
	//*  51  112:aload_0         
	//*  52  113:getfield        #76  <Field List mShowingMenus>
	//*  53  116:invokeinterface #195 <Method int List.size()>
	//*  54  121:ifle            163
		{
			obj = ((Object) (mShowingMenus));
	//   55  124:aload_0         
	//   56  125:getfield        #76  <Field List mShowingMenus>
	//   57  128:astore          6
			obj = ((Object) ((CascadingMenuInfo)((List) (obj)).get(((List) (obj)).size() - 1)));
	//   58  130:aload           6
	//   59  132:aload           6
	//   60  134:invokeinterface #195 <Method int List.size()>
	//   61  139:iconst_1        
	//   62  140:isub            
	//   63  141:invokeinterface #199 <Method Object List.get(int)>
	//   64  146:checkcast       #201 <Class CascadingMenuPopup$CascadingMenuInfo>
	//   65  149:astore          6
			obj1 = ((Object) (findParentViewForSubmenu(((CascadingMenuInfo) (obj)), menubuilder)));
	//   66  151:aload_0         
	//   67  152:aload           6
	//   68  154:aload_1         
	//   69  155:invokespecial   #328 <Method View findParentViewForSubmenu(CascadingMenuPopup$CascadingMenuInfo, MenuBuilder)>
	//   70  158:astore          7
		} else
	//*  71  160:goto            170
		{
			obj = null;
	//   72  163:aconst_null     
	//   73  164:astore          6
			obj1 = obj;
	//   74  166:aload           6
	//   75  168:astore          7
		}
		if(obj1 != null)
	//*  76  170:aload           7
	//*  77  172:ifnull          400
		{
			menupopupwindow.setTouchModal(false);
	//   78  175:aload           8
	//   79  177:iconst_0        
	//   80  178:invokevirtual   #331 <Method void MenuPopupWindow.setTouchModal(boolean)>
			menupopupwindow.setEnterTransition(((Object) (null)));
	//   81  181:aload           8
	//   82  183:aconst_null     
	//   83  184:invokevirtual   #335 <Method void MenuPopupWindow.setEnterTransition(Object)>
			int j = getNextMenuPosition(i1);
	//   84  187:aload_0         
	//   85  188:iload           5
	//   86  190:invokespecial   #337 <Method int getNextMenuPosition(int)>
	//   87  193:istore_3        
			int i;
			if(j == 1)
	//*  88  194:iload_3         
	//*  89  195:iconst_1        
	//*  90  196:icmpne          204
				i = 1;
	//   91  199:iconst_1        
	//   92  200:istore_2        
			else
	//*  93  201:goto            206
				i = 0;
	//   94  204:iconst_0        
	//   95  205:istore_2        
			mLastPosition = j;
	//   96  206:aload_0         
	//   97  207:iload_3         
	//   98  208:putfield        #115 <Field int mLastPosition>
			int k;
			if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  99  211:getstatic       #342 <Field int android.os.Build$VERSION.SDK_INT>
	//* 100  214:bipush          26
	//* 101  216:icmplt          234
			{
				menupopupwindow.setAnchorView(((View) (obj1)));
	//  102  219:aload           8
	//  103  221:aload           7
	//  104  223:invokevirtual   #177 <Method void MenuPopupWindow.setAnchorView(View)>
				j = 0;
	//  105  226:iconst_0        
	//  106  227:istore_3        
				k = 0;
	//  107  228:iconst_0        
	//  108  229:istore          4
			} else
	//* 109  231:goto            322
			{
				int ai[] = new int[2];
	//  110  234:iconst_2        
	//  111  235:newarray        int[]
	//  112  237:astore          10
				mAnchorView.getLocationOnScreen(ai);
	//  113  239:aload_0         
	//  114  240:getfield        #101 <Field View mAnchorView>
	//  115  243:aload           10
	//  116  245:invokevirtual   #343 <Method void View.getLocationOnScreen(int[])>
				int ai1[] = new int[2];
	//  117  248:iconst_2        
	//  118  249:newarray        int[]
	//  119  251:astore          11
				((View) (obj1)).getLocationOnScreen(ai1);
	//  120  253:aload           7
	//  121  255:aload           11
	//  122  257:invokevirtual   #343 <Method void View.getLocationOnScreen(int[])>
				if((mDropDownGravity & 7) == 5)
	//* 123  260:aload_0         
	//* 124  261:getfield        #97  <Field int mDropDownGravity>
	//* 125  264:bipush          7
	//* 126  266:iand            
	//* 127  267:iconst_5        
	//* 128  268:icmpne          301
				{
					ai[0] = ai[0] + mAnchorView.getWidth();
	//  129  271:aload           10
	//  130  273:iconst_0        
	//  131  274:aload           10
	//  132  276:iconst_0        
	//  133  277:iaload          
	//  134  278:aload_0         
	//  135  279:getfield        #101 <Field View mAnchorView>
	//  136  282:invokevirtual   #344 <Method int View.getWidth()>
	//  137  285:iadd            
	//  138  286:iastore         
					ai1[0] = ai1[0] + ((View) (obj1)).getWidth();
	//  139  287:aload           11
	//  140  289:iconst_0        
	//  141  290:aload           11
	//  142  292:iconst_0        
	//  143  293:iaload          
	//  144  294:aload           7
	//  145  296:invokevirtual   #344 <Method int View.getWidth()>
	//  146  299:iadd            
	//  147  300:iastore         
				}
				k = ai1[0] - ai[0];
	//  148  301:aload           11
	//  149  303:iconst_0        
	//  150  304:iaload          
	//  151  305:aload           10
	//  152  307:iconst_0        
	//  153  308:iaload          
	//  154  309:isub            
	//  155  310:istore          4
				j = ai1[1] - ai[1];
	//  156  312:aload           11
	//  157  314:iconst_1        
	//  158  315:iaload          
	//  159  316:aload           10
	//  160  318:iconst_1        
	//  161  319:iaload          
	//  162  320:isub            
	//  163  321:istore_3        
			}
			if((mDropDownGravity & 5) == 5)
	//* 164  322:aload_0         
	//* 165  323:getfield        #97  <Field int mDropDownGravity>
	//* 166  326:iconst_5        
	//* 167  327:iand            
	//* 168  328:iconst_5        
	//* 169  329:icmpne          357
			{
				if(i != 0)
	//* 170  332:iload_2         
	//* 171  333:ifeq            345
					i = k + i1;
	//  172  336:iload           4
	//  173  338:iload           5
	//  174  340:iadd            
	//  175  341:istore_2        
				else
	//* 176  342:goto            379
					i = k - ((View) (obj1)).getWidth();
	//  177  345:iload           4
	//  178  347:aload           7
	//  179  349:invokevirtual   #344 <Method int View.getWidth()>
	//  180  352:isub            
	//  181  353:istore_2        
			} else
	//* 182  354:goto            379
			if(i != 0)
	//* 183  357:iload_2         
	//* 184  358:ifeq            373
				i = k + ((View) (obj1)).getWidth();
	//  185  361:iload           4
	//  186  363:aload           7
	//  187  365:invokevirtual   #344 <Method int View.getWidth()>
	//  188  368:iadd            
	//  189  369:istore_2        
			else
	//* 190  370:goto            379
				i = k - i1;
	//  191  373:iload           4
	//  192  375:iload           5
	//  193  377:isub            
	//  194  378:istore_2        
			menupopupwindow.setHorizontalOffset(i);
	//  195  379:aload           8
	//  196  381:iload_2         
	//  197  382:invokevirtual   #347 <Method void MenuPopupWindow.setHorizontalOffset(int)>
			menupopupwindow.setOverlapAnchor(true);
	//  198  385:aload           8
	//  199  387:iconst_1        
	//  200  388:invokevirtual   #350 <Method void MenuPopupWindow.setOverlapAnchor(boolean)>
			menupopupwindow.setVerticalOffset(j);
	//  201  391:aload           8
	//  202  393:iload_3         
	//  203  394:invokevirtual   #353 <Method void MenuPopupWindow.setVerticalOffset(int)>
		} else
	//* 204  397:goto            441
		{
			if(mHasXOffset)
	//* 205  400:aload_0         
	//* 206  401:getfield        #355 <Field boolean mHasXOffset>
	//* 207  404:ifeq            416
				menupopupwindow.setHorizontalOffset(mXOffset);
	//  208  407:aload           8
	//  209  409:aload_0         
	//  210  410:getfield        #357 <Field int mXOffset>
	//  211  413:invokevirtual   #347 <Method void MenuPopupWindow.setHorizontalOffset(int)>
			if(mHasYOffset)
	//* 212  416:aload_0         
	//* 213  417:getfield        #359 <Field boolean mHasYOffset>
	//* 214  420:ifeq            432
				menupopupwindow.setVerticalOffset(mYOffset);
	//  215  423:aload           8
	//  216  425:aload_0         
	//  217  426:getfield        #361 <Field int mYOffset>
	//  218  429:invokevirtual   #353 <Method void MenuPopupWindow.setVerticalOffset(int)>
			menupopupwindow.setEpicenterBounds(getEpicenterBounds());
	//  219  432:aload           8
	//  220  434:aload_0         
	//  221  435:invokevirtual   #365 <Method Rect getEpicenterBounds()>
	//  222  438:invokevirtual   #368 <Method void MenuPopupWindow.setEpicenterBounds(Rect)>
		}
		obj1 = ((Object) (new CascadingMenuInfo(menupopupwindow, menubuilder, mLastPosition)));
	//  223  441:new             #201 <Class CascadingMenuPopup$CascadingMenuInfo>
	//  224  444:dup             
	//  225  445:aload           8
	//  226  447:aload_1         
	//  227  448:aload_0         
	//  228  449:getfield        #115 <Field int mLastPosition>
	//  229  452:invokespecial   #371 <Method void CascadingMenuPopup$CascadingMenuInfo(MenuPopupWindow, MenuBuilder, int)>
	//  230  455:astore          7
		mShowingMenus.add(obj1);
	//  231  457:aload_0         
	//  232  458:getfield        #76  <Field List mShowingMenus>
	//  233  461:aload           7
	//  234  463:invokeinterface #375 <Method boolean List.add(Object)>
	//  235  468:pop             
		menupopupwindow.show();
	//  236  469:aload           8
	//  237  471:invokevirtual   #378 <Method void MenuPopupWindow.show()>
		obj1 = ((Object) (menupopupwindow.getListView()));
	//  238  474:aload           8
	//  239  476:invokevirtual   #379 <Method ListView MenuPopupWindow.getListView()>
	//  240  479:astore          7
		((ListView) (obj1)).setOnKeyListener(((android.view.View.OnKeyListener) (this)));
	//  241  481:aload           7
	//  242  483:aload_0         
	//  243  484:invokevirtual   #383 <Method void ListView.setOnKeyListener(android.view.View$OnKeyListener)>
		if(obj == null && mShowTitle && menubuilder.n() != null)
	//* 244  487:aload           6
	//* 245  489:ifnonnull       564
	//* 246  492:aload_0         
	//* 247  493:getfield        #385 <Field boolean mShowTitle>
	//* 248  496:ifeq            564
	//* 249  499:aload_1         
	//* 250  500:invokevirtual   #389 <Method CharSequence MenuBuilder.n()>
	//* 251  503:ifnull          564
		{
			FrameLayout framelayout = (FrameLayout)((LayoutInflater) (obj2)).inflate(android.support.v7.appcompat.R.layout.abc_popup_menu_header_item_layout, ((android.view.ViewGroup) (obj1)), false);
	//  252  506:aload           9
	//  253  508:getstatic       #392 <Field int android.support.v7.appcompat.R$layout.abc_popup_menu_header_item_layout>
	//  254  511:aload           7
	//  255  513:iconst_0        
	//  256  514:invokevirtual   #396 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//  257  517:checkcast       #398 <Class FrameLayout>
	//  258  520:astore          6
			obj2 = ((Object) ((TextView)framelayout.findViewById(0x1020016)));
	//  259  522:aload           6
	//  260  524:ldc2            #399 <Int 0x1020016>
	//  261  527:invokevirtual   #402 <Method View FrameLayout.findViewById(int)>
	//  262  530:checkcast       #404 <Class TextView>
	//  263  533:astore          9
			framelayout.setEnabled(false);
	//  264  535:aload           6
	//  265  537:iconst_0        
	//  266  538:invokevirtual   #407 <Method void FrameLayout.setEnabled(boolean)>
			((TextView) (obj2)).setText(menubuilder.n());
	//  267  541:aload           9
	//  268  543:aload_1         
	//  269  544:invokevirtual   #389 <Method CharSequence MenuBuilder.n()>
	//  270  547:invokevirtual   #411 <Method void TextView.setText(CharSequence)>
			((ListView) (obj1)).addHeaderView(((View) (framelayout)), ((Object) (null)), false);
	//  271  550:aload           7
	//  272  552:aload           6
	//  273  554:aconst_null     
	//  274  555:iconst_0        
	//  275  556:invokevirtual   #415 <Method void ListView.addHeaderView(View, Object, boolean)>
			menupopupwindow.show();
	//  276  559:aload           8
	//  277  561:invokevirtual   #378 <Method void MenuPopupWindow.show()>
		}
	//  278  564:return          
	}

	public void addMenu(MenuBuilder menubuilder)
	{
		menubuilder.a(((MenuPresenter) (this)), mContext);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #99  <Field Context mContext>
	//    4    6:invokevirtual   #420 <Method void MenuBuilder.a(MenuPresenter, Context)>
		if(isShowing())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #306 <Method boolean isShowing()>
	//*   7   13:ifeq            22
		{
			showMenu(menubuilder);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #422 <Method void showMenu(MenuBuilder)>
			return;
	//   11   21:return          
		} else
		{
			mPendingMenus.add(((Object) (menubuilder)));
	//   12   22:aload_0         
	//   13   23:getfield        #74  <Field List mPendingMenus>
	//   14   26:aload_1         
	//   15   27:invokeinterface #375 <Method boolean List.add(Object)>
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
	//    1    1:getfield        #76  <Field List mShowingMenus>
	//    2    4:invokeinterface #195 <Method int List.size()>
	//    3    9:istore_1        
		if(i > 0)
	//*   4   10:iload_1         
	//*   5   11:ifle            67
		{
			CascadingMenuInfo acascadingmenuinfo[] = (CascadingMenuInfo[])mShowingMenus.toArray(((Object []) (new CascadingMenuInfo[i])));
	//    6   14:aload_0         
	//    7   15:getfield        #76  <Field List mShowingMenus>
	//    8   18:iload_1         
	//    9   19:anewarray       CascadingMenuInfo[]
	//   10   22:invokeinterface #428 <Method Object[] List.toArray(Object[])>
	//   11   27:checkcast       #430 <Class CascadingMenuPopup$CascadingMenuInfo[]>
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
	//*  24   44:getfield        #434 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//*  25   47:invokevirtual   #435 <Method boolean MenuPopupWindow.isShowing()>
	//*  26   50:ifeq            60
					cascadingmenuinfo.window.dismiss();
	//   27   53:aload_3         
	//   28   54:getfield        #434 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   29   57:invokevirtual   #437 <Method void MenuPopupWindow.dismiss()>
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
	//*   1    1:getfield        #76  <Field List mShowingMenus>
	//*   2    4:invokeinterface #441 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            14
		{
			return null;
	//    4   12:aconst_null     
	//    5   13:areturn         
		} else
		{
			List list = mShowingMenus;
	//    6   14:aload_0         
	//    7   15:getfield        #76  <Field List mShowingMenus>
	//    8   18:astore_1        
			return ((CascadingMenuInfo)list.get(list.size() - 1)).getListView();
	//    9   19:aload_1         
	//   10   20:aload_1         
	//   11   21:invokeinterface #195 <Method int List.size()>
	//   12   26:iconst_1        
	//   13   27:isub            
	//   14   28:invokeinterface #199 <Method Object List.get(int)>
	//   15   33:checkcast       #201 <Class CascadingMenuPopup$CascadingMenuInfo>
	//   16   36:invokevirtual   #232 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   17   39:areturn         
		}
	}

	public boolean isShowing()
	{
		int i = mShowingMenus.size();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field List mShowingMenus>
	//    2    4:invokeinterface #195 <Method int List.size()>
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
	//*  13   21:getfield        #76  <Field List mShowingMenus>
	//*  14   24:iconst_0        
	//*  15   25:invokeinterface #199 <Method Object List.get(int)>
	//*  16   30:checkcast       #201 <Class CascadingMenuPopup$CascadingMenuInfo>
	//*  17   33:getfield        #434 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//*  18   36:invokevirtual   #435 <Method boolean MenuPopupWindow.isShowing()>
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
	//    2    2:invokespecial   #445 <Method int findIndexOfAddedMenu(MenuBuilder)>
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
	//*  13   19:getfield        #76  <Field List mShowingMenus>
	//*  14   22:invokeinterface #195 <Method int List.size()>
	//*  15   27:icmpge          51
			((CascadingMenuInfo)mShowingMenus.get(j)).menu.b(false);
	//   16   30:aload_0         
	//   17   31:getfield        #76  <Field List mShowingMenus>
	//   18   34:iload           4
	//   19   36:invokeinterface #199 <Method Object List.get(int)>
	//   20   41:checkcast       #201 <Class CascadingMenuPopup$CascadingMenuInfo>
	//   21   44:getfield        #205 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//   22   47:iconst_0        
	//   23   48:invokevirtual   #448 <Method void MenuBuilder.b(boolean)>
		CascadingMenuInfo cascadingmenuinfo = (CascadingMenuInfo)mShowingMenus.remove(i);
	//   24   51:aload_0         
	//   25   52:getfield        #76  <Field List mShowingMenus>
	//   26   55:iload_3         
	//   27   56:invokeinterface #451 <Method Object List.remove(int)>
	//   28   61:checkcast       #201 <Class CascadingMenuPopup$CascadingMenuInfo>
	//   29   64:astore          5
		cascadingmenuinfo.menu.b(((MenuPresenter) (this)));
	//   30   66:aload           5
	//   31   68:getfield        #205 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//   32   71:aload_0         
	//   33   72:invokevirtual   #454 <Method void MenuBuilder.b(MenuPresenter)>
		if(mShouldCloseImmediately)
	//*  34   75:aload_0         
	//*  35   76:getfield        #456 <Field boolean mShouldCloseImmediately>
	//*  36   79:ifeq            100
		{
			cascadingmenuinfo.window.setExitTransition(((Object) (null)));
	//   37   82:aload           5
	//   38   84:getfield        #434 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   39   87:aconst_null     
	//   40   88:invokevirtual   #459 <Method void MenuPopupWindow.setExitTransition(Object)>
			cascadingmenuinfo.window.setAnimationStyle(0);
	//   41   91:aload           5
	//   42   93:getfield        #434 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   43   96:iconst_0        
	//   44   97:invokevirtual   #462 <Method void MenuPopupWindow.setAnimationStyle(int)>
		}
		cascadingmenuinfo.window.dismiss();
	//   45  100:aload           5
	//   46  102:getfield        #434 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   47  105:invokevirtual   #437 <Method void MenuPopupWindow.dismiss()>
		i = mShowingMenus.size();
	//   48  108:aload_0         
	//   49  109:getfield        #76  <Field List mShowingMenus>
	//   50  112:invokeinterface #195 <Method int List.size()>
	//   51  117:istore_3        
		if(i > 0)
	//*  52  118:iload_3         
	//*  53  119:ifle            147
			mLastPosition = ((CascadingMenuInfo)mShowingMenus.get(i - 1)).position;
	//   54  122:aload_0         
	//   55  123:aload_0         
	//   56  124:getfield        #76  <Field List mShowingMenus>
	//   57  127:iload_3         
	//   58  128:iconst_1        
	//   59  129:isub            
	//   60  130:invokeinterface #199 <Method Object List.get(int)>
	//   61  135:checkcast       #201 <Class CascadingMenuPopup$CascadingMenuInfo>
	//   62  138:getfield        #465 <Field int CascadingMenuPopup$CascadingMenuInfo.position>
	//   63  141:putfield        #115 <Field int mLastPosition>
		else
	//*  64  144:goto            155
			mLastPosition = getInitialMenuPosition();
	//   65  147:aload_0         
	//   66  148:aload_0         
	//   67  149:invokespecial   #113 <Method int getInitialMenuPosition()>
	//   68  152:putfield        #115 <Field int mLastPosition>
		if(i == 0)
	//*  69  155:iload_3         
	//*  70  156:ifne            236
		{
			dismiss();
	//   71  159:aload_0         
	//   72  160:invokevirtual   #466 <Method void dismiss()>
			MenuPresenter.Callback callback = mPresenterCallback;
	//   73  163:aload_0         
	//   74  164:getfield        #468 <Field MenuPresenter$Callback mPresenterCallback>
	//   75  167:astore          5
			if(callback != null)
	//*  76  169:aload           5
	//*  77  171:ifnull          183
				callback.onCloseMenu(menubuilder, true);
	//   78  174:aload           5
	//   79  176:aload_1         
	//   80  177:iconst_1        
	//   81  178:invokeinterface #472 <Method void MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
			menubuilder = ((MenuBuilder) (mTreeObserver));
	//   82  183:aload_0         
	//   83  184:getfield        #474 <Field ViewTreeObserver mTreeObserver>
	//   84  187:astore_1        
			if(menubuilder != null)
	//*  85  188:aload_1         
	//*  86  189:ifnull          215
			{
				if(((ViewTreeObserver) (menubuilder)).isAlive())
	//*  87  192:aload_1         
	//*  88  193:invokevirtual   #479 <Method boolean ViewTreeObserver.isAlive()>
	//*  89  196:ifeq            210
					mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
	//   90  199:aload_0         
	//   91  200:getfield        #474 <Field ViewTreeObserver mTreeObserver>
	//   92  203:aload_0         
	//   93  204:getfield        #83  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//   94  207:invokevirtual   #483 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				mTreeObserver = null;
	//   95  210:aload_0         
	//   96  211:aconst_null     
	//   97  212:putfield        #474 <Field ViewTreeObserver mTreeObserver>
			}
			mShownAnchorView.removeOnAttachStateChangeListener(mAttachStateChangeListener);
	//   98  215:aload_0         
	//   99  216:getfield        #280 <Field View mShownAnchorView>
	//  100  219:aload_0         
	//  101  220:getfield        #88  <Field android.view.View$OnAttachStateChangeListener mAttachStateChangeListener>
	//  102  223:invokevirtual   #487 <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
			mOnDismissListener.onDismiss();
	//  103  226:aload_0         
	//  104  227:getfield        #489 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//  105  230:invokeinterface #492 <Method void android.widget.PopupWindow$OnDismissListener.onDismiss()>
			return;
	//  106  235:return          
		}
		if(flag)
	//* 107  236:iload_2         
	//* 108  237:ifeq            260
			((CascadingMenuInfo)mShowingMenus.get(0)).menu.b(false);
	//  109  240:aload_0         
	//  110  241:getfield        #76  <Field List mShowingMenus>
	//  111  244:iconst_0        
	//  112  245:invokeinterface #199 <Method Object List.get(int)>
	//  113  250:checkcast       #201 <Class CascadingMenuPopup$CascadingMenuInfo>
	//  114  253:getfield        #205 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//  115  256:iconst_0        
	//  116  257:invokevirtual   #448 <Method void MenuBuilder.b(boolean)>
	//  117  260:return          
	}

	public void onDismiss()
	{
		CascadingMenuInfo cascadingmenuinfo;
label0:
		{
			int j = mShowingMenus.size();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field List mShowingMenus>
	//    2    4:invokeinterface #195 <Method int List.size()>
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
	//   10   18:getfield        #76  <Field List mShowingMenus>
	//   11   21:iload_1         
	//   12   22:invokeinterface #199 <Method Object List.get(int)>
	//   13   27:checkcast       #201 <Class CascadingMenuPopup$CascadingMenuInfo>
	//   14   30:astore_3        
				if(!cascadingmenuinfo.window.isShowing())
	//*  15   31:aload_3         
	//*  16   32:getfield        #434 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//*  17   35:invokevirtual   #435 <Method boolean MenuPopupWindow.isShowing()>
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
			cascadingmenuinfo.menu.b(false);
	//   29   57:aload_3         
	//   30   58:getfield        #205 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//   31   61:iconst_0        
	//   32   62:invokevirtual   #448 <Method void MenuBuilder.b(boolean)>
	//   33   65:return          
	}

	public boolean onKey(View view, int i, KeyEvent keyevent)
	{
		if(keyevent.getAction() == 1 && i == 82)
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #499 <Method int KeyEvent.getAction()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          20
	//*   4    8:iload_2         
	//*   5    9:bipush          82
	//*   6   11:icmpne          20
		{
			dismiss();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #466 <Method void dismiss()>
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

	public boolean onSubMenuSelected(a a1)
	{
		for(Iterator iterator = mShowingMenus.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field List mShowingMenus>
	//*   2    4:invokeinterface #509 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #514 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            47
		{
			CascadingMenuInfo cascadingmenuinfo = (CascadingMenuInfo)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #518 <Method Object Iterator.next()>
	//    9   25:checkcast       #201 <Class CascadingMenuPopup$CascadingMenuInfo>
	//   10   28:astore_3        
			if(a1 == cascadingmenuinfo.menu)
	//*  11   29:aload_1         
	//*  12   30:aload_3         
	//*  13   31:getfield        #205 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//*  14   34:if_acmpne       10
			{
				cascadingmenuinfo.getListView().requestFocus();
	//   15   37:aload_3         
	//   16   38:invokevirtual   #232 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   17   41:invokevirtual   #521 <Method boolean ListView.requestFocus()>
	//   18   44:pop             
				return true;
	//   19   45:iconst_1        
	//   20   46:ireturn         
			}
		}

		if(a1.hasVisibleItems())
	//*  21   47:aload_1         
	//*  22   48:invokevirtual   #526 <Method boolean a.hasVisibleItems()>
	//*  23   51:ifeq            78
		{
			addMenu(((MenuBuilder) (a1)));
	//   24   54:aload_0         
	//   25   55:aload_1         
	//   26   56:invokevirtual   #528 <Method void addMenu(MenuBuilder)>
			MenuPresenter.Callback callback = mPresenterCallback;
	//   27   59:aload_0         
	//   28   60:getfield        #468 <Field MenuPresenter$Callback mPresenterCallback>
	//   29   63:astore_2        
			if(callback != null)
	//*  30   64:aload_2         
	//*  31   65:ifnull          76
				callback.onOpenSubMenu(((MenuBuilder) (a1)));
	//   32   68:aload_2         
	//   33   69:aload_1         
	//   34   70:invokeinterface #531 <Method boolean MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
	//   35   75:pop             
			return true;
	//   36   76:iconst_1        
	//   37   77:ireturn         
		} else
		{
			return false;
	//   38   78:iconst_0        
	//   39   79:ireturn         
		}
	}

	public void setAnchorView(View view)
	{
		if(mAnchorView != view)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field View mAnchorView>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       31
		{
			mAnchorView = view;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #101 <Field View mAnchorView>
			mDropDownGravity = l.a(mRawDropDownGravity, ac.f(mAnchorView));
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #95  <Field int mRawDropDownGravity>
	//   10   18:aload_0         
	//   11   19:getfield        #101 <Field View mAnchorView>
	//   12   22:invokestatic    #270 <Method int ac.f(View)>
	//   13   25:invokestatic    #535 <Method int l.a(int, int)>
	//   14   28:putfield        #97  <Field int mDropDownGravity>
		}
	//   15   31:return          
	}

	public void setCallback(MenuPresenter.Callback callback)
	{
		mPresenterCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #468 <Field MenuPresenter$Callback mPresenterCallback>
	//    3    5:return          
	}

	public void setForceShowIcon(boolean flag)
	{
		mForceShowIcon = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #109 <Field boolean mForceShowIcon>
	//    3    5:return          
	}

	public void setGravity(int i)
	{
		if(mRawDropDownGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field int mRawDropDownGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          28
		{
			mRawDropDownGravity = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #95  <Field int mRawDropDownGravity>
			mDropDownGravity = l.a(i, ac.f(mAnchorView));
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #101 <Field View mAnchorView>
	//   11   19:invokestatic    #270 <Method int ac.f(View)>
	//   12   22:invokestatic    #535 <Method int l.a(int, int)>
	//   13   25:putfield        #97  <Field int mDropDownGravity>
		}
	//   14   28:return          
	}

	public void setHorizontalOffset(int i)
	{
		mHasXOffset = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #355 <Field boolean mHasXOffset>
		mXOffset = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #357 <Field int mXOffset>
	//    6   10:return          
	}

	public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
	{
		mOnDismissListener = ondismisslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #489 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//    3    5:return          
	}

	public void setShowTitle(boolean flag)
	{
		mShowTitle = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #385 <Field boolean mShowTitle>
	//    3    5:return          
	}

	public void setVerticalOffset(int i)
	{
		mHasYOffset = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #359 <Field boolean mHasYOffset>
		mYOffset = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #361 <Field int mYOffset>
	//    6   10:return          
	}

	public void show()
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #306 <Method boolean isShowing()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		for(Iterator iterator = mPendingMenus.iterator(); iterator.hasNext(); showMenu((MenuBuilder)iterator.next()));
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field List mPendingMenus>
	//    6   12:invokeinterface #509 <Method Iterator List.iterator()>
	//    7   17:astore_2        
	//    8   18:aload_2         
	//    9   19:invokeinterface #514 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            43
	//   11   27:aload_0         
	//   12   28:aload_2         
	//   13   29:invokeinterface #518 <Method Object Iterator.next()>
	//   14   34:checkcast       #209 <Class MenuBuilder>
	//   15   37:invokespecial   #422 <Method void showMenu(MenuBuilder)>
	//*  16   40:goto            18
		mPendingMenus.clear();
	//   17   43:aload_0         
	//   18   44:getfield        #74  <Field List mPendingMenus>
	//   19   47:invokeinterface #542 <Method void List.clear()>
		mShownAnchorView = mAnchorView;
	//   20   52:aload_0         
	//   21   53:aload_0         
	//   22   54:getfield        #101 <Field View mAnchorView>
	//   23   57:putfield        #280 <Field View mShownAnchorView>
		if(mShownAnchorView != null)
	//*  24   60:aload_0         
	//*  25   61:getfield        #280 <Field View mShownAnchorView>
	//*  26   64:ifnull          118
		{
			boolean flag;
			if(mTreeObserver == null)
	//*  27   67:aload_0         
	//*  28   68:getfield        #474 <Field ViewTreeObserver mTreeObserver>
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
	//   37   83:getfield        #280 <Field View mShownAnchorView>
	//   38   86:invokevirtual   #546 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   39   89:putfield        #474 <Field ViewTreeObserver mTreeObserver>
			if(flag)
	//*  40   92:iload_1         
	//*  41   93:ifeq            107
				mTreeObserver.addOnGlobalLayoutListener(mGlobalLayoutListener);
	//   42   96:aload_0         
	//   43   97:getfield        #474 <Field ViewTreeObserver mTreeObserver>
	//   44  100:aload_0         
	//   45  101:getfield        #83  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//   46  104:invokevirtual   #549 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			mShownAnchorView.addOnAttachStateChangeListener(mAttachStateChangeListener);
	//   47  107:aload_0         
	//   48  108:getfield        #280 <Field View mShownAnchorView>
	//   49  111:aload_0         
	//   50  112:getfield        #88  <Field android.view.View$OnAttachStateChangeListener mAttachStateChangeListener>
	//   51  115:invokevirtual   #552 <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		}
	//   52  118:return          
	}

	public void updateMenuView(boolean flag)
	{
		for(Iterator iterator = mShowingMenus.iterator(); iterator.hasNext(); toMenuAdapter(((CascadingMenuInfo)iterator.next()).getListView().getAdapter()).notifyDataSetChanged());
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field List mShowingMenus>
	//    2    4:invokeinterface #509 <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #514 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            43
	//    7   19:aload_2         
	//    8   20:invokeinterface #518 <Method Object Iterator.next()>
	//    9   25:checkcast       #201 <Class CascadingMenuPopup$CascadingMenuInfo>
	//   10   28:invokevirtual   #232 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   11   31:invokevirtual   #238 <Method android.widget.ListAdapter ListView.getAdapter()>
	//   12   34:invokestatic    #557 <Method MenuAdapter toMenuAdapter(android.widget.ListAdapter)>
	//   13   37:invokevirtual   #560 <Method void MenuAdapter.notifyDataSetChanged()>
	//*  14   40:goto            10
	//   15   43:return          
	}

	static final int HORIZ_POSITION_LEFT = 0;
	static final int HORIZ_POSITION_RIGHT = 1;
	private static final int ITEM_LAYOUT;
	static final int SUBMENU_TIMEOUT_MS = 200;
	private View mAnchorView;
	private final android.view.View.OnAttachStateChangeListener mAttachStateChangeListener = new _cls2();
	private final Context mContext;
	private int mDropDownGravity;
	private boolean mForceShowIcon;
	final android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = new _cls1();
	private boolean mHasXOffset;
	private boolean mHasYOffset;
	private int mLastPosition;
	private final MenuItemHoverListener mMenuItemHoverListener = new _cls3();
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
	ViewTreeObserver mTreeObserver;
	private int mXOffset;
	private int mYOffset;

	static 
	{
		ITEM_LAYOUT = android.support.v7.appcompat.R.layout.abc_cascading_menu_item_layout;
	//    0    0:getstatic       #62  <Field int android.support.v7.appcompat.R$layout.abc_cascading_menu_item_layout>
	//    1    3:putstatic       #64  <Field int ITEM_LAYOUT>
	//*   2    6:return          
	}

	private class _cls1
		implements android.view.ViewTreeObserver.OnGlobalLayoutListener
	{

		public void onGlobalLayout()
		{
			if(isShowing() && mShowingMenus.size() > 0 && !((CascadingMenuInfo)mShowingMenus.get(0)).window.isModal())
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field CascadingMenuPopup this$0>
		//*   2    4:invokevirtual   #23  <Method boolean CascadingMenuPopup.isShowing()>
		//*   3    7:ifeq            119
		//*   4   10:aload_0         
		//*   5   11:getfield        #12  <Field CascadingMenuPopup this$0>
		//*   6   14:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
		//*   7   17:invokeinterface #33  <Method int List.size()>
		//*   8   22:ifle            119
		//*   9   25:aload_0         
		//*  10   26:getfield        #12  <Field CascadingMenuPopup this$0>
		//*  11   29:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
		//*  12   32:iconst_0        
		//*  13   33:invokeinterface #37  <Method Object List.get(int)>
		//*  14   38:checkcast       #39  <Class CascadingMenuPopup$CascadingMenuInfo>
		//*  15   41:getfield        #43  <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
		//*  16   44:invokevirtual   #48  <Method boolean MenuPopupWindow.isModal()>
		//*  17   47:ifne            119
			{
				View view = mShownAnchorView;
		//   18   50:aload_0         
		//   19   51:getfield        #12  <Field CascadingMenuPopup this$0>
		//   20   54:getfield        #52  <Field View CascadingMenuPopup.mShownAnchorView>
		//   21   57:astore_1        
				if(view != null && view.isShown())
		//*  22   58:aload_1         
		//*  23   59:ifnull          112
		//*  24   62:aload_1         
		//*  25   63:invokevirtual   #57  <Method boolean View.isShown()>
		//*  26   66:ifne            72
		//*  27   69:goto            112
				{
					for(Iterator iterator = mShowingMenus.iterator(); iterator.hasNext(); ((CascadingMenuInfo)iterator.next()).window.show());
		//   28   72:aload_0         
		//   29   73:getfield        #12  <Field CascadingMenuPopup this$0>
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
		//   43  113:getfield        #12  <Field CascadingMenuPopup this$0>
		//   44  116:invokevirtual   #76  <Method void CascadingMenuPopup.dismiss()>
				}
			}
		//   45  119:return          
		}

		final CascadingMenuPopup this$0;

		_cls1()
		{
			this$0 = CascadingMenuPopup.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field CascadingMenuPopup this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class _cls2
		implements android.view.View.OnAttachStateChangeListener
	{

		public void onViewAttachedToWindow(View view)
		{
		//    0    0:return          
		}

		public void onViewDetachedFromWindow(View view)
		{
			if(mTreeObserver != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field CascadingMenuPopup this$0>
		//*   2    4:getfield        #25  <Field ViewTreeObserver CascadingMenuPopup.mTreeObserver>
		//*   3    7:ifnull          51
			{
				if(!mTreeObserver.isAlive())
		//*   4   10:aload_0         
		//*   5   11:getfield        #12  <Field CascadingMenuPopup this$0>
		//*   6   14:getfield        #25  <Field ViewTreeObserver CascadingMenuPopup.mTreeObserver>
		//*   7   17:invokevirtual   #31  <Method boolean ViewTreeObserver.isAlive()>
		//*   8   20:ifne            34
					mTreeObserver = view.getViewTreeObserver();
		//    9   23:aload_0         
		//   10   24:getfield        #12  <Field CascadingMenuPopup this$0>
		//   11   27:aload_1         
		//   12   28:invokevirtual   #37  <Method ViewTreeObserver View.getViewTreeObserver()>
		//   13   31:putfield        #25  <Field ViewTreeObserver CascadingMenuPopup.mTreeObserver>
				mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
		//   14   34:aload_0         
		//   15   35:getfield        #12  <Field CascadingMenuPopup this$0>
		//   16   38:getfield        #25  <Field ViewTreeObserver CascadingMenuPopup.mTreeObserver>
		//   17   41:aload_0         
		//   18   42:getfield        #12  <Field CascadingMenuPopup this$0>
		//   19   45:getfield        #41  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener CascadingMenuPopup.mGlobalLayoutListener>
		//   20   48:invokevirtual   #45  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			}
			view.removeOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
		//   21   51:aload_1         
		//   22   52:aload_0         
		//   23   53:invokevirtual   #49  <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		//   24   56:return          
		}

		final CascadingMenuPopup this$0;

		_cls2()
		{
			this$0 = CascadingMenuPopup.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field CascadingMenuPopup this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class _cls3
		implements MenuItemHoverListener
	{

		public void onItemHoverEnter(final MenuBuilder menu, final MenuItem item)
		{
			int i;
			final CascadingMenuInfo nextInfo;
label0:
			{
				Handler handler = mSubMenuHoverHandler;
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field CascadingMenuPopup this$0>
		//    2    4:getfield        #24  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
		//    3    7:astore          8
				nextInfo = null;
		//    4    9:aconst_null     
		//    5   10:astore          7
				handler.removeCallbacksAndMessages(((Object) (null)));
		//    6   12:aload           8
		//    7   14:aconst_null     
		//    8   15:invokevirtual   #30  <Method void Handler.removeCallbacksAndMessages(Object)>
				int j = mShowingMenus.size();
		//    9   18:aload_0         
		//   10   19:getfield        #12  <Field CascadingMenuPopup this$0>
		//   11   22:getfield        #34  <Field List CascadingMenuPopup.mShowingMenus>
		//   12   25:invokeinterface #40  <Method int List.size()>
		//   13   30:istore          4
				for(i = 0; i < j; i++)
		//*  14   32:iconst_0        
		//*  15   33:istore_3        
		//*  16   34:iload_3         
		//*  17   35:iload           4
		//*  18   37:icmpge          73
					if(menu == ((CascadingMenuInfo)mShowingMenus.get(i)).menu)
		//*  19   40:aload_1         
		//*  20   41:aload_0         
		//*  21   42:getfield        #12  <Field CascadingMenuPopup this$0>
		//*  22   45:getfield        #34  <Field List CascadingMenuPopup.mShowingMenus>
		//*  23   48:iload_3         
		//*  24   49:invokeinterface #44  <Method Object List.get(int)>
		//*  25   54:checkcast       #46  <Class CascadingMenuPopup$CascadingMenuInfo>
		//*  26   57:getfield        #50  <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
		//*  27   60:if_acmpne       66
						break label0;
		//   28   63:goto            75

		//   29   66:iload_3         
		//   30   67:iconst_1        
		//   31   68:iadd            
		//   32   69:istore_3        
		//*  33   70:goto            34
				i = -1;
		//   34   73:iconst_m1       
		//   35   74:istore_3        
			}
			if(i == -1)
		//*  36   75:iload_3         
		//*  37   76:iconst_m1       
		//*  38   77:icmpne          81
				return;
		//   39   80:return          
			i++;
		//   40   81:iload_3         
		//   41   82:iconst_1        
		//   42   83:iadd            
		//   43   84:istore_3        
			if(i < mShowingMenus.size())
		//*  44   85:iload_3         
		//*  45   86:aload_0         
		//*  46   87:getfield        #12  <Field CascadingMenuPopup this$0>
		//*  47   90:getfield        #34  <Field List CascadingMenuPopup.mShowingMenus>
		//*  48   93:invokeinterface #40  <Method int List.size()>
		//*  49   98:icmpge          119
				nextInfo = (CascadingMenuInfo)mShowingMenus.get(i);
		//   50  101:aload_0         
		//   51  102:getfield        #12  <Field CascadingMenuPopup this$0>
		//   52  105:getfield        #34  <Field List CascadingMenuPopup.mShowingMenus>
		//   53  108:iload_3         
		//   54  109:invokeinterface #44  <Method Object List.get(int)>
		//   55  114:checkcast       #46  <Class CascadingMenuPopup$CascadingMenuInfo>
		//   56  117:astore          7
			class _cls1
				implements Runnable
			{

				public void run()
				{
					if(nextInfo != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #20  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
				//*   2    4:ifnull          40
					{
						mShouldCloseImmediately = true;
				//    3    7:aload_0         
				//    4    8:getfield        #18  <Field CascadingMenuPopup$3 this$1>
				//    5   11:getfield        #35  <Field CascadingMenuPopup CascadingMenuPopup$3.this$0>
				//    6   14:iconst_1        
				//    7   15:putfield        #41  <Field boolean CascadingMenuPopup.mShouldCloseImmediately>
						nextInfo.menu.b(false);
				//    8   18:aload_0         
				//    9   19:getfield        #20  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
				//   10   22:getfield        #46  <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
				//   11   25:iconst_0        
				//   12   26:invokevirtual   #52  <Method void MenuBuilder.b(boolean)>
						mShouldCloseImmediately = false;
				//   13   29:aload_0         
				//   14   30:getfield        #18  <Field CascadingMenuPopup$3 this$1>
				//   15   33:getfield        #35  <Field CascadingMenuPopup CascadingMenuPopup$3.this$0>
				//   16   36:iconst_0        
				//   17   37:putfield        #41  <Field boolean CascadingMenuPopup.mShouldCloseImmediately>
					}
					if(item.isEnabled() && item.hasSubMenu())
				//*  18   40:aload_0         
				//*  19   41:getfield        #22  <Field MenuItem val$item>
				//*  20   44:invokeinterface #58  <Method boolean MenuItem.isEnabled()>
				//*  21   49:ifeq            77
				//*  22   52:aload_0         
				//*  23   53:getfield        #22  <Field MenuItem val$item>
				//*  24   56:invokeinterface #61  <Method boolean MenuItem.hasSubMenu()>
				//*  25   61:ifeq            77
						menu.a(item, 4);
				//   26   64:aload_0         
				//   27   65:getfield        #24  <Field MenuBuilder val$menu>
				//   28   68:aload_0         
				//   29   69:getfield        #22  <Field MenuItem val$item>
				//   30   72:iconst_4        
				//   31   73:invokevirtual   #65  <Method boolean MenuBuilder.a(MenuItem, int)>
				//   32   76:pop             
				//   33   77:return          
				}

				final _cls3 this$1;
				final MenuItem val$item;
				final MenuBuilder val$menu;
				final CascadingMenuInfo val$nextInfo;

				_cls1()
				{
					this$1 = _cls3.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #18  <Field CascadingMenuPopup$3 this$1>
					nextInfo = cascadingmenuinfo;
				//    3    5:aload_0         
				//    4    6:aload_2         
				//    5    7:putfield        #20  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
					item = menuitem;
				//    6   10:aload_0         
				//    7   11:aload_3         
				//    8   12:putfield        #22  <Field MenuItem val$item>
					menu = menubuilder;
				//    9   15:aload_0         
				//   10   16:aload           4
				//   11   18:putfield        #24  <Field MenuBuilder val$menu>
					super();
				//   12   21:aload_0         
				//   13   22:invokespecial   #27  <Method void Object()>
				//   14   25:return          
				}
			}

			item = ((MenuItem) (new _cls1()));
		//   57  119:new             #52  <Class CascadingMenuPopup$3$1>
		//   58  122:dup             
		//   59  123:aload_0         
		//   60  124:aload           7
		//   61  126:aload_2         
		//   62  127:aload_1         
		//   63  128:invokespecial   #55  <Method void CascadingMenuPopup$3$1(CascadingMenuPopup$3, CascadingMenuPopup$CascadingMenuInfo, MenuItem, MenuBuilder)>
		//   64  131:astore_2        
			long l1 = SystemClock.uptimeMillis();
		//   65  132:invokestatic    #61  <Method long SystemClock.uptimeMillis()>
		//   66  135:lstore          5
			mSubMenuHoverHandler.postAtTime(((Runnable) (item)), ((Object) (menu)), l1 + 200L);
		//   67  137:aload_0         
		//   68  138:getfield        #12  <Field CascadingMenuPopup this$0>
		//   69  141:getfield        #24  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
		//   70  144:aload_2         
		//   71  145:aload_1         
		//   72  146:lload           5
		//   73  148:ldc2w           #62  <Long 200L>
		//   74  151:ladd            
		//   75  152:invokevirtual   #67  <Method boolean Handler.postAtTime(Runnable, Object, long)>
		//   76  155:pop             
		//   77  156:return          
		}

		public void onItemHoverExit(MenuBuilder menubuilder, MenuItem menuitem)
		{
			mSubMenuHoverHandler.removeCallbacksAndMessages(((Object) (menubuilder)));
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field CascadingMenuPopup this$0>
		//    2    4:getfield        #24  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #30  <Method void Handler.removeCallbacksAndMessages(Object)>
		//    5   11:return          
		}

		final CascadingMenuPopup this$0;

		_cls3()
		{
			this$0 = CascadingMenuPopup.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field CascadingMenuPopup this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class CascadingMenuInfo
	{

		public ListView getListView()
		{
			return window.getListView();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field MenuPopupWindow window>
		//    2    4:invokevirtual   #28  <Method ListView MenuPopupWindow.getListView()>
		//    3    7:areturn         
		}

		public final MenuBuilder menu;
		public final int position;
		public final MenuPopupWindow window;

		public CascadingMenuInfo(MenuPopupWindow menupopupwindow, MenuBuilder menubuilder, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			window = menupopupwindow;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field MenuPopupWindow window>
			menu = menubuilder;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #19  <Field MenuBuilder menu>
			position = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #21  <Field int position>
		//   11   19:return          
		}
	}

}
