// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
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
	//    3    3:invokespecial   #59  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(firstVisibleChildIndex);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #40  <Field int firstVisibleChildIndex>
	//    7   11:invokevirtual   #63  <Method void Parcel.writeInt(int)>
		parcel.writeFloat(firstVisibleChildPercentageShown);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #46  <Field float firstVisibleChildPercentageShown>
	//   11   19:invokevirtual   #67  <Method void Parcel.writeFloat(float)>
		if(firstVisibleChildAtMinimumHeight)
	//*  12   22:aload_0         
	//*  13   23:getfield        #52  <Field boolean firstVisibleChildAtMinimumHeight>
	//*  14   26:ifeq            38
			i = 1;
	//   15   29:iconst_1        
	//   16   30:istore_2        
		else
	//*  17   31:aload_1         
	//*  18   32:iload_2         
	//*  19   33:int2byte        
	//*  20   34:invokevirtual   #71  <Method void Parcel.writeByte(byte)>
	//*  21   37:return          
			i = 0;
	//   22   38:iconst_0        
	//   23   39:istore_2        
		parcel.writeByte((byte)i);
	//*  24   40:goto            31
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public AppBarLayout.Behavior.SavedState createFromParcel(Parcel parcel)
		{
			return new AppBarLayout.Behavior.SavedState(parcel, ((ClassLoader) (null)));
		//    0    0:new             #9   <Class AppBarLayout$Behavior$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #25  <Method void AppBarLayout$Behavior$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public AppBarLayout.Behavior.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return new AppBarLayout.Behavior.SavedState(parcel, classloader);
		//    0    0:new             #9   <Class AppBarLayout$Behavior$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #25  <Method void AppBarLayout$Behavior$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #29  <Method AppBarLayout$Behavior$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #32  <Method AppBarLayout$Behavior$SavedState createFromParcel(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public AppBarLayout.Behavior.SavedState[] newArray(int i)
		{
			return new AppBarLayout.Behavior.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       AppBarLayout.Behavior.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #37  <Method AppBarLayout$Behavior$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	boolean firstVisibleChildAtMinimumHeight;
	int firstVisibleChildIndex;
	float firstVisibleChildPercentageShown;

	static 
	{
	//    0    0:new             #12  <Class AppBarLayout$Behavior$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void AppBarLayout$Behavior$SavedState$1()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public AppBarLayout$Behavior$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method void AbsSavedState(Parcel, ClassLoader)>
		firstVisibleChildIndex = parcel.readInt();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #38  <Method int Parcel.readInt()>
	//    7   11:putfield        #40  <Field int firstVisibleChildIndex>
		firstVisibleChildPercentageShown = parcel.readFloat();
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #44  <Method float Parcel.readFloat()>
	//   11   19:putfield        #46  <Field float firstVisibleChildPercentageShown>
		boolean flag;
		if(parcel.readByte() != 0)
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #50  <Method byte Parcel.readByte()>
	//*  14   26:ifeq            37
			flag = true;
	//   15   29:iconst_1        
	//   16   30:istore_3        
		else
	//*  17   31:aload_0         
	//*  18   32:iload_3         
	//*  19   33:putfield        #52  <Field boolean firstVisibleChildAtMinimumHeight>
	//*  20   36:return          
			flag = false;
	//   21   37:iconst_0        
	//   22   38:istore_3        
		firstVisibleChildAtMinimumHeight = flag;
	//*  23   39:goto            31
	}

	public AppBarLayout$Behavior$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #55  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
