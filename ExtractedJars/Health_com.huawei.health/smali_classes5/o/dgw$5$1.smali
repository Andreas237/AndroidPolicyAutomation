.class Lo/dgw$5$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgw$5;->d(Ljava/lang/Object;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dgw$5;


# direct methods
.method constructor <init>(Lo/dgw$5;)V
    .locals 0

    .line 275
    iput-object p1, p0, Lo/dgw$5$1;->b:Lo/dgw$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 9

    .line 278
    if-nez p1, :cond_1

    .line 279
    iget-object v0, p0, Lo/dgw$5$1;->b:Lo/dgw$5;

    iget-object v0, v0, Lo/dgw$5;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 280
    iget-object v0, p0, Lo/dgw$5$1;->b:Lo/dgw$5;

    iget-object v0, v0, Lo/dgw$5;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 281
    const-string v0, "Track_HWHealthDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastVo2max getVo2maxDetail  return null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    :cond_0
    return-void

    .line 285
    :cond_1
    move-object v4, p1

    check-cast v4, Landroid/util/SparseArray;

    .line 286
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 287
    const-string v0, "Track_HWHealthDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastVo2max getVo2maxDetail size = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    iget-object v0, p0, Lo/dgw$5$1;->b:Lo/dgw$5;

    iget-object v0, v0, Lo/dgw$5;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 289
    iget-object v0, p0, Lo/dgw$5$1;->b:Lo/dgw$5;

    iget-object v0, v0, Lo/dgw$5;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 291
    :cond_2
    return-void

    .line 296
    :cond_3
    const v0, 0xa416

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 297
    const-string v0, "Track_HWHealthDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastVo2max getVo2maxDetail  list"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    move-object v5, v6

    check-cast v5, Ljava/util/List;

    .line 300
    new-instance v0, Lo/dgw$5$1$2;

    invoke-direct {v0, p0}, Lo/dgw$5$1$2;-><init>(Lo/dgw$5$1;)V

    invoke-static {v5, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 309
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 310
    new-instance v8, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;

    invoke-direct {v8}, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;-><init>()V

    .line 311
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->setTimeStamp(J)V

    .line 312
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getIntValue()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->setVo2maxValue(I)V

    .line 313
    const-string v0, "Track_HWHealthDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastVo2max "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    iget-object v0, p0, Lo/dgw$5$1;->b:Lo/dgw$5;

    iget-object v0, v0, Lo/dgw$5;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v8}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 315
    return-void
.end method
