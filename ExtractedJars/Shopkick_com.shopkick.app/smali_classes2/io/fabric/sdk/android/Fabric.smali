.class public Lio/fabric/sdk/android/Fabric;
.super Ljava/lang/Object;
.source "Fabric.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fabric/sdk/android/Fabric$Builder;
    }
.end annotation


# static fields
.field static final ANSWERS_KIT_IDENTIFIER:Ljava/lang/String; = "com.crashlytics.sdk.android:answers"

.field static final CRASHLYTICS_KIT_IDENTIFIER:Ljava/lang/String; = "com.crashlytics.sdk.android:crashlytics"

.field static final DEFAULT_DEBUGGABLE:Z = false

.field static final DEFAULT_LOGGER:Lio/fabric/sdk/android/Logger;

.field static final ROOT_DIR:Ljava/lang/String; = ".Fabric"

.field public static final TAG:Ljava/lang/String; = "Fabric"

.field static volatile singleton:Lio/fabric/sdk/android/Fabric;


# instance fields
.field private activity:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private activityLifecycleManager:Lio/fabric/sdk/android/ActivityLifecycleManager;

.field private final context:Landroid/content/Context;

.field final debuggable:Z

.field private final executorService:Ljava/util/concurrent/ExecutorService;

.field private final idManager:Lio/fabric/sdk/android/services/common/IdManager;

.field private final initializationCallback:Lio/fabric/sdk/android/InitializationCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/fabric/sdk/android/InitializationCallback<",
            "Lio/fabric/sdk/android/Fabric;",
            ">;"
        }
    .end annotation
.end field

.field private initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final kitInitializationCallback:Lio/fabric/sdk/android/InitializationCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/fabric/sdk/android/InitializationCallback<",
            "*>;"
        }
    .end annotation
.end field

.field private final kits:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lio/fabric/sdk/android/Kit;",
            ">;",
            "Lio/fabric/sdk/android/Kit;",
            ">;"
        }
    .end annotation
.end field

.field final logger:Lio/fabric/sdk/android/Logger;

.field private final mainHandler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 60
    new-instance v0, Lio/fabric/sdk/android/DefaultLogger;

    invoke-direct {v0}, Lio/fabric/sdk/android/DefaultLogger;-><init>()V

    sput-object v0, Lio/fabric/sdk/android/Fabric;->DEFAULT_LOGGER:Lio/fabric/sdk/android/Logger;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/util/Map;Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor;Landroid/os/Handler;Lio/fabric/sdk/android/Logger;ZLio/fabric/sdk/android/InitializationCallback;Lio/fabric/sdk/android/services/common/IdManager;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lio/fabric/sdk/android/Kit;",
            ">;",
            "Lio/fabric/sdk/android/Kit;",
            ">;",
            "Lio/fabric/sdk/android/services/concurrency/PriorityThreadPoolExecutor;",
            "Landroid/os/Handler;",
            "Lio/fabric/sdk/android/Logger;",
            "Z",
            "Lio/fabric/sdk/android/InitializationCallback;",
            "Lio/fabric/sdk/android/services/common/IdManager;",
            "Landroid/app/Activity;",
            ")V"
        }
    .end annotation

    .line 310
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 311
    iput-object p1, p0, Lio/fabric/sdk/android/Fabric;->context:Landroid/content/Context;

    .line 312
    iput-object p2, p0, Lio/fabric/sdk/android/Fabric;->kits:Ljava/util/Map;

    .line 313
    iput-object p3, p0, Lio/fabric/sdk/android/Fabric;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 314
    iput-object p4, p0, Lio/fabric/sdk/android/Fabric;->mainHandler:Landroid/os/Handler;

    .line 315
    iput-object p5, p0, Lio/fabric/sdk/android/Fabric;->logger:Lio/fabric/sdk/android/Logger;

    .line 316
    iput-boolean p6, p0, Lio/fabric/sdk/android/Fabric;->debuggable:Z

    .line 317
    iput-object p7, p0, Lio/fabric/sdk/android/Fabric;->initializationCallback:Lio/fabric/sdk/android/InitializationCallback;

    .line 318
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p3, 0x0

    invoke-direct {p1, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/fabric/sdk/android/Fabric;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 319
    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result p1

    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/Fabric;->createKitInitializationCallback(I)Lio/fabric/sdk/android/InitializationCallback;

    move-result-object p1

    iput-object p1, p0, Lio/fabric/sdk/android/Fabric;->kitInitializationCallback:Lio/fabric/sdk/android/InitializationCallback;

    .line 320
    iput-object p8, p0, Lio/fabric/sdk/android/Fabric;->idManager:Lio/fabric/sdk/android/services/common/IdManager;

    .line 321
    invoke-virtual {p0, p9}, Lio/fabric/sdk/android/Fabric;->setCurrentActivity(Landroid/app/Activity;)Lio/fabric/sdk/android/Fabric;

    return-void
.end method

.method static synthetic access$000(Ljava/util/Collection;)Ljava/util/Map;
    .locals 0

    .line 49
    invoke-static {p0}, Lio/fabric/sdk/android/Fabric;->getKitMap(Ljava/util/Collection;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Landroid/content/Context;)Landroid/app/Activity;
    .locals 0

    .line 49
    invoke-static {p0}, Lio/fabric/sdk/android/Fabric;->extractActivity(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lio/fabric/sdk/android/Fabric;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 49
    iget-object p0, p0, Lio/fabric/sdk/android/Fabric;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static synthetic access$300(Lio/fabric/sdk/android/Fabric;)Lio/fabric/sdk/android/InitializationCallback;
    .locals 0

    .line 49
    iget-object p0, p0, Lio/fabric/sdk/android/Fabric;->initializationCallback:Lio/fabric/sdk/android/InitializationCallback;

    return-object p0
.end method

.method private static addToKitMap(Ljava/util/Map;Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lio/fabric/sdk/android/Kit;",
            ">;",
            "Lio/fabric/sdk/android/Kit;",
            ">;",
            "Ljava/util/Collection<",
            "+",
            "Lio/fabric/sdk/android/Kit;",
            ">;)V"
        }
    .end annotation

    .line 607
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/Kit;

    .line 608
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 610
    instance-of v1, v0, Lio/fabric/sdk/android/KitGroup;

    if-eqz v1, :cond_0

    .line 611
    check-cast v0, Lio/fabric/sdk/android/KitGroup;

    invoke-interface {v0}, Lio/fabric/sdk/android/KitGroup;->getKits()Ljava/util/Collection;

    move-result-object v0

    invoke-static {p0, v0}, Lio/fabric/sdk/android/Fabric;->addToKitMap(Ljava/util/Map;Ljava/util/Collection;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static extractActivity(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    .line 515
    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 516
    check-cast p0, Landroid/app/Activity;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getKit(Ljava/lang/Class;)Lio/fabric/sdk/android/Kit;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lio/fabric/sdk/android/Kit;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 551
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->singleton()Lio/fabric/sdk/android/Fabric;

    move-result-object v0

    iget-object v0, v0, Lio/fabric/sdk/android/Fabric;->kits:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/fabric/sdk/android/Kit;

    return-object p0
.end method

.method private static getKitMap(Ljava/util/Collection;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lio/fabric/sdk/android/Kit;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lio/fabric/sdk/android/Kit;",
            ">;",
            "Lio/fabric/sdk/android/Kit;",
            ">;"
        }
    .end annotation

    .line 596
    new-instance v0, Ljava/util/HashMap;

    .line 597
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 599
    invoke-static {v0, p0}, Lio/fabric/sdk/android/Fabric;->addToKitMap(Ljava/util/Map;Ljava/util/Collection;)V

    return-object v0
.end method

.method public static getLogger()Lio/fabric/sdk/android/Logger;
    .locals 1

    .line 558
    sget-object v0, Lio/fabric/sdk/android/Fabric;->singleton:Lio/fabric/sdk/android/Fabric;

    if-nez v0, :cond_0

    .line 559
    sget-object v0, Lio/fabric/sdk/android/Fabric;->DEFAULT_LOGGER:Lio/fabric/sdk/android/Logger;

    return-object v0

    .line 561
    :cond_0
    sget-object v0, Lio/fabric/sdk/android/Fabric;->singleton:Lio/fabric/sdk/android/Fabric;

    iget-object v0, v0, Lio/fabric/sdk/android/Fabric;->logger:Lio/fabric/sdk/android/Logger;

    return-object v0
.end method

.method private init()V
    .locals 2

    .line 391
    new-instance v0, Lio/fabric/sdk/android/ActivityLifecycleManager;

    iget-object v1, p0, Lio/fabric/sdk/android/Fabric;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lio/fabric/sdk/android/ActivityLifecycleManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lio/fabric/sdk/android/Fabric;->activityLifecycleManager:Lio/fabric/sdk/android/ActivityLifecycleManager;

    .line 392
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric;->activityLifecycleManager:Lio/fabric/sdk/android/ActivityLifecycleManager;

    new-instance v1, Lio/fabric/sdk/android/Fabric$1;

    invoke-direct {v1, p0}, Lio/fabric/sdk/android/Fabric$1;-><init>(Lio/fabric/sdk/android/Fabric;)V

    invoke-virtual {v0, v1}, Lio/fabric/sdk/android/ActivityLifecycleManager;->registerCallbacks(Lio/fabric/sdk/android/ActivityLifecycleManager$Callbacks;)Z

    .line 410
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric;->context:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/Fabric;->initializeKits(Landroid/content/Context;)V

    return-void
.end method

.method public static isDebuggable()Z
    .locals 1

    .line 568
    sget-object v0, Lio/fabric/sdk/android/Fabric;->singleton:Lio/fabric/sdk/android/Fabric;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 571
    :cond_0
    sget-object v0, Lio/fabric/sdk/android/Fabric;->singleton:Lio/fabric/sdk/android/Fabric;

    iget-boolean v0, v0, Lio/fabric/sdk/android/Fabric;->debuggable:Z

    return v0
.end method

.method public static isInitialized()Z
    .locals 1

    .line 578
    sget-object v0, Lio/fabric/sdk/android/Fabric;->singleton:Lio/fabric/sdk/android/Fabric;

    if-eqz v0, :cond_0

    sget-object v0, Lio/fabric/sdk/android/Fabric;->singleton:Lio/fabric/sdk/android/Fabric;

    iget-object v0, v0, Lio/fabric/sdk/android/Fabric;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static setFabric(Lio/fabric/sdk/android/Fabric;)V
    .locals 0

    .line 367
    sput-object p0, Lio/fabric/sdk/android/Fabric;->singleton:Lio/fabric/sdk/android/Fabric;

    .line 368
    invoke-direct {p0}, Lio/fabric/sdk/android/Fabric;->init()V

    return-void
.end method

.method static singleton()Lio/fabric/sdk/android/Fabric;
    .locals 2

    .line 300
    sget-object v0, Lio/fabric/sdk/android/Fabric;->singleton:Lio/fabric/sdk/android/Fabric;

    if-eqz v0, :cond_0

    .line 303
    sget-object v0, Lio/fabric/sdk/android/Fabric;->singleton:Lio/fabric/sdk/android/Fabric;

    return-object v0

    .line 301
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must Initialize Fabric before using singleton()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static varargs with(Landroid/content/Context;[Lio/fabric/sdk/android/Kit;)Lio/fabric/sdk/android/Fabric;
    .locals 2

    .line 336
    sget-object v0, Lio/fabric/sdk/android/Fabric;->singleton:Lio/fabric/sdk/android/Fabric;

    if-nez v0, :cond_1

    .line 337
    const-class v0, Lio/fabric/sdk/android/Fabric;

    monitor-enter v0

    .line 338
    :try_start_0
    sget-object v1, Lio/fabric/sdk/android/Fabric;->singleton:Lio/fabric/sdk/android/Fabric;

    if-nez v1, :cond_0

    .line 339
    new-instance v1, Lio/fabric/sdk/android/Fabric$Builder;

    invoke-direct {v1, p0}, Lio/fabric/sdk/android/Fabric$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p1}, Lio/fabric/sdk/android/Fabric$Builder;->kits([Lio/fabric/sdk/android/Kit;)Lio/fabric/sdk/android/Fabric$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lio/fabric/sdk/android/Fabric$Builder;->build()Lio/fabric/sdk/android/Fabric;

    move-result-object p0

    invoke-static {p0}, Lio/fabric/sdk/android/Fabric;->setFabric(Lio/fabric/sdk/android/Fabric;)V

    .line 341
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 343
    :cond_1
    :goto_0
    sget-object p0, Lio/fabric/sdk/android/Fabric;->singleton:Lio/fabric/sdk/android/Fabric;

    return-object p0
.end method

.method public static with(Lio/fabric/sdk/android/Fabric;)Lio/fabric/sdk/android/Fabric;
    .locals 2

    .line 356
    sget-object v0, Lio/fabric/sdk/android/Fabric;->singleton:Lio/fabric/sdk/android/Fabric;

    if-nez v0, :cond_1

    .line 357
    const-class v0, Lio/fabric/sdk/android/Fabric;

    monitor-enter v0

    .line 358
    :try_start_0
    sget-object v1, Lio/fabric/sdk/android/Fabric;->singleton:Lio/fabric/sdk/android/Fabric;

    if-nez v1, :cond_0

    .line 359
    invoke-static {p0}, Lio/fabric/sdk/android/Fabric;->setFabric(Lio/fabric/sdk/android/Fabric;)V

    .line 361
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 363
    :cond_1
    :goto_0
    sget-object p0, Lio/fabric/sdk/android/Fabric;->singleton:Lio/fabric/sdk/android/Fabric;

    return-object p0
.end method


# virtual methods
.method addAnnotatedDependencies(Ljava/util/Map;Lio/fabric/sdk/android/Kit;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lio/fabric/sdk/android/Kit;",
            ">;",
            "Lio/fabric/sdk/android/Kit;",
            ">;",
            "Lio/fabric/sdk/android/Kit;",
            ")V"
        }
    .end annotation

    .line 487
    iget-object v0, p2, Lio/fabric/sdk/android/Kit;->dependsOnAnnotation:Lio/fabric/sdk/android/services/concurrency/DependsOn;

    if-eqz v0, :cond_4

    .line 489
    invoke-interface {v0}, Lio/fabric/sdk/android/services/concurrency/DependsOn;->value()[Ljava/lang/Class;

    move-result-object v0

    .line 490
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    aget-object v3, v0, v2

    .line 491
    invoke-virtual {v3}, Ljava/lang/Class;->isInterface()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 493
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/fabric/sdk/android/Kit;

    .line 494
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 495
    iget-object v6, p2, Lio/fabric/sdk/android/Kit;->initializationTask:Lio/fabric/sdk/android/InitializationTask;

    iget-object v5, v5, Lio/fabric/sdk/android/Kit;->initializationTask:Lio/fabric/sdk/android/InitializationTask;

    invoke-virtual {v6, v5}, Lio/fabric/sdk/android/InitializationTask;->addDependency(Lio/fabric/sdk/android/services/concurrency/Task;)V

    goto :goto_1

    .line 501
    :cond_1
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/fabric/sdk/android/Kit;

    if-eqz v4, :cond_3

    .line 507
    iget-object v4, p2, Lio/fabric/sdk/android/Kit;->initializationTask:Lio/fabric/sdk/android/InitializationTask;

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/fabric/sdk/android/Kit;

    iget-object v3, v3, Lio/fabric/sdk/android/Kit;->initializationTask:Lio/fabric/sdk/android/InitializationTask;

    invoke-virtual {v4, v3}, Lio/fabric/sdk/android/InitializationTask;->addDependency(Lio/fabric/sdk/android/services/concurrency/Task;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 503
    :cond_3
    new-instance p1, Lio/fabric/sdk/android/services/concurrency/UnmetDependencyException;

    const-string p2, "Referenced Kit was null, does the kit exist?"

    invoke-direct {p1, p2}, Lio/fabric/sdk/android/services/concurrency/UnmetDependencyException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-void
.end method

.method createKitInitializationCallback(I)Lio/fabric/sdk/android/InitializationCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lio/fabric/sdk/android/InitializationCallback<",
            "*>;"
        }
    .end annotation

    .line 617
    new-instance v0, Lio/fabric/sdk/android/Fabric$2;

    invoke-direct {v0, p0, p1}, Lio/fabric/sdk/android/Fabric$2;-><init>(Lio/fabric/sdk/android/Fabric;I)V

    return-object v0
.end method

.method public getActivityLifecycleManager()Lio/fabric/sdk/android/ActivityLifecycleManager;
    .locals 1

    .line 523
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric;->activityLifecycleManager:Lio/fabric/sdk/android/ActivityLifecycleManager;

    return-object v0
.end method

.method public getAppIdentifier()Ljava/lang/String;
    .locals 1

    .line 585
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric;->idManager:Lio/fabric/sdk/android/services/common/IdManager;

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/common/IdManager;->getAppIdentifier()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAppInstallIdentifier()Ljava/lang/String;
    .locals 1

    .line 592
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric;->idManager:Lio/fabric/sdk/android/services/common/IdManager;

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/common/IdManager;->getAppInstallIdentifier()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentActivity()Landroid/app/Activity;
    .locals 1

    .line 384
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric;->activity:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 385
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getExecutorService()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 527
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric;->executorService:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public getIdentifier()Ljava/lang/String;
    .locals 1

    const-string v0, "io.fabric.sdk.android:fabric"

    return-object v0
.end method

.method public getKits()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lio/fabric/sdk/android/Kit;",
            ">;"
        }
    .end annotation

    .line 538
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric;->kits:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method getKitsFinderFuture(Landroid/content/Context;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/concurrent/Future<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/fabric/sdk/android/KitInfo;",
            ">;>;"
        }
    .end annotation

    .line 640
    new-instance v0, Lio/fabric/sdk/android/FabricKitsFinder;

    .line 641
    invoke-virtual {p1}, Landroid/content/Context;->getPackageCodePath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lio/fabric/sdk/android/FabricKitsFinder;-><init>(Ljava/lang/String;)V

    .line 642
    invoke-virtual {p0}, Lio/fabric/sdk/android/Fabric;->getExecutorService()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    .line 643
    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method public getMainHandler()Landroid/os/Handler;
    .locals 1

    .line 531
    iget-object v0, p0, Lio/fabric/sdk/android/Fabric;->mainHandler:Landroid/os/Handler;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "1.4.6.29"

    return-object v0
.end method

.method initializeKits(Landroid/content/Context;)V
    .locals 6

    .line 431
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/Fabric;->getKitsFinderFuture(Landroid/content/Context;)Ljava/util/concurrent/Future;

    move-result-object v0

    .line 433
    invoke-virtual {p0}, Lio/fabric/sdk/android/Fabric;->getKits()Ljava/util/Collection;

    move-result-object v1

    .line 434
    new-instance v2, Lio/fabric/sdk/android/Onboarding;

    invoke-direct {v2, v0, v1}, Lio/fabric/sdk/android/Onboarding;-><init>(Ljava/util/concurrent/Future;Ljava/util/Collection;)V

    .line 435
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 436
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 440
    sget-object v1, Lio/fabric/sdk/android/InitializationCallback;->EMPTY:Lio/fabric/sdk/android/InitializationCallback;

    iget-object v3, p0, Lio/fabric/sdk/android/Fabric;->idManager:Lio/fabric/sdk/android/services/common/IdManager;

    invoke-virtual {v2, p1, p0, v1, v3}, Lio/fabric/sdk/android/Onboarding;->injectParameters(Landroid/content/Context;Lio/fabric/sdk/android/Fabric;Lio/fabric/sdk/android/InitializationCallback;Lio/fabric/sdk/android/services/common/IdManager;)V

    .line 441
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/fabric/sdk/android/Kit;

    .line 442
    iget-object v4, p0, Lio/fabric/sdk/android/Fabric;->kitInitializationCallback:Lio/fabric/sdk/android/InitializationCallback;

    iget-object v5, p0, Lio/fabric/sdk/android/Fabric;->idManager:Lio/fabric/sdk/android/services/common/IdManager;

    invoke-virtual {v3, p1, p0, v4, v5}, Lio/fabric/sdk/android/Kit;->injectParameters(Landroid/content/Context;Lio/fabric/sdk/android/Fabric;Lio/fabric/sdk/android/InitializationCallback;Lio/fabric/sdk/android/services/common/IdManager;)V

    goto :goto_0

    .line 447
    :cond_0
    invoke-virtual {v2}, Lio/fabric/sdk/android/Onboarding;->initialize()V

    .line 451
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object p1

    const-string v1, "Fabric"

    const/4 v3, 0x3

    invoke-interface {p1, v1, v3}, Lio/fabric/sdk/android/Logger;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 452
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Initializing "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 453
    invoke-virtual {p0}, Lio/fabric/sdk/android/Fabric;->getIdentifier()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " [Version: "

    .line 454
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    invoke-virtual {p0}, Lio/fabric/sdk/android/Fabric;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "], with the following kits:\n"

    .line 456
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 461
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/fabric/sdk/android/Kit;

    .line 462
    iget-object v3, v1, Lio/fabric/sdk/android/Kit;->initializationTask:Lio/fabric/sdk/android/InitializationTask;

    iget-object v4, v2, Lio/fabric/sdk/android/Onboarding;->initializationTask:Lio/fabric/sdk/android/InitializationTask;

    invoke-virtual {v3, v4}, Lio/fabric/sdk/android/InitializationTask;->addDependency(Lio/fabric/sdk/android/services/concurrency/Task;)V

    .line 464
    iget-object v3, p0, Lio/fabric/sdk/android/Fabric;->kits:Ljava/util/Map;

    invoke-virtual {p0, v3, v1}, Lio/fabric/sdk/android/Fabric;->addAnnotatedDependencies(Ljava/util/Map;Lio/fabric/sdk/android/Kit;)V

    .line 466
    invoke-virtual {v1}, Lio/fabric/sdk/android/Kit;->initialize()V

    if-eqz p1, :cond_2

    .line 469
    invoke-virtual {v1}, Lio/fabric/sdk/android/Kit;->getIdentifier()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " [Version: "

    .line 470
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    invoke-virtual {v1}, Lio/fabric/sdk/android/Kit;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]\n"

    .line 472
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    if-eqz p1, :cond_4

    .line 477
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Fabric"

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public setCurrentActivity(Landroid/app/Activity;)Lio/fabric/sdk/android/Fabric;
    .locals 1

    .line 375
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/fabric/sdk/android/Fabric;->activity:Ljava/lang/ref/WeakReference;

    return-object p0
.end method
