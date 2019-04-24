// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.*;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.google.firebase.messaging:
//			b, d, e, RemoteMessage

public class FirebaseMessagingService extends zzb
{

	public FirebaseMessagingService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void zzb()>
	//    2    4:return          
	}

	static void a(Bundle bundle)
	{
		bundle = ((Bundle) (bundle.keySet().iterator()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method Set Bundle.keySet()>
	//    2    4:invokeinterface #34  <Method Iterator Set.iterator()>
	//    3    9:astore_0        
		do
		{
			if(!((Iterator) (bundle)).hasNext())
				break;
	//    4   10:aload_0         
	//    5   11:invokeinterface #40  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            51
			String s = (String)((Iterator) (bundle)).next();
	//    7   19:aload_0         
	//    8   20:invokeinterface #44  <Method Object Iterator.next()>
	//    9   25:checkcast       #46  <Class String>
	//   10   28:astore_1        
			if(s != null && s.startsWith("google.c."))
	//*  11   29:aload_1         
	//*  12   30:ifnull          10
	//*  13   33:aload_1         
	//*  14   34:ldc1            #48  <String "google.c.">
	//*  15   36:invokevirtual   #52  <Method boolean String.startsWith(String)>
	//*  16   39:ifeq            10
				((Iterator) (bundle)).remove();
	//   17   42:aload_0         
	//   18   43:invokeinterface #55  <Method void Iterator.remove()>
		} while(true);
	//   19   48:goto            10
	//   20   51:return          
	}

	protected final Intent a(Intent intent)
	{
		return y.a().b();
	//    0    0:invokestatic    #61  <Method y y.a()>
	//    1    3:invokevirtual   #64  <Method Intent y.b()>
	//    2    6:areturn         
	}

	public void a()
	{
	//    0    0:return          
	}

	public void a(RemoteMessage remotemessage)
	{
	//    0    0:return          
	}

	public void a(String s)
	{
	//    0    0:return          
	}

	public void a(String s, Exception exception)
	{
	//    0    0:return          
	}

	public final void b(Intent intent)
	{
		byte byte0;
		Object obj;
		String s;
		obj = ((Object) (intent.getAction()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #80  <Method String Intent.getAction()>
	//    2    4:astore          5
		if(!"com.google.android.c2dm.intent.RECEIVE".equals(obj) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(obj))
	//*   3    6:ldc1            #82  <String "com.google.android.c2dm.intent.RECEIVE">
	//*   4    8:aload           5
	//*   5   10:invokevirtual   #86  <Method boolean String.equals(Object)>
	//*   6   13:ifne            115
	//*   7   16:ldc1            #88  <String "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT">
	//*   8   18:aload           5
	//*   9   20:invokevirtual   #86  <Method boolean String.equals(Object)>
	//*  10   23:ifeq            29
	//*  11   26:goto            115
		{
			if("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(obj))
	//*  12   29:ldc1            #90  <String "com.google.firebase.messaging.NOTIFICATION_DISMISS">
	//*  13   31:aload           5
	//*  14   33:invokevirtual   #86  <Method boolean String.equals(Object)>
	//*  15   36:ifeq            51
			{
				if(com.google.firebase.messaging.b.e(intent))
	//*  16   39:aload_1         
	//*  17   40:invokestatic    #96  <Method boolean com.google.firebase.messaging.b.e(Intent)>
	//*  18   43:ifeq            114
				{
					com.google.firebase.messaging.b.c(intent);
	//   19   46:aload_1         
	//   20   47:invokestatic    #99  <Method void b.c(Intent)>
					return;
	//   21   50:return          
				}
			} else
			{
				if("com.google.firebase.messaging.NEW_TOKEN".equals(obj))
	//*  22   51:ldc1            #101 <String "com.google.firebase.messaging.NEW_TOKEN">
	//*  23   53:aload           5
	//*  24   55:invokevirtual   #86  <Method boolean String.equals(Object)>
	//*  25   58:ifeq            72
				{
					b(intent.getStringExtra("token"));
	//   26   61:aload_0         
	//   27   62:aload_1         
	//   28   63:ldc1            #103 <String "token">
	//   29   65:invokevirtual   #107 <Method String Intent.getStringExtra(String)>
	//   30   68:invokevirtual   #109 <Method void b(String)>
					return;
	//   31   71:return          
				}
				intent = ((Intent) (String.valueOf(((Object) (intent.getAction())))));
	//   32   72:aload_1         
	//   33   73:invokevirtual   #80  <Method String Intent.getAction()>
	//   34   76:invokestatic    #113 <Method String String.valueOf(Object)>
	//   35   79:astore_1        
				if(((String) (intent)).length() != 0)
	//*  36   80:aload_1         
	//*  37   81:invokevirtual   #117 <Method int String.length()>
	//*  38   84:ifeq            97
					intent = ((Intent) ("Unknown intent action: ".concat(((String) (intent)))));
	//   39   87:ldc1            #119 <String "Unknown intent action: ">
	//   40   89:aload_1         
	//   41   90:invokevirtual   #122 <Method String String.concat(String)>
	//   42   93:astore_1        
				else
	//*  43   94:goto            107
					intent = ((Intent) (new String("Unknown intent action: ")));
	//   44   97:new             #46  <Class String>
	//   45  100:dup             
	//   46  101:ldc1            #119 <String "Unknown intent action: ">
	//   47  103:invokespecial   #124 <Method void String(String)>
	//   48  106:astore_1        
				Log.d("FirebaseMessaging", ((String) (intent)));
	//   49  107:ldc1            #126 <String "FirebaseMessaging">
	//   50  109:aload_1         
	//   51  110:invokestatic    #132 <Method int Log.d(String, String)>
	//   52  113:pop             
			}
			return;
	//   53  114:return          
		}
		s = intent.getStringExtra("google.message_id");
	//   54  115:aload_1         
	//   55  116:ldc1            #134 <String "google.message_id">
	//   56  118:invokevirtual   #107 <Method String Intent.getStringExtra(String)>
	//   57  121:astore          6
		boolean flag1 = TextUtils.isEmpty(((CharSequence) (s)));
	//   58  123:aload           6
	//   59  125:invokestatic    #140 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   60  128:istore          4
		byte0 = 2;
	//   61  130:iconst_2        
	//   62  131:istore_3        
		if(flag1)
	//*  63  132:iload           4
	//*  64  134:ifeq            146
		{
			obj = ((Object) (Tasks.forResult(((Object) (null)))));
	//   65  137:aconst_null     
	//   66  138:invokestatic    #146 <Method com.google.android.gms.tasks.Task Tasks.forResult(Object)>
	//   67  141:astore          5
		} else
	//*  68  143:goto            176
		{
			obj = ((Object) (new Bundle()));
	//   69  146:new             #24  <Class Bundle>
	//   70  149:dup             
	//   71  150:invokespecial   #147 <Method void Bundle()>
	//   72  153:astore          5
			((Bundle) (obj)).putString("google.message_id", s);
	//   73  155:aload           5
	//   74  157:ldc1            #134 <String "google.message_id">
	//   75  159:aload           6
	//   76  161:invokevirtual   #151 <Method void Bundle.putString(String, String)>
			obj = ((Object) (e.a(((android.content.Context) (this))).a(2, ((Bundle) (obj)))));
	//   77  164:aload_0         
	//   78  165:invokestatic    #156 <Method e e.a(android.content.Context)>
	//   79  168:iconst_2        
	//   80  169:aload           5
	//   81  171:invokevirtual   #159 <Method com.google.android.gms.tasks.Task e.a(int, Bundle)>
	//   82  174:astore          5
		}
		if(!TextUtils.isEmpty(((CharSequence) (s)))) goto _L2; else goto _L1
	//   83  176:aload           6
	//   84  178:invokestatic    #140 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   85  181:ifeq            189
_L1:
		boolean flag;
		flag = false;
	//   86  184:iconst_0        
	//   87  185:istore_2        
		break; /* Loop/switch isn't completed */
	//   88  186:goto            298
_L2:
		if(b.contains(((Object) (s))))
	//*  89  189:getstatic       #17  <Field Queue b>
	//*  90  192:aload           6
	//*  91  194:invokeinterface #164 <Method boolean Queue.contains(Object)>
	//*  92  199:ifeq            262
		{
			if(Log.isLoggable("FirebaseMessaging", 3))
	//*  93  202:ldc1            #126 <String "FirebaseMessaging">
	//*  94  204:iconst_3        
	//*  95  205:invokestatic    #168 <Method boolean Log.isLoggable(String, int)>
	//*  96  208:ifeq            257
			{
				s = String.valueOf(((Object) (s)));
	//   97  211:aload           6
	//   98  213:invokestatic    #113 <Method String String.valueOf(Object)>
	//   99  216:astore          6
				if(s.length() != 0)
	//* 100  218:aload           6
	//* 101  220:invokevirtual   #117 <Method int String.length()>
	//* 102  223:ifeq            238
					s = "Received duplicate message: ".concat(s);
	//  103  226:ldc1            #170 <String "Received duplicate message: ">
	//  104  228:aload           6
	//  105  230:invokevirtual   #122 <Method String String.concat(String)>
	//  106  233:astore          6
				else
	//* 107  235:goto            249
					s = new String("Received duplicate message: ");
	//  108  238:new             #46  <Class String>
	//  109  241:dup             
	//  110  242:ldc1            #170 <String "Received duplicate message: ">
	//  111  244:invokespecial   #124 <Method void String(String)>
	//  112  247:astore          6
				Log.d("FirebaseMessaging", s);
	//  113  249:ldc1            #126 <String "FirebaseMessaging">
	//  114  251:aload           6
	//  115  253:invokestatic    #132 <Method int Log.d(String, String)>
	//  116  256:pop             
			}
			flag = true;
	//  117  257:iconst_1        
	//  118  258:istore_2        
			break; /* Loop/switch isn't completed */
	//  119  259:goto            298
		}
		if(b.size() >= 10)
	//* 120  262:getstatic       #17  <Field Queue b>
	//* 121  265:invokeinterface #173 <Method int Queue.size()>
	//* 122  270:bipush          10
	//* 123  272:icmplt          284
			b.remove();
	//  124  275:getstatic       #17  <Field Queue b>
	//  125  278:invokeinterface #175 <Method Object Queue.remove()>
	//  126  283:pop             
		b.add(((Object) (s)));
	//  127  284:getstatic       #17  <Field Queue b>
	//  128  287:aload           6
	//  129  289:invokeinterface #178 <Method boolean Queue.add(Object)>
	//  130  294:pop             
		if(true) goto _L1; else goto _L3
	//  131  295:goto            184
_L3:
		if(!flag)
	//* 132  298:iload_2         
	//* 133  299:ifne            648
		{
			int i;
			Object obj1;
label0:
			{
				String s1 = intent.getStringExtra("message_type");
	//  134  302:aload_1         
	//  135  303:ldc1            #180 <String "message_type">
	//  136  305:invokevirtual   #107 <Method String Intent.getStringExtra(String)>
	//  137  308:astore          7
				obj1 = ((Object) (s1));
	//  138  310:aload           7
	//  139  312:astore          6
				if(s1 == null)
	//* 140  314:aload           7
	//* 141  316:ifnonnull       323
					obj1 = "gcm";
	//  142  319:ldc1            #182 <String "gcm">
	//  143  321:astore          6
				i = ((String) (obj1)).hashCode();
	//  144  323:aload           6
	//  145  325:invokevirtual   #185 <Method int String.hashCode()>
	//  146  328:istore_2        
				if(i != 0x85120eb2)
	//* 147  329:iload_2         
	//* 148  330:ldc1            #186 <Int 0x85120eb2>
	//* 149  332:icmpeq          401
				{
					if(i != 0x18f11)
	//* 150  335:iload_2         
	//* 151  336:ldc1            #187 <Int 0x18f11>
	//* 152  338:icmpeq          386
					{
						if(i != 0x308f3e91)
	//* 153  341:iload_2         
	//* 154  342:ldc1            #188 <Int 0x308f3e91>
	//* 155  344:icmpeq          371
						{
							if(i == 0x3090df23 && ((String) (obj1)).equals("send_event"))
	//* 156  347:iload_2         
	//* 157  348:ldc1            #189 <Int 0x3090df23>
	//* 158  350:icmpeq          356
	//* 159  353:goto            416
	//* 160  356:aload           6
	//* 161  358:ldc1            #191 <String "send_event">
	//* 162  360:invokevirtual   #86  <Method boolean String.equals(Object)>
	//* 163  363:ifeq            416
							{
								i = ((int) (byte0));
	//  164  366:iload_3         
	//  165  367:istore_2        
								break label0;
	//  166  368:goto            418
							}
						} else
						if(((String) (obj1)).equals("send_error"))
	//* 167  371:aload           6
	//* 168  373:ldc1            #193 <String "send_error">
	//* 169  375:invokevirtual   #86  <Method boolean String.equals(Object)>
	//* 170  378:ifeq            416
						{
							i = 3;
	//  171  381:iconst_3        
	//  172  382:istore_2        
							break label0;
	//  173  383:goto            418
						}
					} else
					if(((String) (obj1)).equals("gcm"))
	//* 174  386:aload           6
	//* 175  388:ldc1            #182 <String "gcm">
	//* 176  390:invokevirtual   #86  <Method boolean String.equals(Object)>
	//* 177  393:ifeq            416
					{
						i = 0;
	//  178  396:iconst_0        
	//  179  397:istore_2        
						break label0;
	//  180  398:goto            418
					}
				} else
				if(((String) (obj1)).equals("deleted_messages"))
	//* 181  401:aload           6
	//* 182  403:ldc1            #195 <String "deleted_messages">
	//* 183  405:invokevirtual   #86  <Method boolean String.equals(Object)>
	//* 184  408:ifeq            416
				{
					i = 1;
	//  185  411:iconst_1        
	//  186  412:istore_2        
					break label0;
	//  187  413:goto            418
				}
				i = -1;
	//  188  416:iconst_m1       
	//  189  417:istore_2        
			}
			switch(i)
	//* 190  418:iload_2         
			{
	//* 191  419:tableswitch     0 3: default 448
	//	               0 538
	//	               1 531
	//	               2 518
	//	               3 471
			default:
				intent = ((Intent) (String.valueOf(obj1)));
	//  192  448:aload           6
	//  193  450:invokestatic    #113 <Method String String.valueOf(Object)>
	//  194  453:astore_1        
				Object obj2;
				if(((String) (intent)).length() != 0)
	//* 195  454:aload_1         
	//* 196  455:invokevirtual   #117 <Method int String.length()>
	//* 197  458:ifeq            631
					intent = ((Intent) ("Received message with unknown type: ".concat(((String) (intent)))));
	//  198  461:ldc1            #197 <String "Received message with unknown type: ">
	//  199  463:aload_1         
	//  200  464:invokevirtual   #122 <Method String String.concat(String)>
	//  201  467:astore_1        
				else
	//* 202  468:goto            641
	//* 203  471:aload_1         
	//* 204  472:ldc1            #134 <String "google.message_id">
	//* 205  474:invokevirtual   #107 <Method String Intent.getStringExtra(String)>
	//* 206  477:astore          7
	//* 207  479:aload           7
	//* 208  481:astore          6
	//* 209  483:aload           7
	//* 210  485:ifnonnull       496
	//* 211  488:aload_1         
	//* 212  489:ldc1            #199 <String "message_id">
	//* 213  491:invokevirtual   #107 <Method String Intent.getStringExtra(String)>
	//* 214  494:astore          6
	//* 215  496:aload_0         
	//* 216  497:aload           6
	//* 217  499:new             #201 <Class d>
	//* 218  502:dup             
	//* 219  503:aload_1         
	//* 220  504:ldc1            #203 <String "error">
	//* 221  506:invokevirtual   #107 <Method String Intent.getStringExtra(String)>
	//* 222  509:invokespecial   #204 <Method void d(String)>
	//* 223  512:invokevirtual   #206 <Method void a(String, Exception)>
	//* 224  515:goto            648
	//* 225  518:aload_0         
	//* 226  519:aload_1         
	//* 227  520:ldc1            #134 <String "google.message_id">
	//* 228  522:invokevirtual   #107 <Method String Intent.getStringExtra(String)>
	//* 229  525:invokevirtual   #208 <Method void a(String)>
	//* 230  528:goto            648
	//* 231  531:aload_0         
	//* 232  532:invokevirtual   #210 <Method void a()>
	//* 233  535:goto            648
	//* 234  538:aload_1         
	//* 235  539:invokestatic    #96  <Method boolean com.google.firebase.messaging.b.e(Intent)>
	//* 236  542:ifeq            549
	//* 237  545:aload_1         
	//* 238  546:invokestatic    #212 <Method void b.a(Intent)>
	//* 239  549:aload_1         
	//* 240  550:invokevirtual   #216 <Method Bundle Intent.getExtras()>
	//* 241  553:astore          7
	//* 242  555:aload           7
	//* 243  557:astore          6
	//* 244  559:aload           7
	//* 245  561:ifnonnull       573
	//* 246  564:new             #24  <Class Bundle>
	//* 247  567:dup             
	//* 248  568:invokespecial   #147 <Method void Bundle()>
	//* 249  571:astore          6
	//* 250  573:aload           6
	//* 251  575:ldc1            #218 <String "android.support.content.wakelockid">
	//* 252  577:invokevirtual   #220 <Method void Bundle.remove(String)>
	//* 253  580:aload           6
	//* 254  582:invokestatic    #225 <Method boolean e.a(Bundle)>
	//* 255  585:ifeq            615
	//* 256  588:new             #222 <Class com.google.firebase.messaging.e>
	//* 257  591:dup             
	//* 258  592:aload_0         
	//* 259  593:invokespecial   #228 <Method void com.google.firebase.messaging.e(android.content.Context)>
	//* 260  596:aload           6
	//* 261  598:invokevirtual   #230 <Method boolean e.c(Bundle)>
	//* 262  601:ifne            648
	//* 263  604:aload_1         
	//* 264  605:invokestatic    #96  <Method boolean com.google.firebase.messaging.b.e(Intent)>
	//* 265  608:ifeq            615
	//* 266  611:aload_1         
	//* 267  612:invokestatic    #232 <Method void b.d(Intent)>
	//* 268  615:aload_0         
	//* 269  616:new             #234 <Class RemoteMessage>
	//* 270  619:dup             
	//* 271  620:aload           6
	//* 272  622:invokespecial   #236 <Method void RemoteMessage(Bundle)>
	//* 273  625:invokevirtual   #238 <Method void a(RemoteMessage)>
	//* 274  628:goto            648
					intent = ((Intent) (new String("Received message with unknown type: ")));
	//  275  631:new             #46  <Class String>
	//  276  634:dup             
	//  277  635:ldc1            #197 <String "Received message with unknown type: ">
	//  278  637:invokespecial   #124 <Method void String(String)>
	//  279  640:astore_1        
				Log.w("FirebaseMessaging", ((String) (intent)));
	//  280  641:ldc1            #126 <String "FirebaseMessaging">
	//  281  643:aload_1         
	//  282  644:invokestatic    #241 <Method int Log.w(String, String)>
	//  283  647:pop             
				break;

			case 3: // '\003'
				obj2 = ((Object) (intent.getStringExtra("google.message_id")));
				obj1 = obj2;
				if(obj2 == null)
					obj1 = ((Object) (intent.getStringExtra("message_id")));
				a(((String) (obj1)), ((Exception) (new d(intent.getStringExtra("error")))));
				break;

			case 2: // '\002'
				a(intent.getStringExtra("google.message_id"));
				break;

			case 1: // '\001'
				a();
				break;

			case 0: // '\0'
				if(com.google.firebase.messaging.b.e(intent))
					com.google.firebase.messaging.b.a(intent);
				obj2 = ((Object) (intent.getExtras()));
				obj1 = obj2;
				if(obj2 == null)
					obj1 = ((Object) (new Bundle()));
				((Bundle) (obj1)).remove("android.support.content.wakelockid");
				if(e.a(((Bundle) (obj1))))
				{
					if((new com.google.firebase.messaging.e(((android.content.Context) (this)))).c(((Bundle) (obj1))))
						break;
					if(com.google.firebase.messaging.b.e(intent))
						com.google.firebase.messaging.b.d(intent);
				}
				a(new RemoteMessage(((Bundle) (obj1))));
				break;
			}
		}
		try
		{
			Tasks.await(((com.google.android.gms.tasks.Task) (obj)), 1L, TimeUnit.SECONDS);
	//  284  648:aload           5
	//  285  650:lconst_1        
	//  286  651:getstatic       #247 <Field TimeUnit TimeUnit.SECONDS>
	//  287  654:invokestatic    #251 <Method Object Tasks.await(com.google.android.gms.tasks.Task, long, TimeUnit)>
	//  288  657:pop             
			return;
	//  289  658:return          
		}
		// Misplaced declaration of an exception variable
		catch(Intent intent)
	//* 290  659:astore_1        
		{
			intent = ((Intent) (String.valueOf(((Object) (intent)))));
	//  291  660:aload_1         
	//  292  661:invokestatic    #113 <Method String String.valueOf(Object)>
	//  293  664:astore_1        
		}
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (intent))).length() + 20)));
	//  294  665:new             #253 <Class StringBuilder>
	//  295  668:dup             
	//  296  669:aload_1         
	//  297  670:invokestatic    #113 <Method String String.valueOf(Object)>
	//  298  673:invokevirtual   #117 <Method int String.length()>
	//  299  676:bipush          20
	//  300  678:iadd            
	//  301  679:invokespecial   #254 <Method void StringBuilder(int)>
	//  302  682:astore          5
		((StringBuilder) (obj)).append("Message ack failed: ");
	//  303  684:aload           5
	//  304  686:ldc2            #256 <String "Message ack failed: ">
	//  305  689:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//  306  692:pop             
		((StringBuilder) (obj)).append(((String) (intent)));
	//  307  693:aload           5
	//  308  695:aload_1         
	//  309  696:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//  310  699:pop             
		Log.w("FirebaseMessaging", ((StringBuilder) (obj)).toString());
	//  311  700:ldc1            #126 <String "FirebaseMessaging">
	//  312  702:aload           5
	//  313  704:invokevirtual   #263 <Method String StringBuilder.toString()>
	//  314  707:invokestatic    #241 <Method int Log.w(String, String)>
	//  315  710:pop             
		return;
	//  316  711:return          
	}

	public void b(String s)
	{
	//    0    0:return          
	}

	public final boolean c(Intent intent)
	{
		android.app.PendingIntent.CanceledException canceledexception;
		if("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(((Object) (intent.getAction()))))
	//*   0    0:ldc2            #267 <String "com.google.firebase.messaging.NOTIFICATION_OPEN">
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #80  <Method String Intent.getAction()>
	//*   3    7:invokevirtual   #86  <Method boolean String.equals(Object)>
	//*   4   10:ifeq            57
		{
			PendingIntent pendingintent = (PendingIntent)intent.getParcelableExtra("pending_intent");
	//    5   13:aload_1         
	//    6   14:ldc2            #269 <String "pending_intent">
	//    7   17:invokevirtual   #273 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//    8   20:checkcast       #275 <Class PendingIntent>
	//    9   23:astore_2        
			if(pendingintent != null)
	//*  10   24:aload_2         
	//*  11   25:ifnull          44
				try
				{
					pendingintent.send();
	//   12   28:aload_2         
	//   13   29:invokevirtual   #278 <Method void PendingIntent.send()>
				}
	//*  14   32:goto            44
	//*  15   35:ldc1            #126 <String "FirebaseMessaging">
	//*  16   37:ldc2            #280 <String "Notification pending intent canceled">
	//*  17   40:invokestatic    #282 <Method int Log.e(String, String)>
	//*  18   43:pop             
	//*  19   44:aload_1         
	//*  20   45:invokestatic    #96  <Method boolean com.google.firebase.messaging.b.e(Intent)>
	//*  21   48:ifeq            55
	//*  22   51:aload_1         
	//*  23   52:invokestatic    #284 <Method void b.b(Intent)>
	//*  24   55:iconst_1        
	//*  25   56:ireturn         
	//*  26   57:iconst_0        
	//*  27   58:ireturn         
				// Misplaced declaration of an exception variable
				catch(android.app.PendingIntent.CanceledException canceledexception)
				{
					Log.e("FirebaseMessaging", "Notification pending intent canceled");
				}
			if(com.google.firebase.messaging.b.e(intent))
				com.google.firebase.messaging.b.b(intent);
			return true;
		} else
		{
			return false;
		}
	//*  28   59:astore_2        
	//*  29   60:goto            35
	}

	private static final Queue b = new ArrayDeque(10);

	static 
	{
	//    0    0:new             #11  <Class ArrayDeque>
	//    1    3:dup             
	//    2    4:bipush          10
	//    3    6:invokespecial   #15  <Method void ArrayDeque(int)>
	//    4    9:putstatic       #17  <Field Queue b>
	//*   5   12:return          
	}
}
