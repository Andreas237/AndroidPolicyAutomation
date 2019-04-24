.class Lo/dlt$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlt;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dlt;


# direct methods
.method constructor <init>(Lo/dlt;)V
    .locals 0

    .line 313
    iput-object p1, p0, Lo/dlt$5;->a:Lo/dlt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 18

    .line 316
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dlt$5;->a:Lo/dlt;

    const-string v1, "blood_pressure_user"

    const-string v2, "ai-info-003"

    invoke-static {v0, v1, v2}, Lo/dlt;->b(Lo/dlt;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 318
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bloodPressureRecommend deleteAfterCheckStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dlt$5;->a:Lo/dlt;

    const v1, 0x9c42

    invoke-static {v0, v1}, Lo/dlt;->e(Lo/dlt;I)V

    .line 320
    return-void

    .line 324
    :cond_0
    const-string v0, "ai-info-003"

    const/16 v1, 0x7533

    invoke-static {v1, v0}, Lo/dmn;->e(ILjava/lang/String;)I

    move-result v9

    .line 326
    const-string v0, "ai-info-003"

    const-string v1, "recently_num_days_have_data"

    const/16 v2, 0x7533

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 327
    const/4 v11, 0x0

    .line 328
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 330
    :try_start_0
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v11, v0

    .line 333
    goto :goto_0

    .line 331
    :catch_0
    move-exception v12

    .line 332
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    :cond_1
    :goto_0
    const-string v0, "ai-info-003"

    const/16 v1, 0x7533

    invoke-static {v1, v0}, Lo/dmn;->b(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 337
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bloodPressureRecommend priority = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", recentlyHaveDataDate = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v10, v1, v2

    const-string v2, ", recommendedTime = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dlt$5;->a:Lo/dlt;

    iget-object v0, v0, Lo/dlt;->b:Landroid/content/Context;

    const-string v1, "HDK_BLOOD_PRESSURE"

    invoke-static {v0, v1}, Lo/dmn;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v13

    .line 342
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dlt$5;->a:Lo/dlt;

    iget-object v0, v0, Lo/dlt;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dll;->d(Landroid/content/Context;)Lo/dll;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/dll;->a(I)Z

    move-result v14

    .line 344
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bloodPressureRecommend BindBloodp = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", isFocusBloodp = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    if-gtz v13, :cond_2

    if-eqz v14, :cond_3

    .line 347
    :cond_2
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bloop insert"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dlt$5;->a:Lo/dlt;

    const-string v1, "IC5"

    const v2, 0x9c42

    invoke-static {v0, v1, v2, v12, v9}, Lo/dlt;->d(Lo/dlt;Ljava/lang/String;ILjava/lang/String;I)V

    .line 349
    return-void

    .line 353
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    int-to-long v2, v11

    const-wide/32 v4, 0x5265c00

    mul-long/2addr v2, v4

    sub-long v15, v0, v2

    .line 354
    const/16 v17, 0x1

    .line 355
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dlt$5;->a:Lo/dlt;

    iget-object v1, v1, Lo/dlt;->b:Landroid/content/Context;

    move-wide v2, v15

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move/from16 v6, v17

    new-instance v8, Lo/dlt$5$3;

    move-object/from16 v7, p0

    invoke-direct {v8, v7, v12, v9}, Lo/dlt$5$3;-><init>(Lo/dlt$5;Ljava/lang/String;I)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v8}, Lo/dgu;->e(Landroid/content/Context;JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 372
    return-void
.end method
