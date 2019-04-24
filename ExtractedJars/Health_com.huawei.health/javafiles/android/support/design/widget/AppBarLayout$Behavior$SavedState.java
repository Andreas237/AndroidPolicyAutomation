// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.AbsSavedState;

// Referenced classes of package android.support.design.widget:
//			AppBarLayout

protected static class AppBarLayout$Behavior$SavedState extends AbsSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #65  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(firstVisibleChildIndex);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #46  <Field int firstVisibleChildIndex>
	//    7   11:invokevirtual   #69  <Method void Parcel.writeInt(int)>
		parcel.writeFloat(firstVisibleChildPercentageShown);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #52  <Field float firstVisibleChildPercentageShown>
	//   11   19:invokevirtual   #73  <Method void Parcel.writeFloat(float)>
		if(firstVisibleChildAtMinimumHeight)
	//*  12   22:aload_0         
	//*  13   23:getfield        #58  <Field boolean firstVisibleChildAtMinimumHeight>
	//*  14   26:ifeq            34
			i = 1;
	//   15   29:iconst_1        
	//   16   30:istore_2        
		else
	//*  17   31:goto            36
			i = 0;
	//   18   34:iconst_0        
	//   19   35:istore_2        
		parcel.writeByte((byte)i);
	//   20   36:aload_1         
	//   21   37:iload_2         
	//   22   38:int2byte        
	//   23   39:invokevirtual   #77  <Method void Parcel.writeByte(byte)>
	//   24   42:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

		public AppBarLayout.Behavior.SavedState b(Parcel parcel, ClassLoader classloader)
		{
			return new AppBarLayout.Behavior.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class AppBarLayout$Behavior$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #25  <Method void AppBarLayout$Behavior$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public AppBarLayout.Behavior.SavedState[] c(int i)
		{
			return new AppBarLayout.Behavior.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       AppBarLayout.Behavior.SavedState[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (b(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #31  <Method AppBarLayout$Behavior$SavedState b(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (c(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #35  <Method AppBarLayout$Behavior$SavedState[] c(int)>
		//    3    5:areturn         
		}

	}
);
	boolean firstVisibleChildAtMinimumHeight;
	int firstVisibleChildIndex;
	float firstVisibleChildPercentageShown;

	static 
	{
	//    0    0:new             #12  <Class AppBarLayout$Behavior$SavedState$4>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void AppBarLayout$Behavior$SavedState$4()>
	//    3    7:invokestatic    #32  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
	//    4   10:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
	//*   5   13:return          
	}

	public AppBarLayout$Behavior$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #38  <Method void AbsSavedState(Parcel, ClassLoader)>
		firstVisibleChildIndex = parcel.readInt();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #44  <Method int Parcel.readInt()>
	//    7   11:putfield        #46  <Field int firstVisibleChildIndex>
		firstVisibleChildPercentageShown = parcel.readFloat();
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #50  <Method float Parcel.readFloat()>
	//   11   19:putfield        #52  <Field float firstVisibleChildPercentageShown>
		boolean flag;
		if(parcel.readByte() != 0)
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #56  <Method byte Parcel.readByte()>
	//*  14   26:ifeq            34
			flag = true;
	//   15   29:iconst_1        
	//   16   30:istore_3        
		else
	//*  17   31:goto            36
			flag = false;
	//   18   34:iconst_0        
	//   19   35:istore_3        
		firstVisibleChildAtMinimumHeight = flag;
	//   20   36:aload_0         
	//   21   37:iload_3         
	//   22   38:putfield        #58  <Field boolean firstVisibleChildAtMinimumHeight>
	//   23   41:return          
	}

	public AppBarLayout$Behavior$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #61  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
