// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzpw, zzpy, zzel

public abstract class zzpx extends zzek
	implements zzpw
{

	public zzpx()
	{
		super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.INativeAdImage">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzpw zzh(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.INativeAdImage">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzpw)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzpw>
	//*  10   19:ifeq            27
			return (zzpw)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzpw>
	//   13   26:areturn         
		else
			return ((zzpw) (new zzpy(ibinder)));
	//   14   27:new             #24  <Class zzpy>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzpy(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 66
	//	               2 49
	//	               3 30
		default:
			return false;
	//    2   28:iconst_0        
	//    3   29:ireturn         

		case 3: // '\003'
			double d = getScale();
	//    4   30:aload_0         
	//    5   31:invokevirtual   #35  <Method double getScale()>
	//    6   34:dstore          5
			parcel1.writeNoException();
	//    7   36:aload_3         
	//    8   37:invokevirtual   #40  <Method void Parcel.writeNoException()>
			parcel1.writeDouble(d);
	//    9   40:aload_3         
	//   10   41:dload           5
	//   11   43:invokevirtual   #44  <Method void Parcel.writeDouble(double)>
			break;

	//*  12   46:goto            80
		case 2: // '\002'
			parcel = ((Parcel) (getUri()));
	//   13   49:aload_0         
	//   14   50:invokevirtual   #48  <Method android.net.Uri getUri()>
	//   15   53:astore_2        
			parcel1.writeNoException();
	//   16   54:aload_3         
	//   17   55:invokevirtual   #40  <Method void Parcel.writeNoException()>
			zzel.zzb(parcel1, ((android.os.Parcelable) (parcel)));
	//   18   58:aload_3         
	//   19   59:aload_2         
	//   20   60:invokestatic    #54  <Method void zzel.zzb(Parcel, android.os.Parcelable)>
			break;

	//*  21   63:goto            80
		case 1: // '\001'
			parcel = ((Parcel) (zzjy()));
	//   22   66:aload_0         
	//   23   67:invokevirtual   #58  <Method com.google.android.gms.dynamic.IObjectWrapper zzjy()>
	//   24   70:astore_2        
			parcel1.writeNoException();
	//   25   71:aload_3         
	//   26   72:invokevirtual   #40  <Method void Parcel.writeNoException()>
			zzel.zza(parcel1, ((android.os.IInterface) (parcel)));
	//   27   75:aload_3         
	//   28   76:aload_2         
	//   29   77:invokestatic    #62  <Method void zzel.zza(Parcel, android.os.IInterface)>
			break;
		}
		return true;
	//   30   80:iconst_1        
	//   31   81:ireturn         
	}
}
