.class abstract Lorg/junit/runner/b/c$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/runner/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/junit/runner/b/b;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic c:Lorg/junit/runner/b/c;


# direct methods
.method constructor <init>(Lorg/junit/runner/b/c;)V
    .locals 1

    invoke-static {p1}, Lorg/junit/runner/b/c;->a(Lorg/junit/runner/b/c;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/junit/runner/b/c$a;-><init>(Lorg/junit/runner/b/c;Ljava/util/List;)V

    return-void
.end method

.method constructor <init>(Lorg/junit/runner/b/c;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/junit/runner/b/b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/junit/runner/b/c$a;->c:Lorg/junit/runner/b/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/junit/runner/b/c$a;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method a()V
    .locals 6

    iget-object v0, p0, Lorg/junit/runner/b/c$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v0, p0, Lorg/junit/runner/b/c$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/junit/runner/b/b;

    :try_start_0
    invoke-virtual {p0, v3}, Lorg/junit/runner/b/c$a;->a(Lorg/junit/runner/b/b;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    new-instance v4, Lorg/junit/runner/b/a;

    sget-object v5, Lorg/junit/runner/c;->b:Lorg/junit/runner/c;

    invoke-direct {v4, v5, v3}, Lorg/junit/runner/b/a;-><init>(Lorg/junit/runner/c;Ljava/lang/Throwable;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/junit/runner/b/c$a;->c:Lorg/junit/runner/b/c;

    invoke-static {v0, v1, v2}, Lorg/junit/runner/b/c;->a(Lorg/junit/runner/b/c;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method protected abstract a(Lorg/junit/runner/b/b;)V
.end method
