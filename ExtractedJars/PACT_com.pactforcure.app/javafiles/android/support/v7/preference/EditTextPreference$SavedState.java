// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.preference:
//			EditTextPreference

private static class EditTextPreference$SavedState extends Preference.BaseSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #40  <Method void Preference$BaseSavedState.writeToParcel(Parcel, int)>
		parcel.writeString(text);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field String text>
	//    7   11:invokevirtual   #44  <Method void Parcel.writeString(String)>
	//    8   14:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public EditTextPreference.SavedState createFromParcel(Parcel parcel)
		{
			return new EditTextPreference.SavedState(parcel);
		//    0    0:new             #9   <Class EditTextPreference$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void EditTextPreference$SavedState(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method EditTextPreference$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public EditTextPreference.SavedState[] newArray(int i)
		{
			return new EditTextPreference.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       EditTextPreference.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method EditTextPreference$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	String text;

	static 
	{
	//    0    0:new             #9   <Class EditTextPreference$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void EditTextPreference$SavedState$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public EditTextPreference$SavedState(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void Preference$BaseSavedState(Parcel)>
		text = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #31  <Method String Parcel.readString()>
	//    6   10:putfield        #33  <Field String text>
	//    7   13:return          
	}

	public EditTextPreference$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void Preference$BaseSavedState(Parcelable)>
	//    3    5:return          
	}
}
