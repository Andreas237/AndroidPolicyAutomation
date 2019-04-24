.class public Lo/esy;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/lang/Object;

.field private static d:Lo/esy;


# instance fields
.field private a:Ljava/util/concurrent/ExecutorService;

.field private c:Lo/eaa;

.field private e:Landroid/content/Context;

.field private h:Lcom/huawei/pluginmessagecenter/service/MessageObserver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const/4 v0, 0x0

    sput-object v0, Lo/esy;->d:Lo/esy;

    .line 39
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/esy;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/esy;->c:Lo/eaa;

    .line 112
    new-instance v0, Lo/esy$5;

    invoke-direct {v0, p0}, Lo/esy$5;-><init>(Lo/esy;)V

    iput-object v0, p0, Lo/esy;->h:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    .line 42
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/esy;->e:Landroid/content/Context;

    .line 43
    iget-object v0, p0, Lo/esy;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    iput-object v0, p0, Lo/esy;->c:Lo/eaa;

    .line 44
    iget-object v0, p0, Lo/esy;->c:Lo/eaa;

    invoke-virtual {v0}, Lo/eaa;->getAdapter()Lo/eab;

    move-result-object v0

    if-nez v0, :cond_0

    .line 45
    iget-object v0, p0, Lo/esy;->c:Lo/eaa;

    new-instance v1, Lo/cwb;

    invoke-direct {v1}, Lo/cwb;-><init>()V

    invoke-virtual {v0, v1}, Lo/eaa;->setAdapter(Lo/eab;)V

    .line 46
    iget-object v0, p0, Lo/esy;->c:Lo/eaa;

    iget-object v1, p0, Lo/esy;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/eaa;->init(Landroid/content/Context;)V

    .line 48
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/esy;)Lo/eaa;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/esy;->c:Lo/eaa;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lo/esy;
    .locals 2

    .line 51
    sget-object v0, Lo/esy;->d:Lo/esy;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 52
    new-instance v0, Lo/esy;

    invoke-direct {v0, p0}, Lo/esy;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/esy;->d:Lo/esy;

    .line 54
    :cond_0
    sget-object v0, Lo/esy;->d:Lo/esy;

    return-object v0
.end method

.method private b()V
    .locals 6

    .line 66
    const-string v0, "UIHLH_NotificationInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMessageNotificationObserver enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    iget-object v0, p0, Lo/esy;->c:Lo/eaa;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/esy;->h:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 68
    const-string v0, "UIHLH_NotificationInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openMessageObserver registerMessageObserver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    iget-object v0, p0, Lo/esy;->c:Lo/eaa;

    iget-object v1, p0, Lo/esy;->h:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    invoke-virtual {v0, v1}, Lo/eaa;->e(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 72
    :cond_0
    sget-object v4, Lo/esy;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 73
    :try_start_0
    iget-object v0, p0, Lo/esy;->a:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/esy;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 74
    :cond_1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/esy;->a:Ljava/util/concurrent/ExecutorService;

    .line 76
    :cond_2
    iget-object v0, p0, Lo/esy;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/esy$3;

    invoke-direct {v1, p0}, Lo/esy$3;-><init>(Lo/esy;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 86
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/esy;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/esy;->e()V

    return-void
.end method

.method private e()V
    .locals 6

    .line 89
    const-string v0, "UIHLH_NotificationInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshNotificationMessage enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    sget-object v4, Lo/esy;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 91
    :try_start_0
    iget-object v0, p0, Lo/esy;->a:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/esy;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/esy;->a:Ljava/util/concurrent/ExecutorService;

    .line 94
    :cond_1
    iget-object v0, p0, Lo/esy;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/esy$2;

    invoke-direct {v1, p0}, Lo/esy$2;-><init>(Lo/esy;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 109
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    .line 58
    sget-object v0, Lo/esy;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 59
    :try_start_0
    iput-object p1, p0, Lo/esy;->a:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 61
    :goto_0
    invoke-direct {p0}, Lo/esy;->b()V

    .line 63
    return-void
.end method

.method public c()V
    .locals 2

    .line 122
    iget-object v0, p0, Lo/esy;->c:Lo/eaa;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/esy;->h:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 123
    iget-object v0, p0, Lo/esy;->c:Lo/eaa;

    iget-object v1, p0, Lo/esy;->h:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    invoke-virtual {v0, v1}, Lo/eaa;->d(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 125
    :cond_0
    return-void
.end method

.method public d()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 145
    iget-object v0, p0, Lo/esy;->c:Lo/eaa;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 146
    const-string v0, "UIHLH_NotificationInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getNotificationMessage result"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    iget-object v0, p0, Lo/esy;->c:Lo/eaa;

    invoke-virtual {v0}, Lo/eaa;->c()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 149
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 5

    .line 131
    const-string v0, "UIHLH_NotificationInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNotificationMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    new-instance v4, Lo/fhd;

    iget-object v0, p0, Lo/esy;->e:Landroid/content/Context;

    invoke-direct {v4, v0, p1}, Lo/fhd;-><init>(Landroid/content/Context;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 133
    invoke-virtual {v4}, Lo/fhd;->d()V

    .line 134
    return-void
.end method
