// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Parcel;

// Referenced classes of package android.support.v4.view:
//			AbsSavedState

static final class AbsSavedState$2
	implements android.os.LoaderCreator
{

	public AbsSavedState createFromParcel(Parcel parcel)
	{
		return createFromParcel(parcel, ((ClassLoader) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #19  <Method AbsSavedState createFromParcel(Parcel, ClassLoader)>
	//    4    6:areturn         
	}

	public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		if(parcel.readParcelable(classloader) == null)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #25  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//*   3    5:ifnonnull       12
			return AbsSavedState.EMPTY_STATE;
	//    4    8:getstatic       #29  <Field AbsSavedState AbsSavedState.EMPTY_STATE>
	//    5   11:areturn         
		else
			throw new IllegalStateException("superState must be null");
	//    6   12:new             #31  <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #33  <String "superState must be null">
	//    9   18:invokespecial   #36  <Method void IllegalStateException(String)>
	//   10   21:athrow          
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #39  <Method AbsSavedState createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return ((Object) (createFromParcel(parcel, classloader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #19  <Method AbsSavedState createFromParcel(Parcel, ClassLoader)>
	//    4    6:areturn         
	}

	public AbsSavedState[] newArray(int i)
	{
		return new AbsSavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       AbsSavedState[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #45  <Method AbsSavedState[] newArray(int)>
	//    3    5:areturn         
	}

	AbsSavedState$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
