.class public Lo/dyi;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Landroid/support/v7/widget/RecyclerView$ViewHolder;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/dyw;>;"
        }
    .end annotation
.end field

.field private d:Lo/dyk;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Lo/dyw;>;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dyi;->a:Ljava/util/ArrayList;

    .line 28
    iput-object p1, p0, Lo/dyi;->e:Landroid/content/Context;

    .line 29
    iput-object p2, p0, Lo/dyi;->a:Ljava/util/ArrayList;

    .line 30
    return-void
.end method


# virtual methods
.method public c(Lo/dyk;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lo/dyi;->d:Lo/dyk;

    .line 40
    return-void
.end method

.method public e(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/dyw;>;)V"
        }
    .end annotation

    .line 33
    iput-object p1, p0, Lo/dyi;->a:Ljava/util/ArrayList;

    .line 35
    invoke-virtual {p0}, Lo/dyi;->notifyDataSetChanged()V

    .line 36
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 86
    iget-object v0, p0, Lo/dyi;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 2

    .line 91
    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 92
    :cond_0
    const/4 v0, 0x2

    return v0

    .line 94
    :cond_1
    iget-object v0, p0, Lo/dyi;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/dyw;

    .line 95
    invoke-virtual {v1}, Lo/dyw;->c()I

    move-result v0

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 2

    .line 70
    if-ltz p2, :cond_1

    iget-object v0, p0, Lo/dyi;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p2, v0, :cond_1

    .line 71
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->setIsRecyclable(Z)V

    .line 72
    iget-object v0, p0, Lo/dyi;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/dyw;

    .line 73
    if-eqz v1, :cond_1

    .line 74
    instance-of v0, p1, Lo/dyo;

    if-eqz v0, :cond_0

    .line 75
    move-object v0, p1

    check-cast v0, Lo/dyo;

    invoke-virtual {v0, v1}, Lo/dyo;->e(Lo/dyw;)V

    goto :goto_0

    .line 76
    :cond_0
    instance-of v0, p1, Lo/dyg;

    if-eqz v0, :cond_1

    .line 77
    move-object v0, p1

    check-cast v0, Lo/dyg;

    invoke-virtual {v0, v1, p2}, Lo/dyg;->b(Lo/dyw;I)V

    .line 82
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 5

    .line 44
    const/4 v3, 0x0

    .line 45
    if-nez p2, :cond_0

    .line 46
    iget-object v0, p0, Lo/dyi;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$layout;->achieve_task_ka_ka_title:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 47
    new-instance v3, Lo/dyo;

    invoke-direct {v3, v4}, Lo/dyo;-><init>(Landroid/view/View;)V

    .line 48
    goto/16 :goto_2

    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 50
    iget-object v0, p0, Lo/dyi;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dzo;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 51
    iget-object v0, p0, Lo/dyi;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$layout;->achieve_task_ka_ka_content_arabic:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    goto :goto_0

    .line 53
    :cond_1
    iget-object v0, p0, Lo/dyi;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$layout;->achieve_task_ka_ka_content:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 55
    :goto_0
    new-instance v3, Lo/dyg;

    iget-object v0, p0, Lo/dyi;->d:Lo/dyk;

    invoke-direct {v3, v4, v0}, Lo/dyg;-><init>(Landroid/view/View;Lo/dyk;)V

    .line 56
    goto :goto_2

    :cond_2
    const/4 v0, 0x2

    if-ne p2, v0, :cond_4

    .line 58
    iget-object v0, p0, Lo/dyi;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dzo;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 59
    iget-object v0, p0, Lo/dyi;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$layout;->achieve_task_ka_ka_content_arabic:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    goto :goto_1

    .line 61
    :cond_3
    iget-object v0, p0, Lo/dyi;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$layout;->achieve_task_ka_ka_content_small:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 63
    :goto_1
    new-instance v3, Lo/dyg;

    iget-object v0, p0, Lo/dyi;->d:Lo/dyk;

    invoke-direct {v3, v4, v0}, Lo/dyg;-><init>(Landroid/view/View;Lo/dyk;)V

    .line 65
    :cond_4
    :goto_2
    return-object v3
.end method
