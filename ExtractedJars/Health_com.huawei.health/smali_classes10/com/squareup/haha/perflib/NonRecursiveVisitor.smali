.class public Lcom/squareup/haha/perflib/NonRecursiveVisitor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/perflib/Visitor;


# instance fields
.field public final mSeen:Lcom/squareup/haha/trove/TLongHashSet;

.field public final mStack:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<Lcom/squareup/haha/perflib/Instance;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lcom/squareup/haha/perflib/NonRecursiveVisitor;->mStack:Ljava/util/Deque;

    .line 34
    new-instance v0, Lcom/squareup/haha/trove/TLongHashSet;

    invoke-direct {v0}, Lcom/squareup/haha/trove/TLongHashSet;-><init>()V

    iput-object v0, p0, Lcom/squareup/haha/perflib/NonRecursiveVisitor;->mSeen:Lcom/squareup/haha/trove/TLongHashSet;

    return-void
.end method


# virtual methods
.method protected defaultAction(Lcom/squareup/haha/perflib/Instance;)V
    .locals 0

    .line 37
    return-void
.end method

.method public doVisit(Ljava/lang/Iterable;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/squareup/haha/perflib/Instance;>;)V"
        }
    .end annotation

    .line 65
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/squareup/haha/perflib/Instance;

    .line 66
    instance-of v0, v4, Lcom/squareup/haha/perflib/RootObj;

    if-eqz v0, :cond_0

    .line 68
    invoke-virtual {v4, p0}, Lcom/squareup/haha/perflib/Instance;->accept(Lcom/squareup/haha/perflib/Visitor;)V

    goto :goto_0

    .line 70
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v4}, Lcom/squareup/haha/perflib/NonRecursiveVisitor;->visitLater(Lcom/squareup/haha/perflib/Instance;Lcom/squareup/haha/perflib/Instance;)V

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/squareup/haha/perflib/NonRecursiveVisitor;->mStack:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 74
    iget-object v0, p0, Lcom/squareup/haha/perflib/NonRecursiveVisitor;->mStack:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/squareup/haha/perflib/Instance;

    .line 75
    iget-object v0, p0, Lcom/squareup/haha/perflib/NonRecursiveVisitor;->mSeen:Lcom/squareup/haha/trove/TLongHashSet;

    invoke-virtual {v3}, Lcom/squareup/haha/perflib/Instance;->getId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/squareup/haha/trove/TLongHashSet;->add(J)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 76
    invoke-virtual {v3, p0}, Lcom/squareup/haha/perflib/Instance;->accept(Lcom/squareup/haha/perflib/Visitor;)V

    .line 78
    :cond_2
    goto :goto_1

    .line 79
    :cond_3
    return-void
.end method

.method public visitArrayInstance(Lcom/squareup/haha/perflib/ArrayInstance;)V
    .locals 0

    .line 46
    invoke-virtual {p0, p1}, Lcom/squareup/haha/perflib/NonRecursiveVisitor;->defaultAction(Lcom/squareup/haha/perflib/Instance;)V

    .line 47
    return-void
.end method

.method public visitClassInstance(Lcom/squareup/haha/perflib/ClassInstance;)V
    .locals 0

    .line 51
    invoke-virtual {p0, p1}, Lcom/squareup/haha/perflib/NonRecursiveVisitor;->defaultAction(Lcom/squareup/haha/perflib/Instance;)V

    .line 52
    return-void
.end method

.method public visitClassObj(Lcom/squareup/haha/perflib/ClassObj;)V
    .locals 0

    .line 56
    invoke-virtual {p0, p1}, Lcom/squareup/haha/perflib/NonRecursiveVisitor;->defaultAction(Lcom/squareup/haha/perflib/Instance;)V

    .line 57
    return-void
.end method

.method public visitLater(Lcom/squareup/haha/perflib/Instance;Lcom/squareup/haha/perflib/Instance;)V
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/squareup/haha/perflib/NonRecursiveVisitor;->mStack:Ljava/util/Deque;

    invoke-interface {v0, p2}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 62
    return-void
.end method

.method public visitRootObj(Lcom/squareup/haha/perflib/RootObj;)V
    .locals 0

    .line 41
    invoke-virtual {p0, p1}, Lcom/squareup/haha/perflib/NonRecursiveVisitor;->defaultAction(Lcom/squareup/haha/perflib/Instance;)V

    .line 42
    return-void
.end method
