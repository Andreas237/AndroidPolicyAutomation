.class public abstract Lcom/shopkick/app/gcm/PushEventHandler;
.super Ljava/lang/Object;
.source "PushEventHandler.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/gcm/PushEventHandler$Progress;
    }
.end annotation


# instance fields
.field private pushEventDispatcherRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/gcm/PushEventDispatcher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract accepts(Lcom/shopkick/app/fetchers/api/skapi/PushMessage;)Z
.end method

.method protected getContext()Landroid/content/Context;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/shopkick/app/gcm/PushEventHandler;->pushEventDispatcherRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/gcm/PushEventDispatcher;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 29
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/gcm/PushEventDispatcher;->context:Landroid/content/Context;

    return-object v0
.end method

.method protected getLoopHandler()Landroid/os/Handler;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/shopkick/app/gcm/PushEventHandler;->pushEventDispatcherRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/gcm/PushEventDispatcher;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 37
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/gcm/PushEventDispatcher;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method protected abstract handle(Lcom/shopkick/app/fetchers/api/skapi/PushMessage;)Lcom/shopkick/app/gcm/PushEventHandler$Progress;
.end method

.method protected handleEvents()Lcom/shopkick/app/gcm/PushEventHandler$Progress;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/shopkick/app/gcm/PushEventHandler;->pushEventDispatcherRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/gcm/PushEventDispatcher;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 45
    :cond_0
    invoke-virtual {v0, p0}, Lcom/shopkick/app/gcm/PushEventDispatcher;->handleEvents(Lcom/shopkick/app/gcm/PushEventHandler;)Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    move-result-object v0

    return-object v0
.end method

.method public onPushEvent(Lcom/shopkick/app/fetchers/api/skapi/PushMessage;)Lcom/shopkick/app/gcm/PushEventHandler$Progress;
    .locals 1

    .line 53
    invoke-virtual {p0, p1}, Lcom/shopkick/app/gcm/PushEventHandler;->accepts(Lcom/shopkick/app/fetchers/api/skapi/PushMessage;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 54
    sget-object p1, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Continue:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    return-object p1

    .line 57
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/gcm/PushEventHandler;->handle(Lcom/shopkick/app/fetchers/api/skapi/PushMessage;)Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 59
    :catch_0
    sget-object p1, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Fail:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    return-object p1
.end method

.method protected setPushEventHandler(Lcom/shopkick/app/gcm/PushEventDispatcher;)V
    .locals 1

    .line 21
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/gcm/PushEventHandler;->pushEventDispatcherRef:Ljava/lang/ref/WeakReference;

    return-void
.end method
