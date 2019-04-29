.class public Lio/sentry/event/interfaces/HttpInterface;
.super Ljava/lang/Object;
.source "HttpInterface.java"

# interfaces
.implements Lio/sentry/event/interfaces/SentryInterface;


# static fields
.field public static final HTTP_INTERFACE:Ljava/lang/String; = "sentry.interfaces.Http"


# instance fields
.field private final asyncStarted:Z

.field private final authType:Ljava/lang/String;

.field private final body:Ljava/lang/String;

.field private final cookies:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final localAddr:Ljava/lang/String;

.field private final localName:Ljava/lang/String;

.field private final localPort:I

.field private final method:Ljava/lang/String;

.field private final parameters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final protocol:Ljava/lang/String;

.field private final queryString:Ljava/lang/String;

.field private final remoteAddr:Ljava/lang/String;

.field private final remoteUser:Ljava/lang/String;

.field private final requestUrl:Ljava/lang/String;

.field private final secure:Z

.field private final serverName:Ljava/lang/String;

.field private final serverPort:I


# direct methods
.method public constructor <init>(Ljavax/servlet/http/HttpServletRequest;)V
    .locals 1

    .line 43
    new-instance v0, Lio/sentry/event/helper/BasicRemoteAddressResolver;

    invoke-direct {v0}, Lio/sentry/event/helper/BasicRemoteAddressResolver;-><init>()V

    invoke-direct {p0, p1, v0}, Lio/sentry/event/interfaces/HttpInterface;-><init>(Ljavax/servlet/http/HttpServletRequest;Lio/sentry/event/helper/RemoteAddressResolver;)V

    return-void
.end method

.method public constructor <init>(Ljavax/servlet/http/HttpServletRequest;Lio/sentry/event/helper/RemoteAddressResolver;)V
    .locals 1

    const/4 v0, 0x0

    .line 53
    invoke-direct {p0, p1, p2, v0}, Lio/sentry/event/interfaces/HttpInterface;-><init>(Ljavax/servlet/http/HttpServletRequest;Lio/sentry/event/helper/RemoteAddressResolver;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljavax/servlet/http/HttpServletRequest;Lio/sentry/event/helper/RemoteAddressResolver;Ljava/lang/String;)V
    .locals 6

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getRequestURL()Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->requestUrl:Ljava/lang/String;

    .line 65
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getMethod()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->method:Ljava/lang/String;

    .line 66
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->parameters:Ljava/util/Map;

    .line 67
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getParameterMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 68
    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->parameters:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 70
    :cond_0
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getQueryString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->queryString:Ljava/lang/String;

    .line 71
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getCookies()[Ljavax/servlet/http/Cookie;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 72
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->cookies:Ljava/util/Map;

    .line 73
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getCookies()[Ljavax/servlet/http/Cookie;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 74
    iget-object v4, p0, Lio/sentry/event/interfaces/HttpInterface;->cookies:Ljava/util/Map;

    invoke-virtual {v3}, Ljavax/servlet/http/Cookie;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Ljavax/servlet/http/Cookie;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 77
    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->cookies:Ljava/util/Map;

    .line 79
    :cond_2
    invoke-interface {p2, p1}, Lio/sentry/event/helper/RemoteAddressResolver;->getRemoteAddress(Ljavax/servlet/http/HttpServletRequest;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lio/sentry/event/interfaces/HttpInterface;->remoteAddr:Ljava/lang/String;

    .line 80
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getServerName()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lio/sentry/event/interfaces/HttpInterface;->serverName:Ljava/lang/String;

    .line 81
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getServerPort()I

    move-result p2

    iput p2, p0, Lio/sentry/event/interfaces/HttpInterface;->serverPort:I

    .line 82
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getLocalAddr()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lio/sentry/event/interfaces/HttpInterface;->localAddr:Ljava/lang/String;

    .line 83
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getLocalName()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lio/sentry/event/interfaces/HttpInterface;->localName:Ljava/lang/String;

    .line 84
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getLocalPort()I

    move-result p2

    iput p2, p0, Lio/sentry/event/interfaces/HttpInterface;->localPort:I

    .line 85
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getProtocol()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lio/sentry/event/interfaces/HttpInterface;->protocol:Ljava/lang/String;

    .line 86
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->isSecure()Z

    move-result p2

    iput-boolean p2, p0, Lio/sentry/event/interfaces/HttpInterface;->secure:Z

    .line 87
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->isAsyncStarted()Z

    move-result p2

    iput-boolean p2, p0, Lio/sentry/event/interfaces/HttpInterface;->asyncStarted:Z

    .line 88
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getAuthType()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lio/sentry/event/interfaces/HttpInterface;->authType:Ljava/lang/String;

    .line 89
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getRemoteUser()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lio/sentry/event/interfaces/HttpInterface;->remoteUser:Ljava/lang/String;

    .line 90
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lio/sentry/event/interfaces/HttpInterface;->headers:Ljava/util/Map;

    .line 91
    invoke-interface {p1}, Ljavax/servlet/http/HttpServletRequest;->getHeaderNames()Ljava/util/Enumeration;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 92
    iget-object v1, p0, Lio/sentry/event/interfaces/HttpInterface;->headers:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljavax/servlet/http/HttpServletRequest;->getHeaders(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 94
    :cond_3
    iput-object p3, p0, Lio/sentry/event/interfaces/HttpInterface;->body:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_1e

    .line 189
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_a

    .line 193
    :cond_1
    check-cast p1, Lio/sentry/event/interfaces/HttpInterface;

    .line 195
    iget-boolean v2, p0, Lio/sentry/event/interfaces/HttpInterface;->asyncStarted:Z

    iget-boolean v3, p1, Lio/sentry/event/interfaces/HttpInterface;->asyncStarted:Z

    if-eq v2, v3, :cond_2

    return v1

    .line 198
    :cond_2
    iget v2, p0, Lio/sentry/event/interfaces/HttpInterface;->localPort:I

    iget v3, p1, Lio/sentry/event/interfaces/HttpInterface;->localPort:I

    if-eq v2, v3, :cond_3

    return v1

    .line 201
    :cond_3
    iget-boolean v2, p0, Lio/sentry/event/interfaces/HttpInterface;->secure:Z

    iget-boolean v3, p1, Lio/sentry/event/interfaces/HttpInterface;->secure:Z

    if-eq v2, v3, :cond_4

    return v1

    .line 204
    :cond_4
    iget v2, p0, Lio/sentry/event/interfaces/HttpInterface;->serverPort:I

    iget v3, p1, Lio/sentry/event/interfaces/HttpInterface;->serverPort:I

    if-eq v2, v3, :cond_5

    return v1

    .line 207
    :cond_5
    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->authType:Ljava/lang/String;

    if-eqz v2, :cond_6

    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->authType:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/event/interfaces/HttpInterface;->authType:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_0

    :cond_6
    iget-object v2, p1, Lio/sentry/event/interfaces/HttpInterface;->authType:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_0
    return v1

    .line 210
    :cond_7
    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->cookies:Ljava/util/Map;

    iget-object v3, p1, Lio/sentry/event/interfaces/HttpInterface;->cookies:Ljava/util/Map;

    invoke-interface {v2, v3}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    .line 213
    :cond_8
    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->headers:Ljava/util/Map;

    iget-object v3, p1, Lio/sentry/event/interfaces/HttpInterface;->headers:Ljava/util/Map;

    invoke-interface {v2, v3}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    return v1

    .line 216
    :cond_9
    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->localAddr:Ljava/lang/String;

    if-eqz v2, :cond_a

    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->localAddr:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/event/interfaces/HttpInterface;->localAddr:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_1

    :cond_a
    iget-object v2, p1, Lio/sentry/event/interfaces/HttpInterface;->localAddr:Ljava/lang/String;

    if-eqz v2, :cond_b

    :goto_1
    return v1

    .line 219
    :cond_b
    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->localName:Ljava/lang/String;

    if-eqz v2, :cond_c

    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->localName:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/event/interfaces/HttpInterface;->localName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_2

    :cond_c
    iget-object v2, p1, Lio/sentry/event/interfaces/HttpInterface;->localName:Ljava/lang/String;

    if-eqz v2, :cond_d

    :goto_2
    return v1

    .line 222
    :cond_d
    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->method:Ljava/lang/String;

    if-eqz v2, :cond_e

    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->method:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/event/interfaces/HttpInterface;->method:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto :goto_3

    :cond_e
    iget-object v2, p1, Lio/sentry/event/interfaces/HttpInterface;->method:Ljava/lang/String;

    if-eqz v2, :cond_f

    :goto_3
    return v1

    .line 225
    :cond_f
    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->parameters:Ljava/util/Map;

    iget-object v3, p1, Lio/sentry/event/interfaces/HttpInterface;->parameters:Ljava/util/Map;

    invoke-interface {v2, v3}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    return v1

    .line 228
    :cond_10
    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->protocol:Ljava/lang/String;

    if-eqz v2, :cond_11

    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->protocol:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/event/interfaces/HttpInterface;->protocol:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_4

    :cond_11
    iget-object v2, p1, Lio/sentry/event/interfaces/HttpInterface;->protocol:Ljava/lang/String;

    if-eqz v2, :cond_12

    :goto_4
    return v1

    .line 231
    :cond_12
    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->queryString:Ljava/lang/String;

    if-eqz v2, :cond_13

    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->queryString:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/event/interfaces/HttpInterface;->queryString:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    goto :goto_5

    :cond_13
    iget-object v2, p1, Lio/sentry/event/interfaces/HttpInterface;->queryString:Ljava/lang/String;

    if-eqz v2, :cond_14

    :goto_5
    return v1

    .line 234
    :cond_14
    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->remoteAddr:Ljava/lang/String;

    if-eqz v2, :cond_15

    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->remoteAddr:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/event/interfaces/HttpInterface;->remoteAddr:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    goto :goto_6

    :cond_15
    iget-object v2, p1, Lio/sentry/event/interfaces/HttpInterface;->remoteAddr:Ljava/lang/String;

    if-eqz v2, :cond_16

    :goto_6
    return v1

    .line 237
    :cond_16
    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->remoteUser:Ljava/lang/String;

    if-eqz v2, :cond_17

    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->remoteUser:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/event/interfaces/HttpInterface;->remoteUser:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    goto :goto_7

    :cond_17
    iget-object v2, p1, Lio/sentry/event/interfaces/HttpInterface;->remoteUser:Ljava/lang/String;

    if-eqz v2, :cond_18

    :goto_7
    return v1

    .line 240
    :cond_18
    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->requestUrl:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/event/interfaces/HttpInterface;->requestUrl:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    return v1

    .line 243
    :cond_19
    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->serverName:Ljava/lang/String;

    if-eqz v2, :cond_1a

    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->serverName:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/event/interfaces/HttpInterface;->serverName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    goto :goto_8

    :cond_1a
    iget-object v2, p1, Lio/sentry/event/interfaces/HttpInterface;->serverName:Ljava/lang/String;

    if-eqz v2, :cond_1b

    :goto_8
    return v1

    .line 246
    :cond_1b
    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->body:Ljava/lang/String;

    if-eqz v2, :cond_1c

    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->body:Ljava/lang/String;

    iget-object p1, p1, Lio/sentry/event/interfaces/HttpInterface;->body:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1d

    goto :goto_9

    :cond_1c
    iget-object p1, p1, Lio/sentry/event/interfaces/HttpInterface;->body:Ljava/lang/String;

    if-eqz p1, :cond_1d

    :goto_9
    return v1

    :cond_1d
    return v0

    :cond_1e
    :goto_a
    return v1
.end method

.method public getAuthType()Ljava/lang/String;
    .locals 1

    .line 159
    iget-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->authType:Ljava/lang/String;

    return-object v0
.end method

.method public getBody()Ljava/lang/String;
    .locals 1

    .line 167
    iget-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->body:Ljava/lang/String;

    return-object v0
.end method

.method public getCookies()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 119
    iget-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->cookies:Ljava/util/Map;

    return-object v0
.end method

.method public getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 171
    iget-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->headers:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getInterfaceName()Ljava/lang/String;
    .locals 1

    const-string v0, "sentry.interfaces.Http"

    return-object v0
.end method

.method public getLocalAddr()Ljava/lang/String;
    .locals 1

    .line 135
    iget-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->localAddr:Ljava/lang/String;

    return-object v0
.end method

.method public getLocalName()Ljava/lang/String;
    .locals 1

    .line 139
    iget-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->localName:Ljava/lang/String;

    return-object v0
.end method

.method public getLocalPort()I
    .locals 1

    .line 143
    iget v0, p0, Lio/sentry/event/interfaces/HttpInterface;->localPort:I

    return v0
.end method

.method public getMethod()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->method:Ljava/lang/String;

    return-object v0
.end method

.method public getParameters()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 111
    iget-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->parameters:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getProtocol()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->protocol:Ljava/lang/String;

    return-object v0
.end method

.method public getQueryString()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->queryString:Ljava/lang/String;

    return-object v0
.end method

.method public getRemoteAddr()Ljava/lang/String;
    .locals 1

    .line 123
    iget-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->remoteAddr:Ljava/lang/String;

    return-object v0
.end method

.method public getRemoteUser()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->remoteUser:Ljava/lang/String;

    return-object v0
.end method

.method public getRequestUrl()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->requestUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getServerName()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->serverName:Ljava/lang/String;

    return-object v0
.end method

.method public getServerPort()I
    .locals 1

    .line 131
    iget v0, p0, Lio/sentry/event/interfaces/HttpInterface;->serverPort:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 255
    iget-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->requestUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    .line 256
    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->method:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->method:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v1, v0

    .line 257
    iget-object v0, p0, Lio/sentry/event/interfaces/HttpInterface;->parameters:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public isAsyncStarted()Z
    .locals 1

    .line 155
    iget-boolean v0, p0, Lio/sentry/event/interfaces/HttpInterface;->asyncStarted:Z

    return v0
.end method

.method public isSecure()Z
    .locals 1

    .line 151
    iget-boolean v0, p0, Lio/sentry/event/interfaces/HttpInterface;->secure:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HttpInterface{requestUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/event/interfaces/HttpInterface;->requestUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", method=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->method:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", queryString=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/sentry/event/interfaces/HttpInterface;->queryString:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", parameters="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/event/interfaces/HttpInterface;->parameters:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
