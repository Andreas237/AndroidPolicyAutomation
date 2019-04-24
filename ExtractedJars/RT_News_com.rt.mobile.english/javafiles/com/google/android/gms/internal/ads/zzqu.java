// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzqs, zzlp, zzpw, 
//			zzpy, zzel, zzlo

public final class zzqu extends zzej
	implements zzqs
{

	zzqu(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final void destroy()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(8, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final List getAvailableAssetNames()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(3, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		java.util.ArrayList arraylist = parcel.createStringArrayList();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #39  <Method java.util.ArrayList Parcel.createStringArrayList()>
	//    8   14:astore_2        
		parcel.recycle();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #42  <Method void Parcel.recycle()>
		return ((List) (arraylist));
	//   11   19:aload_2         
	//   12   20:areturn         
	}

	public final String getCustomTemplateId()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(4, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		String s = parcel.readString();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #49  <Method String Parcel.readString()>
	//    8   14:astore_2        
		parcel.recycle();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #42  <Method void Parcel.recycle()>
		return s;
	//   11   19:aload_2         
	//   12   20:areturn         
	}

	public final zzlo getVideoController()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(7, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		zzlo zzlo = zzlp.zze(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #55  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #61  <Method zzlo zzlp.zze(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #42  <Method void Parcel.recycle()>
		return zzlo;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public final void performClick(String s)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		parcel.writeString(s);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #66  <Method void Parcel.writeString(String)>
		((zzej)this).transactAndReadExceptionReturnVoid(5, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_5        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	public final void recordImpression()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(6, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final String zzao(String s)
		throws RemoteException
	{
		Object obj = ((Object) (((zzej)this).obtainAndWriteInterfaceToken()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		((Parcel) (obj)).writeString(s);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #66  <Method void Parcel.writeString(String)>
		s = ((String) (((zzej)this).transactAndReadException(1, ((Parcel) (obj)))));
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   16:astore_1        
		obj = ((Object) (((Parcel) (s)).readString()));
	//   11   17:aload_1         
	//   12   18:invokevirtual   #49  <Method String Parcel.readString()>
	//   13   21:astore_2        
		((Parcel) (s)).recycle();
	//   14   22:aload_1         
	//   15   23:invokevirtual   #42  <Method void Parcel.recycle()>
		return ((String) (obj));
	//   16   26:aload_2         
	//   17   27:areturn         
	}

	public final zzpw zzap(String s)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		parcel.writeString(s);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #66  <Method void Parcel.writeString(String)>
		parcel = ((zzej)this).transactAndReadException(2, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   16:astore_2        
		s = ((String) (parcel.readStrongBinder()));
	//   11   17:aload_2         
	//   12   18:invokevirtual   #55  <Method IBinder Parcel.readStrongBinder()>
	//   13   21:astore_1        
		if(s == null)
	//*  14   22:aload_1         
	//*  15   23:ifnonnull       31
		{
			s = null;
	//   16   26:aconst_null     
	//   17   27:astore_1        
		} else
	//*  18   28:goto            64
		{
			android.os.IInterface iinterface = ((IBinder) (s)).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
	//   19   31:aload_1         
	//   20   32:ldc1            #73  <String "com.google.android.gms.ads.internal.formats.client.INativeAdImage">
	//   21   34:invokeinterface #79  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   22   39:astore_3        
			if(iinterface instanceof zzpw)
	//*  23   40:aload_3         
	//*  24   41:instanceof      #81  <Class zzpw>
	//*  25   44:ifeq            55
				s = ((String) ((zzpw)iinterface));
	//   26   47:aload_3         
	//   27   48:checkcast       #81  <Class zzpw>
	//   28   51:astore_1        
			else
	//*  29   52:goto            64
				s = ((String) (new zzpy(((IBinder) (s)))));
	//   30   55:new             #83  <Class zzpy>
	//   31   58:dup             
	//   32   59:aload_1         
	//   33   60:invokespecial   #85  <Method void zzpy(IBinder)>
	//   34   63:astore_1        
		}
		parcel.recycle();
	//   35   64:aload_2         
	//   36   65:invokevirtual   #42  <Method void Parcel.recycle()>
		return ((zzpw) (s));
	//   37   68:aload_1         
	//   38   69:areturn         
	}

	public final boolean zzh(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #93  <Method void zzel.zza(Parcel, android.os.IInterface)>
		iobjectwrapper = ((IObjectWrapper) (((zzej)this).transactAndReadException(10, parcel)));
	//    6   10:aload_0         
	//    7   11:bipush          10
	//    8   13:aload_3         
	//    9   14:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   17:astore_1        
		boolean flag = zzel.zza(((Parcel) (iobjectwrapper)));
	//   11   18:aload_1         
	//   12   19:invokestatic    #96  <Method boolean zzel.zza(Parcel)>
	//   13   22:istore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   14   23:aload_1         
	//   15   24:invokevirtual   #42  <Method void Parcel.recycle()>
		return flag;
	//   16   27:iload_2         
	//   17   28:ireturn         
	}

	public final IObjectWrapper zzka()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(11, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #55  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #104 <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #42  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public final IObjectWrapper zzkh()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(9, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          9
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #33  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #55  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #104 <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #42  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   23:aload_2         
	//   13   24:areturn         
	}
}
