.class public Lorg/c/c/b/b;
.super Lorg/c/c/b/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/c/c/b/a<",
        "[B>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Lorg/c/c/j;

    new-instance v1, Lorg/c/c/j;

    const-string v2, "application"

    const-string v3, "octet-stream"

    invoke-direct {v1, v2, v3}, Lorg/c/c/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/j;->a:Lorg/c/c/j;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Lorg/c/c/b/a;-><init>([Lorg/c/c/j;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Ljava/lang/Object;Lorg/c/c/j;)Ljava/lang/Long;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1, p2}, Lorg/c/c/b/b;->a([BLorg/c/c/j;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method protected a([BLorg/c/c/j;)Ljava/lang/Long;
    .locals 0

    array-length p1, p1

    int-to-long p1, p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic a(Ljava/lang/Object;Lorg/c/c/g;)V
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1, p2}, Lorg/c/c/b/b;->a([BLorg/c/c/g;)V

    return-void
.end method

.method protected a([BLorg/c/c/g;)V
    .locals 0

    invoke-interface {p2}, Lorg/c/c/g;->a()Ljava/io/OutputStream;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/c/e/d;->a([BLjava/io/OutputStream;)V

    return-void
.end method

.method public a(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    const-class v0, [B

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public synthetic b(Ljava/lang/Class;Lorg/c/c/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/c/c/b/b;->c(Ljava/lang/Class;Lorg/c/c/d;)[B

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Class;Lorg/c/c/d;)[B
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+[B>;",
            "Lorg/c/c/d;",
            ")[B"
        }
    .end annotation

    invoke-interface {p2}, Lorg/c/c/d;->getHeaders()Lorg/c/c/c;

    move-result-object p1

    invoke-virtual {p1}, Lorg/c/c/c;->b()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-ltz p1, :cond_0

    new-instance p1, Ljava/io/ByteArrayOutputStream;

    long-to-int v0, v0

    invoke-direct {p1, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    invoke-interface {p2}, Lorg/c/c/d;->a()Ljava/io/InputStream;

    move-result-object p2

    invoke-static {p2, p1}, Lorg/c/e/d;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p2}, Lorg/c/c/d;->a()Ljava/io/InputStream;

    move-result-object p1

    invoke-static {p1}, Lorg/c/e/d;->a(Ljava/io/InputStream;)[B

    move-result-object p1

    return-object p1
.end method
