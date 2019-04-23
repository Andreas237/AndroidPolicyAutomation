// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bci, bwx, bwu, bww, 
//			bck, bwr, bxq, dg, 
//			dj, ds, zzwf, dv, 
//			fg, zzacp, zzafz, dp, 
//			dm

public final class bwz extends bci
	implements bwx
{

	bwz(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdLoaderBuilder">
	//    3    4:invokespecial   #13  <Method void bci(IBinder, String)>
	//    4    7:return          
	}

	public final bwu a()
	{
		Parcel parcel = ((bci)this).a(1, ((bci)this).z());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel bci.z()>
	//    4    6:invokevirtual   #23  <Method Parcel bci.a(int, Parcel)>
	//    5    9:astore_2        
		Object obj = ((Object) (parcel.readStrongBinder()));
	//    6   10:aload_2         
	//    7   11:invokevirtual   #29  <Method IBinder Parcel.readStrongBinder()>
	//    8   14:astore_1        
		if(obj == null)
	//*   9   15:aload_1         
	//*  10   16:ifnonnull       24
		{
			obj = null;
	//   11   19:aconst_null     
	//   12   20:astore_1        
		} else
	//*  13   21:goto            57
		{
			android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
	//   14   24:aload_1         
	//   15   25:ldc1            #31  <String "com.google.android.gms.ads.internal.client.IAdLoader">
	//   16   27:invokeinterface #37  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   17   32:astore_3        
			if(iinterface instanceof bwu)
	//*  18   33:aload_3         
	//*  19   34:instanceof      #39  <Class bwu>
	//*  20   37:ifeq            48
				obj = ((Object) ((bwu)iinterface));
	//   21   40:aload_3         
	//   22   41:checkcast       #39  <Class bwu>
	//   23   44:astore_1        
			else
	//*  24   45:goto            57
				obj = ((Object) (new bww(((IBinder) (obj)))));
	//   25   48:new             #41  <Class bww>
	//   26   51:dup             
	//   27   52:aload_1         
	//   28   53:invokespecial   #43  <Method void bww(IBinder)>
	//   29   56:astore_1        
		}
		parcel.recycle();
	//   30   57:aload_2         
	//   31   58:invokevirtual   #47  <Method void Parcel.recycle()>
		return ((bwu) (obj));
	//   32   61:aload_1         
	//   33   62:areturn         
	}

	public final void a(PublisherAdViewOptions publisheradviewoptions)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(parcel, ((android.os.Parcelable) (publisheradviewoptions)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #53  <Method void bck.a(Parcel, android.os.Parcelable)>
		((bci)this).b(9, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          9
	//    8   13:aload_2         
	//    9   14:invokevirtual   #57  <Method void bci.b(int, Parcel)>
	//   10   17:return          
	}

	public final void a(bwr bwr)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(parcel, ((android.os.IInterface) (bwr)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #61  <Method void bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(2, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #57  <Method void bci.b(int, Parcel)>
	//   10   16:return          
	}

	public final void a(bxq bxq)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(parcel, ((android.os.IInterface) (bxq)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #61  <Method void bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(7, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          7
	//    8   13:aload_2         
	//    9   14:invokevirtual   #57  <Method void bci.b(int, Parcel)>
	//   10   17:return          
	}

	public final void a(dg dg)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(parcel, ((android.os.IInterface) (dg)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #61  <Method void bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(3, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_3        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #57  <Method void bci.b(int, Parcel)>
	//   10   16:return          
	}

	public final void a(dj dj)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(parcel, ((android.os.IInterface) (dj)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #61  <Method void bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(4, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_4        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #57  <Method void bci.b(int, Parcel)>
	//   10   16:return          
	}

	public final void a(ds ds, zzwf zzwf)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_3        
		bck.a(parcel, ((android.os.IInterface) (ds)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #61  <Method void bck.a(Parcel, android.os.IInterface)>
		bck.a(parcel, ((android.os.Parcelable) (zzwf)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #53  <Method void bck.a(Parcel, android.os.Parcelable)>
		((bci)this).b(8, parcel);
	//    9   15:aload_0         
	//   10   16:bipush          8
	//   11   18:aload_3         
	//   12   19:invokevirtual   #57  <Method void bci.b(int, Parcel)>
	//   13   22:return          
	}

	public final void a(dv dv)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(parcel, ((android.os.IInterface) (dv)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #61  <Method void bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(10, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          10
	//    8   13:aload_2         
	//    9   14:invokevirtual   #57  <Method void bci.b(int, Parcel)>
	//   10   17:return          
	}

	public final void a(fg fg)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(parcel, ((android.os.IInterface) (fg)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #61  <Method void bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(14, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          14
	//    8   13:aload_2         
	//    9   14:invokevirtual   #57  <Method void bci.b(int, Parcel)>
	//   10   17:return          
	}

	public final void a(zzacp zzacp)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(parcel, ((android.os.Parcelable) (zzacp)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #53  <Method void bck.a(Parcel, android.os.Parcelable)>
		((bci)this).b(6, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          6
	//    8   13:aload_2         
	//    9   14:invokevirtual   #57  <Method void bci.b(int, Parcel)>
	//   10   17:return          
	}

	public final void a(zzafz zzafz)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore_2        
		bck.a(parcel, ((android.os.Parcelable) (zzafz)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #53  <Method void bck.a(Parcel, android.os.Parcelable)>
		((bci)this).b(13, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          13
	//    8   13:aload_2         
	//    9   14:invokevirtual   #57  <Method void bci.b(int, Parcel)>
	//   10   17:return          
	}

	public final void a(String s, dp dp, dm dm)
	{
		Parcel parcel = ((bci)this).z();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel bci.z()>
	//    2    4:astore          4
		parcel.writeString(s);
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokevirtual   #74  <Method void Parcel.writeString(String)>
		bck.a(parcel, ((android.os.IInterface) (dp)));
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokestatic    #61  <Method void bck.a(Parcel, android.os.IInterface)>
		bck.a(parcel, ((android.os.IInterface) (dm)));
	//    9   18:aload           4
	//   10   20:aload_3         
	//   11   21:invokestatic    #61  <Method void bck.a(Parcel, android.os.IInterface)>
		((bci)this).b(5, parcel);
	//   12   24:aload_0         
	//   13   25:iconst_5        
	//   14   26:aload           4
	//   15   28:invokevirtual   #57  <Method void bci.b(int, Parcel)>
	//   16   31:return          
	}
}
