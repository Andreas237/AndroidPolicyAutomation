// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ActionProvider;
import android.support.v7.view.ActionBarPolicy;
import android.support.v7.view.menu.*;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.*;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuView, AppCompatImageView, TooltipCompat, ForwardingListener

class ActionMenuPresenter extends BaseMenuPresenter
	implements android.support.v4.view.ActionProvider.SubUiVisibilityListener
{
	/* member class not found */
	class ActionButtonSubmenu {}

	private class ActionMenuPopupCallback extends android.support.v7.view.menu.ActionMenuItemView.PopupCallback
	{

		public ShowableListMenu getPopup()
		{
			if(mActionButtonPopup != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field ActionMenuPresenter this$0>
		//*   2    4:getfield        #23  <Field ActionMenuPresenter$ActionButtonSubmenu ActionMenuPresenter.mActionButtonPopup>
		//*   3    7:ifnull          21
				return ((ShowableListMenu) (mActionButtonPopup.getPopup()));
		//    4   10:aload_0         
		//    5   11:getfield        #13  <Field ActionMenuPresenter this$0>
		//    6   14:getfield        #23  <Field ActionMenuPresenter$ActionButtonSubmenu ActionMenuPresenter.mActionButtonPopup>
		//    7   17:invokevirtual   #28  <Method android.support.v7.view.menu.MenuPopup ActionMenuPresenter$ActionButtonSubmenu.getPopup()>
		//    8   20:areturn         
			else
				return null;
		//    9   21:aconst_null     
		//   10   22:areturn         
		}

		final ActionMenuPresenter this$0;

		ActionMenuPopupCallback()
		{
			this$0 = ActionMenuPresenter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ActionMenuPresenter this$0>
			((android.support.v7.view.menu.ActionMenuItemView.PopupCallback)this).PopupCallback();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void android.support.v7.view.menu.ActionMenuItemView$PopupCallback()>
		//    5    9:return          
		}
	}

	private class OverflowMenuButton extends AppCompatImageView
		implements ActionMenuView.ActionMenuChildView
	{

		public boolean needsDividerAfter()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean needsDividerBefore()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean performClick()
		{
			if(((AppCompatImageView)this).performClick())
		//*   0    0:aload_0         
		//*   1    1:invokespecial   #68  <Method boolean AppCompatImageView.performClick()>
		//*   2    4:ifeq            9
			{
				return true;
		//    3    7:iconst_1        
		//    4    8:ireturn         
			} else
			{
				playSoundEffect(0);
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:invokevirtual   #71  <Method void playSoundEffect(int)>
				showOverflowMenu();
		//    8   14:aload_0         
		//    9   15:getfield        #19  <Field ActionMenuPresenter this$0>
		//   10   18:invokevirtual   #74  <Method boolean ActionMenuPresenter.showOverflowMenu()>
		//   11   21:pop             
				return true;
		//   12   22:iconst_1        
		//   13   23:ireturn         
			}
		}

		protected boolean setFrame(int i, int j, int k, int l)
		{
			boolean flag = ((AppCompatImageView)this).setFrame(i, j, k, l);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:iload           4
		//    5    6:invokespecial   #78  <Method boolean AppCompatImageView.setFrame(int, int, int, int)>
		//    6    9:istore          8
			Drawable drawable = getDrawable();
		//    7   11:aload_0         
		//    8   12:invokevirtual   #82  <Method Drawable getDrawable()>
		//    9   15:astore          9
			Drawable drawable1 = getBackground();
		//   10   17:aload_0         
		//   11   18:invokevirtual   #85  <Method Drawable getBackground()>
		//   12   21:astore          10
			if(drawable != null && drawable1 != null)
		//*  13   23:aload           9
		//*  14   25:ifnull          116
		//*  15   28:aload           10
		//*  16   30:ifnull          116
			{
				int i1 = getWidth();
		//   17   33:aload_0         
		//   18   34:invokevirtual   #89  <Method int getWidth()>
		//   19   37:istore          5
				j = getHeight();
		//   20   39:aload_0         
		//   21   40:invokevirtual   #92  <Method int getHeight()>
		//   22   43:istore_2        
				i = Math.max(i1, j) / 2;
		//   23   44:iload           5
		//   24   46:iload_2         
		//   25   47:invokestatic    #98  <Method int Math.max(int, int)>
		//   26   50:iconst_2        
		//   27   51:idiv            
		//   28   52:istore_1        
				int j1 = getPaddingLeft();
		//   29   53:aload_0         
		//   30   54:invokevirtual   #101 <Method int getPaddingLeft()>
		//   31   57:istore          6
				int k1 = getPaddingRight();
		//   32   59:aload_0         
		//   33   60:invokevirtual   #104 <Method int getPaddingRight()>
		//   34   63:istore          7
				k = getPaddingTop();
		//   35   65:aload_0         
		//   36   66:invokevirtual   #107 <Method int getPaddingTop()>
		//   37   69:istore_3        
				l = getPaddingBottom();
		//   38   70:aload_0         
		//   39   71:invokevirtual   #110 <Method int getPaddingBottom()>
		//   40   74:istore          4
				i1 = (i1 + (j1 - k1)) / 2;
		//   41   76:iload           5
		//   42   78:iload           6
		//   43   80:iload           7
		//   44   82:isub            
		//   45   83:iadd            
		//   46   84:iconst_2        
		//   47   85:idiv            
		//   48   86:istore          5
				j = (j + (k - l)) / 2;
		//   49   88:iload_2         
		//   50   89:iload_3         
		//   51   90:iload           4
		//   52   92:isub            
		//   53   93:iadd            
		//   54   94:iconst_2        
		//   55   95:idiv            
		//   56   96:istore_2        
				DrawableCompat.setHotspotBounds(drawable1, i1 - i, j - i, i1 + i, j + i);
		//   57   97:aload           10
		//   58   99:iload           5
		//   59  101:iload_1         
		//   60  102:isub            
		//   61  103:iload_2         
		//   62  104:iload_1         
		//   63  105:isub            
		//   64  106:iload           5
		//   65  108:iload_1         
		//   66  109:iadd            
		//   67  110:iload_2         
		//   68  111:iload_1         
		//   69  112:iadd            
		//   70  113:invokestatic    #116 <Method void DrawableCompat.setHotspotBounds(Drawable, int, int, int, int)>
			}
			return flag;
		//   71  116:iload           8
		//   72  118:ireturn         
		}

		private final float mTempPts[] = new float[2];
		final ActionMenuPresenter this$0;

		public OverflowMenuButton(Context context)
		{
			this$0 = ActionMenuPresenter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field ActionMenuPresenter this$0>
			((AppCompatImageView)this).AppCompatImageView(context, ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionOverflowButtonStyle);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:aconst_null     
		//    6    8:getstatic       #25  <Field int android.support.v7.appcompat.R$attr.actionOverflowButtonStyle>
		//    7   11:invokespecial   #28  <Method void AppCompatImageView(Context, android.util.AttributeSet, int)>
		//    8   14:aload_0         
		//    9   15:iconst_2        
		//   10   16:newarray        float[]
		//   11   18:putfield        #30  <Field float[] mTempPts>
			setClickable(true);
		//   12   21:aload_0         
		//   13   22:iconst_1        
		//   14   23:invokevirtual   #34  <Method void setClickable(boolean)>
			setFocusable(true);
		//   15   26:aload_0         
		//   16   27:iconst_1        
		//   17   28:invokevirtual   #37  <Method void setFocusable(boolean)>
			setVisibility(0);
		//   18   31:aload_0         
		//   19   32:iconst_0        
		//   20   33:invokevirtual   #41  <Method void setVisibility(int)>
			setEnabled(true);
		//   21   36:aload_0         
		//   22   37:iconst_1        
		//   23   38:invokevirtual   #44  <Method void setEnabled(boolean)>
			TooltipCompat.setTooltipText(((View) (this)), getContentDescription());
		//   24   41:aload_0         
		//   25   42:aload_0         
		//   26   43:invokevirtual   #48  <Method CharSequence getContentDescription()>
		//   27   46:invokestatic    #54  <Method void TooltipCompat.setTooltipText(View, CharSequence)>
			setOnTouchListener(((android.view.View.OnTouchListener) (new ((_cls1)this)._cls1(ActionMenuPresenter.this))));
		//   28   49:aload_0         
		//   29   50:new             #11  <Class ActionMenuPresenter$OverflowMenuButton$1>
		//   30   53:dup             
		//   31   54:aload_0         
		//   32   55:aload_0         
		//   33   56:aload_1         
		//   34   57:invokespecial   #57  <Method void ActionMenuPresenter$OverflowMenuButton$1(ActionMenuPresenter$OverflowMenuButton, View, ActionMenuPresenter)>
		//   35   60:invokevirtual   #61  <Method void setOnTouchListener(android.view.View$OnTouchListener)>
		//   36   63:return          
		}
	}

	private class PopupPresenterCallback
		implements android.support.v7.view.menu.MenuPresenter.Callback
	{

		public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
		{
			if(menubuilder instanceof SubMenuBuilder)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #23  <Class SubMenuBuilder>
		//*   2    4:ifeq            15
				menubuilder.getRootMenu().close(false);
		//    3    7:aload_1         
		//    4    8:invokevirtual   #29  <Method MenuBuilder MenuBuilder.getRootMenu()>
		//    5   11:iconst_0        
		//    6   12:invokevirtual   #33  <Method void MenuBuilder.close(boolean)>
			android.support.v7.view.menu.MenuPresenter.Callback callback = getCallback();
		//    7   15:aload_0         
		//    8   16:getfield        #15  <Field ActionMenuPresenter this$0>
		//    9   19:invokevirtual   #37  <Method android.support.v7.view.menu.MenuPresenter$Callback ActionMenuPresenter.getCallback()>
		//   10   22:astore_3        
			if(callback != null)
		//*  11   23:aload_3         
		//*  12   24:ifnull          35
				callback.onCloseMenu(menubuilder, flag);
		//   13   27:aload_3         
		//   14   28:aload_1         
		//   15   29:iload_2         
		//   16   30:invokeinterface #39  <Method void android.support.v7.view.menu.MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
		//   17   35:return          
		}

		public boolean onOpenSubMenu(MenuBuilder menubuilder)
		{
			if(menubuilder == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return false;
		//    2    4:iconst_0        
		//    3    5:ireturn         
			mOpenSubMenuId = ((SubMenuBuilder)menubuilder).getItem().getItemId();
		//    4    6:aload_0         
		//    5    7:getfield        #15  <Field ActionMenuPresenter this$0>
		//    6   10:aload_1         
		//    7   11:checkcast       #23  <Class SubMenuBuilder>
		//    8   14:invokevirtual   #45  <Method MenuItem SubMenuBuilder.getItem()>
		//    9   17:invokeinterface #51  <Method int MenuItem.getItemId()>
		//   10   22:putfield        #55  <Field int ActionMenuPresenter.mOpenSubMenuId>
			android.support.v7.view.menu.MenuPresenter.Callback callback = getCallback();
		//   11   25:aload_0         
		//   12   26:getfield        #15  <Field ActionMenuPresenter this$0>
		//   13   29:invokevirtual   #37  <Method android.support.v7.view.menu.MenuPresenter$Callback ActionMenuPresenter.getCallback()>
		//   14   32:astore_3        
			boolean flag;
			if(callback != null)
		//*  15   33:aload_3         
		//*  16   34:ifnull          47
				flag = callback.onOpenSubMenu(menubuilder);
		//   17   37:aload_3         
		//   18   38:aload_1         
		//   19   39:invokeinterface #57  <Method boolean android.support.v7.view.menu.MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
		//   20   44:istore_2        
			else
		//*  21   45:iload_2         
		//*  22   46:ireturn         
				flag = false;
		//   23   47:iconst_0        
		//   24   48:istore_2        
			return flag;
		//*  25   49:goto            45
		}

		final ActionMenuPresenter this$0;

		PopupPresenterCallback()
		{
			this$0 = ActionMenuPresenter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ActionMenuPresenter this$0>
			((Object)this).Object();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	private static class SavedState
		implements Parcelable
	{

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			parcel.writeInt(openSubMenuId);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #34  <Field int openSubMenuId>
		//    3    5:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		//    4    8:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class ActionMenuPresenter$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void ActionMenuPresenter$SavedState(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method ActionMenuPresenter$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
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
			//    2    2:invokevirtual   #30  <Method ActionMenuPresenter$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		public int openSubMenuId;

		static 
		{
		//    0    0:new             #11  <Class ActionMenuPresenter$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void ActionMenuPresenter$SavedState$1()>
		//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
		//    2    4:return          
		}

		SavedState(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			openSubMenuId = parcel.readInt();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #32  <Method int Parcel.readInt()>
		//    5    9:putfield        #34  <Field int openSubMenuId>
		//    6   12:return          
		}
	}


	public ActionMenuPresenter(Context context)
	{
		((BaseMenuPresenter)this).BaseMenuPresenter(context, android.support.v7.appcompat.R.layout.abc_action_menu_layout, android.support.v7.appcompat.R.layout.abc_action_menu_item_layout);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #74  <Field int android.support.v7.appcompat.R$layout.abc_action_menu_layout>
	//    3    5:getstatic       #77  <Field int android.support.v7.appcompat.R$layout.abc_action_menu_item_layout>
	//    4    8:invokespecial   #80  <Method void BaseMenuPresenter(Context, int, int)>
	//    5   11:aload_0         
	//    6   12:new             #82  <Class SparseBooleanArray>
	//    7   15:dup             
	//    8   16:invokespecial   #85  <Method void SparseBooleanArray()>
	//    9   19:putfield        #87  <Field SparseBooleanArray mActionButtonGroups>
	//   10   22:aload_0         
	//   11   23:new             #25  <Class ActionMenuPresenter$PopupPresenterCallback>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokespecial   #90  <Method void ActionMenuPresenter$PopupPresenterCallback(ActionMenuPresenter)>
	//   15   31:putfield        #92  <Field ActionMenuPresenter$PopupPresenterCallback mPopupPresenterCallback>
	//   16   34:return          
	}

	private View findViewForItem(MenuItem menuitem)
	{
		ViewGroup viewgroup = (ViewGroup)mMenuView;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field MenuView mMenuView>
	//    2    4:checkcast       #113 <Class ViewGroup>
	//    3    7:astore          6
		if(viewgroup != null) goto _L2; else goto _L1
	//    4    9:aload           6
	//    5   11:ifnonnull       20
_L1:
		View view = null;
	//    6   14:aconst_null     
	//    7   15:astore          4
_L6:
		return view;
	//    8   17:aload           4
	//    9   19:areturn         
_L2:
		int i;
		int j;
		j = viewgroup.getChildCount();
	//   10   20:aload           6
	//   11   22:invokevirtual   #117 <Method int ViewGroup.getChildCount()>
	//   12   25:istore_3        
		i = 0;
	//   13   26:iconst_0        
	//   14   27:istore_2        
_L7:
		if(i >= j) goto _L4; else goto _L3
	//   15   28:iload_2         
	//   16   29:iload_3         
	//   17   30:icmpge          74
_L3:
		View view1;
		view1 = viewgroup.getChildAt(i);
	//   18   33:aload           6
	//   19   35:iload_2         
	//   20   36:invokevirtual   #121 <Method View ViewGroup.getChildAt(int)>
	//   21   39:astore          5
		if(!(view1 instanceof android.support.v7.view.menu.MenuView.ItemView))
			continue; /* Loop/switch isn't completed */
	//   22   41:aload           5
	//   23   43:instanceof      #123 <Class android.support.v7.view.menu.MenuView$ItemView>
	//   24   46:ifeq            67
		view = view1;
	//   25   49:aload           5
	//   26   51:astore          4
		if(((android.support.v7.view.menu.MenuView.ItemView)view1).getItemData() == menuitem) goto _L6; else goto _L5
	//   27   53:aload           5
	//   28   55:checkcast       #123 <Class android.support.v7.view.menu.MenuView$ItemView>
	//   29   58:invokeinterface #127 <Method MenuItemImpl android.support.v7.view.menu.MenuView$ItemView.getItemData()>
	//   30   63:aload_1         
	//   31   64:if_acmpeq       17
_L5:
		i++;
	//   32   67:iload_2         
	//   33   68:iconst_1        
	//   34   69:iadd            
	//   35   70:istore_2        
		  goto _L7
	//*  36   71:goto            28
_L4:
		return null;
	//   37   74:aconst_null     
	//   38   75:areturn         
	}

	public void bindItemView(MenuItemImpl menuitemimpl, android.support.v7.view.menu.MenuView.ItemView itemview)
	{
		itemview.initialize(menuitemimpl, 0);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokeinterface #133 <Method void android.support.v7.view.menu.MenuView$ItemView.initialize(MenuItemImpl, int)>
		menuitemimpl = ((MenuItemImpl) ((ActionMenuView)mMenuView));
	//    4    8:aload_0         
	//    5    9:getfield        #106 <Field MenuView mMenuView>
	//    6   12:checkcast       #135 <Class ActionMenuView>
	//    7   15:astore_1        
		itemview = ((android.support.v7.view.menu.MenuView.ItemView) ((ActionMenuItemView)itemview));
	//    8   16:aload_2         
	//    9   17:checkcast       #137 <Class ActionMenuItemView>
	//   10   20:astore_2        
		((ActionMenuItemView) (itemview)).setItemInvoker(((android.support.v7.view.menu.MenuBuilder.ItemInvoker) (menuitemimpl)));
	//   11   21:aload_2         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #141 <Method void ActionMenuItemView.setItemInvoker(android.support.v7.view.menu.MenuBuilder$ItemInvoker)>
		if(mPopupCallback == null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #143 <Field ActionMenuPresenter$ActionMenuPopupCallback mPopupCallback>
	//*  16   30:ifnonnull       45
			mPopupCallback = new ((ActionMenuPopupCallback)this).ActionMenuPopupCallback();
	//   17   33:aload_0         
	//   18   34:new             #11  <Class ActionMenuPresenter$ActionMenuPopupCallback>
	//   19   37:dup             
	//   20   38:aload_0         
	//   21   39:invokespecial   #144 <Method void ActionMenuPresenter$ActionMenuPopupCallback(ActionMenuPresenter)>
	//   22   42:putfield        #143 <Field ActionMenuPresenter$ActionMenuPopupCallback mPopupCallback>
		((ActionMenuItemView) (itemview)).setPopupCallback(((android.support.v7.view.menu.ActionMenuItemView.PopupCallback) (mPopupCallback)));
	//   23   45:aload_2         
	//   24   46:aload_0         
	//   25   47:getfield        #143 <Field ActionMenuPresenter$ActionMenuPopupCallback mPopupCallback>
	//   26   50:invokevirtual   #148 <Method void ActionMenuItemView.setPopupCallback(android.support.v7.view.menu.ActionMenuItemView$PopupCallback)>
	//   27   53:return          
	}

	public boolean dismissPopupMenus()
	{
		return hideOverflowMenu() | hideSubMenus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #153 <Method boolean hideOverflowMenu()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #156 <Method boolean hideSubMenus()>
	//    4    8:ior             
	//    5    9:ireturn         
	}

	public boolean filterLeftoverView(ViewGroup viewgroup, int i)
	{
		if(viewgroup.getChildAt(i) == mOverflowButton)
	//*   0    0:aload_1         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #121 <Method View ViewGroup.getChildAt(int)>
	//*   3    5:aload_0         
	//*   4    6:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*   5    9:if_acmpne       14
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		else
			return ((BaseMenuPresenter)this).filterLeftoverView(viewgroup, i);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokespecial   #162 <Method boolean BaseMenuPresenter.filterLeftoverView(ViewGroup, int)>
	//   12   20:ireturn         
	}

	public boolean flagActionItems()
	{
		int k;
		int l;
		int j2;
		int i3;
		int i4;
		ArrayList arraylist;
		ViewGroup viewgroup;
label0:
		{
			int i;
			int i1;
			boolean flag;
			if(mMenu != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field MenuBuilder mMenu>
	//*   2    4:ifnull          113
			{
				arraylist = mMenu.getVisibleItems();
	//    3    7:aload_0         
	//    4    8:getfield        #99  <Field MenuBuilder mMenu>
	//    5   11:invokevirtual   #169 <Method ArrayList MenuBuilder.getVisibleItems()>
	//    6   14:astore          14
				j2 = arraylist.size();
	//    7   16:aload           14
	//    8   18:invokevirtual   #174 <Method int ArrayList.size()>
	//    9   21:istore          6
			} else
	//*  10   23:aload_0         
	//*  11   24:getfield        #176 <Field int mMaxItems>
	//*  12   27:istore_1        
	//*  13   28:aload_0         
	//*  14   29:getfield        #178 <Field int mActionItemWidthLimit>
	//*  15   32:istore          9
	//*  16   34:iconst_0        
	//*  17   35:iconst_0        
	//*  18   36:invokestatic    #184 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  19   39:istore          10
	//*  20   41:aload_0         
	//*  21   42:getfield        #106 <Field MenuView mMenuView>
	//*  22   45:checkcast       #113 <Class ViewGroup>
	//*  23   48:astore          15
	//*  24   50:iconst_0        
	//*  25   51:istore_3        
	//*  26   52:iconst_0        
	//*  27   53:istore          4
	//*  28   55:iconst_0        
	//*  29   56:istore          5
	//*  30   58:iconst_0        
	//*  31   59:istore_2        
	//*  32   60:iload_2         
	//*  33   61:iload           6
	//*  34   63:icmpge          145
	//*  35   66:aload           14
	//*  36   68:iload_2         
	//*  37   69:invokevirtual   #188 <Method Object ArrayList.get(int)>
	//*  38   72:checkcast       #190 <Class MenuItemImpl>
	//*  39   75:astore          16
	//*  40   77:aload           16
	//*  41   79:invokevirtual   #193 <Method boolean MenuItemImpl.requiresActionButton()>
	//*  42   82:ifeq            122
	//*  43   85:iload_3         
	//*  44   86:iconst_1        
	//*  45   87:iadd            
	//*  46   88:istore_3        
	//*  47   89:aload_0         
	//*  48   90:getfield        #195 <Field boolean mExpandedActionViewsExclusive>
	//*  49   93:ifeq            836
	//*  50   96:aload           16
	//*  51   98:invokevirtual   #198 <Method boolean MenuItemImpl.isActionViewExpanded()>
	//*  52  101:ifeq            836
	//*  53  104:iconst_0        
	//*  54  105:istore_1        
	//*  55  106:iload_2         
	//*  56  107:iconst_1        
	//*  57  108:iadd            
	//*  58  109:istore_2        
	//*  59  110:goto            60
			{
				j2 = 0;
	//   60  113:iconst_0        
	//   61  114:istore          6
				arraylist = null;
	//   62  116:aconst_null     
	//   63  117:astore          14
			}
			i = mMaxItems;
			i3 = mActionItemWidthLimit;
			i4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
			viewgroup = (ViewGroup)mMenuView;
			l = 0;
			i1 = 0;
			flag = false;
			k = 0;
			while(k < j2) 
			{
				MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(k);
				if(menuitemimpl.requiresActionButton())
					l++;
				else
	//*  64  119:goto            23
				if(menuitemimpl.requestsActionButton())
	//*  65  122:aload           16
	//*  66  124:invokevirtual   #201 <Method boolean MenuItemImpl.requestsActionButton()>
	//*  67  127:ifeq            139
					i1++;
	//   68  130:iload           4
	//   69  132:iconst_1        
	//   70  133:iadd            
	//   71  134:istore          4
				else
	//*  72  136:goto            89
					flag = true;
	//   73  139:iconst_1        
	//   74  140:istore          5
				if(mExpandedActionViewsExclusive && menuitemimpl.isActionViewExpanded())
					i = 0;
				k++;
			}
	//*  75  142:goto            89
			k = i;
	//   76  145:iload_1         
	//   77  146:istore_2        
			if(!mReserveOverflow)
				break label0;
	//   78  147:aload_0         
	//   79  148:getfield        #203 <Field boolean mReserveOverflow>
	//   80  151:ifeq            173
			if(!flag)
	//*  81  154:iload           5
	//*  82  156:ifne            169
			{
				k = i;
	//   83  159:iload_1         
	//   84  160:istore_2        
				if(l + i1 <= i)
					break label0;
	//   85  161:iload_3         
	//   86  162:iload           4
	//   87  164:iadd            
	//   88  165:iload_1         
	//   89  166:icmple          173
			}
			k = i - 1;
	//   90  169:iload_1         
	//   91  170:iconst_1        
	//   92  171:isub            
	//   93  172:istore_2        
		}
		k -= l;
	//   94  173:iload_2         
	//   95  174:iload_3         
	//   96  175:isub            
	//   97  176:istore_2        
		SparseBooleanArray sparsebooleanarray = mActionButtonGroups;
	//   98  177:aload_0         
	//   99  178:getfield        #87  <Field SparseBooleanArray mActionButtonGroups>
	//  100  181:astore          16
		sparsebooleanarray.clear();
	//  101  183:aload           16
	//  102  185:invokevirtual   #206 <Method void SparseBooleanArray.clear()>
		int j = 0;
	//  103  188:iconst_0        
	//  104  189:istore_1        
		int k1;
		boolean flag1;
		int k2;
		int l2;
		if(mStrictWidthLimit)
	//* 105  190:aload_0         
	//* 106  191:getfield        #208 <Field boolean mStrictWidthLimit>
	//* 107  194:ifeq            830
		{
			j = i3 / mMinCellSize;
	//  108  197:iload           9
	//  109  199:aload_0         
	//  110  200:getfield        #210 <Field int mMinCellSize>
	//  111  203:idiv            
	//  112  204:istore_1        
			l = mMinCellSize;
	//  113  205:aload_0         
	//  114  206:getfield        #210 <Field int mMinCellSize>
	//  115  209:istore_3        
			int j1 = mMinCellSize;
	//  116  210:aload_0         
	//  117  211:getfield        #210 <Field int mMinCellSize>
	//  118  214:istore          4
			k2 = (i3 % l) / j + j1;
	//  119  216:iload           9
	//  120  218:iload_3         
	//  121  219:irem            
	//  122  220:iload_1         
	//  123  221:idiv            
	//  124  222:iload           4
	//  125  224:iadd            
	//  126  225:istore          7
		} else
	//* 127  227:iconst_0        
	//* 128  228:istore          8
	//* 129  230:iconst_0        
	//* 130  231:istore          5
	//* 131  233:iload_1         
	//* 132  234:istore_3        
	//* 133  235:iload_2         
	//* 134  236:istore_1        
	//* 135  237:iload           9
	//* 136  239:istore          4
	//* 137  241:iload           5
	//* 138  243:istore_2        
	//* 139  244:iload           8
	//* 140  246:iload           6
	//* 141  248:icmpge          805
	//* 142  251:aload           14
	//* 143  253:iload           8
	//* 144  255:invokevirtual   #188 <Method Object ArrayList.get(int)>
	//* 145  258:checkcast       #190 <Class MenuItemImpl>
	//* 146  261:astore          17
	//* 147  263:aload           17
	//* 148  265:invokevirtual   #193 <Method boolean MenuItemImpl.requiresActionButton()>
	//* 149  268:ifeq            409
	//* 150  271:aload_0         
	//* 151  272:aload           17
	//* 152  274:aload_0         
	//* 153  275:getfield        #212 <Field View mScrapActionButtonView>
	//* 154  278:aload           15
	//* 155  280:invokevirtual   #216 <Method View getItemView(MenuItemImpl, View, ViewGroup)>
	//* 156  283:astore          18
	//* 157  285:aload_0         
	//* 158  286:getfield        #212 <Field View mScrapActionButtonView>
	//* 159  289:ifnonnull       298
	//* 160  292:aload_0         
	//* 161  293:aload           18
	//* 162  295:putfield        #212 <Field View mScrapActionButtonView>
	//* 163  298:aload_0         
	//* 164  299:getfield        #208 <Field boolean mStrictWidthLimit>
	//* 165  302:ifeq            394
	//* 166  305:iload_3         
	//* 167  306:aload           18
	//* 168  308:iload           7
	//* 169  310:iload_3         
	//* 170  311:iload           10
	//* 171  313:iconst_0        
	//* 172  314:invokestatic    #220 <Method int ActionMenuView.measureChildForCells(View, int, int, int, int)>
	//* 173  317:isub            
	//* 174  318:istore          5
	//* 175  320:aload           18
	//* 176  322:invokevirtual   #225 <Method int View.getMeasuredWidth()>
	//* 177  325:istore_3        
	//* 178  326:iload_2         
	//* 179  327:ifne            827
	//* 180  330:iload_3         
	//* 181  331:istore_2        
	//* 182  332:aload           17
	//* 183  334:invokevirtual   #228 <Method int MenuItemImpl.getGroupId()>
	//* 184  337:istore          9
	//* 185  339:iload           9
	//* 186  341:ifeq            352
	//* 187  344:aload           16
	//* 188  346:iload           9
	//* 189  348:iconst_1        
	//* 190  349:invokevirtual   #232 <Method void SparseBooleanArray.put(int, boolean)>
	//* 191  352:aload           17
	//* 192  354:iconst_1        
	//* 193  355:invokevirtual   #236 <Method void MenuItemImpl.setIsActionButton(boolean)>
	//* 194  358:iload           4
	//* 195  360:iload_3         
	//* 196  361:isub            
	//* 197  362:istore          4
	//* 198  364:iload_1         
	//* 199  365:istore_3        
	//* 200  366:iload           4
	//* 201  368:istore_1        
	//* 202  369:iload           8
	//* 203  371:iconst_1        
	//* 204  372:iadd            
	//* 205  373:istore          9
	//* 206  375:iload_3         
	//* 207  376:istore          8
	//* 208  378:iload           5
	//* 209  380:istore_3        
	//* 210  381:iload_1         
	//* 211  382:istore          4
	//* 212  384:iload           8
	//* 213  386:istore_1        
	//* 214  387:iload           9
	//* 215  389:istore          8
	//* 216  391:goto            244
	//* 217  394:aload           18
	//* 218  396:iload           10
	//* 219  398:iload           10
	//* 220  400:invokevirtual   #240 <Method void View.measure(int, int)>
	//* 221  403:iload_3         
	//* 222  404:istore          5
	//* 223  406:goto            320
	//* 224  409:aload           17
	//* 225  411:invokevirtual   #201 <Method boolean MenuItemImpl.requestsActionButton()>
	//* 226  414:ifeq            780
	//* 227  417:aload           17
	//* 228  419:invokevirtual   #228 <Method int MenuItemImpl.getGroupId()>
	//* 229  422:istore          11
	//* 230  424:aload           16
	//* 231  426:iload           11
	//* 232  428:invokevirtual   #243 <Method boolean SparseBooleanArray.get(int)>
	//* 233  431:istore          13
	//* 234  433:iload_1         
	//* 235  434:ifgt            442
	//* 236  437:iload           13
	//* 237  439:ifeq            642
	//* 238  442:iload           4
	//* 239  444:ifle            642
	//* 240  447:aload_0         
	//* 241  448:getfield        #208 <Field boolean mStrictWidthLimit>
	//* 242  451:ifeq            458
	//* 243  454:iload_3         
	//* 244  455:ifle            642
	//* 245  458:iconst_1        
	//* 246  459:istore          12
	//* 247  461:iload           12
	//* 248  463:ifeq            816
	//* 249  466:aload_0         
	//* 250  467:aload           17
	//* 251  469:aload_0         
	//* 252  470:getfield        #212 <Field View mScrapActionButtonView>
	//* 253  473:aload           15
	//* 254  475:invokevirtual   #216 <Method View getItemView(MenuItemImpl, View, ViewGroup)>
	//* 255  478:astore          18
	//* 256  480:aload_0         
	//* 257  481:getfield        #212 <Field View mScrapActionButtonView>
	//* 258  484:ifnonnull       493
	//* 259  487:aload_0         
	//* 260  488:aload           18
	//* 261  490:putfield        #212 <Field View mScrapActionButtonView>
	//* 262  493:aload_0         
	//* 263  494:getfield        #208 <Field boolean mStrictWidthLimit>
	//* 264  497:ifeq            648
	//* 265  500:aload           18
	//* 266  502:iload           7
	//* 267  504:iload_3         
	//* 268  505:iload           10
	//* 269  507:iconst_0        
	//* 270  508:invokestatic    #220 <Method int ActionMenuView.measureChildForCells(View, int, int, int, int)>
	//* 271  511:istore          5
	//* 272  513:iload           5
	//* 273  515:ifne            813
	//* 274  518:iconst_0        
	//* 275  519:istore          12
	//* 276  521:iload_3         
	//* 277  522:iload           5
	//* 278  524:isub            
	//* 279  525:istore_3        
	//* 280  526:aload           18
	//* 281  528:invokevirtual   #225 <Method int View.getMeasuredWidth()>
	//* 282  531:istore          5
	//* 283  533:iload           4
	//* 284  535:iload           5
	//* 285  537:isub            
	//* 286  538:istore          9
	//* 287  540:iload_2         
	//* 288  541:istore          4
	//* 289  543:iload_2         
	//* 290  544:ifne            551
	//* 291  547:iload           5
	//* 292  549:istore          4
	//* 293  551:aload_0         
	//* 294  552:getfield        #208 <Field boolean mStrictWidthLimit>
	//* 295  555:ifeq            665
	//* 296  558:iload           9
	//* 297  560:iflt            660
	//* 298  563:iconst_1        
	//* 299  564:istore_2        
	//* 300  565:iload           12
	//* 301  567:iload_2         
	//* 302  568:iand            
	//* 303  569:istore          12
	//* 304  571:iload           4
	//* 305  573:istore_2        
	//* 306  574:iload_3         
	//* 307  575:istore          5
	//* 308  577:iload           9
	//* 309  579:istore          4
	//* 310  581:iload_2         
	//* 311  582:istore_3        
	//* 312  583:iload           5
	//* 313  585:istore_2        
	//* 314  586:iload           12
	//* 315  588:ifeq            698
	//* 316  591:iload           11
	//* 317  593:ifeq            698
	//* 318  596:aload           16
	//* 319  598:iload           11
	//* 320  600:iconst_1        
	//* 321  601:invokevirtual   #232 <Method void SparseBooleanArray.put(int, boolean)>
	//* 322  604:iload_1         
	//* 323  605:istore          5
	//* 324  607:iload           12
	//* 325  609:ifeq            617
	//* 326  612:iload_1         
	//* 327  613:iconst_1        
	//* 328  614:isub            
	//* 329  615:istore          5
	//* 330  617:aload           17
	//* 331  619:iload           12
	//* 332  621:invokevirtual   #236 <Method void MenuItemImpl.setIsActionButton(boolean)>
	//* 333  624:iload           4
	//* 334  626:istore_1        
	//* 335  627:iload           5
	//* 336  629:istore          4
	//* 337  631:iload_2         
	//* 338  632:istore          5
	//* 339  634:iload_3         
	//* 340  635:istore_2        
	//* 341  636:iload           4
	//* 342  638:istore_3        
	//* 343  639:goto            369
	//* 344  642:iconst_0        
	//* 345  643:istore          12
	//* 346  645:goto            461
	//* 347  648:aload           18
	//* 348  650:iload           10
	//* 349  652:iload           10
	//* 350  654:invokevirtual   #240 <Method void View.measure(int, int)>
	//* 351  657:goto            526
	//* 352  660:iconst_0        
	//* 353  661:istore_2        
	//* 354  662:goto            565
	//* 355  665:iload           9
	//* 356  667:iload           4
	//* 357  669:iadd            
	//* 358  670:ifle            693
	//* 359  673:iconst_1        
	//* 360  674:istore_2        
	//* 361  675:iload           12
	//* 362  677:iload_2         
	//* 363  678:iand            
	//* 364  679:istore          12
	//* 365  681:iload_3         
	//* 366  682:istore_2        
	//* 367  683:iload           4
	//* 368  685:istore_3        
	//* 369  686:iload           9
	//* 370  688:istore          4
	//* 371  690:goto            586
	//* 372  693:iconst_0        
	//* 373  694:istore_2        
	//* 374  695:goto            675
	//* 375  698:iload           13
	//* 376  700:ifeq            810
	//* 377  703:aload           16
	//* 378  705:iload           11
	//* 379  707:iconst_0        
	//* 380  708:invokevirtual   #232 <Method void SparseBooleanArray.put(int, boolean)>
	//* 381  711:iconst_0        
	//* 382  712:istore          9
	//* 383  714:iload           9
	//* 384  716:iload           8
	//* 385  718:icmpge          807
	//* 386  721:aload           14
	//* 387  723:iload           9
	//* 388  725:invokevirtual   #188 <Method Object ArrayList.get(int)>
	//* 389  728:checkcast       #190 <Class MenuItemImpl>
	//* 390  731:astore          18
	//* 391  733:iload_1         
	//* 392  734:istore          5
	//* 393  736:aload           18
	//* 394  738:invokevirtual   #228 <Method int MenuItemImpl.getGroupId()>
	//* 395  741:iload           11
	//* 396  743:icmpne          768
	//* 397  746:iload_1         
	//* 398  747:istore          5
	//* 399  749:aload           18
	//* 400  751:invokevirtual   #246 <Method boolean MenuItemImpl.isActionButton()>
	//* 401  754:ifeq            762
	//* 402  757:iload_1         
	//* 403  758:iconst_1        
	//* 404  759:iadd            
	//* 405  760:istore          5
	//* 406  762:aload           18
	//* 407  764:iconst_0        
	//* 408  765:invokevirtual   #236 <Method void MenuItemImpl.setIsActionButton(boolean)>
	//* 409  768:iload           9
	//* 410  770:iconst_1        
	//* 411  771:iadd            
	//* 412  772:istore          9
	//* 413  774:iload           5
	//* 414  776:istore_1        
	//* 415  777:goto            714
	//* 416  780:aload           17
	//* 417  782:iconst_0        
	//* 418  783:invokevirtual   #236 <Method void MenuItemImpl.setIsActionButton(boolean)>
	//* 419  786:iload           4
	//* 420  788:istore          5
	//* 421  790:iload_1         
	//* 422  791:istore          4
	//* 423  793:iload           5
	//* 424  795:istore_1        
	//* 425  796:iload_3         
	//* 426  797:istore          5
	//* 427  799:iload           4
	//* 428  801:istore_3        
	//* 429  802:goto            369
	//* 430  805:iconst_1        
	//* 431  806:ireturn         
	//* 432  807:goto            604
	//* 433  810:goto            604
	//* 434  813:goto            521
	//* 435  816:iload_2         
	//* 436  817:istore          5
	//* 437  819:iload_3         
	//* 438  820:istore_2        
	//* 439  821:iload           5
	//* 440  823:istore_3        
	//* 441  824:goto            586
	//* 442  827:goto            332
		{
			k2 = 0;
	//  443  830:iconst_0        
	//  444  831:istore          7
		}
		l2 = 0;
		flag1 = false;
		l = j;
		j = k;
		k1 = i3;
		k = ((int) (flag1));
		while(l2 < j2) 
		{
			MenuItemImpl menuitemimpl1 = (MenuItemImpl)arraylist.get(l2);
			int l1;
			if(menuitemimpl1.requiresActionButton())
			{
				View view = getItemView(menuitemimpl1, mScrapActionButtonView, viewgroup);
				if(mScrapActionButtonView == null)
					mScrapActionButtonView = view;
				int j3;
				if(mStrictWidthLimit)
				{
					l1 = l - ActionMenuView.measureChildForCells(view, k2, l, i4, 0);
				} else
				{
					view.measure(i4, i4);
					l1 = l;
				}
				l = view.getMeasuredWidth();
				if(k == 0)
					k = l;
				j3 = menuitemimpl1.getGroupId();
				if(j3 != 0)
					sparsebooleanarray.put(j3, true);
				menuitemimpl1.setIsActionButton(true);
				k1 -= l;
				l = j;
				j = k1;
			} else
			if(menuitemimpl1.requestsActionButton())
			{
				int j4 = menuitemimpl1.getGroupId();
				boolean flag3 = sparsebooleanarray.get(j4);
				boolean flag2;
				if((j > 0 || flag3) && k1 > 0 && (!mStrictWidthLimit || l > 0))
					flag2 = true;
				else
					flag2 = false;
				if(flag2)
				{
					View view1 = getItemView(menuitemimpl1, mScrapActionButtonView, viewgroup);
					if(mScrapActionButtonView == null)
						mScrapActionButtonView = view1;
					int k3;
					if(mStrictWidthLimit)
					{
						l1 = ActionMenuView.measureChildForCells(view1, k2, l, i4, 0);
						if(l1 == 0)
							flag2 = false;
						l -= l1;
					} else
					{
						view1.measure(i4, i4);
					}
					l1 = view1.getMeasuredWidth();
					k3 = k1 - l1;
					k1 = k;
					if(k == 0)
						k1 = l1;
					if(mStrictWidthLimit)
					{
						if(k3 >= 0)
							k = 1;
						else
							k = 0;
						flag2 &= ((boolean) (k));
						k = k1;
						l1 = l;
						k1 = k3;
						l = k;
						k = l1;
					} else
					{
						if(k3 + k1 > 0)
							k = 1;
						else
							k = 0;
						flag2 &= ((boolean) (k));
						k = l;
						l = k1;
						k1 = k3;
					}
				} else
				{
					int i2 = k;
					k = l;
					l = i2;
				}
				if(flag2 && j4 != 0)
					sparsebooleanarray.put(j4, true);
				else
				if(flag3)
				{
					sparsebooleanarray.put(j4, false);
					int l3 = 0;
					while(l3 < l2) 
					{
						MenuItemImpl menuitemimpl2 = (MenuItemImpl)arraylist.get(l3);
						l1 = j;
						if(menuitemimpl2.getGroupId() == j4)
						{
							l1 = j;
							if(menuitemimpl2.isActionButton())
								l1 = j + 1;
							menuitemimpl2.setIsActionButton(false);
						}
						l3++;
						j = l1;
					}
				}
				l1 = j;
				if(flag2)
					l1 = j - 1;
				menuitemimpl1.setIsActionButton(flag2);
				j = k1;
				k1 = l1;
				l1 = k;
				k = l;
				l = k1;
			} else
			{
				menuitemimpl1.setIsActionButton(false);
				l1 = k1;
				k1 = j;
				j = l1;
				l1 = l;
				l = k1;
			}
			j3 = l2 + 1;
			l2 = l;
			l = l1;
			k1 = j;
			j = l2;
			l2 = j3;
		}
		return true;
	//* 445  833:goto            227
	//* 446  836:goto            106
	}

	public View getItemView(MenuItemImpl menuitemimpl, View view, ViewGroup viewgroup)
	{
		View view1 = menuitemimpl.getActionView();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #250 <Method View MenuItemImpl.getActionView()>
	//    2    4:astore          5
		if(view1 == null || menuitemimpl.hasCollapsibleActionView())
	//*   3    6:aload           5
	//*   4    8:ifnull          18
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #253 <Method boolean MenuItemImpl.hasCollapsibleActionView()>
	//*   7   15:ifeq            27
			view1 = ((BaseMenuPresenter)this).getItemView(menuitemimpl, view, viewgroup);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokespecial   #254 <Method View BaseMenuPresenter.getItemView(MenuItemImpl, View, ViewGroup)>
	//   13   25:astore          5
		byte byte0;
		if(menuitemimpl.isActionViewExpanded())
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #198 <Method boolean MenuItemImpl.isActionViewExpanded()>
	//*  16   31:ifeq            77
			byte0 = 8;
	//   17   34:bipush          8
	//   18   36:istore          4
		else
	//*  19   38:aload           5
	//*  20   40:iload           4
	//*  21   42:invokevirtual   #258 <Method void View.setVisibility(int)>
	//*  22   45:aload_3         
	//*  23   46:checkcast       #135 <Class ActionMenuView>
	//*  24   49:astore_1        
	//*  25   50:aload           5
	//*  26   52:invokevirtual   #262 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  27   55:astore_2        
	//*  28   56:aload_1         
	//*  29   57:aload_2         
	//*  30   58:invokevirtual   #266 <Method boolean ActionMenuView.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  31   61:ifne            74
	//*  32   64:aload           5
	//*  33   66:aload_1         
	//*  34   67:aload_2         
	//*  35   68:invokevirtual   #270 <Method ActionMenuView$LayoutParams ActionMenuView.generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  36   71:invokevirtual   #274 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  37   74:aload           5
	//*  38   76:areturn         
			byte0 = 0;
	//   39   77:iconst_0        
	//   40   78:istore          4
		view1.setVisibility(((int) (byte0)));
		menuitemimpl = ((MenuItemImpl) ((ActionMenuView)viewgroup));
		view = ((View) (view1.getLayoutParams()));
		if(!((ActionMenuView) (menuitemimpl)).checkLayoutParams(((android.view.ViewGroup.LayoutParams) (view))))
			view1.setLayoutParams(((android.view.ViewGroup.LayoutParams) (((ActionMenuView) (menuitemimpl)).generateLayoutParams(((android.view.ViewGroup.LayoutParams) (view))))));
		return view1;
	//*  41   80:goto            38
	}

	public MenuView getMenuView(ViewGroup viewgroup)
	{
		MenuView menuview = mMenuView;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field MenuView mMenuView>
	//    2    4:astore_2        
		viewgroup = ((ViewGroup) (((BaseMenuPresenter)this).getMenuView(viewgroup)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #278 <Method MenuView BaseMenuPresenter.getMenuView(ViewGroup)>
	//    6   10:astore_1        
		if(menuview != viewgroup)
	//*   7   11:aload_2         
	//*   8   12:aload_1         
	//*   9   13:if_acmpeq       24
			((ActionMenuView)viewgroup).setPresenter(this);
	//   10   16:aload_1         
	//   11   17:checkcast       #135 <Class ActionMenuView>
	//   12   20:aload_0         
	//   13   21:invokevirtual   #281 <Method void ActionMenuView.setPresenter(ActionMenuPresenter)>
		return ((MenuView) (viewgroup));
	//   14   24:aload_1         
	//   15   25:areturn         
	}

	public Drawable getOverflowIcon()
	{
		if(mOverflowButton != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*   2    4:ifnull          15
			return mOverflowButton.getDrawable();
	//    3    7:aload_0         
	//    4    8:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//    5   11:invokevirtual   #286 <Method Drawable ActionMenuPresenter$OverflowMenuButton.getDrawable()>
	//    6   14:areturn         
		if(mPendingOverflowIconSet)
	//*   7   15:aload_0         
	//*   8   16:getfield        #288 <Field boolean mPendingOverflowIconSet>
	//*   9   19:ifeq            27
			return mPendingOverflowIcon;
	//   10   22:aload_0         
	//   11   23:getfield        #290 <Field Drawable mPendingOverflowIcon>
	//   12   26:areturn         
		else
			return null;
	//   13   27:aconst_null     
	//   14   28:areturn         
	}

	public boolean hideOverflowMenu()
	{
		if(mPostedOpenRunnable != null && mMenuView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #292 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
	//*   2    4:ifnull          36
	//*   3    7:aload_0         
	//*   4    8:getfield        #106 <Field MenuView mMenuView>
	//*   5   11:ifnull          36
		{
			((View)mMenuView).removeCallbacks(((Runnable) (mPostedOpenRunnable)));
	//    6   14:aload_0         
	//    7   15:getfield        #106 <Field MenuView mMenuView>
	//    8   18:checkcast       #222 <Class View>
	//    9   21:aload_0         
	//   10   22:getfield        #292 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
	//   11   25:invokevirtual   #296 <Method boolean View.removeCallbacks(Runnable)>
	//   12   28:pop             
			mPostedOpenRunnable = null;
	//   13   29:aload_0         
	//   14   30:aconst_null     
	//   15   31:putfield        #292 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
			return true;
	//   16   34:iconst_1        
	//   17   35:ireturn         
		}
		OverflowPopup overflowpopup = mOverflowPopup;
	//   18   36:aload_0         
	//   19   37:getfield        #298 <Field ActionMenuPresenter$OverflowPopup mOverflowPopup>
	//   20   40:astore_1        
		if(overflowpopup != null)
	//*  21   41:aload_1         
	//*  22   42:ifnull          51
		{
			((MenuPopupHelper) (overflowpopup)).dismiss();
	//   23   45:aload_1         
	//   24   46:invokevirtual   #303 <Method void MenuPopupHelper.dismiss()>
			return true;
	//   25   49:iconst_1        
	//   26   50:ireturn         
		} else
		{
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		}
	}

	public boolean hideSubMenus()
	{
		if(mActionButtonPopup != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #305 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
	//*   2    4:ifnull          16
		{
			mActionButtonPopup.dismiss();
	//    3    7:aload_0         
	//    4    8:getfield        #305 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
	//    5   11:invokevirtual   #306 <Method void ActionMenuPresenter$ActionButtonSubmenu.dismiss()>
			return true;
	//    6   14:iconst_1        
	//    7   15:ireturn         
		} else
		{
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		}
	}

	public void initForMenu(Context context, MenuBuilder menubuilder)
	{
		((BaseMenuPresenter)this).initForMenu(context, menubuilder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #312 <Method void BaseMenuPresenter.initForMenu(Context, MenuBuilder)>
		menubuilder = ((MenuBuilder) (context.getResources()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #318 <Method Resources Context.getResources()>
	//    6   10:astore_2        
		context = ((Context) (ActionBarPolicy.get(context)));
	//    7   11:aload_1         
	//    8   12:invokestatic    #323 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//    9   15:astore_1        
		if(!mReserveOverflowSet)
	//*  10   16:aload_0         
	//*  11   17:getfield        #325 <Field boolean mReserveOverflowSet>
	//*  12   20:ifne            31
			mReserveOverflow = ((ActionBarPolicy) (context)).showsOverflowMenuButton();
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #328 <Method boolean ActionBarPolicy.showsOverflowMenuButton()>
	//   16   28:putfield        #203 <Field boolean mReserveOverflow>
		if(!mWidthLimitSet)
	//*  17   31:aload_0         
	//*  18   32:getfield        #330 <Field boolean mWidthLimitSet>
	//*  19   35:ifne            46
			mWidthLimit = ((ActionBarPolicy) (context)).getEmbeddedMenuWidthLimit();
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #333 <Method int ActionBarPolicy.getEmbeddedMenuWidthLimit()>
	//   23   43:putfield        #335 <Field int mWidthLimit>
		if(!mMaxItemsSet)
	//*  24   46:aload_0         
	//*  25   47:getfield        #337 <Field boolean mMaxItemsSet>
	//*  26   50:ifne            61
			mMaxItems = ((ActionBarPolicy) (context)).getMaxActionButtons();
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #340 <Method int ActionBarPolicy.getMaxActionButtons()>
	//   30   58:putfield        #176 <Field int mMaxItems>
		int i = mWidthLimit;
	//   31   61:aload_0         
	//   32   62:getfield        #335 <Field int mWidthLimit>
	//   33   65:istore_3        
		if(mReserveOverflow)
	//*  34   66:aload_0         
	//*  35   67:getfield        #203 <Field boolean mReserveOverflow>
	//*  36   70:ifeq            179
		{
			if(mOverflowButton == null)
	//*  37   73:aload_0         
	//*  38   74:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*  39   77:ifnonnull       142
			{
				mOverflowButton = new ((OverflowMenuButton)this).OverflowMenuButton(mSystemContext);
	//   40   80:aload_0         
	//   41   81:new             #17  <Class ActionMenuPresenter$OverflowMenuButton>
	//   42   84:dup             
	//   43   85:aload_0         
	//   44   86:aload_0         
	//   45   87:getfield        #344 <Field Context mSystemContext>
	//   46   90:invokespecial   #347 <Method void ActionMenuPresenter$OverflowMenuButton(ActionMenuPresenter, Context)>
	//   47   93:putfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
				if(mPendingOverflowIconSet)
	//*  48   96:aload_0         
	//*  49   97:getfield        #288 <Field boolean mPendingOverflowIconSet>
	//*  50  100:ifeq            124
				{
					mOverflowButton.setImageDrawable(mPendingOverflowIcon);
	//   51  103:aload_0         
	//   52  104:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//   53  107:aload_0         
	//   54  108:getfield        #290 <Field Drawable mPendingOverflowIcon>
	//   55  111:invokevirtual   #351 <Method void ActionMenuPresenter$OverflowMenuButton.setImageDrawable(Drawable)>
					mPendingOverflowIcon = null;
	//   56  114:aload_0         
	//   57  115:aconst_null     
	//   58  116:putfield        #290 <Field Drawable mPendingOverflowIcon>
					mPendingOverflowIconSet = false;
	//   59  119:aload_0         
	//   60  120:iconst_0        
	//   61  121:putfield        #288 <Field boolean mPendingOverflowIconSet>
				}
				int j = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   62  124:iconst_0        
	//   63  125:iconst_0        
	//   64  126:invokestatic    #184 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   65  129:istore          4
				mOverflowButton.measure(j, j);
	//   66  131:aload_0         
	//   67  132:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//   68  135:iload           4
	//   69  137:iload           4
	//   70  139:invokevirtual   #352 <Method void ActionMenuPresenter$OverflowMenuButton.measure(int, int)>
			}
			i -= mOverflowButton.getMeasuredWidth();
	//   71  142:iload_3         
	//   72  143:aload_0         
	//   73  144:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//   74  147:invokevirtual   #353 <Method int ActionMenuPresenter$OverflowMenuButton.getMeasuredWidth()>
	//   75  150:isub            
	//   76  151:istore_3        
		} else
	//*  77  152:aload_0         
	//*  78  153:iload_3         
	//*  79  154:putfield        #178 <Field int mActionItemWidthLimit>
	//*  80  157:aload_0         
	//*  81  158:ldc2            #354 <Float 56F>
	//*  82  161:aload_2         
	//*  83  162:invokevirtual   #360 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//*  84  165:getfield        #366 <Field float DisplayMetrics.density>
	//*  85  168:fmul            
	//*  86  169:f2i             
	//*  87  170:putfield        #210 <Field int mMinCellSize>
	//*  88  173:aload_0         
	//*  89  174:aconst_null     
	//*  90  175:putfield        #212 <Field View mScrapActionButtonView>
	//*  91  178:return          
		{
			mOverflowButton = null;
	//   92  179:aload_0         
	//   93  180:aconst_null     
	//   94  181:putfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
		}
		mActionItemWidthLimit = i;
		mMinCellSize = (int)(56F * ((Resources) (menubuilder)).getDisplayMetrics().density);
		mScrapActionButtonView = null;
	//*  95  184:goto            152
	}

	public boolean isOverflowMenuShowPending()
	{
		return mPostedOpenRunnable != null || isOverflowMenuShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
	//    2    4:ifnonnull       14
	//    3    7:aload_0         
	//    4    8:invokevirtual   #371 <Method boolean isOverflowMenuShowing()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean isOverflowMenuShowing()
	{
		return mOverflowPopup != null && mOverflowPopup.isShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #298 <Field ActionMenuPresenter$OverflowPopup mOverflowPopup>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #298 <Field ActionMenuPresenter$OverflowPopup mOverflowPopup>
	//    5   11:invokevirtual   #374 <Method boolean ActionMenuPresenter$OverflowPopup.isShowing()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean isOverflowReserved()
	{
		return mReserveOverflow;
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field boolean mReserveOverflow>
	//    2    4:ireturn         
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		dismissPopupMenus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #379 <Method boolean dismissPopupMenus()>
	//    2    4:pop             
		((BaseMenuPresenter)this).onCloseMenu(menubuilder, flag);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #381 <Method void BaseMenuPresenter.onCloseMenu(MenuBuilder, boolean)>
	//    7   11:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		if(!mMaxItemsSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #337 <Field boolean mMaxItemsSet>
	//*   2    4:ifne            21
			mMaxItems = ActionBarPolicy.get(mContext).getMaxActionButtons();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #386 <Field Context mContext>
	//    6   12:invokestatic    #323 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//    7   15:invokevirtual   #340 <Method int ActionBarPolicy.getMaxActionButtons()>
	//    8   18:putfield        #176 <Field int mMaxItems>
		if(mMenu != null)
	//*   9   21:aload_0         
	//*  10   22:getfield        #99  <Field MenuBuilder mMenu>
	//*  11   25:ifnull          36
			mMenu.onItemsChanged(true);
	//   12   28:aload_0         
	//   13   29:getfield        #99  <Field MenuBuilder mMenu>
	//   14   32:iconst_1        
	//   15   33:invokevirtual   #389 <Method void MenuBuilder.onItemsChanged(boolean)>
	//   16   36:return          
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		if(parcelable instanceof SavedState)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #28  <Class ActionMenuPresenter$SavedState>
	//*   2    4:ifne            8
	//*   3    7:return          
	//*   4    8:aload_1         
	//*   5    9:checkcast       #28  <Class ActionMenuPresenter$SavedState>
	//*   6   12:astore_1        
			if(((SavedState) (parcelable = ((Parcelable) ((SavedState)parcelable)))).openSubMenuId > 0 && (parcelable = ((Parcelable) (mMenu.findItem(((SavedState) (parcelable)).openSubMenuId)))) != null)
	//*   7   13:aload_1         
	//*   8   14:getfield        #394 <Field int ActionMenuPresenter$SavedState.openSubMenuId>
	//*   9   17:ifle            7
	//*  10   20:aload_0         
	//*  11   21:getfield        #99  <Field MenuBuilder mMenu>
	//*  12   24:aload_1         
	//*  13   25:getfield        #394 <Field int ActionMenuPresenter$SavedState.openSubMenuId>
	//*  14   28:invokevirtual   #398 <Method MenuItem MenuBuilder.findItem(int)>
	//*  15   31:astore_1        
	//*  16   32:aload_1         
	//*  17   33:ifnull          7
			{
				onSubMenuSelected((SubMenuBuilder)((MenuItem) (parcelable)).getSubMenu());
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokeinterface #404 <Method android.view.SubMenu MenuItem.getSubMenu()>
	//   21   43:checkcast       #406 <Class SubMenuBuilder>
	//   22   46:invokevirtual   #410 <Method boolean onSubMenuSelected(SubMenuBuilder)>
	//   23   49:pop             
				return;
	//   24   50:return          
			}
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState();
	//    0    0:new             #28  <Class ActionMenuPresenter$SavedState>
	//    1    3:dup             
	//    2    4:invokespecial   #413 <Method void ActionMenuPresenter$SavedState()>
	//    3    7:astore_1        
		savedstate.openSubMenuId = mOpenSubMenuId;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #415 <Field int mOpenSubMenuId>
	//    7   13:putfield        #394 <Field int ActionMenuPresenter$SavedState.openSubMenuId>
		return ((Parcelable) (savedstate));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
	{
		if(submenubuilder.hasVisibleItems()) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #418 <Method boolean SubMenuBuilder.hasVisibleItems()>
	//    2    4:ifne            9
_L1:
		return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
_L2:
		Object obj;
		for(obj = ((Object) (submenubuilder)); ((SubMenuBuilder) (obj)).getParentMenu() != mMenu; obj = ((Object) ((SubMenuBuilder)((SubMenuBuilder) (obj)).getParentMenu())));
	//    5    9:aload_1         
	//    6   10:astore          5
	//    7   12:aload           5
	//    8   14:invokevirtual   #422 <Method android.view.Menu SubMenuBuilder.getParentMenu()>
	//    9   17:aload_0         
	//   10   18:getfield        #99  <Field MenuBuilder mMenu>
	//   11   21:if_acmpeq       37
	//   12   24:aload           5
	//   13   26:invokevirtual   #422 <Method android.view.Menu SubMenuBuilder.getParentMenu()>
	//   14   29:checkcast       #406 <Class SubMenuBuilder>
	//   15   32:astore          5
	//*  16   34:goto            12
		obj = ((Object) (findViewForItem(((SubMenuBuilder) (obj)).getItem())));
	//   17   37:aload_0         
	//   18   38:aload           5
	//   19   40:invokevirtual   #426 <Method MenuItem SubMenuBuilder.getItem()>
	//   20   43:invokespecial   #428 <Method View findViewForItem(MenuItem)>
	//   21   46:astore          5
		if(obj == null) goto _L1; else goto _L3
	//   22   48:aload           5
	//   23   50:ifnull          7
_L3:
		int i;
		int j;
		mOpenSubMenuId = submenubuilder.getItem().getItemId();
	//   24   53:aload_0         
	//   25   54:aload_1         
	//   26   55:invokevirtual   #426 <Method MenuItem SubMenuBuilder.getItem()>
	//   27   58:invokeinterface #431 <Method int MenuItem.getItemId()>
	//   28   63:putfield        #415 <Field int mOpenSubMenuId>
		j = submenubuilder.size();
	//   29   66:aload_1         
	//   30   67:invokevirtual   #432 <Method int SubMenuBuilder.size()>
	//   31   70:istore_3        
		i = 0;
	//   32   71:iconst_0        
	//   33   72:istore_2        
_L6:
		MenuItem menuitem;
		if(i >= j)
			break MISSING_BLOCK_LABEL_158;
	//   34   73:iload_2         
	//   35   74:iload_3         
	//   36   75:icmpge          158
		menuitem = submenubuilder.getItem(i);
	//   37   78:aload_1         
	//   38   79:iload_2         
	//   39   80:invokevirtual   #434 <Method MenuItem SubMenuBuilder.getItem(int)>
	//   40   83:astore          6
		if(!menuitem.isVisible() || menuitem.getIcon() == null) goto _L5; else goto _L4
	//   41   85:aload           6
	//   42   87:invokeinterface #437 <Method boolean MenuItem.isVisible()>
	//   43   92:ifeq            151
	//   44   95:aload           6
	//   45   97:invokeinterface #440 <Method Drawable MenuItem.getIcon()>
	//   46  102:ifnull          151
_L4:
		boolean flag = true;
	//   47  105:iconst_1        
	//   48  106:istore          4
_L7:
		mActionButtonPopup = new ((ActionButtonSubmenu)this).ActionButtonSubmenu(mContext, submenubuilder, ((View) (obj)));
	//   49  108:aload_0         
	//   50  109:new             #8   <Class ActionMenuPresenter$ActionButtonSubmenu>
	//   51  112:dup             
	//   52  113:aload_0         
	//   53  114:aload_0         
	//   54  115:getfield        #386 <Field Context mContext>
	//   55  118:aload_1         
	//   56  119:aload           5
	//   57  121:invokespecial   #443 <Method void ActionMenuPresenter$ActionButtonSubmenu(ActionMenuPresenter, Context, SubMenuBuilder, View)>
	//   58  124:putfield        #305 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
		mActionButtonPopup.setForceShowIcon(flag);
	//   59  127:aload_0         
	//   60  128:getfield        #305 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
	//   61  131:iload           4
	//   62  133:invokevirtual   #446 <Method void ActionMenuPresenter$ActionButtonSubmenu.setForceShowIcon(boolean)>
		mActionButtonPopup.show();
	//   63  136:aload_0         
	//   64  137:getfield        #305 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
	//   65  140:invokevirtual   #449 <Method void ActionMenuPresenter$ActionButtonSubmenu.show()>
		((BaseMenuPresenter)this).onSubMenuSelected(submenubuilder);
	//   66  143:aload_0         
	//   67  144:aload_1         
	//   68  145:invokespecial   #450 <Method boolean BaseMenuPresenter.onSubMenuSelected(SubMenuBuilder)>
	//   69  148:pop             
		return true;
	//   70  149:iconst_1        
	//   71  150:ireturn         
_L5:
		i++;
	//   72  151:iload_2         
	//   73  152:iconst_1        
	//   74  153:iadd            
	//   75  154:istore_2        
		  goto _L6
	//*  76  155:goto            73
		flag = false;
	//   77  158:iconst_0        
	//   78  159:istore          4
		  goto _L7
	//*  79  161:goto            108
	}

	public void onSubUiVisibilityChanged(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			((BaseMenuPresenter)this).onSubMenuSelected(((SubMenuBuilder) (null)));
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #450 <Method boolean BaseMenuPresenter.onSubMenuSelected(SubMenuBuilder)>
	//    5    9:pop             
		else
	//*   6   10:return          
		if(mMenu != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #99  <Field MenuBuilder mMenu>
	//*   9   15:ifnull          10
		{
			mMenu.close(false);
	//   10   18:aload_0         
	//   11   19:getfield        #99  <Field MenuBuilder mMenu>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #454 <Method void MenuBuilder.close(boolean)>
			return;
	//   14   26:return          
		}
	}

	public void setExpandedActionViewsExclusive(boolean flag)
	{
		mExpandedActionViewsExclusive = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #195 <Field boolean mExpandedActionViewsExclusive>
	//    3    5:return          
	}

	public void setItemLimit(int i)
	{
		mMaxItems = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #176 <Field int mMaxItems>
		mMaxItemsSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #337 <Field boolean mMaxItemsSet>
	//    6   10:return          
	}

	public void setMenuView(ActionMenuView actionmenuview)
	{
		mMenuView = ((MenuView) (actionmenuview));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field MenuView mMenuView>
		actionmenuview.initialize(mMenu);
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #99  <Field MenuBuilder mMenu>
	//    6   10:invokevirtual   #461 <Method void ActionMenuView.initialize(MenuBuilder)>
	//    7   13:return          
	}

	public void setOverflowIcon(Drawable drawable)
	{
		if(mOverflowButton != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*   2    4:ifnull          16
		{
			mOverflowButton.setImageDrawable(drawable);
	//    3    7:aload_0         
	//    4    8:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #351 <Method void ActionMenuPresenter$OverflowMenuButton.setImageDrawable(Drawable)>
			return;
	//    7   15:return          
		} else
		{
			mPendingOverflowIconSet = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #288 <Field boolean mPendingOverflowIconSet>
			mPendingOverflowIcon = drawable;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #290 <Field Drawable mPendingOverflowIcon>
			return;
	//   14   26:return          
		}
	}

	public void setReserveOverflow(boolean flag)
	{
		mReserveOverflow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #203 <Field boolean mReserveOverflow>
		mReserveOverflowSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #325 <Field boolean mReserveOverflowSet>
	//    6   10:return          
	}

	public void setWidthLimit(int i, boolean flag)
	{
		mWidthLimit = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #335 <Field int mWidthLimit>
		mStrictWidthLimit = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #208 <Field boolean mStrictWidthLimit>
		mWidthLimitSet = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #330 <Field boolean mWidthLimitSet>
	//    9   15:return          
	}

	public boolean shouldIncludeItem(int i, MenuItemImpl menuitemimpl)
	{
		return menuitemimpl.isActionButton();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #246 <Method boolean MenuItemImpl.isActionButton()>
	//    2    4:ireturn         
	}

	public boolean showOverflowMenu()
	{
		if(mReserveOverflow && !isOverflowMenuShowing() && mMenu != null && mMenuView != null && mPostedOpenRunnable == null && !mMenu.getNonActionItems().isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #203 <Field boolean mReserveOverflow>
	//*   2    4:ifeq            104
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #371 <Method boolean isOverflowMenuShowing()>
	//*   5   11:ifne            104
	//*   6   14:aload_0         
	//*   7   15:getfield        #99  <Field MenuBuilder mMenu>
	//*   8   18:ifnull          104
	//*   9   21:aload_0         
	//*  10   22:getfield        #106 <Field MenuView mMenuView>
	//*  11   25:ifnull          104
	//*  12   28:aload_0         
	//*  13   29:getfield        #292 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
	//*  14   32:ifnonnull       104
	//*  15   35:aload_0         
	//*  16   36:getfield        #99  <Field MenuBuilder mMenu>
	//*  17   39:invokevirtual   #470 <Method ArrayList MenuBuilder.getNonActionItems()>
	//*  18   42:invokevirtual   #473 <Method boolean ArrayList.isEmpty()>
	//*  19   45:ifne            104
		{
			mPostedOpenRunnable = new ((OpenOverflowRunnable)this).OpenOverflowRunnable(new ((OverflowPopup)this).OverflowPopup(mContext, mMenu, ((View) (mOverflowButton)), true));
	//   20   48:aload_0         
	//   21   49:new             #14  <Class ActionMenuPresenter$OpenOverflowRunnable>
	//   22   52:dup             
	//   23   53:aload_0         
	//   24   54:new             #22  <Class ActionMenuPresenter$OverflowPopup>
	//   25   57:dup             
	//   26   58:aload_0         
	//   27   59:aload_0         
	//   28   60:getfield        #386 <Field Context mContext>
	//   29   63:aload_0         
	//   30   64:getfield        #99  <Field MenuBuilder mMenu>
	//   31   67:aload_0         
	//   32   68:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//   33   71:iconst_1        
	//   34   72:invokespecial   #476 <Method void ActionMenuPresenter$OverflowPopup(ActionMenuPresenter, Context, MenuBuilder, View, boolean)>
	//   35   75:invokespecial   #479 <Method void ActionMenuPresenter$OpenOverflowRunnable(ActionMenuPresenter, ActionMenuPresenter$OverflowPopup)>
	//   36   78:putfield        #292 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
			((View)mMenuView).post(((Runnable) (mPostedOpenRunnable)));
	//   37   81:aload_0         
	//   38   82:getfield        #106 <Field MenuView mMenuView>
	//   39   85:checkcast       #222 <Class View>
	//   40   88:aload_0         
	//   41   89:getfield        #292 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
	//   42   92:invokevirtual   #482 <Method boolean View.post(Runnable)>
	//   43   95:pop             
			((BaseMenuPresenter)this).onSubMenuSelected(((SubMenuBuilder) (null)));
	//   44   96:aload_0         
	//   45   97:aconst_null     
	//   46   98:invokespecial   #450 <Method boolean BaseMenuPresenter.onSubMenuSelected(SubMenuBuilder)>
	//   47  101:pop             
			return true;
	//   48  102:iconst_1        
	//   49  103:ireturn         
		} else
		{
			return false;
	//   50  104:iconst_0        
	//   51  105:ireturn         
		}
	}

	public void updateMenuView(boolean flag)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		boolean flag2 = false;
	//    2    2:iconst_0        
	//    3    3:istore          4
		((BaseMenuPresenter)this).updateMenuView(flag);
	//    4    5:aload_0         
	//    5    6:iload_1         
	//    6    7:invokespecial   #485 <Method void BaseMenuPresenter.updateMenuView(boolean)>
		((View)mMenuView).requestLayout();
	//    7   10:aload_0         
	//    8   11:getfield        #106 <Field MenuView mMenuView>
	//    9   14:checkcast       #222 <Class View>
	//   10   17:invokevirtual   #488 <Method void View.requestLayout()>
		if(mMenu != null)
	//*  11   20:aload_0         
	//*  12   21:getfield        #99  <Field MenuBuilder mMenu>
	//*  13   24:ifnull          83
		{
			ArrayList arraylist = mMenu.getActionItems();
	//   14   27:aload_0         
	//   15   28:getfield        #99  <Field MenuBuilder mMenu>
	//   16   31:invokevirtual   #491 <Method ArrayList MenuBuilder.getActionItems()>
	//   17   34:astore          6
			int k = arraylist.size();
	//   18   36:aload           6
	//   19   38:invokevirtual   #174 <Method int ArrayList.size()>
	//   20   41:istore          5
			for(int i = 0; i < k; i++)
	//*  21   43:iconst_0        
	//*  22   44:istore_2        
	//*  23   45:iload_2         
	//*  24   46:iload           5
	//*  25   48:icmpge          83
			{
				ActionProvider actionprovider = ((MenuItemImpl)arraylist.get(i)).getSupportActionProvider();
	//   26   51:aload           6
	//   27   53:iload_2         
	//   28   54:invokevirtual   #188 <Method Object ArrayList.get(int)>
	//   29   57:checkcast       #190 <Class MenuItemImpl>
	//   30   60:invokevirtual   #495 <Method ActionProvider MenuItemImpl.getSupportActionProvider()>
	//   31   63:astore          7
				if(actionprovider != null)
	//*  32   65:aload           7
	//*  33   67:ifnull          76
					actionprovider.setSubUiVisibilityListener(((android.support.v4.view.ActionProvider.SubUiVisibilityListener) (this)));
	//   34   70:aload           7
	//   35   72:aload_0         
	//   36   73:invokevirtual   #501 <Method void ActionProvider.setSubUiVisibilityListener(android.support.v4.view.ActionProvider$SubUiVisibilityListener)>
			}

	//   37   76:iload_2         
	//   38   77:iconst_1        
	//   39   78:iadd            
	//   40   79:istore_2        
		}
	//*  41   80:goto            45
		int j;
		Object obj;
		if(mMenu != null)
	//*  42   83:aload_0         
	//*  43   84:getfield        #99  <Field MenuBuilder mMenu>
	//*  44   87:ifnull          245
			obj = ((Object) (mMenu.getNonActionItems()));
	//   45   90:aload_0         
	//   46   91:getfield        #99  <Field MenuBuilder mMenu>
	//   47   94:invokevirtual   #470 <Method ArrayList MenuBuilder.getNonActionItems()>
	//   48   97:astore          6
		else
	//*  49   99:iload           4
	//*  50  101:istore_2        
	//*  51  102:aload_0         
	//*  52  103:getfield        #203 <Field boolean mReserveOverflow>
	//*  53  106:ifeq            145
	//*  54  109:iload           4
	//*  55  111:istore_2        
	//*  56  112:aload           6
	//*  57  114:ifnull          145
	//*  58  117:aload           6
	//*  59  119:invokevirtual   #174 <Method int ArrayList.size()>
	//*  60  122:istore_2        
	//*  61  123:iload_2         
	//*  62  124:iconst_1        
	//*  63  125:icmpne          256
	//*  64  128:aload           6
	//*  65  130:iconst_0        
	//*  66  131:invokevirtual   #188 <Method Object ArrayList.get(int)>
	//*  67  134:checkcast       #190 <Class MenuItemImpl>
	//*  68  137:invokevirtual   #198 <Method boolean MenuItemImpl.isActionViewExpanded()>
	//*  69  140:ifne            251
	//*  70  143:iconst_1        
	//*  71  144:istore_2        
	//*  72  145:iload_2         
	//*  73  146:ifeq            270
	//*  74  149:aload_0         
	//*  75  150:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*  76  153:ifnonnull       172
	//*  77  156:aload_0         
	//*  78  157:new             #17  <Class ActionMenuPresenter$OverflowMenuButton>
	//*  79  160:dup             
	//*  80  161:aload_0         
	//*  81  162:aload_0         
	//*  82  163:getfield        #344 <Field Context mSystemContext>
	//*  83  166:invokespecial   #347 <Method void ActionMenuPresenter$OverflowMenuButton(ActionMenuPresenter, Context)>
	//*  84  169:putfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*  85  172:aload_0         
	//*  86  173:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*  87  176:invokevirtual   #505 <Method android.view.ViewParent ActionMenuPresenter$OverflowMenuButton.getParent()>
	//*  88  179:checkcast       #113 <Class ViewGroup>
	//*  89  182:astore          6
	//*  90  184:aload           6
	//*  91  186:aload_0         
	//*  92  187:getfield        #106 <Field MenuView mMenuView>
	//*  93  190:if_acmpeq       230
	//*  94  193:aload           6
	//*  95  195:ifnull          207
	//*  96  198:aload           6
	//*  97  200:aload_0         
	//*  98  201:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*  99  204:invokevirtual   #509 <Method void ViewGroup.removeView(View)>
	//* 100  207:aload_0         
	//* 101  208:getfield        #106 <Field MenuView mMenuView>
	//* 102  211:checkcast       #135 <Class ActionMenuView>
	//* 103  214:astore          6
	//* 104  216:aload           6
	//* 105  218:aload_0         
	//* 106  219:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//* 107  222:aload           6
	//* 108  224:invokevirtual   #513 <Method ActionMenuView$LayoutParams ActionMenuView.generateOverflowButtonLayoutParams()>
	//* 109  227:invokevirtual   #517 <Method void ActionMenuView.addView(View, android.view.ViewGroup$LayoutParams)>
	//* 110  230:aload_0         
	//* 111  231:getfield        #106 <Field MenuView mMenuView>
	//* 112  234:checkcast       #135 <Class ActionMenuView>
	//* 113  237:aload_0         
	//* 114  238:getfield        #203 <Field boolean mReserveOverflow>
	//* 115  241:invokevirtual   #520 <Method void ActionMenuView.setOverflowReserved(boolean)>
	//* 116  244:return          
			obj = null;
	//  117  245:aconst_null     
	//  118  246:astore          6
		j = ((int) (flag2));
		if(mReserveOverflow)
		{
			j = ((int) (flag2));
			if(obj != null)
			{
				j = ((ArrayList) (obj)).size();
				if(j == 1)
				{
					if(!((MenuItemImpl)((ArrayList) (obj)).get(0)).isActionViewExpanded())
						j = 1;
					else
	//* 119  248:goto            99
						j = 0;
	//  120  251:iconst_0        
	//  121  252:istore_2        
				} else
	//* 122  253:goto            145
				if(j > 0)
	//* 123  256:iload_2         
	//* 124  257:ifle            265
					j = ((int) (flag1));
	//  125  260:iload_3         
	//  126  261:istore_2        
				else
	//* 127  262:goto            145
					j = 0;
	//  128  265:iconst_0        
	//  129  266:istore_2        
			}
		}
		if(j == 0) goto _L2; else goto _L1
_L1:
		if(mOverflowButton == null)
			mOverflowButton = new ((OverflowMenuButton)this).OverflowMenuButton(mSystemContext);
		obj = ((Object) ((ViewGroup)mOverflowButton.getParent()));
		if(obj != mMenuView)
		{
			if(obj != null)
				((ViewGroup) (obj)).removeView(((View) (mOverflowButton)));
			obj = ((Object) ((ActionMenuView)mMenuView));
			((ActionMenuView) (obj)).addView(((View) (mOverflowButton)), ((android.view.ViewGroup.LayoutParams) (((ActionMenuView) (obj)).generateOverflowButtonLayoutParams())));
		}
_L4:
		((ActionMenuView)mMenuView).setOverflowReserved(mReserveOverflow);
		return;
	//* 130  267:goto            262
_L2:
		if(mOverflowButton != null && mOverflowButton.getParent() == mMenuView)
	//* 131  270:aload_0         
	//* 132  271:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//* 133  274:ifnull          230
	//* 134  277:aload_0         
	//* 135  278:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//* 136  281:invokevirtual   #505 <Method android.view.ViewParent ActionMenuPresenter$OverflowMenuButton.getParent()>
	//* 137  284:aload_0         
	//* 138  285:getfield        #106 <Field MenuView mMenuView>
	//* 139  288:if_acmpne       230
			((ViewGroup)mMenuView).removeView(((View) (mOverflowButton)));
	//  140  291:aload_0         
	//  141  292:getfield        #106 <Field MenuView mMenuView>
	//  142  295:checkcast       #113 <Class ViewGroup>
	//  143  298:aload_0         
	//  144  299:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//  145  302:invokevirtual   #509 <Method void ViewGroup.removeView(View)>
		if(true) goto _L4; else goto _L3
	//  146  305:goto            230
_L3:
	}

	private static final String TAG = "ActionMenuPresenter";
	private final SparseBooleanArray mActionButtonGroups = new SparseBooleanArray();
	ActionButtonSubmenu mActionButtonPopup;
	private int mActionItemWidthLimit;
	private boolean mExpandedActionViewsExclusive;
	private int mMaxItems;
	private boolean mMaxItemsSet;
	private int mMinCellSize;
	int mOpenSubMenuId;
	OverflowMenuButton mOverflowButton;
	OverflowPopup mOverflowPopup;
	private Drawable mPendingOverflowIcon;
	private boolean mPendingOverflowIconSet;
	private ActionMenuPopupCallback mPopupCallback;
	final PopupPresenterCallback mPopupPresenterCallback = new ((PopupPresenterCallback)this).PopupPresenterCallback();
	OpenOverflowRunnable mPostedOpenRunnable;
	private boolean mReserveOverflow;
	private boolean mReserveOverflowSet;
	private View mScrapActionButtonView;
	private boolean mStrictWidthLimit;
	private int mWidthLimit;
	private boolean mWidthLimitSet;


/*
	static MenuBuilder access$000(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.mMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

*/


/*
	static MenuBuilder access$100(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.mMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

*/


/*
	static MenuView access$200(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.mMenuView;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field MenuView mMenuView>
	//    2    4:areturn         
	}

*/


/*
	static MenuBuilder access$300(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.mMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

*/


/*
	static MenuBuilder access$400(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.mMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

*/


/*
	static MenuView access$500(ActionMenuPresenter actionmenupresenter)
	{
		return actionmenupresenter.mMenuView;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field MenuView mMenuView>
	//    2    4:areturn         
	}

*/

	// Unreferenced inner class android/support/v7/widget/ActionMenuPresenter$OverflowMenuButton$1

/* anonymous class */
	class OverflowMenuButton._cls1 extends ForwardingListener
	{

		public ShowableListMenu getPopup()
		{
			if(mOverflowPopup == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field ActionMenuPresenter$OverflowMenuButton this$1>
		//*   2    4:getfield        #30  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
		//*   3    7:getfield        #34  <Field ActionMenuPresenter$OverflowPopup ActionMenuPresenter.mOverflowPopup>
		//*   4   10:ifnonnull       15
				return null;
		//    5   13:aconst_null     
		//    6   14:areturn         
			else
				return ((ShowableListMenu) (mOverflowPopup.getPopup()));
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field ActionMenuPresenter$OverflowMenuButton this$1>
		//    9   19:getfield        #30  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
		//   10   22:getfield        #34  <Field ActionMenuPresenter$OverflowPopup ActionMenuPresenter.mOverflowPopup>
		//   11   25:invokevirtual   #39  <Method android.support.v7.view.menu.MenuPopup ActionMenuPresenter$OverflowPopup.getPopup()>
		//   12   28:areturn         
		}

		public boolean onForwardingStarted()
		{
			showOverflowMenu();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field ActionMenuPresenter$OverflowMenuButton this$1>
		//    2    4:getfield        #30  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
		//    3    7:invokevirtual   #44  <Method boolean ActionMenuPresenter.showOverflowMenu()>
		//    4   10:pop             
			return true;
		//    5   11:iconst_1        
		//    6   12:ireturn         
		}

		public boolean onForwardingStopped()
		{
			if(mPostedOpenRunnable != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field ActionMenuPresenter$OverflowMenuButton this$1>
		//*   2    4:getfield        #30  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
		//*   3    7:getfield        #49  <Field ActionMenuPresenter$OpenOverflowRunnable ActionMenuPresenter.mPostedOpenRunnable>
		//*   4   10:ifnull          15
			{
				return false;
		//    5   13:iconst_0        
		//    6   14:ireturn         
			} else
			{
				hideOverflowMenu();
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field ActionMenuPresenter$OverflowMenuButton this$1>
		//    9   19:getfield        #30  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
		//   10   22:invokevirtual   #52  <Method boolean ActionMenuPresenter.hideOverflowMenu()>
		//   11   25:pop             
				return true;
		//   12   26:iconst_1        
		//   13   27:ireturn         
			}
		}

		final OverflowMenuButton this$1;
		final ActionMenuPresenter val$this$0;

			
			{
				this$1 = final_overflowmenubutton;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ActionMenuPresenter$OverflowMenuButton this$1>
				this$0 = actionmenupresenter;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #21  <Field ActionMenuPresenter val$this$0>
				((ForwardingListener)this).ForwardingListener(View.this);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #24  <Method void ForwardingListener(View)>
			//    9   15:return          
			}
	}

}
