// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.Parcel;

// Referenced classes of package android.support.v4.os:
//			ParcelableCompatCreatorHoneycombMR2Stub, ParcelableCompatCreatorCallbacks

public final class ParcelableCompat
{
	static class CompatCreator
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

		public CompatCreator(ParcelableCompatCreatorCallbacks parcelablecompatcreatorcallbacks)
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
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static android.os.Parcelable.Creator newCreator(ParcelableCompatCreatorCallbacks parcelablecompatcreatorcallbacks)
	{
		if(android.os.Build.VERSION.SDK_INT >= 13)
	//*   0    0:getstatic       #20  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          13
	//*   2    5:icmplt          13
			return ParcelableCompatCreatorHoneycombMR2Stub.instantiate(parcelablecompatcreatorcallbacks);
	//    3    8:aload_0         
	//    4    9:invokestatic    #25  <Method android.os.Parcelable$Creator ParcelableCompatCreatorHoneycombMR2Stub.instantiate(ParcelableCompatCreatorCallbacks)>
	//    5   12:areturn         
		else
			return ((android.os.Parcelable.Creator) (new CompatCreator(parcelablecompatcreatorcallbacks)));
	//    6   13:new             #6   <Class ParcelableCompat$CompatCreator>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #28  <Method void ParcelableCompat$CompatCreator(ParcelableCompatCreatorCallbacks)>
	//   10   21:areturn         
	}
}
