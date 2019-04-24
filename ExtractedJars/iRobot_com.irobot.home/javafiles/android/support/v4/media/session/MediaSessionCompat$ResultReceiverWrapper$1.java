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

	MediaSessionCompat$ResultReceiverWrapper$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
