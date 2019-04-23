// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.support.v4.app.BundleCompat;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, MediaSessionCompatApi21, IMediaSession

public static final class MediaSessionCompat$Token
	implements Parcelable
{

	public static MediaSessionCompat$Token fromBundle(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		IMediaSession imediasession = IMediaSession.Stub.asInterface(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
	//    4    6:aload_0         
	//    5    7:ldc1            #48  <String "android.support.v4.media.session.EXTRA_BINDER">
	//    6    9:invokestatic    #54  <Method IBinder BundleCompat.getBinder(Bundle, String)>
	//    7   12:invokestatic    #60  <Method IMediaSession IMediaSession$Stub.asInterface(IBinder)>
	//    8   15:astore_1        
		Bundle bundle1 = bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
	//    9   16:aload_0         
	//   10   17:ldc1            #62  <String "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE">
	//   11   19:invokevirtual   #68  <Method Bundle Bundle.getBundle(String)>
	//   12   22:astore_2        
		bundle = ((Bundle) ((MediaSessionCompat$Token)bundle.getParcelable("android.support.v4.media.session.TOKEN")));
	//   13   23:aload_0         
	//   14   24:ldc1            #70  <String "android.support.v4.media.session.TOKEN">
	//   15   26:invokevirtual   #74  <Method Parcelable Bundle.getParcelable(String)>
	//   16   29:checkcast       #2   <Class MediaSessionCompat$Token>
	//   17   32:astore_0        
		if(bundle == null)
	//*  18   33:aload_0         
	//*  19   34:ifnonnull       39
			return null;
	//   20   37:aconst_null     
	//   21   38:areturn         
		else
			return new MediaSessionCompat$Token(((MediaSessionCompat$Token) (bundle)).mInner, imediasession, bundle1);
	//   22   39:new             #2   <Class MediaSessionCompat$Token>
	//   23   42:dup             
	//   24   43:aload_0         
	//   25   44:getfield        #36  <Field Object mInner>
	//   26   47:aload_1         
	//   27   48:aload_2         
	//   28   49:invokespecial   #32  <Method void MediaSessionCompat$Token(Object, IMediaSession, Bundle)>
	//   29   52:areturn         
	}

	public static MediaSessionCompat$Token fromToken(Object obj)
	{
		return fromToken(obj, ((IMediaSession) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #80  <Method MediaSessionCompat$Token fromToken(Object, IMediaSession)>
	//    3    5:areturn         
	}

	public static MediaSessionCompat$Token fromToken(Object obj, IMediaSession imediasession)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          25
	//*   2    4:getstatic       #86  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          25
			return new MediaSessionCompat$Token(MediaSessionCompatApi21.verifyToken(obj), imediasession);
	//    5   12:new             #2   <Class MediaSessionCompat$Token>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:invokestatic    #92  <Method Object MediaSessionCompatApi21.verifyToken(Object)>
	//    9   20:aload_1         
	//   10   21:invokespecial   #94  <Method void MediaSessionCompat$Token(Object, IMediaSession)>
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
		Object obj1 = ((Object) ((MediaSessionCompat$Token)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class MediaSessionCompat$Token>
	//   12   20:astore_2        
		obj = mInner;
	//   13   21:aload_0         
	//   14   22:getfield        #36  <Field Object mInner>
	//   15   25:astore_1        
		if(obj == null)
	//*  16   26:aload_1         
	//*  17   27:ifnonnull       41
			return ((MediaSessionCompat$Token) (obj1)).mInner == null;
	//   18   30:aload_2         
	//   19   31:getfield        #36  <Field Object mInner>
	//   20   34:ifnonnull       39
	//   21   37:iconst_1        
	//   22   38:ireturn         
	//   23   39:iconst_0        
	//   24   40:ireturn         
		obj1 = ((MediaSessionCompat$Token) (obj1)).mInner;
	//   25   41:aload_2         
	//   26   42:getfield        #36  <Field Object mInner>
	//   27   45:astore_2        
		if(obj1 == null)
	//*  28   46:aload_2         
	//*  29   47:ifnonnull       52
			return false;
	//   30   50:iconst_0        
	//   31   51:ireturn         
		else
			return obj.equals(obj1);
	//   32   52:aload_1         
	//   33   53:aload_2         
	//   34   54:invokevirtual   #100 <Method boolean Object.equals(Object)>
	//   35   57:ireturn         
	}

	public IMediaSession getExtraBinder()
	{
		return mExtraBinder;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field IMediaSession mExtraBinder>
	//    2    4:areturn         
	}

	public Bundle getSessionToken2Bundle()
	{
		return mSessionToken2Bundle;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Bundle mSessionToken2Bundle>
	//    2    4:areturn         
	}

	public Object getToken()
	{
		return mInner;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Object mInner>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		Object obj = mInner;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Object mInner>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return obj.hashCode();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #109 <Method int Object.hashCode()>
	//    9   15:ireturn         
	}

	public void setExtraBinder(IMediaSession imediasession)
	{
		mExtraBinder = imediasession;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field IMediaSession mExtraBinder>
	//    3    5:return          
	}

	public void setSessionToken2Bundle(Bundle bundle)
	{
		mSessionToken2Bundle = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field Bundle mSessionToken2Bundle>
	//    3    5:return          
	}

	public Bundle toBundle()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #64  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #115 <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putParcelable("android.support.v4.media.session.TOKEN", ((Parcelable) (this)));
	//    4    8:aload_1         
	//    5    9:ldc1            #70  <String "android.support.v4.media.session.TOKEN">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #119 <Method void Bundle.putParcelable(String, Parcelable)>
		Object obj = ((Object) (mExtraBinder));
	//    8   15:aload_0         
	//    9   16:getfield        #38  <Field IMediaSession mExtraBinder>
	//   10   19:astore_2        
		if(obj != null)
	//*  11   20:aload_2         
	//*  12   21:ifnull          36
			BundleCompat.putBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER", ((IMediaSession) (obj)).asBinder());
	//   13   24:aload_1         
	//   14   25:ldc1            #48  <String "android.support.v4.media.session.EXTRA_BINDER">
	//   15   27:aload_2         
	//   16   28:invokeinterface #125 <Method IBinder IMediaSession.asBinder()>
	//   17   33:invokestatic    #129 <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
		obj = ((Object) (mSessionToken2Bundle));
	//   18   36:aload_0         
	//   19   37:getfield        #40  <Field Bundle mSessionToken2Bundle>
	//   20   40:astore_2        
		if(obj != null)
	//*  21   41:aload_2         
	//*  22   42:ifnull          52
			bundle.putBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE", ((Bundle) (obj)));
	//   23   45:aload_1         
	//   24   46:ldc1            #62  <String "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE">
	//   25   48:aload_2         
	//   26   49:invokevirtual   #133 <Method void Bundle.putBundle(String, Bundle)>
		return bundle;
	//   27   52:aload_1         
	//   28   53:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #86  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          21
		{
			parcel.writeParcelable((Parcelable)mInner, i);
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:getfield        #36  <Field Object mInner>
	//    6   13:checkcast       #6   <Class Parcelable>
	//    7   16:iload_2         
	//    8   17:invokevirtual   #141 <Method void Parcel.writeParcelable(Parcelable, int)>
			return;
	//    9   20:return          
		} else
		{
			parcel.writeStrongBinder((IBinder)mInner);
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:getfield        #36  <Field Object mInner>
	//   13   26:checkcast       #143 <Class IBinder>
	//   14   29:invokevirtual   #147 <Method void Parcel.writeStrongBinder(IBinder)>
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
	private IMediaSession mExtraBinder;
	private final Object mInner;
	private Bundle mSessionToken2Bundle;

	static 
	{
	//    0    0:new             #11  <Class MediaSessionCompat$Token$1>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void MediaSessionCompat$Token$1()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	MediaSessionCompat$Token(Object obj)
	{
		this(obj, ((IMediaSession) (null)), ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #32  <Method void MediaSessionCompat$Token(Object, IMediaSession, Bundle)>
	//    5    7:return          
	}

	MediaSessionCompat$Token(Object obj, IMediaSession imediasession)
	{
		this(obj, imediasession, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #32  <Method void MediaSessionCompat$Token(Object, IMediaSession, Bundle)>
	//    5    7:return          
	}

	MediaSessionCompat$Token(Object obj, IMediaSession imediasession, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		mInner = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field Object mInner>
		mExtraBinder = imediasession;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field IMediaSession mExtraBinder>
		mSessionToken2Bundle = bundle;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #40  <Field Bundle mSessionToken2Bundle>
	//   11   19:return          
	}
}
