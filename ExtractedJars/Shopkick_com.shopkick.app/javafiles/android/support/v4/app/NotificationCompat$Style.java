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
	//    1    1:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//    2    4:getfield        #35  <Field Context NotificationCompat$Builder.mContext>
	//    3    7:invokevirtual   #41  <Method Resources Context.getResources()>
	//    4   10:iload_1         
	//    5   11:invokevirtual   #84  <Method Drawable Resources.getDrawable(int)>
	//    6   14:astore          5
		if(k == 0)
	//*   7   16:iload_3         
	//*   8   17:ifne            29
			i = drawable.getIntrinsicWidth();
	//    9   20:aload           5
	//   10   22:invokevirtual   #89  <Method int Drawable.getIntrinsicWidth()>
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
	//   20   40:invokevirtual   #92  <Method int Drawable.getIntrinsicHeight()>
	//   21   43:istore          4
		Bitmap bitmap = Bitmap.createBitmap(i, l, android.graphics.Bitmap.Config.ARGB_8888);
	//   22   45:iload_1         
	//   23   46:iload           4
	//   24   48:getstatic       #98  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   25   51:invokestatic    #104 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   26   54:astore          6
		drawable.setBounds(0, 0, i, l);
	//   27   56:aload           5
	//   28   58:iconst_0        
	//   29   59:iconst_0        
	//   30   60:iload_1         
	//   31   61:iload           4
	//   32   63:invokevirtual   #108 <Method void Drawable.setBounds(int, int, int, int)>
		if(j != 0)
	//*  33   66:iload_2         
	//*  34   67:ifeq            89
			drawable.mutate().setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(j, android.graphics.PorterDuff.Mode.SRC_IN))));
	//   35   70:aload           5
	//   36   72:invokevirtual   #112 <Method Drawable Drawable.mutate()>
	//   37   75:new             #114 <Class PorterDuffColorFilter>
	//   38   78:dup             
	//   39   79:iload_2         
	//   40   80:getstatic       #120 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   41   83:invokespecial   #123 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   42   86:invokevirtual   #127 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
		drawable.draw(new Canvas(bitmap));
	//   43   89:aload           5
	//   44   91:new             #129 <Class Canvas>
	//   45   94:dup             
	//   46   95:aload           6
	//   47   97:invokespecial   #132 <Method void Canvas(Bitmap)>
	//   48  100:invokevirtual   #136 <Method void Drawable.draw(Canvas)>
		return bitmap;
	//   49  103:aload           6
	//   50  105:areturn         
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
		boolean flag2;
		int i1;
		boolean flag3;
		Resources resources;
		RemoteViews remoteviews;
label0:
		{
			resources = mBuilder.mContext.getResources();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//    2    4:getfield        #35  <Field Context NotificationCompat$Builder.mContext>
	//    3    7:invokevirtual   #41  <Method Resources Context.getResources()>
	//    4   10:astore          8
			remoteviews = new RemoteViews(mBuilder.mContext.getPackageName(), i);
	//    5   12:new             #161 <Class RemoteViews>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//    9   20:getfield        #35  <Field Context NotificationCompat$Builder.mContext>
	//   10   23:invokevirtual   #182 <Method String Context.getPackageName()>
	//   11   26:iload_2         
	//   12   27:invokespecial   #185 <Method void RemoteViews(String, int)>
	//   13   30:astore          9
			i = mBuilder.getPriority();
	//   14   32:aload_0         
	//   15   33:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//   16   36:invokevirtual   #188 <Method int NotificationCompat$Builder.getPriority()>
	//   17   39:istore_2        
			flag3 = false;
	//   18   40:iconst_0        
	//   19   41:istore          7
			if(i < -1)
	//*  20   43:iload_2         
	//*  21   44:iconst_m1       
	//*  22   45:icmpge          53
				i = 1;
	//   23   48:iconst_1        
	//   24   49:istore_2        
			else
	//*  25   50:goto            55
				i = 0;
	//   26   53:iconst_0        
	//   27   54:istore_2        
			if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT < 21)
	//*  28   55:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  29   58:bipush          16
	//*  30   60:icmplt          130
	//*  31   63:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  32   66:bipush          21
	//*  33   68:icmpge          130
				if(i != 0)
	//*  34   71:iload_2         
	//*  35   72:ifeq            104
				{
					remoteviews.setInt(android.support.compat.R.id.notification_background, "setBackgroundResource", android.support.compat.R.drawable.notification_bg_low);
	//   36   75:aload           9
	//   37   77:getstatic       #196 <Field int android.support.compat.R$id.notification_background>
	//   38   80:ldc1            #198 <String "setBackgroundResource">
	//   39   82:getstatic       #201 <Field int android.support.compat.R$drawable.notification_bg_low>
	//   40   85:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
					remoteviews.setInt(android.support.compat.R.id.icon, "setBackgroundResource", android.support.compat.R.drawable.notification_template_icon_low_bg);
	//   41   88:aload           9
	//   42   90:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//   43   93:ldc1            #198 <String "setBackgroundResource">
	//   44   95:getstatic       #211 <Field int android.support.compat.R$drawable.notification_template_icon_low_bg>
	//   45   98:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
				} else
	//*  46  101:goto            130
				{
					remoteviews.setInt(android.support.compat.R.id.notification_background, "setBackgroundResource", android.support.compat.R.drawable.notification_bg);
	//   47  104:aload           9
	//   48  106:getstatic       #196 <Field int android.support.compat.R$id.notification_background>
	//   49  109:ldc1            #198 <String "setBackgroundResource">
	//   50  111:getstatic       #214 <Field int android.support.compat.R$drawable.notification_bg>
	//   51  114:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
					remoteviews.setInt(android.support.compat.R.id.icon, "setBackgroundResource", android.support.compat.R.drawable.notification_template_icon_bg);
	//   52  117:aload           9
	//   53  119:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//   54  122:ldc1            #198 <String "setBackgroundResource">
	//   55  124:getstatic       #217 <Field int android.support.compat.R$drawable.notification_template_icon_bg>
	//   56  127:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
				}
			if(mBuilder.mLargeIcon != null)
	//*  57  130:aload_0         
	//*  58  131:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*  59  134:getfield        #221 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
	//*  60  137:ifnull          307
			{
				if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  61  140:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  62  143:bipush          16
	//*  63  145:icmplt          175
				{
					remoteviews.setViewVisibility(android.support.compat.R.id.icon, 0);
	//   64  148:aload           9
	//   65  150:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//   66  153:iconst_0        
	//   67  154:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
					remoteviews.setImageViewBitmap(android.support.compat.R.id.icon, mBuilder.mLargeIcon);
	//   68  157:aload           9
	//   69  159:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//   70  162:aload_0         
	//   71  163:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//   72  166:getfield        #221 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
	//   73  169:invokevirtual   #225 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
				} else
	//*  74  172:goto            185
				{
					remoteviews.setViewVisibility(android.support.compat.R.id.icon, 8);
	//   75  175:aload           9
	//   76  177:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//   77  180:bipush          8
	//   78  182:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
				}
				if(flag && mBuilder.mNotification.icon != 0)
	//*  79  185:iload_1         
	//*  80  186:ifeq            435
	//*  81  189:aload_0         
	//*  82  190:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*  83  193:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
	//*  84  196:getfield        #232 <Field int Notification.icon>
	//*  85  199:ifeq            435
				{
					i = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_right_icon_size);
	//   86  202:aload           8
	//   87  204:getstatic       #235 <Field int android.support.compat.R$dimen.notification_right_icon_size>
	//   88  207:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//   89  210:istore_2        
					int j = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_small_icon_background_padding);
	//   90  211:aload           8
	//   91  213:getstatic       #238 <Field int android.support.compat.R$dimen.notification_small_icon_background_padding>
	//   92  216:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//   93  219:istore          5
					if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  94  221:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  95  224:bipush          21
	//*  96  226:icmplt          272
					{
						Bitmap bitmap = createIconWithBackground(mBuilder.mNotification.icon, i, i - j * 2, mBuilder.getColor());
	//   97  229:aload_0         
	//   98  230:aload_0         
	//   99  231:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  100  234:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
	//  101  237:getfield        #232 <Field int Notification.icon>
	//  102  240:iload_2         
	//  103  241:iload_2         
	//  104  242:iload           5
	//  105  244:iconst_2        
	//  106  245:imul            
	//  107  246:isub            
	//  108  247:aload_0         
	//  109  248:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  110  251:invokevirtual   #241 <Method int NotificationCompat$Builder.getColor()>
	//  111  254:invokespecial   #243 <Method Bitmap createIconWithBackground(int, int, int, int)>
	//  112  257:astore          10
						remoteviews.setImageViewBitmap(android.support.compat.R.id.right_icon, bitmap);
	//  113  259:aload           9
	//  114  261:getstatic       #246 <Field int android.support.compat.R$id.right_icon>
	//  115  264:aload           10
	//  116  266:invokevirtual   #225 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
					} else
	//* 117  269:goto            295
					{
						remoteviews.setImageViewBitmap(android.support.compat.R.id.right_icon, createColoredBitmap(mBuilder.mNotification.icon, -1));
	//  118  272:aload           9
	//  119  274:getstatic       #246 <Field int android.support.compat.R$id.right_icon>
	//  120  277:aload_0         
	//  121  278:aload_0         
	//  122  279:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  123  282:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
	//  124  285:getfield        #232 <Field int Notification.icon>
	//  125  288:iconst_m1       
	//  126  289:invokevirtual   #249 <Method Bitmap createColoredBitmap(int, int)>
	//  127  292:invokevirtual   #225 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
					}
					remoteviews.setViewVisibility(android.support.compat.R.id.right_icon, 0);
	//  128  295:aload           9
	//  129  297:getstatic       #246 <Field int android.support.compat.R$id.right_icon>
	//  130  300:iconst_0        
	//  131  301:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
				}
			} else
	//* 132  304:goto            435
			if(flag && mBuilder.mNotification.icon != 0)
	//* 133  307:iload_1         
	//* 134  308:ifeq            435
	//* 135  311:aload_0         
	//* 136  312:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 137  315:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
	//* 138  318:getfield        #232 <Field int Notification.icon>
	//* 139  321:ifeq            435
			{
				remoteviews.setViewVisibility(android.support.compat.R.id.icon, 0);
	//  140  324:aload           9
	//  141  326:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//  142  329:iconst_0        
	//  143  330:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
				if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 144  333:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 145  336:bipush          21
	//* 146  338:icmplt          412
				{
					i = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_large_icon_width);
	//  147  341:aload           8
	//  148  343:getstatic       #252 <Field int android.support.compat.R$dimen.notification_large_icon_width>
	//  149  346:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//  150  349:istore_2        
					int k = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_big_circle_margin);
	//  151  350:aload           8
	//  152  352:getstatic       #255 <Field int android.support.compat.R$dimen.notification_big_circle_margin>
	//  153  355:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//  154  358:istore          5
					int l = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_small_icon_size_as_large);
	//  155  360:aload           8
	//  156  362:getstatic       #258 <Field int android.support.compat.R$dimen.notification_small_icon_size_as_large>
	//  157  365:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//  158  368:istore          6
					Bitmap bitmap1 = createIconWithBackground(mBuilder.mNotification.icon, i - k, l, mBuilder.getColor());
	//  159  370:aload_0         
	//  160  371:aload_0         
	//  161  372:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  162  375:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
	//  163  378:getfield        #232 <Field int Notification.icon>
	//  164  381:iload_2         
	//  165  382:iload           5
	//  166  384:isub            
	//  167  385:iload           6
	//  168  387:aload_0         
	//  169  388:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  170  391:invokevirtual   #241 <Method int NotificationCompat$Builder.getColor()>
	//  171  394:invokespecial   #243 <Method Bitmap createIconWithBackground(int, int, int, int)>
	//  172  397:astore          10
					remoteviews.setImageViewBitmap(android.support.compat.R.id.icon, bitmap1);
	//  173  399:aload           9
	//  174  401:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//  175  404:aload           10
	//  176  406:invokevirtual   #225 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
				} else
	//* 177  409:goto            435
				{
					remoteviews.setImageViewBitmap(android.support.compat.R.id.icon, createColoredBitmap(mBuilder.mNotification.icon, -1));
	//  178  412:aload           9
	//  179  414:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//  180  417:aload_0         
	//  181  418:aload_0         
	//  182  419:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  183  422:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
	//  184  425:getfield        #232 <Field int Notification.icon>
	//  185  428:iconst_m1       
	//  186  429:invokevirtual   #249 <Method Bitmap createColoredBitmap(int, int)>
	//  187  432:invokevirtual   #225 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
				}
			}
			if(mBuilder.mContentTitle != null)
	//* 188  435:aload_0         
	//* 189  436:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 190  439:getfield        #261 <Field CharSequence NotificationCompat$Builder.mContentTitle>
	//* 191  442:ifnull          460
				remoteviews.setTextViewText(android.support.compat.R.id.title, mBuilder.mContentTitle);
	//  192  445:aload           9
	//  193  447:getstatic       #159 <Field int android.support.compat.R$id.title>
	//  194  450:aload_0         
	//  195  451:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  196  454:getfield        #261 <Field CharSequence NotificationCompat$Builder.mContentTitle>
	//  197  457:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			if(mBuilder.mContentText != null)
	//* 198  460:aload_0         
	//* 199  461:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 200  464:getfield        #268 <Field CharSequence NotificationCompat$Builder.mContentText>
	//* 201  467:ifnull          491
			{
				remoteviews.setTextViewText(android.support.compat.R.id.text, mBuilder.mContentText);
	//  202  470:aload           9
	//  203  472:getstatic       #171 <Field int android.support.compat.R$id.text>
	//  204  475:aload_0         
	//  205  476:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  206  479:getfield        #268 <Field CharSequence NotificationCompat$Builder.mContentText>
	//  207  482:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
				flag2 = true;
	//  208  485:iconst_1        
	//  209  486:istore          5
			} else
	//* 210  488:goto            494
			{
				flag2 = false;
	//  211  491:iconst_0        
	//  212  492:istore          5
			}
			if(android.os.Build.VERSION.SDK_INT < 21 && mBuilder.mLargeIcon != null)
	//* 213  494:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 214  497:bipush          21
	//* 215  499:icmpge          517
	//* 216  502:aload_0         
	//* 217  503:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 218  506:getfield        #221 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
	//* 219  509:ifnull          517
				i = 1;
	//  220  512:iconst_1        
	//  221  513:istore_2        
			else
	//* 222  514:goto            519
				i = 0;
	//  223  517:iconst_0        
	//  224  518:istore_2        
			if(mBuilder.mContentInfo != null)
	//* 225  519:aload_0         
	//* 226  520:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 227  523:getfield        #271 <Field CharSequence NotificationCompat$Builder.mContentInfo>
	//* 228  526:ifnull          562
			{
				remoteviews.setTextViewText(android.support.compat.R.id.info, mBuilder.mContentInfo);
	//  229  529:aload           9
	//  230  531:getstatic       #274 <Field int android.support.compat.R$id.info>
	//  231  534:aload_0         
	//  232  535:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  233  538:getfield        #271 <Field CharSequence NotificationCompat$Builder.mContentInfo>
	//  234  541:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
				remoteviews.setViewVisibility(android.support.compat.R.id.info, 0);
	//  235  544:aload           9
	//  236  546:getstatic       #274 <Field int android.support.compat.R$id.info>
	//  237  549:iconst_0        
	//  238  550:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
				flag2 = true;
	//  239  553:iconst_1        
	//  240  554:istore          5
				i = ((int) (flag2));
	//  241  556:iload           5
	//  242  558:istore_2        
			} else
	//* 243  559:goto            665
			if(mBuilder.mNumber > 0)
	//* 244  562:aload_0         
	//* 245  563:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 246  566:getfield        #277 <Field int NotificationCompat$Builder.mNumber>
	//* 247  569:ifle            655
			{
				i = resources.getInteger(android.support.compat.R.integer.status_bar_notification_info_maxnum);
	//  248  572:aload           8
	//  249  574:getstatic       #282 <Field int android.support.compat.R$integer.status_bar_notification_info_maxnum>
	//  250  577:invokevirtual   #285 <Method int Resources.getInteger(int)>
	//  251  580:istore_2        
				if(mBuilder.mNumber > i)
	//* 252  581:aload_0         
	//* 253  582:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 254  585:getfield        #277 <Field int NotificationCompat$Builder.mNumber>
	//* 255  588:iload_2         
	//* 256  589:icmple          611
				{
					remoteviews.setTextViewText(android.support.compat.R.id.info, ((CharSequence) (resources.getString(android.support.compat.R.string.status_bar_notification_info_overflow))));
	//  257  592:aload           9
	//  258  594:getstatic       #274 <Field int android.support.compat.R$id.info>
	//  259  597:aload           8
	//  260  599:getstatic       #290 <Field int android.support.compat.R$string.status_bar_notification_info_overflow>
	//  261  602:invokevirtual   #294 <Method String Resources.getString(int)>
	//  262  605:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
				} else
	//* 263  608:goto            637
				{
					NumberFormat numberformat = NumberFormat.getIntegerInstance();
	//  264  611:invokestatic    #300 <Method NumberFormat NumberFormat.getIntegerInstance()>
	//  265  614:astore          10
					remoteviews.setTextViewText(android.support.compat.R.id.info, ((CharSequence) (numberformat.format(mBuilder.mNumber))));
	//  266  616:aload           9
	//  267  618:getstatic       #274 <Field int android.support.compat.R$id.info>
	//  268  621:aload           10
	//  269  623:aload_0         
	//  270  624:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  271  627:getfield        #277 <Field int NotificationCompat$Builder.mNumber>
	//  272  630:i2l             
	//  273  631:invokevirtual   #304 <Method String NumberFormat.format(long)>
	//  274  634:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
				}
				remoteviews.setViewVisibility(android.support.compat.R.id.info, 0);
	//  275  637:aload           9
	//  276  639:getstatic       #274 <Field int android.support.compat.R$id.info>
	//  277  642:iconst_0        
	//  278  643:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
				flag2 = true;
	//  279  646:iconst_1        
	//  280  647:istore          5
				i = ((int) (flag2));
	//  281  649:iload           5
	//  282  651:istore_2        
			} else
	//* 283  652:goto            665
			{
				remoteviews.setViewVisibility(android.support.compat.R.id.info, 8);
	//  284  655:aload           9
	//  285  657:getstatic       #274 <Field int android.support.compat.R$id.info>
	//  286  660:bipush          8
	//  287  662:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
			}
			if(mBuilder.mSubText != null && android.os.Build.VERSION.SDK_INT >= 16)
	//* 288  665:aload_0         
	//* 289  666:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 290  669:getfield        #307 <Field CharSequence NotificationCompat$Builder.mSubText>
	//* 291  672:ifnull          748
	//* 292  675:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 293  678:bipush          16
	//* 294  680:icmplt          748
			{
				remoteviews.setTextViewText(android.support.compat.R.id.text, mBuilder.mSubText);
	//  295  683:aload           9
	//  296  685:getstatic       #171 <Field int android.support.compat.R$id.text>
	//  297  688:aload_0         
	//  298  689:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  299  692:getfield        #307 <Field CharSequence NotificationCompat$Builder.mSubText>
	//  300  695:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
				if(mBuilder.mContentText != null)
	//* 301  698:aload_0         
	//* 302  699:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 303  702:getfield        #268 <Field CharSequence NotificationCompat$Builder.mContentText>
	//* 304  705:ifnull          738
				{
					remoteviews.setTextViewText(android.support.compat.R.id.text2, mBuilder.mContentText);
	//  305  708:aload           9
	//  306  710:getstatic       #168 <Field int android.support.compat.R$id.text2>
	//  307  713:aload_0         
	//  308  714:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  309  717:getfield        #268 <Field CharSequence NotificationCompat$Builder.mContentText>
	//  310  720:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
					remoteviews.setViewVisibility(android.support.compat.R.id.text2, 0);
	//  311  723:aload           9
	//  312  725:getstatic       #168 <Field int android.support.compat.R$id.text2>
	//  313  728:iconst_0        
	//  314  729:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
					i1 = 1;
	//  315  732:iconst_1        
	//  316  733:istore          6
					break label0;
	//  317  735:goto            751
				}
				remoteviews.setViewVisibility(android.support.compat.R.id.text2, 8);
	//  318  738:aload           9
	//  319  740:getstatic       #168 <Field int android.support.compat.R$id.text2>
	//  320  743:bipush          8
	//  321  745:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
			}
			i1 = 0;
	//  322  748:iconst_0        
	//  323  749:istore          6
		}
		if(i1 && android.os.Build.VERSION.SDK_INT >= 16)
	//* 324  751:iload           6
	//* 325  753:ifeq            802
	//* 326  756:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 327  759:bipush          16
	//* 328  761:icmplt          802
		{
			if(flag1)
	//* 329  764:iload_3         
	//* 330  765:ifeq            790
			{
				float f = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_subtext_size);
	//  331  768:aload           8
	//  332  770:getstatic       #310 <Field int android.support.compat.R$dimen.notification_subtext_size>
	//  333  773:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//  334  776:i2f             
	//  335  777:fstore          4
				remoteviews.setTextViewTextSize(android.support.compat.R.id.text, 0, f);
	//  336  779:aload           9
	//  337  781:getstatic       #171 <Field int android.support.compat.R$id.text>
	//  338  784:iconst_0        
	//  339  785:fload           4
	//  340  787:invokevirtual   #314 <Method void RemoteViews.setTextViewTextSize(int, int, float)>
			}
			remoteviews.setViewPadding(android.support.compat.R.id.line1, 0, 0, 0, 0);
	//  341  790:aload           9
	//  342  792:getstatic       #317 <Field int android.support.compat.R$id.line1>
	//  343  795:iconst_0        
	//  344  796:iconst_0        
	//  345  797:iconst_0        
	//  346  798:iconst_0        
	//  347  799:invokevirtual   #321 <Method void RemoteViews.setViewPadding(int, int, int, int, int)>
		}
		if(mBuilder.getWhenIfShowing() != 0L)
	//* 348  802:aload_0         
	//* 349  803:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 350  806:invokevirtual   #325 <Method long NotificationCompat$Builder.getWhenIfShowing()>
	//* 351  809:lconst_0        
	//* 352  810:lcmp            
	//* 353  811:ifeq            911
		{
			if(mBuilder.mUseChronometer && android.os.Build.VERSION.SDK_INT >= 16)
	//* 354  814:aload_0         
	//* 355  815:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 356  818:getfield        #328 <Field boolean NotificationCompat$Builder.mUseChronometer>
	//* 357  821:ifeq            882
	//* 358  824:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 359  827:bipush          16
	//* 360  829:icmplt          882
			{
				remoteviews.setViewVisibility(android.support.compat.R.id.chronometer, 0);
	//  361  832:aload           9
	//  362  834:getstatic       #331 <Field int android.support.compat.R$id.chronometer>
	//  363  837:iconst_0        
	//  364  838:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
				remoteviews.setLong(android.support.compat.R.id.chronometer, "setBase", mBuilder.getWhenIfShowing() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
	//  365  841:aload           9
	//  366  843:getstatic       #331 <Field int android.support.compat.R$id.chronometer>
	//  367  846:ldc2            #333 <String "setBase">
	//  368  849:aload_0         
	//  369  850:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  370  853:invokevirtual   #325 <Method long NotificationCompat$Builder.getWhenIfShowing()>
	//  371  856:invokestatic    #338 <Method long SystemClock.elapsedRealtime()>
	//  372  859:invokestatic    #343 <Method long System.currentTimeMillis()>
	//  373  862:lsub            
	//  374  863:ladd            
	//  375  864:invokevirtual   #347 <Method void RemoteViews.setLong(int, String, long)>
				remoteviews.setBoolean(android.support.compat.R.id.chronometer, "setStarted", true);
	//  376  867:aload           9
	//  377  869:getstatic       #331 <Field int android.support.compat.R$id.chronometer>
	//  378  872:ldc2            #349 <String "setStarted">
	//  379  875:iconst_1        
	//  380  876:invokevirtual   #353 <Method void RemoteViews.setBoolean(int, String, boolean)>
			} else
	//* 381  879:goto            909
			{
				remoteviews.setViewVisibility(android.support.compat.R.id.time, 0);
	//  382  882:aload           9
	//  383  884:getstatic       #356 <Field int android.support.compat.R$id.time>
	//  384  887:iconst_0        
	//  385  888:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
				remoteviews.setLong(android.support.compat.R.id.time, "setTime", mBuilder.getWhenIfShowing());
	//  386  891:aload           9
	//  387  893:getstatic       #356 <Field int android.support.compat.R$id.time>
	//  388  896:ldc2            #358 <String "setTime">
	//  389  899:aload_0         
	//  390  900:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  391  903:invokevirtual   #325 <Method long NotificationCompat$Builder.getWhenIfShowing()>
	//  392  906:invokevirtual   #347 <Method void RemoteViews.setLong(int, String, long)>
			}
			i = 1;
	//  393  909:iconst_1        
	//  394  910:istore_2        
		}
		i1 = android.support.compat.R.id.right_side;
	//  395  911:getstatic       #361 <Field int android.support.compat.R$id.right_side>
	//  396  914:istore          6
		if(i != 0)
	//* 397  916:iload_2         
	//* 398  917:ifeq            925
			i = 0;
	//  399  920:iconst_0        
	//  400  921:istore_2        
		else
	//* 401  922:goto            928
			i = 8;
	//  402  925:bipush          8
	//  403  927:istore_2        
		remoteviews.setViewVisibility(i1, i);
	//  404  928:aload           9
	//  405  930:iload           6
	//  406  932:iload_2         
	//  407  933:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
		i1 = android.support.compat.R.id.line3;
	//  408  936:getstatic       #364 <Field int android.support.compat.R$id.line3>
	//  409  939:istore          6
		if(flag2)
	//* 410  941:iload           5
	//* 411  943:ifeq            952
			i = ((int) (flag3));
	//  412  946:iload           7
	//  413  948:istore_2        
		else
	//* 414  949:goto            955
			i = 8;
	//  415  952:bipush          8
	//  416  954:istore_2        
		remoteviews.setViewVisibility(i1, i);
	//  417  955:aload           9
	//  418  957:iload           6
	//  419  959:iload_2         
	//  420  960:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
		return remoteviews;
	//  421  963:aload           9
	//  422  965:areturn         
	}

	public Notification build()
	{
		r r = mBuilder;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//    2    4:astore_1        
		if(r != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return r.build();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #368 <Method Notification NotificationCompat$Builder.build()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
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
	//   25   50:invokevirtual   #321 <Method void RemoteViews.setViewPadding(int, int, int, int, int)>
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
	//*   3    5:if_acmpeq       28
		{
			mBuilder = r;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #29  <Field NotificationCompat$Builder mBuilder>
			r = mBuilder;
	//    7   13:aload_0         
	//    8   14:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//    9   17:astore_1        
			if(r != null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          28
				r.setStyle(this);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #403 <Method NotificationCompat$Builder NotificationCompat$Builder.setStyle(NotificationCompat$Style)>
	//   15   27:pop             
		}
	//   16   28:return          
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
