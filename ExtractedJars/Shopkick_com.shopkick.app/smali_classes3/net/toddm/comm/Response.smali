.class public Lnet/toddm/comm/Response;
.super Ljava/lang/Object;
.source "Response.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x5d49b69c9508a894L


# instance fields
.field private _headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private _instanceCreationTime:J

.field private _isFromCache:Z

.field private final _logger:Lnet/toddm/cache/LoggingProvider;

.field private _requestId:I

.field private _responseBytes:[B

.field private _responseCode:I

.field private _responseTime:I


# direct methods
.method protected constructor <init>([BLjava/util/Map;IIILnet/toddm/cache/LoggingProvider;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;III",
            "Lnet/toddm/cache/LoggingProvider;",
            ")V"
        }
    .end annotation

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 47
    iput v0, p0, Lnet/toddm/comm/Response;->_responseTime:I

    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lnet/toddm/comm/Response;->_instanceCreationTime:J

    .line 56
    iput-object p1, p0, Lnet/toddm/comm/Response;->_responseBytes:[B

    if-eqz p2, :cond_0

    .line 60
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object p1, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    goto :goto_0

    .line 62
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    .line 64
    :goto_0
    iput p3, p0, Lnet/toddm/comm/Response;->_responseCode:I

    .line 65
    iput p4, p0, Lnet/toddm/comm/Response;->_requestId:I

    .line 66
    iput p5, p0, Lnet/toddm/comm/Response;->_responseTime:I

    .line 67
    iput-object p6, p0, Lnet/toddm/comm/Response;->_logger:Lnet/toddm/cache/LoggingProvider;

    const/4 p1, 0x0

    .line 70
    iput-boolean p1, p0, Lnet/toddm/comm/Response;->_isFromCache:Z

    return-void
.end method

.method public static getContentEncoding(Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "Content-Encoding"

    .line 141
    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Content-Encoding"

    .line 142
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private parseCacheControlHeader()Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 284
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 288
    iget-object v1, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    if-eqz v1, :cond_6

    const-string v2, "Cache-Control"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    const-string v2, "Cache-Control"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    const-string v2, "Cache-Control"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_6

    .line 289
    iget-object v1, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    const-string v2, "Cache-Control"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_3

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 290
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    const-string v3, ","

    .line 291
    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    move v5, v4

    :goto_1
    if-lt v5, v3, :cond_2

    goto :goto_0

    :cond_2
    aget-object v6, v2, v5

    if-nez v6, :cond_3

    goto :goto_2

    .line 293
    :cond_3
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    const-string v7, "="

    .line 296
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_4

    const/4 v7, 0x0

    .line 297
    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    const-string v7, "="

    .line 301
    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 302
    array-length v7, v6

    const/4 v8, 0x1

    if-le v7, v8, :cond_5

    aget-object v7, v6, v4

    if-eqz v7, :cond_5

    aget-object v7, v6, v8

    if-eqz v7, :cond_5

    .line 303
    aget-object v7, v6, v4

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    aget-object v6, v6, v8

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_6
    :goto_3
    return-object v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 334
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lnet/toddm/comm/Response;->_responseCode:I

    .line 335
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lnet/toddm/comm/Response;->_requestId:I

    .line 336
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lnet/toddm/comm/Response;->_responseTime:I

    .line 337
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    .line 340
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x400

    .line 341
    new-array v1, v1, [B

    .line 343
    :goto_0
    invoke-virtual {p1, v1}, Ljava/io/ObjectInputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    const/4 p1, 0x0

    .line 346
    iput-object p1, p0, Lnet/toddm/comm/Response;->_responseBytes:[B

    .line 347
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    if-lez p1, :cond_0

    .line 348
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    iput-object p1, p0, Lnet/toddm/comm/Response;->_responseBytes:[B

    .line 351
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lnet/toddm/comm/Response;->_instanceCreationTime:J

    const/4 p1, 0x1

    .line 354
    iput-boolean p1, p0, Lnet/toddm/comm/Response;->_isFromCache:Z

    return-void

    :cond_1
    const/4 v3, 0x0

    .line 344
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 319
    iget v0, p0, Lnet/toddm/comm/Response;->_responseCode:I

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 320
    iget v0, p0, Lnet/toddm/comm/Response;->_requestId:I

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 321
    iget v0, p0, Lnet/toddm/comm/Response;->_responseTime:I

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 322
    iget-object v0, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 325
    iget-object v0, p0, Lnet/toddm/comm/Response;->_responseBytes:[B

    if-eqz v0, :cond_0

    .line 326
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->write([B)V

    :cond_0
    return-void
.end method


# virtual methods
.method public getETagFromHeaders()Ljava/lang/String;
    .locals 2

    .line 272
    iget-object v0, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    if-eqz v0, :cond_0

    const-string v1, "ETag"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    const-string v1, "ETag"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    const-string v1, "ETag"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 273
    iget-object v0, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    const-string v1, "ETag"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 130
    iget-object v0, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    return-object v0
.end method

.method protected getInstanceCreationTime()J
    .locals 2

    .line 133
    iget-wide v0, p0, Lnet/toddm/comm/Response;->_instanceCreationTime:J

    return-wide v0
.end method

.method public getLocationFromHeaders(Lnet/toddm/comm/Request;)Ljava/net/URI;
    .locals 12

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 159
    :try_start_0
    iget-object v2, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    const-string v3, "Location"

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    const-string v3, "Location"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    const-string v3, "Location"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 160
    iget-object v2, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    const-string v3, "Location"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 161
    new-instance v3, Ljava/net/URI;

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 164
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    new-instance v0, Ljava/net/URI;

    .line 166
    invoke-virtual {p1}, Lnet/toddm/comm/Request;->getUri()Ljava/net/URI;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v5

    .line 167
    invoke-virtual {v3}, Ljava/net/URI;->getUserInfo()Ljava/lang/String;

    move-result-object v6

    .line 168
    invoke-virtual {p1}, Lnet/toddm/comm/Request;->getUri()Ljava/net/URI;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v7

    .line 169
    invoke-virtual {v3}, Ljava/net/URI;->getPort()I

    move-result v8

    .line 170
    invoke-virtual {v3}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v9

    .line 171
    invoke-virtual {p1}, Lnet/toddm/comm/Request;->getUri()Ljava/net/URI;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/URI;->getQuery()Ljava/lang/String;

    move-result-object v10

    .line 172
    invoke-virtual {v3}, Ljava/net/URI;->getFragment()Ljava/lang/String;

    move-result-object v11

    move-object v4, v0

    .line 165
    invoke-direct/range {v4 .. v11}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_0
    move-object v0, v3

    goto :goto_1

    :catch_0
    move-exception p1

    move-object v0, v3

    goto :goto_0

    :catch_1
    move-exception p1

    .line 177
    :goto_0
    iget-object v2, p0, Lnet/toddm/comm/Response;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v2, :cond_1

    const-string v3, "Failed to parse value from \'Location\' header"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v2, p1, v3, v1}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_1
    return-object v0

    .line 155
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'request\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getMaxStaleFromHeaders()Ljava/lang/Long;
    .locals 4

    .line 255
    invoke-direct {p0}, Lnet/toddm/comm/Response;->parseCacheControlHeader()Ljava/util/Map;

    move-result-object v0

    const-string v1, "no-cache"

    .line 256
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "max-stale"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    const-string v1, "max-stale"

    .line 258
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 259
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    .line 260
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 262
    iget-object v1, p0, Lnet/toddm/comm/Response;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v1, :cond_0

    const-string v2, "getMaxStaleFromHeaders() failed"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v1, v0, v2, v3}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getRequestId()Ljava/lang/Integer;
    .locals 1

    .line 126
    iget v0, p0, Lnet/toddm/comm/Response;->_requestId:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getResponseBody()Ljava/lang/String;
    .locals 3

    .line 87
    :try_start_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lnet/toddm/comm/Response;->_responseBytes:[B

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 89
    :catch_0
    iget-object v0, p0, Lnet/toddm/comm/Response;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v0, :cond_0

    const-string v1, "Response encoding as string failed"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getResponseBytes()[B
    .locals 1

    .line 77
    iget-object v0, p0, Lnet/toddm/comm/Response;->_responseBytes:[B

    return-object v0
.end method

.method public getResponseCode()Ljava/lang/Integer;
    .locals 1

    .line 98
    iget v0, p0, Lnet/toddm/comm/Response;->_responseCode:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getResponseTimeMilliseconds()I
    .locals 1

    .line 105
    iget v0, p0, Lnet/toddm/comm/Response;->_responseTime:I

    return v0
.end method

.method public getRetryAfter()Ljava/lang/Long;
    .locals 6

    .line 191
    iget-object v0, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    if-eqz v0, :cond_0

    const-string v1, "Retry-After"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    const-string v1, "Retry-After"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, ""

    const/4 v1, 0x0

    .line 196
    :try_start_0
    iget-object v2, p0, Lnet/toddm/comm/Response;->_headers:Ljava/util/Map;

    const-string v3, "Retry-After"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 197
    :try_start_1
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v2

    .line 204
    :catch_1
    :try_start_2
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "EEE, dd MMM yyyy HH:mm:ss z"

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 205
    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 206
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    :catch_2
    move-exception v0

    .line 209
    iget-object v2, p0, Lnet/toddm/comm/Response;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v2, :cond_0

    const-string v3, "Failed to parse value from \'Retry-After\' header"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v2, v0, v3, v1}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getTtlFromHeaders()Ljava/lang/Long;
    .locals 4

    .line 233
    invoke-direct {p0}, Lnet/toddm/comm/Response;->parseCacheControlHeader()Ljava/util/Map;

    move-result-object v0

    const-string v1, "no-cache"

    .line 234
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "max-age"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    const-string v1, "max-age"

    .line 236
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 237
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    .line 238
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 240
    iget-object v1, p0, Lnet/toddm/comm/Response;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v1, :cond_0

    const-string v2, "getTtlFromResponse() failed"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v1, v0, v2, v3}, Lnet/toddm/cache/LoggingProvider;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public isFromCache()Z
    .locals 1

    .line 113
    iget-boolean v0, p0, Lnet/toddm/comm/Response;->_isFromCache:Z

    return v0
.end method

.method public isSuccessful()Z
    .locals 2

    .line 121
    iget v0, p0, Lnet/toddm/comm/Response;->_responseCode:I

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_0

    const/16 v1, 0xc9

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public shouldNotCacheDueToNoCacheDirective()Z
    .locals 2

    .line 221
    invoke-direct {p0}, Lnet/toddm/comm/Response;->parseCacheControlHeader()Ljava/util/Map;

    move-result-object v0

    const-string v1, "no-cache"

    .line 222
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
