// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.*;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.irobot.home:
//			WizardFragmentActivity

class WizardFragmentActivity$a extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
label0:
		{
label1:
			{
				context = ((Context) (intent.getAction()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #30  <Method String Intent.getAction()>
	//    2    4:astore_1        
				if(!((String) (context)).equals("android.net.wifi.SCAN_RESULTS"))
					break label0;
	//    3    5:aload_1         
	//    4    6:ldc1            #32  <String "android.net.wifi.SCAN_RESULTS">
	//    5    8:invokevirtual   #38  <Method boolean String.equals(Object)>
	//    6   11:ifeq            280
				if(a.B != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #14  <Field WizardFragmentActivity a>
	//*   9   18:getfield        #42  <Field ScanResult WizardFragmentActivity.B>
	//*  10   21:ifnull          25
					return;
	//   11   24:return          
				try
				{
					context = ((Context) (a.C.getScanResults().iterator()));
	//   12   25:aload_0         
	//   13   26:getfield        #14  <Field WizardFragmentActivity a>
	//   14   29:getfield        #46  <Field WifiManager WizardFragmentActivity.C>
	//   15   32:invokevirtual   #52  <Method List WifiManager.getScanResults()>
	//   16   35:invokeinterface #58  <Method Iterator List.iterator()>
	//   17   40:astore_1        
					do
					{
						if(!((Iterator) (context)).hasNext())
							break label1;
	//   18   41:aload_1         
	//   19   42:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   20   47:ifeq            181
						intent = ((Intent) ((ScanResult)((Iterator) (context)).next()));
	//   21   50:aload_1         
	//   22   51:invokeinterface #68  <Method Object Iterator.next()>
	//   23   56:checkcast       #70  <Class ScanResult>
	//   24   59:astore_2        
					} while(!j.j(((ScanResult) (intent)).SSID));
	//   25   60:aload_2         
	//   26   61:getfield        #74  <Field String ScanResult.SSID>
	//   27   64:invokestatic    #80  <Method boolean j.j(String)>
	//   28   67:ifeq            41
					a.B = ((ScanResult) (intent));
	//   29   70:aload_0         
	//   30   71:getfield        #14  <Field WizardFragmentActivity a>
	//   31   74:aload_2         
	//   32   75:putfield        #42  <Field ScanResult WizardFragmentActivity.B>
					a.a(((ScanResult) (intent)).BSSID, ((ScanResult) (intent)).SSID);
	//   33   78:aload_0         
	//   34   79:getfield        #14  <Field WizardFragmentActivity a>
	//   35   82:aload_2         
	//   36   83:getfield        #83  <Field String ScanResult.BSSID>
	//   37   86:aload_2         
	//   38   87:getfield        #74  <Field String ScanResult.SSID>
	//   39   90:invokevirtual   #86  <Method void WizardFragmentActivity.a(String, String)>
				}
	//*  40   93:goto            181
				// Misplaced declaration of an exception variable
				catch(Context context)
	//*  41   96:astore_1        
				{
					b = b + 1;
	//   42   97:aload_0         
	//   43   98:aload_0         
	//   44   99:getfield        #19  <Field int b>
	//   45  102:iconst_1        
	//   46  103:iadd            
	//   47  104:putfield        #19  <Field int b>
					o.e(a.w, ((SecurityException) (context)).toString());
	//   48  107:aload_0         
	//   49  108:getfield        #14  <Field WizardFragmentActivity a>
	//   50  111:getfield        #89  <Field String WizardFragmentActivity.w>
	//   51  114:aload_1         
	//   52  115:invokevirtual   #92  <Method String SecurityException.toString()>
	//   53  118:invokestatic    #97  <Method void o.e(String, String)>
					if(b == 1)
	//*  54  121:aload_0         
	//*  55  122:getfield        #19  <Field int b>
	//*  56  125:iconst_1        
	//*  57  126:icmpne          138
						j.a(6, ((SecurityException) (context)).toString());
	//   58  129:bipush          6
	//   59  131:aload_1         
	//   60  132:invokevirtual   #92  <Method String SecurityException.toString()>
	//   61  135:invokestatic    #100 <Method void j.a(int, String)>
					if(b > 5)
	//*  62  138:aload_0         
	//*  63  139:getfield        #19  <Field int b>
	//*  64  142:iconst_5        
	//*  65  143:icmple          181
					{
						intent = ((Intent) (new StringBuilder()));
	//   66  146:new             #102 <Class StringBuilder>
	//   67  149:dup             
	//   68  150:invokespecial   #103 <Method void StringBuilder()>
	//   69  153:astore_2        
						((StringBuilder) (intent)).append("Number of security exceptions in WizardFragmentActivity exceeded ");
	//   70  154:aload_2         
	//   71  155:ldc1            #105 <String "Number of security exceptions in WizardFragmentActivity exceeded ">
	//   72  157:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   73  160:pop             
						((StringBuilder) (intent)).append(b);
	//   74  161:aload_2         
	//   75  162:aload_0         
	//   76  163:getfield        #19  <Field int b>
	//   77  166:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//   78  169:pop             
						j.a(6, ((StringBuilder) (intent)).toString());
	//   79  170:bipush          6
	//   80  172:aload_2         
	//   81  173:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   82  176:invokestatic    #100 <Method void j.a(int, String)>
						throw context;
	//   83  179:aload_1         
	//   84  180:athrow          
					}
				}
			}
			if(a.B != null && WizardFragmentActivity.a(a))
	//*  85  181:aload_0         
	//*  86  182:getfield        #14  <Field WizardFragmentActivity a>
	//*  87  185:getfield        #42  <Field ScanResult WizardFragmentActivity.B>
	//*  88  188:ifnull          268
	//*  89  191:aload_0         
	//*  90  192:getfield        #14  <Field WizardFragmentActivity a>
	//*  91  195:invokestatic    #116 <Method boolean WizardFragmentActivity.a(WizardFragmentActivity)>
	//*  92  198:ifne            204
	//*  93  201:goto            268
			{
				if(b > 0)
	//*  94  204:aload_0         
	//*  95  205:getfield        #19  <Field int b>
	//*  96  208:ifle            255
				{
					context = ((Context) (new StringBuilder()));
	//   97  211:new             #102 <Class StringBuilder>
	//   98  214:dup             
	//   99  215:invokespecial   #103 <Method void StringBuilder()>
	//  100  218:astore_1        
					((StringBuilder) (context)).append("Connected to robot after ");
	//  101  219:aload_1         
	//  102  220:ldc1            #118 <String "Connected to robot after ">
	//  103  222:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//  104  225:pop             
					((StringBuilder) (context)).append(b);
	//  105  226:aload_1         
	//  106  227:aload_0         
	//  107  228:getfield        #19  <Field int b>
	//  108  231:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//  109  234:pop             
					((StringBuilder) (context)).append(" security exceptions.");
	//  110  235:aload_1         
	//  111  236:ldc1            #120 <String " security exceptions.">
	//  112  238:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//  113  241:pop             
					j.a(4, ((StringBuilder) (context)).toString());
	//  114  242:iconst_4        
	//  115  243:aload_1         
	//  116  244:invokevirtual   #113 <Method String StringBuilder.toString()>
	//  117  247:invokestatic    #100 <Method void j.a(int, String)>
					b = 0;
	//  118  250:aload_0         
	//  119  251:iconst_0        
	//  120  252:putfield        #19  <Field int b>
				}
				o.c(a.w, "Done connecting to robot in WifiReceiver.");
	//  121  255:aload_0         
	//  122  256:getfield        #14  <Field WizardFragmentActivity a>
	//  123  259:getfield        #89  <Field String WizardFragmentActivity.w>
	//  124  262:ldc1            #122 <String "Done connecting to robot in WifiReceiver.">
	//  125  264:invokestatic    #125 <Method void o.c(String, String)>
				return;
	//  126  267:return          
			} else
			{
				a.C.startScan();
	//  127  268:aload_0         
	//  128  269:getfield        #14  <Field WizardFragmentActivity a>
	//  129  272:getfield        #46  <Field WifiManager WizardFragmentActivity.C>
	//  130  275:invokevirtual   #128 <Method boolean WifiManager.startScan()>
	//  131  278:pop             
				return;
	//  132  279:return          
			}
		}
		if(!((String) (context)).equals("android.net.wifi.STATE_CHANGE")) goto _L2; else goto _L1
	//  133  280:aload_1         
	//  134  281:ldc1            #130 <String "android.net.wifi.STATE_CHANGE">
	//  135  283:invokevirtual   #38  <Method boolean String.equals(Object)>
	//  136  286:ifeq            464
_L1:
		intent = ((Intent) ((NetworkInfo)intent.getParcelableExtra("networkInfo")));
	//  137  289:aload_2         
	//  138  290:ldc1            #132 <String "networkInfo">
	//  139  292:invokevirtual   #136 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//  140  295:checkcast       #138 <Class NetworkInfo>
	//  141  298:astore_2        
		WizardFragmentActivity$6.a[((NetworkInfo) (intent)).getDetailedState().ordinal()];
	//  142  299:getstatic       #143 <Field int[] WizardFragmentActivity$6.a>
	//  143  302:aload_2         
	//  144  303:invokevirtual   #147 <Method android.net.NetworkInfo$DetailedState NetworkInfo.getDetailedState()>
	//  145  306:invokevirtual   #153 <Method int android.net.NetworkInfo$DetailedState.ordinal()>
	//  146  309:iaload          
		JVM INSTR tableswitch 1 6: default 348
	//	               1 433
	//	               2 425
	//	               3 394
	//	               4 377
	//	               5 363
	//	               6 349;
	//  147  310:tableswitch     1 6: default 348
	//	               1 433
	//	               2 425
	//	               3 394
	//	               4 377
	//	               5 363
	//	               6 349
		   goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
		return;
	//  148  348:return          
_L9:
		context = ((Context) (a.w));
	//  149  349:aload_0         
	//  150  350:getfield        #14  <Field WizardFragmentActivity a>
	//  151  353:getfield        #89  <Field String WizardFragmentActivity.w>
	//  152  356:astore_1        
		intent = "FAILED";
	//  153  357:ldc1            #155 <String "FAILED">
	//  154  359:astore_2        
		  goto _L10
	//* 155  360:goto            388
_L8:
		context = ((Context) (a.w));
	//  156  363:aload_0         
	//  157  364:getfield        #14  <Field WizardFragmentActivity a>
	//  158  367:getfield        #89  <Field String WizardFragmentActivity.w>
	//  159  370:astore_1        
		intent = "DISCONNECTING";
	//  160  371:ldc1            #157 <String "DISCONNECTING">
	//  161  373:astore_2        
		  goto _L10
	//* 162  374:goto            388
_L7:
		context = ((Context) (a.w));
	//  163  377:aload_0         
	//  164  378:getfield        #14  <Field WizardFragmentActivity a>
	//  165  381:getfield        #89  <Field String WizardFragmentActivity.w>
	//  166  384:astore_1        
		intent = "CONNECTING";
	//  167  385:ldc1            #159 <String "CONNECTING">
	//  168  387:astore_2        
_L10:
		o.b(((String) (context)), ((String) (intent)));
	//  169  388:aload_1         
	//  170  389:aload_2         
	//  171  390:invokestatic    #161 <Method void o.b(String, String)>
		return;
	//  172  393:return          
_L6:
		o.b(a.w, "OBTAINING_IPADDR");
	//  173  394:aload_0         
	//  174  395:getfield        #14  <Field WizardFragmentActivity a>
	//  175  398:getfield        #89  <Field String WizardFragmentActivity.w>
	//  176  401:ldc1            #163 <String "OBTAINING_IPADDR">
	//  177  403:invokestatic    #161 <Method void o.b(String, String)>
		if(a.B != null)
	//* 178  406:aload_0         
	//* 179  407:getfield        #14  <Field WizardFragmentActivity a>
	//* 180  410:getfield        #42  <Field ScanResult WizardFragmentActivity.B>
	//* 181  413:ifnull          508
		{
			a.E = true;
	//  182  416:aload_0         
	//  183  417:getfield        #14  <Field WizardFragmentActivity a>
	//  184  420:iconst_1        
	//  185  421:putfield        #167 <Field boolean WizardFragmentActivity.E>
			return;
	//  186  424:return          
		}
		  goto _L11
_L5:
		a.q();
	//  187  425:aload_0         
	//  188  426:getfield        #14  <Field WizardFragmentActivity a>
	//  189  429:invokevirtual   #170 <Method void WizardFragmentActivity.q()>
		return;
	//  190  432:return          
_L4:
		String s;
		s = a.w;
	//  191  433:aload_0         
	//  192  434:getfield        #14  <Field WizardFragmentActivity a>
	//  193  437:getfield        #89  <Field String WizardFragmentActivity.w>
	//  194  440:astore_3        
		context = ((Context) (new StringBuilder()));
	//  195  441:new             #102 <Class StringBuilder>
	//  196  444:dup             
	//  197  445:invokespecial   #103 <Method void StringBuilder()>
	//  198  448:astore_1        
		((StringBuilder) (context)).append("Disconnected. Reason : ");
	//  199  449:aload_1         
	//  200  450:ldc1            #172 <String "Disconnected. Reason : ">
	//  201  452:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//  202  455:pop             
		intent = ((Intent) (((NetworkInfo) (intent)).getReason()));
	//  203  456:aload_2         
	//  204  457:invokevirtual   #175 <Method String NetworkInfo.getReason()>
	//  205  460:astore_2        
		  goto _L12
	//* 206  461:goto            494
_L2:
		s = a.w;
	//  207  464:aload_0         
	//  208  465:getfield        #14  <Field WizardFragmentActivity a>
	//  209  468:getfield        #89  <Field String WizardFragmentActivity.w>
	//  210  471:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//  211  472:new             #102 <Class StringBuilder>
	//  212  475:dup             
	//  213  476:invokespecial   #103 <Method void StringBuilder()>
	//  214  479:astore          4
		stringbuilder.append("Unhandled action : ");
	//  215  481:aload           4
	//  216  483:ldc1            #177 <String "Unhandled action : ">
	//  217  485:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//  218  488:pop             
		intent = ((Intent) (context));
	//  219  489:aload_1         
	//  220  490:astore_2        
		context = ((Context) (stringbuilder));
	//  221  491:aload           4
	//  222  493:astore_1        
_L12:
		((StringBuilder) (context)).append(((String) (intent)));
	//  223  494:aload_1         
	//  224  495:aload_2         
	//  225  496:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//  226  499:pop             
		o.b(s, ((StringBuilder) (context)).toString());
	//  227  500:aload_3         
	//  228  501:aload_1         
	//  229  502:invokevirtual   #113 <Method String StringBuilder.toString()>
	//  230  505:invokestatic    #161 <Method void o.b(String, String)>
_L11:
	//  231  508:return          
	}

	final WizardFragmentActivity a;
	private int b;

	WizardFragmentActivity$a(WizardFragmentActivity wizardfragmentactivity)
	{
		a = wizardfragmentactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field WizardFragmentActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void BroadcastReceiver()>
		b = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #19  <Field int b>
	//    8   14:return          
	}
}
