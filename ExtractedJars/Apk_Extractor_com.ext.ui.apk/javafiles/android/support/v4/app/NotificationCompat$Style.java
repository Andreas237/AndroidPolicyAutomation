// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.RemoteViews;
import java.text.NumberFormat;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, NotificationBuilderWithBuilderAccessor

public static abstract class NotificationCompat$Style
{

	private int calculateTopPadding()
	{
		Resources resources = mBuilder.mContext.getResources();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//    2    4:getfield        #35  <Field Context NotificationCompat$Builder.mContext>
	//    3    7:invokevirtual   #41  <Method Resources Context.getResources()>
	//    4   10:astore          5
		int i = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_top_pad);
	//    5   12:aload           5
	//    6   14:getstatic       #47  <Field int android.support.compat.R$dimen.notification_top_pad>
	//    7   17:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//    8   20:istore_3        
		int j = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_top_pad_large_text);
	//    9   21:aload           5
	//   10   23:getstatic       #56  <Field int android.support.compat.R$dimen.notification_top_pad_large_text>
	//   11   26:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//   12   29:istore          4
		float f = (constrain(resources.getConfiguration().fontScale, 1.0F, 1.3F) - 1.0F) / 0.3F;
	//   13   31:aload           5
	//   14   33:invokevirtual   #60  <Method Configuration Resources.getConfiguration()>
	//   15   36:getfield        #66  <Field float Configuration.fontScale>
	//   16   39:fconst_1        
	//   17   40:ldc1            #67  <Float 1.3F>
	//   18   42:invokestatic    #71  <Method float constrain(float, float, float)>
	//   19   45:fconst_1        
	//   20   46:fsub            
	//   21   47:ldc1            #72  <Float 0.3F>
	//   22   49:fdiv            
	//   23   50:fstore_1        
		float f1 = i;
	//   24   51:iload_3         
	//   25   52:i2f             
	//   26   53:fstore_2        
		return Math.round(f * (float)j + f1 * (1.0F - f));
	//   27   54:fload_1         
	//   28   55:iload           4
	//   29   57:i2f             
	//   30   58:fmul            
	//   31   59:fload_2         
	//   32   60:fconst_1        
	//   33   61:fload_1         
	//   34   62:fsub            
	//   35   63:fmul            
	//   36   64:fadd            
	//   37   65:invokestatic    #78  <Method int Math.round(float)>
	//   38   68:ireturn         
	}

	private static float constrain(float f, float f1, float f2)
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

	private Bitmap createColoredBitmap(int i, int j, int k)
	{
		Drawable drawable = mBuilder.mContext.getResources().getDrawable(i);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//    2    4:getfield        #35  <Field Context NotificationCompat$Builder.mContext>
	//    3    7:invokevirtual   #41  <Method Resources Context.getResources()>
	//    4   10:iload_1         
	//    5   11:invokevirtual   #84  <Method Drawable Resources.getDrawable(int)>
	//    6   14:astore          5
		int l;
		Bitmap bitmap;
		if(k == 0)
	//*   7   16:iload_3         
	//*   8   17:ifne            101
			i = drawable.getIntrinsicWidth();
	//    9   20:aload           5
	//   10   22:invokevirtual   #89  <Method int Drawable.getIntrinsicWidth()>
	//   11   25:istore_1        
		else
	//*  12   26:iload_3         
	//*  13   27:istore          4
	//*  14   29:iload_3         
	//*  15   30:ifne            40
	//*  16   33:aload           5
	//*  17   35:invokevirtual   #92  <Method int Drawable.getIntrinsicHeight()>
	//*  18   38:istore          4
	//*  19   40:iload_1         
	//*  20   41:iload           4
	//*  21   43:getstatic       #98  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//*  22   46:invokestatic    #104 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//*  23   49:astore          6
	//*  24   51:aload           5
	//*  25   53:iconst_0        
	//*  26   54:iconst_0        
	//*  27   55:iload_1         
	//*  28   56:iload           4
	//*  29   58:invokevirtual   #108 <Method void Drawable.setBounds(int, int, int, int)>
	//*  30   61:iload_2         
	//*  31   62:ifeq            84
	//*  32   65:aload           5
	//*  33   67:invokevirtual   #112 <Method Drawable Drawable.mutate()>
	//*  34   70:new             #114 <Class PorterDuffColorFilter>
	//*  35   73:dup             
	//*  36   74:iload_2         
	//*  37   75:getstatic       #120 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//*  38   78:invokespecial   #123 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//*  39   81:invokevirtual   #127 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
	//*  40   84:aload           5
	//*  41   86:new             #129 <Class Canvas>
	//*  42   89:dup             
	//*  43   90:aload           6
	//*  44   92:invokespecial   #132 <Method void Canvas(Bitmap)>
	//*  45   95:invokevirtual   #136 <Method void Drawable.draw(Canvas)>
	//*  46   98:aload           6
	//*  47  100:areturn         
			i = k;
	//   48  101:iload_3         
	//   49  102:istore_1        
		l = k;
		if(k == 0)
			l = drawable.getIntrinsicHeight();
		bitmap = Bitmap.createBitmap(i, l, android.graphics.Bitmap.Config.ARGB_8888);
		drawable.setBounds(0, 0, i, l);
		if(j != 0)
			drawable.mutate().setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(j, android.graphics.PorterDuff.Mode.SRC_IN))));
		drawable.draw(new Canvas(bitmap));
		return bitmap;
	//*  50  103:goto            26
	}

	private Bitmap createIconWithBackground(int i, int j, int k, int l)
	{
		int j1 = android.support.compat.R.drawable.notification_icon_background;
	//    0    0:getstatic       #143 <Field int android.support.compat.R$drawable.notification_icon_background>
	//    1    3:istore          6
		int i1 = l;
	//    2    5:iload           4
	//    3    7:istore          5
		if(l == 0)
	//*   4    9:iload           4
	//*   5   11:ifne            17
			i1 = 0;
	//    6   14:iconst_0        
	//    7   15:istore          5
		Bitmap bitmap = createColoredBitmap(j1, i1, j);
	//    8   17:aload_0         
	//    9   18:iload           6
	//   10   20:iload           5
	//   11   22:iload_2         
	//   12   23:invokespecial   #145 <Method Bitmap createColoredBitmap(int, int, int)>
	//   13   26:astore          7
		Canvas canvas = new Canvas(bitmap);
	//   14   28:new             #129 <Class Canvas>
	//   15   31:dup             
	//   16   32:aload           7
	//   17   34:invokespecial   #132 <Method void Canvas(Bitmap)>
	//   18   37:astore          8
		Drawable drawable = mBuilder.mContext.getResources().getDrawable(i).mutate();
	//   19   39:aload_0         
	//   20   40:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//   21   43:getfield        #35  <Field Context NotificationCompat$Builder.mContext>
	//   22   46:invokevirtual   #41  <Method Resources Context.getResources()>
	//   23   49:iload_1         
	//   24   50:invokevirtual   #84  <Method Drawable Resources.getDrawable(int)>
	//   25   53:invokevirtual   #112 <Method Drawable Drawable.mutate()>
	//   26   56:astore          9
		drawable.setFilterBitmap(true);
	//   27   58:aload           9
	//   28   60:iconst_1        
	//   29   61:invokevirtual   #149 <Method void Drawable.setFilterBitmap(boolean)>
		i = (j - k) / 2;
	//   30   64:iload_2         
	//   31   65:iload_3         
	//   32   66:isub            
	//   33   67:iconst_2        
	//   34   68:idiv            
	//   35   69:istore_1        
		drawable.setBounds(i, i, k + i, k + i);
	//   36   70:aload           9
	//   37   72:iload_1         
	//   38   73:iload_1         
	//   39   74:iload_3         
	//   40   75:iload_1         
	//   41   76:iadd            
	//   42   77:iload_3         
	//   43   78:iload_1         
	//   44   79:iadd            
	//   45   80:invokevirtual   #108 <Method void Drawable.setBounds(int, int, int, int)>
		drawable.setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP))));
	//   46   83:aload           9
	//   47   85:new             #114 <Class PorterDuffColorFilter>
	//   48   88:dup             
	//   49   89:iconst_m1       
	//   50   90:getstatic       #152 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_ATOP>
	//   51   93:invokespecial   #123 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   52   96:invokevirtual   #127 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
		drawable.draw(canvas);
	//   53   99:aload           9
	//   54  101:aload           8
	//   55  103:invokevirtual   #136 <Method void Drawable.draw(Canvas)>
		return bitmap;
	//   56  106:aload           7
	//   57  108:areturn         
	}

	private void hideNormalContent(RemoteViews remoteviews)
	{
		remoteviews.setViewVisibility(android.support.compat.R.id.title, 8);
	//    0    0:aload_1         
	//    1    1:getstatic       #159 <Field int android.support.compat.R$id.title>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
		remoteviews.setViewVisibility(android.support.compat.R.id.text2, 8);
	//    4    9:aload_1         
	//    5   10:getstatic       #168 <Field int android.support.compat.R$id.text2>
	//    6   13:bipush          8
	//    7   15:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
		remoteviews.setViewVisibility(android.support.compat.R.id.text, 8);
	//    8   18:aload_1         
	//    9   19:getstatic       #171 <Field int android.support.compat.R$id.text>
	//   10   22:bipush          8
	//   11   24:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//   12   27:return          
	}

	public void addCompatExtras(Bundle bundle)
	{
	//    0    0:return          
	}

	public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
	//    0    0:return          
	}

	public RemoteViews applyStandardTemplate(boolean flag, int i, boolean flag1)
	{
		Resources resources = mBuilder.mContext.getResources();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//    2    4:getfield        #35  <Field Context NotificationCompat$Builder.mContext>
	//    3    7:invokevirtual   #41  <Method Resources Context.getResources()>
	//    4   10:astore          7
		RemoteViews remoteviews = new RemoteViews(mBuilder.mContext.getPackageName(), i);
	//    5   12:new             #161 <Class RemoteViews>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//    9   20:getfield        #35  <Field Context NotificationCompat$Builder.mContext>
	//   10   23:invokevirtual   #182 <Method String Context.getPackageName()>
	//   11   26:iload_2         
	//   12   27:invokespecial   #185 <Method void RemoteViews(String, int)>
	//   13   30:astore          8
		int j;
		int k;
		if(mBuilder.getPriority() < -1)
	//*  14   32:aload_0         
	//*  15   33:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*  16   36:invokevirtual   #188 <Method int NotificationCompat$Builder.getPriority()>
	//*  17   39:iconst_m1       
	//*  18   40:icmpge          580
			i = 1;
	//   19   43:iconst_1        
	//   20   44:istore_2        
		else
	//*  21   45:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  22   48:bipush          16
	//*  23   50:icmplt          91
	//*  24   53:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  25   56:bipush          21
	//*  26   58:icmpge          91
	//*  27   61:iload_2         
	//*  28   62:ifeq            585
	//*  29   65:aload           8
	//*  30   67:getstatic       #196 <Field int android.support.compat.R$id.notification_background>
	//*  31   70:ldc1            #198 <String "setBackgroundResource">
	//*  32   72:getstatic       #201 <Field int android.support.compat.R$drawable.notification_bg_low>
	//*  33   75:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
	//*  34   78:aload           8
	//*  35   80:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//*  36   83:ldc1            #198 <String "setBackgroundResource">
	//*  37   85:getstatic       #211 <Field int android.support.compat.R$drawable.notification_template_icon_low_bg>
	//*  38   88:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
	//*  39   91:aload_0         
	//*  40   92:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*  41   95:getfield        #215 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
	//*  42   98:ifnull          653
	//*  43  101:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  44  104:bipush          16
	//*  45  106:icmplt          614
	//*  46  109:aload           8
	//*  47  111:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//*  48  114:iconst_0        
	//*  49  115:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//*  50  118:aload           8
	//*  51  120:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//*  52  123:aload_0         
	//*  53  124:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*  54  127:getfield        #215 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
	//*  55  130:invokevirtual   #219 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
	//*  56  133:iload_1         
	//*  57  134:ifeq            226
	//*  58  137:aload_0         
	//*  59  138:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*  60  141:getfield        #223 <Field Notification NotificationCompat$Builder.mNotification>
	//*  61  144:getfield        #226 <Field int Notification.icon>
	//*  62  147:ifeq            226
	//*  63  150:aload           7
	//*  64  152:getstatic       #229 <Field int android.support.compat.R$dimen.notification_right_icon_size>
	//*  65  155:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//*  66  158:istore_2        
	//*  67  159:aload           7
	//*  68  161:getstatic       #232 <Field int android.support.compat.R$dimen.notification_small_icon_background_padding>
	//*  69  164:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//*  70  167:istore          5
	//*  71  169:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  72  172:bipush          21
	//*  73  174:icmplt          627
	//*  74  177:aload_0         
	//*  75  178:aload_0         
	//*  76  179:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*  77  182:getfield        #223 <Field Notification NotificationCompat$Builder.mNotification>
	//*  78  185:getfield        #226 <Field int Notification.icon>
	//*  79  188:iload_2         
	//*  80  189:iload_2         
	//*  81  190:iload           5
	//*  82  192:iconst_2        
	//*  83  193:imul            
	//*  84  194:isub            
	//*  85  195:aload_0         
	//*  86  196:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*  87  199:invokevirtual   #235 <Method int NotificationCompat$Builder.getColor()>
	//*  88  202:invokespecial   #237 <Method Bitmap createIconWithBackground(int, int, int, int)>
	//*  89  205:astore          9
	//*  90  207:aload           8
	//*  91  209:getstatic       #240 <Field int android.support.compat.R$id.right_icon>
	//*  92  212:aload           9
	//*  93  214:invokevirtual   #219 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
	//*  94  217:aload           8
	//*  95  219:getstatic       #240 <Field int android.support.compat.R$id.right_icon>
	//*  96  222:iconst_0        
	//*  97  223:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//*  98  226:aload_0         
	//*  99  227:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 100  230:getfield        #243 <Field CharSequence NotificationCompat$Builder.mContentTitle>
	//* 101  233:ifnull          251
	//* 102  236:aload           8
	//* 103  238:getstatic       #159 <Field int android.support.compat.R$id.title>
	//* 104  241:aload_0         
	//* 105  242:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 106  245:getfield        #243 <Field CharSequence NotificationCompat$Builder.mContentTitle>
	//* 107  248:invokevirtual   #247 <Method void RemoteViews.setTextViewText(int, CharSequence)>
	//* 108  251:aload_0         
	//* 109  252:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 110  255:getfield        #250 <Field CharSequence NotificationCompat$Builder.mContentText>
	//* 111  258:ifnull          963
	//* 112  261:aload           8
	//* 113  263:getstatic       #171 <Field int android.support.compat.R$id.text>
	//* 114  266:aload_0         
	//* 115  267:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 116  270:getfield        #250 <Field CharSequence NotificationCompat$Builder.mContentText>
	//* 117  273:invokevirtual   #247 <Method void RemoteViews.setTextViewText(int, CharSequence)>
	//* 118  276:iconst_1        
	//* 119  277:istore_2        
	//* 120  278:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 121  281:bipush          21
	//* 122  283:icmpge          784
	//* 123  286:aload_0         
	//* 124  287:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 125  290:getfield        #215 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
	//* 126  293:ifnull          784
	//* 127  296:iconst_1        
	//* 128  297:istore          5
	//* 129  299:aload_0         
	//* 130  300:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 131  303:getfield        #253 <Field CharSequence NotificationCompat$Builder.mContentInfo>
	//* 132  306:ifnull          790
	//* 133  309:aload           8
	//* 134  311:getstatic       #256 <Field int android.support.compat.R$id.info>
	//* 135  314:aload_0         
	//* 136  315:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 137  318:getfield        #253 <Field CharSequence NotificationCompat$Builder.mContentInfo>
	//* 138  321:invokevirtual   #247 <Method void RemoteViews.setTextViewText(int, CharSequence)>
	//* 139  324:aload           8
	//* 140  326:getstatic       #256 <Field int android.support.compat.R$id.info>
	//* 141  329:iconst_0        
	//* 142  330:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//* 143  333:iconst_1        
	//* 144  334:istore_2        
	//* 145  335:iconst_1        
	//* 146  336:istore          5
	//* 147  338:aload_0         
	//* 148  339:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 149  342:getfield        #259 <Field CharSequence NotificationCompat$Builder.mSubText>
	//* 150  345:ifnull          915
	//* 151  348:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 152  351:bipush          16
	//* 153  353:icmplt          915
	//* 154  356:aload           8
	//* 155  358:getstatic       #171 <Field int android.support.compat.R$id.text>
	//* 156  361:aload_0         
	//* 157  362:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 158  365:getfield        #259 <Field CharSequence NotificationCompat$Builder.mSubText>
	//* 159  368:invokevirtual   #247 <Method void RemoteViews.setTextViewText(int, CharSequence)>
	//* 160  371:aload_0         
	//* 161  372:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 162  375:getfield        #250 <Field CharSequence NotificationCompat$Builder.mContentText>
	//* 163  378:ifnull          905
	//* 164  381:aload           8
	//* 165  383:getstatic       #168 <Field int android.support.compat.R$id.text2>
	//* 166  386:aload_0         
	//* 167  387:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 168  390:getfield        #250 <Field CharSequence NotificationCompat$Builder.mContentText>
	//* 169  393:invokevirtual   #247 <Method void RemoteViews.setTextViewText(int, CharSequence)>
	//* 170  396:aload           8
	//* 171  398:getstatic       #168 <Field int android.support.compat.R$id.text2>
	//* 172  401:iconst_0        
	//* 173  402:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//* 174  405:iconst_1        
	//* 175  406:istore          6
	//* 176  408:iload           6
	//* 177  410:ifeq            459
	//* 178  413:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 179  416:bipush          16
	//* 180  418:icmplt          459
	//* 181  421:iload_3         
	//* 182  422:ifeq            447
	//* 183  425:aload           7
	//* 184  427:getstatic       #262 <Field int android.support.compat.R$dimen.notification_subtext_size>
	//* 185  430:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//* 186  433:i2f             
	//* 187  434:fstore          4
	//* 188  436:aload           8
	//* 189  438:getstatic       #171 <Field int android.support.compat.R$id.text>
	//* 190  441:iconst_0        
	//* 191  442:fload           4
	//* 192  444:invokevirtual   #266 <Method void RemoteViews.setTextViewTextSize(int, int, float)>
	//* 193  447:aload           8
	//* 194  449:getstatic       #269 <Field int android.support.compat.R$id.line1>
	//* 195  452:iconst_0        
	//* 196  453:iconst_0        
	//* 197  454:iconst_0        
	//* 198  455:iconst_0        
	//* 199  456:invokevirtual   #273 <Method void RemoteViews.setViewPadding(int, int, int, int, int)>
	//* 200  459:aload_0         
	//* 201  460:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 202  463:invokevirtual   #277 <Method long NotificationCompat$Builder.getWhenIfShowing()>
	//* 203  466:lconst_0        
	//* 204  467:lcmp            
	//* 205  468:ifeq            538
	//* 206  471:aload_0         
	//* 207  472:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 208  475:getfield        #280 <Field boolean NotificationCompat$Builder.mUseChronometer>
	//* 209  478:ifeq            921
	//* 210  481:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 211  484:bipush          16
	//* 212  486:icmplt          921
	//* 213  489:aload           8
	//* 214  491:getstatic       #283 <Field int android.support.compat.R$id.chronometer>
	//* 215  494:iconst_0        
	//* 216  495:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//* 217  498:aload           8
	//* 218  500:getstatic       #283 <Field int android.support.compat.R$id.chronometer>
	//* 219  503:ldc2            #285 <String "setBase">
	//* 220  506:aload_0         
	//* 221  507:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 222  510:invokevirtual   #277 <Method long NotificationCompat$Builder.getWhenIfShowing()>
	//* 223  513:invokestatic    #290 <Method long SystemClock.elapsedRealtime()>
	//* 224  516:invokestatic    #295 <Method long System.currentTimeMillis()>
	//* 225  519:lsub            
	//* 226  520:ladd            
	//* 227  521:invokevirtual   #299 <Method void RemoteViews.setLong(int, String, long)>
	//* 228  524:aload           8
	//* 229  526:getstatic       #283 <Field int android.support.compat.R$id.chronometer>
	//* 230  529:ldc2            #301 <String "setStarted">
	//* 231  532:iconst_1        
	//* 232  533:invokevirtual   #305 <Method void RemoteViews.setBoolean(int, String, boolean)>
	//* 233  536:iconst_1        
	//* 234  537:istore_2        
	//* 235  538:getstatic       #308 <Field int android.support.compat.R$id.right_side>
	//* 236  541:istore          6
	//* 237  543:iload_2         
	//* 238  544:ifeq            951
	//* 239  547:iconst_0        
	//* 240  548:istore_2        
	//* 241  549:aload           8
	//* 242  551:iload           6
	//* 243  553:iload_2         
	//* 244  554:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//* 245  557:getstatic       #311 <Field int android.support.compat.R$id.line3>
	//* 246  560:istore          6
	//* 247  562:iload           5
	//* 248  564:ifeq            957
	//* 249  567:iconst_0        
	//* 250  568:istore_2        
	//* 251  569:aload           8
	//* 252  571:iload           6
	//* 253  573:iload_2         
	//* 254  574:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//* 255  577:aload           8
	//* 256  579:areturn         
			i = 0;
	//  257  580:iconst_0        
	//  258  581:istore_2        
		if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT < 21)
			if(i != 0)
			{
				remoteviews.setInt(android.support.compat.R.id.notification_background, "setBackgroundResource", android.support.compat.R.drawable.notification_bg_low);
				remoteviews.setInt(android.support.compat.R.id.icon, "setBackgroundResource", android.support.compat.R.drawable.notification_template_icon_low_bg);
			} else
	//* 259  582:goto            45
			{
				remoteviews.setInt(android.support.compat.R.id.notification_background, "setBackgroundResource", android.support.compat.R.drawable.notification_bg);
	//  260  585:aload           8
	//  261  587:getstatic       #196 <Field int android.support.compat.R$id.notification_background>
	//  262  590:ldc1            #198 <String "setBackgroundResource">
	//  263  592:getstatic       #314 <Field int android.support.compat.R$drawable.notification_bg>
	//  264  595:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
				remoteviews.setInt(android.support.compat.R.id.icon, "setBackgroundResource", android.support.compat.R.drawable.notification_template_icon_bg);
	//  265  598:aload           8
	//  266  600:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//  267  603:ldc1            #198 <String "setBackgroundResource">
	//  268  605:getstatic       #317 <Field int android.support.compat.R$drawable.notification_template_icon_bg>
	//  269  608:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
			}
		if(mBuilder.mLargeIcon != null)
		{
			if(android.os.Build.VERSION.SDK_INT >= 16)
			{
				remoteviews.setViewVisibility(android.support.compat.R.id.icon, 0);
				remoteviews.setImageViewBitmap(android.support.compat.R.id.icon, mBuilder.mLargeIcon);
			} else
	//* 270  611:goto            91
			{
				remoteviews.setViewVisibility(android.support.compat.R.id.icon, 8);
	//  271  614:aload           8
	//  272  616:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//  273  619:bipush          8
	//  274  621:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
			}
			if(flag && mBuilder.mNotification.icon != 0)
			{
				i = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_right_icon_size);
				j = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_small_icon_background_padding);
				float f;
				if(android.os.Build.VERSION.SDK_INT >= 21)
				{
					Bitmap bitmap = createIconWithBackground(mBuilder.mNotification.icon, i, i - j * 2, mBuilder.getColor());
					remoteviews.setImageViewBitmap(android.support.compat.R.id.right_icon, bitmap);
				} else
	//* 275  624:goto            133
				{
					remoteviews.setImageViewBitmap(android.support.compat.R.id.right_icon, createColoredBitmap(mBuilder.mNotification.icon, -1));
	//  276  627:aload           8
	//  277  629:getstatic       #240 <Field int android.support.compat.R$id.right_icon>
	//  278  632:aload_0         
	//  279  633:aload_0         
	//  280  634:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  281  637:getfield        #223 <Field Notification NotificationCompat$Builder.mNotification>
	//  282  640:getfield        #226 <Field int Notification.icon>
	//  283  643:iconst_m1       
	//  284  644:invokevirtual   #320 <Method Bitmap createColoredBitmap(int, int)>
	//  285  647:invokevirtual   #219 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
				}
				remoteviews.setViewVisibility(android.support.compat.R.id.right_icon, 0);
			}
		} else
	//* 286  650:goto            217
		if(flag && mBuilder.mNotification.icon != 0)
	//* 287  653:iload_1         
	//* 288  654:ifeq            226
	//* 289  657:aload_0         
	//* 290  658:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 291  661:getfield        #223 <Field Notification NotificationCompat$Builder.mNotification>
	//* 292  664:getfield        #226 <Field int Notification.icon>
	//* 293  667:ifeq            226
		{
			remoteviews.setViewVisibility(android.support.compat.R.id.icon, 0);
	//  294  670:aload           8
	//  295  672:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//  296  675:iconst_0        
	//  297  676:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 298  679:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 299  682:bipush          21
	//* 300  684:icmplt          758
			{
				i = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_large_icon_width);
	//  301  687:aload           7
	//  302  689:getstatic       #323 <Field int android.support.compat.R$dimen.notification_large_icon_width>
	//  303  692:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//  304  695:istore_2        
				j = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_big_circle_margin);
	//  305  696:aload           7
	//  306  698:getstatic       #326 <Field int android.support.compat.R$dimen.notification_big_circle_margin>
	//  307  701:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//  308  704:istore          5
				k = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_small_icon_size_as_large);
	//  309  706:aload           7
	//  310  708:getstatic       #329 <Field int android.support.compat.R$dimen.notification_small_icon_size_as_large>
	//  311  711:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//  312  714:istore          6
				Bitmap bitmap1 = createIconWithBackground(mBuilder.mNotification.icon, i - j, k, mBuilder.getColor());
	//  313  716:aload_0         
	//  314  717:aload_0         
	//  315  718:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  316  721:getfield        #223 <Field Notification NotificationCompat$Builder.mNotification>
	//  317  724:getfield        #226 <Field int Notification.icon>
	//  318  727:iload_2         
	//  319  728:iload           5
	//  320  730:isub            
	//  321  731:iload           6
	//  322  733:aload_0         
	//  323  734:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  324  737:invokevirtual   #235 <Method int NotificationCompat$Builder.getColor()>
	//  325  740:invokespecial   #237 <Method Bitmap createIconWithBackground(int, int, int, int)>
	//  326  743:astore          9
				remoteviews.setImageViewBitmap(android.support.compat.R.id.icon, bitmap1);
	//  327  745:aload           8
	//  328  747:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//  329  750:aload           9
	//  330  752:invokevirtual   #219 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
			} else
	//* 331  755:goto            226
			{
				remoteviews.setImageViewBitmap(android.support.compat.R.id.icon, createColoredBitmap(mBuilder.mNotification.icon, -1));
	//  332  758:aload           8
	//  333  760:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//  334  763:aload_0         
	//  335  764:aload_0         
	//  336  765:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  337  768:getfield        #223 <Field Notification NotificationCompat$Builder.mNotification>
	//  338  771:getfield        #226 <Field int Notification.icon>
	//  339  774:iconst_m1       
	//  340  775:invokevirtual   #320 <Method Bitmap createColoredBitmap(int, int)>
	//  341  778:invokevirtual   #219 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
			}
		}
		if(mBuilder.mContentTitle != null)
			remoteviews.setTextViewText(android.support.compat.R.id.title, mBuilder.mContentTitle);
		if(mBuilder.mContentText != null)
		{
			remoteviews.setTextViewText(android.support.compat.R.id.text, mBuilder.mContentText);
			i = 1;
		} else
	//* 342  781:goto            226
	//* 343  784:iconst_0        
	//* 344  785:istore          5
	//* 345  787:goto            299
	//* 346  790:aload_0         
	//* 347  791:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 348  794:getfield        #332 <Field int NotificationCompat$Builder.mNumber>
	//* 349  797:ifle            882
	//* 350  800:aload           7
	//* 351  802:getstatic       #337 <Field int android.support.compat.R$integer.status_bar_notification_info_maxnum>
	//* 352  805:invokevirtual   #340 <Method int Resources.getInteger(int)>
	//* 353  808:istore_2        
	//* 354  809:aload_0         
	//* 355  810:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 356  813:getfield        #332 <Field int NotificationCompat$Builder.mNumber>
	//* 357  816:iload_2         
	//* 358  817:icmple          853
	//* 359  820:aload           8
	//* 360  822:getstatic       #256 <Field int android.support.compat.R$id.info>
	//* 361  825:aload           7
	//* 362  827:getstatic       #345 <Field int android.support.compat.R$string.status_bar_notification_info_overflow>
	//* 363  830:invokevirtual   #349 <Method String Resources.getString(int)>
	//* 364  833:invokevirtual   #247 <Method void RemoteViews.setTextViewText(int, CharSequence)>
	//* 365  836:aload           8
	//* 366  838:getstatic       #256 <Field int android.support.compat.R$id.info>
	//* 367  841:iconst_0        
	//* 368  842:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//* 369  845:iconst_1        
	//* 370  846:istore_2        
	//* 371  847:iconst_1        
	//* 372  848:istore          5
	//* 373  850:goto            338
	//* 374  853:invokestatic    #355 <Method NumberFormat NumberFormat.getIntegerInstance()>
	//* 375  856:astore          9
	//* 376  858:aload           8
	//* 377  860:getstatic       #256 <Field int android.support.compat.R$id.info>
	//* 378  863:aload           9
	//* 379  865:aload_0         
	//* 380  866:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 381  869:getfield        #332 <Field int NotificationCompat$Builder.mNumber>
	//* 382  872:i2l             
	//* 383  873:invokevirtual   #359 <Method String NumberFormat.format(long)>
	//* 384  876:invokevirtual   #247 <Method void RemoteViews.setTextViewText(int, CharSequence)>
	//* 385  879:goto            836
	//* 386  882:aload           8
	//* 387  884:getstatic       #256 <Field int android.support.compat.R$id.info>
	//* 388  887:bipush          8
	//* 389  889:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//* 390  892:iload_2         
	//* 391  893:istore          6
	//* 392  895:iload           5
	//* 393  897:istore_2        
	//* 394  898:iload           6
	//* 395  900:istore          5
	//* 396  902:goto            338
	//* 397  905:aload           8
	//* 398  907:getstatic       #168 <Field int android.support.compat.R$id.text2>
	//* 399  910:bipush          8
	//* 400  912:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//* 401  915:iconst_0        
	//* 402  916:istore          6
	//* 403  918:goto            408
	//* 404  921:aload           8
	//* 405  923:getstatic       #362 <Field int android.support.compat.R$id.time>
	//* 406  926:iconst_0        
	//* 407  927:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//* 408  930:aload           8
	//* 409  932:getstatic       #362 <Field int android.support.compat.R$id.time>
	//* 410  935:ldc2            #364 <String "setTime">
	//* 411  938:aload_0         
	//* 412  939:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 413  942:invokevirtual   #277 <Method long NotificationCompat$Builder.getWhenIfShowing()>
	//* 414  945:invokevirtual   #299 <Method void RemoteViews.setLong(int, String, long)>
	//* 415  948:goto            536
	//* 416  951:bipush          8
	//* 417  953:istore_2        
	//* 418  954:goto            549
	//* 419  957:bipush          8
	//* 420  959:istore_2        
	//* 421  960:goto            569
		{
			i = 0;
	//  422  963:iconst_0        
	//  423  964:istore_2        
		}
		if(android.os.Build.VERSION.SDK_INT < 21 && mBuilder.mLargeIcon != null)
			j = 1;
		else
			j = 0;
		if(mBuilder.mContentInfo != null)
		{
			remoteviews.setTextViewText(android.support.compat.R.id.info, mBuilder.mContentInfo);
			remoteviews.setViewVisibility(android.support.compat.R.id.info, 0);
			i = 1;
			j = 1;
		} else
		if(mBuilder.mNumber > 0)
		{
			i = resources.getInteger(android.support.compat.R.integer.status_bar_notification_info_maxnum);
			if(mBuilder.mNumber > i)
			{
				remoteviews.setTextViewText(android.support.compat.R.id.info, ((CharSequence) (resources.getString(android.support.compat.R.string.status_bar_notification_info_overflow))));
			} else
			{
				NumberFormat numberformat = NumberFormat.getIntegerInstance();
				remoteviews.setTextViewText(android.support.compat.R.id.info, ((CharSequence) (numberformat.format(mBuilder.mNumber))));
			}
			remoteviews.setViewVisibility(android.support.compat.R.id.info, 0);
			i = 1;
			j = 1;
		} else
		{
			remoteviews.setViewVisibility(android.support.compat.R.id.info, 8);
			k = i;
			i = j;
			j = k;
		}
		if(mBuilder.mSubText == null || android.os.Build.VERSION.SDK_INT < 16)
			break MISSING_BLOCK_LABEL_915;
		remoteviews.setTextViewText(android.support.compat.R.id.text, mBuilder.mSubText);
		if(mBuilder.mContentText == null) goto _L2; else goto _L1
_L1:
		remoteviews.setTextViewText(android.support.compat.R.id.text2, mBuilder.mContentText);
		remoteviews.setViewVisibility(android.support.compat.R.id.text2, 0);
		k = 1;
_L3:
		if(k != 0 && android.os.Build.VERSION.SDK_INT >= 16)
		{
			if(flag1)
			{
				f = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_subtext_size);
				remoteviews.setTextViewTextSize(android.support.compat.R.id.text, 0, f);
			}
			remoteviews.setViewPadding(android.support.compat.R.id.line1, 0, 0, 0, 0);
		}
		if(mBuilder.getWhenIfShowing() != 0L)
		{
			if(mBuilder.mUseChronometer && android.os.Build.VERSION.SDK_INT >= 16)
			{
				remoteviews.setViewVisibility(android.support.compat.R.id.chronometer, 0);
				remoteviews.setLong(android.support.compat.R.id.chronometer, "setBase", mBuilder.getWhenIfShowing() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
				remoteviews.setBoolean(android.support.compat.R.id.chronometer, "setStarted", true);
			} else
			{
				remoteviews.setViewVisibility(android.support.compat.R.id.time, 0);
				remoteviews.setLong(android.support.compat.R.id.time, "setTime", mBuilder.getWhenIfShowing());
			}
			i = 1;
		}
		k = android.support.compat.R.id.right_side;
		if(i != 0)
			i = 0;
		else
			i = 8;
		remoteviews.setViewVisibility(k, i);
		k = android.support.compat.R.id.line3;
		if(j != 0)
			i = 0;
		else
			i = 8;
		remoteviews.setViewVisibility(k, i);
		return remoteviews;
_L2:
		remoteviews.setViewVisibility(android.support.compat.R.id.text2, 8);
		k = 0;
		  goto _L3
	//* 424  965:goto            278
	}

	public Notification build()
	{
		Notification notification = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(mBuilder != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*   4    6:ifnull          17
			notification = mBuilder.build();
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//    7   13:invokevirtual   #368 <Method Notification NotificationCompat$Builder.build()>
	//    8   16:astore_1        
		return notification;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public void buildIntoRemoteViews(RemoteViews remoteviews, RemoteViews remoteviews1)
	{
		hideNormalContent(remoteviews);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #372 <Method void hideNormalContent(RemoteViews)>
		remoteviews.removeAllViews(android.support.compat.R.id.notification_main_column);
	//    3    5:aload_1         
	//    4    6:getstatic       #375 <Field int android.support.compat.R$id.notification_main_column>
	//    5    9:invokevirtual   #379 <Method void RemoteViews.removeAllViews(int)>
		remoteviews.addView(android.support.compat.R.id.notification_main_column, remoteviews1.clone());
	//    6   12:aload_1         
	//    7   13:getstatic       #375 <Field int android.support.compat.R$id.notification_main_column>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #383 <Method RemoteViews RemoteViews.clone()>
	//   10   20:invokevirtual   #387 <Method void RemoteViews.addView(int, RemoteViews)>
		remoteviews.setViewVisibility(android.support.compat.R.id.notification_main_column, 0);
	//   11   23:aload_1         
	//   12   24:getstatic       #375 <Field int android.support.compat.R$id.notification_main_column>
	//   13   27:iconst_0        
	//   14   28:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  15   31:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   34:bipush          21
	//*  17   36:icmplt          53
			remoteviews.setViewPadding(android.support.compat.R.id.notification_main_column_container, 0, calculateTopPadding(), 0, 0);
	//   18   39:aload_1         
	//   19   40:getstatic       #390 <Field int android.support.compat.R$id.notification_main_column_container>
	//   20   43:iconst_0        
	//   21   44:aload_0         
	//   22   45:invokespecial   #392 <Method int calculateTopPadding()>
	//   23   48:iconst_0        
	//   24   49:iconst_0        
	//   25   50:invokevirtual   #273 <Method void RemoteViews.setViewPadding(int, int, int, int, int)>
	//   26   53:return          
	}

	public Bitmap createColoredBitmap(int i, int j)
	{
		return createColoredBitmap(i, j, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #145 <Method Bitmap createColoredBitmap(int, int, int)>
	//    5    7:areturn         
	}

	public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected void restoreFromCompatExtras(Bundle bundle)
	{
	//    0    0:return          
	}

	public void setBuilder(r r)
	{
		if(mBuilder != r)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       29
		{
			mBuilder = r;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #29  <Field NotificationCompat$Builder mBuilder>
			if(mBuilder != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*   9   17:ifnull          29
				mBuilder.setStyle(this);
	//   10   20:aload_0         
	//   11   21:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #403 <Method NotificationCompat$Builder NotificationCompat$Builder.setStyle(NotificationCompat$Style)>
	//   14   28:pop             
		}
	//   15   29:return          
	}

	CharSequence mBigContentTitle;
	protected r mBuilder;
	CharSequence mSummaryText;
	boolean mSummaryTextSet;

	public NotificationCompat$Style()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mSummaryTextSet = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #24  <Field boolean mSummaryTextSet>
	//    5    9:return          
	}
}
