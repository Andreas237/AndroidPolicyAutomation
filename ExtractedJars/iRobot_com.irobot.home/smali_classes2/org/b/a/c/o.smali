.class public Lorg/b/a/c/o;
.super Lorg/b/a/c/e;


# static fields
.field private static final serialVersionUID:J = -0x2c7b410ef9b08afdL


# instance fields
.field private final a:I


# direct methods
.method public constructor <init>(Lorg/b/a/g;Lorg/b/a/h;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/b/a/c/e;-><init>(Lorg/b/a/g;Lorg/b/a/h;)V

    if-eqz p3, :cond_1

    const/4 p1, 0x1

    if-ne p3, p1, :cond_0

    goto :goto_0

    :cond_0
    iput p3, p0, Lorg/b/a/c/o;->a:I

    return-void

    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The scalar must not be 0 or 1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(JI)J
    .locals 4

    int-to-long v0, p3

    iget p3, p0, Lorg/b/a/c/o;->a:I

    int-to-long v2, p3

    mul-long v0, v0, v2

    invoke-virtual {p0}, Lorg/b/a/c/o;->f()Lorg/b/a/g;

    move-result-object p3

    invoke-virtual {p3, p1, p2, v0, v1}, Lorg/b/a/g;->a(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(JJ)J
    .locals 1

    iget v0, p0, Lorg/b/a/c/o;->a:I

    invoke-static {p3, p4, v0}, Lorg/b/a/c/g;->a(JI)J

    move-result-wide p3

    invoke-virtual {p0}, Lorg/b/a/c/o;->f()Lorg/b/a/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/b/a/g;->a(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public d()J
    .locals 4

    invoke-virtual {p0}, Lorg/b/a/c/o;->f()Lorg/b/a/g;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/g;->d()J

    move-result-wide v0

    iget v2, p0, Lorg/b/a/c/o;->a:I

    int-to-long v2, v2

    mul-long v0, v0, v2

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/b/a/c/o;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lorg/b/a/c/o;

    invoke-virtual {p0}, Lorg/b/a/c/o;->f()Lorg/b/a/g;

    move-result-object v1

    invoke-virtual {p1}, Lorg/b/a/c/o;->f()Lorg/b/a/g;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lorg/b/a/c/o;->a()Lorg/b/a/h;

    move-result-object v1

    invoke-virtual {p1}, Lorg/b/a/c/o;->a()Lorg/b/a/h;

    move-result-object v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Lorg/b/a/c/o;->a:I

    iget p1, p1, Lorg/b/a/c/o;->a:I

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lorg/b/a/c/o;->a:I

    int-to-long v0, v0

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v0, v0

    invoke-virtual {p0}, Lorg/b/a/c/o;->a()Lorg/b/a/h;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lorg/b/a/c/o;->f()Lorg/b/a/g;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
