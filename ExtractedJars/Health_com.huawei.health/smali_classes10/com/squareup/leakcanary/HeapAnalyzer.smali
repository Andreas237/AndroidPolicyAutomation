.class public final Lcom/squareup/leakcanary/HeapAnalyzer;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ANONYMOUS_CLASS_NAME_PATTERN:Ljava/lang/String; = "^.+\\$\\d+$"


# instance fields
.field private final excludedRefs:Lcom/squareup/leakcanary/ExcludedRefs;


# direct methods
.method public constructor <init>(Lcom/squareup/leakcanary/ExcludedRefs;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Lcom/squareup/leakcanary/HeapAnalyzer;->excludedRefs:Lcom/squareup/leakcanary/ExcludedRefs;

    .line 66
    return-void
.end method

.method private buildLeakElement(Lcom/squareup/leakcanary/LeakNode;)Lcom/squareup/leakcanary/LeakTraceElement;
    .locals 20

    .line 269
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/squareup/leakcanary/LeakNode;->parent:Lcom/squareup/leakcanary/LeakNode;

    if-nez v0, :cond_0

    .line 271
    const/4 v0, 0x0

    return-object v0

    .line 273
    :cond_0
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/squareup/leakcanary/LeakNode;->parent:Lcom/squareup/leakcanary/LeakNode;

    iget-object v8, v0, Lcom/squareup/leakcanary/LeakNode;->instance:Lcom/squareup/haha/perflib/Instance;

    .line 275
    instance-of v0, v8, Lcom/squareup/haha/perflib/RootObj;

    if-eqz v0, :cond_1

    .line 276
    const/4 v0, 0x0

    return-object v0

    .line 278
    :cond_1
    move-object/from16 v0, p1

    iget-object v9, v0, Lcom/squareup/leakcanary/LeakNode;->referenceType:Lcom/squareup/leakcanary/LeakTraceElement$Type;

    .line 279
    move-object/from16 v0, p1

    iget-object v10, v0, Lcom/squareup/leakcanary/LeakNode;->referenceName:Ljava/lang/String;

    .line 283
    const/4 v13, 0x0

    .line 284
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/squareup/leakcanary/HeapAnalyzer;->describeFields(Lcom/squareup/haha/perflib/Instance;)Ljava/util/List;

    move-result-object v14

    .line 286
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/squareup/leakcanary/HeapAnalyzer;->getClassName(Lcom/squareup/haha/perflib/Instance;)Ljava/lang/String;

    move-result-object v12

    .line 288
    instance-of v0, v8, Lcom/squareup/haha/perflib/ClassObj;

    if-eqz v0, :cond_2

    .line 289
    sget-object v11, Lcom/squareup/leakcanary/LeakTraceElement$Holder;->CLASS:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    goto/16 :goto_2

    .line 290
    :cond_2
    instance-of v0, v8, Lcom/squareup/haha/perflib/ArrayInstance;

    if-eqz v0, :cond_3

    .line 291
    sget-object v11, Lcom/squareup/leakcanary/LeakTraceElement$Holder;->ARRAY:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    goto/16 :goto_2

    .line 293
    :cond_3
    invoke-virtual {v8}, Lcom/squareup/haha/perflib/Instance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v15

    .line 294
    invoke-static {v15}, Lcom/squareup/leakcanary/HahaHelper;->extendsThread(Lcom/squareup/haha/perflib/ClassObj;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 295
    sget-object v11, Lcom/squareup/leakcanary/LeakTraceElement$Holder;->THREAD:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    .line 296
    invoke-static {v8}, Lcom/squareup/leakcanary/HahaHelper;->threadName(Lcom/squareup/haha/perflib/Instance;)Ljava/lang/String;

    move-result-object v16

    .line 297
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(named \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 298
    goto/16 :goto_2

    :cond_4
    const-string v0, "^.+\\$\\d+$"

    invoke-virtual {v12, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 299
    invoke-virtual {v15}, Lcom/squareup/haha/perflib/ClassObj;->getSuperClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/ClassObj;->getClassName()Ljava/lang/String;

    move-result-object v16

    .line 300
    const-class v0, Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 301
    sget-object v11, Lcom/squareup/leakcanary/LeakTraceElement$Holder;->OBJECT:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    .line 306
    :try_start_0
    invoke-virtual {v15}, Lcom/squareup/haha/perflib/ClassObj;->getClassName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v17

    .line 307
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v18

    .line 308
    move-object/from16 v0, v18

    array-length v0, v0

    if-lez v0, :cond_5

    .line 309
    const/4 v0, 0x0

    aget-object v19, v18, v0

    .line 310
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(anonymous implementation of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v13, v0

    .line 311
    goto :goto_0

    .line 312
    :cond_5
    const-string v0, "(anonymous subclass of java.lang.Object)"

    move-object v13, v0

    .line 315
    :goto_0
    goto :goto_1

    .line 314
    :catch_0
    move-exception v17

    .line 315
    goto :goto_1

    .line 317
    :cond_6
    sget-object v11, Lcom/squareup/leakcanary/LeakTraceElement$Holder;->OBJECT:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    .line 319
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(anonymous subclass of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 321
    :goto_1
    goto :goto_2

    .line 322
    :cond_7
    sget-object v11, Lcom/squareup/leakcanary/LeakTraceElement$Holder;->OBJECT:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    .line 325
    :goto_2
    new-instance v0, Lcom/squareup/leakcanary/LeakTraceElement;

    move-object/from16 v1, p1

    iget-object v6, v1, Lcom/squareup/leakcanary/LeakNode;->exclusion:Lcom/squareup/leakcanary/Exclusion;

    move-object v1, v10

    move-object v2, v9

    move-object v3, v11

    move-object v4, v12

    move-object v5, v13

    move-object v7, v14

    invoke-direct/range {v0 .. v7}, Lcom/squareup/leakcanary/LeakTraceElement;-><init>(Ljava/lang/String;Lcom/squareup/leakcanary/LeakTraceElement$Type;Lcom/squareup/leakcanary/LeakTraceElement$Holder;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/leakcanary/Exclusion;Ljava/util/List;)V

    return-object v0
.end method

.method private buildLeakTrace(Lcom/squareup/leakcanary/LeakNode;)Lcom/squareup/leakcanary/LeakTrace;
    .locals 9

    .line 255
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 257
    new-instance v0, Lcom/squareup/leakcanary/LeakNode;

    move-object v3, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/squareup/leakcanary/LeakNode;-><init>(Lcom/squareup/leakcanary/Exclusion;Lcom/squareup/haha/perflib/Instance;Lcom/squareup/leakcanary/LeakNode;Ljava/lang/String;Lcom/squareup/leakcanary/LeakTraceElement$Type;)V

    move-object v7, v0

    .line 258
    :goto_0
    if-eqz v7, :cond_1

    .line 259
    invoke-direct {p0, v7}, Lcom/squareup/leakcanary/HeapAnalyzer;->buildLeakElement(Lcom/squareup/leakcanary/LeakNode;)Lcom/squareup/leakcanary/LeakTraceElement;

    move-result-object v8

    .line 260
    if-eqz v8, :cond_0

    .line 261
    const/4 v0, 0x0

    invoke-interface {v6, v0, v8}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 263
    :cond_0
    iget-object v7, v7, Lcom/squareup/leakcanary/LeakNode;->parent:Lcom/squareup/leakcanary/LeakNode;

    .line 264
    goto :goto_0

    .line 265
    :cond_1
    new-instance v0, Lcom/squareup/leakcanary/LeakTrace;

    invoke-direct {v0, v6}, Lcom/squareup/leakcanary/LeakTrace;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private computeIgnoredBitmapRetainedSize(Lcom/squareup/haha/perflib/Snapshot;Lcom/squareup/haha/perflib/Instance;)I
    .locals 11

    .line 210
    const/4 v2, 0x0

    .line 211
    const-string v0, "android.graphics.Bitmap"

    invoke-virtual {p1, v0}, Lcom/squareup/haha/perflib/Snapshot;->findClass(Ljava/lang/String;)Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v3

    .line 213
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/ClassObj;->getInstancesList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/squareup/haha/perflib/Instance;

    .line 214
    invoke-direct {p0, p2, v5}, Lcom/squareup/leakcanary/HeapAnalyzer;->isIgnoredDominator(Lcom/squareup/haha/perflib/Instance;Lcom/squareup/haha/perflib/Instance;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 215
    invoke-static {v5}, Lcom/squareup/leakcanary/HahaHelper;->classInstanceValues(Lcom/squareup/haha/perflib/Instance;)Ljava/util/List;

    move-result-object v0

    const-string v1, "mBuffer"

    invoke-static {v0, v1}, Lcom/squareup/leakcanary/HahaHelper;->fieldValue(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/squareup/haha/perflib/ArrayInstance;

    .line 217
    if-nez v6, :cond_0

    .line 218
    goto :goto_0

    .line 220
    :cond_0
    invoke-virtual {v6}, Lcom/squareup/haha/perflib/ArrayInstance;->getTotalRetainedSize()J

    move-result-wide v7

    .line 221
    invoke-virtual {v5}, Lcom/squareup/haha/perflib/Instance;->getTotalRetainedSize()J

    move-result-wide v9

    .line 224
    cmp-long v0, v9, v7

    if-gez v0, :cond_1

    .line 225
    add-long/2addr v9, v7

    .line 227
    :cond_1
    int-to-long v0, v2

    add-long/2addr v0, v9

    long-to-int v2, v0

    .line 229
    :cond_2
    goto :goto_0

    .line 230
    :cond_3
    return v2
.end method

.method private describeFields(Lcom/squareup/haha/perflib/Instance;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/perflib/Instance;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 330
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 332
    instance-of v0, p1, Lcom/squareup/haha/perflib/ClassObj;

    if-eqz v0, :cond_1

    .line 333
    move-object v3, p1

    check-cast v3, Lcom/squareup/haha/perflib/ClassObj;

    .line 334
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/ClassObj;->getStaticFieldValues()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    .line 335
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/squareup/haha/perflib/Field;

    .line 336
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    .line 337
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "static "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/squareup/haha/perflib/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 338
    goto :goto_0

    .line 339
    :cond_0
    goto/16 :goto_4

    :cond_1
    instance-of v0, p1, Lcom/squareup/haha/perflib/ArrayInstance;

    if-eqz v0, :cond_3

    .line 340
    move-object v3, p1

    check-cast v3, Lcom/squareup/haha/perflib/ArrayInstance;

    .line 341
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/ArrayInstance;->getArrayType()Lcom/squareup/haha/perflib/Type;

    move-result-object v0

    sget-object v1, Lcom/squareup/haha/perflib/Type;->OBJECT:Lcom/squareup/haha/perflib/Type;

    if-ne v0, v1, :cond_2

    .line 342
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/ArrayInstance;->getValues()[Ljava/lang/Object;

    move-result-object v4

    .line 343
    const/4 v5, 0x0

    :goto_1
    array-length v0, v4

    if-ge v5, v0, :cond_2

    .line 344
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "] = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-object v1, v4, v5

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 343
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 347
    :cond_2
    goto/16 :goto_4

    .line 348
    :cond_3
    invoke-virtual {p1}, Lcom/squareup/haha/perflib/Instance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v3

    .line 349
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/ClassObj;->getStaticFieldValues()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    .line 350
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "static "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v5}, Lcom/squareup/leakcanary/HahaHelper;->fieldToString(Ljava/util/Map$Entry;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 351
    goto :goto_2

    .line 352
    :cond_4
    move-object v4, p1

    check-cast v4, Lcom/squareup/haha/perflib/ClassInstance;

    .line 353
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/ClassInstance;->getValues()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;

    .line 354
    invoke-static {v6}, Lcom/squareup/leakcanary/HahaHelper;->fieldToString(Lcom/squareup/haha/perflib/ClassInstance$FieldValue;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 355
    goto :goto_3

    .line 357
    :cond_5
    :goto_4
    return-object v2
.end method

.method private findLeakTrace(JLcom/squareup/haha/perflib/Snapshot;Lcom/squareup/haha/perflib/Instance;)Lcom/squareup/leakcanary/AnalysisResult;
    .locals 14

    .line 175
    new-instance v7, Lcom/squareup/leakcanary/ShortestPathFinder;

    iget-object v0, p0, Lcom/squareup/leakcanary/HeapAnalyzer;->excludedRefs:Lcom/squareup/leakcanary/ExcludedRefs;

    invoke-direct {v7, v0}, Lcom/squareup/leakcanary/ShortestPathFinder;-><init>(Lcom/squareup/leakcanary/ExcludedRefs;)V

    .line 176
    move-object/from16 v0, p3

    move-object/from16 v1, p4

    invoke-virtual {v7, v0, v1}, Lcom/squareup/leakcanary/ShortestPathFinder;->findPath(Lcom/squareup/haha/perflib/Snapshot;Lcom/squareup/haha/perflib/Instance;)Lcom/squareup/leakcanary/ShortestPathFinder$Result;

    move-result-object v8

    .line 179
    iget-object v0, v8, Lcom/squareup/leakcanary/ShortestPathFinder$Result;->leakingNode:Lcom/squareup/leakcanary/LeakNode;

    if-nez v0, :cond_0

    .line 180
    move-wide v0, p1

    invoke-direct {p0, v0, v1}, Lcom/squareup/leakcanary/HeapAnalyzer;->since(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/squareup/leakcanary/AnalysisResult;->noLeak(J)Lcom/squareup/leakcanary/AnalysisResult;

    move-result-object v0

    return-object v0

    .line 183
    :cond_0
    iget-object v0, v8, Lcom/squareup/leakcanary/ShortestPathFinder$Result;->leakingNode:Lcom/squareup/leakcanary/LeakNode;

    invoke-direct {p0, v0}, Lcom/squareup/leakcanary/HeapAnalyzer;->buildLeakTrace(Lcom/squareup/leakcanary/LeakNode;)Lcom/squareup/leakcanary/LeakTrace;

    move-result-object v9

    .line 185
    invoke-virtual/range {p4 .. p4}, Lcom/squareup/haha/perflib/Instance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/ClassObj;->getClassName()Ljava/lang/String;

    move-result-object v10

    .line 188
    invoke-virtual/range {p3 .. p3}, Lcom/squareup/haha/perflib/Snapshot;->computeDominators()V

    .line 190
    iget-object v0, v8, Lcom/squareup/leakcanary/ShortestPathFinder$Result;->leakingNode:Lcom/squareup/leakcanary/LeakNode;

    iget-object v11, v0, Lcom/squareup/leakcanary/LeakNode;->instance:Lcom/squareup/haha/perflib/Instance;

    .line 192
    invoke-virtual {v11}, Lcom/squareup/haha/perflib/Instance;->getTotalRetainedSize()J

    move-result-wide v12

    .line 194
    move-object/from16 v0, p3

    invoke-direct {p0, v0, v11}, Lcom/squareup/leakcanary/HeapAnalyzer;->computeIgnoredBitmapRetainedSize(Lcom/squareup/haha/perflib/Snapshot;Lcom/squareup/haha/perflib/Instance;)I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v12, v0

    .line 196
    iget-boolean v0, v8, Lcom/squareup/leakcanary/ShortestPathFinder$Result;->excludingKnownLeaks:Z

    move-object v1, v10

    move-object v2, v9

    move-wide v3, v12

    .line 197
    move-wide v5, p1

    invoke-direct {p0, v5, v6}, Lcom/squareup/leakcanary/HeapAnalyzer;->since(J)J

    move-result-wide v5

    .line 196
    invoke-static/range {v0 .. v6}, Lcom/squareup/leakcanary/AnalysisResult;->leakDetected(ZLjava/lang/String;Lcom/squareup/leakcanary/LeakTrace;JJ)Lcom/squareup/leakcanary/AnalysisResult;

    move-result-object v0

    return-object v0
.end method

.method private findLeakingReference(Ljava/lang/String;Lcom/squareup/haha/perflib/Snapshot;)Lcom/squareup/haha/perflib/Instance;
    .locals 9

    .line 158
    const-class v0, Lcom/squareup/leakcanary/KeyedWeakReference;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/squareup/haha/perflib/Snapshot;->findClass(Ljava/lang/String;)Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v3

    .line 159
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 160
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/ClassObj;->getInstancesList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/squareup/haha/perflib/Instance;

    .line 161
    invoke-static {v6}, Lcom/squareup/leakcanary/HahaHelper;->classInstanceValues(Lcom/squareup/haha/perflib/Instance;)Ljava/util/List;

    move-result-object v7

    .line 162
    const-string v0, "key"

    invoke-static {v7, v0}, Lcom/squareup/leakcanary/HahaHelper;->fieldValue(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/leakcanary/HahaHelper;->asString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 163
    invoke-virtual {v8, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    const-string v0, "referent"

    invoke-static {v7, v0}, Lcom/squareup/leakcanary/HahaHelper;->fieldValue(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/Instance;

    return-object v0

    .line 166
    :cond_0
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 167
    goto :goto_0

    .line 168
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not find weak reference with key "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private generateRootKey(Lcom/squareup/haha/perflib/RootObj;)Ljava/lang/String;
    .locals 4

    .line 154
    const-string v0, "%s@0x%08x"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/squareup/haha/perflib/RootObj;->getRootType()Lcom/squareup/haha/perflib/RootType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/squareup/haha/perflib/RootType;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/squareup/haha/perflib/RootObj;->getId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getClassName(Lcom/squareup/haha/perflib/Instance;)Ljava/lang/String;
    .locals 3

    .line 362
    instance-of v0, p1, Lcom/squareup/haha/perflib/ClassObj;

    if-eqz v0, :cond_0

    .line 363
    move-object v2, p1

    check-cast v2, Lcom/squareup/haha/perflib/ClassObj;

    .line 364
    invoke-virtual {v2}, Lcom/squareup/haha/perflib/ClassObj;->getClassName()Ljava/lang/String;

    move-result-object v1

    .line 365
    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/squareup/haha/perflib/ArrayInstance;

    if-eqz v0, :cond_1

    .line 366
    move-object v2, p1

    check-cast v2, Lcom/squareup/haha/perflib/ArrayInstance;

    .line 367
    invoke-virtual {v2}, Lcom/squareup/haha/perflib/ArrayInstance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/ClassObj;->getClassName()Ljava/lang/String;

    move-result-object v1

    .line 368
    goto :goto_0

    .line 369
    :cond_1
    invoke-virtual {p1}, Lcom/squareup/haha/perflib/Instance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v2

    .line 370
    invoke-virtual {v2}, Lcom/squareup/haha/perflib/ClassObj;->getClassName()Ljava/lang/String;

    move-result-object v1

    .line 372
    :goto_0
    return-object v1
.end method

.method private isIgnoredDominator(Lcom/squareup/haha/perflib/Instance;Lcom/squareup/haha/perflib/Instance;)Z
    .locals 4

    .line 234
    const/4 v2, 0x0

    .line 236
    :goto_0
    invoke-virtual {p2}, Lcom/squareup/haha/perflib/Instance;->getImmediateDominator()Lcom/squareup/haha/perflib/Instance;

    move-result-object v3

    .line 237
    instance-of v0, v3, Lcom/squareup/haha/perflib/RootObj;

    if-eqz v0, :cond_0

    move-object v0, v3

    check-cast v0, Lcom/squareup/haha/perflib/RootObj;

    .line 238
    invoke-virtual {v0}, Lcom/squareup/haha/perflib/RootObj;->getRootType()Lcom/squareup/haha/perflib/RootType;

    move-result-object v0

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->UNKNOWN:Lcom/squareup/haha/perflib/RootType;

    if-ne v0, v1, :cond_0

    .line 240
    invoke-virtual {p2}, Lcom/squareup/haha/perflib/Instance;->getNextInstanceToGcRoot()Lcom/squareup/haha/perflib/Instance;

    move-result-object p2

    .line 241
    const/4 v2, 0x1

    goto :goto_1

    .line 243
    :cond_0
    move-object p2, v3

    .line 245
    :goto_1
    if-nez p2, :cond_1

    .line 246
    const/4 v0, 0x0

    return v0

    .line 248
    :cond_1
    if-ne p2, p1, :cond_2

    .line 249
    return v2

    .line 251
    :cond_2
    goto :goto_0
.end method

.method private since(J)J
    .locals 3

    .line 376
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    sub-long/2addr v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public checkForLeak(Ljava/io/File;Ljava/lang/String;)Lcom/squareup/leakcanary/AnalysisResult;
    .locals 8

    .line 103
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    .line 105
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 106
    new-instance v4, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "File does not exist: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 107
    invoke-direct {p0, v2, v3}, Lcom/squareup/leakcanary/HeapAnalyzer;->since(J)J

    move-result-wide v0

    invoke-static {v4, v0, v1}, Lcom/squareup/leakcanary/AnalysisResult;->failure(Ljava/lang/Throwable;J)Lcom/squareup/leakcanary/AnalysisResult;

    move-result-object v0

    return-object v0

    .line 111
    :cond_0
    :try_start_0
    new-instance v4, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;

    invoke-direct {v4, p1}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;-><init>(Ljava/io/File;)V

    .line 112
    new-instance v5, Lcom/squareup/haha/perflib/HprofParser;

    invoke-direct {v5, v4}, Lcom/squareup/haha/perflib/HprofParser;-><init>(Lcom/squareup/haha/perflib/io/HprofBuffer;)V

    .line 113
    invoke-virtual {v5}, Lcom/squareup/haha/perflib/HprofParser;->parse()Lcom/squareup/haha/perflib/Snapshot;

    move-result-object v6

    .line 114
    invoke-virtual {p0, v6}, Lcom/squareup/leakcanary/HeapAnalyzer;->deduplicateGcRoots(Lcom/squareup/haha/perflib/Snapshot;)V

    .line 116
    invoke-direct {p0, p2, v6}, Lcom/squareup/leakcanary/HeapAnalyzer;->findLeakingReference(Ljava/lang/String;Lcom/squareup/haha/perflib/Snapshot;)Lcom/squareup/haha/perflib/Instance;

    move-result-object v7

    .line 119
    if-nez v7, :cond_1

    .line 120
    invoke-direct {p0, v2, v3}, Lcom/squareup/leakcanary/HeapAnalyzer;->since(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/squareup/leakcanary/AnalysisResult;->noLeak(J)Lcom/squareup/leakcanary/AnalysisResult;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 123
    :cond_1
    :try_start_1
    invoke-direct {p0, v2, v3, v6, v7}, Lcom/squareup/leakcanary/HeapAnalyzer;->findLeakTrace(JLcom/squareup/haha/perflib/Snapshot;Lcom/squareup/haha/perflib/Instance;)Lcom/squareup/leakcanary/AnalysisResult;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    return-object v0

    .line 124
    :catch_0
    move-exception v4

    .line 125
    invoke-direct {p0, v2, v3}, Lcom/squareup/leakcanary/HeapAnalyzer;->since(J)J

    move-result-wide v0

    invoke-static {v4, v0, v1}, Lcom/squareup/leakcanary/AnalysisResult;->failure(Ljava/lang/Throwable;J)Lcom/squareup/leakcanary/AnalysisResult;

    move-result-object v0

    return-object v0
.end method

.method deduplicateGcRoots(Lcom/squareup/haha/perflib/Snapshot;)V
    .locals 6

    .line 134
    new-instance v1, Lcom/squareup/haha/trove/THashMap;

    invoke-direct {v1}, Lcom/squareup/haha/trove/THashMap;-><init>()V

    .line 136
    invoke-virtual {p1}, Lcom/squareup/haha/perflib/Snapshot;->getGCRoots()Ljava/util/Collection;

    move-result-object v2

    .line 137
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/squareup/haha/perflib/RootObj;

    .line 138
    invoke-direct {p0, v4}, Lcom/squareup/leakcanary/HeapAnalyzer;->generateRootKey(Lcom/squareup/haha/perflib/RootObj;)Ljava/lang/String;

    move-result-object v5

    .line 139
    invoke-virtual {v1, v5}, Lcom/squareup/haha/trove/THashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 140
    invoke-virtual {v1, v5, v4}, Lcom/squareup/haha/trove/THashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    :cond_0
    goto :goto_0

    .line 145
    :cond_1
    invoke-interface {v2}, Ljava/util/Collection;->clear()V

    .line 146
    new-instance v0, Lcom/squareup/leakcanary/HeapAnalyzer$1;

    invoke-direct {v0, p0, v2, v1}, Lcom/squareup/leakcanary/HeapAnalyzer$1;-><init>(Lcom/squareup/leakcanary/HeapAnalyzer;Ljava/util/Collection;Lcom/squareup/haha/trove/THashMap;)V

    invoke-virtual {v1, v0}, Lcom/squareup/haha/trove/THashMap;->forEach(Lcom/squareup/haha/trove/TObjectProcedure;)Z

    .line 151
    return-void
.end method

.method public findTrackedReferences(Ljava/io/File;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/File;)Ljava/util/List<Lcom/squareup/leakcanary/TrackedReference;>;"
        }
    .end annotation

    .line 69
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "File does not exist: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 73
    :cond_0
    :try_start_0
    new-instance v3, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;

    move-object/from16 v0, p1

    invoke-direct {v3, v0}, Lcom/squareup/haha/perflib/io/MemoryMappedFileBuffer;-><init>(Ljava/io/File;)V

    .line 74
    new-instance v4, Lcom/squareup/haha/perflib/HprofParser;

    invoke-direct {v4, v3}, Lcom/squareup/haha/perflib/HprofParser;-><init>(Lcom/squareup/haha/perflib/io/HprofBuffer;)V

    .line 75
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/HprofParser;->parse()Lcom/squareup/haha/perflib/Snapshot;

    move-result-object v5

    .line 76
    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/squareup/leakcanary/HeapAnalyzer;->deduplicateGcRoots(Lcom/squareup/haha/perflib/Snapshot;)V

    .line 78
    const-class v0, Lcom/squareup/leakcanary/KeyedWeakReference;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/squareup/haha/perflib/Snapshot;->findClass(Ljava/lang/String;)Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v6

    .line 79
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 80
    invoke-virtual {v6}, Lcom/squareup/haha/perflib/ClassObj;->getInstancesList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/squareup/haha/perflib/Instance;

    .line 81
    invoke-static {v9}, Lcom/squareup/leakcanary/HahaHelper;->classInstanceValues(Lcom/squareup/haha/perflib/Instance;)Ljava/util/List;

    move-result-object v10

    .line 82
    const-string v0, "key"

    invoke-static {v10, v0}, Lcom/squareup/leakcanary/HahaHelper;->fieldValue(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/leakcanary/HahaHelper;->asString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 83
    const-string v0, "name"

    .line 84
    invoke-static {v10, v0}, Lcom/squareup/leakcanary/HahaHelper;->hasField(Ljava/util/List;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "name"

    invoke-static {v10, v0}, Lcom/squareup/leakcanary/HahaHelper;->fieldValue(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/leakcanary/HahaHelper;->asString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    goto :goto_1

    :cond_1
    const-string v12, "(No name field)"

    .line 85
    :goto_1
    const-string v0, "referent"

    invoke-static {v10, v0}, Lcom/squareup/leakcanary/HahaHelper;->fieldValue(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/squareup/haha/perflib/Instance;

    .line 86
    if-eqz v13, :cond_2

    .line 87
    move-object/from16 v0, p0

    invoke-direct {v0, v13}, Lcom/squareup/leakcanary/HeapAnalyzer;->getClassName(Lcom/squareup/haha/perflib/Instance;)Ljava/lang/String;

    move-result-object v14

    .line 88
    move-object/from16 v0, p0

    invoke-direct {v0, v13}, Lcom/squareup/leakcanary/HeapAnalyzer;->describeFields(Lcom/squareup/haha/perflib/Instance;)Ljava/util/List;

    move-result-object v15

    .line 89
    new-instance v0, Lcom/squareup/leakcanary/TrackedReference;

    invoke-direct {v0, v11, v12, v14, v15}, Lcom/squareup/leakcanary/TrackedReference;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    :cond_2
    goto :goto_0

    .line 92
    :cond_3
    return-object v7

    .line 93
    :catch_0
    move-exception v3

    .line 94
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
