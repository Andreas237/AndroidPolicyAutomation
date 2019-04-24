.class public Lcom/huawei/openalliance/ad/g/f;
.super Lcom/huawei/openalliance/ad/g/a;


# instance fields
.field private final b:Lcom/huawei/openalliance/ad/g/h;

.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lcom/huawei/openalliance/ad/g/h;)V
    .locals 7

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/g/a;-><init>()V

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-wide/16 v3, 0x3c

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/g/f;->c:Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lcom/huawei/openalliance/ad/g/f;->b:Lcom/huawei/openalliance/ad/g/h;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/g/f;)Lcom/huawei/openalliance/ad/g/h;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/f;->b:Lcom/huawei/openalliance/ad/g/h;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/openalliance/ad/g/h;
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/f;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/huawei/openalliance/ad/g/f$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/openalliance/ad/g/f$1;-><init>(Lcom/huawei/openalliance/ad/g/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/f;->a:Lcom/huawei/openalliance/ad/g/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/f;->a:Lcom/huawei/openalliance/ad/g/h;

    invoke-interface {v0, p1, p2}, Lcom/huawei/openalliance/ad/g/h;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/openalliance/ad/g/h;

    :cond_0
    return-object p0
.end method

.method public a(Lcom/huawei/openalliance/ad/g/j;ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/f;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/huawei/openalliance/ad/g/f$2;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/g/f$2;-><init>(Lcom/huawei/openalliance/ad/g/f;Lcom/huawei/openalliance/ad/g/j;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/f;->a:Lcom/huawei/openalliance/ad/g/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/f;->a:Lcom/huawei/openalliance/ad/g/h;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/openalliance/ad/g/h;->a(Lcom/huawei/openalliance/ad/g/j;ILjava/lang/String;)V

    :cond_0
    return-void
.end method
