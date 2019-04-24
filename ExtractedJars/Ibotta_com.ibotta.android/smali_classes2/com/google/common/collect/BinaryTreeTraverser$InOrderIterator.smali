.class final Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;
.super Lcom/google/common/collect/AbstractIterator;
.source "BinaryTreeTraverser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/BinaryTreeTraverser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "InOrderIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/collect/AbstractIterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final hasExpandedLeft:Ljava/util/BitSet;

.field private final stack:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/google/common/collect/BinaryTreeTraverser;


# direct methods
.method constructor <init>(Lcom/google/common/collect/BinaryTreeTraverser;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 181
    iput-object p1, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->this$0:Lcom/google/common/collect/BinaryTreeTraverser;

    invoke-direct {p0}, Lcom/google/common/collect/AbstractIterator;-><init>()V

    .line 182
    new-instance p1, Ljava/util/ArrayDeque;

    const/16 v0, 0x8

    invoke-direct {p1, v0}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object p1, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->stack:Ljava/util/Deque;

    .line 183
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    iput-object p1, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->hasExpandedLeft:Ljava/util/BitSet;

    .line 184
    iget-object p1, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->stack:Ljava/util/Deque;

    invoke-interface {p1, p2}, Ljava/util/Deque;->addLast(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected computeNext()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 189
    :goto_0
    iget-object v0, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->stack:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 190
    iget-object v0, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->stack:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->getLast()Ljava/lang/Object;

    move-result-object v0

    .line 191
    iget-object v1, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->hasExpandedLeft:Ljava/util/BitSet;

    iget-object v2, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->stack:Ljava/util/Deque;

    invoke-interface {v2}, Ljava/util/Deque;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 192
    iget-object v1, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->stack:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->removeLast()Ljava/lang/Object;

    .line 193
    iget-object v1, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->hasExpandedLeft:Ljava/util/BitSet;

    iget-object v2, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->stack:Ljava/util/Deque;

    invoke-interface {v2}, Ljava/util/Deque;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->clear(I)V

    .line 194
    iget-object v1, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->stack:Ljava/util/Deque;

    iget-object v2, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->this$0:Lcom/google/common/collect/BinaryTreeTraverser;

    invoke-virtual {v2, v0}, Lcom/google/common/collect/BinaryTreeTraverser;->rightChild(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/collect/BinaryTreeTraverser;->access$000(Ljava/util/Deque;Lcom/google/common/base/Optional;)V

    return-object v0

    .line 197
    :cond_0
    iget-object v1, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->hasExpandedLeft:Ljava/util/BitSet;

    iget-object v2, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->stack:Ljava/util/Deque;

    invoke-interface {v2}, Ljava/util/Deque;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 198
    iget-object v1, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->stack:Ljava/util/Deque;

    iget-object v2, p0, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->this$0:Lcom/google/common/collect/BinaryTreeTraverser;

    invoke-virtual {v2, v0}, Lcom/google/common/collect/BinaryTreeTraverser;->leftChild(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/common/collect/BinaryTreeTraverser;->access$000(Ljava/util/Deque;Lcom/google/common/base/Optional;)V

    goto :goto_0

    .line 201
    :cond_1
    invoke-virtual {p0}, Lcom/google/common/collect/BinaryTreeTraverser$InOrderIterator;->endOfData()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
