// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
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
	//    3    3:invokespecial   #40  <Method void AbsSavedState.writeToParcel(Parcel, int)>
		if(isOpen)
	//*   4    6:aload_0         
	//*   5    7:getfield        #33  <Field boolean isOpen>
	//*   6   10:ifeq            21
			i = 1;
	//    7   13:iconst_1        
	//    8   14:istore_2        
		else
	//*   9   15:aload_1         
	//*  10   16:iload_2         
	//*  11   17:invokevirtual   #44  <Method void Parcel.writeInt(int)>
	//*  12   20:return          
			i = 0;
	//   13   21:iconst_0        
	//   14   22:istore_2        
		parcel.writeInt(i);
	//*  15   23:goto            15
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public SlidingPaneLayout.SavedState createFromParcel(Parcel parcel)
		{
			return new SlidingPaneLayout.SavedState(parcel, ((ClassLoader) (null)));
		//    0    0:new             #9   <Class SlidingPaneLayout$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void SlidingPaneLayout$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public SlidingPaneLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return new SlidingPaneLayout.SavedState(parcel, ((ClassLoader) (null)));
		//    0    0:new             #9   <Class SlidingPaneLayout$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void SlidingPaneLayout$SavedState(Parcel, ClassLoader)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #26  <Method SlidingPaneLayout$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #29  <Method SlidingPaneLayout$SavedState createFromParcel(Parcel, ClassLoader)>
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
		//    2    2:invokevirtual   #34  <Method SlidingPaneLayout$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	boolean isOpen;

	static 
	{
	//    0    0:new             #9   <Class SlidingPaneLayout$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void SlidingPaneLayout$SavedState$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	SlidingPaneLayout$SavedState(Parcel parcel, ClassLoader classloader)
	{
		super(parcel, classloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
		boolean flag;
		if(parcel.readInt() != 0)
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #31  <Method int Parcel.readInt()>
	//*   6   10:ifeq            21
			flag = true;
	//    7   13:iconst_1        
	//    8   14:istore_3        
		else
	//*   9   15:aload_0         
	//*  10   16:iload_3         
	//*  11   17:putfield        #33  <Field boolean isOpen>
	//*  12   20:return          
			flag = false;
	//   13   21:iconst_0        
	//   14   22:istore_3        
		isOpen = flag;
	//*  15   23:goto            15
	}

	SlidingPaneLayout$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
