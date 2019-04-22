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
	//    3    3:invokespecial   #55  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(openDrawerGravity);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field int openDrawerGravity>
	//    7   11:invokevirtual   #59  <Method void Parcel.writeInt(int)>
		parcel.writeInt(lockModeLeft);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #41  <Field int lockModeLeft>
	//   11   19:invokevirtual   #59  <Method void Parcel.writeInt(int)>
		parcel.writeInt(lockModeRight);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #43  <Field int lockModeRight>
	//   15   27:invokevirtual   #59  <Method void Parcel.writeInt(int)>
		parcel.writeInt(lockModeStart);
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #45  <Field int lockModeStart>
	//   19   35:invokevirtual   #59  <Method void Parcel.writeInt(int)>
		parcel.writeInt(lockModeEnd);
	//   20   38:aload_1         
	//   21   39:aload_0         
	//   22   40:getfield        #47  <Field int lockModeEnd>
	//   23   43:invokevirtual   #59  <Method void Parcel.writeInt(int)>
	//   24   46:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public DrawerLayout.SavedState createFromParcel(Parcel parcel)
		{
			return new DrawerLayout.SavedState(parcel, ((ClassLoader) (null)));
		//    0    0:new             #9   <Class DrawerLayout$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void DrawerLayout$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public DrawerLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return new DrawerLayout.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class DrawerLayout$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #22  <Method void DrawerLayout$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #26  <Method DrawerLayout$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #29  <Method DrawerLayout$SavedState createFromParcel(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public DrawerLayout.SavedState[] newArray(int i)
		{
			return new DrawerLayout.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       DrawerLayout.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #34  <Method DrawerLayout$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	int lockModeEnd;
	int lockModeLeft;
	int lockModeRight;
	int lockModeStart;
	int openDrawerGravity;

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
	//    3    3:invokespecial   #31  <Method void AbsSavedState(Parcel, ClassLoader)>
		openDrawerGravity = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #33  <Field int openDrawerGravity>
		openDrawerGravity = parcel.readInt();
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #39  <Method int Parcel.readInt()>
	//   10   16:putfield        #33  <Field int openDrawerGravity>
		lockModeLeft = parcel.readInt();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #39  <Method int Parcel.readInt()>
	//   14   24:putfield        #41  <Field int lockModeLeft>
		lockModeRight = parcel.readInt();
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #39  <Method int Parcel.readInt()>
	//   18   32:putfield        #43  <Field int lockModeRight>
		lockModeStart = parcel.readInt();
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #39  <Method int Parcel.readInt()>
	//   22   40:putfield        #45  <Field int lockModeStart>
		lockModeEnd = parcel.readInt();
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #39  <Method int Parcel.readInt()>
	//   26   48:putfield        #47  <Field int lockModeEnd>
	//   27   51:return          
	}

	public DrawerLayout$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method void AbsSavedState(Parcelable)>
		openDrawerGravity = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #33  <Field int openDrawerGravity>
	//    6   10:return          
	}
}
