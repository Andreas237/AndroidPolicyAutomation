// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, MediaSessionCompatApi21

public static final class MediaSessionCompat$Token
	implements Parcelable
{

	public static MediaSessionCompat$Token fromToken(Object obj)
	{
		if(obj == null || android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
	//*   2    4:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          14
			return null;
	//    5   12:aconst_null     
	//    6   13:areturn         
		else
			return new MediaSessionCompat$Token(MediaSessionCompatApi21.verifyToken(obj));
	//    7   14:new             #2   <Class MediaSessionCompat$Token>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokestatic    #42  <Method Object MediaSessionCompatApi21.verifyToken(Object)>
	//   11   22:invokespecial   #44  <Method void MediaSessionCompat$Token(Object)>
	//   12   25:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof MediaSessionCompat$Token))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class MediaSessionCompat$Token>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((MediaSessionCompat$Token)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class MediaSessionCompat$Token>
	//   12   20:astore_1        
		if(mInner == null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #28  <Field Object mInner>
	//*  15   25:ifnonnull       39
			return ((MediaSessionCompat$Token) (obj)).mInner == null;
	//   16   28:aload_1         
	//   17   29:getfield        #28  <Field Object mInner>
	//   18   32:ifnonnull       37
	//   19   35:iconst_1        
	//   20   36:ireturn         
	//   21   37:iconst_0        
	//   22   38:ireturn         
		if(((MediaSessionCompat$Token) (obj)).mInner == null)
	//*  23   39:aload_1         
	//*  24   40:getfield        #28  <Field Object mInner>
	//*  25   43:ifnonnull       48
			return false;
	//   26   46:iconst_0        
	//   27   47:ireturn         
		else
			return mInner.equals(((MediaSessionCompat$Token) (obj)).mInner);
	//   28   48:aload_0         
	//   29   49:getfield        #28  <Field Object mInner>
	//   30   52:aload_1         
	//   31   53:getfield        #28  <Field Object mInner>
	//   32   56:invokevirtual   #50  <Method boolean Object.equals(Object)>
	//   33   59:ireturn         
	}

	public Object getToken()
	{
		return mInner;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Object mInner>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		if(mInner == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Object mInner>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mInner.hashCode();
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field Object mInner>
	//    7   13:invokevirtual   #55  <Method int Object.hashCode()>
	//    8   16:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          21
		{
			parcel.writeParcelable((Parcelable)mInner, i);
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:getfield        #28  <Field Object mInner>
	//    6   13:checkcast       #6   <Class Parcelable>
	//    7   16:iload_2         
	//    8   17:invokevirtual   #63  <Method void Parcel.writeParcelable(Parcelable, int)>
			return;
	//    9   20:return          
		} else
		{
			parcel.writeStrongBinder((IBinder)mInner);
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:getfield        #28  <Field Object mInner>
	//   13   26:checkcast       #65  <Class IBinder>
	//   14   29:invokevirtual   #69  <Method void Parcel.writeStrongBinder(IBinder)>
			return;
	//   15   32:return          
		}
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MediaSessionCompat.Token createFromParcel(Parcel parcel)
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmplt          17
				parcel = ((Parcel) (parcel.readParcelable(((ClassLoader) (null)))));
		//    3    8:aload_1         
		//    4    9:aconst_null     
		//    5   10:invokevirtual   #31  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//    6   13:astore_1        
			else
		//*   7   14:goto            22
				parcel = ((Parcel) (parcel.readStrongBinder()));
		//    8   17:aload_1         
		//    9   18:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
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

	}
;
	private final Object mInner;

	static 
	{
	//    0    0:new             #11  <Class MediaSessionCompat$Token$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void MediaSessionCompat$Token$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	MediaSessionCompat$Token(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		mInner = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field Object mInner>
	//    5    9:return          
	}
}
