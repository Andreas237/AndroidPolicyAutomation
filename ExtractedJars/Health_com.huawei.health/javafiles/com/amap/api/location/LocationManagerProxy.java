// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.*;
import android.os.Bundle;
import android.os.Looper;
import com.amap.api.location.core.d;
import java.util.*;

// Referenced classes of package com.amap.api.location:
//			a, i, LocationProviderProxy, AMapLocation, 
//			h, AMapLocationListener, AMapLocalWeatherListener

public class LocationManagerProxy
{
	class a
		implements AMapLocationListener
	{

		public void onLocationChanged(Location location)
		{
			int i1;
			if(location == null)
				break MISSING_BLOCK_LABEL_492;
		//    0    0:aload_1         
		//    1    1:ifnull          492
			i j1;
			Throwable throwable;
			try
			{
				location = ((Location) (new AMapLocation(location)));
		//    2    4:new             #24  <Class AMapLocation>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #26  <Method void AMapLocation(Location)>
		//    6   12:astore_1        
			}
		//*   7   13:iconst_0        
		//*   8   14:istore_2        
		//*   9   15:aload_0         
		//*  10   16:getfield        #14  <Field LocationManagerProxy a>
		//*  11   19:invokestatic    #30  <Method Vector LocationManagerProxy.c(LocationManagerProxy)>
		//*  12   22:ifnull          120
		//*  13   25:iload_2         
		//*  14   26:aload_0         
		//*  15   27:getfield        #14  <Field LocationManagerProxy a>
		//*  16   30:invokestatic    #30  <Method Vector LocationManagerProxy.c(LocationManagerProxy)>
		//*  17   33:invokevirtual   #36  <Method int Vector.size()>
		//*  18   36:icmpge          120
		//*  19   39:aload_0         
		//*  20   40:getfield        #14  <Field LocationManagerProxy a>
		//*  21   43:invokestatic    #30  <Method Vector LocationManagerProxy.c(LocationManagerProxy)>
		//*  22   46:iload_2         
		//*  23   47:invokevirtual   #40  <Method Object Vector.get(int)>
		//*  24   50:checkcast       #42  <Class i>
		//*  25   53:astore_3        
		//*  26   54:aload_3         
		//*  27   55:ifnull          75
		//*  28   58:aload_3         
		//*  29   59:getfield        #46  <Field AMapLocationListener i.b>
		//*  30   62:ifnull          75
		//*  31   65:aload_3         
		//*  32   66:getfield        #46  <Field AMapLocationListener i.b>
		//*  33   69:aload_1         
		//*  34   70:invokeinterface #49  <Method void AMapLocationListener.onLocationChanged(AMapLocation)>
		//*  35   75:goto            80
		//*  36   78:astore          4
		//*  37   80:aload_3         
		//*  38   81:ifnull          485
		//*  39   84:aload_3         
		//*  40   85:getfield        #52  <Field long i.a>
		//*  41   88:ldc2w           #53  <Long -1L>
		//*  42   91:lcmp            
		//*  43   92:ifne            485
		//*  44   95:aload_0         
		//*  45   96:getfield        #14  <Field LocationManagerProxy a>
		//*  46   99:invokestatic    #57  <Method Vector com.amap.api.location.LocationManagerProxy.d(LocationManagerProxy)>
		//*  47  102:ifnull          485
		//*  48  105:aload_0         
		//*  49  106:getfield        #14  <Field LocationManagerProxy a>
		//*  50  109:invokestatic    #57  <Method Vector com.amap.api.location.LocationManagerProxy.d(LocationManagerProxy)>
		//*  51  112:aload_3         
		//*  52  113:invokevirtual   #61  <Method boolean Vector.add(Object)>
		//*  53  116:pop             
		//*  54  117:goto            485
		//*  55  120:aload_0         
		//*  56  121:getfield        #14  <Field LocationManagerProxy a>
		//*  57  124:invokestatic    #57  <Method Vector com.amap.api.location.LocationManagerProxy.d(LocationManagerProxy)>
		//*  58  127:ifnull          478
		//*  59  130:aload_0         
		//*  60  131:getfield        #14  <Field LocationManagerProxy a>
		//*  61  134:invokestatic    #57  <Method Vector com.amap.api.location.LocationManagerProxy.d(LocationManagerProxy)>
		//*  62  137:invokevirtual   #36  <Method int Vector.size()>
		//*  63  140:ifle            478
		//*  64  143:aload_0         
		//*  65  144:getfield        #14  <Field LocationManagerProxy a>
		//*  66  147:invokestatic    #30  <Method Vector LocationManagerProxy.c(LocationManagerProxy)>
		//*  67  150:ifnull          478
		//*  68  153:iconst_0        
		//*  69  154:istore_2        
		//*  70  155:iload_2         
		//*  71  156:aload_0         
		//*  72  157:getfield        #14  <Field LocationManagerProxy a>
		//*  73  160:invokestatic    #57  <Method Vector com.amap.api.location.LocationManagerProxy.d(LocationManagerProxy)>
		//*  74  163:invokevirtual   #36  <Method int Vector.size()>
		//*  75  166:icmpge          198
		//*  76  169:aload_0         
		//*  77  170:getfield        #14  <Field LocationManagerProxy a>
		//*  78  173:invokestatic    #30  <Method Vector LocationManagerProxy.c(LocationManagerProxy)>
		//*  79  176:aload_0         
		//*  80  177:getfield        #14  <Field LocationManagerProxy a>
		//*  81  180:invokestatic    #57  <Method Vector com.amap.api.location.LocationManagerProxy.d(LocationManagerProxy)>
		//*  82  183:iload_2         
		//*  83  184:invokevirtual   #40  <Method Object Vector.get(int)>
		//*  84  187:invokevirtual   #64  <Method boolean Vector.remove(Object)>
		//*  85  190:pop             
		//*  86  191:iload_2         
		//*  87  192:iconst_1        
		//*  88  193:iadd            
		//*  89  194:istore_2        
		//*  90  195:goto            155
		//*  91  198:aload_0         
		//*  92  199:getfield        #14  <Field LocationManagerProxy a>
		//*  93  202:invokestatic    #57  <Method Vector com.amap.api.location.LocationManagerProxy.d(LocationManagerProxy)>
		//*  94  205:invokevirtual   #67  <Method void Vector.clear()>
		//*  95  208:aload_0         
		//*  96  209:getfield        #14  <Field LocationManagerProxy a>
		//*  97  212:invokestatic    #30  <Method Vector LocationManagerProxy.c(LocationManagerProxy)>
		//*  98  215:invokevirtual   #36  <Method int Vector.size()>
		//*  99  218:ifne            478
		//* 100  221:aload_0         
		//* 101  222:getfield        #14  <Field LocationManagerProxy a>
		//* 102  225:invokestatic    #71  <Method LocationManager LocationManagerProxy.e(LocationManagerProxy)>
		//* 103  228:ifnull          478
		//* 104  231:aload_0         
		//* 105  232:getfield        #14  <Field LocationManagerProxy a>
		//* 106  235:invokestatic    #75  <Method LocationManagerProxy$a LocationManagerProxy.f(LocationManagerProxy)>
		//* 107  238:ifnull          478
		//* 108  241:aload_0         
		//* 109  242:getfield        #14  <Field LocationManagerProxy a>
		//* 110  245:invokestatic    #71  <Method LocationManager LocationManagerProxy.e(LocationManagerProxy)>
		//* 111  248:aload_0         
		//* 112  249:getfield        #14  <Field LocationManagerProxy a>
		//* 113  252:invokestatic    #75  <Method LocationManagerProxy$a LocationManagerProxy.f(LocationManagerProxy)>
		//* 114  255:invokevirtual   #81  <Method void LocationManager.removeUpdates(android.location.LocationListener)>
		//* 115  258:goto            478
		//* 116  261:aload_0         
		//* 117  262:getfield        #14  <Field LocationManagerProxy a>
		//* 118  265:invokestatic    #30  <Method Vector LocationManagerProxy.c(LocationManagerProxy)>
		//* 119  268:ifnull          340
		//* 120  271:iload_2         
		//* 121  272:aload_0         
		//* 122  273:getfield        #14  <Field LocationManagerProxy a>
		//* 123  276:invokestatic    #30  <Method Vector LocationManagerProxy.c(LocationManagerProxy)>
		//* 124  279:invokevirtual   #36  <Method int Vector.size()>
		//* 125  282:icmpge          340
		//* 126  285:aload_0         
		//* 127  286:getfield        #14  <Field LocationManagerProxy a>
		//* 128  289:invokestatic    #30  <Method Vector LocationManagerProxy.c(LocationManagerProxy)>
		//* 129  292:iload_2         
		//* 130  293:invokevirtual   #40  <Method Object Vector.get(int)>
		//* 131  296:checkcast       #42  <Class i>
		//* 132  299:astore_1        
		//* 133  300:aload_1         
		//* 134  301:ifnull          497
		//* 135  304:aload_1         
		//* 136  305:getfield        #52  <Field long i.a>
		//* 137  308:ldc2w           #53  <Long -1L>
		//* 138  311:lcmp            
		//* 139  312:ifne            497
		//* 140  315:aload_0         
		//* 141  316:getfield        #14  <Field LocationManagerProxy a>
		//* 142  319:invokestatic    #57  <Method Vector com.amap.api.location.LocationManagerProxy.d(LocationManagerProxy)>
		//* 143  322:ifnull          497
		//* 144  325:aload_0         
		//* 145  326:getfield        #14  <Field LocationManagerProxy a>
		//* 146  329:invokestatic    #57  <Method Vector com.amap.api.location.LocationManagerProxy.d(LocationManagerProxy)>
		//* 147  332:aload_1         
		//* 148  333:invokevirtual   #61  <Method boolean Vector.add(Object)>
		//* 149  336:pop             
		//* 150  337:goto            497
		//* 151  340:aload_0         
		//* 152  341:getfield        #14  <Field LocationManagerProxy a>
		//* 153  344:invokestatic    #57  <Method Vector com.amap.api.location.LocationManagerProxy.d(LocationManagerProxy)>
		//* 154  347:ifnull          478
		//* 155  350:aload_0         
		//* 156  351:getfield        #14  <Field LocationManagerProxy a>
		//* 157  354:invokestatic    #57  <Method Vector com.amap.api.location.LocationManagerProxy.d(LocationManagerProxy)>
		//* 158  357:invokevirtual   #36  <Method int Vector.size()>
		//* 159  360:ifle            478
		//* 160  363:aload_0         
		//* 161  364:getfield        #14  <Field LocationManagerProxy a>
		//* 162  367:invokestatic    #30  <Method Vector LocationManagerProxy.c(LocationManagerProxy)>
		//* 163  370:ifnull          478
		//* 164  373:iconst_0        
		//* 165  374:istore_2        
		//* 166  375:iload_2         
		//* 167  376:aload_0         
		//* 168  377:getfield        #14  <Field LocationManagerProxy a>
		//* 169  380:invokestatic    #57  <Method Vector com.amap.api.location.LocationManagerProxy.d(LocationManagerProxy)>
		//* 170  383:invokevirtual   #36  <Method int Vector.size()>
		//* 171  386:icmpge          418
		//* 172  389:aload_0         
		//* 173  390:getfield        #14  <Field LocationManagerProxy a>
		//* 174  393:invokestatic    #30  <Method Vector LocationManagerProxy.c(LocationManagerProxy)>
		//* 175  396:aload_0         
		//* 176  397:getfield        #14  <Field LocationManagerProxy a>
		//* 177  400:invokestatic    #57  <Method Vector com.amap.api.location.LocationManagerProxy.d(LocationManagerProxy)>
		//* 178  403:iload_2         
		//* 179  404:invokevirtual   #40  <Method Object Vector.get(int)>
		//* 180  407:invokevirtual   #64  <Method boolean Vector.remove(Object)>
		//* 181  410:pop             
		//* 182  411:iload_2         
		//* 183  412:iconst_1        
		//* 184  413:iadd            
		//* 185  414:istore_2        
		//* 186  415:goto            375
		//* 187  418:aload_0         
		//* 188  419:getfield        #14  <Field LocationManagerProxy a>
		//* 189  422:invokestatic    #57  <Method Vector com.amap.api.location.LocationManagerProxy.d(LocationManagerProxy)>
		//* 190  425:invokevirtual   #67  <Method void Vector.clear()>
		//* 191  428:aload_0         
		//* 192  429:getfield        #14  <Field LocationManagerProxy a>
		//* 193  432:invokestatic    #30  <Method Vector LocationManagerProxy.c(LocationManagerProxy)>
		//* 194  435:invokevirtual   #36  <Method int Vector.size()>
		//* 195  438:ifne            478
		//* 196  441:aload_0         
		//* 197  442:getfield        #14  <Field LocationManagerProxy a>
		//* 198  445:invokestatic    #71  <Method LocationManager LocationManagerProxy.e(LocationManagerProxy)>
		//* 199  448:ifnull          478
		//* 200  451:aload_0         
		//* 201  452:getfield        #14  <Field LocationManagerProxy a>
		//* 202  455:invokestatic    #75  <Method LocationManagerProxy$a LocationManagerProxy.f(LocationManagerProxy)>
		//* 203  458:ifnull          478
		//* 204  461:aload_0         
		//* 205  462:getfield        #14  <Field LocationManagerProxy a>
		//* 206  465:invokestatic    #71  <Method LocationManager LocationManagerProxy.e(LocationManagerProxy)>
		//* 207  468:aload_0         
		//* 208  469:getfield        #14  <Field LocationManagerProxy a>
		//* 209  472:invokestatic    #75  <Method LocationManagerProxy$a LocationManagerProxy.f(LocationManagerProxy)>
		//* 210  475:invokevirtual   #81  <Method void LocationManager.removeUpdates(android.location.LocationListener)>
		//* 211  478:return          
			// Misplaced declaration of an exception variable
			catch(Location location)
		//* 212  479:astore_1        
			{
				((Throwable) (location)).printStackTrace();
		//  213  480:aload_1         
		//  214  481:invokevirtual   #84  <Method void Throwable.printStackTrace()>
				return;
		//  215  484:return          
			}
			i1 = 0;
_L12:
			if(LocationManagerProxy.c(a) == null || i1 >= LocationManagerProxy.c(a).size()) goto _L2; else goto _L1
_L1:
			j1 = (i)LocationManagerProxy.c(a).get(i1);
label0:
			{
				if(j1 == null)
					break label0;
				try
				{
					if(j1.b != null)
						j1.b.onLocationChanged(((AMapLocation) (location)));
					break label0;
				}
				// Misplaced declaration of an exception variable
				catch(Throwable throwable) { }
			}
			if(j1 == null) goto _L4; else goto _L3
_L3:
			if(j1.a == -1L && com.amap.api.location.LocationManagerProxy.d(a) != null)
				com.amap.api.location.LocationManagerProxy.d(a).add(((Object) (j1)));
			  goto _L4
_L2:
			if(com.amap.api.location.LocationManagerProxy.d(a) == null || com.amap.api.location.LocationManagerProxy.d(a).size() <= 0 || LocationManagerProxy.c(a) == null) goto _L6; else goto _L5
_L5:
			i1 = 0;
_L8:
			if(i1 >= com.amap.api.location.LocationManagerProxy.d(a).size())
				break; /* Loop/switch isn't completed */
			LocationManagerProxy.c(a).remove(com.amap.api.location.LocationManagerProxy.d(a).get(i1));
			i1++;
			if(true) goto _L8; else goto _L7
_L7:
			com.amap.api.location.LocationManagerProxy.d(a).clear();
			if(LocationManagerProxy.c(a).size() == 0 && LocationManagerProxy.e(a) != null && LocationManagerProxy.f(a) != null)
				LocationManagerProxy.e(a).removeUpdates(((android.location.LocationListener) (LocationManagerProxy.f(a))));
			  goto _L6
_L13:
			for(; LocationManagerProxy.c(a) == null || i1 >= LocationManagerProxy.c(a).size(); i1++)
				break MISSING_BLOCK_LABEL_340;

		//  216  485:iload_2         
		//  217  486:iconst_1        
		//  218  487:iadd            
		//  219  488:istore_2        
		//  220  489:goto            15
		//  221  492:iconst_0        
		//  222  493:istore_2        
		//  223  494:goto            261
		//  224  497:iload_2         
		//  225  498:iconst_1        
		//  226  499:iadd            
		//  227  500:istore_2        
			location = ((Location) ((i)LocationManagerProxy.c(a).get(i1)));
			if(location == null)
				break MISSING_BLOCK_LABEL_497;
			if(((i) (location)).a == -1L && com.amap.api.location.LocationManagerProxy.d(a) != null)
				com.amap.api.location.LocationManagerProxy.d(a).add(((Object) (location)));
			break MISSING_BLOCK_LABEL_497;
			if(com.amap.api.location.LocationManagerProxy.d(a) == null || com.amap.api.location.LocationManagerProxy.d(a).size() <= 0 || LocationManagerProxy.c(a) == null) goto _L6; else goto _L9
_L9:
			i1 = 0;
_L11:
			if(i1 >= com.amap.api.location.LocationManagerProxy.d(a).size())
				break; /* Loop/switch isn't completed */
			LocationManagerProxy.c(a).remove(com.amap.api.location.LocationManagerProxy.d(a).get(i1));
			i1++;
			if(true) goto _L11; else goto _L10
_L10:
			com.amap.api.location.LocationManagerProxy.d(a).clear();
			if(LocationManagerProxy.c(a).size() == 0 && LocationManagerProxy.e(a) != null && LocationManagerProxy.f(a) != null)
				LocationManagerProxy.e(a).removeUpdates(((android.location.LocationListener) (LocationManagerProxy.f(a))));
_L6:
			return;
_L4:
			i1++;
			  goto _L12
			i1 = 0;
			  goto _L13
		//* 228  501:goto            261
		}

		public void onLocationChanged(AMapLocation amaplocation)
		{
		//    0    0:return          
		}

		public void onProviderDisabled(String s)
		{
		//    0    0:return          
		}

		public void onProviderEnabled(String s)
		{
		//    0    0:return          
		}

		public void onStatusChanged(String s, int i1, Bundle bundle)
		{
		//    0    0:return          
		}

		final LocationManagerProxy a;

		a()
		{
			a = LocationManagerProxy.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field LocationManagerProxy a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void Object()>
		//    5    9:return          
		}
	}

	class b
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
		//   40   92:invokestatic    #69  <Method Context LocationManagerProxy.b(LocationManagerProxy)>
		//   41   95:iconst_0        
		//   42   96:aload           4
		//   43   98:invokevirtual   #73  <Method void PendingIntent.send(Context, int, Intent)>
			}
		//*  44  101:goto            109
			catch(android.app.PendingIntent.CanceledException canceledexception)
		//*  45  104:astore_3        
			{
				try
				{
					canceledexception.printStackTrace();
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
		//   40   92:invokestatic    #69  <Method Context LocationManagerProxy.b(LocationManagerProxy)>
		//   41   95:iconst_0        
		//   42   96:aload           4
		//   43   98:invokevirtual   #73  <Method void PendingIntent.send(Context, int, Intent)>
			}
		//*  44  101:goto            109
			catch(android.app.PendingIntent.CanceledException canceledexception)
		//*  45  104:astore_3        
			{
				try
				{
					canceledexception.printStackTrace();
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

		public void onStatusChanged(String s, int i1, Bundle bundle)
		{
		//    0    0:return          
		}

		final LocationManagerProxy a;

		b()
		{
			a = LocationManagerProxy.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field LocationManagerProxy a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}


	private LocationManagerProxy(Activity activity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void Object()>
		b = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #71  <Field LocationManager b>
		d = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #73  <Field a d>
		h = new ArrayList();
	//    8   14:aload_0         
	//    9   15:new             #75  <Class ArrayList>
	//   10   18:dup             
	//   11   19:invokespecial   #76  <Method void ArrayList()>
	//   12   22:putfield        #78  <Field ArrayList h>
		i = new Hashtable();
	//   13   25:aload_0         
	//   14   26:new             #80  <Class Hashtable>
	//   15   29:dup             
	//   16   30:invokespecial   #81  <Method void Hashtable()>
	//   17   33:putfield        #83  <Field Hashtable i>
		j = new Vector();
	//   18   36:aload_0         
	//   19   37:new             #85  <Class Vector>
	//   20   40:dup             
	//   21   41:invokespecial   #86  <Method void Vector()>
	//   22   44:putfield        #88  <Field Vector j>
		k = new Vector();
	//   23   47:aload_0         
	//   24   48:new             #85  <Class Vector>
	//   25   51:dup             
	//   26   52:invokespecial   #86  <Method void Vector()>
	//   27   55:putfield        #90  <Field Vector k>
		l = new a();
	//   28   58:aload_0         
	//   29   59:new             #6   <Class LocationManagerProxy$a>
	//   30   62:dup             
	//   31   63:aload_0         
	//   32   64:invokespecial   #93  <Method void LocationManagerProxy$a(LocationManagerProxy)>
	//   33   67:putfield        #95  <Field LocationManagerProxy$a l>
		a(activity.getApplicationContext());
	//   34   70:aload_0         
	//   35   71:aload_1         
	//   36   72:invokevirtual   #101 <Method Context Activity.getApplicationContext()>
	//   37   75:invokespecial   #104 <Method void a(Context)>
	//   38   78:return          
	}

	private LocationManagerProxy(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void Object()>
		b = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #71  <Field LocationManager b>
		d = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #73  <Field a d>
		h = new ArrayList();
	//    8   14:aload_0         
	//    9   15:new             #75  <Class ArrayList>
	//   10   18:dup             
	//   11   19:invokespecial   #76  <Method void ArrayList()>
	//   12   22:putfield        #78  <Field ArrayList h>
		i = new Hashtable();
	//   13   25:aload_0         
	//   14   26:new             #80  <Class Hashtable>
	//   15   29:dup             
	//   16   30:invokespecial   #81  <Method void Hashtable()>
	//   17   33:putfield        #83  <Field Hashtable i>
		j = new Vector();
	//   18   36:aload_0         
	//   19   37:new             #85  <Class Vector>
	//   20   40:dup             
	//   21   41:invokespecial   #86  <Method void Vector()>
	//   22   44:putfield        #88  <Field Vector j>
		k = new Vector();
	//   23   47:aload_0         
	//   24   48:new             #85  <Class Vector>
	//   25   51:dup             
	//   26   52:invokespecial   #86  <Method void Vector()>
	//   27   55:putfield        #90  <Field Vector k>
		l = new a();
	//   28   58:aload_0         
	//   29   59:new             #6   <Class LocationManagerProxy$a>
	//   30   62:dup             
	//   31   63:aload_0         
	//   32   64:invokespecial   #93  <Method void LocationManagerProxy$a(LocationManagerProxy)>
	//   33   67:putfield        #95  <Field LocationManagerProxy$a l>
		a(context);
	//   34   70:aload_0         
	//   35   71:aload_1         
	//   36   72:invokespecial   #104 <Method void a(Context)>
	//   37   75:return          
	}

	static ArrayList a(LocationManagerProxy locationmanagerproxy)
	{
		return locationmanagerproxy.h;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field ArrayList h>
	//    2    4:areturn         
	}

	private static void a()
	{
		c = null;
	//    0    0:aconst_null     
	//    1    1:putstatic       #62  <Field LocationManagerProxy c>
	//    2    4:return          
	}

	private void a(Context context)
	{
		try
		{
			e = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #109 <Field Context e>
			b = (LocationManager)context.getSystemService("location");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #17  <String "location">
	//    6    9:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//    7   12:checkcast       #117 <Class LocationManager>
	//    8   15:putfield        #71  <Field LocationManager b>
			d = com.amap.api.location.a.a(context.getApplicationContext(), b);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #118 <Method Context Context.getApplicationContext()>
	//   12   23:aload_0         
	//   13   24:getfield        #71  <Field LocationManager b>
	//   14   27:invokestatic    #123 <Method a a.a(Context, LocationManager)>
	//   15   30:putfield        #73  <Field a d>
			return;
	//   16   33:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  17   34:astore_1        
		{
			((Throwable) (context)).printStackTrace();
	//   18   35:aload_1         
	//   19   36:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   20   39:return          
	}

	private void a(String s, long l1, float f1, AMapLocationListener amaplocationlistener, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(d == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #73  <Field a d>
	//*   4    6:ifnonnull       179
			d = com.amap.api.location.a.a(e.getApplicationContext(), b);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #109 <Field Context e>
	//    8   14:invokevirtual   #118 <Method Context Context.getApplicationContext()>
	//    9   17:aload_0         
	//   10   18:getfield        #71  <Field LocationManager b>
	//   11   21:invokestatic    #123 <Method a a.a(Context, LocationManager)>
	//   12   24:putfield        #73  <Field a d>
		  goto _L1
	//*  13   27:goto            179
_L3:
		String s1;
		if("lbs".equals(((Object) (s1))))
	//*  14   30:ldc1            #129 <String "lbs">
	//*  15   32:aload           7
	//*  16   34:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*  17   37:ifeq            66
		{
			if(d != null)
	//*  18   40:aload_0         
	//*  19   41:getfield        #73  <Field a d>
	//*  20   44:ifnull          163
				d.a(l1, f1, amaplocationlistener, "lbs", flag);
	//   21   47:aload_0         
	//   22   48:getfield        #73  <Field a d>
	//   23   51:lload_2         
	//   24   52:fload           4
	//   25   54:aload           5
	//   26   56:ldc1            #129 <String "lbs">
	//   27   58:iload           6
	//   28   60:invokevirtual   #138 <Method void a.a(long, float, AMapLocationListener, String, boolean)>
			break MISSING_BLOCK_LABEL_171;
	//   29   63:goto            163
		}
		if("gps".equals(((Object) (s1))))
	//*  30   66:ldc1            #14  <String "gps">
	//*  31   68:aload           7
	//*  32   70:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*  33   73:ifeq            102
		{
			if(d != null)
	//*  34   76:aload_0         
	//*  35   77:getfield        #73  <Field a d>
	//*  36   80:ifnull          163
				d.a(l1, f1, amaplocationlistener, "gps", flag);
	//   37   83:aload_0         
	//   38   84:getfield        #73  <Field a d>
	//   39   87:lload_2         
	//   40   88:fload           4
	//   41   90:aload           5
	//   42   92:ldc1            #14  <String "gps">
	//   43   94:iload           6
	//   44   96:invokevirtual   #138 <Method void a.a(long, float, AMapLocationListener, String, boolean)>
			break MISSING_BLOCK_LABEL_171;
	//   45   99:goto            163
		}
		try
		{
			s = ((String) (e.getMainLooper()));
	//   46  102:aload_0         
	//   47  103:getfield        #109 <Field Context e>
	//   48  106:invokevirtual   #142 <Method Looper Context.getMainLooper()>
	//   49  109:astore_1        
			if(Looper.myLooper() == null)
	//*  50  110:invokestatic    #147 <Method Looper Looper.myLooper()>
	//*  51  113:ifnonnull       119
				Looper.prepare();
	//   52  116:invokestatic    #150 <Method void Looper.prepare()>
			amaplocationlistener = ((AMapLocationListener) (new i(l1, f1, amaplocationlistener, s1, false)));
	//   53  119:new             #152 <Class i>
	//   54  122:dup             
	//   55  123:lload_2         
	//   56  124:fload           4
	//   57  126:aload           5
	//   58  128:aload           7
	//   59  130:iconst_0        
	//   60  131:invokespecial   #154 <Method void i(long, float, AMapLocationListener, String, boolean)>
	//   61  134:astore          5
			j.add(((Object) (amaplocationlistener)));
	//   62  136:aload_0         
	//   63  137:getfield        #88  <Field Vector j>
	//   64  140:aload           5
	//   65  142:invokevirtual   #157 <Method boolean Vector.add(Object)>
	//   66  145:pop             
			b.requestLocationUpdates(s1, l1, f1, ((android.location.LocationListener) (l)), ((Looper) (s)));
	//   67  146:aload_0         
	//   68  147:getfield        #71  <Field LocationManager b>
	//   69  150:aload           7
	//   70  152:lload_2         
	//   71  153:fload           4
	//   72  155:aload_0         
	//   73  156:getfield        #95  <Field LocationManagerProxy$a l>
	//   74  159:aload_1         
	//   75  160:invokevirtual   #161 <Method void LocationManager.requestLocationUpdates(String, long, float, android.location.LocationListener, Looper)>
			break MISSING_BLOCK_LABEL_171;
	//   76  163:goto            171
		}
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//   77  166:astore_1        
		((Throwable) (s)).printStackTrace();
	//   78  167:aload_1         
	//   79  168:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		this;
	//   80  171:aload_0         
		JVM INSTR monitorexit ;
	//   81  172:monitorexit     
		return;
	//   82  173:return          
		s;
	//   83  174:astore_1        
	//*  84  175:aload_0         
		throw s;
	//   85  176:monitorexit     
	//   86  177:aload_1         
	//   87  178:athrow          
_L1:
		s1 = s;
	//   88  179:aload_1         
	//   89  180:astore          7
		if(s == null)
	//*  90  182:aload_1         
	//*  91  183:ifnonnull       30
			s1 = "lbs";
	//   92  186:ldc1            #129 <String "lbs">
	//   93  188:astore          7
		if(true) goto _L3; else goto _L2
	//   94  190:goto            30
_L2:
	}

	static Context b(LocationManagerProxy locationmanagerproxy)
	{
		return locationmanagerproxy.e;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Context e>
	//    2    4:areturn         
	}

	static Vector c(LocationManagerProxy locationmanagerproxy)
	{
		return locationmanagerproxy.j;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field Vector j>
	//    2    4:areturn         
	}

	static Vector d(LocationManagerProxy locationmanagerproxy)
	{
		return locationmanagerproxy.k;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Vector k>
	//    2    4:areturn         
	}

	static LocationManager e(LocationManagerProxy locationmanagerproxy)
	{
		return locationmanagerproxy.b;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field LocationManager b>
	//    2    4:areturn         
	}

	static a f(LocationManagerProxy locationmanagerproxy)
	{
		return locationmanagerproxy.l;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field LocationManagerProxy$a l>
	//    2    4:areturn         
	}

	public static LocationManagerProxy getInstance(Activity activity)
	{
		Object obj = a;
	//    0    0:getstatic       #67  <Field Object a>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(c == null)
	//*   4    6:getstatic       #62  <Field LocationManagerProxy c>
	//*   5    9:ifnonnull       23
			c = new LocationManagerProxy(activity);
	//    6   12:new             #2   <Class LocationManagerProxy>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #169 <Method void LocationManagerProxy(Activity)>
	//   10   20:putstatic       #62  <Field LocationManagerProxy c>
		obj;
	//   11   23:aload_1         
		JVM INSTR monitorexit ;
	//   12   24:monitorexit     
		  goto _L1
	//*  13   25:goto            33
		activity;
	//   14   28:astore_0        
	//*  15   29:aload_1         
		throw activity;
	//   16   30:monitorexit     
	//   17   31:aload_0         
	//   18   32:athrow          
_L1:
		activity = ((Activity) (c));
	//   19   33:getstatic       #62  <Field LocationManagerProxy c>
	//   20   36:astore_0        
		return ((LocationManagerProxy) (activity));
	//   21   37:aload_0         
	//   22   38:areturn         
		activity;
	//   23   39:astore_0        
		((Throwable) (activity)).printStackTrace();
	//   24   40:aload_0         
	//   25   41:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		return null;
	//   26   44:aconst_null     
	//   27   45:areturn         
	}

	public static LocationManagerProxy getInstance(Context context)
	{
		com/amap/api/location/LocationManagerProxy;
	//    0    0:ldc1            #2   <Class LocationManagerProxy>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(c == null)
	//*   2    3:getstatic       #62  <Field LocationManagerProxy c>
	//*   3    6:ifnonnull       20
			c = new LocationManagerProxy(context);
	//    4    9:new             #2   <Class LocationManagerProxy>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:invokespecial   #172 <Method void LocationManagerProxy(Context)>
	//    8   17:putstatic       #62  <Field LocationManagerProxy c>
		context = ((Context) (c));
	//    9   20:getstatic       #62  <Field LocationManagerProxy c>
	//   10   23:astore_0        
		com/amap/api/location/LocationManagerProxy;
	//   11   24:ldc1            #2   <Class LocationManagerProxy>
		JVM INSTR monitorexit ;
	//   12   26:monitorexit     
		return ((LocationManagerProxy) (context));
	//   13   27:aload_0         
	//   14   28:areturn         
		context;
	//   15   29:astore_0        
		((Throwable) (context)).printStackTrace();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		com/amap/api/location/LocationManagerProxy;
	//   18   34:ldc1            #2   <Class LocationManagerProxy>
		JVM INSTR monitorexit ;
	//   19   36:monitorexit     
		return null;
	//   20   37:aconst_null     
	//   21   38:areturn         
		context;
	//   22   39:astore_0        
	//*  23   40:ldc1            #2   <Class LocationManagerProxy>
		throw context;
	//   24   42:monitorexit     
	//   25   43:aload_0         
	//   26   44:athrow          
	}

	public static String getVersion()
	{
		return "V1.3.3";
	//    0    0:ldc1            #176 <String "V1.3.3">
	//    1    2:areturn         
	}

	public void addGeoFenceAlert(double d1, double d2, float f1, long l1, 
			PendingIntent pendingintent)
	{
		try
		{
			if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field a d>
	//*   2    4:ifnull          22
				d.b(d1, d2, f1, l1, pendingintent);
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field a d>
	//    5   11:dload_1         
	//    6   12:dload_3         
	//    7   13:fload           5
	//    8   15:lload           6
	//    9   17:aload           8
	//   10   19:invokevirtual   #180 <Method void a.b(double, double, float, long, PendingIntent)>
			return;
	//   11   22:return          
		}
		// Misplaced declaration of an exception variable
		catch(PendingIntent pendingintent)
	//*  12   23:astore          8
		{
			((Throwable) (pendingintent)).printStackTrace();
	//   13   25:aload           8
	//   14   27:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   15   30:return          
	}

	public boolean addGpsStatusListener(android.location.GpsStatus.Listener listener)
	{
		boolean flag;
		if(b == null)
			break MISSING_BLOCK_LABEL_26;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field LocationManager b>
	//    2    4:ifnull          18
		flag = b.addGpsStatusListener(listener);
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field LocationManager b>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #184 <Method boolean LocationManager.addGpsStatusListener(android.location.GpsStatus$Listener)>
	//    7   15:istore_2        
		return flag;
	//    8   16:iload_2         
	//    9   17:ireturn         
	//*  10   18:goto            26
		listener;
	//   11   21:astore_1        
		((Throwable) (listener)).printStackTrace();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		return false;
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	public void addProximityAlert(double d1, double d2, float f1, long l1, 
			PendingIntent pendingintent)
	{
		try
		{
			if(d.g)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field a d>
	//*   2    4:getfield        #188 <Field boolean a.g>
	//*   3    7:ifeq            25
				b.addProximityAlert(d1, d2, f1, l1, pendingintent);
	//    4   10:aload_0         
	//    5   11:getfield        #71  <Field LocationManager b>
	//    6   14:dload_1         
	//    7   15:dload_3         
	//    8   16:fload           5
	//    9   18:lload           6
	//   10   20:aload           8
	//   11   22:invokevirtual   #190 <Method void LocationManager.addProximityAlert(double, double, float, long, PendingIntent)>
			d.a(d1, d2, f1, l1, pendingintent);
	//   12   25:aload_0         
	//   13   26:getfield        #73  <Field a d>
	//   14   29:dload_1         
	//   15   30:dload_3         
	//   16   31:fload           5
	//   17   33:lload           6
	//   18   35:aload           8
	//   19   37:invokevirtual   #192 <Method void a.a(double, double, float, long, PendingIntent)>
			return;
	//   20   40:return          
		}
		// Misplaced declaration of an exception variable
		catch(PendingIntent pendingintent)
	//*  21   41:astore          8
		{
			((Throwable) (pendingintent)).printStackTrace();
	//   22   43:aload           8
	//   23   45:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   24   48:return          
	}

	public void addTestProvider(String s, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5, 
			boolean flag6, int i1, int j1)
	{
		try
		{
			if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field LocationManager b>
	//*   2    4:ifnull          31
				b.addTestProvider(s, flag, flag1, flag2, flag3, flag4, flag5, flag6, i1, j1);
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field LocationManager b>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:iload           4
	//    9   16:iload           5
	//   10   18:iload           6
	//   11   20:iload           7
	//   12   22:iload           8
	//   13   24:iload           9
	//   14   26:iload           10
	//   15   28:invokevirtual   #196 <Method void LocationManager.addTestProvider(String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, int)>
			return;
	//   16   31:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  17   32:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   20   37:return          
	}

	public void clearTestProviderEnabled(String s)
	{
		try
		{
			if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field LocationManager b>
	//*   2    4:ifnull          15
				b.clearTestProviderEnabled(s);
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field LocationManager b>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #200 <Method void LocationManager.clearTestProviderEnabled(String)>
			return;
	//    7   15:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   8   16:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   11   21:return          
	}

	public void clearTestProviderLocation(String s)
	{
		try
		{
			if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field LocationManager b>
	//*   2    4:ifnull          15
				b.clearTestProviderLocation(s);
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field LocationManager b>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #203 <Method void LocationManager.clearTestProviderLocation(String)>
			return;
	//    7   15:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   8   16:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   11   21:return          
	}

	public void clearTestProviderStatus(String s)
	{
		try
		{
			if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field LocationManager b>
	//*   2    4:ifnull          15
				b.clearTestProviderStatus(s);
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field LocationManager b>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #206 <Method void LocationManager.clearTestProviderStatus(String)>
			return;
	//    7   15:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   8   16:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   11   21:return          
	}

	public void destory()
	{
		try
		{
			destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #211 <Method void destroy()>
			return;
	//    2    4:return          
		}
		catch(Throwable throwable)
	//*   3    5:astore_1        
		{
			throwable.printStackTrace();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    6   10:return          
	}

	public void destroy()
	{
		Object obj = a;
	//    0    0:getstatic       #67  <Field Object a>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		com.amap.api.location.a.c();
	//    4    6:invokestatic    #214 <Method void a.c()>
		if(i != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #83  <Field Hashtable i>
	//*   7   13:ifnull          23
			i.clear();
	//    8   16:aload_0         
	//    9   17:getfield        #83  <Field Hashtable i>
	//   10   20:invokevirtual   #217 <Method void Hashtable.clear()>
		if(j != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #88  <Field Vector j>
	//*  13   27:ifnull          37
			j.clear();
	//   14   30:aload_0         
	//   15   31:getfield        #88  <Field Vector j>
	//   16   34:invokevirtual   #218 <Method void Vector.clear()>
		if(b == null) goto _L2; else goto _L1
	//   17   37:aload_0         
	//   18   38:getfield        #71  <Field LocationManager b>
	//   19   41:ifnull          109
_L1:
		if(l != null)
	//*  20   44:aload_0         
	//*  21   45:getfield        #95  <Field LocationManagerProxy$a l>
	//*  22   48:ifnull          62
			b.removeUpdates(((android.location.LocationListener) (l)));
	//   23   51:aload_0         
	//   24   52:getfield        #71  <Field LocationManager b>
	//   25   55:aload_0         
	//   26   56:getfield        #95  <Field LocationManagerProxy$a l>
	//   27   59:invokevirtual   #222 <Method void LocationManager.removeUpdates(android.location.LocationListener)>
		if(h == null) goto _L2; else goto _L3
	//   28   62:aload_0         
	//   29   63:getfield        #78  <Field ArrayList h>
	//   30   66:ifnull          109
_L3:
		int i1 = 0;
	//   31   69:iconst_0        
	//   32   70:istore_1        
_L9:
		if(i1 >= h.size()) goto _L2; else goto _L4
	//   33   71:iload_1         
	//   34   72:aload_0         
	//   35   73:getfield        #78  <Field ArrayList h>
	//   36   76:invokevirtual   #226 <Method int ArrayList.size()>
	//   37   79:icmpge          109
_L4:
		PendingIntent pendingintent = (PendingIntent)h.get(i1);
	//   38   82:aload_0         
	//   39   83:getfield        #78  <Field ArrayList h>
	//   40   86:iload_1         
	//   41   87:invokevirtual   #230 <Method Object ArrayList.get(int)>
	//   42   90:checkcast       #232 <Class PendingIntent>
	//   43   93:astore_3        
		if(pendingintent == null) goto _L6; else goto _L5
	//   44   94:aload_3         
	//   45   95:ifnull          153
_L5:
		b.removeUpdates(pendingintent);
	//   46   98:aload_0         
	//   47   99:getfield        #71  <Field LocationManager b>
	//   48  102:aload_3         
	//   49  103:invokevirtual   #235 <Method void LocationManager.removeUpdates(PendingIntent)>
		  goto _L6
	//*  50  106:goto            153
_L2:
		if(h != null)
	//*  51  109:aload_0         
	//*  52  110:getfield        #78  <Field ArrayList h>
	//*  53  113:ifnull          123
			h.clear();
	//   54  116:aload_0         
	//   55  117:getfield        #78  <Field ArrayList h>
	//   56  120:invokevirtual   #236 <Method void ArrayList.clear()>
		d = null;
	//   57  123:aload_0         
	//   58  124:aconst_null     
	//   59  125:putfield        #73  <Field a d>
		a();
	//   60  128:invokestatic    #238 <Method void a()>
		l = null;
	//   61  131:aload_0         
	//   62  132:aconst_null     
	//   63  133:putfield        #95  <Field LocationManagerProxy$a l>
		obj;
	//   64  136:aload_2         
		JVM INSTR monitorexit ;
	//   65  137:monitorexit     
		  goto _L7
	//*  66  138:goto            146
		Exception exception;
		exception;
	//   67  141:astore_3        
	//*  68  142:aload_2         
		throw exception;
	//   69  143:monitorexit     
	//   70  144:aload_3         
	//   71  145:athrow          
_L7:
		return;
	//   72  146:return          
		Throwable throwable;
		throwable;
	//   73  147:astore_2        
		throwable.printStackTrace();
	//   74  148:aload_2         
	//   75  149:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		return;
	//   76  152:return          
_L6:
		i1++;
	//   77  153:iload_1         
	//   78  154:iconst_1        
	//   79  155:iadd            
	//   80  156:istore_1        
		if(true) goto _L9; else goto _L8
	//   81  157:goto            71
_L8:
	}

	public List getAllProviders()
	{
		Object obj;
		List list;
		try
		{
			list = b.getAllProviders();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field LocationManager b>
	//    2    4:invokevirtual   #242 <Method List LocationManager.getAllProviders()>
	//    3    7:astore_2        
		}
	//*   4    8:aload_2         
	//*   5    9:ifnull          36
	//*   6   12:aload_2         
	//*   7   13:astore_1        
	//*   8   14:aload_2         
	//*   9   15:ldc1            #129 <String "lbs">
	//*  10   17:invokeinterface #247 <Method boolean List.contains(Object)>
	//*  11   22:ifne            67
	//*  12   25:aload_2         
	//*  13   26:ldc1            #129 <String "lbs">
	//*  14   28:invokeinterface #248 <Method boolean List.add(Object)>
	//*  15   33:pop             
	//*  16   34:aload_2         
	//*  17   35:areturn         
	//*  18   36:new             #75  <Class ArrayList>
	//*  19   39:dup             
	//*  20   40:invokespecial   #76  <Method void ArrayList()>
	//*  21   43:astore_1        
	//*  22   44:aload_1         
	//*  23   45:ldc1            #129 <String "lbs">
	//*  24   47:invokeinterface #248 <Method boolean List.add(Object)>
	//*  25   52:pop             
	//*  26   53:aload_1         
	//*  27   54:aload_0         
	//*  28   55:getfield        #71  <Field LocationManager b>
	//*  29   58:invokevirtual   #242 <Method List LocationManager.getAllProviders()>
	//*  30   61:invokeinterface #252 <Method boolean List.addAll(java.util.Collection)>
	//*  31   66:pop             
	//*  32   67:aload_1         
	//*  33   68:areturn         
		catch(Throwable throwable)
	//*  34   69:astore_1        
		{
			throwable.printStackTrace();
	//   35   70:aload_1         
	//   36   71:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   37   74:aconst_null     
	//   38   75:areturn         
		}
		if(list == null)
			break MISSING_BLOCK_LABEL_36;
		obj = ((Object) (list));
		if(list.contains("lbs"))
			break MISSING_BLOCK_LABEL_67;
		list.add("lbs");
		return list;
		obj = ((Object) (new ArrayList()));
		((List) (obj)).add("lbs");
		((List) (obj)).addAll(((java.util.Collection) (b.getAllProviders())));
		return ((List) (obj));
	}

	public String getBestProvider(Criteria criteria, boolean flag)
	{
		String s = "lbs";
	//    0    0:ldc1            #129 <String "lbs">
	//    1    2:astore_3        
		if(criteria == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       10
			return "lbs";
	//    4    7:ldc1            #129 <String "lbs">
	//    5    9:areturn         
		String s1;
		try
		{
			if(!getProvider("lbs").meetsCriteria(criteria))
	//*   6   10:aload_0         
	//*   7   11:ldc1            #129 <String "lbs">
	//*   8   13:invokevirtual   #260 <Method LocationProviderProxy getProvider(String)>
	//*   9   16:aload_1         
	//*  10   17:invokevirtual   #266 <Method boolean LocationProviderProxy.meetsCriteria(Criteria)>
	//*  11   20:ifne            33
				s = b.getBestProvider(criteria, flag);
	//   12   23:aload_0         
	//   13   24:getfield        #71  <Field LocationManager b>
	//   14   27:aload_1         
	//   15   28:iload_2         
	//   16   29:invokevirtual   #268 <Method String LocationManager.getBestProvider(Criteria, boolean)>
	//   17   32:astore_3        
		}
	//*  18   33:aload_3         
	//*  19   34:astore          4
	//*  20   36:iload_2         
	//*  21   37:ifeq            64
	//*  22   40:aload_3         
	//*  23   41:astore          4
	//*  24   43:aload_0         
	//*  25   44:getfield        #109 <Field Context e>
	//*  26   47:invokestatic    #273 <Method boolean d.a(Context)>
	//*  27   50:ifne            64
	//*  28   53:aload_0         
	//*  29   54:getfield        #71  <Field LocationManager b>
	//*  30   57:aload_1         
	//*  31   58:iload_2         
	//*  32   59:invokevirtual   #268 <Method String LocationManager.getBestProvider(Criteria, boolean)>
	//*  33   62:astore          4
	//*  34   64:aload           4
	//*  35   66:areturn         
		// Misplaced declaration of an exception variable
		catch(Criteria criteria)
	//*  36   67:astore_1        
		{
			((Throwable) (criteria)).printStackTrace();
	//   37   68:aload_1         
	//   38   69:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return "gps";
	//   39   72:ldc1            #14  <String "gps">
	//   40   74:areturn         
		}
		s1 = s;
		if(!flag)
			break MISSING_BLOCK_LABEL_64;
		s1 = s;
		if(!com.amap.api.location.core.d.a(e))
			s1 = b.getBestProvider(criteria, flag);
		return s1;
	}

	public GpsStatus getGpsStatus(GpsStatus gpsstatus)
	{
label0:
		{
			try
			{
				if(b == null)
					break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field LocationManager b>
	//    2    4:ifnull          18
				gpsstatus = b.getGpsStatus(gpsstatus);
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field LocationManager b>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #277 <Method GpsStatus LocationManager.getGpsStatus(GpsStatus)>
	//    7   15:astore_1        
			}
	//*   8   16:aload_1         
	//*   9   17:areturn         
	//*  10   18:aconst_null     
	//*  11   19:areturn         
			// Misplaced declaration of an exception variable
			catch(GpsStatus gpsstatus)
	//*  12   20:astore_1        
			{
				((Throwable) (gpsstatus)).printStackTrace();
	//   13   21:aload_1         
	//   14   22:invokevirtual   #126 <Method void Throwable.printStackTrace()>
				return null;
	//   15   25:aconst_null     
	//   16   26:areturn         
			}
			return gpsstatus;
		}
		return null;
	}

	public AMapLocation getLastKnownLocation(String s)
	{
		com.amap.api.location.a a1;
		try
		{
			a1 = d;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field a d>
	//    2    4:astore_2        
		}
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
	//*   5    9:aconst_null     
	//*   6   10:areturn         
	//*   7   11:ldc1            #129 <String "lbs">
	//*   8   13:aload_1         
	//*   9   14:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*  10   17:ifeq            30
	//*  11   20:aload_0         
	//*  12   21:getfield        #73  <Field a d>
	//*  13   24:invokevirtual   #282 <Method AMapLocation a.a()>
	//*  14   27:astore_1        
	//*  15   28:aload_1         
	//*  16   29:areturn         
	//*  17   30:aload_0         
	//*  18   31:getfield        #71  <Field LocationManager b>
	//*  19   34:ifnull          63
	//*  20   37:aload_0         
	//*  21   38:getfield        #71  <Field LocationManager b>
	//*  22   41:aload_1         
	//*  23   42:invokevirtual   #285 <Method Location LocationManager.getLastKnownLocation(String)>
	//*  24   45:astore_1        
	//*  25   46:aload_1         
	//*  26   47:ifnull          61
	//*  27   50:new             #287 <Class AMapLocation>
	//*  28   53:dup             
	//*  29   54:aload_1         
	//*  30   55:invokespecial   #290 <Method void AMapLocation(Location)>
	//*  31   58:astore_1        
	//*  32   59:aload_1         
	//*  33   60:areturn         
	//*  34   61:aconst_null     
	//*  35   62:areturn         
	//*  36   63:aconst_null     
	//*  37   64:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  38   65:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//   39   66:aload_1         
	//   40   67:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   41   70:aconst_null     
	//   42   71:areturn         
		}
		if(a1 == null)
			return null;
		if(!"lbs".equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_30;
		s = ((String) (d.a()));
		return ((AMapLocation) (s));
		if(b == null)
			break MISSING_BLOCK_LABEL_63;
		s = ((String) (b.getLastKnownLocation(s)));
		if(s == null)
			break MISSING_BLOCK_LABEL_61;
		s = ((String) (new AMapLocation(((Location) (s)))));
		return ((AMapLocation) (s));
		return null;
		return null;
	}

	public LocationProviderProxy getProvider(String s)
	{
		if(s != null)
			break MISSING_BLOCK_LABEL_15;
	//    0    0:aload_1         
	//    1    1:ifnonnull       15
		throw new IllegalArgumentException("name\u4E0D\u80FD\u4E3A\u7A7A\uFF01");
	//    2    4:new             #292 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #294 <String "name\u4E0D\u80FD\u4E3A\u7A7A\uFF01">
	//    5   11:invokespecial   #296 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		LocationProviderProxy locationproviderproxy;
		if(i.containsKey(((Object) (s))))
	//*   7   15:aload_0         
	//*   8   16:getfield        #83  <Field Hashtable i>
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #299 <Method boolean Hashtable.containsKey(Object)>
	//*  11   23:ifeq            38
			return (LocationProviderProxy)i.get(((Object) (s)));
	//   12   26:aload_0         
	//   13   27:getfield        #83  <Field Hashtable i>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #302 <Method Object Hashtable.get(Object)>
	//   16   34:checkcast       #262 <Class LocationProviderProxy>
	//   17   37:areturn         
		locationproviderproxy = LocationProviderProxy.a(b, s);
	//   18   38:aload_0         
	//   19   39:getfield        #71  <Field LocationManager b>
	//   20   42:aload_1         
	//   21   43:invokestatic    #305 <Method LocationProviderProxy LocationProviderProxy.a(LocationManager, String)>
	//   22   46:astore_2        
		i.put(((Object) (s)), ((Object) (locationproviderproxy)));
	//   23   47:aload_0         
	//   24   48:getfield        #83  <Field Hashtable i>
	//   25   51:aload_1         
	//   26   52:aload_2         
	//   27   53:invokevirtual   #309 <Method Object Hashtable.put(Object, Object)>
	//   28   56:pop             
		return locationproviderproxy;
	//   29   57:aload_2         
	//   30   58:areturn         
		s;
	//   31   59:astore_1        
		((Throwable) (s)).printStackTrace();
	//   32   60:aload_1         
	//   33   61:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		return null;
	//   34   64:aconst_null     
	//   35   65:areturn         
	}

	public List getProviders(Criteria criteria, boolean flag)
	{
		Object obj;
		List list;
		try
		{
			list = b.getProviders(criteria, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field LocationManager b>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #313 <Method List LocationManager.getProviders(Criteria, boolean)>
	//    5    9:astore          4
		}
	//*   6   11:aload           4
	//*   7   13:ifnull          29
	//*   8   16:aload           4
	//*   9   18:astore_3        
	//*  10   19:aload           4
	//*  11   21:invokeinterface #314 <Method int List.size()>
	//*  12   26:ifne            37
	//*  13   29:new             #75  <Class ArrayList>
	//*  14   32:dup             
	//*  15   33:invokespecial   #76  <Method void ArrayList()>
	//*  16   36:astore_3        
	//*  17   37:ldc1            #129 <String "lbs">
	//*  18   39:aload_0         
	//*  19   40:aload_1         
	//*  20   41:iload_2         
	//*  21   42:invokevirtual   #315 <Method String getBestProvider(Criteria, boolean)>
	//*  22   45:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*  23   48:ifeq            60
	//*  24   51:aload_3         
	//*  25   52:ldc1            #129 <String "lbs">
	//*  26   54:invokeinterface #248 <Method boolean List.add(Object)>
	//*  27   59:pop             
	//*  28   60:aload_3         
	//*  29   61:areturn         
		// Misplaced declaration of an exception variable
		catch(Criteria criteria)
	//*  30   62:astore_1        
		{
			((Throwable) (criteria)).printStackTrace();
	//   31   63:aload_1         
	//   32   64:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   33   67:aconst_null     
	//   34   68:areturn         
		}
		if(list == null)
			break MISSING_BLOCK_LABEL_29;
		obj = ((Object) (list));
		if(list.size() != 0)
			break MISSING_BLOCK_LABEL_37;
		obj = ((Object) (new ArrayList()));
		if("lbs".equals(((Object) (getBestProvider(criteria, flag)))))
			((List) (obj)).add("lbs");
		return ((List) (obj));
	}

	public List getProviders(boolean flag)
	{
		Object obj;
		List list;
		try
		{
			list = b.getProviders(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field LocationManager b>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #319 <Method List LocationManager.getProviders(boolean)>
	//    4    8:astore_3        
		}
	//*   5    9:aload_3         
	//*   6   10:astore_2        
	//*   7   11:aload_0         
	//*   8   12:ldc1            #129 <String "lbs">
	//*   9   14:invokevirtual   #323 <Method boolean isProviderEnabled(String)>
	//*  10   17:ifeq            52
	//*  11   20:aload_3         
	//*  12   21:ifnull          35
	//*  13   24:aload_3         
	//*  14   25:astore_2        
	//*  15   26:aload_3         
	//*  16   27:invokeinterface #314 <Method int List.size()>
	//*  17   32:ifne            43
	//*  18   35:new             #75  <Class ArrayList>
	//*  19   38:dup             
	//*  20   39:invokespecial   #76  <Method void ArrayList()>
	//*  21   42:astore_2        
	//*  22   43:aload_2         
	//*  23   44:ldc1            #129 <String "lbs">
	//*  24   46:invokeinterface #248 <Method boolean List.add(Object)>
	//*  25   51:pop             
	//*  26   52:aload_2         
	//*  27   53:areturn         
		catch(Throwable throwable)
	//*  28   54:astore_2        
		{
			throwable.printStackTrace();
	//   29   55:aload_2         
	//   30   56:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   31   59:aconst_null     
	//   32   60:areturn         
		}
		obj = ((Object) (list));
		if(!isProviderEnabled("lbs"))
			break MISSING_BLOCK_LABEL_52;
		if(list == null)
			break MISSING_BLOCK_LABEL_35;
		obj = ((Object) (list));
		if(list.size() != 0)
			break MISSING_BLOCK_LABEL_43;
		obj = ((Object) (new ArrayList()));
		((List) (obj)).add("lbs");
		return ((List) (obj));
	}

	public boolean isProviderEnabled(String s)
	{
		boolean flag;
		if(!"lbs".equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_19;
	//    0    0:ldc1            #129 <String "lbs">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #135 <Method boolean String.equals(Object)>
	//    3    6:ifeq            19
		flag = com.amap.api.location.core.d.a(e);
	//    4    9:aload_0         
	//    5   10:getfield        #109 <Field Context e>
	//    6   13:invokestatic    #273 <Method boolean d.a(Context)>
	//    7   16:istore_2        
		return flag;
	//    8   17:iload_2         
	//    9   18:ireturn         
		boolean flag1;
		try
		{
			flag1 = b.isProviderEnabled(s);
	//   10   19:aload_0         
	//   11   20:getfield        #71  <Field LocationManager b>
	//   12   23:aload_1         
	//   13   24:invokevirtual   #325 <Method boolean LocationManager.isProviderEnabled(String)>
	//   14   27:istore_2        
		}
	//*  15   28:iload_2         
	//*  16   29:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  17   30:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//   18   31:aload_1         
	//   19   32:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return false;
	//   20   35:iconst_0        
	//   21   36:ireturn         
		}
		return flag1;
	}

	public void removeGeoFenceAlert(PendingIntent pendingintent)
	{
		try
		{
			if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field a d>
	//*   2    4:ifnull          15
				d.b(pendingintent);
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field a d>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #328 <Method void a.b(PendingIntent)>
			return;
	//    7   15:return          
		}
		// Misplaced declaration of an exception variable
		catch(PendingIntent pendingintent)
	//*   8   16:astore_1        
		{
			((Throwable) (pendingintent)).printStackTrace();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   11   21:return          
	}

	public void removeGpsStatusListener(android.location.GpsStatus.Listener listener)
	{
		try
		{
			if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field LocationManager b>
	//*   2    4:ifnull          15
				b.removeGpsStatusListener(listener);
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field LocationManager b>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #332 <Method void LocationManager.removeGpsStatusListener(android.location.GpsStatus$Listener)>
			return;
	//    7   15:return          
		}
		// Misplaced declaration of an exception variable
		catch(android.location.GpsStatus.Listener listener)
	//*   8   16:astore_1        
		{
			((Throwable) (listener)).printStackTrace();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   11   21:return          
	}

	public void removeProximityAlert(PendingIntent pendingintent)
	{
		try
		{
			if(d != null && d.g && b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field a d>
	//*   2    4:ifnull          32
	//*   3    7:aload_0         
	//*   4    8:getfield        #73  <Field a d>
	//*   5   11:getfield        #188 <Field boolean a.g>
	//*   6   14:ifeq            32
	//*   7   17:aload_0         
	//*   8   18:getfield        #71  <Field LocationManager b>
	//*   9   21:ifnull          32
				b.removeProximityAlert(pendingintent);
	//   10   24:aload_0         
	//   11   25:getfield        #71  <Field LocationManager b>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #335 <Method void LocationManager.removeProximityAlert(PendingIntent)>
			if(d != null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #73  <Field a d>
	//*  16   36:ifnull          47
				d.a(pendingintent);
	//   17   39:aload_0         
	//   18   40:getfield        #73  <Field a d>
	//   19   43:aload_1         
	//   20   44:invokevirtual   #337 <Method void a.a(PendingIntent)>
			return;
	//   21   47:return          
		}
		// Misplaced declaration of an exception variable
		catch(PendingIntent pendingintent)
	//*  22   48:astore_1        
		{
			((Throwable) (pendingintent)).printStackTrace();
	//   23   49:aload_1         
	//   24   50:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   25   53:return          
	}

	public void removeUpdates(PendingIntent pendingintent)
	{
		try
		{
			if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #339 <Field h f>
	//*   2    4:ifnull          33
			{
				h.remove(((Object) (pendingintent)));
	//    3    7:aload_0         
	//    4    8:getfield        #78  <Field ArrayList h>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #342 <Method boolean ArrayList.remove(Object)>
	//    7   15:pop             
				if(h.size() == 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #78  <Field ArrayList h>
	//*  10   20:invokevirtual   #226 <Method int ArrayList.size()>
	//*  11   23:ifne            33
					f.a();
	//   12   26:aload_0         
	//   13   27:getfield        #339 <Field h f>
	//   14   30:invokevirtual   #345 <Method void h.a()>
			}
			f = null;
	//   15   33:aload_0         
	//   16   34:aconst_null     
	//   17   35:putfield        #339 <Field h f>
			b.removeUpdates(pendingintent);
	//   18   38:aload_0         
	//   19   39:getfield        #71  <Field LocationManager b>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #235 <Method void LocationManager.removeUpdates(PendingIntent)>
			return;
	//   22   46:return          
		}
		// Misplaced declaration of an exception variable
		catch(PendingIntent pendingintent)
	//*  23   47:astore_1        
		{
			((Throwable) (pendingintent)).printStackTrace();
	//   24   48:aload_1         
	//   25   49:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   26   52:return          
	}

	public void removeUpdates(AMapLocationListener amaplocationlistener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(amaplocationlistener == null)
			break MISSING_BLOCK_LABEL_29;
	//    2    2:aload_1         
	//    3    3:ifnull          29
		if(d != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #73  <Field a d>
	//*   6   10:ifnull          21
			d.a(amaplocationlistener);
	//    7   13:aload_0         
	//    8   14:getfield        #73  <Field a d>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #348 <Method void a.a(AMapLocationListener)>
		b.removeUpdates(((android.location.LocationListener) (amaplocationlistener)));
	//   11   21:aload_0         
	//   12   22:getfield        #71  <Field LocationManager b>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #222 <Method void LocationManager.removeUpdates(android.location.LocationListener)>
		if(j == null || j.size() <= 0) goto _L2; else goto _L1
	//   15   29:aload_0         
	//   16   30:getfield        #88  <Field Vector j>
	//   17   33:ifnull          145
	//   18   36:aload_0         
	//   19   37:getfield        #88  <Field Vector j>
	//   20   40:invokevirtual   #349 <Method int Vector.size()>
	//   21   43:ifle            145
_L1:
		int k1 = j.size();
	//   22   46:aload_0         
	//   23   47:getfield        #88  <Field Vector j>
	//   24   50:invokevirtual   #349 <Method int Vector.size()>
	//   25   53:istore          4
		int i1 = 0;
	//   26   55:iconst_0        
	//   27   56:istore_2        
_L8:
		if(i1 >= k1) goto _L4; else goto _L3
	//   28   57:iload_2         
	//   29   58:iload           4
	//   30   60:icmpge          117
_L3:
		i i2 = (i)j.get(i1);
	//   31   63:aload_0         
	//   32   64:getfield        #88  <Field Vector j>
	//   33   67:iload_2         
	//   34   68:invokevirtual   #350 <Method Object Vector.get(int)>
	//   35   71:checkcast       #152 <Class i>
	//   36   74:astore          6
		int j1;
		int l1;
		j1 = k1;
	//   37   76:iload           4
	//   38   78:istore_3        
		l1 = i1;
	//   39   79:iload_2         
	//   40   80:istore          5
		if(!((Object) (amaplocationlistener)).equals(((Object) (i2.b)))) goto _L6; else goto _L5
	//   41   82:aload_1         
	//   42   83:aload           6
	//   43   85:getfield        #353 <Field AMapLocationListener i.b>
	//   44   88:invokevirtual   #354 <Method boolean Object.equals(Object)>
	//   45   91:ifeq            161
_L5:
		j.remove(((Object) (i2)));
	//   46   94:aload_0         
	//   47   95:getfield        #88  <Field Vector j>
	//   48   98:aload           6
	//   49  100:invokevirtual   #355 <Method boolean Vector.remove(Object)>
	//   50  103:pop             
		j1 = k1 - 1;
	//   51  104:iload           4
	//   52  106:iconst_1        
	//   53  107:isub            
	//   54  108:istore_3        
		l1 = i1 - 1;
	//   55  109:iload_2         
	//   56  110:iconst_1        
	//   57  111:isub            
	//   58  112:istore          5
		  goto _L6
	//*  59  114:goto            161
_L4:
		if(j.size() == 0 && l != null)
	//*  60  117:aload_0         
	//*  61  118:getfield        #88  <Field Vector j>
	//*  62  121:invokevirtual   #349 <Method int Vector.size()>
	//*  63  124:ifne            145
	//*  64  127:aload_0         
	//*  65  128:getfield        #95  <Field LocationManagerProxy$a l>
	//*  66  131:ifnull          145
			b.removeUpdates(((android.location.LocationListener) (l)));
	//   67  134:aload_0         
	//   68  135:getfield        #71  <Field LocationManager b>
	//   69  138:aload_0         
	//   70  139:getfield        #95  <Field LocationManagerProxy$a l>
	//   71  142:invokevirtual   #222 <Method void LocationManager.removeUpdates(android.location.LocationListener)>
		  goto _L2
	//*  72  145:goto            153
		amaplocationlistener;
	//   73  148:astore_1        
		((Throwable) (amaplocationlistener)).printStackTrace();
	//   74  149:aload_1         
	//   75  150:invokevirtual   #126 <Method void Throwable.printStackTrace()>
_L2:
		this;
	//   76  153:aload_0         
		JVM INSTR monitorexit ;
	//   77  154:monitorexit     
		return;
	//   78  155:return          
		amaplocationlistener;
	//   79  156:astore_1        
	//*  80  157:aload_0         
		throw amaplocationlistener;
	//   81  158:monitorexit     
	//   82  159:aload_1         
	//   83  160:athrow          
_L6:
		i1 = l1 + 1;
	//   84  161:iload           5
	//   85  163:iconst_1        
	//   86  164:iadd            
	//   87  165:istore_2        
		k1 = j1;
	//   88  166:iload_3         
	//   89  167:istore          4
		if(true) goto _L8; else goto _L7
	//   90  169:goto            57
_L7:
	}

	public void requestLocationData(String s, long l1, float f1, AMapLocationListener amaplocationlistener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		a(s, l1, f1, amaplocationlistener, true);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:lload_2         
	//    5    5:fload           4
	//    6    7:aload           5
	//    7    9:iconst_1        
	//    8   10:invokespecial   #359 <Method void a(String, long, float, AMapLocationListener, boolean)>
		this;
	//    9   13:aload_0         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		return;
	//   11   15:return          
		s;
	//   12   16:astore_1        
	//*  13   17:aload_0         
		throw s;
	//   14   18:monitorexit     
	//   15   19:aload_1         
	//   16   20:athrow          
	}

	public void requestLocationUpdates(String s, long l1, float f1, PendingIntent pendingintent)
	{
		try
		{
			if("lbs".equals(((Object) (s))))
	//*   0    0:ldc1            #129 <String "lbs">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            76
			{
				if(f == null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #339 <Field h f>
	//*   6   13:ifnonnull       28
					f = new h(this);
	//    7   16:aload_0         
	//    8   17:new             #344 <Class h>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:invokespecial   #361 <Method void h(LocationManagerProxy)>
	//   12   25:putfield        #339 <Field h f>
				if(g == null)
	//*  13   28:aload_0         
	//*  14   29:getfield        #363 <Field LocationManagerProxy$b g>
	//*  15   32:ifnonnull       47
					g = new b();
	//   16   35:aload_0         
	//   17   36:new             #9   <Class LocationManagerProxy$b>
	//   18   39:dup             
	//   19   40:aload_0         
	//   20   41:invokespecial   #364 <Method void LocationManagerProxy$b(LocationManagerProxy)>
	//   21   44:putfield        #363 <Field LocationManagerProxy$b g>
				f.a(((AMapLocationListener) (g)), l1, f1, s);
	//   22   47:aload_0         
	//   23   48:getfield        #339 <Field h f>
	//   24   51:aload_0         
	//   25   52:getfield        #363 <Field LocationManagerProxy$b g>
	//   26   55:lload_2         
	//   27   56:fload           4
	//   28   58:aload_1         
	//   29   59:invokevirtual   #367 <Method boolean h.a(AMapLocationListener, long, float, String)>
	//   30   62:pop             
				h.add(((Object) (pendingintent)));
	//   31   63:aload_0         
	//   32   64:getfield        #78  <Field ArrayList h>
	//   33   67:aload           5
	//   34   69:invokevirtual   #368 <Method boolean ArrayList.add(Object)>
	//   35   72:pop             
				break MISSING_BLOCK_LABEL_99;
	//   36   73:goto            99
			}
		}
	//*  37   76:aload_0         
	//*  38   77:getfield        #78  <Field ArrayList h>
	//*  39   80:aload           5
	//*  40   82:invokevirtual   #368 <Method boolean ArrayList.add(Object)>
	//*  41   85:pop             
	//*  42   86:aload_0         
	//*  43   87:getfield        #71  <Field LocationManager b>
	//*  44   90:aload_1         
	//*  45   91:lload_2         
	//*  46   92:fload           4
	//*  47   94:aload           5
	//*  48   96:invokevirtual   #370 <Method void LocationManager.requestLocationUpdates(String, long, float, PendingIntent)>
	//*  49   99:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  50  100:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//   51  101:aload_1         
	//   52  102:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return;
	//   53  105:return          
		}
		h.add(((Object) (pendingintent)));
		b.requestLocationUpdates(s, l1, f1, pendingintent);
	}

	public void requestLocationUpdates(String s, long l1, float f1, AMapLocationListener amaplocationlistener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		a(s, l1, f1, amaplocationlistener, false);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:lload_2         
	//    5    5:fload           4
	//    6    7:aload           5
	//    7    9:iconst_0        
	//    8   10:invokespecial   #359 <Method void a(String, long, float, AMapLocationListener, boolean)>
		this;
	//    9   13:aload_0         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		return;
	//   11   15:return          
		s;
	//   12   16:astore_1        
	//*  13   17:aload_0         
		throw s;
	//   14   18:monitorexit     
	//   15   19:aload_1         
	//   16   20:athrow          
	}

	public void requestWeatherUpdates(int i1, AMapLocalWeatherListener amaplocalweatherlistener)
	{
		try
		{
			d.a(i1, amaplocalweatherlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field a d>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #374 <Method void a.a(int, AMapLocalWeatherListener)>
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(AMapLocalWeatherListener amaplocalweatherlistener)
	//*   6   10:astore_2        
		{
			((Throwable) (amaplocalweatherlistener)).printStackTrace();
	//    7   11:aload_2         
	//    8   12:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    9   15:return          
	}

	public void setGpsEnable(boolean flag)
	{
		try
		{
			if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field a d>
	//*   2    4:ifnull          15
				d.a(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field a d>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #378 <Method void a.a(boolean)>
			return;
	//    7   15:return          
		}
		catch(Throwable throwable)
	//*   8   16:astore_2        
		{
			throwable.printStackTrace();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   11   21:return          
	}

	public void setTestProviderEnabled(String s, boolean flag)
	{
		try
		{
			if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field LocationManager b>
	//*   2    4:ifnull          16
				b.setTestProviderEnabled(s, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field LocationManager b>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #382 <Method void LocationManager.setTestProviderEnabled(String, boolean)>
			return;
	//    8   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   9   17:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   12   22:return          
	}

	public void setTestProviderLocation(String s, Location location)
	{
		try
		{
			if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field LocationManager b>
	//*   2    4:ifnull          16
				b.setTestProviderLocation(s, location);
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field LocationManager b>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #386 <Method void LocationManager.setTestProviderLocation(String, Location)>
			return;
	//    8   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   9   17:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   12   22:return          
	}

	public void setTestProviderStatus(String s, int i1, Bundle bundle, long l1)
	{
		try
		{
			if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field LocationManager b>
	//*   2    4:ifnull          19
				b.setTestProviderStatus(s, i1, bundle, l1);
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field LocationManager b>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:aload_3         
	//    8   14:lload           4
	//    9   16:invokevirtual   #390 <Method void LocationManager.setTestProviderStatus(String, int, Bundle, long)>
			return;
	//   10   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  11   20:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//   12   21:aload_1         
	//   13   22:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   14   25:return          
	}

	public static final String GPS_PROVIDER = "gps";
	public static final String KEY_LOCATION_CHANGED = "location";
	public static final String KEY_PROVIDER_ENABLED = "providerEnabled";
	public static final String KEY_PROXIMITY_ENTERING = "entering";
	public static final String KEY_STATUS_CHANGED = "status";
	public static final String NETWORK_PROVIDER = "network";
	public static final int WEATHER_TYPE_FORECAST = 2;
	public static final int WEATHER_TYPE_LIVE = 1;
	static Object a = new Object();
	private static LocationManagerProxy c = null;
	private LocationManager b;
	private com.amap.api.location.a d;
	private Context e;
	private h f;
	private b g;
	private ArrayList h;
	private Hashtable i;
	private Vector j;
	private Vector k;
	private a l;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #62  <Field LocationManagerProxy c>
	//    2    4:new             #4   <Class Object>
	//    3    7:dup             
	//    4    8:invokespecial   #65  <Method void Object()>
	//    5   11:putstatic       #67  <Field Object a>
	//*   6   14:return          
	}
}
