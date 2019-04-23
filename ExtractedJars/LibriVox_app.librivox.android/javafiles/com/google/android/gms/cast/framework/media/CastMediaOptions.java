// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.framework.media;

import android.os.*;
import com.google.android.gms.c.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.cast.at;

// Referenced classes of package com.google.android.gms.cast.framework.media:
//			t, af, ah, b, 
//			NotificationOptions

public class CastMediaOptions extends AbstractSafeParcelable
{

	CastMediaOptions(String s, String s1, IBinder ibinder, NotificationOptions notificationoptions, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void AbstractSafeParcelable()>
		b = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field String b>
		c = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #42  <Field String c>
		if(ibinder == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       23
		{
			s = null;
	//   10   18:aconst_null     
	//   11   19:astore_1        
		} else
	//*  12   20:goto            56
		{
			s = ((String) (ibinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker")));
	//   13   23:aload_3         
	//   14   24:ldc1            #44  <String "com.google.android.gms.cast.framework.media.IImagePicker">
	//   15   26:invokeinterface #50  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   16   31:astore_1        
			if(s instanceof af)
	//*  17   32:aload_1         
	//*  18   33:instanceof      #52  <Class af>
	//*  19   36:ifeq            47
				s = ((String) ((af)s));
	//   20   39:aload_1         
	//   21   40:checkcast       #52  <Class af>
	//   22   43:astore_1        
			else
	//*  23   44:goto            56
				s = ((String) (new ah(ibinder)));
	//   24   47:new             #54  <Class ah>
	//   25   50:dup             
	//   26   51:aload_3         
	//   27   52:invokespecial   #57  <Method void ah(IBinder)>
	//   28   55:astore_1        
		}
		d = ((af) (s));
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:putfield        #59  <Field af d>
		e = notificationoptions;
	//   32   61:aload_0         
	//   33   62:aload           4
	//   34   64:putfield        #61  <Field NotificationOptions e>
		f = flag;
	//   35   67:aload_0         
	//   36   68:iload           5
	//   37   70:putfield        #63  <Field boolean f>
	//   38   73:return          
	}

	public String a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String b>
	//    2    4:areturn         
	}

	public NotificationOptions b()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field NotificationOptions e>
	//    2    4:areturn         
	}

	public final boolean c()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field boolean f>
	//    2    4:ireturn         
	}

	public String d()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String c>
	//    2    4:areturn         
	}

	public b e()
	{
		Object obj;
		obj = ((Object) (d));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field af d>
	//    2    4:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_51;
	//    3    5:aload_1         
	//    4    6:ifnull          51
		obj = ((Object) ((b)com.google.android.gms.c.d.a(((af) (obj)).b())));
	//    5    9:aload_1         
	//    6   10:invokeinterface #72  <Method com.google.android.gms.c.a af.b()>
	//    7   15:invokestatic    #77  <Method Object d.a(com.google.android.gms.c.a)>
	//    8   18:checkcast       #79  <Class b>
	//    9   21:astore_1        
		return ((b) (obj));
	//   10   22:aload_1         
	//   11   23:areturn         
		RemoteException remoteexception;
		remoteexception;
	//   12   24:astore_1        
		a.a(((Throwable) (remoteexception)), "Unable to call %s on %s.", new Object[] {
			"getWrappedClientObject", ((Class) (com/google/android/gms/cast/framework/media/af)).getSimpleName()
		});
	//   13   25:getstatic       #29  <Field at a>
	//   14   28:aload_1         
	//   15   29:ldc1            #81  <String "Unable to call %s on %s.">
	//   16   31:iconst_2        
	//   17   32:anewarray       Object[]
	//   18   35:dup             
	//   19   36:iconst_0        
	//   20   37:ldc1            #85  <String "getWrappedClientObject">
	//   21   39:aastore         
	//   22   40:dup             
	//   23   41:iconst_1        
	//   24   42:ldc1            #52  <Class af>
	//   25   44:invokevirtual   #90  <Method String Class.getSimpleName()>
	//   26   47:aastore         
	//   27   48:invokevirtual   #93  <Method void at.a(Throwable, String, Object[])>
		return null;
	//   28   51:aconst_null     
	//   29   52:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #100 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #102 <Method String a()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #105 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, d(), false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #107 <Method String d()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #105 <Method void c.a(Parcel, int, String, boolean)>
		Object obj = ((Object) (d));
	//   15   25:aload_0         
	//   16   26:getfield        #59  <Field af d>
	//   17   29:astore          4
		if(obj == null)
	//*  18   31:aload           4
	//*  19   33:ifnonnull       42
			obj = null;
	//   20   36:aconst_null     
	//   21   37:astore          4
		else
	//*  22   39:goto            51
			obj = ((Object) (((af) (obj)).asBinder()));
	//   23   42:aload           4
	//   24   44:invokeinterface #111 <Method IBinder af.asBinder()>
	//   25   49:astore          4
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, ((IBinder) (obj)), false);
	//   26   51:aload_1         
	//   27   52:iconst_4        
	//   28   53:aload           4
	//   29   55:iconst_0        
	//   30   56:invokestatic    #114 <Method void c.a(Parcel, int, IBinder, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, ((android.os.Parcelable) (b())), i, false);
	//   31   59:aload_1         
	//   32   60:iconst_5        
	//   33   61:aload_0         
	//   34   62:invokevirtual   #116 <Method NotificationOptions b()>
	//   35   65:iload_2         
	//   36   66:iconst_0        
	//   37   67:invokestatic    #119 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, f);
	//   38   70:aload_1         
	//   39   71:bipush          6
	//   40   73:aload_0         
	//   41   74:getfield        #63  <Field boolean f>
	//   42   77:invokestatic    #122 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   43   80:aload_1         
	//   44   81:iload_3         
	//   45   82:invokestatic    #124 <Method void c.a(Parcel, int)>
	//   46   85:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new t();
	private static final at a = new at("CastMediaOptions");
	private final String b;
	private final String c;
	private final af d;
	private final NotificationOptions e;
	private final boolean f;

	static 
	{
	//    0    0:new             #21  <Class at>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "CastMediaOptions">
	//    3    6:invokespecial   #27  <Method void at(String)>
	//    4    9:putstatic       #29  <Field at a>
	//    5   12:new             #31  <Class t>
	//    6   15:dup             
	//    7   16:invokespecial   #33  <Method void t()>
	//    8   19:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   9   22:return          
	}
}
