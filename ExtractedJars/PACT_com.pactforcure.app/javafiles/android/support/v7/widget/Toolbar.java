// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.*;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.CollapsibleActionView;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.*;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.*;
import android.widget.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			TintTypedArray, RtlSpacingHelper, AppCompatImageView, ActionMenuView, 
//			AppCompatImageButton, ToolbarWidgetWrapper, ViewUtils, ActionMenuPresenter, 
//			AppCompatTextView, DecorToolbar

public class Toolbar extends ViewGroup
{
	private class ExpandedActionViewMenuPresenter
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
				menubuilder.gravity = 0x800003 | mButtonGravity & 0x70;
		//   35   79:aload_1         
		//   36   80:ldc1            #81  <Int 0x800003>
		//   37   82:aload_0         
		//   38   83:getfield        #19  <Field Toolbar this$0>
		//   39   86:getfield        #85  <Field int Toolbar.mButtonGravity>
		//   40   89:bipush          112
		//   41   91:iand            
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
			if(mCurrentExpandedItem == null) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field MenuItemImpl mCurrentExpandedItem>
		//    2    4:ifnull          74
_L1:
			boolean flag1;
			boolean flag2;
			flag2 = false;
		//    3    7:iconst_0        
		//    4    8:istore          4
			flag1 = flag2;
		//    5   10:iload           4
		//    6   12:istore_3        
			if(mMenu == null) goto _L4; else goto _L3
		//    7   13:aload_0         
		//    8   14:getfield        #113 <Field MenuBuilder mMenu>
		//    9   17:ifnull          57
_L3:
			int i;
			int j;
			j = mMenu.size();
		//   10   20:aload_0         
		//   11   21:getfield        #113 <Field MenuBuilder mMenu>
		//   12   24:invokevirtual   #132 <Method int MenuBuilder.size()>
		//   13   27:istore          5
			i = 0;
		//   14   29:iconst_0        
		//   15   30:istore_2        
_L9:
			flag1 = flag2;
		//   16   31:iload           4
		//   17   33:istore_3        
			if(i >= j) goto _L4; else goto _L5
		//   18   34:iload_2         
		//   19   35:iload           5
		//   20   37:icmpge          57
_L5:
			if(mMenu.getItem(i) != mCurrentExpandedItem) goto _L7; else goto _L6
		//   21   40:aload_0         
		//   22   41:getfield        #113 <Field MenuBuilder mMenu>
		//   23   44:iload_2         
		//   24   45:invokevirtual   #136 <Method MenuItem MenuBuilder.getItem(int)>
		//   25   48:aload_0         
		//   26   49:getfield        #47  <Field MenuItemImpl mCurrentExpandedItem>
		//   27   52:if_acmpne       75
_L6:
			flag1 = true;
		//   28   55:iconst_1        
		//   29   56:istore_3        
_L4:
			if(!flag1)
		//*  30   57:iload_3         
		//*  31   58:ifne            74
				collapseItemActionView(mMenu, mCurrentExpandedItem);
		//   32   61:aload_0         
		//   33   62:aload_0         
		//   34   63:getfield        #113 <Field MenuBuilder mMenu>
		//   35   66:aload_0         
		//   36   67:getfield        #47  <Field MenuItemImpl mCurrentExpandedItem>
		//   37   70:invokevirtual   #138 <Method boolean collapseItemActionView(MenuBuilder, MenuItemImpl)>
		//   38   73:pop             
_L2:
			return;
		//   39   74:return          
_L7:
			i++;
		//   40   75:iload_2         
		//   41   76:iconst_1        
		//   42   77:iadd            
		//   43   78:istore_2        
			if(true) goto _L9; else goto _L8
		//   44   79:goto            31
_L8:
		}

		MenuItemImpl mCurrentExpandedItem;
		MenuBuilder mMenu;
		final Toolbar this$0;

		ExpandedActionViewMenuPresenter()
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

	public static class LayoutParams extends android.support.v7.app.ActionBar.LayoutParams
	{

		void copyMarginsFromCompat(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			leftMargin = marginlayoutparams.leftMargin;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #51  <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
		//    3    5:putfield        #52  <Field int leftMargin>
			topMargin = marginlayoutparams.topMargin;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:getfield        #55  <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
		//    7   13:putfield        #56  <Field int topMargin>
			rightMargin = marginlayoutparams.rightMargin;
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:getfield        #59  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
		//   11   21:putfield        #60  <Field int rightMargin>
			bottomMargin = marginlayoutparams.bottomMargin;
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:getfield        #63  <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
		//   15   29:putfield        #64  <Field int bottomMargin>
		//   16   32:return          
		}

		static final int CUSTOM = 0;
		static final int EXPANDED = 2;
		static final int SYSTEM = 1;
		int mViewType;

		public LayoutParams(int i)
		{
			this(-2, -1, i);
		//    0    0:aload_0         
		//    1    1:bipush          -2
		//    2    3:iconst_m1       
		//    3    4:iload_1         
		//    4    5:invokespecial   #20  <Method void Toolbar$LayoutParams(int, int, int)>
		//    5    8:return          
		}

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #24  <Method void android.support.v7.app.ActionBar$LayoutParams(int, int)>
			mViewType = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #26  <Field int mViewType>
			gravity = 0x800013;
		//    7   11:aload_0         
		//    8   12:ldc1            #27  <Int 0x800013>
		//    9   14:putfield        #30  <Field int gravity>
		//   10   17:return          
		}

		public LayoutParams(int i, int j, int k)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #24  <Method void android.support.v7.app.ActionBar$LayoutParams(int, int)>
			mViewType = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #26  <Field int mViewType>
			gravity = k;
		//    7   11:aload_0         
		//    8   12:iload_3         
		//    9   13:putfield        #30  <Field int gravity>
		//   10   16:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #34  <Method void android.support.v7.app.ActionBar$LayoutParams(Context, AttributeSet)>
			mViewType = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #26  <Field int mViewType>
		//    7   11:return          
		}

		public LayoutParams(android.support.v7.app.ActionBar.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #38  <Method void android.support.v7.app.ActionBar$LayoutParams(android.support.v7.app.ActionBar$LayoutParams)>
			mViewType = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #26  <Field int mViewType>
		//    6   10:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.support.v7.app.ActionBar.LayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #38  <Method void android.support.v7.app.ActionBar$LayoutParams(android.support.v7.app.ActionBar$LayoutParams)>
			mViewType = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #26  <Field int mViewType>
			mViewType = layoutparams.mViewType;
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:getfield        #26  <Field int mViewType>
		//    9   15:putfield        #26  <Field int mViewType>
		//   10   18:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #42  <Method void android.support.v7.app.ActionBar$LayoutParams(android.view.ViewGroup$LayoutParams)>
			mViewType = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #26  <Field int mViewType>
		//    6   10:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(((android.view.ViewGroup.LayoutParams) (marginlayoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #42  <Method void android.support.v7.app.ActionBar$LayoutParams(android.view.ViewGroup$LayoutParams)>
			mViewType = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #26  <Field int mViewType>
			copyMarginsFromCompat(marginlayoutparams);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:invokevirtual   #46  <Method void copyMarginsFromCompat(android.view.ViewGroup$MarginLayoutParams)>
		//    9   15:return          
		}
	}

	public static interface OnMenuItemClickListener
	{

		public abstract boolean onMenuItemClick(MenuItem menuitem);
	}

	public static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #46  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(expandedMenuItemId);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #37  <Field int expandedMenuItemId>
		//    7   11:invokevirtual   #50  <Method void Parcel.writeInt(int)>
			if(isOverflowOpen)
		//*   8   14:aload_0         
		//*   9   15:getfield        #39  <Field boolean isOverflowOpen>
		//*  10   18:ifeq            29
				i = 1;
		//   11   21:iconst_1        
		//   12   22:istore_2        
			else
		//*  13   23:aload_1         
		//*  14   24:iload_2         
		//*  15   25:invokevirtual   #50  <Method void Parcel.writeInt(int)>
		//*  16   28:return          
				i = 0;
		//   17   29:iconst_0        
		//   18   30:istore_2        
			parcel.writeInt(i);
		//*  19   31:goto            23
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class Toolbar$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void Toolbar$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class Toolbar$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void Toolbar$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method Toolbar$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method Toolbar$SavedState createFromParcel(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public SavedState[] newArray(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #34  <Method Toolbar$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		int expandedMenuItemId;
		boolean isOverflowOpen;

		static 
		{
		//    0    0:new             #9   <Class Toolbar$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void Toolbar$SavedState$1()>
		//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel)
		{
			this(parcel, ((ClassLoader) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #28  <Method void Toolbar$SavedState(Parcel, ClassLoader)>
		//    4    6:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #29  <Method void AbsSavedState(Parcel, ClassLoader)>
			expandedMenuItemId = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #35  <Method int Parcel.readInt()>
		//    7   11:putfield        #37  <Field int expandedMenuItemId>
			boolean flag;
			if(parcel.readInt() != 0)
		//*   8   14:aload_1         
		//*   9   15:invokevirtual   #35  <Method int Parcel.readInt()>
		//*  10   18:ifeq            29
				flag = true;
		//   11   21:iconst_1        
		//   12   22:istore_3        
			else
		//*  13   23:aload_0         
		//*  14   24:iload_3         
		//*  15   25:putfield        #39  <Field boolean isOverflowOpen>
		//*  16   28:return          
				flag = false;
		//   17   29:iconst_0        
		//   18   30:istore_3        
			isOverflowOpen = flag;
		//*  19   31:goto            23
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #42  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}


	public Toolbar(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #96  <Method void Toolbar(Context, AttributeSet)>
	//    4    6:return          
	}

	public Toolbar(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.toolbarStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #103 <Field int android.support.v7.appcompat.R$attr.toolbarStyle>
	//    4    6:invokespecial   #106 <Method void Toolbar(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public Toolbar(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #108 <Method void ViewGroup(Context, AttributeSet, int)>
		mGravity = 0x800013;
	//    5    7:aload_0         
	//    6    8:ldc1            #109 <Int 0x800013>
	//    7   10:putfield        #111 <Field int mGravity>
		mTempViews = new ArrayList();
	//    8   13:aload_0         
	//    9   14:new             #113 <Class ArrayList>
	//   10   17:dup             
	//   11   18:invokespecial   #116 <Method void ArrayList()>
	//   12   21:putfield        #118 <Field ArrayList mTempViews>
		mHiddenViews = new ArrayList();
	//   13   24:aload_0         
	//   14   25:new             #113 <Class ArrayList>
	//   15   28:dup             
	//   16   29:invokespecial   #116 <Method void ArrayList()>
	//   17   32:putfield        #120 <Field ArrayList mHiddenViews>
		mTempMargins = new int[2];
	//   18   35:aload_0         
	//   19   36:iconst_2        
	//   20   37:newarray        int[]
	//   21   39:putfield        #122 <Field int[] mTempMargins>
		mMenuViewItemClickListener = new ActionMenuView.OnMenuItemClickListener() {

			public boolean onMenuItemClick(MenuItem menuitem)
			{
				if(mOnMenuItemClickListener != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #14  <Field Toolbar this$0>
			//*   2    4:getfield        #24  <Field Toolbar$OnMenuItemClickListener Toolbar.mOnMenuItemClickListener>
			//*   3    7:ifnull          24
					return mOnMenuItemClickListener.onMenuItemClick(menuitem);
			//    4   10:aload_0         
			//    5   11:getfield        #14  <Field Toolbar this$0>
			//    6   14:getfield        #24  <Field Toolbar$OnMenuItemClickListener Toolbar.mOnMenuItemClickListener>
			//    7   17:aload_1         
			//    8   18:invokeinterface #28  <Method boolean Toolbar$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
			//    9   23:ireturn         
				else
					return false;
			//   10   24:iconst_0        
			//   11   25:ireturn         
			}

			final Toolbar this$0;

			
			{
				this$0 = Toolbar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field Toolbar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   22   42:aload_0         
	//   23   43:new             #6   <Class Toolbar$1>
	//   24   46:dup             
	//   25   47:aload_0         
	//   26   48:invokespecial   #125 <Method void Toolbar$1(Toolbar)>
	//   27   51:putfield        #127 <Field ActionMenuView$OnMenuItemClickListener mMenuViewItemClickListener>
		mShowOverflowMenuRunnable = new Runnable() {

			public void run()
			{
				showOverflowMenu();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field Toolbar this$0>
			//    2    4:invokevirtual   #23  <Method boolean Toolbar.showOverflowMenu()>
			//    3    7:pop             
			//    4    8:return          
			}

			final Toolbar this$0;

			
			{
				this$0 = Toolbar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field Toolbar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   28   54:aload_0         
	//   29   55:new             #8   <Class Toolbar$2>
	//   30   58:dup             
	//   31   59:aload_0         
	//   32   60:invokespecial   #128 <Method void Toolbar$2(Toolbar)>
	//   33   63:putfield        #130 <Field Runnable mShowOverflowMenuRunnable>
		context = ((Context) (TintTypedArray.obtainStyledAttributes(getContext(), attributeset, android.support.v7.appcompat.R.styleable.Toolbar, i, 0)));
	//   34   66:aload_0         
	//   35   67:invokevirtual   #134 <Method Context getContext()>
	//   36   70:aload_2         
	//   37   71:getstatic       #138 <Field int[] android.support.v7.appcompat.R$styleable.Toolbar>
	//   38   74:iload_3         
	//   39   75:iconst_0        
	//   40   76:invokestatic    #144 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   41   79:astore_1        
		mTitleTextAppearance = ((TintTypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.Toolbar_titleTextAppearance, 0);
	//   42   80:aload_0         
	//   43   81:aload_1         
	//   44   82:getstatic       #147 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleTextAppearance>
	//   45   85:iconst_0        
	//   46   86:invokevirtual   #151 <Method int TintTypedArray.getResourceId(int, int)>
	//   47   89:putfield        #153 <Field int mTitleTextAppearance>
		mSubtitleTextAppearance = ((TintTypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.Toolbar_subtitleTextAppearance, 0);
	//   48   92:aload_0         
	//   49   93:aload_1         
	//   50   94:getstatic       #156 <Field int android.support.v7.appcompat.R$styleable.Toolbar_subtitleTextAppearance>
	//   51   97:iconst_0        
	//   52   98:invokevirtual   #151 <Method int TintTypedArray.getResourceId(int, int)>
	//   53  101:putfield        #158 <Field int mSubtitleTextAppearance>
		mGravity = ((TintTypedArray) (context)).getInteger(android.support.v7.appcompat.R.styleable.Toolbar_android_gravity, mGravity);
	//   54  104:aload_0         
	//   55  105:aload_1         
	//   56  106:getstatic       #161 <Field int android.support.v7.appcompat.R$styleable.Toolbar_android_gravity>
	//   57  109:aload_0         
	//   58  110:getfield        #111 <Field int mGravity>
	//   59  113:invokevirtual   #164 <Method int TintTypedArray.getInteger(int, int)>
	//   60  116:putfield        #111 <Field int mGravity>
		mButtonGravity = ((TintTypedArray) (context)).getInteger(android.support.v7.appcompat.R.styleable.Toolbar_buttonGravity, 48);
	//   61  119:aload_0         
	//   62  120:aload_1         
	//   63  121:getstatic       #167 <Field int android.support.v7.appcompat.R$styleable.Toolbar_buttonGravity>
	//   64  124:bipush          48
	//   65  126:invokevirtual   #164 <Method int TintTypedArray.getInteger(int, int)>
	//   66  129:putfield        #169 <Field int mButtonGravity>
		int j = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMargin, 0);
	//   67  132:aload_1         
	//   68  133:getstatic       #172 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleMargin>
	//   69  136:iconst_0        
	//   70  137:invokevirtual   #175 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//   71  140:istore          4
		i = j;
	//   72  142:iload           4
	//   73  144:istore_3        
		if(((TintTypedArray) (context)).hasValue(android.support.v7.appcompat.R.styleable.Toolbar_titleMargins))
	//*  74  145:aload_1         
	//*  75  146:getstatic       #178 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleMargins>
	//*  76  149:invokevirtual   #182 <Method boolean TintTypedArray.hasValue(int)>
	//*  77  152:ifeq            165
			i = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMargins, j);
	//   78  155:aload_1         
	//   79  156:getstatic       #178 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleMargins>
	//   80  159:iload           4
	//   81  161:invokevirtual   #175 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//   82  164:istore_3        
		mTitleMarginBottom = i;
	//   83  165:aload_0         
	//   84  166:iload_3         
	//   85  167:putfield        #184 <Field int mTitleMarginBottom>
		mTitleMarginTop = i;
	//   86  170:aload_0         
	//   87  171:iload_3         
	//   88  172:putfield        #186 <Field int mTitleMarginTop>
		mTitleMarginEnd = i;
	//   89  175:aload_0         
	//   90  176:iload_3         
	//   91  177:putfield        #188 <Field int mTitleMarginEnd>
		mTitleMarginStart = i;
	//   92  180:aload_0         
	//   93  181:iload_3         
	//   94  182:putfield        #190 <Field int mTitleMarginStart>
		i = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMarginStart, -1);
	//   95  185:aload_1         
	//   96  186:getstatic       #193 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleMarginStart>
	//   97  189:iconst_m1       
	//   98  190:invokevirtual   #175 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//   99  193:istore_3        
		if(i >= 0)
	//* 100  194:iload_3         
	//* 101  195:iflt            203
			mTitleMarginStart = i;
	//  102  198:aload_0         
	//  103  199:iload_3         
	//  104  200:putfield        #190 <Field int mTitleMarginStart>
		i = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMarginEnd, -1);
	//  105  203:aload_1         
	//  106  204:getstatic       #196 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleMarginEnd>
	//  107  207:iconst_m1       
	//  108  208:invokevirtual   #175 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  109  211:istore_3        
		if(i >= 0)
	//* 110  212:iload_3         
	//* 111  213:iflt            221
			mTitleMarginEnd = i;
	//  112  216:aload_0         
	//  113  217:iload_3         
	//  114  218:putfield        #188 <Field int mTitleMarginEnd>
		i = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMarginTop, -1);
	//  115  221:aload_1         
	//  116  222:getstatic       #199 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleMarginTop>
	//  117  225:iconst_m1       
	//  118  226:invokevirtual   #175 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  119  229:istore_3        
		if(i >= 0)
	//* 120  230:iload_3         
	//* 121  231:iflt            239
			mTitleMarginTop = i;
	//  122  234:aload_0         
	//  123  235:iload_3         
	//  124  236:putfield        #186 <Field int mTitleMarginTop>
		i = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMarginBottom, -1);
	//  125  239:aload_1         
	//  126  240:getstatic       #202 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleMarginBottom>
	//  127  243:iconst_m1       
	//  128  244:invokevirtual   #175 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  129  247:istore_3        
		if(i >= 0)
	//* 130  248:iload_3         
	//* 131  249:iflt            257
			mTitleMarginBottom = i;
	//  132  252:aload_0         
	//  133  253:iload_3         
	//  134  254:putfield        #184 <Field int mTitleMarginBottom>
		mMaxButtonHeight = ((TintTypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.Toolbar_maxButtonHeight, -1);
	//  135  257:aload_0         
	//  136  258:aload_1         
	//  137  259:getstatic       #205 <Field int android.support.v7.appcompat.R$styleable.Toolbar_maxButtonHeight>
	//  138  262:iconst_m1       
	//  139  263:invokevirtual   #208 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  140  266:putfield        #210 <Field int mMaxButtonHeight>
		i = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetStart, 0x80000000);
	//  141  269:aload_1         
	//  142  270:getstatic       #213 <Field int android.support.v7.appcompat.R$styleable.Toolbar_contentInsetStart>
	//  143  273:ldc1            #214 <Int 0x80000000>
	//  144  275:invokevirtual   #175 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  145  278:istore_3        
		j = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetEnd, 0x80000000);
	//  146  279:aload_1         
	//  147  280:getstatic       #217 <Field int android.support.v7.appcompat.R$styleable.Toolbar_contentInsetEnd>
	//  148  283:ldc1            #214 <Int 0x80000000>
	//  149  285:invokevirtual   #175 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  150  288:istore          4
		int k = ((TintTypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetLeft, 0);
	//  151  290:aload_1         
	//  152  291:getstatic       #220 <Field int android.support.v7.appcompat.R$styleable.Toolbar_contentInsetLeft>
	//  153  294:iconst_0        
	//  154  295:invokevirtual   #208 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  155  298:istore          5
		int l = ((TintTypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetRight, 0);
	//  156  300:aload_1         
	//  157  301:getstatic       #223 <Field int android.support.v7.appcompat.R$styleable.Toolbar_contentInsetRight>
	//  158  304:iconst_0        
	//  159  305:invokevirtual   #208 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  160  308:istore          6
		ensureContentInsets();
	//  161  310:aload_0         
	//  162  311:invokespecial   #226 <Method void ensureContentInsets()>
		mContentInsets.setAbsolute(k, l);
	//  163  314:aload_0         
	//  164  315:getfield        #228 <Field RtlSpacingHelper mContentInsets>
	//  165  318:iload           5
	//  166  320:iload           6
	//  167  322:invokevirtual   #234 <Method void RtlSpacingHelper.setAbsolute(int, int)>
		if(i != 0x80000000 || j != 0x80000000)
	//* 168  325:iload_3         
	//* 169  326:ldc1            #214 <Int 0x80000000>
	//* 170  328:icmpne          338
	//* 171  331:iload           4
	//* 172  333:ldc1            #214 <Int 0x80000000>
	//* 173  335:icmpeq          348
			mContentInsets.setRelative(i, j);
	//  174  338:aload_0         
	//  175  339:getfield        #228 <Field RtlSpacingHelper mContentInsets>
	//  176  342:iload_3         
	//  177  343:iload           4
	//  178  345:invokevirtual   #237 <Method void RtlSpacingHelper.setRelative(int, int)>
		mContentInsetStartWithNavigation = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetStartWithNavigation, 0x80000000);
	//  179  348:aload_0         
	//  180  349:aload_1         
	//  181  350:getstatic       #240 <Field int android.support.v7.appcompat.R$styleable.Toolbar_contentInsetStartWithNavigation>
	//  182  353:ldc1            #214 <Int 0x80000000>
	//  183  355:invokevirtual   #175 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  184  358:putfield        #242 <Field int mContentInsetStartWithNavigation>
		mContentInsetEndWithActions = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetEndWithActions, 0x80000000);
	//  185  361:aload_0         
	//  186  362:aload_1         
	//  187  363:getstatic       #245 <Field int android.support.v7.appcompat.R$styleable.Toolbar_contentInsetEndWithActions>
	//  188  366:ldc1            #214 <Int 0x80000000>
	//  189  368:invokevirtual   #175 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  190  371:putfield        #247 <Field int mContentInsetEndWithActions>
		mCollapseIcon = ((TintTypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.Toolbar_collapseIcon);
	//  191  374:aload_0         
	//  192  375:aload_1         
	//  193  376:getstatic       #250 <Field int android.support.v7.appcompat.R$styleable.Toolbar_collapseIcon>
	//  194  379:invokevirtual   #254 <Method Drawable TintTypedArray.getDrawable(int)>
	//  195  382:putfield        #256 <Field Drawable mCollapseIcon>
		mCollapseDescription = ((TintTypedArray) (context)).getText(android.support.v7.appcompat.R.styleable.Toolbar_collapseContentDescription);
	//  196  385:aload_0         
	//  197  386:aload_1         
	//  198  387:getstatic       #259 <Field int android.support.v7.appcompat.R$styleable.Toolbar_collapseContentDescription>
	//  199  390:invokevirtual   #263 <Method CharSequence TintTypedArray.getText(int)>
	//  200  393:putfield        #265 <Field CharSequence mCollapseDescription>
		attributeset = ((AttributeSet) (((TintTypedArray) (context)).getText(android.support.v7.appcompat.R.styleable.Toolbar_title)));
	//  201  396:aload_1         
	//  202  397:getstatic       #268 <Field int android.support.v7.appcompat.R$styleable.Toolbar_title>
	//  203  400:invokevirtual   #263 <Method CharSequence TintTypedArray.getText(int)>
	//  204  403:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (attributeset))))
	//* 205  404:aload_2         
	//* 206  405:invokestatic    #274 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 207  408:ifne            416
			setTitle(((CharSequence) (attributeset)));
	//  208  411:aload_0         
	//  209  412:aload_2         
	//  210  413:invokevirtual   #278 <Method void setTitle(CharSequence)>
		attributeset = ((AttributeSet) (((TintTypedArray) (context)).getText(android.support.v7.appcompat.R.styleable.Toolbar_subtitle)));
	//  211  416:aload_1         
	//  212  417:getstatic       #281 <Field int android.support.v7.appcompat.R$styleable.Toolbar_subtitle>
	//  213  420:invokevirtual   #263 <Method CharSequence TintTypedArray.getText(int)>
	//  214  423:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (attributeset))))
	//* 215  424:aload_2         
	//* 216  425:invokestatic    #274 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 217  428:ifne            436
			setSubtitle(((CharSequence) (attributeset)));
	//  218  431:aload_0         
	//  219  432:aload_2         
	//  220  433:invokevirtual   #284 <Method void setSubtitle(CharSequence)>
		mPopupContext = getContext();
	//  221  436:aload_0         
	//  222  437:aload_0         
	//  223  438:invokevirtual   #134 <Method Context getContext()>
	//  224  441:putfield        #286 <Field Context mPopupContext>
		setPopupTheme(((TintTypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.Toolbar_popupTheme, 0));
	//  225  444:aload_0         
	//  226  445:aload_1         
	//  227  446:getstatic       #289 <Field int android.support.v7.appcompat.R$styleable.Toolbar_popupTheme>
	//  228  449:iconst_0        
	//  229  450:invokevirtual   #151 <Method int TintTypedArray.getResourceId(int, int)>
	//  230  453:invokevirtual   #293 <Method void setPopupTheme(int)>
		attributeset = ((AttributeSet) (((TintTypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.Toolbar_navigationIcon)));
	//  231  456:aload_1         
	//  232  457:getstatic       #296 <Field int android.support.v7.appcompat.R$styleable.Toolbar_navigationIcon>
	//  233  460:invokevirtual   #254 <Method Drawable TintTypedArray.getDrawable(int)>
	//  234  463:astore_2        
		if(attributeset != null)
	//* 235  464:aload_2         
	//* 236  465:ifnull          473
			setNavigationIcon(((Drawable) (attributeset)));
	//  237  468:aload_0         
	//  238  469:aload_2         
	//  239  470:invokevirtual   #300 <Method void setNavigationIcon(Drawable)>
		attributeset = ((AttributeSet) (((TintTypedArray) (context)).getText(android.support.v7.appcompat.R.styleable.Toolbar_navigationContentDescription)));
	//  240  473:aload_1         
	//  241  474:getstatic       #303 <Field int android.support.v7.appcompat.R$styleable.Toolbar_navigationContentDescription>
	//  242  477:invokevirtual   #263 <Method CharSequence TintTypedArray.getText(int)>
	//  243  480:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (attributeset))))
	//* 244  481:aload_2         
	//* 245  482:invokestatic    #274 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 246  485:ifne            493
			setNavigationContentDescription(((CharSequence) (attributeset)));
	//  247  488:aload_0         
	//  248  489:aload_2         
	//  249  490:invokevirtual   #306 <Method void setNavigationContentDescription(CharSequence)>
		attributeset = ((AttributeSet) (((TintTypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.Toolbar_logo)));
	//  250  493:aload_1         
	//  251  494:getstatic       #309 <Field int android.support.v7.appcompat.R$styleable.Toolbar_logo>
	//  252  497:invokevirtual   #254 <Method Drawable TintTypedArray.getDrawable(int)>
	//  253  500:astore_2        
		if(attributeset != null)
	//* 254  501:aload_2         
	//* 255  502:ifnull          510
			setLogo(((Drawable) (attributeset)));
	//  256  505:aload_0         
	//  257  506:aload_2         
	//  258  507:invokevirtual   #312 <Method void setLogo(Drawable)>
		attributeset = ((AttributeSet) (((TintTypedArray) (context)).getText(android.support.v7.appcompat.R.styleable.Toolbar_logoDescription)));
	//  259  510:aload_1         
	//  260  511:getstatic       #315 <Field int android.support.v7.appcompat.R$styleable.Toolbar_logoDescription>
	//  261  514:invokevirtual   #263 <Method CharSequence TintTypedArray.getText(int)>
	//  262  517:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (attributeset))))
	//* 263  518:aload_2         
	//* 264  519:invokestatic    #274 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 265  522:ifne            530
			setLogoDescription(((CharSequence) (attributeset)));
	//  266  525:aload_0         
	//  267  526:aload_2         
	//  268  527:invokevirtual   #318 <Method void setLogoDescription(CharSequence)>
		if(((TintTypedArray) (context)).hasValue(android.support.v7.appcompat.R.styleable.Toolbar_titleTextColor))
	//* 269  530:aload_1         
	//* 270  531:getstatic       #321 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleTextColor>
	//* 271  534:invokevirtual   #182 <Method boolean TintTypedArray.hasValue(int)>
	//* 272  537:ifeq            552
			setTitleTextColor(((TintTypedArray) (context)).getColor(android.support.v7.appcompat.R.styleable.Toolbar_titleTextColor, -1));
	//  273  540:aload_0         
	//  274  541:aload_1         
	//  275  542:getstatic       #321 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleTextColor>
	//  276  545:iconst_m1       
	//  277  546:invokevirtual   #324 <Method int TintTypedArray.getColor(int, int)>
	//  278  549:invokevirtual   #327 <Method void setTitleTextColor(int)>
		if(((TintTypedArray) (context)).hasValue(android.support.v7.appcompat.R.styleable.Toolbar_subtitleTextColor))
	//* 279  552:aload_1         
	//* 280  553:getstatic       #330 <Field int android.support.v7.appcompat.R$styleable.Toolbar_subtitleTextColor>
	//* 281  556:invokevirtual   #182 <Method boolean TintTypedArray.hasValue(int)>
	//* 282  559:ifeq            574
			setSubtitleTextColor(((TintTypedArray) (context)).getColor(android.support.v7.appcompat.R.styleable.Toolbar_subtitleTextColor, -1));
	//  283  562:aload_0         
	//  284  563:aload_1         
	//  285  564:getstatic       #330 <Field int android.support.v7.appcompat.R$styleable.Toolbar_subtitleTextColor>
	//  286  567:iconst_m1       
	//  287  568:invokevirtual   #324 <Method int TintTypedArray.getColor(int, int)>
	//  288  571:invokevirtual   #333 <Method void setSubtitleTextColor(int)>
		((TintTypedArray) (context)).recycle();
	//  289  574:aload_1         
	//  290  575:invokevirtual   #336 <Method void TintTypedArray.recycle()>
	//  291  578:return          
	}

	private void addCustomViewsWithGravity(List list, int i)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		int j;
		int k;
		if(ViewCompat.getLayoutDirection(((View) (this))) != 1)
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//*   4    6:iconst_1        
	//*   5    7:icmpne          109
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #348 <Method int getChildCount()>
	//*   8   14:istore          5
	//*   9   16:iload_2         
	//*  10   17:aload_0         
	//*  11   18:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//*  12   21:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//*  13   24:istore          4
	//*  14   26:aload_1         
	//*  15   27:invokeinterface #358 <Method void List.clear()>
	//*  16   32:iload_3         
	//*  17   33:ifeq            114
	//*  18   36:iload           5
	//*  19   38:iconst_1        
	//*  20   39:isub            
	//*  21   40:istore_2        
	//*  22   41:iload_2         
	//*  23   42:iflt            186
	//*  24   45:aload_0         
	//*  25   46:iload_2         
	//*  26   47:invokevirtual   #362 <Method View getChildAt(int)>
	//*  27   50:astore          6
	//*  28   52:aload           6
	//*  29   54:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  30   57:checkcast       #15  <Class Toolbar$LayoutParams>
	//*  31   60:astore          7
	//*  32   62:aload           7
	//*  33   64:getfield        #371 <Field int Toolbar$LayoutParams.mViewType>
	//*  34   67:ifne            102
	//*  35   70:aload_0         
	//*  36   71:aload           6
	//*  37   73:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  38   76:ifeq            102
	//*  39   79:aload_0         
	//*  40   80:aload           7
	//*  41   82:getfield        #378 <Field int Toolbar$LayoutParams.gravity>
	//*  42   85:invokespecial   #382 <Method int getChildHorizontalGravity(int)>
	//*  43   88:iload           4
	//*  44   90:icmpne          102
	//*  45   93:aload_1         
	//*  46   94:aload           6
	//*  47   96:invokeinterface #386 <Method boolean List.add(Object)>
	//*  48  101:pop             
	//*  49  102:iload_2         
	//*  50  103:iconst_1        
	//*  51  104:isub            
	//*  52  105:istore_2        
	//*  53  106:goto            41
			flag = false;
	//   54  109:iconst_0        
	//   55  110:istore_3        
		k = getChildCount();
		j = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(((View) (this))));
		list.clear();
		if(flag)
			for(i = k - 1; i >= 0; i--)
			{
				View view = getChildAt(i);
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
				if(layoutparams.mViewType == 0 && shouldLayout(view) && getChildHorizontalGravity(layoutparams.gravity) == j)
					list.add(((Object) (view)));
			}

		else
	//*  56  111:goto            10
			for(i = 0; i < k; i++)
	//*  57  114:iconst_0        
	//*  58  115:istore_2        
	//*  59  116:iload_2         
	//*  60  117:iload           5
	//*  61  119:icmpge          186
			{
				View view1 = getChildAt(i);
	//   62  122:aload_0         
	//   63  123:iload_2         
	//   64  124:invokevirtual   #362 <Method View getChildAt(int)>
	//   65  127:astore          6
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//   66  129:aload           6
	//   67  131:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   68  134:checkcast       #15  <Class Toolbar$LayoutParams>
	//   69  137:astore          7
				if(layoutparams1.mViewType == 0 && shouldLayout(view1) && getChildHorizontalGravity(layoutparams1.gravity) == j)
	//*  70  139:aload           7
	//*  71  141:getfield        #371 <Field int Toolbar$LayoutParams.mViewType>
	//*  72  144:ifne            179
	//*  73  147:aload_0         
	//*  74  148:aload           6
	//*  75  150:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  76  153:ifeq            179
	//*  77  156:aload_0         
	//*  78  157:aload           7
	//*  79  159:getfield        #378 <Field int Toolbar$LayoutParams.gravity>
	//*  80  162:invokespecial   #382 <Method int getChildHorizontalGravity(int)>
	//*  81  165:iload           4
	//*  82  167:icmpne          179
					list.add(((Object) (view1)));
	//   83  170:aload_1         
	//   84  171:aload           6
	//   85  173:invokeinterface #386 <Method boolean List.add(Object)>
	//   86  178:pop             
			}

	//   87  179:iload_2         
	//   88  180:iconst_1        
	//   89  181:iadd            
	//   90  182:istore_2        
	//*  91  183:goto            116
	//   92  186:return          
	}

	private void addSystemView(View view, boolean flag)
	{
		Object obj = ((Object) (view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       45
			obj = ((Object) (generateDefaultLayoutParams()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #394 <Method Toolbar$LayoutParams generateDefaultLayoutParams()>
	//    7   13:astore_3        
		else
	//*   8   14:aload_3         
	//*   9   15:iconst_1        
	//*  10   16:putfield        #371 <Field int Toolbar$LayoutParams.mViewType>
	//*  11   19:iload_2         
	//*  12   20:ifeq            70
	//*  13   23:aload_0         
	//*  14   24:getfield        #396 <Field View mExpandedActionView>
	//*  15   27:ifnull          70
	//*  16   30:aload_1         
	//*  17   31:aload_3         
	//*  18   32:invokevirtual   #400 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  19   35:aload_0         
	//*  20   36:getfield        #120 <Field ArrayList mHiddenViews>
	//*  21   39:aload_1         
	//*  22   40:invokevirtual   #401 <Method boolean ArrayList.add(Object)>
	//*  23   43:pop             
	//*  24   44:return          
		if(!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
	//*  25   45:aload_0         
	//*  26   46:aload_3         
	//*  27   47:invokevirtual   #405 <Method boolean checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  28   50:ifne            62
			obj = ((Object) (generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)))));
	//   29   53:aload_0         
	//   30   54:aload_3         
	//   31   55:invokevirtual   #409 <Method Toolbar$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   32   58:astore_3        
		else
	//*  33   59:goto            14
			obj = ((Object) ((LayoutParams)obj));
	//   34   62:aload_3         
	//   35   63:checkcast       #15  <Class Toolbar$LayoutParams>
	//   36   66:astore_3        
		obj.mViewType = 1;
		if(flag && mExpandedActionView != null)
		{
			view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
			mHiddenViews.add(((Object) (view)));
			return;
		} else
	//*  37   67:goto            14
		{
			addView(view, ((android.view.ViewGroup.LayoutParams) (obj)));
	//   38   70:aload_0         
	//   39   71:aload_1         
	//   40   72:aload_3         
	//   41   73:invokevirtual   #413 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
			return;
	//   42   76:return          
		}
	}

	private void ensureContentInsets()
	{
		if(mContentInsets == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #228 <Field RtlSpacingHelper mContentInsets>
	//*   2    4:ifnonnull       18
			mContentInsets = new RtlSpacingHelper();
	//    3    7:aload_0         
	//    4    8:new             #230 <Class RtlSpacingHelper>
	//    5   11:dup             
	//    6   12:invokespecial   #414 <Method void RtlSpacingHelper()>
	//    7   15:putfield        #228 <Field RtlSpacingHelper mContentInsets>
	//    8   18:return          
	}

	private void ensureLogoView()
	{
		if(mLogoView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #417 <Field ImageView mLogoView>
	//*   2    4:ifnonnull       22
			mLogoView = ((ImageView) (new AppCompatImageView(getContext())));
	//    3    7:aload_0         
	//    4    8:new             #419 <Class AppCompatImageView>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #134 <Method Context getContext()>
	//    8   16:invokespecial   #421 <Method void AppCompatImageView(Context)>
	//    9   19:putfield        #417 <Field ImageView mLogoView>
	//   10   22:return          
	}

	private void ensureMenu()
	{
		ensureMenuView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #425 <Method void ensureMenuView()>
		if(mMenuView.peekMenu() == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #427 <Field ActionMenuView mMenuView>
	//*   4    8:invokevirtual   #433 <Method MenuBuilder ActionMenuView.peekMenu()>
	//*   5   11:ifnonnull       64
		{
			MenuBuilder menubuilder = (MenuBuilder)mMenuView.getMenu();
	//    6   14:aload_0         
	//    7   15:getfield        #427 <Field ActionMenuView mMenuView>
	//    8   18:invokevirtual   #437 <Method Menu ActionMenuView.getMenu()>
	//    9   21:checkcast       #439 <Class MenuBuilder>
	//   10   24:astore_1        
			if(mExpandedMenuPresenter == null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//*  13   29:ifnonnull       44
				mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
	//   14   32:aload_0         
	//   15   33:new             #12  <Class Toolbar$ExpandedActionViewMenuPresenter>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:invokespecial   #442 <Method void Toolbar$ExpandedActionViewMenuPresenter(Toolbar)>
	//   19   41:putfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
			mMenuView.setExpandedActionViewsExclusive(true);
	//   20   44:aload_0         
	//   21   45:getfield        #427 <Field ActionMenuView mMenuView>
	//   22   48:iconst_1        
	//   23   49:invokevirtual   #446 <Method void ActionMenuView.setExpandedActionViewsExclusive(boolean)>
			menubuilder.addMenuPresenter(((MenuPresenter) (mExpandedMenuPresenter)), mPopupContext);
	//   24   52:aload_1         
	//   25   53:aload_0         
	//   26   54:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   27   57:aload_0         
	//   28   58:getfield        #286 <Field Context mPopupContext>
	//   29   61:invokevirtual   #450 <Method void MenuBuilder.addMenuPresenter(MenuPresenter, Context)>
		}
	//   30   64:return          
	}

	private void ensureMenuView()
	{
		if(mMenuView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #427 <Field ActionMenuView mMenuView>
	//*   2    4:ifnonnull       96
		{
			mMenuView = new ActionMenuView(getContext());
	//    3    7:aload_0         
	//    4    8:new             #429 <Class ActionMenuView>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #134 <Method Context getContext()>
	//    8   16:invokespecial   #451 <Method void ActionMenuView(Context)>
	//    9   19:putfield        #427 <Field ActionMenuView mMenuView>
			mMenuView.setPopupTheme(mPopupTheme);
	//   10   22:aload_0         
	//   11   23:getfield        #427 <Field ActionMenuView mMenuView>
	//   12   26:aload_0         
	//   13   27:getfield        #453 <Field int mPopupTheme>
	//   14   30:invokevirtual   #454 <Method void ActionMenuView.setPopupTheme(int)>
			mMenuView.setOnMenuItemClickListener(mMenuViewItemClickListener);
	//   15   33:aload_0         
	//   16   34:getfield        #427 <Field ActionMenuView mMenuView>
	//   17   37:aload_0         
	//   18   38:getfield        #127 <Field ActionMenuView$OnMenuItemClickListener mMenuViewItemClickListener>
	//   19   41:invokevirtual   #458 <Method void ActionMenuView.setOnMenuItemClickListener(ActionMenuView$OnMenuItemClickListener)>
			mMenuView.setMenuCallbacks(mActionMenuPresenterCallback, mMenuBuilderCallback);
	//   20   44:aload_0         
	//   21   45:getfield        #427 <Field ActionMenuView mMenuView>
	//   22   48:aload_0         
	//   23   49:getfield        #460 <Field android.support.v7.view.menu.MenuPresenter$Callback mActionMenuPresenterCallback>
	//   24   52:aload_0         
	//   25   53:getfield        #462 <Field android.support.v7.view.menu.MenuBuilder$Callback mMenuBuilderCallback>
	//   26   56:invokevirtual   #466 <Method void ActionMenuView.setMenuCallbacks(android.support.v7.view.menu.MenuPresenter$Callback, android.support.v7.view.menu.MenuBuilder$Callback)>
			LayoutParams layoutparams = generateDefaultLayoutParams();
	//   27   59:aload_0         
	//   28   60:invokevirtual   #394 <Method Toolbar$LayoutParams generateDefaultLayoutParams()>
	//   29   63:astore_1        
			layoutparams.gravity = 0x800005 | mButtonGravity & 0x70;
	//   30   64:aload_1         
	//   31   65:ldc2            #467 <Int 0x800005>
	//   32   68:aload_0         
	//   33   69:getfield        #169 <Field int mButtonGravity>
	//   34   72:bipush          112
	//   35   74:iand            
	//   36   75:ior             
	//   37   76:putfield        #378 <Field int Toolbar$LayoutParams.gravity>
			mMenuView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   38   79:aload_0         
	//   39   80:getfield        #427 <Field ActionMenuView mMenuView>
	//   40   83:aload_1         
	//   41   84:invokevirtual   #468 <Method void ActionMenuView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			addSystemView(((View) (mMenuView)), false);
	//   42   87:aload_0         
	//   43   88:aload_0         
	//   44   89:getfield        #427 <Field ActionMenuView mMenuView>
	//   45   92:iconst_0        
	//   46   93:invokespecial   #470 <Method void addSystemView(View, boolean)>
		}
	//   47   96:return          
	}

	private void ensureNavButtonView()
	{
		if(mNavButtonView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #473 <Field ImageButton mNavButtonView>
	//*   2    4:ifnonnull       54
		{
			mNavButtonView = ((ImageButton) (new AppCompatImageButton(getContext(), ((AttributeSet) (null)), android.support.v7.appcompat.R.attr.toolbarNavigationButtonStyle)));
	//    3    7:aload_0         
	//    4    8:new             #475 <Class AppCompatImageButton>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #134 <Method Context getContext()>
	//    8   16:aconst_null     
	//    9   17:getstatic       #478 <Field int android.support.v7.appcompat.R$attr.toolbarNavigationButtonStyle>
	//   10   20:invokespecial   #479 <Method void AppCompatImageButton(Context, AttributeSet, int)>
	//   11   23:putfield        #473 <Field ImageButton mNavButtonView>
			LayoutParams layoutparams = generateDefaultLayoutParams();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #394 <Method Toolbar$LayoutParams generateDefaultLayoutParams()>
	//   14   30:astore_1        
			layoutparams.gravity = 0x800003 | mButtonGravity & 0x70;
	//   15   31:aload_1         
	//   16   32:ldc2            #480 <Int 0x800003>
	//   17   35:aload_0         
	//   18   36:getfield        #169 <Field int mButtonGravity>
	//   19   39:bipush          112
	//   20   41:iand            
	//   21   42:ior             
	//   22   43:putfield        #378 <Field int Toolbar$LayoutParams.gravity>
			mNavButtonView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   23   46:aload_0         
	//   24   47:getfield        #473 <Field ImageButton mNavButtonView>
	//   25   50:aload_1         
	//   26   51:invokevirtual   #483 <Method void ImageButton.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		}
	//   27   54:return          
	}

	private int getChildHorizontalGravity(int i)
	{
		int k = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_3        
		int j = GravityCompat.getAbsoluteGravity(i, k) & 7;
	//    3    5:iload_1         
	//    4    6:iload_3         
	//    5    7:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    6   10:bipush          7
	//    7   12:iand            
	//    8   13:istore_2        
		i = j;
	//    9   14:iload_2         
	//   10   15:istore_1        
		switch(j)
	//*  11   16:iload_2         
		{
	//*  12   17:tableswitch     1 5: default 52
	//	               1 59
	//	               2 52
	//	               3 59
	//	               4 52
	//	               5 59
		case 2: // '\002'
		case 4: // '\004'
		default:
			if(k == 1)
	//*  13   52:iload_3         
	//*  14   53:iconst_1        
	//*  15   54:icmpne          61
				i = 5;
	//   16   57:iconst_5        
	//   17   58:istore_1        
			else
	//*  18   59:iload_1         
	//*  19   60:ireturn         
				i = 3;
	//   20   61:iconst_3        
	//   21   62:istore_1        
			break;

		case 1: // '\001'
		case 3: // '\003'
		case 5: // '\005'
			break;
		}
		return i;
	//*  22   63:goto            59
	}

	private int getChildTop(View view, int i)
	{
		int j;
		int k;
		int l;
		int i1;
		LayoutParams layoutparams;
		layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #15  <Class Toolbar$LayoutParams>
	//    3    7:astore          7
		k = view.getMeasuredHeight();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #488 <Method int View.getMeasuredHeight()>
	//    6   13:istore          4
		if(i > 0)
	//*   7   15:iload_2         
	//*   8   16:ifle            110
			i = (k - i) / 2;
	//    9   19:iload           4
	//   10   21:iload_2         
	//   11   22:isub            
	//   12   23:iconst_2        
	//   13   24:idiv            
	//   14   25:istore_2        
		else
	//*  15   26:aload_0         
	//*  16   27:aload           7
	//*  17   29:getfield        #378 <Field int Toolbar$LayoutParams.gravity>
	//*  18   32:invokespecial   #491 <Method int getChildVerticalGravity(int)>
	//*  19   35:lookupswitch    2: default 60
	//	               48: 115
	//	               80: 122
	//*  20   60:aload_0         
	//*  21   61:invokevirtual   #494 <Method int getPaddingTop()>
	//*  22   64:istore          5
	//*  23   66:aload_0         
	//*  24   67:invokevirtual   #497 <Method int getPaddingBottom()>
	//*  25   70:istore_2        
	//*  26   71:aload_0         
	//*  27   72:invokevirtual   #500 <Method int getHeight()>
	//*  28   75:istore          6
	//*  29   77:iload           6
	//*  30   79:iload           5
	//*  31   81:isub            
	//*  32   82:iload_2         
	//*  33   83:isub            
	//*  34   84:iload           4
	//*  35   86:isub            
	//*  36   87:iconst_2        
	//*  37   88:idiv            
	//*  38   89:istore_3        
	//*  39   90:iload_3         
	//*  40   91:aload           7
	//*  41   93:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//*  42   96:icmpge          143
	//*  43   99:aload           7
	//*  44  101:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//*  45  104:istore_2        
	//*  46  105:iload           5
	//*  47  107:iload_2         
	//*  48  108:iadd            
	//*  49  109:ireturn         
			i = 0;
	//   50  110:iconst_0        
	//   51  111:istore_2        
		getChildVerticalGravity(layoutparams.gravity);
		JVM INSTR lookupswitch 2: default 60
	//	               48: 115
	//	               80: 122;
		   goto _L1 _L2 _L3
_L1:
		l = getPaddingTop();
		i = getPaddingBottom();
		i1 = getHeight();
		j = (i1 - l - i - k) / 2;
		if(j >= layoutparams.topMargin) goto _L5; else goto _L4
_L4:
		i = layoutparams.topMargin;
_L7:
		return l + i;
	//*  52  112:goto            26
_L2:
		return getPaddingTop() - i;
	//   53  115:aload_0         
	//   54  116:invokevirtual   #494 <Method int getPaddingTop()>
	//   55  119:iload_2         
	//   56  120:isub            
	//   57  121:ireturn         
_L3:
		return getHeight() - getPaddingBottom() - k - layoutparams.bottomMargin - i;
	//   58  122:aload_0         
	//   59  123:invokevirtual   #500 <Method int getHeight()>
	//   60  126:aload_0         
	//   61  127:invokevirtual   #497 <Method int getPaddingBottom()>
	//   62  130:isub            
	//   63  131:iload           4
	//   64  133:isub            
	//   65  134:aload           7
	//   66  136:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//   67  139:isub            
	//   68  140:iload_2         
	//   69  141:isub            
	//   70  142:ireturn         
_L5:
		k = i1 - i - k - j - l;
	//   71  143:iload           6
	//   72  145:iload_2         
	//   73  146:isub            
	//   74  147:iload           4
	//   75  149:isub            
	//   76  150:iload_3         
	//   77  151:isub            
	//   78  152:iload           5
	//   79  154:isub            
	//   80  155:istore          4
		i = j;
	//   81  157:iload_3         
	//   82  158:istore_2        
		if(k < layoutparams.bottomMargin)
	//*  83  159:iload           4
	//*  84  161:aload           7
	//*  85  163:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//*  86  166:icmpge          105
			i = Math.max(0, j - (layoutparams.bottomMargin - k));
	//   87  169:iconst_0        
	//   88  170:iload_3         
	//   89  171:aload           7
	//   90  173:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//   91  176:iload           4
	//   92  178:isub            
	//   93  179:isub            
	//   94  180:invokestatic    #511 <Method int Math.max(int, int)>
	//   95  183:istore_2        
		if(true) goto _L7; else goto _L6
	//   96  184:goto            105
_L6:
	}

	private int getChildVerticalGravity(int i)
	{
		int j = i & 0x70;
	//    0    0:iload_1         
	//    1    1:bipush          112
	//    2    3:iand            
	//    3    4:istore_2        
		i = j;
	//    4    5:iload_2         
	//    5    6:istore_1        
		switch(j)
	//*   6    7:iload_2         
		{
	//*   7    8:lookupswitch    3: default 44
	//	               16: 52
	//	               48: 52
	//	               80: 52
		default:
			i = mGravity & 0x70;
	//    8   44:aload_0         
	//    9   45:getfield        #111 <Field int mGravity>
	//   10   48:bipush          112
	//   11   50:iand            
	//   12   51:istore_1        
			// fall through

		case 16: // '\020'
		case 48: // '0'
		case 80: // 'P'
			return i;
	//   13   52:iload_1         
	//   14   53:ireturn         
		}
	}

	private int getHorizontalMargins(View view)
	{
		view = ((View) ((android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #514 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore_1        
		return MarginLayoutParamsCompat.getMarginStart(((android.view.ViewGroup.MarginLayoutParams) (view))) + MarginLayoutParamsCompat.getMarginEnd(((android.view.ViewGroup.MarginLayoutParams) (view)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #520 <Method int MarginLayoutParamsCompat.getMarginStart(android.view.ViewGroup$MarginLayoutParams)>
	//    6   12:aload_1         
	//    7   13:invokestatic    #523 <Method int MarginLayoutParamsCompat.getMarginEnd(android.view.ViewGroup$MarginLayoutParams)>
	//    8   16:iadd            
	//    9   17:ireturn         
	}

	private MenuInflater getMenuInflater()
	{
		return ((MenuInflater) (new SupportMenuInflater(getContext())));
	//    0    0:new             #527 <Class SupportMenuInflater>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #134 <Method Context getContext()>
	//    4    8:invokespecial   #528 <Method void SupportMenuInflater(Context)>
	//    5   11:areturn         
	}

	private int getVerticalMargins(View view)
	{
		view = ((View) ((android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #514 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore_1        
		return ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin + ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin;
	//    4    8:aload_1         
	//    5    9:getfield        #530 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//    6   12:aload_1         
	//    7   13:getfield        #531 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//    8   16:iadd            
	//    9   17:ireturn         
	}

	private int getViewListMeasuredWidth(List list, int ai[])
	{
		int l = ai[0];
	//    0    0:aload_2         
	//    1    1:iconst_0        
	//    2    2:iaload          
	//    3    3:istore          6
		int k = ai[1];
	//    4    5:aload_2         
	//    5    6:iconst_1        
	//    6    7:iaload          
	//    7    8:istore          5
		int j = 0;
	//    8   10:iconst_0        
	//    9   11:istore          4
		int i1 = list.size();
	//   10   13:aload_1         
	//   11   14:invokeinterface #536 <Method int List.size()>
	//   12   19:istore          7
		for(int i = 0; i < i1; i++)
	//*  13   21:iconst_0        
	//*  14   22:istore_3        
	//*  15   23:iload_3         
	//*  16   24:iload           7
	//*  17   26:icmpge          125
		{
			ai = ((int []) ((View)list.get(i)));
	//   18   29:aload_1         
	//   19   30:iload_3         
	//   20   31:invokeinterface #540 <Method Object List.get(int)>
	//   21   36:checkcast       #364 <Class View>
	//   22   39:astore_2        
			LayoutParams layoutparams = (LayoutParams)((View) (ai)).getLayoutParams();
	//   23   40:aload_2         
	//   24   41:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   44:checkcast       #15  <Class Toolbar$LayoutParams>
	//   26   47:astore          10
			l = layoutparams.leftMargin - l;
	//   27   49:aload           10
	//   28   51:getfield        #543 <Field int Toolbar$LayoutParams.leftMargin>
	//   29   54:iload           6
	//   30   56:isub            
	//   31   57:istore          6
			k = layoutparams.rightMargin - k;
	//   32   59:aload           10
	//   33   61:getfield        #546 <Field int Toolbar$LayoutParams.rightMargin>
	//   34   64:iload           5
	//   35   66:isub            
	//   36   67:istore          5
			int j1 = Math.max(0, l);
	//   37   69:iconst_0        
	//   38   70:iload           6
	//   39   72:invokestatic    #511 <Method int Math.max(int, int)>
	//   40   75:istore          8
			int k1 = Math.max(0, k);
	//   41   77:iconst_0        
	//   42   78:iload           5
	//   43   80:invokestatic    #511 <Method int Math.max(int, int)>
	//   44   83:istore          9
			l = Math.max(0, -l);
	//   45   85:iconst_0        
	//   46   86:iload           6
	//   47   88:ineg            
	//   48   89:invokestatic    #511 <Method int Math.max(int, int)>
	//   49   92:istore          6
			k = Math.max(0, -k);
	//   50   94:iconst_0        
	//   51   95:iload           5
	//   52   97:ineg            
	//   53   98:invokestatic    #511 <Method int Math.max(int, int)>
	//   54  101:istore          5
			j += ((View) (ai)).getMeasuredWidth() + j1 + k1;
	//   55  103:iload           4
	//   56  105:aload_2         
	//   57  106:invokevirtual   #549 <Method int View.getMeasuredWidth()>
	//   58  109:iload           8
	//   59  111:iadd            
	//   60  112:iload           9
	//   61  114:iadd            
	//   62  115:iadd            
	//   63  116:istore          4
		}

	//   64  118:iload_3         
	//   65  119:iconst_1        
	//   66  120:iadd            
	//   67  121:istore_3        
	//*  68  122:goto            23
		return j;
	//   69  125:iload           4
	//   70  127:ireturn         
	}

	private boolean isChildOrHidden(View view)
	{
		return view.getParent() == this || mHiddenViews.contains(((Object) (view)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #555 <Method android.view.ViewParent View.getParent()>
	//    2    4:aload_0         
	//    3    5:if_acmpeq       19
	//    4    8:aload_0         
	//    5    9:getfield        #120 <Field ArrayList mHiddenViews>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #558 <Method boolean ArrayList.contains(Object)>
	//    8   16:ifeq            21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	private static boolean isCustomView(View view)
	{
		return ((LayoutParams)view.getLayoutParams()).mViewType == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #15  <Class Toolbar$LayoutParams>
	//    3    7:getfield        #371 <Field int Toolbar$LayoutParams.mViewType>
	//    4   10:ifne            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	private int layoutChildLeft(View view, int i, int ai[], int j)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #15  <Class Toolbar$LayoutParams>
	//    3    7:astore          6
		int k = layoutparams.leftMargin - ai[0];
	//    4    9:aload           6
	//    5   11:getfield        #543 <Field int Toolbar$LayoutParams.leftMargin>
	//    6   14:aload_3         
	//    7   15:iconst_0        
	//    8   16:iaload          
	//    9   17:isub            
	//   10   18:istore          5
		i += Math.max(0, k);
	//   11   20:iload_2         
	//   12   21:iconst_0        
	//   13   22:iload           5
	//   14   24:invokestatic    #511 <Method int Math.max(int, int)>
	//   15   27:iadd            
	//   16   28:istore_2        
		ai[0] = Math.max(0, -k);
	//   17   29:aload_3         
	//   18   30:iconst_0        
	//   19   31:iconst_0        
	//   20   32:iload           5
	//   21   34:ineg            
	//   22   35:invokestatic    #511 <Method int Math.max(int, int)>
	//   23   38:iastore         
		j = getChildTop(view, j);
	//   24   39:aload_0         
	//   25   40:aload_1         
	//   26   41:iload           4
	//   27   43:invokespecial   #563 <Method int getChildTop(View, int)>
	//   28   46:istore          4
		k = view.getMeasuredWidth();
	//   29   48:aload_1         
	//   30   49:invokevirtual   #549 <Method int View.getMeasuredWidth()>
	//   31   52:istore          5
		view.layout(i, j, i + k, view.getMeasuredHeight() + j);
	//   32   54:aload_1         
	//   33   55:iload_2         
	//   34   56:iload           4
	//   35   58:iload_2         
	//   36   59:iload           5
	//   37   61:iadd            
	//   38   62:aload_1         
	//   39   63:invokevirtual   #488 <Method int View.getMeasuredHeight()>
	//   40   66:iload           4
	//   41   68:iadd            
	//   42   69:invokevirtual   #567 <Method void View.layout(int, int, int, int)>
		return i + (layoutparams.rightMargin + k);
	//   43   72:iload_2         
	//   44   73:aload           6
	//   45   75:getfield        #546 <Field int Toolbar$LayoutParams.rightMargin>
	//   46   78:iload           5
	//   47   80:iadd            
	//   48   81:iadd            
	//   49   82:ireturn         
	}

	private int layoutChildRight(View view, int i, int ai[], int j)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #15  <Class Toolbar$LayoutParams>
	//    3    7:astore          6
		int k = layoutparams.rightMargin - ai[1];
	//    4    9:aload           6
	//    5   11:getfield        #546 <Field int Toolbar$LayoutParams.rightMargin>
	//    6   14:aload_3         
	//    7   15:iconst_1        
	//    8   16:iaload          
	//    9   17:isub            
	//   10   18:istore          5
		i -= Math.max(0, k);
	//   11   20:iload_2         
	//   12   21:iconst_0        
	//   13   22:iload           5
	//   14   24:invokestatic    #511 <Method int Math.max(int, int)>
	//   15   27:isub            
	//   16   28:istore_2        
		ai[1] = Math.max(0, -k);
	//   17   29:aload_3         
	//   18   30:iconst_1        
	//   19   31:iconst_0        
	//   20   32:iload           5
	//   21   34:ineg            
	//   22   35:invokestatic    #511 <Method int Math.max(int, int)>
	//   23   38:iastore         
		j = getChildTop(view, j);
	//   24   39:aload_0         
	//   25   40:aload_1         
	//   26   41:iload           4
	//   27   43:invokespecial   #563 <Method int getChildTop(View, int)>
	//   28   46:istore          4
		k = view.getMeasuredWidth();
	//   29   48:aload_1         
	//   30   49:invokevirtual   #549 <Method int View.getMeasuredWidth()>
	//   31   52:istore          5
		view.layout(i - k, j, i, view.getMeasuredHeight() + j);
	//   32   54:aload_1         
	//   33   55:iload_2         
	//   34   56:iload           5
	//   35   58:isub            
	//   36   59:iload           4
	//   37   61:iload_2         
	//   38   62:aload_1         
	//   39   63:invokevirtual   #488 <Method int View.getMeasuredHeight()>
	//   40   66:iload           4
	//   41   68:iadd            
	//   42   69:invokevirtual   #567 <Method void View.layout(int, int, int, int)>
		return i - (layoutparams.leftMargin + k);
	//   43   72:iload_2         
	//   44   73:aload           6
	//   45   75:getfield        #543 <Field int Toolbar$LayoutParams.leftMargin>
	//   46   78:iload           5
	//   47   80:iadd            
	//   48   81:isub            
	//   49   82:ireturn         
	}

	private int measureChildCollapseMargins(View view, int i, int j, int k, int l, int ai[])
	{
		android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #514 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore          10
		int i1 = marginlayoutparams.leftMargin - ai[0];
	//    4    9:aload           10
	//    5   11:getfield        #571 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//    6   14:aload           6
	//    7   16:iconst_0        
	//    8   17:iaload          
	//    9   18:isub            
	//   10   19:istore          7
		int j1 = marginlayoutparams.rightMargin - ai[1];
	//   11   21:aload           10
	//   12   23:getfield        #572 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   13   26:aload           6
	//   14   28:iconst_1        
	//   15   29:iaload          
	//   16   30:isub            
	//   17   31:istore          8
		int k1 = Math.max(0, i1) + Math.max(0, j1);
	//   18   33:iconst_0        
	//   19   34:iload           7
	//   20   36:invokestatic    #511 <Method int Math.max(int, int)>
	//   21   39:iconst_0        
	//   22   40:iload           8
	//   23   42:invokestatic    #511 <Method int Math.max(int, int)>
	//   24   45:iadd            
	//   25   46:istore          9
		ai[0] = Math.max(0, -i1);
	//   26   48:aload           6
	//   27   50:iconst_0        
	//   28   51:iconst_0        
	//   29   52:iload           7
	//   30   54:ineg            
	//   31   55:invokestatic    #511 <Method int Math.max(int, int)>
	//   32   58:iastore         
		ai[1] = Math.max(0, -j1);
	//   33   59:aload           6
	//   34   61:iconst_1        
	//   35   62:iconst_0        
	//   36   63:iload           8
	//   37   65:ineg            
	//   38   66:invokestatic    #511 <Method int Math.max(int, int)>
	//   39   69:iastore         
		view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + k1 + j, marginlayoutparams.width), getChildMeasureSpec(k, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + l, marginlayoutparams.height));
	//   40   70:aload_1         
	//   41   71:iload_2         
	//   42   72:aload_0         
	//   43   73:invokevirtual   #575 <Method int getPaddingLeft()>
	//   44   76:aload_0         
	//   45   77:invokevirtual   #578 <Method int getPaddingRight()>
	//   46   80:iadd            
	//   47   81:iload           9
	//   48   83:iadd            
	//   49   84:iload_3         
	//   50   85:iadd            
	//   51   86:aload           10
	//   52   88:getfield        #581 <Field int android.view.ViewGroup$MarginLayoutParams.width>
	//   53   91:invokestatic    #585 <Method int getChildMeasureSpec(int, int, int)>
	//   54   94:iload           4
	//   55   96:aload_0         
	//   56   97:invokevirtual   #494 <Method int getPaddingTop()>
	//   57  100:aload_0         
	//   58  101:invokevirtual   #497 <Method int getPaddingBottom()>
	//   59  104:iadd            
	//   60  105:aload           10
	//   61  107:getfield        #530 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//   62  110:iadd            
	//   63  111:aload           10
	//   64  113:getfield        #531 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   65  116:iadd            
	//   66  117:iload           5
	//   67  119:iadd            
	//   68  120:aload           10
	//   69  122:getfield        #588 <Field int android.view.ViewGroup$MarginLayoutParams.height>
	//   70  125:invokestatic    #585 <Method int getChildMeasureSpec(int, int, int)>
	//   71  128:invokevirtual   #591 <Method void View.measure(int, int)>
		return view.getMeasuredWidth() + k1;
	//   72  131:aload_1         
	//   73  132:invokevirtual   #549 <Method int View.getMeasuredWidth()>
	//   74  135:iload           9
	//   75  137:iadd            
	//   76  138:ireturn         
	}

	private void measureChildConstrained(View view, int i, int j, int k, int l, int i1)
	{
		android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #514 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore          8
		int j1 = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j, marginlayoutparams.width);
	//    4    9:iload_2         
	//    5   10:aload_0         
	//    6   11:invokevirtual   #575 <Method int getPaddingLeft()>
	//    7   14:aload_0         
	//    8   15:invokevirtual   #578 <Method int getPaddingRight()>
	//    9   18:iadd            
	//   10   19:aload           8
	//   11   21:getfield        #571 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   12   24:iadd            
	//   13   25:aload           8
	//   14   27:getfield        #572 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   15   30:iadd            
	//   16   31:iload_3         
	//   17   32:iadd            
	//   18   33:aload           8
	//   19   35:getfield        #581 <Field int android.view.ViewGroup$MarginLayoutParams.width>
	//   20   38:invokestatic    #585 <Method int getChildMeasureSpec(int, int, int)>
	//   21   41:istore          7
		j = getChildMeasureSpec(k, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + l, marginlayoutparams.height);
	//   22   43:iload           4
	//   23   45:aload_0         
	//   24   46:invokevirtual   #494 <Method int getPaddingTop()>
	//   25   49:aload_0         
	//   26   50:invokevirtual   #497 <Method int getPaddingBottom()>
	//   27   53:iadd            
	//   28   54:aload           8
	//   29   56:getfield        #530 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//   30   59:iadd            
	//   31   60:aload           8
	//   32   62:getfield        #531 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   33   65:iadd            
	//   34   66:iload           5
	//   35   68:iadd            
	//   36   69:aload           8
	//   37   71:getfield        #588 <Field int android.view.ViewGroup$MarginLayoutParams.height>
	//   38   74:invokestatic    #585 <Method int getChildMeasureSpec(int, int, int)>
	//   39   77:istore_3        
		k = android.view.View.MeasureSpec.getMode(j);
	//   40   78:iload_3         
	//   41   79:invokestatic    #598 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   42   82:istore          4
		i = j;
	//   43   84:iload_3         
	//   44   85:istore_2        
		if(k != 0x40000000)
	//*  45   86:iload           4
	//*  46   88:ldc2            #599 <Int 0x40000000>
	//*  47   91:icmpeq          124
		{
			i = j;
	//   48   94:iload_3         
	//   49   95:istore_2        
			if(i1 >= 0)
	//*  50   96:iload           6
	//*  51   98:iflt            124
			{
				if(k != 0)
	//*  52  101:iload           4
	//*  53  103:ifeq            132
					i = Math.min(android.view.View.MeasureSpec.getSize(j), i1);
	//   54  106:iload_3         
	//   55  107:invokestatic    #602 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   56  110:iload           6
	//   57  112:invokestatic    #605 <Method int Math.min(int, int)>
	//   58  115:istore_2        
				else
	//*  59  116:iload_2         
	//*  60  117:ldc2            #599 <Int 0x40000000>
	//*  61  120:invokestatic    #608 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  62  123:istore_2        
	//*  63  124:aload_1         
	//*  64  125:iload           7
	//*  65  127:iload_2         
	//*  66  128:invokevirtual   #591 <Method void View.measure(int, int)>
	//*  67  131:return          
					i = i1;
	//   68  132:iload           6
	//   69  134:istore_2        
				i = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
			}
		}
		view.measure(j1, i);
	//*  70  135:goto            116
	}

	private void postShowOverflowMenu()
	{
		removeCallbacks(mShowOverflowMenuRunnable);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #130 <Field Runnable mShowOverflowMenuRunnable>
	//    3    5:invokevirtual   #613 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		post(mShowOverflowMenuRunnable);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #130 <Field Runnable mShowOverflowMenuRunnable>
	//    8   14:invokevirtual   #616 <Method boolean post(Runnable)>
	//    9   17:pop             
	//   10   18:return          
	}

	private boolean shouldCollapse()
	{
		if(mCollapsible) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #620 <Field boolean mCollapsible>
	//    2    4:ifne            9
_L1:
		return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
_L2:
		int j = getChildCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #348 <Method int getChildCount()>
	//    7   13:istore_2        
		int i = 0;
	//    8   14:iconst_0        
	//    9   15:istore_1        
label0:
		do
		{
label1:
			{
				if(i >= j)
					break label1;
	//   10   16:iload_1         
	//   11   17:iload_2         
	//   12   18:icmpge          56
				View view = getChildAt(i);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #362 <Method View getChildAt(int)>
	//   16   26:astore_3        
				if(shouldLayout(view) && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0)
					break label0;
	//   17   27:aload_0         
	//   18   28:aload_3         
	//   19   29:invokespecial   #375 <Method boolean shouldLayout(View)>
	//   20   32:ifeq            49
	//   21   35:aload_3         
	//   22   36:invokevirtual   #549 <Method int View.getMeasuredWidth()>
	//   23   39:ifle            49
	//   24   42:aload_3         
	//   25   43:invokevirtual   #488 <Method int View.getMeasuredHeight()>
	//   26   46:ifgt            7
				i++;
	//   27   49:iload_1         
	//   28   50:iconst_1        
	//   29   51:iadd            
	//   30   52:istore_1        
			}
		} while(true);
	//   31   53:goto            16
		if(true) goto _L1; else goto _L3
_L3:
		return true;
	//   32   56:iconst_1        
	//   33   57:ireturn         
	}

	private boolean shouldLayout(View view)
	{
		return view != null && view.getParent() == this && view.getVisibility() != 8;
	//    0    0:aload_1         
	//    1    1:ifnull          23
	//    2    4:aload_1         
	//    3    5:invokevirtual   #555 <Method android.view.ViewParent View.getParent()>
	//    4    8:aload_0         
	//    5    9:if_acmpne       23
	//    6   12:aload_1         
	//    7   13:invokevirtual   #623 <Method int View.getVisibility()>
	//    8   16:bipush          8
	//    9   18:icmpeq          23
	//   10   21:iconst_1        
	//   11   22:ireturn         
	//   12   23:iconst_0        
	//   13   24:ireturn         
	}

	void addChildrenForExpandedActionView()
	{
		for(int i = mHiddenViews.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field ArrayList mHiddenViews>
	//*   2    4:invokevirtual   #625 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            36
			addView((View)mHiddenViews.get(i));
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #120 <Field ArrayList mHiddenViews>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #626 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #364 <Class View>
	//   14   26:invokevirtual   #629 <Method void addView(View)>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:isub            
	//   18   32:istore_1        
	//*  19   33:goto            10
		mHiddenViews.clear();
	//   20   36:aload_0         
	//   21   37:getfield        #120 <Field ArrayList mHiddenViews>
	//   22   40:invokevirtual   #630 <Method void ArrayList.clear()>
	//   23   43:return          
	}

	public boolean canShowOverflowMenu()
	{
		return getVisibility() == 0 && mMenuView != null && mMenuView.isOverflowReserved();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #636 <Method int getVisibility()>
	//    2    4:ifne            26
	//    3    7:aload_0         
	//    4    8:getfield        #427 <Field ActionMenuView mMenuView>
	//    5   11:ifnull          26
	//    6   14:aload_0         
	//    7   15:getfield        #427 <Field ActionMenuView mMenuView>
	//    8   18:invokevirtual   #639 <Method boolean ActionMenuView.isOverflowReserved()>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return super.checkLayoutParams(layoutparams) && (layoutparams instanceof LayoutParams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #641 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:ifeq            17
	//    4    8:aload_1         
	//    5    9:instanceof      #15  <Class Toolbar$LayoutParams>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void collapseActionView()
	{
		MenuItemImpl menuitemimpl;
		if(mExpandedMenuPresenter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//*   2    4:ifnonnull       19
			menuitemimpl = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		else
	//*   5    9:aload_1         
	//*   6   10:ifnull          18
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #646 <Method boolean MenuItemImpl.collapseActionView()>
	//*   9   17:pop             
	//*  10   18:return          
			menuitemimpl = mExpandedMenuPresenter.mCurrentExpandedItem;
	//   11   19:aload_0         
	//   12   20:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   13   23:getfield        #650 <Field MenuItemImpl Toolbar$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
	//   14   26:astore_1        
		if(menuitemimpl != null)
			menuitemimpl.collapseActionView();
	//*  15   27:goto            9
	}

	public void dismissPopupMenus()
	{
		if(mMenuView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #427 <Field ActionMenuView mMenuView>
	//*   2    4:ifnull          14
			mMenuView.dismissPopupMenus();
	//    3    7:aload_0         
	//    4    8:getfield        #427 <Field ActionMenuView mMenuView>
	//    5   11:invokevirtual   #653 <Method void ActionMenuView.dismissPopupMenus()>
	//    6   14:return          
	}

	void ensureCollapseButtonView()
	{
		if(mCollapseButtonView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*   2    4:ifnonnull       96
		{
			mCollapseButtonView = ((ImageButton) (new AppCompatImageButton(getContext(), ((AttributeSet) (null)), android.support.v7.appcompat.R.attr.toolbarNavigationButtonStyle)));
	//    3    7:aload_0         
	//    4    8:new             #475 <Class AppCompatImageButton>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #134 <Method Context getContext()>
	//    8   16:aconst_null     
	//    9   17:getstatic       #478 <Field int android.support.v7.appcompat.R$attr.toolbarNavigationButtonStyle>
	//   10   20:invokespecial   #479 <Method void AppCompatImageButton(Context, AttributeSet, int)>
	//   11   23:putfield        #656 <Field ImageButton mCollapseButtonView>
			mCollapseButtonView.setImageDrawable(mCollapseIcon);
	//   12   26:aload_0         
	//   13   27:getfield        #656 <Field ImageButton mCollapseButtonView>
	//   14   30:aload_0         
	//   15   31:getfield        #256 <Field Drawable mCollapseIcon>
	//   16   34:invokevirtual   #659 <Method void ImageButton.setImageDrawable(Drawable)>
			mCollapseButtonView.setContentDescription(mCollapseDescription);
	//   17   37:aload_0         
	//   18   38:getfield        #656 <Field ImageButton mCollapseButtonView>
	//   19   41:aload_0         
	//   20   42:getfield        #265 <Field CharSequence mCollapseDescription>
	//   21   45:invokevirtual   #662 <Method void ImageButton.setContentDescription(CharSequence)>
			LayoutParams layoutparams = generateDefaultLayoutParams();
	//   22   48:aload_0         
	//   23   49:invokevirtual   #394 <Method Toolbar$LayoutParams generateDefaultLayoutParams()>
	//   24   52:astore_1        
			layoutparams.gravity = 0x800003 | mButtonGravity & 0x70;
	//   25   53:aload_1         
	//   26   54:ldc2            #480 <Int 0x800003>
	//   27   57:aload_0         
	//   28   58:getfield        #169 <Field int mButtonGravity>
	//   29   61:bipush          112
	//   30   63:iand            
	//   31   64:ior             
	//   32   65:putfield        #378 <Field int Toolbar$LayoutParams.gravity>
			layoutparams.mViewType = 2;
	//   33   68:aload_1         
	//   34   69:iconst_2        
	//   35   70:putfield        #371 <Field int Toolbar$LayoutParams.mViewType>
			mCollapseButtonView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   36   73:aload_0         
	//   37   74:getfield        #656 <Field ImageButton mCollapseButtonView>
	//   38   77:aload_1         
	//   39   78:invokevirtual   #483 <Method void ImageButton.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			mCollapseButtonView.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					collapseActionView();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Toolbar this$0>
				//    2    4:invokevirtual   #25  <Method void Toolbar.collapseActionView()>
				//    3    7:return          
				}

				final Toolbar this$0;

			
			{
				this$0 = Toolbar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Toolbar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   40   81:aload_0         
	//   41   82:getfield        #656 <Field ImageButton mCollapseButtonView>
	//   42   85:new             #10  <Class Toolbar$3>
	//   43   88:dup             
	//   44   89:aload_0         
	//   45   90:invokespecial   #663 <Method void Toolbar$3(Toolbar)>
	//   46   93:invokevirtual   #667 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		}
	//   47   96:return          
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		return new LayoutParams(-2, -2);
	//    0    0:new             #15  <Class Toolbar$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #669 <Method void Toolbar$LayoutParams(int, int)>
	//    5   11:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #394 <Method Toolbar$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #15  <Class Toolbar$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #134 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #671 <Method void Toolbar$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof LayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #15  <Class Toolbar$LayoutParams>
	//*   2    4:ifeq            19
			return new LayoutParams((LayoutParams)layoutparams);
	//    3    7:new             #15  <Class Toolbar$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #15  <Class Toolbar$LayoutParams>
	//    7   15:invokespecial   #674 <Method void Toolbar$LayoutParams(Toolbar$LayoutParams)>
	//    8   18:areturn         
		if(layoutparams instanceof android.support.v7.app.ActionBar.LayoutParams)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #676 <Class android.support.v7.app.ActionBar$LayoutParams>
	//*  11   23:ifeq            38
			return new LayoutParams((android.support.v7.app.ActionBar.LayoutParams)layoutparams);
	//   12   26:new             #15  <Class Toolbar$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #676 <Class android.support.v7.app.ActionBar$LayoutParams>
	//   16   34:invokespecial   #679 <Method void Toolbar$LayoutParams(android.support.v7.app.ActionBar$LayoutParams)>
	//   17   37:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*  18   38:aload_1         
	//*  19   39:instanceof      #514 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  20   42:ifeq            57
			return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
	//   21   45:new             #15  <Class Toolbar$LayoutParams>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:checkcast       #514 <Class android.view.ViewGroup$MarginLayoutParams>
	//   25   53:invokespecial   #682 <Method void Toolbar$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   26   56:areturn         
		else
			return new LayoutParams(layoutparams);
	//   27   57:new             #15  <Class Toolbar$LayoutParams>
	//   28   60:dup             
	//   29   61:aload_1         
	//   30   62:invokespecial   #684 <Method void Toolbar$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   31   65:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #687 <Method Toolbar$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #409 <Method Toolbar$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public int getContentInsetEnd()
	{
		if(mContentInsets != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #228 <Field RtlSpacingHelper mContentInsets>
	//*   2    4:ifnull          15
			return mContentInsets.getEnd();
	//    3    7:aload_0         
	//    4    8:getfield        #228 <Field RtlSpacingHelper mContentInsets>
	//    5   11:invokevirtual   #692 <Method int RtlSpacingHelper.getEnd()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getContentInsetEndWithActions()
	{
		if(mContentInsetEndWithActions != 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field int mContentInsetEndWithActions>
	//*   2    4:ldc1            #214 <Int 0x80000000>
	//*   3    6:icmpeq          14
			return mContentInsetEndWithActions;
	//    4    9:aload_0         
	//    5   10:getfield        #247 <Field int mContentInsetEndWithActions>
	//    6   13:ireturn         
		else
			return getContentInsetEnd();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #695 <Method int getContentInsetEnd()>
	//    9   18:ireturn         
	}

	public int getContentInsetLeft()
	{
		if(mContentInsets != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #228 <Field RtlSpacingHelper mContentInsets>
	//*   2    4:ifnull          15
			return mContentInsets.getLeft();
	//    3    7:aload_0         
	//    4    8:getfield        #228 <Field RtlSpacingHelper mContentInsets>
	//    5   11:invokevirtual   #699 <Method int RtlSpacingHelper.getLeft()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getContentInsetRight()
	{
		if(mContentInsets != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #228 <Field RtlSpacingHelper mContentInsets>
	//*   2    4:ifnull          15
			return mContentInsets.getRight();
	//    3    7:aload_0         
	//    4    8:getfield        #228 <Field RtlSpacingHelper mContentInsets>
	//    5   11:invokevirtual   #703 <Method int RtlSpacingHelper.getRight()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getContentInsetStart()
	{
		if(mContentInsets != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #228 <Field RtlSpacingHelper mContentInsets>
	//*   2    4:ifnull          15
			return mContentInsets.getStart();
	//    3    7:aload_0         
	//    4    8:getfield        #228 <Field RtlSpacingHelper mContentInsets>
	//    5   11:invokevirtual   #707 <Method int RtlSpacingHelper.getStart()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getContentInsetStartWithNavigation()
	{
		if(mContentInsetStartWithNavigation != 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #242 <Field int mContentInsetStartWithNavigation>
	//*   2    4:ldc1            #214 <Int 0x80000000>
	//*   3    6:icmpeq          14
			return mContentInsetStartWithNavigation;
	//    4    9:aload_0         
	//    5   10:getfield        #242 <Field int mContentInsetStartWithNavigation>
	//    6   13:ireturn         
		else
			return getContentInsetStart();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #710 <Method int getContentInsetStart()>
	//    9   18:ireturn         
	}

	public int getCurrentContentInsetEnd()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(mMenuView != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #427 <Field ActionMenuView mMenuView>
	//*   4    6:ifnull          30
		{
			MenuBuilder menubuilder = mMenuView.peekMenu();
	//    5    9:aload_0         
	//    6   10:getfield        #427 <Field ActionMenuView mMenuView>
	//    7   13:invokevirtual   #433 <Method MenuBuilder ActionMenuView.peekMenu()>
	//    8   16:astore_2        
			if(menubuilder != null && menubuilder.hasVisibleItems())
	//*   9   17:aload_2         
	//*  10   18:ifnull          50
	//*  11   21:aload_2         
	//*  12   22:invokevirtual   #714 <Method boolean MenuBuilder.hasVisibleItems()>
	//*  13   25:ifeq            50
				flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_1        
			else
	//*  16   30:iload_1         
	//*  17   31:ifeq            55
	//*  18   34:aload_0         
	//*  19   35:invokevirtual   #695 <Method int getContentInsetEnd()>
	//*  20   38:aload_0         
	//*  21   39:getfield        #247 <Field int mContentInsetEndWithActions>
	//*  22   42:iconst_0        
	//*  23   43:invokestatic    #511 <Method int Math.max(int, int)>
	//*  24   46:invokestatic    #511 <Method int Math.max(int, int)>
	//*  25   49:ireturn         
				flag = false;
	//   26   50:iconst_0        
	//   27   51:istore_1        
		}
		if(flag)
			return Math.max(getContentInsetEnd(), Math.max(mContentInsetEndWithActions, 0));
		else
	//*  28   52:goto            30
			return getContentInsetEnd();
	//   29   55:aload_0         
	//   30   56:invokevirtual   #695 <Method int getContentInsetEnd()>
	//   31   59:ireturn         
	}

	public int getCurrentContentInsetLeft()
	{
		if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			return getCurrentContentInsetEnd();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #717 <Method int getCurrentContentInsetEnd()>
	//    6   12:ireturn         
		else
			return getCurrentContentInsetStart();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #720 <Method int getCurrentContentInsetStart()>
	//    9   17:ireturn         
	}

	public int getCurrentContentInsetRight()
	{
		if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			return getCurrentContentInsetStart();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #720 <Method int getCurrentContentInsetStart()>
	//    6   12:ireturn         
		else
			return getCurrentContentInsetEnd();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #717 <Method int getCurrentContentInsetEnd()>
	//    9   17:ireturn         
	}

	public int getCurrentContentInsetStart()
	{
		if(getNavigationIcon() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #725 <Method Drawable getNavigationIcon()>
	//*   2    4:ifnull          23
			return Math.max(getContentInsetStart(), Math.max(mContentInsetStartWithNavigation, 0));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #710 <Method int getContentInsetStart()>
	//    5   11:aload_0         
	//    6   12:getfield        #242 <Field int mContentInsetStartWithNavigation>
	//    7   15:iconst_0        
	//    8   16:invokestatic    #511 <Method int Math.max(int, int)>
	//    9   19:invokestatic    #511 <Method int Math.max(int, int)>
	//   10   22:ireturn         
		else
			return getContentInsetStart();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #710 <Method int getContentInsetStart()>
	//   13   27:ireturn         
	}

	public Drawable getLogo()
	{
		if(mLogoView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #417 <Field ImageView mLogoView>
	//*   2    4:ifnull          15
			return mLogoView.getDrawable();
	//    3    7:aload_0         
	//    4    8:getfield        #417 <Field ImageView mLogoView>
	//    5   11:invokevirtual   #730 <Method Drawable ImageView.getDrawable()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public CharSequence getLogoDescription()
	{
		if(mLogoView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #417 <Field ImageView mLogoView>
	//*   2    4:ifnull          15
			return mLogoView.getContentDescription();
	//    3    7:aload_0         
	//    4    8:getfield        #417 <Field ImageView mLogoView>
	//    5   11:invokevirtual   #735 <Method CharSequence ImageView.getContentDescription()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public Menu getMenu()
	{
		ensureMenu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #737 <Method void ensureMenu()>
		return mMenuView.getMenu();
	//    2    4:aload_0         
	//    3    5:getfield        #427 <Field ActionMenuView mMenuView>
	//    4    8:invokevirtual   #437 <Method Menu ActionMenuView.getMenu()>
	//    5   11:areturn         
	}

	public CharSequence getNavigationContentDescription()
	{
		if(mNavButtonView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #473 <Field ImageButton mNavButtonView>
	//*   2    4:ifnull          15
			return mNavButtonView.getContentDescription();
	//    3    7:aload_0         
	//    4    8:getfield        #473 <Field ImageButton mNavButtonView>
	//    5   11:invokevirtual   #739 <Method CharSequence ImageButton.getContentDescription()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public Drawable getNavigationIcon()
	{
		if(mNavButtonView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #473 <Field ImageButton mNavButtonView>
	//*   2    4:ifnull          15
			return mNavButtonView.getDrawable();
	//    3    7:aload_0         
	//    4    8:getfield        #473 <Field ImageButton mNavButtonView>
	//    5   11:invokevirtual   #740 <Method Drawable ImageButton.getDrawable()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	ActionMenuPresenter getOuterActionMenuPresenter()
	{
		return mOuterActionMenuPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #744 <Field ActionMenuPresenter mOuterActionMenuPresenter>
	//    2    4:areturn         
	}

	public Drawable getOverflowIcon()
	{
		ensureMenu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #737 <Method void ensureMenu()>
		return mMenuView.getOverflowIcon();
	//    2    4:aload_0         
	//    3    5:getfield        #427 <Field ActionMenuView mMenuView>
	//    4    8:invokevirtual   #747 <Method Drawable ActionMenuView.getOverflowIcon()>
	//    5   11:areturn         
	}

	Context getPopupContext()
	{
		return mPopupContext;
	//    0    0:aload_0         
	//    1    1:getfield        #286 <Field Context mPopupContext>
	//    2    4:areturn         
	}

	public int getPopupTheme()
	{
		return mPopupTheme;
	//    0    0:aload_0         
	//    1    1:getfield        #453 <Field int mPopupTheme>
	//    2    4:ireturn         
	}

	public CharSequence getSubtitle()
	{
		return mSubtitleText;
	//    0    0:aload_0         
	//    1    1:getfield        #752 <Field CharSequence mSubtitleText>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		return mTitleText;
	//    0    0:aload_0         
	//    1    1:getfield        #755 <Field CharSequence mTitleText>
	//    2    4:areturn         
	}

	public int getTitleMarginBottom()
	{
		return mTitleMarginBottom;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field int mTitleMarginBottom>
	//    2    4:ireturn         
	}

	public int getTitleMarginEnd()
	{
		return mTitleMarginEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field int mTitleMarginEnd>
	//    2    4:ireturn         
	}

	public int getTitleMarginStart()
	{
		return mTitleMarginStart;
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field int mTitleMarginStart>
	//    2    4:ireturn         
	}

	public int getTitleMarginTop()
	{
		return mTitleMarginTop;
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field int mTitleMarginTop>
	//    2    4:ireturn         
	}

	public DecorToolbar getWrapper()
	{
		if(mWrapper == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #763 <Field ToolbarWidgetWrapper mWrapper>
	//*   2    4:ifnonnull       20
			mWrapper = new ToolbarWidgetWrapper(this, true);
	//    3    7:aload_0         
	//    4    8:new             #765 <Class ToolbarWidgetWrapper>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #768 <Method void ToolbarWidgetWrapper(Toolbar, boolean)>
	//    9   17:putfield        #763 <Field ToolbarWidgetWrapper mWrapper>
		return ((DecorToolbar) (mWrapper));
	//   10   20:aload_0         
	//   11   21:getfield        #763 <Field ToolbarWidgetWrapper mWrapper>
	//   12   24:areturn         
	}

	public boolean hasExpandedActionView()
	{
		return mExpandedMenuPresenter != null && mExpandedMenuPresenter.mCurrentExpandedItem != null;
	//    0    0:aload_0         
	//    1    1:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//    5   11:getfield        #650 <Field MenuItemImpl Toolbar$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
	//    6   14:ifnull          19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean hideOverflowMenu()
	{
		return mMenuView != null && mMenuView.hideOverflowMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #427 <Field ActionMenuView mMenuView>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #427 <Field ActionMenuView mMenuView>
	//    5   11:invokevirtual   #772 <Method boolean ActionMenuView.hideOverflowMenu()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public void inflateMenu(int i)
	{
		getMenuInflater().inflate(i, getMenu());
	//    0    0:aload_0         
	//    1    1:invokespecial   #776 <Method MenuInflater getMenuInflater()>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #777 <Method Menu getMenu()>
	//    5    9:invokevirtual   #783 <Method void MenuInflater.inflate(int, Menu)>
	//    6   12:return          
	}

	public boolean isOverflowMenuShowPending()
	{
		return mMenuView != null && mMenuView.isOverflowMenuShowPending();
	//    0    0:aload_0         
	//    1    1:getfield        #427 <Field ActionMenuView mMenuView>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #427 <Field ActionMenuView mMenuView>
	//    5   11:invokevirtual   #786 <Method boolean ActionMenuView.isOverflowMenuShowPending()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean isOverflowMenuShowing()
	{
		return mMenuView != null && mMenuView.isOverflowMenuShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #427 <Field ActionMenuView mMenuView>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #427 <Field ActionMenuView mMenuView>
	//    5   11:invokevirtual   #789 <Method boolean ActionMenuView.isOverflowMenuShowing()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean isTitleTruncated()
	{
		if(mTitleTextView != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #792 <Field TextView mTitleTextView>
	//    2    4:ifnonnull       9
_L1:
		Layout layout;
		return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//*   5    9:aload_0         
	//*   6   10:getfield        #792 <Field TextView mTitleTextView>
	//*   7   13:invokevirtual   #798 <Method Layout TextView.getLayout()>
	//*   8   16:astore_3        
_L2:
		if((layout = mTitleTextView.getLayout()) != null)
	//*   9   17:aload_3         
	//*  10   18:ifnull          7
		{
			int j = layout.getLineCount();
	//   11   21:aload_3         
	//   12   22:invokevirtual   #803 <Method int Layout.getLineCount()>
	//   13   25:istore_2        
			int i = 0;
	//   14   26:iconst_0        
	//   15   27:istore_1        
			while(i < j) 
	//*  16   28:iload_1         
	//*  17   29:iload_2         
	//*  18   30:icmpge          7
			{
				if(layout.getEllipsisCount(i) > 0)
	//*  19   33:aload_3         
	//*  20   34:iload_1         
	//*  21   35:invokevirtual   #806 <Method int Layout.getEllipsisCount(int)>
	//*  22   38:ifle            43
					return true;
	//   23   41:iconst_1        
	//   24   42:ireturn         
				i++;
	//   25   43:iload_1         
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:istore_1        
			}
		}
		if(true) goto _L1; else goto _L3
	//   29   47:goto            28
_L3:
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #809 <Method void ViewGroup.onDetachedFromWindow()>
		removeCallbacks(mShowOverflowMenuRunnable);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #130 <Field Runnable mShowOverflowMenuRunnable>
	//    5    9:invokevirtual   #613 <Method boolean removeCallbacks(Runnable)>
	//    6   12:pop             
	//    7   13:return          
	}

	public boolean onHoverEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #816 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i == 9)
	//*   3    5:iload_2         
	//*   4    6:bipush          9
	//*   5    8:icmpne          16
			mEatingHover = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #818 <Field boolean mEatingHover>
		if(!mEatingHover)
	//*   9   16:aload_0         
	//*  10   17:getfield        #818 <Field boolean mEatingHover>
	//*  11   20:ifne            44
		{
			boolean flag = super.onHoverEvent(motionevent);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokespecial   #820 <Method boolean ViewGroup.onHoverEvent(MotionEvent)>
	//   15   28:istore_3        
			if(i == 9 && !flag)
	//*  16   29:iload_2         
	//*  17   30:bipush          9
	//*  18   32:icmpne          44
	//*  19   35:iload_3         
	//*  20   36:ifne            44
				mEatingHover = true;
	//   21   39:aload_0         
	//   22   40:iconst_1        
	//   23   41:putfield        #818 <Field boolean mEatingHover>
		}
		if(i == 10 || i == 3)
	//*  24   44:iload_2         
	//*  25   45:bipush          10
	//*  26   47:icmpeq          55
	//*  27   50:iload_2         
	//*  28   51:iconst_3        
	//*  29   52:icmpne          60
			mEatingHover = false;
	//   30   55:aload_0         
	//   31   56:iconst_0        
	//   32   57:putfield        #818 <Field boolean mEatingHover>
		return true;
	//   33   60:iconst_1        
	//   34   61:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		int i1;
		int j1;
		int i2;
		int k2;
		int i3;
		int j3;
		int k3;
		int l3;
		int i4;
		boolean flag1;
		Object obj;
		Object obj1;
		int ai[];
		int k1;
		if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          911
			k1 = 1;
	//    4    8:iconst_1        
	//    5    9:istore          8
		else
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #825 <Method int getWidth()>
	//*   8   15:istore          12
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #500 <Method int getHeight()>
	//*  11   21:istore          14
	//*  12   23:aload_0         
	//*  13   24:invokevirtual   #575 <Method int getPaddingLeft()>
	//*  14   27:istore          11
	//*  15   29:aload_0         
	//*  16   30:invokevirtual   #578 <Method int getPaddingRight()>
	//*  17   33:istore          13
	//*  18   35:aload_0         
	//*  19   36:invokevirtual   #494 <Method int getPaddingTop()>
	//*  20   39:istore          10
	//*  21   41:aload_0         
	//*  22   42:invokevirtual   #497 <Method int getPaddingBottom()>
	//*  23   45:istore          15
	//*  24   47:iload           11
	//*  25   49:istore          4
	//*  26   51:iload           12
	//*  27   53:iload           13
	//*  28   55:isub            
	//*  29   56:istore          7
	//*  30   58:aload_0         
	//*  31   59:getfield        #122 <Field int[] mTempMargins>
	//*  32   62:astore          19
	//*  33   64:aload           19
	//*  34   66:iconst_1        
	//*  35   67:iconst_0        
	//*  36   68:iastore         
	//*  37   69:aload           19
	//*  38   71:iconst_0        
	//*  39   72:iconst_0        
	//*  40   73:iastore         
	//*  41   74:aload_0         
	//*  42   75:invokestatic    #828 <Method int ViewCompat.getMinimumHeight(View)>
	//*  43   78:istore_2        
	//*  44   79:iload_2         
	//*  45   80:iflt            917
	//*  46   83:iload_2         
	//*  47   84:iload           5
	//*  48   86:iload_3         
	//*  49   87:isub            
	//*  50   88:invokestatic    #605 <Method int Math.min(int, int)>
	//*  51   91:istore          6
	//*  52   93:iload           4
	//*  53   95:istore_2        
	//*  54   96:iload           7
	//*  55   98:istore_3        
	//*  56   99:aload_0         
	//*  57  100:aload_0         
	//*  58  101:getfield        #473 <Field ImageButton mNavButtonView>
	//*  59  104:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  60  107:ifeq            133
	//*  61  110:iload           8
	//*  62  112:ifeq            923
	//*  63  115:aload_0         
	//*  64  116:aload_0         
	//*  65  117:getfield        #473 <Field ImageButton mNavButtonView>
	//*  66  120:iload           7
	//*  67  122:aload           19
	//*  68  124:iload           6
	//*  69  126:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//*  70  129:istore_3        
	//*  71  130:iload           4
	//*  72  132:istore_2        
	//*  73  133:iload_2         
	//*  74  134:istore          4
	//*  75  136:iload_3         
	//*  76  137:istore          5
	//*  77  139:aload_0         
	//*  78  140:aload_0         
	//*  79  141:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  80  144:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  81  147:ifeq            173
	//*  82  150:iload           8
	//*  83  152:ifeq            944
	//*  84  155:aload_0         
	//*  85  156:aload_0         
	//*  86  157:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  87  160:iload_3         
	//*  88  161:aload           19
	//*  89  163:iload           6
	//*  90  165:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//*  91  168:istore          5
	//*  92  170:iload_2         
	//*  93  171:istore          4
	//*  94  173:iload           4
	//*  95  175:istore_3        
	//*  96  176:iload           5
	//*  97  178:istore_2        
	//*  98  179:aload_0         
	//*  99  180:aload_0         
	//* 100  181:getfield        #427 <Field ActionMenuView mMenuView>
	//* 101  184:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 102  187:ifeq            213
	//* 103  190:iload           8
	//* 104  192:ifeq            965
	//* 105  195:aload_0         
	//* 106  196:aload_0         
	//* 107  197:getfield        #427 <Field ActionMenuView mMenuView>
	//* 108  200:iload           4
	//* 109  202:aload           19
	//* 110  204:iload           6
	//* 111  206:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//* 112  209:istore_3        
	//* 113  210:iload           5
	//* 114  212:istore_2        
	//* 115  213:aload_0         
	//* 116  214:invokevirtual   #834 <Method int getCurrentContentInsetLeft()>
	//* 117  217:istore          4
	//* 118  219:aload_0         
	//* 119  220:invokevirtual   #836 <Method int getCurrentContentInsetRight()>
	//* 120  223:istore          5
	//* 121  225:aload           19
	//* 122  227:iconst_0        
	//* 123  228:iconst_0        
	//* 124  229:iload           4
	//* 125  231:iload_3         
	//* 126  232:isub            
	//* 127  233:invokestatic    #511 <Method int Math.max(int, int)>
	//* 128  236:iastore         
	//* 129  237:aload           19
	//* 130  239:iconst_1        
	//* 131  240:iconst_0        
	//* 132  241:iload           5
	//* 133  243:iload           12
	//* 134  245:iload           13
	//* 135  247:isub            
	//* 136  248:iload_2         
	//* 137  249:isub            
	//* 138  250:isub            
	//* 139  251:invokestatic    #511 <Method int Math.max(int, int)>
	//* 140  254:iastore         
	//* 141  255:iload_3         
	//* 142  256:iload           4
	//* 143  258:invokestatic    #511 <Method int Math.max(int, int)>
	//* 144  261:istore          4
	//* 145  263:iload_2         
	//* 146  264:iload           12
	//* 147  266:iload           13
	//* 148  268:isub            
	//* 149  269:iload           5
	//* 150  271:isub            
	//* 151  272:invokestatic    #605 <Method int Math.min(int, int)>
	//* 152  275:istore          5
	//* 153  277:iload           4
	//* 154  279:istore_2        
	//* 155  280:iload           5
	//* 156  282:istore_3        
	//* 157  283:aload_0         
	//* 158  284:aload_0         
	//* 159  285:getfield        #396 <Field View mExpandedActionView>
	//* 160  288:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 161  291:ifeq            317
	//* 162  294:iload           8
	//* 163  296:ifeq            986
	//* 164  299:aload_0         
	//* 165  300:aload_0         
	//* 166  301:getfield        #396 <Field View mExpandedActionView>
	//* 167  304:iload           5
	//* 168  306:aload           19
	//* 169  308:iload           6
	//* 170  310:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//* 171  313:istore_3        
	//* 172  314:iload           4
	//* 173  316:istore_2        
	//* 174  317:iload_2         
	//* 175  318:istore          4
	//* 176  320:iload_3         
	//* 177  321:istore          5
	//* 178  323:aload_0         
	//* 179  324:aload_0         
	//* 180  325:getfield        #417 <Field ImageView mLogoView>
	//* 181  328:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 182  331:ifeq            357
	//* 183  334:iload           8
	//* 184  336:ifeq            1007
	//* 185  339:aload_0         
	//* 186  340:aload_0         
	//* 187  341:getfield        #417 <Field ImageView mLogoView>
	//* 188  344:iload_3         
	//* 189  345:aload           19
	//* 190  347:iload           6
	//* 191  349:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//* 192  352:istore          5
	//* 193  354:iload_2         
	//* 194  355:istore          4
	//* 195  357:aload_0         
	//* 196  358:aload_0         
	//* 197  359:getfield        #792 <Field TextView mTitleTextView>
	//* 198  362:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 199  365:istore_1        
	//* 200  366:aload_0         
	//* 201  367:aload_0         
	//* 202  368:getfield        #838 <Field TextView mSubtitleTextView>
	//* 203  371:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 204  374:istore          16
	//* 205  376:iconst_0        
	//* 206  377:istore_2        
	//* 207  378:iload_1         
	//* 208  379:ifeq            416
	//* 209  382:aload_0         
	//* 210  383:getfield        #792 <Field TextView mTitleTextView>
	//* 211  386:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//* 212  389:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 213  392:astore          17
	//* 214  394:iconst_0        
	//* 215  395:aload           17
	//* 216  397:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//* 217  400:aload_0         
	//* 218  401:getfield        #792 <Field TextView mTitleTextView>
	//* 219  404:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//* 220  407:iadd            
	//* 221  408:aload           17
	//* 222  410:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 223  413:iadd            
	//* 224  414:iadd            
	//* 225  415:istore_2        
	//* 226  416:iload_2         
	//* 227  417:istore          9
	//* 228  419:iload           16
	//* 229  421:ifeq            459
	//* 230  424:aload_0         
	//* 231  425:getfield        #838 <Field TextView mSubtitleTextView>
	//* 232  428:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//* 233  431:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 234  434:astore          17
	//* 235  436:iload_2         
	//* 236  437:aload           17
	//* 237  439:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//* 238  442:aload_0         
	//* 239  443:getfield        #838 <Field TextView mSubtitleTextView>
	//* 240  446:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//* 241  449:iadd            
	//* 242  450:aload           17
	//* 243  452:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 244  455:iadd            
	//* 245  456:iadd            
	//* 246  457:istore          9
	//* 247  459:iload_1         
	//* 248  460:ifne            474
	//* 249  463:iload           4
	//* 250  465:istore_3        
	//* 251  466:iload           5
	//* 252  468:istore_2        
	//* 253  469:iload           16
	//* 254  471:ifeq            852
	//* 255  474:iload_1         
	//* 256  475:ifeq            1028
	//* 257  478:aload_0         
	//* 258  479:getfield        #792 <Field TextView mTitleTextView>
	//* 259  482:astore          17
	//* 260  484:iload           16
	//* 261  486:ifeq            1037
	//* 262  489:aload_0         
	//* 263  490:getfield        #838 <Field TextView mSubtitleTextView>
	//* 264  493:astore          18
	//* 265  495:aload           17
	//* 266  497:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 267  500:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 268  503:astore          17
	//* 269  505:aload           18
	//* 270  507:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 271  510:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 272  513:astore          18
	//* 273  515:iload_1         
	//* 274  516:ifeq            529
	//* 275  519:aload_0         
	//* 276  520:getfield        #792 <Field TextView mTitleTextView>
	//* 277  523:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//* 278  526:ifgt            544
	//* 279  529:iload           16
	//* 280  531:ifeq            1046
	//* 281  534:aload_0         
	//* 282  535:getfield        #838 <Field TextView mSubtitleTextView>
	//* 283  538:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//* 284  541:ifle            1046
	//* 285  544:iconst_1        
	//* 286  545:istore          7
	//* 287  547:aload_0         
	//* 288  548:getfield        #111 <Field int mGravity>
	//* 289  551:bipush          112
	//* 290  553:iand            
	//* 291  554:lookupswitch    2: default 580
	//	               48: 1052
	//	               80: 1126
	//* 292  580:iload           14
	//* 293  582:iload           10
	//* 294  584:isub            
	//* 295  585:iload           15
	//* 296  587:isub            
	//* 297  588:iload           9
	//* 298  590:isub            
	//* 299  591:iconst_2        
	//* 300  592:idiv            
	//* 301  593:istore_3        
	//* 302  594:iload_3         
	//* 303  595:aload           17
	//* 304  597:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//* 305  600:aload_0         
	//* 306  601:getfield        #186 <Field int mTitleMarginTop>
	//* 307  604:iadd            
	//* 308  605:icmpge          1071
	//* 309  608:aload           17
	//* 310  610:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//* 311  613:aload_0         
	//* 312  614:getfield        #186 <Field int mTitleMarginTop>
	//* 313  617:iadd            
	//* 314  618:istore_2        
	//* 315  619:iload           10
	//* 316  621:iload_2         
	//* 317  622:iadd            
	//* 318  623:istore_2        
	//* 319  624:iload           8
	//* 320  626:ifeq            1154
	//* 321  629:iload           7
	//* 322  631:ifeq            1149
	//* 323  634:aload_0         
	//* 324  635:getfield        #190 <Field int mTitleMarginStart>
	//* 325  638:istore_3        
	//* 326  639:iload_3         
	//* 327  640:aload           19
	//* 328  642:iconst_1        
	//* 329  643:iaload          
	//* 330  644:isub            
	//* 331  645:istore_3        
	//* 332  646:iload           5
	//* 333  648:iconst_0        
	//* 334  649:iload_3         
	//* 335  650:invokestatic    #511 <Method int Math.max(int, int)>
	//* 336  653:isub            
	//* 337  654:istore          5
	//* 338  656:aload           19
	//* 339  658:iconst_1        
	//* 340  659:iconst_0        
	//* 341  660:iload_3         
	//* 342  661:ineg            
	//* 343  662:invokestatic    #511 <Method int Math.max(int, int)>
	//* 344  665:iastore         
	//* 345  666:iload           5
	//* 346  668:istore          9
	//* 347  670:iload           5
	//* 348  672:istore_3        
	//* 349  673:iload           9
	//* 350  675:istore          8
	//* 351  677:iload_2         
	//* 352  678:istore          10
	//* 353  680:iload_1         
	//* 354  681:ifeq            752
	//* 355  684:aload_0         
	//* 356  685:getfield        #792 <Field TextView mTitleTextView>
	//* 357  688:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//* 358  691:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 359  694:astore          17
	//* 360  696:iload           9
	//* 361  698:aload_0         
	//* 362  699:getfield        #792 <Field TextView mTitleTextView>
	//* 363  702:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//* 364  705:isub            
	//* 365  706:istore          8
	//* 366  708:iload_2         
	//* 367  709:aload_0         
	//* 368  710:getfield        #792 <Field TextView mTitleTextView>
	//* 369  713:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//* 370  716:iadd            
	//* 371  717:istore          10
	//* 372  719:aload_0         
	//* 373  720:getfield        #792 <Field TextView mTitleTextView>
	//* 374  723:iload           8
	//* 375  725:iload_2         
	//* 376  726:iload           9
	//* 377  728:iload           10
	//* 378  730:invokevirtual   #842 <Method void TextView.layout(int, int, int, int)>
	//* 379  733:iload           8
	//* 380  735:aload_0         
	//* 381  736:getfield        #188 <Field int mTitleMarginEnd>
	//* 382  739:isub            
	//* 383  740:istore          8
	//* 384  742:iload           10
	//* 385  744:aload           17
	//* 386  746:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 387  749:iadd            
	//* 388  750:istore          10
	//* 389  752:iload_3         
	//* 390  753:istore          9
	//* 391  755:iload           16
	//* 392  757:ifeq            830
	//* 393  760:aload_0         
	//* 394  761:getfield        #838 <Field TextView mSubtitleTextView>
	//* 395  764:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//* 396  767:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 397  770:astore          17
	//* 398  772:iload           10
	//* 399  774:aload           17
	//* 400  776:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//* 401  779:iadd            
	//* 402  780:istore_2        
	//* 403  781:aload_0         
	//* 404  782:getfield        #838 <Field TextView mSubtitleTextView>
	//* 405  785:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//* 406  788:istore          9
	//* 407  790:iload_2         
	//* 408  791:aload_0         
	//* 409  792:getfield        #838 <Field TextView mSubtitleTextView>
	//* 410  795:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//* 411  798:iadd            
	//* 412  799:istore          10
	//* 413  801:aload_0         
	//* 414  802:getfield        #838 <Field TextView mSubtitleTextView>
	//* 415  805:iload_3         
	//* 416  806:iload           9
	//* 417  808:isub            
	//* 418  809:iload_2         
	//* 419  810:iload_3         
	//* 420  811:iload           10
	//* 421  813:invokevirtual   #842 <Method void TextView.layout(int, int, int, int)>
	//* 422  816:iload_3         
	//* 423  817:aload_0         
	//* 424  818:getfield        #188 <Field int mTitleMarginEnd>
	//* 425  821:isub            
	//* 426  822:istore          9
	//* 427  824:aload           17
	//* 428  826:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 429  829:istore_2        
	//* 430  830:iload           4
	//* 431  832:istore_3        
	//* 432  833:iload           5
	//* 433  835:istore_2        
	//* 434  836:iload           7
	//* 435  838:ifeq            852
	//* 436  841:iload           8
	//* 437  843:iload           9
	//* 438  845:invokestatic    #605 <Method int Math.min(int, int)>
	//* 439  848:istore_2        
	//* 440  849:iload           4
	//* 441  851:istore_3        
	//* 442  852:aload_0         
	//* 443  853:aload_0         
	//* 444  854:getfield        #118 <Field ArrayList mTempViews>
	//* 445  857:iconst_3        
	//* 446  858:invokespecial   #844 <Method void addCustomViewsWithGravity(List, int)>
	//* 447  861:aload_0         
	//* 448  862:getfield        #118 <Field ArrayList mTempViews>
	//* 449  865:invokevirtual   #625 <Method int ArrayList.size()>
	//* 450  868:istore          5
	//* 451  870:iconst_0        
	//* 452  871:istore          4
	//* 453  873:iload           4
	//* 454  875:iload           5
	//* 455  877:icmpge          1387
	//* 456  880:aload_0         
	//* 457  881:aload_0         
	//* 458  882:getfield        #118 <Field ArrayList mTempViews>
	//* 459  885:iload           4
	//* 460  887:invokevirtual   #626 <Method Object ArrayList.get(int)>
	//* 461  890:checkcast       #364 <Class View>
	//* 462  893:iload_3         
	//* 463  894:aload           19
	//* 464  896:iload           6
	//* 465  898:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//* 466  901:istore_3        
	//* 467  902:iload           4
	//* 468  904:iconst_1        
	//* 469  905:iadd            
	//* 470  906:istore          4
	//* 471  908:goto            873
			k1 = 0;
	//  472  911:iconst_0        
	//  473  912:istore          8
		j3 = getWidth();
		l3 = getHeight();
		i3 = getPaddingLeft();
		k3 = getPaddingRight();
		k2 = getPaddingTop();
		i4 = getPaddingBottom();
		k = i3;
		j1 = j3 - k3;
		ai = mTempMargins;
		ai[1] = 0;
		ai[0] = 0;
		i = ViewCompat.getMinimumHeight(((View) (this)));
		if(i >= 0)
			i1 = Math.min(i, l - j);
		else
	//* 474  914:goto            11
			i1 = 0;
	//  475  917:iconst_0        
	//  476  918:istore          6
		i = k;
		j = j1;
		if(shouldLayout(((View) (mNavButtonView))))
			if(k1 != 0)
			{
				j = layoutChildRight(((View) (mNavButtonView)), j1, ai, i1);
				i = k;
			} else
	//* 477  920:goto            93
			{
				i = layoutChildLeft(((View) (mNavButtonView)), k, ai, i1);
	//  478  923:aload_0         
	//  479  924:aload_0         
	//  480  925:getfield        #473 <Field ImageButton mNavButtonView>
	//  481  928:iload           4
	//  482  930:aload           19
	//  483  932:iload           6
	//  484  934:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//  485  937:istore_2        
				j = j1;
	//  486  938:iload           7
	//  487  940:istore_3        
			}
		k = i;
		l = j;
		if(shouldLayout(((View) (mCollapseButtonView))))
			if(k1 != 0)
			{
				l = layoutChildRight(((View) (mCollapseButtonView)), j, ai, i1);
				k = i;
			} else
	//* 488  941:goto            133
			{
				k = layoutChildLeft(((View) (mCollapseButtonView)), i, ai, i1);
	//  489  944:aload_0         
	//  490  945:aload_0         
	//  491  946:getfield        #656 <Field ImageButton mCollapseButtonView>
	//  492  949:iload_2         
	//  493  950:aload           19
	//  494  952:iload           6
	//  495  954:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//  496  957:istore          4
				l = j;
	//  497  959:iload_3         
	//  498  960:istore          5
			}
		j = k;
		i = l;
		if(shouldLayout(((View) (mMenuView))))
			if(k1 != 0)
			{
				j = layoutChildLeft(((View) (mMenuView)), k, ai, i1);
				i = l;
			} else
	//* 499  962:goto            173
			{
				i = layoutChildRight(((View) (mMenuView)), l, ai, i1);
	//  500  965:aload_0         
	//  501  966:aload_0         
	//  502  967:getfield        #427 <Field ActionMenuView mMenuView>
	//  503  970:iload           5
	//  504  972:aload           19
	//  505  974:iload           6
	//  506  976:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//  507  979:istore_2        
				j = k;
	//  508  980:iload           4
	//  509  982:istore_3        
			}
		k = getCurrentContentInsetLeft();
		l = getCurrentContentInsetRight();
		ai[0] = Math.max(0, k - j);
		ai[1] = Math.max(0, l - (j3 - k3 - i));
		k = Math.max(j, k);
		l = Math.min(i, j3 - k3 - l);
		i = k;
		j = l;
		if(shouldLayout(mExpandedActionView))
			if(k1 != 0)
			{
				j = layoutChildRight(mExpandedActionView, l, ai, i1);
				i = k;
			} else
	//* 510  983:goto            213
			{
				i = layoutChildLeft(mExpandedActionView, k, ai, i1);
	//  511  986:aload_0         
	//  512  987:aload_0         
	//  513  988:getfield        #396 <Field View mExpandedActionView>
	//  514  991:iload           4
	//  515  993:aload           19
	//  516  995:iload           6
	//  517  997:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//  518 1000:istore_2        
				j = l;
	//  519 1001:iload           5
	//  520 1003:istore_3        
			}
		k = i;
		l = j;
		if(shouldLayout(((View) (mLogoView))))
			if(k1 != 0)
			{
				l = layoutChildRight(((View) (mLogoView)), j, ai, i1);
				k = i;
			} else
	//* 521 1004:goto            317
			{
				k = layoutChildLeft(((View) (mLogoView)), i, ai, i1);
	//  522 1007:aload_0         
	//  523 1008:aload_0         
	//  524 1009:getfield        #417 <Field ImageView mLogoView>
	//  525 1012:iload_2         
	//  526 1013:aload           19
	//  527 1015:iload           6
	//  528 1017:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//  529 1020:istore          4
				l = j;
	//  530 1022:iload_3         
	//  531 1023:istore          5
			}
		flag = shouldLayout(((View) (mTitleTextView)));
		flag1 = shouldLayout(((View) (mSubtitleTextView)));
		i = 0;
		if(flag)
		{
			LayoutParams layoutparams = (LayoutParams)mTitleTextView.getLayoutParams();
			i = 0 + (layoutparams.topMargin + mTitleTextView.getMeasuredHeight() + layoutparams.bottomMargin);
		}
		i2 = i;
		if(flag1)
		{
			LayoutParams layoutparams1 = (LayoutParams)mSubtitleTextView.getLayoutParams();
			i2 = i + (layoutparams1.topMargin + mSubtitleTextView.getMeasuredHeight() + layoutparams1.bottomMargin);
		}
		if(flag) goto _L2; else goto _L1
_L1:
		j = k;
		i = l;
		if(!flag1) goto _L3; else goto _L2
_L2:
		if(flag)
			obj = ((Object) (mTitleTextView));
		else
	//* 532 1025:goto            357
			obj = ((Object) (mSubtitleTextView));
	//  533 1028:aload_0         
	//  534 1029:getfield        #838 <Field TextView mSubtitleTextView>
	//  535 1032:astore          17
		if(flag1)
			obj1 = ((Object) (mSubtitleTextView));
		else
	//* 536 1034:goto            484
			obj1 = ((Object) (mTitleTextView));
	//  537 1037:aload_0         
	//  538 1038:getfield        #792 <Field TextView mTitleTextView>
	//  539 1041:astore          18
		obj = ((Object) ((LayoutParams)((View) (obj)).getLayoutParams()));
		obj1 = ((Object) ((LayoutParams)((View) (obj1)).getLayoutParams()));
		if(flag && mTitleTextView.getMeasuredWidth() > 0 || flag1 && mSubtitleTextView.getMeasuredWidth() > 0)
			j1 = 1;
		else
	//* 540 1043:goto            495
			j1 = 0;
	//  541 1046:iconst_0        
	//  542 1047:istore          7
		mGravity & 0x70;
		JVM INSTR lookupswitch 2: default 580
	//	               48: 1052
	//	               80: 1126;
		   goto _L4 _L5 _L6
_L4:
		j = (l3 - k2 - i4 - i2) / 2;
		if(j < ((LayoutParams) (obj)).topMargin + mTitleMarginTop)
		{
			i = ((LayoutParams) (obj)).topMargin + mTitleMarginTop;
		} else
	//* 543 1049:goto            547
	//* 544 1052:aload_0         
	//* 545 1053:invokevirtual   #494 <Method int getPaddingTop()>
	//* 546 1056:aload           17
	//* 547 1058:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//* 548 1061:iadd            
	//* 549 1062:aload_0         
	//* 550 1063:getfield        #186 <Field int mTitleMarginTop>
	//* 551 1066:iadd            
	//* 552 1067:istore_2        
	//* 553 1068:goto            624
		{
			i2 = l3 - i4 - i2 - j - k2;
	//  554 1071:iload           14
	//  555 1073:iload           15
	//  556 1075:isub            
	//  557 1076:iload           9
	//  558 1078:isub            
	//  559 1079:iload_3         
	//  560 1080:isub            
	//  561 1081:iload           10
	//  562 1083:isub            
	//  563 1084:istore          9
			i = j;
	//  564 1086:iload_3         
	//  565 1087:istore_2        
			if(i2 < ((LayoutParams) (obj)).bottomMargin + mTitleMarginBottom)
	//* 566 1088:iload           9
	//* 567 1090:aload           17
	//* 568 1092:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 569 1095:aload_0         
	//* 570 1096:getfield        #184 <Field int mTitleMarginBottom>
	//* 571 1099:iadd            
	//* 572 1100:icmpge          619
				i = Math.max(0, j - ((((LayoutParams) (obj1)).bottomMargin + mTitleMarginBottom) - i2));
	//  573 1103:iconst_0        
	//  574 1104:iload_3         
	//  575 1105:aload           18
	//  576 1107:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//  577 1110:aload_0         
	//  578 1111:getfield        #184 <Field int mTitleMarginBottom>
	//  579 1114:iadd            
	//  580 1115:iload           9
	//  581 1117:isub            
	//  582 1118:isub            
	//  583 1119:invokestatic    #511 <Method int Math.max(int, int)>
	//  584 1122:istore_2        
		}
		i = k2 + i;
_L13:
		if(k1 != 0)
		{
			if(j1 != 0)
				j = mTitleMarginStart;
			else
	//* 585 1123:goto            619
	//* 586 1126:iload           14
	//* 587 1128:iload           15
	//* 588 1130:isub            
	//* 589 1131:aload           18
	//* 590 1133:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 591 1136:isub            
	//* 592 1137:aload_0         
	//* 593 1138:getfield        #184 <Field int mTitleMarginBottom>
	//* 594 1141:isub            
	//* 595 1142:iload           9
	//* 596 1144:isub            
	//* 597 1145:istore_2        
	//* 598 1146:goto            624
				j = 0;
	//  599 1149:iconst_0        
	//  600 1150:istore_3        
			j -= ai[1];
			l -= Math.max(0, j);
			ai[1] = Math.max(0, -j);
			i2 = l;
			j = l;
			k1 = i2;
			k2 = i;
			if(flag)
			{
				obj = ((Object) ((LayoutParams)mTitleTextView.getLayoutParams()));
				k1 = i2 - mTitleTextView.getMeasuredWidth();
				k2 = i + mTitleTextView.getMeasuredHeight();
				mTitleTextView.layout(k1, i, i2, k2);
				k1 -= mTitleMarginEnd;
				k2 += ((LayoutParams) (obj)).bottomMargin;
			}
			i2 = j;
			if(flag1)
			{
				obj = ((Object) ((LayoutParams)mSubtitleTextView.getLayoutParams()));
				i = k2 + ((LayoutParams) (obj)).topMargin;
				i2 = mSubtitleTextView.getMeasuredWidth();
				k2 = i + mSubtitleTextView.getMeasuredHeight();
				mSubtitleTextView.layout(j - i2, i, j, k2);
				i2 = j - mTitleMarginEnd;
				i = ((LayoutParams) (obj)).bottomMargin;
			}
			j = k;
			i = l;
			if(j1 != 0)
			{
				i = Math.min(k1, i2);
				j = k;
			}
		} else
	//* 601 1151:goto            639
		{
			int l1;
			int j2;
			int l2;
			if(j1 != 0)
	//* 602 1154:iload           7
	//* 603 1156:ifeq            1382
				j = mTitleMarginStart;
	//  604 1159:aload_0         
	//  605 1160:getfield        #190 <Field int mTitleMarginStart>
	//  606 1163:istore_3        
			else
	//* 607 1164:iload_3         
	//* 608 1165:aload           19
	//* 609 1167:iconst_0        
	//* 610 1168:iaload          
	//* 611 1169:isub            
	//* 612 1170:istore          8
	//* 613 1172:iload           4
	//* 614 1174:iconst_0        
	//* 615 1175:iload           8
	//* 616 1177:invokestatic    #511 <Method int Math.max(int, int)>
	//* 617 1180:iadd            
	//* 618 1181:istore_3        
	//* 619 1182:aload           19
	//* 620 1184:iconst_0        
	//* 621 1185:iconst_0        
	//* 622 1186:iload           8
	//* 623 1188:ineg            
	//* 624 1189:invokestatic    #511 <Method int Math.max(int, int)>
	//* 625 1192:iastore         
	//* 626 1193:iload_3         
	//* 627 1194:istore          9
	//* 628 1196:iload_3         
	//* 629 1197:istore          4
	//* 630 1199:iload           9
	//* 631 1201:istore          8
	//* 632 1203:iload_2         
	//* 633 1204:istore          10
	//* 634 1206:iload_1         
	//* 635 1207:ifeq            1278
	//* 636 1210:aload_0         
	//* 637 1211:getfield        #792 <Field TextView mTitleTextView>
	//* 638 1214:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//* 639 1217:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 640 1220:astore          17
	//* 641 1222:iload           9
	//* 642 1224:aload_0         
	//* 643 1225:getfield        #792 <Field TextView mTitleTextView>
	//* 644 1228:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//* 645 1231:iadd            
	//* 646 1232:istore          8
	//* 647 1234:iload_2         
	//* 648 1235:aload_0         
	//* 649 1236:getfield        #792 <Field TextView mTitleTextView>
	//* 650 1239:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//* 651 1242:iadd            
	//* 652 1243:istore          10
	//* 653 1245:aload_0         
	//* 654 1246:getfield        #792 <Field TextView mTitleTextView>
	//* 655 1249:iload           9
	//* 656 1251:iload_2         
	//* 657 1252:iload           8
	//* 658 1254:iload           10
	//* 659 1256:invokevirtual   #842 <Method void TextView.layout(int, int, int, int)>
	//* 660 1259:iload           8
	//* 661 1261:aload_0         
	//* 662 1262:getfield        #188 <Field int mTitleMarginEnd>
	//* 663 1265:iadd            
	//* 664 1266:istore          8
	//* 665 1268:iload           10
	//* 666 1270:aload           17
	//* 667 1272:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 668 1275:iadd            
	//* 669 1276:istore          10
	//* 670 1278:iload           4
	//* 671 1280:istore          9
	//* 672 1282:iload           16
	//* 673 1284:ifeq            1360
	//* 674 1287:aload_0         
	//* 675 1288:getfield        #838 <Field TextView mSubtitleTextView>
	//* 676 1291:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//* 677 1294:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 678 1297:astore          17
	//* 679 1299:iload           10
	//* 680 1301:aload           17
	//* 681 1303:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//* 682 1306:iadd            
	//* 683 1307:istore_2        
	//* 684 1308:iload           4
	//* 685 1310:aload_0         
	//* 686 1311:getfield        #838 <Field TextView mSubtitleTextView>
	//* 687 1314:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//* 688 1317:iadd            
	//* 689 1318:istore          9
	//* 690 1320:iload_2         
	//* 691 1321:aload_0         
	//* 692 1322:getfield        #838 <Field TextView mSubtitleTextView>
	//* 693 1325:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//* 694 1328:iadd            
	//* 695 1329:istore          10
	//* 696 1331:aload_0         
	//* 697 1332:getfield        #838 <Field TextView mSubtitleTextView>
	//* 698 1335:iload           4
	//* 699 1337:iload_2         
	//* 700 1338:iload           9
	//* 701 1340:iload           10
	//* 702 1342:invokevirtual   #842 <Method void TextView.layout(int, int, int, int)>
	//* 703 1345:iload           9
	//* 704 1347:aload_0         
	//* 705 1348:getfield        #188 <Field int mTitleMarginEnd>
	//* 706 1351:iadd            
	//* 707 1352:istore          9
	//* 708 1354:aload           17
	//* 709 1356:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 710 1359:istore_2        
	//* 711 1360:iload           5
	//* 712 1362:istore_2        
	//* 713 1363:iload           7
	//* 714 1365:ifeq            852
	//* 715 1368:iload           8
	//* 716 1370:iload           9
	//* 717 1372:invokestatic    #511 <Method int Math.max(int, int)>
	//* 718 1375:istore_3        
	//* 719 1376:iload           5
	//* 720 1378:istore_2        
	//* 721 1379:goto            852
				j = 0;
	//  722 1382:iconst_0        
	//  723 1383:istore_3        
			l1 = j - ai[0];
			j = k + Math.max(0, l1);
			ai[0] = Math.max(0, -l1);
			j2 = j;
			k = j;
			l1 = j2;
			l2 = i;
			if(flag)
			{
				LayoutParams layoutparams2 = (LayoutParams)mTitleTextView.getLayoutParams();
				l1 = j2 + mTitleTextView.getMeasuredWidth();
				l2 = i + mTitleTextView.getMeasuredHeight();
				mTitleTextView.layout(j2, i, l1, l2);
				l1 += mTitleMarginEnd;
				l2 += layoutparams2.bottomMargin;
			}
			j2 = k;
			if(flag1)
			{
				LayoutParams layoutparams3 = (LayoutParams)mSubtitleTextView.getLayoutParams();
				i = l2 + layoutparams3.topMargin;
				j2 = k + mSubtitleTextView.getMeasuredWidth();
				l2 = i + mSubtitleTextView.getMeasuredHeight();
				mSubtitleTextView.layout(k, i, j2, l2);
				j2 += mTitleMarginEnd;
				i = layoutparams3.bottomMargin;
			}
			i = l;
			if(j1 != 0)
			{
				j = Math.max(l1, j2);
				i = l;
			}
		}
_L3:
		addCustomViewsWithGravity(((List) (mTempViews)), 3);
		l = mTempViews.size();
		for(k = 0; k < l; k++)
			j = layoutChildLeft((View)mTempViews.get(k), j, ai, i1);

	//* 724 1384:goto            1164
		addCustomViewsWithGravity(((List) (mTempViews)), 5);
	//  725 1387:aload_0         
	//  726 1388:aload_0         
	//  727 1389:getfield        #118 <Field ArrayList mTempViews>
	//  728 1392:iconst_5        
	//  729 1393:invokespecial   #844 <Method void addCustomViewsWithGravity(List, int)>
		j1 = mTempViews.size();
	//  730 1396:aload_0         
	//  731 1397:getfield        #118 <Field ArrayList mTempViews>
	//  732 1400:invokevirtual   #625 <Method int ArrayList.size()>
	//  733 1403:istore          7
		l = 0;
	//  734 1405:iconst_0        
	//  735 1406:istore          5
		k = i;
	//  736 1408:iload_2         
	//  737 1409:istore          4
		for(i = l; i < j1; i++)
	//* 738 1411:iload           5
	//* 739 1413:istore_2        
	//* 740 1414:iload_2         
	//* 741 1415:iload           7
	//* 742 1417:icmpge          1450
			k = layoutChildRight((View)mTempViews.get(i), k, ai, i1);
	//  743 1420:aload_0         
	//  744 1421:aload_0         
	//  745 1422:getfield        #118 <Field ArrayList mTempViews>
	//  746 1425:iload_2         
	//  747 1426:invokevirtual   #626 <Method Object ArrayList.get(int)>
	//  748 1429:checkcast       #364 <Class View>
	//  749 1432:iload           4
	//  750 1434:aload           19
	//  751 1436:iload           6
	//  752 1438:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//  753 1441:istore          4

	//  754 1443:iload_2         
	//  755 1444:iconst_1        
	//  756 1445:iadd            
	//  757 1446:istore_2        
	//* 758 1447:goto            1414
		addCustomViewsWithGravity(((List) (mTempViews)), 1);
	//  759 1450:aload_0         
	//  760 1451:aload_0         
	//  761 1452:getfield        #118 <Field ArrayList mTempViews>
	//  762 1455:iconst_1        
	//  763 1456:invokespecial   #844 <Method void addCustomViewsWithGravity(List, int)>
		i = getViewListMeasuredWidth(((List) (mTempViews)), ai);
	//  764 1459:aload_0         
	//  765 1460:aload_0         
	//  766 1461:getfield        #118 <Field ArrayList mTempViews>
	//  767 1464:aload           19
	//  768 1466:invokespecial   #846 <Method int getViewListMeasuredWidth(List, int[])>
	//  769 1469:istore_2        
		l = (i3 + (j3 - i3 - k3) / 2) - i / 2;
	//  770 1470:iload           11
	//  771 1472:iload           12
	//  772 1474:iload           11
	//  773 1476:isub            
	//  774 1477:iload           13
	//  775 1479:isub            
	//  776 1480:iconst_2        
	//  777 1481:idiv            
	//  778 1482:iadd            
	//  779 1483:iload_2         
	//  780 1484:iconst_2        
	//  781 1485:idiv            
	//  782 1486:isub            
	//  783 1487:istore          5
		j1 = l + i;
	//  784 1489:iload           5
	//  785 1491:iload_2         
	//  786 1492:iadd            
	//  787 1493:istore          7
		  goto _L7
_L5:
		i = getPaddingTop() + ((LayoutParams) (obj)).topMargin + mTitleMarginTop;
		continue; /* Loop/switch isn't completed */
_L6:
		i = l3 - i4 - ((LayoutParams) (obj1)).bottomMargin - mTitleMarginBottom - i2;
		continue; /* Loop/switch isn't completed */
_L7:
		if(l >= j) goto _L9; else goto _L8
	//  788 1495:iload           5
	//  789 1497:iload_3         
	//  790 1498:icmpge          1548
_L8:
		i = j;
	//  791 1501:iload_3         
	//  792 1502:istore_2        
_L11:
		k = mTempViews.size();
	//  793 1503:aload_0         
	//  794 1504:getfield        #118 <Field ArrayList mTempViews>
	//  795 1507:invokevirtual   #625 <Method int ArrayList.size()>
	//  796 1510:istore          4
		for(j = 0; j < k; j++)
	//* 797 1512:iconst_0        
	//* 798 1513:istore_3        
	//* 799 1514:iload_3         
	//* 800 1515:iload           4
	//* 801 1517:icmpge          1570
			i = layoutChildLeft((View)mTempViews.get(j), i, ai, i1);
	//  802 1520:aload_0         
	//  803 1521:aload_0         
	//  804 1522:getfield        #118 <Field ArrayList mTempViews>
	//  805 1525:iload_3         
	//  806 1526:invokevirtual   #626 <Method Object ArrayList.get(int)>
	//  807 1529:checkcast       #364 <Class View>
	//  808 1532:iload_2         
	//  809 1533:aload           19
	//  810 1535:iload           6
	//  811 1537:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//  812 1540:istore_2        

	//  813 1541:iload_3         
	//  814 1542:iconst_1        
	//  815 1543:iadd            
	//  816 1544:istore_3        
		break; /* Loop/switch isn't completed */
	//  817 1545:goto            1514
_L9:
		i = l;
	//  818 1548:iload           5
	//  819 1550:istore_2        
		if(j1 > k)
	//* 820 1551:iload           7
	//* 821 1553:iload           4
	//* 822 1555:icmple          1503
			i = l - (j1 - k);
	//  823 1558:iload           5
	//  824 1560:iload           7
	//  825 1562:iload           4
	//  826 1564:isub            
	//  827 1565:isub            
	//  828 1566:istore_2        
		if(true) goto _L11; else goto _L10
	//  829 1567:goto            1503
_L10:
		mTempViews.clear();
	//  830 1570:aload_0         
	//  831 1571:getfield        #118 <Field ArrayList mTempViews>
	//  832 1574:invokevirtual   #630 <Method void ArrayList.clear()>
		return;
	//  833 1577:return          
		if(true) goto _L13; else goto _L12
_L12:
	}

	protected void onMeasure(int i, int j)
	{
		int j1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          6
		int i1 = 0;
	//    2    3:iconst_0        
	//    3    4:istore          5
		int ai[] = mTempMargins;
	//    4    6:aload_0         
	//    5    7:getfield        #122 <Field int[] mTempMargins>
	//    6   10:astore          13
		int k;
		int l;
		int k1;
		int l1;
		int i2;
		int j2;
		if(ViewUtils.isLayoutRtl(((View) (this))))
	//*   7   12:aload_0         
	//*   8   13:invokestatic    #852 <Method boolean ViewUtils.isLayoutRtl(View)>
	//*   9   16:ifeq            604
		{
			i2 = 1;
	//   10   19:iconst_1        
	//   11   20:istore          9
			l1 = 0;
	//   12   22:iconst_0        
	//   13   23:istore          8
		} else
	//*  14   25:iconst_0        
	//*  15   26:istore          7
	//*  16   28:aload_0         
	//*  17   29:aload_0         
	//*  18   30:getfield        #473 <Field ImageButton mNavButtonView>
	//*  19   33:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  20   36:ifeq            108
	//*  21   39:aload_0         
	//*  22   40:aload_0         
	//*  23   41:getfield        #473 <Field ImageButton mNavButtonView>
	//*  24   44:iload_1         
	//*  25   45:iconst_0        
	//*  26   46:iload_2         
	//*  27   47:iconst_0        
	//*  28   48:aload_0         
	//*  29   49:getfield        #210 <Field int mMaxButtonHeight>
	//*  30   52:invokespecial   #854 <Method void measureChildConstrained(View, int, int, int, int, int)>
	//*  31   55:aload_0         
	//*  32   56:getfield        #473 <Field ImageButton mNavButtonView>
	//*  33   59:invokevirtual   #855 <Method int ImageButton.getMeasuredWidth()>
	//*  34   62:aload_0         
	//*  35   63:aload_0         
	//*  36   64:getfield        #473 <Field ImageButton mNavButtonView>
	//*  37   67:invokespecial   #857 <Method int getHorizontalMargins(View)>
	//*  38   70:iadd            
	//*  39   71:istore          7
	//*  40   73:iconst_0        
	//*  41   74:aload_0         
	//*  42   75:getfield        #473 <Field ImageButton mNavButtonView>
	//*  43   78:invokevirtual   #858 <Method int ImageButton.getMeasuredHeight()>
	//*  44   81:aload_0         
	//*  45   82:aload_0         
	//*  46   83:getfield        #473 <Field ImageButton mNavButtonView>
	//*  47   86:invokespecial   #860 <Method int getVerticalMargins(View)>
	//*  48   89:iadd            
	//*  49   90:invokestatic    #511 <Method int Math.max(int, int)>
	//*  50   93:istore          6
	//*  51   95:iconst_0        
	//*  52   96:aload_0         
	//*  53   97:getfield        #473 <Field ImageButton mNavButtonView>
	//*  54  100:invokevirtual   #863 <Method int ImageButton.getMeasuredState()>
	//*  55  103:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//*  56  106:istore          5
	//*  57  108:iload           5
	//*  58  110:istore_3        
	//*  59  111:iload           6
	//*  60  113:istore          4
	//*  61  115:aload_0         
	//*  62  116:aload_0         
	//*  63  117:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  64  120:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  65  123:ifeq            196
	//*  66  126:aload_0         
	//*  67  127:aload_0         
	//*  68  128:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  69  131:iload_1         
	//*  70  132:iconst_0        
	//*  71  133:iload_2         
	//*  72  134:iconst_0        
	//*  73  135:aload_0         
	//*  74  136:getfield        #210 <Field int mMaxButtonHeight>
	//*  75  139:invokespecial   #854 <Method void measureChildConstrained(View, int, int, int, int, int)>
	//*  76  142:aload_0         
	//*  77  143:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  78  146:invokevirtual   #855 <Method int ImageButton.getMeasuredWidth()>
	//*  79  149:aload_0         
	//*  80  150:aload_0         
	//*  81  151:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  82  154:invokespecial   #857 <Method int getHorizontalMargins(View)>
	//*  83  157:iadd            
	//*  84  158:istore          7
	//*  85  160:iload           6
	//*  86  162:aload_0         
	//*  87  163:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  88  166:invokevirtual   #858 <Method int ImageButton.getMeasuredHeight()>
	//*  89  169:aload_0         
	//*  90  170:aload_0         
	//*  91  171:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  92  174:invokespecial   #860 <Method int getVerticalMargins(View)>
	//*  93  177:iadd            
	//*  94  178:invokestatic    #511 <Method int Math.max(int, int)>
	//*  95  181:istore          4
	//*  96  183:iload           5
	//*  97  185:aload_0         
	//*  98  186:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  99  189:invokevirtual   #863 <Method int ImageButton.getMeasuredState()>
	//* 100  192:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//* 101  195:istore_3        
	//* 102  196:aload_0         
	//* 103  197:invokevirtual   #720 <Method int getCurrentContentInsetStart()>
	//* 104  200:istore          5
	//* 105  202:iconst_0        
	//* 106  203:iload           5
	//* 107  205:iload           7
	//* 108  207:invokestatic    #511 <Method int Math.max(int, int)>
	//* 109  210:iadd            
	//* 110  211:istore          10
	//* 111  213:aload           13
	//* 112  215:iload           9
	//* 113  217:iconst_0        
	//* 114  218:iload           5
	//* 115  220:iload           7
	//* 116  222:isub            
	//* 117  223:invokestatic    #511 <Method int Math.max(int, int)>
	//* 118  226:iastore         
	//* 119  227:iconst_0        
	//* 120  228:istore          7
	//* 121  230:iload_3         
	//* 122  231:istore          5
	//* 123  233:iload           4
	//* 124  235:istore          6
	//* 125  237:aload_0         
	//* 126  238:aload_0         
	//* 127  239:getfield        #427 <Field ActionMenuView mMenuView>
	//* 128  242:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 129  245:ifeq            319
	//* 130  248:aload_0         
	//* 131  249:aload_0         
	//* 132  250:getfield        #427 <Field ActionMenuView mMenuView>
	//* 133  253:iload_1         
	//* 134  254:iload           10
	//* 135  256:iload_2         
	//* 136  257:iconst_0        
	//* 137  258:aload_0         
	//* 138  259:getfield        #210 <Field int mMaxButtonHeight>
	//* 139  262:invokespecial   #854 <Method void measureChildConstrained(View, int, int, int, int, int)>
	//* 140  265:aload_0         
	//* 141  266:getfield        #427 <Field ActionMenuView mMenuView>
	//* 142  269:invokevirtual   #867 <Method int ActionMenuView.getMeasuredWidth()>
	//* 143  272:aload_0         
	//* 144  273:aload_0         
	//* 145  274:getfield        #427 <Field ActionMenuView mMenuView>
	//* 146  277:invokespecial   #857 <Method int getHorizontalMargins(View)>
	//* 147  280:iadd            
	//* 148  281:istore          7
	//* 149  283:iload           4
	//* 150  285:aload_0         
	//* 151  286:getfield        #427 <Field ActionMenuView mMenuView>
	//* 152  289:invokevirtual   #868 <Method int ActionMenuView.getMeasuredHeight()>
	//* 153  292:aload_0         
	//* 154  293:aload_0         
	//* 155  294:getfield        #427 <Field ActionMenuView mMenuView>
	//* 156  297:invokespecial   #860 <Method int getVerticalMargins(View)>
	//* 157  300:iadd            
	//* 158  301:invokestatic    #511 <Method int Math.max(int, int)>
	//* 159  304:istore          6
	//* 160  306:iload_3         
	//* 161  307:aload_0         
	//* 162  308:getfield        #427 <Field ActionMenuView mMenuView>
	//* 163  311:invokevirtual   #869 <Method int ActionMenuView.getMeasuredState()>
	//* 164  314:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//* 165  317:istore          5
	//* 166  319:aload_0         
	//* 167  320:invokevirtual   #717 <Method int getCurrentContentInsetEnd()>
	//* 168  323:istore_3        
	//* 169  324:iload           10
	//* 170  326:iload_3         
	//* 171  327:iload           7
	//* 172  329:invokestatic    #511 <Method int Math.max(int, int)>
	//* 173  332:iadd            
	//* 174  333:istore          9
	//* 175  335:aload           13
	//* 176  337:iload           8
	//* 177  339:iconst_0        
	//* 178  340:iload_3         
	//* 179  341:iload           7
	//* 180  343:isub            
	//* 181  344:invokestatic    #511 <Method int Math.max(int, int)>
	//* 182  347:iastore         
	//* 183  348:iload           9
	//* 184  350:istore          8
	//* 185  352:iload           5
	//* 186  354:istore_3        
	//* 187  355:iload           6
	//* 188  357:istore          4
	//* 189  359:aload_0         
	//* 190  360:aload_0         
	//* 191  361:getfield        #396 <Field View mExpandedActionView>
	//* 192  364:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 193  367:ifeq            426
	//* 194  370:iload           9
	//* 195  372:aload_0         
	//* 196  373:aload_0         
	//* 197  374:getfield        #396 <Field View mExpandedActionView>
	//* 198  377:iload_1         
	//* 199  378:iload           9
	//* 200  380:iload_2         
	//* 201  381:iconst_0        
	//* 202  382:aload           13
	//* 203  384:invokespecial   #871 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//* 204  387:iadd            
	//* 205  388:istore          8
	//* 206  390:iload           6
	//* 207  392:aload_0         
	//* 208  393:getfield        #396 <Field View mExpandedActionView>
	//* 209  396:invokevirtual   #488 <Method int View.getMeasuredHeight()>
	//* 210  399:aload_0         
	//* 211  400:aload_0         
	//* 212  401:getfield        #396 <Field View mExpandedActionView>
	//* 213  404:invokespecial   #860 <Method int getVerticalMargins(View)>
	//* 214  407:iadd            
	//* 215  408:invokestatic    #511 <Method int Math.max(int, int)>
	//* 216  411:istore          4
	//* 217  413:iload           5
	//* 218  415:aload_0         
	//* 219  416:getfield        #396 <Field View mExpandedActionView>
	//* 220  419:invokevirtual   #872 <Method int View.getMeasuredState()>
	//* 221  422:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//* 222  425:istore_3        
	//* 223  426:iload           8
	//* 224  428:istore          5
	//* 225  430:iload_3         
	//* 226  431:istore          6
	//* 227  433:iload           4
	//* 228  435:istore          7
	//* 229  437:aload_0         
	//* 230  438:aload_0         
	//* 231  439:getfield        #417 <Field ImageView mLogoView>
	//* 232  442:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 233  445:ifeq            504
	//* 234  448:iload           8
	//* 235  450:aload_0         
	//* 236  451:aload_0         
	//* 237  452:getfield        #417 <Field ImageView mLogoView>
	//* 238  455:iload_1         
	//* 239  456:iload           8
	//* 240  458:iload_2         
	//* 241  459:iconst_0        
	//* 242  460:aload           13
	//* 243  462:invokespecial   #871 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//* 244  465:iadd            
	//* 245  466:istore          5
	//* 246  468:iload           4
	//* 247  470:aload_0         
	//* 248  471:getfield        #417 <Field ImageView mLogoView>
	//* 249  474:invokevirtual   #873 <Method int ImageView.getMeasuredHeight()>
	//* 250  477:aload_0         
	//* 251  478:aload_0         
	//* 252  479:getfield        #417 <Field ImageView mLogoView>
	//* 253  482:invokespecial   #860 <Method int getVerticalMargins(View)>
	//* 254  485:iadd            
	//* 255  486:invokestatic    #511 <Method int Math.max(int, int)>
	//* 256  489:istore          7
	//* 257  491:iload_3         
	//* 258  492:aload_0         
	//* 259  493:getfield        #417 <Field ImageView mLogoView>
	//* 260  496:invokevirtual   #874 <Method int ImageView.getMeasuredState()>
	//* 261  499:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//* 262  502:istore          6
	//* 263  504:aload_0         
	//* 264  505:invokevirtual   #348 <Method int getChildCount()>
	//* 265  508:istore          10
	//* 266  510:iconst_0        
	//* 267  511:istore          4
	//* 268  513:iload           7
	//* 269  515:istore          8
	//* 270  517:iload           6
	//* 271  519:istore_3        
	//* 272  520:iload           5
	//* 273  522:istore          7
	//* 274  524:iload           4
	//* 275  526:iload           10
	//* 276  528:icmpge          664
	//* 277  531:aload_0         
	//* 278  532:iload           4
	//* 279  534:invokevirtual   #362 <Method View getChildAt(int)>
	//* 280  537:astore          14
	//* 281  539:iload           7
	//* 282  541:istore          5
	//* 283  543:iload_3         
	//* 284  544:istore          6
	//* 285  546:iload           8
	//* 286  548:istore          9
	//* 287  550:aload           14
	//* 288  552:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 289  555:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 290  558:getfield        #371 <Field int Toolbar$LayoutParams.mViewType>
	//* 291  561:ifne            584
	//* 292  564:aload_0         
	//* 293  565:aload           14
	//* 294  567:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 295  570:ifne            613
	//* 296  573:iload           8
	//* 297  575:istore          9
	//* 298  577:iload_3         
	//* 299  578:istore          6
	//* 300  580:iload           7
	//* 301  582:istore          5
	//* 302  584:iload           4
	//* 303  586:iconst_1        
	//* 304  587:iadd            
	//* 305  588:istore          4
	//* 306  590:iload           5
	//* 307  592:istore          7
	//* 308  594:iload           6
	//* 309  596:istore_3        
	//* 310  597:iload           9
	//* 311  599:istore          8
	//* 312  601:goto            524
		{
			i2 = 0;
	//  313  604:iconst_0        
	//  314  605:istore          9
			l1 = 1;
	//  315  607:iconst_1        
	//  316  608:istore          8
		}
		k1 = 0;
		if(shouldLayout(((View) (mNavButtonView))))
		{
			measureChildConstrained(((View) (mNavButtonView)), i, 0, j, 0, mMaxButtonHeight);
			k1 = mNavButtonView.getMeasuredWidth() + getHorizontalMargins(((View) (mNavButtonView)));
			j1 = Math.max(0, mNavButtonView.getMeasuredHeight() + getVerticalMargins(((View) (mNavButtonView))));
			i1 = View.combineMeasuredStates(0, mNavButtonView.getMeasuredState());
		}
		k = i1;
		l = j1;
		if(shouldLayout(((View) (mCollapseButtonView))))
		{
			measureChildConstrained(((View) (mCollapseButtonView)), i, 0, j, 0, mMaxButtonHeight);
			k1 = mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(((View) (mCollapseButtonView)));
			l = Math.max(j1, mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(((View) (mCollapseButtonView))));
			k = View.combineMeasuredStates(i1, mCollapseButtonView.getMeasuredState());
		}
		i1 = getCurrentContentInsetStart();
		j2 = 0 + Math.max(i1, k1);
		ai[i2] = Math.max(0, i1 - k1);
		k1 = 0;
		i1 = k;
		j1 = l;
		if(shouldLayout(((View) (mMenuView))))
		{
			measureChildConstrained(((View) (mMenuView)), i, j2, j, 0, mMaxButtonHeight);
			k1 = mMenuView.getMeasuredWidth() + getHorizontalMargins(((View) (mMenuView)));
			j1 = Math.max(l, mMenuView.getMeasuredHeight() + getVerticalMargins(((View) (mMenuView))));
			i1 = View.combineMeasuredStates(k, mMenuView.getMeasuredState());
		}
		k = getCurrentContentInsetEnd();
		i2 = j2 + Math.max(k, k1);
		ai[l1] = Math.max(0, k - k1);
		l1 = i2;
		k = i1;
		l = j1;
		if(shouldLayout(mExpandedActionView))
		{
			l1 = i2 + measureChildCollapseMargins(mExpandedActionView, i, i2, j, 0, ai);
			l = Math.max(j1, mExpandedActionView.getMeasuredHeight() + getVerticalMargins(mExpandedActionView));
			k = View.combineMeasuredStates(i1, mExpandedActionView.getMeasuredState());
		}
		i1 = l1;
		j1 = k;
		k1 = l;
		if(shouldLayout(((View) (mLogoView))))
		{
			i1 = l1 + measureChildCollapseMargins(((View) (mLogoView)), i, l1, j, 0, ai);
			k1 = Math.max(l, mLogoView.getMeasuredHeight() + getVerticalMargins(((View) (mLogoView))));
			j1 = View.combineMeasuredStates(k, mLogoView.getMeasuredState());
		}
		j2 = getChildCount();
		l = 0;
		l1 = k1;
		k = j1;
		k1 = i1;
		while(l < j2) 
		{
			View view = getChildAt(l);
			i1 = k1;
			j1 = k;
			i2 = l1;
			if(((LayoutParams)view.getLayoutParams()).mViewType == 0)
				if(!shouldLayout(view))
				{
					i2 = l1;
					j1 = k;
					i1 = k1;
				} else
	//* 317  610:goto            25
				{
					i1 = k1 + measureChildCollapseMargins(view, i, k1, j, 0, ai);
	//  318  613:iload           7
	//  319  615:aload_0         
	//  320  616:aload           14
	//  321  618:iload_1         
	//  322  619:iload           7
	//  323  621:iload_2         
	//  324  622:iconst_0        
	//  325  623:aload           13
	//  326  625:invokespecial   #871 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  327  628:iadd            
	//  328  629:istore          5
					i2 = Math.max(l1, view.getMeasuredHeight() + getVerticalMargins(view));
	//  329  631:iload           8
	//  330  633:aload           14
	//  331  635:invokevirtual   #488 <Method int View.getMeasuredHeight()>
	//  332  638:aload_0         
	//  333  639:aload           14
	//  334  641:invokespecial   #860 <Method int getVerticalMargins(View)>
	//  335  644:iadd            
	//  336  645:invokestatic    #511 <Method int Math.max(int, int)>
	//  337  648:istore          9
					j1 = View.combineMeasuredStates(k, view.getMeasuredState());
	//  338  650:iload_3         
	//  339  651:aload           14
	//  340  653:invokevirtual   #872 <Method int View.getMeasuredState()>
	//  341  656:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//  342  659:istore          6
				}
			l++;
			k1 = i1;
			k = j1;
			l1 = i2;
		}
	//* 343  661:goto            584
		j1 = 0;
	//  344  664:iconst_0        
	//  345  665:istore          6
		i1 = 0;
	//  346  667:iconst_0        
	//  347  668:istore          5
		int k2 = mTitleMarginTop + mTitleMarginBottom;
	//  348  670:aload_0         
	//  349  671:getfield        #186 <Field int mTitleMarginTop>
	//  350  674:aload_0         
	//  351  675:getfield        #184 <Field int mTitleMarginBottom>
	//  352  678:iadd            
	//  353  679:istore          11
		int l2 = mTitleMarginStart + mTitleMarginEnd;
	//  354  681:aload_0         
	//  355  682:getfield        #190 <Field int mTitleMarginStart>
	//  356  685:aload_0         
	//  357  686:getfield        #188 <Field int mTitleMarginEnd>
	//  358  689:iadd            
	//  359  690:istore          12
		l = k;
	//  360  692:iload_3         
	//  361  693:istore          4
		if(shouldLayout(((View) (mTitleTextView))))
	//* 362  695:aload_0         
	//* 363  696:aload_0         
	//* 364  697:getfield        #792 <Field TextView mTitleTextView>
	//* 365  700:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 366  703:ifeq            775
		{
			measureChildCollapseMargins(((View) (mTitleTextView)), i, k1 + l2, j, k2, ai);
	//  367  706:aload_0         
	//  368  707:aload_0         
	//  369  708:getfield        #792 <Field TextView mTitleTextView>
	//  370  711:iload_1         
	//  371  712:iload           7
	//  372  714:iload           12
	//  373  716:iadd            
	//  374  717:iload_2         
	//  375  718:iload           11
	//  376  720:aload           13
	//  377  722:invokespecial   #871 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  378  725:pop             
			j1 = mTitleTextView.getMeasuredWidth() + getHorizontalMargins(((View) (mTitleTextView)));
	//  379  726:aload_0         
	//  380  727:getfield        #792 <Field TextView mTitleTextView>
	//  381  730:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//  382  733:aload_0         
	//  383  734:aload_0         
	//  384  735:getfield        #792 <Field TextView mTitleTextView>
	//  385  738:invokespecial   #857 <Method int getHorizontalMargins(View)>
	//  386  741:iadd            
	//  387  742:istore          6
			i1 = mTitleTextView.getMeasuredHeight() + getVerticalMargins(((View) (mTitleTextView)));
	//  388  744:aload_0         
	//  389  745:getfield        #792 <Field TextView mTitleTextView>
	//  390  748:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//  391  751:aload_0         
	//  392  752:aload_0         
	//  393  753:getfield        #792 <Field TextView mTitleTextView>
	//  394  756:invokespecial   #860 <Method int getVerticalMargins(View)>
	//  395  759:iadd            
	//  396  760:istore          5
			l = View.combineMeasuredStates(k, mTitleTextView.getMeasuredState());
	//  397  762:iload_3         
	//  398  763:aload_0         
	//  399  764:getfield        #792 <Field TextView mTitleTextView>
	//  400  767:invokevirtual   #875 <Method int TextView.getMeasuredState()>
	//  401  770:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//  402  773:istore          4
		}
		i2 = l;
	//  403  775:iload           4
	//  404  777:istore          9
		j2 = i1;
	//  405  779:iload           5
	//  406  781:istore          10
		k = j1;
	//  407  783:iload           6
	//  408  785:istore_3        
		if(shouldLayout(((View) (mSubtitleTextView))))
	//* 409  786:aload_0         
	//* 410  787:aload_0         
	//* 411  788:getfield        #838 <Field TextView mSubtitleTextView>
	//* 412  791:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 413  794:ifeq            860
		{
			k = Math.max(j1, measureChildCollapseMargins(((View) (mSubtitleTextView)), i, k1 + l2, j, i1 + k2, ai));
	//  414  797:iload           6
	//  415  799:aload_0         
	//  416  800:aload_0         
	//  417  801:getfield        #838 <Field TextView mSubtitleTextView>
	//  418  804:iload_1         
	//  419  805:iload           7
	//  420  807:iload           12
	//  421  809:iadd            
	//  422  810:iload_2         
	//  423  811:iload           5
	//  424  813:iload           11
	//  425  815:iadd            
	//  426  816:aload           13
	//  427  818:invokespecial   #871 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  428  821:invokestatic    #511 <Method int Math.max(int, int)>
	//  429  824:istore_3        
			j2 = i1 + (mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(((View) (mSubtitleTextView))));
	//  430  825:iload           5
	//  431  827:aload_0         
	//  432  828:getfield        #838 <Field TextView mSubtitleTextView>
	//  433  831:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//  434  834:aload_0         
	//  435  835:aload_0         
	//  436  836:getfield        #838 <Field TextView mSubtitleTextView>
	//  437  839:invokespecial   #860 <Method int getVerticalMargins(View)>
	//  438  842:iadd            
	//  439  843:iadd            
	//  440  844:istore          10
			i2 = View.combineMeasuredStates(l, mSubtitleTextView.getMeasuredState());
	//  441  846:iload           4
	//  442  848:aload_0         
	//  443  849:getfield        #838 <Field TextView mSubtitleTextView>
	//  444  852:invokevirtual   #875 <Method int TextView.getMeasuredState()>
	//  445  855:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//  446  858:istore          9
		}
		l = Math.max(l1, j2);
	//  447  860:iload           8
	//  448  862:iload           10
	//  449  864:invokestatic    #511 <Method int Math.max(int, int)>
	//  450  867:istore          4
		l1 = getPaddingLeft();
	//  451  869:aload_0         
	//  452  870:invokevirtual   #575 <Method int getPaddingLeft()>
	//  453  873:istore          8
		j2 = getPaddingRight();
	//  454  875:aload_0         
	//  455  876:invokevirtual   #578 <Method int getPaddingRight()>
	//  456  879:istore          10
		i1 = getPaddingTop();
	//  457  881:aload_0         
	//  458  882:invokevirtual   #494 <Method int getPaddingTop()>
	//  459  885:istore          5
		j1 = getPaddingBottom();
	//  460  887:aload_0         
	//  461  888:invokevirtual   #497 <Method int getPaddingBottom()>
	//  462  891:istore          6
		k = View.resolveSizeAndState(Math.max(k1 + k + (l1 + j2), getSuggestedMinimumWidth()), i, 0xff000000 & i2);
	//  463  893:iload           7
	//  464  895:iload_3         
	//  465  896:iadd            
	//  466  897:iload           8
	//  467  899:iload           10
	//  468  901:iadd            
	//  469  902:iadd            
	//  470  903:aload_0         
	//  471  904:invokevirtual   #878 <Method int getSuggestedMinimumWidth()>
	//  472  907:invokestatic    #511 <Method int Math.max(int, int)>
	//  473  910:iload_1         
	//  474  911:ldc2            #879 <Int 0xff000000>
	//  475  914:iload           9
	//  476  916:iand            
	//  477  917:invokestatic    #882 <Method int View.resolveSizeAndState(int, int, int)>
	//  478  920:istore_3        
		i = View.resolveSizeAndState(Math.max(l + (i1 + j1), getSuggestedMinimumHeight()), j, i2 << 16);
	//  479  921:iload           4
	//  480  923:iload           5
	//  481  925:iload           6
	//  482  927:iadd            
	//  483  928:iadd            
	//  484  929:aload_0         
	//  485  930:invokevirtual   #885 <Method int getSuggestedMinimumHeight()>
	//  486  933:invokestatic    #511 <Method int Math.max(int, int)>
	//  487  936:iload_2         
	//  488  937:iload           9
	//  489  939:bipush          16
	//  490  941:ishl            
	//  491  942:invokestatic    #882 <Method int View.resolveSizeAndState(int, int, int)>
	//  492  945:istore_1        
		if(shouldCollapse())
	//* 493  946:aload_0         
	//* 494  947:invokespecial   #887 <Method boolean shouldCollapse()>
	//* 495  950:ifeq            955
			i = 0;
	//  496  953:iconst_0        
	//  497  954:istore_1        
		setMeasuredDimension(k, i);
	//  498  955:aload_0         
	//  499  956:iload_3         
	//  500  957:iload_1         
	//  501  958:invokevirtual   #890 <Method void setMeasuredDimension(int, int)>
	//  502  961:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #21  <Class Toolbar$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #894 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		} else
	//*   6   12:return          
		{
			SavedState savedstate = (SavedState)parcelable;
	//    7   13:aload_1         
	//    8   14:checkcast       #21  <Class Toolbar$SavedState>
	//    9   17:astore_2        
			super.onRestoreInstanceState(savedstate.getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #898 <Method Parcelable Toolbar$SavedState.getSuperState()>
	//   13   23:invokespecial   #894 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			if(mMenuView != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #427 <Field ActionMenuView mMenuView>
	//*  16   30:ifnull          93
				parcelable = ((Parcelable) (mMenuView.peekMenu()));
	//   17   33:aload_0         
	//   18   34:getfield        #427 <Field ActionMenuView mMenuView>
	//   19   37:invokevirtual   #433 <Method MenuBuilder ActionMenuView.peekMenu()>
	//   20   40:astore_1        
			else
	//*  21   41:aload_2         
	//*  22   42:getfield        #901 <Field int Toolbar$SavedState.expandedMenuItemId>
	//*  23   45:ifeq            81
	//*  24   48:aload_0         
	//*  25   49:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//*  26   52:ifnull          81
	//*  27   55:aload_1         
	//*  28   56:ifnull          81
	//*  29   59:aload_1         
	//*  30   60:aload_2         
	//*  31   61:getfield        #901 <Field int Toolbar$SavedState.expandedMenuItemId>
	//*  32   64:invokeinterface #907 <Method MenuItem Menu.findItem(int)>
	//*  33   69:astore_1        
	//*  34   70:aload_1         
	//*  35   71:ifnull          81
	//*  36   74:aload_1         
	//*  37   75:invokeinterface #912 <Method boolean MenuItem.expandActionView()>
	//*  38   80:pop             
	//*  39   81:aload_2         
	//*  40   82:getfield        #915 <Field boolean Toolbar$SavedState.isOverflowOpen>
	//*  41   85:ifeq            12
	//*  42   88:aload_0         
	//*  43   89:invokespecial   #917 <Method void postShowOverflowMenu()>
	//*  44   92:return          
				parcelable = null;
	//   45   93:aconst_null     
	//   46   94:astore_1        
			if(savedstate.expandedMenuItemId != 0 && mExpandedMenuPresenter != null && parcelable != null)
			{
				parcelable = ((Parcelable) (((Menu) (parcelable)).findItem(savedstate.expandedMenuItemId)));
				if(parcelable != null)
					((MenuItem) (parcelable)).expandActionView();
			}
			if(savedstate.isOverflowOpen)
			{
				postShowOverflowMenu();
				return;
			}
		}
	//*  47   95:goto            41
	}

	public void onRtlPropertiesChanged(int i)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   2    2:getstatic       #923 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    5:bipush          17
	//*   4    7:icmplt          15
			super.onRtlPropertiesChanged(i);
	//    5   10:aload_0         
	//    6   11:iload_1         
	//    7   12:invokespecial   #925 <Method void ViewGroup.onRtlPropertiesChanged(int)>
		ensureContentInsets();
	//    8   15:aload_0         
	//    9   16:invokespecial   #226 <Method void ensureContentInsets()>
		RtlSpacingHelper rtlspacinghelper = mContentInsets;
	//   10   19:aload_0         
	//   11   20:getfield        #228 <Field RtlSpacingHelper mContentInsets>
	//   12   23:astore_3        
		if(i != 1)
	//*  13   24:iload_1         
	//*  14   25:iconst_1        
	//*  15   26:icmpne          35
	//*  16   29:aload_3         
	//*  17   30:iload_2         
	//*  18   31:invokevirtual   #928 <Method void RtlSpacingHelper.setDirection(boolean)>
	//*  19   34:return          
			flag = false;
	//   20   35:iconst_0        
	//   21   36:istore_2        
		rtlspacinghelper.setDirection(flag);
	//*  22   37:goto            29
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #21  <Class Toolbar$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #931 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #933 <Method void Toolbar$SavedState(Parcelable)>
	//    5   11:astore_1        
		if(mExpandedMenuPresenter != null && mExpandedMenuPresenter.mCurrentExpandedItem != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//*   8   16:ifnull          43
	//*   9   19:aload_0         
	//*  10   20:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//*  11   23:getfield        #650 <Field MenuItemImpl Toolbar$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
	//*  12   26:ifnull          43
			savedstate.expandedMenuItemId = mExpandedMenuPresenter.mCurrentExpandedItem.getItemId();
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   16   34:getfield        #650 <Field MenuItemImpl Toolbar$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
	//   17   37:invokevirtual   #936 <Method int MenuItemImpl.getItemId()>
	//   18   40:putfield        #901 <Field int Toolbar$SavedState.expandedMenuItemId>
		savedstate.isOverflowOpen = isOverflowMenuShowing();
	//   19   43:aload_1         
	//   20   44:aload_0         
	//   21   45:invokevirtual   #937 <Method boolean isOverflowMenuShowing()>
	//   22   48:putfield        #915 <Field boolean Toolbar$SavedState.isOverflowOpen>
		return ((Parcelable) (savedstate));
	//   23   51:aload_1         
	//   24   52:areturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #816 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            14
			mEatingTouch = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #940 <Field boolean mEatingTouch>
		if(!mEatingTouch)
	//*   8   14:aload_0         
	//*   9   15:getfield        #940 <Field boolean mEatingTouch>
	//*  10   18:ifne            40
		{
			boolean flag = super.onTouchEvent(motionevent);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #942 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//   14   26:istore_3        
			if(i == 0 && !flag)
	//*  15   27:iload_2         
	//*  16   28:ifne            40
	//*  17   31:iload_3         
	//*  18   32:ifne            40
				mEatingTouch = true;
	//   19   35:aload_0         
	//   20   36:iconst_1        
	//   21   37:putfield        #940 <Field boolean mEatingTouch>
		}
		if(i == 1 || i == 3)
	//*  22   40:iload_2         
	//*  23   41:iconst_1        
	//*  24   42:icmpeq          50
	//*  25   45:iload_2         
	//*  26   46:iconst_3        
	//*  27   47:icmpne          55
			mEatingTouch = false;
	//   28   50:aload_0         
	//   29   51:iconst_0        
	//   30   52:putfield        #940 <Field boolean mEatingTouch>
		return true;
	//   31   55:iconst_1        
	//   32   56:ireturn         
	}

	void removeChildrenForExpandedActionView()
	{
		for(int i = getChildCount() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #348 <Method int getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iflt            60
		{
			View view = getChildAt(i);
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:invokevirtual   #362 <Method View getChildAt(int)>
	//   10   16:astore_2        
			if(((LayoutParams)view.getLayoutParams()).mViewType != 2 && view != mMenuView)
	//*  11   17:aload_2         
	//*  12   18:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  13   21:checkcast       #15  <Class Toolbar$LayoutParams>
	//*  14   24:getfield        #371 <Field int Toolbar$LayoutParams.mViewType>
	//*  15   27:iconst_2        
	//*  16   28:icmpeq          53
	//*  17   31:aload_2         
	//*  18   32:aload_0         
	//*  19   33:getfield        #427 <Field ActionMenuView mMenuView>
	//*  20   36:if_acmpeq       53
			{
				removeViewAt(i);
	//   21   39:aload_0         
	//   22   40:iload_1         
	//   23   41:invokevirtual   #946 <Method void removeViewAt(int)>
				mHiddenViews.add(((Object) (view)));
	//   24   44:aload_0         
	//   25   45:getfield        #120 <Field ArrayList mHiddenViews>
	//   26   48:aload_2         
	//   27   49:invokevirtual   #401 <Method boolean ArrayList.add(Object)>
	//   28   52:pop             
			}
		}

	//   29   53:iload_1         
	//   30   54:iconst_1        
	//   31   55:isub            
	//   32   56:istore_1        
	//*  33   57:goto            7
	//   34   60:return          
	}

	public void setCollapsible(boolean flag)
	{
		mCollapsible = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #620 <Field boolean mCollapsible>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #950 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setContentInsetEndWithActions(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < 0)
	//*   2    2:iload_1         
	//*   3    3:ifge            9
			j = 0x80000000;
	//    4    6:ldc1            #214 <Int 0x80000000>
	//    5    8:istore_2        
		if(j != mContentInsetEndWithActions)
	//*   6    9:iload_2         
	//*   7   10:aload_0         
	//*   8   11:getfield        #247 <Field int mContentInsetEndWithActions>
	//*   9   14:icmpeq          33
		{
			mContentInsetEndWithActions = j;
	//   10   17:aload_0         
	//   11   18:iload_2         
	//   12   19:putfield        #247 <Field int mContentInsetEndWithActions>
			if(getNavigationIcon() != null)
	//*  13   22:aload_0         
	//*  14   23:invokevirtual   #725 <Method Drawable getNavigationIcon()>
	//*  15   26:ifnull          33
				requestLayout();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #950 <Method void requestLayout()>
		}
	//   18   33:return          
	}

	public void setContentInsetStartWithNavigation(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < 0)
	//*   2    2:iload_1         
	//*   3    3:ifge            9
			j = 0x80000000;
	//    4    6:ldc1            #214 <Int 0x80000000>
	//    5    8:istore_2        
		if(j != mContentInsetStartWithNavigation)
	//*   6    9:iload_2         
	//*   7   10:aload_0         
	//*   8   11:getfield        #242 <Field int mContentInsetStartWithNavigation>
	//*   9   14:icmpeq          33
		{
			mContentInsetStartWithNavigation = j;
	//   10   17:aload_0         
	//   11   18:iload_2         
	//   12   19:putfield        #242 <Field int mContentInsetStartWithNavigation>
			if(getNavigationIcon() != null)
	//*  13   22:aload_0         
	//*  14   23:invokevirtual   #725 <Method Drawable getNavigationIcon()>
	//*  15   26:ifnull          33
				requestLayout();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #950 <Method void requestLayout()>
		}
	//   18   33:return          
	}

	public void setContentInsetsAbsolute(int i, int j)
	{
		ensureContentInsets();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method void ensureContentInsets()>
		mContentInsets.setAbsolute(i, j);
	//    2    4:aload_0         
	//    3    5:getfield        #228 <Field RtlSpacingHelper mContentInsets>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #234 <Method void RtlSpacingHelper.setAbsolute(int, int)>
	//    7   13:return          
	}

	public void setContentInsetsRelative(int i, int j)
	{
		ensureContentInsets();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method void ensureContentInsets()>
		mContentInsets.setRelative(i, j);
	//    2    4:aload_0         
	//    3    5:getfield        #228 <Field RtlSpacingHelper mContentInsets>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #237 <Method void RtlSpacingHelper.setRelative(int, int)>
	//    7   13:return          
	}

	public void setLogo(int i)
	{
		setLogo(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #134 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #960 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #312 <Method void setLogo(Drawable)>
	//    6   12:return          
	}

	public void setLogo(Drawable drawable)
	{
		if(drawable == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          44
_L1:
		ensureLogoView();
	//    2    4:aload_0         
	//    3    5:invokespecial   #962 <Method void ensureLogoView()>
		if(!isChildOrHidden(((View) (mLogoView))))
	//*   4    8:aload_0         
	//*   5    9:aload_0         
	//*   6   10:getfield        #417 <Field ImageView mLogoView>
	//*   7   13:invokespecial   #964 <Method boolean isChildOrHidden(View)>
	//*   8   16:ifne            28
			addSystemView(((View) (mLogoView)), true);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #417 <Field ImageView mLogoView>
	//   12   24:iconst_1        
	//   13   25:invokespecial   #470 <Method void addSystemView(View, boolean)>
_L4:
		if(mLogoView != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #417 <Field ImageView mLogoView>
	//*  16   32:ifnull          43
			mLogoView.setImageDrawable(drawable);
	//   17   35:aload_0         
	//   18   36:getfield        #417 <Field ImageView mLogoView>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #965 <Method void ImageView.setImageDrawable(Drawable)>
		return;
	//   21   43:return          
_L2:
		if(mLogoView != null && isChildOrHidden(((View) (mLogoView))))
	//*  22   44:aload_0         
	//*  23   45:getfield        #417 <Field ImageView mLogoView>
	//*  24   48:ifnull          28
	//*  25   51:aload_0         
	//*  26   52:aload_0         
	//*  27   53:getfield        #417 <Field ImageView mLogoView>
	//*  28   56:invokespecial   #964 <Method boolean isChildOrHidden(View)>
	//*  29   59:ifeq            28
		{
			removeView(((View) (mLogoView)));
	//   30   62:aload_0         
	//   31   63:aload_0         
	//   32   64:getfield        #417 <Field ImageView mLogoView>
	//   33   67:invokevirtual   #968 <Method void removeView(View)>
			mHiddenViews.remove(((Object) (mLogoView)));
	//   34   70:aload_0         
	//   35   71:getfield        #120 <Field ArrayList mHiddenViews>
	//   36   74:aload_0         
	//   37   75:getfield        #417 <Field ImageView mLogoView>
	//   38   78:invokevirtual   #971 <Method boolean ArrayList.remove(Object)>
	//   39   81:pop             
		}
		if(true) goto _L4; else goto _L3
	//   40   82:goto            28
_L3:
	}

	public void setLogoDescription(int i)
	{
		setLogoDescription(getContext().getText(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #134 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #975 <Method CharSequence Context.getText(int)>
	//    5    9:invokevirtual   #318 <Method void setLogoDescription(CharSequence)>
	//    6   12:return          
	}

	public void setLogoDescription(CharSequence charsequence)
	{
		if(!TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #274 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            11
			ensureLogoView();
	//    3    7:aload_0         
	//    4    8:invokespecial   #962 <Method void ensureLogoView()>
		if(mLogoView != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #417 <Field ImageView mLogoView>
	//*   7   15:ifnull          26
			mLogoView.setContentDescription(charsequence);
	//    8   18:aload_0         
	//    9   19:getfield        #417 <Field ImageView mLogoView>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #976 <Method void ImageView.setContentDescription(CharSequence)>
	//   12   26:return          
	}

	public void setMenu(MenuBuilder menubuilder, ActionMenuPresenter actionmenupresenter)
	{
		if(menubuilder != null || mMenuView != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
	//*   2    4:aload_0         
	//*   3    5:getfield        #427 <Field ActionMenuView mMenuView>
	//*   4    8:ifnonnull       12
	//*   5   11:return          
		{
			ensureMenuView();
	//    6   12:aload_0         
	//    7   13:invokespecial   #425 <Method void ensureMenuView()>
			MenuBuilder menubuilder1 = mMenuView.peekMenu();
	//    8   16:aload_0         
	//    9   17:getfield        #427 <Field ActionMenuView mMenuView>
	//   10   20:invokevirtual   #433 <Method MenuBuilder ActionMenuView.peekMenu()>
	//   11   23:astore_3        
			if(menubuilder1 != menubuilder)
	//*  12   24:aload_3         
	//*  13   25:aload_1         
	//*  14   26:if_acmpeq       11
			{
				if(menubuilder1 != null)
	//*  15   29:aload_3         
	//*  16   30:ifnull          49
				{
					menubuilder1.removeMenuPresenter(((MenuPresenter) (mOuterActionMenuPresenter)));
	//   17   33:aload_3         
	//   18   34:aload_0         
	//   19   35:getfield        #744 <Field ActionMenuPresenter mOuterActionMenuPresenter>
	//   20   38:invokevirtual   #982 <Method void MenuBuilder.removeMenuPresenter(MenuPresenter)>
					menubuilder1.removeMenuPresenter(((MenuPresenter) (mExpandedMenuPresenter)));
	//   21   41:aload_3         
	//   22   42:aload_0         
	//   23   43:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   24   46:invokevirtual   #982 <Method void MenuBuilder.removeMenuPresenter(MenuPresenter)>
				}
				if(mExpandedMenuPresenter == null)
	//*  25   49:aload_0         
	//*  26   50:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//*  27   53:ifnonnull       68
					mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
	//   28   56:aload_0         
	//   29   57:new             #12  <Class Toolbar$ExpandedActionViewMenuPresenter>
	//   30   60:dup             
	//   31   61:aload_0         
	//   32   62:invokespecial   #442 <Method void Toolbar$ExpandedActionViewMenuPresenter(Toolbar)>
	//   33   65:putfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
				actionmenupresenter.setExpandedActionViewsExclusive(true);
	//   34   68:aload_2         
	//   35   69:iconst_1        
	//   36   70:invokevirtual   #985 <Method void ActionMenuPresenter.setExpandedActionViewsExclusive(boolean)>
				if(menubuilder != null)
	//*  37   73:aload_1         
	//*  38   74:ifnull          123
				{
					menubuilder.addMenuPresenter(((MenuPresenter) (actionmenupresenter)), mPopupContext);
	//   39   77:aload_1         
	//   40   78:aload_2         
	//   41   79:aload_0         
	//   42   80:getfield        #286 <Field Context mPopupContext>
	//   43   83:invokevirtual   #450 <Method void MenuBuilder.addMenuPresenter(MenuPresenter, Context)>
					menubuilder.addMenuPresenter(((MenuPresenter) (mExpandedMenuPresenter)), mPopupContext);
	//   44   86:aload_1         
	//   45   87:aload_0         
	//   46   88:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   47   91:aload_0         
	//   48   92:getfield        #286 <Field Context mPopupContext>
	//   49   95:invokevirtual   #450 <Method void MenuBuilder.addMenuPresenter(MenuPresenter, Context)>
				} else
	//*  50   98:aload_0         
	//*  51   99:getfield        #427 <Field ActionMenuView mMenuView>
	//*  52  102:aload_0         
	//*  53  103:getfield        #453 <Field int mPopupTheme>
	//*  54  106:invokevirtual   #454 <Method void ActionMenuView.setPopupTheme(int)>
	//*  55  109:aload_0         
	//*  56  110:getfield        #427 <Field ActionMenuView mMenuView>
	//*  57  113:aload_2         
	//*  58  114:invokevirtual   #989 <Method void ActionMenuView.setPresenter(ActionMenuPresenter)>
	//*  59  117:aload_0         
	//*  60  118:aload_2         
	//*  61  119:putfield        #744 <Field ActionMenuPresenter mOuterActionMenuPresenter>
	//*  62  122:return          
				{
					actionmenupresenter.initForMenu(mPopupContext, ((MenuBuilder) (null)));
	//   63  123:aload_2         
	//   64  124:aload_0         
	//   65  125:getfield        #286 <Field Context mPopupContext>
	//   66  128:aconst_null     
	//   67  129:invokevirtual   #993 <Method void ActionMenuPresenter.initForMenu(Context, MenuBuilder)>
					mExpandedMenuPresenter.initForMenu(mPopupContext, ((MenuBuilder) (null)));
	//   68  132:aload_0         
	//   69  133:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   70  136:aload_0         
	//   71  137:getfield        #286 <Field Context mPopupContext>
	//   72  140:aconst_null     
	//   73  141:invokevirtual   #994 <Method void Toolbar$ExpandedActionViewMenuPresenter.initForMenu(Context, MenuBuilder)>
					actionmenupresenter.updateMenuView(true);
	//   74  144:aload_2         
	//   75  145:iconst_1        
	//   76  146:invokevirtual   #997 <Method void ActionMenuPresenter.updateMenuView(boolean)>
					mExpandedMenuPresenter.updateMenuView(true);
	//   77  149:aload_0         
	//   78  150:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   79  153:iconst_1        
	//   80  154:invokevirtual   #998 <Method void Toolbar$ExpandedActionViewMenuPresenter.updateMenuView(boolean)>
				}
				mMenuView.setPopupTheme(mPopupTheme);
				mMenuView.setPresenter(actionmenupresenter);
				mOuterActionMenuPresenter = actionmenupresenter;
				return;
			}
		}
	//*  81  157:goto            98
	}

	public void setMenuCallbacks(android.support.v7.view.menu.MenuPresenter.Callback callback, android.support.v7.view.menu.MenuBuilder.Callback callback1)
	{
		mActionMenuPresenterCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #460 <Field android.support.v7.view.menu.MenuPresenter$Callback mActionMenuPresenterCallback>
		mMenuBuilderCallback = callback1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #462 <Field android.support.v7.view.menu.MenuBuilder$Callback mMenuBuilderCallback>
		if(mMenuView != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #427 <Field ActionMenuView mMenuView>
	//*   8   14:ifnull          26
			mMenuView.setMenuCallbacks(callback, callback1);
	//    9   17:aload_0         
	//   10   18:getfield        #427 <Field ActionMenuView mMenuView>
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #466 <Method void ActionMenuView.setMenuCallbacks(android.support.v7.view.menu.MenuPresenter$Callback, android.support.v7.view.menu.MenuBuilder$Callback)>
	//   14   26:return          
	}

	public void setNavigationContentDescription(int i)
	{
		CharSequence charsequence;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
			charsequence = getContext().getText(i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #134 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #975 <Method CharSequence Context.getText(int)>
	//    6   12:astore_2        
		else
	//*   7   13:aload_0         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #306 <Method void setNavigationContentDescription(CharSequence)>
	//*  10   18:return          
			charsequence = null;
	//   11   19:aconst_null     
	//   12   20:astore_2        
		setNavigationContentDescription(charsequence);
	//*  13   21:goto            13
	}

	public void setNavigationContentDescription(CharSequence charsequence)
	{
		if(!TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #274 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            11
			ensureNavButtonView();
	//    3    7:aload_0         
	//    4    8:invokespecial   #1000 <Method void ensureNavButtonView()>
		if(mNavButtonView != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #473 <Field ImageButton mNavButtonView>
	//*   7   15:ifnull          26
			mNavButtonView.setContentDescription(charsequence);
	//    8   18:aload_0         
	//    9   19:getfield        #473 <Field ImageButton mNavButtonView>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #662 <Method void ImageButton.setContentDescription(CharSequence)>
	//   12   26:return          
	}

	public void setNavigationIcon(int i)
	{
		setNavigationIcon(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #134 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #960 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #300 <Method void setNavigationIcon(Drawable)>
	//    6   12:return          
	}

	public void setNavigationIcon(Drawable drawable)
	{
		if(drawable == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          44
_L1:
		ensureNavButtonView();
	//    2    4:aload_0         
	//    3    5:invokespecial   #1000 <Method void ensureNavButtonView()>
		if(!isChildOrHidden(((View) (mNavButtonView))))
	//*   4    8:aload_0         
	//*   5    9:aload_0         
	//*   6   10:getfield        #473 <Field ImageButton mNavButtonView>
	//*   7   13:invokespecial   #964 <Method boolean isChildOrHidden(View)>
	//*   8   16:ifne            28
			addSystemView(((View) (mNavButtonView)), true);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #473 <Field ImageButton mNavButtonView>
	//   12   24:iconst_1        
	//   13   25:invokespecial   #470 <Method void addSystemView(View, boolean)>
_L4:
		if(mNavButtonView != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #473 <Field ImageButton mNavButtonView>
	//*  16   32:ifnull          43
			mNavButtonView.setImageDrawable(drawable);
	//   17   35:aload_0         
	//   18   36:getfield        #473 <Field ImageButton mNavButtonView>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #659 <Method void ImageButton.setImageDrawable(Drawable)>
		return;
	//   21   43:return          
_L2:
		if(mNavButtonView != null && isChildOrHidden(((View) (mNavButtonView))))
	//*  22   44:aload_0         
	//*  23   45:getfield        #473 <Field ImageButton mNavButtonView>
	//*  24   48:ifnull          28
	//*  25   51:aload_0         
	//*  26   52:aload_0         
	//*  27   53:getfield        #473 <Field ImageButton mNavButtonView>
	//*  28   56:invokespecial   #964 <Method boolean isChildOrHidden(View)>
	//*  29   59:ifeq            28
		{
			removeView(((View) (mNavButtonView)));
	//   30   62:aload_0         
	//   31   63:aload_0         
	//   32   64:getfield        #473 <Field ImageButton mNavButtonView>
	//   33   67:invokevirtual   #968 <Method void removeView(View)>
			mHiddenViews.remove(((Object) (mNavButtonView)));
	//   34   70:aload_0         
	//   35   71:getfield        #120 <Field ArrayList mHiddenViews>
	//   36   74:aload_0         
	//   37   75:getfield        #473 <Field ImageButton mNavButtonView>
	//   38   78:invokevirtual   #971 <Method boolean ArrayList.remove(Object)>
	//   39   81:pop             
		}
		if(true) goto _L4; else goto _L3
	//   40   82:goto            28
_L3:
	}

	public void setNavigationOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		ensureNavButtonView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1000 <Method void ensureNavButtonView()>
		mNavButtonView.setOnClickListener(onclicklistener);
	//    2    4:aload_0         
	//    3    5:getfield        #473 <Field ImageButton mNavButtonView>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #667 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
	//    6   12:return          
	}

	public void setOnMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener)
	{
		mOnMenuItemClickListener = onmenuitemclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1004 <Field Toolbar$OnMenuItemClickListener mOnMenuItemClickListener>
	//    3    5:return          
	}

	public void setOverflowIcon(Drawable drawable)
	{
		ensureMenu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #737 <Method void ensureMenu()>
		mMenuView.setOverflowIcon(drawable);
	//    2    4:aload_0         
	//    3    5:getfield        #427 <Field ActionMenuView mMenuView>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1007 <Method void ActionMenuView.setOverflowIcon(Drawable)>
	//    6   12:return          
	}

	public void setPopupTheme(int i)
	{
label0:
		{
			if(mPopupTheme != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #453 <Field int mPopupTheme>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          25
			{
				mPopupTheme = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #453 <Field int mPopupTheme>
				if(i != 0)
					break label0;
	//    7   13:iload_1         
	//    8   14:ifne            26
				mPopupContext = getContext();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #134 <Method Context getContext()>
	//   12   22:putfield        #286 <Field Context mPopupContext>
			}
			return;
	//   13   25:return          
		}
		mPopupContext = ((Context) (new ContextThemeWrapper(getContext(), i)));
	//   14   26:aload_0         
	//   15   27:new             #1010 <Class ContextThemeWrapper>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:invokevirtual   #134 <Method Context getContext()>
	//   19   35:iload_1         
	//   20   36:invokespecial   #1013 <Method void ContextThemeWrapper(Context, int)>
	//   21   39:putfield        #286 <Field Context mPopupContext>
	//   22   42:return          
	}

	public void setSubtitle(int i)
	{
		setSubtitle(getContext().getText(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #134 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #975 <Method CharSequence Context.getText(int)>
	//    5    9:invokevirtual   #284 <Method void setSubtitle(CharSequence)>
	//    6   12:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		if(TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokestatic    #274 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:ifne            126
_L1:
		if(mSubtitleTextView == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #838 <Field TextView mSubtitleTextView>
	//*   5   11:ifnonnull       85
		{
			Context context = getContext();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #134 <Method Context getContext()>
	//    8   18:astore_2        
			mSubtitleTextView = ((TextView) (new AppCompatTextView(context)));
	//    9   19:aload_0         
	//   10   20:new             #1015 <Class AppCompatTextView>
	//   11   23:dup             
	//   12   24:aload_2         
	//   13   25:invokespecial   #1016 <Method void AppCompatTextView(Context)>
	//   14   28:putfield        #838 <Field TextView mSubtitleTextView>
			mSubtitleTextView.setSingleLine();
	//   15   31:aload_0         
	//   16   32:getfield        #838 <Field TextView mSubtitleTextView>
	//   17   35:invokevirtual   #1019 <Method void TextView.setSingleLine()>
			mSubtitleTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//   18   38:aload_0         
	//   19   39:getfield        #838 <Field TextView mSubtitleTextView>
	//   20   42:getstatic       #1025 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//   21   45:invokevirtual   #1029 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
			if(mSubtitleTextAppearance != 0)
	//*  22   48:aload_0         
	//*  23   49:getfield        #158 <Field int mSubtitleTextAppearance>
	//*  24   52:ifeq            67
				mSubtitleTextView.setTextAppearance(context, mSubtitleTextAppearance);
	//   25   55:aload_0         
	//   26   56:getfield        #838 <Field TextView mSubtitleTextView>
	//   27   59:aload_2         
	//   28   60:aload_0         
	//   29   61:getfield        #158 <Field int mSubtitleTextAppearance>
	//   30   64:invokevirtual   #1032 <Method void TextView.setTextAppearance(Context, int)>
			if(mSubtitleTextColor != 0)
	//*  31   67:aload_0         
	//*  32   68:getfield        #1034 <Field int mSubtitleTextColor>
	//*  33   71:ifeq            85
				mSubtitleTextView.setTextColor(mSubtitleTextColor);
	//   34   74:aload_0         
	//   35   75:getfield        #838 <Field TextView mSubtitleTextView>
	//   36   78:aload_0         
	//   37   79:getfield        #1034 <Field int mSubtitleTextColor>
	//   38   82:invokevirtual   #1037 <Method void TextView.setTextColor(int)>
		}
		if(!isChildOrHidden(((View) (mSubtitleTextView))))
	//*  39   85:aload_0         
	//*  40   86:aload_0         
	//*  41   87:getfield        #838 <Field TextView mSubtitleTextView>
	//*  42   90:invokespecial   #964 <Method boolean isChildOrHidden(View)>
	//*  43   93:ifne            105
			addSystemView(((View) (mSubtitleTextView)), true);
	//   44   96:aload_0         
	//   45   97:aload_0         
	//   46   98:getfield        #838 <Field TextView mSubtitleTextView>
	//   47  101:iconst_1        
	//   48  102:invokespecial   #470 <Method void addSystemView(View, boolean)>
_L4:
		if(mSubtitleTextView != null)
	//*  49  105:aload_0         
	//*  50  106:getfield        #838 <Field TextView mSubtitleTextView>
	//*  51  109:ifnull          120
			mSubtitleTextView.setText(charsequence);
	//   52  112:aload_0         
	//   53  113:getfield        #838 <Field TextView mSubtitleTextView>
	//   54  116:aload_1         
	//   55  117:invokevirtual   #1040 <Method void TextView.setText(CharSequence)>
		mSubtitleText = charsequence;
	//   56  120:aload_0         
	//   57  121:aload_1         
	//   58  122:putfield        #752 <Field CharSequence mSubtitleText>
		return;
	//   59  125:return          
_L2:
		if(mSubtitleTextView != null && isChildOrHidden(((View) (mSubtitleTextView))))
	//*  60  126:aload_0         
	//*  61  127:getfield        #838 <Field TextView mSubtitleTextView>
	//*  62  130:ifnull          105
	//*  63  133:aload_0         
	//*  64  134:aload_0         
	//*  65  135:getfield        #838 <Field TextView mSubtitleTextView>
	//*  66  138:invokespecial   #964 <Method boolean isChildOrHidden(View)>
	//*  67  141:ifeq            105
		{
			removeView(((View) (mSubtitleTextView)));
	//   68  144:aload_0         
	//   69  145:aload_0         
	//   70  146:getfield        #838 <Field TextView mSubtitleTextView>
	//   71  149:invokevirtual   #968 <Method void removeView(View)>
			mHiddenViews.remove(((Object) (mSubtitleTextView)));
	//   72  152:aload_0         
	//   73  153:getfield        #120 <Field ArrayList mHiddenViews>
	//   74  156:aload_0         
	//   75  157:getfield        #838 <Field TextView mSubtitleTextView>
	//   76  160:invokevirtual   #971 <Method boolean ArrayList.remove(Object)>
	//   77  163:pop             
		}
		if(true) goto _L4; else goto _L3
	//   78  164:goto            105
_L3:
	}

	public void setSubtitleTextAppearance(Context context, int i)
	{
		mSubtitleTextAppearance = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #158 <Field int mSubtitleTextAppearance>
		if(mSubtitleTextView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #838 <Field TextView mSubtitleTextView>
	//*   5    9:ifnull          21
			mSubtitleTextView.setTextAppearance(context, i);
	//    6   12:aload_0         
	//    7   13:getfield        #838 <Field TextView mSubtitleTextView>
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:invokevirtual   #1032 <Method void TextView.setTextAppearance(Context, int)>
	//   11   21:return          
	}

	public void setSubtitleTextColor(int i)
	{
		mSubtitleTextColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #1034 <Field int mSubtitleTextColor>
		if(mSubtitleTextView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #838 <Field TextView mSubtitleTextView>
	//*   5    9:ifnull          20
			mSubtitleTextView.setTextColor(i);
	//    6   12:aload_0         
	//    7   13:getfield        #838 <Field TextView mSubtitleTextView>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #1037 <Method void TextView.setTextColor(int)>
	//   10   20:return          
	}

	public void setTitle(int i)
	{
		setTitle(getContext().getText(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #134 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #975 <Method CharSequence Context.getText(int)>
	//    5    9:invokevirtual   #278 <Method void setTitle(CharSequence)>
	//    6   12:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		if(TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokestatic    #274 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:ifne            126
_L1:
		if(mTitleTextView == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #792 <Field TextView mTitleTextView>
	//*   5   11:ifnonnull       85
		{
			Context context = getContext();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #134 <Method Context getContext()>
	//    8   18:astore_2        
			mTitleTextView = ((TextView) (new AppCompatTextView(context)));
	//    9   19:aload_0         
	//   10   20:new             #1015 <Class AppCompatTextView>
	//   11   23:dup             
	//   12   24:aload_2         
	//   13   25:invokespecial   #1016 <Method void AppCompatTextView(Context)>
	//   14   28:putfield        #792 <Field TextView mTitleTextView>
			mTitleTextView.setSingleLine();
	//   15   31:aload_0         
	//   16   32:getfield        #792 <Field TextView mTitleTextView>
	//   17   35:invokevirtual   #1019 <Method void TextView.setSingleLine()>
			mTitleTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//   18   38:aload_0         
	//   19   39:getfield        #792 <Field TextView mTitleTextView>
	//   20   42:getstatic       #1025 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//   21   45:invokevirtual   #1029 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
			if(mTitleTextAppearance != 0)
	//*  22   48:aload_0         
	//*  23   49:getfield        #153 <Field int mTitleTextAppearance>
	//*  24   52:ifeq            67
				mTitleTextView.setTextAppearance(context, mTitleTextAppearance);
	//   25   55:aload_0         
	//   26   56:getfield        #792 <Field TextView mTitleTextView>
	//   27   59:aload_2         
	//   28   60:aload_0         
	//   29   61:getfield        #153 <Field int mTitleTextAppearance>
	//   30   64:invokevirtual   #1032 <Method void TextView.setTextAppearance(Context, int)>
			if(mTitleTextColor != 0)
	//*  31   67:aload_0         
	//*  32   68:getfield        #1044 <Field int mTitleTextColor>
	//*  33   71:ifeq            85
				mTitleTextView.setTextColor(mTitleTextColor);
	//   34   74:aload_0         
	//   35   75:getfield        #792 <Field TextView mTitleTextView>
	//   36   78:aload_0         
	//   37   79:getfield        #1044 <Field int mTitleTextColor>
	//   38   82:invokevirtual   #1037 <Method void TextView.setTextColor(int)>
		}
		if(!isChildOrHidden(((View) (mTitleTextView))))
	//*  39   85:aload_0         
	//*  40   86:aload_0         
	//*  41   87:getfield        #792 <Field TextView mTitleTextView>
	//*  42   90:invokespecial   #964 <Method boolean isChildOrHidden(View)>
	//*  43   93:ifne            105
			addSystemView(((View) (mTitleTextView)), true);
	//   44   96:aload_0         
	//   45   97:aload_0         
	//   46   98:getfield        #792 <Field TextView mTitleTextView>
	//   47  101:iconst_1        
	//   48  102:invokespecial   #470 <Method void addSystemView(View, boolean)>
_L4:
		if(mTitleTextView != null)
	//*  49  105:aload_0         
	//*  50  106:getfield        #792 <Field TextView mTitleTextView>
	//*  51  109:ifnull          120
			mTitleTextView.setText(charsequence);
	//   52  112:aload_0         
	//   53  113:getfield        #792 <Field TextView mTitleTextView>
	//   54  116:aload_1         
	//   55  117:invokevirtual   #1040 <Method void TextView.setText(CharSequence)>
		mTitleText = charsequence;
	//   56  120:aload_0         
	//   57  121:aload_1         
	//   58  122:putfield        #755 <Field CharSequence mTitleText>
		return;
	//   59  125:return          
_L2:
		if(mTitleTextView != null && isChildOrHidden(((View) (mTitleTextView))))
	//*  60  126:aload_0         
	//*  61  127:getfield        #792 <Field TextView mTitleTextView>
	//*  62  130:ifnull          105
	//*  63  133:aload_0         
	//*  64  134:aload_0         
	//*  65  135:getfield        #792 <Field TextView mTitleTextView>
	//*  66  138:invokespecial   #964 <Method boolean isChildOrHidden(View)>
	//*  67  141:ifeq            105
		{
			removeView(((View) (mTitleTextView)));
	//   68  144:aload_0         
	//   69  145:aload_0         
	//   70  146:getfield        #792 <Field TextView mTitleTextView>
	//   71  149:invokevirtual   #968 <Method void removeView(View)>
			mHiddenViews.remove(((Object) (mTitleTextView)));
	//   72  152:aload_0         
	//   73  153:getfield        #120 <Field ArrayList mHiddenViews>
	//   74  156:aload_0         
	//   75  157:getfield        #792 <Field TextView mTitleTextView>
	//   76  160:invokevirtual   #971 <Method boolean ArrayList.remove(Object)>
	//   77  163:pop             
		}
		if(true) goto _L4; else goto _L3
	//   78  164:goto            105
_L3:
	}

	public void setTitleMargin(int i, int j, int k, int l)
	{
		mTitleMarginStart = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #190 <Field int mTitleMarginStart>
		mTitleMarginTop = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #186 <Field int mTitleMarginTop>
		mTitleMarginEnd = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #188 <Field int mTitleMarginEnd>
		mTitleMarginBottom = l;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #184 <Field int mTitleMarginBottom>
		requestLayout();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #950 <Method void requestLayout()>
	//   14   25:return          
	}

	public void setTitleMarginBottom(int i)
	{
		mTitleMarginBottom = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #184 <Field int mTitleMarginBottom>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #950 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTitleMarginEnd(int i)
	{
		mTitleMarginEnd = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #188 <Field int mTitleMarginEnd>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #950 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTitleMarginStart(int i)
	{
		mTitleMarginStart = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #190 <Field int mTitleMarginStart>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #950 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTitleMarginTop(int i)
	{
		mTitleMarginTop = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #186 <Field int mTitleMarginTop>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #950 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTitleTextAppearance(Context context, int i)
	{
		mTitleTextAppearance = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #153 <Field int mTitleTextAppearance>
		if(mTitleTextView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #792 <Field TextView mTitleTextView>
	//*   5    9:ifnull          21
			mTitleTextView.setTextAppearance(context, i);
	//    6   12:aload_0         
	//    7   13:getfield        #792 <Field TextView mTitleTextView>
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:invokevirtual   #1032 <Method void TextView.setTextAppearance(Context, int)>
	//   11   21:return          
	}

	public void setTitleTextColor(int i)
	{
		mTitleTextColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #1044 <Field int mTitleTextColor>
		if(mTitleTextView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #792 <Field TextView mTitleTextView>
	//*   5    9:ifnull          20
			mTitleTextView.setTextColor(i);
	//    6   12:aload_0         
	//    7   13:getfield        #792 <Field TextView mTitleTextView>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #1037 <Method void TextView.setTextColor(int)>
	//   10   20:return          
	}

	public boolean showOverflowMenu()
	{
		return mMenuView != null && mMenuView.showOverflowMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #427 <Field ActionMenuView mMenuView>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #427 <Field ActionMenuView mMenuView>
	//    5   11:invokevirtual   #1053 <Method boolean ActionMenuView.showOverflowMenu()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private static final String TAG = "Toolbar";
	private android.support.v7.view.menu.MenuPresenter.Callback mActionMenuPresenterCallback;
	int mButtonGravity;
	ImageButton mCollapseButtonView;
	private CharSequence mCollapseDescription;
	private Drawable mCollapseIcon;
	private boolean mCollapsible;
	private int mContentInsetEndWithActions;
	private int mContentInsetStartWithNavigation;
	private RtlSpacingHelper mContentInsets;
	private boolean mEatingHover;
	private boolean mEatingTouch;
	View mExpandedActionView;
	private ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
	private int mGravity;
	private final ArrayList mHiddenViews;
	private ImageView mLogoView;
	private int mMaxButtonHeight;
	private android.support.v7.view.menu.MenuBuilder.Callback mMenuBuilderCallback;
	private ActionMenuView mMenuView;
	private final ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
	private ImageButton mNavButtonView;
	OnMenuItemClickListener mOnMenuItemClickListener;
	private ActionMenuPresenter mOuterActionMenuPresenter;
	private Context mPopupContext;
	private int mPopupTheme;
	private final Runnable mShowOverflowMenuRunnable;
	private CharSequence mSubtitleText;
	private int mSubtitleTextAppearance;
	private int mSubtitleTextColor;
	private TextView mSubtitleTextView;
	private final int mTempMargins[];
	private final ArrayList mTempViews;
	private int mTitleMarginBottom;
	private int mTitleMarginEnd;
	private int mTitleMarginStart;
	private int mTitleMarginTop;
	private CharSequence mTitleText;
	private int mTitleTextAppearance;
	private int mTitleTextColor;
	private TextView mTitleTextView;
	private ToolbarWidgetWrapper mWrapper;
}
