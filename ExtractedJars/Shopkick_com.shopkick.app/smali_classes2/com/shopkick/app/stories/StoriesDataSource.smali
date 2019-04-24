.class public Lcom/shopkick/app/stories/StoriesDataSource;
.super Lcom/shopkick/app/application/UserSavedStateDataSource;
.source "StoriesDataSource.java"

# interfaces
.implements Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field public static final STORIES_SAVED_STATE_UPDATED_EVENT:Ljava/lang/String; = "storiesSavedStateUpdated"

.field public static final STORIES_SAVE_DONE_EVENT:Ljava/lang/String; = "storiesSaveDoneEvent"

.field public static final STORIES_SAVE_FAILED_EVENT:Ljava/lang/String; = "storiesSaveFailedEvent"

.field public static final STORIES_SAVE_REQUEST_COMPLETED_EVENT:Ljava/lang/String; = "storiesSaveRequestCompleted"

.field public static final STORIES_UPDATED_EVENT:Ljava/lang/String; = "storiesUpdatedEvent"

.field public static final STORIES_UPDATE_FAILED_EVENT:Ljava/lang/String; = "storesUpdateFailedEvent"

.field public static final STORY_READ_STATE_UPDATED:Ljava/lang/String; = "story_read_state_updated"

.field public static final UPDATED_STORIES_KEYS:Ljava/lang/String; = "updateStoriesKeys"

.field public static final UPDATED_STORY_KEY:Ljava/lang/String; = "updateStoryKey"

.field private static final configAndUserDataPartitions:[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

.field private static final partitionsToFetch:[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;


# instance fields
.field private apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private context:Landroid/content/Context;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private readStories:Lcom/shopkick/app/queue/SKPersistentQueue;

.field private saveStoryRequest:Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;

.field private storyProxyByCacheKeyMap:Landroid/support/v4/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LruCache<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/stories/StoryProxy;",
            ">;"
        }
    .end annotation
.end field

.field private unsaveStoryRequest:Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryRequest;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x4

    .line 50
    new-array v0, v0, [Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    sget-object v1, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->CONFIG:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->USER:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->SOCIAL:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    const/4 v4, 0x2

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->MEMBER:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    const/4 v5, 0x3

    aput-object v1, v0, v5

    sput-object v0, Lcom/shopkick/app/stories/StoriesDataSource;->partitionsToFetch:[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    .line 52
    new-array v0, v4, [Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    sget-object v1, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->CONFIG:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->USER:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/shopkick/app/stories/StoriesDataSource;->configAndUserDataPartitions:[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/SKPersistentCache/APICache;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/fetchers/api/APIManager;Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0

    .line 60
    invoke-direct {p0, p3, p2}, Lcom/shopkick/app/application/UserSavedStateDataSource;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;)V

    .line 61
    iput-object p1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    .line 62
    iput-object p2, p0, Lcom/shopkick/app/stories/StoriesDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 63
    iput-object p3, p0, Lcom/shopkick/app/stories/StoriesDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 64
    iget-object p1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 65
    iput-object p4, p0, Lcom/shopkick/app/stories/StoriesDataSource;->context:Landroid/content/Context;

    .line 66
    iput-object p5, p0, Lcom/shopkick/app/stories/StoriesDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 67
    iput-object p6, p0, Lcom/shopkick/app/stories/StoriesDataSource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 69
    invoke-virtual {p5}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 70
    new-instance p1, Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 71
    invoke-virtual {p5}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object p2

    sget-object p3, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_STRING:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    invoke-direct {p1, p4, p2, p3}, Lcom/shopkick/app/queue/SKPersistentQueue;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;)V

    iput-object p1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->readStories:Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 74
    :cond_0
    new-instance p1, Landroid/support/v4/util/LruCache;

    const/16 p2, 0x64

    invoke-direct {p1, p2}, Landroid/support/v4/util/LruCache;-><init>(I)V

    iput-object p1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->storyProxyByCacheKeyMap:Landroid/support/v4/util/LruCache;

    return-void
.end method

.method private createFakeEntityToken(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/EntityToken;
    .locals 1

    .line 345
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;-><init>()V

    .line 346
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    return-object v0
.end method

.method private createFakeEntityToken(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/EntityToken;
    .locals 1

    .line 351
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;-><init>()V

    .line 352
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    .line 353
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheVersion:Ljava/lang/String;

    return-object v0
.end method

.method private fetchStoryByCacheKeyAndVersion(Ljava/lang/String;Ljava/lang/String;[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V
    .locals 0

    .line 144
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/stories/StoriesDataSource;->createFakeEntityToken(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    move-result-object p1

    .line 145
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 146
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    iget-object p1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    invoke-virtual {p1, p0, p2, p3}, Lcom/shopkick/app/SKPersistentCache/APICache;->fetchObjectsForTokensWithPartitions(Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;Ljava/util/ArrayList;[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V

    return-void
.end method

.method private getConfigDataByToken(Ljava/lang/Object;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;"
        }
    .end annotation

    .line 309
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 310
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesConfigDataResponse;

    .line 311
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesConfigDataResponse;->storiesConfigData:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;

    .line 312
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/StoryConfigData;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private getMemberDataByToken(Ljava/lang/Object;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;"
        }
    .end annotation

    .line 336
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 337
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesMemberDataResponse;

    .line 338
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesMemberDataResponse;->storiesMemberData:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/StoryMemberData;

    .line 339
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/StoryMemberData;->configDataCacheKey:Ljava/lang/String;

    invoke-direct {p0, v2}, Lcom/shopkick/app/stories/StoriesDataSource;->createFakeEntityToken(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private getSocialDataByToken(Ljava/lang/Object;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;"
        }
    .end annotation

    .line 327
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 328
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesSocialDataResponse;

    .line 329
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesSocialDataResponse;->storiesSocialData:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/StorySocialData;

    .line 330
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/StorySocialData;->configDataCacheKey:Ljava/lang/String;

    invoke-direct {p0, v2}, Lcom/shopkick/app/stories/StoriesDataSource;->createFakeEntityToken(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private getStoriesConfigDataRequest(Ljava/util/ArrayList;)Lcom/shopkick/app/fetchers/api/skapi/GetStoriesConfigDataRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/shopkick/app/fetchers/api/skapi/GetStoriesConfigDataRequest;"
        }
    .end annotation

    .line 285
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesConfigDataRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesConfigDataRequest;-><init>()V

    .line 286
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesConfigDataRequest;->cacheKeys:Ljava/util/List;

    return-object v0
.end method

.method private getStoriesMemberDataRequest(Ljava/util/ArrayList;)Lcom/shopkick/app/fetchers/api/skapi/GetStoriesMemberDataRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/shopkick/app/fetchers/api/skapi/GetStoriesMemberDataRequest;"
        }
    .end annotation

    .line 303
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesMemberDataRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesMemberDataRequest;-><init>()V

    .line 304
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesMemberDataRequest;->cacheKeys:Ljava/util/List;

    return-object v0
.end method

.method private getStoriesSocialDataRequest(Ljava/util/ArrayList;)Lcom/shopkick/app/fetchers/api/skapi/GetStoriesSocialDataRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/shopkick/app/fetchers/api/skapi/GetStoriesSocialDataRequest;"
        }
    .end annotation

    .line 297
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesSocialDataRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesSocialDataRequest;-><init>()V

    .line 298
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesSocialDataRequest;->cacheKeys:Ljava/util/List;

    return-object v0
.end method

.method private getStoriesUserDataRequest(Ljava/util/ArrayList;)Lcom/shopkick/app/fetchers/api/skapi/GetStoriesUserDataRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/shopkick/app/fetchers/api/skapi/GetStoriesUserDataRequest;"
        }
    .end annotation

    .line 291
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesUserDataRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesUserDataRequest;-><init>()V

    .line 292
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesUserDataRequest;->cacheKeys:Ljava/util/List;

    return-object v0
.end method

.method private getUserDataByToken(Ljava/lang/Object;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;"
        }
    .end annotation

    .line 318
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 319
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesUserDataResponse;

    .line 320
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoriesUserDataResponse;->storiesUserData:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;

    .line 321
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;->configDataCacheKey:Ljava/lang/String;

    invoke-direct {p0, v2}, Lcom/shopkick/app/stories/StoriesDataSource;->createFakeEntityToken(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private invalidateStoryMembers(Ljava/lang/String;)V
    .locals 4

    .line 404
    invoke-virtual {p0, p1}, Lcom/shopkick/app/stories/StoriesDataSource;->getStoryProxyFromCache(Ljava/lang/String;)Lcom/shopkick/app/stories/StoryProxy;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 408
    iput-object v1, v0, Lcom/shopkick/app/stories/StoryProxy;->storyMemberData:Lcom/shopkick/app/fetchers/api/skapi/StoryMemberData;

    .line 409
    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    const/4 v2, 0x0

    sget-object v3, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->MEMBER:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    aput-object v3, v1, v2

    invoke-virtual {v0, p1, v1}, Lcom/shopkick/app/SKPersistentCache/APICache;->invalidate(Ljava/lang/String;[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->storyProxyByCacheKeyMap:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0}, Landroid/support/v4/util/LruCache;->evictAll()V

    return-void
.end method

.method protected createSaveOrUnsaveRequest(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 3

    if-eqz p2, :cond_1

    .line 92
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p2

    .line 93
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;-><init>()V

    .line 94
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;->cacheKey:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 96
    invoke-virtual {p2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;->latitude:Ljava/lang/Double;

    .line 97
    invoke-virtual {p2}, Landroid/location/Location;->getLongitude()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;->longitude:Ljava/lang/Double;

    :cond_0
    return-object v0

    .line 101
    :cond_1
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryRequest;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryRequest;-><init>()V

    .line 102
    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryRequest;->cacheKey:Ljava/lang/String;

    return-object p2
.end method

.method public destroy()V
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/SKPersistentCache/APICache;->cancelRequestsForTarget(Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;)V

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    const/4 v0, 0x0

    .line 82
    iput-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->storyProxyByCacheKeyMap:Landroid/support/v4/util/LruCache;

    return-void
.end method

.method public fetchFailed(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V
    .locals 0

    .line 277
    iget-object p1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo p2, "storesUpdateFailedEvent"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

.method public fetchOnlyConfigAndUserDataWithToken(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;)V
    .locals 2

    .line 157
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 158
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    iget-object p1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    sget-object v1, Lcom/shopkick/app/stories/StoriesDataSource;->configAndUserDataPartitions:[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    invoke-virtual {p1, p0, v0, v1}, Lcom/shopkick/app/SKPersistentCache/APICache;->fetchObjectsForTokensWithPartitions(Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;Ljava/util/ArrayList;[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V

    return-void
.end method

.method public fetchSocialDataForStories(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            ">;)V"
        }
    .end annotation

    .line 163
    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    sget-object v1, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->SOCIAL:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    invoke-virtual {v0, p0, p1, v1}, Lcom/shopkick/app/SKPersistentCache/APICache;->fetchObjectsForTokensWithPartition(Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;Ljava/util/ArrayList;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V

    return-void
.end method

.method public fetchStoryByCacheKeyAndVersion(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 138
    sget-object v0, Lcom/shopkick/app/stories/StoriesDataSource;->partitionsToFetch:[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/stories/StoriesDataSource;->fetchStoryByCacheKeyAndVersion(Ljava/lang/String;Ljava/lang/String;[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V

    return-void
.end method

.method public fetchStoryWithToken(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;)V
    .locals 2

    .line 151
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 152
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    iget-object p1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    sget-object v1, Lcom/shopkick/app/stories/StoriesDataSource;->partitionsToFetch:[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    invoke-virtual {p1, p0, v0, v1}, Lcom/shopkick/app/SKPersistentCache/APICache;->fetchObjectsForTokensWithPartitions(Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;Ljava/util/ArrayList;[Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V

    return-void
.end method

.method public getRequestForCacheKeysAndPartitionType(Ljava/util/ArrayList;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;",
            ")",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;"
        }
    .end annotation

    .line 224
    sget-object v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->CONFIG:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    if-ne p2, v0, :cond_0

    .line 225
    invoke-direct {p0, p1}, Lcom/shopkick/app/stories/StoriesDataSource;->getStoriesConfigDataRequest(Ljava/util/ArrayList;)Lcom/shopkick/app/fetchers/api/skapi/GetStoriesConfigDataRequest;

    move-result-object p1

    return-object p1

    .line 226
    :cond_0
    sget-object v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->USER:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    if-ne p2, v0, :cond_1

    .line 227
    invoke-direct {p0, p1}, Lcom/shopkick/app/stories/StoriesDataSource;->getStoriesUserDataRequest(Ljava/util/ArrayList;)Lcom/shopkick/app/fetchers/api/skapi/GetStoriesUserDataRequest;

    move-result-object p1

    return-object p1

    .line 228
    :cond_1
    sget-object v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->SOCIAL:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    if-ne p2, v0, :cond_2

    .line 229
    invoke-direct {p0, p1}, Lcom/shopkick/app/stories/StoriesDataSource;->getStoriesSocialDataRequest(Ljava/util/ArrayList;)Lcom/shopkick/app/fetchers/api/skapi/GetStoriesSocialDataRequest;

    move-result-object p1

    return-object p1

    .line 230
    :cond_2
    sget-object v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->MEMBER:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    if-ne p2, v0, :cond_3

    .line 231
    invoke-direct {p0, p1}, Lcom/shopkick/app/stories/StoriesDataSource;->getStoriesMemberDataRequest(Ljava/util/ArrayList;)Lcom/shopkick/app/fetchers/api/skapi/GetStoriesMemberDataRequest;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method protected getRequestItemId(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/String;
    .locals 1

    .line 114
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;

    if-eqz v0, :cond_0

    .line 115
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;->cacheKey:Ljava/lang/String;

    return-object p1

    .line 116
    :cond_0
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryRequest;

    if-eqz v0, :cond_1

    .line 117
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryRequest;->cacheKey:Ljava/lang/String;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected getSaveRequestCompletedNotificationEvent()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "storiesSaveRequestCompleted"

    return-object v0
.end method

.method protected getSaveUpdatedNotificationEvent()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "storiesSavedStateUpdated"

    return-object v0
.end method

.method public getStoryProxyFromCache(Ljava/lang/String;)Lcom/shopkick/app/stories/StoryProxy;
    .locals 4

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 171
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->storyProxyByCacheKeyMap:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/stories/StoryProxy;

    if-eqz v0, :cond_1

    return-object v0

    .line 175
    :cond_1
    invoke-direct {p0, p1}, Lcom/shopkick/app/stories/StoriesDataSource;->createFakeEntityToken(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    move-result-object v0

    .line 176
    new-instance v1, Lcom/shopkick/app/stories/StoryProxy;

    invoke-direct {v1}, Lcom/shopkick/app/stories/StoryProxy;-><init>()V

    .line 177
    iget-object v2, p0, Lcom/shopkick/app/stories/StoriesDataSource;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    sget-object v3, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->CONFIG:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    invoke-virtual {v2, v0, v3}, Lcom/shopkick/app/SKPersistentCache/APICache;->getObjectByEntityTokenAndPartitionType(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/stories/StoryProxy;->update(Ljava/lang/Object;)Z

    .line 178
    iget-object v2, p0, Lcom/shopkick/app/stories/StoriesDataSource;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    sget-object v3, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->USER:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    invoke-virtual {v2, v0, v3}, Lcom/shopkick/app/SKPersistentCache/APICache;->getObjectByEntityTokenAndPartitionType(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/stories/StoryProxy;->update(Ljava/lang/Object;)Z

    .line 179
    iget-object v2, p0, Lcom/shopkick/app/stories/StoriesDataSource;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    sget-object v3, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->SOCIAL:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    invoke-virtual {v2, v0, v3}, Lcom/shopkick/app/SKPersistentCache/APICache;->getObjectByEntityTokenAndPartitionType(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/stories/StoryProxy;->update(Ljava/lang/Object;)Z

    .line 180
    iget-object v2, p0, Lcom/shopkick/app/stories/StoriesDataSource;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    sget-object v3, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->MEMBER:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    invoke-virtual {v2, v0, v3}, Lcom/shopkick/app/SKPersistentCache/APICache;->getObjectByEntityTokenAndPartitionType(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/stories/StoryProxy;->update(Ljava/lang/Object;)Z

    .line 181
    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->storyProxyByCacheKeyMap:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method protected isRequestSaving(Lcom/shopkick/app/fetchers/api/IAPIObject;)Z
    .locals 0

    .line 124
    instance-of p1, p1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;

    return p1
.end method

.method protected isSaveOrUnsaveRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)Z
    .locals 1

    .line 109
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;

    if-nez v0, :cond_1

    instance-of p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryRequest;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public isSaveOrUnsaveRequestInFlight()Z
    .locals 1

    .line 362
    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->saveStoryRequest:Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->unsaveStoryRequest:Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryRequest;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public markStoryAsRead(Ljava/lang/String;)V
    .locals 3

    .line 205
    invoke-virtual {p0, p1}, Lcom/shopkick/app/stories/StoriesDataSource;->storyHasBeenRead(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 206
    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxLookbookHistoryLength:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 207
    iget-object v1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->readStories:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v1}, Lcom/shopkick/app/queue/SKPersistentQueue;->size()I

    move-result v1

    if-lt v1, v0, :cond_0

    .line 208
    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->readStories:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->size()I

    move-result v0

    iget-object v1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->lookbookHistoryTrimmedLength:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sub-int/2addr v0, v1

    .line 209
    iget-object v1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->readStories:Lcom/shopkick/app/queue/SKPersistentQueue;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->removeObjectsInRange(II)V

    .line 211
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->readStories:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/queue/SKPersistentQueue;->addToQueue(Ljava/lang/Object;)V

    .line 212
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v1, "updateStoryKey"

    .line 213
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    iget-object p1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v1, "story_read_state_updated"

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :cond_1
    return-void
.end method

.method public maybeUpdateSocialData(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 188
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/StorySocialData;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/StorySocialData;-><init>()V

    .line 189
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/StorySocialData;->configDataCacheKey:Ljava/lang/String;

    .line 190
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->globalSaveCount:Ljava/lang/Long;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/StorySocialData;->globalSaveCount:Ljava/lang/Long;

    .line 192
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/StorySocialData;->configDataCacheKey:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/shopkick/app/stories/StoriesDataSource;->getStoryProxyFromCache(Ljava/lang/String;)Lcom/shopkick/app/stories/StoryProxy;

    move-result-object v1

    .line 193
    iget-object v2, v1, Lcom/shopkick/app/stories/StoryProxy;->storySocialData:Lcom/shopkick/app/fetchers/api/skapi/StorySocialData;

    if-nez v2, :cond_0

    .line 194
    invoke-virtual {v1, v0}, Lcom/shopkick/app/stories/StoryProxy;->update(Ljava/lang/Object;)Z

    .line 195
    iget-object v1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    sget-object v2, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->SOCIAL:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    invoke-virtual {v1, v2, v0, p1}, Lcom/shopkick/app/SKPersistentCache/APICache;->updatePartition(Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/skapi/EntityToken;)V

    :cond_0
    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
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

    .line 394
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, 0x44e6563

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    .line 396
    :cond_2
    new-instance p1, Lcom/shopkick/app/queue/SKPersistentQueue;

    iget-object p2, p0, Lcom/shopkick/app/stories/StoriesDataSource;->context:Landroid/content/Context;

    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 397
    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_STRING:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    invoke-direct {p1, p2, v0, v1}, Lcom/shopkick/app/queue/SKPersistentQueue;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;)V

    iput-object p1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->readStories:Lcom/shopkick/app/queue/SKPersistentQueue;

    :goto_2
    return-void
.end method

.method public parseResponse(Ljava/lang/Object;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;",
            ")",
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;"
        }
    .end annotation

    .line 238
    sget-object v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->CONFIG:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    if-ne p2, v0, :cond_0

    .line 239
    invoke-direct {p0, p1}, Lcom/shopkick/app/stories/StoriesDataSource;->getConfigDataByToken(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object p1

    return-object p1

    .line 240
    :cond_0
    sget-object v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->USER:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    if-ne p2, v0, :cond_1

    .line 241
    invoke-direct {p0, p1}, Lcom/shopkick/app/stories/StoriesDataSource;->getUserDataByToken(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object p1

    return-object p1

    .line 242
    :cond_1
    sget-object v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->SOCIAL:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    if-ne p2, v0, :cond_2

    .line 243
    invoke-direct {p0, p1}, Lcom/shopkick/app/stories/StoriesDataSource;->getSocialDataByToken(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object p1

    return-object p1

    .line 244
    :cond_2
    sget-object v0, Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;->MEMBER:Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;

    if-ne p2, v0, :cond_3

    .line 245
    invoke-direct {p0, p1}, Lcom/shopkick/app/stories/StoriesDataSource;->getMemberDataByToken(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public receivedObjects(Ljava/util/HashMap;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 256
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 257
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 258
    iget-object v3, p0, Lcom/shopkick/app/stories/StoriesDataSource;->storyProxyByCacheKeyMap:Landroid/support/v4/util/LruCache;

    invoke-virtual {v3, v2}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/stories/StoryProxy;

    if-nez v3, :cond_2

    .line 260
    new-instance v3, Lcom/shopkick/app/stories/StoryProxy;

    invoke-direct {v3}, Lcom/shopkick/app/stories/StoryProxy;-><init>()V

    .line 261
    iget-object v4, p0, Lcom/shopkick/app/stories/StoriesDataSource;->storyProxyByCacheKeyMap:Landroid/support/v4/util/LruCache;

    invoke-virtual {v4, v2, v3}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    :cond_2
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/shopkick/app/stories/StoryProxy;->update(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 264
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 268
    :cond_3
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result p1

    if-lez p1, :cond_4

    .line 269
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v1, "updateStoriesKeys"

    .line 270
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v1, "storiesUpdatedEvent"

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :cond_4
    return-void
.end method

.method public saveStory(Ljava/lang/String;)Z
    .locals 4

    .line 366
    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->saveStoryRequest:Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 370
    :cond_0
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    .line 372
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->saveStoryRequest:Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;

    .line 373
    iget-object v1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->saveStoryRequest:Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;

    iput-object p1, v1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;->cacheKey:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 375
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;->latitude:Ljava/lang/Double;

    .line 376
    iget-object p1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->saveStoryRequest:Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;->longitude:Ljava/lang/Double;

    .line 378
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->saveStoryRequest:Lcom/shopkick/app/fetchers/api/skapi/SaveStoryRequest;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    const/4 p1, 0x1

    return p1
.end method

.method public storyHasBeenRead(Ljava/lang/String;)Z
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->readStories:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/queue/SKPersistentQueue;->containsString(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public unsaveStory(Ljava/lang/String;)Z
    .locals 1

    .line 383
    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->unsaveStoryRequest:Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryRequest;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 386
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->unsaveStoryRequest:Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryRequest;

    .line 387
    iget-object v0, p0, Lcom/shopkick/app/stories/StoriesDataSource;->unsaveStoryRequest:Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryRequest;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UnsaveStoryRequest;->cacheKey:Ljava/lang/String;

    .line 388
    iget-object p1, p0, Lcom/shopkick/app/stories/StoriesDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    const/4 p1, 0x1

    return p1
.end method
