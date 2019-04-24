.class Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$1;
.super Lo/aje;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aje<Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-direct {p0, p2}, Lo/aje;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public onResult(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;ILjava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 232
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 233
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$MyHandler;->sendEmptyMessage(I)Z

    .line 235
    :cond_0
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 229
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-virtual {p0, v0, p2, p3, p4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$1;->onResult(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;ILjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
