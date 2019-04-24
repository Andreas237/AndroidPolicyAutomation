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
	//    4   10:astore          4
		int i = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_top_pad);
	//    5   12:aload           4
	//    6   14:getstatic       #47  <Field int android.support.compat.R$dimen.notification_top_pad>
	//    7   17:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//    8   20:istore_2        
		int j = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_top_pad_large_text);
	//    9   21:aload           4
	//   10   23:getstatic       #56  <Field int android.support.compat.R$dimen.notification_top_pad_large_text>
	//   11   26:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//   12   29:istore_3        
		float f = (constrain(resources.getConfiguration().fontScale, 1.0F, 1.3F) - 1.0F) / 0.3F;
	//   13   30:aload           4
	//   14   32:invokevirtual   #60  <Method Configuration Resources.getConfiguration()>
	//   15   35:getfield        #66  <Field float Configuration.fontScale>
	//   16   38:fconst_1        
	//   17   39:ldc1            #67  <Float 1.3F>
	//   18   41:invokestatic    #71  <Method float constrain(float, float, float)>
	//   19   44:fconst_1        
	//   20   45:fsub            
	//   21   46:ldc1            #72  <Float 0.3F>
	//   22   48:fdiv            
	//   23   49:fstore_1        
		return Math.round((1.0F - f) * (float)i + (float)j * f);
	//   24   50:fconst_1        
	//   25   51:fload_1         
	//   26   52:fsub            
	//   27   53:iload_2         
	//   28   54:i2f             
	//   29   55:fmul            
	//   30   56:iload_3         
	//   31   57:i2f             
	//   32   58:fload_1         
	//   33   59:fmul            
	//   34   60:fadd            
	//   35   61:invokestatic    #78  <Method int Math.round(float)>
	//   36   64:ireturn         
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
	//    6   14:astore          4
		Bitmap bitmap;
		if(k == 0)
	//*   7   16:iload_3         
	//*   8   17:ifne            95
			i = drawable.getIntrinsicWidth();
	//    9   20:aload           4
	//   10   22:invokevirtual   #89  <Method int Drawable.getIntrinsicWidth()>
	//   11   25:istore_1        
		else
	//*  12   26:iload_3         
	//*  13   27:ifne            100
	//*  14   30:aload           4
	//*  15   32:invokevirtual   #92  <Method int Drawable.getIntrinsicHeight()>
	//*  16   35:istore_3        
	//*  17   36:iload_1         
	//*  18   37:iload_3         
	//*  19   38:getstatic       #98  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//*  20   41:invokestatic    #104 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//*  21   44:astore          5
	//*  22   46:aload           4
	//*  23   48:iconst_0        
	//*  24   49:iconst_0        
	//*  25   50:iload_1         
	//*  26   51:iload_3         
	//*  27   52:invokevirtual   #108 <Method void Drawable.setBounds(int, int, int, int)>
	//*  28   55:iload_2         
	//*  29   56:ifeq            78
	//*  30   59:aload           4
	//*  31   61:invokevirtual   #112 <Method Drawable Drawable.mutate()>
	//*  32   64:new             #114 <Class PorterDuffColorFilter>
	//*  33   67:dup             
	//*  34   68:iload_2         
	//*  35   69:getstatic       #120 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//*  36   72:invokespecial   #123 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//*  37   75:invokevirtual   #127 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
	//*  38   78:aload           4
	//*  39   80:new             #129 <Class Canvas>
	//*  40   83:dup             
	//*  41   84:aload           5
	//*  42   86:invokespecial   #132 <Method void Canvas(Bitmap)>
	//*  43   89:invokevirtual   #136 <Method void Drawable.draw(Canvas)>
	//*  44   92:aload           5
	//*  45   94:areturn         
			i = k;
	//   46   95:iload_3         
	//   47   96:istore_1        
		if(k == 0)
			k = drawable.getIntrinsicHeight();
		bitmap = Bitmap.createBitmap(i, k, android.graphics.Bitmap.Config.ARGB_8888);
		drawable.setBounds(0, 0, i, k);
		if(j != 0)
			drawable.mutate().setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(j, android.graphics.PorterDuff.Mode.SRC_IN))));
		drawable.draw(new Canvas(bitmap));
		return bitmap;
	//*  48   97:goto            26
	//*  49  100:goto            36
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
	//    4   10:astore          9
		RemoteViews remoteviews = new RemoteViews(mBuilder.mContext.getPackageName(), i);
	//    5   12:new             #161 <Class RemoteViews>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//    9   20:getfield        #35  <Field Context NotificationCompat$Builder.mContext>
	//   10   23:invokevirtual   #182 <Method String Context.getPackageName()>
	//   11   26:iload_2         
	//   12   27:invokespecial   #185 <Method void RemoteViews(String, int)>
	//   13   30:astore          10
		boolean flag2 = false;
	//   14   32:iconst_0        
	//   15   33:istore          5
		boolean flag3 = false;
	//   16   35:iconst_0        
	//   17   36:istore          7
		int j;
		if(mBuilder.getPriority() < -1)
	//*  18   38:aload_0         
	//*  19   39:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*  20   42:invokevirtual   #188 <Method int NotificationCompat$Builder.getPriority()>
	//*  21   45:iconst_m1       
	//*  22   46:icmpge          594
			i = 1;
	//   23   49:iconst_1        
	//   24   50:istore_2        
		else
	//*  25   51:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  26   54:bipush          16
	//*  27   56:icmplt          97
	//*  28   59:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  29   62:bipush          21
	//*  30   64:icmpge          97
	//*  31   67:iload_2         
	//*  32   68:ifeq            599
	//*  33   71:aload           10
	//*  34   73:getstatic       #196 <Field int android.support.compat.R$id.notification_background>
	//*  35   76:ldc1            #198 <String "setBackgroundResource">
	//*  36   78:getstatic       #201 <Field int android.support.compat.R$drawable.notification_bg_low>
	//*  37   81:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
	//*  38   84:aload           10
	//*  39   86:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//*  40   89:ldc1            #198 <String "setBackgroundResource">
	//*  41   91:getstatic       #211 <Field int android.support.compat.R$drawable.notification_template_icon_low_bg>
	//*  42   94:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
	//*  43   97:aload_0         
	//*  44   98:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*  45  101:getfield        #215 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
	//*  46  104:ifnull          667
	//*  47  107:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  48  110:bipush          16
	//*  49  112:icmplt          628
	//*  50  115:aload           10
	//*  51  117:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//*  52  120:iconst_0        
	//*  53  121:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//*  54  124:aload           10
	//*  55  126:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//*  56  129:aload_0         
	//*  57  130:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*  58  133:getfield        #215 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
	//*  59  136:invokevirtual   #219 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
	//*  60  139:iload_1         
	//*  61  140:ifeq            232
	//*  62  143:aload_0         
	//*  63  144:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*  64  147:getfield        #223 <Field Notification NotificationCompat$Builder.mNotification>
	//*  65  150:getfield        #226 <Field int Notification.icon>
	//*  66  153:ifeq            232
	//*  67  156:aload           9
	//*  68  158:getstatic       #229 <Field int android.support.compat.R$dimen.notification_right_icon_size>
	//*  69  161:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//*  70  164:istore_2        
	//*  71  165:aload           9
	//*  72  167:getstatic       #232 <Field int android.support.compat.R$dimen.notification_small_icon_background_padding>
	//*  73  170:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//*  74  173:istore          6
	//*  75  175:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  76  178:bipush          21
	//*  77  180:icmplt          641
	//*  78  183:aload_0         
	//*  79  184:aload_0         
	//*  80  185:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*  81  188:getfield        #223 <Field Notification NotificationCompat$Builder.mNotification>
	//*  82  191:getfield        #226 <Field int Notification.icon>
	//*  83  194:iload_2         
	//*  84  195:iload_2         
	//*  85  196:iload           6
	//*  86  198:iconst_2        
	//*  87  199:imul            
	//*  88  200:isub            
	//*  89  201:aload_0         
	//*  90  202:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*  91  205:invokevirtual   #235 <Method int NotificationCompat$Builder.getColor()>
	//*  92  208:invokespecial   #237 <Method Bitmap createIconWithBackground(int, int, int, int)>
	//*  93  211:astore          11
	//*  94  213:aload           10
	//*  95  215:getstatic       #240 <Field int android.support.compat.R$id.right_icon>
	//*  96  218:aload           11
	//*  97  220:invokevirtual   #219 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
	//*  98  223:aload           10
	//*  99  225:getstatic       #240 <Field int android.support.compat.R$id.right_icon>
	//* 100  228:iconst_0        
	//* 101  229:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//* 102  232:aload_0         
	//* 103  233:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 104  236:getfield        #243 <Field CharSequence NotificationCompat$Builder.mContentTitle>
	//* 105  239:ifnull          257
	//* 106  242:aload           10
	//* 107  244:getstatic       #159 <Field int android.support.compat.R$id.title>
	//* 108  247:aload_0         
	//* 109  248:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 110  251:getfield        #243 <Field CharSequence NotificationCompat$Builder.mContentTitle>
	//* 111  254:invokevirtual   #247 <Method void RemoteViews.setTextViewText(int, CharSequence)>
	//* 112  257:aload_0         
	//* 113  258:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 114  261:getfield        #250 <Field CharSequence NotificationCompat$Builder.mContentText>
	//* 115  264:ifnull          285
	//* 116  267:aload           10
	//* 117  269:getstatic       #171 <Field int android.support.compat.R$id.text>
	//* 118  272:aload_0         
	//* 119  273:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 120  276:getfield        #250 <Field CharSequence NotificationCompat$Builder.mContentText>
	//* 121  279:invokevirtual   #247 <Method void RemoteViews.setTextViewText(int, CharSequence)>
	//* 122  282:iconst_1        
	//* 123  283:istore          5
	//* 124  285:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 125  288:bipush          21
	//* 126  290:icmpge          798
	//* 127  293:aload_0         
	//* 128  294:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 129  297:getfield        #215 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
	//* 130  300:ifnull          798
	//* 131  303:iconst_1        
	//* 132  304:istore_2        
	//* 133  305:aload_0         
	//* 134  306:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 135  309:getfield        #253 <Field CharSequence NotificationCompat$Builder.mContentInfo>
	//* 136  312:ifnull          803
	//* 137  315:aload           10
	//* 138  317:getstatic       #256 <Field int android.support.compat.R$id.info>
	//* 139  320:aload_0         
	//* 140  321:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 141  324:getfield        #253 <Field CharSequence NotificationCompat$Builder.mContentInfo>
	//* 142  327:invokevirtual   #247 <Method void RemoteViews.setTextViewText(int, CharSequence)>
	//* 143  330:aload           10
	//* 144  332:getstatic       #256 <Field int android.support.compat.R$id.info>
	//* 145  335:iconst_0        
	//* 146  336:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//* 147  339:iconst_1        
	//* 148  340:istore          5
	//* 149  342:iconst_1        
	//* 150  343:istore_2        
	//* 151  344:iload           7
	//* 152  346:istore          6
	//* 153  348:aload_0         
	//* 154  349:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 155  352:getfield        #259 <Field CharSequence NotificationCompat$Builder.mSubText>
	//* 156  355:ifnull          422
	//* 157  358:iload           7
	//* 158  360:istore          6
	//* 159  362:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 160  365:bipush          16
	//* 161  367:icmplt          422
	//* 162  370:aload           10
	//* 163  372:getstatic       #171 <Field int android.support.compat.R$id.text>
	//* 164  375:aload_0         
	//* 165  376:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 166  379:getfield        #259 <Field CharSequence NotificationCompat$Builder.mSubText>
	//* 167  382:invokevirtual   #247 <Method void RemoteViews.setTextViewText(int, CharSequence)>
	//* 168  385:aload_0         
	//* 169  386:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 170  389:getfield        #250 <Field CharSequence NotificationCompat$Builder.mContentText>
	//* 171  392:ifnull          908
	//* 172  395:aload           10
	//* 173  397:getstatic       #168 <Field int android.support.compat.R$id.text2>
	//* 174  400:aload_0         
	//* 175  401:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 176  404:getfield        #250 <Field CharSequence NotificationCompat$Builder.mContentText>
	//* 177  407:invokevirtual   #247 <Method void RemoteViews.setTextViewText(int, CharSequence)>
	//* 178  410:aload           10
	//* 179  412:getstatic       #168 <Field int android.support.compat.R$id.text2>
	//* 180  415:iconst_0        
	//* 181  416:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//* 182  419:iconst_1        
	//* 183  420:istore          6
	//* 184  422:iload           6
	//* 185  424:ifeq            473
	//* 186  427:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 187  430:bipush          16
	//* 188  432:icmplt          473
	//* 189  435:iload_3         
	//* 190  436:ifeq            461
	//* 191  439:aload           9
	//* 192  441:getstatic       #262 <Field int android.support.compat.R$dimen.notification_subtext_size>
	//* 193  444:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//* 194  447:i2f             
	//* 195  448:fstore          4
	//* 196  450:aload           10
	//* 197  452:getstatic       #171 <Field int android.support.compat.R$id.text>
	//* 198  455:iconst_0        
	//* 199  456:fload           4
	//* 200  458:invokevirtual   #266 <Method void RemoteViews.setTextViewTextSize(int, int, float)>
	//* 201  461:aload           10
	//* 202  463:getstatic       #269 <Field int android.support.compat.R$id.line1>
	//* 203  466:iconst_0        
	//* 204  467:iconst_0        
	//* 205  468:iconst_0        
	//* 206  469:iconst_0        
	//* 207  470:invokevirtual   #273 <Method void RemoteViews.setViewPadding(int, int, int, int, int)>
	//* 208  473:aload_0         
	//* 209  474:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 210  477:invokevirtual   #277 <Method long NotificationCompat$Builder.getWhenIfShowing()>
	//* 211  480:lconst_0        
	//* 212  481:lcmp            
	//* 213  482:ifeq            552
	//* 214  485:aload_0         
	//* 215  486:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 216  489:getfield        #280 <Field boolean NotificationCompat$Builder.mUseChronometer>
	//* 217  492:ifeq            925
	//* 218  495:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 219  498:bipush          16
	//* 220  500:icmplt          925
	//* 221  503:aload           10
	//* 222  505:getstatic       #283 <Field int android.support.compat.R$id.chronometer>
	//* 223  508:iconst_0        
	//* 224  509:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//* 225  512:aload           10
	//* 226  514:getstatic       #283 <Field int android.support.compat.R$id.chronometer>
	//* 227  517:ldc2            #285 <String "setBase">
	//* 228  520:aload_0         
	//* 229  521:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 230  524:invokevirtual   #277 <Method long NotificationCompat$Builder.getWhenIfShowing()>
	//* 231  527:invokestatic    #290 <Method long SystemClock.elapsedRealtime()>
	//* 232  530:invokestatic    #295 <Method long System.currentTimeMillis()>
	//* 233  533:lsub            
	//* 234  534:ladd            
	//* 235  535:invokevirtual   #299 <Method void RemoteViews.setLong(int, String, long)>
	//* 236  538:aload           10
	//* 237  540:getstatic       #283 <Field int android.support.compat.R$id.chronometer>
	//* 238  543:ldc2            #301 <String "setStarted">
	//* 239  546:iconst_1        
	//* 240  547:invokevirtual   #305 <Method void RemoteViews.setBoolean(int, String, boolean)>
	//* 241  550:iconst_1        
	//* 242  551:istore_2        
	//* 243  552:getstatic       #308 <Field int android.support.compat.R$id.right_side>
	//* 244  555:istore          6
	//* 245  557:iload_2         
	//* 246  558:ifeq            955
	//* 247  561:iconst_0        
	//* 248  562:istore_2        
	//* 249  563:aload           10
	//* 250  565:iload           6
	//* 251  567:iload_2         
	//* 252  568:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//* 253  571:getstatic       #311 <Field int android.support.compat.R$id.line3>
	//* 254  574:istore          6
	//* 255  576:iload           5
	//* 256  578:ifeq            961
	//* 257  581:iconst_0        
	//* 258  582:istore_2        
	//* 259  583:aload           10
	//* 260  585:iload           6
	//* 261  587:iload_2         
	//* 262  588:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//* 263  591:aload           10
	//* 264  593:areturn         
			i = 0;
	//  265  594:iconst_0        
	//  266  595:istore_2        
		if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT < 21)
			if(i != 0)
			{
				remoteviews.setInt(android.support.compat.R.id.notification_background, "setBackgroundResource", android.support.compat.R.drawable.notification_bg_low);
				remoteviews.setInt(android.support.compat.R.id.icon, "setBackgroundResource", android.support.compat.R.drawable.notification_template_icon_low_bg);
			} else
	//* 267  596:goto            51
			{
				remoteviews.setInt(android.support.compat.R.id.notification_background, "setBackgroundResource", android.support.compat.R.drawable.notification_bg);
	//  268  599:aload           10
	//  269  601:getstatic       #196 <Field int android.support.compat.R$id.notification_background>
	//  270  604:ldc1            #198 <String "setBackgroundResource">
	//  271  606:getstatic       #314 <Field int android.support.compat.R$drawable.notification_bg>
	//  272  609:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
				remoteviews.setInt(android.support.compat.R.id.icon, "setBackgroundResource", android.support.compat.R.drawable.notification_template_icon_bg);
	//  273  612:aload           10
	//  274  614:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//  275  617:ldc1            #198 <String "setBackgroundResource">
	//  276  619:getstatic       #317 <Field int android.support.compat.R$drawable.notification_template_icon_bg>
	//  277  622:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
			}
		if(mBuilder.mLargeIcon != null)
		{
			if(android.os.Build.VERSION.SDK_INT >= 16)
			{
				remoteviews.setViewVisibility(android.support.compat.R.id.icon, 0);
				remoteviews.setImageViewBitmap(android.support.compat.R.id.icon, mBuilder.mLargeIcon);
			} else
	//* 278  625:goto            97
			{
				remoteviews.setViewVisibility(android.support.compat.R.id.icon, 8);
	//  279  628:aload           10
	//  280  630:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//  281  633:bipush          8
	//  282  635:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
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
	//* 283  638:goto            139
				{
					remoteviews.setImageViewBitmap(android.support.compat.R.id.right_icon, createColoredBitmap(mBuilder.mNotification.icon, -1));
	//  284  641:aload           10
	//  285  643:getstatic       #240 <Field int android.support.compat.R$id.right_icon>
	//  286  646:aload_0         
	//  287  647:aload_0         
	//  288  648:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  289  651:getfield        #223 <Field Notification NotificationCompat$Builder.mNotification>
	//  290  654:getfield        #226 <Field int Notification.icon>
	//  291  657:iconst_m1       
	//  292  658:invokevirtual   #320 <Method Bitmap createColoredBitmap(int, int)>
	//  293  661:invokevirtual   #219 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
				}
				remoteviews.setViewVisibility(android.support.compat.R.id.right_icon, 0);
			}
		} else
	//* 294  664:goto            223
		if(flag && mBuilder.mNotification.icon != 0)
	//* 295  667:iload_1         
	//* 296  668:ifeq            232
	//* 297  671:aload_0         
	//* 298  672:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 299  675:getfield        #223 <Field Notification NotificationCompat$Builder.mNotification>
	//* 300  678:getfield        #226 <Field int Notification.icon>
	//* 301  681:ifeq            232
		{
			remoteviews.setViewVisibility(android.support.compat.R.id.icon, 0);
	//  302  684:aload           10
	//  303  686:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//  304  689:iconst_0        
	//  305  690:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 306  693:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 307  696:bipush          21
	//* 308  698:icmplt          772
			{
				i = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_large_icon_width);
	//  309  701:aload           9
	//  310  703:getstatic       #323 <Field int android.support.compat.R$dimen.notification_large_icon_width>
	//  311  706:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//  312  709:istore_2        
				j = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_big_circle_margin);
	//  313  710:aload           9
	//  314  712:getstatic       #326 <Field int android.support.compat.R$dimen.notification_big_circle_margin>
	//  315  715:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//  316  718:istore          6
				int k = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_small_icon_size_as_large);
	//  317  720:aload           9
	//  318  722:getstatic       #329 <Field int android.support.compat.R$dimen.notification_small_icon_size_as_large>
	//  319  725:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//  320  728:istore          8
				Bitmap bitmap1 = createIconWithBackground(mBuilder.mNotification.icon, i - j, k, mBuilder.getColor());
	//  321  730:aload_0         
	//  322  731:aload_0         
	//  323  732:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  324  735:getfield        #223 <Field Notification NotificationCompat$Builder.mNotification>
	//  325  738:getfield        #226 <Field int Notification.icon>
	//  326  741:iload_2         
	//  327  742:iload           6
	//  328  744:isub            
	//  329  745:iload           8
	//  330  747:aload_0         
	//  331  748:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  332  751:invokevirtual   #235 <Method int NotificationCompat$Builder.getColor()>
	//  333  754:invokespecial   #237 <Method Bitmap createIconWithBackground(int, int, int, int)>
	//  334  757:astore          11
				remoteviews.setImageViewBitmap(android.support.compat.R.id.icon, bitmap1);
	//  335  759:aload           10
	//  336  761:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//  337  764:aload           11
	//  338  766:invokevirtual   #219 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
			} else
	//* 339  769:goto            232
			{
				remoteviews.setImageViewBitmap(android.support.compat.R.id.icon, createColoredBitmap(mBuilder.mNotification.icon, -1));
	//  340  772:aload           10
	//  341  774:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//  342  777:aload_0         
	//  343  778:aload_0         
	//  344  779:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  345  782:getfield        #223 <Field Notification NotificationCompat$Builder.mNotification>
	//  346  785:getfield        #226 <Field int Notification.icon>
	//  347  788:iconst_m1       
	//  348  789:invokevirtual   #320 <Method Bitmap createColoredBitmap(int, int)>
	//  349  792:invokevirtual   #219 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
			}
		}
		if(mBuilder.mContentTitle != null)
			remoteviews.setTextViewText(android.support.compat.R.id.title, mBuilder.mContentTitle);
		if(mBuilder.mContentText != null)
		{
			remoteviews.setTextViewText(android.support.compat.R.id.text, mBuilder.mContentText);
			flag2 = true;
		}
		if(android.os.Build.VERSION.SDK_INT < 21 && mBuilder.mLargeIcon != null)
			i = 1;
		else
	//* 350  795:goto            232
			i = 0;
	//  351  798:iconst_0        
	//  352  799:istore_2        
		if(mBuilder.mContentInfo != null)
		{
			remoteviews.setTextViewText(android.support.compat.R.id.info, mBuilder.mContentInfo);
			remoteviews.setViewVisibility(android.support.compat.R.id.info, 0);
			flag2 = true;
			i = 1;
		} else
	//* 353  800:goto            305
		if(mBuilder.mNumber > 0)
	//* 354  803:aload_0         
	//* 355  804:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 356  807:getfield        #332 <Field int NotificationCompat$Builder.mNumber>
	//* 357  810:ifle            895
		{
			i = resources.getInteger(android.support.compat.R.integer.status_bar_notification_info_maxnum);
	//  358  813:aload           9
	//  359  815:getstatic       #337 <Field int android.support.compat.R$integer.status_bar_notification_info_maxnum>
	//  360  818:invokevirtual   #340 <Method int Resources.getInteger(int)>
	//  361  821:istore_2        
			if(mBuilder.mNumber > i)
	//* 362  822:aload_0         
	//* 363  823:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 364  826:getfield        #332 <Field int NotificationCompat$Builder.mNumber>
	//* 365  829:iload_2         
	//* 366  830:icmple          866
			{
				remoteviews.setTextViewText(android.support.compat.R.id.info, ((CharSequence) (resources.getString(android.support.compat.R.string.status_bar_notification_info_overflow))));
	//  367  833:aload           10
	//  368  835:getstatic       #256 <Field int android.support.compat.R$id.info>
	//  369  838:aload           9
	//  370  840:getstatic       #345 <Field int android.support.compat.R$string.status_bar_notification_info_overflow>
	//  371  843:invokevirtual   #349 <Method String Resources.getString(int)>
	//  372  846:invokevirtual   #247 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			} else
	//* 373  849:aload           10
	//* 374  851:getstatic       #256 <Field int android.support.compat.R$id.info>
	//* 375  854:iconst_0        
	//* 376  855:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
	//* 377  858:iconst_1        
	//* 378  859:istore          5
	//* 379  861:iconst_1        
	//* 380  862:istore_2        
	//* 381  863:goto            344
			{
				NumberFormat numberformat = NumberFormat.getIntegerInstance();
	//  382  866:invokestatic    #355 <Method NumberFormat NumberFormat.getIntegerInstance()>
	//  383  869:astore          11
				remoteviews.setTextViewText(android.support.compat.R.id.info, ((CharSequence) (numberformat.format(mBuilder.mNumber))));
	//  384  871:aload           10
	//  385  873:getstatic       #256 <Field int android.support.compat.R$id.info>
	//  386  876:aload           11
	//  387  878:aload_0         
	//  388  879:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  389  882:getfield        #332 <Field int NotificationCompat$Builder.mNumber>
	//  390  885:i2l             
	//  391  886:invokevirtual   #359 <Method String NumberFormat.format(long)>
	//  392  889:invokevirtual   #247 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			}
			remoteviews.setViewVisibility(android.support.compat.R.id.info, 0);
			flag2 = true;
			i = 1;
		} else
	//* 393  892:goto            849
		{
			remoteviews.setViewVisibility(android.support.compat.R.id.info, 8);
	//  394  895:aload           10
	//  395  897:getstatic       #256 <Field int android.support.compat.R$id.info>
	//  396  900:bipush          8
	//  397  902:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
		}
		j = ((int) (flag3));
		if(mBuilder.mSubText != null)
		{
			j = ((int) (flag3));
			if(android.os.Build.VERSION.SDK_INT >= 16)
			{
				remoteviews.setTextViewText(android.support.compat.R.id.text, mBuilder.mSubText);
				if(mBuilder.mContentText != null)
				{
					remoteviews.setTextViewText(android.support.compat.R.id.text2, mBuilder.mContentText);
					remoteviews.setViewVisibility(android.support.compat.R.id.text2, 0);
					j = 1;
				} else
	//* 398  905:goto            344
				{
					remoteviews.setViewVisibility(android.support.compat.R.id.text2, 8);
	//  399  908:aload           10
	//  400  910:getstatic       #168 <Field int android.support.compat.R$id.text2>
	//  401  913:bipush          8
	//  402  915:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
					j = ((int) (flag3));
	//  403  918:iload           7
	//  404  920:istore          6
				}
			}
		}
		if(j != 0 && android.os.Build.VERSION.SDK_INT >= 16)
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
	//* 405  922:goto            422
			{
				remoteviews.setViewVisibility(android.support.compat.R.id.time, 0);
	//  406  925:aload           10
	//  407  927:getstatic       #362 <Field int android.support.compat.R$id.time>
	//  408  930:iconst_0        
	//  409  931:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
				remoteviews.setLong(android.support.compat.R.id.time, "setTime", mBuilder.getWhenIfShowing());
	//  410  934:aload           10
	//  411  936:getstatic       #362 <Field int android.support.compat.R$id.time>
	//  412  939:ldc2            #364 <String "setTime">
	//  413  942:aload_0         
	//  414  943:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  415  946:invokevirtual   #277 <Method long NotificationCompat$Builder.getWhenIfShowing()>
	//  416  949:invokevirtual   #299 <Method void RemoteViews.setLong(int, String, long)>
			}
			i = 1;
		}
		j = android.support.compat.R.id.right_side;
		if(i != 0)
			i = 0;
		else
	//* 417  952:goto            550
			i = 8;
	//  418  955:bipush          8
	//  419  957:istore_2        
		remoteviews.setViewVisibility(j, i);
		j = android.support.compat.R.id.line3;
		if(flag2)
			i = 0;
		else
	//* 420  958:goto            563
			i = 8;
	//  421  961:bipush          8
	//  422  963:istore_2        
		remoteviews.setViewVisibility(j, i);
		return remoteviews;
	//* 423  964:goto            583
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
