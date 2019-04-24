.class public Lorg/junit/a/a/c;
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

    const-class v0, Lorg/junit/h;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Lorg/junit/a/a/d;

    invoke-direct {v0, p1}, Lorg/junit/a/a/d;-><init>(Ljava/lang/Class;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
