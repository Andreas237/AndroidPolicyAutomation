.class final Lorg/c/c/a/l;
.super Lorg/c/c/a/d;


# instance fields
.field private final a:Lorg/apache/http/HttpResponse;

.field private b:Lorg/c/c/c;


# direct methods
.method constructor <init>(Lorg/apache/http/HttpResponse;)V
    .locals 0

    invoke-direct {p0}, Lorg/c/c/a/d;-><init>()V

    iput-object p1, p0, Lorg/c/c/a/l;->a:Lorg/apache/http/HttpResponse;

    return-void
.end method


# virtual methods
.method protected d()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lorg/c/c/a/l;->a:Lorg/apache/http/HttpResponse;

    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected e()V
    .locals 1

    iget-object v0, p0, Lorg/c/c/a/l;->a:Lorg/apache/http/HttpResponse;

    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, Lorg/c/c/a/l;->a:Lorg/apache/http/HttpResponse;

    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v0

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/c/c/a/l;->a:Lorg/apache/http/HttpResponse;

    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHeaders()Lorg/c/c/c;
    .locals 6

    iget-object v0, p0, Lorg/c/c/a/l;->b:Lorg/c/c/c;

    if-nez v0, :cond_0

    new-instance v0, Lorg/c/c/c;

    invoke-direct {v0}, Lorg/c/c/c;-><init>()V

    iput-object v0, p0, Lorg/c/c/a/l;->b:Lorg/c/c/c;

    iget-object v0, p0, Lorg/c/c/a/l;->a:Lorg/apache/http/HttpResponse;

    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    iget-object v4, p0, Lorg/c/c/a/l;->b:Lorg/c/c/c;

    invoke-interface {v3}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v5, v3}, Lorg/c/c/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/c/c/a/l;->b:Lorg/c/c/c;

    return-object v0
.end method
