// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.os.Parcel;

// Referenced classes of package android.support.v7.preference:
//			Preference

static final class Preference$BaseSavedState$1
	implements android.os.Parcelable.Creator
{

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

	Preference$BaseSavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
