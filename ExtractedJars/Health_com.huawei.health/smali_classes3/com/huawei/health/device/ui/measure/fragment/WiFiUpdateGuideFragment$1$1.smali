.class Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;>;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public operationResult(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;Ljava/lang/String;Z)V
    .locals 5

    .line 88
    const-string v0, "WiFiUpdateGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get device status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", text: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", is success: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 90
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;->getStatus()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;->getStatus()Ljava/lang/String;

    move-result-object v0

    const-string v1, "online"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->what:I

    goto :goto_0

    .line 93
    :cond_0
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 95
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 96
    return-void
.end method

.method public bridge synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 85
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUpdateGuideFragment$1$1;->operationResult(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;Ljava/lang/String;Z)V

    return-void
.end method
