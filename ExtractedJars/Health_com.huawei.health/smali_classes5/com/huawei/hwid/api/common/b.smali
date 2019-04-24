.class public abstract Lcom/huawei/hwid/api/common/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field protected a:Landroid/content/Context;

.field protected final b:Ljava/util/concurrent/CountDownLatch;

.field protected final c:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/hwid/api/common/b;->b:Ljava/util/concurrent/CountDownLatch;

    .line 30
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/huawei/hwid/api/common/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    iput-object p1, p0, Lcom/huawei/hwid/api/common/b;->a:Landroid/content/Context;

    .line 33
    return-void
.end method

.method private c()V
    .locals 2

    .line 61
    iget-object v0, p0, Lcom/huawei/hwid/api/common/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/huawei/hwid/api/common/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 64
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/api/common/b;->a(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 65
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/b;->a()V

    .line 67
    :cond_0
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .line 73
    const-string v0, "AIDLTask"

    const-string v1, "finishTask"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lcom/huawei/hwid/api/common/b;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/api/common/a;

    move-result-object v2

    .line 75
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 76
    return-void

    .line 78
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/hwid/api/common/a;->b()V

    .line 79
    iget-object v0, p0, Lcom/huawei/hwid/api/common/b;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 80
    iget-object v0, p0, Lcom/huawei/hwid/api/common/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 81
    return-void
.end method

.method abstract a(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
.end method

.method abstract b()V
.end method

.method public run()V
    .locals 5

    .line 42
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/b;->b()V

    .line 44
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/b;->b:Ljava/util/concurrent/CountDownLatch;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2ee0

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v4

    .line 45
    if-nez v4, :cond_0

    .line 46
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/b;->c()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    :cond_0
    goto :goto_0

    .line 48
    :catch_0
    move-exception v4

    .line 49
    const-string v0, "AIDLTask"

    const-string v1, "execute await InterruptedException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/b;->c()V

    .line 52
    :goto_0
    return-void
.end method
