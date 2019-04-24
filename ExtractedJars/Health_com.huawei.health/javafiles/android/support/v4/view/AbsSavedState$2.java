// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

// Referenced classes of package android.support.v4.view:
//			AbsSavedState

static final class AbsSavedState$2
	implements ParcelableCompatCreatorCallbacks
{

	public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		if(parcel.readParcelable(classloader) != null)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #22  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//*   3    5:ifnull          18
			throw new IllegalStateException("superState must be null");
	//    4    8:new             #24  <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #26  <String "superState must be null">
	//    7   14:invokespecial   #29  <Method void IllegalStateException(String)>
	//    8   17:athrow          
		else
			return AbsSavedState.EMPTY_STATE;
	//    9   18:getstatic       #33  <Field AbsSavedState AbsSavedState.EMPTY_STATE>
	//   10   21:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return ((Object) (createFromParcel(parcel, classloader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #36  <Method AbsSavedState createFromParcel(Parcel, ClassLoader)>
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
	//    2    2:invokevirtual   #41  <Method AbsSavedState[] newArray(int)>
	//    3    5:areturn         
	}

	AbsSavedState$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
