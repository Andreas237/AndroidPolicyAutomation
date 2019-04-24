// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

// Referenced classes of package android.support.v7.preference:
//			Preference

public static class Preference$BaseSavedState extends AbsSavedState
{

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Preference.BaseSavedState createFromParcel(Parcel parcel)
		{
			return new Preference.BaseSavedState(parcel);
		//    0    0:new             #9   <Class Preference$BaseSavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void Preference$BaseSavedState(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method Preference$BaseSavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public Preference.BaseSavedState[] newArray(int i)
		{
			return new Preference.BaseSavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       Preference.BaseSavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method Preference$BaseSavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;

	static 
	{
	//    0    0:new             #9   <Class Preference$BaseSavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void Preference$BaseSavedState$1()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public Preference$BaseSavedState(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void AbsSavedState(Parcel)>
	//    3    5:return          
	}

	public Preference$BaseSavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void AbsSavedState(Parcelable)>
	//    3    5:return          
	}
}
