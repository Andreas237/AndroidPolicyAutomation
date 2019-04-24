.class final Lorg/b/a/b/k;
.super Lorg/b/a/c/l;


# instance fields
.field private final b:Lorg/b/a/b/c;


# direct methods
.method constructor <init>(Lorg/b/a/b/c;Lorg/b/a/g;)V
    .locals 1

    invoke-static {}, Lorg/b/a/d;->l()Lorg/b/a/d;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lorg/b/a/c/l;-><init>(Lorg/b/a/d;Lorg/b/a/g;)V

    iput-object p1, p0, Lorg/b/a/b/k;->b:Lorg/b/a/b/c;

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/k;->b:Lorg/b/a/b/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/b/c;->g(J)I

    move-result p1

    return p1
.end method

.method protected a(Ljava/lang/String;Ljava/util/Locale;)I
    .locals 0

    invoke-static {p2}, Lorg/b/a/b/m;->a(Ljava/util/Locale;)Lorg/b/a/b/m;

    move-result-object p2

    invoke-virtual {p2, p1}, Lorg/b/a/b/m;->c(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public a(Ljava/util/Locale;)I
    .locals 0

    invoke-static {p1}, Lorg/b/a/b/m;->a(Ljava/util/Locale;)Lorg/b/a/b/m;

    move-result-object p1

    invoke-virtual {p1}, Lorg/b/a/b/m;->c()I

    move-result p1

    return p1
.end method

.method public a(ILjava/util/Locale;)Ljava/lang/String;
    .locals 0

    invoke-static {p2}, Lorg/b/a/b/m;->a(Ljava/util/Locale;)Lorg/b/a/b/m;

    move-result-object p2

    invoke-virtual {p2, p1}, Lorg/b/a/b/m;->d(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(ILjava/util/Locale;)Ljava/lang/String;
    .locals 0

    invoke-static {p2}, Lorg/b/a/b/m;->a(Ljava/util/Locale;)Lorg/b/a/b/m;

    move-result-object p2

    invoke-virtual {p2, p1}, Lorg/b/a/b/m;->e(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/b/k;->b:Lorg/b/a/b/c;

    invoke-virtual {v0}, Lorg/b/a/b/c;->w()Lorg/b/a/g;

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

    const/4 v0, 0x7

    return v0
.end method
