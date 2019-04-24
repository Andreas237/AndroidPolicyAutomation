.class Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;->handleMessageWhenReferenceNotNull(Lcom/huawei/health/device/ui/DeviceMainActivity;Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;

.field final synthetic val$obj:Lcom/huawei/health/device/ui/DeviceMainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;Lcom/huawei/health/device/ui/DeviceMainActivity;)V
    .locals 0

    .line 483
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler$1;->val$obj:Lcom/huawei/health/device/ui/DeviceMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 486
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler$1;->val$obj:Lcom/huawei/health/device/ui/DeviceMainActivity;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 487
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 488
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    .line 489
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "goback"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "honour_device"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 491
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler$1;->val$obj:Lcom/huawei/health/device/ui/DeviceMainActivity;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->onBackPressed()V

    .line 492
    return-void

    .line 495
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$MyHandler$1;->val$obj:Lcom/huawei/health/device/ui/DeviceMainActivity;

    const-class v1, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->c(Ljava/lang/Class;)V

    .line 497
    :cond_1
    return-void
.end method
