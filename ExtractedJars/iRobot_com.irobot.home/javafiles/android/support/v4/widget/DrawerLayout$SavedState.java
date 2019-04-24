// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayout

protected static class DrawerLayout$SavedState extends AbsSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #52  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(a);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #31  <Field int a>
	//    7   11:invokevirtual   #56  <Method void Parcel.writeInt(int)>
		parcel.writeInt(b);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #39  <Field int b>
	//   11   19:invokevirtual   #56  <Method void Parcel.writeInt(int)>
		parcel.writeInt(c);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #41  <Field int c>
	//   15   27:invokevirtual   #56  <Method void Parcel.writeInt(int)>
		parcel.writeInt(e);
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #43  <Field int e>
	//   19   35:invokevirtual   #56  <Method void Parcel.writeInt(int)>
		parcel.writeInt(f);
	//   20   38:aload_1         
	//   21   39:aload_0         
	//   22   40:getfield        #45  <Field int f>
	//   23   43:invokevirtual   #56  <Method void Parcel.writeInt(int)>
	//   24   46:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public DrawerLayout.SavedState a(Parcel parcel)
		{
			return new DrawerLayout.SavedState(parcel, ((ClassLoader) (null)));
		//    0    0:new             #9   <Class DrawerLayout$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void DrawerLayout$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public DrawerLayout.SavedState a(Parcel parcel, ClassLoader classloader)
		{
			return new DrawerLayout.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class DrawerLayout$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #22  <Method void DrawerLayout$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public DrawerLayout.SavedState[] a(int i)
		{
			return new DrawerLayout.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       DrawerLayout.SavedState[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #28  <Method DrawerLayout$SavedState a(Parcel)>
		//    3    5:areturn         
		}

		public Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (a(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #31  <Method DrawerLayout$SavedState a(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #35  <Method DrawerLayout$SavedState[] a(int)>
		//    3    5:areturn         
		}

	}
;
	int a;
	int b;
	int c;
	int e;
	int f;

	static 
	{
	//    0    0:new             #9   <Class DrawerLayout$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void DrawerLayout$SavedState$1()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public DrawerLayout$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #29  <Method void AbsSavedState(Parcel, ClassLoader)>
		a = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #31  <Field int a>
		a = parcel.readInt();
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #37  <Method int Parcel.readInt()>
	//   10   16:putfield        #31  <Field int a>
		b = parcel.readInt();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #37  <Method int Parcel.readInt()>
	//   14   24:putfield        #39  <Field int b>
		c = parcel.readInt();
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #37  <Method int Parcel.readInt()>
	//   18   32:putfield        #41  <Field int c>
		e = parcel.readInt();
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #37  <Method int Parcel.readInt()>
	//   22   40:putfield        #43  <Field int e>
		f = parcel.readInt();
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #37  <Method int Parcel.readInt()>
	//   26   48:putfield        #45  <Field int f>
	//   27   51:return          
	}

	public DrawerLayout$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void AbsSavedState(Parcelable)>
		a = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #31  <Field int a>
	//    6   10:return          
	}
}
