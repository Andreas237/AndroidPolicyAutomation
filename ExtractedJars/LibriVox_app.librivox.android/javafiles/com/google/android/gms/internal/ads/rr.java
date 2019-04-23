// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, rp, bck, zzasm, 
//			zzasi, rs, zzatb, rv

public final class rr extends bci
	implements rp
{

	rr(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.request.IAdRequestService">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final zzasm a(zzasi zzasi)
	{
		Object obj = ((Object) (((bci)this).z()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(((Parcel) (obj)), ((android.os.Parcelable) (zzasi)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #25  <Method void bck.a(Parcel, android.os.Parcelable)>
		zzasi = ((zzasi) (((bci)this).a(1, ((Parcel) (obj)))));
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #28  <Method Parcel bci.a(int, Parcel)>
	//   10   16:astore_1        
		obj = ((Object) ((zzasm)bck.a(((Parcel) (zzasi)), zzasm.CREATOR)));
	//   11   17:aload_1         
	//   12   18:getstatic       #34  <Field android.os.Parcelable$Creator zzasm.CREATOR>
	//   13   21:invokestatic    #37  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   14   24:checkcast       #30  <Class zzasm>
	//   15   27:astore_2        
		((Parcel) (zzasi)).recycle();
	//   16   28:aload_1         
	//   17   29:invokevirtual   #43  <Method void Parcel.recycle()>
		return ((zzasm) (obj));
	//   18   32:aload_2         
	//   19   33:areturn         
	}

	public final void a(zzasi zzasi, rs rs)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		bck.a(parcel, ((android.os.Parcelable) (zzasi)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #25  <Method void bck.a(Parcel, android.os.Parcelable)>
		bck.a(parcel, ((android.os.IInterface) (rs)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #47  <Method void bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(2, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_2        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #51  <Method void bci.b(int, Parcel)>
	//   13   21:return          
	}

	public final void a(zzatb zzatb, rv rv)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		bck.a(parcel, ((android.os.Parcelable) (zzatb)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #25  <Method void bck.a(Parcel, android.os.Parcelable)>
		bck.a(parcel, ((android.os.IInterface) (rv)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #47  <Method void bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(4, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_4        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #51  <Method void bci.b(int, Parcel)>
	//   13   21:return          
	}

	public final void b(zzatb zzatb, rv rv)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		bck.a(parcel, ((android.os.Parcelable) (zzatb)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #25  <Method void bck.a(Parcel, android.os.Parcelable)>
		bck.a(parcel, ((android.os.IInterface) (rv)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #47  <Method void bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(5, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_5        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #51  <Method void bci.b(int, Parcel)>
	//   13   21:return          
	}
}
