// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.location;

import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.amap.api.location:
//			AMapLocationListener, LocationManagerProxy, AMapLocation

class LocationManagerProxy$b
	implements AMapLocationListener
{

	public void onLocationChanged(Location location)
	{
		Iterator iterator;
		if(LocationManagerProxy.a(a) == null || LocationManagerProxy.a(a).size() <= 0)
			break MISSING_BLOCK_LABEL_112;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field LocationManagerProxy a>
	//    2    4:invokestatic    #28  <Method ArrayList LocationManagerProxy.a(LocationManagerProxy)>
	//    3    7:ifnull          112
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field LocationManagerProxy a>
	//    6   14:invokestatic    #28  <Method ArrayList LocationManagerProxy.a(LocationManagerProxy)>
	//    7   17:invokevirtual   #34  <Method int ArrayList.size()>
	//    8   20:ifle            112
		iterator = LocationManagerProxy.a(a).iterator();
	//    9   23:aload_0         
	//   10   24:getfield        #15  <Field LocationManagerProxy a>
	//   11   27:invokestatic    #28  <Method ArrayList LocationManagerProxy.a(LocationManagerProxy)>
	//   12   30:invokevirtual   #38  <Method Iterator ArrayList.iterator()>
	//   13   33:astore_2        
_L1:
		PendingIntent pendingintent;
		Intent intent;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_112;
	//   14   34:aload_2         
	//   15   35:invokeinterface #44  <Method boolean Iterator.hasNext()>
	//   16   40:ifeq            112
		pendingintent = (PendingIntent)iterator.next();
	//   17   43:aload_2         
	//   18   44:invokeinterface #48  <Method Object Iterator.next()>
	//   19   49:checkcast       #50  <Class PendingIntent>
	//   20   52:astore_3        
		intent = new Intent();
	//   21   53:new             #52  <Class Intent>
	//   22   56:dup             
	//   23   57:invokespecial   #53  <Method void Intent()>
	//   24   60:astore          4
		Bundle bundle = new Bundle();
	//   25   62:new             #55  <Class Bundle>
	//   26   65:dup             
	//   27   66:invokespecial   #56  <Method void Bundle()>
	//   28   69:astore          5
		bundle.putParcelable("location", ((android.os.Parcelable) (location)));
	//   29   71:aload           5
	//   30   73:ldc1            #58  <String "location">
	//   31   75:aload_1         
	//   32   76:invokevirtual   #62  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		intent.putExtras(bundle);
	//   33   79:aload           4
	//   34   81:aload           5
	//   35   83:invokevirtual   #66  <Method Intent Intent.putExtras(Bundle)>
	//   36   86:pop             
		try
		{
			pendingintent.send(LocationManagerProxy.b(a), 0, intent);
	//   37   87:aload_3         
	//   38   88:aload_0         
	//   39   89:getfield        #15  <Field LocationManagerProxy a>
	//   40   92:invokestatic    #69  <Method android.content.Context LocationManagerProxy.b(LocationManagerProxy)>
	//   41   95:iconst_0        
	//   42   96:aload           4
	//   43   98:invokevirtual   #73  <Method void PendingIntent.send(android.content.Context, int, Intent)>
		}
	//*  44  101:goto            109
		catch(android.app.xception xception)
	//*  45  104:astore_3        
		{
			try
			{
				xception.printStackTrace();
	//   46  105:aload_3         
	//   47  106:invokevirtual   #76  <Method void android.app.PendingIntent$CanceledException.printStackTrace()>
			}
	//*  48  109:goto            34
	//*  49  112:return          
			// Misplaced declaration of an exception variable
			catch(Location location)
	//*  50  113:astore_1        
			{
				((Throwable) (location)).printStackTrace();
	//   51  114:aload_1         
	//   52  115:invokevirtual   #77  <Method void Throwable.printStackTrace()>
				return;
	//   53  118:return          
			}
		}
		  goto _L1
	}

	public void onLocationChanged(AMapLocation amaplocation)
	{
		Iterator iterator;
		if(LocationManagerProxy.a(a) == null || LocationManagerProxy.a(a).size() <= 0)
			break MISSING_BLOCK_LABEL_112;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field LocationManagerProxy a>
	//    2    4:invokestatic    #28  <Method ArrayList LocationManagerProxy.a(LocationManagerProxy)>
	//    3    7:ifnull          112
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field LocationManagerProxy a>
	//    6   14:invokestatic    #28  <Method ArrayList LocationManagerProxy.a(LocationManagerProxy)>
	//    7   17:invokevirtual   #34  <Method int ArrayList.size()>
	//    8   20:ifle            112
		iterator = LocationManagerProxy.a(a).iterator();
	//    9   23:aload_0         
	//   10   24:getfield        #15  <Field LocationManagerProxy a>
	//   11   27:invokestatic    #28  <Method ArrayList LocationManagerProxy.a(LocationManagerProxy)>
	//   12   30:invokevirtual   #38  <Method Iterator ArrayList.iterator()>
	//   13   33:astore_2        
_L1:
		PendingIntent pendingintent;
		Intent intent;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_112;
	//   14   34:aload_2         
	//   15   35:invokeinterface #44  <Method boolean Iterator.hasNext()>
	//   16   40:ifeq            112
		pendingintent = (PendingIntent)iterator.next();
	//   17   43:aload_2         
	//   18   44:invokeinterface #48  <Method Object Iterator.next()>
	//   19   49:checkcast       #50  <Class PendingIntent>
	//   20   52:astore_3        
		intent = new Intent();
	//   21   53:new             #52  <Class Intent>
	//   22   56:dup             
	//   23   57:invokespecial   #53  <Method void Intent()>
	//   24   60:astore          4
		Bundle bundle = new Bundle();
	//   25   62:new             #55  <Class Bundle>
	//   26   65:dup             
	//   27   66:invokespecial   #56  <Method void Bundle()>
	//   28   69:astore          5
		bundle.putParcelable("location", ((android.os.Parcelable) (amaplocation)));
	//   29   71:aload           5
	//   30   73:ldc1            #58  <String "location">
	//   31   75:aload_1         
	//   32   76:invokevirtual   #62  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		intent.putExtras(bundle);
	//   33   79:aload           4
	//   34   81:aload           5
	//   35   83:invokevirtual   #66  <Method Intent Intent.putExtras(Bundle)>
	//   36   86:pop             
		try
		{
			pendingintent.send(LocationManagerProxy.b(a), 0, intent);
	//   37   87:aload_3         
	//   38   88:aload_0         
	//   39   89:getfield        #15  <Field LocationManagerProxy a>
	//   40   92:invokestatic    #69  <Method android.content.Context LocationManagerProxy.b(LocationManagerProxy)>
	//   41   95:iconst_0        
	//   42   96:aload           4
	//   43   98:invokevirtual   #73  <Method void PendingIntent.send(android.content.Context, int, Intent)>
		}
	//*  44  101:goto            109
		catch(android.app.xception xception)
	//*  45  104:astore_3        
		{
			try
			{
				xception.printStackTrace();
	//   46  105:aload_3         
	//   47  106:invokevirtual   #76  <Method void android.app.PendingIntent$CanceledException.printStackTrace()>
			}
	//*  48  109:goto            34
	//*  49  112:return          
			// Misplaced declaration of an exception variable
			catch(AMapLocation amaplocation)
	//*  50  113:astore_1        
			{
				((Throwable) (amaplocation)).printStackTrace();
	//   51  114:aload_1         
	//   52  115:invokevirtual   #77  <Method void Throwable.printStackTrace()>
				return;
	//   53  118:return          
			}
		}
		  goto _L1
	}

	public void onProviderDisabled(String s)
	{
	//    0    0:return          
	}

	public void onProviderEnabled(String s)
	{
	//    0    0:return          
	}

	public void onStatusChanged(String s, int i, Bundle bundle)
	{
	//    0    0:return          
	}

	final LocationManagerProxy a;

	LocationManagerProxy$b(LocationManagerProxy locationmanagerproxy)
	{
		a = locationmanagerproxy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field LocationManagerProxy a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
