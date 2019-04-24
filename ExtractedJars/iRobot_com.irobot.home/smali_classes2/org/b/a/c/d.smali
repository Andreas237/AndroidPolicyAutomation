.class public abstract Lorg/b/a/c/d;
.super Lorg/b/a/c/b;


# instance fields
.field private final a:Lorg/b/a/c;


# direct methods
.method protected constructor <init>(Lorg/b/a/c;Lorg/b/a/d;)V
    .locals 0

    invoke-direct {p0, p2}, Lorg/b/a/c/b;-><init>(Lorg/b/a/d;)V

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The field must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-virtual {p1}, Lorg/b/a/c;->c()Z

    move-result p2

    if-nez p2, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The field must be supported"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput-object p1, p0, Lorg/b/a/c/d;->a:Lorg/b/a/c;

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/d;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->a(J)I

    move-result p1

    return p1
.end method

.method public b(JI)J
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/d;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1, p2, p3}, Lorg/b/a/c;->b(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public d(J)J
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/d;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->d(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public d()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/d;->a:Lorg/b/a/c;

    invoke-virtual {v0}, Lorg/b/a/c;->d()Lorg/b/a/g;

    move-result-object v0

    return-object v0
.end method

.method public e()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/d;->a:Lorg/b/a/c;

    invoke-virtual {v0}, Lorg/b/a/c;->e()Lorg/b/a/g;

    move-result-object v0

    return-object v0
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/d;->a:Lorg/b/a/c;

    invoke-virtual {v0}, Lorg/b/a/c;->g()I

    move-result v0

    return v0
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/d;->a:Lorg/b/a/c;

    invoke-virtual {v0}, Lorg/b/a/c;->h()I

    move-result v0

    return v0
.end method

.method public final i()Lorg/b/a/c;
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/d;->a:Lorg/b/a/c;

    return-object v0
.end method
