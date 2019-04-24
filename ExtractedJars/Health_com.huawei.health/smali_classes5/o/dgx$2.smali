.class Lo/dgx$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgx;->c(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Lo/dgx;


# direct methods
.method constructor <init>(Lo/dgx;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 240
    iput-object p1, p0, Lo/dgx$2;->d:Lo/dgx;

    iput-object p2, p0, Lo/dgx$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 14

    .line 243
    const-string v0, "PressureMeasureModelInterator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressStatisticsDatas errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 245
    iget-object v0, p0, Lo/dgx$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 246
    iget-object v0, p0, Lo/dgx$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 248
    :cond_0
    return-void

    .line 250
    :cond_1
    move-object v4, p1

    check-cast v4, Landroid/util/SparseArray;

    .line 251
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 252
    iget-object v0, p0, Lo/dgx$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 253
    iget-object v0, p0, Lo/dgx$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 255
    :cond_2
    return-void

    .line 259
    :cond_3
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 260
    const v0, 0xad12

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 261
    move-object v5, v7

    check-cast v5, Ljava/util/List;

    .line 262
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 263
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getIntValue()I

    move-result v10

    .line 264
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v11

    .line 265
    new-instance v13, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {v13}, Lcom/huawei/hihealth/data/model/HiStressMetaData;-><init>()V

    .line 266
    invoke-virtual {v13, v10}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_score(I)V

    .line 267
    invoke-virtual {v13, v11, v12}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_start_time(J)V

    .line 268
    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 269
    goto :goto_0

    .line 270
    :cond_4
    const-string v0, "PressureMeasureModelInterator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "StatisticsDatas stressMetaDatasList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    iget-object v0, p0, Lo/dgx$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 272
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 273
    iget-object v0, p0, Lo/dgx$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v6}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_1

    .line 276
    :cond_5
    iget-object v0, p0, Lo/dgx$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 279
    :cond_6
    :goto_1
    return-void
.end method
