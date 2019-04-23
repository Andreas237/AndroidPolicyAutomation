// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.ads.bxk;
import com.google.android.gms.internal.ads.bxl;

// Referenced classes of package com.google.android.gms.ads.formats:
//			s

public final class PublisherAdViewOptions extends AbstractSafeParcelable
{

	PublisherAdViewOptions(boolean flag, IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void AbstractSafeParcelable()>
		a = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field boolean a>
		if(ibinder != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          21
			ibinder = ((IBinder) (bxl.a(ibinder)));
	//    7   13:aload_2         
	//    8   14:invokestatic    #30  <Method bxk bxl.a(IBinder)>
	//    9   17:astore_2        
		else
	//*  10   18:goto            23
			ibinder = null;
	//   11   21:aconst_null     
	//   12   22:astore_2        
		b = ((bxk) (ibinder));
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:putfield        #32  <Field bxk b>
	//   16   28:return          
	}

	public final boolean a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean a>
	//    2    4:ireturn         
	}

	public final bxk b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field bxk b>
	//    2    4:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #41  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		c.a(parcel, 1, a());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #43  <Method boolean a()>
	//    7   11:invokestatic    #46  <Method void c.a(Parcel, int, boolean)>
		Object obj = ((Object) (b));
	//    8   14:aload_0         
	//    9   15:getfield        #32  <Field bxk b>
	//   10   18:astore_3        
		if(obj == null)
	//*  11   19:aload_3         
	//*  12   20:ifnonnull       28
			obj = null;
	//   13   23:aconst_null     
	//   14   24:astore_3        
		else
	//*  15   25:goto            35
			obj = ((Object) (((bxk) (obj)).asBinder()));
	//   16   28:aload_3         
	//   17   29:invokeinterface #52  <Method IBinder bxk.asBinder()>
	//   18   34:astore_3        
		c.a(parcel, 2, ((IBinder) (obj)), false);
	//   19   35:aload_1         
	//   20   36:iconst_2        
	//   21   37:aload_3         
	//   22   38:iconst_0        
	//   23   39:invokestatic    #55  <Method void c.a(Parcel, int, IBinder, boolean)>
		c.a(parcel, i);
	//   24   42:aload_1         
	//   25   43:iload_2         
	//   26   44:invokestatic    #57  <Method void c.a(Parcel, int)>
	//   27   47:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new s();
	private final boolean a;
	private final bxk b;

	static 
	{
	//    0    0:new             #15  <Class s>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void s()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
