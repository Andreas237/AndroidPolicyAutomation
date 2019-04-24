// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.v4.widget:
//			SlidingPaneLayout

static class SlidingPaneLayout$SavedState extends AbsSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		if(isOpen)
	//*   4    6:aload_0         
	//*   5    7:getfield        #39  <Field boolean isOpen>
	//*   6   10:ifeq            18
			i = 1;
	//    7   13:iconst_1        
	//    8   14:istore_2        
		else
	//*   9   15:goto            20
			i = 0;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		parcel.writeInt(i);
	//   12   20:aload_1         
	//   13   21:iload_2         
	//   14   22:invokevirtual   #50  <Method void Parcel.writeInt(int)>
	//   15   25:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

		public SlidingPaneLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return new SlidingPaneLayout.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class SlidingPaneLayout$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #22  <Method void SlidingPaneLayout$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #25  <Method SlidingPaneLayout$SavedState createFromParcel(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public SlidingPaneLayout.SavedState[] newArray(int i)
		{
			return new SlidingPaneLayout.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       SlidingPaneLayout.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method SlidingPaneLayout$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
);
	boolean isOpen;

	static 
	{
	//    0    0:new             #9   <Class SlidingPaneLayout$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void SlidingPaneLayout$SavedState$1()>
	//    3    7:invokestatic    #25  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
	//    4   10:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   5   13:return          
	}

	SlidingPaneLayout$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void AbsSavedState(Parcel, ClassLoader)>
		boolean flag;
		if(parcel.readInt() != 0)
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #37  <Method int Parcel.readInt()>
	//*   6   10:ifeq            18
			flag = true;
	//    7   13:iconst_1        
	//    8   14:istore_3        
		else
	//*   9   15:goto            20
			flag = false;
	//   10   18:iconst_0        
	//   11   19:istore_3        
		isOpen = flag;
	//   12   20:aload_0         
	//   13   21:iload_3         
	//   14   22:putfield        #39  <Field boolean isOpen>
	//   15   25:return          
	}

	SlidingPaneLayout$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
