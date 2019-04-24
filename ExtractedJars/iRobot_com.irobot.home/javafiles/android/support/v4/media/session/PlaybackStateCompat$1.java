// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media.session:
//			PlaybackStateCompat

static final class PlaybackStateCompat$1
	implements android.os.Parcelable.Creator
{

	public PlaybackStateCompat a(Parcel parcel)
	{
		return new PlaybackStateCompat(parcel);
	//    0    0:new             #9   <Class PlaybackStateCompat>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #19  <Method void PlaybackStateCompat(Parcel)>
	//    4    8:areturn         
	}

	public PlaybackStateCompat[] a(int i)
	{
		return new PlaybackStateCompat[i];
	//    0    0:iload_1         
	//    1    1:anewarray       PlaybackStateCompat[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #24  <Method PlaybackStateCompat a(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #28  <Method PlaybackStateCompat[] a(int)>
	//    3    5:areturn         
	}

	PlaybackStateCompat$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
