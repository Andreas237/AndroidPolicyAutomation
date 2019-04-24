.class final Lorg/b/a/b/n;
.super Lorg/b/a/b/g;


# direct methods
.method constructor <init>(Lorg/b/a/b/c;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lorg/b/a/b/g;-><init>(Lorg/b/a/b/c;I)V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;Ljava/util/Locale;)I
    .locals 0

    invoke-static {p2}, Lorg/b/a/b/m;->a(Ljava/util/Locale;)Lorg/b/a/b/m;

    move-result-object p2

    invoke-virtual {p2, p1}, Lorg/b/a/b/m;->b(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public a(Ljava/util/Locale;)I
    .locals 0

    invoke-static {p1}, Lorg/b/a/b/m;->a(Ljava/util/Locale;)Lorg/b/a/b/m;

    move-result-object p1

    invoke-virtual {p1}, Lorg/b/a/b/m;->b()I

    move-result p1

    return p1
.end method

.method public a(ILjava/util/Locale;)Ljava/lang/String;
    .locals 0

    invoke-static {p2}, Lorg/b/a/b/m;->a(Ljava/util/Locale;)Lorg/b/a/b/m;

    move-result-object p2

    invoke-virtual {p2, p1}, Lorg/b/a/b/m;->b(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(ILjava/util/Locale;)Ljava/lang/String;
    .locals 0

    invoke-static {p2}, Lorg/b/a/b/m;->a(Ljava/util/Locale;)Lorg/b/a/b/m;

    move-result-object p2

    invoke-virtual {p2, p1}, Lorg/b/a/b/m;->c(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
