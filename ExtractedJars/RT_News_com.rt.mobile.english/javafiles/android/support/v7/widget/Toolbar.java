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
		//*  26   49:invokevirtual   #139 <Method MenuItem MenuBuilder.getItem(int)>
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
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #46  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #48  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #53  <Method void Runtime(String)>
		//    4    9:athrow          
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
		//   18   30:putfield        #39  <Field boolean isOverflowOpen>
		//   19   33:return          
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
		int j = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_3        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		boolean flag;
		if(j == 1)
	//*   5    8:iload_3         
	//*   6    9:iconst_1        
	//*   7   10:icmpne          18
			flag = true;
	//    8   13:iconst_1        
	//    9   14:istore_3        
		else
	//*  10   15:goto            20
			flag = false;
	//   11   18:iconst_0        
	//   12   19:istore_3        
		int l = getChildCount();
	//   13   20:aload_0         
	//   14   21:invokevirtual   #348 <Method int getChildCount()>
	//   15   24:istore          6
		int k = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(((View) (this))));
	//   16   26:iload_2         
	//   17   27:aload_0         
	//   18   28:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//   19   31:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   20   34:istore          5
		list.clear();
	//   21   36:aload_1         
	//   22   37:invokeinterface #358 <Method void List.clear()>
		i = ((int) (flag1));
	//   23   42:iload           4
	//   24   44:istore_2        
		if(flag)
	//*  25   45:iload_3         
	//*  26   46:ifeq            122
			for(i = l - 1; i >= 0; i--)
	//*  27   49:iload           6
	//*  28   51:iconst_1        
	//*  29   52:isub            
	//*  30   53:istore_2        
	//*  31   54:iload_2         
	//*  32   55:iflt            192
			{
				View view = getChildAt(i);
	//   33   58:aload_0         
	//   34   59:iload_2         
	//   35   60:invokevirtual   #362 <Method View getChildAt(int)>
	//   36   63:astore          7
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   37   65:aload           7
	//   38   67:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   39   70:checkcast       #15  <Class Toolbar$LayoutParams>
	//   40   73:astore          8
				if(layoutparams.mViewType == 0 && shouldLayout(view) && getChildHorizontalGravity(layoutparams.gravity) == k)
	//*  41   75:aload           8
	//*  42   77:getfield        #371 <Field int Toolbar$LayoutParams.mViewType>
	//*  43   80:ifne            115
	//*  44   83:aload_0         
	//*  45   84:aload           7
	//*  46   86:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  47   89:ifeq            115
	//*  48   92:aload_0         
	//*  49   93:aload           8
	//*  50   95:getfield        #378 <Field int Toolbar$LayoutParams.gravity>
	//*  51   98:invokespecial   #382 <Method int getChildHorizontalGravity(int)>
	//*  52  101:iload           5
	//*  53  103:icmpne          115
					list.add(((Object) (view)));
	//   54  106:aload_1         
	//   55  107:aload           7
	//   56  109:invokeinterface #386 <Method boolean List.add(Object)>
	//   57  114:pop             
			}

	//   58  115:iload_2         
	//   59  116:iconst_1        
	//   60  117:isub            
	//   61  118:istore_2        
		else
	//*  62  119:goto            54
			for(; i < l; i++)
	//*  63  122:iload_2         
	//*  64  123:iload           6
	//*  65  125:icmpge          192
			{
				View view1 = getChildAt(i);
	//   66  128:aload_0         
	//   67  129:iload_2         
	//   68  130:invokevirtual   #362 <Method View getChildAt(int)>
	//   69  133:astore          7
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//   70  135:aload           7
	//   71  137:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   72  140:checkcast       #15  <Class Toolbar$LayoutParams>
	//   73  143:astore          8
				if(layoutparams1.mViewType == 0 && shouldLayout(view1) && getChildHorizontalGravity(layoutparams1.gravity) == k)
	//*  74  145:aload           8
	//*  75  147:getfield        #371 <Field int Toolbar$LayoutParams.mViewType>
	//*  76  150:ifne            185
	//*  77  153:aload_0         
	//*  78  154:aload           7
	//*  79  156:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  80  159:ifeq            185
	//*  81  162:aload_0         
	//*  82  163:aload           8
	//*  83  165:getfield        #378 <Field int Toolbar$LayoutParams.gravity>
	//*  84  168:invokespecial   #382 <Method int getChildHorizontalGravity(int)>
	//*  85  171:iload           5
	//*  86  173:icmpne          185
					list.add(((Object) (view1)));
	//   87  176:aload_1         
	//   88  177:aload           7
	//   89  179:invokeinterface #386 <Method boolean List.add(Object)>
	//   90  184:pop             
			}

	//   91  185:iload_2         
	//   92  186:iconst_1        
	//   93  187:iadd            
	//   94  188:istore_2        
	//*  95  189:goto            122
	//   96  192:return          
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
		int j = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #344 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_2        
		int k = GravityCompat.getAbsoluteGravity(i, j) & 7;
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    6   10:bipush          7
	//    7   12:iand            
	//    8   13:istore_3        
		if(k != 1)
	//*   9   14:iload_3         
	//*  10   15:iconst_1        
	//*  11   16:icmpeq          40
		{
			i = 3;
	//   12   19:iconst_3        
	//   13   20:istore_1        
			if(k != 3 && k != 5)
	//*  14   21:iload_3         
	//*  15   22:iconst_3        
	//*  16   23:icmpeq          40
	//*  17   26:iload_3         
	//*  18   27:iconst_5        
	//*  19   28:icmpeq          40
			{
				if(j == 1)
	//*  20   31:iload_2         
	//*  21   32:iconst_1        
	//*  22   33:icmpne          38
					i = 5;
	//   23   36:iconst_5        
	//   24   37:istore_1        
				return i;
	//   25   38:iload_1         
	//   26   39:ireturn         
			}
		}
		return k;
	//   27   40:iload_3         
	//   28   41:ireturn         
	}

	private int getChildTop(View view, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #15  <Class Toolbar$LayoutParams>
	//    3    7:astore          7
		int l = view.getMeasuredHeight();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #488 <Method int View.getMeasuredHeight()>
	//    6   13:istore          4
		if(i > 0)
	//*   7   15:iload_2         
	//*   8   16:ifle            29
			i = (l - i) / 2;
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
		int j = getChildVerticalGravity(layoutparams.gravity);
	//   18   31:aload_0         
	//   19   32:aload           7
	//   20   34:getfield        #378 <Field int Toolbar$LayoutParams.gravity>
	//   21   37:invokespecial   #491 <Method int getChildVerticalGravity(int)>
	//   22   40:istore_3        
		if(j != 48)
	//*  23   41:iload_3         
	//*  24   42:bipush          48
	//*  25   44:icmpeq          168
		{
			if(j != 80)
	//*  26   47:iload_3         
	//*  27   48:bipush          80
	//*  28   50:icmpeq          147
			{
				int i1 = getPaddingTop();
	//   29   53:aload_0         
	//   30   54:invokevirtual   #494 <Method int getPaddingTop()>
	//   31   57:istore          5
				i = getPaddingBottom();
	//   32   59:aload_0         
	//   33   60:invokevirtual   #497 <Method int getPaddingBottom()>
	//   34   63:istore_2        
				int j1 = getHeight();
	//   35   64:aload_0         
	//   36   65:invokevirtual   #500 <Method int getHeight()>
	//   37   68:istore          6
				int k = (j1 - i1 - i - l) / 2;
	//   38   70:iload           6
	//   39   72:iload           5
	//   40   74:isub            
	//   41   75:iload_2         
	//   42   76:isub            
	//   43   77:iload           4
	//   44   79:isub            
	//   45   80:iconst_2        
	//   46   81:idiv            
	//   47   82:istore_3        
				if(k < layoutparams.topMargin)
	//*  48   83:iload_3         
	//*  49   84:aload           7
	//*  50   86:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//*  51   89:icmpge          101
				{
					i = layoutparams.topMargin;
	//   52   92:aload           7
	//   53   94:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//   54   97:istore_2        
				} else
	//*  55   98:goto            142
				{
					l = j1 - i - l - k - i1;
	//   56  101:iload           6
	//   57  103:iload_2         
	//   58  104:isub            
	//   59  105:iload           4
	//   60  107:isub            
	//   61  108:iload_3         
	//   62  109:isub            
	//   63  110:iload           5
	//   64  112:isub            
	//   65  113:istore          4
					i = k;
	//   66  115:iload_3         
	//   67  116:istore_2        
					if(l < layoutparams.bottomMargin)
	//*  68  117:iload           4
	//*  69  119:aload           7
	//*  70  121:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//*  71  124:icmpge          142
						i = Math.max(0, k - (layoutparams.bottomMargin - l));
	//   72  127:iconst_0        
	//   73  128:iload_3         
	//   74  129:aload           7
	//   75  131:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//   76  134:iload           4
	//   77  136:isub            
	//   78  137:isub            
	//   79  138:invokestatic    #511 <Method int Math.max(int, int)>
	//   80  141:istore_2        
				}
				return i1 + i;
	//   81  142:iload           5
	//   82  144:iload_2         
	//   83  145:iadd            
	//   84  146:ireturn         
			} else
			{
				return getHeight() - getPaddingBottom() - l - layoutparams.bottomMargin - i;
	//   85  147:aload_0         
	//   86  148:invokevirtual   #500 <Method int getHeight()>
	//   87  151:aload_0         
	//   88  152:invokevirtual   #497 <Method int getPaddingBottom()>
	//   89  155:isub            
	//   90  156:iload           4
	//   91  158:isub            
	//   92  159:aload           7
	//   93  161:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//   94  164:isub            
	//   95  165:iload_2         
	//   96  166:isub            
	//   97  167:ireturn         
			}
		} else
		{
			return getPaddingTop() - i;
	//   98  168:aload_0         
	//   99  169:invokevirtual   #494 <Method int getPaddingTop()>
	//  100  172:iload_2         
	//  101  173:isub            
	//  102  174:ireturn         
		}
	}

	private int getChildVerticalGravity(int i)
	{
		i &= 0x70;
	//    0    0:iload_1         
	//    1    1:bipush          112
	//    2    3:iand            
	//    3    4:istore_1        
		if(i != 16 && i != 48 && i != 80)
	//*   4    5:iload_1         
	//*   5    6:bipush          16
	//*   6    8:icmpeq          31
	//*   7   11:iload_1         
	//*   8   12:bipush          48
	//*   9   14:icmpeq          31
	//*  10   17:iload_1         
	//*  11   18:bipush          80
	//*  12   20:icmpeq          31
			return mGravity & 0x70;
	//   13   23:aload_0         
	//   14   24:getfield        #111 <Field int mGravity>
	//   15   27:bipush          112
	//   16   29:iand            
	//   17   30:ireturn         
		else
			return i;
	//   18   31:iload_1         
	//   19   32:ireturn         
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
		int i1 = list.size();
	//    8   10:aload_1         
	//    9   11:invokeinterface #536 <Method int List.size()>
	//   10   16:istore          7
		int i = 0;
	//   11   18:iconst_0        
	//   12   19:istore_3        
		int j = i;
	//   13   20:iload_3         
	//   14   21:istore          4
		for(; i < i1; i++)
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
			j += j1 + ((View) (ai)).getMeasuredWidth() + k1;
	//   55  103:iload           4
	//   56  105:iload           8
	//   57  107:aload_2         
	//   58  108:invokevirtual   #549 <Method int View.getMeasuredWidth()>
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
	//    3    5:if_acmpeq       24
	//    4    8:aload_0         
	//    5    9:getfield        #120 <Field ArrayList mHiddenViews>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #558 <Method boolean ArrayList.contains(Object)>
	//    8   16:ifeq            22
	//    9   19:goto            24
	//   10   22:iconst_0        
	//   11   23:ireturn         
	//   12   24:iconst_1        
	//   13   25:ireturn         
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
		return i + (k + layoutparams.rightMargin);
	//   43   72:iload_2         
	//   44   73:iload           5
	//   45   75:aload           6
	//   46   77:getfield        #546 <Field int Toolbar$LayoutParams.rightMargin>
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
		return i - (k + layoutparams.leftMargin);
	//   43   72:iload_2         
	//   44   73:iload           5
	//   45   75:aload           6
	//   46   77:getfield        #543 <Field int Toolbar$LayoutParams.leftMargin>
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
		boolean flag;
label0:
		{
			if(mMenuView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #427 <Field ActionMenuView mMenuView>
	//*   2    4:ifnull          31
			{
				MenuBuilder menubuilder = mMenuView.peekMenu();
	//    3    7:aload_0         
	//    4    8:getfield        #427 <Field ActionMenuView mMenuView>
	//    5   11:invokevirtual   #433 <Method MenuBuilder ActionMenuView.peekMenu()>
	//    6   14:astore_2        
				if(menubuilder != null && menubuilder.hasVisibleItems())
	//*   7   15:aload_2         
	//*   8   16:ifnull          31
	//*   9   19:aload_2         
	//*  10   20:invokevirtual   #714 <Method boolean MenuBuilder.hasVisibleItems()>
	//*  11   23:ifeq            31
				{
					flag = true;
	//   12   26:iconst_1        
	//   13   27:istore_1        
					break label0;
	//   14   28:goto            33
				}
			}
			flag = false;
	//   15   31:iconst_0        
	//   16   32:istore_1        
		}
		if(flag)
	//*  17   33:iload_1         
	//*  18   34:ifeq            53
			return Math.max(getContentInsetEnd(), Math.max(mContentInsetEndWithActions, 0));
	//   19   37:aload_0         
	//   20   38:invokevirtual   #695 <Method int getContentInsetEnd()>
	//   21   41:aload_0         
	//   22   42:getfield        #247 <Field int mContentInsetEndWithActions>
	//   23   45:iconst_0        
	//   24   46:invokestatic    #511 <Method int Math.max(int, int)>
	//   25   49:invokestatic    #511 <Method int Math.max(int, int)>
	//   26   52:ireturn         
		else
			return getContentInsetEnd();
	//   27   53:aload_0         
	//   28   54:invokevirtual   #695 <Method int getContentInsetEnd()>
	//   29   57:ireturn         
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
		if(mTitleTextView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #792 <Field TextView mTitleTextView>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		Layout layout = mTitleTextView.getLayout();
	//    5    9:aload_0         
	//    6   10:getfield        #792 <Field TextView mTitleTextView>
	//    7   13:invokevirtual   #798 <Method Layout TextView.getLayout()>
	//    8   16:astore_3        
		if(layout == null)
	//*   9   17:aload_3         
	//*  10   18:ifnonnull       23
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		int j = layout.getLineCount();
	//   13   23:aload_3         
	//   14   24:invokevirtual   #803 <Method int Layout.getLineCount()>
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
	//*  23   37:invokevirtual   #806 <Method int Layout.getEllipsisCount(int)>
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
		boolean flag2;
		int k3;
		int l3;
		int i4;
		int l4;
		int i5;
		boolean flag3;
		int ai[];
		int j1;
		int k2;
label0:
		{
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
			k3 = getWidth();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #825 <Method int getWidth()>
	//   11   21:istore          10
			l4 = getHeight();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #500 <Method int getHeight()>
	//   14   27:istore          13
			i1 = getPaddingLeft();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #575 <Method int getPaddingLeft()>
	//   17   33:istore          6
			l3 = getPaddingRight();
	//   18   35:aload_0         
	//   19   36:invokevirtual   #578 <Method int getPaddingRight()>
	//   20   39:istore          11
			i4 = getPaddingTop();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #494 <Method int getPaddingTop()>
	//   23   45:istore          12
			i5 = getPaddingBottom();
	//   24   47:aload_0         
	//   25   48:invokevirtual   #497 <Method int getPaddingBottom()>
	//   26   51:istore          14
			k2 = k3 - l3;
	//   27   53:iload           10
	//   28   55:iload           11
	//   29   57:isub            
	//   30   58:istore          9
			ai = mTempMargins;
	//   31   60:aload_0         
	//   32   61:getfield        #122 <Field int[] mTempMargins>
	//   33   64:astore          18
			ai[1] = 0;
	//   34   66:aload           18
	//   35   68:iconst_1        
	//   36   69:iconst_0        
	//   37   70:iastore         
			ai[0] = 0;
	//   38   71:aload           18
	//   39   73:iconst_0        
	//   40   74:iconst_0        
	//   41   75:iastore         
			i = ViewCompat.getMinimumHeight(((View) (this)));
	//   42   76:aload_0         
	//   43   77:invokestatic    #828 <Method int ViewCompat.getMinimumHeight(View)>
	//   44   80:istore_2        
			if(i >= 0)
	//*  45   81:iload_2         
	//*  46   82:iflt            98
				l = Math.min(i, l - j);
	//   47   85:iload_2         
	//   48   86:iload           5
	//   49   88:iload_3         
	//   50   89:isub            
	//   51   90:invokestatic    #605 <Method int Math.min(int, int)>
	//   52   93:istore          5
			else
	//*  53   95:goto            101
				l = 0;
	//   54   98:iconst_0        
	//   55   99:istore          5
			if(shouldLayout(((View) (mNavButtonView))))
	//*  56  101:aload_0         
	//*  57  102:aload_0         
	//*  58  103:getfield        #473 <Field ImageButton mNavButtonView>
	//*  59  106:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  60  109:ifeq            159
			{
				if(flag2)
	//*  61  112:iload           8
	//*  62  114:ifeq            140
				{
					k = layoutChildRight(((View) (mNavButtonView)), k2, ai, l);
	//   63  117:aload_0         
	//   64  118:aload_0         
	//   65  119:getfield        #473 <Field ImageButton mNavButtonView>
	//   66  122:iload           9
	//   67  124:aload           18
	//   68  126:iload           5
	//   69  128:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//   70  131:istore          4
					j1 = i1;
	//   71  133:iload           6
	//   72  135:istore          7
					break label0;
	//   73  137:goto            167
				}
				j1 = layoutChildLeft(((View) (mNavButtonView)), i1, ai, l);
	//   74  140:aload_0         
	//   75  141:aload_0         
	//   76  142:getfield        #473 <Field ImageButton mNavButtonView>
	//   77  145:iload           6
	//   78  147:aload           18
	//   79  149:iload           5
	//   80  151:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//   81  154:istore          7
			} else
	//*  82  156:goto            163
			{
				j1 = i1;
	//   83  159:iload           6
	//   84  161:istore          7
			}
			k = k2;
	//   85  163:iload           9
	//   86  165:istore          4
		}
		i = k;
	//   87  167:iload           4
	//   88  169:istore_2        
		j = j1;
	//   89  170:iload           7
	//   90  172:istore_3        
		if(shouldLayout(((View) (mCollapseButtonView))))
	//*  91  173:aload_0         
	//*  92  174:aload_0         
	//*  93  175:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  94  178:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  95  181:ifeq            228
			if(flag2)
	//*  96  184:iload           8
	//*  97  186:ifeq            210
			{
				i = layoutChildRight(((View) (mCollapseButtonView)), k, ai, l);
	//   98  189:aload_0         
	//   99  190:aload_0         
	//  100  191:getfield        #656 <Field ImageButton mCollapseButtonView>
	//  101  194:iload           4
	//  102  196:aload           18
	//  103  198:iload           5
	//  104  200:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//  105  203:istore_2        
				j = j1;
	//  106  204:iload           7
	//  107  206:istore_3        
			} else
	//* 108  207:goto            228
			{
				j = layoutChildLeft(((View) (mCollapseButtonView)), j1, ai, l);
	//  109  210:aload_0         
	//  110  211:aload_0         
	//  111  212:getfield        #656 <Field ImageButton mCollapseButtonView>
	//  112  215:iload           7
	//  113  217:aload           18
	//  114  219:iload           5
	//  115  221:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//  116  224:istore_3        
				i = k;
	//  117  225:iload           4
	//  118  227:istore_2        
			}
		k = i;
	//  119  228:iload_2         
	//  120  229:istore          4
		j1 = j;
	//  121  231:iload_3         
	//  122  232:istore          7
		if(shouldLayout(((View) (mMenuView))))
	//* 123  234:aload_0         
	//* 124  235:aload_0         
	//* 125  236:getfield        #427 <Field ActionMenuView mMenuView>
	//* 126  239:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 127  242:ifeq            289
			if(flag2)
	//* 128  245:iload           8
	//* 129  247:ifeq            271
			{
				j1 = layoutChildLeft(((View) (mMenuView)), j, ai, l);
	//  130  250:aload_0         
	//  131  251:aload_0         
	//  132  252:getfield        #427 <Field ActionMenuView mMenuView>
	//  133  255:iload_3         
	//  134  256:aload           18
	//  135  258:iload           5
	//  136  260:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//  137  263:istore          7
				k = i;
	//  138  265:iload_2         
	//  139  266:istore          4
			} else
	//* 140  268:goto            289
			{
				k = layoutChildRight(((View) (mMenuView)), i, ai, l);
	//  141  271:aload_0         
	//  142  272:aload_0         
	//  143  273:getfield        #427 <Field ActionMenuView mMenuView>
	//  144  276:iload_2         
	//  145  277:aload           18
	//  146  279:iload           5
	//  147  281:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//  148  284:istore          4
				j1 = j;
	//  149  286:iload_3         
	//  150  287:istore          7
			}
		j = getCurrentContentInsetLeft();
	//  151  289:aload_0         
	//  152  290:invokevirtual   #834 <Method int getCurrentContentInsetLeft()>
	//  153  293:istore_3        
		i = getCurrentContentInsetRight();
	//  154  294:aload_0         
	//  155  295:invokevirtual   #836 <Method int getCurrentContentInsetRight()>
	//  156  298:istore_2        
		ai[0] = Math.max(0, j - j1);
	//  157  299:aload           18
	//  158  301:iconst_0        
	//  159  302:iconst_0        
	//  160  303:iload_3         
	//  161  304:iload           7
	//  162  306:isub            
	//  163  307:invokestatic    #511 <Method int Math.max(int, int)>
	//  164  310:iastore         
		ai[1] = Math.max(0, i - (k2 - k));
	//  165  311:aload           18
	//  166  313:iconst_1        
	//  167  314:iconst_0        
	//  168  315:iload_2         
	//  169  316:iload           9
	//  170  318:iload           4
	//  171  320:isub            
	//  172  321:isub            
	//  173  322:invokestatic    #511 <Method int Math.max(int, int)>
	//  174  325:iastore         
		j = Math.max(j1, j);
	//  175  326:iload           7
	//  176  328:iload_3         
	//  177  329:invokestatic    #511 <Method int Math.max(int, int)>
	//  178  332:istore_3        
		k = Math.min(k, k2 - i);
	//  179  333:iload           4
	//  180  335:iload           9
	//  181  337:iload_2         
	//  182  338:isub            
	//  183  339:invokestatic    #605 <Method int Math.min(int, int)>
	//  184  342:istore          4
		i = j;
	//  185  344:iload_3         
	//  186  345:istore_2        
		j1 = k;
	//  187  346:iload           4
	//  188  348:istore          7
		if(shouldLayout(mExpandedActionView))
	//* 189  350:aload_0         
	//* 190  351:aload_0         
	//* 191  352:getfield        #404 <Field View mExpandedActionView>
	//* 192  355:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 193  358:ifeq            405
			if(flag2)
	//* 194  361:iload           8
	//* 195  363:ifeq            387
			{
				j1 = layoutChildRight(mExpandedActionView, k, ai, l);
	//  196  366:aload_0         
	//  197  367:aload_0         
	//  198  368:getfield        #404 <Field View mExpandedActionView>
	//  199  371:iload           4
	//  200  373:aload           18
	//  201  375:iload           5
	//  202  377:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//  203  380:istore          7
				i = j;
	//  204  382:iload_3         
	//  205  383:istore_2        
			} else
	//* 206  384:goto            405
			{
				i = layoutChildLeft(mExpandedActionView, j, ai, l);
	//  207  387:aload_0         
	//  208  388:aload_0         
	//  209  389:getfield        #404 <Field View mExpandedActionView>
	//  210  392:iload_3         
	//  211  393:aload           18
	//  212  395:iload           5
	//  213  397:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//  214  400:istore_2        
				j1 = k;
	//  215  401:iload           4
	//  216  403:istore          7
			}
		k = i;
	//  217  405:iload_2         
	//  218  406:istore          4
		j = j1;
	//  219  408:iload           7
	//  220  410:istore_3        
		if(shouldLayout(((View) (mLogoView))))
	//* 221  411:aload_0         
	//* 222  412:aload_0         
	//* 223  413:getfield        #417 <Field ImageView mLogoView>
	//* 224  416:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 225  419:ifeq            466
			if(flag2)
	//* 226  422:iload           8
	//* 227  424:ifeq            448
			{
				j = layoutChildRight(((View) (mLogoView)), j1, ai, l);
	//  228  427:aload_0         
	//  229  428:aload_0         
	//  230  429:getfield        #417 <Field ImageView mLogoView>
	//  231  432:iload           7
	//  232  434:aload           18
	//  233  436:iload           5
	//  234  438:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//  235  441:istore_3        
				k = i;
	//  236  442:iload_2         
	//  237  443:istore          4
			} else
	//* 238  445:goto            466
			{
				k = layoutChildLeft(((View) (mLogoView)), i, ai, l);
	//  239  448:aload_0         
	//  240  449:aload_0         
	//  241  450:getfield        #417 <Field ImageView mLogoView>
	//  242  453:iload_2         
	//  243  454:aload           18
	//  244  456:iload           5
	//  245  458:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//  246  461:istore          4
				j = j1;
	//  247  463:iload           7
	//  248  465:istore_3        
			}
		flag = shouldLayout(((View) (mTitleTextView)));
	//  249  466:aload_0         
	//  250  467:aload_0         
	//  251  468:getfield        #792 <Field TextView mTitleTextView>
	//  252  471:invokespecial   #375 <Method boolean shouldLayout(View)>
	//  253  474:istore_1        
		flag3 = shouldLayout(((View) (mSubtitleTextView)));
	//  254  475:aload_0         
	//  255  476:aload_0         
	//  256  477:getfield        #838 <Field TextView mSubtitleTextView>
	//  257  480:invokespecial   #375 <Method boolean shouldLayout(View)>
	//  258  483:istore          15
		if(flag)
	//* 259  485:iload_1         
	//* 260  486:ifeq            526
		{
			LayoutParams layoutparams = (LayoutParams)mTitleTextView.getLayoutParams();
	//  261  489:aload_0         
	//  262  490:getfield        #792 <Field TextView mTitleTextView>
	//  263  493:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  264  496:checkcast       #15  <Class Toolbar$LayoutParams>
	//  265  499:astore          16
			i = layoutparams.topMargin + mTitleTextView.getMeasuredHeight() + layoutparams.bottomMargin + 0;
	//  266  501:aload           16
	//  267  503:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//  268  506:aload_0         
	//  269  507:getfield        #792 <Field TextView mTitleTextView>
	//  270  510:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//  271  513:iadd            
	//  272  514:aload           16
	//  273  516:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//  274  519:iadd            
	//  275  520:iconst_0        
	//  276  521:iadd            
	//  277  522:istore_2        
		} else
	//* 278  523:goto            528
		{
			i = 0;
	//  279  526:iconst_0        
	//  280  527:istore_2        
		}
		if(flag3)
	//* 281  528:iload           15
	//* 282  530:ifeq            570
		{
			LayoutParams layoutparams1 = (LayoutParams)mSubtitleTextView.getLayoutParams();
	//  283  533:aload_0         
	//  284  534:getfield        #838 <Field TextView mSubtitleTextView>
	//  285  537:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  286  540:checkcast       #15  <Class Toolbar$LayoutParams>
	//  287  543:astore          16
			i += layoutparams1.topMargin + mSubtitleTextView.getMeasuredHeight() + layoutparams1.bottomMargin;
	//  288  545:iload_2         
	//  289  546:aload           16
	//  290  548:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//  291  551:aload_0         
	//  292  552:getfield        #838 <Field TextView mSubtitleTextView>
	//  293  555:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//  294  558:iadd            
	//  295  559:aload           16
	//  296  561:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//  297  564:iadd            
	//  298  565:iadd            
	//  299  566:istore_2        
		}
	//* 300  567:goto            570
		if(!flag && !flag3) goto _L2; else goto _L1
	//  301  570:iload_1         
	//  302  571:ifne            591
	//  303  574:iload           15
	//  304  576:ifeq            582
	//* 305  579:goto            591
_L2:
		i = k;
	//  306  582:iload           4
	//  307  584:istore_2        
_L4:
		k = j;
	//  308  585:iload_3         
	//  309  586:istore          4
		break MISSING_BLOCK_LABEL_1321;
	//  310  588:goto            1321
_L1:
		boolean flag1;
		Object obj;
		if(flag)
	//* 311  591:iload_1         
	//* 312  592:ifeq            604
			obj = ((Object) (mTitleTextView));
	//  313  595:aload_0         
	//  314  596:getfield        #792 <Field TextView mTitleTextView>
	//  315  599:astore          16
		else
	//* 316  601:goto            610
			obj = ((Object) (mSubtitleTextView));
	//  317  604:aload_0         
	//  318  605:getfield        #838 <Field TextView mSubtitleTextView>
	//  319  608:astore          16
		Object obj1;
		if(flag3)
	//* 320  610:iload           15
	//* 321  612:ifeq            624
			obj1 = ((Object) (mSubtitleTextView));
	//  322  615:aload_0         
	//  323  616:getfield        #838 <Field TextView mSubtitleTextView>
	//  324  619:astore          17
		else
	//* 325  621:goto            630
			obj1 = ((Object) (mTitleTextView));
	//  326  624:aload_0         
	//  327  625:getfield        #792 <Field TextView mTitleTextView>
	//  328  628:astore          17
		obj = ((Object) ((LayoutParams)((View) (obj)).getLayoutParams()));
	//  329  630:aload           16
	//  330  632:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  331  635:checkcast       #15  <Class Toolbar$LayoutParams>
	//  332  638:astore          16
		obj1 = ((Object) ((LayoutParams)((View) (obj1)).getLayoutParams()));
	//  333  640:aload           17
	//  334  642:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  335  645:checkcast       #15  <Class Toolbar$LayoutParams>
	//  336  648:astore          17
		if(flag && mTitleTextView.getMeasuredWidth() > 0 || flag3 && mSubtitleTextView.getMeasuredWidth() > 0)
	//* 337  650:iload_1         
	//* 338  651:ifeq            664
	//* 339  654:aload_0         
	//* 340  655:getfield        #792 <Field TextView mTitleTextView>
	//* 341  658:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//* 342  661:ifgt            679
	//* 343  664:iload           15
	//* 344  666:ifeq            685
	//* 345  669:aload_0         
	//* 346  670:getfield        #838 <Field TextView mSubtitleTextView>
	//* 347  673:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//* 348  676:ifle            685
			flag1 = true;
	//  349  679:iconst_1        
	//  350  680:istore          7
		else
	//* 351  682:goto            688
			flag1 = false;
	//  352  685:iconst_0        
	//  353  686:istore          7
		int l2 = mGravity & 0x70;
	//  354  688:aload_0         
	//  355  689:getfield        #111 <Field int mGravity>
	//  356  692:bipush          112
	//  357  694:iand            
	//  358  695:istore          9
		if(l2 != 48)
	//* 359  697:iload           9
	//* 360  699:bipush          48
	//* 361  701:icmpeq          838
		{
			if(l2 != 80)
	//* 362  704:iload           9
	//* 363  706:bipush          80
	//* 364  708:icmpeq          816
			{
				l2 = (l4 - i4 - i5 - i) / 2;
	//  365  711:iload           13
	//  366  713:iload           12
	//  367  715:isub            
	//  368  716:iload           14
	//  369  718:isub            
	//  370  719:iload_2         
	//  371  720:isub            
	//  372  721:iconst_2        
	//  373  722:idiv            
	//  374  723:istore          9
				if(l2 < ((LayoutParams) (obj)).topMargin + mTitleMarginTop)
	//* 375  725:iload           9
	//* 376  727:aload           16
	//* 377  729:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//* 378  732:aload_0         
	//* 379  733:getfield        #186 <Field int mTitleMarginTop>
	//* 380  736:iadd            
	//* 381  737:icmpge          754
				{
					i = ((LayoutParams) (obj)).topMargin + mTitleMarginTop;
	//  382  740:aload           16
	//  383  742:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//  384  745:aload_0         
	//  385  746:getfield        #186 <Field int mTitleMarginTop>
	//  386  749:iadd            
	//  387  750:istore_2        
				} else
	//* 388  751:goto            808
				{
					l4 = l4 - i5 - i - l2 - i4;
	//  389  754:iload           13
	//  390  756:iload           14
	//  391  758:isub            
	//  392  759:iload_2         
	//  393  760:isub            
	//  394  761:iload           9
	//  395  763:isub            
	//  396  764:iload           12
	//  397  766:isub            
	//  398  767:istore          13
					i = l2;
	//  399  769:iload           9
	//  400  771:istore_2        
					if(l4 < ((LayoutParams) (obj)).bottomMargin + mTitleMarginBottom)
	//* 401  772:iload           13
	//* 402  774:aload           16
	//* 403  776:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 404  779:aload_0         
	//* 405  780:getfield        #184 <Field int mTitleMarginBottom>
	//* 406  783:iadd            
	//* 407  784:icmpge          808
						i = Math.max(0, l2 - ((((LayoutParams) (obj1)).bottomMargin + mTitleMarginBottom) - l4));
	//  408  787:iconst_0        
	//  409  788:iload           9
	//  410  790:aload           17
	//  411  792:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//  412  795:aload_0         
	//  413  796:getfield        #184 <Field int mTitleMarginBottom>
	//  414  799:iadd            
	//  415  800:iload           13
	//  416  802:isub            
	//  417  803:isub            
	//  418  804:invokestatic    #511 <Method int Math.max(int, int)>
	//  419  807:istore_2        
				}
				i = i4 + i;
	//  420  808:iload           12
	//  421  810:iload_2         
	//  422  811:iadd            
	//  423  812:istore_2        
			} else
	//* 424  813:goto            854
			{
				i = l4 - i5 - ((LayoutParams) (obj1)).bottomMargin - mTitleMarginBottom - i;
	//  425  816:iload           13
	//  426  818:iload           14
	//  427  820:isub            
	//  428  821:aload           17
	//  429  823:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//  430  826:isub            
	//  431  827:aload_0         
	//  432  828:getfield        #184 <Field int mTitleMarginBottom>
	//  433  831:isub            
	//  434  832:iload_2         
	//  435  833:isub            
	//  436  834:istore_2        
			}
		} else
	//* 437  835:goto            854
		{
			i = getPaddingTop() + ((LayoutParams) (obj)).topMargin + mTitleMarginTop;
	//  438  838:aload_0         
	//  439  839:invokevirtual   #494 <Method int getPaddingTop()>
	//  440  842:aload           16
	//  441  844:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//  442  847:iadd            
	//  443  848:aload_0         
	//  444  849:getfield        #186 <Field int mTitleMarginTop>
	//  445  852:iadd            
	//  446  853:istore_2        
		}
		if(!flag2)
			break; /* Loop/switch isn't completed */
	//  447  854:iload           8
	//  448  856:ifeq            1089
		int l1;
		if(flag1)
	//* 449  859:iload           7
	//* 450  861:ifeq            873
			l1 = mTitleMarginStart;
	//  451  864:aload_0         
	//  452  865:getfield        #190 <Field int mTitleMarginStart>
	//  453  868:istore          8
		else
	//* 454  870:goto            876
			l1 = 0;
	//  455  873:iconst_0        
	//  456  874:istore          8
		l1 -= ai[1];
	//  457  876:iload           8
	//  458  878:aload           18
	//  459  880:iconst_1        
	//  460  881:iaload          
	//  461  882:isub            
	//  462  883:istore          8
		j -= Math.max(0, l1);
	//  463  885:iload_3         
	//  464  886:iconst_0        
	//  465  887:iload           8
	//  466  889:invokestatic    #511 <Method int Math.max(int, int)>
	//  467  892:isub            
	//  468  893:istore_3        
		ai[1] = Math.max(0, -l1);
	//  469  894:aload           18
	//  470  896:iconst_1        
	//  471  897:iconst_0        
	//  472  898:iload           8
	//  473  900:ineg            
	//  474  901:invokestatic    #511 <Method int Math.max(int, int)>
	//  475  904:iastore         
		if(flag)
	//* 476  905:iload_1         
	//* 477  906:ifeq            977
		{
			LayoutParams layoutparams2 = (LayoutParams)mTitleTextView.getLayoutParams();
	//  478  909:aload_0         
	//  479  910:getfield        #792 <Field TextView mTitleTextView>
	//  480  913:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  481  916:checkcast       #15  <Class Toolbar$LayoutParams>
	//  482  919:astore          16
			l2 = j - mTitleTextView.getMeasuredWidth();
	//  483  921:iload_3         
	//  484  922:aload_0         
	//  485  923:getfield        #792 <Field TextView mTitleTextView>
	//  486  926:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//  487  929:isub            
	//  488  930:istore          9
			l1 = mTitleTextView.getMeasuredHeight() + i;
	//  489  932:aload_0         
	//  490  933:getfield        #792 <Field TextView mTitleTextView>
	//  491  936:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//  492  939:iload_2         
	//  493  940:iadd            
	//  494  941:istore          8
			mTitleTextView.layout(l2, i, j, l1);
	//  495  943:aload_0         
	//  496  944:getfield        #792 <Field TextView mTitleTextView>
	//  497  947:iload           9
	//  498  949:iload_2         
	//  499  950:iload_3         
	//  500  951:iload           8
	//  501  953:invokevirtual   #842 <Method void TextView.layout(int, int, int, int)>
			i = l2 - mTitleMarginEnd;
	//  502  956:iload           9
	//  503  958:aload_0         
	//  504  959:getfield        #188 <Field int mTitleMarginEnd>
	//  505  962:isub            
	//  506  963:istore_2        
			l2 = l1 + layoutparams2.bottomMargin;
	//  507  964:iload           8
	//  508  966:aload           16
	//  509  968:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//  510  971:iadd            
	//  511  972:istore          9
		} else
	//* 512  974:goto            986
		{
			l1 = j;
	//  513  977:iload_3         
	//  514  978:istore          8
			l2 = i;
	//  515  980:iload_2         
	//  516  981:istore          9
			i = l1;
	//  517  983:iload           8
	//  518  985:istore_2        
		}
		if(flag3)
	//* 519  986:iload           15
	//* 520  988:ifeq            1068
		{
			LayoutParams layoutparams3 = (LayoutParams)mSubtitleTextView.getLayoutParams();
	//  521  991:aload_0         
	//  522  992:getfield        #838 <Field TextView mSubtitleTextView>
	//  523  995:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  524  998:checkcast       #15  <Class Toolbar$LayoutParams>
	//  525 1001:astore          16
			l1 = l2 + layoutparams3.topMargin;
	//  526 1003:iload           9
	//  527 1005:aload           16
	//  528 1007:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//  529 1010:iadd            
	//  530 1011:istore          8
			l2 = mSubtitleTextView.getMeasuredWidth();
	//  531 1013:aload_0         
	//  532 1014:getfield        #838 <Field TextView mSubtitleTextView>
	//  533 1017:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//  534 1020:istore          9
			int j4 = mSubtitleTextView.getMeasuredHeight();
	//  535 1022:aload_0         
	//  536 1023:getfield        #838 <Field TextView mSubtitleTextView>
	//  537 1026:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//  538 1029:istore          12
			mSubtitleTextView.layout(j - l2, l1, j, j4 + l1);
	//  539 1031:aload_0         
	//  540 1032:getfield        #838 <Field TextView mSubtitleTextView>
	//  541 1035:iload_3         
	//  542 1036:iload           9
	//  543 1038:isub            
	//  544 1039:iload           8
	//  545 1041:iload_3         
	//  546 1042:iload           12
	//  547 1044:iload           8
	//  548 1046:iadd            
	//  549 1047:invokevirtual   #842 <Method void TextView.layout(int, int, int, int)>
			l1 = j - mTitleMarginEnd;
	//  550 1050:iload_3         
	//  551 1051:aload_0         
	//  552 1052:getfield        #188 <Field int mTitleMarginEnd>
	//  553 1055:isub            
	//  554 1056:istore          8
			l2 = layoutparams3.bottomMargin;
	//  555 1058:aload           16
	//  556 1060:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//  557 1063:istore          9
		} else
	//* 558 1065:goto            1071
		{
			l1 = j;
	//  559 1068:iload_3         
	//  560 1069:istore          8
		}
		if(flag1)
	//* 561 1071:iload           7
	//* 562 1073:ifeq            1083
			j = Math.min(i, l1);
	//  563 1076:iload_2         
	//  564 1077:iload           8
	//  565 1079:invokestatic    #605 <Method int Math.min(int, int)>
	//  566 1082:istore_3        
		i = k;
	//  567 1083:iload           4
	//  568 1085:istore_2        
		if(true) goto _L4; else goto _L3
	//  569 1086:goto            585
_L3:
		int i2;
		if(flag1)
	//* 570 1089:iload           7
	//* 571 1091:ifeq            1103
			i2 = mTitleMarginStart;
	//  572 1094:aload_0         
	//  573 1095:getfield        #190 <Field int mTitleMarginStart>
	//  574 1098:istore          8
		else
	//* 575 1100:goto            1106
			i2 = 0;
	//  576 1103:iconst_0        
	//  577 1104:istore          8
		i2 -= ai[0];
	//  578 1106:iload           8
	//  579 1108:aload           18
	//  580 1110:iconst_0        
	//  581 1111:iaload          
	//  582 1112:isub            
	//  583 1113:istore          8
		k += Math.max(0, i2);
	//  584 1115:iload           4
	//  585 1117:iconst_0        
	//  586 1118:iload           8
	//  587 1120:invokestatic    #511 <Method int Math.max(int, int)>
	//  588 1123:iadd            
	//  589 1124:istore          4
		ai[0] = Math.max(0, -i2);
	//  590 1126:aload           18
	//  591 1128:iconst_0        
	//  592 1129:iconst_0        
	//  593 1130:iload           8
	//  594 1132:ineg            
	//  595 1133:invokestatic    #511 <Method int Math.max(int, int)>
	//  596 1136:iastore         
		if(flag)
	//* 597 1137:iload_1         
	//* 598 1138:ifeq            1211
		{
			LayoutParams layoutparams4 = (LayoutParams)mTitleTextView.getLayoutParams();
	//  599 1141:aload_0         
	//  600 1142:getfield        #792 <Field TextView mTitleTextView>
	//  601 1145:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  602 1148:checkcast       #15  <Class Toolbar$LayoutParams>
	//  603 1151:astore          16
			i2 = mTitleTextView.getMeasuredWidth() + k;
	//  604 1153:aload_0         
	//  605 1154:getfield        #792 <Field TextView mTitleTextView>
	//  606 1157:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//  607 1160:iload           4
	//  608 1162:iadd            
	//  609 1163:istore          8
			int i3 = mTitleTextView.getMeasuredHeight() + i;
	//  610 1165:aload_0         
	//  611 1166:getfield        #792 <Field TextView mTitleTextView>
	//  612 1169:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//  613 1172:iload_2         
	//  614 1173:iadd            
	//  615 1174:istore          9
			mTitleTextView.layout(k, i, i2, i3);
	//  616 1176:aload_0         
	//  617 1177:getfield        #792 <Field TextView mTitleTextView>
	//  618 1180:iload           4
	//  619 1182:iload_2         
	//  620 1183:iload           8
	//  621 1185:iload           9
	//  622 1187:invokevirtual   #842 <Method void TextView.layout(int, int, int, int)>
			i2 += mTitleMarginEnd;
	//  623 1190:iload           8
	//  624 1192:aload_0         
	//  625 1193:getfield        #188 <Field int mTitleMarginEnd>
	//  626 1196:iadd            
	//  627 1197:istore          8
			i = i3 + layoutparams4.bottomMargin;
	//  628 1199:iload           9
	//  629 1201:aload           16
	//  630 1203:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//  631 1206:iadd            
	//  632 1207:istore_2        
		} else
	//* 633 1208:goto            1215
		{
			i2 = k;
	//  634 1211:iload           4
	//  635 1213:istore          8
		}
		int j3;
		if(flag3)
	//* 636 1215:iload           15
	//* 637 1217:ifeq            1295
		{
			LayoutParams layoutparams5 = (LayoutParams)mSubtitleTextView.getLayoutParams();
	//  638 1220:aload_0         
	//  639 1221:getfield        #838 <Field TextView mSubtitleTextView>
	//  640 1224:invokevirtual   #839 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  641 1227:checkcast       #15  <Class Toolbar$LayoutParams>
	//  642 1230:astore          16
			i += layoutparams5.topMargin;
	//  643 1232:iload_2         
	//  644 1233:aload           16
	//  645 1235:getfield        #503 <Field int Toolbar$LayoutParams.topMargin>
	//  646 1238:iadd            
	//  647 1239:istore_2        
			j3 = mSubtitleTextView.getMeasuredWidth() + k;
	//  648 1240:aload_0         
	//  649 1241:getfield        #838 <Field TextView mSubtitleTextView>
	//  650 1244:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//  651 1247:iload           4
	//  652 1249:iadd            
	//  653 1250:istore          9
			int k4 = mSubtitleTextView.getMeasuredHeight();
	//  654 1252:aload_0         
	//  655 1253:getfield        #838 <Field TextView mSubtitleTextView>
	//  656 1256:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//  657 1259:istore          12
			mSubtitleTextView.layout(k, i, j3, k4 + i);
	//  658 1261:aload_0         
	//  659 1262:getfield        #838 <Field TextView mSubtitleTextView>
	//  660 1265:iload           4
	//  661 1267:iload_2         
	//  662 1268:iload           9
	//  663 1270:iload           12
	//  664 1272:iload_2         
	//  665 1273:iadd            
	//  666 1274:invokevirtual   #842 <Method void TextView.layout(int, int, int, int)>
			j3 += mTitleMarginEnd;
	//  667 1277:iload           9
	//  668 1279:aload_0         
	//  669 1280:getfield        #188 <Field int mTitleMarginEnd>
	//  670 1283:iadd            
	//  671 1284:istore          9
			i = layoutparams5.bottomMargin;
	//  672 1286:aload           16
	//  673 1288:getfield        #506 <Field int Toolbar$LayoutParams.bottomMargin>
	//  674 1291:istore_2        
		} else
	//* 675 1292:goto            1299
		{
			j3 = k;
	//  676 1295:iload           4
	//  677 1297:istore          9
		}
		i = k;
	//  678 1299:iload           4
	//  679 1301:istore_2        
		k = j;
	//  680 1302:iload_3         
	//  681 1303:istore          4
		if(flag1)
	//* 682 1305:iload           7
	//* 683 1307:ifeq            1321
		{
			i = Math.max(i2, j3);
	//  684 1310:iload           8
	//  685 1312:iload           9
	//  686 1314:invokestatic    #511 <Method int Math.max(int, int)>
	//  687 1317:istore_2        
			k = j;
	//  688 1318:iload_3         
	//  689 1319:istore          4
		}
		int k1 = i1;
	//  690 1321:iload           6
	//  691 1323:istore          7
		i1 = 0;
	//  692 1325:iconst_0        
	//  693 1326:istore          6
		addCustomViewsWithGravity(((List) (mTempViews)), 3);
	//  694 1328:aload_0         
	//  695 1329:aload_0         
	//  696 1330:getfield        #118 <Field ArrayList mTempViews>
	//  697 1333:iconst_3        
	//  698 1334:invokespecial   #844 <Method void addCustomViewsWithGravity(List, int)>
		int j2 = mTempViews.size();
	//  699 1337:aload_0         
	//  700 1338:getfield        #118 <Field ArrayList mTempViews>
	//  701 1341:invokevirtual   #625 <Method int ArrayList.size()>
	//  702 1344:istore          8
		for(j = 0; j < j2; j++)
	//* 703 1346:iconst_0        
	//* 704 1347:istore_3        
	//* 705 1348:iload_3         
	//* 706 1349:iload           8
	//* 707 1351:icmpge          1382
			i = layoutChildLeft((View)mTempViews.get(j), i, ai, l);
	//  708 1354:aload_0         
	//  709 1355:aload_0         
	//  710 1356:getfield        #118 <Field ArrayList mTempViews>
	//  711 1359:iload_3         
	//  712 1360:invokevirtual   #626 <Method Object ArrayList.get(int)>
	//  713 1363:checkcast       #364 <Class View>
	//  714 1366:iload_2         
	//  715 1367:aload           18
	//  716 1369:iload           5
	//  717 1371:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//  718 1374:istore_2        

	//  719 1375:iload_3         
	//  720 1376:iconst_1        
	//  721 1377:iadd            
	//  722 1378:istore_3        
	//* 723 1379:goto            1348
		addCustomViewsWithGravity(((List) (mTempViews)), 5);
	//  724 1382:aload_0         
	//  725 1383:aload_0         
	//  726 1384:getfield        #118 <Field ArrayList mTempViews>
	//  727 1387:iconst_5        
	//  728 1388:invokespecial   #844 <Method void addCustomViewsWithGravity(List, int)>
		j2 = mTempViews.size();
	//  729 1391:aload_0         
	//  730 1392:getfield        #118 <Field ArrayList mTempViews>
	//  731 1395:invokevirtual   #625 <Method int ArrayList.size()>
	//  732 1398:istore          8
		for(j = 0; j < j2; j++)
	//* 733 1400:iconst_0        
	//* 734 1401:istore_3        
	//* 735 1402:iload_3         
	//* 736 1403:iload           8
	//* 737 1405:icmpge          1438
			k = layoutChildRight((View)mTempViews.get(j), k, ai, l);
	//  738 1408:aload_0         
	//  739 1409:aload_0         
	//  740 1410:getfield        #118 <Field ArrayList mTempViews>
	//  741 1413:iload_3         
	//  742 1414:invokevirtual   #626 <Method Object ArrayList.get(int)>
	//  743 1417:checkcast       #364 <Class View>
	//  744 1420:iload           4
	//  745 1422:aload           18
	//  746 1424:iload           5
	//  747 1426:invokespecial   #830 <Method int layoutChildRight(View, int, int[], int)>
	//  748 1429:istore          4

	//  749 1431:iload_3         
	//  750 1432:iconst_1        
	//  751 1433:iadd            
	//  752 1434:istore_3        
	//* 753 1435:goto            1402
		addCustomViewsWithGravity(((List) (mTempViews)), 1);
	//  754 1438:aload_0         
	//  755 1439:aload_0         
	//  756 1440:getfield        #118 <Field ArrayList mTempViews>
	//  757 1443:iconst_1        
	//  758 1444:invokespecial   #844 <Method void addCustomViewsWithGravity(List, int)>
		j2 = getViewListMeasuredWidth(((List) (mTempViews)), ai);
	//  759 1447:aload_0         
	//  760 1448:aload_0         
	//  761 1449:getfield        #118 <Field ArrayList mTempViews>
	//  762 1452:aload           18
	//  763 1454:invokespecial   #846 <Method int getViewListMeasuredWidth(List, int[])>
	//  764 1457:istore          8
		j = (k1 + (k3 - k1 - l3) / 2) - j2 / 2;
	//  765 1459:iload           7
	//  766 1461:iload           10
	//  767 1463:iload           7
	//  768 1465:isub            
	//  769 1466:iload           11
	//  770 1468:isub            
	//  771 1469:iconst_2        
	//  772 1470:idiv            
	//  773 1471:iadd            
	//  774 1472:iload           8
	//  775 1474:iconst_2        
	//  776 1475:idiv            
	//  777 1476:isub            
	//  778 1477:istore_3        
		k1 = j2 + j;
	//  779 1478:iload           8
	//  780 1480:iload_3         
	//  781 1481:iadd            
	//  782 1482:istore          7
		if(j >= i)
	//* 783 1484:iload_3         
	//* 784 1485:iload_2         
	//* 785 1486:icmpge          1492
	//* 786 1489:goto            1512
			if(k1 > k)
	//* 787 1492:iload           7
	//* 788 1494:iload           4
	//* 789 1496:icmple          1510
				i = j - (k1 - k);
	//  790 1499:iload_3         
	//  791 1500:iload           7
	//  792 1502:iload           4
	//  793 1504:isub            
	//  794 1505:isub            
	//  795 1506:istore_2        
			else
	//* 796 1507:goto            1512
				i = j;
	//  797 1510:iload_3         
	//  798 1511:istore_2        
		k = mTempViews.size();
	//  799 1512:aload_0         
	//  800 1513:getfield        #118 <Field ArrayList mTempViews>
	//  801 1516:invokevirtual   #625 <Method int ArrayList.size()>
	//  802 1519:istore          4
		for(j = i1; j < k; j++)
	//* 803 1521:iload           6
	//* 804 1523:istore_3        
	//* 805 1524:iload_3         
	//* 806 1525:iload           4
	//* 807 1527:icmpge          1558
			i = layoutChildLeft((View)mTempViews.get(j), i, ai, l);
	//  808 1530:aload_0         
	//  809 1531:aload_0         
	//  810 1532:getfield        #118 <Field ArrayList mTempViews>
	//  811 1535:iload_3         
	//  812 1536:invokevirtual   #626 <Method Object ArrayList.get(int)>
	//  813 1539:checkcast       #364 <Class View>
	//  814 1542:iload_2         
	//  815 1543:aload           18
	//  816 1545:iload           5
	//  817 1547:invokespecial   #832 <Method int layoutChildLeft(View, int, int[], int)>
	//  818 1550:istore_2        

	//  819 1551:iload_3         
	//  820 1552:iconst_1        
	//  821 1553:iadd            
	//  822 1554:istore_3        
	//* 823 1555:goto            1524
		mTempViews.clear();
	//  824 1558:aload_0         
	//  825 1559:getfield        #118 <Field ArrayList mTempViews>
	//  826 1562:invokevirtual   #630 <Method void ArrayList.clear()>
		return;
	//  827 1565:return          
	}

	protected void onMeasure(int i, int j)
	{
		int ai[] = mTempMargins;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field int[] mTempMargins>
	//    2    4:astore          12
		int k1;
		int l1;
		if(ViewUtils.isLayoutRtl(((View) (this))))
	//*   3    6:aload_0         
	//*   4    7:invokestatic    #852 <Method boolean ViewUtils.isLayoutRtl(View)>
	//*   5   10:ifeq            22
		{
			l1 = 1;
	//    6   13:iconst_1        
	//    7   14:istore          8
			k1 = 0;
	//    8   16:iconst_0        
	//    9   17:istore          7
		} else
	//*  10   19:goto            28
		{
			k1 = 1;
	//   11   22:iconst_1        
	//   12   23:istore          7
			l1 = 0;
	//   13   25:iconst_0        
	//   14   26:istore          8
		}
		int k;
		int i1;
		int j1;
		if(shouldLayout(((View) (mNavButtonView))))
	//*  15   28:aload_0         
	//*  16   29:aload_0         
	//*  17   30:getfield        #473 <Field ImageButton mNavButtonView>
	//*  18   33:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  19   36:ifeq            110
		{
			measureChildConstrained(((View) (mNavButtonView)), i, 0, j, 0, mMaxButtonHeight);
	//   20   39:aload_0         
	//   21   40:aload_0         
	//   22   41:getfield        #473 <Field ImageButton mNavButtonView>
	//   23   44:iload_1         
	//   24   45:iconst_0        
	//   25   46:iload_2         
	//   26   47:iconst_0        
	//   27   48:aload_0         
	//   28   49:getfield        #210 <Field int mMaxButtonHeight>
	//   29   52:invokespecial   #854 <Method void measureChildConstrained(View, int, int, int, int, int)>
			k = mNavButtonView.getMeasuredWidth() + getHorizontalMargins(((View) (mNavButtonView)));
	//   30   55:aload_0         
	//   31   56:getfield        #473 <Field ImageButton mNavButtonView>
	//   32   59:invokevirtual   #855 <Method int ImageButton.getMeasuredWidth()>
	//   33   62:aload_0         
	//   34   63:aload_0         
	//   35   64:getfield        #473 <Field ImageButton mNavButtonView>
	//   36   67:invokespecial   #857 <Method int getHorizontalMargins(View)>
	//   37   70:iadd            
	//   38   71:istore_3        
			j1 = Math.max(0, mNavButtonView.getMeasuredHeight() + getVerticalMargins(((View) (mNavButtonView))));
	//   39   72:iconst_0        
	//   40   73:aload_0         
	//   41   74:getfield        #473 <Field ImageButton mNavButtonView>
	//   42   77:invokevirtual   #858 <Method int ImageButton.getMeasuredHeight()>
	//   43   80:aload_0         
	//   44   81:aload_0         
	//   45   82:getfield        #473 <Field ImageButton mNavButtonView>
	//   46   85:invokespecial   #860 <Method int getVerticalMargins(View)>
	//   47   88:iadd            
	//   48   89:invokestatic    #511 <Method int Math.max(int, int)>
	//   49   92:istore          6
			i1 = View.combineMeasuredStates(0, mNavButtonView.getMeasuredState());
	//   50   94:iconst_0        
	//   51   95:aload_0         
	//   52   96:getfield        #473 <Field ImageButton mNavButtonView>
	//   53   99:invokevirtual   #863 <Method int ImageButton.getMeasuredState()>
	//   54  102:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//   55  105:istore          5
		} else
	//*  56  107:goto            119
		{
			k = 0;
	//   57  110:iconst_0        
	//   58  111:istore_3        
			j1 = k;
	//   59  112:iload_3         
	//   60  113:istore          6
			i1 = j1;
	//   61  115:iload           6
	//   62  117:istore          5
		}
		int i2 = k;
	//   63  119:iload_3         
	//   64  120:istore          9
		int l = j1;
	//   65  122:iload           6
	//   66  124:istore          4
		k = i1;
	//   67  126:iload           5
	//   68  128:istore_3        
		if(shouldLayout(((View) (mCollapseButtonView))))
	//*  69  129:aload_0         
	//*  70  130:aload_0         
	//*  71  131:getfield        #656 <Field ImageButton mCollapseButtonView>
	//*  72  134:invokespecial   #375 <Method boolean shouldLayout(View)>
	//*  73  137:ifeq            210
		{
			measureChildConstrained(((View) (mCollapseButtonView)), i, 0, j, 0, mMaxButtonHeight);
	//   74  140:aload_0         
	//   75  141:aload_0         
	//   76  142:getfield        #656 <Field ImageButton mCollapseButtonView>
	//   77  145:iload_1         
	//   78  146:iconst_0        
	//   79  147:iload_2         
	//   80  148:iconst_0        
	//   81  149:aload_0         
	//   82  150:getfield        #210 <Field int mMaxButtonHeight>
	//   83  153:invokespecial   #854 <Method void measureChildConstrained(View, int, int, int, int, int)>
			i2 = mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(((View) (mCollapseButtonView)));
	//   84  156:aload_0         
	//   85  157:getfield        #656 <Field ImageButton mCollapseButtonView>
	//   86  160:invokevirtual   #855 <Method int ImageButton.getMeasuredWidth()>
	//   87  163:aload_0         
	//   88  164:aload_0         
	//   89  165:getfield        #656 <Field ImageButton mCollapseButtonView>
	//   90  168:invokespecial   #857 <Method int getHorizontalMargins(View)>
	//   91  171:iadd            
	//   92  172:istore          9
			l = Math.max(j1, mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(((View) (mCollapseButtonView))));
	//   93  174:iload           6
	//   94  176:aload_0         
	//   95  177:getfield        #656 <Field ImageButton mCollapseButtonView>
	//   96  180:invokevirtual   #858 <Method int ImageButton.getMeasuredHeight()>
	//   97  183:aload_0         
	//   98  184:aload_0         
	//   99  185:getfield        #656 <Field ImageButton mCollapseButtonView>
	//  100  188:invokespecial   #860 <Method int getVerticalMargins(View)>
	//  101  191:iadd            
	//  102  192:invokestatic    #511 <Method int Math.max(int, int)>
	//  103  195:istore          4
			k = View.combineMeasuredStates(i1, mCollapseButtonView.getMeasuredState());
	//  104  197:iload           5
	//  105  199:aload_0         
	//  106  200:getfield        #656 <Field ImageButton mCollapseButtonView>
	//  107  203:invokevirtual   #863 <Method int ImageButton.getMeasuredState()>
	//  108  206:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//  109  209:istore_3        
		}
		i1 = getCurrentContentInsetStart();
	//  110  210:aload_0         
	//  111  211:invokevirtual   #720 <Method int getCurrentContentInsetStart()>
	//  112  214:istore          5
		j1 = 0 + Math.max(i1, i2);
	//  113  216:iconst_0        
	//  114  217:iload           5
	//  115  219:iload           9
	//  116  221:invokestatic    #511 <Method int Math.max(int, int)>
	//  117  224:iadd            
	//  118  225:istore          6
		ai[l1] = Math.max(0, i1 - i2);
	//  119  227:aload           12
	//  120  229:iload           8
	//  121  231:iconst_0        
	//  122  232:iload           5
	//  123  234:iload           9
	//  124  236:isub            
	//  125  237:invokestatic    #511 <Method int Math.max(int, int)>
	//  126  240:iastore         
		if(shouldLayout(((View) (mMenuView))))
	//* 127  241:aload_0         
	//* 128  242:aload_0         
	//* 129  243:getfield        #427 <Field ActionMenuView mMenuView>
	//* 130  246:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 131  249:ifeq            325
		{
			measureChildConstrained(((View) (mMenuView)), i, j1, j, 0, mMaxButtonHeight);
	//  132  252:aload_0         
	//  133  253:aload_0         
	//  134  254:getfield        #427 <Field ActionMenuView mMenuView>
	//  135  257:iload_1         
	//  136  258:iload           6
	//  137  260:iload_2         
	//  138  261:iconst_0        
	//  139  262:aload_0         
	//  140  263:getfield        #210 <Field int mMaxButtonHeight>
	//  141  266:invokespecial   #854 <Method void measureChildConstrained(View, int, int, int, int, int)>
			i1 = mMenuView.getMeasuredWidth() + getHorizontalMargins(((View) (mMenuView)));
	//  142  269:aload_0         
	//  143  270:getfield        #427 <Field ActionMenuView mMenuView>
	//  144  273:invokevirtual   #867 <Method int ActionMenuView.getMeasuredWidth()>
	//  145  276:aload_0         
	//  146  277:aload_0         
	//  147  278:getfield        #427 <Field ActionMenuView mMenuView>
	//  148  281:invokespecial   #857 <Method int getHorizontalMargins(View)>
	//  149  284:iadd            
	//  150  285:istore          5
			l = Math.max(l, mMenuView.getMeasuredHeight() + getVerticalMargins(((View) (mMenuView))));
	//  151  287:iload           4
	//  152  289:aload_0         
	//  153  290:getfield        #427 <Field ActionMenuView mMenuView>
	//  154  293:invokevirtual   #868 <Method int ActionMenuView.getMeasuredHeight()>
	//  155  296:aload_0         
	//  156  297:aload_0         
	//  157  298:getfield        #427 <Field ActionMenuView mMenuView>
	//  158  301:invokespecial   #860 <Method int getVerticalMargins(View)>
	//  159  304:iadd            
	//  160  305:invokestatic    #511 <Method int Math.max(int, int)>
	//  161  308:istore          4
			k = View.combineMeasuredStates(k, mMenuView.getMeasuredState());
	//  162  310:iload_3         
	//  163  311:aload_0         
	//  164  312:getfield        #427 <Field ActionMenuView mMenuView>
	//  165  315:invokevirtual   #869 <Method int ActionMenuView.getMeasuredState()>
	//  166  318:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//  167  321:istore_3        
		} else
	//* 168  322:goto            328
		{
			i1 = 0;
	//  169  325:iconst_0        
	//  170  326:istore          5
		}
		i2 = getCurrentContentInsetEnd();
	//  171  328:aload_0         
	//  172  329:invokevirtual   #717 <Method int getCurrentContentInsetEnd()>
	//  173  332:istore          9
		l1 = j1 + Math.max(i2, i1);
	//  174  334:iload           6
	//  175  336:iload           9
	//  176  338:iload           5
	//  177  340:invokestatic    #511 <Method int Math.max(int, int)>
	//  178  343:iadd            
	//  179  344:istore          8
		ai[k1] = Math.max(0, i2 - i1);
	//  180  346:aload           12
	//  181  348:iload           7
	//  182  350:iconst_0        
	//  183  351:iload           9
	//  184  353:iload           5
	//  185  355:isub            
	//  186  356:invokestatic    #511 <Method int Math.max(int, int)>
	//  187  359:iastore         
		k1 = l1;
	//  188  360:iload           8
	//  189  362:istore          7
		j1 = l;
	//  190  364:iload           4
	//  191  366:istore          6
		i1 = k;
	//  192  368:iload_3         
	//  193  369:istore          5
		if(shouldLayout(mExpandedActionView))
	//* 194  371:aload_0         
	//* 195  372:aload_0         
	//* 196  373:getfield        #404 <Field View mExpandedActionView>
	//* 197  376:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 198  379:ifeq            438
		{
			k1 = l1 + measureChildCollapseMargins(mExpandedActionView, i, l1, j, 0, ai);
	//  199  382:iload           8
	//  200  384:aload_0         
	//  201  385:aload_0         
	//  202  386:getfield        #404 <Field View mExpandedActionView>
	//  203  389:iload_1         
	//  204  390:iload           8
	//  205  392:iload_2         
	//  206  393:iconst_0        
	//  207  394:aload           12
	//  208  396:invokespecial   #871 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  209  399:iadd            
	//  210  400:istore          7
			j1 = Math.max(l, mExpandedActionView.getMeasuredHeight() + getVerticalMargins(mExpandedActionView));
	//  211  402:iload           4
	//  212  404:aload_0         
	//  213  405:getfield        #404 <Field View mExpandedActionView>
	//  214  408:invokevirtual   #488 <Method int View.getMeasuredHeight()>
	//  215  411:aload_0         
	//  216  412:aload_0         
	//  217  413:getfield        #404 <Field View mExpandedActionView>
	//  218  416:invokespecial   #860 <Method int getVerticalMargins(View)>
	//  219  419:iadd            
	//  220  420:invokestatic    #511 <Method int Math.max(int, int)>
	//  221  423:istore          6
			i1 = View.combineMeasuredStates(k, mExpandedActionView.getMeasuredState());
	//  222  425:iload_3         
	//  223  426:aload_0         
	//  224  427:getfield        #404 <Field View mExpandedActionView>
	//  225  430:invokevirtual   #872 <Method int View.getMeasuredState()>
	//  226  433:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//  227  436:istore          5
		}
		l = k1;
	//  228  438:iload           7
	//  229  440:istore          4
		l1 = j1;
	//  230  442:iload           6
	//  231  444:istore          8
		k = i1;
	//  232  446:iload           5
	//  233  448:istore_3        
		if(shouldLayout(((View) (mLogoView))))
	//* 234  449:aload_0         
	//* 235  450:aload_0         
	//* 236  451:getfield        #417 <Field ImageView mLogoView>
	//* 237  454:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 238  457:ifeq            516
		{
			l = k1 + measureChildCollapseMargins(((View) (mLogoView)), i, k1, j, 0, ai);
	//  239  460:iload           7
	//  240  462:aload_0         
	//  241  463:aload_0         
	//  242  464:getfield        #417 <Field ImageView mLogoView>
	//  243  467:iload_1         
	//  244  468:iload           7
	//  245  470:iload_2         
	//  246  471:iconst_0        
	//  247  472:aload           12
	//  248  474:invokespecial   #871 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  249  477:iadd            
	//  250  478:istore          4
			l1 = Math.max(j1, mLogoView.getMeasuredHeight() + getVerticalMargins(((View) (mLogoView))));
	//  251  480:iload           6
	//  252  482:aload_0         
	//  253  483:getfield        #417 <Field ImageView mLogoView>
	//  254  486:invokevirtual   #873 <Method int ImageView.getMeasuredHeight()>
	//  255  489:aload_0         
	//  256  490:aload_0         
	//  257  491:getfield        #417 <Field ImageView mLogoView>
	//  258  494:invokespecial   #860 <Method int getVerticalMargins(View)>
	//  259  497:iadd            
	//  260  498:invokestatic    #511 <Method int Math.max(int, int)>
	//  261  501:istore          8
			k = View.combineMeasuredStates(i1, mLogoView.getMeasuredState());
	//  262  503:iload           5
	//  263  505:aload_0         
	//  264  506:getfield        #417 <Field ImageView mLogoView>
	//  265  509:invokevirtual   #874 <Method int ImageView.getMeasuredState()>
	//  266  512:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//  267  515:istore_3        
		}
		int j2 = getChildCount();
	//  268  516:aload_0         
	//  269  517:invokevirtual   #348 <Method int getChildCount()>
	//  270  520:istore          10
		k1 = l1;
	//  271  522:iload           8
	//  272  524:istore          7
		i1 = 0;
	//  273  526:iconst_0        
	//  274  527:istore          5
		j1 = l;
	//  275  529:iload           4
	//  276  531:istore          6
		for(l = i1; l < j2;)
	//* 277  533:iload           5
	//* 278  535:istore          4
	//* 279  537:iload           4
	//* 280  539:iload           10
	//* 281  541:icmpge          668
		{
			View view = getChildAt(l);
	//  282  544:aload_0         
	//  283  545:iload           4
	//  284  547:invokevirtual   #362 <Method View getChildAt(int)>
	//  285  550:astore          13
			i2 = j1;
	//  286  552:iload           6
	//  287  554:istore          9
			l1 = k;
	//  288  556:iload_3         
	//  289  557:istore          8
			i1 = k1;
	//  290  559:iload           7
	//  291  561:istore          5
			if(((LayoutParams)view.getLayoutParams()).mViewType == 0)
	//* 292  563:aload           13
	//* 293  565:invokevirtual   #368 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 294  568:checkcast       #15  <Class Toolbar$LayoutParams>
	//* 295  571:getfield        #371 <Field int Toolbar$LayoutParams.mViewType>
	//* 296  574:ifne            648
				if(!shouldLayout(view))
	//* 297  577:aload_0         
	//* 298  578:aload           13
	//* 299  580:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 300  583:ifne            600
				{
					i2 = j1;
	//  301  586:iload           6
	//  302  588:istore          9
					l1 = k;
	//  303  590:iload_3         
	//  304  591:istore          8
					i1 = k1;
	//  305  593:iload           7
	//  306  595:istore          5
				} else
	//* 307  597:goto            648
				{
					i2 = j1 + measureChildCollapseMargins(view, i, j1, j, 0, ai);
	//  308  600:iload           6
	//  309  602:aload_0         
	//  310  603:aload           13
	//  311  605:iload_1         
	//  312  606:iload           6
	//  313  608:iload_2         
	//  314  609:iconst_0        
	//  315  610:aload           12
	//  316  612:invokespecial   #871 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  317  615:iadd            
	//  318  616:istore          9
					i1 = Math.max(k1, view.getMeasuredHeight() + getVerticalMargins(view));
	//  319  618:iload           7
	//  320  620:aload           13
	//  321  622:invokevirtual   #488 <Method int View.getMeasuredHeight()>
	//  322  625:aload_0         
	//  323  626:aload           13
	//  324  628:invokespecial   #860 <Method int getVerticalMargins(View)>
	//  325  631:iadd            
	//  326  632:invokestatic    #511 <Method int Math.max(int, int)>
	//  327  635:istore          5
					l1 = View.combineMeasuredStates(k, view.getMeasuredState());
	//  328  637:iload_3         
	//  329  638:aload           13
	//  330  640:invokevirtual   #872 <Method int View.getMeasuredState()>
	//  331  643:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//  332  646:istore          8
				}
			l++;
	//  333  648:iload           4
	//  334  650:iconst_1        
	//  335  651:iadd            
	//  336  652:istore          4
			j1 = i2;
	//  337  654:iload           9
	//  338  656:istore          6
			k = l1;
	//  339  658:iload           8
	//  340  660:istore_3        
			k1 = i1;
	//  341  661:iload           5
	//  342  663:istore          7
		}

	//* 343  665:goto            537
		l1 = mTitleMarginTop + mTitleMarginBottom;
	//  344  668:aload_0         
	//  345  669:getfield        #186 <Field int mTitleMarginTop>
	//  346  672:aload_0         
	//  347  673:getfield        #184 <Field int mTitleMarginBottom>
	//  348  676:iadd            
	//  349  677:istore          8
		i2 = mTitleMarginStart + mTitleMarginEnd;
	//  350  679:aload_0         
	//  351  680:getfield        #190 <Field int mTitleMarginStart>
	//  352  683:aload_0         
	//  353  684:getfield        #188 <Field int mTitleMarginEnd>
	//  354  687:iadd            
	//  355  688:istore          9
		if(shouldLayout(((View) (mTitleTextView))))
	//* 356  690:aload_0         
	//* 357  691:aload_0         
	//* 358  692:getfield        #792 <Field TextView mTitleTextView>
	//* 359  695:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 360  698:ifeq            788
		{
			measureChildCollapseMargins(((View) (mTitleTextView)), i, j1 + i2, j, l1, ai);
	//  361  701:aload_0         
	//  362  702:aload_0         
	//  363  703:getfield        #792 <Field TextView mTitleTextView>
	//  364  706:iload_1         
	//  365  707:iload           6
	//  366  709:iload           9
	//  367  711:iadd            
	//  368  712:iload_2         
	//  369  713:iload           8
	//  370  715:aload           12
	//  371  717:invokespecial   #871 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  372  720:pop             
			l = mTitleTextView.getMeasuredWidth();
	//  373  721:aload_0         
	//  374  722:getfield        #792 <Field TextView mTitleTextView>
	//  375  725:invokevirtual   #841 <Method int TextView.getMeasuredWidth()>
	//  376  728:istore          4
			j2 = getHorizontalMargins(((View) (mTitleTextView)));
	//  377  730:aload_0         
	//  378  731:aload_0         
	//  379  732:getfield        #792 <Field TextView mTitleTextView>
	//  380  735:invokespecial   #857 <Method int getHorizontalMargins(View)>
	//  381  738:istore          10
			i1 = mTitleTextView.getMeasuredHeight();
	//  382  740:aload_0         
	//  383  741:getfield        #792 <Field TextView mTitleTextView>
	//  384  744:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//  385  747:istore          5
			int k2 = getVerticalMargins(((View) (mTitleTextView)));
	//  386  749:aload_0         
	//  387  750:aload_0         
	//  388  751:getfield        #792 <Field TextView mTitleTextView>
	//  389  754:invokespecial   #860 <Method int getVerticalMargins(View)>
	//  390  757:istore          11
			k = View.combineMeasuredStates(k, mTitleTextView.getMeasuredState());
	//  391  759:iload_3         
	//  392  760:aload_0         
	//  393  761:getfield        #792 <Field TextView mTitleTextView>
	//  394  764:invokevirtual   #875 <Method int TextView.getMeasuredState()>
	//  395  767:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//  396  770:istore_3        
			i1 += k2;
	//  397  771:iload           5
	//  398  773:iload           11
	//  399  775:iadd            
	//  400  776:istore          5
			l += j2;
	//  401  778:iload           4
	//  402  780:iload           10
	//  403  782:iadd            
	//  404  783:istore          4
		} else
	//* 405  785:goto            795
		{
			i1 = 0;
	//  406  788:iconst_0        
	//  407  789:istore          5
			l = i1;
	//  408  791:iload           5
	//  409  793:istore          4
		}
		if(shouldLayout(((View) (mSubtitleTextView))))
	//* 410  795:aload_0         
	//* 411  796:aload_0         
	//* 412  797:getfield        #838 <Field TextView mSubtitleTextView>
	//* 413  800:invokespecial   #375 <Method boolean shouldLayout(View)>
	//* 414  803:ifeq            871
		{
			l = Math.max(l, measureChildCollapseMargins(((View) (mSubtitleTextView)), i, j1 + i2, j, i1 + l1, ai));
	//  415  806:iload           4
	//  416  808:aload_0         
	//  417  809:aload_0         
	//  418  810:getfield        #838 <Field TextView mSubtitleTextView>
	//  419  813:iload_1         
	//  420  814:iload           6
	//  421  816:iload           9
	//  422  818:iadd            
	//  423  819:iload_2         
	//  424  820:iload           5
	//  425  822:iload           8
	//  426  824:iadd            
	//  427  825:aload           12
	//  428  827:invokespecial   #871 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  429  830:invokestatic    #511 <Method int Math.max(int, int)>
	//  430  833:istore          4
			i1 += mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(((View) (mSubtitleTextView)));
	//  431  835:iload           5
	//  432  837:aload_0         
	//  433  838:getfield        #838 <Field TextView mSubtitleTextView>
	//  434  841:invokevirtual   #840 <Method int TextView.getMeasuredHeight()>
	//  435  844:aload_0         
	//  436  845:aload_0         
	//  437  846:getfield        #838 <Field TextView mSubtitleTextView>
	//  438  849:invokespecial   #860 <Method int getVerticalMargins(View)>
	//  439  852:iadd            
	//  440  853:iadd            
	//  441  854:istore          5
			k = View.combineMeasuredStates(k, mSubtitleTextView.getMeasuredState());
	//  442  856:iload_3         
	//  443  857:aload_0         
	//  444  858:getfield        #838 <Field TextView mSubtitleTextView>
	//  445  861:invokevirtual   #875 <Method int TextView.getMeasuredState()>
	//  446  864:invokestatic    #866 <Method int View.combineMeasuredStates(int, int)>
	//  447  867:istore_3        
		}
	//* 448  868:goto            871
		i1 = Math.max(k1, i1);
	//  449  871:iload           7
	//  450  873:iload           5
	//  451  875:invokestatic    #511 <Method int Math.max(int, int)>
	//  452  878:istore          5
		i2 = getPaddingLeft();
	//  453  880:aload_0         
	//  454  881:invokevirtual   #575 <Method int getPaddingLeft()>
	//  455  884:istore          9
		j2 = getPaddingRight();
	//  456  886:aload_0         
	//  457  887:invokevirtual   #578 <Method int getPaddingRight()>
	//  458  890:istore          10
		k1 = getPaddingTop();
	//  459  892:aload_0         
	//  460  893:invokevirtual   #494 <Method int getPaddingTop()>
	//  461  896:istore          7
		l1 = getPaddingBottom();
	//  462  898:aload_0         
	//  463  899:invokevirtual   #497 <Method int getPaddingBottom()>
	//  464  902:istore          8
		l = View.resolveSizeAndState(Math.max(j1 + l + (i2 + j2), getSuggestedMinimumWidth()), i, 0xff000000 & k);
	//  465  904:iload           6
	//  466  906:iload           4
	//  467  908:iadd            
	//  468  909:iload           9
	//  469  911:iload           10
	//  470  913:iadd            
	//  471  914:iadd            
	//  472  915:aload_0         
	//  473  916:invokevirtual   #878 <Method int getSuggestedMinimumWidth()>
	//  474  919:invokestatic    #511 <Method int Math.max(int, int)>
	//  475  922:iload_1         
	//  476  923:ldc2            #879 <Int 0xff000000>
	//  477  926:iload_3         
	//  478  927:iand            
	//  479  928:invokestatic    #882 <Method int View.resolveSizeAndState(int, int, int)>
	//  480  931:istore          4
		i = View.resolveSizeAndState(Math.max(i1 + (k1 + l1), getSuggestedMinimumHeight()), j, k << 16);
	//  481  933:iload           5
	//  482  935:iload           7
	//  483  937:iload           8
	//  484  939:iadd            
	//  485  940:iadd            
	//  486  941:aload_0         
	//  487  942:invokevirtual   #885 <Method int getSuggestedMinimumHeight()>
	//  488  945:invokestatic    #511 <Method int Math.max(int, int)>
	//  489  948:iload_2         
	//  490  949:iload_3         
	//  491  950:bipush          16
	//  492  952:ishl            
	//  493  953:invokestatic    #882 <Method int View.resolveSizeAndState(int, int, int)>
	//  494  956:istore_1        
		if(shouldCollapse())
	//* 495  957:aload_0         
	//* 496  958:invokespecial   #887 <Method boolean shouldCollapse()>
	//* 497  961:ifeq            966
			i = 0;
	//  498  964:iconst_0        
	//  499  965:istore_1        
		setMeasuredDimension(l, i);
	//  500  966:aload_0         
	//  501  967:iload           4
	//  502  969:iload_1         
	//  503  970:invokevirtual   #890 <Method void setMeasuredDimension(int, int)>
	//  504  973:return          
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
	//   12   20:invokevirtual   #898 <Method Parcelable Toolbar$SavedState.getSuperState()>
	//   13   23:invokespecial   #894 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
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
	//*  25   47:getfield        #901 <Field int Toolbar$SavedState.expandedMenuItemId>
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
	//   34   66:getfield        #901 <Field int Toolbar$SavedState.expandedMenuItemId>
	//   35   69:invokeinterface #907 <Method MenuItem Menu.findItem(int)>
	//   36   74:astore_1        
			if(parcelable != null)
	//*  37   75:aload_1         
	//*  38   76:ifnull          86
				((MenuItem) (parcelable)).expandActionView();
	//   39   79:aload_1         
	//   40   80:invokeinterface #912 <Method boolean MenuItem.expandActionView()>
	//   41   85:pop             
		}
		if(savedstate.isOverflowOpen)
	//*  42   86:aload_2         
	//*  43   87:getfield        #915 <Field boolean Toolbar$SavedState.isOverflowOpen>
	//*  44   90:ifeq            97
			postShowOverflowMenu();
	//   45   93:aload_0         
	//   46   94:invokespecial   #917 <Method void postShowOverflowMenu()>
	//   47   97:return          
	}

	public void onRtlPropertiesChanged(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #923 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			super.onRtlPropertiesChanged(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokespecial   #925 <Method void ViewGroup.onRtlPropertiesChanged(int)>
		ensureContentInsets();
	//    6   13:aload_0         
	//    7   14:invokespecial   #226 <Method void ensureContentInsets()>
		RtlSpacingHelper rtlspacinghelper = mContentInsets;
	//    8   17:aload_0         
	//    9   18:getfield        #228 <Field RtlSpacingHelper mContentInsets>
	//   10   21:astore_3        
		boolean flag = true;
	//   11   22:iconst_1        
	//   12   23:istore_2        
		if(i != 1)
	//*  13   24:iload_1         
	//*  14   25:iconst_1        
	//*  15   26:icmpne          32
	//*  16   29:goto            34
			flag = false;
	//   17   32:iconst_0        
	//   18   33:istore_2        
		rtlspacinghelper.setDirection(flag);
	//   19   34:aload_3         
	//   20   35:iload_2         
	//   21   36:invokevirtual   #928 <Method void RtlSpacingHelper.setDirection(boolean)>
	//   22   39:return          
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
	//*  11   23:getfield        #646 <Field MenuItemImpl Toolbar$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
	//*  12   26:ifnull          43
			savedstate.expandedMenuItemId = mExpandedMenuPresenter.mCurrentExpandedItem.getItemId();
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   16   34:getfield        #646 <Field MenuItemImpl Toolbar$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
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
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
		{
			ensureLogoView();
	//    2    4:aload_0         
	//    3    5:invokespecial   #962 <Method void ensureLogoView()>
			if(!isChildOrHidden(((View) (mLogoView))))
	//*   4    8:aload_0         
	//*   5    9:aload_0         
	//*   6   10:getfield        #417 <Field ImageView mLogoView>
	//*   7   13:invokespecial   #964 <Method boolean isChildOrHidden(View)>
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
	//*  21   43:invokespecial   #964 <Method boolean isChildOrHidden(View)>
	//*  22   46:ifeq            69
		{
			removeView(((View) (mLogoView)));
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:getfield        #417 <Field ImageView mLogoView>
	//   26   54:invokevirtual   #967 <Method void removeView(View)>
			mHiddenViews.remove(((Object) (mLogoView)));
	//   27   57:aload_0         
	//   28   58:getfield        #120 <Field ArrayList mHiddenViews>
	//   29   61:aload_0         
	//   30   62:getfield        #417 <Field ImageView mLogoView>
	//   31   65:invokevirtual   #970 <Method boolean ArrayList.remove(Object)>
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
	//   39   81:invokevirtual   #971 <Method void ImageView.setImageDrawable(Drawable)>
	//   40   84:return          
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
	//   20   36:getfield        #744 <Field ActionMenuPresenter mOuterActionMenuPresenter>
	//   21   39:invokevirtual   #982 <Method void MenuBuilder.removeMenuPresenter(MenuPresenter)>
			menubuilder1.removeMenuPresenter(((MenuPresenter) (mExpandedMenuPresenter)));
	//   22   42:aload_3         
	//   23   43:aload_0         
	//   24   44:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   25   47:invokevirtual   #982 <Method void MenuBuilder.removeMenuPresenter(MenuPresenter)>
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
	//   37   71:invokevirtual   #985 <Method void ActionMenuPresenter.setExpandedActionViewsExclusive(boolean)>
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
	//   56  108:invokevirtual   #989 <Method void ActionMenuPresenter.initForMenu(Context, MenuBuilder)>
			mExpandedMenuPresenter.initForMenu(mPopupContext, ((MenuBuilder) (null)));
	//   57  111:aload_0         
	//   58  112:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   59  115:aload_0         
	//   60  116:getfield        #286 <Field Context mPopupContext>
	//   61  119:aconst_null     
	//   62  120:invokevirtual   #990 <Method void Toolbar$ExpandedActionViewMenuPresenter.initForMenu(Context, MenuBuilder)>
			actionmenupresenter.updateMenuView(true);
	//   63  123:aload_2         
	//   64  124:iconst_1        
	//   65  125:invokevirtual   #993 <Method void ActionMenuPresenter.updateMenuView(boolean)>
			mExpandedMenuPresenter.updateMenuView(true);
	//   66  128:aload_0         
	//   67  129:getfield        #441 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   68  132:iconst_1        
	//   69  133:invokevirtual   #994 <Method void Toolbar$ExpandedActionViewMenuPresenter.updateMenuView(boolean)>
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
	//   78  152:invokevirtual   #998 <Method void ActionMenuView.setPresenter(ActionMenuPresenter)>
		mOuterActionMenuPresenter = actionmenupresenter;
	//   79  155:aload_0         
	//   80  156:aload_2         
	//   81  157:putfield        #744 <Field ActionMenuPresenter mOuterActionMenuPresenter>
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
	//    5    9:invokevirtual   #975 <Method CharSequence Context.getText(int)>
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
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
		{
			ensureNavButtonView();
	//    2    4:aload_0         
	//    3    5:invokespecial   #1000 <Method void ensureNavButtonView()>
			if(!isChildOrHidden(((View) (mNavButtonView))))
	//*   4    8:aload_0         
	//*   5    9:aload_0         
	//*   6   10:getfield        #473 <Field ImageButton mNavButtonView>
	//*   7   13:invokespecial   #964 <Method boolean isChildOrHidden(View)>
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
	//*  21   43:invokespecial   #964 <Method boolean isChildOrHidden(View)>
	//*  22   46:ifeq            69
		{
			removeView(((View) (mNavButtonView)));
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:getfield        #473 <Field ImageButton mNavButtonView>
	//   26   54:invokevirtual   #967 <Method void removeView(View)>
			mHiddenViews.remove(((Object) (mNavButtonView)));
	//   27   57:aload_0         
	//   28   58:getfield        #120 <Field ArrayList mHiddenViews>
	//   29   61:aload_0         
	//   30   62:getfield        #473 <Field ImageButton mNavButtonView>
	//   31   65:invokevirtual   #970 <Method boolean ArrayList.remove(Object)>
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
	//   15   27:new             #1010 <Class ContextThemeWrapper>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:invokevirtual   #134 <Method Context getContext()>
	//   19   35:iload_1         
	//   20   36:invokespecial   #1013 <Method void ContextThemeWrapper(Context, int)>
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
	//    4    6:invokevirtual   #975 <Method CharSequence Context.getText(int)>
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
	//*  43   93:ifne            146
				addSystemView(((View) (mSubtitleTextView)), true);
	//   44   96:aload_0         
	//   45   97:aload_0         
	//   46   98:getfield        #838 <Field TextView mSubtitleTextView>
	//   47  101:iconst_1        
	//   48  102:invokespecial   #470 <Method void addSystemView(View, boolean)>
		} else
	//*  49  105:goto            146
		if(mSubtitleTextView != null && isChildOrHidden(((View) (mSubtitleTextView))))
	//*  50  108:aload_0         
	//*  51  109:getfield        #838 <Field TextView mSubtitleTextView>
	//*  52  112:ifnull          146
	//*  53  115:aload_0         
	//*  54  116:aload_0         
	//*  55  117:getfield        #838 <Field TextView mSubtitleTextView>
	//*  56  120:invokespecial   #964 <Method boolean isChildOrHidden(View)>
	//*  57  123:ifeq            146
		{
			removeView(((View) (mSubtitleTextView)));
	//   58  126:aload_0         
	//   59  127:aload_0         
	//   60  128:getfield        #838 <Field TextView mSubtitleTextView>
	//   61  131:invokevirtual   #967 <Method void removeView(View)>
			mHiddenViews.remove(((Object) (mSubtitleTextView)));
	//   62  134:aload_0         
	//   63  135:getfield        #120 <Field ArrayList mHiddenViews>
	//   64  138:aload_0         
	//   65  139:getfield        #838 <Field TextView mSubtitleTextView>
	//   66  142:invokevirtual   #970 <Method boolean ArrayList.remove(Object)>
	//   67  145:pop             
		}
		if(mSubtitleTextView != null)
	//*  68  146:aload_0         
	//*  69  147:getfield        #838 <Field TextView mSubtitleTextView>
	//*  70  150:ifnull          161
			mSubtitleTextView.setText(charsequence);
	//   71  153:aload_0         
	//   72  154:getfield        #838 <Field TextView mSubtitleTextView>
	//   73  157:aload_1         
	//   74  158:invokevirtual   #1040 <Method void TextView.setText(CharSequence)>
		mSubtitleText = charsequence;
	//   75  161:aload_0         
	//   76  162:aload_1         
	//   77  163:putfield        #752 <Field CharSequence mSubtitleText>
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
		if(!TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #274 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            108
		{
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
	//*  43   93:ifne            146
				addSystemView(((View) (mTitleTextView)), true);
	//   44   96:aload_0         
	//   45   97:aload_0         
	//   46   98:getfield        #792 <Field TextView mTitleTextView>
	//   47  101:iconst_1        
	//   48  102:invokespecial   #470 <Method void addSystemView(View, boolean)>
		} else
	//*  49  105:goto            146
		if(mTitleTextView != null && isChildOrHidden(((View) (mTitleTextView))))
	//*  50  108:aload_0         
	//*  51  109:getfield        #792 <Field TextView mTitleTextView>
	//*  52  112:ifnull          146
	//*  53  115:aload_0         
	//*  54  116:aload_0         
	//*  55  117:getfield        #792 <Field TextView mTitleTextView>
	//*  56  120:invokespecial   #964 <Method boolean isChildOrHidden(View)>
	//*  57  123:ifeq            146
		{
			removeView(((View) (mTitleTextView)));
	//   58  126:aload_0         
	//   59  127:aload_0         
	//   60  128:getfield        #792 <Field TextView mTitleTextView>
	//   61  131:invokevirtual   #967 <Method void removeView(View)>
			mHiddenViews.remove(((Object) (mTitleTextView)));
	//   62  134:aload_0         
	//   63  135:getfield        #120 <Field ArrayList mHiddenViews>
	//   64  138:aload_0         
	//   65  139:getfield        #792 <Field TextView mTitleTextView>
	//   66  142:invokevirtual   #970 <Method boolean ArrayList.remove(Object)>
	//   67  145:pop             
		}
		if(mTitleTextView != null)
	//*  68  146:aload_0         
	//*  69  147:getfield        #792 <Field TextView mTitleTextView>
	//*  70  150:ifnull          161
			mTitleTextView.setText(charsequence);
	//   71  153:aload_0         
	//   72  154:getfield        #792 <Field TextView mTitleTextView>
	//   73  157:aload_1         
	//   74  158:invokevirtual   #1040 <Method void TextView.setText(CharSequence)>
		mTitleText = charsequence;
	//   75  161:aload_0         
	//   76  162:aload_1         
	//   77  163:putfield        #755 <Field CharSequence mTitleText>
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
