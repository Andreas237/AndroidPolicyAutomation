.class public Lcom/huawei/qrcode/logic/EventDispatchManager;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/logic/EventDispatchManager$EventDispatchInstance;
    }
.end annotation


# instance fields
.field private lock:[B

.field private mEventsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/qrcode/logic/IEventListener;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/qrcode/logic/EventDispatchManager;->mEventsMap:Ljava/util/Map;

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/qrcode/logic/EventDispatchManager;->lock:[B

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/qrcode/logic/EventDispatchManager$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/EventDispatchManager;-><init>()V

    return-void
.end method

.method private check(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Ljava/lang/System;->getSecurityManager()Ljava/lang/SecurityManager;

    move-result-object v1

    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    invoke-virtual {v1, p1}, Ljava/lang/SecurityManager;->checkSecurityAccess(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;
    .locals 1

    sget-object v0, Lcom/huawei/qrcode/logic/EventDispatchManager$EventDispatchInstance;->instance:Lcom/huawei/qrcode/logic/EventDispatchManager;

    return-object v0
.end method


# virtual methods
.method public addEventListener(Ljava/lang/String;Lcom/huawei/qrcode/logic/IEventListener;)V
    .locals 3

    iget-object v1, p0, Lcom/huawei/qrcode/logic/EventDispatchManager;->lock:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/EventDispatchManager;->mEventsMap:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method public notifyAllEventListener(ILjava/lang/String;)V
    .locals 6

    iget-object v1, p0, Lcom/huawei/qrcode/logic/EventDispatchManager;->lock:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/EventDispatchManager;->mEventsMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/qrcode/logic/IEventListener;

    invoke-interface {v4, p1, p2}, Lcom/huawei/qrcode/logic/IEventListener;->onEventCallBack(ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v1

    throw v5

    :goto_1
    return-void
.end method

.method public notifyEventiListener(Ljava/lang/String;ILjava/lang/String;)V
    .locals 5

    iget-object v2, p0, Lcom/huawei/qrcode/logic/EventDispatchManager;->lock:[B

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/EventDispatchManager;->mEventsMap:Ljava/util/Map;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const-string v0, "EventDispatchManager notifyEventiListener mEventsMap is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-void

    :cond_0
    :try_start_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "EventDispatchManager notifyEventiListener id is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    return-void

    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/huawei/qrcode/logic/EventDispatchManager;->mEventsMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/qrcode/logic/IEventListener;

    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    invoke-interface {v3, p2, p3}, Lcom/huawei/qrcode/logic/IEventListener;->onEventCallBack(ILjava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_2
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    :goto_0
    return-void
.end method

.method public notifyListener(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    iget-object v1, p0, Lcom/huawei/qrcode/logic/EventDispatchManager;->lock:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/EventDispatchManager;->mEventsMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/qrcode/logic/IEventListener;

    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-interface {v2, p2}, Lcom/huawei/qrcode/logic/IEventListener;->onEventNotify(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :goto_0
    return-void
.end method

.method public removeAllEventListener()V
    .locals 3

    iget-object v1, p0, Lcom/huawei/qrcode/logic/EventDispatchManager;->lock:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/EventDispatchManager;->mEventsMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method public removeEventListener(Ljava/lang/String;)V
    .locals 4

    const-string v0, "removeKeyPermission"

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/logic/EventDispatchManager;->check(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/huawei/qrcode/logic/EventDispatchManager;->lock:[B

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/EventDispatchManager;->mEventsMap:Ljava/util/Map;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const-string v0, "EventDispatchManager removeEventListener mEventsMap is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-void

    :cond_0
    :try_start_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "EventDispatchManager removeEventListener id is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    return-void

    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/huawei/qrcode/logic/EventDispatchManager;->mEventsMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    :goto_0
    return-void
.end method
