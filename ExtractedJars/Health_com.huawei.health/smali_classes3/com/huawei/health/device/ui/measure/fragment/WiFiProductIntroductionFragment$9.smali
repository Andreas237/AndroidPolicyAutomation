.class Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->openPersonalInfomationDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V
    .locals 0

    .line 844
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$9;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 847
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$9;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$2800(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 848
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$9;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Lo/dnm;

    move-result-object v0

    const-string v1, "WiFiProductIntroductionFragment"

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Lo/dnm;->e(IZLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 850
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$9;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$2700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    .line 851
    return-void
.end method
