.class public Lo/but;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/but$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Landroid/support/v7/widget/RecyclerView$ViewHolder;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation
.end field

.field private b:Z

.field private c:Z

.field private d:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

.field private e:Lo/but$d;

.field private f:Ljava/lang/String;

.field private k:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/but;->a:Ljava/util/List;

    .line 28
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/but;->b:Z

    .line 37
    iput-object p1, p0, Lo/but;->k:Landroid/support/v7/widget/RecyclerView;

    .line 38
    new-instance v0, Lo/but$5;

    invoke-direct {v0, p0}, Lo/but$5;-><init>(Lo/but;)V

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 50
    return-void
.end method

.method static synthetic a(Lo/but;)Z
    .locals 1

    .line 23
    iget-boolean v0, p0, Lo/but;->b:Z

    return v0
.end method

.method static synthetic b(Lo/but;)Lo/but$d;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/but;->e:Lo/but$d;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;Z)V
    .locals 3

    .line 140
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 141
    iput-object p1, p0, Lo/but;->d:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    .line 143
    :cond_0
    iput-boolean p2, p0, Lo/but;->c:Z

    .line 144
    invoke-virtual {p0}, Lo/but;->getItemCount()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v1}, Lo/but;->notifyItemRangeChanged(IILjava/lang/Object;)V

    .line 146
    return-void
.end method

.method public a(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;ZLjava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;ZLjava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 113
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 114
    const-string v0, "FitnessTopicRecyAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitWorkouts null or size =0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    return-void

    .line 118
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_1

    .line 119
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/but;->b:Z

    .line 121
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 122
    iput-object p1, p0, Lo/but;->d:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    .line 125
    :cond_2
    iget-object v0, p0, Lo/but;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    .line 126
    iput-boolean p2, p0, Lo/but;->c:Z

    .line 127
    iget-object v0, p0, Lo/but;->a:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 128
    invoke-virtual {p0}, Lo/but;->getItemCount()I

    move-result v5

    .line 129
    sub-int v6, v5, v4

    .line 130
    const/4 v0, 0x1

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 132
    if-nez v4, :cond_3

    .line 133
    invoke-virtual {p0}, Lo/but;->notifyDataSetChanged()V

    goto :goto_0

    .line 135
    :cond_3
    invoke-virtual {p0, v4, v6}, Lo/but;->notifyItemRangeChanged(II)V

    .line 137
    :goto_0
    return-void
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation

    .line 153
    iget-object v0, p0, Lo/but;->a:Ljava/util/List;

    return-object v0
.end method

.method public d(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;ZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;ZLjava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 107
    iget-object v0, p0, Lo/but;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 108
    invoke-virtual {p0, p1, p2, p3}, Lo/but;->a(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;ZLjava/util/List;)V

    .line 110
    return-void
.end method

.method public d(Lo/but$d;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lo/but;->e:Lo/but$d;

    .line 104
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 93
    iput-boolean p1, p0, Lo/but;->b:Z

    .line 94
    invoke-virtual {p0}, Lo/but;->notifyDataSetChanged()V

    .line 95
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lo/but;->f:Ljava/lang/String;

    .line 158
    return-void
.end method

.method public getItemCount()I
    .locals 2

    .line 78
    iget-boolean v0, p0, Lo/but;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/but;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    .line 79
    iget-object v0, p0, Lo/but;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0

    .line 81
    :cond_0
    iget-object v0, p0, Lo/but;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 2

    .line 86
    iget-boolean v0, p0, Lo/but;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/but;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lo/but;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    .line 87
    const/4 v0, 0x1

    return v0

    .line 89
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 5

    .line 62
    invoke-virtual {p0, p2}, Lo/but;->getItemViewType(I)I

    move-result v0

    if-nez v0, :cond_3

    .line 63
    iget-object v0, p0, Lo/but;->d:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 64
    iget-object v0, p0, Lo/but;->d:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-virtual {v0, p2}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->savePosition(I)V

    .line 66
    :cond_0
    if-nez p2, :cond_1

    .line 67
    move-object v0, p1

    check-cast v0, Lo/buo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/buo;->b(I)V

    goto :goto_0

    .line 69
    :cond_1
    move-object v0, p1

    check-cast v0, Lo/buo;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/buo;->b(I)V

    .line 72
    :goto_0
    move-object v0, p1

    check-cast v0, Lo/buo;

    iget-object v1, p0, Lo/but;->d:Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    iget-object v2, p0, Lo/but;->f:Ljava/lang/String;

    iget-boolean v3, p0, Lo/but;->c:Z

    iget-object v4, p0, Lo/but;->a:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_2

    const/4 v4, 0x0

    goto :goto_1

    :cond_2
    iget-object v4, p0, Lo/but;->a:Ljava/util/List;

    invoke-interface {v4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    :goto_1
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/buo;->c(Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;Ljava/lang/String;ZLcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 74
    :cond_3
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 54
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 55
    new-instance v0, Lo/bun;

    iget-object v1, p0, Lo/but;->k:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$layout;->sug_his_loading_more:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bun;-><init>(Landroid/view/View;)V

    return-object v0

    .line 57
    :cond_0
    new-instance v0, Lo/buo;

    iget-object v1, p0, Lo/but;->k:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_list_item:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/buo;-><init>(Landroid/view/View;)V

    return-object v0
.end method
