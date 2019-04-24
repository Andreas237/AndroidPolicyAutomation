// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
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
	class ExpandedActionViewMenuPresenter
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
		//*  24   45:invokevirtual   #136 <Method MenuItem MenuBuilder.getItem(int)>
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
		//    3    3:invokespecial   #52  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(expandedMenuItemId);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #43  <Field int expandedMenuItemId>
		//    7   11:invokevirtual   #56  <Method void Parcel.writeInt(int)>
			if(isOverflowOpen)
		//*   8   14:aload_0         
		//*   9   15:getfield        #45  <Field boolean isOverflowOpen>
		//*  10   18:ifeq            26
				i = 1;
		//   11   21:iconst_1        
		//   12   22:istore_2        
			else
		//*  13   23:goto            28
				i = 0;
		//   14   26:iconst_0        
		//   15   27:istore_2        
			parcel.writeInt(i);
		//   16   28:aload_1         
		//   17   29:iload_2         
		//   18   30:invokevirtual   #56  <Method void Parcel.writeInt(int)>
		//   19   33:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

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

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #25  <Method Toolbar$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #30  <Method Toolbar$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
);
		int expandedMenuItemId;
		boolean isOverflowOpen;

		static 
		{
		//    0    0:new             #9   <Class Toolbar$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void Toolbar$SavedState$1()>
		//    3    7:invokestatic    #27  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
		//    4   10:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
		//*   5   13:return          
		}

		public SavedState(Parcel parcel)
		{
			this(parcel, ((ClassLoader) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #34  <Method void Toolbar$SavedState(Parcel, ClassLoader)>
		//    4    6:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #35  <Method void AbsSavedState(Parcel, ClassLoader)>
			expandedMenuItemId = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #41  <Method int Parcel.readInt()>
		//    7   11:putfield        #43  <Field int expandedMenuItemId>
			boolean flag;
			if(parcel.readInt() != 0)
		//*   8   14:aload_1         
		//*   9   15:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  10   18:ifeq            26
				flag = true;
		//   11   21:iconst_1        
		//   12   22:istore_3        
			else
		//*  13   23:goto            28
				flag = false;
		//   14   26:iconst_0        
		//   15   27:istore_3        
			isOverflowOpen = flag;
		//   16   28:aload_0         
		//   17   29:iload_3         
		//   18   30:putfield        #45  <Field boolean isOverflowOpen>
		//   19   33:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #48  <Method void AbsSavedState(Parcelable)>
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
		boolean flag;
		if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_3        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		int k = getChildCount();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #348 <Method int getChildCount()>
	//   11   19:istore          5
		int j = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(((View) (this))));
	//   12   21:iload_2         
	//   13   22:aload_0         
	//   14   23:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//   15   26:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   16   29:istore          4
		list.clear();
	//   17   31:aload_1         
	//   18   32:invokeinterface #358 <Method void List.clear()>
		if(flag)
	//*  19   37:iload_3         
	//*  20   38:ifeq            115
		{
			for(i = k - 1; i >= 0; i--)
	//*  21   41:iload           5
	//*  22   43:iconst_1        
	//*  23   44:isub            
	//*  24   45:istore_2        
	//*  25   46:iload_2         
	//*  26   47:iflt            114
			{
				View view = getChildAt(i);
	//   27   50:aload_0         
	//   28   51:iload_2         
	//   29   52:invokevirtual   #362 <Method View getChildAt(int)>
	//   30   55:astore          6
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   31   57:aload           6
	//   32   59:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   33   62:checkcast       #15  <Class Toolbar$LayoutParams>
	//   34   65:astore          7
				if(layoutparams.mViewType == 0 && shouldLayout(view) && getChildHorizontalGravity(layoutparams.gravity) == j)
	//*  35   67:aload           7
	//*  36   69:getfield        #371 <Field int Toolbar$LayoutParams.mViewType>
	//*  37   72:ifne            107
	//*  38   75:aload_0         
	//*  39   76:aload           6
	//*  40   78:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  41   81:ifeq            107
	//*  42   84:aload_0         
	//*  43   85:aload           7
	//*  44   87:getfield        #378 <Field int Toolbar$LayoutParams.gravity>
	//*  45   90:invokespecial   #382 <Method int getChildHorizontalGravity(int)>
	//*  46   93:iload           4
	//*  47   95:icmpne          107
					list.add(((Object) (view)));
	//   48   98:aload_1         
	//   49   99:aload           6
	//   50  101:invokeinterface #386 <Method boolean List.add(Object)>
	//   51  106:pop             
			}

	//   52  107:iload_2         
	//   53  108:iconst_1        
	//   54  109:isub            
	//   55  110:istore_2        
	//*  56  111:goto            46
			return;
	//   57  114:return          
		}
		for(i = 0; i < k; i++)
	//*  58  115:iconst_0        
	//*  59  116:istore_2        
	//*  60  117:iload_2         
	//*  61  118:iload           5
	//*  62  120:icmpge          187
		{
			View view1 = getChildAt(i);
	//   63  123:aload_0         
	//   64  124:iload_2         
	//   65  125:invokevirtual   #362 <Method View getChildAt(int)>
	//   66  128:astore          6
			LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//   67  130:aload           6
	//   68  132:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   69  135:checkcast       #15  <Class Toolbar$LayoutParams>
	//   70  138:astore          7
			if(layoutparams1.mViewType == 0 && shouldLayout(view1) && getChildHorizontalGravity(layoutparams1.gravity) == j)
	//*  71  140:aload           7
	//*  72  142:getfield        #371 <Field int Toolbar$LayoutParams.mViewType>
	//*  73  145:ifne            180
	//*  74  148:aload_0         
	//*  75  149:aload           6
	//*  76  151:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  77  154:ifeq            180
	//*  78  157:aload_0         
	//*  79  158:aload           7
	//*  80  160:getfield        #378 <Field int Toolbar$LayoutParams.gravity>
	//*  81  163:invokespecial   #382 <Method int getChildHorizontalGravity(int)>
	//*  82  166:iload           4
	//*  83  168:icmpne          180
				list.add(((Object) (view1)));
	//   84  171:aload_1         
	//   85  172:aload           6
	//   86  174:invokeinterface #386 <Method boolean List.add(Object)>
	//   87  179:pop             
		}

	//   88  180:iload_2         
	//   89  181:iconst_1        
	//   90  182:iadd            
	//   91  183:istore_2        
	//*  92  184:goto            117
	//   93  187:return          
	}

	private void addSystemView(View view, boolean flag)
	{
		Object obj = ((Object) (view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       17
			obj = ((Object) (generateDefaultLayoutParams()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #394 <Method Toolbar$LayoutParams generateDefaultLayoutParams()>
	//    7   13:astore_3        
		else
	//*   8   14:goto            39
		if(!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
	//*   9   17:aload_0         
	//*  10   18:aload_3         
	//*  11   19:invokevirtual   #398 <Method boolean checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  12   22:ifne            34
			obj = ((Object) (generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)))));
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:invokevirtual   #402 <Method Toolbar$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   16   30:astore_3        
		else
	//*  17   31:goto            39
			obj = ((Object) ((LayoutParams)obj));
	//   18   34:aload_3         
	//   19   35:checkcast       #15  <Class Toolbar$LayoutParams>
	//   20   38:astore_3        
		obj.mViewType = 1;
	//   21   39:aload_3         
	//   22   40:iconst_1        
	//   23   41:putfield        #371 <Field int Toolbar$LayoutParams.mViewType>
		if(flag && mExpandedActionView != null)
	//*  24   44:iload_2         
	//*  25   45:ifeq            70
	//*  26   48:aload_0         
	//*  27   49:getfield        #404 <Field View mExpandedActionView>
	//*  28   52:ifnull          70
		{
			view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//   29   55:aload_1         
	//   30   56:aload_3         
	//   31   57:invokevirtual   #408 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			mHiddenViews.add(((Object) (view)));
	//   32   60:aload_0         
	//   33   61:getfield        #120 <Field ArrayList mHiddenViews>
	//   34   64:aload_1         
	//   35   65:invokevirtual   #409 <Method boolean ArrayList.add(Object)>
	//   36   68:pop             
			return;
	//   37   69:return          
		} else
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
			layoutparams.gravity = mButtonGravity & 0x70 | 0x800005;
	//   30   64:aload_1         
	//   31   65:aload_0         
	//   32   66:getfield        #169 <Field int mButtonGravity>
	//   33   69:bipush          112
	//   34   71:iand            
	//   35   72:ldc2            #467 <Int 0x800005>
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
			layoutparams.gravity = mButtonGravity & 0x70 | 0x800003;
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #169 <Field int mButtonGravity>
	//   18   36:bipush          112
	//   19   38:iand            
	//   20   39:ldc2            #480 <Int 0x800003>
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
		int j = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_2        
		i = GravityCompat.getAbsoluteGravity(i, j) & 7;
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    6   10:bipush          7
	//    7   12:iand            
	//    8   13:istore_1        
		switch(i)
	//*   9   14:iload_1         
		{
	//*  10   15:tableswitch     1 5: default 48
	//	               1 51
	//	               2 53
	//	               3 51
	//	               4 53
	//	               5 51
	//*  11   48:goto            53
		case 1: // '\001'
		case 3: // '\003'
		case 5: // '\005'
			return i;
	//   12   51:iload_1         
	//   13   52:ireturn         
		}
		return j != 1 ? 3 : 5;
	//   14   53:iload_2         
	//   15   54:iconst_1        
	//   16   55:icmpne          60
	//   17   58:iconst_5        
	//   18   59:ireturn         
	//   19   60:iconst_3        
	//   20   61:ireturn         
	}

	private int getChildTop(View view, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #15  <Class Toolbar$LayoutParams>
	//    3    7:astore          7
		int k = view.getMeasuredHeight();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #488 <Method int View.getMeasuredHeight()>
	//    6   13:istore          4
		if(i > 0)
	//*   7   15:iload_2         
	//*   8   16:ifle            29
			i = (k - i) / 2;
	//    9   19:iload           4
	//   10   21:iload_2         
	//   11   22:isub            
	//   12   23:iconst_2        
	//   13   24:idiv            
	//   14   25:istore_2        
		else
	//*  15   26:goto            31
			i = 0;
	//   16   29:iconst_0        
	//   17   30:istore_2        
		switch(getChildVerticalGravity(layoutparams.gravity))
	//*  18   31:aload_0         
	//*  19   32:aload           7
	//*  20   34:getfield        #378 <Field int Toolbar$LayoutParams.gravity>
	//*  21   37:invokespecial   #491 <Method int getChildVerticalGravity(int)>
		{
	//*  22   40:lookupswitch    3: default 76
	//	               16: 107
	//	               48: 79
	//	               80: 86
	//*  23   76:goto            107
		case 48: // '0'
			return getPaddingTop() - i;
	//   24   79:aload_0         
	//   25   80:invokevirtual   #494 <Method int getPaddingTop()>
	//   26   83:iload_2         
	//   27   84:isub            
	//   28   85:ireturn         

		case 80: // 'P'
			return getHeight() - getPaddingBottom() - k - layoutparams.bottomMargin - i;
	//   29   86:aload_0         
	//   30   87:invokevirtual   #497 <Method int getHeight()>
	//   31   90:aload_0         
	//   32   91:invokevirtual   #500 <Method int getPaddingBottom()>
	//   33   94:isub            
	//   34   95:iload           4
	//   35   97:isub            
	//   36   98:aload           7
	//   37  100:getfield        #503 <Field int Toolbar$LayoutParams.bottomMargin>
	//   38  103:isub            
	//   39  104:iload_2         
	//   40  105:isub            
	//   41  106:ireturn         
		}
		int l = getPaddingTop();
	//   42  107:aload_0         
	//   43  108:invokevirtual   #494 <Method int getPaddingTop()>
	//   44  111:istore          5
		i = getPaddingBottom();
	//   45  113:aload_0         
	//   46  114:invokevirtual   #500 <Method int getPaddingBottom()>
	//   47  117:istore_2        
		int i1 = getHeight();
	//   48  118:aload_0         
	//   49  119:invokevirtual   #497 <Method int getHeight()>
	//   50  122:istore          6
		int j = (i1 - l - i - k) / 2;
	//   51  124:iload           6
	//   52  126:iload           5
	//   53  128:isub            
	//   54  129:iload_2         
	//   55  130:isub            
	//   56  131:iload           4
	//   57  133:isub            
	//   58  134:iconst_2        
	//   59  135:idiv            
	//   60  136:istore_3        
		if(j < layoutparams.topMargin)
	//*  61  137:iload_3         
	//*  62  138:aload           7
	//*  63  140:getfield        #506 <Field int Toolbar$LayoutParams.topMargin>
	//*  64  143:icmpge          155
		{
			i = layoutparams.topMargin;
	//   65  146:aload           7
	//   66  148:getfield        #506 <Field int Toolbar$LayoutParams.topMargin>
	//   67  151:istore_2        
		} else
	//*  68  152:goto            196
		{
			k = i1 - i - k - j - l;
	//   69  155:iload           6
	//   70  157:iload_2         
	//   71  158:isub            
	//   72  159:iload           4
	//   73  161:isub            
	//   74  162:iload_3         
	//   75  163:isub            
	//   76  164:iload           5
	//   77  166:isub            
	//   78  167:istore          4
			i = j;
	//   79  169:iload_3         
	//   80  170:istore_2        
			if(k < layoutparams.bottomMargin)
	//*  81  171:iload           4
	//*  82  173:aload           7
	//*  83  175:getfield        #503 <Field int Toolbar$LayoutParams.bottomMargin>
	//*  84  178:icmpge          196
				i = Math.max(0, j - (layoutparams.bottomMargin - k));
	//   85  181:iconst_0        
	//   86  182:iload_3         
	//   87  183:aload           7
	//   88  185:getfield        #503 <Field int Toolbar$LayoutParams.bottomMargin>
	//   89  188:iload           4
	//   90  190:isub            
	//   91  191:isub            
	//   92  192:invokestatic    #511 <Method int Math.max(int, int)>
	//   93  195:istore_2        
		}
		return l + i;
	//   94  196:iload           5
	//   95  198:iload_2         
	//   96  199:iadd            
	//   97  200:ireturn         
	}

	private int getChildVerticalGravity(int i)
	{
		i &= 0x70;
	//    0    0:iload_1         
	//    1    1:bipush          112
	//    2    3:iand            
	//    3    4:istore_1        
		switch(i)
	//*   4    5:iload_1         
		{
	//*   5    6:lookupswitch    3: default 40
	//	               16: 43
	//	               48: 43
	//	               80: 43
	//*   6   40:goto            45
		case 16: // '\020'
		case 48: // '0'
		case 80: // 'P'
			return i;
	//    7   43:iload_1         
	//    8   44:ireturn         
		}
		return mGravity & 0x70;
	//    9   45:aload_0         
	//   10   46:getfield        #111 <Field int mGravity>
	//   11   49:bipush          112
	//   12   51:iand            
	//   13   52:ireturn         
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
	//   58  101:invokevirtual   #500 <Method int getPaddingBottom()>
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
	//   26   50:invokevirtual   #500 <Method int getPaddingBottom()>
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
	//*  47   91:icmpeq          129
		{
			i = j;
	//   48   94:iload_3         
	//   49   95:istore_2        
			if(i1 >= 0)
	//*  50   96:iload           6
	//*  51   98:iflt            129
			{
				if(k != 0)
	//*  52  101:iload           4
	//*  53  103:ifeq            120
					i1 = Math.min(android.view.View.MeasureSpec.getSize(j), i1);
	//   54  106:iload_3         
	//   55  107:invokestatic    #602 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   56  110:iload           6
	//   57  112:invokestatic    #605 <Method int Math.min(int, int)>
	//   58  115:istore          6
	//*  59  117:goto            120
				i = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
	//   60  120:iload           6
	//   61  122:ldc2            #599 <Int 0x40000000>
	//   62  125:invokestatic    #608 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   63  128:istore_2        
			}
		}
		view.measure(j1, i);
	//   64  129:aload_1         
	//   65  130:iload           7
	//   66  132:iload_2         
	//   67  133:invokevirtual   #591 <Method void View.measure(int, int)>
	//   68  136:return          
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
		if(!mCollapsible)
	//*   0    0:aload_0         
	//*   1    1:getfield        #620 <Field boolean mCollapsible>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int j = getChildCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #348 <Method int getChildCount()>
	//    7   13:istore_2        
		for(int i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          58
		{
			View view = getChildAt(i);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #362 <Method View getChildAt(int)>
	//   16   26:astore_3        
			if(shouldLayout(view) && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0)
	//*  17   27:aload_0         
	//*  18   28:aload_3         
	//*  19   29:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  20   32:ifeq            51
	//*  21   35:aload_3         
	//*  22   36:invokevirtual   #549 <Method int View.getMeasuredWidth()>
	//*  23   39:ifle            51
	//*  24   42:aload_3         
	//*  25   43:invokevirtual   #488 <Method int View.getMeasuredHeight()>
	//*  26   46:ifle            51
				return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
		}

	//   29   51:iload_1         
	//   30   52:iconst_1        
	//   31   53:iadd            
	//   32   54:istore_1        
	//*  33   55:goto            16
		return true;
	//   34   58:iconst_1        
	//   35   59:ireturn         
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
	//*   2    4:ifnonnull       12
			menuitemimpl = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		else
	//*   5    9:goto            20
			menuitemimpl = mExpandedMenuPresenter.mCurrentExpandedItem;
	//    6   12:aload_0         
	//    7   13:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//    8   16:getfield        #646 <Field MenuItemImpl Toolbar$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
	//    9   19:astore_1        
		if(menuitemimpl != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			menuitemimpl.collapseActionView();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #650 <Method boolean MenuItemImpl.collapseActionView()>
	//   14   28:pop             
	//   15   29:return          
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
			layoutparams.gravity = mButtonGravity & 0x70 | 0x800003;
	//   25   53:aload_1         
	//   26   54:aload_0         
	//   27   55:getfield        #169 <Field int mButtonGravity>
	//   28   58:bipush          112
	//   29   60:iand            
	//   30   61:ldc2            #480 <Int 0x800003>
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
	//    2    2:invokevirtual   #402 <Method Toolbar$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
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
	//*   4    6:ifnull          35
		{
			MenuBuilder menubuilder = mMenuView.peekMenu();
	//    5    9:aload_0         
	//    6   10:getfield        #427 <Field ActionMenuView mMenuView>
	//    7   13:invokevirtual   #433 <Method MenuBuilder ActionMenuView.peekMenu()>
	//    8   16:astore_2        
			if(menubuilder != null && menubuilder.hasVisibleItems())
	//*   9   17:aload_2         
	//*  10   18:ifnull          33
	//*  11   21:aload_2         
	//*  12   22:invokevirtual   #714 <Method boolean MenuBuilder.hasVisibleItems()>
	//*  13   25:ifeq            33
				flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_1        
			else
	//*  16   30:goto            35
				flag = false;
	//   17   33:iconst_0        
	//   18   34:istore_1        
		}
		if(flag)
	//*  19   35:iload_1         
	//*  20   36:ifeq            55
			return Math.max(getContentInsetEnd(), Math.max(mContentInsetEndWithActions, 0));
	//   21   39:aload_0         
	//   22   40:invokevirtual   #695 <Method int getContentInsetEnd()>
	//   23   43:aload_0         
	//   24   44:getfield        #247 <Field int mContentInsetEndWithActions>
	//   25   47:iconst_0        
	//   26   48:invokestatic    #511 <Method int Math.max(int, int)>
	//   27   51:invokestatic    #511 <Method int Math.max(int, int)>
	//   28   54:ireturn         
		else
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

	public Drawable getOverflowIcon()
	{
		ensureMenu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #737 <Method void ensureMenu()>
		return mMenuView.getOverflowIcon();
	//    2    4:aload_0         
	//    3    5:getfield        #427 <Field ActionMenuView mMenuView>
	//    4    8:invokevirtual   #743 <Method Drawable ActionMenuView.getOverflowIcon()>
	//    5   11:areturn         
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
	//    1    1:getfield        #747 <Field CharSequence mSubtitleText>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		return mTitleText;
	//    0    0:aload_0         
	//    1    1:getfield        #750 <Field CharSequence mTitleText>
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
	//*   1    1:getfield        #758 <Field ToolbarWidgetWrapper mWrapper>
	//*   2    4:ifnonnull       20
			mWrapper = new ToolbarWidgetWrapper(this, true);
	//    3    7:aload_0         
	//    4    8:new             #760 <Class ToolbarWidgetWrapper>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #763 <Method void ToolbarWidgetWrapper(Toolbar, boolean)>
	//    9   17:putfield        #758 <Field ToolbarWidgetWrapper mWrapper>
		return ((DecorToolbar) (mWrapper));
	//   10   20:aload_0         
	//   11   21:getfield        #758 <Field ToolbarWidgetWrapper mWrapper>
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
	//    5   11:getfield        #646 <Field MenuItemImpl Toolbar$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
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
	//    5   11:invokevirtual   #767 <Method boolean ActionMenuView.hideOverflowMenu()>
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
	//    1    1:invokespecial   #771 <Method MenuInflater getMenuInflater()>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #772 <Method Menu getMenu()>
	//    5    9:invokevirtual   #778 <Method void MenuInflater.inflate(int, Menu)>
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
	//    5   11:invokevirtual   #781 <Method boolean ActionMenuView.isOverflowMenuShowPending()>
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
	//    5   11:invokevirtual   #784 <Method boolean ActionMenuView.isOverflowMenuShowing()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean isTitleTruncated()
	{
		if(mTitleTextView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #787 <Field TextView mTitleTextView>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		Layout layout = mTitleTextView.getLayout();
	//    5    9:aload_0         
	//    6   10:getfield        #787 <Field TextView mTitleTextView>
	//    7   13:invokevirtual   #793 <Method Layout TextView.getLayout()>
	//    8   16:astore_3        
		if(layout == null)
	//*   9   17:aload_3         
	//*  10   18:ifnonnull       23
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		int j = layout.getLineCount();
	//   13   23:aload_3         
	//   14   24:invokevirtual   #798 <Method int Layout.getLineCount()>
	//   15   27:istore_2        
		for(int i = 0; i < j; i++)
	//*  16   28:iconst_0        
	//*  17   29:istore_1        
	//*  18   30:iload_1         
	//*  19   31:iload_2         
	//*  20   32:icmpge          52
			if(layout.getEllipsisCount(i) > 0)
	//*  21   35:aload_3         
	//*  22   36:iload_1         
	//*  23   37:invokevirtual   #801 <Method int Layout.getEllipsisCount(int)>
	//*  24   40:ifle            45
				return true;
	//   25   43:iconst_1        
	//   26   44:ireturn         

	//   27   45:iload_1         
	//   28   46:iconst_1        
	//   29   47:iadd            
	//   30   48:istore_1        
	//*  31   49:goto            30
		return false;
	//   32   52:iconst_0        
	//   33   53:ireturn         
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #804 <Method void ViewGroup.onDetachedFromWindow()>
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
	//    1    1:invokevirtual   #811 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i == 9)
	//*   3    5:iload_2         
	//*   4    6:bipush          9
	//*   5    8:icmpne          16
			mEatingHover = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #813 <Field boolean mEatingHover>
		if(!mEatingHover)
	//*   9   16:aload_0         
	//*  10   17:getfield        #813 <Field boolean mEatingHover>
	//*  11   20:ifne            44
		{
			boolean flag = super.onHoverEvent(motionevent);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokespecial   #815 <Method boolean ViewGroup.onHoverEvent(MotionEvent)>
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
	//   23   41:putfield        #813 <Field boolean mEatingHover>
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
	//   32   57:putfield        #813 <Field boolean mEatingHover>
		return true;
	//   33   60:iconst_1        
	//   34   61:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		int i1;
		int l3;
		int i4;
		int j4;
		int ai[];
label0:
		{
			boolean flag2;
			if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          14
				flag2 = true;
	//    4    8:iconst_1        
	//    5    9:istore          8
			else
	//*   6   11:goto            17
				flag2 = false;
	//    7   14:iconst_0        
	//    8   15:istore          8
			i4 = getWidth();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #820 <Method int getWidth()>
	//   11   21:istore          12
			int k4 = getHeight();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #497 <Method int getHeight()>
	//   14   27:istore          14
			l3 = getPaddingLeft();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #575 <Method int getPaddingLeft()>
	//   17   33:istore          11
			j4 = getPaddingRight();
	//   18   35:aload_0         
	//   19   36:invokevirtual   #578 <Method int getPaddingRight()>
	//   20   39:istore          13
			int i3 = getPaddingTop();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #494 <Method int getPaddingTop()>
	//   23   45:istore          10
			int l4 = getPaddingBottom();
	//   24   47:aload_0         
	//   25   48:invokevirtual   #500 <Method int getPaddingBottom()>
	//   26   51:istore          15
			k = l3;
	//   27   53:iload           11
	//   28   55:istore          4
			int j1 = i4 - j4;
	//   29   57:iload           12
	//   30   59:iload           13
	//   31   61:isub            
	//   32   62:istore          7
			ai = mTempMargins;
	//   33   64:aload_0         
	//   34   65:getfield        #122 <Field int[] mTempMargins>
	//   35   68:astore          19
			ai[1] = 0;
	//   36   70:aload           19
	//   37   72:iconst_1        
	//   38   73:iconst_0        
	//   39   74:iastore         
			ai[0] = 0;
	//   40   75:aload           19
	//   41   77:iconst_0        
	//   42   78:iconst_0        
	//   43   79:iastore         
			i = ViewCompat.getMinimumHeight(((View) (this)));
	//   44   80:aload_0         
	//   45   81:invokestatic    #823 <Method int ViewCompat.getMinimumHeight(View)>
	//   46   84:istore_2        
			if(i >= 0)
	//*  47   85:iload_2         
	//*  48   86:iflt            102
				i1 = Math.min(i, l - j);
	//   49   89:iload_2         
	//   50   90:iload           5
	//   51   92:iload_3         
	//   52   93:isub            
	//   53   94:invokestatic    #605 <Method int Math.min(int, int)>
	//   54   97:istore          6
			else
	//*  55   99:goto            105
				i1 = 0;
	//   56  102:iconst_0        
	//   57  103:istore          6
			i = k;
	//   58  105:iload           4
	//   59  107:istore_2        
			j = j1;
	//   60  108:iload           7
	//   61  110:istore_3        
			if(shouldLayout(((View) (mNavButtonView))))
	//*  62  111:aload_0         
	//*  63  112:aload_0         
	//*  64  113:getfield        #473 <Field ImageButton mNavButtonView>
	//*  65  116:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  66  119:ifeq            166
				if(flag2)
	//*  67  122:iload           8
	//*  68  124:ifeq            148
				{
					j = layoutChildRight(((View) (mNavButtonView)), j1, ai, i1);
	//   69  127:aload_0         
	//   70  128:aload_0         
	//   71  129:getfield        #473 <Field ImageButton mNavButtonView>
	//   72  132:iload           7
	//   73  134:aload           19
	//   74  136:iload           6
	//   75  138:invokespecial   #825 <Method int layoutChildRight(View, int, int[], int)>
	//   76  141:istore_3        
					i = k;
	//   77  142:iload           4
	//   78  144:istore_2        
				} else
	//*  79  145:goto            166
				{
					i = layoutChildLeft(((View) (mNavButtonView)), k, ai, i1);
	//   80  148:aload_0         
	//   81  149:aload_0         
	//   82  150:getfield        #473 <Field ImageButton mNavButtonView>
	//   83  153:iload           4
	//   84  155:aload           19
	//   85  157:iload           6
	//   86  159:invokespecial   #827 <Method int layoutChildLeft(View, int, int[], int)>
	//   87  162:istore_2        
					j = j1;
	//   88  163:iload           7
	//   89  165:istore_3        
				}
			k = i;
	//   90  166:iload_2         
	//   91  167:istore          4
			l = j;
	//   92  169:iload_3         
	//   93  170:istore          5
			if(shouldLayout(((View) (mCollapseButtonView))))
	//*  94  172:aload_0         
	//*  95  173:aload_0         
	//*  96  174:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  97  177:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  98  180:ifeq            227
				if(flag2)
	//*  99  183:iload           8
	//* 100  185:ifeq            209
				{
					l = layoutChildRight(((View) (mCollapseButtonView)), j, ai, i1);
	//  101  188:aload_0         
	//  102  189:aload_0         
	//  103  190:getfield        #656 <Field ImageButton mCollapseButtonView>
	//  104  193:iload_3         
	//  105  194:aload           19
	//  106  196:iload           6
	//  107  198:invokespecial   #825 <Method int layoutChildRight(View, int, int[], int)>
	//  108  201:istore          5
					k = i;
	//  109  203:iload_2         
	//  110  204:istore          4
				} else
	//* 111  206:goto            227
				{
					k = layoutChildLeft(((View) (mCollapseButtonView)), i, ai, i1);
	//  112  209:aload_0         
	//  113  210:aload_0         
	//  114  211:getfield        #656 <Field ImageButton mCollapseButtonView>
	//  115  214:iload_2         
	//  116  215:aload           19
	//  117  217:iload           6
	//  118  219:invokespecial   #827 <Method int layoutChildLeft(View, int, int[], int)>
	//  119  222:istore          4
					l = j;
	//  120  224:iload_3         
	//  121  225:istore          5
				}
			j = k;
	//  122  227:iload           4
	//  123  229:istore_3        
			i = l;
	//  124  230:iload           5
	//  125  232:istore_2        
			if(shouldLayout(((View) (mMenuView))))
	//* 126  233:aload_0         
	//* 127  234:aload_0         
	//* 128  235:getfield        #427 <Field ActionMenuView mMenuView>
	//* 129  238:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 130  241:ifeq            288
				if(flag2)
	//* 131  244:iload           8
	//* 132  246:ifeq            270
				{
					j = layoutChildLeft(((View) (mMenuView)), k, ai, i1);
	//  133  249:aload_0         
	//  134  250:aload_0         
	//  135  251:getfield        #427 <Field ActionMenuView mMenuView>
	//  136  254:iload           4
	//  137  256:aload           19
	//  138  258:iload           6
	//  139  260:invokespecial   #827 <Method int layoutChildLeft(View, int, int[], int)>
	//  140  263:istore_3        
					i = l;
	//  141  264:iload           5
	//  142  266:istore_2        
				} else
	//* 143  267:goto            288
				{
					i = layoutChildRight(((View) (mMenuView)), l, ai, i1);
	//  144  270:aload_0         
	//  145  271:aload_0         
	//  146  272:getfield        #427 <Field ActionMenuView mMenuView>
	//  147  275:iload           5
	//  148  277:aload           19
	//  149  279:iload           6
	//  150  281:invokespecial   #825 <Method int layoutChildRight(View, int, int[], int)>
	//  151  284:istore_2        
					j = k;
	//  152  285:iload           4
	//  153  287:istore_3        
				}
			l = getCurrentContentInsetLeft();
	//  154  288:aload_0         
	//  155  289:invokevirtual   #829 <Method int getCurrentContentInsetLeft()>
	//  156  292:istore          5
			k = getCurrentContentInsetRight();
	//  157  294:aload_0         
	//  158  295:invokevirtual   #831 <Method int getCurrentContentInsetRight()>
	//  159  298:istore          4
			ai[0] = Math.max(0, l - j);
	//  160  300:aload           19
	//  161  302:iconst_0        
	//  162  303:iconst_0        
	//  163  304:iload           5
	//  164  306:iload_3         
	//  165  307:isub            
	//  166  308:invokestatic    #511 <Method int Math.max(int, int)>
	//  167  311:iastore         
			ai[1] = Math.max(0, k - (i4 - j4 - i));
	//  168  312:aload           19
	//  169  314:iconst_1        
	//  170  315:iconst_0        
	//  171  316:iload           4
	//  172  318:iload           12
	//  173  320:iload           13
	//  174  322:isub            
	//  175  323:iload_2         
	//  176  324:isub            
	//  177  325:isub            
	//  178  326:invokestatic    #511 <Method int Math.max(int, int)>
	//  179  329:iastore         
			j = Math.max(j, l);
	//  180  330:iload_3         
	//  181  331:iload           5
	//  182  333:invokestatic    #511 <Method int Math.max(int, int)>
	//  183  336:istore_3        
			k = Math.min(i, i4 - j4 - k);
	//  184  337:iload_2         
	//  185  338:iload           12
	//  186  340:iload           13
	//  187  342:isub            
	//  188  343:iload           4
	//  189  345:isub            
	//  190  346:invokestatic    #605 <Method int Math.min(int, int)>
	//  191  349:istore          4
			i = j;
	//  192  351:iload_3         
	//  193  352:istore_2        
			l = k;
	//  194  353:iload           4
	//  195  355:istore          5
			if(shouldLayout(mExpandedActionView))
	//* 196  357:aload_0         
	//* 197  358:aload_0         
	//* 198  359:getfield        #404 <Field View mExpandedActionView>
	//* 199  362:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 200  365:ifeq            412
				if(flag2)
	//* 201  368:iload           8
	//* 202  370:ifeq            394
				{
					l = layoutChildRight(mExpandedActionView, k, ai, i1);
	//  203  373:aload_0         
	//  204  374:aload_0         
	//  205  375:getfield        #404 <Field View mExpandedActionView>
	//  206  378:iload           4
	//  207  380:aload           19
	//  208  382:iload           6
	//  209  384:invokespecial   #825 <Method int layoutChildRight(View, int, int[], int)>
	//  210  387:istore          5
					i = j;
	//  211  389:iload_3         
	//  212  390:istore_2        
				} else
	//* 213  391:goto            412
				{
					i = layoutChildLeft(mExpandedActionView, j, ai, i1);
	//  214  394:aload_0         
	//  215  395:aload_0         
	//  216  396:getfield        #404 <Field View mExpandedActionView>
	//  217  399:iload_3         
	//  218  400:aload           19
	//  219  402:iload           6
	//  220  404:invokespecial   #827 <Method int layoutChildLeft(View, int, int[], int)>
	//  221  407:istore_2        
					l = k;
	//  222  408:iload           4
	//  223  410:istore          5
				}
			j = i;
	//  224  412:iload_2         
	//  225  413:istore_3        
			k = l;
	//  226  414:iload           5
	//  227  416:istore          4
			if(shouldLayout(((View) (mLogoView))))
	//* 228  418:aload_0         
	//* 229  419:aload_0         
	//* 230  420:getfield        #417 <Field ImageView mLogoView>
	//* 231  423:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 232  426:ifeq            473
				if(flag2)
	//* 233  429:iload           8
	//* 234  431:ifeq            455
				{
					k = layoutChildRight(((View) (mLogoView)), l, ai, i1);
	//  235  434:aload_0         
	//  236  435:aload_0         
	//  237  436:getfield        #417 <Field ImageView mLogoView>
	//  238  439:iload           5
	//  239  441:aload           19
	//  240  443:iload           6
	//  241  445:invokespecial   #825 <Method int layoutChildRight(View, int, int[], int)>
	//  242  448:istore          4
					j = i;
	//  243  450:iload_2         
	//  244  451:istore_3        
				} else
	//* 245  452:goto            473
				{
					j = layoutChildLeft(((View) (mLogoView)), i, ai, i1);
	//  246  455:aload_0         
	//  247  456:aload_0         
	//  248  457:getfield        #417 <Field ImageView mLogoView>
	//  249  460:iload_2         
	//  250  461:aload           19
	//  251  463:iload           6
	//  252  465:invokespecial   #827 <Method int layoutChildLeft(View, int, int[], int)>
	//  253  468:istore_3        
					k = l;
	//  254  469:iload           5
	//  255  471:istore          4
				}
			flag = shouldLayout(((View) (mTitleTextView)));
	//  256  473:aload_0         
	//  257  474:aload_0         
	//  258  475:getfield        #787 <Field TextView mTitleTextView>
	//  259  478:invokespecial   #375 <Method boolean shouldLayout(View)>
	//  260  481:istore_1        
			boolean flag3 = shouldLayout(((View) (mSubtitleTextView)));
	//  261  482:aload_0         
	//  262  483:aload_0         
	//  263  484:getfield        #833 <Field TextView mSubtitleTextView>
	//  264  487:invokespecial   #375 <Method boolean shouldLayout(View)>
	//  265  490:istore          16
			i = 0;
	//  266  492:iconst_0        
	//  267  493:istore_2        
			if(flag)
	//* 268  494:iload_1         
	//* 269  495:ifeq            532
			{
				LayoutParams layoutparams = (LayoutParams)mTitleTextView.getLayoutParams();
	//  270  498:aload_0         
	//  271  499:getfield        #787 <Field TextView mTitleTextView>
	//  272  502:invokevirtual   #834 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  273  505:checkcast       #15  <Class Toolbar$LayoutParams>
	//  274  508:astore          17
				i = layoutparams.topMargin + mTitleTextView.getMeasuredHeight() + layoutparams.bottomMargin + 0;
	//  275  510:aload           17
	//  276  512:getfield        #506 <Field int Toolbar$LayoutParams.topMargin>
	//  277  515:aload_0         
	//  278  516:getfield        #787 <Field TextView mTitleTextView>
	//  279  519:invokevirtual   #835 <Method int TextView.getMeasuredHeight()>
	//  280  522:iadd            
	//  281  523:aload           17
	//  282  525:getfield        #503 <Field int Toolbar$LayoutParams.bottomMargin>
	//  283  528:iadd            
	//  284  529:iconst_0        
	//  285  530:iadd            
	//  286  531:istore_2        
			}
			int i2 = i;
	//  287  532:iload_2         
	//  288  533:istore          9
			if(flag3)
	//* 289  535:iload           16
	//* 290  537:ifeq            575
			{
				LayoutParams layoutparams1 = (LayoutParams)mSubtitleTextView.getLayoutParams();
	//  291  540:aload_0         
	//  292  541:getfield        #833 <Field TextView mSubtitleTextView>
	//  293  544:invokevirtual   #834 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  294  547:checkcast       #15  <Class Toolbar$LayoutParams>
	//  295  550:astore          17
				i2 = i + (layoutparams1.topMargin + mSubtitleTextView.getMeasuredHeight() + layoutparams1.bottomMargin);
	//  296  552:iload_2         
	//  297  553:aload           17
	//  298  555:getfield        #506 <Field int Toolbar$LayoutParams.topMargin>
	//  299  558:aload_0         
	//  300  559:getfield        #833 <Field TextView mSubtitleTextView>
	//  301  562:invokevirtual   #835 <Method int TextView.getMeasuredHeight()>
	//  302  565:iadd            
	//  303  566:aload           17
	//  304  568:getfield        #503 <Field int Toolbar$LayoutParams.bottomMargin>
	//  305  571:iadd            
	//  306  572:iadd            
	//  307  573:istore          9
			}
			if(!flag)
	//* 308  575:iload_1         
	//* 309  576:ifne            590
			{
				i = j;
	//  310  579:iload_3         
	//  311  580:istore_2        
				l = k;
	//  312  581:iload           4
	//  313  583:istore          5
				if(!flag3)
					break label0;
	//  314  585:iload           16
	//  315  587:ifeq            1356
			}
			Object obj;
			if(flag)
	//* 316  590:iload_1         
	//* 317  591:ifeq            603
				obj = ((Object) (mTitleTextView));
	//  318  594:aload_0         
	//  319  595:getfield        #787 <Field TextView mTitleTextView>
	//  320  598:astore          17
			else
	//* 321  600:goto            609
				obj = ((Object) (mSubtitleTextView));
	//  322  603:aload_0         
	//  323  604:getfield        #833 <Field TextView mSubtitleTextView>
	//  324  607:astore          17
			Object obj1;
			if(flag3)
	//* 325  609:iload           16
	//* 326  611:ifeq            623
				obj1 = ((Object) (mSubtitleTextView));
	//  327  614:aload_0         
	//  328  615:getfield        #833 <Field TextView mSubtitleTextView>
	//  329  618:astore          18
			else
	//* 330  620:goto            629
				obj1 = ((Object) (mTitleTextView));
	//  331  623:aload_0         
	//  332  624:getfield        #787 <Field TextView mTitleTextView>
	//  333  627:astore          18
			obj = ((Object) ((LayoutParams)((View) (obj)).getLayoutParams()));
	//  334  629:aload           17
	//  335  631:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  336  634:checkcast       #15  <Class Toolbar$LayoutParams>
	//  337  637:astore          17
			obj1 = ((Object) ((LayoutParams)((View) (obj1)).getLayoutParams()));
	//  338  639:aload           18
	//  339  641:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  340  644:checkcast       #15  <Class Toolbar$LayoutParams>
	//  341  647:astore          18
			boolean flag1;
			if(flag && mTitleTextView.getMeasuredWidth() > 0 || flag3 && mSubtitleTextView.getMeasuredWidth() > 0)
	//* 342  649:iload_1         
	//* 343  650:ifeq            663
	//* 344  653:aload_0         
	//* 345  654:getfield        #787 <Field TextView mTitleTextView>
	//* 346  657:invokevirtual   #836 <Method int TextView.getMeasuredWidth()>
	//* 347  660:ifgt            678
	//* 348  663:iload           16
	//* 349  665:ifeq            684
	//* 350  668:aload_0         
	//* 351  669:getfield        #833 <Field TextView mSubtitleTextView>
	//* 352  672:invokevirtual   #836 <Method int TextView.getMeasuredWidth()>
	//* 353  675:ifle            684
				flag1 = true;
	//  354  678:iconst_1        
	//  355  679:istore          7
			else
	//* 356  681:goto            687
				flag1 = false;
	//  357  684:iconst_0        
	//  358  685:istore          7
			switch(mGravity & 0x70)
	//* 359  687:aload_0         
	//* 360  688:getfield        #111 <Field int mGravity>
	//* 361  691:bipush          112
	//* 362  693:iand            
			{
	//* 363  694:lookupswitch    3: default 728
	//	               16: 750
	//	               48: 731
	//	               80: 857
	//* 364  728:goto            750
			case 48: // '0'
				i = getPaddingTop() + ((LayoutParams) (obj)).topMargin + mTitleMarginTop;
	//  365  731:aload_0         
	//  366  732:invokevirtual   #494 <Method int getPaddingTop()>
	//  367  735:aload           17
	//  368  737:getfield        #506 <Field int Toolbar$LayoutParams.topMargin>
	//  369  740:iadd            
	//  370  741:aload_0         
	//  371  742:getfield        #186 <Field int mTitleMarginTop>
	//  372  745:iadd            
	//  373  746:istore_2        
				break;

	//* 374  747:goto            877
			case 16: // '\020'
			default:
				l = (k4 - i3 - l4 - i2) / 2;
	//  375  750:iload           14
	//  376  752:iload           10
	//  377  754:isub            
	//  378  755:iload           15
	//  379  757:isub            
	//  380  758:iload           9
	//  381  760:isub            
	//  382  761:iconst_2        
	//  383  762:idiv            
	//  384  763:istore          5
				if(l < ((LayoutParams) (obj)).topMargin + mTitleMarginTop)
	//* 385  765:iload           5
	//* 386  767:aload           17
	//* 387  769:getfield        #506 <Field int Toolbar$LayoutParams.topMargin>
	//* 388  772:aload_0         
	//* 389  773:getfield        #186 <Field int mTitleMarginTop>
	//* 390  776:iadd            
	//* 391  777:icmpge          794
				{
					i = ((LayoutParams) (obj)).topMargin + mTitleMarginTop;
	//  392  780:aload           17
	//  393  782:getfield        #506 <Field int Toolbar$LayoutParams.topMargin>
	//  394  785:aload_0         
	//  395  786:getfield        #186 <Field int mTitleMarginTop>
	//  396  789:iadd            
	//  397  790:istore_2        
				} else
	//* 398  791:goto            849
				{
					i2 = k4 - l4 - i2 - l - i3;
	//  399  794:iload           14
	//  400  796:iload           15
	//  401  798:isub            
	//  402  799:iload           9
	//  403  801:isub            
	//  404  802:iload           5
	//  405  804:isub            
	//  406  805:iload           10
	//  407  807:isub            
	//  408  808:istore          9
					i = l;
	//  409  810:iload           5
	//  410  812:istore_2        
					if(i2 < ((LayoutParams) (obj)).bottomMargin + mTitleMarginBottom)
	//* 411  813:iload           9
	//* 412  815:aload           17
	//* 413  817:getfield        #503 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 414  820:aload_0         
	//* 415  821:getfield        #184 <Field int mTitleMarginBottom>
	//* 416  824:iadd            
	//* 417  825:icmpge          849
						i = Math.max(0, l - ((((LayoutParams) (obj1)).bottomMargin + mTitleMarginBottom) - i2));
	//  418  828:iconst_0        
	//  419  829:iload           5
	//  420  831:aload           18
	//  421  833:getfield        #503 <Field int Toolbar$LayoutParams.bottomMargin>
	//  422  836:aload_0         
	//  423  837:getfield        #184 <Field int mTitleMarginBottom>
	//  424  840:iadd            
	//  425  841:iload           9
	//  426  843:isub            
	//  427  844:isub            
	//  428  845:invokestatic    #511 <Method int Math.max(int, int)>
	//  429  848:istore_2        
				}
				i = i3 + i;
	//  430  849:iload           10
	//  431  851:iload_2         
	//  432  852:iadd            
	//  433  853:istore_2        
				break;

	//* 434  854:goto            877
			case 80: // 'P'
				i = k4 - l4 - ((LayoutParams) (obj1)).bottomMargin - mTitleMarginBottom - i2;
	//  435  857:iload           14
	//  436  859:iload           15
	//  437  861:isub            
	//  438  862:aload           18
	//  439  864:getfield        #503 <Field int Toolbar$LayoutParams.bottomMargin>
	//  440  867:isub            
	//  441  868:aload_0         
	//  442  869:getfield        #184 <Field int mTitleMarginBottom>
	//  443  872:isub            
	//  444  873:iload           9
	//  445  875:isub            
	//  446  876:istore_2        
				break;
			}
			if(flag2)
	//* 447  877:iload           8
	//* 448  879:ifeq            1120
			{
				if(flag1)
	//* 449  882:iload           7
	//* 450  884:ifeq            896
					l = mTitleMarginStart;
	//  451  887:aload_0         
	//  452  888:getfield        #190 <Field int mTitleMarginStart>
	//  453  891:istore          5
				else
	//* 454  893:goto            899
					l = 0;
	//  455  896:iconst_0        
	//  456  897:istore          5
				l -= ai[1];
	//  457  899:iload           5
	//  458  901:aload           19
	//  459  903:iconst_1        
	//  460  904:iaload          
	//  461  905:isub            
	//  462  906:istore          5
				k -= Math.max(0, l);
	//  463  908:iload           4
	//  464  910:iconst_0        
	//  465  911:iload           5
	//  466  913:invokestatic    #511 <Method int Math.max(int, int)>
	//  467  916:isub            
	//  468  917:istore          4
				ai[1] = Math.max(0, -l);
	//  469  919:aload           19
	//  470  921:iconst_1        
	//  471  922:iconst_0        
	//  472  923:iload           5
	//  473  925:ineg            
	//  474  926:invokestatic    #511 <Method int Math.max(int, int)>
	//  475  929:iastore         
				int j2 = k;
	//  476  930:iload           4
	//  477  932:istore          9
				l = k;
	//  478  934:iload           4
	//  479  936:istore          5
				int j3 = i;
	//  480  938:iload_2         
	//  481  939:istore          10
				int k1 = j2;
	//  482  941:iload           9
	//  483  943:istore          8
				if(flag)
	//* 484  945:iload_1         
	//* 485  946:ifeq            1017
				{
					LayoutParams layoutparams2 = (LayoutParams)mTitleTextView.getLayoutParams();
	//  486  949:aload_0         
	//  487  950:getfield        #787 <Field TextView mTitleTextView>
	//  488  953:invokevirtual   #834 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  489  956:checkcast       #15  <Class Toolbar$LayoutParams>
	//  490  959:astore          17
					k1 = j2 - mTitleTextView.getMeasuredWidth();
	//  491  961:iload           9
	//  492  963:aload_0         
	//  493  964:getfield        #787 <Field TextView mTitleTextView>
	//  494  967:invokevirtual   #836 <Method int TextView.getMeasuredWidth()>
	//  495  970:isub            
	//  496  971:istore          8
					j3 = i + mTitleTextView.getMeasuredHeight();
	//  497  973:iload_2         
	//  498  974:aload_0         
	//  499  975:getfield        #787 <Field TextView mTitleTextView>
	//  500  978:invokevirtual   #835 <Method int TextView.getMeasuredHeight()>
	//  501  981:iadd            
	//  502  982:istore          10
					mTitleTextView.layout(k1, i, j2, j3);
	//  503  984:aload_0         
	//  504  985:getfield        #787 <Field TextView mTitleTextView>
	//  505  988:iload           8
	//  506  990:iload_2         
	//  507  991:iload           9
	//  508  993:iload           10
	//  509  995:invokevirtual   #837 <Method void TextView.layout(int, int, int, int)>
					k1 -= mTitleMarginEnd;
	//  510  998:iload           8
	//  511 1000:aload_0         
	//  512 1001:getfield        #188 <Field int mTitleMarginEnd>
	//  513 1004:isub            
	//  514 1005:istore          8
					j3 += layoutparams2.bottomMargin;
	//  515 1007:iload           10
	//  516 1009:aload           17
	//  517 1011:getfield        #503 <Field int Toolbar$LayoutParams.bottomMargin>
	//  518 1014:iadd            
	//  519 1015:istore          10
				}
				i = l;
	//  520 1017:iload           5
	//  521 1019:istore_2        
				if(flag3)
	//* 522 1020:iload           16
	//* 523 1022:ifeq            1098
				{
					LayoutParams layoutparams3 = (LayoutParams)mSubtitleTextView.getLayoutParams();
	//  524 1025:aload_0         
	//  525 1026:getfield        #833 <Field TextView mSubtitleTextView>
	//  526 1029:invokevirtual   #834 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  527 1032:checkcast       #15  <Class Toolbar$LayoutParams>
	//  528 1035:astore          17
					i = j3 + layoutparams3.topMargin;
	//  529 1037:iload           10
	//  530 1039:aload           17
	//  531 1041:getfield        #506 <Field int Toolbar$LayoutParams.topMargin>
	//  532 1044:iadd            
	//  533 1045:istore_2        
					int k2 = mSubtitleTextView.getMeasuredWidth();
	//  534 1046:aload_0         
	//  535 1047:getfield        #833 <Field TextView mSubtitleTextView>
	//  536 1050:invokevirtual   #836 <Method int TextView.getMeasuredWidth()>
	//  537 1053:istore          9
					j3 = i + mSubtitleTextView.getMeasuredHeight();
	//  538 1055:iload_2         
	//  539 1056:aload_0         
	//  540 1057:getfield        #833 <Field TextView mSubtitleTextView>
	//  541 1060:invokevirtual   #835 <Method int TextView.getMeasuredHeight()>
	//  542 1063:iadd            
	//  543 1064:istore          10
					mSubtitleTextView.layout(l - k2, i, l, j3);
	//  544 1066:aload_0         
	//  545 1067:getfield        #833 <Field TextView mSubtitleTextView>
	//  546 1070:iload           5
	//  547 1072:iload           9
	//  548 1074:isub            
	//  549 1075:iload_2         
	//  550 1076:iload           5
	//  551 1078:iload           10
	//  552 1080:invokevirtual   #837 <Method void TextView.layout(int, int, int, int)>
					i = l - mTitleMarginEnd;
	//  553 1083:iload           5
	//  554 1085:aload_0         
	//  555 1086:getfield        #188 <Field int mTitleMarginEnd>
	//  556 1089:isub            
	//  557 1090:istore_2        
					l = layoutparams3.bottomMargin;
	//  558 1091:aload           17
	//  559 1093:getfield        #503 <Field int Toolbar$LayoutParams.bottomMargin>
	//  560 1096:istore          5
				}
				if(flag1)
	//* 561 1098:iload           7
	//* 562 1100:ifeq            1111
					k = Math.min(k1, i);
	//  563 1103:iload           8
	//  564 1105:iload_2         
	//  565 1106:invokestatic    #605 <Method int Math.min(int, int)>
	//  566 1109:istore          4
				i = j;
	//  567 1111:iload_3         
	//  568 1112:istore_2        
				l = k;
	//  569 1113:iload           4
	//  570 1115:istore          5
			} else
	//* 571 1117:goto            1356
			{
				if(flag1)
	//* 572 1120:iload           7
	//* 573 1122:ifeq            1134
					l = mTitleMarginStart;
	//  574 1125:aload_0         
	//  575 1126:getfield        #190 <Field int mTitleMarginStart>
	//  576 1129:istore          5
				else
	//* 577 1131:goto            1137
					l = 0;
	//  578 1134:iconst_0        
	//  579 1135:istore          5
				l -= ai[0];
	//  580 1137:iload           5
	//  581 1139:aload           19
	//  582 1141:iconst_0        
	//  583 1142:iaload          
	//  584 1143:isub            
	//  585 1144:istore          5
				j += Math.max(0, l);
	//  586 1146:iload_3         
	//  587 1147:iconst_0        
	//  588 1148:iload           5
	//  589 1150:invokestatic    #511 <Method int Math.max(int, int)>
	//  590 1153:iadd            
	//  591 1154:istore_3        
				ai[0] = Math.max(0, -l);
	//  592 1155:aload           19
	//  593 1157:iconst_0        
	//  594 1158:iconst_0        
	//  595 1159:iload           5
	//  596 1161:ineg            
	//  597 1162:invokestatic    #511 <Method int Math.max(int, int)>
	//  598 1165:iastore         
				int l2 = j;
	//  599 1166:iload_3         
	//  600 1167:istore          9
				l = j;
	//  601 1169:iload_3         
	//  602 1170:istore          5
				int k3 = i;
	//  603 1172:iload_2         
	//  604 1173:istore          10
				int l1 = l2;
	//  605 1175:iload           9
	//  606 1177:istore          8
				if(flag)
	//* 607 1179:iload_1         
	//* 608 1180:ifeq            1251
				{
					LayoutParams layoutparams4 = (LayoutParams)mTitleTextView.getLayoutParams();
	//  609 1183:aload_0         
	//  610 1184:getfield        #787 <Field TextView mTitleTextView>
	//  611 1187:invokevirtual   #834 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  612 1190:checkcast       #15  <Class Toolbar$LayoutParams>
	//  613 1193:astore          17
					l1 = l2 + mTitleTextView.getMeasuredWidth();
	//  614 1195:iload           9
	//  615 1197:aload_0         
	//  616 1198:getfield        #787 <Field TextView mTitleTextView>
	//  617 1201:invokevirtual   #836 <Method int TextView.getMeasuredWidth()>
	//  618 1204:iadd            
	//  619 1205:istore          8
					k3 = i + mTitleTextView.getMeasuredHeight();
	//  620 1207:iload_2         
	//  621 1208:aload_0         
	//  622 1209:getfield        #787 <Field TextView mTitleTextView>
	//  623 1212:invokevirtual   #835 <Method int TextView.getMeasuredHeight()>
	//  624 1215:iadd            
	//  625 1216:istore          10
					mTitleTextView.layout(l2, i, l1, k3);
	//  626 1218:aload_0         
	//  627 1219:getfield        #787 <Field TextView mTitleTextView>
	//  628 1222:iload           9
	//  629 1224:iload_2         
	//  630 1225:iload           8
	//  631 1227:iload           10
	//  632 1229:invokevirtual   #837 <Method void TextView.layout(int, int, int, int)>
					l1 += mTitleMarginEnd;
	//  633 1232:iload           8
	//  634 1234:aload_0         
	//  635 1235:getfield        #188 <Field int mTitleMarginEnd>
	//  636 1238:iadd            
	//  637 1239:istore          8
					k3 += layoutparams4.bottomMargin;
	//  638 1241:iload           10
	//  639 1243:aload           17
	//  640 1245:getfield        #503 <Field int Toolbar$LayoutParams.bottomMargin>
	//  641 1248:iadd            
	//  642 1249:istore          10
				}
				l2 = l;
	//  643 1251:iload           5
	//  644 1253:istore          9
				if(flag3)
	//* 645 1255:iload           16
	//* 646 1257:ifeq            1333
				{
					LayoutParams layoutparams5 = (LayoutParams)mSubtitleTextView.getLayoutParams();
	//  647 1260:aload_0         
	//  648 1261:getfield        #833 <Field TextView mSubtitleTextView>
	//  649 1264:invokevirtual   #834 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  650 1267:checkcast       #15  <Class Toolbar$LayoutParams>
	//  651 1270:astore          17
					i = k3 + layoutparams5.topMargin;
	//  652 1272:iload           10
	//  653 1274:aload           17
	//  654 1276:getfield        #506 <Field int Toolbar$LayoutParams.topMargin>
	//  655 1279:iadd            
	//  656 1280:istore_2        
					l2 = l + mSubtitleTextView.getMeasuredWidth();
	//  657 1281:iload           5
	//  658 1283:aload_0         
	//  659 1284:getfield        #833 <Field TextView mSubtitleTextView>
	//  660 1287:invokevirtual   #836 <Method int TextView.getMeasuredWidth()>
	//  661 1290:iadd            
	//  662 1291:istore          9
					k3 = i + mSubtitleTextView.getMeasuredHeight();
	//  663 1293:iload_2         
	//  664 1294:aload_0         
	//  665 1295:getfield        #833 <Field TextView mSubtitleTextView>
	//  666 1298:invokevirtual   #835 <Method int TextView.getMeasuredHeight()>
	//  667 1301:iadd            
	//  668 1302:istore          10
					mSubtitleTextView.layout(l, i, l2, k3);
	//  669 1304:aload_0         
	//  670 1305:getfield        #833 <Field TextView mSubtitleTextView>
	//  671 1308:iload           5
	//  672 1310:iload_2         
	//  673 1311:iload           9
	//  674 1313:iload           10
	//  675 1315:invokevirtual   #837 <Method void TextView.layout(int, int, int, int)>
					l2 += mTitleMarginEnd;
	//  676 1318:iload           9
	//  677 1320:aload_0         
	//  678 1321:getfield        #188 <Field int mTitleMarginEnd>
	//  679 1324:iadd            
	//  680 1325:istore          9
					i = layoutparams5.bottomMargin;
	//  681 1327:aload           17
	//  682 1329:getfield        #503 <Field int Toolbar$LayoutParams.bottomMargin>
	//  683 1332:istore_2        
				}
				i = j;
	//  684 1333:iload_3         
	//  685 1334:istore_2        
				l = k;
	//  686 1335:iload           4
	//  687 1337:istore          5
				if(flag1)
	//* 688 1339:iload           7
	//* 689 1341:ifeq            1356
				{
					i = Math.max(l1, l2);
	//  690 1344:iload           8
	//  691 1346:iload           9
	//  692 1348:invokestatic    #511 <Method int Math.max(int, int)>
	//  693 1351:istore_2        
					l = k;
	//  694 1352:iload           4
	//  695 1354:istore          5
				}
			}
		}
		addCustomViewsWithGravity(((List) (mTempViews)), 3);
	//  696 1356:aload_0         
	//  697 1357:aload_0         
	//  698 1358:getfield        #118 <Field ArrayList mTempViews>
	//  699 1361:iconst_3        
	//  700 1362:invokespecial   #839 <Method void addCustomViewsWithGravity(List, int)>
		k = mTempViews.size();
	//  701 1365:aload_0         
	//  702 1366:getfield        #118 <Field ArrayList mTempViews>
	//  703 1369:invokevirtual   #625 <Method int ArrayList.size()>
	//  704 1372:istore          4
		for(j = 0; j < k; j++)
	//* 705 1374:iconst_0        
	//* 706 1375:istore_3        
	//* 707 1376:iload_3         
	//* 708 1377:iload           4
	//* 709 1379:icmpge          1410
			i = layoutChildLeft((View)mTempViews.get(j), i, ai, i1);
	//  710 1382:aload_0         
	//  711 1383:aload_0         
	//  712 1384:getfield        #118 <Field ArrayList mTempViews>
	//  713 1387:iload_3         
	//  714 1388:invokevirtual   #626 <Method Object ArrayList.get(int)>
	//  715 1391:checkcast       #364 <Class View>
	//  716 1394:iload_2         
	//  717 1395:aload           19
	//  718 1397:iload           6
	//  719 1399:invokespecial   #827 <Method int layoutChildLeft(View, int, int[], int)>
	//  720 1402:istore_2        

	//  721 1403:iload_3         
	//  722 1404:iconst_1        
	//  723 1405:iadd            
	//  724 1406:istore_3        
	//* 725 1407:goto            1376
		addCustomViewsWithGravity(((List) (mTempViews)), 5);
	//  726 1410:aload_0         
	//  727 1411:aload_0         
	//  728 1412:getfield        #118 <Field ArrayList mTempViews>
	//  729 1415:iconst_5        
	//  730 1416:invokespecial   #839 <Method void addCustomViewsWithGravity(List, int)>
		k = mTempViews.size();
	//  731 1419:aload_0         
	//  732 1420:getfield        #118 <Field ArrayList mTempViews>
	//  733 1423:invokevirtual   #625 <Method int ArrayList.size()>
	//  734 1426:istore          4
		for(j = 0; j < k; j++)
	//* 735 1428:iconst_0        
	//* 736 1429:istore_3        
	//* 737 1430:iload_3         
	//* 738 1431:iload           4
	//* 739 1433:icmpge          1466
			l = layoutChildRight((View)mTempViews.get(j), l, ai, i1);
	//  740 1436:aload_0         
	//  741 1437:aload_0         
	//  742 1438:getfield        #118 <Field ArrayList mTempViews>
	//  743 1441:iload_3         
	//  744 1442:invokevirtual   #626 <Method Object ArrayList.get(int)>
	//  745 1445:checkcast       #364 <Class View>
	//  746 1448:iload           5
	//  747 1450:aload           19
	//  748 1452:iload           6
	//  749 1454:invokespecial   #825 <Method int layoutChildRight(View, int, int[], int)>
	//  750 1457:istore          5

	//  751 1459:iload_3         
	//  752 1460:iconst_1        
	//  753 1461:iadd            
	//  754 1462:istore_3        
	//* 755 1463:goto            1430
		addCustomViewsWithGravity(((List) (mTempViews)), 1);
	//  756 1466:aload_0         
	//  757 1467:aload_0         
	//  758 1468:getfield        #118 <Field ArrayList mTempViews>
	//  759 1471:iconst_1        
	//  760 1472:invokespecial   #839 <Method void addCustomViewsWithGravity(List, int)>
		k = getViewListMeasuredWidth(((List) (mTempViews)), ai);
	//  761 1475:aload_0         
	//  762 1476:aload_0         
	//  763 1477:getfield        #118 <Field ArrayList mTempViews>
	//  764 1480:aload           19
	//  765 1482:invokespecial   #841 <Method int getViewListMeasuredWidth(List, int[])>
	//  766 1485:istore          4
		j = (l3 + (i4 - l3 - j4) / 2) - k / 2;
	//  767 1487:iload           11
	//  768 1489:iload           12
	//  769 1491:iload           11
	//  770 1493:isub            
	//  771 1494:iload           13
	//  772 1496:isub            
	//  773 1497:iconst_2        
	//  774 1498:idiv            
	//  775 1499:iadd            
	//  776 1500:iload           4
	//  777 1502:iconst_2        
	//  778 1503:idiv            
	//  779 1504:isub            
	//  780 1505:istore_3        
		k = j + k;
	//  781 1506:iload_3         
	//  782 1507:iload           4
	//  783 1509:iadd            
	//  784 1510:istore          4
		if(j >= i)
	//* 785 1512:iload_3         
	//* 786 1513:iload_2         
	//* 787 1514:icmpge          1520
	//* 788 1517:goto            1537
		{
			i = j;
	//  789 1520:iload_3         
	//  790 1521:istore_2        
			if(k > l)
	//* 791 1522:iload           4
	//* 792 1524:iload           5
	//* 793 1526:icmple          1537
				i = j - (k - l);
	//  794 1529:iload_3         
	//  795 1530:iload           4
	//  796 1532:iload           5
	//  797 1534:isub            
	//  798 1535:isub            
	//  799 1536:istore_2        
		}
		k = mTempViews.size();
	//  800 1537:aload_0         
	//  801 1538:getfield        #118 <Field ArrayList mTempViews>
	//  802 1541:invokevirtual   #625 <Method int ArrayList.size()>
	//  803 1544:istore          4
		for(j = 0; j < k; j++)
	//* 804 1546:iconst_0        
	//* 805 1547:istore_3        
	//* 806 1548:iload_3         
	//* 807 1549:iload           4
	//* 808 1551:icmpge          1582
			i = layoutChildLeft((View)mTempViews.get(j), i, ai, i1);
	//  809 1554:aload_0         
	//  810 1555:aload_0         
	//  811 1556:getfield        #118 <Field ArrayList mTempViews>
	//  812 1559:iload_3         
	//  813 1560:invokevirtual   #626 <Method Object ArrayList.get(int)>
	//  814 1563:checkcast       #364 <Class View>
	//  815 1566:iload_2         
	//  816 1567:aload           19
	//  817 1569:iload           6
	//  818 1571:invokespecial   #827 <Method int layoutChildLeft(View, int, int[], int)>
	//  819 1574:istore_2        

	//  820 1575:iload_3         
	//  821 1576:iconst_1        
	//  822 1577:iadd            
	//  823 1578:istore_3        
	//* 824 1579:goto            1548
		mTempViews.clear();
	//  825 1582:aload_0         
	//  826 1583:getfield        #118 <Field ArrayList mTempViews>
	//  827 1586:invokevirtual   #630 <Method void ArrayList.clear()>
	//  828 1589:return          
	}

	protected void onMeasure(int i, int j)
	{
		int j1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          6
		int l = 0;
	//    2    3:iconst_0        
	//    3    4:istore          4
		int ai[] = mTempMargins;
	//    4    6:aload_0         
	//    5    7:getfield        #122 <Field int[] mTempMargins>
	//    6   10:astore          13
		int l1;
		int i2;
		if(ViewUtils.isLayoutRtl(((View) (this))))
	//*   7   12:aload_0         
	//*   8   13:invokestatic    #847 <Method boolean ViewUtils.isLayoutRtl(View)>
	//*   9   16:ifeq            28
		{
			i2 = 1;
	//   10   19:iconst_1        
	//   11   20:istore          9
			l1 = 0;
	//   12   22:iconst_0        
	//   13   23:istore          8
		} else
	//*  14   25:goto            34
		{
			i2 = 0;
	//   15   28:iconst_0        
	//   16   29:istore          9
			l1 = 1;
	//   17   31:iconst_1        
	//   18   32:istore          8
		}
		int k1 = 0;
	//   19   34:iconst_0        
	//   20   35:istore          7
		if(shouldLayout(((View) (mNavButtonView))))
	//*  21   37:aload_0         
	//*  22   38:aload_0         
	//*  23   39:getfield        #473 <Field ImageButton mNavButtonView>
	//*  24   42:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  25   45:ifeq            117
		{
			measureChildConstrained(((View) (mNavButtonView)), i, 0, j, 0, mMaxButtonHeight);
	//   26   48:aload_0         
	//   27   49:aload_0         
	//   28   50:getfield        #473 <Field ImageButton mNavButtonView>
	//   29   53:iload_1         
	//   30   54:iconst_0        
	//   31   55:iload_2         
	//   32   56:iconst_0        
	//   33   57:aload_0         
	//   34   58:getfield        #210 <Field int mMaxButtonHeight>
	//   35   61:invokespecial   #849 <Method void measureChildConstrained(View, int, int, int, int, int)>
			k1 = mNavButtonView.getMeasuredWidth() + getHorizontalMargins(((View) (mNavButtonView)));
	//   36   64:aload_0         
	//   37   65:getfield        #473 <Field ImageButton mNavButtonView>
	//   38   68:invokevirtual   #850 <Method int ImageButton.getMeasuredWidth()>
	//   39   71:aload_0         
	//   40   72:aload_0         
	//   41   73:getfield        #473 <Field ImageButton mNavButtonView>
	//   42   76:invokespecial   #852 <Method int getHorizontalMargins(View)>
	//   43   79:iadd            
	//   44   80:istore          7
			j1 = Math.max(0, mNavButtonView.getMeasuredHeight() + getVerticalMargins(((View) (mNavButtonView))));
	//   45   82:iconst_0        
	//   46   83:aload_0         
	//   47   84:getfield        #473 <Field ImageButton mNavButtonView>
	//   48   87:invokevirtual   #853 <Method int ImageButton.getMeasuredHeight()>
	//   49   90:aload_0         
	//   50   91:aload_0         
	//   51   92:getfield        #473 <Field ImageButton mNavButtonView>
	//   52   95:invokespecial   #855 <Method int getVerticalMargins(View)>
	//   53   98:iadd            
	//   54   99:invokestatic    #511 <Method int Math.max(int, int)>
	//   55  102:istore          6
			l = View.combineMeasuredStates(0, mNavButtonView.getMeasuredState());
	//   56  104:iconst_0        
	//   57  105:aload_0         
	//   58  106:getfield        #473 <Field ImageButton mNavButtonView>
	//   59  109:invokevirtual   #858 <Method int ImageButton.getMeasuredState()>
	//   60  112:invokestatic    #861 <Method int View.combineMeasuredStates(int, int)>
	//   61  115:istore          4
		}
		int i1 = j1;
	//   62  117:iload           6
	//   63  119:istore          5
		int k = l;
	//   64  121:iload           4
	//   65  123:istore_3        
		if(shouldLayout(((View) (mCollapseButtonView))))
	//*  66  124:aload_0         
	//*  67  125:aload_0         
	//*  68  126:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  69  129:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  70  132:ifeq            205
		{
			measureChildConstrained(((View) (mCollapseButtonView)), i, 0, j, 0, mMaxButtonHeight);
	//   71  135:aload_0         
	//   72  136:aload_0         
	//   73  137:getfield        #656 <Field ImageButton mCollapseButtonView>
	//   74  140:iload_1         
	//   75  141:iconst_0        
	//   76  142:iload_2         
	//   77  143:iconst_0        
	//   78  144:aload_0         
	//   79  145:getfield        #210 <Field int mMaxButtonHeight>
	//   80  148:invokespecial   #849 <Method void measureChildConstrained(View, int, int, int, int, int)>
			k1 = mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(((View) (mCollapseButtonView)));
	//   81  151:aload_0         
	//   82  152:getfield        #656 <Field ImageButton mCollapseButtonView>
	//   83  155:invokevirtual   #850 <Method int ImageButton.getMeasuredWidth()>
	//   84  158:aload_0         
	//   85  159:aload_0         
	//   86  160:getfield        #656 <Field ImageButton mCollapseButtonView>
	//   87  163:invokespecial   #852 <Method int getHorizontalMargins(View)>
	//   88  166:iadd            
	//   89  167:istore          7
			i1 = Math.max(j1, mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(((View) (mCollapseButtonView))));
	//   90  169:iload           6
	//   91  171:aload_0         
	//   92  172:getfield        #656 <Field ImageButton mCollapseButtonView>
	//   93  175:invokevirtual   #853 <Method int ImageButton.getMeasuredHeight()>
	//   94  178:aload_0         
	//   95  179:aload_0         
	//   96  180:getfield        #656 <Field ImageButton mCollapseButtonView>
	//   97  183:invokespecial   #855 <Method int getVerticalMargins(View)>
	//   98  186:iadd            
	//   99  187:invokestatic    #511 <Method int Math.max(int, int)>
	//  100  190:istore          5
			k = View.combineMeasuredStates(l, mCollapseButtonView.getMeasuredState());
	//  101  192:iload           4
	//  102  194:aload_0         
	//  103  195:getfield        #656 <Field ImageButton mCollapseButtonView>
	//  104  198:invokevirtual   #858 <Method int ImageButton.getMeasuredState()>
	//  105  201:invokestatic    #861 <Method int View.combineMeasuredStates(int, int)>
	//  106  204:istore_3        
		}
		l = getCurrentContentInsetStart();
	//  107  205:aload_0         
	//  108  206:invokevirtual   #720 <Method int getCurrentContentInsetStart()>
	//  109  209:istore          4
		int j2 = Math.max(l, k1) + 0;
	//  110  211:iload           4
	//  111  213:iload           7
	//  112  215:invokestatic    #511 <Method int Math.max(int, int)>
	//  113  218:iconst_0        
	//  114  219:iadd            
	//  115  220:istore          10
		ai[i2] = Math.max(0, l - k1);
	//  116  222:aload           13
	//  117  224:iload           9
	//  118  226:iconst_0        
	//  119  227:iload           4
	//  120  229:iload           7
	//  121  231:isub            
	//  122  232:invokestatic    #511 <Method int Math.max(int, int)>
	//  123  235:iastore         
		k1 = 0;
	//  124  236:iconst_0        
	//  125  237:istore          7
		j1 = i1;
	//  126  239:iload           5
	//  127  241:istore          6
		l = k;
	//  128  243:iload_3         
	//  129  244:istore          4
		if(shouldLayout(((View) (mMenuView))))
	//* 130  246:aload_0         
	//* 131  247:aload_0         
	//* 132  248:getfield        #427 <Field ActionMenuView mMenuView>
	//* 133  251:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 134  254:ifeq            328
		{
			measureChildConstrained(((View) (mMenuView)), i, j2, j, 0, mMaxButtonHeight);
	//  135  257:aload_0         
	//  136  258:aload_0         
	//  137  259:getfield        #427 <Field ActionMenuView mMenuView>
	//  138  262:iload_1         
	//  139  263:iload           10
	//  140  265:iload_2         
	//  141  266:iconst_0        
	//  142  267:aload_0         
	//  143  268:getfield        #210 <Field int mMaxButtonHeight>
	//  144  271:invokespecial   #849 <Method void measureChildConstrained(View, int, int, int, int, int)>
			k1 = mMenuView.getMeasuredWidth() + getHorizontalMargins(((View) (mMenuView)));
	//  145  274:aload_0         
	//  146  275:getfield        #427 <Field ActionMenuView mMenuView>
	//  147  278:invokevirtual   #862 <Method int ActionMenuView.getMeasuredWidth()>
	//  148  281:aload_0         
	//  149  282:aload_0         
	//  150  283:getfield        #427 <Field ActionMenuView mMenuView>
	//  151  286:invokespecial   #852 <Method int getHorizontalMargins(View)>
	//  152  289:iadd            
	//  153  290:istore          7
			j1 = Math.max(i1, mMenuView.getMeasuredHeight() + getVerticalMargins(((View) (mMenuView))));
	//  154  292:iload           5
	//  155  294:aload_0         
	//  156  295:getfield        #427 <Field ActionMenuView mMenuView>
	//  157  298:invokevirtual   #863 <Method int ActionMenuView.getMeasuredHeight()>
	//  158  301:aload_0         
	//  159  302:aload_0         
	//  160  303:getfield        #427 <Field ActionMenuView mMenuView>
	//  161  306:invokespecial   #855 <Method int getVerticalMargins(View)>
	//  162  309:iadd            
	//  163  310:invokestatic    #511 <Method int Math.max(int, int)>
	//  164  313:istore          6
			l = View.combineMeasuredStates(k, mMenuView.getMeasuredState());
	//  165  315:iload_3         
	//  166  316:aload_0         
	//  167  317:getfield        #427 <Field ActionMenuView mMenuView>
	//  168  320:invokevirtual   #864 <Method int ActionMenuView.getMeasuredState()>
	//  169  323:invokestatic    #861 <Method int View.combineMeasuredStates(int, int)>
	//  170  326:istore          4
		}
		k = getCurrentContentInsetEnd();
	//  171  328:aload_0         
	//  172  329:invokevirtual   #717 <Method int getCurrentContentInsetEnd()>
	//  173  332:istore_3        
		i2 = j2 + Math.max(k, k1);
	//  174  333:iload           10
	//  175  335:iload_3         
	//  176  336:iload           7
	//  177  338:invokestatic    #511 <Method int Math.max(int, int)>
	//  178  341:iadd            
	//  179  342:istore          9
		ai[l1] = Math.max(0, k - k1);
	//  180  344:aload           13
	//  181  346:iload           8
	//  182  348:iconst_0        
	//  183  349:iload_3         
	//  184  350:iload           7
	//  185  352:isub            
	//  186  353:invokestatic    #511 <Method int Math.max(int, int)>
	//  187  356:iastore         
		l1 = i2;
	//  188  357:iload           9
	//  189  359:istore          8
		i1 = j1;
	//  190  361:iload           6
	//  191  363:istore          5
		k = l;
	//  192  365:iload           4
	//  193  367:istore_3        
		if(shouldLayout(mExpandedActionView))
	//* 194  368:aload_0         
	//* 195  369:aload_0         
	//* 196  370:getfield        #404 <Field View mExpandedActionView>
	//* 197  373:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 198  376:ifeq            435
		{
			l1 = i2 + measureChildCollapseMargins(mExpandedActionView, i, i2, j, 0, ai);
	//  199  379:iload           9
	//  200  381:aload_0         
	//  201  382:aload_0         
	//  202  383:getfield        #404 <Field View mExpandedActionView>
	//  203  386:iload_1         
	//  204  387:iload           9
	//  205  389:iload_2         
	//  206  390:iconst_0        
	//  207  391:aload           13
	//  208  393:invokespecial   #866 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  209  396:iadd            
	//  210  397:istore          8
			i1 = Math.max(j1, mExpandedActionView.getMeasuredHeight() + getVerticalMargins(mExpandedActionView));
	//  211  399:iload           6
	//  212  401:aload_0         
	//  213  402:getfield        #404 <Field View mExpandedActionView>
	//  214  405:invokevirtual   #488 <Method int View.getMeasuredHeight()>
	//  215  408:aload_0         
	//  216  409:aload_0         
	//  217  410:getfield        #404 <Field View mExpandedActionView>
	//  218  413:invokespecial   #855 <Method int getVerticalMargins(View)>
	//  219  416:iadd            
	//  220  417:invokestatic    #511 <Method int Math.max(int, int)>
	//  221  420:istore          5
			k = View.combineMeasuredStates(l, mExpandedActionView.getMeasuredState());
	//  222  422:iload           4
	//  223  424:aload_0         
	//  224  425:getfield        #404 <Field View mExpandedActionView>
	//  225  428:invokevirtual   #867 <Method int View.getMeasuredState()>
	//  226  431:invokestatic    #861 <Method int View.combineMeasuredStates(int, int)>
	//  227  434:istore_3        
		}
		l = l1;
	//  228  435:iload           8
	//  229  437:istore          4
		j1 = i1;
	//  230  439:iload           5
	//  231  441:istore          6
		k1 = k;
	//  232  443:iload_3         
	//  233  444:istore          7
		if(shouldLayout(((View) (mLogoView))))
	//* 234  446:aload_0         
	//* 235  447:aload_0         
	//* 236  448:getfield        #417 <Field ImageView mLogoView>
	//* 237  451:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 238  454:ifeq            513
		{
			l = l1 + measureChildCollapseMargins(((View) (mLogoView)), i, l1, j, 0, ai);
	//  239  457:iload           8
	//  240  459:aload_0         
	//  241  460:aload_0         
	//  242  461:getfield        #417 <Field ImageView mLogoView>
	//  243  464:iload_1         
	//  244  465:iload           8
	//  245  467:iload_2         
	//  246  468:iconst_0        
	//  247  469:aload           13
	//  248  471:invokespecial   #866 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  249  474:iadd            
	//  250  475:istore          4
			j1 = Math.max(i1, mLogoView.getMeasuredHeight() + getVerticalMargins(((View) (mLogoView))));
	//  251  477:iload           5
	//  252  479:aload_0         
	//  253  480:getfield        #417 <Field ImageView mLogoView>
	//  254  483:invokevirtual   #868 <Method int ImageView.getMeasuredHeight()>
	//  255  486:aload_0         
	//  256  487:aload_0         
	//  257  488:getfield        #417 <Field ImageView mLogoView>
	//  258  491:invokespecial   #855 <Method int getVerticalMargins(View)>
	//  259  494:iadd            
	//  260  495:invokestatic    #511 <Method int Math.max(int, int)>
	//  261  498:istore          6
			k1 = View.combineMeasuredStates(k, mLogoView.getMeasuredState());
	//  262  500:iload_3         
	//  263  501:aload_0         
	//  264  502:getfield        #417 <Field ImageView mLogoView>
	//  265  505:invokevirtual   #869 <Method int ImageView.getMeasuredState()>
	//  266  508:invokestatic    #861 <Method int View.combineMeasuredStates(int, int)>
	//  267  511:istore          7
		}
		j2 = getChildCount();
	//  268  513:aload_0         
	//  269  514:invokevirtual   #348 <Method int getChildCount()>
	//  270  517:istore          10
		i1 = 0;
	//  271  519:iconst_0        
	//  272  520:istore          5
		k = k1;
	//  273  522:iload           7
	//  274  524:istore_3        
		l1 = j1;
	//  275  525:iload           6
	//  276  527:istore          8
		k1 = l;
	//  277  529:iload           4
	//  278  531:istore          7
		while(i1 < j2) 
	//* 279  533:iload           5
	//* 280  535:iload           10
	//* 281  537:icmpge          664
		{
			View view = getChildAt(i1);
	//  282  540:aload_0         
	//  283  541:iload           5
	//  284  543:invokevirtual   #362 <Method View getChildAt(int)>
	//  285  546:astore          14
			i2 = k1;
	//  286  548:iload           7
	//  287  550:istore          9
			j1 = l1;
	//  288  552:iload           8
	//  289  554:istore          6
			l = k;
	//  290  556:iload_3         
	//  291  557:istore          4
			if(((LayoutParams)view.getLayoutParams()).mViewType == 0)
	//* 292  559:aload           14
	//* 293  561:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 294  564:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 295  567:getfield        #371 <Field int Toolbar$LayoutParams.mViewType>
	//* 296  570:ifne            644
				if(!shouldLayout(view))
	//* 297  573:aload_0         
	//* 298  574:aload           14
	//* 299  576:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 300  579:ifne            596
				{
					i2 = k1;
	//  301  582:iload           7
	//  302  584:istore          9
					j1 = l1;
	//  303  586:iload           8
	//  304  588:istore          6
					l = k;
	//  305  590:iload_3         
	//  306  591:istore          4
				} else
	//* 307  593:goto            644
				{
					i2 = k1 + measureChildCollapseMargins(view, i, k1, j, 0, ai);
	//  308  596:iload           7
	//  309  598:aload_0         
	//  310  599:aload           14
	//  311  601:iload_1         
	//  312  602:iload           7
	//  313  604:iload_2         
	//  314  605:iconst_0        
	//  315  606:aload           13
	//  316  608:invokespecial   #866 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  317  611:iadd            
	//  318  612:istore          9
					j1 = Math.max(l1, view.getMeasuredHeight() + getVerticalMargins(view));
	//  319  614:iload           8
	//  320  616:aload           14
	//  321  618:invokevirtual   #488 <Method int View.getMeasuredHeight()>
	//  322  621:aload_0         
	//  323  622:aload           14
	//  324  624:invokespecial   #855 <Method int getVerticalMargins(View)>
	//  325  627:iadd            
	//  326  628:invokestatic    #511 <Method int Math.max(int, int)>
	//  327  631:istore          6
					l = View.combineMeasuredStates(k, view.getMeasuredState());
	//  328  633:iload_3         
	//  329  634:aload           14
	//  330  636:invokevirtual   #867 <Method int View.getMeasuredState()>
	//  331  639:invokestatic    #861 <Method int View.combineMeasuredStates(int, int)>
	//  332  642:istore          4
				}
			i1++;
	//  333  644:iload           5
	//  334  646:iconst_1        
	//  335  647:iadd            
	//  336  648:istore          5
			k1 = i2;
	//  337  650:iload           9
	//  338  652:istore          7
			l1 = j1;
	//  339  654:iload           6
	//  340  656:istore          8
			k = l;
	//  341  658:iload           4
	//  342  660:istore_3        
		}
	//* 343  661:goto            533
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
	//* 364  697:getfield        #787 <Field TextView mTitleTextView>
	//* 365  700:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 366  703:ifeq            775
		{
			measureChildCollapseMargins(((View) (mTitleTextView)), i, k1 + l2, j, k2, ai);
	//  367  706:aload_0         
	//  368  707:aload_0         
	//  369  708:getfield        #787 <Field TextView mTitleTextView>
	//  370  711:iload_1         
	//  371  712:iload           7
	//  372  714:iload           12
	//  373  716:iadd            
	//  374  717:iload_2         
	//  375  718:iload           11
	//  376  720:aload           13
	//  377  722:invokespecial   #866 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  378  725:pop             
			j1 = mTitleTextView.getMeasuredWidth() + getHorizontalMargins(((View) (mTitleTextView)));
	//  379  726:aload_0         
	//  380  727:getfield        #787 <Field TextView mTitleTextView>
	//  381  730:invokevirtual   #836 <Method int TextView.getMeasuredWidth()>
	//  382  733:aload_0         
	//  383  734:aload_0         
	//  384  735:getfield        #787 <Field TextView mTitleTextView>
	//  385  738:invokespecial   #852 <Method int getHorizontalMargins(View)>
	//  386  741:iadd            
	//  387  742:istore          6
			i1 = mTitleTextView.getMeasuredHeight() + getVerticalMargins(((View) (mTitleTextView)));
	//  388  744:aload_0         
	//  389  745:getfield        #787 <Field TextView mTitleTextView>
	//  390  748:invokevirtual   #835 <Method int TextView.getMeasuredHeight()>
	//  391  751:aload_0         
	//  392  752:aload_0         
	//  393  753:getfield        #787 <Field TextView mTitleTextView>
	//  394  756:invokespecial   #855 <Method int getVerticalMargins(View)>
	//  395  759:iadd            
	//  396  760:istore          5
			l = View.combineMeasuredStates(k, mTitleTextView.getMeasuredState());
	//  397  762:iload_3         
	//  398  763:aload_0         
	//  399  764:getfield        #787 <Field TextView mTitleTextView>
	//  400  767:invokevirtual   #870 <Method int TextView.getMeasuredState()>
	//  401  770:invokestatic    #861 <Method int View.combineMeasuredStates(int, int)>
	//  402  773:istore          4
		}
		k = l;
	//  403  775:iload           4
	//  404  777:istore_3        
		i2 = j1;
	//  405  778:iload           6
	//  406  780:istore          9
		j2 = i1;
	//  407  782:iload           5
	//  408  784:istore          10
		if(shouldLayout(((View) (mSubtitleTextView))))
	//* 409  786:aload_0         
	//* 410  787:aload_0         
	//* 411  788:getfield        #833 <Field TextView mSubtitleTextView>
	//* 412  791:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 413  794:ifeq            860
		{
			i2 = Math.max(j1, measureChildCollapseMargins(((View) (mSubtitleTextView)), i, k1 + l2, j, i1 + k2, ai));
	//  414  797:iload           6
	//  415  799:aload_0         
	//  416  800:aload_0         
	//  417  801:getfield        #833 <Field TextView mSubtitleTextView>
	//  418  804:iload_1         
	//  419  805:iload           7
	//  420  807:iload           12
	//  421  809:iadd            
	//  422  810:iload_2         
	//  423  811:iload           5
	//  424  813:iload           11
	//  425  815:iadd            
	//  426  816:aload           13
	//  427  818:invokespecial   #866 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  428  821:invokestatic    #511 <Method int Math.max(int, int)>
	//  429  824:istore          9
			j2 = i1 + (mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(((View) (mSubtitleTextView))));
	//  430  826:iload           5
	//  431  828:aload_0         
	//  432  829:getfield        #833 <Field TextView mSubtitleTextView>
	//  433  832:invokevirtual   #835 <Method int TextView.getMeasuredHeight()>
	//  434  835:aload_0         
	//  435  836:aload_0         
	//  436  837:getfield        #833 <Field TextView mSubtitleTextView>
	//  437  840:invokespecial   #855 <Method int getVerticalMargins(View)>
	//  438  843:iadd            
	//  439  844:iadd            
	//  440  845:istore          10
			k = View.combineMeasuredStates(l, mSubtitleTextView.getMeasuredState());
	//  441  847:iload           4
	//  442  849:aload_0         
	//  443  850:getfield        #833 <Field TextView mSubtitleTextView>
	//  444  853:invokevirtual   #870 <Method int TextView.getMeasuredState()>
	//  445  856:invokestatic    #861 <Method int View.combineMeasuredStates(int, int)>
	//  446  859:istore_3        
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
	//  461  888:invokevirtual   #500 <Method int getPaddingBottom()>
	//  462  891:istore          6
		k1 = View.resolveSizeAndState(Math.max(k1 + i2 + (l1 + j2), getSuggestedMinimumWidth()), i, 0xff000000 & k);
	//  463  893:iload           7
	//  464  895:iload           9
	//  465  897:iadd            
	//  466  898:iload           8
	//  467  900:iload           10
	//  468  902:iadd            
	//  469  903:iadd            
	//  470  904:aload_0         
	//  471  905:invokevirtual   #873 <Method int getSuggestedMinimumWidth()>
	//  472  908:invokestatic    #511 <Method int Math.max(int, int)>
	//  473  911:iload_1         
	//  474  912:ldc2            #874 <Int 0xff000000>
	//  475  915:iload_3         
	//  476  916:iand            
	//  477  917:invokestatic    #877 <Method int View.resolveSizeAndState(int, int, int)>
	//  478  920:istore          7
		i = View.resolveSizeAndState(Math.max(l + (i1 + j1), getSuggestedMinimumHeight()), j, k << 16);
	//  479  922:iload           4
	//  480  924:iload           5
	//  481  926:iload           6
	//  482  928:iadd            
	//  483  929:iadd            
	//  484  930:aload_0         
	//  485  931:invokevirtual   #880 <Method int getSuggestedMinimumHeight()>
	//  486  934:invokestatic    #511 <Method int Math.max(int, int)>
	//  487  937:iload_2         
	//  488  938:iload_3         
	//  489  939:bipush          16
	//  490  941:ishl            
	//  491  942:invokestatic    #877 <Method int View.resolveSizeAndState(int, int, int)>
	//  492  945:istore_1        
		if(shouldCollapse())
	//* 493  946:aload_0         
	//* 494  947:invokespecial   #882 <Method boolean shouldCollapse()>
	//* 495  950:ifeq            958
			i = 0;
	//  496  953:iconst_0        
	//  497  954:istore_1        
	//* 498  955:goto            958
		setMeasuredDimension(k1, i);
	//  499  958:aload_0         
	//  500  959:iload           7
	//  501  961:iload_1         
	//  502  962:invokevirtual   #885 <Method void setMeasuredDimension(int, int)>
	//  503  965:return          
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
	//    5    9:invokespecial   #889 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		SavedState savedstate = (SavedState)parcelable;
	//    7   13:aload_1         
	//    8   14:checkcast       #21  <Class Toolbar$SavedState>
	//    9   17:astore_2        
		super.onRestoreInstanceState(savedstate.getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #893 <Method Parcelable Toolbar$SavedState.getSuperState()>
	//   13   23:invokespecial   #889 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(mMenuView != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #427 <Field ActionMenuView mMenuView>
	//*  16   30:ifnull          44
			parcelable = ((Parcelable) (mMenuView.peekMenu()));
	//   17   33:aload_0         
	//   18   34:getfield        #427 <Field ActionMenuView mMenuView>
	//   19   37:invokevirtual   #433 <Method MenuBuilder ActionMenuView.peekMenu()>
	//   20   40:astore_1        
		else
	//*  21   41:goto            46
			parcelable = null;
	//   22   44:aconst_null     
	//   23   45:astore_1        
		if(savedstate.expandedMenuItemId != 0 && mExpandedMenuPresenter != null && parcelable != null)
	//*  24   46:aload_2         
	//*  25   47:getfield        #896 <Field int Toolbar$SavedState.expandedMenuItemId>
	//*  26   50:ifeq            86
	//*  27   53:aload_0         
	//*  28   54:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//*  29   57:ifnull          86
	//*  30   60:aload_1         
	//*  31   61:ifnull          86
		{
			parcelable = ((Parcelable) (((Menu) (parcelable)).findItem(savedstate.expandedMenuItemId)));
	//   32   64:aload_1         
	//   33   65:aload_2         
	//   34   66:getfield        #896 <Field int Toolbar$SavedState.expandedMenuItemId>
	//   35   69:invokeinterface #902 <Method MenuItem Menu.findItem(int)>
	//   36   74:astore_1        
			if(parcelable != null)
	//*  37   75:aload_1         
	//*  38   76:ifnull          86
				((MenuItem) (parcelable)).expandActionView();
	//   39   79:aload_1         
	//   40   80:invokeinterface #907 <Method boolean MenuItem.expandActionView()>
	//   41   85:pop             
		}
		if(savedstate.isOverflowOpen)
	//*  42   86:aload_2         
	//*  43   87:getfield        #910 <Field boolean Toolbar$SavedState.isOverflowOpen>
	//*  44   90:ifeq            97
			postShowOverflowMenu();
	//   45   93:aload_0         
	//   46   94:invokespecial   #912 <Method void postShowOverflowMenu()>
	//   47   97:return          
	}

	public void onRtlPropertiesChanged(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #918 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			super.onRtlPropertiesChanged(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokespecial   #920 <Method void ViewGroup.onRtlPropertiesChanged(int)>
		ensureContentInsets();
	//    6   13:aload_0         
	//    7   14:invokespecial   #226 <Method void ensureContentInsets()>
		RtlSpacingHelper rtlspacinghelper = mContentInsets;
	//    8   17:aload_0         
	//    9   18:getfield        #228 <Field RtlSpacingHelper mContentInsets>
	//   10   21:astore_3        
		boolean flag;
		if(i == 1)
	//*  11   22:iload_1         
	//*  12   23:iconst_1        
	//*  13   24:icmpne          32
			flag = true;
	//   14   27:iconst_1        
	//   15   28:istore_2        
		else
	//*  16   29:goto            34
			flag = false;
	//   17   32:iconst_0        
	//   18   33:istore_2        
		rtlspacinghelper.setDirection(flag);
	//   19   34:aload_3         
	//   20   35:iload_2         
	//   21   36:invokevirtual   #923 <Method void RtlSpacingHelper.setDirection(boolean)>
	//   22   39:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #21  <Class Toolbar$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #926 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #928 <Method void Toolbar$SavedState(Parcelable)>
	//    5   11:astore_1        
		if(mExpandedMenuPresenter != null && mExpandedMenuPresenter.mCurrentExpandedItem != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//*   8   16:ifnull          43
	//*   9   19:aload_0         
	//*  10   20:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//*  11   23:getfield        #646 <Field MenuItemImpl Toolbar$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
	//*  12   26:ifnull          43
			savedstate.expandedMenuItemId = mExpandedMenuPresenter.mCurrentExpandedItem.getItemId();
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   16   34:getfield        #646 <Field MenuItemImpl Toolbar$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
	//   17   37:invokevirtual   #931 <Method int MenuItemImpl.getItemId()>
	//   18   40:putfield        #896 <Field int Toolbar$SavedState.expandedMenuItemId>
		savedstate.isOverflowOpen = isOverflowMenuShowing();
	//   19   43:aload_1         
	//   20   44:aload_0         
	//   21   45:invokevirtual   #932 <Method boolean isOverflowMenuShowing()>
	//   22   48:putfield        #910 <Field boolean Toolbar$SavedState.isOverflowOpen>
		return ((Parcelable) (savedstate));
	//   23   51:aload_1         
	//   24   52:areturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #811 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            14
			mEatingTouch = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #935 <Field boolean mEatingTouch>
		if(!mEatingTouch)
	//*   8   14:aload_0         
	//*   9   15:getfield        #935 <Field boolean mEatingTouch>
	//*  10   18:ifne            40
		{
			boolean flag = super.onTouchEvent(motionevent);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #937 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//   14   26:istore_3        
			if(i == 0 && !flag)
	//*  15   27:iload_2         
	//*  16   28:ifne            40
	//*  17   31:iload_3         
	//*  18   32:ifne            40
				mEatingTouch = true;
	//   19   35:aload_0         
	//   20   36:iconst_1        
	//   21   37:putfield        #935 <Field boolean mEatingTouch>
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
	//   30   52:putfield        #935 <Field boolean mEatingTouch>
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
	//   23   41:invokevirtual   #941 <Method void removeViewAt(int)>
				mHiddenViews.add(((Object) (view)));
	//   24   44:aload_0         
	//   25   45:getfield        #120 <Field ArrayList mHiddenViews>
	//   26   48:aload_2         
	//   27   49:invokevirtual   #409 <Method boolean ArrayList.add(Object)>
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
	//    4    6:invokevirtual   #945 <Method void requestLayout()>
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
	//   17   30:invokevirtual   #945 <Method void requestLayout()>
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
	//   17   30:invokevirtual   #945 <Method void requestLayout()>
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
	//    4    6:invokestatic    #955 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #312 <Method void setLogo(Drawable)>
	//    6   12:return          
	}

	public void setLogo(Drawable drawable)
	{
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
		{
			ensureLogoView();
	//    2    4:aload_0         
	//    3    5:invokespecial   #957 <Method void ensureLogoView()>
			if(!isChildOrHidden(((View) (mLogoView))))
	//*   4    8:aload_0         
	//*   5    9:aload_0         
	//*   6   10:getfield        #417 <Field ImageView mLogoView>
	//*   7   13:invokespecial   #959 <Method boolean isChildOrHidden(View)>
	//*   8   16:ifne            69
				addSystemView(((View) (mLogoView)), true);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #417 <Field ImageView mLogoView>
	//   12   24:iconst_1        
	//   13   25:invokespecial   #470 <Method void addSystemView(View, boolean)>
		} else
	//*  14   28:goto            69
		if(mLogoView != null && isChildOrHidden(((View) (mLogoView))))
	//*  15   31:aload_0         
	//*  16   32:getfield        #417 <Field ImageView mLogoView>
	//*  17   35:ifnull          69
	//*  18   38:aload_0         
	//*  19   39:aload_0         
	//*  20   40:getfield        #417 <Field ImageView mLogoView>
	//*  21   43:invokespecial   #959 <Method boolean isChildOrHidden(View)>
	//*  22   46:ifeq            69
		{
			removeView(((View) (mLogoView)));
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:getfield        #417 <Field ImageView mLogoView>
	//   26   54:invokevirtual   #962 <Method void removeView(View)>
			mHiddenViews.remove(((Object) (mLogoView)));
	//   27   57:aload_0         
	//   28   58:getfield        #120 <Field ArrayList mHiddenViews>
	//   29   61:aload_0         
	//   30   62:getfield        #417 <Field ImageView mLogoView>
	//   31   65:invokevirtual   #965 <Method boolean ArrayList.remove(Object)>
	//   32   68:pop             
		}
		if(mLogoView != null)
	//*  33   69:aload_0         
	//*  34   70:getfield        #417 <Field ImageView mLogoView>
	//*  35   73:ifnull          84
			mLogoView.setImageDrawable(drawable);
	//   36   76:aload_0         
	//   37   77:getfield        #417 <Field ImageView mLogoView>
	//   38   80:aload_1         
	//   39   81:invokevirtual   #966 <Method void ImageView.setImageDrawable(Drawable)>
	//   40   84:return          
	}

	public void setLogoDescription(int i)
	{
		setLogoDescription(getContext().getText(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #134 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #970 <Method CharSequence Context.getText(int)>
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
	//    4    8:invokespecial   #957 <Method void ensureLogoView()>
		if(mLogoView != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #417 <Field ImageView mLogoView>
	//*   7   15:ifnull          26
			mLogoView.setContentDescription(charsequence);
	//    8   18:aload_0         
	//    9   19:getfield        #417 <Field ImageView mLogoView>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #971 <Method void ImageView.setContentDescription(CharSequence)>
	//   12   26:return          
	}

	public void setMenu(MenuBuilder menubuilder, ActionMenuPresenter actionmenupresenter)
	{
		if(menubuilder == null && mMenuView == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
	//*   2    4:aload_0         
	//*   3    5:getfield        #427 <Field ActionMenuView mMenuView>
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		ensureMenuView();
	//    6   12:aload_0         
	//    7   13:invokespecial   #425 <Method void ensureMenuView()>
		MenuBuilder menubuilder1 = mMenuView.peekMenu();
	//    8   16:aload_0         
	//    9   17:getfield        #427 <Field ActionMenuView mMenuView>
	//   10   20:invokevirtual   #433 <Method MenuBuilder ActionMenuView.peekMenu()>
	//   11   23:astore_3        
		if(menubuilder1 == menubuilder)
	//*  12   24:aload_3         
	//*  13   25:aload_1         
	//*  14   26:if_acmpne       30
			return;
	//   15   29:return          
		if(menubuilder1 != null)
	//*  16   30:aload_3         
	//*  17   31:ifnull          50
		{
			menubuilder1.removeMenuPresenter(((MenuPresenter) (mOuterActionMenuPresenter)));
	//   18   34:aload_3         
	//   19   35:aload_0         
	//   20   36:getfield        #975 <Field ActionMenuPresenter mOuterActionMenuPresenter>
	//   21   39:invokevirtual   #979 <Method void MenuBuilder.removeMenuPresenter(MenuPresenter)>
			menubuilder1.removeMenuPresenter(((MenuPresenter) (mExpandedMenuPresenter)));
	//   22   42:aload_3         
	//   23   43:aload_0         
	//   24   44:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   25   47:invokevirtual   #979 <Method void MenuBuilder.removeMenuPresenter(MenuPresenter)>
		}
		if(mExpandedMenuPresenter == null)
	//*  26   50:aload_0         
	//*  27   51:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//*  28   54:ifnonnull       69
			mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
	//   29   57:aload_0         
	//   30   58:new             #12  <Class Toolbar$ExpandedActionViewMenuPresenter>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:invokespecial   #442 <Method void Toolbar$ExpandedActionViewMenuPresenter(Toolbar)>
	//   34   66:putfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
		actionmenupresenter.setExpandedActionViewsExclusive(true);
	//   35   69:aload_2         
	//   36   70:iconst_1        
	//   37   71:invokevirtual   #982 <Method void ActionMenuPresenter.setExpandedActionViewsExclusive(boolean)>
		if(menubuilder != null)
	//*  38   74:aload_1         
	//*  39   75:ifnull          102
		{
			menubuilder.addMenuPresenter(((MenuPresenter) (actionmenupresenter)), mPopupContext);
	//   40   78:aload_1         
	//   41   79:aload_2         
	//   42   80:aload_0         
	//   43   81:getfield        #286 <Field Context mPopupContext>
	//   44   84:invokevirtual   #450 <Method void MenuBuilder.addMenuPresenter(MenuPresenter, Context)>
			menubuilder.addMenuPresenter(((MenuPresenter) (mExpandedMenuPresenter)), mPopupContext);
	//   45   87:aload_1         
	//   46   88:aload_0         
	//   47   89:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   48   92:aload_0         
	//   49   93:getfield        #286 <Field Context mPopupContext>
	//   50   96:invokevirtual   #450 <Method void MenuBuilder.addMenuPresenter(MenuPresenter, Context)>
		} else
	//*  51   99:goto            136
		{
			actionmenupresenter.initForMenu(mPopupContext, ((MenuBuilder) (null)));
	//   52  102:aload_2         
	//   53  103:aload_0         
	//   54  104:getfield        #286 <Field Context mPopupContext>
	//   55  107:aconst_null     
	//   56  108:invokevirtual   #986 <Method void ActionMenuPresenter.initForMenu(Context, MenuBuilder)>
			mExpandedMenuPresenter.initForMenu(mPopupContext, ((MenuBuilder) (null)));
	//   57  111:aload_0         
	//   58  112:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   59  115:aload_0         
	//   60  116:getfield        #286 <Field Context mPopupContext>
	//   61  119:aconst_null     
	//   62  120:invokevirtual   #987 <Method void Toolbar$ExpandedActionViewMenuPresenter.initForMenu(Context, MenuBuilder)>
			actionmenupresenter.updateMenuView(true);
	//   63  123:aload_2         
	//   64  124:iconst_1        
	//   65  125:invokevirtual   #990 <Method void ActionMenuPresenter.updateMenuView(boolean)>
			mExpandedMenuPresenter.updateMenuView(true);
	//   66  128:aload_0         
	//   67  129:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   68  132:iconst_1        
	//   69  133:invokevirtual   #991 <Method void Toolbar$ExpandedActionViewMenuPresenter.updateMenuView(boolean)>
		}
		mMenuView.setPopupTheme(mPopupTheme);
	//   70  136:aload_0         
	//   71  137:getfield        #427 <Field ActionMenuView mMenuView>
	//   72  140:aload_0         
	//   73  141:getfield        #453 <Field int mPopupTheme>
	//   74  144:invokevirtual   #454 <Method void ActionMenuView.setPopupTheme(int)>
		mMenuView.setPresenter(actionmenupresenter);
	//   75  147:aload_0         
	//   76  148:getfield        #427 <Field ActionMenuView mMenuView>
	//   77  151:aload_2         
	//   78  152:invokevirtual   #995 <Method void ActionMenuView.setPresenter(ActionMenuPresenter)>
		mOuterActionMenuPresenter = actionmenupresenter;
	//   79  155:aload_0         
	//   80  156:aload_2         
	//   81  157:putfield        #975 <Field ActionMenuPresenter mOuterActionMenuPresenter>
	//   82  160:return          
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
	//*   1    1:ifeq            16
			charsequence = getContext().getText(i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #134 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #970 <Method CharSequence Context.getText(int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			charsequence = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setNavigationContentDescription(charsequence);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #306 <Method void setNavigationContentDescription(CharSequence)>
	//   13   23:return          
	}

	public void setNavigationContentDescription(CharSequence charsequence)
	{
		if(!TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #274 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            11
			ensureNavButtonView();
	//    3    7:aload_0         
	//    4    8:invokespecial   #997 <Method void ensureNavButtonView()>
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
	//    4    6:invokestatic    #955 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #300 <Method void setNavigationIcon(Drawable)>
	//    6   12:return          
	}

	public void setNavigationIcon(Drawable drawable)
	{
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
		{
			ensureNavButtonView();
	//    2    4:aload_0         
	//    3    5:invokespecial   #997 <Method void ensureNavButtonView()>
			if(!isChildOrHidden(((View) (mNavButtonView))))
	//*   4    8:aload_0         
	//*   5    9:aload_0         
	//*   6   10:getfield        #473 <Field ImageButton mNavButtonView>
	//*   7   13:invokespecial   #959 <Method boolean isChildOrHidden(View)>
	//*   8   16:ifne            69
				addSystemView(((View) (mNavButtonView)), true);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #473 <Field ImageButton mNavButtonView>
	//   12   24:iconst_1        
	//   13   25:invokespecial   #470 <Method void addSystemView(View, boolean)>
		} else
	//*  14   28:goto            69
		if(mNavButtonView != null && isChildOrHidden(((View) (mNavButtonView))))
	//*  15   31:aload_0         
	//*  16   32:getfield        #473 <Field ImageButton mNavButtonView>
	//*  17   35:ifnull          69
	//*  18   38:aload_0         
	//*  19   39:aload_0         
	//*  20   40:getfield        #473 <Field ImageButton mNavButtonView>
	//*  21   43:invokespecial   #959 <Method boolean isChildOrHidden(View)>
	//*  22   46:ifeq            69
		{
			removeView(((View) (mNavButtonView)));
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:getfield        #473 <Field ImageButton mNavButtonView>
	//   26   54:invokevirtual   #962 <Method void removeView(View)>
			mHiddenViews.remove(((Object) (mNavButtonView)));
	//   27   57:aload_0         
	//   28   58:getfield        #120 <Field ArrayList mHiddenViews>
	//   29   61:aload_0         
	//   30   62:getfield        #473 <Field ImageButton mNavButtonView>
	//   31   65:invokevirtual   #965 <Method boolean ArrayList.remove(Object)>
	//   32   68:pop             
		}
		if(mNavButtonView != null)
	//*  33   69:aload_0         
	//*  34   70:getfield        #473 <Field ImageButton mNavButtonView>
	//*  35   73:ifnull          84
			mNavButtonView.setImageDrawable(drawable);
	//   36   76:aload_0         
	//   37   77:getfield        #473 <Field ImageButton mNavButtonView>
	//   38   80:aload_1         
	//   39   81:invokevirtual   #659 <Method void ImageButton.setImageDrawable(Drawable)>
	//   40   84:return          
	}

	public void setNavigationOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		ensureNavButtonView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #997 <Method void ensureNavButtonView()>
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
	//    2    2:putfield        #1001 <Field Toolbar$OnMenuItemClickListener mOnMenuItemClickListener>
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
	//    5    9:invokevirtual   #1004 <Method void ActionMenuView.setOverflowIcon(Drawable)>
	//    6   12:return          
	}

	public void setPopupTheme(int i)
	{
		if(mPopupTheme != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #453 <Field int mPopupTheme>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          42
		{
			mPopupTheme = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #453 <Field int mPopupTheme>
			if(i == 0)
	//*   7   13:iload_1         
	//*   8   14:ifne            26
			{
				mPopupContext = getContext();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #134 <Method Context getContext()>
	//   12   22:putfield        #286 <Field Context mPopupContext>
				return;
	//   13   25:return          
			}
			mPopupContext = ((Context) (new ContextThemeWrapper(getContext(), i)));
	//   14   26:aload_0         
	//   15   27:new             #1007 <Class ContextThemeWrapper>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:invokevirtual   #134 <Method Context getContext()>
	//   19   35:iload_1         
	//   20   36:invokespecial   #1010 <Method void ContextThemeWrapper(Context, int)>
	//   21   39:putfield        #286 <Field Context mPopupContext>
		}
	//   22   42:return          
	}

	public void setSubtitle(int i)
	{
		setSubtitle(getContext().getText(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #134 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #970 <Method CharSequence Context.getText(int)>
	//    5    9:invokevirtual   #284 <Method void setSubtitle(CharSequence)>
	//    6   12:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		if(!TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #274 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            108
		{
			if(mSubtitleTextView == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #833 <Field TextView mSubtitleTextView>
	//*   5   11:ifnonnull       85
			{
				Context context = getContext();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #134 <Method Context getContext()>
	//    8   18:astore_2        
				mSubtitleTextView = ((TextView) (new AppCompatTextView(context)));
	//    9   19:aload_0         
	//   10   20:new             #1012 <Class AppCompatTextView>
	//   11   23:dup             
	//   12   24:aload_2         
	//   13   25:invokespecial   #1013 <Method void AppCompatTextView(Context)>
	//   14   28:putfield        #833 <Field TextView mSubtitleTextView>
				mSubtitleTextView.setSingleLine();
	//   15   31:aload_0         
	//   16   32:getfield        #833 <Field TextView mSubtitleTextView>
	//   17   35:invokevirtual   #1016 <Method void TextView.setSingleLine()>
				mSubtitleTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//   18   38:aload_0         
	//   19   39:getfield        #833 <Field TextView mSubtitleTextView>
	//   20   42:getstatic       #1022 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//   21   45:invokevirtual   #1026 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
				if(mSubtitleTextAppearance != 0)
	//*  22   48:aload_0         
	//*  23   49:getfield        #158 <Field int mSubtitleTextAppearance>
	//*  24   52:ifeq            67
					mSubtitleTextView.setTextAppearance(context, mSubtitleTextAppearance);
	//   25   55:aload_0         
	//   26   56:getfield        #833 <Field TextView mSubtitleTextView>
	//   27   59:aload_2         
	//   28   60:aload_0         
	//   29   61:getfield        #158 <Field int mSubtitleTextAppearance>
	//   30   64:invokevirtual   #1029 <Method void TextView.setTextAppearance(Context, int)>
				if(mSubtitleTextColor != 0)
	//*  31   67:aload_0         
	//*  32   68:getfield        #1031 <Field int mSubtitleTextColor>
	//*  33   71:ifeq            85
					mSubtitleTextView.setTextColor(mSubtitleTextColor);
	//   34   74:aload_0         
	//   35   75:getfield        #833 <Field TextView mSubtitleTextView>
	//   36   78:aload_0         
	//   37   79:getfield        #1031 <Field int mSubtitleTextColor>
	//   38   82:invokevirtual   #1034 <Method void TextView.setTextColor(int)>
			}
			if(!isChildOrHidden(((View) (mSubtitleTextView))))
	//*  39   85:aload_0         
	//*  40   86:aload_0         
	//*  41   87:getfield        #833 <Field TextView mSubtitleTextView>
	//*  42   90:invokespecial   #959 <Method boolean isChildOrHidden(View)>
	//*  43   93:ifne            146
				addSystemView(((View) (mSubtitleTextView)), true);
	//   44   96:aload_0         
	//   45   97:aload_0         
	//   46   98:getfield        #833 <Field TextView mSubtitleTextView>
	//   47  101:iconst_1        
	//   48  102:invokespecial   #470 <Method void addSystemView(View, boolean)>
		} else
	//*  49  105:goto            146
		if(mSubtitleTextView != null && isChildOrHidden(((View) (mSubtitleTextView))))
	//*  50  108:aload_0         
	//*  51  109:getfield        #833 <Field TextView mSubtitleTextView>
	//*  52  112:ifnull          146
	//*  53  115:aload_0         
	//*  54  116:aload_0         
	//*  55  117:getfield        #833 <Field TextView mSubtitleTextView>
	//*  56  120:invokespecial   #959 <Method boolean isChildOrHidden(View)>
	//*  57  123:ifeq            146
		{
			removeView(((View) (mSubtitleTextView)));
	//   58  126:aload_0         
	//   59  127:aload_0         
	//   60  128:getfield        #833 <Field TextView mSubtitleTextView>
	//   61  131:invokevirtual   #962 <Method void removeView(View)>
			mHiddenViews.remove(((Object) (mSubtitleTextView)));
	//   62  134:aload_0         
	//   63  135:getfield        #120 <Field ArrayList mHiddenViews>
	//   64  138:aload_0         
	//   65  139:getfield        #833 <Field TextView mSubtitleTextView>
	//   66  142:invokevirtual   #965 <Method boolean ArrayList.remove(Object)>
	//   67  145:pop             
		}
		if(mSubtitleTextView != null)
	//*  68  146:aload_0         
	//*  69  147:getfield        #833 <Field TextView mSubtitleTextView>
	//*  70  150:ifnull          161
			mSubtitleTextView.setText(charsequence);
	//   71  153:aload_0         
	//   72  154:getfield        #833 <Field TextView mSubtitleTextView>
	//   73  157:aload_1         
	//   74  158:invokevirtual   #1037 <Method void TextView.setText(CharSequence)>
		mSubtitleText = charsequence;
	//   75  161:aload_0         
	//   76  162:aload_1         
	//   77  163:putfield        #747 <Field CharSequence mSubtitleText>
	//   78  166:return          
	}

	public void setSubtitleTextAppearance(Context context, int i)
	{
		mSubtitleTextAppearance = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #158 <Field int mSubtitleTextAppearance>
		if(mSubtitleTextView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #833 <Field TextView mSubtitleTextView>
	//*   5    9:ifnull          21
			mSubtitleTextView.setTextAppearance(context, i);
	//    6   12:aload_0         
	//    7   13:getfield        #833 <Field TextView mSubtitleTextView>
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:invokevirtual   #1029 <Method void TextView.setTextAppearance(Context, int)>
	//   11   21:return          
	}

	public void setSubtitleTextColor(int i)
	{
		mSubtitleTextColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #1031 <Field int mSubtitleTextColor>
		if(mSubtitleTextView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #833 <Field TextView mSubtitleTextView>
	//*   5    9:ifnull          20
			mSubtitleTextView.setTextColor(i);
	//    6   12:aload_0         
	//    7   13:getfield        #833 <Field TextView mSubtitleTextView>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #1034 <Method void TextView.setTextColor(int)>
	//   10   20:return          
	}

	public void setTitle(int i)
	{
		setTitle(getContext().getText(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #134 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #970 <Method CharSequence Context.getText(int)>
	//    5    9:invokevirtual   #278 <Method void setTitle(CharSequence)>
	//    6   12:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		if(!TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #274 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            108
		{
			if(mTitleTextView == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #787 <Field TextView mTitleTextView>
	//*   5   11:ifnonnull       85
			{
				Context context = getContext();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #134 <Method Context getContext()>
	//    8   18:astore_2        
				mTitleTextView = ((TextView) (new AppCompatTextView(context)));
	//    9   19:aload_0         
	//   10   20:new             #1012 <Class AppCompatTextView>
	//   11   23:dup             
	//   12   24:aload_2         
	//   13   25:invokespecial   #1013 <Method void AppCompatTextView(Context)>
	//   14   28:putfield        #787 <Field TextView mTitleTextView>
				mTitleTextView.setSingleLine();
	//   15   31:aload_0         
	//   16   32:getfield        #787 <Field TextView mTitleTextView>
	//   17   35:invokevirtual   #1016 <Method void TextView.setSingleLine()>
				mTitleTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//   18   38:aload_0         
	//   19   39:getfield        #787 <Field TextView mTitleTextView>
	//   20   42:getstatic       #1022 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//   21   45:invokevirtual   #1026 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
				if(mTitleTextAppearance != 0)
	//*  22   48:aload_0         
	//*  23   49:getfield        #153 <Field int mTitleTextAppearance>
	//*  24   52:ifeq            67
					mTitleTextView.setTextAppearance(context, mTitleTextAppearance);
	//   25   55:aload_0         
	//   26   56:getfield        #787 <Field TextView mTitleTextView>
	//   27   59:aload_2         
	//   28   60:aload_0         
	//   29   61:getfield        #153 <Field int mTitleTextAppearance>
	//   30   64:invokevirtual   #1029 <Method void TextView.setTextAppearance(Context, int)>
				if(mTitleTextColor != 0)
	//*  31   67:aload_0         
	//*  32   68:getfield        #1041 <Field int mTitleTextColor>
	//*  33   71:ifeq            85
					mTitleTextView.setTextColor(mTitleTextColor);
	//   34   74:aload_0         
	//   35   75:getfield        #787 <Field TextView mTitleTextView>
	//   36   78:aload_0         
	//   37   79:getfield        #1041 <Field int mTitleTextColor>
	//   38   82:invokevirtual   #1034 <Method void TextView.setTextColor(int)>
			}
			if(!isChildOrHidden(((View) (mTitleTextView))))
	//*  39   85:aload_0         
	//*  40   86:aload_0         
	//*  41   87:getfield        #787 <Field TextView mTitleTextView>
	//*  42   90:invokespecial   #959 <Method boolean isChildOrHidden(View)>
	//*  43   93:ifne            146
				addSystemView(((View) (mTitleTextView)), true);
	//   44   96:aload_0         
	//   45   97:aload_0         
	//   46   98:getfield        #787 <Field TextView mTitleTextView>
	//   47  101:iconst_1        
	//   48  102:invokespecial   #470 <Method void addSystemView(View, boolean)>
		} else
	//*  49  105:goto            146
		if(mTitleTextView != null && isChildOrHidden(((View) (mTitleTextView))))
	//*  50  108:aload_0         
	//*  51  109:getfield        #787 <Field TextView mTitleTextView>
	//*  52  112:ifnull          146
	//*  53  115:aload_0         
	//*  54  116:aload_0         
	//*  55  117:getfield        #787 <Field TextView mTitleTextView>
	//*  56  120:invokespecial   #959 <Method boolean isChildOrHidden(View)>
	//*  57  123:ifeq            146
		{
			removeView(((View) (mTitleTextView)));
	//   58  126:aload_0         
	//   59  127:aload_0         
	//   60  128:getfield        #787 <Field TextView mTitleTextView>
	//   61  131:invokevirtual   #962 <Method void removeView(View)>
			mHiddenViews.remove(((Object) (mTitleTextView)));
	//   62  134:aload_0         
	//   63  135:getfield        #120 <Field ArrayList mHiddenViews>
	//   64  138:aload_0         
	//   65  139:getfield        #787 <Field TextView mTitleTextView>
	//   66  142:invokevirtual   #965 <Method boolean ArrayList.remove(Object)>
	//   67  145:pop             
		}
		if(mTitleTextView != null)
	//*  68  146:aload_0         
	//*  69  147:getfield        #787 <Field TextView mTitleTextView>
	//*  70  150:ifnull          161
			mTitleTextView.setText(charsequence);
	//   71  153:aload_0         
	//   72  154:getfield        #787 <Field TextView mTitleTextView>
	//   73  157:aload_1         
	//   74  158:invokevirtual   #1037 <Method void TextView.setText(CharSequence)>
		mTitleText = charsequence;
	//   75  161:aload_0         
	//   76  162:aload_1         
	//   77  163:putfield        #750 <Field CharSequence mTitleText>
	//   78  166:return          
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
	//   13   22:invokevirtual   #945 <Method void requestLayout()>
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
	//    4    6:invokevirtual   #945 <Method void requestLayout()>
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
	//    4    6:invokevirtual   #945 <Method void requestLayout()>
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
	//    4    6:invokevirtual   #945 <Method void requestLayout()>
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
	//    4    6:invokevirtual   #945 <Method void requestLayout()>
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
	//*   4    6:getfield        #787 <Field TextView mTitleTextView>
	//*   5    9:ifnull          21
			mTitleTextView.setTextAppearance(context, i);
	//    6   12:aload_0         
	//    7   13:getfield        #787 <Field TextView mTitleTextView>
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:invokevirtual   #1029 <Method void TextView.setTextAppearance(Context, int)>
	//   11   21:return          
	}

	public void setTitleTextColor(int i)
	{
		mTitleTextColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #1041 <Field int mTitleTextColor>
		if(mTitleTextView != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #787 <Field TextView mTitleTextView>
	//*   5    9:ifnull          20
			mTitleTextView.setTextColor(i);
	//    6   12:aload_0         
	//    7   13:getfield        #787 <Field TextView mTitleTextView>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #1034 <Method void TextView.setTextColor(int)>
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
	//    5   11:invokevirtual   #1050 <Method boolean ActionMenuView.showOverflowMenu()>
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
