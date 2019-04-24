.class Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$3;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$3;->d:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;)V"
        }
    .end annotation

    .line 162
    const-string v0, "Suggestion_PlanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess invoke"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$3;->d:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;

    invoke-static {v0, p1}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->e(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;Ljava/util/List;)V

    .line 164
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 4

    .line 153
    const-string v0, "Suggestion_PlanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFailure errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " errorInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$3;->d:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->c(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 155
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$3;->d:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->a(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$3;->d:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->e(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 158
    :cond_0
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 150
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$3;->a(Ljava/util/List;)V

    return-void
.end method
