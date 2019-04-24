.class public Lcom/shopkick/sdk/zone/ble/BeaconHistory;
.super Ljava/lang/Object;
.source "BeaconHistory.java"

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Map<",
        "Lcom/shopkick/sdk/scanner/Beacon;",
        "Lcom/shopkick/sdk/scanner/ShopBeaconInfo;",
        ">;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "BeaconHistory"

.field private static allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            "Lcom/shopkick/sdk/scanner/ShopBeaconInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final context:Landroid/content/Context;

.field private final executorService:Ljava/util/concurrent/ExecutorService;

.field private final filename:Ljava/lang/String;

.field private saveFuture:Ljava/util/concurrent/Future;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->context:Landroid/content/Context;

    .line 53
    iput-object p2, p0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->filename:Ljava/lang/String;

    .line 54
    iput-object p3, p0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 55
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->loadMap()V

    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    .line 33
    sget-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100(Lcom/shopkick/sdk/zone/ble/BeaconHistory;)Ljava/lang/String;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->filename:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/sdk/zone/ble/BeaconHistory;)Landroid/content/Context;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$300()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .line 33
    sget-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method private loadMap()V
    .locals 3

    .line 59
    sget-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_0

    return-void

    .line 65
    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/ObjectInputStream;

    iget-object v1, p0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->filename:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 66
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    sput-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 69
    :catch_0
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;

    :goto_0
    return-void
.end method

.method private saveToDisk()V
    .locals 2

    .line 74
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->saveFuture:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 77
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/shopkick/sdk/zone/ble/BeaconHistory$1;

    invoke-direct {v1, p0}, Lcom/shopkick/sdk/zone/ble/BeaconHistory$1;-><init>(Lcom/shopkick/sdk/zone/ble/BeaconHistory;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->saveFuture:Ljava/util/concurrent/Future;

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 141
    sget-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 142
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->saveToDisk()V

    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 95
    sget-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 100
    sget-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            "Lcom/shopkick/sdk/scanner/ShopBeaconInfo;",
            ">;>;"
        }
    .end annotation

    .line 106
    sget-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Lcom/shopkick/sdk/scanner/ShopBeaconInfo;
    .locals 1

    .line 111
    sget-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;

    return-object p1
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 33
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->get(Ljava/lang/Object;)Lcom/shopkick/sdk/scanner/ShopBeaconInfo;

    move-result-object p1

    return-object p1
.end method

.method public isEmpty()Z
    .locals 1

    .line 116
    sget-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;"
        }
    .end annotation

    .line 122
    sget-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public put(Lcom/shopkick/sdk/scanner/Beacon;Lcom/shopkick/sdk/scanner/ShopBeaconInfo;)Lcom/shopkick/sdk/scanner/ShopBeaconInfo;
    .locals 1

    .line 147
    sget-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;

    .line 148
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->saveToDisk()V

    return-object p1
.end method

.method public bridge synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 33
    check-cast p1, Lcom/shopkick/sdk/scanner/Beacon;

    check-cast p2, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->put(Lcom/shopkick/sdk/scanner/Beacon;Lcom/shopkick/sdk/scanner/ShopBeaconInfo;)Lcom/shopkick/sdk/scanner/ShopBeaconInfo;

    move-result-object p1

    return-object p1
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            "+",
            "Lcom/shopkick/sdk/scanner/ShopBeaconInfo;",
            ">;)V"
        }
    .end annotation

    .line 154
    sget-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 155
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->saveToDisk()V

    return-void
.end method

.method public remove(Ljava/lang/Object;)Lcom/shopkick/sdk/scanner/ShopBeaconInfo;
    .locals 1

    .line 160
    sget-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;

    .line 161
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->saveToDisk()V

    return-object p1
.end method

.method public bridge synthetic remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 33
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->remove(Ljava/lang/Object;)Lcom/shopkick/sdk/scanner/ShopBeaconInfo;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    .line 127
    sget-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    return v0
.end method

.method public values()Ljava/util/Collection;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/shopkick/sdk/scanner/ShopBeaconInfo;",
            ">;"
        }
    .end annotation

    .line 133
    sget-object v0, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->allSeenBeacons:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
