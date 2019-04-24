// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.app.*;
import android.content.Intent;
import com.mixpanel.android.a.a;
import com.mixpanel.android.a.f;
import com.mixpanel.android.takeoverinapp.TakeoverInAppActivity;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			j, UpdateDisplayState, InAppNotification, c, 
//			g, e, h

class j$d$3
	implements Runnable
{

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
		f.a("MixpanelAPI.API", "DisplayState is locked, will not show notifications.");
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
		InAppNotification inappnotification;
		inappnotification = ((InAppNotification) (obj));
	//   15   34:aload_3         
	//   16   35:astore_2        
		if(obj != null)
			break MISSING_BLOCK_LABEL_48;
	//   17   36:aload_3         
	//   18   37:ifnonnull       48
		inappnotification = c.d();
	//   19   40:aload_0         
	//   20   41:getfield        #23  <Field j$d c>
	//   21   44:invokevirtual   #65  <Method InAppNotification j$d.d()>
	//   22   47:astore_2        
		if(inappnotification != null)
			break MISSING_BLOCK_LABEL_65;
	//   23   48:aload_2         
	//   24   49:ifnonnull       65
		f.a("MixpanelAPI.API", "No notification available, will not show.");
	//   25   52:ldc1            #52  <String "MixpanelAPI.API">
	//   26   54:ldc1            #67  <String "No notification available, will not show.">
	//   27   56:invokestatic    #59  <Method void f.a(String, String)>
		reentrantlock.unlock();
	//   28   59:aload           4
	//   29   61:invokevirtual   #62  <Method void ReentrantLock.unlock()>
		return;
	//   30   64:return          
		obj = ((Object) (inappnotification.d()));
	//   31   65:aload_2         
	//   32   66:invokevirtual   #72  <Method InAppNotification$a InAppNotification.d()>
	//   33   69:astore_3        
		if(obj != otification.a.TAKEOVER || com.mixpanel.android.mpmetrics.c.c(b.getApplicationContext()))
			break MISSING_BLOCK_LABEL_103;
	//   34   70:aload_3         
	//   35   71:getstatic       #78  <Field InAppNotification$a InAppNotification$a.TAKEOVER>
	//   36   74:if_acmpne       103
	//   37   77:aload_0         
	//   38   78:getfield        #27  <Field Activity b>
	//   39   81:invokevirtual   #84  <Method android.content.Context Activity.getApplicationContext()>
	//   40   84:invokestatic    #89  <Method boolean c.c(android.content.Context)>
	//   41   87:ifne            103
		f.a("MixpanelAPI.API", "Application is not configured to show takeover notifications, none will be shown.");
	//   42   90:ldc1            #52  <String "MixpanelAPI.API">
	//   43   92:ldc1            #91  <String "Application is not configured to show takeover notifications, none will be shown.">
	//   44   94:invokestatic    #59  <Method void f.a(String, String)>
		reentrantlock.unlock();
	//   45   97:aload           4
	//   46   99:invokevirtual   #62  <Method void ReentrantLock.unlock()>
		return;
	//   47  102:return          
		int i = com.mixpanel.android.mpmetrics.UpdateDisplayState.a(((DisplayState.DisplayState) (new DisplayState.DisplayState.InAppNotificationState(inappnotification, com.mixpanel.android.a.a.a(b)))), c.e(), j.h(c.a));
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
		f.e("MixpanelAPI.API", "DisplayState Lock in inconsistent state! Please report this issue to Mixpanel");
	//   66  143:ldc1            #52  <String "MixpanelAPI.API">
	//   67  145:ldc1            #117 <String "DisplayState Lock in inconsistent state! Please report this issue to Mixpanel">
	//   68  147:invokestatic    #119 <Method void f.e(String, String)>
		reentrantlock.unlock();
	//   69  150:aload           4
	//   70  152:invokevirtual   #62  <Method void ReentrantLock.unlock()>
		return;
	//   71  155:return          
		com.mixpanel.android.mpmetrics.j._cls3.a[((otification.a) (obj)).ordinal()];
	//   72  156:getstatic       #124 <Field int[] com.mixpanel.android.mpmetrics.j$3.a>
	//   73  159:aload_3         
	//   74  160:invokevirtual   #128 <Method int InAppNotification$a.ordinal()>
	//   75  163:iaload          
		JVM INSTR tableswitch 1 2: default 457
	//	               1 245
	//	               2 188;
	//   76  164:tableswitch     1 2: default 457
	//	               1 245
	//	               2 188
		   goto _L1 _L2 _L3
_L3:
		f.a("MixpanelAPI.API", "Sending intent for takeover notification.");
	//   77  188:ldc1            #52  <String "MixpanelAPI.API">
	//   78  190:ldc1            #130 <String "Sending intent for takeover notification.">
	//   79  192:invokestatic    #59  <Method void f.a(String, String)>
		obj = ((Object) (new Intent(b.getApplicationContext(), com/mixpanel/android/takeoverinapp/TakeoverInAppActivity)));
	//   80  195:new             #132 <Class Intent>
	//   81  198:dup             
	//   82  199:aload_0         
	//   83  200:getfield        #27  <Field Activity b>
	//   84  203:invokevirtual   #84  <Method android.content.Context Activity.getApplicationContext()>
	//   85  206:ldc1            #134 <Class TakeoverInAppActivity>
	//   86  208:invokespecial   #137 <Method void Intent(android.content.Context, Class)>
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
		f.a("MixpanelAPI.API", "Notification's display proposal was already consumed, no notification will be shown.");
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
		((g) (obj)).a(c.a, i, (DisplayState.DisplayState.InAppNotificationState)((UpdateDisplayState) (obj1)).c());
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
		f.a("MixpanelAPI.API", "Attempting to show mini notification.");
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
		f.a("MixpanelAPI.API", "Unable to show notification.");
		j.b(c.a).a(inappnotification);
		break; /* Loop/switch isn't completed */
_L1:
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("Unrecognized notification type ");
		stringbuilder.append(obj);
		stringbuilder.append(" can't be shown");
		f.e("MixpanelAPI.API", stringbuilder.toString());
		if(!j.e(c.a).j())
			c.a(inappnotification);
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

	j$d$3(j.d d1, InAppNotification inappnotification, Activity activity)
	{
		c = d1;
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
