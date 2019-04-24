// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.os.Parcel;

// Referenced classes of package android.support.design.internal:
//			ParcelableSparseArray

static final class ParcelableSparseArray$1
	implements android.os.eator
{

	public ParcelableSparseArray a(Parcel parcel)
	{
		return new ParcelableSparseArray(parcel, ((ClassLoader) (null)));
	//    0    0:new             #9   <Class ParcelableSparseArray>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #19  <Method void ParcelableSparseArray(Parcel, ClassLoader)>
	//    5    9:areturn         
	}

	public ParcelableSparseArray a(Parcel parcel, ClassLoader classloader)
	{
		return new ParcelableSparseArray(parcel, classloader);
	//    0    0:new             #9   <Class ParcelableSparseArray>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #19  <Method void ParcelableSparseArray(Parcel, ClassLoader)>
	//    5    9:areturn         
	}

	public ParcelableSparseArray[] a(int i)
	{
		return new ParcelableSparseArray[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ParcelableSparseArray[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #25  <Method ParcelableSparseArray a(Parcel)>
	//    3    5:areturn         
	}

	public Object createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return ((Object) (a(parcel, classloader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #28  <Method ParcelableSparseArray a(Parcel, ClassLoader)>
	//    4    6:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #32  <Method ParcelableSparseArray[] a(int)>
	//    3    5:areturn         
	}

	ParcelableSparseArray$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
