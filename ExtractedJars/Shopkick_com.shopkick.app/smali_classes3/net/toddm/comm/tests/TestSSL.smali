.class public Lnet/toddm/comm/tests/TestSSL;
.super Ljunit/framework/TestCase;
.source "TestSSL.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljunit/framework/TestCase;-><init>()V

    return-void
.end method


# virtual methods
.method public testBadCert()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 49
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    .line 51
    new-instance v1, Lnet/toddm/comm/MapConfigurationProvider;

    .line 52
    new-instance v2, Lnet/toddm/comm/tests/TestSSL$1;

    invoke-direct {v2, p0}, Lnet/toddm/comm/tests/TestSSL$1;-><init>(Lnet/toddm/comm/tests/TestSSL;)V

    .line 51
    invoke-direct {v1, v2}, Lnet/toddm/comm/MapConfigurationProvider;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setConfigurationProvider(Lnet/toddm/comm/ConfigurationProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    const-string v2, "TEST"

    .line 58
    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 59
    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 60
    invoke-virtual {v1}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v2

    .line 62
    new-instance v3, Ljava/net/URI;

    const-string v1, "https://testssl-expire.disig.sk/index.en.html"

    invoke-direct {v3, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v1

    .line 63
    invoke-static {v1}, Lnet/toddm/comm/tests/TestSSL;->assertNotNull(Ljava/lang/Object;)V

    .line 64
    invoke-interface {v1}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v1

    .line 65
    invoke-static {v1}, Lnet/toddm/comm/tests/TestSSL;->assertNotNull(Ljava/lang/Object;)V

    .line 66
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xc8

    invoke-static {v2, v1}, Lnet/toddm/comm/tests/TestSSL;->assertEquals(II)V

    .line 69
    new-instance v1, Lnet/toddm/comm/MapConfigurationProvider;

    .line 70
    new-instance v2, Lnet/toddm/comm/tests/TestSSL$2;

    invoke-direct {v2, p0}, Lnet/toddm/comm/tests/TestSSL$2;-><init>(Lnet/toddm/comm/tests/TestSSL;)V

    .line 69
    invoke-direct {v1, v2}, Lnet/toddm/comm/MapConfigurationProvider;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setConfigurationProvider(Lnet/toddm/comm/ConfigurationProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 76
    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 79
    new-instance v2, Ljava/net/URI;

    const-string v0, "https://testssl-expire.disig.sk/index.en.html"

    invoke-direct {v2, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v4, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v0

    .line 80
    invoke-static {v0}, Lnet/toddm/comm/tests/TestSSL;->assertNotNull(Ljava/lang/Object;)V

    .line 81
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 82
    invoke-static {v0}, Lnet/toddm/comm/tests/TestSSL;->assertNull(Ljava/lang/Object;)V

    return-void
.end method

.method public testGoodCert()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 37
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 38
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 39
    new-instance v2, Ljava/net/URI;

    const-string v0, "https://httpbin.org/status/200"

    invoke-direct {v2, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v0

    .line 40
    invoke-static {v0}, Lnet/toddm/comm/tests/TestSSL;->assertNotNull(Ljava/lang/Object;)V

    .line 42
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 43
    invoke-static {v0}, Lnet/toddm/comm/tests/TestSSL;->assertNotNull(Ljava/lang/Object;)V

    .line 44
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xc8

    invoke-static {v1, v0}, Lnet/toddm/comm/tests/TestSSL;->assertEquals(II)V

    return-void
.end method
