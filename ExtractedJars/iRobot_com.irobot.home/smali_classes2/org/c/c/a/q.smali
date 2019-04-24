.class final Lorg/c/c/a/q;
.super Lorg/c/c/a/d;


# instance fields
.field private final a:Ljava/net/HttpURLConnection;

.field private b:Lorg/c/c/c;


# direct methods
.method constructor <init>(Ljava/net/HttpURLConnection;)V
    .locals 0

    invoke-direct {p0}, Lorg/c/c/a/d;-><init>()V

    iput-object p1, p0, Lorg/c/c/a/q;->a:Ljava/net/HttpURLConnection;

    return-void
.end method

.method private a(Ljava/io/IOException;)I
    .locals 2

    const-string v0, "Received authentication challenge is null"

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "No authentication challenges found"

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lorg/c/c/i;->PROXY_AUTHENTICATION_REQUIRED:Lorg/c/c/i;

    :goto_0
    invoke-virtual {p1}, Lorg/c/c/i;->value()I

    move-result p1

    return p1

    :cond_1
    throw p1

    :cond_2
    :goto_1
    sget-object p1, Lorg/c/c/i;->UNAUTHORIZED:Lorg/c/c/i;

    goto :goto_0
.end method


# virtual methods
.method public b()Lorg/c/c/i;
    .locals 1

    invoke-virtual {p0}, Lorg/c/c/a/q;->f()I

    move-result v0

    invoke-static {v0}, Lorg/c/c/i;->valueOf(I)Lorg/c/c/i;

    move-result-object v0

    return-object v0
.end method

.method protected d()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lorg/c/c/a/q;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/c/c/a/q;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method protected e()V
    .locals 1

    iget-object v0, p0, Lorg/c/c/a/q;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    return-void
.end method

.method public f()I
    .locals 1

    :try_start_0
    iget-object v0, p0, Lorg/c/c/a/q;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lorg/c/c/a/q;->a(Ljava/io/IOException;)I

    move-result v0

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lorg/c/c/a/q;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, Lorg/c/c/a/q;->a(Ljava/io/IOException;)I

    move-result v0

    invoke-static {v0}, Lorg/c/c/i;->valueOf(I)Lorg/c/c/i;

    move-result-object v0

    invoke-virtual {v0}, Lorg/c/c/i;->getReasonPhrase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHeaders()Lorg/c/c/c;
    .locals 4

    iget-object v0, p0, Lorg/c/c/a/q;->b:Lorg/c/c/c;

    if-nez v0, :cond_2

    new-instance v0, Lorg/c/c/c;

    invoke-direct {v0}, Lorg/c/c/c;-><init>()V

    iput-object v0, p0, Lorg/c/c/a/q;->b:Lorg/c/c/c;

    iget-object v0, p0, Lorg/c/c/a/q;->a:Ljava/net/HttpURLConnection;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->getHeaderFieldKey(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/c/e/i;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lorg/c/c/a/q;->b:Lorg/c/c/c;

    iget-object v3, p0, Lorg/c/c/a/q;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v3, v1}, Ljava/net/HttpURLConnection;->getHeaderField(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/c/c/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lorg/c/c/a/q;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->getHeaderFieldKey(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/c/e/i;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lorg/c/c/a/q;->b:Lorg/c/c/c;

    iget-object v3, p0, Lorg/c/c/a/q;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->getHeaderField(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lorg/c/c/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v0, p0, Lorg/c/c/a/q;->b:Lorg/c/c/c;

    return-object v0
.end method
