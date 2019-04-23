// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.*;
import android.widget.RemoteViews;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.media.app:
//			NotificationCompat

public static class NotificationCompat$MediaStyle extends android.support.v4.app.NotificationCompat.Style
{

	private RemoteViews generateMediaActionButton(android.support.v4.app.NotificationCompat.Action action)
	{
		boolean flag;
		if(action.getActionIntent() == null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #39  <Method PendingIntent android.support.v4.app.NotificationCompat$Action.getActionIntent()>
	//*   2    4:ifnonnull       12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		RemoteViews remoteviews = new RemoteViews(mBuilder.mContext.getPackageName(), android.support.mediacompat.R.layout.notification_media_action);
	//    8   14:new             #41  <Class RemoteViews>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:getfield        #45  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//   12   22:getfield        #51  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   13   25:invokevirtual   #57  <Method String Context.getPackageName()>
	//   14   28:getstatic       #62  <Field int android.support.mediacompat.R$layout.notification_media_action>
	//   15   31:invokespecial   #65  <Method void RemoteViews(String, int)>
	//   16   34:astore_3        
		remoteviews.setImageViewResource(android.support.mediacompat.R.id.action0, action.getIcon());
	//   17   35:aload_3         
	//   18   36:getstatic       #70  <Field int android.support.mediacompat.R$id.action0>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #74  <Method int android.support.v4.app.NotificationCompat$Action.getIcon()>
	//   21   43:invokevirtual   #78  <Method void RemoteViews.setImageViewResource(int, int)>
		if(!flag)
	//*  22   46:iload_2         
	//*  23   47:ifne            61
			remoteviews.setOnClickPendingIntent(android.support.mediacompat.R.id.action0, action.getActionIntent());
	//   24   50:aload_3         
	//   25   51:getstatic       #70  <Field int android.support.mediacompat.R$id.action0>
	//   26   54:aload_1         
	//   27   55:invokevirtual   #39  <Method PendingIntent android.support.v4.app.NotificationCompat$Action.getActionIntent()>
	//   28   58:invokevirtual   #82  <Method void RemoteViews.setOnClickPendingIntent(int, PendingIntent)>
		if(android.os.Build.VERSION.SDK_INT >= 15)
	//*  29   61:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*  30   64:bipush          15
	//*  31   66:icmplt          80
			remoteviews.setContentDescription(android.support.mediacompat.R.id.action0, action.getTitle());
	//   32   69:aload_3         
	//   33   70:getstatic       #70  <Field int android.support.mediacompat.R$id.action0>
	//   34   73:aload_1         
	//   35   74:invokevirtual   #91  <Method CharSequence android.support.v4.app.NotificationCompat$Action.getTitle()>
	//   36   77:invokevirtual   #95  <Method void RemoteViews.setContentDescription(int, CharSequence)>
		return remoteviews;
	//   37   80:aload_3         
	//   38   81:areturn         
	}

	public static android.support.v4.media.session.MediaSessionCompat.Token getMediaSession(Notification notification)
	{
		notification = ((Notification) (NotificationCompat.getExtras(notification)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #103 <Method Bundle NotificationCompat.getExtras(Notification)>
	//    2    4:astore_0        
		if(notification != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          77
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   5    9:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          21
	//*   7   14:icmplt          33
			{
				notification = ((Notification) (((Bundle) (notification)).getParcelable("android.mediaSession")));
	//    8   17:aload_0         
	//    9   18:ldc1            #105 <String "android.mediaSession">
	//   10   20:invokevirtual   #111 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   11   23:astore_0        
				if(notification != null)
	//*  12   24:aload_0         
	//*  13   25:ifnull          77
					return android.support.v4.media.session.MediaSessionCompat.Token.fromToken(((Object) (notification)));
	//   14   28:aload_0         
	//   15   29:invokestatic    #117 <Method android.support.v4.media.session.MediaSessionCompat$Token android.support.v4.media.session.MediaSessionCompat$Token.fromToken(Object)>
	//   16   32:areturn         
			} else
			{
				Object obj = ((Object) (BundleCompat.getBinder(((Bundle) (notification)), "android.mediaSession")));
	//   17   33:aload_0         
	//   18   34:ldc1            #105 <String "android.mediaSession">
	//   19   36:invokestatic    #123 <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//   20   39:astore_1        
				if(obj != null)
	//*  21   40:aload_1         
	//*  22   41:ifnull          77
				{
					notification = ((Notification) (Parcel.obtain()));
	//   23   44:invokestatic    #129 <Method Parcel Parcel.obtain()>
	//   24   47:astore_0        
					((Parcel) (notification)).writeStrongBinder(((android.os.IBinder) (obj)));
	//   25   48:aload_0         
	//   26   49:aload_1         
	//   27   50:invokevirtual   #133 <Method void Parcel.writeStrongBinder(android.os.IBinder)>
					((Parcel) (notification)).setDataPosition(0);
	//   28   53:aload_0         
	//   29   54:iconst_0        
	//   30   55:invokevirtual   #137 <Method void Parcel.setDataPosition(int)>
					obj = ((Object) ((android.support.v4.media.session.MediaSessionCompat.Token)android.support.v4.media.session.MediaSessionCompat.Token.CREATOR.createFromParcel(((Parcel) (notification)))));
	//   31   58:getstatic       #141 <Field android.os.Parcelable$Creator android.support.v4.media.session.MediaSessionCompat$Token.CREATOR>
	//   32   61:aload_0         
	//   33   62:invokeinterface #147 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   34   67:checkcast       #113 <Class android.support.v4.media.session.MediaSessionCompat$Token>
	//   35   70:astore_1        
					((Parcel) (notification)).recycle();
	//   36   71:aload_0         
	//   37   72:invokevirtual   #150 <Method void Parcel.recycle()>
					return ((android.support.v4.media.session.MediaSessionCompat.Token) (obj));
	//   38   75:aload_1         
	//   39   76:areturn         
				}
			}
		return null;
	//   40   77:aconst_null     
	//   41   78:areturn         
	}

	public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          30
		{
			notificationbuilderwithbuilderaccessor.getBuilder().setStyle(((android.app.Notification.Style) (fillInMediaStyle(new android.app.Notification.MediaStyle()))));
	//    3    8:aload_1         
	//    4    9:invokeinterface #162 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    5   14:aload_0         
	//    6   15:new             #164 <Class android.app.Notification$MediaStyle>
	//    7   18:dup             
	//    8   19:invokespecial   #165 <Method void android.app.Notification$MediaStyle()>
	//    9   22:invokevirtual   #169 <Method android.app.Notification$MediaStyle fillInMediaStyle(android.app.Notification$MediaStyle)>
	//   10   25:invokevirtual   #175 <Method android.app.Notification$Builder android.app.Notification$Builder.setStyle(android.app.Notification$Style)>
	//   11   28:pop             
			return;
	//   12   29:return          
		}
		if(mShowCancelButton)
	//*  13   30:aload_0         
	//*  14   31:getfield        #177 <Field boolean mShowCancelButton>
	//*  15   34:ifeq            48
			notificationbuilderwithbuilderaccessor.getBuilder().setOngoing(true);
	//   16   37:aload_1         
	//   17   38:invokeinterface #162 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//   18   43:iconst_1        
	//   19   44:invokevirtual   #181 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//   20   47:pop             
	//   21   48:return          
	}

	android.app.Notification.MediaStyle fillInMediaStyle(android.app.Notification.MediaStyle mediastyle)
	{
		int ai[] = mActionsToShowInCompact;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int[] mActionsToShowInCompact>
	//    2    4:astore_2        
		if(ai != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			mediastyle.setShowActionsInCompactView(ai);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #188 <Method android.app.Notification$MediaStyle android.app.Notification$MediaStyle.setShowActionsInCompactView(int[])>
	//    8   14:pop             
		android.support.v4.media.session.MediaSessionCompat.Token token = mToken;
	//    9   15:aload_0         
	//   10   16:getfield        #190 <Field android.support.v4.media.session.MediaSessionCompat$Token mToken>
	//   11   19:astore_2        
		if(token != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          36
			mediastyle.setMediaSession((android.media.session.MediaSession.Token)token.getToken());
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokevirtual   #194 <Method Object android.support.v4.media.session.MediaSessionCompat$Token.getToken()>
	//   17   29:checkcast       #196 <Class android.media.session.MediaSession$Token>
	//   18   32:invokevirtual   #200 <Method android.app.Notification$MediaStyle android.app.Notification$MediaStyle.setMediaSession(android.media.session.MediaSession$Token)>
	//   19   35:pop             
		return mediastyle;
	//   20   36:aload_1         
	//   21   37:areturn         
	}

	RemoteViews generateBigContentView()
	{
		int j = Math.min(mBuilder.mActions.size(), 5);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//    2    4:getfield        #206 <Field ArrayList android.support.v4.app.NotificationCompat$Builder.mActions>
	//    3    7:invokevirtual   #211 <Method int ArrayList.size()>
	//    4   10:iconst_5        
	//    5   11:invokestatic    #217 <Method int Math.min(int, int)>
	//    6   14:istore_2        
		RemoteViews remoteviews = applyStandardTemplate(false, getBigContentViewLayoutResource(j), false);
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:aload_0         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #221 <Method int getBigContentViewLayoutResource(int)>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #225 <Method RemoteViews applyStandardTemplate(boolean, int, boolean)>
	//   14   26:astore_3        
		remoteviews.removeAllViews(android.support.mediacompat.R.id.media_actions);
	//   15   27:aload_3         
	//   16   28:getstatic       #228 <Field int android.support.mediacompat.R$id.media_actions>
	//   17   31:invokevirtual   #231 <Method void RemoteViews.removeAllViews(int)>
		if(j > 0)
	//*  18   34:iload_2         
	//*  19   35:ifle            81
		{
			for(int i = 0; i < j; i++)
	//*  20   38:iconst_0        
	//*  21   39:istore_1        
	//*  22   40:iload_1         
	//*  23   41:iload_2         
	//*  24   42:icmpge          81
			{
				RemoteViews remoteviews1 = generateMediaActionButton((android.support.v4.app.NotificationCompat.Action)mBuilder.mActions.get(i));
	//   25   45:aload_0         
	//   26   46:aload_0         
	//   27   47:getfield        #45  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//   28   50:getfield        #206 <Field ArrayList android.support.v4.app.NotificationCompat$Builder.mActions>
	//   29   53:iload_1         
	//   30   54:invokevirtual   #235 <Method Object ArrayList.get(int)>
	//   31   57:checkcast       #35  <Class android.support.v4.app.NotificationCompat$Action>
	//   32   60:invokespecial   #237 <Method RemoteViews generateMediaActionButton(android.support.v4.app.NotificationCompat$Action)>
	//   33   63:astore          4
				remoteviews.addView(android.support.mediacompat.R.id.media_actions, remoteviews1);
	//   34   65:aload_3         
	//   35   66:getstatic       #228 <Field int android.support.mediacompat.R$id.media_actions>
	//   36   69:aload           4
	//   37   71:invokevirtual   #241 <Method void RemoteViews.addView(int, RemoteViews)>
			}

	//   38   74:iload_1         
	//   39   75:iconst_1        
	//   40   76:iadd            
	//   41   77:istore_1        
		}
	//*  42   78:goto            40
		if(mShowCancelButton)
	//*  43   81:aload_0         
	//*  44   82:getfield        #177 <Field boolean mShowCancelButton>
	//*  45   85:ifeq            134
		{
			remoteviews.setViewVisibility(android.support.mediacompat.R.id.cancel_action, 0);
	//   46   88:aload_3         
	//   47   89:getstatic       #244 <Field int android.support.mediacompat.R$id.cancel_action>
	//   48   92:iconst_0        
	//   49   93:invokevirtual   #247 <Method void RemoteViews.setViewVisibility(int, int)>
			remoteviews.setInt(android.support.mediacompat.R.id.cancel_action, "setAlpha", mBuilder.mContext.getResources().getInteger(android.support.mediacompat.R.integer.cancel_button_image_alpha));
	//   50   96:aload_3         
	//   51   97:getstatic       #244 <Field int android.support.mediacompat.R$id.cancel_action>
	//   52  100:ldc1            #249 <String "setAlpha">
	//   53  102:aload_0         
	//   54  103:getfield        #45  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//   55  106:getfield        #51  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   56  109:invokevirtual   #253 <Method Resources Context.getResources()>
	//   57  112:getstatic       #258 <Field int android.support.mediacompat.R$integer.cancel_button_image_alpha>
	//   58  115:invokevirtual   #263 <Method int Resources.getInteger(int)>
	//   59  118:invokevirtual   #267 <Method void RemoteViews.setInt(int, String, int)>
			remoteviews.setOnClickPendingIntent(android.support.mediacompat.R.id.cancel_action, mCancelButtonIntent);
	//   60  121:aload_3         
	//   61  122:getstatic       #244 <Field int android.support.mediacompat.R$id.cancel_action>
	//   62  125:aload_0         
	//   63  126:getfield        #269 <Field PendingIntent mCancelButtonIntent>
	//   64  129:invokevirtual   #82  <Method void RemoteViews.setOnClickPendingIntent(int, PendingIntent)>
			return remoteviews;
	//   65  132:aload_3         
	//   66  133:areturn         
		} else
		{
			remoteviews.setViewVisibility(android.support.mediacompat.R.id.cancel_action, 8);
	//   67  134:aload_3         
	//   68  135:getstatic       #244 <Field int android.support.mediacompat.R$id.cancel_action>
	//   69  138:bipush          8
	//   70  140:invokevirtual   #247 <Method void RemoteViews.setViewVisibility(int, int)>
			return remoteviews;
	//   71  143:aload_3         
	//   72  144:areturn         
		}
	}

	RemoteViews generateContentView()
	{
		RemoteViews remoteviews = applyStandardTemplate(false, getContentViewLayoutResource(), true);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #273 <Method int getContentViewLayoutResource()>
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #225 <Method RemoteViews applyStandardTemplate(boolean, int, boolean)>
	//    6   10:astore          4
		int k = mBuilder.mActions.size();
	//    7   12:aload_0         
	//    8   13:getfield        #45  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//    9   16:getfield        #206 <Field ArrayList android.support.v4.app.NotificationCompat$Builder.mActions>
	//   10   19:invokevirtual   #211 <Method int ArrayList.size()>
	//   11   22:istore_3        
		int ai[] = mActionsToShowInCompact;
	//   12   23:aload_0         
	//   13   24:getfield        #26  <Field int[] mActionsToShowInCompact>
	//   14   27:astore          5
		int i;
		if(ai == null)
	//*  15   29:aload           5
	//*  16   31:ifnonnull       39
			i = 0;
	//   17   34:iconst_0        
	//   18   35:istore_1        
		else
	//*  19   36:goto            47
			i = Math.min(ai.length, 3);
	//   20   39:aload           5
	//   21   41:arraylength     
	//   22   42:iconst_3        
	//   23   43:invokestatic    #217 <Method int Math.min(int, int)>
	//   24   46:istore_1        
		remoteviews.removeAllViews(android.support.mediacompat.R.id.media_actions);
	//   25   47:aload           4
	//   26   49:getstatic       #228 <Field int android.support.mediacompat.R$id.media_actions>
	//   27   52:invokevirtual   #231 <Method void RemoteViews.removeAllViews(int)>
		if(i > 0)
	//*  28   55:iload_1         
	//*  29   56:ifle            147
		{
			for(int j = 0; j < i;)
	//*  30   59:iconst_0        
	//*  31   60:istore_2        
	//*  32   61:iload_2         
	//*  33   62:iload_1         
	//*  34   63:icmpge          147
				if(j < k)
	//*  35   66:iload_2         
	//*  36   67:iload_3         
	//*  37   68:icmpge          113
				{
					RemoteViews remoteviews1 = generateMediaActionButton((android.support.v4.app.NotificationCompat.Action)mBuilder.mActions.get(mActionsToShowInCompact[j]));
	//   38   71:aload_0         
	//   39   72:aload_0         
	//   40   73:getfield        #45  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//   41   76:getfield        #206 <Field ArrayList android.support.v4.app.NotificationCompat$Builder.mActions>
	//   42   79:aload_0         
	//   43   80:getfield        #26  <Field int[] mActionsToShowInCompact>
	//   44   83:iload_2         
	//   45   84:iaload          
	//   46   85:invokevirtual   #235 <Method Object ArrayList.get(int)>
	//   47   88:checkcast       #35  <Class android.support.v4.app.NotificationCompat$Action>
	//   48   91:invokespecial   #237 <Method RemoteViews generateMediaActionButton(android.support.v4.app.NotificationCompat$Action)>
	//   49   94:astore          5
					remoteviews.addView(android.support.mediacompat.R.id.media_actions, remoteviews1);
	//   50   96:aload           4
	//   51   98:getstatic       #228 <Field int android.support.mediacompat.R$id.media_actions>
	//   52  101:aload           5
	//   53  103:invokevirtual   #241 <Method void RemoteViews.addView(int, RemoteViews)>
					j++;
	//   54  106:iload_2         
	//   55  107:iconst_1        
	//   56  108:iadd            
	//   57  109:istore_2        
				} else
	//*  58  110:goto            61
				{
					throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[] {
						Integer.valueOf(j), Integer.valueOf(k - 1)
					}));
	//   59  113:new             #275 <Class IllegalArgumentException>
	//   60  116:dup             
	//   61  117:ldc2            #277 <String "setShowActionsInCompactView: action %d out of bounds (max %d)">
	//   62  120:iconst_2        
	//   63  121:anewarray       Object[]
	//   64  124:dup             
	//   65  125:iconst_0        
	//   66  126:iload_2         
	//   67  127:invokestatic    #285 <Method Integer Integer.valueOf(int)>
	//   68  130:aastore         
	//   69  131:dup             
	//   70  132:iconst_1        
	//   71  133:iload_3         
	//   72  134:iconst_1        
	//   73  135:isub            
	//   74  136:invokestatic    #285 <Method Integer Integer.valueOf(int)>
	//   75  139:aastore         
	//   76  140:invokestatic    #291 <Method String String.format(String, Object[])>
	//   77  143:invokespecial   #294 <Method void IllegalArgumentException(String)>
	//   78  146:athrow          
				}

		}
		if(mShowCancelButton)
	//*  79  147:aload_0         
	//*  80  148:getfield        #177 <Field boolean mShowCancelButton>
	//*  81  151:ifeq            214
		{
			remoteviews.setViewVisibility(android.support.mediacompat.R.id.end_padder, 8);
	//   82  154:aload           4
	//   83  156:getstatic       #297 <Field int android.support.mediacompat.R$id.end_padder>
	//   84  159:bipush          8
	//   85  161:invokevirtual   #247 <Method void RemoteViews.setViewVisibility(int, int)>
			remoteviews.setViewVisibility(android.support.mediacompat.R.id.cancel_action, 0);
	//   86  164:aload           4
	//   87  166:getstatic       #244 <Field int android.support.mediacompat.R$id.cancel_action>
	//   88  169:iconst_0        
	//   89  170:invokevirtual   #247 <Method void RemoteViews.setViewVisibility(int, int)>
			remoteviews.setOnClickPendingIntent(android.support.mediacompat.R.id.cancel_action, mCancelButtonIntent);
	//   90  173:aload           4
	//   91  175:getstatic       #244 <Field int android.support.mediacompat.R$id.cancel_action>
	//   92  178:aload_0         
	//   93  179:getfield        #269 <Field PendingIntent mCancelButtonIntent>
	//   94  182:invokevirtual   #82  <Method void RemoteViews.setOnClickPendingIntent(int, PendingIntent)>
			remoteviews.setInt(android.support.mediacompat.R.id.cancel_action, "setAlpha", mBuilder.mContext.getResources().getInteger(android.support.mediacompat.R.integer.cancel_button_image_alpha));
	//   95  185:aload           4
	//   96  187:getstatic       #244 <Field int android.support.mediacompat.R$id.cancel_action>
	//   97  190:ldc1            #249 <String "setAlpha">
	//   98  192:aload_0         
	//   99  193:getfield        #45  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//  100  196:getfield        #51  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//  101  199:invokevirtual   #253 <Method Resources Context.getResources()>
	//  102  202:getstatic       #258 <Field int android.support.mediacompat.R$integer.cancel_button_image_alpha>
	//  103  205:invokevirtual   #263 <Method int Resources.getInteger(int)>
	//  104  208:invokevirtual   #267 <Method void RemoteViews.setInt(int, String, int)>
			return remoteviews;
	//  105  211:aload           4
	//  106  213:areturn         
		} else
		{
			remoteviews.setViewVisibility(android.support.mediacompat.R.id.end_padder, 0);
	//  107  214:aload           4
	//  108  216:getstatic       #297 <Field int android.support.mediacompat.R$id.end_padder>
	//  109  219:iconst_0        
	//  110  220:invokevirtual   #247 <Method void RemoteViews.setViewVisibility(int, int)>
			remoteviews.setViewVisibility(android.support.mediacompat.R.id.cancel_action, 8);
	//  111  223:aload           4
	//  112  225:getstatic       #244 <Field int android.support.mediacompat.R$id.cancel_action>
	//  113  228:bipush          8
	//  114  230:invokevirtual   #247 <Method void RemoteViews.setViewVisibility(int, int)>
			return remoteviews;
	//  115  233:aload           4
	//  116  235:areturn         
		}
	}

	int getBigContentViewLayoutResource(int i)
	{
		if(i <= 3)
	//*   0    0:iload_1         
	//*   1    1:iconst_3        
	//*   2    2:icmpgt          9
			return android.support.mediacompat.R.layout.notification_template_big_media_narrow;
	//    3    5:getstatic       #300 <Field int android.support.mediacompat.R$layout.notification_template_big_media_narrow>
	//    4    8:ireturn         
		else
			return android.support.mediacompat.R.layout.notification_template_big_media;
	//    5    9:getstatic       #303 <Field int android.support.mediacompat.R$layout.notification_template_big_media>
	//    6   12:ireturn         
	}

	int getContentViewLayoutResource()
	{
		return android.support.mediacompat.R.layout.notification_template_media;
	//    0    0:getstatic       #306 <Field int android.support.mediacompat.R$layout.notification_template_media>
	//    1    3:ireturn         
	}

	public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          10
			return null;
	//    3    8:aconst_null     
	//    4    9:areturn         
		else
			return generateBigContentView();
	//    5   10:aload_0         
	//    6   11:invokevirtual   #310 <Method RemoteViews generateBigContentView()>
	//    7   14:areturn         
	}

	public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          10
			return null;
	//    3    8:aconst_null     
	//    4    9:areturn         
		else
			return generateContentView();
	//    5   10:aload_0         
	//    6   11:invokevirtual   #313 <Method RemoteViews generateContentView()>
	//    7   14:areturn         
	}

	public NotificationCompat$MediaStyle setCancelButtonIntent(PendingIntent pendingintent)
	{
		mCancelButtonIntent = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #269 <Field PendingIntent mCancelButtonIntent>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$MediaStyle setMediaSession(android.support.v4.media.session.MediaSessionCompat.Token token)
	{
		mToken = token;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #190 <Field android.support.v4.media.session.MediaSessionCompat$Token mToken>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public transient NotificationCompat$MediaStyle setShowActionsInCompactView(int ai[])
	{
		mActionsToShowInCompact = ai;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field int[] mActionsToShowInCompact>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$MediaStyle setShowCancelButton(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          13
			mShowCancelButton = flag;
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:putfield        #177 <Field boolean mShowCancelButton>
		return this;
	//    6   13:aload_0         
	//    7   14:areturn         
	}

	private static final int MAX_MEDIA_BUTTONS = 5;
	private static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;
	int mActionsToShowInCompact[];
	PendingIntent mCancelButtonIntent;
	boolean mShowCancelButton;
	android.support.v4.media.session.MediaSessionCompat.Token mToken;

	public NotificationCompat$MediaStyle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void android.support.v4.app.NotificationCompat$Style()>
		mActionsToShowInCompact = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field int[] mActionsToShowInCompact>
	//    5    9:return          
	}

	public NotificationCompat$MediaStyle(android.support.v4.app.NotificationCompat.Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void android.support.v4.app.NotificationCompat$Style()>
		mActionsToShowInCompact = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field int[] mActionsToShowInCompact>
		setBuilder(builder);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #31  <Method void setBuilder(android.support.v4.app.NotificationCompat$Builder)>
	//    8   14:return          
	}
}
