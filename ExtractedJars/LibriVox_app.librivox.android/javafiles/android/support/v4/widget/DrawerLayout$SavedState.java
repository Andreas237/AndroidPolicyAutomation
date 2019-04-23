// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.v4.widget:
//			o

public class DrawerLayout$SavedState extends AbsSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #48  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(a);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #27  <Field int a>
	//    7   11:invokevirtual   #52  <Method void Parcel.writeInt(int)>
		parcel.writeInt(b);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #35  <Field int b>
	//   11   19:invokevirtual   #52  <Method void Parcel.writeInt(int)>
		parcel.writeInt(c);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #37  <Field int c>
	//   15   27:invokevirtual   #52  <Method void Parcel.writeInt(int)>
		parcel.writeInt(d);
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #39  <Field int d>
	//   19   35:invokevirtual   #52  <Method void Parcel.writeInt(int)>
		parcel.writeInt(e);
	//   20   38:aload_1         
	//   21   39:aload_0         
	//   22   40:getfield        #41  <Field int e>
	//   23   43:invokevirtual   #52  <Method void Parcel.writeInt(int)>
	//   24   46:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new o();
	int a;
	int b;
	int c;
	int d;
	int e;

	static 
	{
	//    0    0:new             #16  <Class o>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void o()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public DrawerLayout$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
		a = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #27  <Field int a>
		a = parcel.readInt();
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #33  <Method int Parcel.readInt()>
	//   10   16:putfield        #27  <Field int a>
		b = parcel.readInt();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #33  <Method int Parcel.readInt()>
	//   14   24:putfield        #35  <Field int b>
		c = parcel.readInt();
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #33  <Method int Parcel.readInt()>
	//   18   32:putfield        #37  <Field int c>
		d = parcel.readInt();
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #33  <Method int Parcel.readInt()>
	//   22   40:putfield        #39  <Field int d>
		e = parcel.readInt();
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #33  <Method int Parcel.readInt()>
	//   26   48:putfield        #41  <Field int e>
	//   27   51:return          
	}

	public DrawerLayout$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void AbsSavedState(Parcelable)>
		a = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #27  <Field int a>
	//    6   10:return          
	}
}
