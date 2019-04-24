.class public Lcom/shopkick/app/util/ShopkickAppStateProvider;
.super Ljava/lang/Object;
.source "ShopkickAppStateProvider.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/AppStateProvider;


# static fields
.field private static volatile Instance:Lcom/shopkick/app/util/ShopkickAppStateProvider;

.field private static final InstanceLock:Ljava/lang/Object;


# instance fields
.field private final appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private final appEventsHandler:Lcom/shopkick/app/util/INotificationObserver;

.field private final appStateListeners:Ljava/util/concurrent/ConcurrentSkipListSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListSet<",
            "Lcom/shopkick/sdk/presence/AppStateListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/app/util/ShopkickAppStateProvider;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 2

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/util/ShopkickAppStateProvider;->appStateListeners:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 90
    new-instance v0, Lcom/shopkick/app/util/ShopkickAppStateProvider$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/util/ShopkickAppStateProvider$1;-><init>(Lcom/shopkick/app/util/ShopkickAppStateProvider;)V

    iput-object v0, p0, Lcom/shopkick/app/util/ShopkickAppStateProvider;->appEventsHandler:Lcom/shopkick/app/util/INotificationObserver;

    .line 59
    iput-object p1, p0, Lcom/shopkick/app/util/ShopkickAppStateProvider;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 60
    iget-object p1, p0, Lcom/shopkick/app/util/ShopkickAppStateProvider;->appEventsHandler:Lcom/shopkick/app/util/INotificationObserver;

    const-string v0, "AppActivityManagerAppForegroundedEvent"

    const/4 v1, 0x1

    invoke-virtual {p2, p1, v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 61
    iget-object p1, p0, Lcom/shopkick/app/util/ShopkickAppStateProvider;->appEventsHandler:Lcom/shopkick/app/util/INotificationObserver;

    const-string v0, "AppActivityManagerAppBackgroundedEvent"

    invoke-virtual {p2, p1, v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/util/ShopkickAppStateProvider;)Ljava/util/concurrent/ConcurrentSkipListSet;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/shopkick/app/util/ShopkickAppStateProvider;->appStateListeners:Ljava/util/concurrent/ConcurrentSkipListSet;

    return-object p0
.end method

.method public static getInstance()Lcom/shopkick/app/util/ShopkickAppStateProvider;
    .locals 2

    .line 28
    sget-object v0, Lcom/shopkick/app/util/ShopkickAppStateProvider;->Instance:Lcom/shopkick/app/util/ShopkickAppStateProvider;

    if-eqz v0, :cond_0

    .line 31
    sget-object v0, Lcom/shopkick/app/util/ShopkickAppStateProvider;->Instance:Lcom/shopkick/app/util/ShopkickAppStateProvider;

    return-object v0

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "initialize() must be called before getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static initialize(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 2

    if-eqz p0, :cond_3

    if-eqz p1, :cond_2

    .line 49
    sget-object v0, Lcom/shopkick/app/util/ShopkickAppStateProvider;->Instance:Lcom/shopkick/app/util/ShopkickAppStateProvider;

    if-nez v0, :cond_1

    .line 50
    sget-object v0, Lcom/shopkick/app/util/ShopkickAppStateProvider;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 51
    :try_start_0
    sget-object v1, Lcom/shopkick/app/util/ShopkickAppStateProvider;->Instance:Lcom/shopkick/app/util/ShopkickAppStateProvider;

    if-nez v1, :cond_0

    .line 52
    new-instance v1, Lcom/shopkick/app/util/ShopkickAppStateProvider;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/util/ShopkickAppStateProvider;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;)V

    sput-object v1, Lcom/shopkick/app/util/ShopkickAppStateProvider;->Instance:Lcom/shopkick/app/util/ShopkickAppStateProvider;

    .line 54
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void

    .line 45
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'notificationCenter\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 42
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'appActivityManager\' can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public addStateListener(Lcom/shopkick/sdk/presence/AppStateListener;)V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/util/ShopkickAppStateProvider;->appStateListeners:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentSkipListSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public isAppInForeground()Z
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/util/ShopkickAppStateProvider;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public removeStateListener(Lcom/shopkick/sdk/presence/AppStateListener;)V
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/util/ShopkickAppStateProvider;->appStateListeners:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentSkipListSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method
