// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, MediaSessionCompatApi21, IMediaSession

public static final class MediaSessionCompat$Token
	implements Parcelable
{

	public static MediaSessionCompat$Token fromToken(Object obj)
	{
		return fromToken(obj, ((IMediaSession) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #40  <Method MediaSessionCompat$Token fromToken(Object, IMediaSession)>
	//    3    5:areturn         
	}

	public static MediaSessionCompat$Token fromToken(Object obj, IMediaSession imediasession)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          25
	//*   2    4:getstatic       #50  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          25
			return new MediaSessionCompat$Token(MediaSessionCompatApi21.verifyToken(obj), imediasession);
	//    5   12:new             #2   <Class MediaSessionCompat$Token>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:invokestatic    #56  <Method Object MediaSessionCompatApi21.verifyToken(Object)>
	//    9   20:aload_1         
	//   10   21:invokespecial   #30  <Method void MediaSessionCompat$Token(Object, IMediaSession)>
	//   11   24:areturn         
		else
			return null;
	//   12   25:aconst_null     
	//   13   26:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
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
	//*  14   22:getfield        #33  <Field Object mInner>
	//*  15   25:ifnonnull       37
			{
				if(((MediaSessionCompat$Token) (obj)).mInner != null)
	//*  16   28:aload_1         
	//*  17   29:getfield        #33  <Field Object mInner>
	//*  18   32:ifnull          5
					return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
			} else
			if(((MediaSessionCompat$Token) (obj)).mInner == null)
	//*  21   37:aload_1         
	//*  22   38:getfield        #33  <Field Object mInner>
	//*  23   41:ifnonnull       46
				return false;
	//   24   44:iconst_0        
	//   25   45:ireturn         
			else
				return mInner.equals(((MediaSessionCompat$Token) (obj)).mInner);
	//   26   46:aload_0         
	//   27   47:getfield        #33  <Field Object mInner>
	//   28   50:aload_1         
	//   29   51:getfield        #33  <Field Object mInner>
	//   30   54:invokevirtual   #63  <Method boolean Object.equals(Object)>
	//   31   57:ireturn         
		}
		return true;
	}

	public IMediaSession getExtraBinder()
	{
		return mExtraBinder;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field IMediaSession mExtraBinder>
	//    2    4:areturn         
	}

	public Object getToken()
	{
		return mInner;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Object mInner>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		if(mInner == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object mInner>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mInner.hashCode();
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field Object mInner>
	//    7   13:invokevirtual   #70  <Method int Object.hashCode()>
	//    8   16:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #50  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          21
		{
			parcel.writeParcelable((Parcelable)mInner, i);
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:getfield        #33  <Field Object mInner>
	//    6   13:checkcast       #6   <Class Parcelable>
	//    7   16:iload_2         
	//    8   17:invokevirtual   #78  <Method void Parcel.writeParcelable(Parcelable, int)>
			return;
	//    9   20:return          
		} else
		{
			parcel.writeStrongBinder((IBinder)mInner);
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:getfield        #33  <Field Object mInner>
	//   13   26:checkcast       #80  <Class IBinder>
	//   14   29:invokevirtual   #84  <Method void Parcel.writeStrongBinder(IBinder)>
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
		//*   2    5:icmplt          23
				parcel = ((Parcel) (parcel.readParcelable(((ClassLoader) (null)))));
		//    3    8:aload_1         
		//    4    9:aconst_null     
		//    5   10:invokevirtual   #31  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//    6   13:astore_1        
			else
		//*   7   14:new             #9   <Class MediaSessionCompat$Token>
		//*   8   17:dup             
		//*   9   18:aload_1         
		//*  10   19:invokespecial   #34  <Method void MediaSessionCompat$Token(Object)>
		//*  11   22:areturn         
				parcel = ((Parcel) (parcel.readStrongBinder()));
		//   12   23:aload_1         
		//   13   24:invokevirtual   #38  <Method IBinder Parcel.readStrongBinder()>
		//   14   27:astore_1        
			return new MediaSessionCompat.Token(((Object) (parcel)));
		//*  15   28:goto            14
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
	private final IMediaSession mExtraBinder;
	private final Object mInner;

	static 
	{
	//    0    0:new             #11  <Class MediaSessionCompat$Token$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void MediaSessionCompat$Token$1()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	MediaSessionCompat$Token(Object obj)
	{
		this(obj, ((IMediaSession) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #30  <Method void MediaSessionCompat$Token(Object, IMediaSession)>
	//    4    6:return          
	}

	MediaSessionCompat$Token(Object obj, IMediaSession imediasession)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mInner = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field Object mInner>
		mExtraBinder = imediasession;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field IMediaSession mExtraBinder>
	//    8   14:return          
	}
}
