.class public Lcom/squareup/okhttp/Request$Builder;
.super Ljava/lang/Object;
.source "Request.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/Request;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private body:Lcom/squareup/okhttp/RequestBody;

.field private headers:Lcom/squareup/okhttp/Headers$Builder;

.field private method:Ljava/lang/String;

.field private tag:Ljava/lang/Object;

.field private url:Ljava/net/URL;

.field private urlString:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "GET"

    .line 134
    iput-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->method:Ljava/lang/String;

    .line 135
    new-instance v0, Lcom/squareup/okhttp/Headers$Builder;

    invoke-direct {v0}, Lcom/squareup/okhttp/Headers$Builder;-><init>()V

    iput-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->headers:Lcom/squareup/okhttp/Headers$Builder;

    return-void
.end method

.method private constructor <init>(Lcom/squareup/okhttp/Request;)V
    .locals 1

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    invoke-static {p1}, Lcom/squareup/okhttp/Request;->access$700(Lcom/squareup/okhttp/Request;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->urlString:Ljava/lang/String;

    .line 140
    invoke-static {p1}, Lcom/squareup/okhttp/Request;->access$800(Lcom/squareup/okhttp/Request;)Ljava/net/URL;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->url:Ljava/net/URL;

    .line 141
    invoke-static {p1}, Lcom/squareup/okhttp/Request;->access$900(Lcom/squareup/okhttp/Request;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->method:Ljava/lang/String;

    .line 142
    invoke-static {p1}, Lcom/squareup/okhttp/Request;->access$1000(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/RequestBody;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->body:Lcom/squareup/okhttp/RequestBody;

    .line 143
    invoke-static {p1}, Lcom/squareup/okhttp/Request;->access$1100(Lcom/squareup/okhttp/Request;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->tag:Ljava/lang/Object;

    .line 144
    invoke-static {p1}, Lcom/squareup/okhttp/Request;->access$1200(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Headers;

    move-result-object p1

    invoke-virtual {p1}, Lcom/squareup/okhttp/Headers;->newBuilder()Lcom/squareup/okhttp/Headers$Builder;

    move-result-object p1

    iput-object p1, p0, Lcom/squareup/okhttp/Request$Builder;->headers:Lcom/squareup/okhttp/Headers$Builder;

    return-void
.end method

.method synthetic constructor <init>(Lcom/squareup/okhttp/Request;Lcom/squareup/okhttp/Request$1;)V
    .locals 0

    .line 125
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/Request$Builder;-><init>(Lcom/squareup/okhttp/Request;)V

    return-void
.end method

.method static synthetic access$000(Lcom/squareup/okhttp/Request$Builder;)Ljava/lang/String;
    .locals 0

    .line 125
    iget-object p0, p0, Lcom/squareup/okhttp/Request$Builder;->urlString:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/squareup/okhttp/Request$Builder;)Ljava/lang/String;
    .locals 0

    .line 125
    iget-object p0, p0, Lcom/squareup/okhttp/Request$Builder;->method:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lcom/squareup/okhttp/Request$Builder;)Lcom/squareup/okhttp/Headers$Builder;
    .locals 0

    .line 125
    iget-object p0, p0, Lcom/squareup/okhttp/Request$Builder;->headers:Lcom/squareup/okhttp/Headers$Builder;

    return-object p0
.end method

.method static synthetic access$300(Lcom/squareup/okhttp/Request$Builder;)Lcom/squareup/okhttp/RequestBody;
    .locals 0

    .line 125
    iget-object p0, p0, Lcom/squareup/okhttp/Request$Builder;->body:Lcom/squareup/okhttp/RequestBody;

    return-object p0
.end method

.method static synthetic access$400(Lcom/squareup/okhttp/Request$Builder;)Ljava/lang/Object;
    .locals 0

    .line 125
    iget-object p0, p0, Lcom/squareup/okhttp/Request$Builder;->tag:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$500(Lcom/squareup/okhttp/Request$Builder;)Ljava/net/URL;
    .locals 0

    .line 125
    iget-object p0, p0, Lcom/squareup/okhttp/Request$Builder;->url:Ljava/net/URL;

    return-object p0
.end method


# virtual methods
.method public addHeader(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->headers:Lcom/squareup/okhttp/Headers$Builder;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Headers$Builder;

    return-object p0
.end method

.method public build()Lcom/squareup/okhttp/Request;
    .locals 2

    .line 250
    iget-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->urlString:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 251
    new-instance v0, Lcom/squareup/okhttp/Request;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/squareup/okhttp/Request;-><init>(Lcom/squareup/okhttp/Request$Builder;Lcom/squareup/okhttp/Request$1;)V

    return-object v0

    .line 250
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "url == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public cacheControl(Lcom/squareup/okhttp/CacheControl;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 195
    invoke-virtual {p1}, Lcom/squareup/okhttp/CacheControl;->toString()Ljava/lang/String;

    move-result-object p1

    .line 196
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Cache-Control"

    invoke-virtual {p0, p1}, Lcom/squareup/okhttp/Request$Builder;->removeHeader(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "Cache-Control"

    .line 197
    invoke-virtual {p0, v0, p1}, Lcom/squareup/okhttp/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public delete()Lcom/squareup/okhttp/Request$Builder;
    .locals 2

    const-string v0, "DELETE"

    const/4 v1, 0x0

    .line 213
    invoke-virtual {p0, v0, v1}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    return-object v0
.end method

.method public get()Lcom/squareup/okhttp/Request$Builder;
    .locals 2

    const-string v0, "GET"

    const/4 v1, 0x0

    .line 201
    invoke-virtual {p0, v0, v1}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    return-object v0
.end method

.method public head()Lcom/squareup/okhttp/Request$Builder;
    .locals 2

    const-string v0, "HEAD"

    const/4 v1, 0x0

    .line 205
    invoke-virtual {p0, v0, v1}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    return-object v0
.end method

.method public header(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->headers:Lcom/squareup/okhttp/Headers$Builder;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/Headers$Builder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Headers$Builder;

    return-object p0
.end method

.method public headers(Lcom/squareup/okhttp/Headers;)Lcom/squareup/okhttp/Request$Builder;
    .locals 0

    .line 185
    invoke-virtual {p1}, Lcom/squareup/okhttp/Headers;->newBuilder()Lcom/squareup/okhttp/Headers$Builder;

    move-result-object p1

    iput-object p1, p0, Lcom/squareup/okhttp/Request$Builder;->headers:Lcom/squareup/okhttp/Headers$Builder;

    return-object p0
.end method

.method public method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;
    .locals 2

    if-eqz p1, :cond_3

    .line 225
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p2, :cond_1

    .line 228
    invoke-static {p1}, Lcom/squareup/okhttp/internal/http/HttpMethod;->permitsRequestBody(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 229
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "method "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must not have a request body."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 231
    invoke-static {p1}, Lcom/squareup/okhttp/internal/http/HttpMethod;->permitsRequestBody(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p2, 0x0

    .line 232
    sget-object v0, Lcom/squareup/okhttp/internal/Util;->EMPTY_BYTE_ARRAY:[B

    invoke-static {p2, v0}, Lcom/squareup/okhttp/RequestBody;->create(Lcom/squareup/okhttp/MediaType;[B)Lcom/squareup/okhttp/RequestBody;

    move-result-object p2

    .line 234
    :cond_2
    iput-object p1, p0, Lcom/squareup/okhttp/Request$Builder;->method:Ljava/lang/String;

    .line 235
    iput-object p2, p0, Lcom/squareup/okhttp/Request$Builder;->body:Lcom/squareup/okhttp/RequestBody;

    return-object p0

    .line 226
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "method == null || method.length() == 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public patch(Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    const-string v0, "PATCH"

    .line 221
    invoke-virtual {p0, v0, p1}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public post(Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    const-string v0, "POST"

    .line 209
    invoke-virtual {p0, v0, p1}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public put(Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    const-string v0, "PUT"

    .line 217
    invoke-virtual {p0, v0, p1}, Lcom/squareup/okhttp/Request$Builder;->method(Ljava/lang/String;Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method public removeHeader(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/squareup/okhttp/Request$Builder;->headers:Lcom/squareup/okhttp/Headers$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Headers$Builder;->removeAll(Ljava/lang/String;)Lcom/squareup/okhttp/Headers$Builder;

    return-object p0
.end method

.method public tag(Ljava/lang/Object;)Lcom/squareup/okhttp/Request$Builder;
    .locals 0

    .line 245
    iput-object p1, p0, Lcom/squareup/okhttp/Request$Builder;->tag:Ljava/lang/Object;

    return-object p0
.end method

.method public url(Ljava/lang/String;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 149
    iput-object p1, p0, Lcom/squareup/okhttp/Request$Builder;->urlString:Ljava/lang/String;

    return-object p0

    .line 148
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v0, "url == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public url(Ljava/net/URL;)Lcom/squareup/okhttp/Request$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 155
    iput-object p1, p0, Lcom/squareup/okhttp/Request$Builder;->url:Ljava/net/URL;

    .line 156
    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/squareup/okhttp/Request$Builder;->urlString:Ljava/lang/String;

    return-object p0

    .line 154
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v0, "url == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
