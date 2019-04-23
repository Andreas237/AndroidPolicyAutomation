// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media.session:
//			PlaybackStateCompat

static final class PlaybackStateCompat$CustomAction$1
	implements android.os.Parcelable.Creator
{

	public PlaybackStateCompat.CustomAction createFromParcel(Parcel parcel)
	{
		return new PlaybackStateCompat.CustomAction(parcel);
	//    0    0:new             #9   <Class PlaybackStateCompat$CustomAction>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #22  <Method void PlaybackStateCompat$CustomAction(Parcel)>
	//    4    8:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #25  <Method PlaybackStateCompat$CustomAction createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public PlaybackStateCompat.CustomAction[] newArray(int i)
	{
		return new PlaybackStateCompat.CustomAction[i];
	//    0    0:iload_1         
	//    1    1:anewarray       PlaybackStateCompat.CustomAction[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #30  <Method PlaybackStateCompat$CustomAction[] newArray(int)>
	//    3    5:areturn         
	}

	PlaybackStateCompat$CustomAction$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
