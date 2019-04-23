// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;

// Referenced classes of package android.support.v4.media.session:
//			ba, bb, d

public final class MediaSessionCompat$Token
	implements Parcelable
{

	public static MediaSessionCompat$Token a(Object obj)
	{
		return a(obj, ((d) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #40  <Method MediaSessionCompat$Token a(Object, d)>
	//    3    5:areturn         
	}

	public static MediaSessionCompat$Token a(Object obj, d d)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          25
	//*   2    4:getstatic       #46  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          25
			return new MediaSessionCompat$Token(bb.b(obj), d);
	//    5   12:new             #2   <Class MediaSessionCompat$Token>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:invokestatic    #51  <Method Object bb.b(Object)>
	//    9   20:aload_1         
	//   10   21:invokespecial   #53  <Method void MediaSessionCompat$Token(Object, d)>
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
	//    1    1:getfield        #32  <Field Object a>
	//    2    4:areturn         
	}

	public void a(Bundle bundle)
	{
		c = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field Bundle c>
	//    3    5:return          
	}

	public void a(d d)
	{
		b = d;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field d b>
	//    3    5:return          
	}

	public d b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field d b>
	//    2    4:areturn         
	}

	public Bundle c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Bundle c>
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
		Object obj1 = ((Object) ((MediaSessionCompat$Token)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class MediaSessionCompat$Token>
	//   12   20:astore_2        
		obj = a;
	//   13   21:aload_0         
	//   14   22:getfield        #32  <Field Object a>
	//   15   25:astore_1        
		if(obj == null)
	//*  16   26:aload_1         
	//*  17   27:ifnonnull       41
			return ((MediaSessionCompat$Token) (obj1)).a == null;
	//   18   30:aload_2         
	//   19   31:getfield        #32  <Field Object a>
	//   20   34:ifnonnull       39
	//   21   37:iconst_1        
	//   22   38:ireturn         
	//   23   39:iconst_0        
	//   24   40:ireturn         
		obj1 = ((MediaSessionCompat$Token) (obj1)).a;
	//   25   41:aload_2         
	//   26   42:getfield        #32  <Field Object a>
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
	//   34   54:invokevirtual   #64  <Method boolean Object.equals(Object)>
	//   35   57:ireturn         
	}

	public int hashCode()
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Object a>
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
	//    8   12:invokevirtual   #67  <Method int Object.hashCode()>
	//    9   15:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #46  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          21
		{
			parcel.writeParcelable((Parcelable)a, i);
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:getfield        #32  <Field Object a>
	//    6   13:checkcast       #6   <Class Parcelable>
	//    7   16:iload_2         
	//    8   17:invokevirtual   #75  <Method void Parcel.writeParcelable(Parcelable, int)>
			return;
	//    9   20:return          
		} else
		{
			parcel.writeStrongBinder((IBinder)a);
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:getfield        #32  <Field Object a>
	//   13   26:checkcast       #77  <Class IBinder>
	//   14   29:invokevirtual   #81  <Method void Parcel.writeStrongBinder(IBinder)>
			return;
	//   15   32:return          
		}
	}

	public static final android.os.Parcelable.Creator CREATOR = new ba();
	private final Object a;
	private d b;
	private Bundle c;

	static 
	{
	//    0    0:new             #18  <Class ba>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ba()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	MediaSessionCompat$Token(Object obj)
	{
		this(obj, ((d) (null)), ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #28  <Method void MediaSessionCompat$Token(Object, d, Bundle)>
	//    5    7:return          
	}

	MediaSessionCompat$Token(Object obj, d d)
	{
		this(obj, d, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #28  <Method void MediaSessionCompat$Token(Object, d, Bundle)>
	//    5    7:return          
	}

	MediaSessionCompat$Token(Object obj, d d, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		a = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field Object a>
		b = d;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #34  <Field d b>
		c = bundle;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #36  <Field Bundle c>
	//   11   19:return          
	}
}
