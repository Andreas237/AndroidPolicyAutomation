.class abstract Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;
.super Ljava/lang/Object;
.source "LinkedBlockingDeque.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "AbstractItr"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private lastRet:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node<",
            "TE;>;"
        }
    .end annotation
.end field

.field next:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node<",
            "TE;>;"
        }
    .end annotation
.end field

.field nextItem:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque;


# direct methods
.method constructor <init>(Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque;)V
    .locals 1

    .line 1036
    iput-object p1, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->this$0:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1038
    iget-object p1, p1, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 1039
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 1041
    :try_start_0
    invoke-virtual {p0}, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->firstNode()Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    move-result-object v0

    iput-object v0, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->next:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    .line 1042
    iget-object v0, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->next:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->next:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    iget-object v0, v0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;->item:Ljava/lang/Object;

    :goto_0
    iput-object v0, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->nextItem:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1044
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method private succ(Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;)Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node<",
            "TE;>;)",
            "Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node<",
            "TE;>;"
        }
    .end annotation

    .line 1056
    :goto_0
    invoke-virtual {p0, p1}, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->nextNode(Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;)Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1059
    :cond_0
    iget-object v1, v0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;->item:Ljava/lang/Object;

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    if-ne v0, p1, :cond_2

    .line 1062
    invoke-virtual {p0}, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->firstNode()Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    move-result-object p1

    return-object p1

    :cond_2
    move-object p1, v0

    goto :goto_0
.end method


# virtual methods
.method advance()V
    .locals 2

    .line 1072
    iget-object v0, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->this$0:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque;

    iget-object v0, v0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 1073
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 1076
    :try_start_0
    iget-object v1, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->next:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    invoke-direct {p0, v1}, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->succ(Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;)Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    move-result-object v1

    iput-object v1, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->next:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    .line 1077
    iget-object v1, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->next:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->next:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    iget-object v1, v1, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;->item:Ljava/lang/Object;

    :goto_0
    iput-object v1, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->nextItem:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1079
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v1
.end method

.method abstract firstNode()Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node<",
            "TE;>;"
        }
    .end annotation
.end method

.method public hasNext()Z
    .locals 1

    .line 1084
    iget-object v0, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->next:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 1088
    iget-object v0, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->next:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    if-nez v0, :cond_0

    .line 1089
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 1090
    :cond_0
    iget-object v0, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->next:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    iput-object v0, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->lastRet:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    .line 1091
    iget-object v0, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->nextItem:Ljava/lang/Object;

    .line 1092
    invoke-virtual {p0}, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->advance()V

    return-object v0
.end method

.method abstract nextNode(Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;)Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node<",
            "TE;>;)",
            "Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node<",
            "TE;>;"
        }
    .end annotation
.end method

.method public remove()V
    .locals 3

    .line 1097
    iget-object v0, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->lastRet:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    if-nez v0, :cond_0

    .line 1099
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_0
    const/4 v1, 0x0

    .line 1100
    iput-object v1, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->lastRet:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;

    .line 1101
    iget-object v1, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->this$0:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque;

    iget-object v1, v1, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 1102
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 1104
    :try_start_0
    iget-object v2, v0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;->item:Ljava/lang/Object;

    if-eqz v2, :cond_1

    .line 1105
    iget-object v2, p0, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$AbstractItr;->this$0:Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque;

    invoke-virtual {v2, v0}, Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque;->unlink(Lcom/nostra13/universalimageloader/core/assist/deque/LinkedBlockingDeque$Node;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1107
    :cond_1
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method
