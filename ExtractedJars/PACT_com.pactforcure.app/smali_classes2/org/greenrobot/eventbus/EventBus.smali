.class public Lorg/greenrobot/eventbus/EventBus;
.super Ljava/lang/Object;
.source "EventBus.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/greenrobot/eventbus/EventBus$PostCallback;,
        Lorg/greenrobot/eventbus/EventBus$PostingThreadState;
    }
.end annotation


# static fields
.field private static final DEFAULT_BUILDER:Lorg/greenrobot/eventbus/EventBusBuilder;

.field public static TAG:Ljava/lang/String;

.field static volatile defaultInstance:Lorg/greenrobot/eventbus/EventBus;

.field private static final eventTypesCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Class",
            "<*>;>;>;"
        }
    .end annotation
.end field


# instance fields
.field private final asyncPoster:Lorg/greenrobot/eventbus/AsyncPoster;

.field private final backgroundPoster:Lorg/greenrobot/eventbus/BackgroundPoster;

.field private final currentPostingThreadState:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Lorg/greenrobot/eventbus/EventBus$PostingThreadState;",
            ">;"
        }
    .end annotation
.end field

.field private final eventInheritance:Z

.field private final executorService:Ljava/util/concurrent/ExecutorService;

.field private final indexCount:I

.field private final logNoSubscriberMessages:Z

.field private final logSubscriberExceptions:Z

.field private final mainThreadPoster:Lorg/greenrobot/eventbus/HandlerPoster;

.field private final sendNoSubscriberEvent:Z

.field private final sendSubscriberExceptionEvent:Z

.field private final stickyEvents:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final subscriberMethodFinder:Lorg/greenrobot/eventbus/SubscriberMethodFinder;

.field private final subscriptionsByEventType:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/util/concurrent/CopyOnWriteArrayList",
            "<",
            "Lorg/greenrobot/eventbus/Subscription;",
            ">;>;"
        }
    .end annotation
.end field

.field private final throwSubscriberException:Z

.field private final typesBySubscriber:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Object;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Class",
            "<*>;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 44
    const-string v0, "EventBus"

    sput-object v0, Lorg/greenrobot/eventbus/EventBus;->TAG:Ljava/lang/String;

    .line 48
    new-instance v0, Lorg/greenrobot/eventbus/EventBusBuilder;

    invoke-direct {v0}, Lorg/greenrobot/eventbus/EventBusBuilder;-><init>()V

    sput-object v0, Lorg/greenrobot/eventbus/EventBus;->DEFAULT_BUILDER:Lorg/greenrobot/eventbus/EventBusBuilder;

    .line 49
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/greenrobot/eventbus/EventBus;->eventTypesCache:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 104
    sget-object v0, Lorg/greenrobot/eventbus/EventBus;->DEFAULT_BUILDER:Lorg/greenrobot/eventbus/EventBusBuilder;

    invoke-direct {p0, v0}, Lorg/greenrobot/eventbus/EventBus;-><init>(Lorg/greenrobot/eventbus/EventBusBuilder;)V

    .line 105
    return-void
.end method

.method constructor <init>(Lorg/greenrobot/eventbus/EventBusBuilder;)V
    .locals 4
    .param p1, "builder"    # Lorg/greenrobot/eventbus/EventBusBuilder;

    .prologue
    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Lorg/greenrobot/eventbus/EventBus$1;

    invoke-direct {v0, p0}, Lorg/greenrobot/eventbus/EventBus$1;-><init>(Lorg/greenrobot/eventbus/EventBus;)V

    iput-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->currentPostingThreadState:Ljava/lang/ThreadLocal;

    .line 108
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->subscriptionsByEventType:Ljava/util/Map;

    .line 109
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->typesBySubscriber:Ljava/util/Map;

    .line 110
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->stickyEvents:Ljava/util/Map;

    .line 111
    new-instance v0, Lorg/greenrobot/eventbus/HandlerPoster;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    const/16 v2, 0xa

    invoke-direct {v0, p0, v1, v2}, Lorg/greenrobot/eventbus/HandlerPoster;-><init>(Lorg/greenrobot/eventbus/EventBus;Landroid/os/Looper;I)V

    iput-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->mainThreadPoster:Lorg/greenrobot/eventbus/HandlerPoster;

    .line 112
    new-instance v0, Lorg/greenrobot/eventbus/BackgroundPoster;

    invoke-direct {v0, p0}, Lorg/greenrobot/eventbus/BackgroundPoster;-><init>(Lorg/greenrobot/eventbus/EventBus;)V

    iput-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->backgroundPoster:Lorg/greenrobot/eventbus/BackgroundPoster;

    .line 113
    new-instance v0, Lorg/greenrobot/eventbus/AsyncPoster;

    invoke-direct {v0, p0}, Lorg/greenrobot/eventbus/AsyncPoster;-><init>(Lorg/greenrobot/eventbus/EventBus;)V

    iput-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->asyncPoster:Lorg/greenrobot/eventbus/AsyncPoster;

    .line 114
    iget-object v0, p1, Lorg/greenrobot/eventbus/EventBusBuilder;->subscriberInfoIndexes:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lorg/greenrobot/eventbus/EventBusBuilder;->subscriberInfoIndexes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    iput v0, p0, Lorg/greenrobot/eventbus/EventBus;->indexCount:I

    .line 115
    new-instance v0, Lorg/greenrobot/eventbus/SubscriberMethodFinder;

    iget-object v1, p1, Lorg/greenrobot/eventbus/EventBusBuilder;->subscriberInfoIndexes:Ljava/util/List;

    iget-boolean v2, p1, Lorg/greenrobot/eventbus/EventBusBuilder;->strictMethodVerification:Z

    iget-boolean v3, p1, Lorg/greenrobot/eventbus/EventBusBuilder;->ignoreGeneratedIndex:Z

    invoke-direct {v0, v1, v2, v3}, Lorg/greenrobot/eventbus/SubscriberMethodFinder;-><init>(Ljava/util/List;ZZ)V

    iput-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->subscriberMethodFinder:Lorg/greenrobot/eventbus/SubscriberMethodFinder;

    .line 117
    iget-boolean v0, p1, Lorg/greenrobot/eventbus/EventBusBuilder;->logSubscriberExceptions:Z

    iput-boolean v0, p0, Lorg/greenrobot/eventbus/EventBus;->logSubscriberExceptions:Z

    .line 118
    iget-boolean v0, p1, Lorg/greenrobot/eventbus/EventBusBuilder;->logNoSubscriberMessages:Z

    iput-boolean v0, p0, Lorg/greenrobot/eventbus/EventBus;->logNoSubscriberMessages:Z

    .line 119
    iget-boolean v0, p1, Lorg/greenrobot/eventbus/EventBusBuilder;->sendSubscriberExceptionEvent:Z

    iput-boolean v0, p0, Lorg/greenrobot/eventbus/EventBus;->sendSubscriberExceptionEvent:Z

    .line 120
    iget-boolean v0, p1, Lorg/greenrobot/eventbus/EventBusBuilder;->sendNoSubscriberEvent:Z

    iput-boolean v0, p0, Lorg/greenrobot/eventbus/EventBus;->sendNoSubscriberEvent:Z

    .line 121
    iget-boolean v0, p1, Lorg/greenrobot/eventbus/EventBusBuilder;->throwSubscriberException:Z

    iput-boolean v0, p0, Lorg/greenrobot/eventbus/EventBus;->throwSubscriberException:Z

    .line 122
    iget-boolean v0, p1, Lorg/greenrobot/eventbus/EventBusBuilder;->eventInheritance:Z

    iput-boolean v0, p0, Lorg/greenrobot/eventbus/EventBus;->eventInheritance:Z

    .line 123
    iget-object v0, p1, Lorg/greenrobot/eventbus/EventBusBuilder;->executorService:Ljava/util/concurrent/ExecutorService;

    iput-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 124
    return-void

    .line 114
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static addInterfaces(Ljava/util/List;[Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Class",
            "<*>;>;[",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 460
    .local p0, "eventTypes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Class<*>;>;"
    .local p1, "interfaces":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    array-length v2, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v0, p1, v1

    .line 461
    .local v0, "interfaceClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 462
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 463
    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v3

    invoke-static {p0, v3}, Lorg/greenrobot/eventbus/EventBus;->addInterfaces(Ljava/util/List;[Ljava/lang/Class;)V

    .line 460
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 466
    .end local v0    # "interfaceClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_1
    return-void
.end method

.method public static builder()Lorg/greenrobot/eventbus/EventBusBuilder;
    .locals 1

    .prologue
    .line 90
    new-instance v0, Lorg/greenrobot/eventbus/EventBusBuilder;

    invoke-direct {v0}, Lorg/greenrobot/eventbus/EventBusBuilder;-><init>()V

    return-object v0
.end method

.method private checkPostStickyEventToSubscription(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;)V
    .locals 2
    .param p1, "newSubscription"    # Lorg/greenrobot/eventbus/Subscription;
    .param p2, "stickyEvent"    # Ljava/lang/Object;

    .prologue
    .line 196
    if-eqz p2, :cond_0

    .line 199
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-direct {p0, p1, p2, v0}, Lorg/greenrobot/eventbus/EventBus;->postToSubscription(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;Z)V

    .line 201
    :cond_0
    return-void

    .line 199
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static clearCaches()V
    .locals 1

    .prologue
    .line 95
    invoke-static {}, Lorg/greenrobot/eventbus/SubscriberMethodFinder;->clearCaches()V

    .line 96
    sget-object v0, Lorg/greenrobot/eventbus/EventBus;->eventTypesCache:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 97
    return-void
.end method

.method public static getDefault()Lorg/greenrobot/eventbus/EventBus;
    .locals 2

    .prologue
    .line 79
    sget-object v0, Lorg/greenrobot/eventbus/EventBus;->defaultInstance:Lorg/greenrobot/eventbus/EventBus;

    if-nez v0, :cond_1

    .line 80
    const-class v1, Lorg/greenrobot/eventbus/EventBus;

    monitor-enter v1

    .line 81
    :try_start_0
    sget-object v0, Lorg/greenrobot/eventbus/EventBus;->defaultInstance:Lorg/greenrobot/eventbus/EventBus;

    if-nez v0, :cond_0

    .line 82
    new-instance v0, Lorg/greenrobot/eventbus/EventBus;

    invoke-direct {v0}, Lorg/greenrobot/eventbus/EventBus;-><init>()V

    sput-object v0, Lorg/greenrobot/eventbus/EventBus;->defaultInstance:Lorg/greenrobot/eventbus/EventBus;

    .line 84
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    :cond_1
    sget-object v0, Lorg/greenrobot/eventbus/EventBus;->defaultInstance:Lorg/greenrobot/eventbus/EventBus;

    return-object v0

    .line 84
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private handleSubscriberException(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 4
    .param p1, "subscription"    # Lorg/greenrobot/eventbus/Subscription;
    .param p2, "event"    # Ljava/lang/Object;
    .param p3, "cause"    # Ljava/lang/Throwable;

    .prologue
    .line 494
    instance-of v1, p2, Lorg/greenrobot/eventbus/SubscriberExceptionEvent;

    if-eqz v1, :cond_1

    .line 495
    iget-boolean v1, p0, Lorg/greenrobot/eventbus/EventBus;->logSubscriberExceptions:Z

    if-eqz v1, :cond_0

    .line 497
    sget-object v1, Lorg/greenrobot/eventbus/EventBus;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SubscriberExceptionEvent subscriber "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lorg/greenrobot/eventbus/Subscription;->subscriber:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " threw an exception"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v0, p2

    .line 499
    check-cast v0, Lorg/greenrobot/eventbus/SubscriberExceptionEvent;

    .line 500
    .local v0, "exEvent":Lorg/greenrobot/eventbus/SubscriberExceptionEvent;
    sget-object v1, Lorg/greenrobot/eventbus/EventBus;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Initial event "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v0, Lorg/greenrobot/eventbus/SubscriberExceptionEvent;->causingEvent:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " caused exception in "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v0, Lorg/greenrobot/eventbus/SubscriberExceptionEvent;->causingSubscriber:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lorg/greenrobot/eventbus/SubscriberExceptionEvent;->throwable:Ljava/lang/Throwable;

    invoke-static {v1, v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 517
    .end local v0    # "exEvent":Lorg/greenrobot/eventbus/SubscriberExceptionEvent;
    :cond_0
    :goto_0
    return-void

    .line 504
    :cond_1
    iget-boolean v1, p0, Lorg/greenrobot/eventbus/EventBus;->throwSubscriberException:Z

    if-eqz v1, :cond_2

    .line 505
    new-instance v1, Lorg/greenrobot/eventbus/EventBusException;

    const-string v2, "Invoking subscriber failed"

    invoke-direct {v1, v2, p3}, Lorg/greenrobot/eventbus/EventBusException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 507
    :cond_2
    iget-boolean v1, p0, Lorg/greenrobot/eventbus/EventBus;->logSubscriberExceptions:Z

    if-eqz v1, :cond_3

    .line 508
    sget-object v1, Lorg/greenrobot/eventbus/EventBus;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not dispatch event: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " to subscribing class "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lorg/greenrobot/eventbus/Subscription;->subscriber:Ljava/lang/Object;

    .line 509
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 508
    invoke-static {v1, v2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 511
    :cond_3
    iget-boolean v1, p0, Lorg/greenrobot/eventbus/EventBus;->sendSubscriberExceptionEvent:Z

    if-eqz v1, :cond_0

    .line 512
    new-instance v0, Lorg/greenrobot/eventbus/SubscriberExceptionEvent;

    iget-object v1, p1, Lorg/greenrobot/eventbus/Subscription;->subscriber:Ljava/lang/Object;

    invoke-direct {v0, p0, p3, p2, v1}, Lorg/greenrobot/eventbus/SubscriberExceptionEvent;-><init>(Lorg/greenrobot/eventbus/EventBus;Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 514
    .restart local v0    # "exEvent":Lorg/greenrobot/eventbus/SubscriberExceptionEvent;
    invoke-virtual {p0, v0}, Lorg/greenrobot/eventbus/EventBus;->post(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private static lookupAllEventTypes(Ljava/lang/Class;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Class",
            "<*>;>;"
        }
    .end annotation

    .prologue
    .line 442
    .local p0, "eventClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    sget-object v3, Lorg/greenrobot/eventbus/EventBus;->eventTypesCache:Ljava/util/Map;

    monitor-enter v3

    .line 443
    :try_start_0
    sget-object v2, Lorg/greenrobot/eventbus/EventBus;->eventTypesCache:Ljava/util/Map;

    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 444
    .local v1, "eventTypes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Class<*>;>;"
    if-nez v1, :cond_1

    .line 445
    new-instance v1, Ljava/util/ArrayList;

    .end local v1    # "eventTypes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Class<*>;>;"
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 446
    .restart local v1    # "eventTypes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Class<*>;>;"
    move-object v0, p0

    .line 447
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_0
    if-eqz v0, :cond_0

    .line 448
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 449
    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v2

    invoke-static {v1, v2}, Lorg/greenrobot/eventbus/EventBus;->addInterfaces(Ljava/util/List;[Ljava/lang/Class;)V

    .line 450
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    .line 452
    :cond_0
    sget-object v2, Lorg/greenrobot/eventbus/EventBus;->eventTypesCache:Ljava/util/Map;

    invoke-interface {v2, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_1
    monitor-exit v3

    return-object v1

    .line 455
    .end local v1    # "eventTypes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Class<*>;>;"
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method private postSingleEvent(Ljava/lang/Object;Lorg/greenrobot/eventbus/EventBus$PostingThreadState;)V
    .locals 9
    .param p1, "event"    # Ljava/lang/Object;
    .param p2, "postingState"    # Lorg/greenrobot/eventbus/EventBus$PostingThreadState;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Error;
        }
    .end annotation

    .prologue
    .line 363
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 364
    .local v2, "eventClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const/4 v5, 0x0

    .line 365
    .local v5, "subscriptionFound":Z
    iget-boolean v6, p0, Lorg/greenrobot/eventbus/EventBus;->eventInheritance:Z

    if-eqz v6, :cond_0

    .line 366
    invoke-static {v2}, Lorg/greenrobot/eventbus/EventBus;->lookupAllEventTypes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v3

    .line 367
    .local v3, "eventTypes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Class<*>;>;"
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    .line 368
    .local v1, "countTypes":I
    const/4 v4, 0x0

    .local v4, "h":I
    :goto_0
    if-ge v4, v1, :cond_1

    .line 369
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 370
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-direct {p0, p1, p2, v0}, Lorg/greenrobot/eventbus/EventBus;->postSingleEventForEventType(Ljava/lang/Object;Lorg/greenrobot/eventbus/EventBus$PostingThreadState;Ljava/lang/Class;)Z

    move-result v6

    or-int/2addr v5, v6

    .line 368
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 373
    .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v1    # "countTypes":I
    .end local v3    # "eventTypes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Class<*>;>;"
    .end local v4    # "h":I
    :cond_0
    invoke-direct {p0, p1, p2, v2}, Lorg/greenrobot/eventbus/EventBus;->postSingleEventForEventType(Ljava/lang/Object;Lorg/greenrobot/eventbus/EventBus$PostingThreadState;Ljava/lang/Class;)Z

    move-result v5

    .line 375
    :cond_1
    if-nez v5, :cond_3

    .line 376
    iget-boolean v6, p0, Lorg/greenrobot/eventbus/EventBus;->logNoSubscriberMessages:Z

    if-eqz v6, :cond_2

    .line 377
    sget-object v6, Lorg/greenrobot/eventbus/EventBus;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "No subscribers registered for event "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 379
    :cond_2
    iget-boolean v6, p0, Lorg/greenrobot/eventbus/EventBus;->sendNoSubscriberEvent:Z

    if-eqz v6, :cond_3

    const-class v6, Lorg/greenrobot/eventbus/NoSubscriberEvent;

    if-eq v2, v6, :cond_3

    const-class v6, Lorg/greenrobot/eventbus/SubscriberExceptionEvent;

    if-eq v2, v6, :cond_3

    .line 381
    new-instance v6, Lorg/greenrobot/eventbus/NoSubscriberEvent;

    invoke-direct {v6, p0, p1}, Lorg/greenrobot/eventbus/NoSubscriberEvent;-><init>(Lorg/greenrobot/eventbus/EventBus;Ljava/lang/Object;)V

    invoke-virtual {p0, v6}, Lorg/greenrobot/eventbus/EventBus;->post(Ljava/lang/Object;)V

    .line 384
    :cond_3
    return-void
.end method

.method private postSingleEventForEventType(Ljava/lang/Object;Lorg/greenrobot/eventbus/EventBus$PostingThreadState;Ljava/lang/Class;)Z
    .locals 7
    .param p1, "event"    # Ljava/lang/Object;
    .param p2, "postingState"    # Lorg/greenrobot/eventbus/EventBus$PostingThreadState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lorg/greenrobot/eventbus/EventBus$PostingThreadState;",
            "Ljava/lang/Class",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .local p3, "eventClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const/4 v3, 0x0

    const/4 v6, 0x0

    .line 388
    monitor-enter p0

    .line 389
    :try_start_0
    iget-object v4, p0, Lorg/greenrobot/eventbus/EventBus;->subscriptionsByEventType:Ljava/util/Map;

    invoke-interface {v4, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 390
    .local v2, "subscriptions":Ljava/util/concurrent/CopyOnWriteArrayList;, "Ljava/util/concurrent/CopyOnWriteArrayList<Lorg/greenrobot/eventbus/Subscription;>;"
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 391
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    .line 392
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/greenrobot/eventbus/Subscription;

    .line 393
    .local v1, "subscription":Lorg/greenrobot/eventbus/Subscription;
    iput-object p1, p2, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->event:Ljava/lang/Object;

    .line 394
    iput-object v1, p2, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->subscription:Lorg/greenrobot/eventbus/Subscription;

    .line 395
    const/4 v0, 0x0

    .line 397
    .local v0, "aborted":Z
    :try_start_1
    iget-boolean v5, p2, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->isMainThread:Z

    invoke-direct {p0, v1, p1, v5}, Lorg/greenrobot/eventbus/EventBus;->postToSubscription(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;Z)V

    .line 398
    iget-boolean v0, p2, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->canceled:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 400
    iput-object v6, p2, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->event:Ljava/lang/Object;

    .line 401
    iput-object v6, p2, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->subscription:Lorg/greenrobot/eventbus/Subscription;

    .line 402
    iput-boolean v3, p2, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->canceled:Z

    .line 404
    if-eqz v0, :cond_0

    .line 408
    .end local v0    # "aborted":Z
    .end local v1    # "subscription":Lorg/greenrobot/eventbus/Subscription;
    :cond_1
    const/4 v3, 0x1

    .line 410
    :cond_2
    return v3

    .line 390
    .end local v2    # "subscriptions":Ljava/util/concurrent/CopyOnWriteArrayList;, "Ljava/util/concurrent/CopyOnWriteArrayList<Lorg/greenrobot/eventbus/Subscription;>;"
    :catchall_0
    move-exception v3

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v3

    .line 400
    .restart local v0    # "aborted":Z
    .restart local v1    # "subscription":Lorg/greenrobot/eventbus/Subscription;
    .restart local v2    # "subscriptions":Ljava/util/concurrent/CopyOnWriteArrayList;, "Ljava/util/concurrent/CopyOnWriteArrayList<Lorg/greenrobot/eventbus/Subscription;>;"
    :catchall_1
    move-exception v4

    iput-object v6, p2, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->event:Ljava/lang/Object;

    .line 401
    iput-object v6, p2, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->subscription:Lorg/greenrobot/eventbus/Subscription;

    .line 402
    iput-boolean v3, p2, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->canceled:Z

    throw v4
.end method

.method private postToSubscription(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;Z)V
    .locals 3
    .param p1, "subscription"    # Lorg/greenrobot/eventbus/Subscription;
    .param p2, "event"    # Ljava/lang/Object;
    .param p3, "isMainThread"    # Z

    .prologue
    .line 414
    sget-object v0, Lorg/greenrobot/eventbus/EventBus$2;->$SwitchMap$org$greenrobot$eventbus$ThreadMode:[I

    iget-object v1, p1, Lorg/greenrobot/eventbus/Subscription;->subscriberMethod:Lorg/greenrobot/eventbus/SubscriberMethod;

    iget-object v1, v1, Lorg/greenrobot/eventbus/SubscriberMethod;->threadMode:Lorg/greenrobot/eventbus/ThreadMode;

    invoke-virtual {v1}, Lorg/greenrobot/eventbus/ThreadMode;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 436
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown thread mode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p1, Lorg/greenrobot/eventbus/Subscription;->subscriberMethod:Lorg/greenrobot/eventbus/SubscriberMethod;

    iget-object v2, v2, Lorg/greenrobot/eventbus/SubscriberMethod;->threadMode:Lorg/greenrobot/eventbus/ThreadMode;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 416
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lorg/greenrobot/eventbus/EventBus;->invokeSubscriber(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;)V

    .line 438
    :goto_0
    return-void

    .line 419
    :pswitch_1
    if-eqz p3, :cond_0

    .line 420
    invoke-virtual {p0, p1, p2}, Lorg/greenrobot/eventbus/EventBus;->invokeSubscriber(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;)V

    goto :goto_0

    .line 422
    :cond_0
    iget-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->mainThreadPoster:Lorg/greenrobot/eventbus/HandlerPoster;

    invoke-virtual {v0, p1, p2}, Lorg/greenrobot/eventbus/HandlerPoster;->enqueue(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;)V

    goto :goto_0

    .line 426
    :pswitch_2
    if-eqz p3, :cond_1

    .line 427
    iget-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->backgroundPoster:Lorg/greenrobot/eventbus/BackgroundPoster;

    invoke-virtual {v0, p1, p2}, Lorg/greenrobot/eventbus/BackgroundPoster;->enqueue(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;)V

    goto :goto_0

    .line 429
    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/greenrobot/eventbus/EventBus;->invokeSubscriber(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;)V

    goto :goto_0

    .line 433
    :pswitch_3
    iget-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->asyncPoster:Lorg/greenrobot/eventbus/AsyncPoster;

    invoke-virtual {v0, p1, p2}, Lorg/greenrobot/eventbus/AsyncPoster;->enqueue(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;)V

    goto :goto_0

    .line 414
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private subscribe(Ljava/lang/Object;Lorg/greenrobot/eventbus/SubscriberMethod;)V
    .locals 13
    .param p1, "subscriber"    # Ljava/lang/Object;
    .param p2, "subscriberMethod"    # Lorg/greenrobot/eventbus/SubscriberMethod;

    .prologue
    .line 146
    iget-object v3, p2, Lorg/greenrobot/eventbus/SubscriberMethod;->eventType:Ljava/lang/Class;

    .line 147
    .local v3, "eventType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    new-instance v5, Lorg/greenrobot/eventbus/Subscription;

    invoke-direct {v5, p1, p2}, Lorg/greenrobot/eventbus/Subscription;-><init>(Ljava/lang/Object;Lorg/greenrobot/eventbus/SubscriberMethod;)V

    .line 148
    .local v5, "newSubscription":Lorg/greenrobot/eventbus/Subscription;
    iget-object v10, p0, Lorg/greenrobot/eventbus/EventBus;->subscriptionsByEventType:Ljava/util/Map;

    invoke-interface {v10, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 149
    .local v9, "subscriptions":Ljava/util/concurrent/CopyOnWriteArrayList;, "Ljava/util/concurrent/CopyOnWriteArrayList<Lorg/greenrobot/eventbus/Subscription;>;"
    if-nez v9, :cond_5

    .line 150
    new-instance v9, Ljava/util/concurrent/CopyOnWriteArrayList;

    .end local v9    # "subscriptions":Ljava/util/concurrent/CopyOnWriteArrayList;, "Ljava/util/concurrent/CopyOnWriteArrayList<Lorg/greenrobot/eventbus/Subscription;>;"
    invoke-direct {v9}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 151
    .restart local v9    # "subscriptions":Ljava/util/concurrent/CopyOnWriteArrayList;, "Ljava/util/concurrent/CopyOnWriteArrayList<Lorg/greenrobot/eventbus/Subscription;>;"
    iget-object v10, p0, Lorg/greenrobot/eventbus/EventBus;->subscriptionsByEventType:Ljava/util/Map;

    invoke-interface {v10, v3, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    :cond_0
    invoke-virtual {v9}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v6

    .line 160
    .local v6, "size":I
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_0
    if-gt v4, v6, :cond_2

    .line 161
    if-eq v4, v6, :cond_1

    iget v11, p2, Lorg/greenrobot/eventbus/SubscriberMethod;->priority:I

    invoke-virtual {v9, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lorg/greenrobot/eventbus/Subscription;

    iget-object v10, v10, Lorg/greenrobot/eventbus/Subscription;->subscriberMethod:Lorg/greenrobot/eventbus/SubscriberMethod;

    iget v10, v10, Lorg/greenrobot/eventbus/SubscriberMethod;->priority:I

    if-le v11, v10, :cond_6

    .line 162
    :cond_1
    invoke-virtual {v9, v4, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(ILjava/lang/Object;)V

    .line 167
    :cond_2
    iget-object v10, p0, Lorg/greenrobot/eventbus/EventBus;->typesBySubscriber:Ljava/util/Map;

    invoke-interface {v10, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    .line 168
    .local v8, "subscribedEvents":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Class<*>;>;"
    if-nez v8, :cond_3

    .line 169
    new-instance v8, Ljava/util/ArrayList;

    .end local v8    # "subscribedEvents":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Class<*>;>;"
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 170
    .restart local v8    # "subscribedEvents":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Class<*>;>;"
    iget-object v10, p0, Lorg/greenrobot/eventbus/EventBus;->typesBySubscriber:Ljava/util/Map;

    invoke-interface {v10, p1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    :cond_3
    invoke-interface {v8, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    iget-boolean v10, p2, Lorg/greenrobot/eventbus/SubscriberMethod;->sticky:Z

    if-eqz v10, :cond_8

    .line 175
    iget-boolean v10, p0, Lorg/greenrobot/eventbus/EventBus;->eventInheritance:Z

    if-eqz v10, :cond_7

    .line 180
    iget-object v10, p0, Lorg/greenrobot/eventbus/EventBus;->stickyEvents:Ljava/util/Map;

    invoke-interface {v10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    .line 181
    .local v1, "entries":Ljava/util/Set;, "Ljava/util/Set<Ljava/util/Map$Entry<Ljava/lang/Class<*>;Ljava/lang/Object;>;>;"
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_4
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 182
    .local v2, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Class<*>;Ljava/lang/Object;>;"
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 183
    .local v0, "candidateEventType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_4

    .line 184
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    .line 185
    .local v7, "stickyEvent":Ljava/lang/Object;
    invoke-direct {p0, v5, v7}, Lorg/greenrobot/eventbus/EventBus;->checkPostStickyEventToSubscription(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;)V

    goto :goto_1

    .line 153
    .end local v0    # "candidateEventType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v1    # "entries":Ljava/util/Set;, "Ljava/util/Set<Ljava/util/Map$Entry<Ljava/lang/Class<*>;Ljava/lang/Object;>;>;"
    .end local v2    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Class<*>;Ljava/lang/Object;>;"
    .end local v4    # "i":I
    .end local v6    # "size":I
    .end local v7    # "stickyEvent":Ljava/lang/Object;
    .end local v8    # "subscribedEvents":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Class<*>;>;"
    :cond_5
    invoke-virtual {v9, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    .line 154
    new-instance v10, Lorg/greenrobot/eventbus/EventBusException;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Subscriber "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, " already registered to event "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Lorg/greenrobot/eventbus/EventBusException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 160
    .restart local v4    # "i":I
    .restart local v6    # "size":I
    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 189
    .restart local v8    # "subscribedEvents":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Class<*>;>;"
    :cond_7
    iget-object v10, p0, Lorg/greenrobot/eventbus/EventBus;->stickyEvents:Ljava/util/Map;

    invoke-interface {v10, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 190
    .restart local v7    # "stickyEvent":Ljava/lang/Object;
    invoke-direct {p0, v5, v7}, Lorg/greenrobot/eventbus/EventBus;->checkPostStickyEventToSubscription(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;)V

    .line 193
    .end local v7    # "stickyEvent":Ljava/lang/Object;
    :cond_8
    return-void
.end method

.method private unsubscribeByEventType(Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 5
    .param p1, "subscriber"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 209
    .local p2, "eventType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    iget-object v4, p0, Lorg/greenrobot/eventbus/EventBus;->subscriptionsByEventType:Ljava/util/Map;

    invoke-interface {v4, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 210
    .local v3, "subscriptions":Ljava/util/List;, "Ljava/util/List<Lorg/greenrobot/eventbus/Subscription;>;"
    if-eqz v3, :cond_1

    .line 211
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    .line 212
    .local v1, "size":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, v1, :cond_1

    .line 213
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/greenrobot/eventbus/Subscription;

    .line 214
    .local v2, "subscription":Lorg/greenrobot/eventbus/Subscription;
    iget-object v4, v2, Lorg/greenrobot/eventbus/Subscription;->subscriber:Ljava/lang/Object;

    if-ne v4, p1, :cond_0

    .line 215
    const/4 v4, 0x0

    iput-boolean v4, v2, Lorg/greenrobot/eventbus/Subscription;->active:Z

    .line 216
    invoke-interface {v3, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 217
    add-int/lit8 v0, v0, -0x1

    .line 218
    add-int/lit8 v1, v1, -0x1

    .line 212
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 222
    .end local v0    # "i":I
    .end local v1    # "size":I
    .end local v2    # "subscription":Lorg/greenrobot/eventbus/Subscription;
    :cond_1
    return-void
.end method


# virtual methods
.method public cancelEventDelivery(Ljava/lang/Object;)V
    .locals 3
    .param p1, "event"    # Ljava/lang/Object;

    .prologue
    .line 268
    iget-object v1, p0, Lorg/greenrobot/eventbus/EventBus;->currentPostingThreadState:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;

    .line 269
    .local v0, "postingState":Lorg/greenrobot/eventbus/EventBus$PostingThreadState;
    iget-boolean v1, v0, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->isPosting:Z

    if-nez v1, :cond_0

    .line 270
    new-instance v1, Lorg/greenrobot/eventbus/EventBusException;

    const-string v2, "This method may only be called from inside event handling methods on the posting thread"

    invoke-direct {v1, v2}, Lorg/greenrobot/eventbus/EventBusException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 272
    :cond_0
    if-nez p1, :cond_1

    .line 273
    new-instance v1, Lorg/greenrobot/eventbus/EventBusException;

    const-string v2, "Event may not be null"

    invoke-direct {v1, v2}, Lorg/greenrobot/eventbus/EventBusException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 274
    :cond_1
    iget-object v1, v0, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->event:Ljava/lang/Object;

    if-eq v1, p1, :cond_2

    .line 275
    new-instance v1, Lorg/greenrobot/eventbus/EventBusException;

    const-string v2, "Only the currently handled event may be aborted"

    invoke-direct {v1, v2}, Lorg/greenrobot/eventbus/EventBusException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 276
    :cond_2
    iget-object v1, v0, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->subscription:Lorg/greenrobot/eventbus/Subscription;

    iget-object v1, v1, Lorg/greenrobot/eventbus/Subscription;->subscriberMethod:Lorg/greenrobot/eventbus/SubscriberMethod;

    iget-object v1, v1, Lorg/greenrobot/eventbus/SubscriberMethod;->threadMode:Lorg/greenrobot/eventbus/ThreadMode;

    sget-object v2, Lorg/greenrobot/eventbus/ThreadMode;->POSTING:Lorg/greenrobot/eventbus/ThreadMode;

    if-eq v1, v2, :cond_3

    .line 277
    new-instance v1, Lorg/greenrobot/eventbus/EventBusException;

    const-string v2, " event handlers may only abort the incoming event"

    invoke-direct {v1, v2}, Lorg/greenrobot/eventbus/EventBusException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 280
    :cond_3
    const/4 v1, 0x1

    iput-boolean v1, v0, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->canceled:Z

    .line 281
    return-void
.end method

.method getExecutorService()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .prologue
    .line 530
    iget-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->executorService:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public getStickyEvent(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 301
    .local p1, "eventType":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v1, p0, Lorg/greenrobot/eventbus/EventBus;->stickyEvents:Ljava/util/Map;

    monitor-enter v1

    .line 302
    :try_start_0
    iget-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->stickyEvents:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 303
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public hasSubscriberForEvent(Ljava/lang/Class;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 345
    .local p1, "eventClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-static {p1}, Lorg/greenrobot/eventbus/EventBus;->lookupAllEventTypes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    .line 346
    .local v2, "eventTypes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Class<*>;>;"
    if-eqz v2, :cond_1

    .line 347
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    .line 348
    .local v1, "countTypes":I
    const/4 v3, 0x0

    .local v3, "h":I
    :goto_0
    if-ge v3, v1, :cond_1

    .line 349
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 351
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    monitor-enter p0

    .line 352
    :try_start_0
    iget-object v5, p0, Lorg/greenrobot/eventbus/EventBus;->subscriptionsByEventType:Ljava/util/Map;

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 353
    .local v4, "subscriptions":Ljava/util/concurrent/CopyOnWriteArrayList;, "Ljava/util/concurrent/CopyOnWriteArrayList<Lorg/greenrobot/eventbus/Subscription;>;"
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 354
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    .line 355
    const/4 v5, 0x1

    .line 359
    .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v1    # "countTypes":I
    .end local v3    # "h":I
    .end local v4    # "subscriptions":Ljava/util/concurrent/CopyOnWriteArrayList;, "Ljava/util/concurrent/CopyOnWriteArrayList<Lorg/greenrobot/eventbus/Subscription;>;"
    :goto_1
    return v5

    .line 353
    .restart local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .restart local v1    # "countTypes":I
    .restart local v3    # "h":I
    :catchall_0
    move-exception v5

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v5

    .line 348
    .restart local v4    # "subscriptions":Ljava/util/concurrent/CopyOnWriteArrayList;, "Ljava/util/concurrent/CopyOnWriteArrayList<Lorg/greenrobot/eventbus/Subscription;>;"
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 359
    .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v1    # "countTypes":I
    .end local v3    # "h":I
    .end local v4    # "subscriptions":Ljava/util/concurrent/CopyOnWriteArrayList;, "Ljava/util/concurrent/CopyOnWriteArrayList<Lorg/greenrobot/eventbus/Subscription;>;"
    :cond_1
    const/4 v5, 0x0

    goto :goto_1
.end method

.method invokeSubscriber(Lorg/greenrobot/eventbus/PendingPost;)V
    .locals 3
    .param p1, "pendingPost"    # Lorg/greenrobot/eventbus/PendingPost;

    .prologue
    .line 475
    iget-object v0, p1, Lorg/greenrobot/eventbus/PendingPost;->event:Ljava/lang/Object;

    .line 476
    .local v0, "event":Ljava/lang/Object;
    iget-object v1, p1, Lorg/greenrobot/eventbus/PendingPost;->subscription:Lorg/greenrobot/eventbus/Subscription;

    .line 477
    .local v1, "subscription":Lorg/greenrobot/eventbus/Subscription;
    invoke-static {p1}, Lorg/greenrobot/eventbus/PendingPost;->releasePendingPost(Lorg/greenrobot/eventbus/PendingPost;)V

    .line 478
    iget-boolean v2, v1, Lorg/greenrobot/eventbus/Subscription;->active:Z

    if-eqz v2, :cond_0

    .line 479
    invoke-virtual {p0, v1, v0}, Lorg/greenrobot/eventbus/EventBus;->invokeSubscriber(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;)V

    .line 481
    :cond_0
    return-void
.end method

.method invokeSubscriber(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;)V
    .locals 5
    .param p1, "subscription"    # Lorg/greenrobot/eventbus/Subscription;
    .param p2, "event"    # Ljava/lang/Object;

    .prologue
    .line 485
    :try_start_0
    iget-object v1, p1, Lorg/greenrobot/eventbus/Subscription;->subscriberMethod:Lorg/greenrobot/eventbus/SubscriberMethod;

    iget-object v1, v1, Lorg/greenrobot/eventbus/SubscriberMethod;->method:Ljava/lang/reflect/Method;

    iget-object v2, p1, Lorg/greenrobot/eventbus/Subscription;->subscriber:Ljava/lang/Object;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    .line 491
    :goto_0
    return-void

    .line 486
    :catch_0
    move-exception v0

    .line 487
    .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-direct {p0, p1, p2, v1}, Lorg/greenrobot/eventbus/EventBus;->handleSubscriberException(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 488
    .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_1
    move-exception v0

    .line 489
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unexpected exception"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public declared-synchronized isRegistered(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "subscriber"    # Ljava/lang/Object;

    .prologue
    .line 204
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->typesBySubscriber:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public post(Ljava/lang/Object;)V
    .locals 6
    .param p1, "event"    # Ljava/lang/Object;

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 239
    iget-object v2, p0, Lorg/greenrobot/eventbus/EventBus;->currentPostingThreadState:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;

    .line 240
    .local v1, "postingState":Lorg/greenrobot/eventbus/EventBus$PostingThreadState;
    iget-object v0, v1, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->eventQueue:Ljava/util/List;

    .line 241
    .local v0, "eventQueue":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    iget-boolean v2, v1, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->isPosting:Z

    if-nez v2, :cond_3

    .line 244
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v5

    if-ne v2, v5, :cond_0

    move v2, v3

    :goto_0
    iput-boolean v2, v1, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->isMainThread:Z

    .line 245
    iput-boolean v3, v1, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->isPosting:Z

    .line 246
    iget-boolean v2, v1, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->canceled:Z

    if-eqz v2, :cond_1

    .line 247
    new-instance v2, Lorg/greenrobot/eventbus/EventBusException;

    const-string v3, "Internal error. Abort state was not reset"

    invoke-direct {v2, v3}, Lorg/greenrobot/eventbus/EventBusException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_0
    move v2, v4

    .line 244
    goto :goto_0

    .line 250
    :cond_1
    :goto_1
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 251
    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0, v2, v1}, Lorg/greenrobot/eventbus/EventBus;->postSingleEvent(Ljava/lang/Object;Lorg/greenrobot/eventbus/EventBus$PostingThreadState;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 254
    :catchall_0
    move-exception v2

    iput-boolean v4, v1, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->isPosting:Z

    .line 255
    iput-boolean v4, v1, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->isMainThread:Z

    throw v2

    .line 254
    :cond_2
    iput-boolean v4, v1, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->isPosting:Z

    .line 255
    iput-boolean v4, v1, Lorg/greenrobot/eventbus/EventBus$PostingThreadState;->isMainThread:Z

    .line 258
    :cond_3
    return-void
.end method

.method public postSticky(Ljava/lang/Object;)V
    .locals 3
    .param p1, "event"    # Ljava/lang/Object;

    .prologue
    .line 288
    iget-object v1, p0, Lorg/greenrobot/eventbus/EventBus;->stickyEvents:Ljava/util/Map;

    monitor-enter v1

    .line 289
    :try_start_0
    iget-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->stickyEvents:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 292
    invoke-virtual {p0, p1}, Lorg/greenrobot/eventbus/EventBus;->post(Ljava/lang/Object;)V

    .line 293
    return-void

    .line 290
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public register(Ljava/lang/Object;)V
    .locals 5
    .param p1, "subscriber"    # Ljava/lang/Object;

    .prologue
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 136
    .local v0, "subscriberClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    iget-object v3, p0, Lorg/greenrobot/eventbus/EventBus;->subscriberMethodFinder:Lorg/greenrobot/eventbus/SubscriberMethodFinder;

    invoke-virtual {v3, v0}, Lorg/greenrobot/eventbus/SubscriberMethodFinder;->findSubscriberMethods(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    .line 137
    .local v2, "subscriberMethods":Ljava/util/List;, "Ljava/util/List<Lorg/greenrobot/eventbus/SubscriberMethod;>;"
    monitor-enter p0

    .line 138
    :try_start_0
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/greenrobot/eventbus/SubscriberMethod;

    .line 139
    .local v1, "subscriberMethod":Lorg/greenrobot/eventbus/SubscriberMethod;
    invoke-direct {p0, p1, v1}, Lorg/greenrobot/eventbus/EventBus;->subscribe(Ljava/lang/Object;Lorg/greenrobot/eventbus/SubscriberMethod;)V

    goto :goto_0

    .line 141
    .end local v1    # "subscriberMethod":Lorg/greenrobot/eventbus/SubscriberMethod;
    :catchall_0
    move-exception v3

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3

    :cond_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    return-void
.end method

.method public removeAllStickyEvents()V
    .locals 2

    .prologue
    .line 339
    iget-object v1, p0, Lorg/greenrobot/eventbus/EventBus;->stickyEvents:Ljava/util/Map;

    monitor-enter v1

    .line 340
    :try_start_0
    iget-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->stickyEvents:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 341
    monitor-exit v1

    .line 342
    return-void

    .line 341
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public removeStickyEvent(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 312
    .local p1, "eventType":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v1, p0, Lorg/greenrobot/eventbus/EventBus;->stickyEvents:Ljava/util/Map;

    monitor-enter v1

    .line 313
    :try_start_0
    iget-object v0, p0, Lorg/greenrobot/eventbus/EventBus;->stickyEvents:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 314
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public removeStickyEvent(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "event"    # Ljava/lang/Object;

    .prologue
    .line 323
    iget-object v3, p0, Lorg/greenrobot/eventbus/EventBus;->stickyEvents:Ljava/util/Map;

    monitor-enter v3

    .line 324
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 325
    .local v0, "eventType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    iget-object v2, p0, Lorg/greenrobot/eventbus/EventBus;->stickyEvents:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 326
    .local v1, "existingEvent":Ljava/lang/Object;
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 327
    iget-object v2, p0, Lorg/greenrobot/eventbus/EventBus;->stickyEvents:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    const/4 v2, 0x1

    monitor-exit v3

    .line 330
    :goto_0
    return v2

    :cond_0
    const/4 v2, 0x0

    monitor-exit v3

    goto :goto_0

    .line 332
    .end local v0    # "eventType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v1    # "existingEvent":Ljava/lang/Object;
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 540
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EventBus[indexCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/greenrobot/eventbus/EventBus;->indexCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", eventInheritance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lorg/greenrobot/eventbus/EventBus;->eventInheritance:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized unregister(Ljava/lang/Object;)V
    .locals 5
    .param p1, "subscriber"    # Ljava/lang/Object;

    .prologue
    .line 226
    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lorg/greenrobot/eventbus/EventBus;->typesBySubscriber:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 227
    .local v1, "subscribedTypes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Class<*>;>;"
    if-eqz v1, :cond_1

    .line 228
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 229
    .local v0, "eventType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-direct {p0, p1, v0}, Lorg/greenrobot/eventbus/EventBus;->unsubscribeByEventType(Ljava/lang/Object;Ljava/lang/Class;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 226
    .end local v0    # "eventType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v1    # "subscribedTypes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Class<*>;>;"
    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2

    .line 231
    .restart local v1    # "subscribedTypes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Class<*>;>;"
    :cond_0
    :try_start_1
    iget-object v2, p0, Lorg/greenrobot/eventbus/EventBus;->typesBySubscriber:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 235
    :goto_1
    monitor-exit p0

    return-void

    .line 233
    :cond_1
    :try_start_2
    sget-object v2, Lorg/greenrobot/eventbus/EventBus;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Subscriber to unregister was not registered before: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method
