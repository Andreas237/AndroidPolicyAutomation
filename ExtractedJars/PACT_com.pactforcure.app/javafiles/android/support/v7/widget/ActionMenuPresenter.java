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
		int i1;
		int j1;
		int i2;
		int j3;
		int k3;
		int l3;
		int i4;
		ArrayList arraylist;
		ViewGroup viewgroup;
		SparseBooleanArray sparsebooleanarray;
		boolean flag1;
label0:
		{
			int i;
			int k1;
			boolean flag;
			if(mMenu != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field MenuBuilder mMenu>
	//*   2    4:ifnull          126
			{
				arraylist = mMenu.getVisibleItems();
	//    3    7:aload_0         
	//    4    8:getfield        #99  <Field MenuBuilder mMenu>
	//    5   11:invokevirtual   #169 <Method ArrayList MenuBuilder.getVisibleItems()>
	//    6   14:astore          16
				j3 = arraylist.size();
	//    7   16:aload           16
	//    8   18:invokevirtual   #174 <Method int ArrayList.size()>
	//    9   21:istore          8
			} else
	//*  10   23:aload_0         
	//*  11   24:getfield        #176 <Field int mMaxItems>
	//*  12   27:istore_1        
	//*  13   28:aload_0         
	//*  14   29:getfield        #178 <Field int mActionItemWidthLimit>
	//*  15   32:istore          10
	//*  16   34:iconst_0        
	//*  17   35:iconst_0        
	//*  18   36:invokestatic    #184 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  19   39:istore          11
	//*  20   41:aload_0         
	//*  21   42:getfield        #106 <Field MenuView mMenuView>
	//*  22   45:checkcast       #113 <Class ViewGroup>
	//*  23   48:astore          17
	//*  24   50:iconst_0        
	//*  25   51:istore_2        
	//*  26   52:iconst_0        
	//*  27   53:istore          4
	//*  28   55:iconst_0        
	//*  29   56:istore          7
	//*  30   58:iconst_0        
	//*  31   59:istore          5
	//*  32   61:iconst_0        
	//*  33   62:istore_3        
	//*  34   63:iload_3         
	//*  35   64:iload           8
	//*  36   66:icmpge          158
	//*  37   69:aload           16
	//*  38   71:iload_3         
	//*  39   72:invokevirtual   #188 <Method Object ArrayList.get(int)>
	//*  40   75:checkcast       #190 <Class MenuItemImpl>
	//*  41   78:astore          18
	//*  42   80:aload           18
	//*  43   82:invokevirtual   #193 <Method boolean MenuItemImpl.requiresActionButton()>
	//*  44   85:ifeq            135
	//*  45   88:iload_2         
	//*  46   89:iconst_1        
	//*  47   90:iadd            
	//*  48   91:istore_2        
	//*  49   92:iload_1         
	//*  50   93:istore          6
	//*  51   95:aload_0         
	//*  52   96:getfield        #195 <Field boolean mExpandedActionViewsExclusive>
	//*  53   99:ifeq            116
	//*  54  102:iload_1         
	//*  55  103:istore          6
	//*  56  105:aload           18
	//*  57  107:invokevirtual   #198 <Method boolean MenuItemImpl.isActionViewExpanded()>
	//*  58  110:ifeq            116
	//*  59  113:iconst_0        
	//*  60  114:istore          6
	//*  61  116:iload_3         
	//*  62  117:iconst_1        
	//*  63  118:iadd            
	//*  64  119:istore_3        
	//*  65  120:iload           6
	//*  66  122:istore_1        
	//*  67  123:goto            63
			{
				arraylist = null;
	//   68  126:aconst_null     
	//   69  127:astore          16
				j3 = 0;
	//   70  129:iconst_0        
	//   71  130:istore          8
			}
			i = mMaxItems;
			l3 = mActionItemWidthLimit;
			i4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
			viewgroup = (ViewGroup)mMenuView;
			i1 = 0;
			k1 = 0;
			flag1 = false;
			flag = false;
			j1 = 0;
			while(j1 < j3) 
			{
				MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(j1);
				int j2;
				if(menuitemimpl.requiresActionButton())
					i1++;
				else
	//*  72  132:goto            23
				if(menuitemimpl.requestsActionButton())
	//*  73  135:aload           18
	//*  74  137:invokevirtual   #201 <Method boolean MenuItemImpl.requestsActionButton()>
	//*  75  140:ifeq            152
					k1++;
	//   76  143:iload           4
	//   77  145:iconst_1        
	//   78  146:iadd            
	//   79  147:istore          4
				else
	//*  80  149:goto            92
					flag = true;
	//   81  152:iconst_1        
	//   82  153:istore          5
				j2 = i;
				if(mExpandedActionViewsExclusive)
				{
					j2 = i;
					if(menuitemimpl.isActionViewExpanded())
						j2 = 0;
				}
				j1++;
				i = j2;
			}
	//*  83  155:goto            92
			j1 = i;
	//   84  158:iload_1         
	//   85  159:istore_3        
			if(!mReserveOverflow)
				break label0;
	//   86  160:aload_0         
	//   87  161:getfield        #203 <Field boolean mReserveOverflow>
	//   88  164:ifeq            186
			if(!flag)
	//*  89  167:iload           5
	//*  90  169:ifne            182
			{
				j1 = i;
	//   91  172:iload_1         
	//   92  173:istore_3        
				if(i1 + k1 <= i)
					break label0;
	//   93  174:iload_2         
	//   94  175:iload           4
	//   95  177:iadd            
	//   96  178:iload_1         
	//   97  179:icmple          186
			}
			j1 = i - 1;
	//   98  182:iload_1         
	//   99  183:iconst_1        
	//  100  184:isub            
	//  101  185:istore_3        
		}
		j1 -= i1;
	//  102  186:iload_3         
	//  103  187:iload_2         
	//  104  188:isub            
	//  105  189:istore_3        
		sparsebooleanarray = mActionButtonGroups;
	//  106  190:aload_0         
	//  107  191:getfield        #87  <Field SparseBooleanArray mActionButtonGroups>
	//  108  194:astore          18
		sparsebooleanarray.clear();
	//  109  196:aload           18
	//  110  198:invokevirtual   #206 <Method void SparseBooleanArray.clear()>
		k3 = 0;
	//  111  201:iconst_0        
	//  112  202:istore          9
		i1 = 0;
	//  113  204:iconst_0        
	//  114  205:istore_2        
		if(mStrictWidthLimit)
	//* 115  206:aload_0         
	//* 116  207:getfield        #208 <Field boolean mStrictWidthLimit>
	//* 117  210:ifeq            239
		{
			i1 = l3 / mMinCellSize;
	//  118  213:iload           10
	//  119  215:aload_0         
	//  120  216:getfield        #210 <Field int mMinCellSize>
	//  121  219:idiv            
	//  122  220:istore_2        
			int j = mMinCellSize;
	//  123  221:aload_0         
	//  124  222:getfield        #210 <Field int mMinCellSize>
	//  125  225:istore_1        
			k3 = mMinCellSize + (l3 % j) / i1;
	//  126  226:aload_0         
	//  127  227:getfield        #210 <Field int mMinCellSize>
	//  128  230:iload           10
	//  129  232:iload_1         
	//  130  233:irem            
	//  131  234:iload_2         
	//  132  235:idiv            
	//  133  236:iadd            
	//  134  237:istore          9
		}
		k = 0;
	//  135  239:iconst_0        
	//  136  240:istore_1        
		i2 = l3;
	//  137  241:iload           10
	//  138  243:istore          5
		l3 = k;
	//  139  245:iload_1         
	//  140  246:istore          10
		k = ((int) (flag1));
	//  141  248:iload           7
	//  142  250:istore_1        
_L2:
		int l1;
		MenuItemImpl menuitemimpl1;
		if(l3 >= j3)
			break MISSING_BLOCK_LABEL_775;
	//  143  251:iload           10
	//  144  253:iload           8
	//  145  255:icmpge          775
		menuitemimpl1 = (MenuItemImpl)arraylist.get(l3);
	//  146  258:aload           16
	//  147  260:iload           10
	//  148  262:invokevirtual   #188 <Method Object ArrayList.get(int)>
	//  149  265:checkcast       #190 <Class MenuItemImpl>
	//  150  268:astore          19
		if(!menuitemimpl1.requiresActionButton())
			break; /* Loop/switch isn't completed */
	//  151  270:aload           19
	//  152  272:invokevirtual   #193 <Method boolean MenuItemImpl.requiresActionButton()>
	//  153  275:ifeq            402
		View view = getItemView(menuitemimpl1, mScrapActionButtonView, viewgroup);
	//  154  278:aload_0         
	//  155  279:aload           19
	//  156  281:aload_0         
	//  157  282:getfield        #212 <Field View mScrapActionButtonView>
	//  158  285:aload           17
	//  159  287:invokevirtual   #216 <Method View getItemView(MenuItemImpl, View, ViewGroup)>
	//  160  290:astore          20
		if(mScrapActionButtonView == null)
	//* 161  292:aload_0         
	//* 162  293:getfield        #212 <Field View mScrapActionButtonView>
	//* 163  296:ifnonnull       305
			mScrapActionButtonView = view;
	//  164  299:aload_0         
	//  165  300:aload           20
	//  166  302:putfield        #212 <Field View mScrapActionButtonView>
		int k2;
		if(mStrictWidthLimit)
	//* 167  305:aload_0         
	//* 168  306:getfield        #208 <Field boolean mStrictWidthLimit>
	//* 169  309:ifeq            390
			i1 -= ActionMenuView.measureChildForCells(view, k3, i1, i4, 0);
	//  170  312:iload_2         
	//  171  313:aload           20
	//  172  315:iload           9
	//  173  317:iload_2         
	//  174  318:iload           11
	//  175  320:iconst_0        
	//  176  321:invokestatic    #220 <Method int ActionMenuView.measureChildForCells(View, int, int, int, int)>
	//  177  324:isub            
	//  178  325:istore_2        
		else
	//* 179  326:aload           20
	//* 180  328:invokevirtual   #225 <Method int View.getMeasuredWidth()>
	//* 181  331:istore          6
	//* 182  333:iload           5
	//* 183  335:iload           6
	//* 184  337:isub            
	//* 185  338:istore          4
	//* 186  340:iload_1         
	//* 187  341:istore          5
	//* 188  343:iload_1         
	//* 189  344:ifne            351
	//* 190  347:iload           6
	//* 191  349:istore          5
	//* 192  351:aload           19
	//* 193  353:invokevirtual   #228 <Method int MenuItemImpl.getGroupId()>
	//* 194  356:istore_1        
	//* 195  357:iload_1         
	//* 196  358:ifeq            368
	//* 197  361:aload           18
	//* 198  363:iload_1         
	//* 199  364:iconst_1        
	//* 200  365:invokevirtual   #232 <Method void SparseBooleanArray.put(int, boolean)>
	//* 201  368:aload           19
	//* 202  370:iconst_1        
	//* 203  371:invokevirtual   #236 <Method void MenuItemImpl.setIsActionButton(boolean)>
	//* 204  374:iload           5
	//* 205  376:istore_1        
	//* 206  377:iload           10
	//* 207  379:iconst_1        
	//* 208  380:iadd            
	//* 209  381:istore          10
	//* 210  383:iload           4
	//* 211  385:istore          5
	//* 212  387:goto            251
			view.measure(i4, i4);
	//  213  390:aload           20
	//  214  392:iload           11
	//  215  394:iload           11
	//  216  396:invokevirtual   #240 <Method void View.measure(int, int)>
		k2 = view.getMeasuredWidth();
		l1 = i2 - k2;
		i2 = k;
		if(k == 0)
			i2 = k2;
		k = menuitemimpl1.getGroupId();
		if(k != 0)
			sparsebooleanarray.put(k, true);
		menuitemimpl1.setIsActionButton(true);
		k = i2;
_L5:
		l3++;
		i2 = l1;
		if(true) goto _L2; else goto _L1
	//* 217  399:goto            326
_L1:
		int j4;
		boolean flag4;
		if(!menuitemimpl1.requestsActionButton())
			break MISSING_BLOCK_LABEL_762;
	//  218  402:aload           19
	//  219  404:invokevirtual   #201 <Method boolean MenuItemImpl.requestsActionButton()>
	//  220  407:ifeq            762
		j4 = menuitemimpl1.getGroupId();
	//  221  410:aload           19
	//  222  412:invokevirtual   #228 <Method int MenuItemImpl.getGroupId()>
	//  223  415:istore          12
		flag4 = sparsebooleanarray.get(j4);
	//  224  417:aload           18
	//  225  419:iload           12
	//  226  421:invokevirtual   #243 <Method boolean SparseBooleanArray.get(int)>
	//  227  424:istore          15
		int l2;
		int i3;
		boolean flag2;
		boolean flag3;
		if((j1 > 0 || flag4) && i2 > 0 && (!mStrictWidthLimit || i1 > 0))
	//* 228  426:iload_3         
	//* 229  427:ifgt            435
	//* 230  430:iload           15
	//* 231  432:ifeq            635
	//* 232  435:iload           5
	//* 233  437:ifle            635
	//* 234  440:aload_0         
	//* 235  441:getfield        #208 <Field boolean mStrictWidthLimit>
	//* 236  444:ifeq            451
	//* 237  447:iload_2         
	//* 238  448:ifle            635
			flag2 = true;
	//  239  451:iconst_1        
	//  240  452:istore          13
		else
	//* 241  454:iload_2         
	//* 242  455:istore          7
	//* 243  457:iload_1         
	//* 244  458:istore          6
	//* 245  460:iload           13
	//* 246  462:istore          14
	//* 247  464:iload           5
	//* 248  466:istore          4
	//* 249  468:iload           13
	//* 250  470:ifeq            588
	//* 251  473:aload_0         
	//* 252  474:aload           19
	//* 253  476:aload_0         
	//* 254  477:getfield        #212 <Field View mScrapActionButtonView>
	//* 255  480:aload           17
	//* 256  482:invokevirtual   #216 <Method View getItemView(MenuItemImpl, View, ViewGroup)>
	//* 257  485:astore          20
	//* 258  487:aload_0         
	//* 259  488:getfield        #212 <Field View mScrapActionButtonView>
	//* 260  491:ifnonnull       500
	//* 261  494:aload_0         
	//* 262  495:aload           20
	//* 263  497:putfield        #212 <Field View mScrapActionButtonView>
	//* 264  500:aload_0         
	//* 265  501:getfield        #208 <Field boolean mStrictWidthLimit>
	//* 266  504:ifeq            641
	//* 267  507:aload           20
	//* 268  509:iload           9
	//* 269  511:iload_2         
	//* 270  512:iload           11
	//* 271  514:iconst_0        
	//* 272  515:invokestatic    #220 <Method int ActionMenuView.measureChildForCells(View, int, int, int, int)>
	//* 273  518:istore          6
	//* 274  520:iload_2         
	//* 275  521:iload           6
	//* 276  523:isub            
	//* 277  524:istore          4
	//* 278  526:iload           4
	//* 279  528:istore_2        
	//* 280  529:iload           6
	//* 281  531:ifne            540
	//* 282  534:iconst_0        
	//* 283  535:istore          13
	//* 284  537:iload           4
	//* 285  539:istore_2        
	//* 286  540:aload           20
	//* 287  542:invokevirtual   #225 <Method int View.getMeasuredWidth()>
	//* 288  545:istore          7
	//* 289  547:iload           5
	//* 290  549:iload           7
	//* 291  551:isub            
	//* 292  552:istore          4
	//* 293  554:iload_1         
	//* 294  555:istore          6
	//* 295  557:iload_1         
	//* 296  558:ifne            565
	//* 297  561:iload           7
	//* 298  563:istore          6
	//* 299  565:aload_0         
	//* 300  566:getfield        #208 <Field boolean mStrictWidthLimit>
	//* 301  569:ifeq            658
	//* 302  572:iload           4
	//* 303  574:iflt            653
	//* 304  577:iconst_1        
	//* 305  578:istore_1        
	//* 306  579:iload           13
	//* 307  581:iload_1         
	//* 308  582:iand            
	//* 309  583:istore          14
	//* 310  585:iload_2         
	//* 311  586:istore          7
	//* 312  588:iload           14
	//* 313  590:ifeq            685
	//* 314  593:iload           12
	//* 315  595:ifeq            685
	//* 316  598:aload           18
	//* 317  600:iload           12
	//* 318  602:iconst_1        
	//* 319  603:invokevirtual   #232 <Method void SparseBooleanArray.put(int, boolean)>
	//* 320  606:iload_3         
	//* 321  607:istore_1        
	//* 322  608:iload_1         
	//* 323  609:istore_3        
	//* 324  610:iload           14
	//* 325  612:ifeq            619
	//* 326  615:iload_1         
	//* 327  616:iconst_1        
	//* 328  617:isub            
	//* 329  618:istore_3        
	//* 330  619:aload           19
	//* 331  621:iload           14
	//* 332  623:invokevirtual   #236 <Method void MenuItemImpl.setIsActionButton(boolean)>
	//* 333  626:iload           7
	//* 334  628:istore_2        
	//* 335  629:iload           6
	//* 336  631:istore_1        
	//* 337  632:goto            377
			flag2 = false;
	//  338  635:iconst_0        
	//  339  636:istore          13
		i3 = i1;
		l2 = k;
		flag3 = flag2;
		l1 = i2;
		if(flag2)
		{
			View view1 = getItemView(menuitemimpl1, mScrapActionButtonView, viewgroup);
			if(mScrapActionButtonView == null)
				mScrapActionButtonView = view1;
			if(mStrictWidthLimit)
			{
				l2 = ActionMenuView.measureChildForCells(view1, k3, i1, i4, 0);
				l1 = i1 - l2;
				i1 = l1;
				if(l2 == 0)
				{
					flag2 = false;
					i1 = l1;
				}
			} else
	//* 340  638:goto            454
			{
				view1.measure(i4, i4);
	//  341  641:aload           20
	//  342  643:iload           11
	//  343  645:iload           11
	//  344  647:invokevirtual   #240 <Method void View.measure(int, int)>
			}
			i3 = view1.getMeasuredWidth();
			l1 = i2 - i3;
			l2 = k;
			if(k == 0)
				l2 = i3;
			if(mStrictWidthLimit)
			{
				if(l1 >= 0)
					k = 1;
				else
	//* 345  650:goto            540
					k = 0;
	//  346  653:iconst_0        
	//  347  654:istore_1        
				flag3 = flag2 & k;
				i3 = i1;
			} else
	//* 348  655:goto            579
			{
				if(l1 + l2 > 0)
	//* 349  658:iload           4
	//* 350  660:iload           6
	//* 351  662:iadd            
	//* 352  663:ifle            680
					k = 1;
	//  353  666:iconst_1        
	//  354  667:istore_1        
				else
	//* 355  668:iload           13
	//* 356  670:iload_1         
	//* 357  671:iand            
	//* 358  672:istore          14
	//* 359  674:iload_2         
	//* 360  675:istore          7
	//* 361  677:goto            588
					k = 0;
	//  362  680:iconst_0        
	//  363  681:istore_1        
				flag3 = flag2 & k;
				i3 = i1;
			}
		}
		if(!flag3 || j4 == 0) goto _L4; else goto _L3
_L3:
		sparsebooleanarray.put(j4, true);
		k = j1;
_L7:
		j1 = k;
		if(flag3)
			j1 = k - 1;
		menuitemimpl1.setIsActionButton(flag3);
		i1 = i3;
		k = l2;
		  goto _L5
	//* 364  682:goto            668
_L4:
		k = j1;
	//  365  685:iload_3         
	//  366  686:istore_1        
		if(!flag4) goto _L7; else goto _L6
	//  367  687:iload           15
	//  368  689:ifeq            608
_L6:
		sparsebooleanarray.put(j4, false);
	//  369  692:aload           18
	//  370  694:iload           12
	//  371  696:iconst_0        
	//  372  697:invokevirtual   #232 <Method void SparseBooleanArray.put(int, boolean)>
		i1 = 0;
	//  373  700:iconst_0        
	//  374  701:istore_2        
_L9:
		k = j1;
	//  375  702:iload_3         
	//  376  703:istore_1        
		if(i1 >= l3) goto _L7; else goto _L8
	//  377  704:iload_2         
	//  378  705:iload           10
	//  379  707:icmpge          608
_L8:
		MenuItemImpl menuitemimpl2 = (MenuItemImpl)arraylist.get(i1);
	//  380  710:aload           16
	//  381  712:iload_2         
	//  382  713:invokevirtual   #188 <Method Object ArrayList.get(int)>
	//  383  716:checkcast       #190 <Class MenuItemImpl>
	//  384  719:astore          20
		int l = j1;
	//  385  721:iload_3         
	//  386  722:istore_1        
		if(menuitemimpl2.getGroupId() == j4)
	//* 387  723:aload           20
	//* 388  725:invokevirtual   #228 <Method int MenuItemImpl.getGroupId()>
	//* 389  728:iload           12
	//* 390  730:icmpne          753
		{
			l = j1;
	//  391  733:iload_3         
	//  392  734:istore_1        
			if(menuitemimpl2.isActionButton())
	//* 393  735:aload           20
	//* 394  737:invokevirtual   #246 <Method boolean MenuItemImpl.isActionButton()>
	//* 395  740:ifeq            747
				l = j1 + 1;
	//  396  743:iload_3         
	//  397  744:iconst_1        
	//  398  745:iadd            
	//  399  746:istore_1        
			menuitemimpl2.setIsActionButton(false);
	//  400  747:aload           20
	//  401  749:iconst_0        
	//  402  750:invokevirtual   #236 <Method void MenuItemImpl.setIsActionButton(boolean)>
		}
		i1++;
	//  403  753:iload_2         
	//  404  754:iconst_1        
	//  405  755:iadd            
	//  406  756:istore_2        
		j1 = l;
	//  407  757:iload_1         
	//  408  758:istore_3        
		  goto _L9
		  goto _L7
	//* 409  759:goto            702
		menuitemimpl1.setIsActionButton(false);
	//  410  762:aload           19
	//  411  764:iconst_0        
	//  412  765:invokevirtual   #236 <Method void MenuItemImpl.setIsActionButton(boolean)>
		l1 = i2;
	//  413  768:iload           5
	//  414  770:istore          4
		  goto _L5
	//* 415  772:goto            377
		return true;
	//  416  775:iconst_1        
	//  417  776:ireturn         
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
		if(submenubuilder.hasVisibleItems())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #418 <Method boolean SubMenuBuilder.hasVisibleItems()>
	//*   2    4:ifne            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
		{
			Object obj;
			for(obj = ((Object) (submenubuilder)); ((SubMenuBuilder) (obj)).getParentMenu() != mMenu; obj = ((Object) ((SubMenuBuilder)((SubMenuBuilder) (obj)).getParentMenu())));
	//    5    9:aload_1         
	//    6   10:astore          6
	//    7   12:aload           6
	//    8   14:invokevirtual   #422 <Method android.view.Menu SubMenuBuilder.getParentMenu()>
	//    9   17:aload_0         
	//   10   18:getfield        #99  <Field MenuBuilder mMenu>
	//   11   21:if_acmpeq       37
	//   12   24:aload           6
	//   13   26:invokevirtual   #422 <Method android.view.Menu SubMenuBuilder.getParentMenu()>
	//   14   29:checkcast       #406 <Class SubMenuBuilder>
	//   15   32:astore          6
	//*  16   34:goto            12
			obj = ((Object) (findViewForItem(((SubMenuBuilder) (obj)).getItem())));
	//   17   37:aload_0         
	//   18   38:aload           6
	//   19   40:invokevirtual   #426 <Method MenuItem SubMenuBuilder.getItem()>
	//   20   43:invokespecial   #428 <Method View findViewForItem(MenuItem)>
	//   21   46:astore          6
			if(obj != null)
	//*  22   48:aload           6
	//*  23   50:ifnull          7
			{
				mOpenSubMenuId = submenubuilder.getItem().getItemId();
	//   24   53:aload_0         
	//   25   54:aload_1         
	//   26   55:invokevirtual   #426 <Method MenuItem SubMenuBuilder.getItem()>
	//   27   58:invokeinterface #431 <Method int MenuItem.getItemId()>
	//   28   63:putfield        #415 <Field int mOpenSubMenuId>
				boolean flag1 = false;
	//   29   66:iconst_0        
	//   30   67:istore          5
				int j = submenubuilder.size();
	//   31   69:aload_1         
	//   32   70:invokevirtual   #432 <Method int SubMenuBuilder.size()>
	//   33   73:istore_3        
				int i = 0;
	//   34   74:iconst_0        
	//   35   75:istore_2        
				do
				{
label0:
					{
						boolean flag = flag1;
	//   36   76:iload           5
	//   37   78:istore          4
						if(i < j)
	//*  38   80:iload_2         
	//*  39   81:iload_3         
	//*  40   82:icmpge          115
						{
							MenuItem menuitem = submenubuilder.getItem(i);
	//   41   85:aload_1         
	//   42   86:iload_2         
	//   43   87:invokevirtual   #434 <Method MenuItem SubMenuBuilder.getItem(int)>
	//   44   90:astore          7
							if(!menuitem.isVisible() || menuitem.getIcon() == null)
								break label0;
	//   45   92:aload           7
	//   46   94:invokeinterface #437 <Method boolean MenuItem.isVisible()>
	//   47   99:ifeq            158
	//   48  102:aload           7
	//   49  104:invokeinterface #440 <Method Drawable MenuItem.getIcon()>
	//   50  109:ifnull          158
							flag = true;
	//   51  112:iconst_1        
	//   52  113:istore          4
						}
						mActionButtonPopup = new ((ActionButtonSubmenu)this).ActionButtonSubmenu(mContext, submenubuilder, ((View) (obj)));
	//   53  115:aload_0         
	//   54  116:new             #8   <Class ActionMenuPresenter$ActionButtonSubmenu>
	//   55  119:dup             
	//   56  120:aload_0         
	//   57  121:aload_0         
	//   58  122:getfield        #386 <Field Context mContext>
	//   59  125:aload_1         
	//   60  126:aload           6
	//   61  128:invokespecial   #443 <Method void ActionMenuPresenter$ActionButtonSubmenu(ActionMenuPresenter, Context, SubMenuBuilder, View)>
	//   62  131:putfield        #305 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
						mActionButtonPopup.setForceShowIcon(flag);
	//   63  134:aload_0         
	//   64  135:getfield        #305 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
	//   65  138:iload           4
	//   66  140:invokevirtual   #446 <Method void ActionMenuPresenter$ActionButtonSubmenu.setForceShowIcon(boolean)>
						mActionButtonPopup.show();
	//   67  143:aload_0         
	//   68  144:getfield        #305 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
	//   69  147:invokevirtual   #449 <Method void ActionMenuPresenter$ActionButtonSubmenu.show()>
						((BaseMenuPresenter)this).onSubMenuSelected(submenubuilder);
	//   70  150:aload_0         
	//   71  151:aload_1         
	//   72  152:invokespecial   #450 <Method boolean BaseMenuPresenter.onSubMenuSelected(SubMenuBuilder)>
	//   73  155:pop             
						return true;
	//   74  156:iconst_1        
	//   75  157:ireturn         
					}
					i++;
	//   76  158:iload_2         
	//   77  159:iconst_1        
	//   78  160:iadd            
	//   79  161:istore_2        
				} while(true);
	//   80  162:goto            76
			}
		}
		return false;
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
		((BaseMenuPresenter)this).updateMenuView(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #485 <Method void BaseMenuPresenter.updateMenuView(boolean)>
		((View)mMenuView).requestLayout();
	//    3    5:aload_0         
	//    4    6:getfield        #106 <Field MenuView mMenuView>
	//    5    9:checkcast       #222 <Class View>
	//    6   12:invokevirtual   #488 <Method void View.requestLayout()>
		if(mMenu != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #99  <Field MenuBuilder mMenu>
	//*   9   19:ifnull          76
		{
			ArrayList arraylist = mMenu.getActionItems();
	//   10   22:aload_0         
	//   11   23:getfield        #99  <Field MenuBuilder mMenu>
	//   12   26:invokevirtual   #491 <Method ArrayList MenuBuilder.getActionItems()>
	//   13   29:astore          4
			int k = arraylist.size();
	//   14   31:aload           4
	//   15   33:invokevirtual   #174 <Method int ArrayList.size()>
	//   16   36:istore_3        
			for(int i = 0; i < k; i++)
	//*  17   37:iconst_0        
	//*  18   38:istore_2        
	//*  19   39:iload_2         
	//*  20   40:iload_3         
	//*  21   41:icmpge          76
			{
				ActionProvider actionprovider = ((MenuItemImpl)arraylist.get(i)).getSupportActionProvider();
	//   22   44:aload           4
	//   23   46:iload_2         
	//   24   47:invokevirtual   #188 <Method Object ArrayList.get(int)>
	//   25   50:checkcast       #190 <Class MenuItemImpl>
	//   26   53:invokevirtual   #495 <Method ActionProvider MenuItemImpl.getSupportActionProvider()>
	//   27   56:astore          5
				if(actionprovider != null)
	//*  28   58:aload           5
	//*  29   60:ifnull          69
					actionprovider.setSubUiVisibilityListener(((android.support.v4.view.ActionProvider.SubUiVisibilityListener) (this)));
	//   30   63:aload           5
	//   31   65:aload_0         
	//   32   66:invokevirtual   #501 <Method void ActionProvider.setSubUiVisibilityListener(android.support.v4.view.ActionProvider$SubUiVisibilityListener)>
			}

	//   33   69:iload_2         
	//   34   70:iconst_1        
	//   35   71:iadd            
	//   36   72:istore_2        
		}
	//*  37   73:goto            39
		int j;
		boolean flag1;
		Object obj;
		if(mMenu != null)
	//*  38   76:aload_0         
	//*  39   77:getfield        #99  <Field MenuBuilder mMenu>
	//*  40   80:ifnull          238
			obj = ((Object) (mMenu.getNonActionItems()));
	//   41   83:aload_0         
	//   42   84:getfield        #99  <Field MenuBuilder mMenu>
	//   43   87:invokevirtual   #470 <Method ArrayList MenuBuilder.getNonActionItems()>
	//   44   90:astore          4
		else
	//*  45   92:iconst_0        
	//*  46   93:istore_3        
	//*  47   94:iload_3         
	//*  48   95:istore_2        
	//*  49   96:aload_0         
	//*  50   97:getfield        #203 <Field boolean mReserveOverflow>
	//*  51  100:ifeq            138
	//*  52  103:iload_3         
	//*  53  104:istore_2        
	//*  54  105:aload           4
	//*  55  107:ifnull          138
	//*  56  110:aload           4
	//*  57  112:invokevirtual   #174 <Method int ArrayList.size()>
	//*  58  115:istore_2        
	//*  59  116:iload_2         
	//*  60  117:iconst_1        
	//*  61  118:icmpne          249
	//*  62  121:aload           4
	//*  63  123:iconst_0        
	//*  64  124:invokevirtual   #188 <Method Object ArrayList.get(int)>
	//*  65  127:checkcast       #190 <Class MenuItemImpl>
	//*  66  130:invokevirtual   #198 <Method boolean MenuItemImpl.isActionViewExpanded()>
	//*  67  133:ifne            244
	//*  68  136:iconst_1        
	//*  69  137:istore_2        
	//*  70  138:iload_2         
	//*  71  139:ifeq            263
	//*  72  142:aload_0         
	//*  73  143:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*  74  146:ifnonnull       165
	//*  75  149:aload_0         
	//*  76  150:new             #17  <Class ActionMenuPresenter$OverflowMenuButton>
	//*  77  153:dup             
	//*  78  154:aload_0         
	//*  79  155:aload_0         
	//*  80  156:getfield        #344 <Field Context mSystemContext>
	//*  81  159:invokespecial   #347 <Method void ActionMenuPresenter$OverflowMenuButton(ActionMenuPresenter, Context)>
	//*  82  162:putfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*  83  165:aload_0         
	//*  84  166:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*  85  169:invokevirtual   #505 <Method android.view.ViewParent ActionMenuPresenter$OverflowMenuButton.getParent()>
	//*  86  172:checkcast       #113 <Class ViewGroup>
	//*  87  175:astore          4
	//*  88  177:aload           4
	//*  89  179:aload_0         
	//*  90  180:getfield        #106 <Field MenuView mMenuView>
	//*  91  183:if_acmpeq       223
	//*  92  186:aload           4
	//*  93  188:ifnull          200
	//*  94  191:aload           4
	//*  95  193:aload_0         
	//*  96  194:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*  97  197:invokevirtual   #509 <Method void ViewGroup.removeView(View)>
	//*  98  200:aload_0         
	//*  99  201:getfield        #106 <Field MenuView mMenuView>
	//* 100  204:checkcast       #135 <Class ActionMenuView>
	//* 101  207:astore          4
	//* 102  209:aload           4
	//* 103  211:aload_0         
	//* 104  212:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//* 105  215:aload           4
	//* 106  217:invokevirtual   #513 <Method ActionMenuView$LayoutParams ActionMenuView.generateOverflowButtonLayoutParams()>
	//* 107  220:invokevirtual   #517 <Method void ActionMenuView.addView(View, android.view.ViewGroup$LayoutParams)>
	//* 108  223:aload_0         
	//* 109  224:getfield        #106 <Field MenuView mMenuView>
	//* 110  227:checkcast       #135 <Class ActionMenuView>
	//* 111  230:aload_0         
	//* 112  231:getfield        #203 <Field boolean mReserveOverflow>
	//* 113  234:invokevirtual   #520 <Method void ActionMenuView.setOverflowReserved(boolean)>
	//* 114  237:return          
			obj = null;
	//  115  238:aconst_null     
	//  116  239:astore          4
		flag1 = false;
		j = ((int) (flag1));
		if(mReserveOverflow)
		{
			j = ((int) (flag1));
			if(obj != null)
			{
				j = ((ArrayList) (obj)).size();
				if(j == 1)
				{
					if(!((MenuItemImpl)((ArrayList) (obj)).get(0)).isActionViewExpanded())
						j = 1;
					else
	//* 117  241:goto            92
						j = 0;
	//  118  244:iconst_0        
	//  119  245:istore_2        
				} else
	//* 120  246:goto            138
				if(j > 0)
	//* 121  249:iload_2         
	//* 122  250:ifle            258
					j = 1;
	//  123  253:iconst_1        
	//  124  254:istore_2        
				else
	//* 125  255:goto            138
					j = 0;
	//  126  258:iconst_0        
	//  127  259:istore_2        
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
	//* 128  260:goto            255
_L2:
		if(mOverflowButton != null && mOverflowButton.getParent() == mMenuView)
	//* 129  263:aload_0         
	//* 130  264:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//* 131  267:ifnull          223
	//* 132  270:aload_0         
	//* 133  271:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//* 134  274:invokevirtual   #505 <Method android.view.ViewParent ActionMenuPresenter$OverflowMenuButton.getParent()>
	//* 135  277:aload_0         
	//* 136  278:getfield        #106 <Field MenuView mMenuView>
	//* 137  281:if_acmpne       223
			((ViewGroup)mMenuView).removeView(((View) (mOverflowButton)));
	//  138  284:aload_0         
	//  139  285:getfield        #106 <Field MenuView mMenuView>
	//  140  288:checkcast       #113 <Class ViewGroup>
	//  141  291:aload_0         
	//  142  292:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//  143  295:invokevirtual   #509 <Method void ViewGroup.removeView(View)>
		if(true) goto _L4; else goto _L3
	//  144  298:goto            223
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
