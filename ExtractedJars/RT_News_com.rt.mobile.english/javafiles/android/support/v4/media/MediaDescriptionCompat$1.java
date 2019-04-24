// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media:
//			MediaDescriptionCompat, MediaDescriptionCompatApi21

static final class MediaDescriptionCompat$1
	implements android.os.Parcelable.Creator
{

	public MediaDescriptionCompat createFromParcel(Parcel parcel)
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          17
			return new MediaDescriptionCompat(parcel);
	//    3    8:new             #9   <Class MediaDescriptionCompat>
	//    4   11:dup             
	//    5   12:aload_1         
	//    6   13:invokespecial   #25  <Method void MediaDescriptionCompat(Parcel)>
	//    7   16:areturn         
		else
			return MediaDescriptionCompat.fromMediaDescription(MediaDescriptionCompatApi21.fromParcel(parcel));
	//    8   17:aload_1         
	//    9   18:invokestatic    #31  <Method Object MediaDescriptionCompatApi21.fromParcel(Parcel)>
	//   10   21:invokestatic    #35  <Method MediaDescriptionCompat MediaDescriptionCompat.fromMediaDescription(Object)>
	//   11   24:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #37  <Method MediaDescriptionCompat createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public MediaDescriptionCompat[] newArray(int i)
	{
		return new MediaDescriptionCompat[i];
	//    0    0:iload_1         
	//    1    1:anewarray       MediaDescriptionCompat[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #42  <Method MediaDescriptionCompat[] newArray(int)>
	//    3    5:areturn         
	}

	MediaDescriptionCompat$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
