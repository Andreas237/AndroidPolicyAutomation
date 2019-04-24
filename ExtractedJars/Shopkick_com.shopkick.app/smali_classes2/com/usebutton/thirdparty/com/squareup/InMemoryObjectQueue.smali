.class public Lcom/usebutton/thirdparty/com/squareup/InMemoryObjectQueue;
.super Ljava/lang/Object;
.source "InMemoryObjectQueue.java"

# interfaces
.implements Lcom/usebutton/thirdparty/com/squareup/ObjectQueue;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/usebutton/thirdparty/com/squareup/ObjectQueue<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private listener:Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final tasks:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/InMemoryObjectQueue;->tasks:Ljava/util/Queue;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/InMemoryObjectQueue;->tasks:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 27
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/InMemoryObjectQueue;->listener:Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0, p1}, Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;->onAdd(Lcom/usebutton/thirdparty/com/squareup/ObjectQueue;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public peek()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/InMemoryObjectQueue;->tasks:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public peek(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/InMemoryObjectQueue;->tasks:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 38
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v2, p1, :cond_0

    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public remove()V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/InMemoryObjectQueue;->tasks:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    .line 50
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/InMemoryObjectQueue;->listener:Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;->onRemove(Lcom/usebutton/thirdparty/com/squareup/ObjectQueue;)V

    :cond_0
    return-void
.end method

.method public remove(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 56
    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/InMemoryObjectQueue;->tasks:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setListener(Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener<",
            "TT;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 62
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/InMemoryObjectQueue;->tasks:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 63
    invoke-interface {p1, p0, v1}, Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;->onAdd(Lcom/usebutton/thirdparty/com/squareup/ObjectQueue;Ljava/lang/Object;)V

    goto :goto_0

    .line 66
    :cond_0
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/InMemoryObjectQueue;->listener:Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;

    return-void
.end method

.method public size()I
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/InMemoryObjectQueue;->tasks:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    return v0
.end method
