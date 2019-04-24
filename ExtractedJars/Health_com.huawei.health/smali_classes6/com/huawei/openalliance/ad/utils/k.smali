.class public Lcom/huawei/openalliance/ad/utils/k;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/utils/k$a;
    }
.end annotation


# instance fields
.field private final a:[B

.field private final b:[B

.field private final c:Ljava/lang/String;

.field private d:Lcom/huawei/openalliance/ad/utils/j;

.field private e:Landroid/os/HandlerThread;

.field private f:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/utils/k;->a:[B

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/utils/k;->b:[B

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "handler_exec_thread"

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    iput-object v0, p0, Lcom/huawei/openalliance/ad/utils/k;->c:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/utils/k;Landroid/os/HandlerThread;)Landroid/os/HandlerThread;
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/utils/k;->e:Landroid/os/HandlerThread;

    return-object p1
.end method

.method private a(Lcom/huawei/openalliance/ad/utils/j;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k;->a:[B

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/huawei/openalliance/ad/utils/k;->d:Lcom/huawei/openalliance/ad/utils/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :goto_0
    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/utils/k$a;)V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/utils/k$2;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/utils/k$2;-><init>(Lcom/huawei/openalliance/ad/utils/k;Lcom/huawei/openalliance/ad/utils/k$a;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/utils/k;Lcom/huawei/openalliance/ad/utils/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/utils/k;->a(Lcom/huawei/openalliance/ad/utils/j;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/utils/k;)[B
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k;->b:[B

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/utils/k;)Landroid/os/HandlerThread;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k;->e:Landroid/os/HandlerThread;

    return-object v0
.end method

.method private c()V
    .locals 5

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/k;->f()Lcom/huawei/openalliance/ad/utils/j;

    move-result-object v4

    if-eqz v4, :cond_0

    const-string v0, "HandlerExecAgent"

    const-string v1, "delay quit thread"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/openalliance/ad/utils/k$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/utils/k$1;-><init>(Lcom/huawei/openalliance/ad/utils/k;)V

    const-string v1, "handler_exec_release_task"

    const-wide/32 v2, 0xea60

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/utils/j;->a(Ljava/lang/Runnable;Ljava/lang/String;J)V

    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/utils/k;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/k;->e()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/utils/k;)Lcom/huawei/openalliance/ad/utils/j;
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/k;->f()Lcom/huawei/openalliance/ad/utils/j;

    move-result-object v0

    return-object v0
.end method

.method private d()Z
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/utils/k;->a:[B

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lcom/huawei/openalliance/ad/utils/k;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit v1

    return v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private e()V
    .locals 7

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/k;->d()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lcom/huawei/openalliance/ad/utils/k;->b:[B

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k;->e:Landroid/os/HandlerThread;

    if-nez v0, :cond_2

    const-string v0, "HandlerExecAgent"

    const-string v1, "init handler thread"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Landroid/os/HandlerThread;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k;->c:Ljava/lang/String;

    invoke-direct {v3, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/os/HandlerThread;->start()V

    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v4

    if-eqz v4, :cond_1

    iput-object v3, p0, Lcom/huawei/openalliance/ad/utils/k;->e:Landroid/os/HandlerThread;

    new-instance v5, Landroid/os/Handler;

    invoke-direct {v5, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lcom/huawei/openalliance/ad/utils/j;

    invoke-direct {v0, v5}, Lcom/huawei/openalliance/ad/utils/j;-><init>(Landroid/os/Handler;)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/utils/k;->a(Lcom/huawei/openalliance/ad/utils/j;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Landroid/os/HandlerThread;->quit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v2

    throw v6

    :goto_1
    return-void
.end method

.method private f()Lcom/huawei/openalliance/ad/utils/j;
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/utils/k;->a:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k;->d:Lcom/huawei/openalliance/ad/utils/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a()V
    .locals 8

    iget-object v5, p0, Lcom/huawei/openalliance/ad/utils/k;->a:[B

    monitor-enter v5

    :try_start_0
    iget v0, p0, Lcom/huawei/openalliance/ad/utils/k;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/utils/k;->f:I

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/k;->f()Lcom/huawei/openalliance/ad/utils/j;

    move-result-object v6

    if-eqz v6, :cond_0

    const-string v0, "handler_exec_release_task"

    invoke-virtual {v6, v0}, Lcom/huawei/openalliance/ad/utils/j;->a(Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "HandlerExecAgent"

    const-string v1, "acquire exec agent. ref count: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/huawei/openalliance/ad/utils/k;->f:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 7

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/k;->d()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/k;->f()Lcom/huawei/openalliance/ad/utils/j;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6, p1}, Lcom/huawei/openalliance/ad/utils/j;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/huawei/openalliance/ad/utils/k$a;

    const/4 v1, 0x1

    move-object v2, p1

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/openalliance/ad/utils/k$a;-><init>(ILjava/lang/Runnable;Ljava/lang/String;J)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/utils/k;->a(Lcom/huawei/openalliance/ad/utils/k$a;)V

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/Runnable;Ljava/lang/String;J)V
    .locals 7

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/k;->d()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/k;->f()Lcom/huawei/openalliance/ad/utils/j;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6, p1, p2, p3, p4}, Lcom/huawei/openalliance/ad/utils/j;->a(Ljava/lang/Runnable;Ljava/lang/String;J)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/huawei/openalliance/ad/utils/k$a;

    const/4 v1, 0x1

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/huawei/openalliance/ad/utils/k$a;-><init>(ILjava/lang/Runnable;Ljava/lang/String;J)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/utils/k;->a(Lcom/huawei/openalliance/ad/utils/k$a;)V

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 7

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/k;->d()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/k;->f()Lcom/huawei/openalliance/ad/utils/j;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6, p1}, Lcom/huawei/openalliance/ad/utils/j;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/huawei/openalliance/ad/utils/k$a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    move-object v3, p1

    const-wide/16 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/openalliance/ad/utils/k$a;-><init>(ILjava/lang/Runnable;Ljava/lang/String;J)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/utils/k;->a(Lcom/huawei/openalliance/ad/utils/k$a;)V

    :goto_0
    return-void
.end method

.method public b()V
    .locals 7

    iget-object v5, p0, Lcom/huawei/openalliance/ad/utils/k;->a:[B

    monitor-enter v5

    :try_start_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/k;->d()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "HandlerExecAgent"

    const-string v1, "release exec agent - not working"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v5

    return-void

    :cond_0
    :try_start_1
    iget v0, p0, Lcom/huawei/openalliance/ad/utils/k;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/utils/k;->f:I

    iget v0, p0, Lcom/huawei/openalliance/ad/utils/k;->f:I

    if-gtz v0, :cond_1

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/utils/k;->f:I

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/k;->c()V

    :cond_1
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "HandlerExecAgent"

    const-string v1, "release exec agent - ref count: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/huawei/openalliance/ad/utils/k;->f:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    :goto_0
    return-void
.end method
