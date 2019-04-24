.class Lo/dgw$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgw;->e(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic b:Lo/dgw;


# direct methods
.method constructor <init>(Lo/dgw;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 352
    iput-object p1, p0, Lo/dgw$3;->b:Lo/dgw;

    iput-object p2, p0, Lo/dgw$3;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 9

    .line 355
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 357
    iget-object v0, p0, Lo/dgw$3;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 358
    iget-object v0, p0, Lo/dgw$3;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 360
    :cond_0
    return-void

    .line 363
    :cond_1
    move-object v3, p1

    check-cast v3, Landroid/util/SparseArray;

    .line 364
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 366
    iget-object v0, p0, Lo/dgw$3;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 367
    iget-object v0, p0, Lo/dgw$3;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 369
    :cond_2
    return-void

    .line 374
    :cond_3
    new-instance v5, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;

    invoke-direct {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;-><init>()V

    .line 377
    const v0, 0xb3c3

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 378
    move-object v4, v7

    check-cast v4, Ljava/util/List;

    .line 379
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 380
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealth/HiHealthData;

    .line 381
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->setTimeStamp(J)V

    .line 382
    const/16 v0, 0x258

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->setHeartRateType(I)V

    .line 383
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getIntValue()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->setHeartRateValue(I)V

    .line 387
    :cond_4
    move-object v6, v5

    .line 389
    iget-object v0, p0, Lo/dgw$3;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 391
    iget-object v0, p0, Lo/dgw$3;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v6}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 393
    :cond_5
    return-void
.end method
