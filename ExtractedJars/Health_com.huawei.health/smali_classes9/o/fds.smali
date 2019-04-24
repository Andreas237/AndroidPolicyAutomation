.class public Lo/fds;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejk;


# instance fields
.field private a:Lo/acu;

.field private b:[B

.field d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acn;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    iput-object v0, p0, Lo/fds;->a:Lo/acu;

    .line 49
    const/4 v0, 0x1

    new-array v0, v0, [B

    iput-object v0, p0, Lo/fds;->b:[B

    .line 153
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fds;->d:Ljava/util/List;

    return-void
.end method

.method private a(Z)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)Ljava/util/List<Lo/acn;>;"
        }
    .end annotation

    .line 79
    iget-object v2, p0, Lo/fds;->b:[B

    monitor-enter v2

    .line 80
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 81
    iget-object v0, p0, Lo/fds;->d:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 82
    if-eqz p1, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 83
    invoke-direct {p0}, Lo/fds;->b()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v3, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 86
    :goto_0
    iget-object v0, p0, Lo/fds;->d:Ljava/util/List;

    return-object v0
.end method

.method private b()Ljava/util/Comparator;
    .locals 1

    .line 59
    new-instance v0, Lo/fds$2;

    invoke-direct {v0, p0}, Lo/fds$2;-><init>(Lo/fds;)V

    .line 76
    return-object v0
.end method

.method private b(Lcom/huawei/hihealth/HiHealthData;)Lo/acn;
    .locals 5

    .line 165
    const-string v0, "weight"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 166
    new-instance v4, Lo/acn;

    invoke-direct {v4}, Lo/acn;-><init>()V

    .line 167
    const-string v0, "weight"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->e(D)V

    .line 168
    const-string v0, "weight_bodyfat"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->c(D)V

    .line 169
    const-string v0, "weight_muscles"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->p(D)V

    .line 170
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->a(J)V

    .line 171
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->c(J)V

    .line 173
    return-object v4

    .line 175
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private d(J)J
    .locals 3

    .line 280
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 281
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 282
    const/16 v0, 0xa

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 283
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 284
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 285
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 286
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 287
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public a(Lo/ekr;Lo/ehe$a;)V
    .locals 14

    .line 230
    const-wide/32 v5, 0x4d3f6400

    .line 231
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 232
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 233
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 234
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/fds;->a(Z)Ljava/util/List;

    move-result-object v10

    .line 241
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 242
    invoke-interface {v11, v10}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 243
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/acn;

    .line 244
    const/4 v0, 0x0

    if-eq v0, v13, :cond_2

    .line 245
    invoke-virtual {v13}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 246
    new-instance v0, Ljava/util/Date;

    invoke-virtual {v13}, Lo/acn;->p()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0}, Lo/dbu;->g(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    add-long/2addr v0, v5

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/eis;

    invoke-virtual {v13}, Lo/acn;->b()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-direct {v1, v2}, Lo/eis;-><init>(F)V

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    new-instance v0, Ljava/util/Date;

    invoke-virtual {v13}, Lo/acn;->p()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0}, Lo/dbu;->g(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    add-long/2addr v0, v5

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/eis;

    invoke-virtual {v13}, Lo/acn;->d()D

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cxh;->e(D)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-direct {v1, v2}, Lo/eis;-><init>(F)V

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    const-string v0, "WeightLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "weightBean.getWeighTime()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Lo/acn;->p()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    invoke-virtual {v13}, Lo/acn;->g()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 252
    new-instance v0, Ljava/util/Date;

    invoke-virtual {v13}, Lo/acn;->p()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0}, Lo/dbu;->g(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    add-long/2addr v0, v5

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/eis;

    invoke-virtual {v13}, Lo/acn;->g()D

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cxh;->e(D)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-direct {v1, v2}, Lo/eis;-><init>(F)V

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    .line 255
    :cond_1
    new-instance v0, Ljava/util/Date;

    invoke-virtual {v13}, Lo/acn;->p()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0}, Lo/dbu;->g(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    add-long/2addr v0, v5

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/eis;

    invoke-virtual {v13}, Lo/acn;->d()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-direct {v1, v2}, Lo/eis;-><init>(F)V

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    const-string v0, "WeightLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "weightBean.getWeighTime()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Lo/acn;->p()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    invoke-virtual {v13}, Lo/acn;->g()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 258
    new-instance v0, Ljava/util/Date;

    invoke-virtual {v13}, Lo/acn;->p()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0}, Lo/dbu;->g(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    add-long/2addr v0, v5

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/eis;

    invoke-virtual {v13}, Lo/acn;->g()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-direct {v1, v2}, Lo/eis;-><init>(F)V

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    :cond_2
    :goto_1
    goto/16 :goto_0

    .line 265
    :cond_3
    invoke-virtual/range {p2 .. p2}, Lo/ehe$a;->e()I

    move-result v0

    if-nez v0, :cond_4

    .line 266
    const-string v0, "WeightLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DATA_LAYER_BASE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    const/4 v0, 0x0

    invoke-interface {p1, v0, v7}, Lo/ekr;->b(ILjava/lang/Object;)V

    goto :goto_2

    .line 268
    :cond_4
    invoke-virtual/range {p2 .. p2}, Lo/ehe$a;->e()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 269
    const-string v0, "WeightLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DATA_LAYER_SUPER"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    const/4 v0, 0x0

    invoke-interface {p1, v0, v8}, Lo/ekr;->b(ILjava/lang/Object;)V

    goto :goto_2

    .line 271
    :cond_5
    invoke-virtual/range {p2 .. p2}, Lo/ehe$a;->e()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    .line 272
    const-string v0, "WeightLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DATA_LAYER_SUPER_TOW"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    const/4 v0, 0x0

    invoke-interface {p1, v0, v9}, Lo/ekr;->b(ILjava/lang/Object;)V

    goto :goto_2

    .line 274
    :cond_6
    invoke-virtual/range {p2 .. p2}, Lo/ehe$a;->e()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_7

    .line 275
    const-string v0, "WeightLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DATA_LAYER_SUPER_Three"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    const/4 v0, 0x0

    invoke-interface {p1, v0, v7}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 278
    :cond_7
    :goto_2
    return-void
.end method

.method public a(Lo/ekr;Lo/ehe$a;JJI)V
    .locals 7

    .line 89
    const/4 v4, 0x1

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 90
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    const-string v0, "test"

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 91
    new-instance v6, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 92
    invoke-virtual {v6, p3, p4, p5, p6}, Lcom/huawei/hihealth/HiAggregateOption;->setTimeRange(JJ)V

    .line 93
    invoke-virtual {v6, v4}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 94
    const/4 v0, 0x1

    if-ne p7, v0, :cond_0

    .line 95
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    goto :goto_0

    .line 97
    :cond_0
    const/4 v0, 0x5

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 99
    :goto_0
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 100
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 101
    iget-object v0, p0, Lo/fds;->a:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 102
    iget-object v0, p0, Lo/fds;->a:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 104
    const-string v0, "NULL"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    goto :goto_1

    .line 106
    :cond_1
    iget-object v0, p0, Lo/fds;->a:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    goto :goto_1

    .line 109
    :cond_2
    const-string v0, "NULL"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    .line 111
    :goto_1
    const-string v0, "WeightLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "readSevenDaysWeightData---user.getUUIDOfUser():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fds;->a:Lo/acu;

    invoke-virtual {v3}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "user.getName(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fds;->a:Lo/acu;

    invoke-virtual {v3}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    invoke-virtual {v6, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 113
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/fds$4;

    invoke-direct {v1, p0, p7, p1, p2}, Lo/fds$4;-><init>(Lo/fds;ILo/ekr;Lo/ehe$a;)V

    invoke-interface {v0, v6, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 133
    return-void

    nop

    :array_0
    .array-data 4
        0x2716
    .end array-data
.end method

.method public b(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 136
    iget-object v4, p0, Lo/fds;->b:[B

    monitor-enter v4

    .line 137
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 138
    const-string v0, "WeightLineChartStorageHelper"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "testReadWeightData return datas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    monitor-exit v4

    return-void

    .line 141
    :cond_0
    const-string v0, "WeightLineChartStorageHelper"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "testReadWeightData datas.size="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 144
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 145
    invoke-direct {p0, v6}, Lo/fds;->b(Lcom/huawei/hihealth/HiHealthData;)Lo/acn;

    move-result-object v7

    .line 146
    if-eqz v7, :cond_1

    .line 147
    invoke-virtual {p0, v7}, Lo/fds;->b(Lo/acn;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    :cond_1
    goto :goto_0

    .line 151
    :cond_2
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8

    .line 152
    :goto_1
    return-void
.end method

.method public b(Lo/acn;)V
    .locals 1

    .line 155
    iget-object v0, p0, Lo/fds;->d:Ljava/util/List;

    if-nez v0, :cond_0

    .line 156
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fds;->d:Ljava/util/List;

    .line 159
    :cond_0
    iget-object v0, p0, Lo/fds;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 160
    iget-object v0, p0, Lo/fds;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    :cond_1
    return-void
.end method

.method public b(Lo/ekr;Lo/ehe$a;)V
    .locals 13

    .line 181
    const-wide/32 v4, 0x2932e00

    .line 182
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 183
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 184
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 185
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/fds;->a(Z)Ljava/util/List;

    move-result-object v9

    .line 192
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 193
    invoke-interface {v10, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 194
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/acn;

    .line 195
    const/4 v0, 0x0

    if-eq v0, v12, :cond_2

    .line 196
    invoke-virtual {v12}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 197
    invoke-virtual {v12}, Lo/acn;->p()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/fds;->d(J)J

    move-result-wide v0

    add-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/eis;

    invoke-virtual {v12}, Lo/acn;->b()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-direct {v1, v2}, Lo/eis;-><init>(F)V

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 200
    invoke-virtual {v12}, Lo/acn;->p()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/fds;->d(J)J

    move-result-wide v0

    add-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/eis;

    invoke-virtual {v12}, Lo/acn;->d()D

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cxh;->e(D)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-direct {v1, v2}, Lo/eis;-><init>(F)V

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    invoke-virtual {v12}, Lo/acn;->g()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 203
    invoke-virtual {v12}, Lo/acn;->p()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/fds;->d(J)J

    move-result-wide v0

    add-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/eis;

    invoke-virtual {v12}, Lo/acn;->g()D

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cxh;->e(D)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-direct {v1, v2}, Lo/eis;-><init>(F)V

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 206
    :cond_1
    invoke-virtual {v12}, Lo/acn;->p()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/fds;->d(J)J

    move-result-wide v0

    add-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/eis;

    invoke-virtual {v12}, Lo/acn;->d()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-direct {v1, v2}, Lo/eis;-><init>(F)V

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    invoke-virtual {v12}, Lo/acn;->g()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 208
    invoke-virtual {v12}, Lo/acn;->p()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/fds;->d(J)J

    move-result-wide v0

    add-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/eis;

    invoke-virtual {v12}, Lo/acn;->g()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-direct {v1, v2}, Lo/eis;-><init>(F)V

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    :cond_2
    :goto_1
    goto/16 :goto_0

    .line 215
    :cond_3
    invoke-virtual {p2}, Lo/ehe$a;->e()I

    move-result v0

    if-nez v0, :cond_4

    .line 216
    const-string v0, "WeightLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DATA_LAYER_BASE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    const/4 v0, 0x0

    invoke-interface {p1, v0, v6}, Lo/ekr;->b(ILjava/lang/Object;)V

    goto :goto_2

    .line 218
    :cond_4
    invoke-virtual {p2}, Lo/ehe$a;->e()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 219
    const-string v0, "WeightLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DATA_LAYER_SUPER"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    const/4 v0, 0x0

    invoke-interface {p1, v0, v7}, Lo/ekr;->b(ILjava/lang/Object;)V

    goto :goto_2

    .line 221
    :cond_5
    invoke-virtual {p2}, Lo/ehe$a;->e()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    .line 222
    const-string v0, "WeightLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DATA_LAYER_SUPER_TOW"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    const/4 v0, 0x0

    invoke-interface {p1, v0, v8}, Lo/ekr;->b(ILjava/lang/Object;)V

    goto :goto_2

    .line 224
    :cond_6
    invoke-virtual {p2}, Lo/ehe$a;->e()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_7

    .line 225
    const-string v0, "WeightLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DATA_LAYER_SUPER_Three"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    const/4 v0, 0x0

    invoke-interface {p1, v0, v6}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 228
    :cond_7
    :goto_2
    return-void
.end method

.method public d(Landroid/content/Context;JJLo/eic;Lo/ehe$a;Lo/ekr;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJLo/eic;Lo/ehe$a;Lo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 52
    sget-object v0, Lo/eic;->S:Lo/eic;

    if-eq p6, v0, :cond_0

    sget-object v0, Lo/eic;->T:Lo/eic;

    if-ne p6, v0, :cond_1

    .line 53
    :cond_0
    move-object v0, p0

    move-object/from16 v1, p8

    move-object v2, p7

    move-wide v3, p2

    move-wide v5, p4

    const/4 v7, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/fds;->a(Lo/ekr;Lo/ehe$a;JJI)V

    goto :goto_0

    .line 55
    :cond_1
    move-object v0, p0

    move-object/from16 v1, p8

    move-object v2, p7

    move-wide v3, p2

    move-wide v5, p4

    const/4 v7, 0x2

    invoke-virtual/range {v0 .. v7}, Lo/fds;->a(Lo/ekr;Lo/ehe$a;JJI)V

    .line 57
    :goto_0
    return-void
.end method
