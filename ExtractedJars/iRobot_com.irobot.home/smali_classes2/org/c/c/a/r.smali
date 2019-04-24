.class final Lorg/c/c/a/r;
.super Lorg/c/c/a/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/c/c/a/r$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Boolean;


# instance fields
.field private final b:Ljava/net/HttpURLConnection;

.field private final c:I

.field private d:Ljava/io/OutputStream;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lorg/c/c/a/r;->a:Ljava/lang/Boolean;

    return-void
.end method

.method constructor <init>(Ljava/net/HttpURLConnection;I)V
    .locals 0

    invoke-direct {p0}, Lorg/c/c/a/b;-><init>()V

    iput-object p1, p0, Lorg/c/c/a/r;->b:Ljava/net/HttpURLConnection;

    iput p2, p0, Lorg/c/c/a/r;->c:I

    sget-object p1, Lorg/c/c/a/r;->a:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "http.keepAlive"

    const-string p2, "false"

    invoke-static {p1, p2}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Lorg/c/c/a/r;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Connection"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Keep-Alive"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private c(Lorg/c/c/c;)V
    .locals 4

    invoke-virtual {p1}, Lorg/c/c/c;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {p0, v1, v2}, Lorg/c/c/a/r;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lorg/c/c/a/r;->b:Ljava/net/HttpURLConnection;

    invoke-virtual {v3, v1, v2}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method protected a(Lorg/c/c/c;)Ljava/io/OutputStream;
    .locals 2

    iget-object v0, p0, Lorg/c/c/a/r;->d:Ljava/io/OutputStream;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lorg/c/c/c;->b()J

    move-result-wide v0

    long-to-int v0, v0

    if-ltz v0, :cond_0

    sget-object v1, Lorg/c/c/a/r;->a:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lorg/c/c/a/r;->b:Ljava/net/HttpURLConnection;

    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/c/c/a/r;->b:Ljava/net/HttpURLConnection;

    iget v1, p0, Lorg/c/c/a/r;->c:I

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    :goto_0
    invoke-direct {p0, p1}, Lorg/c/c/a/r;->c(Lorg/c/c/c;)V

    iget-object p1, p0, Lorg/c/c/a/r;->b:Ljava/net/HttpURLConnection;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->connect()V

    iget-object p1, p0, Lorg/c/c/a/r;->b:Ljava/net/HttpURLConnection;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1

    iput-object p1, p0, Lorg/c/c/a/r;->d:Ljava/io/OutputStream;

    :cond_1
    new-instance p1, Lorg/c/c/a/r$a;

    iget-object v0, p0, Lorg/c/c/a/r;->d:Ljava/io/OutputStream;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lorg/c/c/a/r$a;-><init>(Ljava/io/OutputStream;Lorg/c/c/a/r$1;)V

    return-object p1
.end method

.method protected b(Lorg/c/c/c;)Lorg/c/c/a/i;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lorg/c/c/a/r;->d:Ljava/io/OutputStream;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lorg/c/c/a/r;->d:Ljava/io/OutputStream;

    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lorg/c/c/a/r;->c(Lorg/c/c/c;)V

    iget-object p1, p0, Lorg/c/c/a/r;->b:Ljava/net/HttpURLConnection;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->connect()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    new-instance p1, Lorg/c/c/a/q;

    iget-object v0, p0, Lorg/c/c/a/r;->b:Ljava/net/HttpURLConnection;

    invoke-direct {p1, v0}, Lorg/c/c/a/q;-><init>(Ljava/net/HttpURLConnection;)V

    return-object p1
.end method

.method public getMethod()Lorg/c/c/f;
    .locals 1

    iget-object v0, p0, Lorg/c/c/a/r;->b:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/c/c/f;->valueOf(Ljava/lang/String;)Lorg/c/c/f;

    move-result-object v0

    return-object v0
.end method

.method public getURI()Ljava/net/URI;
    .locals 4

    :try_start_0
    iget-object v0, p0, Lorg/c/c/a/r;->b:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->toURI()Ljava/net/URI;

    move-result-object v0
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not get HttpURLConnection URI: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
