// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.*;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.internal.BottomNavigationPresenter;
import android.support.v4.view.AbsSavedState;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuBuilder;
import android.view.*;
import android.widget.FrameLayout;

public class BottomNavigationView extends FrameLayout
{
	public static interface OnNavigationItemReselectedListener
	{

		public abstract void onNavigationItemReselected(MenuItem menuitem);
	}

	public static interface OnNavigationItemSelectedListener
	{

		public abstract boolean onNavigationItemSelected(MenuItem menuitem);
	}

	static class SavedState extends AbsSavedState
	{

		private void readFromParcel(Parcel parcel, ClassLoader classloader)
		{
			menuPresenterState = parcel.readBundle(classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #37  <Method Bundle Parcel.readBundle(ClassLoader)>
		//    4    6:putfield        #39  <Field Bundle menuPresenterState>
		//    5    9:return          
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #44  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeBundle(menuPresenterState);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #39  <Field Bundle menuPresenterState>
		//    7   11:invokevirtual   #48  <Method void Parcel.writeBundle(Bundle)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class BottomNavigationView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void BottomNavigationView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class BottomNavigationView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void BottomNavigationView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method BottomNavigationView$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method BottomNavigationView$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #34  <Method BottomNavigationView$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		Bundle menuPresenterState;

		static 
		{
		//    0    0:new             #9   <Class BottomNavigationView$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void BottomNavigationView$SavedState$1()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
			readFromParcel(parcel, classloader);
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:aload_2         
		//    7    9:invokespecial   #28  <Method void readFromParcel(Parcel, ClassLoader)>
		//    8   12:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #31  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}


	private MenuInflater getMenuInflater()
	{
		if(menuInflater == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field MenuInflater menuInflater>
	//*   2    4:ifnonnull       22
			menuInflater = ((MenuInflater) (new SupportMenuInflater(getContext())));
	//    3    7:aload_0         
	//    4    8:new             #33  <Class SupportMenuInflater>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #37  <Method android.content.Context getContext()>
	//    8   16:invokespecial   #41  <Method void SupportMenuInflater(android.content.Context)>
	//    9   19:putfield        #31  <Field MenuInflater menuInflater>
		return menuInflater;
	//   10   22:aload_0         
	//   11   23:getfield        #31  <Field MenuInflater menuInflater>
	//   12   26:areturn         
	}

	public Drawable getItemBackground()
	{
		return menuView.getItemBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #51  <Method Drawable BottomNavigationMenuView.getItemBackground()>
	//    3    7:areturn         
	}

	public int getItemBackgroundResource()
	{
		return menuView.getItemBackgroundRes();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #59  <Method int BottomNavigationMenuView.getItemBackgroundRes()>
	//    3    7:ireturn         
	}

	public int getItemIconSize()
	{
		return menuView.getItemIconSize();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #64  <Method int BottomNavigationMenuView.getItemIconSize()>
	//    3    7:ireturn         
	}

	public ColorStateList getItemIconTintList()
	{
		return menuView.getIconTintList();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #69  <Method ColorStateList BottomNavigationMenuView.getIconTintList()>
	//    3    7:areturn         
	}

	public int getItemTextAppearanceActive()
	{
		return menuView.getItemTextAppearanceActive();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #73  <Method int BottomNavigationMenuView.getItemTextAppearanceActive()>
	//    3    7:ireturn         
	}

	public int getItemTextAppearanceInactive()
	{
		return menuView.getItemTextAppearanceInactive();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #76  <Method int BottomNavigationMenuView.getItemTextAppearanceInactive()>
	//    3    7:ireturn         
	}

	public ColorStateList getItemTextColor()
	{
		return menuView.getItemTextColor();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #79  <Method ColorStateList BottomNavigationMenuView.getItemTextColor()>
	//    3    7:areturn         
	}

	public int getLabelVisibilityMode()
	{
		return menuView.getLabelVisibilityMode();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #82  <Method int BottomNavigationMenuView.getLabelVisibilityMode()>
	//    3    7:ireturn         
	}

	public int getMaxItemCount()
	{
		return 5;
	//    0    0:iconst_5        
	//    1    1:ireturn         
	}

	public Menu getMenu()
	{
		return ((Menu) (menu));
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field MenuBuilder menu>
	//    2    4:areturn         
	}

	public int getSelectedItemId()
	{
		return menuView.getSelectedItemId();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #92  <Method int BottomNavigationMenuView.getSelectedItemId()>
	//    3    7:ireturn         
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #12  <Class BottomNavigationView$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #96  <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #12  <Class BottomNavigationView$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #100 <Method Parcelable BottomNavigationView$SavedState.getSuperState()>
	//   13   23:invokespecial   #96  <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			menu.restorePresenterStates(((SavedState) (parcelable)).menuPresenterState);
	//   14   26:aload_0         
	//   15   27:getfield        #88  <Field MenuBuilder menu>
	//   16   30:aload_1         
	//   17   31:getfield        #104 <Field Bundle BottomNavigationView$SavedState.menuPresenterState>
	//   18   34:invokevirtual   #110 <Method void MenuBuilder.restorePresenterStates(Bundle)>
			return;
	//   19   37:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #12  <Class BottomNavigationView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #113 <Method Parcelable FrameLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #115 <Method void BottomNavigationView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.menuPresenterState = new Bundle();
	//    6   12:aload_1         
	//    7   13:new             #117 <Class Bundle>
	//    8   16:dup             
	//    9   17:invokespecial   #120 <Method void Bundle()>
	//   10   20:putfield        #104 <Field Bundle BottomNavigationView$SavedState.menuPresenterState>
		menu.savePresenterStates(savedstate.menuPresenterState);
	//   11   23:aload_0         
	//   12   24:getfield        #88  <Field MenuBuilder menu>
	//   13   27:aload_1         
	//   14   28:getfield        #104 <Field Bundle BottomNavigationView$SavedState.menuPresenterState>
	//   15   31:invokevirtual   #123 <Method void MenuBuilder.savePresenterStates(Bundle)>
		return ((Parcelable) (savedstate));
	//   16   34:aload_1         
	//   17   35:areturn         
	}

	public void setItemBackground(Drawable drawable)
	{
		menuView.setItemBackground(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #127 <Method void BottomNavigationMenuView.setItemBackground(Drawable)>
	//    4    8:return          
	}

	public void setItemBackgroundResource(int i)
	{
		menuView.setItemBackgroundRes(i);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #133 <Method void BottomNavigationMenuView.setItemBackgroundRes(int)>
	//    4    8:return          
	}

	public void setItemHorizontalTranslationEnabled(boolean flag)
	{
		if(menuView.isItemHorizontalTranslationEnabled() != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//*   2    4:invokevirtual   #139 <Method boolean BottomNavigationMenuView.isItemHorizontalTranslationEnabled()>
	//*   3    7:iload_1         
	//*   4    8:icmpeq          27
		{
			menuView.setItemHorizontalTranslationEnabled(flag);
	//    5   11:aload_0         
	//    6   12:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #141 <Method void BottomNavigationMenuView.setItemHorizontalTranslationEnabled(boolean)>
			presenter.updateMenuView(false);
	//    9   19:aload_0         
	//   10   20:getfield        #143 <Field BottomNavigationPresenter presenter>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #148 <Method void BottomNavigationPresenter.updateMenuView(boolean)>
		}
	//   13   27:return          
	}

	public void setItemIconSize(int i)
	{
		menuView.setItemIconSize(i);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #151 <Method void BottomNavigationMenuView.setItemIconSize(int)>
	//    4    8:return          
	}

	public void setItemIconSizeRes(int i)
	{
		setItemIconSize(getResources().getDimensionPixelSize(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #157 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #163 <Method int Resources.getDimensionPixelSize(int)>
	//    5    9:invokevirtual   #164 <Method void setItemIconSize(int)>
	//    6   12:return          
	}

	public void setItemIconTintList(ColorStateList colorstatelist)
	{
		menuView.setIconTintList(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #169 <Method void BottomNavigationMenuView.setIconTintList(ColorStateList)>
	//    4    8:return          
	}

	public void setItemTextAppearanceActive(int i)
	{
		menuView.setItemTextAppearanceActive(i);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #172 <Method void BottomNavigationMenuView.setItemTextAppearanceActive(int)>
	//    4    8:return          
	}

	public void setItemTextAppearanceInactive(int i)
	{
		menuView.setItemTextAppearanceInactive(i);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #175 <Method void BottomNavigationMenuView.setItemTextAppearanceInactive(int)>
	//    4    8:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		menuView.setItemTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #178 <Method void BottomNavigationMenuView.setItemTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setLabelVisibilityMode(int i)
	{
		if(menuView.getLabelVisibilityMode() != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field BottomNavigationMenuView menuView>
	//*   2    4:invokevirtual   #82  <Method int BottomNavigationMenuView.getLabelVisibilityMode()>
	//*   3    7:iload_1         
	//*   4    8:icmpeq          27
		{
			menuView.setLabelVisibilityMode(i);
	//    5   11:aload_0         
	//    6   12:getfield        #47  <Field BottomNavigationMenuView menuView>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #181 <Method void BottomNavigationMenuView.setLabelVisibilityMode(int)>
			presenter.updateMenuView(false);
	//    9   19:aload_0         
	//   10   20:getfield        #143 <Field BottomNavigationPresenter presenter>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #148 <Method void BottomNavigationPresenter.updateMenuView(boolean)>
		}
	//   13   27:return          
	}

	public void setOnNavigationItemReselectedListener(OnNavigationItemReselectedListener onnavigationitemreselectedlistener)
	{
		reselectedListener = onnavigationitemreselectedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #185 <Field BottomNavigationView$OnNavigationItemReselectedListener reselectedListener>
	//    3    5:return          
	}

	public void setOnNavigationItemSelectedListener(OnNavigationItemSelectedListener onnavigationitemselectedlistener)
	{
		selectedListener = onnavigationitemselectedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #189 <Field BottomNavigationView$OnNavigationItemSelectedListener selectedListener>
	//    3    5:return          
	}

	public void setSelectedItemId(int i)
	{
		MenuItem menuitem = menu.findItem(i);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field MenuBuilder menu>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #194 <Method MenuItem MenuBuilder.findItem(int)>
	//    4    8:astore_2        
		if(menuitem != null && !menu.performItemAction(menuitem, ((android.support.v7.view.menu.MenuPresenter) (presenter)), 0))
	//*   5    9:aload_2         
	//*   6   10:ifnull          37
	//*   7   13:aload_0         
	//*   8   14:getfield        #88  <Field MenuBuilder menu>
	//*   9   17:aload_2         
	//*  10   18:aload_0         
	//*  11   19:getfield        #143 <Field BottomNavigationPresenter presenter>
	//*  12   22:iconst_0        
	//*  13   23:invokevirtual   #198 <Method boolean MenuBuilder.performItemAction(MenuItem, android.support.v7.view.menu.MenuPresenter, int)>
	//*  14   26:ifne            37
			menuitem.setChecked(true);
	//   15   29:aload_2         
	//   16   30:iconst_1        
	//   17   31:invokeinterface #204 <Method MenuItem MenuItem.setChecked(boolean)>
	//   18   36:pop             
	//   19   37:return          
	}

	private final MenuBuilder menu;
	private MenuInflater menuInflater;
	private final BottomNavigationMenuView menuView;
	private final BottomNavigationPresenter presenter;
	private OnNavigationItemReselectedListener reselectedListener;
	private OnNavigationItemSelectedListener selectedListener;
}
