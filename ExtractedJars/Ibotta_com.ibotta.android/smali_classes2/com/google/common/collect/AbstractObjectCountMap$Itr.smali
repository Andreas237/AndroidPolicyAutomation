.class abstract Lcom/google/common/collect/AbstractObjectCountMap$Itr;
.super Ljava/lang/Object;
.source "AbstractObjectCountMap.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/AbstractObjectCountMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "Itr"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field expectedModCount:I

.field index:I

.field nextCalled:Z

.field final synthetic this$0:Lcom/google/common/collect/AbstractObjectCountMap;


# direct methods
.method constructor <init>(Lcom/google/common/collect/AbstractObjectCountMap;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->this$0:Lcom/google/common/collect/AbstractObjectCountMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 193
    iget-object p1, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->this$0:Lcom/google/common/collect/AbstractObjectCountMap;

    iget p1, p1, Lcom/google/common/collect/AbstractObjectCountMap;->modCount:I

    iput p1, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->expectedModCount:I

    const/4 p1, 0x0

    .line 194
    iput-boolean p1, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->nextCalled:Z

    .line 195
    iput p1, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->index:I

    return-void
.end method


# virtual methods
.method checkForConcurrentModification()V
    .locals 2

    .line 225
    iget-object v0, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->this$0:Lcom/google/common/collect/AbstractObjectCountMap;

    iget v0, v0, Lcom/google/common/collect/AbstractObjectCountMap;->modCount:I

    iget v1, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->expectedModCount:I

    if-ne v0, v1, :cond_0

    return-void

    .line 226
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method abstract getOutput(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation
.end method

.method public hasNext()Z
    .locals 2

    .line 199
    iget v0, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->index:I

    iget-object v1, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->this$0:Lcom/google/common/collect/AbstractObjectCountMap;

    iget v1, v1, Lcom/google/common/collect/AbstractObjectCountMap;->size:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 206
    invoke-virtual {p0}, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->checkForConcurrentModification()V

    .line 207
    invoke-virtual {p0}, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 210
    iput-boolean v0, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->nextCalled:Z

    .line 211
    iget v0, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->index:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->index:I

    invoke-virtual {p0, v0}, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->getOutput(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 208
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 2

    .line 216
    invoke-virtual {p0}, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->checkForConcurrentModification()V

    .line 217
    iget-boolean v0, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->nextCalled:Z

    invoke-static {v0}, Lcom/google/common/collect/CollectPreconditions;->checkRemove(Z)V

    .line 218
    iget v0, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->expectedModCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->expectedModCount:I

    .line 219
    iget v0, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->index:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->index:I

    .line 220
    iget-object v0, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->this$0:Lcom/google/common/collect/AbstractObjectCountMap;

    iget v1, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->index:I

    invoke-virtual {v0, v1}, Lcom/google/common/collect/AbstractObjectCountMap;->removeEntry(I)I

    const/4 v0, 0x0

    .line 221
    iput-boolean v0, p0, Lcom/google/common/collect/AbstractObjectCountMap$Itr;->nextCalled:Z

    return-void
.end method
