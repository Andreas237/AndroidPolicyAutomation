.class public Lorg/c/f/a/a;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/f/a/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(Lorg/c/c/a/i;)[B
    .locals 0

    :try_start_0
    invoke-interface {p1}, Lorg/c/c/a/i;->a()Ljava/io/InputStream;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lorg/c/e/d;->a(Ljava/io/InputStream;)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [B

    return-object p1
.end method


# virtual methods
.method public a(Lorg/c/c/a/i;)Z
    .locals 0

    invoke-interface {p1}, Lorg/c/c/a/i;->b()Lorg/c/c/i;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/c/f/a/a;->a(Lorg/c/c/i;)Z

    move-result p1

    return p1
.end method

.method protected a(Lorg/c/c/i;)Z
    .locals 2

    invoke-virtual {p1}, Lorg/c/c/i;->series()Lorg/c/c/i$a;

    move-result-object v0

    sget-object v1, Lorg/c/c/i$a;->CLIENT_ERROR:Lorg/c/c/i$a;

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lorg/c/c/i;->series()Lorg/c/c/i$a;

    move-result-object p1

    sget-object v0, Lorg/c/c/i$a;->SERVER_ERROR:Lorg/c/c/i$a;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public b(Lorg/c/c/a/i;)V
    .locals 5

    invoke-interface {p1}, Lorg/c/c/a/i;->b()Lorg/c/c/i;

    move-result-object v0

    invoke-interface {p1}, Lorg/c/c/a/i;->getHeaders()Lorg/c/c/c;

    move-result-object v1

    invoke-virtual {v1}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/c/c/j;->e()Ljava/nio/charset/Charset;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {p0, p1}, Lorg/c/f/a/a;->c(Lorg/c/c/a/i;)[B

    move-result-object v2

    sget-object v3, Lorg/c/f/a/a$1;->a:[I

    invoke-virtual {v0}, Lorg/c/c/i;->series()Lorg/c/c/i$a;

    move-result-object v4

    invoke-virtual {v4}, Lorg/c/c/i$a;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    new-instance p1, Lorg/c/f/a/j;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown status code ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/c/f/a/j;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance v3, Lorg/c/f/a/d;

    invoke-interface {p1}, Lorg/c/c/a/i;->g()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, v0, p1, v2, v1}, Lorg/c/f/a/d;-><init>(Lorg/c/c/i;Ljava/lang/String;[BLjava/nio/charset/Charset;)V

    throw v3

    :pswitch_1
    new-instance v3, Lorg/c/f/a/b;

    invoke-interface {p1}, Lorg/c/c/a/i;->g()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, v0, p1, v2, v1}, Lorg/c/f/a/b;-><init>(Lorg/c/c/i;Ljava/lang/String;[BLjava/nio/charset/Charset;)V

    throw v3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
