.class Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;
.super Ljava/lang/Thread;
.source "DiskCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/fetchers/DiskCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "DiskCachePersistThread"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/fetchers/DiskCache;


# direct methods
.method constructor <init>(Lcom/shopkick/app/fetchers/DiskCache;)V
    .locals 0

    .line 337
    iput-object p1, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method private cleanupOldState()V
    .locals 14

    .line 382
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v0}, Lcom/shopkick/app/fetchers/DiskCache;->access$400(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/io/File;

    move-result-object v0

    .line 383
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 385
    new-array v0, v1, [Ljava/io/File;

    .line 387
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 388
    iget-object v3, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v3}, Lcom/shopkick/app/fetchers/DiskCache;->access$600(Lcom/shopkick/app/fetchers/DiskCache;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    const/4 v5, 0x0

    iget-object v3, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    .line 389
    invoke-static {v3}, Lcom/shopkick/app/fetchers/DiskCache;->access$500(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/lang/String;

    move-result-object v6

    const-string v3, "id"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 388
    invoke-virtual/range {v4 .. v13}, Landroid/database/sqlite/SQLiteDatabase;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 397
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    move-result v4

    if-lez v4, :cond_2

    .line 400
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 402
    :cond_1
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    .line 403
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 404
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-nez v4, :cond_1

    :cond_2
    if-eqz v3, :cond_3

    .line 407
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 411
    :cond_3
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 412
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 413
    array-length v5, v0

    move v6, v1

    :goto_0
    if-ge v6, v5, :cond_4

    aget-object v7, v0, v6

    .line 414
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 416
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_5
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    .line 417
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    .line 418
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 423
    :cond_6
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 424
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    .line 425
    invoke-virtual {v5}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ","

    .line 426
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 428
    :cond_7
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-lez v4, :cond_8

    .line 429
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v3, v1, v4}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 430
    iget-object v4, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v4}, Lcom/shopkick/app/fetchers/DiskCache;->access$600(Lcom/shopkick/app/fetchers/DiskCache;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    iget-object v5, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v5}, Lcom/shopkick/app/fetchers/DiskCache;->access$500(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "id IN ("

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v3, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 434
    :cond_8
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 435
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    .line 436
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 438
    :cond_9
    array-length v2, v0

    :goto_4
    if-ge v1, v2, :cond_b

    aget-object v4, v0, v1

    .line 439
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    .line 440
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_b
    return-void
.end method

.method private evictToSize()V
    .locals 12

    .line 512
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->getCurrentSize()I

    move-result v0

    .line 514
    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v1}, Lcom/shopkick/app/fetchers/DiskCache;->access$700(Lcom/shopkick/app/fetchers/DiskCache;)I

    move-result v1

    if-le v0, v1, :cond_5

    .line 516
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/DiskCache;->removeExpiredItems()V

    .line 517
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->getCurrentSize()I

    move-result v0

    .line 521
    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v1}, Lcom/shopkick/app/fetchers/DiskCache;->access$600(Lcom/shopkick/app/fetchers/DiskCache;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const/4 v3, 0x0

    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    .line 522
    invoke-static {v1}, Lcom/shopkick/app/fetchers/DiskCache;->access$500(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "id"

    const-string/jumbo v5, "size"

    filled-new-array {v1, v5}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "pinned = 0"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v10, "last_use_time ASC"

    const/4 v11, 0x0

    .line 521
    invoke-virtual/range {v2 .. v11}, Landroid/database/sqlite/SQLiteDatabase;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 531
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    if-eqz v1, :cond_3

    .line 532
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v3

    if-lez v3, :cond_3

    .line 533
    iget-object v3, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v3}, Lcom/shopkick/app/fetchers/DiskCache;->access$700(Lcom/shopkick/app/fetchers/DiskCache;)I

    move-result v3

    int-to-double v3, v3

    const-wide/high16 v5, 0x3fe8000000000000L    # 0.75

    mul-double/2addr v3, v5

    double-to-int v3, v3

    .line 537
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    :cond_0
    const/4 v4, 0x0

    .line 539
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    .line 540
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v5, 0x1

    .line 541
    invoke-interface {v1, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    sub-int/2addr v0, v6

    if-gt v0, v3, :cond_1

    goto :goto_0

    .line 545
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6

    if-nez v6, :cond_0

    .line 548
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 549
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    .line 550
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ","

    .line 551
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 553
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_3

    .line 554
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    sub-int/2addr v3, v5

    invoke-virtual {v0, v4, v3}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 555
    iget-object v3, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v3}, Lcom/shopkick/app/fetchers/DiskCache;->access$600(Lcom/shopkick/app/fetchers/DiskCache;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v4}, Lcom/shopkick/app/fetchers/DiskCache;->access$500(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "id IN ("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v0, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    :cond_3
    if-eqz v1, :cond_4

    .line 559
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 564
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    .line 565
    iget-object v2, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v2, v1}, Lcom/shopkick/app/fetchers/DiskCache;->access$800(Lcom/shopkick/app/fetchers/DiskCache;Ljava/lang/Long;)Ljava/io/File;

    move-result-object v1

    .line 566
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    goto :goto_2

    :cond_5
    return-void
.end method

.method private getCurrentSize()I
    .locals 3

    .line 492
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v0}, Lcom/shopkick/app/fetchers/DiskCache;->access$600(Lcom/shopkick/app/fetchers/DiskCache;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT SUM(size) FROM "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v2}, Lcom/shopkick/app/fetchers/DiskCache;->access$500(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 493
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v2

    if-lez v2, :cond_0

    .line 494
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 495
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    :cond_0
    if-eqz v0, :cond_1

    .line 498
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_1
    return v1
.end method

.method private storeItem(Lcom/shopkick/app/fetchers/DiskCache$CacheEntry;)V
    .locals 6

    .line 446
    iget-object v0, p1, Lcom/shopkick/app/fetchers/DiskCache$CacheEntry;->data:[B

    array-length v0, v0

    int-to-double v0, v0

    iget-object v2, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v2}, Lcom/shopkick/app/fetchers/DiskCache;->access$700(Lcom/shopkick/app/fetchers/DiskCache;)I

    move-result v2

    int-to-double v2, v2

    const-wide/high16 v4, 0x3fe8000000000000L    # 0.75

    mul-double/2addr v2, v4

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    return-void

    .line 453
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/DiskCache$CacheEntry;->key:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/DiskCache;->removeItemForKey(Ljava/lang/String;)V

    .line 455
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "key"

    .line 456
    iget-object v2, p1, Lcom/shopkick/app/fetchers/DiskCache$CacheEntry;->key:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "pinned"

    .line 457
    iget-boolean v2, p1, Lcom/shopkick/app/fetchers/DiskCache$CacheEntry;->isPinned:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v1, "last_use_time"

    .line 458
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string/jumbo v1, "size"

    .line 459
    iget-object v2, p1, Lcom/shopkick/app/fetchers/DiskCache$CacheEntry;->data:[B

    array-length v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "expiration_time"

    .line 460
    iget-wide v2, p1, Lcom/shopkick/app/fetchers/DiskCache$CacheEntry;->expirationTimestamp:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 462
    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v1}, Lcom/shopkick/app/fetchers/DiskCache;->access$600(Lcom/shopkick/app/fetchers/DiskCache;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v2}, Lcom/shopkick/app/fetchers/DiskCache;->access$500(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    .line 466
    :try_start_0
    iget-object v2, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/shopkick/app/fetchers/DiskCache;->access$800(Lcom/shopkick/app/fetchers/DiskCache;Ljava/lang/Long;)Ljava/io/File;

    move-result-object v2

    .line 467
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 468
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 469
    new-instance v2, Ljava/io/BufferedOutputStream;

    invoke-direct {v2, v4}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 470
    iget-object p1, p1, Lcom/shopkick/app/fetchers/DiskCache$CacheEntry;->data:[B

    invoke-virtual {v2, p1}, Ljava/io/BufferedOutputStream;->write([B)V

    .line 471
    invoke-virtual {v2}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 477
    const-class v2, Lcom/shopkick/app/fetchers/DiskCache;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 479
    iget-object p1, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {p1}, Lcom/shopkick/app/fetchers/DiskCache;->access$600(Lcom/shopkick/app/fetchers/DiskCache;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    iget-object v2, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v2}, Lcom/shopkick/app/fetchers/DiskCache;->access$500(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2, v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    move-exception p1

    .line 473
    const-class v2, Lcom/shopkick/app/fetchers/DiskCache;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/io/FileNotFoundException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 475
    iget-object p1, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {p1}, Lcom/shopkick/app/fetchers/DiskCache;->access$600(Lcom/shopkick/app/fetchers/DiskCache;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    iget-object v2, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v2}, Lcom/shopkick/app/fetchers/DiskCache;->access$500(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2, v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 483
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->evictToSize()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    const/16 v0, 0xa

    .line 341
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 342
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->cleanupOldState()V

    .line 343
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v0}, Lcom/shopkick/app/fetchers/DiskCache;->access$000(Lcom/shopkick/app/fetchers/DiskCache;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 346
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v0}, Lcom/shopkick/app/fetchers/DiskCache;->access$100(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/util/ArrayList;

    move-result-object v0

    monitor-enter v0

    .line 347
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v1}, Lcom/shopkick/app/fetchers/DiskCache;->access$100(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 348
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 349
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/DiskCache$CacheEntry;

    .line 350
    invoke-direct {p0, v1}, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->storeItem(Lcom/shopkick/app/fetchers/DiskCache$CacheEntry;)V

    .line 351
    iget-object v2, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v2}, Lcom/shopkick/app/fetchers/DiskCache;->access$100(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/util/ArrayList;

    move-result-object v2

    monitor-enter v2

    .line 352
    :try_start_1
    iget-object v3, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v3}, Lcom/shopkick/app/fetchers/DiskCache;->access$100(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 353
    iget-object v3, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    iget-object v4, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v4}, Lcom/shopkick/app/fetchers/DiskCache;->access$200(Lcom/shopkick/app/fetchers/DiskCache;)J

    move-result-wide v4

    iget-object v1, v1, Lcom/shopkick/app/fetchers/DiskCache$CacheEntry;->data:[B

    array-length v1, v1

    int-to-long v6, v1

    sub-long/2addr v4, v6

    invoke-static {v3, v4, v5}, Lcom/shopkick/app/fetchers/DiskCache;->access$202(Lcom/shopkick/app/fetchers/DiskCache;J)J

    .line 354
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 357
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v0}, Lcom/shopkick/app/fetchers/DiskCache;->access$000(Lcom/shopkick/app/fetchers/DiskCache;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 358
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v0}, Lcom/shopkick/app/fetchers/DiskCache;->access$100(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/util/ArrayList;

    move-result-object v0

    monitor-enter v0

    .line 359
    :try_start_2
    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v1}, Lcom/shopkick/app/fetchers/DiskCache;->access$100(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v1, :cond_2

    .line 361
    :try_start_3
    iget-object v1, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    invoke-static {v1}, Lcom/shopkick/app/fetchers/DiskCache;->access$100(Lcom/shopkick/app/fetchers/DiskCache;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catch_0
    move-exception v1

    .line 363
    :try_start_4
    const-class v2, Lcom/shopkick/app/fetchers/DiskCache;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/InterruptedException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 366
    :cond_2
    :goto_2
    monitor-exit v0

    goto/16 :goto_0

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1

    :catchall_2
    move-exception v1

    .line 348
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v1

    .line 372
    :cond_3
    monitor-enter p0

    .line 373
    :try_start_6
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DiskCache$DiskCachePersistThread;->this$0:Lcom/shopkick/app/fetchers/DiskCache;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/shopkick/app/fetchers/DiskCache;->access$302(Lcom/shopkick/app/fetchers/DiskCache;Z)Z

    .line 374
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 375
    monitor-exit p0

    return-void

    :catchall_3
    move-exception v0

    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw v0
.end method
