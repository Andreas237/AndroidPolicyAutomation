// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.v7.widget:
//			Toolbar

public static class Toolbar$SavedState extends AbsSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #52  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(expandedMenuItemId);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #43  <Field int expandedMenuItemId>
	//    7   11:invokevirtual   #56  <Method void Parcel.writeInt(int)>
		if(isOverflowOpen)
	//*   8   14:aload_0         
	//*   9   15:getfield        #45  <Field boolean isOverflowOpen>
	//*  10   18:ifeq            26
			i = 1;
	//   11   21:iconst_1        
	//   12   22:istore_2        
		else
	//*  13   23:goto            28
			i = 0;
	//   14   26:iconst_0        
	//   15   27:istore_2        
		parcel.writeInt(i);
	//   16   28:aload_1         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #56  <Method void Parcel.writeInt(int)>
	//   19   33:return          
	}

	public static final android.os.Parcelable$Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

		public Toolbar.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return new Toolbar.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class Toolbar$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #22  <Method void Toolbar$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #25  <Method Toolbar$SavedState createFromParcel(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public Toolbar.SavedState[] newArray(int i)
		{
			return new Toolbar.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       Toolbar.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method Toolbar$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
);
	int expandedMenuItemId;
	boolean isOverflowOpen;

	static 
	{
	//    0    0:new             #9   <Class Toolbar$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Toolbar$SavedState$1()>
	//    3    7:invokestatic    #27  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
	//    4   10:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   5   13:return          
	}

	public Toolbar$SavedState(Parcel parcel)
	{
		this(parcel, ((ClassLoader) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #34  <Method void Toolbar$SavedState(Parcel, ClassLoader)>
	//    4    6:return          
	}

	public Toolbar$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #35  <Method void AbsSavedState(Parcel, ClassLoader)>
		expandedMenuItemId = parcel.readInt();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #41  <Method int Parcel.readInt()>
	//    7   11:putfield        #43  <Field int expandedMenuItemId>
		boolean flag;
		if(parcel.readInt() != 0)
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #41  <Method int Parcel.readInt()>
	//*  10   18:ifeq            26
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_3        
		else
	//*  13   23:goto            28
			flag = false;
	//   14   26:iconst_0        
	//   15   27:istore_3        
		isOverflowOpen = flag;
	//   16   28:aload_0         
	//   17   29:iload_3         
	//   18   30:putfield        #45  <Field boolean isOverflowOpen>
	//   19   33:return          
	}

	public Toolbar$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
