.class Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V
    .locals 0

    .line 342
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 344
    const-string v0, "RecoListFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==Failed--errorcode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->g(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V

    .line 346
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 342
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7;->d(Ljava/util/List;)V

    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 350
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 363
    return-void
.end method
