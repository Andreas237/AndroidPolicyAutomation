.class public abstract Lorg/c/c/a/a/b;
.super Lorg/c/c/a/a/a;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/c/c/a/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/c/c/a/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lorg/c/c/a/g;
    .locals 3

    invoke-super {p0}, Lorg/c/c/a/a/a;->a()Lorg/c/c/a/g;

    move-result-object v0

    invoke-virtual {p0}, Lorg/c/c/a/a/b;->b()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lorg/c/e/c;->a(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Lorg/c/c/a/n;

    invoke-virtual {p0}, Lorg/c/c/a/a/b;->b()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lorg/c/c/a/n;-><init>(Lorg/c/c/a/g;Ljava/util/List;)V

    return-object v1

    :cond_0
    return-object v0
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/c/c/a/h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/c/c/a/a/b;->a:Ljava/util/List;

    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/c/c/a/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/c/c/a/a/b;->a:Ljava/util/List;

    return-object v0
.end method
