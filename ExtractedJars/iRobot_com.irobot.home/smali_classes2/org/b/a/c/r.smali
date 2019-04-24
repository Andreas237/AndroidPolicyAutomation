.class public final Lorg/b/a/c/r;
.super Lorg/b/a/c/d;


# direct methods
.method public constructor <init>(Lorg/b/a/c;Lorg/b/a/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/b/a/c/d;-><init>(Lorg/b/a/c;Lorg/b/a/d;)V

    invoke-virtual {p1}, Lorg/b/a/c;->g()I

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrapped field\'s minumum value must be zero"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->a(J)I

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lorg/b/a/c/r;->h()I

    move-result p1

    :cond_0
    return p1
.end method

.method public a(JI)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lorg/b/a/c;->a(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(JJ)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/b/a/c;->a(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(JI)J
    .locals 2

    invoke-virtual {p0}, Lorg/b/a/c/r;->h()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p0, p3, v1, v0}, Lorg/b/a/c/g;->a(Lorg/b/a/c;III)V

    if-ne p3, v0, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0}, Lorg/b/a/c/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lorg/b/a/c;->b(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(J)Z
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->b(J)Z

    move-result p1

    return p1
.end method

.method public c(J)I
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->c(J)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public d(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->d(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public e(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->e(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public f(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->f(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public f()Lorg/b/a/g;
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/c;->f()Lorg/b/a/g;

    move-result-object v0

    return-object v0
.end method

.method public g()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->g(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public h()I
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/c;->h()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public h(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->h(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public i(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->i(J)J

    move-result-wide p1

    return-wide p1
.end method
