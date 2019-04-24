.class final Lorg/b/a/b/d;
.super Lorg/b/a/c/l;


# instance fields
.field private final b:Lorg/b/a/b/c;


# direct methods
.method constructor <init>(Lorg/b/a/b/c;Lorg/b/a/g;)V
    .locals 1

    invoke-static {}, Lorg/b/a/d;->m()Lorg/b/a/d;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lorg/b/a/c/l;-><init>(Lorg/b/a/d;Lorg/b/a/g;)V

    iput-object p1, p0, Lorg/b/a/b/d;->b:Lorg/b/a/b/c;

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/d;->b:Lorg/b/a/b/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/b/c;->c(J)I

    move-result p1

    return p1
.end method

.method public b(J)Z
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/d;->b:Lorg/b/a/b/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/b/c;->j(J)Z

    move-result p1

    return p1
.end method

.method public c(J)I
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/d;->b:Lorg/b/a/b/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/b/c;->i(J)I

    move-result p1

    return p1
.end method

.method protected d(JI)I
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/d;->b:Lorg/b/a/b/c;

    invoke-virtual {v0, p1, p2, p3}, Lorg/b/a/b/c;->e(JI)I

    move-result p1

    return p1
.end method

.method public e()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/d;->b:Lorg/b/a/b/c;

    invoke-virtual {v0}, Lorg/b/a/b/c;->B()Lorg/b/a/g;

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

    iget-object v0, p0, Lorg/b/a/b/d;->b:Lorg/b/a/b/c;

    invoke-virtual {v0}, Lorg/b/a/b/c;->P()I

    move-result v0

    return v0
.end method
