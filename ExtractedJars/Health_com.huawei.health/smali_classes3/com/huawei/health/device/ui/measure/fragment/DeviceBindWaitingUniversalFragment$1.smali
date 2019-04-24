.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    .line 198
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    .line 199
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 200
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 201
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 202
    return-void
.end method
