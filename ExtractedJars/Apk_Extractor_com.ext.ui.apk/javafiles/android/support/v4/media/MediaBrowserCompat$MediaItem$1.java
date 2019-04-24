// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

static final class MediaBrowserCompat$MediaItem$1
	implements android.os.Parcelable.Creator
{

	public MediaBrowserCompat.MediaItem createFromParcel(Parcel parcel)
	{
		return new MediaBrowserCompat.MediaItem(parcel);
	//    0    0:new             #9   <Class MediaBrowserCompat$MediaItem>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #22  <Method void MediaBrowserCompat$MediaItem(Parcel)>
	//    4    8:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #25  <Method MediaBrowserCompat$MediaItem createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public MediaBrowserCompat.MediaItem[] newArray(int i)
	{
		return new MediaBrowserCompat.MediaItem[i];
	//    0    0:iload_1         
	//    1    1:anewarray       MediaBrowserCompat.MediaItem[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #30  <Method MediaBrowserCompat$MediaItem[] newArray(int)>
	//    3    5:areturn         
	}

	MediaBrowserCompat$MediaItem$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
