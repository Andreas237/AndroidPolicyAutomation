.class Lo/dgw$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgw;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dgw;

.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:J


# direct methods
.method constructor <init>(Lo/dgw;Lcom/huawei/hwbasemgr/IBaseResponseCallback;J)V
    .locals 0

    .line 231
    iput-object p1, p0, Lo/dgw$5;->b:Lo/dgw;

    iput-object p2, p0, Lo/dgw$5;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput-wide p3, p0, Lo/dgw$5;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 11

    .line 235
    invoke-static {}, Lo/dgw;->d()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 236
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 237
    const-string v0, "Track_HWHealthDataManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastVo2max null1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    iget-object v0, p0, Lo/dgw$5;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 239
    monitor-exit v4

    return-void

    .line 242
    :cond_0
    move-object v5, p1

    :try_start_1
    check-cast v5, Landroid/util/SparseArray;

    .line 243
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 244
    const-string v0, "Track_HWHealthDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastVo2max null2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    iget-object v0, p0, Lo/dgw$5;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 246
    monitor-exit v4

    return-void

    .line 251
    :cond_1
    const v0, 0xa417

    :try_start_2
    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 252
    move-object v6, v7

    check-cast v6, Ljava/util/List;

    .line 253
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 254
    :cond_2
    const-string v0, "Track_HWHealthDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastVo2max null3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    iget-object v0, p0, Lo/dgw$5;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 256
    monitor-exit v4

    return-void

    .line 258
    :cond_3
    const-string v0, "Track_HWHealthDataManager"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastVo2max "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_4

    .line 260
    new-instance v0, Lo/dgw$5$5;

    invoke-direct {v0, p0}, Lo/dgw$5$5;-><init>(Lo/dgw$5;)V

    invoke-static {v6, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 270
    :cond_4
    new-instance v8, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v8}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 271
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    iget-wide v2, p0, Lo/dgw$5;->d:J

    invoke-virtual {v8, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 272
    const/4 v9, 0x1

    new-array v9, v9, [I

    fill-array-data v9, :array_0

    .line 273
    invoke-virtual {v8, v9}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 274
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setReadType(I)V

    .line 275
    iget-object v0, p0, Lo/dgw$5;->b:Lo/dgw;

    invoke-static {v0}, Lo/dgw;->c(Lo/dgw;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dgw$5$1;

    invoke-direct {v1, p0}, Lo/dgw$5$1;-><init>(Lo/dgw$5;)V

    invoke-interface {v0, v8, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 323
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v10

    monitor-exit v4

    throw v10

    .line 324
    :goto_0
    return-void

    :array_0
    .array-data 4
        0xa416
    .end array-data
.end method
