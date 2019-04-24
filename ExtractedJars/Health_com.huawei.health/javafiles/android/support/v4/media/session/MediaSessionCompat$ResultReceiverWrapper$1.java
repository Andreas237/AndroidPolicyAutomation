// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat

static final class MediaSessionCompat$ResultReceiverWrapper$1
	implements android.os.Parcelable.Creator
{

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

	MediaSessionCompat$ResultReceiverWrapper$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
