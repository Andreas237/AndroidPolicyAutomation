.class Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MyHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lo/aju;-><init>(Ljava/lang/Object;)V

    .line 93
    return-void
.end method


# virtual methods
.method public handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;Landroid/os/Message;)V
    .locals 4

    .line 97
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    return-void

    .line 100
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 101
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyHandler mFragment is not add"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 102
    return-void

    .line 104
    :cond_1
    const-string v0, "WifiWeightMeasureGuideFragment"

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

    .line 105
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 107
    :pswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lo/agg;

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;Lo/agg;)V

    .line 108
    goto :goto_2

    .line 110
    :pswitch_1
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;Landroid/content/Context;)V

    .line 111
    goto :goto_2

    .line 113
    :pswitch_2
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)V

    .line 114
    goto :goto_2

    .line 116
    :pswitch_3
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;Ljava/lang/String;)V

    .line 117
    goto :goto_2

    .line 119
    :goto_1
    :pswitch_4
    const-string v0, "MyHandler what is other"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 122
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public bridge synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 90
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$MyHandler;->handleMessage(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;Landroid/os/Message;)V

    return-void
.end method
