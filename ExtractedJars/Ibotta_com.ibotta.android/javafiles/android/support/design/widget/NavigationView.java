// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.*;
import android.support.design.internal.*;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.AbsSavedState;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuItemImpl;
import android.view.*;

public class NavigationView extends ScrimInsetsFrameLayout
{
	public static interface OnNavigationItemSelectedListener
	{

		public abstract boolean onNavigationItemSelected(MenuItem menuitem);
	}

	public static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeBundle(menuState);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #33  <Field Bundle menuState>
		//    7   11:invokevirtual   #45  <Method void Parcel.writeBundle(Bundle)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class NavigationView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void NavigationView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class NavigationView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void NavigationView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method NavigationView$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method NavigationView$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #34  <Method NavigationView$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		public Bundle menuState;

		static 
		{
		//    0    0:new             #9   <Class NavigationView$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void NavigationView$SavedState$1()>
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
			menuState = parcel.readBundle(classloader);
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:aload_2         
		//    7    9:invokevirtual   #31  <Method Bundle Parcel.readBundle(ClassLoader)>
		//    8   12:putfield        #33  <Field Bundle menuState>
		//    9   15:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #36  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}


	private MenuInflater getMenuInflater()
	{
		if(menuInflater == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field MenuInflater menuInflater>
	//*   2    4:ifnonnull       22
			menuInflater = ((MenuInflater) (new SupportMenuInflater(getContext())));
	//    3    7:aload_0         
	//    4    8:new             #40  <Class SupportMenuInflater>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #44  <Method android.content.Context getContext()>
	//    8   16:invokespecial   #48  <Method void SupportMenuInflater(android.content.Context)>
	//    9   19:putfield        #38  <Field MenuInflater menuInflater>
		return menuInflater;
	//   10   22:aload_0         
	//   11   23:getfield        #38  <Field MenuInflater menuInflater>
	//   12   26:areturn         
	}

	public MenuItem getCheckedItem()
	{
		return ((MenuItem) (presenter.getCheckedItem()));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter presenter>
	//    2    4:invokevirtual   #58  <Method MenuItemImpl NavigationMenuPresenter.getCheckedItem()>
	//    3    7:areturn         
	}

	public int getHeaderCount()
	{
		return presenter.getHeaderCount();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter presenter>
	//    2    4:invokevirtual   #63  <Method int NavigationMenuPresenter.getHeaderCount()>
	//    3    7:ireturn         
	}

	public Drawable getItemBackground()
	{
		return presenter.getItemBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter presenter>
	//    2    4:invokevirtual   #67  <Method Drawable NavigationMenuPresenter.getItemBackground()>
	//    3    7:areturn         
	}

	public int getItemHorizontalPadding()
	{
		return presenter.getItemHorizontalPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter presenter>
	//    2    4:invokevirtual   #71  <Method int NavigationMenuPresenter.getItemHorizontalPadding()>
	//    3    7:ireturn         
	}

	public int getItemIconPadding()
	{
		return presenter.getItemIconPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter presenter>
	//    2    4:invokevirtual   #74  <Method int NavigationMenuPresenter.getItemIconPadding()>
	//    3    7:ireturn         
	}

	public ColorStateList getItemIconTintList()
	{
		return presenter.getItemTintList();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter presenter>
	//    2    4:invokevirtual   #79  <Method ColorStateList NavigationMenuPresenter.getItemTintList()>
	//    3    7:areturn         
	}

	public ColorStateList getItemTextColor()
	{
		return presenter.getItemTextColor();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter presenter>
	//    2    4:invokevirtual   #82  <Method ColorStateList NavigationMenuPresenter.getItemTextColor()>
	//    3    7:areturn         
	}

	public Menu getMenu()
	{
		return ((Menu) (menu));
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field NavigationMenu menu>
	//    2    4:areturn         
	}

	protected void onMeasure(int i, int j)
	{
		int k = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #94  <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		if(k != 0x80000000)
	//*   3    5:iload_3         
	//*   4    6:ldc1            #95  <Int 0x80000000>
	//*   5    8:icmpeq          31
		{
			if(k == 0)
	//*   6   11:iload_3         
	//*   7   12:ifeq            18
	//*   8   15:goto            48
				i = android.view.View.MeasureSpec.makeMeasureSpec(maxWidth, 0x40000000);
	//    9   18:aload_0         
	//   10   19:getfield        #97  <Field int maxWidth>
	//   11   22:ldc1            #98  <Int 0x40000000>
	//   12   24:invokestatic    #102 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   13   27:istore_1        
		} else
	//*  14   28:goto            48
		{
			i = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(android.view.View.MeasureSpec.getSize(i), maxWidth), 0x40000000);
	//   15   31:iload_1         
	//   16   32:invokestatic    #105 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   17   35:aload_0         
	//   18   36:getfield        #97  <Field int maxWidth>
	//   19   39:invokestatic    #110 <Method int Math.min(int, int)>
	//   20   42:ldc1            #98  <Int 0x40000000>
	//   21   44:invokestatic    #102 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   22   47:istore_1        
		}
		super.onMeasure(i, j);
	//   23   48:aload_0         
	//   24   49:iload_1         
	//   25   50:iload_2         
	//   26   51:invokespecial   #112 <Method void ScrimInsetsFrameLayout.onMeasure(int, int)>
	//   27   54:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #9   <Class NavigationView$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #116 <Method void ScrimInsetsFrameLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #9   <Class NavigationView$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #120 <Method Parcelable NavigationView$SavedState.getSuperState()>
	//   13   23:invokespecial   #116 <Method void ScrimInsetsFrameLayout.onRestoreInstanceState(Parcelable)>
			menu.restorePresenterStates(((SavedState) (parcelable)).menuState);
	//   14   26:aload_0         
	//   15   27:getfield        #86  <Field NavigationMenu menu>
	//   16   30:aload_1         
	//   17   31:getfield        #124 <Field Bundle NavigationView$SavedState.menuState>
	//   18   34:invokevirtual   #130 <Method void NavigationMenu.restorePresenterStates(Bundle)>
			return;
	//   19   37:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #9   <Class NavigationView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #133 <Method Parcelable ScrimInsetsFrameLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #135 <Method void NavigationView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.menuState = new Bundle();
	//    6   12:aload_1         
	//    7   13:new             #137 <Class Bundle>
	//    8   16:dup             
	//    9   17:invokespecial   #139 <Method void Bundle()>
	//   10   20:putfield        #124 <Field Bundle NavigationView$SavedState.menuState>
		menu.savePresenterStates(savedstate.menuState);
	//   11   23:aload_0         
	//   12   24:getfield        #86  <Field NavigationMenu menu>
	//   13   27:aload_1         
	//   14   28:getfield        #124 <Field Bundle NavigationView$SavedState.menuState>
	//   15   31:invokevirtual   #142 <Method void NavigationMenu.savePresenterStates(Bundle)>
		return ((Parcelable) (savedstate));
	//   16   34:aload_1         
	//   17   35:areturn         
	}

	public void setCheckedItem(int i)
	{
		MenuItem menuitem = menu.findItem(i);
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field NavigationMenu menu>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #149 <Method MenuItem NavigationMenu.findItem(int)>
	//    4    8:astore_2        
		if(menuitem != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          24
			presenter.setCheckedItem((MenuItemImpl)menuitem);
	//    7   13:aload_0         
	//    8   14:getfield        #53  <Field NavigationMenuPresenter presenter>
	//    9   17:aload_2         
	//   10   18:checkcast       #151 <Class MenuItemImpl>
	//   11   21:invokevirtual   #154 <Method void NavigationMenuPresenter.setCheckedItem(MenuItemImpl)>
	//   12   24:return          
	}

	public void setCheckedItem(MenuItem menuitem)
	{
		menuitem = menu.findItem(menuitem.getItemId());
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field NavigationMenu menu>
	//    2    4:aload_1         
	//    3    5:invokeinterface #162 <Method int MenuItem.getItemId()>
	//    4   10:invokevirtual   #149 <Method MenuItem NavigationMenu.findItem(int)>
	//    5   13:astore_1        
		if(menuitem != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          30
		{
			presenter.setCheckedItem((MenuItemImpl)menuitem);
	//    8   18:aload_0         
	//    9   19:getfield        #53  <Field NavigationMenuPresenter presenter>
	//   10   22:aload_1         
	//   11   23:checkcast       #151 <Class MenuItemImpl>
	//   12   26:invokevirtual   #154 <Method void NavigationMenuPresenter.setCheckedItem(MenuItemImpl)>
			return;
	//   13   29:return          
		} else
		{
			throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
	//   14   30:new             #164 <Class IllegalArgumentException>
	//   15   33:dup             
	//   16   34:ldc1            #166 <String "Called setCheckedItem(MenuItem) with an item that is not in the current menu.">
	//   17   36:invokespecial   #169 <Method void IllegalArgumentException(String)>
	//   18   39:athrow          
		}
	}

	public void setItemBackground(Drawable drawable)
	{
		presenter.setItemBackground(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter presenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #173 <Method void NavigationMenuPresenter.setItemBackground(Drawable)>
	//    4    8:return          
	}

	public void setItemBackgroundResource(int i)
	{
		setItemBackground(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #44  <Method android.content.Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #181 <Method Drawable ContextCompat.getDrawable(android.content.Context, int)>
	//    5    9:invokevirtual   #182 <Method void setItemBackground(Drawable)>
	//    6   12:return          
	}

	public void setItemHorizontalPadding(int i)
	{
		presenter.setItemHorizontalPadding(i);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter presenter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #185 <Method void NavigationMenuPresenter.setItemHorizontalPadding(int)>
	//    4    8:return          
	}

	public void setItemHorizontalPaddingResource(int i)
	{
		presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter presenter>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #191 <Method Resources getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #196 <Method int Resources.getDimensionPixelSize(int)>
	//    6   12:invokevirtual   #185 <Method void NavigationMenuPresenter.setItemHorizontalPadding(int)>
	//    7   15:return          
	}

	public void setItemIconPadding(int i)
	{
		presenter.setItemIconPadding(i);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter presenter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #199 <Method void NavigationMenuPresenter.setItemIconPadding(int)>
	//    4    8:return          
	}

	public void setItemIconPaddingResource(int i)
	{
		presenter.setItemIconPadding(getResources().getDimensionPixelSize(i));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter presenter>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #191 <Method Resources getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #196 <Method int Resources.getDimensionPixelSize(int)>
	//    6   12:invokevirtual   #199 <Method void NavigationMenuPresenter.setItemIconPadding(int)>
	//    7   15:return          
	}

	public void setItemIconTintList(ColorStateList colorstatelist)
	{
		presenter.setItemIconTintList(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter presenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #204 <Method void NavigationMenuPresenter.setItemIconTintList(ColorStateList)>
	//    4    8:return          
	}

	public void setItemTextAppearance(int i)
	{
		presenter.setItemTextAppearance(i);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter presenter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #208 <Method void NavigationMenuPresenter.setItemTextAppearance(int)>
	//    4    8:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		presenter.setItemTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter presenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #211 <Method void NavigationMenuPresenter.setItemTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onnavigationitemselectedlistener)
	{
		listener = onnavigationitemselectedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #215 <Field NavigationView$OnNavigationItemSelectedListener listener>
	//    3    5:return          
	}

	private static final int CHECKED_STATE_SET[] = {
		0x10100a0
	};
	private static final int DISABLED_STATE_SET[] = {
		0xfefeff62
	};
	OnNavigationItemSelectedListener listener;
	private final int maxWidth;
	private final NavigationMenu menu;
	private MenuInflater menuInflater;
	private final NavigationMenuPresenter presenter;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #28  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #30  <Field int[] CHECKED_STATE_SET>
	//    7   11:iconst_1        
	//    8   12:newarray        int[]
	//    9   14:dup             
	//   10   15:iconst_0        
	//   11   16:ldc1            #31  <Int 0xfefeff62>
	//   12   18:iastore         
	//   13   19:putstatic       #33  <Field int[] DISABLED_STATE_SET>
	//*  14   22:return          
	}
}
