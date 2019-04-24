// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

// Referenced classes of package android.support.design.internal:
//			ParcelableSparseArray

static final class ParcelableSparseArray$4
	implements ParcelableCompatCreatorCallbacks
{

	public ParcelableSparseArray[] c(int i)
	{
		return new ParcelableSparseArray[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ParcelableSparseArray[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return ((Object) (e(parcel, classloader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #22  <Method ParcelableSparseArray e(Parcel, ClassLoader)>
	//    4    6:areturn         
	}

	public ParcelableSparseArray e(Parcel parcel, ClassLoader classloader)
	{
		return new ParcelableSparseArray(parcel, classloader);
	//    0    0:new             #9   <Class ParcelableSparseArray>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #25  <Method void ParcelableSparseArray(Parcel, ClassLoader)>
	//    5    9:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (c(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #29  <Method ParcelableSparseArray[] c(int)>
	//    3    5:areturn         
	}

	ParcelableSparseArray$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
