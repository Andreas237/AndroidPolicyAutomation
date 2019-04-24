.class public Lcom/squareup/haha/perflib/Heap;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field mClassesById:Lcom/squareup/haha/trove/TLongObjectHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/trove/TLongObjectHashMap<Lcom/squareup/haha/perflib/ClassObj;>;"
        }
    .end annotation
.end field

.field mClassesByName:Lcom/squareup/haha/guava/collect/Multimap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/guava/collect/Multimap<Ljava/lang/String;Lcom/squareup/haha/perflib/ClassObj;>;"
        }
    .end annotation
.end field

.field mFrames:Lcom/squareup/haha/trove/TLongObjectHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/trove/TLongObjectHashMap<Lcom/squareup/haha/perflib/StackFrame;>;"
        }
    .end annotation
.end field

.field private final mId:I

.field private final mInstances:Lcom/squareup/haha/trove/TLongObjectHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/trove/TLongObjectHashMap<Lcom/squareup/haha/perflib/Instance;>;"
        }
    .end annotation
.end field

.field private final mName:Ljava/lang/String;

.field mRoots:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/squareup/haha/perflib/RootObj;>;"
        }
    .end annotation
.end field

.field mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

.field mThreads:Lcom/squareup/haha/trove/TIntObjectHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/trove/TIntObjectHashMap<Lcom/squareup/haha/perflib/ThreadObj;>;"
        }
    .end annotation
.end field

.field mTraces:Lcom/squareup/haha/trove/TIntObjectHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/trove/TIntObjectHashMap<Lcom/squareup/haha/perflib/StackTrace;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-direct {v0}, Lcom/squareup/haha/trove/TLongObjectHashMap;-><init>()V

    iput-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mFrames:Lcom/squareup/haha/trove/TLongObjectHashMap;

    .line 41
    new-instance v0, Lcom/squareup/haha/trove/TIntObjectHashMap;

    invoke-direct {v0}, Lcom/squareup/haha/trove/TIntObjectHashMap;-><init>()V

    iput-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mTraces:Lcom/squareup/haha/trove/TIntObjectHashMap;

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mRoots:Ljava/util/ArrayList;

    .line 49
    new-instance v0, Lcom/squareup/haha/trove/TIntObjectHashMap;

    invoke-direct {v0}, Lcom/squareup/haha/trove/TIntObjectHashMap;-><init>()V

    iput-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mThreads:Lcom/squareup/haha/trove/TIntObjectHashMap;

    .line 53
    new-instance v0, Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-direct {v0}, Lcom/squareup/haha/trove/TLongObjectHashMap;-><init>()V

    iput-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mClassesById:Lcom/squareup/haha/trove/TLongObjectHashMap;

    .line 56
    invoke-static {}, Lcom/squareup/haha/guava/collect/ArrayListMultimap;->create()Lcom/squareup/haha/guava/collect/ArrayListMultimap;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mClassesByName:Lcom/squareup/haha/guava/collect/Multimap;

    .line 59
    new-instance v0, Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-direct {v0}, Lcom/squareup/haha/trove/TLongObjectHashMap;-><init>()V

    iput-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mInstances:Lcom/squareup/haha/trove/TLongObjectHashMap;

    .line 65
    iput p1, p0, Lcom/squareup/haha/perflib/Heap;->mId:I

    .line 66
    iput-object p2, p0, Lcom/squareup/haha/perflib/Heap;->mName:Ljava/lang/String;

    .line 67
    return-void
.end method


# virtual methods
.method public final addClass(JLcom/squareup/haha/perflib/ClassObj;)V
    .locals 2

    .line 127
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mClassesById:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-virtual {v0, p1, p2, p3}, Lcom/squareup/haha/trove/TLongObjectHashMap;->put(JLjava/lang/Object;)Ljava/lang/Object;

    .line 128
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mClassesByName:Lcom/squareup/haha/guava/collect/Multimap;

    iget-object v1, p3, Lcom/squareup/haha/perflib/ClassObj;->mClassName:Ljava/lang/String;

    invoke-interface {v0, v1, p3}, Lcom/squareup/haha/guava/collect/Multimap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    return-void
.end method

.method public final addInstance(JLcom/squareup/haha/perflib/Instance;)V
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mInstances:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-virtual {v0, p1, p2, p3}, Lcom/squareup/haha/trove/TLongObjectHashMap;->put(JLjava/lang/Object;)Ljava/lang/Object;

    .line 120
    return-void
.end method

.method public final addRoot(Lcom/squareup/haha/perflib/RootObj;)V
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mRoots:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p1, Lcom/squareup/haha/perflib/RootObj;->mIndex:I

    .line 107
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mRoots:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    return-void
.end method

.method public final addStackFrame(Lcom/squareup/haha/perflib/StackFrame;)V
    .locals 3

    .line 79
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mFrames:Lcom/squareup/haha/trove/TLongObjectHashMap;

    iget-wide v1, p1, Lcom/squareup/haha/perflib/StackFrame;->mId:J

    invoke-virtual {v0, v1, v2, p1}, Lcom/squareup/haha/trove/TLongObjectHashMap;->put(JLjava/lang/Object;)Ljava/lang/Object;

    .line 80
    return-void
.end method

.method public final addStackTrace(Lcom/squareup/haha/perflib/StackTrace;)V
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mTraces:Lcom/squareup/haha/trove/TIntObjectHashMap;

    iget v1, p1, Lcom/squareup/haha/perflib/StackTrace;->mSerialNumber:I

    invoke-virtual {v0, v1, p1}, Lcom/squareup/haha/trove/TIntObjectHashMap;->put(ILjava/lang/Object;)Ljava/lang/Object;

    .line 88
    return-void
.end method

.method public final addThread(Lcom/squareup/haha/perflib/ThreadObj;I)V
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mThreads:Lcom/squareup/haha/trove/TIntObjectHashMap;

    invoke-virtual {v0, p2, p1}, Lcom/squareup/haha/trove/TIntObjectHashMap;->put(ILjava/lang/Object;)Ljava/lang/Object;

    .line 112
    return-void
.end method

.method public final dumpInstanceCounts()V
    .locals 9

    .line 148
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mClassesById:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-virtual {v0}, Lcom/squareup/haha/trove/TLongObjectHashMap;->getValues()[Ljava/lang/Object;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 149
    move-object v7, v6

    check-cast v7, Lcom/squareup/haha/perflib/ClassObj;

    .line 150
    invoke-virtual {v7}, Lcom/squareup/haha/perflib/ClassObj;->getInstanceCount()I

    move-result v0

    .line 152
    move v8, v0

    if-lez v0, :cond_0

    .line 153
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 148
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 156
    :cond_1
    return-void
.end method

.method public final dumpSizes()V
    .locals 11

    .line 171
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mClassesById:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-virtual {v0}, Lcom/squareup/haha/trove/TLongObjectHashMap;->getValues()[Ljava/lang/Object;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    .line 172
    move-object v7, v6

    check-cast v7, Lcom/squareup/haha/perflib/ClassObj;

    .line 174
    const/4 v8, 0x0

    .line 176
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Heap;->getId()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/squareup/haha/perflib/ClassObj;->getHeapInstances(I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/squareup/haha/perflib/Instance;

    .line 177
    invoke-virtual {v10}, Lcom/squareup/haha/perflib/Instance;->getCompositeSize()I

    move-result v0

    add-int/2addr v8, v0

    .line 178
    goto :goto_1

    .line 180
    :cond_0
    if-lez v8, :cond_1

    .line 181
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": base "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Lcom/squareup/haha/perflib/ClassObj;->getSize()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", composite "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 171
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 185
    :cond_2
    return-void
.end method

.method public final dumpSubclasses()V
    .locals 7

    .line 159
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mClassesById:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-virtual {v0}, Lcom/squareup/haha/trove/TLongObjectHashMap;->getValues()[Ljava/lang/Object;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 160
    move-object v5, v4

    check-cast v5, Lcom/squareup/haha/perflib/ClassObj;

    .line 161
    iget-object v0, v5, Lcom/squareup/haha/perflib/ClassObj;->mSubclasses:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    .line 163
    move v6, v0

    if-lez v0, :cond_0

    .line 164
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v5}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 165
    invoke-virtual {v5}, Lcom/squareup/haha/perflib/ClassObj;->dumpSubclasses()V

    .line 159
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 168
    :cond_1
    return-void
.end method

.method public final getClass(J)Lcom/squareup/haha/perflib/ClassObj;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mClassesById:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/haha/trove/TLongObjectHashMap;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/ClassObj;

    return-object v0
.end method

.method public final getClass(Ljava/lang/String;)Lcom/squareup/haha/perflib/ClassObj;
    .locals 3

    .line 136
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mClassesByName:Lcom/squareup/haha/guava/collect/Multimap;

    invoke-interface {v0, p1}, Lcom/squareup/haha/guava/collect/Multimap;->get(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v2

    .line 137
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 138
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/ClassObj;

    return-object v0

    .line 140
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getClasses()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Collection<Lcom/squareup/haha/perflib/ClassObj;>;"
        }
    .end annotation

    .line 189
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mClassesByName:Lcom/squareup/haha/guava/collect/Multimap;

    invoke-interface {v0}, Lcom/squareup/haha/guava/collect/Multimap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final getClasses(Ljava/lang/String;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Collection<Lcom/squareup/haha/perflib/ClassObj;>;"
        }
    .end annotation

    .line 144
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mClassesByName:Lcom/squareup/haha/guava/collect/Multimap;

    invoke-interface {v0, p1}, Lcom/squareup/haha/guava/collect/Multimap;->get(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 70
    iget v0, p0, Lcom/squareup/haha/perflib/Heap;->mId:I

    return v0
.end method

.method public final getInstance(J)Lcom/squareup/haha/perflib/Instance;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mInstances:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/haha/trove/TLongObjectHashMap;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/Instance;

    return-object v0
.end method

.method public getInstances()Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Collection<Lcom/squareup/haha/perflib/Instance;>;"
        }
    .end annotation

    .line 194
    new-instance v2, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mInstances:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-virtual {v0}, Lcom/squareup/haha/trove/TLongObjectHashMap;->size()I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 195
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mInstances:Lcom/squareup/haha/trove/TLongObjectHashMap;

    new-instance v1, Lcom/squareup/haha/perflib/Heap$1;

    invoke-direct {v1, p0, v2}, Lcom/squareup/haha/perflib/Heap$1;-><init>(Lcom/squareup/haha/perflib/Heap;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Lcom/squareup/haha/trove/TLongObjectHashMap;->forEachValue(Lcom/squareup/haha/trove/TObjectProcedure;)Z

    .line 202
    return-object v2
.end method

.method public getInstancesCount()I
    .locals 1

    .line 206
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mInstances:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-virtual {v0}, Lcom/squareup/haha/trove/TLongObjectHashMap;->size()I

    move-result v0

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public final getStackFrame(J)Lcom/squareup/haha/perflib/StackFrame;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mFrames:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/haha/trove/TLongObjectHashMap;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/StackFrame;

    return-object v0
.end method

.method public final getStackTrace(I)Lcom/squareup/haha/perflib/StackTrace;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mTraces:Lcom/squareup/haha/trove/TIntObjectHashMap;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/trove/TIntObjectHashMap;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/StackTrace;

    return-object v0
.end method

.method public final getStackTraceAtDepth(II)Lcom/squareup/haha/perflib/StackTrace;
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mTraces:Lcom/squareup/haha/trove/TIntObjectHashMap;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/trove/TIntObjectHashMap;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/squareup/haha/perflib/StackTrace;

    .line 98
    if-eqz v1, :cond_0

    .line 99
    invoke-virtual {v1, p2}, Lcom/squareup/haha/perflib/StackTrace;->fromDepth(I)Lcom/squareup/haha/perflib/StackTrace;

    move-result-object v1

    .line 102
    :cond_0
    return-object v1
.end method

.method public final getThread(I)Lcom/squareup/haha/perflib/ThreadObj;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap;->mThreads:Lcom/squareup/haha/trove/TIntObjectHashMap;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/trove/TIntObjectHashMap;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/ThreadObj;

    return-object v0
.end method
