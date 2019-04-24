.class public Lo/ewc;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/ewa;>;"
    }
.end annotation


# instance fields
.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;>;"
        }
    .end annotation
.end field

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;>;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewc;->c:Ljava/util/List;

    .line 28
    iput-object p1, p0, Lo/ewc;->d:Landroid/content/Context;

    .line 29
    if-eqz p2, :cond_0

    .line 30
    iget-object v0, p0, Lo/ewc;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 32
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lo/ewa;I)V
    .locals 3

    .line 50
    if-nez p2, :cond_0

    .line 51
    iget-object v0, p0, Lo/ewc;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, p2, v1, v2}, Lo/ewa;->d(Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;IZZ)V

    goto :goto_0

    .line 52
    :cond_0
    iget-object v0, p0, Lo/ewc;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_1

    .line 53
    iget-object v0, p0, Lo/ewc;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v0, p2, v1, v2}, Lo/ewa;->d(Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;IZZ)V

    goto :goto_0

    .line 55
    :cond_1
    iget-object v0, p0, Lo/ewc;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, p2, v1, v2}, Lo/ewa;->d(Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;IZZ)V

    .line 57
    :goto_0
    return-void
.end method

.method public c(Landroid/view/ViewGroup;I)Lo/ewa;
    .locals 5

    .line 45
    new-instance v0, Lo/ewa;

    iget-object v1, p0, Lo/ewc;->d:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$layout;->layout_sleep_no_data_service_item:I

    const/4 v4, 0x0

    invoke-virtual {v2, v3, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo/ewa;-><init>(Landroid/content/Context;Landroid/view/View;)V

    return-object v0
.end method

.method public c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;>;)V"
        }
    .end annotation

    .line 35
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 36
    return-void

    .line 38
    :cond_0
    iget-object v0, p0, Lo/ewc;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 39
    iget-object v0, p0, Lo/ewc;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 40
    invoke-virtual {p0}, Lo/ewc;->notifyDataSetChanged()V

    .line 41
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 61
    iget-object v0, p0, Lo/ewc;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 66
    int-to-long v0, p1

    return-wide v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 21
    move-object v0, p1

    check-cast v0, Lo/ewa;

    invoke-virtual {p0, v0, p2}, Lo/ewc;->a(Lo/ewa;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 21
    invoke-virtual {p0, p1, p2}, Lo/ewc;->c(Landroid/view/ViewGroup;I)Lo/ewa;

    move-result-object v0

    return-object v0
.end method
