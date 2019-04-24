.class abstract Lorg/c/c/a/a;
.super Lorg/c/c/a/b;


# instance fields
.field private a:Ljava/io/ByteArrayOutputStream;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/c/c/a/b;-><init>()V

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lorg/c/c/a/a;->a:Ljava/io/ByteArrayOutputStream;

    return-void
.end method


# virtual methods
.method protected a(Lorg/c/c/c;)Ljava/io/OutputStream;
    .locals 0

    iget-object p1, p0, Lorg/c/c/a/a;->a:Ljava/io/ByteArrayOutputStream;

    return-object p1
.end method

.method protected abstract a(Lorg/c/c/c;[B)Lorg/c/c/a/i;
.end method

.method protected b(Lorg/c/c/c;)Lorg/c/c/a/i;
    .locals 5

    iget-object v0, p0, Lorg/c/c/a/a;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-virtual {p1}, Lorg/c/c/c;->b()J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    array-length v1, v0

    int-to-long v1, v1

    invoke-virtual {p1, v1, v2}, Lorg/c/c/c;->a(J)V

    :cond_0
    invoke-virtual {p0, p1, v0}, Lorg/c/c/a/a;->a(Lorg/c/c/c;[B)Lorg/c/c/a/i;

    move-result-object p1

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/c/c/a/a;->a:Ljava/io/ByteArrayOutputStream;

    return-object p1
.end method
