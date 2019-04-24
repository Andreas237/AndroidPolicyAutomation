.class public abstract Lorg/c/c/a/d;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/c/a/i;


# instance fields
.field private a:Ljava/io/InputStream;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lorg/c/c/a/d;->a:Ljava/io/InputStream;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v0, p1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lorg/c/c/a/d;->a:Ljava/io/InputStream;

    :cond_0
    iget-object p1, p0, Lorg/c/c/a/d;->a:Ljava/io/InputStream;

    return-object p1
.end method

.method private h()Z
    .locals 3

    invoke-virtual {p0}, Lorg/c/c/a/d;->getHeaders()Lorg/c/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/c/c/c;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/c/c/a;

    sget-object v2, Lorg/c/c/a;->c:Lorg/c/c/a;

    invoke-virtual {v1, v2}, Lorg/c/c/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()Ljava/io/InputStream;
    .locals 2

    invoke-virtual {p0}, Lorg/c/c/a/d;->d()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {p0}, Lorg/c/c/a/d;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lorg/c/c/a/d;->a(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public b()Lorg/c/c/i;
    .locals 1

    invoke-virtual {p0}, Lorg/c/c/a/d;->f()I

    move-result v0

    invoke-static {v0}, Lorg/c/c/i;->valueOf(I)Lorg/c/c/i;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lorg/c/c/a/d;->a:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lorg/c/c/a/d;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    invoke-virtual {p0}, Lorg/c/c/a/d;->e()V

    return-void
.end method

.method protected abstract d()Ljava/io/InputStream;
.end method

.method protected abstract e()V
.end method
