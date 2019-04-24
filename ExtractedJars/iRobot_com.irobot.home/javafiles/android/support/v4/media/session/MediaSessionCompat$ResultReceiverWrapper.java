// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat

static final class MediaSessionCompat$ResultReceiverWrapper
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
		a.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ResultReceiver a>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #43  <Method void ResultReceiver.writeToParcel(Parcel, int)>
	//    5    9:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MediaSessionCompat.ResultReceiverWrapper a(Parcel parcel)
		{
			return new MediaSessionCompat.ResultReceiverWrapper(parcel);
		//    0    0:new             #9   <Class MediaSessionCompat$ResultReceiverWrapper>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void MediaSessionCompat$ResultReceiverWrapper(Parcel)>
		//    4    8:areturn         
		}

		public MediaSessionCompat.ResultReceiverWrapper[] a(int i)
		{
			return new MediaSessionCompat.ResultReceiverWrapper[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MediaSessionCompat.ResultReceiverWrapper[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #27  <Method MediaSessionCompat$ResultReceiverWrapper a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #31  <Method MediaSessionCompat$ResultReceiverWrapper[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private ResultReceiver a;

	static 
	{
	//    0    0:new             #11  <Class MediaSessionCompat$ResultReceiverWrapper$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void MediaSessionCompat$ResultReceiverWrapper$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	MediaSessionCompat$ResultReceiverWrapper(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
	//    2    4:aload_0         
	//    3    5:getstatic       #29  <Field android.os.Parcelable$Creator ResultReceiver.CREATOR>
	//    4    8:aload_1         
	//    5    9:invokeinterface #35  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//    6   14:checkcast       #28  <Class ResultReceiver>
	//    7   17:putfield        #37  <Field ResultReceiver a>
	//    8   20:return          
	}
}
