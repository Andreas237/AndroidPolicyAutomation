.class Lo/exy$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exy;->a(Landroid/content/Context;JJILo/ekr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ekr;

.field final synthetic c:Lo/exy;


# direct methods
.method constructor <init>(Lo/exy;Lo/ekr;)V
    .locals 0

    .line 259
    iput-object p1, p0, Lo/exy$3;->c:Lo/exy;

    iput-object p2, p0, Lo/exy$3;->b:Lo/ekr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/util/SparseArray;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;II)V"
        }
    .end annotation

    .line 262
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 263
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exy$3;->b:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 264
    return-void

    .line 266
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 267
    const-string v0, "StepModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exy$3;->b:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 269
    return-void

    .line 272
    :cond_1
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 273
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 275
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 278
    const-wide/32 v8, 0x4d3f6400

    .line 281
    const/4 v10, 0x0

    :goto_0
    :try_start_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_3

    .line 285
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 286
    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/HiHealthData;

    .line 287
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v13

    .line 288
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v15

    .line 289
    invoke-virtual {v15, v13, v14}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 290
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v15, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 291
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v15, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 292
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v15, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 293
    const-string v0, "content"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v16

    .line 294
    const-string v0, "sum"

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v17

    .line 295
    invoke-static/range {v16 .. v16}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3f1a36e2eb1c432dL    # 1.0E-4

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    .line 296
    invoke-virtual {v15}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    add-long/2addr v0, v8

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/eyg;

    move/from16 v2, v16

    move/from16 v3, v17

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lo/eyg;-><init>(FFI)V

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 299
    :cond_2
    invoke-virtual {v15}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    add-long/2addr v0, v8

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/eyg;

    div-float v2, v17, v16

    .line 300
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    move/from16 v3, v16

    move/from16 v4, v17

    invoke-direct {v1, v3, v4, v2}, Lo/eyg;-><init>(FFI)V

    .line 299
    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 281
    :goto_1
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 305
    :cond_3
    goto :goto_2

    .line 303
    :catch_0
    move-exception v10

    .line 304
    const-string v0, "StepModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exy$3;->b:Lo/ekr;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v7}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 308
    return-void
.end method
