.class public Lretrofit/appengine/UrlFetchClient;
.super Ljava/lang/Object;
.source "UrlFetchClient.java"

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

    return-void
.end method

.method public constructor <init>(Lcom/google/appengine/api/urlfetch/URLFetchService;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lretrofit/appengine/UrlFetchClient;->urlFetchService:Lcom/google/appengine/api/urlfetch/URLFetchService;

    return-void
.end method

.method static createRequest(Lretrofit/client/Request;)Lcom/google/appengine/api/urlfetch/HTTPRequest;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 64
    invoke-virtual {p0}, Lretrofit/client/Request;->getMethod()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lretrofit/appengine/UrlFetchClient;->getHttpMethod(Ljava/lang/String;)Lcom/google/appengine/api/urlfetch/HTTPMethod;

    move-result-object v0

    .line 65
    new-instance v1, Ljava/net/URL;

    invoke-virtual {p0}, Lretrofit/client/Request;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 66
    new-instance v2, Lcom/google/appengine/api/urlfetch/HTTPRequest;

    invoke-direct {v2, v1, v0}, Lcom/google/appengine/api/urlfetch/HTTPRequest;-><init>(Ljava/net/URL;Lcom/google/appengine/api/urlfetch/HTTPMethod;)V

    .line 68
    invoke-virtual {p0}, Lretrofit/client/Request;->getHeaders()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lretrofit/client/Header;

    .line 69
    new-instance v3, Lcom/google/appengine/api/urlfetch/HTTPHeader;

    invoke-virtual {v1}, Lretrofit/client/Header;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lretrofit/client/Header;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v4, v1}, Lcom/google/appengine/api/urlfetch/HTTPHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/google/appengine/api/urlfetch/HTTPRequest;->addHeader(Lcom/google/appengine/api/urlfetch/HTTPHeader;)V

    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {p0}, Lretrofit/client/Request;->getBody()Lretrofit/mime/TypedOutput;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 74
    invoke-interface {p0}, Lretrofit/mime/TypedOutput;->mimeType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 76
    new-instance v1, Lcom/google/appengine/api/urlfetch/HTTPHeader;

    const-string v3, "Content-Type"

    invoke-direct {v1, v3, v0}, Lcom/google/appengine/api/urlfetch/HTTPHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lcom/google/appengine/api/urlfetch/HTTPRequest;->addHeader(Lcom/google/appengine/api/urlfetch/HTTPHeader;)V

    .line 79
    :cond_1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 80
    invoke-interface {p0, v0}, Lretrofit/mime/TypedOutput;->writeTo(Ljava/io/OutputStream;)V

    .line 81
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    invoke-virtual {v2, p0}, Lcom/google/appengine/api/urlfetch/HTTPRequest;->setPayload([B)V

    :cond_2
    return-object v2
.end method

.method private static getHttpMethod(Ljava/lang/String;)Lcom/google/appengine/api/urlfetch/HTTPMethod;
    .locals 3

    const-string v0, "GET"

    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    sget-object p0, Lcom/google/appengine/api/urlfetch/HTTPMethod;->GET:Lcom/google/appengine/api/urlfetch/HTTPMethod;

    return-object p0

    :cond_0
    const-string v0, "POST"

    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 27
    sget-object p0, Lcom/google/appengine/api/urlfetch/HTTPMethod;->POST:Lcom/google/appengine/api/urlfetch/HTTPMethod;

    return-object p0

    :cond_1
    const-string v0, "PATCH"

    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 29
    sget-object p0, Lcom/google/appengine/api/urlfetch/HTTPMethod;->PATCH:Lcom/google/appengine/api/urlfetch/HTTPMethod;

    return-object p0

    :cond_2
    const-string v0, "PUT"

    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 31
    sget-object p0, Lcom/google/appengine/api/urlfetch/HTTPMethod;->PUT:Lcom/google/appengine/api/urlfetch/HTTPMethod;

    return-object p0

    :cond_3
    const-string v0, "DELETE"

    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 33
    sget-object p0, Lcom/google/appengine/api/urlfetch/HTTPMethod;->DELETE:Lcom/google/appengine/api/urlfetch/HTTPMethod;

    return-object p0

    :cond_4
    const-string v0, "HEAD"

    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 35
    sget-object p0, Lcom/google/appengine/api/urlfetch/HTTPMethod;->HEAD:Lcom/google/appengine/api/urlfetch/HTTPMethod;

    return-object p0

    .line 37
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal HTTP method: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static parseResponse(Lcom/google/appengine/api/urlfetch/HTTPResponse;Lcom/google/appengine/api/urlfetch/HTTPRequest;)Lretrofit/client/Response;
    .locals 7

    .line 89
    invoke-virtual {p0}, Lcom/google/appengine/api/urlfetch/HTTPResponse;->getFinalUrl()Ljava/net/URL;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {p1}, Lcom/google/appengine/api/urlfetch/HTTPRequest;->getURL()Ljava/net/URL;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v2

    .line 92
    invoke-virtual {p0}, Lcom/google/appengine/api/urlfetch/HTTPResponse;->getResponseCode()I

    move-result v3

    .line 94
    invoke-virtual {p0}, Lcom/google/appengine/api/urlfetch/HTTPResponse;->getHeaders()Ljava/util/List;

    move-result-object p1

    .line 95
    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    const-string v0, "application/octet-stream"

    .line 97
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/appengine/api/urlfetch/HTTPHeader;

    .line 98
    invoke-virtual {v1}, Lcom/google/appengine/api/urlfetch/HTTPHeader;->getName()Ljava/lang/String;

    move-result-object v4

    .line 99
    invoke-virtual {v1}, Lcom/google/appengine/api/urlfetch/HTTPHeader;->getValue()Ljava/lang/String;

    move-result-object v1

    const-string v6, "Content-Type"

    .line 100
    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    move-object v0, v1

    .line 103
    :cond_1
    new-instance v6, Lretrofit/client/Header;

    invoke-direct {v6, v4, v1}, Lretrofit/client/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    .line 107
    invoke-virtual {p0}, Lcom/google/appengine/api/urlfetch/HTTPResponse;->getContent()[B

    move-result-object p0

    if-eqz p0, :cond_3

    .line 109
    new-instance p1, Lretrofit/mime/TypedByteArray;

    invoke-direct {p1, v0, p0}, Lretrofit/mime/TypedByteArray;-><init>(Ljava/lang/String;[B)V

    :cond_3
    move-object v6, p1

    .line 112
    new-instance p0, Lretrofit/client/Response;

    const-string v4, ""

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lretrofit/client/Response;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lretrofit/mime/TypedInput;)V

    return-object p0
.end method


# virtual methods
.method protected execute(Lcom/google/appengine/api/urlfetch/URLFetchService;Lcom/google/appengine/api/urlfetch/HTTPRequest;)Lcom/google/appengine/api/urlfetch/HTTPResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 60
    invoke-interface {p1, p2}, Lcom/google/appengine/api/urlfetch/URLFetchService;->fetch(Lcom/google/appengine/api/urlfetch/HTTPRequest;)Lcom/google/appengine/api/urlfetch/HTTPResponse;

    move-result-object p1

    return-object p1
.end method

.method public execute(Lretrofit/client/Request;)Lretrofit/client/Response;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 52
    invoke-static {p1}, Lretrofit/appengine/UrlFetchClient;->createRequest(Lretrofit/client/Request;)Lcom/google/appengine/api/urlfetch/HTTPRequest;

    move-result-object p1

    .line 53
    iget-object v0, p0, Lretrofit/appengine/UrlFetchClient;->urlFetchService:Lcom/google/appengine/api/urlfetch/URLFetchService;

    invoke-virtual {p0, v0, p1}, Lretrofit/appengine/UrlFetchClient;->execute(Lcom/google/appengine/api/urlfetch/URLFetchService;Lcom/google/appengine/api/urlfetch/HTTPRequest;)Lcom/google/appengine/api/urlfetch/HTTPResponse;

    move-result-object v0

    .line 54
    invoke-static {v0, p1}, Lretrofit/appengine/UrlFetchClient;->parseResponse(Lcom/google/appengine/api/urlfetch/HTTPResponse;Lcom/google/appengine/api/urlfetch/HTTPRequest;)Lretrofit/client/Response;

    move-result-object p1

    return-object p1
.end method
