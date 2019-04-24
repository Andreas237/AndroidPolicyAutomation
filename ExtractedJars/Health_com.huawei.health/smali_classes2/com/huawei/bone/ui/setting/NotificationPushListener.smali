.class public Lcom/huawei/bone/ui/setting/NotificationPushListener;
.super Landroid/service/notification/NotificationListenerService;
.source "SourceFile"

# interfaces
.implements Landroid/media/RemoteController$OnClientUpdateListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Z

.field private final e:Lo/dju$e;

.field private h:Lo/djq;

.field private i:Landroid/os/Handler;

.field private k:Landroid/media/RemoteController;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 33
    invoke-direct {p0}, Landroid/service/notification/NotificationListenerService;-><init>()V

    .line 35
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->a:Ljava/lang/String;

    .line 36
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->b:Ljava/lang/String;

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->c:I

    .line 38
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->d:Z

    .line 63
    new-instance v0, Lcom/huawei/bone/ui/setting/NotificationPushListener$2;

    invoke-direct {v0, p0}, Lcom/huawei/bone/ui/setting/NotificationPushListener$2;-><init>(Lcom/huawei/bone/ui/setting/NotificationPushListener;)V

    iput-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->e:Lo/dju$e;

    .line 316
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->h:Lo/djq;

    .line 318
    new-instance v0, Lcom/huawei/bone/ui/setting/NotificationPushListener$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/bone/ui/setting/NotificationPushListener$1;-><init>(Lcom/huawei/bone/ui/setting/NotificationPushListener;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->i:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/bone/ui/setting/NotificationPushListener;)Z
    .locals 1

    .line 33
    iget-boolean v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->d:Z

    return v0
.end method

.method static synthetic b(Lcom/huawei/bone/ui/setting/NotificationPushListener;)Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/bone/ui/setting/NotificationPushListener;)Landroid/os/Handler;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->i:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/bone/ui/setting/NotificationPushListener;Lo/djq;)Lo/djq;
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->h:Lo/djq;

    return-object p1
.end method

.method private c()V
    .locals 4

    .line 309
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter unregistRemoteController"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->k:Landroid/media/RemoteController;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 311
    const-string v0, "audio"

    invoke-virtual {p0, v0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iget-object v1, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->k:Landroid/media/RemoteController;

    .line 312
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->unregisterRemoteController(Landroid/media/RemoteController;)V

    .line 314
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->h:Lo/djq;

    .line 315
    return-void
.end method

.method private c(Landroid/service/notification/StatusBarNotification;)V
    .locals 4

    .line 135
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onNotificationPosted, Notification = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    new-instance v0, Lcom/huawei/bone/ui/setting/NotificationPushListener$3;

    invoke-direct {v0, p0, p1}, Lcom/huawei/bone/ui/setting/NotificationPushListener$3;-><init>(Lcom/huawei/bone/ui/setting/NotificationPushListener;Landroid/service/notification/StatusBarNotification;)V

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I

    .line 188
    return-void
.end method

.method static synthetic d(Lcom/huawei/bone/ui/setting/NotificationPushListener;)I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->c:I

    return v0
.end method

.method static synthetic e(Lcom/huawei/bone/ui/setting/NotificationPushListener;)Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->b:Ljava/lang/String;

    return-object v0
.end method

.method private e()V
    .locals 5

    .line 301
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter registerRemoteController"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    new-instance v0, Landroid/media/RemoteController;

    invoke-direct {v0, p0, p0}, Landroid/media/RemoteController;-><init>(Landroid/content/Context;Landroid/media/RemoteController$OnClientUpdateListener;)V

    iput-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->k:Landroid/media/RemoteController;

    .line 304
    const-string v0, "audio"

    invoke-virtual {p0, v0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iget-object v1, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->k:Landroid/media/RemoteController;

    .line 305
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->registerRemoteController(Landroid/media/RemoteController;)Z

    move-result v4

    .line 306
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerRemoteController result:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    return-void
.end method

.method static synthetic f(Lcom/huawei/bone/ui/setting/NotificationPushListener;)Landroid/media/RemoteController;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->k:Landroid/media/RemoteController;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/bone/ui/setting/NotificationPushListener;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->c()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/bone/ui/setting/NotificationPushListener;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->e()V

    return-void
.end method


# virtual methods
.method public c(Landroid/media/RemoteController$MetadataEditor;)V
    .locals 4

    .line 294
    const-string v0, ""

    const/4 v1, 0x7

    invoke-virtual {p1, v1, v0}, Landroid/media/RemoteController$MetadataEditor;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->a:Ljava/lang/String;

    .line 295
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Music_Title = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    const-string v0, ""

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Landroid/media/RemoteController$MetadataEditor;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->b:Ljava/lang/String;

    .line 297
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Singer_Name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 4

    .line 54
    const-string v0, "health"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBind health !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->e:Lo/dju$e;

    return-object v0

    .line 58
    :cond_0
    invoke-super {p0, p1}, Landroid/service/notification/NotificationListenerService;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public onClientChange(Z)V
    .locals 5

    .line 237
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClientChange result :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    iput-boolean p1, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->d:Z

    .line 240
    if-eqz p1, :cond_0

    .line 241
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->h:Lo/djq;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 243
    :try_start_0
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->h:Lo/djq;

    invoke-interface {v0}, Lo/djq;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 246
    goto :goto_0

    .line 244
    :catch_0
    move-exception v4

    .line 245
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClientChange error "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    :cond_0
    :goto_0
    return-void
.end method

.method public onClientMetadataUpdate(Landroid/media/RemoteController$MetadataEditor;)V
    .locals 5

    .line 280
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClientMetadataUpdate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->a:Ljava/lang/String;

    const-string v1, ""

    const/4 v2, 0x7

    invoke-virtual {p1, v2, v1}, Landroid/media/RemoteController$MetadataEditor;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 282
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClientMetadataUpdate has name"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    invoke-virtual {p0, p1}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->c(Landroid/media/RemoteController$MetadataEditor;)V

    .line 284
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->h:Lo/djq;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 286
    :try_start_0
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->h:Lo/djq;

    invoke-interface {v0}, Lo/djq;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 289
    goto :goto_0

    .line 287
    :catch_0
    move-exception v4

    .line 288
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClientMetadataUpdate error "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    :cond_0
    :goto_0
    return-void
.end method

.method public onClientPlaybackStateUpdate(I)V
    .locals 4

    .line 253
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClientPlaybackStateUpdate result :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    return-void
.end method

.method public onClientPlaybackStateUpdate(IJJF)V
    .locals 5

    .line 258
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClientPlaybackStateUpdate>state  :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    iget v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->c:I

    if-eq v0, p1, :cond_0

    .line 261
    iput p1, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->c:I

    .line 262
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->h:Lo/djq;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 264
    :try_start_0
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener;->h:Lo/djq;

    invoke-interface {v0}, Lo/djq;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 267
    goto :goto_0

    .line 265
    :catch_0
    move-exception v4

    .line 266
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClientMetadataUpdate error "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    :cond_0
    :goto_0
    return-void
.end method

.method public onClientTransportControlUpdate(I)V
    .locals 4

    .line 275
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClientTransportControlUpdate "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    return-void
.end method

.method public onCreate()V
    .locals 4

    .line 42
    invoke-super {p0}, Landroid/service/notification/NotificationListenerService;->onCreate()V

    .line 43
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 121
    invoke-super {p0}, Landroid/service/notification/NotificationListenerService;->onDestroy()V

    .line 122
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    return-void
.end method

.method public onNotificationPosted(Landroid/service/notification/StatusBarNotification;)V
    .locals 5

    .line 128
    :try_start_0
    invoke-direct {p0, p1}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->c(Landroid/service/notification/StatusBarNotification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    goto :goto_0

    .line 129
    :catch_0
    move-exception v4

    .line 130
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onNotificationPosted, Exception = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    :goto_0
    return-void
.end method

.method public onNotificationRemoved(Landroid/service/notification/StatusBarNotification;)V
    .locals 4

    .line 194
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onNotificationRemoved, Notification = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    new-instance v0, Lcom/huawei/bone/ui/setting/NotificationPushListener$5;

    invoke-direct {v0, p0, p1}, Lcom/huawei/bone/ui/setting/NotificationPushListener$5;-><init>(Lcom/huawei/bone/ui/setting/NotificationPushListener;Landroid/service/notification/StatusBarNotification;)V

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I

    .line 233
    return-void
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 4

    .line 48
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUnbind enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    invoke-super {p0, p1}, Landroid/service/notification/NotificationListenerService;->onUnbind(Landroid/content/Intent;)Z

    move-result v0

    return v0
.end method
