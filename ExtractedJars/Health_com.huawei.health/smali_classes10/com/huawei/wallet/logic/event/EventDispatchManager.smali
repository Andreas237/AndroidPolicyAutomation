.class public Lcom/huawei/wallet/logic/event/EventDispatchManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/wallet/logic/event/EventDispatchManager$EventDispatchInstance;
    }
.end annotation


# instance fields
.field private c:[B

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/wallet/logic/event/IEventListener;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/logic/event/EventDispatchManager;->d:Ljava/util/Map;

    .line 29
    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c:[B

    .line 39
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/wallet/logic/event/EventDispatchManager$1;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/huawei/wallet/logic/event/EventDispatchManager;-><init>()V

    return-void
.end method

.method public static c()Lcom/huawei/wallet/logic/event/EventDispatchManager;
    .locals 1

    .line 49
    sget-object v0, Lcom/huawei/wallet/logic/event/EventDispatchManager$EventDispatchInstance;->b:Lcom/huawei/wallet/logic/event/EventDispatchManager;

    return-object v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 1

    .line 118
    invoke-static {}, Ljava/lang/System;->getSecurityManager()Ljava/lang/SecurityManager;

    move-result-object v0

    .line 119
    if-eqz v0, :cond_0

    .line 121
    invoke-virtual {v0, p1}, Ljava/lang/SecurityManager;->checkSecurityAccess(Ljava/lang/String;)V

    .line 123
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/huawei/wallet/logic/event/IEventListener;)V
    .locals 3

    .line 61
    iget-object v1, p0, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c:[B

    monitor-enter v1

    .line 63
    :try_start_0
    iget-object v0, p0, Lcom/huawei/wallet/logic/event/EventDispatchManager;->d:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 65
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 3

    .line 69
    const-string v0, "removeKeyPermission"

    invoke-direct {p0, v0}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->e(Ljava/lang/String;)V

    .line 70
    iget-object v1, p0, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c:[B

    monitor-enter v1

    .line 72
    :try_start_0
    iget-object v0, p0, Lcom/huawei/wallet/logic/event/EventDispatchManager;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 74
    :goto_0
    return-void
.end method

.method public c(Lcom/huawei/wallet/logic/event/IEventType;Ljava/lang/Object;)V
    .locals 6

    .line 83
    iget-object v1, p0, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c:[B

    monitor-enter v1

    .line 85
    :try_start_0
    iget-object v0, p0, Lcom/huawei/wallet/logic/event/EventDispatchManager;->d:Ljava/util/Map;

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

    .line 87
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/wallet/logic/event/IEventListener;

    .line 88
    invoke-interface {v4, p1, p2}, Lcom/huawei/wallet/logic/event/IEventListener;->onEventCallBack(Lcom/huawei/wallet/logic/event/IEventType;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    goto :goto_0

    .line 90
    :cond_0
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v1

    throw v5

    .line 91
    :goto_1
    return-void
.end method

.method public e(Ljava/lang/String;Lcom/huawei/wallet/logic/event/IEventType;Ljava/lang/Object;)V
    .locals 4

    .line 101
    iget-object v1, p0, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c:[B

    monitor-enter v1

    .line 103
    :try_start_0
    iget-object v0, p0, Lcom/huawei/wallet/logic/event/EventDispatchManager;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/wallet/logic/event/IEventListener;

    .line 104
    if-eqz v2, :cond_0

    .line 106
    invoke-interface {v2, p2, p3}, Lcom/huawei/wallet/logic/event/IEventListener;->onEventCallBack(Lcom/huawei/wallet/logic/event/IEventType;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    .line 109
    :goto_0
    return-void
.end method
