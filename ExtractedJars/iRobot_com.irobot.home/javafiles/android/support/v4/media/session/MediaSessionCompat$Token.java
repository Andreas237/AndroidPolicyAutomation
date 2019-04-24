// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, d, b

public static final class MediaSessionCompat$Token
	implements Parcelable
{

	public static MediaSessionCompat$Token a(Object obj)
	{
		return a(obj, ((b) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #39  <Method MediaSessionCompat$Token a(Object, b)>
	//    3    5:areturn         
	}

	public static MediaSessionCompat$Token a(Object obj, b b1)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          25
	//*   2    4:getstatic       #45  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          25
			return new MediaSessionCompat$Token(d.a(obj), b1);
	//    5   12:new             #2   <Class MediaSessionCompat$Token>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:invokestatic    #50  <Method Object d.a(Object)>
	//    9   20:aload_1         
	//   10   21:invokespecial   #30  <Method void MediaSessionCompat$Token(Object, b)>
	//   11   24:areturn         
		else
			return null;
	//   12   25:aconst_null     
	//   13   26:areturn         
	}

	public Object a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Object a>
	//    2    4:areturn         
	}

	public b b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field b b>
	//    2    4:areturn         
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
		if(a == null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #33  <Field Object a>
	//*  15   25:ifnonnull       39
			return ((MediaSessionCompat$Token) (obj)).a == null;
	//   16   28:aload_1         
	//   17   29:getfield        #33  <Field Object a>
	//   18   32:ifnonnull       37
	//   19   35:iconst_1        
	//   20   36:ireturn         
	//   21   37:iconst_0        
	//   22   38:ireturn         
		if(((MediaSessionCompat$Token) (obj)).a == null)
	//*  23   39:aload_1         
	//*  24   40:getfield        #33  <Field Object a>
	//*  25   43:ifnonnull       48
			return false;
	//   26   46:iconst_0        
	//   27   47:ireturn         
		else
			return a.equals(((MediaSessionCompat$Token) (obj)).a);
	//   28   48:aload_0         
	//   29   49:getfield        #33  <Field Object a>
	//   30   52:aload_1         
	//   31   53:getfield        #33  <Field Object a>
	//   32   56:invokevirtual   #58  <Method boolean Object.equals(Object)>
	//   33   59:ireturn         
	}

	public int hashCode()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object a>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return a.hashCode();
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field Object a>
	//    7   13:invokevirtual   #61  <Method int Object.hashCode()>
	//    8   16:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #45  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          21
		{
			parcel.writeParcelable((Parcelable)a, i);
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:getfield        #33  <Field Object a>
	//    6   13:checkcast       #6   <Class Parcelable>
	//    7   16:iload_2         
	//    8   17:invokevirtual   #69  <Method void Parcel.writeParcelable(Parcelable, int)>
			return;
	//    9   20:return          
		} else
		{
			parcel.writeStrongBinder((IBinder)a);
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:getfield        #33  <Field Object a>
	//   13   26:checkcast       #71  <Class IBinder>
	//   14   29:invokevirtual   #75  <Method void Parcel.writeStrongBinder(IBinder)>
			return;
	//   15   32:return          
		}
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MediaSessionCompat.Token a(Parcel parcel)
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

		public MediaSessionCompat.Token[] a(int i)
		{
			return new MediaSessionCompat.Token[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MediaSessionCompat.Token[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #43  <Method MediaSessionCompat$Token a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #47  <Method MediaSessionCompat$Token[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private final Object a;
	private final b b;

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
		this(obj, ((b) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #30  <Method void MediaSessionCompat$Token(Object, b)>
	//    4    6:return          
	}

	MediaSessionCompat$Token(Object obj, b b1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		a = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field Object a>
		b = b1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field b b>
	//    8   14:return          
	}
}
