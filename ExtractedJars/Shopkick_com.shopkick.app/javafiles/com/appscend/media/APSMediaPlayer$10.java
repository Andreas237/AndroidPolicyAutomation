// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import com.appscend.media.events.APSMediaEvent;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

class APSMediaPlayer$10 extends TimerTask
{

	public void run()
	{
		if(APSMediaPlayer.access$600(APSMediaPlayer.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field APSMediaPlayer this$0>
	//*   2    4:invokestatic    #25  <Method boolean APSMediaPlayer.access$600(APSMediaPlayer)>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		int j = duration();
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field APSMediaPlayer this$0>
	//    7   15:invokevirtual   #29  <Method int APSMediaPlayer.duration()>
	//    8   18:istore_2        
		if(j > 0 && !APSMediaPlayer.access$700(APSMediaPlayer.this))
	//*   9   19:iload_2         
	//*  10   20:ifle            41
	//*  11   23:aload_0         
	//*  12   24:getfield        #15  <Field APSMediaPlayer this$0>
	//*  13   27:invokestatic    #32  <Method boolean APSMediaPlayer.access$700(APSMediaPlayer)>
	//*  14   30:ifne            41
			APSMediaPlayer.access$800(APSMediaPlayer.this, j);
	//   15   33:aload_0         
	//   16   34:getfield        #15  <Field APSMediaPlayer this$0>
	//   17   37:iload_2         
	//   18   38:invokestatic    #36  <Method void APSMediaPlayer.access$800(APSMediaPlayer, int)>
		if(_eventsToInsert.size() > 0)
	//*  19   41:aload_0         
	//*  20   42:getfield        #15  <Field APSMediaPlayer this$0>
	//*  21   45:getfield        #40  <Field CopyOnWriteArrayList APSMediaPlayer._eventsToInsert>
	//*  22   48:invokevirtual   #45  <Method int CopyOnWriteArrayList.size()>
	//*  23   51:ifle            82
		{
			_eventsToTrigger.addAll(((java.util.Collection) (_eventsToInsert)));
	//   24   54:aload_0         
	//   25   55:getfield        #15  <Field APSMediaPlayer this$0>
	//   26   58:getfield        #48  <Field CopyOnWriteArrayList APSMediaPlayer._eventsToTrigger>
	//   27   61:aload_0         
	//   28   62:getfield        #15  <Field APSMediaPlayer this$0>
	//   29   65:getfield        #40  <Field CopyOnWriteArrayList APSMediaPlayer._eventsToInsert>
	//   30   68:invokevirtual   #52  <Method boolean CopyOnWriteArrayList.addAll(java.util.Collection)>
	//   31   71:pop             
			_eventsToInsert.clear();
	//   32   72:aload_0         
	//   33   73:getfield        #15  <Field APSMediaPlayer this$0>
	//   34   76:getfield        #40  <Field CopyOnWriteArrayList APSMediaPlayer._eventsToInsert>
	//   35   79:invokevirtual   #55  <Method void CopyOnWriteArrayList.clear()>
		}
		int i = currentPlaybackTime();
	//   36   82:aload_0         
	//   37   83:getfield        #15  <Field APSMediaPlayer this$0>
	//   38   86:invokevirtual   #58  <Method int APSMediaPlayer.currentPlaybackTime()>
	//   39   89:istore_1        
		APSMediaPlayer.access$902(APSMediaPlayer.this, i);
	//   40   90:aload_0         
	//   41   91:getfield        #15  <Field APSMediaPlayer this$0>
	//   42   94:iload_1         
	//   43   95:i2l             
	//   44   96:invokestatic    #62  <Method long APSMediaPlayer.access$902(APSMediaPlayer, long)>
	//   45   99:pop2            
		if(i > 0)
	//*  46  100:iload_1         
	//*  47  101:ifle            113
			i /= 1000;
	//   48  104:iload_1         
	//   49  105:sipush          1000
	//   50  108:idiv            
	//   51  109:istore_1        
		else
	//*  52  110:goto            115
			i = 0;
	//   53  113:iconst_0        
	//   54  114:istore_1        
		APSMediaPlayer.access$1000(APSMediaPlayer.this, i);
	//   55  115:aload_0         
	//   56  116:getfield        #15  <Field APSMediaPlayer this$0>
	//   57  119:iload_1         
	//   58  120:invokestatic    #65  <Method void APSMediaPlayer.access$1000(APSMediaPlayer, int)>
		APSMediaPlayer.access$1100(APSMediaPlayer.this, i);
	//   59  123:aload_0         
	//   60  124:getfield        #15  <Field APSMediaPlayer this$0>
	//   61  127:iload_1         
	//   62  128:invokestatic    #68  <Method void APSMediaPlayer.access$1100(APSMediaPlayer, int)>
		APSMediaPlayer.access$1200(APSMediaPlayer.this, i);
	//   63  131:aload_0         
	//   64  132:getfield        #15  <Field APSMediaPlayer this$0>
	//   65  135:iload_1         
	//   66  136:invokestatic    #71  <Method void APSMediaPlayer.access$1200(APSMediaPlayer, int)>
		if(APSMediaPlayer.access$700(APSMediaPlayer.this))
	//*  67  139:aload_0         
	//*  68  140:getfield        #15  <Field APSMediaPlayer this$0>
	//*  69  143:invokestatic    #32  <Method boolean APSMediaPlayer.access$700(APSMediaPlayer)>
	//*  70  146:ifeq            393
		{
			APSMediaPlayer.access$1300(APSMediaPlayer.this);
	//   71  149:aload_0         
	//   72  150:getfield        #15  <Field APSMediaPlayer this$0>
	//   73  153:invokestatic    #74  <Method void APSMediaPlayer.access$1300(APSMediaPlayer)>
			Object obj = ((Object) (new HashMap(((java.util.Map) (_dynamicTracking)))));
	//   74  156:new             #76  <Class HashMap>
	//   75  159:dup             
	//   76  160:aload_0         
	//   77  161:getfield        #15  <Field APSMediaPlayer this$0>
	//   78  164:getfield        #80  <Field HashMap APSMediaPlayer._dynamicTracking>
	//   79  167:invokespecial   #83  <Method void HashMap(java.util.Map)>
	//   80  170:astore_3        
			try
			{
				obj = ((Object) (((HashMap) (obj)).keySet().iterator()));
	//   81  171:aload_3         
	//   82  172:invokevirtual   #87  <Method Set HashMap.keySet()>
	//   83  175:invokeinterface #93  <Method Iterator Set.iterator()>
	//   84  180:astore_3        
				do
				{
					if(!((Iterator) (obj)).hasNext())
						break;
	//   85  181:aload_3         
	//   86  182:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//   87  187:ifeq            301
					String s = (String)((Iterator) (obj)).next();
	//   88  190:aload_3         
	//   89  191:invokeinterface #103 <Method Object Iterator.next()>
	//   90  196:checkcast       #105 <Class String>
	//   91  199:astore          4
					if(Integer.parseInt(s) <= i)
	//*  92  201:aload           4
	//*  93  203:invokestatic    #111 <Method int Integer.parseInt(String)>
	//*  94  206:iload_1         
	//*  95  207:icmpgt          181
					{
						APSMediaPlayer apsmediaplayer = APSMediaPlayer.this;
	//   96  210:aload_0         
	//   97  211:getfield        #15  <Field APSMediaPlayer this$0>
	//   98  214:astore          5
						ArrayList arraylist = (ArrayList)_dynamicTracking.get(((Object) (s)));
	//   99  216:aload_0         
	//  100  217:getfield        #15  <Field APSMediaPlayer this$0>
	//  101  220:getfield        #80  <Field HashMap APSMediaPlayer._dynamicTracking>
	//  102  223:aload           4
	//  103  225:invokevirtual   #115 <Method Object HashMap.get(Object)>
	//  104  228:checkcast       #117 <Class ArrayList>
	//  105  231:astore          6
						StringBuilder stringbuilder = new StringBuilder();
	//  106  233:new             #119 <Class StringBuilder>
	//  107  236:dup             
	//  108  237:invokespecial   #120 <Method void StringBuilder()>
	//  109  240:astore          7
						stringbuilder.append("progress to ");
	//  110  242:aload           7
	//  111  244:ldc1            #122 <String "progress to ">
	//  112  246:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//  113  249:pop             
						stringbuilder.append(s);
	//  114  250:aload           7
	//  115  252:aload           4
	//  116  254:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//  117  257:pop             
						apsmediaplayer.trackforEvent(arraylist, stringbuilder.toString(), ents.MediaEventType.POSITION, ((APSMediaEvent) (_currentUnit)));
	//  118  258:aload           5
	//  119  260:aload           6
	//  120  262:aload           7
	//  121  264:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  122  267:getstatic       #136 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.POSITION>
	//  123  270:aload_0         
	//  124  271:getfield        #15  <Field APSMediaPlayer this$0>
	//  125  274:getfield        #140 <Field com.appscend.media.events.APSMediaUnit APSMediaPlayer._currentUnit>
	//  126  277:invokevirtual   #144 <Method void APSMediaPlayer.trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
						_dynamicTracking.remove(((Object) (s)));
	//  127  280:aload_0         
	//  128  281:getfield        #15  <Field APSMediaPlayer this$0>
	//  129  284:getfield        #80  <Field HashMap APSMediaPlayer._dynamicTracking>
	//  130  287:aload           4
	//  131  289:invokevirtual   #147 <Method Object HashMap.remove(Object)>
	//  132  292:pop             
					}
				} while(true);
	//  133  293:goto            181
			}
			catch(Exception exception)
	//* 134  296:astore_3        
			{
				exception.printStackTrace();
	//  135  297:aload_3         
	//  136  298:invokevirtual   #150 <Method void Exception.printStackTrace()>
			}
			if(APSMediaPlayer.access$1400(APSMediaPlayer.this) < APSMediaPlayer.access$1500(APSMediaPlayer.this).size())
	//* 137  301:aload_0         
	//* 138  302:getfield        #15  <Field APSMediaPlayer this$0>
	//* 139  305:invokestatic    #154 <Method int APSMediaPlayer.access$1400(APSMediaPlayer)>
	//* 140  308:aload_0         
	//* 141  309:getfield        #15  <Field APSMediaPlayer this$0>
	//* 142  312:invokestatic    #158 <Method ArrayList APSMediaPlayer.access$1500(APSMediaPlayer)>
	//* 143  315:invokevirtual   #159 <Method int ArrayList.size()>
	//* 144  318:icmpge          393
			{
				Object obj1 = APSMediaPlayer.access$1500(APSMediaPlayer.this).get(APSMediaPlayer.access$1400(APSMediaPlayer.this));
	//  145  321:aload_0         
	//  146  322:getfield        #15  <Field APSMediaPlayer this$0>
	//  147  325:invokestatic    #158 <Method ArrayList APSMediaPlayer.access$1500(APSMediaPlayer)>
	//  148  328:aload_0         
	//  149  329:getfield        #15  <Field APSMediaPlayer this$0>
	//  150  332:invokestatic    #154 <Method int APSMediaPlayer.access$1400(APSMediaPlayer)>
	//  151  335:invokevirtual   #162 <Method Object ArrayList.get(int)>
	//  152  338:astore_3        
				if(!isMediaUnit(obj1))
	//* 153  339:aload_0         
	//* 154  340:getfield        #15  <Field APSMediaPlayer this$0>
	//* 155  343:aload_3         
	//* 156  344:invokevirtual   #166 <Method boolean APSMediaPlayer.isMediaUnit(Object)>
	//* 157  347:ifne            393
				{
					obj1 = ((Object) ((APSMediaEvent)obj1));
	//  158  350:aload_3         
	//  159  351:checkcast       #168 <Class APSMediaEvent>
	//  160  354:astore_3        
					if(((APSMediaEvent) (obj1)).getState() == com.appscend.media.events.ediaEventState.APSMediaEventStateUnloaded && (long)(duration() - currentPlaybackTime()) < ((APSMediaEvent) (obj1)).preloadInterval)
	//* 161  355:aload_3         
	//* 162  356:invokevirtual   #172 <Method com.appscend.media.events.APSMediaEvent$APSMediaEventState APSMediaEvent.getState()>
	//* 163  359:getstatic       #178 <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStateUnloaded>
	//* 164  362:if_acmpne       393
	//* 165  365:aload_0         
	//* 166  366:getfield        #15  <Field APSMediaPlayer this$0>
	//* 167  369:invokevirtual   #29  <Method int APSMediaPlayer.duration()>
	//* 168  372:aload_0         
	//* 169  373:getfield        #15  <Field APSMediaPlayer this$0>
	//* 170  376:invokevirtual   #58  <Method int APSMediaPlayer.currentPlaybackTime()>
	//* 171  379:isub            
	//* 172  380:i2l             
	//* 173  381:aload_3         
	//* 174  382:getfield        #182 <Field long APSMediaEvent.preloadInterval>
	//* 175  385:lcmp            
	//* 176  386:ifge            393
						((APSMediaEvent) (obj1)).preload();
	//  177  389:aload_3         
	//  178  390:invokevirtual   #185 <Method void APSMediaEvent.preload()>
				}
			}
		}
		Bundle bundle;
		try
		{
			LocalBroadcastManager.getInstance(((android.content.Context) (APSMediaPlayer.access$1600(APSMediaPlayer.this)))).sendBroadcast(new Intent("com.appscend.mp.notifications.update"));
	//  179  393:aload_0         
	//  180  394:getfield        #15  <Field APSMediaPlayer this$0>
	//  181  397:invokestatic    #189 <Method android.app.Activity APSMediaPlayer.access$1600(APSMediaPlayer)>
	//  182  400:invokestatic    #195 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(android.content.Context)>
	//  183  403:new             #197 <Class Intent>
	//  184  406:dup             
	//  185  407:ldc1            #199 <String "com.appscend.mp.notifications.update">
	//  186  409:invokespecial   #202 <Method void Intent(String)>
	//  187  412:invokevirtual   #206 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//  188  415:pop             
		}
	//* 189  416:new             #208 <Class Bundle>
	//* 190  419:dup             
	//* 191  420:invokespecial   #209 <Method void Bundle()>
	//* 192  423:astore_3        
	//* 193  424:aload_3         
	//* 194  425:ldc1            #211 <String "position">
	//* 195  427:iload_1         
	//* 196  428:invokevirtual   #215 <Method void Bundle.putInt(String, int)>
	//* 197  431:aload_3         
	//* 198  432:ldc1            #216 <String "duration">
	//* 199  434:iload_2         
	//* 200  435:invokevirtual   #215 <Method void Bundle.putInt(String, int)>
	//* 201  438:aload_0         
	//* 202  439:getfield        #15  <Field APSMediaPlayer this$0>
	//* 203  442:new             #117 <Class ArrayList>
	//* 204  445:dup             
	//* 205  446:invokespecial   #217 <Method void ArrayList()>
	//* 206  449:ldc1            #219 <String "clock_tick">
	//* 207  451:getstatic       #222 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.CLOCK_TICK>
	//* 208  454:aload_3         
	//* 209  455:aload_0         
	//* 210  456:getfield        #15  <Field APSMediaPlayer this$0>
	//* 211  459:getfield        #140 <Field com.appscend.media.events.APSMediaUnit APSMediaPlayer._currentUnit>
	//* 212  462:invokevirtual   #226 <Method void APSMediaPlayer.emitEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, Bundle, APSMediaEvent)>
	//* 213  465:return          
		catch(Exception exception1) { }
	//  214  466:astore_3        
		bundle = new Bundle();
		bundle.putInt("position", i);
		bundle.putInt("duration", j);
		emitEvent(new ArrayList(), "clock_tick", ents.MediaEventType.CLOCK_TICK, bundle, ((APSMediaEvent) (_currentUnit)));
	//* 215  467:goto            416
	}

	final APSMediaPlayer this$0;

	APSMediaPlayer$10()
	{
		this$0 = APSMediaPlayer.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field APSMediaPlayer this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void TimerTask()>
	//    5    9:return          
	}
}
