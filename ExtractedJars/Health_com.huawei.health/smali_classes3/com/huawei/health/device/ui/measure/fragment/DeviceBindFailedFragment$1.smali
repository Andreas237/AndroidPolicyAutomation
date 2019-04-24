.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindFailedFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindFailedFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindFailedFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindFailedFragment;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindFailedFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindFailedFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 77
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindFailedFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindFailedFragment;

    const-class v1, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindFailedFragment;->popupFragment(Ljava/lang/Class;)V

    .line 78
    return-void
.end method
