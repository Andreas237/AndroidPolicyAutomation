.class public final Lcom/huawei/common/applog/bean/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "ReportApiThreadPoolManager"

.field private static b:Lcom/huawei/common/applog/bean/c; = null


# instance fields
.field private c:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/common/applog/bean/c;->b:Lcom/huawei/common/applog/bean/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/common/applog/bean/c;->c:Ljava/util/concurrent/ExecutorService;

    .line 31
    const-string v0, "ReportApiThreadPoolManager"

    const-string v1, "ReportApiThreadPoolManager init!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/common/applog/bean/c;->c:Ljava/util/concurrent/ExecutorService;

    .line 36
    return-void
.end method

.method public static declared-synchronized a()Lcom/huawei/common/applog/bean/c;
    .locals 4

    const-class v2, Lcom/huawei/common/applog/bean/c;

    monitor-enter v2

    .line 39
    :try_start_0
    sget-object v0, Lcom/huawei/common/applog/bean/c;->b:Lcom/huawei/common/applog/bean/c;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 40
    new-instance v0, Lcom/huawei/common/applog/bean/c;

    invoke-direct {v0}, Lcom/huawei/common/applog/bean/c;-><init>()V

    sput-object v0, Lcom/huawei/common/applog/bean/c;->b:Lcom/huawei/common/applog/bean/c;

    .line 42
    :cond_0
    sget-object v0, Lcom/huawei/common/applog/bean/c;->b:Lcom/huawei/common/applog/bean/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/common/applog/bean/c;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 54
    return-void
.end method
