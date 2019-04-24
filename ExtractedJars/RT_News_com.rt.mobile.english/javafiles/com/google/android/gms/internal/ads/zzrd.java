// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzrc, zzre, zzqs, 
//			zzqu

public abstract class zzrd extends zzek
	implements zzrc
{

	public zzrd()
	{
		super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzrc zzn(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzrc)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzrc>
	//*  10   19:ifeq            27
			return (zzrc)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzrc>
	//   13   26:areturn         
		else
			return ((zzrc) (new zzre(ibinder)));
	//   14   27:new             #24  <Class zzre>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzre(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          78
		{
			Object obj = ((Object) (parcel.readStrongBinder()));
	//    3    5:aload_2         
	//    4    6:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//    5    9:astore          5
			if(obj == null)
	//*   6   11:aload           5
	//*   7   13:ifnonnull       22
			{
				obj = null;
	//    8   16:aconst_null     
	//    9   17:astore          5
			} else
	//*  10   19:goto            62
			{
				android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
	//   11   22:aload           5
	//   12   24:ldc1            #39  <String "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd">
	//   13   26:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   14   31:astore          6
				if(iinterface instanceof zzqs)
	//*  15   33:aload           6
	//*  16   35:instanceof      #41  <Class zzqs>
	//*  17   38:ifeq            51
					obj = ((Object) ((zzqs)iinterface));
	//   18   41:aload           6
	//   19   43:checkcast       #41  <Class zzqs>
	//   20   46:astore          5
				else
	//*  21   48:goto            62
					obj = ((Object) (new zzqu(((IBinder) (obj)))));
	//   22   51:new             #43  <Class zzqu>
	//   23   54:dup             
	//   24   55:aload           5
	//   25   57:invokespecial   #44  <Method void zzqu(IBinder)>
	//   26   60:astore          5
			}
			zzb(((zzqs) (obj)), parcel.readString());
	//   27   62:aload_0         
	//   28   63:aload           5
	//   29   65:aload_2         
	//   30   66:invokevirtual   #48  <Method String Parcel.readString()>
	//   31   69:invokevirtual   #52  <Method void zzb(zzqs, String)>
			parcel1.writeNoException();
	//   32   72:aload_3         
	//   33   73:invokevirtual   #55  <Method void Parcel.writeNoException()>
			return true;
	//   34   76:iconst_1        
	//   35   77:ireturn         
		} else
		{
			return false;
	//   36   78:iconst_0        
	//   37   79:ireturn         
		}
	}
}
