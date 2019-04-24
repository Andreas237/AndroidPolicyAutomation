// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat

static final class MediaSessionCompat$Token$1
	implements android.os.Parcelable.Creator
{

	public MediaSessionCompat.Token createFromParcel(Parcel parcel)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          17
			parcel = ((Parcel) (parcel.readParcelable(((ClassLoader) (null)))));
	//    3    8:aload_1         
	//    4    9:aconst_null     
	//    5   10:invokevirtual   #31  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    6   13:astore_1        
		else
	//*   7   14:goto            22
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//    8   17:aload_1         
	//    9   18:invokevirtual   #35  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   10   21:astore_1        
		return new MediaSessionCompat.Token(((Object) (parcel)));
	//   11   22:new             #9   <Class MediaSessionCompat$Token>
	//   12   25:dup             
	//   13   26:aload_1         
	//   14   27:invokespecial   #38  <Method void MediaSessionCompat$Token(Object)>
	//   15   30:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #41  <Method MediaSessionCompat$Token createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public MediaSessionCompat.Token[] newArray(int i)
	{
		return new MediaSessionCompat.Token[i];
	//    0    0:iload_1         
	//    1    1:anewarray       MediaSessionCompat.Token[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #46  <Method MediaSessionCompat$Token[] newArray(int)>
	//    3    5:areturn         
	}

	MediaSessionCompat$Token$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
