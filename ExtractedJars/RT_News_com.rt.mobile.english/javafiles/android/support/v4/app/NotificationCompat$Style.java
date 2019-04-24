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
		int l;
		boolean flag2;
		boolean flag3;
		Resources resources;
		RemoteViews remoteviews;
		resources = mBuilder.mContext.getResources();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//    2    4:getfield        #35  <Field Context NotificationCompat$Builder.mContext>
	//    3    7:invokevirtual   #41  <Method Resources Context.getResources()>
	//    4   10:astore          9
		remoteviews = new RemoteViews(mBuilder.mContext.getPackageName(), i);
	//    5   12:new             #161 <Class RemoteViews>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//    9   20:getfield        #35  <Field Context NotificationCompat$Builder.mContext>
	//   10   23:invokevirtual   #182 <Method String Context.getPackageName()>
	//   11   26:iload_2         
	//   12   27:invokespecial   #185 <Method void RemoteViews(String, int)>
	//   13   30:astore          10
		i = mBuilder.getPriority();
	//   14   32:aload_0         
	//   15   33:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//   16   36:invokevirtual   #188 <Method int NotificationCompat$Builder.getPriority()>
	//   17   39:istore_2        
		flag3 = true;
	//   18   40:iconst_1        
	//   19   41:istore          8
		flag2 = false;
	//   20   43:iconst_0        
	//   21   44:istore          7
		if(i < -1)
	//*  22   46:iload_2         
	//*  23   47:iconst_m1       
	//*  24   48:icmpge          56
			i = 1;
	//   25   51:iconst_1        
	//   26   52:istore_2        
		else
	//*  27   53:goto            58
			i = 0;
	//   28   56:iconst_0        
	//   29   57:istore_2        
		if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT < 21)
	//*  30   58:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  31   61:bipush          16
	//*  32   63:icmplt          133
	//*  33   66:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  34   69:bipush          21
	//*  35   71:icmpge          133
			if(i != 0)
	//*  36   74:iload_2         
	//*  37   75:ifeq            107
			{
				remoteviews.setInt(android.support.compat.R.id.notification_background, "setBackgroundResource", android.support.compat.R.drawable.notification_bg_low);
	//   38   78:aload           10
	//   39   80:getstatic       #196 <Field int android.support.compat.R$id.notification_background>
	//   40   83:ldc1            #198 <String "setBackgroundResource">
	//   41   85:getstatic       #201 <Field int android.support.compat.R$drawable.notification_bg_low>
	//   42   88:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
				remoteviews.setInt(android.support.compat.R.id.icon, "setBackgroundResource", android.support.compat.R.drawable.notification_template_icon_low_bg);
	//   43   91:aload           10
	//   44   93:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//   45   96:ldc1            #198 <String "setBackgroundResource">
	//   46   98:getstatic       #211 <Field int android.support.compat.R$drawable.notification_template_icon_low_bg>
	//   47  101:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
			} else
	//*  48  104:goto            133
			{
				remoteviews.setInt(android.support.compat.R.id.notification_background, "setBackgroundResource", android.support.compat.R.drawable.notification_bg);
	//   49  107:aload           10
	//   50  109:getstatic       #196 <Field int android.support.compat.R$id.notification_background>
	//   51  112:ldc1            #198 <String "setBackgroundResource">
	//   52  114:getstatic       #214 <Field int android.support.compat.R$drawable.notification_bg>
	//   53  117:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
				remoteviews.setInt(android.support.compat.R.id.icon, "setBackgroundResource", android.support.compat.R.drawable.notification_template_icon_bg);
	//   54  120:aload           10
	//   55  122:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//   56  125:ldc1            #198 <String "setBackgroundResource">
	//   57  127:getstatic       #217 <Field int android.support.compat.R$drawable.notification_template_icon_bg>
	//   58  130:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
			}
		if(mBuilder.mLargeIcon != null)
	//*  59  133:aload_0         
	//*  60  134:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*  61  137:getfield        #221 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
	//*  62  140:ifnull          310
		{
			if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  63  143:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  64  146:bipush          16
	//*  65  148:icmplt          178
			{
				remoteviews.setViewVisibility(android.support.compat.R.id.icon, 0);
	//   66  151:aload           10
	//   67  153:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//   68  156:iconst_0        
	//   69  157:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
				remoteviews.setImageViewBitmap(android.support.compat.R.id.icon, mBuilder.mLargeIcon);
	//   70  160:aload           10
	//   71  162:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//   72  165:aload_0         
	//   73  166:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//   74  169:getfield        #221 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
	//   75  172:invokevirtual   #225 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
			} else
	//*  76  175:goto            188
			{
				remoteviews.setViewVisibility(android.support.compat.R.id.icon, 8);
	//   77  178:aload           10
	//   78  180:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//   79  183:bipush          8
	//   80  185:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
			}
			if(flag && mBuilder.mNotification.icon != 0)
	//*  81  188:iload_1         
	//*  82  189:ifeq            438
	//*  83  192:aload_0         
	//*  84  193:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*  85  196:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
	//*  86  199:getfield        #232 <Field int Notification.icon>
	//*  87  202:ifeq            438
			{
				i = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_right_icon_size);
	//   88  205:aload           9
	//   89  207:getstatic       #235 <Field int android.support.compat.R$dimen.notification_right_icon_size>
	//   90  210:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//   91  213:istore_2        
				int j = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_small_icon_background_padding);
	//   92  214:aload           9
	//   93  216:getstatic       #238 <Field int android.support.compat.R$dimen.notification_small_icon_background_padding>
	//   94  219:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//   95  222:istore          5
				if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  96  224:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//*  97  227:bipush          21
	//*  98  229:icmplt          275
				{
					Bitmap bitmap = createIconWithBackground(mBuilder.mNotification.icon, i, i - j * 2, mBuilder.getColor());
	//   99  232:aload_0         
	//  100  233:aload_0         
	//  101  234:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  102  237:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
	//  103  240:getfield        #232 <Field int Notification.icon>
	//  104  243:iload_2         
	//  105  244:iload_2         
	//  106  245:iload           5
	//  107  247:iconst_2        
	//  108  248:imul            
	//  109  249:isub            
	//  110  250:aload_0         
	//  111  251:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  112  254:invokevirtual   #241 <Method int NotificationCompat$Builder.getColor()>
	//  113  257:invokespecial   #243 <Method Bitmap createIconWithBackground(int, int, int, int)>
	//  114  260:astore          11
					remoteviews.setImageViewBitmap(android.support.compat.R.id.right_icon, bitmap);
	//  115  262:aload           10
	//  116  264:getstatic       #246 <Field int android.support.compat.R$id.right_icon>
	//  117  267:aload           11
	//  118  269:invokevirtual   #225 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
				} else
	//* 119  272:goto            298
				{
					remoteviews.setImageViewBitmap(android.support.compat.R.id.right_icon, createColoredBitmap(mBuilder.mNotification.icon, -1));
	//  120  275:aload           10
	//  121  277:getstatic       #246 <Field int android.support.compat.R$id.right_icon>
	//  122  280:aload_0         
	//  123  281:aload_0         
	//  124  282:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  125  285:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
	//  126  288:getfield        #232 <Field int Notification.icon>
	//  127  291:iconst_m1       
	//  128  292:invokevirtual   #249 <Method Bitmap createColoredBitmap(int, int)>
	//  129  295:invokevirtual   #225 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
				}
				remoteviews.setViewVisibility(android.support.compat.R.id.right_icon, 0);
	//  130  298:aload           10
	//  131  300:getstatic       #246 <Field int android.support.compat.R$id.right_icon>
	//  132  303:iconst_0        
	//  133  304:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
			}
		} else
	//* 134  307:goto            438
		if(flag && mBuilder.mNotification.icon != 0)
	//* 135  310:iload_1         
	//* 136  311:ifeq            438
	//* 137  314:aload_0         
	//* 138  315:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 139  318:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
	//* 140  321:getfield        #232 <Field int Notification.icon>
	//* 141  324:ifeq            438
		{
			remoteviews.setViewVisibility(android.support.compat.R.id.icon, 0);
	//  142  327:aload           10
	//  143  329:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//  144  332:iconst_0        
	//  145  333:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 146  336:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 147  339:bipush          21
	//* 148  341:icmplt          415
			{
				i = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_large_icon_width);
	//  149  344:aload           9
	//  150  346:getstatic       #252 <Field int android.support.compat.R$dimen.notification_large_icon_width>
	//  151  349:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//  152  352:istore_2        
				int k = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_big_circle_margin);
	//  153  353:aload           9
	//  154  355:getstatic       #255 <Field int android.support.compat.R$dimen.notification_big_circle_margin>
	//  155  358:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//  156  361:istore          5
				int i1 = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_small_icon_size_as_large);
	//  157  363:aload           9
	//  158  365:getstatic       #258 <Field int android.support.compat.R$dimen.notification_small_icon_size_as_large>
	//  159  368:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//  160  371:istore          6
				Bitmap bitmap1 = createIconWithBackground(mBuilder.mNotification.icon, i - k, i1, mBuilder.getColor());
	//  161  373:aload_0         
	//  162  374:aload_0         
	//  163  375:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  164  378:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
	//  165  381:getfield        #232 <Field int Notification.icon>
	//  166  384:iload_2         
	//  167  385:iload           5
	//  168  387:isub            
	//  169  388:iload           6
	//  170  390:aload_0         
	//  171  391:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  172  394:invokevirtual   #241 <Method int NotificationCompat$Builder.getColor()>
	//  173  397:invokespecial   #243 <Method Bitmap createIconWithBackground(int, int, int, int)>
	//  174  400:astore          11
				remoteviews.setImageViewBitmap(android.support.compat.R.id.icon, bitmap1);
	//  175  402:aload           10
	//  176  404:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//  177  407:aload           11
	//  178  409:invokevirtual   #225 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
			} else
	//* 179  412:goto            438
			{
				remoteviews.setImageViewBitmap(android.support.compat.R.id.icon, createColoredBitmap(mBuilder.mNotification.icon, -1));
	//  180  415:aload           10
	//  181  417:getstatic       #208 <Field int android.support.compat.R$id.icon>
	//  182  420:aload_0         
	//  183  421:aload_0         
	//  184  422:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  185  425:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
	//  186  428:getfield        #232 <Field int Notification.icon>
	//  187  431:iconst_m1       
	//  188  432:invokevirtual   #249 <Method Bitmap createColoredBitmap(int, int)>
	//  189  435:invokevirtual   #225 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
			}
		}
		if(mBuilder.mContentTitle != null)
	//* 190  438:aload_0         
	//* 191  439:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 192  442:getfield        #261 <Field CharSequence NotificationCompat$Builder.mContentTitle>
	//* 193  445:ifnull          463
			remoteviews.setTextViewText(android.support.compat.R.id.title, mBuilder.mContentTitle);
	//  194  448:aload           10
	//  195  450:getstatic       #159 <Field int android.support.compat.R$id.title>
	//  196  453:aload_0         
	//  197  454:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  198  457:getfield        #261 <Field CharSequence NotificationCompat$Builder.mContentTitle>
	//  199  460:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
		if(mBuilder.mContentText != null)
	//* 200  463:aload_0         
	//* 201  464:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 202  467:getfield        #268 <Field CharSequence NotificationCompat$Builder.mContentText>
	//* 203  470:ifnull          493
		{
			remoteviews.setTextViewText(android.support.compat.R.id.text, mBuilder.mContentText);
	//  204  473:aload           10
	//  205  475:getstatic       #171 <Field int android.support.compat.R$id.text>
	//  206  478:aload_0         
	//  207  479:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  208  482:getfield        #268 <Field CharSequence NotificationCompat$Builder.mContentText>
	//  209  485:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			i = 1;
	//  210  488:iconst_1        
	//  211  489:istore_2        
		} else
	//* 212  490:goto            495
		{
			i = 0;
	//  213  493:iconst_0        
	//  214  494:istore_2        
		}
		if(android.os.Build.VERSION.SDK_INT < 21 && mBuilder.mLargeIcon != null)
	//* 215  495:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 216  498:bipush          21
	//* 217  500:icmpge          519
	//* 218  503:aload_0         
	//* 219  504:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 220  507:getfield        #221 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
	//* 221  510:ifnull          519
			l = 1;
	//  222  513:iconst_1        
	//  223  514:istore          5
		else
	//* 224  516:goto            522
			l = 0;
	//  225  519:iconst_0        
	//  226  520:istore          5
		if(mBuilder.mContentInfo == null) goto _L2; else goto _L1
	//  227  522:aload_0         
	//  228  523:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  229  526:getfield        #271 <Field CharSequence NotificationCompat$Builder.mContentInfo>
	//  230  529:ifnull          564
_L1:
		remoteviews.setTextViewText(android.support.compat.R.id.info, mBuilder.mContentInfo);
	//  231  532:aload           10
	//  232  534:getstatic       #274 <Field int android.support.compat.R$id.info>
	//  233  537:aload_0         
	//  234  538:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  235  541:getfield        #271 <Field CharSequence NotificationCompat$Builder.mContentInfo>
	//  236  544:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
		remoteviews.setViewVisibility(android.support.compat.R.id.info, 0);
	//  237  547:aload           10
	//  238  549:getstatic       #274 <Field int android.support.compat.R$id.info>
	//  239  552:iconst_0        
	//  240  553:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
_L4:
		i = 1;
	//  241  556:iconst_1        
	//  242  557:istore_2        
		l = i;
	//  243  558:iload_2         
	//  244  559:istore          5
		break MISSING_BLOCK_LABEL_671;
	//  245  561:goto            671
_L2:
		if(mBuilder.mNumber <= 0)
			break; /* Loop/switch isn't completed */
	//  246  564:aload_0         
	//  247  565:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  248  568:getfield        #277 <Field int NotificationCompat$Builder.mNumber>
	//  249  571:ifle            651
		i = resources.getInteger(android.support.compat.R.integer.status_bar_notification_info_maxnum);
	//  250  574:aload           9
	//  251  576:getstatic       #282 <Field int android.support.compat.R$integer.status_bar_notification_info_maxnum>
	//  252  579:invokevirtual   #285 <Method int Resources.getInteger(int)>
	//  253  582:istore_2        
		if(mBuilder.mNumber > i)
	//* 254  583:aload_0         
	//* 255  584:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 256  587:getfield        #277 <Field int NotificationCompat$Builder.mNumber>
	//* 257  590:iload_2         
	//* 258  591:icmple          613
		{
			remoteviews.setTextViewText(android.support.compat.R.id.info, ((CharSequence) (resources.getString(android.support.compat.R.string.status_bar_notification_info_overflow))));
	//  259  594:aload           10
	//  260  596:getstatic       #274 <Field int android.support.compat.R$id.info>
	//  261  599:aload           9
	//  262  601:getstatic       #290 <Field int android.support.compat.R$string.status_bar_notification_info_overflow>
	//  263  604:invokevirtual   #294 <Method String Resources.getString(int)>
	//  264  607:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
		} else
	//* 265  610:goto            639
		{
			NumberFormat numberformat = NumberFormat.getIntegerInstance();
	//  266  613:invokestatic    #300 <Method NumberFormat NumberFormat.getIntegerInstance()>
	//  267  616:astore          11
			remoteviews.setTextViewText(android.support.compat.R.id.info, ((CharSequence) (numberformat.format(mBuilder.mNumber))));
	//  268  618:aload           10
	//  269  620:getstatic       #274 <Field int android.support.compat.R$id.info>
	//  270  623:aload           11
	//  271  625:aload_0         
	//  272  626:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  273  629:getfield        #277 <Field int NotificationCompat$Builder.mNumber>
	//  274  632:i2l             
	//  275  633:invokevirtual   #304 <Method String NumberFormat.format(long)>
	//  276  636:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
		}
		remoteviews.setViewVisibility(android.support.compat.R.id.info, 0);
	//  277  639:aload           10
	//  278  641:getstatic       #274 <Field int android.support.compat.R$id.info>
	//  279  644:iconst_0        
	//  280  645:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
		if(true) goto _L4; else goto _L3
	//  281  648:goto            556
_L3:
		remoteviews.setViewVisibility(android.support.compat.R.id.info, 8);
	//  282  651:aload           10
	//  283  653:getstatic       #274 <Field int android.support.compat.R$id.info>
	//  284  656:bipush          8
	//  285  658:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
		int j1 = l;
	//  286  661:iload           5
	//  287  663:istore          6
		l = i;
	//  288  665:iload_2         
	//  289  666:istore          5
		i = j1;
	//  290  668:iload           6
	//  291  670:istore_2        
		int k1;
label0:
		{
			if(mBuilder.mSubText != null && android.os.Build.VERSION.SDK_INT >= 16)
	//* 292  671:aload_0         
	//* 293  672:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 294  675:getfield        #307 <Field CharSequence NotificationCompat$Builder.mSubText>
	//* 295  678:ifnull          754
	//* 296  681:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 297  684:bipush          16
	//* 298  686:icmplt          754
			{
				remoteviews.setTextViewText(android.support.compat.R.id.text, mBuilder.mSubText);
	//  299  689:aload           10
	//  300  691:getstatic       #171 <Field int android.support.compat.R$id.text>
	//  301  694:aload_0         
	//  302  695:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  303  698:getfield        #307 <Field CharSequence NotificationCompat$Builder.mSubText>
	//  304  701:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
				if(mBuilder.mContentText != null)
	//* 305  704:aload_0         
	//* 306  705:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 307  708:getfield        #268 <Field CharSequence NotificationCompat$Builder.mContentText>
	//* 308  711:ifnull          744
				{
					remoteviews.setTextViewText(android.support.compat.R.id.text2, mBuilder.mContentText);
	//  309  714:aload           10
	//  310  716:getstatic       #168 <Field int android.support.compat.R$id.text2>
	//  311  719:aload_0         
	//  312  720:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  313  723:getfield        #268 <Field CharSequence NotificationCompat$Builder.mContentText>
	//  314  726:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
					remoteviews.setViewVisibility(android.support.compat.R.id.text2, 0);
	//  315  729:aload           10
	//  316  731:getstatic       #168 <Field int android.support.compat.R$id.text2>
	//  317  734:iconst_0        
	//  318  735:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
					k1 = 1;
	//  319  738:iconst_1        
	//  320  739:istore          6
					break label0;
	//  321  741:goto            757
				}
				remoteviews.setViewVisibility(android.support.compat.R.id.text2, 8);
	//  322  744:aload           10
	//  323  746:getstatic       #168 <Field int android.support.compat.R$id.text2>
	//  324  749:bipush          8
	//  325  751:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
			}
			k1 = 0;
	//  326  754:iconst_0        
	//  327  755:istore          6
		}
		if(k1 && android.os.Build.VERSION.SDK_INT >= 16)
	//* 328  757:iload           6
	//* 329  759:ifeq            808
	//* 330  762:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 331  765:bipush          16
	//* 332  767:icmplt          808
		{
			if(flag1)
	//* 333  770:iload_3         
	//* 334  771:ifeq            796
			{
				float f = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_subtext_size);
	//  335  774:aload           9
	//  336  776:getstatic       #310 <Field int android.support.compat.R$dimen.notification_subtext_size>
	//  337  779:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
	//  338  782:i2f             
	//  339  783:fstore          4
				remoteviews.setTextViewTextSize(android.support.compat.R.id.text, 0, f);
	//  340  785:aload           10
	//  341  787:getstatic       #171 <Field int android.support.compat.R$id.text>
	//  342  790:iconst_0        
	//  343  791:fload           4
	//  344  793:invokevirtual   #314 <Method void RemoteViews.setTextViewTextSize(int, int, float)>
			}
			remoteviews.setViewPadding(android.support.compat.R.id.line1, 0, 0, 0, 0);
	//  345  796:aload           10
	//  346  798:getstatic       #317 <Field int android.support.compat.R$id.line1>
	//  347  801:iconst_0        
	//  348  802:iconst_0        
	//  349  803:iconst_0        
	//  350  804:iconst_0        
	//  351  805:invokevirtual   #321 <Method void RemoteViews.setViewPadding(int, int, int, int, int)>
		}
		if(mBuilder.getWhenIfShowing() != 0L)
	//* 352  808:aload_0         
	//* 353  809:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 354  812:invokevirtual   #325 <Method long NotificationCompat$Builder.getWhenIfShowing()>
	//* 355  815:lconst_0        
	//* 356  816:lcmp            
	//* 357  817:ifeq            924
			if(mBuilder.mUseChronometer && android.os.Build.VERSION.SDK_INT >= 16)
	//* 358  820:aload_0         
	//* 359  821:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//* 360  824:getfield        #328 <Field boolean NotificationCompat$Builder.mUseChronometer>
	//* 361  827:ifeq            891
	//* 362  830:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
	//* 363  833:bipush          16
	//* 364  835:icmplt          891
			{
				remoteviews.setViewVisibility(android.support.compat.R.id.chronometer, 0);
	//  365  838:aload           10
	//  366  840:getstatic       #331 <Field int android.support.compat.R$id.chronometer>
	//  367  843:iconst_0        
	//  368  844:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
				remoteviews.setLong(android.support.compat.R.id.chronometer, "setBase", mBuilder.getWhenIfShowing() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
	//  369  847:aload           10
	//  370  849:getstatic       #331 <Field int android.support.compat.R$id.chronometer>
	//  371  852:ldc2            #333 <String "setBase">
	//  372  855:aload_0         
	//  373  856:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  374  859:invokevirtual   #325 <Method long NotificationCompat$Builder.getWhenIfShowing()>
	//  375  862:invokestatic    #338 <Method long SystemClock.elapsedRealtime()>
	//  376  865:invokestatic    #343 <Method long System.currentTimeMillis()>
	//  377  868:lsub            
	//  378  869:ladd            
	//  379  870:invokevirtual   #347 <Method void RemoteViews.setLong(int, String, long)>
				remoteviews.setBoolean(android.support.compat.R.id.chronometer, "setStarted", true);
	//  380  873:aload           10
	//  381  875:getstatic       #331 <Field int android.support.compat.R$id.chronometer>
	//  382  878:ldc2            #349 <String "setStarted">
	//  383  881:iconst_1        
	//  384  882:invokevirtual   #353 <Method void RemoteViews.setBoolean(int, String, boolean)>
				i = ((int) (flag3));
	//  385  885:iload           8
	//  386  887:istore_2        
			} else
	//* 387  888:goto            924
			{
				remoteviews.setViewVisibility(android.support.compat.R.id.time, 0);
	//  388  891:aload           10
	//  389  893:getstatic       #356 <Field int android.support.compat.R$id.time>
	//  390  896:iconst_0        
	//  391  897:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
				remoteviews.setLong(android.support.compat.R.id.time, "setTime", mBuilder.getWhenIfShowing());
	//  392  900:aload           10
	//  393  902:getstatic       #356 <Field int android.support.compat.R$id.time>
	//  394  905:ldc2            #358 <String "setTime">
	//  395  908:aload_0         
	//  396  909:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//  397  912:invokevirtual   #325 <Method long NotificationCompat$Builder.getWhenIfShowing()>
	//  398  915:invokevirtual   #347 <Method void RemoteViews.setLong(int, String, long)>
				i = ((int) (flag3));
	//  399  918:iload           8
	//  400  920:istore_2        
			}
	//* 401  921:goto            924
		k1 = android.support.compat.R.id.right_side;
	//  402  924:getstatic       #361 <Field int android.support.compat.R$id.right_side>
	//  403  927:istore          6
		if(i != 0)
	//* 404  929:iload_2         
	//* 405  930:ifeq            938
			i = 0;
	//  406  933:iconst_0        
	//  407  934:istore_2        
		else
	//* 408  935:goto            941
			i = 8;
	//  409  938:bipush          8
	//  410  940:istore_2        
		remoteviews.setViewVisibility(k1, i);
	//  411  941:aload           10
	//  412  943:iload           6
	//  413  945:iload_2         
	//  414  946:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
		k1 = android.support.compat.R.id.line3;
	//  415  949:getstatic       #364 <Field int android.support.compat.R$id.line3>
	//  416  952:istore          6
		if(l != 0)
	//* 417  954:iload           5
	//* 418  956:ifeq            965
			i = ((int) (flag2));
	//  419  959:iload           7
	//  420  961:istore_2        
		else
	//* 421  962:goto            968
			i = 8;
	//  422  965:bipush          8
	//  423  967:istore_2        
		remoteviews.setViewVisibility(k1, i);
	//  424  968:aload           10
	//  425  970:iload           6
	//  426  972:iload_2         
	//  427  973:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
		return remoteviews;
	//  428  976:aload           10
	//  429  978:areturn         
	}

	public Notification build()
	{
		if(mBuilder != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//*   2    4:ifnull          15
			return mBuilder.build();
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field NotificationCompat$Builder mBuilder>
	//    5   11:invokevirtual   #368 <Method Notification NotificationCompat$Builder.build()>
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
