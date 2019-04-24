.class public final Lo/auu;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/auu$e;,
        Lo/auu$b;
    }
.end annotation


# instance fields
.field private a:Landroid/app/NotificationManager;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/auu$b;Ljava/util/List<Ljava/lang/Integer;>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    .line 70
    invoke-direct {p0}, Lo/auu;->c()Landroid/app/NotificationManager;

    .line 71
    return-void
.end method

.method synthetic constructor <init>(Lo/auu$3;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/auu;-><init>()V

    return-void
.end method

.method private a([Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/String;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 395
    const/4 v2, 0x0

    .line 397
    if-eqz p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 399
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 400
    const/4 v3, 0x1

    :goto_0
    array-length v0, p1

    if-ge v3, v0, :cond_0

    .line 402
    aget-object v0, p1, v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 400
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 405
    :cond_0
    return-object v2
.end method

.method private a()V
    .locals 10

    .line 333
    new-instance v2, Lo/bca;

    invoke-direct {v2}, Lo/bca;-><init>()V

    .line 334
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 336
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 337
    const/4 v4, 0x0

    .line 338
    const/4 v5, 0x0

    .line 339
    const/4 v6, 0x0

    .line 340
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 341
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 343
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 344
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/auu$b;

    .line 345
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 346
    if-eqz v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 348
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 349
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/Integer;

    .line 351
    const-string v0, "_"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 352
    goto :goto_1

    .line 353
    :cond_1
    const-string v0, "|"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 356
    :cond_2
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 358
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 361
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {v8, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 362
    invoke-virtual {v2, v8}, Lo/bca;->c(Ljava/lang/String;)V

    .line 364
    :cond_3
    goto :goto_2

    .line 367
    :cond_4
    const-string v0, ""

    invoke-virtual {v2, v0}, Lo/bca;->c(Ljava/lang/String;)V

    .line 369
    :goto_2
    return-void
.end method

.method private b([Ljava/lang/String;)Lo/auu$b;
    .locals 2

    .line 379
    const/4 v1, 0x0

    .line 380
    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    .line 382
    const/4 v0, 0x0

    aget-object v0, p1, v0

    invoke-static {v0}, Lo/auu$b;->valueOf(Ljava/lang/String;)Lo/auu$b;

    move-result-object v1

    .line 384
    :cond_0
    return-object v1
.end method

.method public static b()Lo/auu;
    .locals 1

    .line 80
    sget-object v0, Lo/auu$e;->c:Lo/auu;

    return-object v0
.end method

.method private c()Landroid/app/NotificationManager;
    .locals 2

    .line 283
    iget-object v0, p0, Lo/auu;->a:Landroid/app/NotificationManager;

    if-nez v0, :cond_0

    .line 285
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 286
    const-string v0, "notification"

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Lo/auu;->a:Landroid/app/NotificationManager;

    .line 288
    invoke-direct {p0}, Lo/auu;->d()V

    .line 290
    :cond_0
    iget-object v0, p0, Lo/auu;->a:Landroid/app/NotificationManager;

    return-object v0
.end method

.method private c(JLjava/util/List;Ljava/util/List;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/List<Ljava/lang/Integer;>;Ljava/util/List<Ljava/lang/Long;>;I)V"
        }
    .end annotation

    .line 445
    const/4 v2, 0x0

    .line 446
    const/4 v3, 0x0

    .line 447
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 449
    const/4 v2, 0x0

    .line 450
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    .line 452
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Integer;

    .line 454
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v3, v0, :cond_0

    .line 456
    const/4 v2, 0x1

    .line 457
    invoke-interface {p3, v8}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 458
    goto :goto_2

    .line 460
    :cond_0
    goto :goto_1

    .line 461
    :cond_1
    :goto_2
    if-eqz v2, :cond_2

    .line 463
    invoke-direct {p0}, Lo/auu;->c()Landroid/app/NotificationManager;

    move-result-object v7

    .line 464
    invoke-virtual {v7, v3}, Landroid/app/NotificationManager;->cancel(I)V

    .line 466
    :cond_2
    goto/16 :goto_0

    .line 467
    :cond_3
    return-void
.end method

.method private d()V
    .locals 13

    .line 298
    new-instance v1, Lo/bca;

    invoke-direct {v1}, Lo/bca;-><init>()V

    .line 299
    invoke-virtual {v1}, Lo/bca;->o()Ljava/lang/String;

    move-result-object v2

    .line 300
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 302
    iget-object v3, p0, Lo/auu;->c:Ljava/util/Map;

    monitor-enter v3

    .line 306
    const-string v0, "\\|"

    :try_start_0
    invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 311
    const/4 v5, 0x0

    .line 312
    const/4 v6, 0x0

    .line 313
    const/4 v7, 0x0

    .line 314
    move-object v8, v4

    array-length v9, v8

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_1

    aget-object v11, v8, v10

    .line 316
    const-string v0, "\\_"

    invoke-virtual {v11, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 317
    invoke-direct {p0, v5}, Lo/auu;->b([Ljava/lang/String;)Lo/auu$b;

    move-result-object v6

    .line 318
    invoke-direct {p0, v5}, Lo/auu;->a([Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    .line 319
    if-eqz v6, :cond_0

    if-eqz v7, :cond_0

    .line 321
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 314
    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 324
    :cond_1
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v12

    monitor-exit v3

    throw v12

    .line 326
    :cond_2
    :goto_1
    return-void
.end method

.method private e(J[ILjava/util/List;Landroid/support/v4/util/LongSparseArray;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J[ILjava/util/List<Ljava/lang/Integer;>;Landroid/support/v4/util/LongSparseArray<Ljava/util/List<Ljava/lang/Long;>;>;)V"
        }
    .end annotation

    .line 416
    move-object/from16 v0, p5

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 418
    if-eqz v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 420
    array-length v7, p3

    .line 421
    const/4 v8, -0x1

    .line 422
    const/4 v9, 0x0

    :goto_0
    if-ge v9, v7, :cond_0

    .line 424
    aget v8, p3, v9

    .line 425
    move-object v0, p0

    move-wide v1, p1

    move-object v3, p4

    move-object v4, v6

    move v5, v8

    invoke-direct/range {v0 .. v5}, Lo/auu;->c(JLjava/util/List;Ljava/util/List;I)V

    .line 422
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 427
    :cond_0
    iget-object v9, p0, Lo/auu;->c:Ljava/util/Map;

    monitor-enter v9

    .line 429
    :try_start_0
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 431
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    sget-object v1, Lo/auu$b;->e:Lo/auu$b;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 433
    :cond_1
    monitor-exit v9

    goto :goto_1

    :catchall_0
    move-exception v10

    monitor-exit v9

    throw v10

    .line 434
    :goto_1
    move-object/from16 v0, p5

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/LongSparseArray;->remove(J)V

    .line 436
    :cond_2
    return-void
.end method


# virtual methods
.method public a(J[I)V
    .locals 10

    .line 243
    const/4 v6, 0x0

    .line 244
    iget-object v7, p0, Lo/auu;->c:Ljava/util/Map;

    monitor-enter v7

    .line 246
    :try_start_0
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    sget-object v1, Lo/auu$b;->e:Lo/auu$b;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 248
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    sget-object v1, Lo/auu$b;->e:Lo/auu$b;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 250
    :cond_0
    invoke-static {}, Lo/atf;->d()Lo/atf;

    move-result-object v0

    invoke-virtual {v0}, Lo/atf;->b()Landroid/support/v4/util/LongSparseArray;

    move-result-object v8

    .line 251
    if-eqz v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 253
    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, v6

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lo/auu;->e(J[ILjava/util/List;Landroid/support/v4/util/LongSparseArray;)V

    .line 254
    invoke-direct {p0}, Lo/auu;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 256
    :cond_1
    monitor-exit v7

    goto :goto_0

    :catchall_0
    move-exception v9

    monitor-exit v7

    throw v9

    .line 257
    :goto_0
    return-void
.end method

.method public a(Lo/auu$b;I)V
    .locals 8

    .line 159
    const/4 v1, 0x0

    .line 160
    const/4 v2, 0x0

    .line 162
    iget-object v3, p0, Lo/auu;->c:Ljava/util/Map;

    monitor-enter v3

    .line 164
    :try_start_0
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    .line 168
    :cond_0
    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 170
    invoke-direct {p0}, Lo/auu;->c()Landroid/app/NotificationManager;

    move-result-object v4

    .line 171
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Integer;

    .line 173
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne p2, v0, :cond_1

    .line 175
    invoke-interface {v1, v6}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 176
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 177
    const/4 v2, 0x1

    .line 178
    goto :goto_1

    .line 180
    :cond_1
    goto :goto_0

    .line 181
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 183
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    :cond_3
    if-eqz v2, :cond_4

    .line 188
    invoke-direct {p0}, Lo/auu;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    :cond_4
    monitor-exit v3

    goto :goto_2

    :catchall_0
    move-exception v7

    monitor-exit v3

    throw v7

    .line 191
    :goto_2
    return-void
.end method

.method public b(J)V
    .locals 10

    .line 201
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v2

    .line 202
    const/4 v3, 0x0

    .line 203
    const/4 v4, 0x0

    .line 204
    iget-object v5, p0, Lo/auu;->c:Ljava/util/Map;

    monitor-enter v5

    .line 206
    :try_start_0
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    sget-object v1, Lo/auu$b;->a:Lo/auu$b;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    sget-object v1, Lo/auu$b;->a:Lo/auu$b;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 210
    :cond_0
    if-eqz v3, :cond_3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 212
    invoke-direct {p0}, Lo/auu;->c()Landroid/app/NotificationManager;

    move-result-object v6

    .line 213
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Integer;

    .line 215
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v2, v0, :cond_1

    .line 217
    invoke-interface {v3, v8}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 218
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 219
    const/4 v4, 0x1

    .line 220
    goto :goto_1

    .line 222
    :cond_1
    goto :goto_0

    .line 223
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 225
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    sget-object v1, Lo/auu$b;->a:Lo/auu$b;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    :cond_3
    if-eqz v4, :cond_4

    .line 230
    invoke-direct {p0}, Lo/auu;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 232
    :cond_4
    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception v9

    monitor-exit v5

    throw v9

    .line 233
    :goto_2
    return-void
.end method

.method public b(Lo/auu$b;)V
    .locals 8

    .line 125
    const/4 v1, 0x0

    .line 126
    const/4 v2, 0x0

    .line 127
    iget-object v3, p0, Lo/auu;->c:Ljava/util/Map;

    monitor-enter v3

    .line 129
    :try_start_0
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    .line 133
    :cond_0
    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 135
    invoke-direct {p0}, Lo/auu;->c()Landroid/app/NotificationManager;

    move-result-object v4

    .line 136
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Integer;

    .line 138
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 139
    goto :goto_0

    .line 140
    :cond_1
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    const/4 v2, 0x1

    .line 143
    :cond_2
    if-eqz v2, :cond_3

    .line 145
    invoke-direct {p0}, Lo/auu;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    :cond_3
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v3

    throw v7

    .line 148
    :goto_1
    return-void
.end method

.method public e()V
    .locals 3

    .line 265
    iget-object v1, p0, Lo/auu;->c:Ljava/util/Map;

    monitor-enter v1

    .line 267
    :try_start_0
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 268
    invoke-direct {p0}, Lo/auu;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 269
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 270
    :goto_0
    invoke-static {}, Lo/atf;->d()Lo/atf;

    move-result-object v0

    invoke-virtual {v0}, Lo/atf;->b()Landroid/support/v4/util/LongSparseArray;

    move-result-object v1

    .line 271
    invoke-virtual {v1}, Landroid/support/v4/util/LongSparseArray;->clear()V

    .line 272
    invoke-direct {p0}, Lo/auu;->c()Landroid/app/NotificationManager;

    move-result-object v2

    .line 273
    invoke-virtual {v2}, Landroid/app/NotificationManager;->cancelAll()V

    .line 274
    return-void
.end method

.method public e(Lo/auu$b;I)V
    .locals 5

    .line 91
    const/4 v1, 0x0

    .line 92
    const/4 v2, 0x0

    .line 93
    iget-object v3, p0, Lo/auu;->c:Ljava/util/Map;

    monitor-enter v3

    .line 95
    :try_start_0
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    .line 99
    :cond_0
    if-nez v1, :cond_1

    .line 101
    const/4 v2, 0x1

    .line 102
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 103
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    iget-object v0, p0, Lo/auu;->c:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 106
    :cond_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 108
    const/4 v2, 0x1

    .line 109
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    :cond_2
    :goto_0
    if-eqz v2, :cond_3

    .line 113
    invoke-direct {p0}, Lo/auu;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    :cond_3
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 116
    :goto_1
    return-void
.end method
