.class public Lcom/squareup/haha/perflib/Snapshot;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final DEFAULT_HEAP_ID:I = 0x0

.field private static final JAVA_LANG_CLASS:Ljava/lang/String; = "java.lang.Class"

.field public static final SENTINEL_ROOT:Lcom/squareup/haha/perflib/Instance;


# instance fields
.field final mBuffer:Lcom/squareup/haha/perflib/io/HprofBuffer;

.field mCurrentHeap:Lcom/squareup/haha/perflib/Heap;

.field private mDominators:Lcom/squareup/haha/perflib/analysis/Dominators;

.field mHeaps:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/squareup/haha/perflib/Heap;>;"
        }
    .end annotation
.end field

.field private mIdSizeMask:J

.field private mReferenceClasses:Lcom/squareup/haha/trove/THashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/trove/THashSet<Lcom/squareup/haha/perflib/ClassObj;>;"
        }
    .end annotation
.end field

.field private mTopSort:Lcom/squareup/haha/guava/collect/ImmutableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/guava/collect/ImmutableList<Lcom/squareup/haha/perflib/Instance;>;"
        }
    .end annotation
.end field

.field private mTypeSizes:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 37
    const-class v0, Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/squareup/haha/perflib/Snapshot;->$assertionsDisabled:Z

    .line 42
    new-instance v0, Lcom/squareup/haha/perflib/RootObj;

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->UNKNOWN:Lcom/squareup/haha/perflib/RootType;

    invoke-direct {v0, v1}, Lcom/squareup/haha/perflib/RootObj;-><init>(Lcom/squareup/haha/perflib/RootType;)V

    sput-object v0, Lcom/squareup/haha/perflib/Snapshot;->SENTINEL_ROOT:Lcom/squareup/haha/perflib/Instance;

    return-void
.end method

.method public constructor <init>(Lcom/squareup/haha/perflib/io/HprofBuffer;)V
    .locals 2

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    .line 60
    new-instance v0, Lcom/squareup/haha/trove/THashSet;

    invoke-direct {v0}, Lcom/squareup/haha/trove/THashSet;-><init>()V

    iput-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mReferenceClasses:Lcom/squareup/haha/trove/THashSet;

    .line 64
    const-wide v0, 0xffffffffL

    iput-wide v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mIdSizeMask:J

    .line 67
    iput-object p1, p0, Lcom/squareup/haha/perflib/Snapshot;->mBuffer:Lcom/squareup/haha/perflib/io/HprofBuffer;

    .line 68
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Snapshot;->setToDefaultHeap()Lcom/squareup/haha/perflib/Heap;

    .line 69
    return-void
.end method


# virtual methods
.method public final addClass(JLcom/squareup/haha/perflib/ClassObj;)V
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mCurrentHeap:Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {v0, p1, p2, p3}, Lcom/squareup/haha/perflib/Heap;->addClass(JLcom/squareup/haha/perflib/ClassObj;)V

    .line 192
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mCurrentHeap:Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {p3, v0}, Lcom/squareup/haha/perflib/ClassObj;->setHeap(Lcom/squareup/haha/perflib/Heap;)V

    .line 193
    return-void
.end method

.method public final addInstance(JLcom/squareup/haha/perflib/Instance;)V
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mCurrentHeap:Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {v0, p1, p2, p3}, Lcom/squareup/haha/perflib/Heap;->addInstance(JLcom/squareup/haha/perflib/Instance;)V

    .line 187
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mCurrentHeap:Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {p3, v0}, Lcom/squareup/haha/perflib/Instance;->setHeap(Lcom/squareup/haha/perflib/Heap;)V

    .line 188
    return-void
.end method

.method public final addRoot(Lcom/squareup/haha/perflib/RootObj;)V
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mCurrentHeap:Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/perflib/Heap;->addRoot(Lcom/squareup/haha/perflib/RootObj;)V

    .line 150
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mCurrentHeap:Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {p1, v0}, Lcom/squareup/haha/perflib/RootObj;->setHeap(Lcom/squareup/haha/perflib/Heap;)V

    .line 151
    return-void
.end method

.method public final addStackFrame(Lcom/squareup/haha/perflib/StackFrame;)V
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mCurrentHeap:Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/perflib/Heap;->addStackFrame(Lcom/squareup/haha/perflib/StackFrame;)V

    .line 130
    return-void
.end method

.method public final addStackTrace(Lcom/squareup/haha/perflib/StackTrace;)V
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mCurrentHeap:Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/perflib/Heap;->addStackTrace(Lcom/squareup/haha/perflib/StackTrace;)V

    .line 138
    return-void
.end method

.method public final addThread(Lcom/squareup/haha/perflib/ThreadObj;I)V
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mCurrentHeap:Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/haha/perflib/Heap;->addThread(Lcom/squareup/haha/perflib/ThreadObj;I)V

    .line 155
    return-void
.end method

.method public computeDominators()V
    .locals 3

    .line 310
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mDominators:Lcom/squareup/haha/perflib/analysis/Dominators;

    if-nez v0, :cond_0

    .line 311
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Snapshot;->getGCRoots()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/haha/perflib/analysis/TopologicalSort;->compute(Ljava/lang/Iterable;)Lcom/squareup/haha/guava/collect/ImmutableList;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mTopSort:Lcom/squareup/haha/guava/collect/ImmutableList;

    .line 312
    new-instance v0, Lcom/squareup/haha/perflib/analysis/Dominators;

    iget-object v1, p0, Lcom/squareup/haha/perflib/Snapshot;->mTopSort:Lcom/squareup/haha/guava/collect/ImmutableList;

    invoke-direct {v0, p0, v1}, Lcom/squareup/haha/perflib/analysis/Dominators;-><init>(Lcom/squareup/haha/perflib/Snapshot;Lcom/squareup/haha/guava/collect/ImmutableList;)V

    iput-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mDominators:Lcom/squareup/haha/perflib/analysis/Dominators;

    .line 313
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mDominators:Lcom/squareup/haha/perflib/analysis/Dominators;

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/analysis/Dominators;->computeRetainedSizes()V

    .line 315
    new-instance v2, Lcom/squareup/haha/perflib/analysis/ShortestDistanceVisitor;

    invoke-direct {v2}, Lcom/squareup/haha/perflib/analysis/ShortestDistanceVisitor;-><init>()V

    .line 316
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Snapshot;->getGCRoots()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/squareup/haha/perflib/analysis/ShortestDistanceVisitor;->doVisit(Ljava/lang/Iterable;)V

    .line 318
    :cond_0
    return-void
.end method

.method public final dumpInstanceCounts()V
    .locals 5

    .line 336
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/squareup/haha/perflib/Heap;

    .line 337
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "+------------------ instance counts for heap: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/squareup/haha/perflib/Heap;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 339
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/Heap;->dumpInstanceCounts()V

    .line 340
    goto :goto_0

    .line 341
    :cond_0
    return-void
.end method

.method public final dumpSizes()V
    .locals 5

    .line 344
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/squareup/haha/perflib/Heap;

    .line 345
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "+------------------ sizes for heap: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/squareup/haha/perflib/Heap;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 347
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/Heap;->dumpSizes()V

    .line 348
    goto :goto_0

    .line 349
    :cond_0
    return-void
.end method

.method public final dumpSubclasses()V
    .locals 5

    .line 352
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/squareup/haha/perflib/Heap;

    .line 353
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "+------------------ subclasses for heap: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/squareup/haha/perflib/Heap;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 355
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/Heap;->dumpSubclasses()V

    .line 356
    goto :goto_0

    .line 357
    :cond_0
    return-void
.end method

.method public findAllDescendantClasses(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/squareup/haha/perflib/ClassObj;>;"
        }
    .end annotation

    .line 300
    invoke-virtual {p0, p1}, Lcom/squareup/haha/perflib/Snapshot;->findClasses(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object v1

    .line 301
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 302
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/squareup/haha/perflib/ClassObj;

    .line 303
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/ClassObj;->getDescendantClasses()Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 304
    goto :goto_0

    .line 305
    :cond_0
    return-object v2
.end method

.method public final findClass(J)Lcom/squareup/haha/perflib/ClassObj;
    .locals 3

    .line 213
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 214
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/haha/perflib/Heap;->getClass(J)Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v2

    .line 216
    if-eqz v2, :cond_0

    .line 217
    return-object v2

    .line 213
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 221
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final findClass(Ljava/lang/String;)Lcom/squareup/haha/perflib/ClassObj;
    .locals 3

    .line 233
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 234
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/perflib/Heap;->getClass(Ljava/lang/String;)Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v2

    .line 236
    if-eqz v2, :cond_0

    .line 237
    return-object v2

    .line 233
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 241
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final findClasses(Ljava/lang/String;)Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Collection<Lcom/squareup/haha/perflib/ClassObj;>;"
        }
    .end annotation

    .line 252
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 255
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 256
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/perflib/Heap;->getClasses(Ljava/lang/String;)Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 255
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 259
    :cond_0
    return-object v1
.end method

.method public final findInstance(J)Lcom/squareup/haha/perflib/Instance;
    .locals 3

    .line 198
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 199
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/haha/perflib/Heap;->getInstance(J)Lcom/squareup/haha/perflib/Instance;

    move-result-object v2

    .line 201
    if-eqz v2, :cond_0

    .line 202
    return-object v2

    .line 198
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 207
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/squareup/haha/perflib/Snapshot;->findClass(J)Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v0

    return-object v0
.end method

.method public getGCRoots()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Collection<Lcom/squareup/haha/perflib/RootObj;>;"
        }
    .end annotation

    .line 125
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/Heap;

    iget-object v0, v0, Lcom/squareup/haha/perflib/Heap;->mRoots:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getHeap(I)Lcom/squareup/haha/perflib/Heap;
    .locals 2

    .line 98
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 99
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/Heap;->getId()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 100
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/Heap;

    return-object v0

    .line 98
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 103
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getHeap(Ljava/lang/String;)Lcom/squareup/haha/perflib/Heap;
    .locals 2

    .line 109
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 110
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/Heap;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/Heap;

    return-object v0

    .line 109
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 114
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getHeapIndex(Lcom/squareup/haha/perflib/Heap;)I
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public getHeaps()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Collection<Lcom/squareup/haha/perflib/Heap;>;"
        }
    .end annotation

    .line 119
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getIdSizeMask()J
    .locals 2

    .line 182
    iget-wide v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mIdSizeMask:J

    return-wide v0
.end method

.method public getReachableInstances()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/squareup/haha/perflib/Instance;>;"
        }
    .end annotation

    .line 322
    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mTopSort:Lcom/squareup/haha/guava/collect/ImmutableList;

    invoke-virtual {v0}, Lcom/squareup/haha/guava/collect/ImmutableList;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 323
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mTopSort:Lcom/squareup/haha/guava/collect/ImmutableList;

    invoke-virtual {v0}, Lcom/squareup/haha/guava/collect/ImmutableList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/squareup/haha/perflib/Instance;

    .line 324
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/Instance;->getImmediateDominator()Lcom/squareup/haha/perflib/Instance;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 325
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 327
    :cond_0
    goto :goto_0

    .line 328
    :cond_1
    return-object v1
.end method

.method public final getStackFrame(J)Lcom/squareup/haha/perflib/StackFrame;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mCurrentHeap:Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/haha/perflib/Heap;->getStackFrame(J)Lcom/squareup/haha/perflib/StackFrame;

    move-result-object v0

    return-object v0
.end method

.method public final getStackTrace(I)Lcom/squareup/haha/perflib/StackTrace;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mCurrentHeap:Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/perflib/Heap;->getStackTrace(I)Lcom/squareup/haha/perflib/StackTrace;

    move-result-object v0

    return-object v0
.end method

.method public final getStackTraceAtDepth(II)Lcom/squareup/haha/perflib/StackTrace;
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mCurrentHeap:Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/haha/perflib/Heap;->getStackTraceAtDepth(II)Lcom/squareup/haha/perflib/StackTrace;

    move-result-object v0

    return-object v0
.end method

.method public final getThread(I)Lcom/squareup/haha/perflib/ThreadObj;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mCurrentHeap:Lcom/squareup/haha/perflib/Heap;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/perflib/Heap;->getThread(I)Lcom/squareup/haha/perflib/ThreadObj;

    move-result-object v0

    return-object v0
.end method

.method public getTopologicalOrdering()Lcom/squareup/haha/guava/collect/ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/squareup/haha/guava/collect/ImmutableList<Lcom/squareup/haha/perflib/Instance;>;"
        }
    .end annotation

    .line 332
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mTopSort:Lcom/squareup/haha/guava/collect/ImmutableList;

    return-object v0
.end method

.method public final getTypeSize(Lcom/squareup/haha/perflib/Type;)I
    .locals 2

    .line 178
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mTypeSizes:[I

    invoke-virtual {p1}, Lcom/squareup/haha/perflib/Type;->getTypeId()I

    move-result v1

    aget v0, v0, v1

    return v0
.end method

.method public resolveClasses()V
    .locals 13

    .line 263
    const-string v0, "java.lang.Class"

    invoke-virtual {p0, v0}, Lcom/squareup/haha/perflib/Snapshot;->findClass(Ljava/lang/String;)Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v1

    .line 264
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/ClassObj;->getInstanceSize()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 266
    :goto_0
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/squareup/haha/perflib/Heap;

    .line 267
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/Heap;->getClasses()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/squareup/haha/perflib/ClassObj;

    .line 268
    invoke-virtual {v6}, Lcom/squareup/haha/perflib/ClassObj;->getSuperClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v7

    .line 269
    if-eqz v7, :cond_1

    .line 270
    invoke-virtual {v7, v6}, Lcom/squareup/haha/perflib/ClassObj;->addSubclass(Lcom/squareup/haha/perflib/ClassObj;)V

    .line 274
    :cond_1
    move v8, v2

    .line 276
    iget-object v9, v6, Lcom/squareup/haha/perflib/ClassObj;->mStaticFields:[Lcom/squareup/haha/perflib/Field;

    array-length v10, v9

    const/4 v11, 0x0

    :goto_3
    if-ge v11, v10, :cond_2

    aget-object v12, v9, v11

    .line 277
    invoke-virtual {v12}, Lcom/squareup/haha/perflib/Field;->getType()Lcom/squareup/haha/perflib/Type;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/squareup/haha/perflib/Snapshot;->getTypeSize(Lcom/squareup/haha/perflib/Type;)I

    move-result v0

    add-int/2addr v8, v0

    .line 276
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    .line 279
    :cond_2
    invoke-virtual {v6, v8}, Lcom/squareup/haha/perflib/ClassObj;->setSize(I)V

    .line 280
    goto :goto_2

    .line 281
    :cond_3
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/Heap;->getInstances()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/squareup/haha/perflib/Instance;

    .line 282
    invoke-virtual {v6}, Lcom/squareup/haha/perflib/Instance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v7

    .line 283
    if-eqz v7, :cond_4

    .line 284
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/Heap;->getId()I

    move-result v0

    invoke-virtual {v7, v0, v6}, Lcom/squareup/haha/perflib/ClassObj;->addInstance(ILcom/squareup/haha/perflib/Instance;)V

    .line 286
    :cond_4
    goto :goto_4

    .line 287
    :cond_5
    goto/16 :goto_1

    .line 288
    :cond_6
    return-void
.end method

.method public resolveReferences()V
    .locals 4

    .line 291
    invoke-static {}, Lcom/squareup/haha/perflib/ClassObj;->getReferenceClassName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/squareup/haha/perflib/Snapshot;->findAllDescendantClasses(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 292
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/squareup/haha/perflib/ClassObj;

    .line 293
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/ClassObj;->setIsSoftReference()V

    .line 294
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mReferenceClasses:Lcom/squareup/haha/trove/THashSet;

    invoke-virtual {v0, v3}, Lcom/squareup/haha/trove/THashSet;->add(Ljava/lang/Object;)Z

    .line 295
    goto :goto_0

    .line 296
    :cond_0
    return-void
.end method

.method public setHeapTo(ILjava/lang/String;)Lcom/squareup/haha/perflib/Heap;
    .locals 2

    .line 78
    invoke-virtual {p0, p1}, Lcom/squareup/haha/perflib/Snapshot;->getHeap(I)Lcom/squareup/haha/perflib/Heap;

    move-result-object v1

    .line 80
    if-nez v1, :cond_0

    .line 81
    new-instance v1, Lcom/squareup/haha/perflib/Heap;

    invoke-direct {v1, p1, p2}, Lcom/squareup/haha/perflib/Heap;-><init>(ILjava/lang/String;)V

    .line 82
    iput-object p0, v1, Lcom/squareup/haha/perflib/Heap;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    .line 83
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    :cond_0
    iput-object v1, p0, Lcom/squareup/haha/perflib/Snapshot;->mCurrentHeap:Lcom/squareup/haha/perflib/Heap;

    .line 88
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mCurrentHeap:Lcom/squareup/haha/perflib/Heap;

    return-object v0
.end method

.method public final setIdSize(I)V
    .locals 5

    .line 162
    const/4 v3, -0x1

    .line 163
    const/4 v4, 0x0

    :goto_0
    invoke-static {}, Lcom/squareup/haha/perflib/Type;->values()[Lcom/squareup/haha/perflib/Type;

    move-result-object v0

    array-length v0, v0

    if-ge v4, v0, :cond_0

    .line 164
    invoke-static {}, Lcom/squareup/haha/perflib/Type;->values()[Lcom/squareup/haha/perflib/Type;

    move-result-object v0

    aget-object v0, v0, v4

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/Type;->getTypeId()I

    move-result v0

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 163
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 166
    :cond_0
    sget-boolean v0, Lcom/squareup/haha/perflib/Snapshot;->$assertionsDisabled:Z

    if-nez v0, :cond_2

    if-lez v3, :cond_1

    sget-object v0, Lcom/squareup/haha/perflib/Type;->LONG:Lcom/squareup/haha/perflib/Type;

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/Type;->getTypeId()I

    move-result v0

    if-le v3, v0, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 167
    :cond_2
    add-int/lit8 v0, v3, 0x1

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mTypeSizes:[I

    .line 168
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mTypeSizes:[I

    const/4 v1, -0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 170
    const/4 v4, 0x0

    :goto_1
    invoke-static {}, Lcom/squareup/haha/perflib/Type;->values()[Lcom/squareup/haha/perflib/Type;

    move-result-object v0

    array-length v0, v0

    if-ge v4, v0, :cond_3

    .line 171
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mTypeSizes:[I

    invoke-static {}, Lcom/squareup/haha/perflib/Type;->values()[Lcom/squareup/haha/perflib/Type;

    move-result-object v1

    aget-object v1, v1, v4

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/Type;->getTypeId()I

    move-result v1

    invoke-static {}, Lcom/squareup/haha/perflib/Type;->values()[Lcom/squareup/haha/perflib/Type;

    move-result-object v2

    aget-object v2, v2, v4

    invoke-virtual {v2}, Lcom/squareup/haha/perflib/Type;->getSize()I

    move-result v2

    aput v2, v0, v1

    .line 170
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 173
    :cond_3
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mTypeSizes:[I

    sget-object v1, Lcom/squareup/haha/perflib/Type;->OBJECT:Lcom/squareup/haha/perflib/Type;

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/Type;->getTypeId()I

    move-result v1

    aput p1, v0, v1

    .line 174
    rsub-int/lit8 v0, p1, 0x8

    shl-int/lit8 v0, v0, 0x3

    const-wide/16 v1, -0x1

    ushr-long v0, v1, v0

    iput-wide v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mIdSizeMask:J

    .line 175
    return-void
.end method

.method public setToDefaultHeap()Lcom/squareup/haha/perflib/Heap;
    .locals 2

    .line 73
    const-string v0, "default"

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/squareup/haha/perflib/Snapshot;->setHeapTo(ILjava/lang/String;)Lcom/squareup/haha/perflib/Heap;

    move-result-object v0

    return-object v0
.end method
