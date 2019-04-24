.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "g"
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 0

    .line 634
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;)V
    .locals 0

    .line 634
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 6

    .line 639
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 640
    const-string v0, "com.huaei.health"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 641
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 642
    const-string v0, "kind"

    const-string v1, "HDK_BLOOD_PRESSURE"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 644
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    const-string v1, "HDK_BLOOD_PRESSURE"

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 645
    sget-object v0, Lo/dae;->cV:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 646
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 647
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 648
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 649
    const-string v0, "view"

    const-string v1, "MeasureDevice"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 650
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-virtual {v0, v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->startActivity(Landroid/content/Intent;)V

    .line 651
    goto :goto_0

    .line 654
    :cond_0
    new-instance v5, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 655
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_plugin_device_selection_click_bind_my_device_select:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    .line 656
    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_ok_button:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g$1;

    invoke-direct {v2, p0, v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g$1;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;Landroid/content/Intent;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    .line 668
    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_cancle_button:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g$5;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$g;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 673
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 674
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 676
    :goto_0
    return-void
.end method
