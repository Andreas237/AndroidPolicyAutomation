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
			boolean flag2 = false;
		//    0    0:iconst_0        
		//    1    1:istore          4
			if(mCurrentExpandedItem == null) goto _L2; else goto _L1
		//    2    3:aload_0         
		//    3    4:getfield        #47  <Field MenuItemImpl mCurrentExpandedItem>
		//    4    7:ifnull          74
_L1:
			boolean flag1 = flag2;
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
		boolean flag1 = false;
	//    2    2:iconst_0        
	//    3    3:istore          4
		int j;
		int k;
		if(ViewCompat.getLayoutDirection(((View) (this))) != 1)
	//*   4    5:aload_0         
	//*   5    6:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//*   6    9:iconst_1        
	//*   7   10:icmpne          115
	//*   8   13:aload_0         
	//*   9   14:invokevirtual   #348 <Method int getChildCount()>
	//*  10   17:istore          6
	//*  11   19:iload_2         
	//*  12   20:aload_0         
	//*  13   21:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//*  14   24:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//*  15   27:istore          5
	//*  16   29:aload_1         
	//*  17   30:invokeinterface #358 <Method void List.clear()>
	//*  18   35:iload           4
	//*  19   37:istore_2        
	//*  20   38:iload_3         
	//*  21   39:ifeq            120
	//*  22   42:iload           6
	//*  23   44:iconst_1        
	//*  24   45:isub            
	//*  25   46:istore_2        
	//*  26   47:iload_2         
	//*  27   48:iflt            190
	//*  28   51:aload_0         
	//*  29   52:iload_2         
	//*  30   53:invokevirtual   #362 <Method View getChildAt(int)>
	//*  31   56:astore          7
	//*  32   58:aload           7
	//*  33   60:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  34   63:checkcast       #15  <Class Toolbar$LayoutParams>
	//*  35   66:astore          8
	//*  36   68:aload           8
	//*  37   70:getfield        #371 <Field int Toolbar$LayoutParams.mViewType>
	//*  38   73:ifne            108
	//*  39   76:aload_0         
	//*  40   77:aload           7
	//*  41   79:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  42   82:ifeq            108
	//*  43   85:aload_0         
	//*  44   86:aload           8
	//*  45   88:getfield        #378 <Field int Toolbar$LayoutParams.gravity>
	//*  46   91:invokespecial   #382 <Method int getChildHorizontalGravity(int)>
	//*  47   94:iload           5
	//*  48   96:icmpne          108
	//*  49   99:aload_1         
	//*  50  100:aload           7
	//*  51  102:invokeinterface #386 <Method boolean List.add(Object)>
	//*  52  107:pop             
	//*  53  108:iload_2         
	//*  54  109:iconst_1        
	//*  55  110:isub            
	//*  56  111:istore_2        
	//*  57  112:goto            47
			flag = false;
	//   58  115:iconst_0        
	//   59  116:istore_3        
		k = getChildCount();
		j = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(((View) (this))));
		list.clear();
		i = ((int) (flag1));
		if(flag)
			for(i = k - 1; i >= 0; i--)
			{
				View view = getChildAt(i);
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
				if(layoutparams.mViewType == 0 && shouldLayout(view) && getChildHorizontalGravity(layoutparams.gravity) == j)
					list.add(((Object) (view)));
			}

		else
	//*  60  117:goto            13
			for(; i < k; i++)
	//*  61  120:iload_2         
	//*  62  121:iload           6
	//*  63  123:icmpge          190
			{
				View view1 = getChildAt(i);
	//   64  126:aload_0         
	//   65  127:iload_2         
	//   66  128:invokevirtual   #362 <Method View getChildAt(int)>
	//   67  131:astore          7
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//   68  133:aload           7
	//   69  135:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   70  138:checkcast       #15  <Class Toolbar$LayoutParams>
	//   71  141:astore          8
				if(layoutparams1.mViewType == 0 && shouldLayout(view1) && getChildHorizontalGravity(layoutparams1.gravity) == j)
	//*  72  143:aload           8
	//*  73  145:getfield        #371 <Field int Toolbar$LayoutParams.mViewType>
	//*  74  148:ifne            183
	//*  75  151:aload_0         
	//*  76  152:aload           7
	//*  77  154:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  78  157:ifeq            183
	//*  79  160:aload_0         
	//*  80  161:aload           8
	//*  81  163:getfield        #378 <Field int Toolbar$LayoutParams.gravity>
	//*  82  166:invokespecial   #382 <Method int getChildHorizontalGravity(int)>
	//*  83  169:iload           5
	//*  84  171:icmpne          183
					list.add(((Object) (view1)));
	//   85  174:aload_1         
	//   86  175:aload           7
	//   87  177:invokeinterface #386 <Method boolean List.add(Object)>
	//   88  182:pop             
			}

	//   89  183:iload_2         
	//   90  184:iconst_1        
	//   91  185:iadd            
	//   92  186:istore_2        
	//*  93  187:goto            120
	//   94  190:return          
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
label0:
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
				if(k != 1)
					break label0;
	//   13   52:iload_3         
	//   14   53:iconst_1        
	//   15   54:icmpne          61
				i = 5;
	//   16   57:iconst_5        
	//   17   58:istore_1        
				break;

			case 1: // '\001'
			case 3: // '\003'
			case 5: // '\005'
				break;
			}
			return i;
	//   18   59:iload_1         
	//   19   60:ireturn         
		}
		return 3;
	//   20   61:iconst_3        
	//   21   62:ireturn         
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
	//*   8   16:ifle            109
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
	//	               48: 114
	//	               80: 121
	//*  20   60:aload_0         
	//*  21   61:invokevirtual   #494 <Method int getPaddingTop()>
	//*  22   64:istore_3        
	//*  23   65:aload_0         
	//*  24   66:invokevirtual   #497 <Method int getPaddingBottom()>
	//*  25   69:istore          5
	//*  26   71:aload_0         
	//*  27   72:invokevirtual   #500 <Method int getHeight()>
	//*  28   75:istore          6
	//*  29   77:iload           6
	//*  30   79:iload_3         
	//*  31   80:isub            
	//*  32   81:iload           5
	//*  33   83:isub            
	//*  34   84:iload           4
	//*  35   86:isub            
	//*  36   87:iconst_2        
	//*  37   88:idiv            
	//*  38   89:istore_2        
	//*  39   90:iload_2         
	//*  40   91:aload           7
	//*  41   93:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//*  42   96:icmpge          142
	//*  43   99:aload           7
	//*  44  101:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//*  45  104:istore_2        
	//*  46  105:iload_2         
	//*  47  106:iload_3         
	//*  48  107:iadd            
	//*  49  108:ireturn         
			i = 0;
	//   50  109:iconst_0        
	//   51  110:istore_2        
		getChildVerticalGravity(layoutparams.gravity);
		JVM INSTR lookupswitch 2: default 60
	//	               48: 114
	//	               80: 121;
		   goto _L1 _L2 _L3
_L1:
		j = getPaddingTop();
		l = getPaddingBottom();
		i1 = getHeight();
		i = (i1 - j - l - k) / 2;
		if(i >= layoutparams.topMargin) goto _L5; else goto _L4
_L4:
		i = layoutparams.topMargin;
_L7:
		return i + j;
	//*  52  111:goto            26
_L2:
		return getPaddingTop() - i;
	//   53  114:aload_0         
	//   54  115:invokevirtual   #494 <Method int getPaddingTop()>
	//   55  118:iload_2         
	//   56  119:isub            
	//   57  120:ireturn         
_L3:
		return getHeight() - getPaddingBottom() - k - layoutparams.bottomMargin - i;
	//   58  121:aload_0         
	//   59  122:invokevirtual   #500 <Method int getHeight()>
	//   60  125:aload_0         
	//   61  126:invokevirtual   #497 <Method int getPaddingBottom()>
	//   62  129:isub            
	//   63  130:iload           4
	//   64  132:isub            
	//   65  133:aload           7
	//   66  135:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//   67  138:isub            
	//   68  139:iload_2         
	//   69  140:isub            
	//   70  141:ireturn         
_L5:
		k = i1 - l - k - i - j;
	//   71  142:iload           6
	//   72  144:iload           5
	//   73  146:isub            
	//   74  147:iload           4
	//   75  149:isub            
	//   76  150:iload_2         
	//   77  151:isub            
	//   78  152:iload_3         
	//   79  153:isub            
	//   80  154:istore          4
		if(k < layoutparams.bottomMargin)
	//*  81  156:iload           4
	//*  82  158:aload           7
	//*  83  160:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//*  84  163:icmpge          184
			i = Math.max(0, i - (layoutparams.bottomMargin - k));
	//   85  166:iconst_0        
	//   86  167:iload_2         
	//   87  168:aload           7
	//   88  170:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//   89  173:iload           4
	//   90  175:isub            
	//   91  176:isub            
	//   92  177:invokestatic    #511 <Method int Math.max(int, int)>
	//   93  180:istore_2        
		if(true) goto _L7; else goto _L6
	//   94  181:goto            105
_L6:
	//*  95  184:goto            105
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
		int i = MarginLayoutParamsCompat.getMarginStart(((android.view.ViewGroup.MarginLayoutParams) (view)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #520 <Method int MarginLayoutParamsCompat.getMarginStart(android.view.ViewGroup$MarginLayoutParams)>
	//    6   12:istore_2        
		return MarginLayoutParamsCompat.getMarginEnd(((android.view.ViewGroup.MarginLayoutParams) (view))) + i;
	//    7   13:aload_1         
	//    8   14:invokestatic    #523 <Method int MarginLayoutParamsCompat.getMarginEnd(android.view.ViewGroup$MarginLayoutParams)>
	//    9   17:iload_2         
	//   10   18:iadd            
	//   11   19:ireturn         
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
		int i = ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin;
	//    4    8:aload_1         
	//    5    9:getfield        #530 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//    6   12:istore_2        
		return ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin + i;
	//    7   13:aload_1         
	//    8   14:getfield        #531 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//    9   17:iload_2         
	//   10   18:iadd            
	//   11   19:ireturn         
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
		int i1 = list.size();
	//    8   10:aload_1         
	//    9   11:invokeinterface #536 <Method int List.size()>
	//   10   16:istore          7
		int j = 0;
	//   11   18:iconst_0        
	//   12   19:istore          4
		int i;
		int j1;
		int k1;
		int l1;
		for(i = 0; j < i1; i += l1 + j1 + k1)
	//*  13   21:iconst_0        
	//*  14   22:istore_3        
	//*  15   23:iload           4
	//*  16   25:iload           7
	//*  17   27:icmpge          131
		{
			ai = ((int []) ((View)list.get(j)));
	//   18   30:aload_1         
	//   19   31:iload           4
	//   20   33:invokeinterface #540 <Method Object List.get(int)>
	//   21   38:checkcast       #364 <Class View>
	//   22   41:astore_2        
			LayoutParams layoutparams = (LayoutParams)((View) (ai)).getLayoutParams();
	//   23   42:aload_2         
	//   24   43:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   46:checkcast       #15  <Class Toolbar$LayoutParams>
	//   26   49:astore          11
			l = layoutparams.leftMargin - l;
	//   27   51:aload           11
	//   28   53:getfield        #543 <Field int Toolbar$LayoutParams.leftMargin>
	//   29   56:iload           6
	//   30   58:isub            
	//   31   59:istore          6
			k = layoutparams.rightMargin - k;
	//   32   61:aload           11
	//   33   63:getfield        #546 <Field int Toolbar$LayoutParams.rightMargin>
	//   34   66:iload           5
	//   35   68:isub            
	//   36   69:istore          5
			j1 = Math.max(0, l);
	//   37   71:iconst_0        
	//   38   72:iload           6
	//   39   74:invokestatic    #511 <Method int Math.max(int, int)>
	//   40   77:istore          8
			k1 = Math.max(0, k);
	//   41   79:iconst_0        
	//   42   80:iload           5
	//   43   82:invokestatic    #511 <Method int Math.max(int, int)>
	//   44   85:istore          9
			l = Math.max(0, -l);
	//   45   87:iconst_0        
	//   46   88:iload           6
	//   47   90:ineg            
	//   48   91:invokestatic    #511 <Method int Math.max(int, int)>
	//   49   94:istore          6
			k = Math.max(0, -k);
	//   50   96:iconst_0        
	//   51   97:iload           5
	//   52   99:ineg            
	//   53  100:invokestatic    #511 <Method int Math.max(int, int)>
	//   54  103:istore          5
			l1 = ((View) (ai)).getMeasuredWidth();
	//   55  105:aload_2         
	//   56  106:invokevirtual   #549 <Method int View.getMeasuredWidth()>
	//   57  109:istore          10
			j++;
	//   58  111:iload           4
	//   59  113:iconst_1        
	//   60  114:iadd            
	//   61  115:istore          4
		}

	//   62  117:iload_3         
	//   63  118:iload           10
	//   64  120:iload           8
	//   65  122:iadd            
	//   66  123:iload           9
	//   67  125:iadd            
	//   68  126:iadd            
	//   69  127:istore_3        
	//*  70  128:goto            23
		return i;
	//   71  131:iload_3         
	//   72  132:ireturn         
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
		i = Math.max(0, k) + i;
	//   11   20:iconst_0        
	//   12   21:iload           5
	//   13   23:invokestatic    #511 <Method int Math.max(int, int)>
	//   14   26:iload_2         
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
		return layoutparams.rightMargin + k + i;
	//   43   72:aload           6
	//   44   74:getfield        #546 <Field int Toolbar$LayoutParams.rightMargin>
	//   45   77:iload           5
	//   46   79:iadd            
	//   47   80:iload_2         
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
	//*  47   91:icmpeq          127
		{
			i = j;
	//   48   94:iload_3         
	//   49   95:istore_2        
			if(i1 >= 0)
	//*  50   96:iload           6
	//*  51   98:iflt            127
			{
				i = i1;
	//   52  101:iload           6
	//   53  103:istore_2        
				if(k != 0)
	//*  54  104:iload           4
	//*  55  106:ifeq            119
					i = Math.min(android.view.View.MeasureSpec.getSize(j), i1);
	//   56  109:iload_3         
	//   57  110:invokestatic    #602 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   58  113:iload           6
	//   59  115:invokestatic    #605 <Method int Math.min(int, int)>
	//   60  118:istore_2        
				i = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
	//   61  119:iload_2         
	//   62  120:ldc2            #599 <Int 0x40000000>
	//   63  123:invokestatic    #608 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   64  126:istore_2        
			}
		}
		view.measure(j1, i);
	//   65  127:aload_1         
	//   66  128:iload           7
	//   67  130:iload_2         
	//   68  131:invokevirtual   #591 <Method void View.measure(int, int)>
	//   69  134:return          
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
		boolean flag;
		if(mMenuView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #427 <Field ActionMenuView mMenuView>
	//*   2    4:ifnull          58
		{
			MenuBuilder menubuilder = mMenuView.peekMenu();
	//    3    7:aload_0         
	//    4    8:getfield        #427 <Field ActionMenuView mMenuView>
	//    5   11:invokevirtual   #433 <Method MenuBuilder ActionMenuView.peekMenu()>
	//    6   14:astore_2        
			if(menubuilder != null && menubuilder.hasVisibleItems())
	//*   7   15:aload_2         
	//*   8   16:ifnull          48
	//*   9   19:aload_2         
	//*  10   20:invokevirtual   #714 <Method boolean MenuBuilder.hasVisibleItems()>
	//*  11   23:ifeq            48
				flag = true;
	//   12   26:iconst_1        
	//   13   27:istore_1        
			else
	//*  14   28:iload_1         
	//*  15   29:ifeq            53
	//*  16   32:aload_0         
	//*  17   33:invokevirtual   #695 <Method int getContentInsetEnd()>
	//*  18   36:aload_0         
	//*  19   37:getfield        #247 <Field int mContentInsetEndWithActions>
	//*  20   40:iconst_0        
	//*  21   41:invokestatic    #511 <Method int Math.max(int, int)>
	//*  22   44:invokestatic    #511 <Method int Math.max(int, int)>
	//*  23   47:ireturn         
				flag = false;
	//   24   48:iconst_0        
	//   25   49:istore_1        
		} else
	//*  26   50:goto            28
	//*  27   53:aload_0         
	//*  28   54:invokevirtual   #695 <Method int getContentInsetEnd()>
	//*  29   57:ireturn         
		{
			flag = false;
	//   30   58:iconst_0        
	//   31   59:istore_1        
		}
		if(flag)
			return Math.max(getContentInsetEnd(), Math.max(mContentInsetEndWithActions, 0));
		else
			return getContentInsetEnd();
	//*  32   60:goto            28
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
		int k1;
		boolean flag1;
		int i2;
		int j2;
		int k2;
		int l2;
		int i3;
		int j3;
		boolean flag2;
		Object obj;
		Object obj1;
		int ai[];
		if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          886
			k1 = 1;
	//    4    8:iconst_1        
	//    5    9:istore          8
		else
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #825 <Method int getWidth()>
	//*   8   15:istore          11
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #500 <Method int getHeight()>
	//*  11   21:istore          14
	//*  12   23:aload_0         
	//*  13   24:invokevirtual   #575 <Method int getPaddingLeft()>
	//*  14   27:istore          7
	//*  15   29:aload_0         
	//*  16   30:invokevirtual   #578 <Method int getPaddingRight()>
	//*  17   33:istore          12
	//*  18   35:aload_0         
	//*  19   36:invokevirtual   #494 <Method int getPaddingTop()>
	//*  20   39:istore          13
	//*  21   41:aload_0         
	//*  22   42:invokevirtual   #497 <Method int getPaddingBottom()>
	//*  23   45:istore          15
	//*  24   47:iload           11
	//*  25   49:iload           12
	//*  26   51:isub            
	//*  27   52:istore_2        
	//*  28   53:aload_0         
	//*  29   54:getfield        #122 <Field int[] mTempMargins>
	//*  30   57:astore          19
	//*  31   59:aload           19
	//*  32   61:iconst_1        
	//*  33   62:iconst_0        
	//*  34   63:iastore         
	//*  35   64:aload           19
	//*  36   66:iconst_0        
	//*  37   67:iconst_0        
	//*  38   68:iastore         
	//*  39   69:aload_0         
	//*  40   70:invokestatic    #828 <Method int ViewCompat.getMinimumHeight(View)>
	//*  41   73:istore          4
	//*  42   75:iload           4
	//*  43   77:iflt            892
	//*  44   80:iload           4
	//*  45   82:iload           5
	//*  46   84:iload_3         
	//*  47   85:isub            
	//*  48   86:invokestatic    #605 <Method int Math.min(int, int)>
	//*  49   89:istore          6
	//*  50   91:aload_0         
	//*  51   92:aload_0         
	//*  52   93:getfield        #473 <Field ImageButton mNavButtonView>
	//*  53   96:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  54   99:ifeq            1587
	//*  55  102:iload           8
	//*  56  104:ifeq            898
	//*  57  107:aload_0         
	//*  58  108:aload_0         
	//*  59  109:getfield        #473 <Field ImageButton mNavButtonView>
	//*  60  112:iload_2         
	//*  61  113:aload           19
	//*  62  115:iload           6
	//*  63  117:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//*  64  120:istore_2        
	//*  65  121:iload           7
	//*  66  123:istore_3        
	//*  67  124:iload_2         
	//*  68  125:istore          4
	//*  69  127:iload_3         
	//*  70  128:istore          5
	//*  71  130:aload_0         
	//*  72  131:aload_0         
	//*  73  132:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  74  135:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  75  138:ifeq            164
	//*  76  141:iload           8
	//*  77  143:ifeq            916
	//*  78  146:aload_0         
	//*  79  147:aload_0         
	//*  80  148:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  81  151:iload_2         
	//*  82  152:aload           19
	//*  83  154:iload           6
	//*  84  156:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//*  85  159:istore          4
	//*  86  161:iload_3         
	//*  87  162:istore          5
	//*  88  164:iload           4
	//*  89  166:istore_2        
	//*  90  167:iload           5
	//*  91  169:istore_3        
	//*  92  170:aload_0         
	//*  93  171:aload_0         
	//*  94  172:getfield        #427 <Field ActionMenuView mMenuView>
	//*  95  175:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  96  178:ifeq            204
	//*  97  181:iload           8
	//*  98  183:ifeq            937
	//*  99  186:aload_0         
	//* 100  187:aload_0         
	//* 101  188:getfield        #427 <Field ActionMenuView mMenuView>
	//* 102  191:iload           5
	//* 103  193:aload           19
	//* 104  195:iload           6
	//* 105  197:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//* 106  200:istore_3        
	//* 107  201:iload           4
	//* 108  203:istore_2        
	//* 109  204:aload_0         
	//* 110  205:invokevirtual   #834 <Method int getCurrentContentInsetLeft()>
	//* 111  208:istore          4
	//* 112  210:aload_0         
	//* 113  211:invokevirtual   #836 <Method int getCurrentContentInsetRight()>
	//* 114  214:istore          5
	//* 115  216:aload           19
	//* 116  218:iconst_0        
	//* 117  219:iconst_0        
	//* 118  220:iload           4
	//* 119  222:iload_3         
	//* 120  223:isub            
	//* 121  224:invokestatic    #511 <Method int Math.max(int, int)>
	//* 122  227:iastore         
	//* 123  228:aload           19
	//* 124  230:iconst_1        
	//* 125  231:iconst_0        
	//* 126  232:iload           5
	//* 127  234:iload           11
	//* 128  236:iload           12
	//* 129  238:isub            
	//* 130  239:iload_2         
	//* 131  240:isub            
	//* 132  241:isub            
	//* 133  242:invokestatic    #511 <Method int Math.max(int, int)>
	//* 134  245:iastore         
	//* 135  246:iload_3         
	//* 136  247:iload           4
	//* 137  249:invokestatic    #511 <Method int Math.max(int, int)>
	//* 138  252:istore          4
	//* 139  254:iload_2         
	//* 140  255:iload           11
	//* 141  257:iload           12
	//* 142  259:isub            
	//* 143  260:iload           5
	//* 144  262:isub            
	//* 145  263:invokestatic    #605 <Method int Math.min(int, int)>
	//* 146  266:istore          5
	//* 147  268:iload           5
	//* 148  270:istore_3        
	//* 149  271:iload           4
	//* 150  273:istore_2        
	//* 151  274:aload_0         
	//* 152  275:aload_0         
	//* 153  276:getfield        #396 <Field View mExpandedActionView>
	//* 154  279:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 155  282:ifeq            308
	//* 156  285:iload           8
	//* 157  287:ifeq            958
	//* 158  290:aload_0         
	//* 159  291:aload_0         
	//* 160  292:getfield        #396 <Field View mExpandedActionView>
	//* 161  295:iload           5
	//* 162  297:aload           19
	//* 163  299:iload           6
	//* 164  301:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//* 165  304:istore_3        
	//* 166  305:iload           4
	//* 167  307:istore_2        
	//* 168  308:aload_0         
	//* 169  309:aload_0         
	//* 170  310:getfield        #417 <Field ImageView mLogoView>
	//* 171  313:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 172  316:ifeq            1581
	//* 173  319:iload           8
	//* 174  321:ifeq            979
	//* 175  324:aload_0         
	//* 176  325:aload_0         
	//* 177  326:getfield        #417 <Field ImageView mLogoView>
	//* 178  329:iload_3         
	//* 179  330:aload           19
	//* 180  332:iload           6
	//* 181  334:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//* 182  337:istore_3        
	//* 183  338:iload_2         
	//* 184  339:istore          4
	//* 185  341:aload_0         
	//* 186  342:aload_0         
	//* 187  343:getfield        #792 <Field TextView mTitleTextView>
	//* 188  346:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 189  349:istore_1        
	//* 190  350:aload_0         
	//* 191  351:aload_0         
	//* 192  352:getfield        #838 <Field TextView mSubtitleTextView>
	//* 193  355:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 194  358:istore          16
	//* 195  360:iconst_0        
	//* 196  361:istore_2        
	//* 197  362:iload_1         
	//* 198  363:ifeq            406
	//* 199  366:aload_0         
	//* 200  367:getfield        #792 <Field TextView mTitleTextView>
	//* 201  370:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//* 202  373:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 203  376:astore          17
	//* 204  378:aload           17
	//* 205  380:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//* 206  383:istore_2        
	//* 207  384:aload_0         
	//* 208  385:getfield        #792 <Field TextView mTitleTextView>
	//* 209  388:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//* 210  391:istore          5
	//* 211  393:iconst_0        
	//* 212  394:aload           17
	//* 213  396:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 214  399:iload_2         
	//* 215  400:iload           5
	//* 216  402:iadd            
	//* 217  403:iadd            
	//* 218  404:iadd            
	//* 219  405:istore_2        
	//* 220  406:iload           16
	//* 221  408:ifeq            1575
	//* 222  411:aload_0         
	//* 223  412:getfield        #838 <Field TextView mSubtitleTextView>
	//* 224  415:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//* 225  418:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 226  421:astore          17
	//* 227  423:aload           17
	//* 228  425:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//* 229  428:istore          5
	//* 230  430:aload_0         
	//* 231  431:getfield        #838 <Field TextView mSubtitleTextView>
	//* 232  434:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//* 233  437:istore          9
	//* 234  439:aload           17
	//* 235  441:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 236  444:iload           5
	//* 237  446:iload           9
	//* 238  448:iadd            
	//* 239  449:iadd            
	//* 240  450:iload_2         
	//* 241  451:iadd            
	//* 242  452:istore          10
	//* 243  454:iload_1         
	//* 244  455:ifne            469
	//* 245  458:iload_3         
	//* 246  459:istore          5
	//* 247  461:iload           4
	//* 248  463:istore_2        
	//* 249  464:iload           16
	//* 250  466:ifeq            832
	//* 251  469:iload_1         
	//* 252  470:ifeq            997
	//* 253  473:aload_0         
	//* 254  474:getfield        #792 <Field TextView mTitleTextView>
	//* 255  477:astore          17
	//* 256  479:iload           16
	//* 257  481:ifeq            1006
	//* 258  484:aload_0         
	//* 259  485:getfield        #838 <Field TextView mSubtitleTextView>
	//* 260  488:astore          18
	//* 261  490:aload           17
	//* 262  492:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 263  495:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 264  498:astore          17
	//* 265  500:aload           18
	//* 266  502:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 267  505:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 268  508:astore          18
	//* 269  510:iload_1         
	//* 270  511:ifeq            524
	//* 271  514:aload_0         
	//* 272  515:getfield        #792 <Field TextView mTitleTextView>
	//* 273  518:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//* 274  521:ifgt            539
	//* 275  524:iload           16
	//* 276  526:ifeq            1015
	//* 277  529:aload_0         
	//* 278  530:getfield        #838 <Field TextView mSubtitleTextView>
	//* 279  533:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//* 280  536:ifle            1015
	//* 281  539:iconst_1        
	//* 282  540:istore          9
	//* 283  542:aload_0         
	//* 284  543:getfield        #111 <Field int mGravity>
	//* 285  546:bipush          112
	//* 286  548:iand            
	//* 287  549:lookupswitch    2: default 576
	//	               48: 1021
	//	               80: 1095
	//* 288  576:iload           14
	//* 289  578:iload           13
	//* 290  580:isub            
	//* 291  581:iload           15
	//* 292  583:isub            
	//* 293  584:iload           10
	//* 294  586:isub            
	//* 295  587:iconst_2        
	//* 296  588:idiv            
	//* 297  589:istore_2        
	//* 298  590:iload_2         
	//* 299  591:aload           17
	//* 300  593:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//* 301  596:aload_0         
	//* 302  597:getfield        #186 <Field int mTitleMarginTop>
	//* 303  600:iadd            
	//* 304  601:icmpge          1042
	//* 305  604:aload           17
	//* 306  606:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//* 307  609:aload_0         
	//* 308  610:getfield        #186 <Field int mTitleMarginTop>
	//* 309  613:iadd            
	//* 310  614:istore_2        
	//* 311  615:iload           13
	//* 312  617:iload_2         
	//* 313  618:iadd            
	//* 314  619:istore_2        
	//* 315  620:iload           8
	//* 316  622:ifeq            1124
	//* 317  625:iload           9
	//* 318  627:ifeq            1118
	//* 319  630:aload_0         
	//* 320  631:getfield        #190 <Field int mTitleMarginStart>
	//* 321  634:istore          5
	//* 322  636:iload           5
	//* 323  638:aload           19
	//* 324  640:iconst_1        
	//* 325  641:iaload          
	//* 326  642:isub            
	//* 327  643:istore          5
	//* 328  645:iload_3         
	//* 329  646:iconst_0        
	//* 330  647:iload           5
	//* 331  649:invokestatic    #511 <Method int Math.max(int, int)>
	//* 332  652:isub            
	//* 333  653:istore_3        
	//* 334  654:aload           19
	//* 335  656:iconst_1        
	//* 336  657:iconst_0        
	//* 337  658:iload           5
	//* 338  660:ineg            
	//* 339  661:invokestatic    #511 <Method int Math.max(int, int)>
	//* 340  664:iastore         
	//* 341  665:iload_1         
	//* 342  666:ifeq            1566
	//* 343  669:aload_0         
	//* 344  670:getfield        #792 <Field TextView mTitleTextView>
	//* 345  673:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//* 346  676:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 347  679:astore          17
	//* 348  681:iload_3         
	//* 349  682:aload_0         
	//* 350  683:getfield        #792 <Field TextView mTitleTextView>
	//* 351  686:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//* 352  689:isub            
	//* 353  690:istore          5
	//* 354  692:aload_0         
	//* 355  693:getfield        #792 <Field TextView mTitleTextView>
	//* 356  696:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//* 357  699:iload_2         
	//* 358  700:iadd            
	//* 359  701:istore          8
	//* 360  703:aload_0         
	//* 361  704:getfield        #792 <Field TextView mTitleTextView>
	//* 362  707:iload           5
	//* 363  709:iload_2         
	//* 364  710:iload_3         
	//* 365  711:iload           8
	//* 366  713:invokevirtual   #842 <Method void TextView.layout(int, int, int, int)>
	//* 367  716:aload_0         
	//* 368  717:getfield        #188 <Field int mTitleMarginEnd>
	//* 369  720:istore          10
	//* 370  722:iload           8
	//* 371  724:aload           17
	//* 372  726:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 373  729:iadd            
	//* 374  730:istore_2        
	//* 375  731:iload           5
	//* 376  733:iload           10
	//* 377  735:isub            
	//* 378  736:istore          5
	//* 379  738:iload           16
	//* 380  740:ifeq            1561
	//* 381  743:aload_0         
	//* 382  744:getfield        #838 <Field TextView mSubtitleTextView>
	//* 383  747:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//* 384  750:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 385  753:astore          17
	//* 386  755:aload           17
	//* 387  757:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//* 388  760:iload_2         
	//* 389  761:iadd            
	//* 390  762:istore_2        
	//* 391  763:aload_0         
	//* 392  764:getfield        #838 <Field TextView mSubtitleTextView>
	//* 393  767:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//* 394  770:istore          8
	//* 395  772:aload_0         
	//* 396  773:getfield        #838 <Field TextView mSubtitleTextView>
	//* 397  776:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//* 398  779:iload_2         
	//* 399  780:iadd            
	//* 400  781:istore          10
	//* 401  783:aload_0         
	//* 402  784:getfield        #838 <Field TextView mSubtitleTextView>
	//* 403  787:iload_3         
	//* 404  788:iload           8
	//* 405  790:isub            
	//* 406  791:iload_2         
	//* 407  792:iload_3         
	//* 408  793:iload           10
	//* 409  795:invokevirtual   #842 <Method void TextView.layout(int, int, int, int)>
	//* 410  798:aload_0         
	//* 411  799:getfield        #188 <Field int mTitleMarginEnd>
	//* 412  802:istore_2        
	//* 413  803:aload           17
	//* 414  805:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 415  808:istore          8
	//* 416  810:iload_3         
	//* 417  811:iload_2         
	//* 418  812:isub            
	//* 419  813:istore_2        
	//* 420  814:iload           9
	//* 421  816:ifeq            1556
	//* 422  819:iload           5
	//* 423  821:iload_2         
	//* 424  822:invokestatic    #605 <Method int Math.min(int, int)>
	//* 425  825:istore_2        
	//* 426  826:iload_2         
	//* 427  827:istore          5
	//* 428  829:iload           4
	//* 429  831:istore_2        
	//* 430  832:aload_0         
	//* 431  833:aload_0         
	//* 432  834:getfield        #118 <Field ArrayList mTempViews>
	//* 433  837:iconst_3        
	//* 434  838:invokespecial   #844 <Method void addCustomViewsWithGravity(List, int)>
	//* 435  841:aload_0         
	//* 436  842:getfield        #118 <Field ArrayList mTempViews>
	//* 437  845:invokevirtual   #625 <Method int ArrayList.size()>
	//* 438  848:istore          4
	//* 439  850:iconst_0        
	//* 440  851:istore_3        
	//* 441  852:iload_3         
	//* 442  853:iload           4
	//* 443  855:icmpge          1356
	//* 444  858:aload_0         
	//* 445  859:aload_0         
	//* 446  860:getfield        #118 <Field ArrayList mTempViews>
	//* 447  863:iload_3         
	//* 448  864:invokevirtual   #626 <Method Object ArrayList.get(int)>
	//* 449  867:checkcast       #364 <Class View>
	//* 450  870:iload_2         
	//* 451  871:aload           19
	//* 452  873:iload           6
	//* 453  875:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//* 454  878:istore_2        
	//* 455  879:iload_3         
	//* 456  880:iconst_1        
	//* 457  881:iadd            
	//* 458  882:istore_3        
	//* 459  883:goto            852
			k1 = 0;
	//  460  886:iconst_0        
	//  461  887:istore          8
		j2 = getWidth();
		i3 = getHeight();
		j1 = getPaddingLeft();
		k2 = getPaddingRight();
		l2 = getPaddingTop();
		j3 = getPaddingBottom();
		i = j2 - k2;
		ai = mTempMargins;
		ai[1] = 0;
		ai[0] = 0;
		k = ViewCompat.getMinimumHeight(((View) (this)));
		if(k >= 0)
			i1 = Math.min(k, l - j);
		else
	//* 462  889:goto            11
			i1 = 0;
	//  463  892:iconst_0        
	//  464  893:istore          6
		if(shouldLayout(((View) (mNavButtonView))))
		{
			if(k1 != 0)
			{
				i = layoutChildRight(((View) (mNavButtonView)), i, ai, i1);
				j = j1;
			} else
	//* 465  895:goto            91
			{
				j = layoutChildLeft(((View) (mNavButtonView)), j1, ai, i1);
	//  466  898:aload_0         
	//  467  899:aload_0         
	//  468  900:getfield        #473 <Field ImageButton mNavButtonView>
	//  469  903:iload           7
	//  470  905:aload           19
	//  471  907:iload           6
	//  472  909:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//  473  912:istore_3        
			}
		} else
	//* 474  913:goto            124
	//* 475  916:aload_0         
	//* 476  917:aload_0         
	//* 477  918:getfield        #656 <Field ImageButton mCollapseButtonView>
	//* 478  921:iload_3         
	//* 479  922:aload           19
	//* 480  924:iload           6
	//* 481  926:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//* 482  929:istore          5
	//* 483  931:iload_2         
	//* 484  932:istore          4
	//* 485  934:goto            164
	//* 486  937:aload_0         
	//* 487  938:aload_0         
	//* 488  939:getfield        #427 <Field ActionMenuView mMenuView>
	//* 489  942:iload           4
	//* 490  944:aload           19
	//* 491  946:iload           6
	//* 492  948:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//* 493  951:istore_2        
	//* 494  952:iload           5
	//* 495  954:istore_3        
	//* 496  955:goto            204
	//* 497  958:aload_0         
	//* 498  959:aload_0         
	//* 499  960:getfield        #396 <Field View mExpandedActionView>
	//* 500  963:iload           4
	//* 501  965:aload           19
	//* 502  967:iload           6
	//* 503  969:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//* 504  972:istore_2        
	//* 505  973:iload           5
	//* 506  975:istore_3        
	//* 507  976:goto            308
	//* 508  979:aload_0         
	//* 509  980:aload_0         
	//* 510  981:getfield        #417 <Field ImageView mLogoView>
	//* 511  984:iload_2         
	//* 512  985:aload           19
	//* 513  987:iload           6
	//* 514  989:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//* 515  992:istore          4
	//* 516  994:goto            341
	//* 517  997:aload_0         
	//* 518  998:getfield        #838 <Field TextView mSubtitleTextView>
	//* 519 1001:astore          17
	//* 520 1003:goto            479
	//* 521 1006:aload_0         
	//* 522 1007:getfield        #792 <Field TextView mTitleTextView>
	//* 523 1010:astore          18
	//* 524 1012:goto            490
	//* 525 1015:iconst_0        
	//* 526 1016:istore          9
	//* 527 1018:goto            542
	//* 528 1021:aload_0         
	//* 529 1022:invokevirtual   #494 <Method int getPaddingTop()>
	//* 530 1025:istore_2        
	//* 531 1026:aload           17
	//* 532 1028:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//* 533 1031:iload_2         
	//* 534 1032:iadd            
	//* 535 1033:aload_0         
	//* 536 1034:getfield        #186 <Field int mTitleMarginTop>
	//* 537 1037:iadd            
	//* 538 1038:istore_2        
	//* 539 1039:goto            620
	//* 540 1042:iload           14
	//* 541 1044:iload           15
	//* 542 1046:isub            
	//* 543 1047:iload           10
	//* 544 1049:isub            
	//* 545 1050:iload_2         
	//* 546 1051:isub            
	//* 547 1052:iload           13
	//* 548 1054:isub            
	//* 549 1055:istore          5
	//* 550 1057:iload           5
	//* 551 1059:aload           17
	//* 552 1061:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 553 1064:aload_0         
	//* 554 1065:getfield        #184 <Field int mTitleMarginBottom>
	//* 555 1068:iadd            
	//* 556 1069:icmpge          1572
	//* 557 1072:iconst_0        
	//* 558 1073:iload_2         
	//* 559 1074:aload           18
	//* 560 1076:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 561 1079:aload_0         
	//* 562 1080:getfield        #184 <Field int mTitleMarginBottom>
	//* 563 1083:iadd            
	//* 564 1084:iload           5
	//* 565 1086:isub            
	//* 566 1087:isub            
	//* 567 1088:invokestatic    #511 <Method int Math.max(int, int)>
	//* 568 1091:istore_2        
	//* 569 1092:goto            615
	//* 570 1095:iload           14
	//* 571 1097:iload           15
	//* 572 1099:isub            
	//* 573 1100:aload           18
	//* 574 1102:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 575 1105:isub            
	//* 576 1106:aload_0         
	//* 577 1107:getfield        #184 <Field int mTitleMarginBottom>
	//* 578 1110:isub            
	//* 579 1111:iload           10
	//* 580 1113:isub            
	//* 581 1114:istore_2        
	//* 582 1115:goto            620
	//* 583 1118:iconst_0        
	//* 584 1119:istore          5
	//* 585 1121:goto            636
	//* 586 1124:iload           9
	//* 587 1126:ifeq            1350
	//* 588 1129:aload_0         
	//* 589 1130:getfield        #190 <Field int mTitleMarginStart>
	//* 590 1133:istore          5
	//* 591 1135:iload           5
	//* 592 1137:aload           19
	//* 593 1139:iconst_0        
	//* 594 1140:iaload          
	//* 595 1141:isub            
	//* 596 1142:istore          5
	//* 597 1144:iload           4
	//* 598 1146:iconst_0        
	//* 599 1147:iload           5
	//* 600 1149:invokestatic    #511 <Method int Math.max(int, int)>
	//* 601 1152:iadd            
	//* 602 1153:istore          4
	//* 603 1155:aload           19
	//* 604 1157:iconst_0        
	//* 605 1158:iconst_0        
	//* 606 1159:iload           5
	//* 607 1161:ineg            
	//* 608 1162:invokestatic    #511 <Method int Math.max(int, int)>
	//* 609 1165:iastore         
	//* 610 1166:iload_1         
	//* 611 1167:ifeq            1549
	//* 612 1170:aload_0         
	//* 613 1171:getfield        #792 <Field TextView mTitleTextView>
	//* 614 1174:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//* 615 1177:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 616 1180:astore          17
	//* 617 1182:aload_0         
	//* 618 1183:getfield        #792 <Field TextView mTitleTextView>
	//* 619 1186:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//* 620 1189:iload           4
	//* 621 1191:iadd            
	//* 622 1192:istore          8
	//* 623 1194:aload_0         
	//* 624 1195:getfield        #792 <Field TextView mTitleTextView>
	//* 625 1198:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//* 626 1201:iload_2         
	//* 627 1202:iadd            
	//* 628 1203:istore          5
	//* 629 1205:aload_0         
	//* 630 1206:getfield        #792 <Field TextView mTitleTextView>
	//* 631 1209:iload           4
	//* 632 1211:iload_2         
	//* 633 1212:iload           8
	//* 634 1214:iload           5
	//* 635 1216:invokevirtual   #842 <Method void TextView.layout(int, int, int, int)>
	//* 636 1219:aload_0         
	//* 637 1220:getfield        #188 <Field int mTitleMarginEnd>
	//* 638 1223:istore          10
	//* 639 1225:aload           17
	//* 640 1227:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 641 1230:istore_2        
	//* 642 1231:iload           8
	//* 643 1233:iload           10
	//* 644 1235:iadd            
	//* 645 1236:istore          8
	//* 646 1238:iload_2         
	//* 647 1239:iload           5
	//* 648 1241:iadd            
	//* 649 1242:istore_2        
	//* 650 1243:iload           16
	//* 651 1245:ifeq            1542
	//* 652 1248:aload_0         
	//* 653 1249:getfield        #838 <Field TextView mSubtitleTextView>
	//* 654 1252:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//* 655 1255:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 656 1258:astore          17
	//* 657 1260:iload_2         
	//* 658 1261:aload           17
	//* 659 1263:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//* 660 1266:iadd            
	//* 661 1267:istore          5
	//* 662 1269:aload_0         
	//* 663 1270:getfield        #838 <Field TextView mSubtitleTextView>
	//* 664 1273:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//* 665 1276:iload           4
	//* 666 1278:iadd            
	//* 667 1279:istore_2        
	//* 668 1280:aload_0         
	//* 669 1281:getfield        #838 <Field TextView mSubtitleTextView>
	//* 670 1284:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//* 671 1287:iload           5
	//* 672 1289:iadd            
	//* 673 1290:istore          10
	//* 674 1292:aload_0         
	//* 675 1293:getfield        #838 <Field TextView mSubtitleTextView>
	//* 676 1296:iload           4
	//* 677 1298:iload           5
	//* 678 1300:iload_2         
	//* 679 1301:iload           10
	//* 680 1303:invokevirtual   #842 <Method void TextView.layout(int, int, int, int)>
	//* 681 1306:aload_0         
	//* 682 1307:getfield        #188 <Field int mTitleMarginEnd>
	//* 683 1310:istore          5
	//* 684 1312:aload           17
	//* 685 1314:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 686 1317:istore          10
	//* 687 1319:iload           5
	//* 688 1321:iload_2         
	//* 689 1322:iadd            
	//* 690 1323:istore          10
	//* 691 1325:iload_3         
	//* 692 1326:istore          5
	//* 693 1328:iload           4
	//* 694 1330:istore_2        
	//* 695 1331:iload           9
	//* 696 1333:ifeq            832
	//* 697 1336:iload           8
	//* 698 1338:iload           10
	//* 699 1340:invokestatic    #511 <Method int Math.max(int, int)>
	//* 700 1343:istore_2        
	//* 701 1344:iload_3         
	//* 702 1345:istore          5
	//* 703 1347:goto            832
	//* 704 1350:iconst_0        
	//* 705 1351:istore          5
	//* 706 1353:goto            1135
	//* 707 1356:aload_0         
	//* 708 1357:aload_0         
	//* 709 1358:getfield        #118 <Field ArrayList mTempViews>
	//* 710 1361:iconst_5        
	//* 711 1362:invokespecial   #844 <Method void addCustomViewsWithGravity(List, int)>
	//* 712 1365:aload_0         
	//* 713 1366:getfield        #118 <Field ArrayList mTempViews>
	//* 714 1369:invokevirtual   #625 <Method int ArrayList.size()>
	//* 715 1372:istore          4
	//* 716 1374:iconst_0        
	//* 717 1375:istore_3        
	//* 718 1376:iload_3         
	//* 719 1377:iload           4
	//* 720 1379:icmpge          1412
	//* 721 1382:aload_0         
	//* 722 1383:aload_0         
	//* 723 1384:getfield        #118 <Field ArrayList mTempViews>
	//* 724 1387:iload_3         
	//* 725 1388:invokevirtual   #626 <Method Object ArrayList.get(int)>
	//* 726 1391:checkcast       #364 <Class View>
	//* 727 1394:iload           5
	//* 728 1396:aload           19
	//* 729 1398:iload           6
	//* 730 1400:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//* 731 1403:istore          5
	//* 732 1405:iload_3         
	//* 733 1406:iconst_1        
	//* 734 1407:iadd            
	//* 735 1408:istore_3        
	//* 736 1409:goto            1376
	//* 737 1412:aload_0         
	//* 738 1413:aload_0         
	//* 739 1414:getfield        #118 <Field ArrayList mTempViews>
	//* 740 1417:iconst_1        
	//* 741 1418:invokespecial   #844 <Method void addCustomViewsWithGravity(List, int)>
	//* 742 1421:aload_0         
	//* 743 1422:aload_0         
	//* 744 1423:getfield        #118 <Field ArrayList mTempViews>
	//* 745 1426:aload           19
	//* 746 1428:invokespecial   #846 <Method int getViewListMeasuredWidth(List, int[])>
	//* 747 1431:istore          4
	//* 748 1433:iload           11
	//* 749 1435:iload           7
	//* 750 1437:isub            
	//* 751 1438:iload           12
	//* 752 1440:isub            
	//* 753 1441:iconst_2        
	//* 754 1442:idiv            
	//* 755 1443:iload           7
	//* 756 1445:iadd            
	//* 757 1446:iload           4
	//* 758 1448:iconst_2        
	//* 759 1449:idiv            
	//* 760 1450:isub            
	//* 761 1451:istore_3        
	//* 762 1452:iload           4
	//* 763 1454:iload_3         
	//* 764 1455:iadd            
	//* 765 1456:istore          4
	//* 766 1458:iload_3         
	//* 767 1459:iload_2         
	//* 768 1460:icmpge          1514
	//* 769 1463:aload_0         
	//* 770 1464:getfield        #118 <Field ArrayList mTempViews>
	//* 771 1467:invokevirtual   #625 <Method int ArrayList.size()>
	//* 772 1470:istore          5
	//* 773 1472:iconst_0        
	//* 774 1473:istore          4
	//* 775 1475:iload_2         
	//* 776 1476:istore_3        
	//* 777 1477:iload           4
	//* 778 1479:istore_2        
	//* 779 1480:iload_2         
	//* 780 1481:iload           5
	//* 781 1483:icmpge          1534
	//* 782 1486:aload_0         
	//* 783 1487:aload_0         
	//* 784 1488:getfield        #118 <Field ArrayList mTempViews>
	//* 785 1491:iload_2         
	//* 786 1492:invokevirtual   #626 <Method Object ArrayList.get(int)>
	//* 787 1495:checkcast       #364 <Class View>
	//* 788 1498:iload_3         
	//* 789 1499:aload           19
	//* 790 1501:iload           6
	//* 791 1503:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//* 792 1506:istore_3        
	//* 793 1507:iload_2         
	//* 794 1508:iconst_1        
	//* 795 1509:iadd            
	//* 796 1510:istore_2        
	//* 797 1511:goto            1480
	//* 798 1514:iload_3         
	//* 799 1515:istore_2        
	//* 800 1516:iload           4
	//* 801 1518:iload           5
	//* 802 1520:icmple          1463
	//* 803 1523:iload_3         
	//* 804 1524:iload           4
	//* 805 1526:iload           5
	//* 806 1528:isub            
	//* 807 1529:isub            
	//* 808 1530:istore_2        
	//* 809 1531:goto            1463
	//* 810 1534:aload_0         
	//* 811 1535:getfield        #118 <Field ArrayList mTempViews>
	//* 812 1538:invokevirtual   #630 <Method void ArrayList.clear()>
	//* 813 1541:return          
	//* 814 1542:iload           4
	//* 815 1544:istore          10
	//* 816 1546:goto            1325
	//* 817 1549:iload           4
	//* 818 1551:istore          8
	//* 819 1553:goto            1243
	//* 820 1556:iload_3         
	//* 821 1557:istore_2        
	//* 822 1558:goto            826
	//* 823 1561:iload_3         
	//* 824 1562:istore_2        
	//* 825 1563:goto            814
	//* 826 1566:iload_3         
	//* 827 1567:istore          5
	//* 828 1569:goto            738
	//* 829 1572:goto            615
	//* 830 1575:iload_2         
	//* 831 1576:istore          10
	//* 832 1578:goto            454
	//* 833 1581:iload_2         
	//* 834 1582:istore          4
	//* 835 1584:goto            341
		{
			j = j1;
	//  836 1587:iload           7
	//  837 1589:istore_3        
		}
		k = i;
		l = j;
		if(shouldLayout(((View) (mCollapseButtonView))))
			if(k1 != 0)
			{
				k = layoutChildRight(((View) (mCollapseButtonView)), i, ai, i1);
				l = j;
			} else
			{
				l = layoutChildLeft(((View) (mCollapseButtonView)), j, ai, i1);
				k = i;
			}
		i = k;
		j = l;
		if(shouldLayout(((View) (mMenuView))))
			if(k1 != 0)
			{
				j = layoutChildLeft(((View) (mMenuView)), l, ai, i1);
				i = k;
			} else
			{
				i = layoutChildRight(((View) (mMenuView)), k, ai, i1);
				j = l;
			}
		k = getCurrentContentInsetLeft();
		l = getCurrentContentInsetRight();
		ai[0] = Math.max(0, k - j);
		ai[1] = Math.max(0, l - (j2 - k2 - i));
		k = Math.max(j, k);
		l = Math.min(i, j2 - k2 - l);
		j = l;
		i = k;
		if(shouldLayout(mExpandedActionView))
			if(k1 != 0)
			{
				j = layoutChildRight(mExpandedActionView, l, ai, i1);
				i = k;
			} else
			{
				i = layoutChildLeft(mExpandedActionView, k, ai, i1);
				j = l;
			}
		if(shouldLayout(((View) (mLogoView))))
		{
			if(k1 != 0)
			{
				j = layoutChildRight(((View) (mLogoView)), j, ai, i1);
				k = i;
			} else
			{
				k = layoutChildLeft(((View) (mLogoView)), i, ai, i1);
			}
		} else
		{
			k = i;
		}
		flag = shouldLayout(((View) (mTitleTextView)));
		flag2 = shouldLayout(((View) (mSubtitleTextView)));
		i = 0;
		if(flag)
		{
			LayoutParams layoutparams = (LayoutParams)mTitleTextView.getLayoutParams();
			i = layoutparams.topMargin;
			l = mTitleTextView.getMeasuredHeight();
			i = 0 + (layoutparams.bottomMargin + (i + l));
		}
		if(flag2)
		{
			LayoutParams layoutparams1 = (LayoutParams)mSubtitleTextView.getLayoutParams();
			l = layoutparams1.topMargin;
			int l1 = mSubtitleTextView.getMeasuredHeight();
			i2 = layoutparams1.bottomMargin + (l + l1) + i;
		} else
		{
			i2 = i;
		}
		if(flag) goto _L2; else goto _L1
_L1:
		l = j;
		i = k;
		if(!flag2) goto _L3; else goto _L2
_L2:
		if(flag)
			obj = ((Object) (mTitleTextView));
		else
			obj = ((Object) (mSubtitleTextView));
		if(flag2)
			obj1 = ((Object) (mSubtitleTextView));
		else
			obj1 = ((Object) (mTitleTextView));
		obj = ((Object) ((LayoutParams)((View) (obj)).getLayoutParams()));
		obj1 = ((Object) ((LayoutParams)((View) (obj1)).getLayoutParams()));
		if(flag && mTitleTextView.getMeasuredWidth() > 0 || flag2 && mSubtitleTextView.getMeasuredWidth() > 0)
			flag1 = true;
		else
			flag1 = false;
		mGravity & 0x70;
		JVM INSTR lookupswitch 2: default 576
	//	               48: 1021
	//	               80: 1095;
		   goto _L4 _L5 _L6
_L4:
		i = (i3 - l2 - j3 - i2) / 2;
		if(i < ((LayoutParams) (obj)).topMargin + mTitleMarginTop)
		{
			i = ((LayoutParams) (obj)).topMargin + mTitleMarginTop;
		} else
		{
			l = i3 - j3 - i2 - i - l2;
			if(l < ((LayoutParams) (obj)).bottomMargin + mTitleMarginBottom)
				i = Math.max(0, i - ((((LayoutParams) (obj1)).bottomMargin + mTitleMarginBottom) - l));
		}
		i = l2 + i;
_L8:
		if(k1 != 0)
		{
			if(flag1)
				l = mTitleMarginStart;
			else
				l = 0;
			l -= ai[1];
			j -= Math.max(0, l);
			ai[1] = Math.max(0, -l);
			if(flag)
			{
				obj = ((Object) ((LayoutParams)mTitleTextView.getLayoutParams()));
				l = j - mTitleTextView.getMeasuredWidth();
				k1 = mTitleTextView.getMeasuredHeight() + i;
				mTitleTextView.layout(l, i, j, k1);
				i2 = mTitleMarginEnd;
				i = k1 + ((LayoutParams) (obj)).bottomMargin;
				l -= i2;
			} else
			{
				l = j;
			}
			if(flag2)
			{
				obj = ((Object) ((LayoutParams)mSubtitleTextView.getLayoutParams()));
				i = ((LayoutParams) (obj)).topMargin + i;
				k1 = mSubtitleTextView.getMeasuredWidth();
				i2 = mSubtitleTextView.getMeasuredHeight() + i;
				mSubtitleTextView.layout(j - k1, i, j, i2);
				i = mTitleMarginEnd;
				k1 = ((LayoutParams) (obj)).bottomMargin;
				i = j - i;
			} else
			{
				i = j;
			}
			if(flag1)
				i = Math.min(l, i);
			else
				i = j;
			l = i;
			i = k;
		} else
		{
			if(flag1)
				l = mTitleMarginStart;
			else
				l = 0;
			l -= ai[0];
			k += Math.max(0, l);
			ai[0] = Math.max(0, -l);
			if(flag)
			{
				obj = ((Object) ((LayoutParams)mTitleTextView.getLayoutParams()));
				k1 = mTitleTextView.getMeasuredWidth() + k;
				l = mTitleTextView.getMeasuredHeight() + i;
				mTitleTextView.layout(k, i, k1, l);
				i2 = mTitleMarginEnd;
				i = ((LayoutParams) (obj)).bottomMargin;
				k1 += i2;
				i += l;
			} else
			{
				k1 = k;
			}
			if(flag2)
			{
				obj = ((Object) ((LayoutParams)mSubtitleTextView.getLayoutParams()));
				l = i + ((LayoutParams) (obj)).topMargin;
				i = mSubtitleTextView.getMeasuredWidth() + k;
				i2 = mSubtitleTextView.getMeasuredHeight() + l;
				mSubtitleTextView.layout(k, l, i, i2);
				l = mTitleMarginEnd;
				i2 = ((LayoutParams) (obj)).bottomMargin;
				i2 = l + i;
			} else
			{
				i2 = k;
			}
			l = j;
			i = k;
			if(flag1)
			{
				i = Math.max(k1, i2);
				l = j;
			}
		}
_L3:
		addCustomViewsWithGravity(((List) (mTempViews)), 3);
		k = mTempViews.size();
		for(j = 0; j < k; j++)
			i = layoutChildLeft((View)mTempViews.get(j), i, ai, i1);

		addCustomViewsWithGravity(((List) (mTempViews)), 5);
		k = mTempViews.size();
		for(j = 0; j < k; j++)
			l = layoutChildRight((View)mTempViews.get(j), l, ai, i1);

		addCustomViewsWithGravity(((List) (mTempViews)), 1);
		k = getViewListMeasuredWidth(((List) (mTempViews)), ai);
		j = ((j2 - j1 - k2) / 2 + j1) - k / 2;
		k += j;
		  goto _L7
_L5:
		i = getPaddingTop();
		i = ((LayoutParams) (obj)).topMargin + i + mTitleMarginTop;
		break MISSING_BLOCK_LABEL_620;
_L6:
		i = i3 - j3 - ((LayoutParams) (obj1)).bottomMargin - mTitleMarginBottom - i2;
		  goto _L8
_L7:
		if(j >= i) goto _L10; else goto _L9
_L9:
		l = mTempViews.size();
		k = 0;
		j = i;
		for(i = k; i < l; i++)
			j = layoutChildLeft((View)mTempViews.get(i), j, ai, i1);

		break; /* Loop/switch isn't completed */
_L10:
		i = j;
		if(k > l)
			i = j - (k - l);
		if(true) goto _L9; else goto _L11
_L11:
		mTempViews.clear();
		return;
		  goto _L8
	//* 838 1590:goto            124
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
	//*   9   16:ifeq            576
		{
			k1 = 0;
	//   10   19:iconst_0        
	//   11   20:istore          7
			l1 = 1;
	//   12   22:iconst_1        
	//   13   23:istore          8
		} else
	//*  14   25:iconst_0        
	//*  15   26:istore_3        
	//*  16   27:aload_0         
	//*  17   28:aload_0         
	//*  18   29:getfield        #473 <Field ImageButton mNavButtonView>
	//*  19   32:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  20   35:ifeq            106
	//*  21   38:aload_0         
	//*  22   39:aload_0         
	//*  23   40:getfield        #473 <Field ImageButton mNavButtonView>
	//*  24   43:iload_1         
	//*  25   44:iconst_0        
	//*  26   45:iload_2         
	//*  27   46:iconst_0        
	//*  28   47:aload_0         
	//*  29   48:getfield        #210 <Field int mMaxButtonHeight>
	//*  30   51:invokespecial   #854 <Method void measureChildConstrained(View, int, int, int, int, int)>
	//*  31   54:aload_0         
	//*  32   55:getfield        #473 <Field ImageButton mNavButtonView>
	//*  33   58:invokevirtual   #855 <Method int ImageButton.getMeasuredWidth()>
	//*  34   61:aload_0         
	//*  35   62:aload_0         
	//*  36   63:getfield        #473 <Field ImageButton mNavButtonView>
	//*  37   66:invokespecial   #857 <Method int getHorizontalMargins(View)>
	//*  38   69:iadd            
	//*  39   70:istore_3        
	//*  40   71:iconst_0        
	//*  41   72:aload_0         
	//*  42   73:getfield        #473 <Field ImageButton mNavButtonView>
	//*  43   76:invokevirtual   #858 <Method int ImageButton.getMeasuredHeight()>
	//*  44   79:aload_0         
	//*  45   80:aload_0         
	//*  46   81:getfield        #473 <Field ImageButton mNavButtonView>
	//*  47   84:invokespecial   #860 <Method int getVerticalMargins(View)>
	//*  48   87:iadd            
	//*  49   88:invokestatic    #511 <Method int Math.max(int, int)>
	//*  50   91:istore          6
	//*  51   93:iconst_0        
	//*  52   94:aload_0         
	//*  53   95:getfield        #473 <Field ImageButton mNavButtonView>
	//*  54   98:invokevirtual   #863 <Method int ImageButton.getMeasuredState()>
	//*  55  101:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//*  56  104:istore          5
	//*  57  106:iload_3         
	//*  58  107:istore          9
	//*  59  109:iload           5
	//*  60  111:istore_3        
	//*  61  112:iload           6
	//*  62  114:istore          4
	//*  63  116:aload_0         
	//*  64  117:aload_0         
	//*  65  118:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  66  121:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  67  124:ifeq            197
	//*  68  127:aload_0         
	//*  69  128:aload_0         
	//*  70  129:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  71  132:iload_1         
	//*  72  133:iconst_0        
	//*  73  134:iload_2         
	//*  74  135:iconst_0        
	//*  75  136:aload_0         
	//*  76  137:getfield        #210 <Field int mMaxButtonHeight>
	//*  77  140:invokespecial   #854 <Method void measureChildConstrained(View, int, int, int, int, int)>
	//*  78  143:aload_0         
	//*  79  144:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  80  147:invokevirtual   #855 <Method int ImageButton.getMeasuredWidth()>
	//*  81  150:aload_0         
	//*  82  151:aload_0         
	//*  83  152:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  84  155:invokespecial   #857 <Method int getHorizontalMargins(View)>
	//*  85  158:iadd            
	//*  86  159:istore          9
	//*  87  161:iload           6
	//*  88  163:aload_0         
	//*  89  164:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  90  167:invokevirtual   #858 <Method int ImageButton.getMeasuredHeight()>
	//*  91  170:aload_0         
	//*  92  171:aload_0         
	//*  93  172:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  94  175:invokespecial   #860 <Method int getVerticalMargins(View)>
	//*  95  178:iadd            
	//*  96  179:invokestatic    #511 <Method int Math.max(int, int)>
	//*  97  182:istore          4
	//*  98  184:iload           5
	//*  99  186:aload_0         
	//* 100  187:getfield        #656 <Field ImageButton mCollapseButtonView>
	//* 101  190:invokevirtual   #863 <Method int ImageButton.getMeasuredState()>
	//* 102  193:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//* 103  196:istore_3        
	//* 104  197:aload_0         
	//* 105  198:invokevirtual   #720 <Method int getCurrentContentInsetStart()>
	//* 106  201:istore          5
	//* 107  203:iconst_0        
	//* 108  204:iload           5
	//* 109  206:iload           9
	//* 110  208:invokestatic    #511 <Method int Math.max(int, int)>
	//* 111  211:iadd            
	//* 112  212:istore          10
	//* 113  214:aload           13
	//* 114  216:iload           8
	//* 115  218:iconst_0        
	//* 116  219:iload           5
	//* 117  221:iload           9
	//* 118  223:isub            
	//* 119  224:invokestatic    #511 <Method int Math.max(int, int)>
	//* 120  227:iastore         
	//* 121  228:iconst_0        
	//* 122  229:istore          8
	//* 123  231:iload_3         
	//* 124  232:istore          5
	//* 125  234:iload           4
	//* 126  236:istore          6
	//* 127  238:aload_0         
	//* 128  239:aload_0         
	//* 129  240:getfield        #427 <Field ActionMenuView mMenuView>
	//* 130  243:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 131  246:ifeq            320
	//* 132  249:aload_0         
	//* 133  250:aload_0         
	//* 134  251:getfield        #427 <Field ActionMenuView mMenuView>
	//* 135  254:iload_1         
	//* 136  255:iload           10
	//* 137  257:iload_2         
	//* 138  258:iconst_0        
	//* 139  259:aload_0         
	//* 140  260:getfield        #210 <Field int mMaxButtonHeight>
	//* 141  263:invokespecial   #854 <Method void measureChildConstrained(View, int, int, int, int, int)>
	//* 142  266:aload_0         
	//* 143  267:getfield        #427 <Field ActionMenuView mMenuView>
	//* 144  270:invokevirtual   #867 <Method int ActionMenuView.getMeasuredWidth()>
	//* 145  273:aload_0         
	//* 146  274:aload_0         
	//* 147  275:getfield        #427 <Field ActionMenuView mMenuView>
	//* 148  278:invokespecial   #857 <Method int getHorizontalMargins(View)>
	//* 149  281:iadd            
	//* 150  282:istore          8
	//* 151  284:iload           4
	//* 152  286:aload_0         
	//* 153  287:getfield        #427 <Field ActionMenuView mMenuView>
	//* 154  290:invokevirtual   #868 <Method int ActionMenuView.getMeasuredHeight()>
	//* 155  293:aload_0         
	//* 156  294:aload_0         
	//* 157  295:getfield        #427 <Field ActionMenuView mMenuView>
	//* 158  298:invokespecial   #860 <Method int getVerticalMargins(View)>
	//* 159  301:iadd            
	//* 160  302:invokestatic    #511 <Method int Math.max(int, int)>
	//* 161  305:istore          6
	//* 162  307:iload_3         
	//* 163  308:aload_0         
	//* 164  309:getfield        #427 <Field ActionMenuView mMenuView>
	//* 165  312:invokevirtual   #869 <Method int ActionMenuView.getMeasuredState()>
	//* 166  315:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//* 167  318:istore          5
	//* 168  320:aload_0         
	//* 169  321:invokevirtual   #717 <Method int getCurrentContentInsetEnd()>
	//* 170  324:istore_3        
	//* 171  325:iload           10
	//* 172  327:iload_3         
	//* 173  328:iload           8
	//* 174  330:invokestatic    #511 <Method int Math.max(int, int)>
	//* 175  333:iadd            
	//* 176  334:istore          9
	//* 177  336:aload           13
	//* 178  338:iload           7
	//* 179  340:iconst_0        
	//* 180  341:iload_3         
	//* 181  342:iload           8
	//* 182  344:isub            
	//* 183  345:invokestatic    #511 <Method int Math.max(int, int)>
	//* 184  348:iastore         
	//* 185  349:iload           9
	//* 186  351:istore          8
	//* 187  353:iload           5
	//* 188  355:istore_3        
	//* 189  356:iload           6
	//* 190  358:istore          4
	//* 191  360:aload_0         
	//* 192  361:aload_0         
	//* 193  362:getfield        #396 <Field View mExpandedActionView>
	//* 194  365:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 195  368:ifeq            427
	//* 196  371:iload           9
	//* 197  373:aload_0         
	//* 198  374:aload_0         
	//* 199  375:getfield        #396 <Field View mExpandedActionView>
	//* 200  378:iload_1         
	//* 201  379:iload           9
	//* 202  381:iload_2         
	//* 203  382:iconst_0        
	//* 204  383:aload           13
	//* 205  385:invokespecial   #871 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//* 206  388:iadd            
	//* 207  389:istore          8
	//* 208  391:iload           6
	//* 209  393:aload_0         
	//* 210  394:getfield        #396 <Field View mExpandedActionView>
	//* 211  397:invokevirtual   #488 <Method int View.getMeasuredHeight()>
	//* 212  400:aload_0         
	//* 213  401:aload_0         
	//* 214  402:getfield        #396 <Field View mExpandedActionView>
	//* 215  405:invokespecial   #860 <Method int getVerticalMargins(View)>
	//* 216  408:iadd            
	//* 217  409:invokestatic    #511 <Method int Math.max(int, int)>
	//* 218  412:istore          4
	//* 219  414:iload           5
	//* 220  416:aload_0         
	//* 221  417:getfield        #396 <Field View mExpandedActionView>
	//* 222  420:invokevirtual   #872 <Method int View.getMeasuredState()>
	//* 223  423:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//* 224  426:istore_3        
	//* 225  427:iload           8
	//* 226  429:istore          5
	//* 227  431:iload_3         
	//* 228  432:istore          6
	//* 229  434:iload           4
	//* 230  436:istore          7
	//* 231  438:aload_0         
	//* 232  439:aload_0         
	//* 233  440:getfield        #417 <Field ImageView mLogoView>
	//* 234  443:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 235  446:ifeq            505
	//* 236  449:iload           8
	//* 237  451:aload_0         
	//* 238  452:aload_0         
	//* 239  453:getfield        #417 <Field ImageView mLogoView>
	//* 240  456:iload_1         
	//* 241  457:iload           8
	//* 242  459:iload_2         
	//* 243  460:iconst_0        
	//* 244  461:aload           13
	//* 245  463:invokespecial   #871 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//* 246  466:iadd            
	//* 247  467:istore          5
	//* 248  469:iload           4
	//* 249  471:aload_0         
	//* 250  472:getfield        #417 <Field ImageView mLogoView>
	//* 251  475:invokevirtual   #873 <Method int ImageView.getMeasuredHeight()>
	//* 252  478:aload_0         
	//* 253  479:aload_0         
	//* 254  480:getfield        #417 <Field ImageView mLogoView>
	//* 255  483:invokespecial   #860 <Method int getVerticalMargins(View)>
	//* 256  486:iadd            
	//* 257  487:invokestatic    #511 <Method int Math.max(int, int)>
	//* 258  490:istore          7
	//* 259  492:iload_3         
	//* 260  493:aload_0         
	//* 261  494:getfield        #417 <Field ImageView mLogoView>
	//* 262  497:invokevirtual   #874 <Method int ImageView.getMeasuredState()>
	//* 263  500:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//* 264  503:istore          6
	//* 265  505:aload_0         
	//* 266  506:invokevirtual   #348 <Method int getChildCount()>
	//* 267  509:istore          9
	//* 268  511:iconst_0        
	//* 269  512:istore          8
	//* 270  514:iload           7
	//* 271  516:istore          4
	//* 272  518:iload           6
	//* 273  520:istore_3        
	//* 274  521:iload           8
	//* 275  523:istore          6
	//* 276  525:iload           5
	//* 277  527:istore          8
	//* 278  529:iload           6
	//* 279  531:iload           9
	//* 280  533:icmpge          635
	//* 281  536:aload_0         
	//* 282  537:iload           6
	//* 283  539:invokevirtual   #362 <Method View getChildAt(int)>
	//* 284  542:astore          14
	//* 285  544:aload           14
	//* 286  546:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 287  549:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 288  552:getfield        #371 <Field int Toolbar$LayoutParams.mViewType>
	//* 289  555:ifne            938
	//* 290  558:aload_0         
	//* 291  559:aload           14
	//* 292  561:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 293  564:ifne            585
	//* 294  567:iload           6
	//* 295  569:iconst_1        
	//* 296  570:iadd            
	//* 297  571:istore          6
	//* 298  573:goto            529
		{
			k1 = 1;
	//  299  576:iconst_1        
	//  300  577:istore          7
			l1 = 0;
	//  301  579:iconst_0        
	//  302  580:istore          8
		}
		k = 0;
		if(shouldLayout(((View) (mNavButtonView))))
		{
			measureChildConstrained(((View) (mNavButtonView)), i, 0, j, 0, mMaxButtonHeight);
			k = mNavButtonView.getMeasuredWidth() + getHorizontalMargins(((View) (mNavButtonView)));
			j1 = Math.max(0, mNavButtonView.getMeasuredHeight() + getVerticalMargins(((View) (mNavButtonView))));
			i1 = View.combineMeasuredStates(0, mNavButtonView.getMeasuredState());
		}
		i2 = k;
		k = i1;
		l = j1;
		if(shouldLayout(((View) (mCollapseButtonView))))
		{
			measureChildConstrained(((View) (mCollapseButtonView)), i, 0, j, 0, mMaxButtonHeight);
			i2 = mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(((View) (mCollapseButtonView)));
			l = Math.max(j1, mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(((View) (mCollapseButtonView))));
			k = View.combineMeasuredStates(i1, mCollapseButtonView.getMeasuredState());
		}
		i1 = getCurrentContentInsetStart();
		j2 = 0 + Math.max(i1, i2);
		ai[l1] = Math.max(0, i1 - i2);
		l1 = 0;
		i1 = k;
		j1 = l;
		if(shouldLayout(((View) (mMenuView))))
		{
			measureChildConstrained(((View) (mMenuView)), i, j2, j, 0, mMaxButtonHeight);
			l1 = mMenuView.getMeasuredWidth() + getHorizontalMargins(((View) (mMenuView)));
			j1 = Math.max(l, mMenuView.getMeasuredHeight() + getVerticalMargins(((View) (mMenuView))));
			i1 = View.combineMeasuredStates(k, mMenuView.getMeasuredState());
		}
		k = getCurrentContentInsetEnd();
		i2 = j2 + Math.max(k, l1);
		ai[k1] = Math.max(0, k - l1);
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
		i2 = getChildCount();
		l1 = 0;
		l = k1;
		k = j1;
		j1 = l1;
		l1 = i1;
		while(j1 < i2) 
		{
			View view = getChildAt(j1);
			if(((LayoutParams)view.getLayoutParams()).mViewType == 0 && shouldLayout(view))
	//* 303  582:goto            25
			{
				l1 += measureChildCollapseMargins(view, i, l1, j, 0, ai);
	//  304  585:iload           8
	//  305  587:aload_0         
	//  306  588:aload           14
	//  307  590:iload_1         
	//  308  591:iload           8
	//  309  593:iload_2         
	//  310  594:iconst_0        
	//  311  595:aload           13
	//  312  597:invokespecial   #871 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  313  600:iadd            
	//  314  601:istore          8
				l = Math.max(l, view.getMeasuredHeight() + getVerticalMargins(view));
	//  315  603:iload           4
	//  316  605:aload           14
	//  317  607:invokevirtual   #488 <Method int View.getMeasuredHeight()>
	//  318  610:aload_0         
	//  319  611:aload           14
	//  320  613:invokespecial   #860 <Method int getVerticalMargins(View)>
	//  321  616:iadd            
	//  322  617:invokestatic    #511 <Method int Math.max(int, int)>
	//  323  620:istore          4
				k = View.combineMeasuredStates(k, view.getMeasuredState());
	//  324  622:iload_3         
	//  325  623:aload           14
	//  326  625:invokevirtual   #872 <Method int View.getMeasuredState()>
	//  327  628:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//  328  631:istore_3        
			}
			j1++;
		}
	//* 329  632:goto            567
		k1 = 0;
	//  330  635:iconst_0        
	//  331  636:istore          7
		j1 = 0;
	//  332  638:iconst_0        
	//  333  639:istore          6
		int k2 = mTitleMarginTop + mTitleMarginBottom;
	//  334  641:aload_0         
	//  335  642:getfield        #186 <Field int mTitleMarginTop>
	//  336  645:aload_0         
	//  337  646:getfield        #184 <Field int mTitleMarginBottom>
	//  338  649:iadd            
	//  339  650:istore          11
		int l2 = mTitleMarginStart + mTitleMarginEnd;
	//  340  652:aload_0         
	//  341  653:getfield        #190 <Field int mTitleMarginStart>
	//  342  656:aload_0         
	//  343  657:getfield        #188 <Field int mTitleMarginEnd>
	//  344  660:iadd            
	//  345  661:istore          12
		i1 = k;
	//  346  663:iload_3         
	//  347  664:istore          5
		if(shouldLayout(((View) (mTitleTextView))))
	//* 348  666:aload_0         
	//* 349  667:aload_0         
	//* 350  668:getfield        #792 <Field TextView mTitleTextView>
	//* 351  671:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 352  674:ifeq            750
		{
			measureChildCollapseMargins(((View) (mTitleTextView)), i, l1 + l2, j, k2, ai);
	//  353  677:aload_0         
	//  354  678:aload_0         
	//  355  679:getfield        #792 <Field TextView mTitleTextView>
	//  356  682:iload_1         
	//  357  683:iload           8
	//  358  685:iload           12
	//  359  687:iadd            
	//  360  688:iload_2         
	//  361  689:iload           11
	//  362  691:aload           13
	//  363  693:invokespecial   #871 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  364  696:pop             
			i1 = mTitleTextView.getMeasuredWidth();
	//  365  697:aload_0         
	//  366  698:getfield        #792 <Field TextView mTitleTextView>
	//  367  701:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//  368  704:istore          5
			k1 = getHorizontalMargins(((View) (mTitleTextView))) + i1;
	//  369  706:aload_0         
	//  370  707:aload_0         
	//  371  708:getfield        #792 <Field TextView mTitleTextView>
	//  372  711:invokespecial   #857 <Method int getHorizontalMargins(View)>
	//  373  714:iload           5
	//  374  716:iadd            
	//  375  717:istore          7
			j1 = mTitleTextView.getMeasuredHeight() + getVerticalMargins(((View) (mTitleTextView)));
	//  376  719:aload_0         
	//  377  720:getfield        #792 <Field TextView mTitleTextView>
	//  378  723:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//  379  726:aload_0         
	//  380  727:aload_0         
	//  381  728:getfield        #792 <Field TextView mTitleTextView>
	//  382  731:invokespecial   #860 <Method int getVerticalMargins(View)>
	//  383  734:iadd            
	//  384  735:istore          6
			i1 = View.combineMeasuredStates(k, mTitleTextView.getMeasuredState());
	//  385  737:iload_3         
	//  386  738:aload_0         
	//  387  739:getfield        #792 <Field TextView mTitleTextView>
	//  388  742:invokevirtual   #875 <Method int TextView.getMeasuredState()>
	//  389  745:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//  390  748:istore          5
		}
		j2 = j1;
	//  391  750:iload           6
	//  392  752:istore          10
		i2 = k1;
	//  393  754:iload           7
	//  394  756:istore          9
		k = i1;
	//  395  758:iload           5
	//  396  760:istore_3        
		if(shouldLayout(((View) (mSubtitleTextView))))
	//* 397  761:aload_0         
	//* 398  762:aload_0         
	//* 399  763:getfield        #838 <Field TextView mSubtitleTextView>
	//* 400  766:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 401  769:ifeq            835
		{
			i2 = Math.max(k1, measureChildCollapseMargins(((View) (mSubtitleTextView)), i, l1 + l2, j, k2 + j1, ai));
	//  402  772:iload           7
	//  403  774:aload_0         
	//  404  775:aload_0         
	//  405  776:getfield        #838 <Field TextView mSubtitleTextView>
	//  406  779:iload_1         
	//  407  780:iload           8
	//  408  782:iload           12
	//  409  784:iadd            
	//  410  785:iload_2         
	//  411  786:iload           11
	//  412  788:iload           6
	//  413  790:iadd            
	//  414  791:aload           13
	//  415  793:invokespecial   #871 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  416  796:invokestatic    #511 <Method int Math.max(int, int)>
	//  417  799:istore          9
			j2 = j1 + (mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(((View) (mSubtitleTextView))));
	//  418  801:iload           6
	//  419  803:aload_0         
	//  420  804:getfield        #838 <Field TextView mSubtitleTextView>
	//  421  807:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//  422  810:aload_0         
	//  423  811:aload_0         
	//  424  812:getfield        #838 <Field TextView mSubtitleTextView>
	//  425  815:invokespecial   #860 <Method int getVerticalMargins(View)>
	//  426  818:iadd            
	//  427  819:iadd            
	//  428  820:istore          10
			k = View.combineMeasuredStates(i1, mSubtitleTextView.getMeasuredState());
	//  429  822:iload           5
	//  430  824:aload_0         
	//  431  825:getfield        #838 <Field TextView mSubtitleTextView>
	//  432  828:invokevirtual   #875 <Method int TextView.getMeasuredState()>
	//  433  831:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//  434  834:istore_3        
		}
		l = Math.max(l, j2);
	//  435  835:iload           4
	//  436  837:iload           10
	//  437  839:invokestatic    #511 <Method int Math.max(int, int)>
	//  438  842:istore          4
		k1 = getPaddingLeft();
	//  439  844:aload_0         
	//  440  845:invokevirtual   #575 <Method int getPaddingLeft()>
	//  441  848:istore          7
		j2 = getPaddingRight();
	//  442  850:aload_0         
	//  443  851:invokevirtual   #578 <Method int getPaddingRight()>
	//  444  854:istore          10
		i1 = getPaddingTop();
	//  445  856:aload_0         
	//  446  857:invokevirtual   #494 <Method int getPaddingTop()>
	//  447  860:istore          5
		j1 = getPaddingBottom();
	//  448  862:aload_0         
	//  449  863:invokevirtual   #497 <Method int getPaddingBottom()>
	//  450  866:istore          6
		k1 = View.resolveSizeAndState(Math.max(i2 + l1 + (k1 + j2), getSuggestedMinimumWidth()), i, 0xff000000 & k);
	//  451  868:iload           9
	//  452  870:iload           8
	//  453  872:iadd            
	//  454  873:iload           7
	//  455  875:iload           10
	//  456  877:iadd            
	//  457  878:iadd            
	//  458  879:aload_0         
	//  459  880:invokevirtual   #878 <Method int getSuggestedMinimumWidth()>
	//  460  883:invokestatic    #511 <Method int Math.max(int, int)>
	//  461  886:iload_1         
	//  462  887:ldc2            #879 <Int 0xff000000>
	//  463  890:iload_3         
	//  464  891:iand            
	//  465  892:invokestatic    #882 <Method int View.resolveSizeAndState(int, int, int)>
	//  466  895:istore          7
		i = View.resolveSizeAndState(Math.max(l + (i1 + j1), getSuggestedMinimumHeight()), j, k << 16);
	//  467  897:iload           4
	//  468  899:iload           5
	//  469  901:iload           6
	//  470  903:iadd            
	//  471  904:iadd            
	//  472  905:aload_0         
	//  473  906:invokevirtual   #885 <Method int getSuggestedMinimumHeight()>
	//  474  909:invokestatic    #511 <Method int Math.max(int, int)>
	//  475  912:iload_2         
	//  476  913:iload_3         
	//  477  914:bipush          16
	//  478  916:ishl            
	//  479  917:invokestatic    #882 <Method int View.resolveSizeAndState(int, int, int)>
	//  480  920:istore_1        
		if(shouldCollapse())
	//* 481  921:aload_0         
	//* 482  922:invokespecial   #887 <Method boolean shouldCollapse()>
	//* 483  925:ifeq            930
			i = 0;
	//  484  928:iconst_0        
	//  485  929:istore_1        
		setMeasuredDimension(k1, i);
	//  486  930:aload_0         
	//  487  931:iload           7
	//  488  933:iload_1         
	//  489  934:invokevirtual   #890 <Method void setMeasuredDimension(int, int)>
	//  490  937:return          
	//* 491  938:goto            567
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
