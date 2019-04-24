.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$8;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->E()V
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
.field final synthetic a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

.field final synthetic d:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Ljava/util/List;)V
    .locals 0

    .line 1763
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$8;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$8;->d:Ljava/util/List;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 5

    .line 1771
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getworkoutlist onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1772
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 1773
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$8;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Q(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1774
    move-object v4, p1

    .line 1775
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$8;->d:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1776
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$8;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->v(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$f;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$8;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$f;->d(Ljava/util/List;)V

    .line 1778
    :cond_0
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 4

    .line 1766
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getworkoutlist onFailure "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1767
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 1763
    move-object v0, p1

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$8;->a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    return-void
.end method
