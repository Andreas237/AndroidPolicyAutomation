.class public abstract Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;
.super Ljava/lang/Object;
.source "AbstractNotificationComposer.java"

# interfaces
.implements Lcom/ibotta/android/notification/composer/NotificationComposer;


# static fields
.field protected static final VIBRATE_PATTERN:[J


# instance fields
.field private lightAllowed:Z

.field private final notificationChannelId:Ljava/lang/String;

.field private soundAllowed:Z

.field private vibrateAllowed:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x6

    .line 20
    new-array v0, v0, [J

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->VIBRATE_PATTERN:[J

    return-void

    nop

    :array_0
    .array-data 8
        0x0
        0xfa
        0xfa
        0xfa
        0xfa
        0x3e8
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->notificationChannelId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public buildNotification(Landroid/content/Context;Lcom/ibotta/android/notification/StatusBarNotification;)Landroid/app/Notification;
    .locals 1

    .line 46
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->createNotificationBuilder(Landroid/content/Context;Lcom/ibotta/android/notification/StatusBarNotification;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    .line 47
    invoke-virtual {p0, p1, v0, p2}, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->postProcessBuilder(Landroid/content/Context;Landroid/support/v4/app/NotificationCompat$Builder;Lcom/ibotta/android/notification/StatusBarNotification;)V

    .line 49
    invoke-virtual {v0}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    .line 50
    invoke-virtual {p0, p1, v0, p2}, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->postProcessNotification(Landroid/content/Context;Landroid/app/Notification;Lcom/ibotta/android/notification/StatusBarNotification;)V

    return-object v0
.end method

.method protected createBuilder(Landroid/content/Context;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 85
    new-instance v0, Landroid/support/v4/app/NotificationCompat$Builder;

    iget-object v1, p0, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->notificationChannelId:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method protected createNotificationBuilder(Landroid/content/Context;Lcom/ibotta/android/notification/StatusBarNotification;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1

    .line 57
    invoke-virtual {p0, p1}, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->createBuilder(Landroid/content/Context;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object p1

    .line 58
    invoke-virtual {p2}, Lcom/ibotta/android/notification/StatusBarNotification;->getPendingIntent()Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    const/4 v0, 0x1

    .line 59
    invoke-virtual {p1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setOnlyAlertOnce(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 61
    invoke-virtual {p2}, Lcom/ibotta/android/notification/StatusBarNotification;->getSmallIcon()I

    move-result v0

    if-lez v0, :cond_0

    .line 62
    invoke-virtual {p2}, Lcom/ibotta/android/notification/StatusBarNotification;->getSmallIcon()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;

    goto :goto_0

    :cond_0
    const v0, 0x7f0801c4

    .line 64
    invoke-virtual {p1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 67
    :goto_0
    invoke-virtual {p0, p2}, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->shouldPlaySound(Lcom/ibotta/android/notification/StatusBarNotification;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 68
    invoke-virtual {p2}, Lcom/ibotta/android/notification/StatusBarNotification;->getSound()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setSound(Landroid/net/Uri;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 71
    :cond_1
    invoke-virtual {p0, p2}, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->shouldVibrate(Lcom/ibotta/android/notification/StatusBarNotification;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 72
    sget-object v0, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->VIBRATE_PATTERN:[J

    invoke-virtual {p1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setVibrate([J)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 75
    :cond_2
    invoke-virtual {p0, p2}, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->shouldLight(Lcom/ibotta/android/notification/StatusBarNotification;)Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, 0x4

    .line 76
    invoke-virtual {p1, p2}, Landroid/support/v4/app/NotificationCompat$Builder;->setDefaults(I)Landroid/support/v4/app/NotificationCompat$Builder;

    :cond_3
    return-object p1
.end method

.method protected postProcessBuilder(Landroid/content/Context;Landroid/support/v4/app/NotificationCompat$Builder;Lcom/ibotta/android/notification/StatusBarNotification;)V
    .locals 0

    return-void
.end method

.method protected postProcessNotification(Landroid/content/Context;Landroid/app/Notification;Lcom/ibotta/android/notification/StatusBarNotification;)V
    .locals 0

    .line 98
    iget p1, p2, Landroid/app/Notification;->flags:I

    or-int/lit8 p1, p1, 0x10

    iput p1, p2, Landroid/app/Notification;->flags:I

    return-void
.end method

.method public setLightAllowed(Z)V
    .locals 0

    .line 41
    iput-boolean p1, p0, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->lightAllowed:Z

    return-void
.end method

.method public setSoundAllowed(Z)V
    .locals 0

    .line 31
    iput-boolean p1, p0, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->soundAllowed:Z

    return-void
.end method

.method public setVibrateAllowed(Z)V
    .locals 0

    .line 36
    iput-boolean p1, p0, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->vibrateAllowed:Z

    return-void
.end method

.method public shouldLight(Lcom/ibotta/android/notification/StatusBarNotification;)Z
    .locals 0

    .line 124
    invoke-virtual {p1}, Lcom/ibotta/android/notification/StatusBarNotification;->isLight()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->lightAllowed:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected shouldPlaySound(Lcom/ibotta/android/notification/StatusBarNotification;)Z
    .locals 0

    .line 104
    invoke-virtual {p1}, Lcom/ibotta/android/notification/StatusBarNotification;->getSound()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->soundAllowed:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected shouldVibrate(Lcom/ibotta/android/notification/StatusBarNotification;)Z
    .locals 0

    .line 114
    invoke-virtual {p1}, Lcom/ibotta/android/notification/StatusBarNotification;->isVibrate()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->vibrateAllowed:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
