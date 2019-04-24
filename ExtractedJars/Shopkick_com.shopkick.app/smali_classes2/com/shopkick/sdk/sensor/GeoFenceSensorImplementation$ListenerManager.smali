.class Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;
.super Ljava/lang/Object;
.source "GeoFenceSensorImplementation.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ListenerManager"
.end annotation


# instance fields
.field private final listenersMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            "Ljava/util/Set<",
            "Lcom/shopkick/sdk/sensor/GeoReadingListener;",
            ">;>;"
        }
    .end annotation
.end field

.field private final registeredGeofences:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 313
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 314
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->listenersMap:Ljava/util/Map;

    .line 315
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->registeredGeofences:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method declared-synchronized addListener(Lcom/shopkick/sdk/sensor/GeoFence;Lcom/shopkick/sdk/sensor/GeoReadingListener;)V
    .locals 0

    monitor-enter p0

    .line 348
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->getListeners(Lcom/shopkick/sdk/sensor/GeoFence;)Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 349
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method declared-synchronized getGeoFence(Ljava/lang/String;)Lcom/shopkick/sdk/sensor/GeoFence;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    monitor-enter p0

    .line 332
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->registeredGeofences:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/sdk/sensor/GeoFence;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method declared-synchronized getGeoFences()Ljava/util/Collection;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 328
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->listenersMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized getListeners(Lcom/shopkick/sdk/sensor/GeoFence;)Ljava/util/Collection;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/sdk/sensor/GeoFence;",
            ")",
            "Ljava/util/Collection<",
            "Lcom/shopkick/sdk/sensor/GeoReadingListener;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 319
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->listenersMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    .line 321
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 322
    iget-object v1, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->listenersMap:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 324
    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method declared-synchronized isGeoFenceRegistered(Ljava/lang/String;)Z
    .locals 1

    monitor-enter p0

    .line 344
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->registeredGeofences:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method declared-synchronized registerGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V
    .locals 2

    monitor-enter p0

    .line 336
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->registeredGeofences:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/GeoFence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 337
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method declared-synchronized removeListener(Lcom/shopkick/sdk/sensor/GeoFence;Lcom/shopkick/sdk/sensor/GeoReadingListener;)V
    .locals 1

    monitor-enter p0

    .line 352
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->listenersMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 354
    monitor-exit p0

    return-void

    .line 356
    :cond_0
    :try_start_1
    invoke-interface {p1, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 357
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method declared-synchronized unregisterGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V
    .locals 1

    monitor-enter p0

    .line 340
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation$ListenerManager;->registeredGeofences:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/shopkick/sdk/sensor/GeoFence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 341
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
