.class public final Lcom/huawei/updatesdk/service/deamon/download/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/updatesdk/service/deamon/download/c$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/huawei/updatesdk/service/deamon/download/c;


# instance fields
.field private final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field private c:Lcom/huawei/updatesdk/service/deamon/download/c$a;

.field private d:Lcom/huawei/updatesdk/service/deamon/download/DownloadService;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/os/Message;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/updatesdk/service/deamon/download/c;

    invoke-direct {v0}, Lcom/huawei/updatesdk/service/deamon/download/c;-><init>()V

    sput-object v0, Lcom/huawei/updatesdk/service/deamon/download/c;->a:Lcom/huawei/updatesdk/service/deamon/download/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/huawei/updatesdk/service/deamon/download/c;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/service/deamon/download/c;->c:Lcom/huawei/updatesdk/service/deamon/download/c$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/service/deamon/download/c;->d:Lcom/huawei/updatesdk/service/deamon/download/DownloadService;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/updatesdk/service/deamon/download/c;->e:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/huawei/updatesdk/service/deamon/download/c;Lcom/huawei/updatesdk/service/deamon/download/DownloadService;)Lcom/huawei/updatesdk/service/deamon/download/DownloadService;
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/deamon/download/c;->d:Lcom/huawei/updatesdk/service/deamon/download/DownloadService;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/updatesdk/service/deamon/download/c;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/deamon/download/c;->e:Ljava/util/List;

    return-object v0
.end method

.method public static a()V
    .locals 4

    const-string v0, "ServiceProxy"

    const-string v1, "start DownloadService"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/a/a;->a()Lcom/huawei/updatesdk/sdk/service/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/a/a;->b()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/updatesdk/service/deamon/download/DownloadService;

    invoke-direct {v3, v2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v2, v3}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public static b()Lcom/huawei/updatesdk/service/deamon/download/c;
    .locals 1

    sget-object v0, Lcom/huawei/updatesdk/service/deamon/download/c;->a:Lcom/huawei/updatesdk/service/deamon/download/c;

    return-object v0
.end method

.method private g()Z
    .locals 4

    iget-object v0, p0, Lcom/huawei/updatesdk/service/deamon/download/c;->c:Lcom/huawei/updatesdk/service/deamon/download/c$a;

    if-nez v0, :cond_0

    const-string v0, "ServiceProxy"

    const-string v1, "bind to DownloadService"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/a/a;->a()Lcom/huawei/updatesdk/sdk/service/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/a/a;->b()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/updatesdk/service/deamon/download/DownloadService;

    invoke-direct {v3, v2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v0, Lcom/huawei/updatesdk/service/deamon/download/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/updatesdk/service/deamon/download/c$a;-><init>(Lcom/huawei/updatesdk/service/deamon/download/c;Lcom/huawei/updatesdk/service/deamon/download/c$1;)V

    iput-object v0, p0, Lcom/huawei/updatesdk/service/deamon/download/c;->c:Lcom/huawei/updatesdk/service/deamon/download/c$a;

    iget-object v0, p0, Lcom/huawei/updatesdk/service/deamon/download/c;->c:Lcom/huawei/updatesdk/service/deamon/download/c$a;

    const/4 v1, 0x1

    invoke-virtual {v2, v3, v0, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method protected c()Lcom/huawei/updatesdk/service/deamon/download/DownloadService;
    .locals 1

    invoke-static {}, Lcom/huawei/updatesdk/service/deamon/download/DownloadService;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/huawei/updatesdk/service/deamon/download/c;->a()V

    :cond_0
    sget-object v0, Lcom/huawei/updatesdk/service/deamon/download/c;->a:Lcom/huawei/updatesdk/service/deamon/download/c;

    iget-object v0, v0, Lcom/huawei/updatesdk/service/deamon/download/c;->d:Lcom/huawei/updatesdk/service/deamon/download/DownloadService;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/deamon/download/c;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-gtz v0, :cond_2

    :cond_1
    sget-object v0, Lcom/huawei/updatesdk/service/deamon/download/c;->a:Lcom/huawei/updatesdk/service/deamon/download/c;

    invoke-direct {v0}, Lcom/huawei/updatesdk/service/deamon/download/c;->g()Z

    const/4 v0, 0x0

    return-object v0

    :cond_2
    sget-object v0, Lcom/huawei/updatesdk/service/deamon/download/c;->a:Lcom/huawei/updatesdk/service/deamon/download/c;

    iget-object v0, v0, Lcom/huawei/updatesdk/service/deamon/download/c;->d:Lcom/huawei/updatesdk/service/deamon/download/DownloadService;

    return-object v0
.end method

.method public d()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/updatesdk/service/deamon/download/c;->c:Lcom/huawei/updatesdk/service/deamon/download/c$a;

    if-eqz v0, :cond_0

    const-string v0, "ServiceProxy"

    const-string v1, "unBind DownloadService"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/a/a;->a()Lcom/huawei/updatesdk/sdk/service/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/a/a;->b()Landroid/content/Context;

    move-result-object v2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/updatesdk/service/deamon/download/c;->c:Lcom/huawei/updatesdk/service/deamon/download/c$a;

    invoke-virtual {v2, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "ServiceProxy"

    const-string v1, "unbindServer IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/service/deamon/download/c;->c:Lcom/huawei/updatesdk/service/deamon/download/c$a;

    iget-object v0, p0, Lcom/huawei/updatesdk/service/deamon/download/c;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    :cond_0
    return-void
.end method

.method public e()Lcom/huawei/updatesdk/service/deamon/download/DownloadService;
    .locals 1

    sget-object v0, Lcom/huawei/updatesdk/service/deamon/download/c;->a:Lcom/huawei/updatesdk/service/deamon/download/c;

    iget-object v0, v0, Lcom/huawei/updatesdk/service/deamon/download/c;->d:Lcom/huawei/updatesdk/service/deamon/download/DownloadService;

    return-object v0
.end method

.method public f()Lcom/huawei/updatesdk/service/deamon/download/DownloadService;
    .locals 2

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/deamon/download/c;->c()Lcom/huawei/updatesdk/service/deamon/download/DownloadService;

    move-result-object v1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/deamon/download/c;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-object v1
.end method
