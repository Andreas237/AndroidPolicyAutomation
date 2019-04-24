.class public Lnet/toddm/comm/tests/TestWork;
.super Ljunit/framework/TestCase;
.source "TestWork.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljunit/framework/TestCase;-><init>()V

    return-void
.end method


# virtual methods
.method public testDependentWorkCallbackAllowsCurrentWork()V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 72
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 73
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 74
    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 75
    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v0

    .line 77
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://www.toddm.net/"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->getWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/SubmittableWork;

    move-result-object v15

    .line 78
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://toddm.net/art/index.html"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->getWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/SubmittableWork;

    move-result-object v14

    .line 79
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://toddm.net/ants/index.html"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->getWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/SubmittableWork;

    move-result-object v13

    .line 80
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://toddm.net/gravity/index.html"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->getWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/SubmittableWork;

    move-result-object v1

    .line 82
    new-instance v2, Lnet/toddm/comm/tests/TestWork$2;

    move-object v10, v2

    move-object/from16 v11, p0

    move-object v12, v15

    move-object v3, v13

    move-object v13, v14

    move-object v4, v14

    move-object v14, v3

    move-object v5, v15

    move-object v15, v1

    invoke-direct/range {v10 .. v15}, Lnet/toddm/comm/tests/TestWork$2;-><init>(Lnet/toddm/comm/tests/TestWork;Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/SubmittableWork;)V

    .line 93
    invoke-interface {v5, v4, v2}, Lnet/toddm/comm/SubmittableWork;->setDependentWork(Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/DependentWorkListener;)V

    .line 94
    invoke-interface {v4, v3, v2}, Lnet/toddm/comm/SubmittableWork;->setDependentWork(Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/DependentWorkListener;)V

    .line 95
    invoke-interface {v3, v1, v2}, Lnet/toddm/comm/SubmittableWork;->setDependentWork(Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/DependentWorkListener;)V

    .line 98
    invoke-virtual {v0, v5}, Lnet/toddm/comm/CommManager;->enqueueWork(Lnet/toddm/comm/SubmittableWork;)Lnet/toddm/comm/Work;

    move-result-object v0

    .line 99
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 100
    invoke-static {v0}, Lnet/toddm/comm/tests/TestWork;->assertNotNull(Ljava/lang/Object;)V

    .line 101
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->isSuccessful()Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/comm/tests/TestWork;->assertTrue(Z)V

    .line 103
    move-object v14, v4

    check-cast v14, Lnet/toddm/comm/Work;

    invoke-interface {v14}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 104
    invoke-static {v0}, Lnet/toddm/comm/tests/TestWork;->assertNotNull(Ljava/lang/Object;)V

    .line 105
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->isSuccessful()Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/comm/tests/TestWork;->assertTrue(Z)V

    .line 107
    move-object v13, v3

    check-cast v13, Lnet/toddm/comm/Work;

    invoke-interface {v13}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 108
    invoke-static {v0}, Lnet/toddm/comm/tests/TestWork;->assertNotNull(Ljava/lang/Object;)V

    .line 109
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->isSuccessful()Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/comm/tests/TestWork;->assertTrue(Z)V

    .line 111
    check-cast v1, Lnet/toddm/comm/Work;

    invoke-interface {v1}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 112
    invoke-static {v0}, Lnet/toddm/comm/tests/TestWork;->assertNotNull(Ljava/lang/Object;)V

    .line 113
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->isSuccessful()Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/comm/tests/TestWork;->assertTrue(Z)V

    return-void
.end method

.method public testDependentWorkCallbackCancelsCurrentWork()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 118
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 119
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 120
    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 121
    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v0

    .line 123
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://www.toddm.net/"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->getWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/SubmittableWork;

    move-result-object v10

    .line 124
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://toddm.net/art/index.html"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->getWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/SubmittableWork;

    move-result-object v1

    .line 126
    new-instance v2, Lnet/toddm/comm/tests/TestWork$3;

    invoke-direct {v2, p0, v10, v1}, Lnet/toddm/comm/tests/TestWork$3;-><init>(Lnet/toddm/comm/tests/TestWork;Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/SubmittableWork;)V

    .line 135
    invoke-interface {v10, v1, v2}, Lnet/toddm/comm/SubmittableWork;->setDependentWork(Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/DependentWorkListener;)V

    .line 138
    invoke-virtual {v0, v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Lnet/toddm/comm/SubmittableWork;)Lnet/toddm/comm/Work;

    move-result-object v0

    .line 139
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v2

    .line 140
    invoke-static {v2}, Lnet/toddm/comm/tests/TestWork;->assertNull(Ljava/lang/Object;)V

    .line 141
    sget-object v2, Lnet/toddm/comm/Work$Status;->CANCELLED:Lnet/toddm/comm/Work$Status;

    invoke-interface {v0}, Lnet/toddm/comm/Work;->getState()Lnet/toddm/comm/Work$Status;

    move-result-object v0

    invoke-static {v2, v0}, Lnet/toddm/comm/tests/TestWork;->assertEquals(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 143
    check-cast v1, Lnet/toddm/comm/Work;

    invoke-interface {v1}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 144
    invoke-static {v0}, Lnet/toddm/comm/tests/TestWork;->assertNotNull(Ljava/lang/Object;)V

    .line 145
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->isSuccessful()Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/comm/tests/TestWork;->assertTrue(Z)V

    return-void
.end method

.method public testGetException()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 42
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    .line 44
    new-instance v1, Lnet/toddm/comm/MapConfigurationProvider;

    .line 45
    new-instance v2, Lnet/toddm/comm/tests/TestWork$1;

    invoke-direct {v2, p0}, Lnet/toddm/comm/tests/TestWork$1;-><init>(Lnet/toddm/comm/tests/TestWork;)V

    .line 44
    invoke-direct {v1, v2}, Lnet/toddm/comm/MapConfigurationProvider;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setConfigurationProvider(Lnet/toddm/comm/ConfigurationProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    const-string v1, "TEST"

    .line 52
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 53
    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 56
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://www.toddm.net/"

    invoke-direct {v2, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v0

    .line 57
    invoke-static {v0}, Lnet/toddm/comm/tests/TestWork;->assertNotNull(Ljava/lang/Object;)V

    .line 60
    :try_start_0
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v1

    .line 61
    invoke-static {v1}, Lnet/toddm/comm/tests/TestWork;->assertNull(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    :catch_0
    invoke-interface {v0}, Lnet/toddm/comm/Work;->getException()Ljava/lang/Exception;

    move-result-object v1

    invoke-static {v1}, Lnet/toddm/comm/tests/TestWork;->assertNotNull(Ljava/lang/Object;)V

    .line 67
    invoke-interface {v0}, Lnet/toddm/comm/Work;->getException()Ljava/lang/Exception;

    move-result-object v0

    instance-of v0, v0, Ljava/net/SocketTimeoutException;

    invoke-static {v0}, Lnet/toddm/comm/tests/TestWork;->assertTrue(Z)V

    return-void
.end method

.method public testSetDependentWorkCyclicDependence()V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 150
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 151
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 152
    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 153
    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v0

    .line 155
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://www.toddm.net/one"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->getWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/SubmittableWork;

    move-result-object v10

    .line 156
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://www.toddm.net/two"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->getWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/SubmittableWork;

    move-result-object v11

    .line 157
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://www.toddm.net/three"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->getWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/SubmittableWork;

    move-result-object v12

    .line 158
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://www.toddm.net/four"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->getWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/SubmittableWork;

    move-result-object v13

    .line 159
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://www.toddm.net/five"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->getWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/SubmittableWork;

    move-result-object v0

    const/4 v1, 0x0

    .line 161
    invoke-interface {v10, v11, v1}, Lnet/toddm/comm/SubmittableWork;->setDependentWork(Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/DependentWorkListener;)V

    .line 162
    invoke-interface {v11, v12, v1}, Lnet/toddm/comm/SubmittableWork;->setDependentWork(Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/DependentWorkListener;)V

    .line 163
    invoke-interface {v12, v13, v1}, Lnet/toddm/comm/SubmittableWork;->setDependentWork(Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/DependentWorkListener;)V

    .line 164
    invoke-interface {v13, v0, v1}, Lnet/toddm/comm/SubmittableWork;->setDependentWork(Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/DependentWorkListener;)V

    .line 166
    :try_start_0
    invoke-interface {v0, v10, v1}, Lnet/toddm/comm/SubmittableWork;->setDependentWork(Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/DependentWorkListener;)V

    const-string v0, "Expected IllegalArgumentException due to cyclic dependence"

    .line 167
    invoke-static {v0}, Lnet/toddm/comm/tests/TestWork;->fail(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Cyclic dependence detected"

    .line 169
    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lnet/toddm/comm/tests/TestWork;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
