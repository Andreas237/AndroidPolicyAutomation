.class public Lo/bxg;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bxm;>;"
    }
.end annotation


# instance fields
.field private final a:Landroid/view/LayoutInflater;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/util/Pair<Ljava/lang/Integer;Ljava/lang/Object;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/PlanStat;Lcom/huawei/health/suggestion/model/PlanRecord;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/PlanStat;Lcom/huawei/health/suggestion/model/PlanRecord;Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)V"
        }
    .end annotation

    .line 37
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bxg;->b:Ljava/util/List;

    .line 38
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bxg;->a:Landroid/view/LayoutInflater;

    .line 40
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, p4}, Lo/bxq;->a(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/PlanRecord;)Lo/bxq$e;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Lo/bxg;->a(I[Ljava/lang/Object;)V

    .line 41
    invoke-static {p1, p2, p5}, Lo/bxs;->c(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p0, v1, v0}, Lo/bxg;->a(I[Ljava/lang/Object;)V

    .line 42
    invoke-static {p1, p2, p3}, Lo/bxr;->e(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/PlanStat;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {p0, v1, v0}, Lo/bxg;->a(I[Ljava/lang/Object;)V

    .line 44
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 45
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, p3, p4}, Lo/bxp;->e(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/PlanStat;Lcom/huawei/health/suggestion/model/PlanRecord;)Lo/bxp$e;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x4

    invoke-direct {p0, v1, v0}, Lo/bxg;->a(I[Ljava/lang/Object;)V

    .line 47
    :cond_0
    return-void
.end method

.method private varargs a(I[Ljava/lang/Object;)V
    .locals 7

    .line 80
    move-object v3, p2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-object v6, v3, v5

    .line 81
    iget-object v0, p0, Lo/bxg;->b:Ljava/util/List;

    new-instance v1, Landroid/util/Pair;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 83
    :cond_0
    return-void
.end method


# virtual methods
.method public c(Landroid/view/ViewGroup;I)Lo/bxm;
    .locals 4

    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 53
    new-instance v3, Lo/bxq;

    iget-object v0, p0, Lo/bxg;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_report_rv_item_header:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/bxq;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 54
    :cond_0
    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 55
    new-instance v3, Lo/bxs;

    iget-object v0, p0, Lo/bxg;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_item_report_chart:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/bxs;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 56
    :cond_1
    const/4 v0, 0x3

    if-ne p2, v0, :cond_2

    .line 57
    new-instance v3, Lo/bxr;

    iget-object v0, p0, Lo/bxg;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_item_report_best:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/bxr;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 59
    :cond_2
    new-instance v3, Lo/bxp;

    iget-object v0, p0, Lo/bxg;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_item_report_footer:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/bxp;-><init>(Landroid/view/View;)V

    .line 61
    :goto_0
    return-object v3
.end method

.method public e(Lo/bxm;I)V
    .locals 1

    .line 66
    iget-object v0, p0, Lo/bxg;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lo/bxm;->c(Ljava/lang/Object;)V

    .line 67
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 71
    iget-object v0, p0, Lo/bxg;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 76
    iget-object v0, p0, Lo/bxg;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 27
    move-object v0, p1

    check-cast v0, Lo/bxm;

    invoke-virtual {p0, v0, p2}, Lo/bxg;->e(Lo/bxm;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 27
    invoke-virtual {p0, p1, p2}, Lo/bxg;->c(Landroid/view/ViewGroup;I)Lo/bxm;

    move-result-object v0

    return-object v0
.end method
