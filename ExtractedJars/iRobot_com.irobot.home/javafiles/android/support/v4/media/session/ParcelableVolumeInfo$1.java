// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media.session:
//			ParcelableVolumeInfo

static final class ParcelableVolumeInfo$1
	implements android.os.Parcelable.Creator
{

	public ParcelableVolumeInfo a(Parcel parcel)
	{
		return new ParcelableVolumeInfo(parcel);
	//    0    0:new             #9   <Class ParcelableVolumeInfo>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #19  <Method void ParcelableVolumeInfo(Parcel)>
	//    4    8:areturn         
	}

	public ParcelableVolumeInfo[] a(int i)
	{
		return new ParcelableVolumeInfo[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ParcelableVolumeInfo[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #24  <Method ParcelableVolumeInfo a(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #28  <Method ParcelableVolumeInfo[] a(int)>
	//    3    5:areturn         
	}

	ParcelableVolumeInfo$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
