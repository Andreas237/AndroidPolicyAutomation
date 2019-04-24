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

	public PlaybackStateCompat.CustomAction a(Parcel parcel)
	{
		return new PlaybackStateCompat.CustomAction(parcel);
	//    0    0:new             #9   <Class PlaybackStateCompat$CustomAction>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #22  <Method void PlaybackStateCompat$CustomAction(Parcel)>
	//    4    8:areturn         
	}

	public PlaybackStateCompat.CustomAction[] a(int i)
	{
		return new PlaybackStateCompat.CustomAction[i];
	//    0    0:iload_1         
	//    1    1:anewarray       PlaybackStateCompat.CustomAction[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #27  <Method PlaybackStateCompat$CustomAction a(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #31  <Method PlaybackStateCompat$CustomAction[] a(int)>
	//    3    5:areturn         
	}

	PlaybackStateCompat$CustomAction$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
