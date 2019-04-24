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

private class Toolbar$ExpandedActionViewMenuPresenter
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
		menubuilder = ((MenuBuilder) (mCollapseButtonView.getParent()));
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field Toolbar this$0>
	//    5   11:getfield        #42  <Field ImageButton Toolbar.mCollapseButtonView>
	//    6   14:invokevirtual   #66  <Method android.view.ViewParent ImageButton.getParent()>
	//    7   17:astore_1        
		if(menubuilder != Toolbar.this)
	//*   8   18:aload_1         
	//*   9   19:aload_0         
	//*  10   20:getfield        #19  <Field Toolbar this$0>
	//*  11   23:if_acmpeq       61
		{
			if(menubuilder instanceof ViewGroup)
	//*  12   26:aload_1         
	//*  13   27:instanceof      #68  <Class ViewGroup>
	//*  14   30:ifeq            47
				((ViewGroup)menubuilder).removeView(((View) (mCollapseButtonView)));
	//   15   33:aload_1         
	//   16   34:checkcast       #68  <Class ViewGroup>
	//   17   37:aload_0         
	//   18   38:getfield        #19  <Field Toolbar this$0>
	//   19   41:getfield        #42  <Field ImageButton Toolbar.mCollapseButtonView>
	//   20   44:invokevirtual   #69  <Method void ViewGroup.removeView(View)>
			addView(((View) (mCollapseButtonView)));
	//   21   47:aload_0         
	//   22   48:getfield        #19  <Field Toolbar this$0>
	//   23   51:aload_0         
	//   24   52:getfield        #19  <Field Toolbar this$0>
	//   25   55:getfield        #42  <Field ImageButton Toolbar.mCollapseButtonView>
	//   26   58:invokevirtual   #72  <Method void Toolbar.addView(View)>
		}
		mExpandedActionView = menuitemimpl.getActionView();
	//   27   61:aload_0         
	//   28   62:getfield        #19  <Field Toolbar this$0>
	//   29   65:aload_2         
	//   30   66:invokevirtual   #76  <Method View MenuItemImpl.getActionView()>
	//   31   69:putfield        #29  <Field View Toolbar.mExpandedActionView>
		mCurrentExpandedItem = menuitemimpl;
	//   32   72:aload_0         
	//   33   73:aload_2         
	//   34   74:putfield        #47  <Field MenuItemImpl mCurrentExpandedItem>
		menubuilder = ((MenuBuilder) (mExpandedActionView.getParent()));
	//   35   77:aload_0         
	//   36   78:getfield        #19  <Field Toolbar this$0>
	//   37   81:getfield        #29  <Field View Toolbar.mExpandedActionView>
	//   38   84:invokevirtual   #79  <Method android.view.ViewParent View.getParent()>
	//   39   87:astore_1        
		if(menubuilder != Toolbar.this)
	//*  40   88:aload_1         
	//*  41   89:aload_0         
	//*  42   90:getfield        #19  <Field Toolbar this$0>
	//*  43   93:if_acmpeq       172
		{
			if(menubuilder instanceof ViewGroup)
	//*  44   96:aload_1         
	//*  45   97:instanceof      #68  <Class ViewGroup>
	//*  46  100:ifeq            117
				((ViewGroup)menubuilder).removeView(mExpandedActionView);
	//   47  103:aload_1         
	//   48  104:checkcast       #68  <Class ViewGroup>
	//   49  107:aload_0         
	//   50  108:getfield        #19  <Field Toolbar this$0>
	//   51  111:getfield        #29  <Field View Toolbar.mExpandedActionView>
	//   52  114:invokevirtual   #69  <Method void ViewGroup.removeView(View)>
			menubuilder = ((MenuBuilder) (generateDefaultLayoutParams()));
	//   53  117:aload_0         
	//   54  118:getfield        #19  <Field Toolbar this$0>
	//   55  121:invokevirtual   #83  <Method Toolbar$LayoutParams Toolbar.generateDefaultLayoutParams()>
	//   56  124:astore_1        
			menubuilder.gravity = 0x800003 | mButtonGravity & 0x70;
	//   57  125:aload_1         
	//   58  126:ldc1            #84  <Int 0x800003>
	//   59  128:aload_0         
	//   60  129:getfield        #19  <Field Toolbar this$0>
	//   61  132:getfield        #88  <Field int Toolbar.mButtonGravity>
	//   62  135:bipush          112
	//   63  137:iand            
	//   64  138:ior             
	//   65  139:putfield        #93  <Field int Toolbar$LayoutParams.gravity>
			menubuilder.mViewType = 2;
	//   66  142:aload_1         
	//   67  143:iconst_2        
	//   68  144:putfield        #96  <Field int Toolbar$LayoutParams.mViewType>
			mExpandedActionView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (menubuilder)));
	//   69  147:aload_0         
	//   70  148:getfield        #19  <Field Toolbar this$0>
	//   71  151:getfield        #29  <Field View Toolbar.mExpandedActionView>
	//   72  154:aload_1         
	//   73  155:invokevirtual   #100 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			addView(mExpandedActionView);
	//   74  158:aload_0         
	//   75  159:getfield        #19  <Field Toolbar this$0>
	//   76  162:aload_0         
	//   77  163:getfield        #19  <Field Toolbar this$0>
	//   78  166:getfield        #29  <Field View Toolbar.mExpandedActionView>
	//   79  169:invokevirtual   #72  <Method void Toolbar.addView(View)>
		}
		removeChildrenForExpandedActionView();
	//   80  172:aload_0         
	//   81  173:getfield        #19  <Field Toolbar this$0>
	//   82  176:invokevirtual   #103 <Method void Toolbar.removeChildrenForExpandedActionView()>
		requestLayout();
	//   83  179:aload_0         
	//   84  180:getfield        #19  <Field Toolbar this$0>
	//   85  183:invokevirtual   #50  <Method void Toolbar.requestLayout()>
		menuitemimpl.setActionViewExpanded(true);
	//   86  186:aload_2         
	//   87  187:iconst_1        
	//   88  188:invokevirtual   #56  <Method void MenuItemImpl.setActionViewExpanded(boolean)>
		if(mExpandedActionView instanceof CollapsibleActionView)
	//*  89  191:aload_0         
	//*  90  192:getfield        #19  <Field Toolbar this$0>
	//*  91  195:getfield        #29  <Field View Toolbar.mExpandedActionView>
	//*  92  198:instanceof      #31  <Class CollapsibleActionView>
	//*  93  201:ifeq            219
			((CollapsibleActionView)mExpandedActionView).onActionViewExpanded();
	//   94  204:aload_0         
	//   95  205:getfield        #19  <Field Toolbar this$0>
	//   96  208:getfield        #29  <Field View Toolbar.mExpandedActionView>
	//   97  211:checkcast       #31  <Class CollapsibleActionView>
	//   98  214:invokeinterface #106 <Method void CollapsibleActionView.onActionViewExpanded()>
		return true;
	//   99  219:iconst_1        
	//  100  220:ireturn         
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
	//*   1    1:getfield        #116 <Field MenuBuilder mMenu>
	//*   2    4:ifnull          26
	//*   3    7:aload_0         
	//*   4    8:getfield        #47  <Field MenuItemImpl mCurrentExpandedItem>
	//*   5   11:ifnull          26
			mMenu.collapseItemActionView(mCurrentExpandedItem);
	//    6   14:aload_0         
	//    7   15:getfield        #116 <Field MenuBuilder mMenu>
	//    8   18:aload_0         
	//    9   19:getfield        #47  <Field MenuItemImpl mCurrentExpandedItem>
	//   10   22:invokevirtual   #121 <Method boolean MenuBuilder.collapseItemActionView(MenuItemImpl)>
	//   11   25:pop             
		mMenu = menubuilder;
	//   12   26:aload_0         
	//   13   27:aload_2         
	//   14   28:putfield        #116 <Field MenuBuilder mMenu>
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
	//*   2    4:ifnull          88
		{
			MenuBuilder menubuilder = mMenu;
	//    3    7:aload_0         
	//    4    8:getfield        #116 <Field MenuBuilder mMenu>
	//    5   11:astore          6
			boolean flag2 = false;
	//    6   13:iconst_0        
	//    7   14:istore          4
			boolean flag1 = flag2;
	//    8   16:iload           4
	//    9   18:istore_3        
			if(menubuilder != null)
	//*  10   19:aload           6
	//*  11   21:ifnull          71
			{
				int j = mMenu.size();
	//   12   24:aload_0         
	//   13   25:getfield        #116 <Field MenuBuilder mMenu>
	//   14   28:invokevirtual   #135 <Method int MenuBuilder.size()>
	//   15   31:istore          5
				int i = 0;
	//   16   33:iconst_0        
	//   17   34:istore_2        
				do
				{
					flag1 = flag2;
	//   18   35:iload           4
	//   19   37:istore_3        
					if(i >= j)
						break;
	//   20   38:iload_2         
	//   21   39:iload           5
	//   22   41:icmpge          71
					if(mMenu.getItem(i) == mCurrentExpandedItem)
	//*  23   44:aload_0         
	//*  24   45:getfield        #116 <Field MenuBuilder mMenu>
	//*  25   48:iload_2         
	//*  26   49:invokevirtual   #139 <Method android.view.MenuItem MenuBuilder.getItem(int)>
	//*  27   52:aload_0         
	//*  28   53:getfield        #47  <Field MenuItemImpl mCurrentExpandedItem>
	//*  29   56:if_acmpne       64
					{
						flag1 = true;
	//   30   59:iconst_1        
	//   31   60:istore_3        
						break;
	//   32   61:goto            71
					}
					i++;
	//   33   64:iload_2         
	//   34   65:iconst_1        
	//   35   66:iadd            
	//   36   67:istore_2        
				} while(true);
	//   37   68:goto            35
			}
			if(!flag1)
	//*  38   71:iload_3         
	//*  39   72:ifne            88
				collapseItemActionView(mMenu, mCurrentExpandedItem);
	//   40   75:aload_0         
	//   41   76:aload_0         
	//   42   77:getfield        #116 <Field MenuBuilder mMenu>
	//   43   80:aload_0         
	//   44   81:getfield        #47  <Field MenuItemImpl mCurrentExpandedItem>
	//   45   84:invokevirtual   #141 <Method boolean collapseItemActionView(MenuBuilder, MenuItemImpl)>
	//   46   87:pop             
		}
	//   47   88:return          
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
