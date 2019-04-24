// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android.a;

import android.support.v7.ae;
import android.support.v7.g;
import android.telephony.*;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;

public final class f
{

	public static final int a(TelephonyManager telephonymanager)
	{
		ae.b(((Object) (telephonymanager)), "$receiver");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "$receiver">
	//    2    3:invokestatic    #15  <Method void ae.b(Object, String)>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   3    6:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    9:bipush          26
	//*   5   11:icmplt          93
		{
			Object obj = ((Object) (telephonymanager.getAllCellInfo()));
	//    6   14:aload_0         
	//    7   15:invokevirtual   #27  <Method java.util.List TelephonyManager.getAllCellInfo()>
	//    8   18:astore_1        
			if(obj != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          57
				obj = ((Object) ((CellInfo)g.d(((java.util.List) (obj)))));
	//   11   23:aload_1         
	//   12   24:invokestatic    #33  <Method Object g.d(java.util.List)>
	//   13   27:checkcast       #35  <Class CellInfo>
	//   14   30:astore_1        
			else
	//*  15   31:aload_1         
	//*  16   32:instanceof      #37  <Class CellInfoGsm>
	//*  17   35:ifeq            62
	//*  18   38:aload_1         
	//*  19   39:checkcast       #37  <Class CellInfoGsm>
	//*  20   42:invokevirtual   #41  <Method CellIdentityGsm CellInfoGsm.getCellIdentity()>
	//*  21   45:astore_0        
	//*  22   46:aload_0         
	//*  23   47:ldc1            #43  <String "info.cellIdentity">
	//*  24   49:invokestatic    #45  <Method void ae.a(Object, String)>
	//*  25   52:aload_0         
	//*  26   53:invokevirtual   #51  <Method int CellIdentityGsm.getCid()>
	//*  27   56:ireturn         
				obj = null;
	//   28   57:aconst_null     
	//   29   58:astore_1        
			if(obj instanceof CellInfoGsm)
			{
				telephonymanager = ((TelephonyManager) (((CellInfoGsm)obj).getCellIdentity()));
				ae.a(((Object) (telephonymanager)), "info.cellIdentity");
				return ((CellIdentityGsm) (telephonymanager)).getCid();
			}
	//*  30   59:goto            31
			if(obj instanceof CellInfoCdma)
	//*  31   62:aload_1         
	//*  32   63:instanceof      #53  <Class CellInfoCdma>
	//*  33   66:ifeq            88
			{
				telephonymanager = ((TelephonyManager) (((CellInfoCdma)obj).getCellIdentity()));
	//   34   69:aload_1         
	//   35   70:checkcast       #53  <Class CellInfoCdma>
	//   36   73:invokevirtual   #56  <Method CellIdentityCdma CellInfoCdma.getCellIdentity()>
	//   37   76:astore_0        
				ae.a(((Object) (telephonymanager)), "info.cellIdentity");
	//   38   77:aload_0         
	//   39   78:ldc1            #43  <String "info.cellIdentity">
	//   40   80:invokestatic    #45  <Method void ae.a(Object, String)>
				return ((CellIdentityCdma) (telephonymanager)).getBasestationId();
	//   41   83:aload_0         
	//   42   84:invokevirtual   #61  <Method int CellIdentityCdma.getBasestationId()>
	//   43   87:ireturn         
			} else
			{
				return c(telephonymanager);
	//   44   88:aload_0         
	//   45   89:invokestatic    #64  <Method int c(TelephonyManager)>
	//   46   92:ireturn         
			}
		} else
		{
			return c(telephonymanager);
	//   47   93:aload_0         
	//   48   94:invokestatic    #64  <Method int c(TelephonyManager)>
	//   49   97:ireturn         
		}
	}

	public static final int b(TelephonyManager telephonymanager)
	{
		ae.b(((Object) (telephonymanager)), "$receiver");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "$receiver">
	//    2    3:invokestatic    #15  <Method void ae.b(Object, String)>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   3    6:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    9:bipush          26
	//*   5   11:icmplt          67
		{
			Object obj = ((Object) (telephonymanager.getAllCellInfo()));
	//    6   14:aload_0         
	//    7   15:invokevirtual   #27  <Method java.util.List TelephonyManager.getAllCellInfo()>
	//    8   18:astore_1        
			if(obj != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          57
				obj = ((Object) ((CellInfo)g.d(((java.util.List) (obj)))));
	//   11   23:aload_1         
	//   12   24:invokestatic    #33  <Method Object g.d(java.util.List)>
	//   13   27:checkcast       #35  <Class CellInfo>
	//   14   30:astore_1        
			else
	//*  15   31:aload_1         
	//*  16   32:instanceof      #37  <Class CellInfoGsm>
	//*  17   35:ifeq            62
	//*  18   38:aload_1         
	//*  19   39:checkcast       #37  <Class CellInfoGsm>
	//*  20   42:invokevirtual   #41  <Method CellIdentityGsm CellInfoGsm.getCellIdentity()>
	//*  21   45:astore_0        
	//*  22   46:aload_0         
	//*  23   47:ldc1            #43  <String "info.cellIdentity">
	//*  24   49:invokestatic    #45  <Method void ae.a(Object, String)>
	//*  25   52:aload_0         
	//*  26   53:invokevirtual   #69  <Method int CellIdentityGsm.getLac()>
	//*  27   56:ireturn         
				obj = null;
	//   28   57:aconst_null     
	//   29   58:astore_1        
			if(obj instanceof CellInfoGsm)
			{
				telephonymanager = ((TelephonyManager) (((CellInfoGsm)obj).getCellIdentity()));
				ae.a(((Object) (telephonymanager)), "info.cellIdentity");
				return ((CellIdentityGsm) (telephonymanager)).getLac();
			} else
	//*  30   59:goto            31
			{
				return d(telephonymanager);
	//   31   62:aload_0         
	//   32   63:invokestatic    #71  <Method int d(TelephonyManager)>
	//   33   66:ireturn         
			}
		} else
		{
			return d(telephonymanager);
	//   34   67:aload_0         
	//   35   68:invokestatic    #71  <Method int d(TelephonyManager)>
	//   36   71:ireturn         
		}
	}

	private static final int c(TelephonyManager telephonymanager)
	{
		telephonymanager = ((TelephonyManager) (telephonymanager.getCellLocation()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method android.telephony.CellLocation TelephonyManager.getCellLocation()>
	//    2    4:astore_0        
		if(telephonymanager instanceof GsmCellLocation)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #77  <Class GsmCellLocation>
	//*   5    9:ifeq            20
			return ((GsmCellLocation)telephonymanager).getCid();
	//    6   12:aload_0         
	//    7   13:checkcast       #77  <Class GsmCellLocation>
	//    8   16:invokevirtual   #78  <Method int GsmCellLocation.getCid()>
	//    9   19:ireturn         
		if(telephonymanager instanceof CdmaCellLocation)
	//*  10   20:aload_0         
	//*  11   21:instanceof      #80  <Class CdmaCellLocation>
	//*  12   24:ifeq            35
			return ((CdmaCellLocation)telephonymanager).getBaseStationId();
	//   13   27:aload_0         
	//   14   28:checkcast       #80  <Class CdmaCellLocation>
	//   15   31:invokevirtual   #83  <Method int CdmaCellLocation.getBaseStationId()>
	//   16   34:ireturn         
		else
			return -1;
	//   17   35:iconst_m1       
	//   18   36:ireturn         
	}

	private static final int d(TelephonyManager telephonymanager)
	{
		telephonymanager = ((TelephonyManager) (telephonymanager.getCellLocation()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method android.telephony.CellLocation TelephonyManager.getCellLocation()>
	//    2    4:astore_0        
		if(telephonymanager instanceof GsmCellLocation)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #77  <Class GsmCellLocation>
	//*   5    9:ifeq            20
			return ((GsmCellLocation)telephonymanager).getLac();
	//    6   12:aload_0         
	//    7   13:checkcast       #77  <Class GsmCellLocation>
	//    8   16:invokevirtual   #84  <Method int GsmCellLocation.getLac()>
	//    9   19:ireturn         
		else
			return -1;
	//   10   20:iconst_m1       
	//   11   21:ireturn         
	}
}
