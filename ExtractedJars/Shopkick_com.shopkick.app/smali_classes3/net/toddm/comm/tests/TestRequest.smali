.class public Lnet/toddm/comm/tests/TestRequest;
.super Ljunit/framework/TestCase;
.source "TestRequest.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljunit/framework/TestCase;-><init>()V

    return-void
.end method


# virtual methods
.method public testDoNotCachePreventsCaching()V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 211
    new-instance v0, Lnet/toddm/cache/MemoryCacheProvider;

    const-string v1, "testCache20w"

    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    const/16 v3, 0x14

    invoke-direct {v0, v1, v3, v2}, Lnet/toddm/cache/MemoryCacheProvider;-><init>(Ljava/lang/String;ILnet/toddm/cache/LoggingProvider;)V

    .line 212
    new-instance v1, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v1}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v2, "TEST"

    .line 213
    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 214
    invoke-virtual {v1, v0}, Lnet/toddm/comm/CommManager$Builder;->setCacheProvider(Lnet/toddm/cache/CacheProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 215
    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 216
    invoke-virtual {v1}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 218
    new-instance v3, Ljava/net/URI;

    const-string v2, "http://httpbin.org/cache/100"

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v2, v1

    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v2

    .line 219
    invoke-interface {v2}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v3

    .line 220
    invoke-static {v3}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 221
    invoke-virtual {v3}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v11, 0xc8

    invoke-static {v11, v3}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 222
    invoke-interface {v2}, Lnet/toddm/comm/Work;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v12, 0x1

    invoke-interface {v0, v2, v12}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v2

    invoke-static {v2}, Lnet/toddm/comm/tests/TestRequest;->assertTrue(Z)V

    .line 224
    new-instance v3, Ljava/net/URI;

    const-string v2, "http://httpbin.org/cache/200"

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v2, v1

    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v1

    .line 225
    invoke-interface {v1}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v2

    .line 226
    invoke-static {v2}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 227
    invoke-virtual {v2}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v11, v2}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 228
    invoke-interface {v1}, Lnet/toddm/comm/Work;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v12}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertFalse(Z)V

    return-void
.end method

.method public testGetOnlyFromCache()V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 233
    new-instance v0, Lnet/toddm/cache/MemoryCacheProvider;

    const-string v1, "testCacheThr33"

    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    const/16 v3, 0x14

    invoke-direct {v0, v1, v3, v2}, Lnet/toddm/cache/MemoryCacheProvider;-><init>(Ljava/lang/String;ILnet/toddm/cache/LoggingProvider;)V

    .line 234
    new-instance v1, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v1}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v2, "TEST"

    .line 235
    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 236
    invoke-virtual {v1, v0}, Lnet/toddm/comm/CommManager$Builder;->setCacheProvider(Lnet/toddm/cache/CacheProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 237
    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 238
    invoke-virtual {v1}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 240
    new-instance v3, Ljava/net/URI;

    const-string v2, "http://httpbin.org/cache/500"

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->GET_ONLY_FROM_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v2, v1

    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v2

    .line 241
    invoke-interface {v2}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v3

    .line 242
    invoke-static {v3}, Lnet/toddm/comm/tests/TestRequest;->assertNull(Ljava/lang/Object;)V

    .line 243
    invoke-interface {v2}, Lnet/toddm/comm/Work;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v11, 0x1

    invoke-interface {v0, v2, v11}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v2

    invoke-static {v2}, Lnet/toddm/comm/tests/TestRequest;->assertFalse(Z)V

    .line 245
    new-instance v3, Ljava/net/URI;

    const-string v2, "http://httpbin.org/cache/500"

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    move-object v2, v1

    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v2

    .line 246
    invoke-interface {v2}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v3

    .line 247
    invoke-static {v3}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 248
    invoke-virtual {v3}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v12, 0xc8

    invoke-static {v12, v4}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 249
    invoke-interface {v2}, Lnet/toddm/comm/Work;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v11}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v2

    invoke-static {v2}, Lnet/toddm/comm/tests/TestRequest;->assertTrue(Z)V

    .line 250
    invoke-virtual {v3}, Lnet/toddm/comm/Response;->isFromCache()Z

    move-result v2

    invoke-static {v2}, Lnet/toddm/comm/tests/TestRequest;->assertFalse(Z)V

    .line 251
    invoke-virtual {v3}, Lnet/toddm/comm/Response;->getResponseTimeMilliseconds()I

    move-result v13

    .line 253
    new-instance v3, Ljava/net/URI;

    const-string v2, "http://httpbin.org/cache/500"

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->GET_ONLY_FROM_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v2, v1

    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v1

    .line 254
    invoke-interface {v1}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v2

    .line 255
    invoke-static {v2}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 256
    invoke-virtual {v2}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v12, v3}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 257
    invoke-interface {v1}, Lnet/toddm/comm/Work;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v11}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertTrue(Z)V

    .line 258
    invoke-virtual {v2}, Lnet/toddm/comm/Response;->isFromCache()Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertTrue(Z)V

    .line 259
    invoke-virtual {v2}, Lnet/toddm/comm/Response;->getResponseTimeMilliseconds()I

    move-result v0

    invoke-static {v13, v0}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    return-void
.end method

.method public testMaxStaleBehavior()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 286
    new-instance v0, Lnet/toddm/cache/MemoryCacheProvider;

    const-string v1, "testCacheMaxStale"

    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    const/16 v3, 0x14

    invoke-direct {v0, v1, v3, v2}, Lnet/toddm/cache/MemoryCacheProvider;-><init>(Ljava/lang/String;ILnet/toddm/cache/LoggingProvider;)V

    .line 287
    new-instance v1, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v1}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v2, "TEST_MAX_STALE"

    .line 288
    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 289
    invoke-virtual {v1, v0}, Lnet/toddm/comm/CommManager$Builder;->setCacheProvider(Lnet/toddm/cache/CacheProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 290
    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 291
    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v0

    .line 294
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://httpbin.org/response-headers?Cache-Control=public,+max-age=1,+max-stale=1"

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

    .line 295
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    const-string v2, "net.toddm.comm.CommWork"

    .line 296
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    invoke-interface {v1}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v1

    .line 299
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 300
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0xc8

    invoke-static {v3, v2}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 301
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getTtlFromHeaders()Ljava/lang/Long;

    move-result-object v2

    invoke-static {v2}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 302
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getTtlFromHeaders()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    invoke-static {v4, v5, v2, v3}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(JJ)V

    .line 303
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getMaxStaleFromHeaders()Ljava/lang/Long;

    move-result-object v2

    invoke-static {v2}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 304
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getMaxStaleFromHeaders()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v4, v5, v1, v2}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(JJ)V

    .line 307
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://httpbin.org/response-headers?Cache-Control=public,+max-age=1,+max-stale=1"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v1

    .line 308
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    const-string v2, "net.toddm.comm.CachedWork"

    .line 309
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v1, 0x3e9

    .line 311
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 314
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://httpbin.org/response-headers?Cache-Control=public,+max-age=1,+max-stale=1"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v1

    .line 315
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    const-string v2, "net.toddm.comm.CachedWork"

    .line 316
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://httpbin.org/response-headers?Cache-Control=public,+max-age=1,+max-stale=1"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v0

    .line 320
    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    const-string v1, "net.toddm.comm.CachedWork"

    .line 321
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public testNoCachePreventsCaching()V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 189
    new-instance v0, Lnet/toddm/cache/MemoryCacheProvider;

    const-string v1, "testCache"

    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    const/16 v3, 0x14

    invoke-direct {v0, v1, v3, v2}, Lnet/toddm/cache/MemoryCacheProvider;-><init>(Ljava/lang/String;ILnet/toddm/cache/LoggingProvider;)V

    .line 190
    new-instance v1, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v1}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v2, "TEST"

    .line 191
    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 192
    invoke-virtual {v1, v0}, Lnet/toddm/comm/CommManager$Builder;->setCacheProvider(Lnet/toddm/cache/CacheProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 193
    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 194
    invoke-virtual {v1}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 196
    new-instance v3, Ljava/net/URI;

    const-string v2, "http://httpbin.org/cache/100"

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v2, v1

    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v2

    .line 197
    invoke-interface {v2}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v3

    .line 198
    invoke-static {v3}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 199
    invoke-virtual {v3}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v11, 0xc8

    invoke-static {v11, v3}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 200
    invoke-interface {v2}, Lnet/toddm/comm/Work;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v12, 0x1

    invoke-interface {v0, v2, v12}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v2

    invoke-static {v2}, Lnet/toddm/comm/tests/TestRequest;->assertTrue(Z)V

    .line 202
    new-instance v3, Ljava/net/URI;

    const-string v2, "http://httpbin.org/response-headers?Cache-Control=no-cache"

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    move-object v2, v1

    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v1

    .line 203
    invoke-interface {v1}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v2

    .line 204
    invoke-static {v2}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 205
    invoke-virtual {v2}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v11, v2}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 206
    invoke-interface {v1}, Lnet/toddm/comm/Work;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v12}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertFalse(Z)V

    return-void
.end method

.method public testRequest()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 41
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 42
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 44
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://www.toddm.net/"

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

    .line 45
    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 47
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 48
    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 49
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xc8

    invoke-static {v2, v1}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 50
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseBody()Ljava/lang/String;

    move-result-object v0

    .line 51
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 52
    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 53
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertTrue(Z)V

    return-void
.end method

.method public testRequestCachingHeaders()V
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

    .line 135
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://www.toddm.net/"

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

    .line 136
    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 138
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 139
    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 140
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xc8

    invoke-static {v2, v1}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 143
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getTtlFromHeaders()Ljava/lang/Long;

    move-result-object v1

    .line 144
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 145
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/32 v4, 0x36ee80

    invoke-static {v4, v5, v2, v3}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(JJ)V

    .line 146
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "TTL from response headers: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 148
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getETagFromHeaders()Ljava/lang/String;

    move-result-object v0

    .line 149
    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 150
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ETag from response headers: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public testRequestCanceling()V
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 58
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 59
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v0

    .line 61
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

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v1

    .line 62
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 63
    invoke-interface {v1}, Lnet/toddm/comm/Work;->getId()I

    move-result v2

    const/4 v10, 0x1

    invoke-virtual {v0, v2, v10}, Lnet/toddm/comm/CommManager;->cancel(IZ)V

    .line 64
    invoke-interface {v1}, Lnet/toddm/comm/Work;->isCancelled()Z

    move-result v2

    invoke-static {v2}, Lnet/toddm/comm/tests/TestRequest;->assertTrue(Z)V

    .line 66
    new-instance v11, Ljava/lang/String;

    const-string v2, "http://httpbin.org/response-headers?sleepTime=%1$d"

    invoke-direct {v11, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    const-wide/16 v12, 0x14

    move-wide v14, v12

    .line 68
    :goto_0
    invoke-interface {v1}, Lnet/toddm/comm/Work;->isCancelled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 80
    invoke-interface {v1}, Lnet/toddm/comm/Work;->isDone()Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertTrue(Z)V

    return-void

    .line 69
    :cond_0
    new-instance v2, Ljava/net/URI;

    new-array v1, v10, [Ljava/lang/Object;

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/16 v16, 0x0

    aput-object v3, v1, v16

    invoke-static {v11, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v1

    .line 70
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 71
    invoke-static {v14, v15}, Ljava/lang/Thread;->sleep(J)V

    .line 73
    invoke-interface {v1}, Lnet/toddm/comm/Work;->getId()I

    move-result v2

    invoke-virtual {v0, v2, v10}, Lnet/toddm/comm/CommManager;->cancel(IZ)V

    const-string v2, "Expected Cancelled or Done but got \'%1$s\'"

    .line 75
    new-array v3, v10, [Ljava/lang/Object;

    invoke-interface {v1}, Lnet/toddm/comm/Work;->getState()Lnet/toddm/comm/Work$Status;

    move-result-object v4

    aput-object v4, v3, v16

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 76
    invoke-interface {v1}, Lnet/toddm/comm/Work;->isCancelled()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v1}, Lnet/toddm/comm/Work;->isDone()Z

    move-result v3

    if-nez v3, :cond_1

    move/from16 v3, v16

    goto :goto_1

    :cond_1
    move v3, v10

    .line 74
    :goto_1
    invoke-static {v2, v3}, Lnet/toddm/comm/tests/TestRequest;->assertTrue(Ljava/lang/String;Z)V

    add-long/2addr v14, v12

    goto :goto_0
.end method

.method public testRequestEquality()V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 326
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 328
    new-instance v1, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v1}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v2, "TEST"

    .line 329
    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 331
    new-instance v3, Ljava/net/URI;

    const-string v2, "http://www.toddm.net/"

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v2, v1

    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v11

    .line 332
    invoke-static {v11}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 333
    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 335
    new-instance v3, Ljava/net/URI;

    const-string v2, "http://www.toddm.net/?paramA=Apple&paramB=Baby"

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v2, v1

    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v12

    .line 336
    invoke-static {v12}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 337
    invoke-interface {v11}, Lnet/toddm/comm/Work;->getId()I

    move-result v2

    invoke-interface {v12}, Lnet/toddm/comm/Work;->getId()I

    move-result v3

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-eq v2, v3, :cond_0

    move v2, v13

    goto :goto_0

    :cond_0
    move v2, v14

    :goto_0
    invoke-static {v2}, Ljunit/framework/Assert;->assertTrue(Z)V

    .line 338
    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 340
    new-instance v3, Ljava/net/URI;

    const-string v2, "http://www.toddm.net/?paramB=Baby&paramA=Apple"

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v2, v1

    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v2

    .line 341
    invoke-static {v2}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 342
    invoke-interface {v12}, Lnet/toddm/comm/Work;->getId()I

    move-result v3

    invoke-interface {v2}, Lnet/toddm/comm/Work;->getId()I

    move-result v4

    if-ne v3, v4, :cond_1

    move v3, v13

    goto :goto_1

    :cond_1
    move v3, v14

    :goto_1
    invoke-static {v3}, Ljunit/framework/Assert;->assertTrue(Z)V

    .line 343
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 346
    new-instance v3, Ljava/net/URI;

    const-string v2, "http://www.toddm.net/"

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 347
    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->POST:Lnet/toddm/comm/Request$RequestMethod;

    .line 348
    new-instance v2, Ljava/lang/String;

    const-string v5, "test POST data"

    invoke-direct {v2, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    const-string v5, "UTF-8"

    invoke-virtual {v2, v5}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    .line 350
    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    .line 351
    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    .line 352
    sget-object v10, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v2, v1

    .line 345
    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v12

    .line 353
    invoke-static {v12}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 354
    invoke-interface {v11}, Lnet/toddm/comm/Work;->getId()I

    move-result v2

    invoke-interface {v12}, Lnet/toddm/comm/Work;->getId()I

    move-result v3

    if-eq v2, v3, :cond_2

    move v2, v13

    goto :goto_2

    :cond_2
    move v2, v14

    :goto_2
    invoke-static {v2}, Ljunit/framework/Assert;->assertTrue(Z)V

    .line 355
    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 358
    new-instance v3, Ljava/net/URI;

    const-string v2, "http://www.toddm.net/"

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 359
    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->POST:Lnet/toddm/comm/Request$RequestMethod;

    .line 360
    new-instance v2, Ljava/lang/String;

    const-string v5, "test POST data"

    invoke-direct {v2, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    const-string v5, "UTF-8"

    invoke-virtual {v2, v5}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    .line 362
    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    .line 363
    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    .line 364
    sget-object v10, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v2, v1

    .line 357
    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v11

    .line 365
    invoke-static {v11}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 366
    invoke-interface {v12}, Lnet/toddm/comm/Work;->getId()I

    move-result v2

    invoke-interface {v11}, Lnet/toddm/comm/Work;->getId()I

    move-result v3

    if-ne v2, v3, :cond_3

    move v2, v13

    goto :goto_3

    :cond_3
    move v2, v14

    :goto_3
    invoke-static {v2}, Ljunit/framework/Assert;->assertTrue(Z)V

    .line 367
    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 370
    new-instance v3, Ljava/net/URI;

    const-string v2, "http://www.toddm.net/"

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 371
    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->POST:Lnet/toddm/comm/Request$RequestMethod;

    .line 372
    new-instance v2, Ljava/lang/String;

    const-string v5, "test POST data-"

    invoke-direct {v2, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    const-string v5, "UTF-8"

    invoke-virtual {v2, v5}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    .line 374
    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    .line 375
    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    .line 376
    sget-object v10, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v2, v1

    .line 369
    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v1

    .line 377
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 378
    invoke-interface {v11}, Lnet/toddm/comm/Work;->getId()I

    move-result v2

    invoke-interface {v1}, Lnet/toddm/comm/Work;->getId()I

    move-result v3

    if-eq v2, v3, :cond_4

    move v2, v13

    goto :goto_4

    :cond_4
    move v2, v14

    :goto_4
    invoke-static {v2}, Ljunit/framework/Assert;->assertTrue(Z)V

    .line 379
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 381
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_5

    return-void

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/toddm/comm/Work;

    .line 382
    invoke-interface {v1}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v1

    .line 383
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    const/16 v2, 0xc8

    .line 384
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v2, v3}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 385
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseBytes()[B

    move-result-object v2

    invoke-static {v2}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 386
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseBytes()[B

    move-result-object v1

    array-length v1, v1

    if-lez v1, :cond_6

    move v1, v13

    goto :goto_6

    :cond_6
    move v1, v14

    :goto_6
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertTrue(Z)V

    goto :goto_5
.end method

.method public testRequestRedirectAbsolute()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 85
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 86
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 87
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://httpbin.org/redirect-to?url=http%3A%2F%2Fwww.toddm.net%2F"

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

    .line 88
    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 90
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v1

    .line 91
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 92
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xc8

    invoke-static {v2, v1}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 93
    invoke-interface {v0}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/Request;->getRedirectCount()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    return-void
.end method

.method public testRequestRedirectRelative()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 98
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 99
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 100
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://httpbin.org/relative-redirect/3"

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

    .line 101
    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 103
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v1

    .line 104
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 105
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xc8

    invoke-static {v2, v1}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 106
    invoke-interface {v0}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/Request;->getRedirectCount()I

    move-result v0

    const/4 v1, 0x3

    invoke-static {v1, v0}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    return-void
.end method

.method public testRequestWithCaching()V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 155
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 157
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 158
    new-instance v1, Lnet/toddm/cache/MemoryCacheProvider;

    const-string v2, "testCache"

    new-instance v3, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v3}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    const/16 v4, 0x14

    invoke-direct {v1, v2, v4, v3}, Lnet/toddm/cache/MemoryCacheProvider;-><init>(Ljava/lang/String;ILnet/toddm/cache/LoggingProvider;)V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setCacheProvider(Lnet/toddm/cache/CacheProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 159
    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    .line 160
    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v0

    .line 162
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://www.toddm.net/"

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

    .line 163
    invoke-static {v10}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 165
    invoke-interface {v10}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v1

    .line 166
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 167
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v11, 0xc8

    invoke-static {v11, v2}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 168
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseBody()Ljava/lang/String;

    move-result-object v1

    .line 169
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 170
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 171
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-lez v1, :cond_0

    move v1, v12

    goto :goto_0

    :cond_0
    move v1, v13

    :goto_0
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertTrue(Z)V

    .line 173
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://www.toddm.net/"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v0

    .line 174
    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 176
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v1

    .line 177
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 178
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v11, v2}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 179
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseBody()Ljava/lang/String;

    move-result-object v1

    .line 180
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 181
    invoke-static {v1}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 182
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    goto :goto_1

    :cond_1
    move v12, v13

    :goto_1
    invoke-static {v12}, Lnet/toddm/comm/tests/TestRequest;->assertTrue(Z)V

    .line 184
    invoke-interface {v10}, Lnet/toddm/comm/Work;->getId()I

    move-result v1

    invoke-interface {v0}, Lnet/toddm/comm/Work;->getId()I

    move-result v0

    invoke-static {v1, v0}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    return-void
.end method

.method public testRequestWithHeaders()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 111
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 112
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 114
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v0, "Content-Language"

    const-string v2, "en-US"

    .line 115
    invoke-interface {v5, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Content-Type"

    const-string v2, "application/x-www-form-urlencoded"

    .line 116
    invoke-interface {v5, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://www.toddm.net/"

    invoke-direct {v2, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v4, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v0

    .line 119
    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 121
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v0

    .line 122
    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 123
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xc8

    invoke-static {v2, v1}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 124
    invoke-virtual {v0}, Lnet/toddm/comm/Response;->getResponseBody()Ljava/lang/String;

    move-result-object v0

    .line 125
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 126
    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 127
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertTrue(Z)V

    return-void
.end method

.method public testServerDirectedCache()V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 264
    new-instance v0, Lnet/toddm/cache/MemoryCacheProvider;

    const-string v1, "testCache4our"

    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    const/16 v3, 0x14

    invoke-direct {v0, v1, v3, v2}, Lnet/toddm/cache/MemoryCacheProvider;-><init>(Ljava/lang/String;ILnet/toddm/cache/LoggingProvider;)V

    .line 265
    new-instance v1, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v1}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v2, "TEST"

    .line 266
    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 267
    invoke-virtual {v1, v0}, Lnet/toddm/comm/CommManager$Builder;->setCacheProvider(Lnet/toddm/cache/CacheProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 268
    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v1, v2}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v1

    .line 269
    invoke-virtual {v1}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 271
    new-instance v3, Ljava/net/URI;

    const-string v2, "http://httpbin.org/response-headers?Cache-Control=blah"

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v2, v1

    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v2

    .line 272
    invoke-interface {v2}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v3

    .line 273
    invoke-static {v3}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 274
    invoke-virtual {v3}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v11, 0xc8

    invoke-static {v11, v3}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 275
    invoke-interface {v2}, Lnet/toddm/comm/Work;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v12, 0x1

    invoke-interface {v0, v2, v12}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v2

    invoke-static {v2}, Lnet/toddm/comm/tests/TestRequest;->assertFalse(Z)V

    .line 277
    new-instance v3, Ljava/net/URI;

    const-string v2, "http://httpbin.org/cache/200"

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v4, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v2, v1

    invoke-virtual/range {v2 .. v10}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v1

    .line 278
    invoke-interface {v1}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v2

    .line 279
    invoke-static {v2}, Lnet/toddm/comm/tests/TestRequest;->assertNotNull(Ljava/lang/Object;)V

    .line 280
    invoke-virtual {v2}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v11, v2}, Lnet/toddm/comm/tests/TestRequest;->assertEquals(II)V

    .line 281
    invoke-interface {v1}, Lnet/toddm/comm/Work;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v12}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/comm/tests/TestRequest;->assertTrue(Z)V

    return-void
.end method
