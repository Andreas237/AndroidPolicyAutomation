// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.Parcel;

// Referenced classes of package android.support.v4.os:
//			ParcelableCompat, ParcelableCompatCreatorCallbacks

static class ParcelableCompat$CompatCreator
	implements android.os.Parcelable.Creator
{

	public Object createFromParcel(Parcel parcel)
	{
		return mCallbacks.createFromParcel(parcel, ((ClassLoader) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ParcelableCompatCreatorCallbacks mCallbacks>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokeinterface #30  <Method Object ParcelableCompatCreatorCallbacks.createFromParcel(Parcel, ClassLoader)>
	//    5   11:areturn         
	}

	public Object[] newArray(int i)
	{
		return mCallbacks.newArray(i);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ParcelableCompatCreatorCallbacks mCallbacks>
	//    2    4:iload_1         
	//    3    5:invokeinterface #35  <Method Object[] ParcelableCompatCreatorCallbacks.newArray(int)>
	//    4   10:areturn         
	}

	final ParcelableCompatCreatorCallbacks mCallbacks;

	public ParcelableCompat$CompatCreator(ParcelableCompatCreatorCallbacks parcelablecompatcreatorcallbacks)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mCallbacks = parcelablecompatcreatorcallbacks;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field ParcelableCompatCreatorCallbacks mCallbacks>
	//    5    9:return          
	}
}
