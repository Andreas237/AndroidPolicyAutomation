// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;

// Referenced classes of package android.support.v4.media.session:
//			az

public final class MediaSessionCompat$ResultReceiverWrapper
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
	//    1    1:getfield        #33  <Field ResultReceiver a>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #39  <Method void ResultReceiver.writeToParcel(Parcel, int)>
	//    5    9:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new az();
	ResultReceiver a;

	static 
	{
	//    0    0:new             #14  <Class az>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void az()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	MediaSessionCompat$ResultReceiverWrapper(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		a = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
	//    2    4:aload_0         
	//    3    5:getstatic       #25  <Field android.os.Parcelable$Creator ResultReceiver.CREATOR>
	//    4    8:aload_1         
	//    5    9:invokeinterface #31  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//    6   14:checkcast       #24  <Class ResultReceiver>
	//    7   17:putfield        #33  <Field ResultReceiver a>
	//    8   20:return          
	}
}
