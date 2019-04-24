.class Lcom/huawei/hwid/core/b/a/e;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field private a:Lcom/huawei/hwid/core/b/a/a;

.field private b:Landroid/os/Handler;

.field private c:Ljava/lang/String;

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Landroid/os/Handler;Ljava/lang/String;)V
    .locals 0

    .line 395
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 396
    iput-object p2, p0, Lcom/huawei/hwid/core/b/a/e;->a:Lcom/huawei/hwid/core/b/a/a;

    .line 397
    iput-object p4, p0, Lcom/huawei/hwid/core/b/a/e;->c:Ljava/lang/String;

    .line 398
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/e;->d:Landroid/content/Context;

    .line 399
    iput-object p3, p0, Lcom/huawei/hwid/core/b/a/e;->b:Landroid/os/Handler;

    .line 400
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 404
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/e;->b:Landroid/os/Handler;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 405
    return-void

    .line 407
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/e;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/e;->a:Lcom/huawei/hwid/core/b/a/a;

    iget-object v2, p0, Lcom/huawei/hwid/core/b/a/e;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    .line 408
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/e;->b:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 413
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/e;->d:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/e;->d:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 414
    const-string v0, "RequestManager"

    const-string v1, "context is finished !!"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 415
    return-void

    .line 418
    :cond_1
    :try_start_2
    iput-object v3, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 419
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/e;->b:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 422
    goto :goto_0

    .line 420
    :catch_0
    move-exception v3

    .line 421
    const-string v0, "RequestManager"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    :goto_0
    return-void
.end method
