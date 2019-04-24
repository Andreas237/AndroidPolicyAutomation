.class Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$NetWorkCallBack;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ajh;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "NetWorkCallBack"
.end annotation


# instance fields
.field private mActivity:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V
    .locals 1

    .line 704
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$NetWorkCallBack;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 705
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$NetWorkCallBack;->mActivity:Ljava/lang/ref/WeakReference;

    .line 706
    return-void
.end method

.method private isDestory()Z
    .locals 2

    .line 758
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$NetWorkCallBack;->mActivity:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    .line 759
    const/4 v0, 0x0

    return v0

    .line 761
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$NetWorkCallBack;->mActivity:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    .line 762
    if-nez v1, :cond_1

    .line 763
    const/4 v0, 0x0

    return v0

    .line 765
    :cond_1
    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 766
    const/4 v0, 0x1

    return v0

    .line 769
    :cond_2
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public onFailure(II)V
    .locals 4

    .line 727
    move v1, p1

    .line 728
    const/4 v0, 0x4

    if-ne v0, v1, :cond_0

    .line 729
    const/4 v1, 0x1

    .line 731
    :cond_0
    move v2, p2

    .line 732
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$NetWorkCallBack;->isDestory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 733
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v3

    .line 734
    const/4 v0, 0x5

    iput v0, v3, Landroid/os/Message;->what:I

    .line 735
    iput v1, v3, Landroid/os/Message;->arg1:I

    .line 736
    iput v2, v3, Landroid/os/Message;->arg2:I

    .line 737
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$NetWorkCallBack;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 739
    :cond_1
    return-void
.end method

.method public onStatus(II)V
    .locals 4

    .line 743
    move v1, p1

    .line 744
    const/4 v0, 0x4

    if-ne v0, v1, :cond_0

    .line 745
    const/4 v1, 0x1

    .line 747
    :cond_0
    move v2, p2

    .line 748
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$NetWorkCallBack;->isDestory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 749
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v3

    .line 750
    const/4 v0, 0x7

    iput v0, v3, Landroid/os/Message;->what:I

    .line 751
    iput v1, v3, Landroid/os/Message;->arg1:I

    .line 752
    iput v2, v3, Landroid/os/Message;->arg2:I

    .line 753
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$NetWorkCallBack;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 755
    :cond_1
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 4

    .line 710
    move v2, p1

    .line 711
    const/4 v0, 0x4

    if-ne v0, v2, :cond_0

    .line 712
    const/4 v2, 0x1

    .line 714
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$NetWorkCallBack;->isDestory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 715
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v3

    .line 716
    const/16 v0, 0xd

    iput v0, v3, Landroid/os/Message;->what:I

    .line 717
    iput v2, v3, Landroid/os/Message;->arg1:I

    .line 718
    iput-object p2, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 719
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$NetWorkCallBack;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 721
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$NetWorkCallBack;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->sendEmptyMessage(I)Z

    .line 723
    :cond_1
    return-void
.end method
