.class public Lcom/huawei/openalliance/ad/utils/j;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/utils/j;->a:Landroid/os/Handler;

    return-void
.end method

.method private a()Z
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/j;->a:Landroid/os/Handler;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/j;->a:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    if-ne v0, v2, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 3

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/j;->a(Ljava/lang/Runnable;Ljava/lang/String;J)V

    return-void
.end method

.method public a(Ljava/lang/Runnable;Ljava/lang/String;J)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/j;->a:Landroid/os/Handler;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-gez v0, :cond_2

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_2
    move-wide v0, p3

    :goto_0
    move-wide p3, v0

    new-instance v3, Lcom/huawei/openalliance/ad/utils/ah;

    invoke-direct {v3, p1}, Lcom/huawei/openalliance/ad/utils/ah;-><init>(Ljava/lang/Runnable;)V

    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-nez v0, :cond_3

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/j;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/utils/ah;->run()V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/j;->a:Landroid/os/Handler;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    add-long/2addr v1, p3

    invoke-virtual {v0, v3, p2, v1, v2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    :goto_1
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/j;->a:Landroid/os/Handler;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/j;->a:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method
