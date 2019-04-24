// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;
import android.content.res.Resources;
import android.widget.RemoteViews;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, NotificationBuilderWithBuilderAccessor

public static class NotificationCompat$DecoratedCustomViewStyle extends NotificationCompat.Style
{

	private RemoteViews createRemoteViews(RemoteViews remoteviews, boolean flag)
	{
		boolean flag1;
		boolean flag2;
		RemoteViews remoteviews1;
label0:
		{
			int i = android.support.compat.R.layout.notification_template_custom_big;
	//    0    0:getstatic       #22  <Field int android.support.compat.R$layout.notification_template_custom_big>
	//    1    3:istore_3        
			boolean flag3 = true;
	//    2    4:iconst_1        
	//    3    5:istore          6
			flag2 = false;
	//    4    7:iconst_0        
	//    5    8:istore          5
			remoteviews1 = applyStandardTemplate(true, i, false);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:iload_3         
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #26  <Method RemoteViews applyStandardTemplate(boolean, int, boolean)>
	//   11   17:astore          8
			remoteviews1.removeAllViews(android.support.compat.R.id.actions);
	//   12   19:aload           8
	//   13   21:getstatic       #31  <Field int android.support.compat.R$id.actions>
	//   14   24:invokevirtual   #37  <Method void RemoteViews.removeAllViews(int)>
			if(flag && mBuilder.mActions != null)
	//*  15   27:iload_2         
	//*  16   28:ifeq            111
	//*  17   31:aload_0         
	//*  18   32:getfield        #41  <Field NotificationCompat$Builder mBuilder>
	//*  19   35:getfield        #47  <Field ArrayList NotificationCompat$Builder.mActions>
	//*  20   38:ifnull          111
			{
				int k = Math.min(mBuilder.mActions.size(), 3);
	//   21   41:aload_0         
	//   22   42:getfield        #41  <Field NotificationCompat$Builder mBuilder>
	//   23   45:getfield        #47  <Field ArrayList NotificationCompat$Builder.mActions>
	//   24   48:invokevirtual   #53  <Method int ArrayList.size()>
	//   25   51:iconst_3        
	//   26   52:invokestatic    #59  <Method int Math.min(int, int)>
	//   27   55:istore          7
				if(k > 0)
	//*  28   57:iload           7
	//*  29   59:ifle            111
				{
					int j = 0;
	//   30   62:iconst_0        
	//   31   63:istore_3        
					do
					{
						flag1 = flag3;
	//   32   64:iload           6
	//   33   66:istore          4
						if(j >= k)
							break;
	//   34   68:iload_3         
	//   35   69:iload           7
	//   36   71:icmpge          114
						RemoteViews remoteviews2 = generateActionButton((NotificationCompat.Action)mBuilder.mActions.get(j));
	//   37   74:aload_0         
	//   38   75:aload_0         
	//   39   76:getfield        #41  <Field NotificationCompat$Builder mBuilder>
	//   40   79:getfield        #47  <Field ArrayList NotificationCompat$Builder.mActions>
	//   41   82:iload_3         
	//   42   83:invokevirtual   #63  <Method Object ArrayList.get(int)>
	//   43   86:checkcast       #65  <Class NotificationCompat$Action>
	//   44   89:invokespecial   #69  <Method RemoteViews generateActionButton(NotificationCompat$Action)>
	//   45   92:astore          9
						remoteviews1.addView(android.support.compat.R.id.actions, remoteviews2);
	//   46   94:aload           8
	//   47   96:getstatic       #31  <Field int android.support.compat.R$id.actions>
	//   48   99:aload           9
	//   49  101:invokevirtual   #73  <Method void RemoteViews.addView(int, RemoteViews)>
						j++;
	//   50  104:iload_3         
	//   51  105:iconst_1        
	//   52  106:iadd            
	//   53  107:istore_3        
					} while(true);
	//   54  108:goto            64
					break label0;
				}
			}
			flag1 = false;
	//   55  111:iconst_0        
	//   56  112:istore          4
		}
		byte byte0;
		if(flag1)
	//*  57  114:iload           4
	//*  58  116:ifeq            125
			byte0 = ((byte) (flag2));
	//   59  119:iload           5
	//   60  121:istore_3        
		else
	//*  61  122:goto            128
			byte0 = 8;
	//   62  125:bipush          8
	//   63  127:istore_3        
		remoteviews1.setViewVisibility(android.support.compat.R.id.actions, ((int) (byte0)));
	//   64  128:aload           8
	//   65  130:getstatic       #31  <Field int android.support.compat.R$id.actions>
	//   66  133:iload_3         
	//   67  134:invokevirtual   #77  <Method void RemoteViews.setViewVisibility(int, int)>
		remoteviews1.setViewVisibility(android.support.compat.R.id.action_divider, ((int) (byte0)));
	//   68  137:aload           8
	//   69  139:getstatic       #80  <Field int android.support.compat.R$id.action_divider>
	//   70  142:iload_3         
	//   71  143:invokevirtual   #77  <Method void RemoteViews.setViewVisibility(int, int)>
		buildIntoRemoteViews(remoteviews1, remoteviews);
	//   72  146:aload_0         
	//   73  147:aload           8
	//   74  149:aload_1         
	//   75  150:invokevirtual   #84  <Method void buildIntoRemoteViews(RemoteViews, RemoteViews)>
		return remoteviews1;
	//   76  153:aload           8
	//   77  155:areturn         
	}

	private RemoteViews generateActionButton(NotificationCompat.Action action)
	{
		boolean flag;
		if(action.actionIntent == null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #88  <Field android.app.PendingIntent NotificationCompat$Action.actionIntent>
	//*   2    4:ifnonnull       12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Object obj = ((Object) (mBuilder.mContext.getPackageName()));
	//    8   14:aload_0         
	//    9   15:getfield        #41  <Field NotificationCompat$Builder mBuilder>
	//   10   18:getfield        #92  <Field Context NotificationCompat$Builder.mContext>
	//   11   21:invokevirtual   #98  <Method String Context.getPackageName()>
	//   12   24:astore          4
		int i;
		if(flag)
	//*  13   26:iload_2         
	//*  14   27:ifeq            37
			i = android.support.compat.R.layout.notification_action_tombstone;
	//   15   30:getstatic       #101 <Field int android.support.compat.R$layout.notification_action_tombstone>
	//   16   33:istore_3        
		else
	//*  17   34:goto            41
			i = android.support.compat.R.layout.notification_action;
	//   18   37:getstatic       #104 <Field int android.support.compat.R$layout.notification_action>
	//   19   40:istore_3        
		obj = ((Object) (new RemoteViews(((String) (obj)), i)));
	//   20   41:new             #33  <Class RemoteViews>
	//   21   44:dup             
	//   22   45:aload           4
	//   23   47:iload_3         
	//   24   48:invokespecial   #107 <Method void RemoteViews(String, int)>
	//   25   51:astore          4
		((RemoteViews) (obj)).setImageViewBitmap(android.support.compat.R.id.action_image, createColoredBitmap(action.getIcon(), mBuilder.mContext.getResources().getColor(android.support.compat.R.color.notification_action_color_filter)));
	//   26   53:aload           4
	//   27   55:getstatic       #110 <Field int android.support.compat.R$id.action_image>
	//   28   58:aload_0         
	//   29   59:aload_1         
	//   30   60:invokevirtual   #113 <Method int NotificationCompat$Action.getIcon()>
	//   31   63:aload_0         
	//   32   64:getfield        #41  <Field NotificationCompat$Builder mBuilder>
	//   33   67:getfield        #92  <Field Context NotificationCompat$Builder.mContext>
	//   34   70:invokevirtual   #117 <Method Resources Context.getResources()>
	//   35   73:getstatic       #122 <Field int android.support.compat.R$color.notification_action_color_filter>
	//   36   76:invokevirtual   #128 <Method int Resources.getColor(int)>
	//   37   79:invokevirtual   #132 <Method android.graphics.Bitmap createColoredBitmap(int, int)>
	//   38   82:invokevirtual   #136 <Method void RemoteViews.setImageViewBitmap(int, android.graphics.Bitmap)>
		((RemoteViews) (obj)).setTextViewText(android.support.compat.R.id.action_text, action.title);
	//   39   85:aload           4
	//   40   87:getstatic       #139 <Field int android.support.compat.R$id.action_text>
	//   41   90:aload_1         
	//   42   91:getfield        #143 <Field CharSequence NotificationCompat$Action.title>
	//   43   94:invokevirtual   #147 <Method void RemoteViews.setTextViewText(int, CharSequence)>
		if(!flag)
	//*  44   97:iload_2         
	//*  45   98:ifne            113
			((RemoteViews) (obj)).setOnClickPendingIntent(android.support.compat.R.id.action_container, action.actionIntent);
	//   46  101:aload           4
	//   47  103:getstatic       #150 <Field int android.support.compat.R$id.action_container>
	//   48  106:aload_1         
	//   49  107:getfield        #88  <Field android.app.PendingIntent NotificationCompat$Action.actionIntent>
	//   50  110:invokevirtual   #154 <Method void RemoteViews.setOnClickPendingIntent(int, android.app.PendingIntent)>
		if(android.os.Build.VERSION.SDK_INT >= 15)
	//*  51  113:getstatic       #159 <Field int android.os.Build$VERSION.SDK_INT>
	//*  52  116:bipush          15
	//*  53  118:icmplt          133
			((RemoteViews) (obj)).setContentDescription(android.support.compat.R.id.action_container, action.title);
	//   54  121:aload           4
	//   55  123:getstatic       #150 <Field int android.support.compat.R$id.action_container>
	//   56  126:aload_1         
	//   57  127:getfield        #143 <Field CharSequence NotificationCompat$Action.title>
	//   58  130:invokevirtual   #162 <Method void RemoteViews.setContentDescription(int, CharSequence)>
		return ((RemoteViews) (obj));
	//   59  133:aload           4
	//   60  135:areturn         
	}

	public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #159 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          25
			notificationbuilderwithbuilderaccessor.getBuilder().setStyle(((android.app.Notification.Style) (new android.app.Notification.DecoratedCustomViewStyle())));
	//    3    8:aload_1         
	//    4    9:invokeinterface #174 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    5   14:new             #176 <Class android.app.Notification$DecoratedCustomViewStyle>
	//    6   17:dup             
	//    7   18:invokespecial   #177 <Method void android.app.Notification$DecoratedCustomViewStyle()>
	//    8   21:invokevirtual   #183 <Method android.app.Notification$Builder android.app.Notification$Builder.setStyle(android.app.Notification$Style)>
	//    9   24:pop             
	//   10   25:return          
	}

	public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #159 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          10
			return null;
	//    3    8:aconst_null     
	//    4    9:areturn         
		notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (mBuilder.getBigContentView()));
	//    5   10:aload_0         
	//    6   11:getfield        #41  <Field NotificationCompat$Builder mBuilder>
	//    7   14:invokevirtual   #190 <Method RemoteViews NotificationCompat$Builder.getBigContentView()>
	//    8   17:astore_1        
		if(notificationbuilderwithbuilderaccessor == null)
	//*   9   18:aload_1         
	//*  10   19:ifnull          25
	//*  11   22:goto            33
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (mBuilder.getContentView()));
	//   12   25:aload_0         
	//   13   26:getfield        #41  <Field NotificationCompat$Builder mBuilder>
	//   14   29:invokevirtual   #193 <Method RemoteViews NotificationCompat$Builder.getContentView()>
	//   15   32:astore_1        
		if(notificationbuilderwithbuilderaccessor == null)
	//*  16   33:aload_1         
	//*  17   34:ifnonnull       39
			return null;
	//   18   37:aconst_null     
	//   19   38:areturn         
		else
			return createRemoteViews(((RemoteViews) (notificationbuilderwithbuilderaccessor)), true);
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:iconst_1        
	//   23   42:invokespecial   #195 <Method RemoteViews createRemoteViews(RemoteViews, boolean)>
	//   24   45:areturn         
	}

	public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #159 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          10
			return null;
	//    3    8:aconst_null     
	//    4    9:areturn         
		if(mBuilder.getContentView() == null)
	//*   5   10:aload_0         
	//*   6   11:getfield        #41  <Field NotificationCompat$Builder mBuilder>
	//*   7   14:invokevirtual   #193 <Method RemoteViews NotificationCompat$Builder.getContentView()>
	//*   8   17:ifnonnull       22
			return null;
	//    9   20:aconst_null     
	//   10   21:areturn         
		else
			return createRemoteViews(mBuilder.getContentView(), false);
	//   11   22:aload_0         
	//   12   23:aload_0         
	//   13   24:getfield        #41  <Field NotificationCompat$Builder mBuilder>
	//   14   27:invokevirtual   #193 <Method RemoteViews NotificationCompat$Builder.getContentView()>
	//   15   30:iconst_0        
	//   16   31:invokespecial   #195 <Method RemoteViews createRemoteViews(RemoteViews, boolean)>
	//   17   34:areturn         
	}

	public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #159 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          10
			return null;
	//    3    8:aconst_null     
	//    4    9:areturn         
		RemoteViews remoteviews = mBuilder.getHeadsUpContentView();
	//    5   10:aload_0         
	//    6   11:getfield        #41  <Field NotificationCompat$Builder mBuilder>
	//    7   14:invokevirtual   #200 <Method RemoteViews NotificationCompat$Builder.getHeadsUpContentView()>
	//    8   17:astore_2        
		if(remoteviews != null)
	//*   9   18:aload_2         
	//*  10   19:ifnull          27
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (remoteviews));
	//   11   22:aload_2         
	//   12   23:astore_1        
		else
	//*  13   24:goto            35
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (mBuilder.getContentView()));
	//   14   27:aload_0         
	//   15   28:getfield        #41  <Field NotificationCompat$Builder mBuilder>
	//   16   31:invokevirtual   #193 <Method RemoteViews NotificationCompat$Builder.getContentView()>
	//   17   34:astore_1        
		if(remoteviews == null)
	//*  18   35:aload_2         
	//*  19   36:ifnonnull       41
			return null;
	//   20   39:aconst_null     
	//   21   40:areturn         
		else
			return createRemoteViews(((RemoteViews) (notificationbuilderwithbuilderaccessor)), true);
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:iconst_1        
	//   25   44:invokespecial   #195 <Method RemoteViews createRemoteViews(RemoteViews, boolean)>
	//   26   47:areturn         
	}

	private static final int MAX_ACTION_BUTTONS = 3;

	public NotificationCompat$DecoratedCustomViewStyle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NotificationCompat$Style()>
	//    2    4:return          
	}
}
