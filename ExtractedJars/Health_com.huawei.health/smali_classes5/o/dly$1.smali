.class Lo/dly$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dly;->c([JLo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dly;

.field final synthetic c:[D

.field final synthetic d:Lo/egg;


# direct methods
.method constructor <init>(Lo/dly;Lo/egg;[D)V
    .locals 0

    .line 261
    iput-object p1, p0, Lo/dly$1;->a:Lo/dly;

    iput-object p2, p0, Lo/dly$1;->d:Lo/egg;

    iput-object p3, p0, Lo/dly$1;->c:[D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 9

    .line 264
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 265
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPeriodWeightData data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 267
    :cond_0
    iget-object v0, p0, Lo/dly$1;->d:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_0

    .line 269
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "weight"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v5

    .line 270
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "weight"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 271
    iget-object v0, p0, Lo/dly$1;->c:[D

    const/4 v1, 0x0

    aput-wide v5, v0, v1

    .line 272
    iget-object v0, p0, Lo/dly$1;->c:[D

    const/4 v1, 0x1

    aput-wide v7, v0, v1

    .line 273
    iget-object v0, p0, Lo/dly$1;->d:Lo/egg;

    iget-object v1, p0, Lo/dly$1;->c:[D

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 275
    :goto_0
    return-void
.end method
