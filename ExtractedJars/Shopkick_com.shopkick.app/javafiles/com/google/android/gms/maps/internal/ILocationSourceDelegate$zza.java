// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.internal.maps.zzb;

// Referenced classes of package com.google.android.gms.maps.internal:
//			ILocationSourceDelegate, zzah, zzai

public static abstract class ILocationSourceDelegate$zza extends zzb
	implements ILocationSourceDelegate
{

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 2: default 24
	//	               1 33
	//	               2 26
		default:
			return false;
	//    2   24:iconst_0        
	//    3   25:ireturn         

		case 2: // '\002'
			deactivate();
	//    4   26:aload_0         
	//    5   27:invokevirtual   #22  <Method void deactivate()>
			break;
	//    6   30:goto            88

		case 1: // '\001'
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//    7   33:aload_2         
	//    8   34:invokevirtual   #28  <Method IBinder Parcel.readStrongBinder()>
	//    9   37:astore_2        
			if(parcel == null)
	//*  10   38:aload_2         
	//*  11   39:ifnonnull       47
			{
				parcel = null;
	//   12   42:aconst_null     
	//   13   43:astore_2        
			} else
	//*  14   44:goto            83
			{
				android.os.IInterface iinterface = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
	//   15   47:aload_2         
	//   16   48:ldc1            #30  <String "com.google.android.gms.maps.internal.IOnLocationChangeListener">
	//   17   50:invokeinterface #36  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   18   55:astore          5
				if(iinterface instanceof zzah)
	//*  19   57:aload           5
	//*  20   59:instanceof      #38  <Class zzah>
	//*  21   62:ifeq            74
					parcel = ((Parcel) ((zzah)iinterface));
	//   22   65:aload           5
	//   23   67:checkcast       #38  <Class zzah>
	//   24   70:astore_2        
				else
	//*  25   71:goto            83
					parcel = ((Parcel) (new zzai(((IBinder) (parcel)))));
	//   26   74:new             #40  <Class zzai>
	//   27   77:dup             
	//   28   78:aload_2         
	//   29   79:invokespecial   #43  <Method void zzai(IBinder)>
	//   30   82:astore_2        
			}
			activate(((zzah) (parcel)));
	//   31   83:aload_0         
	//   32   84:aload_2         
	//   33   85:invokevirtual   #47  <Method void activate(zzah)>
			break;
		}
		parcel1.writeNoException();
	//   34   88:aload_3         
	//   35   89:invokevirtual   #50  <Method void Parcel.writeNoException()>
		return true;
	//   36   92:iconst_1        
	//   37   93:ireturn         
	}

	public ILocationSourceDelegate$zza()
	{
		super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "com.google.android.gms.maps.internal.ILocationSourceDelegate">
	//    2    3:invokespecial   #14  <Method void zzb(String)>
	//    3    6:return          
	}
}
