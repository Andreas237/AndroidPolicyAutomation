// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.Parcel;

// Referenced classes of package android.support.v4.os:
//			ParcelableCompatCreatorCallbacks

public final class ParcelableCompat
{
	static class ParcelableCompatCreatorHoneycombMR2
		implements android.os.Parcelable.ClassLoaderCreator
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

		public Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return mCallbacks.createFromParcel(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ParcelableCompatCreatorCallbacks mCallbacks>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #30  <Method Object ParcelableCompatCreatorCallbacks.createFromParcel(Parcel, ClassLoader)>
		//    5   11:areturn         
		}

		public Object[] newArray(int i)
		{
			return mCallbacks.newArray(i);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ParcelableCompatCreatorCallbacks mCallbacks>
		//    2    4:iload_1         
		//    3    5:invokeinterface #36  <Method Object[] ParcelableCompatCreatorCallbacks.newArray(int)>
		//    4   10:areturn         
		}

		private final ParcelableCompatCreatorCallbacks mCallbacks;

		ParcelableCompatCreatorHoneycombMR2(ParcelableCompatCreatorCallbacks parcelablecompatcreatorcallbacks)
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


	private ParcelableCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static android.os.Parcelable.Creator newCreator(ParcelableCompatCreatorCallbacks parcelablecompatcreatorcallbacks)
	{
		return ((android.os.Parcelable.Creator) (new ParcelableCompatCreatorHoneycombMR2(parcelablecompatcreatorcallbacks)));
	//    0    0:new             #6   <Class ParcelableCompat$ParcelableCompatCreatorHoneycombMR2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #18  <Method void ParcelableCompat$ParcelableCompatCreatorHoneycombMR2(ParcelableCompatCreatorCallbacks)>
	//    4    8:areturn         
	}
}
