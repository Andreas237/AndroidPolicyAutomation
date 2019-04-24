.class Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$5;->e:Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 149
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 150
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 152
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$5;->e:Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$5;->e:Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;

    invoke-static {v1}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->b(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->e(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;Landroid/widget/TextView;)V

    .line 153
    goto :goto_0

    .line 155
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$5;->e:Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->onDestroy()V

    .line 156
    .line 160
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x1 -> :sswitch_0
        0x0 -> :sswitch_1
    .end sparse-switch
.end method
