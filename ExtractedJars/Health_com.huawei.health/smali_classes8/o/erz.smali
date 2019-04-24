.class public Lo/erz;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/eri;>;"
    }
.end annotation


# instance fields
.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/erz;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public b(Landroid/view/ViewGroup;I)Lo/eri;
    .locals 4

    .line 33
    new-instance v0, Lo/eri;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$layout;->run_more_item_fitness_topic:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eri;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public b(Lo/eri;I)V
    .locals 2

    .line 39
    iget-object v0, p0, Lo/erz;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo/eri;->a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lcom/huawei/health/suggestion/model/Topic;)V

    .line 40
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 22
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 23
    return-void

    .line 25
    :cond_0
    iget-object v0, p0, Lo/erz;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 26
    iget-object v0, p0, Lo/erz;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 27
    invoke-virtual {p0}, Lo/erz;->notifyDataSetChanged()V

    .line 29
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 44
    iget-object v0, p0, Lo/erz;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 18
    move-object v0, p1

    check-cast v0, Lo/eri;

    invoke-virtual {p0, v0, p2}, Lo/erz;->b(Lo/eri;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 18
    invoke-virtual {p0, p1, p2}, Lo/erz;->b(Landroid/view/ViewGroup;I)Lo/eri;

    move-result-object v0

    return-object v0
.end method
