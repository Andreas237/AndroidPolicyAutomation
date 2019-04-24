.class final Lorg/b/a/b/h;
.super Lorg/b/a/c/l;


# instance fields
.field private final b:Lorg/b/a/b/c;


# direct methods
.method constructor <init>(Lorg/b/a/b/c;Lorg/b/a/g;)V
    .locals 1

    invoke-static {}, Lorg/b/a/d;->o()Lorg/b/a/d;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lorg/b/a/c/l;-><init>(Lorg/b/a/d;Lorg/b/a/g;)V

    iput-object p1, p0, Lorg/b/a/b/h;->b:Lorg/b/a/b/c;

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/h;->b:Lorg/b/a/b/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/b/c;->f(J)I

    move-result p1

    return p1
.end method

.method public c(J)I
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/h;->b:Lorg/b/a/b/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/b/c;->e(J)I

    move-result p1

    iget-object p2, p0, Lorg/b/a/b/h;->b:Lorg/b/a/b/c;

    invoke-virtual {p2, p1}, Lorg/b/a/b/c;->b(I)I

    move-result p1

    return p1
.end method

.method protected d(JI)I
    .locals 1

    const/16 v0, 0x34

    if-le p3, v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lorg/b/a/b/h;->c(J)I

    move-result v0

    :cond_0
    return v0
.end method

.method public d(J)J
    .locals 2

    const-wide/32 v0, 0xf731400

    add-long/2addr p1, v0

    invoke-super {p0, p1, p2}, Lorg/b/a/c/l;->d(J)J

    move-result-wide p1

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public e(J)J
    .locals 2

    const-wide/32 v0, 0xf731400

    add-long/2addr p1, v0

    invoke-super {p0, p1, p2}, Lorg/b/a/c/l;->e(J)J

    move-result-wide p1

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public e()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/h;->b:Lorg/b/a/b/c;

    invoke-virtual {v0}, Lorg/b/a/b/c;->y()Lorg/b/a/g;

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

    const/16 v0, 0x35

    return v0
.end method

.method public i(J)J
    .locals 2

    const-wide/32 v0, 0xf731400

    add-long/2addr p1, v0

    invoke-super {p0, p1, p2}, Lorg/b/a/c/l;->i(J)J

    move-result-wide p1

    return-wide p1
.end method
