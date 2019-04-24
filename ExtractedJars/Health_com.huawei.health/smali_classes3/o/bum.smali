.class public Lo/bum;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bum$e;
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

.field private c:I

.field private d:F

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 59
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/bum;->c:I

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bum;->a:Ljava/util/List;

    .line 60
    iput-object p1, p0, Lo/bum;->e:Landroid/content/Context;

    .line 61
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->g()Lcom/huawei/health/suggestion/model/Userinfo;

    move-result-object v1

    .line 62
    invoke-static {v1}, Lo/bvs;->b(Lcom/huawei/health/suggestion/model/Userinfo;)F

    move-result v0

    iput v0, p0, Lo/bum;->d:F

    .line 63
    return-void
.end method

.method private a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Z
    .locals 4

    .line 136
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/bum;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 137
    iget-object v0, p0, Lo/bum;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 138
    invoke-virtual {v3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    const/4 v0, 0x1

    return v0

    .line 136
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 142
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private d(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation

    .line 125
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 126
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 127
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 128
    invoke-direct {p0, v3}, Lo/bum;->a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 129
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 132
    :cond_1
    return-object v1
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 151
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bum;->a(Ljava/util/List;)V

    .line 152
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lo/bum;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 111
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    invoke-direct {p0, p1}, Lo/bum;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 113
    iget-object v0, p0, Lo/bum;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 115
    :cond_0
    invoke-virtual {p0}, Lo/bum;->getItemCount()I

    move-result v2

    .line 116
    const/4 v0, 0x0

    iput v0, p0, Lo/bum;->c:I

    .line 117
    sub-int v3, v2, v1

    .line 118
    if-lez v3, :cond_1

    .line 119
    invoke-virtual {p0, v1, v3}, Lo/bum;->notifyItemRangeChanged(II)V

    .line 121
    :cond_1
    return-void
.end method

.method public b()V
    .locals 2

    .line 100
    invoke-virtual {p0}, Lo/bum;->getItemCount()I

    move-result v1

    .line 101
    if-nez v1, :cond_0

    .line 102
    return-void

    .line 104
    :cond_0
    iget-object v0, p0, Lo/bum;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 105
    const/4 v0, 0x0

    iput v0, p0, Lo/bum;->c:I

    .line 106
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lo/bum;->notifyItemRangeRemoved(II)V

    .line 107
    return-void
.end method

.method public d()I
    .locals 1

    .line 91
    iget-object v0, p0, Lo/bum;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public e()V
    .locals 2

    .line 146
    const/4 v0, 0x1

    iput v0, p0, Lo/bum;->c:I

    .line 147
    iget-object v0, p0, Lo/bum;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lo/bum;->notifyItemRangeChanged(II)V

    .line 148
    return-void
.end method

.method public getItemCount()I
    .locals 2

    .line 87
    iget-object v0, p0, Lo/bum;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lo/bum;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 96
    iget-object v0, p0, Lo/bum;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 3

    .line 80
    invoke-virtual {p0, p2}, Lo/bum;->getItemViewType(I)I

    move-result v0

    if-nez v0, :cond_0

    if-ltz p2, :cond_0

    iget-object v0, p0, Lo/bum;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 81
    move-object v0, p1

    check-cast v0, Lo/bum$e;

    iget-object v1, p0, Lo/bum;->a:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    iget v2, p0, Lo/bum;->d:F

    invoke-virtual {v0, v1, v2}, Lo/bum$e;->c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;F)V

    .line 83
    :cond_0
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 68
    iget-object v0, p0, Lo/bum;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 69
    if-nez p2, :cond_0

    .line 70
    new-instance v0, Lo/bum$e;

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_list_item:I

    .line 71
    const/4 v2, 0x0

    invoke-virtual {v3, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bum$e;-><init>(Landroid/view/View;)V

    .line 70
    return-object v0

    .line 73
    :cond_0
    new-instance v0, Lo/bun;

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_his_loading_more:I

    .line 74
    const/4 v2, 0x0

    invoke-virtual {v3, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bun;-><init>(Landroid/view/View;)V

    .line 73
    return-object v0
.end method
