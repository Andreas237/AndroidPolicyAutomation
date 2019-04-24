.class public Lo/ewf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejk;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ewf$e;,
        Lo/ewf$b;,
        Lo/ewf$a;,
        Lo/ewf$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/util/Map;Lo/ewf$b;)Lo/ewf$a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Lo/ewf$a;>;Lo/ewf$b;)Lo/ewf$a;"
        }
    .end annotation

    .line 676
    sget-object v0, Lo/ewf$b;->b:Lo/ewf$b;

    if-ne p2, v0, :cond_2

    .line 677
    const-string v0, "HR_NORMAL_MAX"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ewf$a;

    .line 678
    if-eqz v3, :cond_0

    .line 679
    return-object v3

    .line 681
    :cond_0
    const-string v0, "HR_NORMAL_MIN"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ewf$a;

    .line 682
    if-eqz v3, :cond_1

    .line 683
    return-object v3

    .line 685
    :cond_1
    const-string v0, "HR_NORMAL_DETAIL"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ewf$a;

    .line 686
    return-object v3

    .line 687
    :cond_2
    sget-object v0, Lo/ewf$b;->a:Lo/ewf$b;

    if-ne p2, v0, :cond_4

    .line 688
    const-string v0, "HR_REST"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ewf$a;

    .line 689
    if-eqz v3, :cond_3

    .line 690
    return-object v3

    .line 692
    :cond_3
    const-string v0, "HR_REST_DETAIL"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ewf$a;

    .line 693
    return-object v3

    .line 694
    :cond_4
    sget-object v0, Lo/ewf$b;->c:Lo/ewf$b;

    if-ne p2, v0, :cond_7

    .line 695
    const-string v0, "HR_WARNING_MAX"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ewf$a;

    .line 696
    if-eqz v3, :cond_5

    .line 697
    return-object v3

    .line 699
    :cond_5
    const-string v0, "HR_WARNING_MIN"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ewf$a;

    .line 700
    if-eqz v3, :cond_6

    .line 701
    return-object v3

    .line 703
    :cond_6
    const-string v0, "HR_WARNING_DETAIL"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ewf$a;

    .line 704
    return-object v3

    .line 706
    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "not support:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic a(Lo/ewf;Ljava/util/Map;Lo/ewf$b;)Lo/ewf$a;
    .locals 1

    .line 48
    invoke-direct {p0, p1, p2}, Lo/ewf;->a(Ljava/util/Map;Lo/ewf$b;)Lo/ewf$a;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Landroid/util/SparseArray;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Lo/ewf$a;>;Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;)V"
        }
    .end annotation

    .line 535
    move-object/from16 v0, p3

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 536
    :goto_0
    move-object/from16 v0, p3

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 537
    move-object/from16 v0, p3

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ewf$a;

    iget v5, v0, Lo/ewf$a;->c:I

    goto :goto_1

    :cond_1
    const/4 v5, -0x1

    .line 540
    :goto_1
    const-string v0, "HR_WARNING_MAX"

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v6, 0x1

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    .line 542
    :goto_2
    if-nez v4, :cond_3

    .line 543
    return-void

    .line 546
    :cond_3
    const/4 v7, 0x0

    .line 548
    if-eqz v6, :cond_4

    .line 549
    const-string v0, "HR_WARNING_MAX"

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ewf$a;

    iget v7, v0, Lo/ewf$a;->b:I

    .line 553
    :cond_4
    move-object/from16 v0, p4

    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/List;

    .line 555
    const/4 v9, 0x0

    :goto_3
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_7

    .line 556
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 558
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v11

    .line 561
    invoke-static {v11, v12, v7}, Lo/ewf$a;->c(JI)J

    move-result-wide v11

    .line 565
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 566
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/eju;

    goto :goto_4

    .line 568
    :cond_5
    new-instance v13, Lo/eju;

    invoke-direct {v13}, Lo/eju;-><init>()V

    .line 580
    :goto_4
    new-instance v14, Lo/ewf$e;

    invoke-direct {v14}, Lo/ewf$e;-><init>()V

    .line 581
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v2

    invoke-virtual {v14, v0, v1, v2, v3}, Lo/ewf$e;->b(JJ)V

    .line 582
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;

    .line 583
    if-nez v15, :cond_6

    .line 584
    goto :goto_5

    .line 586
    :cond_6
    invoke-virtual {v15}, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->getMinHeartRate()I

    move-result v0

    invoke-virtual {v15}, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->getMaxHeartRate()I

    move-result v1

    invoke-virtual {v14, v0, v1}, Lo/ewf$e;->b(II)V

    .line 587
    move-object/from16 v0, p2

    invoke-virtual {v13, v0, v14}, Lo/eju;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 589
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 555
    :goto_5
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_3

    .line 591
    :cond_7
    return-void
.end method

.method private c(JJLo/eic;Lo/ehe$a;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJLo/eic;Lo/ehe$a;)Ljava/util/List<Lcom/huawei/hihealth/HiAggregateOption;>;"
        }
    .end annotation

    .line 182
    invoke-virtual {p5}, Lo/eic;->u()Z

    move-result v0

    if-nez v0, :cond_0

    .line 183
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "only support heart rate Fitness_HeartRateChartStorageHelper"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 186
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 189
    new-instance v0, Lo/fbr;

    invoke-direct {v0}, Lo/fbr;-><init>()V

    .line 190
    invoke-virtual {v0, p1, p2, p3, p4}, Lo/fbr;->e(JJ)Lo/fbr;

    move-result-object v4

    .line 192
    invoke-virtual {p6}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "normal_hr"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 194
    invoke-virtual {p5}, Lo/eic;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 195
    invoke-direct {p0, p5}, Lo/ewf;->d(Lo/eic;)Lo/fbr$e;

    move-result-object v0

    const-string v1, "HR_NORMAL_MAX"

    const v2, 0xb3c0

    invoke-virtual {v4, v0, v1, v2}, Lo/fbr;->d(Lo/fbr$e;Ljava/lang/String;I)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 198
    invoke-direct {p0, p5}, Lo/ewf;->d(Lo/eic;)Lo/fbr$e;

    move-result-object v0

    const-string v1, "HR_NORMAL_MIN"

    const v2, 0xb3c1

    invoke-virtual {v4, v0, v1, v2}, Lo/fbr;->d(Lo/fbr$e;Ljava/lang/String;I)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 202
    :cond_1
    invoke-direct {p0, p5}, Lo/ewf;->d(Lo/eic;)Lo/fbr$e;

    move-result-object v0

    const-string v1, "HR_NORMAL_DETAIL"

    const/16 v2, 0x7d2

    invoke-virtual {v4, v0, v1, v2}, Lo/fbr;->d(Lo/fbr$e;Ljava/lang/String;I)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 206
    invoke-direct {p0, p5}, Lo/ewf;->d(Lo/eic;)Lo/fbr$e;

    move-result-object v0

    const-string v1, "HR_REST_DETAIL"

    const/16 v2, 0x7e2

    invoke-virtual {v4, v0, v1, v2}, Lo/fbr;->d(Lo/fbr$e;Ljava/lang/String;I)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 210
    :cond_2
    invoke-virtual {p6}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rest_hr"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 212
    invoke-virtual {p5}, Lo/eic;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 213
    invoke-direct {p0, p5}, Lo/ewf;->d(Lo/eic;)Lo/fbr$e;

    move-result-object v0

    const-string v1, "HR_REST"

    const v2, 0xb3c2

    invoke-virtual {v4, v0, v1, v2}, Lo/fbr;->d(Lo/fbr$e;Ljava/lang/String;I)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 217
    :cond_3
    invoke-direct {p0, p5}, Lo/ewf;->d(Lo/eic;)Lo/fbr$e;

    move-result-object v0

    const-string v1, "HR_REST_DETAIL"

    const/16 v2, 0x7e2

    invoke-virtual {v4, v0, v1, v2}, Lo/fbr;->d(Lo/fbr$e;Ljava/lang/String;I)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 221
    :cond_4
    invoke-virtual {p6}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "warning_hr"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 223
    invoke-virtual {p5}, Lo/eic;->i()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 224
    invoke-direct {p0, p5}, Lo/ewf;->d(Lo/eic;)Lo/fbr$e;

    move-result-object v0

    const-string v1, "HR_WARNING_MAX"

    const v2, 0xb79b

    invoke-virtual {v4, v0, v1, v2}, Lo/fbr;->d(Lo/fbr$e;Ljava/lang/String;I)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 227
    invoke-direct {p0, p5}, Lo/ewf;->d(Lo/eic;)Lo/fbr$e;

    move-result-object v0

    const-string v1, "HR_WARNING_MIN"

    const v2, 0xb79a

    invoke-virtual {v4, v0, v1, v2}, Lo/fbr;->d(Lo/fbr$e;Ljava/lang/String;I)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    invoke-direct {p0, p5}, Lo/ewf;->d(Lo/eic;)Lo/fbr$e;

    move-result-object v0

    const-string v1, "HR_WARNING_DETAIL"

    const/16 v2, 0x835

    invoke-virtual {v4, v0, v1, v2}, Lo/fbr;->d(Lo/fbr$e;Ljava/lang/String;I)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 235
    :cond_5
    invoke-direct {p0, p5}, Lo/ewf;->d(Lo/eic;)Lo/fbr$e;

    move-result-object v0

    const-string v1, "HR_WARNING_DETAIL"

    const/16 v2, 0x835

    invoke-virtual {v4, v0, v1, v2}, Lo/fbr;->d(Lo/fbr$e;Ljava/lang/String;I)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 241
    :cond_6
    :goto_0
    return-object v3
.end method

.method private d(Lo/eic;)Lo/fbr$e;
    .locals 3

    .line 310
    invoke-virtual {p1}, Lo/eic;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 311
    sget-object v0, Lo/fbr$e;->e:Lo/fbr$e;

    return-object v0

    .line 312
    :cond_0
    invoke-virtual {p1}, Lo/eic;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 313
    sget-object v0, Lo/fbr$e;->d:Lo/fbr$e;

    return-object v0

    .line 314
    :cond_1
    invoke-virtual {p1}, Lo/eic;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 315
    sget-object v0, Lo/fbr$e;->d:Lo/fbr$e;

    return-object v0

    .line 316
    :cond_2
    invoke-virtual {p1}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 317
    sget-object v0, Lo/fbr$e;->b:Lo/fbr$e;

    return-object v0

    .line 318
    :cond_3
    invoke-virtual {p1}, Lo/eic;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 319
    sget-object v0, Lo/fbr$e;->a:Lo/fbr$e;

    return-object v0

    .line 321
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseUserView failed:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic d(Lo/ewf;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Landroid/util/SparseArray;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2, p3, p4}, Lo/ewf;->e(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Landroid/util/SparseArray;)V

    return-void
.end method

.method private e(JJLo/eic;Lo/ehe$a;Ljava/util/List;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJLo/eic;Lo/ehe$a;Ljava/util/List<Lcom/huawei/hihealth/HiAggregateOption;>;)Ljava/util/Map<Ljava/lang/String;Lo/ewf$a;>;"
        }
    .end annotation

    .line 248
    invoke-virtual {p5}, Lo/eic;->u()Z

    move-result v0

    if-nez v0, :cond_0

    .line 249
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "only support heart rate Fitness_HeartRateChartStorageHelper"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 252
    :cond_0
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 253
    const/4 v6, 0x0

    .line 255
    invoke-virtual {p6}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "normal_hr"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 257
    invoke-virtual {p5}, Lo/eic;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 258
    const-string v0, "HR_NORMAL_MAX"

    new-instance v1, Lo/ewf$a;

    .line 259
    invoke-interface {p7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiAggregateOption;->getGroupUnitType()I

    move-result v2

    sget-object v3, Lo/ewf$d;->d:Lo/ewf$d;

    const/4 v4, 0x1

    invoke-direct {v1, v6, v2, v3, v4}, Lo/ewf$a;-><init>(IILo/ewf$d;Z)V

    .line 258
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    add-int/lit8 v6, v6, 0x1

    .line 262
    const-string v0, "HR_NORMAL_MIN"

    new-instance v1, Lo/ewf$a;

    .line 263
    invoke-interface {p7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiAggregateOption;->getGroupUnitType()I

    move-result v2

    sget-object v3, Lo/ewf$d;->d:Lo/ewf$d;

    const/4 v4, 0x1

    invoke-direct {v1, v6, v2, v3, v4}, Lo/ewf$a;-><init>(IILo/ewf$d;Z)V

    .line 262
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 266
    :cond_1
    const-string v0, "HR_NORMAL_DETAIL"

    new-instance v1, Lo/ewf$a;

    .line 267
    invoke-interface {p7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiAggregateOption;->getGroupUnitType()I

    move-result v2

    sget-object v3, Lo/ewf$d;->e:Lo/ewf$d;

    const/4 v4, 0x0

    invoke-direct {v1, v6, v2, v3, v4}, Lo/ewf$a;-><init>(IILo/ewf$d;Z)V

    .line 266
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    add-int/lit8 v6, v6, 0x1

    .line 269
    const-string v0, "HR_REST_DETAIL"

    new-instance v1, Lo/ewf$a;

    .line 270
    invoke-interface {p7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiAggregateOption;->getGroupUnitType()I

    move-result v2

    sget-object v3, Lo/ewf$d;->e:Lo/ewf$d;

    const/4 v4, 0x0

    invoke-direct {v1, v6, v2, v3, v4}, Lo/ewf$a;-><init>(IILo/ewf$d;Z)V

    .line 269
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 273
    :cond_2
    invoke-virtual {p6}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rest_hr"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 275
    invoke-virtual {p5}, Lo/eic;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 276
    const-string v0, "HR_REST"

    new-instance v1, Lo/ewf$a;

    .line 277
    invoke-interface {p7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiAggregateOption;->getGroupUnitType()I

    move-result v2

    sget-object v3, Lo/ewf$d;->e:Lo/ewf$d;

    const/4 v4, 0x1

    invoke-direct {v1, v6, v2, v3, v4}, Lo/ewf$a;-><init>(IILo/ewf$d;Z)V

    .line 276
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 280
    :cond_3
    const-string v0, "HR_REST_DETAIL"

    new-instance v1, Lo/ewf$a;

    .line 281
    invoke-interface {p7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiAggregateOption;->getGroupUnitType()I

    move-result v2

    sget-object v3, Lo/ewf$d;->e:Lo/ewf$d;

    const/4 v4, 0x0

    invoke-direct {v1, v6, v2, v3, v4}, Lo/ewf$a;-><init>(IILo/ewf$d;Z)V

    .line 280
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 284
    :cond_4
    invoke-virtual {p6}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "warning_hr"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 286
    invoke-virtual {p5}, Lo/eic;->i()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 287
    const-string v0, "HR_WARNING_MAX"

    new-instance v1, Lo/ewf$a;

    .line 288
    invoke-interface {p7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiAggregateOption;->getGroupUnitType()I

    move-result v2

    sget-object v3, Lo/ewf$d;->d:Lo/ewf$d;

    const/4 v4, 0x1

    invoke-direct {v1, v6, v2, v3, v4}, Lo/ewf$a;-><init>(IILo/ewf$d;Z)V

    .line 287
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    add-int/lit8 v6, v6, 0x1

    .line 291
    const-string v0, "HR_WARNING_MIN"

    new-instance v1, Lo/ewf$a;

    .line 292
    invoke-interface {p7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiAggregateOption;->getGroupUnitType()I

    move-result v2

    sget-object v3, Lo/ewf$d;->d:Lo/ewf$d;

    const/4 v4, 0x1

    invoke-direct {v1, v6, v2, v3, v4}, Lo/ewf$a;-><init>(IILo/ewf$d;Z)V

    .line 291
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    add-int/lit8 v6, v6, 0x1

    .line 295
    const-string v0, "HR_WARNING_DETAIL"

    new-instance v1, Lo/ewf$a;

    .line 296
    invoke-interface {p7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiAggregateOption;->getGroupUnitType()I

    move-result v2

    sget-object v3, Lo/ewf$d;->d:Lo/ewf$d;

    const/4 v4, 0x1

    invoke-direct {v1, v6, v2, v3, v4}, Lo/ewf$a;-><init>(IILo/ewf$d;Z)V

    .line 295
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 299
    :cond_5
    const-string v0, "HR_WARNING_DETAIL"

    new-instance v1, Lo/ewf$a;

    .line 300
    invoke-interface {p7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiAggregateOption;->getGroupUnitType()I

    move-result v2

    sget-object v3, Lo/ewf$d;->b:Lo/ewf$d;

    const/4 v4, 0x0

    invoke-direct {v1, v6, v2, v3, v4}, Lo/ewf$a;-><init>(IILo/ewf$d;Z)V

    .line 299
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    add-int/lit8 v6, v6, 0x1

    .line 305
    :cond_6
    :goto_0
    return-object v5
.end method

.method private e(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Landroid/util/SparseArray;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Lo/ewf$a;>;Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;)V"
        }
    .end annotation

    .line 494
    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 495
    :goto_0
    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 496
    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ewf$a;

    iget v2, v0, Lo/ewf$a;->c:I

    goto :goto_1

    :cond_1
    const/4 v2, -0x1

    .line 498
    :goto_1
    if-nez v1, :cond_2

    .line 499
    return-void

    .line 502
    :cond_2
    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ewf$a;

    .line 503
    invoke-virtual {p4, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 506
    if-nez v4, :cond_3

    .line 507
    return-void

    .line 510
    :cond_3
    const/4 v5, 0x0

    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_5

    .line 511
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 513
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v7

    .line 515
    invoke-virtual {v3, v7, v8}, Lo/ewf$a;->d(J)J

    move-result-wide v7

    .line 519
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 520
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/eju;

    goto :goto_3

    .line 522
    :cond_4
    new-instance v9, Lo/eju;

    invoke-direct {v9}, Lo/eju;-><init>()V

    .line 524
    :goto_3
    invoke-virtual {v6, p2}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    invoke-virtual {v9, p2, v0}, Lo/eju;->a(Ljava/lang/String;F)V

    .line 526
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 528
    :cond_5
    return-void
.end method

.method static synthetic e(Lo/ewf;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Landroid/util/SparseArray;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2, p3, p4}, Lo/ewf;->b(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Landroid/util/SparseArray;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;JJLo/ehe$a;Ljava/util/List;Ljava/util/Map;Lo/ekr;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJLo/ehe$a;Ljava/util/List<Lcom/huawei/hihealth/HiAggregateOption;>;Ljava/util/Map<Ljava/lang/String;Lo/ewf$a;>;Lo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 336
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/ewf$1;

    invoke-direct {v1, p0, p9, p8, p6}, Lo/ewf$1;-><init>(Lo/ewf;Lo/ekr;Ljava/util/Map;Lo/ehe$a;)V

    invoke-interface {v0, p7, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 487
    return-void
.end method

.method public d(Landroid/content/Context;JJLo/eic;Lo/ehe$a;Lo/ekr;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJLo/eic;Lo/ehe$a;Lo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 85
    invoke-virtual/range {p6 .. p6}, Lo/eic;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 86
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v10

    .line 87
    move-wide v0, p2

    invoke-virtual {v10, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 88
    const/16 v0, 0xb

    invoke-virtual {v10, v0}, Ljava/util/Calendar;->get(I)I

    move-result v11

    .line 89
    const/16 v0, 0xc

    invoke-virtual {v10, v0}, Ljava/util/Calendar;->get(I)I

    move-result v12

    .line 90
    if-nez v11, :cond_0

    if-eqz v12, :cond_1

    .line 91
    :cond_0
    move-object/from16 v0, p8

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 92
    return-void

    .line 96
    :cond_1
    move-object v0, p0

    move-wide v1, p2

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    invoke-direct/range {v0 .. v6}, Lo/ewf;->c(JJLo/eic;Lo/ehe$a;)Ljava/util/List;

    move-result-object v10

    .line 97
    move-object v0, p0

    move-wide v1, p2

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object v7, v10

    invoke-direct/range {v0 .. v7}, Lo/ewf;->e(JJLo/eic;Lo/ehe$a;Ljava/util/List;)Ljava/util/Map;

    move-result-object v11

    .line 99
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide/from16 v4, p4

    move-object/from16 v6, p7

    move-object v7, v10

    move-object v8, v11

    move-object/from16 v9, p8

    invoke-virtual/range {v0 .. v9}, Lo/ewf;->a(Landroid/content/Context;JJLo/ehe$a;Ljava/util/List;Ljava/util/Map;Lo/ekr;)V

    .line 100
    return-void
.end method
