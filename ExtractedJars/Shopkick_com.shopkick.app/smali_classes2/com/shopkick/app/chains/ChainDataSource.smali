.class public Lcom/shopkick/app/chains/ChainDataSource;
.super Ljava/lang/Object;
.source "ChainDataSource.java"

# interfaces
.implements Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;
.implements Lcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field public static final CHAINS_UPDATED_EVENT:Ljava/lang/String; = "chainsUpdatedEvent"


# instance fields
.field private final appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private chainInfoByChainId:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final handler:Landroid/os/Handler;

.field public final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private final notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private final offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;)V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Lcom/shopkick/app/chains/ChainDataSource$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/chains/ChainDataSource$1;-><init>(Lcom/shopkick/app/chains/ChainDataSource;)V

    iput-object v0, p0, Lcom/shopkick/app/chains/ChainDataSource;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 51
    iput-object p1, p0, Lcom/shopkick/app/chains/ChainDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    .line 52
    iput-object p2, p0, Lcom/shopkick/app/chains/ChainDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 53
    iput-object p3, p0, Lcom/shopkick/app/chains/ChainDataSource;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const-string p1, "AppActivityManagerSessionStartEvent"

    .line 55
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "UserAccountIdChangedEvent"

    .line 56
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 58
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/chains/ChainDataSource;->chainInfoByChainId:Ljava/util/HashMap;

    .line 60
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/chains/ChainDataSource;->handler:Landroid/os/Handler;

    .line 61
    iget-object p1, p0, Lcom/shopkick/app/chains/ChainDataSource;->handler:Landroid/os/Handler;

    new-instance p2, Lcom/shopkick/app/chains/ChainDataSource$2;

    invoke-direct {p2, p0}, Lcom/shopkick/app/chains/ChainDataSource$2;-><init>(Lcom/shopkick/app/chains/ChainDataSource;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/chains/ChainDataSource;Landroid/location/Location;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/shopkick/app/chains/ChainDataSource;->handleLocationUpdate(Landroid/location/Location;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/chains/ChainDataSource;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/shopkick/app/chains/ChainDataSource;->startLoad()V

    return-void
.end method

.method private handleLocationUpdate(Landroid/location/Location;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 71
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/chains/ChainDataSource;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {p1, v0}, Lcom/shopkick/sdk/presence/LocationManager;->removeLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    const/4 p1, 0x1

    .line 72
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/chains/ChainDataSource;->syncChains(Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method private startLoad()V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntitiesForOfflineDataCategory(ILcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;)V

    return-void
.end method

.method private syncChains(Ljava/lang/Integer;)V
    .locals 2

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x3

    .line 107
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    iget-object v1, p0, Lcom/shopkick/app/chains/ChainDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-virtual {v1, v0, p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->syncOfflineDataCategories(Ljava/util/List;Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/shopkick/app/offline/OfflineDataStore;->clearCategory(I)V

    .line 81
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainDataSource;->chainInfoByChainId:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public getChainInfo(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainDataSource;->chainInfoByChainId:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;

    return-object p1
.end method

.method public onCategoryReadFromDisk(ILjava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;",
            ">;)V"
        }
    .end annotation

    .line 122
    iget-object p1, p0, Lcom/shopkick/app/chains/ChainDataSource;->chainInfoByChainId:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 124
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    .line 125
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->chainInfo:Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;

    if-nez p2, :cond_0

    goto :goto_0

    .line 127
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainDataSource;->chainInfoByChainId:Ljava/util/HashMap;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 130
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/chains/ChainDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "chainsUpdatedEvent"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 3
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

    .line 141
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, -0xc4b42ca

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p2, v0, :cond_2

    const v0, 0x44e6563

    if-eq p2, v0, :cond_1

    const v0, 0x4bde1661    # 2.9109442E7f

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "AppActivityManagerSessionStartDelayedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v1

    goto :goto_1

    :cond_1
    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v2

    goto :goto_1

    :cond_2
    const-string p2, "firstUseCompletedByUser"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, -0x1

    :goto_1
    const/4 p2, 0x4

    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 159
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/chains/ChainDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "firstUseCompletedByUser"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 160
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/chains/ChainDataSource;->syncChains(Ljava/lang/Integer;)V

    goto :goto_2

    .line 151
    :pswitch_1
    invoke-virtual {p0}, Lcom/shopkick/app/chains/ChainDataSource;->clear()V

    .line 152
    iget-object p1, p0, Lcom/shopkick/app/chains/ChainDataSource;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getFirstUseCompleted()Z

    move-result p1

    if-nez p1, :cond_4

    .line 153
    iget-object p1, p0, Lcom/shopkick/app/chains/ChainDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "firstUseCompletedByUser"

    invoke-virtual {p1, p0, p2, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    goto :goto_2

    .line 155
    :cond_4
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/chains/ChainDataSource;->syncChains(Ljava/lang/Integer;)V

    goto :goto_2

    .line 143
    :pswitch_2
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 145
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/chains/ChainDataSource;->syncChains(Ljava/lang/Integer;)V

    goto :goto_2

    .line 147
    :cond_5
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/chains/ChainDataSource;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {p1, p2}, Lcom/shopkick/sdk/presence/LocationManager;->addLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onSyncFailed(I)V
    .locals 0

    return-void
.end method

.method public onSyncFinished(IZ)V
    .locals 1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    if-eqz p2, :cond_0

    .line 113
    iget-object p2, p0, Lcom/shopkick/app/chains/ChainDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-virtual {p2, p1, p0}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntitiesForOfflineDataCategory(ILcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;)V

    :cond_0
    return-void
.end method
