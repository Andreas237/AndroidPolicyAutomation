.class Lo/ewf$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ewf;->a(Landroid/content/Context;JJLo/ehe$a;Ljava/util/List;Ljava/util/Map;Lo/ekr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ehe$a;

.field final synthetic b:Lo/ewf;

.field final synthetic c:Ljava/util/Map;

.field final synthetic e:Lo/ekr;


# direct methods
.method constructor <init>(Lo/ewf;Lo/ekr;Ljava/util/Map;Lo/ehe$a;)V
    .locals 0

    .line 336
    iput-object p1, p0, Lo/ewf$1;->b:Lo/ewf;

    iput-object p2, p0, Lo/ewf$1;->e:Lo/ekr;

    iput-object p3, p0, Lo/ewf$1;->c:Ljava/util/Map;

    iput-object p4, p0, Lo/ewf$1;->a:Lo/ehe$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/util/SparseArray;II)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;II)V"
        }
    .end annotation

    .line 339
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 340
    iget-object v0, p0, Lo/ewf$1;->e:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 341
    return-void

    .line 343
    :cond_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 344
    const-string v0, "Fitness_HeartRateChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "triggered but the data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    iget-object v0, p0, Lo/ewf$1;->e:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 346
    return-void

    .line 349
    :cond_1
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 352
    :try_start_0
    iget-object v0, p0, Lo/ewf$1;->b:Lo/ewf;

    const-string v1, "HR_NORMAL_MAX"

    iget-object v2, p0, Lo/ewf$1;->c:Ljava/util/Map;

    invoke-static {v0, v4, v1, v2, p1}, Lo/ewf;->d(Lo/ewf;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Landroid/util/SparseArray;)V

    .line 353
    iget-object v0, p0, Lo/ewf$1;->b:Lo/ewf;

    const-string v1, "HR_NORMAL_MIN"

    iget-object v2, p0, Lo/ewf$1;->c:Ljava/util/Map;

    invoke-static {v0, v4, v1, v2, p1}, Lo/ewf;->d(Lo/ewf;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Landroid/util/SparseArray;)V

    .line 354
    iget-object v0, p0, Lo/ewf$1;->b:Lo/ewf;

    const-string v1, "HR_NORMAL_DETAIL"

    iget-object v2, p0, Lo/ewf$1;->c:Ljava/util/Map;

    invoke-static {v0, v4, v1, v2, p1}, Lo/ewf;->d(Lo/ewf;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Landroid/util/SparseArray;)V

    .line 356
    iget-object v0, p0, Lo/ewf$1;->b:Lo/ewf;

    const-string v1, "HR_REST"

    iget-object v2, p0, Lo/ewf$1;->c:Ljava/util/Map;

    invoke-static {v0, v4, v1, v2, p1}, Lo/ewf;->d(Lo/ewf;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Landroid/util/SparseArray;)V

    .line 357
    iget-object v0, p0, Lo/ewf$1;->b:Lo/ewf;

    const-string v1, "HR_REST_DETAIL"

    iget-object v2, p0, Lo/ewf$1;->c:Ljava/util/Map;

    invoke-static {v0, v4, v1, v2, p1}, Lo/ewf;->d(Lo/ewf;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Landroid/util/SparseArray;)V

    .line 359
    iget-object v0, p0, Lo/ewf$1;->b:Lo/ewf;

    const-string v1, "HR_WARNING_MAX"

    iget-object v2, p0, Lo/ewf$1;->c:Ljava/util/Map;

    invoke-static {v0, v4, v1, v2, p1}, Lo/ewf;->d(Lo/ewf;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Landroid/util/SparseArray;)V

    .line 360
    iget-object v0, p0, Lo/ewf$1;->b:Lo/ewf;

    const-string v1, "HR_WARNING_MIN"

    iget-object v2, p0, Lo/ewf$1;->c:Ljava/util/Map;

    invoke-static {v0, v4, v1, v2, p1}, Lo/ewf;->d(Lo/ewf;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Landroid/util/SparseArray;)V

    .line 361
    iget-object v0, p0, Lo/ewf$1;->b:Lo/ewf;

    const-string v1, "HR_WARNING_DETAIL"

    iget-object v2, p0, Lo/ewf$1;->c:Ljava/util/Map;

    invoke-static {v0, v4, v1, v2, p1}, Lo/ewf;->e(Lo/ewf;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Landroid/util/SparseArray;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 365
    goto :goto_0

    .line 363
    :catch_0
    move-exception v5

    .line 364
    const-string v0, "Fitness_HeartRateChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    :goto_0
    iget-object v0, p0, Lo/ewf$1;->a:Lo/ehe$a;

    invoke-virtual {v0}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "normal_hr"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 369
    iget-object v0, p0, Lo/ewf$1;->b:Lo/ewf;

    iget-object v1, p0, Lo/ewf$1;->c:Ljava/util/Map;

    sget-object v2, Lo/ewf$b;->b:Lo/ewf$b;

    invoke-static {v0, v1, v2}, Lo/ewf;->a(Lo/ewf;Ljava/util/Map;Lo/ewf$b;)Lo/ewf$a;

    move-result-object v5

    .line 371
    iget-object v0, v5, Lo/ewf$a;->d:Lo/ewf$d;

    sget-object v1, Lo/ewf$d;->d:Lo/ewf$d;

    if-ne v0, v1, :cond_5

    .line 374
    const-string v6, "HR_NORMAL_MIN"

    .line 375
    const-string v7, "HR_NORMAL_MAX"

    .line 377
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 379
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/Map$Entry;

    .line 380
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/ejp;

    .line 381
    move-object v12, v11

    check-cast v12, Lo/eju;

    .line 382
    new-instance v0, Lo/eju$b;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, v12, v6, v7}, Lo/eju$b;-><init>(Lo/eju;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Lo/eju;->e(Lo/eju$c;)V

    .line 383
    invoke-virtual {v12}, Lo/eju;->b()Z

    move-result v0

    if-nez v0, :cond_2

    .line 384
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 386
    :cond_2
    goto :goto_1

    .line 388
    :cond_3
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/Long;

    .line 389
    invoke-interface {v4, v10}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    goto :goto_2

    .line 391
    :cond_4
    goto/16 :goto_5

    :cond_5
    iget-object v0, v5, Lo/ewf$a;->d:Lo/ewf$d;

    sget-object v1, Lo/ewf$d;->e:Lo/ewf$d;

    if-ne v0, v1, :cond_9

    .line 393
    const-string v6, "HR_NORMAL_DETAIL"

    .line 394
    const-string v7, "HR_REST_DETAIL"

    .line 396
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 398
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/Map$Entry;

    .line 399
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/ejp;

    .line 400
    move-object v12, v11

    check-cast v12, Lo/eju;

    .line 401
    new-instance v0, Lo/eju$a;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    invoke-direct {v0, v12, v6, v1}, Lo/eju$a;-><init>(Lo/eju;Ljava/lang/String;[Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Lo/eju;->e(Lo/eju$c;)V

    .line 402
    invoke-virtual {v12}, Lo/eju;->b()Z

    move-result v0

    if-nez v0, :cond_6

    .line 403
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 405
    :cond_6
    goto :goto_3

    .line 407
    :cond_7
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/Long;

    .line 408
    invoke-interface {v4, v10}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    goto :goto_4

    .line 410
    :cond_8
    goto :goto_5

    .line 411
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "not support drawStyle"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 413
    :goto_5
    goto/16 :goto_d

    :cond_a
    iget-object v0, p0, Lo/ewf$1;->a:Lo/ehe$a;

    invoke-virtual {v0}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rest_hr"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 414
    iget-object v0, p0, Lo/ewf$1;->b:Lo/ewf;

    iget-object v1, p0, Lo/ewf$1;->c:Ljava/util/Map;

    sget-object v2, Lo/ewf$b;->a:Lo/ewf$b;

    invoke-static {v0, v1, v2}, Lo/ewf;->a(Lo/ewf;Ljava/util/Map;Lo/ewf$b;)Lo/ewf$a;

    move-result-object v5

    .line 419
    iget-boolean v0, v5, Lo/ewf$a;->e:Z

    if-eqz v0, :cond_b

    .line 420
    const-string v6, "HR_REST"

    goto :goto_6

    .line 422
    :cond_b
    const-string v6, "HR_REST_DETAIL"

    .line 425
    :goto_6
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 427
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/Map$Entry;

    .line 428
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/ejp;

    .line 429
    move-object v11, v10

    check-cast v11, Lo/eju;

    .line 430
    new-instance v0, Lo/eju$a;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {v0, v11, v6, v1}, Lo/eju$a;-><init>(Lo/eju;Ljava/lang/String;[Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Lo/eju;->e(Lo/eju$c;)V

    .line 431
    invoke-virtual {v11}, Lo/eju;->b()Z

    move-result v0

    if-nez v0, :cond_c

    .line 432
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 434
    :cond_c
    goto :goto_7

    .line 436
    :cond_d
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/Long;

    .line 437
    invoke-interface {v4, v9}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    goto :goto_8

    .line 439
    :cond_e
    goto/16 :goto_d

    :cond_f
    iget-object v0, p0, Lo/ewf$1;->a:Lo/ehe$a;

    invoke-virtual {v0}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "warning_hr"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 440
    iget-object v0, p0, Lo/ewf$1;->b:Lo/ewf;

    iget-object v1, p0, Lo/ewf$1;->c:Ljava/util/Map;

    sget-object v2, Lo/ewf$b;->c:Lo/ewf$b;

    invoke-static {v0, v1, v2}, Lo/ewf;->a(Lo/ewf;Ljava/util/Map;Lo/ewf$b;)Lo/ewf$a;

    move-result-object v5

    .line 442
    iget-object v0, v5, Lo/ewf$a;->d:Lo/ewf$d;

    sget-object v1, Lo/ewf$d;->d:Lo/ewf$d;

    if-ne v0, v1, :cond_13

    .line 445
    const-string v6, "HR_WARNING_MIN"

    .line 446
    const-string v7, "HR_WARNING_MAX"

    .line 448
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 450
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/Map$Entry;

    .line 451
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/ejp;

    .line 452
    move-object v12, v11

    check-cast v12, Lo/eju;

    .line 453
    new-instance v0, Lo/eju$b;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, v12, v6, v7}, Lo/eju$b;-><init>(Lo/eju;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Lo/eju;->e(Lo/eju$c;)V

    .line 454
    invoke-virtual {v12}, Lo/eju;->b()Z

    move-result v0

    if-nez v0, :cond_10

    .line 455
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 457
    :cond_10
    goto :goto_9

    .line 459
    :cond_11
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/Long;

    .line 460
    invoke-interface {v4, v10}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    goto :goto_a

    .line 463
    :cond_12
    goto/16 :goto_d

    :cond_13
    iget-object v0, v5, Lo/ewf$a;->d:Lo/ewf$d;

    sget-object v1, Lo/ewf$d;->b:Lo/ewf$d;

    if-ne v0, v1, :cond_16

    .line 465
    const-string v6, "HR_WARNING_DETAIL"

    .line 467
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 469
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/Map$Entry;

    .line 470
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/ejp;

    .line 471
    move-object v11, v10

    check-cast v11, Lo/eju;

    .line 472
    new-instance v0, Lo/eju$d;

    invoke-direct {v0, v6}, Lo/eju$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Lo/eju;->e(Lo/eju$c;)V

    .line 473
    invoke-virtual {v11}, Lo/eju;->b()Z

    move-result v0

    if-nez v0, :cond_14

    .line 474
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 476
    :cond_14
    goto :goto_b

    .line 478
    :cond_15
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/Long;

    .line 479
    invoke-interface {v4, v9}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    goto :goto_c

    .line 484
    :cond_16
    :goto_d
    iget-object v0, p0, Lo/ewf$1;->e:Lo/ekr;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v4}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 485
    return-void
.end method
