// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.app.*;
import android.content.Context;
import android.content.Intent;
import com.mixpanel.android.a.a;
import com.mixpanel.android.a.f;
import com.mixpanel.android.b.l;
import com.mixpanel.android.takeoverinapp.TakeoverInAppActivity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
import org.json.*;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			j, a, n, InAppNotification, 
//			e, c, h, UpdateDisplayState, 
//			g

private class j$d
	implements j$c
{

	private void a(InAppNotification inappnotification, Activity activity)
	{
		if(android.os.d.VERSION.SDK_INT < 16)
	//*   0    0:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmpge          16
		{
			com.mixpanel.android.a.f.a("MixpanelAPI.API", "Will not show notifications, os version is too low.");
	//    3    8:ldc1            #37  <String "MixpanelAPI.API">
	//    4   10:ldc1            #39  <String "Will not show notifications, os version is too low.">
	//    5   12:invokestatic    #44  <Method void f.a(String, String)>
			return;
	//    6   15:return          
		} else
		{
			activity.runOnUiThread(new Runnable(inappnotification, activity) {

				public void run()
				{
					ReentrantLock reentrantlock;
					reentrantlock = com.mixpanel.android.mpmetrics.UpdateDisplayState.a();
				//    0    0:invokestatic    #42  <Method ReentrantLock com.mixpanel.android.mpmetrics.UpdateDisplayState.a()>
				//    1    3:astore          4
					reentrantlock.lock();
				//    2    5:aload           4
				//    3    7:invokevirtual   #47  <Method void ReentrantLock.lock()>
					if(!UpdateDisplayState.b())
						break MISSING_BLOCK_LABEL_29;
				//    4   10:invokestatic    #50  <Method boolean UpdateDisplayState.b()>
				//    5   13:ifeq            29
					com.mixpanel.android.a.f.a("MixpanelAPI.API", "DisplayState is locked, will not show notifications.");
				//    6   16:ldc1            #52  <String "MixpanelAPI.API">
				//    7   18:ldc1            #54  <String "DisplayState is locked, will not show notifications.">
				//    8   20:invokestatic    #59  <Method void f.a(String, String)>
					reentrantlock.unlock();
				//    9   23:aload           4
				//   10   25:invokevirtual   #62  <Method void ReentrantLock.unlock()>
					return;
				//   11   28:return          
					Object obj = ((Object) (a));
				//   12   29:aload_0         
				//   13   30:getfield        #25  <Field InAppNotification a>
				//   14   33:astore_3        
					InAppNotification inappnotification1;
					inappnotification1 = ((InAppNotification) (obj));
				//   15   34:aload_3         
				//   16   35:astore_2        
					if(obj != null)
						break MISSING_BLOCK_LABEL_48;
				//   17   36:aload_3         
				//   18   37:ifnonnull       48
					inappnotification1 = c.d();
				//   19   40:aload_0         
				//   20   41:getfield        #23  <Field j$d c>
				//   21   44:invokevirtual   #65  <Method InAppNotification j$d.d()>
				//   22   47:astore_2        
					if(inappnotification1 != null)
						break MISSING_BLOCK_LABEL_65;
				//   23   48:aload_2         
				//   24   49:ifnonnull       65
					com.mixpanel.android.a.f.a("MixpanelAPI.API", "No notification available, will not show.");
				//   25   52:ldc1            #52  <String "MixpanelAPI.API">
				//   26   54:ldc1            #67  <String "No notification available, will not show.">
				//   27   56:invokestatic    #59  <Method void f.a(String, String)>
					reentrantlock.unlock();
				//   28   59:aload           4
				//   29   61:invokevirtual   #62  <Method void ReentrantLock.unlock()>
					return;
				//   30   64:return          
					obj = ((Object) (inappnotification1.d()));
				//   31   65:aload_2         
				//   32   66:invokevirtual   #72  <Method InAppNotification$a InAppNotification.d()>
				//   33   69:astore_3        
					if(obj != InAppNotification.a.TAKEOVER || com.mixpanel.android.mpmetrics.c.c(b.getApplicationContext()))
						break MISSING_BLOCK_LABEL_103;
				//   34   70:aload_3         
				//   35   71:getstatic       #78  <Field InAppNotification$a InAppNotification$a.TAKEOVER>
				//   36   74:if_acmpne       103
				//   37   77:aload_0         
				//   38   78:getfield        #27  <Field Activity b>
				//   39   81:invokevirtual   #84  <Method Context Activity.getApplicationContext()>
				//   40   84:invokestatic    #89  <Method boolean c.c(Context)>
				//   41   87:ifne            103
					com.mixpanel.android.a.f.a("MixpanelAPI.API", "Application is not configured to show takeover notifications, none will be shown.");
				//   42   90:ldc1            #52  <String "MixpanelAPI.API">
				//   43   92:ldc1            #91  <String "Application is not configured to show takeover notifications, none will be shown.">
				//   44   94:invokestatic    #59  <Method void f.a(String, String)>
					reentrantlock.unlock();
				//   45   97:aload           4
				//   46   99:invokevirtual   #62  <Method void ReentrantLock.unlock()>
					return;
				//   47  102:return          
					int i = com.mixpanel.android.mpmetrics.UpdateDisplayState.a(((UpdateDisplayState.DisplayState) (new UpdateDisplayState.DisplayState.InAppNotificationState(inappnotification1, com.mixpanel.android.a.a.a(b)))), c.e(), j.h(c.a));
				//   48  103:new             #93  <Class UpdateDisplayState$DisplayState$InAppNotificationState>
				//   49  106:dup             
				//   50  107:aload_2         
				//   51  108:aload_0         
				//   52  109:getfield        #27  <Field Activity b>
				//   53  112:invokestatic    #98  <Method int a.a(Activity)>
				//   54  115:invokespecial   #101 <Method void UpdateDisplayState$DisplayState$InAppNotificationState(InAppNotification, int)>
				//   55  118:aload_0         
				//   56  119:getfield        #23  <Field j$d c>
				//   57  122:invokevirtual   #105 <Method String j$d.e()>
				//   58  125:aload_0         
				//   59  126:getfield        #23  <Field j$d c>
				//   60  129:getfield        #108 <Field j com.mixpanel.android.mpmetrics.j$d.a>
				//   61  132:invokestatic    #112 <Method String j.h(j)>
				//   62  135:invokestatic    #115 <Method int com.mixpanel.android.mpmetrics.UpdateDisplayState.a(UpdateDisplayState$DisplayState, String, String)>
				//   63  138:istore_1        
					if(i > 0)
						break MISSING_BLOCK_LABEL_156;
				//   64  139:iload_1         
				//   65  140:ifgt            156
					com.mixpanel.android.a.f.e("MixpanelAPI.API", "DisplayState Lock in inconsistent state! Please report this issue to Mixpanel");
				//   66  143:ldc1            #52  <String "MixpanelAPI.API">
				//   67  145:ldc1            #117 <String "DisplayState Lock in inconsistent state! Please report this issue to Mixpanel">
				//   68  147:invokestatic    #119 <Method void f.e(String, String)>
					reentrantlock.unlock();
				//   69  150:aload           4
				//   70  152:invokevirtual   #62  <Method void ReentrantLock.unlock()>
					return;
				//   71  155:return          
					com.mixpanel.android.mpmetrics.j._cls3.a[((InAppNotification.a) (obj)).ordinal()];
				//   72  156:getstatic       #124 <Field int[] com.mixpanel.android.mpmetrics.j$3.a>
				//   73  159:aload_3         
				//   74  160:invokevirtual   #128 <Method int InAppNotification$a.ordinal()>
				//   75  163:iaload          
					JVM INSTR tableswitch 1 2: default 457
				//				               1 245
				//				               2 188;
				//   76  164:tableswitch     1 2: default 457
				//				               1 245
				//				               2 188
					   goto _L1 _L2 _L3
_L3:
					com.mixpanel.android.a.f.a("MixpanelAPI.API", "Sending intent for takeover notification.");
				//   77  188:ldc1            #52  <String "MixpanelAPI.API">
				//   78  190:ldc1            #130 <String "Sending intent for takeover notification.">
				//   79  192:invokestatic    #59  <Method void f.a(String, String)>
					obj = ((Object) (new Intent(b.getApplicationContext(), com/mixpanel/android/takeoverinapp/TakeoverInAppActivity)));
				//   80  195:new             #132 <Class Intent>
				//   81  198:dup             
				//   82  199:aload_0         
				//   83  200:getfield        #27  <Field Activity b>
				//   84  203:invokevirtual   #84  <Method Context Activity.getApplicationContext()>
				//   85  206:ldc1            #134 <Class TakeoverInAppActivity>
				//   86  208:invokespecial   #137 <Method void Intent(Context, Class)>
				//   87  211:astore_3        
					((Intent) (obj)).addFlags(0x10000000);
				//   88  212:aload_3         
				//   89  213:ldc1            #138 <Int 0x10000000>
				//   90  215:invokevirtual   #142 <Method Intent Intent.addFlags(int)>
				//   91  218:pop             
					((Intent) (obj)).addFlags(0x20000);
				//   92  219:aload_3         
				//   93  220:ldc1            #143 <Int 0x20000>
				//   94  222:invokevirtual   #142 <Method Intent Intent.addFlags(int)>
				//   95  225:pop             
					((Intent) (obj)).putExtra("com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.INTENT_ID_KEY", i);
				//   96  226:aload_3         
				//   97  227:ldc1            #145 <String "com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.INTENT_ID_KEY">
				//   98  229:iload_1         
				//   99  230:invokevirtual   #149 <Method Intent Intent.putExtra(String, int)>
				//  100  233:pop             
					b.startActivity(((Intent) (obj)));
				//  101  234:aload_0         
				//  102  235:getfield        #27  <Field Activity b>
				//  103  238:aload_3         
				//  104  239:invokevirtual   #153 <Method void Activity.startActivity(Intent)>
					break; /* Loop/switch isn't completed */
				//  105  242:goto            415
_L2:
					Object obj1 = ((Object) (UpdateDisplayState.b(i)));
				//  106  245:iload_1         
				//  107  246:invokestatic    #156 <Method UpdateDisplayState UpdateDisplayState.b(int)>
				//  108  249:astore          5
					if(obj1 != null) goto _L5; else goto _L4
				//  109  251:aload           5
				//  110  253:ifnonnull       269
_L4:
					com.mixpanel.android.a.f.a("MixpanelAPI.API", "Notification's display proposal was already consumed, no notification will be shown.");
				//  111  256:ldc1            #52  <String "MixpanelAPI.API">
				//  112  258:ldc1            #158 <String "Notification's display proposal was already consumed, no notification will be shown.">
				//  113  260:invokestatic    #59  <Method void f.a(String, String)>
					reentrantlock.unlock();
				//  114  263:aload           4
				//  115  265:invokevirtual   #62  <Method void ReentrantLock.unlock()>
					return;
				//  116  268:return          
_L5:
					obj = ((Object) (new g()));
				//  117  269:new             #160 <Class g>
				//  118  272:dup             
				//  119  273:invokespecial   #161 <Method void g()>
				//  120  276:astore_3        
					((g) (obj)).a(c.a, i, (UpdateDisplayState.DisplayState.InAppNotificationState)((UpdateDisplayState) (obj1)).c());
				//  121  277:aload_3         
				//  122  278:aload_0         
				//  123  279:getfield        #23  <Field j$d c>
				//  124  282:getfield        #108 <Field j com.mixpanel.android.mpmetrics.j$d.a>
				//  125  285:iload_1         
				//  126  286:aload           5
				//  127  288:invokevirtual   #164 <Method UpdateDisplayState$DisplayState UpdateDisplayState.c()>
				//  128  291:checkcast       #93  <Class UpdateDisplayState$DisplayState$InAppNotificationState>
				//  129  294:invokevirtual   #167 <Method void com.mixpanel.android.mpmetrics.g.a(j, int, UpdateDisplayState$DisplayState$InAppNotificationState)>
					((g) (obj)).setRetainInstance(true);
				//  130  297:aload_3         
				//  131  298:iconst_1        
				//  132  299:invokevirtual   #171 <Method void g.setRetainInstance(boolean)>
					com.mixpanel.android.a.f.a("MixpanelAPI.API", "Attempting to show mini notification.");
				//  133  302:ldc1            #52  <String "MixpanelAPI.API">
				//  134  304:ldc1            #173 <String "Attempting to show mini notification.">
				//  135  306:invokestatic    #59  <Method void f.a(String, String)>
					obj1 = ((Object) (b.getFragmentManager().beginTransaction()));
				//  136  309:aload_0         
				//  137  310:getfield        #27  <Field Activity b>
				//  138  313:invokevirtual   #177 <Method FragmentManager Activity.getFragmentManager()>
				//  139  316:invokevirtual   #183 <Method FragmentTransaction FragmentManager.beginTransaction()>
				//  140  319:astore          5
					((FragmentTransaction) (obj1)).setCustomAnimations(0, com.mixpanel.android.a.b.com_mixpanel_android_slide_down);
				//  141  321:aload           5
				//  142  323:iconst_0        
				//  143  324:getstatic       #189 <Field int com.mixpanel.android.a$b.com_mixpanel_android_slide_down>
				//  144  327:invokevirtual   #195 <Method FragmentTransaction FragmentTransaction.setCustomAnimations(int, int)>
				//  145  330:pop             
					((FragmentTransaction) (obj1)).add(0x1020002, ((android.app.Fragment) (obj)));
				//  146  331:aload           5
				//  147  333:ldc1            #196 <Int 0x1020002>
				//  148  335:aload_3         
				//  149  336:invokevirtual   #200 <Method FragmentTransaction FragmentTransaction.add(int, android.app.Fragment)>
				//  150  339:pop             
					Exception exception;
					try
					{
						((FragmentTransaction) (obj1)).commit();
				//  151  340:aload           5
				//  152  342:invokevirtual   #203 <Method int FragmentTransaction.commit()>
				//  153  345:pop             
						break; /* Loop/switch isn't completed */
				//  154  346:goto            415
					}
				//* 155  349:ldc1            #52  <String "MixpanelAPI.API">
				//* 156  351:ldc1            #205 <String "Unable to show notification.">
				//* 157  353:invokestatic    #59  <Method void f.a(String, String)>
				//* 158  356:aload_0         
				//* 159  357:getfield        #23  <Field j$d c>
				//* 160  360:getfield        #108 <Field j com.mixpanel.android.mpmetrics.j$d.a>
				//* 161  363:invokestatic    #208 <Method e j.b(j)>
				//* 162  366:aload_2         
				//* 163  367:invokevirtual   #213 <Method void com.mixpanel.android.mpmetrics.e.a(InAppNotification)>
				//* 164  370:goto            415
				//* 165  373:new             #215 <Class StringBuilder>
				//* 166  376:dup             
				//* 167  377:invokespecial   #216 <Method void StringBuilder()>
				//* 168  380:astore          5
				//* 169  382:aload           5
				//* 170  384:ldc1            #218 <String "Unrecognized notification type ">
				//* 171  386:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
				//* 172  389:pop             
				//* 173  390:aload           5
				//* 174  392:aload_3         
				//* 175  393:invokevirtual   #225 <Method StringBuilder StringBuilder.append(Object)>
				//* 176  396:pop             
				//* 177  397:aload           5
				//* 178  399:ldc1            #227 <String " can't be shown">
				//* 179  401:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
				//* 180  404:pop             
				//* 181  405:ldc1            #52  <String "MixpanelAPI.API">
				//* 182  407:aload           5
				//* 183  409:invokevirtual   #230 <Method String StringBuilder.toString()>
				//* 184  412:invokestatic    #119 <Method void f.e(String, String)>
				//* 185  415:aload_0         
				//* 186  416:getfield        #23  <Field j$d c>
				//* 187  419:getfield        #108 <Field j com.mixpanel.android.mpmetrics.j$d.a>
				//* 188  422:invokestatic    #233 <Method h j.e(j)>
				//* 189  425:invokevirtual   #238 <Method boolean h.j()>
				//* 190  428:ifne            439
				//* 191  431:aload_0         
				//* 192  432:getfield        #23  <Field j$d c>
				//* 193  435:aload_2         
				//* 194  436:invokevirtual   #239 <Method void com.mixpanel.android.mpmetrics.j$d.a(InAppNotification)>
				//* 195  439:aload           4
				//* 196  441:invokevirtual   #62  <Method void ReentrantLock.unlock()>
				//* 197  444:return          
				//* 198  445:astore_2        
				//* 199  446:aload           4
				//* 200  448:invokevirtual   #62  <Method void ReentrantLock.unlock()>
				//* 201  451:aload_2         
				//* 202  452:athrow          
					catch(IllegalStateException illegalstateexception) { }
				//  203  453:astore_3        
					com.mixpanel.android.a.f.a("MixpanelAPI.API", "Unable to show notification.");
					j.b(c.a).a(inappnotification1);
					break; /* Loop/switch isn't completed */
_L1:
					StringBuilder stringbuilder = new StringBuilder();
					stringbuilder.append("Unrecognized notification type ");
					stringbuilder.append(obj);
					stringbuilder.append(" can't be shown");
					com.mixpanel.android.a.f.e("MixpanelAPI.API", stringbuilder.toString());
					if(!j.e(c.a).j())
						c.a(inappnotification1);
					reentrantlock.unlock();
					return;
					exception;
					reentrantlock.unlock();
					throw exception;
				//* 204  454:goto            349
				//* 205  457:goto            373
				}

				final InAppNotification a;
				final Activity b;
				final j.d c;

			
			{
				c = j.d.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field j$d c>
				a = inappnotification;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field InAppNotification a>
				b = activity;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field Activity b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    7   16:aload_2         
	//    8   17:new             #15  <Class j$d$3>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:invokespecial   #47  <Method void j$d$3(j$d, InAppNotification, Activity)>
	//   14   27:invokevirtual   #53  <Method void Activity.runOnUiThread(Runnable)>
			return;
	//   15   30:return          
		}
	}

	private JSONObject d(String s, Object obj)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #56  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void JSONObject()>
	//    3    7:astore_3        
		String s1 = e();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #61  <Method String e()>
	//    6   12:astore          4
		jsonobject.put(s, obj);
	//    7   14:aload_3         
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #64  <Method JSONObject JSONObject.put(String, Object)>
	//   11   20:pop             
		jsonobject.put("$token", ((Object) (j.h(a))));
	//   12   21:aload_3         
	//   13   22:ldc1            #66  <String "$token">
	//   14   24:aload_0         
	//   15   25:getfield        #21  <Field j a>
	//   16   28:invokestatic    #70  <Method String j.h(j)>
	//   17   31:invokevirtual   #64  <Method JSONObject JSONObject.put(String, Object)>
	//   18   34:pop             
		jsonobject.put("$time", System.currentTimeMillis());
	//   19   35:aload_3         
	//   20   36:ldc1            #72  <String "$time">
	//   21   38:invokestatic    #78  <Method long System.currentTimeMillis()>
	//   22   41:invokevirtual   #81  <Method JSONObject JSONObject.put(String, long)>
	//   23   44:pop             
		if(s1 != null)
	//*  24   45:aload           4
	//*  25   47:ifnull          59
			jsonobject.put("$distinct_id", ((Object) (s1)));
	//   26   50:aload_3         
	//   27   51:ldc1            #83  <String "$distinct_id">
	//   28   53:aload           4
	//   29   55:invokevirtual   #64  <Method JSONObject JSONObject.put(String, Object)>
	//   30   58:pop             
		return jsonobject;
	//   31   59:aload_3         
	//   32   60:areturn         
	}

	private void e(String s)
	{
		j.i(a).a(s);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field j a>
	//    2    4:invokestatic    #91  <Method com.mixpanel.android.mpmetrics.a j.i(j)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #95  <Method void com.mixpanel.android.mpmetrics.a.a(String)>
	//    5   11:return          
	}

	private void f(String s)
	{
		try
		{
			com.mixpanel.android.a.f.a("MixpanelAPI.API", "Registering a new push id");
	//    0    0:ldc1            #37  <String "MixpanelAPI.API">
	//    1    2:ldc1            #102 <String "Registering a new push id">
	//    2    4:invokestatic    #44  <Method void f.a(String, String)>
			Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
	//    3    7:new             #104 <Class Intent>
	//    4   10:dup             
	//    5   11:ldc1            #106 <String "com.google.android.c2dm.intent.REGISTER">
	//    6   13:invokespecial   #108 <Method void Intent(String)>
	//    7   16:astore_2        
			intent.putExtra("app", ((android.os.Parcelable) (PendingIntent.getBroadcast(j.g(a), 0, new Intent(), 0))));
	//    8   17:aload_2         
	//    9   18:ldc1            #110 <String "app">
	//   10   20:aload_0         
	//   11   21:getfield        #21  <Field j a>
	//   12   24:invokestatic    #114 <Method Context j.g(j)>
	//   13   27:iconst_0        
	//   14   28:new             #104 <Class Intent>
	//   15   31:dup             
	//   16   32:invokespecial   #115 <Method void Intent()>
	//   17   35:iconst_0        
	//   18   36:invokestatic    #121 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   19   39:invokevirtual   #125 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   20   42:pop             
			intent.putExtra("sender", s);
	//   21   43:aload_2         
	//   22   44:ldc1            #127 <String "sender">
	//   23   46:aload_1         
	//   24   47:invokevirtual   #130 <Method Intent Intent.putExtra(String, String)>
	//   25   50:pop             
			j.g(a).startService(intent);
	//   26   51:aload_0         
	//   27   52:getfield        #21  <Field j a>
	//   28   55:invokestatic    #114 <Method Context j.g(j)>
	//   29   58:aload_2         
	//   30   59:invokevirtual   #136 <Method android.content.ComponentName Context.startService(Intent)>
	//   31   62:pop             
			return;
	//   32   63:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  33   64:astore_1        
		{
			com.mixpanel.android.a.f.d("MixpanelAPI.API", "Error registering for push notifications", ((Throwable) (s)));
	//   34   65:ldc1            #37  <String "MixpanelAPI.API">
	//   35   67:ldc1            #138 <String "Error registering for push notifications">
	//   36   69:aload_1         
	//   37   70:invokestatic    #141 <Method void f.d(String, String, Throwable)>
		}
	//   38   73:return          
	}

	public String a()
	{
		return com.mixpanel.android.mpmetrics.j.a(a).f();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field j a>
	//    2    4:invokestatic    #144 <Method n com.mixpanel.android.mpmetrics.j.a(j)>
	//    3    7:invokevirtual   #148 <Method String com.mixpanel.android.mpmetrics.n.f()>
	//    4   10:areturn         
	}

	public void a(Activity activity)
	{
		if(android.os.d.VERSION.SDK_INT < 16)
	//*   0    0:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmpge          9
		{
			return;
	//    3    8:return          
		} else
		{
			a(((InAppNotification) (null)), activity);
	//    4    9:aload_0         
	//    5   10:aconst_null     
	//    6   11:aload_1         
	//    7   12:invokespecial   #151 <Method void a(InAppNotification, Activity)>
			return;
	//    8   15:return          
		}
	}

	public void a(InAppNotification inappnotification)
	{
		if(inappnotification == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		com.mixpanel.android.mpmetrics.j.a(a).a(Integer.valueOf(inappnotification.b()));
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field j a>
	//    5    9:invokestatic    #144 <Method n com.mixpanel.android.mpmetrics.j.a(j)>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #160 <Method int InAppNotification.b()>
	//    8   16:invokestatic    #166 <Method Integer Integer.valueOf(int)>
	//    9   19:invokevirtual   #169 <Method void com.mixpanel.android.mpmetrics.n.a(Integer)>
		a("$campaign_delivery", inappnotification, ((JSONObject) (null)));
	//   10   22:aload_0         
	//   11   23:ldc1            #171 <String "$campaign_delivery">
	//   12   25:aload_1         
	//   13   26:aconst_null     
	//   14   27:invokevirtual   #174 <Method void a(String, InAppNotification, JSONObject)>
		j$c j$c1 = a.c().d(e());
	//   15   30:aload_0         
	//   16   31:getfield        #21  <Field j a>
	//   17   34:invokevirtual   #178 <Method j$c j.c()>
	//   18   37:aload_0         
	//   19   38:invokevirtual   #61  <Method String e()>
	//   20   41:invokeinterface #181 <Method j$c j$c.d(String)>
	//   21   46:astore_2        
		if(j$c1 != null)
	//*  22   47:aload_2         
	//*  23   48:ifnull          128
		{
			SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
	//   24   51:new             #183 <Class SimpleDateFormat>
	//   25   54:dup             
	//   26   55:ldc1            #185 <String "yyyy-MM-dd'T'HH:mm:ss">
	//   27   57:getstatic       #191 <Field Locale Locale.US>
	//   28   60:invokespecial   #194 <Method void SimpleDateFormat(String, Locale)>
	//   29   63:astore          4
			JSONObject jsonobject = inappnotification.a();
	//   30   65:aload_1         
	//   31   66:invokevirtual   #197 <Method JSONObject com.mixpanel.android.mpmetrics.InAppNotification.a()>
	//   32   69:astore_3        
			try
			{
				jsonobject.put("$time", ((Object) (((DateFormat) (simpledateformat)).format(new Date()))));
	//   33   70:aload_3         
	//   34   71:ldc1            #72  <String "$time">
	//   35   73:aload           4
	//   36   75:new             #199 <Class Date>
	//   37   78:dup             
	//   38   79:invokespecial   #200 <Method void Date()>
	//   39   82:invokevirtual   #206 <Method String DateFormat.format(Date)>
	//   40   85:invokevirtual   #64  <Method JSONObject JSONObject.put(String, Object)>
	//   41   88:pop             
			}
	//*  42   89:goto            103
			catch(JSONException jsonexception)
	//*  43   92:astore          4
			{
				com.mixpanel.android.a.f.e("MixpanelAPI.API", "Exception trying to track an in-app notification seen", ((Throwable) (jsonexception)));
	//   44   94:ldc1            #37  <String "MixpanelAPI.API">
	//   45   96:ldc1            #208 <String "Exception trying to track an in-app notification seen">
	//   46   98:aload           4
	//   47  100:invokestatic    #210 <Method void f.e(String, String, Throwable)>
			}
			j$c1.a("$campaigns", ((Object) (Integer.valueOf(inappnotification.b()))));
	//   48  103:aload_2         
	//   49  104:ldc1            #212 <String "$campaigns">
	//   50  106:aload_1         
	//   51  107:invokevirtual   #160 <Method int InAppNotification.b()>
	//   52  110:invokestatic    #166 <Method Integer Integer.valueOf(int)>
	//   53  113:invokeinterface #215 <Method void com.mixpanel.android.mpmetrics.j$c.a(String, Object)>
			j$c1.a("$notifications", ((Object) (jsonobject)));
	//   54  118:aload_2         
	//   55  119:ldc1            #217 <String "$notifications">
	//   56  121:aload_3         
	//   57  122:invokeinterface #215 <Method void com.mixpanel.android.mpmetrics.j$c.a(String, Object)>
			return;
	//   58  127:return          
		} else
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.API", "No identity found. Make sure to call getPeople().identify() before showing in-app notifications.");
	//   59  128:ldc1            #37  <String "MixpanelAPI.API">
	//   60  130:ldc1            #219 <String "No identity found. Make sure to call getPeople().identify() before showing in-app notifications.">
	//   61  132:invokestatic    #221 <Method void f.e(String, String)>
			return;
	//   62  135:return          
		}
	}

	public void a(String s)
	{
		synchronized(com.mixpanel.android.mpmetrics.j.a(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field j a>
	//*   2    4:invokestatic    #144 <Method n com.mixpanel.android.mpmetrics.j.a(j)>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:monitorenter    
		{
			com.mixpanel.android.mpmetrics.j.a(a).b(s);
	//    6   10:aload_0         
	//    7   11:getfield        #21  <Field j a>
	//    8   14:invokestatic    #144 <Method n com.mixpanel.android.mpmetrics.j.a(j)>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #223 <Method void n.b(String)>
			j.b(a).a(s);
	//   11   21:aload_0         
	//   12   22:getfield        #21  <Field j a>
	//   13   25:invokestatic    #226 <Method e j.b(j)>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #229 <Method void com.mixpanel.android.mpmetrics.e.a(String)>
		}
	//   16   32:aload_2         
	//   17   33:monitorexit     
		j.c(a);
	//   18   34:aload_0         
	//   19   35:getfield        #21  <Field j a>
	//   20   38:invokestatic    #231 <Method void j.c(j)>
		return;
	//   21   41:return          
		s;
	//   22   42:astore_1        
		n1;
	//   23   43:aload_2         
		JVM INSTR monitorexit ;
	//   24   44:monitorexit     
		throw s;
	//   25   45:aload_1         
	//   26   46:athrow          
	}

	public void a(String s, double d1)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #234 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #235 <Method void HashMap()>
	//    3    7:astore          4
		((Map) (hashmap)).put(((Object) (s)), ((Object) (Double.valueOf(d1))));
	//    4    9:aload           4
	//    5   11:aload_1         
	//    6   12:dload_2         
	//    7   13:invokestatic    #240 <Method Double Double.valueOf(double)>
	//    8   16:invokeinterface #245 <Method Object Map.put(Object, Object)>
	//    9   21:pop             
		a(((Map) (hashmap)));
	//   10   22:aload_0         
	//   11   23:aload           4
	//   12   25:invokevirtual   #248 <Method void a(Map)>
	//   13   28:return          
	}

	public void a(String s, InAppNotification inappnotification, JSONObject jsonobject)
	{
		inappnotification = ((InAppNotification) (inappnotification.a()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #197 <Method JSONObject com.mixpanel.android.mpmetrics.InAppNotification.a()>
	//    2    4:astore_2        
		if(jsonobject != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          63
			try
			{
				String s1;
				for(Iterator iterator = jsonobject.keys(); iterator.hasNext(); ((JSONObject) (inappnotification)).put(s1, jsonobject.get(s1)))
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #252 <Method Iterator JSONObject.keys()>
	//*   7   13:astore          4
	//*   8   15:aload           4
	//*   9   17:invokeinterface #258 <Method boolean Iterator.hasNext()>
	//*  10   22:ifeq            63
					s1 = (String)iterator.next();
	//   11   25:aload           4
	//   12   27:invokeinterface #262 <Method Object Iterator.next()>
	//   13   32:checkcast       #264 <Class String>
	//   14   35:astore          5

	//   15   37:aload_2         
	//   16   38:aload           5
	//   17   40:aload_3         
	//   18   41:aload           5
	//   19   43:invokevirtual   #268 <Method Object JSONObject.get(String)>
	//   20   46:invokevirtual   #64  <Method JSONObject JSONObject.put(String, Object)>
	//   21   49:pop             
			}
	//*  22   50:goto            15
			// Misplaced declaration of an exception variable
			catch(JSONObject jsonobject)
	//*  23   53:astore_3        
			{
				com.mixpanel.android.a.f.e("MixpanelAPI.API", "Exception merging provided properties with notification properties", ((Throwable) (jsonobject)));
	//   24   54:ldc1            #37  <String "MixpanelAPI.API">
	//   25   56:ldc2            #270 <String "Exception merging provided properties with notification properties">
	//   26   59:aload_3         
	//   27   60:invokestatic    #210 <Method void f.e(String, String, Throwable)>
			}
		a.a(s, ((JSONObject) (inappnotification)));
	//   28   63:aload_0         
	//   29   64:getfield        #21  <Field j a>
	//   30   67:aload_1         
	//   31   68:aload_2         
	//   32   69:invokevirtual   #273 <Method void com.mixpanel.android.mpmetrics.j.a(String, JSONObject)>
	//   33   72:return          
	}

	public void a(String s, Object obj)
	{
		try
		{
			JSONObject jsonobject = new JSONObject();
	//    0    0:new             #56  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void JSONObject()>
	//    3    7:astore_3        
			jsonobject.put(s, obj);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #64  <Method JSONObject JSONObject.put(String, Object)>
	//    8   14:pop             
			s = ((String) (d("$append", ((Object) (jsonobject)))));
	//    9   15:aload_0         
	//   10   16:ldc2            #275 <String "$append">
	//   11   19:aload_3         
	//   12   20:invokespecial   #277 <Method JSONObject d(String, Object)>
	//   13   23:astore_1        
			com.mixpanel.android.mpmetrics.j.a(a, ((JSONObject) (s)));
	//   14   24:aload_0         
	//   15   25:getfield        #21  <Field j a>
	//   16   28:aload_1         
	//   17   29:invokestatic    #280 <Method void com.mixpanel.android.mpmetrics.j.a(j, JSONObject)>
			return;
	//   18   32:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  19   33:astore_1        
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.API", "Exception appending a property", ((Throwable) (s)));
	//   20   34:ldc1            #37  <String "MixpanelAPI.API">
	//   21   36:ldc2            #282 <String "Exception appending a property">
	//   22   39:aload_1         
	//   23   40:invokestatic    #210 <Method void f.e(String, String, Throwable)>
		}
	//   24   43:return          
	}

	public void a(String s, JSONArray jsonarray)
	{
		try
		{
			JSONObject jsonobject = new JSONObject();
	//    0    0:new             #56  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void JSONObject()>
	//    3    7:astore_3        
			jsonobject.put(s, ((Object) (jsonarray)));
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #64  <Method JSONObject JSONObject.put(String, Object)>
	//    8   14:pop             
			s = ((String) (d("$union", ((Object) (jsonobject)))));
	//    9   15:aload_0         
	//   10   16:ldc2            #285 <String "$union">
	//   11   19:aload_3         
	//   12   20:invokespecial   #277 <Method JSONObject d(String, Object)>
	//   13   23:astore_1        
			com.mixpanel.android.mpmetrics.j.a(a, ((JSONObject) (s)));
	//   14   24:aload_0         
	//   15   25:getfield        #21  <Field j a>
	//   16   28:aload_1         
	//   17   29:invokestatic    #280 <Method void com.mixpanel.android.mpmetrics.j.a(j, JSONObject)>
			return;
	//   18   32:return          
		}
	//*  19   33:ldc1            #37  <String "MixpanelAPI.API">
	//*  20   35:ldc2            #287 <String "Exception unioning a property">
	//*  21   38:invokestatic    #221 <Method void f.e(String, String)>
	//*  22   41:return          
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.API", "Exception unioning a property");
		}
	//*  23   42:astore_1        
	//*  24   43:goto            33
	}

	public void a(String s, JSONObject jsonobject)
	{
		JSONObject jsonobject1 = new JSONObject();
	//    0    0:new             #56  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void JSONObject()>
	//    3    7:astore_3        
		try
		{
			jsonobject1.put(s, ((Object) (jsonobject)));
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #64  <Method JSONObject JSONObject.put(String, Object)>
	//    8   14:pop             
			s = ((String) (d("$merge", ((Object) (jsonobject1)))));
	//    9   15:aload_0         
	//   10   16:ldc2            #289 <String "$merge">
	//   11   19:aload_3         
	//   12   20:invokespecial   #277 <Method JSONObject d(String, Object)>
	//   13   23:astore_1        
			com.mixpanel.android.mpmetrics.j.a(a, ((JSONObject) (s)));
	//   14   24:aload_0         
	//   15   25:getfield        #21  <Field j a>
	//   16   28:aload_1         
	//   17   29:invokestatic    #280 <Method void com.mixpanel.android.mpmetrics.j.a(j, JSONObject)>
			return;
	//   18   32:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  19   33:astore_1        
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.API", "Exception merging a property", ((Throwable) (s)));
	//   20   34:ldc1            #37  <String "MixpanelAPI.API">
	//   21   36:ldc2            #291 <String "Exception merging a property">
	//   22   39:aload_1         
	//   23   40:invokestatic    #210 <Method void f.e(String, String, Throwable)>
		}
	//   24   43:return          
	}

	public void a(Map map)
	{
		map = ((Map) (new JSONObject(map)));
	//    0    0:new             #56  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #293 <Method void JSONObject(Map)>
	//    4    8:astore_1        
		try
		{
			map = ((Map) (d("$add", ((Object) (map)))));
	//    5    9:aload_0         
	//    6   10:ldc2            #295 <String "$add">
	//    7   13:aload_1         
	//    8   14:invokespecial   #277 <Method JSONObject d(String, Object)>
	//    9   17:astore_1        
			com.mixpanel.android.mpmetrics.j.a(a, ((JSONObject) (map)));
	//   10   18:aload_0         
	//   11   19:getfield        #21  <Field j a>
	//   12   22:aload_1         
	//   13   23:invokestatic    #280 <Method void com.mixpanel.android.mpmetrics.j.a(j, JSONObject)>
			return;
	//   14   26:return          
		}
		// Misplaced declaration of an exception variable
		catch(Map map)
	//*  15   27:astore_1        
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.API", "Exception incrementing properties", ((Throwable) (map)));
	//   16   28:ldc1            #37  <String "MixpanelAPI.API">
	//   17   30:ldc2            #297 <String "Exception incrementing properties">
	//   18   33:aload_1         
	//   19   34:invokestatic    #210 <Method void f.e(String, String, Throwable)>
		}
	//   20   37:return          
	}

	public void a(JSONObject jsonobject)
	{
		JSONObject jsonobject1;
		jsonobject1 = new JSONObject(j.d(a));
	//    0    0:new             #56  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field j a>
	//    4    8:invokestatic    #303 <Method Map j.d(j)>
	//    5   11:invokespecial   #293 <Method void JSONObject(Map)>
	//    6   14:astore_2        
		String s;
		for(Iterator iterator = jsonobject.keys(); iterator.hasNext(); jsonobject1.put(s, jsonobject.get(s)))
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #252 <Method Iterator JSONObject.keys()>
	//*   9   19:astore_3        
	//*  10   20:aload_3         
	//*  11   21:invokeinterface #258 <Method boolean Iterator.hasNext()>
	//*  12   26:ifeq            56
			s = (String)iterator.next();
	//   13   29:aload_3         
	//   14   30:invokeinterface #262 <Method Object Iterator.next()>
	//   15   35:checkcast       #264 <Class String>
	//   16   38:astore          4

	//   17   40:aload_2         
	//   18   41:aload           4
	//   19   43:aload_1         
	//   20   44:aload           4
	//   21   46:invokevirtual   #268 <Method Object JSONObject.get(String)>
	//   22   49:invokevirtual   #64  <Method JSONObject JSONObject.put(String, Object)>
	//   23   52:pop             
	//*  24   53:goto            20
		try
		{
			jsonobject = d("$set", ((Object) (jsonobject1)));
	//   25   56:aload_0         
	//   26   57:ldc2            #305 <String "$set">
	//   27   60:aload_2         
	//   28   61:invokespecial   #277 <Method JSONObject d(String, Object)>
	//   29   64:astore_1        
			com.mixpanel.android.mpmetrics.j.a(a, jsonobject);
	//   30   65:aload_0         
	//   31   66:getfield        #21  <Field j a>
	//   32   69:aload_1         
	//   33   70:invokestatic    #280 <Method void com.mixpanel.android.mpmetrics.j.a(j, JSONObject)>
			return;
	//   34   73:return          
		}
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  35   74:astore_1        
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.API", "Exception setting people properties", ((Throwable) (jsonobject)));
	//   36   75:ldc1            #37  <String "MixpanelAPI.API">
	//   37   77:ldc2            #307 <String "Exception setting people properties">
	//   38   80:aload_1         
	//   39   81:invokestatic    #210 <Method void f.e(String, String, Throwable)>
		}
		return;
	//   40   84:return          
	}

	public void b()
	{
		com.mixpanel.android.mpmetrics.j.a(a).e();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field j a>
	//    2    4:invokestatic    #144 <Method n com.mixpanel.android.mpmetrics.j.a(j)>
	//    3    7:invokevirtual   #309 <Method void n.e()>
		c("$android_devices", ((Object) (new JSONArray())));
	//    4   10:aload_0         
	//    5   11:ldc2            #311 <String "$android_devices">
	//    6   14:new             #313 <Class JSONArray>
	//    7   17:dup             
	//    8   18:invokespecial   #314 <Method void JSONArray()>
	//    9   21:invokevirtual   #316 <Method void c(String, Object)>
	//   10   24:return          
	}

	public void b(String s)
	{
		if(!com.mixpanel.android.mpmetrics.c.b(j.g(a)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field j a>
	//*   2    4:invokestatic    #114 <Method Context j.g(j)>
	//*   3    7:invokestatic    #321 <Method boolean c.b(Context)>
	//*   4   10:ifne            63
		{
			com.mixpanel.android.a.f.c("MixpanelAPI.API", "Can't register for push notification services. Push notifications will not work.");
	//    5   13:ldc1            #37  <String "MixpanelAPI.API">
	//    6   15:ldc2            #323 <String "Can't register for push notification services. Push notifications will not work.">
	//    7   18:invokestatic    #325 <Method void f.c(String, String)>
			s = ((String) (new StringBuilder()));
	//    8   21:new             #327 <Class StringBuilder>
	//    9   24:dup             
	//   10   25:invokespecial   #328 <Method void StringBuilder()>
	//   11   28:astore_1        
			((StringBuilder) (s)).append("See log tagged ");
	//   12   29:aload_1         
	//   13   30:ldc2            #330 <String "See log tagged ">
	//   14   33:invokevirtual   #334 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:pop             
			((StringBuilder) (s)).append(com.mixpanel.android.mpmetrics.c.a);
	//   16   37:aload_1         
	//   17   38:getstatic       #337 <Field String com.mixpanel.android.mpmetrics.c.a>
	//   18   41:invokevirtual   #334 <Method StringBuilder StringBuilder.append(String)>
	//   19   44:pop             
			((StringBuilder) (s)).append(" above for details.");
	//   20   45:aload_1         
	//   21   46:ldc2            #339 <String " above for details.">
	//   22   49:invokevirtual   #334 <Method StringBuilder StringBuilder.append(String)>
	//   23   52:pop             
			com.mixpanel.android.a.f.c("MixpanelAPI.API", ((StringBuilder) (s)).toString());
	//   24   53:ldc1            #37  <String "MixpanelAPI.API">
	//   25   55:aload_1         
	//   26   56:invokevirtual   #342 <Method String StringBuilder.toString()>
	//   27   59:invokestatic    #325 <Method void f.c(String, String)>
			return;
	//   28   62:return          
		}
		String s1 = com.mixpanel.android.mpmetrics.j.a(a).f();
	//   29   63:aload_0         
	//   30   64:getfield        #21  <Field j a>
	//   31   67:invokestatic    #144 <Method n com.mixpanel.android.mpmetrics.j.a(j)>
	//   32   70:invokevirtual   #148 <Method String com.mixpanel.android.mpmetrics.n.f()>
	//   33   73:astore_2        
		if(s1 == null)
	//*  34   74:aload_2         
	//*  35   75:ifnonnull       98
		{
			if(android.os.d.VERSION.SDK_INT >= 21)
	//*  36   78:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//*  37   81:bipush          21
	//*  38   83:icmplt          92
			{
				e(s);
	//   39   86:aload_0         
	//   40   87:aload_1         
	//   41   88:invokespecial   #344 <Method void e(String)>
				return;
	//   42   91:return          
			} else
			{
				f(s);
	//   43   92:aload_0         
	//   44   93:aload_1         
	//   45   94:invokespecial   #346 <Method void f(String)>
				return;
	//   46   97:return          
			}
		} else
		{
			com.mixpanel.android.mpmetrics.j.a(new j.a(s1) {

				public void a(j j1)
				{
					StringBuilder stringbuilder = new StringBuilder();
				//    0    0:new             #30  <Class StringBuilder>
				//    1    3:dup             
				//    2    4:invokespecial   #31  <Method void StringBuilder()>
				//    3    7:astore_2        
					stringbuilder.append("Using existing pushId ");
				//    4    8:aload_2         
				//    5    9:ldc1            #33  <String "Using existing pushId ">
				//    6   11:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
				//    7   14:pop             
					stringbuilder.append(a);
				//    8   15:aload_2         
				//    9   16:aload_0         
				//   10   17:getfield        #23  <Field String a>
				//   11   20:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
				//   12   23:pop             
					com.mixpanel.android.a.f.a("MixpanelAPI.API", stringbuilder.toString());
				//   13   24:ldc1            #39  <String "MixpanelAPI.API">
				//   14   26:aload_2         
				//   15   27:invokevirtual   #43  <Method String StringBuilder.toString()>
				//   16   30:invokestatic    #48  <Method void f.a(String, String)>
					j1.c().c(a);
				//   17   33:aload_1         
				//   18   34:invokevirtual   #52  <Method j$c j.c()>
				//   19   37:aload_0         
				//   20   38:getfield        #23  <Field String a>
				//   21   41:invokeinterface #56  <Method void j$c.c(String)>
				//   22   46:return          
				}

				final String a;
				final j.d b;

			
			{
				b = j.d.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field j$d b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   47   98:new             #11  <Class j$d$1>
	//   48  101:dup             
	//   49  102:aload_0         
	//   50  103:aload_2         
	//   51  104:invokespecial   #349 <Method void j$d$1(j$d, String)>
	//   52  107:invokestatic    #352 <Method void com.mixpanel.android.mpmetrics.j.a(j$a)>
			return;
	//   53  110:return          
		}
	}

	public void b(String s, Object obj)
	{
		try
		{
			JSONObject jsonobject = new JSONObject();
	//    0    0:new             #56  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void JSONObject()>
	//    3    7:astore_3        
			jsonobject.put(s, obj);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #64  <Method JSONObject JSONObject.put(String, Object)>
	//    8   14:pop             
			s = ((String) (d("$remove", ((Object) (jsonobject)))));
	//    9   15:aload_0         
	//   10   16:ldc2            #354 <String "$remove">
	//   11   19:aload_3         
	//   12   20:invokespecial   #277 <Method JSONObject d(String, Object)>
	//   13   23:astore_1        
			com.mixpanel.android.mpmetrics.j.a(a, ((JSONObject) (s)));
	//   14   24:aload_0         
	//   15   25:getfield        #21  <Field j a>
	//   16   28:aload_1         
	//   17   29:invokestatic    #280 <Method void com.mixpanel.android.mpmetrics.j.a(j, JSONObject)>
			return;
	//   18   32:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  19   33:astore_1        
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.API", "Exception appending a property", ((Throwable) (s)));
	//   20   34:ldc1            #37  <String "MixpanelAPI.API">
	//   21   36:ldc2            #282 <String "Exception appending a property">
	//   22   39:aload_1         
	//   23   40:invokestatic    #210 <Method void f.e(String, String, Throwable)>
		}
	//   24   43:return          
	}

	public void b(JSONObject jsonobject)
	{
		try
		{
			jsonobject = d("$set_once", ((Object) (jsonobject)));
	//    0    0:aload_0         
	//    1    1:ldc2            #356 <String "$set_once">
	//    2    4:aload_1         
	//    3    5:invokespecial   #277 <Method JSONObject d(String, Object)>
	//    4    8:astore_1        
			com.mixpanel.android.mpmetrics.j.a(a, jsonobject);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field j a>
	//    7   13:aload_1         
	//    8   14:invokestatic    #280 <Method void com.mixpanel.android.mpmetrics.j.a(j, JSONObject)>
			return;
	//    9   17:return          
		}
	//*  10   18:ldc1            #37  <String "MixpanelAPI.API">
	//*  11   20:ldc2            #307 <String "Exception setting people properties">
	//*  12   23:invokestatic    #221 <Method void f.e(String, String)>
	//*  13   26:return          
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.API", "Exception setting people properties");
		}
	//*  14   27:astore_1        
	//*  15   28:goto            18
	}

	public void c()
	{
		JSONArray jsonarray = j.b(a).c();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field j a>
	//    2    4:invokestatic    #226 <Method e j.b(j)>
	//    3    7:invokevirtual   #359 <Method JSONArray e.c()>
	//    4   10:astore_1        
		com.mixpanel.android.mpmetrics.j.f(a).c(jsonarray);
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field j a>
	//    7   15:invokestatic    #362 <Method l com.mixpanel.android.mpmetrics.j.f(j)>
	//    8   18:aload_1         
	//    9   19:invokeinterface #367 <Method void l.c(JSONArray)>
	//   10   24:return          
	}

	public void c(String s)
	{
label0:
		{
			synchronized(com.mixpanel.android.mpmetrics.j.a(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field j a>
	//*   2    4:invokestatic    #144 <Method n com.mixpanel.android.mpmetrics.j.a(j)>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:monitorenter    
			{
				if(com.mixpanel.android.mpmetrics.j.a(a).c() != null)
					break label0;
	//    6   10:aload_0         
	//    7   11:getfield        #21  <Field j a>
	//    8   14:invokestatic    #144 <Method n com.mixpanel.android.mpmetrics.j.a(j)>
	//    9   17:invokevirtual   #369 <Method String n.c()>
	//   10   20:ifnonnull       26
			}
	//   11   23:aload_2         
	//   12   24:monitorexit     
			return;
	//   13   25:return          
		}
		com.mixpanel.android.mpmetrics.j.a(a).c(s);
	//   14   26:aload_0         
	//   15   27:getfield        #21  <Field j a>
	//   16   30:invokestatic    #144 <Method n com.mixpanel.android.mpmetrics.j.a(j)>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #371 <Method void n.c(String)>
		JSONArray jsonarray = new JSONArray();
	//   19   37:new             #313 <Class JSONArray>
	//   20   40:dup             
	//   21   41:invokespecial   #314 <Method void JSONArray()>
	//   22   44:astore_3        
		jsonarray.put(((Object) (s)));
	//   23   45:aload_3         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #374 <Method JSONArray JSONArray.put(Object)>
	//   26   50:pop             
		a("$android_devices", jsonarray);
	//   27   51:aload_0         
	//   28   52:ldc2            #311 <String "$android_devices">
	//   29   55:aload_3         
	//   30   56:invokevirtual   #376 <Method void a(String, JSONArray)>
		n1;
	//   31   59:aload_2         
		JVM INSTR monitorexit ;
	//   32   60:monitorexit     
		return;
	//   33   61:return          
		s;
	//   34   62:astore_1        
		n1;
	//   35   63:aload_2         
		JVM INSTR monitorexit ;
	//   36   64:monitorexit     
		throw s;
	//   37   65:aload_1         
	//   38   66:athrow          
	}

	public void c(String s, Object obj)
	{
		try
		{
			a((new JSONObject()).put(s, obj));
	//    0    0:aload_0         
	//    1    1:new             #56  <Class JSONObject>
	//    2    4:dup             
	//    3    5:invokespecial   #57  <Method void JSONObject()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #64  <Method JSONObject JSONObject.put(String, Object)>
	//    7   13:invokevirtual   #378 <Method void a(JSONObject)>
			return;
	//    8   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   9   17:astore_1        
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.API", "set", ((Throwable) (s)));
	//   10   18:ldc1            #37  <String "MixpanelAPI.API">
	//   11   20:ldc2            #380 <String "set">
	//   12   23:aload_1         
	//   13   24:invokestatic    #210 <Method void f.e(String, String, Throwable)>
		}
	//   14   27:return          
	}

	public InAppNotification d()
	{
		return j.b(a).a(j.e(a).j());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field j a>
	//    2    4:invokestatic    #226 <Method e j.b(j)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field j a>
	//    5   11:invokestatic    #384 <Method h j.e(j)>
	//    6   14:invokevirtual   #389 <Method boolean h.j()>
	//    7   17:invokevirtual   #392 <Method InAppNotification com.mixpanel.android.mpmetrics.e.a(boolean)>
	//    8   20:areturn         
	}

	public j$c d(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return ((j$c) (new j.d(s) {

				public void a(String s1)
				{
					throw new RuntimeException("This MixpanelPeople object has a fixed, constant distinctId");
				//    0    0:new             #30  <Class RuntimeException>
				//    1    3:dup             
				//    2    4:ldc1            #32  <String "This MixpanelPeople object has a fixed, constant distinctId">
				//    3    6:invokespecial   #34  <Method void RuntimeException(String)>
				//    4    9:athrow          
				}

				public String e()
				{
					return b;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field String b>
				//    2    4:areturn         
				}

				final String b;
				final j.d c;

			
			{
				c = j.d.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field j$d c>
				b = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field String b>
				super(j.d.this.a, ((j._cls1) (null)));
			//    6   10:aload_0         
			//    7   11:aload_1         
			//    8   12:getfield        #23  <Field j j$d.a>
			//    9   15:aconst_null     
			//   10   16:invokespecial   #26  <Method void j$d(j, j$1)>
			//   11   19:return          
			}
			}
));
	//    4    6:new             #13  <Class j$d$2>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #393 <Method void j$d$2(j$d, String)>
	//    9   15:areturn         
	}

	public String e()
	{
		return com.mixpanel.android.mpmetrics.j.a(a).c();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field j a>
	//    2    4:invokestatic    #144 <Method n com.mixpanel.android.mpmetrics.j.a(j)>
	//    3    7:invokevirtual   #369 <Method String n.c()>
	//    4   10:areturn         
	}

	final j a;

	private j$d(j j1)
	{
		a = j1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field j a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
	//    5    9:return          
	}

	j$d(j j1, j$1 j$1)
	{
		this(j1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void j$d(j)>
	//    3    5:return          
	}
}
