// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.places.internal:
//			LocationPackageManager, ScannerException, LocationPackage, LocationScanner

static final class LocationPackageManager$2
	implements Callable
{

	public LocationPackage call()
		throws Exception
	{
		Exception exception;
		LocationPackage locationpackage = new LocationPackage();
	//    0    0:new             #30  <Class LocationPackage>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void LocationPackage()>
	//    3    7:astore_1        
		try
		{
			locationpackage.location = val$locationScanner.getLocation();
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field LocationScanner val$locationScanner>
	//    7   13:invokeinterface #37  <Method android.location.Location LocationScanner.getLocation()>
	//    8   18:putfield        #41  <Field android.location.Location LocationPackage.location>
		}
	//*   9   21:aload_1         
	//*  10   22:areturn         
	//*  11   23:aload_1         
	//*  12   24:getstatic       #47  <Field ScannerException$Type ScannerException$Type.UNKNOWN_ERROR>
	//*  13   27:putfield        #50  <Field ScannerException$Type LocationPackage.locationError>
	//*  14   30:aload_1         
	//*  15   31:areturn         
		catch(ScannerException scannerexception)
	//*  16   32:astore_2        
		{
			locationpackage.locationError = scannerexception.type;
	//   17   33:aload_1         
	//   18   34:aload_2         
	//   19   35:getfield        #53  <Field ScannerException$Type ScannerException.type>
	//   20   38:putfield        #50  <Field ScannerException$Type LocationPackage.locationError>
			LocationPackageManager.access$300("Exception while getting location", ((Throwable) (scannerexception)));
	//   21   41:ldc1            #55  <String "Exception while getting location">
	//   22   43:aload_2         
	//   23   44:invokestatic    #59  <Method void LocationPackageManager.access$300(String, Throwable)>
			return locationpackage;
	//   24   47:aload_1         
	//   25   48:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			locationpackage.locationError = ScannerException.Type.UNKNOWN_ERROR;
			return locationpackage;
		}
		return locationpackage;
	//*  26   49:astore_2        
	//*  27   50:goto            23
	}

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method LocationPackage call()>
	//    2    4:areturn         
	}

	final LocationScanner val$locationScanner;

	LocationPackageManager$2(LocationScanner locationscanner)
	{
		val$locationScanner = locationscanner;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field LocationScanner val$locationScanner>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
