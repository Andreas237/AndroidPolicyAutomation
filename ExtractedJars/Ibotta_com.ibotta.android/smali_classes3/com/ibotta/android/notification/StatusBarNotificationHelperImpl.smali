.class public Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;
.super Ljava/lang/Object;
.source "StatusBarNotificationHelperImpl.java"

# interfaces
.implements Lcom/ibotta/android/notification/StatusBarNotificationHelper;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field protected lightAllowed:Z

.field private final notificationComposer:Lcom/ibotta/android/notification/composer/NotificationComposer;

.field private final notificationManager:Landroid/app/NotificationManager;

.field private final pushMessageId:I

.field protected soundAllowed:Z

.field protected vibrateAllowed:Z


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/notification/composer/NotificationComposer;Landroid/app/NotificationManager;I)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 35
    iput-object p2, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->notificationComposer:Lcom/ibotta/android/notification/composer/NotificationComposer;

    .line 36
    iput-object p3, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->notificationManager:Landroid/app/NotificationManager;

    .line 37
    iput p4, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->pushMessageId:I

    return-void
.end method


# virtual methods
.method protected buildNotification(Landroid/content/Context;Lcom/ibotta/android/notification/StatusBarNotification;)Landroid/app/Notification;
    .locals 2

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->notificationComposer:Lcom/ibotta/android/notification/composer/NotificationComposer;

    iget-boolean v1, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->soundAllowed:Z

    invoke-interface {v0, v1}, Lcom/ibotta/android/notification/composer/NotificationComposer;->setSoundAllowed(Z)V

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->notificationComposer:Lcom/ibotta/android/notification/composer/NotificationComposer;

    iget-boolean v1, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->vibrateAllowed:Z

    invoke-interface {v0, v1}, Lcom/ibotta/android/notification/composer/NotificationComposer;->setVibrateAllowed(Z)V

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->notificationComposer:Lcom/ibotta/android/notification/composer/NotificationComposer;

    iget-boolean v1, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->lightAllowed:Z

    invoke-interface {v0, v1}, Lcom/ibotta/android/notification/composer/NotificationComposer;->setLightAllowed(Z)V

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->notificationComposer:Lcom/ibotta/android/notification/composer/NotificationComposer;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/notification/composer/NotificationComposer;->buildNotification(Landroid/content/Context;Lcom/ibotta/android/notification/StatusBarNotification;)Landroid/app/Notification;

    move-result-object p1

    return-object p1
.end method

.method protected getNotificationComposer()Lcom/ibotta/android/notification/composer/NotificationComposer;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->notificationComposer:Lcom/ibotta/android/notification/composer/NotificationComposer;

    return-object v0
.end method

.method protected getNotificationManager()Landroid/app/NotificationManager;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->notificationManager:Landroid/app/NotificationManager;

    return-object v0
.end method

.method protected getPushMessageId()I
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 52
    iget v0, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->pushMessageId:I

    return v0
.end method

.method public notify(Landroid/content/Context;Lcom/ibotta/android/notification/StatusBarNotification;)V
    .locals 4

    const/4 v0, 0x0

    .line 73
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v2}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->pushMessageId:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Tag for notification: %1$s"

    const/4 v3, 0x1

    .line 74
    new-array v3, v3, [Ljava/lang/Object;

    aput-object v1, v3, v0

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->buildNotification(Landroid/content/Context;Lcom/ibotta/android/notification/StatusBarNotification;)Landroid/app/Notification;

    move-result-object p1

    .line 77
    iget-object p2, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->notificationManager:Landroid/app/NotificationManager;

    iget v2, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->pushMessageId:I

    invoke-virtual {p2, v1, v2, p1}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Failed to build notification."

    .line 79
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public setLightAllowed(Z)V
    .locals 0

    .line 67
    iput-boolean p1, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->lightAllowed:Z

    return-void
.end method

.method public setSoundAllowed(Z)V
    .locals 0

    .line 57
    iput-boolean p1, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->soundAllowed:Z

    return-void
.end method

.method public setVibrateAllowed(Z)V
    .locals 0

    .line 62
    iput-boolean p1, p0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;->vibrateAllowed:Z

    return-void
.end method
