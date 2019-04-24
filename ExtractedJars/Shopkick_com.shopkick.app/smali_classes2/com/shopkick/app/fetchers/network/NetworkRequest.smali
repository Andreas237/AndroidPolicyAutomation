.class public Lcom/shopkick/app/fetchers/network/NetworkRequest;
.super Ljava/lang/Object;
.source "NetworkRequest.java"


# instance fields
.field public body:Lorg/apache/http/HttpEntity;

.field public bodyBytes:[B

.field public bodyString:Ljava/lang/String;

.field public contentType:Ljava/lang/String;

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

.field public isPost:Z

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

.field public requestPath:Ljava/lang/String;

.field public urlString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 47
    invoke-direct {p0, p1, v1, v0, v0}, Lcom/shopkick/app/fetchers/network/NetworkRequest;-><init>(Ljava/lang/String;ZLjava/lang/String;Lorg/apache/http/HttpEntity;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;Lorg/apache/http/HttpEntity;)V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 34
    iput-boolean v0, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->ignoreRequestHeaders:Z

    .line 55
    iput-object p1, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->urlString:Ljava/lang/String;

    .line 56
    iput-boolean p2, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->isPost:Z

    .line 57
    iput-object p3, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->contentType:Ljava/lang/String;

    .line 58
    iput-object p4, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->body:Lorg/apache/http/HttpEntity;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 51
    invoke-direct {p0, v0, p1, p2, v0}, Lcom/shopkick/app/fetchers/network/NetworkRequest;-><init>(Ljava/lang/String;ZLjava/lang/String;Lorg/apache/http/HttpEntity;)V

    return-void
.end method


# virtual methods
.method public addHeader(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 115
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->headers:Ljava/util/HashMap;

    if-nez v0, :cond_1

    .line 116
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->headers:Ljava/util/HashMap;

    :cond_1
    if-nez p2, :cond_2

    const-string p2, ""

    .line 123
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->headers:Ljava/util/HashMap;

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

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->headers:Ljava/util/HashMap;

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

    .line 178
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->localContext:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 179
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->localContext:Ljava/util/Map;

    .line 181
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->localContext:Ljava/util/Map;

    return-object v0
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

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 67
    iget-boolean v0, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->isPost:Z

    if-eqz v0, :cond_0

    .line 68
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->urlString:Ljava/lang/String;

    .line 69
    invoke-virtual {p0, p2}, Lcom/shopkick/app/fetchers/network/NetworkRequest;->setBody(Ljava/util/ArrayList;)V

    goto :goto_1

    .line 71
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

    .line 72
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/network/QueryParameter;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/network/QueryParameter;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->urlString:Ljava/lang/String;

    :goto_1
    return-void
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

    .line 85
    :cond_0
    new-instance v0, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    const-string v1, "UTF-8"

    invoke-direct {v0, p1, v1}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->body:Lorg/apache/http/HttpEntity;

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    .line 90
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

    .line 92
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    :goto_1
    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/network/QueryParameter;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "UTF-8"

    invoke-static {v3, v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "="

    .line 95
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/network/QueryParameter;->getValue()Ljava/lang/String;

    move-result-object v2

    const-string v3, "UTF-8"

    invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 99
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->bodyString:Ljava/lang/String;

    return-void
.end method

.method public setBodyBytes([B)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->bodyBytes:[B

    return-void
.end method

.method public toHttpRequest()Lorg/apache/http/client/methods/HttpUriRequest;
    .locals 4

    const/4 v0, 0x0

    .line 139
    :try_start_0
    new-instance v1, Ljava/net/URI;

    iget-object v2, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->urlString:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 141
    const-class v2, Lcom/shopkick/app/fetchers/network/NetworkRequest;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/net/URISyntaxException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object v1, v0

    :goto_0
    if-nez v1, :cond_0

    return-object v0

    .line 148
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->isPost:Z

    if-eqz v0, :cond_1

    .line 149
    new-instance v0, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v0, v1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/net/URI;)V

    .line 151
    iget-object v1, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->body:Lorg/apache/http/HttpEntity;

    if-eqz v1, :cond_2

    .line 152
    invoke-virtual {v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    goto :goto_1

    .line 156
    :cond_1
    new-instance v0, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v0, v1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/net/URI;)V

    .line 160
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->headers:Ljava/util/HashMap;

    if-eqz v1, :cond_3

    .line 161
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 163
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 164
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 165
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v3, v2}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 170
    :cond_3
    iget-object v1, p0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->contentType:Ljava/lang/String;

    if-eqz v1, :cond_4

    const-string v2, "Content-Type"

    .line 171
    invoke-interface {v0, v2, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    return-object v0
.end method
