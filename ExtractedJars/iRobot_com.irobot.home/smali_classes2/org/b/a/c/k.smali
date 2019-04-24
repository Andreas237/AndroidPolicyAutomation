.class public Lorg/b/a/c/k;
.super Lorg/b/a/c/l;


# instance fields
.field private final b:I

.field private final c:Lorg/b/a/g;


# direct methods
.method public constructor <init>(Lorg/b/a/d;Lorg/b/a/g;Lorg/b/a/g;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lorg/b/a/c/l;-><init>(Lorg/b/a/d;Lorg/b/a/g;)V

    invoke-virtual {p3}, Lorg/b/a/g;->c()Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Range duration field must be precise"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-virtual {p3}, Lorg/b/a/g;->d()J

    move-result-wide p1

    invoke-virtual {p0}, Lorg/b/a/c/k;->i()J

    move-result-wide v0

    div-long/2addr p1, v0

    long-to-int p1, p1

    iput p1, p0, Lorg/b/a/c/k;->b:I

    iget p1, p0, Lorg/b/a/c/k;->b:I

    const/4 p2, 0x2

    if-ge p1, p2, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The effective range must be at least 2"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput-object p3, p0, Lorg/b/a/c/k;->c:Lorg/b/a/g;

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lorg/b/a/c/k;->i()J

    move-result-wide v0

    div-long/2addr p1, v0

    iget v0, p0, Lorg/b/a/c/k;->b:I

    int-to-long v0, v0

    rem-long/2addr p1, v0

    long-to-int p1, p1

    return p1

    :cond_0
    iget v0, p0, Lorg/b/a/c/k;->b:I

    add-int/lit8 v0, v0, -0x1

    const-wide/16 v1, 0x1

    add-long/2addr p1, v1

    invoke-virtual {p0}, Lorg/b/a/c/k;->i()J

    move-result-wide v1

    div-long/2addr p1, v1

    iget v1, p0, Lorg/b/a/c/k;->b:I

    int-to-long v1, v1

    rem-long/2addr p1, v1

    long-to-int p1, p1

    add-int/2addr v0, p1

    return v0
.end method

.method public b(JI)J
    .locals 4

    invoke-virtual {p0}, Lorg/b/a/c/k;->g()I

    move-result v0

    invoke-virtual {p0}, Lorg/b/a/c/k;->h()I

    move-result v1

    invoke-static {p0, p3, v0, v1}, Lorg/b/a/c/g;->a(Lorg/b/a/c;III)V

    invoke-virtual {p0, p1, p2}, Lorg/b/a/c/k;->a(J)I

    move-result v0

    sub-int/2addr p3, v0

    int-to-long v0, p3

    iget-wide v2, p0, Lorg/b/a/c/k;->a:J

    mul-long v0, v0, v2

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public e()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/k;->c:Lorg/b/a/g;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lorg/b/a/c/k;->b:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method
