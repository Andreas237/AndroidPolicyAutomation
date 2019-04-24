.class Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->openHealthDataDialog()V
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

    .line 811
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$7;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 814
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$7;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$2300(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 815
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$7;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Lo/dnm;

    move-result-object v0

    const-string v1, "WiFiProductIntroductionFragment"

    const/4 v2, 0x7

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Lo/dnm;->e(IZLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 817
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$7;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$2500(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 818
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$7;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$2600(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    goto :goto_0

    .line 820
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$7;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$2700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    .line 822
    :goto_0
    return-void
.end method
