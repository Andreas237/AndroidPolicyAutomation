.class public Lo/dbc;
.super Landroid/content/ContextWrapper;
.source "SourceFile"


# static fields
.field private static volatile b:Lo/dbc;


# instance fields
.field private a:Ljava/lang/String;

.field private d:Landroid/app/NotificationManager;


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 41
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, v0}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 43
    iput-object p2, p0, Lo/dbc;->a:Ljava/lang/String;

    .line 45
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_3

    .line 46
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 47
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "id or name argument is null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 51
    :cond_2
    :try_start_0
    invoke-direct {p0, p3}, Lo/dbc;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    goto :goto_1

    .line 52
    :catch_0
    move-exception v4

    .line 53
    const-string v0, "NotificationUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    :goto_1
    :try_start_1
    invoke-direct {p0}, Lo/dbc;->c()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 60
    goto :goto_2

    .line 58
    :catch_1
    move-exception v4

    .line 59
    const-string v0, "NotificationUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    :cond_3
    :goto_2
    return-void
.end method

.method private a()Landroid/app/NotificationManager;
    .locals 2

    .line 87
    iget-object v0, p0, Lo/dbc;->d:Landroid/app/NotificationManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 88
    const-string v0, "notification"

    invoke-virtual {p0, v0}, Lo/dbc;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Lo/dbc;->d:Landroid/app/NotificationManager;

    .line 91
    :cond_0
    iget-object v0, p0, Lo/dbc;->d:Landroid/app/NotificationManager;

    return-object v0
.end method

.method private c()V
    .locals 2
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x1a
    .end annotation

    .line 76
    invoke-direct {p0}, Lo/dbc;->a()Landroid/app/NotificationManager;

    move-result-object v0

    const-string v1, "servertoken"

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V

    .line 77
    invoke-direct {p0}, Lo/dbc;->a()Landroid/app/NotificationManager;

    move-result-object v0

    const-string v1, "goal"

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V

    .line 78
    invoke-direct {p0}, Lo/dbc;->a()Landroid/app/NotificationManager;

    move-result-object v0

    const-string v1, "step"

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V

    .line 79
    invoke-direct {p0}, Lo/dbc;->a()Landroid/app/NotificationManager;

    move-result-object v0

    const-string v1, "sportdata"

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V

    .line 80
    invoke-direct {p0}, Lo/dbc;->a()Landroid/app/NotificationManager;

    move-result-object v0

    const-string v1, "device_data_receiver"

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V

    .line 81
    invoke-direct {p0}, Lo/dbc;->a()Landroid/app/NotificationManager;

    move-result-object v0

    const-string v1, "health_device_data_receiver_id"

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V

    .line 83
    invoke-direct {p0}, Lo/dbc;->a()Landroid/app/NotificationManager;

    move-result-object v0

    const-string v1, "miscellaneous"

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V

    .line 84
    return-void
.end method

.method public static d()Lo/dbc;
    .locals 6

    .line 29
    sget-object v0, Lo/dbc;->b:Lo/dbc;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 30
    const-class v4, Lo/dbc;

    monitor-enter v4

    .line 31
    :try_start_0
    sget-object v0, Lo/dbc;->b:Lo/dbc;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 32
    new-instance v0, Lo/dbc;

    const-string v1, "channel_common_id"

    const-string v2, "channel_common_name"

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lo/dbc;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lo/dbc;->b:Lo/dbc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 37
    :cond_1
    :goto_0
    sget-object v0, Lo/dbc;->b:Lo/dbc;

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x1a
    .end annotation

    .line 67
    new-instance v2, Landroid/app/NotificationChannel;

    iget-object v0, p0, Lo/dbc;->a:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-direct {v2, v0, p1, v1}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 68
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    .line 69
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 70
    invoke-direct {p0}, Lo/dbc;->a()Landroid/app/NotificationManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 71
    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 1

    .line 115
    invoke-direct {p0}, Lo/dbc;->a()Landroid/app/NotificationManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 116
    return-void
.end method

.method public b(ILandroid/app/Notification;)V
    .locals 1

    .line 111
    invoke-direct {p0}, Lo/dbc;->a()Landroid/app/NotificationManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 112
    return-void
.end method

.method public e()Landroid/app/Notification$Builder;
    .locals 3

    .line 95
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 96
    new-instance v0, Landroid/app/Notification$Builder;

    invoke-virtual {p0}, Lo/dbc;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/dbc;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0

    .line 98
    :cond_0
    new-instance v0, Landroid/app/Notification$Builder;

    invoke-virtual {p0}, Lo/dbc;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
