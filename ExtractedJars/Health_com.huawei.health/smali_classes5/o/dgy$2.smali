.class Lo/dgy$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgy;->a(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Lo/dgu$e;

.field final synthetic c:Lo/dgy;

.field final synthetic e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/dgy;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 283
    iput-object p1, p0, Lo/dgy$2;->c:Lo/dgy;

    iput-object p2, p0, Lo/dgy$2;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 284
    new-instance v0, Lo/dgu$e;

    invoke-direct {v0}, Lo/dgu$e;-><init>()V

    iput-object v0, p0, Lo/dgy$2;->a:Lo/dgu$e;

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 10

    .line 288
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 289
    return-void

    .line 292
    :cond_0
    move-object v4, p1

    check-cast v4, Landroid/util/SparseArray;

    .line 293
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 294
    return-void

    .line 296
    :cond_1
    const/16 v0, 0x7533

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 297
    move-object v6, v5

    check-cast v6, Ljava/util/List;

    .line 298
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 299
    :cond_2
    return-void

    .line 301
    :cond_3
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 302
    if-nez v7, :cond_4

    .line 303
    return-void

    .line 306
    :cond_4
    new-instance v8, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-direct {v8}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;-><init>()V

    .line 308
    invoke-static {v7, v8}, Lo/dhh;->e(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)Ljava/lang/String;

    move-result-object v9

    .line 309
    const-string v0, "trackdata_deviceType"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveDeviceType(I)V

    .line 311
    if-nez v9, :cond_5

    .line 312
    return-void

    .line 314
    :cond_5
    iget-object v0, p0, Lo/dgy$2;->a:Lo/dgu$e;

    iput-object v9, v0, Lo/dgu$e;->d:Ljava/lang/String;

    .line 315
    iget-object v0, p0, Lo/dgy$2;->a:Lo/dgu$e;

    iput-object v8, v0, Lo/dgu$e;->c:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 316
    iget-object v0, p0, Lo/dgy$2;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-nez v0, :cond_6

    .line 317
    invoke-static {}, Lo/dgy;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrackDetailData mDetailCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    return-void

    .line 320
    :cond_6
    iget-object v0, p0, Lo/dgy$2;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-object v1, p0, Lo/dgy$2;->a:Lo/dgu$e;

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 321
    return-void
.end method
