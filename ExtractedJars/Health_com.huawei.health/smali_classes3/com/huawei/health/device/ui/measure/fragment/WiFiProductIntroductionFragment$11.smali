.class Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->proccessUnbind(Ljava/lang/String;)V
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
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V
    .locals 0

    .line 902
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public operationResult(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Ljava/lang/String;Z)V
    .locals 6

    .line 904
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClickUnBind :"

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

    .line 905
    if-eqz p3, :cond_0

    .line 906
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$2900(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    goto :goto_1

    .line 908
    :cond_0
    const/16 v4, 0x7cf

    .line 909
    const-string v5, "unknown error"

    .line 910
    if-eqz p1, :cond_1

    .line 911
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 912
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;->getResultDesc()Ljava/lang/String;

    move-result-object v5

    .line 914
    :cond_1
    const v0, 0x6acfc00

    if-ne v0, v4, :cond_2

    .line 915
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$2900(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V

    goto :goto_0

    .line 917
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$3000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 918
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$3200(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$11$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$11$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$11;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 926
    :cond_3
    :goto_0
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " onClickUnBind error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",resultDesc:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 928
    :goto_1
    return-void
.end method

.method public bridge synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 902
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$11;->operationResult(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Ljava/lang/String;Z)V

    return-void
.end method
