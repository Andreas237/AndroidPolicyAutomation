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
	static class CascadingMenuInfo
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
	//    1    1:invokespecial   #74  <Method void MenuPopup()>
	//    2    4:aload_0         
	//    3    5:new             #76  <Class LinkedList>
	//    4    8:dup             
	//    5    9:invokespecial   #77  <Method void LinkedList()>
	//    6   12:putfield        #79  <Field List mPendingMenus>
	//    7   15:aload_0         
	//    8   16:new             #81  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #82  <Method void ArrayList()>
	//   11   23:putfield        #84  <Field List mShowingMenus>
	//   12   26:aload_0         
	//   13   27:new             #12  <Class CascadingMenuPopup$1>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #87  <Method void CascadingMenuPopup$1(CascadingMenuPopup)>
	//   17   35:putfield        #89  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//   18   38:aload_0         
	//   19   39:new             #14  <Class CascadingMenuPopup$2>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:invokespecial   #90  <Method void CascadingMenuPopup$2(CascadingMenuPopup)>
	//   23   47:putfield        #92  <Field MenuItemHoverListener mMenuItemHoverListener>
		mRawDropDownGravity = 0;
	//   24   50:aload_0         
	//   25   51:iconst_0        
	//   26   52:putfield        #94  <Field int mRawDropDownGravity>
		mDropDownGravity = 0;
	//   27   55:aload_0         
	//   28   56:iconst_0        
	//   29   57:putfield        #96  <Field int mDropDownGravity>
		mContext = context;
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:putfield        #98  <Field Context mContext>
		mAnchorView = view;
	//   33   65:aload_0         
	//   34   66:aload_2         
	//   35   67:putfield        #100 <Field View mAnchorView>
		mPopupStyleAttr = i;
	//   36   70:aload_0         
	//   37   71:iload_3         
	//   38   72:putfield        #102 <Field int mPopupStyleAttr>
		mPopupStyleRes = j;
	//   39   75:aload_0         
	//   40   76:iload           4
	//   41   78:putfield        #104 <Field int mPopupStyleRes>
		mOverflowOnly = flag;
	//   42   81:aload_0         
	//   43   82:iload           5
	//   44   84:putfield        #106 <Field boolean mOverflowOnly>
		mForceShowIcon = false;
	//   45   87:aload_0         
	//   46   88:iconst_0        
	//   47   89:putfield        #108 <Field boolean mForceShowIcon>
		mLastPosition = getInitialMenuPosition();
	//   48   92:aload_0         
	//   49   93:aload_0         
	//   50   94:invokespecial   #112 <Method int getInitialMenuPosition()>
	//   51   97:putfield        #114 <Field int mLastPosition>
		context = ((Context) (context.getResources()));
	//   52  100:aload_1         
	//   53  101:invokevirtual   #120 <Method Resources Context.getResources()>
	//   54  104:astore_1        
		mMenuMaxWidth = Math.max(((Resources) (context)).getDisplayMetrics().widthPixels / 2, ((Resources) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_config_prefDialogWidth));
	//   55  105:aload_0         
	//   56  106:aload_1         
	//   57  107:invokevirtual   #126 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   58  110:getfield        #131 <Field int DisplayMetrics.widthPixels>
	//   59  113:iconst_2        
	//   60  114:idiv            
	//   61  115:aload_1         
	//   62  116:getstatic       #136 <Field int android.support.v7.appcompat.R$dimen.abc_config_prefDialogWidth>
	//   63  119:invokevirtual   #140 <Method int Resources.getDimensionPixelSize(int)>
	//   64  122:invokestatic    #146 <Method int Math.max(int, int)>
	//   65  125:putfield        #148 <Field int mMenuMaxWidth>
	//   66  128:aload_0         
	//   67  129:new             #150 <Class Handler>
	//   68  132:dup             
	//   69  133:invokespecial   #151 <Method void Handler()>
	//   70  136:putfield        #153 <Field Handler mSubMenuHoverHandler>
	//   71  139:return          
	}

	private MenuPopupWindow createPopupWindow()
	{
		MenuPopupWindow menupopupwindow = new MenuPopupWindow(mContext, ((android.util.AttributeSet) (null)), mPopupStyleAttr, mPopupStyleRes);
	//    0    0:new             #159 <Class MenuPopupWindow>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #98  <Field Context mContext>
	//    4    8:aconst_null     
	//    5    9:aload_0         
	//    6   10:getfield        #102 <Field int mPopupStyleAttr>
	//    7   13:aload_0         
	//    8   14:getfield        #104 <Field int mPopupStyleRes>
	//    9   17:invokespecial   #162 <Method void MenuPopupWindow(Context, android.util.AttributeSet, int, int)>
	//   10   20:astore_1        
		menupopupwindow.setHoverListener(mMenuItemHoverListener);
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #92  <Field MenuItemHoverListener mMenuItemHoverListener>
	//   14   26:invokevirtual   #166 <Method void MenuPopupWindow.setHoverListener(MenuItemHoverListener)>
		menupopupwindow.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (this)));
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #170 <Method void MenuPopupWindow.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		menupopupwindow.setOnDismissListener(((android.widget.PopupWindow.OnDismissListener) (this)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:invokevirtual   #174 <Method void MenuPopupWindow.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
		menupopupwindow.setAnchorView(mAnchorView);
	//   21   39:aload_1         
	//   22   40:aload_0         
	//   23   41:getfield        #100 <Field View mAnchorView>
	//   24   44:invokevirtual   #178 <Method void MenuPopupWindow.setAnchorView(View)>
		menupopupwindow.setDropDownGravity(mDropDownGravity);
	//   25   47:aload_1         
	//   26   48:aload_0         
	//   27   49:getfield        #96  <Field int mDropDownGravity>
	//   28   52:invokevirtual   #182 <Method void MenuPopupWindow.setDropDownGravity(int)>
		menupopupwindow.setModal(true);
	//   29   55:aload_1         
	//   30   56:iconst_1        
	//   31   57:invokevirtual   #186 <Method void MenuPopupWindow.setModal(boolean)>
		return menupopupwindow;
	//   32   60:aload_1         
	//   33   61:areturn         
	}

	private int findIndexOfAddedMenu(MenuBuilder menubuilder)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = mShowingMenus.size(); i < j; i++)
	//*   2    2:aload_0         
	//*   3    3:getfield        #84  <Field List mShowingMenus>
	//*   4    6:invokeinterface #193 <Method int List.size()>
	//*   5   11:istore_3        
	//*   6   12:iload_2         
	//*   7   13:iload_3         
	//*   8   14:icmpge          46
			if(menubuilder == ((CascadingMenuInfo)mShowingMenus.get(i)).menu)
	//*   9   17:aload_1         
	//*  10   18:aload_0         
	//*  11   19:getfield        #84  <Field List mShowingMenus>
	//*  12   22:iload_2         
	//*  13   23:invokeinterface #197 <Method Object List.get(int)>
	//*  14   28:checkcast       #18  <Class CascadingMenuPopup$CascadingMenuInfo>
	//*  15   31:getfield        #201 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
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
	//*   3    3:invokevirtual   #206 <Method int MenuBuilder.size()>
	//*   4    6:istore          4
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          52
		{
			MenuItem menuitem = menubuilder.getItem(i);
	//    8   14:aload_1         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #210 <Method MenuItem MenuBuilder.getItem(int)>
	//   11   19:astore          5
			if(menuitem.hasSubMenu() && menubuilder1 == menuitem.getSubMenu())
	//*  12   21:aload           5
	//*  13   23:invokeinterface #216 <Method boolean MenuItem.hasSubMenu()>
	//*  14   28:ifeq            45
	//*  15   31:aload_2         
	//*  16   32:aload           5
	//*  17   34:invokeinterface #220 <Method android.view.SubMenu MenuItem.getSubMenu()>
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
	//    2    2:getfield        #201 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//    3    5:aload_2         
	//    4    6:invokespecial   #225 <Method MenuItem findMenuItemForSubmenu(MenuBuilder, MenuBuilder)>
	//    5    9:astore_2        
		if(menubuilder == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       16
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		ListView listview = cascadingmenuinfo.getListView();
	//   10   16:aload_1         
	//   11   17:invokevirtual   #229 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   12   20:astore          8
		cascadingmenuinfo = ((CascadingMenuInfo) (listview.getAdapter()));
	//   13   22:aload           8
	//   14   24:invokevirtual   #235 <Method android.widget.ListAdapter ListView.getAdapter()>
	//   15   27:astore_1        
		int j;
		if(cascadingmenuinfo instanceof HeaderViewListAdapter)
	//*  16   28:aload_1         
	//*  17   29:instanceof      #237 <Class HeaderViewListAdapter>
	//*  18   32:ifeq            57
		{
			cascadingmenuinfo = ((CascadingMenuInfo) ((HeaderViewListAdapter)cascadingmenuinfo));
	//   19   35:aload_1         
	//   20   36:checkcast       #237 <Class HeaderViewListAdapter>
	//   21   39:astore_1        
			j = ((HeaderViewListAdapter) (cascadingmenuinfo)).getHeadersCount();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #240 <Method int HeaderViewListAdapter.getHeadersCount()>
	//   24   44:istore          4
			cascadingmenuinfo = ((CascadingMenuInfo) ((MenuAdapter)((HeaderViewListAdapter) (cascadingmenuinfo)).getWrappedAdapter()));
	//   25   46:aload_1         
	//   26   47:invokevirtual   #243 <Method android.widget.ListAdapter HeaderViewListAdapter.getWrappedAdapter()>
	//   27   50:checkcast       #245 <Class MenuAdapter>
	//   28   53:astore_1        
		} else
	//*  29   54:goto            65
		{
			j = 0;
	//   30   57:iconst_0        
	//   31   58:istore          4
			cascadingmenuinfo = ((CascadingMenuInfo) ((MenuAdapter)cascadingmenuinfo));
	//   32   60:aload_1         
	//   33   61:checkcast       #245 <Class MenuAdapter>
	//   34   64:astore_1        
		}
		byte byte0 = -1;
	//   35   65:iconst_m1       
	//   36   66:istore          6
		int i = 0;
	//   37   68:iconst_0        
	//   38   69:istore_3        
		int l = ((MenuAdapter) (cascadingmenuinfo)).getCount();
	//   39   70:aload_1         
	//   40   71:invokevirtual   #248 <Method int MenuAdapter.getCount()>
	//   41   74:istore          7
		int k;
		do
		{
			k = ((int) (byte0));
	//   42   76:iload           6
	//   43   78:istore          5
			if(i >= l)
				break;
	//   44   80:iload_3         
	//   45   81:iload           7
	//   46   83:icmpge          108
			if(menubuilder == ((MenuAdapter) (cascadingmenuinfo)).getItem(i))
	//*  47   86:aload_2         
	//*  48   87:aload_1         
	//*  49   88:iload_3         
	//*  50   89:invokevirtual   #251 <Method MenuItemImpl MenuAdapter.getItem(int)>
	//*  51   92:if_acmpne       101
			{
				k = i;
	//   52   95:iload_3         
	//   53   96:istore          5
				break;
	//   54   98:goto            108
			}
			i++;
	//   55  101:iload_3         
	//   56  102:iconst_1        
	//   57  103:iadd            
	//   58  104:istore_3        
		} while(true);
	//   59  105:goto            76
		if(k == -1)
	//*  60  108:iload           5
	//*  61  110:iconst_m1       
	//*  62  111:icmpne          116
			return null;
	//   63  114:aconst_null     
	//   64  115:areturn         
		i = (k + j) - listview.getFirstVisiblePosition();
	//   65  116:iload           5
	//   66  118:iload           4
	//   67  120:iadd            
	//   68  121:aload           8
	//   69  123:invokevirtual   #254 <Method int ListView.getFirstVisiblePosition()>
	//   70  126:isub            
	//   71  127:istore_3        
		if(i < 0 || i >= listview.getChildCount())
	//*  72  128:iload_3         
	//*  73  129:iflt            141
	//*  74  132:iload_3         
	//*  75  133:aload           8
	//*  76  135:invokevirtual   #257 <Method int ListView.getChildCount()>
	//*  77  138:icmplt          143
			return null;
	//   78  141:aconst_null     
	//   79  142:areturn         
		else
			return listview.getChildAt(i);
	//   80  143:aload           8
	//   81  145:iload_3         
	//   82  146:invokevirtual   #261 <Method View ListView.getChildAt(int)>
	//   83  149:areturn         
	}

	private int getInitialMenuPosition()
	{
		return ViewCompat.getLayoutDirection(mAnchorView) != 1 ? 1 : 0;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field View mAnchorView>
	//    2    4:invokestatic    #268 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    7:iconst_1        
	//    4    8:icmpne          13
	//    5   11:iconst_0        
	//    6   12:ireturn         
	//    7   13:iconst_1        
	//    8   14:ireturn         
	}

	private int getNextMenuPosition(int i)
	{
		ListView listview = ((CascadingMenuInfo)mShowingMenus.get(mShowingMenus.size() - 1)).getListView();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field List mShowingMenus>
	//    2    4:aload_0         
	//    3    5:getfield        #84  <Field List mShowingMenus>
	//    4    8:invokeinterface #193 <Method int List.size()>
	//    5   13:iconst_1        
	//    6   14:isub            
	//    7   15:invokeinterface #197 <Method Object List.get(int)>
	//    8   20:checkcast       #18  <Class CascadingMenuPopup$CascadingMenuInfo>
	//    9   23:invokevirtual   #229 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   10   26:astore_2        
		int ai[] = new int[2];
	//   11   27:iconst_2        
	//   12   28:newarray        int[]
	//   13   30:astore_3        
		listview.getLocationOnScreen(ai);
	//   14   31:aload_2         
	//   15   32:aload_3         
	//   16   33:invokevirtual   #273 <Method void ListView.getLocationOnScreen(int[])>
		Rect rect = new Rect();
	//   17   36:new             #275 <Class Rect>
	//   18   39:dup             
	//   19   40:invokespecial   #276 <Method void Rect()>
	//   20   43:astore          4
		mShownAnchorView.getWindowVisibleDisplayFrame(rect);
	//   21   45:aload_0         
	//   22   46:getfield        #278 <Field View mShownAnchorView>
	//   23   49:aload           4
	//   24   51:invokevirtual   #284 <Method void View.getWindowVisibleDisplayFrame(Rect)>
		if(mLastPosition == 1)
	//*  25   54:aload_0         
	//*  26   55:getfield        #114 <Field int mLastPosition>
	//*  27   58:iconst_1        
	//*  28   59:icmpne          84
			return ai[0] + listview.getWidth() + i <= rect.right ? 1 : 0;
	//   29   62:aload_3         
	//   30   63:iconst_0        
	//   31   64:iaload          
	//   32   65:aload_2         
	//   33   66:invokevirtual   #287 <Method int ListView.getWidth()>
	//   34   69:iadd            
	//   35   70:iload_1         
	//   36   71:iadd            
	//   37   72:aload           4
	//   38   74:getfield        #290 <Field int Rect.right>
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
	//    1    1:getfield        #98  <Field Context mContext>
	//    2    4:invokestatic    #298 <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    7:astore          10
		Object obj = ((Object) (new MenuAdapter(menubuilder, ((LayoutInflater) (obj2)), mOverflowOnly)));
	//    4    9:new             #245 <Class MenuAdapter>
	//    5   12:dup             
	//    6   13:aload_1         
	//    7   14:aload           10
	//    8   16:aload_0         
	//    9   17:getfield        #106 <Field boolean mOverflowOnly>
	//   10   20:invokespecial   #301 <Method void MenuAdapter(MenuBuilder, LayoutInflater, boolean)>
	//   11   23:astore          7
		if(!isShowing() && mForceShowIcon)
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #304 <Method boolean isShowing()>
	//*  14   29:ifne            48
	//*  15   32:aload_0         
	//*  16   33:getfield        #108 <Field boolean mForceShowIcon>
	//*  17   36:ifeq            48
			((MenuAdapter) (obj)).setForceShowIcon(true);
	//   18   39:aload           7
	//   19   41:iconst_1        
	//   20   42:invokevirtual   #307 <Method void MenuAdapter.setForceShowIcon(boolean)>
		else
	//*  21   45:goto            64
		if(isShowing())
	//*  22   48:aload_0         
	//*  23   49:invokevirtual   #304 <Method boolean isShowing()>
	//*  24   52:ifeq            64
			((MenuAdapter) (obj)).setForceShowIcon(MenuPopup.shouldPreserveIconSpacing(menubuilder));
	//   25   55:aload           7
	//   26   57:aload_1         
	//   27   58:invokestatic    #311 <Method boolean MenuPopup.shouldPreserveIconSpacing(MenuBuilder)>
	//   28   61:invokevirtual   #307 <Method void MenuAdapter.setForceShowIcon(boolean)>
		int l = measureIndividualMenuWidth(((android.widget.ListAdapter) (obj)), ((android.view.ViewGroup) (null)), mContext, mMenuMaxWidth);
	//   29   64:aload           7
	//   30   66:aconst_null     
	//   31   67:aload_0         
	//   32   68:getfield        #98  <Field Context mContext>
	//   33   71:aload_0         
	//   34   72:getfield        #148 <Field int mMenuMaxWidth>
	//   35   75:invokestatic    #315 <Method int measureIndividualMenuWidth(android.widget.ListAdapter, android.view.ViewGroup, Context, int)>
	//   36   78:istore          5
		MenuPopupWindow menupopupwindow = createPopupWindow();
	//   37   80:aload_0         
	//   38   81:invokespecial   #317 <Method MenuPopupWindow createPopupWindow()>
	//   39   84:astore          9
		menupopupwindow.setAdapter(((android.widget.ListAdapter) (obj)));
	//   40   86:aload           9
	//   41   88:aload           7
	//   42   90:invokevirtual   #321 <Method void MenuPopupWindow.setAdapter(android.widget.ListAdapter)>
		menupopupwindow.setContentWidth(l);
	//   43   93:aload           9
	//   44   95:iload           5
	//   45   97:invokevirtual   #324 <Method void MenuPopupWindow.setContentWidth(int)>
		menupopupwindow.setDropDownGravity(mDropDownGravity);
	//   46  100:aload           9
	//   47  102:aload_0         
	//   48  103:getfield        #96  <Field int mDropDownGravity>
	//   49  106:invokevirtual   #182 <Method void MenuPopupWindow.setDropDownGravity(int)>
		Object obj1;
		if(mShowingMenus.size() > 0)
	//*  50  109:aload_0         
	//*  51  110:getfield        #84  <Field List mShowingMenus>
	//*  52  113:invokeinterface #193 <Method int List.size()>
	//*  53  118:ifle            158
		{
			obj = ((Object) ((CascadingMenuInfo)mShowingMenus.get(mShowingMenus.size() - 1)));
	//   54  121:aload_0         
	//   55  122:getfield        #84  <Field List mShowingMenus>
	//   56  125:aload_0         
	//   57  126:getfield        #84  <Field List mShowingMenus>
	//   58  129:invokeinterface #193 <Method int List.size()>
	//   59  134:iconst_1        
	//   60  135:isub            
	//   61  136:invokeinterface #197 <Method Object List.get(int)>
	//   62  141:checkcast       #18  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   63  144:astore          7
			obj1 = ((Object) (findParentViewForSubmenu(((CascadingMenuInfo) (obj)), menubuilder)));
	//   64  146:aload_0         
	//   65  147:aload           7
	//   66  149:aload_1         
	//   67  150:invokespecial   #326 <Method View findParentViewForSubmenu(CascadingMenuPopup$CascadingMenuInfo, MenuBuilder)>
	//   68  153:astore          8
		} else
	//*  69  155:goto            164
		{
			obj = null;
	//   70  158:aconst_null     
	//   71  159:astore          7
			obj1 = null;
	//   72  161:aconst_null     
	//   73  162:astore          8
		}
		if(obj1 != null)
	//*  74  164:aload           8
	//*  75  166:ifnull          322
		{
			menupopupwindow.setTouchModal(false);
	//   76  169:aload           9
	//   77  171:iconst_0        
	//   78  172:invokevirtual   #329 <Method void MenuPopupWindow.setTouchModal(boolean)>
			menupopupwindow.setEnterTransition(((Object) (null)));
	//   79  175:aload           9
	//   80  177:aconst_null     
	//   81  178:invokevirtual   #333 <Method void MenuPopupWindow.setEnterTransition(Object)>
			int j = getNextMenuPosition(l);
	//   82  181:aload_0         
	//   83  182:iload           5
	//   84  184:invokespecial   #335 <Method int getNextMenuPosition(int)>
	//   85  187:istore_3        
			int i;
			if(j == 1)
	//*  86  188:iload_3         
	//*  87  189:iconst_1        
	//*  88  190:icmpne          198
				i = 1;
	//   89  193:iconst_1        
	//   90  194:istore_2        
			else
	//*  91  195:goto            200
				i = 0;
	//   92  198:iconst_0        
	//   93  199:istore_2        
			mLastPosition = j;
	//   94  200:aload_0         
	//   95  201:iload_3         
	//   96  202:putfield        #114 <Field int mLastPosition>
			int ai[] = new int[2];
	//   97  205:iconst_2        
	//   98  206:newarray        int[]
	//   99  208:astore          11
			((View) (obj1)).getLocationInWindow(ai);
	//  100  210:aload           8
	//  101  212:aload           11
	//  102  214:invokevirtual   #338 <Method void View.getLocationInWindow(int[])>
			int i1 = ((CascadingMenuInfo) (obj)).window.getHorizontalOffset() + ai[0];
	//  103  217:aload           7
	//  104  219:getfield        #342 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//  105  222:invokevirtual   #345 <Method int MenuPopupWindow.getHorizontalOffset()>
	//  106  225:aload           11
	//  107  227:iconst_0        
	//  108  228:iaload          
	//  109  229:iadd            
	//  110  230:istore          6
			j = ((CascadingMenuInfo) (obj)).window.getVerticalOffset();
	//  111  232:aload           7
	//  112  234:getfield        #342 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//  113  237:invokevirtual   #348 <Method int MenuPopupWindow.getVerticalOffset()>
	//  114  240:istore_3        
			int k = ai[1];
	//  115  241:aload           11
	//  116  243:iconst_1        
	//  117  244:iaload          
	//  118  245:istore          4
			if((mDropDownGravity & 5) == 5)
	//* 119  247:aload_0         
	//* 120  248:getfield        #96  <Field int mDropDownGravity>
	//* 121  251:iconst_5        
	//* 122  252:iand            
	//* 123  253:iconst_5        
	//* 124  254:icmpne          282
			{
				if(i != 0)
	//* 125  257:iload_2         
	//* 126  258:ifeq            270
					i = i1 + l;
	//  127  261:iload           6
	//  128  263:iload           5
	//  129  265:iadd            
	//  130  266:istore_2        
				else
	//* 131  267:goto            304
					i = i1 - ((View) (obj1)).getWidth();
	//  132  270:iload           6
	//  133  272:aload           8
	//  134  274:invokevirtual   #349 <Method int View.getWidth()>
	//  135  277:isub            
	//  136  278:istore_2        
			} else
	//* 137  279:goto            304
			if(i != 0)
	//* 138  282:iload_2         
	//* 139  283:ifeq            298
				i = i1 + ((View) (obj1)).getWidth();
	//  140  286:iload           6
	//  141  288:aload           8
	//  142  290:invokevirtual   #349 <Method int View.getWidth()>
	//  143  293:iadd            
	//  144  294:istore_2        
			else
	//* 145  295:goto            304
				i = i1 - l;
	//  146  298:iload           6
	//  147  300:iload           5
	//  148  302:isub            
	//  149  303:istore_2        
			menupopupwindow.setHorizontalOffset(i);
	//  150  304:aload           9
	//  151  306:iload_2         
	//  152  307:invokevirtual   #352 <Method void MenuPopupWindow.setHorizontalOffset(int)>
			menupopupwindow.setVerticalOffset(j + k);
	//  153  310:aload           9
	//  154  312:iload_3         
	//  155  313:iload           4
	//  156  315:iadd            
	//  157  316:invokevirtual   #355 <Method void MenuPopupWindow.setVerticalOffset(int)>
		} else
	//* 158  319:goto            363
		{
			if(mHasXOffset)
	//* 159  322:aload_0         
	//* 160  323:getfield        #357 <Field boolean mHasXOffset>
	//* 161  326:ifeq            338
				menupopupwindow.setHorizontalOffset(mXOffset);
	//  162  329:aload           9
	//  163  331:aload_0         
	//  164  332:getfield        #359 <Field int mXOffset>
	//  165  335:invokevirtual   #352 <Method void MenuPopupWindow.setHorizontalOffset(int)>
			if(mHasYOffset)
	//* 166  338:aload_0         
	//* 167  339:getfield        #361 <Field boolean mHasYOffset>
	//* 168  342:ifeq            354
				menupopupwindow.setVerticalOffset(mYOffset);
	//  169  345:aload           9
	//  170  347:aload_0         
	//  171  348:getfield        #363 <Field int mYOffset>
	//  172  351:invokevirtual   #355 <Method void MenuPopupWindow.setVerticalOffset(int)>
			menupopupwindow.setEpicenterBounds(getEpicenterBounds());
	//  173  354:aload           9
	//  174  356:aload_0         
	//  175  357:invokevirtual   #367 <Method Rect getEpicenterBounds()>
	//  176  360:invokevirtual   #370 <Method void MenuPopupWindow.setEpicenterBounds(Rect)>
		}
		obj1 = ((Object) (new CascadingMenuInfo(menupopupwindow, menubuilder, mLastPosition)));
	//  177  363:new             #18  <Class CascadingMenuPopup$CascadingMenuInfo>
	//  178  366:dup             
	//  179  367:aload           9
	//  180  369:aload_1         
	//  181  370:aload_0         
	//  182  371:getfield        #114 <Field int mLastPosition>
	//  183  374:invokespecial   #373 <Method void CascadingMenuPopup$CascadingMenuInfo(MenuPopupWindow, MenuBuilder, int)>
	//  184  377:astore          8
		mShowingMenus.add(obj1);
	//  185  379:aload_0         
	//  186  380:getfield        #84  <Field List mShowingMenus>
	//  187  383:aload           8
	//  188  385:invokeinterface #377 <Method boolean List.add(Object)>
	//  189  390:pop             
		menupopupwindow.show();
	//  190  391:aload           9
	//  191  393:invokevirtual   #380 <Method void MenuPopupWindow.show()>
		if(obj == null && mShowTitle && menubuilder.getHeaderTitle() != null)
	//* 192  396:aload           7
	//* 193  398:ifnonnull       480
	//* 194  401:aload_0         
	//* 195  402:getfield        #382 <Field boolean mShowTitle>
	//* 196  405:ifeq            480
	//* 197  408:aload_1         
	//* 198  409:invokevirtual   #386 <Method CharSequence MenuBuilder.getHeaderTitle()>
	//* 199  412:ifnull          480
		{
			ListView listview = menupopupwindow.getListView();
	//  200  415:aload           9
	//  201  417:invokevirtual   #387 <Method ListView MenuPopupWindow.getListView()>
	//  202  420:astore          7
			FrameLayout framelayout = (FrameLayout)((LayoutInflater) (obj2)).inflate(android.support.v7.appcompat.R.layout.abc_popup_menu_header_item_layout, ((android.view.ViewGroup) (listview)), false);
	//  203  422:aload           10
	//  204  424:getstatic       #392 <Field int android.support.v7.appcompat.R$layout.abc_popup_menu_header_item_layout>
	//  205  427:aload           7
	//  206  429:iconst_0        
	//  207  430:invokevirtual   #396 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//  208  433:checkcast       #398 <Class FrameLayout>
	//  209  436:astore          8
			obj2 = ((Object) ((TextView)framelayout.findViewById(0x1020016)));
	//  210  438:aload           8
	//  211  440:ldc2            #399 <Int 0x1020016>
	//  212  443:invokevirtual   #402 <Method View FrameLayout.findViewById(int)>
	//  213  446:checkcast       #404 <Class TextView>
	//  214  449:astore          10
			framelayout.setEnabled(false);
	//  215  451:aload           8
	//  216  453:iconst_0        
	//  217  454:invokevirtual   #407 <Method void FrameLayout.setEnabled(boolean)>
			((TextView) (obj2)).setText(menubuilder.getHeaderTitle());
	//  218  457:aload           10
	//  219  459:aload_1         
	//  220  460:invokevirtual   #386 <Method CharSequence MenuBuilder.getHeaderTitle()>
	//  221  463:invokevirtual   #411 <Method void TextView.setText(CharSequence)>
			listview.addHeaderView(((View) (framelayout)), ((Object) (null)), false);
	//  222  466:aload           7
	//  223  468:aload           8
	//  224  470:aconst_null     
	//  225  471:iconst_0        
	//  226  472:invokevirtual   #415 <Method void ListView.addHeaderView(View, Object, boolean)>
			menupopupwindow.show();
	//  227  475:aload           9
	//  228  477:invokevirtual   #380 <Method void MenuPopupWindow.show()>
		}
	//  229  480:return          
	}

	public void addMenu(MenuBuilder menubuilder)
	{
		menubuilder.addMenuPresenter(((MenuPresenter) (this)), mContext);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #98  <Field Context mContext>
	//    4    6:invokevirtual   #420 <Method void MenuBuilder.addMenuPresenter(MenuPresenter, Context)>
		if(isShowing())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #304 <Method boolean isShowing()>
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
	//   13   23:getfield        #79  <Field List mPendingMenus>
	//   14   26:aload_1         
	//   15   27:invokeinterface #377 <Method boolean List.add(Object)>
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
	//    1    1:getfield        #84  <Field List mShowingMenus>
	//    2    4:invokeinterface #193 <Method int List.size()>
	//    3    9:istore_1        
		if(i > 0)
	//*   4   10:iload_1         
	//*   5   11:ifle            67
		{
			CascadingMenuInfo acascadingmenuinfo[] = (CascadingMenuInfo[])mShowingMenus.toArray(((Object []) (new CascadingMenuInfo[i])));
	//    6   14:aload_0         
	//    7   15:getfield        #84  <Field List mShowingMenus>
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
	//*  24   44:getfield        #342 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//*  25   47:invokevirtual   #431 <Method boolean MenuPopupWindow.isShowing()>
	//*  26   50:ifeq            60
					cascadingmenuinfo.window.dismiss();
	//   27   53:aload_3         
	//   28   54:getfield        #342 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   29   57:invokevirtual   #433 <Method void MenuPopupWindow.dismiss()>
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
	//*   1    1:getfield        #84  <Field List mShowingMenus>
	//*   2    4:invokeinterface #437 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            14
			return null;
	//    4   12:aconst_null     
	//    5   13:areturn         
		else
			return ((CascadingMenuInfo)mShowingMenus.get(mShowingMenus.size() - 1)).getListView();
	//    6   14:aload_0         
	//    7   15:getfield        #84  <Field List mShowingMenus>
	//    8   18:aload_0         
	//    9   19:getfield        #84  <Field List mShowingMenus>
	//   10   22:invokeinterface #193 <Method int List.size()>
	//   11   27:iconst_1        
	//   12   28:isub            
	//   13   29:invokeinterface #197 <Method Object List.get(int)>
	//   14   34:checkcast       #18  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   15   37:invokevirtual   #229 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   16   40:areturn         
	}

	public boolean isShowing()
	{
		return mShowingMenus.size() > 0 && ((CascadingMenuInfo)mShowingMenus.get(0)).window.isShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field List mShowingMenus>
	//    2    4:invokeinterface #193 <Method int List.size()>
	//    3    9:ifle            36
	//    4   12:aload_0         
	//    5   13:getfield        #84  <Field List mShowingMenus>
	//    6   16:iconst_0        
	//    7   17:invokeinterface #197 <Method Object List.get(int)>
	//    8   22:checkcast       #18  <Class CascadingMenuPopup$CascadingMenuInfo>
	//    9   25:getfield        #342 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   10   28:invokevirtual   #431 <Method boolean MenuPopupWindow.isShowing()>
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
	//    2    2:invokespecial   #441 <Method int findIndexOfAddedMenu(MenuBuilder)>
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
	//*  13   19:getfield        #84  <Field List mShowingMenus>
	//*  14   22:invokeinterface #193 <Method int List.size()>
	//*  15   27:icmpge          51
			((CascadingMenuInfo)mShowingMenus.get(j)).menu.close(false);
	//   16   30:aload_0         
	//   17   31:getfield        #84  <Field List mShowingMenus>
	//   18   34:iload           4
	//   19   36:invokeinterface #197 <Method Object List.get(int)>
	//   20   41:checkcast       #18  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   21   44:getfield        #201 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//   22   47:iconst_0        
	//   23   48:invokevirtual   #444 <Method void MenuBuilder.close(boolean)>
		CascadingMenuInfo cascadingmenuinfo = (CascadingMenuInfo)mShowingMenus.remove(i);
	//   24   51:aload_0         
	//   25   52:getfield        #84  <Field List mShowingMenus>
	//   26   55:iload_3         
	//   27   56:invokeinterface #447 <Method Object List.remove(int)>
	//   28   61:checkcast       #18  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   29   64:astore          5
		cascadingmenuinfo.menu.removeMenuPresenter(((MenuPresenter) (this)));
	//   30   66:aload           5
	//   31   68:getfield        #201 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//   32   71:aload_0         
	//   33   72:invokevirtual   #451 <Method void MenuBuilder.removeMenuPresenter(MenuPresenter)>
		if(mShouldCloseImmediately)
	//*  34   75:aload_0         
	//*  35   76:getfield        #453 <Field boolean mShouldCloseImmediately>
	//*  36   79:ifeq            100
		{
			cascadingmenuinfo.window.setExitTransition(((Object) (null)));
	//   37   82:aload           5
	//   38   84:getfield        #342 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   39   87:aconst_null     
	//   40   88:invokevirtual   #456 <Method void MenuPopupWindow.setExitTransition(Object)>
			cascadingmenuinfo.window.setAnimationStyle(0);
	//   41   91:aload           5
	//   42   93:getfield        #342 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   43   96:iconst_0        
	//   44   97:invokevirtual   #459 <Method void MenuPopupWindow.setAnimationStyle(int)>
		}
		cascadingmenuinfo.window.dismiss();
	//   45  100:aload           5
	//   46  102:getfield        #342 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//   47  105:invokevirtual   #433 <Method void MenuPopupWindow.dismiss()>
		i = mShowingMenus.size();
	//   48  108:aload_0         
	//   49  109:getfield        #84  <Field List mShowingMenus>
	//   50  112:invokeinterface #193 <Method int List.size()>
	//   51  117:istore_3        
		if(i > 0)
	//*  52  118:iload_3         
	//*  53  119:ifle            147
			mLastPosition = ((CascadingMenuInfo)mShowingMenus.get(i - 1)).position;
	//   54  122:aload_0         
	//   55  123:aload_0         
	//   56  124:getfield        #84  <Field List mShowingMenus>
	//   57  127:iload_3         
	//   58  128:iconst_1        
	//   59  129:isub            
	//   60  130:invokeinterface #197 <Method Object List.get(int)>
	//   61  135:checkcast       #18  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   62  138:getfield        #462 <Field int CascadingMenuPopup$CascadingMenuInfo.position>
	//   63  141:putfield        #114 <Field int mLastPosition>
		else
	//*  64  144:goto            155
			mLastPosition = getInitialMenuPosition();
	//   65  147:aload_0         
	//   66  148:aload_0         
	//   67  149:invokespecial   #112 <Method int getInitialMenuPosition()>
	//   68  152:putfield        #114 <Field int mLastPosition>
		if(i == 0)
	//*  69  155:iload_3         
	//*  70  156:ifne            224
		{
			dismiss();
	//   71  159:aload_0         
	//   72  160:invokevirtual   #463 <Method void dismiss()>
			if(mPresenterCallback != null)
	//*  73  163:aload_0         
	//*  74  164:getfield        #465 <Field MenuPresenter$Callback mPresenterCallback>
	//*  75  167:ifnull          181
				mPresenterCallback.onCloseMenu(menubuilder, true);
	//   76  170:aload_0         
	//   77  171:getfield        #465 <Field MenuPresenter$Callback mPresenterCallback>
	//   78  174:aload_1         
	//   79  175:iconst_1        
	//   80  176:invokeinterface #469 <Method void MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
			if(mTreeObserver != null)
	//*  81  181:aload_0         
	//*  82  182:getfield        #471 <Field ViewTreeObserver mTreeObserver>
	//*  83  185:ifnull          214
			{
				if(mTreeObserver.isAlive())
	//*  84  188:aload_0         
	//*  85  189:getfield        #471 <Field ViewTreeObserver mTreeObserver>
	//*  86  192:invokevirtual   #476 <Method boolean ViewTreeObserver.isAlive()>
	//*  87  195:ifeq            209
					mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
	//   88  198:aload_0         
	//   89  199:getfield        #471 <Field ViewTreeObserver mTreeObserver>
	//   90  202:aload_0         
	//   91  203:getfield        #89  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//   92  206:invokevirtual   #480 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				mTreeObserver = null;
	//   93  209:aload_0         
	//   94  210:aconst_null     
	//   95  211:putfield        #471 <Field ViewTreeObserver mTreeObserver>
			}
			mOnDismissListener.onDismiss();
	//   96  214:aload_0         
	//   97  215:getfield        #482 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//   98  218:invokeinterface #485 <Method void android.widget.PopupWindow$OnDismissListener.onDismiss()>
			return;
	//   99  223:return          
		}
		if(flag)
	//* 100  224:iload_2         
	//* 101  225:ifeq            248
			((CascadingMenuInfo)mShowingMenus.get(0)).menu.close(false);
	//  102  228:aload_0         
	//  103  229:getfield        #84  <Field List mShowingMenus>
	//  104  232:iconst_0        
	//  105  233:invokeinterface #197 <Method Object List.get(int)>
	//  106  238:checkcast       #18  <Class CascadingMenuPopup$CascadingMenuInfo>
	//  107  241:getfield        #201 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//  108  244:iconst_0        
	//  109  245:invokevirtual   #444 <Method void MenuBuilder.close(boolean)>
	//  110  248:return          
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
	//    5    6:getfield        #84  <Field List mShowingMenus>
	//    6    9:invokeinterface #193 <Method int List.size()>
	//    7   14:istore_2        
		CascadingMenuInfo cascadingmenuinfo;
		do
		{
			cascadingmenuinfo = ((CascadingMenuInfo) (obj));
	//    8   15:aload           4
	//    9   17:astore_3        
			if(i >= j)
				break;
	//   10   18:iload_1         
	//   11   19:iload_2         
	//   12   20:icmpge          57
			cascadingmenuinfo = (CascadingMenuInfo)mShowingMenus.get(i);
	//   13   23:aload_0         
	//   14   24:getfield        #84  <Field List mShowingMenus>
	//   15   27:iload_1         
	//   16   28:invokeinterface #197 <Method Object List.get(int)>
	//   17   33:checkcast       #18  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   18   36:astore_3        
			if(!cascadingmenuinfo.window.isShowing())
	//*  19   37:aload_3         
	//*  20   38:getfield        #342 <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
	//*  21   41:invokevirtual   #431 <Method boolean MenuPopupWindow.isShowing()>
	//*  22   44:ifne            50
				break;
	//   23   47:goto            57
			i++;
	//   24   50:iload_1         
	//   25   51:iconst_1        
	//   26   52:iadd            
	//   27   53:istore_1        
		} while(true);
	//   28   54:goto            15
		if(cascadingmenuinfo != null)
	//*  29   57:aload_3         
	//*  30   58:ifnull          69
			cascadingmenuinfo.menu.close(false);
	//   31   61:aload_3         
	//   32   62:getfield        #201 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//   33   65:iconst_0        
	//   34   66:invokevirtual   #444 <Method void MenuBuilder.close(boolean)>
	//   35   69:return          
	}

	public boolean onKey(View view, int i, KeyEvent keyevent)
	{
		if(keyevent.getAction() == 1 && i == 82)
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #492 <Method int KeyEvent.getAction()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          20
	//*   4    8:iload_2         
	//*   5    9:bipush          82
	//*   6   11:icmpne          20
		{
			dismiss();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #463 <Method void dismiss()>
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
	//*   1    1:getfield        #84  <Field List mShowingMenus>
	//*   2    4:invokeinterface #502 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #507 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            50
		{
			CascadingMenuInfo cascadingmenuinfo = (CascadingMenuInfo)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #511 <Method Object Iterator.next()>
	//    9   25:checkcast       #18  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   10   28:astore_3        
			if(submenubuilder == cascadingmenuinfo.menu)
	//*  11   29:aload_1         
	//*  12   30:aload_3         
	//*  13   31:getfield        #201 <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//*  14   34:if_acmpne       47
			{
				cascadingmenuinfo.getListView().requestFocus();
	//   15   37:aload_3         
	//   16   38:invokevirtual   #229 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   17   41:invokevirtual   #514 <Method boolean ListView.requestFocus()>
	//   18   44:pop             
				return true;
	//   19   45:iconst_1        
	//   20   46:ireturn         
			}
		}

	//*  21   47:goto            10
		if(submenubuilder.hasVisibleItems())
	//*  22   50:aload_1         
	//*  23   51:invokevirtual   #519 <Method boolean SubMenuBuilder.hasVisibleItems()>
	//*  24   54:ifeq            82
		{
			addMenu(((MenuBuilder) (submenubuilder)));
	//   25   57:aload_0         
	//   26   58:aload_1         
	//   27   59:invokevirtual   #521 <Method void addMenu(MenuBuilder)>
			if(mPresenterCallback != null)
	//*  28   62:aload_0         
	//*  29   63:getfield        #465 <Field MenuPresenter$Callback mPresenterCallback>
	//*  30   66:ifnull          80
				mPresenterCallback.onOpenSubMenu(((MenuBuilder) (submenubuilder)));
	//   31   69:aload_0         
	//   32   70:getfield        #465 <Field MenuPresenter$Callback mPresenterCallback>
	//   33   73:aload_1         
	//   34   74:invokeinterface #524 <Method boolean MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
	//   35   79:pop             
			return true;
	//   36   80:iconst_1        
	//   37   81:ireturn         
		} else
		{
			return false;
	//   38   82:iconst_0        
	//   39   83:ireturn         
		}
	}

	public void setAnchorView(View view)
	{
		if(mAnchorView != view)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field View mAnchorView>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       31
		{
			mAnchorView = view;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #100 <Field View mAnchorView>
			mDropDownGravity = GravityCompat.getAbsoluteGravity(mRawDropDownGravity, ViewCompat.getLayoutDirection(mAnchorView));
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #94  <Field int mRawDropDownGravity>
	//   10   18:aload_0         
	//   11   19:getfield        #100 <Field View mAnchorView>
	//   12   22:invokestatic    #268 <Method int ViewCompat.getLayoutDirection(View)>
	//   13   25:invokestatic    #529 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   14   28:putfield        #96  <Field int mDropDownGravity>
		}
	//   15   31:return          
	}

	public void setCallback(MenuPresenter.Callback callback)
	{
		mPresenterCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #465 <Field MenuPresenter$Callback mPresenterCallback>
	//    3    5:return          
	}

	public void setForceShowIcon(boolean flag)
	{
		mForceShowIcon = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #108 <Field boolean mForceShowIcon>
	//    3    5:return          
	}

	public void setGravity(int i)
	{
		if(mRawDropDownGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field int mRawDropDownGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          28
		{
			mRawDropDownGravity = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #94  <Field int mRawDropDownGravity>
			mDropDownGravity = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(mAnchorView));
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #100 <Field View mAnchorView>
	//   11   19:invokestatic    #268 <Method int ViewCompat.getLayoutDirection(View)>
	//   12   22:invokestatic    #529 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   13   25:putfield        #96  <Field int mDropDownGravity>
		}
	//   14   28:return          
	}

	public void setHorizontalOffset(int i)
	{
		mHasXOffset = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #357 <Field boolean mHasXOffset>
		mXOffset = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #359 <Field int mXOffset>
	//    6   10:return          
	}

	public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
	{
		mOnDismissListener = ondismisslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #482 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//    3    5:return          
	}

	public void setShowTitle(boolean flag)
	{
		mShowTitle = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #382 <Field boolean mShowTitle>
	//    3    5:return          
	}

	public void setVerticalOffset(int i)
	{
		mHasYOffset = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #361 <Field boolean mHasYOffset>
		mYOffset = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #363 <Field int mYOffset>
	//    6   10:return          
	}

	public void show()
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #304 <Method boolean isShowing()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		for(Iterator iterator = mPendingMenus.iterator(); iterator.hasNext(); showMenu((MenuBuilder)iterator.next()));
	//    4    8:aload_0         
	//    5    9:getfield        #79  <Field List mPendingMenus>
	//    6   12:invokeinterface #502 <Method Iterator List.iterator()>
	//    7   17:astore_2        
	//    8   18:aload_2         
	//    9   19:invokeinterface #507 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            43
	//   11   27:aload_0         
	//   12   28:aload_2         
	//   13   29:invokeinterface #511 <Method Object Iterator.next()>
	//   14   34:checkcast       #205 <Class MenuBuilder>
	//   15   37:invokespecial   #422 <Method void showMenu(MenuBuilder)>
	//*  16   40:goto            18
		mPendingMenus.clear();
	//   17   43:aload_0         
	//   18   44:getfield        #79  <Field List mPendingMenus>
	//   19   47:invokeinterface #536 <Method void List.clear()>
		mShownAnchorView = mAnchorView;
	//   20   52:aload_0         
	//   21   53:aload_0         
	//   22   54:getfield        #100 <Field View mAnchorView>
	//   23   57:putfield        #278 <Field View mShownAnchorView>
		if(mShownAnchorView != null)
	//*  24   60:aload_0         
	//*  25   61:getfield        #278 <Field View mShownAnchorView>
	//*  26   64:ifnull          107
		{
			boolean flag;
			if(mTreeObserver == null)
	//*  27   67:aload_0         
	//*  28   68:getfield        #471 <Field ViewTreeObserver mTreeObserver>
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
	//   37   83:getfield        #278 <Field View mShownAnchorView>
	//   38   86:invokevirtual   #540 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   39   89:putfield        #471 <Field ViewTreeObserver mTreeObserver>
			if(flag)
	//*  40   92:iload_1         
	//*  41   93:ifeq            107
				mTreeObserver.addOnGlobalLayoutListener(mGlobalLayoutListener);
	//   42   96:aload_0         
	//   43   97:getfield        #471 <Field ViewTreeObserver mTreeObserver>
	//   44  100:aload_0         
	//   45  101:getfield        #89  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//   46  104:invokevirtual   #543 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		}
	//   47  107:return          
	}

	public void updateMenuView(boolean flag)
	{
		for(Iterator iterator = mShowingMenus.iterator(); iterator.hasNext(); toMenuAdapter(((CascadingMenuInfo)iterator.next()).getListView().getAdapter()).notifyDataSetChanged());
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field List mShowingMenus>
	//    2    4:invokeinterface #502 <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #507 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            43
	//    7   19:aload_2         
	//    8   20:invokeinterface #511 <Method Object Iterator.next()>
	//    9   25:checkcast       #18  <Class CascadingMenuPopup$CascadingMenuInfo>
	//   10   28:invokevirtual   #229 <Method ListView CascadingMenuPopup$CascadingMenuInfo.getListView()>
	//   11   31:invokevirtual   #235 <Method android.widget.ListAdapter ListView.getAdapter()>
	//   12   34:invokestatic    #548 <Method MenuAdapter toMenuAdapter(android.widget.ListAdapter)>
	//   13   37:invokevirtual   #551 <Method void MenuAdapter.notifyDataSetChanged()>
	//*  14   40:goto            10
	//   15   43:return          
	}

	static final int HORIZ_POSITION_LEFT = 0;
	static final int HORIZ_POSITION_RIGHT = 1;
	static final int SUBMENU_TIMEOUT_MS = 200;
	private View mAnchorView;
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
		//*   3    7:ifeq            117
		//*   4   10:aload_0         
		//*   5   11:getfield        #14  <Field CascadingMenuPopup this$0>
		//*   6   14:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
		//*   7   17:invokeinterface #33  <Method int List.size()>
		//*   8   22:ifle            117
		//*   9   25:aload_0         
		//*  10   26:getfield        #14  <Field CascadingMenuPopup this$0>
		//*  11   29:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
		//*  12   32:iconst_0        
		//*  13   33:invokeinterface #37  <Method Object List.get(int)>
		//*  14   38:checkcast       #39  <Class CascadingMenuPopup$CascadingMenuInfo>
		//*  15   41:getfield        #43  <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
		//*  16   44:invokevirtual   #48  <Method boolean MenuPopupWindow.isModal()>
		//*  17   47:ifne            117
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
					return;
		//   30   76:return          
				}
				for(Iterator iterator = mShowingMenus.iterator(); iterator.hasNext(); ((CascadingMenuInfo)iterator.next()).window.show());
		//   31   77:aload_0         
		//   32   78:getfield        #14  <Field CascadingMenuPopup this$0>
		//   33   81:getfield        #27  <Field List CascadingMenuPopup.mShowingMenus>
		//   34   84:invokeinterface #64  <Method Iterator List.iterator()>
		//   35   89:astore_1        
		//   36   90:aload_1         
		//   37   91:invokeinterface #69  <Method boolean Iterator.hasNext()>
		//   38   96:ifeq            117
		//   39   99:aload_1         
		//   40  100:invokeinterface #73  <Method Object Iterator.next()>
		//   41  105:checkcast       #39  <Class CascadingMenuPopup$CascadingMenuInfo>
		//   42  108:getfield        #43  <Field MenuPopupWindow CascadingMenuPopup$CascadingMenuInfo.window>
		//   43  111:invokevirtual   #76  <Method void MenuPopupWindow.show()>
			}
		//*  44  114:goto            90
		//   45  117:return          
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
			do
			{
				l = ((int) (byte0));
		//   14   30:iload           5
		//   15   32:istore          4
				if(k >= i1)
					break;
		//   16   34:iload_3         
		//   17   35:iload           6
		//   18   37:icmpge          76
				if(menubuilder == ((CascadingMenuInfo)mShowingMenus.get(k)).menu)
		//*  19   40:aload_1         
		//*  20   41:aload_0         
		//*  21   42:getfield        #16  <Field CascadingMenuPopup this$0>
		//*  22   45:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//*  23   48:iload_3         
		//*  24   49:invokeinterface #47  <Method Object List.get(int)>
		//*  25   54:checkcast       #49  <Class CascadingMenuPopup$CascadingMenuInfo>
		//*  26   57:getfield        #53  <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
		//*  27   60:if_acmpne       69
				{
					l = k;
		//   28   63:iload_3         
		//   29   64:istore          4
					break;
		//   30   66:goto            76
				}
				k++;
		//   31   69:iload_3         
		//   32   70:iconst_1        
		//   33   71:iadd            
		//   34   72:istore_3        
			} while(true);
		//   35   73:goto            30
			if(l == -1)
		//*  36   76:iload           4
		//*  37   78:iconst_m1       
		//*  38   79:icmpne          83
				return;
		//   39   82:return          
			k = l + 1;
		//   40   83:iload           4
		//   41   85:iconst_1        
		//   42   86:iadd            
		//   43   87:istore_3        
			final CascadingMenuInfo nextInfo;
			if(k < mShowingMenus.size())
		//*  44   88:iload_3         
		//*  45   89:aload_0         
		//*  46   90:getfield        #16  <Field CascadingMenuPopup this$0>
		//*  47   93:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//*  48   96:invokeinterface #43  <Method int List.size()>
		//*  49  101:icmpge          125
				nextInfo = (CascadingMenuInfo)mShowingMenus.get(k);
		//   50  104:aload_0         
		//   51  105:getfield        #16  <Field CascadingMenuPopup this$0>
		//   52  108:getfield        #37  <Field List CascadingMenuPopup.mShowingMenus>
		//   53  111:iload_3         
		//   54  112:invokeinterface #47  <Method Object List.get(int)>
		//   55  117:checkcast       #49  <Class CascadingMenuPopup$CascadingMenuInfo>
		//   56  120:astore          9
			else
		//*  57  122:goto            128
				nextInfo = null;
		//   58  125:aconst_null     
		//   59  126:astore          9
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
				//    4    8:getfield        #23  <Field CascadingMenuPopup$2 this$1>
				//    5   11:getfield        #38  <Field CascadingMenuPopup CascadingMenuPopup$2.this$0>
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
				//   14   30:getfield        #23  <Field CascadingMenuPopup$2 this$1>
				//   15   33:getfield        #38  <Field CascadingMenuPopup CascadingMenuPopup$2.this$0>
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

				final _cls2 this$1;
				final MenuItem val$item;
				final MenuBuilder val$menu;
				final CascadingMenuInfo val$nextInfo;

			
			{
				this$1 = final__pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CascadingMenuPopup$2 this$1>
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
		//   60  128:new             #10  <Class CascadingMenuPopup$2$1>
		//   61  131:dup             
		//   62  132:aload_0         
		//   63  133:aload           9
		//   64  135:aload_2         
		//   65  136:aload_1         
		//   66  137:invokespecial   #56  <Method void CascadingMenuPopup$2$1(CascadingMenuPopup$2, CascadingMenuPopup$CascadingMenuInfo, MenuItem, MenuBuilder)>
		//   67  140:astore_2        
			long l1 = SystemClock.uptimeMillis();
		//   68  141:invokestatic    #62  <Method long SystemClock.uptimeMillis()>
		//   69  144:lstore          7
			mSubMenuHoverHandler.postAtTime(((Runnable) (item)), ((Object) (menubuilder)), l1 + 200L);
		//   70  146:aload_0         
		//   71  147:getfield        #16  <Field CascadingMenuPopup this$0>
		//   72  150:getfield        #27  <Field Handler CascadingMenuPopup.mSubMenuHoverHandler>
		//   73  153:aload_2         
		//   74  154:aload_1         
		//   75  155:lload           7
		//   76  157:ldc2w           #63  <Long 200L>
		//   77  160:ladd            
		//   78  161:invokevirtual   #68  <Method boolean Handler.postAtTime(Runnable, Object, long)>
		//   79  164:pop             
		//   80  165:return          
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
}
