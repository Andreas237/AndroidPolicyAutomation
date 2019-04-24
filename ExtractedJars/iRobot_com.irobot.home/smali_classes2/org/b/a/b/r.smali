.class Lorg/b/a/b/r;
.super Lorg/b/a/c/d;


# static fields
.field static final a:Lorg/b/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/b/a/b/r;

    invoke-direct {v0}, Lorg/b/a/b/r;-><init>()V

    sput-object v0, Lorg/b/a/b/r;->a:Lorg/b/a/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-static {}, Lorg/b/a/b/p;->Z()Lorg/b/a/b/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/b/p;->E()Lorg/b/a/c;

    move-result-object v0

    invoke-static {}, Lorg/b/a/d;->t()Lorg/b/a/d;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lorg/b/a/c/d;-><init>(Lorg/b/a/c;Lorg/b/a/d;)V

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/b/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->a(J)I

    move-result p1

    if-gez p1, :cond_0

    neg-int p1, p1

    :cond_0
    return p1
.end method

.method public a(JI)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/b/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lorg/b/a/c;->a(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(JJ)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/b/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/b/a/c;->a(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(JI)J
    .locals 2

    invoke-virtual {p0}, Lorg/b/a/b/r;->h()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, p3, v1, v0}, Lorg/b/a/c/g;->a(Lorg/b/a/c;III)V

    invoke-virtual {p0}, Lorg/b/a/b/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->a(J)I

    move-result v0

    if-gez v0, :cond_0

    neg-int p3, p3

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lorg/b/a/c/d;->b(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public d(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/b/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->d(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public e(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/b/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->e(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public e()Lorg/b/a/g;
    .locals 1

    invoke-static {}, Lorg/b/a/b/p;->Z()Lorg/b/a/b/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/b/p;->J()Lorg/b/a/g;

    move-result-object v0

    return-object v0
.end method

.method public g()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public h()I
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/b/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/c;->h()I

    move-result v0

    return v0
.end method

.method public i(J)J
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/b/r;->i()Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->i(J)J

    move-result-wide p1

    return-wide p1
.end method
