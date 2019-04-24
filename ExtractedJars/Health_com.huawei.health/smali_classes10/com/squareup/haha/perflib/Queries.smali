.class public Lcom/squareup/haha/perflib/Queries;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DEFAULT_PACKAGE:Ljava/lang/String; = "<default>"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static allClasses(Lcom/squareup/haha/perflib/Snapshot;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/perflib/Snapshot;)Ljava/util/Map<Ljava/lang/String;Ljava/util/Set<Lcom/squareup/haha/perflib/ClassObj;>;>;"
        }
    .end annotation

    .line 64
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/squareup/haha/perflib/Queries;->classes(Lcom/squareup/haha/perflib/Snapshot;[Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static allInstancesOf(Lcom/squareup/haha/perflib/Snapshot;Ljava/lang/String;)[Lcom/squareup/haha/perflib/Instance;
    .locals 8

    .line 172
    invoke-virtual {p0, p1}, Lcom/squareup/haha/perflib/Snapshot;->findClass(Ljava/lang/String;)Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v3

    .line 174
    if-nez v3, :cond_0

    .line 175
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Class not found: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 178
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 180
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    invoke-static {v3}, Lcom/squareup/haha/perflib/Queries;->traverseSubclasses(Lcom/squareup/haha/perflib/ClassObj;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 183
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 185
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/squareup/haha/perflib/ClassObj;

    .line 186
    invoke-virtual {v7}, Lcom/squareup/haha/perflib/ClassObj;->getInstancesList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 187
    goto :goto_0

    .line 189
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v6, v0, [Lcom/squareup/haha/perflib/Instance;

    .line 191
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 193
    return-object v6
.end method

.method public static classes(Lcom/squareup/haha/perflib/Snapshot;[Ljava/lang/String;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/perflib/Snapshot;[Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/util/Set<Lcom/squareup/haha/perflib/ClassObj;>;>;"
        }
    .end annotation

    .line 70
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 73
    new-instance v3, Ljava/util/TreeSet;

    invoke-direct {v3}, Ljava/util/TreeSet;-><init>()V

    .line 76
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/squareup/haha/perflib/Heap;

    .line 77
    invoke-virtual {v5}, Lcom/squareup/haha/perflib/Heap;->getClasses()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 78
    goto :goto_0

    .line 81
    :cond_0
    if-eqz p1, :cond_3

    .line 82
    array-length v4, p1

    .line 83
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 85
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 86
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/squareup/haha/perflib/ClassObj;

    .line 87
    invoke-virtual {v6}, Lcom/squareup/haha/perflib/ClassObj;->toString()Ljava/lang/String;

    move-result-object v7

    .line 89
    const/4 v8, 0x0

    :goto_2
    if-ge v8, v4, :cond_2

    .line 90
    aget-object v0, p1, v8

    invoke-virtual {v7, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    .line 92
    goto :goto_1

    .line 89
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 95
    :cond_2
    goto :goto_1

    .line 99
    :cond_3
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/squareup/haha/perflib/ClassObj;

    .line 100
    const-string v6, "<default>"

    .line 101
    iget-object v0, v5, Lcom/squareup/haha/perflib/ClassObj;->mClassName:Ljava/lang/String;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    .line 103
    move v7, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    .line 104
    iget-object v0, v5, Lcom/squareup/haha/perflib/ClassObj;->mClassName:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 107
    :cond_4
    invoke-virtual {v2, v6}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Set;

    .line 109
    if-nez v8, :cond_5

    .line 110
    new-instance v8, Ljava/util/TreeSet;

    invoke-direct {v8}, Ljava/util/TreeSet;-><init>()V

    .line 111
    invoke-virtual {v2, v6, v8}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    :cond_5
    invoke-interface {v8, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 115
    goto :goto_3

    .line 117
    :cond_6
    return-object v2
.end method

.method public static commonClasses(Lcom/squareup/haha/perflib/Snapshot;Lcom/squareup/haha/perflib/Snapshot;)Ljava/util/Collection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/perflib/Snapshot;Lcom/squareup/haha/perflib/Snapshot;)Ljava/util/Collection<Lcom/squareup/haha/perflib/ClassObj;>;"
        }
    .end annotation

    .line 130
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 131
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Snapshot;->getHeaps()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/squareup/haha/perflib/Heap;

    .line 132
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/Heap;->getClasses()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/squareup/haha/perflib/ClassObj;

    .line 133
    invoke-virtual {v5}, Lcom/squareup/haha/perflib/ClassObj;->getClassName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/squareup/haha/perflib/Snapshot;->findClass(Ljava/lang/String;)Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 134
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 136
    :cond_0
    goto :goto_1

    .line 137
    :cond_1
    goto :goto_0

    .line 138
    :cond_2
    return-object v1
.end method

.method public static findClass(Lcom/squareup/haha/perflib/Snapshot;Ljava/lang/String;)Lcom/squareup/haha/perflib/ClassObj;
    .locals 1

    .line 147
    invoke-virtual {p0, p1}, Lcom/squareup/haha/perflib/Snapshot;->findClass(Ljava/lang/String;)Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v0

    return-object v0
.end method

.method public static findObject(Lcom/squareup/haha/perflib/Snapshot;Ljava/lang/String;)Lcom/squareup/haha/perflib/Instance;
    .locals 3

    .line 213
    const/16 v0, 0x10

    invoke-static {p1, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    .line 215
    invoke-virtual {p0, v1, v2}, Lcom/squareup/haha/perflib/Snapshot;->findInstance(J)Lcom/squareup/haha/perflib/Instance;

    move-result-object v0

    return-object v0
.end method

.method public static getRoots(Lcom/squareup/haha/perflib/Snapshot;)Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/perflib/Snapshot;)Ljava/util/Collection<Lcom/squareup/haha/perflib/RootObj;>;"
        }
    .end annotation

    .line 220
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 222
    iget-object v0, p0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/squareup/haha/perflib/Heap;

    .line 223
    iget-object v0, v3, Lcom/squareup/haha/perflib/Heap;->mRoots:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    .line 224
    goto :goto_0

    .line 226
    :cond_0
    return-object v1
.end method

.method public static instancesOf(Lcom/squareup/haha/perflib/Snapshot;Ljava/lang/String;)[Lcom/squareup/haha/perflib/Instance;
    .locals 5

    .line 156
    invoke-virtual {p0, p1}, Lcom/squareup/haha/perflib/Snapshot;->findClass(Ljava/lang/String;)Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v3

    .line 158
    if-nez v3, :cond_0

    .line 159
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Class not found: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 162
    :cond_0
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/ClassObj;->getInstancesList()Ljava/util/List;

    move-result-object v4

    .line 163
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/squareup/haha/perflib/Instance;

    invoke-interface {v4, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/squareup/haha/perflib/Instance;

    return-object v0
.end method

.method public static final newInstances(Lcom/squareup/haha/perflib/Snapshot;Lcom/squareup/haha/perflib/Snapshot;)[Lcom/squareup/haha/perflib/Instance;
    .locals 9

    .line 231
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 233
    iget-object v0, p1, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/squareup/haha/perflib/Heap;

    .line 234
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/Heap;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/squareup/haha/perflib/Snapshot;->getHeap(Ljava/lang/String;)Lcom/squareup/haha/perflib/Heap;

    move-result-object v5

    .line 236
    if-eqz v5, :cond_0

    .line 240
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/Heap;->getInstances()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/squareup/haha/perflib/Instance;

    .line 241
    iget-wide v0, v7, Lcom/squareup/haha/perflib/Instance;->mId:J

    invoke-virtual {v5, v0, v1}, Lcom/squareup/haha/perflib/Heap;->getInstance(J)Lcom/squareup/haha/perflib/Instance;

    move-result-object v8

    .line 249
    if-eqz v8, :cond_1

    invoke-virtual {v7}, Lcom/squareup/haha/perflib/Instance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v0

    invoke-virtual {v8}, Lcom/squareup/haha/perflib/Instance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 250
    :cond_1
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    :cond_2
    goto :goto_1

    .line 253
    :cond_3
    goto :goto_0

    .line 255
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v3, v0, [Lcom/squareup/haha/perflib/Instance;

    .line 257
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/squareup/haha/perflib/Instance;

    return-object v0
.end method

.method private static traverseSubclasses(Lcom/squareup/haha/perflib/ClassObj;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/perflib/ClassObj;)Ljava/util/ArrayList<Lcom/squareup/haha/perflib/ClassObj;>;"
        }
    .end annotation

    .line 198
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 200
    iget-object v0, p0, Lcom/squareup/haha/perflib/ClassObj;->mSubclasses:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/squareup/haha/perflib/ClassObj;

    .line 201
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    invoke-static {v3}, Lcom/squareup/haha/perflib/Queries;->traverseSubclasses(Lcom/squareup/haha/perflib/ClassObj;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 203
    goto :goto_0

    .line 205
    :cond_0
    return-object v1
.end method
