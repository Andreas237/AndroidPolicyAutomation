.class Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/support/api/client/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->asyncCallPay(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/huawei/hms/support/api/client/ResultCallback<Lcom/huawei/hms/support/api/pay/PayResult;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)V
    .locals 0

    .line 594
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Lcom/huawei/hms/support/api/pay/PayResult;)V
    .locals 6

    .line 597
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/pay/PayResult;->getStatus()Lcom/huawei/hms/support/api/client/Status;

    move-result-object v4

    .line 598
    const-string v0, "PluginPay BuscardRechargeAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "applyIssueOrderCallback, apply status : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 599
    invoke-virtual {v4}, Lcom/huawei/hms/support/api/client/Status;->getStatusCode()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 601
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    const/16 v1, 0x65

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hms/support/api/client/Status;->startResolutionForResult(Landroid/app/Activity;I)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 604
    goto :goto_0

    .line 602
    :catch_0
    move-exception v5

    .line 603
    const-string v0, "hwpay"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SendIntentException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 609
    :cond_0
    :goto_0
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 1

    .line 594
    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/pay/PayResult;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$3;->onResult(Lcom/huawei/hms/support/api/pay/PayResult;)V

    return-void
.end method
