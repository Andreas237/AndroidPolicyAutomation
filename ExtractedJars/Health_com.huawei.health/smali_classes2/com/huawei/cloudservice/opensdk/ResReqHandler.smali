.class public abstract Lcom/huawei/cloudservice/opensdk/ResReqHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field a:Z

.field private b:Landroid/os/Bundle;

.field private c:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/cloudservice/opensdk/ResReqHandler;->b:Landroid/os/Bundle;

    .line 18
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/cloudservice/opensdk/ResReqHandler;->a:Z

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/cloudservice/opensdk/ResReqHandler;->c:Landroid/os/Handler;

    .line 22
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 23
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/cloudservice/opensdk/ResReqHandler;->c:Landroid/os/Handler;

    .line 25
    :cond_0
    return-void
.end method


# virtual methods
.method public final finish(Landroid/os/Bundle;)V
    .locals 3

    .line 49
    :try_start_0
    iput-object p1, p0, Lcom/huawei/cloudservice/opensdk/ResReqHandler;->b:Landroid/os/Bundle;

    .line 50
    iget-boolean v0, p0, Lcom/huawei/cloudservice/opensdk/ResReqHandler;->a:Z

    if-eqz v0, :cond_1

    .line 51
    iget-object v0, p0, Lcom/huawei/cloudservice/opensdk/ResReqHandler;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/huawei/cloudservice/opensdk/ResReqHandler;->c:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {p0, p1}, Lcom/huawei/cloudservice/opensdk/ResReqHandler;->onComplete(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    :cond_1
    :goto_0
    goto :goto_1

    .line 57
    :catch_0
    move-exception v2

    .line 58
    const-string v0, "ResReqHandler"

    const-string v1, "Throwable"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    :goto_1
    return-void
.end method

.method public abstract onComplete(Landroid/os/Bundle;)V
.end method

.method public final run()V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/cloudservice/opensdk/ResReqHandler;->b:Landroid/os/Bundle;

    invoke-virtual {p0, v0}, Lcom/huawei/cloudservice/opensdk/ResReqHandler;->onComplete(Landroid/os/Bundle;)V

    .line 65
    return-void
.end method

.method public final setStop()V
    .locals 1

    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/cloudservice/opensdk/ResReqHandler;->a:Z

    .line 40
    return-void
.end method
