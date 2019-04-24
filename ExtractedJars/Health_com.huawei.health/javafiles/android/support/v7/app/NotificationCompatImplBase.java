// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;
import android.widget.RemoteViews;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

class NotificationCompatImplBase
{

	NotificationCompatImplBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static RemoteViews applyStandardTemplate(Context context, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, int i, int j, Bitmap bitmap, CharSequence charsequence3, 
			boolean flag, long l, int k, int i1, int j1, boolean flag1)
	{
		Resources resources = context.getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Resources Context.getResources()>
	//    2    4:astore          18
		RemoteViews remoteviews = new RemoteViews(context.getPackageName(), j1);
	//    3    6:new             #28  <Class RemoteViews>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:invokevirtual   #32  <Method String Context.getPackageName()>
	//    7   14:iload           13
	//    8   16:invokespecial   #35  <Method void RemoteViews(String, int)>
	//    9   19:astore          19
		boolean flag2 = false;
	//   10   21:iconst_0        
	//   11   22:istore          16
		j1 = 0;
	//   12   24:iconst_0        
	//   13   25:istore          13
		if(k < -1)
	//*  14   27:iload           11
	//*  15   29:iconst_m1       
	//*  16   30:icmpge          39
			k = 1;
	//   17   33:iconst_1        
	//   18   34:istore          11
		else
	//*  19   36:goto            42
			k = 0;
	//   20   39:iconst_0        
	//   21   40:istore          11
		if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT < 21)
	//*  22   42:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//*  23   45:bipush          16
	//*  24   47:icmplt          118
	//*  25   50:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//*  26   53:bipush          21
	//*  27   55:icmpge          118
			if(k != 0)
	//*  28   58:iload           11
	//*  29   60:ifeq            92
			{
				remoteviews.setInt(android.support.v7.appcompat.R.id.notification_background, "setBackgroundResource", android.support.v7.appcompat.R.drawable.notification_bg_low);
	//   30   63:aload           19
	//   31   65:getstatic       #45  <Field int android.support.v7.appcompat.R$id.notification_background>
	//   32   68:ldc1            #47  <String "setBackgroundResource">
	//   33   70:getstatic       #52  <Field int android.support.v7.appcompat.R$drawable.notification_bg_low>
	//   34   73:invokevirtual   #56  <Method void RemoteViews.setInt(int, String, int)>
				remoteviews.setInt(android.support.v7.appcompat.R.id.icon, "setBackgroundResource", android.support.v7.appcompat.R.drawable.notification_template_icon_low_bg);
	//   35   76:aload           19
	//   36   78:getstatic       #59  <Field int android.support.v7.appcompat.R$id.icon>
	//   37   81:ldc1            #47  <String "setBackgroundResource">
	//   38   83:getstatic       #62  <Field int android.support.v7.appcompat.R$drawable.notification_template_icon_low_bg>
	//   39   86:invokevirtual   #56  <Method void RemoteViews.setInt(int, String, int)>
			} else
	//*  40   89:goto            118
			{
				remoteviews.setInt(android.support.v7.appcompat.R.id.notification_background, "setBackgroundResource", android.support.v7.appcompat.R.drawable.notification_bg);
	//   41   92:aload           19
	//   42   94:getstatic       #45  <Field int android.support.v7.appcompat.R$id.notification_background>
	//   43   97:ldc1            #47  <String "setBackgroundResource">
	//   44   99:getstatic       #65  <Field int android.support.v7.appcompat.R$drawable.notification_bg>
	//   45  102:invokevirtual   #56  <Method void RemoteViews.setInt(int, String, int)>
				remoteviews.setInt(android.support.v7.appcompat.R.id.icon, "setBackgroundResource", android.support.v7.appcompat.R.drawable.notification_template_icon_bg);
	//   46  105:aload           19
	//   47  107:getstatic       #59  <Field int android.support.v7.appcompat.R$id.icon>
	//   48  110:ldc1            #47  <String "setBackgroundResource">
	//   49  112:getstatic       #68  <Field int android.support.v7.appcompat.R$drawable.notification_template_icon_bg>
	//   50  115:invokevirtual   #56  <Method void RemoteViews.setInt(int, String, int)>
			}
		if(bitmap != null)
	//*  51  118:aload           6
	//*  52  120:ifnull          253
		{
			if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  53  123:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//*  54  126:bipush          16
	//*  55  128:icmplt          153
			{
				remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.icon, 0);
	//   56  131:aload           19
	//   57  133:getstatic       #59  <Field int android.support.v7.appcompat.R$id.icon>
	//   58  136:iconst_0        
	//   59  137:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
				remoteviews.setImageViewBitmap(android.support.v7.appcompat.R.id.icon, bitmap);
	//   60  140:aload           19
	//   61  142:getstatic       #59  <Field int android.support.v7.appcompat.R$id.icon>
	//   62  145:aload           6
	//   63  147:invokevirtual   #76  <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
			} else
	//*  64  150:goto            163
			{
				remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.icon, 8);
	//   65  153:aload           19
	//   66  155:getstatic       #59  <Field int android.support.v7.appcompat.R$id.icon>
	//   67  158:bipush          8
	//   68  160:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
			}
			if(j != 0)
	//*  69  163:iload           5
	//*  70  165:ifeq            336
			{
				k = resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.notification_right_icon_size);
	//   71  168:aload           18
	//   72  170:getstatic       #81  <Field int android.support.v7.appcompat.R$dimen.notification_right_icon_size>
	//   73  173:invokevirtual   #87  <Method int Resources.getDimensionPixelSize(int)>
	//   74  176:istore          11
				int k1 = resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.notification_small_icon_background_padding);
	//   75  178:aload           18
	//   76  180:getstatic       #90  <Field int android.support.v7.appcompat.R$dimen.notification_small_icon_background_padding>
	//   77  183:invokevirtual   #87  <Method int Resources.getDimensionPixelSize(int)>
	//   78  186:istore          17
				if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  79  188:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//*  80  191:bipush          21
	//*  81  193:icmplt          226
				{
					context = ((Context) (createIconWithBackground(context, j, k, k - k1 * 2, i1)));
	//   82  196:aload_0         
	//   83  197:iload           5
	//   84  199:iload           11
	//   85  201:iload           11
	//   86  203:iload           17
	//   87  205:iconst_2        
	//   88  206:imul            
	//   89  207:isub            
	//   90  208:iload           12
	//   91  210:invokestatic    #94  <Method Bitmap createIconWithBackground(Context, int, int, int, int)>
	//   92  213:astore_0        
					remoteviews.setImageViewBitmap(android.support.v7.appcompat.R.id.right_icon, ((Bitmap) (context)));
	//   93  214:aload           19
	//   94  216:getstatic       #97  <Field int android.support.v7.appcompat.R$id.right_icon>
	//   95  219:aload_0         
	//   96  220:invokevirtual   #76  <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
				} else
	//*  97  223:goto            241
				{
					remoteviews.setImageViewBitmap(android.support.v7.appcompat.R.id.right_icon, createColoredBitmap(context, j, -1));
	//   98  226:aload           19
	//   99  228:getstatic       #97  <Field int android.support.v7.appcompat.R$id.right_icon>
	//  100  231:aload_0         
	//  101  232:iload           5
	//  102  234:iconst_m1       
	//  103  235:invokestatic    #101 <Method Bitmap createColoredBitmap(Context, int, int)>
	//  104  238:invokevirtual   #76  <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
				}
				remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.right_icon, 0);
	//  105  241:aload           19
	//  106  243:getstatic       #97  <Field int android.support.v7.appcompat.R$id.right_icon>
	//  107  246:iconst_0        
	//  108  247:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
			}
		} else
	//* 109  250:goto            336
		if(j != 0)
	//* 110  253:iload           5
	//* 111  255:ifeq            336
		{
			remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.icon, 0);
	//  112  258:aload           19
	//  113  260:getstatic       #59  <Field int android.support.v7.appcompat.R$id.icon>
	//  114  263:iconst_0        
	//  115  264:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 116  267:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//* 117  270:bipush          21
	//* 118  272:icmplt          321
			{
				context = ((Context) (createIconWithBackground(context, j, resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.notification_large_icon_width) - resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.notification_big_circle_margin), resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.notification_small_icon_size_as_large), i1)));
	//  119  275:aload_0         
	//  120  276:iload           5
	//  121  278:aload           18
	//  122  280:getstatic       #104 <Field int android.support.v7.appcompat.R$dimen.notification_large_icon_width>
	//  123  283:invokevirtual   #87  <Method int Resources.getDimensionPixelSize(int)>
	//  124  286:aload           18
	//  125  288:getstatic       #107 <Field int android.support.v7.appcompat.R$dimen.notification_big_circle_margin>
	//  126  291:invokevirtual   #87  <Method int Resources.getDimensionPixelSize(int)>
	//  127  294:isub            
	//  128  295:aload           18
	//  129  297:getstatic       #110 <Field int android.support.v7.appcompat.R$dimen.notification_small_icon_size_as_large>
	//  130  300:invokevirtual   #87  <Method int Resources.getDimensionPixelSize(int)>
	//  131  303:iload           12
	//  132  305:invokestatic    #94  <Method Bitmap createIconWithBackground(Context, int, int, int, int)>
	//  133  308:astore_0        
				remoteviews.setImageViewBitmap(android.support.v7.appcompat.R.id.icon, ((Bitmap) (context)));
	//  134  309:aload           19
	//  135  311:getstatic       #59  <Field int android.support.v7.appcompat.R$id.icon>
	//  136  314:aload_0         
	//  137  315:invokevirtual   #76  <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
			} else
	//* 138  318:goto            336
			{
				remoteviews.setImageViewBitmap(android.support.v7.appcompat.R.id.icon, createColoredBitmap(context, j, -1));
	//  139  321:aload           19
	//  140  323:getstatic       #59  <Field int android.support.v7.appcompat.R$id.icon>
	//  141  326:aload_0         
	//  142  327:iload           5
	//  143  329:iconst_m1       
	//  144  330:invokestatic    #101 <Method Bitmap createColoredBitmap(Context, int, int)>
	//  145  333:invokevirtual   #76  <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
			}
		}
		if(charsequence != null)
	//* 146  336:aload_1         
	//* 147  337:ifnull          349
			remoteviews.setTextViewText(android.support.v7.appcompat.R.id.title, charsequence);
	//  148  340:aload           19
	//  149  342:getstatic       #113 <Field int android.support.v7.appcompat.R$id.title>
	//  150  345:aload_1         
	//  151  346:invokevirtual   #117 <Method void RemoteViews.setTextViewText(int, CharSequence)>
		j = ((int) (flag2));
	//  152  349:iload           16
	//  153  351:istore          5
		if(charsequence1 != null)
	//* 154  353:aload_2         
	//* 155  354:ifnull          369
		{
			remoteviews.setTextViewText(android.support.v7.appcompat.R.id.text, charsequence1);
	//  156  357:aload           19
	//  157  359:getstatic       #120 <Field int android.support.v7.appcompat.R$id.text>
	//  158  362:aload_2         
	//  159  363:invokevirtual   #117 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			j = 1;
	//  160  366:iconst_1        
	//  161  367:istore          5
		}
		if(android.os.Build.VERSION.SDK_INT < 21 && bitmap != null)
	//* 162  369:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//* 163  372:bipush          21
	//* 164  374:icmpge          388
	//* 165  377:aload           6
	//* 166  379:ifnull          388
			k = 1;
	//  167  382:iconst_1        
	//  168  383:istore          11
		else
	//* 169  385:goto            391
			k = 0;
	//  170  388:iconst_0        
	//  171  389:istore          11
		if(charsequence2 != null)
	//* 172  391:aload_3         
	//* 173  392:ifnull          422
		{
			remoteviews.setTextViewText(android.support.v7.appcompat.R.id.info, charsequence2);
	//  174  395:aload           19
	//  175  397:getstatic       #123 <Field int android.support.v7.appcompat.R$id.info>
	//  176  400:aload_3         
	//  177  401:invokevirtual   #117 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.info, 0);
	//  178  404:aload           19
	//  179  406:getstatic       #123 <Field int android.support.v7.appcompat.R$id.info>
	//  180  409:iconst_0        
	//  181  410:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
			j = 1;
	//  182  413:iconst_1        
	//  183  414:istore          5
			i = 1;
	//  184  416:iconst_1        
	//  185  417:istore          4
		} else
	//* 186  419:goto            510
		if(i > 0)
	//* 187  422:iload           4
	//* 188  424:ifle            496
		{
			if(i > resources.getInteger(android.support.v7.appcompat.R.integer.status_bar_notification_info_maxnum))
	//* 189  427:iload           4
	//* 190  429:aload           18
	//* 191  431:getstatic       #128 <Field int android.support.v7.appcompat.R$integer.status_bar_notification_info_maxnum>
	//* 192  434:invokevirtual   #131 <Method int Resources.getInteger(int)>
	//* 193  437:icmple          459
			{
				remoteviews.setTextViewText(android.support.v7.appcompat.R.id.info, ((CharSequence) (resources.getString(android.support.v7.appcompat.R.string.status_bar_notification_info_overflow))));
	//  194  440:aload           19
	//  195  442:getstatic       #123 <Field int android.support.v7.appcompat.R$id.info>
	//  196  445:aload           18
	//  197  447:getstatic       #136 <Field int android.support.v7.appcompat.R$string.status_bar_notification_info_overflow>
	//  198  450:invokevirtual   #140 <Method String Resources.getString(int)>
	//  199  453:invokevirtual   #117 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			} else
	//* 200  456:goto            478
			{
				context = ((Context) (NumberFormat.getIntegerInstance()));
	//  201  459:invokestatic    #146 <Method NumberFormat NumberFormat.getIntegerInstance()>
	//  202  462:astore_0        
				remoteviews.setTextViewText(android.support.v7.appcompat.R.id.info, ((CharSequence) (((NumberFormat) (context)).format(i))));
	//  203  463:aload           19
	//  204  465:getstatic       #123 <Field int android.support.v7.appcompat.R$id.info>
	//  205  468:aload_0         
	//  206  469:iload           4
	//  207  471:i2l             
	//  208  472:invokevirtual   #150 <Method String NumberFormat.format(long)>
	//  209  475:invokevirtual   #117 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			}
			remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.info, 0);
	//  210  478:aload           19
	//  211  480:getstatic       #123 <Field int android.support.v7.appcompat.R$id.info>
	//  212  483:iconst_0        
	//  213  484:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
			j = 1;
	//  214  487:iconst_1        
	//  215  488:istore          5
			i = 1;
	//  216  490:iconst_1        
	//  217  491:istore          4
		} else
	//* 218  493:goto            510
		{
			remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.info, 8);
	//  219  496:aload           19
	//  220  498:getstatic       #123 <Field int android.support.v7.appcompat.R$id.info>
	//  221  501:bipush          8
	//  222  503:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
			i = k;
	//  223  506:iload           11
	//  224  508:istore          4
		}
		k = j1;
	//  225  510:iload           13
	//  226  512:istore          11
		if(charsequence3 != null)
	//* 227  514:aload           7
	//* 228  516:ifnull          583
		{
			k = j1;
	//  229  519:iload           13
	//  230  521:istore          11
			if(android.os.Build.VERSION.SDK_INT >= 16)
	//* 231  523:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//* 232  526:bipush          16
	//* 233  528:icmplt          583
			{
				remoteviews.setTextViewText(android.support.v7.appcompat.R.id.text, charsequence3);
	//  234  531:aload           19
	//  235  533:getstatic       #120 <Field int android.support.v7.appcompat.R$id.text>
	//  236  536:aload           7
	//  237  538:invokevirtual   #117 <Method void RemoteViews.setTextViewText(int, CharSequence)>
				if(charsequence1 != null)
	//* 238  541:aload_2         
	//* 239  542:ifnull          569
				{
					remoteviews.setTextViewText(android.support.v7.appcompat.R.id.text2, charsequence1);
	//  240  545:aload           19
	//  241  547:getstatic       #153 <Field int android.support.v7.appcompat.R$id.text2>
	//  242  550:aload_2         
	//  243  551:invokevirtual   #117 <Method void RemoteViews.setTextViewText(int, CharSequence)>
					remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.text2, 0);
	//  244  554:aload           19
	//  245  556:getstatic       #153 <Field int android.support.v7.appcompat.R$id.text2>
	//  246  559:iconst_0        
	//  247  560:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
					k = 1;
	//  248  563:iconst_1        
	//  249  564:istore          11
				} else
	//* 250  566:goto            583
				{
					remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.text2, 8);
	//  251  569:aload           19
	//  252  571:getstatic       #153 <Field int android.support.v7.appcompat.R$id.text2>
	//  253  574:bipush          8
	//  254  576:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
					k = j1;
	//  255  579:iload           13
	//  256  581:istore          11
				}
			}
		}
		if(k != 0 && android.os.Build.VERSION.SDK_INT >= 16)
	//* 257  583:iload           11
	//* 258  585:ifeq            635
	//* 259  588:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//* 260  591:bipush          16
	//* 261  593:icmplt          635
		{
			if(flag1)
	//* 262  596:iload           14
	//* 263  598:ifeq            623
			{
				float f = resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.notification_subtext_size);
	//  264  601:aload           18
	//  265  603:getstatic       #156 <Field int android.support.v7.appcompat.R$dimen.notification_subtext_size>
	//  266  606:invokevirtual   #87  <Method int Resources.getDimensionPixelSize(int)>
	//  267  609:i2f             
	//  268  610:fstore          15
				remoteviews.setTextViewTextSize(android.support.v7.appcompat.R.id.text, 0, f);
	//  269  612:aload           19
	//  270  614:getstatic       #120 <Field int android.support.v7.appcompat.R$id.text>
	//  271  617:iconst_0        
	//  272  618:fload           15
	//  273  620:invokevirtual   #160 <Method void RemoteViews.setTextViewTextSize(int, int, float)>
			}
			remoteviews.setViewPadding(android.support.v7.appcompat.R.id.line1, 0, 0, 0, 0);
	//  274  623:aload           19
	//  275  625:getstatic       #163 <Field int android.support.v7.appcompat.R$id.line1>
	//  276  628:iconst_0        
	//  277  629:iconst_0        
	//  278  630:iconst_0        
	//  279  631:iconst_0        
	//  280  632:invokevirtual   #167 <Method void RemoteViews.setViewPadding(int, int, int, int, int)>
		}
		if(l != 0L)
	//* 281  635:lload           9
	//* 282  637:lconst_0        
	//* 283  638:lcmp            
	//* 284  639:ifeq            722
		{
			if(flag && android.os.Build.VERSION.SDK_INT >= 16)
	//* 285  642:iload           8
	//* 286  644:ifeq            698
	//* 287  647:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//* 288  650:bipush          16
	//* 289  652:icmplt          698
			{
				remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.chronometer, 0);
	//  290  655:aload           19
	//  291  657:getstatic       #170 <Field int android.support.v7.appcompat.R$id.chronometer>
	//  292  660:iconst_0        
	//  293  661:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
				remoteviews.setLong(android.support.v7.appcompat.R.id.chronometer, "setBase", (SystemClock.elapsedRealtime() - System.currentTimeMillis()) + l);
	//  294  664:aload           19
	//  295  666:getstatic       #170 <Field int android.support.v7.appcompat.R$id.chronometer>
	//  296  669:ldc1            #172 <String "setBase">
	//  297  671:invokestatic    #178 <Method long SystemClock.elapsedRealtime()>
	//  298  674:invokestatic    #183 <Method long System.currentTimeMillis()>
	//  299  677:lsub            
	//  300  678:lload           9
	//  301  680:ladd            
	//  302  681:invokevirtual   #187 <Method void RemoteViews.setLong(int, String, long)>
				remoteviews.setBoolean(android.support.v7.appcompat.R.id.chronometer, "setStarted", true);
	//  303  684:aload           19
	//  304  686:getstatic       #170 <Field int android.support.v7.appcompat.R$id.chronometer>
	//  305  689:ldc1            #189 <String "setStarted">
	//  306  691:iconst_1        
	//  307  692:invokevirtual   #193 <Method void RemoteViews.setBoolean(int, String, boolean)>
			} else
	//* 308  695:goto            719
			{
				remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.time, 0);
	//  309  698:aload           19
	//  310  700:getstatic       #196 <Field int android.support.v7.appcompat.R$id.time>
	//  311  703:iconst_0        
	//  312  704:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
				remoteviews.setLong(android.support.v7.appcompat.R.id.time, "setTime", l);
	//  313  707:aload           19
	//  314  709:getstatic       #196 <Field int android.support.v7.appcompat.R$id.time>
	//  315  712:ldc1            #198 <String "setTime">
	//  316  714:lload           9
	//  317  716:invokevirtual   #187 <Method void RemoteViews.setLong(int, String, long)>
			}
			i = 1;
	//  318  719:iconst_1        
	//  319  720:istore          4
		}
		k = android.support.v7.appcompat.R.id.right_side;
	//  320  722:getstatic       #201 <Field int android.support.v7.appcompat.R$id.right_side>
	//  321  725:istore          11
		if(i != 0)
	//* 322  727:iload           4
	//* 323  729:ifeq            738
			i = 0;
	//  324  732:iconst_0        
	//  325  733:istore          4
		else
	//* 326  735:goto            742
			i = 8;
	//  327  738:bipush          8
	//  328  740:istore          4
		remoteviews.setViewVisibility(k, i);
	//  329  742:aload           19
	//  330  744:iload           11
	//  331  746:iload           4
	//  332  748:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
		k = android.support.v7.appcompat.R.id.line3;
	//  333  751:getstatic       #204 <Field int android.support.v7.appcompat.R$id.line3>
	//  334  754:istore          11
		if(j != 0)
	//* 335  756:iload           5
	//* 336  758:ifeq            767
			i = 0;
	//  337  761:iconst_0        
	//  338  762:istore          4
		else
	//* 339  764:goto            771
			i = 8;
	//  340  767:bipush          8
	//  341  769:istore          4
		remoteviews.setViewVisibility(k, i);
	//  342  771:aload           19
	//  343  773:iload           11
	//  344  775:iload           4
	//  345  777:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
		return remoteviews;
	//  346  780:aload           19
	//  347  782:areturn         
	}

	public static RemoteViews applyStandardTemplateWithActions(Context context, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, int i, int j, Bitmap bitmap, CharSequence charsequence3, 
			boolean flag, long l, int k, int i1, int j1, boolean flag1, 
			ArrayList arraylist)
	{
		charsequence = ((CharSequence) (applyStandardTemplate(context, charsequence, charsequence1, charsequence2, i, j, bitmap, charsequence3, flag, l, k, i1, j1, flag1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:iload           8
	//    9   14:lload           9
	//   10   16:iload           11
	//   11   18:iload           12
	//   12   20:iload           13
	//   13   22:iload           14
	//   14   24:invokestatic    #208 <Method RemoteViews applyStandardTemplate(Context, CharSequence, CharSequence, CharSequence, int, int, Bitmap, CharSequence, boolean, long, int, int, int, boolean)>
	//   15   27:astore_1        
		((RemoteViews) (charsequence)).removeAllViews(android.support.v7.appcompat.R.id.actions);
	//   16   28:aload_1         
	//   17   29:getstatic       #211 <Field int android.support.v7.appcompat.R$id.actions>
	//   18   32:invokevirtual   #215 <Method void RemoteViews.removeAllViews(int)>
		i = 0;
	//   19   35:iconst_0        
	//   20   36:istore          4
		j = i;
	//   21   38:iload           4
	//   22   40:istore          5
		if(arraylist != null)
	//*  23   42:aload           15
	//*  24   44:ifnull          125
		{
			k = arraylist.size();
	//   25   47:aload           15
	//   26   49:invokevirtual   #221 <Method int ArrayList.size()>
	//   27   52:istore          11
			j = i;
	//   28   54:iload           4
	//   29   56:istore          5
			if(k > 0)
	//*  30   58:iload           11
	//*  31   60:ifle            125
			{
				i1 = 1;
	//   32   63:iconst_1        
	//   33   64:istore          12
				i = k;
	//   34   66:iload           11
	//   35   68:istore          4
				if(k > 3)
	//*  36   70:iload           11
	//*  37   72:iconst_3        
	//*  38   73:icmple          79
					i = 3;
	//   39   76:iconst_3        
	//   40   77:istore          4
				k = 0;
	//   41   79:iconst_0        
	//   42   80:istore          11
				do
				{
					j = i1;
	//   43   82:iload           12
	//   44   84:istore          5
					if(k >= i)
						break;
	//   45   86:iload           11
	//   46   88:iload           4
	//   47   90:icmpge          125
					charsequence1 = ((CharSequence) (generateActionButton(context, (android.support.v4.app.NotificationCompat.Action)arraylist.get(k))));
	//   48   93:aload_0         
	//   49   94:aload           15
	//   50   96:iload           11
	//   51   98:invokevirtual   #225 <Method Object ArrayList.get(int)>
	//   52  101:checkcast       #227 <Class android.support.v4.app.NotificationCompat$Action>
	//   53  104:invokestatic    #231 <Method RemoteViews generateActionButton(Context, android.support.v4.app.NotificationCompat$Action)>
	//   54  107:astore_2        
					((RemoteViews) (charsequence)).addView(android.support.v7.appcompat.R.id.actions, ((RemoteViews) (charsequence1)));
	//   55  108:aload_1         
	//   56  109:getstatic       #211 <Field int android.support.v7.appcompat.R$id.actions>
	//   57  112:aload_2         
	//   58  113:invokevirtual   #235 <Method void RemoteViews.addView(int, RemoteViews)>
					k++;
	//   59  116:iload           11
	//   60  118:iconst_1        
	//   61  119:iadd            
	//   62  120:istore          11
				} while(true);
	//   63  122:goto            82
			}
		}
		if(j != 0)
	//*  64  125:iload           5
	//*  65  127:ifeq            136
			i = 0;
	//   66  130:iconst_0        
	//   67  131:istore          4
		else
	//*  68  133:goto            140
			i = 8;
	//   69  136:bipush          8
	//   70  138:istore          4
		((RemoteViews) (charsequence)).setViewVisibility(android.support.v7.appcompat.R.id.actions, i);
	//   71  140:aload_1         
	//   72  141:getstatic       #211 <Field int android.support.v7.appcompat.R$id.actions>
	//   73  144:iload           4
	//   74  146:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
		((RemoteViews) (charsequence)).setViewVisibility(android.support.v7.appcompat.R.id.action_divider, i);
	//   75  149:aload_1         
	//   76  150:getstatic       #238 <Field int android.support.v7.appcompat.R$id.action_divider>
	//   77  153:iload           4
	//   78  155:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
		return ((RemoteViews) (charsequence));
	//   79  158:aload_1         
	//   80  159:areturn         
	}

	public static void buildIntoRemoteViews(Context context, RemoteViews remoteviews, RemoteViews remoteviews1)
	{
		hideNormalContent(remoteviews);
	//    0    0:aload_1         
	//    1    1:invokestatic    #246 <Method void hideNormalContent(RemoteViews)>
		remoteviews.removeAllViews(android.support.v7.appcompat.R.id.notification_main_column);
	//    2    4:aload_1         
	//    3    5:getstatic       #249 <Field int android.support.v7.appcompat.R$id.notification_main_column>
	//    4    8:invokevirtual   #215 <Method void RemoteViews.removeAllViews(int)>
		remoteviews.addView(android.support.v7.appcompat.R.id.notification_main_column, remoteviews1.clone());
	//    5   11:aload_1         
	//    6   12:getstatic       #249 <Field int android.support.v7.appcompat.R$id.notification_main_column>
	//    7   15:aload_2         
	//    8   16:invokevirtual   #253 <Method RemoteViews RemoteViews.clone()>
	//    9   19:invokevirtual   #235 <Method void RemoteViews.addView(int, RemoteViews)>
		remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.notification_main_column, 0);
	//   10   22:aload_1         
	//   11   23:getstatic       #249 <Field int android.support.v7.appcompat.R$id.notification_main_column>
	//   12   26:iconst_0        
	//   13   27:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  14   30:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   33:bipush          21
	//*  16   35:icmplt          52
			remoteviews.setViewPadding(android.support.v7.appcompat.R.id.notification_main_column_container, 0, calculateTopPadding(context), 0, 0);
	//   17   38:aload_1         
	//   18   39:getstatic       #256 <Field int android.support.v7.appcompat.R$id.notification_main_column_container>
	//   19   42:iconst_0        
	//   20   43:aload_0         
	//   21   44:invokestatic    #260 <Method int calculateTopPadding(Context)>
	//   22   47:iconst_0        
	//   23   48:iconst_0        
	//   24   49:invokevirtual   #167 <Method void RemoteViews.setViewPadding(int, int, int, int, int)>
	//   25   52:return          
	}

	public static int calculateTopPadding(Context context)
	{
		int i = context.getResources().getDimensionPixelSize(android.support.v7.appcompat.R.dimen.notification_top_pad);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Resources Context.getResources()>
	//    2    4:getstatic       #263 <Field int android.support.v7.appcompat.R$dimen.notification_top_pad>
	//    3    7:invokevirtual   #87  <Method int Resources.getDimensionPixelSize(int)>
	//    4   10:istore_2        
		int j = context.getResources().getDimensionPixelSize(android.support.v7.appcompat.R.dimen.notification_top_pad_large_text);
	//    5   11:aload_0         
	//    6   12:invokevirtual   #26  <Method Resources Context.getResources()>
	//    7   15:getstatic       #266 <Field int android.support.v7.appcompat.R$dimen.notification_top_pad_large_text>
	//    8   18:invokevirtual   #87  <Method int Resources.getDimensionPixelSize(int)>
	//    9   21:istore_3        
		float f = (constrain(context.getResources().getConfiguration().fontScale, 1.0F, 1.3F) - 1.0F) / 0.3F;
	//   10   22:aload_0         
	//   11   23:invokevirtual   #26  <Method Resources Context.getResources()>
	//   12   26:invokevirtual   #270 <Method Configuration Resources.getConfiguration()>
	//   13   29:getfield        #276 <Field float Configuration.fontScale>
	//   14   32:fconst_1        
	//   15   33:ldc2            #277 <Float 1.3F>
	//   16   36:invokestatic    #281 <Method float constrain(float, float, float)>
	//   17   39:fconst_1        
	//   18   40:fsub            
	//   19   41:ldc2            #282 <Float 0.3F>
	//   20   44:fdiv            
	//   21   45:fstore_1        
		return Math.round((1.0F - f) * (float)i + (float)j * f);
	//   22   46:fconst_1        
	//   23   47:fload_1         
	//   24   48:fsub            
	//   25   49:iload_2         
	//   26   50:i2f             
	//   27   51:fmul            
	//   28   52:iload_3         
	//   29   53:i2f             
	//   30   54:fload_1         
	//   31   55:fmul            
	//   32   56:fadd            
	//   33   57:invokestatic    #288 <Method int Math.round(float)>
	//   34   60:ireturn         
	}

	public static float constrain(float f, float f1, float f2)
	{
		if(f < f1)
	//*   0    0:fload_0         
	//*   1    1:fload_1         
	//*   2    2:fcmpg           
	//*   3    3:ifge            8
			return f1;
	//    4    6:fload_1         
	//    5    7:freturn         
		if(f > f2)
	//*   6    8:fload_0         
	//*   7    9:fload_2         
	//*   8   10:fcmpl           
	//*   9   11:ifle            16
			return f2;
	//   10   14:fload_2         
	//   11   15:freturn         
		else
			return f;
	//   12   16:fload_0         
	//   13   17:freturn         
	}

	private static Bitmap createColoredBitmap(Context context, int i, int j)
	{
		return createColoredBitmap(context, i, j, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #291 <Method Bitmap createColoredBitmap(Context, int, int, int)>
	//    5    7:areturn         
	}

	private static Bitmap createColoredBitmap(Context context, int i, int j, int k)
	{
		context = ((Context) (context.getResources().getDrawable(i)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Resources Context.getResources()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #295 <Method Drawable Resources.getDrawable(int)>
	//    4    8:astore_0        
		if(k == 0)
	//*   5    9:iload_3         
	//*   6   10:ifne            21
			i = ((Drawable) (context)).getIntrinsicWidth();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #300 <Method int Drawable.getIntrinsicWidth()>
	//    9   17:istore_1        
		else
	//*  10   18:goto            23
			i = k;
	//   11   21:iload_3         
	//   12   22:istore_1        
		if(k == 0)
	//*  13   23:iload_3         
	//*  14   24:ifne            35
			k = ((Drawable) (context)).getIntrinsicHeight();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #303 <Method int Drawable.getIntrinsicHeight()>
	//   17   31:istore_3        
	//*  18   32:goto            35
		Bitmap bitmap = Bitmap.createBitmap(i, k, android.graphics.Bitmap.Config.ARGB_8888);
	//   19   35:iload_1         
	//   20   36:iload_3         
	//   21   37:getstatic       #309 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   22   40:invokestatic    #315 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   23   43:astore          4
		((Drawable) (context)).setBounds(0, 0, i, k);
	//   24   45:aload_0         
	//   25   46:iconst_0        
	//   26   47:iconst_0        
	//   27   48:iload_1         
	//   28   49:iload_3         
	//   29   50:invokevirtual   #319 <Method void Drawable.setBounds(int, int, int, int)>
		if(j != 0)
	//*  30   53:iload_2         
	//*  31   54:ifeq            75
			((Drawable) (context)).mutate().setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(j, android.graphics.PorterDuff.Mode.SRC_IN))));
	//   32   57:aload_0         
	//   33   58:invokevirtual   #323 <Method Drawable Drawable.mutate()>
	//   34   61:new             #325 <Class PorterDuffColorFilter>
	//   35   64:dup             
	//   36   65:iload_2         
	//   37   66:getstatic       #331 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   38   69:invokespecial   #334 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   39   72:invokevirtual   #338 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
		((Drawable) (context)).draw(new Canvas(bitmap));
	//   40   75:aload_0         
	//   41   76:new             #340 <Class Canvas>
	//   42   79:dup             
	//   43   80:aload           4
	//   44   82:invokespecial   #343 <Method void Canvas(Bitmap)>
	//   45   85:invokevirtual   #347 <Method void Drawable.draw(Canvas)>
		return bitmap;
	//   46   88:aload           4
	//   47   90:areturn         
	}

	public static Bitmap createIconWithBackground(Context context, int i, int j, int k, int l)
	{
		int i1 = android.support.v7.appcompat.R.drawable.notification_icon_background;
	//    0    0:getstatic       #350 <Field int android.support.v7.appcompat.R$drawable.notification_icon_background>
	//    1    3:istore          5
		if(l == 0)
	//*   2    5:iload           4
	//*   3    7:ifne            16
			l = 0;
	//    4   10:iconst_0        
	//    5   11:istore          4
	//*   6   13:goto            16
		Bitmap bitmap = createColoredBitmap(context, i1, l, j);
	//    7   16:aload_0         
	//    8   17:iload           5
	//    9   19:iload           4
	//   10   21:iload_2         
	//   11   22:invokestatic    #291 <Method Bitmap createColoredBitmap(Context, int, int, int)>
	//   12   25:astore          6
		Canvas canvas = new Canvas(bitmap);
	//   13   27:new             #340 <Class Canvas>
	//   14   30:dup             
	//   15   31:aload           6
	//   16   33:invokespecial   #343 <Method void Canvas(Bitmap)>
	//   17   36:astore          7
		context = ((Context) (context.getResources().getDrawable(i).mutate()));
	//   18   38:aload_0         
	//   19   39:invokevirtual   #26  <Method Resources Context.getResources()>
	//   20   42:iload_1         
	//   21   43:invokevirtual   #295 <Method Drawable Resources.getDrawable(int)>
	//   22   46:invokevirtual   #323 <Method Drawable Drawable.mutate()>
	//   23   49:astore_0        
		((Drawable) (context)).setFilterBitmap(true);
	//   24   50:aload_0         
	//   25   51:iconst_1        
	//   26   52:invokevirtual   #354 <Method void Drawable.setFilterBitmap(boolean)>
		i = (j - k) / 2;
	//   27   55:iload_2         
	//   28   56:iload_3         
	//   29   57:isub            
	//   30   58:iconst_2        
	//   31   59:idiv            
	//   32   60:istore_1        
		((Drawable) (context)).setBounds(i, i, k + i, k + i);
	//   33   61:aload_0         
	//   34   62:iload_1         
	//   35   63:iload_1         
	//   36   64:iload_3         
	//   37   65:iload_1         
	//   38   66:iadd            
	//   39   67:iload_3         
	//   40   68:iload_1         
	//   41   69:iadd            
	//   42   70:invokevirtual   #319 <Method void Drawable.setBounds(int, int, int, int)>
		((Drawable) (context)).setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP))));
	//   43   73:aload_0         
	//   44   74:new             #325 <Class PorterDuffColorFilter>
	//   45   77:dup             
	//   46   78:iconst_m1       
	//   47   79:getstatic       #357 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_ATOP>
	//   48   82:invokespecial   #334 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   49   85:invokevirtual   #338 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
		((Drawable) (context)).draw(canvas);
	//   50   88:aload_0         
	//   51   89:aload           7
	//   52   91:invokevirtual   #347 <Method void Drawable.draw(Canvas)>
		return bitmap;
	//   53   94:aload           6
	//   54   96:areturn         
	}

	private static RemoteViews generateActionButton(Context context, android.support.v4.app.NotificationCompat.Action action)
	{
		boolean flag;
		if(action.actionIntent == null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #361 <Field PendingIntent android.support.v4.app.NotificationCompat$Action.actionIntent>
	//*   2    4:ifnonnull       12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Object obj = ((Object) (context.getPackageName()));
	//    8   14:aload_0         
	//    9   15:invokevirtual   #32  <Method String Context.getPackageName()>
	//   10   18:astore          4
		int i;
		if(flag)
	//*  11   20:iload_2         
	//*  12   21:ifeq            31
			i = getActionTombstoneLayoutResource();
	//   13   24:invokestatic    #364 <Method int getActionTombstoneLayoutResource()>
	//   14   27:istore_3        
		else
	//*  15   28:goto            35
			i = getActionLayoutResource();
	//   16   31:invokestatic    #367 <Method int getActionLayoutResource()>
	//   17   34:istore_3        
		obj = ((Object) (new RemoteViews(((String) (obj)), i)));
	//   18   35:new             #28  <Class RemoteViews>
	//   19   38:dup             
	//   20   39:aload           4
	//   21   41:iload_3         
	//   22   42:invokespecial   #35  <Method void RemoteViews(String, int)>
	//   23   45:astore          4
		((RemoteViews) (obj)).setImageViewBitmap(android.support.v7.appcompat.R.id.action_image, createColoredBitmap(context, action.getIcon(), context.getResources().getColor(android.support.v7.appcompat.R.color.notification_action_color_filter)));
	//   24   47:aload           4
	//   25   49:getstatic       #370 <Field int android.support.v7.appcompat.R$id.action_image>
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #373 <Method int android.support.v4.app.NotificationCompat$Action.getIcon()>
	//   29   57:aload_0         
	//   30   58:invokevirtual   #26  <Method Resources Context.getResources()>
	//   31   61:getstatic       #378 <Field int android.support.v7.appcompat.R$color.notification_action_color_filter>
	//   32   64:invokevirtual   #381 <Method int Resources.getColor(int)>
	//   33   67:invokestatic    #101 <Method Bitmap createColoredBitmap(Context, int, int)>
	//   34   70:invokevirtual   #76  <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
		((RemoteViews) (obj)).setTextViewText(android.support.v7.appcompat.R.id.action_text, action.title);
	//   35   73:aload           4
	//   36   75:getstatic       #384 <Field int android.support.v7.appcompat.R$id.action_text>
	//   37   78:aload_1         
	//   38   79:getfield        #387 <Field CharSequence android.support.v4.app.NotificationCompat$Action.title>
	//   39   82:invokevirtual   #117 <Method void RemoteViews.setTextViewText(int, CharSequence)>
		if(!flag)
	//*  40   85:iload_2         
	//*  41   86:ifne            101
			((RemoteViews) (obj)).setOnClickPendingIntent(android.support.v7.appcompat.R.id.action_container, action.actionIntent);
	//   42   89:aload           4
	//   43   91:getstatic       #390 <Field int android.support.v7.appcompat.R$id.action_container>
	//   44   94:aload_1         
	//   45   95:getfield        #361 <Field PendingIntent android.support.v4.app.NotificationCompat$Action.actionIntent>
	//   46   98:invokevirtual   #394 <Method void RemoteViews.setOnClickPendingIntent(int, PendingIntent)>
		if(android.os.Build.VERSION.SDK_INT >= 15)
	//*  47  101:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//*  48  104:bipush          15
	//*  49  106:icmplt          121
			((RemoteViews) (obj)).setContentDescription(android.support.v7.appcompat.R.id.action_container, action.title);
	//   50  109:aload           4
	//   51  111:getstatic       #390 <Field int android.support.v7.appcompat.R$id.action_container>
	//   52  114:aload_1         
	//   53  115:getfield        #387 <Field CharSequence android.support.v4.app.NotificationCompat$Action.title>
	//   54  118:invokevirtual   #397 <Method void RemoteViews.setContentDescription(int, CharSequence)>
		return ((RemoteViews) (obj));
	//   55  121:aload           4
	//   56  123:areturn         
	}

	private static RemoteViews generateContentViewMedia(Context context, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, int i, Bitmap bitmap, CharSequence charsequence3, boolean flag, 
			long l, int j, List list, int ai[], boolean flag1, PendingIntent pendingintent, 
			boolean flag2)
	{
		int k;
		if(flag2)
	//*   0    0:iload           15
	//*   1    2:ifeq            13
			k = android.support.v7.appcompat.R.layout.notification_template_media_custom;
	//    2    5:getstatic       #405 <Field int android.support.v7.appcompat.R$layout.notification_template_media_custom>
	//    3    8:istore          16
		else
	//*   4   10:goto            18
			k = android.support.v7.appcompat.R.layout.notification_template_media;
	//    5   13:getstatic       #408 <Field int android.support.v7.appcompat.R$layout.notification_template_media>
	//    6   16:istore          16
		charsequence = ((CharSequence) (applyStandardTemplate(context, charsequence, charsequence1, charsequence2, i, 0, bitmap, charsequence3, flag, l, j, 0, k, true)));
	//    7   18:aload_0         
	//    8   19:aload_1         
	//    9   20:aload_2         
	//   10   21:aload_3         
	//   11   22:iload           4
	//   12   24:iconst_0        
	//   13   25:aload           5
	//   14   27:aload           6
	//   15   29:iload           7
	//   16   31:lload           8
	//   17   33:iload           10
	//   18   35:iconst_0        
	//   19   36:iload           16
	//   20   38:iconst_1        
	//   21   39:invokestatic    #208 <Method RemoteViews applyStandardTemplate(Context, CharSequence, CharSequence, CharSequence, int, int, Bitmap, CharSequence, boolean, long, int, int, int, boolean)>
	//   22   42:astore_1        
		k = list.size();
	//   23   43:aload           11
	//   24   45:invokeinterface #411 <Method int List.size()>
	//   25   50:istore          16
		if(ai == null)
	//*  26   52:aload           12
	//*  27   54:ifnonnull       63
			i = 0;
	//   28   57:iconst_0        
	//   29   58:istore          4
		else
	//*  30   60:goto            72
			i = Math.min(ai.length, 3);
	//   31   63:aload           12
	//   32   65:arraylength     
	//   33   66:iconst_3        
	//   34   67:invokestatic    #415 <Method int Math.min(int, int)>
	//   35   70:istore          4
		((RemoteViews) (charsequence)).removeAllViews(android.support.v7.appcompat.R.id.media_actions);
	//   36   72:aload_1         
	//   37   73:getstatic       #418 <Field int android.support.v7.appcompat.R$id.media_actions>
	//   38   76:invokevirtual   #215 <Method void RemoteViews.removeAllViews(int)>
		if(i > 0)
	//*  39   79:iload           4
	//*  40   81:ifle            174
			for(j = 0; j < i; j++)
	//*  41   84:iconst_0        
	//*  42   85:istore          10
	//*  43   87:iload           10
	//*  44   89:iload           4
	//*  45   91:icmpge          174
			{
				if(j >= k)
	//*  46   94:iload           10
	//*  47   96:iload           16
	//*  48   98:icmplt          137
					throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[] {
						Integer.valueOf(j), Integer.valueOf(k - 1)
					}));
	//   49  101:new             #420 <Class IllegalArgumentException>
	//   50  104:dup             
	//   51  105:ldc2            #422 <String "setShowActionsInCompactView: action %d out of bounds (max %d)">
	//   52  108:iconst_2        
	//   53  109:anewarray       Object[]
	//   54  112:dup             
	//   55  113:iconst_0        
	//   56  114:iload           10
	//   57  116:invokestatic    #428 <Method Integer Integer.valueOf(int)>
	//   58  119:aastore         
	//   59  120:dup             
	//   60  121:iconst_1        
	//   61  122:iload           16
	//   62  124:iconst_1        
	//   63  125:isub            
	//   64  126:invokestatic    #428 <Method Integer Integer.valueOf(int)>
	//   65  129:aastore         
	//   66  130:invokestatic    #433 <Method String String.format(String, Object[])>
	//   67  133:invokespecial   #436 <Method void IllegalArgumentException(String)>
	//   68  136:athrow          
				charsequence1 = ((CharSequence) (generateMediaActionButton(context, (android.support.v4.app.NotificationCompatBase.Action)list.get(ai[j]))));
	//   69  137:aload_0         
	//   70  138:aload           11
	//   71  140:aload           12
	//   72  142:iload           10
	//   73  144:iaload          
	//   74  145:invokeinterface #437 <Method Object List.get(int)>
	//   75  150:checkcast       #439 <Class android.support.v4.app.NotificationCompatBase$Action>
	//   76  153:invokestatic    #443 <Method RemoteViews generateMediaActionButton(Context, android.support.v4.app.NotificationCompatBase$Action)>
	//   77  156:astore_2        
				((RemoteViews) (charsequence)).addView(android.support.v7.appcompat.R.id.media_actions, ((RemoteViews) (charsequence1)));
	//   78  157:aload_1         
	//   79  158:getstatic       #418 <Field int android.support.v7.appcompat.R$id.media_actions>
	//   80  161:aload_2         
	//   81  162:invokevirtual   #235 <Method void RemoteViews.addView(int, RemoteViews)>
			}

	//   82  165:iload           10
	//   83  167:iconst_1        
	//   84  168:iadd            
	//   85  169:istore          10
	//*  86  171:goto            87
		if(flag1)
	//*  87  174:iload           13
	//*  88  176:ifeq            227
		{
			((RemoteViews) (charsequence)).setViewVisibility(android.support.v7.appcompat.R.id.end_padder, 8);
	//   89  179:aload_1         
	//   90  180:getstatic       #446 <Field int android.support.v7.appcompat.R$id.end_padder>
	//   91  183:bipush          8
	//   92  185:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
			((RemoteViews) (charsequence)).setViewVisibility(android.support.v7.appcompat.R.id.cancel_action, 0);
	//   93  188:aload_1         
	//   94  189:getstatic       #449 <Field int android.support.v7.appcompat.R$id.cancel_action>
	//   95  192:iconst_0        
	//   96  193:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
			((RemoteViews) (charsequence)).setOnClickPendingIntent(android.support.v7.appcompat.R.id.cancel_action, pendingintent);
	//   97  196:aload_1         
	//   98  197:getstatic       #449 <Field int android.support.v7.appcompat.R$id.cancel_action>
	//   99  200:aload           14
	//  100  202:invokevirtual   #394 <Method void RemoteViews.setOnClickPendingIntent(int, PendingIntent)>
			((RemoteViews) (charsequence)).setInt(android.support.v7.appcompat.R.id.cancel_action, "setAlpha", context.getResources().getInteger(android.support.v7.appcompat.R.integer.cancel_button_image_alpha));
	//  101  205:aload_1         
	//  102  206:getstatic       #449 <Field int android.support.v7.appcompat.R$id.cancel_action>
	//  103  209:ldc2            #451 <String "setAlpha">
	//  104  212:aload_0         
	//  105  213:invokevirtual   #26  <Method Resources Context.getResources()>
	//  106  216:getstatic       #454 <Field int android.support.v7.appcompat.R$integer.cancel_button_image_alpha>
	//  107  219:invokevirtual   #131 <Method int Resources.getInteger(int)>
	//  108  222:invokevirtual   #56  <Method void RemoteViews.setInt(int, String, int)>
			return ((RemoteViews) (charsequence));
	//  109  225:aload_1         
	//  110  226:areturn         
		} else
		{
			((RemoteViews) (charsequence)).setViewVisibility(android.support.v7.appcompat.R.id.end_padder, 0);
	//  111  227:aload_1         
	//  112  228:getstatic       #446 <Field int android.support.v7.appcompat.R$id.end_padder>
	//  113  231:iconst_0        
	//  114  232:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
			((RemoteViews) (charsequence)).setViewVisibility(android.support.v7.appcompat.R.id.cancel_action, 8);
	//  115  235:aload_1         
	//  116  236:getstatic       #449 <Field int android.support.v7.appcompat.R$id.cancel_action>
	//  117  239:bipush          8
	//  118  241:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
			return ((RemoteViews) (charsequence));
	//  119  244:aload_1         
	//  120  245:areturn         
		}
	}

	private static RemoteViews generateMediaActionButton(Context context, android.support.v4.app.NotificationCompatBase.Action action)
	{
		boolean flag;
		if(action.getActionIntent() == null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #460 <Method PendingIntent android.support.v4.app.NotificationCompatBase$Action.getActionIntent()>
	//*   2    4:ifnonnull       12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		context = ((Context) (new RemoteViews(context.getPackageName(), android.support.v7.appcompat.R.layout.notification_media_action)));
	//    8   14:new             #28  <Class RemoteViews>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokevirtual   #32  <Method String Context.getPackageName()>
	//   12   22:getstatic       #463 <Field int android.support.v7.appcompat.R$layout.notification_media_action>
	//   13   25:invokespecial   #35  <Method void RemoteViews(String, int)>
	//   14   28:astore_0        
		((RemoteViews) (context)).setImageViewResource(android.support.v7.appcompat.R.id.action0, action.getIcon());
	//   15   29:aload_0         
	//   16   30:getstatic       #466 <Field int android.support.v7.appcompat.R$id.action0>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #467 <Method int android.support.v4.app.NotificationCompatBase$Action.getIcon()>
	//   19   37:invokevirtual   #470 <Method void RemoteViews.setImageViewResource(int, int)>
		if(!flag)
	//*  20   40:iload_2         
	//*  21   41:ifne            55
			((RemoteViews) (context)).setOnClickPendingIntent(android.support.v7.appcompat.R.id.action0, action.getActionIntent());
	//   22   44:aload_0         
	//   23   45:getstatic       #466 <Field int android.support.v7.appcompat.R$id.action0>
	//   24   48:aload_1         
	//   25   49:invokevirtual   #460 <Method PendingIntent android.support.v4.app.NotificationCompatBase$Action.getActionIntent()>
	//   26   52:invokevirtual   #394 <Method void RemoteViews.setOnClickPendingIntent(int, PendingIntent)>
		if(android.os.Build.VERSION.SDK_INT >= 15)
	//*  27   55:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//*  28   58:bipush          15
	//*  29   60:icmplt          74
			((RemoteViews) (context)).setContentDescription(android.support.v7.appcompat.R.id.action0, action.getTitle());
	//   30   63:aload_0         
	//   31   64:getstatic       #466 <Field int android.support.v7.appcompat.R$id.action0>
	//   32   67:aload_1         
	//   33   68:invokevirtual   #474 <Method CharSequence android.support.v4.app.NotificationCompatBase$Action.getTitle()>
	//   34   71:invokevirtual   #397 <Method void RemoteViews.setContentDescription(int, CharSequence)>
		return ((RemoteViews) (context));
	//   35   74:aload_0         
	//   36   75:areturn         
	}

	public static RemoteViews generateMediaBigView(Context context, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, int i, Bitmap bitmap, CharSequence charsequence3, boolean flag, 
			long l, int j, int k, List list, boolean flag1, PendingIntent pendingintent, 
			boolean flag2)
	{
		int i1 = Math.min(list.size(), 5);
	//    0    0:aload           12
	//    1    2:invokeinterface #411 <Method int List.size()>
	//    2    7:iconst_5        
	//    3    8:invokestatic    #415 <Method int Math.min(int, int)>
	//    4   11:istore          16
		charsequence = ((CharSequence) (applyStandardTemplate(context, charsequence, charsequence1, charsequence2, i, 0, bitmap, charsequence3, flag, l, j, k, getBigMediaLayoutResource(flag2, i1), false)));
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:aload_3         
	//    9   17:iload           4
	//   10   19:iconst_0        
	//   11   20:aload           5
	//   12   22:aload           6
	//   13   24:iload           7
	//   14   26:lload           8
	//   15   28:iload           10
	//   16   30:iload           11
	//   17   32:iload           15
	//   18   34:iload           16
	//   19   36:invokestatic    #480 <Method int getBigMediaLayoutResource(boolean, int)>
	//   20   39:iconst_0        
	//   21   40:invokestatic    #208 <Method RemoteViews applyStandardTemplate(Context, CharSequence, CharSequence, CharSequence, int, int, Bitmap, CharSequence, boolean, long, int, int, int, boolean)>
	//   22   43:astore_1        
		((RemoteViews) (charsequence)).removeAllViews(android.support.v7.appcompat.R.id.media_actions);
	//   23   44:aload_1         
	//   24   45:getstatic       #418 <Field int android.support.v7.appcompat.R$id.media_actions>
	//   25   48:invokevirtual   #215 <Method void RemoteViews.removeAllViews(int)>
		if(i1 > 0)
	//*  26   51:iload           16
	//*  27   53:ifle            100
			for(i = 0; i < i1; i++)
	//*  28   56:iconst_0        
	//*  29   57:istore          4
	//*  30   59:iload           4
	//*  31   61:iload           16
	//*  32   63:icmpge          100
			{
				charsequence1 = ((CharSequence) (generateMediaActionButton(context, (android.support.v4.app.NotificationCompatBase.Action)list.get(i))));
	//   33   66:aload_0         
	//   34   67:aload           12
	//   35   69:iload           4
	//   36   71:invokeinterface #437 <Method Object List.get(int)>
	//   37   76:checkcast       #439 <Class android.support.v4.app.NotificationCompatBase$Action>
	//   38   79:invokestatic    #443 <Method RemoteViews generateMediaActionButton(Context, android.support.v4.app.NotificationCompatBase$Action)>
	//   39   82:astore_2        
				((RemoteViews) (charsequence)).addView(android.support.v7.appcompat.R.id.media_actions, ((RemoteViews) (charsequence1)));
	//   40   83:aload_1         
	//   41   84:getstatic       #418 <Field int android.support.v7.appcompat.R$id.media_actions>
	//   42   87:aload_2         
	//   43   88:invokevirtual   #235 <Method void RemoteViews.addView(int, RemoteViews)>
			}

	//   44   91:iload           4
	//   45   93:iconst_1        
	//   46   94:iadd            
	//   47   95:istore          4
	//*  48   97:goto            59
		if(flag1)
	//*  49  100:iload           13
	//*  50  102:ifeq            144
		{
			((RemoteViews) (charsequence)).setViewVisibility(android.support.v7.appcompat.R.id.cancel_action, 0);
	//   51  105:aload_1         
	//   52  106:getstatic       #449 <Field int android.support.v7.appcompat.R$id.cancel_action>
	//   53  109:iconst_0        
	//   54  110:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
			((RemoteViews) (charsequence)).setInt(android.support.v7.appcompat.R.id.cancel_action, "setAlpha", context.getResources().getInteger(android.support.v7.appcompat.R.integer.cancel_button_image_alpha));
	//   55  113:aload_1         
	//   56  114:getstatic       #449 <Field int android.support.v7.appcompat.R$id.cancel_action>
	//   57  117:ldc2            #451 <String "setAlpha">
	//   58  120:aload_0         
	//   59  121:invokevirtual   #26  <Method Resources Context.getResources()>
	//   60  124:getstatic       #454 <Field int android.support.v7.appcompat.R$integer.cancel_button_image_alpha>
	//   61  127:invokevirtual   #131 <Method int Resources.getInteger(int)>
	//   62  130:invokevirtual   #56  <Method void RemoteViews.setInt(int, String, int)>
			((RemoteViews) (charsequence)).setOnClickPendingIntent(android.support.v7.appcompat.R.id.cancel_action, pendingintent);
	//   63  133:aload_1         
	//   64  134:getstatic       #449 <Field int android.support.v7.appcompat.R$id.cancel_action>
	//   65  137:aload           14
	//   66  139:invokevirtual   #394 <Method void RemoteViews.setOnClickPendingIntent(int, PendingIntent)>
			return ((RemoteViews) (charsequence));
	//   67  142:aload_1         
	//   68  143:areturn         
		} else
		{
			((RemoteViews) (charsequence)).setViewVisibility(android.support.v7.appcompat.R.id.cancel_action, 8);
	//   69  144:aload_1         
	//   70  145:getstatic       #449 <Field int android.support.v7.appcompat.R$id.cancel_action>
	//   71  148:bipush          8
	//   72  150:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
			return ((RemoteViews) (charsequence));
	//   73  153:aload_1         
	//   74  154:areturn         
		}
	}

	private static int getActionLayoutResource()
	{
		return android.support.v7.appcompat.R.layout.notification_action;
	//    0    0:getstatic       #484 <Field int android.support.v7.appcompat.R$layout.notification_action>
	//    1    3:ireturn         
	}

	private static int getActionTombstoneLayoutResource()
	{
		return android.support.v7.appcompat.R.layout.notification_action_tombstone;
	//    0    0:getstatic       #487 <Field int android.support.v7.appcompat.R$layout.notification_action_tombstone>
	//    1    3:ireturn         
	}

	private static int getBigMediaLayoutResource(boolean flag, int i)
	{
		if(i <= 3)
	//*   0    0:iload_1         
	//*   1    1:iconst_3        
	//*   2    2:icmpgt          17
			if(flag)
	//*   3    5:iload_0         
	//*   4    6:ifeq            13
				return android.support.v7.appcompat.R.layout.notification_template_big_media_narrow_custom;
	//    5    9:getstatic       #490 <Field int android.support.v7.appcompat.R$layout.notification_template_big_media_narrow_custom>
	//    6   12:ireturn         
			else
				return android.support.v7.appcompat.R.layout.notification_template_big_media_narrow;
	//    7   13:getstatic       #493 <Field int android.support.v7.appcompat.R$layout.notification_template_big_media_narrow>
	//    8   16:ireturn         
		if(flag)
	//*   9   17:iload_0         
	//*  10   18:ifeq            25
			return android.support.v7.appcompat.R.layout.notification_template_big_media_custom;
	//   11   21:getstatic       #496 <Field int android.support.v7.appcompat.R$layout.notification_template_big_media_custom>
	//   12   24:ireturn         
		else
			return android.support.v7.appcompat.R.layout.notification_template_big_media;
	//   13   25:getstatic       #499 <Field int android.support.v7.appcompat.R$layout.notification_template_big_media>
	//   14   28:ireturn         
	}

	private static void hideNormalContent(RemoteViews remoteviews)
	{
		remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.title, 8);
	//    0    0:aload_0         
	//    1    1:getstatic       #113 <Field int android.support.v7.appcompat.R$id.title>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
		remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.text2, 8);
	//    4    9:aload_0         
	//    5   10:getstatic       #153 <Field int android.support.v7.appcompat.R$id.text2>
	//    6   13:bipush          8
	//    7   15:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
		remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.text, 8);
	//    8   18:aload_0         
	//    9   19:getstatic       #120 <Field int android.support.v7.appcompat.R$id.text>
	//   10   22:bipush          8
	//   11   24:invokevirtual   #72  <Method void RemoteViews.setViewVisibility(int, int)>
	//   12   27:return          
	}

	public static RemoteViews overrideContentViewMedia(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, Context context, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, int i, Bitmap bitmap, CharSequence charsequence3, 
			boolean flag, long l, int j, List list, int ai[], boolean flag1, 
			PendingIntent pendingintent, boolean flag2)
	{
		context = ((Context) (generateContentViewMedia(context, charsequence, charsequence1, charsequence2, i, bitmap, charsequence3, flag, l, j, list, ai, flag1, pendingintent, flag2)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:iload           5
	//    5    7:aload           6
	//    6    9:aload           7
	//    7   11:iload           8
	//    8   13:lload           9
	//    9   15:iload           11
	//   10   17:aload           12
	//   11   19:aload           13
	//   12   21:iload           14
	//   13   23:aload           15
	//   14   25:iload           16
	//   15   27:invokestatic    #503 <Method RemoteViews generateContentViewMedia(Context, CharSequence, CharSequence, CharSequence, int, Bitmap, CharSequence, boolean, long, int, List, int[], boolean, PendingIntent, boolean)>
	//   16   30:astore_1        
		notificationbuilderwithbuilderaccessor.getBuilder().setContent(((RemoteViews) (context)));
	//   17   31:aload_0         
	//   18   32:invokeinterface #509 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//   19   37:aload_1         
	//   20   38:invokevirtual   #515 <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
	//   21   41:pop             
		if(flag1)
	//*  22   42:iload           14
	//*  23   44:ifeq            58
			notificationbuilderwithbuilderaccessor.getBuilder().setOngoing(true);
	//   24   47:aload_0         
	//   25   48:invokeinterface #509 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//   26   53:iconst_1        
	//   27   54:invokevirtual   #519 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//   28   57:pop             
		return ((RemoteViews) (context));
	//   29   58:aload_1         
	//   30   59:areturn         
	}

	public static void overrideMediaBigContentView(Notification notification, Context context, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, int i, Bitmap bitmap, CharSequence charsequence3, 
			boolean flag, long l, int j, int k, List list, boolean flag1, 
			PendingIntent pendingintent, boolean flag2)
	{
		notification.bigContentView = generateMediaBigView(context, charsequence, charsequence1, charsequence2, i, bitmap, charsequence3, flag, l, j, k, list, flag1, pendingintent, flag2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:iload           8
	//    9   14:lload           9
	//   10   16:iload           11
	//   11   18:iload           12
	//   12   20:aload           13
	//   13   22:iload           14
	//   14   24:aload           15
	//   15   26:iload           16
	//   16   28:invokestatic    #525 <Method RemoteViews generateMediaBigView(Context, CharSequence, CharSequence, CharSequence, int, Bitmap, CharSequence, boolean, long, int, int, List, boolean, PendingIntent, boolean)>
	//   17   31:putfield        #531 <Field RemoteViews Notification.bigContentView>
		if(flag1)
	//*  18   34:iload           14
	//*  19   36:ifeq            49
			notification.flags = notification.flags | 2;
	//   20   39:aload_0         
	//   21   40:aload_0         
	//   22   41:getfield        #534 <Field int Notification.flags>
	//   23   44:iconst_2        
	//   24   45:ior             
	//   25   46:putfield        #534 <Field int Notification.flags>
	//   26   49:return          
	}

	private static final int MAX_ACTION_BUTTONS = 3;
	static final int MAX_MEDIA_BUTTONS = 5;
	static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;
}
