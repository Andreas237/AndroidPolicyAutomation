// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.view.CollapsibleActionView;
import android.support.v7.view.menu.*;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

// Referenced classes of package android.support.v7.widget:
//			Toolbar

class Toolbar$ExpandedActionViewMenuPresenter
	implements MenuPresenter
{

	public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
	{
		if(mExpandedActionView instanceof CollapsibleActionView)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field Toolbar this$0>
	//*   2    4:getfield        #28  <Field View Toolbar.mExpandedActionView>
	//*   3    7:instanceof      #30  <Class CollapsibleActionView>
	//*   4   10:ifeq            28
			((CollapsibleActionView)mExpandedActionView).onActionViewCollapsed();
	//    5   13:aload_0         
	//    6   14:getfield        #16  <Field Toolbar this$0>
	//    7   17:getfield        #28  <Field View Toolbar.mExpandedActionView>
	//    8   20:checkcast       #30  <Class CollapsibleActionView>
	//    9   23:invokeinterface #33  <Method void CollapsibleActionView.onActionViewCollapsed()>
		menubuilder = ((MenuBuilder) (Toolbar.this));
	//   10   28:aload_0         
	//   11   29:getfield        #16  <Field Toolbar this$0>
	//   12   32:astore_1        
		((Toolbar) (menubuilder)).removeView(((Toolbar) (menubuilder)).mExpandedActionView);
	//   13   33:aload_1         
	//   14   34:aload_1         
	//   15   35:getfield        #28  <Field View Toolbar.mExpandedActionView>
	//   16   38:invokevirtual   #37  <Method void Toolbar.removeView(View)>
		menubuilder = ((MenuBuilder) (Toolbar.this));
	//   17   41:aload_0         
	//   18   42:getfield        #16  <Field Toolbar this$0>
	//   19   45:astore_1        
		((Toolbar) (menubuilder)).removeView(((View) (((Toolbar) (menubuilder)).mCollapseButtonView)));
	//   20   46:aload_1         
	//   21   47:aload_1         
	//   22   48:getfield        #41  <Field ImageButton Toolbar.mCollapseButtonView>
	//   23   51:invokevirtual   #37  <Method void Toolbar.removeView(View)>
		menubuilder = ((MenuBuilder) (Toolbar.this));
	//   24   54:aload_0         
	//   25   55:getfield        #16  <Field Toolbar this$0>
	//   26   58:astore_1        
		menubuilder.mExpandedActionView = null;
	//   27   59:aload_1         
	//   28   60:aconst_null     
	//   29   61:putfield        #28  <Field View Toolbar.mExpandedActionView>
		((Toolbar) (menubuilder)).addChildrenForExpandedActionView();
	//   30   64:aload_1         
	//   31   65:invokevirtual   #44  <Method void Toolbar.addChildrenForExpandedActionView()>
		mCurrentExpandedItem = null;
	//   32   68:aload_0         
	//   33   69:aconst_null     
	//   34   70:putfield        #46  <Field MenuItemImpl mCurrentExpandedItem>
		requestLayout();
	//   35   73:aload_0         
	//   36   74:getfield        #16  <Field Toolbar this$0>
	//   37   77:invokevirtual   #49  <Method void Toolbar.requestLayout()>
		menuitemimpl.setActionViewExpanded(false);
	//   38   80:aload_2         
	//   39   81:iconst_0        
	//   40   82:invokevirtual   #55  <Method void MenuItemImpl.setActionViewExpanded(boolean)>
		return true;
	//   41   85:iconst_1        
	//   42   86:ireturn         
	}

	public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
	{
		ensureCollapseButtonView();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Toolbar this$0>
	//    2    4:invokevirtual   #59  <Method void Toolbar.ensureCollapseButtonView()>
		menubuilder = ((MenuBuilder) (mCollapseButtonView.getParent()));
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field Toolbar this$0>
	//    5   11:getfield        #41  <Field ImageButton Toolbar.mCollapseButtonView>
	//    6   14:invokevirtual   #65  <Method android.view.ViewParent ImageButton.getParent()>
	//    7   17:astore_1        
		Toolbar toolbar = Toolbar.this;
	//    8   18:aload_0         
	//    9   19:getfield        #16  <Field Toolbar this$0>
	//   10   22:astore_3        
		if(menubuilder != toolbar)
	//*  11   23:aload_1         
	//*  12   24:aload_3         
	//*  13   25:if_acmpeq       59
		{
			if(menubuilder instanceof ViewGroup)
	//*  14   28:aload_1         
	//*  15   29:instanceof      #67  <Class ViewGroup>
	//*  16   32:ifeq            46
				((ViewGroup)menubuilder).removeView(((View) (toolbar.mCollapseButtonView)));
	//   17   35:aload_1         
	//   18   36:checkcast       #67  <Class ViewGroup>
	//   19   39:aload_3         
	//   20   40:getfield        #41  <Field ImageButton Toolbar.mCollapseButtonView>
	//   21   43:invokevirtual   #68  <Method void ViewGroup.removeView(View)>
			menubuilder = ((MenuBuilder) (Toolbar.this));
	//   22   46:aload_0         
	//   23   47:getfield        #16  <Field Toolbar this$0>
	//   24   50:astore_1        
			((Toolbar) (menubuilder)).addView(((View) (((Toolbar) (menubuilder)).mCollapseButtonView)));
	//   25   51:aload_1         
	//   26   52:aload_1         
	//   27   53:getfield        #41  <Field ImageButton Toolbar.mCollapseButtonView>
	//   28   56:invokevirtual   #71  <Method void Toolbar.addView(View)>
		}
		mExpandedActionView = menuitemimpl.getActionView();
	//   29   59:aload_0         
	//   30   60:getfield        #16  <Field Toolbar this$0>
	//   31   63:aload_2         
	//   32   64:invokevirtual   #75  <Method View MenuItemImpl.getActionView()>
	//   33   67:putfield        #28  <Field View Toolbar.mExpandedActionView>
		mCurrentExpandedItem = menuitemimpl;
	//   34   70:aload_0         
	//   35   71:aload_2         
	//   36   72:putfield        #46  <Field MenuItemImpl mCurrentExpandedItem>
		menubuilder = ((MenuBuilder) (mExpandedActionView.getParent()));
	//   37   75:aload_0         
	//   38   76:getfield        #16  <Field Toolbar this$0>
	//   39   79:getfield        #28  <Field View Toolbar.mExpandedActionView>
	//   40   82:invokevirtual   #78  <Method android.view.ViewParent View.getParent()>
	//   41   85:astore_1        
		toolbar = Toolbar.this;
	//   42   86:aload_0         
	//   43   87:getfield        #16  <Field Toolbar this$0>
	//   44   90:astore_3        
		if(menubuilder != toolbar)
	//*  45   91:aload_1         
	//*  46   92:aload_3         
	//*  47   93:if_acmpeq       168
		{
			if(menubuilder instanceof ViewGroup)
	//*  48   96:aload_1         
	//*  49   97:instanceof      #67  <Class ViewGroup>
	//*  50  100:ifeq            114
				((ViewGroup)menubuilder).removeView(toolbar.mExpandedActionView);
	//   51  103:aload_1         
	//   52  104:checkcast       #67  <Class ViewGroup>
	//   53  107:aload_3         
	//   54  108:getfield        #28  <Field View Toolbar.mExpandedActionView>
	//   55  111:invokevirtual   #68  <Method void ViewGroup.removeView(View)>
			menubuilder = ((MenuBuilder) (generateDefaultLayoutParams()));
	//   56  114:aload_0         
	//   57  115:getfield        #16  <Field Toolbar this$0>
	//   58  118:invokevirtual   #82  <Method Toolbar$LayoutParams Toolbar.generateDefaultLayoutParams()>
	//   59  121:astore_1        
			menubuilder.gravity = 0x800003 | mButtonGravity & 0x70;
	//   60  122:aload_1         
	//   61  123:ldc1            #83  <Int 0x800003>
	//   62  125:aload_0         
	//   63  126:getfield        #16  <Field Toolbar this$0>
	//   64  129:getfield        #87  <Field int Toolbar.mButtonGravity>
	//   65  132:bipush          112
	//   66  134:iand            
	//   67  135:ior             
	//   68  136:putfield        #92  <Field int Toolbar$LayoutParams.gravity>
			menubuilder.mViewType = 2;
	//   69  139:aload_1         
	//   70  140:iconst_2        
	//   71  141:putfield        #95  <Field int Toolbar$LayoutParams.mViewType>
			mExpandedActionView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (menubuilder)));
	//   72  144:aload_0         
	//   73  145:getfield        #16  <Field Toolbar this$0>
	//   74  148:getfield        #28  <Field View Toolbar.mExpandedActionView>
	//   75  151:aload_1         
	//   76  152:invokevirtual   #99  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			menubuilder = ((MenuBuilder) (Toolbar.this));
	//   77  155:aload_0         
	//   78  156:getfield        #16  <Field Toolbar this$0>
	//   79  159:astore_1        
			((Toolbar) (menubuilder)).addView(((Toolbar) (menubuilder)).mExpandedActionView);
	//   80  160:aload_1         
	//   81  161:aload_1         
	//   82  162:getfield        #28  <Field View Toolbar.mExpandedActionView>
	//   83  165:invokevirtual   #71  <Method void Toolbar.addView(View)>
		}
		removeChildrenForExpandedActionView();
	//   84  168:aload_0         
	//   85  169:getfield        #16  <Field Toolbar this$0>
	//   86  172:invokevirtual   #102 <Method void Toolbar.removeChildrenForExpandedActionView()>
		requestLayout();
	//   87  175:aload_0         
	//   88  176:getfield        #16  <Field Toolbar this$0>
	//   89  179:invokevirtual   #49  <Method void Toolbar.requestLayout()>
		menuitemimpl.setActionViewExpanded(true);
	//   90  182:aload_2         
	//   91  183:iconst_1        
	//   92  184:invokevirtual   #55  <Method void MenuItemImpl.setActionViewExpanded(boolean)>
		if(mExpandedActionView instanceof CollapsibleActionView)
	//*  93  187:aload_0         
	//*  94  188:getfield        #16  <Field Toolbar this$0>
	//*  95  191:getfield        #28  <Field View Toolbar.mExpandedActionView>
	//*  96  194:instanceof      #30  <Class CollapsibleActionView>
	//*  97  197:ifeq            215
			((CollapsibleActionView)mExpandedActionView).onActionViewExpanded();
	//   98  200:aload_0         
	//   99  201:getfield        #16  <Field Toolbar this$0>
	//  100  204:getfield        #28  <Field View Toolbar.mExpandedActionView>
	//  101  207:checkcast       #30  <Class CollapsibleActionView>
	//  102  210:invokeinterface #105 <Method void CollapsibleActionView.onActionViewExpanded()>
		return true;
	//  103  215:iconst_1        
	//  104  216:ireturn         
	}

	public boolean flagActionItems()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getId()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public MenuView getMenuView(ViewGroup viewgroup)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void initForMenu(Context context, MenuBuilder menubuilder)
	{
		context = ((Context) (mMenu));
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field MenuBuilder mMenu>
	//    2    4:astore_1        
		if(context != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
		{
			MenuItemImpl menuitemimpl = mCurrentExpandedItem;
	//    5    9:aload_0         
	//    6   10:getfield        #46  <Field MenuItemImpl mCurrentExpandedItem>
	//    7   13:astore_3        
			if(menuitemimpl != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          24
				((MenuBuilder) (context)).d(menuitemimpl);
	//   10   18:aload_1         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #121 <Method boolean MenuBuilder.d(MenuItemImpl)>
	//   13   23:pop             
		}
		mMenu = menubuilder;
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:putfield        #115 <Field MenuBuilder mMenu>
	//   17   29:return          
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
	//    0    0:return          
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

	public boolean onSubMenuSelected(a a)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setCallback(android.support.v7.view.menu.MenuPresenter.Callback callback)
	{
	//    0    0:return          
	}

	public void updateMenuView(boolean flag)
	{
		if(mCurrentExpandedItem != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field MenuItemImpl mCurrentExpandedItem>
	//*   2    4:ifnull          86
		{
			MenuBuilder menubuilder = mMenu;
	//    3    7:aload_0         
	//    4    8:getfield        #115 <Field MenuBuilder mMenu>
	//    5   11:astore          6
			boolean flag2 = false;
	//    6   13:iconst_0        
	//    7   14:istore          4
			boolean flag1 = flag2;
	//    8   16:iload           4
	//    9   18:istore_3        
			if(menubuilder != null)
	//*  10   19:aload           6
	//*  11   21:ifnull          69
			{
				int j = menubuilder.size();
	//   12   24:aload           6
	//   13   26:invokevirtual   #135 <Method int MenuBuilder.size()>
	//   14   29:istore          5
				int i = 0;
	//   15   31:iconst_0        
	//   16   32:istore_2        
				do
				{
					flag1 = flag2;
	//   17   33:iload           4
	//   18   35:istore_3        
					if(i >= j)
						break;
	//   19   36:iload_2         
	//   20   37:iload           5
	//   21   39:icmpge          69
					if(mMenu.getItem(i) == mCurrentExpandedItem)
	//*  22   42:aload_0         
	//*  23   43:getfield        #115 <Field MenuBuilder mMenu>
	//*  24   46:iload_2         
	//*  25   47:invokevirtual   #139 <Method android.view.MenuItem MenuBuilder.getItem(int)>
	//*  26   50:aload_0         
	//*  27   51:getfield        #46  <Field MenuItemImpl mCurrentExpandedItem>
	//*  28   54:if_acmpne       62
					{
						flag1 = true;
	//   29   57:iconst_1        
	//   30   58:istore_3        
						break;
	//   31   59:goto            69
					}
					i++;
	//   32   62:iload_2         
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:istore_2        
				} while(true);
	//   36   66:goto            33
			}
			if(!flag1)
	//*  37   69:iload_3         
	//*  38   70:ifne            86
				collapseItemActionView(mMenu, mCurrentExpandedItem);
	//   39   73:aload_0         
	//   40   74:aload_0         
	//   41   75:getfield        #115 <Field MenuBuilder mMenu>
	//   42   78:aload_0         
	//   43   79:getfield        #46  <Field MenuItemImpl mCurrentExpandedItem>
	//   44   82:invokevirtual   #141 <Method boolean collapseItemActionView(MenuBuilder, MenuItemImpl)>
	//   45   85:pop             
		}
	//   46   86:return          
	}

	MenuItemImpl mCurrentExpandedItem;
	MenuBuilder mMenu;
	final Toolbar this$0;

	Toolbar$ExpandedActionViewMenuPresenter()
	{
		this$0 = Toolbar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Toolbar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
