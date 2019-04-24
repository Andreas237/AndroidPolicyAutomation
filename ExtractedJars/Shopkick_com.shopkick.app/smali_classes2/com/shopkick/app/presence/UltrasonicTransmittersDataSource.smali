.class public Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;
.super Ljava/lang/Object;
.source "UltrasonicTransmittersDataSource.java"

# interfaces
.implements Lcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;
.implements Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field public static final TRANSMITTERS_UPDATED_EVENT:Ljava/lang/String; = "transmittersUpdatedEvent"


# instance fields
.field private allTransmitters:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;",
            ">;"
        }
    .end annotation
.end field

.field private final handler:Landroid/os/Handler;

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private final notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private final offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

.field private prefixMaskForIndex:I

.field private transmittersByPrefix:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 2

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Lcom/shopkick/app/presence/-$$Lambda$jhFex3gsnEBUUFbY1NG5CRHhj-Y;

    invoke-direct {v0, p0}, Lcom/shopkick/app/presence/-$$Lambda$jhFex3gsnEBUUFbY1NG5CRHhj-Y;-><init>(Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;)V

    iput-object v0, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 50
    iput-object p1, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    .line 51
    iput-object p3, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    if-eqz p3, :cond_0

    const-string p1, "AppActivityManagerSessionStartEvent"

    .line 54
    invoke-virtual {p3, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    const/4 p1, -0x1

    .line 58
    iget-object p2, p2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocBitsToIgnore:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    shl-int/2addr p1, p2

    iput p1, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->prefixMaskForIndex:I

    .line 61
    :cond_1
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->handler:Landroid/os/Handler;

    .line 62
    iget-object p1, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->handler:Landroid/os/Handler;

    new-instance p2, Lcom/shopkick/app/presence/-$$Lambda$UltrasonicTransmittersDataSource$3TC7YhBH9RC1TiPUAzUOGc4elvc;

    invoke-direct {p2, p0}, Lcom/shopkick/app/presence/-$$Lambda$UltrasonicTransmittersDataSource$3TC7YhBH9RC1TiPUAzUOGc4elvc;-><init>(Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private buildIndex()V
    .locals 5

    .line 148
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->transmittersByPrefix:Ljava/util/HashMap;

    .line 149
    iget-object v0, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->allTransmitters:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;

    .line 151
    iget v2, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->prefixMaskForIndex:I

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->transmitterId:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->intValue()I

    move-result v3

    and-int/2addr v2, v3

    .line 152
    iget-object v3, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->transmittersByPrefix:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    if-nez v3, :cond_0

    .line 154
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 155
    iget-object v4, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->transmittersByPrefix:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    :cond_0
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic lambda$3TC7YhBH9RC1TiPUAzUOGc4elvc(Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;)V
    .locals 0

    invoke-direct {p0}, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->startLoad()V

    return-void
.end method

.method private startLoad()V
    .locals 2

    .line 115
    iget-object v0, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntitiesForOfflineDataCategory(ILcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;)V

    return-void
.end method

.method private syncDataStore()V
    .locals 3

    .line 119
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x4

    .line 120
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    iget-object v1, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, p0, v2}, Lcom/shopkick/app/offline/OfflineDataStore;->syncOfflineDataCategories(Ljava/util/List;Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    const/4 v0, 0x0

    .line 93
    iput-object v0, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->allTransmitters:Ljava/util/ArrayList;

    .line 94
    iput-object v0, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->transmittersByPrefix:Ljava/util/HashMap;

    return-void
.end method

.method public getAllTransmitters()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;",
            ">;"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->allTransmitters:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getIndex()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;",
            ">;>;"
        }
    .end annotation

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->transmittersByPrefix:Ljava/util/HashMap;

    return-object v0
.end method

.method public getPrefixMaskForIndex()I
    .locals 1

    .line 166
    iget v0, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->prefixMaskForIndex:I

    return v0
.end method

.method public getTransmitters(II)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;",
            ">;"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->allTransmitters:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->transmittersByPrefix:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->prefixMaskForIndex:I

    if-eq v0, p2, :cond_2

    .line 74
    :cond_1
    iput p2, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->prefixMaskForIndex:I

    .line 75
    invoke-direct {p0}, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->buildIndex()V

    .line 78
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->transmittersByPrefix:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    return-object p1
.end method

.method public handleLocationUpdate(Landroid/location/Location;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 87
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {p1, v0}, Lcom/shopkick/sdk/presence/LocationManager;->removeLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 88
    invoke-direct {p0}, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->syncDataStore()V

    :cond_0
    return-void
.end method

.method public onCategoryReadFromDisk(ILjava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;",
            ">;)V"
        }
    .end annotation

    .line 135
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->allTransmitters:Ljava/util/ArrayList;

    .line 136
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    .line 137
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->ultrasonicInfo:Lcom/shopkick/app/fetchers/api/skapi/OfflineUltrasonicInfo;

    if-eqz p2, :cond_0

    .line 138
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OfflineUltrasonicInfo;->ultrasonicTransmitters:Ljava/util/List;

    if-nez v0, :cond_1

    goto :goto_0

    .line 139
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->allTransmitters:Ljava/util/ArrayList;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OfflineUltrasonicInfo;->ultrasonicTransmitters:Ljava/util/List;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 142
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->buildIndex()V

    .line 144
    iget-object p1, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo p2, "transmittersUpdatedEvent"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "AppActivityManagerSessionStartEvent"

    .line 100
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 101
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 103
    invoke-direct {p0}, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->syncDataStore()V

    goto :goto_0

    .line 105
    :cond_0
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {p1, p2}, Lcom/shopkick/sdk/presence/LocationManager;->addLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onSyncFailed(I)V
    .locals 0

    return-void
.end method

.method public onSyncFinished(IZ)V
    .locals 1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    if-eqz p2, :cond_0

    .line 126
    iget-object p2, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-virtual {p2, p1, p0}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntitiesForOfflineDataCategory(ILcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;)V

    :cond_0
    return-void
.end method

.method public setIndex(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;",
            ">;>;)V"
        }
    .end annotation

    .line 174
    iput-object p1, p0, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->transmittersByPrefix:Ljava/util/HashMap;

    return-void
.end method
