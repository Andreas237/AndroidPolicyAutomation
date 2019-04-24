.class public abstract Lorg/c/c/a/b;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/c/a/e;


# instance fields
.field private final a:Lorg/c/c/c;

.field private b:Z

.field private c:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/c/c/c;

    invoke-direct {v0}, Lorg/c/c/c;-><init>()V

    iput-object v0, p0, Lorg/c/c/a/b;->a:Lorg/c/c/c;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/c/c/a/b;->b:Z

    return-void
.end method

.method private a(Ljava/io/OutputStream;)Ljava/io/OutputStream;
    .locals 1

    iget-object v0, p0, Lorg/c/c/a/b;->c:Ljava/io/OutputStream;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v0, p1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object v0, p0, Lorg/c/c/a/b;->c:Ljava/io/OutputStream;

    :cond_0
    iget-object p1, p0, Lorg/c/c/a/b;->c:Ljava/io/OutputStream;

    return-object p1
.end method

.method private c()V
    .locals 2

    iget-boolean v0, p0, Lorg/c/c/a/b;->b:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "ClientHttpRequest already executed"

    invoke-static {v0, v1}, Lorg/c/e/a;->b(ZLjava/lang/String;)V

    return-void
.end method

.method private d()Z
    .locals 3

    iget-object v0, p0, Lorg/c/c/a/b;->a:Lorg/c/c/c;

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
.method public final a()Ljava/io/OutputStream;
    .locals 2

    invoke-direct {p0}, Lorg/c/c/a/b;->c()V

    iget-object v0, p0, Lorg/c/c/a/b;->a:Lorg/c/c/c;

    invoke-virtual {p0, v0}, Lorg/c/c/a/b;->a(Lorg/c/c/c;)Ljava/io/OutputStream;

    move-result-object v0

    invoke-direct {p0}, Lorg/c/c/a/b;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lorg/c/c/a/b;->a(Ljava/io/OutputStream;)Ljava/io/OutputStream;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method protected abstract a(Lorg/c/c/c;)Ljava/io/OutputStream;
.end method

.method public final b()Lorg/c/c/a/i;
    .locals 2

    invoke-direct {p0}, Lorg/c/c/a/b;->c()V

    iget-object v0, p0, Lorg/c/c/a/b;->c:Ljava/io/OutputStream;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/c/c/a/b;->c:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    :cond_0
    iget-object v0, p0, Lorg/c/c/a/b;->a:Lorg/c/c/c;

    invoke-virtual {p0, v0}, Lorg/c/c/a/b;->b(Lorg/c/c/c;)Lorg/c/c/a/i;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lorg/c/c/a/b;->b:Z

    return-object v0
.end method

.method protected abstract b(Lorg/c/c/c;)Lorg/c/c/a/i;
.end method

.method public final getHeaders()Lorg/c/c/c;
    .locals 1

    iget-boolean v0, p0, Lorg/c/c/a/b;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/c/c/a/b;->a:Lorg/c/c/c;

    invoke-static {v0}, Lorg/c/c/c;->a(Lorg/c/c/c;)Lorg/c/c/c;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/c/c/a/b;->a:Lorg/c/c/c;

    return-object v0
.end method
