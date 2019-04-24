.class Lo/dly$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dly;->d(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egg;

.field final synthetic c:Lo/dly;

.field final synthetic d:J


# direct methods
.method constructor <init>(Lo/dly;Lo/egg;J)V
    .locals 0

    .line 331
    iput-object p1, p0, Lo/dly$7;->c:Lo/dly;

    iput-object p2, p0, Lo/dly$7;->a:Lo/egg;

    iput-wide p3, p0, Lo/dly$7;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 11

    .line 334
    move-object v8, p2

    check-cast v8, Ljava/util/List;

    .line 335
    if-eqz v8, :cond_0

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 336
    :cond_0
    iget-object v0, p0, Lo/dly$7;->a:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 337
    return-void

    .line 339
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "weight"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v9

    .line 340
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeWeightUpSlowly data30Ago = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lo/dly$7;->c:Lo/dly;

    iget-object v1, v1, Lo/dly;->e:Landroid/content/Context;

    iget-wide v2, p0, Lo/dly$7;->d:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    new-instance v7, Lo/dly$7$5;

    invoke-direct {v7, p0, v9, v10}, Lo/dly$7$5;-><init>(Lo/dly$7;D)V

    const/4 v6, 0x3

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->e(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 362
    return-void
.end method
