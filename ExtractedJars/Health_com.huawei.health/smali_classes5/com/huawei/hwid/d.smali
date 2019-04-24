.class public final Lcom/huawei/hwid/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwid/c;


# static fields
.field private static final d:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<Ljava/lang/Runnable;>;"
        }
    .end annotation
.end field

.field private static final e:I

.field private static final f:I

.field private static final g:I

.field private static h:Lcom/huawei/hwid/d;


# instance fields
.field private final a:Landroid/os/Handler;

.field private b:Ljava/lang/String;

.field private c:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 31
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    sput-object v0, Lcom/huawei/hwid/d;->d:Ljava/util/concurrent/BlockingQueue;

    .line 32
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, Lcom/huawei/hwid/d;->e:I

    .line 33
    sget v0, Lcom/huawei/hwid/d;->e:I

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x4

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    sput v0, Lcom/huawei/hwid/d;->f:I

    .line 34
    sget v0, Lcom/huawei/hwid/d;->e:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/huawei/hwid/d;->g:I

    return-void
.end method

.method private constructor <init>()V
    .locals 7

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/hwid/d;->a:Landroid/os/Handler;

    .line 28
    const-string v0, "for findbugs should be delete"

    iput-object v0, p0, Lcom/huawei/hwid/d;->b:Ljava/lang/String;

    .line 48
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v1, Lcom/huawei/hwid/d;->f:I

    sget v2, Lcom/huawei/hwid/d;->g:I

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v6, Lcom/huawei/hwid/d;->d:Ljava/util/concurrent/BlockingQueue;

    const-wide/16 v3, 0x1e

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v0, p0, Lcom/huawei/hwid/d;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 51
    return-void
.end method

.method public static a()Lcom/huawei/hwid/d;
    .locals 3

    .line 39
    const-class v1, Lcom/huawei/hwid/d;

    monitor-enter v1

    .line 40
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/d;->h:Lcom/huawei/hwid/d;

    if-nez v0, :cond_0

    .line 41
    new-instance v0, Lcom/huawei/hwid/d;

    invoke-direct {v0}, Lcom/huawei/hwid/d;-><init>()V

    sput-object v0, Lcom/huawei/hwid/d;->h:Lcom/huawei/hwid/d;

    .line 43
    :cond_0
    sget-object v0, Lcom/huawei/hwid/d;->h:Lcom/huawei/hwid/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 44
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic a(Lcom/huawei/hwid/d;)Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/hwid/d;->b:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/os/Bundle;Lcom/huawei/hwid/UseCase$a;)V
    .locals 2

    .line 61
    iget-object v0, p0, Lcom/huawei/hwid/d;->a:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/hwid/d$1;

    invoke-direct {v1, p0, p2, p1}, Lcom/huawei/hwid/d$1;-><init>(Lcom/huawei/hwid/d;Lcom/huawei/hwid/UseCase$a;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 70
    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/hwid/d;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 56
    return-void
.end method

.method public b(Landroid/os/Bundle;Lcom/huawei/hwid/UseCase$a;)V
    .locals 2

    .line 75
    iget-object v0, p0, Lcom/huawei/hwid/d;->a:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/hwid/d$2;

    invoke-direct {v1, p0, p2, p1}, Lcom/huawei/hwid/d$2;-><init>(Lcom/huawei/hwid/d;Lcom/huawei/hwid/UseCase$a;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 84
    return-void
.end method
