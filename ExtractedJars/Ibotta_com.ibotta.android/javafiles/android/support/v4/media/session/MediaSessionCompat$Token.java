// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, IMediaSession

public static final class MediaSessionCompat$Token
	implements Parcelable
{

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
	//   14   22:getfield        #33  <Field Object mInner>
	//   15   25:astore_1        
		if(obj == null)
	//*  16   26:aload_1         
	//*  17   27:ifnonnull       41
			return ((MediaSessionCompat$Token) (obj1)).mInner == null;
	//   18   30:aload_2         
	//   19   31:getfield        #33  <Field Object mInner>
	//   20   34:ifnonnull       39
	//   21   37:iconst_1        
	//   22   38:ireturn         
	//   23   39:iconst_0        
	//   24   40:ireturn         
		obj1 = ((MediaSessionCompat$Token) (obj1)).mInner;
	//   25   41:aload_2         
	//   26   42:getfield        #33  <Field Object mInner>
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
	//   34   54:invokevirtual   #41  <Method boolean Object.equals(Object)>
	//   35   57:ireturn         
	}

	public int hashCode()
	{
		Object obj = mInner;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Object mInner>
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
	//    8   12:invokevirtual   #44  <Method int Object.hashCode()>
	//    9   15:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #52  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          21
		{
			parcel.writeParcelable((Parcelable)mInner, i);
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:getfield        #33  <Field Object mInner>
	//    6   13:checkcast       #6   <Class Parcelable>
	//    7   16:iload_2         
	//    8   17:invokevirtual   #58  <Method void Parcel.writeParcelable(Parcelable, int)>
			return;
	//    9   20:return          
		} else
		{
			parcel.writeStrongBinder((IBinder)mInner);
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:getfield        #33  <Field Object mInner>
	//   13   26:checkcast       #60  <Class IBinder>
	//   14   29:invokevirtual   #64  <Method void Parcel.writeStrongBinder(IBinder)>
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
