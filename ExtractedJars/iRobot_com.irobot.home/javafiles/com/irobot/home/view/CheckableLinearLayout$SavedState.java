// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.irobot.home.view:
//			CheckableLinearLayout

static class CheckableLinearLayout$SavedState extends android.view.View.BaseSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #48  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
		parcel.writeValue(((Object) (Boolean.valueOf(a))));
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #39  <Field boolean a>
	//    7   11:invokestatic    #52  <Method Boolean Boolean.valueOf(boolean)>
	//    8   14:invokevirtual   #56  <Method void Parcel.writeValue(Object)>
	//    9   17:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public CheckableLinearLayout.SavedState a(Parcel parcel)
		{
			return new CheckableLinearLayout.SavedState(parcel, ((CheckableLinearLayout._cls1) (null)));
		//    0    0:new             #9   <Class CheckableLinearLayout$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void CheckableLinearLayout$SavedState(Parcel, CheckableLinearLayout$1)>
		//    5    9:areturn         
		}

		public CheckableLinearLayout.SavedState[] a(int i)
		{
			return new CheckableLinearLayout.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       CheckableLinearLayout.SavedState[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #27  <Method CheckableLinearLayout$SavedState a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #31  <Method CheckableLinearLayout$SavedState[] a(int)>
		//    3    5:areturn         
		}

	}
;
	boolean a;

	static 
	{
	//    0    0:new             #9   <Class CheckableLinearLayout$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void CheckableLinearLayout$SavedState$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	private CheckableLinearLayout$SavedState(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void android.view.View$BaseSavedState(Parcel)>
		a = ((Boolean)parcel.readValue(((ClassLoader) (null)))).booleanValue();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokevirtual   #31  <Method Object Parcel.readValue(ClassLoader)>
	//    7   11:checkcast       #33  <Class Boolean>
	//    8   14:invokevirtual   #37  <Method boolean Boolean.booleanValue()>
	//    9   17:putfield        #39  <Field boolean a>
	//   10   20:return          
	}

	CheckableLinearLayout$SavedState(Parcel parcel, CheckableLinearLayout._cls1 _pcls1)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void CheckableLinearLayout$SavedState(Parcel)>
	//    3    5:return          
	}

	CheckableLinearLayout$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void android.view.View$BaseSavedState(Parcelable)>
	//    3    5:return          
	}
}
