.class Lcom/squareup/haha/guava/collect/Maps$KeySet;
.super Lcom/squareup/haha/guava/collect/Sets$ImprovedAbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/guava/collect/Maps;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "KeySet"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lcom/squareup/haha/guava/collect/Sets$ImprovedAbstractSet<TK;>;"
    }
.end annotation


# instance fields
.field final map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<TK;TV;>;)V"
        }
    .end annotation

    .line 3479
    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/Sets$ImprovedAbstractSet;-><init>()V

    .line 3480
    invoke-static {p1}, Lcom/squareup/haha/guava/base/Joiner;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/squareup/haha/guava/collect/Maps$KeySet;->map:Ljava/util/Map;

    .line 3481
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 3512
    .line 9484
    move-object v1, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Maps$KeySet;->map:Ljava/util/Map;

    .line 3512
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 3513
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 2

    .line 3500
    .line 7484
    move-object v1, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Maps$KeySet;->map:Ljava/util/Map;

    .line 3500
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 2

    .line 3496
    .line 6484
    move-object v1, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Maps$KeySet;->map:Ljava/util/Map;

    .line 3496
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<TK;>;"
        }
    .end annotation

    .line 3488
    .line 4484
    move-object v1, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Maps$KeySet;->map:Ljava/util/Map;

    .line 3488
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/Maps;->keyIterator(Ljava/util/Iterator;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    .line 3504
    invoke-virtual {p0, p1}, Lcom/squareup/haha/guava/collect/Maps$KeySet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3505
    .line 8484
    move-object v1, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Maps$KeySet;->map:Ljava/util/Map;

    .line 3505
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3506
    const/4 v0, 0x1

    return v0

    .line 3508
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public size()I
    .locals 2

    .line 3492
    .line 5484
    move-object v1, p0

    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Maps$KeySet;->map:Ljava/util/Map;

    .line 3492
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
