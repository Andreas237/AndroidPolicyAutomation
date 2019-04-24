.class public Lo/fdj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fdj$c;,
        Lo/fdj$e;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/String;

.field private static c:Lo/fdj;


# instance fields
.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/fdf;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 55
    const-string v0, "UIHLH_HealthDataInteractor"

    sput-object v0, Lo/fdj;->a:Ljava/lang/String;

    .line 74
    const/4 v0, 0x0

    sput-object v0, Lo/fdj;->c:Lo/fdj;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fdj;->b:Ljava/util/ArrayList;

    .line 82
    return-void
.end method

.method synthetic constructor <init>(Lo/fdj$3;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lo/fdj;-><init>()V

    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 54
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lo/fdj;Ljava/lang/Object;Lo/egg;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lo/fdj;->c(Ljava/lang/Object;Lo/egg;)V

    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/fdf;>;)V"
        }
    .end annotation

    .line 1085
    const/4 v5, 0x0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v6

    :goto_0
    add-int/lit8 v0, v6, -0x1

    if-ge v5, v0, :cond_2

    .line 1086
    add-int/lit8 v7, v5, 0x1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v8

    :goto_1
    if-ge v7, v8, :cond_1

    .line 1087
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v0, v0, Lo/fdf;->a:J

    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/fdf;

    iget-wide v2, v2, Lo/fdf;->a:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 1088
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fdf;

    .line 1089
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v5, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1090
    invoke-virtual {p1, v7, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1086
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 1085
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1094
    :cond_2
    return-void
.end method

.method private b(Ljava/util/ArrayList;Ljava/util/Map;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/fdf;>;Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lo/fdf;>;>;)V"
        }
    .end annotation

    .line 1045
    invoke-interface {p2}, Ljava/util/Map;->clear()V

    .line 1046
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_5

    .line 1047
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v0, v0, Lo/fdf;->a:J

    invoke-virtual {p0, v0, v1}, Lo/fdj;->b(J)Ljava/lang/String;

    move-result-object v5

    .line 1048
    invoke-interface {p2, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1049
    invoke-interface {p2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/ArrayList;

    .line 1050
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v7, v0, Lo/fdf;->e:D

    .line 1051
    const/4 v9, 0x0

    .line 1052
    const/4 v10, 0x0

    .line 1053
    const/4 v11, 0x0

    :goto_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v11, v0, :cond_1

    .line 1054
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v0, v0, Lo/fdf;->e:D

    cmpl-double v0, v7, v0

    if-nez v0, :cond_0

    .line 1056
    const/4 v9, 0x1

    .line 1057
    move v10, v11

    .line 1058
    goto :goto_2

    .line 1053
    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 1061
    :cond_1
    :goto_2
    if-eqz v9, :cond_2

    .line 1062
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v0, v0, Lo/fdf;->a:J

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/fdf;

    iget-wide v2, v2, Lo/fdf;->a:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    .line 1063
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1064
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 1067
    :cond_2
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1069
    :cond_3
    :goto_3
    goto :goto_4

    .line 1070
    :cond_4
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1071
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1072
    invoke-interface {p2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1046
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 1076
    :cond_5
    return-void
.end method

.method private b(Ljava/util/List;Lo/egg;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lo/egg;)V"
        }
    .end annotation

    .line 218
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleBloodpressData enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 221
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 222
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_2

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 223
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleBloodpressData data size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    const-wide/16 v8, 0x0

    .line 226
    const-wide/16 v10, 0x0

    .line 227
    const-wide/16 v12, 0x0

    .line 228
    const-wide/16 v14, 0x0

    .line 229
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lcom/huawei/hihealth/HiHealthData;

    .line 230
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v8

    .line 231
    const-string v0, "bloodpressure_systolic"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v10

    .line 232
    const-string v0, "bloodpressure_diastolic"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v12

    .line 233
    const-string v0, "heart_rate"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v14

    .line 234
    new-instance v18, Lo/fdf;

    invoke-direct/range {v18 .. v18}, Lo/fdf;-><init>()V

    .line 235
    move-object/from16 v0, v18

    iput-wide v8, v0, Lo/fdf;->a:J

    .line 236
    move-object/from16 v0, v18

    iput-wide v10, v0, Lo/fdf;->e:D

    .line 237
    move-object/from16 v0, v18

    iput-wide v12, v0, Lo/fdf;->d:D

    .line 239
    move-object/from16 v0, v18

    iget-wide v0, v0, Lo/fdf;->e:D

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    .line 240
    move-object/from16 v0, v18

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 242
    :cond_0
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid bloodpressure value"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    :goto_1
    goto :goto_0

    .line 245
    :cond_1
    goto :goto_2

    .line 246
    :cond_2
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "datas null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    :goto_2
    if-eqz p2, :cond_3

    .line 249
    move-object/from16 v0, p2

    const/4 v1, 0x0

    invoke-interface {v0, v1, v7}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 251
    :cond_3
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleBloodpressData end, time="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    return-void
.end method

.method private c(Ljava/lang/Object;Lo/egg;)V
    .locals 4

    .line 635
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handlerLastTimeHeartRateData enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 636
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 637
    const/4 v0, 0x0

    invoke-interface {p2, v0, p1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 639
    :cond_0
    return-void
.end method

.method private c(Ljava/util/List;Lo/egg;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lo/egg;)V"
        }
    .end annotation

    .line 255
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleBloodpressData enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 257
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 258
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_2

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 259
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleBloodpressData data size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    const-wide/16 v8, 0x0

    .line 262
    const-wide/16 v10, 0x0

    .line 263
    const-wide/16 v12, 0x0

    .line 264
    const-wide/16 v14, 0x0

    .line 265
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 266
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_0
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/huawei/hihealth/HiHealthData;

    .line 267
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v8

    .line 268
    const-string v0, "bloodpressure_systolic"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v10

    .line 269
    const-string v0, "bloodpressure_diastolic"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v12

    .line 270
    const-string v0, "heart_rate"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v14

    .line 271
    new-instance v19, Lo/fdf;

    invoke-direct/range {v19 .. v19}, Lo/fdf;-><init>()V

    .line 272
    move-object/from16 v0, v19

    iput-wide v8, v0, Lo/fdf;->a:J

    .line 273
    move-object/from16 v0, v19

    iput-wide v10, v0, Lo/fdf;->e:D

    .line 274
    move-object/from16 v0, v19

    iput-wide v12, v0, Lo/fdf;->d:D

    .line 276
    move-object/from16 v0, v19

    iget-wide v0, v0, Lo/fdf;->e:D

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    .line 277
    move-object/from16 v0, v16

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 279
    :cond_0
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid bloodpressure value"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    :goto_1
    goto :goto_0

    .line 282
    :cond_1
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1, v7}, Lo/fdj;->a(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 283
    goto :goto_2

    .line 284
    :cond_2
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "datas null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    :goto_2
    if-eqz p2, :cond_3

    .line 287
    move-object/from16 v0, p2

    const/4 v1, 0x0

    invoke-interface {v0, v1, v7}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 289
    :cond_3
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleBloodpressData end, time="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    return-void
.end method

.method static synthetic c(Lo/fdj;Ljava/lang/Object;Lo/egg;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lo/fdj;->d(Ljava/lang/Object;Lo/egg;)V

    return-void
.end method

.method static synthetic c(Lo/fdj;Ljava/util/List;Lo/egg;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lo/fdj;->b(Ljava/util/List;Lo/egg;)V

    return-void
.end method

.method private d(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/fdf;>;Ljava/util/List<Ljava/util/ArrayList<Lo/fdf;>;>;)Ljava/util/List<Ljava/util/ArrayList<Lo/fdf;>;>;"
        }
    .end annotation

    .line 986
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 988
    new-instance v2, Ljava/util/TreeMap;

    new-instance v0, Lo/fdj$8;

    invoke-direct {v0, p0}, Lo/fdj$8;-><init>(Lo/fdj;)V

    invoke-direct {v2, v0}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 995
    invoke-direct {p0, p1, v2}, Lo/fdj;->b(Ljava/util/ArrayList;Ljava/util/Map;)V

    .line 997
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 998
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 999
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1000
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 1001
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1002
    goto :goto_0

    .line 1003
    :cond_0
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-instance v1, Lo/fdj$2;

    invoke-direct {v1, p0}, Lo/fdj$2;-><init>(Lo/fdj;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1013
    :cond_1
    return-object p2
.end method

.method private declared-synchronized d(Ljava/lang/Object;Lo/egg;)V
    .locals 10

    monitor-enter p0

    .line 154
    :try_start_0
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWeightData enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    move-object v4, p1

    check-cast v4, Ljava/util/List;

    .line 156
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 157
    invoke-static {v4}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWeightData enter datas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    if-eqz p2, :cond_0

    .line 160
    const/4 v0, 0x0

    invoke-interface {p2, v0, v5}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 162
    :cond_0
    monitor-exit p0

    return-void

    .line 165
    :cond_1
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleWeightData datas.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 168
    const/4 v8, 0x0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v9

    :goto_0
    if-ge v8, v9, :cond_2

    .line 188
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-static {v0}, Lo/fdg;->e(Lcom/huawei/hihealth/HiHealthData;)Lo/fdf;

    move-result-object v7

    .line 194
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 208
    :cond_2
    invoke-virtual {p0, v6, v5}, Lo/fdj;->a(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 210
    if-eqz p2, :cond_3

    .line 211
    const/4 v0, 0x0

    invoke-interface {p2, v0, v5}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 213
    :cond_3
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWeightData end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 214
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic d(Lo/fdj;Ljava/util/List;Lo/egg;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lo/fdj;->e(Ljava/util/List;Lo/egg;)V

    return-void
.end method

.method public static e()Lo/fdj;
    .locals 1

    .line 93
    invoke-static {}, Lo/fdj$e;->b()Lo/fdj;

    move-result-object v0

    return-object v0
.end method

.method private e(Ljava/util/ArrayList;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/fdf;>;Ljava/util/List<Ljava/util/ArrayList<Lo/fdf;>;>;)V"
        }
    .end annotation

    .line 1022
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1024
    const/4 v3, 0x0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_1

    .line 1025
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v0, v0, Lo/fdf;->a:J

    invoke-virtual {p0, v0, v1}, Lo/fdj;->d(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1026
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v0, v0, Lo/fdf;->a:J

    invoke-virtual {p0, v0, v1}, Lo/fdj;->d(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v5

    .line 1027
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1028
    goto :goto_1

    .line 1029
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1030
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1031
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v0, v0, Lo/fdf;->a:J

    invoke-virtual {p0, v0, v1}, Lo/fdj;->d(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1032
    invoke-interface {p2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1024
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 1035
    :cond_1
    return-void
.end method

.method private e(Ljava/util/List;Lo/egg;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lo/egg;)V"
        }
    .end annotation

    .line 293
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleBloodsugarData enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 295
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 296
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 297
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 298
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 299
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleBloodsugarData data.size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 301
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-gtz v0, :cond_0

    .line 302
    invoke-static {v10}, Lo/fdg;->c(Lcom/huawei/hihealth/HiHealthData;)Lo/fdf;

    move-result-object v11

    .line 303
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 305
    :cond_0
    goto :goto_0

    .line 306
    :cond_1
    invoke-direct {p0, v8, v6}, Lo/fdj;->d(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    goto :goto_1

    .line 308
    :cond_2
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "datas null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    :goto_1
    if-eqz p2, :cond_3

    .line 311
    const/4 v0, 0x0

    invoke-interface {p2, v0, v7}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 313
    :cond_3
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleBloodsugarData time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWeightData end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    return-void
.end method

.method static synthetic e(Lo/fdj;Ljava/util/List;Lo/egg;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lo/fdj;->c(Ljava/util/List;Lo/egg;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;JJIILo/egg;)V
    .locals 10

    .line 421
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move/from16 v6, p6

    move/from16 v7, p7

    new-instance v8, Lo/fdj$4;

    move-object/from16 v9, p8

    invoke-direct {v8, p0, v9}, Lo/fdj$4;-><init>(Lo/fdj;Lo/egg;)V

    invoke-virtual/range {v0 .. v8}, Lo/dgu;->e(Landroid/content/Context;JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 428
    return-void
.end method

.method public a(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 377
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteBloodpressureData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/dgu;->d(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 379
    return-void
.end method

.method public a(Landroid/content/Context;JJLo/egg;)V
    .locals 10

    .line 611
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 612
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    new-instance v6, Lo/fdj$c;

    move-object/from16 v7, p6

    invoke-direct {v6, p0, v8, v9, v7}, Lo/fdj$c;-><init>(Lo/fdj;JLo/egg;)V

    invoke-virtual/range {v0 .. v6}, Lo/dgu;->b(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 613
    return-void
.end method

.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 430
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dgu;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 431
    return-void
.end method

.method public a(Ljava/util/ArrayList;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/fdf;>;Ljava/util/List<Ljava/util/ArrayList<Lo/fdf;>;>;)V"
        }
    .end annotation

    .line 961
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 964
    invoke-direct {p0, p1, p2}, Lo/fdj;->e(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 967
    const/4 v4, 0x0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v5

    :goto_0
    if-ge v4, v5, :cond_0

    .line 968
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lo/fdj;->b(Ljava/util/ArrayList;)V

    .line 967
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 973
    :cond_0
    const/4 v5, 0x0

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v5, v0, :cond_3

    .line 974
    add-int/lit8 v6, v5, 0x1

    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 975
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v0, v0, Lo/fdf;->a:J

    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/fdf;

    iget-wide v2, v2, Lo/fdf;->a:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 976
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    .line 977
    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v5, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 978
    invoke-interface {p2, v6, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 974
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 973
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 983
    :cond_3
    return-void
.end method

.method public b(J)Ljava/lang/String;
    .locals 5

    .line 1161
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 1162
    invoke-virtual {v2, p1, p2}, Ljava/util/Date;->setTime(J)V

    .line 1163
    new-instance v3, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyy/MM/dd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1164
    invoke-virtual {v3, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 1165
    return-object v4
.end method

.method public b(Landroid/content/Context;JJIILo/egg;)V
    .locals 10

    .line 400
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move/from16 v6, p6

    move/from16 v7, p7

    new-instance v8, Lo/fdj$3;

    move-object/from16 v9, p8

    invoke-direct {v8, p0, v9}, Lo/fdj$3;-><init>(Lo/fdj;Lo/egg;)V

    invoke-virtual/range {v0 .. v8}, Lo/dgu;->e(Landroid/content/Context;JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 407
    return-void
.end method

.method public b(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 367
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteWeightData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/dgu;->c(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 369
    return-void
.end method

.method public b(Landroid/content/Context;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hihealth/HiTimeInterval;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 382
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteBloodpressureData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lo/dgu;->c(Landroid/content/Context;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 384
    return-void
.end method

.method public c()V
    .locals 1

    .line 100
    iget-object v0, p0, Lo/fdj;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lo/fdj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    .line 104
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fdj;->b:Ljava/util/ArrayList;

    .line 107
    :goto_0
    return-void
.end method

.method public c(Landroid/content/Context;IJJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 387
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteBloodSuagrData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    move-wide v5, p5

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->a(Landroid/content/Context;IJJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 389
    return-void
.end method

.method public d(J)Ljava/lang/String;
    .locals 5

    .line 1153
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 1154
    invoke-virtual {v2, p1, p2}, Ljava/util/Date;->setTime(J)V

    .line 1155
    new-instance v3, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyyMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1156
    invoke-virtual {v3, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 1157
    return-object v4
.end method

.method public d(Landroid/content/Context;JJDDDLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 934
    const/4 v0, 0x2

    new-array v2, v0, [J

    .line 935
    const/4 v0, 0x0

    aput-wide p2, v2, v0

    .line 936
    const/4 v0, 0x1

    aput-wide p4, v2, v0

    .line 937
    const/4 v0, 0x3

    new-array v3, v0, [D

    .line 938
    const/4 v0, 0x0

    aput-wide p6, v3, v0

    .line 939
    const/4 v0, 0x1

    aput-wide p8, v3, v0

    .line 940
    const/4 v0, 0x2

    aput-wide p10, v3, v0

    .line 941
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object/from16 v1, p12

    invoke-virtual {v0, p1, v2, v3, v1}, Lo/dgu;->c(Landroid/content/Context;[J[DLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 942
    return-void
.end method

.method public d(Landroid/content/Context;JJIDLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 946
    const/4 v0, 0x2

    new-array v3, v0, [J

    .line 947
    const/4 v0, 0x0

    aput-wide p2, v3, v0

    .line 948
    const/4 v0, 0x1

    aput-wide p4, v3, v0

    .line 949
    const/4 v0, 0x3

    new-array v4, v0, [D

    .line 950
    int-to-float v0, p6

    float-to-double v0, v0

    const/4 v2, 0x0

    aput-wide v0, v4, v2

    .line 951
    const/4 v0, 0x1

    aput-wide p7, v4, v0

    .line 952
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0, p1, v3, v4, p9}, Lo/dgu;->b(Landroid/content/Context;[J[DLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 953
    return-void
.end method

.method public d(Landroid/content/Context;JJIILo/egg;)V
    .locals 9

    .line 466
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move v6, p6

    new-instance v7, Lo/fdj$5;

    move-object/from16 v8, p8

    invoke-direct {v7, p0, v8}, Lo/fdj$5;-><init>(Lo/fdj;Lo/egg;)V

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->e(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 472
    return-void
.end method

.method public d(Landroid/content/Context;JJLo/egg;)V
    .locals 7

    .line 584
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    new-instance v6, Lo/fdj$7;

    invoke-direct {v6, p0, p6}, Lo/fdj$7;-><init>(Lo/fdj;Lo/egg;)V

    invoke-virtual/range {v0 .. v6}, Lo/dgu;->e(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 590
    return-void
.end method

.method public e(Landroid/content/Context;JJILo/egg;)V
    .locals 11

    .line 564
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 565
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move/from16 v6, p6

    new-instance v7, Lo/fdj$1;

    move-object/from16 v8, p7

    invoke-direct {v7, p0, v9, v10, v8}, Lo/fdj$1;-><init>(Lo/fdj;JLo/egg;)V

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->c(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 573
    return-void
.end method

.method public e(Landroid/content/Context;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hihealth/HiTimeInterval;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 372
    sget-object v0, Lo/fdj;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteWeightData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lo/dgu;->d(Landroid/content/Context;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 374
    return-void
.end method
