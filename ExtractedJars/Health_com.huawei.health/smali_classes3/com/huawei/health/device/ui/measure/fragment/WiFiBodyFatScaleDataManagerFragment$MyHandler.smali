.class Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$MyHandler;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MyHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)V
    .locals 0

    .line 261
    invoke-direct {p0, p1}, Lo/aju;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;Landroid/os/Message;)V
    .locals 4

    .line 265
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 266
    return-void

    .line 268
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 269
    const-string v0, "WiFiBodyFatScaleDataManagerFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyHandler mFragment is not add"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 270
    return-void

    .line 272
    :cond_1
    const-string v0, "WiFiBodyFatScaleDataManagerFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyHandler what:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p2, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 273
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 275
    :sswitch_0
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->access$1200(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)V

    .line 276
    goto :goto_1

    .line 278
    :goto_0
    const-string v0, "MyHandler what is other"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 281
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public bridge synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 260
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$MyHandler;->handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;Landroid/os/Message;)V

    return-void
.end method
