// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			NotificationBuilderWithBuilderAccessor, RemoteInput, NotificationCompatJellybean, NotificationCompat

class NotificationCompatBuilder
	implements NotificationBuilderWithBuilderAccessor
{

	NotificationCompatBuilder(NotificationCompat.Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #32  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void ArrayList()>
	//    6   12:putfield        #35  <Field List mActionExtrasList>
	//    7   15:aload_0         
	//    8   16:new             #37  <Class Bundle>
	//    9   19:dup             
	//   10   20:invokespecial   #38  <Method void Bundle()>
	//   11   23:putfield        #40  <Field Bundle mExtras>
		mBuilderCompat = builder;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #42  <Field NotificationCompat$Builder mBuilderCompat>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  15   31:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   34:bipush          26
	//*  17   36:icmplt          61
			mBuilder = new android.app.Notification.Builder(builder.mContext, builder.mChannelId);
	//   18   39:aload_0         
	//   19   40:new             #49  <Class android.app.Notification$Builder>
	//   20   43:dup             
	//   21   44:aload_1         
	//   22   45:getfield        #55  <Field android.content.Context NotificationCompat$Builder.mContext>
	//   23   48:aload_1         
	//   24   49:getfield        #59  <Field String NotificationCompat$Builder.mChannelId>
	//   25   52:invokespecial   #62  <Method void android.app.Notification$Builder(android.content.Context, String)>
	//   26   55:putfield        #64  <Field android.app.Notification$Builder mBuilder>
		else
	//*  27   58:goto            76
			mBuilder = new android.app.Notification.Builder(builder.mContext);
	//   28   61:aload_0         
	//   29   62:new             #49  <Class android.app.Notification$Builder>
	//   30   65:dup             
	//   31   66:aload_1         
	//   32   67:getfield        #55  <Field android.content.Context NotificationCompat$Builder.mContext>
	//   33   70:invokespecial   #67  <Method void android.app.Notification$Builder(android.content.Context)>
	//   34   73:putfield        #64  <Field android.app.Notification$Builder mBuilder>
		Notification notification = builder.mNotification;
	//   35   76:aload_1         
	//   36   77:getfield        #71  <Field Notification NotificationCompat$Builder.mNotification>
	//   37   80:astore_3        
		android.app.Notification.Builder builder1 = mBuilder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
	//   38   81:aload_0         
	//   39   82:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//   40   85:aload_3         
	//   41   86:getfield        #77  <Field long Notification.when>
	//   42   89:invokevirtual   #81  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//   43   92:aload_3         
	//   44   93:getfield        #84  <Field int Notification.icon>
	//   45   96:aload_3         
	//   46   97:getfield        #87  <Field int Notification.iconLevel>
	//   47  100:invokevirtual   #91  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
	//   48  103:aload_3         
	//   49  104:getfield        #94  <Field RemoteViews Notification.contentView>
	//   50  107:invokevirtual   #98  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
	//   51  110:aload_3         
	//   52  111:getfield        #102 <Field CharSequence Notification.tickerText>
	//   53  114:aload_1         
	//   54  115:getfield        #105 <Field RemoteViews NotificationCompat$Builder.mTickerView>
	//   55  118:invokevirtual   #109 <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
	//   56  121:aload_3         
	//   57  122:getfield        #113 <Field long[] Notification.vibrate>
	//   58  125:invokevirtual   #117 <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
	//   59  128:aload_3         
	//   60  129:getfield        #120 <Field int Notification.ledARGB>
	//   61  132:aload_3         
	//   62  133:getfield        #123 <Field int Notification.ledOnMS>
	//   63  136:aload_3         
	//   64  137:getfield        #126 <Field int Notification.ledOffMS>
	//   65  140:invokevirtual   #130 <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
	//   66  143:astore          4
		boolean flag;
		if((notification.flags & 2) != 0)
	//*  67  145:aload_3         
	//*  68  146:getfield        #133 <Field int Notification.flags>
	//*  69  149:iconst_2        
	//*  70  150:iand            
	//*  71  151:ifeq            159
			flag = true;
	//   72  154:iconst_1        
	//   73  155:istore_2        
		else
	//*  74  156:goto            161
			flag = false;
	//   75  159:iconst_0        
	//   76  160:istore_2        
		builder1 = builder1.setOngoing(flag);
	//   77  161:aload           4
	//   78  163:iload_2         
	//   79  164:invokevirtual   #137 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//   80  167:astore          4
		if((notification.flags & 8) != 0)
	//*  81  169:aload_3         
	//*  82  170:getfield        #133 <Field int Notification.flags>
	//*  83  173:bipush          8
	//*  84  175:iand            
	//*  85  176:ifeq            184
			flag = true;
	//   86  179:iconst_1        
	//   87  180:istore_2        
		else
	//*  88  181:goto            186
			flag = false;
	//   89  184:iconst_0        
	//   90  185:istore_2        
		builder1 = builder1.setOnlyAlertOnce(flag);
	//   91  186:aload           4
	//   92  188:iload_2         
	//   93  189:invokevirtual   #140 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
	//   94  192:astore          4
		if((notification.flags & 0x10) != 0)
	//*  95  194:aload_3         
	//*  96  195:getfield        #133 <Field int Notification.flags>
	//*  97  198:bipush          16
	//*  98  200:iand            
	//*  99  201:ifeq            209
			flag = true;
	//  100  204:iconst_1        
	//  101  205:istore_2        
		else
	//* 102  206:goto            211
			flag = false;
	//  103  209:iconst_0        
	//  104  210:istore_2        
		builder1 = builder1.setAutoCancel(flag).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent);
	//  105  211:aload           4
	//  106  213:iload_2         
	//  107  214:invokevirtual   #143 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//  108  217:aload_3         
	//  109  218:getfield        #146 <Field int Notification.defaults>
	//  110  221:invokevirtual   #150 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//  111  224:aload_1         
	//  112  225:getfield        #153 <Field CharSequence NotificationCompat$Builder.mContentTitle>
	//  113  228:invokevirtual   #157 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//  114  231:aload_1         
	//  115  232:getfield        #160 <Field CharSequence NotificationCompat$Builder.mContentText>
	//  116  235:invokevirtual   #163 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//  117  238:aload_1         
	//  118  239:getfield        #166 <Field CharSequence NotificationCompat$Builder.mContentInfo>
	//  119  242:invokevirtual   #169 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
	//  120  245:aload_1         
	//  121  246:getfield        #173 <Field android.app.PendingIntent NotificationCompat$Builder.mContentIntent>
	//  122  249:invokevirtual   #177 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(android.app.PendingIntent)>
	//  123  252:aload_3         
	//  124  253:getfield        #180 <Field android.app.PendingIntent Notification.deleteIntent>
	//  125  256:invokevirtual   #183 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(android.app.PendingIntent)>
	//  126  259:astore          4
		android.app.PendingIntent pendingintent = builder.mFullScreenIntent;
	//  127  261:aload_1         
	//  128  262:getfield        #186 <Field android.app.PendingIntent NotificationCompat$Builder.mFullScreenIntent>
	//  129  265:astore          5
		if((notification.flags & 0x80) != 0)
	//* 130  267:aload_3         
	//* 131  268:getfield        #133 <Field int Notification.flags>
	//* 132  271:sipush          128
	//* 133  274:iand            
	//* 134  275:ifeq            283
			flag = true;
	//  135  278:iconst_1        
	//  136  279:istore_2        
		else
	//* 137  280:goto            285
			flag = false;
	//  138  283:iconst_0        
	//  139  284:istore_2        
		builder1.setFullScreenIntent(pendingintent, flag).setLargeIcon(builder.mLargeIcon).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
	//  140  285:aload           4
	//  141  287:aload           5
	//  142  289:iload_2         
	//  143  290:invokevirtual   #190 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(android.app.PendingIntent, boolean)>
	//  144  293:aload_1         
	//  145  294:getfield        #194 <Field android.graphics.Bitmap NotificationCompat$Builder.mLargeIcon>
	//  146  297:invokevirtual   #198 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(android.graphics.Bitmap)>
	//  147  300:aload_1         
	//  148  301:getfield        #201 <Field int NotificationCompat$Builder.mNumber>
	//  149  304:invokevirtual   #204 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
	//  150  307:aload_1         
	//  151  308:getfield        #207 <Field int NotificationCompat$Builder.mProgressMax>
	//  152  311:aload_1         
	//  153  312:getfield        #210 <Field int NotificationCompat$Builder.mProgress>
	//  154  315:aload_1         
	//  155  316:getfield        #214 <Field boolean NotificationCompat$Builder.mProgressIndeterminate>
	//  156  319:invokevirtual   #218 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
	//  157  322:pop             
		if(android.os.Build.VERSION.SDK_INT < 21)
	//* 158  323:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 159  326:bipush          21
	//* 160  328:icmpge          347
			mBuilder.setSound(notification.sound, notification.audioStreamType);
	//  161  331:aload_0         
	//  162  332:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  163  335:aload_3         
	//  164  336:getfield        #222 <Field android.net.Uri Notification.sound>
	//  165  339:aload_3         
	//  166  340:getfield        #225 <Field int Notification.audioStreamType>
	//  167  343:invokevirtual   #229 <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
	//  168  346:pop             
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//* 169  347:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 170  350:bipush          16
	//* 171  352:icmplt          551
		{
			mBuilder.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
	//  172  355:aload_0         
	//  173  356:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  174  359:aload_1         
	//  175  360:getfield        #232 <Field CharSequence NotificationCompat$Builder.mSubText>
	//  176  363:invokevirtual   #235 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
	//  177  366:aload_1         
	//  178  367:getfield        #238 <Field boolean NotificationCompat$Builder.mUseChronometer>
	//  179  370:invokevirtual   #241 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
	//  180  373:aload_1         
	//  181  374:getfield        #244 <Field int NotificationCompat$Builder.mPriority>
	//  182  377:invokevirtual   #247 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
	//  183  380:pop             
			for(Iterator iterator1 = builder.mActions.iterator(); iterator1.hasNext(); addAction((NotificationCompat.Action)iterator1.next()));
	//  184  381:aload_1         
	//  185  382:getfield        #251 <Field ArrayList NotificationCompat$Builder.mActions>
	//  186  385:invokevirtual   #255 <Method Iterator ArrayList.iterator()>
	//  187  388:astore          4
	//  188  390:aload           4
	//  189  392:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//  190  397:ifeq            417
	//  191  400:aload_0         
	//  192  401:aload           4
	//  193  403:invokeinterface #265 <Method Object Iterator.next()>
	//  194  408:checkcast       #267 <Class NotificationCompat$Action>
	//  195  411:invokespecial   #271 <Method void addAction(NotificationCompat$Action)>
	//* 196  414:goto            390
			if(builder.mExtras != null)
	//* 197  417:aload_1         
	//* 198  418:getfield        #272 <Field Bundle NotificationCompat$Builder.mExtras>
	//* 199  421:ifnull          435
				mExtras.putAll(builder.mExtras);
	//  200  424:aload_0         
	//  201  425:getfield        #40  <Field Bundle mExtras>
	//  202  428:aload_1         
	//  203  429:getfield        #272 <Field Bundle NotificationCompat$Builder.mExtras>
	//  204  432:invokevirtual   #276 <Method void Bundle.putAll(Bundle)>
			if(android.os.Build.VERSION.SDK_INT < 20)
	//* 205  435:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 206  438:bipush          20
	//* 207  440:icmpge          535
			{
				if(builder.mLocalOnly)
	//* 208  443:aload_1         
	//* 209  444:getfield        #279 <Field boolean NotificationCompat$Builder.mLocalOnly>
	//* 210  447:ifeq            461
					mExtras.putBoolean("android.support.localOnly", true);
	//  211  450:aload_0         
	//  212  451:getfield        #40  <Field Bundle mExtras>
	//  213  454:ldc2            #281 <String "android.support.localOnly">
	//  214  457:iconst_1        
	//  215  458:invokevirtual   #285 <Method void Bundle.putBoolean(String, boolean)>
				if(builder.mGroupKey != null)
	//* 216  461:aload_1         
	//* 217  462:getfield        #288 <Field String NotificationCompat$Builder.mGroupKey>
	//* 218  465:ifnull          514
				{
					mExtras.putString("android.support.groupKey", builder.mGroupKey);
	//  219  468:aload_0         
	//  220  469:getfield        #40  <Field Bundle mExtras>
	//  221  472:ldc2            #290 <String "android.support.groupKey">
	//  222  475:aload_1         
	//  223  476:getfield        #288 <Field String NotificationCompat$Builder.mGroupKey>
	//  224  479:invokevirtual   #294 <Method void Bundle.putString(String, String)>
					if(builder.mGroupSummary)
	//* 225  482:aload_1         
	//* 226  483:getfield        #297 <Field boolean NotificationCompat$Builder.mGroupSummary>
	//* 227  486:ifeq            503
						mExtras.putBoolean("android.support.isGroupSummary", true);
	//  228  489:aload_0         
	//  229  490:getfield        #40  <Field Bundle mExtras>
	//  230  493:ldc2            #299 <String "android.support.isGroupSummary">
	//  231  496:iconst_1        
	//  232  497:invokevirtual   #285 <Method void Bundle.putBoolean(String, boolean)>
					else
	//* 233  500:goto            514
						mExtras.putBoolean("android.support.useSideChannel", true);
	//  234  503:aload_0         
	//  235  504:getfield        #40  <Field Bundle mExtras>
	//  236  507:ldc2            #301 <String "android.support.useSideChannel">
	//  237  510:iconst_1        
	//  238  511:invokevirtual   #285 <Method void Bundle.putBoolean(String, boolean)>
				}
				if(builder.mSortKey != null)
	//* 239  514:aload_1         
	//* 240  515:getfield        #304 <Field String NotificationCompat$Builder.mSortKey>
	//* 241  518:ifnull          535
					mExtras.putString("android.support.sortKey", builder.mSortKey);
	//  242  521:aload_0         
	//  243  522:getfield        #40  <Field Bundle mExtras>
	//  244  525:ldc2            #306 <String "android.support.sortKey">
	//  245  528:aload_1         
	//  246  529:getfield        #304 <Field String NotificationCompat$Builder.mSortKey>
	//  247  532:invokevirtual   #294 <Method void Bundle.putString(String, String)>
			}
			mContentView = builder.mContentView;
	//  248  535:aload_0         
	//  249  536:aload_1         
	//  250  537:getfield        #308 <Field RemoteViews NotificationCompat$Builder.mContentView>
	//  251  540:putfield        #309 <Field RemoteViews mContentView>
			mBigContentView = builder.mBigContentView;
	//  252  543:aload_0         
	//  253  544:aload_1         
	//  254  545:getfield        #311 <Field RemoteViews NotificationCompat$Builder.mBigContentView>
	//  255  548:putfield        #312 <Field RemoteViews mBigContentView>
		}
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//* 256  551:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 257  554:bipush          19
	//* 258  556:icmplt          626
		{
			mBuilder.setShowWhen(builder.mShowWhen);
	//  259  559:aload_0         
	//  260  560:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  261  563:aload_1         
	//  262  564:getfield        #315 <Field boolean NotificationCompat$Builder.mShowWhen>
	//  263  567:invokevirtual   #318 <Method android.app.Notification$Builder android.app.Notification$Builder.setShowWhen(boolean)>
	//  264  570:pop             
			if(android.os.Build.VERSION.SDK_INT < 21 && builder.mPeople != null && !builder.mPeople.isEmpty())
	//* 265  571:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 266  574:bipush          21
	//* 267  576:icmpge          626
	//* 268  579:aload_1         
	//* 269  580:getfield        #321 <Field ArrayList NotificationCompat$Builder.mPeople>
	//* 270  583:ifnull          626
	//* 271  586:aload_1         
	//* 272  587:getfield        #321 <Field ArrayList NotificationCompat$Builder.mPeople>
	//* 273  590:invokevirtual   #324 <Method boolean ArrayList.isEmpty()>
	//* 274  593:ifne            626
				mExtras.putStringArray("android.people", (String[])builder.mPeople.toArray(((Object []) (new String[builder.mPeople.size()]))));
	//  275  596:aload_0         
	//  276  597:getfield        #40  <Field Bundle mExtras>
	//  277  600:ldc2            #326 <String "android.people">
	//  278  603:aload_1         
	//  279  604:getfield        #321 <Field ArrayList NotificationCompat$Builder.mPeople>
	//  280  607:aload_1         
	//  281  608:getfield        #321 <Field ArrayList NotificationCompat$Builder.mPeople>
	//  282  611:invokevirtual   #330 <Method int ArrayList.size()>
	//  283  614:anewarray       String[]
	//  284  617:invokevirtual   #336 <Method Object[] ArrayList.toArray(Object[])>
	//  285  620:checkcast       #338 <Class String[]>
	//  286  623:invokevirtual   #342 <Method void Bundle.putStringArray(String, String[])>
		}
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//* 287  626:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 288  629:bipush          20
	//* 289  631:icmplt          675
		{
			mBuilder.setLocalOnly(builder.mLocalOnly).setGroup(builder.mGroupKey).setGroupSummary(builder.mGroupSummary).setSortKey(builder.mSortKey);
	//  290  634:aload_0         
	//  291  635:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  292  638:aload_1         
	//  293  639:getfield        #279 <Field boolean NotificationCompat$Builder.mLocalOnly>
	//  294  642:invokevirtual   #345 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
	//  295  645:aload_1         
	//  296  646:getfield        #288 <Field String NotificationCompat$Builder.mGroupKey>
	//  297  649:invokevirtual   #349 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
	//  298  652:aload_1         
	//  299  653:getfield        #297 <Field boolean NotificationCompat$Builder.mGroupSummary>
	//  300  656:invokevirtual   #352 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
	//  301  659:aload_1         
	//  302  660:getfield        #304 <Field String NotificationCompat$Builder.mSortKey>
	//  303  663:invokevirtual   #355 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
	//  304  666:pop             
			mGroupAlertBehavior = builder.mGroupAlertBehavior;
	//  305  667:aload_0         
	//  306  668:aload_1         
	//  307  669:getfield        #357 <Field int NotificationCompat$Builder.mGroupAlertBehavior>
	//  308  672:putfield        #358 <Field int mGroupAlertBehavior>
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 309  675:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 310  678:bipush          21
	//* 311  680:icmplt          776
		{
			mBuilder.setCategory(builder.mCategory).setColor(builder.mColor).setVisibility(builder.mVisibility).setPublicVersion(builder.mPublicVersion).setSound(notification.sound, notification.audioAttributes);
	//  312  683:aload_0         
	//  313  684:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  314  687:aload_1         
	//  315  688:getfield        #361 <Field String NotificationCompat$Builder.mCategory>
	//  316  691:invokevirtual   #364 <Method android.app.Notification$Builder android.app.Notification$Builder.setCategory(String)>
	//  317  694:aload_1         
	//  318  695:getfield        #367 <Field int NotificationCompat$Builder.mColor>
	//  319  698:invokevirtual   #370 <Method android.app.Notification$Builder android.app.Notification$Builder.setColor(int)>
	//  320  701:aload_1         
	//  321  702:getfield        #373 <Field int NotificationCompat$Builder.mVisibility>
	//  322  705:invokevirtual   #376 <Method android.app.Notification$Builder android.app.Notification$Builder.setVisibility(int)>
	//  323  708:aload_1         
	//  324  709:getfield        #379 <Field Notification NotificationCompat$Builder.mPublicVersion>
	//  325  712:invokevirtual   #383 <Method android.app.Notification$Builder android.app.Notification$Builder.setPublicVersion(Notification)>
	//  326  715:aload_3         
	//  327  716:getfield        #222 <Field android.net.Uri Notification.sound>
	//  328  719:aload_3         
	//  329  720:getfield        #387 <Field android.media.AudioAttributes Notification.audioAttributes>
	//  330  723:invokevirtual   #390 <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, android.media.AudioAttributes)>
	//  331  726:pop             
			String s;
			for(Iterator iterator = builder.mPeople.iterator(); iterator.hasNext(); mBuilder.addPerson(s))
	//* 332  727:aload_1         
	//* 333  728:getfield        #321 <Field ArrayList NotificationCompat$Builder.mPeople>
	//* 334  731:invokevirtual   #255 <Method Iterator ArrayList.iterator()>
	//* 335  734:astore_3        
	//* 336  735:aload_3         
	//* 337  736:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//* 338  741:ifeq            768
				s = (String)iterator.next();
	//  339  744:aload_3         
	//  340  745:invokeinterface #265 <Method Object Iterator.next()>
	//  341  750:checkcast       #332 <Class String>
	//  342  753:astore          4

	//  343  755:aload_0         
	//  344  756:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  345  759:aload           4
	//  346  761:invokevirtual   #393 <Method android.app.Notification$Builder android.app.Notification$Builder.addPerson(String)>
	//  347  764:pop             
	//* 348  765:goto            735
			mHeadsUpContentView = builder.mHeadsUpContentView;
	//  349  768:aload_0         
	//  350  769:aload_1         
	//  351  770:getfield        #395 <Field RemoteViews NotificationCompat$Builder.mHeadsUpContentView>
	//  352  773:putfield        #396 <Field RemoteViews mHeadsUpContentView>
		}
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//* 353  776:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 354  779:bipush          24
	//* 355  781:icmplt          860
		{
			mBuilder.setExtras(builder.mExtras).setRemoteInputHistory(builder.mRemoteInputHistory);
	//  356  784:aload_0         
	//  357  785:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  358  788:aload_1         
	//  359  789:getfield        #272 <Field Bundle NotificationCompat$Builder.mExtras>
	//  360  792:invokevirtual   #400 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
	//  361  795:aload_1         
	//  362  796:getfield        #404 <Field CharSequence[] NotificationCompat$Builder.mRemoteInputHistory>
	//  363  799:invokevirtual   #408 <Method android.app.Notification$Builder android.app.Notification$Builder.setRemoteInputHistory(CharSequence[])>
	//  364  802:pop             
			if(builder.mContentView != null)
	//* 365  803:aload_1         
	//* 366  804:getfield        #308 <Field RemoteViews NotificationCompat$Builder.mContentView>
	//* 367  807:ifnull          822
				mBuilder.setCustomContentView(builder.mContentView);
	//  368  810:aload_0         
	//  369  811:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  370  814:aload_1         
	//  371  815:getfield        #308 <Field RemoteViews NotificationCompat$Builder.mContentView>
	//  372  818:invokevirtual   #411 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomContentView(RemoteViews)>
	//  373  821:pop             
			if(builder.mBigContentView != null)
	//* 374  822:aload_1         
	//* 375  823:getfield        #311 <Field RemoteViews NotificationCompat$Builder.mBigContentView>
	//* 376  826:ifnull          841
				mBuilder.setCustomBigContentView(builder.mBigContentView);
	//  377  829:aload_0         
	//  378  830:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  379  833:aload_1         
	//  380  834:getfield        #311 <Field RemoteViews NotificationCompat$Builder.mBigContentView>
	//  381  837:invokevirtual   #414 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomBigContentView(RemoteViews)>
	//  382  840:pop             
			if(builder.mHeadsUpContentView != null)
	//* 383  841:aload_1         
	//* 384  842:getfield        #395 <Field RemoteViews NotificationCompat$Builder.mHeadsUpContentView>
	//* 385  845:ifnull          860
				mBuilder.setCustomHeadsUpContentView(builder.mHeadsUpContentView);
	//  386  848:aload_0         
	//  387  849:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  388  852:aload_1         
	//  389  853:getfield        #395 <Field RemoteViews NotificationCompat$Builder.mHeadsUpContentView>
	//  390  856:invokevirtual   #417 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomHeadsUpContentView(RemoteViews)>
	//  391  859:pop             
		}
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//* 392  860:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 393  863:bipush          26
	//* 394  865:icmplt          953
		{
			mBuilder.setBadgeIconType(builder.mBadgeIcon).setShortcutId(builder.mShortcutId).setTimeoutAfter(builder.mTimeout).setGroupAlertBehavior(builder.mGroupAlertBehavior);
	//  395  868:aload_0         
	//  396  869:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  397  872:aload_1         
	//  398  873:getfield        #420 <Field int NotificationCompat$Builder.mBadgeIcon>
	//  399  876:invokevirtual   #423 <Method android.app.Notification$Builder android.app.Notification$Builder.setBadgeIconType(int)>
	//  400  879:aload_1         
	//  401  880:getfield        #426 <Field String NotificationCompat$Builder.mShortcutId>
	//  402  883:invokevirtual   #429 <Method android.app.Notification$Builder android.app.Notification$Builder.setShortcutId(String)>
	//  403  886:aload_1         
	//  404  887:getfield        #432 <Field long NotificationCompat$Builder.mTimeout>
	//  405  890:invokevirtual   #435 <Method android.app.Notification$Builder android.app.Notification$Builder.setTimeoutAfter(long)>
	//  406  893:aload_1         
	//  407  894:getfield        #357 <Field int NotificationCompat$Builder.mGroupAlertBehavior>
	//  408  897:invokevirtual   #438 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupAlertBehavior(int)>
	//  409  900:pop             
			if(builder.mColorizedSet)
	//* 410  901:aload_1         
	//* 411  902:getfield        #441 <Field boolean NotificationCompat$Builder.mColorizedSet>
	//* 412  905:ifeq            920
				mBuilder.setColorized(builder.mColorized);
	//  413  908:aload_0         
	//  414  909:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  415  912:aload_1         
	//  416  913:getfield        #444 <Field boolean NotificationCompat$Builder.mColorized>
	//  417  916:invokevirtual   #447 <Method android.app.Notification$Builder android.app.Notification$Builder.setColorized(boolean)>
	//  418  919:pop             
			if(!TextUtils.isEmpty(((CharSequence) (builder.mChannelId))))
	//* 419  920:aload_1         
	//* 420  921:getfield        #59  <Field String NotificationCompat$Builder.mChannelId>
	//* 421  924:invokestatic    #452 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 422  927:ifne            953
				mBuilder.setSound(((android.net.Uri) (null))).setDefaults(0).setLights(0, 0, 0).setVibrate(((long []) (null)));
	//  423  930:aload_0         
	//  424  931:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  425  934:aconst_null     
	//  426  935:invokevirtual   #455 <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri)>
	//  427  938:iconst_0        
	//  428  939:invokevirtual   #150 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//  429  942:iconst_0        
	//  430  943:iconst_0        
	//  431  944:iconst_0        
	//  432  945:invokevirtual   #130 <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
	//  433  948:aconst_null     
	//  434  949:invokevirtual   #117 <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
	//  435  952:pop             
		}
	//  436  953:return          
	}

	private void addAction(NotificationCompat.Action action)
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          157
		{
			android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent());
	//    3    8:new             #458 <Class android.app.Notification$Action$Builder>
	//    4   11:dup             
	//    5   12:aload_1         
	//    6   13:invokevirtual   #461 <Method int NotificationCompat$Action.getIcon()>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #465 <Method CharSequence NotificationCompat$Action.getTitle()>
	//    9   20:aload_1         
	//   10   21:invokevirtual   #469 <Method android.app.PendingIntent NotificationCompat$Action.getActionIntent()>
	//   11   24:invokespecial   #472 <Method void android.app.Notification$Action$Builder(int, CharSequence, android.app.PendingIntent)>
	//   12   27:astore          5
			if(action.getRemoteInputs() != null)
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #476 <Method RemoteInput[] NotificationCompat$Action.getRemoteInputs()>
	//*  15   33:ifnull          73
			{
				android.app.RemoteInput aremoteinput[] = RemoteInput.fromCompat(action.getRemoteInputs());
	//   16   36:aload_1         
	//   17   37:invokevirtual   #476 <Method RemoteInput[] NotificationCompat$Action.getRemoteInputs()>
	//   18   40:invokestatic    #482 <Method android.app.RemoteInput[] RemoteInput.fromCompat(RemoteInput[])>
	//   19   43:astore          4
				int j = aremoteinput.length;
	//   20   45:aload           4
	//   21   47:arraylength     
	//   22   48:istore_3        
				for(int i = 0; i < j; i++)
	//*  23   49:iconst_0        
	//*  24   50:istore_2        
	//*  25   51:iload_2         
	//*  26   52:iload_3         
	//*  27   53:icmpge          73
					builder.addRemoteInput(aremoteinput[i]);
	//   28   56:aload           5
	//   29   58:aload           4
	//   30   60:iload_2         
	//   31   61:aaload          
	//   32   62:invokevirtual   #486 <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addRemoteInput(android.app.RemoteInput)>
	//   33   65:pop             

	//   34   66:iload_2         
	//   35   67:iconst_1        
	//   36   68:iadd            
	//   37   69:istore_2        
			}
	//*  38   70:goto            51
			Bundle bundle;
			if(action.getExtras() != null)
	//*  39   73:aload_1         
	//*  40   74:invokevirtual   #490 <Method Bundle NotificationCompat$Action.getExtras()>
	//*  41   77:ifnull          96
				bundle = new Bundle(action.getExtras());
	//   42   80:new             #37  <Class Bundle>
	//   43   83:dup             
	//   44   84:aload_1         
	//   45   85:invokevirtual   #490 <Method Bundle NotificationCompat$Action.getExtras()>
	//   46   88:invokespecial   #492 <Method void Bundle(Bundle)>
	//   47   91:astore          4
			else
	//*  48   93:goto            105
				bundle = new Bundle();
	//   49   96:new             #37  <Class Bundle>
	//   50   99:dup             
	//   51  100:invokespecial   #38  <Method void Bundle()>
	//   52  103:astore          4
			bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
	//   53  105:aload           4
	//   54  107:ldc2            #494 <String "android.support.allowGeneratedReplies">
	//   55  110:aload_1         
	//   56  111:invokevirtual   #497 <Method boolean NotificationCompat$Action.getAllowGeneratedReplies()>
	//   57  114:invokevirtual   #285 <Method void Bundle.putBoolean(String, boolean)>
			if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  58  117:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*  59  120:bipush          24
	//*  60  122:icmplt          135
				builder.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
	//   61  125:aload           5
	//   62  127:aload_1         
	//   63  128:invokevirtual   #497 <Method boolean NotificationCompat$Action.getAllowGeneratedReplies()>
	//   64  131:invokevirtual   #501 <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.setAllowGeneratedReplies(boolean)>
	//   65  134:pop             
			builder.addExtras(bundle);
	//   66  135:aload           5
	//   67  137:aload           4
	//   68  139:invokevirtual   #505 <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addExtras(Bundle)>
	//   69  142:pop             
			mBuilder.addAction(builder.build());
	//   70  143:aload_0         
	//   71  144:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//   72  147:aload           5
	//   73  149:invokevirtual   #509 <Method android.app.Notification$Action android.app.Notification$Action$Builder.build()>
	//   74  152:invokevirtual   #512 <Method android.app.Notification$Builder android.app.Notification$Builder.addAction(android.app.Notification$Action)>
	//   75  155:pop             
			return;
	//   76  156:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  77  157:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*  78  160:bipush          16
	//*  79  162:icmplt          183
			mActionExtrasList.add(((Object) (NotificationCompatJellybean.writeActionAndGetExtras(mBuilder, action))));
	//   80  165:aload_0         
	//   81  166:getfield        #35  <Field List mActionExtrasList>
	//   82  169:aload_0         
	//   83  170:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//   84  173:aload_1         
	//   85  174:invokestatic    #518 <Method Bundle NotificationCompatJellybean.writeActionAndGetExtras(android.app.Notification$Builder, NotificationCompat$Action)>
	//   86  177:invokeinterface #524 <Method boolean List.add(Object)>
	//   87  182:pop             
	//   88  183:return          
	}

	private void removeSoundAndVibration(Notification notification)
	{
		notification.sound = null;
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:putfield        #222 <Field android.net.Uri Notification.sound>
		notification.vibrate = null;
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:putfield        #113 <Field long[] Notification.vibrate>
		notification.defaults = notification.defaults & -2;
	//    6   10:aload_1         
	//    7   11:aload_1         
	//    8   12:getfield        #146 <Field int Notification.defaults>
	//    9   15:bipush          -2
	//   10   17:iand            
	//   11   18:putfield        #146 <Field int Notification.defaults>
		notification.defaults = notification.defaults & -3;
	//   12   21:aload_1         
	//   13   22:aload_1         
	//   14   23:getfield        #146 <Field int Notification.defaults>
	//   15   26:bipush          -3
	//   16   28:iand            
	//   17   29:putfield        #146 <Field int Notification.defaults>
	//   18   32:return          
	}

	public Notification build()
	{
		NotificationCompat.Style style = mBuilderCompat.mStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field NotificationCompat$Builder mBuilderCompat>
	//    2    4:getfield        #531 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//    3    7:astore_2        
		if(style != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          17
			style.apply(((NotificationBuilderWithBuilderAccessor) (this)));
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #537 <Method void NotificationCompat$Style.apply(NotificationBuilderWithBuilderAccessor)>
		RemoteViews remoteviews;
		if(style != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          30
			remoteviews = style.makeContentView(((NotificationBuilderWithBuilderAccessor) (this)));
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:invokevirtual   #541 <Method RemoteViews NotificationCompat$Style.makeContentView(NotificationBuilderWithBuilderAccessor)>
	//   14   26:astore_1        
		else
	//*  15   27:goto            32
			remoteviews = null;
	//   16   30:aconst_null     
	//   17   31:astore_1        
		Notification notification = buildInternal();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #544 <Method Notification buildInternal()>
	//   20   36:astore_3        
		if(remoteviews != null)
	//*  21   37:aload_1         
	//*  22   38:ifnull          49
			notification.contentView = remoteviews;
	//   23   41:aload_3         
	//   24   42:aload_1         
	//   25   43:putfield        #94  <Field RemoteViews Notification.contentView>
		else
	//*  26   46:goto            70
		if(mBuilderCompat.mContentView != null)
	//*  27   49:aload_0         
	//*  28   50:getfield        #42  <Field NotificationCompat$Builder mBuilderCompat>
	//*  29   53:getfield        #308 <Field RemoteViews NotificationCompat$Builder.mContentView>
	//*  30   56:ifnull          70
			notification.contentView = mBuilderCompat.mContentView;
	//   31   59:aload_3         
	//   32   60:aload_0         
	//   33   61:getfield        #42  <Field NotificationCompat$Builder mBuilderCompat>
	//   34   64:getfield        #308 <Field RemoteViews NotificationCompat$Builder.mContentView>
	//   35   67:putfield        #94  <Field RemoteViews Notification.contentView>
		if(android.os.Build.VERSION.SDK_INT >= 16 && style != null)
	//*  36   70:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*  37   73:bipush          16
	//*  38   75:icmplt          97
	//*  39   78:aload_2         
	//*  40   79:ifnull          97
		{
			RemoteViews remoteviews1 = style.makeBigContentView(((NotificationBuilderWithBuilderAccessor) (this)));
	//   41   82:aload_2         
	//   42   83:aload_0         
	//   43   84:invokevirtual   #547 <Method RemoteViews NotificationCompat$Style.makeBigContentView(NotificationBuilderWithBuilderAccessor)>
	//   44   87:astore_1        
			if(remoteviews1 != null)
	//*  45   88:aload_1         
	//*  46   89:ifnull          97
				notification.bigContentView = remoteviews1;
	//   47   92:aload_3         
	//   48   93:aload_1         
	//   49   94:putfield        #550 <Field RemoteViews Notification.bigContentView>
		}
		if(android.os.Build.VERSION.SDK_INT >= 21 && style != null)
	//*  50   97:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*  51  100:bipush          21
	//*  52  102:icmplt          130
	//*  53  105:aload_2         
	//*  54  106:ifnull          130
		{
			RemoteViews remoteviews2 = mBuilderCompat.mStyle.makeHeadsUpContentView(((NotificationBuilderWithBuilderAccessor) (this)));
	//   55  109:aload_0         
	//   56  110:getfield        #42  <Field NotificationCompat$Builder mBuilderCompat>
	//   57  113:getfield        #531 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   58  116:aload_0         
	//   59  117:invokevirtual   #553 <Method RemoteViews NotificationCompat$Style.makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor)>
	//   60  120:astore_1        
			if(remoteviews2 != null)
	//*  61  121:aload_1         
	//*  62  122:ifnull          130
				notification.headsUpContentView = remoteviews2;
	//   63  125:aload_3         
	//   64  126:aload_1         
	//   65  127:putfield        #556 <Field RemoteViews Notification.headsUpContentView>
		}
		if(android.os.Build.VERSION.SDK_INT >= 16 && style != null)
	//*  66  130:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*  67  133:bipush          16
	//*  68  135:icmplt          156
	//*  69  138:aload_2         
	//*  70  139:ifnull          156
		{
			Bundle bundle = NotificationCompat.getExtras(notification);
	//   71  142:aload_3         
	//   72  143:invokestatic    #561 <Method Bundle NotificationCompat.getExtras(Notification)>
	//   73  146:astore_1        
			if(bundle != null)
	//*  74  147:aload_1         
	//*  75  148:ifnull          156
				style.addCompatExtras(bundle);
	//   76  151:aload_2         
	//   77  152:aload_1         
	//   78  153:invokevirtual   #564 <Method void NotificationCompat$Style.addCompatExtras(Bundle)>
		}
		return notification;
	//   79  156:aload_3         
	//   80  157:areturn         
	}

	protected Notification buildInternal()
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          16
			return mBuilder.build();
	//    3    8:aload_0         
	//    4    9:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//    5   12:invokevirtual   #566 <Method Notification android.app.Notification$Builder.build()>
	//    6   15:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   7   16:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   19:bipush          24
	//*   9   21:icmplt          103
		{
			Notification notification = mBuilder.build();
	//   10   24:aload_0         
	//   11   25:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//   12   28:invokevirtual   #566 <Method Notification android.app.Notification$Builder.build()>
	//   13   31:astore_1        
			if(mGroupAlertBehavior != 0)
	//*  14   32:aload_0         
	//*  15   33:getfield        #358 <Field int mGroupAlertBehavior>
	//*  16   36:ifeq            101
			{
				if(notification.getGroup() != null && (notification.flags & 0x200) != 0 && mGroupAlertBehavior == 2)
	//*  17   39:aload_1         
	//*  18   40:invokevirtual   #570 <Method String Notification.getGroup()>
	//*  19   43:ifnull          70
	//*  20   46:aload_1         
	//*  21   47:getfield        #133 <Field int Notification.flags>
	//*  22   50:sipush          512
	//*  23   53:iand            
	//*  24   54:ifeq            70
	//*  25   57:aload_0         
	//*  26   58:getfield        #358 <Field int mGroupAlertBehavior>
	//*  27   61:iconst_2        
	//*  28   62:icmpne          70
					removeSoundAndVibration(notification);
	//   29   65:aload_0         
	//   30   66:aload_1         
	//   31   67:invokespecial   #572 <Method void removeSoundAndVibration(Notification)>
				if(notification.getGroup() != null && (notification.flags & 0x200) == 0 && mGroupAlertBehavior == 1)
	//*  32   70:aload_1         
	//*  33   71:invokevirtual   #570 <Method String Notification.getGroup()>
	//*  34   74:ifnull          101
	//*  35   77:aload_1         
	//*  36   78:getfield        #133 <Field int Notification.flags>
	//*  37   81:sipush          512
	//*  38   84:iand            
	//*  39   85:ifne            101
	//*  40   88:aload_0         
	//*  41   89:getfield        #358 <Field int mGroupAlertBehavior>
	//*  42   92:iconst_1        
	//*  43   93:icmpne          101
					removeSoundAndVibration(notification);
	//   44   96:aload_0         
	//   45   97:aload_1         
	//   46   98:invokespecial   #572 <Method void removeSoundAndVibration(Notification)>
			}
			return notification;
	//   47  101:aload_1         
	//   48  102:areturn         
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  49  103:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*  50  106:bipush          21
	//*  51  108:icmplt          247
		{
			mBuilder.setExtras(mExtras);
	//   52  111:aload_0         
	//   53  112:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//   54  115:aload_0         
	//   55  116:getfield        #40  <Field Bundle mExtras>
	//   56  119:invokevirtual   #400 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
	//   57  122:pop             
			Notification notification1 = mBuilder.build();
	//   58  123:aload_0         
	//   59  124:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//   60  127:invokevirtual   #566 <Method Notification android.app.Notification$Builder.build()>
	//   61  130:astore_1        
			if(mContentView != null)
	//*  62  131:aload_0         
	//*  63  132:getfield        #309 <Field RemoteViews mContentView>
	//*  64  135:ifnull          146
				notification1.contentView = mContentView;
	//   65  138:aload_1         
	//   66  139:aload_0         
	//   67  140:getfield        #309 <Field RemoteViews mContentView>
	//   68  143:putfield        #94  <Field RemoteViews Notification.contentView>
			if(mBigContentView != null)
	//*  69  146:aload_0         
	//*  70  147:getfield        #312 <Field RemoteViews mBigContentView>
	//*  71  150:ifnull          161
				notification1.bigContentView = mBigContentView;
	//   72  153:aload_1         
	//   73  154:aload_0         
	//   74  155:getfield        #312 <Field RemoteViews mBigContentView>
	//   75  158:putfield        #550 <Field RemoteViews Notification.bigContentView>
			if(mHeadsUpContentView != null)
	//*  76  161:aload_0         
	//*  77  162:getfield        #396 <Field RemoteViews mHeadsUpContentView>
	//*  78  165:ifnull          176
				notification1.headsUpContentView = mHeadsUpContentView;
	//   79  168:aload_1         
	//   80  169:aload_0         
	//   81  170:getfield        #396 <Field RemoteViews mHeadsUpContentView>
	//   82  173:putfield        #556 <Field RemoteViews Notification.headsUpContentView>
			if(mGroupAlertBehavior != 0)
	//*  83  176:aload_0         
	//*  84  177:getfield        #358 <Field int mGroupAlertBehavior>
	//*  85  180:ifeq            245
			{
				if(notification1.getGroup() != null && (notification1.flags & 0x200) != 0 && mGroupAlertBehavior == 2)
	//*  86  183:aload_1         
	//*  87  184:invokevirtual   #570 <Method String Notification.getGroup()>
	//*  88  187:ifnull          214
	//*  89  190:aload_1         
	//*  90  191:getfield        #133 <Field int Notification.flags>
	//*  91  194:sipush          512
	//*  92  197:iand            
	//*  93  198:ifeq            214
	//*  94  201:aload_0         
	//*  95  202:getfield        #358 <Field int mGroupAlertBehavior>
	//*  96  205:iconst_2        
	//*  97  206:icmpne          214
					removeSoundAndVibration(notification1);
	//   98  209:aload_0         
	//   99  210:aload_1         
	//  100  211:invokespecial   #572 <Method void removeSoundAndVibration(Notification)>
				if(notification1.getGroup() != null && (notification1.flags & 0x200) == 0 && mGroupAlertBehavior == 1)
	//* 101  214:aload_1         
	//* 102  215:invokevirtual   #570 <Method String Notification.getGroup()>
	//* 103  218:ifnull          245
	//* 104  221:aload_1         
	//* 105  222:getfield        #133 <Field int Notification.flags>
	//* 106  225:sipush          512
	//* 107  228:iand            
	//* 108  229:ifne            245
	//* 109  232:aload_0         
	//* 110  233:getfield        #358 <Field int mGroupAlertBehavior>
	//* 111  236:iconst_1        
	//* 112  237:icmpne          245
					removeSoundAndVibration(notification1);
	//  113  240:aload_0         
	//  114  241:aload_1         
	//  115  242:invokespecial   #572 <Method void removeSoundAndVibration(Notification)>
			}
			return notification1;
	//  116  245:aload_1         
	//  117  246:areturn         
		}
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//* 118  247:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 119  250:bipush          20
	//* 120  252:icmplt          376
		{
			mBuilder.setExtras(mExtras);
	//  121  255:aload_0         
	//  122  256:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  123  259:aload_0         
	//  124  260:getfield        #40  <Field Bundle mExtras>
	//  125  263:invokevirtual   #400 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
	//  126  266:pop             
			Notification notification2 = mBuilder.build();
	//  127  267:aload_0         
	//  128  268:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  129  271:invokevirtual   #566 <Method Notification android.app.Notification$Builder.build()>
	//  130  274:astore_1        
			if(mContentView != null)
	//* 131  275:aload_0         
	//* 132  276:getfield        #309 <Field RemoteViews mContentView>
	//* 133  279:ifnull          290
				notification2.contentView = mContentView;
	//  134  282:aload_1         
	//  135  283:aload_0         
	//  136  284:getfield        #309 <Field RemoteViews mContentView>
	//  137  287:putfield        #94  <Field RemoteViews Notification.contentView>
			if(mBigContentView != null)
	//* 138  290:aload_0         
	//* 139  291:getfield        #312 <Field RemoteViews mBigContentView>
	//* 140  294:ifnull          305
				notification2.bigContentView = mBigContentView;
	//  141  297:aload_1         
	//  142  298:aload_0         
	//  143  299:getfield        #312 <Field RemoteViews mBigContentView>
	//  144  302:putfield        #550 <Field RemoteViews Notification.bigContentView>
			if(mGroupAlertBehavior != 0)
	//* 145  305:aload_0         
	//* 146  306:getfield        #358 <Field int mGroupAlertBehavior>
	//* 147  309:ifeq            374
			{
				if(notification2.getGroup() != null && (notification2.flags & 0x200) != 0 && mGroupAlertBehavior == 2)
	//* 148  312:aload_1         
	//* 149  313:invokevirtual   #570 <Method String Notification.getGroup()>
	//* 150  316:ifnull          343
	//* 151  319:aload_1         
	//* 152  320:getfield        #133 <Field int Notification.flags>
	//* 153  323:sipush          512
	//* 154  326:iand            
	//* 155  327:ifeq            343
	//* 156  330:aload_0         
	//* 157  331:getfield        #358 <Field int mGroupAlertBehavior>
	//* 158  334:iconst_2        
	//* 159  335:icmpne          343
					removeSoundAndVibration(notification2);
	//  160  338:aload_0         
	//  161  339:aload_1         
	//  162  340:invokespecial   #572 <Method void removeSoundAndVibration(Notification)>
				if(notification2.getGroup() != null && (notification2.flags & 0x200) == 0 && mGroupAlertBehavior == 1)
	//* 163  343:aload_1         
	//* 164  344:invokevirtual   #570 <Method String Notification.getGroup()>
	//* 165  347:ifnull          374
	//* 166  350:aload_1         
	//* 167  351:getfield        #133 <Field int Notification.flags>
	//* 168  354:sipush          512
	//* 169  357:iand            
	//* 170  358:ifne            374
	//* 171  361:aload_0         
	//* 172  362:getfield        #358 <Field int mGroupAlertBehavior>
	//* 173  365:iconst_1        
	//* 174  366:icmpne          374
					removeSoundAndVibration(notification2);
	//  175  369:aload_0         
	//  176  370:aload_1         
	//  177  371:invokespecial   #572 <Method void removeSoundAndVibration(Notification)>
			}
			return notification2;
	//  178  374:aload_1         
	//  179  375:areturn         
		}
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//* 180  376:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 181  379:bipush          19
	//* 182  381:icmplt          459
		{
			Object obj = ((Object) (NotificationCompatJellybean.buildActionExtrasMap(mActionExtrasList)));
	//  183  384:aload_0         
	//  184  385:getfield        #35  <Field List mActionExtrasList>
	//  185  388:invokestatic    #576 <Method android.util.SparseArray NotificationCompatJellybean.buildActionExtrasMap(List)>
	//  186  391:astore_1        
			if(obj != null)
	//* 187  392:aload_1         
	//* 188  393:ifnull          407
				mExtras.putSparseParcelableArray("android.support.actionExtras", ((android.util.SparseArray) (obj)));
	//  189  396:aload_0         
	//  190  397:getfield        #40  <Field Bundle mExtras>
	//  191  400:ldc2            #578 <String "android.support.actionExtras">
	//  192  403:aload_1         
	//  193  404:invokevirtual   #582 <Method void Bundle.putSparseParcelableArray(String, android.util.SparseArray)>
			mBuilder.setExtras(mExtras);
	//  194  407:aload_0         
	//  195  408:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  196  411:aload_0         
	//  197  412:getfield        #40  <Field Bundle mExtras>
	//  198  415:invokevirtual   #400 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
	//  199  418:pop             
			obj = ((Object) (mBuilder.build()));
	//  200  419:aload_0         
	//  201  420:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  202  423:invokevirtual   #566 <Method Notification android.app.Notification$Builder.build()>
	//  203  426:astore_1        
			if(mContentView != null)
	//* 204  427:aload_0         
	//* 205  428:getfield        #309 <Field RemoteViews mContentView>
	//* 206  431:ifnull          442
				obj.contentView = mContentView;
	//  207  434:aload_1         
	//  208  435:aload_0         
	//  209  436:getfield        #309 <Field RemoteViews mContentView>
	//  210  439:putfield        #94  <Field RemoteViews Notification.contentView>
			if(mBigContentView != null)
	//* 211  442:aload_0         
	//* 212  443:getfield        #312 <Field RemoteViews mBigContentView>
	//* 213  446:ifnull          457
				obj.bigContentView = mBigContentView;
	//  214  449:aload_1         
	//  215  450:aload_0         
	//  216  451:getfield        #312 <Field RemoteViews mBigContentView>
	//  217  454:putfield        #550 <Field RemoteViews Notification.bigContentView>
			return ((Notification) (obj));
	//  218  457:aload_1         
	//  219  458:areturn         
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//* 220  459:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 221  462:bipush          16
	//* 222  464:icmplt          606
		{
			Notification notification3 = mBuilder.build();
	//  223  467:aload_0         
	//  224  468:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  225  471:invokevirtual   #566 <Method Notification android.app.Notification$Builder.build()>
	//  226  474:astore_1        
			Object obj1 = ((Object) (NotificationCompat.getExtras(notification3)));
	//  227  475:aload_1         
	//  228  476:invokestatic    #561 <Method Bundle NotificationCompat.getExtras(Notification)>
	//  229  479:astore_2        
			Bundle bundle = new Bundle(mExtras);
	//  230  480:new             #37  <Class Bundle>
	//  231  483:dup             
	//  232  484:aload_0         
	//  233  485:getfield        #40  <Field Bundle mExtras>
	//  234  488:invokespecial   #492 <Method void Bundle(Bundle)>
	//  235  491:astore_3        
			Iterator iterator = mExtras.keySet().iterator();
	//  236  492:aload_0         
	//  237  493:getfield        #40  <Field Bundle mExtras>
	//  238  496:invokevirtual   #586 <Method Set Bundle.keySet()>
	//  239  499:invokeinterface #589 <Method Iterator Set.iterator()>
	//  240  504:astore          4
			do
			{
				if(!iterator.hasNext())
					break;
	//  241  506:aload           4
	//  242  508:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//  243  513:ifeq            546
				String s = (String)iterator.next();
	//  244  516:aload           4
	//  245  518:invokeinterface #265 <Method Object Iterator.next()>
	//  246  523:checkcast       #332 <Class String>
	//  247  526:astore          5
				if(((Bundle) (obj1)).containsKey(s))
	//* 248  528:aload_2         
	//* 249  529:aload           5
	//* 250  531:invokevirtual   #593 <Method boolean Bundle.containsKey(String)>
	//* 251  534:ifeq            506
					bundle.remove(s);
	//  252  537:aload_3         
	//  253  538:aload           5
	//  254  540:invokevirtual   #597 <Method void Bundle.remove(String)>
			} while(true);
	//  255  543:goto            506
			((Bundle) (obj1)).putAll(bundle);
	//  256  546:aload_2         
	//  257  547:aload_3         
	//  258  548:invokevirtual   #276 <Method void Bundle.putAll(Bundle)>
			obj1 = ((Object) (NotificationCompatJellybean.buildActionExtrasMap(mActionExtrasList)));
	//  259  551:aload_0         
	//  260  552:getfield        #35  <Field List mActionExtrasList>
	//  261  555:invokestatic    #576 <Method android.util.SparseArray NotificationCompatJellybean.buildActionExtrasMap(List)>
	//  262  558:astore_2        
			if(obj1 != null)
	//* 263  559:aload_2         
	//* 264  560:ifnull          574
				NotificationCompat.getExtras(notification3).putSparseParcelableArray("android.support.actionExtras", ((android.util.SparseArray) (obj1)));
	//  265  563:aload_1         
	//  266  564:invokestatic    #561 <Method Bundle NotificationCompat.getExtras(Notification)>
	//  267  567:ldc2            #578 <String "android.support.actionExtras">
	//  268  570:aload_2         
	//  269  571:invokevirtual   #582 <Method void Bundle.putSparseParcelableArray(String, android.util.SparseArray)>
			if(mContentView != null)
	//* 270  574:aload_0         
	//* 271  575:getfield        #309 <Field RemoteViews mContentView>
	//* 272  578:ifnull          589
				notification3.contentView = mContentView;
	//  273  581:aload_1         
	//  274  582:aload_0         
	//  275  583:getfield        #309 <Field RemoteViews mContentView>
	//  276  586:putfield        #94  <Field RemoteViews Notification.contentView>
			if(mBigContentView != null)
	//* 277  589:aload_0         
	//* 278  590:getfield        #312 <Field RemoteViews mBigContentView>
	//* 279  593:ifnull          604
				notification3.bigContentView = mBigContentView;
	//  280  596:aload_1         
	//  281  597:aload_0         
	//  282  598:getfield        #312 <Field RemoteViews mBigContentView>
	//  283  601:putfield        #550 <Field RemoteViews Notification.bigContentView>
			return notification3;
	//  284  604:aload_1         
	//  285  605:areturn         
		} else
		{
			return mBuilder.getNotification();
	//  286  606:aload_0         
	//  287  607:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  288  610:invokevirtual   #600 <Method Notification android.app.Notification$Builder.getNotification()>
	//  289  613:areturn         
		}
	}

	public android.app.Notification.Builder getBuilder()
	{
		return mBuilder;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//    2    4:areturn         
	}

	private final List mActionExtrasList = new ArrayList();
	private RemoteViews mBigContentView;
	private final android.app.Notification.Builder mBuilder;
	private final NotificationCompat.Builder mBuilderCompat;
	private RemoteViews mContentView;
	private final Bundle mExtras = new Bundle();
	private int mGroupAlertBehavior;
	private RemoteViews mHeadsUpContentView;
}
