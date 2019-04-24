.class public Lorg/junit/b/b;
.super Lorg/junit/c/a/i;


# instance fields
.field private final a:Lorg/junit/c/a/i;


# direct methods
.method public constructor <init>(Lorg/junit/c/a/i;Ljava/lang/Iterable;Lorg/junit/runner/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/c/a/i;",
            "Ljava/lang/Iterable<",
            "Lorg/junit/b/c;",
            ">;",
            "Lorg/junit/runner/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lorg/junit/c/a/i;-><init>()V

    invoke-static {p1, p2, p3}, Lorg/junit/b/b;->a(Lorg/junit/c/a/i;Ljava/lang/Iterable;Lorg/junit/runner/c;)Lorg/junit/c/a/i;

    move-result-object p1

    iput-object p1, p0, Lorg/junit/b/b;->a:Lorg/junit/c/a/i;

    return-void
.end method

.method private static a(Lorg/junit/c/a/i;Ljava/lang/Iterable;Lorg/junit/runner/c;)Lorg/junit/c/a/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/c/a/i;",
            "Ljava/lang/Iterable<",
            "Lorg/junit/b/c;",
            ">;",
            "Lorg/junit/runner/c;",
            ")",
            "Lorg/junit/c/a/i;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/junit/b/c;

    invoke-interface {v0, p0, p2}, Lorg/junit/b/c;->a(Lorg/junit/c/a/i;Lorg/junit/runner/c;)Lorg/junit/c/a/i;

    move-result-object p0

    goto :goto_0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lorg/junit/b/b;->a:Lorg/junit/c/a/i;

    invoke-virtual {v0}, Lorg/junit/c/a/i;->a()V

    return-void
.end method
