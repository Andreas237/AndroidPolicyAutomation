.class Lcom/google/common/collect/AbstractBiMap$1;
.super Ljava/lang/Object;
.source "AbstractBiMap.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/common/collect/AbstractBiMap;->entrySetIterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field entry:Ljava/util/Map$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation
.end field

.field final synthetic this$0:Lcom/google/common/collect/AbstractBiMap;

.field final synthetic val$iterator:Ljava/util/Iterator;


# direct methods
.method constructor <init>(Lcom/google/common/collect/AbstractBiMap;Ljava/util/Iterator;)V
    .locals 0

    .line 316
    iput-object p1, p0, Lcom/google/common/collect/AbstractBiMap$1;->this$0:Lcom/google/common/collect/AbstractBiMap;

    iput-object p2, p0, Lcom/google/common/collect/AbstractBiMap$1;->val$iterator:Ljava/util/Iterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 321
    iget-object v0, p0, Lcom/google/common/collect/AbstractBiMap$1;->val$iterator:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 316
    invoke-virtual {p0}, Lcom/google/common/collect/AbstractBiMap$1;->next()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public next()Ljava/util/Map$Entry;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 326
    iget-object v0, p0, Lcom/google/common/collect/AbstractBiMap$1;->val$iterator:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iput-object v0, p0, Lcom/google/common/collect/AbstractBiMap$1;->entry:Ljava/util/Map$Entry;

    .line 327
    new-instance v0, Lcom/google/common/collect/AbstractBiMap$BiMapEntry;

    iget-object v1, p0, Lcom/google/common/collect/AbstractBiMap$1;->this$0:Lcom/google/common/collect/AbstractBiMap;

    iget-object v2, p0, Lcom/google/common/collect/AbstractBiMap$1;->entry:Ljava/util/Map$Entry;

    invoke-direct {v0, v1, v2}, Lcom/google/common/collect/AbstractBiMap$BiMapEntry;-><init>(Lcom/google/common/collect/AbstractBiMap;Ljava/util/Map$Entry;)V

    return-object v0
.end method

.method public remove()V
    .locals 2

    .line 332
    iget-object v0, p0, Lcom/google/common/collect/AbstractBiMap$1;->entry:Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/common/collect/CollectPreconditions;->checkRemove(Z)V

    .line 333
    iget-object v0, p0, Lcom/google/common/collect/AbstractBiMap$1;->entry:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 334
    iget-object v1, p0, Lcom/google/common/collect/AbstractBiMap$1;->val$iterator:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 335
    iget-object v1, p0, Lcom/google/common/collect/AbstractBiMap$1;->this$0:Lcom/google/common/collect/AbstractBiMap;

    invoke-static {v1, v0}, Lcom/google/common/collect/AbstractBiMap;->access$600(Lcom/google/common/collect/AbstractBiMap;Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 336
    iput-object v0, p0, Lcom/google/common/collect/AbstractBiMap$1;->entry:Ljava/util/Map$Entry;

    return-void
.end method
