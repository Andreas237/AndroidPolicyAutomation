// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import java.util.List;

// Referenced classes of package com.facebook.places.internal:
//			BleScanner, ScannerException

public class BleScannerLegacy
	implements BleScanner
{

	BleScannerLegacy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public int getErrorCode()
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	public List getScanResults()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void initAndCheckEligibility()
		throws ScannerException
	{
		throw new ScannerException(ScannerException.Type.NOT_SUPPORTED);
	//    0    0:new             #20  <Class ScannerException>
	//    1    3:dup             
	//    2    4:getstatic       #26  <Field ScannerException$Type ScannerException$Type.NOT_SUPPORTED>
	//    3    7:invokespecial   #29  <Method void ScannerException(ScannerException$Type)>
	//    4   10:athrow          
	}

	public void startScanning()
		throws ScannerException
	{
		throw new ScannerException(ScannerException.Type.NOT_SUPPORTED);
	//    0    0:new             #20  <Class ScannerException>
	//    1    3:dup             
	//    2    4:getstatic       #26  <Field ScannerException$Type ScannerException$Type.NOT_SUPPORTED>
	//    3    7:invokespecial   #29  <Method void ScannerException(ScannerException$Type)>
	//    4   10:athrow          
	}

	public void stopScanning()
		throws ScannerException
	{
		throw new ScannerException(ScannerException.Type.NOT_SUPPORTED);
	//    0    0:new             #20  <Class ScannerException>
	//    1    3:dup             
	//    2    4:getstatic       #26  <Field ScannerException$Type ScannerException$Type.NOT_SUPPORTED>
	//    3    7:invokespecial   #29  <Method void ScannerException(ScannerException$Type)>
	//    4   10:athrow          
	}
}
