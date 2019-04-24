.class final Lorg/c/c/a/j;
.super Lorg/c/c/a/a;


# instance fields
.field private final a:Lorg/apache/http/client/HttpClient;

.field private final b:Lorg/apache/http/client/methods/HttpUriRequest;

.field private final c:Lorg/apache/http/protocol/HttpContext;


# direct methods
.method public constructor <init>(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)V
    .locals 0

    invoke-direct {p0}, Lorg/c/c/a/a;-><init>()V

    iput-object p1, p0, Lorg/c/c/a/j;->a:Lorg/apache/http/client/HttpClient;

    iput-object p2, p0, Lorg/c/c/a/j;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    iput-object p3, p0, Lorg/c/c/a/j;->c:Lorg/apache/http/protocol/HttpContext;

    return-void
.end method


# virtual methods
.method public a(Lorg/c/c/c;[B)Lorg/c/c/a/i;
    .locals 4

    invoke-virtual {p1}, Lorg/c/c/c;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "Content-Length"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "Transfer-Encoding"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lorg/c/c/a/j;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    invoke-interface {v3, v1, v2}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lorg/c/c/a/j;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    instance-of p1, p1, Lorg/apache/http/HttpEntityEnclosingRequest;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lorg/c/c/a/j;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    check-cast p1, Lorg/apache/http/HttpEntityEnclosingRequest;

    new-instance v0, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-direct {v0, p2}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    invoke-interface {p1, v0}, Lorg/apache/http/HttpEntityEnclosingRequest;->setEntity(Lorg/apache/http/HttpEntity;)V

    :cond_2
    iget-object p1, p0, Lorg/c/c/a/j;->a:Lorg/apache/http/client/HttpClient;

    iget-object p2, p0, Lorg/c/c/a/j;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    iget-object v0, p0, Lorg/c/c/a/j;->c:Lorg/apache/http/protocol/HttpContext;

    invoke-interface {p1, p2, v0}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object p1

    new-instance p2, Lorg/c/c/a/l;

    invoke-direct {p2, p1}, Lorg/c/c/a/l;-><init>(Lorg/apache/http/HttpResponse;)V

    return-object p2
.end method

.method public getMethod()Lorg/c/c/f;
    .locals 1

    iget-object v0, p0, Lorg/c/c/a/j;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    invoke-interface {v0}, Lorg/apache/http/client/methods/HttpUriRequest;->getMethod()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/c/c/f;->valueOf(Ljava/lang/String;)Lorg/c/c/f;

    move-result-object v0

    return-object v0
.end method

.method public getURI()Ljava/net/URI;
    .locals 1

    iget-object v0, p0, Lorg/c/c/a/j;->b:Lorg/apache/http/client/methods/HttpUriRequest;

    invoke-interface {v0}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;

    move-result-object v0

    return-object v0
.end method
