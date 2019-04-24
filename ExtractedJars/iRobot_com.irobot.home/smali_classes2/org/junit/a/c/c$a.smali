.class final Lorg/junit/a/c/c$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljunit/b/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/a/c/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lorg/junit/runner/b/c;


# direct methods
.method private constructor <init>(Lorg/junit/runner/b/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/junit/a/c/c$a;->a:Lorg/junit/runner/b/c;

    return-void
.end method

.method synthetic constructor <init>(Lorg/junit/runner/b/c;Lorg/junit/a/c/c$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/junit/a/c/c$a;-><init>(Lorg/junit/runner/b/c;)V

    return-void
.end method

.method private c(Ljunit/b/d;)Lorg/junit/runner/c;
    .locals 1

    instance-of v0, p1, Lorg/junit/runner/b;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/junit/runner/b;

    invoke-interface {p1}, Lorg/junit/runner/b;->a()Lorg/junit/runner/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lorg/junit/a/c/c$a;->d(Ljunit/b/d;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, p1}, Lorg/junit/a/c/c$a;->e(Ljunit/b/d;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lorg/junit/runner/c;->a(Ljava/lang/Class;Ljava/lang/String;)Lorg/junit/runner/c;

    move-result-object p1

    return-object p1
.end method

.method private d(Ljunit/b/d;)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljunit/b/d;",
            ")",
            "Ljava/lang/Class<",
            "+",
            "Ljunit/b/d;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method private e(Ljunit/b/d;)Ljava/lang/String;
    .locals 1

    instance-of v0, p1, Ljunit/b/e;

    if-eqz v0, :cond_0

    check-cast p1, Ljunit/b/e;

    invoke-virtual {p1}, Ljunit/b/e;->f()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Ljunit/b/d;)V
    .locals 1

    iget-object v0, p0, Lorg/junit/a/c/c$a;->a:Lorg/junit/runner/b/c;

    invoke-direct {p0, p1}, Lorg/junit/a/c/c$a;->c(Ljunit/b/d;)Lorg/junit/runner/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/junit/runner/b/c;->d(Lorg/junit/runner/c;)V

    return-void
.end method

.method public a(Ljunit/b/d;Ljava/lang/Throwable;)V
    .locals 1

    new-instance v0, Lorg/junit/runner/b/a;

    invoke-direct {p0, p1}, Lorg/junit/a/c/c$a;->c(Ljunit/b/d;)Lorg/junit/runner/c;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lorg/junit/runner/b/a;-><init>(Lorg/junit/runner/c;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lorg/junit/a/c/c$a;->a:Lorg/junit/runner/b/c;

    invoke-virtual {p1, v0}, Lorg/junit/runner/b/c;->a(Lorg/junit/runner/b/a;)V

    return-void
.end method

.method public a(Ljunit/b/d;Ljunit/b/b;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/junit/a/c/c$a;->a(Ljunit/b/d;Ljava/lang/Throwable;)V

    return-void
.end method

.method public b(Ljunit/b/d;)V
    .locals 1

    iget-object v0, p0, Lorg/junit/a/c/c$a;->a:Lorg/junit/runner/b/c;

    invoke-direct {p0, p1}, Lorg/junit/a/c/c$a;->c(Ljunit/b/d;)Lorg/junit/runner/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/junit/runner/b/c;->b(Lorg/junit/runner/c;)V

    return-void
.end method
