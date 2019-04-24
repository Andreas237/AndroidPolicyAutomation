.class public Lretrofit/client/OkClient;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit/client/Client;


# instance fields
.field private final client:Lcom/squareup/okhttp/OkHttpClient;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-static {}, Lretrofit/client/OkClient;->generateDefaultOkHttp()Lcom/squareup/okhttp/OkHttpClient;

    move-result-object v0

    invoke-direct {p0, v0}, Lretrofit/client/OkClient;-><init>(Lcom/squareup/okhttp/OkHttpClient;)V

    .line 45
    return-void
.end method

.method public constructor <init>(Lcom/squareup/okhttp/OkHttpClient;)V
    .locals 2

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "client == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :cond_0
    iput-object p1, p0, Lretrofit/client/OkClient;->client:Lcom/squareup/okhttp/OkHttpClient;

    .line 50
    return-void
.end method

.method private static createHeaders(Lcom/squareup/okhttp/Headers;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/okhttp/Headers;)Ljava/util/List<Lretrofit/client/Header;>;"
        }
    .end annotation

    .line 118
    invoke-virtual {p0}, Lcom/squareup/okhttp/Headers;->size()I

    move-result v3

    .line 119
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 120
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_0

    .line 121
    new-instance v0, Lretrofit/client/Header;

    invoke-virtual {p0, v5}, Lcom/squareup/okhttp/Headers;->name(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v5}, Lcom/squareup/okhttp/Headers;->value(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lretrofit/client/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 123
    :cond_0
    return-object v4
.end method

.method static createRequest(Lretrofit/client/Request;)Lcom/squareup/okhttp/Request;
    .locals 9

    .line 57
    new-instance v0, Lcom/squareup/okhttp/Request$Builder;

    invoke-direct {v0}, Lcom/squareup/okhttp/Request$Builder;-><init>()V

    .line 58
    invoke-virtual {p0}, Lretrofit/client/Request;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/Request$Builder;->url(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    .line 59
    invoke-virtual {p0}, Lretrofit/client/Request;->getMethod()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lretrofit/client/Request;->getBody()Lretrofit/mime/TypedOutput;

    move-result-object v2

    invoke-static {v2}, Lretrofit/client/OkClient;->createRequestBody(Lretrofit/mime/TypedOutput;)Lcom/squareup/okhttp/RequestBody;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v3

    .line 61
    invoke-virtual {p0}, Lretrofit/client/Request;->getHeaders()Ljava/util/List;

    move-result-object v4

    .line 62
    const/4 v5, 0x0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    :goto_0
    if-ge v5, v6, :cond_1

    .line 63
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lretrofit/client/Header;

    .line 64
    invoke-virtual {v7}, Lretrofit/client/Header;->getValue()Ljava/lang/String;

    move-result-object v8

    .line 65
    if-nez v8, :cond_0

    const-string v8, ""

    .line 66
    :cond_0
    invoke-virtual {v7}, Lretrofit/client/Header;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v8}, Lcom/squareup/okhttp/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    .line 62
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 69
    :cond_1
    invoke-virtual {v3}, Lcom/squareup/okhttp/Request$Builder;->build()Lcom/squareup/okhttp/Request;

    move-result-object v0

    return-object v0
.end method

.method private static createRequestBody(Lretrofit/mime/TypedOutput;)Lcom/squareup/okhttp/RequestBody;
    .locals 2

    .line 78
    if-nez p0, :cond_0

    .line 79
    const/4 v0, 0x0

    return-object v0

    .line 81
    :cond_0
    invoke-interface {p0}, Lretrofit/mime/TypedOutput;->mimeType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/okhttp/MediaType;->parse(Ljava/lang/String;)Lcom/squareup/okhttp/MediaType;

    move-result-object v1

    .line 82
    new-instance v0, Lretrofit/client/OkClient$1;

    invoke-direct {v0, v1, p0}, Lretrofit/client/OkClient$1;-><init>(Lcom/squareup/okhttp/MediaType;Lretrofit/mime/TypedOutput;)V

    return-object v0
.end method

.method private static createResponseBody(Lcom/squareup/okhttp/ResponseBody;)Lretrofit/mime/TypedInput;
    .locals 4

    .line 98
    invoke-virtual {p0}, Lcom/squareup/okhttp/ResponseBody;->contentLength()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 99
    const/4 v0, 0x0

    return-object v0

    .line 101
    :cond_0
    new-instance v0, Lretrofit/client/OkClient$2;

    invoke-direct {v0, p0}, Lretrofit/client/OkClient$2;-><init>(Lcom/squareup/okhttp/ResponseBody;)V

    return-object v0
.end method

.method private static generateDefaultOkHttp()Lcom/squareup/okhttp/OkHttpClient;
    .locals 4

    .line 35
    new-instance v3, Lcom/squareup/okhttp/OkHttpClient;

    invoke-direct {v3}, Lcom/squareup/okhttp/OkHttpClient;-><init>()V

    .line 36
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3a98

    invoke-virtual {v3, v1, v2, v0}, Lcom/squareup/okhttp/OkHttpClient;->setConnectTimeout(JLjava/util/concurrent/TimeUnit;)V

    .line 37
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x4e20

    invoke-virtual {v3, v1, v2, v0}, Lcom/squareup/okhttp/OkHttpClient;->setReadTimeout(JLjava/util/concurrent/TimeUnit;)V

    .line 38
    return-object v3
.end method

.method static parseResponse(Lcom/squareup/okhttp/Response;)Lretrofit/client/Response;
    .locals 6

    .line 73
    new-instance v0, Lretrofit/client/Response;

    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->request()Lcom/squareup/okhttp/Request;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/Request;->urlString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->code()I

    move-result v2

    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->message()Ljava/lang/String;

    move-result-object v3

    .line 74
    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object v4

    invoke-static {v4}, Lretrofit/client/OkClient;->createHeaders(Lcom/squareup/okhttp/Headers;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0}, Lcom/squareup/okhttp/Response;->body()Lcom/squareup/okhttp/ResponseBody;

    move-result-object v5

    invoke-static {v5}, Lretrofit/client/OkClient;->createResponseBody(Lcom/squareup/okhttp/ResponseBody;)Lretrofit/mime/TypedInput;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lretrofit/client/Response;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lretrofit/mime/TypedInput;)V

    return-object v0
.end method


# virtual methods
.method public execute(Lretrofit/client/Request;)Lretrofit/client/Response;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lretrofit/client/OkClient;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-static {p1}, Lretrofit/client/OkClient;->createRequest(Lretrofit/client/Request;)Lcom/squareup/okhttp/Request;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/OkHttpClient;->newCall(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Call;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Call;->execute()Lcom/squareup/okhttp/Response;

    move-result-object v0

    invoke-static {v0}, Lretrofit/client/OkClient;->parseResponse(Lcom/squareup/okhttp/Response;)Lretrofit/client/Response;

    move-result-object v0

    return-object v0
.end method
