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
	//*   1    1:getfield        #19  <Field Toolbar this$0>
	//*   2    4:getfield        #29  <Field View Toolbar.mExpandedActionView>
	//*   3    7:instanceof      #31  <Class CollapsibleActionView>
	//*   4   10:ifeq            28
			((CollapsibleActionView)mExpandedActionView).onActionViewCollapsed();
	//    5   13:aload_0         
	//    6   14:getfield        #19  <Field Toolbar this$0>
	//    7   17:getfield        #29  <Field View Toolbar.mExpandedActionView>
	//    8   20:checkcast       #31  <Class CollapsibleActionView>
	//    9   23:invokeinterface #34  <Method void CollapsibleActionView.onActionViewCollapsed()>
		removeView(mExpandedActionView);
	//   10   28:aload_0         
	//   11   29:getfield        #19  <Field Toolbar this$0>
	//   12   32:aload_0         
	//   13   33:getfield        #19  <Field Toolbar this$0>
	//   14   36:getfield        #29  <Field View Toolbar.mExpandedActionView>
	//   15   39:invokevirtual   #38  <Method void Toolbar.removeView(View)>
		removeView(((View) (mCollapseButtonView)));
	//   16   42:aload_0         
	//   17   43:getfield        #19  <Field Toolbar this$0>
	//   18   46:aload_0         
	//   19   47:getfield        #19  <Field Toolbar this$0>
	//   20   50:getfield        #42  <Field ImageButton Toolbar.mCollapseButtonView>
	//   21   53:invokevirtual   #38  <Method void Toolbar.removeView(View)>
		mExpandedActionView = null;
	//   22   56:aload_0         
	//   23   57:getfield        #19  <Field Toolbar this$0>
	//   24   60:aconst_null     
	//   25   61:putfield        #29  <Field View Toolbar.mExpandedActionView>
		addChildrenForExpandedActionView();
	//   26   64:aload_0         
	//   27   65:getfield        #19  <Field Toolbar this$0>
	//   28   68:invokevirtual   #45  <Method void Toolbar.addChildrenForExpandedActionView()>
		mCurrentExpandedItem = null;
	//   29   71:aload_0         
	//   30   72:aconst_null     
	//   31   73:putfield        #47  <Field MenuItemImpl mCurrentExpandedItem>
		requestLayout();
	//   32   76:aload_0         
	//   33   77:getfield        #19  <Field Toolbar this$0>
	//   34   80:invokevirtual   #50  <Method void Toolbar.requestLayout()>
		menuitemimpl.setActionViewExpanded(false);
	//   35   83:aload_2         
	//   36   84:iconst_0        
	//   37   85:invokevirtual   #56  <Method void MenuItemImpl.setActionViewExpanded(boolean)>
		return true;
	//   38   88:iconst_1        
	//   39   89:ireturn         
	}

	public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
	{
		ensureCollapseButtonView();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Toolbar this$0>
	//    2    4:invokevirtual   #60  <Method void Toolbar.ensureCollapseButtonView()>
		if(mCollapseButtonView.getParent() != Toolbar.this)
	//*   3    7:aload_0         
	//*   4    8:getfield        #19  <Field Toolbar this$0>
	//*   5   11:getfield        #42  <Field ImageButton Toolbar.mCollapseButtonView>
	//*   6   14:invokevirtual   #66  <Method android.view.ViewParent ImageButton.getParent()>
	//*   7   17:aload_0         
	//*   8   18:getfield        #19  <Field Toolbar this$0>
	//*   9   21:if_acmpeq       38
			addView(((View) (mCollapseButtonView)));
	//   10   24:aload_0         
	//   11   25:getfield        #19  <Field Toolbar this$0>
	//   12   28:aload_0         
	//   13   29:getfield        #19  <Field Toolbar this$0>
	//   14   32:getfield        #42  <Field ImageButton Toolbar.mCollapseButtonView>
	//   15   35:invokevirtual   #69  <Method void Toolbar.addView(View)>
		mExpandedActionView = menuitemimpl.getActionView();
	//   16   38:aload_0         
	//   17   39:getfield        #19  <Field Toolbar this$0>
	//   18   42:aload_2         
	//   19   43:invokevirtual   #73  <Method View MenuItemImpl.getActionView()>
	//   20   46:putfield        #29  <Field View Toolbar.mExpandedActionView>
		mCurrentExpandedItem = menuitemimpl;
	//   21   49:aload_0         
	//   22   50:aload_2         
	//   23   51:putfield        #47  <Field MenuItemImpl mCurrentExpandedItem>
		if(mExpandedActionView.getParent() != Toolbar.this)
	//*  24   54:aload_0         
	//*  25   55:getfield        #19  <Field Toolbar this$0>
	//*  26   58:getfield        #29  <Field View Toolbar.mExpandedActionView>
	//*  27   61:invokevirtual   #76  <Method android.view.ViewParent View.getParent()>
	//*  28   64:aload_0         
	//*  29   65:getfield        #19  <Field Toolbar this$0>
	//*  30   68:if_acmpeq       126
		{
			menubuilder = ((MenuBuilder) (generateDefaultLayoutParams()));
	//   31   71:aload_0         
	//   32   72:getfield        #19  <Field Toolbar this$0>
	//   33   75:invokevirtual   #80  <Method Toolbar$LayoutParams Toolbar.generateDefaultLayoutParams()>
	//   34   78:astore_1        
			menubuilder.gravity = mButtonGravity & 0x70 | 0x800003;
	//   35   79:aload_1         
	//   36   80:aload_0         
	//   37   81:getfield        #19  <Field Toolbar this$0>
	//   38   84:getfield        #84  <Field int Toolbar.mButtonGravity>
	//   39   87:bipush          112
	//   40   89:iand            
	//   41   90:ldc1            #85  <Int 0x800003>
	//   42   92:ior             
	//   43   93:putfield        #90  <Field int Toolbar$LayoutParams.gravity>
			menubuilder.mViewType = 2;
	//   44   96:aload_1         
	//   45   97:iconst_2        
	//   46   98:putfield        #93  <Field int Toolbar$LayoutParams.mViewType>
			mExpandedActionView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (menubuilder)));
	//   47  101:aload_0         
	//   48  102:getfield        #19  <Field Toolbar this$0>
	//   49  105:getfield        #29  <Field View Toolbar.mExpandedActionView>
	//   50  108:aload_1         
	//   51  109:invokevirtual   #97  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			addView(mExpandedActionView);
	//   52  112:aload_0         
	//   53  113:getfield        #19  <Field Toolbar this$0>
	//   54  116:aload_0         
	//   55  117:getfield        #19  <Field Toolbar this$0>
	//   56  120:getfield        #29  <Field View Toolbar.mExpandedActionView>
	//   57  123:invokevirtual   #69  <Method void Toolbar.addView(View)>
		}
		removeChildrenForExpandedActionView();
	//   58  126:aload_0         
	//   59  127:getfield        #19  <Field Toolbar this$0>
	//   60  130:invokevirtual   #100 <Method void Toolbar.removeChildrenForExpandedActionView()>
		requestLayout();
	//   61  133:aload_0         
	//   62  134:getfield        #19  <Field Toolbar this$0>
	//   63  137:invokevirtual   #50  <Method void Toolbar.requestLayout()>
		menuitemimpl.setActionViewExpanded(true);
	//   64  140:aload_2         
	//   65  141:iconst_1        
	//   66  142:invokevirtual   #56  <Method void MenuItemImpl.setActionViewExpanded(boolean)>
		if(mExpandedActionView instanceof CollapsibleActionView)
	//*  67  145:aload_0         
	//*  68  146:getfield        #19  <Field Toolbar this$0>
	//*  69  149:getfield        #29  <Field View Toolbar.mExpandedActionView>
	//*  70  152:instanceof      #31  <Class CollapsibleActionView>
	//*  71  155:ifeq            173
			((CollapsibleActionView)mExpandedActionView).onActionViewExpanded();
	//   72  158:aload_0         
	//   73  159:getfield        #19  <Field Toolbar this$0>
	//   74  162:getfield        #29  <Field View Toolbar.mExpandedActionView>
	//   75  165:checkcast       #31  <Class CollapsibleActionView>
	//   76  168:invokeinterface #103 <Method void CollapsibleActionView.onActionViewExpanded()>
		return true;
	//   77  173:iconst_1        
	//   78  174:ireturn         
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
		if(mMenu != null && mCurrentExpandedItem != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field MenuBuilder mMenu>
	//*   2    4:ifnull          26
	//*   3    7:aload_0         
	//*   4    8:getfield        #47  <Field MenuItemImpl mCurrentExpandedItem>
	//*   5   11:ifnull          26
			mMenu.collapseItemActionView(mCurrentExpandedItem);
	//    6   14:aload_0         
	//    7   15:getfield        #113 <Field MenuBuilder mMenu>
	//    8   18:aload_0         
	//    9   19:getfield        #47  <Field MenuItemImpl mCurrentExpandedItem>
	//   10   22:invokevirtual   #118 <Method boolean MenuBuilder.collapseItemActionView(MenuItemImpl)>
	//   11   25:pop             
		mMenu = menubuilder;
	//   12   26:aload_0         
	//   13   27:aload_2         
	//   14   28:putfield        #113 <Field MenuBuilder mMenu>
	//   15   31:return          
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

	public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
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
	//*   1    1:getfield        #47  <Field MenuItemImpl mCurrentExpandedItem>
	//*   2    4:ifnull          84
		{
			boolean flag2 = false;
	//    3    7:iconst_0        
	//    4    8:istore          4
			boolean flag1 = flag2;
	//    5   10:iload           4
	//    6   12:istore_3        
			if(mMenu != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #113 <Field MenuBuilder mMenu>
	//*   9   17:ifnull          67
			{
				int j = mMenu.size();
	//   10   20:aload_0         
	//   11   21:getfield        #113 <Field MenuBuilder mMenu>
	//   12   24:invokevirtual   #132 <Method int MenuBuilder.size()>
	//   13   27:istore          5
				int i = 0;
	//   14   29:iconst_0        
	//   15   30:istore_2        
				do
				{
					flag1 = flag2;
	//   16   31:iload           4
	//   17   33:istore_3        
					if(i >= j)
						break;
	//   18   34:iload_2         
	//   19   35:iload           5
	//   20   37:icmpge          67
					if(mMenu.getItem(i) == mCurrentExpandedItem)
	//*  21   40:aload_0         
	//*  22   41:getfield        #113 <Field MenuBuilder mMenu>
	//*  23   44:iload_2         
	//*  24   45:invokevirtual   #136 <Method android.view.MenuItem MenuBuilder.getItem(int)>
	//*  25   48:aload_0         
	//*  26   49:getfield        #47  <Field MenuItemImpl mCurrentExpandedItem>
	//*  27   52:if_acmpne       60
					{
						flag1 = true;
	//   28   55:iconst_1        
	//   29   56:istore_3        
						break;
	//   30   57:goto            67
					}
					i++;
	//   31   60:iload_2         
	//   32   61:iconst_1        
	//   33   62:iadd            
	//   34   63:istore_2        
				} while(true);
	//   35   64:goto            31
			}
			if(!flag1)
	//*  36   67:iload_3         
	//*  37   68:ifne            84
				collapseItemActionView(mMenu, mCurrentExpandedItem);
	//   38   71:aload_0         
	//   39   72:aload_0         
	//   40   73:getfield        #113 <Field MenuBuilder mMenu>
	//   41   76:aload_0         
	//   42   77:getfield        #47  <Field MenuItemImpl mCurrentExpandedItem>
	//   43   80:invokevirtual   #138 <Method boolean collapseItemActionView(MenuBuilder, MenuItemImpl)>
	//   44   83:pop             
		}
	//   45   84:return          
	}

	MenuItemImpl mCurrentExpandedItem;
	MenuBuilder mMenu;
	final Toolbar this$0;

	Toolbar$ExpandedActionViewMenuPresenter()
	{
		this$0 = Toolbar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Toolbar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
