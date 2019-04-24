.class Lorg/junit/runner/b/c$4;
.super Lorg/junit/runner/b/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/junit/runner/b/c;->a(Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lorg/junit/runner/b/c;


# direct methods
.method constructor <init>(Lorg/junit/runner/b/c;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lorg/junit/runner/b/c$4;->b:Lorg/junit/runner/b/c;

    iput-object p3, p0, Lorg/junit/runner/b/c$4;->a:Ljava/util/List;

    invoke-direct {p0, p1, p2}, Lorg/junit/runner/b/c$a;-><init>(Lorg/junit/runner/b/c;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Lorg/junit/runner/b/b;)V
    .locals 2

    iget-object v0, p0, Lorg/junit/runner/b/c$4;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/junit/runner/b/a;

    invoke-virtual {p1, v1}, Lorg/junit/runner/b/b;->a(Lorg/junit/runner/b/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method
