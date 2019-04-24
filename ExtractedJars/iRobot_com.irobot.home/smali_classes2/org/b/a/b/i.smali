.class final Lorg/b/a/b/i;
.super Lorg/b/a/c/h;


# instance fields
.field private final a:Lorg/b/a/b/c;


# direct methods
.method constructor <init>(Lorg/b/a/b/c;)V
    .locals 3

    invoke-static {}, Lorg/b/a/d;->p()Lorg/b/a/d;

    move-result-object v0

    invoke-virtual {p1}, Lorg/b/a/b/c;->T()J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, Lorg/b/a/c/h;-><init>(Lorg/b/a/d;J)V

    iput-object p1, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/b/c;->e(J)I

    move-result p1

    return p1
.end method

.method public a(JI)J
    .locals 1

    if-nez p3, :cond_0

    return-wide p1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/b/a/b/i;->a(J)I

    move-result v0

    add-int/2addr v0, p3

    invoke-virtual {p0, p1, p2, v0}, Lorg/b/a/b/i;->b(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(JJ)J
    .locals 0

    invoke-static {p3, p4}, Lorg/b/a/c/g;->a(J)I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lorg/b/a/b/i;->a(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(JI)J
    .locals 7

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget-object v1, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    invoke-virtual {v1}, Lorg/b/a/b/c;->Q()I

    move-result v1

    iget-object v2, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    invoke-virtual {v2}, Lorg/b/a/b/c;->R()I

    move-result v2

    invoke-static {p0, v0, v1, v2}, Lorg/b/a/c/g;->a(Lorg/b/a/c;III)V

    invoke-virtual {p0, p1, p2}, Lorg/b/a/b/i;->a(J)I

    move-result v0

    if-ne v0, p3, :cond_0

    return-wide p1

    :cond_0
    iget-object v1, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    invoke-virtual {v1, p1, p2}, Lorg/b/a/b/c;->g(J)I

    move-result v1

    iget-object v2, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    invoke-virtual {v2, v0}, Lorg/b/a/b/c;->b(I)I

    move-result v0

    iget-object v2, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    invoke-virtual {v2, p3}, Lorg/b/a/b/c;->b(I)I

    move-result v2

    if-ge v2, v0, :cond_1

    move v0, v2

    :cond_1
    iget-object v2, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    invoke-virtual {v2, p1, p2}, Lorg/b/a/b/c;->f(J)I

    move-result v2

    if-le v2, v0, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    iget-object v2, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    invoke-virtual {v2, p1, p2, p3}, Lorg/b/a/b/c;->f(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lorg/b/a/b/i;->a(J)I

    move-result v2

    const-wide/32 v3, 0x240c8400

    if-ge v2, p3, :cond_3

    add-long/2addr p1, v3

    goto :goto_1

    :cond_3
    if-le v2, p3, :cond_4

    sub-long/2addr p1, v3

    :cond_4
    :goto_1
    iget-object p3, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    invoke-virtual {p3, p1, p2}, Lorg/b/a/b/c;->f(J)I

    move-result p3

    sub-int/2addr v0, p3

    int-to-long v5, v0

    mul-long v5, v5, v3

    add-long/2addr p1, v5

    iget-object p3, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    invoke-virtual {p3}, Lorg/b/a/b/c;->t()Lorg/b/a/c;

    move-result-object p3

    invoke-virtual {p3, p1, p2, v1}, Lorg/b/a/c;->b(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(J)Z
    .locals 2

    iget-object v0, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    iget-object v1, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    invoke-virtual {v1, p1, p2}, Lorg/b/a/b/c;->e(J)I

    move-result p1

    invoke-virtual {v0, p1}, Lorg/b/a/b/c;->b(I)I

    move-result p1

    const/16 p2, 0x34

    if-le p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public d(J)J
    .locals 4

    iget-object v0, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    invoke-virtual {v0}, Lorg/b/a/b/c;->x()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->d(J)J

    move-result-wide p1

    iget-object v0, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/b/c;->f(J)I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const-wide/32 v2, 0x240c8400

    sub-int/2addr v0, v1

    int-to-long v0, v0

    mul-long v0, v0, v2

    sub-long/2addr p1, v0

    :cond_0
    return-wide p1
.end method

.method public e()Lorg/b/a/g;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public f()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    invoke-virtual {v0}, Lorg/b/a/b/c;->w()Lorg/b/a/g;

    move-result-object v0

    return-object v0
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    invoke-virtual {v0}, Lorg/b/a/b/c;->Q()I

    move-result v0

    return v0
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/i;->a:Lorg/b/a/b/c;

    invoke-virtual {v0}, Lorg/b/a/b/c;->R()I

    move-result v0

    return v0
.end method

.method public i(J)J
    .locals 2

    invoke-virtual {p0, p1, p2}, Lorg/b/a/b/i;->d(J)J

    move-result-wide v0

    sub-long/2addr p1, v0

    return-wide p1
.end method
