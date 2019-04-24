.class Lo/dlt$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlt;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dlt;


# direct methods
.method constructor <init>(Lo/dlt;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lo/dlt$2;->d:Lo/dlt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 18

    .line 205
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dlt$2;->d:Lo/dlt;

    const-string v1, "reduce_fat_user"

    const-string v2, "ai-info-001"

    invoke-static {v0, v1, v2}, Lo/dlt;->b(Lo/dlt;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 207
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weightRecommend deleteAfterCheckStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dlt$2;->d:Lo/dlt;

    const v1, 0x9c40

    invoke-static {v0, v1}, Lo/dlt;->e(Lo/dlt;I)V

    .line 209
    return-void

    .line 213
    :cond_0
    const-string v0, "ai-info-001"

    const/16 v1, 0x7533

    invoke-static {v1, v0}, Lo/dmn;->e(ILjava/lang/String;)I

    move-result v9

    .line 215
    const-string v0, "ai-info-001"

    const-string v1, "recently_num_days_have_data"

    const/16 v2, 0x7533

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 216
    const/4 v11, 0x0

    .line 217
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 219
    :try_start_0
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v11, v0

    .line 222
    goto :goto_0

    .line 220
    :catch_0
    move-exception v12

    .line 221
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

    .line 224
    :cond_1
    :goto_0
    const-string v0, "ai-info-001"

    const/16 v1, 0x7533

    invoke-static {v1, v0}, Lo/dmn;->b(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 226
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weightRecommend priority = "

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

    .line 230
    invoke-static {}, Lo/dlj;->e()Z

    move-result v13

    .line 232
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dlt$2;->d:Lo/dlt;

    iget-object v0, v0, Lo/dlt;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dll;->d(Landroid/content/Context;)Lo/dll;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/dll;->a(I)Z

    move-result v14

    .line 234
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weightRecommend isSevereFatLabel = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", isFocusWeight = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    if-nez v13, :cond_2

    if-eqz v14, :cond_3

    .line 237
    :cond_2
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weight insert"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dlt$2;->d:Lo/dlt;

    const-string v1, "IC4"

    const v2, 0x9c40

    invoke-static {v0, v1, v2, v12, v9}, Lo/dlt;->d(Lo/dlt;Ljava/lang/String;ILjava/lang/String;I)V

    .line 239
    return-void

    .line 243
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    int-to-long v2, v11

    const-wide/32 v4, 0x5265c00

    mul-long/2addr v2, v4

    sub-long v15, v0, v2

    .line 244
    const/16 v17, 0x1

    .line 245
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dlt$2;->d:Lo/dlt;

    iget-object v1, v1, Lo/dlt;->b:Landroid/content/Context;

    move-wide v2, v15

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move/from16 v6, v17

    new-instance v7, Lo/dlt$2$3;

    move-object/from16 v8, p0

    invoke-direct {v7, v8, v12, v9}, Lo/dlt$2$3;-><init>(Lo/dlt$2;Ljava/lang/String;I)V

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->e(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 262
    return-void
.end method
