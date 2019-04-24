.class Lcom/usebutton/sdk/internal/NotificationFactory$NotificationFactoryProvider;
.super Ljava/lang/Object;
.source "NotificationFactory.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/NotificationFactory$NotificationProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/NotificationFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "NotificationFactoryProvider"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/usebutton/sdk/internal/NotificationFactory$1;)V
    .locals 0

    .line 180
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/NotificationFactory$NotificationFactoryProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public getNotification(Landroid/content/Context;Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;
    .locals 1

    .line 187
    sget p2, Lcom/usebutton/sdk/internal/NotificationFactory;->NOTIFICATION_CHANNEL_ID:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 189
    new-instance v0, Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-direct {v0, p1, p2}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sget p2, Lcom/usebutton/sdk/R$drawable;->btn_ic_app_installed_action:I

    .line 190
    invoke-virtual {v0, p2}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object p2

    .line 191
    invoke-virtual {p2, p4}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object p2

    .line 192
    invoke-virtual {p2, p5}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object p2

    .line 193
    invoke-virtual {p2, p6}, Landroid/support/v4/app/NotificationCompat$Builder;->setPriority(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object p2

    const/4 p4, 0x1

    .line 194
    invoke-virtual {p2, p4}, Landroid/support/v4/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object p2

    const/4 p4, -0x1

    const/high16 p5, 0x8000000

    .line 195
    invoke-static {p1, p4, p3, p5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object p1

    .line 197
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    return-object p1
.end method
