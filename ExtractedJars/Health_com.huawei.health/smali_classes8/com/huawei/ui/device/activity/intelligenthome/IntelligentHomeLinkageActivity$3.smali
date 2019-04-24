.class Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V
    .locals 0

    .line 762
    iput-object p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$3;->c:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 766
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDownloadNewAppDialog ok click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 767
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$3;->c:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->B(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 768
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$3;->c:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->a(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Lo/egy;)Lo/egy;

    .line 769
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$3;->c:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->l(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.smarthome"

    invoke-static {v0, v1}, Lo/dbf;->i(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 770
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$3;->c:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->j(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    goto/16 :goto_0

    .line 773
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$3;->c:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$3;->c:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->l(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.huawei.smarthome"

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    .line 774
    const v0, 0x7140cc40

    if-lt v4, v0, :cond_1

    .line 775
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$3;->c:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;I)V

    .line 777
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 778
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$3;->c:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->l(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "intell_wake_up"

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "once_intell_wake_up"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$3;->c:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    .line 779
    invoke-static {v3}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "go_wake_up"

    .line 778
    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 781
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 782
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 783
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->jg:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 784
    goto :goto_0

    .line 785
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$3;->c:Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->A(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    .line 788
    :goto_0
    return-void
.end method
