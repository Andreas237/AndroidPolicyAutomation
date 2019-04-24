.class public Lcom/leisen/wallet/sdk/http/RequestHandle;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final request:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/http/RequestHandle;->request:Ljava/lang/ref/WeakReference;

    .line 10
    return-void
.end method


# virtual methods
.method public cancel(Z)Z
    .locals 2

    .line 13
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/RequestHandle;->request:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;

    .line 14
    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->cancel(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isCancelled()Z
    .locals 2

    .line 23
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/RequestHandle;->request:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;

    .line 24
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isFinished()Z
    .locals 2

    .line 18
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/RequestHandle;->request:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;

    .line 19
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/leisen/wallet/sdk/http/AsyncHttpRequest;->isDone()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public shouldBeGarbageCollected()Z
    .locals 2

    .line 28
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/RequestHandle;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/RequestHandle;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-eqz v1, :cond_2

    .line 30
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/RequestHandle;->request:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V

    .line 31
    :cond_2
    return v1
.end method
