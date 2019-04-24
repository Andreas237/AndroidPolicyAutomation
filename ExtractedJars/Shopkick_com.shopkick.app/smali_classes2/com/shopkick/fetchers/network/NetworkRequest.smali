.class public Lcom/shopkick/fetchers/network/NetworkRequest;
.super Ljava/lang/Object;
.source "NetworkRequest.java"


# instance fields
.field public final authType:I

.field public final cachingBehavior:Lnet/toddm/comm/CacheBehavior;

.field public final cachingPriority:Lnet/toddm/cache/CachePriority;

.field public final contentType:Ljava/lang/String;

.field public final domainId:Lcom/shopkick/fetchers/api/RequestDomainId;

.field headers:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public ignoreRequestHeaders:Z

.field protected isAuthenticated:Z

.field public final isIdempotent:Z

.field private localContext:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private postBody:Ljava/lang/String;

.field public final requestMethod:Lnet/toddm/comm/Request$RequestMethod;

.field public requestPath:Ljava/lang/String;

.field public final requestPriority:Lnet/toddm/comm/Priority$StartingPriority;

.field private requestWorkId:Ljava/lang/Integer;

.field public urlString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Lnet/toddm/comm/Request$RequestMethod;Ljava/lang/String;IZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)V
    .locals 1

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->ignoreRequestHeaders:Z

    const/4 v0, 0x0

    .line 41
    iput-object v0, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->postBody:Ljava/lang/String;

    .line 42
    iput-object v0, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->requestWorkId:Ljava/lang/Integer;

    const/4 v0, 0x1

    .line 45
    iput-boolean v0, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->isAuthenticated:Z

    .line 68
    iput-object p1, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->domainId:Lcom/shopkick/fetchers/api/RequestDomainId;

    .line 69
    iput-object p2, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->urlString:Ljava/lang/String;

    .line 70
    iput-object p3, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->requestMethod:Lnet/toddm/comm/Request$RequestMethod;

    .line 71
    iput-object p4, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->contentType:Ljava/lang/String;

    .line 72
    iput p5, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->authType:I

    .line 73
    iput-boolean p6, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->isIdempotent:Z

    .line 74
    iput-object p7, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->requestPriority:Lnet/toddm/comm/Priority$StartingPriority;

    .line 75
    iput-object p8, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->cachingPriority:Lnet/toddm/cache/CachePriority;

    .line 76
    iput-object p9, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->cachingBehavior:Lnet/toddm/comm/CacheBehavior;

    return-void
.end method


# virtual methods
.method public addHeader(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 176
    :cond_0
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->headers:Ljava/util/HashMap;

    if-nez v0, :cond_1

    .line 177
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->headers:Ljava/util/HashMap;

    :cond_1
    if-nez p2, :cond_2

    const-string p2, ""

    .line 184
    :cond_2
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->headers:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public getHeaders()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 188
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->headers:Ljava/util/HashMap;

    return-object v0
.end method

.method public getLocalContext()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 192
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->localContext:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 193
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->localContext:Ljava/util/Map;

    .line 195
    :cond_0
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->localContext:Ljava/util/Map;

    return-object v0
.end method

.method public getPostBodyAsBytes()[B
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->postBody:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 102
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->postBody:Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 104
    new-instance v1, Lnet/toddm/comm/CommException;

    invoke-direct {v1, v0}, Lnet/toddm/comm/CommException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getPostBodyAsText()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->postBody:Ljava/lang/String;

    return-object v0
.end method

.method public getRequestWorkId()Ljava/lang/Integer;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->requestWorkId:Ljava/lang/Integer;

    return-object v0
.end method

.method public isAuthenticated()Z
    .locals 1

    .line 83
    iget-boolean v0, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->isAuthenticated:Z

    return v0
.end method

.method public populateURL(Landroid/net/Uri$Builder;Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri$Builder;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/network/QueryParameter;",
            ">;)V"
        }
    .end annotation

    .line 130
    :try_start_0
    sget-object v0, Lnet/toddm/comm/Request$RequestMethod;->POST:Lnet/toddm/comm/Request$RequestMethod;

    iget-object v1, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->requestMethod:Lnet/toddm/comm/Request$RequestMethod;

    invoke-virtual {v0, v1}, Lnet/toddm/comm/Request$RequestMethod;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->urlString:Ljava/lang/String;

    .line 132
    invoke-virtual {p0, p2}, Lcom/shopkick/fetchers/network/NetworkRequest;->setBody(Ljava/util/ArrayList;)V

    goto :goto_1

    .line 134
    :cond_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/network/QueryParameter;

    .line 135
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/network/QueryParameter;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/network/QueryParameter;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_0

    .line 137
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->urlString:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :catch_0
    move-exception p1

    .line 140
    new-instance p2, Lnet/toddm/comm/CommException;

    invoke-direct {p2, p1}, Lnet/toddm/comm/CommException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public setBody(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/network/QueryParameter;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 152
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    .line 155
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/network/QueryParameter;

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    const-string v3, "&"

    .line 157
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    :goto_1
    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/network/QueryParameter;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "UTF-8"

    invoke-static {v3, v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "="

    .line 160
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/network/QueryParameter;->getValue()Ljava/lang/String;

    move-result-object v2

    const-string v3, "UTF-8"

    invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 164
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->postBody:Ljava/lang/String;

    return-void
.end method

.method setRequestWorkId(I)V
    .locals 0

    .line 121
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/fetchers/network/NetworkRequest;->requestWorkId:Ljava/lang/Integer;

    return-void
.end method
