// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.integrations;

import android.content.Context;
import android.content.pm.*;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.appscend.utilities.NetworkInfoUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Random;

public class SpotXchangeTag
{

	public SpotXchangeTag(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Context mContext>
		advertisingIdentifier = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field String advertisingIdentifier>
	//    8   14:return          
	}

	private String getAppName()
	{
		int i = mContext.getApplicationInfo().labelRes;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Context mContext>
	//    2    4:invokevirtual   #26  <Method ApplicationInfo Context.getApplicationInfo()>
	//    3    7:getfield        #32  <Field int ApplicationInfo.labelRes>
	//    4   10:istore_1        
		return mContext.getString(i);
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field Context mContext>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #36  <Method String Context.getString(int)>
	//    9   19:areturn         
	}

	private String getAppVersion()
	{
		String s;
		try
		{
			s = mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0).versionName;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Context mContext>
	//    2    4:invokevirtual   #43  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field Context mContext>
	//    5   11:invokevirtual   #46  <Method String Context.getPackageName()>
	//    6   14:iconst_0        
	//    7   15:invokevirtual   #52  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    8   18:getfield        #57  <Field String PackageInfo.versionName>
	//    9   21:astore_1        
		}
	//*  10   22:aload_1         
	//*  11   23:areturn         
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*  12   24:astore_1        
		{
			namenotfoundexception.printStackTrace();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #60  <Method void android.content.pm.PackageManager$NameNotFoundException.printStackTrace()>
			return "";
	//   15   29:ldc1            #62  <String "">
	//   16   31:areturn         
		}
		return s;
	}

	private String getCarrier()
	{
		return ((TelephonyManager)mContext.getSystemService("phone")).getNetworkOperatorName();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Context mContext>
	//    2    4:ldc1            #65  <String "phone">
	//    3    6:invokevirtual   #69  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #71  <Class TelephonyManager>
	//    5   12:invokevirtual   #74  <Method String TelephonyManager.getNetworkOperatorName()>
	//    6   15:areturn         
	}

	private String getConnectionType()
	{
		return NetworkInfoUtils.checkNetworkStatus(mContext);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Context mContext>
	//    2    4:invokestatic    #81  <Method String NetworkInfoUtils.checkNetworkStatus(Context)>
	//    3    7:areturn         
	}

	private String getDeviceModel()
	{
		String s = Build.MANUFACTURER;
	//    0    0:getstatic       #87  <Field String Build.MANUFACTURER>
	//    1    3:astore_1        
		String s1 = Build.MODEL;
	//    2    4:getstatic       #90  <Field String Build.MODEL>
	//    3    7:astore_2        
		if(s1.startsWith(s))
	//*   4    8:aload_2         
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #96  <Method boolean String.startsWith(String)>
	//*   7   13:ifeq            18
		{
			return s1;
	//    8   16:aload_2         
	//    9   17:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   18:new             #98  <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #99  <Method void StringBuilder()>
	//   13   25:astore_3        
			stringbuilder.append(s);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   17   31:pop             
			stringbuilder.append(" ");
	//   18   32:aload_3         
	//   19   33:ldc1            #105 <String " ">
	//   20   35:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   21   38:pop             
			stringbuilder.append(s1);
	//   22   39:aload_3         
	//   23   40:aload_2         
	//   24   41:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   25   44:pop             
			return stringbuilder.toString();
	//   26   45:aload_3         
	//   27   46:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   28   49:areturn         
		}
	}

	private String getIpAddress()
	{
		return NetworkInfoUtils.getIPAddress(true);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #113 <Method String NetworkInfoUtils.getIPAddress(boolean)>
	//    2    4:areturn         
	}

	private String getUserAgent()
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #119 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          16
			return WebSettings.getDefaultUserAgent(mContext);
	//    3    8:aload_0         
	//    4    9:getfield        #15  <Field Context mContext>
	//    5   12:invokestatic    #124 <Method String WebSettings.getDefaultUserAgent(Context)>
	//    6   15:areturn         
		else
			return (new WebView(mContext)).getSettings().getUserAgentString();
	//    7   16:new             #126 <Class WebView>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:getfield        #15  <Field Context mContext>
	//   11   24:invokespecial   #129 <Method void WebView(Context)>
	//   12   27:invokevirtual   #133 <Method WebSettings WebView.getSettings()>
	//   13   30:invokevirtual   #136 <Method String WebSettings.getUserAgentString()>
	//   14   33:areturn         
	}

	private String sha1(String s)
	{
		int i;
		int j;
		StringBuilder stringbuilder;
		try
		{
			s = ((String) (MessageDigest.getInstance("SHA-1").digest(s.getBytes("UTF-8"))));
	//    0    0:ldc1            #144 <String "SHA-1">
	//    1    2:invokestatic    #150 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    5:aload_1         
	//    3    6:ldc1            #152 <String "UTF-8">
	//    4    8:invokevirtual   #156 <Method byte[] String.getBytes(String)>
	//    5   11:invokevirtual   #160 <Method byte[] MessageDigest.digest(byte[])>
	//    6   14:astore_1        
			stringbuilder = new StringBuilder();
	//    7   15:new             #98  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #99  <Method void StringBuilder()>
	//   10   22:astore          4
			j = s.length;
	//   11   24:aload_1         
	//   12   25:arraylength     
	//   13   26:istore_3        
		}
	//*  14   27:iconst_0        
	//*  15   28:istore_2        
	//*  16   29:iload_2         
	//*  17   30:iload_3         
	//*  18   31:icmpge          65
	//*  19   34:aload           4
	//*  20   36:ldc1            #162 <String "%02X">
	//*  21   38:iconst_1        
	//*  22   39:anewarray       Object[]
	//*  23   42:dup             
	//*  24   43:iconst_0        
	//*  25   44:aload_1         
	//*  26   45:iload_2         
	//*  27   46:baload          
	//*  28   47:invokestatic    #168 <Method Byte Byte.valueOf(byte)>
	//*  29   50:aastore         
	//*  30   51:invokestatic    #172 <Method String String.format(String, Object[])>
	//*  31   54:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  32   57:pop             
	//*  33   58:iload_2         
	//*  34   59:iconst_1        
	//*  35   60:iadd            
	//*  36   61:istore_2        
	//*  37   62:goto            29
	//*  38   65:aload           4
	//*  39   67:invokevirtual   #108 <Method String StringBuilder.toString()>
	//*  40   70:astore_1        
	//*  41   71:aload_1         
	//*  42   72:areturn         
	//*  43   73:ldc1            #62  <String "">
	//*  44   75:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return "";
		}
		i = 0;
		if(i >= j)
			break; /* Loop/switch isn't completed */
		stringbuilder.append(String.format("%02X", new Object[] {
			Byte.valueOf(s[i])
		}));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_29;
_L1:
		s = stringbuilder.toString();
		return s;
	//*  45   76:astore_1        
	//*  46   77:goto            73
	}

	public String tagForContentPage(String s)
	{
		UnsupportedEncodingException unsupportedencodingexception1;
		Object obj1 = ((Object) (new Random()));
	//    0    0:new             #175 <Class Random>
	//    1    3:dup             
	//    2    4:invokespecial   #176 <Method void Random()>
	//    3    7:astore          4
		int i;
		Object obj;
		String s1;
		Object obj2;
		Object obj3;
		Object obj4;
		Object obj5;
		StringBuilder stringbuilder;
		try
		{
			obj = ((Object) (URLEncoder.encode(s, "UTF-8")));
	//    4    9:aload_1         
	//    5   10:ldc1            #152 <String "UTF-8">
	//    6   12:invokestatic    #182 <Method String URLEncoder.encode(String, String)>
	//    7   15:astore_3        
		}
	//*   8   16:aload           4
	//*   9   18:ldc1            #183 <Int 0xf4240>
	//*  10   20:invokevirtual   #187 <Method int Random.nextInt(int)>
	//*  11   23:invokestatic    #192 <Method int Math.abs(int)>
	//*  12   26:istore_2        
	//*  13   27:aload_0         
	//*  14   28:invokespecial   #194 <Method String getIpAddress()>
	//*  15   31:pop             
	//*  16   32:aload_0         
	//*  17   33:invokespecial   #196 <Method String getAppName()>
	//*  18   36:astore          9
	//*  19   38:aload_0         
	//*  20   39:invokespecial   #198 <Method String getAppVersion()>
	//*  21   42:astore          8
	//*  22   44:aload_0         
	//*  23   45:getfield        #15  <Field Context mContext>
	//*  24   48:invokevirtual   #46  <Method String Context.getPackageName()>
	//*  25   51:astore          7
	//*  26   53:aload_0         
	//*  27   54:getfield        #17  <Field String advertisingIdentifier>
	//*  28   57:astore          5
	//*  29   59:getstatic       #201 <Field String android.os.Build$VERSION.RELEASE>
	//*  30   62:astore_1        
	//*  31   63:invokestatic    #207 <Method Locale Locale.getDefault()>
	//*  32   66:invokevirtual   #210 <Method String Locale.getLanguage()>
	//*  33   69:pop             
	//*  34   70:aload_0         
	//*  35   71:invokespecial   #212 <Method String getCarrier()>
	//*  36   74:pop             
	//*  37   75:aload_0         
	//*  38   76:invokespecial   #214 <Method String getConnectionType()>
	//*  39   79:pop             
	//*  40   80:aload_0         
	//*  41   81:invokespecial   #216 <Method String getUserAgent()>
	//*  42   84:astore          4
	//*  43   86:getstatic       #90  <Field String Build.MODEL>
	//*  44   89:ldc1            #152 <String "UTF-8">
	//*  45   91:invokestatic    #182 <Method String URLEncoder.encode(String, String)>
	//*  46   94:astore_1        
	//*  47   95:goto            101
	//*  48   98:ldc1            #218 <String "iPhone">
	//*  49  100:astore_1        
	//*  50  101:getstatic       #87  <Field String Build.MANUFACTURER>
	//*  51  104:astore          6
	//*  52  106:new             #98  <Class StringBuilder>
	//*  53  109:dup             
	//*  54  110:invokespecial   #99  <Method void StringBuilder()>
	//*  55  113:astore          10
	//*  56  115:aload           10
	//*  57  117:ldc1            #220 <String "http://search.spotxchange.com/vast/2.00/85394?VPI=MP4">
	//*  58  119:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  59  122:pop             
	//*  60  123:aload           10
	//*  61  125:ldc1            #222 <String "&content_page_url=">
	//*  62  127:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  63  130:pop             
	//*  64  131:aload           10
	//*  65  133:aload_3         
	//*  66  134:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  67  137:pop             
	//*  68  138:aload           10
	//*  69  140:invokevirtual   #108 <Method String StringBuilder.toString()>
	//*  70  143:astore_3        
	//*  71  144:new             #98  <Class StringBuilder>
	//*  72  147:dup             
	//*  73  148:invokespecial   #99  <Method void StringBuilder()>
	//*  74  151:astore          10
	//*  75  153:aload           10
	//*  76  155:aload_3         
	//*  77  156:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  78  159:pop             
	//*  79  160:aload           10
	//*  80  162:ldc1            #224 <String "&cb=">
	//*  81  164:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  82  167:pop             
	//*  83  168:aload           10
	//*  84  170:iload_2         
	//*  85  171:invokevirtual   #227 <Method StringBuilder StringBuilder.append(int)>
	//*  86  174:pop             
	//*  87  175:aload           10
	//*  88  177:invokevirtual   #108 <Method String StringBuilder.toString()>
	//*  89  180:astore_3        
	//*  90  181:new             #98  <Class StringBuilder>
	//*  91  184:dup             
	//*  92  185:invokespecial   #99  <Method void StringBuilder()>
	//*  93  188:astore          10
	//*  94  190:aload           10
	//*  95  192:aload_3         
	//*  96  193:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  97  196:pop             
	//*  98  197:aload           10
	//*  99  199:ldc1            #229 <String "&app[name]=">
	//* 100  201:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 101  204:pop             
	//* 102  205:aload           10
	//* 103  207:aload           9
	//* 104  209:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 105  212:pop             
	//* 106  213:aload           10
	//* 107  215:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 108  218:astore_3        
	//* 109  219:new             #98  <Class StringBuilder>
	//* 110  222:dup             
	//* 111  223:invokespecial   #99  <Method void StringBuilder()>
	//* 112  226:astore          9
	//* 113  228:aload           9
	//* 114  230:aload_3         
	//* 115  231:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 116  234:pop             
	//* 117  235:aload           9
	//* 118  237:ldc1            #231 <String "&app[domain]=veeplay.com">
	//* 119  239:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 120  242:pop             
	//* 121  243:aload           9
	//* 122  245:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 123  248:astore_3        
	//* 124  249:new             #98  <Class StringBuilder>
	//* 125  252:dup             
	//* 126  253:invokespecial   #99  <Method void StringBuilder()>
	//* 127  256:astore          9
	//* 128  258:aload           9
	//* 129  260:aload_3         
	//* 130  261:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 131  264:pop             
	//* 132  265:aload           9
	//* 133  267:ldc1            #233 <String "&app[ver]=">
	//* 134  269:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 135  272:pop             
	//* 136  273:aload           9
	//* 137  275:aload           8
	//* 138  277:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 139  280:pop             
	//* 140  281:aload           9
	//* 141  283:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 142  286:astore_3        
	//* 143  287:new             #98  <Class StringBuilder>
	//* 144  290:dup             
	//* 145  291:invokespecial   #99  <Method void StringBuilder()>
	//* 146  294:astore          8
	//* 147  296:aload           8
	//* 148  298:aload_3         
	//* 149  299:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 150  302:pop             
	//* 151  303:aload           8
	//* 152  305:ldc1            #235 <String "&app[bundle]=">
	//* 153  307:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 154  310:pop             
	//* 155  311:aload           8
	//* 156  313:aload           7
	//* 157  315:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 158  318:pop             
	//* 159  319:aload           8
	//* 160  321:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 161  324:astore          7
	//* 162  326:new             #98  <Class StringBuilder>
	//* 163  329:dup             
	//* 164  330:invokespecial   #99  <Method void StringBuilder()>
	//* 165  333:astore_3        
	//* 166  334:aload_3         
	//* 167  335:aload           7
	//* 168  337:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 169  340:pop             
	//* 170  341:aload_3         
	//* 171  342:ldc1            #237 <String "&app[storeurl]=">
	//* 172  344:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 173  347:pop             
	//* 174  348:aload_3         
	//* 175  349:ldc1            #239 <String "http://veeplay.com">
	//* 176  351:ldc1            #152 <String "UTF-8">
	//* 177  353:invokestatic    #182 <Method String URLEncoder.encode(String, String)>
	//* 178  356:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 179  359:pop             
	//* 180  360:aload_3         
	//* 181  361:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 182  364:astore_3        
	//* 183  365:goto            395
	//* 184  368:new             #98  <Class StringBuilder>
	//* 185  371:dup             
	//* 186  372:invokespecial   #99  <Method void StringBuilder()>
	//* 187  375:astore_3        
	//* 188  376:aload_3         
	//* 189  377:aload           7
	//* 190  379:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 191  382:pop             
	//* 192  383:aload_3         
	//* 193  384:ldc1            #241 <String "&app[storeurl]=http://veeplay.com">
	//* 194  386:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 195  389:pop             
	//* 196  390:aload_3         
	//* 197  391:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 198  394:astore_3        
	//* 199  395:new             #98  <Class StringBuilder>
	//* 200  398:dup             
	//* 201  399:invokespecial   #99  <Method void StringBuilder()>
	//* 202  402:astore          7
	//* 203  404:aload           7
	//* 204  406:aload_3         
	//* 205  407:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 206  410:pop             
	//* 207  411:aload           7
	//* 208  413:ldc1            #243 <String "&device[os]=Android">
	//* 209  415:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 210  418:pop             
	//* 211  419:aload           7
	//* 212  421:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 213  424:astore_3        
	//* 214  425:new             #98  <Class StringBuilder>
	//* 215  428:dup             
	//* 216  429:invokespecial   #99  <Method void StringBuilder()>
	//* 217  432:astore          7
	//* 218  434:aload           7
	//* 219  436:aload_3         
	//* 220  437:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 221  440:pop             
	//* 222  441:aload           7
	//* 223  443:ldc1            #245 <String "&device[osv]=">
	//* 224  445:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 225  448:pop             
	//* 226  449:aload           7
	//* 227  451:getstatic       #201 <Field String android.os.Build$VERSION.RELEASE>
	//* 228  454:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 229  457:pop             
	//* 230  458:aload           7
	//* 231  460:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 232  463:astore_3        
	//* 233  464:new             #98  <Class StringBuilder>
	//* 234  467:dup             
	//* 235  468:invokespecial   #99  <Method void StringBuilder()>
	//* 236  471:astore          7
	//* 237  473:aload           7
	//* 238  475:aload_3         
	//* 239  476:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 240  479:pop             
	//* 241  480:aload           7
	//* 242  482:ldc1            #247 <String "&device[make]=">
	//* 243  484:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 244  487:pop             
	//* 245  488:aload           7
	//* 246  490:aload           6
	//* 247  492:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 248  495:pop             
	//* 249  496:aload           7
	//* 250  498:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 251  501:astore_3        
	//* 252  502:new             #98  <Class StringBuilder>
	//* 253  505:dup             
	//* 254  506:invokespecial   #99  <Method void StringBuilder()>
	//* 255  509:astore          6
	//* 256  511:aload           6
	//* 257  513:aload_3         
	//* 258  514:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 259  517:pop             
	//* 260  518:aload           6
	//* 261  520:ldc1            #249 <String "&device[model]=">
	//* 262  522:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 263  525:pop             
	//* 264  526:aload           6
	//* 265  528:aload_1         
	//* 266  529:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 267  532:pop             
	//* 268  533:aload           6
	//* 269  535:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 270  538:astore_1        
	//* 271  539:new             #98  <Class StringBuilder>
	//* 272  542:dup             
	//* 273  543:invokespecial   #99  <Method void StringBuilder()>
	//* 274  546:astore_3        
	//* 275  547:aload_3         
	//* 276  548:aload_1         
	//* 277  549:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 278  552:pop             
	//* 279  553:aload_3         
	//* 280  554:ldc1            #251 <String "&device[devicetype]=1">
	//* 281  556:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 282  559:pop             
	//* 283  560:aload_3         
	//* 284  561:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 285  564:astore_1        
	//* 286  565:new             #98  <Class StringBuilder>
	//* 287  568:dup             
	//* 288  569:invokespecial   #99  <Method void StringBuilder()>
	//* 289  572:astore_3        
	//* 290  573:aload_3         
	//* 291  574:aload_1         
	//* 292  575:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 293  578:pop             
	//* 294  579:aload_3         
	//* 295  580:ldc1            #253 <String "&device[ifa]=">
	//* 296  582:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 297  585:pop             
	//* 298  586:aload_3         
	//* 299  587:aload           5
	//* 300  589:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 301  592:pop             
	//* 302  593:aload_3         
	//* 303  594:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 304  597:astore_1        
	//* 305  598:new             #98  <Class StringBuilder>
	//* 306  601:dup             
	//* 307  602:invokespecial   #99  <Method void StringBuilder()>
	//* 308  605:astore_3        
	//* 309  606:aload_3         
	//* 310  607:aload_1         
	//* 311  608:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 312  611:pop             
	//* 313  612:aload_3         
	//* 314  613:ldc1            #255 <String "&device[dnt]=0">
	//* 315  615:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 316  618:pop             
	//* 317  619:aload_3         
	//* 318  620:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 319  623:astore_1        
	//* 320  624:new             #98  <Class StringBuilder>
	//* 321  627:dup             
	//* 322  628:invokespecial   #99  <Method void StringBuilder()>
	//* 323  631:astore_3        
	//* 324  632:aload_3         
	//* 325  633:aload_1         
	//* 326  634:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 327  637:pop             
	//* 328  638:aload_3         
	//* 329  639:ldc2            #257 <String "&device[didsha1]=">
	//* 330  642:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 331  645:pop             
	//* 332  646:aload_3         
	//* 333  647:aload_0         
	//* 334  648:ldc2            #259 <String "android_id">
	//* 335  651:invokespecial   #261 <Method String sha1(String)>
	//* 336  654:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 337  657:pop             
	//* 338  658:aload_3         
	//* 339  659:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 340  662:astore_1        
	//* 341  663:new             #98  <Class StringBuilder>
	//* 342  666:dup             
	//* 343  667:invokespecial   #99  <Method void StringBuilder()>
	//* 344  670:astore_3        
	//* 345  671:aload_3         
	//* 346  672:aload_1         
	//* 347  673:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 348  676:pop             
	//* 349  677:aload_3         
	//* 350  678:ldc2            #263 <String "&ip_addr=">
	//* 351  681:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 352  684:pop             
	//* 353  685:aload_3         
	//* 354  686:aload_0         
	//* 355  687:invokespecial   #194 <Method String getIpAddress()>
	//* 356  690:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 357  693:pop             
	//* 358  694:aload_3         
	//* 359  695:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 360  698:astore_1        
	//* 361  699:new             #98  <Class StringBuilder>
	//* 362  702:dup             
	//* 363  703:invokespecial   #99  <Method void StringBuilder()>
	//* 364  706:astore_3        
	//* 365  707:aload_3         
	//* 366  708:aload_1         
	//* 367  709:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 368  712:pop             
	//* 369  713:aload_3         
	//* 370  714:ldc2            #265 <String "&device[ua]=">
	//* 371  717:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 372  720:pop             
	//* 373  721:aload_3         
	//* 374  722:aload           4
	//* 375  724:ldc1            #152 <String "UTF-8">
	//* 376  726:invokestatic    #182 <Method String URLEncoder.encode(String, String)>
	//* 377  729:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//* 378  732:pop             
	//* 379  733:aload_3         
	//* 380  734:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 381  737:astore_3        
	//* 382  738:aload_3         
	//* 383  739:areturn         
	//* 384  740:astore_3        
	//* 385  741:aload_3         
	//* 386  742:invokevirtual   #266 <Method void UnsupportedEncodingException.printStackTrace()>
	//* 387  745:aload_1         
	//* 388  746:areturn         
		catch(UnsupportedEncodingException unsupportedencodingexception)
	//* 389  747:astore_3        
		{
			unsupportedencodingexception = ((UnsupportedEncodingException) (s));
	//  390  748:aload_1         
	//  391  749:astore_3        
		}
		i = Math.abs(((Random) (obj1)).nextInt(0xf4240));
		getIpAddress();
		obj5 = ((Object) (getAppName()));
		obj4 = ((Object) (getAppVersion()));
		obj3 = ((Object) (mContext.getPackageName()));
		s1 = advertisingIdentifier;
		s = android.os.Build.VERSION.RELEASE;
		Locale.getDefault().getLanguage();
		getCarrier();
		getConnectionType();
		obj1 = ((Object) (getUserAgent()));
		try
		{
			s = URLEncoder.encode(Build.MODEL, "UTF-8");
		}
	//* 392  750:goto            16
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			s = "iPhone";
		}
		obj2 = ((Object) (Build.MANUFACTURER));
		stringbuilder = new StringBuilder();
		stringbuilder.append("http://search.spotxchange.com/vast/2.00/85394?VPI=MP4");
		stringbuilder.append("&content_page_url=");
		stringbuilder.append(((String) (obj)));
		obj = ((Object) (stringbuilder.toString()));
		stringbuilder = new StringBuilder();
		stringbuilder.append(((String) (obj)));
		stringbuilder.append("&cb=");
		stringbuilder.append(i);
		obj = ((Object) (stringbuilder.toString()));
		stringbuilder = new StringBuilder();
		stringbuilder.append(((String) (obj)));
		stringbuilder.append("&app[name]=");
		stringbuilder.append(((String) (obj5)));
		obj = ((Object) (stringbuilder.toString()));
		obj5 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj5)).append(((String) (obj)));
		((StringBuilder) (obj5)).append("&app[domain]=veeplay.com");
		obj = ((Object) (((StringBuilder) (obj5)).toString()));
		obj5 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj5)).append(((String) (obj)));
		((StringBuilder) (obj5)).append("&app[ver]=");
		((StringBuilder) (obj5)).append(((String) (obj4)));
		obj = ((Object) (((StringBuilder) (obj5)).toString()));
		obj4 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj4)).append(((String) (obj)));
		((StringBuilder) (obj4)).append("&app[bundle]=");
		((StringBuilder) (obj4)).append(((String) (obj3)));
		obj3 = ((Object) (((StringBuilder) (obj4)).toString()));
		try
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append(((String) (obj3)));
			((StringBuilder) (obj)).append("&app[storeurl]=");
			((StringBuilder) (obj)).append(URLEncoder.encode("http://veeplay.com", "UTF-8"));
			obj = ((Object) (((StringBuilder) (obj)).toString()));
		}
	//* 393  753:astore_1        
	//* 394  754:goto            98
		// Misplaced declaration of an exception variable
		catch(UnsupportedEncodingException unsupportedencodingexception1)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append(((String) (obj3)));
			((StringBuilder) (obj)).append("&app[storeurl]=http://veeplay.com");
			obj = ((Object) (((StringBuilder) (obj)).toString()));
		}
		obj3 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj3)).append(((String) (obj)));
		((StringBuilder) (obj3)).append("&device[os]=Android");
		obj = ((Object) (((StringBuilder) (obj3)).toString()));
		obj3 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj3)).append(((String) (obj)));
		((StringBuilder) (obj3)).append("&device[osv]=");
		((StringBuilder) (obj3)).append(android.os.Build.VERSION.RELEASE);
		obj = ((Object) (((StringBuilder) (obj3)).toString()));
		obj3 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj3)).append(((String) (obj)));
		((StringBuilder) (obj3)).append("&device[make]=");
		((StringBuilder) (obj3)).append(((String) (obj2)));
		obj = ((Object) (((StringBuilder) (obj3)).toString()));
		obj2 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj2)).append(((String) (obj)));
		((StringBuilder) (obj2)).append("&device[model]=");
		((StringBuilder) (obj2)).append(s);
		s = ((StringBuilder) (obj2)).toString();
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append(s);
		((StringBuilder) (obj)).append("&device[devicetype]=1");
		s = ((StringBuilder) (obj)).toString();
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append(s);
		((StringBuilder) (obj)).append("&device[ifa]=");
		((StringBuilder) (obj)).append(s1);
		s = ((StringBuilder) (obj)).toString();
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append(s);
		((StringBuilder) (obj)).append("&device[dnt]=0");
		s = ((StringBuilder) (obj)).toString();
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append(s);
		((StringBuilder) (obj)).append("&device[didsha1]=");
		((StringBuilder) (obj)).append(sha1("android_id"));
		s = ((StringBuilder) (obj)).toString();
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append(s);
		((StringBuilder) (obj)).append("&ip_addr=");
		((StringBuilder) (obj)).append(getIpAddress());
		s = ((StringBuilder) (obj)).toString();
		try
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append(s);
			((StringBuilder) (obj)).append("&device[ua]=");
			((StringBuilder) (obj)).append(URLEncoder.encode(((String) (obj1)), "UTF-8"));
			obj = ((Object) (((StringBuilder) (obj)).toString()));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			((UnsupportedEncodingException) (obj)).printStackTrace();
			return s;
		}
		return ((String) (obj));
	//* 395  757:astore_3        
	//* 396  758:goto            368
	}

	private String advertisingIdentifier;
	private Context mContext;
}
