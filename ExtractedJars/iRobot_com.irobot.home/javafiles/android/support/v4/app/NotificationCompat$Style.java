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
	//    1    1:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//    2    4:getfield        #31  <Field Context NotificationCompat$Builder.mContext>
	//    3    7:invokevirtual   #37  <Method Resources Context.getResources()>
	//    4   10:astore          4
		int i = resources.getDimensionPixelSize(android.support.a.a.b.notification_top_pad);
	//    5   12:aload           4
	//    6   14:getstatic       #43  <Field int android.support.a.a$b.notification_top_pad>
	//    7   17:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
	//    8   20:istore_2        
		int j = resources.getDimensionPixelSize(android.support.a.a.b.notification_top_pad_large_text);
	//    9   21:aload           4
	//   10   23:getstatic       #52  <Field int android.support.a.a$b.notification_top_pad_large_text>
	//   11   26:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
	//   12   29:istore_3        
		float f = (constrain(resources.getConfiguration().fontScale, 1.0F, 1.3F) - 1.0F) / 0.3F;
	//   13   30:aload           4
	//   14   32:invokevirtual   #56  <Method Configuration Resources.getConfiguration()>
	//   15   35:getfield        #62  <Field float Configuration.fontScale>
	//   16   38:fconst_1        
	//   17   39:ldc1            #63  <Float 1.3F>
	//   18   41:invokestatic    #67  <Method float constrain(float, float, float)>
	//   19   44:fconst_1        
	//   20   45:fsub            
	//   21   46:ldc1            #68  <Float 0.3F>
	//   22   48:fdiv            
	//   23   49:fstore_1        
		return Math.round((1.0F - f) * (float)i + f * (float)j);
	//   24   50:fconst_1        
	//   25   51:fload_1         
	//   26   52:fsub            
	//   27   53:iload_2         
	//   28   54:i2f             
	//   29   55:fmul            
	//   30   56:fload_1         
	//   31   57:iload_3         
	//   32   58:i2f             
	//   33   59:fmul            
	//   34   60:fadd            
	//   35   61:invokestatic    #74  <Method int Math.round(float)>
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
		f1 = f;
	//    6    8:fload_0         
	//    7    9:fstore_1        
		if(f > f2)
	//*   8   10:fload_0         
	//*   9   11:fload_2         
	//*  10   12:fcmpl           
	//*  11   13:ifle            18
			f1 = f2;
	//   12   16:fload_2         
	//   13   17:fstore_1        
		return f1;
	//   14   18:fload_1         
	//   15   19:freturn         
	}

	private Bitmap createColoredBitmap(int i, int j, int k)
	{
		Drawable drawable = mBuilder.mContext.getResources().getDrawable(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//    2    4:getfield        #31  <Field Context NotificationCompat$Builder.mContext>
	//    3    7:invokevirtual   #37  <Method Resources Context.getResources()>
	//    4   10:iload_1         
	//    5   11:invokevirtual   #80  <Method Drawable Resources.getDrawable(int)>
	//    6   14:astore          5
		if(k == 0)
	//*   7   16:iload_3         
	//*   8   17:ifne            29
			i = drawable.getIntrinsicWidth();
	//    9   20:aload           5
	//   10   22:invokevirtual   #85  <Method int Drawable.getIntrinsicWidth()>
	//   11   25:istore_1        
		else
	//*  12   26:goto            31
			i = k;
	//   13   29:iload_3         
	//   14   30:istore_1        
		int l = k;
	//   15   31:iload_3         
	//   16   32:istore          4
		if(k == 0)
	//*  17   34:iload_3         
	//*  18   35:ifne            45
			l = drawable.getIntrinsicHeight();
	//   19   38:aload           5
	//   20   40:invokevirtual   #88  <Method int Drawable.getIntrinsicHeight()>
	//   21   43:istore          4
		Bitmap bitmap = Bitmap.createBitmap(i, l, android.graphics.Bitmap.Config.ARGB_8888);
	//   22   45:iload_1         
	//   23   46:iload           4
	//   24   48:getstatic       #94  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   25   51:invokestatic    #100 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   26   54:astore          6
		drawable.setBounds(0, 0, i, l);
	//   27   56:aload           5
	//   28   58:iconst_0        
	//   29   59:iconst_0        
	//   30   60:iload_1         
	//   31   61:iload           4
	//   32   63:invokevirtual   #104 <Method void Drawable.setBounds(int, int, int, int)>
		if(j != 0)
	//*  33   66:iload_2         
	//*  34   67:ifeq            89
			drawable.mutate().setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(j, android.graphics.PorterDuff.Mode.SRC_IN))));
	//   35   70:aload           5
	//   36   72:invokevirtual   #108 <Method Drawable Drawable.mutate()>
	//   37   75:new             #110 <Class PorterDuffColorFilter>
	//   38   78:dup             
	//   39   79:iload_2         
	//   40   80:getstatic       #116 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   41   83:invokespecial   #119 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   42   86:invokevirtual   #123 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
		drawable.draw(new Canvas(bitmap));
	//   43   89:aload           5
	//   44   91:new             #125 <Class Canvas>
	//   45   94:dup             
	//   46   95:aload           6
	//   47   97:invokespecial   #128 <Method void Canvas(Bitmap)>
	//   48  100:invokevirtual   #132 <Method void Drawable.draw(Canvas)>
		return bitmap;
	//   49  103:aload           6
	//   50  105:areturn         
	}

	private Bitmap createIconWithBackground(int i, int j, int k, int l)
	{
		int j1 = android.support.a.a.c.notification_icon_background;
	//    0    0:getstatic       #139 <Field int android.support.a.a$c.notification_icon_background>
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
	//   12   23:invokespecial   #141 <Method Bitmap createColoredBitmap(int, int, int)>
	//   13   26:astore          7
		Canvas canvas = new Canvas(bitmap);
	//   14   28:new             #125 <Class Canvas>
	//   15   31:dup             
	//   16   32:aload           7
	//   17   34:invokespecial   #128 <Method void Canvas(Bitmap)>
	//   18   37:astore          8
		Drawable drawable = mBuilder.mContext.getResources().getDrawable(i).mutate();
	//   19   39:aload_0         
	//   20   40:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//   21   43:getfield        #31  <Field Context NotificationCompat$Builder.mContext>
	//   22   46:invokevirtual   #37  <Method Resources Context.getResources()>
	//   23   49:iload_1         
	//   24   50:invokevirtual   #80  <Method Drawable Resources.getDrawable(int)>
	//   25   53:invokevirtual   #108 <Method Drawable Drawable.mutate()>
	//   26   56:astore          9
		drawable.setFilterBitmap(true);
	//   27   58:aload           9
	//   28   60:iconst_1        
	//   29   61:invokevirtual   #145 <Method void Drawable.setFilterBitmap(boolean)>
		i = (j - k) / 2;
	//   30   64:iload_2         
	//   31   65:iload_3         
	//   32   66:isub            
	//   33   67:iconst_2        
	//   34   68:idiv            
	//   35   69:istore_1        
		j = k + i;
	//   36   70:iload_3         
	//   37   71:iload_1         
	//   38   72:iadd            
	//   39   73:istore_2        
		drawable.setBounds(i, i, j, j);
	//   40   74:aload           9
	//   41   76:iload_1         
	//   42   77:iload_1         
	//   43   78:iload_2         
	//   44   79:iload_2         
	//   45   80:invokevirtual   #104 <Method void Drawable.setBounds(int, int, int, int)>
		drawable.setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP))));
	//   46   83:aload           9
	//   47   85:new             #110 <Class PorterDuffColorFilter>
	//   48   88:dup             
	//   49   89:iconst_m1       
	//   50   90:getstatic       #148 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_ATOP>
	//   51   93:invokespecial   #119 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   52   96:invokevirtual   #123 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
		drawable.draw(canvas);
	//   53   99:aload           9
	//   54  101:aload           8
	//   55  103:invokevirtual   #132 <Method void Drawable.draw(Canvas)>
		return bitmap;
	//   56  106:aload           7
	//   57  108:areturn         
	}

	private void hideNormalContent(RemoteViews remoteviews)
	{
		remoteviews.setViewVisibility(android.support.a.a.d.title, 8);
	//    0    0:aload_1         
	//    1    1:getstatic       #155 <Field int android.support.a.a$d.title>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
		remoteviews.setViewVisibility(android.support.a.a.d.text2, 8);
	//    4    9:aload_1         
	//    5   10:getstatic       #164 <Field int android.support.a.a$d.text2>
	//    6   13:bipush          8
	//    7   15:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
		remoteviews.setViewVisibility(android.support.a.a.d.text, 8);
	//    8   18:aload_1         
	//    9   19:getstatic       #167 <Field int android.support.a.a$d.text>
	//   10   22:bipush          8
	//   11   24:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
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
		boolean flag2;
		byte byte0;
		Resources resources;
		RemoteViews remoteviews;
		resources = mBuilder.mContext.getResources();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//    2    4:getfield        #31  <Field Context NotificationCompat$Builder.mContext>
	//    3    7:invokevirtual   #37  <Method Resources Context.getResources()>
	//    4   10:astore          9
		remoteviews = new RemoteViews(mBuilder.mContext.getPackageName(), i);
	//    5   12:new             #157 <Class RemoteViews>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//    9   20:getfield        #31  <Field Context NotificationCompat$Builder.mContext>
	//   10   23:invokevirtual   #177 <Method String Context.getPackageName()>
	//   11   26:iload_2         
	//   12   27:invokespecial   #180 <Method void RemoteViews(String, int)>
	//   13   30:astore          10
		if(mBuilder.getPriority() < -1)
	//*  14   32:aload_0         
	//*  15   33:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//*  16   36:invokevirtual   #183 <Method int NotificationCompat$Builder.getPriority()>
	//*  17   39:iconst_m1       
	//*  18   40:icmpge          48
			i = 1;
	//   19   43:iconst_1        
	//   20   44:istore_2        
		else
	//*  21   45:goto            50
			i = 0;
	//   22   48:iconst_0        
	//   23   49:istore_2        
		if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT < 21)
	//*  24   50:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
	//*  25   53:bipush          16
	//*  26   55:icmplt          130
	//*  27   58:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
	//*  28   61:bipush          21
	//*  29   63:icmpge          130
		{
			int j;
			if(i != 0)
	//*  30   66:iload_2         
	//*  31   67:ifeq            105
			{
				remoteviews.setInt(android.support.a.a.d.notification_background, "setBackgroundResource", android.support.a.a.c.notification_bg_low);
	//   32   70:aload           10
	//   33   72:getstatic       #191 <Field int android.support.a.a$d.notification_background>
	//   34   75:ldc1            #193 <String "setBackgroundResource">
	//   35   77:getstatic       #196 <Field int android.support.a.a$c.notification_bg_low>
	//   36   80:invokevirtual   #200 <Method void RemoteViews.setInt(int, String, int)>
				j = android.support.a.a.d.icon;
	//   37   83:getstatic       #203 <Field int android.support.a.a$d.icon>
	//   38   86:istore          5
				i = android.support.a.a.c.notification_template_icon_low_bg;
	//   39   88:getstatic       #206 <Field int android.support.a.a$c.notification_template_icon_low_bg>
	//   40   91:istore_2        
			} else
	//*  41   92:aload           10
	//*  42   94:iload           5
	//*  43   96:ldc1            #193 <String "setBackgroundResource">
	//*  44   98:iload_2         
	//*  45   99:invokevirtual   #200 <Method void RemoteViews.setInt(int, String, int)>
	//*  46  102:goto            130
			{
				remoteviews.setInt(android.support.a.a.d.notification_background, "setBackgroundResource", android.support.a.a.c.notification_bg);
	//   47  105:aload           10
	//   48  107:getstatic       #191 <Field int android.support.a.a$d.notification_background>
	//   49  110:ldc1            #193 <String "setBackgroundResource">
	//   50  112:getstatic       #209 <Field int android.support.a.a$c.notification_bg>
	//   51  115:invokevirtual   #200 <Method void RemoteViews.setInt(int, String, int)>
				j = android.support.a.a.d.icon;
	//   52  118:getstatic       #203 <Field int android.support.a.a$d.icon>
	//   53  121:istore          5
				i = android.support.a.a.c.notification_template_icon_bg;
	//   54  123:getstatic       #212 <Field int android.support.a.a$c.notification_template_icon_bg>
	//   55  126:istore_2        
			}
			remoteviews.setInt(j, "setBackgroundResource", i);
		}
	//*  56  127:goto            92
		Bitmap bitmap = mBuilder.mLargeIcon;
	//   57  130:aload_0         
	//   58  131:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//   59  134:getfield        #216 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
	//   60  137:astore          8
		byte0 = 8;
	//   61  139:bipush          8
	//   62  141:istore          7
		if(bitmap != null)
	//*  63  143:aload           8
	//*  64  145:ifnull          315
		{
			if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  65  148:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
	//*  66  151:bipush          16
	//*  67  153:icmplt          183
			{
				remoteviews.setViewVisibility(android.support.a.a.d.icon, 0);
	//   68  156:aload           10
	//   69  158:getstatic       #203 <Field int android.support.a.a$d.icon>
	//   70  161:iconst_0        
	//   71  162:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
				remoteviews.setImageViewBitmap(android.support.a.a.d.icon, mBuilder.mLargeIcon);
	//   72  165:aload           10
	//   73  167:getstatic       #203 <Field int android.support.a.a$d.icon>
	//   74  170:aload_0         
	//   75  171:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//   76  174:getfield        #216 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
	//   77  177:invokevirtual   #220 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
			} else
	//*  78  180:goto            193
			{
				remoteviews.setViewVisibility(android.support.a.a.d.icon, 8);
	//   79  183:aload           10
	//   80  185:getstatic       #203 <Field int android.support.a.a$d.icon>
	//   81  188:bipush          8
	//   82  190:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
			}
			if(flag && mBuilder.mNotification.icon != 0)
	//*  83  193:iload_1         
	//*  84  194:ifeq            443
	//*  85  197:aload_0         
	//*  86  198:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//*  87  201:getfield        #224 <Field Notification NotificationCompat$Builder.mNotification>
	//*  88  204:getfield        #227 <Field int Notification.icon>
	//*  89  207:ifeq            443
			{
				i = resources.getDimensionPixelSize(android.support.a.a.b.notification_right_icon_size);
	//   90  210:aload           9
	//   91  212:getstatic       #230 <Field int android.support.a.a$b.notification_right_icon_size>
	//   92  215:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
	//   93  218:istore_2        
				int k = resources.getDimensionPixelSize(android.support.a.a.b.notification_small_icon_background_padding);
	//   94  219:aload           9
	//   95  221:getstatic       #233 <Field int android.support.a.a$b.notification_small_icon_background_padding>
	//   96  224:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
	//   97  227:istore          5
				if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  98  229:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
	//*  99  232:bipush          21
	//* 100  234:icmplt          280
				{
					Bitmap bitmap1 = createIconWithBackground(mBuilder.mNotification.icon, i, i - k * 2, mBuilder.getColor());
	//  101  237:aload_0         
	//  102  238:aload_0         
	//  103  239:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//  104  242:getfield        #224 <Field Notification NotificationCompat$Builder.mNotification>
	//  105  245:getfield        #227 <Field int Notification.icon>
	//  106  248:iload_2         
	//  107  249:iload_2         
	//  108  250:iload           5
	//  109  252:iconst_2        
	//  110  253:imul            
	//  111  254:isub            
	//  112  255:aload_0         
	//  113  256:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//  114  259:invokevirtual   #236 <Method int NotificationCompat$Builder.getColor()>
	//  115  262:invokespecial   #238 <Method Bitmap createIconWithBackground(int, int, int, int)>
	//  116  265:astore          8
					remoteviews.setImageViewBitmap(android.support.a.a.d.right_icon, bitmap1);
	//  117  267:aload           10
	//  118  269:getstatic       #241 <Field int android.support.a.a$d.right_icon>
	//  119  272:aload           8
	//  120  274:invokevirtual   #220 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
				} else
	//* 121  277:goto            303
				{
					remoteviews.setImageViewBitmap(android.support.a.a.d.right_icon, createColoredBitmap(mBuilder.mNotification.icon, -1));
	//  122  280:aload           10
	//  123  282:getstatic       #241 <Field int android.support.a.a$d.right_icon>
	//  124  285:aload_0         
	//  125  286:aload_0         
	//  126  287:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//  127  290:getfield        #224 <Field Notification NotificationCompat$Builder.mNotification>
	//  128  293:getfield        #227 <Field int Notification.icon>
	//  129  296:iconst_m1       
	//  130  297:invokevirtual   #244 <Method Bitmap createColoredBitmap(int, int)>
	//  131  300:invokevirtual   #220 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
				}
				remoteviews.setViewVisibility(android.support.a.a.d.right_icon, 0);
	//  132  303:aload           10
	//  133  305:getstatic       #241 <Field int android.support.a.a$d.right_icon>
	//  134  308:iconst_0        
	//  135  309:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
			}
		} else
	//* 136  312:goto            443
		if(flag && mBuilder.mNotification.icon != 0)
	//* 137  315:iload_1         
	//* 138  316:ifeq            443
	//* 139  319:aload_0         
	//* 140  320:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//* 141  323:getfield        #224 <Field Notification NotificationCompat$Builder.mNotification>
	//* 142  326:getfield        #227 <Field int Notification.icon>
	//* 143  329:ifeq            443
		{
			remoteviews.setViewVisibility(android.support.a.a.d.icon, 0);
	//  144  332:aload           10
	//  145  334:getstatic       #203 <Field int android.support.a.a$d.icon>
	//  146  337:iconst_0        
	//  147  338:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 148  341:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
	//* 149  344:bipush          21
	//* 150  346:icmplt          420
			{
				i = resources.getDimensionPixelSize(android.support.a.a.b.notification_large_icon_width);
	//  151  349:aload           9
	//  152  351:getstatic       #247 <Field int android.support.a.a$b.notification_large_icon_width>
	//  153  354:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
	//  154  357:istore_2        
				int l = resources.getDimensionPixelSize(android.support.a.a.b.notification_big_circle_margin);
	//  155  358:aload           9
	//  156  360:getstatic       #250 <Field int android.support.a.a$b.notification_big_circle_margin>
	//  157  363:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
	//  158  366:istore          5
				int i1 = resources.getDimensionPixelSize(android.support.a.a.b.notification_small_icon_size_as_large);
	//  159  368:aload           9
	//  160  370:getstatic       #253 <Field int android.support.a.a$b.notification_small_icon_size_as_large>
	//  161  373:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
	//  162  376:istore          6
				Bitmap bitmap2 = createIconWithBackground(mBuilder.mNotification.icon, i - l, i1, mBuilder.getColor());
	//  163  378:aload_0         
	//  164  379:aload_0         
	//  165  380:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//  166  383:getfield        #224 <Field Notification NotificationCompat$Builder.mNotification>
	//  167  386:getfield        #227 <Field int Notification.icon>
	//  168  389:iload_2         
	//  169  390:iload           5
	//  170  392:isub            
	//  171  393:iload           6
	//  172  395:aload_0         
	//  173  396:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//  174  399:invokevirtual   #236 <Method int NotificationCompat$Builder.getColor()>
	//  175  402:invokespecial   #238 <Method Bitmap createIconWithBackground(int, int, int, int)>
	//  176  405:astore          8
				remoteviews.setImageViewBitmap(android.support.a.a.d.icon, bitmap2);
	//  177  407:aload           10
	//  178  409:getstatic       #203 <Field int android.support.a.a$d.icon>
	//  179  412:aload           8
	//  180  414:invokevirtual   #220 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
			} else
	//* 181  417:goto            443
			{
				remoteviews.setImageViewBitmap(android.support.a.a.d.icon, createColoredBitmap(mBuilder.mNotification.icon, -1));
	//  182  420:aload           10
	//  183  422:getstatic       #203 <Field int android.support.a.a$d.icon>
	//  184  425:aload_0         
	//  185  426:aload_0         
	//  186  427:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//  187  430:getfield        #224 <Field Notification NotificationCompat$Builder.mNotification>
	//  188  433:getfield        #227 <Field int Notification.icon>
	//  189  436:iconst_m1       
	//  190  437:invokevirtual   #244 <Method Bitmap createColoredBitmap(int, int)>
	//  191  440:invokevirtual   #220 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
			}
		}
		if(mBuilder.mContentTitle != null)
	//* 192  443:aload_0         
	//* 193  444:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//* 194  447:getfield        #256 <Field CharSequence NotificationCompat$Builder.mContentTitle>
	//* 195  450:ifnull          468
			remoteviews.setTextViewText(android.support.a.a.d.title, mBuilder.mContentTitle);
	//  196  453:aload           10
	//  197  455:getstatic       #155 <Field int android.support.a.a$d.title>
	//  198  458:aload_0         
	//  199  459:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//  200  462:getfield        #256 <Field CharSequence NotificationCompat$Builder.mContentTitle>
	//  201  465:invokevirtual   #260 <Method void RemoteViews.setTextViewText(int, CharSequence)>
		if(mBuilder.mContentText != null)
	//* 202  468:aload_0         
	//* 203  469:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//* 204  472:getfield        #263 <Field CharSequence NotificationCompat$Builder.mContentText>
	//* 205  475:ifnull          499
		{
			remoteviews.setTextViewText(android.support.a.a.d.text, mBuilder.mContentText);
	//  206  478:aload           10
	//  207  480:getstatic       #167 <Field int android.support.a.a$d.text>
	//  208  483:aload_0         
	//  209  484:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//  210  487:getfield        #263 <Field CharSequence NotificationCompat$Builder.mContentText>
	//  211  490:invokevirtual   #260 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			flag2 = true;
	//  212  493:iconst_1        
	//  213  494:istore          5
		} else
	//* 214  496:goto            502
		{
			flag2 = false;
	//  215  499:iconst_0        
	//  216  500:istore          5
		}
		if(android.os.Build.VERSION.SDK_INT < 21 && mBuilder.mLargeIcon != null)
	//* 217  502:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
	//* 218  505:bipush          21
	//* 219  507:icmpge          525
	//* 220  510:aload_0         
	//* 221  511:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//* 222  514:getfield        #216 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
	//* 223  517:ifnull          525
			i = 1;
	//  224  520:iconst_1        
	//  225  521:istore_2        
		else
	//* 226  522:goto            527
			i = 0;
	//  227  525:iconst_0        
	//  228  526:istore_2        
		if(mBuilder.mContentInfo == null) goto _L2; else goto _L1
	//  229  527:aload_0         
	//  230  528:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//  231  531:getfield        #266 <Field CharSequence NotificationCompat$Builder.mContentInfo>
	//  232  534:ifnull          575
_L1:
		Object obj;
		i = android.support.a.a.d.info;
	//  233  537:getstatic       #269 <Field int android.support.a.a$d.info>
	//  234  540:istore_2        
		obj = ((Object) (mBuilder.mContentInfo));
	//  235  541:aload_0         
	//  236  542:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//  237  545:getfield        #266 <Field CharSequence NotificationCompat$Builder.mContentInfo>
	//  238  548:astore          8
_L7:
		remoteviews.setTextViewText(i, ((CharSequence) (obj)));
	//  239  550:aload           10
	//  240  552:iload_2         
	//  241  553:aload           8
	//  242  555:invokevirtual   #260 <Method void RemoteViews.setTextViewText(int, CharSequence)>
_L5:
		remoteviews.setViewVisibility(android.support.a.a.d.info, 0);
	//  243  558:aload           10
	//  244  560:getstatic       #269 <Field int android.support.a.a$d.info>
	//  245  563:iconst_0        
	//  246  564:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
		flag2 = true;
	//  247  567:iconst_1        
	//  248  568:istore          5
		i = 1;
	//  249  570:iconst_1        
	//  250  571:istore_2        
		  goto _L3
	//* 251  572:goto            661
_L2:
		if(mBuilder.mNumber <= 0)
			break; /* Loop/switch isn't completed */
	//  252  575:aload_0         
	//  253  576:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//  254  579:getfield        #272 <Field int NotificationCompat$Builder.mNumber>
	//  255  582:ifle            651
		i = resources.getInteger(android.support.a.a.e.status_bar_notification_info_maxnum);
	//  256  585:aload           9
	//  257  587:getstatic       #277 <Field int android.support.a.a$e.status_bar_notification_info_maxnum>
	//  258  590:invokevirtual   #280 <Method int Resources.getInteger(int)>
	//  259  593:istore_2        
		if(mBuilder.mNumber > i)
	//* 260  594:aload_0         
	//* 261  595:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//* 262  598:getfield        #272 <Field int NotificationCompat$Builder.mNumber>
	//* 263  601:iload_2         
	//* 264  602:icmple          622
		{
			i = android.support.a.a.d.info;
	//  265  605:getstatic       #269 <Field int android.support.a.a$d.info>
	//  266  608:istore_2        
			obj = ((Object) (resources.getString(android.support.a.a.g.status_bar_notification_info_overflow)));
	//  267  609:aload           9
	//  268  611:getstatic       #285 <Field int android.support.a.a$g.status_bar_notification_info_overflow>
	//  269  614:invokevirtual   #289 <Method String Resources.getString(int)>
	//  270  617:astore          8
			continue; /* Loop/switch isn't completed */
	//  271  619:goto            550
		}
		obj = ((Object) (NumberFormat.getIntegerInstance()));
	//  272  622:invokestatic    #295 <Method NumberFormat NumberFormat.getIntegerInstance()>
	//  273  625:astore          8
		remoteviews.setTextViewText(android.support.a.a.d.info, ((CharSequence) (((NumberFormat) (obj)).format(mBuilder.mNumber))));
	//  274  627:aload           10
	//  275  629:getstatic       #269 <Field int android.support.a.a$d.info>
	//  276  632:aload           8
	//  277  634:aload_0         
	//  278  635:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//  279  638:getfield        #272 <Field int NotificationCompat$Builder.mNumber>
	//  280  641:i2l             
	//  281  642:invokevirtual   #299 <Method String NumberFormat.format(long)>
	//  282  645:invokevirtual   #260 <Method void RemoteViews.setTextViewText(int, CharSequence)>
		if(true) goto _L5; else goto _L4
	//  283  648:goto            558
_L4:
		remoteviews.setViewVisibility(android.support.a.a.d.info, 8);
	//  284  651:aload           10
	//  285  653:getstatic       #269 <Field int android.support.a.a$d.info>
	//  286  656:bipush          8
	//  287  658:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
_L3:
		int j1;
label0:
		{
			if(mBuilder.mSubText != null && android.os.Build.VERSION.SDK_INT >= 16)
	//* 288  661:aload_0         
	//* 289  662:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//* 290  665:getfield        #302 <Field CharSequence NotificationCompat$Builder.mSubText>
	//* 291  668:ifnull          744
	//* 292  671:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
	//* 293  674:bipush          16
	//* 294  676:icmplt          744
			{
				remoteviews.setTextViewText(android.support.a.a.d.text, mBuilder.mSubText);
	//  295  679:aload           10
	//  296  681:getstatic       #167 <Field int android.support.a.a$d.text>
	//  297  684:aload_0         
	//  298  685:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//  299  688:getfield        #302 <Field CharSequence NotificationCompat$Builder.mSubText>
	//  300  691:invokevirtual   #260 <Method void RemoteViews.setTextViewText(int, CharSequence)>
				if(mBuilder.mContentText != null)
	//* 301  694:aload_0         
	//* 302  695:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//* 303  698:getfield        #263 <Field CharSequence NotificationCompat$Builder.mContentText>
	//* 304  701:ifnull          734
				{
					remoteviews.setTextViewText(android.support.a.a.d.text2, mBuilder.mContentText);
	//  305  704:aload           10
	//  306  706:getstatic       #164 <Field int android.support.a.a$d.text2>
	//  307  709:aload_0         
	//  308  710:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//  309  713:getfield        #263 <Field CharSequence NotificationCompat$Builder.mContentText>
	//  310  716:invokevirtual   #260 <Method void RemoteViews.setTextViewText(int, CharSequence)>
					remoteviews.setViewVisibility(android.support.a.a.d.text2, 0);
	//  311  719:aload           10
	//  312  721:getstatic       #164 <Field int android.support.a.a$d.text2>
	//  313  724:iconst_0        
	//  314  725:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
					j1 = 1;
	//  315  728:iconst_1        
	//  316  729:istore          6
					break label0;
	//  317  731:goto            747
				}
				remoteviews.setViewVisibility(android.support.a.a.d.text2, 8);
	//  318  734:aload           10
	//  319  736:getstatic       #164 <Field int android.support.a.a$d.text2>
	//  320  739:bipush          8
	//  321  741:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
			}
			j1 = 0;
	//  322  744:iconst_0        
	//  323  745:istore          6
		}
		if(j1 && android.os.Build.VERSION.SDK_INT >= 16)
	//* 324  747:iload           6
	//* 325  749:ifeq            798
	//* 326  752:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
	//* 327  755:bipush          16
	//* 328  757:icmplt          798
		{
			if(flag1)
	//* 329  760:iload_3         
	//* 330  761:ifeq            786
			{
				float f = resources.getDimensionPixelSize(android.support.a.a.b.notification_subtext_size);
	//  331  764:aload           9
	//  332  766:getstatic       #305 <Field int android.support.a.a$b.notification_subtext_size>
	//  333  769:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
	//  334  772:i2f             
	//  335  773:fstore          4
				remoteviews.setTextViewTextSize(android.support.a.a.d.text, 0, f);
	//  336  775:aload           10
	//  337  777:getstatic       #167 <Field int android.support.a.a$d.text>
	//  338  780:iconst_0        
	//  339  781:fload           4
	//  340  783:invokevirtual   #309 <Method void RemoteViews.setTextViewTextSize(int, int, float)>
			}
			remoteviews.setViewPadding(android.support.a.a.d.line1, 0, 0, 0, 0);
	//  341  786:aload           10
	//  342  788:getstatic       #312 <Field int android.support.a.a$d.line1>
	//  343  791:iconst_0        
	//  344  792:iconst_0        
	//  345  793:iconst_0        
	//  346  794:iconst_0        
	//  347  795:invokevirtual   #316 <Method void RemoteViews.setViewPadding(int, int, int, int, int)>
		}
		if(mBuilder.getWhenIfShowing() != 0L)
	//* 348  798:aload_0         
	//* 349  799:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//* 350  802:invokevirtual   #320 <Method long NotificationCompat$Builder.getWhenIfShowing()>
	//* 351  805:lconst_0        
	//* 352  806:lcmp            
	//* 353  807:ifeq            907
		{
			if(mBuilder.mUseChronometer && android.os.Build.VERSION.SDK_INT >= 16)
	//* 354  810:aload_0         
	//* 355  811:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//* 356  814:getfield        #323 <Field boolean NotificationCompat$Builder.mUseChronometer>
	//* 357  817:ifeq            878
	//* 358  820:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
	//* 359  823:bipush          16
	//* 360  825:icmplt          878
			{
				remoteviews.setViewVisibility(android.support.a.a.d.chronometer, 0);
	//  361  828:aload           10
	//  362  830:getstatic       #326 <Field int android.support.a.a$d.chronometer>
	//  363  833:iconst_0        
	//  364  834:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
				remoteviews.setLong(android.support.a.a.d.chronometer, "setBase", mBuilder.getWhenIfShowing() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
	//  365  837:aload           10
	//  366  839:getstatic       #326 <Field int android.support.a.a$d.chronometer>
	//  367  842:ldc2            #328 <String "setBase">
	//  368  845:aload_0         
	//  369  846:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//  370  849:invokevirtual   #320 <Method long NotificationCompat$Builder.getWhenIfShowing()>
	//  371  852:invokestatic    #333 <Method long SystemClock.elapsedRealtime()>
	//  372  855:invokestatic    #338 <Method long System.currentTimeMillis()>
	//  373  858:lsub            
	//  374  859:ladd            
	//  375  860:invokevirtual   #342 <Method void RemoteViews.setLong(int, String, long)>
				remoteviews.setBoolean(android.support.a.a.d.chronometer, "setStarted", true);
	//  376  863:aload           10
	//  377  865:getstatic       #326 <Field int android.support.a.a$d.chronometer>
	//  378  868:ldc2            #344 <String "setStarted">
	//  379  871:iconst_1        
	//  380  872:invokevirtual   #348 <Method void RemoteViews.setBoolean(int, String, boolean)>
			} else
	//* 381  875:goto            905
			{
				remoteviews.setViewVisibility(android.support.a.a.d.time, 0);
	//  382  878:aload           10
	//  383  880:getstatic       #351 <Field int android.support.a.a$d.time>
	//  384  883:iconst_0        
	//  385  884:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
				remoteviews.setLong(android.support.a.a.d.time, "setTime", mBuilder.getWhenIfShowing());
	//  386  887:aload           10
	//  387  889:getstatic       #351 <Field int android.support.a.a$d.time>
	//  388  892:ldc2            #353 <String "setTime">
	//  389  895:aload_0         
	//  390  896:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//  391  899:invokevirtual   #320 <Method long NotificationCompat$Builder.getWhenIfShowing()>
	//  392  902:invokevirtual   #342 <Method void RemoteViews.setLong(int, String, long)>
			}
			i = 1;
	//  393  905:iconst_1        
	//  394  906:istore_2        
		}
		j1 = android.support.a.a.d.right_side;
	//  395  907:getstatic       #356 <Field int android.support.a.a$d.right_side>
	//  396  910:istore          6
		if(i != 0)
	//* 397  912:iload_2         
	//* 398  913:ifeq            921
			i = 0;
	//  399  916:iconst_0        
	//  400  917:istore_2        
		else
	//* 401  918:goto            924
			i = 8;
	//  402  921:bipush          8
	//  403  923:istore_2        
		remoteviews.setViewVisibility(j1, i);
	//  404  924:aload           10
	//  405  926:iload           6
	//  406  928:iload_2         
	//  407  929:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
		j1 = android.support.a.a.d.line3;
	//  408  932:getstatic       #359 <Field int android.support.a.a$d.line3>
	//  409  935:istore          6
		i = ((int) (byte0));
	//  410  937:iload           7
	//  411  939:istore_2        
		if(flag2)
	//* 412  940:iload           5
	//* 413  942:ifeq            947
			i = 0;
	//  414  945:iconst_0        
	//  415  946:istore_2        
		remoteviews.setViewVisibility(j1, i);
	//  416  947:aload           10
	//  417  949:iload           6
	//  418  951:iload_2         
	//  419  952:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
		return remoteviews;
	//  420  955:aload           10
	//  421  957:areturn         
		if(true) goto _L7; else goto _L6
_L6:
	}

	public Notification build()
	{
		if(mBuilder != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//*   2    4:ifnull          15
			return mBuilder.build();
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//    5   11:invokevirtual   #363 <Method Notification NotificationCompat$Builder.build()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public void buildIntoRemoteViews(RemoteViews remoteviews, RemoteViews remoteviews1)
	{
		hideNormalContent(remoteviews);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #367 <Method void hideNormalContent(RemoteViews)>
		remoteviews.removeAllViews(android.support.a.a.d.notification_main_column);
	//    3    5:aload_1         
	//    4    6:getstatic       #370 <Field int android.support.a.a$d.notification_main_column>
	//    5    9:invokevirtual   #374 <Method void RemoteViews.removeAllViews(int)>
		remoteviews.addView(android.support.a.a.d.notification_main_column, remoteviews1.clone());
	//    6   12:aload_1         
	//    7   13:getstatic       #370 <Field int android.support.a.a$d.notification_main_column>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #378 <Method RemoteViews RemoteViews.clone()>
	//   10   20:invokevirtual   #382 <Method void RemoteViews.addView(int, RemoteViews)>
		remoteviews.setViewVisibility(android.support.a.a.d.notification_main_column, 0);
	//   11   23:aload_1         
	//   12   24:getstatic       #370 <Field int android.support.a.a$d.notification_main_column>
	//   13   27:iconst_0        
	//   14   28:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  15   31:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   34:bipush          21
	//*  17   36:icmplt          53
			remoteviews.setViewPadding(android.support.a.a.d.notification_main_column_container, 0, calculateTopPadding(), 0, 0);
	//   18   39:aload_1         
	//   19   40:getstatic       #385 <Field int android.support.a.a$d.notification_main_column_container>
	//   20   43:iconst_0        
	//   21   44:aload_0         
	//   22   45:invokespecial   #387 <Method int calculateTopPadding()>
	//   23   48:iconst_0        
	//   24   49:iconst_0        
	//   25   50:invokevirtual   #316 <Method void RemoteViews.setViewPadding(int, int, int, int, int)>
	//   26   53:return          
	}

	public Bitmap createColoredBitmap(int i, int j)
	{
		return createColoredBitmap(i, j, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #141 <Method Bitmap createColoredBitmap(int, int, int)>
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
	//*   1    1:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       29
		{
			mBuilder = r;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #25  <Field NotificationCompat$Builder mBuilder>
			if(mBuilder != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//*   9   17:ifnull          29
				mBuilder.setStyle(this);
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field NotificationCompat$Builder mBuilder>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #398 <Method NotificationCompat$Builder NotificationCompat$Builder.setStyle(NotificationCompat$Style)>
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
	//    1    1:invokespecial   #18  <Method void Object()>
		mSummaryTextSet = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field boolean mSummaryTextSet>
	//    5    9:return          
	}
}
