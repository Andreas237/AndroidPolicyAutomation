.class Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->updatingVersion(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)V
    .locals 0

    .line 203
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public operationResult(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Ljava/lang/String;Z)V
    .locals 5

    .line 206
    const-string v0, "WiFiOtaUpdateFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "send update version. cloudCommonReponse: "

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

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 208
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 209
    if-eqz p3, :cond_0

    .line 210
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    goto :goto_0

    .line 212
    :cond_0
    const/4 v0, 0x3

    iput v0, v4, Landroid/os/Message;->what:I

    .line 214
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$WifiHandler;->sendMessage(Landroid/os/Message;)Z

    .line 215
    return-void
.end method

.method public bridge synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 203
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiOtaUpdateFragment$1;->operationResult(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Ljava/lang/String;Z)V

    return-void
.end method
