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
import android.support.v4.view.ViewCompat;
import android.support.v7.transition.ActionBarTransition;
import android.support.v7.view.ActionBarPolicy;
import android.support.v7.view.menu.*;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.*;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuView, AppCompatImageView, ForwardingListener

class ActionMenuPresenter extends BaseMenuPresenter
	implements android.support.v4.view.ActionProvider.SubUiVisibilityListener
{
	/* member class not found */
	class ActionButtonSubmenu {}

	class ActionMenuPopupCallback extends android.support.v7.view.menu.ActionMenuItemView.PopupCallback
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

	class OverflowMenuButton extends AppCompatImageView
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
			ViewCompat.setTooltipText(((View) (this)), getContentDescription());
		//   24   41:aload_0         
		//   25   42:aload_0         
		//   26   43:invokevirtual   #48  <Method CharSequence getContentDescription()>
		//   27   46:invokestatic    #54  <Method void ViewCompat.setTooltipText(View, CharSequence)>
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

	class PopupPresenterCallback
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
		//   14   32:astore_2        
			if(callback != null)
		//*  15   33:aload_2         
		//*  16   34:ifnull          45
				return callback.onOpenSubMenu(menubuilder);
		//   17   37:aload_2         
		//   18   38:aload_1         
		//   19   39:invokeinterface #57  <Method boolean android.support.v7.view.menu.MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
		//   20   44:ireturn         
			else
				return false;
		//   21   45:iconst_0        
		//   22   46:ireturn         
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

	static class SavedState
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
	//    3    7:astore          4
		if(viewgroup == null)
	//*   4    9:aload           4
	//*   5   11:ifnonnull       16
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		int j = viewgroup.getChildCount();
	//    8   16:aload           4
	//    9   18:invokevirtual   #117 <Method int ViewGroup.getChildCount()>
	//   10   21:istore_3        
		for(int i = 0; i < j; i++)
	//*  11   22:iconst_0        
	//*  12   23:istore_2        
	//*  13   24:iload_2         
	//*  14   25:iload_3         
	//*  15   26:icmpge          69
		{
			View view = viewgroup.getChildAt(i);
	//   16   29:aload           4
	//   17   31:iload_2         
	//   18   32:invokevirtual   #121 <Method View ViewGroup.getChildAt(int)>
	//   19   35:astore          5
			if((view instanceof android.support.v7.view.menu.MenuView.ItemView) && ((android.support.v7.view.menu.MenuView.ItemView)view).getItemData() == menuitem)
	//*  20   37:aload           5
	//*  21   39:instanceof      #123 <Class android.support.v7.view.menu.MenuView$ItemView>
	//*  22   42:ifeq            62
	//*  23   45:aload           5
	//*  24   47:checkcast       #123 <Class android.support.v7.view.menu.MenuView$ItemView>
	//*  25   50:invokeinterface #127 <Method MenuItemImpl android.support.v7.view.menu.MenuView$ItemView.getItemData()>
	//*  26   55:aload_1         
	//*  27   56:if_acmpne       62
				return view;
	//   28   59:aload           5
	//   29   61:areturn         
		}

	//   30   62:iload_2         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:istore_2        
	//*  34   66:goto            24
		return null;
	//   35   69:aconst_null     
	//   36   70:areturn         
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
		int i1;
		int k1;
		int k3;
		int l3;
		boolean flag1;
		int l4;
		ArrayList arraylist;
		ViewGroup viewgroup;
label0:
		{
			if(mMenu != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field MenuBuilder mMenu>
	//*   2    4:ifnull          26
			{
				arraylist = mMenu.getVisibleItems();
	//    3    7:aload_0         
	//    4    8:getfield        #99  <Field MenuBuilder mMenu>
	//    5   11:invokevirtual   #169 <Method ArrayList MenuBuilder.getVisibleItems()>
	//    6   14:astore          16
				l3 = arraylist.size();
	//    7   16:aload           16
	//    8   18:invokevirtual   #174 <Method int ArrayList.size()>
	//    9   21:istore          8
			} else
	//*  10   23:goto            32
			{
				arraylist = null;
	//   11   26:aconst_null     
	//   12   27:astore          16
				l3 = 0;
	//   13   29:iconst_0        
	//   14   30:istore          8
			}
			int i = mMaxItems;
	//   15   32:aload_0         
	//   16   33:getfield        #176 <Field int mMaxItems>
	//   17   36:istore_1        
			k3 = mActionItemWidthLimit;
	//   18   37:aload_0         
	//   19   38:getfield        #178 <Field int mActionItemWidthLimit>
	//   20   41:istore          7
			l4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   21   43:iconst_0        
	//   22   44:iconst_0        
	//   23   45:invokestatic    #184 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   24   48:istore          12
			viewgroup = (ViewGroup)mMenuView;
	//   25   50:aload_0         
	//   26   51:getfield        #106 <Field MenuView mMenuView>
	//   27   54:checkcast       #113 <Class ViewGroup>
	//   28   57:astore          17
			k1 = 0;
	//   29   59:iconst_0        
	//   30   60:istore          4
			int j2 = 0;
	//   31   62:iconst_0        
	//   32   63:istore          5
			flag1 = false;
	//   33   65:iconst_0        
	//   34   66:istore          11
			boolean flag = false;
	//   35   68:iconst_0        
	//   36   69:istore_3        
			for(int l = 0; l < l3;)
	//*  37   70:iconst_0        
	//*  38   71:istore_2        
	//*  39   72:iload_2         
	//*  40   73:iload           8
	//*  41   75:icmpge          159
			{
				MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(l);
	//   42   78:aload           16
	//   43   80:iload_2         
	//   44   81:invokevirtual   #188 <Method Object ArrayList.get(int)>
	//   45   84:checkcast       #190 <Class MenuItemImpl>
	//   46   87:astore          18
				if(menuitemimpl.requiresActionButton())
	//*  47   89:aload           18
	//*  48   91:invokevirtual   #193 <Method boolean MenuItemImpl.requiresActionButton()>
	//*  49   94:ifeq            106
					k1++;
	//   50   97:iload           4
	//   51   99:iconst_1        
	//   52  100:iadd            
	//   53  101:istore          4
				else
	//*  54  103:goto            125
				if(menuitemimpl.requestsActionButton())
	//*  55  106:aload           18
	//*  56  108:invokevirtual   #196 <Method boolean MenuItemImpl.requestsActionButton()>
	//*  57  111:ifeq            123
					j2++;
	//   58  114:iload           5
	//   59  116:iconst_1        
	//   60  117:iadd            
	//   61  118:istore          5
				else
	//*  62  120:goto            125
					flag = true;
	//   63  123:iconst_1        
	//   64  124:istore_3        
				int i3 = i;
	//   65  125:iload_1         
	//   66  126:istore          6
				if(mExpandedActionViewsExclusive)
	//*  67  128:aload_0         
	//*  68  129:getfield        #198 <Field boolean mExpandedActionViewsExclusive>
	//*  69  132:ifeq            149
				{
					i3 = i;
	//   70  135:iload_1         
	//   71  136:istore          6
					if(menuitemimpl.isActionViewExpanded())
	//*  72  138:aload           18
	//*  73  140:invokevirtual   #201 <Method boolean MenuItemImpl.isActionViewExpanded()>
	//*  74  143:ifeq            149
						i3 = 0;
	//   75  146:iconst_0        
	//   76  147:istore          6
				}
				l++;
	//   77  149:iload_2         
	//   78  150:iconst_1        
	//   79  151:iadd            
	//   80  152:istore_2        
				i = i3;
	//   81  153:iload           6
	//   82  155:istore_1        
			}

	//*  83  156:goto            72
			i1 = i;
	//   84  159:iload_1         
	//   85  160:istore_2        
			if(!mReserveOverflow)
				break label0;
	//   86  161:aload_0         
	//   87  162:getfield        #203 <Field boolean mReserveOverflow>
	//   88  165:ifeq            187
			if(!flag)
	//*  89  168:iload_3         
	//*  90  169:ifne            183
			{
				i1 = i;
	//   91  172:iload_1         
	//   92  173:istore_2        
				if(k1 + j2 <= i)
					break label0;
	//   93  174:iload           4
	//   94  176:iload           5
	//   95  178:iadd            
	//   96  179:iload_1         
	//   97  180:icmple          187
			}
			i1 = i - 1;
	//   98  183:iload_1         
	//   99  184:iconst_1        
	//  100  185:isub            
	//  101  186:istore_2        
		}
		int j1 = i1 - k1;
	//  102  187:iload_2         
	//  103  188:iload           4
	//  104  190:isub            
	//  105  191:istore_3        
		SparseBooleanArray sparsebooleanarray = mActionButtonGroups;
	//  106  192:aload_0         
	//  107  193:getfield        #87  <Field SparseBooleanArray mActionButtonGroups>
	//  108  196:astore          18
		sparsebooleanarray.clear();
	//  109  198:aload           18
	//  110  200:invokevirtual   #206 <Method void SparseBooleanArray.clear()>
		int i4 = 0;
	//  111  203:iconst_0        
	//  112  204:istore          9
		i1 = 0;
	//  113  206:iconst_0        
	//  114  207:istore_2        
		if(mStrictWidthLimit)
	//* 115  208:aload_0         
	//* 116  209:getfield        #208 <Field boolean mStrictWidthLimit>
	//* 117  212:ifeq            241
		{
			i1 = k3 / mMinCellSize;
	//  118  215:iload           7
	//  119  217:aload_0         
	//  120  218:getfield        #210 <Field int mMinCellSize>
	//  121  221:idiv            
	//  122  222:istore_2        
			int j = mMinCellSize;
	//  123  223:aload_0         
	//  124  224:getfield        #210 <Field int mMinCellSize>
	//  125  227:istore_1        
			i4 = mMinCellSize + (k3 % j) / i1;
	//  126  228:aload_0         
	//  127  229:getfield        #210 <Field int mMinCellSize>
	//  128  232:iload           7
	//  129  234:iload_1         
	//  130  235:irem            
	//  131  236:iload_2         
	//  132  237:idiv            
	//  133  238:iadd            
	//  134  239:istore          9
		}
		int j4 = 0;
	//  135  241:iconst_0        
	//  136  242:istore          10
		int k = ((int) (flag1));
	//  137  244:iload           11
	//  138  246:istore_1        
		while(j4 < l3) 
	//* 139  247:iload           10
	//* 140  249:iload           8
	//* 141  251:icmpge          769
		{
			MenuItemImpl menuitemimpl1 = (MenuItemImpl)arraylist.get(j4);
	//  142  254:aload           16
	//  143  256:iload           10
	//  144  258:invokevirtual   #188 <Method Object ArrayList.get(int)>
	//  145  261:checkcast       #190 <Class MenuItemImpl>
	//  146  264:astore          19
			int j3;
			if(menuitemimpl1.requiresActionButton())
	//* 147  266:aload           19
	//* 148  268:invokevirtual   #193 <Method boolean MenuItemImpl.requiresActionButton()>
	//* 149  271:ifeq            388
			{
				View view = getItemView(menuitemimpl1, mScrapActionButtonView, viewgroup);
	//  150  274:aload_0         
	//  151  275:aload           19
	//  152  277:aload_0         
	//  153  278:getfield        #212 <Field View mScrapActionButtonView>
	//  154  281:aload           17
	//  155  283:invokevirtual   #216 <Method View getItemView(MenuItemImpl, View, ViewGroup)>
	//  156  286:astore          20
				if(mScrapActionButtonView == null)
	//* 157  288:aload_0         
	//* 158  289:getfield        #212 <Field View mScrapActionButtonView>
	//* 159  292:ifnonnull       301
					mScrapActionButtonView = view;
	//  160  295:aload_0         
	//  161  296:aload           20
	//  162  298:putfield        #212 <Field View mScrapActionButtonView>
				if(mStrictWidthLimit)
	//* 163  301:aload_0         
	//* 164  302:getfield        #208 <Field boolean mStrictWidthLimit>
	//* 165  305:ifeq            325
					i1 -= ActionMenuView.measureChildForCells(view, i4, i1, l4, 0);
	//  166  308:iload_2         
	//  167  309:aload           20
	//  168  311:iload           9
	//  169  313:iload_2         
	//  170  314:iload           12
	//  171  316:iconst_0        
	//  172  317:invokestatic    #220 <Method int ActionMenuView.measureChildForCells(View, int, int, int, int)>
	//  173  320:isub            
	//  174  321:istore_2        
				else
	//* 175  322:goto            334
					view.measure(l4, l4);
	//  176  325:aload           20
	//  177  327:iload           12
	//  178  329:iload           12
	//  179  331:invokevirtual   #226 <Method void View.measure(int, int)>
				int k2 = view.getMeasuredWidth();
	//  180  334:aload           20
	//  181  336:invokevirtual   #229 <Method int View.getMeasuredWidth()>
	//  182  339:istore          5
				j3 = k3 - k2;
	//  183  341:iload           7
	//  184  343:iload           5
	//  185  345:isub            
	//  186  346:istore          6
				int l1 = k;
	//  187  348:iload_1         
	//  188  349:istore          4
				if(k == 0)
	//* 189  351:iload_1         
	//* 190  352:ifne            359
					l1 = k2;
	//  191  355:iload           5
	//  192  357:istore          4
				k = menuitemimpl1.getGroupId();
	//  193  359:aload           19
	//  194  361:invokevirtual   #232 <Method int MenuItemImpl.getGroupId()>
	//  195  364:istore_1        
				if(k != 0)
	//* 196  365:iload_1         
	//* 197  366:ifeq            376
					sparsebooleanarray.put(k, true);
	//  198  369:aload           18
	//  199  371:iload_1         
	//  200  372:iconst_1        
	//  201  373:invokevirtual   #236 <Method void SparseBooleanArray.put(int, boolean)>
				menuitemimpl1.setIsActionButton(true);
	//  202  376:aload           19
	//  203  378:iconst_1        
	//  204  379:invokevirtual   #240 <Method void MenuItemImpl.setIsActionButton(boolean)>
				k = l1;
	//  205  382:iload           4
	//  206  384:istore_1        
			} else
	//* 207  385:goto            756
			if(menuitemimpl1.requestsActionButton())
	//* 208  388:aload           19
	//* 209  390:invokevirtual   #196 <Method boolean MenuItemImpl.requestsActionButton()>
	//* 210  393:ifeq            746
			{
				int k4 = menuitemimpl1.getGroupId();
	//  211  396:aload           19
	//  212  398:invokevirtual   #232 <Method int MenuItemImpl.getGroupId()>
	//  213  401:istore          11
				boolean flag4 = sparsebooleanarray.get(k4);
	//  214  403:aload           18
	//  215  405:iload           11
	//  216  407:invokevirtual   #243 <Method boolean SparseBooleanArray.get(int)>
	//  217  410:istore          15
				boolean flag2;
				if((j1 > 0 || flag4) && k3 > 0 && (!mStrictWidthLimit || i1 > 0))
	//* 218  412:iload_3         
	//* 219  413:ifgt            421
	//* 220  416:iload           15
	//* 221  418:ifeq            443
	//* 222  421:iload           7
	//* 223  423:ifle            443
	//* 224  426:aload_0         
	//* 225  427:getfield        #208 <Field boolean mStrictWidthLimit>
	//* 226  430:ifeq            437
	//* 227  433:iload_2         
	//* 228  434:ifle            443
					flag2 = true;
	//  229  437:iconst_1        
	//  230  438:istore          13
				else
	//* 231  440:goto            446
					flag2 = false;
	//  232  443:iconst_0        
	//  233  444:istore          13
				j3 = k3;
	//  234  446:iload           7
	//  235  448:istore          6
				int l2 = k;
	//  236  450:iload_1         
	//  237  451:istore          5
				int i2 = i1;
	//  238  453:iload_2         
	//  239  454:istore          4
				boolean flag3 = flag2;
	//  240  456:iload           13
	//  241  458:istore          14
				if(flag2)
	//* 242  460:iload           13
	//* 243  462:ifeq            617
				{
					View view1 = getItemView(menuitemimpl1, mScrapActionButtonView, viewgroup);
	//  244  465:aload_0         
	//  245  466:aload           19
	//  246  468:aload_0         
	//  247  469:getfield        #212 <Field View mScrapActionButtonView>
	//  248  472:aload           17
	//  249  474:invokevirtual   #216 <Method View getItemView(MenuItemImpl, View, ViewGroup)>
	//  250  477:astore          20
					if(mScrapActionButtonView == null)
	//* 251  479:aload_0         
	//* 252  480:getfield        #212 <Field View mScrapActionButtonView>
	//* 253  483:ifnonnull       492
						mScrapActionButtonView = view1;
	//  254  486:aload_0         
	//  255  487:aload           20
	//  256  489:putfield        #212 <Field View mScrapActionButtonView>
					if(mStrictWidthLimit)
	//* 257  492:aload_0         
	//* 258  493:getfield        #208 <Field boolean mStrictWidthLimit>
	//* 259  496:ifeq            528
					{
						i2 = ActionMenuView.measureChildForCells(view1, i4, i1, l4, 0);
	//  260  499:aload           20
	//  261  501:iload           9
	//  262  503:iload_2         
	//  263  504:iload           12
	//  264  506:iconst_0        
	//  265  507:invokestatic    #220 <Method int ActionMenuView.measureChildForCells(View, int, int, int, int)>
	//  266  510:istore          4
						i1 -= i2;
	//  267  512:iload_2         
	//  268  513:iload           4
	//  269  515:isub            
	//  270  516:istore_2        
						if(i2 == 0)
	//* 271  517:iload           4
	//* 272  519:ifne            525
							flag2 = false;
	//  273  522:iconst_0        
	//  274  523:istore          13
					} else
	//* 275  525:goto            537
					{
						view1.measure(l4, l4);
	//  276  528:aload           20
	//  277  530:iload           12
	//  278  532:iload           12
	//  279  534:invokevirtual   #226 <Method void View.measure(int, int)>
					}
					i2 = view1.getMeasuredWidth();
	//  280  537:aload           20
	//  281  539:invokevirtual   #229 <Method int View.getMeasuredWidth()>
	//  282  542:istore          4
					j3 = k3 - i2;
	//  283  544:iload           7
	//  284  546:iload           4
	//  285  548:isub            
	//  286  549:istore          6
					l2 = k;
	//  287  551:iload_1         
	//  288  552:istore          5
					if(k == 0)
	//* 289  554:iload_1         
	//* 290  555:ifne            562
						l2 = i2;
	//  291  558:iload           4
	//  292  560:istore          5
					if(mStrictWidthLimit)
	//* 293  562:aload_0         
	//* 294  563:getfield        #208 <Field boolean mStrictWidthLimit>
	//* 295  566:ifeq            593
					{
						if(j3 >= 0)
	//* 296  569:iload           6
	//* 297  571:iflt            579
							k = 1;
	//  298  574:iconst_1        
	//  299  575:istore_1        
						else
	//* 300  576:goto            581
							k = 0;
	//  301  579:iconst_0        
	//  302  580:istore_1        
						flag3 = flag2 & k;
	//  303  581:iload           13
	//  304  583:iload_1         
	//  305  584:iand            
	//  306  585:istore          14
						i2 = i1;
	//  307  587:iload_2         
	//  308  588:istore          4
					} else
	//* 309  590:goto            617
					{
						if(j3 + l2 > 0)
	//* 310  593:iload           6
	//* 311  595:iload           5
	//* 312  597:iadd            
	//* 313  598:ifle            606
							k = 1;
	//  314  601:iconst_1        
	//  315  602:istore_1        
						else
	//* 316  603:goto            608
							k = 0;
	//  317  606:iconst_0        
	//  318  607:istore_1        
						flag3 = flag2 & k;
	//  319  608:iload           13
	//  320  610:iload_1         
	//  321  611:iand            
	//  322  612:istore          14
						i2 = i1;
	//  323  614:iload_2         
	//  324  615:istore          4
					}
				}
				if(flag3 && k4 != 0)
	//* 325  617:iload           14
	//* 326  619:ifeq            640
	//* 327  622:iload           11
	//* 328  624:ifeq            640
				{
					sparsebooleanarray.put(k4, true);
	//  329  627:aload           18
	//  330  629:iload           11
	//  331  631:iconst_1        
	//  332  632:invokevirtual   #236 <Method void SparseBooleanArray.put(int, boolean)>
					k = j1;
	//  333  635:iload_3         
	//  334  636:istore_1        
				} else
	//* 335  637:goto            717
				{
					k = j1;
	//  336  640:iload_3         
	//  337  641:istore_1        
					if(flag4)
	//* 338  642:iload           15
	//* 339  644:ifeq            717
					{
						sparsebooleanarray.put(k4, false);
	//  340  647:aload           18
	//  341  649:iload           11
	//  342  651:iconst_0        
	//  343  652:invokevirtual   #236 <Method void SparseBooleanArray.put(int, boolean)>
						i1 = 0;
	//  344  655:iconst_0        
	//  345  656:istore_2        
						do
						{
							k = j1;
	//  346  657:iload_3         
	//  347  658:istore_1        
							if(i1 >= j4)
								break;
	//  348  659:iload_2         
	//  349  660:iload           10
	//  350  662:icmpge          717
							MenuItemImpl menuitemimpl2 = (MenuItemImpl)arraylist.get(i1);
	//  351  665:aload           16
	//  352  667:iload_2         
	//  353  668:invokevirtual   #188 <Method Object ArrayList.get(int)>
	//  354  671:checkcast       #190 <Class MenuItemImpl>
	//  355  674:astore          20
							k = j1;
	//  356  676:iload_3         
	//  357  677:istore_1        
							if(menuitemimpl2.getGroupId() == k4)
	//* 358  678:aload           20
	//* 359  680:invokevirtual   #232 <Method int MenuItemImpl.getGroupId()>
	//* 360  683:iload           11
	//* 361  685:icmpne          708
							{
								k = j1;
	//  362  688:iload_3         
	//  363  689:istore_1        
								if(menuitemimpl2.isActionButton())
	//* 364  690:aload           20
	//* 365  692:invokevirtual   #246 <Method boolean MenuItemImpl.isActionButton()>
	//* 366  695:ifeq            702
									k = j1 + 1;
	//  367  698:iload_3         
	//  368  699:iconst_1        
	//  369  700:iadd            
	//  370  701:istore_1        
								menuitemimpl2.setIsActionButton(false);
	//  371  702:aload           20
	//  372  704:iconst_0        
	//  373  705:invokevirtual   #240 <Method void MenuItemImpl.setIsActionButton(boolean)>
							}
							i1++;
	//  374  708:iload_2         
	//  375  709:iconst_1        
	//  376  710:iadd            
	//  377  711:istore_2        
							j1 = k;
	//  378  712:iload_1         
	//  379  713:istore_3        
						} while(true);
	//  380  714:goto            657
					}
				}
				i1 = k;
	//  381  717:iload_1         
	//  382  718:istore_2        
				if(flag3)
	//* 383  719:iload           14
	//* 384  721:ifeq            728
					i1 = k - 1;
	//  385  724:iload_1         
	//  386  725:iconst_1        
	//  387  726:isub            
	//  388  727:istore_2        
				menuitemimpl1.setIsActionButton(flag3);
	//  389  728:aload           19
	//  390  730:iload           14
	//  391  732:invokevirtual   #240 <Method void MenuItemImpl.setIsActionButton(boolean)>
				j1 = i1;
	//  392  735:iload_2         
	//  393  736:istore_3        
				k = l2;
	//  394  737:iload           5
	//  395  739:istore_1        
				i1 = i2;
	//  396  740:iload           4
	//  397  742:istore_2        
			} else
	//* 398  743:goto            756
			{
				menuitemimpl1.setIsActionButton(false);
	//  399  746:aload           19
	//  400  748:iconst_0        
	//  401  749:invokevirtual   #240 <Method void MenuItemImpl.setIsActionButton(boolean)>
				j3 = k3;
	//  402  752:iload           7
	//  403  754:istore          6
			}
			j4++;
	//  404  756:iload           10
	//  405  758:iconst_1        
	//  406  759:iadd            
	//  407  760:istore          10
			k3 = j3;
	//  408  762:iload           6
	//  409  764:istore          7
		}
	//* 410  766:goto            247
		return true;
	//  411  769:iconst_1        
	//  412  770:ireturn         
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
	//*  15   28:invokevirtual   #201 <Method boolean MenuItemImpl.isActionViewExpanded()>
	//*  16   31:ifeq            41
			byte0 = 8;
	//   17   34:bipush          8
	//   18   36:istore          4
		else
	//*  19   38:goto            44
			byte0 = 0;
	//   20   41:iconst_0        
	//   21   42:istore          4
		view1.setVisibility(((int) (byte0)));
	//   22   44:aload           5
	//   23   46:iload           4
	//   24   48:invokevirtual   #258 <Method void View.setVisibility(int)>
		menuitemimpl = ((MenuItemImpl) ((ActionMenuView)viewgroup));
	//   25   51:aload_3         
	//   26   52:checkcast       #135 <Class ActionMenuView>
	//   27   55:astore_1        
		view = ((View) (view1.getLayoutParams()));
	//   28   56:aload           5
	//   29   58:invokevirtual   #262 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   30   61:astore_2        
		if(!((ActionMenuView) (menuitemimpl)).checkLayoutParams(((android.view.ViewGroup.LayoutParams) (view))))
	//*  31   62:aload_1         
	//*  32   63:aload_2         
	//*  33   64:invokevirtual   #266 <Method boolean ActionMenuView.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  34   67:ifne            80
			view1.setLayoutParams(((android.view.ViewGroup.LayoutParams) (((ActionMenuView) (menuitemimpl)).generateLayoutParams(((android.view.ViewGroup.LayoutParams) (view))))));
	//   35   70:aload           5
	//   36   72:aload_1         
	//   37   73:aload_2         
	//   38   74:invokevirtual   #270 <Method ActionMenuView$LayoutParams ActionMenuView.generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   39   77:invokevirtual   #274 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		return view1;
	//   40   80:aload           5
	//   41   82:areturn         
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
	//*  36   70:ifeq            155
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
	//*  77  152:goto            160
		{
			mOverflowButton = null;
	//   78  155:aload_0         
	//   79  156:aconst_null     
	//   80  157:putfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
		}
		mActionItemWidthLimit = i;
	//   81  160:aload_0         
	//   82  161:iload_3         
	//   83  162:putfield        #178 <Field int mActionItemWidthLimit>
		mMinCellSize = (int)(((Resources) (menubuilder)).getDisplayMetrics().density * 56F);
	//   84  165:aload_0         
	//   85  166:aload_2         
	//   86  167:invokevirtual   #359 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   87  170:getfield        #365 <Field float DisplayMetrics.density>
	//   88  173:ldc2            #366 <Float 56F>
	//   89  176:fmul            
	//   90  177:f2i             
	//   91  178:putfield        #210 <Field int mMinCellSize>
		mScrapActionButtonView = null;
	//   92  181:aload_0         
	//   93  182:aconst_null     
	//   94  183:putfield        #212 <Field View mScrapActionButtonView>
	//   95  186:return          
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
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #28  <Class ActionMenuPresenter$SavedState>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    4    8:aload_1         
	//    5    9:checkcast       #28  <Class ActionMenuPresenter$SavedState>
	//    6   12:astore_1        
		if(((SavedState) (parcelable)).openSubMenuId > 0)
	//*   7   13:aload_1         
	//*   8   14:getfield        #394 <Field int ActionMenuPresenter$SavedState.openSubMenuId>
	//*   9   17:ifle            50
		{
			parcelable = ((Parcelable) (mMenu.findItem(((SavedState) (parcelable)).openSubMenuId)));
	//   10   20:aload_0         
	//   11   21:getfield        #99  <Field MenuBuilder mMenu>
	//   12   24:aload_1         
	//   13   25:getfield        #394 <Field int ActionMenuPresenter$SavedState.openSubMenuId>
	//   14   28:invokevirtual   #398 <Method MenuItem MenuBuilder.findItem(int)>
	//   15   31:astore_1        
			if(parcelable != null)
	//*  16   32:aload_1         
	//*  17   33:ifnull          50
				onSubMenuSelected((SubMenuBuilder)((MenuItem) (parcelable)).getSubMenu());
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokeinterface #404 <Method android.view.SubMenu MenuItem.getSubMenu()>
	//   21   43:checkcast       #406 <Class SubMenuBuilder>
	//   22   46:invokevirtual   #410 <Method boolean onSubMenuSelected(SubMenuBuilder)>
	//   23   49:pop             
		}
	//   24   50:return          
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
		if(!submenubuilder.hasVisibleItems())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #418 <Method boolean SubMenuBuilder.hasVisibleItems()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
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
		if(obj == null)
	//*  22   48:aload           6
	//*  23   50:ifnonnull       55
			return false;
	//   24   53:iconst_0        
	//   25   54:ireturn         
		mOpenSubMenuId = submenubuilder.getItem().getItemId();
	//   26   55:aload_0         
	//   27   56:aload_1         
	//   28   57:invokevirtual   #426 <Method MenuItem SubMenuBuilder.getItem()>
	//   29   60:invokeinterface #431 <Method int MenuItem.getItemId()>
	//   30   65:putfield        #415 <Field int mOpenSubMenuId>
		boolean flag1 = false;
	//   31   68:iconst_0        
	//   32   69:istore          5
		int j = submenubuilder.size();
	//   33   71:aload_1         
	//   34   72:invokevirtual   #432 <Method int SubMenuBuilder.size()>
	//   35   75:istore_3        
		int i = 0;
	//   36   76:iconst_0        
	//   37   77:istore_2        
		boolean flag;
		do
		{
			flag = flag1;
	//   38   78:iload           5
	//   39   80:istore          4
			if(i >= j)
				break;
	//   40   82:iload_2         
	//   41   83:iload_3         
	//   42   84:icmpge          127
			MenuItem menuitem = submenubuilder.getItem(i);
	//   43   87:aload_1         
	//   44   88:iload_2         
	//   45   89:invokevirtual   #434 <Method MenuItem SubMenuBuilder.getItem(int)>
	//   46   92:astore          7
			if(menuitem.isVisible() && menuitem.getIcon() != null)
	//*  47   94:aload           7
	//*  48   96:invokeinterface #437 <Method boolean MenuItem.isVisible()>
	//*  49  101:ifeq            120
	//*  50  104:aload           7
	//*  51  106:invokeinterface #440 <Method Drawable MenuItem.getIcon()>
	//*  52  111:ifnull          120
			{
				flag = true;
	//   53  114:iconst_1        
	//   54  115:istore          4
				break;
	//   55  117:goto            127
			}
			i++;
	//   56  120:iload_2         
	//   57  121:iconst_1        
	//   58  122:iadd            
	//   59  123:istore_2        
		} while(true);
	//   60  124:goto            78
		mActionButtonPopup = new ((ActionButtonSubmenu)this).ActionButtonSubmenu(mContext, submenubuilder, ((View) (obj)));
	//   61  127:aload_0         
	//   62  128:new             #8   <Class ActionMenuPresenter$ActionButtonSubmenu>
	//   63  131:dup             
	//   64  132:aload_0         
	//   65  133:aload_0         
	//   66  134:getfield        #386 <Field Context mContext>
	//   67  137:aload_1         
	//   68  138:aload           6
	//   69  140:invokespecial   #443 <Method void ActionMenuPresenter$ActionButtonSubmenu(ActionMenuPresenter, Context, SubMenuBuilder, View)>
	//   70  143:putfield        #305 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
		mActionButtonPopup.setForceShowIcon(flag);
	//   71  146:aload_0         
	//   72  147:getfield        #305 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
	//   73  150:iload           4
	//   74  152:invokevirtual   #446 <Method void ActionMenuPresenter$ActionButtonSubmenu.setForceShowIcon(boolean)>
		mActionButtonPopup.show();
	//   75  155:aload_0         
	//   76  156:getfield        #305 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
	//   77  159:invokevirtual   #449 <Method void ActionMenuPresenter$ActionButtonSubmenu.show()>
		((BaseMenuPresenter)this).onSubMenuSelected(submenubuilder);
	//   78  162:aload_0         
	//   79  163:aload_1         
	//   80  164:invokespecial   #450 <Method boolean BaseMenuPresenter.onSubMenuSelected(SubMenuBuilder)>
	//   81  167:pop             
		return true;
	//   82  168:iconst_1        
	//   83  169:ireturn         
	}

	public void onSubUiVisibilityChanged(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
		{
			((BaseMenuPresenter)this).onSubMenuSelected(((SubMenuBuilder) (null)));
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #450 <Method boolean BaseMenuPresenter.onSubMenuSelected(SubMenuBuilder)>
	//    5    9:pop             
			return;
	//    6   10:return          
		}
		if(mMenu != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #99  <Field MenuBuilder mMenu>
	//*   9   15:ifnull          26
			mMenu.close(false);
	//   10   18:aload_0         
	//   11   19:getfield        #99  <Field MenuBuilder mMenu>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #454 <Method void MenuBuilder.close(boolean)>
	//   14   26:return          
	}

	public void setExpandedActionViewsExclusive(boolean flag)
	{
		mExpandedActionViewsExclusive = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #198 <Field boolean mExpandedActionViewsExclusive>
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
		Object obj = ((Object) ((ViewGroup)((View)mMenuView).getParent()));
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field MenuView mMenuView>
	//    2    4:checkcast       #222 <Class View>
	//    3    7:invokevirtual   #487 <Method android.view.ViewParent View.getParent()>
	//    4   10:checkcast       #113 <Class ViewGroup>
	//    5   13:astore          4
		if(obj != null)
	//*   6   15:aload           4
	//*   7   17:ifnull          25
			ActionBarTransition.beginDelayedTransition(((ViewGroup) (obj)));
	//    8   20:aload           4
	//    9   22:invokestatic    #493 <Method void ActionBarTransition.beginDelayedTransition(ViewGroup)>
		((BaseMenuPresenter)this).updateMenuView(flag);
	//   10   25:aload_0         
	//   11   26:iload_1         
	//   12   27:invokespecial   #495 <Method void BaseMenuPresenter.updateMenuView(boolean)>
		((View)mMenuView).requestLayout();
	//   13   30:aload_0         
	//   14   31:getfield        #106 <Field MenuView mMenuView>
	//   15   34:checkcast       #222 <Class View>
	//   16   37:invokevirtual   #498 <Method void View.requestLayout()>
		if(mMenu != null)
	//*  17   40:aload_0         
	//*  18   41:getfield        #99  <Field MenuBuilder mMenu>
	//*  19   44:ifnull          101
		{
			obj = ((Object) (mMenu.getActionItems()));
	//   20   47:aload_0         
	//   21   48:getfield        #99  <Field MenuBuilder mMenu>
	//   22   51:invokevirtual   #501 <Method ArrayList MenuBuilder.getActionItems()>
	//   23   54:astore          4
			int k = ((ArrayList) (obj)).size();
	//   24   56:aload           4
	//   25   58:invokevirtual   #174 <Method int ArrayList.size()>
	//   26   61:istore_3        
			for(int i = 0; i < k; i++)
	//*  27   62:iconst_0        
	//*  28   63:istore_2        
	//*  29   64:iload_2         
	//*  30   65:iload_3         
	//*  31   66:icmpge          101
			{
				ActionProvider actionprovider = ((MenuItemImpl)((ArrayList) (obj)).get(i)).getSupportActionProvider();
	//   32   69:aload           4
	//   33   71:iload_2         
	//   34   72:invokevirtual   #188 <Method Object ArrayList.get(int)>
	//   35   75:checkcast       #190 <Class MenuItemImpl>
	//   36   78:invokevirtual   #505 <Method ActionProvider MenuItemImpl.getSupportActionProvider()>
	//   37   81:astore          5
				if(actionprovider != null)
	//*  38   83:aload           5
	//*  39   85:ifnull          94
					actionprovider.setSubUiVisibilityListener(((android.support.v4.view.ActionProvider.SubUiVisibilityListener) (this)));
	//   40   88:aload           5
	//   41   90:aload_0         
	//   42   91:invokevirtual   #511 <Method void ActionProvider.setSubUiVisibilityListener(android.support.v4.view.ActionProvider$SubUiVisibilityListener)>
			}

	//   43   94:iload_2         
	//   44   95:iconst_1        
	//   45   96:iadd            
	//   46   97:istore_2        
		}
	//*  47   98:goto            64
		if(mMenu != null)
	//*  48  101:aload_0         
	//*  49  102:getfield        #99  <Field MenuBuilder mMenu>
	//*  50  105:ifnull          120
			obj = ((Object) (mMenu.getNonActionItems()));
	//   51  108:aload_0         
	//   52  109:getfield        #99  <Field MenuBuilder mMenu>
	//   53  112:invokevirtual   #470 <Method ArrayList MenuBuilder.getNonActionItems()>
	//   54  115:astore          4
		else
	//*  55  117:goto            123
			obj = null;
	//   56  120:aconst_null     
	//   57  121:astore          4
		boolean flag1 = false;
	//   58  123:iconst_0        
	//   59  124:istore_3        
		int j = ((int) (flag1));
	//   60  125:iload_3         
	//   61  126:istore_2        
		if(mReserveOverflow)
	//*  62  127:aload_0         
	//*  63  128:getfield        #203 <Field boolean mReserveOverflow>
	//*  64  131:ifeq            188
		{
			j = ((int) (flag1));
	//   65  134:iload_3         
	//   66  135:istore_2        
			if(obj != null)
	//*  67  136:aload           4
	//*  68  138:ifnull          188
			{
				j = ((ArrayList) (obj)).size();
	//   69  141:aload           4
	//   70  143:invokevirtual   #174 <Method int ArrayList.size()>
	//   71  146:istore_2        
				if(j == 1)
	//*  72  147:iload_2         
	//*  73  148:iconst_1        
	//*  74  149:icmpne          177
				{
					if(!((MenuItemImpl)((ArrayList) (obj)).get(0)).isActionViewExpanded())
	//*  75  152:aload           4
	//*  76  154:iconst_0        
	//*  77  155:invokevirtual   #188 <Method Object ArrayList.get(int)>
	//*  78  158:checkcast       #190 <Class MenuItemImpl>
	//*  79  161:invokevirtual   #201 <Method boolean MenuItemImpl.isActionViewExpanded()>
	//*  80  164:ifne            172
						j = 1;
	//   81  167:iconst_1        
	//   82  168:istore_2        
					else
	//*  83  169:goto            174
						j = 0;
	//   84  172:iconst_0        
	//   85  173:istore_2        
				} else
	//*  86  174:goto            188
				if(j > 0)
	//*  87  177:iload_2         
	//*  88  178:ifle            186
					j = 1;
	//   89  181:iconst_1        
	//   90  182:istore_2        
				else
	//*  91  183:goto            188
					j = 0;
	//   92  186:iconst_0        
	//   93  187:istore_2        
			}
		}
		if(j != 0)
	//*  94  188:iload_2         
	//*  95  189:ifeq            276
		{
			if(mOverflowButton == null)
	//*  96  192:aload_0         
	//*  97  193:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*  98  196:ifnonnull       215
				mOverflowButton = new ((OverflowMenuButton)this).OverflowMenuButton(mSystemContext);
	//   99  199:aload_0         
	//  100  200:new             #17  <Class ActionMenuPresenter$OverflowMenuButton>
	//  101  203:dup             
	//  102  204:aload_0         
	//  103  205:aload_0         
	//  104  206:getfield        #344 <Field Context mSystemContext>
	//  105  209:invokespecial   #347 <Method void ActionMenuPresenter$OverflowMenuButton(ActionMenuPresenter, Context)>
	//  106  212:putfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
			Object obj1 = ((Object) ((ViewGroup)mOverflowButton.getParent()));
	//  107  215:aload_0         
	//  108  216:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//  109  219:invokevirtual   #512 <Method android.view.ViewParent ActionMenuPresenter$OverflowMenuButton.getParent()>
	//  110  222:checkcast       #113 <Class ViewGroup>
	//  111  225:astore          4
			if(obj1 != mMenuView)
	//* 112  227:aload           4
	//* 113  229:aload_0         
	//* 114  230:getfield        #106 <Field MenuView mMenuView>
	//* 115  233:if_acmpeq       273
			{
				if(obj1 != null)
	//* 116  236:aload           4
	//* 117  238:ifnull          250
					((ViewGroup) (obj1)).removeView(((View) (mOverflowButton)));
	//  118  241:aload           4
	//  119  243:aload_0         
	//  120  244:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//  121  247:invokevirtual   #516 <Method void ViewGroup.removeView(View)>
				obj1 = ((Object) ((ActionMenuView)mMenuView));
	//  122  250:aload_0         
	//  123  251:getfield        #106 <Field MenuView mMenuView>
	//  124  254:checkcast       #135 <Class ActionMenuView>
	//  125  257:astore          4
				((ActionMenuView) (obj1)).addView(((View) (mOverflowButton)), ((android.view.ViewGroup.LayoutParams) (((ActionMenuView) (obj1)).generateOverflowButtonLayoutParams())));
	//  126  259:aload           4
	//  127  261:aload_0         
	//  128  262:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//  129  265:aload           4
	//  130  267:invokevirtual   #520 <Method ActionMenuView$LayoutParams ActionMenuView.generateOverflowButtonLayoutParams()>
	//  131  270:invokevirtual   #524 <Method void ActionMenuView.addView(View, android.view.ViewGroup$LayoutParams)>
			}
		} else
	//* 132  273:goto            311
		if(mOverflowButton != null && mOverflowButton.getParent() == mMenuView)
	//* 133  276:aload_0         
	//* 134  277:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//* 135  280:ifnull          311
	//* 136  283:aload_0         
	//* 137  284:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//* 138  287:invokevirtual   #512 <Method android.view.ViewParent ActionMenuPresenter$OverflowMenuButton.getParent()>
	//* 139  290:aload_0         
	//* 140  291:getfield        #106 <Field MenuView mMenuView>
	//* 141  294:if_acmpne       311
			((ViewGroup)mMenuView).removeView(((View) (mOverflowButton)));
	//  142  297:aload_0         
	//  143  298:getfield        #106 <Field MenuView mMenuView>
	//  144  301:checkcast       #113 <Class ViewGroup>
	//  145  304:aload_0         
	//  146  305:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//  147  308:invokevirtual   #516 <Method void ViewGroup.removeView(View)>
		((ActionMenuView)mMenuView).setOverflowReserved(mReserveOverflow);
	//  148  311:aload_0         
	//  149  312:getfield        #106 <Field MenuView mMenuView>
	//  150  315:checkcast       #135 <Class ActionMenuView>
	//  151  318:aload_0         
	//  152  319:getfield        #203 <Field boolean mReserveOverflow>
	//  153  322:invokevirtual   #527 <Method void ActionMenuView.setOverflowReserved(boolean)>
	//  154  325:return          
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
