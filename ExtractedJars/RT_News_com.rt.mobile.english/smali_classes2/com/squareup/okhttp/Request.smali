.class public final Lcom/squareup/okhttp/Request;
.super Ljava/lang/Object;
.source "Request.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/Request$Builder;
    }
.end annotation


# instance fields
.field private final body:Lcom/squareup/okhttp/RequestBody;

.field private volatile cacheControl:Lcom/squareup/okhttp/CacheControl;

.field private final headers:Lcom/squareup/okhttp/Headers;

.field private final method:Ljava/lang/String;

.field private final tag:Ljava/lang/Object;

.field private volatile uri:Ljava/net/URI;

.field private volatile url:Ljava/net/URL;

.field private final urlString:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/squareup/okhttp/Request$Builder;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    invoke-static {p1}, Lcom/squareup/okhttp/Request$Builder;->access$000(Lcom/squareup/okhttp/Request$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Request;->urlString:Ljava/lang/String;

    .line 45
    invoke-static {p1}, Lcom/squareup/okhttp/Request$Builder;->access$100(Lcom/squareup/okhttp/Request$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Request;->method:Ljava/lang/String;

    .line 46
    invoke-static {p1}, Lcom/squareup/okhttp/Request$Builder;->access$200(Lcom/squareup/okhttp/Request$Builder;)Lcom/squareup/okhttp/Headers$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Headers$Builder;->build()Lcom/squareup/okhttp/Headers;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Request;->headers:Lcom/squareup/okhttp/Headers;

    .line 47
    invoke-static {p1}, Lcom/squareup/okhttp/Request$Builder;->access$300(Lcom/squareup/okhttp/Request$Builder;)Lcom/squareup/okhttp/RequestBody;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Request;->body:Lcom/squareup/okhttp/RequestBody;

    .line 48
    invoke-static {p1}, Lcom/squareup/okhttp/Request$Builder;->access$400(Lcom/squareup/okhttp/Request$Builder;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/squareup/okhttp/Request$Builder;->access$400(Lcom/squareup/okhttp/Request$Builder;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    iput-object v0, p0, Lcom/squareup/okhttp/Request;->tag:Ljava/lang/Object;

    .line 49
    invoke-static {p1}, Lcom/squareup/okhttp/Request$Builder;->access$500(Lcom/squareup/okhttp/Request$Builder;)Ljava/net/URL;

    move-result-object p1

    iput-object p1, p0, Lcom/squareup/okhttp/Request;->url:Ljava/net/URL;

    return-void
.end method

.method synthetic constructor <init>(Lcom/squareup/okhttp/Request$Builder;Lcom/squareup/okhttp/Request$1;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/Request;-><init>(Lcom/squareup/okhttp/Request$Builder;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/RequestBody;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/squareup/okhttp/Request;->body:Lcom/squareup/okhttp/RequestBody;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/squareup/okhttp/Request;)Ljava/lang/Object;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/squareup/okhttp/Request;->tag:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Headers;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/squareup/okhttp/Request;->headers:Lcom/squareup/okhttp/Headers;

    return-object p0
.end method

.method static synthetic access$700(Lcom/squareup/okhttp/Request;)Ljava/lang/String;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/squareup/okhttp/Request;->urlString:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$800(Lcom/squareup/okhttp/Request;)Ljava/net/URL;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/squareup/okhttp/Request;->url:Ljava/net/URL;

    return-object p0
.end method

.method static synthetic access$900(Lcom/squareup/okhttp/Request;)Ljava/lang/String;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/squareup/okhttp/Request;->method:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public body()Lcom/squareup/okhttp/RequestBody;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/squareup/okhttp/Request;->body:Lcom/squareup/okhttp/RequestBody;

    return-object v0
.end method

.method public cacheControl()Lcom/squareup/okhttp/CacheControl;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/squareup/okhttp/Request;->cacheControl:Lcom/squareup/okhttp/CacheControl;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/Request;->headers:Lcom/squareup/okhttp/Headers;

    invoke-static {v0}, Lcom/squareup/okhttp/CacheControl;->parse(Lcom/squareup/okhttp/Headers;)Lcom/squareup/okhttp/CacheControl;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Request;->cacheControl:Lcom/squareup/okhttp/CacheControl;

    :goto_0
    return-object v0
.end method

.method public header(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/squareup/okhttp/Request;->headers:Lcom/squareup/okhttp/Headers;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public headers()Lcom/squareup/okhttp/Headers;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/squareup/okhttp/Request;->headers:Lcom/squareup/okhttp/Headers;

    return-object v0
.end method

.method public headers(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 87
    iget-object v0, p0, Lcom/squareup/okhttp/Request;->headers:Lcom/squareup/okhttp/Headers;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Headers;->values(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public isHttps()Z
    .locals 2

    .line 112
    invoke-virtual {p0}, Lcom/squareup/okhttp/Request;->url()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public method()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/squareup/okhttp/Request;->method:Ljava/lang/String;

    return-object v0
.end method

.method public newBuilder()Lcom/squareup/okhttp/Request$Builder;
    .locals 2

    .line 99
    new-instance v0, Lcom/squareup/okhttp/Request$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/squareup/okhttp/Request$Builder;-><init>(Lcom/squareup/okhttp/Request;Lcom/squareup/okhttp/Request$1;)V

    return-object v0
.end method

.method public tag()Ljava/lang/Object;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/squareup/okhttp/Request;->tag:Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Request{method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/squareup/okhttp/Request;->method:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/squareup/okhttp/Request;->urlString:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/squareup/okhttp/Request;->tag:Ljava/lang/Object;

    if-eq v1, p0, :cond_0

    iget-object v1, p0, Lcom/squareup/okhttp/Request;->tag:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uri()Ljava/net/URI;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 63
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/Request;->uri:Ljava/net/URI;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 64
    :cond_0
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v0

    invoke-virtual {p0}, Lcom/squareup/okhttp/Request;->url()Ljava/net/URL;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/Platform;->toUriLenient(Ljava/net/URL;)Ljava/net/URI;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Request;->uri:Ljava/net/URI;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    .line 66
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public url()Ljava/net/URL;
    .locals 4

    .line 54
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/Request;->url:Ljava/net/URL;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 55
    :cond_0
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Lcom/squareup/okhttp/Request;->urlString:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/squareup/okhttp/Request;->url:Ljava/net/URL;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    .line 57
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Malformed URL: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/squareup/okhttp/Request;->urlString:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public urlString()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/squareup/okhttp/Request;->urlString:Ljava/lang/String;

    return-object v0
.end method
