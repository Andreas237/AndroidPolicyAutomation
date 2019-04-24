.class public Lretrofit/appengine/UrlFetchClient;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit/client/Client;


# instance fields
.field private final urlFetchService:Lcom/google/appengine/api/urlfetch/URLFetchService;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-static {}, Lcom/google/appengine/api/urlfetch/URLFetchServiceFactory;->getURLFetchService()Lcom/google/appengine/api/urlfetch/URLFetchService;

    move-result-object v0

    invoke-direct {p0, v0}, Lretrofit/appengine/UrlFetchClient;-><init>(Lcom/google/appengine/api/urlfetch/URLFetchService;)V

    .line 45
    return-void
.end method

.method public constructor <init>(Lcom/google/appengine/api/urlfetch/URLFetchService;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lretrofit/appengine/UrlFetchClient;->urlFetchService:Lcom/google/appengine/api/urlfetch/URLFetchService;

    .line 49
    return-void
.end method

.method static createRequest(Lretrofit/client/Request;)Lcom/google/appengine/api/urlfetch/HTTPRequest;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 64
    invoke-virtual {p0}, Lretrofit/client/Request;->getMethod()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lretrofit/appengine/UrlFetchClient;->getHttpMethod(Ljava/lang/String;)Lcom/google/appengine/api/urlfetch/HTTPMethod;

    move-result-object v3

    .line 65
    new-instance v4, Ljava/net/URL;

    invoke-virtual {p0}, Lretrofit/client/Request;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 66
    new-instance v5, Lcom/google/appengine/api/urlfetch/HTTPRequest;

    invoke-direct {v5, v4, v3}, Lcom/google/appengine/api/urlfetch/HTTPRequest;-><init>(Ljava/net/URL;Lcom/google/appengine/api/urlfetch/HTTPMethod;)V

    .line 68
    invoke-virtual {p0}, Lretrofit/client/Request;->getHeaders()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lretrofit/client/Header;

    .line 69
    new-instance v0, Lcom/google/appengine/api/urlfetch/HTTPHeader;

    invoke-virtual {v7}, Lretrofit/client/Header;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7}, Lretrofit/client/Header;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/appengine/api/urlfetch/HTTPHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Lcom/google/appengine/api/urlfetch/HTTPRequest;->addHeader(Lcom/google/appengine/api/urlfetch/HTTPHeader;)V

    .line 70
    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {p0}, Lretrofit/client/Request;->getBody()Lretrofit/mime/TypedOutput;

    move-result-object v6

    .line 73
    if-eqz v6, :cond_2

    .line 74
    invoke-interface {v6}, Lretrofit/mime/TypedOutput;->mimeType()Ljava/lang/String;

    move-result-object v7

    .line 75
    if-eqz v7, :cond_1

    .line 76
    new-instance v0, Lcom/google/appengine/api/urlfetch/HTTPHeader;

    const-string v1, "Content-Type"

    invoke-direct {v0, v1, v7}, Lcom/google/appengine/api/urlfetch/HTTPHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Lcom/google/appengine/api/urlfetch/HTTPRequest;->addHeader(Lcom/google/appengine/api/urlfetch/HTTPHeader;)V

    .line 79
    :cond_1
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 80
    invoke-interface {v6, v8}, Lretrofit/mime/TypedOutput;->writeTo(Ljava/io/OutputStream;)V

    .line 81
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/google/appengine/api/urlfetch/HTTPRequest;->setPayload([B)V

    .line 84
    :cond_2
    return-object v5
.end method

.method private static getHttpMethod(Ljava/lang/String;)Lcom/google/appengine/api/urlfetch/HTTPMethod;
    .locals 3

    .line 24
    const-string v0, "GET"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    sget-object v0, Lcom/google/appengine/api/urlfetch/HTTPMethod;->GET:Lcom/google/appengine/api/urlfetch/HTTPMethod;

    return-object v0

    .line 26
    :cond_0
    const-string v0, "POST"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 27
    sget-object v0, Lcom/google/appengine/api/urlfetch/HTTPMethod;->POST:Lcom/google/appengine/api/urlfetch/HTTPMethod;

    return-object v0

    .line 28
    :cond_1
    const-string v0, "PATCH"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 29
    sget-object v0, Lcom/google/appengine/api/urlfetch/HTTPMethod;->PATCH:Lcom/google/appengine/api/urlfetch/HTTPMethod;

    return-object v0

    .line 30
    :cond_2
    const-string v0, "PUT"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 31
    sget-object v0, Lcom/google/appengine/api/urlfetch/HTTPMethod;->PUT:Lcom/google/appengine/api/urlfetch/HTTPMethod;

    return-object v0

    .line 32
    :cond_3
    const-string v0, "DELETE"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 33
    sget-object v0, Lcom/google/appengine/api/urlfetch/HTTPMethod;->DELETE:Lcom/google/appengine/api/urlfetch/HTTPMethod;

    return-object v0

    .line 34
    :cond_4
    const-string v0, "HEAD"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 35
    sget-object v0, Lcom/google/appengine/api/urlfetch/HTTPMethod;->HEAD:Lcom/google/appengine/api/urlfetch/HTTPMethod;

    return-object v0

    .line 37
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal HTTP method: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static parseResponse(Lcom/google/appengine/api/urlfetch/HTTPResponse;Lcom/google/appengine/api/urlfetch/HTTPRequest;)Lretrofit/client/Response;
    .locals 16

    .line 89
    invoke-virtual/range {p0 .. p0}, Lcom/google/appengine/api/urlfetch/HTTPResponse;->getFinalUrl()Ljava/net/URL;

    move-result-object v6

    .line 90
    if-eqz v6, :cond_0

    move-object v0, v6

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/google/appengine/api/urlfetch/HTTPRequest;->getURL()Ljava/net/URL;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v7

    .line 92
    invoke-virtual/range {p0 .. p0}, Lcom/google/appengine/api/urlfetch/HTTPResponse;->getResponseCode()I

    move-result v8

    .line 94
    invoke-virtual/range {p0 .. p0}, Lcom/google/appengine/api/urlfetch/HTTPResponse;->getHeaders()Ljava/util/List;

    move-result-object v9

    .line 95
    new-instance v10, Ljava/util/ArrayList;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 96
    const-string v11, "application/octet-stream"

    .line 97
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/google/appengine/api/urlfetch/HTTPHeader;

    .line 98
    invoke-virtual {v13}, Lcom/google/appengine/api/urlfetch/HTTPHeader;->getName()Ljava/lang/String;

    move-result-object v14

    .line 99
    invoke-virtual {v13}, Lcom/google/appengine/api/urlfetch/HTTPHeader;->getValue()Ljava/lang/String;

    move-result-object v15

    .line 100
    const-string v0, "Content-Type"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 101
    move-object v11, v15

    .line 103
    :cond_1
    new-instance v0, Lretrofit/client/Header;

    invoke-direct {v0, v14, v15}, Lretrofit/client/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    goto :goto_1

    .line 106
    :cond_2
    const/4 v12, 0x0

    .line 107
    invoke-virtual/range {p0 .. p0}, Lcom/google/appengine/api/urlfetch/HTTPResponse;->getContent()[B

    move-result-object v13

    .line 108
    if-eqz v13, :cond_3

    .line 109
    new-instance v12, Lretrofit/mime/TypedByteArray;

    invoke-direct {v12, v11, v13}, Lretrofit/mime/TypedByteArray;-><init>(Ljava/lang/String;[B)V

    .line 112
    :cond_3
    new-instance v0, Lretrofit/client/Response;

    const-string v3, ""

    move-object v1, v7

    move v2, v8

    move-object v4, v10

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lretrofit/client/Response;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lretrofit/mime/TypedInput;)V

    return-object v0
.end method


# virtual methods
.method protected execute(Lcom/google/appengine/api/urlfetch/URLFetchService;Lcom/google/appengine/api/urlfetch/HTTPRequest;)Lcom/google/appengine/api/urlfetch/HTTPResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 60
    invoke-interface {p1, p2}, Lcom/google/appengine/api/urlfetch/URLFetchService;->fetch(Lcom/google/appengine/api/urlfetch/HTTPRequest;)Lcom/google/appengine/api/urlfetch/HTTPResponse;

    move-result-object v0

    return-object v0
.end method

.method public execute(Lretrofit/client/Request;)Lretrofit/client/Response;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 52
    invoke-static {p1}, Lretrofit/appengine/UrlFetchClient;->createRequest(Lretrofit/client/Request;)Lcom/google/appengine/api/urlfetch/HTTPRequest;

    move-result-object v1

    .line 53
    iget-object v0, p0, Lretrofit/appengine/UrlFetchClient;->urlFetchService:Lcom/google/appengine/api/urlfetch/URLFetchService;

    invoke-virtual {p0, v0, v1}, Lretrofit/appengine/UrlFetchClient;->execute(Lcom/google/appengine/api/urlfetch/URLFetchService;Lcom/google/appengine/api/urlfetch/HTTPRequest;)Lcom/google/appengine/api/urlfetch/HTTPResponse;

    move-result-object v2

    .line 54
    invoke-static {v2, v1}, Lretrofit/appengine/UrlFetchClient;->parseResponse(Lcom/google/appengine/api/urlfetch/HTTPResponse;Lcom/google/appengine/api/urlfetch/HTTPRequest;)Lretrofit/client/Response;

    move-result-object v0

    return-object v0
.end method
