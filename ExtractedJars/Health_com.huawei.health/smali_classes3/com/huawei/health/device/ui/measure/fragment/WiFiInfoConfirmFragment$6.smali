.class Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->getWifiListInfo()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)V
    .locals 0

    .line 788
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 791
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 792
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$2500(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/akf;->f(Landroid/content/Context;)Ljava/util/List;

    move-result-object v3

    .line 793
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 795
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$2600(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/akf;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 796
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$2700(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/akf;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/akf;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 797
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 798
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz v5, :cond_0

    .line 799
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 797
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 803
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiInfoConfirmFragment$MyHandler;->sendEmptyMessage(I)Z

    .line 804
    return-void
.end method
