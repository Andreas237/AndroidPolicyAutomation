.class public Lorg/junit/a/a/f;
.super Lorg/junit/c/a/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/junit/c/a/g;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lorg/junit/runner/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/runner/k;"
        }
    .end annotation

    new-instance v0, Lorg/junit/c/a;

    invoke-direct {v0, p1}, Lorg/junit/c/a;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method
