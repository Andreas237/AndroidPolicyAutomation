// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.location;

import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import java.util.Vector;

// Referenced classes of package com.amap.api.location:
//			AMapLocationListener, LocationManagerProxy, AMapLocation, i

class LocationManagerProxy$a
	implements AMapLocationListener
{

	public void onLocationChanged(Location location)
	{
		int j;
		if(location == null)
			break MISSING_BLOCK_LABEL_492;
	//    0    0:aload_1         
	//    1    1:ifnull          492
		i k;
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
	//*  46   99:invokestatic    #57  <Method Vector LocationManagerProxy.d(LocationManagerProxy)>
	//*  47  102:ifnull          485
	//*  48  105:aload_0         
	//*  49  106:getfield        #14  <Field LocationManagerProxy a>
	//*  50  109:invokestatic    #57  <Method Vector LocationManagerProxy.d(LocationManagerProxy)>
	//*  51  112:aload_3         
	//*  52  113:invokevirtual   #61  <Method boolean Vector.add(Object)>
	//*  53  116:pop             
	//*  54  117:goto            485
	//*  55  120:aload_0         
	//*  56  121:getfield        #14  <Field LocationManagerProxy a>
	//*  57  124:invokestatic    #57  <Method Vector LocationManagerProxy.d(LocationManagerProxy)>
	//*  58  127:ifnull          478
	//*  59  130:aload_0         
	//*  60  131:getfield        #14  <Field LocationManagerProxy a>
	//*  61  134:invokestatic    #57  <Method Vector LocationManagerProxy.d(LocationManagerProxy)>
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
	//*  73  160:invokestatic    #57  <Method Vector LocationManagerProxy.d(LocationManagerProxy)>
	//*  74  163:invokevirtual   #36  <Method int Vector.size()>
	//*  75  166:icmpge          198
	//*  76  169:aload_0         
	//*  77  170:getfield        #14  <Field LocationManagerProxy a>
	//*  78  173:invokestatic    #30  <Method Vector LocationManagerProxy.c(LocationManagerProxy)>
	//*  79  176:aload_0         
	//*  80  177:getfield        #14  <Field LocationManagerProxy a>
	//*  81  180:invokestatic    #57  <Method Vector LocationManagerProxy.d(LocationManagerProxy)>
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
	//*  93  202:invokestatic    #57  <Method Vector LocationManagerProxy.d(LocationManagerProxy)>
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
	//* 142  319:invokestatic    #57  <Method Vector LocationManagerProxy.d(LocationManagerProxy)>
	//* 143  322:ifnull          497
	//* 144  325:aload_0         
	//* 145  326:getfield        #14  <Field LocationManagerProxy a>
	//* 146  329:invokestatic    #57  <Method Vector LocationManagerProxy.d(LocationManagerProxy)>
	//* 147  332:aload_1         
	//* 148  333:invokevirtual   #61  <Method boolean Vector.add(Object)>
	//* 149  336:pop             
	//* 150  337:goto            497
	//* 151  340:aload_0         
	//* 152  341:getfield        #14  <Field LocationManagerProxy a>
	//* 153  344:invokestatic    #57  <Method Vector LocationManagerProxy.d(LocationManagerProxy)>
	//* 154  347:ifnull          478
	//* 155  350:aload_0         
	//* 156  351:getfield        #14  <Field LocationManagerProxy a>
	//* 157  354:invokestatic    #57  <Method Vector LocationManagerProxy.d(LocationManagerProxy)>
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
	//* 169  380:invokestatic    #57  <Method Vector LocationManagerProxy.d(LocationManagerProxy)>
	//* 170  383:invokevirtual   #36  <Method int Vector.size()>
	//* 171  386:icmpge          418
	//* 172  389:aload_0         
	//* 173  390:getfield        #14  <Field LocationManagerProxy a>
	//* 174  393:invokestatic    #30  <Method Vector LocationManagerProxy.c(LocationManagerProxy)>
	//* 175  396:aload_0         
	//* 176  397:getfield        #14  <Field LocationManagerProxy a>
	//* 177  400:invokestatic    #57  <Method Vector LocationManagerProxy.d(LocationManagerProxy)>
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
	//* 189  422:invokestatic    #57  <Method Vector LocationManagerProxy.d(LocationManagerProxy)>
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
		j = 0;
_L12:
		if(LocationManagerProxy.c(a) == null || j >= LocationManagerProxy.c(a).size()) goto _L2; else goto _L1
_L1:
		k = (i)LocationManagerProxy.c(a).get(j);
label0:
		{
			if(k == null)
				break label0;
			try
			{
				if(k.b != null)
					k.b.onLocationChanged(((AMapLocation) (location)));
				break label0;
			}
			// Misplaced declaration of an exception variable
			catch(Throwable throwable) { }
		}
		if(k == null) goto _L4; else goto _L3
_L3:
		if(k.a == -1L && LocationManagerProxy.d(a) != null)
			LocationManagerProxy.d(a).add(((Object) (k)));
		  goto _L4
_L2:
		if(LocationManagerProxy.d(a) == null || LocationManagerProxy.d(a).size() <= 0 || LocationManagerProxy.c(a) == null) goto _L6; else goto _L5
_L5:
		j = 0;
_L8:
		if(j >= LocationManagerProxy.d(a).size())
			break; /* Loop/switch isn't completed */
		LocationManagerProxy.c(a).remove(LocationManagerProxy.d(a).get(j));
		j++;
		if(true) goto _L8; else goto _L7
_L7:
		LocationManagerProxy.d(a).clear();
		if(LocationManagerProxy.c(a).size() == 0 && LocationManagerProxy.e(a) != null && LocationManagerProxy.f(a) != null)
			LocationManagerProxy.e(a).removeUpdates(((android.location.LocationListener) (LocationManagerProxy.f(a))));
		  goto _L6
_L13:
		for(; LocationManagerProxy.c(a) == null || j >= LocationManagerProxy.c(a).size(); j++)
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
		location = ((Location) ((i)LocationManagerProxy.c(a).get(j)));
		if(location == null)
			break MISSING_BLOCK_LABEL_497;
		if(((i) (location)).a == -1L && LocationManagerProxy.d(a) != null)
			LocationManagerProxy.d(a).add(((Object) (location)));
		break MISSING_BLOCK_LABEL_497;
		if(LocationManagerProxy.d(a) == null || LocationManagerProxy.d(a).size() <= 0 || LocationManagerProxy.c(a) == null) goto _L6; else goto _L9
_L9:
		j = 0;
_L11:
		if(j >= LocationManagerProxy.d(a).size())
			break; /* Loop/switch isn't completed */
		LocationManagerProxy.c(a).remove(LocationManagerProxy.d(a).get(j));
		j++;
		if(true) goto _L11; else goto _L10
_L10:
		LocationManagerProxy.d(a).clear();
		if(LocationManagerProxy.c(a).size() == 0 && LocationManagerProxy.e(a) != null && LocationManagerProxy.f(a) != null)
			LocationManagerProxy.e(a).removeUpdates(((android.location.LocationListener) (LocationManagerProxy.f(a))));
_L6:
		return;
_L4:
		j++;
		  goto _L12
		j = 0;
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

	public void onStatusChanged(String s, int j, Bundle bundle)
	{
	//    0    0:return          
	}

	final LocationManagerProxy a;

	LocationManagerProxy$a(LocationManagerProxy locationmanagerproxy)
	{
		a = locationmanagerproxy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field LocationManagerProxy a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
