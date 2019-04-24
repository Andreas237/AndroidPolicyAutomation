.class Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->getMeasureWeightData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)V
    .locals 0

    .line 405
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$5;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 408
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 409
    :cond_0
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "datas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 410
    return-void

    .line 412
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "weight"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    .line 413
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "weight_bodyfat"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 414
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    .line 415
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v9

    .line 417
    new-instance v10, Lo/agg;

    invoke-direct {v10}, Lo/agg;-><init>()V

    .line 418
    double-to-float v0, v4

    invoke-virtual {v10, v0}, Lo/agg;->e(F)V

    .line 419
    double-to-float v0, v6

    invoke-virtual {v10, v0}, Lo/agg;->b(F)V

    .line 420
    invoke-virtual {v10, v8}, Lo/agg;->a(Ljava/lang/String;)V

    .line 421
    const/4 v0, 0x0

    if-eq v0, v9, :cond_2

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "null"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "0"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 422
    :cond_2
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v9

    .line 425
    :cond_3
    const-string v0, "-1"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v11, 0x1

    goto :goto_0

    :cond_4
    const/4 v11, 0x0

    .line 426
    :goto_0
    if-eqz v11, :cond_5

    .line 427
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lo/agg;->c(Z)V

    .line 428
    const-string v0, ""

    invoke-virtual {v10, v0}, Lo/agg;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 430
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lo/agg;->c(Z)V

    .line 431
    invoke-virtual {v10, v9}, Lo/agg;->b(Ljava/lang/String;)V

    .line 434
    :goto_1
    new-instance v12, Landroid/os/Message;

    invoke-direct {v12}, Landroid/os/Message;-><init>()V

    .line 435
    const/16 v0, 0x64

    iput v0, v12, Landroid/os/Message;->what:I

    .line 436
    iput-object v10, v12, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 437
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$5;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;

    move-result-object v0

    invoke-virtual {v0, v12}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 439
    return-void
.end method

.method public onResultIntent(ILjava/util/List;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 442
    return-void
.end method
