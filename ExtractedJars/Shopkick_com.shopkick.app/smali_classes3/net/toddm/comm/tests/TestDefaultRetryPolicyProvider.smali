.class public Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;
.super Ljunit/framework/TestCase;
.source "TestDefaultRetryPolicyProvider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$RequestStub;,
        Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$ResponseStub;,
        Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljunit/framework/TestCase;-><init>()V

    return-void
.end method


# virtual methods
.method public test202Handling()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 96
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 97
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 99
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://httpbin.org/status/202"

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

    .line 100
    invoke-static {v0}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertNotNull(Ljava/lang/Object;)V

    .line 102
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v1

    .line 103
    invoke-static {v1}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertNotNull(Ljava/lang/Object;)V

    .line 104
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xca

    invoke-static {v2, v1}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertEquals(II)V

    .line 105
    invoke-interface {v0}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/Request;->getRetryCountFromResponse()I

    move-result v0

    const/4 v1, 0x5

    invoke-static {v1, v0}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertEquals(II)V

    return-void
.end method

.method public test503Handling()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 81
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 82
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 84
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://httpbin.org/status/503"

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

    .line 85
    invoke-static {v0}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertNotNull(Ljava/lang/Object;)V

    .line 87
    invoke-interface {v0}, Lnet/toddm/comm/Work;->get()Lnet/toddm/comm/Response;

    move-result-object v1

    .line 88
    invoke-static {v1}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertNotNull(Ljava/lang/Object;)V

    .line 89
    invoke-virtual {v1}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x1f7

    invoke-static {v2, v1}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertEquals(II)V

    .line 90
    invoke-interface {v0}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/Request;->getRetryCountFromResponse()I

    move-result v0

    const/4 v1, 0x5

    invoke-static {v1, v0}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertEquals(II)V

    return-void
.end method

.method public testShouldRetryOnError()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 46
    new-instance v0, Lnet/toddm/comm/DefaultRetryPolicyProvider;

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-direct {v0, v1}, Lnet/toddm/comm/DefaultRetryPolicyProvider;-><init>(Lnet/toddm/cache/LoggingProvider;)V

    .line 49
    new-instance v1, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;

    invoke-direct {v1, p0}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;-><init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;)V

    new-instance v2, Ljava/net/SocketTimeoutException;

    invoke-direct {v2}, Ljava/net/SocketTimeoutException;-><init>()V

    invoke-virtual {v0, v1, v2}, Lnet/toddm/comm/DefaultRetryPolicyProvider;->shouldRetry(Lnet/toddm/comm/Work;Ljava/lang/Exception;)Lnet/toddm/comm/RetryProfile;

    move-result-object v1

    .line 50
    invoke-virtual {v1}, Lnet/toddm/comm/RetryProfile;->shouldRetry()Z

    move-result v2

    invoke-static {v2}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertTrue(Z)V

    .line 51
    invoke-virtual {v1}, Lnet/toddm/comm/RetryProfile;->getRetryAfterMilliseconds()J

    move-result-wide v1

    const-wide/16 v3, 0xbb8

    invoke-static {v3, v4, v1, v2}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertEquals(JJ)V

    .line 54
    new-instance v1, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;

    invoke-direct {v1, p0}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;-><init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;)V

    new-instance v2, Ljava/lang/NullPointerException;

    invoke-direct {v2}, Ljava/lang/NullPointerException;-><init>()V

    invoke-virtual {v0, v1, v2}, Lnet/toddm/comm/DefaultRetryPolicyProvider;->shouldRetry(Lnet/toddm/comm/Work;Ljava/lang/Exception;)Lnet/toddm/comm/RetryProfile;

    move-result-object v1

    .line 55
    invoke-virtual {v1}, Lnet/toddm/comm/RetryProfile;->shouldRetry()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertFalse(Z)V

    .line 58
    new-instance v1, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;-><init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;Z)V

    new-instance v2, Ljava/net/SocketTimeoutException;

    invoke-direct {v2}, Ljava/net/SocketTimeoutException;-><init>()V

    invoke-virtual {v0, v1, v2}, Lnet/toddm/comm/DefaultRetryPolicyProvider;->shouldRetry(Lnet/toddm/comm/Work;Ljava/lang/Exception;)Lnet/toddm/comm/RetryProfile;

    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lnet/toddm/comm/RetryProfile;->shouldRetry()Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertFalse(Z)V

    return-void
.end method

.method public testShouldRetryOnResponse()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 64
    new-instance v0, Lnet/toddm/comm/DefaultRetryPolicyProvider;

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-direct {v0, v1}, Lnet/toddm/comm/DefaultRetryPolicyProvider;-><init>(Lnet/toddm/cache/LoggingProvider;)V

    .line 66
    new-instance v1, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;

    invoke-direct {v1, p0}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;-><init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;)V

    new-instance v2, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$ResponseStub;

    const/16 v3, 0x12e

    const/4 v4, 0x0

    invoke-direct {v2, p0, v3, v4}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$ResponseStub;-><init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;ILjava/lang/Long;)V

    invoke-virtual {v0, v1, v2}, Lnet/toddm/comm/DefaultRetryPolicyProvider;->shouldRetry(Lnet/toddm/comm/Work;Lnet/toddm/comm/Response;)Lnet/toddm/comm/RetryProfile;

    move-result-object v1

    .line 67
    invoke-virtual {v1}, Lnet/toddm/comm/RetryProfile;->shouldRetry()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertFalse(Z)V

    .line 69
    new-instance v1, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;

    invoke-direct {v1, p0}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;-><init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;)V

    new-instance v2, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$ResponseStub;

    const-wide/16 v3, 0xd

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/16 v4, 0x1f7

    invoke-direct {v2, p0, v4, v3}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$ResponseStub;-><init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;ILjava/lang/Long;)V

    invoke-virtual {v0, v1, v2}, Lnet/toddm/comm/DefaultRetryPolicyProvider;->shouldRetry(Lnet/toddm/comm/Work;Lnet/toddm/comm/Response;)Lnet/toddm/comm/RetryProfile;

    move-result-object v1

    .line 70
    invoke-virtual {v1}, Lnet/toddm/comm/RetryProfile;->shouldRetry()Z

    move-result v2

    invoke-static {v2}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertTrue(Z)V

    .line 71
    invoke-virtual {v1}, Lnet/toddm/comm/RetryProfile;->getRetryAfterMilliseconds()J

    move-result-wide v1

    const-wide/16 v3, 0x32c8

    invoke-static {v3, v4, v1, v2}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertEquals(JJ)V

    .line 73
    new-instance v1, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;

    invoke-direct {v1, p0}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$WorkStub;-><init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;)V

    new-instance v2, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$ResponseStub;

    const-wide/16 v3, 0xe

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/16 v4, 0xca

    invoke-direct {v2, p0, v4, v3}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider$ResponseStub;-><init>(Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;ILjava/lang/Long;)V

    invoke-virtual {v0, v1, v2}, Lnet/toddm/comm/DefaultRetryPolicyProvider;->shouldRetry(Lnet/toddm/comm/Work;Lnet/toddm/comm/Response;)Lnet/toddm/comm/RetryProfile;

    move-result-object v0

    .line 74
    invoke-virtual {v0}, Lnet/toddm/comm/RetryProfile;->shouldRetry()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertTrue(Z)V

    .line 75
    invoke-virtual {v0}, Lnet/toddm/comm/RetryProfile;->getRetryAfterMilliseconds()J

    move-result-wide v0

    const-wide/16 v2, 0x36b0

    invoke-static {v2, v3, v0, v1}, Lnet/toddm/comm/tests/TestDefaultRetryPolicyProvider;->assertEquals(JJ)V

    return-void
.end method
