.class Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$7;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->d(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)V
    .locals 0

    .line 546
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$7;->c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 5

    .line 549
    const-string v0, "Track_RunMoreInfoActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure updateRecommendView "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 551
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$7;->c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->b(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 552
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$7;->c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->b(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1f

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 553
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$7;->c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->b(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 555
    :cond_0
    return-void
.end method

.method public d(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 6

    .line 559
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$7;->c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->b(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 560
    const-string v0, "Track_RunMoreInfoActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "            "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 562
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$7;->c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->b(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 564
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 565
    invoke-interface {v5, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 566
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 568
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$7;->c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->b(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 571
    :cond_0
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 546
    move-object v0, p1

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$7;->d(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    return-void
.end method
