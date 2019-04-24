.class Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$2;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->e()V
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
.field final synthetic e:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$2;->e:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 152
    const-string v0, "WeightReduceFatFragment"

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

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$2;->e:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->e:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$2;->e:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->a:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 155
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;)V"
        }
    .end annotation

    .line 159
    const-string v0, "WeightReduceFatFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess invoke"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    const/4 v0, 0x0

    if-eq v0, p1, :cond_5

    .line 161
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 162
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_4

    .line 163
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    .line 164
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 165
    const-string v0, "PL1002"

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "PL0004"

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 166
    :cond_0
    const-string v0, "WeightReduceFatFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "add 14 plan success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$2;->e:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$2;->e:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$2;->e:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;Z)Z

    goto :goto_1

    .line 172
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$2;->e:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->d(Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$2;->e:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->b(Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;Z)Z

    goto :goto_1

    .line 176
    :cond_2
    const-string v0, "WeightReduceFatFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "currentPlanNumber is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    :cond_3
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 181
    :cond_4
    const-string v0, "WeightReduceFatFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataFilterInfo size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$2;->e:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    invoke-static {v0, v4}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;->d(Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;Ljava/util/List;)V

    .line 184
    :cond_5
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 149
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment$2;->c(Ljava/util/List;)V

    return-void
.end method
