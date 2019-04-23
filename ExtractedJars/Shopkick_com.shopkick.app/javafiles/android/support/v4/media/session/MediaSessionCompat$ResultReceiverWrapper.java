// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat

public static final class MediaSessionCompat$ResultReceiverWrapper
	implements Parcelable
{

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		mResultReceiver.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ResultReceiver mResultReceiver>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #48  <Method void ResultReceiver.writeToParcel(Parcel, int)>
	//    5    9:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MediaSessionCompat.ResultReceiverWrapper createFromParcel(Parcel parcel)
		{
			return new MediaSessionCompat.ResultReceiverWrapper(parcel);
		//    0    0:new             #9   <Class MediaSessionCompat$ResultReceiverWrapper>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void MediaSessionCompat$ResultReceiverWrapper(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method MediaSessionCompat$ResultReceiverWrapper createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public MediaSessionCompat.ResultReceiverWrapper[] newArray(int i)
		{
			return new MediaSessionCompat.ResultReceiverWrapper[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MediaSessionCompat.ResultReceiverWrapper[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method MediaSessionCompat$ResultReceiverWrapper[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	ResultReceiver mResultReceiver;

	static 
	{
	//    0    0:new             #11  <Class MediaSessionCompat$ResultReceiverWrapper$1>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void MediaSessionCompat$ResultReceiverWrapper$1()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	MediaSessionCompat$ResultReceiverWrapper(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		mResultReceiver = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
	//    2    4:aload_0         
	//    3    5:getstatic       #33  <Field android.os.Parcelable$Creator ResultReceiver.CREATOR>
	//    4    8:aload_1         
	//    5    9:invokeinterface #39  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//    6   14:checkcast       #32  <Class ResultReceiver>
	//    7   17:putfield        #41  <Field ResultReceiver mResultReceiver>
	//    8   20:return          
	}

	public MediaSessionCompat$ResultReceiverWrapper(ResultReceiver resultreceiver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		mResultReceiver = resultreceiver;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field ResultReceiver mResultReceiver>
	//    5    9:return          
	}
}
