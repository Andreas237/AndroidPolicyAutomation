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
			boolean flag = false;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			if(menubuilder == null)
		//*   2    2:aload_1         
		//*   3    3:ifnonnull       8
				return false;
		//    4    6:iconst_0        
		//    5    7:ireturn         
			mOpenSubMenuId = ((SubMenuBuilder)menubuilder).getItem().getItemId();
		//    6    8:aload_0         
		//    7    9:getfield        #15  <Field ActionMenuPresenter this$0>
		//    8   12:aload_1         
		//    9   13:checkcast       #23  <Class SubMenuBuilder>
		//   10   16:invokevirtual   #45  <Method MenuItem SubMenuBuilder.getItem()>
		//   11   19:invokeinterface #51  <Method int MenuItem.getItemId()>
		//   12   24:putfield        #55  <Field int ActionMenuPresenter.mOpenSubMenuId>
			android.support.v7.view.menu.MenuPresenter.Callback callback = getCallback();
		//   13   27:aload_0         
		//   14   28:getfield        #15  <Field ActionMenuPresenter this$0>
		//   15   31:invokevirtual   #37  <Method android.support.v7.view.menu.MenuPresenter$Callback ActionMenuPresenter.getCallback()>
		//   16   34:astore_3        
			if(callback != null)
		//*  17   35:aload_3         
		//*  18   36:ifnull          47
				flag = callback.onOpenSubMenu(menubuilder);
		//   19   39:aload_3         
		//   20   40:aload_1         
		//   21   41:invokeinterface #57  <Method boolean android.support.v7.view.menu.MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
		//   22   46:istore_2        
			return flag;
		//   23   47:iload_2         
		//   24   48:ireturn         
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
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #165 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #167 <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #172 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public View getItemView(MenuItemImpl menuitemimpl, View view, ViewGroup viewgroup)
	{
		View view1 = menuitemimpl.getActionView();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #180 <Method View MenuItemImpl.getActionView()>
	//    2    4:astore          5
		if(view1 == null || menuitemimpl.hasCollapsibleActionView())
	//*   3    6:aload           5
	//*   4    8:ifnull          18
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #183 <Method boolean MenuItemImpl.hasCollapsibleActionView()>
	//*   7   15:ifeq            27
			view1 = ((BaseMenuPresenter)this).getItemView(menuitemimpl, view, viewgroup);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokespecial   #185 <Method View BaseMenuPresenter.getItemView(MenuItemImpl, View, ViewGroup)>
	//   13   25:astore          5
		byte byte0;
		if(menuitemimpl.isActionViewExpanded())
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #188 <Method boolean MenuItemImpl.isActionViewExpanded()>
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
	//   24   48:invokevirtual   #194 <Method void View.setVisibility(int)>
		menuitemimpl = ((MenuItemImpl) ((ActionMenuView)viewgroup));
	//   25   51:aload_3         
	//   26   52:checkcast       #135 <Class ActionMenuView>
	//   27   55:astore_1        
		view = ((View) (view1.getLayoutParams()));
	//   28   56:aload           5
	//   29   58:invokevirtual   #198 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   30   61:astore_2        
		if(!((ActionMenuView) (menuitemimpl)).checkLayoutParams(((android.view.ViewGroup.LayoutParams) (view))))
	//*  31   62:aload_1         
	//*  32   63:aload_2         
	//*  33   64:invokevirtual   #202 <Method boolean ActionMenuView.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  34   67:ifne            80
			view1.setLayoutParams(((android.view.ViewGroup.LayoutParams) (((ActionMenuView) (menuitemimpl)).generateLayoutParams(((android.view.ViewGroup.LayoutParams) (view))))));
	//   35   70:aload           5
	//   36   72:aload_1         
	//   37   73:aload_2         
	//   38   74:invokevirtual   #206 <Method ActionMenuView$LayoutParams ActionMenuView.generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   39   77:invokevirtual   #210 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
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
	//    5    7:invokespecial   #214 <Method MenuView BaseMenuPresenter.getMenuView(ViewGroup)>
	//    6   10:astore_1        
		if(menuview != viewgroup)
	//*   7   11:aload_2         
	//*   8   12:aload_1         
	//*   9   13:if_acmpeq       24
			((ActionMenuView)viewgroup).setPresenter(this);
	//   10   16:aload_1         
	//   11   17:checkcast       #135 <Class ActionMenuView>
	//   12   20:aload_0         
	//   13   21:invokevirtual   #217 <Method void ActionMenuView.setPresenter(ActionMenuPresenter)>
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
	//    5   11:invokevirtual   #222 <Method Drawable ActionMenuPresenter$OverflowMenuButton.getDrawable()>
	//    6   14:areturn         
		if(mPendingOverflowIconSet)
	//*   7   15:aload_0         
	//*   8   16:getfield        #224 <Field boolean mPendingOverflowIconSet>
	//*   9   19:ifeq            27
			return mPendingOverflowIcon;
	//   10   22:aload_0         
	//   11   23:getfield        #226 <Field Drawable mPendingOverflowIcon>
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
	//*   1    1:getfield        #228 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
	//*   2    4:ifnull          36
	//*   3    7:aload_0         
	//*   4    8:getfield        #106 <Field MenuView mMenuView>
	//*   5   11:ifnull          36
		{
			((View)mMenuView).removeCallbacks(((Runnable) (mPostedOpenRunnable)));
	//    6   14:aload_0         
	//    7   15:getfield        #106 <Field MenuView mMenuView>
	//    8   18:checkcast       #190 <Class View>
	//    9   21:aload_0         
	//   10   22:getfield        #228 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
	//   11   25:invokevirtual   #232 <Method boolean View.removeCallbacks(Runnable)>
	//   12   28:pop             
			mPostedOpenRunnable = null;
	//   13   29:aload_0         
	//   14   30:aconst_null     
	//   15   31:putfield        #228 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
			return true;
	//   16   34:iconst_1        
	//   17   35:ireturn         
		}
		OverflowPopup overflowpopup = mOverflowPopup;
	//   18   36:aload_0         
	//   19   37:getfield        #234 <Field ActionMenuPresenter$OverflowPopup mOverflowPopup>
	//   20   40:astore_1        
		if(overflowpopup != null)
	//*  21   41:aload_1         
	//*  22   42:ifnull          51
		{
			((MenuPopupHelper) (overflowpopup)).dismiss();
	//   23   45:aload_1         
	//   24   46:invokevirtual   #239 <Method void MenuPopupHelper.dismiss()>
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
	//*   1    1:getfield        #241 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
	//*   2    4:ifnull          16
		{
			mActionButtonPopup.dismiss();
	//    3    7:aload_0         
	//    4    8:getfield        #241 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
	//    5   11:invokevirtual   #242 <Method void ActionMenuPresenter$ActionButtonSubmenu.dismiss()>
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
	//    3    3:invokespecial   #248 <Method void BaseMenuPresenter.initForMenu(Context, MenuBuilder)>
		menubuilder = ((MenuBuilder) (context.getResources()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #254 <Method Resources Context.getResources()>
	//    6   10:astore_2        
		context = ((Context) (ActionBarPolicy.get(context)));
	//    7   11:aload_1         
	//    8   12:invokestatic    #260 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//    9   15:astore_1        
		if(!mReserveOverflowSet)
	//*  10   16:aload_0         
	//*  11   17:getfield        #262 <Field boolean mReserveOverflowSet>
	//*  12   20:ifne            31
			mReserveOverflow = ((ActionBarPolicy) (context)).showsOverflowMenuButton();
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #265 <Method boolean ActionBarPolicy.showsOverflowMenuButton()>
	//   16   28:putfield        #267 <Field boolean mReserveOverflow>
		if(!mWidthLimitSet)
	//*  17   31:aload_0         
	//*  18   32:getfield        #269 <Field boolean mWidthLimitSet>
	//*  19   35:ifne            46
			mWidthLimit = ((ActionBarPolicy) (context)).getEmbeddedMenuWidthLimit();
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #272 <Method int ActionBarPolicy.getEmbeddedMenuWidthLimit()>
	//   23   43:putfield        #274 <Field int mWidthLimit>
		if(!mMaxItemsSet)
	//*  24   46:aload_0         
	//*  25   47:getfield        #276 <Field boolean mMaxItemsSet>
	//*  26   50:ifne            61
			mMaxItems = ((ActionBarPolicy) (context)).getMaxActionButtons();
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #279 <Method int ActionBarPolicy.getMaxActionButtons()>
	//   30   58:putfield        #281 <Field int mMaxItems>
		int i = mWidthLimit;
	//   31   61:aload_0         
	//   32   62:getfield        #274 <Field int mWidthLimit>
	//   33   65:istore_3        
		if(mReserveOverflow)
	//*  34   66:aload_0         
	//*  35   67:getfield        #267 <Field boolean mReserveOverflow>
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
	//   45   87:getfield        #285 <Field Context mSystemContext>
	//   46   90:invokespecial   #288 <Method void ActionMenuPresenter$OverflowMenuButton(ActionMenuPresenter, Context)>
	//   47   93:putfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
				if(mPendingOverflowIconSet)
	//*  48   96:aload_0         
	//*  49   97:getfield        #224 <Field boolean mPendingOverflowIconSet>
	//*  50  100:ifeq            124
				{
					mOverflowButton.setImageDrawable(mPendingOverflowIcon);
	//   51  103:aload_0         
	//   52  104:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//   53  107:aload_0         
	//   54  108:getfield        #226 <Field Drawable mPendingOverflowIcon>
	//   55  111:invokevirtual   #292 <Method void ActionMenuPresenter$OverflowMenuButton.setImageDrawable(Drawable)>
					mPendingOverflowIcon = null;
	//   56  114:aload_0         
	//   57  115:aconst_null     
	//   58  116:putfield        #226 <Field Drawable mPendingOverflowIcon>
					mPendingOverflowIconSet = false;
	//   59  119:aload_0         
	//   60  120:iconst_0        
	//   61  121:putfield        #224 <Field boolean mPendingOverflowIconSet>
				}
				int j = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   62  124:iconst_0        
	//   63  125:iconst_0        
	//   64  126:invokestatic    #298 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   65  129:istore          4
				mOverflowButton.measure(j, j);
	//   66  131:aload_0         
	//   67  132:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//   68  135:iload           4
	//   69  137:iload           4
	//   70  139:invokevirtual   #302 <Method void ActionMenuPresenter$OverflowMenuButton.measure(int, int)>
			}
			i -= mOverflowButton.getMeasuredWidth();
	//   71  142:iload_3         
	//   72  143:aload_0         
	//   73  144:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//   74  147:invokevirtual   #305 <Method int ActionMenuPresenter$OverflowMenuButton.getMeasuredWidth()>
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
	//   83  162:putfield        #307 <Field int mActionItemWidthLimit>
		mMinCellSize = (int)(56F * ((Resources) (menubuilder)).getDisplayMetrics().density);
	//   84  165:aload_0         
	//   85  166:ldc2            #308 <Float 56F>
	//   86  169:aload_2         
	//   87  170:invokevirtual   #314 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   88  173:getfield        #320 <Field float DisplayMetrics.density>
	//   89  176:fmul            
	//   90  177:f2i             
	//   91  178:putfield        #322 <Field int mMinCellSize>
		mScrapActionButtonView = null;
	//   92  181:aload_0         
	//   93  182:aconst_null     
	//   94  183:putfield        #324 <Field View mScrapActionButtonView>
	//   95  186:return          
	}

	public boolean isOverflowMenuShowPending()
	{
		return mPostedOpenRunnable != null || isOverflowMenuShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
	//    2    4:ifnonnull       19
	//    3    7:aload_0         
	//    4    8:invokevirtual   #329 <Method boolean isOverflowMenuShowing()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public boolean isOverflowMenuShowing()
	{
		return mOverflowPopup != null && mOverflowPopup.isShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field ActionMenuPresenter$OverflowPopup mOverflowPopup>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #234 <Field ActionMenuPresenter$OverflowPopup mOverflowPopup>
	//    5   11:invokevirtual   #332 <Method boolean ActionMenuPresenter$OverflowPopup.isShowing()>
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
	//    1    1:getfield        #267 <Field boolean mReserveOverflow>
	//    2    4:ireturn         
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		dismissPopupMenus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #337 <Method boolean dismissPopupMenus()>
	//    2    4:pop             
		((BaseMenuPresenter)this).onCloseMenu(menubuilder, flag);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #339 <Method void BaseMenuPresenter.onCloseMenu(MenuBuilder, boolean)>
	//    7   11:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		if(!mMaxItemsSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #276 <Field boolean mMaxItemsSet>
	//*   2    4:ifne            21
			mMaxItems = ActionBarPolicy.get(mContext).getMaxActionButtons();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #344 <Field Context mContext>
	//    6   12:invokestatic    #260 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//    7   15:invokevirtual   #279 <Method int ActionBarPolicy.getMaxActionButtons()>
	//    8   18:putfield        #281 <Field int mMaxItems>
		if(mMenu != null)
	//*   9   21:aload_0         
	//*  10   22:getfield        #99  <Field MenuBuilder mMenu>
	//*  11   25:ifnull          36
			mMenu.onItemsChanged(true);
	//   12   28:aload_0         
	//   13   29:getfield        #99  <Field MenuBuilder mMenu>
	//   14   32:iconst_1        
	//   15   33:invokevirtual   #350 <Method void MenuBuilder.onItemsChanged(boolean)>
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
	//*   8   14:getfield        #355 <Field int ActionMenuPresenter$SavedState.openSubMenuId>
	//*   9   17:ifle            50
		{
			parcelable = ((Parcelable) (mMenu.findItem(((SavedState) (parcelable)).openSubMenuId)));
	//   10   20:aload_0         
	//   11   21:getfield        #99  <Field MenuBuilder mMenu>
	//   12   24:aload_1         
	//   13   25:getfield        #355 <Field int ActionMenuPresenter$SavedState.openSubMenuId>
	//   14   28:invokevirtual   #359 <Method MenuItem MenuBuilder.findItem(int)>
	//   15   31:astore_1        
			if(parcelable != null)
	//*  16   32:aload_1         
	//*  17   33:ifnull          50
				onSubMenuSelected((SubMenuBuilder)((MenuItem) (parcelable)).getSubMenu());
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokeinterface #365 <Method android.view.SubMenu MenuItem.getSubMenu()>
	//   21   43:checkcast       #367 <Class SubMenuBuilder>
	//   22   46:invokevirtual   #371 <Method boolean onSubMenuSelected(SubMenuBuilder)>
	//   23   49:pop             
		}
	//   24   50:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState();
	//    0    0:new             #28  <Class ActionMenuPresenter$SavedState>
	//    1    3:dup             
	//    2    4:invokespecial   #374 <Method void ActionMenuPresenter$SavedState()>
	//    3    7:astore_1        
		savedstate.openSubMenuId = mOpenSubMenuId;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #376 <Field int mOpenSubMenuId>
	//    7   13:putfield        #355 <Field int ActionMenuPresenter$SavedState.openSubMenuId>
		return ((Parcelable) (savedstate));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
	{
		boolean flag = submenubuilder.hasVisibleItems();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #379 <Method boolean SubMenuBuilder.hasVisibleItems()>
	//    2    4:istore          4
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		if(!flag)
	//*   5    9:iload           4
	//*   6   11:ifne            16
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
		Object obj;
		for(obj = ((Object) (submenubuilder)); ((SubMenuBuilder) (obj)).getParentMenu() != mMenu; obj = ((Object) ((SubMenuBuilder)((SubMenuBuilder) (obj)).getParentMenu())));
	//    9   16:aload_1         
	//   10   17:astore          6
	//   11   19:aload           6
	//   12   21:invokevirtual   #383 <Method android.view.Menu SubMenuBuilder.getParentMenu()>
	//   13   24:aload_0         
	//   14   25:getfield        #99  <Field MenuBuilder mMenu>
	//   15   28:if_acmpeq       44
	//   16   31:aload           6
	//   17   33:invokevirtual   #383 <Method android.view.Menu SubMenuBuilder.getParentMenu()>
	//   18   36:checkcast       #367 <Class SubMenuBuilder>
	//   19   39:astore          6
	//*  20   41:goto            19
		obj = ((Object) (findViewForItem(((SubMenuBuilder) (obj)).getItem())));
	//   21   44:aload_0         
	//   22   45:aload           6
	//   23   47:invokevirtual   #387 <Method MenuItem SubMenuBuilder.getItem()>
	//   24   50:invokespecial   #389 <Method View findViewForItem(MenuItem)>
	//   25   53:astore          6
		if(obj == null)
	//*  26   55:aload           6
	//*  27   57:ifnonnull       62
			return false;
	//   28   60:iconst_0        
	//   29   61:ireturn         
		mOpenSubMenuId = submenubuilder.getItem().getItemId();
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:invokevirtual   #387 <Method MenuItem SubMenuBuilder.getItem()>
	//   33   67:invokeinterface #392 <Method int MenuItem.getItemId()>
	//   34   72:putfield        #376 <Field int mOpenSubMenuId>
		int j = submenubuilder.size();
	//   35   75:aload_1         
	//   36   76:invokevirtual   #395 <Method int SubMenuBuilder.size()>
	//   37   79:istore_3        
		int i = 0;
	//   38   80:iconst_0        
	//   39   81:istore_2        
		do
		{
			flag = flag1;
	//   40   82:iload           5
	//   41   84:istore          4
			if(i >= j)
				break;
	//   42   86:iload_2         
	//   43   87:iload_3         
	//   44   88:icmpge          131
			MenuItem menuitem = submenubuilder.getItem(i);
	//   45   91:aload_1         
	//   46   92:iload_2         
	//   47   93:invokevirtual   #397 <Method MenuItem SubMenuBuilder.getItem(int)>
	//   48   96:astore          7
			if(menuitem.isVisible() && menuitem.getIcon() != null)
	//*  49   98:aload           7
	//*  50  100:invokeinterface #400 <Method boolean MenuItem.isVisible()>
	//*  51  105:ifeq            124
	//*  52  108:aload           7
	//*  53  110:invokeinterface #403 <Method Drawable MenuItem.getIcon()>
	//*  54  115:ifnull          124
			{
				flag = true;
	//   55  118:iconst_1        
	//   56  119:istore          4
				break;
	//   57  121:goto            131
			}
			i++;
	//   58  124:iload_2         
	//   59  125:iconst_1        
	//   60  126:iadd            
	//   61  127:istore_2        
		} while(true);
	//   62  128:goto            82
		mActionButtonPopup = new ((ActionButtonSubmenu)this).ActionButtonSubmenu(mContext, submenubuilder, ((View) (obj)));
	//   63  131:aload_0         
	//   64  132:new             #8   <Class ActionMenuPresenter$ActionButtonSubmenu>
	//   65  135:dup             
	//   66  136:aload_0         
	//   67  137:aload_0         
	//   68  138:getfield        #344 <Field Context mContext>
	//   69  141:aload_1         
	//   70  142:aload           6
	//   71  144:invokespecial   #406 <Method void ActionMenuPresenter$ActionButtonSubmenu(ActionMenuPresenter, Context, SubMenuBuilder, View)>
	//   72  147:putfield        #241 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
		mActionButtonPopup.setForceShowIcon(flag);
	//   73  150:aload_0         
	//   74  151:getfield        #241 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
	//   75  154:iload           4
	//   76  156:invokevirtual   #409 <Method void ActionMenuPresenter$ActionButtonSubmenu.setForceShowIcon(boolean)>
		mActionButtonPopup.show();
	//   77  159:aload_0         
	//   78  160:getfield        #241 <Field ActionMenuPresenter$ActionButtonSubmenu mActionButtonPopup>
	//   79  163:invokevirtual   #412 <Method void ActionMenuPresenter$ActionButtonSubmenu.show()>
		((BaseMenuPresenter)this).onSubMenuSelected(submenubuilder);
	//   80  166:aload_0         
	//   81  167:aload_1         
	//   82  168:invokespecial   #413 <Method boolean BaseMenuPresenter.onSubMenuSelected(SubMenuBuilder)>
	//   83  171:pop             
		return true;
	//   84  172:iconst_1        
	//   85  173:ireturn         
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
	//    4    6:invokespecial   #413 <Method boolean BaseMenuPresenter.onSubMenuSelected(SubMenuBuilder)>
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
	//   13   23:invokevirtual   #417 <Method void MenuBuilder.close(boolean)>
	//   14   26:return          
	}

	public void setExpandedActionViewsExclusive(boolean flag)
	{
		mExpandedActionViewsExclusive = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #420 <Field boolean mExpandedActionViewsExclusive>
	//    3    5:return          
	}

	public void setItemLimit(int i)
	{
		mMaxItems = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #281 <Field int mMaxItems>
		mMaxItemsSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #276 <Field boolean mMaxItemsSet>
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
	//    6   10:invokevirtual   #426 <Method void ActionMenuView.initialize(MenuBuilder)>
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
	//    6   12:invokevirtual   #292 <Method void ActionMenuPresenter$OverflowMenuButton.setImageDrawable(Drawable)>
			return;
	//    7   15:return          
		} else
		{
			mPendingOverflowIconSet = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #224 <Field boolean mPendingOverflowIconSet>
			mPendingOverflowIcon = drawable;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #226 <Field Drawable mPendingOverflowIcon>
			return;
	//   14   26:return          
		}
	}

	public void setReserveOverflow(boolean flag)
	{
		mReserveOverflow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #267 <Field boolean mReserveOverflow>
		mReserveOverflowSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #262 <Field boolean mReserveOverflowSet>
	//    6   10:return          
	}

	public void setWidthLimit(int i, boolean flag)
	{
		mWidthLimit = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #274 <Field int mWidthLimit>
		mStrictWidthLimit = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #432 <Field boolean mStrictWidthLimit>
		mWidthLimitSet = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #269 <Field boolean mWidthLimitSet>
	//    9   15:return          
	}

	public boolean shouldIncludeItem(int i, MenuItemImpl menuitemimpl)
	{
		return menuitemimpl.isActionButton();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #437 <Method boolean MenuItemImpl.isActionButton()>
	//    2    4:ireturn         
	}

	public boolean showOverflowMenu()
	{
		if(mReserveOverflow && !isOverflowMenuShowing() && mMenu != null && mMenuView != null && mPostedOpenRunnable == null && !mMenu.getNonActionItems().isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #267 <Field boolean mReserveOverflow>
	//*   2    4:ifeq            104
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #329 <Method boolean isOverflowMenuShowing()>
	//*   5   11:ifne            104
	//*   6   14:aload_0         
	//*   7   15:getfield        #99  <Field MenuBuilder mMenu>
	//*   8   18:ifnull          104
	//*   9   21:aload_0         
	//*  10   22:getfield        #106 <Field MenuView mMenuView>
	//*  11   25:ifnull          104
	//*  12   28:aload_0         
	//*  13   29:getfield        #228 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
	//*  14   32:ifnonnull       104
	//*  15   35:aload_0         
	//*  16   36:getfield        #99  <Field MenuBuilder mMenu>
	//*  17   39:invokevirtual   #442 <Method ArrayList MenuBuilder.getNonActionItems()>
	//*  18   42:invokevirtual   #447 <Method boolean ArrayList.isEmpty()>
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
	//   28   60:getfield        #344 <Field Context mContext>
	//   29   63:aload_0         
	//   30   64:getfield        #99  <Field MenuBuilder mMenu>
	//   31   67:aload_0         
	//   32   68:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//   33   71:iconst_1        
	//   34   72:invokespecial   #450 <Method void ActionMenuPresenter$OverflowPopup(ActionMenuPresenter, Context, MenuBuilder, View, boolean)>
	//   35   75:invokespecial   #453 <Method void ActionMenuPresenter$OpenOverflowRunnable(ActionMenuPresenter, ActionMenuPresenter$OverflowPopup)>
	//   36   78:putfield        #228 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
			((View)mMenuView).post(((Runnable) (mPostedOpenRunnable)));
	//   37   81:aload_0         
	//   38   82:getfield        #106 <Field MenuView mMenuView>
	//   39   85:checkcast       #190 <Class View>
	//   40   88:aload_0         
	//   41   89:getfield        #228 <Field ActionMenuPresenter$OpenOverflowRunnable mPostedOpenRunnable>
	//   42   92:invokevirtual   #456 <Method boolean View.post(Runnable)>
	//   43   95:pop             
			((BaseMenuPresenter)this).onSubMenuSelected(((SubMenuBuilder) (null)));
	//   44   96:aload_0         
	//   45   97:aconst_null     
	//   46   98:invokespecial   #413 <Method boolean BaseMenuPresenter.onSubMenuSelected(SubMenuBuilder)>
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
	//    2    2:invokespecial   #459 <Method void BaseMenuPresenter.updateMenuView(boolean)>
		((View)mMenuView).requestLayout();
	//    3    5:aload_0         
	//    4    6:getfield        #106 <Field MenuView mMenuView>
	//    5    9:checkcast       #190 <Class View>
	//    6   12:invokevirtual   #462 <Method void View.requestLayout()>
		Object obj = ((Object) (mMenu));
	//    7   15:aload_0         
	//    8   16:getfield        #99  <Field MenuBuilder mMenu>
	//    9   19:astore          5
		boolean flag2 = false;
	//   10   21:iconst_0        
	//   11   22:istore_3        
		if(obj != null)
	//*  12   23:aload           5
	//*  13   25:ifnull          84
		{
			obj = ((Object) (mMenu.getActionItems()));
	//   14   28:aload_0         
	//   15   29:getfield        #99  <Field MenuBuilder mMenu>
	//   16   32:invokevirtual   #465 <Method ArrayList MenuBuilder.getActionItems()>
	//   17   35:astore          5
			int j = ((ArrayList) (obj)).size();
	//   18   37:aload           5
	//   19   39:invokevirtual   #466 <Method int ArrayList.size()>
	//   20   42:istore          4
			for(int i = 0; i < j; i++)
	//*  21   44:iconst_0        
	//*  22   45:istore_2        
	//*  23   46:iload_2         
	//*  24   47:iload           4
	//*  25   49:icmpge          84
			{
				ActionProvider actionprovider = ((MenuItemImpl)((ArrayList) (obj)).get(i)).getSupportActionProvider();
	//   26   52:aload           5
	//   27   54:iload_2         
	//   28   55:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//   29   58:checkcast       #176 <Class MenuItemImpl>
	//   30   61:invokevirtual   #473 <Method ActionProvider MenuItemImpl.getSupportActionProvider()>
	//   31   64:astore          6
				if(actionprovider != null)
	//*  32   66:aload           6
	//*  33   68:ifnull          77
					actionprovider.setSubUiVisibilityListener(((android.support.v4.view.ActionProvider.SubUiVisibilityListener) (this)));
	//   34   71:aload           6
	//   35   73:aload_0         
	//   36   74:invokevirtual   #479 <Method void ActionProvider.setSubUiVisibilityListener(android.support.v4.view.ActionProvider$SubUiVisibilityListener)>
			}

	//   37   77:iload_2         
	//   38   78:iconst_1        
	//   39   79:iadd            
	//   40   80:istore_2        
		}
	//*  41   81:goto            46
		if(mMenu != null)
	//*  42   84:aload_0         
	//*  43   85:getfield        #99  <Field MenuBuilder mMenu>
	//*  44   88:ifnull          103
			obj = ((Object) (mMenu.getNonActionItems()));
	//   45   91:aload_0         
	//   46   92:getfield        #99  <Field MenuBuilder mMenu>
	//   47   95:invokevirtual   #442 <Method ArrayList MenuBuilder.getNonActionItems()>
	//   48   98:astore          5
		else
	//*  49  100:goto            106
			obj = null;
	//   50  103:aconst_null     
	//   51  104:astore          5
		boolean flag1 = flag2;
	//   52  106:iload_3         
	//   53  107:istore_2        
		if(mReserveOverflow)
	//*  54  108:aload_0         
	//*  55  109:getfield        #267 <Field boolean mReserveOverflow>
	//*  56  112:ifeq            162
		{
			flag1 = flag2;
	//   57  115:iload_3         
	//   58  116:istore_2        
			if(obj != null)
	//*  59  117:aload           5
	//*  60  119:ifnull          162
			{
				int k = ((ArrayList) (obj)).size();
	//   61  122:aload           5
	//   62  124:invokevirtual   #466 <Method int ArrayList.size()>
	//   63  127:istore          4
				if(k == 1)
	//*  64  129:iload           4
	//*  65  131:iconst_1        
	//*  66  132:icmpne          153
				{
					flag1 = ((MenuItemImpl)((ArrayList) (obj)).get(0)).isActionViewExpanded() ^ true;
	//   67  135:aload           5
	//   68  137:iconst_0        
	//   69  138:invokevirtual   #469 <Method Object ArrayList.get(int)>
	//   70  141:checkcast       #176 <Class MenuItemImpl>
	//   71  144:invokevirtual   #188 <Method boolean MenuItemImpl.isActionViewExpanded()>
	//   72  147:iconst_1        
	//   73  148:ixor            
	//   74  149:istore_2        
				} else
	//*  75  150:goto            162
				{
					flag1 = flag2;
	//   76  153:iload_3         
	//   77  154:istore_2        
					if(k > 0)
	//*  78  155:iload           4
	//*  79  157:ifle            162
						flag1 = true;
	//   80  160:iconst_1        
	//   81  161:istore_2        
				}
			}
		}
		if(flag1)
	//*  82  162:iload_2         
	//*  83  163:ifeq            250
		{
			if(mOverflowButton == null)
	//*  84  166:aload_0         
	//*  85  167:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//*  86  170:ifnonnull       189
				mOverflowButton = new ((OverflowMenuButton)this).OverflowMenuButton(mSystemContext);
	//   87  173:aload_0         
	//   88  174:new             #17  <Class ActionMenuPresenter$OverflowMenuButton>
	//   89  177:dup             
	//   90  178:aload_0         
	//   91  179:aload_0         
	//   92  180:getfield        #285 <Field Context mSystemContext>
	//   93  183:invokespecial   #288 <Method void ActionMenuPresenter$OverflowMenuButton(ActionMenuPresenter, Context)>
	//   94  186:putfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
			Object obj1 = ((Object) ((ViewGroup)mOverflowButton.getParent()));
	//   95  189:aload_0         
	//   96  190:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//   97  193:invokevirtual   #483 <Method android.view.ViewParent ActionMenuPresenter$OverflowMenuButton.getParent()>
	//   98  196:checkcast       #113 <Class ViewGroup>
	//   99  199:astore          5
			if(obj1 != mMenuView)
	//* 100  201:aload           5
	//* 101  203:aload_0         
	//* 102  204:getfield        #106 <Field MenuView mMenuView>
	//* 103  207:if_acmpeq       285
			{
				if(obj1 != null)
	//* 104  210:aload           5
	//* 105  212:ifnull          224
					((ViewGroup) (obj1)).removeView(((View) (mOverflowButton)));
	//  106  215:aload           5
	//  107  217:aload_0         
	//  108  218:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//  109  221:invokevirtual   #487 <Method void ViewGroup.removeView(View)>
				obj1 = ((Object) ((ActionMenuView)mMenuView));
	//  110  224:aload_0         
	//  111  225:getfield        #106 <Field MenuView mMenuView>
	//  112  228:checkcast       #135 <Class ActionMenuView>
	//  113  231:astore          5
				((ActionMenuView) (obj1)).addView(((View) (mOverflowButton)), ((android.view.ViewGroup.LayoutParams) (((ActionMenuView) (obj1)).generateOverflowButtonLayoutParams())));
	//  114  233:aload           5
	//  115  235:aload_0         
	//  116  236:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//  117  239:aload           5
	//  118  241:invokevirtual   #491 <Method ActionMenuView$LayoutParams ActionMenuView.generateOverflowButtonLayoutParams()>
	//  119  244:invokevirtual   #495 <Method void ActionMenuView.addView(View, android.view.ViewGroup$LayoutParams)>
			}
		} else
	//* 120  247:goto            285
		if(mOverflowButton != null && mOverflowButton.getParent() == mMenuView)
	//* 121  250:aload_0         
	//* 122  251:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//* 123  254:ifnull          285
	//* 124  257:aload_0         
	//* 125  258:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//* 126  261:invokevirtual   #483 <Method android.view.ViewParent ActionMenuPresenter$OverflowMenuButton.getParent()>
	//* 127  264:aload_0         
	//* 128  265:getfield        #106 <Field MenuView mMenuView>
	//* 129  268:if_acmpne       285
			((ViewGroup)mMenuView).removeView(((View) (mOverflowButton)));
	//  130  271:aload_0         
	//  131  272:getfield        #106 <Field MenuView mMenuView>
	//  132  275:checkcast       #113 <Class ViewGroup>
	//  133  278:aload_0         
	//  134  279:getfield        #160 <Field ActionMenuPresenter$OverflowMenuButton mOverflowButton>
	//  135  282:invokevirtual   #487 <Method void ViewGroup.removeView(View)>
		((ActionMenuView)mMenuView).setOverflowReserved(mReserveOverflow);
	//  136  285:aload_0         
	//  137  286:getfield        #106 <Field MenuView mMenuView>
	//  138  289:checkcast       #135 <Class ActionMenuView>
	//  139  292:aload_0         
	//  140  293:getfield        #267 <Field boolean mReserveOverflow>
	//  141  296:invokevirtual   #498 <Method void ActionMenuView.setOverflowReserved(boolean)>
	//  142  299:return          
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
