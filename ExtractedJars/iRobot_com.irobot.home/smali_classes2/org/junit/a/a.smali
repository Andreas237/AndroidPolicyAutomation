.class public Lorg/junit/a/a;
.super Ljava/lang/RuntimeException;

# interfaces
.implements Lorg/a/d;


# static fields
.field private static final serialVersionUID:J = 0x2L


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Z

.field private final c:Ljava/lang/Object;

.field private final d:Lorg/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/a/c<",
            "*>;"
        }
    .end annotation
.end field


# virtual methods
.method public a(Lorg/a/b;)V
    .locals 1

    iget-object v0, p0, Lorg/junit/a/a;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/junit/a/a;->a:Ljava/lang/String;

    invoke-interface {p1, v0}, Lorg/a/b;->a(Ljava/lang/String;)Lorg/a/b;

    :cond_0
    iget-boolean v0, p0, Lorg/junit/a/a;->b:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/junit/a/a;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, ": "

    invoke-interface {p1, v0}, Lorg/a/b;->a(Ljava/lang/String;)Lorg/a/b;

    :cond_1
    const-string v0, "got: "

    invoke-interface {p1, v0}, Lorg/a/b;->a(Ljava/lang/String;)Lorg/a/b;

    iget-object v0, p0, Lorg/junit/a/a;->c:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lorg/a/b;->a(Ljava/lang/Object;)Lorg/a/b;

    iget-object v0, p0, Lorg/junit/a/a;->d:Lorg/a/c;

    if-eqz v0, :cond_2

    const-string v0, ", expected: "

    invoke-interface {p1, v0}, Lorg/a/b;->a(Ljava/lang/String;)Lorg/a/b;

    iget-object v0, p0, Lorg/junit/a/a;->d:Lorg/a/c;

    invoke-interface {p1, v0}, Lorg/a/b;->a(Lorg/a/d;)Lorg/a/b;

    :cond_2
    return-void
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lorg/a/e;->c(Lorg/a/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
