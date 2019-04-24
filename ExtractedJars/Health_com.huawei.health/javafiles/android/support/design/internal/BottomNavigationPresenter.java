// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.view.menu.*;
import android.view.ViewGroup;

// Referenced classes of package android.support.design.internal:
//			BottomNavigationMenuView

public class BottomNavigationPresenter
	implements MenuPresenter
{
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
			parcel.writeInt(selectedItemId);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #34  <Field int selectedItemId>
		//    3    5:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		//    4    8:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState b(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class BottomNavigationPresenter$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void BottomNavigationPresenter$SavedState(Parcel)>
			//    4    8:areturn         
			}

			public SavedState[] b(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (b(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #27  <Method BottomNavigationPresenter$SavedState b(Parcel)>
			//    3    5:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (b(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #31  <Method BottomNavigationPresenter$SavedState[] b(int)>
			//    3    5:areturn         
			}

		}
;
		int selectedItemId;

		static 
		{
		//    0    0:new             #11  <Class BottomNavigationPresenter$SavedState$4>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void BottomNavigationPresenter$SavedState$4()>
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
			selectedItemId = parcel.readInt();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #32  <Method int Parcel.readInt()>
		//    5    9:putfield        #34  <Field int selectedItemId>
		//    6   12:return          
		}
	}


	public BottomNavigationPresenter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		mUpdateSuspended = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #29  <Field boolean mUpdateSuspended>
	//    5    9:return          
	}

	public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean flagActionItems()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int mId>
	//    2    4:ireturn         
	}

	public MenuView getMenuView(ViewGroup viewgroup)
	{
		return ((MenuView) (mMenuView));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field BottomNavigationMenuView mMenuView>
	//    2    4:areturn         
	}

	public void initForMenu(Context context, MenuBuilder menubuilder)
	{
		mMenuView.initialize(mMenu);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field BottomNavigationMenuView mMenuView>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field MenuBuilder mMenu>
	//    4    8:invokevirtual   #53  <Method void BottomNavigationMenuView.initialize(MenuBuilder)>
		mMenu = menubuilder;
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:putfield        #47  <Field MenuBuilder mMenu>
	//    8   16:return          
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
	//    0    0:return          
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		if(parcelable instanceof SavedState)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #8   <Class BottomNavigationPresenter$SavedState>
	//*   2    4:ifeq            21
			mMenuView.tryRestoreSelectedItemId(((SavedState)parcelable).selectedItemId);
	//    3    7:aload_0         
	//    4    8:getfield        #43  <Field BottomNavigationMenuView mMenuView>
	//    5   11:aload_1         
	//    6   12:checkcast       #8   <Class BottomNavigationPresenter$SavedState>
	//    7   15:getfield        #60  <Field int BottomNavigationPresenter$SavedState.selectedItemId>
	//    8   18:invokevirtual   #64  <Method void BottomNavigationMenuView.tryRestoreSelectedItemId(int)>
	//    9   21:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState();
	//    0    0:new             #8   <Class BottomNavigationPresenter$SavedState>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void BottomNavigationPresenter$SavedState()>
	//    3    7:astore_1        
		savedstate.selectedItemId = mMenuView.getSelectedItemId();
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field BottomNavigationMenuView mMenuView>
	//    7   13:invokevirtual   #70  <Method int BottomNavigationMenuView.getSelectedItemId()>
	//    8   16:putfield        #60  <Field int BottomNavigationPresenter$SavedState.selectedItemId>
		return ((Parcelable) (savedstate));
	//    9   19:aload_1         
	//   10   20:areturn         
	}

	public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setBottomNavigationMenuView(BottomNavigationMenuView bottomnavigationmenuview)
	{
		mMenuView = bottomnavigationmenuview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field BottomNavigationMenuView mMenuView>
	//    3    5:return          
	}

	public void setCallback(android.support.v7.view.menu.MenuPresenter.Callback callback)
	{
	//    0    0:return          
	}

	public void setId(int i)
	{
		mId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field int mId>
	//    3    5:return          
	}

	public void setUpdateSuspended(boolean flag)
	{
		mUpdateSuspended = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field boolean mUpdateSuspended>
	//    3    5:return          
	}

	public void updateMenuView(boolean flag)
	{
		if(mUpdateSuspended)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean mUpdateSuspended>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            20
		{
			mMenuView.buildMenuView();
	//    6   12:aload_0         
	//    7   13:getfield        #43  <Field BottomNavigationMenuView mMenuView>
	//    8   16:invokevirtual   #83  <Method void BottomNavigationMenuView.buildMenuView()>
			return;
	//    9   19:return          
		} else
		{
			mMenuView.updateMenuView();
	//   10   20:aload_0         
	//   11   21:getfield        #43  <Field BottomNavigationMenuView mMenuView>
	//   12   24:invokevirtual   #85  <Method void BottomNavigationMenuView.updateMenuView()>
			return;
	//   13   27:return          
		}
	}

	private int mId;
	private MenuBuilder mMenu;
	private BottomNavigationMenuView mMenuView;
	private boolean mUpdateSuspended;
}
