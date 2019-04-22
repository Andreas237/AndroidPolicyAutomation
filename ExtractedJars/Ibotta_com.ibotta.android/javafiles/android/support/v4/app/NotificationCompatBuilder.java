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
//			NotificationBuilderWithBuilderAccessor, NotificationCompatJellybean, RemoteInput, NotificationCompat

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
	//   37   80:astore          4
		android.app.Notification.Builder builder1 = mBuilder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
	//   38   82:aload_0         
	//   39   83:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//   40   86:aload           4
	//   41   88:getfield        #77  <Field long Notification.when>
	//   42   91:invokevirtual   #81  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//   43   94:aload           4
	//   44   96:getfield        #84  <Field int Notification.icon>
	//   45   99:aload           4
	//   46  101:getfield        #87  <Field int Notification.iconLevel>
	//   47  104:invokevirtual   #91  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
	//   48  107:aload           4
	//   49  109:getfield        #94  <Field RemoteViews Notification.contentView>
	//   50  112:invokevirtual   #98  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
	//   51  115:aload           4
	//   52  117:getfield        #102 <Field CharSequence Notification.tickerText>
	//   53  120:aload_1         
	//   54  121:getfield        #105 <Field RemoteViews NotificationCompat$Builder.mTickerView>
	//   55  124:invokevirtual   #109 <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
	//   56  127:aload           4
	//   57  129:getfield        #113 <Field long[] Notification.vibrate>
	//   58  132:invokevirtual   #117 <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
	//   59  135:aload           4
	//   60  137:getfield        #120 <Field int Notification.ledARGB>
	//   61  140:aload           4
	//   62  142:getfield        #123 <Field int Notification.ledOnMS>
	//   63  145:aload           4
	//   64  147:getfield        #126 <Field int Notification.ledOffMS>
	//   65  150:invokevirtual   #130 <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
	//   66  153:astore          5
		boolean flag;
		if((notification.flags & 2) != 0)
	//*  67  155:aload           4
	//*  68  157:getfield        #133 <Field int Notification.flags>
	//*  69  160:iconst_2        
	//*  70  161:iand            
	//*  71  162:ifeq            170
			flag = true;
	//   72  165:iconst_1        
	//   73  166:istore_3        
		else
	//*  74  167:goto            172
			flag = false;
	//   75  170:iconst_0        
	//   76  171:istore_3        
		builder1 = builder1.setOngoing(flag);
	//   77  172:aload           5
	//   78  174:iload_3         
	//   79  175:invokevirtual   #137 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//   80  178:astore          5
		if((notification.flags & 8) != 0)
	//*  81  180:aload           4
	//*  82  182:getfield        #133 <Field int Notification.flags>
	//*  83  185:bipush          8
	//*  84  187:iand            
	//*  85  188:ifeq            196
			flag = true;
	//   86  191:iconst_1        
	//   87  192:istore_3        
		else
	//*  88  193:goto            198
			flag = false;
	//   89  196:iconst_0        
	//   90  197:istore_3        
		builder1 = builder1.setOnlyAlertOnce(flag);
	//   91  198:aload           5
	//   92  200:iload_3         
	//   93  201:invokevirtual   #140 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
	//   94  204:astore          5
		if((notification.flags & 0x10) != 0)
	//*  95  206:aload           4
	//*  96  208:getfield        #133 <Field int Notification.flags>
	//*  97  211:bipush          16
	//*  98  213:iand            
	//*  99  214:ifeq            222
			flag = true;
	//  100  217:iconst_1        
	//  101  218:istore_3        
		else
	//* 102  219:goto            224
			flag = false;
	//  103  222:iconst_0        
	//  104  223:istore_3        
		builder1 = builder1.setAutoCancel(flag).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent);
	//  105  224:aload           5
	//  106  226:iload_3         
	//  107  227:invokevirtual   #143 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//  108  230:aload           4
	//  109  232:getfield        #146 <Field int Notification.defaults>
	//  110  235:invokevirtual   #150 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//  111  238:aload_1         
	//  112  239:getfield        #153 <Field CharSequence NotificationCompat$Builder.mContentTitle>
	//  113  242:invokevirtual   #157 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//  114  245:aload_1         
	//  115  246:getfield        #160 <Field CharSequence NotificationCompat$Builder.mContentText>
	//  116  249:invokevirtual   #163 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//  117  252:aload_1         
	//  118  253:getfield        #166 <Field CharSequence NotificationCompat$Builder.mContentInfo>
	//  119  256:invokevirtual   #169 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
	//  120  259:aload_1         
	//  121  260:getfield        #173 <Field android.app.PendingIntent NotificationCompat$Builder.mContentIntent>
	//  122  263:invokevirtual   #177 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(android.app.PendingIntent)>
	//  123  266:aload           4
	//  124  268:getfield        #180 <Field android.app.PendingIntent Notification.deleteIntent>
	//  125  271:invokevirtual   #183 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(android.app.PendingIntent)>
	//  126  274:astore          5
		android.app.PendingIntent pendingintent = builder.mFullScreenIntent;
	//  127  276:aload_1         
	//  128  277:getfield        #186 <Field android.app.PendingIntent NotificationCompat$Builder.mFullScreenIntent>
	//  129  280:astore          6
		if((notification.flags & 0x80) != 0)
	//* 130  282:aload           4
	//* 131  284:getfield        #133 <Field int Notification.flags>
	//* 132  287:sipush          128
	//* 133  290:iand            
	//* 134  291:ifeq            299
			flag = true;
	//  135  294:iconst_1        
	//  136  295:istore_3        
		else
	//* 137  296:goto            301
			flag = false;
	//  138  299:iconst_0        
	//  139  300:istore_3        
		builder1.setFullScreenIntent(pendingintent, flag).setLargeIcon(builder.mLargeIcon).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
	//  140  301:aload           5
	//  141  303:aload           6
	//  142  305:iload_3         
	//  143  306:invokevirtual   #190 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(android.app.PendingIntent, boolean)>
	//  144  309:aload_1         
	//  145  310:getfield        #194 <Field android.graphics.Bitmap NotificationCompat$Builder.mLargeIcon>
	//  146  313:invokevirtual   #198 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(android.graphics.Bitmap)>
	//  147  316:aload_1         
	//  148  317:getfield        #201 <Field int NotificationCompat$Builder.mNumber>
	//  149  320:invokevirtual   #204 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
	//  150  323:aload_1         
	//  151  324:getfield        #207 <Field int NotificationCompat$Builder.mProgressMax>
	//  152  327:aload_1         
	//  153  328:getfield        #210 <Field int NotificationCompat$Builder.mProgress>
	//  154  331:aload_1         
	//  155  332:getfield        #214 <Field boolean NotificationCompat$Builder.mProgressIndeterminate>
	//  156  335:invokevirtual   #218 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
	//  157  338:pop             
		if(android.os.Build.VERSION.SDK_INT < 21)
	//* 158  339:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 159  342:bipush          21
	//* 160  344:icmpge          365
			mBuilder.setSound(notification.sound, notification.audioStreamType);
	//  161  347:aload_0         
	//  162  348:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  163  351:aload           4
	//  164  353:getfield        #222 <Field android.net.Uri Notification.sound>
	//  165  356:aload           4
	//  166  358:getfield        #225 <Field int Notification.audioStreamType>
	//  167  361:invokevirtual   #229 <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
	//  168  364:pop             
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//* 169  365:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 170  368:bipush          16
	//* 171  370:icmplt          569
		{
			mBuilder.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
	//  172  373:aload_0         
	//  173  374:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  174  377:aload_1         
	//  175  378:getfield        #232 <Field CharSequence NotificationCompat$Builder.mSubText>
	//  176  381:invokevirtual   #235 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
	//  177  384:aload_1         
	//  178  385:getfield        #238 <Field boolean NotificationCompat$Builder.mUseChronometer>
	//  179  388:invokevirtual   #241 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
	//  180  391:aload_1         
	//  181  392:getfield        #244 <Field int NotificationCompat$Builder.mPriority>
	//  182  395:invokevirtual   #247 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
	//  183  398:pop             
			for(Iterator iterator1 = builder.mActions.iterator(); iterator1.hasNext(); addAction((NotificationCompat.Action)iterator1.next()));
	//  184  399:aload_1         
	//  185  400:getfield        #251 <Field ArrayList NotificationCompat$Builder.mActions>
	//  186  403:invokevirtual   #255 <Method Iterator ArrayList.iterator()>
	//  187  406:astore          5
	//  188  408:aload           5
	//  189  410:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//  190  415:ifeq            435
	//  191  418:aload_0         
	//  192  419:aload           5
	//  193  421:invokeinterface #265 <Method Object Iterator.next()>
	//  194  426:checkcast       #267 <Class NotificationCompat$Action>
	//  195  429:invokespecial   #271 <Method void addAction(NotificationCompat$Action)>
	//* 196  432:goto            408
			if(builder.mExtras != null)
	//* 197  435:aload_1         
	//* 198  436:getfield        #272 <Field Bundle NotificationCompat$Builder.mExtras>
	//* 199  439:ifnull          453
				mExtras.putAll(builder.mExtras);
	//  200  442:aload_0         
	//  201  443:getfield        #40  <Field Bundle mExtras>
	//  202  446:aload_1         
	//  203  447:getfield        #272 <Field Bundle NotificationCompat$Builder.mExtras>
	//  204  450:invokevirtual   #276 <Method void Bundle.putAll(Bundle)>
			if(android.os.Build.VERSION.SDK_INT < 20)
	//* 205  453:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 206  456:bipush          20
	//* 207  458:icmpge          553
			{
				if(builder.mLocalOnly)
	//* 208  461:aload_1         
	//* 209  462:getfield        #279 <Field boolean NotificationCompat$Builder.mLocalOnly>
	//* 210  465:ifeq            479
					mExtras.putBoolean("android.support.localOnly", true);
	//  211  468:aload_0         
	//  212  469:getfield        #40  <Field Bundle mExtras>
	//  213  472:ldc2            #281 <String "android.support.localOnly">
	//  214  475:iconst_1        
	//  215  476:invokevirtual   #285 <Method void Bundle.putBoolean(String, boolean)>
				if(builder.mGroupKey != null)
	//* 216  479:aload_1         
	//* 217  480:getfield        #288 <Field String NotificationCompat$Builder.mGroupKey>
	//* 218  483:ifnull          532
				{
					mExtras.putString("android.support.groupKey", builder.mGroupKey);
	//  219  486:aload_0         
	//  220  487:getfield        #40  <Field Bundle mExtras>
	//  221  490:ldc2            #290 <String "android.support.groupKey">
	//  222  493:aload_1         
	//  223  494:getfield        #288 <Field String NotificationCompat$Builder.mGroupKey>
	//  224  497:invokevirtual   #294 <Method void Bundle.putString(String, String)>
					if(builder.mGroupSummary)
	//* 225  500:aload_1         
	//* 226  501:getfield        #297 <Field boolean NotificationCompat$Builder.mGroupSummary>
	//* 227  504:ifeq            521
						mExtras.putBoolean("android.support.isGroupSummary", true);
	//  228  507:aload_0         
	//  229  508:getfield        #40  <Field Bundle mExtras>
	//  230  511:ldc2            #299 <String "android.support.isGroupSummary">
	//  231  514:iconst_1        
	//  232  515:invokevirtual   #285 <Method void Bundle.putBoolean(String, boolean)>
					else
	//* 233  518:goto            532
						mExtras.putBoolean("android.support.useSideChannel", true);
	//  234  521:aload_0         
	//  235  522:getfield        #40  <Field Bundle mExtras>
	//  236  525:ldc2            #301 <String "android.support.useSideChannel">
	//  237  528:iconst_1        
	//  238  529:invokevirtual   #285 <Method void Bundle.putBoolean(String, boolean)>
				}
				if(builder.mSortKey != null)
	//* 239  532:aload_1         
	//* 240  533:getfield        #304 <Field String NotificationCompat$Builder.mSortKey>
	//* 241  536:ifnull          553
					mExtras.putString("android.support.sortKey", builder.mSortKey);
	//  242  539:aload_0         
	//  243  540:getfield        #40  <Field Bundle mExtras>
	//  244  543:ldc2            #306 <String "android.support.sortKey">
	//  245  546:aload_1         
	//  246  547:getfield        #304 <Field String NotificationCompat$Builder.mSortKey>
	//  247  550:invokevirtual   #294 <Method void Bundle.putString(String, String)>
			}
			mContentView = builder.mContentView;
	//  248  553:aload_0         
	//  249  554:aload_1         
	//  250  555:getfield        #308 <Field RemoteViews NotificationCompat$Builder.mContentView>
	//  251  558:putfield        #309 <Field RemoteViews mContentView>
			mBigContentView = builder.mBigContentView;
	//  252  561:aload_0         
	//  253  562:aload_1         
	//  254  563:getfield        #311 <Field RemoteViews NotificationCompat$Builder.mBigContentView>
	//  255  566:putfield        #312 <Field RemoteViews mBigContentView>
		}
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//* 256  569:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 257  572:bipush          19
	//* 258  574:icmplt          644
		{
			mBuilder.setShowWhen(builder.mShowWhen);
	//  259  577:aload_0         
	//  260  578:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  261  581:aload_1         
	//  262  582:getfield        #315 <Field boolean NotificationCompat$Builder.mShowWhen>
	//  263  585:invokevirtual   #318 <Method android.app.Notification$Builder android.app.Notification$Builder.setShowWhen(boolean)>
	//  264  588:pop             
			if(android.os.Build.VERSION.SDK_INT < 21 && builder.mPeople != null && !builder.mPeople.isEmpty())
	//* 265  589:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 266  592:bipush          21
	//* 267  594:icmpge          644
	//* 268  597:aload_1         
	//* 269  598:getfield        #321 <Field ArrayList NotificationCompat$Builder.mPeople>
	//* 270  601:ifnull          644
	//* 271  604:aload_1         
	//* 272  605:getfield        #321 <Field ArrayList NotificationCompat$Builder.mPeople>
	//* 273  608:invokevirtual   #324 <Method boolean ArrayList.isEmpty()>
	//* 274  611:ifne            644
				mExtras.putStringArray("android.people", (String[])builder.mPeople.toArray(((Object []) (new String[builder.mPeople.size()]))));
	//  275  614:aload_0         
	//  276  615:getfield        #40  <Field Bundle mExtras>
	//  277  618:ldc2            #326 <String "android.people">
	//  278  621:aload_1         
	//  279  622:getfield        #321 <Field ArrayList NotificationCompat$Builder.mPeople>
	//  280  625:aload_1         
	//  281  626:getfield        #321 <Field ArrayList NotificationCompat$Builder.mPeople>
	//  282  629:invokevirtual   #330 <Method int ArrayList.size()>
	//  283  632:anewarray       String[]
	//  284  635:invokevirtual   #336 <Method Object[] ArrayList.toArray(Object[])>
	//  285  638:checkcast       #338 <Class String[]>
	//  286  641:invokevirtual   #342 <Method void Bundle.putStringArray(String, String[])>
		}
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//* 287  644:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 288  647:bipush          20
	//* 289  649:icmplt          693
		{
			mBuilder.setLocalOnly(builder.mLocalOnly).setGroup(builder.mGroupKey).setGroupSummary(builder.mGroupSummary).setSortKey(builder.mSortKey);
	//  290  652:aload_0         
	//  291  653:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  292  656:aload_1         
	//  293  657:getfield        #279 <Field boolean NotificationCompat$Builder.mLocalOnly>
	//  294  660:invokevirtual   #345 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
	//  295  663:aload_1         
	//  296  664:getfield        #288 <Field String NotificationCompat$Builder.mGroupKey>
	//  297  667:invokevirtual   #349 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
	//  298  670:aload_1         
	//  299  671:getfield        #297 <Field boolean NotificationCompat$Builder.mGroupSummary>
	//  300  674:invokevirtual   #352 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
	//  301  677:aload_1         
	//  302  678:getfield        #304 <Field String NotificationCompat$Builder.mSortKey>
	//  303  681:invokevirtual   #355 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
	//  304  684:pop             
			mGroupAlertBehavior = builder.mGroupAlertBehavior;
	//  305  685:aload_0         
	//  306  686:aload_1         
	//  307  687:getfield        #357 <Field int NotificationCompat$Builder.mGroupAlertBehavior>
	//  308  690:putfield        #358 <Field int mGroupAlertBehavior>
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 309  693:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 310  696:bipush          21
	//* 311  698:icmplt          925
		{
			mBuilder.setCategory(builder.mCategory).setColor(builder.mColor).setVisibility(builder.mVisibility).setPublicVersion(builder.mPublicVersion).setSound(notification.sound, notification.audioAttributes);
	//  312  701:aload_0         
	//  313  702:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  314  705:aload_1         
	//  315  706:getfield        #361 <Field String NotificationCompat$Builder.mCategory>
	//  316  709:invokevirtual   #364 <Method android.app.Notification$Builder android.app.Notification$Builder.setCategory(String)>
	//  317  712:aload_1         
	//  318  713:getfield        #367 <Field int NotificationCompat$Builder.mColor>
	//  319  716:invokevirtual   #370 <Method android.app.Notification$Builder android.app.Notification$Builder.setColor(int)>
	//  320  719:aload_1         
	//  321  720:getfield        #373 <Field int NotificationCompat$Builder.mVisibility>
	//  322  723:invokevirtual   #376 <Method android.app.Notification$Builder android.app.Notification$Builder.setVisibility(int)>
	//  323  726:aload_1         
	//  324  727:getfield        #379 <Field Notification NotificationCompat$Builder.mPublicVersion>
	//  325  730:invokevirtual   #383 <Method android.app.Notification$Builder android.app.Notification$Builder.setPublicVersion(Notification)>
	//  326  733:aload           4
	//  327  735:getfield        #222 <Field android.net.Uri Notification.sound>
	//  328  738:aload           4
	//  329  740:getfield        #387 <Field android.media.AudioAttributes Notification.audioAttributes>
	//  330  743:invokevirtual   #390 <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, android.media.AudioAttributes)>
	//  331  746:pop             
			String s;
			for(Iterator iterator = builder.mPeople.iterator(); iterator.hasNext(); mBuilder.addPerson(s))
	//* 332  747:aload_1         
	//* 333  748:getfield        #321 <Field ArrayList NotificationCompat$Builder.mPeople>
	//* 334  751:invokevirtual   #255 <Method Iterator ArrayList.iterator()>
	//* 335  754:astore          4
	//* 336  756:aload           4
	//* 337  758:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//* 338  763:ifeq            791
				s = (String)iterator.next();
	//  339  766:aload           4
	//  340  768:invokeinterface #265 <Method Object Iterator.next()>
	//  341  773:checkcast       #332 <Class String>
	//  342  776:astore          5

	//  343  778:aload_0         
	//  344  779:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  345  782:aload           5
	//  346  784:invokevirtual   #393 <Method android.app.Notification$Builder android.app.Notification$Builder.addPerson(String)>
	//  347  787:pop             
	//* 348  788:goto            756
			mHeadsUpContentView = builder.mHeadsUpContentView;
	//  349  791:aload_0         
	//  350  792:aload_1         
	//  351  793:getfield        #395 <Field RemoteViews NotificationCompat$Builder.mHeadsUpContentView>
	//  352  796:putfield        #396 <Field RemoteViews mHeadsUpContentView>
			if(builder.mInvisibleActions.size() > 0)
	//* 353  799:aload_1         
	//* 354  800:getfield        #399 <Field ArrayList NotificationCompat$Builder.mInvisibleActions>
	//* 355  803:invokevirtual   #330 <Method int ArrayList.size()>
	//* 356  806:ifle            925
			{
				Bundle bundle1 = builder.getExtras().getBundle("android.car.EXTENSIONS");
	//  357  809:aload_1         
	//  358  810:invokevirtual   #403 <Method Bundle NotificationCompat$Builder.getExtras()>
	//  359  813:ldc2            #405 <String "android.car.EXTENSIONS">
	//  360  816:invokevirtual   #409 <Method Bundle Bundle.getBundle(String)>
	//  361  819:astore          5
				Bundle bundle = bundle1;
	//  362  821:aload           5
	//  363  823:astore          4
				if(bundle1 == null)
	//* 364  825:aload           5
	//* 365  827:ifnonnull       839
					bundle = new Bundle();
	//  366  830:new             #37  <Class Bundle>
	//  367  833:dup             
	//  368  834:invokespecial   #38  <Method void Bundle()>
	//  369  837:astore          4
				bundle1 = new Bundle();
	//  370  839:new             #37  <Class Bundle>
	//  371  842:dup             
	//  372  843:invokespecial   #38  <Method void Bundle()>
	//  373  846:astore          5
				for(int i = 0; i < builder.mInvisibleActions.size(); i++)
	//* 374  848:iconst_0        
	//* 375  849:istore_2        
	//* 376  850:iload_2         
	//* 377  851:aload_1         
	//* 378  852:getfield        #399 <Field ArrayList NotificationCompat$Builder.mInvisibleActions>
	//* 379  855:invokevirtual   #330 <Method int ArrayList.size()>
	//* 380  858:icmpge          891
					bundle1.putBundle(Integer.toString(i), NotificationCompatJellybean.getBundleForAction((NotificationCompat.Action)builder.mInvisibleActions.get(i)));
	//  381  861:aload           5
	//  382  863:iload_2         
	//  383  864:invokestatic    #415 <Method String Integer.toString(int)>
	//  384  867:aload_1         
	//  385  868:getfield        #399 <Field ArrayList NotificationCompat$Builder.mInvisibleActions>
	//  386  871:iload_2         
	//  387  872:invokevirtual   #419 <Method Object ArrayList.get(int)>
	//  388  875:checkcast       #267 <Class NotificationCompat$Action>
	//  389  878:invokestatic    #425 <Method Bundle NotificationCompatJellybean.getBundleForAction(NotificationCompat$Action)>
	//  390  881:invokevirtual   #429 <Method void Bundle.putBundle(String, Bundle)>

	//  391  884:iload_2         
	//  392  885:iconst_1        
	//  393  886:iadd            
	//  394  887:istore_2        
	//* 395  888:goto            850
				bundle.putBundle("invisible_actions", bundle1);
	//  396  891:aload           4
	//  397  893:ldc2            #431 <String "invisible_actions">
	//  398  896:aload           5
	//  399  898:invokevirtual   #429 <Method void Bundle.putBundle(String, Bundle)>
				builder.getExtras().putBundle("android.car.EXTENSIONS", bundle);
	//  400  901:aload_1         
	//  401  902:invokevirtual   #403 <Method Bundle NotificationCompat$Builder.getExtras()>
	//  402  905:ldc2            #405 <String "android.car.EXTENSIONS">
	//  403  908:aload           4
	//  404  910:invokevirtual   #429 <Method void Bundle.putBundle(String, Bundle)>
				mExtras.putBundle("android.car.EXTENSIONS", bundle);
	//  405  913:aload_0         
	//  406  914:getfield        #40  <Field Bundle mExtras>
	//  407  917:ldc2            #405 <String "android.car.EXTENSIONS">
	//  408  920:aload           4
	//  409  922:invokevirtual   #429 <Method void Bundle.putBundle(String, Bundle)>
			}
		}
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//* 410  925:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 411  928:bipush          24
	//* 412  930:icmplt          1009
		{
			mBuilder.setExtras(builder.mExtras).setRemoteInputHistory(builder.mRemoteInputHistory);
	//  413  933:aload_0         
	//  414  934:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  415  937:aload_1         
	//  416  938:getfield        #272 <Field Bundle NotificationCompat$Builder.mExtras>
	//  417  941:invokevirtual   #435 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
	//  418  944:aload_1         
	//  419  945:getfield        #439 <Field CharSequence[] NotificationCompat$Builder.mRemoteInputHistory>
	//  420  948:invokevirtual   #443 <Method android.app.Notification$Builder android.app.Notification$Builder.setRemoteInputHistory(CharSequence[])>
	//  421  951:pop             
			if(builder.mContentView != null)
	//* 422  952:aload_1         
	//* 423  953:getfield        #308 <Field RemoteViews NotificationCompat$Builder.mContentView>
	//* 424  956:ifnull          971
				mBuilder.setCustomContentView(builder.mContentView);
	//  425  959:aload_0         
	//  426  960:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  427  963:aload_1         
	//  428  964:getfield        #308 <Field RemoteViews NotificationCompat$Builder.mContentView>
	//  429  967:invokevirtual   #446 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomContentView(RemoteViews)>
	//  430  970:pop             
			if(builder.mBigContentView != null)
	//* 431  971:aload_1         
	//* 432  972:getfield        #311 <Field RemoteViews NotificationCompat$Builder.mBigContentView>
	//* 433  975:ifnull          990
				mBuilder.setCustomBigContentView(builder.mBigContentView);
	//  434  978:aload_0         
	//  435  979:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  436  982:aload_1         
	//  437  983:getfield        #311 <Field RemoteViews NotificationCompat$Builder.mBigContentView>
	//  438  986:invokevirtual   #449 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomBigContentView(RemoteViews)>
	//  439  989:pop             
			if(builder.mHeadsUpContentView != null)
	//* 440  990:aload_1         
	//* 441  991:getfield        #395 <Field RemoteViews NotificationCompat$Builder.mHeadsUpContentView>
	//* 442  994:ifnull          1009
				mBuilder.setCustomHeadsUpContentView(builder.mHeadsUpContentView);
	//  443  997:aload_0         
	//  444  998:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  445 1001:aload_1         
	//  446 1002:getfield        #395 <Field RemoteViews NotificationCompat$Builder.mHeadsUpContentView>
	//  447 1005:invokevirtual   #452 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomHeadsUpContentView(RemoteViews)>
	//  448 1008:pop             
		}
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//* 449 1009:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 450 1012:bipush          26
	//* 451 1014:icmplt          1102
		{
			mBuilder.setBadgeIconType(builder.mBadgeIcon).setShortcutId(builder.mShortcutId).setTimeoutAfter(builder.mTimeout).setGroupAlertBehavior(builder.mGroupAlertBehavior);
	//  452 1017:aload_0         
	//  453 1018:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  454 1021:aload_1         
	//  455 1022:getfield        #455 <Field int NotificationCompat$Builder.mBadgeIcon>
	//  456 1025:invokevirtual   #458 <Method android.app.Notification$Builder android.app.Notification$Builder.setBadgeIconType(int)>
	//  457 1028:aload_1         
	//  458 1029:getfield        #461 <Field String NotificationCompat$Builder.mShortcutId>
	//  459 1032:invokevirtual   #464 <Method android.app.Notification$Builder android.app.Notification$Builder.setShortcutId(String)>
	//  460 1035:aload_1         
	//  461 1036:getfield        #467 <Field long NotificationCompat$Builder.mTimeout>
	//  462 1039:invokevirtual   #470 <Method android.app.Notification$Builder android.app.Notification$Builder.setTimeoutAfter(long)>
	//  463 1042:aload_1         
	//  464 1043:getfield        #357 <Field int NotificationCompat$Builder.mGroupAlertBehavior>
	//  465 1046:invokevirtual   #473 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupAlertBehavior(int)>
	//  466 1049:pop             
			if(builder.mColorizedSet)
	//* 467 1050:aload_1         
	//* 468 1051:getfield        #476 <Field boolean NotificationCompat$Builder.mColorizedSet>
	//* 469 1054:ifeq            1069
				mBuilder.setColorized(builder.mColorized);
	//  470 1057:aload_0         
	//  471 1058:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  472 1061:aload_1         
	//  473 1062:getfield        #479 <Field boolean NotificationCompat$Builder.mColorized>
	//  474 1065:invokevirtual   #482 <Method android.app.Notification$Builder android.app.Notification$Builder.setColorized(boolean)>
	//  475 1068:pop             
			if(!TextUtils.isEmpty(((CharSequence) (builder.mChannelId))))
	//* 476 1069:aload_1         
	//* 477 1070:getfield        #59  <Field String NotificationCompat$Builder.mChannelId>
	//* 478 1073:invokestatic    #487 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 479 1076:ifne            1102
				mBuilder.setSound(((android.net.Uri) (null))).setDefaults(0).setLights(0, 0, 0).setVibrate(((long []) (null)));
	//  480 1079:aload_0         
	//  481 1080:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  482 1083:aconst_null     
	//  483 1084:invokevirtual   #490 <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri)>
	//  484 1087:iconst_0        
	//  485 1088:invokevirtual   #150 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//  486 1091:iconst_0        
	//  487 1092:iconst_0        
	//  488 1093:iconst_0        
	//  489 1094:invokevirtual   #130 <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
	//  490 1097:aconst_null     
	//  491 1098:invokevirtual   #117 <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
	//  492 1101:pop             
		}
	//  493 1102:return          
	}

	private void addAction(NotificationCompat.Action action)
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          199
		{
			android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent());
	//    3    8:new             #493 <Class android.app.Notification$Action$Builder>
	//    4   11:dup             
	//    5   12:aload_1         
	//    6   13:invokevirtual   #496 <Method int NotificationCompat$Action.getIcon()>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #500 <Method CharSequence NotificationCompat$Action.getTitle()>
	//    9   20:aload_1         
	//   10   21:invokevirtual   #504 <Method android.app.PendingIntent NotificationCompat$Action.getActionIntent()>
	//   11   24:invokespecial   #507 <Method void android.app.Notification$Action$Builder(int, CharSequence, android.app.PendingIntent)>
	//   12   27:astore          5
			if(action.getRemoteInputs() != null)
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #511 <Method RemoteInput[] NotificationCompat$Action.getRemoteInputs()>
	//*  15   33:ifnull          73
			{
				android.app.RemoteInput aremoteinput[] = RemoteInput.fromCompat(action.getRemoteInputs());
	//   16   36:aload_1         
	//   17   37:invokevirtual   #511 <Method RemoteInput[] NotificationCompat$Action.getRemoteInputs()>
	//   18   40:invokestatic    #517 <Method android.app.RemoteInput[] RemoteInput.fromCompat(RemoteInput[])>
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
	//   32   62:invokevirtual   #521 <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addRemoteInput(android.app.RemoteInput)>
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
	//*  40   74:invokevirtual   #522 <Method Bundle NotificationCompat$Action.getExtras()>
	//*  41   77:ifnull          96
				bundle = new Bundle(action.getExtras());
	//   42   80:new             #37  <Class Bundle>
	//   43   83:dup             
	//   44   84:aload_1         
	//   45   85:invokevirtual   #522 <Method Bundle NotificationCompat$Action.getExtras()>
	//   46   88:invokespecial   #524 <Method void Bundle(Bundle)>
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
	//   54  107:ldc2            #526 <String "android.support.allowGeneratedReplies">
	//   55  110:aload_1         
	//   56  111:invokevirtual   #529 <Method boolean NotificationCompat$Action.getAllowGeneratedReplies()>
	//   57  114:invokevirtual   #285 <Method void Bundle.putBoolean(String, boolean)>
			if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  58  117:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*  59  120:bipush          24
	//*  60  122:icmplt          135
				builder.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
	//   61  125:aload           5
	//   62  127:aload_1         
	//   63  128:invokevirtual   #529 <Method boolean NotificationCompat$Action.getAllowGeneratedReplies()>
	//   64  131:invokevirtual   #533 <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.setAllowGeneratedReplies(boolean)>
	//   65  134:pop             
			bundle.putInt("android.support.action.semanticAction", action.getSemanticAction());
	//   66  135:aload           4
	//   67  137:ldc2            #535 <String "android.support.action.semanticAction">
	//   68  140:aload_1         
	//   69  141:invokevirtual   #538 <Method int NotificationCompat$Action.getSemanticAction()>
	//   70  144:invokevirtual   #542 <Method void Bundle.putInt(String, int)>
			if(android.os.Build.VERSION.SDK_INT >= 28)
	//*  71  147:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*  72  150:bipush          28
	//*  73  152:icmplt          165
				builder.setSemanticAction(action.getSemanticAction());
	//   74  155:aload           5
	//   75  157:aload_1         
	//   76  158:invokevirtual   #538 <Method int NotificationCompat$Action.getSemanticAction()>
	//   77  161:invokevirtual   #546 <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.setSemanticAction(int)>
	//   78  164:pop             
			bundle.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
	//   79  165:aload           4
	//   80  167:ldc2            #548 <String "android.support.action.showsUserInterface">
	//   81  170:aload_1         
	//   82  171:invokevirtual   #551 <Method boolean NotificationCompat$Action.getShowsUserInterface()>
	//   83  174:invokevirtual   #285 <Method void Bundle.putBoolean(String, boolean)>
			builder.addExtras(bundle);
	//   84  177:aload           5
	//   85  179:aload           4
	//   86  181:invokevirtual   #555 <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addExtras(Bundle)>
	//   87  184:pop             
			mBuilder.addAction(builder.build());
	//   88  185:aload_0         
	//   89  186:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//   90  189:aload           5
	//   91  191:invokevirtual   #559 <Method android.app.Notification$Action android.app.Notification$Action$Builder.build()>
	//   92  194:invokevirtual   #562 <Method android.app.Notification$Builder android.app.Notification$Builder.addAction(android.app.Notification$Action)>
	//   93  197:pop             
			return;
	//   94  198:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  95  199:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*  96  202:bipush          16
	//*  97  204:icmplt          225
			mActionExtrasList.add(((Object) (NotificationCompatJellybean.writeActionAndGetExtras(mBuilder, action))));
	//   98  207:aload_0         
	//   99  208:getfield        #35  <Field List mActionExtrasList>
	//  100  211:aload_0         
	//  101  212:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  102  215:aload_1         
	//  103  216:invokestatic    #566 <Method Bundle NotificationCompatJellybean.writeActionAndGetExtras(android.app.Notification$Builder, NotificationCompat$Action)>
	//  104  219:invokeinterface #572 <Method boolean List.add(Object)>
	//  105  224:pop             
	//  106  225:return          
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
	//    2    4:getfield        #579 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//    3    7:astore_2        
		if(style != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          17
			style.apply(((NotificationBuilderWithBuilderAccessor) (this)));
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #585 <Method void NotificationCompat$Style.apply(NotificationBuilderWithBuilderAccessor)>
		RemoteViews remoteviews;
		if(style != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          30
			remoteviews = style.makeContentView(((NotificationBuilderWithBuilderAccessor) (this)));
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:invokevirtual   #589 <Method RemoteViews NotificationCompat$Style.makeContentView(NotificationBuilderWithBuilderAccessor)>
	//   14   26:astore_1        
		else
	//*  15   27:goto            32
			remoteviews = null;
	//   16   30:aconst_null     
	//   17   31:astore_1        
		Notification notification = buildInternal();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #592 <Method Notification buildInternal()>
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
	//   43   84:invokevirtual   #595 <Method RemoteViews NotificationCompat$Style.makeBigContentView(NotificationBuilderWithBuilderAccessor)>
	//   44   87:astore_1        
			if(remoteviews1 != null)
	//*  45   88:aload_1         
	//*  46   89:ifnull          97
				notification.bigContentView = remoteviews1;
	//   47   92:aload_3         
	//   48   93:aload_1         
	//   49   94:putfield        #598 <Field RemoteViews Notification.bigContentView>
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
	//   57  113:getfield        #579 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   58  116:aload_0         
	//   59  117:invokevirtual   #601 <Method RemoteViews NotificationCompat$Style.makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor)>
	//   60  120:astore_1        
			if(remoteviews2 != null)
	//*  61  121:aload_1         
	//*  62  122:ifnull          130
				notification.headsUpContentView = remoteviews2;
	//   63  125:aload_3         
	//   64  126:aload_1         
	//   65  127:putfield        #604 <Field RemoteViews Notification.headsUpContentView>
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
	//   72  143:invokestatic    #609 <Method Bundle NotificationCompat.getExtras(Notification)>
	//   73  146:astore_1        
			if(bundle != null)
	//*  74  147:aload_1         
	//*  75  148:ifnull          156
				style.addCompatExtras(bundle);
	//   76  151:aload_2         
	//   77  152:aload_1         
	//   78  153:invokevirtual   #612 <Method void NotificationCompat$Style.addCompatExtras(Bundle)>
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
	//    5   12:invokevirtual   #614 <Method Notification android.app.Notification$Builder.build()>
	//    6   15:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   7   16:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   19:bipush          24
	//*   9   21:icmplt          103
		{
			Notification notification = mBuilder.build();
	//   10   24:aload_0         
	//   11   25:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//   12   28:invokevirtual   #614 <Method Notification android.app.Notification$Builder.build()>
	//   13   31:astore_1        
			if(mGroupAlertBehavior != 0)
	//*  14   32:aload_0         
	//*  15   33:getfield        #358 <Field int mGroupAlertBehavior>
	//*  16   36:ifeq            101
			{
				if(notification.getGroup() != null && (notification.flags & 0x200) != 0 && mGroupAlertBehavior == 2)
	//*  17   39:aload_1         
	//*  18   40:invokevirtual   #618 <Method String Notification.getGroup()>
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
	//   31   67:invokespecial   #620 <Method void removeSoundAndVibration(Notification)>
				if(notification.getGroup() != null && (notification.flags & 0x200) == 0 && mGroupAlertBehavior == 1)
	//*  32   70:aload_1         
	//*  33   71:invokevirtual   #618 <Method String Notification.getGroup()>
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
	//   46   98:invokespecial   #620 <Method void removeSoundAndVibration(Notification)>
			}
			return notification;
	//   47  101:aload_1         
	//   48  102:areturn         
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  49  103:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*  50  106:bipush          21
	//*  51  108:icmplt          244
		{
			mBuilder.setExtras(mExtras);
	//   52  111:aload_0         
	//   53  112:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//   54  115:aload_0         
	//   55  116:getfield        #40  <Field Bundle mExtras>
	//   56  119:invokevirtual   #435 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
	//   57  122:pop             
			Notification notification1 = mBuilder.build();
	//   58  123:aload_0         
	//   59  124:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//   60  127:invokevirtual   #614 <Method Notification android.app.Notification$Builder.build()>
	//   61  130:astore_1        
			RemoteViews remoteviews = mContentView;
	//   62  131:aload_0         
	//   63  132:getfield        #309 <Field RemoteViews mContentView>
	//   64  135:astore_2        
			if(remoteviews != null)
	//*  65  136:aload_2         
	//*  66  137:ifnull          145
				notification1.contentView = remoteviews;
	//   67  140:aload_1         
	//   68  141:aload_2         
	//   69  142:putfield        #94  <Field RemoteViews Notification.contentView>
			remoteviews = mBigContentView;
	//   70  145:aload_0         
	//   71  146:getfield        #312 <Field RemoteViews mBigContentView>
	//   72  149:astore_2        
			if(remoteviews != null)
	//*  73  150:aload_2         
	//*  74  151:ifnull          159
				notification1.bigContentView = remoteviews;
	//   75  154:aload_1         
	//   76  155:aload_2         
	//   77  156:putfield        #598 <Field RemoteViews Notification.bigContentView>
			remoteviews = mHeadsUpContentView;
	//   78  159:aload_0         
	//   79  160:getfield        #396 <Field RemoteViews mHeadsUpContentView>
	//   80  163:astore_2        
			if(remoteviews != null)
	//*  81  164:aload_2         
	//*  82  165:ifnull          173
				notification1.headsUpContentView = remoteviews;
	//   83  168:aload_1         
	//   84  169:aload_2         
	//   85  170:putfield        #604 <Field RemoteViews Notification.headsUpContentView>
			if(mGroupAlertBehavior != 0)
	//*  86  173:aload_0         
	//*  87  174:getfield        #358 <Field int mGroupAlertBehavior>
	//*  88  177:ifeq            242
			{
				if(notification1.getGroup() != null && (notification1.flags & 0x200) != 0 && mGroupAlertBehavior == 2)
	//*  89  180:aload_1         
	//*  90  181:invokevirtual   #618 <Method String Notification.getGroup()>
	//*  91  184:ifnull          211
	//*  92  187:aload_1         
	//*  93  188:getfield        #133 <Field int Notification.flags>
	//*  94  191:sipush          512
	//*  95  194:iand            
	//*  96  195:ifeq            211
	//*  97  198:aload_0         
	//*  98  199:getfield        #358 <Field int mGroupAlertBehavior>
	//*  99  202:iconst_2        
	//* 100  203:icmpne          211
					removeSoundAndVibration(notification1);
	//  101  206:aload_0         
	//  102  207:aload_1         
	//  103  208:invokespecial   #620 <Method void removeSoundAndVibration(Notification)>
				if(notification1.getGroup() != null && (notification1.flags & 0x200) == 0 && mGroupAlertBehavior == 1)
	//* 104  211:aload_1         
	//* 105  212:invokevirtual   #618 <Method String Notification.getGroup()>
	//* 106  215:ifnull          242
	//* 107  218:aload_1         
	//* 108  219:getfield        #133 <Field int Notification.flags>
	//* 109  222:sipush          512
	//* 110  225:iand            
	//* 111  226:ifne            242
	//* 112  229:aload_0         
	//* 113  230:getfield        #358 <Field int mGroupAlertBehavior>
	//* 114  233:iconst_1        
	//* 115  234:icmpne          242
					removeSoundAndVibration(notification1);
	//  116  237:aload_0         
	//  117  238:aload_1         
	//  118  239:invokespecial   #620 <Method void removeSoundAndVibration(Notification)>
			}
			return notification1;
	//  119  242:aload_1         
	//  120  243:areturn         
		}
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//* 121  244:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 122  247:bipush          20
	//* 123  249:icmplt          371
		{
			mBuilder.setExtras(mExtras);
	//  124  252:aload_0         
	//  125  253:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  126  256:aload_0         
	//  127  257:getfield        #40  <Field Bundle mExtras>
	//  128  260:invokevirtual   #435 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
	//  129  263:pop             
			Notification notification2 = mBuilder.build();
	//  130  264:aload_0         
	//  131  265:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  132  268:invokevirtual   #614 <Method Notification android.app.Notification$Builder.build()>
	//  133  271:astore_1        
			RemoteViews remoteviews1 = mContentView;
	//  134  272:aload_0         
	//  135  273:getfield        #309 <Field RemoteViews mContentView>
	//  136  276:astore_2        
			if(remoteviews1 != null)
	//* 137  277:aload_2         
	//* 138  278:ifnull          286
				notification2.contentView = remoteviews1;
	//  139  281:aload_1         
	//  140  282:aload_2         
	//  141  283:putfield        #94  <Field RemoteViews Notification.contentView>
			remoteviews1 = mBigContentView;
	//  142  286:aload_0         
	//  143  287:getfield        #312 <Field RemoteViews mBigContentView>
	//  144  290:astore_2        
			if(remoteviews1 != null)
	//* 145  291:aload_2         
	//* 146  292:ifnull          300
				notification2.bigContentView = remoteviews1;
	//  147  295:aload_1         
	//  148  296:aload_2         
	//  149  297:putfield        #598 <Field RemoteViews Notification.bigContentView>
			if(mGroupAlertBehavior != 0)
	//* 150  300:aload_0         
	//* 151  301:getfield        #358 <Field int mGroupAlertBehavior>
	//* 152  304:ifeq            369
			{
				if(notification2.getGroup() != null && (notification2.flags & 0x200) != 0 && mGroupAlertBehavior == 2)
	//* 153  307:aload_1         
	//* 154  308:invokevirtual   #618 <Method String Notification.getGroup()>
	//* 155  311:ifnull          338
	//* 156  314:aload_1         
	//* 157  315:getfield        #133 <Field int Notification.flags>
	//* 158  318:sipush          512
	//* 159  321:iand            
	//* 160  322:ifeq            338
	//* 161  325:aload_0         
	//* 162  326:getfield        #358 <Field int mGroupAlertBehavior>
	//* 163  329:iconst_2        
	//* 164  330:icmpne          338
					removeSoundAndVibration(notification2);
	//  165  333:aload_0         
	//  166  334:aload_1         
	//  167  335:invokespecial   #620 <Method void removeSoundAndVibration(Notification)>
				if(notification2.getGroup() != null && (notification2.flags & 0x200) == 0 && mGroupAlertBehavior == 1)
	//* 168  338:aload_1         
	//* 169  339:invokevirtual   #618 <Method String Notification.getGroup()>
	//* 170  342:ifnull          369
	//* 171  345:aload_1         
	//* 172  346:getfield        #133 <Field int Notification.flags>
	//* 173  349:sipush          512
	//* 174  352:iand            
	//* 175  353:ifne            369
	//* 176  356:aload_0         
	//* 177  357:getfield        #358 <Field int mGroupAlertBehavior>
	//* 178  360:iconst_1        
	//* 179  361:icmpne          369
					removeSoundAndVibration(notification2);
	//  180  364:aload_0         
	//  181  365:aload_1         
	//  182  366:invokespecial   #620 <Method void removeSoundAndVibration(Notification)>
			}
			return notification2;
	//  183  369:aload_1         
	//  184  370:areturn         
		}
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//* 185  371:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 186  374:bipush          19
	//* 187  376:icmplt          452
		{
			Object obj = ((Object) (NotificationCompatJellybean.buildActionExtrasMap(mActionExtrasList)));
	//  188  379:aload_0         
	//  189  380:getfield        #35  <Field List mActionExtrasList>
	//  190  383:invokestatic    #624 <Method android.util.SparseArray NotificationCompatJellybean.buildActionExtrasMap(List)>
	//  191  386:astore_1        
			if(obj != null)
	//* 192  387:aload_1         
	//* 193  388:ifnull          402
				mExtras.putSparseParcelableArray("android.support.actionExtras", ((android.util.SparseArray) (obj)));
	//  194  391:aload_0         
	//  195  392:getfield        #40  <Field Bundle mExtras>
	//  196  395:ldc2            #626 <String "android.support.actionExtras">
	//  197  398:aload_1         
	//  198  399:invokevirtual   #630 <Method void Bundle.putSparseParcelableArray(String, android.util.SparseArray)>
			mBuilder.setExtras(mExtras);
	//  199  402:aload_0         
	//  200  403:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  201  406:aload_0         
	//  202  407:getfield        #40  <Field Bundle mExtras>
	//  203  410:invokevirtual   #435 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
	//  204  413:pop             
			obj = ((Object) (mBuilder.build()));
	//  205  414:aload_0         
	//  206  415:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  207  418:invokevirtual   #614 <Method Notification android.app.Notification$Builder.build()>
	//  208  421:astore_1        
			RemoteViews remoteviews2 = mContentView;
	//  209  422:aload_0         
	//  210  423:getfield        #309 <Field RemoteViews mContentView>
	//  211  426:astore_2        
			if(remoteviews2 != null)
	//* 212  427:aload_2         
	//* 213  428:ifnull          436
				obj.contentView = remoteviews2;
	//  214  431:aload_1         
	//  215  432:aload_2         
	//  216  433:putfield        #94  <Field RemoteViews Notification.contentView>
			remoteviews2 = mBigContentView;
	//  217  436:aload_0         
	//  218  437:getfield        #312 <Field RemoteViews mBigContentView>
	//  219  440:astore_2        
			if(remoteviews2 != null)
	//* 220  441:aload_2         
	//* 221  442:ifnull          450
				obj.bigContentView = remoteviews2;
	//  222  445:aload_1         
	//  223  446:aload_2         
	//  224  447:putfield        #598 <Field RemoteViews Notification.bigContentView>
			return ((Notification) (obj));
	//  225  450:aload_1         
	//  226  451:areturn         
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//* 227  452:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//* 228  455:bipush          16
	//* 229  457:icmplt          597
		{
			Notification notification3 = mBuilder.build();
	//  230  460:aload_0         
	//  231  461:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  232  464:invokevirtual   #614 <Method Notification android.app.Notification$Builder.build()>
	//  233  467:astore_1        
			Object obj1 = ((Object) (NotificationCompat.getExtras(notification3)));
	//  234  468:aload_1         
	//  235  469:invokestatic    #609 <Method Bundle NotificationCompat.getExtras(Notification)>
	//  236  472:astore_2        
			Bundle bundle = new Bundle(mExtras);
	//  237  473:new             #37  <Class Bundle>
	//  238  476:dup             
	//  239  477:aload_0         
	//  240  478:getfield        #40  <Field Bundle mExtras>
	//  241  481:invokespecial   #524 <Method void Bundle(Bundle)>
	//  242  484:astore_3        
			Iterator iterator = mExtras.keySet().iterator();
	//  243  485:aload_0         
	//  244  486:getfield        #40  <Field Bundle mExtras>
	//  245  489:invokevirtual   #634 <Method Set Bundle.keySet()>
	//  246  492:invokeinterface #637 <Method Iterator Set.iterator()>
	//  247  497:astore          4
			do
			{
				if(!iterator.hasNext())
					break;
	//  248  499:aload           4
	//  249  501:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//  250  506:ifeq            539
				String s = (String)iterator.next();
	//  251  509:aload           4
	//  252  511:invokeinterface #265 <Method Object Iterator.next()>
	//  253  516:checkcast       #332 <Class String>
	//  254  519:astore          5
				if(((Bundle) (obj1)).containsKey(s))
	//* 255  521:aload_2         
	//* 256  522:aload           5
	//* 257  524:invokevirtual   #641 <Method boolean Bundle.containsKey(String)>
	//* 258  527:ifeq            499
					bundle.remove(s);
	//  259  530:aload_3         
	//  260  531:aload           5
	//  261  533:invokevirtual   #645 <Method void Bundle.remove(String)>
			} while(true);
	//  262  536:goto            499
			((Bundle) (obj1)).putAll(bundle);
	//  263  539:aload_2         
	//  264  540:aload_3         
	//  265  541:invokevirtual   #276 <Method void Bundle.putAll(Bundle)>
			obj1 = ((Object) (NotificationCompatJellybean.buildActionExtrasMap(mActionExtrasList)));
	//  266  544:aload_0         
	//  267  545:getfield        #35  <Field List mActionExtrasList>
	//  268  548:invokestatic    #624 <Method android.util.SparseArray NotificationCompatJellybean.buildActionExtrasMap(List)>
	//  269  551:astore_2        
			if(obj1 != null)
	//* 270  552:aload_2         
	//* 271  553:ifnull          567
				NotificationCompat.getExtras(notification3).putSparseParcelableArray("android.support.actionExtras", ((android.util.SparseArray) (obj1)));
	//  272  556:aload_1         
	//  273  557:invokestatic    #609 <Method Bundle NotificationCompat.getExtras(Notification)>
	//  274  560:ldc2            #626 <String "android.support.actionExtras">
	//  275  563:aload_2         
	//  276  564:invokevirtual   #630 <Method void Bundle.putSparseParcelableArray(String, android.util.SparseArray)>
			obj1 = ((Object) (mContentView));
	//  277  567:aload_0         
	//  278  568:getfield        #309 <Field RemoteViews mContentView>
	//  279  571:astore_2        
			if(obj1 != null)
	//* 280  572:aload_2         
	//* 281  573:ifnull          581
				notification3.contentView = ((RemoteViews) (obj1));
	//  282  576:aload_1         
	//  283  577:aload_2         
	//  284  578:putfield        #94  <Field RemoteViews Notification.contentView>
			obj1 = ((Object) (mBigContentView));
	//  285  581:aload_0         
	//  286  582:getfield        #312 <Field RemoteViews mBigContentView>
	//  287  585:astore_2        
			if(obj1 != null)
	//* 288  586:aload_2         
	//* 289  587:ifnull          595
				notification3.bigContentView = ((RemoteViews) (obj1));
	//  290  590:aload_1         
	//  291  591:aload_2         
	//  292  592:putfield        #598 <Field RemoteViews Notification.bigContentView>
			return notification3;
	//  293  595:aload_1         
	//  294  596:areturn         
		} else
		{
			return mBuilder.getNotification();
	//  295  597:aload_0         
	//  296  598:getfield        #64  <Field android.app.Notification$Builder mBuilder>
	//  297  601:invokevirtual   #648 <Method Notification android.app.Notification$Builder.getNotification()>
	//  298  604:areturn         
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
