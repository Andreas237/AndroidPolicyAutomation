.class Lcom/google/common/collect/AbstractMapBasedMultiset$1;
.super Ljava/lang/Object;
.source "AbstractMapBasedMultiset.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/common/collect/AbstractMapBasedMultiset;->entryIterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lcom/google/common/collect/Multiset$Entry<",
        "TE;>;>;"
    }
.end annotation


# instance fields
.field canRemove:Z

.field final synthetic this$0:Lcom/google/common/collect/AbstractMapBasedMultiset;

.field toRemove:Lcom/google/common/collect/Multiset$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/Multiset$Entry<",
            "TE;>;"
        }
    .end annotation
.end field

.field final synthetic val$backingEntries:Ljava/util/Iterator;


# direct methods
.method constructor <init>(Lcom/google/common/collect/AbstractMapBasedMultiset;Ljava/util/Iterator;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$1;->this$0:Lcom/google/common/collect/AbstractMapBasedMultiset;

    iput-object p2, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$1;->val$backingEntries:Ljava/util/Iterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$1;->val$backingEntries:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Lcom/google/common/collect/Multiset$Entry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/collect/Multiset$Entry<",
            "TE;>;"
        }
    .end annotation

    .line 99
    iget-object v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$1;->val$backingEntries:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/collect/Multiset$Entry;

    .line 100
    iput-object v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$1;->toRemove:Lcom/google/common/collect/Multiset$Entry;

    const/4 v1, 0x1

    .line 101
    iput-boolean v1, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$1;->canRemove:Z

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 88
    invoke-virtual {p0}, Lcom/google/common/collect/AbstractMapBasedMultiset$1;->next()Lcom/google/common/collect/Multiset$Entry;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 5

    .line 107
    iget-boolean v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$1;->canRemove:Z

    invoke-static {v0}, Lcom/google/common/collect/CollectPreconditions;->checkRemove(Z)V

    .line 108
    iget-object v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$1;->this$0:Lcom/google/common/collect/AbstractMapBasedMultiset;

    invoke-static {v0}, Lcom/google/common/collect/AbstractMapBasedMultiset;->access$000(Lcom/google/common/collect/AbstractMapBasedMultiset;)J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$1;->toRemove:Lcom/google/common/collect/Multiset$Entry;

    invoke-interface {v3}, Lcom/google/common/collect/Multiset$Entry;->getCount()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lcom/google/common/collect/AbstractMapBasedMultiset;->access$002(Lcom/google/common/collect/AbstractMapBasedMultiset;J)J

    .line 109
    iget-object v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$1;->val$backingEntries:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    const/4 v0, 0x0

    .line 110
    iput-boolean v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$1;->canRemove:Z

    const/4 v0, 0x0

    .line 111
    iput-object v0, p0, Lcom/google/common/collect/AbstractMapBasedMultiset$1;->toRemove:Lcom/google/common/collect/Multiset$Entry;

    return-void
.end method
