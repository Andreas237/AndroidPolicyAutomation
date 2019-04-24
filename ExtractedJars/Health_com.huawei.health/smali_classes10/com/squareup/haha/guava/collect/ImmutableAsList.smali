.class abstract Lcom/squareup/haha/guava/collect/ImmutableAsList;
.super Lcom/squareup/haha/guava/collect/ImmutableList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:Ljava/lang/Object;>Lcom/squareup/haha/guava/collect/ImmutableList<TE;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/ImmutableList;-><init>()V

    .line 62
    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 41
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/ImmutableAsList;->delegateCollection()Lcom/squareup/haha/guava/collect/ImmutableCollection;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/squareup/haha/guava/collect/ImmutableCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method abstract delegateCollection()Lcom/squareup/haha/guava/collect/ImmutableCollection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/squareup/haha/guava/collect/ImmutableCollection<TE;>;"
        }
    .end annotation
.end method

.method public isEmpty()Z
    .locals 1

    .line 51
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/ImmutableAsList;->delegateCollection()Lcom/squareup/haha/guava/collect/ImmutableCollection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/haha/guava/collect/ImmutableCollection;->isEmpty()Z

    move-result v0

    return v0
.end method

.method final isPartialView()Z
    .locals 1

    .line 56
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/ImmutableAsList;->delegateCollection()Lcom/squareup/haha/guava/collect/ImmutableCollection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/haha/guava/collect/ImmutableCollection;->isPartialView()Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    .line 46
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/ImmutableAsList;->delegateCollection()Lcom/squareup/haha/guava/collect/ImmutableCollection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/haha/guava/collect/ImmutableCollection;->size()I

    move-result v0

    return v0
.end method
