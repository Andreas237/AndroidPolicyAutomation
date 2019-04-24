.class Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ajm;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "OtaStatusCallBack"
.end annotation


# instance fields
.field private mActivity:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)V
    .locals 1

    .line 372
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 373
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;->mActivity:Ljava/lang/ref/WeakReference;

    .line 374
    return-void
.end method

.method private isDestory()Z
    .locals 2

    .line 389
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;->mActivity:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    .line 390
    const/4 v0, 0x0

    return v0

    .line 392
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;->mActivity:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;

    .line 393
    if-nez v1, :cond_1

    .line 394
    const/4 v0, 0x0

    return v0

    .line 396
    :cond_1
    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 397
    const/4 v0, 0x1

    return v0

    .line 400
    :cond_2
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public onFailure(I)V
    .locals 0

    .line 405
    return-void
.end method

.method public onStatus(I)V
    .locals 3

    .line 408
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 409
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$1200(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 415
    :cond_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 416
    const/4 v0, 0x3

    iput v0, v2, Landroid/os/Message;->what:I

    .line 417
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;->sendMessage(Landroid/os/Message;)Z

    .line 418
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2

    .line 377
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;->isDestory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 378
    if-eqz p1, :cond_0

    const-string v0, "3"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 380
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 381
    const/4 v0, 0x4

    iput v0, v1, Landroid/os/Message;->what:I

    .line 382
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;->sendMessage(Landroid/os/Message;)Z

    .line 383
    return-void

    .line 386
    :cond_0
    return-void
.end method
