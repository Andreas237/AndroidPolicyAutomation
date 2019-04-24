.class public Lnet/toddm/comm/tests/TestResponse;
.super Ljunit/framework/TestCase;
.source "TestResponse.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljunit/framework/TestCase;-><init>()V

    return-void
.end method

.method public static validateInvalidateCache(Lnet/toddm/cache/CacheProvider;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 48
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "testInvalidateCache"

    .line 50
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 51
    invoke-virtual {v0, p0}, Lnet/toddm/comm/CommManager$Builder;->setCacheProvider(Lnet/toddm/cache/CacheProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 52
    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v0

    .line 55
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://httpbin.org/cache/1000"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v1

    .line 56
    invoke-static {v1}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 58
    invoke-interface {v1}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v2

    .line 59
    invoke-static {v2}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 60
    invoke-virtual {v2}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0xc8

    invoke-static {v3, v2}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(II)V

    .line 63
    invoke-interface {v1}, Lnet/toddm/comm/Work;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    .line 64
    invoke-interface {p0, v2, v3}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v4

    invoke-static {v4}, Lnet/toddm/comm/tests/TestResponse;->assertTrue(Z)V

    .line 67
    invoke-interface {v1}, Lnet/toddm/comm/Work;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager;->invalidateCache(I)V

    const/4 v0, 0x1

    .line 68
    invoke-interface {p0, v2, v0}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertTrue(Z)V

    .line 69
    invoke-interface {p0, v2, v3}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result p0

    invoke-static {p0}, Lnet/toddm/comm/tests/TestResponse;->assertFalse(Z)V

    return-void
.end method

.method public static validatePurgeCache(Lnet/toddm/cache/CacheProvider;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 79
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "testPurgeCache"

    .line 81
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 82
    invoke-virtual {v0, p0}, Lnet/toddm/comm/CommManager$Builder;->setCacheProvider(Lnet/toddm/cache/CacheProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 83
    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 84
    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v0

    .line 86
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://httpbin.org/cache/1000"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v10

    .line 87
    invoke-static {v10}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 88
    invoke-interface {v10}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v1

    .line 89
    invoke-static {v1}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 90
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v11, 0xc8

    invoke-static {v11, v1}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(II)V

    .line 92
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://httpbin.org/cache/2000"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v1

    .line 93
    invoke-static {v1}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 94
    invoke-interface {v1}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v2

    .line 95
    invoke-static {v2}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 96
    invoke-virtual {v2}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v11, v2}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(II)V

    .line 99
    invoke-interface {v10}, Lnet/toddm/comm/Work;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    .line 100
    invoke-interface {p0, v2, v3}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v4

    invoke-static {v4}, Lnet/toddm/comm/tests/TestResponse;->assertTrue(Z)V

    .line 101
    invoke-interface {v1}, Lnet/toddm/comm/Work;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 102
    invoke-interface {p0, v1, v3}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v3

    invoke-static {v3}, Lnet/toddm/comm/tests/TestResponse;->assertTrue(Z)V

    .line 105
    invoke-interface {v10}, Lnet/toddm/comm/Work;->getId()I

    move-result v3

    invoke-virtual {v0, v3}, Lnet/toddm/comm/CommManager;->purgeCache(I)V

    const/4 v3, 0x1

    .line 106
    invoke-interface {p0, v2, v3}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v4

    invoke-static {v4}, Lnet/toddm/comm/tests/TestResponse;->assertFalse(Z)V

    .line 107
    invoke-interface {p0, v1, v3}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v4

    invoke-static {v4}, Lnet/toddm/comm/tests/TestResponse;->assertTrue(Z)V

    .line 110
    invoke-virtual {v0}, Lnet/toddm/comm/CommManager;->purgeCache()V

    .line 111
    invoke-interface {p0, v2, v3}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertFalse(Z)V

    .line 112
    invoke-interface {p0, v1, v3}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result p0

    invoke-static {p0}, Lnet/toddm/comm/tests/TestResponse;->assertFalse(Z)V

    return-void
.end method


# virtual methods
.method public test304Responses()V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 249
    new-instance v0, Lnet/toddm/cache/MemoryCacheProvider;

    const-string v1, "testCache"

    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    const/16 v3, 0x14

    invoke-direct {v0, v1, v3, v2}, Lnet/toddm/cache/MemoryCacheProvider;-><init>(Ljava/lang/String;ILnet/toddm/cache/LoggingProvider;)V

    .line 250
    new-instance v1, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v1}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v2, "TEST"

    .line 252
    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 253
    invoke-virtual {v1, v0}, Lnet/toddm/comm/CommManager$Builder;->setCacheProvider(Lnet/toddm/cache/CacheProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 254
    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 255
    invoke-virtual {v1}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v11

    .line 257
    new-instance v3, Ljava/net/URI;

    const-string v1, "http://httpbin.org/cache"

    invoke-direct {v3, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v2, v11

    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v1

    .line 258
    invoke-static {v1}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 260
    invoke-interface {v1}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v2

    .line 261
    invoke-static {v2}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 262
    invoke-virtual {v2}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v12, 0xc8

    invoke-static {v12, v2}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(II)V

    .line 265
    invoke-interface {v1}, Lnet/toddm/comm/Work;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lnet/toddm/cache/MemoryCacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v1

    .line 266
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getBytesValue()[B

    move-result-object v3

    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getEtag()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getUri()Ljava/net/URI;

    move-result-object v8

    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getPriority()Lnet/toddm/cache/CachePriority;

    move-result-object v9

    const-wide/16 v4, 0x64

    const-wide/16 v13, 0x0

    move-object v1, v2

    move-object v2, v3

    move-wide v3, v4

    move-wide v5, v13

    invoke-virtual/range {v0 .. v9}, Lnet/toddm/cache/MemoryCacheProvider;->add(Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    const-wide/16 v0, 0x65

    .line 268
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 270
    new-instance v3, Ljava/net/URI;

    const-string v0, "http://httpbin.org/cache"

    invoke-direct {v3, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v2, v11

    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v0

    .line 271
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 273
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 274
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 275
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v12, v0}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(II)V

    return-void
.end method

.method public testGetETagFromHeaders()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 149
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    .line 151
    new-instance v1, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v1}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v2, "TEST"

    .line 152
    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v2

    .line 153
    new-instance v3, Ljava/net/URI;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "http://httpbin.org/response-headers?ETag=%1$s"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    invoke-static {v1, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

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

    .line 154
    invoke-static {v1}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 156
    invoke-interface {v1}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v1

    .line 157
    invoke-static {v1}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 158
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0xc8

    invoke-static {v3, v2}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(II)V

    .line 159
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getETagFromHeaders()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 160
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getETagFromHeaders()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public testGetLocationFromHeadersAbsolute()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 117
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 118
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 119
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://httpbin.org/response-headers?Location=http%3A%2F%2Fwww.toddm.net%2F"

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

    .line 120
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 122
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v1

    .line 123
    invoke-static {v1}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 124
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0xc8

    invoke-static {v3, v2}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(II)V

    .line 125
    invoke-interface {v0}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v0

    invoke-virtual {v1, v0}, Lnet/toddm/comm/Response;->getLocationFromHeaders(Lnet/toddm/comm/Request;)Ljava/net/URI;

    move-result-object v0

    .line 126
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    const-string v1, "http://www.toddm.net/"

    .line 127
    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public testGetLocationFromHeadersRelative()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 132
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 133
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 134
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://httpbin.org/response-headers?Location=%2Fget"

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

    .line 135
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 137
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v1

    .line 138
    invoke-static {v1}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 139
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0xc8

    invoke-static {v3, v2}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(II)V

    .line 140
    invoke-interface {v0}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v0

    invoke-virtual {v1, v0}, Lnet/toddm/comm/Response;->getLocationFromHeaders(Lnet/toddm/comm/Request;)Ljava/net/URI;

    move-result-object v0

    .line 141
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    const-string v1, "http://httpbin.org/get?Location=/get"

    .line 144
    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public testGetMaxStaleFromHeaders()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 179
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 180
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 181
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://httpbin.org/response-headers?Cache-Control=public,+max-age=100,+max-stale=13"

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

    .line 182
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 184
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 185
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 186
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xc8

    invoke-static {v2, v1}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(II)V

    .line 187
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getMaxStaleFromHeaders()Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 188
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getMaxStaleFromHeaders()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x32c8

    invoke-static {v2, v3, v0, v1}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(JJ)V

    return-void
.end method

.method public testGetRetryAfterHTTPDateInTheFuture()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 220
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 221
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 222
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://httpbin.org/response-headers?Retry-After=Fri%2C%2007%20Nov%202088%2023%3A59%3A59%20GMT"

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

    .line 223
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 225
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 226
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 227
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xc8

    invoke-static {v2, v1}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(II)V

    .line 228
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getRetryAfter()Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 229
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getRetryAfter()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertTrue(Z)V

    return-void
.end method

.method public testGetRetryAfterHTTPDateInThePast()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 234
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 235
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 236
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://httpbin.org/response-headers?Retry-After=Fri%2C%2007%20Nov%202014%2023%3A59%3A59%20GMT"

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

    .line 237
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 239
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 240
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 241
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xc8

    invoke-static {v2, v1}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(II)V

    .line 242
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getRetryAfter()Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 243
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getRetryAfter()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertTrue(Z)V

    return-void
.end method

.method public testGetRetryAfterSeconds()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 206
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 207
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 208
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://httpbin.org/response-headers?Retry-After=120"

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

    .line 209
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 211
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 212
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 213
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xc8

    invoke-static {v2, v1}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(II)V

    .line 214
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getRetryAfter()Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 215
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getRetryAfter()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x78

    invoke-static {v2, v3, v0, v1}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(JJ)V

    return-void
.end method

.method public testGetTtlFromHeaders()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 165
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 166
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 167
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://httpbin.org/cache/100"

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

    .line 168
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 170
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 171
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 172
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xc8

    invoke-static {v2, v1}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(II)V

    .line 173
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getTtlFromHeaders()Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 174
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getTtlFromHeaders()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/32 v2, 0x186a0

    invoke-static {v2, v3, v0, v1}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(JJ)V

    return-void
.end method

.method public testInvalidateCache()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 42
    new-instance v0, Lnet/toddm/cache/MemoryCacheProvider;

    const-string v1, "testInvalidateCache"

    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    const/16 v3, 0x14

    invoke-direct {v0, v1, v3, v2}, Lnet/toddm/cache/MemoryCacheProvider;-><init>(Ljava/lang/String;ILnet/toddm/cache/LoggingProvider;)V

    .line 43
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->validateInvalidateCache(Lnet/toddm/cache/CacheProvider;)V

    return-void
.end method

.method public testPurgeCache()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 73
    new-instance v0, Lnet/toddm/cache/MemoryCacheProvider;

    const-string v1, "testPurgeCache"

    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    const/16 v3, 0x14

    invoke-direct {v0, v1, v3, v2}, Lnet/toddm/cache/MemoryCacheProvider;-><init>(Ljava/lang/String;ILnet/toddm/cache/LoggingProvider;)V

    .line 74
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->validatePurgeCache(Lnet/toddm/cache/CacheProvider;)V

    return-void
.end method

.method public testShouldNotCacheDueToNoCacheDirective()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 193
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 194
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 195
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://httpbin.org/response-headers?Cache-Control=no-cache"

    invoke-direct {v2, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v0

    .line 196
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 198
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 199
    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertNotNull(Ljava/lang/Object;)V

    .line 200
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xc8

    invoke-static {v2, v1}, Lnet/toddm/comm/tests/TestResponse;->assertEquals(II)V

    .line 201
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->shouldNotCacheDueToNoCacheDirective()Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/comm/tests/TestResponse;->assertTrue(Z)V

    return-void
.end method
