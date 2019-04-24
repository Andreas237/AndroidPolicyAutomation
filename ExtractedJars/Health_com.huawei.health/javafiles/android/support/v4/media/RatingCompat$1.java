// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media:
//			RatingCompat

static final class RatingCompat$1
	implements android.os.tor
{

	public RatingCompat createFromParcel(Parcel parcel)
	{
		return new RatingCompat(parcel.readInt(), parcel.readFloat());
	//    0    0:new             #9   <Class RatingCompat>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method int Parcel.readInt()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #26  <Method float Parcel.readFloat()>
	//    6   12:invokespecial   #29  <Method void RatingCompat(int, float)>
	//    7   15:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #32  <Method RatingCompat createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public RatingCompat[] newArray(int i)
	{
		return new RatingCompat[i];
	//    0    0:iload_1         
	//    1    1:anewarray       RatingCompat[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #37  <Method RatingCompat[] newArray(int)>
	//    3    5:areturn         
	}

	RatingCompat$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
