// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.mediacenter.localmusic;

import android.os.Parcel;

// Referenced classes of package com.android.mediacenter.localmusic:
//			NetSongInfo

static final class NetSongInfo$1
	implements android.os.ator
{

	public NetSongInfo createFromParcel(Parcel parcel)
	{
		return new NetSongInfo();
	//    0    0:new             #9   <Class NetSongInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void NetSongInfo()>
	//    3    7:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #20  <Method NetSongInfo createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public NetSongInfo[] newArray(int i)
	{
		return new NetSongInfo[i];
	//    0    0:iload_1         
	//    1    1:anewarray       NetSongInfo[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #25  <Method NetSongInfo[] newArray(int)>
	//    3    5:areturn         
	}

	NetSongInfo$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
