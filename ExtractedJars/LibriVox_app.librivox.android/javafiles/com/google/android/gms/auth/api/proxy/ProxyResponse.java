// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//			c

public class ProxyResponse extends AbstractSafeParcelable
{

	ProxyResponse(int i, int j, PendingIntent pendingintent, int k, Bundle bundle, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void AbstractSafeParcelable()>
		e = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int e>
		a = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #32  <Field int a>
		c = k;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #34  <Field int c>
		f = bundle;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #36  <Field Bundle f>
		d = abyte0;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #38  <Field byte[] d>
		b = pendingintent;
	//   17   32:aload_0         
	//   18   33:aload_3         
	//   19   34:putfield        #40  <Field PendingIntent b>
	//   20   37:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #47  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #32  <Field int a>
	//    7   11:invokestatic    #50  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ((android.os.Parcelable) (b)), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #40  <Field PendingIntent b>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #53  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:getfield        #34  <Field int c>
	//   19   31:invokestatic    #50  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, f, false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:getfield        #36  <Field Bundle f>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #56  <Method void c.a(Parcel, int, Bundle, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d, false);
	//   26   44:aload_1         
	//   27   45:iconst_5        
	//   28   46:aload_0         
	//   29   47:getfield        #38  <Field byte[] d>
	//   30   50:iconst_0        
	//   31   51:invokestatic    #59  <Method void c.a(Parcel, int, byte[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1000, e);
	//   32   54:aload_1         
	//   33   55:sipush          1000
	//   34   58:aload_0         
	//   35   59:getfield        #30  <Field int e>
	//   36   62:invokestatic    #50  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   37   65:aload_1         
	//   38   66:iload_3         
	//   39   67:invokestatic    #61  <Method void c.a(Parcel, int)>
	//   40   70:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.auth.api.proxy.c();
	public final int a;
	public final PendingIntent b;
	public final int c;
	public final byte d[];
	private final int e;
	private final Bundle f;

	static 
	{
	//    0    0:new             #20  <Class com.google.android.gms.auth.api.proxy.c>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void com.google.android.gms.auth.api.proxy.c()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
