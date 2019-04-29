.class public Lio/sentry/dsn/Dsn;
.super Ljava/lang/Object;
.source "Dsn.java"


# static fields
.field public static final DEFAULT_DSN:Ljava/lang/String; = "noop://localhost?async=false"

.field private static final logger:Lorg/slf4j/Logger;


# instance fields
.field private host:Ljava/lang/String;

.field private options:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private path:Ljava/lang/String;

.field private port:I

.field private projectId:Ljava/lang/String;

.field private protocol:Ljava/lang/String;

.field private protocolSettings:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private publicKey:Ljava/lang/String;

.field private secretKey:Ljava/lang/String;

.field private uri:Ljava/net/URI;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const-class v0, Lio/sentry/dsn/Dsn;

    invoke-static {v0}, Lorg/slf4j/LoggerFactory;->getLogger(Ljava/lang/Class;)Lorg/slf4j/Logger;

    move-result-object v0

    sput-object v0, Lio/sentry/dsn/Dsn;->logger:Lorg/slf4j/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/sentry/dsn/InvalidDsnException;
        }
    .end annotation

    .line 41
    invoke-static {p1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/sentry/dsn/Dsn;-><init>(Ljava/net/URI;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/URI;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/sentry/dsn/InvalidDsnException;
        }
    .end annotation

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 52
    new-instance p1, Lio/sentry/dsn/InvalidDsnException;

    const-string v0, "DSN constructed with null value!"

    invoke-direct {p1, v0}, Lio/sentry/dsn/InvalidDsnException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 55
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/dsn/Dsn;->options:Ljava/util/Map;

    .line 56
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lio/sentry/dsn/Dsn;->protocolSettings:Ljava/util/Set;

    .line 58
    invoke-direct {p0, p1}, Lio/sentry/dsn/Dsn;->extractProtocolInfo(Ljava/net/URI;)V

    .line 59
    invoke-direct {p0, p1}, Lio/sentry/dsn/Dsn;->extractUserKeys(Ljava/net/URI;)V

    .line 60
    invoke-direct {p0, p1}, Lio/sentry/dsn/Dsn;->extractHostInfo(Ljava/net/URI;)V

    .line 61
    invoke-direct {p0, p1}, Lio/sentry/dsn/Dsn;->extractPathInfo(Ljava/net/URI;)V

    .line 62
    invoke-direct {p0, p1}, Lio/sentry/dsn/Dsn;->extractOptions(Ljava/net/URI;)V

    .line 64
    invoke-direct {p0}, Lio/sentry/dsn/Dsn;->makeOptionsImmutable()V

    .line 66
    invoke-direct {p0}, Lio/sentry/dsn/Dsn;->validate()V

    .line 69
    :try_start_0
    new-instance v0, Ljava/net/URI;

    iget-object v2, p0, Lio/sentry/dsn/Dsn;->protocol:Ljava/lang/String;

    const/4 v3, 0x0

    iget-object v4, p0, Lio/sentry/dsn/Dsn;->host:Ljava/lang/String;

    iget v5, p0, Lio/sentry/dsn/Dsn;->port:I

    iget-object v6, p0, Lio/sentry/dsn/Dsn;->path:Ljava/lang/String;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lio/sentry/dsn/Dsn;->uri:Ljava/net/URI;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 71
    new-instance v1, Lio/sentry/dsn/InvalidDsnException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Impossible to determine Sentry\'s URI from the DSN \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lio/sentry/dsn/InvalidDsnException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static dsnLookup()Ljava/lang/String;
    .locals 2

    const-string v0, "dsn"

    .line 81
    invoke-static {v0}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 83
    invoke-static {v0}, Lio/sentry/util/Util;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "dns"

    .line 85
    invoke-static {v0}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 88
    :cond_0
    invoke-static {v0}, Lio/sentry/util/Util;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 89
    sget-object v0, Lio/sentry/dsn/Dsn;->logger:Lorg/slf4j/Logger;

    const-string v1, "*** Couldn\'t find a suitable DSN, Sentry operations will do nothing! See documentation: https://docs.sentry.io/clients/java/ ***"

    invoke-interface {v0, v1}, Lorg/slf4j/Logger;->warn(Ljava/lang/String;)V

    const-string v0, "noop://localhost?async=false"

    :cond_1
    return-object v0
.end method

.method private extractHostInfo(Ljava/net/URI;)V
    .locals 1

    .line 118
    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/dsn/Dsn;->host:Ljava/lang/String;

    .line 119
    invoke-virtual {p1}, Ljava/net/URI;->getPort()I

    move-result p1

    iput p1, p0, Lio/sentry/dsn/Dsn;->port:I

    return-void
.end method

.method private extractOptions(Ljava/net/URI;)V
    .locals 8

    .line 160
    invoke-virtual {p1}, Ljava/net/URI;->getQuery()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 161
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const-string v0, "&"

    .line 164
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    array-length v1, p1

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p1, v2

    :try_start_0
    const-string v4, "="

    .line 166
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 167
    aget-object v5, v4, v0

    const-string v6, "UTF-8"

    invoke-static {v5, v6}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 168
    array-length v6, v4

    const/4 v7, 0x1

    if-le v6, v7, :cond_1

    aget-object v4, v4, v7

    const-string v6, "UTF-8"

    invoke-static {v4, v6}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    .line 169
    :goto_1
    iget-object v6, p0, Lio/sentry/dsn/Dsn;->options:Ljava/util/Map;

    invoke-interface {v6, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 171
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Impossible to decode the query parameter \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    return-void

    :cond_3
    :goto_2
    return-void
.end method

.method private extractPathInfo(Ljava/net/URI;)V
    .locals 2

    .line 103
    invoke-virtual {p1}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "/"

    .line 107
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    .line 108
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lio/sentry/dsn/Dsn;->path:Ljava/lang/String;

    .line 109
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/dsn/Dsn;->projectId:Ljava/lang/String;

    return-void
.end method

.method private extractProtocolInfo(Ljava/net/URI;)V
    .locals 4

    .line 128
    invoke-virtual {p1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "\\+"

    .line 132
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 133
    iget-object v0, p0, Lio/sentry/dsn/Dsn;->protocolSettings:Ljava/util/Set;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, p1

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v1, v2, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 134
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    aget-object p1, p1, v0

    iput-object p1, p0, Lio/sentry/dsn/Dsn;->protocol:Ljava/lang/String;

    return-void
.end method

.method private extractUserKeys(Ljava/net/URI;)V
    .locals 2

    .line 143
    invoke-virtual {p1}, Ljava/net/URI;->getUserInfo()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, ":"

    .line 147
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 148
    aget-object v0, p1, v0

    iput-object v0, p0, Lio/sentry/dsn/Dsn;->publicKey:Ljava/lang/String;

    const/4 v0, 0x1

    .line 149
    array-length v1, p1

    if-le v1, v0, :cond_1

    .line 150
    aget-object p1, p1, v0

    iput-object p1, p0, Lio/sentry/dsn/Dsn;->secretKey:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method private makeOptionsImmutable()V
    .locals 1

    .line 181
    iget-object v0, p0, Lio/sentry/dsn/Dsn;->options:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/dsn/Dsn;->options:Ljava/util/Map;

    .line 182
    iget-object v0, p0, Lio/sentry/dsn/Dsn;->protocolSettings:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/dsn/Dsn;->protocolSettings:Ljava/util/Set;

    return-void
.end method

.method private validate()V
    .locals 4

    .line 191
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 192
    iget-object v1, p0, Lio/sentry/dsn/Dsn;->host:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "host"

    .line 193
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 196
    :cond_0
    iget-object v1, p0, Lio/sentry/dsn/Dsn;->protocol:Ljava/lang/String;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lio/sentry/dsn/Dsn;->protocol:Ljava/lang/String;

    const-string v2, "noop"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lio/sentry/dsn/Dsn;->protocol:Ljava/lang/String;

    const-string v2, "out"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 200
    iget-object v1, p0, Lio/sentry/dsn/Dsn;->publicKey:Ljava/lang/String;

    if-nez v1, :cond_1

    const-string v1, "public key"

    .line 201
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 203
    :cond_1
    iget-object v1, p0, Lio/sentry/dsn/Dsn;->projectId:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/sentry/dsn/Dsn;->projectId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    const-string v1, "project ID"

    .line 204
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 208
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    .line 209
    new-instance v1, Lio/sentry/dsn/InvalidDsnException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid DSN, the following properties aren\'t set \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lio/sentry/dsn/InvalidDsnException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
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

    if-eqz p1, :cond_c

    .line 263
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 267
    :cond_1
    check-cast p1, Lio/sentry/dsn/Dsn;

    .line 269
    iget v2, p0, Lio/sentry/dsn/Dsn;->port:I

    iget v3, p1, Lio/sentry/dsn/Dsn;->port:I

    if-eq v2, v3, :cond_2

    return v1

    .line 272
    :cond_2
    iget-object v2, p0, Lio/sentry/dsn/Dsn;->host:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/dsn/Dsn;->host:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    .line 275
    :cond_3
    iget-object v2, p0, Lio/sentry/dsn/Dsn;->options:Ljava/util/Map;

    iget-object v3, p1, Lio/sentry/dsn/Dsn;->options:Ljava/util/Map;

    invoke-interface {v2, v3}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    .line 278
    :cond_4
    iget-object v2, p0, Lio/sentry/dsn/Dsn;->path:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/dsn/Dsn;->path:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    .line 281
    :cond_5
    iget-object v2, p0, Lio/sentry/dsn/Dsn;->projectId:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/dsn/Dsn;->projectId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    .line 284
    :cond_6
    iget-object v2, p0, Lio/sentry/dsn/Dsn;->protocol:Ljava/lang/String;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lio/sentry/dsn/Dsn;->protocol:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/dsn/Dsn;->protocol:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_0

    :cond_7
    iget-object v2, p1, Lio/sentry/dsn/Dsn;->protocol:Ljava/lang/String;

    if-eqz v2, :cond_8

    :goto_0
    return v1

    .line 287
    :cond_8
    iget-object v2, p0, Lio/sentry/dsn/Dsn;->protocolSettings:Ljava/util/Set;

    iget-object v3, p1, Lio/sentry/dsn/Dsn;->protocolSettings:Ljava/util/Set;

    invoke-interface {v2, v3}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    return v1

    .line 290
    :cond_9
    iget-object v2, p0, Lio/sentry/dsn/Dsn;->publicKey:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/dsn/Dsn;->publicKey:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    return v1

    .line 293
    :cond_a
    iget-object v2, p0, Lio/sentry/dsn/Dsn;->secretKey:Ljava/lang/String;

    iget-object p1, p1, Lio/sentry/dsn/Dsn;->secretKey:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v1

    :cond_b
    return v0

    :cond_c
    :goto_1
    return v1
.end method

.method public getHost()Ljava/lang/String;
    .locals 1

    .line 230
    iget-object v0, p0, Lio/sentry/dsn/Dsn;->host:Ljava/lang/String;

    return-object v0
.end method

.method public getOptions()Ljava/util/Map;
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

    .line 246
    iget-object v0, p0, Lio/sentry/dsn/Dsn;->options:Ljava/util/Map;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    .line 238
    iget-object v0, p0, Lio/sentry/dsn/Dsn;->path:Ljava/lang/String;

    return-object v0
.end method

.method public getPort()I
    .locals 1

    .line 234
    iget v0, p0, Lio/sentry/dsn/Dsn;->port:I

    return v0
.end method

.method public getProjectId()Ljava/lang/String;
    .locals 1

    .line 222
    iget-object v0, p0, Lio/sentry/dsn/Dsn;->projectId:Ljava/lang/String;

    return-object v0
.end method

.method public getProtocol()Ljava/lang/String;
    .locals 1

    .line 226
    iget-object v0, p0, Lio/sentry/dsn/Dsn;->protocol:Ljava/lang/String;

    return-object v0
.end method

.method public getProtocolSettings()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 242
    iget-object v0, p0, Lio/sentry/dsn/Dsn;->protocolSettings:Ljava/util/Set;

    return-object v0
.end method

.method public getPublicKey()Ljava/lang/String;
    .locals 1

    .line 218
    iget-object v0, p0, Lio/sentry/dsn/Dsn;->publicKey:Ljava/lang/String;

    return-object v0
.end method

.method public getSecretKey()Ljava/lang/String;
    .locals 1

    .line 214
    iget-object v0, p0, Lio/sentry/dsn/Dsn;->secretKey:Ljava/lang/String;

    return-object v0
.end method

.method public getUri()Ljava/net/URI;
    .locals 1

    .line 255
    iget-object v0, p0, Lio/sentry/dsn/Dsn;->uri:Ljava/net/URI;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 302
    iget-object v0, p0, Lio/sentry/dsn/Dsn;->publicKey:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    .line 303
    iget-object v2, p0, Lio/sentry/dsn/Dsn;->projectId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 304
    iget-object v2, p0, Lio/sentry/dsn/Dsn;->host:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 305
    iget v2, p0, Lio/sentry/dsn/Dsn;->port:I

    add-int/2addr v0, v2

    mul-int/2addr v1, v0

    .line 306
    iget-object v0, p0, Lio/sentry/dsn/Dsn;->path:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 312
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Dsn{uri="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/dsn/Dsn;->uri:Ljava/net/URI;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
