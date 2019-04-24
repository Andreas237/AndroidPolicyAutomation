.class Lo/dly$7$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dly$7;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:D

.field final synthetic e:Lo/dly$7;


# direct methods
.method constructor <init>(Lo/dly$7;D)V
    .locals 0

    .line 342
    iput-object p1, p0, Lo/dly$7$5;->e:Lo/dly$7;

    iput-wide p2, p0, Lo/dly$7$5;->a:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 10

    .line 345
    move-object v3, p2

    check-cast v3, Ljava/util/List;

    .line 346
    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-gt v0, v1, :cond_1

    .line 347
    :cond_0
    iget-object v0, p0, Lo/dly$7$5;->e:Lo/dly$7;

    iget-object v0, v0, Lo/dly$7;->a:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 348
    return-void

    .line 350
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "weight"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    .line 351
    const/4 v0, 0x1

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "weight"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 352
    const/4 v0, 0x2

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "weight"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    .line 354
    iget-wide v0, p0, Lo/dly$7$5;->a:D

    cmpl-double v0, v4, v0

    if-ltz v0, :cond_2

    cmpl-double v0, v4, v6

    if-ltz v0, :cond_2

    cmpl-double v0, v6, v8

    if-ltz v0, :cond_2

    .line 355
    iget-object v0, p0, Lo/dly$7$5;->e:Lo/dly$7;

    iget-object v0, v0, Lo/dly$7;->a:Lo/egg;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 356
    return-void

    .line 358
    :cond_2
    iget-object v0, p0, Lo/dly$7$5;->e:Lo/dly$7;

    iget-object v0, v0, Lo/dly$7;->a:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 360
    return-void
.end method
