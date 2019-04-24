.class final Lorg/b/a/b/l;
.super Lorg/b/a/c/b;


# instance fields
.field private final a:Lorg/b/a/b/c;


# direct methods
.method constructor <init>(Lorg/b/a/b/c;)V
    .locals 1

    invoke-static {}, Lorg/b/a/d;->w()Lorg/b/a/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/b/a/c/b;-><init>(Lorg/b/a/d;)V

    iput-object p1, p0, Lorg/b/a/b/l;->a:Lorg/b/a/b/c;

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/l;->a:Lorg/b/a/b/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/b/c;->a(J)I

    move-result p1

    if-gtz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public a(Ljava/util/Locale;)I
    .locals 0

    invoke-static {p1}, Lorg/b/a/b/m;->a(Ljava/util/Locale;)Lorg/b/a/b/m;

    move-result-object p1

    invoke-virtual {p1}, Lorg/b/a/b/m;->a()I

    move-result p1

    return p1
.end method

.method public a(JLjava/lang/String;Ljava/util/Locale;)J
    .locals 0

    invoke-static {p4}, Lorg/b/a/b/m;->a(Ljava/util/Locale;)Lorg/b/a/b/m;

    move-result-object p4

    invoke-virtual {p4, p3}, Lorg/b/a/b/m;->a(Ljava/lang/String;)I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lorg/b/a/b/l;->b(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(ILjava/util/Locale;)Ljava/lang/String;
    .locals 0

    invoke-static {p2}, Lorg/b/a/b/m;->a(Ljava/util/Locale;)Lorg/b/a/b/m;

    move-result-object p2

    invoke-virtual {p2, p1}, Lorg/b/a/b/m;->a(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(JI)J
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, p3, v0, v1}, Lorg/b/a/c/g;->a(Lorg/b/a/c;III)V

    invoke-virtual {p0, p1, p2}, Lorg/b/a/b/l;->a(J)I

    move-result v0

    if-eq v0, p3, :cond_0

    iget-object p3, p0, Lorg/b/a/b/l;->a:Lorg/b/a/b/c;

    invoke-virtual {p3, p1, p2}, Lorg/b/a/b/c;->a(J)I

    move-result p3

    iget-object v0, p0, Lorg/b/a/b/l;->a:Lorg/b/a/b/c;

    neg-int p3, p3

    invoke-virtual {v0, p1, p2, p3}, Lorg/b/a/b/c;->f(JI)J

    move-result-wide p1

    :cond_0
    return-wide p1
.end method

.method public d(J)J
    .locals 2

    invoke-virtual {p0, p1, p2}, Lorg/b/a/b/l;->a(J)I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lorg/b/a/b/l;->a:Lorg/b/a/b/c;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1, p2}, Lorg/b/a/b/c;->f(JI)J

    move-result-wide p1

    return-wide p1

    :cond_0
    const-wide/high16 p1, -0x8000000000000000L

    return-wide p1
.end method

.method public d()Lorg/b/a/g;
    .locals 1

    invoke-static {}, Lorg/b/a/h;->l()Lorg/b/a/h;

    move-result-object v0

    invoke-static {v0}, Lorg/b/a/c/q;->a(Lorg/b/a/h;)Lorg/b/a/c/q;

    move-result-object v0

    return-object v0
.end method

.method public e(J)J
    .locals 2

    invoke-virtual {p0, p1, p2}, Lorg/b/a/b/l;->a(J)I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lorg/b/a/b/l;->a:Lorg/b/a/b/c;

    const-wide/16 v0, 0x0

    const/4 p2, 0x1

    invoke-virtual {p1, v0, v1, p2}, Lorg/b/a/b/c;->f(JI)J

    move-result-wide p1

    return-wide p1

    :cond_0
    const-wide p1, 0x7fffffffffffffffL

    return-wide p1
.end method

.method public e()Lorg/b/a/g;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public f(J)J
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/b/a/b/l;->d(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public g()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g(J)J
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/b/a/b/l;->d(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public h()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public h(J)J
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/b/a/b/l;->d(J)J

    move-result-wide p1

    return-wide p1
.end method
