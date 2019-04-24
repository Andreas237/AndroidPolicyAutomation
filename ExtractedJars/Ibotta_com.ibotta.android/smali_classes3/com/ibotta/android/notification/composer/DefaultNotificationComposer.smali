.class public Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;
.super Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;
.source "DefaultNotificationComposer.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected buildRemoteViews(Landroid/content/Context;Lcom/ibotta/android/notification/StatusBarNotification;)Landroid/widget/RemoteViews;
    .locals 2

    .line 45
    invoke-virtual {p0, p1}, Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;->createRemoteViews(Landroid/content/Context;)Landroid/widget/RemoteViews;

    move-result-object p1

    const v0, 0x7f090381

    const/high16 v1, 0x7f0e0000

    .line 46
    invoke-virtual {p1, v0, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 47
    invoke-virtual {p2}, Lcom/ibotta/android/notification/StatusBarNotification;->getMessage()Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f090384

    invoke-virtual {p1, v0, p2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    return-object p1
.end method

.method protected createRemoteViews(Landroid/content/Context;)Landroid/widget/RemoteViews;
    .locals 2

    .line 52
    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const v1, 0x7f0c0107

    invoke-direct {v0, p1, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method protected postProcessBuilder(Landroid/content/Context;Landroid/support/v4/app/NotificationCompat$Builder;Lcom/ibotta/android/notification/StatusBarNotification;)V
    .locals 0

    .line 28
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->postProcessBuilder(Landroid/content/Context;Landroid/support/v4/app/NotificationCompat$Builder;Lcom/ibotta/android/notification/StatusBarNotification;)V

    .line 30
    invoke-virtual {p3}, Lcom/ibotta/android/notification/StatusBarNotification;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/support/v4/app/NotificationCompat$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 31
    invoke-virtual {p3}, Lcom/ibotta/android/notification/StatusBarNotification;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    return-void
.end method

.method protected postProcessNotification(Landroid/content/Context;Landroid/app/Notification;Lcom/ibotta/android/notification/StatusBarNotification;)V
    .locals 0

    .line 39
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/notification/composer/AbstractNotificationComposer;->postProcessNotification(Landroid/content/Context;Landroid/app/Notification;Lcom/ibotta/android/notification/StatusBarNotification;)V

    .line 40
    invoke-virtual {p0, p1, p3}, Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;->buildRemoteViews(Landroid/content/Context;Lcom/ibotta/android/notification/StatusBarNotification;)Landroid/widget/RemoteViews;

    move-result-object p1

    .line 41
    iput-object p1, p2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    return-void
.end method
