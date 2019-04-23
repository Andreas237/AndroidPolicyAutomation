// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.view.menu.*;
import android.view.ViewGroup;

// Referenced classes of package android.support.design.internal:
//			b

public class BottomNavigationPresenter
	implements MenuPresenter
{

	public void a(boolean flag)
	{
		c = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field boolean c>
	//    3    5:return          
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
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int d>
	//    2    4:ireturn         
	}

	public MenuView getMenuView(ViewGroup viewgroup)
	{
		return ((MenuView) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field b b>
	//    2    4:areturn         
	}

	public void initForMenu(Context context, MenuBuilder menubuilder)
	{
		a = menubuilder;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #35  <Field MenuBuilder a>
		b.initialize(a);
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field b b>
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field MenuBuilder a>
	//    7   13:invokevirtual   #41  <Method void b.initialize(MenuBuilder)>
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
	//*   1    1:instanceof      #47  <Class BottomNavigationPresenter$SavedState>
	//*   2    4:ifeq            21
			b.a(((SavedState)parcelable).a);
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field b b>
	//    5   11:aload_1         
	//    6   12:checkcast       #47  <Class BottomNavigationPresenter$SavedState>
	//    7   15:getfield        #49  <Field int android.support.design.internal.BottomNavigationPresenter$SavedState.a>
	//    8   18:invokevirtual   #52  <Method void android.support.design.internal.b.a(int)>
	//    9   21:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState();
	//    0    0:new             #47  <Class BottomNavigationPresenter$SavedState>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void BottomNavigationPresenter$SavedState()>
	//    3    7:astore_1        
		savedstate.a = b.getSelectedItemId();
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field b b>
	//    7   13:invokevirtual   #61  <Method int b.getSelectedItemId()>
	//    8   16:putfield        #49  <Field int android.support.design.internal.BottomNavigationPresenter$SavedState.a>
		return ((Parcelable) (savedstate));
	//    9   19:aload_1         
	//   10   20:areturn         
	}

	public boolean onSubMenuSelected(a a1)
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
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field boolean c>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            20
		{
			b.b();
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field b b>
	//    8   16:invokevirtual   #68  <Method void b.b()>
			return;
	//    9   19:return          
		} else
		{
			b.c();
	//   10   20:aload_0         
	//   11   21:getfield        #31  <Field b b>
	//   12   24:invokevirtual   #70  <Method void b.c()>
			return;
	//   13   27:return          
		}
	}

	private MenuBuilder a;
	private b b;
	private boolean c;
	private int d;

	private class SavedState
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
			parcel.writeInt(a);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #30  <Field int a>
		//    3    5:invokevirtual   #37  <Method void Parcel.writeInt(int)>
		//    4    8:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new c();
		int a;

		static 
		{
		//    0    0:new             #14  <Class c>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void c()>
		//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}

		SavedState(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			a = parcel.readInt();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #28  <Method int Parcel.readInt()>
		//    5    9:putfield        #30  <Field int a>
		//    6   12:return          
		}
	}

}
