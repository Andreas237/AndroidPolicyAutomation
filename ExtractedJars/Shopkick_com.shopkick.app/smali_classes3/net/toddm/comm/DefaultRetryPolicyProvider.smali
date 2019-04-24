.class public Lnet/toddm/comm/DefaultRetryPolicyProvider;
.super Ljava/lang/Object;
.source "DefaultRetryPolicyProvider.java"

# interfaces
.implements Lnet/toddm/comm/RetryPolicyProvider;


# static fields
.field private static final _MaxErrorRetries:I = 0x5

.field private static final _MaxResponseRetries:I = 0x5


# instance fields
.field private final _logger:Lnet/toddm/cache/LoggingProvider;


# direct methods
.method public constructor <init>(Lnet/toddm/cache/LoggingProvider;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lnet/toddm/comm/DefaultRetryPolicyProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    return-void
.end method


# virtual methods
.method public shouldRetry(Lnet/toddm/comm/Work;Ljava/lang/Exception;)Lnet/toddm/comm/RetryProfile;
    .locals 5

    if-eqz p1, :cond_4

    if-eqz p2, :cond_3

    .line 76
    invoke-interface {p1}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/Request;->isIdempotent()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 79
    invoke-interface {p1}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/Request;->getRetryCountFromFailure()I

    move-result v0

    const/4 v3, 0x5

    if-ge v0, v3, :cond_1

    .line 80
    instance-of v0, p2, Ljava/net/ConnectException;

    if-nez v0, :cond_0

    .line 81
    instance-of v0, p2, Ljava/net/SocketException;

    if-nez v0, :cond_0

    .line 82
    instance-of v0, p2, Ljava/net/SocketTimeoutException;

    if-nez v0, :cond_0

    .line 83
    instance-of v0, p2, Ljava/net/UnknownHostException;

    if-nez v0, :cond_0

    .line 84
    instance-of v0, p2, Ljava/net/BindException;

    if-nez v0, :cond_0

    .line 85
    instance-of v0, p2, Ljava/net/NoRouteToHostException;

    if-nez v0, :cond_0

    .line 86
    instance-of v0, p2, Ljava/net/PortUnreachableException;

    if-nez v0, :cond_0

    .line 87
    instance-of v0, p2, Ljava/net/UnknownServiceException;

    if-nez v0, :cond_0

    .line 88
    instance-of v0, p2, Ljava/net/HttpRetryException;

    if-nez v0, :cond_0

    .line 89
    instance-of v0, p2, Ljava/net/ProtocolException;

    if-nez v0, :cond_0

    .line 90
    instance-of v0, p2, Ljavax/net/ssl/SSLProtocolException;

    if-nez v0, :cond_0

    .line 91
    instance-of v0, p2, Ljavax/net/ssl/SSLKeyException;

    if-nez v0, :cond_0

    .line 92
    instance-of v0, p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-nez v0, :cond_0

    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v3, Ljavax/net/ssl/SSLException;

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    instance-of v0, p2, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/security/cert/CertificateException;

    if-nez v0, :cond_1

    .line 100
    :cond_0
    iget-object v0, p0, Lnet/toddm/comm/DefaultRetryPolicyProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v0, :cond_2

    const-string v3, "Recommending request %1$d be retried in 3 seconds due to %2$s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {p1}, Lnet/toddm/comm/Work;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v1

    invoke-interface {v0, v3, v4}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    move v1, v2

    .line 105
    :cond_2
    :goto_0
    new-instance p1, Lnet/toddm/comm/RetryProfile;

    const-wide/16 v2, 0xbb8

    invoke-direct {p1, v1, v2, v3}, Lnet/toddm/comm/RetryProfile;-><init>(ZJ)V

    return-object p1

    .line 72
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'error\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 71
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'work\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public shouldRetry(Lnet/toddm/comm/Work;Lnet/toddm/comm/Response;)Lnet/toddm/comm/RetryProfile;
    .locals 8

    if-eqz p1, :cond_5

    if-eqz p2, :cond_4

    const-wide/16 v0, 0x5

    .line 122
    invoke-interface {p1}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v2

    invoke-virtual {v2}, Lnet/toddm/comm/Request;->getRetryCountFromResponse()I

    move-result v2

    const/4 v3, 0x5

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ge v2, v3, :cond_2

    .line 123
    invoke-virtual {p2}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x1f7

    if-eq v2, v3, :cond_0

    .line 124
    invoke-virtual {p2}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0xca

    if-ne v2, v3, :cond_2

    .line 129
    :cond_0
    invoke-virtual {p2}, Lnet/toddm/comm/Response;->getHeaders()Ljava/util/Map;

    move-result-object v2

    const-string v3, "Retry-After"

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 131
    :try_start_0
    invoke-virtual {p2}, Lnet/toddm/comm/Response;->getHeaders()Ljava/util/Map;

    move-result-object v2

    const-string v3, "Retry-After"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 132
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 134
    iget-object v3, p0, Lnet/toddm/comm/DefaultRetryPolicyProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v3, :cond_1

    const-string v6, "Failed to parse value from \'Retry-After\' header"

    new-array v7, v5, [Ljava/lang/Object;

    invoke-interface {v3, v2, v6, v7}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    :cond_1
    :goto_0
    iget-object v2, p0, Lnet/toddm/comm/DefaultRetryPolicyProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v2, :cond_3

    const-string v3, "Recommending request %1$d be retried in %2$d seconds due to %3$d"

    const/4 v6, 0x3

    .line 138
    new-array v6, v6, [Ljava/lang/Object;

    invoke-interface {p1}, Lnet/toddm/comm/Work;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v6, v5

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v6, v4

    const/4 p1, 0x2

    invoke-virtual {p2}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v6, p1

    invoke-interface {v2, v3, v6}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    move v4, v5

    .line 143
    :cond_3
    :goto_1
    new-instance p1, Lnet/toddm/comm/RetryProfile;

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-direct {p1, v4, v0, v1}, Lnet/toddm/comm/RetryProfile;-><init>(ZJ)V

    return-object p1

    .line 117
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'response\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 116
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'request\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
