// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.os.Parcel;

// Referenced classes of package android.support.v7.preference:
//			EditTextPreference

static final class EditTextPreference$SavedState$1
	implements android.os.Parcelable.Creator
{

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

	EditTextPreference$SavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
