.class public Lorg/c/c/a/p;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/c/a/g;


# static fields
.field private static final DEFAULT_CHUNK_SIZE:I


# instance fields
.field private bufferRequestBody:Z

.field private chunkSize:I

.field private connectTimeout:I

.field private proxy:Ljava/net/Proxy;

.field private readTimeout:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/c/c/a/p;->bufferRequestBody:Z

    const/4 v0, 0x0

    iput v0, p0, Lorg/c/c/a/p;->chunkSize:I

    const/4 v0, -0x1

    iput v0, p0, Lorg/c/c/a/p;->connectTimeout:I

    iput v0, p0, Lorg/c/c/a/p;->readTimeout:I

    return-void
.end method


# virtual methods
.method public createRequest(Ljava/net/URI;Lorg/c/c/f;)Lorg/c/c/a/e;
    .locals 1

    invoke-virtual {p1}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object p1

    iget-object v0, p0, Lorg/c/c/a/p;->proxy:Ljava/net/Proxy;

    invoke-virtual {p0, p1, v0}, Lorg/c/c/a/p;->openConnection(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/HttpURLConnection;

    move-result-object p1

    invoke-virtual {p2}, Lorg/c/c/f;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/c/c/a/p;->prepareConnection(Ljava/net/HttpURLConnection;Ljava/lang/String;)V

    iget-boolean p2, p0, Lorg/c/c/a/p;->bufferRequestBody:Z

    if-eqz p2, :cond_0

    new-instance p2, Lorg/c/c/a/o;

    invoke-direct {p2, p1}, Lorg/c/c/a/o;-><init>(Ljava/net/HttpURLConnection;)V

    return-object p2

    :cond_0
    new-instance p2, Lorg/c/c/a/r;

    iget v0, p0, Lorg/c/c/a/p;->chunkSize:I

    invoke-direct {p2, p1, v0}, Lorg/c/c/a/r;-><init>(Ljava/net/HttpURLConnection;I)V

    return-object p2
.end method

.method protected openConnection(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/HttpURLConnection;
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    :goto_0
    const-class p2, Ljava/net/HttpURLConnection;

    invoke-static {p2, p1}, Lorg/c/e/a;->a(Ljava/lang/Class;Ljava/lang/Object;)V

    check-cast p1, Ljava/net/HttpURLConnection;

    return-object p1
.end method

.method protected prepareConnection(Ljava/net/HttpURLConnection;Ljava/lang/String;)V
    .locals 3

    iget v0, p0, Lorg/c/c/a/p;->connectTimeout:I

    if-ltz v0, :cond_0

    iget v0, p0, Lorg/c/c/a/p;->connectTimeout:I

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    :cond_0
    iget v0, p0, Lorg/c/c/a/p;->readTimeout:I

    if-ltz v0, :cond_1

    iget v0, p0, Lorg/c/c/a/p;->readTimeout:I

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    const-string v1, "GET"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v2}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    :goto_0
    const-string v1, "PUT"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "POST"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1, v2}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    goto :goto_2

    :cond_4
    :goto_1
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    :goto_2
    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    return-void
.end method

.method public setBufferRequestBody(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/c/c/a/p;->bufferRequestBody:Z

    return-void
.end method

.method public setChunkSize(I)V
    .locals 0

    iput p1, p0, Lorg/c/c/a/p;->chunkSize:I

    return-void
.end method

.method public setConnectTimeout(I)V
    .locals 0

    iput p1, p0, Lorg/c/c/a/p;->connectTimeout:I

    return-void
.end method

.method public setProxy(Ljava/net/Proxy;)V
    .locals 0

    iput-object p1, p0, Lorg/c/c/a/p;->proxy:Ljava/net/Proxy;

    return-void
.end method

.method public setReadTimeout(I)V
    .locals 0

    iput p1, p0, Lorg/c/c/a/p;->readTimeout:I

    return-void
.end method
