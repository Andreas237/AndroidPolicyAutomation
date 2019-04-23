// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzwf

public final class zzzu extends zzwf
{

	public zzzu(zzwf zzwf1)
	{
		super(zzwf1.a, zzwf1.b, zzwf1.c, zzwf1.d, zzwf1.e, zzwf1.f, zzwf1.g, zzwf1.h, zzwf1.i, zzwf1.j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #11  <Field String zzwf.a>
	//    3    5:aload_1         
	//    4    6:getfield        #15  <Field int zzwf.b>
	//    5    9:aload_1         
	//    6   10:getfield        #18  <Field int com.google.android.gms.internal.ads.zzwf.c>
	//    7   13:aload_1         
	//    8   14:getfield        #22  <Field boolean zzwf.d>
	//    9   17:aload_1         
	//   10   18:getfield        #25  <Field int zzwf.e>
	//   11   21:aload_1         
	//   12   22:getfield        #28  <Field int zzwf.f>
	//   13   25:aload_1         
	//   14   26:getfield        #32  <Field zzwf[] zzwf.g>
	//   15   29:aload_1         
	//   16   30:getfield        #35  <Field boolean zzwf.h>
	//   17   33:aload_1         
	//   18   34:getfield        #38  <Field boolean zzwf.i>
	//   19   37:aload_1         
	//   20   38:getfield        #41  <Field boolean zzwf.j>
	//   21   41:invokespecial   #44  <Method void zzwf(String, int, int, boolean, int, int, zzwf[], boolean, boolean, boolean)>
	//   22   44:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #52  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		c.a(parcel, 2, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #53  <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #56  <Method void c.a(Parcel, int, String, boolean)>
		c.a(parcel, 3, b);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #57  <Field int b>
	//   13   21:invokestatic    #60  <Method void c.a(Parcel, int, int)>
		c.a(parcel, 6, e);
	//   14   24:aload_1         
	//   15   25:bipush          6
	//   16   27:aload_0         
	//   17   28:getfield        #61  <Field int e>
	//   18   31:invokestatic    #60  <Method void c.a(Parcel, int, int)>
		c.a(parcel, i);
	//   19   34:aload_1         
	//   20   35:iload_2         
	//   21   36:invokestatic    #63  <Method void c.a(Parcel, int)>
	//   22   39:return          
	}
}
