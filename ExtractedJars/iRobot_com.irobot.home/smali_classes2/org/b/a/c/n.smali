.class public Lorg/b/a/c/n;
.super Lorg/b/a/c/d;


# instance fields
.field final a:I

.field final b:Lorg/b/a/g;

.field final c:Lorg/b/a/g;


# direct methods
.method public constructor <init>(Lorg/b/a/c/f;)V
    .locals 1

    invoke-virtual {p1}, Lorg/b/a/c/f;->a()Lorg/b/a/d;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/b/a/c/n;-><init>(Lorg/b/a/c/f;Lorg/b/a/d;)V

    return-void
.end method

.method public constructor <init>(Lorg/b/a/c/f;Lorg/b/a/d;)V
    .locals 1

    invoke-virtual {p1}, Lorg/b/a/c/f;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/c;->d()Lorg/b/a/g;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lorg/b/a/c/n;-><init>(Lorg/b/a/c/f;Lorg/b/a/g;Lorg/b/a/d;)V

    return-void
.end method

.method public constructor <init>(Lorg/b/a/c/f;Lorg/b/a/g;Lorg/b/a/d;)V
    .locals 1

    invoke-virtual {p1}, Lorg/b/a/c/f;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-direct {p0, v0, p3}, Lorg/b/a/c/d;-><init>(Lorg/b/a/c;Lorg/b/a/d;)V

    iget p3, p1, Lorg/b/a/c/f;->a:I

    iput p3, p0, Lorg/b/a/c/n;->a:I

    iput-object p2, p0, Lorg/b/a/c/n;->b:Lorg/b/a/g;

    iget-object p1, p1, Lorg/b/a/c/f;->b:Lorg/b/a/g;

    iput-object p1, p0, Lorg/b/a/c/n;->c:Lorg/b/a/g;

    return-void
.end method

.method public constructor <init>(Lorg/b/a/c;Lorg/b/a/g;Lorg/b/a/d;I)V
    .locals 0

    invoke-direct {p0, p1, p3}, Lorg/b/a/c/d;-><init>(Lorg/b/a/c;Lorg/b/a/d;)V

    const/4 p3, 0x2

    if-ge p4, p3, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The divisor must be at least 2"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iput-object p2, p0, Lorg/b/a/c/n;->c:Lorg/b/a/g;

    invoke-virtual {p1}, Lorg/b/a/c;->d()Lorg/b/a/g;

    move-result-object p1

    iput-object p1, p0, Lorg/b/a/c/n;->b:Lorg/b/a/g;

    iput p4, p0, Lorg/b/a/c/n;->a:I

    return-void
.end method

.method private a(I)I
    .locals 1

    if-ltz p1, :cond_0

    iget v0, p0, Lorg/b/a/c/n;->a:I

    div-int/2addr p1, v0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    iget v0, p0, Lorg/b/a/c/n;->a:I

    div-int/2addr p1, v0

    add-int/lit8 p1, p1, -0x1

    return p1
.end method


# virtual methods
.method public a(J)I
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/n;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->a(J)I

    move-result p1

    if-ltz p1, :cond_0

    iget p2, p0, Lorg/b/a/c/n;->a:I

    rem-int/2addr p1, p2

    return p1

    :cond_0
    iget p2, p0, Lorg/b/a/c/n;->a:I

    add-int/lit8 p2, p2, -0x1

    add-int/lit8 p1, p1, 0x1

    iget v0, p0, Lorg/b/a/c/n;->a:I

    rem-int/2addr p1, v0

    add-int/2addr p2, p1

    return p2
.end method

.method public b(JI)J
    .locals 3

    iget v0, p0, Lorg/b/a/c/n;->a:I

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-static {p0, p3, v1, v0}, Lorg/b/a/c/g;->a(Lorg/b/a/c;III)V

    invoke-virtual {p0}, Lorg/b/a/c/n;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->a(J)I

    move-result v0

    invoke-direct {p0, v0}, Lorg/b/a/c/n;->a(I)I

    move-result v0

    invoke-virtual {p0}, Lorg/b/a/c/n;->i()Lorg/b/a/c;

    move-result-object v1

    iget v2, p0, Lorg/b/a/c/n;->a:I

    mul-int v0, v0, v2

    add-int/2addr v0, p3

    invoke-virtual {v1, p1, p2, v0}, Lorg/b/a/c;->b(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public d(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/n;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->d(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public d()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/n;->b:Lorg/b/a/g;

    return-object v0
.end method

.method public e(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/n;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->e(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public e()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/n;->c:Lorg/b/a/g;

    return-object v0
.end method

.method public f(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/n;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->f(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public g()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/n;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->g(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lorg/b/a/c/n;->a:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public h(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/n;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->h(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public i(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/c/n;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->i(J)J

    move-result-wide p1

    return-wide p1
.end method
