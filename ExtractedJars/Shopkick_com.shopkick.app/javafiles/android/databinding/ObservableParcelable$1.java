// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.os.Parcel;

// Referenced classes of package android.databinding:
//			ObservableParcelable

static final class ObservableParcelable$1
	implements android.os.Parcelable.Creator
{

	public ObservableParcelable createFromParcel(Parcel parcel)
	{
		return new ObservableParcelable(parcel.readParcelable(((Object)this).getClass().getClassLoader()));
	//    0    0:new             #9   <Class ObservableParcelable>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #20  <Method Class Object.getClass()>
	//    5    9:invokevirtual   #26  <Method ClassLoader Class.getClassLoader()>
	//    6   12:invokevirtual   #32  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    7   15:invokespecial   #35  <Method void ObservableParcelable(android.os.Parcelable)>
	//    8   18:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #38  <Method ObservableParcelable createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ObservableParcelable[] newArray(int i)
	{
		return new ObservableParcelable[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ObservableParcelable[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #43  <Method ObservableParcelable[] newArray(int)>
	//    3    5:areturn         
	}

	ObservableParcelable$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
