// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import android.net.wifi.ScanResult;
import java.util.Comparator;

// Referenced classes of package com.facebook.places.internal:
//			WifiScannerImpl

static final class WifiScannerImpl$1
	implements Comparator
{

	public int compare(ScanResult scanresult, ScanResult scanresult1)
	{
		return scanresult1.level - scanresult.level;
	//    0    0:aload_2         
	//    1    1:getfield        #25  <Field int ScanResult.level>
	//    2    4:aload_1         
	//    3    5:getfield        #25  <Field int ScanResult.level>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((ScanResult)obj, (ScanResult)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class ScanResult>
	//    3    5:aload_2         
	//    4    6:checkcast       #21  <Class ScanResult>
	//    5    9:invokevirtual   #28  <Method int compare(ScanResult, ScanResult)>
	//    6   12:ireturn         
	}

	WifiScannerImpl$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
