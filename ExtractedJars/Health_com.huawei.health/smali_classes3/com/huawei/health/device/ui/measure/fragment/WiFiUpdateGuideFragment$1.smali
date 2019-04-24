.class Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 81
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Lo/egd;

    move-result-object v0

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 82
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 83
    new-instance v2, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusReq;

    invoke-direct {v2}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusReq;-><init>()V

    .line 84
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusReq;->setDevId(Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1;)V

    invoke-virtual {v0, v2, v1}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusReq;Lo/cyx;)V

    .line 98
    return-void
.end method
