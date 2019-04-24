.class final Lorg/b/a/b/o;
.super Lorg/b/a/c/d;


# instance fields
.field private final a:Lorg/b/a/b/c;


# direct methods
.method constructor <init>(Lorg/b/a/c;Lorg/b/a/b/c;)V
    .locals 1

    invoke-static {}, Lorg/b/a/d;->t()Lorg/b/a/d;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/b/a/c/d;-><init>(Lorg/b/a/c;Lorg/b/a/d;)V

    iput-object p2, p0, Lorg/b/a/b/o;->a:Lorg/b/a/b/c;

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/b/o;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->a(J)I

    move-result p1

    if-gtz p1, :cond_0

    rsub-int/lit8 p1, p1, 0x1

    :cond_0
    return p1
.end method

.method public a(JI)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/b/o;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lorg/b/a/c;->a(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(JJ)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/b/o;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/b/a/c;->a(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(JI)J
    .locals 2

    invoke-virtual {p0}, Lorg/b/a/b/o;->h()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p0, p3, v1, v0}, Lorg/b/a/c/g;->a(Lorg/b/a/c;III)V

    iget-object v0, p0, Lorg/b/a/b/o;->a:Lorg/b/a/b/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/b/c;->a(J)I

    move-result v0

    if-gtz v0, :cond_0

    rsub-int/lit8 p3, p3, 0x1

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lorg/b/a/c/d;->b(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public d(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/b/o;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->d(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public e(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/b/o;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->e(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public e()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/o;->a:Lorg/b/a/b/c;

    invoke-virtual {v0}, Lorg/b/a/b/c;->J()Lorg/b/a/g;

    move-result-object v0

    return-object v0
.end method

.method public g()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public h()I
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/b/o;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/c;->h()I

    move-result v0

    return v0
.end method

.method public i(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/b/o;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->i(J)J

    move-result-wide p1

    return-wide p1
.end method
