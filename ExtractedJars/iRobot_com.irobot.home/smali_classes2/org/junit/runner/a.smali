.class public Lorg/junit/runner/a;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lorg/junit/c/a/g;Ljava/lang/Class;)Lorg/junit/runner/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/c/a/g;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/runner/k;"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lorg/junit/c/a/g;->a(Ljava/lang/Class;)Lorg/junit/runner/k;

    move-result-object p1

    return-object p1
.end method

.method public a(Lorg/junit/c/a/g;[Ljava/lang/Class;)Lorg/junit/runner/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/c/a/g;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/runner/k;"
        }
    .end annotation

    new-instance v0, Lorg/junit/c/d;

    new-instance v1, Lorg/junit/runner/a$1;

    invoke-direct {v1, p0, p1}, Lorg/junit/runner/a$1;-><init>(Lorg/junit/runner/a;Lorg/junit/c/a/g;)V

    invoke-direct {v0, v1, p2}, Lorg/junit/c/d;-><init>(Lorg/junit/c/a/g;[Ljava/lang/Class;)V

    return-object v0
.end method
