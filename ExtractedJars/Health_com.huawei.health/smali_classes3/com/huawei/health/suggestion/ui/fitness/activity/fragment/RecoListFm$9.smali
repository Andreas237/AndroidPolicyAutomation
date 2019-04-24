.class Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$9;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d()V
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

    .line 290
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$9;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 292
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

    .line 293
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$9;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->g(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V

    .line 294
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 290
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$9;->d(Ljava/util/List;)V

    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 297
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "total"

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v3

    .line 298
    invoke-static {p1}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$9;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    if-lez v3, :cond_0

    .line 299
    invoke-static {}, Lo/bvp;->a()Lo/bvp;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bvp;->d(Ljava/util/List;)Lo/bvp;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bvp;->b(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    .line 300
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$9;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v0, v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;I)I

    .line 301
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$9;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)I

    move-result v0

    mul-int/lit8 v0, v0, 0xa

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$9;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->k(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)I

    move-result v1

    const/16 v2, 0xa

    invoke-static {p1, v0, v2, v1}, Lo/buk;->a(Ljava/util/List;III)Ljava/util/List;

    move-result-object p1

    .line 304
    :cond_0
    move-object v4, p1

    .line 305
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$9;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)Lcom/huawei/health/suggestion/ui/BaseStateActivity;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$9$1;

    invoke-direct {v1, p0, v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$9$1;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$9;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 311
    return-void
.end method
