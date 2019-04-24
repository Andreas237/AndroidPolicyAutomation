.class public Lo/eqi;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eqn;>;"
        }
    .end annotation
.end field

.field private b:Lo/eqp;

.field private c:Landroid/content/Context;

.field private e:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;Lo/eqp;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eqn;>;Landroid/content/Context;Lo/eqp;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 26
    iput-object p1, p0, Lo/eqi;->a:Ljava/util/List;

    .line 27
    iput-object p2, p0, Lo/eqi;->c:Landroid/content/Context;

    .line 28
    iput-object p3, p0, Lo/eqi;->b:Lo/eqp;

    .line 29
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/eqi;->e:Landroid/view/LayoutInflater;

    .line 30
    return-void
.end method


# virtual methods
.method public c(II)Z
    .locals 5

    .line 69
    const-string v0, "FunctionSetCardManagementViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fromPositiont="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    const-string v0, "FunctionSetCardManagementViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "toPosition="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/eqi;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    if-ltz p2, :cond_0

    iget-object v0, p0, Lo/eqi;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p2, v0, :cond_1

    .line 73
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 76
    :cond_1
    iget-object v0, p0, Lo/eqi;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eqn;

    invoke-virtual {v0}, Lo/eqn;->b()I

    move-result v4

    .line 77
    iget-object v0, p0, Lo/eqi;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eqn;

    iget-object v1, p0, Lo/eqi;->a:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eqn;

    invoke-virtual {v1}, Lo/eqn;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eqn;->d(I)V

    .line 78
    iget-object v0, p0, Lo/eqi;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eqn;

    invoke-virtual {v0, v4}, Lo/eqn;->d(I)V

    .line 80
    if-ltz p2, :cond_2

    const/4 v0, 0x6

    if-ge p2, v0, :cond_2

    .line 81
    iget-object v0, p0, Lo/eqi;->a:Ljava/util/List;

    invoke-static {v0, p1, p2}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 82
    invoke-virtual {p0, p1, p2}, Lo/eqi;->notifyItemMoved(II)V

    .line 84
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public d(I)V
    .locals 4

    .line 88
    const-string v0, "FunctionSetCardManagementViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onItemSwiped position="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    iget-object v0, p0, Lo/eqi;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 92
    invoke-virtual {p0, p1}, Lo/eqi;->notifyItemRemoved(I)V

    .line 93
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 44
    iget-object v0, p0, Lo/eqi;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 4

    .line 49
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->setIsRecyclable(Z)V

    .line 50
    move-object v2, p1

    check-cast v2, Lo/eqo;

    .line 51
    iget-object v0, p0, Lo/eqi;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eqn;

    invoke-virtual {v2, v0}, Lo/eqo;->b(Lo/eqn;)V

    .line 53
    iget-object v0, p0, Lo/eqi;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v0, p2, :cond_0

    .line 54
    iget-object v0, v2, Lo/eqo;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->itemDivider:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 55
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 57
    :cond_0
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 5

    .line 34
    iget-object v0, p0, Lo/eqi;->e:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->function_set_management_view_card:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 35
    new-instance v4, Lo/eqo;

    iget-object v0, p0, Lo/eqi;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/eqi;->b:Lo/eqp;

    const/4 v2, 0x0

    invoke-direct {v4, v3, v0, v2, v1}, Lo/eqo;-><init>(Landroid/view/View;Landroid/content/Context;ZLo/eqp;)V

    .line 36
    return-object v4
.end method
