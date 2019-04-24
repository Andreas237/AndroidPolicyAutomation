.class final Lcom/squareup/leakcanary/ShortestPathFinder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/leakcanary/ShortestPathFinder$Result;
    }
.end annotation


# instance fields
.field private canIgnoreStrings:Z

.field private final excludedRefs:Lcom/squareup/leakcanary/ExcludedRefs;

.field private final toVisitIfNoPathQueue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Lcom/squareup/leakcanary/LeakNode;>;"
        }
    .end annotation
.end field

.field private final toVisitIfNoPathSet:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<Lcom/squareup/haha/perflib/Instance;>;"
        }
    .end annotation
.end field

.field private final toVisitQueue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Lcom/squareup/leakcanary/LeakNode;>;"
        }
    .end annotation
.end field

.field private final toVisitSet:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<Lcom/squareup/haha/perflib/Instance;>;"
        }
    .end annotation
.end field

.field private final visitedSet:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<Lcom/squareup/haha/perflib/Instance;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/squareup/leakcanary/ExcludedRefs;)V
    .locals 1

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->excludedRefs:Lcom/squareup/leakcanary/ExcludedRefs;

    .line 61
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitQueue:Ljava/util/Queue;

    .line 62
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitIfNoPathQueue:Ljava/util/Queue;

    .line 63
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitSet:Ljava/util/LinkedHashSet;

    .line 64
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitIfNoPathSet:Ljava/util/LinkedHashSet;

    .line 65
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->visitedSet:Ljava/util/LinkedHashSet;

    .line 66
    return-void
.end method

.method private checkSeen(Lcom/squareup/leakcanary/LeakNode;)Z
    .locals 2

    .line 175
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->visitedSet:Ljava/util/LinkedHashSet;

    iget-object v1, p1, Lcom/squareup/leakcanary/LeakNode;->instance:Lcom/squareup/haha/perflib/Instance;

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private clearState()V
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    .line 125
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitIfNoPathQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    .line 126
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitSet:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->clear()V

    .line 127
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitIfNoPathSet:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->clear()V

    .line 128
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->visitedSet:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->clear()V

    .line 129
    return-void
.end method

.method private enqueue(Lcom/squareup/leakcanary/Exclusion;Lcom/squareup/leakcanary/LeakNode;Lcom/squareup/haha/perflib/Instance;Ljava/lang/String;Lcom/squareup/leakcanary/LeakTraceElement$Type;)V
    .locals 8

    .line 284
    if-nez p3, :cond_0

    .line 285
    return-void

    .line 287
    :cond_0
    invoke-static {p3}, Lcom/squareup/leakcanary/HahaHelper;->isPrimitiveOrWrapperArray(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p3}, Lcom/squareup/leakcanary/HahaHelper;->isPrimitiveWrapper(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 288
    :cond_1
    return-void

    .line 291
    :cond_2
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitSet:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p3}, Ljava/util/LinkedHashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 292
    return-void

    .line 294
    :cond_3
    if-nez p1, :cond_4

    const/4 v6, 0x1

    goto :goto_0

    :cond_4
    const/4 v6, 0x0

    .line 295
    :goto_0
    if-nez v6, :cond_5

    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitIfNoPathSet:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p3}, Ljava/util/LinkedHashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 296
    return-void

    .line 298
    :cond_5
    iget-boolean v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->canIgnoreStrings:Z

    if-eqz v0, :cond_6

    invoke-direct {p0, p3}, Lcom/squareup/leakcanary/ShortestPathFinder;->isString(Lcom/squareup/haha/perflib/Instance;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 299
    return-void

    .line 301
    :cond_6
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->visitedSet:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p3}, Ljava/util/LinkedHashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 302
    return-void

    .line 304
    :cond_7
    new-instance v0, Lcom/squareup/leakcanary/LeakNode;

    move-object v1, p1

    move-object v2, p3

    move-object v3, p2

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/squareup/leakcanary/LeakNode;-><init>(Lcom/squareup/leakcanary/Exclusion;Lcom/squareup/haha/perflib/Instance;Lcom/squareup/leakcanary/LeakNode;Ljava/lang/String;Lcom/squareup/leakcanary/LeakTraceElement$Type;)V

    move-object v7, v0

    .line 305
    if-eqz v6, :cond_8

    .line 306
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitSet:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p3}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    .line 307
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitQueue:Ljava/util/Queue;

    invoke-interface {v0, v7}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 309
    :cond_8
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitIfNoPathSet:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p3}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    .line 310
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitIfNoPathQueue:Ljava/util/Queue;

    invoke-interface {v0, v7}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 312
    :goto_1
    return-void
.end method

.method private enqueueGcRoots(Lcom/squareup/haha/perflib/Snapshot;)V
    .locals 11

    .line 132
    invoke-virtual {p1}, Lcom/squareup/haha/perflib/Snapshot;->getGCRoots()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/squareup/haha/perflib/RootObj;

    .line 133
    sget-object v0, Lcom/squareup/leakcanary/ShortestPathFinder$1;->$SwitchMap$com$squareup$haha$perflib$RootType:[I

    invoke-virtual {v7}, Lcom/squareup/haha/perflib/RootObj;->getRootType()Lcom/squareup/haha/perflib/RootType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/RootType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 135
    :pswitch_0
    invoke-static {v7}, Lcom/squareup/haha/perflib/HahaSpy;->allocatingThread(Lcom/squareup/haha/perflib/Instance;)Lcom/squareup/haha/perflib/Instance;

    move-result-object v8

    .line 136
    invoke-static {v8}, Lcom/squareup/leakcanary/HahaHelper;->threadName(Lcom/squareup/haha/perflib/Instance;)Ljava/lang/String;

    move-result-object v9

    .line 137
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->excludedRefs:Lcom/squareup/leakcanary/ExcludedRefs;

    iget-object v0, v0, Lcom/squareup/leakcanary/ExcludedRefs;->threadNames:Ljava/util/Map;

    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/squareup/leakcanary/Exclusion;

    .line 138
    if-eqz v10, :cond_0

    iget-boolean v0, v10, Lcom/squareup/leakcanary/Exclusion;->alwaysExclude:Z

    if-nez v0, :cond_1

    .line 139
    :cond_0
    move-object v0, p0

    move-object v1, v10

    move-object v3, v7

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/squareup/leakcanary/ShortestPathFinder;->enqueue(Lcom/squareup/leakcanary/Exclusion;Lcom/squareup/leakcanary/LeakNode;Lcom/squareup/haha/perflib/Instance;Ljava/lang/String;Lcom/squareup/leakcanary/LeakTraceElement$Type;)V

    goto :goto_2

    .line 150
    :pswitch_1
    goto :goto_2

    .line 166
    :pswitch_2
    move-object v0, p0

    move-object v3, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/squareup/leakcanary/ShortestPathFinder;->enqueue(Lcom/squareup/leakcanary/Exclusion;Lcom/squareup/leakcanary/LeakNode;Lcom/squareup/haha/perflib/Instance;Ljava/lang/String;Lcom/squareup/leakcanary/LeakTraceElement$Type;)V

    .line 167
    goto :goto_2

    .line 169
    :goto_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown root type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Lcom/squareup/haha/perflib/RootObj;->getRootType()Lcom/squareup/haha/perflib/RootType;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 171
    :cond_1
    :goto_2
    goto/16 :goto_0

    .line 172
    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method private isString(Lcom/squareup/haha/perflib/Instance;)Z
    .locals 2

    .line 315
    invoke-virtual {p1}, Lcom/squareup/haha/perflib/Instance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/squareup/haha/perflib/Instance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v0

    .line 316
    invoke-virtual {v0}, Lcom/squareup/haha/perflib/ClassObj;->getClassName()Ljava/lang/String;

    move-result-object v0

    const-class v1, Ljava/lang/String;

    .line 317
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 315
    :goto_0
    return v0
.end method

.method private visitArrayInstance(Lcom/squareup/leakcanary/LeakNode;)V
    .locals 11

    .line 271
    iget-object v0, p1, Lcom/squareup/leakcanary/LeakNode;->instance:Lcom/squareup/haha/perflib/Instance;

    move-object v6, v0

    check-cast v6, Lcom/squareup/haha/perflib/ArrayInstance;

    .line 272
    invoke-virtual {v6}, Lcom/squareup/haha/perflib/ArrayInstance;->getArrayType()Lcom/squareup/haha/perflib/Type;

    move-result-object v7

    .line 273
    sget-object v0, Lcom/squareup/haha/perflib/Type;->OBJECT:Lcom/squareup/haha/perflib/Type;

    if-ne v7, v0, :cond_0

    .line 274
    invoke-virtual {v6}, Lcom/squareup/haha/perflib/ArrayInstance;->getValues()[Ljava/lang/Object;

    move-result-object v8

    .line 275
    const/4 v9, 0x0

    :goto_0
    array-length v0, v8

    if-ge v9, v0, :cond_0

    .line 276
    aget-object v0, v8, v9

    move-object v10, v0

    check-cast v10, Lcom/squareup/haha/perflib/Instance;

    .line 277
    move-object v0, p0

    move-object v2, p1

    move-object v3, v10

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "["

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "]"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/squareup/leakcanary/LeakTraceElement$Type;->ARRAY_ENTRY:Lcom/squareup/leakcanary/LeakTraceElement$Type;

    const/4 v1, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/squareup/leakcanary/ShortestPathFinder;->enqueue(Lcom/squareup/leakcanary/Exclusion;Lcom/squareup/leakcanary/LeakNode;Lcom/squareup/haha/perflib/Instance;Ljava/lang/String;Lcom/squareup/leakcanary/LeakTraceElement$Type;)V

    .line 275
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 280
    :cond_0
    return-void
.end method

.method private visitClassInstance(Lcom/squareup/leakcanary/LeakNode;)V
    .locals 17

    .line 228
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/squareup/leakcanary/LeakNode;->instance:Lcom/squareup/haha/perflib/Instance;

    move-object v6, v0

    check-cast v6, Lcom/squareup/haha/perflib/ClassInstance;

    .line 229
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 230
    invoke-virtual {v6}, Lcom/squareup/haha/perflib/ClassInstance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v8

    .line 231
    const/4 v9, 0x0

    .line 232
    :goto_0
    if-eqz v8, :cond_3

    .line 233
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/leakcanary/ShortestPathFinder;->excludedRefs:Lcom/squareup/leakcanary/ExcludedRefs;

    iget-object v0, v0, Lcom/squareup/leakcanary/ExcludedRefs;->classNames:Ljava/util/Map;

    invoke-virtual {v8}, Lcom/squareup/haha/perflib/ClassObj;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/squareup/leakcanary/Exclusion;

    .line 234
    if-eqz v10, :cond_1

    .line 236
    if-eqz v9, :cond_0

    iget-boolean v0, v9, Lcom/squareup/leakcanary/Exclusion;->alwaysExclude:Z

    if-nez v0, :cond_1

    .line 237
    :cond_0
    move-object v9, v10

    .line 240
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/leakcanary/ShortestPathFinder;->excludedRefs:Lcom/squareup/leakcanary/ExcludedRefs;

    iget-object v0, v0, Lcom/squareup/leakcanary/ExcludedRefs;->fieldNameByClassName:Ljava/util/Map;

    .line 241
    invoke-virtual {v8}, Lcom/squareup/haha/perflib/ClassObj;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/util/Map;

    .line 242
    if-eqz v11, :cond_2

    .line 243
    invoke-interface {v7, v11}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 245
    :cond_2
    invoke-virtual {v8}, Lcom/squareup/haha/perflib/ClassObj;->getSuperClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v8

    .line 246
    goto :goto_0

    .line 248
    :cond_3
    if-eqz v9, :cond_4

    iget-boolean v0, v9, Lcom/squareup/leakcanary/Exclusion;->alwaysExclude:Z

    if-eqz v0, :cond_4

    .line 249
    return-void

    .line 252
    :cond_4
    invoke-virtual {v6}, Lcom/squareup/haha/perflib/ClassInstance;->getValues()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;

    .line 253
    move-object v12, v9

    .line 254
    invoke-virtual {v11}, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;->getField()Lcom/squareup/haha/perflib/Field;

    move-result-object v13

    .line 255
    invoke-virtual {v13}, Lcom/squareup/haha/perflib/Field;->getType()Lcom/squareup/haha/perflib/Type;

    move-result-object v0

    sget-object v1, Lcom/squareup/haha/perflib/Type;->OBJECT:Lcom/squareup/haha/perflib/Type;

    if-eq v0, v1, :cond_5

    .line 256
    goto :goto_1

    .line 258
    :cond_5
    invoke-virtual {v11}, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/squareup/haha/perflib/Instance;

    .line 259
    invoke-virtual {v13}, Lcom/squareup/haha/perflib/Field;->getName()Ljava/lang/String;

    move-result-object v15

    .line 260
    invoke-interface {v7, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/squareup/leakcanary/Exclusion;

    .line 262
    if-eqz v16, :cond_7

    if-eqz v12, :cond_6

    move-object/from16 v0, v16

    iget-boolean v0, v0, Lcom/squareup/leakcanary/Exclusion;->alwaysExclude:Z

    if-eqz v0, :cond_7

    iget-boolean v0, v12, Lcom/squareup/leakcanary/Exclusion;->alwaysExclude:Z

    if-nez v0, :cond_7

    .line 264
    :cond_6
    move-object/from16 v12, v16

    .line 266
    :cond_7
    move-object/from16 v0, p0

    move-object v1, v12

    move-object/from16 v2, p1

    move-object v3, v14

    move-object v4, v15

    sget-object v5, Lcom/squareup/leakcanary/LeakTraceElement$Type;->INSTANCE_FIELD:Lcom/squareup/leakcanary/LeakTraceElement$Type;

    invoke-direct/range {v0 .. v5}, Lcom/squareup/leakcanary/ShortestPathFinder;->enqueue(Lcom/squareup/leakcanary/Exclusion;Lcom/squareup/leakcanary/LeakNode;Lcom/squareup/haha/perflib/Instance;Ljava/lang/String;Lcom/squareup/leakcanary/LeakTraceElement$Type;)V

    .line 267
    goto :goto_1

    .line 268
    :cond_8
    return-void
.end method

.method private visitClassObj(Lcom/squareup/leakcanary/LeakNode;)V
    .locals 15

    .line 198
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/squareup/leakcanary/LeakNode;->instance:Lcom/squareup/haha/perflib/Instance;

    move-object v6, v0

    check-cast v6, Lcom/squareup/haha/perflib/ClassObj;

    .line 199
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->excludedRefs:Lcom/squareup/leakcanary/ExcludedRefs;

    iget-object v0, v0, Lcom/squareup/leakcanary/ExcludedRefs;->staticFieldNameByClassName:Ljava/util/Map;

    .line 200
    invoke-virtual {v6}, Lcom/squareup/haha/perflib/ClassObj;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map;

    .line 201
    invoke-virtual {v6}, Lcom/squareup/haha/perflib/ClassObj;->getStaticFieldValues()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/Map$Entry;

    .line 202
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/squareup/haha/perflib/Field;

    .line 203
    invoke-virtual {v10}, Lcom/squareup/haha/perflib/Field;->getType()Lcom/squareup/haha/perflib/Type;

    move-result-object v0

    sget-object v1, Lcom/squareup/haha/perflib/Type;->OBJECT:Lcom/squareup/haha/perflib/Type;

    if-eq v0, v1, :cond_0

    .line 204
    goto :goto_0

    .line 206
    :cond_0
    invoke-virtual {v10}, Lcom/squareup/haha/perflib/Field;->getName()Ljava/lang/String;

    move-result-object v11

    .line 207
    const-string v0, "$staticOverhead"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 208
    goto :goto_0

    .line 210
    :cond_1
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/squareup/haha/perflib/Instance;

    .line 211
    const/4 v13, 0x1

    .line 212
    if-eqz v7, :cond_2

    .line 213
    invoke-interface {v7, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/squareup/leakcanary/Exclusion;

    .line 214
    if-eqz v14, :cond_2

    .line 215
    const/4 v13, 0x0

    .line 216
    iget-boolean v0, v14, Lcom/squareup/leakcanary/Exclusion;->alwaysExclude:Z

    if-nez v0, :cond_2

    .line 217
    move-object v0, p0

    move-object v1, v14

    move-object/from16 v2, p1

    move-object v3, v12

    move-object v4, v11

    sget-object v5, Lcom/squareup/leakcanary/LeakTraceElement$Type;->STATIC_FIELD:Lcom/squareup/leakcanary/LeakTraceElement$Type;

    invoke-direct/range {v0 .. v5}, Lcom/squareup/leakcanary/ShortestPathFinder;->enqueue(Lcom/squareup/leakcanary/Exclusion;Lcom/squareup/leakcanary/LeakNode;Lcom/squareup/haha/perflib/Instance;Ljava/lang/String;Lcom/squareup/leakcanary/LeakTraceElement$Type;)V

    .line 221
    :cond_2
    if-eqz v13, :cond_3

    .line 222
    move-object v0, p0

    move-object/from16 v2, p1

    move-object v3, v12

    move-object v4, v11

    sget-object v5, Lcom/squareup/leakcanary/LeakTraceElement$Type;->STATIC_FIELD:Lcom/squareup/leakcanary/LeakTraceElement$Type;

    const/4 v1, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/squareup/leakcanary/ShortestPathFinder;->enqueue(Lcom/squareup/leakcanary/Exclusion;Lcom/squareup/leakcanary/LeakNode;Lcom/squareup/haha/perflib/Instance;Ljava/lang/String;Lcom/squareup/leakcanary/LeakTraceElement$Type;)V

    .line 224
    :cond_3
    goto/16 :goto_0

    .line 225
    :cond_4
    return-void
.end method

.method private visitRootObj(Lcom/squareup/leakcanary/LeakNode;)V
    .locals 11

    .line 179
    iget-object v0, p1, Lcom/squareup/leakcanary/LeakNode;->instance:Lcom/squareup/haha/perflib/Instance;

    move-object v6, v0

    check-cast v6, Lcom/squareup/haha/perflib/RootObj;

    .line 180
    invoke-virtual {v6}, Lcom/squareup/haha/perflib/RootObj;->getReferredInstance()Lcom/squareup/haha/perflib/Instance;

    move-result-object v7

    .line 182
    invoke-virtual {v6}, Lcom/squareup/haha/perflib/RootObj;->getRootType()Lcom/squareup/haha/perflib/RootType;

    move-result-object v0

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->JAVA_LOCAL:Lcom/squareup/haha/perflib/RootType;

    if-ne v0, v1, :cond_1

    .line 183
    invoke-static {v6}, Lcom/squareup/haha/perflib/HahaSpy;->allocatingThread(Lcom/squareup/haha/perflib/Instance;)Lcom/squareup/haha/perflib/Instance;

    move-result-object v8

    .line 186
    const/4 v9, 0x0

    .line 187
    iget-object v0, p1, Lcom/squareup/leakcanary/LeakNode;->exclusion:Lcom/squareup/leakcanary/Exclusion;

    if-eqz v0, :cond_0

    .line 188
    iget-object v9, p1, Lcom/squareup/leakcanary/LeakNode;->exclusion:Lcom/squareup/leakcanary/Exclusion;

    .line 190
    :cond_0
    new-instance v0, Lcom/squareup/leakcanary/LeakNode;

    move-object v2, v8

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/squareup/leakcanary/LeakNode;-><init>(Lcom/squareup/leakcanary/Exclusion;Lcom/squareup/haha/perflib/Instance;Lcom/squareup/leakcanary/LeakNode;Ljava/lang/String;Lcom/squareup/leakcanary/LeakTraceElement$Type;)V

    move-object v10, v0

    .line 191
    move-object v0, p0

    move-object v1, v9

    move-object v2, v10

    move-object v3, v7

    const-string v4, "<Java Local>"

    sget-object v5, Lcom/squareup/leakcanary/LeakTraceElement$Type;->LOCAL:Lcom/squareup/leakcanary/LeakTraceElement$Type;

    invoke-direct/range {v0 .. v5}, Lcom/squareup/leakcanary/ShortestPathFinder;->enqueue(Lcom/squareup/leakcanary/Exclusion;Lcom/squareup/leakcanary/LeakNode;Lcom/squareup/haha/perflib/Instance;Ljava/lang/String;Lcom/squareup/leakcanary/LeakTraceElement$Type;)V

    .line 192
    goto :goto_0

    .line 193
    :cond_1
    move-object v0, p0

    move-object v2, p1

    move-object v3, v7

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/squareup/leakcanary/ShortestPathFinder;->enqueue(Lcom/squareup/leakcanary/Exclusion;Lcom/squareup/leakcanary/LeakNode;Lcom/squareup/haha/perflib/Instance;Ljava/lang/String;Lcom/squareup/leakcanary/LeakTraceElement$Type;)V

    .line 195
    :goto_0
    return-void
.end method


# virtual methods
.method findPath(Lcom/squareup/haha/perflib/Snapshot;Lcom/squareup/haha/perflib/Instance;)Lcom/squareup/leakcanary/ShortestPathFinder$Result;
    .locals 6

    .line 79
    invoke-direct {p0}, Lcom/squareup/leakcanary/ShortestPathFinder;->clearState()V

    .line 80
    invoke-direct {p0, p2}, Lcom/squareup/leakcanary/ShortestPathFinder;->isString(Lcom/squareup/haha/perflib/Instance;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->canIgnoreStrings:Z

    .line 82
    invoke-direct {p0, p1}, Lcom/squareup/leakcanary/ShortestPathFinder;->enqueueGcRoots(Lcom/squareup/haha/perflib/Snapshot;)V

    .line 84
    const/4 v3, 0x0

    .line 85
    const/4 v4, 0x0

    .line 86
    :goto_1
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitIfNoPathQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 88
    :cond_1
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 89
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/squareup/leakcanary/LeakNode;

    goto :goto_2

    .line 91
    :cond_2
    iget-object v0, p0, Lcom/squareup/leakcanary/ShortestPathFinder;->toVisitIfNoPathQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/squareup/leakcanary/LeakNode;

    .line 92
    iget-object v0, v5, Lcom/squareup/leakcanary/LeakNode;->exclusion:Lcom/squareup/leakcanary/Exclusion;

    if-nez v0, :cond_3

    .line 93
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected node to have an exclusion "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_3
    const/4 v3, 0x1

    .line 99
    :goto_2
    iget-object v0, v5, Lcom/squareup/leakcanary/LeakNode;->instance:Lcom/squareup/haha/perflib/Instance;

    if-ne v0, p2, :cond_4

    .line 100
    move-object v4, v5

    .line 101
    goto/16 :goto_4

    .line 104
    :cond_4
    invoke-direct {p0, v5}, Lcom/squareup/leakcanary/ShortestPathFinder;->checkSeen(Lcom/squareup/leakcanary/LeakNode;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 105
    goto/16 :goto_1

    .line 108
    :cond_5
    iget-object v0, v5, Lcom/squareup/leakcanary/LeakNode;->instance:Lcom/squareup/haha/perflib/Instance;

    instance-of v0, v0, Lcom/squareup/haha/perflib/RootObj;

    if-eqz v0, :cond_6

    .line 109
    invoke-direct {p0, v5}, Lcom/squareup/leakcanary/ShortestPathFinder;->visitRootObj(Lcom/squareup/leakcanary/LeakNode;)V

    goto :goto_3

    .line 110
    :cond_6
    iget-object v0, v5, Lcom/squareup/leakcanary/LeakNode;->instance:Lcom/squareup/haha/perflib/Instance;

    instance-of v0, v0, Lcom/squareup/haha/perflib/ClassObj;

    if-eqz v0, :cond_7

    .line 111
    invoke-direct {p0, v5}, Lcom/squareup/leakcanary/ShortestPathFinder;->visitClassObj(Lcom/squareup/leakcanary/LeakNode;)V

    goto :goto_3

    .line 112
    :cond_7
    iget-object v0, v5, Lcom/squareup/leakcanary/LeakNode;->instance:Lcom/squareup/haha/perflib/Instance;

    instance-of v0, v0, Lcom/squareup/haha/perflib/ClassInstance;

    if-eqz v0, :cond_8

    .line 113
    invoke-direct {p0, v5}, Lcom/squareup/leakcanary/ShortestPathFinder;->visitClassInstance(Lcom/squareup/leakcanary/LeakNode;)V

    goto :goto_3

    .line 114
    :cond_8
    iget-object v0, v5, Lcom/squareup/leakcanary/LeakNode;->instance:Lcom/squareup/haha/perflib/Instance;

    instance-of v0, v0, Lcom/squareup/haha/perflib/ArrayInstance;

    if-eqz v0, :cond_9

    .line 115
    invoke-direct {p0, v5}, Lcom/squareup/leakcanary/ShortestPathFinder;->visitArrayInstance(Lcom/squareup/leakcanary/LeakNode;)V

    goto :goto_3

    .line 117
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected type for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v5, Lcom/squareup/leakcanary/LeakNode;->instance:Lcom/squareup/haha/perflib/Instance;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 119
    :goto_3
    goto/16 :goto_1

    .line 120
    :cond_a
    :goto_4
    new-instance v0, Lcom/squareup/leakcanary/ShortestPathFinder$Result;

    invoke-direct {v0, v4, v3}, Lcom/squareup/leakcanary/ShortestPathFinder$Result;-><init>(Lcom/squareup/leakcanary/LeakNode;Z)V

    return-object v0
.end method
