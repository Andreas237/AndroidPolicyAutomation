// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.view.menu.*;

// Referenced classes of package android.support.design.internal:
//			BottomNavigationMenuView

public class BottomNavigationPresenter
	implements o
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
			parcel.writeInt(a);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #34  <Field int a>
		//    3    5:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		//    4    8:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class BottomNavigationPresenter$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void BottomNavigationPresenter$SavedState(Parcel)>
			//    4    8:areturn         
			}

			public SavedState[] a(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #27  <Method BottomNavigationPresenter$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (a(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #31  <Method BottomNavigationPresenter$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		int a;

		static 
		{
		//    0    0:new             #11  <Class BottomNavigationPresenter$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void BottomNavigationPresenter$SavedState$1()>
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
			a = parcel.readInt();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #32  <Method int Parcel.readInt()>
		//    5    9:putfield        #34  <Field int a>
		//    6   12:return          
		}
	}


	public BottomNavigationPresenter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		c = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #25  <Field boolean c>
	//    5    9:return          
	}

	public void a(int i)
	{
		d = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field int d>
	//    3    5:return          
	}

	public void a(Context context, h h)
	{
		b.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field BottomNavigationMenuView b>
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field h a>
	//    4    8:invokevirtual   #39  <Method void BottomNavigationMenuView.a(h)>
		a = h;
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:putfield        #34  <Field h a>
	//    8   16:return          
	}

	public void a(Parcelable parcelable)
	{
		if(parcelable instanceof SavedState)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #8   <Class BottomNavigationPresenter$SavedState>
	//*   2    4:ifeq            21
			b.a(((SavedState)parcelable).a);
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field BottomNavigationMenuView b>
	//    5   11:aload_1         
	//    6   12:checkcast       #8   <Class BottomNavigationPresenter$SavedState>
	//    7   15:getfield        #42  <Field int BottomNavigationPresenter$SavedState.a>
	//    8   18:invokevirtual   #44  <Method void BottomNavigationMenuView.a(int)>
	//    9   21:return          
	}

	public void a(BottomNavigationMenuView bottomnavigationmenuview)
	{
		b = bottomnavigationmenuview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field BottomNavigationMenuView b>
	//    3    5:return          
	}

	public void a(h h, boolean flag)
	{
	//    0    0:return          
	}

	public void a(android.support.v7.view.menu.o.a a1)
	{
	//    0    0:return          
	}

	public void a(boolean flag)
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field boolean c>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            20
		{
			b.a();
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field BottomNavigationMenuView b>
	//    8   16:invokevirtual   #50  <Method void BottomNavigationMenuView.a()>
			return;
	//    9   19:return          
		} else
		{
			b.b();
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field BottomNavigationMenuView b>
	//   12   24:invokevirtual   #52  <Method void BottomNavigationMenuView.b()>
			return;
	//   13   27:return          
		}
	}

	public boolean a()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(h h, j j)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(u u)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int d>
	//    2    4:ireturn         
	}

	public void b(boolean flag)
	{
		c = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field boolean c>
	//    3    5:return          
	}

	public boolean b(h h, j j)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Parcelable c()
	{
		SavedState savedstate = new SavedState();
	//    0    0:new             #8   <Class BottomNavigationPresenter$SavedState>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void BottomNavigationPresenter$SavedState()>
	//    3    7:astore_1        
		savedstate.a = b.getSelectedItemId();
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field BottomNavigationMenuView b>
	//    7   13:invokevirtual   #61  <Method int BottomNavigationMenuView.getSelectedItemId()>
	//    8   16:putfield        #42  <Field int BottomNavigationPresenter$SavedState.a>
		return ((Parcelable) (savedstate));
	//    9   19:aload_1         
	//   10   20:areturn         
	}

	private h a;
	private BottomNavigationMenuView b;
	private boolean c;
	private int d;
}
