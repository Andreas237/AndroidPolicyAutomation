.class public Lnet/toddm/comm/Request;
.super Ljava/lang/Object;
.source "Request.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/toddm/comm/Request$RequestMethod;
    }
.end annotation


# instance fields
.field private final _headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final _id:Ljava/lang/Integer;

.field private final _isIdempotent:Z

.field private final _method:Lnet/toddm/comm/Request$RequestMethod;

.field private final _normalizedEndPoints:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/net/URI;",
            ">;"
        }
    .end annotation
.end field

.field private final _postData:[B

.field private final _queryParameters:Ljava/util/Map;
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

.field private _redirectCount:I

.field private _retryCountFromFailure:I

.field private _retryCountFromResponse:I


# direct methods
.method protected constructor <init>(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URI;",
            "Lnet/toddm/comm/Request$RequestMethod;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lnet/toddm/comm/Request;->_normalizedEndPoints:Ljava/util/LinkedList;

    const/4 v0, 0x0

    .line 57
    iput v0, p0, Lnet/toddm/comm/Request;->_redirectCount:I

    .line 58
    iput v0, p0, Lnet/toddm/comm/Request;->_retryCountFromFailure:I

    .line 59
    iput v0, p0, Lnet/toddm/comm/Request;->_retryCountFromResponse:I

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    if-eqz p3, :cond_1

    .line 81
    array-length v0, p3

    if-lez v0, :cond_1

    sget-object v0, Lnet/toddm/comm/Request$RequestMethod;->POST:Lnet/toddm/comm/Request$RequestMethod;

    invoke-virtual {v0, p2}, Lnet/toddm/comm/Request$RequestMethod;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 82
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'method\' must be \'POST\' when \'postData\' is provided"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 86
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ljava/net/URI;->normalize()Ljava/net/URI;

    move-result-object p1

    .line 87
    iput-object p2, p0, Lnet/toddm/comm/Request;->_method:Lnet/toddm/comm/Request$RequestMethod;

    .line 88
    iget-object p2, p0, Lnet/toddm/comm/Request;->_normalizedEndPoints:Ljava/util/LinkedList;

    invoke-virtual {p2, p1}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    const-string p2, "UTF-8"

    .line 91
    invoke-static {p1, p2}, Lnet/toddm/comm/Request;->parseQueryParameters(Ljava/net/URI;Ljava/lang/String;)Ljava/util/TreeMap;

    move-result-object p1

    iput-object p1, p0, Lnet/toddm/comm/Request;->_queryParameters:Ljava/util/Map;

    .line 92
    iput-object p3, p0, Lnet/toddm/comm/Request;->_postData:[B

    .line 93
    iput-object p4, p0, Lnet/toddm/comm/Request;->_headers:Ljava/util/Map;

    .line 94
    iput-boolean p5, p0, Lnet/toddm/comm/Request;->_isIdempotent:Z

    .line 97
    invoke-direct {p0}, Lnet/toddm/comm/Request;->calculateId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lnet/toddm/comm/Request;->_id:Ljava/lang/Integer;

    return-void

    .line 80
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'method\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 79
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'uri\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private calculateId()I
    .locals 5

    .line 205
    iget-object v0, p0, Lnet/toddm/comm/Request;->_normalizedEndPoints:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/URI;

    .line 206
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 207
    invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    invoke-virtual {v0}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    iget-object v2, p0, Lnet/toddm/comm/Request;->_queryParameters:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_3

    .line 220
    invoke-virtual {v0}, Ljava/net/URI;->getFragment()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    iget-object v2, p0, Lnet/toddm/comm/Request;->_postData:[B

    if-eqz v2, :cond_0

    array-length v3, v2

    if-lez v3, :cond_0

    .line 224
    invoke-static {v2}, Lnet/toddm/comm/Base64;->encode([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 231
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-gtz v2, :cond_1

    goto :goto_1

    .line 234
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-virtual {v0}, Ljava/net/URI;->getPort()I

    move-result v0

    add-int/2addr v1, v0

    return v1

    .line 232
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/net/URI;->getPort()I

    move-result v0

    return v0

    .line 212
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 213
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    iget-object v4, p0, Lnet/toddm/comm/Request;->_queryParameters:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_0

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 215
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2
.end method

.method private static parseQueryParameters(Ljava/net/URI;Ljava/lang/String;)Ljava/util/TreeMap;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URI;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/TreeMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    if-eqz p0, :cond_6

    if-eqz p1, :cond_5

    .line 251
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_5

    .line 254
    :try_start_0
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 255
    invoke-virtual {p0}, Ljava/net/URI;->getRawQuery()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 256
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_4

    const-string v1, "&"

    .line 257
    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 258
    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-lt v3, v1, :cond_0

    goto :goto_3

    :cond_0
    aget-object v4, p0, v3

    const-string v5, "="

    .line 259
    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    if-lez v5, :cond_1

    .line 260
    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_1
    move-object v6, v4

    .line 261
    :goto_1
    invoke-virtual {v0, v6}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 262
    new-instance v7, Ljava/util/LinkedList;

    invoke-direct {v7}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v0, v6, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-lez v5, :cond_3

    .line 264
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v5, v5, 0x1

    if-le v7, v5, :cond_3

    .line 265
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    .line 267
    :goto_2
    invoke-virtual {v0, v6}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    :goto_3
    return-object v0

    :catch_0
    move-exception p0

    .line 273
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    .line 251
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'encoding\' can not be NULL or empty"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 250
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'uri\' can not be NULL"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-eqz p1, :cond_2

    .line 191
    instance-of v0, p1, Lnet/toddm/comm/Request;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 192
    :cond_0
    invoke-virtual {p0}, Lnet/toddm/comm/Request;->hashCode()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1

    .line 190
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'request\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getHeaders()Ljava/util/Map;
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

    .line 112
    iget-object v0, p0, Lnet/toddm/comm/Request;->_headers:Ljava/util/Map;

    return-object v0
.end method

.method public getId()I
    .locals 2

    .line 155
    iget-object v0, p0, Lnet/toddm/comm/Request;->_id:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 156
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    .line 155
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ID has not been calculated yet"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getMethod()Lnet/toddm/comm/Request$RequestMethod;
    .locals 1

    .line 102
    iget-object v0, p0, Lnet/toddm/comm/Request;->_method:Lnet/toddm/comm/Request$RequestMethod;

    return-object v0
.end method

.method public getPostData()[B
    .locals 1

    .line 107
    iget-object v0, p0, Lnet/toddm/comm/Request;->_postData:[B

    return-object v0
.end method

.method public getRedirectCount()I
    .locals 1

    .line 148
    iget v0, p0, Lnet/toddm/comm/Request;->_redirectCount:I

    return v0
.end method

.method public getRetryCountFromFailure()I
    .locals 1

    .line 170
    iget v0, p0, Lnet/toddm/comm/Request;->_retryCountFromFailure:I

    return v0
.end method

.method public getRetryCountFromResponse()I
    .locals 1

    .line 173
    iget v0, p0, Lnet/toddm/comm/Request;->_retryCountFromResponse:I

    return v0
.end method

.method public getUri()Ljava/net/URI;
    .locals 1

    .line 125
    iget-object v0, p0, Lnet/toddm/comm/Request;->_normalizedEndPoints:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/URI;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 181
    invoke-virtual {p0}, Lnet/toddm/comm/Request;->getId()I

    move-result v0

    return v0
.end method

.method protected incrementRetryCountFromFailure()V
    .locals 1

    .line 161
    iget v0, p0, Lnet/toddm/comm/Request;->_retryCountFromFailure:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/toddm/comm/Request;->_retryCountFromFailure:I

    return-void
.end method

.method protected incrementRetryCountFromResponse()V
    .locals 1

    .line 166
    iget v0, p0, Lnet/toddm/comm/Request;->_retryCountFromResponse:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/toddm/comm/Request;->_retryCountFromResponse:I

    return-void
.end method

.method public isIdempotent()Z
    .locals 1

    .line 120
    iget-boolean v0, p0, Lnet/toddm/comm/Request;->_isIdempotent:Z

    return v0
.end method

.method protected redirect(Ljava/net/URI;)Z
    .locals 2

    if-eqz p1, :cond_1

    .line 137
    iget v0, p0, Lnet/toddm/comm/Request;->_redirectCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lnet/toddm/comm/Request;->_redirectCount:I

    .line 138
    invoke-virtual {p1}, Ljava/net/URI;->normalize()Ljava/net/URI;

    move-result-object p1

    .line 139
    iget-object v0, p0, Lnet/toddm/comm/Request;->_normalizedEndPoints:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 140
    iget-object v0, p0, Lnet/toddm/comm/Request;->_normalizedEndPoints:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 134
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'newLocation\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
