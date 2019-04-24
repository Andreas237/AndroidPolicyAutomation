.class public Lorg/c/c/b/h;
.super Lorg/c/c/b/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/c/c/b/a<",
        "Lorg/c/b/a/d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lorg/c/c/j;->a:Lorg/c/c/j;

    invoke-direct {p0, v0}, Lorg/c/c/b/a;-><init>(Lorg/c/c/j;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Ljava/lang/Object;Lorg/c/c/j;)Ljava/lang/Long;
    .locals 0

    check-cast p1, Lorg/c/b/a/d;

    invoke-virtual {p0, p1, p2}, Lorg/c/c/b/h;->a(Lorg/c/b/a/d;Lorg/c/c/j;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method protected a(Lorg/c/b/a/d;Lorg/c/c/j;)Ljava/lang/Long;
    .locals 0

    invoke-interface {p1}, Lorg/c/b/a/d;->b()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic a(Ljava/lang/Object;)Lorg/c/c/j;
    .locals 0

    check-cast p1, Lorg/c/b/a/d;

    invoke-virtual {p0, p1}, Lorg/c/c/b/h;->a(Lorg/c/b/a/d;)Lorg/c/c/j;

    move-result-object p1

    return-object p1
.end method

.method protected a(Lorg/c/b/a/d;)Lorg/c/c/j;
    .locals 0

    sget-object p1, Lorg/c/c/j;->f:Lorg/c/c/j;

    return-object p1
.end method

.method protected bridge synthetic a(Ljava/lang/Object;Lorg/c/c/g;)V
    .locals 0

    check-cast p1, Lorg/c/b/a/d;

    invoke-virtual {p0, p1, p2}, Lorg/c/c/b/h;->a(Lorg/c/b/a/d;Lorg/c/c/g;)V

    return-void
.end method

.method protected a(Lorg/c/b/a/d;Lorg/c/c/g;)V
    .locals 1

    invoke-interface {p1}, Lorg/c/b/a/d;->d()Ljava/io/InputStream;

    move-result-object p1

    invoke-interface {p2}, Lorg/c/c/g;->a()Ljava/io/OutputStream;

    move-result-object v0

    invoke-static {p1, v0}, Lorg/c/e/d;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    invoke-interface {p2}, Lorg/c/c/g;->a()Ljava/io/OutputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method protected a(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    const-class v0, Lorg/c/b/a/d;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method

.method protected synthetic b(Ljava/lang/Class;Lorg/c/c/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/c/c/b/h;->c(Ljava/lang/Class;Lorg/c/c/d;)Lorg/c/b/a/d;

    move-result-object p1

    return-object p1
.end method

.method protected c(Ljava/lang/Class;Lorg/c/c/d;)Lorg/c/b/a/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/c/b/a/d;",
            ">;",
            "Lorg/c/c/d;",
            ")",
            "Lorg/c/b/a/d;"
        }
    .end annotation

    invoke-interface {p2}, Lorg/c/c/d;->a()Ljava/io/InputStream;

    move-result-object p1

    invoke-static {p1}, Lorg/c/e/d;->a(Ljava/io/InputStream;)[B

    move-result-object p1

    new-instance p2, Lorg/c/b/a/b;

    invoke-direct {p2, p1}, Lorg/c/b/a/b;-><init>([B)V

    return-object p2
.end method
