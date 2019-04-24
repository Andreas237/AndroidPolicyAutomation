.class public Lcom/shopkick/app/gcm/OsNotificationHandler;
.super Lcom/shopkick/app/gcm/PushEventHandler;
.source "OsNotificationHandler.java"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "OsNotificationHandler"

.field private static final OS_TAG:Ljava/lang/String; = "skos"


# instance fields
.field private badgeProvider:Lcom/shopkick/app/util/badge/IBadgeProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/gcm/PushEventDispatcher;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Lcom/shopkick/app/gcm/PushEventHandler;-><init>()V

    .line 35
    invoke-virtual {p0, p1}, Lcom/shopkick/app/gcm/OsNotificationHandler;->setPushEventHandler(Lcom/shopkick/app/gcm/PushEventDispatcher;)V

    .line 36
    new-instance p1, Lcom/shopkick/app/util/badge/BadgeProviderFactory;

    invoke-virtual {p0}, Lcom/shopkick/app/gcm/OsNotificationHandler;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/shopkick/app/util/badge/BadgeProviderFactory;-><init>(Landroid/content/Context;)V

    .line 37
    invoke-virtual {p1}, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->getBadgeProvider()Lcom/shopkick/app/util/badge/IBadgeProvider;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/gcm/OsNotificationHandler;->badgeProvider:Lcom/shopkick/app/util/badge/IBadgeProvider;

    return-void
.end method


# virtual methods
.method public accepts(Lcom/shopkick/app/fetchers/api/skapi/PushMessage;)Z
    .locals 0

    .line 42
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->message:Ljava/lang/String;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public handle(Lcom/shopkick/app/fetchers/api/skapi/PushMessage;)Lcom/shopkick/app/gcm/PushEventHandler$Progress;
    .locals 12

    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 52
    invoke-virtual {p0}, Lcom/shopkick/app/gcm/OsNotificationHandler;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "notification"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/NotificationManager;

    .line 53
    new-instance v3, Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-virtual {p0}, Lcom/shopkick/app/gcm/OsNotificationHandler;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string/jumbo v5, "shopkick_notif_channel_main"

    invoke-direct {v3, v4, v5}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const v4, 0x7f0801af

    .line 55
    invoke-virtual {v3, v4}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v3

    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->tickerText:Ljava/lang/String;

    .line 56
    invoke-virtual {v3, v5}, Landroid/support/v4/app/NotificationCompat$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v3

    .line 57
    invoke-virtual {v3, v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setWhen(J)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 58
    invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    .line 59
    invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setOnlyAlertOnce(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    .line 60
    invoke-virtual {v0}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    .line 61
    new-instance v3, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Lcom/shopkick/app/gcm/OsNotificationHandler;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f0c0027

    invoke-direct {v3, v5, v6}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 62
    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->message:Ljava/lang/String;

    const v6, 0x7f090703

    invoke-virtual {v3, v6, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 63
    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->title:Ljava/lang/String;

    if-eqz v5, :cond_0

    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->title:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/gcm/OsNotificationHandler;->getContext()Landroid/content/Context;

    move-result-object v5

    const v6, 0x7f110036

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_0
    const v6, 0x7f09073a

    .line 64
    invoke-virtual {v3, v6, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 66
    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->androidBadgeValue:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v7, 0x2

    if-eqz v5, :cond_1

    .line 67
    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->androidBadgeValue:Ljava/lang/String;

    const v8, 0x7f090058

    invoke-virtual {v3, v8, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 68
    invoke-virtual {v3, v8, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 69
    iget-object v5, p0, Lcom/shopkick/app/gcm/OsNotificationHandler;->badgeProvider:Lcom/shopkick/app/util/badge/IBadgeProvider;

    invoke-interface {v5}, Lcom/shopkick/app/util/badge/IBadgeProvider;->supportBadgeOnDevice()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 70
    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->androidBadgeDisplayType:Ljava/lang/Integer;

    if-eqz v5, :cond_1

    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->androidBadgeDisplayType:Ljava/lang/Integer;

    .line 71
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-eq v5, v7, :cond_1

    .line 72
    iget-object v5, p0, Lcom/shopkick/app/gcm/OsNotificationHandler;->badgeProvider:Lcom/shopkick/app/util/badge/IBadgeProvider;

    iget-object v8, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->androidBadgeValue:Ljava/lang/String;

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v5, v8}, Lcom/shopkick/app/util/badge/IBadgeProvider;->setBadge(I)V

    .line 73
    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->androidBadgeDisplayType:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-nez v5, :cond_1

    move v5, v6

    goto :goto_1

    :cond_1
    move v5, v1

    .line 81
    :goto_1
    new-instance v8, Lcom/shopkick/app/gcm/GCMPreferences;

    invoke-virtual {p0}, Lcom/shopkick/app/gcm/OsNotificationHandler;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/shopkick/app/gcm/GCMPreferences;-><init>(Landroid/content/Context;)V

    .line 82
    sget-object v9, Lcom/shopkick/app/gcm/OsNotificationHandler;->LOG_TAG:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "The unpushed push message is "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->toString()Ljava/lang/String;

    move-result-object v9

    .line 84
    invoke-virtual {v8, v9}, Lcom/shopkick/app/gcm/GCMPreferences;->setLastPushMessageJSON(Ljava/lang/String;)V

    if-nez v5, :cond_2

    .line 87
    sget-object p1, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Continue:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    return-object p1

    .line 89
    :cond_2
    iput-object v3, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 91
    new-instance v3, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/shopkick/app/gcm/OsNotificationHandler;->getContext()Landroid/content/Context;

    move-result-object v5

    const-class v10, Lcom/shopkick/app/activities/SplashActivity;

    invoke-direct {v3, v5, v10}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v5, 0x24000000

    .line 93
    invoke-virtual {v3, v5}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const v5, 0x10008000

    .line 94
    invoke-virtual {v3, v5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v5, "fromPns"

    .line 95
    invoke-virtual {v3, v5, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v5, "pnsPushMessage"

    .line 96
    invoke-virtual {v3, v5, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 100
    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->pushMessageId:Ljava/lang/String;

    if-eqz v5, :cond_3

    .line 101
    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->pushMessageId:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v5

    const/high16 v6, 0x8000000

    goto :goto_2

    .line 104
    :cond_3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/UUID;->hashCode()I

    move-result v5

    .line 107
    :goto_2
    invoke-virtual {p0}, Lcom/shopkick/app/gcm/OsNotificationHandler;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9, v5, v3, v6}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    .line 111
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x1a

    const/4 v10, 0x3

    if-ge v6, v9, :cond_5

    .line 113
    iput-object v3, v0, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 114
    iget v6, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 v6, v6, 0x18

    iput v6, v0, Landroid/app/Notification;->flags:I

    .line 115
    invoke-virtual {v8}, Lcom/shopkick/app/gcm/GCMPreferences;->isSoundEnabled()Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v6, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->androidBadgeValue:Ljava/lang/String;

    if-nez v6, :cond_4

    .line 117
    iput v10, v0, Landroid/app/Notification;->audioStreamType:I

    const-string v6, "android.resource://com.shopkick.app/2131755013"

    .line 118
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    iput-object v6, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 120
    :cond_4
    invoke-virtual {v8}, Lcom/shopkick/app/gcm/GCMPreferences;->isVibrateEnabled()Z

    move-result v6

    if-eqz v6, :cond_5

    .line 121
    iget v6, v0, Landroid/app/Notification;->defaults:I

    or-int/2addr v6, v7

    iput v6, v0, Landroid/app/Notification;->defaults:I

    .line 126
    :cond_5
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v6, v9, :cond_a

    const-string v0, "GCMChannel"

    .line 128
    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v0, "GCMChannel"

    .line 129
    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V

    :cond_6
    const-string v0, "com_appboy_default_notification_channel"

    .line 132
    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object v0

    if-eqz v0, :cond_7

    const-string v0, "com_appboy_default_notification_channel"

    .line 133
    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V

    .line 135
    :cond_7
    new-instance v0, Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-virtual {p0}, Lcom/shopkick/app/gcm/OsNotificationHandler;->getContext()Landroid/content/Context;

    move-result-object v5

    const-string/jumbo v6, "shopkick_notif_channel_main"

    invoke-direct {v0, v5, v6}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 137
    invoke-virtual {v0, v4}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    .line 138
    invoke-virtual {p0}, Lcom/shopkick/app/gcm/OsNotificationHandler;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x7f060120

    invoke-static {v4, v5}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/support/v4/app/NotificationCompat$Builder;->setColor(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->title:Ljava/lang/String;

    .line 139
    invoke-virtual {v0, v4}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->tickerText:Ljava/lang/String;

    .line 140
    invoke-virtual {v0, v4}, Landroid/support/v4/app/NotificationCompat$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->message:Ljava/lang/String;

    .line 141
    invoke-virtual {v0, v4}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v4, -0x1

    .line 142
    invoke-virtual {v0, v4}, Landroid/support/v4/app/NotificationCompat$Builder;->setDefaults(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    .line 143
    invoke-virtual {v0, v3}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    .line 144
    invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    .line 145
    invoke-virtual {v8}, Lcom/shopkick/app/gcm/GCMPreferences;->isSoundEnabled()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->androidBadgeValue:Ljava/lang/String;

    if-nez p1, :cond_8

    const-string p1, "android.resource://com.shopkick.app/2131755013"

    .line 146
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1, v10}, Landroid/support/v4/app/NotificationCompat$Builder;->setSound(Landroid/net/Uri;I)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 148
    :cond_8
    invoke-virtual {v8}, Lcom/shopkick/app/gcm/GCMPreferences;->isVibrateEnabled()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 149
    invoke-virtual {v0, v7}, Landroid/support/v4/app/NotificationCompat$Builder;->setDefaults(I)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 151
    :cond_9
    invoke-virtual {v0}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    invoke-virtual {v2, v10, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    goto :goto_3

    :cond_a
    const-string/jumbo p1, "skos"

    .line 153
    invoke-virtual {v2, p1, v5, v0}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 159
    :goto_3
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x4e2a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 160
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNotificationType(Ljava/lang/Integer;)V

    .line 162
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p0}, Lcom/shopkick/app/gcm/OsNotificationHandler;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "sklogs"

    invoke-static {p1, v0, v1}, Lcom/shopkick/app/application/SKDiskLogger;->saveToDisk(Ljava/util/Map;Landroid/content/Context;Ljava/lang/String;)V

    .line 163
    sget-object p1, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Continue:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    return-object p1
.end method
