.class public Lorg/junit/a/c/c/f;
.super Lorg/junit/c/a/i;


# instance fields
.field private final a:Lorg/junit/c/a/i;

.field private final b:Ljava/lang/Object;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/junit/c/a/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/junit/c/a/i;Ljava/util/List;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/c/a/i;",
            "Ljava/util/List<",
            "Lorg/junit/c/a/d;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lorg/junit/c/a/i;-><init>()V

    iput-object p1, p0, Lorg/junit/a/c/c/f;->a:Lorg/junit/c/a/i;

    iput-object p2, p0, Lorg/junit/a/c/c/f;->c:Ljava/util/List;

    iput-object p3, p0, Lorg/junit/a/c/c/f;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lorg/junit/a/c/c/f;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/junit/c/a/d;

    iget-object v2, p0, Lorg/junit/a/c/c/f;->b:Ljava/lang/Object;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lorg/junit/c/a/d;->a(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/junit/a/c/c/f;->a:Lorg/junit/c/a/i;

    invoke-virtual {v0}, Lorg/junit/c/a/i;->a()V

    return-void
.end method
