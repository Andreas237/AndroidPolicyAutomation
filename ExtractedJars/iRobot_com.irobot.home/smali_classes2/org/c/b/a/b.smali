.class public Lorg/c/b/a/b;
.super Lorg/c/b/a/a;


# instance fields
.field private final a:[B

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>([B)V
    .locals 1

    const-string v0, "resource loaded from byte array"

    invoke-direct {p0, p1, v0}, Lorg/c/b/a/b;-><init>([BLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>([BLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lorg/c/b/a/a;-><init>()V

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Byte array must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iput-object p1, p0, Lorg/c/b/a/b;->a:[B

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const-string p2, ""

    :goto_0
    iput-object p2, p0, Lorg/c/b/a/b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public b()J
    .locals 2

    iget-object v0, p0, Lorg/c/b/a/b;->a:[B

    array-length v0, v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public d()Ljava/io/InputStream;
    .locals 2

    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Lorg/c/b/a/b;->a:[B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/c/b/a/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Lorg/c/b/a/b;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/c/b/a/b;

    iget-object p1, p1, Lorg/c/b/a/b;->a:[B

    iget-object v0, p0, Lorg/c/b/a/b;->a:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 2

    const-class v0, [B

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1d

    iget-object v1, p0, Lorg/c/b/a/b;->a:[B

    array-length v1, v1

    mul-int v0, v0, v1

    return v0
.end method
