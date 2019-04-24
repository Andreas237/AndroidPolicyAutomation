.class public Lorg/b/a/c/j;
.super Lorg/b/a/c/d;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(Lorg/b/a/c;I)V
    .locals 7

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lorg/b/a/c;->a()Lorg/b/a/d;

    move-result-object v0

    goto :goto_0

    :goto_1
    const/high16 v5, -0x80000000

    const v6, 0x7fffffff

    move-object v1, p0

    move-object v2, p1

    move v4, p2

    invoke-direct/range {v1 .. v6}, Lorg/b/a/c/j;-><init>(Lorg/b/a/c;Lorg/b/a/d;III)V

    return-void
.end method

.method public constructor <init>(Lorg/b/a/c;Lorg/b/a/d;I)V
    .locals 6

    const/high16 v4, -0x80000000

    const v5, 0x7fffffff

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lorg/b/a/c/j;-><init>(Lorg/b/a/c;Lorg/b/a/d;III)V

    return-void
.end method

.method public constructor <init>(Lorg/b/a/c;Lorg/b/a/d;III)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/b/a/c/d;-><init>(Lorg/b/a/c;Lorg/b/a/d;)V

    if-nez p3, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The offset cannot be zero"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iput p3, p0, Lorg/b/a/c/j;->a:I

    invoke-virtual {p1}, Lorg/b/a/c;->g()I

    move-result p2

    add-int/2addr p2, p3

    if-ge p4, p2, :cond_1

    invoke-virtual {p1}, Lorg/b/a/c;->g()I

    move-result p2

    add-int/2addr p2, p3

    iput p2, p0, Lorg/b/a/c/j;->b:I

    goto :goto_0

    :cond_1
    iput p4, p0, Lorg/b/a/c/j;->b:I

    :goto_0
    invoke-virtual {p1}, Lorg/b/a/c;->h()I

    move-result p2

    add-int/2addr p2, p3

    if-le p5, p2, :cond_2

    invoke-virtual {p1}, Lorg/b/a/c;->h()I

    move-result p1

    add-int/2addr p1, p3

    iput p1, p0, Lorg/b/a/c/j;->c:I

    return-void

    :cond_2
    iput p5, p0, Lorg/b/a/c/j;->c:I

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 0

    invoke-super {p0, p1, p2}, Lorg/b/a/c/d;->a(J)I

    move-result p1

    iget p2, p0, Lorg/b/a/c/j;->a:I

    add-int/2addr p1, p2

    return p1
.end method

.method public a(JI)J
    .locals 2

    invoke-super {p0, p1, p2, p3}, Lorg/b/a/c/d;->a(JI)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lorg/b/a/c/j;->a(J)I

    move-result p3

    iget v0, p0, Lorg/b/a/c/j;->b:I

    iget v1, p0, Lorg/b/a/c/j;->c:I

    invoke-static {p0, p3, v0, v1}, Lorg/b/a/c/g;->a(Lorg/b/a/c;III)V

    return-wide p1
.end method

.method public a(JJ)J
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Lorg/b/a/c/d;->a(JJ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lorg/b/a/c/j;->a(J)I

    move-result p3

    iget p4, p0, Lorg/b/a/c/j;->b:I

    iget v0, p0, Lorg/b/a/c/j;->c:I

    invoke-static {p0, p3, p4, v0}, Lorg/b/a/c/g;->a(Lorg/b/a/c;III)V

    return-wide p1
.end method

.method public b(JI)J
    .locals 2

    iget v0, p0, Lorg/b/a/c/j;->b:I

    iget v1, p0, Lorg/b/a/c/j;->c:I

    invoke-static {p0, p3, v0, v1}, Lorg/b/a/c/g;->a(Lorg/b/a/c;III)V

    iget v0, p0, Lorg/b/a/c/j;->a:I

    sub-int/2addr p3, v0

    invoke-super {p0, p1, p2, p3}, Lorg/b/a/c/d;->b(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(J)Z
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/j;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->b(J)Z

    move-result p1

    return p1
.end method

.method public d(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/j;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->d(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public e(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/j;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->e(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public f(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/j;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->f(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public f()Lorg/b/a/g;
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/j;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/c;->f()Lorg/b/a/g;

    move-result-object v0

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lorg/b/a/c/j;->b:I

    return v0
.end method

.method public g(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/j;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->g(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lorg/b/a/c/j;->c:I

    return v0
.end method

.method public h(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/j;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->h(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public i(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/j;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->i(J)J

    move-result-wide p1

    return-wide p1
.end method
