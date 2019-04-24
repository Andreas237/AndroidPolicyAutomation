.class Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)V
    .locals 0

    .line 597
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$4;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 600
    const-string v0, "RecoListFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "it is positive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$4;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->l(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 602
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$4;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/Integer;

    .line 603
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$4;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->l(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$4;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)Lo/bvn;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lo/bvn;->b(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 604
    goto :goto_0

    .line 605
    :cond_0
    const-string v0, "RecoListFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delete fitworkout size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$4;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->o(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 606
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$4;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->l(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$4$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$4$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$4;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->a(Ljava/util/List;Lo/bui;)V

    .line 619
    return-void
.end method
