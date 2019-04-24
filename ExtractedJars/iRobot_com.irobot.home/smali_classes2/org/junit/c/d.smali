.class public Lorg/junit/c/d;
.super Lorg/junit/c/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/junit/c/c<",
        "Lorg/junit/runner/k;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/junit/runner/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Ljava/lang/Class;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Lorg/junit/runner/k;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lorg/junit/c/c;-><init>(Ljava/lang/Class;)V

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/junit/c/d;->a:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lorg/junit/c/a/g;[Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/c/a/g;",
            "[",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Lorg/junit/c/a/g;->a(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lorg/junit/c/d;-><init>(Ljava/lang/Class;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Lorg/junit/runner/k;)Lorg/junit/runner/c;
    .locals 0

    invoke-virtual {p1}, Lorg/junit/runner/k;->a()Lorg/junit/runner/c;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic a(Ljava/lang/Object;Lorg/junit/runner/b/c;)V
    .locals 0

    check-cast p1, Lorg/junit/runner/k;

    invoke-virtual {p0, p1, p2}, Lorg/junit/c/d;->a(Lorg/junit/runner/k;Lorg/junit/runner/b/c;)V

    return-void
.end method

.method protected a(Lorg/junit/runner/k;Lorg/junit/runner/b/c;)V
    .locals 0

    invoke-virtual {p1, p2}, Lorg/junit/runner/k;->a(Lorg/junit/runner/b/c;)V

    return-void
.end method

.method protected b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/junit/runner/k;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/junit/c/d;->a:Ljava/util/List;

    return-object v0
.end method

.method protected synthetic d(Ljava/lang/Object;)Lorg/junit/runner/c;
    .locals 0

    check-cast p1, Lorg/junit/runner/k;

    invoke-virtual {p0, p1}, Lorg/junit/c/d;->a(Lorg/junit/runner/k;)Lorg/junit/runner/c;

    move-result-object p1

    return-object p1
.end method
