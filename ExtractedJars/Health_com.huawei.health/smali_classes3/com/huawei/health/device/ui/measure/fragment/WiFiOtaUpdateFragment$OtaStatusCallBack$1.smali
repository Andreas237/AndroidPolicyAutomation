.class Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;->onStatus(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;)V
    .locals 0

    .line 409
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 411
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$OtaStatusCallBack;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Landroid/app/Activity;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_not_network:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 412
    return-void
.end method
