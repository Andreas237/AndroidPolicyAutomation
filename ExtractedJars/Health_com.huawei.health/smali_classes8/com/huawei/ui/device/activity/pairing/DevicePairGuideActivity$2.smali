.class Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 0

    .line 681
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$2;->d:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 684
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->c()Ljava/util/List;

    move-result-object v4

    .line 685
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enw;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 686
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$2;->d:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lo/enw;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/enw;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 687
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$2;->d:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lo/enw;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/enw;->d(Ljava/util/List;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 688
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 689
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$2;->d:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lo/enw;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$2;->d:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->u(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$c;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$2;->d:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-direct {v2, v3}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$c;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Lo/enw;->d(Landroid/content/Context;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 691
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$2;->d:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Z)V

    .line 693
    :goto_0
    goto :goto_1

    .line 694
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$2;->d:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Z)V

    goto :goto_1

    .line 697
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$2;->d:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Z)V

    .line 700
    :goto_1
    return-void
.end method
