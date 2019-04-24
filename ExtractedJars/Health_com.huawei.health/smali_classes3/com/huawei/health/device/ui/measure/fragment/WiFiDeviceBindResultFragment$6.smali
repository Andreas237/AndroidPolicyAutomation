.class Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->showConfirmInfoAndDisplay()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V
    .locals 0

    .line 880
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 884
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1900(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 885
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$2000(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V

    goto :goto_0

    .line 887
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    const-class v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->popupFragment(Ljava/lang/Class;)V

    .line 890
    :goto_0
    return-void
.end method
