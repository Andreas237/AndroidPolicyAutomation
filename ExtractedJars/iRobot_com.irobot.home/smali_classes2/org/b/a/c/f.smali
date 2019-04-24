.class public Lorg/b/a/c/f;
.super Lorg/b/a/c/d;


# instance fields
.field final a:I

.field final b:Lorg/b/a/g;

.field final c:Lorg/b/a/g;

.field private final d:I

.field private final e:I


# direct methods
.method public constructor <init>(Lorg/b/a/c;Lorg/b/a/d;I)V
    .locals 1

    invoke-virtual {p1}, Lorg/b/a/c;->e()Lorg/b/a/g;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2, p3}, Lorg/b/a/c/f;-><init>(Lorg/b/a/c;Lorg/b/a/g;Lorg/b/a/d;I)V

    return-void
.end method

.method public constructor <init>(Lorg/b/a/c;Lorg/b/a/g;Lorg/b/a/d;I)V
    .locals 2

    invoke-direct {p0, p1, p3}, Lorg/b/a/c/d;-><init>(Lorg/b/a/c;Lorg/b/a/d;)V

    const/4 v0, 0x2

    if-ge p4, v0, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The divisor must be at least 2"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-virtual {p1}, Lorg/b/a/c;->d()Lorg/b/a/g;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 p3, 0x0

    iput-object p3, p0, Lorg/b/a/c/f;->b:Lorg/b/a/g;

    goto :goto_0

    :cond_1
    new-instance v1, Lorg/b/a/c/o;

    invoke-virtual {p3}, Lorg/b/a/d;->y()Lorg/b/a/h;

    move-result-object p3

    invoke-direct {v1, v0, p3, p4}, Lorg/b/a/c/o;-><init>(Lorg/b/a/g;Lorg/b/a/h;I)V

    iput-object v1, p0, Lorg/b/a/c/f;->b:Lorg/b/a/g;

    :goto_0
    iput-object p2, p0, Lorg/b/a/c/f;->c:Lorg/b/a/g;

    iput p4, p0, Lorg/b/a/c/f;->a:I

    invoke-virtual {p1}, Lorg/b/a/c;->g()I

    move-result p2

    if-ltz p2, :cond_2

    div-int/2addr p2, p4

    goto :goto_1

    :cond_2
    add-int/lit8 p2, p2, 0x1

    div-int/2addr p2, p4

    add-int/lit8 p2, p2, -0x1

    :goto_1
    invoke-virtual {p1}, Lorg/b/a/c;->h()I

    move-result p1

    if-ltz p1, :cond_3

    div-int/2addr p1, p4

    goto :goto_2

    :cond_3
    add-int/lit8 p1, p1, 0x1

    div-int/2addr p1, p4

    add-int/lit8 p1, p1, -0x1

    :goto_2
    iput p2, p0, Lorg/b/a/c/f;->d:I

    iput p1, p0, Lorg/b/a/c/f;->e:I

    return-void
.end method

.method private a(I)I
    .locals 2

    if-ltz p1, :cond_0

    iget v0, p0, Lorg/b/a/c/f;->a:I

    rem-int/2addr p1, v0

    return p1

    :cond_0
    iget v0, p0, Lorg/b/a/c/f;->a:I

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 p1, p1, 0x1

    iget v1, p0, Lorg/b/a/c/f;->a:I

    rem-int/2addr p1, v1

    add-int/2addr v0, p1

    return v0
.end method


# virtual methods
.method public a(J)I
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/f;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->a(J)I

    move-result p1

    if-ltz p1, :cond_0

    iget p2, p0, Lorg/b/a/c/f;->a:I

    div-int/2addr p1, p2

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    iget p2, p0, Lorg/b/a/c/f;->a:I

    div-int/2addr p1, p2

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public a(JI)J
    .locals 2

    invoke-virtual {p0}, Lorg/b/a/c/f;->i()Lorg/b/a/c;

    move-result-object v0

    iget v1, p0, Lorg/b/a/c/f;->a:I

    mul-int p3, p3, v1

    invoke-virtual {v0, p1, p2, p3}, Lorg/b/a/c;->a(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(JJ)J
    .locals 3

    invoke-virtual {p0}, Lorg/b/a/c/f;->i()Lorg/b/a/c;

    move-result-object v0

    iget v1, p0, Lorg/b/a/c/f;->a:I

    int-to-long v1, v1

    mul-long p3, p3, v1

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/b/a/c;->a(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(JI)J
    .locals 3

    iget v0, p0, Lorg/b/a/c/f;->d:I

    iget v1, p0, Lorg/b/a/c/f;->e:I

    invoke-static {p0, p3, v0, v1}, Lorg/b/a/c/g;->a(Lorg/b/a/c;III)V

    invoke-virtual {p0}, Lorg/b/a/c/f;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->a(J)I

    move-result v0

    invoke-direct {p0, v0}, Lorg/b/a/c/f;->a(I)I

    move-result v0

    invoke-virtual {p0}, Lorg/b/a/c/f;->i()Lorg/b/a/c;

    move-result-object v1

    iget v2, p0, Lorg/b/a/c/f;->a:I

    mul-int p3, p3, v2

    add-int/2addr p3, v0

    invoke-virtual {v1, p1, p2, p3}, Lorg/b/a/c;->b(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public d(J)J
    .locals 3

    invoke-virtual {p0}, Lorg/b/a/c/f;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {p0, p1, p2}, Lorg/b/a/c/f;->a(J)I

    move-result v1

    iget v2, p0, Lorg/b/a/c/f;->a:I

    mul-int v1, v1, v2

    invoke-virtual {v0, p1, p2, v1}, Lorg/b/a/c;->b(JI)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->d(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public d()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/f;->b:Lorg/b/a/g;

    return-object v0
.end method

.method public e()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/f;->c:Lorg/b/a/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/b/a/c/f;->c:Lorg/b/a/g;

    return-object v0

    :cond_0
    invoke-super {p0}, Lorg/b/a/c/d;->e()Lorg/b/a/g;

    move-result-object v0

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lorg/b/a/c/f;->d:I

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lorg/b/a/c/f;->e:I

    return v0
.end method

.method public i(J)J
    .locals 2

    invoke-virtual {p0}, Lorg/b/a/c/f;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->i(J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lorg/b/a/c/f;->a(J)I

    move-result v0

    invoke-virtual {p0, p1, p2, v0}, Lorg/b/a/c/f;->b(JI)J

    move-result-wide p1

    return-wide p1
.end method
