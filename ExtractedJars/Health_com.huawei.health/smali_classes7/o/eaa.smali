.class public Lo/eaa;
.super Lo/eac;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eaa$b;
    }
.end annotation


# static fields
.field private static volatile d:Lo/eaa;


# instance fields
.field private b:Lo/eaa$b;

.field private c:Landroid/content/Context;

.field private e:Ljava/lang/Runnable;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 55
    invoke-direct {p0}, Lo/eac;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eaa;->b:Lo/eaa$b;

    .line 77
    new-instance v0, Lo/eaa$3;

    invoke-direct {v0, p0}, Lo/eaa$3;-><init>(Lo/eaa;)V

    iput-object v0, p0, Lo/eaa;->e:Ljava/lang/Runnable;

    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    .line 57
    return-void
.end method

.method static synthetic b(Lo/eaa;)Landroid/content/Context;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lo/eaa;
    .locals 3

    .line 45
    sget-object v0, Lo/eaa;->d:Lo/eaa;

    if-nez v0, :cond_1

    .line 46
    const-class v1, Lo/eaa;

    monitor-enter v1

    .line 47
    :try_start_0
    sget-object v0, Lo/eaa;->d:Lo/eaa;

    if-nez v0, :cond_0

    .line 48
    new-instance v0, Lo/eaa;

    invoke-direct {v0, p0}, Lo/eaa;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/eaa;->d:Lo/eaa;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 52
    :cond_1
    :goto_0
    sget-object v0, Lo/eaa;->d:Lo/eaa;

    return-object v0
.end method

.method private o()V
    .locals 6

    .line 60
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processSwitchUserOrLanguage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    iget-object v0, p0, Lo/eaa;->b:Lo/eaa$b;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 62
    new-instance v0, Lo/eaa$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/eaa$b;-><init>(Lo/eaa$3;)V

    iput-object v0, p0, Lo/eaa;->b:Lo/eaa$b;

    .line 64
    :cond_0
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 65
    const-string v0, "android.intent.action.CONFIGURATION_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 69
    :try_start_0
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/eaa;->b:Lo/eaa$b;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    goto :goto_0

    .line 70
    :catch_0
    move-exception v5

    .line 71
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IllegalArgument unregisterReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    :goto_0
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/eaa;->b:Lo/eaa$b;

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 74
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lo/eaa;->e:Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 75
    return-void
.end method

.method private p()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 441
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v4

    .line 442
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    const/16 v1, 0x4e29

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_userLabel_key"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 443
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 444
    const-string v0, ",|#"

    invoke-virtual {v5, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    .line 445
    return-object v6

    .line 447
    :cond_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 448
    return-object v6
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 127
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestMessageId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;->getInstance(Landroid/content/Context;)Lcom/huawei/pluginmessagecenter/service/MessageGenerator;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;->requestMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 319
    const-class v4, Lo/eaa;

    monitor-enter v4

    .line 320
    :try_start_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 321
    invoke-direct {p0}, Lo/eaa;->p()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/eaa;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    .line 322
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 323
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 324
    invoke-static {v8}, Lo/eal;->e(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 325
    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 327
    :cond_0
    goto :goto_0

    .line 329
    :cond_1
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInfomationTypeMessageList = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 330
    monitor-exit v4

    return-object v5

    .line 331
    :catchall_0
    move-exception v9

    monitor-exit v4

    throw v9
.end method

.method public a(I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 352
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getConfigurePageMessageList pageType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 456
    const-class v4, Lo/eaa;

    monitor-enter v4

    .line 457
    :try_start_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 458
    invoke-virtual {p0}, Lo/eaa;->a()Ljava/util/List;

    move-result-object v6

    .line 459
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 460
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 461
    invoke-static {v8, p1}, Lo/eal;->e(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v8}, Lo/eaa;->c(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 462
    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 464
    :cond_0
    goto :goto_0

    .line 466
    :cond_1
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInfoMessageListByClassify resultMessageList size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " classify = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 467
    monitor-exit v4

    return-object v5

    .line 468
    :catchall_0
    move-exception v9

    monitor-exit v4

    throw v9
.end method

.method public a(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 360
    const-class v2, Lo/eaa;

    monitor-enter v2

    .line 361
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 362
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/eaa;->c(II)Ljava/util/List;

    move-result-object v4

    .line 363
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 364
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 365
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-virtual {p0, v6, p1}, Lo/eaa;->e(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 366
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 368
    :cond_0
    goto :goto_0

    .line 370
    :cond_1
    monitor-exit v2

    return-object v3

    .line 371
    :catchall_0
    move-exception v7

    monitor-exit v2

    throw v7
.end method

.method public a(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 4

    .line 176
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;->getInstance(Landroid/content/Context;)Lcom/huawei/pluginmessagecenter/service/MessageGenerator;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/pluginmessagecenter/service/MessageGenerator;->generateMessage(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    return v0
.end method

.method public b()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 285
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAdvertisementBannerMessageList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 287
    invoke-direct {p0}, Lo/eaa;->p()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/eaa;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 288
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 289
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 290
    invoke-static {v7}, Lo/eal;->h(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 291
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 293
    :cond_0
    goto :goto_0

    .line 295
    :cond_1
    return-object v4
.end method

.method public b(Ljava/lang/String;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 474
    const-class v4, Lo/eaa;

    monitor-enter v4

    .line 475
    :try_start_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 476
    invoke-virtual {p0}, Lo/eaa;->a()Ljava/util/List;

    move-result-object v6

    .line 477
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 478
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 479
    invoke-static {v8, p1}, Lo/eal;->e(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 480
    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 482
    :cond_0
    goto :goto_0

    .line 484
    :cond_1
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInfoMessageListByClassify resultMessageList size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " classify = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 485
    monitor-exit v4

    return-object v5

    .line 486
    :catchall_0
    move-exception v9

    monitor-exit v4

    throw v9
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 226
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMessage | module = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/eah;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 302
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 303
    invoke-direct {p0}, Lo/eaa;->p()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/eaa;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 304
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 305
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 306
    invoke-static {v7}, Lo/eal;->c(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 307
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 309
    :cond_0
    goto :goto_0

    .line 311
    :cond_1
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getNotificationMessageList = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    return-object v4
.end method

.method public c(II)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 188
    const-class v6, Lo/eaa;

    monitor-enter v6

    .line 189
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMessageList | pageNo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; pageSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    invoke-virtual {p0}, Lo/eaa;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dzz;

    .line 191
    if-nez v7, :cond_0

    .line 192
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginMessageCenterAdapter is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v6

    return-object v0

    .line 196
    :cond_0
    if-ltz p1, :cond_1

    if-gez p2, :cond_2

    .line 197
    :cond_1
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pageNo or pageSize is invalid."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v6

    return-object v0

    .line 200
    :cond_2
    const/4 v0, 0x3

    :try_start_2
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "getLoginInfo"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "getPhoneInfo"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "getDeviceInfo"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-interface {v7, v0}, Lo/dzz;->c([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    .line 202
    const-string v0, "huid"

    invoke-interface {v8, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 203
    const-string v0, "productType"

    invoke-interface {v8, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 204
    invoke-static {v10}, Lo/eai;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 205
    const-string v12, ""

    .line 206
    const-string v0, "deviceModel"

    invoke-interface {v8, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 207
    const-string v0, "deviceModel"

    invoke-interface {v8, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v12

    .line 209
    :cond_3
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMessageList | huid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; deviceIMEI = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "devicesModel= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    move-object v1, v9

    move-object v2, v11

    move-object v3, v12

    move v4, p1

    move/from16 v5, p2

    invoke-virtual/range {v0 .. v5}, Lo/eah;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    monitor-exit v6

    return-object v0

    .line 211
    :catchall_0
    move-exception v13

    monitor-exit v6

    throw v13
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 157
    new-instance v0, Lo/eaa$2;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/eaa$2;-><init>(Lo/eaa;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I

    .line 167
    return-void
.end method

.method public c(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 2

    .line 433
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getInfoRecommend()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 434
    const/4 v0, 0x1

    return v0

    .line 436
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c(Ljava/lang/String;)Z
    .locals 4

    .line 581
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onRead | msgId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 582
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/eah;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public d()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 234
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMessageCenterListMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 236
    invoke-direct {p0}, Lo/eaa;->p()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/eaa;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 237
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 238
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 239
    invoke-static {v7}, Lo/eal;->b(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 240
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 242
    :cond_0
    goto :goto_0

    .line 244
    :cond_1
    return-object v4
.end method

.method public d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 690
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFAQMessageList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 691
    new-instance v0, Lo/eaa$1;

    invoke-direct {v0, p0, p1}, Lo/eaa$1;-><init>(Lo/eaa;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I

    .line 710
    return-void
.end method

.method public d(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V
    .locals 1

    .line 616
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/eah;->a(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 617
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 251
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMessage | module = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    new-instance v0, Lo/eaa$4;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/eaa$4;-><init>(Lo/eaa;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I

    .line 262
    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 4

    .line 597
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onExpired | msgId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 598
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/eah;->e(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public e()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 377
    const-class v2, Lo/eaa;

    monitor-enter v2

    .line 378
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 379
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/eaa;->c(II)Ljava/util/List;

    move-result-object v4

    .line 380
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 381
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 382
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 383
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 385
    :cond_0
    goto :goto_0

    .line 387
    :cond_1
    monitor-exit v2

    return-object v3

    .line 388
    :catchall_0
    move-exception v7

    monitor-exit v2

    throw v7
.end method

.method public e(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V
    .locals 1

    .line 607
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/eah;->d(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 608
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 138
    new-instance v0, Lo/eaa$5;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/eaa$5;-><init>(Lo/eaa;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I

    .line 148
    return-void
.end method

.method public e(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Ljava/util/List;)Z
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 394
    const-class v4, Lo/eaa;

    monitor-enter v4

    .line 395
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgUserLable()Ljava/lang/String;

    move-result-object v5

    .line 396
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 397
    monitor-exit v4

    const/4 v0, 0x1

    return v0

    .line 399
    :cond_0
    const/4 v6, 0x1

    .line 401
    :try_start_1
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 402
    invoke-virtual {v7}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v8

    .line 403
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 404
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 405
    const/4 v10, 0x0

    .line 406
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 407
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    .line 408
    const/4 v12, 0x0

    :goto_1
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v12, v0, :cond_2

    .line 409
    invoke-virtual {v11, v12}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/String;

    .line 410
    move-object/from16 v0, p2

    invoke-interface {v0, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 411
    const/4 v10, 0x1

    .line 412
    goto :goto_2

    .line 408
    :cond_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 416
    :cond_2
    :goto_2
    if-nez v10, :cond_3

    .line 417
    const/4 v6, 0x0

    .line 418
    goto :goto_3

    .line 420
    :cond_3
    goto :goto_0

    .line 423
    :cond_4
    :goto_3
    goto :goto_4

    .line 421
    :catch_0
    move-exception v7

    .line 422
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 424
    :goto_4
    monitor-exit v4

    return v6

    .line 425
    :catchall_0
    move-exception v14

    monitor-exit v4

    throw v14
.end method

.method public e(Ljava/lang/String;)Z
    .locals 4

    .line 586
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onShowSmartCard | msgId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 587
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/eah;->d(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public f()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 545
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 546
    invoke-direct {p0}, Lo/eaa;->p()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/eaa;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 547
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 548
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 549
    invoke-static {v7}, Lo/eal;->i(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 550
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 552
    :cond_0
    goto :goto_0

    .line 554
    :cond_1
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUnmissableTopicList :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 555
    return-object v4
.end method

.method public finish()V
    .locals 4

    .line 109
    invoke-super {p0}, Lo/eac;->finish()V

    .line 110
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    iget-object v0, p0, Lo/eaa;->b:Lo/eaa$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 112
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/eaa;->b:Lo/eaa$b;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 113
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eaa;->b:Lo/eaa$b;

    .line 116
    :cond_0
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    invoke-virtual {v0}, Lo/eah;->c()V

    .line 117
    return-void
.end method

.method public g()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 511
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 512
    invoke-direct {p0}, Lo/eaa;->p()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/eaa;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 513
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 514
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 515
    invoke-static {v7}, Lo/eal;->d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 516
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 518
    :cond_0
    goto :goto_0

    .line 520
    :cond_1
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHomeDialogMessageList = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    return-object v4
.end method

.method public h()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 562
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 563
    invoke-direct {p0}, Lo/eaa;->p()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/eaa;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 564
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 565
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 566
    invoke-static {v7}, Lo/eal;->f(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 567
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 569
    :cond_0
    goto :goto_0

    .line 571
    :cond_1
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOperationPromotionList :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 572
    return-object v4
.end method

.method public i()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 528
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 529
    invoke-direct {p0}, Lo/eaa;->p()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/eaa;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 530
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 531
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 532
    invoke-static {v7}, Lo/eal;->a(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 533
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 535
    :cond_0
    goto :goto_0

    .line 537
    :cond_1
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWonderfulEventList :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 538
    return-object v4
.end method

.method public i(Ljava/lang/String;)Z
    .locals 6

    .line 626
    const-class v4, Lo/eaa;

    monitor-enter v4

    .line 627
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteMessage | msgId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 628
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/eah;->a(Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit v4

    return v0

    .line 630
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method public init(Landroid/content/Context;)V
    .locals 4

    .line 101
    invoke-super {p0, p1}, Lo/eac;->init(Landroid/content/Context;)V

    .line 102
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    invoke-static {}, Lo/eai;->c()V

    .line 104
    invoke-direct {p0}, Lo/eaa;->o()V

    .line 105
    return-void
.end method

.method public k()V
    .locals 3

    .line 648
    const-class v1, Lo/eaa;

    monitor-enter v1

    .line 649
    :try_start_0
    iget-object v0, p0, Lo/eaa;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    invoke-virtual {v0}, Lo/eah;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 650
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 651
    :goto_0
    return-void
.end method
