// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.preference:
//			ListPreference

private static class ListPreference$SavedState extends Preference$BaseSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Preference$BaseSavedState.writeToParcel(Parcel, int)>
		parcel.writeString(value);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field String value>
	//    7   11:invokevirtual   #45  <Method void Parcel.writeString(String)>
	//    8   14:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ListPreference.SavedState createFromParcel(Parcel parcel)
		{
			return new ListPreference.SavedState(parcel);
		//    0    0:new             #9   <Class ListPreference$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void ListPreference$SavedState(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method ListPreference$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ListPreference.SavedState[] newArray(int i)
		{
			return new ListPreference.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ListPreference.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method ListPreference$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	String value;

	static 
	{
	//    0    0:new             #9   <Class ListPreference$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void ListPreference$SavedState$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public ListPreference$SavedState(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void Preference$BaseSavedState(Parcel)>
		value = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #31  <Method String Parcel.readString()>
	//    6   10:putfield        #33  <Field String value>
	//    7   13:return          
	}

	public ListPreference$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void Preference$BaseSavedState(Parcelable)>
	//    3    5:return          
	}
}
