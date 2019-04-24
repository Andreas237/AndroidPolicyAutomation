.class public Lcom/usebutton/sdk/internal/NotificationFactory;
.super Ljava/lang/Object;
.source "NotificationFactory.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/NotificationFactory$NotificationFactoryProvider;,
        Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;,
        Lcom/usebutton/sdk/internal/NotificationFactory$NotificationProvider;
    }
.end annotation


# static fields
.field static final NOTIFICATION_CHANNEL_ID:I
    .annotation build Landroid/support/annotation/StringRes;
    .end annotation
.end field

.field static final NOTIFICATION_CHANNEL_NAME:I
    .annotation build Landroid/support/annotation/StringRes;
    .end annotation
.end field

.field private static instance:Lcom/usebutton/sdk/internal/NotificationFactory;


# instance fields
.field private final configuration:Lcom/usebutton/sdk/internal/models/Configuration;

.field private final context:Landroid/content/Context;

.field private final handler:Landroid/os/Handler;

.field private final notificationManager:Landroid/app/NotificationManager;

.field private final notificationManagerCompat:Landroid/support/v4/app/NotificationManagerCompat;

.field private final notificationProvider:Lcom/usebutton/sdk/internal/NotificationFactory$NotificationProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    sget v0, Lcom/usebutton/sdk/R$string;->btn_notification_channel_id:I

    sput v0, Lcom/usebutton/sdk/internal/NotificationFactory;->NOTIFICATION_CHANNEL_ID:I

    .line 31
    sget v0, Lcom/usebutton/sdk/R$string;->btn_notification_channel_title:I

    sput v0, Lcom/usebutton/sdk/internal/NotificationFactory;->NOTIFICATION_CHANNEL_NAME:I

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/os/Handler;Landroid/support/v4/app/NotificationManagerCompat;Landroid/app/NotificationManager;Lcom/usebutton/sdk/internal/NotificationFactory$NotificationProvider;Lcom/usebutton/sdk/internal/models/Configuration;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->context:Landroid/content/Context;

    .line 84
    iput-object p2, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->handler:Landroid/os/Handler;

    .line 85
    iput-object p3, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->notificationManagerCompat:Landroid/support/v4/app/NotificationManagerCompat;

    .line 86
    iput-object p4, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->notificationManager:Landroid/app/NotificationManager;

    .line 87
    iput-object p5, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->notificationProvider:Lcom/usebutton/sdk/internal/NotificationFactory$NotificationProvider;

    .line 88
    iput-object p6, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->configuration:Lcom/usebutton/sdk/internal/models/Configuration;

    return-void
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/NotificationFactory;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3}, Lcom/usebutton/sdk/internal/NotificationFactory;->getLocalizedString(Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/usebutton/sdk/internal/NotificationFactory;Landroid/content/Intent;)Ljava/lang/String;
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/NotificationFactory;->getApplicationName(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Lcom/usebutton/sdk/internal/NotificationFactory;Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/usebutton/sdk/internal/NotificationFactory;->displayNotification(Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private createNotificationChannel()V
    .locals 4
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x1a
    .end annotation

    .line 137
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/NotificationFactory;->getChannelId()Ljava/lang/String;

    move-result-object v0

    .line 138
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/NotificationFactory;->getChannelName()Ljava/lang/String;

    move-result-object v1

    .line 139
    new-instance v2, Landroid/app/NotificationChannel;

    const/4 v3, 0x3

    invoke-direct {v2, v0, v1, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 142
    iget-object v0, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->notificationManager:Landroid/app/NotificationManager;

    invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    return-void
.end method

.method private displayNotification(Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 125
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 126
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/NotificationFactory;->createNotificationChannel()V

    .line 129
    :cond_0
    iget-object v2, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->notificationProvider:Lcom/usebutton/sdk/internal/NotificationFactory$NotificationProvider;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->context:Landroid/content/Context;

    const/4 v8, 0x0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    .line 130
    invoke-interface/range {v2 .. v8}, Lcom/usebutton/sdk/internal/NotificationFactory$NotificationProvider;->getNotification(Landroid/content/Context;Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object p2

    .line 132
    iget-object p3, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->notificationManagerCompat:Landroid/support/v4/app/NotificationManagerCompat;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;->getNotificationId()I

    move-result p1

    invoke-virtual {p3, p1, p2}, Landroid/support/v4/app/NotificationManagerCompat;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method private getApplicationName(Landroid/content/Intent;)Ljava/lang/String;
    .locals 2

    .line 147
    iget-object v0, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 149
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x80

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    .line 151
    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, ""

    return-object p1
.end method

.method private getChannelId()Ljava/lang/String;
    .locals 2

    .line 169
    iget-object v0, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->context:Landroid/content/Context;

    sget v1, Lcom/usebutton/sdk/internal/NotificationFactory;->NOTIFICATION_CHANNEL_ID:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getChannelName()Ljava/lang/String;
    .locals 2

    .line 177
    iget-object v0, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->context:Landroid/content/Context;

    sget v1, Lcom/usebutton/sdk/internal/NotificationFactory;->NOTIFICATION_CHANNEL_NAME:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/usebutton/sdk/internal/NotificationFactory;
    .locals 8

    .line 64
    sget-object v0, Lcom/usebutton/sdk/internal/NotificationFactory;->instance:Lcom/usebutton/sdk/internal/NotificationFactory;

    if-nez v0, :cond_0

    .line 65
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    .line 66
    new-instance p0, Lcom/usebutton/sdk/internal/NotificationFactory;

    new-instance v3, Landroid/os/Handler;

    .line 67
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 68
    invoke-static {v2}, Landroid/support/v4/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroid/support/v4/app/NotificationManagerCompat;

    move-result-object v4

    const-string v0, "notification"

    .line 69
    invoke-virtual {v2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/app/NotificationManager;

    new-instance v6, Lcom/usebutton/sdk/internal/NotificationFactory$NotificationFactoryProvider;

    const/4 v0, 0x0

    invoke-direct {v6, v0}, Lcom/usebutton/sdk/internal/NotificationFactory$NotificationFactoryProvider;-><init>(Lcom/usebutton/sdk/internal/NotificationFactory$1;)V

    .line 71
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v7

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lcom/usebutton/sdk/internal/NotificationFactory;-><init>(Landroid/content/Context;Landroid/os/Handler;Landroid/support/v4/app/NotificationManagerCompat;Landroid/app/NotificationManager;Lcom/usebutton/sdk/internal/NotificationFactory$NotificationProvider;Lcom/usebutton/sdk/internal/models/Configuration;)V

    sput-object p0, Lcom/usebutton/sdk/internal/NotificationFactory;->instance:Lcom/usebutton/sdk/internal/NotificationFactory;

    .line 74
    :cond_0
    sget-object p0, Lcom/usebutton/sdk/internal/NotificationFactory;->instance:Lcom/usebutton/sdk/internal/NotificationFactory;

    return-object p0
.end method

.method private varargs getLocalizedString(Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 2

    .line 160
    iget-object v0, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->configuration:Lcom/usebutton/sdk/internal/models/Configuration;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration;->getCopy()Lcom/usebutton/sdk/internal/models/Configuration$Copy;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->context:Landroid/content/Context;

    .line 161
    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/usebutton/sdk/internal/models/Configuration$Copy;->getFormattedString(Landroid/content/Context;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public areNotificationsEnabled()Z
    .locals 2

    .line 110
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 111
    iget-object v0, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->notificationManager:Landroid/app/NotificationManager;

    .line 112
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/NotificationFactory;->getChannelId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 115
    invoke-virtual {v0}, Landroid/app/NotificationChannel;->getImportance()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 121
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->notificationManagerCompat:Landroid/support/v4/app/NotificationManagerCompat;

    invoke-virtual {v0}, Landroid/support/v4/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v0

    return v0
.end method

.method public displayAppToAppNotification(Landroid/content/Intent;)V
    .locals 4

    .line 95
    iget-object v0, p0, Lcom/usebutton/sdk/internal/NotificationFactory;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/usebutton/sdk/internal/NotificationFactory$1;

    invoke-direct {v1, p0, p1}, Lcom/usebutton/sdk/internal/NotificationFactory$1;-><init>(Lcom/usebutton/sdk/internal/NotificationFactory;Landroid/content/Intent;)V

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
