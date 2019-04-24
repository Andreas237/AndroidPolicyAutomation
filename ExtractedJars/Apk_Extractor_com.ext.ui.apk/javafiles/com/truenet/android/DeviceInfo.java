// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.support.v7.ae;

public final class DeviceInfo
{

	public DeviceInfo(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
			String s7, String s8, String s9, String s10, String s11, String s12, String s13, 
			String s14, String s15, String s16, String s17, String s18, String s19, String s20)
	{
		ae.b(((Object) (s)), "latitude");
	//    0    0:aload_1         
	//    1    1:ldc1            #30  <String "latitude">
	//    2    3:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s1)), "longitude");
	//    3    6:aload_2         
	//    4    7:ldc1            #37  <String "longitude">
	//    5    9:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s2)), "userAgent");
	//    6   12:aload_3         
	//    7   13:ldc1            #38  <String "userAgent">
	//    8   15:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s3)), "locale");
	//    9   18:aload           4
	//   10   20:ldc1            #39  <String "locale">
	//   11   22:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s4)), "advertisingId");
	//   12   25:aload           5
	//   13   27:ldc1            #40  <String "advertisingId">
	//   14   29:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s5)), "osId");
	//   15   32:aload           6
	//   16   34:ldc1            #41  <String "osId">
	//   17   36:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s6)), "osVer");
	//   18   39:aload           7
	//   19   41:ldc1            #42  <String "osVer">
	//   20   43:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s7)), "deviceModel");
	//   21   46:aload           8
	//   22   48:ldc1            #43  <String "deviceModel">
	//   23   50:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s8)), "deviceManufacturer");
	//   24   53:aload           9
	//   25   55:ldc1            #44  <String "deviceManufacturer">
	//   26   57:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s9)), "deviceVersion");
	//   27   60:aload           10
	//   28   62:ldc1            #45  <String "deviceVersion">
	//   29   64:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s10)), "packageName");
	//   30   67:aload           11
	//   31   69:ldc1            #46  <String "packageName">
	//   32   71:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s11)), "networkOperName");
	//   33   74:aload           12
	//   34   76:ldc1            #47  <String "networkOperName">
	//   35   78:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s12)), "isp");
	//   36   81:aload           13
	//   37   83:ldc1            #48  <String "isp">
	//   38   85:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s13)), "ispName");
	//   39   88:aload           14
	//   40   90:ldc1            #49  <String "ispName">
	//   41   92:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s14)), "cellId");
	//   42   95:aload           15
	//   43   97:ldc1            #50  <String "cellId">
	//   44   99:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s15)), "locationAreaCode");
	//   45  102:aload           16
	//   46  104:ldc1            #51  <String "locationAreaCode">
	//   47  106:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s16)), "networkType");
	//   48  109:aload           17
	//   49  111:ldc1            #52  <String "networkType">
	//   50  113:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s17)), "signalLevel");
	//   51  116:aload           18
	//   52  118:ldc1            #53  <String "signalLevel">
	//   53  120:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s18)), "deviceType");
	//   54  123:aload           19
	//   55  125:ldc1            #54  <String "deviceType">
	//   56  127:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s19)), "sdkVersion");
	//   57  130:aload           20
	//   58  132:ldc1            #55  <String "sdkVersion">
	//   59  134:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s20)), "publisherId");
	//   60  137:aload           21
	//   61  139:ldc1            #56  <String "publisherId">
	//   62  141:invokestatic    #36  <Method void ae.b(Object, String)>
		super();
	//   63  144:aload_0         
	//   64  145:invokespecial   #59  <Method void Object()>
		latitude = s;
	//   65  148:aload_0         
	//   66  149:aload_1         
	//   67  150:putfield        #61  <Field String latitude>
		longitude = s1;
	//   68  153:aload_0         
	//   69  154:aload_2         
	//   70  155:putfield        #63  <Field String longitude>
		userAgent = s2;
	//   71  158:aload_0         
	//   72  159:aload_3         
	//   73  160:putfield        #65  <Field String userAgent>
		locale = s3;
	//   74  163:aload_0         
	//   75  164:aload           4
	//   76  166:putfield        #67  <Field String locale>
		advertisingId = s4;
	//   77  169:aload_0         
	//   78  170:aload           5
	//   79  172:putfield        #69  <Field String advertisingId>
		osId = s5;
	//   80  175:aload_0         
	//   81  176:aload           6
	//   82  178:putfield        #71  <Field String osId>
		osVer = s6;
	//   83  181:aload_0         
	//   84  182:aload           7
	//   85  184:putfield        #73  <Field String osVer>
		deviceModel = s7;
	//   86  187:aload_0         
	//   87  188:aload           8
	//   88  190:putfield        #75  <Field String deviceModel>
		deviceManufacturer = s8;
	//   89  193:aload_0         
	//   90  194:aload           9
	//   91  196:putfield        #77  <Field String deviceManufacturer>
		deviceVersion = s9;
	//   92  199:aload_0         
	//   93  200:aload           10
	//   94  202:putfield        #79  <Field String deviceVersion>
		packageName = s10;
	//   95  205:aload_0         
	//   96  206:aload           11
	//   97  208:putfield        #81  <Field String packageName>
		networkOperName = s11;
	//   98  211:aload_0         
	//   99  212:aload           12
	//  100  214:putfield        #83  <Field String networkOperName>
		isp = s12;
	//  101  217:aload_0         
	//  102  218:aload           13
	//  103  220:putfield        #85  <Field String isp>
		ispName = s13;
	//  104  223:aload_0         
	//  105  224:aload           14
	//  106  226:putfield        #87  <Field String ispName>
		cellId = s14;
	//  107  229:aload_0         
	//  108  230:aload           15
	//  109  232:putfield        #89  <Field String cellId>
		locationAreaCode = s15;
	//  110  235:aload_0         
	//  111  236:aload           16
	//  112  238:putfield        #91  <Field String locationAreaCode>
		networkType = s16;
	//  113  241:aload_0         
	//  114  242:aload           17
	//  115  244:putfield        #93  <Field String networkType>
		signalLevel = s17;
	//  116  247:aload_0         
	//  117  248:aload           18
	//  118  250:putfield        #95  <Field String signalLevel>
		deviceType = s18;
	//  119  253:aload_0         
	//  120  254:aload           19
	//  121  256:putfield        #97  <Field String deviceType>
		sdkVersion = s19;
	//  122  259:aload_0         
	//  123  260:aload           20
	//  124  262:putfield        #99  <Field String sdkVersion>
		publisherId = s20;
	//  125  265:aload_0         
	//  126  266:aload           21
	//  127  268:putfield        #101 <Field String publisherId>
	//  128  271:return          
	}

	public static DeviceInfo copy$default(DeviceInfo deviceinfo, String s, String s1, String s2, String s3, String s4, String s5, String s6, 
			String s7, String s8, String s9, String s10, String s11, String s12, String s13, 
			String s14, String s15, String s16, String s17, String s18, String s19, String s20, 
			int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload           22
	//*   1    2:iconst_1        
	//*   2    3:iand            
	//*   3    4:ifeq            400
			s = deviceinfo.latitude;
	//    4    7:aload_0         
	//    5    8:getfield        #61  <Field String latitude>
	//    6   11:astore_1        
		if((i & 2) != 0)
	//*   7   12:iload           22
	//*   8   14:iconst_2        
	//*   9   15:iand            
	//*  10   16:ifeq            397
			s1 = deviceinfo.longitude;
	//   11   19:aload_0         
	//   12   20:getfield        #63  <Field String longitude>
	//   13   23:astore_2        
		if((i & 4) != 0)
	//*  14   24:iload           22
	//*  15   26:iconst_4        
	//*  16   27:iand            
	//*  17   28:ifeq            394
			s2 = deviceinfo.userAgent;
	//   18   31:aload_0         
	//   19   32:getfield        #65  <Field String userAgent>
	//   20   35:astore_3        
		if((i & 8) != 0)
	//*  21   36:iload           22
	//*  22   38:bipush          8
	//*  23   40:iand            
	//*  24   41:ifeq            391
			s3 = deviceinfo.locale;
	//   25   44:aload_0         
	//   26   45:getfield        #67  <Field String locale>
	//   27   48:astore          4
		if((i & 0x10) != 0)
	//*  28   50:iload           22
	//*  29   52:bipush          16
	//*  30   54:iand            
	//*  31   55:ifeq            388
			s4 = deviceinfo.advertisingId;
	//   32   58:aload_0         
	//   33   59:getfield        #69  <Field String advertisingId>
	//   34   62:astore          5
		if((i & 0x20) != 0)
	//*  35   64:iload           22
	//*  36   66:bipush          32
	//*  37   68:iand            
	//*  38   69:ifeq            385
			s5 = deviceinfo.osId;
	//   39   72:aload_0         
	//   40   73:getfield        #71  <Field String osId>
	//   41   76:astore          6
		if((i & 0x40) != 0)
	//*  42   78:iload           22
	//*  43   80:bipush          64
	//*  44   82:iand            
	//*  45   83:ifeq            382
			s6 = deviceinfo.osVer;
	//   46   86:aload_0         
	//   47   87:getfield        #73  <Field String osVer>
	//   48   90:astore          7
		if((i & 0x80) != 0)
	//*  49   92:iload           22
	//*  50   94:sipush          128
	//*  51   97:iand            
	//*  52   98:ifeq            379
			s7 = deviceinfo.deviceModel;
	//   53  101:aload_0         
	//   54  102:getfield        #75  <Field String deviceModel>
	//   55  105:astore          8
		if((i & 0x100) != 0)
	//*  56  107:iload           22
	//*  57  109:sipush          256
	//*  58  112:iand            
	//*  59  113:ifeq            376
			s8 = deviceinfo.deviceManufacturer;
	//   60  116:aload_0         
	//   61  117:getfield        #77  <Field String deviceManufacturer>
	//   62  120:astore          9
		if((i & 0x200) != 0)
	//*  63  122:iload           22
	//*  64  124:sipush          512
	//*  65  127:iand            
	//*  66  128:ifeq            373
			s9 = deviceinfo.deviceVersion;
	//   67  131:aload_0         
	//   68  132:getfield        #79  <Field String deviceVersion>
	//   69  135:astore          10
		if((i & 0x400) != 0)
	//*  70  137:iload           22
	//*  71  139:sipush          1024
	//*  72  142:iand            
	//*  73  143:ifeq            370
			s10 = deviceinfo.packageName;
	//   74  146:aload_0         
	//   75  147:getfield        #81  <Field String packageName>
	//   76  150:astore          11
		if((i & 0x800) != 0)
	//*  77  152:iload           22
	//*  78  154:sipush          2048
	//*  79  157:iand            
	//*  80  158:ifeq            367
			s11 = deviceinfo.networkOperName;
	//   81  161:aload_0         
	//   82  162:getfield        #83  <Field String networkOperName>
	//   83  165:astore          12
		if((i & 0x1000) != 0)
	//*  84  167:iload           22
	//*  85  169:sipush          4096
	//*  86  172:iand            
	//*  87  173:ifeq            364
			s12 = deviceinfo.isp;
	//   88  176:aload_0         
	//   89  177:getfield        #85  <Field String isp>
	//   90  180:astore          13
		if((i & 0x2000) != 0)
	//*  91  182:iload           22
	//*  92  184:sipush          8192
	//*  93  187:iand            
	//*  94  188:ifeq            361
			s13 = deviceinfo.ispName;
	//   95  191:aload_0         
	//   96  192:getfield        #87  <Field String ispName>
	//   97  195:astore          14
		if((i & 0x4000) != 0)
	//*  98  197:iload           22
	//*  99  199:sipush          16384
	//* 100  202:iand            
	//* 101  203:ifeq            358
			s14 = deviceinfo.cellId;
	//  102  206:aload_0         
	//  103  207:getfield        #89  <Field String cellId>
	//  104  210:astore          15
		if((0x8000 & i) != 0)
	//* 105  212:ldc1            #106 <Int 32768>
	//* 106  214:iload           22
	//* 107  216:iand            
	//* 108  217:ifeq            355
			s15 = deviceinfo.locationAreaCode;
	//  109  220:aload_0         
	//  110  221:getfield        #91  <Field String locationAreaCode>
	//  111  224:astore          16
		if((0x10000 & i) != 0)
	//* 112  226:ldc1            #107 <Int 0x10000>
	//* 113  228:iload           22
	//* 114  230:iand            
	//* 115  231:ifeq            352
			s16 = deviceinfo.networkType;
	//  116  234:aload_0         
	//  117  235:getfield        #93  <Field String networkType>
	//  118  238:astore          17
		if((0x20000 & i) != 0)
	//* 119  240:ldc1            #108 <Int 0x20000>
	//* 120  242:iload           22
	//* 121  244:iand            
	//* 122  245:ifeq            349
			s17 = deviceinfo.signalLevel;
	//  123  248:aload_0         
	//  124  249:getfield        #95  <Field String signalLevel>
	//  125  252:astore          18
		if((0x40000 & i) != 0)
	//* 126  254:ldc1            #109 <Int 0x40000>
	//* 127  256:iload           22
	//* 128  258:iand            
	//* 129  259:ifeq            346
			s18 = deviceinfo.deviceType;
	//  130  262:aload_0         
	//  131  263:getfield        #97  <Field String deviceType>
	//  132  266:astore          19
		if((0x80000 & i) != 0)
	//* 133  268:ldc1            #110 <Int 0x80000>
	//* 134  270:iload           22
	//* 135  272:iand            
	//* 136  273:ifeq            343
			s19 = deviceinfo.sdkVersion;
	//  137  276:aload_0         
	//  138  277:getfield        #99  <Field String sdkVersion>
	//  139  280:astore          20
		if((0x100000 & i) != 0)
	//* 140  282:ldc1            #111 <Int 0x100000>
	//* 141  284:iload           22
	//* 142  286:iand            
	//* 143  287:ifeq            340
			s20 = deviceinfo.publisherId;
	//  144  290:aload_0         
	//  145  291:getfield        #101 <Field String publisherId>
	//  146  294:astore          21
		return deviceinfo.copy(s, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
	//  147  296:aload_0         
	//  148  297:aload_1         
	//  149  298:aload_2         
	//  150  299:aload_3         
	//  151  300:aload           4
	//  152  302:aload           5
	//  153  304:aload           6
	//  154  306:aload           7
	//  155  308:aload           8
	//  156  310:aload           9
	//  157  312:aload           10
	//  158  314:aload           11
	//  159  316:aload           12
	//  160  318:aload           13
	//  161  320:aload           14
	//  162  322:aload           15
	//  163  324:aload           16
	//  164  326:aload           17
	//  165  328:aload           18
	//  166  330:aload           19
	//  167  332:aload           20
	//  168  334:aload           21
	//  169  336:invokevirtual   #115 <Method DeviceInfo copy(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)>
	//  170  339:areturn         
	//* 171  340:goto            296
	//* 172  343:goto            282
	//* 173  346:goto            268
	//* 174  349:goto            254
	//* 175  352:goto            240
	//* 176  355:goto            226
	//* 177  358:goto            212
	//* 178  361:goto            197
	//* 179  364:goto            182
	//* 180  367:goto            167
	//* 181  370:goto            152
	//* 182  373:goto            137
	//* 183  376:goto            122
	//* 184  379:goto            107
	//* 185  382:goto            92
	//* 186  385:goto            78
	//* 187  388:goto            64
	//* 188  391:goto            50
	//* 189  394:goto            36
	//* 190  397:goto            24
	//* 191  400:goto            12
	}

	public final String component1()
	{
		return latitude;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String latitude>
	//    2    4:areturn         
	}

	public final String component10()
	{
		return deviceVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field String deviceVersion>
	//    2    4:areturn         
	}

	public final String component11()
	{
		return packageName;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field String packageName>
	//    2    4:areturn         
	}

	public final String component12()
	{
		return networkOperName;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field String networkOperName>
	//    2    4:areturn         
	}

	public final String component13()
	{
		return isp;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field String isp>
	//    2    4:areturn         
	}

	public final String component14()
	{
		return ispName;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field String ispName>
	//    2    4:areturn         
	}

	public final String component15()
	{
		return cellId;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field String cellId>
	//    2    4:areturn         
	}

	public final String component16()
	{
		return locationAreaCode;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field String locationAreaCode>
	//    2    4:areturn         
	}

	public final String component17()
	{
		return networkType;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field String networkType>
	//    2    4:areturn         
	}

	public final String component18()
	{
		return signalLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field String signalLevel>
	//    2    4:areturn         
	}

	public final String component19()
	{
		return deviceType;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field String deviceType>
	//    2    4:areturn         
	}

	public final String component2()
	{
		return longitude;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String longitude>
	//    2    4:areturn         
	}

	public final String component20()
	{
		return sdkVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field String sdkVersion>
	//    2    4:areturn         
	}

	public final String component21()
	{
		return publisherId;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field String publisherId>
	//    2    4:areturn         
	}

	public final String component3()
	{
		return userAgent;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field String userAgent>
	//    2    4:areturn         
	}

	public final String component4()
	{
		return locale;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field String locale>
	//    2    4:areturn         
	}

	public final String component5()
	{
		return advertisingId;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field String advertisingId>
	//    2    4:areturn         
	}

	public final String component6()
	{
		return osId;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field String osId>
	//    2    4:areturn         
	}

	public final String component7()
	{
		return osVer;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String osVer>
	//    2    4:areturn         
	}

	public final String component8()
	{
		return deviceModel;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field String deviceModel>
	//    2    4:areturn         
	}

	public final String component9()
	{
		return deviceManufacturer;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String deviceManufacturer>
	//    2    4:areturn         
	}

	public final DeviceInfo copy(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
			String s7, String s8, String s9, String s10, String s11, String s12, String s13, 
			String s14, String s15, String s16, String s17, String s18, String s19, String s20)
	{
		ae.b(((Object) (s)), "latitude");
	//    0    0:aload_1         
	//    1    1:ldc1            #30  <String "latitude">
	//    2    3:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s1)), "longitude");
	//    3    6:aload_2         
	//    4    7:ldc1            #37  <String "longitude">
	//    5    9:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s2)), "userAgent");
	//    6   12:aload_3         
	//    7   13:ldc1            #38  <String "userAgent">
	//    8   15:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s3)), "locale");
	//    9   18:aload           4
	//   10   20:ldc1            #39  <String "locale">
	//   11   22:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s4)), "advertisingId");
	//   12   25:aload           5
	//   13   27:ldc1            #40  <String "advertisingId">
	//   14   29:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s5)), "osId");
	//   15   32:aload           6
	//   16   34:ldc1            #41  <String "osId">
	//   17   36:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s6)), "osVer");
	//   18   39:aload           7
	//   19   41:ldc1            #42  <String "osVer">
	//   20   43:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s7)), "deviceModel");
	//   21   46:aload           8
	//   22   48:ldc1            #43  <String "deviceModel">
	//   23   50:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s8)), "deviceManufacturer");
	//   24   53:aload           9
	//   25   55:ldc1            #44  <String "deviceManufacturer">
	//   26   57:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s9)), "deviceVersion");
	//   27   60:aload           10
	//   28   62:ldc1            #45  <String "deviceVersion">
	//   29   64:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s10)), "packageName");
	//   30   67:aload           11
	//   31   69:ldc1            #46  <String "packageName">
	//   32   71:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s11)), "networkOperName");
	//   33   74:aload           12
	//   34   76:ldc1            #47  <String "networkOperName">
	//   35   78:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s12)), "isp");
	//   36   81:aload           13
	//   37   83:ldc1            #48  <String "isp">
	//   38   85:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s13)), "ispName");
	//   39   88:aload           14
	//   40   90:ldc1            #49  <String "ispName">
	//   41   92:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s14)), "cellId");
	//   42   95:aload           15
	//   43   97:ldc1            #50  <String "cellId">
	//   44   99:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s15)), "locationAreaCode");
	//   45  102:aload           16
	//   46  104:ldc1            #51  <String "locationAreaCode">
	//   47  106:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s16)), "networkType");
	//   48  109:aload           17
	//   49  111:ldc1            #52  <String "networkType">
	//   50  113:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s17)), "signalLevel");
	//   51  116:aload           18
	//   52  118:ldc1            #53  <String "signalLevel">
	//   53  120:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s18)), "deviceType");
	//   54  123:aload           19
	//   55  125:ldc1            #54  <String "deviceType">
	//   56  127:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s19)), "sdkVersion");
	//   57  130:aload           20
	//   58  132:ldc1            #55  <String "sdkVersion">
	//   59  134:invokestatic    #36  <Method void ae.b(Object, String)>
		ae.b(((Object) (s20)), "publisherId");
	//   60  137:aload           21
	//   61  139:ldc1            #56  <String "publisherId">
	//   62  141:invokestatic    #36  <Method void ae.b(Object, String)>
		return new DeviceInfo(s, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);
	//   63  144:new             #2   <Class DeviceInfo>
	//   64  147:dup             
	//   65  148:aload_1         
	//   66  149:aload_2         
	//   67  150:aload_3         
	//   68  151:aload           4
	//   69  153:aload           5
	//   70  155:aload           6
	//   71  157:aload           7
	//   72  159:aload           8
	//   73  161:aload           9
	//   74  163:aload           10
	//   75  165:aload           11
	//   76  167:aload           12
	//   77  169:aload           13
	//   78  171:aload           14
	//   79  173:aload           15
	//   80  175:aload           16
	//   81  177:aload           17
	//   82  179:aload           18
	//   83  181:aload           19
	//   84  183:aload           20
	//   85  185:aload           21
	//   86  187:invokespecial   #140 <Method void DeviceInfo(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)>
	//   87  190:areturn         
	}

	public boolean equals(Object obj)
	{
label0:
		{
			if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpeq       311
			{
				if(!(obj instanceof DeviceInfo))
					break label0;
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class DeviceInfo>
	//    5    9:ifeq            313
				obj = ((Object) ((DeviceInfo)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #2   <Class DeviceInfo>
	//    8   16:astore_1        
				if(!ae.a(((Object) (latitude)), ((Object) (((DeviceInfo) (obj)).latitude))) || !ae.a(((Object) (longitude)), ((Object) (((DeviceInfo) (obj)).longitude))) || !ae.a(((Object) (userAgent)), ((Object) (((DeviceInfo) (obj)).userAgent))) || !ae.a(((Object) (locale)), ((Object) (((DeviceInfo) (obj)).locale))) || !ae.a(((Object) (advertisingId)), ((Object) (((DeviceInfo) (obj)).advertisingId))) || !ae.a(((Object) (osId)), ((Object) (((DeviceInfo) (obj)).osId))) || !ae.a(((Object) (osVer)), ((Object) (((DeviceInfo) (obj)).osVer))) || !ae.a(((Object) (deviceModel)), ((Object) (((DeviceInfo) (obj)).deviceModel))) || !ae.a(((Object) (deviceManufacturer)), ((Object) (((DeviceInfo) (obj)).deviceManufacturer))) || !ae.a(((Object) (deviceVersion)), ((Object) (((DeviceInfo) (obj)).deviceVersion))) || !ae.a(((Object) (packageName)), ((Object) (((DeviceInfo) (obj)).packageName))) || !ae.a(((Object) (networkOperName)), ((Object) (((DeviceInfo) (obj)).networkOperName))) || !ae.a(((Object) (isp)), ((Object) (((DeviceInfo) (obj)).isp))) || !ae.a(((Object) (ispName)), ((Object) (((DeviceInfo) (obj)).ispName))) || !ae.a(((Object) (cellId)), ((Object) (((DeviceInfo) (obj)).cellId))) || !ae.a(((Object) (locationAreaCode)), ((Object) (((DeviceInfo) (obj)).locationAreaCode))) || !ae.a(((Object) (networkType)), ((Object) (((DeviceInfo) (obj)).networkType))) || !ae.a(((Object) (signalLevel)), ((Object) (((DeviceInfo) (obj)).signalLevel))) || !ae.a(((Object) (deviceType)), ((Object) (((DeviceInfo) (obj)).deviceType))) || !ae.a(((Object) (sdkVersion)), ((Object) (((DeviceInfo) (obj)).sdkVersion))) || !ae.a(((Object) (publisherId)), ((Object) (((DeviceInfo) (obj)).publisherId))))
					break label0;
	//    9   17:aload_0         
	//   10   18:getfield        #61  <Field String latitude>
	//   11   21:aload_1         
	//   12   22:getfield        #61  <Field String latitude>
	//   13   25:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//   14   28:ifeq            313
	//   15   31:aload_0         
	//   16   32:getfield        #63  <Field String longitude>
	//   17   35:aload_1         
	//   18   36:getfield        #63  <Field String longitude>
	//   19   39:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//   20   42:ifeq            313
	//   21   45:aload_0         
	//   22   46:getfield        #65  <Field String userAgent>
	//   23   49:aload_1         
	//   24   50:getfield        #65  <Field String userAgent>
	//   25   53:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//   26   56:ifeq            313
	//   27   59:aload_0         
	//   28   60:getfield        #67  <Field String locale>
	//   29   63:aload_1         
	//   30   64:getfield        #67  <Field String locale>
	//   31   67:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//   32   70:ifeq            313
	//   33   73:aload_0         
	//   34   74:getfield        #69  <Field String advertisingId>
	//   35   77:aload_1         
	//   36   78:getfield        #69  <Field String advertisingId>
	//   37   81:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//   38   84:ifeq            313
	//   39   87:aload_0         
	//   40   88:getfield        #71  <Field String osId>
	//   41   91:aload_1         
	//   42   92:getfield        #71  <Field String osId>
	//   43   95:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//   44   98:ifeq            313
	//   45  101:aload_0         
	//   46  102:getfield        #73  <Field String osVer>
	//   47  105:aload_1         
	//   48  106:getfield        #73  <Field String osVer>
	//   49  109:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//   50  112:ifeq            313
	//   51  115:aload_0         
	//   52  116:getfield        #75  <Field String deviceModel>
	//   53  119:aload_1         
	//   54  120:getfield        #75  <Field String deviceModel>
	//   55  123:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//   56  126:ifeq            313
	//   57  129:aload_0         
	//   58  130:getfield        #77  <Field String deviceManufacturer>
	//   59  133:aload_1         
	//   60  134:getfield        #77  <Field String deviceManufacturer>
	//   61  137:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//   62  140:ifeq            313
	//   63  143:aload_0         
	//   64  144:getfield        #79  <Field String deviceVersion>
	//   65  147:aload_1         
	//   66  148:getfield        #79  <Field String deviceVersion>
	//   67  151:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//   68  154:ifeq            313
	//   69  157:aload_0         
	//   70  158:getfield        #81  <Field String packageName>
	//   71  161:aload_1         
	//   72  162:getfield        #81  <Field String packageName>
	//   73  165:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//   74  168:ifeq            313
	//   75  171:aload_0         
	//   76  172:getfield        #83  <Field String networkOperName>
	//   77  175:aload_1         
	//   78  176:getfield        #83  <Field String networkOperName>
	//   79  179:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//   80  182:ifeq            313
	//   81  185:aload_0         
	//   82  186:getfield        #85  <Field String isp>
	//   83  189:aload_1         
	//   84  190:getfield        #85  <Field String isp>
	//   85  193:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//   86  196:ifeq            313
	//   87  199:aload_0         
	//   88  200:getfield        #87  <Field String ispName>
	//   89  203:aload_1         
	//   90  204:getfield        #87  <Field String ispName>
	//   91  207:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//   92  210:ifeq            313
	//   93  213:aload_0         
	//   94  214:getfield        #89  <Field String cellId>
	//   95  217:aload_1         
	//   96  218:getfield        #89  <Field String cellId>
	//   97  221:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//   98  224:ifeq            313
	//   99  227:aload_0         
	//  100  228:getfield        #91  <Field String locationAreaCode>
	//  101  231:aload_1         
	//  102  232:getfield        #91  <Field String locationAreaCode>
	//  103  235:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//  104  238:ifeq            313
	//  105  241:aload_0         
	//  106  242:getfield        #93  <Field String networkType>
	//  107  245:aload_1         
	//  108  246:getfield        #93  <Field String networkType>
	//  109  249:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//  110  252:ifeq            313
	//  111  255:aload_0         
	//  112  256:getfield        #95  <Field String signalLevel>
	//  113  259:aload_1         
	//  114  260:getfield        #95  <Field String signalLevel>
	//  115  263:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//  116  266:ifeq            313
	//  117  269:aload_0         
	//  118  270:getfield        #97  <Field String deviceType>
	//  119  273:aload_1         
	//  120  274:getfield        #97  <Field String deviceType>
	//  121  277:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//  122  280:ifeq            313
	//  123  283:aload_0         
	//  124  284:getfield        #99  <Field String sdkVersion>
	//  125  287:aload_1         
	//  126  288:getfield        #99  <Field String sdkVersion>
	//  127  291:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//  128  294:ifeq            313
	//  129  297:aload_0         
	//  130  298:getfield        #101 <Field String publisherId>
	//  131  301:aload_1         
	//  132  302:getfield        #101 <Field String publisherId>
	//  133  305:invokestatic    #146 <Method boolean ae.a(Object, Object)>
	//  134  308:ifeq            313
			}
			return true;
	//  135  311:iconst_1        
	//  136  312:ireturn         
		}
		return false;
	//  137  313:iconst_0        
	//  138  314:ireturn         
	}

	public final String getAdvertisingId()
	{
		return advertisingId;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field String advertisingId>
	//    2    4:areturn         
	}

	public final String getCellId()
	{
		return cellId;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field String cellId>
	//    2    4:areturn         
	}

	public final String getDeviceManufacturer()
	{
		return deviceManufacturer;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String deviceManufacturer>
	//    2    4:areturn         
	}

	public final String getDeviceModel()
	{
		return deviceModel;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field String deviceModel>
	//    2    4:areturn         
	}

	public final String getDeviceType()
	{
		return deviceType;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field String deviceType>
	//    2    4:areturn         
	}

	public final String getDeviceVersion()
	{
		return deviceVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field String deviceVersion>
	//    2    4:areturn         
	}

	public final String getIsp()
	{
		return isp;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field String isp>
	//    2    4:areturn         
	}

	public final String getIspName()
	{
		return ispName;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field String ispName>
	//    2    4:areturn         
	}

	public final String getLatitude()
	{
		return latitude;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String latitude>
	//    2    4:areturn         
	}

	public final String getLocale()
	{
		return locale;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field String locale>
	//    2    4:areturn         
	}

	public final String getLocationAreaCode()
	{
		return locationAreaCode;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field String locationAreaCode>
	//    2    4:areturn         
	}

	public final String getLongitude()
	{
		return longitude;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String longitude>
	//    2    4:areturn         
	}

	public final String getNetworkOperName()
	{
		return networkOperName;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field String networkOperName>
	//    2    4:areturn         
	}

	public final String getNetworkType()
	{
		return networkType;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field String networkType>
	//    2    4:areturn         
	}

	public final String getOsId()
	{
		return osId;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field String osId>
	//    2    4:areturn         
	}

	public final String getOsVer()
	{
		return osVer;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String osVer>
	//    2    4:areturn         
	}

	public final String getPackageName()
	{
		return packageName;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field String packageName>
	//    2    4:areturn         
	}

	public final String getPublisherId()
	{
		return publisherId;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field String publisherId>
	//    2    4:areturn         
	}

	public final String getSdkVersion()
	{
		return sdkVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field String sdkVersion>
	//    2    4:areturn         
	}

	public final String getSignalLevel()
	{
		return signalLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field String signalLevel>
	//    2    4:areturn         
	}

	public final String getUserAgent()
	{
		return userAgent;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field String userAgent>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		int i5 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          21
		String s = latitude;
	//    2    3:aload_0         
	//    3    4:getfield        #61  <Field String latitude>
	//    4    7:astore          22
		int i;
		int j;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		int j2;
		int k2;
		int l2;
		int i3;
		int j3;
		int k3;
		int l3;
		int i4;
		int j4;
		int k4;
		int l4;
		if(s != null)
	//*   5    9:aload           22
	//*   6   11:ifnull          498
			i = ((Object) (s)).hashCode();
	//    7   14:aload           22
	//    8   16:invokevirtual   #171 <Method int Object.hashCode()>
	//    9   19:istore_1        
		else
	//*  10   20:aload_0         
	//*  11   21:getfield        #63  <Field String longitude>
	//*  12   24:astore          22
	//*  13   26:aload           22
	//*  14   28:ifnull          503
	//*  15   31:aload           22
	//*  16   33:invokevirtual   #171 <Method int Object.hashCode()>
	//*  17   36:istore_2        
	//*  18   37:aload_0         
	//*  19   38:getfield        #65  <Field String userAgent>
	//*  20   41:astore          22
	//*  21   43:aload           22
	//*  22   45:ifnull          508
	//*  23   48:aload           22
	//*  24   50:invokevirtual   #171 <Method int Object.hashCode()>
	//*  25   53:istore_3        
	//*  26   54:aload_0         
	//*  27   55:getfield        #67  <Field String locale>
	//*  28   58:astore          22
	//*  29   60:aload           22
	//*  30   62:ifnull          513
	//*  31   65:aload           22
	//*  32   67:invokevirtual   #171 <Method int Object.hashCode()>
	//*  33   70:istore          4
	//*  34   72:aload_0         
	//*  35   73:getfield        #69  <Field String advertisingId>
	//*  36   76:astore          22
	//*  37   78:aload           22
	//*  38   80:ifnull          519
	//*  39   83:aload           22
	//*  40   85:invokevirtual   #171 <Method int Object.hashCode()>
	//*  41   88:istore          5
	//*  42   90:aload_0         
	//*  43   91:getfield        #71  <Field String osId>
	//*  44   94:astore          22
	//*  45   96:aload           22
	//*  46   98:ifnull          525
	//*  47  101:aload           22
	//*  48  103:invokevirtual   #171 <Method int Object.hashCode()>
	//*  49  106:istore          6
	//*  50  108:aload_0         
	//*  51  109:getfield        #73  <Field String osVer>
	//*  52  112:astore          22
	//*  53  114:aload           22
	//*  54  116:ifnull          531
	//*  55  119:aload           22
	//*  56  121:invokevirtual   #171 <Method int Object.hashCode()>
	//*  57  124:istore          7
	//*  58  126:aload_0         
	//*  59  127:getfield        #75  <Field String deviceModel>
	//*  60  130:astore          22
	//*  61  132:aload           22
	//*  62  134:ifnull          537
	//*  63  137:aload           22
	//*  64  139:invokevirtual   #171 <Method int Object.hashCode()>
	//*  65  142:istore          8
	//*  66  144:aload_0         
	//*  67  145:getfield        #77  <Field String deviceManufacturer>
	//*  68  148:astore          22
	//*  69  150:aload           22
	//*  70  152:ifnull          543
	//*  71  155:aload           22
	//*  72  157:invokevirtual   #171 <Method int Object.hashCode()>
	//*  73  160:istore          9
	//*  74  162:aload_0         
	//*  75  163:getfield        #79  <Field String deviceVersion>
	//*  76  166:astore          22
	//*  77  168:aload           22
	//*  78  170:ifnull          549
	//*  79  173:aload           22
	//*  80  175:invokevirtual   #171 <Method int Object.hashCode()>
	//*  81  178:istore          10
	//*  82  180:aload_0         
	//*  83  181:getfield        #81  <Field String packageName>
	//*  84  184:astore          22
	//*  85  186:aload           22
	//*  86  188:ifnull          555
	//*  87  191:aload           22
	//*  88  193:invokevirtual   #171 <Method int Object.hashCode()>
	//*  89  196:istore          11
	//*  90  198:aload_0         
	//*  91  199:getfield        #83  <Field String networkOperName>
	//*  92  202:astore          22
	//*  93  204:aload           22
	//*  94  206:ifnull          561
	//*  95  209:aload           22
	//*  96  211:invokevirtual   #171 <Method int Object.hashCode()>
	//*  97  214:istore          12
	//*  98  216:aload_0         
	//*  99  217:getfield        #85  <Field String isp>
	//* 100  220:astore          22
	//* 101  222:aload           22
	//* 102  224:ifnull          567
	//* 103  227:aload           22
	//* 104  229:invokevirtual   #171 <Method int Object.hashCode()>
	//* 105  232:istore          13
	//* 106  234:aload_0         
	//* 107  235:getfield        #87  <Field String ispName>
	//* 108  238:astore          22
	//* 109  240:aload           22
	//* 110  242:ifnull          573
	//* 111  245:aload           22
	//* 112  247:invokevirtual   #171 <Method int Object.hashCode()>
	//* 113  250:istore          14
	//* 114  252:aload_0         
	//* 115  253:getfield        #89  <Field String cellId>
	//* 116  256:astore          22
	//* 117  258:aload           22
	//* 118  260:ifnull          579
	//* 119  263:aload           22
	//* 120  265:invokevirtual   #171 <Method int Object.hashCode()>
	//* 121  268:istore          15
	//* 122  270:aload_0         
	//* 123  271:getfield        #91  <Field String locationAreaCode>
	//* 124  274:astore          22
	//* 125  276:aload           22
	//* 126  278:ifnull          585
	//* 127  281:aload           22
	//* 128  283:invokevirtual   #171 <Method int Object.hashCode()>
	//* 129  286:istore          16
	//* 130  288:aload_0         
	//* 131  289:getfield        #93  <Field String networkType>
	//* 132  292:astore          22
	//* 133  294:aload           22
	//* 134  296:ifnull          591
	//* 135  299:aload           22
	//* 136  301:invokevirtual   #171 <Method int Object.hashCode()>
	//* 137  304:istore          17
	//* 138  306:aload_0         
	//* 139  307:getfield        #95  <Field String signalLevel>
	//* 140  310:astore          22
	//* 141  312:aload           22
	//* 142  314:ifnull          597
	//* 143  317:aload           22
	//* 144  319:invokevirtual   #171 <Method int Object.hashCode()>
	//* 145  322:istore          18
	//* 146  324:aload_0         
	//* 147  325:getfield        #97  <Field String deviceType>
	//* 148  328:astore          22
	//* 149  330:aload           22
	//* 150  332:ifnull          603
	//* 151  335:aload           22
	//* 152  337:invokevirtual   #171 <Method int Object.hashCode()>
	//* 153  340:istore          19
	//* 154  342:aload_0         
	//* 155  343:getfield        #99  <Field String sdkVersion>
	//* 156  346:astore          22
	//* 157  348:aload           22
	//* 158  350:ifnull          609
	//* 159  353:aload           22
	//* 160  355:invokevirtual   #171 <Method int Object.hashCode()>
	//* 161  358:istore          20
	//* 162  360:aload_0         
	//* 163  361:getfield        #101 <Field String publisherId>
	//* 164  364:astore          22
	//* 165  366:aload           22
	//* 166  368:ifnull          378
	//* 167  371:aload           22
	//* 168  373:invokevirtual   #171 <Method int Object.hashCode()>
	//* 169  376:istore          21
	//* 170  378:iload           20
	//* 171  380:iload           19
	//* 172  382:iload           18
	//* 173  384:iload           17
	//* 174  386:iload           16
	//* 175  388:iload           15
	//* 176  390:iload           14
	//* 177  392:iload           13
	//* 178  394:iload           12
	//* 179  396:iload           11
	//* 180  398:iload           10
	//* 181  400:iload           9
	//* 182  402:iload           8
	//* 183  404:iload           7
	//* 184  406:iload           6
	//* 185  408:iload           5
	//* 186  410:iload           4
	//* 187  412:iload_3         
	//* 188  413:iload_2         
	//* 189  414:iload_1         
	//* 190  415:bipush          31
	//* 191  417:imul            
	//* 192  418:iadd            
	//* 193  419:bipush          31
	//* 194  421:imul            
	//* 195  422:iadd            
	//* 196  423:bipush          31
	//* 197  425:imul            
	//* 198  426:iadd            
	//* 199  427:bipush          31
	//* 200  429:imul            
	//* 201  430:iadd            
	//* 202  431:bipush          31
	//* 203  433:imul            
	//* 204  434:iadd            
	//* 205  435:bipush          31
	//* 206  437:imul            
	//* 207  438:iadd            
	//* 208  439:bipush          31
	//* 209  441:imul            
	//* 210  442:iadd            
	//* 211  443:bipush          31
	//* 212  445:imul            
	//* 213  446:iadd            
	//* 214  447:bipush          31
	//* 215  449:imul            
	//* 216  450:iadd            
	//* 217  451:bipush          31
	//* 218  453:imul            
	//* 219  454:iadd            
	//* 220  455:bipush          31
	//* 221  457:imul            
	//* 222  458:iadd            
	//* 223  459:bipush          31
	//* 224  461:imul            
	//* 225  462:iadd            
	//* 226  463:bipush          31
	//* 227  465:imul            
	//* 228  466:iadd            
	//* 229  467:bipush          31
	//* 230  469:imul            
	//* 231  470:iadd            
	//* 232  471:bipush          31
	//* 233  473:imul            
	//* 234  474:iadd            
	//* 235  475:bipush          31
	//* 236  477:imul            
	//* 237  478:iadd            
	//* 238  479:bipush          31
	//* 239  481:imul            
	//* 240  482:iadd            
	//* 241  483:bipush          31
	//* 242  485:imul            
	//* 243  486:iadd            
	//* 244  487:bipush          31
	//* 245  489:imul            
	//* 246  490:iadd            
	//* 247  491:bipush          31
	//* 248  493:imul            
	//* 249  494:iload           21
	//* 250  496:iadd            
	//* 251  497:ireturn         
			i = 0;
	//  252  498:iconst_0        
	//  253  499:istore_1        
		s = longitude;
		if(s != null)
			j = ((Object) (s)).hashCode();
		else
	//* 254  500:goto            20
			j = 0;
	//  255  503:iconst_0        
	//  256  504:istore_2        
		s = userAgent;
		if(s != null)
			k = ((Object) (s)).hashCode();
		else
	//* 257  505:goto            37
			k = 0;
	//  258  508:iconst_0        
	//  259  509:istore_3        
		s = locale;
		if(s != null)
			l = ((Object) (s)).hashCode();
		else
	//* 260  510:goto            54
			l = 0;
	//  261  513:iconst_0        
	//  262  514:istore          4
		s = advertisingId;
		if(s != null)
			i1 = ((Object) (s)).hashCode();
		else
	//* 263  516:goto            72
			i1 = 0;
	//  264  519:iconst_0        
	//  265  520:istore          5
		s = osId;
		if(s != null)
			j1 = ((Object) (s)).hashCode();
		else
	//* 266  522:goto            90
			j1 = 0;
	//  267  525:iconst_0        
	//  268  526:istore          6
		s = osVer;
		if(s != null)
			k1 = ((Object) (s)).hashCode();
		else
	//* 269  528:goto            108
			k1 = 0;
	//  270  531:iconst_0        
	//  271  532:istore          7
		s = deviceModel;
		if(s != null)
			l1 = ((Object) (s)).hashCode();
		else
	//* 272  534:goto            126
			l1 = 0;
	//  273  537:iconst_0        
	//  274  538:istore          8
		s = deviceManufacturer;
		if(s != null)
			i2 = ((Object) (s)).hashCode();
		else
	//* 275  540:goto            144
			i2 = 0;
	//  276  543:iconst_0        
	//  277  544:istore          9
		s = deviceVersion;
		if(s != null)
			j2 = ((Object) (s)).hashCode();
		else
	//* 278  546:goto            162
			j2 = 0;
	//  279  549:iconst_0        
	//  280  550:istore          10
		s = packageName;
		if(s != null)
			k2 = ((Object) (s)).hashCode();
		else
	//* 281  552:goto            180
			k2 = 0;
	//  282  555:iconst_0        
	//  283  556:istore          11
		s = networkOperName;
		if(s != null)
			l2 = ((Object) (s)).hashCode();
		else
	//* 284  558:goto            198
			l2 = 0;
	//  285  561:iconst_0        
	//  286  562:istore          12
		s = isp;
		if(s != null)
			i3 = ((Object) (s)).hashCode();
		else
	//* 287  564:goto            216
			i3 = 0;
	//  288  567:iconst_0        
	//  289  568:istore          13
		s = ispName;
		if(s != null)
			j3 = ((Object) (s)).hashCode();
		else
	//* 290  570:goto            234
			j3 = 0;
	//  291  573:iconst_0        
	//  292  574:istore          14
		s = cellId;
		if(s != null)
			k3 = ((Object) (s)).hashCode();
		else
	//* 293  576:goto            252
			k3 = 0;
	//  294  579:iconst_0        
	//  295  580:istore          15
		s = locationAreaCode;
		if(s != null)
			l3 = ((Object) (s)).hashCode();
		else
	//* 296  582:goto            270
			l3 = 0;
	//  297  585:iconst_0        
	//  298  586:istore          16
		s = networkType;
		if(s != null)
			i4 = ((Object) (s)).hashCode();
		else
	//* 299  588:goto            288
			i4 = 0;
	//  300  591:iconst_0        
	//  301  592:istore          17
		s = signalLevel;
		if(s != null)
			j4 = ((Object) (s)).hashCode();
		else
	//* 302  594:goto            306
			j4 = 0;
	//  303  597:iconst_0        
	//  304  598:istore          18
		s = deviceType;
		if(s != null)
			k4 = ((Object) (s)).hashCode();
		else
	//* 305  600:goto            324
			k4 = 0;
	//  306  603:iconst_0        
	//  307  604:istore          19
		s = sdkVersion;
		if(s != null)
			l4 = ((Object) (s)).hashCode();
		else
	//* 308  606:goto            342
			l4 = 0;
	//  309  609:iconst_0        
	//  310  610:istore          20
		s = publisherId;
		if(s != null)
			i5 = ((Object) (s)).hashCode();
		return (l4 + (k4 + (j4 + (i4 + (l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i5;
	//* 311  612:goto            360
	}

	public final void setPublisherId(String s)
	{
		ae.b(((Object) (s)), "<set-?>");
	//    0    0:aload_1         
	//    1    1:ldc1            #175 <String "<set-?>">
	//    2    3:invokestatic    #36  <Method void ae.b(Object, String)>
		publisherId = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #101 <Field String publisherId>
	//    6   11:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("DeviceInfo(latitude=").append(latitude).append(", longitude=").append(longitude).append(", userAgent=").append(userAgent).append(", locale=").append(locale).append(", advertisingId=").append(advertisingId).append(", osId=").append(osId).append(", osVer=").append(osVer).append(", deviceModel=").append(deviceModel).append(", deviceManufacturer=").append(deviceManufacturer).append(", deviceVersion=").append(deviceVersion).append(", packageName=").append(packageName).append(", networkOperName=").append(networkOperName).append(", isp=").append(isp).append(", ispName=").append(ispName).append(", cellId=").append(cellId).append(", locationAreaCode=").append(locationAreaCode).append(", networkType=").append(networkType).append(", signalLevel=").append(signalLevel).append(", deviceType=").append(deviceType).append(", sdkVersion=").append(sdkVersion).append(", publisherId=").append(publisherId).append(")").toString();
	//    0    0:new             #178 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #179 <Method void StringBuilder()>
	//    3    7:ldc1            #181 <String "DeviceInfo(latitude=">
	//    4    9:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #61  <Field String latitude>
	//    7   16:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #187 <String ", longitude=">
	//    9   21:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #63  <Field String longitude>
	//   12   28:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:ldc1            #189 <String ", userAgent=">
	//   14   33:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #65  <Field String userAgent>
	//   17   40:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   18   43:ldc1            #191 <String ", locale=">
	//   19   45:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #67  <Field String locale>
	//   22   52:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   23   55:ldc1            #193 <String ", advertisingId=">
	//   24   57:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #69  <Field String advertisingId>
	//   27   64:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   28   67:ldc1            #195 <String ", osId=">
	//   29   69:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   30   72:aload_0         
	//   31   73:getfield        #71  <Field String osId>
	//   32   76:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   33   79:ldc1            #197 <String ", osVer=">
	//   34   81:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   35   84:aload_0         
	//   36   85:getfield        #73  <Field String osVer>
	//   37   88:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   38   91:ldc1            #199 <String ", deviceModel=">
	//   39   93:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   40   96:aload_0         
	//   41   97:getfield        #75  <Field String deviceModel>
	//   42  100:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   43  103:ldc1            #201 <String ", deviceManufacturer=">
	//   44  105:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   45  108:aload_0         
	//   46  109:getfield        #77  <Field String deviceManufacturer>
	//   47  112:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   48  115:ldc1            #203 <String ", deviceVersion=">
	//   49  117:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   50  120:aload_0         
	//   51  121:getfield        #79  <Field String deviceVersion>
	//   52  124:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   53  127:ldc1            #205 <String ", packageName=">
	//   54  129:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   55  132:aload_0         
	//   56  133:getfield        #81  <Field String packageName>
	//   57  136:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   58  139:ldc1            #207 <String ", networkOperName=">
	//   59  141:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   60  144:aload_0         
	//   61  145:getfield        #83  <Field String networkOperName>
	//   62  148:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   63  151:ldc1            #209 <String ", isp=">
	//   64  153:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   65  156:aload_0         
	//   66  157:getfield        #85  <Field String isp>
	//   67  160:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   68  163:ldc1            #211 <String ", ispName=">
	//   69  165:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   70  168:aload_0         
	//   71  169:getfield        #87  <Field String ispName>
	//   72  172:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   73  175:ldc1            #213 <String ", cellId=">
	//   74  177:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   75  180:aload_0         
	//   76  181:getfield        #89  <Field String cellId>
	//   77  184:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   78  187:ldc1            #215 <String ", locationAreaCode=">
	//   79  189:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   80  192:aload_0         
	//   81  193:getfield        #91  <Field String locationAreaCode>
	//   82  196:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   83  199:ldc1            #217 <String ", networkType=">
	//   84  201:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   85  204:aload_0         
	//   86  205:getfield        #93  <Field String networkType>
	//   87  208:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   88  211:ldc1            #219 <String ", signalLevel=">
	//   89  213:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   90  216:aload_0         
	//   91  217:getfield        #95  <Field String signalLevel>
	//   92  220:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   93  223:ldc1            #221 <String ", deviceType=">
	//   94  225:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   95  228:aload_0         
	//   96  229:getfield        #97  <Field String deviceType>
	//   97  232:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   98  235:ldc1            #223 <String ", sdkVersion=">
	//   99  237:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  100  240:aload_0         
	//  101  241:getfield        #99  <Field String sdkVersion>
	//  102  244:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  103  247:ldc1            #225 <String ", publisherId=">
	//  104  249:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  105  252:aload_0         
	//  106  253:getfield        #101 <Field String publisherId>
	//  107  256:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  108  259:ldc1            #227 <String ")">
	//  109  261:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//  110  264:invokevirtual   #229 <Method String StringBuilder.toString()>
	//  111  267:areturn         
	}

	private final String advertisingId;
	private final String cellId;
	private final String deviceManufacturer;
	private final String deviceModel;
	private final String deviceType;
	private final String deviceVersion;
	private final String isp;
	private final String ispName;
	private final String latitude;
	private final String locale;
	private final String locationAreaCode;
	private final String longitude;
	private final String networkOperName;
	private final String networkType;
	private final String osId;
	private final String osVer;
	private final String packageName;
	private String publisherId;
	private final String sdkVersion;
	private final String signalLevel;
	private final String userAgent;
}
